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
 */
record CollectionView(CollectionDescriptor descriptor, Optional<Envelope> extent, List<Link> links) {
}
