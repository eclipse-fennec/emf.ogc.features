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

import java.util.Objects;

import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EDataType;
import org.geojson.Geometry;

/**
 * The EMF conversion of a GeoJSON geometry data type: {@code createFromString} parses GeoJSON
 * text, {@code convertToString} writes it. With it an XMI file carries a geometry as attribute
 * text, and {@code EcoreUtil.convertToString} of a geometry is GeoJSON rather than
 * {@code toString()}.
 * <p>
 * A model enables it by annotation, as EMF defines: the package carries the Ecore annotation
 * detail {@code conversionDelegates} naming {@link #URI}, and the data type an annotation with
 * {@link #URI} as source. {@link GeoJsonDataTypes} sets it on every geometry data type of a
 * registered package regardless, so a model that knows nothing of this server works as well.
 */
public final class GeoJsonConversion
		implements EDataType.Internal.ConversionDelegate, EDataType.Internal.ConversionDelegate.Factory {

	/** the conversion delegate URI a model names in its {@code conversionDelegates} detail */
	public static final String URI = "https://eclipse.org/fennec/ogc/features/geojson";

	/** the package of the GeoJSON model, prefix of every geometry instance class name */
	private static final String GEOJSON_PACKAGE = "org.geojson.";

	private final GeoJsonText text;

	/**
	 * @param text the GeoJSON reader and writer
	 */
	public GeoJsonConversion(GeoJsonText text) {
		this.text = Objects.requireNonNull(text, "text");
	}

	@Override
	public Object createFromString(String literal) {
		return text.read(literal);
	}

	@Override
	public String convertToString(Object value) {
		if (value == null) {
			return null;
		}
		if (value instanceof Geometry geometry) {
			return text.write(geometry);
		}
		throw new IllegalArgumentException("Not a GeoJSON geometry: " + value.getClass().getName());
	}

	@Override
	public EDataType.Internal.ConversionDelegate createConversionDelegate(EDataType eDataType) {
		return this;
	}

	/**
	 * @param classifier a classifier
	 * @return {@code true} if it is a data type whose instance class is a GeoJSON geometry
	 */
	public static boolean isGeometryType(EClassifier classifier) {
		return classifier instanceof EDataType dataType && dataType.getInstanceClass() != null
				&& Geometry.class.isAssignableFrom(dataType.getInstanceClass());
	}

	/**
	 * @param classifier a classifier
	 * @return {@code true} if it is a data type that names a GeoJSON class as instance class,
	 *         whether or not the class resolves
	 */
	public static boolean namesGeometryType(EClassifier classifier) {
		return classifier instanceof EDataType dataType && dataType.getInstanceClassName() != null
				&& dataType.getInstanceClassName().startsWith(GEOJSON_PACKAGE);
	}
}
