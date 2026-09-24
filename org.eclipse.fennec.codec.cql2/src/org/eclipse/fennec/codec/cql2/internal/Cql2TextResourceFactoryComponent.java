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
import org.eclipse.fennec.codec.cql2.Cql2MediaTypes;
import org.eclipse.fennec.codec.cql2.Cql2TextResourceImpl;
import org.osgi.service.component.annotations.Component;

/**
 * The CQL2 text resource factory for the emf.osgi resource set, by content type
 * {@value Cql2MediaTypes#TEXT} and file extension {@value Cql2MediaTypes#TEXT_EXTENSION}.
 */
@Component(service = Resource.Factory.class)
@EMFConfigurator(configuratorType = ConfiguratorType.RESOURCE_FACTORY,
		configuratorName = Cql2MediaTypes.TEXT_FACTORY, fileExtension = Cql2MediaTypes.TEXT_EXTENSION,
		contentType = Cql2MediaTypes.TEXT)
public class Cql2TextResourceFactoryComponent extends ResourceFactoryImpl {

	@Override
	public Resource createResource(URI uri) {
		return new Cql2TextResourceImpl(uri);
	}
}
