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

import net.opengis.cql2.And;
import net.opengis.cql2.Cql2Factory;
import net.opengis.cql2.Predicate;

/**
 * A query for the features of one collection.
 * <p>
 * The filter is a CQL2 model, independent of any store: every restriction of a request, also
 * {@code bbox}, {@code datetime} and property parameters, arrives as one CQL2 predicate. Each
 * {@link FeatureSource} translates it into its own query form, and evaluates in memory what
 * its store cannot decide.
 *
 * @param collection the collection to query
 * @param filter the CQL2 filter, {@code null} for none
 * @param sort sort criteria; the source appends the id attribute to make paging stable
 * @param offset number of matching features to skip
 * @param limit maximum number of features to return, {@link #UNLIMITED} for all
 * @param count {@code true} to have the number of matching features computed
 */
public record FeatureQuery(CollectionDescriptor collection, Predicate filter, List<SortKey> sort, int offset, int limit, boolean count) {

	/** {@link #limit()} for no limit */
	public static final int UNLIMITED = -1;

	public FeatureQuery {
		Objects.requireNonNull(collection, "collection");
		sort = List.copyOf(Objects.requireNonNull(sort, "sort"));
		if (offset < 0) {
			throw new IllegalArgumentException("offset must not be negative");
		}
		if (limit < UNLIMITED) {
			throw new IllegalArgumentException("limit must not be negative");
		}
	}

	/**
	 * @param collection the collection to query
	 * @return a builder for a query returning all features of the collection
	 */
	public static Builder builder(CollectionDescriptor collection) {
		return new Builder(collection);
	}

	/**
	 * Builder for {@link FeatureQuery}. Repeated {@link #where(Predicate)} calls are combined
	 * with AND.
	 */
	public static final class Builder {

		private final CollectionDescriptor collection;
		private final List<Predicate> filters = new ArrayList<>();
		private final List<SortKey> sort = new ArrayList<>();
		private int offset;
		private int limit = UNLIMITED;
		private boolean count;

		private Builder(CollectionDescriptor collection) {
			this.collection = Objects.requireNonNull(collection, "collection");
		}

		/**
		 * @param filter a CQL2 predicate, ignored if {@code null}
		 * @return this builder
		 */
		public Builder where(Predicate filter) {
			if (filter != null) {
				filters.add(filter);
			}
			return this;
		}

		/**
		 * @param key a sort criterion
		 * @return this builder
		 */
		public Builder sort(SortKey key) {
			sort.add(Objects.requireNonNull(key, "key"));
			return this;
		}

		/**
		 * @param offset number of matching features to skip
		 * @return this builder
		 */
		public Builder offset(int offset) {
			this.offset = offset;
			return this;
		}

		/**
		 * @param limit maximum number of features, {@link FeatureQuery#UNLIMITED} for all
		 * @return this builder
		 */
		public Builder limit(int limit) {
			this.limit = limit;
			return this;
		}

		/**
		 * @param count {@code true} to compute the number of matching features
		 * @return this builder
		 */
		public Builder count(boolean count) {
			this.count = count;
			return this;
		}

		/**
		 * @return the query
		 */
		public FeatureQuery build() {
			Predicate filter = switch (filters.size()) {
			case 0 -> null;
			case 1 -> filters.get(0);
			default -> {
				And and = Cql2Factory.eINSTANCE.createAnd();
				and.getArgs().addAll(filters);
				yield and;
			}
			};
			return new FeatureQuery(collection, filter, sort, offset, limit, count);
		}
	}
}
