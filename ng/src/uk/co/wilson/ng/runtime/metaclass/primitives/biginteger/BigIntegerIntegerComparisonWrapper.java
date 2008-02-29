package uk.co.wilson.ng.runtime.metaclass.primitives.biginteger;

import java.math.BigDecimal;
import java.math.BigInteger;

import ng.runtime.metaclass.BigIntegerIntegerComparison;
import ng.runtime.metaclass.IntBinaryComparison;
import ng.runtime.threadcontext.ExtendedThreadContext;
import ng.runtime.threadcontext.NotPerformed;
import uk.co.wilson.ng.runtime.metaclass.primitives.IntegerBinaryComparisonWrapper;

/**
 * @author John
 *
 */
public class BigIntegerIntegerComparisonWrapper extends IntegerBinaryComparisonWrapper implements BigIntegerIntegerComparison {

  /**
   * @param delegate
   */
  public BigIntegerIntegerComparisonWrapper(final IntBinaryComparison delegate) {
    super(delegate);
  }

  public int doIntApply(final ExtendedThreadContext tc, final BigInteger lhs, final char rhs) throws NotPerformed {
    return doIntApply(tc, (Object)lhs, rhs);
  }

  public int doIntApply(final ExtendedThreadContext tc, final BigInteger lhs, final byte rhs) throws NotPerformed {
    return doIntApply(tc, (Object)lhs, rhs);
  }

  public int doIntApply(final ExtendedThreadContext tc, final BigInteger lhs, final short rhs) throws NotPerformed {
    return doIntApply(tc, (Object)lhs, rhs);
  }

  public int doIntApply(final ExtendedThreadContext tc, final BigInteger lhs, final int rhs) throws NotPerformed {
    return doIntApply(tc, (Object)lhs, rhs);
  }

  public int doIntApply(final ExtendedThreadContext tc, final BigInteger lhs, final long rhs) throws NotPerformed {
    return doIntApply(tc, (Object)lhs, rhs);
  }

  public int doIntApply(final ExtendedThreadContext tc, final BigInteger lhs, final float rhs) throws NotPerformed {
    return doIntApply(tc, (Object)lhs, rhs);
  }

  public int doIntApply(final ExtendedThreadContext tc, final BigInteger lhs, final double rhs) throws NotPerformed {
    return doIntApply(tc, (Object)lhs, rhs);
  }

  public int doIntApply(final ExtendedThreadContext tc, final BigInteger lhs, final BigInteger rhs) throws NotPerformed {
    return doIntApply(tc, (Object)lhs, rhs);
  }

  public int doIntApply(final ExtendedThreadContext tc, final BigInteger lhs, final BigDecimal rhs) throws NotPerformed {
    return doIntApply(tc, (Object)lhs, rhs);
  }

  public Object doApply(final ExtendedThreadContext tc, final BigInteger lhs, final char rhs) {
    return doApply(tc, (Object)lhs, rhs);
  }

  public Object doApply(final ExtendedThreadContext tc, final BigInteger lhs, final byte rhs) {
    return doApply(tc, (Object)lhs, rhs);
  }

  public Object doApply(final ExtendedThreadContext tc, final BigInteger lhs, final short rhs) {
    return doApply(tc, (Object)lhs, rhs);
  }

  public Object doApply(final ExtendedThreadContext tc, final BigInteger lhs, final int rhs) {
    return doApply(tc, (Object)lhs, rhs);
  }

  public Object doApply(final ExtendedThreadContext tc, final BigInteger lhs, final long rhs) {
    return doApply(tc, (Object)lhs, rhs);
  }

  public Object doApply(final ExtendedThreadContext tc, final BigInteger lhs, final float rhs) {
    return doApply(tc, (Object)lhs, rhs);
  }

  public Object doApply(final ExtendedThreadContext tc, final BigInteger lhs, final double rhs) {
    return doApply(tc, (Object)lhs, rhs);
  }

  public Object doApply(final ExtendedThreadContext tc, final BigInteger lhs, final BigInteger rhs) {
    return doApply(tc, (Object)lhs, rhs);
  }

  public Object doApply(final ExtendedThreadContext tc, final BigInteger lhs, final BigDecimal rhs) {
    return doApply(tc, (Object)lhs, rhs);
  }
}
