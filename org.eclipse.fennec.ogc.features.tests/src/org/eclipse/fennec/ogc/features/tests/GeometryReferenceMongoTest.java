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
package org.eclipse.fennec.ogc.features.tests;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.Map;

import org.bson.Document;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.fennec.persistence.repository.api.Repository;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceRegistration;
import org.osgi.test.common.annotation.InjectBundleContext;
import org.osgi.test.common.annotation.InjectService;
import org.osgi.test.common.annotation.Property;
import org.osgi.test.common.annotation.Property.TemplateArgument;
import org.osgi.test.common.annotation.config.WithFactoryConfiguration;
import org.osgi.test.common.service.ServiceAware;

import com.mongodb.client.MongoDatabase;
import org.osgi.test.junit5.cm.ConfigurationExtension;
import org.osgi.test.junit5.context.BundleContextExtension;
import org.osgi.test.junit5.service.ServiceExtension;

/**
 * Experiment for #14, MongoDB: the same shapes through a Fennec Mongo repository. Needs a
 * container runtime ({@code ogc.test.container.cli}); the test is skipped without one.
 */
@ExtendWith(BundleContextExtension.class)
@ExtendWith(ServiceExtension.class)
@ExtendWith(MongoContainer.Extension.class)
@ExtendWith(ConfigurationExtension.class)
@WithFactoryConfiguration(factoryPid = "persistence.mongo.client", name = "shapes", location = "?", properties = {
		@Property(key = "ident", value = "shapes"),
		@Property(key = "connectionString", value = "mongodb://127.0.0.1:%s",
				templateArguments = @TemplateArgument(source = Property.ValueSource.SystemProperty, value = "ogc.test.mongo.port")) })
@WithFactoryConfiguration(factoryPid = "persistence.mongo.database", name = "shapes", location = "?", properties = {
		@Property(key = "alias", value = "shapes"),
		@Property(key = "database", value = "shapes"),
		@Property(key = "client.target", value = "(mongo.client.ident=shapes)") })
@WithFactoryConfiguration(factoryPid = "fennec.repository.mongo", name = "shapes", location = "?", properties = {
		@Property(key = "repositoryId", value = "shapesMongo"),
		@Property(key = "database.target", value = "(mongo.database.alias=shapes)") })
class GeometryReferenceMongoTest {

	@InjectBundleContext
	static BundleContext context;

	@InjectService(filter = "(emf.configuratorName=geojson)", timeout = 10000)
	static Resource.Factory geoJson;

	private static ShapesModel model;
	private static ServiceRegistration<EPackage> registration;

	@InjectService(filter = "(persistence.repository.id=shapesMongo)", timeout = 60000)
	ServiceAware<Repository> repositories;

	@InjectService(filter = "(mongo.database.alias=shapes)", timeout = 60000)
	MongoDatabase database;

	private static Map<String, EObject> stored;

	@BeforeAll
	static void loadModel() throws Exception {
		model = new ShapesModel(context, geoJson);
		registration = model.register(context);
	}

	@AfterAll
	static void unregister() {
		if (registration != null) {
			registration.unregister();
		}
	}

	private Map<String, EObject> storeAndReload() throws Exception {
		if (stored == null) {
			stored = model.storeAndReload(context.getServiceObjects(repositories.getServiceReference()));
			// what the database really holds, independent of any EMF resource set
			System.out.println("=== #14 experiment, MongoDB documents as stored ===");
			for (String collection : database.listCollectionNames()) {
				for (Document document : database.getCollection(collection).find()) {
					System.out.println(collection + ": " + document.toJson());
				}
			}
			model.report("MongoDB round trip (containment reference to geojson Geometry), fresh repository instance for the read", stored);
		}
		return stored;
	}

	@ParameterizedTest(name = "{0}")
	@ValueSource(strings = { "Point", "MultiPoint", "LineString", "MultiLineString", "Polygon", "MultiPolygon",
			"GeometryCollection" })
	void mongoRoundTrip(String type) throws Exception {
		ShapesModel.Outcome outcome = model.compare(type, storeAndReload().get(type));
		assertThat(outcome.equal()).as(outcome.toString()).isTrue();
	}
}
