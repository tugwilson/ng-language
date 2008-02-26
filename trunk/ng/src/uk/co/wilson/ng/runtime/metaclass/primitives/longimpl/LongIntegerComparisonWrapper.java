package uk.co.wilson.ng.runtime.metaclass.primitives.longimpl;

import java.math.BigDecimal;
import java.math.BigInteger;

import ng.runtime.NgLong;
import ng.runtime.metaclass.IntegerBinaryComparison;
import ng.runtime.metaclass.LongIntegerComparison;
import ng.runtime.threadcontext.NotPerformed;
import uk.co.wilson.ng.runtime.metaclass.primitives.IntegerBinaryComparisonWrapper;
import uk.co.wilson.ng.runtime.threadcontext.ExtendedThreadContext;

/**
 * @author John
 *
 */
public class LongIntegerComparisonWrapper extends IntegerBinaryComparisonWrapper implements LongIntegerComparison {

  /**
   * @param delegate
   */
  public LongIntegerComparisonWrapper(final IntegerBinaryComparison delegate) {
    super(delegate);
  }

  public int doIntApply(final ExtendedThreadContext tc, final long lhs, final char rhs) throws NotPerformed {
    return doIntApply(tc, NgLong.valueOf(lhs), rhs);
  }

  public int doIntApply(final ExtendedThreadContext tc, final long lhs, final byte rhs) throws NotPerformed {
    return doIntApply(tc, NgLong.valueOf(lhs), rhs);
  }

  public int doIntApply(final ExtendedThreadContext tc, final long lhs, final short rhs) throws NotPerformed {
    return doIntApply(tc, NgLong.valueOf(lhs), rhs);
  }

  public int doIntApply(final ExtendedThreadContext tc, final long lhs, final int rhs) throws NotPerformed {
    return doIntApply(tc, NgLong.valueOf(lhs), rhs);
  }

  public int doIntApply(final ExtendedThreadContext tc, final long lhs, final long rhs) throws NotPerformed {
    return doIntApply(tc, NgLong.valueOf(lhs), rhs);
  }

  public int doIntApply(final ExtendedThreadContext tc, final long lhs, final float rhs) throws NotPerformed {
    return doIntApply(tc, NgLong.valueOf(lhs), rhs);
  }

  public int doIntApply(final ExtendedThreadContext tc, final long lhs, final double rhs) throws NotPerformed {
    return doIntApply(tc, NgLong.valueOf(lhs), rhs);
  }

  public int doIntApply(final ExtendedThreadContext tc, final long lhs, final BigInteger rhs) throws NotPerformed {
    return doIntApply(tc, NgLong.valueOf(lhs), rhs);
  }

  public int doIntApply(final ExtendedThreadContext tc, final long lhs, final BigDecimal rhs) throws NotPerformed {
    return doIntApply(tc, NgLong.valueOf(lhs), rhs);
  }

  public Object doApply(final ExtendedThreadContext tc, final long lhs, final char rhs) {
    return doApply(tc, NgLong.valueOf(lhs), rhs);
  }

  public Object doApply(final ExtendedThreadContext tc, final long lhs, final byte rhs) {
    return doApply(tc, NgLong.valueOf(lhs), rhs);
  }

  public Object doApply(final ExtendedThreadContext tc, final long lhs, final short rhs) {
    return doApply(tc, NgLong.valueOf(lhs), rhs);
  }

  public Object doApply(final ExtendedThreadContext tc, final long lhs, final int rhs) {
    return doApply(tc, NgLong.valueOf(lhs), rhs);
  }

  public Object doApply(final ExtendedThreadContext tc, final long lhs, final long rhs) {
    return doApply(tc, NgLong.valueOf(lhs), rhs);
  }

  public Object doApply(final ExtendedThreadContext tc, final long lhs, final float rhs) {
    return doApply(tc, NgLong.valueOf(lhs), rhs);
  }

  public Object doApply(final ExtendedThreadContext tc, final long lhs, final double rhs) {
    return doApply(tc, NgLong.valueOf(lhs), rhs);
  }

  public Object doApply(final ExtendedThreadContext tc, final long lhs, final BigInteger rhs) {
    return doApply(tc, NgLong.valueOf(lhs), rhs);
  }

  public Object doApply(final ExtendedThreadContext tc, final long lhs, final BigDecimal rhs) {
    return doApply(tc, NgLong.valueOf(lhs), rhs);
  }
}
