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
import java.util.Collection;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.ExtendedMetaData;
import org.eclipse.fennec.ogc.features.api.CollectionDescriptor;
import org.eclipse.fennec.ogc.features.api.OgcFeaturesAnnotations;
import org.geojson.Geometry;

import tools.jackson.core.JacksonException;
import tools.jackson.databind.JsonNode;
import tools.jackson.databind.json.JsonMapper;

/**
 * Turns a GeoJSON FeatureCollection into instances of annotated collection classes.
 * <p>
 * The EClass of a feature is either named by one of its properties or given for the whole
 * collection. The feature id becomes the collection's id attribute, the geometry its
 * geometry attribute, and every other property is set on the attribute of the same name, or
 * of that name in its ExtendedMetaData, from its literal; an array becomes a comma separated
 * text. Properties can be ignored, e.g. the simplestyle members of a styled GeoJSON file. The
 * bounding box attributes are computed from the geometry. This way demo and test data can be
 * drawn and checked with any GeoJSON tool while it still ends up as a typed EMF model.
 */
public final class GeoJsonFeatureImporter {

	private static final JsonMapper MAPPER = JsonMapper.builder().build();

	private final GeoJsonText text;
	private final EPackage ePackage;
	private final String typeProperty;
	private final Set<String> ignored;

	/**
	 * @param text the GeoJSON geometry reader
	 * @param ePackage the package holding the feature classes
	 * @param typeProperty name of the feature property naming the EClass, {@code null} if
	 *        every read names the class with {@link #read(InputStream, EClass)}
	 */
	public GeoJsonFeatureImporter(GeoJsonText text, EPackage ePackage, String typeProperty) {
		this(text, ePackage, typeProperty, Set.of());
	}

	private GeoJsonFeatureImporter(GeoJsonText text, EPackage ePackage, String typeProperty, Set<String> ignored) {
		this.text = Objects.requireNonNull(text, "text");
		this.ePackage = Objects.requireNonNull(ePackage, "ePackage");
		this.typeProperty = typeProperty;
		this.ignored = Set.copyOf(ignored);
	}

	/**
	 * @param properties names of feature properties to skip where the class has no attribute for them
	 * @return an importer that skips them in addition
	 */
	public GeoJsonFeatureImporter ignoring(Collection<String> properties) {
		Set<String> all = new HashSet<>(ignored);
		all.addAll(properties);
		return new GeoJsonFeatureImporter(text, ePackage, typeProperty, all);
	}

	/**
	 * @param in a GeoJSON FeatureCollection
	 * @return one object per feature, in document order
	 * @throws IOException if the stream cannot be read
	 * @throws IllegalArgumentException if a feature does not fit the model
	 */
	public List<EObject> read(InputStream in) throws IOException {
		return read(in, null);
	}

	/**
	 * @param in a GeoJSON FeatureCollection
	 * @param type the class of all features, {@code null} to take it from the type property
	 * @return one object per feature, in document order
	 * @throws IOException if the stream cannot be read
	 * @throws IllegalArgumentException if a feature does not fit the model
	 */
	public List<EObject> read(InputStream in, EClass type) throws IOException {
		if (type == null && typeProperty == null) {
			throw new IllegalArgumentException("Neither a type property nor a type is given");
		}
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
			result.add(toEObject(feature, type));
		}
		return result;
	}

	private EObject toEObject(JsonNode feature, EClass type) {
		String id = feature.path("id").asString(null);
		JsonNode properties = feature.path("properties");
		String typeName = type != null ? type.getName() : properties.path(typeProperty).asString(null);
		EClassifier classifier = type != null ? type : typeName == null ? null : ePackage.getEClassifier(typeName);
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
			if (property.getKey().equals(typeProperty) || property.getValue().isNull()) {
				continue;
			}
			EAttribute a = attribute(eClass, property.getKey());
			if (a == null && ignored.contains(property.getKey())) {
				continue;
			}
			if (a == null) {
				throw new IllegalArgumentException("Feature " + id + ": " + typeName
						+ " has no single valued attribute '" + property.getKey() + "'");
			}
			try {
				object.eSet(a, value(a, literal(property.getValue())));
			} catch (RuntimeException e) {
				throw new IllegalArgumentException("Feature " + id + ": invalid value for " + typeName + "."
						+ property.getKey() + ": " + property.getValue(), e);
			}
		}
		return object;
	}

	/**
	 * @return the single valued attribute named so, directly, in its ExtendedMetaData or its
	 *         {@link OgcFeaturesAnnotations#PROPERTY} detail
	 */
	private static EAttribute attribute(EClass eClass, String key) {
		for (EAttribute attribute : eClass.getEAllAttributes()) {
			if (!attribute.isMany() && (key.equals(attribute.getName())
					|| key.equals(ExtendedMetaData.INSTANCE.getName(attribute))
					|| key.equals(EcoreUtil.getAnnotation(attribute, OgcFeaturesAnnotations.SOURCE,
							OgcFeaturesAnnotations.PROPERTY)))) {
				return attribute;
			}
		}
		return null;
	}

	private static String literal(JsonNode value) {
		if (value.isArray()) {
			List<String> parts = new ArrayList<>();
			value.forEach(v -> parts.add(v.asString()));
			return String.join(", ", parts);
		}
		return value.asString();
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
