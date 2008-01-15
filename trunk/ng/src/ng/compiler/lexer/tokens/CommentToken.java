package ng.compiler.lexer.tokens;

import ng.compiler.parser.State;

/**
 * @author John
 *
 */
public abstract class CommentToken extends Token {
  /* (non-Javadoc)
   * @see ng.compiler.lexer.tokens.Token#transform(ng.compiler.parser.State)
   */
  @Override
  public void transform(final State state) {
    // Do nothing
  }
}
