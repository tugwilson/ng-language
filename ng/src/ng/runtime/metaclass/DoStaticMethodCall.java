package ng.runtime.metaclass;

import java.math.BigDecimal;
import java.math.BigInteger;

import uk.co.wilson.ng.runtime.threadcontext.ExtendedThreadContext;


/**
 * @author John
 *
 */
public interface DoStaticMethodCall {
  Object doApply(ExtendedThreadContext tc, String name, Object params[]);

  Object doApplyQuick(ExtendedThreadContext tc, String name);
  Object doApplyQuick(ExtendedThreadContext tc, String name, Object p1);
  Object doApplyQuick(ExtendedThreadContext tc, String name, Object p1, Object p2);
  Object doApplyQuick(ExtendedThreadContext tc, String name, Object p1, Object p2, Object p3);
  Object doApplyQuick(ExtendedThreadContext tc, String name, Object p1, Object p2, Object p3, Object p4);

  Object doApplyQuick(ExtendedThreadContext tc, String name, boolean p1);
  Object doApplyQuick(ExtendedThreadContext tc, String name, char p1);
  Object doApplyQuick(ExtendedThreadContext tc, String name, byte p1);
  Object doApplyQuick(ExtendedThreadContext tc, String name, short p1);
  Object doApplyQuick(ExtendedThreadContext tc, String name, int p1);
  Object doApplyQuick(ExtendedThreadContext tc, String name, long p1);
  Object doApplyQuick(ExtendedThreadContext tc, String name, float p1);
  Object doApplyQuick(ExtendedThreadContext tc, String name, double p1);
  Object doApplyQuick(ExtendedThreadContext tc, String name, BigInteger p1);
  Object doApplyQuick(ExtendedThreadContext tc, String name, BigDecimal p1);
  Object doApplyQuick(ExtendedThreadContext tc, String name, String p1);
}
