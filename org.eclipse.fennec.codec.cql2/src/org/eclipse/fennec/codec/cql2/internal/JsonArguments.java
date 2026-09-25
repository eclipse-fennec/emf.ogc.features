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

import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.geojson.Geometry;
import net.opengis.cql2.ArrayLiteral;
import net.opengis.cql2.BboxLiteral;
import net.opengis.cql2.BooleanLiteral;
import net.opengis.cql2.Cql2Factory;
import net.opengis.cql2.Cql2Package;
import net.opengis.cql2.DateLiteral;
import net.opengis.cql2.Expression;
import net.opengis.cql2.GeometryLiteral;
import net.opengis.cql2.NumberLiteral;
import net.opengis.cql2.Operation;
import net.opengis.cql2.PropertyRef;
import net.opengis.cql2.StringLiteral;
import net.opengis.cql2.TimestampLiteral;

import tools.jackson.core.JsonGenerator;
import tools.jackson.databind.JsonNode;

/**
 * The arguments of the CQL2 JSON encoding. They mix operations, property references, typed
 * literal objects, GeoJSON geometries, arrays and bare JSON values, told apart by their shape.
 */
public final class JsonArguments {

	/** annotation source of the codec discriminator mapping of the CQL2 model */
	static final String TYPE_MAPPING = "http://eclipse.org/fennec/codec/typeMapping/cql2";

	private static final Cql2Factory F = Cql2Factory.eINSTANCE;
	private static final Map<String, EClass> OPERATIONS = new HashMap<>();
	private static final Map<EClass, String> NAMES = new HashMap<>();

	static {
		for (EClassifier classifier : Cql2Package.eINSTANCE.getEClassifiers()) {
			if (classifier instanceof EClass eClass && !eClass.isAbstract()
					&& Cql2Package.Literals.OPERATION.isSuperTypeOf(eClass)) {
				String op = EcoreUtil.getAnnotation(eClass, TYPE_MAPPING, "typeDiscriminator");
				OPERATIONS.put(op, eClass);
				NAMES.put(eClass, op);
			}
		}
	}

	private JsonArguments() {
	}

	/**
	 * @param op the op of the JSON encoding, e.g. {@code s_intersects}
	 * @return the operation class
	 * @throws IllegalArgumentException for an unknown op
	 */
	public static EClass operation(String op) {
		EClass eClass = OPERATIONS.get(op);
		if (eClass == null) {
			throw new IllegalArgumentException("Unsupported CQL2 operation '" + op + "'");
		}
		return eClass;
	}

	/**
	 * @param operation an operation
	 * @return its op in the JSON encoding
	 */
	public static String op(Operation operation) {
		return NAMES.get(operation.eClass());
	}

	/**
	 * @param node one argument
	 * @param geometries reads a GeoJSON geometry
	 * @return it as model
	 * @throws IllegalArgumentException if it is no CQL2 argument
	 */
	public static Expression read(JsonNode node, Function<JsonNode, Geometry> geometries) {
		if (node.isString()) {
			StringLiteral literal = F.createStringLiteral();
			literal.setValue(node.asString());
			return literal;
		}
		if (node.isNumber()) {
			NumberLiteral literal = F.createNumberLiteral();
			literal.setValue(node.decimalValue());
			return literal;
		}
		if (node.isBoolean()) {
			BooleanLiteral literal = F.createBooleanLiteral();
			literal.setValue(node.booleanValue());
			return literal;
		}
		if (node.isArray()) {
			ArrayLiteral array = F.createArrayLiteral();
			node.forEach(element -> array.getElements().add(read(element, geometries)));
			return array;
		}
		if (!node.isObject()) {
			throw new IllegalArgumentException("Unsupported CQL2 argument " + node);
		}
		if (node.has("op")) {
			Operation operation = (Operation) EcoreUtil.create(operation(node.path("op").asString()));
			JsonNode args = node.path("args");
			if (!args.isArray()) {
				throw new IllegalArgumentException("Operation '" + node.path("op").asString() + "' has no args array");
			}
			args.forEach(arg -> operation.getArgs().add(read(arg, geometries)));
			return operation;
		}
		if (node.has("property")) {
			PropertyRef ref = F.createPropertyRef();
			ref.setProperty(node.path("property").asString());
			return ref;
		}
		if (node.has("timestamp")) {
			TimestampLiteral literal = F.createTimestampLiteral();
			literal.setTimestamp(node.path("timestamp").asString());
			return literal;
		}
		if (node.has("date")) {
			DateLiteral literal = F.createDateLiteral();
			literal.setDate(node.path("date").asString());
			return literal;
		}
		if (node.has("bbox")) {
			BboxLiteral bbox = F.createBboxLiteral();
			node.path("bbox").forEach(n -> bbox.getBbox().add(n.doubleValue()));
			return bbox;
		}
		if (node.has("type") && (node.has("coordinates") || node.has("geometries"))) {
			GeometryLiteral literal = F.createGeometryLiteral();
			literal.setGeometry(geometries.apply(node));
			return literal;
		}
		throw new IllegalArgumentException("Unsupported CQL2 argument " + node);
	}

	/**
	 * Writes an argument that is no operation; operations go through the codec.
	 *
	 * @param generator the generator, positioned where a value is expected
	 * @param expression the argument
	 * @param operations writes a nested operation
	 */
	public static void write(JsonGenerator generator, Expression expression, OperationWriter operations) {
		switch (expression) {
		case Operation operation -> operations.write(operation);
		case StringLiteral s -> generator.writeString(s.getValue());
		case NumberLiteral n -> generator.writeNumber(n.getValue());
		case BooleanLiteral b -> generator.writeBoolean(b.isValue());
		case PropertyRef p -> {
			generator.writeStartObject();
			generator.writeStringProperty("property", p.getProperty());
			generator.writeEndObject();
		}
		case TimestampLiteral t -> {
			generator.writeStartObject();
			generator.writeStringProperty("timestamp", t.getTimestamp());
			generator.writeEndObject();
		}
		case DateLiteral d -> {
			generator.writeStartObject();
			generator.writeStringProperty("date", d.getDate());
			generator.writeEndObject();
		}
		case BboxLiteral b -> {
			generator.writeStartObject();
			generator.writeArrayPropertyStart("bbox");
			for (Double v : b.getBbox()) {
				generator.writeNumber(v);
			}
			generator.writeEndArray();
			generator.writeEndObject();
		}
		case ArrayLiteral a -> {
			generator.writeStartArray();
			for (Expression element : a.getElements()) {
				write(generator, element, operations);
			}
			generator.writeEndArray();
		}
		case GeometryLiteral g -> GeoJson.write(generator, g.getGeometry());
		default -> throw new IllegalArgumentException("Cannot write " + expression.eClass().getName() + " as CQL2 JSON");
		}
	}

	/** writes a nested operation, e.g. through the codec */
	@FunctionalInterface
	public interface OperationWriter {
		void write(Operation operation);
	}
}
