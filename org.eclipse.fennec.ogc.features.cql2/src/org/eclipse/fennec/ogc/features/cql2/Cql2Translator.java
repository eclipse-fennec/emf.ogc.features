/**
 * Copyright (c) 2026 Contributors to the Eclipse Foundation.
 *
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 *
 * SPDX-License-Identifier: EPL-2.0
 *
 * Contributors:
 *     Data In Motion - initial API and implementation
 */
package org.eclipse.fennec.ogc.features.cql2;

import static org.eclipse.fennec.model.query.builder.Expressions.and;
import static org.eclipse.fennec.model.query.builder.Expressions.not;
import static org.eclipse.fennec.model.query.builder.Expressions.or;
import static org.eclipse.fennec.model.query.builder.Expressions.path;

import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneOffset;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Objects;
import java.util.function.Predicate;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EEnumLiteral;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.fennec.model.expression.Expression;
import org.eclipse.fennec.model.query.builder.Expressions.PathStep;
import org.eclipse.fennec.model.query.builder.QueryBuilder;
import org.eclipse.fennec.ogc.features.api.CollectionDescriptor;
import org.eclipse.fennec.ogc.features.api.FeatureFilter;
import org.eclipse.fennec.ogc.features.cql2.Cql2.And;
import org.eclipse.fennec.ogc.features.cql2.Cql2.Between;
import org.eclipse.fennec.ogc.features.cql2.Cql2.BooleanValue;
import org.eclipse.fennec.ogc.features.cql2.Cql2.Comparison;
import org.eclipse.fennec.ogc.features.cql2.Cql2.GeometryLiteral;
import org.eclipse.fennec.ogc.features.cql2.Cql2.In;
import org.eclipse.fennec.ogc.features.cql2.Cql2.IsNull;
import org.eclipse.fennec.ogc.features.cql2.Cql2.Like;
import org.eclipse.fennec.ogc.features.cql2.Cql2.Literal;
import org.eclipse.fennec.ogc.features.cql2.Cql2.Not;
import org.eclipse.fennec.ogc.features.cql2.Cql2.Operand;
import org.eclipse.fennec.ogc.features.cql2.Cql2.Operator;
import org.eclipse.fennec.ogc.features.cql2.Cql2.Or;
import org.eclipse.fennec.ogc.features.cql2.Cql2.Property;
import org.eclipse.fennec.ogc.features.cql2.Cql2.Spatial;
import org.eclipse.fennec.ogc.features.geo.FeaturePredicates;
import org.eclipse.fennec.ogc.features.geo.JtsGeometries;
import org.eclipse.fennec.ogc.features.geo.SpatialRelation;
import org.eclipse.fennec.persistence.query.QueryException;
import org.eclipse.fennec.persistence.query.memory.MemoryQueries;
import org.eclipse.fennec.persistence.query.memory.MemoryQueryPlan;
import org.locationtech.jts.geom.Geometry;

/**
 * Translates a CQL2 syntax tree for a collection into a {@link FeatureFilter}.
 * <p>
 * Every node becomes a pair of a store part and a residual whose conjunction is the node.
 * Comparisons are pure store parts. A spatial function becomes the envelope test on the
 * persisted bounding box, a necessary condition the store can evaluate, and the exact test
 * as residual. AND conjoins both parts. An OR or NOT over a node with a residual cannot be
 * split: its residual is the complete node, evaluated in memory, with the store part of
 * an OR kept as necessary condition where every branch has one. In-memory evaluation of a
 * store part uses the Fennec in-memory query engine, so both sides share one semantics.
 */
public final class Cql2Translator {

	private final CollectionDescriptor collection;

	private Cql2Translator(CollectionDescriptor collection) {
		this.collection = Objects.requireNonNull(collection, "collection");
	}

	/**
	 * @param predicate the syntax tree
	 * @param collection the collection the filter applies to
	 * @return the split filter
	 * @throws IllegalArgumentException if the filter refers to unknown properties or mixes
	 *         incompatible types
	 */
	public static FeatureFilter translate(Cql2.Predicate predicate, CollectionDescriptor collection) {
		Part part = new Cql2Translator(collection).part(predicate);
		return new FeatureFilter(part.store, part.residual);
	}

