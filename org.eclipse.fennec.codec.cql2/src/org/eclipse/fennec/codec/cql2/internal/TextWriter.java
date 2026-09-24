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
package org.eclipse.fennec.codec.cql2.internal;

import java.math.BigDecimal;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

import net.opengis.cql2.And;
import net.opengis.cql2.ArrayLiteral;
import net.opengis.cql2.BboxLiteral;
import net.opengis.cql2.Between;
import net.opengis.cql2.BooleanLiteral;
import net.opengis.cql2.DateLiteral;
import net.opengis.cql2.Equal;
import net.opengis.cql2.Expression;
import net.opengis.cql2.GeometryLiteral;
import net.opengis.cql2.GreaterOrEqual;
import net.opengis.cql2.GreaterThan;
import net.opengis.cql2.In;
import net.opengis.cql2.IsNull;
import net.opengis.cql2.LessOrEqual;
import net.opengis.cql2.LessThan;
import net.opengis.cql2.Like;
import net.opengis.cql2.Not;
import net.opengis.cql2.NotEqual;
import net.opengis.cql2.NumberLiteral;
import net.opengis.cql2.Operation;
import net.opengis.cql2.Or;
import net.opengis.cql2.PropertyRef;
import net.opengis.cql2.SpatialOperation;
import net.opengis.cql2.StringLiteral;
import net.opengis.cql2.TimestampLiteral;
import org.geojson.Coordinates;
import org.geojson.GeoJsonPackage;
import org.geojson.Geometry;
import org.geojson.GeometryCollection;
import org.geojson.LineString;
import org.geojson.MultiLineString;
import org.geojson.MultiPoint;
import org.geojson.MultiPolygon;
import org.geojson.Point;
import org.geojson.Polygon;
import org.geojson.Ring;
import org.geojson.SimplePolygon;

/**
 * Writes the CQL2 model in the text encoding, with as few parentheses as the precedence of
 * OR, AND and NOT allows.
 */
public final class TextWriter {

	private static final Pattern IDENTIFIER = Pattern.compile("[A-Za-z_][A-Za-z0-9_.:]*");
	private static final Set<String> KEYWORDS = Set.of("AND", "OR", "NOT", "LIKE", "BETWEEN", "IN", "IS", "NULL", "TRUE",
			"FALSE", "DATE", "TIMESTAMP", "BBOX", "POINT", "LINESTRING", "POLYGON", "MULTIPOINT", "MULTILINESTRING",
			"MULTIPOLYGON", "GEOMETRYCOLLECTION", "Z");

	private TextWriter() {
	}

	public static String write(Expression expression) {
		return switch (expression) {
		case Or or -> join(or.getArgs(), " OR ", 1);
		case And and -> join(and.getArgs(), " AND ", 2);
		case Not not -> "NOT " + operand(arg(not, 0), 3);
		case Equal e -> binary(e, " = ");
		case NotEqual e -> binary(e, " <> ");
		case LessThan e -> binary(e, " < ");
		case LessOrEqual e -> binary(e, " <= ");
		case GreaterThan e -> binary(e, " > ");
		case GreaterOrEqual e -> binary(e, " >= ");
		case Like like -> binary(like, " LIKE ");
		case Between b -> write(arg(b, 0)) + " BETWEEN " + write(arg(b, 1)) + " AND " + write(arg(b, 2));
		case In in -> write(arg(in, 0)) + " IN (" + (arg(in, 1) instanceof ArrayLiteral list
				? list.getElements().stream().map(TextWriter::write).collect(Collectors.joining(", "))
				: write(arg(in, 1))) + ")";
		case IsNull n -> write(arg(n, 0)) + " IS NULL";
		case SpatialOperation s -> s.eClass().getName().replaceFirst("^S", "S_").toUpperCase(Locale.ROOT)
				+ "(" + write(arg(s, 0)) + ", " + write(arg(s, 1)) + ")";
		case PropertyRef p -> property(p.getProperty());
		case StringLiteral s -> "'" + s.getValue().replace("'", "''") + "'";
		case NumberLiteral n -> n.getValue().toPlainString();
		case BooleanLiteral b -> b.isValue() ? "TRUE" : "FALSE";
		case TimestampLiteral t -> "TIMESTAMP('" + t.getTimestamp() + "')";
		case DateLiteral d -> "DATE('" + d.getDate() + "')";
		case ArrayLiteral a -> "(" + a.getElements().stream().map(TextWriter::write).collect(Collectors.joining(", ")) + ")";
		case BboxLiteral b -> "BBOX(" + b.getBbox().stream().map(TextWriter::number).collect(Collectors.joining(", ")) + ")";
		case GeometryLiteral g -> wkt(g.getGeometry());
		default -> throw new IllegalArgumentException("Cannot write " + expression.eClass().getName() + " as CQL2 text");
		};
	}

