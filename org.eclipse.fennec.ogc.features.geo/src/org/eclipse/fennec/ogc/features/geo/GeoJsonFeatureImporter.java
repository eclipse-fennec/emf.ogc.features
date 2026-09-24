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
package org.eclipse.fennec.ogc.features.geo;

import java.io.IOException;
import java.io.InputStream;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Objects;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.fennec.ogc.features.api.CollectionDescriptor;
import org.geojson.Geometry;

import tools.jackson.core.JacksonException;
import tools.jackson.databind.JsonNode;
import tools.jackson.databind.json.JsonMapper;

/**
 * Turns a GeoJSON FeatureCollection into instances of annotated collection classes.
 * <p>
 * One property of each feature names its EClass; the feature id becomes the collection's
 * id attribute, the geometry its geometry attribute, and every other property is set on the
 * attribute of the same name from its literal. The bounding box attributes are computed
 * from the geometry. This way demo and test data can be drawn and checked with any GeoJSON
 * tool while it still ends up as a typed EMF model.
 */
public final class GeoJsonFeatureImporter {

	private static final JsonMapper MAPPER = JsonMapper.builder().build();

	private final GeoJsonText text;
	private final EPackage ePackage;
	private final String typeProperty;

	/**
	 * @param text the GeoJSON geometry reader
	 * @param ePackage the package holding the feature classes
	 * @param typeProperty name of the feature property naming the EClass
	 */
	public GeoJsonFeatureImporter(GeoJsonText text, EPackage ePackage, String typeProperty) {
		this.text = Objects.requireNonNull(text, "text");
		this.ePackage = Objects.requireNonNull(ePackage, "ePackage");
		this.typeProperty = Objects.requireNonNull(typeProperty, "typeProperty");
	}

	/**
	 * @param in a GeoJSON FeatureCollection
	 * @return one object per feature, in document order
	 * @throws IOException if the stream cannot be read
	 * @throws IllegalArgumentException if a feature does not fit the model
	 */
	public List<EObject> read(InputStream in) throws IOException {
		JsonNode root;
		try {
			root = MAPPER.readTree(in);
		} catch (JacksonException e) {
			throw new IOException("Invalid GeoJSON: " + e.getMessage(), e);
		}
		if (!"FeatureCollection".equals(root.path("type").asString(null))) {
			throw new IllegalArgumentException("GeoJSON is no FeatureCollection");
		}
		List<EObject> result = new ArrayList<>();
		for (JsonNode feature : root.path("features")) {
			result.add(toEObject(feature));
		}
		return result;
	}

	private EObject toEObject(JsonNode feature) {
		String id = feature.path("id").asString(null);
		JsonNode properties = feature.path("properties");
		String typeName = properties.path(typeProperty).asString(null);
		EClassifier classifier = typeName == null ? null : ePackage.getEClassifier(typeName);
		if (!(classifier instanceof EClass eClass) || eClass.isAbstract()) {
			throw new IllegalArgumentException("Feature " + id + ": '" + typeProperty + "' names no concrete class of "
					+ ePackage.getNsURI() + ": " + typeName);
		}
		CollectionDescriptor collection = CollectionDescriptor.of(eClass).orElseThrow(
				() -> new IllegalArgumentException("Feature " + id + ": class " + typeName + " is no collection"));

		EObject object = EcoreUtil.create(eClass);
		if (id != null) {
			object.eSet(collection.idAttribute(), EcoreUtil.createFromString(collection.idAttribute().getEAttributeType(), id));
		}
		JsonNode geometryNode = feature.path("geometry");
		if (collection.geometry() != null && geometryNode.isObject()) {
			Geometry geometry = text.read(MAPPER.writeValueAsString(geometryNode));
			object.eSet(collection.geometry(), geometry);
			if (collection.bbox() != null) {
				collection.bbox().write(object, Geometries.envelope(geometry));
			}
		}
		for (Map.Entry<String, JsonNode> property : properties.properties()) {
			if (typeProperty.equals(property.getKey()) || property.getValue().isNull()) {
				continue;
			}
			EStructuralFeature attribute = eClass.getEStructuralFeature(property.getKey());
			if (!(attribute instanceof EAttribute a) || a.isMany()) {
				throw new IllegalArgumentException("Feature " + id + ": " + typeName
						+ " has no single valued attribute '" + property.getKey() + "'");
			}
			try {
				object.eSet(a, value(a, property.getValue().asString()));
			} catch (RuntimeException e) {
				throw new IllegalArgumentException("Feature " + id + ": invalid value for " + typeName + "."
						+ property.getKey() + ": " + property.getValue(), e);
			}
		}
		return object;
	}

	/**
	 * GeoJSON dates are ISO 8601; a date without time is the start of that day in UTC, not in
	 * the local zone {@code EcoreUtil.createFromString} would use.
	 */
	private static Object value(EAttribute attribute, String text) {
		if (attribute.getEAttributeType().getInstanceClass() == Date.class) {
			if (text.length() == 10) {
				return Date.from(LocalDate.parse(text).atStartOfDay(ZoneOffset.UTC).toInstant());
			}
			return Date.from(OffsetDateTime.parse(text).toInstant());
		}
		return EcoreUtil.createFromString(attribute.getEAttributeType(), text);
	}
}
