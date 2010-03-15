package uk.co.wilson.ng.runtime.metaclass;

import java.math.BigDecimal;
import java.math.BigInteger;

import ng.runtime.metaclass.MetaClass;
import ng.runtime.metaclass.StaticMethodContainer;
import ng.runtime.threadcontext.ExtendedThreadContext;
import ng.runtime.threadcontext.StaticCallable;

/**
 * @author John
 * 
 */
public class BaseStaticMethodContainer implements StaticMethodContainer, StaticCallable {
  protected volatile StaticCallable modifiedCallable = null;

  public StaticCallable getCallable(final ExtendedThreadContext tc, final Object[] params, final MetaClass[] metaClasses) {
    return this;
  }

  public StaticCallable getCallable(final ExtendedThreadContext tc, final boolean p1) {
    return this;
  }

  public StaticCallable getCallable(final ExtendedThreadContext tc, final char p1) {
    return this;
  }

  public StaticCallable getCallable(final ExtendedThreadContext tc, final byte p1) {
    return this;
  }

  public StaticCallable getCallable(final ExtendedThreadContext tc, final short p1) {
    return this;
  }

  public StaticCallable getCallable(final ExtendedThreadContext tc, final int p1) {
    return this;
  }

  public StaticCallable getCallable(final ExtendedThreadContext tc, final long p1) {
    return this;
  }

  public StaticCallable getCallable(final ExtendedThreadContext tc, final float p1) {
    return this;
  }

  public StaticCallable getCallable(final ExtendedThreadContext tc, final double p1) {
    return this;
  }

  public StaticCallable getCallable(final ExtendedThreadContext tc, final BigInteger p1) {
    return this;
  }

  public StaticCallable getCallable(final ExtendedThreadContext tc, final BigDecimal p1) {
    return this;
  }

  public StaticCallable getCallable(final ExtendedThreadContext tc, final String p1) {
    return this;
  }

  public StaticCallable getCallable(final ExtendedThreadContext tc) {
    return this;
  }

  public StaticCallable getCallable(final ExtendedThreadContext tc, final Object p1, final MetaClass m1) {
    return this;
  }

  public StaticCallable getCallable(final ExtendedThreadContext tc, final Object p1, final MetaClass m1, final Object p2, final MetaClass m2) {
    return this;
  }

  public StaticCallable getCallable(final ExtendedThreadContext tc, final Object p1, final MetaClass m1, final Object p2, final MetaClass m2, final Object p3, final MetaClass m3) {
    return this;
  }

  public StaticCallable getCallable(final ExtendedThreadContext tc, final Object p1, final MetaClass m1, final Object p, final MetaClass m2, final Object p3, final MetaClass m3, final Object p4,
      final MetaClass m4) {
    return this;
  }

  public boolean isStillValid(final MetaClass metaclass) {
    return false;
  }

  public Object doStaticCall(final ExtendedThreadContext tc, final Object[] params) throws Throwable {
    return ExtendedThreadContext.NOT_PERFORMED;
  }

  public Object doStaticCallQuick(final ExtendedThreadContext tc) throws Throwable {
    return ExtendedThreadContext.NOT_PERFORMED;
  }

  public Object doStaticCallQuick(final ExtendedThreadContext tc, final boolean p1) throws Throwable {
    return ExtendedThreadContext.NOT_PERFORMED;
  }

  public Object doStaticCallQuick(final ExtendedThreadContext tc, final char p1) throws Throwable {
    return ExtendedThreadContext.NOT_PERFORMED;
  }

  public Object doStaticCallQuick(final ExtendedThreadContext tc, final byte p1) throws Throwable {
    return ExtendedThreadContext.NOT_PERFORMED;
  }

  public Object doStaticCallQuick(final ExtendedThreadContext tc, final short p1) throws Throwable {
    return ExtendedThreadContext.NOT_PERFORMED;
  }

  public Object doStaticCallQuick(final ExtendedThreadContext tc, final int p1) throws Throwable {
    return ExtendedThreadContext.NOT_PERFORMED;
  }

  public Object doStaticCallQuick(final ExtendedThreadContext tc, final long p1) throws Throwable {
    return ExtendedThreadContext.NOT_PERFORMED;
  }

  public Object doStaticCallQuick(final ExtendedThreadContext tc, final float p1) throws Throwable {
    return ExtendedThreadContext.NOT_PERFORMED;
  }

