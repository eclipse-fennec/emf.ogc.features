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

import java.io.IOException;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.fennec.codec.context.ContextHelper;
import org.eclipse.fennec.codec.value.CodecReaderContext;
import org.eclipse.fennec.codec.value.ReferenceValueReader;
import net.opengis.cql2.Cql2Package;
import net.opengis.cql2.Expression;
import org.geojson.GeoJsonPackage;
import org.geojson.Geometry;

import tools.jackson.core.JsonParser;
import tools.jackson.databind.DeserializationContext;
import tools.jackson.databind.JsonNode;

/**
 * Codec reader of {@code Operation.args}: the codec hands over one array element at a time,
 * which is told apart by its shape.
 */
public final class ArgsValueReader implements ReferenceValueReader<Expression> {

	/** the reader name, referenced by the codec annotation of Operation.args */
	public static final String NAME = "cql2.args";

	@Override
	public String getName() {
		return NAME;
	}

	@Override
	public boolean canHandle(EReference reference) {
		return Cql2Package.Literals.OPERATION__ARGS.equals(reference);
	}

	@Override
	public Expression read(CodecReaderContext ctx, EReference feature) throws IOException {
		// through the codec's deserialization context: its parser has no mapper to read trees with
		JsonNode node = ctx.getJacksonContext().readTree(ctx.getParser());
		try {
			return JsonArguments.read(node, geometry -> geometry(ctx.getJacksonContext(), geometry));
		} catch (IllegalArgumentException e) {
			ctx.addError(e.getMessage());
			throw new IOException(e.getMessage(), e);
		}
	}

	/** a GeoJSON geometry, deserialized by the codec with the configuration of the resource */
	private static Geometry geometry(DeserializationContext ctxt, JsonNode node) {
		EClass previous = ContextHelper.getExpectedType(ctxt);
		ContextHelper.setExpectedType(ctxt, GeoJsonPackage.Literals.GEOMETRY);
		try (JsonParser parser = node.traverse(ctxt)) {
			parser.nextToken();
			EObject geometry = (EObject) ctxt.findRootValueDeserializer(ctxt.constructType(EObject.class))
					.deserialize(parser, ctxt);
			if (geometry instanceof Geometry g) {
				return g;
			}
			throw new IllegalArgumentException("No GeoJSON geometry: " + node);
		} finally {
			if (previous != null) {
				ContextHelper.setExpectedType(ctxt, previous);
			} else {
				ContextHelper.clearExpectedType(ctxt);
			}
		}
	}
}
