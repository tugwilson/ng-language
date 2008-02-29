package uk.co.wilson.ng.runtime.metaclass.primitives.intimpl;

import java.math.BigDecimal;
import java.math.BigInteger;

import ng.runtime.NgInt;
import ng.runtime.metaclass.primitives.intimpl.IntBinaryComparison;
import ng.runtime.metaclass.primitives.intimpl.IntIntegerComparison;
import ng.runtime.threadcontext.ExtendedThreadContext;
import ng.runtime.threadcontext.NotPerformed;
import uk.co.wilson.ng.runtime.metaclass.primitives.IntegerBinaryComparisonWrapper;

/**
 * @author John
 *
 */
public class IntIntegerComparisonWrapper extends IntegerBinaryComparisonWrapper implements IntIntegerComparison {

  /**
   * @param delegate
   */
  public IntIntegerComparisonWrapper(final IntBinaryComparison delegate) {
    super(delegate);
  }

  public int doIntApply(final ExtendedThreadContext tc, final int lhs, final char rhs) throws NotPerformed {
    return doIntApply(tc, NgInt.valueOf(lhs), rhs);
  }

  public int doIntApply(final ExtendedThreadContext tc, final int lhs, final byte rhs) throws NotPerformed {
    return doIntApply(tc, NgInt.valueOf(lhs), rhs);
  }

  public int doIntApply(final ExtendedThreadContext tc, final int lhs, final short rhs) throws NotPerformed {
    return doIntApply(tc, NgInt.valueOf(lhs), rhs);
  }

  public int doIntApply(final ExtendedThreadContext tc, final int lhs, final int rhs) throws NotPerformed {
    return doIntApply(tc, NgInt.valueOf(lhs), rhs);
  }

  public int doIntApply(final ExtendedThreadContext tc, final int lhs, final long rhs) throws NotPerformed {
    return doIntApply(tc, NgInt.valueOf(lhs), rhs);
  }

  public int doIntApply(final ExtendedThreadContext tc, final int lhs, final float rhs) throws NotPerformed {
    return doIntApply(tc, NgInt.valueOf(lhs), rhs);
  }

  public int doIntApply(final ExtendedThreadContext tc, final int lhs, final double rhs) throws NotPerformed {
    return doIntApply(tc, NgInt.valueOf(lhs), rhs);
  }

  public int doIntApply(final ExtendedThreadContext tc, final int lhs, final BigInteger rhs) throws NotPerformed {
    return doIntApply(tc, NgInt.valueOf(lhs), rhs);
  }

  public int doIntApply(final ExtendedThreadContext tc, final int lhs, final BigDecimal rhs) throws NotPerformed {
    return doIntApply(tc, NgInt.valueOf(lhs), rhs);
  }

  public Object doApply(final ExtendedThreadContext tc, final int lhs, final char rhs) {
    return doApply(tc, NgInt.valueOf(lhs), rhs);
  }

  public Object doApply(final ExtendedThreadContext tc, final int lhs, final byte rhs) {
    return doApply(tc, NgInt.valueOf(lhs), rhs);
  }

  public Object doApply(final ExtendedThreadContext tc, final int lhs, final short rhs) {
    return doApply(tc, NgInt.valueOf(lhs), rhs);
  }

  public Object doApply(final ExtendedThreadContext tc, final int lhs, final int rhs) {
    return doApply(tc, NgInt.valueOf(lhs), rhs);
  }

  public Object doApply(final ExtendedThreadContext tc, final int lhs, final long rhs) {
    return doApply(tc, NgInt.valueOf(lhs), rhs);
  }

  public Object doApply(final ExtendedThreadContext tc, final int lhs, final float rhs) {
    return doApply(tc, NgInt.valueOf(lhs), rhs);
  }

  public Object doApply(final ExtendedThreadContext tc, final int lhs, final double rhs) {
    return doApply(tc, NgInt.valueOf(lhs), rhs);
  }

  public Object doApply(final ExtendedThreadContext tc, final int lhs, final BigInteger rhs) {
    return doApply(tc, NgInt.valueOf(lhs), rhs);
  }

  public Object doApply(final ExtendedThreadContext tc, final int lhs, final BigDecimal rhs) {
    return doApply(tc, NgInt.valueOf(lhs), rhs);
  }
}
