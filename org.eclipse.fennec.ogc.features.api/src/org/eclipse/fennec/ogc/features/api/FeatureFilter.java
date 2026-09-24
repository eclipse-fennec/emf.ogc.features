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

import java.util.function.Predicate;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.fennec.model.expression.Expression;

/**
 * A filter split into the part a store evaluates and the part that has to be evaluated in
 * memory, see {@link FeatureQuery}.
 *
 * @param store the store part, {@code null} if the store cannot narrow the result at all
 * @param residual the in-memory part, {@code null} if the store part is exact
 */
public record FeatureFilter(Expression store, Predicate<EObject> residual) {

	/**
	 * @param builder the query builder
	 * @return the builder with both parts added
	 */
	public FeatureQuery.Builder applyTo(FeatureQuery.Builder builder) {
		return builder.where(store).residual(residual);
	}
}
