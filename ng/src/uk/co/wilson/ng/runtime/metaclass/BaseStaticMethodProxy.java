package uk.co.wilson.ng.runtime.metaclass;

import java.math.BigDecimal;
import java.math.BigInteger;

import ng.runtime.metaclass.StaticMethodProxy;
import ng.runtime.threadcontext.ThreadContext;

/**
 * @author John
 *
 */
public class BaseStaticMethodProxy implements StaticMethodProxy {
  protected volatile StaticMethodProxy modifiedProxy = null;

  public Object doApply(final ThreadContext tc, final Object[] params) {
    return ThreadContext.NOT_PERFORMED;
  }

  public Object doApplyQuick(final ThreadContext tc) {
    return ThreadContext.NOT_PERFORMED;
  }

  public Object doApplyQuick(final ThreadContext tc, final boolean p1) {
    return ThreadContext.NOT_PERFORMED;
  }

  public Object doApplyQuick(final ThreadContext tc, final byte p1) {
    return ThreadContext.NOT_PERFORMED;
  }

  public Object doApplyQuick(final ThreadContext tc, final char p1) {
    return ThreadContext.NOT_PERFORMED;
  }

  public Object doApplyQuick(final ThreadContext tc, final double p1) {
    return ThreadContext.NOT_PERFORMED;
  }

  public Object doApplyQuick(final ThreadContext tc, final float p1) {
    return ThreadContext.NOT_PERFORMED;
  }

  public Object doApplyQuick(final ThreadContext tc, final int p1) {
    return ThreadContext.NOT_PERFORMED;
  }

  public Object doApplyQuick(final ThreadContext tc, final long p1) {
    return ThreadContext.NOT_PERFORMED;
  }

  public Object doApplyQuick(final ThreadContext tc, final Object p1, final Object p2, final Object p3, final Object p4) {
    return ThreadContext.NOT_PERFORMED;
  }

  public Object doApplyQuick(final ThreadContext tc, final Object p1, final Object p2, final Object p3) {
    return ThreadContext.NOT_PERFORMED;
  }

  public Object doApplyQuick(final ThreadContext tc, final Object p1, final Object p2) {
    return ThreadContext.NOT_PERFORMED;
  }

  public Object doApplyQuick(final ThreadContext tc, final Object p1) {
    return ThreadContext.NOT_PERFORMED;
  }

  public Object doApplyQuick(final ThreadContext tc, final short p1) {
    return ThreadContext.NOT_PERFORMED;
  }
  public Object doApplyQuick(final ThreadContext tc, final String p1) {
    return ThreadContext.NOT_PERFORMED;
  }

  public Object doApplyQuick(final ThreadContext tc, final BigDecimal p1) {
    return ThreadContext.NOT_PERFORMED;
  }

  public Object doApplyQuick(final ThreadContext tc, final BigInteger p1) {
    return ThreadContext.NOT_PERFORMED;
  }
}
