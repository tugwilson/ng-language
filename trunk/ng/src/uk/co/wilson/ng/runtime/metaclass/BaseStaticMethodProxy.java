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
  
  public Object doApply(ThreadContext tc, Object[] params) {
    return ThreadContext.NOT_PERFORMED;
  }

  public Object doApplyQuick(ThreadContext tc) {
    return ThreadContext.NOT_PERFORMED;
  }

  public Object doApplyQuick(ThreadContext tc, boolean p1) {
    return ThreadContext.NOT_PERFORMED;
  }

  public Object doApplyQuick(ThreadContext tc, byte p1) {
    return ThreadContext.NOT_PERFORMED;
  }

  public Object doApplyQuick(ThreadContext tc, char p1) {
    return ThreadContext.NOT_PERFORMED;
  }

  public Object doApplyQuick(ThreadContext tc, double p1) {
    return ThreadContext.NOT_PERFORMED;
  }

  public Object doApplyQuick(ThreadContext tc, float p1) {
    return ThreadContext.NOT_PERFORMED;
  }

  public Object doApplyQuick(ThreadContext tc, int p1) {
    return ThreadContext.NOT_PERFORMED;
  }

  public Object doApplyQuick(ThreadContext tc, long p1) {
    return ThreadContext.NOT_PERFORMED;
  }

  public Object doApplyQuick(ThreadContext tc, Object p1, Object p2, Object p3, Object p4) {
    return ThreadContext.NOT_PERFORMED;
  }

  public Object doApplyQuick(ThreadContext tc, Object p1, Object p2, Object p3) {
    return ThreadContext.NOT_PERFORMED;
  }

  public Object doApplyQuick(ThreadContext tc, Object p1, Object p2) {
    return ThreadContext.NOT_PERFORMED;
  }

  public Object doApplyQuick(ThreadContext tc, Object p1) {
    return ThreadContext.NOT_PERFORMED;
  }

  public Object doApplyQuick(ThreadContext tc, short p1) {
    return ThreadContext.NOT_PERFORMED;
  }
  public Object doApplyQuick(ThreadContext tc, String p1) {
    return ThreadContext.NOT_PERFORMED;
  }
  
  public Object doApplyQuick(ThreadContext tc, BigDecimal p1) {
    return ThreadContext.NOT_PERFORMED;
  }
  
  public Object doApplyQuick(ThreadContext tc, BigInteger p1) {
    return ThreadContext.NOT_PERFORMED;
  }
}
