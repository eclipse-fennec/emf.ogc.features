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
import java.util.Objects;

import org.eclipse.emf.ecore.EObject;

/**
 * One page of features.
 *
 * @param features the features of the requested page, in query order
 * @param numberMatched the number of features matching the filter regardless of paging,
 *        {@link #UNKNOWN} if it was not requested
 */
public record FeatureResult(List<EObject> features, long numberMatched) {

	/** {@link #numberMatched()} when the count was not requested */
	public static final long UNKNOWN = -1;

	public FeatureResult {
		features = List.copyOf(Objects.requireNonNull(features, "features"));
	}

	/**
	 * @return {@code true} if {@link #numberMatched()} carries a count
	 */
	public boolean hasNumberMatched() {
		return numberMatched != UNKNOWN;
	}
}
