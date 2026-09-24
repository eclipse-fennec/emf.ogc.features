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
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.util.Date;
import java.util.List;
import java.util.Objects;

import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.fennec.ogc.features.api.Envelope;

import net.opengis.cql2.And;
import net.opengis.cql2.BboxLiteral;
import net.opengis.cql2.BooleanLiteral;
import net.opengis.cql2.Cql2Factory;
import net.opengis.cql2.DateLiteral;
import net.opengis.cql2.Expression;
import net.opengis.cql2.Literal;
import net.opengis.cql2.NumberLiteral;
import net.opengis.cql2.Operation;
import net.opengis.cql2.Predicate;
import net.opengis.cql2.PropertyRef;
import net.opengis.cql2.StringLiteral;
import net.opengis.cql2.TimestampLiteral;

/**
 * Builds CQL2 filters for the request parameters that are no CQL2 themselves ({@code bbox},
 * {@code datetime}, {@code property=value}), so that a backend receives every restriction in
 * one filter.
 */
public final class Cql2Filters {

	private static final Cql2Factory F = Cql2Factory.eINSTANCE;

	private Cql2Filters() {
	}

	/**
	 * @param filters the filters, none of them {@code null}
	 * @return their conjunction, the filter itself for one, {@code null} for none
	 */
	public static Predicate and(List<Predicate> filters) {
		return switch (filters.size()) {
		case 0 -> null;
		case 1 -> filters.get(0);
		default -> {
			And and = F.createAnd();
			filters.forEach(f -> and.getArgs().add(Objects.requireNonNull(f, "filter")));
			yield and;
		}
		};
	}

	/**
	 * @param attribute the attribute
	 * @return a reference to it
	 */
	public static PropertyRef property(EAttribute attribute) {
		PropertyRef ref = F.createPropertyRef();
		ref.setProperty(attribute.getName());
		return ref;
	}

	/**
	 * @param geometry the geometry attribute
	 * @param envelope the box, in CRS84
	 * @return {@code S_INTERSECTS(geometry, BBOX(…))}
	 */
	public static Predicate intersects(EAttribute geometry, Envelope envelope) {
		BboxLiteral bbox = F.createBboxLiteral();
		bbox.getBbox().addAll(List.of(envelope.minX(), envelope.minY(), envelope.maxX(), envelope.maxY()));
		return operation(F.createSIntersects(), property(geometry), bbox);
	}

	/**
	 * @param attribute the attribute
	 * @param value a value of the attribute's type
	 * @return {@code attribute = value}
	 */
	public static Predicate equal(EAttribute attribute, Object value) {
		return operation(F.createEqual(), property(attribute), literal(value));
	}

	/**
	 * @param attribute the attribute
	 * @param value a value of the attribute's type
	 * @return {@code attribute >= value}
	 */
	public static Predicate greaterOrEqual(EAttribute attribute, Object value) {
		return operation(F.createGreaterOrEqual(), property(attribute), literal(value));
	}

	/**
	 * @param attribute the attribute
	 * @param value a value of the attribute's type
	 * @return {@code attribute <= value}
	 */
	public static Predicate lessOrEqual(EAttribute attribute, Object value) {
		return operation(F.createLessOrEqual(), property(attribute), literal(value));
	}

	/**
	 * @param attribute the attribute
	 * @param value a value of the attribute's type
	 * @return {@code attribute < value}
	 */
	public static Predicate lessThan(EAttribute attribute, Object value) {
		return operation(F.createLessThan(), property(attribute), literal(value));
	}

	/**
	 * @param value a string, number, boolean, enum literal or date/time value
	 * @return the CQL2 literal, which {@link Cql2Binding#value} turns back into the value
	 */
	public static Literal literal(Object value) {
		return switch (value) {
		case String s -> string(s);
		case Enumerator e -> string(e.getLiteral());
		case Boolean b -> {
			BooleanLiteral literal = F.createBooleanLiteral();
			literal.setValue(b);
			yield literal;
		}
		case Number n -> {
			NumberLiteral literal = F.createNumberLiteral();
			literal.setValue(n instanceof BigDecimal d ? d : new BigDecimal(n.toString()));
			yield literal;
		}
		case Date d -> timestamp(d.toInstant());
		case Instant i -> timestamp(i);
		case LocalDateTime t -> timestamp(t.toInstant(ZoneOffset.UTC));
		case LocalDate d -> {
			DateLiteral literal = F.createDateLiteral();
			literal.setDate(d.toString());
			yield literal;
		}
		default -> throw new IllegalArgumentException("No CQL2 literal for " + value.getClass().getName());
		};
	}

	private static StringLiteral string(String value) {
		StringLiteral literal = F.createStringLiteral();
		literal.setValue(value);
		return literal;
	}

	private static TimestampLiteral timestamp(Instant instant) {
		TimestampLiteral literal = F.createTimestampLiteral();
		literal.setTimestamp(instant.toString());
		return literal;
	}

	private static Predicate operation(Operation operation, Expression... args) {
		operation.getArgs().addAll(List.of(args));
		return operation;
	}
}
