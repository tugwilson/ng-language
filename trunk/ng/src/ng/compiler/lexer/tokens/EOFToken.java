package ng.compiler.lexer.tokens;

import ng.compiler.parser.State;
import ng.compiler.parser.State.Value;

/**
 * @author John
 *
 */
public class EOFToken extends Token {
  /* (non-Javadoc)
   * @see ng.compiler.lexer.tokens.Token#transform(ng.compiler.parser.State, ng.compiler.parser.State.Value)
   */
  @Override
  protected void transform(final State state, final Value currentValue) {
    switch (currentValue) {
      case start:
      case packageDeclared:
        state.setCurrentState(Value.finished);
        break;

      default:
        state.setError(true);
    }

    state.setDone(true);
  }
}
