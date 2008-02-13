package ng.runtime.metaclass;

import java.math.BigDecimal;
import java.math.BigInteger;

import ng.runtime.threadcontext.ExtendedThreadContext;



/**
 * @author John
 *
 */
public interface StaticMethodProxy {
  Object doApply(ExtendedThreadContext tc, Object params[]);

  Object doApplyQuick(ExtendedThreadContext tc);
  Object doApplyQuick(ExtendedThreadContext tc, Object p1);
  Object doApplyQuick(ExtendedThreadContext tc, Object p1, Object p2);
  Object doApplyQuick(ExtendedThreadContext tc, Object p1, Object p2, Object p3);
  Object doApplyQuick(ExtendedThreadContext tc, Object p1, Object p2, Object p3, Object p4);

  Object doApplyQuick(ExtendedThreadContext tc, boolean p1);
  Object doApplyQuick(ExtendedThreadContext tc, char p1);
  Object doApplyQuick(ExtendedThreadContext tc, byte p1);
  Object doApplyQuick(ExtendedThreadContext tc, short p1);
  Object doApplyQuick(ExtendedThreadContext tc, int p1);
  Object doApplyQuick(ExtendedThreadContext tc, long p1);
  Object doApplyQuick(ExtendedThreadContext tc, float p1);
  Object doApplyQuick(ExtendedThreadContext tc, double p1);
  Object doApplyQuick(ExtendedThreadContext tc, BigInteger p1);
  Object doApplyQuick(ExtendedThreadContext tc, BigDecimal p1);
  Object doApplyQuick(ExtendedThreadContext tc, String p1);
}
