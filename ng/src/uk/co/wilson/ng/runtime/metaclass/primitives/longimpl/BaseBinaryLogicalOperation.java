package uk.co.wilson.ng.runtime.metaclass.primitives.longimpl;

import java.math.BigDecimal;
import java.math.BigInteger;

import ng.runtime.metaclass.primitives.longimpl.LongBinaryLogicalOperation;
import ng.runtime.threadcontext.ExtendedThreadContext;
import ng.runtime.threadcontext.NotPerformed;

/**
 * @author John
 *
 */
public abstract class BaseBinaryLogicalOperation extends BaseBinaryOperation implements LongBinaryLogicalOperation {

  public Object doApply(final ExtendedThreadContext tc, final long lhs, final char rhs) {
    try {
      return tc.wrap(doLongApply(tc, lhs, rhs));
    } catch (final NotPerformed e) {
      return ExtendedThreadContext.NOT_PERFORMED;
    }
  }

  public Object doApply(final ExtendedThreadContext tc, final long lhs, final byte rhs) {
    try {
      return tc.wrap(doLongApply(tc, lhs, rhs));
    } catch (final NotPerformed e) {
      return ExtendedThreadContext.NOT_PERFORMED;
    }
  }

  public Object doApply(final ExtendedThreadContext tc, final long lhs, final short rhs) {
    try {
      return tc.wrap(doLongApply(tc, lhs, rhs));
    } catch (final NotPerformed e) {
      return ExtendedThreadContext.NOT_PERFORMED;
    }
  }

  public Object doApply(final ExtendedThreadContext tc, final long lhs, final int rhs) {
    try {
      return tc.wrap(doLongApply(tc, lhs, rhs));
    } catch (final NotPerformed e) {
      return ExtendedThreadContext.NOT_PERFORMED;
    }
  }

  public Object doApply(final ExtendedThreadContext tc, final long lhs, final long rhs) {
    try {
      return tc.wrap(doLongApply(tc, lhs, rhs));
    } catch (final NotPerformed e) {
      return ExtendedThreadContext.NOT_PERFORMED;
    }
  }

  public Object doApply(final ExtendedThreadContext tc, final long lhs, final float rhs) {
    return ExtendedThreadContext.NOT_PERFORMED;
  }

  public Object doApply(final ExtendedThreadContext tc, final long lhs, final double rhs) {
    return ExtendedThreadContext.NOT_PERFORMED;
  }

  public Object doApply(final ExtendedThreadContext tc, final long lhs, final BigInteger rhs) {
    try {
      return doBigIntegerApply(tc, lhs, rhs);
    } catch (final NotPerformed e) {
      return ExtendedThreadContext.NOT_PERFORMED;
    }
  }

  public Object doApply(final ExtendedThreadContext tc, final long lhs, final BigDecimal rhs) {
    return ExtendedThreadContext.NOT_PERFORMED;
  }
}
