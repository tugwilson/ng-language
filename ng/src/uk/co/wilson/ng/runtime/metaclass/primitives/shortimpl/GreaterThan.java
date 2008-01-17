package uk.co.wilson.ng.runtime.metaclass.primitives.shortimpl;

import java.math.BigDecimal;
import java.math.BigInteger;

import ng.runtime.metaclass.MetaClass;
import ng.runtime.threadcontext.ThreadContext;

/**
 * @author John
 *
 */
public class GreaterThan extends BaseBooleanComparison {
  public Object doApply(final ThreadContext tc, final Object lhs, final Object rhs) {
    return tc.greaterThan().apply(tc.unwrapToShort(lhs), rhs);
  }

  public Object doApply(final ThreadContext tc, final Object lhs, final MetaClass rhsMetaClass, final Object rhs) {
    return tc.greaterThan().apply(tc.unwrapToShort(lhs), rhsMetaClass, rhs);
  }

  public Object doReverseApply(final ThreadContext tc, final Object lhs, final Object rhs) {
    return tc.greaterThan().apply(lhs, tc.unwrapToShort(rhs));
  }

  public boolean doApplyBoolean(final ThreadContext tc, final Object lhs, final Object rhs) {
    return tc.greaterThan().applyBoolean(tc.unwrapToShort(lhs), rhs);
  }

  public boolean doApplyBoolean(final ThreadContext tc, final Object lhs, final MetaClass rhsMetaClass, final Object rhs) {
    return tc.greaterThan().applyBoolean(tc.unwrapToShort(lhs), rhsMetaClass, rhs);
  }

  public boolean doReverseApplyBoolean(final ThreadContext tc, final Object lhs, final Object rhs) {
    return tc.greaterThan().applyBoolean(lhs, tc.unwrapToShort(rhs));
  }

  public boolean doApplyBoolean(final ThreadContext tc, final char lhs, final Object rhs) {
    return tc.greaterThan().applyBoolean(lhs, tc.unwrapToShort(rhs));
  }

  public boolean doApplyBoolean(final ThreadContext tc, final byte lhs, final Object rhs) {
    return tc.greaterThan().applyBoolean(lhs, tc.unwrapToShort(rhs));
  }

  public boolean doApplyBoolean(final ThreadContext tc, final short lhs, final Object rhs) {
    return tc.greaterThan().applyBoolean(lhs, tc.unwrapToShort(rhs));
  }

  public boolean doApplyBoolean(final ThreadContext tc, final int lhs, final Object rhs) {
    return tc.greaterThan().applyBoolean(lhs, tc.unwrapToShort(rhs));
  }

  public boolean doApplyBoolean(final ThreadContext tc, final long lhs, final Object rhs) {
    return tc.greaterThan().applyBoolean(lhs, tc.unwrapToShort(rhs));
  }

  public boolean doApplyBoolean(final ThreadContext tc, final float lhs, final Object rhs) {
    return tc.greaterThan().applyBoolean(lhs, tc.unwrapToShort(rhs));
  }

  public boolean doApplyBoolean(final ThreadContext tc, final double lhs, final Object rhs) {
    return tc.greaterThan().applyBoolean(lhs, tc.unwrapToShort(rhs));
  }

  public boolean doApplyBoolean(final ThreadContext tc, final BigInteger lhs, final Object rhs) {
    return tc.greaterThan().applyBoolean(lhs, tc.unwrapToShort(rhs));
  }

  public boolean doApplyBoolean(final ThreadContext tc, final BigDecimal lhs, final Object rhs) {
    return tc.greaterThan().applyBoolean(lhs, tc.unwrapToShort(rhs));
  }

  public boolean doApplyBoolean(final ThreadContext tc, final short lhs, final char rhs) {
    return lhs > rhs;
  }

  public boolean doApplyBoolean(final ThreadContext tc, final short lhs, final byte rhs) {
    return lhs > rhs;
  }

  public boolean doApplyBoolean(final ThreadContext tc, final short lhs, final short rhs) {
    return lhs > rhs;
  }

  public boolean doApplyBoolean(final ThreadContext tc, final short lhs, final int rhs) {
    return lhs > rhs;
  }

  public boolean doApplyBoolean(final ThreadContext tc, final short lhs, final long rhs) {
    return lhs > rhs;
  }

  public boolean doApplyBoolean(final ThreadContext tc, final short lhs, final float rhs) {
    return lhs > rhs;
  }

  public boolean doApplyBoolean(final ThreadContext tc, final short lhs, final double rhs) {
    return lhs > rhs;
  }

  public boolean doApplyBoolean(final ThreadContext tc, final short lhs, final BigInteger rhs) {
    return BigInteger.valueOf(lhs).compareTo(rhs) > 0;
  }

  public boolean doApplyBoolean(final ThreadContext tc, final short lhs, final BigDecimal rhs) {
    return BigDecimal.valueOf(lhs).compareTo(rhs) > 0;
  }
}
