package ng.compiler.lexer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.Reader;
import java.math.BigDecimal;
import java.math.BigInteger;

import ng.compiler.lexer.tokens.*;

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
  int c1, c2;
  
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
          while(true) {
            c2 = this.reader.read();
            if (c2 == -1){
              return new ErrorToken();
            }
            this.reader.mark(1);
            if (c2 == '*' && this.reader.read() == '/') {
              return new BlockCommentToken();
            } else 
              this.reader.reset();
            
            }
        }
        if (c1 == '/') {
          while(true) {
            this.reader.mark(1);
            c2 = this.reader.read();
            if (c2 == -1 || c2 == '\n' || c2 == '\r') {
              this.reader.reset();
              return new LineCommentToken();
            }
          }
          
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
        
      case '+':
        this.reader.mark(1);
        c1 = this.reader.read();
        c2 = this.reader.read();
        if (c1 == '+') return new IncrementToken();
        if (c1 == '=') return new PlusEqualsToken();
        this.reader.reset();
        if(Character.isDigit(c1) || (c1 == '.' && Character.isDigit(c2))) return parseNumericConstant('+');
        return new PlusToken();
        
      case '-':
        this.reader.mark(2);
        c1 = this.reader.read();
        c2 = this.reader.read();
        if (c1 == '-') return new DecrementToken();
        if (c1 == '=') return new MinusEqualsToken();
        this.reader.reset();
        if(Character.isDigit(c1) || (c1 == '.' && Character.isDigit(c2))) return parseNumericConstant('-');
        return new MinusToken();
        
      case '.':
        this.reader.mark(2);
        c1 = this.reader.read();
        if (c1 == '.' && this.reader.read() == '.') return new EllipsisToken();
        this.reader.reset();
        if (Character.isDigit(c1)) return parseRealConstant('.');
        return new DotToken();
        
      case '0':
      case '1':
      case '2':
      case '3':
      case '4':
      case '5':
      case '6':
      case '7':
      case '8':
      case '9':
        return parseNumericConstant(c);
        
      default:
        if (identifierStartCharacter(c)) {
          return new IdentifierToken(this.reader);
        } else {
          return new ErrorToken();
        }
    }
  }
  
  private boolean identifierStartCharacter(final int c) {
    return Character.isJavaIdentifierStart(c);
  }
  
  private Token parseNumericConstant(int c) throws IOException {
  final StringBuilder buf = new StringBuilder();
  
    buf.append(c);
    
    return parseNumericConstant(buf);
  }
  
  private Token parseNumericConstant(final StringBuilder buf) throws IOException {
    while(true) {
      this.reader.mark(1);
      final int c = this.reader.read();
      
      switch(c) {
        case '0':
        case '1':
        case '2':
        case '3':
        case '4':
        case '5':
        case '6':
        case '7':
        case '8':
        case '9':
          buf.append(c);
          break;
          
        case '.':
          buf.append(c);
          return parseRealConstant(buf);
          
        case 'e':
        case 'E':
          buf.append(c);
          return parseExponentPart(buf);
          
        case 'l':
        case 'L':
          return new LongLiteralToken(Long.parseLong(buf.toString()));
          
        case 'g':
        case 'G':
          return new BigIntegerLiteralToken(new BigInteger(buf.toString()));
          
        default:
          reader.reset();
          return new IntLiteralToken(Integer.parseInt(buf.toString()));
      }
    }
  }
  
  private Token parseRealConstant(final int c) throws IOException {
    final StringBuilder buf = new StringBuilder();
    
    buf.append(c);
    
    return parseRealConstant(buf);
  } 
  
  private Token parseRealConstant(final StringBuilder buf) throws IOException {
    while(true) {
      this.reader.mark(1);
      final int c = this.reader.read();
      
      switch(c) {
        case '0':
        case '1':
        case '2':
        case '3':
        case '4':
        case '5':
        case '6':
        case '7':
        case '8':
        case '9':
          buf.append(c);
          break;
          
        case 'e':
        case 'E':
          buf.append(c);
          return parseExponentPart(buf);
          
        case 'f':
        case 'F':
          return new FloatLiteralToken(Float.parseFloat(buf.toString()));
          
        case 'd':
        case 'D':
          return new DoubleLiteralToken(Double.parseDouble(buf.toString()));
          
        default:
          reader.reset();          
        case 'g':
        case 'G':
          return new BigDecimalLiteralToken(new BigDecimal(buf.toString()));
      }
    }
  }
  
  private Token parseExponentPart(final StringBuilder buf) throws IOException {
    this.reader.mark(1);
    final int c = this.reader.read();
  
    if (c == '+' || c == '-') {
      buf.append(c);
    } else {
      this.reader.reset();
    }
    
    return parseRestOfExponentPart(buf);
  }
  
  private Token parseRestOfExponentPart(final StringBuilder buf) throws IOException {
    while(true) {
      this.reader.mark(1);
      final int c = this.reader.read();
      
      switch(c) {
        case '0':
        case '1':
        case '2':
        case '3':
        case '4':
        case '5':
        case '6':
        case '7':
        case '8':
        case '9':
          buf.append(c);
          break;
          
        case 'f':
        case 'F':
          return new FloatLiteralToken(Float.parseFloat(buf.toString()));
          
        case 'd':
        case 'D':
          return new DoubleLiteralToken(Double.parseDouble(buf.toString()));
          
        default:
          reader.reset();
        case 'g':
        case 'G':
          return new BigDecimalLiteralToken(new BigDecimal(buf.toString()));
      }
      
    }
  }
}
