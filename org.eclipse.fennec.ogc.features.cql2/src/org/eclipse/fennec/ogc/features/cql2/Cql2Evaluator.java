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

import java.math.BigDecimal;
import java.util.List;
import java.util.Objects;
import java.util.function.IntPredicate;
import java.util.regex.Pattern;

import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.fennec.ogc.features.api.CollectionDescriptor;
import org.eclipse.fennec.ogc.features.geo.JtsGeometries;
import org.eclipse.fennec.ogc.features.geo.SpatialRelation;
import org.geojson.Geometry;
import org.locationtech.jts.geom.prep.PreparedGeometry;
import org.locationtech.jts.geom.prep.PreparedGeometryFactory;

import net.opengis.cql2.And;
import net.opengis.cql2.ArrayLiteral;
import net.opengis.cql2.Between;
import net.opengis.cql2.BooleanLiteral;
import net.opengis.cql2.Comparison;
import net.opengis.cql2.Equal;
import net.opengis.cql2.Expression;
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
import net.opengis.cql2.Or;
import net.opengis.cql2.Predicate;
import net.opengis.cql2.PropertyRef;
import net.opengis.cql2.SpatialOperation;

/**
 * Evaluates a CQL2 filter on features in memory, the reference semantics every backend is
 * tested against.
 * <p>
 * The logic has three values like SQL: a comparison with a missing value is unknown
 * ({@code null}), and only features for which the filter is {@code true} match. {@code NOT}
 * of unknown stays unknown, so {@code NOT (x = 1)} does not match a feature without {@code x}.
 */
public final class Cql2Evaluator {

	/** a compiled node: {@code true}, {@code false} or {@code null} for unknown */
	@FunctionalInterface
	private interface Condition {
		Boolean test(EObject feature);
	}

	/** a compiled operand */
	@FunctionalInterface
	private interface Value {
		Object of(EObject feature);
	}

	private final Condition condition;

	private Cql2Evaluator(Condition condition) {
		this.condition = condition;
	}

	/**
	 * @param filter the filter
	 * @param collection the collection whose features are evaluated
	 * @return the evaluator
	 * @throws IllegalArgumentException if the filter does not fit the collection
	 * @throws UnsupportedOperationException for a construct the evaluator cannot evaluate
	 */
	public static Cql2Evaluator compile(Predicate filter, CollectionDescriptor collection) {
		return new Cql2Evaluator(new Compiler(collection).condition(Objects.requireNonNull(filter, "filter")));
	}

	/**
	 * @param feature a feature of the collection
	 * @return {@code true} if the filter holds for the feature
	 */
	public boolean matches(EObject feature) {
		return Boolean.TRUE.equals(condition.test(feature));
	}

	/**
	 * @param feature a feature of the collection
	 * @return the value of the filter, {@code null} for unknown
	 */
	public Boolean evaluate(EObject feature) {
		return condition.test(feature);
	}

	private record Compiler(CollectionDescriptor collection) {

		Condition condition(Expression expression) {
			return switch (expression) {
			case BooleanLiteral b -> feature -> b.isValue();
			case And a -> and(a.getArgs().stream().map(this::predicate).toList());
			case Or o -> or(o.getArgs().stream().map(this::predicate).toList());
			case Not n -> not(predicate(single(n.getArgs(), "NOT")));
			case Comparison c -> comparison(c);
			case Like l -> like(l);
			case Between b -> between(b);
			case In i -> in(i);
			case IsNull n -> {
				Value value = property(single(n.getArgs(), "IS NULL"));
				yield feature -> value.of(feature) == null;
			}
			case SpatialOperation s -> spatial(s);
			default -> throw new UnsupportedOperationException("Not supported: " + expression.eClass().getName());
			};
		}

		private Condition predicate(Expression expression) {
			if (!(expression instanceof Predicate)) {
				throw new IllegalArgumentException("Expected a predicate but found " + expression.eClass().getName());
			}
			return condition(expression);
		}

		private static Condition and(List<Condition> operands) {
			return feature -> {
				Boolean result = Boolean.TRUE;
				for (Condition operand : operands) {
					Boolean value = operand.test(feature);
					if (Boolean.FALSE.equals(value)) {
						return false;
					}
					if (value == null) {
						result = null;
					}
				}
				return result;
			};
		}

