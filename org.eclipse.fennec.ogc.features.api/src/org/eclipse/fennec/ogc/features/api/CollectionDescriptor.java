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
 * An OGC API Features collection: an EClass and the attributes that make its instances
 * features. Derived from the {@link OgcFeaturesAnnotations#SOURCE} annotation of the class
 * with {@link #of(EClass)}, or declared by a {@link CollectionProvider} through
 * {@link #builder(EClass)}.
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
	 * Derives the collection of an EClass from its annotation. Keys are looked up on the
	 * class first and then along its super types, except {@code collection}, {@code id},
	 * {@code title}, {@code description} and {@code style}, which are the class' own.
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
		return Optional.of(builder(eClass)
				.id(own.getDetails().get(OgcFeaturesAnnotations.ID))
				.title(own.getDetails().get(OgcFeaturesAnnotations.TITLE))
				.description(own.getDetails().get(OgcFeaturesAnnotations.DESCRIPTION))
				.idAttribute(inherited(eClass, OgcFeaturesAnnotations.ID_ATTRIBUTE))
				.geometry(inherited(eClass, OgcFeaturesAnnotations.GEOMETRY))
				.bbox(inherited(eClass, OgcFeaturesAnnotations.BBOX))
				.temporal(inherited(eClass, OgcFeaturesAnnotations.TEMPORAL))
				.layerGroup(inherited(eClass, OgcFeaturesAnnotations.LAYER_GROUP))
				.style(own.getDetails().get(OgcFeaturesAnnotations.STYLE))
				.build());
	}

	/**
	 * Starts a collection of a class, with the same defaults and checks as the annotation:
	 * id and title default to the class name, the id attribute to the class' ID attribute.
	 *
	 * @param type the EClass whose instances are the features
	 * @return the builder
	 */
	public static Builder builder(EClass type) {
		return new Builder(type);
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

	/**
	 * Builds a {@link CollectionDescriptor} from attribute names. Every setter accepts
	 * {@code null} or a blank string for "not set"; {@link #build()} validates.
	 */
	public static final class Builder {

		private final EClass type;
		private String id;
		private String title;
		private String description;
		private String idAttribute;
		private String geometry;
		private String bbox;
		private String temporal;
		private String layerGroup;
		private String style;

		private Builder(EClass type) {
			this.type = Objects.requireNonNull(type, "type");
		}

		/** @param id the collection id used in the URL, defaults to the class name */
		public Builder id(String id) {
			this.id = blankToNull(id);
			return this;
		}

		/** @param title the human readable title, defaults to the class name */
		public Builder title(String title) {
			this.title = blankToNull(title);
			return this;
		}

		/** @param description the human readable description */
		public Builder description(String description) {
			this.description = blankToNull(description);
			return this;
		}

		/** @param name the attribute used as feature id, defaults to the class' ID attribute */
		public Builder idAttribute(String name) {
			this.idAttribute = blankToNull(name);
			return this;
		}

		/** @param name the attribute holding the geometry */
		public Builder geometry(String name) {
			this.geometry = blankToNull(name);
			return this;
		}

		/** @param names four attribute names {@code minX,minY,maxX,maxY} holding the bounding box */
		public Builder bbox(String names) {
			this.bbox = blankToNull(names);
			return this;
		}

		/**
		 * @param minX the attribute holding the western edge
		 * @param minY the attribute holding the southern edge
		 * @param maxX the attribute holding the eastern edge
		 * @param maxY the attribute holding the northern edge
		 */
		public Builder bbox(String minX, String minY, String maxX, String maxY) {
			return bbox(String.join(",", minX, minY, maxX, maxY));
		}

		/** @param name the date/time attribute a {@code datetime} parameter filters on */
		public Builder temporal(String name) {
			this.temporal = blankToNull(name);
			return this;
		}

		/** @param layerGroup the group of layers a viewer shows the collection in */
		public Builder layerGroup(String layerGroup) {
			this.layerGroup = blankToNull(layerGroup);
			return this;
		}

		/** @param style the display style for a viewer, a CSS color or a JSON object */
		public Builder style(String style) {
			this.style = blankToNull(style);
			return this;
		}

		/**
		 * @return the descriptor
		 * @throws IllegalArgumentException if the class lacks a named attribute, or has
		 *         neither an ID attribute nor an id attribute name
		 */
		public CollectionDescriptor build() {
			EAttribute idAttr = idAttribute != null ? attribute(type, idAttribute) : type.getEIDAttribute();
			if (idAttr == null) {
				throw new IllegalArgumentException("Collection class " + type.getName()
						+ " has neither an ID attribute nor an '" + OgcFeaturesAnnotations.ID_ATTRIBUTE + "'");
			}
			return new CollectionDescriptor(
					id != null ? id : type.getName(),
					title != null ? title : type.getName(),
					description, type, idAttr,
					geometry != null ? attribute(type, geometry) : null,
					bbox != null ? CollectionDescriptor.bbox(type, bbox) : null,
					temporal != null ? attribute(type, temporal) : null,
					layerGroup, style);
		}

		private static String blankToNull(String value) {
			return value == null || value.isBlank() ? null : value.trim();
		}
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
