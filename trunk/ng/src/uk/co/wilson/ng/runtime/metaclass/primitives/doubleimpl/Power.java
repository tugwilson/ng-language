package uk.co.wilson.ng.runtime.metaclass.primitives.doubleimpl;

import java.math.BigDecimal;
import java.math.BigInteger;

import ng.runtime.metaclass.MetaClass;
import ng.runtime.threadcontext.ThreadContext;

/**
 * @author John
 *
 */
public class Power extends BaseBinaryArithmeticOperation {
  public Object doApply(final ThreadContext tc, final Object lhs, final Object rhs) {
    return tc.power().apply(tc.unwrapToDouble(lhs), rhs);
  }

  public Object doApply(final ThreadContext tc, final Object lhs, final MetaClass rhsMetaClass, final Object rhs) {
    return tc.power().apply(tc.unwrapToDouble(lhs), rhsMetaClass, rhs);
  }

  public Object doReverseApply(final ThreadContext tc, final Object lhs, final Object rhs) {
    return tc.power().apply(lhs, tc.unwrapToDouble(rhs));
  }

  public Object doApply(final ThreadContext tc, final char lhs, final Object rhs) {
    return tc.power().apply(lhs, tc.unwrapToDouble(rhs));
  }

  public Object doApply(final ThreadContext tc, final byte lhs, final Object rhs) {
    return tc.power().apply(lhs, tc.unwrapToDouble(rhs));
  }

  public Object doApply(final ThreadContext tc, final short lhs, final Object rhs) {
    return tc.power().apply(lhs, tc.unwrapToDouble(rhs));
  }

  public Object doApply(final ThreadContext tc, final int lhs, final Object rhs) {
    return tc.power().apply(lhs, tc.unwrapToDouble(rhs));
  }

  public Object doApply(final ThreadContext tc, final long lhs, final Object rhs) {
    return tc.power().apply(lhs, tc.unwrapToDouble(rhs));
  }

  public Object doApply(final ThreadContext tc, final float lhs, final Object rhs) {
    return tc.power().apply(lhs, tc.unwrapToDouble(rhs));
  }

  public Object doApply(final ThreadContext tc, final double lhs, final Object rhs) {
    return tc.power().apply(lhs, tc.unwrapToDouble(rhs));
  }

  public Object doApply(final ThreadContext tc, final BigInteger lhs, final Object rhs) {
    return tc.power().apply(lhs, tc.unwrapToDouble(rhs));
  }

  public Object doApply(final ThreadContext tc, final BigDecimal lhs, final Object rhs) {
    return tc.power().apply(lhs, tc.unwrapToDouble(rhs));
  }

  public double doDoubleApply(final ThreadContext tc, final double lhs, final char rhs) {
    return Math.pow(lhs, rhs);
  }

  public double doDoubleApply(final ThreadContext tc, final double lhs, final byte rhs) {
    return Math.pow(lhs, rhs);
  }

  public double doDoubleApply(final ThreadContext tc, final double lhs, final short rhs) {
    return Math.pow(lhs, rhs);
  }

  public double doDoubleApply(final ThreadContext tc, final double lhs, final int rhs) {
    return Math.pow(lhs, rhs);
  }

  public double doDoubleApply(final ThreadContext tc, final double lhs, final long rhs) {
    return Math.pow(lhs, rhs);
  }

  public double doDoubleApply(final ThreadContext tc, final double lhs, final float rhs) {
    return Math.pow(lhs, rhs);
  }

  public double doDoubleApply(final ThreadContext tc, final double lhs, final double rhs) {
    return Math.pow(lhs, rhs);
  }

  public double doDoubleApply(final ThreadContext tc, final double lhs, final BigInteger rhs) {
    return Math.pow(lhs, rhs.doubleValue());
  }

  public BigDecimal doBigDecimalApply(final ThreadContext tc, final double lhs, final BigDecimal rhs) {
    return BigDecimal.valueOf(Math.pow(lhs, rhs.doubleValue()));
  }
}
