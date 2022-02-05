
//----------------------------------------------------
// The following code was generated by CUP v0.11a beta 20060608
// Fri Feb 04 13:50:41 MST 2022
//----------------------------------------------------

package com.deimos.compilador.services.analysis;

import com.deimos.compilador.model.errors.CompilationError;
import com.deimos.compilador.model.errors.ErrorType;
import com.deimos.compilador.services.ErrorHandlerService;
import com.deimos.compilador.model.variables.Variables;
import java_cup.runtime.Symbol;
import java.util.List;

/** CUP v0.11a beta 20060608 generated parser.
  * @version Fri Feb 04 13:50:41 MST 2022
  */
public class Syntax extends java_cup.runtime.lr_parser {

  /** Default constructor. */
  public Syntax() {super();}

  /** Constructor which sets the default scanner. */
  public Syntax(java_cup.runtime.Scanner s) {super(s);}

  /** Constructor which sets the default scanner. */
  public Syntax(java_cup.runtime.Scanner s, java_cup.runtime.SymbolFactory sf) {super(s,sf);}

  /** Production table. */
  protected static final short _production_table[][] = 
    unpackFromStrings(new String[] {
    "\000\053\000\002\002\004\000\002\002\004\000\002\002" +
    "\003\000\002\003\003\000\002\003\003\000\002\004\004" +
    "\000\002\004\003\000\002\005\003\000\002\005\003\000" +
    "\002\006\006\000\002\006\006\000\002\006\003\000\002" +
    "\007\005\000\002\007\005\000\002\007\004\000\002\010" +
    "\007\000\002\011\004\000\002\011\003\000\002\012\007" +
    "\000\002\013\004\000\002\013\003\000\002\014\004\000" +
    "\002\014\003\000\002\015\003\000\002\015\003\000\002" +
    "\016\004\000\002\017\003\000\002\017\003\000\002\017" +
    "\003\000\002\020\005\000\002\020\003\000\002\020\003" +
    "\000\002\021\004\000\002\021\004\000\002\021\003\000" +
    "\002\022\003\000\002\022\003\000\002\022\003\000\002" +
    "\022\003\000\002\022\003\000\002\022\003\000\002\023" +
    "\003\000\002\023\003" });

  /** Access to production table. */
  public short[][] production_table() {return _production_table;}

