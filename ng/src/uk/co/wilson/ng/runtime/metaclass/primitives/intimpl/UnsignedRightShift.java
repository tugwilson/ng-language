package uk.co.wilson.ng.runtime.metaclass.primitives.intimpl;

import java.math.BigDecimal;
import java.math.BigInteger;

import ng.runtime.metaclass.MetaClass;
import ng.runtime.threadcontext.ExtendedThreadContext;
import ng.runtime.threadcontext.NotPerformed;

/**
 * @author John
 * 
 */
public class UnsignedRightShift extends BaseShiftOperation {
  public Object doApply(final ExtendedThreadContext tc, final Object lhs, final Object rhs) {
    return tc.unsignedRightShift().apply(tc.unwrapToInt(lhs), rhs);
  }

  public Object doApply(final ExtendedThreadContext tc, final Object lhs, final MetaClass rhsMetaClass, final Object rhs) {
    return tc.unsignedRightShift().apply(tc.unwrapToInt(lhs), rhsMetaClass, rhs);
  }

  public Object doReverseApply(final ExtendedThreadContext tc, final Object lhs, final Object rhs) {
    return tc.unsignedRightShift().apply(lhs, tc.unwrapToInt(rhs));
  }

  public int doIntApply(final ExtendedThreadContext tc, final int lhs, final char rhs) throws NotPerformed {
    return lhs >>> rhs;
  }

  public int doIntApply(final ExtendedThreadContext tc, final int lhs, final byte rhs) throws NotPerformed {
    return lhs >>> rhs;
  }

  public int doIntApply(final ExtendedThreadContext tc, final int lhs, final short rhs) throws NotPerformed {
    return lhs >>> rhs;
  }

  public int doIntApply(final ExtendedThreadContext tc, final int lhs, final int rhs) throws NotPerformed {
    return lhs >>> rhs;
  }

  public int doIntApply(final ExtendedThreadContext tc, final int lhs, final long rhs) throws NotPerformed {
    return lhs >>> rhs;
  }

  public int doIntApply(final ExtendedThreadContext tc, final int lhs, final BigInteger rhs) throws NotPerformed {
    return lhs >>> rhs.longValue();
  }

  public Object doApply(final ExtendedThreadContext tc, final char lhs, final Object rhs) {
    return tc.unsignedRightShift().apply(lhs, tc.unwrapToInt(rhs));
  }

  public Object doApply(final ExtendedThreadContext tc, final byte lhs, final Object rhs) {
    return tc.unsignedRightShift().apply(lhs, tc.unwrapToInt(rhs));
  }

  public Object doApply(final ExtendedThreadContext tc, final short lhs, final Object rhs) {
    return tc.unsignedRightShift().apply(lhs, tc.unwrapToInt(rhs));
  }

  public Object doApply(final ExtendedThreadContext tc, final int lhs, final Object rhs) {
    return tc.unsignedRightShift().apply(lhs, tc.unwrapToInt(rhs));
  }

  public Object doApply(final ExtendedThreadContext tc, final long lhs, final Object rhs) {
    return tc.unsignedRightShift().apply(lhs, tc.unwrapToInt(rhs));
  }

  public Object doApply(final ExtendedThreadContext tc, final float lhs, final Object rhs) {
    return tc.unsignedRightShift().apply(lhs, tc.unwrapToInt(rhs));
  }

  public Object doApply(final ExtendedThreadContext tc, final double lhs, final Object rhs) {
    return tc.unsignedRightShift().apply(lhs, tc.unwrapToInt(rhs));
  }

  public Object doApply(final ExtendedThreadContext tc, final BigInteger lhs, final Object rhs) {
    return tc.unsignedRightShift().apply(lhs, tc.unwrapToInt(rhs));
  }

  public Object doApply(final ExtendedThreadContext tc, final BigDecimal lhs, final Object rhs) {
    return tc.unsignedRightShift().apply(lhs, tc.unwrapToInt(rhs));
  }
}
