package uk.co.wilson.ng.runtime.metaclass.primitives.intimpl;

import java.math.BigDecimal;
import java.math.BigInteger;

import ng.runtime.metaclass.MetaClass;
import ng.runtime.threadcontext.ExtendedThreadContext;
import ng.runtime.threadcontext.NotPerformed;

public class And extends BaseBinaryLogicalOperation {
  public Object doApply(final ExtendedThreadContext tc, final Object lhs, final Object rhs) {
    return tc.and().apply(tc.unwrapToInt(lhs), rhs);
  }

  public Object doApply(final ExtendedThreadContext tc, final Object lhs, final MetaClass rhsMetaClass, final Object rhs) {
    return tc.and().apply(tc.unwrapToInt(lhs), rhsMetaClass, rhs);
  }

  public Object doReverseApply(final ExtendedThreadContext tc, final Object lhs, final Object rhs) {
    return tc.and().apply(lhs, tc.unwrapToInt(rhs));
  }

  public int doIntApply(ExtendedThreadContext tc, int lhs, char rhs) throws NotPerformed {
    return lhs & rhs;
  }

  public int doIntApply(ExtendedThreadContext tc, int lhs, byte rhs) throws NotPerformed {
    return lhs & rhs;
  }

  public int doIntApply(ExtendedThreadContext tc, int lhs, short rhs) throws NotPerformed {
    return lhs & rhs;
  }

  public int doIntApply(ExtendedThreadContext tc, int lhs, int rhs) throws NotPerformed {
    return lhs & rhs;
  }

  public long doLongApply(ExtendedThreadContext tc, int lhs, long rhs) throws NotPerformed {
    return lhs & rhs;
  }

  public BigInteger doBigIntegerApply(ExtendedThreadContext tc, int lhs, BigInteger rhs) throws NotPerformed {
    return BigInteger.valueOf(lhs).and(rhs);
  }

  public Object doApply(ExtendedThreadContext tc, char lhs, Object rhs) {
    return tc.and().apply(lhs, tc.unwrapToInt(rhs));
  }

  public Object doApply(ExtendedThreadContext tc, byte lhs, Object rhs) {
    return tc.and().apply(lhs, tc.unwrapToInt(rhs));
  }

  public Object doApply(ExtendedThreadContext tc, short lhs, Object rhs) {
    return tc.and().apply(lhs, tc.unwrapToInt(rhs));
  }

  public Object doApply(ExtendedThreadContext tc, int lhs, Object rhs) {
    return tc.and().apply(lhs, tc.unwrapToInt(rhs));
  }

  public Object doApply(ExtendedThreadContext tc, long lhs, Object rhs) {
    return tc.and().apply(lhs, tc.unwrapToInt(rhs));
  }

  public Object doApply(ExtendedThreadContext tc, float lhs, Object rhs) {
    return tc.and().apply(lhs, tc.unwrapToInt(rhs));
  }

  public Object doApply(ExtendedThreadContext tc, double lhs, Object rhs) {
    return tc.and().apply(lhs, tc.unwrapToInt(rhs));
  }

  public Object doApply(ExtendedThreadContext tc, BigInteger lhs, Object rhs) {
    return tc.and().apply(lhs, tc.unwrapToInt(rhs));
  }

  public Object doApply(ExtendedThreadContext tc, BigDecimal lhs, Object rhs) {
    return tc.and().apply(lhs, tc.unwrapToInt(rhs));
  }
}
