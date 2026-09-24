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
package org.eclipse.fennec.ogc.features.source.persistence.internal;

import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.fennec.ogc.features.geo.GeoJsonText;
import org.eclipse.fennec.persistence.api.TypeConverter;
import org.geojson.Geometry;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

/**
 * Stores attributes whose data type has an {@code org.geojson.Geometry} instance class as
 * GeoJSON text. Its name is {@value #NAME}; the converter service lists the names of all
 * converters it holds, so a persistence unit that must not start without this one sets
 * {@code fennec.jpa.converter.target=(fennec.persistence.converter=geojson)}.
 * <p>
 * This is the interim storage until Fennec persistence supports spatial columns
 * (eclipse-fennec/emf.persistence-jpa#262).
 */
@Component
public class GeoJsonTypeConverter implements TypeConverter {

	/** the converter name */
	public static final String NAME = "geojson";

	private final GeoJsonText text;

	/**
	 * @param factory the GeoJSON resource factory of the Fennec GeoJSON codec
	 */
	@Activate
	public GeoJsonTypeConverter(@Reference(target = "(emf.configuratorName=geojson)") Resource.Factory factory) {
		this.text = new GeoJsonText(factory);
	}

	@Override
	public String getName() {
		return NAME;
	}

	@Override
	public boolean isConverterForType(EClassifier eDataType) {
		return eDataType instanceof EDataType dataType && dataType.getInstanceClass() != null
				&& Geometry.class.isAssignableFrom(dataType.getInstanceClass());
	}

	@Override
	public boolean isLargeValue(EClassifier eDataType) {
		// a geometry as GeoJSON text has no useful bound: mapped as a Lob, not as VARCHAR(255)
		return isConverterForType(eDataType);
	}

	@Override
	public Object convertValueToEMF(EClassifier eDataType, Object value) {
		if (value == null || value instanceof Geometry) {
			return value;
		}
		return text.read(value.toString());
	}

	@Override
	public Object convertEMFToValue(EClassifier eDataType, Object emfValue) {
		if (emfValue instanceof Geometry geometry) {
			return text.write(geometry);
		}
		return emfValue;
	}
}
