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

import org.osgi.annotation.versioning.ConsumerType;

import net.opengis.cql2.Predicate;

/**
 * A filter language of the OGC API Features {@code filter} parameter, e.g. CQL2 text.
 * Registered as a service.
 */
@ConsumerType
public interface FilterLanguage {

	/**
	 * @return the value of the {@code filter-lang} parameter selecting this language, e.g. {@code cql2-text}
	 */
	String name();

	/**
	 * Parses a filter into the CQL2 model, which every feature source understands.
	 *
	 * @param filter the filter text
	 * @return the filter
	 * @throws IllegalArgumentException if the filter is invalid
	 */
	Predicate parse(String filter);

	/**
	 * @return the conformance class URIs this language contributes, e.g. the CQL2 classes
	 */
	default List<String> conformanceClasses() {
		return List.of();
	}
}
