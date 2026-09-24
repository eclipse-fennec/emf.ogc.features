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

import java.io.OutputStream;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.Instant;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EEnumLiteral;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.fennec.ogc.features.api.CollectionDescriptor;
import org.eclipse.fennec.ogc.features.api.Envelope;
import org.eclipse.fennec.ogc.features.api.FeatureResult;
import org.eclipse.fennec.ogc.features.geo.GeometryJson;

import tools.jackson.core.JsonGenerator;
import tools.jackson.databind.json.JsonMapper;

/**
 * Writes the JSON and GeoJSON representations of the OGC API resources.
 */
final class JsonEncoder {

	private static final JsonMapper MAPPER = JsonMapper.builder().build();

	private final JsonGenerator g;

	private JsonEncoder(JsonGenerator generator) {
		this.g = generator;
	}

	interface Body {
		void write(JsonEncoder encoder);
	}

	/**
	 * Writes one document to the stream.
	 */
	static void write(OutputStream out, Body body) {
		try (JsonGenerator generator = MAPPER.createGenerator(out)) {
			body.write(new JsonEncoder(generator));
		}
	}

	void landingPage(String title, String description, List<Link> links) {
		g.writeStartObject();
		g.writeStringProperty("title", title);
		if (description != null) {
			g.writeStringProperty("description", description);
		}
		links(links);
		g.writeEndObject();
	}

	void conformance(List<String> classes) {
		g.writeStartObject();
		g.writeArrayPropertyStart("conformsTo");
		for (String c : classes) {
			g.writeString(c);
		}
		g.writeEndArray();
		g.writeEndObject();
	}

	void collections(List<CollectionView> collections, List<Link> links) {
		g.writeStartObject();
		links(links);
		g.writeArrayPropertyStart("collections");
		for (CollectionView collection : collections) {
			collection(collection);
		}
		g.writeEndArray();
		g.writeEndObject();
	}

	void collection(CollectionView view) {
		CollectionDescriptor c = view.descriptor();
		g.writeStartObject();
		g.writeStringProperty("id", c.id());
		g.writeStringProperty("title", c.title());
		if (c.description() != null) {
			g.writeStringProperty("description", c.description());
		}
		g.writeStringProperty("itemType", "feature");
		g.writeArrayPropertyStart("crs");
		g.writeString(ItemsRequest.CRS84);
		g.writeEndArray();
		Optional<Envelope> extent = view.extent();
		if (extent.isPresent()) {
			Envelope e = extent.get();
			g.writeObjectPropertyStart("extent");
			g.writeObjectPropertyStart("spatial");
			g.writeArrayPropertyStart("bbox");
			g.writeStartArray();
			g.writeNumber(e.minX());
			g.writeNumber(e.minY());
			g.writeNumber(e.maxX());
			g.writeNumber(e.maxY());
			g.writeEndArray();
			g.writeEndArray();
			g.writeStringProperty("crs", ItemsRequest.CRS84);
			g.writeEndObject();
			g.writeEndObject();
		}
		// display hints for map clients, not part of OGC API Features
		if (c.layerGroup() != null) {
			g.writeStringProperty("layerGroup", c.layerGroup());
		}
		if (c.style() != null) {
			g.writeStringProperty("style", c.style());
		}
		links(view.links());
		g.writeEndObject();
	}

	void items(CollectionDescriptor collection, FeatureResult result, List<Link> links, LinkFactory linkFactory) {
		g.writeStartObject();
		g.writeStringProperty("type", "FeatureCollection");
		g.writeArrayPropertyStart("features");
		for (EObject feature : result.features()) {
			feature(collection, feature, null, linkFactory);
		}
		g.writeEndArray();
		if (result.hasNumberMatched()) {
			g.writeNumberProperty("numberMatched", result.numberMatched());
		}
		g.writeNumberProperty("numberReturned", result.features().size());
		g.writeStringProperty("timeStamp", Instant.now().toString());
		links(links);
		g.writeEndObject();
	}

