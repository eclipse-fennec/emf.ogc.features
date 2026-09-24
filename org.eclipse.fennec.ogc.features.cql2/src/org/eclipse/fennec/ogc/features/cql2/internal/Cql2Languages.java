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

import java.util.List;

/**
 * The conformance classes both CQL2 encodings share.
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
}
