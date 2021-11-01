package grammer;// Generated from secretSobaki.g4 by ANTLR 4.3

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.ATN;
import org.antlr.v4.runtime.atn.ATNDeserializer;
import org.antlr.v4.runtime.atn.ParserATNSimulator;
import org.antlr.v4.runtime.atn.PredictionContextCache;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.tree.ParseTreeListener;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.List;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class secretSobakiParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__13=1, T__12=2, T__11=3, T__10=4, T__9=5, T__8=6, T__7=7, T__6=8, T__5=9, 
		T__4=10, T__3=11, T__2=12, T__1=13, T__0=14, Int=15, String=16, VarName=17, 
		Num=18, StringValue=19, WS=20, Less=21, Greater=22, Equal=23;
	public static final String[] tokenNames = {
		"<INVALID>", "'{'", "'while'", "';'", "'++'", "'}'", "'goto'", "'='", 
		"'if'", "'@'", "'mainPrograms'", "'print'", "'('", "')'", "'not'", "'int'", 
		"'string'", "VarName", "Num", "StringValue", "WS", "'<'", "'>'", "'=='"
	};
	public static final int
		RULE_type = 0, RULE_intRightValue = 1, RULE_strRightValue = 2, RULE_varDeclaration = 3, 
		RULE_intVarDeclaration = 4, RULE_strVarDeclaration = 5, RULE_intVarAssign = 6, 
		RULE_strVarAssign = 7, RULE_compareInt = 8, RULE_compareStr = 9, RULE_compareOperation = 10, 
		RULE_not = 11, RULE_condition = 12, RULE_ifStatement = 13, RULE_print = 14, 
		RULE_gotoOperation = 15, RULE_increment = 16, RULE_loop = 17, RULE_sobaki = 18, 
		RULE_gotoLabel = 19, RULE_codeBlock = 20, RULE_program = 21;
	public static final String[] ruleNames = {
		"type", "intRightValue", "strRightValue", "varDeclaration", "intVarDeclaration", 
		"strVarDeclaration", "intVarAssign", "strVarAssign", "compareInt", "compareStr", 
		"compareOperation", "not", "condition", "ifStatement", "print", "gotoOperation", 
		"increment", "loop", "sobaki", "gotoLabel", "codeBlock", "program"
	};

	@Override
	public String getGrammarFileName() { return "secretSobaki.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public secretSobakiParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class TypeContext extends ParserRuleContext {
		public TerminalNode String() { return getToken(secretSobakiParser.String, 0); }
		public TerminalNode Int() { return getToken(secretSobakiParser.Int, 0); }
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof secretSobakiListener) ((secretSobakiListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof secretSobakiListener) ((secretSobakiListener)listener).exitType(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(44);
			_la = _input.LA(1);
			if ( !(_la==Int || _la==String) ) {
			_errHandler.recoverInline(this);
			}
			consume();
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

	public static class IntRightValueContext extends ParserRuleContext {
		public TerminalNode Num() { return getToken(secretSobakiParser.Num, 0); }
		public TerminalNode VarName() { return getToken(secretSobakiParser.VarName, 0); }
		public IntRightValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_intRightValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof secretSobakiListener) ((secretSobakiListener)listener).enterIntRightValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof secretSobakiListener) ((secretSobakiListener)listener).exitIntRightValue(this);
		}
	}

	public final IntRightValueContext intRightValue() throws RecognitionException {
		IntRightValueContext _localctx = new IntRightValueContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_intRightValue);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(46);
			_la = _input.LA(1);
			if ( !(_la==VarName || _la==Num) ) {
			_errHandler.recoverInline(this);
			}
			consume();
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

	public static class StrRightValueContext extends ParserRuleContext {
		public TerminalNode VarName() { return getToken(secretSobakiParser.VarName, 0); }
		public TerminalNode StringValue() { return getToken(secretSobakiParser.StringValue, 0); }
		public StrRightValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_strRightValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof secretSobakiListener) ((secretSobakiListener)listener).enterStrRightValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof secretSobakiListener) ((secretSobakiListener)listener).exitStrRightValue(this);
		}
	}

	public final StrRightValueContext strRightValue() throws RecognitionException {
		StrRightValueContext _localctx = new StrRightValueContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_strRightValue);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(48);
			_la = _input.LA(1);
			if ( !(_la==VarName || _la==StringValue) ) {
			_errHandler.recoverInline(this);
			}
			consume();
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

	public static class VarDeclarationContext extends ParserRuleContext {
		public TerminalNode WS(int i) {
			return getToken(secretSobakiParser.WS, i);
		}
		public List<TerminalNode> WS() { return getTokens(secretSobakiParser.WS); }
		public TerminalNode VarName() { return getToken(secretSobakiParser.VarName, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public VarDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof secretSobakiListener) ((secretSobakiListener)listener).enterVarDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof secretSobakiListener) ((secretSobakiListener)listener).exitVarDeclaration(this);
		}
	}

	public final VarDeclarationContext varDeclaration() throws RecognitionException {
		VarDeclarationContext _localctx = new VarDeclarationContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_varDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(50); type();
			setState(51); match(WS);
			setState(52); match(VarName);
			setState(54);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(53); match(WS);
				}
			}

			setState(56); match(T__11);
			setState(58);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(57); match(WS);
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

	public static class IntVarDeclarationContext extends ParserRuleContext {
		public TerminalNode WS(int i) {
			return getToken(secretSobakiParser.WS, i);
		}
		public List<TerminalNode> WS() { return getTokens(secretSobakiParser.WS); }
		public TerminalNode VarName() { return getToken(secretSobakiParser.VarName, 0); }
		public IntRightValueContext intRightValue() {
			return getRuleContext(IntRightValueContext.class,0);
		}
		public TerminalNode Int() { return getToken(secretSobakiParser.Int, 0); }
		public IntVarDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_intVarDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof secretSobakiListener) ((secretSobakiListener)listener).enterIntVarDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof secretSobakiListener) ((secretSobakiListener)listener).exitIntVarDeclaration(this);
		}
	}

	public final IntVarDeclarationContext intVarDeclaration() throws RecognitionException {
		IntVarDeclarationContext _localctx = new IntVarDeclarationContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_intVarDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(60); match(Int);
			setState(61); match(WS);
			setState(62); match(VarName);
			setState(64);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(63); match(WS);
				}
			}

			setState(66); match(T__7);
			setState(68);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(67); match(WS);
				}
			}

			setState(70); intRightValue();
			setState(72);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(71); match(WS);
				}
			}

			setState(74); match(T__11);
			setState(76);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(75); match(WS);
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

	public static class StrVarDeclarationContext extends ParserRuleContext {
		public TerminalNode WS(int i) {
			return getToken(secretSobakiParser.WS, i);
		}
		public List<TerminalNode> WS() { return getTokens(secretSobakiParser.WS); }
		public TerminalNode String() { return getToken(secretSobakiParser.String, 0); }
		public TerminalNode VarName() { return getToken(secretSobakiParser.VarName, 0); }
		public StrRightValueContext strRightValue() {
			return getRuleContext(StrRightValueContext.class,0);
		}
		public StrVarDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_strVarDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof secretSobakiListener) ((secretSobakiListener)listener).enterStrVarDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof secretSobakiListener) ((secretSobakiListener)listener).exitStrVarDeclaration(this);
		}
	}

	public final StrVarDeclarationContext strVarDeclaration() throws RecognitionException {
		StrVarDeclarationContext _localctx = new StrVarDeclarationContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_strVarDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(78); match(String);
			setState(79); match(WS);
			setState(80); match(VarName);
			setState(81); match(WS);
			setState(82); match(T__7);
			setState(83); match(WS);
			setState(84); strRightValue();
			setState(86);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(85); match(WS);
				}
			}

			setState(88); match(T__11);
			setState(90);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(89); match(WS);
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

	public static class IntVarAssignContext extends ParserRuleContext {
		public TerminalNode WS(int i) {
			return getToken(secretSobakiParser.WS, i);
		}
		public List<TerminalNode> WS() { return getTokens(secretSobakiParser.WS); }
		public TerminalNode VarName() { return getToken(secretSobakiParser.VarName, 0); }
		public IntRightValueContext intRightValue() {
			return getRuleContext(IntRightValueContext.class,0);
		}
		public IntVarAssignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_intVarAssign; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof secretSobakiListener) ((secretSobakiListener)listener).enterIntVarAssign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof secretSobakiListener) ((secretSobakiListener)listener).exitIntVarAssign(this);
		}
	}

	public final IntVarAssignContext intVarAssign() throws RecognitionException {
		IntVarAssignContext _localctx = new IntVarAssignContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_intVarAssign);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(92); match(VarName);
			setState(94);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(93); match(WS);
				}
			}

			setState(96); match(T__7);
			setState(98);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(97); match(WS);
				}
			}

			setState(100); intRightValue();
			setState(102);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(101); match(WS);
				}
			}

			setState(104); match(T__11);
			setState(106);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(105); match(WS);
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

	public static class StrVarAssignContext extends ParserRuleContext {
		public TerminalNode WS(int i) {
			return getToken(secretSobakiParser.WS, i);
		}
		public List<TerminalNode> WS() { return getTokens(secretSobakiParser.WS); }
		public TerminalNode VarName() { return getToken(secretSobakiParser.VarName, 0); }
		public StrRightValueContext strRightValue() {
			return getRuleContext(StrRightValueContext.class,0);
		}
		public StrVarAssignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_strVarAssign; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof secretSobakiListener) ((secretSobakiListener)listener).enterStrVarAssign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof secretSobakiListener) ((secretSobakiListener)listener).exitStrVarAssign(this);
		}
	}

	public final StrVarAssignContext strVarAssign() throws RecognitionException {
		StrVarAssignContext _localctx = new StrVarAssignContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_strVarAssign);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(108); match(VarName);
			setState(110);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(109); match(WS);
				}
			}

			setState(112); match(T__7);
			setState(114);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(113); match(WS);
				}
			}

			setState(116); strRightValue();
			setState(118);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(117); match(WS);
				}
			}

			setState(120); match(T__11);
			setState(122);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(121); match(WS);
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

	public static class CompareIntContext extends ParserRuleContext {
		public TerminalNode WS(int i) {
			return getToken(secretSobakiParser.WS, i);
		}
		public List<TerminalNode> WS() { return getTokens(secretSobakiParser.WS); }
		public List<IntRightValueContext> intRightValue() {
			return getRuleContexts(IntRightValueContext.class);
		}
		public CompareOperationContext compareOperation() {
			return getRuleContext(CompareOperationContext.class,0);
		}
		public IntRightValueContext intRightValue(int i) {
			return getRuleContext(IntRightValueContext.class,i);
		}
		public CompareIntContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compareInt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof secretSobakiListener) ((secretSobakiListener)listener).enterCompareInt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof secretSobakiListener) ((secretSobakiListener)listener).exitCompareInt(this);
		}
	}

	public final CompareIntContext compareInt() throws RecognitionException {
		CompareIntContext _localctx = new CompareIntContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_compareInt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(124); intRightValue();
			setState(126);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(125); match(WS);
				}
			}

			setState(128); compareOperation();
			setState(130);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(129); match(WS);
				}
			}

			setState(132); intRightValue();
			setState(134);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				{
				setState(133); match(WS);
				}
				break;
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

	public static class CompareStrContext extends ParserRuleContext {
		public TerminalNode WS(int i) {
			return getToken(secretSobakiParser.WS, i);
		}
		public List<TerminalNode> WS() { return getTokens(secretSobakiParser.WS); }
		public List<StrRightValueContext> strRightValue() {
			return getRuleContexts(StrRightValueContext.class);
		}
		public StrRightValueContext strRightValue(int i) {
			return getRuleContext(StrRightValueContext.class,i);
		}
		public CompareOperationContext compareOperation() {
			return getRuleContext(CompareOperationContext.class,0);
		}
		public CompareStrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compareStr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof secretSobakiListener) ((secretSobakiListener)listener).enterCompareStr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof secretSobakiListener) ((secretSobakiListener)listener).exitCompareStr(this);
		}
	}

	public final CompareStrContext compareStr() throws RecognitionException {
		CompareStrContext _localctx = new CompareStrContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_compareStr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(136); strRightValue();
			setState(138);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(137); match(WS);
				}
			}

			setState(140); compareOperation();
			setState(142);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(141); match(WS);
				}
			}

			setState(144); strRightValue();
			setState(146);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				{
				setState(145); match(WS);
				}
				break;
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

	public static class CompareOperationContext extends ParserRuleContext {
		public TerminalNode Less() { return getToken(secretSobakiParser.Less, 0); }
		public TerminalNode Greater() { return getToken(secretSobakiParser.Greater, 0); }
		public TerminalNode Equal() { return getToken(secretSobakiParser.Equal, 0); }
		public CompareOperationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compareOperation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof secretSobakiListener) ((secretSobakiListener)listener).enterCompareOperation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof secretSobakiListener) ((secretSobakiListener)listener).exitCompareOperation(this);
		}
	}

	public final CompareOperationContext compareOperation() throws RecognitionException {
		CompareOperationContext _localctx = new CompareOperationContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_compareOperation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(148);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Less) | (1L << Greater) | (1L << Equal))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
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

	public static class NotContext extends ParserRuleContext {
		public NotContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_not; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof secretSobakiListener) ((secretSobakiListener)listener).enterNot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof secretSobakiListener) ((secretSobakiListener)listener).exitNot(this);
		}
	}

	public final NotContext not() throws RecognitionException {
		NotContext _localctx = new NotContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_not);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(150); match(T__0);
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

	public static class ConditionContext extends ParserRuleContext {
		public TerminalNode WS(int i) {
			return getToken(secretSobakiParser.WS, i);
		}
		public CompareIntContext compareInt() {
			return getRuleContext(CompareIntContext.class,0);
		}
		public List<TerminalNode> WS() { return getTokens(secretSobakiParser.WS); }
		public NotContext not() {
			return getRuleContext(NotContext.class,0);
		}
		public CompareStrContext compareStr() {
			return getRuleContext(CompareStrContext.class,0);
		}
		public ConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof secretSobakiListener) ((secretSobakiListener)listener).enterCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof secretSobakiListener) ((secretSobakiListener)listener).exitCondition(this);
		}
	}

	public final ConditionContext condition() throws RecognitionException {
		ConditionContext _localctx = new ConditionContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_condition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(153);
			_la = _input.LA(1);
			if (_la==T__0) {
				{
				setState(152); not();
				}
			}

			setState(156);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(155); match(WS);
				}
			}

			setState(158); match(T__2);
			setState(160);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(159); match(WS);
				}
			}

			setState(164);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				{
				setState(162); compareInt();
				}
				break;

			case 2:
				{
				setState(163); compareStr();
				}
				break;
			}
			setState(167);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(166); match(WS);
				}
			}

			setState(169); match(T__1);
			setState(171);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				{
				setState(170); match(WS);
				}
				break;
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

	public static class IfStatementContext extends ParserRuleContext {
		public TerminalNode WS(int i) {
			return getToken(secretSobakiParser.WS, i);
		}
		public List<TerminalNode> WS() { return getTokens(secretSobakiParser.WS); }
		public CodeBlockContext codeBlock() {
			return getRuleContext(CodeBlockContext.class,0);
		}
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public IfStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof secretSobakiListener) ((secretSobakiListener)listener).enterIfStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof secretSobakiListener) ((secretSobakiListener)listener).exitIfStatement(this);
		}
	}

	public final IfStatementContext ifStatement() throws RecognitionException {
		IfStatementContext _localctx = new IfStatementContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_ifStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(173); match(T__6);
			setState(174); match(WS);
			{
			setState(175); condition();
			}
			setState(176); codeBlock();
			setState(178);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(177); match(WS);
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

	public static class PrintContext extends ParserRuleContext {
		public TerminalNode WS(int i) {
			return getToken(secretSobakiParser.WS, i);
		}
		public List<TerminalNode> WS() { return getTokens(secretSobakiParser.WS); }
		public TerminalNode Num() { return getToken(secretSobakiParser.Num, 0); }
		public TerminalNode VarName() { return getToken(secretSobakiParser.VarName, 0); }
		public TerminalNode StringValue() { return getToken(secretSobakiParser.StringValue, 0); }
		public PrintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_print; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof secretSobakiListener) ((secretSobakiListener)listener).enterPrint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof secretSobakiListener) ((secretSobakiListener)listener).exitPrint(this);
		}
	}

	public final PrintContext print() throws RecognitionException {
		PrintContext _localctx = new PrintContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_print);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(180); match(T__3);
			setState(182);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(181); match(WS);
				}
			}

			setState(184); match(T__2);
			setState(186);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(185); match(WS);
				}
			}

			setState(188);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << VarName) | (1L << Num) | (1L << StringValue))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			setState(190);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(189); match(WS);
				}
			}

			setState(192); match(T__1);
			setState(194);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(193); match(WS);
				}
			}

			setState(196); match(T__11);
			setState(198);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(197); match(WS);
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

	public static class GotoOperationContext extends ParserRuleContext {
		public TerminalNode WS(int i) {
			return getToken(secretSobakiParser.WS, i);
		}
		public List<TerminalNode> WS() { return getTokens(secretSobakiParser.WS); }
		public TerminalNode VarName() { return getToken(secretSobakiParser.VarName, 0); }
		public GotoOperationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_gotoOperation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof secretSobakiListener) ((secretSobakiListener)listener).enterGotoOperation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof secretSobakiListener) ((secretSobakiListener)listener).exitGotoOperation(this);
		}
	}

	public final GotoOperationContext gotoOperation() throws RecognitionException {
		GotoOperationContext _localctx = new GotoOperationContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_gotoOperation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(200); match(T__8);
			setState(201); match(WS);
			setState(202); match(VarName);
			setState(204);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(203); match(WS);
				}
			}

			setState(206); match(T__11);
			setState(208);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(207); match(WS);
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

	public static class IncrementContext extends ParserRuleContext {
		public TerminalNode WS(int i) {
			return getToken(secretSobakiParser.WS, i);
		}
		public List<TerminalNode> WS() { return getTokens(secretSobakiParser.WS); }
		public TerminalNode VarName() { return getToken(secretSobakiParser.VarName, 0); }
		public IncrementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_increment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof secretSobakiListener) ((secretSobakiListener)listener).enterIncrement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof secretSobakiListener) ((secretSobakiListener)listener).exitIncrement(this);
		}
	}

	public final IncrementContext increment() throws RecognitionException {
		IncrementContext _localctx = new IncrementContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_increment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(210); match(VarName);
			setState(211); match(T__10);
			setState(213);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(212); match(WS);
				}
			}

			setState(215); match(T__11);
			setState(217);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(216); match(WS);
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

	public static class LoopContext extends ParserRuleContext {
		public TerminalNode WS(int i) {
			return getToken(secretSobakiParser.WS, i);
		}
		public List<TerminalNode> WS() { return getTokens(secretSobakiParser.WS); }
		public CodeBlockContext codeBlock() {
			return getRuleContext(CodeBlockContext.class,0);
		}
		public NotContext not() {
			return getRuleContext(NotContext.class,0);
		}
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public LoopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof secretSobakiListener) ((secretSobakiListener)listener).enterLoop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof secretSobakiListener) ((secretSobakiListener)listener).exitLoop(this);
		}
	}

	public final LoopContext loop() throws RecognitionException {
		LoopContext _localctx = new LoopContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_loop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(219); match(T__12);
			setState(221);
			switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
			case 1:
				{
				setState(220); match(WS);
				}
				break;
			}
			setState(224);
			switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
			case 1:
				{
				setState(223); not();
				}
				break;
			}
			setState(227);
			switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
			case 1:
				{
				setState(226); match(WS);
				}
				break;
			}
			{
			setState(229); condition();
			}
			setState(231);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(230); match(WS);
				}
			}

			setState(233); codeBlock();
			setState(235);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(234); match(WS);
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

	public static class SobakiContext extends ParserRuleContext {
		public SobakiContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sobaki; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof secretSobakiListener) ((secretSobakiListener)listener).enterSobaki(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof secretSobakiListener) ((secretSobakiListener)listener).exitSobaki(this);
		}
	}

	public final SobakiContext sobaki() throws RecognitionException {
		SobakiContext _localctx = new SobakiContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_sobaki);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(237); match(T__5);
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

	public static class GotoLabelContext extends ParserRuleContext {
		public TerminalNode WS(int i) {
			return getToken(secretSobakiParser.WS, i);
		}
		public List<TerminalNode> WS() { return getTokens(secretSobakiParser.WS); }
		public SobakiContext sobaki() {
			return getRuleContext(SobakiContext.class,0);
		}
		public TerminalNode VarName() { return getToken(secretSobakiParser.VarName, 0); }
		public GotoLabelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_gotoLabel; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof secretSobakiListener) ((secretSobakiListener)listener).enterGotoLabel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof secretSobakiListener) ((secretSobakiListener)listener).exitGotoLabel(this);
		}
	}

	public final GotoLabelContext gotoLabel() throws RecognitionException {
		GotoLabelContext _localctx = new GotoLabelContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_gotoLabel);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(239); sobaki();
			setState(241);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(240); match(WS);
				}
			}

			setState(243); match(VarName);
			setState(245);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(244); match(WS);
				}
			}

			setState(247); match(T__11);
			setState(249);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(248); match(WS);
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

	public static class CodeBlockContext extends ParserRuleContext {
		public List<VarDeclarationContext> varDeclaration() {
			return getRuleContexts(VarDeclarationContext.class);
		}
		public GotoLabelContext gotoLabel(int i) {
			return getRuleContext(GotoLabelContext.class,i);
		}
		public List<GotoOperationContext> gotoOperation() {
			return getRuleContexts(GotoOperationContext.class);
		}
		public List<IncrementContext> increment() {
			return getRuleContexts(IncrementContext.class);
		}
		public GotoOperationContext gotoOperation(int i) {
			return getRuleContext(GotoOperationContext.class,i);
		}
		public List<CodeBlockContext> codeBlock() {
			return getRuleContexts(CodeBlockContext.class);
		}
		public List<StrVarAssignContext> strVarAssign() {
			return getRuleContexts(StrVarAssignContext.class);
		}
		public CodeBlockContext codeBlock(int i) {
			return getRuleContext(CodeBlockContext.class,i);
		}
		public List<LoopContext> loop() {
			return getRuleContexts(LoopContext.class);
		}
		public TerminalNode EOF() { return getToken(secretSobakiParser.EOF, 0); }
		public IntVarDeclarationContext intVarDeclaration(int i) {
			return getRuleContext(IntVarDeclarationContext.class,i);
		}
		public LoopContext loop(int i) {
			return getRuleContext(LoopContext.class,i);
		}
		public IfStatementContext ifStatement(int i) {
			return getRuleContext(IfStatementContext.class,i);
		}
		public List<PrintContext> print() {
			return getRuleContexts(PrintContext.class);
		}
		public VarDeclarationContext varDeclaration(int i) {
			return getRuleContext(VarDeclarationContext.class,i);
		}
		public PrintContext print(int i) {
			return getRuleContext(PrintContext.class,i);
		}
		public List<IntVarAssignContext> intVarAssign() {
			return getRuleContexts(IntVarAssignContext.class);
		}
		public List<IntVarDeclarationContext> intVarDeclaration() {
			return getRuleContexts(IntVarDeclarationContext.class);
		}
		public List<GotoLabelContext> gotoLabel() {
			return getRuleContexts(GotoLabelContext.class);
		}
		public StrVarDeclarationContext strVarDeclaration(int i) {
			return getRuleContext(StrVarDeclarationContext.class,i);
		}
		public List<IfStatementContext> ifStatement() {
			return getRuleContexts(IfStatementContext.class);
		}
		public TerminalNode WS() { return getToken(secretSobakiParser.WS, 0); }
		public IntVarAssignContext intVarAssign(int i) {
			return getRuleContext(IntVarAssignContext.class,i);
		}
		public StrVarAssignContext strVarAssign(int i) {
			return getRuleContext(StrVarAssignContext.class,i);
		}
		public List<StrVarDeclarationContext> strVarDeclaration() {
			return getRuleContexts(StrVarDeclarationContext.class);
		}
		public IncrementContext increment(int i) {
			return getRuleContext(IncrementContext.class,i);
		}
		public CodeBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_codeBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof secretSobakiListener) ((secretSobakiListener)listener).enterCodeBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof secretSobakiListener) ((secretSobakiListener)listener).exitCodeBlock(this);
		}
	}

	public final CodeBlockContext codeBlock() throws RecognitionException {
		CodeBlockContext _localctx = new CodeBlockContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_codeBlock);
		int _la;
		try {
			setState(274);
			switch (_input.LA(1)) {
			case T__13:
				enterOuterAlt(_localctx, 1);
				{
				setState(251); match(T__13);
				setState(253);
				_la = _input.LA(1);
				if (_la==WS) {
					{
					setState(252); match(WS);
					}
				}

				setState(269);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - -1)) & ~0x3f) == 0 && ((1L << (_la - -1)) & ((1L << (EOF - -1)) | (1L << (T__13 - -1)) | (1L << (T__12 - -1)) | (1L << (T__8 - -1)) | (1L << (T__6 - -1)) | (1L << (T__5 - -1)) | (1L << (T__3 - -1)) | (1L << (Int - -1)) | (1L << (String - -1)) | (1L << (VarName - -1)))) != 0)) {
					{
					setState(267);
					switch ( getInterpreter().adaptivePredict(_input,47,_ctx) ) {
					case 1:
						{
						setState(255); gotoLabel();
						}
						break;

					case 2:
						{
						setState(256); gotoOperation();
						}
						break;

					case 3:
						{
						setState(257); varDeclaration();
						}
						break;

					case 4:
						{
						setState(258); intVarDeclaration();
						}
						break;

					case 5:
						{
						setState(259); intVarAssign();
						}
						break;

					case 6:
						{
						setState(260); strVarDeclaration();
						}
						break;

					case 7:
						{
						setState(261); strVarAssign();
						}
						break;

					case 8:
						{
						setState(262); ifStatement();
						}
						break;

					case 9:
						{
						setState(263); loop();
						}
						break;

					case 10:
						{
						setState(264); codeBlock();
						}
						break;

					case 11:
						{
						setState(265); increment();
						}
						break;

					case 12:
						{
						setState(266); print();
						}
						break;
					}
					}
					setState(271);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(272); match(T__9);
				}
				break;
			case EOF:
				enterOuterAlt(_localctx, 2);
				{
				setState(273); match(EOF);
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

	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode WS(int i) {
			return getToken(secretSobakiParser.WS, i);
		}
		public List<TerminalNode> WS() { return getTokens(secretSobakiParser.WS); }
		public CodeBlockContext codeBlock() {
			return getRuleContext(CodeBlockContext.class,0);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof secretSobakiListener) ((secretSobakiListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof secretSobakiListener) ((secretSobakiListener)listener).exitProgram(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(277);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(276); match(WS);
				}
			}

			setState(279); match(T__4);
			setState(281);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(280); match(WS);
				}
			}

			setState(283); codeBlock();
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\31\u0120\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\3\2\3\2\3\3\3\3\3\4"+
		"\3\4\3\5\3\5\3\5\3\5\5\59\n\5\3\5\3\5\5\5=\n\5\3\6\3\6\3\6\3\6\5\6C\n"+
		"\6\3\6\3\6\5\6G\n\6\3\6\3\6\5\6K\n\6\3\6\3\6\5\6O\n\6\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\5\7Y\n\7\3\7\3\7\5\7]\n\7\3\b\3\b\5\ba\n\b\3\b\3\b\5"+
		"\be\n\b\3\b\3\b\5\bi\n\b\3\b\3\b\5\bm\n\b\3\t\3\t\5\tq\n\t\3\t\3\t\5\t"+
		"u\n\t\3\t\3\t\5\ty\n\t\3\t\3\t\5\t}\n\t\3\n\3\n\5\n\u0081\n\n\3\n\3\n"+
		"\5\n\u0085\n\n\3\n\3\n\5\n\u0089\n\n\3\13\3\13\5\13\u008d\n\13\3\13\3"+
		"\13\5\13\u0091\n\13\3\13\3\13\5\13\u0095\n\13\3\f\3\f\3\r\3\r\3\16\5\16"+
		"\u009c\n\16\3\16\5\16\u009f\n\16\3\16\3\16\5\16\u00a3\n\16\3\16\3\16\5"+
		"\16\u00a7\n\16\3\16\5\16\u00aa\n\16\3\16\3\16\5\16\u00ae\n\16\3\17\3\17"+
		"\3\17\3\17\3\17\5\17\u00b5\n\17\3\20\3\20\5\20\u00b9\n\20\3\20\3\20\5"+
		"\20\u00bd\n\20\3\20\3\20\5\20\u00c1\n\20\3\20\3\20\5\20\u00c5\n\20\3\20"+
		"\3\20\5\20\u00c9\n\20\3\21\3\21\3\21\3\21\5\21\u00cf\n\21\3\21\3\21\5"+
		"\21\u00d3\n\21\3\22\3\22\3\22\5\22\u00d8\n\22\3\22\3\22\5\22\u00dc\n\22"+
		"\3\23\3\23\5\23\u00e0\n\23\3\23\5\23\u00e3\n\23\3\23\5\23\u00e6\n\23\3"+
		"\23\3\23\5\23\u00ea\n\23\3\23\3\23\5\23\u00ee\n\23\3\24\3\24\3\25\3\25"+
		"\5\25\u00f4\n\25\3\25\3\25\5\25\u00f8\n\25\3\25\3\25\5\25\u00fc\n\25\3"+
		"\26\3\26\5\26\u0100\n\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\7\26\u010e\n\26\f\26\16\26\u0111\13\26\3\26\3\26\5\26"+
		"\u0115\n\26\3\27\5\27\u0118\n\27\3\27\3\27\5\27\u011c\n\27\3\27\3\27\3"+
		"\27\2\2\30\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,\2\7\3\2\21\22"+
		"\3\2\23\24\4\2\23\23\25\25\3\2\27\31\3\2\23\25\u0147\2.\3\2\2\2\4\60\3"+
		"\2\2\2\6\62\3\2\2\2\b\64\3\2\2\2\n>\3\2\2\2\fP\3\2\2\2\16^\3\2\2\2\20"+
		"n\3\2\2\2\22~\3\2\2\2\24\u008a\3\2\2\2\26\u0096\3\2\2\2\30\u0098\3\2\2"+
		"\2\32\u009b\3\2\2\2\34\u00af\3\2\2\2\36\u00b6\3\2\2\2 \u00ca\3\2\2\2\""+
		"\u00d4\3\2\2\2$\u00dd\3\2\2\2&\u00ef\3\2\2\2(\u00f1\3\2\2\2*\u0114\3\2"+
		"\2\2,\u0117\3\2\2\2./\t\2\2\2/\3\3\2\2\2\60\61\t\3\2\2\61\5\3\2\2\2\62"+
		"\63\t\4\2\2\63\7\3\2\2\2\64\65\5\2\2\2\65\66\7\26\2\2\668\7\23\2\2\67"+
		"9\7\26\2\28\67\3\2\2\289\3\2\2\29:\3\2\2\2:<\7\5\2\2;=\7\26\2\2<;\3\2"+
		"\2\2<=\3\2\2\2=\t\3\2\2\2>?\7\21\2\2?@\7\26\2\2@B\7\23\2\2AC\7\26\2\2"+
		"BA\3\2\2\2BC\3\2\2\2CD\3\2\2\2DF\7\t\2\2EG\7\26\2\2FE\3\2\2\2FG\3\2\2"+
		"\2GH\3\2\2\2HJ\5\4\3\2IK\7\26\2\2JI\3\2\2\2JK\3\2\2\2KL\3\2\2\2LN\7\5"+
		"\2\2MO\7\26\2\2NM\3\2\2\2NO\3\2\2\2O\13\3\2\2\2PQ\7\22\2\2QR\7\26\2\2"+
		"RS\7\23\2\2ST\7\26\2\2TU\7\t\2\2UV\7\26\2\2VX\5\6\4\2WY\7\26\2\2XW\3\2"+
		"\2\2XY\3\2\2\2YZ\3\2\2\2Z\\\7\5\2\2[]\7\26\2\2\\[\3\2\2\2\\]\3\2\2\2]"+
		"\r\3\2\2\2^`\7\23\2\2_a\7\26\2\2`_\3\2\2\2`a\3\2\2\2ab\3\2\2\2bd\7\t\2"+
		"\2ce\7\26\2\2dc\3\2\2\2de\3\2\2\2ef\3\2\2\2fh\5\4\3\2gi\7\26\2\2hg\3\2"+
		"\2\2hi\3\2\2\2ij\3\2\2\2jl\7\5\2\2km\7\26\2\2lk\3\2\2\2lm\3\2\2\2m\17"+
		"\3\2\2\2np\7\23\2\2oq\7\26\2\2po\3\2\2\2pq\3\2\2\2qr\3\2\2\2rt\7\t\2\2"+
		"su\7\26\2\2ts\3\2\2\2tu\3\2\2\2uv\3\2\2\2vx\5\6\4\2wy\7\26\2\2xw\3\2\2"+
		"\2xy\3\2\2\2yz\3\2\2\2z|\7\5\2\2{}\7\26\2\2|{\3\2\2\2|}\3\2\2\2}\21\3"+
		"\2\2\2~\u0080\5\4\3\2\177\u0081\7\26\2\2\u0080\177\3\2\2\2\u0080\u0081"+
		"\3\2\2\2\u0081\u0082\3\2\2\2\u0082\u0084\5\26\f\2\u0083\u0085\7\26\2\2"+
		"\u0084\u0083\3\2\2\2\u0084\u0085\3\2\2\2\u0085\u0086\3\2\2\2\u0086\u0088"+
		"\5\4\3\2\u0087\u0089\7\26\2\2\u0088\u0087\3\2\2\2\u0088\u0089\3\2\2\2"+
		"\u0089\23\3\2\2\2\u008a\u008c\5\6\4\2\u008b\u008d\7\26\2\2\u008c\u008b"+
		"\3\2\2\2\u008c\u008d\3\2\2\2\u008d\u008e\3\2\2\2\u008e\u0090\5\26\f\2"+
		"\u008f\u0091\7\26\2\2\u0090\u008f\3\2\2\2\u0090\u0091\3\2\2\2\u0091\u0092"+
		"\3\2\2\2\u0092\u0094\5\6\4\2\u0093\u0095\7\26\2\2\u0094\u0093\3\2\2\2"+
		"\u0094\u0095\3\2\2\2\u0095\25\3\2\2\2\u0096\u0097\t\5\2\2\u0097\27\3\2"+
		"\2\2\u0098\u0099\7\20\2\2\u0099\31\3\2\2\2\u009a\u009c\5\30\r\2\u009b"+
		"\u009a\3\2\2\2\u009b\u009c\3\2\2\2\u009c\u009e\3\2\2\2\u009d\u009f\7\26"+
		"\2\2\u009e\u009d\3\2\2\2\u009e\u009f\3\2\2\2\u009f\u00a0\3\2\2\2\u00a0"+
		"\u00a2\7\16\2\2\u00a1\u00a3\7\26\2\2\u00a2\u00a1\3\2\2\2\u00a2\u00a3\3"+
		"\2\2\2\u00a3\u00a6\3\2\2\2\u00a4\u00a7\5\22\n\2\u00a5\u00a7\5\24\13\2"+
		"\u00a6\u00a4\3\2\2\2\u00a6\u00a5\3\2\2\2\u00a7\u00a9\3\2\2\2\u00a8\u00aa"+
		"\7\26\2\2\u00a9\u00a8\3\2\2\2\u00a9\u00aa\3\2\2\2\u00aa\u00ab\3\2\2\2"+
		"\u00ab\u00ad\7\17\2\2\u00ac\u00ae\7\26\2\2\u00ad\u00ac\3\2\2\2\u00ad\u00ae"+
		"\3\2\2\2\u00ae\33\3\2\2\2\u00af\u00b0\7\n\2\2\u00b0\u00b1\7\26\2\2\u00b1"+
		"\u00b2\5\32\16\2\u00b2\u00b4\5*\26\2\u00b3\u00b5\7\26\2\2\u00b4\u00b3"+
		"\3\2\2\2\u00b4\u00b5\3\2\2\2\u00b5\35\3\2\2\2\u00b6\u00b8\7\r\2\2\u00b7"+
		"\u00b9\7\26\2\2\u00b8\u00b7\3\2\2\2\u00b8\u00b9\3\2\2\2\u00b9\u00ba\3"+
		"\2\2\2\u00ba\u00bc\7\16\2\2\u00bb\u00bd\7\26\2\2\u00bc\u00bb\3\2\2\2\u00bc"+
		"\u00bd\3\2\2\2\u00bd\u00be\3\2\2\2\u00be\u00c0\t\6\2\2\u00bf\u00c1\7\26"+
		"\2\2\u00c0\u00bf\3\2\2\2\u00c0\u00c1\3\2\2\2\u00c1\u00c2\3\2\2\2\u00c2"+
		"\u00c4\7\17\2\2\u00c3\u00c5\7\26\2\2\u00c4\u00c3\3\2\2\2\u00c4\u00c5\3"+
		"\2\2\2\u00c5\u00c6\3\2\2\2\u00c6\u00c8\7\5\2\2\u00c7\u00c9\7\26\2\2\u00c8"+
		"\u00c7\3\2\2\2\u00c8\u00c9\3\2\2\2\u00c9\37\3\2\2\2\u00ca\u00cb\7\b\2"+
		"\2\u00cb\u00cc\7\26\2\2\u00cc\u00ce\7\23\2\2\u00cd\u00cf\7\26\2\2\u00ce"+
		"\u00cd\3\2\2\2\u00ce\u00cf\3\2\2\2\u00cf\u00d0\3\2\2\2\u00d0\u00d2\7\5"+
		"\2\2\u00d1\u00d3\7\26\2\2\u00d2\u00d1\3\2\2\2\u00d2\u00d3\3\2\2\2\u00d3"+
		"!\3\2\2\2\u00d4\u00d5\7\23\2\2\u00d5\u00d7\7\6\2\2\u00d6\u00d8\7\26\2"+
		"\2\u00d7\u00d6\3\2\2\2\u00d7\u00d8\3\2\2\2\u00d8\u00d9\3\2\2\2\u00d9\u00db"+
		"\7\5\2\2\u00da\u00dc\7\26\2\2\u00db\u00da\3\2\2\2\u00db\u00dc\3\2\2\2"+
		"\u00dc#\3\2\2\2\u00dd\u00df\7\4\2\2\u00de\u00e0\7\26\2\2\u00df\u00de\3"+
		"\2\2\2\u00df\u00e0\3\2\2\2\u00e0\u00e2\3\2\2\2\u00e1\u00e3\5\30\r\2\u00e2"+
		"\u00e1\3\2\2\2\u00e2\u00e3\3\2\2\2\u00e3\u00e5\3\2\2\2\u00e4\u00e6\7\26"+
		"\2\2\u00e5\u00e4\3\2\2\2\u00e5\u00e6\3\2\2\2\u00e6\u00e7\3\2\2\2\u00e7"+
		"\u00e9\5\32\16\2\u00e8\u00ea\7\26\2\2\u00e9\u00e8\3\2\2\2\u00e9\u00ea"+
		"\3\2\2\2\u00ea\u00eb\3\2\2\2\u00eb\u00ed\5*\26\2\u00ec\u00ee\7\26\2\2"+
		"\u00ed\u00ec\3\2\2\2\u00ed\u00ee\3\2\2\2\u00ee%\3\2\2\2\u00ef\u00f0\7"+
		"\13\2\2\u00f0\'\3\2\2\2\u00f1\u00f3\5&\24\2\u00f2\u00f4\7\26\2\2\u00f3"+
		"\u00f2\3\2\2\2\u00f3\u00f4\3\2\2\2\u00f4\u00f5\3\2\2\2\u00f5\u00f7\7\23"+
		"\2\2\u00f6\u00f8\7\26\2\2\u00f7\u00f6\3\2\2\2\u00f7\u00f8\3\2\2\2\u00f8"+
		"\u00f9\3\2\2\2\u00f9\u00fb\7\5\2\2\u00fa\u00fc\7\26\2\2\u00fb\u00fa\3"+
		"\2\2\2\u00fb\u00fc\3\2\2\2\u00fc)\3\2\2\2\u00fd\u00ff\7\3\2\2\u00fe\u0100"+
		"\7\26\2\2\u00ff\u00fe\3\2\2\2\u00ff\u0100\3\2\2\2\u0100\u010f\3\2\2\2"+
		"\u0101\u010e\5(\25\2\u0102\u010e\5 \21\2\u0103\u010e\5\b\5\2\u0104\u010e"+
		"\5\n\6\2\u0105\u010e\5\16\b\2\u0106\u010e\5\f\7\2\u0107\u010e\5\20\t\2"+
		"\u0108\u010e\5\34\17\2\u0109\u010e\5$\23\2\u010a\u010e\5*\26\2\u010b\u010e"+
		"\5\"\22\2\u010c\u010e\5\36\20\2\u010d\u0101\3\2\2\2\u010d\u0102\3\2\2"+
		"\2\u010d\u0103\3\2\2\2\u010d\u0104\3\2\2\2\u010d\u0105\3\2\2\2\u010d\u0106"+
		"\3\2\2\2\u010d\u0107\3\2\2\2\u010d\u0108\3\2\2\2\u010d\u0109\3\2\2\2\u010d"+
		"\u010a\3\2\2\2\u010d\u010b\3\2\2\2\u010d\u010c\3\2\2\2\u010e\u0111\3\2"+
		"\2\2\u010f\u010d\3\2\2\2\u010f\u0110\3\2\2\2\u0110\u0112\3\2\2\2\u0111"+
		"\u010f\3\2\2\2\u0112\u0115\7\7\2\2\u0113\u0115\7\2\2\3\u0114\u00fd\3\2"+
		"\2\2\u0114\u0113\3\2\2\2\u0115+\3\2\2\2\u0116\u0118\7\26\2\2\u0117\u0116"+
		"\3\2\2\2\u0117\u0118\3\2\2\2\u0118\u0119\3\2\2\2\u0119\u011b\7\f\2\2\u011a"+
		"\u011c\7\26\2\2\u011b\u011a\3\2\2\2\u011b\u011c\3\2\2\2\u011c\u011d\3"+
		"\2\2\2\u011d\u011e\5*\26\2\u011e-\3\2\2\2\668<BFJNX\\`dhlptx|\u0080\u0084"+
		"\u0088\u008c\u0090\u0094\u009b\u009e\u00a2\u00a6\u00a9\u00ad\u00b4\u00b8"+
		"\u00bc\u00c0\u00c4\u00c8\u00ce\u00d2\u00d7\u00db\u00df\u00e2\u00e5\u00e9"+
		"\u00ed\u00f3\u00f7\u00fb\u00ff\u010d\u010f\u0114\u0117\u011b";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}