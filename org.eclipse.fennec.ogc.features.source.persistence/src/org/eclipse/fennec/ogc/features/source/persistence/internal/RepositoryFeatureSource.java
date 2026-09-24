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
package org.eclipse.fennec.ogc.features.source.persistence.internal;

import java.io.IOException;
import java.util.List;
import java.util.Set;
import java.util.function.Function;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.fennec.model.query.Query;
import org.eclipse.fennec.ogc.features.api.FeatureSource;
import org.eclipse.fennec.ogc.features.api.FeatureSourceException;
import org.eclipse.fennec.ogc.features.source.persistence.PersistenceFeatureSource;
import org.eclipse.fennec.persistence.query.api.QueryResult;
import org.eclipse.fennec.persistence.repository.api.ReadRepository;
import org.osgi.service.component.ComponentServiceObjects;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.ConfigurationPolicy;
import org.osgi.service.component.annotations.Reference;
import org.osgi.service.component.annotations.ReferenceScope;
import org.osgi.service.metatype.annotations.AttributeDefinition;
import org.osgi.service.metatype.annotations.Designate;
import org.osgi.service.metatype.annotations.ObjectClassDefinition;

/**
 * A feature source over a Fennec persistence repository.
 * <p>
 * Repositories are prototype scoped and not thread safe, so every query gets its own
 * instance, which is disposed with its resource set afterwards.
 */
@Component(name = RepositoryFeatureSource.PID, service = FeatureSource.class,
		configurationPolicy = ConfigurationPolicy.REQUIRE)
@Designate(ocd = RepositoryFeatureSource.Config.class, factory = true)
public class RepositoryFeatureSource extends PersistenceFeatureSource {

	/** the factory PID */
	public static final String PID = "org.eclipse.fennec.ogc.features.source.repository";

	@ObjectClassDefinition(name = "Fennec OGC Features Repository Source",
			description = "Serves the features of the configured packages from a Fennec persistence repository")
	public @interface Config {

		@AttributeDefinition(name = "Repository", description = "Filter selecting the repository, "
				+ "e.g. (persistence.repository.id=bath)")
		String repository_target();

		@AttributeDefinition(name = "Packages", description = "Namespace URIs of the packages served")
		String[] nsURIs();
	}

	private final ComponentServiceObjects<ReadRepository> repositories;
	private final Set<String> nsURIs;

	/**
	 * @param config the configuration
	 * @param repositories the repository prototypes
	 */
	@Activate
	public RepositoryFeatureSource(Config config,
			@Reference(name = "repository", scope = ReferenceScope.PROTOTYPE_REQUIRED)
			ComponentServiceObjects<ReadRepository> repositories) {
		this.repositories = repositories;
		this.nsURIs = Set.of(config.nsURIs());
	}

	@Override
	public boolean supports(EClass type) {
		return type.getEPackage() != null && nsURIs.contains(type.getEPackage().getNsURI());
	}

	@Override
	protected List<EObject> objects(Query query) {
		return withResult(query, result -> result.objects().toList());
	}

	@Override
	protected long count(Query query) {
		return withResult(query, QueryResult::count);
	}

	private <T> T withResult(Query query, Function<QueryResult, T> reader) {
		ReadRepository repository = repositories.getService();
		try {
			QueryResult result = repository.find(query);
			try {
				return reader.apply(result);
			} finally {
				result.close();
			}
		} catch (IOException | RuntimeException e) {
			throw new FeatureSourceException("Repository query failed: " + e.getMessage(), e);
		} finally {
			repositories.ungetService(repository);
		}
	}
}
