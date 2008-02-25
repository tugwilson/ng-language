package uk.co.wilson.ng.runtime.metaclass.primitives.bigdecimal;

import java.math.BigDecimal;
import java.math.BigInteger;

import ng.runtime.metaclass.Conversion;
import ng.runtime.threadcontext.NotPerformed;
import uk.co.wilson.ng.runtime.metaclass.primitives.ConversionWrapper;
import uk.co.wilson.ng.runtime.threadcontext.ExtendedThreadContext;

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
public class BigDecimalConversionWrapper extends ConversionWrapper implements BigDecimalConversion {

  /**
   * @param delegate
   */
  public BigDecimalConversionWrapper(final Conversion delegate) {
    super(delegate);
  }

  public BigInteger doAsBigInteger(final ExtendedThreadContext tc, final BigDecimal value) throws NotPerformed {
    return doAsBigInteger(tc, (Object)value);
  }

  public boolean doAsBoolean(final ExtendedThreadContext tc, final BigDecimal value) throws NotPerformed {
    return doAsBoolean(tc, (Object)value);
  }

  public byte doAsByte(final ExtendedThreadContext tc, final BigDecimal value) throws NotPerformed {
    return doAsByte(tc, (Object)value);
  }

  public char doAsChar(final ExtendedThreadContext tc, final BigDecimal value) throws NotPerformed {
    return doAsChar(tc, (Object)value);
  }

  public double doAsDouble(final ExtendedThreadContext tc, final BigDecimal value) throws NotPerformed {
    return doAsDouble(tc, (Object)value);
  }

  public float doAsFloat(final ExtendedThreadContext tc, final BigDecimal value) throws NotPerformed {
    return doAsFloat(tc, (Object)value);
  }

  public int doAsInt(final ExtendedThreadContext tc, final BigDecimal value) throws NotPerformed {
    return doAsInt(tc, (Object)value);
  }

  public long doAsLong(final ExtendedThreadContext tc, final BigDecimal value) throws NotPerformed {
    return doAsLong(tc, (Object)value);
  }

  public short doAsShort(final ExtendedThreadContext tc, final BigDecimal value) throws NotPerformed {
    return doAsShort(tc, (Object)value);
  }

  public String doAsString(final ExtendedThreadContext tc, final BigDecimal value) throws NotPerformed {
    return doAsString(tc, (Object)value);
  }
}
