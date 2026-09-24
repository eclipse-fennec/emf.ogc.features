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

import org.eclipse.fennec.ogc.features.api.Envelope;
import org.geojson.Coordinates;
import org.geojson.GeometryCollection;
import org.geojson.LineString;
import org.geojson.MultiLineString;
import org.geojson.MultiPoint;
import org.geojson.MultiPolygon;
import org.geojson.Point;
import org.geojson.Polygon;
import org.geojson.Ring;
import org.geojson.SimplePolygon;
import org.locationtech.jts.geom.Coordinate;
import org.locationtech.jts.geom.Geometry;
import org.locationtech.jts.geom.GeometryFactory;
import org.locationtech.jts.geom.LinearRing;
import org.locationtech.jts.geom.PrecisionModel;

/**
 * Converts GeoJSON EMF geometries into JTS geometries, the form the spatial relations are
 * evaluated in. Coordinates are CRS84: x = longitude, y = latitude.
 */
public final class JtsGeometries {

	/** SRID of CRS84 as far as JTS is concerned; it does no reprojection anyway */
	public static final int CRS84_SRID = 4326;

	private static final GeometryFactory FACTORY = new GeometryFactory(new PrecisionModel(), CRS84_SRID);

	private JtsGeometries() {
	}

	/**
	 * @return the factory all geometries of this class are created with
	 */
	public static GeometryFactory factory() {
		return FACTORY;
	}

	/**
	 * @param geometry the GeoJSON EMF geometry
	 * @return the JTS geometry
	 * @throws IllegalArgumentException for an unknown geometry type
	 */
	public static Geometry toJts(org.geojson.Geometry geometry) {
		return switch (geometry) {
		case Point p -> FACTORY.createPoint(coordinate(p.getCoordinates()));
		case MultiPoint mp -> FACTORY.createMultiPointFromCoords(coordinates(mp.getCoordinates()));
		case LineString ls -> FACTORY.createLineString(coordinates(ls.getCoordinates()));
		case MultiLineString mls -> FACTORY.createMultiLineString(mls.getLinesStrings().stream()
				.map(l -> FACTORY.createLineString(coordinates(l.getCoordinates())))
				.toArray(org.locationtech.jts.geom.LineString[]::new));
		case Polygon pg -> polygon(pg);
		case MultiPolygon mpg -> FACTORY.createMultiPolygon(mpg.getPolygons().stream()
				.map(JtsGeometries::polygon)
				.toArray(org.locationtech.jts.geom.Polygon[]::new));
		case GeometryCollection gc -> FACTORY.createGeometryCollection(gc.getGeometries().stream()
				.map(JtsGeometries::toJts)
				.toArray(Geometry[]::new));
		default -> throw new IllegalArgumentException("Unsupported geometry type " + geometry.eClass().getName());
		};
	}

	/**
	 * @param envelope an envelope
	 * @return the envelope as polygon, or as point if it has no extent
	 */
	public static Geometry toJts(Envelope envelope) {
		if (envelope.isPoint()) {
			return FACTORY.createPoint(new Coordinate(envelope.minX(), envelope.minY()));
		}
		return FACTORY.toGeometry(new org.locationtech.jts.geom.Envelope(
				envelope.minX(), envelope.maxX(), envelope.minY(), envelope.maxY()));
	}

	/**
	 * @param geometry a JTS geometry
	 * @return its envelope, {@code null} if the geometry is empty
	 */
	public static Envelope envelope(Geometry geometry) {
		if (geometry.isEmpty()) {
			return null;
		}
		org.locationtech.jts.geom.Envelope e = geometry.getEnvelopeInternal();
		return new Envelope(e.getMinX(), e.getMinY(), e.getMaxX(), e.getMaxY());
	}

	private static org.locationtech.jts.geom.Polygon polygon(SimplePolygon polygon) {
		LinearRing shell = ring(polygon.getExteriorRing());
		LinearRing[] holes = polygon.getInteriorHoles().stream()
				.map(JtsGeometries::ring)
				.toArray(LinearRing[]::new);
		return FACTORY.createPolygon(shell, holes);
	}

	private static LinearRing ring(Ring ring) {
		if (ring == null) {
			return FACTORY.createLinearRing();
		}
		return FACTORY.createLinearRing(coordinates(ring.getCoordinates()));
	}

	private static Coordinate[] coordinates(List<Coordinates> coordinates) {
		return coordinates.stream().map(JtsGeometries::coordinate).toArray(Coordinate[]::new);
	}

	private static Coordinate coordinate(Coordinates coordinates) {
		return new Coordinate(coordinates.getLongitude(), coordinates.getLatitude());
	}
}
