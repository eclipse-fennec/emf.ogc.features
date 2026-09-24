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

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.charset.StandardCharsets;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.impl.ResourceImpl;
import net.opengis.cql2.Predicate;

/**
 * The CQL2 text encoding ({@value Cql2MediaTypes#TEXT}) as resource holding one filter.
 */
public class Cql2TextResourceImpl extends ResourceImpl {

	/**
	 * @param uri the resource URI
	 */
	public Cql2TextResourceImpl(URI uri) {
		super(uri);
	}

	@Override
	protected void doLoad(InputStream inputStream, Map<?, ?> options) throws IOException {
		String text = new String(inputStream.readAllBytes(), StandardCharsets.UTF_8);
		try {
			getContents().add(Cql2Text.parse(text));
		} catch (IllegalArgumentException e) {
			throw new IOException(e.getMessage(), e);
		}
	}

	@Override
	protected void doSave(OutputStream outputStream, Map<?, ?> options) throws IOException {
		if (getContents().isEmpty() || !(getContents().get(0) instanceof Predicate predicate)) {
			throw new IOException("A CQL2 text resource holds exactly one predicate");
		}
		try {
			outputStream.write(Cql2Text.write(predicate).getBytes(StandardCharsets.UTF_8));
		} catch (IllegalArgumentException e) {
			throw new IOException(e.getMessage(), e);
		}
	}
}