  public Object doStaticCallQuick(final ExtendedThreadContext tc, final double p1) throws Throwable {
    return ExtendedThreadContext.NOT_PERFORMED;
  }

  public Object doStaticCallQuick(final ExtendedThreadContext tc, final BigInteger p1) throws Throwable {
    return ExtendedThreadContext.NOT_PERFORMED;
  }

  public Object doStaticCallQuick(final ExtendedThreadContext tc, final BigDecimal p1) throws Throwable {
    return ExtendedThreadContext.NOT_PERFORMED;
  }

  public Object doStaticCallQuick(final ExtendedThreadContext tc, final String p1) throws Throwable {
    return ExtendedThreadContext.NOT_PERFORMED;
  }

  public Object doStaticCallQuick(final ExtendedThreadContext tc, final Object p1) throws Throwable {
    return ExtendedThreadContext.NOT_PERFORMED;
  }

  public Object doStaticCallQuick(final ExtendedThreadContext tc, final Object p1, final Object p2) throws Throwable {
    return ExtendedThreadContext.NOT_PERFORMED;
  }

  public Object doStaticCallQuick(final ExtendedThreadContext tc, final Object p1, final Object p2, final Object p3) throws Throwable {
    return ExtendedThreadContext.NOT_PERFORMED;
  }

  public Object doStaticCallQuick(final ExtendedThreadContext tc, final Object p1, final Object p2, final Object p3, final Object p4) throws Throwable {
    return ExtendedThreadContext.NOT_PERFORMED;
  }

  public Object doCall(final ExtendedThreadContext tc, final Object instance, final Object[] params) throws Throwable {
    return ExtendedThreadContext.NOT_PERFORMED;
  }

  public Object doCallQuick(final ExtendedThreadContext tc, final Object instance) throws Throwable {
    return doStaticCallQuick(tc);
  }

  public Object doCallQuick(final ExtendedThreadContext tc, final Object instance, final boolean p1) throws Throwable {
    return doStaticCallQuick(tc, p1);
  }

  public Object doCallQuick(final ExtendedThreadContext tc, final Object instance, final char p1) throws Throwable {
    return doStaticCallQuick(tc, p1);
  }

  public Object doCallQuick(final ExtendedThreadContext tc, final Object instance, final byte p1) throws Throwable {
    return doStaticCallQuick(tc, p1);
  }

  public Object doCallQuick(final ExtendedThreadContext tc, final Object instance, final short p1) throws Throwable {
    return doStaticCallQuick(tc, p1);
  }

  public Object doCallQuick(final ExtendedThreadContext tc, final Object instance, final int p1) throws Throwable {
    return doStaticCallQuick(tc, p1);
  }

  public Object doCallQuick(final ExtendedThreadContext tc, final Object instance, final long p1) throws Throwable {
    return doStaticCallQuick(tc, p1);
  }

  public Object doCallQuick(final ExtendedThreadContext tc, final Object instance, final float p1) throws Throwable {
    return doStaticCallQuick(tc, p1);
  }

  public Object doCallQuick(final ExtendedThreadContext tc, final Object instance, final double p1) throws Throwable {
    return doStaticCallQuick(tc, p1);
  }

  public Object doCallQuick(final ExtendedThreadContext tc, final Object instance, final BigInteger p1) throws Throwable {
    return doStaticCallQuick(tc, p1);
  }

  public Object doCallQuick(final ExtendedThreadContext tc, final Object instance, final BigDecimal p1) throws Throwable {
    return doStaticCallQuick(tc, p1);
  }

  public Object doCallQuick(final ExtendedThreadContext tc, final Object instance, final String p1) throws Throwable {
    return doStaticCallQuick(tc, p1);
  }

  public Object doCallQuick(final ExtendedThreadContext tc, final Object instance, final Object p1) throws Throwable {
    return doStaticCallQuick(tc, p1);
  }

  public Object doCallQuick(final ExtendedThreadContext tc, final Object instance, final Object p1, final Object p2) throws Throwable {
    return doStaticCallQuick(tc, p1, p2);
  }

  public Object doCallQuick(final ExtendedThreadContext tc, final Object instance, final Object p1, final Object p2, final Object p3) throws Throwable {
    return doStaticCallQuick(tc, p1, p2, p3);
  }

  public Object doCallQuick(final ExtendedThreadContext tc, final Object instance, final Object p1, final Object p2, final Object p3, final Object p4) throws Throwable {
    return doStaticCallQuick(tc, p1, p2, p3, p4);
  }
}
