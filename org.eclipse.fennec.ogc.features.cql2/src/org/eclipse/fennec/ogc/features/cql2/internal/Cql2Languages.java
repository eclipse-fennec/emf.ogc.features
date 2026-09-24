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
package org.eclipse.fennec.ogc.features.cql2.internal;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.List;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;

import net.opengis.cql2.Predicate;

/**
 * What both CQL2 encodings share: the conformance classes and reading a filter through the
 * encoding's EMF resource.
 */
final class Cql2Languages {

	static final List<String> SHARED = List.of(
			"http://www.opengis.net/spec/cql2/1.0/conf/basic-cql2",
			"http://www.opengis.net/spec/cql2/1.0/conf/advanced-comparison-operators",
			"http://www.opengis.net/spec/cql2/1.0/conf/basic-spatial-functions",
			"http://www.opengis.net/spec/cql2/1.0/conf/basic-spatial-functions-plus",
			"http://www.opengis.net/spec/cql2/1.0/conf/spatial-functions",
			"http://www.opengis.net/spec/cql2/1.0/conf/property-property");

	private Cql2Languages() {
	}

	/**
	 * @param factory the resource factory of the encoding
	 * @param uri a URI naming the encoding by its file extension
	 * @param filter the filter text
	 * @return the filter
	 * @throws IllegalArgumentException if the filter is invalid
	 */
	static Predicate parse(Resource.Factory factory, String uri, String filter) {
		Resource resource = factory.createResource(URI.createURI(uri));
		try {
			resource.load(new ByteArrayInputStream(filter.getBytes(StandardCharsets.UTF_8)), null);
		} catch (IOException | RuntimeException e) {
			throw new IllegalArgumentException(message(e), e);
		}
		if (!resource.getErrors().isEmpty()) {
			throw new IllegalArgumentException(resource.getErrors().get(0).getMessage());
		}
		List<EObject> contents = resource.getContents();
		if (contents.size() != 1 || !(contents.get(0) instanceof Predicate predicate)) {
			throw new IllegalArgumentException("A filter is one CQL2 predicate");
		}
		return predicate;
	}

	/** the resources may wrap the parser's IllegalArgumentException, which names the problem */
	private static String message(Throwable e) {
		String message = e.getMessage();
		for (Throwable cause = e; cause != null; cause = cause.getCause()) {
			if (cause instanceof IllegalArgumentException) {
				message = cause.getMessage();
			}
		}
		return message;
	}
}
