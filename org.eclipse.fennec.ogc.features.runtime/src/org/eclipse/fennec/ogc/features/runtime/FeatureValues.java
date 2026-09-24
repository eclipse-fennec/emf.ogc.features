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

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.fennec.ogc.features.api.CollectionDescriptor;
import org.geojson.Geometry;

import tools.jackson.core.JsonGenerator;

/**
 * Reads the parts of a feature reflectively, so that objects of generated and of dynamic
 * classes are handled alike.
 */
final class FeatureValues {

	private FeatureValues() {
	}

	static String id(CollectionDescriptor collection, EObject feature) {
		return EcoreUtil.convertToString(collection.idAttribute().getEAttributeType(),
				feature.eGet(collection.idAttribute()));
	}

	static Geometry geometry(CollectionDescriptor collection, EObject feature) {
		if (collection.geometry() == null) {
			return null;
		}
		return feature.eGet(collection.geometry()) instanceof Geometry geometry ? geometry : null;
	}

	/**
	 * @return the non-null property values of the feature, by attribute name, in attribute
	 *         order; a value equal to the attribute's default is included, as a feature of
	 *         the same type always carries the same properties. Includes the attributes of
	 *         the feature's own class, which may be a subclass of the collection type
	 */
	static Map<String, Object> properties(CollectionDescriptor collection, EObject feature) {
		Map<String, Object> result = new LinkedHashMap<>();
		for (EAttribute attribute : feature.eClass().getEAllAttributes()) {
			if (!collection.isProperty(attribute) || attribute.equals(collection.idAttribute())) {
				continue;
			}
			Object value = feature.eGet(attribute);
			if (value == null || (attribute.isMany() && ((List<?>) value).isEmpty())) {
				continue;
			}
			if (attribute.isMany()) {
				List<Object> values = new ArrayList<>();
				for (Object v : (List<?>) value) {
					values.add(simple(attribute, v));
				}
				result.put(attribute.getName(), values);
			} else {
				result.put(attribute.getName(), simple(attribute, value));
			}
		}
		return result;
	}

	/**
	 * @return the value as JSON friendly Java value: Number, Boolean, or String
	 */
	static Object simple(EAttribute attribute, Object value) {
		return switch (value) {
		case null -> null;
		case Number n -> n;
		case Boolean b -> b;
		case Enumerator e -> e.getLiteral();
		case Date d -> d.toInstant().toString();
		case String s -> s;
		default -> EcoreUtil.convertToString(attribute.getEAttributeType(), value);
		};
	}

	static void write(JsonGenerator generator, Object value) {
		switch (value) {
		case null -> generator.writeNull();
		case Integer i -> generator.writeNumber(i);
		case Long l -> generator.writeNumber(l);
		case Short s -> generator.writeNumber(s);
		case Byte b -> generator.writeNumber(b);
		case Double d -> generator.writeNumber(d);
		case Float f -> generator.writeNumber(f);
		case BigDecimal d -> generator.writeNumber(d);
		case BigInteger i -> generator.writeNumber(i);
		case Boolean b -> generator.writeBoolean(b);
		case List<?> list -> {
			generator.writeStartArray();
			for (Object v : list) {
				write(generator, v);
			}
			generator.writeEndArray();
		}
		default -> generator.writeString(value.toString());
		}
	}
}
