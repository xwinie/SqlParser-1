// Generated from Sql92CommonLexer.g4 by ANTLR 4.2.2

package com.laudandjolynn.sqlparser;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class Sql92CommonLexer extends Lexer {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		GENERAL_IDENTIFIER=1, SQL_LANGUAGE_IDENTIFIER=2, NONQUOTE_CHARACTER=3, 
		QUOTE_SYMBOL=4, NONDOUBLEQUOTE_CHARACTER=5, DOUBLEQUOTE_SYMBOL=6, ADA=7, 
		C=8, COBOL=9, FORTRAN=10, MUMPS=11, PASCAL=12, PLI=13, LANGUAGE_NAME=14, 
		NOT_EQ=15, GREATER_THAN_OR_EQ=16, LESS_THAN_OR_QE=17, CONCATENATION=18, 
		DOUBLE_PERIOD=19, NULL=20, DEFAULT=21, SOME=22, ANY=23, ALL=24, DISTINCT=25, 
		AVG=26, SUM=27, MIN=28, MAX=29, COUNT=30, UNSIGNED_INTEGER=31, SIGNED_INTEGER=32, 
		UNSIGNED_NUMERIC_LITERAL=33, SIGNED_NUMERIC_LITERAL=34, SPACE=35, TAB=36, 
		NEWLINE=37, SIGN=38, PLUS_SIGN=39, MINUS_SIGN=40, DOUBLE_QUOTE=41, PERCENT=42, 
		AMPERSAND=43, QUOTE=44, LEFT_PAREN=45, RIGHT_PAREN=46, ASTERISK=47, COMMA=48, 
		PERIOD=49, SOLIDUS=50, COLON=51, SEMICOLON=52, LESS_THAN=53, LESS_THAN_OR_EQ=54, 
		EQ=55, GREATER_THAN=56, QUESTION_MARK=57, UNDERSCORE=58, VERTICAL_BAR=59, 
		LEFT_BRACKET=60, RIGHT_BRACKET=61;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"GENERAL_IDENTIFIER", "SQL_LANGUAGE_IDENTIFIER", "NONQUOTE_CHARACTER", 
		"QUOTE_SYMBOL", "NONDOUBLEQUOTE_CHARACTER", "DOUBLEQUOTE_SYMBOL", "'ADA'", 
		"'C'", "'COBOL'", "'FORTRAN'", "'MUMPS'", "'PASCAL'", "'PLI'", "LANGUAGE_NAME", 
		"'<>'", "'>='", "LESS_THAN_OR_QE", "'||'", "'..'", "'NULL'", "'DEFAULT'", 
		"'SOME'", "'ANY'", "'ALL'", "'DISTINCT'", "'AVG'", "'SUM'", "'MIN'", "'MAX'", 
		"'COUNT'", "UNSIGNED_INTEGER", "SIGNED_INTEGER", "UNSIGNED_NUMERIC_LITERAL", 
		"SIGNED_NUMERIC_LITERAL", "' '", "'\t'", "NEWLINE", "SIGN", "'+'", "'-'", 
		"'\"'", "'%'", "'&'", "'''", "'('", "')'", "'*'", "','", "'.'", "'/'", 
		"':'", "';'", "'<'", "LESS_THAN_OR_EQ", "'='", "'>'", "'?'", "'_'", "'|'", 
		"'['", "']'"
	};
	public static final String[] ruleNames = {
		"GENERAL_IDENTIFIER", "SQL_LANGUAGE_IDENTIFIER", "NONQUOTE_CHARACTER", 
		"QUOTE_SYMBOL", "NONDOUBLEQUOTE_CHARACTER", "DOUBLEQUOTE_SYMBOL", "ADA", 
		"C", "COBOL", "FORTRAN", "MUMPS", "PASCAL", "PLI", "LANGUAGE_NAME", "NOT_EQ", 
		"GREATER_THAN_OR_EQ", "LESS_THAN_OR_QE", "CONCATENATION", "DOUBLE_PERIOD", 
		"NULL", "DEFAULT", "SOME", "ANY", "ALL", "DISTINCT", "AVG", "SUM", "MIN", 
		"MAX", "COUNT", "COMMENT_INTRODUCER", "UNSIGNED_INTEGER", "SIGNED_INTEGER", 
		"UNSIGNED_NUMERIC_LITERAL", "SIGNED_NUMERIC_LITERAL", "SPACE", "TAB", 
		"NEWLINE", "SIGN", "PLUS_SIGN", "MINUS_SIGN", "DOUBLE_QUOTE", "PERCENT", 
		"AMPERSAND", "QUOTE", "LEFT_PAREN", "RIGHT_PAREN", "ASTERISK", "COMMA", 
		"PERIOD", "SOLIDUS", "COLON", "SEMICOLON", "LESS_THAN", "LESS_THAN_OR_EQ", 
		"EQ", "GREATER_THAN", "QUESTION_MARK", "UNDERSCORE", "VERTICAL_BAR", "LEFT_BRACKET", 
		"RIGHT_BRACKET", "ZERO", "DIGIT", "ALPHA", "IDENTIFIER_BEGINNING_LETTER", 
		"IDENTIFIER_BEGINNING_LETTER_LOOSE", "HEX", "UNICODE", "BIT", "SEXAGESIMAL", 
		"EXPONENT", "MANTISSA", "EXACT_NUMERIC_LITERAL", "APPROXIMATE_NUMERIC_LITERAL"
	};


	public Sql92CommonLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Sql92CommonLexer.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2?\u01b6\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\3\2\3\2\3\2\3\2\7\2\u009e\n\2\f\2\16\2\u00a1\13"+
		"\2\3\3\3\3\3\3\3\3\7\3\u00a7\n\3\f\3\16\3\u00aa\13\3\3\4\3\4\3\5\3\5\3"+
		"\5\3\6\3\6\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3"+
		"\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3"+
		"\17\3\17\5\17\u00e2\n\17\3\20\3\20\3\20\3\21\3\21\3\21\3\22\3\22\3\22"+
		"\3\23\3\23\3\23\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30"+
		"\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\33"+
		"\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\36\3\36\3\36"+
		"\3\36\3\37\3\37\3\37\3\37\3\37\3\37\3 \3 \3 \7 \u012f\n \f \16 \u0132"+
		"\13 \3!\3!\3!\7!\u0137\n!\f!\16!\u013a\13!\5!\u013c\n!\3\"\3\"\3\"\3#"+
		"\3#\5#\u0143\n#\3$\5$\u0146\n$\3$\3$\3%\3%\3&\3&\3\'\5\'\u014f\n\'\3\'"+
		"\3\'\3(\3(\5(\u0155\n(\3)\3)\3*\3*\3+\3+\3,\3,\3-\3-\3.\3.\3/\3/\3\60"+
		"\3\60\3\61\3\61\3\62\3\62\3\63\3\63\3\64\3\64\3\65\3\65\3\66\3\66\3\67"+
		"\3\67\38\38\38\39\39\3:\3:\3;\3;\3<\3<\3=\3=\3>\3>\3?\3?\3@\3@\3A\3A\3"+
		"B\3B\3C\3C\3D\3D\3E\3E\3F\3F\3F\3F\3F\3F\3F\3F\3G\3G\3H\3H\3H\3H\3H\5"+
		"H\u01a1\nH\3I\3I\3J\3J\3K\3K\3K\5K\u01aa\nK\5K\u01ac\nK\3K\3K\3K\5K\u01b1"+
		"\nK\3L\3L\3L\3L\2\2M\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27"+
		"\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33"+
		"\65\34\67\359\36;\37= ?\2A!C\"E#G$I%K&M\'O(Q)S*U+W,Y-[.]/_\60a\61c\62"+
		"e\63g\64i\65k\66m\67o8q9s:u;w<y={>}?\177\2\u0081\2\u0083\2\u0085\2\u0087"+
		"\2\u0089\2\u008b\2\u008d\2\u008f\2\u0091\2\u0093\2\u0095\2\u0097\2\3\2"+
		"\r\3\2))\3\2$$\3\2\63;\3\2\62;\4\2C\\c|\5\2C\\aac|\b\2\60\60C\\aac|\u0082"+
		"\u0082\0\0\5\2\62;CHch\3\2\62\63\3\2\62\67\4\2GGgg\u01bf\2\3\3\2\2\2\2"+
		"\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2"+
		"\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2"+
		"\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2"+
		"\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2"+
		"\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2"+
		"\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2"+
		"M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3"+
		"\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2"+
		"\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2q\3\2\2\2\2"+
		"s\3\2\2\2\2u\3\2\2\2\2w\3\2\2\2\2y\3\2\2\2\2{\3\2\2\2\2}\3\2\2\2\3\u0099"+
		"\3\2\2\2\5\u00a2\3\2\2\2\7\u00ab\3\2\2\2\t\u00ad\3\2\2\2\13\u00b0\3\2"+
		"\2\2\r\u00b2\3\2\2\2\17\u00b5\3\2\2\2\21\u00b9\3\2\2\2\23\u00bb\3\2\2"+
		"\2\25\u00c1\3\2\2\2\27\u00c9\3\2\2\2\31\u00cf\3\2\2\2\33\u00d6\3\2\2\2"+
		"\35\u00e1\3\2\2\2\37\u00e3\3\2\2\2!\u00e6\3\2\2\2#\u00e9\3\2\2\2%\u00ec"+
		"\3\2\2\2\'\u00ef\3\2\2\2)\u00f2\3\2\2\2+\u00f7\3\2\2\2-\u00ff\3\2\2\2"+
		"/\u0104\3\2\2\2\61\u0108\3\2\2\2\63\u010c\3\2\2\2\65\u0115\3\2\2\2\67"+
		"\u0119\3\2\2\29\u011d\3\2\2\2;\u0121\3\2\2\2=\u0125\3\2\2\2?\u012b\3\2"+
		"\2\2A\u013b\3\2\2\2C\u013d\3\2\2\2E\u0142\3\2\2\2G\u0145\3\2\2\2I\u0149"+
		"\3\2\2\2K\u014b\3\2\2\2M\u014e\3\2\2\2O\u0154\3\2\2\2Q\u0156\3\2\2\2S"+
		"\u0158\3\2\2\2U\u015a\3\2\2\2W\u015c\3\2\2\2Y\u015e\3\2\2\2[\u0160\3\2"+
		"\2\2]\u0162\3\2\2\2_\u0164\3\2\2\2a\u0166\3\2\2\2c\u0168\3\2\2\2e\u016a"+
		"\3\2\2\2g\u016c\3\2\2\2i\u016e\3\2\2\2k\u0170\3\2\2\2m\u0172\3\2\2\2o"+
		"\u0174\3\2\2\2q\u0177\3\2\2\2s\u0179\3\2\2\2u\u017b\3\2\2\2w\u017d\3\2"+
		"\2\2y\u017f\3\2\2\2{\u0181\3\2\2\2}\u0183\3\2\2\2\177\u0185\3\2\2\2\u0081"+
		"\u0187\3\2\2\2\u0083\u0189\3\2\2\2\u0085\u018b\3\2\2\2\u0087\u018d\3\2"+
		"\2\2\u0089\u018f\3\2\2\2\u008b\u0191\3\2\2\2\u008d\u0199\3\2\2\2\u008f"+
		"\u01a0\3\2\2\2\u0091\u01a2\3\2\2\2\u0093\u01a4\3\2\2\2\u0095\u01b0\3\2"+
		"\2\2\u0097\u01b2\3\2\2\2\u0099\u009f\5\u0083B\2\u009a\u009e\5w<\2\u009b"+
		"\u009e\5\u0081A\2\u009c\u009e\5\u0083B\2\u009d\u009a\3\2\2\2\u009d\u009b"+
		"\3\2\2\2\u009d\u009c\3\2\2\2\u009e\u00a1\3\2\2\2\u009f\u009d\3\2\2\2\u009f"+
		"\u00a0\3\2\2\2\u00a0\4\3\2\2\2\u00a1\u009f\3\2\2\2\u00a2\u00a8\5\u0083"+
		"B\2\u00a3\u00a7\5w<\2\u00a4\u00a7\5\u0081A\2\u00a5\u00a7\5\u0083B\2\u00a6"+
		"\u00a3\3\2\2\2\u00a6\u00a4\3\2\2\2\u00a6\u00a5\3\2\2\2\u00a7\u00aa\3\2"+
		"\2\2\u00a8\u00a6\3\2\2\2\u00a8\u00a9\3\2\2\2\u00a9\6\3\2\2\2\u00aa\u00a8"+
		"\3\2\2\2\u00ab\u00ac\n\2\2\2\u00ac\b\3\2\2\2\u00ad\u00ae\5[.\2\u00ae\u00af"+
		"\5[.\2\u00af\n\3\2\2\2\u00b0\u00b1\n\3\2\2\u00b1\f\3\2\2\2\u00b2\u00b3"+
		"\5U+\2\u00b3\u00b4\5U+\2\u00b4\16\3\2\2\2\u00b5\u00b6\7C\2\2\u00b6\u00b7"+
		"\7F\2\2\u00b7\u00b8\7C\2\2\u00b8\20\3\2\2\2\u00b9\u00ba\7E\2\2\u00ba\22"+
		"\3\2\2\2\u00bb\u00bc\7E\2\2\u00bc\u00bd\7Q\2\2\u00bd\u00be\7D\2\2\u00be"+
		"\u00bf\7Q\2\2\u00bf\u00c0\7N\2\2\u00c0\24\3\2\2\2\u00c1\u00c2\7H\2\2\u00c2"+
		"\u00c3\7Q\2\2\u00c3\u00c4\7T\2\2\u00c4\u00c5\7V\2\2\u00c5\u00c6\7T\2\2"+
		"\u00c6\u00c7\7C\2\2\u00c7\u00c8\7P\2\2\u00c8\26\3\2\2\2\u00c9\u00ca\7"+
		"O\2\2\u00ca\u00cb\7W\2\2\u00cb\u00cc\7O\2\2\u00cc\u00cd\7R\2\2\u00cd\u00ce"+
		"\7U\2\2\u00ce\30\3\2\2\2\u00cf\u00d0\7R\2\2\u00d0\u00d1\7C\2\2\u00d1\u00d2"+
		"\7U\2\2\u00d2\u00d3\7E\2\2\u00d3\u00d4\7C\2\2\u00d4\u00d5\7N\2\2\u00d5"+
		"\32\3\2\2\2\u00d6\u00d7\7R\2\2\u00d7\u00d8\7N\2\2\u00d8\u00d9\7K\2\2\u00d9"+
		"\34\3\2\2\2\u00da\u00e2\5\17\b\2\u00db\u00e2\5\21\t\2\u00dc\u00e2\5\23"+
		"\n\2\u00dd\u00e2\5\25\13\2\u00de\u00e2\5\27\f\2\u00df\u00e2\5\31\r\2\u00e0"+
		"\u00e2\5\33\16\2\u00e1\u00da\3\2\2\2\u00e1\u00db\3\2\2\2\u00e1\u00dc\3"+
		"\2\2\2\u00e1\u00dd\3\2\2\2\u00e1\u00de\3\2\2\2\u00e1\u00df\3\2\2\2\u00e1"+
		"\u00e0\3\2\2\2\u00e2\36\3\2\2\2\u00e3\u00e4\7>\2\2\u00e4\u00e5\7@\2\2"+
		"\u00e5 \3\2\2\2\u00e6\u00e7\7@\2\2\u00e7\u00e8\7?\2\2\u00e8\"\3\2\2\2"+
		"\u00e9\u00ea\7>\2\2\u00ea\u00eb\7?\2\2\u00eb$\3\2\2\2\u00ec\u00ed\7~\2"+
		"\2\u00ed\u00ee\7~\2\2\u00ee&\3\2\2\2\u00ef\u00f0\7\60\2\2\u00f0\u00f1"+
		"\7\60\2\2\u00f1(\3\2\2\2\u00f2\u00f3\7P\2\2\u00f3\u00f4\7W\2\2\u00f4\u00f5"+
		"\7N\2\2\u00f5\u00f6\7N\2\2\u00f6*\3\2\2\2\u00f7\u00f8\7F\2\2\u00f8\u00f9"+
		"\7G\2\2\u00f9\u00fa\7H\2\2\u00fa\u00fb\7C\2\2\u00fb\u00fc\7W\2\2\u00fc"+
		"\u00fd\7N\2\2\u00fd\u00fe\7V\2\2\u00fe,\3\2\2\2\u00ff\u0100\7U\2\2\u0100"+
		"\u0101\7Q\2\2\u0101\u0102\7O\2\2\u0102\u0103\7G\2\2\u0103.\3\2\2\2\u0104"+
		"\u0105\7C\2\2\u0105\u0106\7P\2\2\u0106\u0107\7[\2\2\u0107\60\3\2\2\2\u0108"+
		"\u0109\7C\2\2\u0109\u010a\7N\2\2\u010a\u010b\7N\2\2\u010b\62\3\2\2\2\u010c"+
		"\u010d\7F\2\2\u010d\u010e\7K\2\2\u010e\u010f\7U\2\2\u010f\u0110\7V\2\2"+
		"\u0110\u0111\7K\2\2\u0111\u0112\7P\2\2\u0112\u0113\7E\2\2\u0113\u0114"+
		"\7V\2\2\u0114\64\3\2\2\2\u0115\u0116\7C\2\2\u0116\u0117\7X\2\2\u0117\u0118"+
		"\7I\2\2\u0118\66\3\2\2\2\u0119\u011a\7U\2\2\u011a\u011b\7W\2\2\u011b\u011c"+
		"\7O\2\2\u011c8\3\2\2\2\u011d\u011e\7O\2\2\u011e\u011f\7K\2\2\u011f\u0120"+
		"\7P\2\2\u0120:\3\2\2\2\u0121\u0122\7O\2\2\u0122\u0123\7C\2\2\u0123\u0124"+
		"\7Z\2\2\u0124<\3\2\2\2\u0125\u0126\7E\2\2\u0126\u0127\7Q\2\2\u0127\u0128"+
		"\7W\2\2\u0128\u0129\7P\2\2\u0129\u012a\7V\2\2\u012a>\3\2\2\2\u012b\u012c"+
		"\5S*\2\u012c\u0130\5S*\2\u012d\u012f\5S*\2\u012e\u012d\3\2\2\2\u012f\u0132"+
		"\3\2\2\2\u0130\u012e\3\2\2\2\u0130\u0131\3\2\2\2\u0131@\3\2\2\2\u0132"+
		"\u0130\3\2\2\2\u0133\u013c\7\62\2\2\u0134\u0138\t\4\2\2\u0135\u0137\t"+
		"\5\2\2\u0136\u0135\3\2\2\2\u0137\u013a\3\2\2\2\u0138\u0136\3\2\2\2\u0138"+
		"\u0139\3\2\2\2\u0139\u013c\3\2\2\2\u013a\u0138\3\2\2\2\u013b\u0133\3\2"+
		"\2\2\u013b\u0134\3\2\2\2\u013cB\3\2\2\2\u013d\u013e\5O(\2\u013e\u013f"+
		"\5A!\2\u013fD\3\2\2\2\u0140\u0143\5\u0095K\2\u0141\u0143\5\u0097L\2\u0142"+
		"\u0140\3\2\2\2\u0142\u0141\3\2\2\2\u0143F\3\2\2\2\u0144\u0146\5O(\2\u0145"+
		"\u0144\3\2\2\2\u0145\u0146\3\2\2\2\u0146\u0147\3\2\2\2\u0147\u0148\5E"+
		"#\2\u0148H\3\2\2\2\u0149\u014a\7\"\2\2\u014aJ\3\2\2\2\u014b\u014c\7\13"+
		"\2\2\u014cL\3\2\2\2\u014d\u014f\7\17\2\2\u014e\u014d\3\2\2\2\u014e\u014f"+
		"\3\2\2\2\u014f\u0150\3\2\2\2\u0150\u0151\7\f\2\2\u0151N\3\2\2\2\u0152"+
		"\u0155\5Q)\2\u0153\u0155\5S*\2\u0154\u0152\3\2\2\2\u0154\u0153\3\2\2\2"+
		"\u0155P\3\2\2\2\u0156\u0157\7-\2\2\u0157R\3\2\2\2\u0158\u0159\7/\2\2\u0159"+
		"T\3\2\2\2\u015a\u015b\7$\2\2\u015bV\3\2\2\2\u015c\u015d\7\'\2\2\u015d"+
		"X\3\2\2\2\u015e\u015f\7(\2\2\u015fZ\3\2\2\2\u0160\u0161\7)\2\2\u0161\\"+
		"\3\2\2\2\u0162\u0163\7*\2\2\u0163^\3\2\2\2\u0164\u0165\7+\2\2\u0165`\3"+
		"\2\2\2\u0166\u0167\7,\2\2\u0167b\3\2\2\2\u0168\u0169\7.\2\2\u0169d\3\2"+
		"\2\2\u016a\u016b\7\60\2\2\u016bf\3\2\2\2\u016c\u016d\7\61\2\2\u016dh\3"+
		"\2\2\2\u016e\u016f\7<\2\2\u016fj\3\2\2\2\u0170\u0171\7=\2\2\u0171l\3\2"+
		"\2\2\u0172\u0173\7>\2\2\u0173n\3\2\2\2\u0174\u0175\7>\2\2\u0175\u0176"+
		"\7?\2\2\u0176p\3\2\2\2\u0177\u0178\7?\2\2\u0178r\3\2\2\2\u0179\u017a\7"+
		"@\2\2\u017at\3\2\2\2\u017b\u017c\7A\2\2\u017cv\3\2\2\2\u017d\u017e\7a"+
		"\2\2\u017ex\3\2\2\2\u017f\u0180\7~\2\2\u0180z\3\2\2\2\u0181\u0182\7]\2"+
		"\2\u0182|\3\2\2\2\u0183\u0184\7_\2\2\u0184~\3\2\2\2\u0185\u0186\7\62\2"+
		"\2\u0186\u0080\3\2\2\2\u0187\u0188\t\5\2\2\u0188\u0082\3\2\2\2\u0189\u018a"+
		"\t\6\2\2\u018a\u0084\3\2\2\2\u018b\u018c\t\7\2\2\u018c\u0086\3\2\2\2\u018d"+
		"\u018e\t\b\2\2\u018e\u0088\3\2\2\2\u018f\u0190\t\t\2\2\u0190\u008a\3\2"+
		"\2\2\u0191\u0192\7w\2\2\u0192\u0193\7W\2\2\u0193\u0194\3\2\2\2\u0194\u0195"+
		"\5\u0089E\2\u0195\u0196\5\u0089E\2\u0196\u0197\5\u0089E\2\u0197\u0198"+
		"\5\u0089E\2\u0198\u008c\3\2\2\2\u0199\u019a\t\n\2\2\u019a\u008e\3\2\2"+
		"\2\u019b\u019c\t\13\2\2\u019c\u01a1\t\5\2\2\u019d\u01a1\t\5\2\2\u019e"+
		"\u019f\78\2\2\u019f\u01a1\7\62\2\2\u01a0\u019b\3\2\2\2\u01a0\u019d\3\2"+
		"\2\2\u01a0\u019e\3\2\2\2\u01a1\u0090\3\2\2\2\u01a2\u01a3\5C\"\2\u01a3"+
		"\u0092\3\2\2\2\u01a4\u01a5\5\u0095K\2\u01a5\u0094\3\2\2\2\u01a6\u01ab"+
		"\5A!\2\u01a7\u01a9\5e\63\2\u01a8\u01aa\5A!\2\u01a9\u01a8\3\2\2\2\u01a9"+
		"\u01aa\3\2\2\2\u01aa\u01ac\3\2\2\2\u01ab\u01a7\3\2\2\2\u01ab\u01ac\3\2"+
		"\2\2\u01ac\u01b1\3\2\2\2\u01ad\u01ae\5e\63\2\u01ae\u01af\5A!\2\u01af\u01b1"+
		"\3\2\2\2\u01b0\u01a6\3\2\2\2\u01b0\u01ad\3\2\2\2\u01b1\u0096\3\2\2\2\u01b2"+
		"\u01b3\5\u0093J\2\u01b3\u01b4\t\f\2\2\u01b4\u01b5\5\u0091I\2\u01b5\u0098"+
		"\3\2\2\2\23\2\u009d\u009f\u00a6\u00a8\u00e1\u0130\u0138\u013b\u0142\u0145"+
		"\u014e\u0154\u01a0\u01a9\u01ab\u01b0\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}