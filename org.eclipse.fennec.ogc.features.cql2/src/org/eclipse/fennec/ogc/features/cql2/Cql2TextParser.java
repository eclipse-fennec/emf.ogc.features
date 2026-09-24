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
package org.eclipse.fennec.ogc.features.cql2;

import java.math.BigDecimal;
import java.time.Instant;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Set;

import org.eclipse.fennec.ogc.features.cql2.Cql2.And;
import org.eclipse.fennec.ogc.features.cql2.Cql2.Between;
import org.eclipse.fennec.ogc.features.cql2.Cql2.BooleanValue;
import org.eclipse.fennec.ogc.features.cql2.Cql2.Comparison;
import org.eclipse.fennec.ogc.features.cql2.Cql2.GeometryLiteral;
import org.eclipse.fennec.ogc.features.cql2.Cql2.In;
import org.eclipse.fennec.ogc.features.cql2.Cql2.IsNull;
import org.eclipse.fennec.ogc.features.cql2.Cql2.Like;
import org.eclipse.fennec.ogc.features.cql2.Cql2.Literal;
import org.eclipse.fennec.ogc.features.cql2.Cql2.Not;
import org.eclipse.fennec.ogc.features.cql2.Cql2.Operand;
import org.eclipse.fennec.ogc.features.cql2.Cql2.Operator;
import org.eclipse.fennec.ogc.features.cql2.Cql2.Or;
import org.eclipse.fennec.ogc.features.cql2.Cql2.Predicate;
import org.eclipse.fennec.ogc.features.cql2.Cql2.Property;
import org.eclipse.fennec.ogc.features.cql2.Cql2.Spatial;
import org.eclipse.fennec.ogc.features.geo.JtsGeometries;
import org.eclipse.fennec.ogc.features.geo.SpatialRelation;
import org.locationtech.jts.geom.Envelope;
import org.locationtech.jts.geom.Geometry;
import org.locationtech.jts.io.ParseException;
import org.locationtech.jts.io.WKTReader;

/**
 * Parses the CQL2 text encoding: basic CQL2, the advanced comparison operators
 * ({@code LIKE}, {@code BETWEEN}, {@code IN}) and the spatial functions with WKT and
 * {@code BBOX} literals. Keywords are case insensitive.
 */
public final class Cql2TextParser {

	private static final Set<String> WKT = Set.of("POINT", "LINESTRING", "POLYGON", "MULTIPOINT", "MULTILINESTRING",
			"MULTIPOLYGON", "GEOMETRYCOLLECTION");

	private final String text;
	private int pos;
	private Token token;

	private Cql2TextParser(String text) {
		this.text = text;
	}

	/**
	 * @param text a CQL2 text filter
	 * @return its syntax tree
	 * @throws IllegalArgumentException if the text is no valid CQL2
	 */
	public static Predicate parse(String text) {
		Cql2TextParser parser = new Cql2TextParser(text);
		parser.advance();
		Predicate predicate = parser.orExpression();
		if (parser.token.kind != Kind.END) {
			throw parser.error("unexpected '" + parser.token.text + "'");
		}
		return predicate;
	}

	// ---------------------------------------------------------------- grammar

	private Predicate orExpression() {
		List<Predicate> operands = new ArrayList<>();
		operands.add(andExpression());
		while (keyword("OR")) {
			advance();
			operands.add(andExpression());
		}
		return operands.size() == 1 ? operands.get(0) : new Or(operands);
	}

	private Predicate andExpression() {
		List<Predicate> operands = new ArrayList<>();
		operands.add(notExpression());
		while (keyword("AND")) {
			advance();
			operands.add(notExpression());
		}
		return operands.size() == 1 ? operands.get(0) : new And(operands);
	}

	private Predicate notExpression() {
		if (keyword("NOT")) {
			advance();
			return new Not(notExpression());
		}
		return primary();
	}

	private Predicate primary() {
		if (token.kind == Kind.SYMBOL && token.text.equals("(")) {
			advance();
			Predicate inner = orExpression();
			expectSymbol(")");
			return inner;
		}
		if (token.kind == Kind.WORD) {
			String upper = token.upper();
			if ((upper.equals("TRUE") || upper.equals("FALSE")) && !isComparisonAhead()) {
				advance();
				return new BooleanValue(upper.equals("TRUE"));
			}
			var relation = SpatialRelation.ofCql2Name(upper);
			if (relation.isPresent() && peekSymbol("(")) {
				advance();
				expectSymbol("(");
				Operand left = geometryOperand();
				expectSymbol(",");
				Operand right = geometryOperand();
				expectSymbol(")");
				return new Spatial(relation.get(), left, right);
			}
		}
		return predicate(scalar());
	}

