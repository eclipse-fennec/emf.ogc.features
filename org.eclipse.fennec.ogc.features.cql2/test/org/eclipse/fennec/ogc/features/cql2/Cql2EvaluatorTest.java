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

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.Instant;
import java.util.List;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.fennec.codec.cql2.Cql2ResourceFactories;
import org.eclipse.fennec.codec.cql2.Cql2Text;
import org.eclipse.fennec.codec.geojson.GeoJsonResourceFactoryImpl;
import org.eclipse.fennec.ogc.features.api.CollectionDescriptor;
import org.eclipse.fennec.ogc.features.api.Envelope;
import org.eclipse.fennec.ogc.features.example.bath.BathPackage;
import org.eclipse.fennec.ogc.features.example.bath.PoolType;
import org.eclipse.fennec.ogc.features.geo.GeoJsonFeatureImporter;
import org.eclipse.fennec.ogc.features.geo.GeoJsonText;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import net.opengis.cql2.Predicate;

/** The in-memory semantics of CQL2 on the fixed Saaleaue test data. */
class Cql2EvaluatorTest {

	private static final String OUTDOOR = "BBOX(11.6166,50.9051,11.6178,50.9054)";

	private static List<EObject> data;
	private static CollectionDescriptor pools;
	private static CollectionDescriptor assets;

	@BeforeAll
	static void setUp() throws Exception {
		try (InputStream in = Files.newInputStream(Path.of("../org.eclipse.fennec.ogc.features.example.bath.demo/data/saaleaue.geojson"))) {
			data = new GeoJsonFeatureImporter(new GeoJsonText(new GeoJsonResourceFactoryImpl()), BathPackage.eINSTANCE,
					"assetType").read(in);
		}
		pools = CollectionDescriptor.of(BathPackage.Literals.POOL).orElseThrow();
		assets = CollectionDescriptor.of(BathPackage.Literals.ASSET).orElseThrow();
	}

	private static List<String> ids(CollectionDescriptor collection, String cql2) {
		return ids(collection, Cql2Text.parse(cql2));
	}

	private static List<String> ids(CollectionDescriptor collection, Predicate filter) {
		Cql2Evaluator evaluator = Cql2Evaluator.compile(filter, collection);
		return data.stream()
				.filter(o -> collection.type().isSuperTypeOf(o.eClass()))
				.filter(evaluator::matches)
				.map(o -> (String) o.eGet(BathPackage.Literals.ASSET__ID))
				.sorted()
				.toList();
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
	void not() {
		assertThat(ids(assets, "NOT status = 'OPEN'")).containsExactly("pool-diving", "sauna-infrared");
	}

	@Test
	void spatial() {
		assertThat(ids(pools, "S_INTERSECTS(geometry, " + OUTDOOR + ")")).containsExactly("pool-diving", "pool-outdoor");
		assertThat(ids(pools, "S_INTERSECTS(geometry, POINT(11.6160969 50.9061409))")).containsExactly("pool-wave");
		assertThat(ids(pools, "S_CONTAINS(geometry, POINT(11.6160969 50.9061409))")).containsExactly("pool-wave");
		assertThat(ids(pools, "S_WITHIN(POINT(11.6160969 50.9061409), geometry)")).containsExactly("pool-wave");
		// inside the envelope of the tornado slide, but not on its line
		assertThat(ids(CollectionDescriptor.of(BathPackage.Literals.SLIDE).orElseThrow(),
				"S_INTERSECTS(geometry, POINT(11.6166952 50.90553))")).isEmpty();
	}

	@Test
	void spatialCombined() {
		assertThat(ids(pools, "poolType = 'KIDS' OR S_INTERSECTS(geometry, " + OUTDOOR + ")"))
				.containsExactly("pool-diving", "pool-kids", "pool-outdoor");
		assertThat(ids(pools, "NOT S_INTERSECTS(geometry, " + OUTDOOR + ") AND lanes > 0")).containsExactly("pool-sport");
		assertThat(ids(pools, "S_DISJOINT(geometry, " + OUTDOOR + ") AND poolType = 'DIVING'")).isEmpty();
	}

	@Test
	void unknownIsNotNegated() {
		// description is missing for most pools: unknown, and NOT unknown is unknown
		assertThat(ids(pools, "NOT description = 'x'")).containsExactly("pool-diving", "pool-wave");
	}

	@Test
	void jsonAndTextAgree() throws Exception {
		Resource json = Cql2ResourceFactories.json().createResource(URI.createURI("filter.cql2json"));
		json.load(new ByteArrayInputStream("""
				{"op":"or","args":[{"op":"=","args":[{"property":"poolType"},"KIDS"]},
				 {"op":"s_intersects","args":[{"property":"geometry"},{"bbox":[11.6166,50.9051,11.6178,50.9054]}]}]}"""
				.getBytes(StandardCharsets.UTF_8)), null);
		assertThat(ids(pools, (Predicate) json.getContents().get(0)))
				.isEqualTo(ids(pools, "poolType = 'KIDS' OR S_INTERSECTS(geometry, " + OUTDOOR + ")"));
	}

	@Test
	void builtFilters() {
		assertThat(ids(pools, Cql2Filters.equal(BathPackage.Literals.POOL__POOL_TYPE, PoolType.WAVE)))
				.containsExactly("pool-wave");
		assertThat(ids(pools, Cql2Filters.intersects(BathPackage.Literals.ASSET__GEOMETRY,
				new Envelope(11.6166, 50.9051, 11.6178, 50.9054)))).containsExactly("pool-diving", "pool-outdoor");
		assertThat(ids(assets, Cql2Filters.and(List.of(
				Cql2Filters.greaterOrEqual(BathPackage.Literals.ASSET__LAST_INSPECTION, Instant.parse("2026-09-01T00:00:00Z")),
				Cql2Filters.lessThan(BathPackage.Literals.ASSET__LAST_INSPECTION, Instant.parse("2026-09-02T00:00:00Z"))))))
				.containsExactly("pool-sport");
	}

	@Test
	void errors() {
		assertThatThrownBy(() -> ids(pools, "colour = 'red'")).hasMessageContaining("Unknown queryable");
		assertThatThrownBy(() -> ids(pools, "poolType = 'SEA'")).hasMessageContaining("does not fit");
		assertThatThrownBy(() -> ids(pools, "lanes = 'many'")).hasMessageContaining("does not fit");
		assertThatThrownBy(() -> ids(pools, "S_INTERSECTS(name, POINT(1 2))")).hasMessageContaining("not the geometry");
		assertThatThrownBy(() -> ids(pools, "minX > 1")).hasMessageContaining("Unknown queryable");
	}
}
