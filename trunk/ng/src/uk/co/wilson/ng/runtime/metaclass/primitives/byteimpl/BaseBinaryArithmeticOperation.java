package uk.co.wilson.ng.runtime.metaclass.primitives.byteimpl;

import java.math.BigDecimal;
import java.math.BigInteger;

import ng.runtime.metaclass.ByteBinaryArithmeticOperation;
import ng.runtime.threadcontext.ExtendedThreadContext;
import ng.runtime.threadcontext.NotPerformed;



/**
 * @author John
 *
 */
public abstract class BaseBinaryArithmeticOperation extends BaseBinaryOperation implements ByteBinaryArithmeticOperation {

  public Object doApply(final ExtendedThreadContext tc, final byte lhs, final char rhs) {
    try {
      return tc.wrap(doIntApply(tc, lhs, rhs));
    } catch (final NotPerformed e) {
      return ExtendedThreadContext.NOT_PERFORMED;
    }
  }

  public Object doApply(final ExtendedThreadContext tc, final byte lhs, final byte rhs) {
    try {
      return tc.wrap(doIntApply(tc, lhs, rhs));
    } catch (final NotPerformed e) {
      return ExtendedThreadContext.NOT_PERFORMED;
    }
  }

  public Object doApply(final ExtendedThreadContext tc, final byte lhs, final short rhs) {
    try {
      return tc.wrap(doIntApply(tc, lhs, rhs));
    } catch (final NotPerformed e) {
      return ExtendedThreadContext.NOT_PERFORMED;
    }
  }

  public Object doApply(final ExtendedThreadContext tc, final byte lhs, final int rhs) {
    try {
      return tc.wrap(doIntApply(tc, lhs, rhs));
    } catch (final NotPerformed e) {
      return ExtendedThreadContext.NOT_PERFORMED;
    }
  }

  public Object doApply(final ExtendedThreadContext tc, final byte lhs, final long rhs) {
    try {
      return tc.wrap(doLongApply(tc, lhs, rhs));
    } catch (final NotPerformed e) {
      return ExtendedThreadContext.NOT_PERFORMED;
    }
  }

  public Object doApply(final ExtendedThreadContext tc, final byte lhs, final float rhs) {
    try {
      return tc.wrap(doFloatApply(tc, lhs, rhs));
    } catch (final NotPerformed e) {
      return ExtendedThreadContext.NOT_PERFORMED;
    }
  }

  public Object doApply(final ExtendedThreadContext tc, final byte lhs, final double rhs) {
    try {
      return tc.wrap(doDoubleApply(tc, lhs, rhs));
    } catch (final NotPerformed e) {
      return ExtendedThreadContext.NOT_PERFORMED;
    }
  }

  public Object doApply(final ExtendedThreadContext tc, final byte lhs, final BigInteger rhs) {
    try {
      return doBigIntegerApply(tc, lhs, rhs);
    } catch (final NotPerformed e) {
      return ExtendedThreadContext.NOT_PERFORMED;
    }
  }

  public Object doApply(final ExtendedThreadContext tc, final byte lhs, final BigDecimal rhs) {
    try {
      return doBigDecimalApply(tc, lhs, rhs);
    } catch (final NotPerformed e) {
      return ExtendedThreadContext.NOT_PERFORMED;
    }
  }
}
