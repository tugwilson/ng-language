package uk.co.wilson.ng.runtime.metaclass.primitives.bigdecimal;

import java.math.BigDecimal;
import java.math.BigInteger;

import ng.runtime.metaclass.MetaClass;
import ng.runtime.threadcontext.ExtendedThreadContext;

/**
 * @author John
 * 
 */
public class Multiply extends BaseBinaryArithmeticOperation {
  public Object doApply(final ExtendedThreadContext tc, final Object lhs, final Object rhs) {
    return tc.multiply().apply((BigDecimal) lhs, rhs);
  }

  public Object doApply(final ExtendedThreadContext tc, final Object lhs, final MetaClass rhsMetaClass, final Object rhs) {
    return tc.multiply().apply((BigDecimal) lhs, rhsMetaClass, rhs);
  }

  public Object doApply(final ExtendedThreadContext tc, final char lhs, final Object rhs) {
    return tc.multiply().apply(lhs, (BigDecimal) rhs);
  }

  public Object doReverseApply(final ExtendedThreadContext tc, final Object lhs, final Object rhs) {
    return tc.multiply().apply(lhs, (BigDecimal) rhs);
  }

  public Object doApply(final ExtendedThreadContext tc, final byte lhs, final Object rhs) {
    return tc.multiply().apply(lhs, (BigDecimal) rhs);
  }

  public Object doApply(final ExtendedThreadContext tc, final short lhs, final Object rhs) {
    return tc.multiply().apply(lhs, (BigDecimal) rhs);
  }

  public Object doApply(final ExtendedThreadContext tc, final int lhs, final Object rhs) {
    return tc.multiply().apply(lhs, (BigDecimal) rhs);
  }

  public Object doApply(final ExtendedThreadContext tc, final long lhs, final Object rhs) {
    return tc.multiply().apply(lhs, (BigDecimal) rhs);
  }

  public Object doApply(final ExtendedThreadContext tc, final float lhs, final Object rhs) {
    return tc.multiply().apply(lhs, (BigDecimal) rhs);
  }

  public Object doApply(final ExtendedThreadContext tc, final double lhs, final Object rhs) {
    return tc.multiply().apply(lhs, (BigDecimal) rhs);
  }

  public Object doApply(final ExtendedThreadContext tc, final BigInteger lhs, final Object rhs) {
    return tc.multiply().apply(lhs, (BigDecimal) rhs);
  }

  public Object doApply(final ExtendedThreadContext tc, final BigDecimal lhs, final Object rhs) {
    return tc.multiply().apply(lhs, (BigDecimal) rhs);
  }

  public BigDecimal doBigDecimalApply(final ExtendedThreadContext tc, final BigDecimal lhs, final char rhs) {
    return lhs.multiply(BigDecimal.valueOf(rhs));
  }

  public BigDecimal doBigDecimalApply(final ExtendedThreadContext tc, final BigDecimal lhs, final byte rhs) {
    return lhs.multiply(BigDecimal.valueOf(rhs));
  }

  public BigDecimal doBigDecimalApply(final ExtendedThreadContext tc, final BigDecimal lhs, final short rhs) {
    return lhs.multiply(BigDecimal.valueOf(rhs));
  }

  public BigDecimal doBigDecimalApply(final ExtendedThreadContext tc, final BigDecimal lhs, final int rhs) {
    return lhs.multiply(BigDecimal.valueOf(rhs));
  }

  public BigDecimal doBigDecimalApply(final ExtendedThreadContext tc, final BigDecimal lhs, final long rhs) {
    return lhs.multiply(BigDecimal.valueOf(rhs));
  }

  public BigDecimal doBigDecimalApply(final ExtendedThreadContext tc, final BigDecimal lhs, final float rhs) {
    return lhs.multiply(BigDecimal.valueOf(rhs));
  }

  public BigDecimal doBigDecimalApply(final ExtendedThreadContext tc, final BigDecimal lhs, final double rhs) {
    return lhs.multiply(BigDecimal.valueOf(rhs));
  }

  public BigDecimal doBigDecimalApply(final ExtendedThreadContext tc, final BigDecimal lhs, final BigInteger rhs) {
    return lhs.multiply(new BigDecimal(rhs));
  }

  public BigDecimal doBigDecimalApply(final ExtendedThreadContext tc, final BigDecimal lhs, final BigDecimal rhs) {
    return lhs.multiply(rhs);
  }
}
