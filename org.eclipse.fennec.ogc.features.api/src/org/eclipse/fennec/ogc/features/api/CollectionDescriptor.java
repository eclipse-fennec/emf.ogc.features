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
package org.eclipse.fennec.ogc.features.api;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EStructuralFeature;

/**
 * An OGC API Features collection, derived from an EClass carrying the
 * {@link OgcFeaturesAnnotations#SOURCE} annotation.
 *
 * @param id collection id as used in the URL
 * @param title human readable title
 * @param description human readable description, may be {@code null}
 * @param type the EClass whose instances are the collection's features; may be abstract,
 *        then the collection contains the instances of all its concrete subclasses
 * @param idAttribute the attribute used as feature id
 * @param geometry the geometry attribute, may be {@code null} for a collection without geometry
 * @param bbox the persisted bounding box, may be {@code null}
 * @param temporal the date/time attribute {@code datetime} filters on, may be {@code null}
 * @param layerGroup the viewer layer group, may be {@code null}
 * @param style the viewer style, may be {@code null}
 */
public record CollectionDescriptor(String id, String title, String description, EClass type,
		EAttribute idAttribute, EAttribute geometry, BboxAttributes bbox, EAttribute temporal,
		String layerGroup, String style) {

	public CollectionDescriptor {
		Objects.requireNonNull(id, "id");
		Objects.requireNonNull(title, "title");
		Objects.requireNonNull(type, "type");
		Objects.requireNonNull(idAttribute, "idAttribute");
	}

	/**
	 * Derives the collections of all EClasses of the package that are annotated with
	 * {@code collection=true}.
	 *
	 * @param ePackage the package
	 * @return the collections in classifier order
	 * @throws IllegalArgumentException if an annotated class is inconsistent
	 */
	public static List<CollectionDescriptor> of(EPackage ePackage) {
		List<CollectionDescriptor> result = new ArrayList<>();
		for (EClassifier classifier : ePackage.getEClassifiers()) {
			if (classifier instanceof EClass eClass) {
				of(eClass).ifPresent(result::add);
			}
		}
		return result;
	}

	/**
	 * Derives the collection of an EClass.
	 *
	 * @param eClass the class
	 * @return the collection, empty if the class is not annotated with {@code collection=true}
	 * @throws IllegalArgumentException if the annotation names attributes the class lacks
	 */
	public static Optional<CollectionDescriptor> of(EClass eClass) {
		EAnnotation own = eClass.getEAnnotation(OgcFeaturesAnnotations.SOURCE);
		if (own == null || !Boolean.parseBoolean(own.getDetails().get(OgcFeaturesAnnotations.COLLECTION))) {
			return Optional.empty();
		}
		String id = own.getDetails().get(OgcFeaturesAnnotations.ID);
		String title = own.getDetails().get(OgcFeaturesAnnotations.TITLE);
		String description = own.getDetails().get(OgcFeaturesAnnotations.DESCRIPTION);

		String idName = inherited(eClass, OgcFeaturesAnnotations.ID_ATTRIBUTE);
		EAttribute idAttribute = idName != null ? attribute(eClass, idName) : eClass.getEIDAttribute();
		if (idAttribute == null) {
			throw new IllegalArgumentException("Collection class " + eClass.getName()
					+ " has neither an ID attribute nor an '" + OgcFeaturesAnnotations.ID_ATTRIBUTE + "' detail");
		}
		String geometryName = inherited(eClass, OgcFeaturesAnnotations.GEOMETRY);
		EAttribute geometry = geometryName != null ? attribute(eClass, geometryName) : null;
		String bboxNames = inherited(eClass, OgcFeaturesAnnotations.BBOX);
		BboxAttributes bbox = bboxNames != null ? bbox(eClass, bboxNames) : null;
		String temporalName = inherited(eClass, OgcFeaturesAnnotations.TEMPORAL);
		EAttribute temporal = temporalName != null ? attribute(eClass, temporalName) : null;

		return Optional.of(new CollectionDescriptor(
				id != null ? id : eClass.getName(),
				title != null ? title : eClass.getName(),
				description, eClass, idAttribute, geometry, bbox, temporal,
				inherited(eClass, OgcFeaturesAnnotations.LAYER_GROUP),
				own.getDetails().get(OgcFeaturesAnnotations.STYLE)));
	}

	/**
	 * The attributes a feature of this collection exposes as properties: all attributes of
	 * the collection type except the geometry and the bounding box. Instances of subclasses
	 * may carry more.
	 *
	 * @return the property attributes
	 */
	public List<EAttribute> properties() {
		return type.getEAllAttributes().stream().filter(this::isProperty).toList();
	}

	/**
	 * @param attribute an attribute of a feature
	 * @return {@code true} if it is exposed as a property, i.e. is neither geometry nor bbox
	 */
	public boolean isProperty(EAttribute attribute) {
		if (attribute.equals(geometry)) {
			return false;
		}
		return bbox == null || !(attribute.equals(bbox.minX()) || attribute.equals(bbox.minY())
				|| attribute.equals(bbox.maxX()) || attribute.equals(bbox.maxY()));
	}

	/**
	 * @param name a property name
	 * @return the property attribute of the collection type, empty if there is none
	 */
	public Optional<EAttribute> property(String name) {
		EStructuralFeature feature = type.getEStructuralFeature(name);
		return feature instanceof EAttribute attribute && isProperty(attribute)
				? Optional.of(attribute) : Optional.empty();
	}

	private static String inherited(EClass eClass, String key) {
		String value = detail(eClass, key);
		if (value != null) {
			return value;
		}
		for (EClass superType : eClass.getEAllSuperTypes()) {
			value = detail(superType, key);
			if (value != null) {
				return value;
			}
		}
		return null;
	}

	private static String detail(EClass eClass, String key) {
		EAnnotation annotation = eClass.getEAnnotation(OgcFeaturesAnnotations.SOURCE);
		return annotation == null ? null : annotation.getDetails().get(key);
	}

	private static EAttribute attribute(EClass eClass, String name) {
		EStructuralFeature feature = eClass.getEStructuralFeature(name.trim());
		if (feature instanceof EAttribute attribute) {
			return attribute;
		}
		throw new IllegalArgumentException("Collection class " + eClass.getName()
				+ " has no attribute '" + name.trim() + "'");
	}

	private static BboxAttributes bbox(EClass eClass, String names) {
		String[] parts = names.split(",");
		if (parts.length != 4) {
			throw new IllegalArgumentException("Collection class " + eClass.getName()
					+ ": '" + OgcFeaturesAnnotations.BBOX + "' needs four attribute names minX,minY,maxX,maxY");
		}
		return new BboxAttributes(attribute(eClass, parts[0]), attribute(eClass, parts[1]),
				attribute(eClass, parts[2]), attribute(eClass, parts[3]));
	}
}