		private static Condition or(List<Condition> operands) {
			return feature -> {
				Boolean result = Boolean.FALSE;
				for (Condition operand : operands) {
					Boolean value = operand.test(feature);
					if (Boolean.TRUE.equals(value)) {
						return true;
					}
					if (value == null) {
						result = null;
					}
				}
				return result;
			};
		}

		private static Condition not(Condition operand) {
			return feature -> {
				Boolean value = operand.test(feature);
				return value == null ? null : !value;
			};
		}

		private Condition comparison(Comparison c) {
			List<Expression> args = pair(c.getArgs(), c.eClass().getName());
			IntPredicate test = switch (c) {
			case Equal e -> r -> r == 0;
			case NotEqual e -> r -> r != 0;
			case LessThan e -> r -> r < 0;
			case LessOrEqual e -> r -> r <= 0;
			case GreaterThan e -> r -> r > 0;
			case GreaterOrEqual e -> r -> r >= 0;
			default -> throw new UnsupportedOperationException("Not supported: " + c.eClass().getName());
			};
			Expression left = args.get(0);
			Expression right = args.get(1);
			Value a;
			Value b;
			if (left instanceof PropertyRef p && right instanceof PropertyRef q) {
				EAttribute first = Cql2Binding.attribute(p, collection);
				EAttribute second = Cql2Binding.attribute(q, collection);
				if (!comparable(first, second)) {
					throw new IllegalArgumentException("Cannot compare " + first.getName() + " with " + second.getName());
				}
				a = read(first);
				b = read(second);
			} else if (left instanceof PropertyRef p && right instanceof Literal l) {
				EAttribute attribute = Cql2Binding.attribute(p, collection);
				a = read(attribute);
				b = constant(Cql2Binding.value(attribute, l));
			} else if (left instanceof Literal l && right instanceof PropertyRef p) {
				EAttribute attribute = Cql2Binding.attribute(p, collection);
				a = constant(Cql2Binding.value(attribute, l));
				b = read(attribute);
			} else {
				throw new IllegalArgumentException("A comparison needs a property");
			}
			return feature -> {
				Integer r = compare(a.of(feature), b.of(feature));
				return r == null ? null : test.test(r);
			};
		}

		private Condition like(Like l) {
			List<Expression> args = pair(l.getArgs(), "LIKE");
			if (!(args.get(0) instanceof PropertyRef p) || !(args.get(1) instanceof Literal pattern)) {
				throw new IllegalArgumentException("LIKE needs a property and a pattern");
			}
			EAttribute attribute = Cql2Binding.attribute(p, collection);
			if (attribute.getEAttributeType().getInstanceClass() != String.class) {
				throw new IllegalArgumentException("LIKE needs a string property: " + attribute.getName());
			}
			Pattern regex = regex((String) Cql2Binding.value(attribute, pattern));
			Value value = read(attribute);
			return feature -> value.of(feature) instanceof String s ? regex.matcher(s).matches() : null;
		}

		private Condition between(Between b) {
			List<Expression> args = b.getArgs();
			if (args.size() != 3 || !(args.get(0) instanceof PropertyRef p) || !(args.get(1) instanceof Literal lower)
					|| !(args.get(2) instanceof Literal upper)) {
				throw new IllegalArgumentException("BETWEEN needs a property and two literals");
			}
			EAttribute attribute = Cql2Binding.attribute(p, collection);
			Object low = Cql2Binding.value(attribute, lower);
			Object high = Cql2Binding.value(attribute, upper);
			Value value = read(attribute);
			return feature -> {
				Object v = value.of(feature);
				Integer above = compare(v, low);
				Integer below = compare(v, high);
				return above == null || below == null ? null : above >= 0 && below <= 0;
			};
		}

		private Condition in(In i) {
			List<Expression> args = pair(i.getArgs(), "IN");
			if (!(args.get(0) instanceof PropertyRef p) || !(args.get(1) instanceof ArrayLiteral list)) {
				throw new IllegalArgumentException("IN needs a property and a list");
			}
			EAttribute attribute = Cql2Binding.attribute(p, collection);
			List<Object> values = list.getElements().stream().map(e -> {
				if (e instanceof Literal l) {
					return Cql2Binding.value(attribute, l);
				}
				throw new IllegalArgumentException("IN needs a list of literals");
			}).toList();
			Value value = read(attribute);
			return feature -> {
				Object v = value.of(feature);
				if (v == null) {
					return null;
				}
				return values.stream().anyMatch(candidate -> Integer.valueOf(0).equals(compare(v, candidate)));
			};
		}

