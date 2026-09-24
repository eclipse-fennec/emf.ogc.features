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

import java.math.BigDecimal;
import java.util.List;

import org.antlr.v4.runtime.tree.TerminalNode;
import net.opengis.cql2.And;
import net.opengis.cql2.ArrayLiteral;
import net.opengis.cql2.BboxLiteral;
import net.opengis.cql2.BooleanLiteral;
import net.opengis.cql2.Cql2Factory;
import net.opengis.cql2.DateLiteral;
import net.opengis.cql2.Expression;
import net.opengis.cql2.GeometryLiteral;
import net.opengis.cql2.Not;
import net.opengis.cql2.NumberLiteral;
import net.opengis.cql2.Operation;
import net.opengis.cql2.Or;
import net.opengis.cql2.Predicate;
import net.opengis.cql2.PropertyRef;
import net.opengis.cql2.StringLiteral;
import net.opengis.cql2.TimestampLiteral;
import org.eclipse.fennec.codec.cql2.antlr.CQL2BaseVisitor;
import org.eclipse.fennec.codec.cql2.antlr.CQL2Parser;
import org.geojson.Coordinates;
import org.geojson.GeoJsonFactory;
import org.geojson.Geometry;
import org.geojson.GeometryCollection;
import org.geojson.Hole;
import org.geojson.LineString;
import org.geojson.MultiLineString;
import org.geojson.MultiPoint;
import org.geojson.MultiPolygon;
import org.geojson.Point;
import org.geojson.Polygon;
import org.geojson.Ring;
import org.geojson.SimpleLineString;
import org.geojson.SimplePolygon;

/**
 * Builds the CQL2 model from the parse tree of the text encoding.
 */
public final class ModelBuilder extends CQL2BaseVisitor<Object> {

	private static final Cql2Factory F = Cql2Factory.eINSTANCE;
	private static final GeoJsonFactory G = GeoJsonFactory.eINSTANCE;

	@Override
	public Predicate visitFilter(CQL2Parser.FilterContext ctx) {
		return (Predicate) visit(ctx.booleanExpression());
	}

	@Override
	public Predicate visitBooleanExpression(CQL2Parser.BooleanExpressionContext ctx) {
		if (ctx.booleanTerm().size() == 1) {
			return (Predicate) visit(ctx.booleanTerm(0));
		}
		Or or = F.createOr();
		ctx.booleanTerm().forEach(t -> or.getArgs().add((Predicate) visit(t)));
		return or;
	}

	@Override
	public Predicate visitBooleanTerm(CQL2Parser.BooleanTermContext ctx) {
		if (ctx.booleanFactor().size() == 1) {
			return (Predicate) visit(ctx.booleanFactor(0));
		}
		And and = F.createAnd();
		ctx.booleanFactor().forEach(f -> and.getArgs().add((Predicate) visit(f)));
		return and;
	}

	@Override
	public Predicate visitBooleanFactor(CQL2Parser.BooleanFactorContext ctx) {
		Predicate primary = (Predicate) visit(ctx.booleanPrimary());
		return ctx.NOT() == null ? primary : not(primary);
	}

	@Override
	public Object visitNested(CQL2Parser.NestedContext ctx) {
		return visit(ctx.booleanExpression());
	}

	@Override
	public Object visitPredicatePrimary(CQL2Parser.PredicatePrimaryContext ctx) {
		return visit(ctx.predicate());
	}

	@Override
	public Object visitBooleanPrimaryLiteral(CQL2Parser.BooleanPrimaryLiteralContext ctx) {
		return visit(ctx.booleanLiteral());
	}

	@Override
	public Predicate visitBinaryComparison(CQL2Parser.BinaryComparisonContext ctx) {
		CQL2Parser.ComparisonOperatorContext op = ctx.comparisonOperator();
		Operation comparison;
		if (op.EQ() != null) {
			comparison = F.createEqual();
		} else if (op.NE() != null) {
			comparison = F.createNotEqual();
		} else if (op.LT() != null) {
			comparison = F.createLessThan();
		} else if (op.LE() != null) {
			comparison = F.createLessOrEqual();
		} else if (op.GT() != null) {
			comparison = F.createGreaterThan();
		} else {
			comparison = F.createGreaterOrEqual();
		}
		return with(comparison, expression(ctx.scalarExpression(0)), expression(ctx.scalarExpression(1)));
	}

