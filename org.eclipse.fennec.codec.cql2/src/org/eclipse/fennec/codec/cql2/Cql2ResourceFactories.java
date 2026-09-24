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

import java.util.Objects;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceFactoryImpl;
import org.eclipse.fennec.codec.util.MetadataServiceFactory;
import org.eclipse.fennec.emf.osgi.metadata.MetadataService;
import org.eclipse.fennec.emf.osgi.metadata.MetadataWhiteboard;
import net.opengis.cql2.Cql2Package;
import org.geojson.GeoJsonPackage;

/**
 * Resource factories of the two CQL2 encodings, for use without OSGi; in OSGi they are
 * registered as {@code Resource.Factory} services by content type and file extension.
 */
public final class Cql2ResourceFactories {

	private Cql2ResourceFactories() {
	}

	/**
	 * @return a factory of text resources
	 */
	public static Resource.Factory text() {
		return new ResourceFactoryImpl() {
			@Override
			public Resource createResource(URI uri) {
				return new Cql2TextResourceImpl(uri);
			}
		};
	}

	/**
	 * @param metadataService a metadata service knowing the CQL2 package
	 * @return a factory of JSON resources
	 */
	public static Resource.Factory json(MetadataService metadataService) {
		Objects.requireNonNull(metadataService, "metadataService");
		return new ResourceFactoryImpl() {
			@Override
			public Resource createResource(URI uri) {
				return new Cql2JsonResourceImpl(uri, metadataService);
			}
		};
	}

	/**
	 * @return a factory of JSON resources over a metadata service of its own
	 */
	public static Resource.Factory json() {
		MetadataWhiteboard metadata = MetadataServiceFactory.create();
		metadata.registerPackage(GeoJsonPackage.eINSTANCE);
		metadata.registerPackage(Cql2Package.eINSTANCE);
		return json(metadata);
	}
}
