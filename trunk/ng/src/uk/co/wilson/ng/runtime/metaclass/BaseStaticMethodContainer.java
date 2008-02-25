package uk.co.wilson.ng.runtime.metaclass;

import java.math.BigDecimal;
import java.math.BigInteger;

import ng.runtime.metaclass.MetaClass;
import ng.runtime.threadcontext.StaticCallable;
import uk.co.wilson.ng.runtime.threadcontext.ExtendedThreadContext;

/**
 * @author John
 *
 */
public class BaseStaticMethodContainer implements StaticMethodContainer, StaticCallable {
  protected volatile StaticCallable modifiedCallable = null;

  public StaticCallable getCallable(ExtendedThreadContext tc, Object[] params, MetaClass[] metaClasses) {
    return this;
  }

  public StaticCallable getCallable(ExtendedThreadContext tc, boolean p1) {
    return this;
  }

  public StaticCallable getCallable(ExtendedThreadContext tc, char p1) {
    return this;
  }

  public StaticCallable getCallable(ExtendedThreadContext tc, byte p1) {
    return this;
  }

  public StaticCallable getCallable(ExtendedThreadContext tc, short p1) {
    return this;
  }

  public StaticCallable getCallable(ExtendedThreadContext tc, int p1) {
    return this;
  }

  public StaticCallable getCallable(ExtendedThreadContext tc, long p1) {
    return this;
  }

  public StaticCallable getCallable(ExtendedThreadContext tc, float p1) {
    return this;
  }

  public StaticCallable getCallable(ExtendedThreadContext tc, double p1) {
    return this;
  }

  public StaticCallable getCallable(ExtendedThreadContext tc, BigInteger p1) {
    return this;
  }

  public StaticCallable getCallable(ExtendedThreadContext tc, BigDecimal p1) {
    return this;
  }

  public StaticCallable getCallable(ExtendedThreadContext tc, String p1) {
    return this;
  }

  public StaticCallable getCallable(ExtendedThreadContext tc) {
    return this;
  }

  public StaticCallable getCallable(ExtendedThreadContext tc, Object p1, MetaClass m1) {
    return this;
  }

  public StaticCallable getCallable(ExtendedThreadContext tc, Object p1, MetaClass m1, Object p2, MetaClass m2) {
    return this;
  }

  public StaticCallable getCallable(ExtendedThreadContext tc, Object p1, MetaClass m1, Object p2, MetaClass m2, Object p3, MetaClass m3) {
    return this;
  }

  public StaticCallable getCallable(ExtendedThreadContext tc, Object p1, MetaClass m1, Object p, MetaClass m2, Object p3, MetaClass m3, Object p4, MetaClass m4) {
    return this;
  }

  public boolean isStillValid(MetaClass metaclass) {
    return false;
  }

  public Object doStaticCall(ExtendedThreadContext tc, Object[] params) throws Throwable {
    return ExtendedThreadContext.NOT_PERFORMED;
  }

  public Object doStaticCallQuick(ExtendedThreadContext tc) throws Throwable {
    return ExtendedThreadContext.NOT_PERFORMED;
  }

  public Object doStaticCallQuick(ExtendedThreadContext tc, boolean p1) throws Throwable {
    return ExtendedThreadContext.NOT_PERFORMED;
  }

  public Object doStaticCallQuick(ExtendedThreadContext tc, char p1) throws Throwable {
    return ExtendedThreadContext.NOT_PERFORMED;
  }

  public Object doStaticCallQuick(ExtendedThreadContext tc, byte p1) throws Throwable {
    return ExtendedThreadContext.NOT_PERFORMED;
  }

  public Object doStaticCallQuick(ExtendedThreadContext tc, short p1) throws Throwable {
    return ExtendedThreadContext.NOT_PERFORMED;
  }

  public Object doStaticCallQuick(ExtendedThreadContext tc, int p1) throws Throwable {
    return ExtendedThreadContext.NOT_PERFORMED;
  }

  public Object doStaticCallQuick(ExtendedThreadContext tc, long p1) throws Throwable {
    return ExtendedThreadContext.NOT_PERFORMED;
  }

  public Object doStaticCallQuick(ExtendedThreadContext tc, float p1) throws Throwable {
    return ExtendedThreadContext.NOT_PERFORMED;
  }

