// Generated from /Users/zcfrank1st/Desktop/git-svn/activity-parser/src/main/java/grammar/Activity.g4 by ANTLR 4.5.1
package grammar.generated;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ActivityParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, AND=6, OR=7, QUANTITY=8, TOTAL_PRICE=9, 
		ITEM=10, SINGLE_PRICE=11, EXPRESS=12, GT=13, EQ=14, GE=15, MINUS_VALUE=16, 
		INT=17, WS=18;
	public static final int
		RULE_main = 0, RULE_type = 1, RULE_expr_list = 2, RULE_expr = 3, RULE_label = 4, 
		RULE_opt = 5, RULE_threshold = 6, RULE_result = 7, RULE_side = 8, RULE_effect = 9;
	public static final String[] ruleNames = {
		"main", "type", "expr_list", "expr", "label", "opt", "threshold", "result", 
		"side", "effect"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'{'", "'}'", "';'", "'->'", "','", "'AND'", "'OR'", "'QUANTITY'", 
		"'TOTAL_PRICE'", "'ITEM'", "'SINGLE_PRICE'", "'EXPRESS'", "'>'", "'='", 
		"'>='"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, "AND", "OR", "QUANTITY", "TOTAL_PRICE", 
		"ITEM", "SINGLE_PRICE", "EXPRESS", "GT", "EQ", "GE", "MINUS_VALUE", "INT", 
		"WS"
	};
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
	public String getGrammarFileName() { return "Activity.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public ActivityParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class MainContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public Expr_listContext expr_list() {
			return getRuleContext(Expr_listContext.class,0);
		}
		public MainContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_main; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ActivityListener ) ((ActivityListener)listener).enterMain(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ActivityListener ) ((ActivityListener)listener).exitMain(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ActivityVisitor ) return ((ActivityVisitor<? extends T>)visitor).visitMain(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MainContext main() throws RecognitionException {
		MainContext _localctx = new MainContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_main);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(20);
			type();
			setState(21);
			match(T__0);
			setState(22);
			expr_list();
			setState(23);
			match(T__1);
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

	public static class TypeContext extends ParserRuleContext {
		public TerminalNode AND() { return getToken(ActivityParser.AND, 0); }
		public TerminalNode OR() { return getToken(ActivityParser.OR, 0); }
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ActivityListener ) ((ActivityListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ActivityListener ) ((ActivityListener)listener).exitType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ActivityVisitor ) return ((ActivityVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(25);
			_la = _input.LA(1);
			if ( !(_la==AND || _la==OR) ) {
			_errHandler.recoverInline(this);
			} else {
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

	public static class Expr_listContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public Expr_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ActivityListener ) ((ActivityListener)listener).enterExpr_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ActivityListener ) ((ActivityListener)listener).exitExpr_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ActivityVisitor ) return ((ActivityVisitor<? extends T>)visitor).visitExpr_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expr_listContext expr_list() throws RecognitionException {
		Expr_listContext _localctx = new Expr_listContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_expr_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(33);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==QUANTITY || _la==TOTAL_PRICE) {
				{
				{
				setState(27);
				expr();
				setState(29);
				_la = _input.LA(1);
				if (_la==T__2) {
					{
					setState(28);
					match(T__2);
					}
				}

				}
				}
				setState(35);
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

	public static class ExprContext extends ParserRuleContext {
		public LabelContext label() {
			return getRuleContext(LabelContext.class,0);
		}
		public OptContext opt() {
			return getRuleContext(OptContext.class,0);
		}
		public ThresholdContext threshold() {
			return getRuleContext(ThresholdContext.class,0);
		}
		public ResultContext result() {
			return getRuleContext(ResultContext.class,0);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ActivityListener ) ((ActivityListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ActivityListener ) ((ActivityListener)listener).exitExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ActivityVisitor ) return ((ActivityVisitor<? extends T>)visitor).visitExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_expr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(36);
			label();
			setState(37);
			opt();
			setState(38);
			threshold();
			setState(41);
			_la = _input.LA(1);
			if (_la==T__3) {
				{
				setState(39);
				match(T__3);
				setState(40);
				result();
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

	public static class LabelContext extends ParserRuleContext {
		public TerminalNode QUANTITY() { return getToken(ActivityParser.QUANTITY, 0); }
		public TerminalNode TOTAL_PRICE() { return getToken(ActivityParser.TOTAL_PRICE, 0); }
		public LabelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_label; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ActivityListener ) ((ActivityListener)listener).enterLabel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ActivityListener ) ((ActivityListener)listener).exitLabel(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ActivityVisitor ) return ((ActivityVisitor<? extends T>)visitor).visitLabel(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LabelContext label() throws RecognitionException {
		LabelContext _localctx = new LabelContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_label);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(43);
			_la = _input.LA(1);
			if ( !(_la==QUANTITY || _la==TOTAL_PRICE) ) {
			_errHandler.recoverInline(this);
			} else {
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

	public static class OptContext extends ParserRuleContext {
		public TerminalNode GE() { return getToken(ActivityParser.GE, 0); }
		public TerminalNode EQ() { return getToken(ActivityParser.EQ, 0); }
		public OptContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_opt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ActivityListener ) ((ActivityListener)listener).enterOpt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ActivityListener ) ((ActivityListener)listener).exitOpt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ActivityVisitor ) return ((ActivityVisitor<? extends T>)visitor).visitOpt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OptContext opt() throws RecognitionException {
		OptContext _localctx = new OptContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_opt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(45);
			_la = _input.LA(1);
			if ( !(_la==EQ || _la==GE) ) {
			_errHandler.recoverInline(this);
			} else {
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

	public static class ThresholdContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(ActivityParser.INT, 0); }
		public ThresholdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_threshold; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ActivityListener ) ((ActivityListener)listener).enterThreshold(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ActivityListener ) ((ActivityListener)listener).exitThreshold(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ActivityVisitor ) return ((ActivityVisitor<? extends T>)visitor).visitThreshold(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ThresholdContext threshold() throws RecognitionException {
		ThresholdContext _localctx = new ThresholdContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_threshold);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(47);
			match(INT);
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

	public static class ResultContext extends ParserRuleContext {
		public SideContext side() {
			return getRuleContext(SideContext.class,0);
		}
		public EffectContext effect() {
			return getRuleContext(EffectContext.class,0);
		}
		public ResultContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_result; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ActivityListener ) ((ActivityListener)listener).enterResult(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ActivityListener ) ((ActivityListener)listener).exitResult(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ActivityVisitor ) return ((ActivityVisitor<? extends T>)visitor).visitResult(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ResultContext result() throws RecognitionException {
		ResultContext _localctx = new ResultContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_result);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(49);
			side();
			setState(51);
			_la = _input.LA(1);
			if (_la==MINUS_VALUE || _la==INT) {
				{
				setState(50);
				effect();
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

	public static class SideContext extends ParserRuleContext {
		public TerminalNode ITEM() { return getToken(ActivityParser.ITEM, 0); }
		public TerminalNode TOTAL_PRICE() { return getToken(ActivityParser.TOTAL_PRICE, 0); }
		public TerminalNode SINGLE_PRICE() { return getToken(ActivityParser.SINGLE_PRICE, 0); }
		public TerminalNode EXPRESS() { return getToken(ActivityParser.EXPRESS, 0); }
		public SideContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_side; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ActivityListener ) ((ActivityListener)listener).enterSide(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ActivityListener ) ((ActivityListener)listener).exitSide(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ActivityVisitor ) return ((ActivityVisitor<? extends T>)visitor).visitSide(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SideContext side() throws RecognitionException {
		SideContext _localctx = new SideContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_side);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(53);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TOTAL_PRICE) | (1L << ITEM) | (1L << SINGLE_PRICE) | (1L << EXPRESS))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
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

	public static class EffectContext extends ParserRuleContext {
		public List<TerminalNode> INT() { return getTokens(ActivityParser.INT); }
		public TerminalNode INT(int i) {
			return getToken(ActivityParser.INT, i);
		}
		public TerminalNode MINUS_VALUE() { return getToken(ActivityParser.MINUS_VALUE, 0); }
		public EffectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_effect; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ActivityListener ) ((ActivityListener)listener).enterEffect(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ActivityListener ) ((ActivityListener)listener).exitEffect(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ActivityVisitor ) return ((ActivityVisitor<? extends T>)visitor).visitEffect(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EffectContext effect() throws RecognitionException {
		EffectContext _localctx = new EffectContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_effect);
		int _la;
		try {
			setState(64);
			switch (_input.LA(1)) {
			case INT:
				enterOuterAlt(_localctx, 1);
				{
				setState(55);
				match(INT);
				setState(60);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__4) {
					{
					{
					setState(56);
					match(T__4);
					setState(57);
					match(INT);
					}
					}
					setState(62);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case MINUS_VALUE:
				enterOuterAlt(_localctx, 2);
				{
				setState(63);
				match(MINUS_VALUE);
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

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\24E\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t\13\3"+
		"\2\3\2\3\2\3\2\3\2\3\3\3\3\3\4\3\4\5\4 \n\4\7\4\"\n\4\f\4\16\4%\13\4\3"+
		"\5\3\5\3\5\3\5\3\5\5\5,\n\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\5\t\66\n\t"+
		"\3\n\3\n\3\13\3\13\3\13\7\13=\n\13\f\13\16\13@\13\13\3\13\5\13C\n\13\3"+
		"\13\2\2\f\2\4\6\b\n\f\16\20\22\24\2\6\3\2\b\t\3\2\n\13\3\2\20\21\3\2\13"+
		"\16@\2\26\3\2\2\2\4\33\3\2\2\2\6#\3\2\2\2\b&\3\2\2\2\n-\3\2\2\2\f/\3\2"+
		"\2\2\16\61\3\2\2\2\20\63\3\2\2\2\22\67\3\2\2\2\24B\3\2\2\2\26\27\5\4\3"+
		"\2\27\30\7\3\2\2\30\31\5\6\4\2\31\32\7\4\2\2\32\3\3\2\2\2\33\34\t\2\2"+
		"\2\34\5\3\2\2\2\35\37\5\b\5\2\36 \7\5\2\2\37\36\3\2\2\2\37 \3\2\2\2 \""+
		"\3\2\2\2!\35\3\2\2\2\"%\3\2\2\2#!\3\2\2\2#$\3\2\2\2$\7\3\2\2\2%#\3\2\2"+
		"\2&\'\5\n\6\2\'(\5\f\7\2(+\5\16\b\2)*\7\6\2\2*,\5\20\t\2+)\3\2\2\2+,\3"+
		"\2\2\2,\t\3\2\2\2-.\t\3\2\2.\13\3\2\2\2/\60\t\4\2\2\60\r\3\2\2\2\61\62"+
		"\7\23\2\2\62\17\3\2\2\2\63\65\5\22\n\2\64\66\5\24\13\2\65\64\3\2\2\2\65"+
		"\66\3\2\2\2\66\21\3\2\2\2\678\t\5\2\28\23\3\2\2\29>\7\23\2\2:;\7\7\2\2"+
		";=\7\23\2\2<:\3\2\2\2=@\3\2\2\2><\3\2\2\2>?\3\2\2\2?C\3\2\2\2@>\3\2\2"+
		"\2AC\7\22\2\2B9\3\2\2\2BA\3\2\2\2C\25\3\2\2\2\b\37#+\65>B";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}