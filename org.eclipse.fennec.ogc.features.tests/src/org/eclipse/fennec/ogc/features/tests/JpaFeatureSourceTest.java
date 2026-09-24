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
import static org.eclipse.fennec.model.query.builder.Expressions.path;

import java.io.InputStream;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.List;
import java.util.Set;
import java.util.function.UnaryOperator;

import javax.sql.DataSource;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.fennec.ogc.features.api.CollectionDescriptor;
import org.eclipse.fennec.ogc.features.api.Envelope;
import org.eclipse.fennec.ogc.features.api.FeatureQuery;
import org.eclipse.fennec.ogc.features.api.FeatureResult;
import org.eclipse.fennec.ogc.features.api.FeatureSource;
import org.eclipse.fennec.ogc.features.api.SortKey;
import org.eclipse.fennec.ogc.features.example.bath.Asset;
import org.eclipse.fennec.ogc.features.example.bath.BathPackage;
import org.eclipse.fennec.ogc.features.example.bath.PoolType;
import org.eclipse.fennec.ogc.features.example.bath.demo.BathDataLoader;
import org.eclipse.fennec.ogc.features.geo.GeoJsonFeatureImporter;
import org.eclipse.fennec.ogc.features.geo.GeoJsonText;
import org.eclipse.fennec.ogc.features.geo.JtsGeometries;
import org.eclipse.fennec.ogc.features.geo.SpatialRelation;
import org.eclipse.fennec.ogc.features.source.MemoryFeatureSource;
import org.geojson.Polygon;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.locationtech.jts.geom.Geometry;
import org.osgi.service.condition.Condition;
import org.osgi.test.common.annotation.InjectService;
import org.osgi.test.junit5.cm.ConfigurationExtension;
import org.osgi.test.junit5.context.BundleContextExtension;
import org.osgi.test.junit5.service.ServiceExtension;

/**
 * The demo data in JPA on H2 must answer every feature query exactly like the in-memory
 * reference over the same data.
 * <p>
 * Objects read from JPA are accessed reflectively only: Fennec persistence does not use the
 * generated implementation classes of a model as entity classes but generates dynamic ones,
 * so they are {@code EObject}s of the right EClass but no {@code Asset} instances.
 */
@ExtendWith(BundleContextExtension.class)
@ExtendWith(ServiceExtension.class)
@ExtendWith(ConfigurationExtension.class)
@BathSetup
class JpaFeatureSourceTest {

	private static final Envelope OUTDOOR_POOL_AREA = new Envelope(11.6166, 50.9051, 11.6177, 50.9054);

	@InjectService(filter = "(osgi.condition.id=" + BathDataLoader.CONDITION_ID + ")", timeout = 30000)
	Condition loaded;

	@InjectService(filter = "(component.name=org.eclipse.fennec.ogc.features.source.repository)", timeout = 10000)
	FeatureSource jpa;

	@InjectService(filter = "(emf.configuratorName=geojson)", timeout = 5000)
	Resource.Factory geoJson;

	@InjectService(timeout = 5000)
	DataSource dataSource;

	private MemoryFeatureSource memory;
	private CollectionDescriptor assets;
	private CollectionDescriptor pools;

	@BeforeEach
	void setUp() throws Exception {
		List<EObject> reference;
		GeoJsonFeatureImporter importer = new GeoJsonFeatureImporter(new GeoJsonText(geoJson), BathPackage.eINSTANCE,
				"assetType");
		try (InputStream in = BathDataLoader.class.getResourceAsStream("/data/bath.geojson")) {
			reference = importer.read(in);
		}
		memory = new MemoryFeatureSource(Set.of(BathPackage.eNS_URI), () -> reference);
		assets = CollectionDescriptor.of(BathPackage.Literals.ASSET).orElseThrow();
		pools = CollectionDescriptor.of(BathPackage.Literals.POOL).orElseThrow();
	}

	@Test
	void allAssetsAreStored() {
		FeatureResult result = jpa.query(FeatureQuery.builder(assets).count(true).build());
		assertThat(result.numberMatched()).isEqualTo(43);
		assertThat(result.features()).hasSize(43)
				.allMatch(o -> BathPackage.Literals.ASSET.isSuperTypeOf(o.eClass()));
	}

	@Test
	void longGeometrySurvivesTheStore() {
		EObject lawn = jpa.get(CollectionDescriptor.of(BathPackage.Literals.LAWN).orElseThrow(), "lawn-big")
				.orElseThrow();
		Asset reference = (Asset) memory.get(assets, "lawn-big").orElseThrow();
		assertThat(lawn.eClass()).isSameAs(BathPackage.Literals.LAWN);
		assertThat(geometry(lawn)).isInstanceOf(Polygon.class);
		assertThat(JtsGeometries.toJts(geometry(lawn)).equalsExact(JtsGeometries.toJts(reference.getGeometry())))
				.isTrue();
		assertThat(lawn.eGet(BathPackage.Literals.ASSET__MIN_X)).isEqualTo(reference.getMinX());
	}

	@Test
	void geometryColumnWasWidened() throws Exception {
		// workaround until Fennec persistence honours a column definition for basic attributes
		try (Connection connection = dataSource.getConnection();
				ResultSet columns = connection.getMetaData().getColumns(null, null, "%", "GEOMETRY")) {
			assertThat(columns.next()).as("geometry column").isTrue();
			assertThat(columns.getInt("COLUMN_SIZE")).isGreaterThan(255);
		}
	}

	@Test
	void concreteAndAbstractCollections() {
		assertSame(q -> q, pools);
		assertSame(q -> q, assets);
	}

	@Test
	void bboxFilter() {
		assertSame(q -> q.where(assets.bbox().intersects(OUTDOOR_POOL_AREA)), assets);
	}

	@Test
	void propertyFilterSortingAndPaging() {
		assertSame(q -> q.where(path(BathPackage.Literals.POOL__POOL_TYPE).ne(PoolType.KIDS))
				.sort(SortKey.desc(BathPackage.Literals.POOL__WATER_TEMPERATURE)).offset(2).limit(3), pools);
	}

	@Test
	void exactSpatialTestAsResidual() {
		Geometry area = JtsGeometries.toJts(OUTDOOR_POOL_AREA);
		assertSame(q -> q.where(assets.bbox().intersects(OUTDOOR_POOL_AREA))
				.residual(o -> SpatialRelation.INTERSECTS.test(JtsGeometries.toJts(geometry(o)), area))
				.limit(5), assets);
	}

	private void assertSame(UnaryOperator<FeatureQuery.Builder> query, CollectionDescriptor collection) {
		FeatureQuery q = query.apply(FeatureQuery.builder(collection).count(true)).build();
		FeatureResult expected = memory.query(q);
		FeatureResult actual = jpa.query(q);
		assertThat(ids(actual)).as("features").containsExactlyElementsOf(ids(expected));
		assertThat(actual.numberMatched()).as("numberMatched").isEqualTo(expected.numberMatched());
		assertThat(expected.features()).as("the query must not be trivially empty").isNotEmpty();
	}

	private static List<String> ids(FeatureResult result) {
		return result.features().stream().map(o -> (String) o.eGet(BathPackage.Literals.ASSET__ID)).toList();
	}

	private static org.geojson.Geometry geometry(EObject asset) {
		return (org.geojson.Geometry) asset.eGet(BathPackage.Literals.ASSET__GEOMETRY);
	}
}
