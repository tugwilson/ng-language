package uk.co.wilson.ng.runtime.metaclass.primitives.longimpl;

import java.math.BigDecimal;
import java.math.BigInteger;

import ng.runtime.metaclass.MetaClass;
import uk.co.wilson.ng.runtime.threadcontext.ExtendedThreadContext;

/**
 * @author John
 *
 */
public class RemainderDivide extends BaseBinaryArithmeticOperation {
  public Object doApply(final ExtendedThreadContext tc, final Object lhs, final Object rhs) {
    return tc.remainderDivide().apply(tc.unwrapToLong(lhs), rhs);
  }

  public Object doApply(final ExtendedThreadContext tc, final Object lhs, final MetaClass rhsMetaClass, final Object rhs) {
    return tc.remainderDivide().apply(tc.unwrapToLong(lhs), rhsMetaClass, rhs);
  }

  public Object doReverseApply(final ExtendedThreadContext tc, final Object lhs, final Object rhs) {
    return tc.remainderDivide().apply(lhs, tc.unwrapToLong(rhs));
  }

  public Object doApply(final ExtendedThreadContext tc, final char lhs, final Object rhs) {
    return tc.remainderDivide().apply(lhs, tc.unwrapToLong(rhs));
  }

  public Object doApply(final ExtendedThreadContext tc, final byte lhs, final Object rhs) {
    return tc.remainderDivide().apply(lhs, tc.unwrapToLong(rhs));
  }

  public Object doApply(final ExtendedThreadContext tc, final short lhs, final Object rhs) {
    return tc.remainderDivide().apply(lhs, tc.unwrapToLong(rhs));
  }

  public Object doApply(final ExtendedThreadContext tc, final int lhs, final Object rhs) {
    return tc.remainderDivide().apply(lhs, tc.unwrapToLong(rhs));
  }

  public Object doApply(final ExtendedThreadContext tc, final long lhs, final Object rhs) {
    return tc.remainderDivide().apply(lhs, tc.unwrapToLong(rhs));
  }

  public Object doApply(final ExtendedThreadContext tc, final float lhs, final Object rhs) {
    return tc.remainderDivide().apply(lhs, tc.unwrapToLong(rhs));
  }

  public Object doApply(final ExtendedThreadContext tc, final double lhs, final Object rhs) {
    return tc.remainderDivide().apply(lhs, tc.unwrapToLong(rhs));
  }

  public Object doApply(final ExtendedThreadContext tc, final BigInteger lhs, final Object rhs) {
    return tc.remainderDivide().apply(lhs, tc.unwrapToLong(rhs));
  }

  public Object doApply(final ExtendedThreadContext tc, final BigDecimal lhs, final Object rhs) {
    return tc.remainderDivide().apply(lhs, tc.unwrapToLong(rhs));
  }

  public long doLongApply(final ExtendedThreadContext tc, final long lhs, final char rhs) {
    return lhs - (lhs / rhs) * rhs;
  }

  public long doLongApply(final ExtendedThreadContext tc, final long lhs, final byte rhs) {
    return lhs - (lhs / rhs) * rhs;
  }

  public long doLongApply(final ExtendedThreadContext tc, final long lhs, final short rhs) {
    return lhs - (lhs / rhs) * rhs;
  }

  public long doLongApply(final ExtendedThreadContext tc, final long lhs, final int rhs) {
    return lhs - (lhs / rhs) * rhs;
  }

  public long doLongApply(final ExtendedThreadContext tc, final long lhs, final long rhs) {
    return lhs - (lhs / rhs) * rhs;
  }

  public float doFloatApply(final ExtendedThreadContext tc, final long lhs, final float rhs) {
  final double tmp = lhs / rhs;

    return (float)(lhs - Math.floor(tmp) * rhs);
  }

  public double doDoubleApply(final ExtendedThreadContext tc, final long lhs, final double rhs) {
  final double tmp = lhs / rhs;

    return lhs - Math.floor(tmp) * rhs;
  }

  public BigInteger doBigIntegerApply(final ExtendedThreadContext tc, final long lhs, final BigInteger rhs) {
    return BigInteger.valueOf(lhs).divideAndRemainder(rhs)[1];
  }

  public BigDecimal doBigDecimalApply(final ExtendedThreadContext tc, final long lhs, final BigDecimal rhs) {
    return BigDecimal.valueOf(lhs).divideAndRemainder(rhs)[1];
  }
}
