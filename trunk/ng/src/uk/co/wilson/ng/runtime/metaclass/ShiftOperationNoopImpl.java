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

  public Object doApply(ExtendedThreadContext tc, Object lhs, Object rhs) {
    return ExtendedThreadContext.NOT_PERFORMED;
  }

  public Object doApply(ExtendedThreadContext tc, Object lhs, MetaClass rhsMetaClass, Object rhs) {
    return ExtendedThreadContext.NOT_PERFORMED;
  }

  public Object doApply(ExtendedThreadContext tc, Object lhs, char rhs) {
    return ExtendedThreadContext.NOT_PERFORMED;
  }

  public Object doApply(ExtendedThreadContext tc, Object lhs, byte rhs) {
    return ExtendedThreadContext.NOT_PERFORMED;
  }

  public Object doApply(ExtendedThreadContext tc, Object lhs, short rhs) {
    return ExtendedThreadContext.NOT_PERFORMED;
  }

  public Object doApply(ExtendedThreadContext tc, Object lhs, int rhs) {
    return ExtendedThreadContext.NOT_PERFORMED;
  }

  public Object doApply(ExtendedThreadContext tc, Object lhs, long rhs) {
    return ExtendedThreadContext.NOT_PERFORMED;
  }

  public Object doApply(ExtendedThreadContext tc, Object lhs, float rhs) {
    return ExtendedThreadContext.NOT_PERFORMED;
  }

  public Object doApply(ExtendedThreadContext tc, Object lhs, double rhs) {
    return ExtendedThreadContext.NOT_PERFORMED;
  }

  public Object doApply(ExtendedThreadContext tc, Object lhs, BigInteger rhs) {
    return ExtendedThreadContext.NOT_PERFORMED;
  }

  public Object doApply(ExtendedThreadContext tc, Object lhs, BigDecimal rhs) {
    return ExtendedThreadContext.NOT_PERFORMED;
  }

  public Object doApply(ExtendedThreadContext tc, char lhs, Object rhs) {
    return ExtendedThreadContext.NOT_PERFORMED;
  }

  public Object doApply(ExtendedThreadContext tc, byte lhs, Object rhs) {
    return ExtendedThreadContext.NOT_PERFORMED;
  }

  public Object doApply(ExtendedThreadContext tc, short lhs, Object rhs) {
    return ExtendedThreadContext.NOT_PERFORMED;
  }

  public Object doApply(ExtendedThreadContext tc, int lhs, Object rhs) {
    return ExtendedThreadContext.NOT_PERFORMED;
  }

  public Object doApply(ExtendedThreadContext tc, long lhs, Object rhs) {
    return ExtendedThreadContext.NOT_PERFORMED;
  }

  public Object doApply(ExtendedThreadContext tc, float lhs, Object rhs) {
    return ExtendedThreadContext.NOT_PERFORMED;
  }

  public Object doApply(ExtendedThreadContext tc, double lhs, Object rhs) {
    return ExtendedThreadContext.NOT_PERFORMED;
  }

  public Object doApply(ExtendedThreadContext tc, BigInteger lhs, Object rhs) {
    return ExtendedThreadContext.NOT_PERFORMED;
  }

  public Object doApply(ExtendedThreadContext tc, BigDecimal lhs, Object rhs) {
    return ExtendedThreadContext.NOT_PERFORMED;
  }

  public Object doReverseApply(ExtendedThreadContext tc, Object lhs, Object rhs) {
    return ExtendedThreadContext.NOT_PERFORMED;
  }
}
