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
import org.junit.jupiter.api.Test;
import org.locationtech.jts.geom.Geometry;

class SpatialRelationTest {

	private static Geometry jts(org.geojson.Geometry g) {
		return JtsGeometries.toJts(g);
	}

	@Test
	void triangleAndBoxWhoseEnvelopesOverlapDoNotIntersect() {
		// the classic case the bbox pre-filter lets through and the exact test removes
		Geometry triangle = jts(polygon(0, 0, 10, 0, 0, 10));
		Geometry corner = JtsGeometries.toJts(new Envelope(8, 8, 9, 9));
		assertThat(JtsGeometries.envelope(triangle).intersects(new Envelope(8, 8, 9, 9))).isTrue();
		assertThat(SpatialRelation.INTERSECTS.test(triangle, corner)).isFalse();
		assertThat(SpatialRelation.DISJOINT.test(triangle, corner)).isTrue();
	}

	@Test
	void pointInHoleIsNotWithinPolygon() {
		Geometry donut = jts(withHole(box(0, 0, 10, 10), 4, 4, 6, 4, 6, 6, 4, 6));
		assertThat(SpatialRelation.WITHIN.test(jts(point(5, 5)), donut)).isFalse();
		assertThat(SpatialRelation.WITHIN.test(jts(point(2, 2)), donut)).isTrue();
		assertThat(SpatialRelation.CONTAINS.test(donut, jts(point(2, 2)))).isTrue();
	}

	@Test
	void lineCrossesPolygon() {
		Geometry square = jts(box(0, 0, 2, 2));
		Geometry slide = jts(line(-1, 1, 3, 1));
		assertThat(SpatialRelation.CROSSES.test(slide, square)).isTrue();
		assertThat(SpatialRelation.INTERSECTS.test(slide, square)).isTrue();
	}

	@Test
	void cql2Names() {
		assertThat(SpatialRelation.ofCql2Name("s_intersects")).contains(SpatialRelation.INTERSECTS);
		assertThat(SpatialRelation.ofCql2Name("S_FOO")).isEmpty();
		assertThat(SpatialRelation.DISJOINT.requiresIntersectingEnvelopes()).isFalse();
	}
}
