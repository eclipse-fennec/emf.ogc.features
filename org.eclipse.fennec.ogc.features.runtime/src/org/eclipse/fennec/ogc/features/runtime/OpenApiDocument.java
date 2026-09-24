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

import java.util.List;

import org.eclipse.fennec.ogc.features.api.CollectionDescriptor;

import tools.jackson.core.JsonGenerator;

/**
 * Generates the OpenAPI 3.0 definition of the server from its collections.
 */
final class OpenApiDocument {

	private OpenApiDocument() {
	}

	static void write(JsonGenerator g, String title, String description, String serverUrl,
			List<CollectionDescriptor> collections, List<String> filterLanguages) {
		g.writeStartObject();
		g.writeStringProperty("openapi", "3.0.3");
		g.writeObjectPropertyStart("info");
		g.writeStringProperty("title", title);
		g.writeStringProperty("description", description == null ? title : description);
		g.writeStringProperty("version", "0.1.0");
		g.writeObjectPropertyStart("license");
		g.writeStringProperty("name", "EPL-2.0");
		g.writeStringProperty("url", "https://www.eclipse.org/legal/epl-2.0/");
		g.writeEndObject();
		g.writeEndObject();
		g.writeArrayPropertyStart("servers");
		g.writeStartObject();
		g.writeStringProperty("url", serverUrl);
		g.writeEndObject();
		g.writeEndArray();

		g.writeObjectPropertyStart("paths");
		simple(g, "/", "getLandingPage", "Landing page", "Capabilities");
		simple(g, "/conformance", "getConformance", "Conformance classes", "Capabilities");
		simple(g, "/api", "getApi", "This API definition", "Capabilities");
		simple(g, "/collections", "getCollections", "Feature collections", "Capabilities");

		g.writeObjectPropertyStart("/collections/{collectionId}");
		g.writeObjectPropertyStart("get");
		operation(g, "describeCollection", "Describes a feature collection", "Capabilities");
		g.writeArrayPropertyStart("parameters");
		ref(g, "#/components/parameters/collectionId");
		ref(g, "#/components/parameters/f");
		g.writeEndArray();
		responses(g, "application/json");
		g.writeEndObject();
		g.writeEndObject();

		g.writeObjectPropertyStart("/collections/{collectionId}/queryables");
		g.writeObjectPropertyStart("get");
		operation(g, "getQueryables", "The properties of a collection a filter may use", "Capabilities");
		g.writeArrayPropertyStart("parameters");
		ref(g, "#/components/parameters/collectionId");
		g.writeEndArray();
		responses(g, "application/schema+json");
		g.writeEndObject();
		g.writeEndObject();

		g.writeObjectPropertyStart("/collections/{collectionId}/items");
		g.writeObjectPropertyStart("get");
		operation(g, "getFeatures", "Fetches the features of a collection", "Data");
		g.writeArrayPropertyStart("parameters");
		for (String p : List.of("collectionId", "f", "limit", "offset", "bbox", "datetime", "filter", "filter-lang",
				"filter-crs")) {
			ref(g, "#/components/parameters/" + p);
		}
		g.writeEndArray();
		responses(g, "application/geo+json");
		g.writeEndObject();
		g.writeEndObject();

		g.writeObjectPropertyStart("/collections/{collectionId}/items/{featureId}");
		g.writeObjectPropertyStart("get");
		operation(g, "getFeature", "Fetches a single feature", "Data");
		g.writeArrayPropertyStart("parameters");
		ref(g, "#/components/parameters/collectionId");
		ref(g, "#/components/parameters/featureId");
		ref(g, "#/components/parameters/f");
		g.writeEndArray();
		responses(g, "application/geo+json");
		g.writeEndObject();
		g.writeEndObject();
		g.writeEndObject();

		g.writeObjectPropertyStart("components");
		g.writeObjectPropertyStart("parameters");
		g.writeObjectPropertyStart("collectionId");
		g.writeStringProperty("name", "collectionId");
		g.writeStringProperty("in", "path");
		g.writeBooleanProperty("required", true);
		g.writeObjectPropertyStart("schema");
		g.writeStringProperty("type", "string");
		g.writeArrayPropertyStart("enum");
		for (CollectionDescriptor c : collections) {
			g.writeString(c.id());
		}
		g.writeEndArray();
		g.writeEndObject();
		g.writeEndObject();
		stringParameter(g, "featureId", "path", true, "Id of a feature", null);
		stringParameter(g, "f", "query", false, "Response format", List.of("json", "html"));
		g.writeObjectPropertyStart("limit");
		g.writeStringProperty("name", "limit");
		g.writeStringProperty("in", "query");
		g.writeObjectPropertyStart("schema");
		g.writeStringProperty("type", "integer");
		g.writeNumberProperty("minimum", 1);
		g.writeNumberProperty("default", 10);
		g.writeEndObject();
		g.writeEndObject();
		g.writeObjectPropertyStart("offset");
		g.writeStringProperty("name", "offset");
		g.writeStringProperty("in", "query");
		g.writeObjectPropertyStart("schema");
		g.writeStringProperty("type", "integer");
		g.writeNumberProperty("minimum", 0);
		g.writeNumberProperty("default", 0);
		g.writeEndObject();
		g.writeEndObject();
		g.writeObjectPropertyStart("bbox");
		g.writeStringProperty("name", "bbox");
		g.writeStringProperty("in", "query");
		g.writeStringProperty("style", "form");
		g.writeBooleanProperty("explode", false);
		g.writeObjectPropertyStart("schema");
		g.writeStringProperty("type", "array");
		g.writeNumberProperty("minItems", 4);
		g.writeNumberProperty("maxItems", 6);
		g.writeObjectPropertyStart("items");
		g.writeStringProperty("type", "number");
		g.writeEndObject();
		g.writeEndObject();
		g.writeEndObject();
		stringParameter(g, "datetime", "query", false, "Instant, date or interval, e.g. 2026-06-01/..", null);
		stringParameter(g, "filter", "query", false, "A filter expression in the filter language", null);
		stringParameter(g, "filter-lang", "query", false, "Language of the filter", filterLanguages);
		stringParameter(g, "filter-crs", "query", false, "CRS of the geometries in the filter",
				List.of(ItemsRequest.CRS84));
		g.writeEndObject();
		g.writeEndObject();
		g.writeEndObject();
	}

