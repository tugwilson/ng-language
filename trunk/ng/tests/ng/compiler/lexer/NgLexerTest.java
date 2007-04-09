package ng.compiler.lexer;

import java.io.IOException;
import java.io.StringReader;

import ng.compiler.lexer.tokens.*;

import junit.framework.TestCase;
/*
 * Created on 8 Apr 2007
 *
 * Copyright 2007 John G. Wilson
 *
 *   Licensed under the Apache License, Version 2.0 (the "License");
 *   you may not use this file except in compliance with the License.
 *   You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 *   Unless required by applicable law or agreed to in writing, software
 *   distributed under the License is distributed on an "AS IS" BASIS,
 *   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *   See the License for the specific language governing permissions and
 *   limitations under the License.
 *
 */

/**
 * @author John
 *
 */
public class NgLexerTest extends TestCase {
  public void testSymbolRecognition() throws IOException {
    final NgLexer lexer = new NgLexer(new StringReader("+ ++ += - -- -= / /= % %= ÷ ÷= * *= ** **= & &= && | |= || ^ ^= >> >>= >>> >>>= << <<= = == != > >= < <= <=> ! ~,[](){}"));
    final Class[] expected = new Class[] {
        PlusToken.class, IncrementToken.class, PlusEqualsToken.class,
        MinusToken.class, DecrementToken.class, MinusEqualsToken.class,
        DivideToken.class, DivideEqualsToken.class,
        ModuloToken.class, ModuloEqualsToken.class,
        IntDivToken.class, IntDivEqualsToken.class,
        MultiplyToken.class, MultiplyEqualsToken.class, PowerToken.class, PowerEqualsToken.class,
        ArithmeticAndToken.class, ArithmeticAndEqualsToken.class, BooleanAndToken.class,
        ArithmeticOrToken.class, ArithmeticOrEqualsToken.class, BooleanOrToken.class,
        ArithmeticXorToken.class, ArithmeticXorEqualsToken.class,
        RightShiftToken.class, RightShiftEqualsToken.class, LogicalRightShiftToken.class, LogicalRightShiftEqualsToken.class,
        LeftShiftToken.class, LeftShiftEqualsToken.class,
        EqualsToken.class, EqualsEqualsToken.class, NotEqualsToken.class,
        GreaterThanToken.class, GreaterThanOrEqualsToken.class,
        LessThanToken.class, LessThanOrEqualsToken.class,
        CompareToken.class,
        NotToken.class,
        ComplementToken.class,
        CommaToken.class,
        OpenSquareBracketToken.class, CloseSquareBracketToken.class,
        OpenRoundBracketToken.class, CloseRoundBracketToken.class,
        OpenCurlyBracketToken.class, CloseCurlyBracketToken.class,      
        EOFToken.class
    };
    
      for (int i = 0; i != expected.length; i++) {
        assertEquals(expected[i], lexer.nextToken().getClass());
      }
    }
  public void testKeywordRecognition() throws IOException {
    final NgLexer lexer = new NgLexer(new StringReader(
        "abstract abstract1 assert assert1 any any1 as as1 " +
        "boolean boolean1 break break1 byte byte1 " +
        "continue continue1 case case1 catch catch1 char char1 class class1 " +
        "default default1 double double1 def def1 do do1 " +
        "extends extends1 enum enum1 else else1 " +
        "finally finally1 final finall false false1 float float1 for for1 " +
        "instanceof instanceof1  interface interface1 import import1 int int1 in in1 if if1 " +
        "long long1 " +
        ""
        ));
    final Class[] expected = new Class[] {
        AbstractToken.class, IdentifierToken.class, AssertToken.class, IdentifierToken.class, AnyToken.class, IdentifierToken.class, AsToken.class, IdentifierToken.class, 
        BooleanToken.class, IdentifierToken.class, BreakToken.class, IdentifierToken.class, ByteToken.class, IdentifierToken.class, 
        ContinueToken.class, IdentifierToken.class, CaseToken.class, IdentifierToken.class, CatchToken.class, IdentifierToken.class, CharToken.class, IdentifierToken.class, ClassToken.class, IdentifierToken.class, 
        DefaultToken.class, IdentifierToken.class, DoubleToken.class, IdentifierToken.class, DefToken.class, IdentifierToken.class, DoToken.class, IdentifierToken.class,
        ExtendsToken.class, IdentifierToken.class, EnumToken.class, IdentifierToken.class, ElseToken.class, IdentifierToken.class,
        FinallyToken.class, IdentifierToken.class, FinalToken.class, IdentifierToken.class, FalseToken.class, IdentifierToken.class, FloatToken.class, IdentifierToken.class, ForToken.class, IdentifierToken.class,
        InstanceofToken.class, IdentifierToken.class, InterfaceToken.class, IdentifierToken.class, ImportToken.class, IdentifierToken.class, IntToken.class, IdentifierToken.class, InToken.class, IdentifierToken.class, IfToken.class, IdentifierToken.class,
        LongToken.class, IdentifierToken.class,
        EOFToken.class
    };
    
      for (int i = 0; i != expected.length; i++) {
        assertEquals(expected[i], lexer.nextToken().getClass());
      }
    }
}
