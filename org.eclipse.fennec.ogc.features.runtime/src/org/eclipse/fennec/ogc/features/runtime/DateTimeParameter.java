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
package org.eclipse.fennec.ogc.features.runtime;

import static org.eclipse.fennec.model.query.builder.Expressions.and;
import static org.eclipse.fennec.model.query.builder.Expressions.path;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.fennec.model.expression.Expression;

/**
 * The OGC {@code datetime} parameter: an instant, a date (the whole day, UTC), or a closed
 * interval {@code start/end} whose ends may be open ({@code ..} or empty).
 *
 * @param start the first instant included, {@code null} if open
 * @param end the bound of the end, {@code null} if open
 * @param endExclusive whether {@code end} itself is excluded, as for a day given as date
 */
record DateTimeParameter(Instant start, Instant end, boolean endExclusive) {

	/**
	 * @param value the parameter value
	 * @return the parameter
	 * @throws IllegalArgumentException if the value is no valid instant, date or interval
	 */
	static DateTimeParameter parse(String value) {
		String[] parts = value.split("/", -1);
		if (parts.length == 1) {
			if (isDate(parts[0])) {
				LocalDate day = LocalDate.parse(parts[0]);
				return new DateTimeParameter(startOf(day), startOf(day.plusDays(1)), true);
			}
			Instant instant = instant(parts[0]);
			return new DateTimeParameter(instant, instant, false);
		}
		if (parts.length != 2) {
			throw new IllegalArgumentException("expected an instant or an interval start/end: " + value);
		}
		Instant start = open(parts[0]) ? null : isDate(parts[0]) ? startOf(LocalDate.parse(parts[0])) : instant(parts[0]);
		boolean endIsDate = !open(parts[1]) && isDate(parts[1]);
		Instant end = open(parts[1]) ? null : endIsDate ? startOf(LocalDate.parse(parts[1]).plusDays(1)) : instant(parts[1]);
		if (start == null && end == null) {
			throw new IllegalArgumentException("an interval needs at least one closed end: " + value);
		}
		if (start != null && end != null && start.isAfter(end)) {
			throw new IllegalArgumentException("interval start is after its end: " + value);
		}
		return new DateTimeParameter(start, end, endIsDate);
	}

	/**
	 * @param temporal the temporal attribute, of a date/time type
	 * @return the predicate selecting values within this parameter
	 * @throws IllegalArgumentException if the attribute type is no supported date/time type
	 */
	Expression toExpression(EAttribute temporal) {
		Class<?> type = temporal.getEAttributeType().getInstanceClass();
		if (start != null && start.equals(end) && !endExclusive) {
			return path(temporal).eq(literal(start, type));
		}
		List<Expression> bounds = new ArrayList<>();
		if (start != null) {
			bounds.add(path(temporal).ge(literal(start, type)));
		}
		if (end != null) {
			bounds.add(endExclusive ? path(temporal).lt(literal(end, type)) : path(temporal).le(literal(end, type)));
		}
		return bounds.size() == 1 ? bounds.get(0) : and(bounds.toArray(Expression[]::new));
	}

	private static Object literal(Instant instant, Class<?> type) {
		if (type == Date.class) {
			return Date.from(instant);
		}
		if (type == Instant.class) {
			return instant;
		}
		if (type == LocalDateTime.class) {
			return LocalDateTime.ofInstant(instant, ZoneOffset.UTC);
		}
		if (type == LocalDate.class) {
			return LocalDate.ofInstant(instant, ZoneOffset.UTC);
		}
		throw new IllegalArgumentException("temporal attribute type " + type + " is not supported");
	}

	private static boolean open(String part) {
		return part.isEmpty() || "..".equals(part);
	}

	private static boolean isDate(String part) {
		return part.length() == 10 && part.charAt(4) == '-' && part.charAt(7) == '-';
	}

	private static Instant startOf(LocalDate day) {
		return day.atStartOfDay(ZoneOffset.UTC).toInstant();
	}

	private static Instant instant(String part) {
		try {
			return OffsetDateTime.parse(part).toInstant();
		} catch (DateTimeParseException e) {
			throw new IllegalArgumentException("not an RFC 3339 date-time: " + part, e);
		}
	}
}
