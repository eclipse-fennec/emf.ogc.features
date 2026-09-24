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
package org.eclipse.fennec.ogc.features.source.memory;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.fennec.ogc.features.api.CollectionDescriptor;
import org.eclipse.fennec.ogc.features.api.Envelope;
import org.eclipse.fennec.ogc.features.api.FeatureQuery;
import org.eclipse.fennec.ogc.features.api.FeatureResult;
import org.eclipse.fennec.ogc.features.api.SortKey;
import org.eclipse.fennec.ogc.features.cql2.Cql2Filters;
import org.eclipse.fennec.ogc.features.example.bath.Asset;
import org.eclipse.fennec.ogc.features.example.bath.BathFactory;
import org.eclipse.fennec.ogc.features.example.bath.BathPackage;
import org.eclipse.fennec.ogc.features.example.bath.Kiosk;
import org.eclipse.fennec.ogc.features.example.bath.Pool;
import org.eclipse.fennec.ogc.features.example.bath.PoolType;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MemoryFeatureSourceTest {

	private static final BathFactory F = BathFactory.eINSTANCE;

	private final List<EObject> assets = new ArrayList<>();
	private MemoryFeatureSource source;
	private CollectionDescriptor pools;
	private CollectionDescriptor all;

	@BeforeEach
	void setUp() {
		pools = CollectionDescriptor.of(BathPackage.Literals.POOL).orElseThrow();
		all = CollectionDescriptor.of(BathPackage.Literals.ASSET).orElseThrow();
		assets.add(pool("p1", PoolType.SWIMMER, 25.0, new Envelope(0, 0, 2, 1)));
		assets.add(pool("p2", PoolType.KIDS, 32.0, new Envelope(3, 0, 4, 1)));
		assets.add(pool("p3", PoolType.WAVE, 28.0, new Envelope(10, 10, 12, 11)));
		assets.add(kiosk("k1", new Envelope(1, 1, 1, 1)));
		source = new MemoryFeatureSource(Set.of(BathPackage.eNS_URI), () -> assets);
	}

	@Test
	void descriptorsComeFromTheAnnotations() {
		assertThat(pools.id()).isEqualTo("pools");
		assertThat(pools.layerGroup()).isEqualTo("Wasser");
		assertThat(pools.geometry()).isEqualTo(BathPackage.Literals.ASSET__GEOMETRY);
		assertThat(pools.bbox()).isNotNull();
		assertThat(pools.temporal()).isEqualTo(BathPackage.Literals.ASSET__LAST_INSPECTION);
		assertThat(pools.properties()).contains(BathPackage.Literals.POOL__POOL_TYPE)
				.doesNotContain(BathPackage.Literals.ASSET__GEOMETRY, BathPackage.Literals.ASSET__MIN_X);
		assertThat(CollectionDescriptor.of(BathPackage.eINSTANCE)).hasSize(21);
	}

	@Test
	void collectionOfConcreteTypeOnlyReturnsItsInstances() {
		FeatureResult result = source.query(FeatureQuery.builder(pools).count(true).build());
		assertThat(ids(result)).containsExactly("p1", "p2", "p3");
		assertThat(result.numberMatched()).isEqualTo(3);
	}

	@Test
	void collectionOfAbstractTypeReturnsAllSubtypes() {
		assertThat(ids(source.query(FeatureQuery.builder(all).build()))).containsExactly("k1", "p1", "p2", "p3");
	}

	@Test
	void pagingAndSorting() {
		FeatureQuery query = FeatureQuery.builder(pools)
				.sort(SortKey.desc(BathPackage.Literals.POOL__WATER_TEMPERATURE))
				.offset(1).limit(1).count(true).build();
		FeatureResult result = source.query(query);
		assertThat(ids(result)).containsExactly("p3");
		assertThat(result.numberMatched()).isEqualTo(3);
	}

	@Test
	void propertyFilter() {
		FeatureQuery query = FeatureQuery.builder(pools)
				.where(Cql2Filters.equal(BathPackage.Literals.POOL__POOL_TYPE, PoolType.KIDS)).build();
		assertThat(ids(source.query(query))).containsExactly("p2");
	}

	@Test
	void filterIsAppliedBeforePagingAndCounting() {
		FeatureQuery query = FeatureQuery.builder(pools)
				.where(Cql2Filters.greaterOrEqual(BathPackage.Literals.POOL__WATER_TEMPERATURE, 28.0))
				.limit(1).count(true).build();
		FeatureResult result = source.query(query);
		assertThat(ids(result)).containsExactly("p2");
		assertThat(result.numberMatched()).isEqualTo(2);
	}

	@Test
	void sortByAttributeOfOneSubtypeInAggregate() {
		FeatureQuery query = FeatureQuery.builder(all).sort(SortKey.asc(BathPackage.Literals.POOL__WATER_TEMPERATURE)).build();
		// the kiosk has no water temperature and sorts first
		assertThat(ids(source.query(query))).containsExactly("k1", "p1", "p3", "p2");
	}

	@Test
	void getById() {
		assertThat(source.get(pools, "p2")).map(o -> ((Asset) o).getName()).contains("Pool p2");
		assertThat(source.get(pools, "k1")).isEmpty();
		assertThat(source.get(pools, "nope")).isEmpty();
	}

	private static List<String> ids(FeatureResult result) {
		return result.features().stream().map(o -> ((Asset) o).getId()).toList();
	}

	private Pool pool(String id, PoolType type, double temperature, Envelope box) {
		Pool pool = F.createPool();
		pool.setId(id);
		pool.setName("Pool " + id);
		pool.setPoolType(type);
		pool.setWaterTemperature(temperature);
		pools.bbox().write(pool, box);
		return pool;
	}

	private Kiosk kiosk(String id, Envelope box) {
		Kiosk kiosk = F.createKiosk();
		kiosk.setId(id);
		kiosk.setName("Kiosk " + id);
		all.bbox().write(kiosk, box);
		return kiosk;
	}
}