  public Object doStaticCallQuick(ExtendedThreadContext tc, double p1) throws Throwable {
    return ExtendedThreadContext.NOT_PERFORMED;
  }

  public Object doStaticCallQuick(ExtendedThreadContext tc, BigInteger p1) throws Throwable {
    return ExtendedThreadContext.NOT_PERFORMED;
  }

  public Object doStaticCallQuick(ExtendedThreadContext tc, BigDecimal p1) throws Throwable {
    return ExtendedThreadContext.NOT_PERFORMED;
  }

  public Object doStaticCallQuick(ExtendedThreadContext tc, String p1) throws Throwable {
    return ExtendedThreadContext.NOT_PERFORMED;
  }

  public Object doStaticCallQuick(ExtendedThreadContext tc, Object p1) throws Throwable {
    return ExtendedThreadContext.NOT_PERFORMED;
  }

  public Object doStaticCallQuick(ExtendedThreadContext tc, Object p1, Object p2) throws Throwable {
    return ExtendedThreadContext.NOT_PERFORMED;
  }

  public Object doStaticCallQuick(ExtendedThreadContext tc, Object p1, Object p2, Object p3) throws Throwable {
    return ExtendedThreadContext.NOT_PERFORMED;
  }

  public Object doStaticCallQuick(ExtendedThreadContext tc, Object p1, Object p2, Object p3, Object p4) throws Throwable {
    return ExtendedThreadContext.NOT_PERFORMED;
  }

  public Object doCall(ExtendedThreadContext tc, Object instance, Object[] params) throws Throwable {
    return ExtendedThreadContext.NOT_PERFORMED;
  }

  public Object doCallQuick(ExtendedThreadContext tc, Object instance) throws Throwable {
    return doStaticCallQuick(tc);
  }

  public Object doCallQuick(ExtendedThreadContext tc, Object instance, boolean p1) throws Throwable {
    return doStaticCallQuick(tc, p1);
  }

  public Object doCallQuick(ExtendedThreadContext tc, Object instance, char p1) throws Throwable {
    return doStaticCallQuick(tc, p1);
  }

  public Object doCallQuick(ExtendedThreadContext tc, Object instance, byte p1) throws Throwable {
    return doStaticCallQuick(tc, p1);
  }

  public Object doCallQuick(ExtendedThreadContext tc, Object instance, short p1) throws Throwable {
    return doStaticCallQuick(tc, p1);
  }

  public Object doCallQuick(ExtendedThreadContext tc, Object instance, int p1) throws Throwable {
    return doStaticCallQuick(tc, p1);
  }

  public Object doCallQuick(ExtendedThreadContext tc, Object instance, long p1) throws Throwable {
    return doStaticCallQuick(tc, p1);
  }

  public Object doCallQuick(ExtendedThreadContext tc, Object instance, float p1) throws Throwable {
    return doStaticCallQuick(tc, p1);
  }

  public Object doCallQuick(ExtendedThreadContext tc, Object instance, double p1) throws Throwable {
    return doStaticCallQuick(tc, p1);
  }

  public Object doCallQuick(ExtendedThreadContext tc, Object instance, BigInteger p1) throws Throwable {
    return doStaticCallQuick(tc, p1);
  }

  public Object doCallQuick(ExtendedThreadContext tc, Object instance, BigDecimal p1) throws Throwable {
    return doStaticCallQuick(tc, p1);
  }

  public Object doCallQuick(ExtendedThreadContext tc, Object instance, String p1) throws Throwable {
    return doStaticCallQuick(tc, p1);
  }

  public Object doCallQuick(ExtendedThreadContext tc, Object instance, Object p1) throws Throwable {
    return doStaticCallQuick(tc, p1);
  }

  public Object doCallQuick(ExtendedThreadContext tc, Object instance, Object p1, Object p2) throws Throwable {
    return doStaticCallQuick(tc, p1, p2);
  }

  public Object doCallQuick(ExtendedThreadContext tc, Object instance, Object p1, Object p2, Object p3) throws Throwable {
    return doStaticCallQuick(tc, p1, p2, p3);
  }

  public Object doCallQuick(ExtendedThreadContext tc, Object instance, Object p1, Object p2, Object p3, Object p4) throws Throwable {
    return doStaticCallQuick(tc, p1, p2, p3, p4);
  }
}