	@Override
	public Predicate visitLikePredicate(CQL2Parser.LikePredicateContext ctx) {
		Predicate like = with(F.createLike(), expression(ctx.scalarExpression(0)), expression(ctx.scalarExpression(1)));
		return ctx.NOT() == null ? like : not(like);
	}

	@Override
	public Predicate visitBetweenPredicate(CQL2Parser.BetweenPredicateContext ctx) {
		Predicate between = with(F.createBetween(), expression(ctx.scalarExpression(0)), expression(ctx.scalarExpression(1)),
				expression(ctx.scalarExpression(2)));
		return ctx.NOT() == null ? between : not(between);
	}

	@Override
	public Predicate visitInPredicate(CQL2Parser.InPredicateContext ctx) {
		ArrayLiteral list = F.createArrayLiteral();
		List<CQL2Parser.ScalarExpressionContext> values = ctx.scalarExpression();
		for (int i = 1; i < values.size(); i++) {
			list.getElements().add(expression(values.get(i)));
		}
		Predicate in = with(F.createIn(), expression(values.get(0)), list);
		return ctx.NOT() == null ? in : not(in);
	}

	@Override
	public Predicate visitIsNullPredicate(CQL2Parser.IsNullPredicateContext ctx) {
		Predicate isNull = with(F.createIsNull(), expression(ctx.scalarExpression()));
		return ctx.NOT() == null ? isNull : not(isNull);
	}

	@Override
	public Predicate visitSpatialPredicate(CQL2Parser.SpatialPredicateContext ctx) {
		CQL2Parser.SpatialFunctionContext f = ctx.spatialFunction();
		Operation spatial;
		if (f.S_INTERSECTS() != null) {
			spatial = F.createSIntersects();
		} else if (f.S_EQUALS() != null) {
			spatial = F.createSEquals();
		} else if (f.S_DISJOINT() != null) {
			spatial = F.createSDisjoint();
		} else if (f.S_TOUCHES() != null) {
			spatial = F.createSTouches();
		} else if (f.S_WITHIN() != null) {
			spatial = F.createSWithin();
		} else if (f.S_OVERLAPS() != null) {
			spatial = F.createSOverlaps();
		} else if (f.S_CROSSES() != null) {
			spatial = F.createSCrosses();
		} else {
			spatial = F.createSContains();
		}
		return with(spatial, (Expression) visit(ctx.geomExpression(0)), (Expression) visit(ctx.geomExpression(1)));
	}

	@Override
	public Object visitStringLiteral(CQL2Parser.StringLiteralContext ctx) {
		StringLiteral literal = F.createStringLiteral();
		literal.setValue(unquote(ctx.STRING().getText()));
		return literal;
	}

	@Override
	public Object visitNumberLiteral(CQL2Parser.NumberLiteralContext ctx) {
		NumberLiteral literal = F.createNumberLiteral();
		literal.setValue(new BigDecimal(ctx.NUMBER().getText()));
		return literal;
	}

	@Override
	public Object visitBooleanScalar(CQL2Parser.BooleanScalarContext ctx) {
		return visit(ctx.booleanLiteral());
	}

	@Override
	public Object visitBooleanLiteral(CQL2Parser.BooleanLiteralContext ctx) {
		BooleanLiteral literal = F.createBooleanLiteral();
		literal.setValue(ctx.TRUE() != null);
		return literal;
	}

	@Override
	public Object visitDateLiteral(CQL2Parser.DateLiteralContext ctx) {
		DateLiteral literal = F.createDateLiteral();
		literal.setDate(unquote(ctx.STRING().getText()));
		return literal;
	}

	@Override
	public Object visitTimestampLiteral(CQL2Parser.TimestampLiteralContext ctx) {
		TimestampLiteral literal = F.createTimestampLiteral();
		literal.setTimestamp(unquote(ctx.STRING().getText()));
		return literal;
	}

	@Override
	public Object visitPropertyRef(CQL2Parser.PropertyRefContext ctx) {
		return visit(ctx.propertyName());
	}

	@Override
	public Object visitGeometryProperty(CQL2Parser.GeometryPropertyContext ctx) {
		return visit(ctx.propertyName());
	}

	@Override
	public Object visitPropertyName(CQL2Parser.PropertyNameContext ctx) {
		PropertyRef ref = F.createPropertyRef();
		String text = ctx.getText();
		ref.setProperty(ctx.QUOTED_IDENTIFIER() != null ? text.substring(1, text.length() - 1) : text);
		return ref;
	}

