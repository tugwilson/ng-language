package ng.compiler.lexer.tokens;

import ng.compiler.parser.State;
import ng.compiler.parser.State.Value;

/**
 * @author John
 *
 */
public class ImportToken extends KeywordToken {
  /* (non-Javadoc)
   * @see ng.compiler.lexer.tokens.Token#transform(ng.compiler.parser.State, ng.compiler.parser.State.Value)
   */
  @Override
  protected void transform(final State state, final Value currentValue) {
    switch (currentValue) {
      case start:
      case packageDeclared:
        state.pushCurrentState(Value.expectingImportName);
        break;
      
      default:
        super.transform(state, currentValue);
    }
  }
}
