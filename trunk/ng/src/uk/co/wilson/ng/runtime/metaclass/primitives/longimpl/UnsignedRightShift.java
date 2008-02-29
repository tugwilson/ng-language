package uk.co.wilson.ng.runtime.metaclass.primitives.longimpl;

import java.math.BigDecimal;
import java.math.BigInteger;

import ng.runtime.metaclass.MetaClass;
import ng.runtime.threadcontext.ExtendedThreadContext;
import ng.runtime.threadcontext.NotPerformed;
/*
 * Created on 28 Feb 2008
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
public class UnsignedRightShift extends BaseShiftOperation {
  public Object doApply(final ExtendedThreadContext tc, final Object lhs, final Object rhs) {
    return tc.unsignedRightShift().apply(tc.unwrapToLong(lhs), rhs);
  }

  public Object doApply(final ExtendedThreadContext tc, final Object lhs, final MetaClass rhsMetaClass, final Object rhs) {
    return tc.unsignedRightShift().apply(tc.unwrapToLong(lhs), rhsMetaClass, rhs);
  }

  public Object doReverseApply(final ExtendedThreadContext tc, final Object lhs, final Object rhs) {
    return tc.unsignedRightShift().apply(lhs, tc.unwrapToLong(rhs));
  }

  public long doLongApply(ExtendedThreadContext tc, long lhs, char rhs) throws NotPerformed {
    return lhs >>> rhs;
  }

  public long doLongApply(ExtendedThreadContext tc, long lhs, byte rhs) throws NotPerformed {
    return lhs >>> rhs;
  }

  public long doLongApply(ExtendedThreadContext tc, long lhs, short rhs) throws NotPerformed {
    return lhs >>> rhs;
  }

  public long doLongApply(ExtendedThreadContext tc, long lhs, int rhs) throws NotPerformed {
    return lhs >>> rhs;
  }

  public long doLongApply(ExtendedThreadContext tc, long lhs, long rhs) throws NotPerformed {
    return lhs >>> rhs;
  }

  public long doLongApply(ExtendedThreadContext tc, long lhs, BigInteger rhs) throws NotPerformed {
    return lhs >>> rhs.longValue();
  }

  public Object doApply(ExtendedThreadContext tc, char lhs, Object rhs) {
    return tc.unsignedRightShift().apply(lhs, tc.unwrapToLong(rhs));
  }

  public Object doApply(ExtendedThreadContext tc, byte lhs, Object rhs) {
    return tc.unsignedRightShift().apply(lhs, tc.unwrapToLong(rhs));
  }

  public Object doApply(ExtendedThreadContext tc, short lhs, Object rhs) {
    return tc.unsignedRightShift().apply(lhs, tc.unwrapToLong(rhs));
  }

  public Object doApply(ExtendedThreadContext tc, int lhs, Object rhs) {
    return tc.unsignedRightShift().apply(lhs, tc.unwrapToLong(rhs));
  }

  public Object doApply(ExtendedThreadContext tc, long lhs, Object rhs) {
    return tc.unsignedRightShift().apply(lhs, tc.unwrapToLong(rhs));
  }

  public Object doApply(ExtendedThreadContext tc, float lhs, Object rhs) {
    return tc.unsignedRightShift().apply(lhs, tc.unwrapToLong(rhs));
  }

  public Object doApply(ExtendedThreadContext tc, double lhs, Object rhs) {
    return tc.unsignedRightShift().apply(lhs, tc.unwrapToLong(rhs));
  }

  public Object doApply(ExtendedThreadContext tc, BigInteger lhs, Object rhs) {
    return tc.unsignedRightShift().apply(lhs, tc.unwrapToLong(rhs));
  }

  public Object doApply(ExtendedThreadContext tc, BigDecimal lhs, Object rhs) {
    return tc.unsignedRightShift().apply(lhs, tc.unwrapToLong(rhs));
  }
}
