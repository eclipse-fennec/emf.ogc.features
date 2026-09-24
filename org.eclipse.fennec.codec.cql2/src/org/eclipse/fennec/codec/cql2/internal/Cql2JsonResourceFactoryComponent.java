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
package org.eclipse.fennec.codec.cql2.internal;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceFactoryImpl;
import org.eclipse.fennec.emf.osgi.annotation.ConfiguratorType;
import org.eclipse.fennec.emf.osgi.annotation.provide.EMFConfigurator;
import org.eclipse.fennec.emf.osgi.metadata.MetadataService;
import net.opengis.cql2.Cql2Package;
import org.eclipse.fennec.codec.cql2.Cql2JsonResourceImpl;
import org.eclipse.fennec.codec.cql2.Cql2MediaTypes;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

/**
 * The CQL2 JSON resource factory for the emf.osgi resource set, by content type
 * {@value Cql2MediaTypes#JSON} and file extension {@value Cql2MediaTypes#JSON_EXTENSION}.
 */
@Component(service = Resource.Factory.class,
		reference = @Reference(name = "cql2Package", service = Cql2Package.class))
@EMFConfigurator(configuratorType = ConfiguratorType.RESOURCE_FACTORY,
		configuratorName = Cql2MediaTypes.JSON_FACTORY, fileExtension = Cql2MediaTypes.JSON_EXTENSION,
		contentType = Cql2MediaTypes.JSON)
public class Cql2JsonResourceFactoryComponent extends ResourceFactoryImpl {

	private final MetadataService metadataService;

	/**
	 * @param metadataService the metadata service
	 */
	@Activate
	public Cql2JsonResourceFactoryComponent(@Reference MetadataService metadataService) {
		this.metadataService = metadataService;
	}

	@Override
	public Resource createResource(URI uri) {
		return new Cql2JsonResourceImpl(uri, metadataService);
	}
}
