package ng.runtime.metaclass;

import java.math.BigDecimal;
import java.math.BigInteger;

import ng.runtime.threadcontext.ThreadContext;

/**
 * @author John
 *
 */
public interface DoStaticMethodCall {
  Object doApply(ThreadContext tc, String name, Object params[]);

  Object doApplyQuick(ThreadContext tc, String name);
  Object doApplyQuick(ThreadContext tc, String name, Object p1);
  Object doApplyQuick(ThreadContext tc, String name, Object p1, Object p2);
  Object doApplyQuick(ThreadContext tc, String name, Object p1, Object p2, Object p3);
  Object doApplyQuick(ThreadContext tc, String name, Object p1, Object p2, Object p3, Object p4);

  Object doApplyQuick(ThreadContext tc, String name, boolean p1);
  Object doApplyQuick(ThreadContext tc, String name, char p1);
  Object doApplyQuick(ThreadContext tc, String name, byte p1);
  Object doApplyQuick(ThreadContext tc, String name, short p1);
  Object doApplyQuick(ThreadContext tc, String name, int p1);
  Object doApplyQuick(ThreadContext tc, String name, long p1);
  Object doApplyQuick(ThreadContext tc, String name, float p1);
  Object doApplyQuick(ThreadContext tc, String name, double p1);
  Object doApplyQuick(ThreadContext tc, String name, BigInteger p1);
  Object doApplyQuick(ThreadContext tc, String name, BigDecimal p1);
  Object doApplyQuick(ThreadContext tc, String name, String p1);
}