	@Override
	public Object visitBboxGeometry(CQL2Parser.BboxGeometryContext ctx) {
		BboxLiteral bbox = F.createBboxLiteral();
		ctx.bbox().NUMBER().forEach(n -> bbox.getBbox().add(Double.parseDouble(n.getText())));
		return bbox;
	}

	@Override
	public Object visitGeometry(CQL2Parser.GeometryContext ctx) {
		GeometryLiteral literal = F.createGeometryLiteral();
		literal.setGeometry(geometry(ctx.spatialInstance()));
		return literal;
	}

	// ------------------------------------------------------------------- WKT

	private Geometry geometry(CQL2Parser.SpatialInstanceContext ctx) {
		return switch (ctx) {
		case CQL2Parser.PointContext p -> {
			Point point = G.createPoint();
			point.setCoordinates(position(p.position()));
			yield point;
		}
		case CQL2Parser.LineStringContext l -> {
			LineString line = G.createLineString();
			positions(l.positionList(), line.getCoordinates());
			yield line;
		}
		case CQL2Parser.PolygonContext p -> {
			Polygon polygon = G.createPolygon();
			polygon(p.polygonText(), polygon);
			yield polygon;
		}
		case CQL2Parser.MultiPointContext mp -> {
			MultiPoint multi = G.createMultiPoint();
			mp.pointMember().forEach(m -> multi.getCoordinates().add(position(m.position())));
			yield multi;
		}
		case CQL2Parser.MultiLineStringContext ml -> {
			MultiLineString multi = G.createMultiLineString();
			for (CQL2Parser.PositionListContext list : ml.positionList()) {
				SimpleLineString line = G.createSimpleLineString();
				positions(list, line.getCoordinates());
				multi.getLinesStrings().add(line);
			}
			yield multi;
		}
		case CQL2Parser.MultiPolygonContext mp -> {
			MultiPolygon multi = G.createMultiPolygon();
			for (CQL2Parser.PolygonTextContext text : mp.polygonText()) {
				SimplePolygon polygon = G.createSimplePolygon();
				polygon(text, polygon);
				multi.getPolygons().add(polygon);
			}
			yield multi;
		}
		case CQL2Parser.GeometryCollectionContext gc -> {
			GeometryCollection collection = G.createGeometryCollection();
			gc.spatialInstance().forEach(member -> collection.getGeometries().add(geometry(member)));
			yield collection;
		}
		default -> throw new IllegalArgumentException("Unsupported geometry " + ctx.getText());
		};
	}

	private void polygon(CQL2Parser.PolygonTextContext text, SimplePolygon polygon) {
		List<CQL2Parser.PositionListContext> rings = text.positionList();
		Ring exterior = G.createRing();
		positions(rings.get(0), exterior.getCoordinates());
		polygon.setExteriorRing(exterior);
		for (int i = 1; i < rings.size(); i++) {
			Hole hole = G.createHole();
			positions(rings.get(i), hole.getCoordinates());
			polygon.getInteriorHoles().add(hole);
		}
	}

	private static void positions(CQL2Parser.PositionListContext list, List<Coordinates> target) {
		list.position().forEach(p -> target.add(position(p)));
	}

	private static Coordinates position(CQL2Parser.PositionContext ctx) {
		List<TerminalNode> numbers = ctx.NUMBER();
		Coordinates c = G.createCoordinates();
		c.setLongitude(Double.parseDouble(numbers.get(0).getText()));
		c.setLatitude(Double.parseDouble(numbers.get(1).getText()));
		if (numbers.size() > 2) {
			c.setElevation(Double.parseDouble(numbers.get(2).getText()));
		}
		return c;
	}

	// ------------------------------------------------------------------- helpers

	private Expression expression(CQL2Parser.ScalarExpressionContext ctx) {
		return (Expression) visit(ctx);
	}

	private static Predicate with(Operation operation, Expression... args) {
		operation.getArgs().addAll(List.of(args));
		return operation;
	}

	private static Not not(Predicate predicate) {
		Not not = F.createNot();
		not.getArgs().add(predicate);
		return not;
	}

	private static String unquote(String quoted) {
		return quoted.substring(1, quoted.length() - 1).replace("''", "'");
	}
}
