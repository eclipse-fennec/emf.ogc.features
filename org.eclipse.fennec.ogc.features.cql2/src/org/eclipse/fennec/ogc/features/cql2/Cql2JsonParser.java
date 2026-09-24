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

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

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
import org.eclipse.fennec.ogc.features.cql2.Cql2.Predicate;
import org.eclipse.fennec.ogc.features.cql2.Cql2.Property;
import org.eclipse.fennec.ogc.features.cql2.Cql2.Spatial;
import org.eclipse.fennec.ogc.features.geo.JtsGeometries;
import org.eclipse.fennec.ogc.features.geo.SpatialRelation;
import org.locationtech.jts.geom.Coordinate;
import org.locationtech.jts.geom.Envelope;
import org.locationtech.jts.geom.Geometry;
import org.locationtech.jts.geom.GeometryFactory;
import org.locationtech.jts.geom.LineString;
import org.locationtech.jts.geom.LinearRing;
import org.locationtech.jts.geom.Polygon;

import tools.jackson.core.JacksonException;
import tools.jackson.databind.JsonNode;
import tools.jackson.databind.json.JsonMapper;

/**
 * Parses the CQL2 JSON encoding into the same syntax tree as {@link Cql2TextParser}.
 * Geometry literals are GeoJSON geometries or {@code {"bbox": [...]}}.
 */
public final class Cql2JsonParser {

	private static final JsonMapper MAPPER = JsonMapper.builder().build();
	private static final GeometryFactory FACTORY = JtsGeometries.factory();

	private Cql2JsonParser() {
	}

	/**
	 * @param json a CQL2 JSON filter
	 * @return its syntax tree
	 * @throws IllegalArgumentException if the JSON is no valid CQL2
	 */
	public static Predicate parse(String json) {
		JsonNode root;
		try {
			root = MAPPER.readTree(json);
		} catch (JacksonException e) {
			throw new IllegalArgumentException("Invalid JSON: " + e.getOriginalMessage(), e);
		}
		return predicate(root);
	}

	private static Predicate predicate(JsonNode node) {
		if (node.isBoolean()) {
			return new BooleanValue(node.booleanValue());
		}
		if (!node.isObject() || !node.has("op")) {
			throw new IllegalArgumentException("Expected an operation object with 'op': " + node);
		}
		String op = node.path("op").asString().toLowerCase(Locale.ROOT);
		JsonNode args = node.path("args");
		if (!args.isArray()) {
			throw new IllegalArgumentException("Operation " + op + " needs an 'args' array");
		}
		switch (op) {
		case "and":
		case "or": {
			List<Predicate> operands = new ArrayList<>();
			for (JsonNode arg : args) {
				operands.add(predicate(arg));
			}
			if (operands.size() < 2) {
				throw new IllegalArgumentException(op + " needs at least two arguments");
			}
			return op.equals("and") ? new And(operands) : new Or(operands);
		}
		case "not":
			arity(op, args, 1);
			return new Not(predicate(args.get(0)));
		case "=", "<>", "<", "<=", ">", ">=":
			arity(op, args, 2);
			return new Comparison(Operator.ofSymbol(op), scalar(args.get(0)), scalar(args.get(1)));
		case "isnull":
			arity(op, args, 1);
			return new IsNull(scalar(args.get(0)));
		case "like": {
			arity(op, args, 2);
			Operand pattern = scalar(args.get(1));
			if (!(pattern instanceof Literal literal) || !(literal.value() instanceof String s)) {
				throw new IllegalArgumentException("like needs a string pattern");
			}
			return new Like(scalar(args.get(0)), s);
		}
		case "between":
			arity(op, args, 3);
			return new Between(scalar(args.get(0)), literal(args.get(1)), literal(args.get(2)));
		case "in": {
			arity(op, args, 2);
			if (!args.get(1).isArray()) {
				throw new IllegalArgumentException("in needs an array of values");
			}
			List<Literal> values = new ArrayList<>();
			for (JsonNode value : args.get(1)) {
				values.add(literal(value));
			}
			return new In(scalar(args.get(0)), values);
		}
		default:
			SpatialRelation relation = SpatialRelation.ofCql2Name(op)
					.orElseThrow(() -> new IllegalArgumentException("Unsupported operation " + op));
			arity(op, args, 2);
			return new Spatial(relation, geometryOperand(args.get(0)), geometryOperand(args.get(1)));
		}
	}

