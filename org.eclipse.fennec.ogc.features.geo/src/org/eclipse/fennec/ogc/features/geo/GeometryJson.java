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
package org.eclipse.fennec.ogc.features.geo;

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
import org.geojson.Ring;
import org.geojson.SimpleLineString;
import org.geojson.SimplePolygon;

import tools.jackson.core.JsonGenerator;

/**
 * Streams a GeoJSON EMF geometry as RFC 7946 GeoJSON. A coordinate carries its elevation
 * only if one was set.
 */
public final class GeometryJson {

	private GeometryJson() {
	}

	/**
	 * Writes the geometry as JSON object, or {@code null} for {@code null}.
	 *
	 * @param generator the generator, positioned where a value is expected
	 * @param geometry the geometry, may be {@code null}
	 */
	public static void write(JsonGenerator generator, Geometry geometry) {
		if (geometry == null) {
			generator.writeNull();
			return;
		}
		generator.writeStartObject();
		generator.writeStringProperty("type", Geometries.typeName(geometry));
		switch (geometry) {
		case Point p -> {
			generator.writeName("coordinates");
			position(generator, p.getCoordinates());
		}
		case MultiPoint mp -> {
			generator.writeName("coordinates");
			positions(generator, mp.getCoordinates());
		}
		case LineString ls -> {
			generator.writeName("coordinates");
			positions(generator, ls.getCoordinates());
		}
		case MultiLineString mls -> {
			generator.writeArrayPropertyStart("coordinates");
			for (SimpleLineString line : mls.getLinesStrings()) {
				positions(generator, line.getCoordinates());
			}
			generator.writeEndArray();
		}
		case Polygon pg -> {
			generator.writeName("coordinates");
			polygon(generator, pg);
		}
		case MultiPolygon mpg -> {
			generator.writeArrayPropertyStart("coordinates");
			for (SimplePolygon polygon : mpg.getPolygons()) {
				polygon(generator, polygon);
			}
			generator.writeEndArray();
		}
		case GeometryCollection gc -> {
			generator.writeArrayPropertyStart("geometries");
			for (Geometry member : gc.getGeometries()) {
				write(generator, member);
			}
			generator.writeEndArray();
		}
		default -> throw new IllegalArgumentException("Unsupported geometry type " + geometry.eClass().getName());
		}
		generator.writeEndObject();
	}

	private static void polygon(JsonGenerator generator, SimplePolygon polygon) {
		generator.writeStartArray();
		ring(generator, polygon.getExteriorRing());
		for (Ring hole : polygon.getInteriorHoles()) {
			ring(generator, hole);
		}
		generator.writeEndArray();
	}

	private static void ring(JsonGenerator generator, Ring ring) {
		if (ring == null) {
			generator.writeStartArray();
			generator.writeEndArray();
		} else {
			positions(generator, ring.getCoordinates());
		}
	}

	private static void positions(JsonGenerator generator, List<Coordinates> coordinates) {
		generator.writeStartArray();
		for (Coordinates c : coordinates) {
			position(generator, c);
		}
		generator.writeEndArray();
	}

	private static void position(JsonGenerator generator, Coordinates c) {
		generator.writeStartArray();
		generator.writeNumber(c.getLongitude());
		generator.writeNumber(c.getLatitude());
		if (c.eIsSet(GeoJsonPackage.Literals.COORDINATES__ELEVATION)) {
			generator.writeNumber(c.getElevation());
		}
		generator.writeEndArray();
	}
}
