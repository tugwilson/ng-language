package uk.co.wilson.ng.runtime.metaclass.primitives;

import java.math.BigDecimal;
import java.math.BigInteger;

import ng.runtime.metaclass.Conversion;
import ng.runtime.threadcontext.NotPerformed;
import ng.runtime.threadcontext.ThreadContext;

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
   * @see ng.runtime.metaclass.Conversion#doAsBigDecimal(ng.runtime.threadcontext.ThreadContext, java.lang.Object)
   */
  public BigDecimal doAsBigDecimal(ThreadContext tc, Object instance) throws NotPerformed {
    return this.delegate.doAsBigDecimal(tc, instance);
  }

  /**
   * @param tc
   * @param instance
   * @return
   * @throws NotPerformed
   * @see ng.runtime.metaclass.Conversion#doAsBigInteger(ng.runtime.threadcontext.ThreadContext, java.lang.Object)
   */
  public BigInteger doAsBigInteger(ThreadContext tc, Object instance) throws NotPerformed {
    return this.delegate.doAsBigInteger(tc, instance);
  }

  /**
   * @param tc
   * @param instance
   * @return
   * @throws NotPerformed
   * @see ng.runtime.metaclass.Conversion#doAsBoolean(ng.runtime.threadcontext.ThreadContext, java.lang.Object)
   */
  public boolean doAsBoolean(ThreadContext tc, Object instance) throws NotPerformed {
    return this.delegate.doAsBoolean(tc, instance);
  }

  /**
   * @param tc
   * @param instance
   * @return
   * @throws NotPerformed
   * @see ng.runtime.metaclass.Conversion#doAsByte(ng.runtime.threadcontext.ThreadContext, java.lang.Object)
   */
  public byte doAsByte(ThreadContext tc, Object instance) throws NotPerformed {
    return this.delegate.doAsByte(tc, instance);
  }

  /**
   * @param tc
   * @param instance
   * @return
   * @throws NotPerformed
   * @see ng.runtime.metaclass.Conversion#doAsChar(ng.runtime.threadcontext.ThreadContext, java.lang.Object)
   */
  public char doAsChar(ThreadContext tc, Object instance) throws NotPerformed {
    return this.delegate.doAsChar(tc, instance);
  }

  /**
   * @param tc
   * @param instance
   * @return
   * @throws NotPerformed
   * @see ng.runtime.metaclass.Conversion#doAsDouble(ng.runtime.threadcontext.ThreadContext, java.lang.Object)
   */
  public double doAsDouble(ThreadContext tc, Object instance) throws NotPerformed {
    return this.delegate.doAsDouble(tc, instance);
  }

  /**
   * @param tc
   * @param instance
   * @return
   * @throws NotPerformed
   * @see ng.runtime.metaclass.Conversion#doAsFloat(ng.runtime.threadcontext.ThreadContext, java.lang.Object)
   */
  public float doAsFloat(ThreadContext tc, Object instance) throws NotPerformed {
    return this.delegate.doAsFloat(tc, instance);
  }

  /**
   * @param tc
   * @param instance
   * @return
   * @throws NotPerformed
   * @see ng.runtime.metaclass.Conversion#doAsInt(ng.runtime.threadcontext.ThreadContext, java.lang.Object)
   */
  public int doAsInt(ThreadContext tc, Object instance) throws NotPerformed {
    return this.delegate.doAsInt(tc, instance);
  }

  /**
   * @param tc
   * @param instance
   * @return
   * @throws NotPerformed
   * @see ng.runtime.metaclass.Conversion#doAsLong(ng.runtime.threadcontext.ThreadContext, java.lang.Object)
   */
  public long doAsLong(ThreadContext tc, Object instance) throws NotPerformed {
    return this.delegate.doAsLong(tc, instance);
  }

  /**
   * @param tc
   * @param instance
   * @return
   * @throws NotPerformed
   * @see ng.runtime.metaclass.Conversion#doAsShort(ng.runtime.threadcontext.ThreadContext, java.lang.Object)
   */
  public short doAsShort(ThreadContext tc, Object instance) throws NotPerformed {
    return this.delegate.doAsShort(tc, instance);
  }

  /**
   * @param tc
   * @param instance
   * @return
   * @throws NotPerformed
   * @see ng.runtime.metaclass.Conversion#doAsString(ng.runtime.threadcontext.ThreadContext, java.lang.Object)
   */
  public String doAsString(ThreadContext tc, Object instance) throws NotPerformed {
    return this.delegate.doAsString(tc, instance);
  }

  /**
   * @param tc
   * @param instance
   * @param type
   * @return
   * @see ng.runtime.metaclass.Conversion#doAsType(ng.runtime.threadcontext.ThreadContext, java.lang.Object, java.lang.Class)
   */
  public Object doAsType(ThreadContext tc, Object instance, Class<?> type) {
    return this.delegate.doAsType(tc, instance, type);
  }

  /**
   * @param tc
   * @param value
   * @return
   * @see ng.runtime.metaclass.Conversion#doAsYourType(ng.runtime.threadcontext.ThreadContext, java.math.BigDecimal)
   */
  public Object doAsYourType(ThreadContext tc, BigDecimal value) {
    return this.delegate.doAsYourType(tc, value);
  }

  /**
   * @param tc
   * @param value
   * @return
   * @see ng.runtime.metaclass.Conversion#doAsYourType(ng.runtime.threadcontext.ThreadContext, java.math.BigInteger)
   */
  public Object doAsYourType(ThreadContext tc, BigInteger value) {
    return this.delegate.doAsYourType(tc, value);
  }

  /**
   * @param tc
   * @param value
   * @return
   * @see ng.runtime.metaclass.Conversion#doAsYourType(ng.runtime.threadcontext.ThreadContext, boolean)
   */
  public Object doAsYourType(ThreadContext tc, boolean value) {
    return this.delegate.doAsYourType(tc, value);
  }

  /**
   * @param tc
   * @param value
   * @return
   * @see ng.runtime.metaclass.Conversion#doAsYourType(ng.runtime.threadcontext.ThreadContext, byte)
   */
  public Object doAsYourType(ThreadContext tc, byte value) {
    return this.delegate.doAsYourType(tc, value);
  }

  /**
   * @param tc
   * @param value
   * @return
   * @see ng.runtime.metaclass.Conversion#doAsYourType(ng.runtime.threadcontext.ThreadContext, char)
   */
  public Object doAsYourType(ThreadContext tc, char value) {
    return this.delegate.doAsYourType(tc, value);
  }

  /**
   * @param tc
   * @param value
   * @return
   * @see ng.runtime.metaclass.Conversion#doAsYourType(ng.runtime.threadcontext.ThreadContext, double)
   */
  public Object doAsYourType(ThreadContext tc, double value) {
    return this.delegate.doAsYourType(tc, value);
  }

  /**
   * @param tc
   * @param value
   * @return
   * @see ng.runtime.metaclass.Conversion#doAsYourType(ng.runtime.threadcontext.ThreadContext, float)
   */
  public Object doAsYourType(ThreadContext tc, float value) {
    return this.delegate.doAsYourType(tc, value);
  }

  /**
   * @param tc
   * @param value
   * @return
   * @see ng.runtime.metaclass.Conversion#doAsYourType(ng.runtime.threadcontext.ThreadContext, int)
   */
  public Object doAsYourType(ThreadContext tc, int value) {
    return this.delegate.doAsYourType(tc, value);
  }

  /**
   * @param tc
   * @param value
   * @return
   * @see ng.runtime.metaclass.Conversion#doAsYourType(ng.runtime.threadcontext.ThreadContext, long)
   */
  public Object doAsYourType(ThreadContext tc, long value) {
    return this.delegate.doAsYourType(tc, value);
  }

  /**
   * @param tc
   * @param instance
   * @return
   * @see ng.runtime.metaclass.Conversion#doAsYourType(ng.runtime.threadcontext.ThreadContext, java.lang.Object)
   */
  public Object doAsYourType(ThreadContext tc, Object instance) {
    return this.delegate.doAsYourType(tc, instance);
  }

  /**
   * @param tc
   * @param value
   * @return
   * @see ng.runtime.metaclass.Conversion#doAsYourType(ng.runtime.threadcontext.ThreadContext, short)
   */
  public Object doAsYourType(ThreadContext tc, short value) {
    return this.delegate.doAsYourType(tc, value);
  }
}
