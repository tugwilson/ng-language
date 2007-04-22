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
    final NgLexer lexer = new NgLexer(new StringReader("+ ++ += - -- -= / /= % %= ÷ ÷= * *= ** **= & &= && | |= || ^ ^= >> >>= >>> >>>= << <<= = == != > >= < <= <=> ! ~,[](){} :; . ... ? \r\n\n\r\u001a"));
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
        ColonToken.class, SemicolonToken.class,
        DotToken.class, EllipsisToken.class,
        QuestionmarkToken.class,
        EOLToken.class, EOLToken.class, EOLToken.class, EOFToken.class
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
        "native native1 null null1 new new1 " +
        "protected protected1 package package1 private private1 public public1 " +
        "return return1 " +
        "synchronized synchronized1 strictfp strictfp1 switch switch1 static static1 short short1 super super1 " +
        "threadsafe threadsafe1 transient transient1 throws throws1 throw throw1 this this1 true true1 try try1 " +
        "volatile volatile1 void void1 " +
        "while while1 "
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
        NativeToken.class, IdentifierToken.class, NullToken.class, IdentifierToken.class, NewToken.class, IdentifierToken.class,
        ProtectedToken.class, IdentifierToken.class, PackageToken.class, IdentifierToken.class, PrivateToken.class, IdentifierToken.class, PublicToken.class, IdentifierToken.class,
        ReturnToken.class, IdentifierToken.class,
        SynchronizedToken.class, IdentifierToken.class, StrictfpToken.class, IdentifierToken.class, SwitchToken.class, IdentifierToken.class, StaticToken.class, IdentifierToken.class, ShortToken.class, IdentifierToken.class, SuperToken.class, IdentifierToken.class,
        ThreadsafeToken.class, IdentifierToken.class, TransientToken.class, IdentifierToken.class, ThrowsToken.class, IdentifierToken.class, ThrowToken.class, IdentifierToken.class, ThisToken.class, IdentifierToken.class, TrueToken.class, IdentifierToken.class, TryToken.class, IdentifierToken.class,
        VolatileToken.class, IdentifierToken.class, VoidToken.class, IdentifierToken.class,
        WhileToken.class, IdentifierToken.class,
        EOFToken.class
    };
    
    for (int i = 0; i != expected.length; i++) {
      assertEquals(expected[i], lexer.nextToken().getClass());
    }
  }
  
  public void testIdentifierRecognition() throws IOException {
  final NgLexer lexer = new NgLexer(new StringReader(
        "abc ad123 oaBc_d @abc @ad123 @aBc_d @ "));
  final Class[] expected = new Class[] {
        IdentifierToken.class, IdentifierToken.class, IdentifierToken.class,
        FieldnameToken.class, FieldnameToken.class, FieldnameToken.class,
        ErrorToken.class,
        EOFToken.class
    };
    
    for (int i = 0; i != expected.length; i++) {
      assertEquals(expected[i], lexer.nextToken().getClass());
    }
  }
  
  public void testNumberRecognition() throws IOException {
  final NgLexer lexer = new NgLexer(new StringReader(
        "123 123l 123L " +
        "0X01 0x02Bl 0x0aL " +
        "01 022l 0145L 08" +
        "123g 1234567890G  1. " +
        "0X01g 0x02BG  0x0a. " +
        "01g 0221G  0123. " +
        ".1 0.1 0e+1 0.0e-1 0.0e1 " +
        ".1g 0.1G 0e+1g 0.0e-1G 0.0e1G " +
        ".1f 0.1f 0e+1F 0.0e-1F 0.0e1F " +
        ".1D 0.1d 0e+1D 0.0e-1d 0.0e1d "
        ));
  final Class[] expected = new Class[] {
        IntLiteralToken.class, LongLiteralToken.class, LongLiteralToken.class,
        IntLiteralToken.class, LongLiteralToken.class, LongLiteralToken.class,
        IntLiteralToken.class, LongLiteralToken.class, LongLiteralToken.class, ErrorToken.class,
        BigIntegerLiteralToken.class, BigIntegerLiteralToken.class, IntLiteralToken.class, DotToken.class,
        BigIntegerLiteralToken.class, BigIntegerLiteralToken.class, IntLiteralToken.class, DotToken.class,
        BigIntegerLiteralToken.class, BigIntegerLiteralToken.class, IntLiteralToken.class, DotToken.class,
        BigDecimalLiteralToken.class, BigDecimalLiteralToken.class, BigDecimalLiteralToken.class, BigDecimalLiteralToken.class, BigDecimalLiteralToken.class, 
        BigDecimalLiteralToken.class, BigDecimalLiteralToken.class, BigDecimalLiteralToken.class, BigDecimalLiteralToken.class, BigDecimalLiteralToken.class, 
        FloatLiteralToken.class, FloatLiteralToken.class, FloatLiteralToken.class, FloatLiteralToken.class, FloatLiteralToken.class,
        DoubleLiteralToken.class, DoubleLiteralToken.class, DoubleLiteralToken.class, DoubleLiteralToken.class, DoubleLiteralToken.class, 
        EOFToken.class
    };
    
    for (int i = 0; i != expected.length; i++) {
      assertEquals(expected[i], lexer.nextToken().getClass());
    }
  }
  
  public void testCommentRecognition() throws IOException {
  final NgLexer lexer = new NgLexer(new StringReader(
      " xyz // dsh r ur  //  gg  g \r" + 
      " xyz // dsh r ur  //  gg  g \n" + 
      " xyz // dsh r ur  //  gg  g \r\n" + 
      " xyz /* dd \r\n hfhg \r gfhghgh \n HHHH */ hfhfhfhf \r" + 
      ""));
  final Class[] expected = new Class[] {
      IdentifierToken.class, LineCommentToken.class, EOLToken.class,
      IdentifierToken.class, LineCommentToken.class, EOLToken.class,
      IdentifierToken.class, LineCommentToken.class, EOLToken.class,
      IdentifierToken.class, BlockCommentToken.class, IdentifierToken.class, EOLToken.class,
      EOFToken.class
    };
    
    for (int i = 0; i != expected.length; i++) {
      assertEquals(expected[i], lexer.nextToken().getClass());
    }
  }
  
  public void testStringRecognition() throws IOException {
  final NgLexer lexer = new NgLexer(new StringReader(
      "'' 'hello' '\\b\\t\\n\\f\\r\\\"\\'\\\\\\0\\07\\7\\123\\65' ' "));
  final Class[] expected = new Class[] {
      SingleQuoteStringToken.class, SingleQuoteStringToken.class, SingleQuoteStringToken.class, ErrorToken.class,
      EOFToken.class
  };
  
    for (int i = 0; i != expected.length; i++) {
      assertEquals(expected[i], lexer.nextToken().getClass());
    }
  }
}
