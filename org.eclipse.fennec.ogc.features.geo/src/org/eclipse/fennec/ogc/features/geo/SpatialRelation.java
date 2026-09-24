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
package org.eclipse.fennec.ogc.features.geo;

import java.util.Locale;
import java.util.Optional;
import java.util.function.BiPredicate;

import org.locationtech.jts.geom.Geometry;

/**
 * The spatial relations of the OGC Simple Features model, as used by the CQL2 spatial
 * functions ({@code S_INTERSECTS} ...).
 */
public enum SpatialRelation {

	INTERSECTS("S_INTERSECTS", Geometry::intersects, true),
	EQUALS("S_EQUALS", Geometry::equalsTopo, true),
	DISJOINT("S_DISJOINT", Geometry::disjoint, false),
	TOUCHES("S_TOUCHES", Geometry::touches, true),
	WITHIN("S_WITHIN", Geometry::within, true),
	OVERLAPS("S_OVERLAPS", Geometry::overlaps, true),
	CROSSES("S_CROSSES", Geometry::crosses, true),
	CONTAINS("S_CONTAINS", Geometry::contains, true);

	private final String cql2Name;
	private final BiPredicate<Geometry, Geometry> test;
	private final boolean requiresIntersectingEnvelopes;

	SpatialRelation(String cql2Name, BiPredicate<Geometry, Geometry> test, boolean requiresIntersectingEnvelopes) {
		this.cql2Name = cql2Name;
		this.test = test;
		this.requiresIntersectingEnvelopes = requiresIntersectingEnvelopes;
	}

	/**
	 * @return the CQL2 function name, e.g. {@code S_INTERSECTS}
	 */
	public String cql2Name() {
		return cql2Name;
	}

	/**
	 * Whether the relation can only hold when both envelopes intersect. For those relations
	 * an envelope test is a valid pre-filter the store can evaluate; for {@link #DISJOINT} it is not.
	 *
	 * @return {@code true} if intersecting envelopes are a necessary condition
	 */
	public boolean requiresIntersectingEnvelopes() {
		return requiresIntersectingEnvelopes;
	}

	/**
	 * @param a the first geometry, usually the feature's
	 * @param b the second geometry, usually the literal of the filter
	 * @return {@code true} if the relation holds for {@code a} and {@code b}
	 */
	public boolean test(Geometry a, Geometry b) {
		return test.test(a, b);
	}

	/**
	 * @param name a CQL2 function name, case insensitive
	 * @return the relation, empty if the name is no spatial function
	 */
	public static Optional<SpatialRelation> ofCql2Name(String name) {
		String upper = name.toUpperCase(Locale.ROOT);
		for (SpatialRelation relation : values()) {
			if (relation.cql2Name.equals(upper)) {
				return Optional.of(relation);
			}
		}
		return Optional.empty();
	}
}
