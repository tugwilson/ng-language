package uk.co.wilson.ng.runtime.metaclass.primitives.byteimpl;

import java.math.BigDecimal;
import java.math.BigInteger;

import ng.runtime.metaclass.primitives.byteimpl.ByteIntegerComparison;
import ng.runtime.metaclass.primitives.intimpl.IntBinaryComparison;
import ng.runtime.threadcontext.ExtendedThreadContext;
import ng.runtime.threadcontext.NotPerformed;
import uk.co.wilson.ng.runtime.metaclass.primitives.IntegerBinaryComparisonWrapper;

/**
 * @author John
 * 
 */
public class ByteIntegerComparisonWrapper extends IntegerBinaryComparisonWrapper implements ByteIntegerComparison {

  /**
   * @param delegate
   */
  public ByteIntegerComparisonWrapper(final IntBinaryComparison delegate) {
    super(delegate);
  }

  public int doIntApply(final ExtendedThreadContext tc, final byte lhs, final char rhs) throws NotPerformed {
    return doIntApply(tc, tc.wrap(lhs), rhs);
  }

  public int doIntApply(final ExtendedThreadContext tc, final byte lhs, final byte rhs) throws NotPerformed {
    return doIntApply(tc, tc.wrap(lhs), rhs);
  }

  public int doIntApply(final ExtendedThreadContext tc, final byte lhs, final short rhs) throws NotPerformed {
    return doIntApply(tc, tc.wrap(lhs), rhs);
  }

  public int doIntApply(final ExtendedThreadContext tc, final byte lhs, final int rhs) throws NotPerformed {
    return doIntApply(tc, tc.wrap(lhs), rhs);
  }

  public int doIntApply(final ExtendedThreadContext tc, final byte lhs, final long rhs) throws NotPerformed {
    return doIntApply(tc, tc.wrap(lhs), rhs);
  }

  public int doIntApply(final ExtendedThreadContext tc, final byte lhs, final float rhs) throws NotPerformed {
    return doIntApply(tc, tc.wrap(lhs), rhs);
  }

  public int doIntApply(final ExtendedThreadContext tc, final byte lhs, final double rhs) throws NotPerformed {
    return doIntApply(tc, tc.wrap(lhs), rhs);
  }

  public int doIntApply(final ExtendedThreadContext tc, final byte lhs, final BigInteger rhs) throws NotPerformed {
    return doIntApply(tc, tc.wrap(lhs), rhs);
  }

  public int doIntApply(final ExtendedThreadContext tc, final byte lhs, final BigDecimal rhs) throws NotPerformed {
    return doIntApply(tc, tc.wrap(lhs), rhs);
  }

  public Object doApply(final ExtendedThreadContext tc, final byte lhs, final char rhs) {
    return doApply(tc, tc.wrap(lhs), rhs);
  }

  public Object doApply(final ExtendedThreadContext tc, final byte lhs, final byte rhs) {
    return doApply(tc, tc.wrap(lhs), rhs);
  }

  public Object doApply(final ExtendedThreadContext tc, final byte lhs, final short rhs) {
    return doApply(tc, tc.wrap(lhs), rhs);
  }

  public Object doApply(final ExtendedThreadContext tc, final byte lhs, final int rhs) {
    return doApply(tc, tc.wrap(lhs), rhs);
  }

  public Object doApply(final ExtendedThreadContext tc, final byte lhs, final long rhs) {
    return doApply(tc, tc.wrap(lhs), rhs);
  }

  public Object doApply(final ExtendedThreadContext tc, final byte lhs, final float rhs) {
    return doApply(tc, tc.wrap(lhs), rhs);
  }

  public Object doApply(final ExtendedThreadContext tc, final byte lhs, final double rhs) {
    return doApply(tc, tc.wrap(lhs), rhs);
  }

  public Object doApply(final ExtendedThreadContext tc, final byte lhs, final BigInteger rhs) {
    return doApply(tc, tc.wrap(lhs), rhs);
  }

  public Object doApply(final ExtendedThreadContext tc, final byte lhs, final BigDecimal rhs) {
    return doApply(tc, tc.wrap(lhs), rhs);
  }
}
