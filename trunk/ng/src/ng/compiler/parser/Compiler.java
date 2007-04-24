package ng.compiler.parser;

import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;

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

import ng.compiler.lexer.NgLexer;

/**
 * @author John
 *
 */
public class Compiler {
  public Object compile(final String source) throws IOException {
    return compile(new StringReader(source));
  }
  
  public Object compile(final Reader sourceReader) throws IOException {
  final NgLexer lexer = new NgLexer(sourceReader);
  final State state = new State();
  
    while (!state.isDone()) {
      lexer.nextToken().transform(state);
      
      if (state.isError()) {
        // TODO: handle the error here
      }
    }
    
    return null;
  }
}