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
import static org.eclipse.fennec.ogc.features.geo.TestGeometries.polygon;
import static org.eclipse.fennec.ogc.features.geo.TestGeometries.withHole;

import org.eclipse.fennec.ogc.features.api.Envelope;
import org.geojson.GeoJsonFactory;
import org.geojson.GeometryCollection;
import org.junit.jupiter.api.Test;

class GeometriesTest {

	@Test
	void envelopeOfPointHasNoExtent() {
		Envelope e = Geometries.envelope(point(11.58, 50.92));
		assertThat(e).isEqualTo(new Envelope(11.58, 50.92, 11.58, 50.92));
		assertThat(e.isPoint()).isTrue();
	}

	@Test
	void envelopeOfLine() {
		assertThat(Geometries.envelope(line(1, 5, 3, 2, 2, 7))).isEqualTo(new Envelope(1, 2, 3, 7));
	}

	@Test
	void envelopeOfPolygonIncludesHoles() {
		assertThat(Geometries.envelope(withHole(box(0, 0, 10, 10), 2, 2, 3, 2, 3, 3)))
				.isEqualTo(new Envelope(0, 0, 10, 10));
	}

	@Test
	void envelopeOfCollection() {
		GeometryCollection gc = GeoJsonFactory.eINSTANCE.createGeometryCollection();
		gc.getGeometries().add(point(-1, -1));
		gc.getGeometries().add(polygon(0, 0, 4, 0, 4, 4));
		assertThat(Geometries.envelope(gc)).isEqualTo(new Envelope(-1, -1, 4, 4));
	}

	@Test
	void envelopeOfNullAndEmpty() {
		assertThat(Geometries.envelope(null)).isNull();
		assertThat(Geometries.envelope(GeoJsonFactory.eINSTANCE.createLineString())).isNull();
	}
}