	void feature(CollectionDescriptor collection, EObject feature, List<Link> links, LinkFactory linkFactory) {
		String id = FeatureValues.id(collection, feature);
		g.writeStartObject();
		g.writeStringProperty("type", "Feature");
		g.writeStringProperty("id", id);
		// JSON-FG's member for the type of a feature, useful in collections of several types
		g.writeStringProperty("featureType", feature.eClass().getName());
		g.writeName("geometry");
		GeometryJson.write(g, FeatureValues.geometry(collection, feature));
		g.writeObjectPropertyStart("properties");
		for (Map.Entry<String, Object> property : FeatureValues.properties(collection, feature).entrySet()) {
			g.writeName(property.getKey());
			FeatureValues.write(g, property.getValue());
		}
		g.writeEndObject();
		links(links != null ? links : linkFactory.featureLinks(collection, id));
		g.writeEndObject();
	}

	void queryables(CollectionDescriptor collection, String id) {
		g.writeStartObject();
		g.writeStringProperty("$schema", "https://json-schema.org/draft/2020-12/schema");
		g.writeStringProperty("$id", id);
		g.writeStringProperty("type", "object");
		g.writeStringProperty("title", collection.title());
		g.writeObjectPropertyStart("properties");
		if (collection.geometry() != null) {
			g.writeObjectPropertyStart(collection.geometry().getName());
			g.writeStringProperty("title", "Geometry");
			g.writeStringProperty("format", "geometry-any");
			g.writeStringProperty("x-ogc-role", "primary-geometry");
			g.writeEndObject();
		}
		for (EAttribute property : collection.properties()) {
			g.writeObjectPropertyStart(property.getName());
			schemaType(property);
			if (property.equals(collection.idAttribute())) {
				g.writeStringProperty("x-ogc-role", "id");
			} else if (property.equals(collection.temporal())) {
				g.writeStringProperty("x-ogc-role", "primary-instant");
			}
			g.writeEndObject();
		}
		g.writeEndObject();
		g.writeBooleanProperty("additionalProperties", false);
		g.writeEndObject();
	}

	void exception(RequestException e) {
		g.writeStartObject();
		g.writeStringProperty("code", e.code());
		g.writeStringProperty("description", e.getMessage());
		g.writeEndObject();
	}

	JsonGenerator generator() {
		return g;
	}

	private void schemaType(EAttribute attribute) {
		if (attribute.getEAttributeType() instanceof EEnum eEnum) {
			g.writeStringProperty("type", "string");
			g.writeArrayPropertyStart("enum");
			for (EEnumLiteral literal : eEnum.getELiterals()) {
				g.writeString(literal.getLiteral());
			}
			g.writeEndArray();
			return;
		}
		Class<?> type = attribute.getEAttributeType().getInstanceClass();
		if (type == int.class || type == Integer.class || type == long.class || type == Long.class
				|| type == short.class || type == Short.class || type == BigInteger.class) {
			g.writeStringProperty("type", "integer");
		} else if (type == double.class || type == Double.class || type == float.class || type == Float.class
				|| type == BigDecimal.class) {
			g.writeStringProperty("type", "number");
		} else if (type == boolean.class || type == Boolean.class) {
			g.writeStringProperty("type", "boolean");
		} else if (type == Date.class || type == Instant.class) {
			g.writeStringProperty("type", "string");
			g.writeStringProperty("format", "date-time");
		} else {
			g.writeStringProperty("type", "string");
		}
	}

	private void links(List<Link> links) {
		g.writeArrayPropertyStart("links");
		for (Link link : links) {
			g.writeStartObject();
			g.writeStringProperty("href", link.href());
			g.writeStringProperty("rel", link.rel());
			if (link.type() != null) {
				g.writeStringProperty("type", link.type());
			}
			if (link.title() != null) {
				g.writeStringProperty("title", link.title());
			}
			g.writeEndObject();
		}
		g.writeEndArray();
	}
}
