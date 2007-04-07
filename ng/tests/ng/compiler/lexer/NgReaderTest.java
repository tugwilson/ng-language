package ng.compiler.lexer;

import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;

import junit.framework.TestCase;



/**
 * @author John
 *
 */
public class NgReaderTest extends TestCase {
  public void testEscapes() throws IOException {
    assertEquals(" ", transform("\\u0020"));
    assertEquals("\\\\ ", transform("\\\\\\u0020"));
    assertEquals("\\\\\\\\ ", transform("\\\\\\\\\\u0020"));
    assertEquals(" ", transform("\\uu0020"));
    assertEquals(" ", transform("\\uuuu0020"));
    assertEquals(" ", transform("\\uuuuuu0020"));
    assertEquals("\\\\\\\\\\\\ ", transform("\\\\\\\\\\\\\\uuuuuuuu0020"));
  }
  
  public void testNonEscapes() throws IOException {
    assertEquals("\\u002x", transform("\\u002x"));
    assertEquals("\\uuuu002x", transform("\\uuuu002x"));
    assertEquals("\\u002", transform("\\u002"));
    assertEquals("\\u00", transform("\\u00"));
    assertEquals("\\u0", transform("\\u0"));
    assertEquals("\\u", transform("\\u"));
    assertEquals("\\", transform("\\"));
    assertEquals("", transform(""));
    assertEquals("\\\\u0020", transform("\\\\u0020"));
    assertEquals("\\\\\\\\\\\\u0020", transform("\\\\\\\\\\\\u0020"));
    assertEquals("\\\\\\\\\\\\\\\\\\\\u0020", transform("\\\\\\\\\\\\\\\\\\\\u0020"));
    assertEquals("\\\\uu0020", transform("\\\\uu0020"));
    assertEquals("\\\\uuuu0020", transform("\\\\uuuu0020"));
    assertEquals("\\\\uuuuuu0020", transform("\\\\uuuuuu0020"));
    assertEquals("\\\\\\\\\\\\\\\\\\\\\\\\\\\\uuuuuuuu0020", transform("\\\\\\\\\\\\\\\\\\\\\\\\\\\\uuuuuuuu0020"));
  }
  
  private String transform(final String source) throws IOException {
  final StringBuilder result = new StringBuilder();
  final Reader reader = new NgReader(new StringReader(source));
  
    while(true) {
    final int c = reader.read();
    
      if (c == -1) break;
      
      result.append((char)c);
    }
    
    return result.toString();
  }
}
