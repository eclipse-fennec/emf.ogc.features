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
package org.eclipse.fennec.ogc.features.source.persistence;

import static org.assertj.core.api.Assertions.assertThat;

import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.stream.Stream;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.fennec.codec.cql2.Cql2Text;
import org.eclipse.fennec.codec.geojson.GeoJsonResourceFactoryImpl;
import org.eclipse.fennec.model.query.builder.QueryBuilder;
import org.eclipse.fennec.ogc.features.api.CollectionDescriptor;
import org.eclipse.fennec.ogc.features.cql2.Cql2Evaluator;
import org.eclipse.fennec.ogc.features.example.bath.BathPackage;
import org.eclipse.fennec.ogc.features.geo.GeoJsonFeatureImporter;
import org.eclipse.fennec.ogc.features.geo.GeoJsonText;
import org.eclipse.fennec.ogc.features.source.persistence.Cql2ToQuery.Translation;
import org.eclipse.fennec.persistence.query.memory.MemoryQueries;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import net.opengis.cql2.Predicate;

/**
 * The store part and the residual together select what the evaluator alone selects, with
 * the store part evaluated by the Fennec in-memory query engine.
 */
class Cql2ToQueryTest {

	private static final String OUTDOOR = "BBOX(11.6166,50.9051,11.6178,50.9054)";

	private static List<EObject> data;
	private static CollectionDescriptor pools;

	@BeforeAll
	static void setUp() throws Exception {
		try (InputStream in = Files.newInputStream(Path.of("../org.eclipse.fennec.ogc.features.example.bath.demo/data/saaleaue.geojson"))) {
			data = new GeoJsonFeatureImporter(new GeoJsonText(new GeoJsonResourceFactoryImpl()), BathPackage.eINSTANCE,
					"assetType").read(in);
		}
		pools = CollectionDescriptor.of(BathPackage.Literals.POOL).orElseThrow();
	}

	static Stream<String> filters() {
		return Stream.of(
				"poolType = 'WAVE'",
				"30 <= waterTemperature AND lanes = 0",
				"depthMin = depthMax",
				"name LIKE 'Frei%'",
				"depthMax BETWEEN 1.9 AND 2.1",
				"poolType IN ('KIDS', 'WHIRLPOOL')",
				"description IS NOT NULL",
				"NOT description = 'x'",
				"lastInspection < TIMESTAMP('2026-01-01T00:00:00Z')",
				"S_INTERSECTS(geometry, " + OUTDOOR + ")",
				"S_WITHIN(POINT(11.6160969 50.9061409), geometry)",
				"poolType = 'KIDS' OR S_INTERSECTS(geometry, " + OUTDOOR + ")",
				"NOT S_INTERSECTS(geometry, " + OUTDOOR + ") AND lanes > 0",
				"S_DISJOINT(geometry, " + OUTDOOR + ") OR poolType = 'DIVING'",
				"TRUE OR S_INTERSECTS(geometry, " + OUTDOOR + ")",
				"FALSE");
	}

	@ParameterizedTest
	@MethodSource("filters")
	void storeAndResidualSelectWhatTheEvaluatorSelects(String cql2) throws Exception {
		Predicate filter = Cql2Text.parse(cql2);
		Translation translation = Cql2ToQuery.translate(filter, pools);

		QueryBuilder query = QueryBuilder.from(pools.type());
		if (translation.store() != null) {
			query.where(translation.store());
		}
		Stream<EObject> stored = MemoryQueries.execute(query.build(), data, null).objects();
		List<String> split = ids(translation.hasResidual() ? stored.filter(translation.residual()::matches) : stored);

		Cql2Evaluator evaluator = Cql2Evaluator.compile(filter, pools);
		List<String> reference = ids(data.stream().filter(o -> pools.type().isSuperTypeOf(o.eClass())).filter(evaluator::matches));
		assertThat(split).isEqualTo(reference);
	}

	@Test
	void pushesWhatTheStoreCanDecide() {
		assertThat(Cql2ToQuery.translate(Cql2Text.parse("NOT (poolType = 'WAVE' OR lanes > 2)"), pools).hasResidual()).isFalse();
		Translation spatial = Cql2ToQuery.translate(Cql2Text.parse("S_INTERSECTS(geometry, " + OUTDOOR + ")"), pools);
		assertThat(spatial.store()).as("envelope test").isNotNull();
		assertThat(spatial.hasResidual()).isTrue();
		Translation disjoint = Cql2ToQuery.translate(Cql2Text.parse("S_DISJOINT(geometry, " + OUTDOOR + ")"), pools);
		assertThat(disjoint.store()).as("no necessary envelope test").isNull();
	}

	private static List<String> ids(Stream<EObject> features) {
		return features.map(o -> (String) o.eGet(BathPackage.Literals.ASSET__ID)).sorted().toList();
	}
}
