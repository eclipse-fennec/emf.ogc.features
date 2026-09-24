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
import java.time.format.DateTimeParseException;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EEnumLiteral;
import org.eclipse.fennec.ogc.features.api.CollectionDescriptor;
import org.eclipse.fennec.ogc.features.api.Envelope;
import org.eclipse.fennec.ogc.features.geo.JtsGeometries;
import org.eclipse.fennec.ogc.features.geo.SpatialRelation;
import org.locationtech.jts.geom.Geometry;

import net.opengis.cql2.BboxLiteral;
import net.opengis.cql2.BooleanLiteral;
import net.opengis.cql2.DateLiteral;
import net.opengis.cql2.GeometryLiteral;
import net.opengis.cql2.Literal;
import net.opengis.cql2.NumberLiteral;
import net.opengis.cql2.PropertyRef;
import net.opengis.cql2.SpatialOperation;
import net.opengis.cql2.StringLiteral;
import net.opengis.cql2.TimestampLiteral;

/**
 * Binds a CQL2 expression to a collection: property references to the queryable attributes,
 * literals to values of the attribute's type. Shared by every backend's translation, so that
 * all of them accept and reject the same filters.
 * <p>
 * Every method throws {@link IllegalArgumentException} for a filter that does not fit the
 * collection, which the server answers with 400.
 */
public final class Cql2Binding {

	private Cql2Binding() {
	}

	/**
	 * @param ref the property reference
	 * @param collection the collection
	 * @return the queryable attribute
	 */
	public static EAttribute attribute(PropertyRef ref, CollectionDescriptor collection) {
		return collection.property(ref.getProperty()).orElseThrow(() -> new IllegalArgumentException(
				"Unknown queryable '" + ref.getProperty() + "' of collection " + collection.id()));
	}

	/**
	 * @param ref the property reference of a spatial function
	 * @param collection the collection
	 * @return the geometry attribute of the collection
	 */
	public static EAttribute geometry(PropertyRef ref, CollectionDescriptor collection) {
		EAttribute geometry = collection.geometry();
		if (geometry == null || !geometry.getName().equals(ref.getProperty())) {
			throw new IllegalArgumentException(
					"'" + ref.getProperty() + "' is not the geometry of collection " + collection.id());
		}
		return geometry;
	}

	/**
	 * @param operation a spatial function
	 * @return its relation
	 */
	public static SpatialRelation relation(SpatialOperation operation) {
		// SIntersects -> S_INTERSECTS
		String name = "S_" + operation.eClass().getName().substring(1).toUpperCase(Locale.ROOT);
		return SpatialRelation.ofCql2Name(name)
				.orElseThrow(() -> new IllegalArgumentException("Unsupported spatial function " + name));
	}

	/**
	 * @param literal a geometry or bbox literal, in CRS84
	 * @return the JTS geometry
	 */
	public static Geometry geometry(Literal literal) {
		return switch (literal) {
		case GeometryLiteral g -> JtsGeometries.toJts(g.getGeometry());
		case BboxLiteral b -> JtsGeometries.toJts(envelope(b));
		default -> throw new IllegalArgumentException("Expected a geometry but found " + describe(literal));
		};
	}

	/**
	 * @param literal a bbox literal of four or six numbers
	 * @return its horizontal extent
	 */
	public static Envelope envelope(BboxLiteral literal) {
		List<Double> b = literal.getBbox();
		return switch (b.size()) {
		case 4 -> new Envelope(b.get(0), b.get(1), b.get(2), b.get(3));
		case 6 -> new Envelope(b.get(0), b.get(1), b.get(3), b.get(4));
		default -> throw new IllegalArgumentException("A bbox has four or six numbers, not " + b.size());
		};
	}

	/**
	 * @param attribute the attribute the literal is compared with
	 * @param literal the literal
	 * @return the literal as a value of the attribute's type
	 */
	public static Object value(EAttribute attribute, Literal literal) {
		if (attribute.getEAttributeType() instanceof EEnum eEnum && literal instanceof StringLiteral s) {
			EEnumLiteral e = eEnum.getEEnumLiteralByLiteral(s.getValue());
			if (e == null) {
				e = eEnum.getEEnumLiteral(s.getValue());
			}
			if (e != null) {
				return e.getInstance();
			}
		}
		Class<?> type = attribute.getEAttributeType().getInstanceClass();
		Object value = switch (literal) {
		case StringLiteral s when type == String.class -> s.getValue();
		case BooleanLiteral b when type == boolean.class || type == Boolean.class -> b.isValue();
		case NumberLiteral n -> number(n.getValue(), type);
		case TimestampLiteral t -> temporal(instant(t.getTimestamp()), type);
		case DateLiteral d -> temporal(date(d.getDate()), type);
		default -> null;
		};
		if (value == null) {
			throw new IllegalArgumentException(describe(literal) + " does not fit property " + attribute.getName()
					+ " of type " + attribute.getEAttributeType().getName());
		}
		return value;
	}

	private static Object number(BigDecimal n, Class<?> type) {
		if (n == null) {
			return null;
		}
		if (type == int.class || type == Integer.class) {
			return n.intValue();
		}
		if (type == long.class || type == Long.class) {
			return n.longValue();
		}
		if (type == short.class || type == Short.class) {
			return n.shortValue();
		}
		if (type == double.class || type == Double.class) {
			return n.doubleValue();
		}
		if (type == float.class || type == Float.class) {
			return n.floatValue();
		}
		return type == BigDecimal.class ? n : null;
	}

	/** date/time values are in UTC */
	private static Object temporal(Object value, Class<?> type) {
		Instant instant = switch (value) {
		case Instant i -> i;
		case LocalDate d -> d.atStartOfDay(ZoneOffset.UTC).toInstant();
		default -> null;
		};
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
		return null;
	}

	private static Instant instant(String text) {
		try {
			return Instant.parse(text);
		} catch (DateTimeParseException | NullPointerException e) {
			throw new IllegalArgumentException("Invalid timestamp '" + text + "'");
		}
	}

	private static LocalDate date(String text) {
		try {
			return LocalDate.parse(text);
		} catch (DateTimeParseException | NullPointerException e) {
			throw new IllegalArgumentException("Invalid date '" + text + "'");
		}
	}

	private static String describe(Literal literal) {
		return switch (literal) {
		case StringLiteral s -> "'" + s.getValue() + "'";
		case NumberLiteral n -> String.valueOf(n.getValue());
		case BooleanLiteral b -> String.valueOf(b.isValue());
		case TimestampLiteral t -> "TIMESTAMP('" + t.getTimestamp() + "')";
		case DateLiteral d -> "DATE('" + d.getDate() + "')";
		default -> literal.eClass().getName();
		};
	}
}
