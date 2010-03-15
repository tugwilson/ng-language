package uk.co.wilson.ng.runtime.metaclass.primitives.biginteger;

import java.math.BigDecimal;
import java.math.BigInteger;

import ng.runtime.metaclass.LogicalBinaryOperation;
import ng.runtime.metaclass.primitives.biginteger.BigIntegerBinaryLogicalOperation;
import ng.runtime.threadcontext.ExtendedThreadContext;
import ng.runtime.threadcontext.NotPerformed;
import uk.co.wilson.ng.runtime.metaclass.primitives.ArithmeticOperationWrapper;

/**
 * @author John
 * 
 */
public class BigIntegerBinaryLogicalOperationWrapper extends ArithmeticOperationWrapper implements BigIntegerBinaryLogicalOperation {

  /**
   * @param delegate
   */
  public BigIntegerBinaryLogicalOperationWrapper(final LogicalBinaryOperation delegate) {
    super(delegate);
  }

  public Object doApply(final ExtendedThreadContext tc, final BigInteger lhs, final BigDecimal rhs) {
    return doApply(tc, (Object) lhs, rhs);
  }

  public Object doApply(final ExtendedThreadContext tc, final BigInteger lhs, final BigInteger rhs) {
    return doApply(tc, (Object) lhs, rhs);
  }

  public Object doApply(final ExtendedThreadContext tc, final BigInteger lhs, final byte rhs) {
    return doApply(tc, (Object) lhs, rhs);
  }

  public Object doApply(final ExtendedThreadContext tc, final BigInteger lhs, final char rhs) {
    return doApply(tc, (Object) lhs, rhs);
  }

  public Object doApply(final ExtendedThreadContext tc, final BigInteger lhs, final double rhs) {
    return doApply(tc, (Object) lhs, rhs);
  }

  public Object doApply(final ExtendedThreadContext tc, final BigInteger lhs, final float rhs) {
    return doApply(tc, (Object) lhs, rhs);
  }

  public Object doApply(final ExtendedThreadContext tc, final BigInteger lhs, final int rhs) {
    return doApply(tc, (Object) lhs, rhs);
  }

  public Object doApply(final ExtendedThreadContext tc, final BigInteger lhs, final long rhs) {
    return doApply(tc, (Object) lhs, rhs);
  }

  public Object doApply(final ExtendedThreadContext tc, final BigInteger lhs, final short rhs) {
    return doApply(tc, (Object) lhs, rhs);
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

  public BigInteger doBigIntegerApply(final ExtendedThreadContext tc, final BigInteger lhs, final int rhs) throws NotPerformed {
    throw ExtendedThreadContext.NOT_PERFORMED_EXCEPTION;
  }

  public BigInteger doBigIntegerApply(final ExtendedThreadContext tc, final BigInteger lhs, final short rhs) throws NotPerformed {
    throw ExtendedThreadContext.NOT_PERFORMED_EXCEPTION;
  }

  public BigInteger doBigIntegerApply(final ExtendedThreadContext tc, final BigInteger lhs, final long rhs) throws NotPerformed {
    throw ExtendedThreadContext.NOT_PERFORMED_EXCEPTION;
  }
}