	private Predicate predicate(Operand left) {
		if (token.kind == Kind.SYMBOL && isComparison(token.text)) {
			Operator operator = Operator.ofSymbol(token.text);
			advance();
			return new Comparison(operator, left, scalar());
		}
		boolean negated = false;
		if (keyword("NOT")) {
			negated = true;
			advance();
		}
		Predicate predicate;
		if (keyword("LIKE")) {
			advance();
			Operand pattern = scalar();
			if (!(pattern instanceof Literal literal) || !(literal.value() instanceof String s)) {
				throw error("LIKE needs a string pattern");
			}
			predicate = new Like(left, s);
		} else if (keyword("BETWEEN")) {
			advance();
			Literal lower = literal();
			if (!keyword("AND")) {
				throw error("BETWEEN needs AND");
			}
			advance();
			predicate = new Between(left, lower, literal());
		} else if (keyword("IN")) {
			advance();
			expectSymbol("(");
			List<Literal> values = new ArrayList<>();
			values.add(literal());
			while (token.kind == Kind.SYMBOL && token.text.equals(",")) {
				advance();
				values.add(literal());
			}
			expectSymbol(")");
			predicate = new In(left, values);
		} else if (!negated && keyword("IS")) {
			advance();
			boolean not = false;
			if (keyword("NOT")) {
				not = true;
				advance();
			}
			if (!keyword("NULL")) {
				throw error("IS needs NULL");
			}
			advance();
			return not ? new Not(new IsNull(left)) : new IsNull(left);
		} else {
			throw error("expected a comparison, LIKE, BETWEEN, IN or IS NULL");
		}
		return negated ? new Not(predicate) : predicate;
	}

	private Operand scalar() {
		switch (token.kind) {
		case STRING -> {
			String value = token.text;
			advance();
			return new Literal(value);
		}
		case NUMBER -> {
			Object value = number(token.text);
			advance();
			return new Literal(value);
		}
		case QUOTED -> {
			String name = token.text;
			advance();
			return new Property(name);
		}
		case WORD -> {
			String upper = token.upper();
			if (upper.equals("TRUE") || upper.equals("FALSE")) {
				advance();
				return new Literal(Boolean.valueOf(upper.equals("TRUE")));
			}
			if ((upper.equals("DATE") || upper.equals("TIMESTAMP")) && peekSymbol("(")) {
				advance();
				expectSymbol("(");
				if (token.kind != Kind.STRING) {
					throw error(upper + " needs a string");
				}
				String value = token.text;
				advance();
				expectSymbol(")");
				return new Literal(upper.equals("DATE") ? date(value) : timestamp(value));
			}
			String name = token.text;
			advance();
			return new Property(name);
		}
		default -> throw error("expected a property or a literal");
		}
	}

	private Literal literal() {
		Operand operand = scalar();
		if (operand instanceof Literal literal) {
			return literal;
		}
		throw error("expected a literal");
	}

	private Operand geometryOperand() {
		if (token.kind == Kind.WORD) {
			String upper = token.upper();
			if (upper.equals("BBOX") && peekSymbol("(")) {
				advance();
				expectSymbol("(");
				List<Double> values = new ArrayList<>();
				values.add(numberValue());
				while (token.kind == Kind.SYMBOL && token.text.equals(",")) {
					advance();
					values.add(numberValue());
				}
				expectSymbol(")");
				return new GeometryLiteral(bbox(values));
			}
			if (WKT.contains(upper)) {
				return new GeometryLiteral(wkt());
			}
		}
		Operand operand = scalar();
		if (operand instanceof Property) {
			return operand;
		}
		throw error("expected a geometry property, a WKT geometry or BBOX");
	}

	private Geometry wkt() {
		int start = token.start;
		int open = text.indexOf('(', token.end);
		if (open < 0) {
			throw error("WKT geometry without coordinates");
		}
		int depth = 0;
		int end = open;
		for (; end < text.length(); end++) {
			char c = text.charAt(end);
			if (c == '(') {
				depth++;
			} else if (c == ')' && --depth == 0) {
				break;
			}
		}
		if (depth != 0) {
			throw error("unbalanced parentheses in WKT geometry");
		}
		String wkt = text.substring(start, end + 1);
		try {
			Geometry geometry = new WKTReader(JtsGeometries.factory()).read(wkt);
			pos = end + 1;
			advance();
			return geometry;
		} catch (ParseException e) {
			throw new IllegalArgumentException("Invalid WKT geometry " + wkt + ": " + e.getMessage(), e);
		}
	}

	private static Geometry bbox(List<Double> values) {
		if (values.size() != 4 && values.size() != 6) {
			throw new IllegalArgumentException("BBOX needs 4 or 6 numbers");
		}
		double minX = values.get(0);
		double minY = values.get(1);
		double maxX = values.size() == 4 ? values.get(2) : values.get(3);
		double maxY = values.size() == 4 ? values.get(3) : values.get(4);
		return JtsGeometries.factory().toGeometry(new Envelope(minX, maxX, minY, maxY));
	}

	private double numberValue() {
		if (token.kind != Kind.NUMBER) {
			throw error("expected a number");
		}
		double value = Double.parseDouble(token.text);
		advance();
		return value;
	}