  /** Parse-action table. */
  protected static final short[][] _action_table = 
    unpackFromStrings(new String[] {
    "\000\076\000\012\003\011\007\015\021\012\052\014\001" +
    "\002\000\004\002\ufffe\001\002\000\004\052\014\001\002" +
    "\000\004\002\ufff6\001\002\000\004\002\077\001\002\000" +
    "\004\052\ufffb\001\002\000\004\002\ufffd\001\002\000\004" +
    "\052\ufffa\001\002\000\004\002\uffff\001\002\000\010\010" +
    "\020\011\023\053\021\001\002\000\006\021\016\052\ufff9" +
    "\001\002\000\004\052\ufffc\001\002\000\006\011\023\053" +
    "\075\001\002\000\004\054\065\001\002\000\004\002\ufff3" +
    "\001\002\000\006\010\020\053\063\001\002\000\004\054" +
    "\024\001\002\000\004\055\025\001\002\000\004\052\026" +
    "\001\002\000\014\003\036\016\027\017\034\020\037\053" +
    "\035\001\002\000\020\021\uffe7\033\uffe7\034\uffe7\035\uffe7" +
    "\036\uffe7\037\uffe7\040\uffe7\001\002\000\014\003\036\016" +
    "\027\017\034\020\037\053\035\001\002\000\006\010\uffef" +
    "\053\uffef\001\002\000\020\021\046\033\043\034\050\035" +
    "\044\036\051\037\053\040\047\001\002\000\016\003\uffea" +
    "\016\uffea\017\uffea\020\uffea\051\041\053\uffea\001\002\000" +
    "\020\021\uffe6\033\uffe6\034\uffe6\035\uffe6\036\uffe6\037\uffe6" +
    "\040\uffe6\001\002\000\006\010\uffed\053\uffed\001\002\000" +
    "\014\003\uffe9\016\uffe9\017\uffe9\020\uffe9\053\uffe9\001\002" +
    "\000\020\021\uffe5\033\uffe5\034\uffe5\035\uffe5\036\uffe5\037" +
    "\uffe5\040\uffe5\001\002\000\014\003\uffeb\016\uffeb\017\uffeb" +
    "\020\uffeb\053\uffeb\001\002\000\014\003\uffec\016\uffec\017" +
    "\uffec\020\uffec\053\uffec\001\002\000\016\003\uffe2\016\uffe2" +
    "\017\uffe2\020\uffe2\051\uffe2\053\uffe2\001\002\000\022\003" +
    "\uffde\016\uffde\017\uffde\020\uffde\022\uffde\023\uffde\051\uffde" +
    "\053\uffde\001\002\000\022\003\uffdc\016\uffdc\017\uffdc\020" +
    "\uffdc\022\uffdc\023\uffdc\051\uffdc\053\uffdc\001\002\000\022" +
    "\003\uffdf\016\uffdf\017\uffdf\020\uffdf\022\055\023\057\051" +
    "\uffdf\053\uffdf\001\002\000\032\003\uffe3\016\uffe3\017\uffe3" +
    "\020\uffe3\033\043\034\050\035\044\036\051\037\053\040" +
    "\047\051\uffe3\053\uffe3\001\002\000\022\003\uffd9\016\uffd9" +
    "\017\uffd9\020\uffd9\022\uffd9\023\uffd9\051\uffd9\053\uffd9\001" +
    "\002\000\022\003\uffdd\016\uffdd\017\uffdd\020\uffdd\022\uffdd" +
    "\023\uffdd\051\uffdd\053\uffdd\001\002\000\022\003\uffdb\016" +
    "\uffdb\017\uffdb\020\uffdb\022\uffdb\023\uffdb\051\uffdb\053\uffdb" +
    "\001\002\000\016\003\uffe8\016\uffe8\017\uffe8\020\uffe8\051" +
    "\uffe8\053\uffe8\001\002\000\022\003\uffda\016\uffda\017\uffda" +
    "\020\uffda\022\uffda\023\uffda\051\uffda\053\uffda\001\002\000" +
    "\022\003\uffe1\016\uffe1\017\uffe1\020\uffe1\022\055\023\057" +
    "\051\uffe1\053\uffe1\001\002\000\016\003\uffd8\016\uffd8\017" +
    "\uffd8\020\uffd8\051\uffd8\053\uffd8\001\002\000\016\003\uffe4" +
    "\016\uffe4\017\uffe4\020\uffe4\051\uffe4\053\uffe4\001\002\000" +
    "\016\003\uffd7\016\uffd7\017\uffd7\020\uffd7\051\uffd7\053\uffd7" +
    "\001\002\000\016\003\uffe0\016\uffe0\017\uffe0\020\uffe0\051" +
    "\uffe0\053\uffe0\001\002\000\006\010\uffee\053\uffee\001\002" +
    "\000\004\053\064\001\002\000\004\002\ufff4\001\002\000" +
    "\004\002\ufff7\001\002\000\004\055\066\001\002\000\004" +
    "\052\067\001\002\000\014\003\036\016\027\017\034\020" +
    "\037\053\071\001\002\000\014\003\036\016\027\017\034" +
    "\020\037\053\071\001\002\000\006\011\ufff0\053\ufff0\001" +
    "\002\000\006\011\ufff2\053\ufff2\001\002\000\006\011\ufff1" +
    "\053\ufff1\001\002\000\004\053\076\001\002\000\004\002" +
    "\ufff5\001\002\000\004\002\ufff8\001\002\000\004\002\001" +
    "\001\002\000\004\002\000\001\002" });

  /** Access to parse-action table. */
  public short[][] action_table() {return _action_table;}

  /** <code>reduce_goto</code> table. */
  protected static final short[][] _reduce_table = 
    unpackFromStrings(new String[] {
    "\000\076\000\016\002\006\003\012\004\004\005\007\006" +
    "\003\007\005\001\001\000\002\001\001\000\006\006\077" +
    "\007\005\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\006\010\016\012\021\001\001\000\002\001" +
    "\001\000\002\001\001\000\004\012\073\001\001\000\002" +
    "\001\001\000\002\001\001\000\004\010\061\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\014" +
    "\013\030\014\027\015\037\016\032\017\031\001\001\000" +
    "\002\001\001\000\014\013\060\014\027\015\037\016\032" +
    "\017\031\001\001\000\002\001\001\000\010\020\051\021" +
    "\041\022\044\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\004\023\057\001\001\000" +
    "\004\022\053\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\004\023\055\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\014\011\071\014\067\015" +
    "\037\016\032\017\031\001\001\000\014\011\072\014\067" +
    "\015\037\016\032\017\031\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001" });

  /** Access to <code>reduce_goto</code> table. */
  public short[][] reduce_table() {return _reduce_table;}

  /** Instance of action encapsulation class. */
  protected CUP$Syntax$actions action_obj;

  /** Action encapsulation object initializer. */
  protected void init_actions()
    {
      action_obj = new CUP$Syntax$actions(this);
    }

  /** Invoke a user supplied parse action. */
  public java_cup.runtime.Symbol do_action(
    int                        act_num,
    java_cup.runtime.lr_parser parser,
    java.util.Stack            stack,
    int                        top)
    throws java.lang.Exception
  {
    /* call code in generated class */
    return action_obj.CUP$Syntax$do_action(act_num, parser, stack, top);
  }

