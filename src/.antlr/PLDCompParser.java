// Generated from /home/viceclone/Documents/pldcomp/src/PLDComp.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class PLDCompParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, RETURN=2, INT_TYPE=3, ID=4, INT=5, ASSIGN=6, SEMICOLON=7, RIGHT_BRACE=8, 
		LEFT_BRACE=9, LEFT_PARENTHESE=10, RIGHT_PARENTHESE=11, PLUS=12, MINUS=13, 
		STAR=14, DIV=15, MOD=16, WHITESPACE=17, NEWLINE=18, BLOCKCOMMENT=19, LINECOMMENT=20, 
		ERROR=21;
	public static final int
		RULE_prog = 0, RULE_functiondefinition = 1, RULE_statementseq = 2, RULE_statement = 3, 
		RULE_callstatement = 4, RULE_vardeclaration = 5, RULE_assignmentstat = 6, 
		RULE_returnstatement = 7, RULE_expr = 8, RULE_type = 9;
	public static final String[] ruleNames = {
		"prog", "functiondefinition", "statementseq", "statement", "callstatement", 
		"vardeclaration", "assignmentstat", "returnstatement", "expr", "type"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "','", "'return'", "'int'", null, null, "'='", "';'", "'}'", "'{'", 
		"'('", "')'", "'+'", "'-'", "'*'", "'/'", "'%'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, "RETURN", "INT_TYPE", "ID", "INT", "ASSIGN", "SEMICOLON", 
		"RIGHT_BRACE", "LEFT_BRACE", "LEFT_PARENTHESE", "RIGHT_PARENTHESE", "PLUS", 
		"MINUS", "STAR", "DIV", "MOD", "WHITESPACE", "NEWLINE", "BLOCKCOMMENT", 
		"LINECOMMENT", "ERROR"
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
	public String getGrammarFileName() { return "PLDComp.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public PLDCompParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(PLDCompParser.EOF, 0); }
		public List<FunctiondefinitionContext> functiondefinition() {
			return getRuleContexts(FunctiondefinitionContext.class);
		}
		public FunctiondefinitionContext functiondefinition(int i) {
			return getRuleContext(FunctiondefinitionContext.class,i);
		}
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(21); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(20);
				functiondefinition();
				}
				}
				setState(23); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==INT_TYPE );
			setState(25);
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

	public static class FunctiondefinitionContext extends ParserRuleContext {
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public List<TerminalNode> ID() { return getTokens(PLDCompParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(PLDCompParser.ID, i);
		}
		public StatementseqContext statementseq() {
			return getRuleContext(StatementseqContext.class,0);
		}
		public FunctiondefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functiondefinition; }
	}

	public final FunctiondefinitionContext functiondefinition() throws RecognitionException {
		FunctiondefinitionContext _localctx = new FunctiondefinitionContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_functiondefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(27);
			type();
			setState(28);
			match(ID);
			setState(29);
			match(LEFT_PARENTHESE);
			setState(41);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==INT_TYPE) {
				{
				setState(30);
				type();
				setState(31);
				match(ID);
				setState(38);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__0) {
					{
					{
					setState(32);
					match(T__0);
					setState(33);
					type();
					setState(34);
					match(ID);
					}
					}
					setState(40);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(43);
			match(RIGHT_PARENTHESE);
			setState(44);
			match(LEFT_BRACE);
			setState(45);
			statementseq();
			setState(46);
			match(RIGHT_BRACE);
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

	public static class StatementseqContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public StatementseqContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statementseq; }
	}

	public final StatementseqContext statementseq() throws RecognitionException {
		StatementseqContext _localctx = new StatementseqContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_statementseq);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(49); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(48);
				statement();
				}
				}
				setState(51); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << RETURN) | (1L << INT_TYPE) | (1L << ID))) != 0) );
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

	public static class StatementContext extends ParserRuleContext {
		public VardeclarationContext vardeclaration() {
			return getRuleContext(VardeclarationContext.class,0);
		}
		public CallstatementContext callstatement() {
			return getRuleContext(CallstatementContext.class,0);
		}
		public ReturnstatementContext returnstatement() {
			return getRuleContext(ReturnstatementContext.class,0);
		}
		public AssignmentstatContext assignmentstat() {
			return getRuleContext(AssignmentstatContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_statement);
		try {
			setState(57);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(53);
				vardeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(54);
				callstatement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(55);
				returnstatement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(56);
				assignmentstat();
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

	public static class CallstatementContext extends ParserRuleContext {
		public CallstatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_callstatement; }
	 
		public CallstatementContext() { }
		public void copyFrom(CallstatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class CallNoParamsContext extends CallstatementContext {
		public TerminalNode ID() { return getToken(PLDCompParser.ID, 0); }
		public CallNoParamsContext(CallstatementContext ctx) { copyFrom(ctx); }
	}
	public static class CallWithParamsContext extends CallstatementContext {
		public TerminalNode ID() { return getToken(PLDCompParser.ID, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public CallWithParamsContext(CallstatementContext ctx) { copyFrom(ctx); }
	}

	public final CallstatementContext callstatement() throws RecognitionException {
		CallstatementContext _localctx = new CallstatementContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_callstatement);
		int _la;
		try {
			setState(76);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				_localctx = new CallNoParamsContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(59);
				match(ID);
				setState(60);
				match(LEFT_PARENTHESE);
				setState(61);
				match(RIGHT_PARENTHESE);
				setState(62);
				match(SEMICOLON);
				}
				break;
			case 2:
				_localctx = new CallWithParamsContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(63);
				match(ID);
				setState(64);
				match(LEFT_PARENTHESE);
				setState(65);
				expr(0);
				setState(70);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__0) {
					{
					{
					setState(66);
					match(T__0);
					setState(67);
					expr(0);
					}
					}
					setState(72);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(73);
				match(RIGHT_PARENTHESE);
				setState(74);
				match(SEMICOLON);
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

	public static class VardeclarationContext extends ParserRuleContext {
		public VardeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vardeclaration; }
	 
		public VardeclarationContext() { }
		public void copyFrom(VardeclarationContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class DeclWithoutAssignmentContext extends VardeclarationContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(PLDCompParser.ID, 0); }
		public DeclWithoutAssignmentContext(VardeclarationContext ctx) { copyFrom(ctx); }
	}
	public static class DeclWithAssignmentContext extends VardeclarationContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(PLDCompParser.ID, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public DeclWithAssignmentContext(VardeclarationContext ctx) { copyFrom(ctx); }
	}

	public final VardeclarationContext vardeclaration() throws RecognitionException {
		VardeclarationContext _localctx = new VardeclarationContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_vardeclaration);
		try {
			setState(88);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				_localctx = new DeclWithAssignmentContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(78);
				type();
				setState(79);
				match(ID);
				setState(80);
				match(ASSIGN);
				setState(81);
				expr(0);
				setState(82);
				match(SEMICOLON);
				}
				break;
			case 2:
				_localctx = new DeclWithoutAssignmentContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(84);
				type();
				setState(85);
				match(ID);
				setState(86);
				match(SEMICOLON);
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

	public static class AssignmentstatContext extends ParserRuleContext {
		public AssignmentstatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignmentstat; }
	 
		public AssignmentstatContext() { }
		public void copyFrom(AssignmentstatContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class AssignmentExprContext extends AssignmentstatContext {
		public TerminalNode ID() { return getToken(PLDCompParser.ID, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public AssignmentExprContext(AssignmentstatContext ctx) { copyFrom(ctx); }
	}

	public final AssignmentstatContext assignmentstat() throws RecognitionException {
		AssignmentstatContext _localctx = new AssignmentstatContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_assignmentstat);
		try {
			_localctx = new AssignmentExprContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(90);
			match(ID);
			setState(91);
			match(ASSIGN);
			setState(92);
			expr(0);
			setState(93);
			match(SEMICOLON);
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

	public static class ReturnstatementContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ReturnstatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnstatement; }
	}

	public final ReturnstatementContext returnstatement() throws RecognitionException {
		ReturnstatementContext _localctx = new ReturnstatementContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_returnstatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(95);
			match(RETURN);
			setState(96);
			expr(0);
			setState(97);
			match(SEMICOLON);
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
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	 
		public ExprContext() { }
		public void copyFrom(ExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ParContext extends ExprContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ParContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class VarContext extends ExprContext {
		public TerminalNode ID() { return getToken(PLDCompParser.ID, 0); }
		public VarContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class MultiplicativeOpContext extends ExprContext {
		public Token op;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public MultiplicativeOpContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class ConstContext extends ExprContext {
		public TerminalNode INT() { return getToken(PLDCompParser.INT, 0); }
		public ConstContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class AdditiveOpContext extends ExprContext {
		public Token op;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public AdditiveOpContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class NegExprContext extends ExprContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public NegExprContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class NegConstContext extends ExprContext {
		public TerminalNode INT() { return getToken(PLDCompParser.INT, 0); }
		public NegConstContext(ExprContext ctx) { copyFrom(ctx); }
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 16;
		enterRecursionRule(_localctx, 16, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(118);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				{
				_localctx = new ParContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(100);
				match(LEFT_PARENTHESE);
				setState(101);
				expr(0);
				setState(102);
				match(RIGHT_PARENTHESE);
				}
				break;
			case 2:
				{
				_localctx = new NegExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(104);
				match(MINUS);
				setState(105);
				match(LEFT_PARENTHESE);
				setState(106);
				expr(0);
				setState(107);
				match(RIGHT_PARENTHESE);
				}
				break;
			case 3:
				{
				_localctx = new ConstContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(109);
				match(INT);
				}
				break;
			case 4:
				{
				_localctx = new NegConstContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(110);
				match(MINUS);
				setState(111);
				match(INT);
				}
				break;
			case 5:
				{
				_localctx = new NegExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(112);
				match(MINUS);
				setState(113);
				match(LEFT_PARENTHESE);
				setState(114);
				expr(0);
				setState(115);
				match(RIGHT_PARENTHESE);
				}
				break;
			case 6:
				{
				_localctx = new VarContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(117);
				match(ID);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(128);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(126);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
					case 1:
						{
						_localctx = new MultiplicativeOpContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(120);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(121);
						((MultiplicativeOpContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << STAR) | (1L << DIV) | (1L << MOD))) != 0)) ) {
							((MultiplicativeOpContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(122);
						expr(7);
						}
						break;
					case 2:
						{
						_localctx = new AdditiveOpContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(123);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(124);
						((AdditiveOpContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==PLUS || _la==MINUS) ) {
							((AdditiveOpContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(125);
						expr(6);
						}
						break;
					}
					} 
				}
				setState(130);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class TypeContext extends ParserRuleContext {
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(131);
			match(INT_TYPE);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 8:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 6);
		case 1:
			return precpred(_ctx, 5);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\27\u0088\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\3\2\6\2\30\n\2\r\2\16\2\31\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\7\3\'\n\3\f\3\16\3*\13\3\5\3,\n\3\3\3\3\3\3\3\3\3\3\3\3\4\6\4\64"+
		"\n\4\r\4\16\4\65\3\5\3\5\3\5\3\5\5\5<\n\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\7\6G\n\6\f\6\16\6J\13\6\3\6\3\6\3\6\5\6O\n\6\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\5\7[\n\7\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\5\ny\n\n\3\n\3\n\3\n\3\n\3\n\3\n\7\n\u0081\n\n\f\n\16\n\u0084\13"+
		"\n\3\13\3\13\3\13\2\3\22\f\2\4\6\b\n\f\16\20\22\24\2\4\3\2\20\22\3\2\16"+
		"\17\2\u008e\2\27\3\2\2\2\4\35\3\2\2\2\6\63\3\2\2\2\b;\3\2\2\2\nN\3\2\2"+
		"\2\fZ\3\2\2\2\16\\\3\2\2\2\20a\3\2\2\2\22x\3\2\2\2\24\u0085\3\2\2\2\26"+
		"\30\5\4\3\2\27\26\3\2\2\2\30\31\3\2\2\2\31\27\3\2\2\2\31\32\3\2\2\2\32"+
		"\33\3\2\2\2\33\34\7\2\2\3\34\3\3\2\2\2\35\36\5\24\13\2\36\37\7\6\2\2\37"+
		"+\7\f\2\2 !\5\24\13\2!(\7\6\2\2\"#\7\3\2\2#$\5\24\13\2$%\7\6\2\2%\'\3"+
		"\2\2\2&\"\3\2\2\2\'*\3\2\2\2(&\3\2\2\2()\3\2\2\2),\3\2\2\2*(\3\2\2\2+"+
		" \3\2\2\2+,\3\2\2\2,-\3\2\2\2-.\7\r\2\2./\7\13\2\2/\60\5\6\4\2\60\61\7"+
		"\n\2\2\61\5\3\2\2\2\62\64\5\b\5\2\63\62\3\2\2\2\64\65\3\2\2\2\65\63\3"+
		"\2\2\2\65\66\3\2\2\2\66\7\3\2\2\2\67<\5\f\7\28<\5\n\6\29<\5\20\t\2:<\5"+
		"\16\b\2;\67\3\2\2\2;8\3\2\2\2;9\3\2\2\2;:\3\2\2\2<\t\3\2\2\2=>\7\6\2\2"+
		">?\7\f\2\2?@\7\r\2\2@O\7\t\2\2AB\7\6\2\2BC\7\f\2\2CH\5\22\n\2DE\7\3\2"+
		"\2EG\5\22\n\2FD\3\2\2\2GJ\3\2\2\2HF\3\2\2\2HI\3\2\2\2IK\3\2\2\2JH\3\2"+
		"\2\2KL\7\r\2\2LM\7\t\2\2MO\3\2\2\2N=\3\2\2\2NA\3\2\2\2O\13\3\2\2\2PQ\5"+
		"\24\13\2QR\7\6\2\2RS\7\b\2\2ST\5\22\n\2TU\7\t\2\2U[\3\2\2\2VW\5\24\13"+
		"\2WX\7\6\2\2XY\7\t\2\2Y[\3\2\2\2ZP\3\2\2\2ZV\3\2\2\2[\r\3\2\2\2\\]\7\6"+
		"\2\2]^\7\b\2\2^_\5\22\n\2_`\7\t\2\2`\17\3\2\2\2ab\7\4\2\2bc\5\22\n\2c"+
		"d\7\t\2\2d\21\3\2\2\2ef\b\n\1\2fg\7\f\2\2gh\5\22\n\2hi\7\r\2\2iy\3\2\2"+
		"\2jk\7\17\2\2kl\7\f\2\2lm\5\22\n\2mn\7\r\2\2ny\3\2\2\2oy\7\7\2\2pq\7\17"+
		"\2\2qy\7\7\2\2rs\7\17\2\2st\7\f\2\2tu\5\22\n\2uv\7\r\2\2vy\3\2\2\2wy\7"+
		"\6\2\2xe\3\2\2\2xj\3\2\2\2xo\3\2\2\2xp\3\2\2\2xr\3\2\2\2xw\3\2\2\2y\u0082"+
		"\3\2\2\2z{\f\b\2\2{|\t\2\2\2|\u0081\5\22\n\t}~\f\7\2\2~\177\t\3\2\2\177"+
		"\u0081\5\22\n\b\u0080z\3\2\2\2\u0080}\3\2\2\2\u0081\u0084\3\2\2\2\u0082"+
		"\u0080\3\2\2\2\u0082\u0083\3\2\2\2\u0083\23\3\2\2\2\u0084\u0082\3\2\2"+
		"\2\u0085\u0086\7\5\2\2\u0086\25\3\2\2\2\r\31(+\65;HNZx\u0080\u0082";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}