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
import java.util.function.Consumer;

import org.eclipse.fennec.ogc.features.api.Envelope;
import org.geojson.Coordinates;
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

/**
 * Helpers for the GeoJSON EMF geometries of {@code org.geojson.model}.
 */
public final class Geometries {

	private Geometries() {
	}

	/**
	 * @param geometry a geometry, may be {@code null}
	 * @return the envelope of all its coordinates, {@code null} for {@code null} or an empty geometry
	 */
	public static Envelope envelope(Geometry geometry) {
		if (geometry == null) {
			return null;
		}
		double[] box = { Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY,
				Double.NEGATIVE_INFINITY, Double.NEGATIVE_INFINITY };
		forEachCoordinate(geometry, c -> {
			box[0] = Math.min(box[0], c.getLongitude());
			box[1] = Math.min(box[1], c.getLatitude());
			box[2] = Math.max(box[2], c.getLongitude());
			box[3] = Math.max(box[3], c.getLatitude());
		});
		return box[0] > box[2] ? null : new Envelope(box[0], box[1], box[2], box[3]);
	}

	/**
	 * Visits all coordinates of a geometry, including those of polygon holes and collection members.
	 *
	 * @param geometry the geometry
	 * @param visitor the visitor
	 * @throws IllegalArgumentException for an unknown geometry type
	 */
	public static void forEachCoordinate(Geometry geometry, Consumer<Coordinates> visitor) {
		switch (geometry) {
		case Point p -> visit(p.getCoordinates(), visitor);
		case MultiPoint mp -> mp.getCoordinates().forEach(c -> visit(c, visitor));
		case LineString ls -> ls.getCoordinates().forEach(c -> visit(c, visitor));
		case MultiLineString mls -> mls.getLinesStrings().forEach(l -> visitLine(l, visitor));
		case Polygon pg -> visitPolygon(pg, visitor);
		case MultiPolygon mpg -> mpg.getPolygons().forEach(p -> visitPolygon(p, visitor));
		case GeometryCollection gc -> gc.getGeometries().forEach(g -> forEachCoordinate(g, visitor));
		default -> throw new IllegalArgumentException("Unsupported geometry type " + geometry.eClass().getName());
		}
	}

	/**
	 * @param geometry the geometry
	 * @return the GeoJSON type name, e.g. {@code Polygon}
	 */
	public static String typeName(Geometry geometry) {
		return geometry.eClass().getName();
	}

	private static void visitLine(SimpleLineString line, Consumer<Coordinates> visitor) {
		line.getCoordinates().forEach(c -> visit(c, visitor));
	}

	private static void visitPolygon(SimplePolygon polygon, Consumer<Coordinates> visitor) {
		visitRing(polygon.getExteriorRing(), visitor);
		polygon.getInteriorHoles().forEach(h -> visitRing(h, visitor));
	}

	private static void visitRing(Ring ring, Consumer<Coordinates> visitor) {
		if (ring != null) {
			List<Coordinates> coordinates = ring.getCoordinates();
			coordinates.forEach(c -> visit(c, visitor));
		}
	}

	private static void visit(Coordinates coordinates, Consumer<Coordinates> visitor) {
		if (coordinates != null) {
			visitor.accept(coordinates);
		}
	}
}
