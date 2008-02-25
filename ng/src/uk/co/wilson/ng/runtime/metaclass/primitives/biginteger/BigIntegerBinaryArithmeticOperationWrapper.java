package uk.co.wilson.ng.runtime.metaclass.primitives.biginteger;

import java.math.BigDecimal;
import java.math.BigInteger;

import ng.runtime.metaclass.ArithmeticBinaryOperation;
import ng.runtime.threadcontext.NotPerformed;
import uk.co.wilson.ng.runtime.metaclass.primitives.ArithmeticOperationWrapper;
import uk.co.wilson.ng.runtime.threadcontext.ExtendedThreadContext;

/**
 * @author John
 *
 */
public class BigIntegerBinaryArithmeticOperationWrapper extends ArithmeticOperationWrapper implements BigIntegerBinaryArithmeticOperation {

  /**
   * @param delegate
   */
  public BigIntegerBinaryArithmeticOperationWrapper(final ArithmeticBinaryOperation delegate) {
    super(delegate);
  }

  public Object doApply(final ExtendedThreadContext tc, final BigInteger lhs, final BigDecimal rhs) {
    return doApply(tc, (Object)lhs, rhs);
  }

  public Object doApply(final ExtendedThreadContext tc, final BigInteger lhs, final BigInteger rhs) {
    return doApply(tc, (Object)lhs, rhs);
  }

  public Object doApply(final ExtendedThreadContext tc, final BigInteger lhs, final byte rhs) {
    return doApply(tc, (Object)lhs, rhs);
  }

  public Object doApply(final ExtendedThreadContext tc, final BigInteger lhs, final char rhs) {
    return doApply(tc, (Object)lhs, rhs);
  }

  public Object doApply(final ExtendedThreadContext tc, final BigInteger lhs, final double rhs) {
    return doApply(tc, (Object)lhs, rhs);
  }

  public Object doApply(final ExtendedThreadContext tc, final BigInteger lhs, final float rhs) {
    return doApply(tc, (Object)lhs, rhs);
  }

  public Object doApply(final ExtendedThreadContext tc, final BigInteger lhs, final int rhs) {
    return doApply(tc, (Object)lhs, rhs);
  }

  public Object doApply(final ExtendedThreadContext tc, final BigInteger lhs, final long rhs) {
    return doApply(tc, (Object)lhs, rhs);
  }

  public Object doApply(final ExtendedThreadContext tc, final BigInteger lhs, final short rhs) {
    return doApply(tc, (Object)lhs, rhs);
  }

  public BigDecimal doBigDecimalApply(final ExtendedThreadContext tc, final BigInteger lhs, final BigDecimal rhs) throws NotPerformed {
    throw ExtendedThreadContext.NOT_PERFORMED_EXCEPTION;
  }

  public BigInteger doBigIntegerApply(final ExtendedThreadContext tc, final BigInteger lhs, final BigInteger rhs) throws NotPerformed {
    throw ExtendedThreadContext.NOT_PERFORMED_EXCEPTION;
  }

  public BigInteger doBigIntegerApply(final ExtendedThreadContext tc, final BigInteger lhs, final byte rhs) throws NotPerformed {
    throw ExtendedThreadContext.NOT_PERFORMED_EXCEPTION;
  }

  public BigInteger doBigIntegerApply(final ExtendedThreadContext tc, final BigInteger lhs, final char rhs) throws NotPerformed {
    throw ExtendedThreadContext.NOT_PERFORMED_EXCEPTION;
  }

  public double doDoubleApply(final ExtendedThreadContext tc, final BigInteger lhs, final double rhs) throws NotPerformed {
    throw ExtendedThreadContext.NOT_PERFORMED_EXCEPTION;
  }

  public float doFloatApply(final ExtendedThreadContext tc, final BigInteger lhs, final float rhs) throws NotPerformed {
    throw ExtendedThreadContext.NOT_PERFORMED_EXCEPTION;
  }

  public BigInteger doBigIntegerApply(final ExtendedThreadContext tc, final BigInteger lhs, final int rhs) throws NotPerformed {
    throw ExtendedThreadContext.NOT_PERFORMED_EXCEPTION;
  }

  public BigInteger doBigIntegerApply(final ExtendedThreadContext tc, final BigInteger lhs, final long rhs) throws NotPerformed {
    throw ExtendedThreadContext.NOT_PERFORMED_EXCEPTION;
  }

  public BigInteger doBigIntegerApply(final ExtendedThreadContext tc, final BigInteger lhs, final short rhs) throws NotPerformed {
    throw ExtendedThreadContext.NOT_PERFORMED_EXCEPTION;
  }
}
