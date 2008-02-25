package uk.co.wilson.ng.runtime.metaclass.primitives.charimpl;

import java.math.BigDecimal;
import java.math.BigInteger;

import ng.runtime.metaclass.MetaClass;
import uk.co.wilson.ng.runtime.threadcontext.ExtendedThreadContext;

/**
 * @author John
 *
 */
public class LessThanOrEquals extends BaseBooleanComparison {
  public Object doApply(final ExtendedThreadContext tc, final Object lhs, final Object rhs) {
    return tc.lessThanOrEquals().apply(tc.unwrapToChar(lhs), rhs);
  }

  public Object doApply(final ExtendedThreadContext tc, final Object lhs, final MetaClass rhsMetaClass, final Object rhs) {
    return tc.lessThanOrEquals().apply(tc.unwrapToChar(lhs), rhsMetaClass, rhs);
  }

  public Object doReverseApply(final ExtendedThreadContext tc, final Object lhs, final Object rhs) {
    return tc.lessThanOrEquals().apply(lhs, tc.unwrapToChar(rhs));
  }

  public boolean doApplyBoolean(final ExtendedThreadContext tc, final Object lhs, final Object rhs) {
    return tc.lessThanOrEquals().applyBoolean(tc.unwrapToChar(lhs), rhs);
  }

  public boolean doApplyBoolean(final ExtendedThreadContext tc, final Object lhs, final MetaClass rhsMetaClass, final Object rhs) {
    return tc.lessThanOrEquals().applyBoolean(tc.unwrapToChar(lhs), rhsMetaClass, rhs);
  }

  public boolean doReverseApplyBoolean(final ExtendedThreadContext tc, final Object lhs, final Object rhs) {
    return tc.lessThanOrEquals().applyBoolean(lhs, tc.unwrapToChar(rhs));
  }

  public boolean doApplyBoolean(final ExtendedThreadContext tc, final char lhs, final Object rhs) {
    return tc.lessThanOrEquals().applyBoolean(lhs, tc.unwrapToChar(rhs));
  }

  public boolean doApplyBoolean(final ExtendedThreadContext tc, final byte lhs, final Object rhs) {
    return tc.lessThanOrEquals().applyBoolean(lhs, tc.unwrapToChar(rhs));
  }

  public boolean doApplyBoolean(final ExtendedThreadContext tc, final short lhs, final Object rhs) {
    return tc.lessThanOrEquals().applyBoolean(lhs, tc.unwrapToChar(rhs));
  }

  public boolean doApplyBoolean(final ExtendedThreadContext tc, final int lhs, final Object rhs) {
    return tc.lessThanOrEquals().applyBoolean(lhs, tc.unwrapToChar(rhs));
  }

  public boolean doApplyBoolean(final ExtendedThreadContext tc, final long lhs, final Object rhs) {
    return tc.lessThanOrEquals().applyBoolean(lhs, tc.unwrapToChar(rhs));
  }

  public boolean doApplyBoolean(final ExtendedThreadContext tc, final float lhs, final Object rhs) {
    return tc.lessThanOrEquals().applyBoolean(lhs, tc.unwrapToChar(rhs));
  }

  public boolean doApplyBoolean(final ExtendedThreadContext tc, final double lhs, final Object rhs) {
    return tc.lessThanOrEquals().applyBoolean(lhs, tc.unwrapToChar(rhs));
  }

  public boolean doApplyBoolean(final ExtendedThreadContext tc, final BigInteger lhs, final Object rhs) {
    return tc.lessThanOrEquals().applyBoolean(lhs, tc.unwrapToChar(rhs));
  }

  public boolean doApplyBoolean(final ExtendedThreadContext tc, final BigDecimal lhs, final Object rhs) {
    return tc.lessThanOrEquals().applyBoolean(lhs, tc.unwrapToChar(rhs));
  }

  public boolean doApplyBoolean(final ExtendedThreadContext tc, final char lhs, final char rhs) {
    return lhs <= rhs;
  }

  public boolean doApplyBoolean(final ExtendedThreadContext tc, final char lhs, final byte rhs) {
    return lhs <= rhs;
  }

  public boolean doApplyBoolean(final ExtendedThreadContext tc, final char lhs, final short rhs) {
    return lhs <= rhs;
  }

  public boolean doApplyBoolean(final ExtendedThreadContext tc, final char lhs, final int rhs) {
    return lhs <= rhs;
  }

  public boolean doApplyBoolean(final ExtendedThreadContext tc, final char lhs, final long rhs) {
    return lhs <= rhs;
  }

  public boolean doApplyBoolean(final ExtendedThreadContext tc, final char lhs, final float rhs) {
    return lhs <= rhs;
  }

  public boolean doApplyBoolean(final ExtendedThreadContext tc, final char lhs, final double rhs) {
    return lhs <= rhs;
  }

  public boolean doApplyBoolean(final ExtendedThreadContext tc, final char lhs, final BigInteger rhs) {
    return BigInteger.valueOf(lhs).compareTo(rhs) <= 0;
  }

  public boolean doApplyBoolean(final ExtendedThreadContext tc, final char lhs, final BigDecimal rhs) {
    return BigDecimal.valueOf(lhs).compareTo(rhs) <= 0;
  }
}
