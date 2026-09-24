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
 * A request the server answers with an OGC exception document and an HTTP error status.
 */
class RequestException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	private final int status;
	private final String code;

	RequestException(int status, String code, String description) {
		super(description);
		this.status = status;
		this.code = code;
	}

	static RequestException badRequest(String description) {
		return new RequestException(400, "InvalidParameterValue", description);
	}

	static RequestException notFound(String description) {
		return new RequestException(404, "NotFound", description);
	}

	static RequestException notAcceptable(String description) {
		return new RequestException(406, "NotAcceptable", description);
	}

	static RequestException notImplemented(String description) {
		return new RequestException(501, "NotImplemented", description);
	}

	int status() {
		return status;
	}

	String code() {
		return code;
	}
}
