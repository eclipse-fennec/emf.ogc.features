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
package org.eclipse.fennec.ogc.features.source.persistence.internal;

import static org.assertj.core.api.Assertions.assertThat;

import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.fennec.codec.geojson.GeoJsonResourceFactoryImpl;
import org.eclipse.fennec.codec.util.MetadataServiceFactory;
import org.eclipse.fennec.emf.osgi.metadata.MetadataWhiteboard;
import org.geojson.Coordinates;
import org.geojson.GeoJsonFactory;
import org.geojson.GeoJsonPackage;
import org.geojson.Geometry;
import org.geojson.Point;
import org.junit.jupiter.api.Test;

class GeoJsonTypeConverterTest {

	@Test
	void converterHandlesGeometryDataTypes() {
		MetadataWhiteboard metadata = MetadataServiceFactory.create();
		metadata.registerPackage(GeoJsonPackage.eINSTANCE);
		GeoJsonTypeConverter converter = new GeoJsonTypeConverter(new GeoJsonResourceFactoryImpl(metadata));
		EDataType geometryType = EcoreFactory.eINSTANCE.createEDataType();
		geometryType.setInstanceClass(Geometry.class);
		assertThat(converter.isConverterForType(geometryType)).isTrue();
		assertThat(converter.isConverterForType(EcorePackage.Literals.ESTRING)).isFalse();

		Point point = GeoJsonFactory.eINSTANCE.createPoint();
		Coordinates c = GeoJsonFactory.eINSTANCE.createCoordinates();
		c.setLongitude(3);
		c.setLatitude(4);
		point.setCoordinates(c);
		Object stored = converter.convertEMFToValue(geometryType, point);
		assertThat(stored).isInstanceOf(String.class);
		Object loaded = converter.convertValueToEMF(geometryType, stored);
		assertThat(loaded).isInstanceOf(Point.class);
		assertThat(converter.convertValueToEMF(geometryType, null)).isNull();
	}
}