  /** Indicates start state. */
  public int start_state() {return 0;}
  /** Indicates start production. */
  public int start_production() {return 0;}

  /** <code>EOF</code> Symbol index. */
  public int EOF_sym() {return 0;}

  /** <code>error</code> Symbol index. */
  public int error_sym() {return 1;}



    private Symbol s;
    
    public void syntax_error(Symbol s){
        this.s = s;
    }

    public Symbol getS(){
        return this.s;
    }

}

/** Cup generated class to encapsulate user supplied action code.*/
class CUP$Syntax$actions {



private void syntaxError(String id, int line, String message){
    List<CompilationError> errors = ErrorHandlerService.compilationErrors.getErrors();
    CompilationError syntaxError = new CompilationError(id, message, ErrorType.SYNTAX, line);
    errors.add(syntaxError);
}

private static final String NOT_A_STATEMENT_ERROR_CODE = "003";
private static final String NOT_A_DECLARATION_ERROR_CODE = "004";
private static final String EXPECTED_SEMI_COLON_ERROR_CODE = "005";
private static final String MISSING_CLOSING_BRACKET_ERROR_CODE = "006";
private static final String MAIN_CLASS_EXPECTED_ERROR_CODE = "007";
private static final String INIT_FUNCTION_EXPECTED_ERROR_CODE = "008";
private static final String ITERATE_FUNCTION_EXPECTED_ERROR_CODE = "008";
private static final String EXPECTED_IDENTIFIER_ERROR_CODE = "009";
private static final String EXPECTED_CLASS_KEYWORD_ERROR_CODE = "010";
private static final String VALUE_EXPECTED_ERROR_CODE = "011";

private static final String NOT_A_STATEMENT_MESSAGE = "Not a statement";
private static final String NOT_A_DECLARATION_MESSAGE = "Not a declaration";
private static final String EXPECTED_SEMI_COLON_MESSAGE = "<;> Expected";
private static final String MISSING_CLOSING_BRACKET_MESSAGE = "<}> Expected";
private static final String MAIN_CLASS_EXPECTED_MESSAGE = "<main> Class Expected";
private static final String INIT_FUNCTION_EXPECTED_MESSAGE = "<init> Function Expected";
private static final String ITERATE_FUNCTION_EXPECTED_MESSAGE = "<iterate> Function Expected";
private static final String EXPECTED_IDENTIFIER_MESSAGE = "<identifier> Expected";
private static final String EXPECTED_CLASS_KEYWORD_MESSAGE = "<class> Keyword Expected";
private static final String VALUE_EXPECTED_MESSAGE = "<value> Expected";

  private final Syntax parser;

  /** Constructor */
  CUP$Syntax$actions(Syntax parser) {
    this.parser = parser;
  }

