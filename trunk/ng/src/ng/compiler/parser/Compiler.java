package ng.compiler.parser;

import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;

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
