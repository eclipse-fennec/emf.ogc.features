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

import java.util.List;

import org.eclipse.fennec.ogc.features.geo.SpatialRelation;
import org.locationtech.jts.geom.Geometry;

/**
 * The syntax tree of a CQL2 filter, shared by the text and the JSON encoding.
 */
public final class Cql2 {

	private Cql2() {
	}

	/** a boolean valued node */
	public sealed interface Predicate permits And, Or, Not, Comparison, IsNull, Like, Between, In, Spatial, BooleanValue {
	}

	/** an operand of a predicate */
	public sealed interface Operand permits Property, Literal, GeometryLiteral {
	}

	public record And(List<Predicate> operands) implements Predicate {
		public And {
			operands = List.copyOf(operands);
		}
	}

	public record Or(List<Predicate> operands) implements Predicate {
		public Or {
			operands = List.copyOf(operands);
		}
	}

	public record Not(Predicate operand) implements Predicate {
	}

	/** the comparison operators */
	public enum Operator {
		EQ("="), NE("<>"), LT("<"), LE("<="), GT(">"), GE(">=");

		private final String symbol;

		Operator(String symbol) {
			this.symbol = symbol;
		}

		public String symbol() {
			return symbol;
		}

		/** @return the operator with swapped operands, e.g. {@code <} for {@code >} */
		public Operator flipped() {
			return switch (this) {
			case LT -> GT;
			case LE -> GE;
			case GT -> LT;
			case GE -> LE;
			default -> this;
			};
		}

		public static Operator ofSymbol(String symbol) {
			for (Operator o : values()) {
				if (o.symbol.equals(symbol)) {
					return o;
				}
			}
			throw new IllegalArgumentException("Unknown comparison operator " + symbol);
		}
	}

	public record Comparison(Operator operator, Operand left, Operand right) implements Predicate {
	}

	public record IsNull(Operand operand) implements Predicate {
	}

	/** {@code pattern} uses the SQL wildcards {@code %} and {@code _} */
	public record Like(Operand operand, String pattern) implements Predicate {
	}

	public record Between(Operand operand, Literal lower, Literal upper) implements Predicate {
	}

	public record In(Operand operand, List<Literal> values) implements Predicate {
		public In {
			values = List.copyOf(values);
		}
	}

	public record Spatial(SpatialRelation relation, Operand left, Operand right) implements Predicate {
	}

	public record BooleanValue(boolean value) implements Predicate {
	}

	/** a reference to a queryable */
	public record Property(String name) implements Operand {
	}

	/**
	 * A scalar literal: a String, a Number, a Boolean, an {@link java.time.Instant} for
	 * {@code TIMESTAMP(...)} or a {@link java.time.LocalDate} for {@code DATE(...)}.
	 */
	public record Literal(Object value) implements Operand {
	}

	/** a geometry literal in CRS84 */
	public record GeometryLiteral(Geometry geometry) implements Operand {
	}
}
