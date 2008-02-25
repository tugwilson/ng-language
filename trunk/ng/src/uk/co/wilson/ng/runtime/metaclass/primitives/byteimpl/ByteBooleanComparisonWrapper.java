package uk.co.wilson.ng.runtime.metaclass.primitives.byteimpl;

import java.math.BigDecimal;
import java.math.BigInteger;

import ng.runtime.NgByte;
import ng.runtime.metaclass.BooleanBinaryComparison;
import ng.runtime.threadcontext.NotPerformed;
import uk.co.wilson.ng.runtime.metaclass.primitives.BooleanBinaryComparisonWrapper;
import uk.co.wilson.ng.runtime.threadcontext.ExtendedThreadContext;


/**
 * @author John
 *
 */
public class ByteBooleanComparisonWrapper extends BooleanBinaryComparisonWrapper implements ByteBooleanComparison {

  /**
   * @param delegate
   */
  public ByteBooleanComparisonWrapper(final BooleanBinaryComparison delegate) {
    super(delegate);
  }

  public boolean doApplyBoolean(final ExtendedThreadContext tc, final byte lhs, final char rhs) throws NotPerformed {
    return doApplyBoolean(tc, NgByte.valueOf(lhs), rhs);
  }

  public boolean doApplyBoolean(final ExtendedThreadContext tc, final byte lhs, final byte rhs) throws NotPerformed {
    return doApplyBoolean(tc, NgByte.valueOf(lhs), rhs);
  }

  public boolean doApplyBoolean(final ExtendedThreadContext tc, final byte lhs, final short rhs) throws NotPerformed {
    return doApplyBoolean(tc, NgByte.valueOf(lhs), rhs);
  }

  public boolean doApplyBoolean(final ExtendedThreadContext tc, final byte lhs, final int rhs) throws NotPerformed {
    return doApplyBoolean(tc, NgByte.valueOf(lhs), rhs);
  }

  public boolean doApplyBoolean(final ExtendedThreadContext tc, final byte lhs, final long rhs) throws NotPerformed {
    return doApplyBoolean(tc, NgByte.valueOf(lhs), rhs);
  }

  public boolean doApplyBoolean(final ExtendedThreadContext tc, final byte lhs, final float rhs) throws NotPerformed {
    return doApplyBoolean(tc, NgByte.valueOf(lhs), rhs);
  }

  public boolean doApplyBoolean(final ExtendedThreadContext tc, final byte lhs, final double rhs) throws NotPerformed {
    return doApplyBoolean(tc, NgByte.valueOf(lhs), rhs);
  }

  public boolean doApplyBoolean(final ExtendedThreadContext tc, final byte lhs, final BigInteger rhs) throws NotPerformed {
    return doApplyBoolean(tc, NgByte.valueOf(lhs), rhs);
  }

  public boolean doApplyBoolean(final ExtendedThreadContext tc, final byte lhs, final BigDecimal rhs) throws NotPerformed {
    return doApplyBoolean(tc, NgByte.valueOf(lhs), rhs);
  }

  public Object doApply(final ExtendedThreadContext tc, final byte lhs, final char rhs) {
    return doApply(tc, NgByte.valueOf(lhs), rhs);
  }

  public Object doApply(final ExtendedThreadContext tc, final byte lhs, final byte rhs) {
    return doApply(tc, NgByte.valueOf(lhs), rhs);
  }

  public Object doApply(final ExtendedThreadContext tc, final byte lhs, final short rhs) {
    return doApply(tc, NgByte.valueOf(lhs), rhs);
  }

  public Object doApply(final ExtendedThreadContext tc, final byte lhs, final int rhs) {
    return doApply(tc, NgByte.valueOf(lhs), rhs);
  }

  public Object doApply(final ExtendedThreadContext tc, final byte lhs, final long rhs) {
    return doApply(tc, NgByte.valueOf(lhs), rhs);
  }

  public Object doApply(final ExtendedThreadContext tc, final byte lhs, final float rhs) {
    return doApply(tc, NgByte.valueOf(lhs), rhs);
  }

  public Object doApply(final ExtendedThreadContext tc, final byte lhs, final double rhs) {
    return doApply(tc, NgByte.valueOf(lhs), rhs);
  }

  public Object doApply(final ExtendedThreadContext tc, final byte lhs, final BigInteger rhs) {
    return doApply(tc, NgByte.valueOf(lhs), rhs);
  }

  public Object doApply(final ExtendedThreadContext tc, final byte lhs, final BigDecimal rhs) {
    return doApply(tc, NgByte.valueOf(lhs), rhs);
  }
}
