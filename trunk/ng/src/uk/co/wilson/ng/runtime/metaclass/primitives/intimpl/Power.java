package uk.co.wilson.ng.runtime.metaclass.primitives.intimpl;

import java.math.BigDecimal;
import java.math.BigInteger;

import ng.runtime.metaclass.MetaClass;
import ng.runtime.threadcontext.ThreadContext;
/*
 * Created on 21 Jan 2008
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
public class Power extends BaseBinaryArithmeticOperation {
  public Object doApply(final ThreadContext tc, final Object lhs, final Object rhs) {
    return tc.power().apply(tc.unwrapToInt(lhs), rhs);
  }

  public Object doApply(final ThreadContext tc, final Object lhs, final MetaClass rhsMetaClass, final Object rhs) {
    return tc.power().apply(tc.unwrapToInt(lhs), rhsMetaClass, rhs);
  }

  public Object doReverseApply(final ThreadContext tc, final Object lhs, final Object rhs) {
    return tc.power().apply(lhs, tc.unwrapToInt(rhs));
  }

  public Object doApply(final ThreadContext tc, final char lhs, final Object rhs) {
    return tc.power().apply(lhs, tc.unwrapToInt(rhs));
  }

  public Object doApply(final ThreadContext tc, final byte lhs, final Object rhs) {
    return tc.power().apply(lhs, tc.unwrapToInt(rhs));
  }

  public Object doApply(final ThreadContext tc, final short lhs, final Object rhs) {
    return tc.power().apply(lhs, tc.unwrapToInt(rhs));
  }

  public Object doApply(final ThreadContext tc, final int lhs, final Object rhs) {
    return tc.power().apply(lhs, tc.unwrapToInt(rhs));
  }

  public Object doApply(final ThreadContext tc, final long lhs, final Object rhs) {
    return tc.power().apply(lhs, tc.unwrapToInt(rhs));
  }

  public Object doApply(final ThreadContext tc, final float lhs, final Object rhs) {
    return tc.power().apply(lhs, tc.unwrapToInt(rhs));
  }

  public Object doApply(final ThreadContext tc, final double lhs, final Object rhs) {
    return tc.power().apply(lhs, tc.unwrapToInt(rhs));
  }

  public Object doApply(final ThreadContext tc, final BigInteger lhs, final Object rhs) {
    return lhs.divide(BigInteger.valueOf(tc.unwrapToInt(rhs)));
  }

  public Object doApply(final ThreadContext tc, final BigDecimal lhs, final Object rhs) {
    return lhs.divideToIntegralValue(new BigDecimal(tc.unwrapToInt(rhs)));
  }

  public Object doApply(final ThreadContext tc, final int lhs, final char rhs) {
    return tc.wrap(lhs /  rhs);
  }

  public int doIntApply(final ThreadContext tc, final int lhs, final char rhs) {
    return (int)Math.pow(lhs, rhs);
  }

  public int doIntApply(final ThreadContext tc, final int lhs, final byte rhs) {
    return (int)Math.pow(lhs, rhs);
  }

  public int doIntApply(final ThreadContext tc, final int lhs, final short rhs) {
    return (int)Math.pow(lhs, rhs);
  }

  public int doIntApply(final ThreadContext tc, final int lhs, final int rhs) {
    return (int)Math.pow(lhs, rhs);
  }

  public long doLongApply(final ThreadContext tc, final int lhs, final long rhs) {
    return (long)Math.pow(lhs, rhs);
  }

  public float doFloatApply(final ThreadContext tc, final int lhs, final float rhs) {
    return (float)Math.pow(lhs, rhs);
  }

  public double doDoubleApply(final ThreadContext tc, final int lhs, final double rhs) {
    return Math.pow(lhs, rhs);
  }

  public BigInteger doBigIntegerApply(final ThreadContext tc, final int lhs, final BigInteger rhs) {
    return BigInteger.valueOf((long)Math.pow(lhs, rhs.doubleValue()));
  }

  public BigDecimal doBigDecimalApply(final ThreadContext tc, final int lhs, final BigDecimal rhs) {
    return BigDecimal.valueOf(Math.pow(lhs, rhs.doubleValue()));
  }
}
