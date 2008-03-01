package uk.co.wilson.ng.runtime.metaclass;

import java.math.BigDecimal;
import java.math.BigInteger;

import ng.runtime.metaclass.MetaClass;
import ng.runtime.metaclass.ShiftOperation;
import ng.runtime.threadcontext.ExtendedThreadContext;

/**
 * @author John
 *
 */
public class ShiftOperationNoopImpl implements ShiftOperation {
  public final static ShiftOperation instance = new ShiftOperationNoopImpl();

  public Object doApply(final ExtendedThreadContext tc, final Object lhs, final Object rhs) {
    return ExtendedThreadContext.NOT_PERFORMED;
  }

  public Object doApply(final ExtendedThreadContext tc, final Object lhs, final MetaClass rhsMetaClass, final Object rhs) {
    return ExtendedThreadContext.NOT_PERFORMED;
  }

  public Object doApply(final ExtendedThreadContext tc, final Object lhs, final char rhs) {
    return ExtendedThreadContext.NOT_PERFORMED;
  }

  public Object doApply(final ExtendedThreadContext tc, final Object lhs, final byte rhs) {
    return ExtendedThreadContext.NOT_PERFORMED;
  }

  public Object doApply(final ExtendedThreadContext tc, final Object lhs, final short rhs) {
    return ExtendedThreadContext.NOT_PERFORMED;
  }

  public Object doApply(final ExtendedThreadContext tc, final Object lhs, final int rhs) {
    return ExtendedThreadContext.NOT_PERFORMED;
  }

  public Object doApply(final ExtendedThreadContext tc, final Object lhs, final long rhs) {
    return ExtendedThreadContext.NOT_PERFORMED;
  }

  public Object doApply(final ExtendedThreadContext tc, final Object lhs, final float rhs) {
    return ExtendedThreadContext.NOT_PERFORMED;
  }

  public Object doApply(final ExtendedThreadContext tc, final Object lhs, final double rhs) {
    return ExtendedThreadContext.NOT_PERFORMED;
  }

  public Object doApply(final ExtendedThreadContext tc, final Object lhs, final BigInteger rhs) {
    return ExtendedThreadContext.NOT_PERFORMED;
  }

  public Object doApply(final ExtendedThreadContext tc, final Object lhs, final BigDecimal rhs) {
    return ExtendedThreadContext.NOT_PERFORMED;
  }

  public Object doApply(final ExtendedThreadContext tc, final char lhs, final Object rhs) {
    return ExtendedThreadContext.NOT_PERFORMED;
  }

  public Object doApply(final ExtendedThreadContext tc, final byte lhs, final Object rhs) {
    return ExtendedThreadContext.NOT_PERFORMED;
  }

  public Object doApply(final ExtendedThreadContext tc, final short lhs, final Object rhs) {
    return ExtendedThreadContext.NOT_PERFORMED;
  }

  public Object doApply(final ExtendedThreadContext tc, final int lhs, final Object rhs) {
    return ExtendedThreadContext.NOT_PERFORMED;
  }

  public Object doApply(final ExtendedThreadContext tc, final long lhs, final Object rhs) {
    return ExtendedThreadContext.NOT_PERFORMED;
  }

  public Object doApply(final ExtendedThreadContext tc, final float lhs, final Object rhs) {
    return ExtendedThreadContext.NOT_PERFORMED;
  }

  public Object doApply(final ExtendedThreadContext tc, final double lhs, final Object rhs) {
    return ExtendedThreadContext.NOT_PERFORMED;
  }

  public Object doApply(final ExtendedThreadContext tc, final BigInteger lhs, final Object rhs) {
    return ExtendedThreadContext.NOT_PERFORMED;
  }

  public Object doApply(final ExtendedThreadContext tc, final BigDecimal lhs, final Object rhs) {
    return ExtendedThreadContext.NOT_PERFORMED;
  }

  public Object doReverseApply(final ExtendedThreadContext tc, final Object lhs, final Object rhs) {
    return ExtendedThreadContext.NOT_PERFORMED;
  }
}
