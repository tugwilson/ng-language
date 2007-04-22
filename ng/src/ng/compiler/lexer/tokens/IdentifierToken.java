package ng.compiler.lexer.tokens;

import java.io.IOException;
import java.io.Reader;
/*
 * Created on 8 Apr 2007
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

import ng.compiler.lexer.NgLexer;
import ng.compiler.parser.State;
import ng.compiler.parser.State.Value;

/**
 * @author John
 *
 */
public class IdentifierToken extends Token {
  private final String name;
  
  public IdentifierToken(final int firstChar, final Reader reader) throws IOException {
  final StringBuilder buf = new StringBuilder();
  
    buf.append(firstChar);
    
    while(true) {
      reader.mark(1);
      final int c = reader.read();
      
      if (NgLexer.isIdentifierPartCharacter(c)) {
        buf.append(c);
      } else {
        break;
      }
    }
    
    reader.reset();
    this.name = buf.toString();
  }
  
  /* (non-Javadoc)
   * @see ng.compiler.lexer.tokens.Token#transform(ng.compiler.parser.State, ng.compiler.parser.State.Value)
   */
  @Override
  protected void transform(final State state, final Value currentValue) {
    switch (currentValue) {
      case expectingPackageName:
        state.setCurrentState(Value.possiblePackageQualifierDot);
        break;
                
      case expectingImportName:
        state.setCurrentState(Value.possibleImportQualifierDot);
        break;
    
      case expectingImportAsName:
        state.setCurrentState(Value.importDeclared);
        break;
    
      default:
        super.transform(state, currentValue);
    }
  }
}
