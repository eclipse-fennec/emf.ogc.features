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

import org.antlr.v4.runtime.BaseErrorListener;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Recognizer;
import net.opengis.cql2.Predicate;
import org.eclipse.fennec.codec.cql2.antlr.CQL2Lexer;
import org.eclipse.fennec.codec.cql2.antlr.CQL2Parser;
import org.eclipse.fennec.codec.cql2.internal.ModelBuilder;
import org.eclipse.fennec.codec.cql2.internal.TextWriter;

/**
 * The CQL2 text encoding ({@value Cql2MediaTypes#TEXT}): parses into and writes from the CQL2
 * model.
 */
public final class Cql2Text {

	private Cql2Text() {
	}

	/**
	 * @param text a filter in the CQL2 text encoding
	 * @return the filter as model
	 * @throws IllegalArgumentException with line and column of the first syntax error
	 */
	public static Predicate parse(String text) {
		ThrowingErrorListener errors = new ThrowingErrorListener();
		CQL2Lexer lexer = new CQL2Lexer(CharStreams.fromString(text));
		lexer.removeErrorListeners();
		lexer.addErrorListener(errors);
		CQL2Parser parser = new CQL2Parser(new CommonTokenStream(lexer));
		parser.removeErrorListeners();
		parser.addErrorListener(errors);
		return new ModelBuilder().visitFilter(parser.filter());
	}

	/**
	 * @param predicate a filter
	 * @return the filter in the CQL2 text encoding
	 * @throws IllegalArgumentException if the model has no text form, e.g. an operation with
	 *         too few arguments
	 */
	public static String write(Predicate predicate) {
		return TextWriter.write(predicate);
	}

	private static final class ThrowingErrorListener extends BaseErrorListener {

		@Override
		public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol, int line, int column, String msg,
				RecognitionException e) {
			throw new IllegalArgumentException("CQL2 syntax error at " + line + ":" + column + ": " + msg);
		}
	}
}
