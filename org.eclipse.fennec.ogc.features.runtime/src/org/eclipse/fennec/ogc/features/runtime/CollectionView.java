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

import java.util.List;
import java.util.Optional;

import org.eclipse.fennec.ogc.features.api.CollectionDescriptor;
import org.eclipse.fennec.ogc.features.api.Envelope;

/**
 * What the server tells about a collection.
 *
 * @param descriptor the collection
 * @param extent its spatial extent, if known
 * @param links its links
 * @param layerGroup the layer group as published: the configured folder of the package, if
 *        any, followed by the group of the collection, separated by {@code /}; may be {@code null}
 */
record CollectionView(CollectionDescriptor descriptor, Optional<Envelope> extent, List<Link> links, String layerGroup) {

	/**
	 * @return {@code true} if the collection type is abstract, i.e. the collection gathers the
	 *         features of several other collections
	 */
	boolean aggregate() {
		return descriptor.type().isAbstract();
	}
}
