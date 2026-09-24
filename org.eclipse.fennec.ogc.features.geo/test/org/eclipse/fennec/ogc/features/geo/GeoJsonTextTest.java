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
import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.eclipse.fennec.ogc.features.geo.TestGeometries.box;
import static org.eclipse.fennec.ogc.features.geo.TestGeometries.line;
import static org.eclipse.fennec.ogc.features.geo.TestGeometries.point;
import static org.eclipse.fennec.ogc.features.geo.TestGeometries.withHole;

import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.fennec.codec.geojson.GeoJsonResourceFactoryImpl;
import org.eclipse.fennec.codec.util.MetadataServiceFactory;
import org.eclipse.fennec.emf.osgi.metadata.MetadataWhiteboard;
import org.eclipse.fennec.ogc.features.geo.internal.GeoJsonTypeConverter;
import org.geojson.GeoJsonPackage;
import org.geojson.Geometry;
import org.geojson.LineString;
import org.geojson.Point;
import org.geojson.Polygon;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class GeoJsonTextTest {

	private GeoJsonResourceFactoryImpl factory;
	private GeoJsonText text;

	@BeforeEach
	void setUp() {
		MetadataWhiteboard metadata = MetadataServiceFactory.create();
		metadata.registerPackage(GeoJsonPackage.eINSTANCE);
		factory = new GeoJsonResourceFactoryImpl(metadata);
		text = new GeoJsonText(factory);
	}

	@Test
	void pointRoundTrip() {
		String json = text.write(point(11.5812, 50.9271));
		assertThat(json).contains("\"Point\"").contains("11.5812");
		Geometry read = text.read(json);
		assertThat(read).isInstanceOf(Point.class);
		assertThat(((Point) read).getCoordinates().getLongitude()).isEqualTo(11.5812);
		assertThat(((Point) read).getCoordinates().getLatitude()).isEqualTo(50.9271);
	}

	@Test
	void polygonWithHoleRoundTrip() {
		Polygon donut = withHole(box(0, 0, 10, 10), 4, 4, 6, 4, 6, 6, 4, 6);
		Geometry read = text.read(text.write(donut));
		assertThat(read).isInstanceOf(Polygon.class);
		assertThat(JtsGeometries.toJts(read).equalsExact(JtsGeometries.toJts(donut))).isTrue();
	}

	@Test
	void lineRoundTrip() {
		LineString slide = line(11.58, 50.92, 11.581, 50.921, 11.582, 50.9205);
		Geometry read = text.read(text.write(slide));
		assertThat(JtsGeometries.toJts(read).equalsExact(JtsGeometries.toJts(slide))).isTrue();
	}

	@Test
	void writeLeavesGeometryUncontained() {
		Point p = point(1, 2);
		text.write(p);
		assertThat(p.eResource()).isNull();
	}

	@Test
	void invalidTextIsRejected() {
		assertThatThrownBy(() -> text.read("{\"type\":")).isInstanceOf(IllegalArgumentException.class);
		assertThat(text.read("  ")).isNull();
	}

	@Test
	void converterHandlesGeometryDataTypes() {
		GeoJsonTypeConverter converter = new GeoJsonTypeConverter(factory);
		EDataType geometryType = EcoreFactory.eINSTANCE.createEDataType();
		geometryType.setInstanceClass(Geometry.class);
		assertThat(converter.isConverterForType(geometryType)).isTrue();
		assertThat(converter.isConverterForType(EcorePackage.Literals.ESTRING)).isFalse();

		Object stored = converter.convertEMFToValue(geometryType, point(3, 4));
		assertThat(stored).isInstanceOf(String.class);
		Object loaded = converter.convertValueToEMF(geometryType, stored);
		assertThat(loaded).isInstanceOf(Point.class);
		assertThat(converter.convertValueToEMF(geometryType, null)).isNull();
	}
}
