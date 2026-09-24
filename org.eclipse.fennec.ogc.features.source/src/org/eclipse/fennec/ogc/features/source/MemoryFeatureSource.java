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
package org.eclipse.fennec.ogc.features.source;

import java.util.Collection;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.function.Supplier;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.fennec.model.query.Query;
import org.eclipse.fennec.ogc.features.api.FeatureSourceException;
import org.eclipse.fennec.persistence.query.api.QueryResult;
import org.eclipse.fennec.persistence.query.memory.MemoryQueries;
import org.eclipse.fennec.persistence.query.QueryException;

/**
 * A feature source over objects held in memory, evaluated by the Fennec in-memory query
 * engine, the reference the persistence backends are tested against.
 */
public class MemoryFeatureSource extends AbstractFeatureSource {

	private final Set<String> nsURIs;
	private final Supplier<? extends Collection<? extends EObject>> candidates;

	/**
	 * @param nsURIs namespace URIs of the packages whose classes this source serves
	 * @param candidates supplies the objects to query, called once per query
	 */
	public MemoryFeatureSource(Set<String> nsURIs, Supplier<? extends Collection<? extends EObject>> candidates) {
		this.nsURIs = Set.copyOf(nsURIs);
		this.candidates = Objects.requireNonNull(candidates, "candidates");
	}

	@Override
	public boolean supports(EClass type) {
		return type.getEPackage() != null && nsURIs.contains(type.getEPackage().getNsURI());
	}

	@Override
	protected List<EObject> objects(Query query) {
		try {
			QueryResult result = MemoryQueries.execute(query, candidates.get(), null);
			return result.objects().toList();
		} catch (QueryException e) {
			throw new FeatureSourceException("In-memory query failed: " + e.getMessage(), e);
		}
	}

	@Override
	protected long count(Query query) {
		try {
			return MemoryQueries.execute(query, candidates.get(), null).count();
		} catch (QueryException e) {
			throw new FeatureSourceException("In-memory count failed: " + e.getMessage(), e);
		}
	}
}
