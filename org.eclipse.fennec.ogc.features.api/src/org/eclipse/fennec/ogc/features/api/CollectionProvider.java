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

import java.util.List;

import org.eclipse.emf.ecore.EPackage;
import org.osgi.annotation.versioning.ConsumerType;

/**
 * Declares collections for packages the model author did not annotate, or declares them
 * differently: a class published under a second id, with another geometry attribute, or a
 * schema resolved at runtime that carries no {@link OgcFeaturesAnnotations#SOURCE} annotation.
 * <p>
 * Registered as a service. A server asks every provider it binds for each package it binds;
 * a provided collection replaces the annotated collection of the same id.
 */
@ConsumerType
public interface CollectionProvider {

	/**
	 * @param ePackage a package the server publishes
	 * @return the collections this provider declares for the package, empty if none; built
	 *         with {@link CollectionDescriptor#builder(org.eclipse.emf.ecore.EClass)}
	 */
	List<CollectionDescriptor> collections(EPackage ePackage);
}
