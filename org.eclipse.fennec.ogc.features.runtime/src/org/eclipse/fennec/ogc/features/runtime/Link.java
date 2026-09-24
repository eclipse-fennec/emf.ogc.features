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
 * A link of an OGC API resource.
 *
 * @param href the target URL
 * @param rel the relation type
 * @param type the media type of the target, may be {@code null}
 * @param title a title, may be {@code null}
 */
record Link(String href, String rel, String type, String title) {
}
