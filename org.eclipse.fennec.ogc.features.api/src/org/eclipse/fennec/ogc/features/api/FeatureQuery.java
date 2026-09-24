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

import static org.eclipse.fennec.model.query.builder.Expressions.and;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Predicate;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.fennec.model.expression.Expression;

/**
 * A query for the features of one collection.
 * <p>
 * A filter comes in two parts. The {@link #filter() store part} is a Fennec query IR
 * predicate the store evaluates. The {@link #residual() residual} is a predicate the source
 * applies in memory to what the store returned, for tests the store cannot express, today
 * the exact spatial relations. With a residual, paging and counting also happen in memory,
 * because the store cannot know which of its rows survive.
 *
 * @param collection the collection to query
 * @param filter the store part of the filter, {@code null} for none
 * @param residual the in-memory part of the filter, {@code null} for none
 * @param sort sort criteria; the source appends the id attribute to make paging stable
 * @param offset number of matching features to skip
 * @param limit maximum number of features to return, {@link #UNLIMITED} for all
 * @param count {@code true} to have the number of matching features computed
 */
public record FeatureQuery(CollectionDescriptor collection, Expression filter, Predicate<EObject> residual,
		List<SortKey> sort, int offset, int limit, boolean count) {

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
	 * @return {@code true} if part of the filter must be evaluated in memory
	 */
	public boolean hasResidual() {
		return residual != null;
	}

	/**
	 * Builder for {@link FeatureQuery}. Repeated {@link #where(Expression)} and
	 * {@link #residual(Predicate)} calls are combined with AND.
	 */
	public static final class Builder {

		private final CollectionDescriptor collection;
		private final List<Expression> filters = new ArrayList<>();
		private Predicate<EObject> residual;
		private final List<SortKey> sort = new ArrayList<>();
		private int offset;
		private int limit = UNLIMITED;
		private boolean count;

		private Builder(CollectionDescriptor collection) {
			this.collection = Objects.requireNonNull(collection, "collection");
		}

		/**
		 * @param filter a store side predicate, ignored if {@code null}
		 * @return this builder
		 */
		public Builder where(Expression filter) {
			if (filter != null) {
				filters.add(filter);
			}
			return this;
		}

		/**
		 * @param predicate an in-memory predicate, ignored if {@code null}
		 * @return this builder
		 */
		public Builder residual(Predicate<EObject> predicate) {
			if (predicate != null) {
				residual = residual == null ? predicate : residual.and(predicate);
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
			Expression filter = switch (filters.size()) {
			case 0 -> null;
			case 1 -> filters.get(0);
			default -> and(filters.toArray(Expression[]::new));
			};
			return new FeatureQuery(collection, filter, residual, sort, offset, limit, count);
		}
	}
}
