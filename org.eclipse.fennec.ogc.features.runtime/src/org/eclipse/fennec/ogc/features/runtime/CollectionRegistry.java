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
package org.eclipse.fennec.ogc.features.runtime;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.CopyOnWriteArrayList;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.fennec.ogc.features.api.CollectionDescriptor;
import org.eclipse.fennec.ogc.features.api.FeatureSource;

/**
 * The collections the server publishes: every annotated class of a registered package for
 * which a feature source is available.
 */
final class CollectionRegistry {

	private static final System.Logger LOGGER = System.getLogger(CollectionRegistry.class.getName());

	private final Map<EPackage, List<CollectionDescriptor>> packages = Collections.synchronizedMap(new LinkedHashMap<>());
	private final List<FeatureSource> sources = new CopyOnWriteArrayList<>();

	void addPackage(EPackage ePackage) {
		try {
			List<CollectionDescriptor> collections = CollectionDescriptor.of(ePackage);
			if (!collections.isEmpty()) {
				packages.put(ePackage, collections);
			}
		} catch (IllegalArgumentException e) {
			LOGGER.log(System.Logger.Level.ERROR, "Package " + ePackage.getNsURI() + " has invalid collection annotations", e);
		}
	}

	void removePackage(EPackage ePackage) {
		packages.remove(ePackage);
	}

	void addSource(FeatureSource source) {
		sources.add(source);
	}

	void removeSource(FeatureSource source) {
		sources.remove(source);
	}

	/**
	 * @return the published collections, grouped by package; a collection id that occurs
	 *         twice is published once, for the package registered first
	 */
	List<CollectionDescriptor> collections() {
		List<List<CollectionDescriptor>> registered;
		synchronized (packages) {
			registered = new ArrayList<>(packages.values());
		}
		List<CollectionDescriptor> result = new ArrayList<>();
		for (List<CollectionDescriptor> collections : registered) {
			for (CollectionDescriptor collection : collections) {
				if (source(collection).isPresent()
						&& result.stream().noneMatch(c -> c.id().equals(collection.id()))) {
					result.add(collection);
				}
			}
		}
		return result;
	}

	Optional<CollectionDescriptor> collection(String id) {
		return collections().stream().filter(c -> c.id().equals(id)).findFirst();
	}

	Optional<FeatureSource> source(CollectionDescriptor collection) {
		return sources.stream().filter(s -> s.supports(collection.type())).findFirst();
	}
}
