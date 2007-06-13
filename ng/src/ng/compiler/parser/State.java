package ng.compiler.parser;

import java.util.Stack;

/**
 * @author John
 *
 */
public class State {
  public enum Value {start, finished,
                     expectingPackageName, possiblePackageQualifierDot, packageDeclared,
                     expectingImportName, possibleImportQualifierDot, expectingImportAsName, importDeclared};
  
  private boolean done = false;
  private boolean error = false;
  private Value currentState = Value.start;
  private final Stack<Value> stateStack = new Stack<Value>();
  
  public boolean isDone() {
    return this.done;
  }
  
  public void setDone(final boolean done) {
    this.done = done;
  }

  public boolean isError() {
    return this.error;
  }

  public void setError(final boolean error) {
    this.error = error;
  }

  public Value getCurrentState() {
    return this.currentState;
  }

  public void setCurrentState(final Value currentState) {
    this.currentState = currentState;
  }
  
  public Value popCurrentState() {
    this.currentState = this.stateStack.pop();
    return getCurrentState();
  }
  
  public void pushCurrentState(final Value currentState) {
    this.stateStack.push(this.currentState);
    setCurrentState(currentState);
  }
}