  /** Method with the actual generated action code. */
  public final java_cup.runtime.Symbol CUP$Syntax$do_action(
    int                        CUP$Syntax$act_num,
    java_cup.runtime.lr_parser CUP$Syntax$parser,
    java.util.Stack            CUP$Syntax$stack,
    int                        CUP$Syntax$top)
    throws java.lang.Exception
    {
      /* Symbol object for return from actions */
      java_cup.runtime.Symbol CUP$Syntax$result;

      /* select the action based on the action number */
      switch (CUP$Syntax$act_num)
        {
          /*. . . . . . . . . . . . . . . . . . . .*/
          case 42: // declarationValue ::= STRING_LITERAL 
            {
              Object RESULT =null;

              CUP$Syntax$result = parser.getSymbolFactory().newSymbol("declarationValue",17, ((java_cup.runtime.Symbol)CUP$Syntax$stack.peek()), ((java_cup.runtime.Symbol)CUP$Syntax$stack.peek()), RESULT);
            }
          return CUP$Syntax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 41: // declarationValue ::= INTEGER_LITERAL 
            {
              Object RESULT =null;

              CUP$Syntax$result = parser.getSymbolFactory().newSymbol("declarationValue",17, ((java_cup.runtime.Symbol)CUP$Syntax$stack.peek()), ((java_cup.runtime.Symbol)CUP$Syntax$stack.peek()), RESULT);
            }
          return CUP$Syntax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 40: // declarationAssingment ::= ASSIGNMENT_MODULUS 
            {
              Object RESULT =null;

              CUP$Syntax$result = parser.getSymbolFactory().newSymbol("declarationAssingment",16, ((java_cup.runtime.Symbol)CUP$Syntax$stack.peek()), ((java_cup.runtime.Symbol)CUP$Syntax$stack.peek()), RESULT);
            }
          return CUP$Syntax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 39: // declarationAssingment ::= ASSIGNMENT_DIVISION 
            {
              Object RESULT =null;

              CUP$Syntax$result = parser.getSymbolFactory().newSymbol("declarationAssingment",16, ((java_cup.runtime.Symbol)CUP$Syntax$stack.peek()), ((java_cup.runtime.Symbol)CUP$Syntax$stack.peek()), RESULT);
            }
          return CUP$Syntax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 38: // declarationAssingment ::= ASSIGNMENT_MULTIPLICATION 
            {
              Object RESULT =null;

              CUP$Syntax$result = parser.getSymbolFactory().newSymbol("declarationAssingment",16, ((java_cup.runtime.Symbol)CUP$Syntax$stack.peek()), ((java_cup.runtime.Symbol)CUP$Syntax$stack.peek()), RESULT);
            }
          return CUP$Syntax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 37: // declarationAssingment ::= ASSIGNMENT_SUBTRACTION 
            {
              Object RESULT =null;

              CUP$Syntax$result = parser.getSymbolFactory().newSymbol("declarationAssingment",16, ((java_cup.runtime.Symbol)CUP$Syntax$stack.peek()), ((java_cup.runtime.Symbol)CUP$Syntax$stack.peek()), RESULT);
            }
          return CUP$Syntax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 36: // declarationAssingment ::= ASSIGNMENT_ADDITION 
            {
              Object RESULT =null;

              CUP$Syntax$result = parser.getSymbolFactory().newSymbol("declarationAssingment",16, ((java_cup.runtime.Symbol)CUP$Syntax$stack.peek()), ((java_cup.runtime.Symbol)CUP$Syntax$stack.peek()), RESULT);
            }
          return CUP$Syntax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 35: // declarationAssingment ::= ASSIGNMENT 
            {
              Object RESULT =null;

              CUP$Syntax$result = parser.getSymbolFactory().newSymbol("declarationAssingment",16, ((java_cup.runtime.Symbol)CUP$Syntax$stack.peek()), ((java_cup.runtime.Symbol)CUP$Syntax$stack.peek()), RESULT);
            }
          return CUP$Syntax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 34: // declarationBodyError ::= declarationAssingment 
            {
              Object RESULT =null;
		int eleft = ((java_cup.runtime.Symbol)CUP$Syntax$stack.peek()).left;
		int eright = ((java_cup.runtime.Symbol)CUP$Syntax$stack.peek()).right;
		Object e = (Object)((java_cup.runtime.Symbol) CUP$Syntax$stack.peek()).value;
		 syntaxError(EXPECTED_IDENTIFIER_ERROR_CODE, eleft+1, EXPECTED_IDENTIFIER_MESSAGE);
               syntaxError(VALUE_EXPECTED_ERROR_CODE, eleft+1, VALUE_EXPECTED_MESSAGE);
               syntaxError(NOT_A_DECLARATION_ERROR_CODE, eleft+1, NOT_A_DECLARATION_MESSAGE); 
              CUP$Syntax$result = parser.getSymbolFactory().newSymbol("declarationBodyError",15, ((java_cup.runtime.Symbol)CUP$Syntax$stack.peek()), ((java_cup.runtime.Symbol)CUP$Syntax$stack.peek()), RESULT);
            }
          return CUP$Syntax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 33: // declarationBodyError ::= declarationAssingment declarationValue 
            {
              Object RESULT =null;
		int eleft = ((java_cup.runtime.Symbol)CUP$Syntax$stack.elementAt(CUP$Syntax$top-1)).left;
		int eright = ((java_cup.runtime.Symbol)CUP$Syntax$stack.elementAt(CUP$Syntax$top-1)).right;
		Object e = (Object)((java_cup.runtime.Symbol) CUP$Syntax$stack.elementAt(CUP$Syntax$top-1)).value;
		 syntaxError(EXPECTED_IDENTIFIER_ERROR_CODE, eleft+1, EXPECTED_IDENTIFIER_MESSAGE);
               syntaxError(NOT_A_DECLARATION_ERROR_CODE, eleft+1, NOT_A_DECLARATION_MESSAGE); 
              CUP$Syntax$result = parser.getSymbolFactory().newSymbol("declarationBodyError",15, ((java_cup.runtime.Symbol)CUP$Syntax$stack.elementAt(CUP$Syntax$top-1)), ((java_cup.runtime.Symbol)CUP$Syntax$stack.peek()), RESULT);
            }
          return CUP$Syntax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 32: // declarationBodyError ::= IDENTIFIER declarationAssingment 
            {
              Object RESULT =null;
		int eleft = ((java_cup.runtime.Symbol)CUP$Syntax$stack.peek()).left;
		int eright = ((java_cup.runtime.Symbol)CUP$Syntax$stack.peek()).right;
		Object e = (Object)((java_cup.runtime.Symbol) CUP$Syntax$stack.peek()).value;
		 syntaxError(VALUE_EXPECTED_ERROR_CODE, eleft+1, VALUE_EXPECTED_MESSAGE); 
              CUP$Syntax$result = parser.getSymbolFactory().newSymbol("declarationBodyError",15, ((java_cup.runtime.Symbol)CUP$Syntax$stack.elementAt(CUP$Syntax$top-1)), ((java_cup.runtime.Symbol)CUP$Syntax$stack.peek()), RESULT);
            }
          return CUP$Syntax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 31: // declarationBody ::= declarationBodyError 
            {
              Object RESULT =null;

              CUP$Syntax$result = parser.getSymbolFactory().newSymbol("declarationBody",14, ((java_cup.runtime.Symbol)CUP$Syntax$stack.peek()), ((java_cup.runtime.Symbol)CUP$Syntax$stack.peek()), RESULT);
            }
          return CUP$Syntax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 30: // declarationBody ::= IDENTIFIER 
            {
              Object RESULT =null;

              CUP$Syntax$result = parser.getSymbolFactory().newSymbol("declarationBody",14, ((java_cup.runtime.Symbol)CUP$Syntax$stack.peek()), ((java_cup.runtime.Symbol)CUP$Syntax$stack.peek()), RESULT);
            }
          return CUP$Syntax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 29: // declarationBody ::= IDENTIFIER declarationAssingment declarationValue 
            {
              Object RESULT =null;

              CUP$Syntax$result = parser.getSymbolFactory().newSymbol("declarationBody",14, ((java_cup.runtime.Symbol)CUP$Syntax$stack.elementAt(CUP$Syntax$top-2)), ((java_cup.runtime.Symbol)CUP$Syntax$stack.peek()), RESULT);
            }
          return CUP$Syntax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 28: // declarationType ::= FLOAT 
            {
              Object RESULT =null;

              CUP$Syntax$result = parser.getSymbolFactory().newSymbol("declarationType",13, ((java_cup.runtime.Symbol)CUP$Syntax$stack.peek()), ((java_cup.runtime.Symbol)CUP$Syntax$stack.peek()), RESULT);
            }
          return CUP$Syntax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 27: // declarationType ::= STRING 
            {
              Object RESULT =null;

              CUP$Syntax$result = parser.getSymbolFactory().newSymbol("declarationType",13, ((java_cup.runtime.Symbol)CUP$Syntax$stack.peek()), ((java_cup.runtime.Symbol)CUP$Syntax$stack.peek()), RESULT);
            }
          return CUP$Syntax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 26: // declarationType ::= INT 
            {
              Object RESULT =null;

              CUP$Syntax$result = parser.getSymbolFactory().newSymbol("declarationType",13, ((java_cup.runtime.Symbol)CUP$Syntax$stack.peek()), ((java_cup.runtime.Symbol)CUP$Syntax$stack.peek()), RESULT);
            }
          return CUP$Syntax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 25: // declaration ::= declarationType declarationBody 
            {
              Object RESULT =null;

              CUP$Syntax$result = parser.getSymbolFactory().newSymbol("declaration",12, ((java_cup.runtime.Symbol)CUP$Syntax$stack.elementAt(CUP$Syntax$top-1)), ((java_cup.runtime.Symbol)CUP$Syntax$stack.peek()), RESULT);
            }
          return CUP$Syntax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 24: // stmtError ::= error 
            {
              Object RESULT =null;
		int eleft = ((java_cup.runtime.Symbol)CUP$Syntax$stack.peek()).left;
		int eright = ((java_cup.runtime.Symbol)CUP$Syntax$stack.peek()).right;
		Object e = (Object)((java_cup.runtime.Symbol) CUP$Syntax$stack.peek()).value;
		 syntaxError(NOT_A_STATEMENT_ERROR_CODE, eleft+1, NOT_A_STATEMENT_MESSAGE); 
              CUP$Syntax$result = parser.getSymbolFactory().newSymbol("stmtError",11, ((java_cup.runtime.Symbol)CUP$Syntax$stack.peek()), ((java_cup.runtime.Symbol)CUP$Syntax$stack.peek()), RESULT);
            }
          return CUP$Syntax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 23: // stmtError ::= declaration 
            {
              Object RESULT =null;
		int eleft = ((java_cup.runtime.Symbol)CUP$Syntax$stack.peek()).left;
		int eright = ((java_cup.runtime.Symbol)CUP$Syntax$stack.peek()).right;
		Object e = (Object)((java_cup.runtime.Symbol) CUP$Syntax$stack.peek()).value;
		 syntaxError(EXPECTED_SEMI_COLON_ERROR_CODE, eleft+1, EXPECTED_SEMI_COLON_MESSAGE); 
              CUP$Syntax$result = parser.getSymbolFactory().newSymbol("stmtError",11, ((java_cup.runtime.Symbol)CUP$Syntax$stack.peek()), ((java_cup.runtime.Symbol)CUP$Syntax$stack.peek()), RESULT);
            }
          return CUP$Syntax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 22: // stmts ::= stmtError 
            {
              Object RESULT =null;

              CUP$Syntax$result = parser.getSymbolFactory().newSymbol("stmts",10, ((java_cup.runtime.Symbol)CUP$Syntax$stack.peek()), ((java_cup.runtime.Symbol)CUP$Syntax$stack.peek()), RESULT);
            }
          return CUP$Syntax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 21: // stmts ::= declaration SEMI 
            {
              Object RESULT =null;

              CUP$Syntax$result = parser.getSymbolFactory().newSymbol("stmts",10, ((java_cup.runtime.Symbol)CUP$Syntax$stack.elementAt(CUP$Syntax$top-1)), ((java_cup.runtime.Symbol)CUP$Syntax$stack.peek()), RESULT);
            }
          return CUP$Syntax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 20: // iterationBody ::= RBRACKET 
            {
              Object RESULT =null;

              CUP$Syntax$result = parser.getSymbolFactory().newSymbol("iterationBody",9, ((java_cup.runtime.Symbol)CUP$Syntax$stack.peek()), ((java_cup.runtime.Symbol)CUP$Syntax$stack.peek()), RESULT);
            }
          return CUP$Syntax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 19: // iterationBody ::= stmts iterationBody 
            {
              Object RESULT =null;

              CUP$Syntax$result = parser.getSymbolFactory().newSymbol("iterationBody",9, ((java_cup.runtime.Symbol)CUP$Syntax$stack.elementAt(CUP$Syntax$top-1)), ((java_cup.runtime.Symbol)CUP$Syntax$stack.peek()), RESULT);
            }
          return CUP$Syntax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 18: // mainIteration ::= ITERATE LPAR RPAR LBRACKET iterationBody 
            {
              Object RESULT =null;

              CUP$Syntax$result = parser.getSymbolFactory().newSymbol("mainIteration",8, ((java_cup.runtime.Symbol)CUP$Syntax$stack.elementAt(CUP$Syntax$top-4)), ((java_cup.runtime.Symbol)CUP$Syntax$stack.peek()), RESULT);
            }
          return CUP$Syntax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 17: // initBody ::= RBRACKET 
            {
              Object RESULT =null;

              CUP$Syntax$result = parser.getSymbolFactory().newSymbol("initBody",7, ((java_cup.runtime.Symbol)CUP$Syntax$stack.peek()), ((java_cup.runtime.Symbol)CUP$Syntax$stack.peek()), RESULT);
            }
          return CUP$Syntax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 16: // initBody ::= stmts initBody 
            {
              Object RESULT =null;

              CUP$Syntax$result = parser.getSymbolFactory().newSymbol("initBody",7, ((java_cup.runtime.Symbol)CUP$Syntax$stack.elementAt(CUP$Syntax$top-1)), ((java_cup.runtime.Symbol)CUP$Syntax$stack.peek()), RESULT);
            }
          return CUP$Syntax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 15: // mainInit ::= INIT LPAR RPAR LBRACKET initBody 
            {
              Object RESULT =null;

              CUP$Syntax$result = parser.getSymbolFactory().newSymbol("mainInit",6, ((java_cup.runtime.Symbol)CUP$Syntax$stack.elementAt(CUP$Syntax$top-4)), ((java_cup.runtime.Symbol)CUP$Syntax$stack.peek()), RESULT);
            }
          return CUP$Syntax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 14: // mainClassBodyError ::= LBRACKET RBRACKET 
            {
              Object RESULT =null;
		int eleft = ((java_cup.runtime.Symbol)CUP$Syntax$stack.elementAt(CUP$Syntax$top-1)).left;
		int eright = ((java_cup.runtime.Symbol)CUP$Syntax$stack.elementAt(CUP$Syntax$top-1)).right;
		Object e = (Object)((java_cup.runtime.Symbol) CUP$Syntax$stack.elementAt(CUP$Syntax$top-1)).value;
		 syntaxError(ITERATE_FUNCTION_EXPECTED_ERROR_CODE, eleft+1, ITERATE_FUNCTION_EXPECTED_MESSAGE);
               syntaxError(INIT_FUNCTION_EXPECTED_ERROR_CODE, eleft+1, INIT_FUNCTION_EXPECTED_MESSAGE); 
              CUP$Syntax$result = parser.getSymbolFactory().newSymbol("mainClassBodyError",5, ((java_cup.runtime.Symbol)CUP$Syntax$stack.elementAt(CUP$Syntax$top-1)), ((java_cup.runtime.Symbol)CUP$Syntax$stack.peek()), RESULT);
            }
          return CUP$Syntax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 13: // mainClassBodyError ::= LBRACKET mainIteration RBRACKET 
            {
              Object RESULT =null;
		int eleft = ((java_cup.runtime.Symbol)CUP$Syntax$stack.elementAt(CUP$Syntax$top-2)).left;
		int eright = ((java_cup.runtime.Symbol)CUP$Syntax$stack.elementAt(CUP$Syntax$top-2)).right;
		Object e = (Object)((java_cup.runtime.Symbol) CUP$Syntax$stack.elementAt(CUP$Syntax$top-2)).value;
		 syntaxError(INIT_FUNCTION_EXPECTED_ERROR_CODE, eleft+1, INIT_FUNCTION_EXPECTED_MESSAGE); 
              CUP$Syntax$result = parser.getSymbolFactory().newSymbol("mainClassBodyError",5, ((java_cup.runtime.Symbol)CUP$Syntax$stack.elementAt(CUP$Syntax$top-2)), ((java_cup.runtime.Symbol)CUP$Syntax$stack.peek()), RESULT);
            }
          return CUP$Syntax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 12: // mainClassBodyError ::= LBRACKET mainInit RBRACKET 
            {
              Object RESULT =null;
		int eleft = ((java_cup.runtime.Symbol)CUP$Syntax$stack.elementAt(CUP$Syntax$top-2)).left;
		int eright = ((java_cup.runtime.Symbol)CUP$Syntax$stack.elementAt(CUP$Syntax$top-2)).right;
		Object e = (Object)((java_cup.runtime.Symbol) CUP$Syntax$stack.elementAt(CUP$Syntax$top-2)).value;
		 syntaxError(ITERATE_FUNCTION_EXPECTED_ERROR_CODE, eleft+1, ITERATE_FUNCTION_EXPECTED_MESSAGE); 
              CUP$Syntax$result = parser.getSymbolFactory().newSymbol("mainClassBodyError",5, ((java_cup.runtime.Symbol)CUP$Syntax$stack.elementAt(CUP$Syntax$top-2)), ((java_cup.runtime.Symbol)CUP$Syntax$stack.peek()), RESULT);
            }
          return CUP$Syntax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 11: // mainClassBody ::= mainClassBodyError 
            {
              Object RESULT =null;

              CUP$Syntax$result = parser.getSymbolFactory().newSymbol("mainClassBody",4, ((java_cup.runtime.Symbol)CUP$Syntax$stack.peek()), ((java_cup.runtime.Symbol)CUP$Syntax$stack.peek()), RESULT);
            }
          return CUP$Syntax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 10: // mainClassBody ::= LBRACKET mainIteration mainInit RBRACKET 
            {
              Object RESULT =null;

              CUP$Syntax$result = parser.getSymbolFactory().newSymbol("mainClassBody",4, ((java_cup.runtime.Symbol)CUP$Syntax$stack.elementAt(CUP$Syntax$top-3)), ((java_cup.runtime.Symbol)CUP$Syntax$stack.peek()), RESULT);
            }
          return CUP$Syntax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 9: // mainClassBody ::= LBRACKET mainInit mainIteration RBRACKET 
            {
              Object RESULT =null;

              CUP$Syntax$result = parser.getSymbolFactory().newSymbol("mainClassBody",4, ((java_cup.runtime.Symbol)CUP$Syntax$stack.elementAt(CUP$Syntax$top-3)), ((java_cup.runtime.Symbol)CUP$Syntax$stack.peek()), RESULT);
            }
          return CUP$Syntax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 8: // mainClassSignatureError ::= CLASS 
            {
              Object RESULT =null;
		int eleft = ((java_cup.runtime.Symbol)CUP$Syntax$stack.peek()).left;
		int eright = ((java_cup.runtime.Symbol)CUP$Syntax$stack.peek()).right;
		Object e = (Object)((java_cup.runtime.Symbol) CUP$Syntax$stack.peek()).value;
		 syntaxError(EXPECTED_IDENTIFIER_ERROR_CODE, eleft+1, EXPECTED_IDENTIFIER_MESSAGE); 
              CUP$Syntax$result = parser.getSymbolFactory().newSymbol("mainClassSignatureError",3, ((java_cup.runtime.Symbol)CUP$Syntax$stack.peek()), ((java_cup.runtime.Symbol)CUP$Syntax$stack.peek()), RESULT);
            }
          return CUP$Syntax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 7: // mainClassSignatureError ::= IDENTIFIER 
            {
              Object RESULT =null;
		int eleft = ((java_cup.runtime.Symbol)CUP$Syntax$stack.peek()).left;
		int eright = ((java_cup.runtime.Symbol)CUP$Syntax$stack.peek()).right;
		Object e = (Object)((java_cup.runtime.Symbol) CUP$Syntax$stack.peek()).value;
		 syntaxError(EXPECTED_CLASS_KEYWORD_ERROR_CODE, eleft+1, EXPECTED_CLASS_KEYWORD_MESSAGE); 
              CUP$Syntax$result = parser.getSymbolFactory().newSymbol("mainClassSignatureError",3, ((java_cup.runtime.Symbol)CUP$Syntax$stack.peek()), ((java_cup.runtime.Symbol)CUP$Syntax$stack.peek()), RESULT);
            }
          return CUP$Syntax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 6: // mainClassSignature ::= mainClassSignatureError 
            {
              Object RESULT =null;

              CUP$Syntax$result = parser.getSymbolFactory().newSymbol("mainClassSignature",2, ((java_cup.runtime.Symbol)CUP$Syntax$stack.peek()), ((java_cup.runtime.Symbol)CUP$Syntax$stack.peek()), RESULT);
            }
          return CUP$Syntax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 5: // mainClassSignature ::= CLASS IDENTIFIER 
            {
              Object RESULT =null;

              CUP$Syntax$result = parser.getSymbolFactory().newSymbol("mainClassSignature",2, ((java_cup.runtime.Symbol)CUP$Syntax$stack.elementAt(CUP$Syntax$top-1)), ((java_cup.runtime.Symbol)CUP$Syntax$stack.peek()), RESULT);
            }
          return CUP$Syntax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 4: // mainClassError ::= error 
            {
              Object RESULT =null;
		int eleft = ((java_cup.runtime.Symbol)CUP$Syntax$stack.peek()).left;
		int eright = ((java_cup.runtime.Symbol)CUP$Syntax$stack.peek()).right;
		Object e = (Object)((java_cup.runtime.Symbol) CUP$Syntax$stack.peek()).value;
		 syntaxError(MAIN_CLASS_EXPECTED_ERROR_CODE, eleft+1, MAIN_CLASS_EXPECTED_MESSAGE); 
              CUP$Syntax$result = parser.getSymbolFactory().newSymbol("mainClassError",1, ((java_cup.runtime.Symbol)CUP$Syntax$stack.peek()), ((java_cup.runtime.Symbol)CUP$Syntax$stack.peek()), RESULT);
            }
          return CUP$Syntax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 3: // mainClassError ::= mainClassBody 
            {
              Object RESULT =null;
		int eleft = ((java_cup.runtime.Symbol)CUP$Syntax$stack.peek()).left;
		int eright = ((java_cup.runtime.Symbol)CUP$Syntax$stack.peek()).right;
		Object e = (Object)((java_cup.runtime.Symbol) CUP$Syntax$stack.peek()).value;
		 syntaxError(EXPECTED_CLASS_KEYWORD_ERROR_CODE, eleft+1, EXPECTED_CLASS_KEYWORD_MESSAGE); 
               syntaxError(EXPECTED_IDENTIFIER_ERROR_CODE, eleft+1, EXPECTED_IDENTIFIER_MESSAGE); 
              CUP$Syntax$result = parser.getSymbolFactory().newSymbol("mainClassError",1, ((java_cup.runtime.Symbol)CUP$Syntax$stack.peek()), ((java_cup.runtime.Symbol)CUP$Syntax$stack.peek()), RESULT);
            }
          return CUP$Syntax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 2: // mainClass ::= mainClassError 
            {
              Object RESULT =null;

              CUP$Syntax$result = parser.getSymbolFactory().newSymbol("mainClass",0, ((java_cup.runtime.Symbol)CUP$Syntax$stack.peek()), ((java_cup.runtime.Symbol)CUP$Syntax$stack.peek()), RESULT);
            }
          return CUP$Syntax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 1: // mainClass ::= mainClassSignature mainClassBody 
            {
              Object RESULT =null;

              CUP$Syntax$result = parser.getSymbolFactory().newSymbol("mainClass",0, ((java_cup.runtime.Symbol)CUP$Syntax$stack.elementAt(CUP$Syntax$top-1)), ((java_cup.runtime.Symbol)CUP$Syntax$stack.peek()), RESULT);
            }
          return CUP$Syntax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 0: // $START ::= mainClass EOF 
            {
              Object RESULT =null;
		int start_valleft = ((java_cup.runtime.Symbol)CUP$Syntax$stack.elementAt(CUP$Syntax$top-1)).left;
		int start_valright = ((java_cup.runtime.Symbol)CUP$Syntax$stack.elementAt(CUP$Syntax$top-1)).right;
		Object start_val = (Object)((java_cup.runtime.Symbol) CUP$Syntax$stack.elementAt(CUP$Syntax$top-1)).value;
		RESULT = start_val;
              CUP$Syntax$result = parser.getSymbolFactory().newSymbol("$START",0, ((java_cup.runtime.Symbol)CUP$Syntax$stack.elementAt(CUP$Syntax$top-1)), ((java_cup.runtime.Symbol)CUP$Syntax$stack.peek()), RESULT);
            }
          /* ACCEPT */
          CUP$Syntax$parser.done_parsing();
          return CUP$Syntax$result;

          /* . . . . . .*/
          default:
            throw new Exception(
               "Invalid action number found in internal parse table");

        }
    }
}

