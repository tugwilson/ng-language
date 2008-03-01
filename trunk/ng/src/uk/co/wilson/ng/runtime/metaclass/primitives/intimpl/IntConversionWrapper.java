package uk.co.wilson.ng.runtime.metaclass.primitives.intimpl;
import java.math.BigDecimal;
import java.math.BigInteger;

import ng.runtime.metaclass.Conversion;
import ng.runtime.metaclass.primitives.intimpl.IntConversion;
import ng.runtime.threadcontext.ExtendedThreadContext;
import ng.runtime.threadcontext.NotPerformed;
import uk.co.wilson.ng.runtime.metaclass.primitives.ConversionWrapper;

/*
 * Created on 10 Feb 2008
 *
 * Copyright 2008 John G. Wilson
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
public class IntConversionWrapper extends ConversionWrapper implements IntConversion {

  /**
   * @param delegate
   */
  public IntConversionWrapper(final Conversion delegate) {
    super(delegate);
  }

  public BigDecimal doAsBigDecimal(final ExtendedThreadContext tc, final int value) throws NotPerformed {
    return doAsBigDecimal(tc, tc.wrap(value));
  }

  public BigInteger doAsBigInteger(final ExtendedThreadContext tc, final int value) throws NotPerformed {
    return doAsBigInteger(tc, tc.wrap(value));
  }

  public boolean doAsBoolean(final ExtendedThreadContext tc, final int value) throws NotPerformed {
    return doAsBoolean(tc, tc.wrap(value));
  }

  public char doAsChar(final ExtendedThreadContext tc, final int value) throws NotPerformed {
    return doAsChar(tc, tc.wrap(value));
  }

  public byte doAsByte(final ExtendedThreadContext tc, final int value) throws NotPerformed {
    return doAsByte(tc, tc.wrap(value));
  }

  public double doAsDouble(final ExtendedThreadContext tc, final int value) throws NotPerformed {
    return doAsDouble(tc, tc.wrap(value));
  }

  public float doAsFloat(final ExtendedThreadContext tc, final int value) throws NotPerformed {
    return doAsFloat(tc, tc.wrap(value));
  }

  public long doAsLong(final ExtendedThreadContext tc, final int value) throws NotPerformed {
    return doAsLong(tc, tc.wrap(value));
  }

  public short doAsShort(final ExtendedThreadContext tc, final int value) throws NotPerformed {
    return doAsShort(tc, tc.wrap(value));
  }

  public String doAsString(final ExtendedThreadContext tc, final int value) throws NotPerformed {
    return doAsString(tc, tc.wrap(value));
  }
}
