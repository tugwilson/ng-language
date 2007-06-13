package ng.compiler.lexer.tokens;

import ng.compiler.parser.State;
import ng.compiler.parser.State.Value;

/**
 * @author John
 *
 */
public class EOLToken extends SemicolonToken {
  /* (non-Javadoc)
   * @see ng.compiler.lexer.tokens.SemicolonToken#dontExpect(ng.compiler.parser.State, ng.compiler.parser.State.Value)
   */
  @Override
  protected void dontExpect(final State state, final Value currentValue) {
    // Ignore
  }
}
