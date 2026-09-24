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

import java.util.Objects;
import java.util.Optional;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;

/**
 * The four persisted attributes holding the bounding box of a feature's geometry.
 * <p>
 * They exist because a store without spatial support can still compare numbers: the
 * envelope test of {@code bbox=} or {@code S_INTERSECTS} becomes four comparisons the store
 * evaluates, and only the exact geometry test is left for memory.
 *
 * @param minX attribute holding the western edge
 * @param minY attribute holding the southern edge
 * @param maxX attribute holding the eastern edge
 * @param maxY attribute holding the northern edge
 */
public record BboxAttributes(EAttribute minX, EAttribute minY, EAttribute maxX, EAttribute maxY) {

	public BboxAttributes {
		Objects.requireNonNull(minX, "minX");
		Objects.requireNonNull(minY, "minY");
		Objects.requireNonNull(maxX, "maxX");
		Objects.requireNonNull(maxY, "maxY");
	}

	/**
	 * @param feature the feature
	 * @return the stored envelope, empty if one of the attributes is unset
	 */
	public Optional<Envelope> read(EObject feature) {
		if (!feature.eIsSet(minX) || !feature.eIsSet(minY) || !feature.eIsSet(maxX) || !feature.eIsSet(maxY)) {
			return Optional.empty();
		}
		return Optional.of(new Envelope(value(feature, minX), value(feature, minY),
				value(feature, maxX), value(feature, maxY)));
	}

	/**
	 * Stores the envelope in the feature, or unsets the attributes for {@code null}.
	 *
	 * @param feature the feature
	 * @param envelope the envelope, may be {@code null}
	 */
	public void write(EObject feature, Envelope envelope) {
		if (envelope == null) {
			feature.eUnset(minX);
			feature.eUnset(minY);
			feature.eUnset(maxX);
			feature.eUnset(maxY);
			return;
		}
		feature.eSet(minX, envelope.minX());
		feature.eSet(minY, envelope.minY());
		feature.eSet(maxX, envelope.maxX());
		feature.eSet(maxY, envelope.maxY());
	}

	private static double value(EObject feature, EAttribute attribute) {
		return ((Number) feature.eGet(attribute)).doubleValue();
	}
}
