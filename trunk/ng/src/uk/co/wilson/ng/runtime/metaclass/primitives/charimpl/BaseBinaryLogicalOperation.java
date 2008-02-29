package uk.co.wilson.ng.runtime.metaclass.primitives.charimpl;

import java.math.BigDecimal;
import java.math.BigInteger;

import ng.runtime.metaclass.primitives.charimpl.CharBinaryLogicalOperation;
import ng.runtime.threadcontext.ExtendedThreadContext;
import ng.runtime.threadcontext.NotPerformed;

/**
 * @author John
 *
 */
public abstract class BaseBinaryLogicalOperation extends BaseBinaryOperation implements CharBinaryLogicalOperation {

  public Object doApply(final ExtendedThreadContext tc, final char lhs, final char rhs) {
    try {
      return tc.wrap(doIntApply(tc, lhs, rhs));
    } catch (final NotPerformed e) {
      return ExtendedThreadContext.NOT_PERFORMED;
    }
  }

  public Object doApply(final ExtendedThreadContext tc, final char lhs, final byte rhs) {
    try {
      return tc.wrap(doIntApply(tc, lhs, rhs));
    } catch (final NotPerformed e) {
      return ExtendedThreadContext.NOT_PERFORMED;
    }
  }

  public Object doApply(final ExtendedThreadContext tc, final char lhs, final short rhs) {
    try {
      return tc.wrap(doIntApply(tc, lhs, rhs));
    } catch (final NotPerformed e) {
      return ExtendedThreadContext.NOT_PERFORMED;
    }
  }

  public Object doApply(final ExtendedThreadContext tc, final char lhs, final int rhs) {
    try {
      return tc.wrap(doIntApply(tc, lhs, rhs));
    } catch (final NotPerformed e) {
      return ExtendedThreadContext.NOT_PERFORMED;
    }
  }

  public Object doApply(final ExtendedThreadContext tc, final char lhs, final long rhs) {
    try {
      return tc.wrap(doLongApply(tc, lhs, rhs));
    } catch (final NotPerformed e) {
      return ExtendedThreadContext.NOT_PERFORMED;
    }
  }

  public Object doApply(final ExtendedThreadContext tc, final char lhs, final float rhs) {
    return ExtendedThreadContext.NOT_PERFORMED;
  }

  public Object doApply(final ExtendedThreadContext tc, final char lhs, final double rhs) {
    return ExtendedThreadContext.NOT_PERFORMED;
  }

  public Object doApply(final ExtendedThreadContext tc, final char lhs, final BigInteger rhs) {
    try {
      return doBigIntegerApply(tc, lhs, rhs);
    } catch (final NotPerformed e) {
      return ExtendedThreadContext.NOT_PERFORMED;
    }
  }

  public Object doApply(final ExtendedThreadContext tc, final char lhs, final BigDecimal rhs) {
    return ExtendedThreadContext.NOT_PERFORMED;
  }
}
