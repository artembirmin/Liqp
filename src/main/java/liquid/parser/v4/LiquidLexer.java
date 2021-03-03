package liquid.parser.v4;// Generated from C:/Users/petra/IdeaProjects/Liqp/src/main/antlr4/liquid/parser/v4\LiquidLexer.g4 by ANTLR 4.9.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class LiquidLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		OutStart=1, TagStart=2, Other=3, OutStart2=4, TagStart2=5, OutEnd=6, TagEnd=7, 
		Str=8, DotDot=9, Dot=10, NEq=11, Eq=12, EqSign=13, GtEq=14, Gt=15, LtEq=16, 
		Lt=17, Minus=18, Pipe=19, Col=20, Comma=21, OPar=22, CPar=23, OBr=24, 
		CBr=25, QMark=26, PathSep=27, DoubleNum=28, LongNum=29, WS=30, CaptureStart=31, 
		CaptureEnd=32, CommentStart=33, CommentEnd=34, RawStart=35, IfStart=36, 
		Elsif=37, IfEnd=38, UnlessStart=39, UnlessEnd=40, Else=41, Contains=42, 
		CaseStart=43, CaseEnd=44, When=45, Cycle=46, ForStart=47, ForEnd=48, In=49, 
		And=50, Or=51, TableStart=52, TableEnd=53, Assign=54, True=55, False=56, 
		Nil=57, Include=58, With=59, Offset=60, Continue=61, Reversed=62, Empty=63, 
		Blank=64, EndId=65, Id=66, RawEnd=67, OtherRaw=68;
	public static final int
		IN_TAG=1, IN_RAW=2;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE", "IN_TAG", "IN_RAW"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"OutStart", "TagStart", "Other", "SStr", "DStr", "WhitespaceChar", "SpaceOrTab", 
			"LineBreak", "Letter", "Digit", "OutStart2", "TagStart2", "OutEnd", "TagEnd", 
			"Str", "DotDot", "Dot", "NEq", "Eq", "EqSign", "GtEq", "Gt", "LtEq", 
			"Lt", "Minus", "Pipe", "Col", "Comma", "OPar", "CPar", "OBr", "CBr", 
			"QMark", "PathSep", "DoubleNum", "LongNum", "WS", "CaptureStart", "CaptureEnd", 
			"CommentStart", "CommentEnd", "RawStart", "IfStart", "Elsif", "IfEnd", 
			"UnlessStart", "UnlessEnd", "Else", "Contains", "CaseStart", "CaseEnd", 
			"When", "Cycle", "ForStart", "ForEnd", "In", "And", "Or", "TableStart", 
			"TableEnd", "Assign", "True", "False", "Nil", "Include", "With", "Offset", 
			"Continue", "Reversed", "Empty", "Blank", "EndId", "Id", "RawEnd", "OtherRaw"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, "'{{'", "'{%'", null, null, null, "'..'", "'.'", 
			null, "'=='", "'='", "'>='", "'>'", "'<='", "'<'", "'-'", "'|'", "':'", 
			"','", "'('", "')'", "'['", "']'", "'?'", null, null, null, null, "'capture'", 
			"'endcapture'", "'comment'", "'endcomment'", null, "'if'", "'elsif'", 
			"'endif'", "'unless'", "'endunless'", "'else'", "'contains'", "'case'", 
			"'endcase'", "'when'", "'cycle'", "'for'", "'endfor'", "'in'", "'and'", 
			"'or'", "'tablerow'", "'endtablerow'", "'assign'", "'true'", "'false'", 
			null, "'include'", "'with'", "'offset'", "'continue'", "'reversed'", 
			"'empty'", "'blank'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "OutStart", "TagStart", "Other", "OutStart2", "TagStart2", "OutEnd", 
			"TagEnd", "Str", "DotDot", "Dot", "NEq", "Eq", "EqSign", "GtEq", "Gt", 
			"LtEq", "Lt", "Minus", "Pipe", "Col", "Comma", "OPar", "CPar", "OBr", 
			"CBr", "QMark", "PathSep", "DoubleNum", "LongNum", "WS", "CaptureStart", 
			"CaptureEnd", "CommentStart", "CommentEnd", "RawStart", "IfStart", "Elsif", 
			"IfEnd", "UnlessStart", "UnlessEnd", "Else", "Contains", "CaseStart", 
			"CaseEnd", "When", "Cycle", "ForStart", "ForEnd", "In", "And", "Or", 
			"TableStart", "TableEnd", "Assign", "True", "False", "Nil", "Include", 
			"With", "Offset", "Continue", "Reversed", "Empty", "Blank", "EndId", 
			"Id", "RawEnd", "OtherRaw"
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


	  private boolean stripSpacesAroundTags = false;
	  private boolean stripSingleLine = false;

	  public LiquidLexer(CharStream charStream, boolean stripSpacesAroundTags) {
	    this(charStream, stripSpacesAroundTags, false);
	  }

	  public LiquidLexer(CharStream charStream, boolean stripSpacesAroundTags, boolean stripSingleLine) {
	      this(charStream);
	      this.stripSpacesAroundTags = stripSpacesAroundTags;
	      this.stripSingleLine = stripSingleLine;
	    }


	public LiquidLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "LiquidLexer.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	@Override
	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 0:
			return OutStart_sempred((RuleContext)_localctx, predIndex);
		case 1:
			return TagStart_sempred((RuleContext)_localctx, predIndex);
		case 12:
			return OutEnd_sempred((RuleContext)_localctx, predIndex);
		case 13:
			return TagEnd_sempred((RuleContext)_localctx, predIndex);
		case 34:
			return DoubleNum_sempred((RuleContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean OutStart_sempred(RuleContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return stripSpacesAroundTags && stripSingleLine;
		case 1:
			return stripSpacesAroundTags && !stripSingleLine;
		}
		return true;
	}
	private boolean TagStart_sempred(RuleContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return stripSpacesAroundTags && stripSingleLine;
		case 3:
			return stripSpacesAroundTags && !stripSingleLine;
		}
		return true;
	}
	private boolean OutEnd_sempred(RuleContext _localctx, int predIndex) {
		switch (predIndex) {
		case 4:
			return stripSpacesAroundTags && stripSingleLine;
		case 5:
			return stripSpacesAroundTags && !stripSingleLine;
		}
		return true;
	}
	private boolean TagEnd_sempred(RuleContext _localctx, int predIndex) {
		switch (predIndex) {
		case 6:
			return stripSpacesAroundTags && stripSingleLine;
		case 7:
			return stripSpacesAroundTags && !stripSingleLine;
		}
		return true;
	}
	private boolean DoubleNum_sempred(RuleContext _localctx, int predIndex) {
		switch (predIndex) {
		case 8:
			return _input.LA(1) != '.';
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2F\u02d0\b\1\b\1\b"+
		"\1\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n"+
		"\t\n\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21"+
		"\4\22\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30"+
		"\4\31\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37"+
		"\4 \t \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t"+
		"*\4+\t+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63"+
		"\4\64\t\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t"+
		"<\4=\t=\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4"+
		"H\tH\4I\tI\4J\tJ\4K\tK\4L\tL\3\2\7\2\u009d\n\2\f\2\16\2\u00a0\13\2\3\2"+
		"\3\2\3\2\3\2\3\2\7\2\u00a7\n\2\f\2\16\2\u00aa\13\2\3\2\3\2\3\2\3\2\3\2"+
		"\7\2\u00b1\n\2\f\2\16\2\u00b4\13\2\3\2\3\2\3\2\3\2\3\2\5\2\u00bb\n\2\3"+
		"\2\3\2\3\3\7\3\u00c0\n\3\f\3\16\3\u00c3\13\3\3\3\3\3\3\3\3\3\3\3\7\3\u00ca"+
		"\n\3\f\3\16\3\u00cd\13\3\3\3\3\3\3\3\3\3\3\3\7\3\u00d4\n\3\f\3\16\3\u00d7"+
		"\13\3\3\3\3\3\3\3\3\3\3\3\5\3\u00de\n\3\3\3\3\3\3\4\3\4\3\5\3\5\7\5\u00e6"+
		"\n\5\f\5\16\5\u00e9\13\5\3\5\3\5\3\6\3\6\7\6\u00ef\n\6\f\6\16\6\u00f2"+
		"\13\6\3\6\3\6\3\7\3\7\3\b\3\b\3\t\5\t\u00fb\n\t\3\t\3\t\5\t\u00ff\n\t"+
		"\3\n\3\n\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3"+
		"\16\3\16\7\16\u0113\n\16\f\16\16\16\u0116\13\16\3\16\5\16\u0119\n\16\3"+
		"\16\3\16\3\16\3\16\3\16\7\16\u0120\n\16\f\16\16\16\u0123\13\16\3\16\3"+
		"\16\3\16\3\16\3\16\3\16\7\16\u012b\n\16\f\16\16\16\u012e\13\16\3\16\3"+
		"\16\5\16\u0132\n\16\3\16\3\16\3\17\3\17\3\17\3\17\7\17\u013a\n\17\f\17"+
		"\16\17\u013d\13\17\3\17\5\17\u0140\n\17\3\17\3\17\3\17\3\17\3\17\7\17"+
		"\u0147\n\17\f\17\16\17\u014a\13\17\3\17\3\17\3\17\3\17\3\17\3\17\7\17"+
		"\u0152\n\17\f\17\16\17\u0155\13\17\3\17\3\17\5\17\u0159\n\17\3\17\3\17"+
		"\3\20\3\20\5\20\u015f\n\20\3\21\3\21\3\21\3\22\3\22\3\23\3\23\3\23\3\23"+
		"\5\23\u016a\n\23\3\24\3\24\3\24\3\25\3\25\3\26\3\26\3\26\3\27\3\27\3\30"+
		"\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34\3\35\3\35\3\36\3\36"+
		"\3\37\3\37\3 \3 \3!\3!\3\"\3\"\3#\3#\3$\5$\u0190\n$\3$\6$\u0193\n$\r$"+
		"\16$\u0194\3$\3$\6$\u0199\n$\r$\16$\u019a\3$\5$\u019e\n$\3$\6$\u01a1\n"+
		"$\r$\16$\u01a2\3$\3$\3$\5$\u01a8\n$\3%\5%\u01ab\n%\3%\6%\u01ae\n%\r%\16"+
		"%\u01af\3&\6&\u01b3\n&\r&\16&\u01b4\3&\3&\3\'\3\'\3\'\3\'\3\'\3\'\3\'"+
		"\3\'\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3)\3)\3)\3)\3)\3)\3)\3)\3*\3*\3"+
		"*\3*\3*\3*\3*\3*\3*\3*\3*\3+\3+\3+\3+\3+\7+\u01e4\n+\f+\16+\u01e7\13+"+
		"\3+\3+\3+\3+\3+\3,\3,\3,\3-\3-\3-\3-\3-\3-\3.\3.\3.\3.\3.\3.\3/\3/\3/"+
		"\3/\3/\3/\3/\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\61\3"+
		"\61\3\61\3\61\3\61\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\63\3"+
		"\63\3\63\3\63\3\63\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\65\3\65\3"+
		"\65\3\65\3\65\3\66\3\66\3\66\3\66\3\66\3\66\3\67\3\67\3\67\3\67\38\38"+
		"\38\38\38\38\38\39\39\39\3:\3:\3:\3:\3;\3;\3;\3<\3<\3<\3<\3<\3<\3<\3<"+
		"\3<\3=\3=\3=\3=\3=\3=\3=\3=\3=\3=\3=\3=\3>\3>\3>\3>\3>\3>\3>\3?\3?\3?"+
		"\3?\3?\3@\3@\3@\3@\3@\3@\3A\3A\3A\3A\3A\3A\3A\5A\u0277\nA\3B\3B\3B\3B"+
		"\3B\3B\3B\3B\3C\3C\3C\3C\3C\3D\3D\3D\3D\3D\3D\3D\3E\3E\3E\3E\3E\3E\3E"+
		"\3E\3E\3F\3F\3F\3F\3F\3F\3F\3F\3F\3G\3G\3G\3G\3G\3G\3H\3H\3H\3H\3H\3H"+
		"\3I\3I\3I\3I\3I\3I\3J\3J\5J\u02b3\nJ\3J\3J\3J\7J\u02b8\nJ\fJ\16J\u02bb"+
		"\13J\3K\3K\3K\3K\7K\u02c1\nK\fK\16K\u02c4\13K\3K\3K\3K\3K\3K\3K\3K\3K"+
		"\3K\3L\3L\2\2M\5\3\7\4\t\5\13\2\r\2\17\2\21\2\23\2\25\2\27\2\31\6\33\7"+
		"\35\b\37\t!\n#\13%\f\'\r)\16+\17-\20/\21\61\22\63\23\65\24\67\259\26;"+
		"\27=\30?\31A\32C\33E\34G\35I\36K\37M O!Q\"S#U$W%Y&[\'](_)a*c+e,g-i.k/"+
		"m\60o\61q\62s\63u\64w\65y\66{\67}8\1779\u0081:\u0083;\u0085<\u0087=\u0089"+
		">\u008b?\u008d@\u008fA\u0091B\u0093C\u0095D\u0097E\u0099F\5\2\3\4\n\3"+
		"\2))\3\2$$\5\2\13\f\17\17\"\"\4\2\13\13\"\"\4\2C\\c|\3\2\62;\4\2\61\61"+
		"^^\4\2//aa\2\u02f6\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\3\31\3\2\2\2\3"+
		"\33\3\2\2\2\3\35\3\2\2\2\3\37\3\2\2\2\3!\3\2\2\2\3#\3\2\2\2\3%\3\2\2\2"+
		"\3\'\3\2\2\2\3)\3\2\2\2\3+\3\2\2\2\3-\3\2\2\2\3/\3\2\2\2\3\61\3\2\2\2"+
		"\3\63\3\2\2\2\3\65\3\2\2\2\3\67\3\2\2\2\39\3\2\2\2\3;\3\2\2\2\3=\3\2\2"+
		"\2\3?\3\2\2\2\3A\3\2\2\2\3C\3\2\2\2\3E\3\2\2\2\3G\3\2\2\2\3I\3\2\2\2\3"+
		"K\3\2\2\2\3M\3\2\2\2\3O\3\2\2\2\3Q\3\2\2\2\3S\3\2\2\2\3U\3\2\2\2\3W\3"+
		"\2\2\2\3Y\3\2\2\2\3[\3\2\2\2\3]\3\2\2\2\3_\3\2\2\2\3a\3\2\2\2\3c\3\2\2"+
		"\2\3e\3\2\2\2\3g\3\2\2\2\3i\3\2\2\2\3k\3\2\2\2\3m\3\2\2\2\3o\3\2\2\2\3"+
		"q\3\2\2\2\3s\3\2\2\2\3u\3\2\2\2\3w\3\2\2\2\3y\3\2\2\2\3{\3\2\2\2\3}\3"+
		"\2\2\2\3\177\3\2\2\2\3\u0081\3\2\2\2\3\u0083\3\2\2\2\3\u0085\3\2\2\2\3"+
		"\u0087\3\2\2\2\3\u0089\3\2\2\2\3\u008b\3\2\2\2\3\u008d\3\2\2\2\3\u008f"+
		"\3\2\2\2\3\u0091\3\2\2\2\3\u0093\3\2\2\2\3\u0095\3\2\2\2\4\u0097\3\2\2"+
		"\2\4\u0099\3\2\2\2\5\u00ba\3\2\2\2\7\u00dd\3\2\2\2\t\u00e1\3\2\2\2\13"+
		"\u00e3\3\2\2\2\r\u00ec\3\2\2\2\17\u00f5\3\2\2\2\21\u00f7\3\2\2\2\23\u00fe"+
		"\3\2\2\2\25\u0100\3\2\2\2\27\u0102\3\2\2\2\31\u0104\3\2\2\2\33\u0109\3"+
		"\2\2\2\35\u0131\3\2\2\2\37\u0158\3\2\2\2!\u015e\3\2\2\2#\u0160\3\2\2\2"+
		"%\u0163\3\2\2\2\'\u0169\3\2\2\2)\u016b\3\2\2\2+\u016e\3\2\2\2-\u0170\3"+
		"\2\2\2/\u0173\3\2\2\2\61\u0175\3\2\2\2\63\u0178\3\2\2\2\65\u017a\3\2\2"+
		"\2\67\u017c\3\2\2\29\u017e\3\2\2\2;\u0180\3\2\2\2=\u0182\3\2\2\2?\u0184"+
		"\3\2\2\2A\u0186\3\2\2\2C\u0188\3\2\2\2E\u018a\3\2\2\2G\u018c\3\2\2\2I"+
		"\u01a7\3\2\2\2K\u01aa\3\2\2\2M\u01b2\3\2\2\2O\u01b8\3\2\2\2Q\u01c0\3\2"+
		"\2\2S\u01cb\3\2\2\2U\u01d3\3\2\2\2W\u01de\3\2\2\2Y\u01ed\3\2\2\2[\u01f0"+
		"\3\2\2\2]\u01f6\3\2\2\2_\u01fc\3\2\2\2a\u0203\3\2\2\2c\u020d\3\2\2\2e"+
		"\u0212\3\2\2\2g\u021b\3\2\2\2i\u0220\3\2\2\2k\u0228\3\2\2\2m\u022d\3\2"+
		"\2\2o\u0233\3\2\2\2q\u0237\3\2\2\2s\u023e\3\2\2\2u\u0241\3\2\2\2w\u0245"+
		"\3\2\2\2y\u0248\3\2\2\2{\u0251\3\2\2\2}\u025d\3\2\2\2\177\u0264\3\2\2"+
		"\2\u0081\u0269\3\2\2\2\u0083\u0276\3\2\2\2\u0085\u0278\3\2\2\2\u0087\u0280"+
		"\3\2\2\2\u0089\u0285\3\2\2\2\u008b\u028c\3\2\2\2\u008d\u0295\3\2\2\2\u008f"+
		"\u029e\3\2\2\2\u0091\u02a4\3\2\2\2\u0093\u02aa\3\2\2\2\u0095\u02b2\3\2"+
		"\2\2\u0097\u02bc\3\2\2\2\u0099\u02ce\3\2\2\2\u009b\u009d\5\21\b\2\u009c"+
		"\u009b\3\2\2\2\u009d\u00a0\3\2\2\2\u009e\u009c\3\2\2\2\u009e\u009f\3\2"+
		"\2\2\u009f\u00a1\3\2\2\2\u00a0\u009e\3\2\2\2\u00a1\u00a2\7}\2\2\u00a2"+
		"\u00a3\7}\2\2\u00a3\u00a4\3\2\2\2\u00a4\u00bb\6\2\2\2\u00a5\u00a7\5\17"+
		"\7\2\u00a6\u00a5\3\2\2\2\u00a7\u00aa\3\2\2\2\u00a8\u00a6\3\2\2\2\u00a8"+
		"\u00a9\3\2\2\2\u00a9\u00ab\3\2\2\2\u00aa\u00a8\3\2\2\2\u00ab\u00ac\7}"+
		"\2\2\u00ac\u00ad\7}\2\2\u00ad\u00ae\3\2\2\2\u00ae\u00bb\6\2\3\2\u00af"+
		"\u00b1\5\17\7\2\u00b0\u00af\3\2\2\2\u00b1\u00b4\3\2\2\2\u00b2\u00b0\3"+
		"\2\2\2\u00b2\u00b3\3\2\2\2\u00b3\u00b5\3\2\2\2\u00b4\u00b2\3\2\2\2\u00b5"+
		"\u00b6\7}\2\2\u00b6\u00b7\7}\2\2\u00b7\u00bb\7/\2\2\u00b8\u00b9\7}\2\2"+
		"\u00b9\u00bb\7}\2\2\u00ba\u009e\3\2\2\2\u00ba\u00a8\3\2\2\2\u00ba\u00b2"+
		"\3\2\2\2\u00ba\u00b8\3\2\2\2\u00bb\u00bc\3\2\2\2\u00bc\u00bd\b\2\2\2\u00bd"+
		"\6\3\2\2\2\u00be\u00c0\5\21\b\2\u00bf\u00be\3\2\2\2\u00c0\u00c3\3\2\2"+
		"\2\u00c1\u00bf\3\2\2\2\u00c1\u00c2\3\2\2\2\u00c2\u00c4\3\2\2\2\u00c3\u00c1"+
		"\3\2\2\2\u00c4\u00c5\7}\2\2\u00c5\u00c6\7\'\2\2\u00c6\u00c7\3\2\2\2\u00c7"+
		"\u00de\6\3\4\2\u00c8\u00ca\5\17\7\2\u00c9\u00c8\3\2\2\2\u00ca\u00cd\3"+
		"\2\2\2\u00cb\u00c9\3\2\2\2\u00cb\u00cc\3\2\2\2\u00cc\u00ce\3\2\2\2\u00cd"+
		"\u00cb\3\2\2\2\u00ce\u00cf\7}\2\2\u00cf\u00d0\7\'\2\2\u00d0\u00d1\3\2"+
		"\2\2\u00d1\u00de\6\3\5\2\u00d2\u00d4\5\17\7\2\u00d3\u00d2\3\2\2\2\u00d4"+
		"\u00d7\3\2\2\2\u00d5\u00d3\3\2\2\2\u00d5\u00d6\3\2\2\2\u00d6\u00d8\3\2"+
		"\2\2\u00d7\u00d5\3\2\2\2\u00d8\u00d9\7}\2\2\u00d9\u00da\7\'\2\2\u00da"+
		"\u00de\7/\2\2\u00db\u00dc\7}\2\2\u00dc\u00de\7\'\2\2\u00dd\u00c1\3\2\2"+
		"\2\u00dd\u00cb\3\2\2\2\u00dd\u00d5\3\2\2\2\u00dd\u00db\3\2\2\2\u00de\u00df"+
		"\3\2\2\2\u00df\u00e0\b\3\2\2\u00e0\b\3\2\2\2\u00e1\u00e2\13\2\2\2\u00e2"+
		"\n\3\2\2\2\u00e3\u00e7\7)\2\2\u00e4\u00e6\n\2\2\2\u00e5\u00e4\3\2\2\2"+
		"\u00e6\u00e9\3\2\2\2\u00e7\u00e5\3\2\2\2\u00e7\u00e8\3\2\2\2\u00e8\u00ea"+
		"\3\2\2\2\u00e9\u00e7\3\2\2\2\u00ea\u00eb\7)\2\2\u00eb\f\3\2\2\2\u00ec"+
		"\u00f0\7$\2\2\u00ed\u00ef\n\3\2\2\u00ee\u00ed\3\2\2\2\u00ef\u00f2\3\2"+
		"\2\2\u00f0\u00ee\3\2\2\2\u00f0\u00f1\3\2\2\2\u00f1\u00f3\3\2\2\2\u00f2"+
		"\u00f0\3\2\2\2\u00f3\u00f4\7$\2\2\u00f4\16\3\2\2\2\u00f5\u00f6\t\4\2\2"+
		"\u00f6\20\3\2\2\2\u00f7\u00f8\t\5\2\2\u00f8\22\3\2\2\2\u00f9\u00fb\7\17"+
		"\2\2\u00fa\u00f9\3\2\2\2\u00fa\u00fb\3\2\2\2\u00fb\u00fc\3\2\2\2\u00fc"+
		"\u00ff\7\f\2\2\u00fd\u00ff\7\17\2\2\u00fe\u00fa\3\2\2\2\u00fe\u00fd\3"+
		"\2\2\2\u00ff\24\3\2\2\2\u0100\u0101\t\6\2\2\u0101\26\3\2\2\2\u0102\u0103"+
		"\t\7\2\2\u0103\30\3\2\2\2\u0104\u0105\7}\2\2\u0105\u0106\7}\2\2\u0106"+
		"\u0107\3\2\2\2\u0107\u0108\b\f\2\2\u0108\32\3\2\2\2\u0109\u010a\7}\2\2"+
		"\u010a\u010b\7\'\2\2\u010b\u010c\3\2\2\2\u010c\u010d\b\r\2\2\u010d\34"+
		"\3\2\2\2\u010e\u010f\7\177\2\2\u010f\u0110\7\177\2\2\u0110\u0114\3\2\2"+
		"\2\u0111\u0113\5\21\b\2\u0112\u0111\3\2\2\2\u0113\u0116\3\2\2\2\u0114"+
		"\u0112\3\2\2\2\u0114\u0115\3\2\2\2\u0115\u0118\3\2\2\2\u0116\u0114\3\2"+
		"\2\2\u0117\u0119\5\23\t\2\u0118\u0117\3\2\2\2\u0118\u0119\3\2\2\2\u0119"+
		"\u011a\3\2\2\2\u011a\u0132\6\16\6\2\u011b\u011c\7\177\2\2\u011c\u011d"+
		"\7\177\2\2\u011d\u0121\3\2\2\2\u011e\u0120\5\17\7\2\u011f\u011e\3\2\2"+
		"\2\u0120\u0123\3\2\2\2\u0121\u011f\3\2\2\2\u0121\u0122\3\2\2\2\u0122\u0124"+
		"\3\2\2\2\u0123\u0121\3\2\2\2\u0124\u0132\6\16\7\2\u0125\u0126\7/\2\2\u0126"+
		"\u0127\7\177\2\2\u0127\u0128\7\177\2\2\u0128\u012c\3\2\2\2\u0129\u012b"+
		"\5\17\7\2\u012a\u0129\3\2\2\2\u012b\u012e\3\2\2\2\u012c\u012a\3\2\2\2"+
		"\u012c\u012d\3\2\2\2\u012d\u0132\3\2\2\2\u012e\u012c\3\2\2\2\u012f\u0130"+
		"\7\177\2\2\u0130\u0132\7\177\2\2\u0131\u010e\3\2\2\2\u0131\u011b\3\2\2"+
		"\2\u0131\u0125\3\2\2\2\u0131\u012f\3\2\2\2\u0132\u0133\3\2\2\2\u0133\u0134"+
		"\b\16\3\2\u0134\36\3\2\2\2\u0135\u0136\7\'\2\2\u0136\u0137\7\177\2\2\u0137"+
		"\u013b\3\2\2\2\u0138\u013a\5\21\b\2\u0139\u0138\3\2\2\2\u013a\u013d\3"+
		"\2\2\2\u013b\u0139\3\2\2\2\u013b\u013c\3\2\2\2\u013c\u013f\3\2\2\2\u013d"+
		"\u013b\3\2\2\2\u013e\u0140\5\23\t\2\u013f\u013e\3\2\2\2\u013f\u0140\3"+
		"\2\2\2\u0140\u0141\3\2\2\2\u0141\u0159\6\17\b\2\u0142\u0143\7\'\2\2\u0143"+
		"\u0144\7\177\2\2\u0144\u0148\3\2\2\2\u0145\u0147\5\17\7\2\u0146\u0145"+
		"\3\2\2\2\u0147\u014a\3\2\2\2\u0148\u0146\3\2\2\2\u0148\u0149\3\2\2\2\u0149"+
		"\u014b\3\2\2\2\u014a\u0148\3\2\2\2\u014b\u0159\6\17\t\2\u014c\u014d\7"+
		"/\2\2\u014d\u014e\7\'\2\2\u014e\u014f\7\177\2\2\u014f\u0153\3\2\2\2\u0150"+
		"\u0152\5\17\7\2\u0151\u0150\3\2\2\2\u0152\u0155\3\2\2\2\u0153\u0151\3"+
		"\2\2\2\u0153\u0154\3\2\2\2\u0154\u0159\3\2\2\2\u0155\u0153\3\2\2\2\u0156"+
		"\u0157\7\'\2\2\u0157\u0159\7\177\2\2\u0158\u0135\3\2\2\2\u0158\u0142\3"+
		"\2\2\2\u0158\u014c\3\2\2\2\u0158\u0156\3\2\2\2\u0159\u015a\3\2\2\2\u015a"+
		"\u015b\b\17\3\2\u015b \3\2\2\2\u015c\u015f\5\13\5\2\u015d\u015f\5\r\6"+
		"\2\u015e\u015c\3\2\2\2\u015e\u015d\3\2\2\2\u015f\"\3\2\2\2\u0160\u0161"+
		"\7\60\2\2\u0161\u0162\7\60\2\2\u0162$\3\2\2\2\u0163\u0164\7\60\2\2\u0164"+
		"&\3\2\2\2\u0165\u0166\7#\2\2\u0166\u016a\7?\2\2\u0167\u0168\7>\2\2\u0168"+
		"\u016a\7@\2\2\u0169\u0165\3\2\2\2\u0169\u0167\3\2\2\2\u016a(\3\2\2\2\u016b"+
		"\u016c\7?\2\2\u016c\u016d\7?\2\2\u016d*\3\2\2\2\u016e\u016f\7?\2\2\u016f"+
		",\3\2\2\2\u0170\u0171\7@\2\2\u0171\u0172\7?\2\2\u0172.\3\2\2\2\u0173\u0174"+
		"\7@\2\2\u0174\60\3\2\2\2\u0175\u0176\7>\2\2\u0176\u0177\7?\2\2\u0177\62"+
		"\3\2\2\2\u0178\u0179\7>\2\2\u0179\64\3\2\2\2\u017a\u017b\7/\2\2\u017b"+
		"\66\3\2\2\2\u017c\u017d\7~\2\2\u017d8\3\2\2\2\u017e\u017f\7<\2\2\u017f"+
		":\3\2\2\2\u0180\u0181\7.\2\2\u0181<\3\2\2\2\u0182\u0183\7*\2\2\u0183>"+
		"\3\2\2\2\u0184\u0185\7+\2\2\u0185@\3\2\2\2\u0186\u0187\7]\2\2\u0187B\3"+
		"\2\2\2\u0188\u0189\7_\2\2\u0189D\3\2\2\2\u018a\u018b\7A\2\2\u018bF\3\2"+
		"\2\2\u018c\u018d\t\b\2\2\u018dH\3\2\2\2\u018e\u0190\7/\2\2\u018f\u018e"+
		"\3\2\2\2\u018f\u0190\3\2\2\2\u0190\u0192\3\2\2\2\u0191\u0193\5\27\13\2"+
		"\u0192\u0191\3\2\2\2\u0193\u0194\3\2\2\2\u0194\u0192\3\2\2\2\u0194\u0195"+
		"\3\2\2\2\u0195\u0196\3\2\2\2\u0196\u0198\7\60\2\2\u0197\u0199\5\27\13"+
		"\2\u0198\u0197\3\2\2\2\u0199\u019a\3\2\2\2\u019a\u0198\3\2\2\2\u019a\u019b"+
		"\3\2\2\2\u019b\u01a8\3\2\2\2\u019c\u019e\7/\2\2\u019d\u019c\3\2\2\2\u019d"+
		"\u019e\3\2\2\2\u019e\u01a0\3\2\2\2\u019f\u01a1\5\27\13\2\u01a0\u019f\3"+
		"\2\2\2\u01a1\u01a2\3\2\2\2\u01a2\u01a0\3\2\2\2\u01a2\u01a3\3\2\2\2\u01a3"+
		"\u01a4\3\2\2\2\u01a4\u01a5\7\60\2\2\u01a5\u01a6\6$\n\2\u01a6\u01a8\3\2"+
		"\2\2\u01a7\u018f\3\2\2\2\u01a7\u019d\3\2\2\2\u01a8J\3\2\2\2\u01a9\u01ab"+
		"\7/\2\2\u01aa\u01a9\3\2\2\2\u01aa\u01ab\3\2\2\2\u01ab\u01ad\3\2\2\2\u01ac"+
		"\u01ae\5\27\13\2\u01ad\u01ac\3\2\2\2\u01ae\u01af\3\2\2\2\u01af\u01ad\3"+
		"\2\2\2\u01af\u01b0\3\2\2\2\u01b0L\3\2\2\2\u01b1\u01b3\5\17\7\2\u01b2\u01b1"+
		"\3\2\2\2\u01b3\u01b4\3\2\2\2\u01b4\u01b2\3\2\2\2\u01b4\u01b5\3\2\2\2\u01b5"+
		"\u01b6\3\2\2\2\u01b6\u01b7\b&\4\2\u01b7N\3\2\2\2\u01b8\u01b9\7e\2\2\u01b9"+
		"\u01ba\7c\2\2\u01ba\u01bb\7r\2\2\u01bb\u01bc\7v\2\2\u01bc\u01bd\7w\2\2"+
		"\u01bd\u01be\7t\2\2\u01be\u01bf\7g\2\2\u01bfP\3\2\2\2\u01c0\u01c1\7g\2"+
		"\2\u01c1\u01c2\7p\2\2\u01c2\u01c3\7f\2\2\u01c3\u01c4\7e\2\2\u01c4\u01c5"+
		"\7c\2\2\u01c5\u01c6\7r\2\2\u01c6\u01c7\7v\2\2\u01c7\u01c8\7w\2\2\u01c8"+
		"\u01c9\7t\2\2\u01c9\u01ca\7g\2\2\u01caR\3\2\2\2\u01cb\u01cc\7e\2\2\u01cc"+
		"\u01cd\7q\2\2\u01cd\u01ce\7o\2\2\u01ce\u01cf\7o\2\2\u01cf\u01d0\7g\2\2"+
		"\u01d0\u01d1\7p\2\2\u01d1\u01d2\7v\2\2\u01d2T\3\2\2\2\u01d3\u01d4\7g\2"+
		"\2\u01d4\u01d5\7p\2\2\u01d5\u01d6\7f\2\2\u01d6\u01d7\7e\2\2\u01d7\u01d8"+
		"\7q\2\2\u01d8\u01d9\7o\2\2\u01d9\u01da\7o\2\2\u01da\u01db\7g\2\2\u01db"+
		"\u01dc\7p\2\2\u01dc\u01dd\7v\2\2\u01ddV\3\2\2\2\u01de\u01df\7t\2\2\u01df"+
		"\u01e0\7c\2\2\u01e0\u01e1\7y\2\2\u01e1\u01e5\3\2\2\2\u01e2\u01e4\5\17"+
		"\7\2\u01e3\u01e2\3\2\2\2\u01e4\u01e7\3\2\2\2\u01e5\u01e3\3\2\2\2\u01e5"+
		"\u01e6\3\2\2\2\u01e6\u01e8\3\2\2\2\u01e7\u01e5\3\2\2\2\u01e8\u01e9\7\'"+
		"\2\2\u01e9\u01ea\7\177\2\2\u01ea\u01eb\3\2\2\2\u01eb\u01ec\b+\5\2\u01ec"+
		"X\3\2\2\2\u01ed\u01ee\7k\2\2\u01ee\u01ef\7h\2\2\u01efZ\3\2\2\2\u01f0\u01f1"+
		"\7g\2\2\u01f1\u01f2\7n\2\2\u01f2\u01f3\7u\2\2\u01f3\u01f4\7k\2\2\u01f4"+
		"\u01f5\7h\2\2\u01f5\\\3\2\2\2\u01f6\u01f7\7g\2\2\u01f7\u01f8\7p\2\2\u01f8"+
		"\u01f9\7f\2\2\u01f9\u01fa\7k\2\2\u01fa\u01fb\7h\2\2\u01fb^\3\2\2\2\u01fc"+
		"\u01fd\7w\2\2\u01fd\u01fe\7p\2\2\u01fe\u01ff\7n\2\2\u01ff\u0200\7g\2\2"+
		"\u0200\u0201\7u\2\2\u0201\u0202\7u\2\2\u0202`\3\2\2\2\u0203\u0204\7g\2"+
		"\2\u0204\u0205\7p\2\2\u0205\u0206\7f\2\2\u0206\u0207\7w\2\2\u0207\u0208"+
		"\7p\2\2\u0208\u0209\7n\2\2\u0209\u020a\7g\2\2\u020a\u020b\7u\2\2\u020b"+
		"\u020c\7u\2\2\u020cb\3\2\2\2\u020d\u020e\7g\2\2\u020e\u020f\7n\2\2\u020f"+
		"\u0210\7u\2\2\u0210\u0211\7g\2\2\u0211d\3\2\2\2\u0212\u0213\7e\2\2\u0213"+
		"\u0214\7q\2\2\u0214\u0215\7p\2\2\u0215\u0216\7v\2\2\u0216\u0217\7c\2\2"+
		"\u0217\u0218\7k\2\2\u0218\u0219\7p\2\2\u0219\u021a\7u\2\2\u021af\3\2\2"+
		"\2\u021b\u021c\7e\2\2\u021c\u021d\7c\2\2\u021d\u021e\7u\2\2\u021e\u021f"+
		"\7g\2\2\u021fh\3\2\2\2\u0220\u0221\7g\2\2\u0221\u0222\7p\2\2\u0222\u0223"+
		"\7f\2\2\u0223\u0224\7e\2\2\u0224\u0225\7c\2\2\u0225\u0226\7u\2\2\u0226"+
		"\u0227\7g\2\2\u0227j\3\2\2\2\u0228\u0229\7y\2\2\u0229\u022a\7j\2\2\u022a"+
		"\u022b\7g\2\2\u022b\u022c\7p\2\2\u022cl\3\2\2\2\u022d\u022e\7e\2\2\u022e"+
		"\u022f\7{\2\2\u022f\u0230\7e\2\2\u0230\u0231\7n\2\2\u0231\u0232\7g\2\2"+
		"\u0232n\3\2\2\2\u0233\u0234\7h\2\2\u0234\u0235\7q\2\2\u0235\u0236\7t\2"+
		"\2\u0236p\3\2\2\2\u0237\u0238\7g\2\2\u0238\u0239\7p\2\2\u0239\u023a\7"+
		"f\2\2\u023a\u023b\7h\2\2\u023b\u023c\7q\2\2\u023c\u023d\7t\2\2\u023dr"+
		"\3\2\2\2\u023e\u023f\7k\2\2\u023f\u0240\7p\2\2\u0240t\3\2\2\2\u0241\u0242"+
		"\7c\2\2\u0242\u0243\7p\2\2\u0243\u0244\7f\2\2\u0244v\3\2\2\2\u0245\u0246"+
		"\7q\2\2\u0246\u0247\7t\2\2\u0247x\3\2\2\2\u0248\u0249\7v\2\2\u0249\u024a"+
		"\7c\2\2\u024a\u024b\7d\2\2\u024b\u024c\7n\2\2\u024c\u024d\7g\2\2\u024d"+
		"\u024e\7t\2\2\u024e\u024f\7q\2\2\u024f\u0250\7y\2\2\u0250z\3\2\2\2\u0251"+
		"\u0252\7g\2\2\u0252\u0253\7p\2\2\u0253\u0254\7f\2\2\u0254\u0255\7v\2\2"+
		"\u0255\u0256\7c\2\2\u0256\u0257\7d\2\2\u0257\u0258\7n\2\2\u0258\u0259"+
		"\7g\2\2\u0259\u025a\7t\2\2\u025a\u025b\7q\2\2\u025b\u025c\7y\2\2\u025c"+
		"|\3\2\2\2\u025d\u025e\7c\2\2\u025e\u025f\7u\2\2\u025f\u0260\7u\2\2\u0260"+
		"\u0261\7k\2\2\u0261\u0262\7i\2\2\u0262\u0263\7p\2\2\u0263~\3\2\2\2\u0264"+
		"\u0265\7v\2\2\u0265\u0266\7t\2\2\u0266\u0267\7w\2\2\u0267\u0268\7g\2\2"+
		"\u0268\u0080\3\2\2\2\u0269\u026a\7h\2\2\u026a\u026b\7c\2\2\u026b\u026c"+
		"\7n\2\2\u026c\u026d\7u\2\2\u026d\u026e\7g\2\2\u026e\u0082\3\2\2\2\u026f"+
		"\u0270\7p\2\2\u0270\u0271\7k\2\2\u0271\u0277\7n\2\2\u0272\u0273\7p\2\2"+
		"\u0273\u0274\7w\2\2\u0274\u0275\7n\2\2\u0275\u0277\7n\2\2\u0276\u026f"+
		"\3\2\2\2\u0276\u0272\3\2\2\2\u0277\u0084\3\2\2\2\u0278\u0279\7k\2\2\u0279"+
		"\u027a\7p\2\2\u027a\u027b\7e\2\2\u027b\u027c\7n\2\2\u027c\u027d\7w\2\2"+
		"\u027d\u027e\7f\2\2\u027e\u027f\7g\2\2\u027f\u0086\3\2\2\2\u0280\u0281"+
		"\7y\2\2\u0281\u0282\7k\2\2\u0282\u0283\7v\2\2\u0283\u0284\7j\2\2\u0284"+
		"\u0088\3\2\2\2\u0285\u0286\7q\2\2\u0286\u0287\7h\2\2\u0287\u0288\7h\2"+
		"\2\u0288\u0289\7u\2\2\u0289\u028a\7g\2\2\u028a\u028b\7v\2\2\u028b\u008a"+
		"\3\2\2\2\u028c\u028d\7e\2\2\u028d\u028e\7q\2\2\u028e\u028f\7p\2\2\u028f"+
		"\u0290\7v\2\2\u0290\u0291\7k\2\2\u0291\u0292\7p\2\2\u0292\u0293\7w\2\2"+
		"\u0293\u0294\7g\2\2\u0294\u008c\3\2\2\2\u0295\u0296\7t\2\2\u0296\u0297"+
		"\7g\2\2\u0297\u0298\7x\2\2\u0298\u0299\7g\2\2\u0299\u029a\7t\2\2\u029a"+
		"\u029b\7u\2\2\u029b\u029c\7g\2\2\u029c\u029d\7f\2\2\u029d\u008e\3\2\2"+
		"\2\u029e\u029f\7g\2\2\u029f\u02a0\7o\2\2\u02a0\u02a1\7r\2\2\u02a1\u02a2"+
		"\7v\2\2\u02a2\u02a3\7{\2\2\u02a3\u0090\3\2\2\2\u02a4\u02a5\7d\2\2\u02a5"+
		"\u02a6\7n\2\2\u02a6\u02a7\7c\2\2\u02a7\u02a8\7p\2\2\u02a8\u02a9\7m\2\2"+
		"\u02a9\u0092\3\2\2\2\u02aa\u02ab\7g\2\2\u02ab\u02ac\7p\2\2\u02ac\u02ad"+
		"\7f\2\2\u02ad\u02ae\3\2\2\2\u02ae\u02af\5\u0095J\2\u02af\u0094\3\2\2\2"+
		"\u02b0\u02b3\5\25\n\2\u02b1\u02b3\7a\2\2\u02b2\u02b0\3\2\2\2\u02b2\u02b1"+
		"\3\2\2\2\u02b3\u02b9\3\2\2\2\u02b4\u02b8\5\25\n\2\u02b5\u02b8\t\t\2\2"+
		"\u02b6\u02b8\5\27\13\2\u02b7\u02b4\3\2\2\2\u02b7\u02b5\3\2\2\2\u02b7\u02b6"+
		"\3\2\2\2\u02b8\u02bb\3\2\2\2\u02b9\u02b7\3\2\2\2\u02b9\u02ba\3\2\2\2\u02ba"+
		"\u0096\3\2\2\2\u02bb\u02b9\3\2\2\2\u02bc\u02bd\7}\2\2\u02bd\u02be\7\'"+
		"\2\2\u02be\u02c2\3\2\2\2\u02bf\u02c1\5\17\7\2\u02c0\u02bf\3\2\2\2\u02c1"+
		"\u02c4\3\2\2\2\u02c2\u02c0\3\2\2\2\u02c2\u02c3\3\2\2\2\u02c3\u02c5\3\2"+
		"\2\2\u02c4\u02c2\3\2\2\2\u02c5\u02c6\7g\2\2\u02c6\u02c7\7p\2\2\u02c7\u02c8"+
		"\7f\2\2\u02c8\u02c9\7t\2\2\u02c9\u02ca\7c\2\2\u02ca\u02cb\7y\2\2\u02cb"+
		"\u02cc\3\2\2\2\u02cc\u02cd\bK\3\2\u02cd\u0098\3\2\2\2\u02ce\u02cf\13\2"+
		"\2\2\u02cf\u009a\3\2\2\2,\2\3\4\u009e\u00a8\u00b2\u00ba\u00c1\u00cb\u00d5"+
		"\u00dd\u00e7\u00f0\u00fa\u00fe\u0114\u0118\u0121\u012c\u0131\u013b\u013f"+
		"\u0148\u0153\u0158\u015e\u0169\u018f\u0194\u019a\u019d\u01a2\u01a7\u01aa"+
		"\u01af\u01b4\u01e5\u0276\u02b2\u02b7\u02b9\u02c2\6\7\3\2\6\2\2\2\3\2\7"+
		"\4\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}