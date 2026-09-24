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

import java.util.Objects;
import java.util.function.Predicate;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.locationtech.jts.geom.Geometry;
import org.locationtech.jts.geom.prep.PreparedGeometry;
import org.locationtech.jts.geom.prep.PreparedGeometryFactory;

/**
 * In-memory predicates over the geometry attribute of features, the residual part of a
 * spatial filter.
 */
public final class FeaturePredicates {

	private FeaturePredicates() {
	}

	/**
	 * @param geometryAttribute the attribute holding the feature's GeoJSON EMF geometry
	 * @param relation the relation
	 * @param literal the geometry of the filter, the second argument of the relation
	 * @return a predicate that holds if the relation holds between the feature's geometry and
	 *         the literal; a feature without geometry never matches
	 */
	public static Predicate<EObject> spatial(EAttribute geometryAttribute, SpatialRelation relation, Geometry literal) {
		Objects.requireNonNull(geometryAttribute, "geometryAttribute");
		Objects.requireNonNull(relation, "relation");
		Objects.requireNonNull(literal, "literal");
		if (relation == SpatialRelation.INTERSECTS) {
			// the common case, e.g. every bbox request of a map client
			PreparedGeometry prepared = PreparedGeometryFactory.prepare(literal);
			return feature -> geometry(feature, geometryAttribute) instanceof Geometry g && prepared.intersects(g);
		}
		return feature -> geometry(feature, geometryAttribute) instanceof Geometry g && relation.test(g, literal);
	}

	private static Geometry geometry(EObject feature, EAttribute geometryAttribute) {
		if (!geometryAttribute.getEContainingClass().isSuperTypeOf(feature.eClass())) {
			return null;
		}
		Object value = feature.eGet(geometryAttribute);
		return value instanceof org.geojson.Geometry geometry ? JtsGeometries.toJts(geometry) : null;
	}
}
