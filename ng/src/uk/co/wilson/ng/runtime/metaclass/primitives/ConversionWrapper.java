package uk.co.wilson.ng.runtime.metaclass.primitives;

import java.math.BigDecimal;
import java.math.BigInteger;

import ng.runtime.metaclass.Conversion;
import ng.runtime.threadcontext.NotPerformed;
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
public abstract class ConversionWrapper implements Conversion {
  private final Conversion delegate;

  public ConversionWrapper(final Conversion delegate) {
    this.delegate = delegate;
  }

  /**
   * @param tc
   * @param instance
   * @return
   * @throws NotPerformed
   * @see ng.runtime.metaclass.Conversion#doAsBigDecimal(uk.co.wilson.ng.runtime.threadcontext.ExtendedThreadContext, java.lang.Object)
   */
  public BigDecimal doAsBigDecimal(final ExtendedThreadContext tc, final Object instance) throws NotPerformed {
    return this.delegate.doAsBigDecimal(tc, instance);
  }

  /**
   * @param tc
   * @param instance
   * @return
   * @throws NotPerformed
   * @see ng.runtime.metaclass.Conversion#doAsBigInteger(uk.co.wilson.ng.runtime.threadcontext.ExtendedThreadContext, java.lang.Object)
   */
  public BigInteger doAsBigInteger(final ExtendedThreadContext tc, final Object instance) throws NotPerformed {
    return this.delegate.doAsBigInteger(tc, instance);
  }

  /**
   * @param tc
   * @param instance
   * @return
   * @throws NotPerformed
   * @see ng.runtime.metaclass.Conversion#doAsBoolean(uk.co.wilson.ng.runtime.threadcontext.ExtendedThreadContext, java.lang.Object)
   */
  public boolean doAsBoolean(final ExtendedThreadContext tc, final Object instance) throws NotPerformed {
    return this.delegate.doAsBoolean(tc, instance);
  }

  /**
   * @param tc
   * @param instance
   * @return
   * @throws NotPerformed
   * @see ng.runtime.metaclass.Conversion#doAsByte(uk.co.wilson.ng.runtime.threadcontext.ExtendedThreadContext, java.lang.Object)
   */
  public byte doAsByte(final ExtendedThreadContext tc, final Object instance) throws NotPerformed {
    return this.delegate.doAsByte(tc, instance);
  }

  /**
   * @param tc
   * @param instance
   * @return
   * @throws NotPerformed
   * @see ng.runtime.metaclass.Conversion#doAsChar(uk.co.wilson.ng.runtime.threadcontext.ExtendedThreadContext, java.lang.Object)
   */
  public char doAsChar(final ExtendedThreadContext tc, final Object instance) throws NotPerformed {
    return this.delegate.doAsChar(tc, instance);
  }

  /**
   * @param tc
   * @param instance
   * @return
   * @throws NotPerformed
   * @see ng.runtime.metaclass.Conversion#doAsDouble(uk.co.wilson.ng.runtime.threadcontext.ExtendedThreadContext, java.lang.Object)
   */
  public double doAsDouble(final ExtendedThreadContext tc, final Object instance) throws NotPerformed {
    return this.delegate.doAsDouble(tc, instance);
  }

  /**
   * @param tc
   * @param instance
   * @return
   * @throws NotPerformed
   * @see ng.runtime.metaclass.Conversion#doAsFloat(uk.co.wilson.ng.runtime.threadcontext.ExtendedThreadContext, java.lang.Object)
   */
  public float doAsFloat(final ExtendedThreadContext tc, final Object instance) throws NotPerformed {
    return this.delegate.doAsFloat(tc, instance);
  }

  /**
   * @param tc
   * @param instance
   * @return
   * @throws NotPerformed
   * @see ng.runtime.metaclass.Conversion#doAsInt(uk.co.wilson.ng.runtime.threadcontext.ExtendedThreadContext, java.lang.Object)
   */
  public int doAsInt(final ExtendedThreadContext tc, final Object instance) throws NotPerformed {
    return this.delegate.doAsInt(tc, instance);
  }

  /**
   * @param tc
   * @param instance
   * @return
   * @throws NotPerformed
   * @see ng.runtime.metaclass.Conversion#doAsLong(uk.co.wilson.ng.runtime.threadcontext.ExtendedThreadContext, java.lang.Object)
   */
  public long doAsLong(final ExtendedThreadContext tc, final Object instance) throws NotPerformed {
    return this.delegate.doAsLong(tc, instance);
  }

  /**
   * @param tc
   * @param instance
   * @return
   * @throws NotPerformed
   * @see ng.runtime.metaclass.Conversion#doAsShort(uk.co.wilson.ng.runtime.threadcontext.ExtendedThreadContext, java.lang.Object)
   */
  public short doAsShort(final ExtendedThreadContext tc, final Object instance) throws NotPerformed {
    return this.delegate.doAsShort(tc, instance);
  }

