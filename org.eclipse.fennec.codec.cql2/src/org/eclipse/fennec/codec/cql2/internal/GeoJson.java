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
import org.geojson.GeoJsonPackage;
import org.geojson.Geometry;
import org.geojson.GeometryCollection;
import org.geojson.LineString;
import org.geojson.MultiLineString;
import org.geojson.MultiPoint;
import org.geojson.MultiPolygon;
import org.geojson.Point;
import org.geojson.Polygon;
import org.geojson.SimplePolygon;

import tools.jackson.core.JsonGenerator;

/**
 * GeoJSON geometries of the CQL2 JSON encoding, written from the GeoJSON EMF model; they are
 * read by the codec. A position keeps an elevation only if it has one.
 */
final class GeoJson {

	private GeoJson() {
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

	private static void polygon(JsonGenerator g, SimplePolygon polygon) {
		g.writeStartArray();
		positions(g, polygon.getExteriorRing().getCoordinates());
		polygon.getInteriorHoles().forEach(h -> positions(g, h.getCoordinates()));
		g.writeEndArray();
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