	/** {@code node ≡ store ∧ residual}, a missing part being {@code true} */
	private final class Part {
		final Expression store;
		final Predicate<EObject> residual;
		private Predicate<EObject> storeInMemory;

		Part(Expression store, Predicate<EObject> residual) {
			this.store = store;
			this.residual = residual;
		}

		/** the whole node as in-memory predicate */
		Predicate<EObject> full() {
			Predicate<EObject> s = storeInMemory();
			if (residual == null) {
				return s;
			}
			return s == null ? residual : s.and(residual);
		}

		private Predicate<EObject> storeInMemory() {
			if (store == null) {
				return null;
			}
			if (storeInMemory == null) {
				storeInMemory = inMemory(store);
			}
			return storeInMemory;
		}
	}

	private Part part(Cql2.Predicate predicate) {
		return switch (predicate) {
		case And a -> andPart(a.operands().stream().map(this::part).toList());
		case Or o -> orPart(o.operands().stream().map(this::part).toList());
		case Not n -> notPart(part(n.operand()));
		case BooleanValue b -> b.value() ? new Part(null, null) : new Part(null, o -> false);
		case Comparison c -> new Part(comparison(c), null);
		case IsNull n -> new Part(path(property(n.operand())).isNull(), null);
		case Like l -> {
			EAttribute attribute = property(l.operand());
			if (attribute.getEAttributeType().getInstanceClass() != String.class) {
				throw new IllegalArgumentException("LIKE needs a string property: " + attribute.getName());
			}
			yield new Part(path(attribute).like(l.pattern()), null);
		}
		case Between b -> {
			EAttribute attribute = property(b.operand());
			yield new Part(path(attribute).between(value(attribute, b.lower()), value(attribute, b.upper())), null);
		}
		case In i -> {
			EAttribute attribute = property(i.operand());
			yield new Part(path(attribute).in(i.values().stream().map(v -> value(attribute, v)).toArray()), null);
		}
		case Spatial s -> spatial(s);
		};
	}

	private Part andPart(List<Part> parts) {
		List<Expression> stores = new ArrayList<>();
		Predicate<EObject> residual = null;
		for (Part p : parts) {
			if (p.store != null) {
				stores.add(p.store);
			}
			if (p.residual != null) {
				residual = residual == null ? p.residual : residual.and(p.residual);
			}
		}
		return new Part(combine(stores, true), residual);
	}

	private Part orPart(List<Part> parts) {
		if (parts.stream().allMatch(p -> p.residual == null && p.store != null)) {
			return new Part(combine(parts.stream().map(p -> p.store).toList(), false), null);
		}
		// every branch implies its store part, so their disjunction is a necessary condition
		Expression necessary = parts.stream().allMatch(p -> p.store != null)
				? combine(parts.stream().map(p -> p.store).toList(), false) : null;
		Predicate<EObject> residual = null;
		for (Part p : parts) {
			Predicate<EObject> full = p.full();
			if (full == null) {
				// a branch that always holds
				return new Part(null, null);
			}
			residual = residual == null ? full : residual.or(full);
		}
		return new Part(necessary, residual);
	}

	private Part notPart(Part part) {
		if (part.residual == null) {
			return part.store == null ? new Part(null, o -> false) : new Part(not(part.store), null);
		}
		return new Part(null, part.full().negate());
	}

	private static Expression combine(List<Expression> expressions, boolean conjunction) {
		if (expressions.isEmpty()) {
			return null;
		}
		if (expressions.size() == 1) {
			return expressions.get(0);
		}
		Expression[] array = expressions.toArray(Expression[]::new);
		return conjunction ? and(array) : or(array);
	}

	private Expression comparison(Comparison c) {
		Operator operator = c.operator();
		Operand left = c.left();
		Operand right = c.right();
		if (left instanceof Literal && right instanceof Property) {
			Operand swap = left;
			left = right;
			right = swap;
			operator = operator.flipped();
		}
		if (!(left instanceof Property)) {
			throw new IllegalArgumentException("A comparison needs a property");
		}
		EAttribute attribute = property(left);
		PathStep step = path(attribute);
		Object value = switch (right) {
		case Property p -> path(property(p));
		case Literal l -> value(attribute, l);
		case GeometryLiteral g -> throw new IllegalArgumentException("Geometries are compared with spatial functions");
		};
		return switch (operator) {
		case EQ -> step.eq(value);
		case NE -> step.ne(value);
		case LT -> step.lt(value);
		case LE -> step.le(value);
		case GT -> step.gt(value);
		case GE -> step.ge(value);
		};
	}

