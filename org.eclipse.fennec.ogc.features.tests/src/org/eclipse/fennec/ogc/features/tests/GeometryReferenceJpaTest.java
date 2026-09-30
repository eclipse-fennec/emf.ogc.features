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

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.fennec.persistence.repository.api.Repository;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.params.ParameterizedTest;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceRegistration;
import org.osgi.test.common.annotation.InjectBundleContext;
import org.osgi.test.common.annotation.InjectService;
import org.osgi.test.common.annotation.Property;
import org.osgi.test.common.annotation.Property.TemplateArgument;
import org.osgi.test.common.annotation.Property.ValueSource;
import org.osgi.test.common.annotation.config.WithFactoryConfiguration;
import org.osgi.test.common.service.ServiceAware;
import org.osgi.test.junit5.cm.ConfigurationExtension;
import org.osgi.test.junit5.context.BundleContextExtension;
import org.osgi.test.junit5.service.ServiceExtension;

/**
 * Experiment for #14, JPA on H2: a dynamic package holding its geometry as a containment
 * reference to the GeoJSON model, stored through a Fennec JPA repository with the mapping
 * derived from the package (no geojson type converter), and read back.
 */
@ExtendWith(BundleContextExtension.class)
@ExtendWith(ServiceExtension.class)
@ExtendWith(ConfigurationExtension.class)
@WithFactoryConfiguration(factoryPid = "daanse.jdbc.datasource.h2.DataSource", name = "shapes", location = "?",
		properties = @Property(key = "identifier", value = "%s",
				templateArguments = @TemplateArgument(source = ValueSource.SystemProperty, value = "shapesDb")))
@WithFactoryConfiguration(factoryPid = "fennec.jpa.EORMMappingService", name = "shapes", location = "?", properties = {
		@Property(key = "fennec.jpa.eorm.mappingName", value = "shapes"),
		@Property(key = "fennec.jpa.eorm.model.target", value = "(emf.nsURI=" + ShapesModel.NS_URI + ")") })
@WithFactoryConfiguration(factoryPid = "fennec.jpa.EMPersistenceUnit", name = "shapes", location = "?", properties = {
		@Property(key = "fennec.jpa.persistenceUnitName", value = "shapes"),
		@Property(key = "fennec.jpa.mapping.target", value = "(fennec.jpa.eorm.mapping=shapes)"),
		@Property(key = "fennec.jpa.dataSource.target", value = "(&(subprotocol=h2)(identifier=%s))",
				templateArguments = @TemplateArgument(source = ValueSource.SystemProperty, value = "shapesDb")),
		@Property(key = "fennec.jpa.ext.eclipselink.ddl-generation", value = "create-tables"),
		@Property(key = "fennec.jpa.ext.eclipselink.cache.shared.default", value = "false") })
@WithFactoryConfiguration(factoryPid = "fennec.repository.jpa", name = "shapes", location = "?", properties = {
		@Property(key = "repositoryId", value = "shapes"),
		@Property(key = "unit.target", value = "(osgi.unit.name=shapes)") })
class GeometryReferenceJpaTest {

	@InjectBundleContext
	static BundleContext context;

	@InjectService(filter = "(emf.configuratorName=geojson)", timeout = 10000)
	static Resource.Factory geoJson;

	private static ShapesModel model;
	private static ServiceRegistration<EPackage> registration;

	@InjectService(filter = "(persistence.repository.id=shapes)", timeout = 60000)
	ServiceAware<Repository> repositories;

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
			model.report("JPA/H2 round trip (containment reference to geojson Geometry), fresh repository instance for the read", stored);
		}
		return stored;
	}

	@ParameterizedTest(name = "{0}")
	@org.junit.jupiter.params.provider.ValueSource(strings = { "Point", "MultiPoint", "LineString", "MultiLineString",
			"Polygon", "MultiPolygon", "GeometryCollection" })
	void jpaRoundTrip(String type) throws Exception {
		ShapesModel.Outcome outcome = model.compare(type, storeAndReload().get(type));
		assertThat(outcome.equal()).as(outcome.toString()).isTrue();
	}
}
