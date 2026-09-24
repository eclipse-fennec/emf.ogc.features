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

import org.geojson.Coordinates;
import org.geojson.GeoJsonFactory;
import org.geojson.Hole;
import org.geojson.LineString;
import org.geojson.Point;
import org.geojson.Polygon;
import org.geojson.Ring;

/** Builders for GeoJSON EMF geometries in tests. */
final class TestGeometries {

	private static final GeoJsonFactory F = GeoJsonFactory.eINSTANCE;

	private TestGeometries() {
	}

	static Point point(double lon, double lat) {
		Point p = F.createPoint();
		p.setCoordinates(c(lon, lat));
		return p;
	}

	static LineString line(double... lonLat) {
		LineString l = F.createLineString();
		for (int i = 0; i < lonLat.length; i += 2) {
			l.getCoordinates().add(c(lonLat[i], lonLat[i + 1]));
		}
		return l;
	}

	/** a closed polygon; the first point is repeated at the end automatically */
	static Polygon polygon(double... lonLat) {
		Polygon p = F.createPolygon();
		Ring ring = F.createRing();
		fill(ring, lonLat);
		p.setExteriorRing(ring);
		return p;
	}

	static Polygon withHole(Polygon polygon, double... lonLat) {
		Hole hole = F.createHole();
		fill(hole, lonLat);
		polygon.getInteriorHoles().add(hole);
		return polygon;
	}

	static Polygon box(double minX, double minY, double maxX, double maxY) {
		return polygon(minX, minY, maxX, minY, maxX, maxY, minX, maxY);
	}

	private static void fill(Ring ring, double... lonLat) {
		for (int i = 0; i < lonLat.length; i += 2) {
			ring.getCoordinates().add(c(lonLat[i], lonLat[i + 1]));
		}
		ring.getCoordinates().add(c(lonLat[0], lonLat[1]));
	}

	static Coordinates c(double lon, double lat) {
		Coordinates c = F.createCoordinates();
		c.setLongitude(lon);
		c.setLatitude(lat);
		return c;
	}
}
