package uk.co.wilson.ng.runtime.metaclass.primitives.charimpl;

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
public class GreaterThanOrEquals extends BaseBooleanComparison {
  public Object doApply(final ThreadContext tc, final Object lhs, final Object rhs) {
    return tc.greaterThanOrEquals().apply(tc.unwrapToChar(lhs), rhs);
  }

  public Object doApply(final ThreadContext tc, final Object lhs, final MetaClass rhsMetaClass, final Object rhs) {
    return tc.greaterThanOrEquals().apply(tc.unwrapToChar(lhs), rhsMetaClass, rhs);
  }

  public Object doReverseApply(final ThreadContext tc, final Object lhs, final Object rhs) {
    return tc.greaterThanOrEquals().apply(lhs, tc.unwrapToChar(rhs));
  }

  public boolean doApplyBoolean(final ThreadContext tc, final Object lhs, final Object rhs) {
    return tc.greaterThanOrEquals().applyBoolean(tc.unwrapToChar(lhs), rhs);
  }

  public boolean doApplyBoolean(final ThreadContext tc, final Object lhs, final MetaClass rhsMetaClass, final Object rhs) {
    return tc.greaterThanOrEquals().applyBoolean(tc.unwrapToChar(lhs), rhsMetaClass, rhs);
  }

  public boolean doReverseApplyBoolean(final ThreadContext tc, final Object lhs, final Object rhs) {
    return tc.greaterThanOrEquals().applyBoolean(lhs, tc.unwrapToChar(rhs));
  }

  public boolean doApplyBoolean(final ThreadContext tc, final char lhs, final Object rhs) {
    return tc.greaterThanOrEquals().applyBoolean(lhs, tc.unwrapToChar(rhs));
  }

  public boolean doApplyBoolean(final ThreadContext tc, final byte lhs, final Object rhs) {
    return tc.greaterThanOrEquals().applyBoolean(lhs, tc.unwrapToChar(rhs));
  }

  public boolean doApplyBoolean(final ThreadContext tc, final short lhs, final Object rhs) {
    return tc.greaterThanOrEquals().applyBoolean(lhs, tc.unwrapToChar(rhs));
  }

  public boolean doApplyBoolean(final ThreadContext tc, final int lhs, final Object rhs) {
    return tc.greaterThanOrEquals().applyBoolean(lhs, tc.unwrapToChar(rhs));
  }

  public boolean doApplyBoolean(final ThreadContext tc, final long lhs, final Object rhs) {
    return tc.greaterThanOrEquals().applyBoolean(lhs, tc.unwrapToChar(rhs));
  }

  public boolean doApplyBoolean(final ThreadContext tc, final float lhs, final Object rhs) {
    return tc.greaterThanOrEquals().applyBoolean(lhs, tc.unwrapToChar(rhs));
  }

  public boolean doApplyBoolean(final ThreadContext tc, final double lhs, final Object rhs) {
    return tc.greaterThanOrEquals().applyBoolean(lhs, tc.unwrapToChar(rhs));
  }

  public boolean doApplyBoolean(final ThreadContext tc, final BigInteger lhs, final Object rhs) {
    return tc.greaterThanOrEquals().applyBoolean(lhs, tc.unwrapToChar(rhs));
  }

  public boolean doApplyBoolean(final ThreadContext tc, final BigDecimal lhs, final Object rhs) {
    return tc.greaterThanOrEquals().applyBoolean(lhs, tc.unwrapToChar(rhs));
  }

  public boolean doApplyBoolean(final ThreadContext tc, final char lhs, final char rhs) {
    return lhs >= rhs;
  }

  public boolean doApplyBoolean(final ThreadContext tc, final char lhs, final byte rhs) {
    return lhs >= rhs;
  }

  public boolean doApplyBoolean(final ThreadContext tc, final char lhs, final short rhs) {
    return lhs >= rhs;
  }

  public boolean doApplyBoolean(final ThreadContext tc, final char lhs, final int rhs) {
    return lhs >= rhs;
  }

  public boolean doApplyBoolean(final ThreadContext tc, final char lhs, final long rhs) {
    return lhs >= rhs;
  }

  public boolean doApplyBoolean(final ThreadContext tc, final char lhs, final float rhs) {
    return lhs >= rhs;
  }

  public boolean doApplyBoolean(final ThreadContext tc, final char lhs, final double rhs) {
    return lhs >= rhs;
  }

  public boolean doApplyBoolean(final ThreadContext tc, final char lhs, final BigInteger rhs) {
    return BigInteger.valueOf(lhs).compareTo(rhs) >= 0;
  }

  public boolean doApplyBoolean(final ThreadContext tc, final char lhs, final BigDecimal rhs) {
    return BigDecimal.valueOf(lhs).compareTo(rhs) >= 0;
  }
}
