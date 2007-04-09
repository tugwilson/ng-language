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
        "" +
        "" +
        "" +
        "" +
        "" +
        "" +
        "" +
        "" +
        ""
        ));
    final Class[] expected = new Class[] {
        AbstractToken.class, IdentifierToken.class, AssertToken.class, IdentifierToken.class, AnyToken.class, IdentifierToken.class, AsToken.class, IdentifierToken.class, 
        EOFToken.class
    };
    
      for (int i = 0; i != expected.length; i++) {
        assertEquals(expected[i], lexer.nextToken().getClass());
      }
    }
}
