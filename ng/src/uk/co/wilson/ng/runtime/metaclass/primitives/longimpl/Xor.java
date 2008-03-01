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
public class Xor extends BaseBinaryLogicalOperation {
  public Object doApply(final ExtendedThreadContext tc, final Object lhs, final Object rhs) {
    return tc.xor().apply(tc.unwrapToLong(lhs), rhs);
  }

  public Object doApply(final ExtendedThreadContext tc, final Object lhs, final MetaClass rhsMetaClass, final Object rhs) {
    return tc.xor().apply(tc.unwrapToLong(lhs), rhsMetaClass, rhs);
  }

  public Object doReverseApply(final ExtendedThreadContext tc, final Object lhs, final Object rhs) {
    return tc.xor().apply(lhs, tc.unwrapToLong(rhs));
  }

  public long doLongApply(final ExtendedThreadContext tc, final long lhs, final char rhs) throws NotPerformed {
    return lhs ^ rhs;
  }

  public long doLongApply(final ExtendedThreadContext tc, final long lhs, final byte rhs) throws NotPerformed {
    return lhs ^ rhs;
  }

  public long doLongApply(final ExtendedThreadContext tc, final long lhs, final short rhs) throws NotPerformed {
    return lhs ^ rhs;
  }

  public long doLongApply(final ExtendedThreadContext tc, final long lhs, final int rhs) throws NotPerformed {
    return lhs ^ rhs;
  }

  public long doLongApply(final ExtendedThreadContext tc, final long lhs, final long rhs) throws NotPerformed {
    return lhs ^ rhs;
  }

  public BigInteger doBigIntegerApply(final ExtendedThreadContext tc, final long lhs, final BigInteger rhs) throws NotPerformed {
    return BigInteger.valueOf(lhs).xor(rhs);
  }

  public Object doApply(final ExtendedThreadContext tc, final char lhs, final Object rhs) {
    return tc.xor().apply(lhs, tc.unwrapToLong(rhs));
  }

  public Object doApply(final ExtendedThreadContext tc, final byte lhs, final Object rhs) {
    return tc.xor().apply(lhs, tc.unwrapToLong(rhs));
  }

  public Object doApply(final ExtendedThreadContext tc, final short lhs, final Object rhs) {
    return tc.xor().apply(lhs, tc.unwrapToLong(rhs));
  }

  public Object doApply(final ExtendedThreadContext tc, final int lhs, final Object rhs) {
    return tc.xor().apply(lhs, tc.unwrapToLong(rhs));
  }

  public Object doApply(final ExtendedThreadContext tc, final long lhs, final Object rhs) {
    return tc.xor().apply(lhs, tc.unwrapToLong(rhs));
  }

  public Object doApply(final ExtendedThreadContext tc, final float lhs, final Object rhs) {
    return tc.xor().apply(lhs, tc.unwrapToLong(rhs));
  }

  public Object doApply(final ExtendedThreadContext tc, final double lhs, final Object rhs) {
    return tc.xor().apply(lhs, tc.unwrapToLong(rhs));
  }

  public Object doApply(final ExtendedThreadContext tc, final BigInteger lhs, final Object rhs) {
    return tc.xor().apply(lhs, tc.unwrapToLong(rhs));
  }

  public Object doApply(final ExtendedThreadContext tc, final BigDecimal lhs, final Object rhs) {
    return tc.xor().apply(lhs, tc.unwrapToLong(rhs));
  }
}
