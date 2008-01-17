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
public class Modulo extends BaseBinaryOperation implements FloatBinaryArithmeticOperation {
  public Object doApply(final ThreadContext tc, final Object lhs, final Object rhs) {
    return tc.modulo().apply(tc.unwrapToFloat(lhs), rhs);
  }

  public Object doApply(final ThreadContext tc, final Object lhs, final MetaClass rhsMetaClass, final Object rhs) {
    return tc.modulo().apply(tc.unwrapToFloat(lhs), rhsMetaClass, rhs);
  }

  public Object doReverseApply(final ThreadContext tc, final Object lhs, final Object rhs) {
    return tc.modulo().apply(lhs, tc.unwrapToFloat(rhs));
  }

  public Object doApply(final ThreadContext tc, final char lhs, final Object rhs) {
    return tc.modulo().apply(lhs, tc.unwrapToFloat(rhs));
  }

  public Object doApply(final ThreadContext tc, final byte lhs, final Object rhs) {
    return tc.modulo().apply(lhs, tc.unwrapToFloat(rhs));
  }

  public Object doApply(final ThreadContext tc, final short lhs, final Object rhs) {
    return tc.modulo().apply(lhs, tc.unwrapToFloat(rhs));
  }

  public Object doApply(final ThreadContext tc, final int lhs, final Object rhs) {
    return tc.modulo().apply(lhs, tc.unwrapToFloat(rhs));
  }

  public Object doApply(final ThreadContext tc, final long lhs, final Object rhs) {
    return tc.modulo().apply(lhs, tc.unwrapToFloat(rhs));
  }

  public Object doApply(final ThreadContext tc, final float lhs, final Object rhs) {
    return tc.modulo().apply(lhs, tc.unwrapToFloat(rhs));
  }

  public Object doApply(final ThreadContext tc, final double lhs, final Object rhs) {
    return tc.modulo().apply(lhs, tc.unwrapToFloat(rhs));
  }

  public Object doApply(final ThreadContext tc, final BigInteger lhs, final Object rhs) {
    return tc.modulo().apply(lhs, tc.unwrapToFloat(rhs));
  }

  public Object doApply(final ThreadContext tc, final BigDecimal lhs, final Object rhs) {
    return tc.modulo().apply(lhs, tc.unwrapToFloat(rhs));
  }

  public Object doApply(final ThreadContext tc, final float lhs, final char rhs) {
    return tc.wrap((float)Math.floor(lhs / rhs));
  }

  public Object doApply(final ThreadContext tc, final float lhs, final byte rhs) {
    return tc.wrap((float)Math.floor(lhs / rhs));
  }

  public Object doApply(final ThreadContext tc, final float lhs, final short rhs) {
    return tc.wrap((float)Math.floor(lhs / rhs));
  }

  public Object doApply(final ThreadContext tc, final float lhs, final int rhs) {
    return tc.wrap((float)Math.floor(lhs / rhs));
  }

  public Object doApply(final ThreadContext tc, final float lhs, final long rhs) {
    return tc.wrap((float)Math.floor(lhs / rhs));
  }

  public Object doApply(final ThreadContext tc, final float lhs, final float rhs) {
    return tc.wrap((float)Math.floor(lhs / rhs));
  }

  public Object doApply(final ThreadContext tc, final float lhs, final double rhs) {
    return tc.wrap(Math.floor(lhs / rhs));
  }

  public Object doApply(final ThreadContext tc, final float lhs, final BigInteger rhs) {
    return tc.wrap(BigDecimal.valueOf(lhs).divideToIntegralValue(new BigDecimal(rhs.toString())).floatValue());
  }

  public Object doApply(final ThreadContext tc, final float lhs, final BigDecimal rhs) {
    return BigDecimal.valueOf(lhs).divideToIntegralValue(rhs);
  }

  public float doFloatApply(final ThreadContext tc, final float lhs, final char rhs) {
    return (float)Math.floor(lhs / rhs);
  }

  public float doFloatApply(final ThreadContext tc, final float lhs, final byte rhs) {
    return (float)Math.floor(lhs / rhs);
  }

  public float doFloatApply(final ThreadContext tc, final float lhs, final short rhs) {
    return (float)Math.floor(lhs / rhs);
  }

  public float doFloatApply(final ThreadContext tc, final float lhs, final int rhs) {
    return (float)Math.floor(lhs / rhs);
  }

  public float doFloatApply(final ThreadContext tc, final float lhs, final long rhs) {
    return (float)Math.floor(lhs / rhs);
  }

  public float doFloatApply(final ThreadContext tc, final float lhs, final float rhs) {
    return (float)Math.floor(lhs / rhs);
  }

  public double doDoubleApply(final ThreadContext tc, final float lhs, final double rhs) {
    return Math.floor(lhs / rhs);
  }

  public float doFloatApply(final ThreadContext tc, final float lhs, final BigInteger rhs) {
    return BigDecimal.valueOf(lhs).divideToIntegralValue(new BigDecimal(rhs.toString())).floatValue();
  }

  public BigDecimal doBigDecimalApply(final ThreadContext tc, final float lhs, final BigDecimal rhs) {
    return BigDecimal.valueOf(lhs).divideToIntegralValue(rhs);
  }
}
