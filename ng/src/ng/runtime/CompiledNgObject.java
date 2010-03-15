package ng.runtime;

import java.math.BigDecimal;
import java.math.BigInteger;

import ng.runtime.threadcontext.ExtendedThreadContext;

/**
 * @author John
 * 
 */
public interface CompiledNgObject {
  Object ng$Call(ExtendedThreadContext tc, int methodNumber) throws Throwable;

  Object ng$Call(ExtendedThreadContext tc, int methodNumber, boolean p1) throws Throwable;

  Object ng$Call(ExtendedThreadContext tc, int methodNumber, char p1) throws Throwable;

  Object ng$Call(ExtendedThreadContext tc, int methodNumber, byte p1) throws Throwable;

  Object ng$Call(ExtendedThreadContext tc, int methodNumber, short p1) throws Throwable;

  Object ng$Call(ExtendedThreadContext tc, int methodNumber, int p1) throws Throwable;

  Object ng$Call(ExtendedThreadContext tc, int methodNumber, long p1) throws Throwable;

  Object ng$Call(ExtendedThreadContext tc, int methodNumber, float p1) throws Throwable;

  Object ng$Call(ExtendedThreadContext tc, int methodNumber, double p1) throws Throwable;

  Object ng$Call(ExtendedThreadContext tc, int methodNumber, BigInteger p1) throws Throwable;

  Object ng$Call(ExtendedThreadContext tc, int methodNumber, BigDecimal p1) throws Throwable;

  Object ng$Call(ExtendedThreadContext tc, int methodNumber, Object params[]) throws Throwable;

  Object ng$Call(ExtendedThreadContext tc, int methodNumber, Object p1) throws Throwable;

  Object ng$Call(ExtendedThreadContext tc, int methodNumber, Object p1, Object p2) throws Throwable;

  Object ng$Call(ExtendedThreadContext tc, int methodNumber, Object p1, Object p2, Object p3) throws Throwable;

  Object ng$Call(ExtendedThreadContext tc, int methodNumber, Object p1, Object p2, Object p3, Object p4) throws Throwable;
}