	private static void simple(JsonGenerator g, String path, String id, String summary, String tag) {
		g.writeObjectPropertyStart(path);
		g.writeObjectPropertyStart("get");
		operation(g, id, summary, tag);
		g.writeArrayPropertyStart("parameters");
		ref(g, "#/components/parameters/f");
		g.writeEndArray();
		responses(g, "/api".equals(path) ? MediaTypes.OPEN_API : "application/json");
		g.writeEndObject();
		g.writeEndObject();
	}

	private static void operation(JsonGenerator g, String id, String summary, String tag) {
		g.writeStringProperty("operationId", id);
		g.writeStringProperty("summary", summary);
		g.writeArrayPropertyStart("tags");
		g.writeString(tag);
		g.writeEndArray();
	}

	private static void responses(JsonGenerator g, String type) {
		g.writeObjectPropertyStart("responses");
		g.writeObjectPropertyStart("200");
		g.writeStringProperty("description", "Success");
		g.writeObjectPropertyStart("content");
		g.writeObjectPropertyStart(type);
		g.writeEndObject();
		g.writeObjectPropertyStart("text/html");
		g.writeEndObject();
		g.writeEndObject();
		g.writeEndObject();
		g.writeObjectPropertyStart("400");
		g.writeStringProperty("description", "Invalid request");
		g.writeEndObject();
		g.writeObjectPropertyStart("404");
		g.writeStringProperty("description", "Not found");
		g.writeEndObject();
		g.writeEndObject();
	}

	private static void ref(JsonGenerator g, String ref) {
		g.writeStartObject();
		g.writeStringProperty("$ref", ref);
		g.writeEndObject();
	}

	private static void stringParameter(JsonGenerator g, String name, String in, boolean required, String description,
			List<String> values) {
		g.writeObjectPropertyStart(name);
		g.writeStringProperty("name", name);
		g.writeStringProperty("in", in);
		g.writeBooleanProperty("required", required);
		g.writeStringProperty("description", description);
		g.writeObjectPropertyStart("schema");
		g.writeStringProperty("type", "string");
		if (values != null) {
			g.writeArrayPropertyStart("enum");
			for (String value : values) {
				g.writeString(value);
			}
			g.writeEndArray();
		}
		g.writeEndObject();
		g.writeEndObject();
	}
}
