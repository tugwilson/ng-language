package ng.runtime.threadcontext;

import java.math.BigDecimal;
import java.math.BigInteger;

import ng.runtime.metaclass.MetaClass;

/**
 * @author John
 *
 */
public interface StaticCallable extends Callable {
  boolean isStillValid(MetaClass metaclass);

  Object doStaticCall(ExtendedThreadContext tc, Object params[]) throws Throwable;

  Object doStaticCallQuick(ExtendedThreadContext tc) throws Throwable;
  Object doStaticCallQuick(ExtendedThreadContext tc, boolean p1) throws Throwable;
  Object doStaticCallQuick(ExtendedThreadContext tc, char p1) throws Throwable;
  Object doStaticCallQuick(ExtendedThreadContext tc, byte p1) throws Throwable;
  Object doStaticCallQuick(ExtendedThreadContext tc, short p1) throws Throwable;
  Object doStaticCallQuick(ExtendedThreadContext tc, int p1) throws Throwable;
  Object doStaticCallQuick(ExtendedThreadContext tc, long p1) throws Throwable;
  Object doStaticCallQuick(ExtendedThreadContext tc, float p1) throws Throwable;
  Object doStaticCallQuick(ExtendedThreadContext tc, double p1) throws Throwable;
  Object doStaticCallQuick(ExtendedThreadContext tc, BigInteger p1) throws Throwable;
  Object doStaticCallQuick(ExtendedThreadContext tc, BigDecimal p1) throws Throwable;
  Object doStaticCallQuick(ExtendedThreadContext tc, String p1) throws Throwable;
  Object doStaticCallQuick(ExtendedThreadContext tc, Object p1) throws Throwable;
  Object doStaticCallQuick(ExtendedThreadContext tc, Object p1, Object p2) throws Throwable;
  Object doStaticCallQuick(ExtendedThreadContext tc, Object p1, Object p2, Object p3) throws Throwable;
  Object doStaticCallQuick(ExtendedThreadContext tc, Object p1, Object p2, Object p3, Object p4) throws Throwable;
}
