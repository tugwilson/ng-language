package uk.co.wilson.ng.runtime.metaclass.primitives.biginteger;

import java.math.BigDecimal;
import java.math.BigInteger;

import uk.co.wilson.ng.runtime.threadcontext.ExtendedThreadContext;

import ng.runtime.metaclass.MetaClass;

/**
 * @author John
 *
 */
public class NotEquals extends BaseBooleanComparison {
    public Object doApply(final ExtendedThreadContext tc, final Object lhs, final Object rhs) {
      return tc.notEquals().apply((BigInteger)lhs, rhs);
    }

    public Object doApply(final ExtendedThreadContext tc, final Object lhs, final MetaClass rhsMetaClass, final Object rhs) {
      return tc.notEquals().apply((BigInteger)lhs, rhsMetaClass, rhs);
    }

    public Object doReverseApply(final ExtendedThreadContext tc, final Object lhs, final Object rhs) {
      return tc.notEquals().apply(lhs, (BigInteger)rhs);
    }

    public boolean doApplyBoolean(final ExtendedThreadContext tc, final Object lhs, final Object rhs) {
      return tc.notEquals().applyBoolean((BigInteger)lhs, rhs);
    }

    public boolean doApplyBoolean(final ExtendedThreadContext tc, final Object lhs, final MetaClass rhsMetaClass, final Object rhs) {
      return tc.notEquals().applyBoolean((BigInteger)lhs, rhsMetaClass, rhs);
    }

    public boolean doReverseApplyBoolean(final ExtendedThreadContext tc, final Object lhs, final Object rhs) {
      return tc.notEquals().applyBoolean(lhs, (BigInteger)rhs);
    }

    public boolean doApplyBoolean(final ExtendedThreadContext tc, final char lhs, final Object rhs) {
      return tc.notEquals().applyBoolean(lhs, (BigInteger)rhs);
    }

    public boolean doApplyBoolean(final ExtendedThreadContext tc, final byte lhs, final Object rhs) {
      return tc.notEquals().applyBoolean(lhs, (BigInteger)rhs);
    }

    public boolean doApplyBoolean(final ExtendedThreadContext tc, final short lhs, final Object rhs) {
      return tc.notEquals().applyBoolean(lhs, (BigInteger)rhs);
    }

    public boolean doApplyBoolean(final ExtendedThreadContext tc, final int lhs, final Object rhs) {
      return tc.notEquals().applyBoolean(lhs, (BigInteger)rhs);
    }

    public boolean doApplyBoolean(final ExtendedThreadContext tc, final long lhs, final Object rhs) {
      return tc.notEquals().applyBoolean(lhs, (BigInteger)rhs);
    }

    public boolean doApplyBoolean(final ExtendedThreadContext tc, final float lhs, final Object rhs) {
      return tc.notEquals().applyBoolean(lhs, (BigInteger)rhs);
    }

    public boolean doApplyBoolean(final ExtendedThreadContext tc, final double lhs, final Object rhs) {
      return tc.notEquals().applyBoolean(lhs, (BigInteger)rhs);
    }

    public boolean doApplyBoolean(final ExtendedThreadContext tc, final BigInteger lhs, final Object rhs) {
      return lhs.compareTo((BigInteger)rhs) != 0;
    }

    public boolean doApplyBoolean(final ExtendedThreadContext tc, final BigDecimal lhs, final Object rhs) {
      return lhs.compareTo(BigDecimal.valueOf(((BigInteger)rhs).longValue())) != 0;
    }

    public boolean doApplyBoolean(final ExtendedThreadContext tc, final BigInteger lhs, final char rhs) {
      return lhs.compareTo(BigInteger.valueOf(rhs)) != 0;
    }

    public boolean doApplyBoolean(final ExtendedThreadContext tc, final BigInteger lhs, final byte rhs) {
      return lhs.compareTo(BigInteger.valueOf(rhs)) != 0;
    }

    public boolean doApplyBoolean(final ExtendedThreadContext tc, final BigInteger lhs, final short rhs) {
      return lhs.compareTo(BigInteger.valueOf(rhs)) != 0;
    }

    public boolean doApplyBoolean(final ExtendedThreadContext tc, final BigInteger lhs, final int rhs) {
      return lhs.compareTo(BigInteger.valueOf(rhs)) != 0;
    }

    public boolean doApplyBoolean(final ExtendedThreadContext tc, final BigInteger lhs, final long rhs) {
      return lhs.compareTo(BigInteger.valueOf(rhs)) != 0;
    }

    public boolean doApplyBoolean(final ExtendedThreadContext tc, final BigInteger lhs, final float rhs) {
      return lhs.compareTo(BigInteger.valueOf((long)rhs)) != 0;
    }

    public boolean doApplyBoolean(final ExtendedThreadContext tc, final BigInteger lhs, final double rhs) {
      return lhs.compareTo(BigInteger.valueOf((long)rhs)) != 0;
    }

    public boolean doApplyBoolean(final ExtendedThreadContext tc, final BigInteger lhs, final BigInteger rhs) {
      return lhs.compareTo(rhs) != 0;
    }

    public boolean doApplyBoolean(final ExtendedThreadContext tc, final BigInteger lhs, final BigDecimal rhs) {
      return new BigDecimal(lhs).compareTo(rhs) != 0;
    }
}
