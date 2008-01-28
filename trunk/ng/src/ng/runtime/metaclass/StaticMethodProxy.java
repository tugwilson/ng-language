package ng.runtime.metaclass;

import java.math.BigDecimal;
import java.math.BigInteger;

import ng.runtime.threadcontext.ThreadContext;

/**
 * @author John
 *
 */
public interface StaticMethodProxy {
  Object doApply(ThreadContext tc, Object params[]);

  Object doApplyQuick(ThreadContext tc);
  Object doApplyQuick(ThreadContext tc, Object p1);
  Object doApplyQuick(ThreadContext tc, Object p1, Object p2);
  Object doApplyQuick(ThreadContext tc, Object p1, Object p2, Object p3);
  Object doApplyQuick(ThreadContext tc, Object p1, Object p2, Object p3, Object p4);

  Object doApplyQuick(ThreadContext tc, boolean p1);
  Object doApplyQuick(ThreadContext tc, char p1);
  Object doApplyQuick(ThreadContext tc, byte p1);
  Object doApplyQuick(ThreadContext tc, short p1);
  Object doApplyQuick(ThreadContext tc, int p1);
  Object doApplyQuick(ThreadContext tc, long p1);
  Object doApplyQuick(ThreadContext tc, float p1);
  Object doApplyQuick(ThreadContext tc, double p1);
  Object doApplyQuick(ThreadContext tc, BigInteger p1);
  Object doApplyQuick(ThreadContext tc, BigDecimal p1);
  Object doApplyQuick(ThreadContext tc, String p1);
}
