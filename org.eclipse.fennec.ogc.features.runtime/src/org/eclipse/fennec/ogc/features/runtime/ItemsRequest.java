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

import static org.eclipse.fennec.model.query.builder.Expressions.path;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Optional;
import java.util.Set;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.fennec.ogc.features.api.CollectionDescriptor;
import org.eclipse.fennec.ogc.features.api.Envelope;
import org.eclipse.fennec.ogc.features.api.FeatureFilter;
import org.eclipse.fennec.ogc.features.api.FeatureQuery;
import org.eclipse.fennec.ogc.features.api.FilterLanguage;
import org.eclipse.fennec.ogc.features.geo.FeaturePredicates;
import org.eclipse.fennec.ogc.features.geo.JtsGeometries;
import org.eclipse.fennec.ogc.features.geo.SpatialRelation;

/**
 * The parameters of an items request, translated into a {@link FeatureQuery}.
 *
 * @param query the query
 * @param limit the effective page size
 * @param offset the offset
 * @param parameters the request parameters except {@code offset}, for paging links
 */
record ItemsRequest(FeatureQuery query, int limit, int offset, Map<String, String> parameters) {

	/** CRS84, the only CRS of milestone 1 */
	static final String CRS84 = "http://www.opengis.net/def/crs/OGC/1.3/CRS84";
	/** the filter language used when {@code filter-lang} is absent */
	static final String DEFAULT_FILTER_LANG = "cql2-text";

	private static final Set<String> STANDARD = Set.of("f", "limit", "offset", "bbox", "bbox-crs", "datetime",
			"filter", "filter-lang", "filter-crs");

	/**
	 * @param parameters the request parameters, first value each
	 * @param collection the collection
	 * @param languages the available filter languages by name
	 * @param defaultLimit the page size when {@code limit} is absent
	 * @param maxLimit the largest page size served
	 * @return the request
	 * @throws RequestException for an invalid or unknown parameter
	 */
	static ItemsRequest parse(Map<String, String> parameters, CollectionDescriptor collection,
			Map<String, FilterLanguage> languages, int defaultLimit, int maxLimit) {
		int limit = Math.min(integer(parameters, "limit", defaultLimit, 1), maxLimit);
		int offset = integer(parameters, "offset", 0, 0);
		FeatureQuery.Builder builder = FeatureQuery.builder(collection).limit(limit).offset(offset).count(true);

		requireCrs84(parameters, "bbox-crs");
		String bbox = parameters.get("bbox");
		if (bbox != null) {
			bbox(builder, collection, envelope(bbox));
		}

		String datetime = parameters.get("datetime");
		if (datetime != null && collection.temporal() != null) {
			try {
				builder.where(DateTimeParameter.parse(datetime).toExpression(collection.temporal()));
			} catch (IllegalArgumentException e) {
				throw RequestException.badRequest("Invalid datetime: " + e.getMessage());
			}
		}

		String filter = parameters.get("filter");
		if (filter != null) {
			requireCrs84(parameters, "filter-crs");
			String lang = parameters.getOrDefault("filter-lang", DEFAULT_FILTER_LANG);
			FilterLanguage language = languages.get(lang);
			if (language == null) {
				throw RequestException.badRequest("Unsupported filter-lang '" + lang + "', supported: " + languages.keySet());
			}
			try {
				FeatureFilter parsed = language.parse(filter, collection);
				parsed.applyTo(builder);
			} catch (IllegalArgumentException e) {
				throw RequestException.badRequest("Invalid filter: " + e.getMessage());
			}
		} else if (parameters.containsKey("filter-lang") || parameters.containsKey("filter-crs")) {
			throw RequestException.badRequest("filter-lang and filter-crs require a filter");
		}

		for (Map.Entry<String, String> parameter : parameters.entrySet()) {
			if (STANDARD.contains(parameter.getKey())) {
				continue;
			}
			EAttribute property = collection.property(parameter.getKey())
					.orElseThrow(() -> RequestException.badRequest("Unknown parameter '" + parameter.getKey() + "'"));
			builder.where(path(property).eq(value(property, parameter.getValue())));
		}

		Map<String, String> paging = new LinkedHashMap<>(parameters);
		paging.remove("offset");
		paging.put("limit", Integer.toString(limit));
		return new ItemsRequest(builder.build(), limit, offset, paging);
	}

	private static void bbox(FeatureQuery.Builder builder, CollectionDescriptor collection, Envelope envelope) {
		if (collection.bbox() != null) {
			builder.where(collection.bbox().intersects(envelope));
		}
		if (collection.geometry() != null) {
			// the stored boxes only pre-filter: a polygon's box may touch the bbox while the polygon does not
			builder.residual(FeaturePredicates.spatial(collection.geometry(), SpatialRelation.INTERSECTS,
					JtsGeometries.toJts(envelope)));
		}
	}

	private static Envelope envelope(String bbox) {
		try {
			return Envelope.parse(bbox);
		} catch (IllegalArgumentException e) {
			throw RequestException.badRequest("Invalid bbox: " + e.getMessage());
		}
	}

	private static void requireCrs84(Map<String, String> parameters, String name) {
		String crs = parameters.get(name);
		if (crs != null && !CRS84.equals(crs)) {
			throw RequestException.badRequest(name + " '" + crs + "' is not supported, only " + CRS84);
		}
	}

	private static int integer(Map<String, String> parameters, String name, int defaultValue, int min) {
		String value = parameters.get(name);
		if (value == null) {
			return defaultValue;
		}
		try {
			int parsed = Integer.parseInt(value.trim());
			if (parsed < min) {
				throw RequestException.badRequest(name + " must be at least " + min);
			}
			return parsed;
		} catch (NumberFormatException e) {
			throw RequestException.badRequest(name + " must be an integer: " + value);
		}
	}

	private static Object value(EAttribute property, String text) {
		try {
			return Optional.ofNullable(EcoreUtil.createFromString(property.getEAttributeType(), text))
					.orElseThrow(() -> RequestException.badRequest("Invalid value for " + property.getName()));
		} catch (RuntimeException e) {
			if (e instanceof RequestException r) {
				throw r;
			}
			throw RequestException.badRequest("Invalid value for " + property.getName() + ": " + text);
		}
	}
}
