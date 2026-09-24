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
package org.eclipse.fennec.ogc.features.source.persistence;

import static org.eclipse.fennec.model.query.builder.Expressions.and;
import static org.eclipse.fennec.model.query.builder.Expressions.not;
import static org.eclipse.fennec.model.query.builder.Expressions.or;
import static org.eclipse.fennec.model.query.builder.Expressions.path;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.fennec.model.expression.Expression;
import org.eclipse.fennec.model.query.builder.Expressions.PathStep;
import org.eclipse.fennec.ogc.features.api.BboxAttributes;
import org.eclipse.fennec.ogc.features.api.CollectionDescriptor;
import org.eclipse.fennec.ogc.features.api.Envelope;
import org.eclipse.fennec.ogc.features.cql2.Cql2Binding;
import org.eclipse.fennec.ogc.features.cql2.Cql2Evaluator;
import org.eclipse.fennec.ogc.features.cql2.Cql2Filters;
import org.eclipse.fennec.ogc.features.geo.JtsGeometries;
import org.eclipse.fennec.ogc.features.geo.SpatialRelation;

import net.opengis.cql2.And;
import net.opengis.cql2.ArrayLiteral;
import net.opengis.cql2.Between;
import net.opengis.cql2.BooleanLiteral;
import net.opengis.cql2.Comparison;
import net.opengis.cql2.Equal;
import net.opengis.cql2.GreaterOrEqual;
import net.opengis.cql2.GreaterThan;
import net.opengis.cql2.In;
import net.opengis.cql2.IsNull;
import net.opengis.cql2.LessOrEqual;
import net.opengis.cql2.LessThan;
import net.opengis.cql2.Like;
import net.opengis.cql2.Literal;
import net.opengis.cql2.Not;
import net.opengis.cql2.NotEqual;
import net.opengis.cql2.Operation;
import net.opengis.cql2.Or;
import net.opengis.cql2.Predicate;
import net.opengis.cql2.PropertyRef;
import net.opengis.cql2.SpatialOperation;

/**
 * Translates a CQL2 filter into the Fennec query IR for a persistence store.
 * <p>
 * What the IR cannot express, today the exact spatial relations, stays a residual that
 * {@link Cql2Evaluator} tests in memory on what the store returned. For a spatial function
 * the store still gets the envelope test on the persisted bounding box, a necessary
 * condition that keeps the residual small.
 */
public final class Cql2ToQuery {

	/**
	 * {@code filter ≡ store ∧ residual}.
	 *
	 * @param store the store part, {@code null} for none
	 * @param residual the in-memory part, {@code null} for none
	 */
	public record Translation(Expression store, Cql2Evaluator residual) {

		/**
		 * @return {@code true} if part of the filter must be evaluated in memory
		 */
		public boolean hasResidual() {
			return residual != null;
		}
	}

	/** {@code node ≡ store ∧ AND(residual)}, a missing store being {@code true} */
	private record Part(Expression store, List<Predicate> residual) {

		static Part store(Expression store) {
			return new Part(store, List.of());
		}

		static Part inMemory(Expression necessary, Predicate node) {
			return new Part(necessary, List.of(node));
		}

		boolean exact() {
			return residual.isEmpty();
		}

		boolean always() {
			return store == null && residual.isEmpty();
		}
	}

	private final CollectionDescriptor collection;

	private Cql2ToQuery(CollectionDescriptor collection) {
		this.collection = Objects.requireNonNull(collection, "collection");
	}

	/**
	 * @param filter the filter
	 * @param collection the collection the filter applies to
	 * @return the store part and the residual
	 * @throws IllegalArgumentException if the filter does not fit the collection
	 * @throws UnsupportedOperationException for a construct neither the store nor the
	 *         evaluator supports
	 */
	public static Translation translate(Predicate filter, CollectionDescriptor collection) {
		Part part = new Cql2ToQuery(collection).part(Objects.requireNonNull(filter, "filter"));
		if (part.exact()) {
			return new Translation(part.store(), null);
		}
		// copies: the conjunction contains its operands, the filter must stay intact
		List<Predicate> residual = part.residual().stream().map(EcoreUtil::copy).toList();
		return new Translation(part.store(), Cql2Evaluator.compile(Cql2Filters.and(residual), collection));
	}

	private Part part(EObject node) {
		return switch (node) {
		case BooleanLiteral b -> b.isValue() ? Part.store(null) : Part.inMemory(null, b);
		case And a -> andPart(a.getArgs().stream().map(this::part).toList());
		case Or o -> orPart(o, o.getArgs().stream().map(this::part).toList());
		case Not n -> notPart(n, part(single(n)));
		case Comparison c -> Part.store(comparison(c));
		case IsNull n -> Part.store(path(attribute(single(n))).isNull());
		case Like l -> Part.store(like(l));
		case Between b -> Part.store(between(b));
		case In i -> Part.store(in(i));
		case SpatialOperation s -> spatial(s);
		default -> throw new UnsupportedOperationException("Not supported: " + node.eClass().getName());
		};
	}

	private static Part andPart(List<Part> parts) {
		List<Expression> stores = new ArrayList<>();
		List<Predicate> residual = new ArrayList<>();
		for (Part p : parts) {
			if (p.store() != null) {
				stores.add(p.store());
			}
			residual.addAll(p.residual());
		}
		return new Part(combine(stores, true), residual);
	}

	private static Part orPart(Or node, List<Part> parts) {
		if (parts.stream().anyMatch(Part::always)) {
			return Part.store(null);
		}
		if (parts.stream().allMatch(Part::exact)) {
			return Part.store(combine(parts.stream().map(Part::store).toList(), false));
		}
		// every branch implies its store part, so their disjunction is a necessary condition
		Expression necessary = parts.stream().allMatch(p -> p.store() != null)
				? combine(parts.stream().map(Part::store).toList(), false) : null;
		return Part.inMemory(necessary, node);
	}

