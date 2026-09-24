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
package org.eclipse.fennec.ogc.features.example.bath.demo;

import java.io.IOException;
import java.io.InputStream;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Dictionary;
import java.util.Hashtable;
import java.util.List;
import java.util.Set;

import javax.sql.DataSource;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.fennec.ogc.features.geo.GeoJsonFeatureImporter;
import org.eclipse.fennec.ogc.features.geo.GeoJsonText;
import org.eclipse.fennec.persistence.repository.api.Repository;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceRegistration;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.ConfigurationPolicy;
import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Reference;
import org.osgi.service.condition.Condition;
import org.osgi.service.metatype.annotations.AttributeDefinition;
import org.osgi.service.metatype.annotations.Designate;
import org.osgi.service.metatype.annotations.ObjectClassDefinition;

/**
 * Loads GeoJSON files of this bundle into a repository unless it already holds instances of
 * the configured class, and then registers a condition. Loading happens in the activation.
 */
@Component(name = DemoDataLoader.PID, configurationPolicy = ConfigurationPolicy.REQUIRE)
@Designate(ocd = DemoDataLoader.Config.class, factory = true)
public class DemoDataLoader {

	/** the factory PID */
	public static final String PID = "org.eclipse.fennec.ogc.features.example.loader";

	private static final System.Logger LOGGER = System.getLogger(DemoDataLoader.class.getName());

	@ObjectClassDefinition(name = "Demo Data Loader")
	public @interface Config {

		@AttributeDefinition(description = "Filter selecting the repository to load into")
		String repository_target();

		@AttributeDefinition(description = "Filter selecting the DataSource of the repository, used to widen text columns")
		String dataSource_target();

		@AttributeDefinition(description = "Filter selecting the EPackage of the feature classes, e.g. (emf.nsURI=...)")
		String ePackage_target();

		@AttributeDefinition(description = "Bundle resources to load: 'path' takes the class of each feature from the "
				+ "type property, 'path=ClassName' reads all features of the file as that class")
		String[] files();

		@AttributeDefinition(description = "Feature property naming the class of a feature")
		String typeProperty() default "assetType";

		@AttributeDefinition(description = "Feature properties to skip where the class has no attribute for them")
		String[] ignoredProperties() default { "fill", "fill-opacity", "stroke", "stroke-width", "stroke-opacity",
				"stroke-dasharray", "marker-color", "marker-size", "marker-symbol" };

		@AttributeDefinition(description = "Name of the class whose instances mean the data is loaded already")
		String existsType();

		@AttributeDefinition(description = "Text columns to widen after schema generation")
		String[] widenColumns() default { "geometry" };

		@AttributeDefinition(description = "osgi.condition.id registered once the data is in the store")
		String conditionId();
	}

	private final Config config;
	private final Repository repository;
	private final DataSource dataSource;
	private final EPackage ePackage;
	private final Resource.Factory geoJson;
	private final ServiceRegistration<Condition> condition;

	/**
	 * @param context the bundle context
	 * @param config the configuration
	 * @param repository the repository to load into
	 * @param dataSource the database behind the repository
	 * @param ePackage the package of the feature classes
	 * @param geoJson the GeoJSON resource factory
	 * @throws IOException if a data file cannot be read
	 * @throws SQLException if the geometry columns cannot be widened
	 */
	@Activate
	public DemoDataLoader(BundleContext context, Config config,
			@Reference(name = "repository") Repository repository,
			@Reference(name = "dataSource") DataSource dataSource,
			@Reference(name = "ePackage") EPackage ePackage,
			@Reference(target = "(emf.configuratorName=geojson)") Resource.Factory geoJson)
			throws IOException, SQLException {
		this.config = config;
		this.repository = repository;
		this.dataSource = dataSource;
		this.ePackage = ePackage;
		this.geoJson = geoJson;
		load();
		Dictionary<String, Object> properties = new Hashtable<>();
		properties.put(Condition.CONDITION_ID, config.conditionId());
		this.condition = context.registerService(Condition.class, Condition.INSTANCE, properties);
	}

	private void load() throws IOException, SQLException {
		// the first access builds the persistence unit and lets EclipseLink create the schema
		long existing = repository.count(eClass(config.existsType()));
		List<String> widened = TextColumns.widen(dataSource, Set.of(config.widenColumns()));
		LOGGER.log(System.Logger.Level.INFO, "Widened columns {0}", widened);
		if (existing > 0) {
			return;
		}
		GeoJsonFeatureImporter importer = new GeoJsonFeatureImporter(new GeoJsonText(geoJson), ePackage,
				config.typeProperty()).ignoring(List.of(config.ignoredProperties()));
		List<EObject> all = new ArrayList<>();
		for (String file : config.files()) {
			int eq = file.indexOf('=');
			String path = eq < 0 ? file : file.substring(0, eq);
			EClass type = eq < 0 ? null : eClass(file.substring(eq + 1));
			try (InputStream in = DemoDataLoader.class.getResourceAsStream(path.startsWith("/") ? path : "/" + path)) {
				if (in == null) {
					throw new IOException(path + " is missing from the bundle");
				}
				all.addAll(importer.read(in, type));
			}
		}
		repository.saveAll(all);
		LOGGER.log(System.Logger.Level.INFO, "Loaded {0} features of {1}", all.size(), ePackage.getNsURI());
	}

	private EClass eClass(String name) {
		EClassifier classifier = ePackage.getEClassifier(name);
		if (classifier instanceof EClass eClass) {
			return eClass;
		}
		throw new IllegalArgumentException("No class " + name + " in " + ePackage.getNsURI());
	}

	@Deactivate
	void deactivate() {
		condition.unregister();
	}
}
