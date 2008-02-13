package uk.co.wilson.ng.runtime.metaclass.primitives.shortimpl;

import java.math.BigDecimal;
import java.math.BigInteger;

import ng.runtime.NgShort;
import ng.runtime.metaclass.ArithmeticBinaryOperation;
import ng.runtime.threadcontext.ExtendedThreadContext;
import ng.runtime.threadcontext.NotPerformed;
import uk.co.wilson.ng.runtime.metaclass.primitives.ArithmeticOperationWrapper;

/**
 * @author John
 *
 */
public class ShortBinaryArithmeticOperationWrapper extends ArithmeticOperationWrapper implements ShortBinaryArithmeticOperation {

  /**
   * @param delegate
   */
  public ShortBinaryArithmeticOperationWrapper(final ArithmeticBinaryOperation delegate) {
    super(delegate);
  }

  public Object doApply(final ExtendedThreadContext tc, final short lhs, final BigDecimal rhs) {
    return doApply(tc, NgShort.valueOf(lhs), rhs);
  }

  public Object doApply(final ExtendedThreadContext tc, final short lhs, final BigInteger rhs) {
    return doApply(tc, NgShort.valueOf(lhs), rhs);
  }

  public Object doApply(final ExtendedThreadContext tc, final short lhs, final byte rhs) {
    return doApply(tc, NgShort.valueOf(lhs), rhs);
  }

  public Object doApply(final ExtendedThreadContext tc, final short lhs, final char rhs) {
    return doApply(tc, NgShort.valueOf(lhs), rhs);
  }

  public Object doApply(final ExtendedThreadContext tc, final short lhs, final double rhs) {
    return doApply(tc, NgShort.valueOf(lhs), rhs);
  }

  public Object doApply(final ExtendedThreadContext tc, final short lhs, final float rhs) {
    return doApply(tc, NgShort.valueOf(lhs), rhs);
  }

  public Object doApply(final ExtendedThreadContext tc, final short lhs, final int rhs) {
    return doApply(tc, NgShort.valueOf(lhs), rhs);
  }

  public Object doApply(final ExtendedThreadContext tc, final short lhs, final long rhs) {
    return doApply(tc, NgShort.valueOf(lhs), rhs);
  }

  public Object doApply(final ExtendedThreadContext tc, final short lhs, final short rhs) {
    return doApply(tc, NgShort.valueOf(lhs), rhs);
  }

  public BigDecimal doBigDecimalApply(final ExtendedThreadContext tc, final short lhs, final BigDecimal rhs) throws NotPerformed {
    throw ExtendedThreadContext.NOT_PERFORMED_EXCEPTION;
  }

  public BigInteger doBigIntegerApply(final ExtendedThreadContext tc, final short lhs, final BigInteger rhs) throws NotPerformed {
    throw ExtendedThreadContext.NOT_PERFORMED_EXCEPTION;
  }

  public int doIntApply(final ExtendedThreadContext tc, final short lhs, final byte rhs) throws NotPerformed {
    throw ExtendedThreadContext.NOT_PERFORMED_EXCEPTION;
  }

  public int doIntApply(final ExtendedThreadContext tc, final short lhs, final char rhs) throws NotPerformed {
    throw ExtendedThreadContext.NOT_PERFORMED_EXCEPTION;
  }

  public double doDoubleApply(final ExtendedThreadContext tc, final short lhs, final double rhs) throws NotPerformed {
    throw ExtendedThreadContext.NOT_PERFORMED_EXCEPTION;
  }

  public float doFloatApply(final ExtendedThreadContext tc, final short lhs, final float rhs) throws NotPerformed {
    throw ExtendedThreadContext.NOT_PERFORMED_EXCEPTION;
  }

  public int doIntApply(final ExtendedThreadContext tc, final short lhs, final int rhs) throws NotPerformed {
    throw ExtendedThreadContext.NOT_PERFORMED_EXCEPTION;
  }

  public long doLongApply(final ExtendedThreadContext tc, final short lhs, final long rhs) throws NotPerformed {
    throw ExtendedThreadContext.NOT_PERFORMED_EXCEPTION;
  }

  public int doIntApply(final ExtendedThreadContext tc, final short lhs, final short rhs) throws NotPerformed {
    throw ExtendedThreadContext.NOT_PERFORMED_EXCEPTION;
  }
}
