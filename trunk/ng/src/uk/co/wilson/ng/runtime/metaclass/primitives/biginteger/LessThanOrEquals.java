package uk.co.wilson.ng.runtime.metaclass.primitives.biginteger;

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
    return tc.lessThanOrEquals().apply((BigInteger)lhs, rhs);
  }

  public Object doApply(final ThreadContext tc, final Object lhs, final MetaClass rhsMetaClass, final Object rhs) {
    return tc.lessThanOrEquals().apply((BigInteger)lhs, rhsMetaClass, rhs);
  }

  public Object doReverseApply(final ThreadContext tc, final Object lhs, final Object rhs) {
    return tc.lessThanOrEquals().apply(lhs, (BigInteger)rhs);
  }

  public boolean doApplyBoolean(final ThreadContext tc, final Object lhs, final Object rhs) {
    return tc.lessThanOrEquals().applyBoolean((BigInteger)lhs, rhs);
  }

  public boolean doApplyBoolean(final ThreadContext tc, final Object lhs, final MetaClass rhsMetaClass, final Object rhs) {
    return tc.lessThanOrEquals().applyBoolean((BigInteger)lhs, rhsMetaClass, rhs);
  }

  public boolean doReverseApplyBoolean(final ThreadContext tc, final Object lhs, final Object rhs) {
    return tc.lessThanOrEquals().applyBoolean(lhs, (BigInteger)rhs);
  }

  public boolean doApplyBoolean(final ThreadContext tc, final char lhs, final Object rhs) {
    return tc.lessThanOrEquals().applyBoolean(lhs, (BigInteger)rhs);
  }

  public boolean doApplyBoolean(final ThreadContext tc, final byte lhs, final Object rhs) {
    return tc.lessThanOrEquals().applyBoolean(lhs, (BigInteger)rhs);
  }

  public boolean doApplyBoolean(final ThreadContext tc, final short lhs, final Object rhs) {
    return tc.lessThanOrEquals().applyBoolean(lhs, (BigInteger)rhs);
  }

  public boolean doApplyBoolean(final ThreadContext tc, final int lhs, final Object rhs) {
    return tc.lessThanOrEquals().applyBoolean(lhs, (BigInteger)rhs);
  }

  public boolean doApplyBoolean(final ThreadContext tc, final long lhs, final Object rhs) {
    return tc.lessThanOrEquals().applyBoolean(lhs, (BigInteger)rhs);
  }

  public boolean doApplyBoolean(final ThreadContext tc, final float lhs, final Object rhs) {
    return tc.lessThanOrEquals().applyBoolean(lhs, (BigInteger)rhs);
  }

  public boolean doApplyBoolean(final ThreadContext tc, final double lhs, final Object rhs) {
    return tc.lessThanOrEquals().applyBoolean(lhs, (BigInteger)rhs);
  }

  public boolean doApplyBoolean(final ThreadContext tc, final BigInteger lhs, final Object rhs) {
    return lhs.compareTo((BigInteger)rhs) <= 0;
  }

  public boolean doApplyBoolean(final ThreadContext tc, final BigDecimal lhs, final Object rhs) {
    return lhs.compareTo(BigDecimal.valueOf(((BigInteger)rhs).longValue())) <= 0;
  }

  public boolean doApplyBoolean(final ThreadContext tc, final BigInteger lhs, final char rhs) {
    return lhs.compareTo(BigInteger.valueOf(rhs)) <= 0;
  }

  public boolean doApplyBoolean(final ThreadContext tc, final BigInteger lhs, final byte rhs) {
    return lhs.compareTo(BigInteger.valueOf(rhs)) <= 0;
  }

  public boolean doApplyBoolean(final ThreadContext tc, final BigInteger lhs, final short rhs) {
    return lhs.compareTo(BigInteger.valueOf(rhs)) <= 0;
  }

  public boolean doApplyBoolean(final ThreadContext tc, final BigInteger lhs, final int rhs) {
    return lhs.compareTo(BigInteger.valueOf(rhs)) <= 0;
  }

  public boolean doApplyBoolean(final ThreadContext tc, final BigInteger lhs, final long rhs) {
    return lhs.compareTo(BigInteger.valueOf(rhs)) <= 0;
  }

  public boolean doApplyBoolean(final ThreadContext tc, final BigInteger lhs, final float rhs) {
    return lhs.compareTo(BigInteger.valueOf((long)rhs)) <= 0;
  }

  public boolean doApplyBoolean(final ThreadContext tc, final BigInteger lhs, final double rhs) {
    return lhs.compareTo(BigInteger.valueOf((long)rhs)) <= 0;
  }

  public boolean doApplyBoolean(final ThreadContext tc, final BigInteger lhs, final BigInteger rhs) {
    return lhs.compareTo(rhs) <= 0;
  }

  public boolean doApplyBoolean(final ThreadContext tc, final BigInteger lhs, final BigDecimal rhs) {
    return new BigDecimal(lhs).compareTo(rhs) <= 0;
  }
}
