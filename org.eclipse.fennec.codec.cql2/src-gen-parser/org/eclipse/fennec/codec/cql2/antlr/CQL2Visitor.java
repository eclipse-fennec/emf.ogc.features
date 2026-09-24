// Generated from /opt/git/emf.ogc.features/org.eclipse.fennec.codec.cql2/grammar/CQL2.g4 by ANTLR 4.13.2
package org.eclipse.fennec.codec.cql2.antlr;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link CQL2Parser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface CQL2Visitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link CQL2Parser#filter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFilter(CQL2Parser.FilterContext ctx);
	/**
	 * Visit a parse tree produced by {@link CQL2Parser#booleanExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleanExpression(CQL2Parser.BooleanExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CQL2Parser#booleanTerm}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleanTerm(CQL2Parser.BooleanTermContext ctx);
	/**
	 * Visit a parse tree produced by {@link CQL2Parser#booleanFactor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleanFactor(CQL2Parser.BooleanFactorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code nested}
	 * labeled alternative in {@link CQL2Parser#booleanPrimary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNested(CQL2Parser.NestedContext ctx);
	/**
	 * Visit a parse tree produced by the {@code predicatePrimary}
	 * labeled alternative in {@link CQL2Parser#booleanPrimary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPredicatePrimary(CQL2Parser.PredicatePrimaryContext ctx);
	/**
	 * Visit a parse tree produced by the {@code booleanPrimaryLiteral}
	 * labeled alternative in {@link CQL2Parser#booleanPrimary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleanPrimaryLiteral(CQL2Parser.BooleanPrimaryLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code binaryComparison}
	 * labeled alternative in {@link CQL2Parser#predicate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinaryComparison(CQL2Parser.BinaryComparisonContext ctx);
	/**
	 * Visit a parse tree produced by the {@code likePredicate}
	 * labeled alternative in {@link CQL2Parser#predicate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLikePredicate(CQL2Parser.LikePredicateContext ctx);
	/**
	 * Visit a parse tree produced by the {@code betweenPredicate}
	 * labeled alternative in {@link CQL2Parser#predicate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBetweenPredicate(CQL2Parser.BetweenPredicateContext ctx);
	/**
	 * Visit a parse tree produced by the {@code inPredicate}
	 * labeled alternative in {@link CQL2Parser#predicate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInPredicate(CQL2Parser.InPredicateContext ctx);
	/**
	 * Visit a parse tree produced by the {@code isNullPredicate}
	 * labeled alternative in {@link CQL2Parser#predicate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIsNullPredicate(CQL2Parser.IsNullPredicateContext ctx);
	/**
	 * Visit a parse tree produced by the {@code spatialPredicate}
	 * labeled alternative in {@link CQL2Parser#predicate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSpatialPredicate(CQL2Parser.SpatialPredicateContext ctx);
	/**
	 * Visit a parse tree produced by {@link CQL2Parser#comparisonOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparisonOperator(CQL2Parser.ComparisonOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link CQL2Parser#spatialFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSpatialFunction(CQL2Parser.SpatialFunctionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code stringLiteral}
	 * labeled alternative in {@link CQL2Parser#scalarExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringLiteral(CQL2Parser.StringLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code numberLiteral}
	 * labeled alternative in {@link CQL2Parser#scalarExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumberLiteral(CQL2Parser.NumberLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code booleanScalar}
	 * labeled alternative in {@link CQL2Parser#scalarExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleanScalar(CQL2Parser.BooleanScalarContext ctx);
	/**
	 * Visit a parse tree produced by the {@code dateLiteral}
	 * labeled alternative in {@link CQL2Parser#scalarExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDateLiteral(CQL2Parser.DateLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code timestampLiteral}
	 * labeled alternative in {@link CQL2Parser#scalarExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTimestampLiteral(CQL2Parser.TimestampLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code propertyRef}
	 * labeled alternative in {@link CQL2Parser#scalarExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPropertyRef(CQL2Parser.PropertyRefContext ctx);
	/**
	 * Visit a parse tree produced by {@link CQL2Parser#booleanLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleanLiteral(CQL2Parser.BooleanLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link CQL2Parser#propertyName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPropertyName(CQL2Parser.PropertyNameContext ctx);
	/**
	 * Visit a parse tree produced by the {@code geometry}
	 * labeled alternative in {@link CQL2Parser#geomExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGeometry(CQL2Parser.GeometryContext ctx);
	/**
	 * Visit a parse tree produced by the {@code bboxGeometry}
	 * labeled alternative in {@link CQL2Parser#geomExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBboxGeometry(CQL2Parser.BboxGeometryContext ctx);
	/**
	 * Visit a parse tree produced by the {@code geometryProperty}
	 * labeled alternative in {@link CQL2Parser#geomExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGeometryProperty(CQL2Parser.GeometryPropertyContext ctx);
	/**
	 * Visit a parse tree produced by {@link CQL2Parser#bbox}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBbox(CQL2Parser.BboxContext ctx);
	/**
	 * Visit a parse tree produced by the {@code point}
	 * labeled alternative in {@link CQL2Parser#spatialInstance}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPoint(CQL2Parser.PointContext ctx);
	/**
	 * Visit a parse tree produced by the {@code lineString}
	 * labeled alternative in {@link CQL2Parser#spatialInstance}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLineString(CQL2Parser.LineStringContext ctx);
	/**
	 * Visit a parse tree produced by the {@code polygon}
	 * labeled alternative in {@link CQL2Parser#spatialInstance}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPolygon(CQL2Parser.PolygonContext ctx);
	/**
	 * Visit a parse tree produced by the {@code multiPoint}
	 * labeled alternative in {@link CQL2Parser#spatialInstance}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiPoint(CQL2Parser.MultiPointContext ctx);
	/**
	 * Visit a parse tree produced by the {@code multiLineString}
	 * labeled alternative in {@link CQL2Parser#spatialInstance}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiLineString(CQL2Parser.MultiLineStringContext ctx);
	/**
	 * Visit a parse tree produced by the {@code multiPolygon}
	 * labeled alternative in {@link CQL2Parser#spatialInstance}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiPolygon(CQL2Parser.MultiPolygonContext ctx);
	/**
	 * Visit a parse tree produced by the {@code geometryCollection}
	 * labeled alternative in {@link CQL2Parser#spatialInstance}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGeometryCollection(CQL2Parser.GeometryCollectionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CQL2Parser#pointMember}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPointMember(CQL2Parser.PointMemberContext ctx);
	/**
	 * Visit a parse tree produced by {@link CQL2Parser#polygonText}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPolygonText(CQL2Parser.PolygonTextContext ctx);
	/**
	 * Visit a parse tree produced by {@link CQL2Parser#positionList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPositionList(CQL2Parser.PositionListContext ctx);
	/**
	 * Visit a parse tree produced by {@link CQL2Parser#position}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPosition(CQL2Parser.PositionContext ctx);
}