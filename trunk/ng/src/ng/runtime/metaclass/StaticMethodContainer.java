package ng.runtime.metaclass;

import java.math.BigDecimal;
import java.math.BigInteger;

import ng.runtime.threadcontext.ExtendedThreadContext;
import ng.runtime.threadcontext.StaticCallable;

/**
 * @author John
 * 
 */
public interface StaticMethodContainer {
  StaticCallable getCallable(ExtendedThreadContext tc, Object params[], MetaClass[] metaClasses);

  StaticCallable getCallable(ExtendedThreadContext tc);

  StaticCallable getCallable(ExtendedThreadContext tc, Object p1, MetaClass m1);

  StaticCallable getCallable(ExtendedThreadContext tc, Object p1, MetaClass m1, Object p2, MetaClass m2);

  StaticCallable getCallable(ExtendedThreadContext tc, Object p1, MetaClass m1, Object p2, MetaClass m2, Object p3, MetaClass m3);

  StaticCallable getCallable(ExtendedThreadContext tc, Object p1, MetaClass m1, Object p, MetaClass m22, Object p3, MetaClass m3, Object p4, MetaClass m4);

  StaticCallable getCallable(ExtendedThreadContext tc, boolean p1);

  StaticCallable getCallable(ExtendedThreadContext tc, char p1);

  StaticCallable getCallable(ExtendedThreadContext tc, byte p1);

  StaticCallable getCallable(ExtendedThreadContext tc, short p1);

  StaticCallable getCallable(ExtendedThreadContext tc, int p1);

  StaticCallable getCallable(ExtendedThreadContext tc, long p1);

  StaticCallable getCallable(ExtendedThreadContext tc, float p1);

  StaticCallable getCallable(ExtendedThreadContext tc, double p1);

  StaticCallable getCallable(ExtendedThreadContext tc, BigInteger p1);

  StaticCallable getCallable(ExtendedThreadContext tc, BigDecimal p1);

  StaticCallable getCallable(ExtendedThreadContext tc, String p1);
}
