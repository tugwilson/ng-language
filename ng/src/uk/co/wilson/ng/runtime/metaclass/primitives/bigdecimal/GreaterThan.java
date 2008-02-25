package uk.co.wilson.ng.runtime.metaclass.primitives.bigdecimal;

import java.math.BigDecimal;
import java.math.BigInteger;

import ng.runtime.metaclass.MetaClass;
import uk.co.wilson.ng.runtime.threadcontext.ExtendedThreadContext;

/**
 * @author John
 *
 */
public class GreaterThan extends BaseBooleanComparison {
  public Object doApply(final ExtendedThreadContext tc, final Object lhs, final Object rhs) {
    return tc.greaterThan().apply((BigDecimal)lhs, rhs);
  }

  public Object doApply(final ExtendedThreadContext tc, final Object lhs, final MetaClass rhsMetaClass, final Object rhs) {
    return tc.greaterThan().apply((BigDecimal)lhs, rhsMetaClass, rhs);
  }

  public Object doReverseApply(final ExtendedThreadContext tc, final Object lhs, final Object rhs) {
    return tc.greaterThan().apply(lhs, (BigDecimal)rhs);
  }

  public boolean doApplyBoolean(final ExtendedThreadContext tc, final Object lhs, final Object rhs) {
    return tc.greaterThan().applyBoolean((BigDecimal)lhs, rhs);
  }

  public boolean doApplyBoolean(final ExtendedThreadContext tc, final Object lhs, final MetaClass rhsMetaClass, final Object rhs) {
    return tc.greaterThan().applyBoolean((BigDecimal)lhs, rhsMetaClass, rhs);
  }

  public boolean doReverseApplyBoolean(final ExtendedThreadContext tc, final Object lhs, final Object rhs) {
    return tc.greaterThan().applyBoolean(lhs, (BigDecimal)rhs);
  }

  public boolean doApplyBoolean(final ExtendedThreadContext tc, final char lhs, final Object rhs) {
    return tc.greaterThan().applyBoolean(lhs, (BigDecimal)rhs);
  }

  public boolean doApplyBoolean(final ExtendedThreadContext tc, final byte lhs, final Object rhs) {
    return tc.greaterThan().applyBoolean(lhs, (BigDecimal)rhs);
  }

  public boolean doApplyBoolean(final ExtendedThreadContext tc, final short lhs, final Object rhs) {
    return tc.greaterThan().applyBoolean(lhs, (BigDecimal)rhs);
  }

  public boolean doApplyBoolean(final ExtendedThreadContext tc, final int lhs, final Object rhs) {
    return tc.greaterThan().applyBoolean(lhs, (BigDecimal)rhs);
  }

  public boolean doApplyBoolean(final ExtendedThreadContext tc, final long lhs, final Object rhs) {
    return tc.greaterThan().applyBoolean(lhs, (BigDecimal)rhs);
  }

  public boolean doApplyBoolean(final ExtendedThreadContext tc, final float lhs, final Object rhs) {
    return tc.greaterThan().applyBoolean(lhs, (BigDecimal)rhs);
  }

  public boolean doApplyBoolean(final ExtendedThreadContext tc, final double lhs, final Object rhs) {
    return tc.greaterThan().applyBoolean(lhs, (BigDecimal)rhs);
  }

  public boolean doApplyBoolean(final ExtendedThreadContext tc, final BigInteger lhs, final Object rhs) {
    return tc.greaterThan().applyBoolean(lhs, (BigDecimal)rhs);
  }

  public boolean doApplyBoolean(final ExtendedThreadContext tc, final BigDecimal lhs, final Object rhs) {
    return tc.greaterThan().applyBoolean(lhs, (BigDecimal)rhs);
  }

  public boolean doApplyBoolean(final ExtendedThreadContext tc, final BigDecimal lhs, final char rhs) {
    return lhs.compareTo(BigDecimal.valueOf(rhs)) > 0;
  }

  public boolean doApplyBoolean(final ExtendedThreadContext tc, final BigDecimal lhs, final byte rhs) {
    return lhs.compareTo(BigDecimal.valueOf(rhs)) > 0;
  }

  public boolean doApplyBoolean(final ExtendedThreadContext tc, final BigDecimal lhs, final short rhs) {
    return lhs.compareTo(BigDecimal.valueOf(rhs)) > 0;
  }

  public boolean doApplyBoolean(final ExtendedThreadContext tc, final BigDecimal lhs, final int rhs) {
    return lhs.compareTo(BigDecimal.valueOf(rhs)) > 0;
  }

  public boolean doApplyBoolean(final ExtendedThreadContext tc, final BigDecimal lhs, final long rhs) {
    return lhs.compareTo(BigDecimal.valueOf(rhs)) > 0;
  }

  public boolean doApplyBoolean(final ExtendedThreadContext tc, final BigDecimal lhs, final float rhs) {
    return lhs.compareTo(BigDecimal.valueOf(rhs)) > 0;
  }

  public boolean doApplyBoolean(final ExtendedThreadContext tc, final BigDecimal lhs, final double rhs) {
    return lhs.compareTo(BigDecimal.valueOf(rhs)) > 0;
  }

  public boolean doApplyBoolean(final ExtendedThreadContext tc, final BigDecimal lhs, final BigInteger rhs) {
    return lhs.compareTo(new BigDecimal(rhs)) > 0;
  }

  public boolean doApplyBoolean(final ExtendedThreadContext tc, final BigDecimal lhs, final BigDecimal rhs) {
    return lhs.compareTo(rhs) > 0;
  }
}
