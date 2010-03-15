package ng.compiler.lexer.tokens;

import java.io.IOException;
import java.io.Reader;

/**
 * @author John
 * 
 */
public class FieldnameToken extends IdentifierToken {
  public FieldnameToken(final int c, final Reader reader) throws IOException {
    super(c, reader);
  }
}