	private static int precedence(Expression e) {
		return switch (e) {
		case Or or -> 1;
		case And and -> 2;
		case Not not -> 3;
		default -> 4;
		};
	}

	/**
	 * A logical operand binding as weakly as its parent or weaker is parenthesised, so that
	 * the text parses back into the same tree: (a AND b) AND c stays nested, NOT (NOT a) valid.
	 */
	private static String operand(Expression e, int parentPrecedence) {
		String text = write(e);
		return precedence(e) < 4 && precedence(e) <= parentPrecedence ? "(" + text + ")" : text;
	}

	private static String join(List<Expression> args, String separator, int precedence) {
		return args.stream().map(a -> operand(a, precedence)).collect(Collectors.joining(separator));
	}

	private static String binary(Operation operation, String operator) {
		return write(arg(operation, 0)) + operator + write(arg(operation, 1));
	}

	private static Expression arg(Operation operation, int index) {
		if (operation.getArgs().size() <= index) {
			throw new IllegalArgumentException(operation.eClass().getName() + " needs " + (index + 1) + " arguments");
		}
		return operation.getArgs().get(index);
	}

	private static String property(String name) {
		return IDENTIFIER.matcher(name).matches() && !KEYWORDS.contains(name.toUpperCase(Locale.ROOT)) ? name
				: "\"" + name + "\"";
	}

	private static String number(double value) {
		// BigDecimal has no negative zero; keep it, -0.0 and 0.0 are different doubles
		String plain = BigDecimal.valueOf(value).stripTrailingZeros().toPlainString();
		return value == 0 && 1 / value < 0 ? "-" + plain : plain;
	}

	// ------------------------------------------------------------------- WKT

	static String wkt(Geometry geometry) {
		return switch (geometry) {
		case Point p -> "POINT(" + position(p.getCoordinates()) + ")";
		case MultiPoint mp -> "MULTIPOINT(" + mp.getCoordinates().stream().map(c -> "(" + position(c) + ")")
				.collect(Collectors.joining(", ")) + ")";
		case LineString l -> "LINESTRING" + positions(l.getCoordinates());
		case MultiLineString ml -> "MULTILINESTRING(" + ml.getLinesStrings().stream().map(l -> positions(l.getCoordinates()))
				.collect(Collectors.joining(", ")) + ")";
		case Polygon p -> "POLYGON" + polygon(p);
		case MultiPolygon mp -> "MULTIPOLYGON(" + mp.getPolygons().stream().map(TextWriter::polygon)
				.collect(Collectors.joining(", ")) + ")";
		case GeometryCollection gc -> "GEOMETRYCOLLECTION(" + gc.getGeometries().stream().map(TextWriter::wkt)
				.collect(Collectors.joining(", ")) + ")";
		default -> throw new IllegalArgumentException("Unsupported geometry " + geometry.eClass().getName());
		};
	}

	private static String polygon(SimplePolygon polygon) {
		StringBuilder text = new StringBuilder("(").append(positions(polygon.getExteriorRing().getCoordinates()));
		for (Ring hole : polygon.getInteriorHoles()) {
			text.append(", ").append(positions(hole.getCoordinates()));
		}
		return text.append(")").toString();
	}

	private static String positions(List<Coordinates> coordinates) {
		return "(" + coordinates.stream().map(TextWriter::position).collect(Collectors.joining(", ")) + ")";
	}

	private static String position(Coordinates c) {
		String xy = number(c.getLongitude()) + " " + number(c.getLatitude());
		return c.eIsSet(GeoJsonPackage.Literals.COORDINATES__ELEVATION) ? xy + " " + number(c.getElevation()) : xy;
	}
}
