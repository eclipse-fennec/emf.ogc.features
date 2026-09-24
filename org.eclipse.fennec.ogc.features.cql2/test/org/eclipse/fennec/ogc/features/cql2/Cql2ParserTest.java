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

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

import java.time.Instant;
import java.time.LocalDate;
import java.util.List;

import org.eclipse.fennec.ogc.features.cql2.Cql2.And;
import org.eclipse.fennec.ogc.features.cql2.Cql2.Between;
import org.eclipse.fennec.ogc.features.cql2.Cql2.Comparison;
import org.eclipse.fennec.ogc.features.cql2.Cql2.GeometryLiteral;
import org.eclipse.fennec.ogc.features.cql2.Cql2.In;
import org.eclipse.fennec.ogc.features.cql2.Cql2.IsNull;
import org.eclipse.fennec.ogc.features.cql2.Cql2.Like;
import org.eclipse.fennec.ogc.features.cql2.Cql2.Literal;
import org.eclipse.fennec.ogc.features.cql2.Cql2.Not;
import org.eclipse.fennec.ogc.features.cql2.Cql2.Operator;
import org.eclipse.fennec.ogc.features.cql2.Cql2.Or;
import org.eclipse.fennec.ogc.features.cql2.Cql2.Property;
import org.eclipse.fennec.ogc.features.cql2.Cql2.Spatial;
import org.eclipse.fennec.ogc.features.geo.SpatialRelation;
import org.junit.jupiter.api.Test;

class Cql2ParserTest {

	@Test
	void comparisonAndLiterals() {
		assertThat(Cql2TextParser.parse("depth >= 1.5"))
				.isEqualTo(new Comparison(Operator.GE, new Property("depth"), new Literal(1.5)));
		assertThat(Cql2TextParser.parse("lanes <> -3"))
				.isEqualTo(new Comparison(Operator.NE, new Property("lanes"), new Literal(-3L)));
		assertThat(Cql2TextParser.parse("name = 'O''Brien'"))
				.isEqualTo(new Comparison(Operator.EQ, new Property("name"), new Literal("O'Brien")));
		assertThat(Cql2TextParser.parse("\"my prop\" = true"))
				.isEqualTo(new Comparison(Operator.EQ, new Property("my prop"), new Literal(Boolean.TRUE)));
		assertThat(Cql2TextParser.parse("d < TIMESTAMP('2026-01-01T00:00:00Z')"))
				.isEqualTo(new Comparison(Operator.LT, new Property("d"), new Literal(Instant.parse("2026-01-01T00:00:00Z"))));
		assertThat(Cql2TextParser.parse("d = date('2026-09-01')"))
				.isEqualTo(new Comparison(Operator.EQ, new Property("d"), new Literal(LocalDate.of(2026, 9, 1))));
	}

	@Test
	void precedenceOfNotAndOr() {
		assertThat(Cql2TextParser.parse("a = 1 OR b = 2 AND NOT c = 3")).isEqualTo(new Or(List.of(
				new Comparison(Operator.EQ, new Property("a"), new Literal(1L)),
				new And(List.of(new Comparison(Operator.EQ, new Property("b"), new Literal(2L)),
						new Not(new Comparison(Operator.EQ, new Property("c"), new Literal(3L))))))));
		assertThat(Cql2TextParser.parse("(a = 1 or b = 2) and c = 3")).isInstanceOf(And.class);
	}

	@Test
	void advancedComparison() {
		assertThat(Cql2TextParser.parse("name LIKE 'Frei%'")).isEqualTo(new Like(new Property("name"), "Frei%"));
		assertThat(Cql2TextParser.parse("name NOT LIKE 'x_'")).isEqualTo(new Not(new Like(new Property("name"), "x_")));
		assertThat(Cql2TextParser.parse("t BETWEEN 20 AND 30"))
				.isEqualTo(new Between(new Property("t"), new Literal(20L), new Literal(30L)));
		assertThat(Cql2TextParser.parse("k IN ('A', 'B')"))
				.isEqualTo(new In(new Property("k"), List.of(new Literal("A"), new Literal("B"))));
		assertThat(Cql2TextParser.parse("d IS NOT NULL")).isEqualTo(new Not(new IsNull(new Property("d"))));
	}

	@Test
	void spatialWithWktAndBbox() {
		Spatial s = (Spatial) Cql2TextParser.parse("S_INTERSECTS(geometry, POLYGON((0 0, 1 0, 1 1, 0 0)))");
		assertThat(s.relation()).isEqualTo(SpatialRelation.INTERSECTS);
		assertThat(s.left()).isEqualTo(new Property("geometry"));
		assertThat(((GeometryLiteral) s.right()).geometry().getGeometryType()).isEqualTo("Polygon");

		Spatial b = (Spatial) Cql2TextParser.parse("s_within(geometry, BBOX(1, 2, 3, 4)) and x = 1".split(" and ")[0]);
		assertThat(b.relation()).isEqualTo(SpatialRelation.WITHIN);
		assertThat(((GeometryLiteral) b.right()).geometry().getEnvelopeInternal().getMaxY()).isEqualTo(4);

		assertThat(Cql2TextParser.parse("S_INTERSECTS(geometry, POINT(11.6 50.9)) AND lanes = 0")).isInstanceOf(And.class);
	}

	@Test
	void jsonEncodingGivesTheSameTree() {
		assertThat(Cql2JsonParser.parse("""
				{"op":"and","args":[
				  {"op":">=","args":[{"property":"depth"},1.5]},
				  {"op":"like","args":[{"property":"name"},"Frei%"]},
				  {"op":"in","args":[{"property":"k"},["A","B"]]},
				  {"op":"<","args":[{"property":"d"},{"timestamp":"2026-01-01T00:00:00Z"}]}]}"""))
				.isEqualTo(Cql2TextParser.parse("depth >= 1.5 AND name LIKE 'Frei%' AND k IN ('A','B') "
						+ "AND d < TIMESTAMP('2026-01-01T00:00:00Z')"));
		Spatial s = (Spatial) Cql2JsonParser.parse("""
				{"op":"s_intersects","args":[{"property":"geometry"},{"type":"Point","coordinates":[11.6,50.9]}]}""");
		assertThat(((GeometryLiteral) s.right()).geometry().getGeometryType()).isEqualTo("Point");
		Spatial box = (Spatial) Cql2JsonParser.parse("""
				{"op":"s_intersects","args":[{"property":"geometry"},{"bbox":[1,2,3,4]}]}""");
		assertThat(((GeometryLiteral) box.right()).geometry().getArea()).isEqualTo(4.0);
	}

	@Test
	void syntaxErrors() {
		assertThatThrownBy(() -> Cql2TextParser.parse("a = ")).isInstanceOf(IllegalArgumentException.class);
		assertThatThrownBy(() -> Cql2TextParser.parse("a = 'open")).isInstanceOf(IllegalArgumentException.class);
		assertThatThrownBy(() -> Cql2TextParser.parse("a = 1 b")).isInstanceOf(IllegalArgumentException.class);
		assertThatThrownBy(() -> Cql2TextParser.parse("S_INTERSECTS(geometry, POLYGON((0 0, 1 0)")).isInstanceOf(IllegalArgumentException.class);
		assertThatThrownBy(() -> Cql2JsonParser.parse("{\"op\":\"foo\",\"args\":[]}")).isInstanceOf(IllegalArgumentException.class);
		assertThatThrownBy(() -> Cql2JsonParser.parse("{nope")).isInstanceOf(IllegalArgumentException.class);
	}
}
