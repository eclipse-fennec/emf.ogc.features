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
import java.util.Dictionary;
import java.util.Hashtable;
import java.util.List;
import java.util.Set;

import javax.sql.DataSource;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.fennec.ogc.features.example.bath.BathPackage;
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
 * Loads the demo data ({@code data/bath.geojson}) into the configured repository unless
 * it already holds assets, and then registers the condition {@value #CONDITION_ID}.
 */
@Component(name = BathDataLoader.PID, configurationPolicy = ConfigurationPolicy.REQUIRE)
@Designate(ocd = BathDataLoader.Config.class)
public class BathDataLoader {

	/** the configuration PID */
	public static final String PID = "org.eclipse.fennec.ogc.features.example.bath.loader";
	/** the condition registered once the data is in the store */
	public static final String CONDITION_ID = "fennec.ogc.example.bath.loaded";

	private static final System.Logger LOGGER = System.getLogger(BathDataLoader.class.getName());

	@ObjectClassDefinition(name = "Leisure Pool Demo Data Loader")
	public @interface Config {

		@AttributeDefinition(description = "Filter selecting the repository to load into")
		String repository_target() default "(persistence.repository.id=bath)";

		@AttributeDefinition(description = "Filter selecting the DataSource of the repository, "
				+ "used to widen the geometry column")
		String dataSource_target();
	}

	private final BundleContext context;
	private final Repository repository;
	private final DataSource dataSource;
	private final Resource.Factory geoJson;
	private final Thread worker;
	private volatile ServiceRegistration<Condition> condition;

	/**
	 * Loads asynchronously: the repository is registered from within the activation of its
	 * persistence unit, before the unit accepts requests, so the first access is retried.
	 *
	 * @param context the bundle context
	 * @param repository the repository to load into
	 * @param dataSource the database behind the repository
	 * @param geoJson the GeoJSON resource factory
	 */
	@Activate
	public BathDataLoader(BundleContext context,
			@Reference(name = "repository") Repository repository,
			@Reference(name = "dataSource") DataSource dataSource,
			@Reference(target = "(emf.configuratorName=geojson)") Resource.Factory geoJson) {
		this.context = context;
		this.repository = repository;
		this.dataSource = dataSource;
		this.geoJson = geoJson;
		this.worker = Thread.ofVirtual().name("bath-data-loader").start(this::loadWithRetry);
	}

	private void loadWithRetry() {
		for (int attempt = 1; !Thread.currentThread().isInterrupted(); attempt++) {
			try {
				load();
				Dictionary<String, Object> properties = new Hashtable<>();
				properties.put(Condition.CONDITION_ID, CONDITION_ID);
				condition = context.registerService(Condition.class, Condition.INSTANCE, properties);
				return;
			} catch (IOException | SQLException | RuntimeException e) {
				if (attempt >= 30) {
					LOGGER.log(System.Logger.Level.ERROR, "Giving up loading the leisure pool demo data", e);
					return;
				}
				LOGGER.log(System.Logger.Level.DEBUG, "Store not ready, retrying: {0}", e.getMessage());
				try {
					Thread.sleep(Math.min(200L * attempt, 2000L));
				} catch (InterruptedException ie) {
					Thread.currentThread().interrupt();
				}
			}
		}
	}

	private void load() throws IOException, SQLException {
		// the first access builds the persistence unit and lets EclipseLink create the schema
		long existing = repository.count(BathPackage.Literals.ASSET);
		List<String> widened = TextColumns.widen(dataSource, Set.of(BathPackage.Literals.ASSET__GEOMETRY.getName()));
		LOGGER.log(System.Logger.Level.INFO, "Widened geometry columns {0}", widened);
		if (existing > 0) {
			return;
		}
		GeoJsonFeatureImporter importer = new GeoJsonFeatureImporter(new GeoJsonText(geoJson),
				BathPackage.eINSTANCE, "assetType");
		List<EObject> assets;
		try (InputStream in = BathDataLoader.class.getResourceAsStream("/data/bath.geojson")) {
			if (in == null) {
				throw new IOException("data/bath.geojson is missing from the bundle");
			}
			assets = importer.read(in);
		}
		repository.saveAll(assets);
		LOGGER.log(System.Logger.Level.INFO, "Loaded {0} leisure pool assets", assets.size());
	}

	@Deactivate
	void deactivate() throws InterruptedException {
		worker.interrupt();
		worker.join(5000);
		ServiceRegistration<Condition> registration = condition;
		if (registration != null) {
			registration.unregister();
		}
	}
}