	private static Operand scalar(JsonNode node) {
		if (node.isObject()) {
			if (node.has("property")) {
				return new Property(node.path("property").asString());
			}
			if (node.has("timestamp")) {
				return new Literal(Cql2TextParser.timestamp(node.path("timestamp").asString()));
			}
			if (node.has("date")) {
				return new Literal(Cql2TextParser.date(node.path("date").asString()));
			}
			throw new IllegalArgumentException("Unsupported operand " + node);
		}
		return literal(node);
	}

	private static Literal literal(JsonNode node) {
		if (node.isString()) {
			return new Literal(node.asString());
		}
		if (node.isIntegralNumber()) {
			return new Literal(node.longValue());
		}
		if (node.isNumber()) {
			return new Literal(node.doubleValue());
		}
		if (node.isBoolean()) {
			return new Literal(node.booleanValue());
		}
		if (node.isObject() && (node.has("timestamp") || node.has("date"))) {
			return (Literal) scalar(node);
		}
		throw new IllegalArgumentException("Expected a literal: " + node);
	}

	private static Operand geometryOperand(JsonNode node) {
		if (node.isObject() && node.has("property")) {
			return new Property(node.path("property").asString());
		}
		if (node.isObject() && node.has("bbox")) {
			JsonNode bbox = node.path("bbox");
			int n = bbox.size();
			if (n != 4 && n != 6) {
				throw new IllegalArgumentException("bbox needs 4 or 6 numbers");
			}
			double minX = bbox.get(0).doubleValue();
			double minY = bbox.get(1).doubleValue();
			double maxX = bbox.get(n == 4 ? 2 : 3).doubleValue();
			double maxY = bbox.get(n == 4 ? 3 : 4).doubleValue();
			return new GeometryLiteral(FACTORY.toGeometry(new Envelope(minX, maxX, minY, maxY)));
		}
		if (node.isObject() && node.has("type")) {
			return new GeometryLiteral(geometry(node));
		}
		throw new IllegalArgumentException("Expected a geometry property, a GeoJSON geometry or a bbox: " + node);
	}

	private static Geometry geometry(JsonNode node) {
		String type = node.path("type").asString();
		JsonNode c = node.path("coordinates");
		return switch (type) {
		case "Point" -> FACTORY.createPoint(coordinate(c));
		case "MultiPoint" -> FACTORY.createMultiPointFromCoords(coordinates(c));
		case "LineString" -> FACTORY.createLineString(coordinates(c));
		case "MultiLineString" -> {
			List<LineString> lines = new ArrayList<>();
			c.forEach(l -> lines.add(FACTORY.createLineString(coordinates(l))));
			yield FACTORY.createMultiLineString(lines.toArray(LineString[]::new));
		}
		case "Polygon" -> polygon(c);
		case "MultiPolygon" -> {
			List<Polygon> polygons = new ArrayList<>();
			c.forEach(p -> polygons.add(polygon(p)));
			yield FACTORY.createMultiPolygon(polygons.toArray(Polygon[]::new));
		}
		case "GeometryCollection" -> {
			List<Geometry> members = new ArrayList<>();
			node.path("geometries").forEach(g -> members.add(geometry(g)));
			yield FACTORY.createGeometryCollection(members.toArray(Geometry[]::new));
		}
		default -> throw new IllegalArgumentException("Unsupported GeoJSON geometry type " + type);
		};
	}

	private static Polygon polygon(JsonNode rings) {
		if (rings.isEmpty()) {
			return FACTORY.createPolygon();
		}
		LinearRing shell = FACTORY.createLinearRing(coordinates(rings.get(0)));
		LinearRing[] holes = new LinearRing[rings.size() - 1];
		for (int i = 1; i < rings.size(); i++) {
			holes[i - 1] = FACTORY.createLinearRing(coordinates(rings.get(i)));
		}
		return FACTORY.createPolygon(shell, holes);
	}

	private static Coordinate[] coordinates(JsonNode positions) {
		Coordinate[] result = new Coordinate[positions.size()];
		for (int i = 0; i < result.length; i++) {
			result[i] = coordinate(positions.get(i));
		}
		return result;
	}

	private static Coordinate coordinate(JsonNode position) {
		if (!position.isArray() || position.size() < 2) {
			throw new IllegalArgumentException("A position needs at least two numbers: " + position);
		}
		return new Coordinate(position.get(0).doubleValue(), position.get(1).doubleValue());
	}

	private static void arity(String op, JsonNode args, int n) {
		if (args.size() != n) {
			throw new IllegalArgumentException(op + " needs " + n + " argument(s)");
		}
	}
}
