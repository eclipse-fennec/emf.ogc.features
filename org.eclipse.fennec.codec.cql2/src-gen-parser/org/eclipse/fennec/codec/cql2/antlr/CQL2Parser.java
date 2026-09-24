// Generated from /opt/git/emf.ogc.features/org.eclipse.fennec.codec.cql2/grammar/CQL2.g4 by ANTLR 4.13.2
package org.eclipse.fennec.codec.cql2.antlr;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class CQL2Parser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		AND=1, OR=2, NOT=3, LIKE=4, BETWEEN=5, IN=6, IS=7, NULL=8, TRUE=9, FALSE=10, 
		DATE=11, TIMESTAMP=12, BBOX=13, POINT=14, LINESTRING=15, POLYGON=16, MULTIPOINT=17, 
		MULTILINESTRING=18, MULTIPOLYGON=19, GEOMETRYCOLLECTION=20, Z=21, S_INTERSECTS=22, 
		S_EQUALS=23, S_DISJOINT=24, S_TOUCHES=25, S_WITHIN=26, S_OVERLAPS=27, 
		S_CROSSES=28, S_CONTAINS=29, EQ=30, NE=31, LE=32, GE=33, LT=34, GT=35, 
		LPAREN=36, RPAREN=37, COMMA=38, NUMBER=39, STRING=40, QUOTED_IDENTIFIER=41, 
		IDENTIFIER=42, WS=43;
	public static final int
		RULE_filter = 0, RULE_booleanExpression = 1, RULE_booleanTerm = 2, RULE_booleanFactor = 3, 
		RULE_booleanPrimary = 4, RULE_predicate = 5, RULE_comparisonOperator = 6, 
		RULE_spatialFunction = 7, RULE_scalarExpression = 8, RULE_booleanLiteral = 9, 
		RULE_propertyName = 10, RULE_geomExpression = 11, RULE_bbox = 12, RULE_spatialInstance = 13, 
		RULE_pointMember = 14, RULE_polygonText = 15, RULE_positionList = 16, 
		RULE_position = 17;
	private static String[] makeRuleNames() {
		return new String[] {
			"filter", "booleanExpression", "booleanTerm", "booleanFactor", "booleanPrimary", 
			"predicate", "comparisonOperator", "spatialFunction", "scalarExpression", 
			"booleanLiteral", "propertyName", "geomExpression", "bbox", "spatialInstance", 
			"pointMember", "polygonText", "positionList", "position"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'AND'", "'OR'", "'NOT'", "'LIKE'", "'BETWEEN'", "'IN'", "'IS'", 
			"'NULL'", "'TRUE'", "'FALSE'", "'DATE'", "'TIMESTAMP'", "'BBOX'", "'POINT'", 
			"'LINESTRING'", "'POLYGON'", "'MULTIPOINT'", "'MULTILINESTRING'", "'MULTIPOLYGON'", 
			"'GEOMETRYCOLLECTION'", "'Z'", "'S_INTERSECTS'", "'S_EQUALS'", "'S_DISJOINT'", 
			"'S_TOUCHES'", "'S_WITHIN'", "'S_OVERLAPS'", "'S_CROSSES'", "'S_CONTAINS'", 
			"'='", "'<>'", "'<='", "'>='", "'<'", "'>'", "'('", "')'", "','"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "AND", "OR", "NOT", "LIKE", "BETWEEN", "IN", "IS", "NULL", "TRUE", 
			"FALSE", "DATE", "TIMESTAMP", "BBOX", "POINT", "LINESTRING", "POLYGON", 
			"MULTIPOINT", "MULTILINESTRING", "MULTIPOLYGON", "GEOMETRYCOLLECTION", 
			"Z", "S_INTERSECTS", "S_EQUALS", "S_DISJOINT", "S_TOUCHES", "S_WITHIN", 
			"S_OVERLAPS", "S_CROSSES", "S_CONTAINS", "EQ", "NE", "LE", "GE", "LT", 
			"GT", "LPAREN", "RPAREN", "COMMA", "NUMBER", "STRING", "QUOTED_IDENTIFIER", 
			"IDENTIFIER", "WS"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "CQL2.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public CQL2Parser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FilterContext extends ParserRuleContext {
		public BooleanExpressionContext booleanExpression() {
			return getRuleContext(BooleanExpressionContext.class,0);
		}
		public TerminalNode EOF() { return getToken(CQL2Parser.EOF, 0); }
		public FilterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_filter; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CQL2Visitor ) return ((CQL2Visitor<? extends T>)visitor).visitFilter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FilterContext filter() throws RecognitionException {
		FilterContext _localctx = new FilterContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_filter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(36);
			booleanExpression();
			setState(37);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class BooleanExpressionContext extends ParserRuleContext {
		public List<BooleanTermContext> booleanTerm() {
			return getRuleContexts(BooleanTermContext.class);
		}
		public BooleanTermContext booleanTerm(int i) {
			return getRuleContext(BooleanTermContext.class,i);
		}
		public List<TerminalNode> OR() { return getTokens(CQL2Parser.OR); }
		public TerminalNode OR(int i) {
			return getToken(CQL2Parser.OR, i);
		}
		public BooleanExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_booleanExpression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CQL2Visitor ) return ((CQL2Visitor<? extends T>)visitor).visitBooleanExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BooleanExpressionContext booleanExpression() throws RecognitionException {
		BooleanExpressionContext _localctx = new BooleanExpressionContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_booleanExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(39);
			booleanTerm();
			setState(44);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OR) {
				{
				{
				setState(40);
				match(OR);
				setState(41);
				booleanTerm();
				}
				}
				setState(46);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class BooleanTermContext extends ParserRuleContext {
		public List<BooleanFactorContext> booleanFactor() {
			return getRuleContexts(BooleanFactorContext.class);
		}
		public BooleanFactorContext booleanFactor(int i) {
			return getRuleContext(BooleanFactorContext.class,i);
		}
		public List<TerminalNode> AND() { return getTokens(CQL2Parser.AND); }
		public TerminalNode AND(int i) {
			return getToken(CQL2Parser.AND, i);
		}
		public BooleanTermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_booleanTerm; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CQL2Visitor ) return ((CQL2Visitor<? extends T>)visitor).visitBooleanTerm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BooleanTermContext booleanTerm() throws RecognitionException {
		BooleanTermContext _localctx = new BooleanTermContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_booleanTerm);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(47);
			booleanFactor();
			setState(52);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AND) {
				{
				{
				setState(48);
				match(AND);
				setState(49);
				booleanFactor();
				}
				}
				setState(54);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class BooleanFactorContext extends ParserRuleContext {
		public BooleanPrimaryContext booleanPrimary() {
			return getRuleContext(BooleanPrimaryContext.class,0);
		}
		public TerminalNode NOT() { return getToken(CQL2Parser.NOT, 0); }
		public BooleanFactorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_booleanFactor; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CQL2Visitor ) return ((CQL2Visitor<? extends T>)visitor).visitBooleanFactor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BooleanFactorContext booleanFactor() throws RecognitionException {
		BooleanFactorContext _localctx = new BooleanFactorContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_booleanFactor);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(56);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NOT) {
				{
				setState(55);
				match(NOT);
				}
			}

			setState(58);
			booleanPrimary();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class BooleanPrimaryContext extends ParserRuleContext {
		public BooleanPrimaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_booleanPrimary; }
	 
		public BooleanPrimaryContext() { }
		public void copyFrom(BooleanPrimaryContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BooleanPrimaryLiteralContext extends BooleanPrimaryContext {
		public BooleanLiteralContext booleanLiteral() {
			return getRuleContext(BooleanLiteralContext.class,0);
		}
		public BooleanPrimaryLiteralContext(BooleanPrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CQL2Visitor ) return ((CQL2Visitor<? extends T>)visitor).visitBooleanPrimaryLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NestedContext extends BooleanPrimaryContext {
		public TerminalNode LPAREN() { return getToken(CQL2Parser.LPAREN, 0); }
		public BooleanExpressionContext booleanExpression() {
			return getRuleContext(BooleanExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(CQL2Parser.RPAREN, 0); }
		public NestedContext(BooleanPrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CQL2Visitor ) return ((CQL2Visitor<? extends T>)visitor).visitNested(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PredicatePrimaryContext extends BooleanPrimaryContext {
		public PredicateContext predicate() {
			return getRuleContext(PredicateContext.class,0);
		}
		public PredicatePrimaryContext(BooleanPrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CQL2Visitor ) return ((CQL2Visitor<? extends T>)visitor).visitPredicatePrimary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BooleanPrimaryContext booleanPrimary() throws RecognitionException {
		BooleanPrimaryContext _localctx = new BooleanPrimaryContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_booleanPrimary);
		try {
			setState(66);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				_localctx = new NestedContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(60);
				match(LPAREN);
				setState(61);
				booleanExpression();
				setState(62);
				match(RPAREN);
				}
				break;
			case 2:
				_localctx = new PredicatePrimaryContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(64);
				predicate();
				}
				break;
			case 3:
				_localctx = new BooleanPrimaryLiteralContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(65);
				booleanLiteral();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PredicateContext extends ParserRuleContext {
		public PredicateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_predicate; }
	 
		public PredicateContext() { }
		public void copyFrom(PredicateContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BinaryComparisonContext extends PredicateContext {
		public List<ScalarExpressionContext> scalarExpression() {
			return getRuleContexts(ScalarExpressionContext.class);
		}
		public ScalarExpressionContext scalarExpression(int i) {
			return getRuleContext(ScalarExpressionContext.class,i);
		}
		public ComparisonOperatorContext comparisonOperator() {
			return getRuleContext(ComparisonOperatorContext.class,0);
		}
		public BinaryComparisonContext(PredicateContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CQL2Visitor ) return ((CQL2Visitor<? extends T>)visitor).visitBinaryComparison(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SpatialPredicateContext extends PredicateContext {
		public SpatialFunctionContext spatialFunction() {
			return getRuleContext(SpatialFunctionContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(CQL2Parser.LPAREN, 0); }
		public List<GeomExpressionContext> geomExpression() {
			return getRuleContexts(GeomExpressionContext.class);
		}
		public GeomExpressionContext geomExpression(int i) {
			return getRuleContext(GeomExpressionContext.class,i);
		}
		public TerminalNode COMMA() { return getToken(CQL2Parser.COMMA, 0); }
		public TerminalNode RPAREN() { return getToken(CQL2Parser.RPAREN, 0); }
		public SpatialPredicateContext(PredicateContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CQL2Visitor ) return ((CQL2Visitor<? extends T>)visitor).visitSpatialPredicate(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class InPredicateContext extends PredicateContext {
		public List<ScalarExpressionContext> scalarExpression() {
			return getRuleContexts(ScalarExpressionContext.class);
		}
		public ScalarExpressionContext scalarExpression(int i) {
			return getRuleContext(ScalarExpressionContext.class,i);
		}
		public TerminalNode IN() { return getToken(CQL2Parser.IN, 0); }
		public TerminalNode LPAREN() { return getToken(CQL2Parser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(CQL2Parser.RPAREN, 0); }
		public TerminalNode NOT() { return getToken(CQL2Parser.NOT, 0); }
		public List<TerminalNode> COMMA() { return getTokens(CQL2Parser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(CQL2Parser.COMMA, i);
		}
		public InPredicateContext(PredicateContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CQL2Visitor ) return ((CQL2Visitor<? extends T>)visitor).visitInPredicate(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BetweenPredicateContext extends PredicateContext {
		public List<ScalarExpressionContext> scalarExpression() {
			return getRuleContexts(ScalarExpressionContext.class);
		}
		public ScalarExpressionContext scalarExpression(int i) {
			return getRuleContext(ScalarExpressionContext.class,i);
		}
		public TerminalNode BETWEEN() { return getToken(CQL2Parser.BETWEEN, 0); }
		public TerminalNode AND() { return getToken(CQL2Parser.AND, 0); }
		public TerminalNode NOT() { return getToken(CQL2Parser.NOT, 0); }
		public BetweenPredicateContext(PredicateContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CQL2Visitor ) return ((CQL2Visitor<? extends T>)visitor).visitBetweenPredicate(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IsNullPredicateContext extends PredicateContext {
		public ScalarExpressionContext scalarExpression() {
			return getRuleContext(ScalarExpressionContext.class,0);
		}
		public TerminalNode IS() { return getToken(CQL2Parser.IS, 0); }
		public TerminalNode NULL() { return getToken(CQL2Parser.NULL, 0); }
		public TerminalNode NOT() { return getToken(CQL2Parser.NOT, 0); }
		public IsNullPredicateContext(PredicateContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CQL2Visitor ) return ((CQL2Visitor<? extends T>)visitor).visitIsNullPredicate(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LikePredicateContext extends PredicateContext {
		public List<ScalarExpressionContext> scalarExpression() {
			return getRuleContexts(ScalarExpressionContext.class);
		}
		public ScalarExpressionContext scalarExpression(int i) {
			return getRuleContext(ScalarExpressionContext.class,i);
		}
		public TerminalNode LIKE() { return getToken(CQL2Parser.LIKE, 0); }
		public TerminalNode NOT() { return getToken(CQL2Parser.NOT, 0); }
		public LikePredicateContext(PredicateContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CQL2Visitor ) return ((CQL2Visitor<? extends T>)visitor).visitLikePredicate(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PredicateContext predicate() throws RecognitionException {
		PredicateContext _localctx = new PredicateContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_predicate);
		int _la;
		try {
			setState(118);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				_localctx = new BinaryComparisonContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(68);
				scalarExpression();
				setState(69);
				comparisonOperator();
				setState(70);
				scalarExpression();
				}
				break;
			case 2:
				_localctx = new LikePredicateContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(72);
				scalarExpression();
				setState(74);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(73);
					match(NOT);
					}
				}

				setState(76);
				match(LIKE);
				setState(77);
				scalarExpression();
				}
				break;
			case 3:
				_localctx = new BetweenPredicateContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(79);
				scalarExpression();
				setState(81);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(80);
					match(NOT);
					}
				}

				setState(83);
				match(BETWEEN);
				setState(84);
				scalarExpression();
				setState(85);
				match(AND);
				setState(86);
				scalarExpression();
				}
				break;
			case 4:
				_localctx = new InPredicateContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(88);
				scalarExpression();
				setState(90);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(89);
					match(NOT);
					}
				}

				setState(92);
				match(IN);
				setState(93);
				match(LPAREN);
				setState(94);
				scalarExpression();
				setState(99);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(95);
					match(COMMA);
					setState(96);
					scalarExpression();
					}
					}
					setState(101);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(102);
				match(RPAREN);
				}
				break;
			case 5:
				_localctx = new IsNullPredicateContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(104);
				scalarExpression();
				setState(105);
				match(IS);
				setState(107);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(106);
					match(NOT);
					}
				}

				setState(109);
				match(NULL);
				}
				break;
			case 6:
				_localctx = new SpatialPredicateContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(111);
				spatialFunction();
				setState(112);
				match(LPAREN);
				setState(113);
				geomExpression();
				setState(114);
				match(COMMA);
				setState(115);
				geomExpression();
				setState(116);
				match(RPAREN);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ComparisonOperatorContext extends ParserRuleContext {
		public TerminalNode EQ() { return getToken(CQL2Parser.EQ, 0); }
		public TerminalNode NE() { return getToken(CQL2Parser.NE, 0); }
		public TerminalNode LT() { return getToken(CQL2Parser.LT, 0); }
		public TerminalNode LE() { return getToken(CQL2Parser.LE, 0); }
		public TerminalNode GT() { return getToken(CQL2Parser.GT, 0); }
		public TerminalNode GE() { return getToken(CQL2Parser.GE, 0); }
		public ComparisonOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparisonOperator; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CQL2Visitor ) return ((CQL2Visitor<? extends T>)visitor).visitComparisonOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComparisonOperatorContext comparisonOperator() throws RecognitionException {
		ComparisonOperatorContext _localctx = new ComparisonOperatorContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_comparisonOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(120);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 67645734912L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SpatialFunctionContext extends ParserRuleContext {
		public TerminalNode S_INTERSECTS() { return getToken(CQL2Parser.S_INTERSECTS, 0); }
		public TerminalNode S_EQUALS() { return getToken(CQL2Parser.S_EQUALS, 0); }
		public TerminalNode S_DISJOINT() { return getToken(CQL2Parser.S_DISJOINT, 0); }
		public TerminalNode S_TOUCHES() { return getToken(CQL2Parser.S_TOUCHES, 0); }
		public TerminalNode S_WITHIN() { return getToken(CQL2Parser.S_WITHIN, 0); }
		public TerminalNode S_OVERLAPS() { return getToken(CQL2Parser.S_OVERLAPS, 0); }
		public TerminalNode S_CROSSES() { return getToken(CQL2Parser.S_CROSSES, 0); }
		public TerminalNode S_CONTAINS() { return getToken(CQL2Parser.S_CONTAINS, 0); }
		public SpatialFunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_spatialFunction; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CQL2Visitor ) return ((CQL2Visitor<? extends T>)visitor).visitSpatialFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SpatialFunctionContext spatialFunction() throws RecognitionException {
		SpatialFunctionContext _localctx = new SpatialFunctionContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_spatialFunction);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(122);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 1069547520L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ScalarExpressionContext extends ParserRuleContext {
		public ScalarExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_scalarExpression; }
	 
		public ScalarExpressionContext() { }
		public void copyFrom(ScalarExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TimestampLiteralContext extends ScalarExpressionContext {
		public TerminalNode TIMESTAMP() { return getToken(CQL2Parser.TIMESTAMP, 0); }
		public TerminalNode LPAREN() { return getToken(CQL2Parser.LPAREN, 0); }
		public TerminalNode STRING() { return getToken(CQL2Parser.STRING, 0); }
		public TerminalNode RPAREN() { return getToken(CQL2Parser.RPAREN, 0); }
		public TimestampLiteralContext(ScalarExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CQL2Visitor ) return ((CQL2Visitor<? extends T>)visitor).visitTimestampLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BooleanScalarContext extends ScalarExpressionContext {
		public BooleanLiteralContext booleanLiteral() {
			return getRuleContext(BooleanLiteralContext.class,0);
		}
		public BooleanScalarContext(ScalarExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CQL2Visitor ) return ((CQL2Visitor<? extends T>)visitor).visitBooleanScalar(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StringLiteralContext extends ScalarExpressionContext {
		public TerminalNode STRING() { return getToken(CQL2Parser.STRING, 0); }
		public StringLiteralContext(ScalarExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CQL2Visitor ) return ((CQL2Visitor<? extends T>)visitor).visitStringLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PropertyRefContext extends ScalarExpressionContext {
		public PropertyNameContext propertyName() {
			return getRuleContext(PropertyNameContext.class,0);
		}
		public PropertyRefContext(ScalarExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CQL2Visitor ) return ((CQL2Visitor<? extends T>)visitor).visitPropertyRef(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DateLiteralContext extends ScalarExpressionContext {
		public TerminalNode DATE() { return getToken(CQL2Parser.DATE, 0); }
		public TerminalNode LPAREN() { return getToken(CQL2Parser.LPAREN, 0); }
		public TerminalNode STRING() { return getToken(CQL2Parser.STRING, 0); }
		public TerminalNode RPAREN() { return getToken(CQL2Parser.RPAREN, 0); }
		public DateLiteralContext(ScalarExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CQL2Visitor ) return ((CQL2Visitor<? extends T>)visitor).visitDateLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NumberLiteralContext extends ScalarExpressionContext {
		public TerminalNode NUMBER() { return getToken(CQL2Parser.NUMBER, 0); }
		public NumberLiteralContext(ScalarExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CQL2Visitor ) return ((CQL2Visitor<? extends T>)visitor).visitNumberLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ScalarExpressionContext scalarExpression() throws RecognitionException {
		ScalarExpressionContext _localctx = new ScalarExpressionContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_scalarExpression);
		try {
			setState(136);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRING:
				_localctx = new StringLiteralContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(124);
				match(STRING);
				}
				break;
			case NUMBER:
				_localctx = new NumberLiteralContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(125);
				match(NUMBER);
				}
				break;
			case TRUE:
			case FALSE:
				_localctx = new BooleanScalarContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(126);
				booleanLiteral();
				}
				break;
			case DATE:
				_localctx = new DateLiteralContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(127);
				match(DATE);
				setState(128);
				match(LPAREN);
				setState(129);
				match(STRING);
				setState(130);
				match(RPAREN);
				}
				break;
			case TIMESTAMP:
				_localctx = new TimestampLiteralContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(131);
				match(TIMESTAMP);
				setState(132);
				match(LPAREN);
				setState(133);
				match(STRING);
				setState(134);
				match(RPAREN);
				}
				break;
			case Z:
			case QUOTED_IDENTIFIER:
			case IDENTIFIER:
				_localctx = new PropertyRefContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(135);
				propertyName();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class BooleanLiteralContext extends ParserRuleContext {
		public TerminalNode TRUE() { return getToken(CQL2Parser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(CQL2Parser.FALSE, 0); }
		public BooleanLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_booleanLiteral; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CQL2Visitor ) return ((CQL2Visitor<? extends T>)visitor).visitBooleanLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BooleanLiteralContext booleanLiteral() throws RecognitionException {
		BooleanLiteralContext _localctx = new BooleanLiteralContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_booleanLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(138);
			_la = _input.LA(1);
			if ( !(_la==TRUE || _la==FALSE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PropertyNameContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(CQL2Parser.IDENTIFIER, 0); }
		public TerminalNode QUOTED_IDENTIFIER() { return getToken(CQL2Parser.QUOTED_IDENTIFIER, 0); }
		public TerminalNode Z() { return getToken(CQL2Parser.Z, 0); }
		public PropertyNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_propertyName; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CQL2Visitor ) return ((CQL2Visitor<? extends T>)visitor).visitPropertyName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PropertyNameContext propertyName() throws RecognitionException {
		PropertyNameContext _localctx = new PropertyNameContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_propertyName);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(140);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 6597071863808L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class GeomExpressionContext extends ParserRuleContext {
		public GeomExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_geomExpression; }
	 
		public GeomExpressionContext() { }
		public void copyFrom(GeomExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class GeometryPropertyContext extends GeomExpressionContext {
		public PropertyNameContext propertyName() {
			return getRuleContext(PropertyNameContext.class,0);
		}
		public GeometryPropertyContext(GeomExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CQL2Visitor ) return ((CQL2Visitor<? extends T>)visitor).visitGeometryProperty(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BboxGeometryContext extends GeomExpressionContext {
		public BboxContext bbox() {
			return getRuleContext(BboxContext.class,0);
		}
		public BboxGeometryContext(GeomExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CQL2Visitor ) return ((CQL2Visitor<? extends T>)visitor).visitBboxGeometry(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class GeometryContext extends GeomExpressionContext {
		public SpatialInstanceContext spatialInstance() {
			return getRuleContext(SpatialInstanceContext.class,0);
		}
		public GeometryContext(GeomExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CQL2Visitor ) return ((CQL2Visitor<? extends T>)visitor).visitGeometry(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GeomExpressionContext geomExpression() throws RecognitionException {
		GeomExpressionContext _localctx = new GeomExpressionContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_geomExpression);
		try {
			setState(145);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case POINT:
			case LINESTRING:
			case POLYGON:
			case MULTIPOINT:
			case MULTILINESTRING:
			case MULTIPOLYGON:
			case GEOMETRYCOLLECTION:
				_localctx = new GeometryContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(142);
				spatialInstance();
				}
				break;
			case BBOX:
				_localctx = new BboxGeometryContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(143);
				bbox();
				}
				break;
			case Z:
			case QUOTED_IDENTIFIER:
			case IDENTIFIER:
				_localctx = new GeometryPropertyContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(144);
				propertyName();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class BboxContext extends ParserRuleContext {
		public TerminalNode BBOX() { return getToken(CQL2Parser.BBOX, 0); }
		public TerminalNode LPAREN() { return getToken(CQL2Parser.LPAREN, 0); }
		public List<TerminalNode> NUMBER() { return getTokens(CQL2Parser.NUMBER); }
		public TerminalNode NUMBER(int i) {
			return getToken(CQL2Parser.NUMBER, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(CQL2Parser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(CQL2Parser.COMMA, i);
		}
		public TerminalNode RPAREN() { return getToken(CQL2Parser.RPAREN, 0); }
		public BboxContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bbox; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CQL2Visitor ) return ((CQL2Visitor<? extends T>)visitor).visitBbox(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BboxContext bbox() throws RecognitionException {
		BboxContext _localctx = new BboxContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_bbox);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(147);
			match(BBOX);
			setState(148);
			match(LPAREN);
			setState(149);
			match(NUMBER);
			setState(150);
			match(COMMA);
			setState(151);
			match(NUMBER);
			setState(152);
			match(COMMA);
			setState(153);
			match(NUMBER);
			setState(154);
			match(COMMA);
			setState(155);
			match(NUMBER);
			setState(160);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(156);
				match(COMMA);
				setState(157);
				match(NUMBER);
				setState(158);
				match(COMMA);
				setState(159);
				match(NUMBER);
				}
			}

			setState(162);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SpatialInstanceContext extends ParserRuleContext {
		public SpatialInstanceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_spatialInstance; }
	 
		public SpatialInstanceContext() { }
		public void copyFrom(SpatialInstanceContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MultiPointContext extends SpatialInstanceContext {
		public TerminalNode MULTIPOINT() { return getToken(CQL2Parser.MULTIPOINT, 0); }
		public TerminalNode LPAREN() { return getToken(CQL2Parser.LPAREN, 0); }
		public List<PointMemberContext> pointMember() {
			return getRuleContexts(PointMemberContext.class);
		}
		public PointMemberContext pointMember(int i) {
			return getRuleContext(PointMemberContext.class,i);
		}
		public TerminalNode RPAREN() { return getToken(CQL2Parser.RPAREN, 0); }
		public TerminalNode Z() { return getToken(CQL2Parser.Z, 0); }
		public List<TerminalNode> COMMA() { return getTokens(CQL2Parser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(CQL2Parser.COMMA, i);
		}
		public MultiPointContext(SpatialInstanceContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CQL2Visitor ) return ((CQL2Visitor<? extends T>)visitor).visitMultiPoint(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MultiLineStringContext extends SpatialInstanceContext {
		public TerminalNode MULTILINESTRING() { return getToken(CQL2Parser.MULTILINESTRING, 0); }
		public TerminalNode LPAREN() { return getToken(CQL2Parser.LPAREN, 0); }
		public List<PositionListContext> positionList() {
			return getRuleContexts(PositionListContext.class);
		}
		public PositionListContext positionList(int i) {
			return getRuleContext(PositionListContext.class,i);
		}
		public TerminalNode RPAREN() { return getToken(CQL2Parser.RPAREN, 0); }
		public TerminalNode Z() { return getToken(CQL2Parser.Z, 0); }
		public List<TerminalNode> COMMA() { return getTokens(CQL2Parser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(CQL2Parser.COMMA, i);
		}
		public MultiLineStringContext(SpatialInstanceContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CQL2Visitor ) return ((CQL2Visitor<? extends T>)visitor).visitMultiLineString(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PolygonContext extends SpatialInstanceContext {
		public TerminalNode POLYGON() { return getToken(CQL2Parser.POLYGON, 0); }
		public PolygonTextContext polygonText() {
			return getRuleContext(PolygonTextContext.class,0);
		}
		public TerminalNode Z() { return getToken(CQL2Parser.Z, 0); }
		public PolygonContext(SpatialInstanceContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CQL2Visitor ) return ((CQL2Visitor<? extends T>)visitor).visitPolygon(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MultiPolygonContext extends SpatialInstanceContext {
		public TerminalNode MULTIPOLYGON() { return getToken(CQL2Parser.MULTIPOLYGON, 0); }
		public TerminalNode LPAREN() { return getToken(CQL2Parser.LPAREN, 0); }
		public List<PolygonTextContext> polygonText() {
			return getRuleContexts(PolygonTextContext.class);
		}
		public PolygonTextContext polygonText(int i) {
			return getRuleContext(PolygonTextContext.class,i);
		}
		public TerminalNode RPAREN() { return getToken(CQL2Parser.RPAREN, 0); }
		public TerminalNode Z() { return getToken(CQL2Parser.Z, 0); }
		public List<TerminalNode> COMMA() { return getTokens(CQL2Parser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(CQL2Parser.COMMA, i);
		}
		public MultiPolygonContext(SpatialInstanceContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CQL2Visitor ) return ((CQL2Visitor<? extends T>)visitor).visitMultiPolygon(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LineStringContext extends SpatialInstanceContext {
		public TerminalNode LINESTRING() { return getToken(CQL2Parser.LINESTRING, 0); }
		public PositionListContext positionList() {
			return getRuleContext(PositionListContext.class,0);
		}
		public TerminalNode Z() { return getToken(CQL2Parser.Z, 0); }
		public LineStringContext(SpatialInstanceContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CQL2Visitor ) return ((CQL2Visitor<? extends T>)visitor).visitLineString(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class GeometryCollectionContext extends SpatialInstanceContext {
		public TerminalNode GEOMETRYCOLLECTION() { return getToken(CQL2Parser.GEOMETRYCOLLECTION, 0); }
		public TerminalNode LPAREN() { return getToken(CQL2Parser.LPAREN, 0); }
		public List<SpatialInstanceContext> spatialInstance() {
			return getRuleContexts(SpatialInstanceContext.class);
		}
		public SpatialInstanceContext spatialInstance(int i) {
			return getRuleContext(SpatialInstanceContext.class,i);
		}
		public TerminalNode RPAREN() { return getToken(CQL2Parser.RPAREN, 0); }
		public TerminalNode Z() { return getToken(CQL2Parser.Z, 0); }
		public List<TerminalNode> COMMA() { return getTokens(CQL2Parser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(CQL2Parser.COMMA, i);
		}
		public GeometryCollectionContext(SpatialInstanceContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CQL2Visitor ) return ((CQL2Visitor<? extends T>)visitor).visitGeometryCollection(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PointContext extends SpatialInstanceContext {
		public TerminalNode POINT() { return getToken(CQL2Parser.POINT, 0); }
		public TerminalNode LPAREN() { return getToken(CQL2Parser.LPAREN, 0); }
		public PositionContext position() {
			return getRuleContext(PositionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(CQL2Parser.RPAREN, 0); }
		public TerminalNode Z() { return getToken(CQL2Parser.Z, 0); }
		public PointContext(SpatialInstanceContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CQL2Visitor ) return ((CQL2Visitor<? extends T>)visitor).visitPoint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SpatialInstanceContext spatialInstance() throws RecognitionException {
		SpatialInstanceContext _localctx = new SpatialInstanceContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_spatialInstance);
		int _la;
		try {
			setState(242);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case POINT:
				_localctx = new PointContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(164);
				match(POINT);
				setState(166);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Z) {
					{
					setState(165);
					match(Z);
					}
				}

				setState(168);
				match(LPAREN);
				setState(169);
				position();
				setState(170);
				match(RPAREN);
				}
				break;
			case LINESTRING:
				_localctx = new LineStringContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(172);
				match(LINESTRING);
				setState(174);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Z) {
					{
					setState(173);
					match(Z);
					}
				}

				setState(176);
				positionList();
				}
				break;
			case POLYGON:
				_localctx = new PolygonContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(177);
				match(POLYGON);
				setState(179);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Z) {
					{
					setState(178);
					match(Z);
					}
				}

				setState(181);
				polygonText();
				}
				break;
			case MULTIPOINT:
				_localctx = new MultiPointContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(182);
				match(MULTIPOINT);
				setState(184);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Z) {
					{
					setState(183);
					match(Z);
					}
				}

				setState(186);
				match(LPAREN);
				setState(187);
				pointMember();
				setState(192);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(188);
					match(COMMA);
					setState(189);
					pointMember();
					}
					}
					setState(194);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(195);
				match(RPAREN);
				}
				break;
			case MULTILINESTRING:
				_localctx = new MultiLineStringContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(197);
				match(MULTILINESTRING);
				setState(199);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Z) {
					{
					setState(198);
					match(Z);
					}
				}

				setState(201);
				match(LPAREN);
				setState(202);
				positionList();
				setState(207);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(203);
					match(COMMA);
					setState(204);
					positionList();
					}
					}
					setState(209);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(210);
				match(RPAREN);
				}
				break;
			case MULTIPOLYGON:
				_localctx = new MultiPolygonContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(212);
				match(MULTIPOLYGON);
				setState(214);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Z) {
					{
					setState(213);
					match(Z);
					}
				}

				setState(216);
				match(LPAREN);
				setState(217);
				polygonText();
				setState(222);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(218);
					match(COMMA);
					setState(219);
					polygonText();
					}
					}
					setState(224);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(225);
				match(RPAREN);
				}
				break;
			case GEOMETRYCOLLECTION:
				_localctx = new GeometryCollectionContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(227);
				match(GEOMETRYCOLLECTION);
				setState(229);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Z) {
					{
					setState(228);
					match(Z);
					}
				}

				setState(231);
				match(LPAREN);
				setState(232);
				spatialInstance();
				setState(237);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(233);
					match(COMMA);
					setState(234);
					spatialInstance();
					}
					}
					setState(239);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(240);
				match(RPAREN);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PointMemberContext extends ParserRuleContext {
		public PositionContext position() {
			return getRuleContext(PositionContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(CQL2Parser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(CQL2Parser.RPAREN, 0); }
		public PointMemberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pointMember; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CQL2Visitor ) return ((CQL2Visitor<? extends T>)visitor).visitPointMember(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PointMemberContext pointMember() throws RecognitionException {
		PointMemberContext _localctx = new PointMemberContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_pointMember);
		try {
			setState(249);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUMBER:
				enterOuterAlt(_localctx, 1);
				{
				setState(244);
				position();
				}
				break;
			case LPAREN:
				enterOuterAlt(_localctx, 2);
				{
				setState(245);
				match(LPAREN);
				setState(246);
				position();
				setState(247);
				match(RPAREN);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PolygonTextContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(CQL2Parser.LPAREN, 0); }
		public List<PositionListContext> positionList() {
			return getRuleContexts(PositionListContext.class);
		}
		public PositionListContext positionList(int i) {
			return getRuleContext(PositionListContext.class,i);
		}
		public TerminalNode RPAREN() { return getToken(CQL2Parser.RPAREN, 0); }
		public List<TerminalNode> COMMA() { return getTokens(CQL2Parser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(CQL2Parser.COMMA, i);
		}
		public PolygonTextContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_polygonText; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CQL2Visitor ) return ((CQL2Visitor<? extends T>)visitor).visitPolygonText(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PolygonTextContext polygonText() throws RecognitionException {
		PolygonTextContext _localctx = new PolygonTextContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_polygonText);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(251);
			match(LPAREN);
			setState(252);
			positionList();
			setState(257);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(253);
				match(COMMA);
				setState(254);
				positionList();
				}
				}
				setState(259);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(260);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PositionListContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(CQL2Parser.LPAREN, 0); }
		public List<PositionContext> position() {
			return getRuleContexts(PositionContext.class);
		}
		public PositionContext position(int i) {
			return getRuleContext(PositionContext.class,i);
		}
		public TerminalNode RPAREN() { return getToken(CQL2Parser.RPAREN, 0); }
		public List<TerminalNode> COMMA() { return getTokens(CQL2Parser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(CQL2Parser.COMMA, i);
		}
		public PositionListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_positionList; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CQL2Visitor ) return ((CQL2Visitor<? extends T>)visitor).visitPositionList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PositionListContext positionList() throws RecognitionException {
		PositionListContext _localctx = new PositionListContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_positionList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(262);
			match(LPAREN);
			setState(263);
			position();
			setState(268);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(264);
				match(COMMA);
				setState(265);
				position();
				}
				}
				setState(270);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(271);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PositionContext extends ParserRuleContext {
		public List<TerminalNode> NUMBER() { return getTokens(CQL2Parser.NUMBER); }
		public TerminalNode NUMBER(int i) {
			return getToken(CQL2Parser.NUMBER, i);
		}
		public PositionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_position; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CQL2Visitor ) return ((CQL2Visitor<? extends T>)visitor).visitPosition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PositionContext position() throws RecognitionException {
		PositionContext _localctx = new PositionContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_position);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(273);
			match(NUMBER);
			setState(274);
			match(NUMBER);
			setState(276);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NUMBER) {
				{
				setState(275);
				match(NUMBER);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\u0004\u0001+\u0117\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0005\u0001+\b\u0001"+
		"\n\u0001\f\u0001.\t\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0005\u0002"+
		"3\b\u0002\n\u0002\f\u00026\t\u0002\u0001\u0003\u0003\u00039\b\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0003\u0004C\b\u0004\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0003\u0005K\b\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0003\u0005R\b"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0003\u0005[\b\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0005\u0005b\b\u0005\n\u0005\f\u0005e\t"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0003"+
		"\u0005l\b\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0003\u0005w\b"+
		"\u0005\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\b\u0001\b"+
		"\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0003\b\u0089\b\b\u0001\t\u0001\t\u0001\n\u0001\n\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0003\u000b\u0092\b\u000b\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0003\f\u00a1\b\f\u0001\f\u0001\f\u0001\r\u0001\r\u0003\r\u00a7"+
		"\b\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0003\r\u00af\b\r"+
		"\u0001\r\u0001\r\u0001\r\u0003\r\u00b4\b\r\u0001\r\u0001\r\u0001\r\u0003"+
		"\r\u00b9\b\r\u0001\r\u0001\r\u0001\r\u0001\r\u0005\r\u00bf\b\r\n\r\f\r"+
		"\u00c2\t\r\u0001\r\u0001\r\u0001\r\u0001\r\u0003\r\u00c8\b\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0005\r\u00ce\b\r\n\r\f\r\u00d1\t\r\u0001\r\u0001\r"+
		"\u0001\r\u0001\r\u0003\r\u00d7\b\r\u0001\r\u0001\r\u0001\r\u0001\r\u0005"+
		"\r\u00dd\b\r\n\r\f\r\u00e0\t\r\u0001\r\u0001\r\u0001\r\u0001\r\u0003\r"+
		"\u00e6\b\r\u0001\r\u0001\r\u0001\r\u0001\r\u0005\r\u00ec\b\r\n\r\f\r\u00ef"+
		"\t\r\u0001\r\u0001\r\u0003\r\u00f3\b\r\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0003\u000e\u00fa\b\u000e\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0005\u000f\u0100\b\u000f\n\u000f\f\u000f\u0103"+
		"\t\u000f\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0005\u0010\u010b\b\u0010\n\u0010\f\u0010\u010e\t\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0003\u0011\u0115\b\u0011"+
		"\u0001\u0011\u0000\u0000\u0012\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010"+
		"\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"\u0000\u0004\u0001\u0000"+
		"\u001e#\u0001\u0000\u0016\u001d\u0001\u0000\t\n\u0002\u0000\u0015\u0015"+
		")*\u0130\u0000$\u0001\u0000\u0000\u0000\u0002\'\u0001\u0000\u0000\u0000"+
		"\u0004/\u0001\u0000\u0000\u0000\u00068\u0001\u0000\u0000\u0000\bB\u0001"+
		"\u0000\u0000\u0000\nv\u0001\u0000\u0000\u0000\fx\u0001\u0000\u0000\u0000"+
		"\u000ez\u0001\u0000\u0000\u0000\u0010\u0088\u0001\u0000\u0000\u0000\u0012"+
		"\u008a\u0001\u0000\u0000\u0000\u0014\u008c\u0001\u0000\u0000\u0000\u0016"+
		"\u0091\u0001\u0000\u0000\u0000\u0018\u0093\u0001\u0000\u0000\u0000\u001a"+
		"\u00f2\u0001\u0000\u0000\u0000\u001c\u00f9\u0001\u0000\u0000\u0000\u001e"+
		"\u00fb\u0001\u0000\u0000\u0000 \u0106\u0001\u0000\u0000\u0000\"\u0111"+
		"\u0001\u0000\u0000\u0000$%\u0003\u0002\u0001\u0000%&\u0005\u0000\u0000"+
		"\u0001&\u0001\u0001\u0000\u0000\u0000\',\u0003\u0004\u0002\u0000()\u0005"+
		"\u0002\u0000\u0000)+\u0003\u0004\u0002\u0000*(\u0001\u0000\u0000\u0000"+
		"+.\u0001\u0000\u0000\u0000,*\u0001\u0000\u0000\u0000,-\u0001\u0000\u0000"+
		"\u0000-\u0003\u0001\u0000\u0000\u0000.,\u0001\u0000\u0000\u0000/4\u0003"+
		"\u0006\u0003\u000001\u0005\u0001\u0000\u000013\u0003\u0006\u0003\u0000"+
		"20\u0001\u0000\u0000\u000036\u0001\u0000\u0000\u000042\u0001\u0000\u0000"+
		"\u000045\u0001\u0000\u0000\u00005\u0005\u0001\u0000\u0000\u000064\u0001"+
		"\u0000\u0000\u000079\u0005\u0003\u0000\u000087\u0001\u0000\u0000\u0000"+
		"89\u0001\u0000\u0000\u00009:\u0001\u0000\u0000\u0000:;\u0003\b\u0004\u0000"+
		";\u0007\u0001\u0000\u0000\u0000<=\u0005$\u0000\u0000=>\u0003\u0002\u0001"+
		"\u0000>?\u0005%\u0000\u0000?C\u0001\u0000\u0000\u0000@C\u0003\n\u0005"+
		"\u0000AC\u0003\u0012\t\u0000B<\u0001\u0000\u0000\u0000B@\u0001\u0000\u0000"+
		"\u0000BA\u0001\u0000\u0000\u0000C\t\u0001\u0000\u0000\u0000DE\u0003\u0010"+
		"\b\u0000EF\u0003\f\u0006\u0000FG\u0003\u0010\b\u0000Gw\u0001\u0000\u0000"+
		"\u0000HJ\u0003\u0010\b\u0000IK\u0005\u0003\u0000\u0000JI\u0001\u0000\u0000"+
		"\u0000JK\u0001\u0000\u0000\u0000KL\u0001\u0000\u0000\u0000LM\u0005\u0004"+
		"\u0000\u0000MN\u0003\u0010\b\u0000Nw\u0001\u0000\u0000\u0000OQ\u0003\u0010"+
		"\b\u0000PR\u0005\u0003\u0000\u0000QP\u0001\u0000\u0000\u0000QR\u0001\u0000"+
		"\u0000\u0000RS\u0001\u0000\u0000\u0000ST\u0005\u0005\u0000\u0000TU\u0003"+
		"\u0010\b\u0000UV\u0005\u0001\u0000\u0000VW\u0003\u0010\b\u0000Ww\u0001"+
		"\u0000\u0000\u0000XZ\u0003\u0010\b\u0000Y[\u0005\u0003\u0000\u0000ZY\u0001"+
		"\u0000\u0000\u0000Z[\u0001\u0000\u0000\u0000[\\\u0001\u0000\u0000\u0000"+
		"\\]\u0005\u0006\u0000\u0000]^\u0005$\u0000\u0000^c\u0003\u0010\b\u0000"+
		"_`\u0005&\u0000\u0000`b\u0003\u0010\b\u0000a_\u0001\u0000\u0000\u0000"+
		"be\u0001\u0000\u0000\u0000ca\u0001\u0000\u0000\u0000cd\u0001\u0000\u0000"+
		"\u0000df\u0001\u0000\u0000\u0000ec\u0001\u0000\u0000\u0000fg\u0005%\u0000"+
		"\u0000gw\u0001\u0000\u0000\u0000hi\u0003\u0010\b\u0000ik\u0005\u0007\u0000"+
		"\u0000jl\u0005\u0003\u0000\u0000kj\u0001\u0000\u0000\u0000kl\u0001\u0000"+
		"\u0000\u0000lm\u0001\u0000\u0000\u0000mn\u0005\b\u0000\u0000nw\u0001\u0000"+
		"\u0000\u0000op\u0003\u000e\u0007\u0000pq\u0005$\u0000\u0000qr\u0003\u0016"+
		"\u000b\u0000rs\u0005&\u0000\u0000st\u0003\u0016\u000b\u0000tu\u0005%\u0000"+
		"\u0000uw\u0001\u0000\u0000\u0000vD\u0001\u0000\u0000\u0000vH\u0001\u0000"+
		"\u0000\u0000vO\u0001\u0000\u0000\u0000vX\u0001\u0000\u0000\u0000vh\u0001"+
		"\u0000\u0000\u0000vo\u0001\u0000\u0000\u0000w\u000b\u0001\u0000\u0000"+
		"\u0000xy\u0007\u0000\u0000\u0000y\r\u0001\u0000\u0000\u0000z{\u0007\u0001"+
		"\u0000\u0000{\u000f\u0001\u0000\u0000\u0000|\u0089\u0005(\u0000\u0000"+
		"}\u0089\u0005\'\u0000\u0000~\u0089\u0003\u0012\t\u0000\u007f\u0080\u0005"+
		"\u000b\u0000\u0000\u0080\u0081\u0005$\u0000\u0000\u0081\u0082\u0005(\u0000"+
		"\u0000\u0082\u0089\u0005%\u0000\u0000\u0083\u0084\u0005\f\u0000\u0000"+
		"\u0084\u0085\u0005$\u0000\u0000\u0085\u0086\u0005(\u0000\u0000\u0086\u0089"+
		"\u0005%\u0000\u0000\u0087\u0089\u0003\u0014\n\u0000\u0088|\u0001\u0000"+
		"\u0000\u0000\u0088}\u0001\u0000\u0000\u0000\u0088~\u0001\u0000\u0000\u0000"+
		"\u0088\u007f\u0001\u0000\u0000\u0000\u0088\u0083\u0001\u0000\u0000\u0000"+
		"\u0088\u0087\u0001\u0000\u0000\u0000\u0089\u0011\u0001\u0000\u0000\u0000"+
		"\u008a\u008b\u0007\u0002\u0000\u0000\u008b\u0013\u0001\u0000\u0000\u0000"+
		"\u008c\u008d\u0007\u0003\u0000\u0000\u008d\u0015\u0001\u0000\u0000\u0000"+
		"\u008e\u0092\u0003\u001a\r\u0000\u008f\u0092\u0003\u0018\f\u0000\u0090"+
		"\u0092\u0003\u0014\n\u0000\u0091\u008e\u0001\u0000\u0000\u0000\u0091\u008f"+
		"\u0001\u0000\u0000\u0000\u0091\u0090\u0001\u0000\u0000\u0000\u0092\u0017"+
		"\u0001\u0000\u0000\u0000\u0093\u0094\u0005\r\u0000\u0000\u0094\u0095\u0005"+
		"$\u0000\u0000\u0095\u0096\u0005\'\u0000\u0000\u0096\u0097\u0005&\u0000"+
		"\u0000\u0097\u0098\u0005\'\u0000\u0000\u0098\u0099\u0005&\u0000\u0000"+
		"\u0099\u009a\u0005\'\u0000\u0000\u009a\u009b\u0005&\u0000\u0000\u009b"+
		"\u00a0\u0005\'\u0000\u0000\u009c\u009d\u0005&\u0000\u0000\u009d\u009e"+
		"\u0005\'\u0000\u0000\u009e\u009f\u0005&\u0000\u0000\u009f\u00a1\u0005"+
		"\'\u0000\u0000\u00a0\u009c\u0001\u0000\u0000\u0000\u00a0\u00a1\u0001\u0000"+
		"\u0000\u0000\u00a1\u00a2\u0001\u0000\u0000\u0000\u00a2\u00a3\u0005%\u0000"+
		"\u0000\u00a3\u0019\u0001\u0000\u0000\u0000\u00a4\u00a6\u0005\u000e\u0000"+
		"\u0000\u00a5\u00a7\u0005\u0015\u0000\u0000\u00a6\u00a5\u0001\u0000\u0000"+
		"\u0000\u00a6\u00a7\u0001\u0000\u0000\u0000\u00a7\u00a8\u0001\u0000\u0000"+
		"\u0000\u00a8\u00a9\u0005$\u0000\u0000\u00a9\u00aa\u0003\"\u0011\u0000"+
		"\u00aa\u00ab\u0005%\u0000\u0000\u00ab\u00f3\u0001\u0000\u0000\u0000\u00ac"+
		"\u00ae\u0005\u000f\u0000\u0000\u00ad\u00af\u0005\u0015\u0000\u0000\u00ae"+
		"\u00ad\u0001\u0000\u0000\u0000\u00ae\u00af\u0001\u0000\u0000\u0000\u00af"+
		"\u00b0\u0001\u0000\u0000\u0000\u00b0\u00f3\u0003 \u0010\u0000\u00b1\u00b3"+
		"\u0005\u0010\u0000\u0000\u00b2\u00b4\u0005\u0015\u0000\u0000\u00b3\u00b2"+
		"\u0001\u0000\u0000\u0000\u00b3\u00b4\u0001\u0000\u0000\u0000\u00b4\u00b5"+
		"\u0001\u0000\u0000\u0000\u00b5\u00f3\u0003\u001e\u000f\u0000\u00b6\u00b8"+
		"\u0005\u0011\u0000\u0000\u00b7\u00b9\u0005\u0015\u0000\u0000\u00b8\u00b7"+
		"\u0001\u0000\u0000\u0000\u00b8\u00b9\u0001\u0000\u0000\u0000\u00b9\u00ba"+
		"\u0001\u0000\u0000\u0000\u00ba\u00bb\u0005$\u0000\u0000\u00bb\u00c0\u0003"+
		"\u001c\u000e\u0000\u00bc\u00bd\u0005&\u0000\u0000\u00bd\u00bf\u0003\u001c"+
		"\u000e\u0000\u00be\u00bc\u0001\u0000\u0000\u0000\u00bf\u00c2\u0001\u0000"+
		"\u0000\u0000\u00c0\u00be\u0001\u0000\u0000\u0000\u00c0\u00c1\u0001\u0000"+
		"\u0000\u0000\u00c1\u00c3\u0001\u0000\u0000\u0000\u00c2\u00c0\u0001\u0000"+
		"\u0000\u0000\u00c3\u00c4\u0005%\u0000\u0000\u00c4\u00f3\u0001\u0000\u0000"+
		"\u0000\u00c5\u00c7\u0005\u0012\u0000\u0000\u00c6\u00c8\u0005\u0015\u0000"+
		"\u0000\u00c7\u00c6\u0001\u0000\u0000\u0000\u00c7\u00c8\u0001\u0000\u0000"+
		"\u0000\u00c8\u00c9\u0001\u0000\u0000\u0000\u00c9\u00ca\u0005$\u0000\u0000"+
		"\u00ca\u00cf\u0003 \u0010\u0000\u00cb\u00cc\u0005&\u0000\u0000\u00cc\u00ce"+
		"\u0003 \u0010\u0000\u00cd\u00cb\u0001\u0000\u0000\u0000\u00ce\u00d1\u0001"+
		"\u0000\u0000\u0000\u00cf\u00cd\u0001\u0000\u0000\u0000\u00cf\u00d0\u0001"+
		"\u0000\u0000\u0000\u00d0\u00d2\u0001\u0000\u0000\u0000\u00d1\u00cf\u0001"+
		"\u0000\u0000\u0000\u00d2\u00d3\u0005%\u0000\u0000\u00d3\u00f3\u0001\u0000"+
		"\u0000\u0000\u00d4\u00d6\u0005\u0013\u0000\u0000\u00d5\u00d7\u0005\u0015"+
		"\u0000\u0000\u00d6\u00d5\u0001\u0000\u0000\u0000\u00d6\u00d7\u0001\u0000"+
		"\u0000\u0000\u00d7\u00d8\u0001\u0000\u0000\u0000\u00d8\u00d9\u0005$\u0000"+
		"\u0000\u00d9\u00de\u0003\u001e\u000f\u0000\u00da\u00db\u0005&\u0000\u0000"+
		"\u00db\u00dd\u0003\u001e\u000f\u0000\u00dc\u00da\u0001\u0000\u0000\u0000"+
		"\u00dd\u00e0\u0001\u0000\u0000\u0000\u00de\u00dc\u0001\u0000\u0000\u0000"+
		"\u00de\u00df\u0001\u0000\u0000\u0000\u00df\u00e1\u0001\u0000\u0000\u0000"+
		"\u00e0\u00de\u0001\u0000\u0000\u0000\u00e1\u00e2\u0005%\u0000\u0000\u00e2"+
		"\u00f3\u0001\u0000\u0000\u0000\u00e3\u00e5\u0005\u0014\u0000\u0000\u00e4"+
		"\u00e6\u0005\u0015\u0000\u0000\u00e5\u00e4\u0001\u0000\u0000\u0000\u00e5"+
		"\u00e6\u0001\u0000\u0000\u0000\u00e6\u00e7\u0001\u0000\u0000\u0000\u00e7"+
		"\u00e8\u0005$\u0000\u0000\u00e8\u00ed\u0003\u001a\r\u0000\u00e9\u00ea"+
		"\u0005&\u0000\u0000\u00ea\u00ec\u0003\u001a\r\u0000\u00eb\u00e9\u0001"+
		"\u0000\u0000\u0000\u00ec\u00ef\u0001\u0000\u0000\u0000\u00ed\u00eb\u0001"+
		"\u0000\u0000\u0000\u00ed\u00ee\u0001\u0000\u0000\u0000\u00ee\u00f0\u0001"+
		"\u0000\u0000\u0000\u00ef\u00ed\u0001\u0000\u0000\u0000\u00f0\u00f1\u0005"+
		"%\u0000\u0000\u00f1\u00f3\u0001\u0000\u0000\u0000\u00f2\u00a4\u0001\u0000"+
		"\u0000\u0000\u00f2\u00ac\u0001\u0000\u0000\u0000\u00f2\u00b1\u0001\u0000"+
		"\u0000\u0000\u00f2\u00b6\u0001\u0000\u0000\u0000\u00f2\u00c5\u0001\u0000"+
		"\u0000\u0000\u00f2\u00d4\u0001\u0000\u0000\u0000\u00f2\u00e3\u0001\u0000"+
		"\u0000\u0000\u00f3\u001b\u0001\u0000\u0000\u0000\u00f4\u00fa\u0003\"\u0011"+
		"\u0000\u00f5\u00f6\u0005$\u0000\u0000\u00f6\u00f7\u0003\"\u0011\u0000"+
		"\u00f7\u00f8\u0005%\u0000\u0000\u00f8\u00fa\u0001\u0000\u0000\u0000\u00f9"+
		"\u00f4\u0001\u0000\u0000\u0000\u00f9\u00f5\u0001\u0000\u0000\u0000\u00fa"+
		"\u001d\u0001\u0000\u0000\u0000\u00fb\u00fc\u0005$\u0000\u0000\u00fc\u0101"+
		"\u0003 \u0010\u0000\u00fd\u00fe\u0005&\u0000\u0000\u00fe\u0100\u0003 "+
		"\u0010\u0000\u00ff\u00fd\u0001\u0000\u0000\u0000\u0100\u0103\u0001\u0000"+
		"\u0000\u0000\u0101\u00ff\u0001\u0000\u0000\u0000\u0101\u0102\u0001\u0000"+
		"\u0000\u0000\u0102\u0104\u0001\u0000\u0000\u0000\u0103\u0101\u0001\u0000"+
		"\u0000\u0000\u0104\u0105\u0005%\u0000\u0000\u0105\u001f\u0001\u0000\u0000"+
		"\u0000\u0106\u0107\u0005$\u0000\u0000\u0107\u010c\u0003\"\u0011\u0000"+
		"\u0108\u0109\u0005&\u0000\u0000\u0109\u010b\u0003\"\u0011\u0000\u010a"+
		"\u0108\u0001\u0000\u0000\u0000\u010b\u010e\u0001\u0000\u0000\u0000\u010c"+
		"\u010a\u0001\u0000\u0000\u0000\u010c\u010d\u0001\u0000\u0000\u0000\u010d"+
		"\u010f\u0001\u0000\u0000\u0000\u010e\u010c\u0001\u0000\u0000\u0000\u010f"+
		"\u0110\u0005%\u0000\u0000\u0110!\u0001\u0000\u0000\u0000\u0111\u0112\u0005"+
		"\'\u0000\u0000\u0112\u0114\u0005\'\u0000\u0000\u0113\u0115\u0005\'\u0000"+
		"\u0000\u0114\u0113\u0001\u0000\u0000\u0000\u0114\u0115\u0001\u0000\u0000"+
		"\u0000\u0115#\u0001\u0000\u0000\u0000\u001d,48BJQZckv\u0088\u0091\u00a0"+
		"\u00a6\u00ae\u00b3\u00b8\u00c0\u00c7\u00cf\u00d6\u00de\u00e5\u00ed\u00f2"+
		"\u00f9\u0101\u010c\u0114";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}