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
package org.eclipse.fennec.ogc.features.runtime;

import static org.assertj.core.api.Assertions.assertThat;

import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.fennec.codec.geojson.GeoJsonResourceFactoryImpl;
import org.eclipse.fennec.ogc.features.example.bath.BathPackage;
import org.eclipse.fennec.ogc.features.geo.GeoJsonFeatureImporter;
import org.eclipse.fennec.ogc.features.geo.GeoJsonText;
import org.eclipse.fennec.ogc.features.source.MemoryFeatureSource;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import tools.jackson.databind.JsonNode;
import tools.jackson.databind.json.JsonMapper;

class OgcApiTest {

	private static final String BASE = "http://localhost:8080/ogc";
	private static final JsonMapper MAPPER = JsonMapper.builder().build();

	private static OgcApi api;

	@BeforeAll
	static void setUp() throws Exception {
		List<EObject> assets;
		try (InputStream in = Files.newInputStream(Path.of("../org.eclipse.fennec.ogc.features.example.bath.demo/data/bath.geojson"))) {
			assets = new GeoJsonFeatureImporter(new GeoJsonText(new GeoJsonResourceFactoryImpl()), BathPackage.eINSTANCE,
					"assetType").read(in);
		}
		CollectionRegistry registry = new CollectionRegistry();
		registry.addPackage(BathPackage.eINSTANCE);
		registry.addSource(new MemoryFeatureSource(Set.of(BathPackage.eNS_URI), () -> assets));
		api = new OgcApi(registry, Map::of, new OgcApi.Settings("Freizeitbad", "Demo", 10, 100));
	}

	private static JsonNode get(String path, String... parameters) {
		OgcApi.Response response = request(path, parameters);
		assertThat(response.status()).as(new String(response.body(), StandardCharsets.UTF_8)).isEqualTo(200);
		return MAPPER.readTree(response.body());
	}

	private static OgcApi.Response request(String path, String... parameters) {
		Map<String, String> map = new LinkedHashMap<>();
		for (int i = 0; i < parameters.length; i += 2) {
			map.put(parameters[i], parameters[i + 1]);
		}
		return api.handle(path, map, null, BASE);
	}

	private static List<String> rels(JsonNode resource) {
		return resource.path("links").valueStream().map(l -> l.path("rel").asString()).toList();
	}

	@Test
	void landingPage() {
		JsonNode landing = get("/");
		assertThat(landing.path("title").asString()).isEqualTo("Freizeitbad");
		assertThat(rels(landing)).contains("self", "service-desc", "conformance", "data");
	}

	@Test
	void conformance() {
		assertThat(get("/conformance").path("conformsTo").valueStream().map(JsonNode::asString))
				.contains("http://www.opengis.net/spec/ogcapi-features-1/1.0/conf/core",
						"http://www.opengis.net/spec/ogcapi-features-1/1.0/conf/geojson");
	}

	@Test
	void collections() {
		JsonNode collections = get("/collections").path("collections");
		assertThat(collections.size()).isEqualTo(15);
		JsonNode pools = collections.valueStream().filter(c -> "pools".equals(c.path("id").asString())).findFirst()
				.orElseThrow();
		assertThat(pools.path("title").asString()).isEqualTo("Becken");
		assertThat(pools.path("layerGroup").asString()).isEqualTo("Wasser");
		assertThat(pools.path("extent").path("spatial").path("bbox").get(0).size()).isEqualTo(4);
		assertThat(rels(pools)).contains("items", "http://www.opengis.net/def/rel/ogc/1.0/queryables");
	}

	@Test
	void itemsArePagedWithNextLink() {
		JsonNode page = get("/collections/assets/items", "limit", "20");
		assertThat(page.path("type").asString()).isEqualTo("FeatureCollection");
		assertThat(page.path("numberMatched").asInt()).isEqualTo(43);
		assertThat(page.path("numberReturned").asInt()).isEqualTo(20);
		String next = page.path("links").valueStream().filter(l -> "next".equals(l.path("rel").asString()))
				.findFirst().orElseThrow().path("href").asString();
		assertThat(next).contains("offset=20").contains("limit=20");

		JsonNode last = get("/collections/assets/items", "limit", "20", "offset", "40");
		assertThat(last.path("numberReturned").asInt()).isEqualTo(3);
		assertThat(rels(last)).contains("prev").doesNotContain("next");
	}

