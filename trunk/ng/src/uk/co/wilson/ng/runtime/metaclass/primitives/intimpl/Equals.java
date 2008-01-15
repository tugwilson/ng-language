package uk.co.wilson.ng.runtime.metaclass.primitives.intimpl;

import java.math.BigDecimal;
import java.math.BigInteger;

import ng.runtime.metaclass.MetaClass;
import ng.runtime.threadcontext.ThreadContext;

class Equals extends BaseBooleanComparison {
  public Object doApply(final ThreadContext tc, final Object lhs, final Object rhs) {
    return tc.equals().apply(tc.unwrapToInt(lhs), rhs);
  }

  public Object doApply(final ThreadContext tc, final Object lhs, final MetaClass rhsMetaClass, final Object rhs) {
    return tc.equals().apply(tc.unwrapToInt(lhs), rhsMetaClass, rhs);
  }

  public Object doReverseApply(final ThreadContext tc, final Object lhs, final Object rhs) {
    return tc.equals().apply(lhs, tc.unwrapToInt(rhs));
  }

  public boolean doApplyBoolean(final ThreadContext tc, final Object lhs, final Object rhs) {
    return tc.equals().applyBoolean(tc.unwrapToInt(lhs), rhs);
  }

  public boolean doApplyBoolean(final ThreadContext tc, final Object lhs, final MetaClass rhsMetaClass, final Object rhs) {
    return tc.equals().applyBoolean(tc.unwrapToInt(lhs), rhsMetaClass, rhs);
  }

  public boolean doReverseApplyBoolean(final ThreadContext tc, final Object lhs, final Object rhs) {
    return tc.equals().applyBoolean(lhs, tc.unwrapToInt(rhs));
  }

  public boolean doApplyBoolean(final ThreadContext tc, final char lhs, final Object rhs) {
    return tc.equals().applyBoolean(lhs, tc.unwrapToInt(rhs));
  }

  public boolean doApplyBoolean(final ThreadContext tc, final byte lhs, final Object rhs) {
    return tc.equals().applyBoolean(lhs, tc.unwrapToInt(rhs));
  }

  public boolean doApplyBoolean(final ThreadContext tc, final short lhs, final Object rhs) {
    return tc.equals().applyBoolean(lhs, tc.unwrapToInt(rhs));
  }

  public boolean doApplyBoolean(final ThreadContext tc, final int lhs, final Object rhs) {
    return tc.equals().applyBoolean(lhs, tc.unwrapToInt(rhs));
  }

  public boolean doApplyBoolean(final ThreadContext tc, final long lhs, final Object rhs) {
    return tc.equals().applyBoolean(lhs, tc.unwrapToInt(rhs));
  }

  public boolean doApplyBoolean(final ThreadContext tc, final float lhs, final Object rhs) {
    return tc.equals().applyBoolean(lhs, tc.unwrapToInt(rhs));
  }

  public boolean doApplyBoolean(final ThreadContext tc, final double lhs, final Object rhs) {
    return tc.equals().applyBoolean(lhs, tc.unwrapToInt(rhs));
  }

  public boolean doApplyBoolean(final ThreadContext tc, final BigInteger lhs, final Object rhs) {
    return tc.equals().applyBoolean(lhs, tc.unwrapToInt(rhs));
  }

  public boolean doApplyBoolean(final ThreadContext tc, final BigDecimal lhs, final Object rhs) {
    return tc.equals().applyBoolean(lhs, tc.unwrapToInt(rhs));
  }

  public boolean doApplyBoolean(final ThreadContext tc, final int lhs, final char rhs) {
    return lhs == rhs;
  }

  public boolean doApplyBoolean(final ThreadContext tc, final int lhs, final byte rhs) {
    return lhs == rhs;
  }

  public boolean doApplyBoolean(final ThreadContext tc, final int lhs, final short rhs) {
    return lhs == rhs;
  }

  public boolean doApplyBoolean(final ThreadContext tc, final int lhs, final int rhs) {
    return lhs == rhs;
  }

  public boolean doApplyBoolean(final ThreadContext tc, final int lhs, final long rhs) {
    return lhs == rhs;
  }

  public boolean doApplyBoolean(final ThreadContext tc, final int lhs, final float rhs) {
    return lhs == rhs;
  }

  public boolean doApplyBoolean(final ThreadContext tc, final int lhs, final double rhs) {
    return lhs == rhs;
  }

  public boolean doApplyBoolean(final ThreadContext tc, final int lhs, final BigInteger rhs) {
    return BigInteger.valueOf(lhs).compareTo(rhs) == 0;
  }

  public boolean doApplyBoolean(final ThreadContext tc, final int lhs, final BigDecimal rhs) {
    return BigDecimal.valueOf(lhs).compareTo(rhs) == 0;
  }
}