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
package org.eclipse.fennec.ogc.features.cql2;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.Set;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.fennec.codec.geojson.GeoJsonResourceFactoryImpl;
import org.eclipse.fennec.ogc.features.api.CollectionDescriptor;
import org.eclipse.fennec.ogc.features.api.FeatureFilter;
import org.eclipse.fennec.ogc.features.api.FeatureQuery;
import org.eclipse.fennec.ogc.features.example.bath.BathPackage;
import org.eclipse.fennec.ogc.features.geo.GeoJsonFeatureImporter;
import org.eclipse.fennec.ogc.features.geo.GeoJsonText;
import org.eclipse.fennec.ogc.features.source.MemoryFeatureSource;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class Cql2TranslatorTest {

	private static final String OUTDOOR = "BBOX(11.6166,50.9051,11.6178,50.9054)";

	private static MemoryFeatureSource source;
	private static CollectionDescriptor pools;
	private static CollectionDescriptor assets;

	@BeforeAll
	static void setUp() throws Exception {
		List<EObject> data;
		try (InputStream in = Files.newInputStream(Path.of("../org.eclipse.fennec.ogc.features.example.bath.demo/data/bath.geojson"))) {
			data = new GeoJsonFeatureImporter(new GeoJsonText(new GeoJsonResourceFactoryImpl()), BathPackage.eINSTANCE,
					"assetType").read(in);
		}
		source = new MemoryFeatureSource(Set.of(BathPackage.eNS_URI), () -> data);
		pools = CollectionDescriptor.of(BathPackage.Literals.POOL).orElseThrow();
		assets = CollectionDescriptor.of(BathPackage.Literals.ASSET).orElseThrow();
	}

	private static List<String> ids(CollectionDescriptor collection, String cql2) {
		FeatureFilter filter = Cql2Translator.translate(Cql2TextParser.parse(cql2), collection);
		return source.query(filter.applyTo(FeatureQuery.builder(collection)).build()).features().stream()
				.map(o -> (String) o.eGet(BathPackage.Literals.ASSET__ID)).toList();
	}

	@Test
	void comparisons() {
		assertThat(ids(pools, "poolType = 'WAVE'")).containsExactly("pool-wave");
		assertThat(ids(pools, "waterTemperature >= 30 AND lanes = 0")).containsExactly("pool-kids", "pool-learn", "pool-whirl");
		assertThat(ids(pools, "30 <= waterTemperature AND lanes = 0")).containsExactly("pool-kids", "pool-learn", "pool-whirl");
		assertThat(ids(pools, "depthMin = depthMax")).containsExactly("pool-whirl");
	}

	@Test
	void advancedComparison() {
		assertThat(ids(pools, "name LIKE 'Frei%'")).containsExactly("pool-outdoor");
		assertThat(ids(pools, "depthMax BETWEEN 1.9 AND 2.1")).containsExactly("pool-outdoor", "pool-sport", "pool-wave");
		assertThat(ids(pools, "poolType IN ('KIDS', 'WHIRLPOOL')")).containsExactly("pool-kids", "pool-whirl");
		assertThat(ids(pools, "description IS NOT NULL")).containsExactly("pool-diving", "pool-wave");
	}

	@Test
	void temporal() {
		assertThat(ids(assets, "lastInspection < TIMESTAMP('2026-01-01T00:00:00Z')")).containsExactly("pool-diving");
		assertThat(ids(assets, "lastInspection = DATE('2026-09-01')")).containsExactly("pool-sport");
	}

	@Test
	void notIsPushedWhenExact() {
		FeatureFilter filter = Cql2Translator.translate(Cql2TextParser.parse("NOT status = 'OPEN'"), assets);
		assertThat(filter.residual()).isNull();
		assertThat(ids(assets, "NOT status = 'OPEN'")).containsExactly("pool-diving", "sauna-infrared");
	}

	@Test
	void spatialSplitsIntoEnvelopeAndExactTest() {
		FeatureFilter filter = Cql2Translator.translate(Cql2TextParser.parse("S_INTERSECTS(geometry, " + OUTDOOR + ")"), pools);
		assertThat(filter.store()).isNotNull();
		assertThat(filter.residual()).isNotNull();
		assertThat(ids(pools, "S_INTERSECTS(geometry, " + OUTDOOR + ")")).containsExactly("pool-diving", "pool-outdoor");
		assertThat(ids(pools, "S_INTERSECTS(geometry, POINT(11.6160969 50.9061409))")).containsExactly("pool-wave");
		assertThat(ids(pools, "S_CONTAINS(geometry, POINT(11.6160969 50.9061409))")).containsExactly("pool-wave");
		assertThat(ids(pools, "S_WITHIN(POINT(11.6160969 50.9061409), geometry)")).containsExactly("pool-wave");
	}

	@Test
	void exactTestRemovesEnvelopeHits() {
		// inside the envelope of the tornado slide, but not on its line
		assertThat(ids(CollectionDescriptor.of(BathPackage.Literals.SLIDE).orElseThrow(),
				"S_INTERSECTS(geometry, POINT(11.6166952 50.90553))")).isEmpty();
	}

	@Test
	void orMixesStoreAndResidual() {
		assertThat(ids(pools, "poolType = 'KIDS' OR S_INTERSECTS(geometry, " + OUTDOOR + ")"))
				.containsExactly("pool-diving", "pool-kids", "pool-outdoor");
		assertThat(ids(pools, "NOT S_INTERSECTS(geometry, " + OUTDOOR + ") AND lanes > 0")).containsExactly("pool-sport");
		assertThat(ids(pools, "S_DISJOINT(geometry, " + OUTDOOR + ") AND poolType = 'DIVING'")).isEmpty();
	}

	@Test
	void jsonAndTextAgree() {
		FeatureFilter json = Cql2Translator.translate(Cql2JsonParser.parse("""
				{"op":"or","args":[{"op":"=","args":[{"property":"poolType"},"KIDS"]},
				 {"op":"s_intersects","args":[{"property":"geometry"},{"bbox":[11.6166,50.9051,11.6178,50.9054]}]}]}"""),
				pools);
		assertThat(source.query(json.applyTo(FeatureQuery.builder(pools)).build()).features()).hasSize(3);
	}

	@Test
	void errors() {
		assertThatThrownBy(() -> ids(pools, "colour = 'red'")).hasMessageContaining("Unknown queryable");
		assertThatThrownBy(() -> ids(pools, "poolType = 'SEA'")).hasMessageContaining("no value");
		assertThatThrownBy(() -> ids(pools, "lanes = 'many'")).hasMessageContaining("does not fit");
		assertThatThrownBy(() -> ids(pools, "S_INTERSECTS(name, POINT(1 2))")).hasMessageContaining("not the geometry");
		assertThatThrownBy(() -> ids(pools, "minX > 1")).hasMessageContaining("Unknown queryable");
	}
}
