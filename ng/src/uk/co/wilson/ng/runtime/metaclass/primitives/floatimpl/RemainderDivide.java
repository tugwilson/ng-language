package uk.co.wilson.ng.runtime.metaclass.primitives.floatimpl;

import java.math.BigDecimal;
import java.math.BigInteger;

import ng.runtime.metaclass.MetaClass;
import ng.runtime.threadcontext.ThreadContext;
import uk.co.wilson.ng.runtime.metaclass.primitives.FloatBinaryArithmeticOperation;

/**
 * @author John
 *
 */
public class RemainderDivide extends BaseBinaryOperation implements FloatBinaryArithmeticOperation {
  public Object doApply(final ThreadContext tc, final Object lhs, final Object rhs) {
    return tc.remainderDivide().apply(tc.unwrapToFloat(lhs), rhs);
  }

  public Object doApply(final ThreadContext tc, final Object lhs, final MetaClass rhsMetaClass, final Object rhs) {
    return tc.remainderDivide().apply(tc.unwrapToFloat(lhs), rhsMetaClass, rhs);
  }

  public Object doReverseApply(final ThreadContext tc, final Object lhs, final Object rhs) {
    return tc.remainderDivide().apply(lhs, tc.unwrapToFloat(rhs));
  }

  public Object doApply(final ThreadContext tc, final char lhs, final Object rhs) {
    return tc.remainderDivide().apply(lhs, tc.unwrapToFloat(rhs));
  }

  public Object doApply(final ThreadContext tc, final byte lhs, final Object rhs) {
    return tc.remainderDivide().apply(lhs, tc.unwrapToFloat(rhs));
  }

  public Object doApply(final ThreadContext tc, final short lhs, final Object rhs) {
    return tc.remainderDivide().apply(lhs, tc.unwrapToFloat(rhs));
  }

  public Object doApply(final ThreadContext tc, final int lhs, final Object rhs) {
    return tc.remainderDivide().apply(lhs, tc.unwrapToFloat(rhs));
  }

  public Object doApply(final ThreadContext tc, final long lhs, final Object rhs) {
    return tc.remainderDivide().apply(lhs, tc.unwrapToFloat(rhs));
  }

  public Object doApply(final ThreadContext tc, final float lhs, final Object rhs) {
    return tc.remainderDivide().apply(lhs, tc.unwrapToFloat(rhs));
  }

  public Object doApply(final ThreadContext tc, final double lhs, final Object rhs) {
    return tc.remainderDivide().apply(lhs, tc.unwrapToFloat(rhs));
  }

  public Object doApply(final ThreadContext tc, final BigInteger lhs, final Object rhs) {
    return tc.remainderDivide().apply(lhs, tc.unwrapToFloat(rhs));
  }

  public Object doApply(final ThreadContext tc, final BigDecimal lhs, final Object rhs) {
    return tc.remainderDivide().apply(lhs, tc.unwrapToFloat(rhs));
  }

  public Object doApply(final ThreadContext tc, final float lhs, final char rhs) {
  final double tmp = lhs / rhs;

  return tc.wrap((float)(lhs - Math.floor(tmp) * rhs));
  }

  public Object doApply(final ThreadContext tc, final float lhs, final byte rhs) {
  final double tmp = lhs / rhs;

    return tc.wrap((float)(lhs - Math.floor(tmp) * rhs));
  }

  public Object doApply(final ThreadContext tc, final float lhs, final short rhs) {
  final double tmp = lhs / rhs;

    return tc.wrap((float)(lhs - Math.floor(tmp) * rhs));
  }

  public Object doApply(final ThreadContext tc, final float lhs, final int rhs) {
  final double tmp = lhs / rhs;

    return tc.wrap((float)(lhs - Math.floor(tmp) * rhs));
  }

  public Object doApply(final ThreadContext tc, final float lhs, final long rhs) {
  final double tmp = lhs / rhs;

    return tc.wrap((float)(lhs - Math.floor(tmp) * rhs));
  }

  public Object doApply(final ThreadContext tc, final float lhs, final float rhs) {
  final double tmp = lhs / rhs;

    return tc.wrap((float)(lhs - Math.floor(tmp) * rhs));
  }

  public Object doApply(final ThreadContext tc, final float lhs, final double rhs) {
  final double tmp = lhs / rhs;

    return tc.wrap(lhs - Math.floor(tmp) * rhs);
  }

  public Object doApply(final ThreadContext tc, final float lhs, final BigInteger rhs) {
  final double tmp = lhs / rhs.longValue();

    return tc.wrap((float)(lhs - Math.floor(tmp) * rhs.longValue()));
  }

  public Object doApply(final ThreadContext tc, final float lhs, final BigDecimal rhs) {
    return BigDecimal.valueOf(lhs).divideAndRemainder(rhs)[1];
  }

  public float doFloatApply(final ThreadContext tc, final float lhs, final char rhs) {
  final double tmp = lhs / rhs;

    return (float)(lhs - Math.floor(tmp) * rhs);
  }

  public float doFloatApply(final ThreadContext tc, final float lhs, final byte rhs) {
  final double tmp = lhs / rhs;

    return (float)(lhs - Math.floor(tmp) * rhs);
  }

  public float doFloatApply(final ThreadContext tc, final float lhs, final short rhs) {
  final double tmp = lhs / rhs;

    return (float)(lhs - Math.floor(tmp) * rhs);
  }

  public float doFloatApply(final ThreadContext tc, final float lhs, final int rhs) {
  final double tmp = lhs / rhs;

    return (float)(lhs - Math.floor(tmp) * rhs);
  }

  public float doFloatApply(final ThreadContext tc, final float lhs, final long rhs) {
  final double tmp = lhs / rhs;

    return (float)(lhs - Math.floor(tmp) * rhs);
  }

  public float doFloatApply(final ThreadContext tc, final float lhs, final float rhs) {
  final double tmp = lhs / rhs;

    return (float)(lhs - Math.floor(tmp) * rhs);
  }

  public double doDoubleApply(final ThreadContext tc, final float lhs, final double rhs) {
  final double tmp = lhs / rhs;

    return lhs - Math.floor(tmp) * rhs;
  }

  public float doFloatApply(final ThreadContext tc, final float lhs, final BigInteger rhs) {
  final double tmp = lhs / rhs.longValue();

    return (float)(lhs - Math.floor(tmp) * rhs.longValue());
  }

  public BigDecimal doBigDecimalApply(final ThreadContext tc, final float lhs, final BigDecimal rhs) {
    return BigDecimal.valueOf(lhs).divideAndRemainder(rhs)[1];
  }
}
