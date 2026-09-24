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
package org.eclipse.fennec.ogc.features.source.memory;

import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;
import java.util.function.Supplier;
import java.util.stream.Stream;

import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.fennec.ogc.features.api.CollectionDescriptor;
import org.eclipse.fennec.ogc.features.api.FeatureQuery;
import org.eclipse.fennec.ogc.features.api.FeatureResult;
import org.eclipse.fennec.ogc.features.api.FeatureSource;
import org.eclipse.fennec.ogc.features.api.SortKey;
import org.eclipse.fennec.ogc.features.cql2.Cql2Evaluator;

/**
 * A feature source over objects held in memory. The filter is evaluated by
 * {@link Cql2Evaluator}, so this source is the reference the other backends are tested against.
 */
public class MemoryFeatureSource implements FeatureSource {

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
	public FeatureResult query(FeatureQuery query) {
		CollectionDescriptor collection = query.collection();
		Cql2Evaluator filter = query.filter() == null ? null : Cql2Evaluator.compile(query.filter(), collection);
		List<EObject> matching = features(collection)
				.filter(o -> filter == null || filter.matches(o))
				.sorted(order(query.sort(), collection.idAttribute()))
				.toList();
		int from = Math.min(query.offset(), matching.size());
		int to = query.limit() == FeatureQuery.UNLIMITED ? matching.size()
				: Math.min(matching.size(), from + query.limit());
		return new FeatureResult(matching.subList(from, to), query.count() ? matching.size() : FeatureResult.UNKNOWN);
	}

	@Override
	public Optional<EObject> get(CollectionDescriptor collection, String id) {
		EAttribute idAttribute = collection.idAttribute();
		return features(collection)
				.filter(o -> id.equals(String.valueOf(value(o, idAttribute))))
				.findFirst();
	}

	private Stream<EObject> features(CollectionDescriptor collection) {
		return candidates.get().stream()
				.<EObject> map(o -> o)
				.filter(o -> collection.type().isSuperTypeOf(o.eClass()));
	}

	/** the sort keys, then the id attribute: a total order makes offset paging stable */
	private static Comparator<EObject> order(List<SortKey> sort, EAttribute idAttribute) {
		Comparator<EObject> order = (a, b) -> 0;
		for (SortKey key : sort) {
			Comparator<EObject> byKey = Comparator.comparing(o -> value(o, key.attribute()),
					Comparator.nullsFirst(MemoryFeatureSource::compare));
			order = order.thenComparing(key.ascending() ? byKey : byKey.reversed());
		}
		return order.thenComparing(o -> value(o, idAttribute), Comparator.nullsFirst(MemoryFeatureSource::compare));
	}

	/** {@code null} where the attribute belongs to another subtype of an aggregate collection */
	private static Object value(EObject feature, EAttribute attribute) {
		return attribute.getEContainingClass().isSuperTypeOf(feature.eClass()) ? feature.eGet(attribute) : null;
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	private static int compare(Object a, Object b) {
		if (a instanceof Enumerator x && b instanceof Enumerator y) {
			return Integer.compare(x.getValue(), y.getValue());
		}
		return ((Comparable) a).compareTo(b);
	}
}
