package ng.compiler.lexer.tokens;


/**
 * @author John
 *
 */
public class SingleQuoteStringToken extends StringToken {
  private final String value;

  public SingleQuoteStringToken(final String value) {
    this.value = value;
  }
}
