/* The following code was generated by JFlex 1.4.3 on 1/29/12 3:36 AM */

package org.microjava.syntax;

import java_cup.runtime.*;


/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.4.3
 * on 1/29/12 3:36 AM from the specification file
 * <tt>E:/Programski_jezici/Java/Indigo Eclipse/microJava/jflex_cup/inputflex.flex</tt>
 */
public class Lexer implements java_cup.runtime.Scanner {

  /** This character denotes the end of file */
  public static final int YYEOF = -1;

  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int YYINITIAL = 0;
  public static final int COMMENT = 2;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = { 
     0,  0,  1, 1
  };

  /** 
   * Translates characters to character classes
   */
  private static final String ZZ_CMAP_PACKED = 
    "\10\57\1\2\1\3\1\5\1\0\1\3\1\4\16\57\4\0\1\1"+
    "\1\10\2\61\1\63\1\40\1\20\1\60\1\12\1\17\1\46\1\6"+
    "\1\22\1\16\1\31\1\7\2\62\4\55\2\62\2\55\1\0\1\14"+
    "\1\15\1\11\1\13\2\0\32\56\1\50\1\0\1\51\1\0\1\56"+
    "\1\0\1\25\1\41\1\23\1\45\1\33\1\30\1\56\1\52\1\27"+
    "\1\56\1\42\1\24\1\56\1\36\1\44\1\54\1\56\1\32\1\26"+
    "\1\34\1\35\1\43\1\37\3\56\1\47\1\21\1\53\1\0\41\57"+
    "\2\0\4\56\4\0\1\56\2\0\1\57\7\0\1\56\4\0\1\56"+
    "\5\0\27\56\1\0\37\56\1\0\u013f\56\31\0\162\56\4\0\14\56"+
    "\16\0\5\56\11\0\1\56\21\0\130\57\5\0\23\57\12\0\1\56"+
    "\13\0\1\56\1\0\3\56\1\0\1\56\1\0\24\56\1\0\54\56"+
    "\1\0\46\56\1\0\5\56\4\0\202\56\1\0\4\57\3\0\105\56"+
    "\1\0\46\56\2\0\2\56\6\0\20\56\41\0\46\56\2\0\1\56"+
    "\7\0\47\56\11\0\21\57\1\0\27\57\1\0\3\57\1\0\1\57"+
    "\1\0\2\57\1\0\1\57\13\0\33\56\5\0\3\56\15\0\4\57"+
    "\14\0\6\57\13\0\32\56\5\0\13\56\16\57\7\0\12\57\4\0"+
    "\2\56\1\57\143\56\1\0\1\56\10\57\1\0\6\57\2\56\2\57"+
    "\1\0\4\57\2\56\12\57\3\56\2\0\1\56\17\0\1\57\1\56"+
    "\1\57\36\56\33\57\2\0\3\56\60\0\46\56\13\57\1\56\u014f\0"+
    "\3\57\66\56\2\0\1\57\1\56\20\57\2\0\1\56\4\57\3\0"+
    "\12\56\2\57\2\0\12\57\21\0\3\57\1\0\10\56\2\0\2\56"+
    "\2\0\26\56\1\0\7\56\1\0\1\56\3\0\4\56\2\0\1\57"+
    "\1\56\7\57\2\0\2\57\2\0\3\57\11\0\1\57\4\0\2\56"+
    "\1\0\3\56\2\57\2\0\12\57\4\56\15\0\3\57\1\0\6\56"+
    "\4\0\2\56\2\0\26\56\1\0\7\56\1\0\2\56\1\0\2\56"+
    "\1\0\2\56\2\0\1\57\1\0\5\57\4\0\2\57\2\0\3\57"+
    "\13\0\4\56\1\0\1\56\7\0\14\57\3\56\14\0\3\57\1\0"+
    "\11\56\1\0\3\56\1\0\26\56\1\0\7\56\1\0\2\56\1\0"+
    "\5\56\2\0\1\57\1\56\10\57\1\0\3\57\1\0\3\57\2\0"+
    "\1\56\17\0\2\56\2\57\2\0\12\57\1\0\1\56\17\0\3\57"+
    "\1\0\10\56\2\0\2\56\2\0\26\56\1\0\7\56\1\0\2\56"+
    "\1\0\5\56\2\0\1\57\1\56\6\57\3\0\2\57\2\0\3\57"+
    "\10\0\2\57\4\0\2\56\1\0\3\56\4\0\12\57\1\0\1\56"+
    "\20\0\1\57\1\56\1\0\6\56\3\0\3\56\1\0\4\56\3\0"+
    "\2\56\1\0\1\56\1\0\2\56\3\0\2\56\3\0\3\56\3\0"+
    "\10\56\1\0\3\56\4\0\5\57\3\0\3\57\1\0\4\57\11\0"+
    "\1\57\17\0\11\57\11\0\1\56\7\0\3\57\1\0\10\56\1\0"+
    "\3\56\1\0\27\56\1\0\12\56\1\0\5\56\4\0\7\57\1\0"+
    "\3\57\1\0\4\57\7\0\2\57\11\0\2\56\4\0\12\57\22\0"+
    "\2\57\1\0\10\56\1\0\3\56\1\0\27\56\1\0\12\56\1\0"+
    "\5\56\2\0\1\57\1\56\7\57\1\0\3\57\1\0\4\57\7\0"+
    "\2\57\7\0\1\56\1\0\2\56\4\0\12\57\22\0\2\57\1\0"+
    "\10\56\1\0\3\56\1\0\27\56\1\0\20\56\4\0\6\57\2\0"+
    "\3\57\1\0\4\57\11\0\1\57\10\0\2\56\4\0\12\57\22\0"+
    "\2\57\1\0\22\56\3\0\30\56\1\0\11\56\1\0\1\56\2\0"+
    "\7\56\3\0\1\57\4\0\6\57\1\0\1\57\1\0\10\57\22\0"+
    "\2\57\15\0\60\56\1\57\2\56\7\57\4\0\10\56\10\57\1\0"+
    "\12\57\47\0\2\56\1\0\1\56\2\0\2\56\1\0\1\56\2\0"+
    "\1\56\6\0\4\56\1\0\7\56\1\0\3\56\1\0\1\56\1\0"+
    "\1\56\2\0\2\56\1\0\4\56\1\57\2\56\6\57\1\0\2\57"+
    "\1\56\2\0\5\56\1\0\1\56\1\0\6\57\2\0\12\57\2\0"+
    "\2\56\42\0\1\56\27\0\2\57\6\0\12\57\13\0\1\57\1\0"+
    "\1\57\1\0\1\57\4\0\2\57\10\56\1\0\42\56\6\0\24\57"+
    "\1\0\2\57\4\56\4\0\10\57\1\0\44\57\11\0\1\57\71\0"+
    "\42\56\1\0\5\56\1\0\2\56\1\0\7\57\3\0\4\57\6\0"+
    "\12\57\6\0\6\56\4\57\106\0\46\56\12\0\51\56\7\0\132\56"+
    "\5\0\104\56\5\0\122\56\6\0\7\56\1\0\77\56\1\0\1\56"+
    "\1\0\4\56\2\0\7\56\1\0\1\56\1\0\4\56\2\0\47\56"+
    "\1\0\1\56\1\0\4\56\2\0\37\56\1\0\1\56\1\0\4\56"+
    "\2\0\7\56\1\0\1\56\1\0\4\56\2\0\7\56\1\0\7\56"+
    "\1\0\27\56\1\0\37\56\1\0\1\56\1\0\4\56\2\0\7\56"+
    "\1\0\47\56\1\0\23\56\16\0\11\57\56\0\125\56\14\0\u026c\56"+
    "\2\0\10\56\12\0\32\56\5\0\113\56\3\0\3\56\17\0\15\56"+
    "\1\0\4\56\3\57\13\0\22\56\3\57\13\0\22\56\2\57\14\0"+
    "\15\56\1\0\3\56\1\0\2\57\14\0\64\56\40\57\3\0\1\56"+
    "\3\0\2\56\1\57\2\0\12\57\41\0\3\57\2\0\12\57\6\0"+
    "\130\56\10\0\51\56\1\57\126\0\35\56\3\0\14\57\4\0\14\57"+
    "\12\0\12\57\36\56\2\0\5\56\u038b\0\154\56\224\0\234\56\4\0"+
    "\132\56\6\0\26\56\2\0\6\56\2\0\46\56\2\0\6\56\2\0"+
    "\10\56\1\0\1\56\1\0\1\56\1\0\1\56\1\0\37\56\2\0"+
    "\65\56\1\0\7\56\1\0\1\56\3\0\3\56\1\0\7\56\3\0"+
    "\4\56\2\0\6\56\4\0\15\56\5\0\3\56\1\0\7\56\17\0"+
    "\4\57\32\0\5\57\20\0\2\56\23\0\1\56\13\0\4\57\6\0"+
    "\6\57\1\0\1\56\15\0\1\56\40\0\22\56\36\0\15\57\4\0"+
    "\1\57\3\0\6\57\27\0\1\56\4\0\1\56\2\0\12\56\1\0"+
    "\1\56\3\0\5\56\6\0\1\56\1\0\1\56\1\0\1\56\1\0"+
    "\4\56\1\0\3\56\1\0\7\56\3\0\3\56\5\0\5\56\26\0"+
    "\44\56\u0e81\0\3\56\31\0\11\56\6\57\1\0\5\56\2\0\5\56"+
    "\4\0\126\56\2\0\2\57\2\0\3\56\1\0\137\56\5\0\50\56"+
    "\4\0\136\56\21\0\30\56\70\0\20\56\u0200\0\u19b6\56\112\0\u51a6\56"+
    "\132\0\u048d\56\u0773\0\u2ba4\56\u215c\0\u012e\56\2\0\73\56\225\0\7\56"+
    "\14\0\5\56\5\0\1\56\1\57\12\56\1\0\15\56\1\0\5\56"+
    "\1\0\1\56\1\0\2\56\1\0\2\56\1\0\154\56\41\0\u016b\56"+
    "\22\0\100\56\2\0\66\56\50\0\15\56\3\0\20\57\20\0\4\57"+
    "\17\0\2\56\30\0\3\56\31\0\1\56\6\0\5\56\1\0\207\56"+
    "\2\0\1\57\4\0\1\56\13\0\12\57\7\0\32\56\4\0\1\56"+
    "\1\0\32\56\12\0\132\56\3\0\6\56\2\0\6\56\2\0\6\56"+
    "\2\0\3\56\3\0\2\56\3\0\2\56\22\0\3\57\4\0";

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = zzUnpackCMap(ZZ_CMAP_PACKED);

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\2\0\1\1\1\2\1\1\1\3\1\4\1\1\1\5"+
    "\1\6\1\7\1\10\1\11\1\12\1\13\2\1\1\14"+
    "\4\15\1\16\4\15\1\17\2\15\1\20\1\21\1\22"+
    "\1\23\1\24\1\15\1\25\1\1\2\26\1\27\1\30"+
    "\1\31\1\32\1\33\1\34\1\35\1\36\1\15\1\37"+
    "\10\15\1\0\1\40\5\15\1\41\4\15\1\42\2\15"+
    "\1\43\1\15\1\44\2\15\1\45\1\15\1\46\1\47"+
    "\1\15\1\50\1\51\1\52\1\53";

