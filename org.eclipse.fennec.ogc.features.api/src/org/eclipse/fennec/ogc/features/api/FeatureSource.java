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

import java.util.Optional;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.osgi.annotation.versioning.ConsumerType;

/**
 * A store of features. Registered as a service, one per backing store; the server picks the
 * source that {@link #supports(EClass) supports} a collection's type.
 */
@ConsumerType
public interface FeatureSource {

	/**
	 * @param type a collection type
	 * @return {@code true} if this source holds the instances of the type
	 */
	boolean supports(EClass type);

	/**
	 * Runs a query.
	 *
	 * @param query the query
	 * @return the requested page
	 * @throws FeatureSourceException if the store fails or cannot evaluate the filter
	 */
	FeatureResult query(FeatureQuery query);

	/**
	 * Looks up a single feature by id.
	 *
	 * @param collection the collection
	 * @param id the feature id as it appears in the URL
	 * @return the feature, empty if there is none of the collection's type with that id
	 * @throws FeatureSourceException if the store fails
	 */
	Optional<EObject> get(CollectionDescriptor collection, String id);

	/**
	 * The spatial extent of a collection, the union of the stored bounding boxes of all its
	 * features. The default reads every feature; a source should push this to its store.
	 *
	 * @param collection the collection
	 * @return the extent, empty if the collection has no bbox attributes or no features with one
	 * @throws FeatureSourceException if the store fails
	 */
	default Optional<Envelope> extent(CollectionDescriptor collection) {
		BboxAttributes bbox = collection.bbox();
		if (bbox == null) {
			return Optional.empty();
		}
		return query(FeatureQuery.builder(collection).build()).features().stream()
				.map(bbox::read)
				.flatMap(Optional::stream)
				.reduce(Envelope::union);
	}
}
