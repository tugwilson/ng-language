package ng.compiler.lexer.tokens;

import ng.compiler.parser.State;
import ng.compiler.parser.State.Value;

/**
 * @author John
 * 
 */
public class SemicolonToken extends Token {
  /*
   * (non-Javadoc)
   * 
   * @see ng.compiler.lexer.tokens.Token#transform(ng.compiler.parser.State,
   * ng.compiler.parser.State.Value)
   */
  @Override
  protected void transform(final State state, final Value currentValue) {
    switch (currentValue) {
    case possiblePackageQualifierDot:
      state.setCurrentState(Value.packageDeclared);
      break;

    case possibleImportQualifierDot:
    case importDeclared:
      state.popCurrentState();
      break;

    default:
      dontExpect(state, currentValue);
    }
  }

  protected void dontExpect(final State state, final Value currentValue) {
    super.transform(state, currentValue);
  }
}
