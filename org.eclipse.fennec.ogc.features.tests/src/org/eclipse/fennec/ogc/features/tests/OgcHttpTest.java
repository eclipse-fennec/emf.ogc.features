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

import java.net.URI;
import java.net.URLEncoder;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.charset.StandardCharsets;
import java.time.Duration;
import java.util.List;

import org.eclipse.fennec.ogc.features.example.bath.demo.BathDataLoader;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.osgi.service.condition.Condition;
import org.osgi.test.common.annotation.InjectService;
import org.osgi.test.junit5.context.BundleContextExtension;
import org.osgi.test.junit5.service.ServiceExtension;

import jakarta.servlet.Servlet;
import tools.jackson.databind.JsonNode;
import tools.jackson.databind.json.JsonMapper;

/**
 * The OGC API over HTTP: servlet on the Jetty whiteboard, repository source on H2, CQL2
 * filter languages as services.
 */
@ExtendWith(BundleContextExtension.class)
@ExtendWith(ServiceExtension.class)
@BathSetup
class OgcHttpTest {

	private static final String BASE = "http://127.0.0.1:18894/ogc";
	private static final JsonMapper MAPPER = JsonMapper.builder().build();
	private static final HttpClient CLIENT = HttpClient.newBuilder().connectTimeout(Duration.ofSeconds(5)).build();

	@InjectService(filter = "(osgi.condition.id=" + BathDataLoader.CONDITION_ID + ")", timeout = 30000)
	Condition loaded;

	@InjectService(filter = "(osgi.http.whiteboard.servlet.name=fennec-ogc-features)", timeout = 10000)
	Servlet servlet;

	private static HttpResponse<String> get(String pathAndQuery) throws Exception {
		HttpRequest request = HttpRequest.newBuilder(URI.create(BASE + pathAndQuery)).timeout(Duration.ofSeconds(20))
				.header("Accept", "application/json").GET().build();
		return CLIENT.send(request, HttpResponse.BodyHandlers.ofString());
	}

	private static JsonNode json(String pathAndQuery) throws Exception {
		HttpResponse<String> response = get(pathAndQuery);
		assertThat(response.statusCode()).as(response.body()).isEqualTo(200);
		return MAPPER.readTree(response.body());
	}

	private static String q(String value) {
		return URLEncoder.encode(value, StandardCharsets.UTF_8);
	}

	@Test
	void conformanceIncludesCql2() throws Exception {
		List<String> classes = json("/conformance").path("conformsTo").valueStream().map(JsonNode::asString).toList();
		assertThat(classes).contains("http://www.opengis.net/spec/ogcapi-features-1/1.0/conf/core",
				"http://www.opengis.net/spec/ogcapi-features-3/1.0/conf/filter",
				"http://www.opengis.net/spec/cql2/1.0/conf/cql2-text",
				"http://www.opengis.net/spec/cql2/1.0/conf/cql2-json");
	}

	@Test
	void collectionsWithExtent() throws Exception {
		JsonNode collections = json("/collections").path("collections");
		assertThat(collections.size()).isEqualTo(15);
		assertThat(collections.get(0).path("links").valueStream().map(l -> l.path("href").asString()))
				.anyMatch(href -> href.startsWith(BASE + "/collections/"));
	}

	@Test
	void itemsWithCql2TextFilter() throws Exception {
		JsonNode page = json("/collections/pools/items?filter=" + q("poolType IN ('KIDS','WAVE') AND waterTemperature > 28"));
		assertThat(page.path("numberMatched").asInt()).isEqualTo(1);
		assertThat(page.path("features").get(0).path("id").asString()).isEqualTo("pool-kids");
	}

	@Test
	void itemsWithCql2JsonFilter() throws Exception {
		String filter = "{\"op\":\"s_intersects\",\"args\":[{\"property\":\"geometry\"},"
				+ "{\"bbox\":[11.6166,50.9051,11.6178,50.9054]}]}";
		JsonNode page = json("/collections/pools/items?filter-lang=cql2-json&filter=" + q(filter));
		assertThat(page.path("features").valueStream().map(f -> f.path("id").asString()))
				.containsExactly("pool-diving", "pool-outdoor");
	}

	@Test
	void bboxAndPaging() throws Exception {
		JsonNode page = json("/collections/assets/items?limit=5&bbox=11.615,50.905,11.619,50.907");
		assertThat(page.path("numberReturned").asInt()).isEqualTo(5);
		assertThat(page.path("numberMatched").asInt()).isEqualTo(43);
		assertThat(page.path("links").valueStream().map(l -> l.path("rel").asString())).contains("next");
	}

	@Test
	void singleFeatureFromJpa() throws Exception {
		JsonNode feature = json("/collections/lawns/items/lawn-big");
		assertThat(feature.path("featureType").asString()).isEqualTo("Lawn");
		assertThat(feature.path("geometry").path("coordinates").get(0).size()).isEqualTo(49);
		assertThat(feature.path("properties").path("lastInspection").asString()).isEqualTo("2026-06-15T00:00:00Z");
	}

	@Test
	void errorsAndHtml() throws Exception {
		assertThat(get("/collections/pools/items?filter=" + q("colour = 'red'")).statusCode()).isEqualTo(400);
		assertThat(get("/collections/nope").statusCode()).isEqualTo(404);
		HttpResponse<String> html = get("/collections?f=html");
		assertThat(html.headers().firstValue("Content-Type")).hasValueSatisfying(t -> assertThat(t).startsWith("text/html"));
		assertThat(html.body()).contains("Becken");
	}
}
