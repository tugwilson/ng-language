package ng.runtime.metaclass;

import java.math.BigDecimal;
import java.math.BigInteger;

import ng.runtime.threadcontext.ExtendedThreadContext;



/**
 * @author John
 *
 */
public interface DoStaticMethodCall {
  StaticCallable doGetCallable(ExtendedThreadContext tc, String name, Object params[], MetaClass[] metaClasses);

  StaticCallable doGetCallable(ExtendedThreadContext tc, String name);
  StaticCallable doGetCallable(ExtendedThreadContext tc, String name, boolean p1);
  StaticCallable doGetCallable(ExtendedThreadContext tc, String name, char p1);
  StaticCallable doGetCallable(ExtendedThreadContext tc, String name, byte p1);
  StaticCallable doGetCallable(ExtendedThreadContext tc, String name, short p1);
  StaticCallable doGetCallable(ExtendedThreadContext tc, String name, int p1);
  StaticCallable doGetCallable(ExtendedThreadContext tc, String name, long p1);
  StaticCallable doGetCallable(ExtendedThreadContext tc, String name, float p1);
  StaticCallable doGetCallable(ExtendedThreadContext tc, String name, double p1);
  StaticCallable doGetCallable(ExtendedThreadContext tc, String name, BigInteger p1);
  StaticCallable doGetCallable(ExtendedThreadContext tc, String name, BigDecimal p1);
  StaticCallable doGetCallable(ExtendedThreadContext tc, String name, String p1);
  StaticCallable doGetCallable(ExtendedThreadContext tc, String name, Object p1, MetaClass m1);
  StaticCallable doGetCallable(ExtendedThreadContext tc, String name, Object p1, MetaClass m1, Object p2, MetaClass m2);
  StaticCallable doGetCallable(ExtendedThreadContext tc, String name, Object p1, MetaClass m1, Object p2, MetaClass m2, Object p3, MetaClass m3);
  StaticCallable doGetCallable(ExtendedThreadContext tc, String name, Object p1, MetaClass m1, Object p2, MetaClass m2, Object p3, MetaClass m3, Object p4, MetaClass m4);
}
