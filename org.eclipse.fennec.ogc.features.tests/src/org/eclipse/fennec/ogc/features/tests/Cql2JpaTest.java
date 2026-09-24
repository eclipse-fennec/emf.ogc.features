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
package org.eclipse.fennec.ogc.features.tests;

import static org.assertj.core.api.Assertions.assertThat;

import java.io.InputStream;
import java.util.List;
import java.util.Set;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.fennec.ogc.features.api.CollectionDescriptor;
import org.eclipse.fennec.ogc.features.api.FeatureFilter;
import org.eclipse.fennec.ogc.features.api.FeatureQuery;
import org.eclipse.fennec.ogc.features.api.FeatureResult;
import org.eclipse.fennec.ogc.features.api.FeatureSource;
import org.eclipse.fennec.ogc.features.cql2.Cql2TextParser;
import org.eclipse.fennec.ogc.features.cql2.Cql2Translator;
import org.eclipse.fennec.ogc.features.example.bath.BathPackage;
import org.eclipse.fennec.ogc.features.example.bath.demo.BathDataLoader;
import org.eclipse.fennec.ogc.features.geo.GeoJsonFeatureImporter;
import org.eclipse.fennec.ogc.features.geo.GeoJsonText;
import org.eclipse.fennec.ogc.features.source.MemoryFeatureSource;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.osgi.service.condition.Condition;
import org.osgi.test.common.annotation.InjectService;
import org.osgi.test.junit5.context.BundleContextExtension;
import org.osgi.test.junit5.service.ServiceExtension;

/**
 * Every CQL2 construct, translated once, must select the same features from JPA on H2 as
 * from the in-memory reference: this is where the store part meets real SQL.
 */
@ExtendWith(BundleContextExtension.class)
@ExtendWith(ServiceExtension.class)
@BathSetup
class Cql2JpaTest {

	@InjectService(filter = "(osgi.condition.id=" + BathDataLoader.CONDITION_ID + ")", timeout = 30000)
	Condition loaded;

	@InjectService(filter = "(component.name=org.eclipse.fennec.ogc.features.source.repository)", timeout = 10000)
	FeatureSource jpa;

	@InjectService(filter = "(emf.configuratorName=geojson)", timeout = 5000)
	Resource.Factory geoJson;

	private MemoryFeatureSource memory;

	@BeforeEach
	void setUp() throws Exception {
		List<EObject> reference;
		try (InputStream in = BathDataLoader.class.getResourceAsStream("/data/bath.geojson")) {
			reference = new GeoJsonFeatureImporter(new GeoJsonText(geoJson), BathPackage.eINSTANCE, "assetType").read(in);
		}
		memory = new MemoryFeatureSource(Set.of(BathPackage.eNS_URI), () -> reference);
	}

	@ParameterizedTest(name = "{0}: {1}")
	@CsvSource(delimiter = '|', textBlock = """
			pools  | poolType = 'WAVE'
			pools  | waterTemperature >= 30 AND lanes = 0
			pools  | 30 <= waterTemperature
			pools  | depthMin = depthMax
			pools  | name LIKE 'Frei%'
			pools  | depthMax BETWEEN 1.9 AND 2.1
			pools  | poolType IN ('KIDS', 'WHIRLPOOL')
			pools  | description IS NOT NULL
			assets | NOT status = 'OPEN'
			assets | accessible = false OR level = 'UPPER_FLOOR'
			assets | lastInspection < TIMESTAMP('2026-01-01T00:00:00Z')
			assets | lastInspection = DATE('2026-09-01')
			assets | S_INTERSECTS(geometry, BBOX(11.6166,50.9051,11.6178,50.9054))
			pools  | poolType = 'KIDS' OR S_INTERSECTS(geometry, BBOX(11.6166,50.9051,11.6178,50.9054))
			pools  | NOT S_INTERSECTS(geometry, BBOX(11.6166,50.9051,11.6178,50.9054)) AND lanes > 0
			assets | S_INTERSECTS(geometry, POINT(11.6160969 50.9061409))
			assets | S_WITHIN(geometry, POLYGON((11.6150 50.9050, 11.6170 50.9050, 11.6170 50.9058, 11.6150 50.9058, 11.6150 50.9050)))
			""")
	void sameResultAsMemory(String collectionId, String cql2) {
		CollectionDescriptor collection = CollectionDescriptor.of(BathPackage.eINSTANCE).stream()
				.filter(c -> c.id().equals(collectionId)).findFirst().orElseThrow();
		FeatureFilter filter = Cql2Translator.translate(Cql2TextParser.parse(cql2), collection);
		FeatureQuery query = filter.applyTo(FeatureQuery.builder(collection).count(true)).build();
		FeatureResult expected = memory.query(query);
		FeatureResult actual = jpa.query(query);
		assertThat(ids(actual)).containsExactlyElementsOf(ids(expected));
		assertThat(actual.numberMatched()).isEqualTo(expected.numberMatched());
		assertThat(expected.features()).as("the filter must select something").isNotEmpty();
	}

	private static List<String> ids(FeatureResult result) {
		return result.features().stream().map(o -> (String) o.eGet(BathPackage.Literals.ASSET__ID)).toList();
	}
}
