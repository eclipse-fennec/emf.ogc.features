/*
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

// The CQL2 text encoding (OGC 21-065r2, Annex B BNF): basic CQL2, advanced comparison
// operators and spatial functions with WKT and BBOX literals. Keywords are case insensitive.
grammar CQL2;

options { caseInsensitive = true; }

filter : booleanExpression EOF ;

booleanExpression : booleanTerm (OR booleanTerm)* ;
booleanTerm       : booleanFactor (AND booleanFactor)* ;
booleanFactor     : NOT? booleanPrimary ;
booleanPrimary
    : LPAREN booleanExpression RPAREN   # nested
    | predicate                         # predicatePrimary
    | booleanLiteral                    # booleanPrimaryLiteral
    ;

predicate
    : scalarExpression comparisonOperator scalarExpression                          # binaryComparison
    | scalarExpression NOT? LIKE scalarExpression                                   # likePredicate
    | scalarExpression NOT? BETWEEN scalarExpression AND scalarExpression           # betweenPredicate
    | scalarExpression NOT? IN LPAREN scalarExpression (COMMA scalarExpression)* RPAREN  # inPredicate
    | scalarExpression IS NOT? NULL                                                 # isNullPredicate
    | spatialFunction LPAREN geomExpression COMMA geomExpression RPAREN             # spatialPredicate
    ;

comparisonOperator : EQ | NE | LT | LE | GT | GE ;

spatialFunction
    : S_INTERSECTS | S_EQUALS | S_DISJOINT | S_TOUCHES | S_WITHIN | S_OVERLAPS | S_CROSSES | S_CONTAINS ;

scalarExpression
    : STRING                                   # stringLiteral
    | NUMBER                                   # numberLiteral
    | booleanLiteral                           # booleanScalar
    | DATE LPAREN STRING RPAREN                # dateLiteral
    | TIMESTAMP LPAREN STRING RPAREN           # timestampLiteral
    | propertyName                             # propertyRef
    ;

booleanLiteral : TRUE | FALSE ;

propertyName : IDENTIFIER | QUOTED_IDENTIFIER | Z ;

geomExpression
    : spatialInstance      # geometry
    | bbox                 # bboxGeometry
    | propertyName         # geometryProperty
    ;

bbox : BBOX LPAREN NUMBER COMMA NUMBER COMMA NUMBER COMMA NUMBER (COMMA NUMBER COMMA NUMBER)? RPAREN ;

spatialInstance
    : POINT Z? LPAREN position RPAREN                                              # point
    | LINESTRING Z? positionList                                                   # lineString
    | POLYGON Z? polygonText                                                       # polygon
    | MULTIPOINT Z? LPAREN pointMember (COMMA pointMember)* RPAREN                 # multiPoint
    | MULTILINESTRING Z? LPAREN positionList (COMMA positionList)* RPAREN          # multiLineString
    | MULTIPOLYGON Z? LPAREN polygonText (COMMA polygonText)* RPAREN               # multiPolygon
    | GEOMETRYCOLLECTION Z? LPAREN spatialInstance (COMMA spatialInstance)* RPAREN # geometryCollection
    ;

pointMember  : position | LPAREN position RPAREN ;
polygonText  : LPAREN positionList (COMMA positionList)* RPAREN ;
positionList : LPAREN position (COMMA position)* RPAREN ;
position     : NUMBER NUMBER NUMBER? ;

// ------------------------------------------------------------------------ lexer

AND : 'AND' ;
OR : 'OR' ;
NOT : 'NOT' ;
LIKE : 'LIKE' ;
BETWEEN : 'BETWEEN' ;
IN : 'IN' ;
IS : 'IS' ;
NULL : 'NULL' ;
TRUE : 'TRUE' ;
FALSE : 'FALSE' ;
DATE : 'DATE' ;
TIMESTAMP : 'TIMESTAMP' ;
BBOX : 'BBOX' ;
POINT : 'POINT' ;
LINESTRING : 'LINESTRING' ;
POLYGON : 'POLYGON' ;
MULTIPOINT : 'MULTIPOINT' ;
MULTILINESTRING : 'MULTILINESTRING' ;
MULTIPOLYGON : 'MULTIPOLYGON' ;
GEOMETRYCOLLECTION : 'GEOMETRYCOLLECTION' ;
Z : 'Z' ;
S_INTERSECTS : 'S_INTERSECTS' ;
S_EQUALS : 'S_EQUALS' ;
S_DISJOINT : 'S_DISJOINT' ;
S_TOUCHES : 'S_TOUCHES' ;
S_WITHIN : 'S_WITHIN' ;
S_OVERLAPS : 'S_OVERLAPS' ;
S_CROSSES : 'S_CROSSES' ;
S_CONTAINS : 'S_CONTAINS' ;

EQ : '=' ;
NE : '<>' ;
LE : '<=' ;
GE : '>=' ;
LT : '<' ;
GT : '>' ;
LPAREN : '(' ;
RPAREN : ')' ;
COMMA : ',' ;

NUMBER : [+-]? ( DIGIT+ ('.' DIGIT*)? | '.' DIGIT+ ) ( 'E' [+-]? DIGIT+ )? ;
STRING : '\'' ( ~'\'' | '\'\'' )* '\'' ;
QUOTED_IDENTIFIER : '"' ~'"'+ '"' ;
IDENTIFIER : [A-Z_] [A-Z0-9_.:]* ;

WS : [ \t\r\n]+ -> skip ;

fragment DIGIT : [0-9] ;
