package uk.co.wilson.ng.runtime.metaclass.primitives.biginteger;

import java.math.BigDecimal;
import java.math.BigInteger;

import uk.co.wilson.ng.runtime.threadcontext.ExtendedThreadContext;

import ng.runtime.metaclass.MetaClass;

/**
 * @author John
 *
 */
public class Modulo extends BaseBinaryArithmeticOperation{
  public Object doApply(final ExtendedThreadContext tc, final Object lhs, final Object rhs) {
    return tc.modulo().apply((BigInteger)lhs, rhs);
  }

  public Object doApply(final ExtendedThreadContext tc, final Object lhs, final MetaClass rhsMetaClass, final Object rhs) {
    return tc.modulo().apply((BigInteger)lhs, rhsMetaClass, rhs);
  }

  public Object doReverseApply(final ExtendedThreadContext tc, final Object lhs, final Object rhs) {
    return tc.modulo().apply(lhs, (BigInteger)rhs);
  }

  public Object doApply(final ExtendedThreadContext tc, final char lhs, final Object rhs) {
    return tc.modulo().apply(lhs, (BigInteger)rhs);
  }

  public Object doApply(final ExtendedThreadContext tc, final byte lhs, final Object rhs) {
    return tc.modulo().apply(lhs, (BigInteger)rhs);
  }

  public Object doApply(final ExtendedThreadContext tc, final short lhs, final Object rhs) {
    return tc.modulo().apply(lhs, (BigInteger)rhs);
  }

  public Object doApply(final ExtendedThreadContext tc, final int lhs, final Object rhs) {
    return tc.modulo().apply(lhs, (BigInteger)rhs);
  }

  public Object doApply(final ExtendedThreadContext tc, final long lhs, final Object rhs) {
    return tc.modulo().apply(lhs, (BigInteger)rhs);
  }

  public Object doApply(final ExtendedThreadContext tc, final float lhs, final Object rhs) {
    return tc.modulo().apply(lhs, (BigInteger)rhs);
  }

  public Object doApply(final ExtendedThreadContext tc, final double lhs, final Object rhs) {
    return tc.modulo().apply(lhs, (BigInteger)rhs);
  }

  public Object doApply(final ExtendedThreadContext tc, final BigInteger lhs, final Object rhs) {
    return tc.modulo().apply(lhs, (BigInteger)rhs);
  }

  public Object doApply(final ExtendedThreadContext tc, final BigDecimal lhs, final Object rhs) {
    return tc.modulo().apply(lhs, (BigInteger)rhs);
  }

  public BigInteger doBigIntegerApply(final ExtendedThreadContext tc, final BigInteger lhs, final char rhs) {
    return lhs.divide(BigInteger.valueOf(rhs));
  }

  public BigInteger doBigIntegerApply(final ExtendedThreadContext tc, final BigInteger lhs, final byte rhs) {
    return lhs.divide(BigInteger.valueOf(rhs));
  }

  public BigInteger doBigIntegerApply(final ExtendedThreadContext tc, final BigInteger lhs, final short rhs) {
    return lhs.divide(BigInteger.valueOf(rhs));
  }

  public BigInteger doBigIntegerApply(final ExtendedThreadContext tc, final BigInteger lhs, final int rhs) {
    return lhs.divide(BigInteger.valueOf(rhs));
  }

  public BigInteger doBigIntegerApply(final ExtendedThreadContext tc, final BigInteger lhs, final long rhs) {
    return lhs.divide(BigInteger.valueOf(rhs));
  }

  public float doFloatApply(final ExtendedThreadContext tc, final BigInteger lhs, final float rhs) {
    return (float)Math.floor(lhs.floatValue()/ rhs);
  }

  public double doDoubleApply(final ExtendedThreadContext tc, final BigInteger lhs, final double rhs) {
    return Math.floor(lhs.doubleValue()/ rhs);
  }

  public BigInteger doBigIntegerApply(final ExtendedThreadContext tc, final BigInteger lhs, final BigInteger rhs) {
    return lhs.divide(rhs);
  }

  public BigDecimal doBigDecimalApply(final ExtendedThreadContext tc, final BigInteger lhs, final BigDecimal rhs) {
    return new BigDecimal(lhs).divideToIntegralValue(rhs);
  }
}