		private Condition spatial(SpatialOperation s) {
			SpatialRelation relation = Cql2Binding.relation(s);
			List<Expression> args = pair(s.getArgs(), relation.cql2Name());
			Expression left = args.get(0);
			Expression right = args.get(1);
			if (left instanceof Literal && right instanceof PropertyRef) {
				Expression swap = left;
				left = right;
				right = swap;
				relation = switch (relation) {
				case WITHIN -> SpatialRelation.CONTAINS;
				case CONTAINS -> SpatialRelation.WITHIN;
				default -> relation;
				};
			}
			if (!(left instanceof PropertyRef p) || !(right instanceof Literal l)) {
				throw new IllegalArgumentException(relation.cql2Name() + " needs the geometry property and a geometry");
			}
			Value geometry = read(Cql2Binding.geometry(p, collection));
			// JTS, next to the imported GeoJSON Geometry
			var literal = Cql2Binding.geometry(l);
			SpatialRelation r = relation;
			if (r == SpatialRelation.INTERSECTS) {
				// the common case, e.g. every bbox request of a map client
				PreparedGeometry prepared = PreparedGeometryFactory.prepare(literal);
				return feature -> geometry.of(feature) instanceof Geometry g
						? prepared.intersects(JtsGeometries.toJts(g)) : null;
			}
			return feature -> geometry.of(feature) instanceof Geometry g
					? r.test(JtsGeometries.toJts(g), literal) : null;
		}

		private static Value read(EAttribute attribute) {
			return feature -> attribute.getEContainingClass().isSuperTypeOf(feature.eClass())
					? feature.eGet(attribute) : null;
		}

		private static Value constant(Object value) {
			return feature -> value;
		}

		private Value property(Expression expression) {
			if (expression instanceof PropertyRef p) {
				return read(Cql2Binding.attribute(p, collection));
			}
			throw new IllegalArgumentException("Expected a property but found " + expression.eClass().getName());
		}

		private static Expression single(List<Expression> args, String operator) {
			if (args.size() != 1) {
				throw new IllegalArgumentException(operator + " takes one argument, not " + args.size());
			}
			return args.get(0);
		}

		private static List<Expression> pair(List<Expression> args, String operator) {
			if (args.size() != 2) {
				throw new IllegalArgumentException(operator + " takes two arguments, not " + args.size());
			}
			return args;
		}

		private static boolean comparable(EAttribute a, EAttribute b) {
			Class<?> x = a.getEAttributeType().getInstanceClass();
			Class<?> y = b.getEAttributeType().getInstanceClass();
			return x == y || numeric(x) && numeric(y);
		}

		private static boolean numeric(Class<?> type) {
			return type != null && (Number.class.isAssignableFrom(type)
					|| type.isPrimitive() && type != boolean.class && type != char.class);
		}
	}

	/** {@code null} if either value is missing */
	@SuppressWarnings("unchecked")
	private static Integer compare(Object a, Object b) {
		if (a == null || b == null) {
			return null;
		}
		if (a instanceof Enumerator x && b instanceof Enumerator y) {
			// generated and dynamic enum literals alike
			return Integer.compare(x.getValue(), y.getValue());
		}
		if (a instanceof Number x && b instanceof Number y && a.getClass() != b.getClass()) {
			return new BigDecimal(x.toString()).compareTo(new BigDecimal(y.toString()));
		}
		if (a instanceof Comparable x && a.getClass() == b.getClass()) {
			return x.compareTo(b);
		}
		throw new IllegalArgumentException("Cannot compare " + a + " with " + b);
	}

	/** CQL2 LIKE: {@code %} any characters, {@code _} one character, {@code \} escapes */
	private static Pattern regex(String like) {
		StringBuilder regex = new StringBuilder();
		for (int i = 0; i < like.length(); i++) {
			char c = like.charAt(i);
			if (c == '\\' && i + 1 < like.length()) {
				regex.append(Pattern.quote(String.valueOf(like.charAt(++i))));
			} else if (c == '%') {
				regex.append(".*");
			} else if (c == '_') {
				regex.append('.');
			} else {
				regex.append(Pattern.quote(String.valueOf(c)));
			}
		}
		return Pattern.compile(regex.toString(), Pattern.DOTALL);
	}
}
