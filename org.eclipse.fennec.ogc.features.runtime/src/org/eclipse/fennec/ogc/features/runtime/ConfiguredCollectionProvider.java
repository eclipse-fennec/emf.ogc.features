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

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.fennec.ogc.features.api.CollectionDescriptor;
import org.eclipse.fennec.ogc.features.api.CollectionProvider;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.ConfigurationPolicy;
import org.osgi.service.metatype.annotations.AttributeDefinition;
import org.osgi.service.metatype.annotations.Designate;
import org.osgi.service.metatype.annotations.ObjectClassDefinition;

/**
 * A collection declared by configuration: the same details as the annotation, for a class
 * whose model the server does not own. One factory configuration is one collection; a
 * server instance picks it up like an annotated class, and it replaces the annotated
 * collection of the same id.
 */
@Component(name = ConfiguredCollectionProvider.PID, service = CollectionProvider.class,
		configurationPolicy = ConfigurationPolicy.REQUIRE)
@Designate(ocd = ConfiguredCollectionProvider.Config.class, factory = true)
public class ConfiguredCollectionProvider implements CollectionProvider {

	/** the factory PID */
	public static final String PID = "org.eclipse.fennec.ogc.features.collection";

	@ObjectClassDefinition(name = "Fennec OGC API Features Collection",
			description = "Declares an EClass as a collection without annotating the model")
	public @interface Config {

		@AttributeDefinition(description = "The feature class as 'nsURI#EClass', e.g. https://example.org/pools#Pool")
		String type();

		@AttributeDefinition(required = false, description = "Collection id used in the URL; the class name when empty")
		String id();

		@AttributeDefinition(required = false, description = "Human readable title; the class name when empty")
		String title();

		@AttributeDefinition(required = false, description = "Human readable description")
		String description();

		@AttributeDefinition(required = false, description = "Attribute used as feature id; the class' ID attribute when empty")
		String idAttribute();

		@AttributeDefinition(required = false, description = "Attribute holding the geometry (org.geojson.Geometry)")
		String geometry();

		@AttributeDefinition(required = false, description = "The four attributes holding the bounding box: minX, minY, maxX, maxY")
		String[] bbox() default {};

		@AttributeDefinition(required = false, description = "Date/time attribute the datetime parameter filters on")
		String temporal();

		@AttributeDefinition(required = false, description = "Group of layers a viewer shows the collection in")
		String layerGroup();

		@AttributeDefinition(required = false, description = "Display style for a viewer: a CSS color or a JSON object")
		String style();
	}

	private final Config config;
	private final String nsURI;
	private final String className;

	/**
	 * @param config the configuration
	 * @throws IllegalArgumentException if {@code type} is not {@code nsURI#EClass}
	 */
	@Activate
	public ConfiguredCollectionProvider(Config config) {
		this.config = config;
		String type = config.type() == null ? "" : config.type().trim();
		int hash = type.lastIndexOf('#');
		if (hash <= 0 || hash == type.length() - 1) {
			throw new IllegalArgumentException("Collection type must be 'nsURI#EClass' but is '" + type + "'");
		}
		this.nsURI = type.substring(0, hash);
		this.className = type.substring(hash + 1);
	}

	@Override
	public List<CollectionDescriptor> collections(EPackage ePackage) {
		if (!nsURI.equals(ePackage.getNsURI())) {
			return List.of();
		}
		EClassifier classifier = ePackage.getEClassifier(className);
		if (!(classifier instanceof EClass eClass)) {
			throw new IllegalArgumentException("Package " + nsURI + " has no class '" + className + "'");
		}
		CollectionDescriptor.Builder builder = CollectionDescriptor.builder(eClass)
				.id(config.id())
				.title(config.title())
				.description(config.description())
				.idAttribute(config.idAttribute())
				.geometry(config.geometry())
				.temporal(config.temporal())
				.layerGroup(config.layerGroup())
				.style(config.style());
		String[] bbox = config.bbox();
		if (bbox != null && bbox.length > 0) {
			builder.bbox(String.join(",", bbox));
		}
		return List.of(builder.build());
	}

	@Override
	public String toString() {
		return PID + " " + config.type();
	}
}
