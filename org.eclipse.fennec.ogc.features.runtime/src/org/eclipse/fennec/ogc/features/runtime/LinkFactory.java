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

import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.eclipse.fennec.ogc.features.api.CollectionDescriptor;

/**
 * Builds the links of the resources below a base URL, e.g. {@code http://host:8080/ogc}.
 *
 * @param base the base URL without trailing slash
 */
record LinkFactory(String base) {

	String url(String path) {
		return base + path;
	}

	String url(String path, Map<String, String> parameters) {
		if (parameters.isEmpty()) {
			return url(path);
		}
		return url(path) + "?" + parameters.entrySet().stream()
				.map(e -> encode(e.getKey()) + "=" + encode(e.getValue()))
				.collect(Collectors.joining("&"));
	}

	List<Link> landingLinks(String format) {
		List<Link> links = new ArrayList<>();
		self(links, "", format, "This document");
		links.add(new Link(url("/api"), "service-desc", MediaTypes.OPEN_API, "The API definition"));
		links.add(new Link(url("/api?f=html"), "service-doc", MediaTypes.HTML, "The API documentation"));
		links.add(new Link(url("/conformance"), "conformance", MediaTypes.JSON, "Conformance classes"));
		links.add(new Link(url("/conformance?f=html"), "conformance", MediaTypes.HTML, "Conformance classes"));
		links.add(new Link(url("/collections"), "data", MediaTypes.JSON, "Feature collections"));
		links.add(new Link(url("/collections?f=html"), "data", MediaTypes.HTML, "Feature collections"));
		links.add(new Link(url("/viewer/"), "related", MediaTypes.HTML, "Map viewer"));
		return links;
	}

	List<Link> selfLinks(String path, String format, String title) {
		List<Link> links = new ArrayList<>();
		self(links, path, format, title);
		return links;
	}

	List<Link> collectionLinks(CollectionDescriptor collection, String format) {
		String path = "/collections/" + encode(collection.id());
		List<Link> links = new ArrayList<>();
		self(links, path, format, collection.title());
		links.add(new Link(url(path + "/items"), "items", MediaTypes.GEO_JSON, "Features as GeoJSON"));
		links.add(new Link(url(path + "/items?f=html"), "items", MediaTypes.HTML, "Features as HTML"));
		links.add(new Link(url(path + "/queryables"), "http://www.opengis.net/def/rel/ogc/1.0/queryables",
				MediaTypes.JSON_SCHEMA, "Queryables"));
		return links;
	}

	List<Link> itemsLinks(CollectionDescriptor collection, ItemsRequest request, int returned, long matched,
			String format) {
		String path = "/collections/" + encode(collection.id()) + "/items";
		List<Link> links = new ArrayList<>();
		Map<String, String> self = withOffset(request, request.offset());
		self.remove("f");
		links.add(new Link(url(path, with(self, "f", "json")), "json".equals(format) ? "self" : "alternate",
				MediaTypes.GEO_JSON, "This page as GeoJSON"));
		links.add(new Link(url(path, with(self, "f", "html")), "html".equals(format) ? "self" : "alternate",
				MediaTypes.HTML, "This page as HTML"));
		boolean more = returned == request.limit()
				&& (matched < 0 || request.offset() + returned < matched);
		if (more) {
			links.add(new Link(url(path, withOffset(request, request.offset() + request.limit())), "next",
					type(format, MediaTypes.GEO_JSON), "Next page"));
		}
		if (request.offset() > 0) {
			links.add(new Link(url(path, withOffset(request, Math.max(0, request.offset() - request.limit()))), "prev",
					type(format, MediaTypes.GEO_JSON), "Previous page"));
		}
		links.add(new Link(url("/collections/" + encode(collection.id())), "collection", MediaTypes.JSON,
				collection.title()));
		return links;
	}

	List<Link> featureLinks(CollectionDescriptor collection, String id) {
		String path = "/collections/" + encode(collection.id()) + "/items/" + encode(id);
		return List.of(new Link(url(path), "self", MediaTypes.GEO_JSON, null),
				new Link(url(path + "?f=html"), "alternate", MediaTypes.HTML, null),
				new Link(url("/collections/" + encode(collection.id())), "collection", MediaTypes.JSON,
						collection.title()));
	}

	private void self(List<Link> links, String path, String format, String title) {
		String json = "/api".equals(path) ? MediaTypes.OPEN_API : MediaTypes.JSON;
		links.add(new Link(url(path + "?f=json"), "json".equals(format) ? "self" : "alternate", json, title));
		links.add(new Link(url(path + "?f=html"), "html".equals(format) ? "self" : "alternate", MediaTypes.HTML, title));
	}

	private static Map<String, String> withOffset(ItemsRequest request, int offset) {
		Map<String, String> parameters = new LinkedHashMap<>(request.parameters());
		if (offset > 0) {
			parameters.put("offset", Integer.toString(offset));
		}
		return parameters;
	}

	private static Map<String, String> with(Map<String, String> parameters, String key, String value) {
		Map<String, String> result = new LinkedHashMap<>(parameters);
		result.put(key, value);
		return result;
	}

	private static String type(String format, String json) {
		return "html".equals(format) ? MediaTypes.HTML : json;
	}

	static String encode(String value) {
		return URLEncoder.encode(value, StandardCharsets.UTF_8).replace("+", "%20");
	}
}
