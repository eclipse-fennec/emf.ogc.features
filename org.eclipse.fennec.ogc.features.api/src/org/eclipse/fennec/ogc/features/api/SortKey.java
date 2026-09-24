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

import org.eclipse.emf.ecore.EAttribute;

/**
 * One sort criterion of a {@link FeatureQuery}.
 *
 * @param attribute the attribute to sort by
 * @param ascending sort direction
 */
public record SortKey(EAttribute attribute, boolean ascending) {

	public SortKey {
		Objects.requireNonNull(attribute, "attribute");
	}

	/**
	 * @param attribute the attribute
	 * @return ascending sort by the attribute
	 */
	public static SortKey asc(EAttribute attribute) {
		return new SortKey(attribute, true);
	}

	/**
	 * @param attribute the attribute
	 * @return descending sort by the attribute
	 */
	public static SortKey desc(EAttribute attribute) {
		return new SortKey(attribute, false);
	}
}
