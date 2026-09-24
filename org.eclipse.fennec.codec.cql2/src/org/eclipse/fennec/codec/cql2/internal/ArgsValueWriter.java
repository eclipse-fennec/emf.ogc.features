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

import org.eclipse.emf.ecore.EReference;
import org.eclipse.fennec.codec.value.CodecWriterContext;
import org.eclipse.fennec.codec.value.ReferenceValueWriter;
import net.opengis.cql2.Cql2Package;
import net.opengis.cql2.Expression;

/**
 * Codec writer of {@code Operation.args}: nested operations go back to the codec, which
 * writes their op from the discriminator; every other argument is written in its shape of
 * the CQL2 JSON encoding.
 */
public final class ArgsValueWriter implements ReferenceValueWriter<Expression> {

	@Override
	public String getName() {
		return ArgsValueReader.NAME;
	}

	@Override
	public boolean canHandle(EReference reference) {
		return Cql2Package.Literals.OPERATION__ARGS.equals(reference);
	}

	@Override
	public void write(Expression value, EReference feature, CodecWriterContext ctx) throws IOException {
		JsonArguments.write(ctx.getGenerator(), value,
				operation -> ctx.getJacksonContext().writeValue(ctx.getGenerator(), operation));
	}
}
