package ng.compiler.lexer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.Reader;
/*
 * Created on 7 Apr 2007
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
import java.nio.CharBuffer;

/**
 * @author John
 *
 */
public class NgReader extends Reader {
  private final Reader reader;
  private boolean lastCharacterWasBackslash = false;
  
  public NgReader(final Reader reader) {
    if (reader.markSupported()) {
      this.reader = reader;
    } else {
      this.reader = new BufferedReader(reader);
    }
  }

  /**
   * @return
   * @throws IOException
   * @see java.io.Reader#read()
   */
  @Override
  public int read() throws IOException {
  final int c = this.reader.read();

    if (c == -1) return -1;
    
    if (!this.lastCharacterWasBackslash && c == '\\') {
      //
      //    Strictly, we may need to read past any number of \ and u characters
      //     but this is a reasonable limit
      //
      this.reader.mark(1024); 
      
      if (this.reader.read() == 'u') {
      final char charCode[] = new char[4];
        
        while((charCode[0] = (char)this.reader.read()) == 'u');
        
        for (int i = 1; i != 4; i++) {
          // if we are at EOF it's OK we will just get an illegal hex value and we will reset and return \
          charCode[i] = (char)this.reader.read();
        }
        
        try {
          return Integer.parseInt(String.valueOf(charCode), 16);
        } catch (final NumberFormatException e) {}
      }
      
      this.reader.reset();
    }
    
    this.lastCharacterWasBackslash = c == '\\' && !this.lastCharacterWasBackslash;
    return c;
  }

  /**
   * @param cbuf
   * @param off
   * @param len
   * @return
   * @throws IOException
   * @see java.io.Reader#read(char[], int, int)
   */
  @Override
  public int read(final char[] cbuf, final int off, final int len) throws IOException {
    for (int i = 0; i < len; i++) {
    final int c = read();
    
      if (c == -1) return i;
      
      cbuf[off + i] = (char)c;
    }
    
    return len;
  }

  /**
   * @param cbuf
   * @return
   * @throws IOException
   * @see java.io.Reader#read(char[])
   */
  @Override
  public int read(final char[] cbuf) throws IOException {
    return read(cbuf, 0, cbuf.length);
  }

  /**
   * @param target
   * @return
   * @throws IOException
   * @see java.io.Reader#read(java.nio.CharBuffer)
   */
  @Override
  public int read(final CharBuffer target) throws IOException {
  final int c = read();
  
    if (c == -1) return -1;
    
    target.put((char)c);
    
    return 1;
  }

  /**
   * @throws IOException
   * @see java.io.Reader#close()
   */
  @Override
  public void close() throws IOException {
    this.reader.close();
  }

  /**
   * @return
   * @throws IOException
   * @see java.io.Reader#ready()
   */
  @Override
  public boolean ready() throws IOException {
    return this.reader.ready();
  }

  /**
   * @param n
   * @return
   * @throws IOException
   * @see java.io.Reader#skip(long)
   */
  @Override
  public long skip(final long n) throws IOException {
    return this.reader.skip(n);
  }

  /**
   * @return
   * @see java.io.Reader#markSupported()
   */
  @Override
  public boolean markSupported() {
    return this.reader.markSupported();
  }

  /**
   * @param readAheadLimit
   * @throws IOException
   * @see java.io.Reader#mark(int)
   */
  @Override
  public void mark(final int readAheadLimit) throws IOException {
    throw new IOException("mark not supported");
  }

  /**
   * @throws IOException
   * @see java.io.Reader#reset()
   */
  @Override
  public void reset() throws IOException {
    throw new IOException("reset not supported");
  }
}