  /**
   * @param tc
   * @param instance
   * @return
   * @throws NotPerformed
   * @see ng.runtime.metaclass.Conversion#doAsString(uk.co.wilson.ng.runtime.threadcontext.ExtendedThreadContext, java.lang.Object)
   */
  public String doAsString(final ExtendedThreadContext tc, final Object instance) throws NotPerformed {
    return this.delegate.doAsString(tc, instance);
  }

  /**
   * @param tc
   * @param instance
   * @param type
   * @return
   * @see ng.runtime.metaclass.Conversion#doAsType(uk.co.wilson.ng.runtime.threadcontext.ExtendedThreadContext, java.lang.Object, java.lang.Class)
   */
  public Object doAsType(final ExtendedThreadContext tc, final Object instance, final Class<?> type) {
    return this.delegate.doAsType(tc, instance, type);
  }

  /**
   * @param tc
   * @param value
   * @return
   * @see ng.runtime.metaclass.Conversion#doAsYourType(uk.co.wilson.ng.runtime.threadcontext.ExtendedThreadContext, java.math.BigDecimal)
   */
  public Object doAsYourType(final ExtendedThreadContext tc, final BigDecimal value) {
    return this.delegate.doAsYourType(tc, value);
  }

  /**
   * @param tc
   * @param value
   * @return
   * @see ng.runtime.metaclass.Conversion#doAsYourType(uk.co.wilson.ng.runtime.threadcontext.ExtendedThreadContext, java.math.BigInteger)
   */
  public Object doAsYourType(final ExtendedThreadContext tc, final BigInteger value) {
    return this.delegate.doAsYourType(tc, value);
  }

  /**
   * @param tc
   * @param value
   * @return
   * @see ng.runtime.metaclass.Conversion#doAsYourType(uk.co.wilson.ng.runtime.threadcontext.ExtendedThreadContext, boolean)
   */
  public Object doAsYourType(final ExtendedThreadContext tc, final boolean value) {
    return this.delegate.doAsYourType(tc, value);
  }

  /**
   * @param tc
   * @param value
   * @return
   * @see ng.runtime.metaclass.Conversion#doAsYourType(uk.co.wilson.ng.runtime.threadcontext.ExtendedThreadContext, byte)
   */
  public Object doAsYourType(final ExtendedThreadContext tc, final byte value) {
    return this.delegate.doAsYourType(tc, value);
  }

  /**
   * @param tc
   * @param value
   * @return
   * @see ng.runtime.metaclass.Conversion#doAsYourType(uk.co.wilson.ng.runtime.threadcontext.ExtendedThreadContext, char)
   */
  public Object doAsYourType(final ExtendedThreadContext tc, final char value) {
    return this.delegate.doAsYourType(tc, value);
  }

  /**
   * @param tc
   * @param value
   * @return
   * @see ng.runtime.metaclass.Conversion#doAsYourType(uk.co.wilson.ng.runtime.threadcontext.ExtendedThreadContext, double)
   */
  public Object doAsYourType(final ExtendedThreadContext tc, final double value) {
    return this.delegate.doAsYourType(tc, value);
  }

  /**
   * @param tc
   * @param value
   * @return
   * @see ng.runtime.metaclass.Conversion#doAsYourType(uk.co.wilson.ng.runtime.threadcontext.ExtendedThreadContext, float)
   */
  public Object doAsYourType(final ExtendedThreadContext tc, final float value) {
    return this.delegate.doAsYourType(tc, value);
  }

  /**
   * @param tc
   * @param value
   * @return
   * @see ng.runtime.metaclass.Conversion#doAsYourType(uk.co.wilson.ng.runtime.threadcontext.ExtendedThreadContext, int)
   */
  public Object doAsYourType(final ExtendedThreadContext tc, final int value) {
    return this.delegate.doAsYourType(tc, value);
  }

  /**
   * @param tc
   * @param value
   * @return
   * @see ng.runtime.metaclass.Conversion#doAsYourType(uk.co.wilson.ng.runtime.threadcontext.ExtendedThreadContext, long)
   */
  public Object doAsYourType(final ExtendedThreadContext tc, final long value) {
    return this.delegate.doAsYourType(tc, value);
  }

  /**
   * @param tc
   * @param instance
   * @return
   * @see ng.runtime.metaclass.Conversion#doAsYourType(uk.co.wilson.ng.runtime.threadcontext.ExtendedThreadContext, java.lang.Object)
   */
  public Object doAsYourType(final ExtendedThreadContext tc, final Object instance) {
    return this.delegate.doAsYourType(tc, instance);
  }

  /**
   * @param tc
   * @param value
   * @return
   * @see ng.runtime.metaclass.Conversion#doAsYourType(uk.co.wilson.ng.runtime.threadcontext.ExtendedThreadContext, short)
   */
  public Object doAsYourType(final ExtendedThreadContext tc, final short value) {
    return this.delegate.doAsYourType(tc, value);
  }
}
