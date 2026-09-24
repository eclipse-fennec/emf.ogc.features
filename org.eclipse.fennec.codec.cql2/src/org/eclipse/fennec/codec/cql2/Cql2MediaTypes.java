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
package org.eclipse.fennec.codec.cql2;

/**
 * The media types, file extensions and resource factory names of the two CQL2 encodings.
 */
public final class Cql2MediaTypes {

	/** the CQL2 text encoding */
	public static final String TEXT = "text/cql2";
	/** the CQL2 JSON encoding */
	public static final String JSON = "application/cql2+json";
	/** file extension of the text encoding */
	public static final String TEXT_EXTENSION = "cql2";
	/** file extension of the JSON encoding */
	public static final String JSON_EXTENSION = "cql2json";
	/** emf.configuratorName of the text resource factory */
	public static final String TEXT_FACTORY = "cql2-text";
	/** emf.configuratorName of the JSON resource factory */
	public static final String JSON_FACTORY = "cql2-json";

	private Cql2MediaTypes() {
	}
}
