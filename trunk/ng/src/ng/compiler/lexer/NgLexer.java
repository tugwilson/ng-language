package ng.compiler.lexer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.Reader;

import ng.compiler.lexer.tokens.*;
/*
 * Created on 7 Apr 2007
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
public class NgLexer {
  private final Reader reader;
  
  public NgLexer(final Reader reader) {
    if (reader.markSupported()) {
      this.reader = reader;
    } else {
      this.reader = new BufferedReader(reader);
    }
  }
  
  public Token nextToken() throws IOException {
  int c = this.reader.read();
  int c1;
  
    while (c == ' ' || c == '\t' || c == '\f') this.reader.read();
    
    switch (c) {
      case 0X1A:  // CTRL-Z
        if (this.reader.read() != -1) return new BadCharacterToken(c);
      case -1:
        return new EOFToken();
        
      case '\r':
        this.reader.mark(1);
        if (this.reader.read() != '\n') this.reader.reset();
      case '\n':
        return new EOLToken();
        
      case '"':
        this.reader.mark(2);
        if (this.reader.read() == '"' && this.reader.read() == '"') {
          return new TripleQuoteStringToken(this.reader);
        }
        this.reader.reset();
        return new DoubleQuoteStringToken(this.reader);
        
      case '\'':
        return new SingleQuoteStringToken(this.reader);
        
      case '+':
        this.reader.mark(1);
        c1 = this.reader.read();
        if (c1 == '+') return new IncrementToken();
        if (c1 == '=') return new PlusEqualsToken();
        this.reader.reset();
        return new PlusToken();
        
      case '-':
        this.reader.mark(1);
        c1 = this.reader.read();
        if (c1 == '-') return new DecrementToken();
        if (c1 == '=') return new MinusEqualsToken();
        this.reader.reset();
        return new MinusToken();
        
      case '*':
        this.reader.mark(1);
        c1 = this.reader.read();
        if (c1 == '*') return new PowerToken();
        if (c1 == '=') return new MultiplyEqualsToken();
        this.reader.reset();
        return new MultiplyToken();
        
      case '/':
        this.reader.mark(1);
        c1 = this.reader.read();
        if (c1 == '=') return new DivideEqualsToken();
        if (c1 == '*') {
          // TODO: consume the comment
        }
        if (c1 == '/') {
          //        TODO: consume the comment
        }
        this.reader.reset();
        return new DivideToken();
        
      case '%':
        this.reader.mark(1);
        c1 = this.reader.read();
        if (c1 == '=') return new ModuloEqualsToken();
        this.reader.reset();
        return new ModuloToken();
        
      case '÷':
        this.reader.mark(1);
        c1 = this.reader.read();
        if (c1 == '=') return new IntDivEqualsToken();
        this.reader.reset();
        return new IntDivToken();
        
      case '|':
        this.reader.mark(1);
        c1 = this.reader.read();
        if (c1 == '|') return new BooleanOrToken();
        if (c1 == '=') return new ArithmeticOrEqualsToken();
        this.reader.reset();
        return new ArithmeticOrToken();
        
      case '&':
        this.reader.mark(1);
        c1 = this.reader.read();
        if (c1 == '&') return new BooleanAndToken();
        if (c1 == '=') return new ArithmeticAndEqualsToken();
        this.reader.reset();
        return new ArithmeticAndToken();
        
      case '^':
        this.reader.mark(1);
        c1 = this.reader.read();
        if (c1 == '=') return new ArithmeticXorEqualsToken();
        this.reader.reset();
        return new ArithmeticXorToken();
        
      case '<':
        this.reader.mark(1);
        c1 = this.reader.read();
        if (c1 == '<') {
          this.reader.mark(1);
          if (this.reader.read() == '=') {
            this.reader.mark(1);
            if (this.reader.read() == '>') {
              return new CompareToken();
            }
            this.reader.reset();
            return new LeftShiftEqualsToken();
          }
          this.reader.reset();
          return new LeftShiftToken();
        }
        if (c1 == '=') return new LessThanOrEqualsToken();
        this.reader.reset();
        return new LessThanToken();
        
      case '>':
        this.reader.mark(1);
        c1 = this.reader.read();
        if (c1 == '>') {
          this.reader.mark(1);
          if (this.reader.read() == '=') {
            return new RightShiftEqualsToken();
          }
          this.reader.reset();
          if (this.reader.read() == '>') {
            this.reader.mark(1);
            if (this.reader.read() == '=') {
              return new LogicalRightShiftEqualsToken();
            }
            this.reader.reset();
            return new LogicalRightShiftToken();
          }
          this.reader.reset();
          return new RightShiftToken();
        }
        if (c1 == '=') return new GreaterThanOrEqualsToken();
        this.reader.reset();
        return new GreaterThanToken();
        
      case '=':
        this.reader.mark(1);
        c1 = this.reader.read();
        if (c1 == '=') return new EqualsEqualsToken();
        this.reader.reset();
        return new EqualsToken();
        
      case '!':
        this.reader.mark(1);
        c1 = this.reader.read();
        if (c1 == '=') return new NotEqualsToken();
        this.reader.reset();
        return new NotToken();
        
      case '~':
        return new ComplementToken();
        
      case '(':
        return new OpenRoundBracketToken();
        
      case ')':
        return new CloseRoundBracketToken();
        
      case '[':
        return new OpenSquareBracketToken();
        
      case ']':
        return new CloseSquareBracketToken();
        
      case '{':
        return new OpenCurlyBracketToken();
        
      case '}':
        return new CloseCurlyBracketToken();
        
      case ',':
        return new CommaToken();
        
      case ':':
        return new ColonToken();
        
      case ';':
        return new SemicolonToken();
        
      case '?':
        return new QuestionmarkToken();
        
        
      case '.':
        this.reader.mark(2);
        if (this.reader.read() == '.' && this.reader.read() == '.') return new EllipsisToken();
        this.reader.reset();
        return new DotToken();
    }
    
    return null;
  }
  
  private boolean identifierStartCharacter(final int c) {
    return false;
  }
}
