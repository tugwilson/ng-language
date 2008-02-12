package uk.co.wilson.ng.runtime.metaclass;

import java.math.BigDecimal;
import java.math.BigInteger;

import ng.runtime.metaclass.StaticMethodProxy;
import ng.runtime.threadcontext.ExtendedThreadContext;

/**
 * @author John
 *
 */
public class BaseStaticMethodProxy implements StaticMethodProxy {
  protected volatile StaticMethodProxy modifiedProxy = null;

  public Object doApply(final ExtendedThreadContext tc, final Object[] params) {
    return ExtendedThreadContext.NOT_PERFORMED;
  }

  public Object doApplyQuick(final ExtendedThreadContext tc) {
    return ExtendedThreadContext.NOT_PERFORMED;
  }

  public Object doApplyQuick(final ExtendedThreadContext tc, final boolean p1) {
    return ExtendedThreadContext.NOT_PERFORMED;
  }

  public Object doApplyQuick(final ExtendedThreadContext tc, final byte p1) {
    return ExtendedThreadContext.NOT_PERFORMED;
  }

  public Object doApplyQuick(final ExtendedThreadContext tc, final char p1) {
    return ExtendedThreadContext.NOT_PERFORMED;
  }

  public Object doApplyQuick(final ExtendedThreadContext tc, final double p1) {
    return ExtendedThreadContext.NOT_PERFORMED;
  }

  public Object doApplyQuick(final ExtendedThreadContext tc, final float p1) {
    return ExtendedThreadContext.NOT_PERFORMED;
  }

  public Object doApplyQuick(final ExtendedThreadContext tc, final int p1) {
    return ExtendedThreadContext.NOT_PERFORMED;
  }

  public Object doApplyQuick(final ExtendedThreadContext tc, final long p1) {
    return ExtendedThreadContext.NOT_PERFORMED;
  }

  public Object doApplyQuick(final ExtendedThreadContext tc, final Object p1, final Object p2, final Object p3, final Object p4) {
    return ExtendedThreadContext.NOT_PERFORMED;
  }

  public Object doApplyQuick(final ExtendedThreadContext tc, final Object p1, final Object p2, final Object p3) {
    return ExtendedThreadContext.NOT_PERFORMED;
  }

  public Object doApplyQuick(final ExtendedThreadContext tc, final Object p1, final Object p2) {
    return ExtendedThreadContext.NOT_PERFORMED;
  }

  public Object doApplyQuick(final ExtendedThreadContext tc, final Object p1) {
    return ExtendedThreadContext.NOT_PERFORMED;
  }

  public Object doApplyQuick(final ExtendedThreadContext tc, final short p1) {
    return ExtendedThreadContext.NOT_PERFORMED;
  }
  public Object doApplyQuick(final ExtendedThreadContext tc, final String p1) {
    return ExtendedThreadContext.NOT_PERFORMED;
  }

  public Object doApplyQuick(final ExtendedThreadContext tc, final BigDecimal p1) {
    return ExtendedThreadContext.NOT_PERFORMED;
  }

  public Object doApplyQuick(final ExtendedThreadContext tc, final BigInteger p1) {
    return ExtendedThreadContext.NOT_PERFORMED;
  }
}
