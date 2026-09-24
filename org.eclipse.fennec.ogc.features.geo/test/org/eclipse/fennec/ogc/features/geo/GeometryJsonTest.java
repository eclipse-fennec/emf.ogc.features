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

import static org.assertj.core.api.Assertions.assertThat;
import static org.eclipse.fennec.ogc.features.geo.TestGeometries.box;
import static org.eclipse.fennec.ogc.features.geo.TestGeometries.line;
import static org.eclipse.fennec.ogc.features.geo.TestGeometries.point;
import static org.eclipse.fennec.ogc.features.geo.TestGeometries.withHole;

import java.io.StringWriter;

import org.geojson.Geometry;
import org.geojson.Point;
import org.junit.jupiter.api.Test;

import tools.jackson.core.JsonGenerator;
import tools.jackson.databind.json.JsonMapper;

class GeometryJsonTest {

	private static String json(Geometry geometry) {
		StringWriter out = new StringWriter();
		try (JsonGenerator generator = JsonMapper.builder().build().createGenerator(out)) {
			GeometryJson.write(generator, geometry);
		}
		return out.toString();
	}

	@Test
	void pointGeometry() {
		assertThat(json(point(11.5, 50.9))).isEqualTo("{\"type\":\"Point\",\"coordinates\":[11.5,50.9]}");
	}

	@Test
	void pointWithElevation() {
		Point p = point(1, 2);
		p.getCoordinates().setElevation(3);
		assertThat(json(p)).isEqualTo("{\"type\":\"Point\",\"coordinates\":[1.0,2.0,3.0]}");
	}

	@Test
	void lineString() {
		assertThat(json(line(0, 0, 1, 1))).isEqualTo("{\"type\":\"LineString\",\"coordinates\":[[0.0,0.0],[1.0,1.0]]}");
	}

	@Test
	void polygonWithHole() {
		assertThat(json(withHole(box(0, 0, 4, 4), 1, 1, 2, 1, 2, 2)))
				.isEqualTo("{\"type\":\"Polygon\",\"coordinates\":[[[0.0,0.0],[4.0,0.0],[4.0,4.0],[0.0,4.0],[0.0,0.0]],"
						+ "[[1.0,1.0],[2.0,1.0],[2.0,2.0],[1.0,1.0]]]}");
	}

	@Test
	void nullGeometry() {
		assertThat(json(null)).isEqualTo("null");
	}
}
