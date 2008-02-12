package uk.co.wilson.ng.runtime.metaclass.primitives.charimpl;

import java.math.BigDecimal;
import java.math.BigInteger;

import ng.runtime.NgChar;
import ng.runtime.metaclass.ArithmeticBinaryOperation;
import ng.runtime.threadcontext.NotPerformed;
import ng.runtime.threadcontext.ExtendedThreadContext;
import uk.co.wilson.ng.runtime.metaclass.primitives.ArithmeticOperationWrapper;

/**
 * @author John
 *
 */
public class CharBinaryArithmeticOperationWrapper extends ArithmeticOperationWrapper implements CharBinaryArithmeticOperation {

  /**
   * @param delegate
   */
  public CharBinaryArithmeticOperationWrapper(final ArithmeticBinaryOperation delegate) {
    super(delegate);
  }

  public Object doApply(final ExtendedThreadContext tc, final char lhs, final BigDecimal rhs) {
    return doApply(tc, NgChar.valueOf(lhs), rhs);
  }

  public Object doApply(final ExtendedThreadContext tc, final char lhs, final BigInteger rhs) {
    return doApply(tc, NgChar.valueOf(lhs), rhs);
  }

  public Object doApply(final ExtendedThreadContext tc, final char lhs, final byte rhs) {
    return doApply(tc, NgChar.valueOf(lhs), rhs);
  }

  public Object doApply(final ExtendedThreadContext tc, final char lhs, final char rhs) {
    return doApply(tc, NgChar.valueOf(lhs), rhs);
  }

  public Object doApply(final ExtendedThreadContext tc, final char lhs, final double rhs) {
    return doApply(tc, NgChar.valueOf(lhs), rhs);
  }

  public Object doApply(final ExtendedThreadContext tc, final char lhs, final float rhs) {
    return doApply(tc, NgChar.valueOf(lhs), rhs);
  }

  public Object doApply(final ExtendedThreadContext tc, final char lhs, final int rhs) {
    return doApply(tc, NgChar.valueOf(lhs), rhs);
  }

  public Object doApply(final ExtendedThreadContext tc, final char lhs, final long rhs) {
    return doApply(tc, NgChar.valueOf(lhs), rhs);
  }

  public Object doApply(final ExtendedThreadContext tc, final char lhs, final short rhs) {
    return doApply(tc, NgChar.valueOf(lhs), rhs);
  }

  public BigDecimal doBigDecimalApply(final ExtendedThreadContext tc, final char lhs, final BigDecimal rhs) throws NotPerformed {
    throw ExtendedThreadContext.NOT_PERFORMED_EXCEPTION;
  }

  public BigInteger doBigIntegerApply(final ExtendedThreadContext tc, final char lhs, final BigInteger rhs) throws NotPerformed {
    throw ExtendedThreadContext.NOT_PERFORMED_EXCEPTION;
  }

  public int doIntApply(final ExtendedThreadContext tc, final char lhs, final byte rhs) throws NotPerformed {
    throw ExtendedThreadContext.NOT_PERFORMED_EXCEPTION;
  }

  public int doIntApply(final ExtendedThreadContext tc, final char lhs, final char rhs) throws NotPerformed {
    throw ExtendedThreadContext.NOT_PERFORMED_EXCEPTION;
  }

  public double doDoubleApply(final ExtendedThreadContext tc, final char lhs, final double rhs) throws NotPerformed {
    throw ExtendedThreadContext.NOT_PERFORMED_EXCEPTION;
  }

  public float doFloatApply(final ExtendedThreadContext tc, final char lhs, final float rhs) throws NotPerformed {
    throw ExtendedThreadContext.NOT_PERFORMED_EXCEPTION;
  }

  public int doIntApply(final ExtendedThreadContext tc, final char lhs, final int rhs) throws NotPerformed {
    throw ExtendedThreadContext.NOT_PERFORMED_EXCEPTION;
  }

  public long doLongApply(final ExtendedThreadContext tc, final char lhs, final long rhs) throws NotPerformed {
    throw ExtendedThreadContext.NOT_PERFORMED_EXCEPTION;
  }

  public int doIntApply(final ExtendedThreadContext tc, final char lhs, final short rhs) throws NotPerformed {
    throw ExtendedThreadContext.NOT_PERFORMED_EXCEPTION;
  }
}
