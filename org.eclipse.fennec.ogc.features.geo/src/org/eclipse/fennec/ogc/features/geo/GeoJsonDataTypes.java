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
package org.eclipse.fennec.ogc.features.geo;

import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Reference;
import org.osgi.service.component.annotations.ReferenceCardinality;
import org.osgi.service.component.annotations.ReferencePolicy;

/**
 * Gives every GeoJSON geometry data type of a registered EPackage its {@link GeoJsonConversion},
 * so instances loaded from XMI carry a geometry and not its text, and registers the conversion
 * under {@link GeoJsonConversion#URI} for models that name it by annotation.
 * <p>
 * A data type of a dynamic package that names a GeoJSON class but cannot resolve it is
 * reported once: EMF resolves the class through the ecore bundle, which needs the
 * {@code org.eclipse.fennec.ogc.features.ecore.fragment} to see {@code org.geojson}.
 */
@Component(immediate = true)
public class GeoJsonDataTypes {

	private static final System.Logger LOGGER = System.getLogger(GeoJsonDataTypes.class.getName());

	private final GeoJsonConversion conversion;

	/**
	 * @param factory the GeoJSON resource factory of the Fennec GeoJSON codec
	 */
	@Activate
	public GeoJsonDataTypes(@Reference(target = "(emf.configuratorName=geojson)") Resource.Factory factory) {
		this.conversion = new GeoJsonConversion(new GeoJsonText(factory));
		EDataType.Internal.ConversionDelegate.Factory.Registry.INSTANCE.put(GeoJsonConversion.URI, conversion);
	}

	@Deactivate
	void deactivate() {
		EDataType.Internal.ConversionDelegate.Factory.Registry.INSTANCE.remove(GeoJsonConversion.URI, conversion);
	}

	@Reference(cardinality = ReferenceCardinality.MULTIPLE, policy = ReferencePolicy.DYNAMIC)
	void addPackage(EPackage ePackage) {
		apply(ePackage);
	}

	void removePackage(EPackage ePackage) {
		// the conversion stays: instances of the package may still be around
	}

	private void apply(EPackage ePackage) {
		for (EClassifier classifier : ePackage.getEClassifiers()) {
			if (GeoJsonConversion.isGeometryType(classifier)) {
				EDataType.Internal dataType = (EDataType.Internal) classifier;
				if (dataType.getConversionDelegate() == null) {
					dataType.setConversionDelegate(conversion);
				}
			} else if (GeoJsonConversion.namesGeometryType(classifier)) {
				LOGGER.log(System.Logger.Level.WARNING, "Data type " + classifier.getName() + " of package "
						+ ePackage.getNsURI() + " names " + ((EDataType) classifier).getInstanceClassName()
						+ " but the class does not resolve: no geometry can be held. A dynamic package needs the "
						+ "org.eclipse.fennec.ogc.features.ecore.fragment installed with org.eclipse.emf.ecore");
			}
		}
		for (EPackage subpackage : ePackage.getESubpackages()) {
			apply(subpackage);
		}
	}
}
