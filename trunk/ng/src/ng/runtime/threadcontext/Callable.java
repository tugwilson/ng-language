package ng.runtime.threadcontext;

import java.math.BigDecimal;
import java.math.BigInteger;



/**
 * @author John
 *
 */
public interface Callable {
  Object doCall(ExtendedThreadContext tc, Object instance, Object params[]) throws Throwable;

  Object doCallQuick(ExtendedThreadContext tc, Object instance) throws Throwable;
  Object doCallQuick(ExtendedThreadContext tc, Object instance, boolean p1) throws Throwable;
  Object doCallQuick(ExtendedThreadContext tc, Object instance, char p1) throws Throwable;
  Object doCallQuick(ExtendedThreadContext tc, Object instance, byte p1) throws Throwable;
  Object doCallQuick(ExtendedThreadContext tc, Object instance, short p1) throws Throwable;
  Object doCallQuick(ExtendedThreadContext tc, Object instance, int p1) throws Throwable;
  Object doCallQuick(ExtendedThreadContext tc, Object instance, long p1) throws Throwable;
  Object doCallQuick(ExtendedThreadContext tc, Object instance, float p1) throws Throwable;
  Object doCallQuick(ExtendedThreadContext tc, Object instance, double p1) throws Throwable;
  Object doCallQuick(ExtendedThreadContext tc, Object instance, BigInteger p1) throws Throwable;
  Object doCallQuick(ExtendedThreadContext tc, Object instance, BigDecimal p1) throws Throwable;
  Object doCallQuick(ExtendedThreadContext tc, Object instance, String p1) throws Throwable;
  Object doCallQuick(ExtendedThreadContext tc, Object instance, Object p1) throws Throwable;
  Object doCallQuick(ExtendedThreadContext tc, Object instance, Object p1, Object p2) throws Throwable;
  Object doCallQuick(ExtendedThreadContext tc, Object instance, Object p1, Object p2, Object p3) throws Throwable;
  Object doCallQuick(ExtendedThreadContext tc, Object instance, Object p1, Object p2, Object p3, Object p4) throws Throwable;
}
