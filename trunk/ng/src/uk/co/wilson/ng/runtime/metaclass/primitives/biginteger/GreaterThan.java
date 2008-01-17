package uk.co.wilson.ng.runtime.metaclass.primitives.biginteger;

import java.math.BigDecimal;
import java.math.BigInteger;

import ng.runtime.metaclass.MetaClass;
import ng.runtime.threadcontext.ThreadContext;
/*
 * Created on 17 Jan 2008
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
public class GreaterThan extends BaseBooleanComparison {
  public Object doApply(final ThreadContext tc, final Object lhs, final Object rhs) {
    return tc.greaterThan().apply((BigInteger)lhs, rhs);
  }

  public Object doApply(final ThreadContext tc, final Object lhs, final MetaClass rhsMetaClass, final Object rhs) {
    return tc.greaterThan().apply((BigInteger)lhs, rhsMetaClass, rhs);
  }

  public Object doReverseApply(final ThreadContext tc, final Object lhs, final Object rhs) {
    return tc.greaterThan().apply(lhs, (BigInteger)rhs);
  }

  public boolean doApplyBoolean(final ThreadContext tc, final Object lhs, final Object rhs) {
    return tc.greaterThan().applyBoolean((BigInteger)lhs, rhs);
  }

  public boolean doApplyBoolean(final ThreadContext tc, final Object lhs, final MetaClass rhsMetaClass, final Object rhs) {
    return tc.greaterThan().applyBoolean((BigInteger)lhs, rhsMetaClass, rhs);
  }

  public boolean doReverseApplyBoolean(final ThreadContext tc, final Object lhs, final Object rhs) {
    return tc.greaterThan().applyBoolean(lhs, (BigInteger)rhs);
  }

  public boolean doApplyBoolean(final ThreadContext tc, final char lhs, final Object rhs) {
    return tc.greaterThan().applyBoolean(lhs, (BigInteger)rhs);
  }

  public boolean doApplyBoolean(final ThreadContext tc, final byte lhs, final Object rhs) {
    return tc.greaterThan().applyBoolean(lhs, (BigInteger)rhs);
  }

  public boolean doApplyBoolean(final ThreadContext tc, final short lhs, final Object rhs) {
    return tc.greaterThan().applyBoolean(lhs, (BigInteger)rhs);
  }

  public boolean doApplyBoolean(final ThreadContext tc, final int lhs, final Object rhs) {
    return tc.greaterThan().applyBoolean(lhs, (BigInteger)rhs);
  }

  public boolean doApplyBoolean(final ThreadContext tc, final long lhs, final Object rhs) {
    return tc.greaterThan().applyBoolean(lhs, (BigInteger)rhs);
  }

  public boolean doApplyBoolean(final ThreadContext tc, final float lhs, final Object rhs) {
    return tc.greaterThan().applyBoolean(lhs, (BigInteger)rhs);
  }

  public boolean doApplyBoolean(final ThreadContext tc, final double lhs, final Object rhs) {
    return tc.greaterThan().applyBoolean(lhs, (BigInteger)rhs);
  }

  public boolean doApplyBoolean(final ThreadContext tc, final BigInteger lhs, final Object rhs) {
    return lhs.compareTo((BigInteger)rhs) > 0;
  }

  public boolean doApplyBoolean(final ThreadContext tc, final BigDecimal lhs, final Object rhs) {
    return lhs.compareTo((BigDecimal)rhs) > 0;
  }

  public boolean doApplyBoolean(final ThreadContext tc, final BigInteger lhs, final char rhs) {
    return lhs.compareTo(BigInteger.valueOf(rhs)) > 0;
  }

  public boolean doApplyBoolean(final ThreadContext tc, final BigInteger lhs, final byte rhs) {
    return lhs.compareTo(BigInteger.valueOf(rhs)) > 0;
  }

  public boolean doApplyBoolean(final ThreadContext tc, final BigInteger lhs, final short rhs) {
    return lhs.compareTo(BigInteger.valueOf(rhs)) > 0;
  }

  public boolean doApplyBoolean(final ThreadContext tc, final BigInteger lhs, final int rhs) {
    return lhs.compareTo(BigInteger.valueOf(rhs)) > 0;
  }

  public boolean doApplyBoolean(final ThreadContext tc, final BigInteger lhs, final long rhs) {
    return lhs.compareTo(BigInteger.valueOf(rhs)) > 0;
  }

  public boolean doApplyBoolean(final ThreadContext tc, final BigInteger lhs, final float rhs) {
    return lhs.compareTo(BigInteger.valueOf((long)rhs)) > 0;
  }

  public boolean doApplyBoolean(final ThreadContext tc, final BigInteger lhs, final double rhs) {
    return lhs.compareTo(BigInteger.valueOf((long)rhs)) > 0;
  }

  public boolean doApplyBoolean(final ThreadContext tc, final BigInteger lhs, final BigInteger rhs) {
    return lhs.compareTo(rhs) > 0;
  }

  public boolean doApplyBoolean(final ThreadContext tc, final BigInteger lhs, final BigDecimal rhs) {
    return BigDecimal.valueOf(lhs.longValue()).compareTo(rhs) > 0;
  }
}
