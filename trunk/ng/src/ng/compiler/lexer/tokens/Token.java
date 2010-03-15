package ng.compiler.lexer.tokens;

import ng.compiler.parser.State;
import ng.compiler.parser.State.Value;

/**
 * @author John
 * 
 */
public abstract class Token {
  public void transform(final State state) {
    transform(state, state.getCurrentState());
  }

  protected void transform(final State state, final Value currentValue) {
    state.setError(true);
    state.setDone(true);
  }
}
