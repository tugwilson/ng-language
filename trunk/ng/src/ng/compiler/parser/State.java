package ng.compiler.parser;
/*
 * Created on 16 Apr 2007
 *
 * Copyright 2007 John G. Wilson
 *
 *   Licensed under the Apache License, Version 2.0 (the "License");
 *   you may not use this file except in compliance with the License.
 *   You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 *   Unless required by applicable law or agreed to in writing, software
 *   distributed under the License is distributed on an "AS IS" BASIS,
 *   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *   See the License for the specific language governing permissions and
 *   limitations under the License.
 *
 */

/**
 * @author John
 *
 */
public class State {
  public enum Value {start, canFinish, finished};
  
  private boolean done = false;
  private boolean error = false;
  private Value currentState = Value.start;
  
  public boolean isDone() {
    return this.done;
  }
  
  public void setDone(boolean done) {
    this.done = done;
  }

  public boolean isError() {
    return this.error;
  }

  public void setError(boolean error) {
    this.error = error;
  }

  public Value getCurrentState() {
    return this.currentState;
  }

  public void setCurrentState(final Value currentState) {
    this.currentState = currentState;
  }
  
}
