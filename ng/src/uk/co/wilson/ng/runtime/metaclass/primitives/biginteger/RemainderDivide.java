package uk.co.wilson.ng.runtime.metaclass.primitives.biginteger;

import java.math.BigDecimal;
import java.math.BigInteger;

import ng.runtime.metaclass.MetaClass;
import ng.runtime.threadcontext.ThreadContext;
import uk.co.wilson.ng.runtime.metaclass.primitives.BigIntegerBinaryArithmeticOperation;

/**
 * @author John
 *
 */
public class RemainderDivide extends BaseBinaryOperation implements BigIntegerBinaryArithmeticOperation {
  public Object doApply(final ThreadContext tc, final Object lhs, final Object rhs) {
    return tc.remainderDivide().apply((BigInteger)lhs, rhs);
  }

  public Object doApply(final ThreadContext tc, final Object lhs, final MetaClass rhsMetaClass, final Object rhs) {
    return tc.remainderDivide().apply((BigInteger)lhs, rhsMetaClass, rhs);
  }

  public Object doReverseApply(final ThreadContext tc, final Object lhs, final Object rhs) {
    return tc.remainderDivide().apply(lhs, (BigInteger)rhs);
  }

  public Object doApply(final ThreadContext tc, final char lhs, final Object rhs) {
    return tc.remainderDivide().apply(lhs, (BigInteger)rhs);
  }

  public Object doApply(final ThreadContext tc, final byte lhs, final Object rhs) {
    return tc.remainderDivide().apply(lhs, (BigInteger)rhs);
  }

  public Object doApply(final ThreadContext tc, final short lhs, final Object rhs) {
    return tc.remainderDivide().apply(lhs, (BigInteger)rhs);
  }

  public Object doApply(final ThreadContext tc, final int lhs, final Object rhs) {
    return tc.remainderDivide().apply(lhs, (BigInteger)rhs);
  }

  public Object doApply(final ThreadContext tc, final long lhs, final Object rhs) {
    return tc.remainderDivide().apply(lhs, (BigInteger)rhs);
  }

  public Object doApply(final ThreadContext tc, final float lhs, final Object rhs) {
    return tc.remainderDivide().apply(lhs, (BigInteger)rhs);
  }

  public Object doApply(final ThreadContext tc, final double lhs, final Object rhs) {
    return tc.remainderDivide().apply(lhs, (BigInteger)rhs);
  }

  public Object doApply(final ThreadContext tc, final BigInteger lhs, final Object rhs) {
    return tc.remainderDivide().apply(lhs, (BigInteger)rhs);
  }

  public Object doApply(final ThreadContext tc, final BigDecimal lhs, final Object rhs) {
    return tc.remainderDivide().apply(lhs, (BigInteger)rhs);
  }

  public Object doApply(final ThreadContext tc, final BigInteger lhs, final char rhs) {
    return lhs.divideAndRemainder(BigInteger.valueOf(rhs))[1];
  }

  public Object doApply(final ThreadContext tc, final BigInteger lhs, final byte rhs) {
    return lhs.divideAndRemainder(BigInteger.valueOf(rhs))[1];
  }

  public Object doApply(final ThreadContext tc, final BigInteger lhs, final short rhs) {
    return lhs.divideAndRemainder(BigInteger.valueOf(rhs))[1];
  }

  public Object doApply(final ThreadContext tc, final BigInteger lhs, final int rhs) {
    return lhs.divideAndRemainder(BigInteger.valueOf(rhs))[1];
  }

  public Object doApply(final ThreadContext tc, final BigInteger lhs, final long rhs) {
    return lhs.divideAndRemainder(BigInteger.valueOf(rhs))[1];
  }

  public Object doApply(final ThreadContext tc, final BigInteger lhs, final float rhs) {
  final float tmp = lhs.floatValue() / rhs;

    return tc.wrap((float)(lhs.floatValue() - Math.floor(tmp) * rhs));
  }

  public Object doApply(final ThreadContext tc, final BigInteger lhs, final double rhs) {
  final double tmp = lhs.doubleValue() / rhs;

    return tc.wrap(lhs.doubleValue() - Math.floor(tmp) * rhs);
  }

  public Object doApply(final ThreadContext tc, final BigInteger lhs, final BigInteger rhs) {
    return lhs.divideAndRemainder(rhs)[1];
  }

  public Object doApply(final ThreadContext tc, final BigInteger lhs, final BigDecimal rhs) {
    return BigDecimal.valueOf(lhs.longValue()).divideAndRemainder(rhs)[1];
  }

  public BigInteger doBigIntegerApply(final ThreadContext tc, final BigInteger lhs, final char rhs) {
    return lhs.divideAndRemainder(BigInteger.valueOf(rhs))[1];
  }

  public BigInteger doBigIntegerApply(final ThreadContext tc, final BigInteger lhs, final byte rhs) {
    return lhs.divideAndRemainder(BigInteger.valueOf(rhs))[1];
  }

  public BigInteger doBigIntegerApply(final ThreadContext tc, final BigInteger lhs, final short rhs) {
    return lhs.divideAndRemainder(BigInteger.valueOf(rhs))[1];
  }

  public BigInteger doBigIntegerApply(final ThreadContext tc, final BigInteger lhs, final int rhs) {
    return lhs.divideAndRemainder(BigInteger.valueOf(rhs))[1];
  }

  public BigInteger doBigIntegerApply(final ThreadContext tc, final BigInteger lhs, final long rhs) {
    return lhs.divideAndRemainder(BigInteger.valueOf(rhs))[1];
  }

  public float doFloatApply(final ThreadContext tc, final BigInteger lhs, final float rhs) {
  final float tmp = lhs.floatValue() / rhs;

    return (float)(lhs.floatValue() - Math.floor(tmp) * rhs);
  }

  public double doDoubleApply(final ThreadContext tc, final BigInteger lhs, final double rhs) {
  final double tmp = lhs.doubleValue() / rhs;

    return lhs.doubleValue() - Math.floor(tmp) * rhs;
  }

  public BigInteger doBigIntegerApply(final ThreadContext tc, final BigInteger lhs, final BigInteger rhs) {
    return lhs.divideAndRemainder(rhs)[1];
  }

  public BigDecimal doBigDecimalApply(final ThreadContext tc, final BigInteger lhs, final BigDecimal rhs) {
    return BigDecimal.valueOf(lhs.longValue()).divideAndRemainder(rhs)[1];
  }
}
