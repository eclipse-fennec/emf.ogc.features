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
import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.fennec.codec.config.ConfigurationResolver;
import org.eclipse.fennec.codec.constants.CodecOptions;
import org.eclipse.fennec.codec.resource.CodecResource;
import org.eclipse.fennec.codec.value.CodecValueRegistry;
import org.eclipse.fennec.emf.osgi.metadata.MetadataService;
import net.opengis.cql2.Cql2Package;
import org.eclipse.fennec.codec.cql2.internal.ArgsValueReader;
import org.eclipse.fennec.codec.cql2.internal.ArgsValueWriter;

/**
 * The CQL2 JSON encoding ({@value Cql2MediaTypes#JSON}) as codec resource: the root is an
 * operation, whose class the codec resolves from its {@code op} through the discriminator
 * mapping of the CQL2 model; the arguments go through {@link ArgsValueReader} and
 * {@link ArgsValueWriter}.
 */
public class Cql2JsonResourceImpl extends CodecResource {

	/**
	 * @param uri the resource URI
	 * @param metadataService a metadata service knowing the CQL2 package
	 */
	public Cql2JsonResourceImpl(URI uri, MetadataService metadataService) {
		super(uri, metadataService, resolver(), values(), null);
	}

	private static ConfigurationResolver resolver() {
		return ConfigurationResolver.builder()
				.useId(false)
				.build();
	}

	private static CodecValueRegistry values() {
		return new CodecValueRegistry().register(new ArgsValueReader()).register(new ArgsValueWriter());
	}

	@Override
	protected void doLoad(InputStream inputStream, Map<?, ?> options) throws IOException {
		Map<Object, Object> effective = new HashMap<>();
		if (options != null) {
			effective.putAll(options);
		}
		effective.putIfAbsent(CodecOptions.CODEC_ROOT_TYPE, Cql2Package.Literals.OPERATION);
		super.doLoad(inputStream, effective);
	}
}
