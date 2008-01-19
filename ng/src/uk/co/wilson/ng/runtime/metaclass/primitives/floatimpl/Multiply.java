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
public class Multiply extends BaseBinaryOperation implements FloatBinaryArithmeticOperation {
  public Object doApply(final ThreadContext tc, final Object lhs, final Object rhs) {
    return tc.multiply().apply(tc.unwrapToFloat(lhs), rhs);
  }

  public Object doApply(final ThreadContext tc, final Object lhs, final MetaClass rhsMetaClass, final Object rhs) {
    return tc.multiply().apply(tc.unwrapToFloat(lhs), rhsMetaClass, rhs);
  }

  public Object doReverseApply(final ThreadContext tc, final Object lhs, final Object rhs) {
    return tc.multiply().apply(lhs, tc.unwrapToFloat(rhs));
  }

  public Object doApply(final ThreadContext tc, final char lhs, final Object rhs) {
    return tc.multiply().apply(lhs, tc.unwrapToFloat(rhs));
  }

  public Object doApply(final ThreadContext tc, final byte lhs, final Object rhs) {
    return tc.multiply().apply(lhs, tc.unwrapToFloat(rhs));
  }

  public Object doApply(final ThreadContext tc, final short lhs, final Object rhs) {
    return tc.multiply().apply(lhs, tc.unwrapToFloat(rhs));
  }

  public Object doApply(final ThreadContext tc, final int lhs, final Object rhs) {
    return tc.multiply().apply(lhs, tc.unwrapToFloat(rhs));
  }

  public Object doApply(final ThreadContext tc, final long lhs, final Object rhs) {
    return tc.multiply().apply(lhs, tc.unwrapToFloat(rhs));
  }

  public Object doApply(final ThreadContext tc, final float lhs, final Object rhs) {
    return tc.multiply().apply(lhs, tc.unwrapToFloat(rhs));
  }

  public Object doApply(final ThreadContext tc, final double lhs, final Object rhs) {
    return tc.multiply().apply(lhs, tc.unwrapToFloat(rhs));
  }

  public Object doApply(final ThreadContext tc, final BigInteger lhs, final Object rhs) {
    return tc.multiply().apply(lhs, tc.unwrapToFloat(rhs));
  }

  public Object doApply(final ThreadContext tc, final BigDecimal lhs, final Object rhs) {
    return tc.multiply().apply(lhs, tc.unwrapToFloat(rhs));
  }

  public Object doApply(final ThreadContext tc, final float lhs, final char rhs) {
    return tc.wrap(lhs * rhs);
  }

  public Object doApply(final ThreadContext tc, final float lhs, final byte rhs) {
    return tc.wrap(lhs * rhs);
  }

  public Object doApply(final ThreadContext tc, final float lhs, final short rhs) {
    return tc.wrap(lhs * rhs);
  }

  public Object doApply(final ThreadContext tc, final float lhs, final int rhs) {
    return tc.wrap(lhs * rhs);
  }

  public Object doApply(final ThreadContext tc, final float lhs, final long rhs) {
    return tc.wrap(lhs * rhs);
  }

  public Object doApply(final ThreadContext tc, final float lhs, final float rhs) {
    return tc.wrap(lhs * rhs);
  }

  public Object doApply(final ThreadContext tc, final float lhs, final double rhs) {
    return tc.wrap(lhs * rhs);
  }

  public Object doApply(final ThreadContext tc, final float lhs, final BigInteger rhs) {
    return tc.wrap(lhs * rhs.floatValue());
  }

  public Object doApply(final ThreadContext tc, final float lhs, final BigDecimal rhs) {
    return BigDecimal.valueOf(lhs).multiply(rhs);
  }

  public float doFloatApply(final ThreadContext tc, final float lhs, final char rhs) {
    return lhs * rhs;
  }

  public float doFloatApply(final ThreadContext tc, final float lhs, final byte rhs) {
    return lhs * rhs;
  }

  public float doFloatApply(final ThreadContext tc, final float lhs, final short rhs) {
    return lhs * rhs;
  }

  public float doFloatApply(final ThreadContext tc, final float lhs, final int rhs) {
    return lhs * rhs;
  }

  public float doFloatApply(final ThreadContext tc, final float lhs, final long rhs) {
    return lhs * rhs;
  }

  public float doFloatApply(final ThreadContext tc, final float lhs, final float rhs) {
    return lhs * rhs;
  }

  public double doDoubleApply(final ThreadContext tc, final float lhs, final double rhs) {
    return lhs * rhs;
  }

  public float doFloatApply(final ThreadContext tc, final float lhs, final BigInteger rhs) {
    return lhs * rhs.floatValue();
  }

  public BigDecimal doBigDecimalApply(final ThreadContext tc, final float lhs, final BigDecimal rhs) {
    return BigDecimal.valueOf(lhs).multiply(rhs);
  }
}