  private static int [] zzUnpackAction() {
    int [] result = new int[87];
    int offset = 0;
    offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAction(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /** 
   * Translates a state to a row index in the transition table
   */
  private static final int [] ZZ_ROWMAP = zzUnpackRowMap();

  private static final String ZZ_ROWMAP_PACKED_0 =
    "\0\0\0\64\0\150\0\150\0\234\0\320\0\u0104\0\u0138"+
    "\0\u016c\0\150\0\u01a0\0\150\0\u01d4\0\u0208\0\150\0\u023c"+
    "\0\u0270\0\150\0\u02a4\0\u02d8\0\u030c\0\u0340\0\150\0\u0374"+
    "\0\u03a8\0\u03dc\0\u0410\0\150\0\u0444\0\u0478\0\150\0\150"+
    "\0\150\0\150\0\150\0\u04ac\0\u04e0\0\u0514\0\150\0\u0548"+
    "\0\150\0\150\0\150\0\150\0\150\0\150\0\150\0\150"+
    "\0\u057c\0\u02d8\0\u05b0\0\u05e4\0\u0618\0\u064c\0\u0680\0\u06b4"+
    "\0\u06e8\0\u071c\0\u0750\0\150\0\u0784\0\u07b8\0\u07ec\0\u0820"+
    "\0\u0854\0\u02d8\0\u0888\0\u08bc\0\u08f0\0\u0924\0\150\0\u0958"+
    "\0\u098c\0\u02d8\0\u09c0\0\u02d8\0\u09f4\0\u0a28\0\u02d8\0\u0a5c"+
    "\0\u02d8\0\u02d8\0\u0a90\0\u02d8\0\u02d8\0\u02d8\0\u02d8";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[87];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /** 
   * The transition table of the DFA
   */
  private static final int [] ZZ_TRANS = zzUnpackTrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\1\3\3\4\1\5\1\0\1\6\1\7\1\10\1\11"+
    "\1\12\1\13\1\14\1\15\1\16\1\17\1\20\1\21"+
    "\1\22\1\23\3\24\1\25\1\26\1\27\1\30\1\31"+
    "\2\24\1\32\1\33\1\34\1\35\1\24\1\36\2\24"+
    "\1\37\1\40\1\41\1\42\1\24\1\43\1\44\1\45"+
    "\1\24\1\3\1\46\1\3\1\45\1\24\4\47\1\50"+
    "\1\0\56\47\71\0\1\4\64\0\1\51\64\0\1\47"+
    "\65\0\1\52\63\0\1\53\63\0\1\54\63\0\1\55"+
    "\70\0\1\56\65\0\1\57\64\0\1\60\44\0\1\24"+
    "\20\0\1\24\1\61\4\24\1\0\6\24\1\0\5\24"+
    "\4\0\1\24\1\0\4\24\2\0\2\24\2\0\1\24"+
    "\20\0\6\24\1\0\6\24\1\0\5\24\4\0\1\24"+
    "\1\0\4\24\2\0\2\24\2\0\1\24\20\0\5\24"+
    "\1\62\1\0\6\24\1\0\5\24\4\0\1\24\1\0"+
    "\4\24\2\0\2\24\2\0\1\24\20\0\4\24\1\63"+
    "\1\24\1\0\6\24\1\0\5\24\4\0\1\24\1\0"+
    "\4\24\2\0\2\24\2\0\1\24\20\0\6\24\1\0"+
    "\1\24\1\64\4\24\1\0\5\24\4\0\1\24\1\0"+
    "\4\24\2\0\2\24\2\0\1\24\20\0\1\24\1\65"+
    "\4\24\1\0\6\24\1\0\5\24\4\0\1\24\1\0"+
    "\4\24\2\0\2\24\2\0\1\24\20\0\6\24\1\0"+
    "\1\24\1\66\4\24\1\0\5\24\4\0\1\24\1\0"+
    "\4\24\2\0\2\24\2\0\1\24\20\0\6\24\1\0"+
    "\6\24\1\0\5\24\4\0\1\67\1\0\4\24\2\0"+
    "\2\24\2\0\1\24\20\0\6\24\1\0\1\70\5\24"+
    "\1\0\5\24\4\0\1\24\1\0\4\24\2\0\2\24"+
    "\2\0\1\24\20\0\6\24\1\0\6\24\1\0\3\24"+
    "\1\71\1\24\4\0\1\24\1\0\4\24\2\0\2\24"+
    "\2\0\1\24\20\0\6\24\1\0\1\72\5\24\1\0"+
    "\5\24\4\0\1\24\1\0\4\24\2\0\2\24\55\0"+
    "\1\45\4\0\1\45\2\0\1\73\4\0\3\73\1\0"+
    "\1\73\3\0\3\73\1\0\1\73\6\0\1\73\6\0"+
    "\1\73\5\0\1\73\11\0\4\73\5\0\1\74\60\0"+
    "\1\24\20\0\2\24\1\75\3\24\1\0\6\24\1\0"+
    "\5\24\4\0\1\24\1\0\4\24\2\0\2\24\2\0"+
    "\1\24\20\0\6\24\1\0\4\24\1\76\1\24\1\0"+
    "\5\24\4\0\1\24\1\0\4\24\2\0\2\24\2\0"+
    "\1\24\20\0\2\24\1\77\3\24\1\0\2\24\1\100"+
    "\3\24\1\0\5\24\4\0\1\24\1\0\4\24\2\0"+
    "\2\24\2\0\1\24\20\0\3\24\1\101\2\24\1\0"+
    "\6\24\1\0\5\24\4\0\1\24\1\0\4\24\2\0"+
    "\2\24\2\0\1\24\20\0\6\24\1\0\5\24\1\102"+
    "\1\0\5\24\4\0\1\24\1\0\4\24\2\0\2\24"+
    "\2\0\1\24\20\0\4\24\1\103\1\24\1\0\6\24"+
    "\1\0\5\24\4\0\1\24\1\0\4\24\2\0\2\24"+
    "\2\0\1\24\20\0\6\24\1\0\1\24\1\104\4\24"+
    "\1\0\5\24\4\0\1\24\1\0\4\24\2\0\2\24"+
    "\2\0\1\24\20\0\4\24\1\105\1\24\1\0\6\24"+
    "\1\0\5\24\4\0\1\24\1\0\4\24\2\0\2\24"+
    "\2\0\1\24\20\0\4\24\1\106\1\24\1\0\6\24"+
    "\1\0\5\24\4\0\1\24\1\0\4\24\2\0\2\24"+
    "\60\0\1\107\5\0\1\24\20\0\3\24\1\110\2\24"+
    "\1\0\6\24\1\0\5\24\4\0\1\24\1\0\4\24"+
    "\2\0\2\24\2\0\1\24\20\0\2\24\1\111\3\24"+
    "\1\0\6\24\1\0\5\24\4\0\1\24\1\0\4\24"+
    "\2\0\2\24\2\0\1\24\20\0\6\24\1\0\6\24"+
    "\1\0\4\24\1\112\4\0\1\24\1\0\4\24\2\0"+
    "\2\24\2\0\1\24\20\0\6\24\1\0\3\24\1\113"+
    "\2\24\1\0\5\24\4\0\1\24\1\0\4\24\2\0"+
    "\2\24\2\0\1\24\20\0\6\24\1\0\1\24\1\114"+
    "\4\24\1\0\5\24\4\0\1\24\1\0\4\24\2\0"+
    "\2\24\2\0\1\24\20\0\1\24\1\115\4\24\1\0"+
    "\6\24\1\0\5\24\4\0\1\24\1\0\4\24\2\0"+
    "\2\24\2\0\1\24\20\0\2\24\1\116\3\24\1\0"+
    "\6\24\1\0\5\24\4\0\1\24\1\0\4\24\2\0"+
    "\2\24\2\0\1\24\20\0\6\24\1\0\6\24\1\0"+
    "\4\24\1\117\4\0\1\24\1\0\4\24\2\0\2\24"+
    "\2\0\1\24\20\0\6\24\1\0\4\24\1\120\1\24"+
    "\1\0\5\24\4\0\1\24\1\0\4\24\2\0\2\24"+
    "\2\0\1\24\20\0\3\24\1\121\2\24\1\0\6\24"+
    "\1\0\5\24\4\0\1\24\1\0\4\24\2\0\2\24"+
    "\2\0\1\24\20\0\1\24\1\122\4\24\1\0\6\24"+
    "\1\0\5\24\4\0\1\24\1\0\4\24\2\0\2\24"+
    "\2\0\1\24\20\0\6\24\1\0\1\123\5\24\1\0"+
    "\5\24\4\0\1\24\1\0\4\24\2\0\2\24\2\0"+
    "\1\24\20\0\6\24\1\0\1\24\1\124\4\24\1\0"+
    "\5\24\4\0\1\24\1\0\4\24\2\0\2\24\2\0"+
    "\1\24\20\0\6\24\1\0\6\24\1\0\1\24\1\125"+
    "\3\24\4\0\1\24\1\0\4\24\2\0\2\24\2\0"+
    "\1\24\20\0\6\24\1\0\2\24\1\126\3\24\1\0"+
    "\5\24\4\0\1\24\1\0\4\24\2\0\2\24\2\0"+
    "\1\24\20\0\6\24\1\0\4\24\1\127\1\24\1\0"+
    "\5\24\4\0\1\24\1\0\4\24\2\0\2\24";

  private static int [] zzUnpackTrans() {
    int [] result = new int[2756];
    int offset = 0;
    offset = zzUnpackTrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackTrans(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /* error codes */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  private static final int ZZ_NO_MATCH = 1;
  private static final int ZZ_PUSHBACK_2BIG = 2;

  /* error messages for the codes above */
  private static final String ZZ_ERROR_MSG[] = {
    "Unkown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\2\0\2\11\5\1\1\11\1\1\1\11\2\1\1\11"+
    "\2\1\1\11\4\1\1\11\4\1\1\11\2\1\5\11"+
    "\3\1\1\11\1\1\10\11\12\1\1\0\1\11\12\1"+
    "\1\11\20\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[87];
    int offset = 0;
    offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAttribute(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /** the input device */
  private java.io.Reader zzReader;

  /** the current state of the DFA */
  private int zzState;

  /** the current lexical state */
  private int zzLexicalState = YYINITIAL;

  /** this buffer contains the current text to be matched and is
      the source of the yytext() string */
  private char zzBuffer[] = new char[ZZ_BUFFERSIZE];

  /** the textposition at the last accepting state */
  private int zzMarkedPos;

  /** the current text position in the buffer */
  private int zzCurrentPos;

  /** startRead marks the beginning of the yytext() string in the buffer */
  private int zzStartRead;

  /** endRead marks the last character in the buffer, that has been read
      from input */
  private int zzEndRead;

  /** number of newlines encountered up to the start of the matched text */
  private int yyline;

  /** the number of characters up to the start of the matched text */
  private int yychar;

  /**
   * the number of characters from the last newline up to the start of the 
   * matched text
   */
  private int yycolumn;

  /** 
   * zzAtBOL == true <=> the scanner is currently at the beginning of a line
   */
  private boolean zzAtBOL = true;

  /** zzAtEOF == true <=> the scanner is at the EOF */
  private boolean zzAtEOF;

  /** denotes if the user-EOF-code has already been executed */
  private boolean zzEOFDone;

  /* user code: */
	private Symbol newSymbol(int type)
	{
		return new Symbol(type, yyline+1, yycolumn);
	}
	
	private Symbol newSymbol(int type, Object val)
	{
		return new Symbol(type, yyline+1, yycolumn, val);
	}


  /**
   * Creates a new scanner
   * There is also a java.io.InputStream version of this constructor.
   *
   * @param   in  the java.io.Reader to read input from.
   */
  public Lexer(java.io.Reader in) {
    this.zzReader = in;
  }

  /**
   * Creates a new scanner.
   * There is also java.io.Reader version of this constructor.
   *
   * @param   in  the java.io.Inputstream to read input from.
   */
  public Lexer(java.io.InputStream in) {
    this(new java.io.InputStreamReader(in));
  }

  /** 
   * Unpacks the compressed character translation table.
   *
   * @param packed   the packed character translation table
   * @return         the unpacked character translation table
   */
  private static char [] zzUnpackCMap(String packed) {
    char [] map = new char[0x10000];
    int i = 0;  /* index in packed string  */
    int j = 0;  /* index in unpacked array */
    while (i < 1758) {
      int  count = packed.charAt(i++);
      char value = packed.charAt(i++);
      do map[j++] = value; while (--count > 0);
    }
    return map;
  }


  /**
   * Refills the input buffer.
   *
   * @return      <code>false</code>, iff there was new input.
   * 
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {

    /* first: make room (if you can) */
    if (zzStartRead > 0) {
      System.arraycopy(zzBuffer, zzStartRead,
                       zzBuffer, 0,
                       zzEndRead-zzStartRead);

      /* translate stored positions */
      zzEndRead-= zzStartRead;
      zzCurrentPos-= zzStartRead;
      zzMarkedPos-= zzStartRead;
      zzStartRead = 0;
    }

    /* is the buffer big enough? */
    if (zzCurrentPos >= zzBuffer.length) {
      /* if not: blow it up */
      char newBuffer[] = new char[zzCurrentPos*2];
      System.arraycopy(zzBuffer, 0, newBuffer, 0, zzBuffer.length);
      zzBuffer = newBuffer;
    }

    /* finally: fill the buffer with new input */
    int numRead = zzReader.read(zzBuffer, zzEndRead,
                                            zzBuffer.length-zzEndRead);

    if (numRead > 0) {
      zzEndRead+= numRead;
      return false;
    }
    // unlikely but not impossible: read 0 characters, but not at end of stream    
    if (numRead == 0) {
      int c = zzReader.read();
      if (c == -1) {
        return true;
      } else {
        zzBuffer[zzEndRead++] = (char) c;
        return false;
      }     
    }

	// numRead < 0
    return true;
  }

    
  /**
   * Closes the input stream.
   */
  public final void yyclose() throws java.io.IOException {
    zzAtEOF = true;            /* indicate end of file */
    zzEndRead = zzStartRead;  /* invalidate buffer    */

    if (zzReader != null)
      zzReader.close();
  }


  /**
   * Resets the scanner to read from a new input stream.
   * Does not close the old reader.
   *
   * All internal variables are reset, the old input stream 
   * <b>cannot</b> be reused (internal buffer is discarded and lost).
   * Lexical state is set to <tt>ZZ_INITIAL</tt>.
   *
   * @param reader   the new input stream 
   */
  public final void yyreset(java.io.Reader reader) {
    zzReader = reader;
    zzAtBOL  = true;
    zzAtEOF  = false;
    zzEOFDone = false;
    zzEndRead = zzStartRead = 0;
    zzCurrentPos = zzMarkedPos = 0;
    yyline = yychar = yycolumn = 0;
    zzLexicalState = YYINITIAL;
  }


  /**
   * Returns the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   */
  public final String yytext() {
    return new String( zzBuffer, zzStartRead, zzMarkedPos-zzStartRead );
  }


  /**
   * Returns the character at position <tt>pos</tt> from the 
   * matched text. 
   * 
   * It is equivalent to yytext().charAt(pos), but faster
   *
   * @param pos the position of the character to fetch. 
   *            A value from 0 to yylength()-1.
   *
   * @return the character at position pos
   */
  public final char yycharat(int pos) {
    return zzBuffer[zzStartRead+pos];
  }


  /**
   * Returns the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occured while scanning.
   *
   * In a wellformed scanner (no or only correct usage of 
   * yypushback(int) and a match-all fallback rule) this method 
   * will only be called with things that "Can't Possibly Happen".
   * If this method is called, something is seriously wrong
   * (e.g. a JFlex bug producing a faulty scanner etc.).
   *
   * Usual syntax/scanner level error handling should be done
   * in error fallback rules.
   *
   * @param   errorCode  the code of the errormessage to display
   */
  private void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    }
    catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  } 


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * They will be read again by then next call of the scanning method
   *
   * @param number  the number of characters to be read again.
   *                This number must not be greater than yylength()!
   */
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }


  /**
   * Contains user EOF-code, which will be executed exactly once,
   * when the end of file is reached
   */
  private void zzDoEOF() throws java.io.IOException {
    if (!zzEOFDone) {
      zzEOFDone = true;
      yyclose();
    }
  }


  /**
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public java_cup.runtime.Symbol next_token() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    char [] zzBufferL = zzBuffer;
    char [] zzCMapL = ZZ_CMAP;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      boolean zzR = false;
      for (zzCurrentPosL = zzStartRead; zzCurrentPosL < zzMarkedPosL;
                                                             zzCurrentPosL++) {
        switch (zzBufferL[zzCurrentPosL]) {
        case '\u000B':
        case '\u000C':
        case '\u0085':
        case '\u2028':
        case '\u2029':
          yyline++;
          yycolumn = 0;
          zzR = false;
          break;
        case '\r':
          yyline++;
          yycolumn = 0;
          zzR = true;
          break;
        case '\n':
          if (zzR)
            zzR = false;
          else {
            yyline++;
            yycolumn = 0;
          }
          break;
        default:
          zzR = false;
          yycolumn++;
        }
      }

      if (zzR) {
        // peek one character ahead if it is \n (if we have counted one line too much)
        boolean zzPeek;
        if (zzMarkedPosL < zzEndReadL)
          zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        else if (zzAtEOF)
          zzPeek = false;
        else {
          boolean eof = zzRefill();
          zzEndReadL = zzEndRead;
          zzMarkedPosL = zzMarkedPos;
          zzBufferL = zzBuffer;
          if (eof) 
            zzPeek = false;
          else 
            zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        }
        if (zzPeek) yyline--;
      }
      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;
  
      zzState = ZZ_LEXSTATE[zzLexicalState];


      zzForAction: {
        while (true) {
    
          if (zzCurrentPosL < zzEndReadL)
            zzInput = zzBufferL[zzCurrentPosL++];
          else if (zzAtEOF) {
            zzInput = YYEOF;
            break zzForAction;
          }
          else {
            // store back cached positions
            zzCurrentPos  = zzCurrentPosL;
            zzMarkedPos   = zzMarkedPosL;
            boolean eof = zzRefill();
            // get translated positions and possibly new buffer
            zzCurrentPosL  = zzCurrentPos;
            zzMarkedPosL   = zzMarkedPos;
            zzBufferL      = zzBuffer;
            zzEndReadL     = zzEndRead;
            if (eof) {
              zzInput = YYEOF;
              break zzForAction;
            }
            else {
              zzInput = zzBufferL[zzCurrentPosL++];
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMapL[zzInput] ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          int zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
        case 42: 
          { return newSymbol(sym.PRINT);
          }
        case 44: break;
        case 5: 
          { return newSymbol(sym.ASSIGN);
          }
        case 45: break;
        case 31: 
          { return newSymbol(sym.IF);
          }
        case 46: break;
        case 43: 
          { return newSymbol(sym.RETURN);
          }
        case 47: break;
        case 8: 
          { return newSymbol(sym.SEMI);
          }
        case 48: break;
        case 30: 
          { return newSymbol(sym.OR);
          }
        case 49: break;
        case 12: 
          { return newSymbol(sym.COMMA);
          }
        case 50: break;
        case 14: 
          { return newSymbol(sym.DOT);
          }
        case 51: break;
        case 26: 
          { return newSymbol(sym.GREATEREQUAL);
          }
        case 52: break;
        case 23: 
          { return newSymbol(sym.PLUSPLUS);
          }
        case 53: break;
        case 38: 
          { return newSymbol(sym.CLASS);
          }
        case 54: break;
        case 35: 
          { return newSymbol(sym.READ);
          }
        case 55: break;
        case 6: 
          { return newSymbol(sym.LPAREN);
          }
        case 56: break;
        case 32: 
          { yybegin(YYINITIAL);
          }
        case 57: break;
        case 18: 
          { return newSymbol(sym.LSQUARE);
          }
        case 58: break;
        case 20: 
          { return newSymbol(sym.RBRACE);
          }
        case 59: break;
        case 29: 
          { return newSymbol(sym.AND);
          }
        case 60: break;
        case 22: 
          { yybegin(COMMENT);
          }
        case 61: break;
        case 21: 
          { return newSymbol(sym.NUMBER, new Integer(yytext()));
          }
        case 62: break;
        case 15: 
          { return newSymbol(sym.MOD);
          }
        case 63: break;
        case 39: 
          { return newSymbol(sym.FINAL);
          }
        case 64: break;
        case 24: 
          { return newSymbol(sym.NOTEQUAL);
          }
        case 65: break;
        case 4: 
          { return newSymbol(sym.DIVIDE);
          }
        case 66: break;
        case 16: 
          { return newSymbol(sym.TIMES);
          }
        case 67: break;
        case 13: 
          { return newSymbol (sym.IDENT, yytext());
          }
        case 68: break;
        case 27: 
          { return newSymbol(sym.LESSEQUAL);
          }
        case 69: break;
        case 1: 
          { System.err.println("Leksicka greska na liniji " + (yyline + 1) + " : " + yytext() );
          }
        case 70: break;
        case 25: 
          { return newSymbol(sym.EQUAL);
          }
        case 71: break;
        case 3: 
          { return newSymbol(sym.PLUS);
          }
        case 72: break;
        case 41: 
          { return newSymbol(sym.BREAK);
          }
        case 73: break;
        case 7: 
          { return newSymbol(sym.GREATER);
          }
        case 74: break;
        case 40: 
          { return newSymbol(sym.WHILE);
          }
        case 75: break;
        case 9: 
          { return newSymbol(sym.LESS);
          }
        case 76: break;
        case 11: 
          { return newSymbol(sym.RPAREN);
          }
        case 77: break;
        case 37: 
          { return newSymbol(sym.VOID);
          }
        case 78: break;
        case 34: 
          { return newSymbol(sym.CHARCONST, new Character(yytext().charAt(1)));
          }
        case 79: break;
        case 36: 
          { return newSymbol(sym.ELSE);
          }
        case 80: break;
        case 17: 
          { return newSymbol(sym.LBRACE);
          }
        case 81: break;
        case 19: 
          { return newSymbol(sym.RSQUARE);
          }
        case 82: break;
        case 28: 
          { return newSymbol(sym.MINUSMINUS);
          }
        case 83: break;
        case 33: 
          { return newSymbol(sym.NEW);
          }
        case 84: break;
        case 2: 
          { 
          }
        case 85: break;
        case 10: 
          { return newSymbol(sym.MINUS);
          }
        case 86: break;
        default: 
          if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
            zzAtEOF = true;
            zzDoEOF();
              { 	return newSymbol(sym.EOF);
 }
          } 
          else {
            zzScanError(ZZ_NO_MATCH);
          }
      }
    }
  }


}
