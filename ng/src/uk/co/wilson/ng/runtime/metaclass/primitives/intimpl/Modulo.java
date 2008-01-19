package uk.co.wilson.ng.runtime.metaclass.primitives.intimpl;

import java.math.BigDecimal;
import java.math.BigInteger;

import ng.runtime.metaclass.MetaClass;
import ng.runtime.threadcontext.ThreadContext;
import uk.co.wilson.ng.runtime.metaclass.primitives.IntBinaryArithmeticOperation;

/**
 * @author John
 *
 */
public class Modulo extends BaseBinaryOperation implements IntBinaryArithmeticOperation {
  public Object doApply(final ThreadContext tc, final Object lhs, final Object rhs) {
    return tc.modulo().apply(tc.unwrapToInt(lhs), rhs);
  }

  public Object doApply(final ThreadContext tc, final Object lhs, final MetaClass rhsMetaClass, final Object rhs) {
    return tc.modulo().apply(tc.unwrapToInt(lhs), rhsMetaClass, rhs);
  }

  public Object doReverseApply(final ThreadContext tc, final Object lhs, final Object rhs) {
    return tc.modulo().apply(lhs, tc.unwrapToInt(rhs));
  }

  public Object doApply(final ThreadContext tc, final char lhs, final Object rhs) {
    return tc.modulo().apply(lhs, tc.unwrapToInt(rhs));
  }

  public Object doApply(final ThreadContext tc, final byte lhs, final Object rhs) {
    return tc.modulo().apply(lhs, tc.unwrapToInt(rhs));
  }

  public Object doApply(final ThreadContext tc, final short lhs, final Object rhs) {
    return tc.modulo().apply(lhs, tc.unwrapToInt(rhs));
  }

  public Object doApply(final ThreadContext tc, final int lhs, final Object rhs) {
    return tc.modulo().apply(lhs, tc.unwrapToInt(rhs));
  }

  public Object doApply(final ThreadContext tc, final long lhs, final Object rhs) {
    return tc.modulo().apply(lhs, tc.unwrapToInt(rhs));
  }

  public Object doApply(final ThreadContext tc, final float lhs, final Object rhs) {
    return tc.modulo().apply(lhs, tc.unwrapToInt(rhs));
  }

  public Object doApply(final ThreadContext tc, final double lhs, final Object rhs) {
    return tc.modulo().apply(lhs, tc.unwrapToInt(rhs));
  }

  public Object doApply(final ThreadContext tc, final BigInteger lhs, final Object rhs) {
    return lhs.divide(BigInteger.valueOf(tc.unwrapToInt(rhs)));
  }

  public Object doApply(final ThreadContext tc, final BigDecimal lhs, final Object rhs) {
    return lhs.divideToIntegralValue(new BigDecimal(tc.unwrapToInt(rhs)));
  }

  public Object doApply(final ThreadContext tc, final int lhs, final char rhs) {
    return tc.wrap(lhs /  rhs);
  }

  public Object doApply(final ThreadContext tc, final int lhs, final byte rhs) {
    return tc.wrap(lhs /  rhs);
  }

  public Object doApply(final ThreadContext tc, final int lhs, final short rhs) {
    return tc.wrap(lhs /  rhs);
  }

  public Object doApply(final ThreadContext tc, final int lhs, final int rhs) {
    return tc.wrap(lhs /  rhs);
  }

  public Object doApply(final ThreadContext tc, final int lhs, final long rhs) {
    return tc.wrap(lhs /  rhs);
  }

  public Object doApply(final ThreadContext tc, final int lhs, final float rhs) {
    return tc.wrap((float)Math.floor(lhs / rhs));
  }

  public Object doApply(final ThreadContext tc, final int lhs, final double rhs) {
    return tc.wrap(Math.floor(lhs / rhs));
  }

  public Object doApply(final ThreadContext tc, final int lhs, final BigInteger rhs) {
    return BigInteger.valueOf(lhs).divide(rhs);
  }

  public Object doApply(final ThreadContext tc, final int lhs, final BigDecimal rhs) {
    return BigDecimal.valueOf(lhs).divideToIntegralValue(rhs);
  }

  public int doIntApply(final ThreadContext tc, final int lhs, final char rhs) {
    return lhs /  rhs;
  }

  public int doIntApply(final ThreadContext tc, final int lhs, final byte rhs) {
    return lhs /  rhs;
  }

  public int doIntApply(final ThreadContext tc, final int lhs, final short rhs) {
    return lhs /  rhs;
  }

  public int doIntApply(final ThreadContext tc, final int lhs, final int rhs) {
    return lhs /  rhs;
  }

  public long doLongApply(final ThreadContext tc, final int lhs, final long rhs) {
    return lhs /  rhs;
  }

  public float doFloatApply(final ThreadContext tc, final int lhs, final float rhs) {
    return (float)Math.floor(lhs / rhs);
  }

  public double doDoubleApply(final ThreadContext tc, final int lhs, final double rhs) {
    return Math.floor(lhs / rhs);
  }

  public BigInteger doBigIntegerApply(final ThreadContext tc, final int lhs, final BigInteger rhs) {
    return BigInteger.valueOf(lhs).divide(rhs);
  }

  public BigDecimal doBigDecimalApply(final ThreadContext tc, final int lhs, final BigDecimal rhs) {
    return BigDecimal.valueOf(lhs).divideToIntegralValue(rhs);
  }
}
