package uk.co.wilson.ng.runtime.metaclass.primitives.shortimpl;

import java.math.BigDecimal;
import java.math.BigInteger;

import ng.runtime.NgShort;
import ng.runtime.metaclass.BooleanBinaryComparison;
import ng.runtime.metaclass.primitives.shortimpl.ShortBooleanComparison;
import ng.runtime.threadcontext.ExtendedThreadContext;
import ng.runtime.threadcontext.NotPerformed;
import uk.co.wilson.ng.runtime.metaclass.primitives.BooleanBinaryComparisonWrapper;

/**
 * @author John
 *
 */
public class ShortBooleanComparisonWrapper extends BooleanBinaryComparisonWrapper implements ShortBooleanComparison {

  /**
   * @param delegate
   */
  public ShortBooleanComparisonWrapper(final BooleanBinaryComparison delegate) {
    super(delegate);
  }

  public boolean doApplyBoolean(final ExtendedThreadContext tc, final short lhs, final char rhs) throws NotPerformed {
    return doApplyBoolean(tc, NgShort.valueOf(lhs), rhs);
  }

  public boolean doApplyBoolean(final ExtendedThreadContext tc, final short lhs, final byte rhs) throws NotPerformed {
    return doApplyBoolean(tc, NgShort.valueOf(lhs), rhs);
  }

  public boolean doApplyBoolean(final ExtendedThreadContext tc, final short lhs, final short rhs) throws NotPerformed {
    return doApplyBoolean(tc, NgShort.valueOf(lhs), rhs);
  }

  public boolean doApplyBoolean(final ExtendedThreadContext tc, final short lhs, final int rhs) throws NotPerformed {
    return doApplyBoolean(tc, NgShort.valueOf(lhs), rhs);
  }

  public boolean doApplyBoolean(final ExtendedThreadContext tc, final short lhs, final long rhs) throws NotPerformed {
    return doApplyBoolean(tc, NgShort.valueOf(lhs), rhs);
  }

  public boolean doApplyBoolean(final ExtendedThreadContext tc, final short lhs, final float rhs) throws NotPerformed {
    return doApplyBoolean(tc, NgShort.valueOf(lhs), rhs);
  }

  public boolean doApplyBoolean(final ExtendedThreadContext tc, final short lhs, final double rhs) throws NotPerformed {
    return doApplyBoolean(tc, NgShort.valueOf(lhs), rhs);
  }

  public boolean doApplyBoolean(final ExtendedThreadContext tc, final short lhs, final BigInteger rhs) throws NotPerformed {
    return doApplyBoolean(tc, NgShort.valueOf(lhs), rhs);
  }

  public boolean doApplyBoolean(final ExtendedThreadContext tc, final short lhs, final BigDecimal rhs) throws NotPerformed {
    return doApplyBoolean(tc, NgShort.valueOf(lhs), rhs);
  }

  public Object doApply(final ExtendedThreadContext tc, final short lhs, final char rhs) {
    return doApply(tc, NgShort.valueOf(lhs), rhs);
  }

  public Object doApply(final ExtendedThreadContext tc, final short lhs, final byte rhs) {
    return doApply(tc, NgShort.valueOf(lhs), rhs);
  }

  public Object doApply(final ExtendedThreadContext tc, final short lhs, final short rhs) {
    return doApply(tc, NgShort.valueOf(lhs), rhs);
  }

  public Object doApply(final ExtendedThreadContext tc, final short lhs, final int rhs) {
    return doApply(tc, NgShort.valueOf(lhs), rhs);
  }

  public Object doApply(final ExtendedThreadContext tc, final short lhs, final long rhs) {
    return doApply(tc, NgShort.valueOf(lhs), rhs);
  }

  public Object doApply(final ExtendedThreadContext tc, final short lhs, final float rhs) {
    return doApply(tc, NgShort.valueOf(lhs), rhs);
  }

  public Object doApply(final ExtendedThreadContext tc, final short lhs, final double rhs) {
    return doApply(tc, NgShort.valueOf(lhs), rhs);
  }

  public Object doApply(final ExtendedThreadContext tc, final short lhs, final BigInteger rhs) {
    return doApply(tc, NgShort.valueOf(lhs), rhs);
  }

  public Object doApply(final ExtendedThreadContext tc, final short lhs, final BigDecimal rhs) {
    return doApply(tc, NgShort.valueOf(lhs), rhs);
  }
}
