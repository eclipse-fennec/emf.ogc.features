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

import static org.eclipse.fennec.model.query.builder.Expressions.path;

import java.util.List;
import java.util.Optional;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.fennec.model.query.Query;
import org.eclipse.fennec.model.query.builder.QueryBuilder;
import org.eclipse.fennec.ogc.features.api.CollectionDescriptor;
import org.eclipse.fennec.ogc.features.api.FeatureQuery;
import org.eclipse.fennec.ogc.features.api.FeatureResult;
import org.eclipse.fennec.ogc.features.api.FeatureSource;
import org.eclipse.fennec.ogc.features.api.SortKey;

/**
 * Translates a {@link FeatureQuery} into Fennec query IR queries and leaves only their
 * execution to the subclass.
 * <p>
 * Without a residual predicate, paging and counting are pushed to the store. With one, the
 * store returns every feature matching the store part of the filter in a stable order, and
 * the residual, the page and the count are computed here.
 */
public abstract class AbstractFeatureSource implements FeatureSource {

	@Override
	public FeatureResult query(FeatureQuery query) {
		CollectionDescriptor collection = query.collection();
		QueryBuilder builder = from(query);
		boolean sortedById = false;
		for (SortKey key : query.sort()) {
			if (key.ascending()) {
				builder.orderByAsc(key.attribute());
			} else {
				builder.orderByDesc(key.attribute());
			}
			sortedById |= key.attribute().equals(collection.idAttribute());
		}
		if (!sortedById) {
			// a total order makes offset paging stable
			builder.orderByAsc(collection.idAttribute());
		}

		if (query.hasResidual()) {
			List<EObject> matching = objects(builder.build()).stream().filter(query.residual()).toList();
			int from = Math.min(query.offset(), matching.size());
			int to = query.limit() == FeatureQuery.UNLIMITED ? matching.size()
					: Math.min(matching.size(), from + query.limit());
			return new FeatureResult(matching.subList(from, to), query.count() ? matching.size() : FeatureResult.UNKNOWN);
		}

		if (query.limit() != FeatureQuery.UNLIMITED) {
			builder.top(query.limit());
		}
		if (query.offset() > 0) {
			builder.skip(query.offset());
		}
		List<EObject> page = query.limit() == 0 ? List.of() : objects(builder.build());
		long numberMatched = FeatureResult.UNKNOWN;
		if (query.count()) {
			numberMatched = count(from(query).countOnly().build());
		}
		return new FeatureResult(page, numberMatched);
	}

	@Override
	public Optional<EObject> get(CollectionDescriptor collection, String id) {
		Object key = id(collection.idAttribute(), id);
		if (key == null) {
			return Optional.empty();
		}
		Query query = QueryBuilder.from(collection.type())
				.where(path(collection.idAttribute()).eq(key))
				.top(1)
				.build();
		return objects(query).stream().findFirst();
	}

	private static QueryBuilder from(FeatureQuery query) {
		QueryBuilder builder = QueryBuilder.from(query.collection().type());
		return query.filter() == null ? builder : builder.where(query.filter());
	}

	/**
	 * Runs an object query.
	 *
	 * @param query the query, shape objects
	 * @return the resulting objects in query order
	 * @throws org.eclipse.fennec.ogc.features.api.FeatureSourceException if the store fails
	 */
	protected abstract List<EObject> objects(Query query);

	/**
	 * Runs a count query.
	 *
	 * @param query the query, shape count
	 * @return the number of matching objects
	 * @throws org.eclipse.fennec.ogc.features.api.FeatureSourceException if the store fails
	 */
	protected abstract long count(Query query);

	private static Object id(EAttribute idAttribute, String id) {
		try {
			return EcoreUtil.createFromString(idAttribute.getEAttributeType(), id);
		} catch (RuntimeException e) {
			// an id that cannot be a value of the id type identifies nothing
			return null;
		}
	}
}