	private Part spatial(Spatial s) {
		SpatialRelation relation = s.relation();
		Operand left = s.left();
		Operand right = s.right();
		if (left instanceof GeometryLiteral && right instanceof Property) {
			Operand swap = left;
			left = right;
			right = swap;
			relation = switch (relation) {
			case WITHIN -> SpatialRelation.CONTAINS;
			case CONTAINS -> SpatialRelation.WITHIN;
			default -> relation;
			};
		}
		if (!(left instanceof Property property) || !(right instanceof GeometryLiteral literal)) {
			throw new IllegalArgumentException(relation.cql2Name() + " needs the geometry property and a geometry literal");
		}
		EAttribute geometry = collection.geometry();
		if (geometry == null || !geometry.getName().equals(property.name())) {
			throw new IllegalArgumentException("'" + property.name() + "' is not the geometry of collection "
					+ collection.id());
		}
		Geometry value = literal.geometry();
		Expression store = null;
		if (relation.requiresIntersectingEnvelopes() && collection.bbox() != null && !value.isEmpty()) {
			store = collection.bbox().intersects(JtsGeometries.envelope(value));
		}
		return new Part(store, FeaturePredicates.spatial(geometry, relation, value));
	}

	private EAttribute property(Operand operand) {
		if (operand instanceof Property p) {
			return collection.property(p.name()).orElseThrow(
					() -> new IllegalArgumentException("Unknown queryable '" + p.name() + "' of collection " + collection.id()));
		}
		throw new IllegalArgumentException("Expected a property but found " + operand);
	}

	private static Object value(EAttribute attribute, Literal literal) {
		Object value = literal.value();
		if (attribute.getEAttributeType() instanceof EEnum eEnum) {
			if (value instanceof String s) {
				EEnumLiteral e = eEnum.getEEnumLiteralByLiteral(s);
				if (e == null) {
					e = eEnum.getEEnumLiteral(s);
				}
				if (e != null) {
					return e.getInstance();
				}
			}
			throw new IllegalArgumentException("'" + value + "' is no value of " + attribute.getName());
		}
		Class<?> type = attribute.getEAttributeType().getInstanceClass();
		if (type == String.class && value instanceof String) {
			return value;
		}
		if (value instanceof Number n) {
			if (type == int.class || type == Integer.class) {
				return n.intValue();
			}
			if (type == long.class || type == Long.class) {
				return n.longValue();
			}
			if (type == short.class || type == Short.class) {
				return n.shortValue();
			}
			if (type == double.class || type == Double.class || type == float.class || type == Float.class) {
				return n.doubleValue();
			}
		}
		if ((type == boolean.class || type == Boolean.class) && value instanceof Boolean) {
			return value;
		}
		if (type == Date.class) {
			if (value instanceof Instant i) {
				return Date.from(i);
			}
			if (value instanceof LocalDate d) {
				return Date.from(d.atStartOfDay(ZoneOffset.UTC).toInstant());
			}
		}
		if (type == Instant.class && value instanceof Instant) {
			return value;
		}
		if (type == LocalDate.class && value instanceof LocalDate) {
			return value;
		}
		throw new IllegalArgumentException("'" + value + "' does not fit property " + attribute.getName() + " of type "
				+ attribute.getEAttributeType().getName());
	}

	private Predicate<EObject> inMemory(Expression store) {
		try {
			MemoryQueryPlan plan = MemoryQueries.translate(
					QueryBuilder.from(collection.type()).where(EcoreUtil.copy(store)).build(),
					null);
			return feature -> plan.execute(List.of(feature)).objects().findAny().isPresent();
		} catch (QueryException e) {
			throw new IllegalArgumentException("Cannot evaluate filter in memory: " + e.getMessage(), e);
		}
	}
}
