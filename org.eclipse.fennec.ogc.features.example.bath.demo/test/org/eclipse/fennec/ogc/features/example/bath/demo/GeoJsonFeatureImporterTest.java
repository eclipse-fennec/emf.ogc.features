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
package org.eclipse.fennec.ogc.features.example.bath.demo;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.fennec.codec.geojson.GeoJsonResourceFactoryImpl;
import org.eclipse.fennec.codec.util.MetadataServiceFactory;
import org.eclipse.fennec.emf.osgi.metadata.MetadataWhiteboard;
import org.eclipse.fennec.ogc.features.example.bath.Asset;
import org.eclipse.fennec.ogc.features.example.bath.BathPackage;
import org.eclipse.fennec.ogc.features.example.bath.Lawn;
import org.eclipse.fennec.ogc.features.example.bath.OperationalStatus;
import org.eclipse.fennec.ogc.features.example.bath.Pool;
import org.eclipse.fennec.ogc.features.example.bath.PoolType;
import org.eclipse.fennec.ogc.features.example.bath.Slide;
import org.eclipse.fennec.ogc.features.geo.GeoJsonFeatureImporter;
import org.eclipse.fennec.ogc.features.geo.GeoJsonText;
import org.geojson.GeoJsonPackage;
import org.geojson.LineString;
import org.geojson.Polygon;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class GeoJsonFeatureImporterTest {

	private GeoJsonText text;
	private GeoJsonFeatureImporter importer;

	@BeforeEach
	void setUp() {
		MetadataWhiteboard metadata = MetadataServiceFactory.create();
		metadata.registerPackage(GeoJsonPackage.eINSTANCE);
		text = new GeoJsonText(new GeoJsonResourceFactoryImpl(metadata));
		importer = new GeoJsonFeatureImporter(text, BathPackage.eINSTANCE, "assetType");
	}

	@Test
	void importsTheDemoData() throws Exception {
		List<EObject> assets;
		try (InputStream in = Files.newInputStream(Path.of("data/bath.geojson"))) {
			assets = importer.read(in);
		}
		assertThat(assets).hasSize(43).allMatch(Asset.class::isInstance);

		Pool diving = find(assets, Pool.class, "pool-diving");
		assertThat(diving.getPoolType()).isEqualTo(PoolType.DIVING);
		assertThat(diving.getStatus()).isEqualTo(OperationalStatus.MAINTENANCE);
		assertThat(diving.getDepthMax()).isEqualTo(4.5);
		assertThat(diving.getGeometry()).isInstanceOf(Polygon.class);
		assertThat(diving.getMinX()).isLessThan(diving.getMaxX());
		assertThat(diving.getLastInspection()).isNotNull();

		Slide tornado = find(assets, Slide.class, "slide-tornado");
		assertThat(tornado.getGeometry()).isInstanceOf(LineString.class);

		Lawn lawn = find(assets, Lawn.class, "lawn-big");
		assertThat(text.write(lawn.getGeometry())).hasSizeGreaterThan(255);
	}

	@Test
	void unknownAttributeIsRejected() {
		String json = """
				{"type":"FeatureCollection","features":[{"type":"Feature","id":"x",
				 "geometry":{"type":"Point","coordinates":[1,2]},
				 "properties":{"assetType":"Kiosk","colour":"red"}}]}""";
		assertThatThrownBy(() -> importer.read(new ByteArrayInputStream(json.getBytes(StandardCharsets.UTF_8))))
				.isInstanceOf(IllegalArgumentException.class).hasMessageContaining("colour");
	}

	@Test
	void abstractTypeIsRejected() {
		String json = """
				{"type":"FeatureCollection","features":[{"type":"Feature","id":"x","geometry":null,
				 "properties":{"assetType":"Asset"}}]}""";
		assertThatThrownBy(() -> importer.read(new ByteArrayInputStream(json.getBytes(StandardCharsets.UTF_8))))
				.isInstanceOf(IllegalArgumentException.class).hasMessageContaining("concrete");
	}

	private static <T extends Asset> T find(List<EObject> assets, Class<T> type, String id) {
		return assets.stream().filter(type::isInstance).map(type::cast)
				.filter(a -> id.equals(a.getId())).findFirst().orElseThrow();
	}
}
