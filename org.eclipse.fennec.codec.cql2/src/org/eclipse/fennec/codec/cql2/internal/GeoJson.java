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

import java.util.List;

import org.geojson.Coordinates;
import org.geojson.GeoJsonFactory;
import org.geojson.GeoJsonPackage;
import org.geojson.Geometry;
import org.geojson.GeometryCollection;
import org.geojson.Hole;
import org.geojson.LineString;
import org.geojson.MultiLineString;
import org.geojson.MultiPoint;
import org.geojson.MultiPolygon;
import org.geojson.Point;
import org.geojson.Polygon;
import org.geojson.Ring;
import org.geojson.SimpleLineString;
import org.geojson.SimplePolygon;

import tools.jackson.core.JsonGenerator;
import tools.jackson.databind.JsonNode;

/**
 * GeoJSON geometries of the CQL2 JSON encoding, read into and written from the GeoJSON EMF
 * model. A position keeps an elevation only if it has one.
 */
final class GeoJson {

	private static final GeoJsonFactory G = GeoJsonFactory.eINSTANCE;

	private GeoJson() {
	}

	static Geometry read(JsonNode node) {
		String type = node.path("type").asString();
		JsonNode c = node.path("coordinates");
		return switch (type) {
		case "Point" -> {
			Point p = G.createPoint();
			p.setCoordinates(position(c));
			yield p;
		}
		case "MultiPoint" -> {
			MultiPoint mp = G.createMultiPoint();
			c.forEach(pos -> mp.getCoordinates().add(position(pos)));
			yield mp;
		}
		case "LineString" -> {
			LineString l = G.createLineString();
			positions(c, l.getCoordinates());
			yield l;
		}
		case "MultiLineString" -> {
			MultiLineString ml = G.createMultiLineString();
			c.forEach(line -> {
				SimpleLineString l = G.createSimpleLineString();
				positions(line, l.getCoordinates());
				ml.getLinesStrings().add(l);
			});
			yield ml;
		}
		case "Polygon" -> {
			Polygon p = G.createPolygon();
			polygon(c, p);
			yield p;
		}
		case "MultiPolygon" -> {
			MultiPolygon mp = G.createMultiPolygon();
			c.forEach(rings -> {
				SimplePolygon p = G.createSimplePolygon();
				polygon(rings, p);
				mp.getPolygons().add(p);
			});
			yield mp;
		}
		case "GeometryCollection" -> {
			GeometryCollection gc = G.createGeometryCollection();
			node.path("geometries").forEach(g -> gc.getGeometries().add(read(g)));
			yield gc;
		}
		default -> throw new IllegalArgumentException("Unsupported GeoJSON geometry type '" + type + "'");
		};
	}

	static void write(JsonGenerator g, Geometry geometry) {
		g.writeStartObject();
		g.writeStringProperty("type", geometry.eClass().getName());
		switch (geometry) {
		case Point p -> {
			g.writeName("coordinates");
			position(g, p.getCoordinates());
		}
		case MultiPoint mp -> {
			g.writeName("coordinates");
			positions(g, mp.getCoordinates());
		}
		case LineString l -> {
			g.writeName("coordinates");
			positions(g, l.getCoordinates());
		}
		case MultiLineString ml -> {
			g.writeArrayPropertyStart("coordinates");
			ml.getLinesStrings().forEach(l -> positions(g, l.getCoordinates()));
			g.writeEndArray();
		}
		case Polygon p -> {
			g.writeName("coordinates");
			polygon(g, p);
		}
		case MultiPolygon mp -> {
			g.writeArrayPropertyStart("coordinates");
			mp.getPolygons().forEach(p -> polygon(g, p));
			g.writeEndArray();
		}
		case GeometryCollection gc -> {
			g.writeArrayPropertyStart("geometries");
			gc.getGeometries().forEach(member -> write(g, member));
			g.writeEndArray();
		}
		default -> throw new IllegalArgumentException("Unsupported geometry " + geometry.eClass().getName());
		}
		g.writeEndObject();
	}

	private static void polygon(JsonNode rings, SimplePolygon polygon) {
		for (int i = 0; i < rings.size(); i++) {
			Ring ring = i == 0 ? G.createRing() : G.createHole();
			positions(rings.get(i), ring.getCoordinates());
			if (i == 0) {
				polygon.setExteriorRing(ring);
			} else {
				polygon.getInteriorHoles().add((Hole) ring);
			}
		}
	}

	private static void polygon(JsonGenerator g, SimplePolygon polygon) {
		g.writeStartArray();
		positions(g, polygon.getExteriorRing().getCoordinates());
		polygon.getInteriorHoles().forEach(h -> positions(g, h.getCoordinates()));
		g.writeEndArray();
	}

	private static void positions(JsonNode node, List<Coordinates> target) {
		node.forEach(pos -> target.add(position(pos)));
	}

	private static Coordinates position(JsonNode node) {
		if (!node.isArray() || node.size() < 2) {
			throw new IllegalArgumentException("A position needs at least two numbers: " + node);
		}
		Coordinates c = G.createCoordinates();
		c.setLongitude(node.get(0).doubleValue());
		c.setLatitude(node.get(1).doubleValue());
		if (node.size() > 2) {
			c.setElevation(node.get(2).doubleValue());
		}
		return c;
	}

	private static void positions(JsonGenerator g, List<Coordinates> coordinates) {
		g.writeStartArray();
		coordinates.forEach(c -> position(g, c));
		g.writeEndArray();
	}

	private static void position(JsonGenerator g, Coordinates c) {
		g.writeStartArray();
		g.writeNumber(c.getLongitude());
		g.writeNumber(c.getLatitude());
		if (c.eIsSet(GeoJsonPackage.Literals.COORDINATES__ELEVATION)) {
			g.writeNumber(c.getElevation());
		}
		g.writeEndArray();
	}
}