	private static Part notPart(Not node, Part part) {
		if (part.exact() && part.store() != null) {
			return Part.store(not(part.store()));
		}
		return Part.inMemory(null, node);
	}

	private static Expression combine(List<Expression> expressions, boolean conjunction) {
		return switch (expressions.size()) {
		case 0 -> null;
		case 1 -> expressions.get(0);
		default -> {
			Expression[] array = expressions.toArray(Expression[]::new);
			yield conjunction ? and(array) : or(array);
		}
		};
	}

	private Expression comparison(Comparison c) {
		List<? extends EObject> args = pair(c);
		EObject left = args.get(0);
		EObject right = args.get(1);
		boolean flipped = false;
		if (left instanceof Literal && right instanceof PropertyRef) {
			EObject swap = left;
			left = right;
			right = swap;
			flipped = true;
		}
		if (!(left instanceof PropertyRef property)) {
			throw new IllegalArgumentException("A comparison needs a property");
		}
		EAttribute attribute = attribute(property);
		PathStep step = path(attribute);
		Object value = switch (right) {
		case PropertyRef p -> path(attribute(p));
		case Literal l -> Cql2Binding.value(attribute, l);
		default -> throw new IllegalArgumentException("Cannot compare with " + right.eClass().getName());
		};
		return switch (c) {
		case Equal e -> step.eq(value);
		case NotEqual e -> step.ne(value);
		case LessThan e -> flipped ? step.gt(value) : step.lt(value);
		case LessOrEqual e -> flipped ? step.ge(value) : step.le(value);
		case GreaterThan e -> flipped ? step.lt(value) : step.gt(value);
		case GreaterOrEqual e -> flipped ? step.le(value) : step.ge(value);
		default -> throw new UnsupportedOperationException("Not supported: " + c.eClass().getName());
		};
	}

	private Expression like(Like l) {
		List<? extends EObject> args = pair(l);
		if (!(args.get(0) instanceof PropertyRef p) || !(args.get(1) instanceof Literal pattern)) {
			throw new IllegalArgumentException("LIKE needs a property and a pattern");
		}
		EAttribute attribute = attribute(p);
		if (attribute.getEAttributeType().getInstanceClass() != String.class) {
			throw new IllegalArgumentException("LIKE needs a string property: " + attribute.getName());
		}
		return path(attribute).like((String) Cql2Binding.value(attribute, pattern));
	}

	private Expression between(Between b) {
		List<? extends EObject> args = b.getArgs();
		if (args.size() != 3 || !(args.get(0) instanceof PropertyRef p) || !(args.get(1) instanceof Literal lower)
				|| !(args.get(2) instanceof Literal upper)) {
			throw new IllegalArgumentException("BETWEEN needs a property and two literals");
		}
		EAttribute attribute = attribute(p);
		return path(attribute).between(Cql2Binding.value(attribute, lower), Cql2Binding.value(attribute, upper));
	}

	private Expression in(In i) {
		List<? extends EObject> args = pair(i);
		if (!(args.get(0) instanceof PropertyRef p) || !(args.get(1) instanceof ArrayLiteral list)) {
			throw new IllegalArgumentException("IN needs a property and a list");
		}
		EAttribute attribute = attribute(p);
		return path(attribute).in(list.getElements().stream().map(e -> {
			if (e instanceof Literal l) {
				return Cql2Binding.value(attribute, l);
			}
			throw new IllegalArgumentException("IN needs a list of literals");
		}).toArray());
	}

	private Part spatial(SpatialOperation s) {
		SpatialRelation relation = Cql2Binding.relation(s);
		List<? extends EObject> args = pair(s);
		PropertyRef property = null;
		Literal literal = null;
		for (EObject arg : args) {
			if (arg instanceof PropertyRef p) {
				property = p;
			} else if (arg instanceof Literal l) {
				literal = l;
			}
		}
		if (property == null || literal == null) {
			throw new IllegalArgumentException(relation.cql2Name() + " needs the geometry property and a geometry");
		}
		Cql2Binding.geometry(property, collection);
		// JTS
		var geometry = Cql2Binding.geometry(literal);
		BboxAttributes bbox = collection.bbox();
		Expression necessary = null;
		if (relation.requiresIntersectingEnvelopes() && bbox != null && !geometry.isEmpty()) {
			necessary = intersects(bbox, JtsGeometries.envelope(geometry));
		}
		return Part.inMemory(necessary, s);
	}

	/** the persisted box and the given one overlap */
	static Expression intersects(BboxAttributes bbox, Envelope envelope) {
		return and(
				path(bbox.minX()).le(envelope.maxX()),
				path(bbox.maxX()).ge(envelope.minX()),
				path(bbox.minY()).le(envelope.maxY()),
				path(bbox.maxY()).ge(envelope.minY()));
	}

	private EAttribute attribute(EObject operand) {
		if (operand instanceof PropertyRef p) {
			return Cql2Binding.attribute(p, collection);
		}
		throw new IllegalArgumentException("Expected a property but found " + operand.eClass().getName());
	}

	private static EObject single(Operation operation) {
		if (operation.getArgs().size() != 1) {
			throw new IllegalArgumentException(operation.eClass().getName() + " takes one argument, not "
					+ operation.getArgs().size());
		}
		return operation.getArgs().get(0);
	}

	private static List<? extends EObject> pair(Operation operation) {
		if (operation.getArgs().size() != 2) {
			throw new IllegalArgumentException(operation.eClass().getName() + " takes two arguments, not "
					+ operation.getArgs().size());
		}
		return operation.getArgs();
	}
}
