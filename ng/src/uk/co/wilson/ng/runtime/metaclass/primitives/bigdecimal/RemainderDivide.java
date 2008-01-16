package uk.co.wilson.ng.runtime.metaclass.primitives.bigdecimal;

import java.math.BigDecimal;
import java.math.BigInteger;

import ng.runtime.metaclass.MetaClass;
import ng.runtime.threadcontext.ThreadContext;
import uk.co.wilson.ng.runtime.metaclass.primitives.BigDecimalBinaryArithmeticOperation;
/*
 * Created on 16 Jan 2008
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
public class RemainderDivide extends BaseBinaryOperation implements BigDecimalBinaryArithmeticOperation {
  public Object doApply(final ThreadContext tc, final Object lhs, final Object rhs) {
    return tc.remainderDivide().apply((BigDecimal)lhs, rhs);
  }

  public Object doApply(final ThreadContext tc, final Object lhs, final MetaClass rhsMetaClass, final Object rhs) {
    return tc.remainderDivide().apply((BigDecimal)lhs, rhsMetaClass, rhs);
  }

  public Object doApply(final ThreadContext tc, final char lhs, final Object rhs) {
    return tc.remainderDivide().apply(lhs, (BigDecimal)rhs);
  }

  public Object doReverseApply(final ThreadContext tc, final Object lhs, final Object rhs) {
    return tc.remainderDivide().apply(lhs, (BigDecimal)rhs);
  }

  public Object doApply(final ThreadContext tc, final byte lhs, final Object rhs) {
    return tc.remainderDivide().apply(lhs, (BigDecimal)rhs);
  }

  public Object doApply(final ThreadContext tc, final short lhs, final Object rhs) {
    return tc.remainderDivide().apply(lhs, (BigDecimal)rhs);
  }

  public Object doApply(final ThreadContext tc, final int lhs, final Object rhs) {
    return tc.remainderDivide().apply(lhs, (BigDecimal)rhs);
  }

  public Object doApply(final ThreadContext tc, final long lhs, final Object rhs) {
    return tc.remainderDivide().apply(lhs, (BigDecimal)rhs);
  }

  public Object doApply(final ThreadContext tc, final float lhs, final Object rhs) {
    return tc.remainderDivide().apply(lhs, (BigDecimal)rhs);
  }

  public Object doApply(final ThreadContext tc, final double lhs, final Object rhs) {
    return tc.remainderDivide().apply(lhs, (BigDecimal)rhs);
  }

  public Object doApply(final ThreadContext tc, final BigInteger lhs, final Object rhs) {
    return tc.remainderDivide().apply(lhs, (BigDecimal)rhs);
  }

  public Object doApply(final ThreadContext tc, final BigDecimal lhs, final Object rhs) {
    return tc.remainderDivide().apply(lhs, (BigDecimal)rhs);
  }

  public Object doApply(final ThreadContext tc, final BigDecimal lhs, final char rhs) {
    return lhs.divideAndRemainder(BigDecimal.valueOf(rhs));
  }

  public Object doApply(final ThreadContext tc, final BigDecimal lhs, final byte rhs) {
    return lhs.divideAndRemainder(BigDecimal.valueOf(rhs));
  }

  public Object doApply(final ThreadContext tc, final BigDecimal lhs, final short rhs) {
    return lhs.divideAndRemainder(BigDecimal.valueOf(rhs));
  }

  public Object doApply(final ThreadContext tc, final BigDecimal lhs, final int rhs) {
    return lhs.divideAndRemainder(BigDecimal.valueOf(rhs));
  }

  public Object doApply(final ThreadContext tc, final BigDecimal lhs, final long rhs) {
    return lhs.divideAndRemainder(BigDecimal.valueOf(rhs));
  }

  public Object doApply(final ThreadContext tc, final BigDecimal lhs, final float rhs) {
    return lhs.divideAndRemainder(BigDecimal.valueOf(rhs));
  }

  public Object doApply(final ThreadContext tc, final BigDecimal lhs, final double rhs) {
    return lhs.divideAndRemainder(BigDecimal.valueOf(rhs));
  }

  public Object doApply(final ThreadContext tc, final BigDecimal lhs, final BigInteger rhs) {
    return lhs.divideAndRemainder(BigDecimal.valueOf(rhs.longValue()));
  }

  public Object doApply(final ThreadContext tc, final BigDecimal lhs, final BigDecimal rhs) {
    return lhs.divideAndRemainder(rhs);
  }

  public BigDecimal doBigDecimalApply(final ThreadContext tc, final BigDecimal lhs, final char rhs) {
    return lhs.divideAndRemainder(BigDecimal.valueOf(rhs))[1];
  }

  public BigDecimal doBigDecimalApply(final ThreadContext tc, final BigDecimal lhs, final byte rhs) {
    return lhs.divideAndRemainder(BigDecimal.valueOf(rhs))[1];
  }

  public BigDecimal doBigDecimalApply(final ThreadContext tc, final BigDecimal lhs, final short rhs) {
    return lhs.divideAndRemainder(BigDecimal.valueOf(rhs))[1];
  }

  public BigDecimal doBigDecimalApply(final ThreadContext tc, final BigDecimal lhs, final int rhs) {
    return lhs.divideAndRemainder(BigDecimal.valueOf(rhs))[1];
  }

  public BigDecimal doBigDecimalApply(final ThreadContext tc, final BigDecimal lhs, final long rhs) {
    return lhs.divideAndRemainder(BigDecimal.valueOf(rhs))[1];
  }

  public BigDecimal doBigDecimalApply(final ThreadContext tc, final BigDecimal lhs, final float rhs) {
    return lhs.divideAndRemainder(BigDecimal.valueOf(rhs))[1];
  }

  public BigDecimal doBigDecimalApply(final ThreadContext tc, final BigDecimal lhs, final double rhs) {
    return lhs.divideAndRemainder(BigDecimal.valueOf(rhs))[1];
  }

  public BigDecimal doBigDecimalApply(final ThreadContext tc, final BigDecimal lhs, final BigInteger rhs) {
    return lhs.divideAndRemainder(BigDecimal.valueOf(rhs.longValue()))[1];
  }

  public BigDecimal doBigDecimalApply(final ThreadContext tc, final BigDecimal lhs, final BigDecimal rhs) {
    return lhs.divideAndRemainder(rhs)[1];
  }
}
