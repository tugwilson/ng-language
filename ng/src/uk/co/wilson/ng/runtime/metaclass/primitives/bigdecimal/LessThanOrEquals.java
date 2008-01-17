package uk.co.wilson.ng.runtime.metaclass.primitives.bigdecimal;

import java.math.BigDecimal;
import java.math.BigInteger;

import ng.runtime.metaclass.MetaClass;
import ng.runtime.threadcontext.ThreadContext;

/**
 * @author John
 *
 */
public class LessThanOrEquals extends BaseBooleanComparison {
  public Object doApply(final ThreadContext tc, final Object lhs, final Object rhs) {
    return tc.lessThanOrEquals().apply((BigDecimal)lhs, rhs);
  }

  public Object doApply(final ThreadContext tc, final Object lhs, final MetaClass rhsMetaClass, final Object rhs) {
    return tc.lessThanOrEquals().apply((BigDecimal)lhs, rhsMetaClass, rhs);
  }

  public Object doReverseApply(final ThreadContext tc, final Object lhs, final Object rhs) {
    return tc.lessThanOrEquals().apply(lhs, (BigDecimal)rhs);
  }

  public boolean doApplyBoolean(final ThreadContext tc, final Object lhs, final Object rhs) {
    return tc.lessThanOrEquals().applyBoolean((BigDecimal)lhs, rhs);
  }

  public boolean doApplyBoolean(final ThreadContext tc, final Object lhs, final MetaClass rhsMetaClass, final Object rhs) {
    return tc.lessThanOrEquals().applyBoolean((BigDecimal)lhs, rhsMetaClass, rhs);
  }

  public boolean doReverseApplyBoolean(final ThreadContext tc, final Object lhs, final Object rhs) {
    return tc.lessThanOrEquals().applyBoolean(lhs, (BigDecimal)rhs);
  }

  public boolean doApplyBoolean(final ThreadContext tc, final char lhs, final Object rhs) {
    return tc.lessThanOrEquals().applyBoolean(lhs, (BigDecimal)rhs);
  }

  public boolean doApplyBoolean(final ThreadContext tc, final byte lhs, final Object rhs) {
    return tc.lessThanOrEquals().applyBoolean(lhs, (BigDecimal)rhs);
  }

  public boolean doApplyBoolean(final ThreadContext tc, final short lhs, final Object rhs) {
    return tc.lessThanOrEquals().applyBoolean(lhs, (BigDecimal)rhs);
  }

  public boolean doApplyBoolean(final ThreadContext tc, final int lhs, final Object rhs) {
    return tc.lessThanOrEquals().applyBoolean(lhs, (BigDecimal)rhs);
  }

  public boolean doApplyBoolean(final ThreadContext tc, final long lhs, final Object rhs) {
    return tc.lessThanOrEquals().applyBoolean(lhs, (BigDecimal)rhs);
  }

  public boolean doApplyBoolean(final ThreadContext tc, final float lhs, final Object rhs) {
    return tc.lessThanOrEquals().applyBoolean(lhs, (BigDecimal)rhs);
  }

  public boolean doApplyBoolean(final ThreadContext tc, final double lhs, final Object rhs) {
    return tc.lessThanOrEquals().applyBoolean(lhs, (BigDecimal)rhs);
  }

  public boolean doApplyBoolean(final ThreadContext tc, final BigInteger lhs, final Object rhs) {
    return tc.lessThanOrEquals().applyBoolean(lhs, (BigDecimal)rhs);
  }

  public boolean doApplyBoolean(final ThreadContext tc, final BigDecimal lhs, final Object rhs) {
    return tc.lessThanOrEquals().applyBoolean(lhs, (BigDecimal)rhs);
  }

  public boolean doApplyBoolean(final ThreadContext tc, final BigDecimal lhs, final char rhs) {
    return lhs.compareTo(BigDecimal.valueOf(rhs)) <= 0;
  }

  public boolean doApplyBoolean(final ThreadContext tc, final BigDecimal lhs, final byte rhs) {
    return lhs.compareTo(BigDecimal.valueOf(rhs)) <= 0;
  }

  public boolean doApplyBoolean(final ThreadContext tc, final BigDecimal lhs, final short rhs) {
    return lhs.compareTo(BigDecimal.valueOf(rhs)) <= 0;
  }

  public boolean doApplyBoolean(final ThreadContext tc, final BigDecimal lhs, final int rhs) {
    return lhs.compareTo(BigDecimal.valueOf(rhs)) <= 0;
  }

  public boolean doApplyBoolean(final ThreadContext tc, final BigDecimal lhs, final long rhs) {
    return lhs.compareTo(BigDecimal.valueOf(rhs)) <= 0;
  }

  public boolean doApplyBoolean(final ThreadContext tc, final BigDecimal lhs, final float rhs) {
    return lhs.compareTo(BigDecimal.valueOf(rhs)) <= 0;
  }

  public boolean doApplyBoolean(final ThreadContext tc, final BigDecimal lhs, final double rhs) {
    return lhs.compareTo(BigDecimal.valueOf(rhs)) <= 0;
  }

  public boolean doApplyBoolean(final ThreadContext tc, final BigDecimal lhs, final BigInteger rhs) {
    return lhs.compareTo(BigDecimal.valueOf(rhs.longValue())) <= 0;
  }

  public boolean doApplyBoolean(final ThreadContext tc, final BigDecimal lhs, final BigDecimal rhs) {
    return lhs.compareTo(rhs) <= 0;
  }
}
