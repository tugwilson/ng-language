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
  
    while (c == ' ' || c == '\t' || c == '\f') c = this.reader.read();
    
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
        if (c1 == '=') return new MultiplyEqualsToken();
        if (c1 == '*') {
          this.reader.mark(1);
          if (this.reader.read() == '=') {
            return new PowerEqualsToken();
          }
          this.reader.reset();
          return new PowerToken();
        }
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
          if (this.reader.read() == '=') return new LeftShiftEqualsToken();
          this.reader.reset();
          return new LeftShiftToken();
        }
        if (c1 == '=') {
          this.reader.mark(1);
          if (this.reader.read() == '>') {
            return new CompareToken();
          }
          this.reader.reset();
          return new LessThanOrEqualsToken();
        }
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
        
      case '@':
        this.reader.mark(1);
        c1 = this.reader.read();
        
        if (isIdentifierStartCharacter(c1)) {
          return new FieldnameToken(c1, this.reader);
        } else {
          this.reader.reset();
          new ErrorToken();
        }
        
      case 'a': {
        final String value = assembleChars(7);
        if (!isIdentifierPartCharacter(value.charAt(7)) && value.startsWith("bstract")) {
          this.reader.reset();
          this.reader.skip(7);
          return new AbstractToken();
        } else if (!isIdentifierPartCharacter(value.charAt(5)) && value.startsWith("ssert")) {
          this.reader.reset();
          this.reader.skip(5);
          return new AssertToken();
        } else if (!isIdentifierPartCharacter(value.charAt(2)) && value.startsWith("ny")) {
          this.reader.reset();
          this.reader.skip(2);
          return new AnyToken();
        } else if (!isIdentifierPartCharacter(value.charAt(1)) && value.startsWith("s")) {
          this.reader.reset();
          this.reader.skip(1);
          return new AsToken();
        } else {
          this.reader.reset();
          return new IdentifierToken('a', this.reader); 
        }
      }
      
      case 'b': {
        final String value = assembleChars(6);
        if (!isIdentifierPartCharacter(value.charAt(6)) && value.startsWith("oolean")) {
          this.reader.reset();
          this.reader.skip(6);
          return new BooleanToken();
        } else if (!isIdentifierPartCharacter(value.charAt(4)) && value.startsWith("reak")) {
          this.reader.reset();
          this.reader.skip(4);
          return new BreakToken();
        } else if (!isIdentifierPartCharacter(value.charAt(3)) && value.startsWith("yte")) {
          this.reader.reset();
          this.reader.skip(3);
          return new ByteToken();
        } else {
          this.reader.reset();
          return new IdentifierToken('b', this.reader); 
        }
      }
      
      case 'c': {
        final String value = assembleChars(7);
        if (!isIdentifierPartCharacter(value.charAt(7)) && value.startsWith("ontinue")) {
          this.reader.reset();
          this.reader.skip(7);
          return new ContinueToken();
        } else if (!isIdentifierPartCharacter(value.charAt(4)) && value.startsWith("atch")) {
          this.reader.reset();
          this.reader.skip(4);
          return new CatchToken();
        } else if (!isIdentifierPartCharacter(value.charAt(4)) && value.startsWith("lass")) {
          this.reader.reset();
          this.reader.skip(4);
          return new ClassToken();
        } else if (!isIdentifierPartCharacter(value.charAt(3)) && value.startsWith("ase")) {
          this.reader.reset();
          this.reader.skip(3);
          return new CaseToken();
        } else if (!isIdentifierPartCharacter(value.charAt(3)) && value.startsWith("har")) {
          this.reader.reset();
          this.reader.skip(3);
          return new CharToken();
        } else {
          this.reader.reset();
          return new IdentifierToken('c', this.reader); 
        }
      }
      
      case 'd': {
        final String value = assembleChars(6);
        if (!isIdentifierPartCharacter(value.charAt(6)) && value.startsWith("efault")) {
          this.reader.reset();
          this.reader.skip(6);
          return new DefaultToken();
        } else if (!isIdentifierPartCharacter(value.charAt(5)) && value.startsWith("ouble")) {
          this.reader.reset();
          this.reader.skip(5);
          return new DoubleToken();
        } else if (!isIdentifierPartCharacter(value.charAt(2)) && value.startsWith("ef")) {
          this.reader.reset();
          this.reader.skip(2);
          return new DefToken();
        } else if (!isIdentifierPartCharacter(value.charAt(1)) && value.startsWith("o")) {
          this.reader.reset();
          this.reader.skip(1);
          return new DoToken();
        } else {
          this.reader.reset();
          return new IdentifierToken('d', this.reader); 
        }
      }
      
      case 'e': {
        final String value = assembleChars(6);
        if (!isIdentifierPartCharacter(value.charAt(6)) && value.startsWith("xtends")) {
          this.reader.reset();
          this.reader.skip(6);
          return new ExtendsToken();
        } else if (!isIdentifierPartCharacter(value.charAt(3)) && value.startsWith("num")) {
          this.reader.reset();
          this.reader.skip(3);
          return new EnumToken();
        } else if (!isIdentifierPartCharacter(value.charAt(3)) && value.startsWith("lse")) {
          this.reader.reset();
          this.reader.skip(3);
          return new ElseToken();
        } else {
          this.reader.reset();
          return new IdentifierToken('e', this.reader); 
        }
      }
      
      case 'f': {
        final String value = assembleChars(6);
        if (!isIdentifierPartCharacter(value.charAt(6)) && value.startsWith("inally")) {
          this.reader.reset();
          this.reader.skip(6);
          return new FinallyToken();
        } else if (!isIdentifierPartCharacter(value.charAt(4)) && value.startsWith("inal")) {
          this.reader.reset();
          this.reader.skip(4);
          return new FinalToken();
        } else if (!isIdentifierPartCharacter(value.charAt(4)) && value.startsWith("alse")) {
          this.reader.reset();
          this.reader.skip(4);
          return new FalseToken();
        } else if (!isIdentifierPartCharacter(value.charAt(4)) && value.startsWith("loat")) {
          this.reader.reset();
          this.reader.skip(4);
          return new FloatToken();
        } else if (!isIdentifierPartCharacter(value.charAt(2)) && value.startsWith("or")) {
          this.reader.reset();
          this.reader.skip(2);
          return new ForToken();
        } else {
          this.reader.reset();
          return new IdentifierToken('f', this.reader); 
        }
      }
      
      case 'i': {
        final String value = assembleChars(9);
        if (!isIdentifierPartCharacter(value.charAt(9)) && value.startsWith("nstanceof")) {
          this.reader.reset();
          this.reader.skip(9);
          return new InstanceofToken();
        } else if (!isIdentifierPartCharacter(value.charAt(8)) && value.startsWith("nterface")) {
          this.reader.reset();
          this.reader.skip(8);
          return new InterfaceToken();
        } else if (!isIdentifierPartCharacter(value.charAt(5)) && value.startsWith("mport")) {
          this.reader.reset();
          this.reader.skip(5);
          return new ImportToken();
        } else if (!isIdentifierPartCharacter(value.charAt(2)) && value.startsWith("nt")) {
          this.reader.reset();
          this.reader.skip(2);
          return new IntToken();
        } else if (!isIdentifierPartCharacter(value.charAt(1)) && value.startsWith("n")) {
          this.reader.reset();
          this.reader.skip(1);
          return new InToken();
        } else if (!isIdentifierPartCharacter(value.charAt(1)) && value.startsWith("f")) {
          this.reader.reset();
          this.reader.skip(1);
          return new IfToken();
        } else {
          this.reader.reset();
          return new IdentifierToken('i', this.reader); 
        }
      }
      
      case 'l': {
        final String value = assembleChars(3);
        if (!isIdentifierPartCharacter(value.charAt(3)) && value.startsWith("ong")) {
          this.reader.reset();
          this.reader.skip(3);
          return new LongToken();
        } else {
          this.reader.reset();
          return new IdentifierToken('l', this.reader); 
        }
      }
      
      case 'n': {
        final String value = assembleChars(5);
        if (!isIdentifierPartCharacter(value.charAt(5)) && value.startsWith("ative")) {
          this.reader.reset();
          this.reader.skip(5);
          return new NativeToken();
        } else if (!isIdentifierPartCharacter(value.charAt(3)) && value.startsWith("ull")) {
          this.reader.reset();
          this.reader.skip(3);
          return new NullToken();
        } else if (!isIdentifierPartCharacter(value.charAt(2)) && value.startsWith("ew")) {
          this.reader.reset();
          this.reader.skip(2);
          return new NewToken();
        } else {
          this.reader.reset();
          return new IdentifierToken('n', this.reader); 
        }
      }
      
      case 'p': {
        final String value = assembleChars(8);
        if (!isIdentifierPartCharacter(value.charAt(8)) && value.startsWith("rotected")) {
          this.reader.reset();
          this.reader.skip(8);
          return new ProtectedToken();
        } else if (!isIdentifierPartCharacter(value.charAt(6)) && value.startsWith("rivate")) {
          this.reader.reset();
          this.reader.skip(6);
          return new PrivateToken();
        } else if (!isIdentifierPartCharacter(value.charAt(5)) && value.startsWith("ublic")) {
          this.reader.reset();
          this.reader.skip(5);
          return new PublicToken();
        } else {
          this.reader.reset();
          return new IdentifierToken('p', this.reader); 
        }
      }
      
      case 'r': {
        final String value = assembleChars(5);
        if (!isIdentifierPartCharacter(value.charAt(5)) && value.startsWith("eturn")) {
          this.reader.reset();
          this.reader.skip(5);
          return new ReturnToken();
        } else {
          this.reader.reset();
          return new IdentifierToken('r', this.reader); 
        }
      }
      
      case 's': {
        final String value = assembleChars(11);
        if (!isIdentifierPartCharacter(value.charAt(11)) && value.startsWith("ynchronized")) {
          this.reader.reset();
          this.reader.skip(11);
          return new SynchronizedToken();
        } else if (!isIdentifierPartCharacter(value.charAt(7)) && value.startsWith("trictfp")) {
          this.reader.reset();
          this.reader.skip(7);
          return new StrictfpToken();
        } else if (!isIdentifierPartCharacter(value.charAt(5)) && value.startsWith("witch")) {
          this.reader.reset();
          this.reader.skip(5);
          return new SwitchToken();
        } else if (!isIdentifierPartCharacter(value.charAt(5)) && value.startsWith("tatic")) {
          this.reader.reset();
          this.reader.skip(5);
          return new StaticToken();
        } else if (!isIdentifierPartCharacter(value.charAt(4)) && value.startsWith("hort")) {
          this.reader.reset();
          this.reader.skip(4);
          return new ShortToken();
        } else if (!isIdentifierPartCharacter(value.charAt(4)) && value.startsWith("uper")) {
          this.reader.reset();
          this.reader.skip(4);
          return new SuperToken();
        } else {
          this.reader.reset();
          return new IdentifierToken('s', this.reader); 
        }
      }
      
      case 't': {
        final String value = assembleChars(9);
        if (!isIdentifierPartCharacter(value.charAt(9)) && value.startsWith("hreadsafe")) {
          this.reader.reset();
          this.reader.skip(9);
          return new ThreadsafeToken();
        } else if (!isIdentifierPartCharacter(value.charAt(8)) && value.startsWith("ransient")) {
          this.reader.reset();
          this.reader.skip(8);
          return new TransientToken();
        } else if (!isIdentifierPartCharacter(value.charAt(5)) && value.startsWith("hrows")) {
          this.reader.reset();
          this.reader.skip(5);
          return new ThrowsToken();
        } else if (!isIdentifierPartCharacter(value.charAt(4)) && value.startsWith("hrow")) {
          this.reader.reset();
          this.reader.skip(4);
          return new ThrowToken();
        } else if (!isIdentifierPartCharacter(value.charAt(3)) && value.startsWith("his")) {
          this.reader.reset();
          this.reader.skip(3);
          return new ThisToken();
        } else if (!isIdentifierPartCharacter(value.charAt(3)) && value.startsWith("rue")) {
          this.reader.reset();
          this.reader.skip(3);
          return new TrueToken();
        } else if (!isIdentifierPartCharacter(value.charAt(2)) && value.startsWith("ry")) {
          this.reader.reset();
          this.reader.skip(2);
          return new TryToken();
        } else {
          this.reader.reset();
          return new IdentifierToken('t', this.reader); 
        }
      }
      
      case 'v': {
        final String value = assembleChars(7);
        if (!isIdentifierPartCharacter(value.charAt(7)) && value.startsWith("olatile")) {
          this.reader.reset();
          this.reader.skip(3);
          return new VolatileToken();
        } else if (!isIdentifierPartCharacter(value.charAt(3)) && value.startsWith("oid")) {
          this.reader.reset();
          this.reader.skip(3);
          return new VoidToken();
        } else {
          this.reader.reset();
          return new IdentifierToken('v', this.reader); 
        }
      }
      
      case 'w': {
        final String value = assembleChars(4);
        if (!isIdentifierPartCharacter(value.charAt(4)) && value.startsWith("hile")) {
          this.reader.reset();
          this.reader.skip(4);
          return new WhileToken();
        } else {
          this.reader.reset();
          return new IdentifierToken('w', this.reader); 
        }
      }
        
      default:
        if (isIdentifierStartCharacter(c)) {
          return new IdentifierToken(c, this.reader);
        } else {
          return new ErrorToken();
        }
    }
  }
  
  public static boolean isIdentifierStartCharacter(final int c) {
    return Character.isJavaIdentifierStart(c);
  }
  
  public static boolean isIdentifierPartCharacter(final int c) {
    return Character.isJavaIdentifierPart(c);
  }
  
  private String assembleChars(final int size) throws IOException {
  final StringBuilder buf = new StringBuilder(size);
  
    this.reader.mark(size + 1);
    
    for (int i = 0; i != size + 1; i++) {
      buf.append((char)this.reader.read());
    }
    
    this.reader.reset();
    return buf.toString();
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