	@Test
	void featureCarriesGeometryPropertiesAndType() {
		JsonNode feature = get("/collections/pools/items/pool-diving");
		assertThat(feature.path("type").asString()).isEqualTo("Feature");
		assertThat(feature.has("featureType")).as("no JSON-FG member").isFalse();
		assertThat(feature.path("properties").path("featureType").asString()).isEqualTo("Pool");
		assertThat(feature.path("geometry").path("type").asString()).isEqualTo("Polygon");
		assertThat(feature.path("geometry").path("coordinates").get(0).get(0).size()).isEqualTo(2);
		JsonNode properties = feature.path("properties");
		assertThat(properties.path("poolType").asString()).isEqualTo("DIVING");
		assertThat(properties.path("depthMax").asDouble()).isEqualTo(4.5);
		assertThat(properties.path("status").asString()).isEqualTo("MAINTENANCE");
		assertThat(properties.has("minX")).isFalse();
		assertThat(properties.has("geometry")).isFalse();
	}

	@Test
	void defaultValuesArePropertiesToo() {
		// OPEN and GROUND_FLOOR are the first enum literals, false the boolean default
		JsonNode properties = get("/collections/changing-rooms/items/changing-main").path("properties");
		assertThat(properties.path("status").asString()).isEqualTo("OPEN");
		assertThat(properties.path("level").asString()).isEqualTo("GROUND_FLOOR");
		assertThat(properties.path("family").isBoolean()).isTrue();
		assertThat(properties.path("family").asBoolean()).isFalse();
	}

	@Test
	void bboxSelectsTheOutdoorArea() {
		JsonNode page = get("/collections/pools/items", "bbox", "11.6166,50.9051,11.6178,50.9054");
		assertThat(ids(page)).containsExactly("pool-diving", "pool-outdoor");
	}

	@Test
	void bboxUsesTheExactGeometry() {
		// inside the box of the tornado slide's line, but away from the line itself
		JsonNode page = get("/collections/slides/items", "bbox", "11.61678,50.90539,11.61680,50.90541");
		assertThat(ids(page)).isEmpty();
	}

	@Test
	void propertyFilter() {
		assertThat(ids(get("/collections/pools/items", "poolType", "WAVE"))).containsExactly("pool-wave");
		assertThat(ids(get("/collections/assets/items", "status", "MAINTENANCE"))).containsExactly("pool-diving");
	}

	@Test
	void datetimeFiltersTheTemporalProperty() {
		assertThat(ids(get("/collections/pools/items", "datetime", "2026-09-01"))).containsExactly("pool-sport");
		assertThat(ids(get("/collections/pools/items", "datetime", "../2026-01-01T00:00:00Z")))
				.containsExactly("pool-diving");
	}

	@Test
	void errors() {
		assertThat(request("/collections/nope").status()).isEqualTo(404);
		assertThat(request("/collections/pools/items/nope").status()).isEqualTo(404);
		assertThat(request("/collections/pools/items", "colour", "red").status()).isEqualTo(400);
		assertThat(request("/collections/pools/items", "bbox", "1,2,3").status()).isEqualTo(400);
		assertThat(request("/collections/pools/items", "limit", "0").status()).isEqualTo(400);
		assertThat(request("/collections/pools/items", "filter", "poolType='WAVE'").status())
				.as("no filter language registered").isEqualTo(400);
		assertThat(request("/", "f", "xml").status()).isEqualTo(406);
		OgcApi.Response error = request("/collections/nope");
		assertThat(MAPPER.readTree(error.body()).path("code").asString()).isEqualTo("NotFound");
	}

	@Test
	void html() {
		OgcApi.Response page = request("/collections/pools/items", "f", "html");
		assertThat(page.contentType()).startsWith("text/html");
		String body = new String(page.body(), StandardCharsets.UTF_8);
		assertThat(body).contains("Sportbecken").contains("pool-wave");
		assertThat(api.handle("/", Map.of(), "text/html,application/xhtml+xml", BASE).contentType())
				.startsWith("text/html");
	}

	@Test
	void queryables() {
		JsonNode queryables = get("/collections/pools/queryables");
		assertThat(queryables.path("properties").path("poolType").path("enum").size()).isEqualTo(7);
		assertThat(queryables.path("properties").path("depthMax").path("type").asString()).isEqualTo("number");
		assertThat(queryables.path("properties").path("geometry").path("format").asString()).isEqualTo("geometry-any");
		assertThat(queryables.path("properties").has("minX")).isFalse();
	}

	@Test
	void openApi() {
		OgcApi.Response response = request("/api");
		assertThat(response.contentType()).isEqualTo(MediaTypes.OPEN_API);
		JsonNode api = MAPPER.readTree(response.body());
		assertThat(api.path("openapi").asString()).isEqualTo("3.0.3");
		assertThat(api.path("paths").has("/collections/{collectionId}/items")).isTrue();
	}

	private static List<String> ids(JsonNode page) {
		return page.path("features").valueStream().map(f -> f.path("id").asString()).toList();
	}
}
