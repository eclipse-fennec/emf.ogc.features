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

/**
 * The media types the server produces.
 */
final class MediaTypes {

	static final String JSON = "application/json";
	static final String GEO_JSON = "application/geo+json";
	static final String HTML = "text/html";
	static final String OPEN_API = "application/vnd.oai.openapi+json;version=3.0";
	static final String JSON_SCHEMA = "application/schema+json";
	static final String QGIS_PROJECT = "application/x-qgis-project";

	private MediaTypes() {
	}
}
