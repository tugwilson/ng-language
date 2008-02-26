package uk.co.wilson.ng.runtime.metaclass.primitives.byteimpl;

import java.math.BigDecimal;
import java.math.BigInteger;

import ng.runtime.NgByte;
import ng.runtime.metaclass.ArithmeticBinaryOperation;
import ng.runtime.metaclass.ByteBinaryArithmeticOperation;
import ng.runtime.threadcontext.ExtendedThreadContext;
import ng.runtime.threadcontext.NotPerformed;
import uk.co.wilson.ng.runtime.metaclass.primitives.ArithmeticOperationWrapper;

/**
 * @author John
 *
 */
public class ByteBinaryArithmeticOperationWrapper extends ArithmeticOperationWrapper implements ByteBinaryArithmeticOperation {

  /**
   * @param delegate
   */
  public ByteBinaryArithmeticOperationWrapper(final ArithmeticBinaryOperation delegate) {
    super(delegate);
  }

  public Object doApply(final ExtendedThreadContext tc, final byte lhs, final BigDecimal rhs) {
    return doApply(tc, NgByte.valueOf(lhs), rhs);
  }

  public Object doApply(final ExtendedThreadContext tc, final byte lhs, final BigInteger rhs) {
    return doApply(tc, NgByte.valueOf(lhs), rhs);
  }

  public Object doApply(final ExtendedThreadContext tc, final byte lhs, final byte rhs) {
    return doApply(tc, NgByte.valueOf(lhs), rhs);
  }

  public Object doApply(final ExtendedThreadContext tc, final byte lhs, final char rhs) {
    return doApply(tc, NgByte.valueOf(lhs), rhs);
  }

  public Object doApply(final ExtendedThreadContext tc, final byte lhs, final double rhs) {
    return doApply(tc, NgByte.valueOf(lhs), rhs);
  }

  public Object doApply(final ExtendedThreadContext tc, final byte lhs, final float rhs) {
    return doApply(tc, NgByte.valueOf(lhs), rhs);
  }

  public Object doApply(final ExtendedThreadContext tc, final byte lhs, final int rhs) {
    return doApply(tc, NgByte.valueOf(lhs), rhs);
  }

  public Object doApply(final ExtendedThreadContext tc, final byte lhs, final long rhs) {
    return doApply(tc, NgByte.valueOf(lhs), rhs);
  }

  public Object doApply(final ExtendedThreadContext tc, final byte lhs, final short rhs) {
    return doApply(tc, NgByte.valueOf(lhs), rhs);
  }

  public BigDecimal doBigDecimalApply(final ExtendedThreadContext tc, final byte lhs, final BigDecimal rhs) throws NotPerformed {
    throw ExtendedThreadContext.NOT_PERFORMED_EXCEPTION;
  }

  public BigInteger doBigIntegerApply(final ExtendedThreadContext tc, final byte lhs, final BigInteger rhs) throws NotPerformed {
    throw ExtendedThreadContext.NOT_PERFORMED_EXCEPTION;
  }

  public int doIntApply(final ExtendedThreadContext tc, final byte lhs, final byte rhs) throws NotPerformed {
    throw ExtendedThreadContext.NOT_PERFORMED_EXCEPTION;
  }

  public int doIntApply(final ExtendedThreadContext tc, final byte lhs, final char rhs) throws NotPerformed {
    throw ExtendedThreadContext.NOT_PERFORMED_EXCEPTION;
  }

  public double doDoubleApply(final ExtendedThreadContext tc, final byte lhs, final double rhs) throws NotPerformed {
    throw ExtendedThreadContext.NOT_PERFORMED_EXCEPTION;
  }

  public float doFloatApply(final ExtendedThreadContext tc, final byte lhs, final float rhs) throws NotPerformed {
    throw ExtendedThreadContext.NOT_PERFORMED_EXCEPTION;
  }

  public int doIntApply(final ExtendedThreadContext tc, final byte lhs, final int rhs) throws NotPerformed {
    throw ExtendedThreadContext.NOT_PERFORMED_EXCEPTION;
  }

  public long doLongApply(final ExtendedThreadContext tc, final byte lhs, final long rhs) throws NotPerformed {
    throw ExtendedThreadContext.NOT_PERFORMED_EXCEPTION;
  }

  public int doIntApply(final ExtendedThreadContext tc, final byte lhs, final short rhs) throws NotPerformed {
    throw ExtendedThreadContext.NOT_PERFORMED_EXCEPTION;
  }
}
