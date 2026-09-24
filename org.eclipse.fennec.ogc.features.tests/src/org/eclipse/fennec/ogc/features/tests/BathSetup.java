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

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import org.junit.jupiter.api.extension.ExtendWith;
import org.osgi.test.common.annotation.Property;
import org.osgi.test.common.annotation.Property.TemplateArgument;
import org.osgi.test.common.annotation.Property.ValueSource;
import org.osgi.test.common.annotation.config.WithConfiguration;
import org.osgi.test.common.annotation.config.WithFactoryConfiguration;
import org.osgi.test.junit5.cm.ConfigurationExtension;

/**
 * The leisure pool demo on the database of the run: an H2 and a PostgreSQL data source are
 * both configured, and the persistence unit and the loader pick the one whose subprotocol
 * is {@code ogc.test.subprotocol} ({@code OGC_TEST_FLAVOR=postgres} selects PostgreSQL and
 * starts its container). Mapping derived from the model, persistence unit bound to the
 * geojson converter, repository, demo data loader and a repository feature source.
 */
@Target({ ElementType.TYPE })
@Retention(RetentionPolicy.RUNTIME)
@ExtendWith(PostgresContainer.Extension.class)
@ExtendWith(ConfigurationExtension.class)
@WithFactoryConfiguration(factoryPid = "daanse.jdbc.datasource.h2.DataSource", name = "bath", location = "?",
		properties = @Property(key = "identifier", value = "%s",
				templateArguments = @TemplateArgument(source = ValueSource.SystemProperty, value = "bathDb")))
@WithFactoryConfiguration(factoryPid = "daanse.jdbc.datasource.postgresql.DataSource", name = "bath", location = "?",
		properties = {
				@Property(key = "host", value = "127.0.0.1"),
				@Property(key = "port", value = "%s", scalar = Property.Scalar.Integer,
						templateArguments = @TemplateArgument(source = ValueSource.SystemProperty, value = "ogc.test.postgres.port")),
				@Property(key = "dbname", value = PostgresContainer.DB),
				@Property(key = "user", value = PostgresContainer.USER),
				@Property(key = ".password", value = PostgresContainer.PASSWORD) })
@WithFactoryConfiguration(factoryPid = "fennec.jpa.EORMMappingService", name = "bath", location = "?", properties = {
		@Property(key = "fennec.jpa.eorm.mappingName", value = "bath"),
		@Property(key = "fennec.jpa.eorm.model.target", value = "(emf.nsURI=" + BathSetup.NS_URI + ")") })
@WithFactoryConfiguration(factoryPid = "fennec.jpa.EMPersistenceUnit", name = "bath", location = "?", properties = {
		@Property(key = "fennec.jpa.persistenceUnitName", value = "bath"),
		@Property(key = "fennec.jpa.mapping.target", value = "(fennec.jpa.eorm.mapping=bath)"),
		@Property(key = "fennec.jpa.dataSource.target", value = "(subprotocol=%s)",
				templateArguments = @TemplateArgument(source = ValueSource.SystemProperty, value = "ogc.test.subprotocol")),
		@Property(key = "fennec.jpa.converter.target", value = "(fennec.persistence.converter=geojson)"),
		@Property(key = "fennec.jpa.ext.eclipselink.ddl-generation", value = "create-or-extend-tables"),
		// every read must go to the database, or a broken read conversion hides behind the cache
		@Property(key = "fennec.jpa.ext.eclipselink.cache.shared.default", value = "false") })
@WithFactoryConfiguration(factoryPid = "fennec.repository.jpa", name = "bath", location = "?", properties = {
		@Property(key = "repositoryId", value = "bath"),
		@Property(key = "unit.target", value = "(osgi.unit.name=bath)") })
@WithConfiguration(pid = "org.eclipse.fennec.ogc.features.example.bath.loader", location = "?", properties = {
		@Property(key = "repository.target", value = "(persistence.repository.id=bath)"),
		@Property(key = "dataSource.target", value = "(subprotocol=%s)",
				templateArguments = @TemplateArgument(source = ValueSource.SystemProperty, value = "ogc.test.subprotocol")) })
@WithFactoryConfiguration(factoryPid = "org.eclipse.fennec.ogc.features.source.repository", name = "bath",
		location = "?", properties = {
				@Property(key = "repository.target", value = "(persistence.repository.id=bath)"),
				@Property(key = "nsURIs", value = BathSetup.NS_URI) })
public @interface BathSetup {

	/** namespace URI of the leisure pool model */
	String NS_URI = "https://eclipse.org/fennec/ogc/example/bath/1.0";
}
