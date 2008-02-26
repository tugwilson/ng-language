package uk.co.wilson.ng.runtime.metaclass.primitives.intimpl;

import java.math.BigDecimal;
import java.math.BigInteger;

import ng.lang.MetaClass;
import ng.runtime.threadcontext.ExtendedThreadContext;

/**
 * @author John
 *
 */
public class Power extends BaseBinaryArithmeticOperation {
  public Object doApply(final ExtendedThreadContext tc, final Object lhs, final Object rhs) {
    return tc.power().apply(tc.unwrapToInt(lhs), rhs);
  }

  public Object doApply(final ExtendedThreadContext tc, final Object lhs, final MetaClass rhsMetaClass, final Object rhs) {
    return tc.power().apply(tc.unwrapToInt(lhs), rhsMetaClass, rhs);
  }

  public Object doReverseApply(final ExtendedThreadContext tc, final Object lhs, final Object rhs) {
    return tc.power().apply(lhs, tc.unwrapToInt(rhs));
  }

  public Object doApply(final ExtendedThreadContext tc, final char lhs, final Object rhs) {
    return tc.power().apply(lhs, tc.unwrapToInt(rhs));
  }

  public Object doApply(final ExtendedThreadContext tc, final byte lhs, final Object rhs) {
    return tc.power().apply(lhs, tc.unwrapToInt(rhs));
  }

  public Object doApply(final ExtendedThreadContext tc, final short lhs, final Object rhs) {
    return tc.power().apply(lhs, tc.unwrapToInt(rhs));
  }

  public Object doApply(final ExtendedThreadContext tc, final int lhs, final Object rhs) {
    return tc.power().apply(lhs, tc.unwrapToInt(rhs));
  }

  public Object doApply(final ExtendedThreadContext tc, final long lhs, final Object rhs) {
    return tc.power().apply(lhs, tc.unwrapToInt(rhs));
  }

  public Object doApply(final ExtendedThreadContext tc, final float lhs, final Object rhs) {
    return tc.power().apply(lhs, tc.unwrapToInt(rhs));
  }

  public Object doApply(final ExtendedThreadContext tc, final double lhs, final Object rhs) {
    return tc.power().apply(lhs, tc.unwrapToInt(rhs));
  }

  public Object doApply(final ExtendedThreadContext tc, final BigInteger lhs, final Object rhs) {
    return tc.power().apply(lhs, tc.unwrapToInt(rhs));
  }

  public Object doApply(final ExtendedThreadContext tc, final BigDecimal lhs, final Object rhs) {
    return tc.power().apply(lhs, tc.unwrapToInt(rhs));
  }

  public int doIntApply(final ExtendedThreadContext tc, final int lhs, final char rhs) {
    return (int)Math.pow(lhs, rhs);
  }

  public int doIntApply(final ExtendedThreadContext tc, final int lhs, final byte rhs) {
    return (int)Math.pow(lhs, rhs);
  }

  public int doIntApply(final ExtendedThreadContext tc, final int lhs, final short rhs) {
    return (int)Math.pow(lhs, rhs);
  }

  public int doIntApply(final ExtendedThreadContext tc, final int lhs, final int rhs) {
    return (int)Math.pow(lhs, rhs);
  }

  public long doLongApply(final ExtendedThreadContext tc, final int lhs, final long rhs) {
    return (long)Math.pow(lhs, rhs);
  }

  public float doFloatApply(final ExtendedThreadContext tc, final int lhs, final float rhs) {
    return (float)Math.pow(lhs, rhs);
  }

  public double doDoubleApply(final ExtendedThreadContext tc, final int lhs, final double rhs) {
    return Math.pow(lhs, rhs);
  }

  public BigInteger doBigIntegerApply(final ExtendedThreadContext tc, final int lhs, final BigInteger rhs) {
    return BigInteger.valueOf((long)Math.pow(lhs, rhs.doubleValue()));
  }

  public BigDecimal doBigDecimalApply(final ExtendedThreadContext tc, final int lhs, final BigDecimal rhs) {
    return BigDecimal.valueOf(Math.pow(lhs, rhs.doubleValue()));
  }
}
