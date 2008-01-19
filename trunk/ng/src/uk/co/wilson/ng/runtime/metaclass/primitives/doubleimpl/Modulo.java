package uk.co.wilson.ng.runtime.metaclass.primitives.doubleimpl;

import java.math.BigDecimal;
import java.math.BigInteger;

import ng.runtime.metaclass.MetaClass;
import ng.runtime.threadcontext.ThreadContext;
import uk.co.wilson.ng.runtime.metaclass.primitives.DoubleBinaryArithmeticOperation;

/**
 * @author John
 *
 */
public class Modulo extends BaseBinaryOperation implements DoubleBinaryArithmeticOperation {
  public Object doApply(final ThreadContext tc, final Object lhs, final Object rhs) {
    return tc.modulo().apply(tc.unwrapToDouble(lhs), rhs);
  }

  public Object doApply(final ThreadContext tc, final Object lhs, final MetaClass rhsMetaClass, final Object rhs) {
    return tc.modulo().apply(tc.unwrapToDouble(lhs), rhsMetaClass, rhs);
  }

  public Object doReverseApply(final ThreadContext tc, final Object lhs, final Object rhs) {
    return tc.modulo().apply(lhs, tc.unwrapToDouble(rhs));
  }

  public Object doApply(final ThreadContext tc, final char lhs, final Object rhs) {
    return tc.modulo().apply(lhs, tc.unwrapToDouble(rhs));
  }

  public Object doApply(final ThreadContext tc, final byte lhs, final Object rhs) {
    return tc.modulo().apply(lhs, tc.unwrapToDouble(rhs));
  }

  public Object doApply(final ThreadContext tc, final short lhs, final Object rhs) {
    return tc.modulo().apply(lhs, tc.unwrapToDouble(rhs));
  }

  public Object doApply(final ThreadContext tc, final int lhs, final Object rhs) {
    return tc.modulo().apply(lhs, tc.unwrapToDouble(rhs));
  }

  public Object doApply(final ThreadContext tc, final long lhs, final Object rhs) {
    return tc.modulo().apply(lhs, tc.unwrapToDouble(rhs));
  }

  public Object doApply(final ThreadContext tc, final float lhs, final Object rhs) {
    return tc.modulo().apply(lhs, tc.unwrapToDouble(rhs));
  }

  public Object doApply(final ThreadContext tc, final double lhs, final Object rhs) {
    return tc.modulo().apply(lhs, tc.unwrapToDouble(rhs));
  }

  public Object doApply(final ThreadContext tc, final BigInteger lhs, final Object rhs) {
    return tc.modulo().apply(lhs, tc.unwrapToDouble(rhs));
  }

  public Object doApply(final ThreadContext tc, final BigDecimal lhs, final Object rhs) {
    return tc.modulo().apply(lhs, tc.unwrapToDouble(rhs));
  }

  public Object doApply(final ThreadContext tc, final double lhs, final char rhs) {
    return tc.wrap(Math.floor(lhs / rhs));
  }

  public Object doApply(final ThreadContext tc, final double lhs, final byte rhs) {
    return tc.wrap(Math.floor(lhs / rhs));
  }

  public Object doApply(final ThreadContext tc, final double lhs, final short rhs) {
    return tc.wrap(Math.floor(lhs / rhs));
  }

  public Object doApply(final ThreadContext tc, final double lhs, final int rhs) {
    return tc.wrap(Math.floor(lhs / rhs));
  }

  public Object doApply(final ThreadContext tc, final double lhs, final long rhs) {
    return tc.wrap(Math.floor(lhs / rhs));
  }

  public Object doApply(final ThreadContext tc, final double lhs, final float rhs) {
    return tc.wrap(Math.floor(lhs / rhs));
  }

  public Object doApply(final ThreadContext tc, final double lhs, final double rhs) {
    return tc.wrap(Math.floor(lhs / rhs));
  }

  public Object doApply(final ThreadContext tc, final double lhs, final BigInteger rhs) {
    return tc.wrap(Math.floor(lhs / rhs.doubleValue()));
  }

  public Object doApply(final ThreadContext tc, final double lhs, final BigDecimal rhs) {
    return BigDecimal.valueOf(lhs).divideToIntegralValue(rhs);
  }

  public double doDoubleApply(final ThreadContext tc, final double lhs, final char rhs) {
    return Math.floor(lhs / rhs);
  }

  public double doDoubleApply(final ThreadContext tc, final double lhs, final byte rhs) {
    return Math.floor(lhs / rhs);
  }

  public double doDoubleApply(final ThreadContext tc, final double lhs, final short rhs) {
    return Math.floor(lhs / rhs);
  }

  public double doDoubleApply(final ThreadContext tc, final double lhs, final int rhs) {
    return Math.floor(lhs / rhs);
  }

  public double doDoubleApply(final ThreadContext tc, final double lhs, final long rhs) {
    return Math.floor(lhs / rhs);
  }

  public double doDoubleApply(final ThreadContext tc, final double lhs, final float rhs) {
    return Math.floor(lhs / rhs);
  }

  public double doDoubleApply(final ThreadContext tc, final double lhs, final double rhs) {
    return Math.floor(lhs / rhs);
  }

  public double doDoubleApply(final ThreadContext tc, final double lhs, final BigInteger rhs) {
    return Math.floor(lhs / rhs.doubleValue());
  }

  public BigDecimal doBigDecimalApply(final ThreadContext tc, final double lhs, final BigDecimal rhs) {
    return BigDecimal.valueOf(lhs).divideToIntegralValue(rhs);
  }
}
