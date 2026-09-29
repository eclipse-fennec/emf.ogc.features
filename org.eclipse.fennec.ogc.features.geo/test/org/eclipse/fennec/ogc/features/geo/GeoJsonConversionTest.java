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
import static org.eclipse.fennec.ogc.features.geo.TestGeometries.point;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.fennec.codec.geojson.GeoJsonResourceFactoryImpl;
import org.eclipse.fennec.codec.util.MetadataServiceFactory;
import org.eclipse.fennec.emf.osgi.metadata.MetadataWhiteboard;
import org.geojson.GeoJsonPackage;
import org.geojson.Point;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * The conversion on a dynamic package built in memory: no generated code, the data type
 * names {@code org.geojson.Geometry} and resolves it (here through the test class path, in
 * a framework through the ecore fragment).
 */
class GeoJsonConversionTest {

	private GeoJsonConversion conversion;
	private EDataType geometryType;
	private EClass spot;
	private EAttribute geometry;

	@BeforeEach
	void setUp() {
		MetadataWhiteboard metadata = MetadataServiceFactory.create();
		metadata.registerPackage(GeoJsonPackage.eINSTANCE);
		conversion = new GeoJsonConversion(new GeoJsonText(new GeoJsonResourceFactoryImpl(metadata)));

		EcoreFactory ecore = EcoreFactory.eINSTANCE;
		EPackage spots = ecore.createEPackage();
		spots.setName("spots");
		spots.setNsURI("https://eclipse.org/fennec/ogc/test/spots/1.0");
		geometryType = ecore.createEDataType();
		geometryType.setName("Geometry");
		geometryType.setInstanceClassName("org.geojson.Geometry");
		spots.getEClassifiers().add(geometryType);
		spot = ecore.createEClass();
		spot.setName("Spot");
		geometry = ecore.createEAttribute();
		geometry.setName("geometry");
		geometry.setEType(geometryType);
		spot.getEStructuralFeatures().add(geometry);
		spots.getEClassifiers().add(spot);
	}

	@Test
	void recognisesGeometryDataTypes() {
		assertThat(GeoJsonConversion.isGeometryType(geometryType)).isTrue();
		assertThat(GeoJsonConversion.namesGeometryType(geometryType)).isTrue();
		assertThat(GeoJsonConversion.isGeometryType(EcorePackage.Literals.ESTRING)).isFalse();
		assertThat(GeoJsonConversion.namesGeometryType(EcorePackage.Literals.ESTRING)).isFalse();
		assertThat(GeoJsonConversion.isGeometryType(spot)).isFalse();

		EDataType unresolved = EcoreFactory.eINSTANCE.createEDataType();
		unresolved.setName("Broken");
		unresolved.setInstanceClassName("org.geojson.NoSuchGeometry");
		assertThat(GeoJsonConversion.isGeometryType(unresolved)).isFalse();
		assertThat(GeoJsonConversion.namesGeometryType(unresolved)).isTrue();
	}

	@Test
	void withoutTheConversionTheFactoryCannotParseText() {
		assertThatThrownBy(() -> EcoreUtil.createFromString(geometryType, "{\"type\":\"Point\",\"coordinates\":[1,2]}"))
				.isInstanceOf(RuntimeException.class);
	}

	@Test
	void withTheConversionXmiTextBecomesAGeometryAndBack() {
		((EDataType.Internal) geometryType).setConversionDelegate(conversion);

		Object value = EcoreUtil.createFromString(geometryType, "{\"type\":\"Point\",\"coordinates\":[11.617,50.905]}");
		assertThat(value).isInstanceOf(Point.class);
		assertThat(((Point) value).getCoordinates().getLongitude()).isEqualTo(11.617);

		EObject feature = EcoreUtil.create(spot);
		feature.eSet(geometry, value);
		assertThat(feature.eGet(geometry)).isSameAs(value);

		String text = EcoreUtil.convertToString(geometryType, point(11.617, 50.905));
		assertThat(text).contains("\"Point\"").contains("11.617");
		assertThat(EcoreUtil.convertToString(geometryType, null)).isNull();
		assertThatThrownBy(() -> conversion.convertToString("text")).isInstanceOf(IllegalArgumentException.class);
	}

	@Test
	void aValueThatIsNoGeometryIsStillRejected() {
		((EDataType.Internal) geometryType).setConversionDelegate(conversion);
		EObject feature = EcoreUtil.create(spot);
		assertThatThrownBy(() -> feature.eSet(geometry, "{\"type\":\"Point\",\"coordinates\":[1,2]}"))
				.isInstanceOf(ClassCastException.class);
	}
}