	static Object number(String text) {
		BigDecimal decimal = new BigDecimal(text);
		if (decimal.scale() <= 0 && !text.contains("e") && !text.contains("E")) {
			try {
				return decimal.longValueExact();
			} catch (ArithmeticException e) {
				return decimal.doubleValue();
			}
		}
		return decimal.doubleValue();
	}

	static LocalDate date(String value) {
		try {
			return LocalDate.parse(value);
		} catch (DateTimeParseException e) {
			throw new IllegalArgumentException("Invalid DATE " + value, e);
		}
	}

	static Instant timestamp(String value) {
		try {
			return OffsetDateTime.parse(value).toInstant();
		} catch (DateTimeParseException e) {
			throw new IllegalArgumentException("Invalid TIMESTAMP " + value, e);
		}
	}

	// ---------------------------------------------------------------- scanner

	private enum Kind {
		WORD, QUOTED, STRING, NUMBER, SYMBOL, END
	}

	private record Token(Kind kind, String text, int start, int end) {
		String upper() {
			return text.toUpperCase(Locale.ROOT);
		}
	}

	private void advance() {
		token = scan();
	}

	private Token scan() {
		while (pos < text.length() && Character.isWhitespace(text.charAt(pos))) {
			pos++;
		}
		int start = pos;
		if (pos >= text.length()) {
			return new Token(Kind.END, "", start, start);
		}
		char c = text.charAt(pos);
		if (c == '\'') {
			StringBuilder value = new StringBuilder();
			pos++;
			while (true) {
				if (pos >= text.length()) {
					throw new IllegalArgumentException("Unterminated string starting at " + start);
				}
				char d = text.charAt(pos++);
				if (d == '\'') {
					if (pos < text.length() && text.charAt(pos) == '\'') {
						value.append('\'');
						pos++;
					} else {
						break;
					}
				} else {
					value.append(d);
				}
			}
			return new Token(Kind.STRING, value.toString(), start, pos);
		}
		if (c == '"') {
			int close = text.indexOf('"', pos + 1);
			if (close < 0) {
				throw new IllegalArgumentException("Unterminated quoted identifier starting at " + start);
			}
			pos = close + 1;
			return new Token(Kind.QUOTED, text.substring(start + 1, close), start, pos);
		}
		if (Character.isDigit(c) || ((c == '-' || c == '+' || c == '.') && pos + 1 < text.length()
				&& (Character.isDigit(text.charAt(pos + 1)) || text.charAt(pos + 1) == '.'))) {
			pos++;
			while (pos < text.length()) {
				char d = text.charAt(pos);
				if (Character.isDigit(d) || d == '.') {
					pos++;
				} else if ((d == 'e' || d == 'E') && pos + 1 < text.length()) {
					pos++;
					if (text.charAt(pos) == '-' || text.charAt(pos) == '+') {
						pos++;
					}
				} else {
					break;
				}
			}
			return new Token(Kind.NUMBER, text.substring(start, pos), start, pos);
		}
		if (Character.isLetter(c) || c == '_') {
			while (pos < text.length()) {
				char d = text.charAt(pos);
				if (Character.isLetterOrDigit(d) || d == '_' || d == '.' || d == ':') {
					pos++;
				} else {
					break;
				}
			}
			return new Token(Kind.WORD, text.substring(start, pos), start, pos);
		}
		if (c == '<' || c == '>') {
			pos++;
			if (pos < text.length() && (text.charAt(pos) == '=' || (c == '<' && text.charAt(pos) == '>'))) {
				pos++;
			}
			return new Token(Kind.SYMBOL, text.substring(start, pos), start, pos);
		}
		if ("=(),".indexOf(c) >= 0) {
			pos++;
			return new Token(Kind.SYMBOL, String.valueOf(c), start, pos);
		}
		throw new IllegalArgumentException("Unexpected character '" + c + "' at " + start);
	}

	private boolean keyword(String word) {
		return token.kind == Kind.WORD && token.upper().equals(word);
	}

	private boolean peekSymbol(String symbol) {
		int saved = pos;
		Token current = token;
		Token next = scan();
		pos = saved;
		token = current;
		return next.kind == Kind.SYMBOL && next.text.equals(symbol);
	}

	private boolean isComparisonAhead() {
		int saved = pos;
		Token current = token;
		Token next = scan();
		pos = saved;
		token = current;
		return next.kind == Kind.SYMBOL && isComparison(next.text);
	}

	private static boolean isComparison(String symbol) {
		return switch (symbol) {
		case "=", "<>", "<", "<=", ">", ">=" -> true;
		default -> false;
		};
	}

	private void expectSymbol(String symbol) {
		if (token.kind != Kind.SYMBOL || !token.text.equals(symbol)) {
			throw error("expected '" + symbol + "'");
		}
		advance();
	}

	private IllegalArgumentException error(String message) {
		return new IllegalArgumentException(message + " at position " + token.start + " of: " + text);
	}
}
