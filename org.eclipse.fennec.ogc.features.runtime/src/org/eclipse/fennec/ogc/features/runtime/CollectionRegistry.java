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
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.fennec.ogc.features.api.CollectionDescriptor;
import org.eclipse.fennec.ogc.features.api.CollectionProvider;
import org.eclipse.fennec.ogc.features.api.FeatureSource;

/**
 * The collections one server instance publishes: for every bound package the annotated
 * classes plus what the bound {@link CollectionProvider}s declare, narrowed to the published
 * ids, each served by the first bound feature source that supports its class.
 * <p>
 * A provided collection replaces the annotated collection of the same id. A collection id
 * that occurs in two packages is published once, for the package bound first.
 */
final class CollectionRegistry {

	private static final System.Logger LOGGER = System.getLogger(CollectionRegistry.class.getName());

	/** the bound packages in binding order, each with the collections its annotations yield */
	private final Map<EPackage, List<CollectionDescriptor>> packages = Collections.synchronizedMap(new LinkedHashMap<>());
	private final List<FeatureSource> sources = new CopyOnWriteArrayList<>();
	private final List<CollectionProvider> providers = new CopyOnWriteArrayList<>();
	/** provider failures already reported, so a broken declaration is logged once */
	private final Set<String> reported = ConcurrentHashMap.newKeySet();
	/** the published collection ids; empty publishes everything declared */
	private volatile Set<String> published = Set.of();

	void addPackage(EPackage ePackage) {
		List<CollectionDescriptor> collections = List.of();
		try {
			collections = CollectionDescriptor.of(ePackage);
		} catch (IllegalArgumentException e) {
			LOGGER.log(System.Logger.Level.ERROR, "Package " + ePackage.getNsURI() + " has invalid collection annotations", e);
		}
		packages.put(ePackage, collections);
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

	void addProvider(CollectionProvider provider) {
		providers.add(provider);
	}

	void removeProvider(CollectionProvider provider) {
		providers.remove(provider);
	}

	/**
	 * @param ids the collection ids to publish; empty publishes every declared collection
	 */
	void publish(Collection<String> ids) {
		published = Set.copyOf(ids);
	}

	/**
	 * @return the published collections in package order, then declaration order
	 */
	List<CollectionDescriptor> collections() {
		List<Map.Entry<EPackage, List<CollectionDescriptor>>> bound;
		synchronized (packages) {
			bound = new ArrayList<>(packages.entrySet());
		}
		Set<String> ids = published;
		Map<String, CollectionDescriptor> result = new LinkedHashMap<>();
		for (Map.Entry<EPackage, List<CollectionDescriptor>> entry : bound) {
			for (CollectionDescriptor collection : declared(entry.getKey(), entry.getValue()).values()) {
				if ((ids.isEmpty() || ids.contains(collection.id())) && source(collection).isPresent()) {
					result.putIfAbsent(collection.id(), collection);
				}
			}
		}
		return List.copyOf(result.values());
	}

	Optional<CollectionDescriptor> collection(String id) {
		return collections().stream().filter(c -> c.id().equals(id)).findFirst();
	}

	Optional<FeatureSource> source(CollectionDescriptor collection) {
		return sources.stream().filter(s -> s.supports(collection.type())).findFirst();
	}

	/** the annotated collections of a package overlaid with the provided ones, by id */
	private Map<String, CollectionDescriptor> declared(EPackage ePackage, List<CollectionDescriptor> annotated) {
		Map<String, CollectionDescriptor> declared = new LinkedHashMap<>();
		for (CollectionDescriptor collection : annotated) {
			declared.putIfAbsent(collection.id(), collection);
		}
		for (CollectionProvider provider : providers) {
			try {
				for (CollectionDescriptor collection : provider.collections(ePackage)) {
					declared.put(collection.id(), collection);
				}
			} catch (RuntimeException e) {
				if (reported.add(provider.getClass().getName() + "@" + System.identityHashCode(provider) + " " + ePackage.getNsURI())) {
					LOGGER.log(System.Logger.Level.ERROR, "Collection provider " + provider
							+ " fails for package " + ePackage.getNsURI(), e);
				}
			}
		}
		return declared;
	}
}
