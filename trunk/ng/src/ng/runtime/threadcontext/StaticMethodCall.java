package ng.runtime.threadcontext;

import java.math.BigDecimal;
import java.math.BigInteger;

import ng.runtime.metaclass.BaseStaticMethodCall;
import ng.runtime.metaclass.MetaClass;

/**
 * @author John
 *
 */

public interface StaticMethodCall extends BaseStaticMethodCall {
  Object apply(Class theClass, String name, Object[] params) throws Throwable;
  Object apply(MetaClass metaClass, String name, Object[] params) throws Throwable;
  Object apply(Class theClass, StaticCallable callable, String name, Object[] params) throws Throwable;
  Object apply(MetaClass metaClass, StaticCallable callable, String name, Object[] params) throws Throwable;

  StaticCallable getCallable(Class theClass, String name, Object[] params);
  StaticCallable getCallable(MetaClass metaClass, String name, Object[] params);
  StaticCallable getCallable(MetaClass metaClass, String name, Object[] params, MetaClass[] metaClasses);
  StaticCallable getCallable(Class theClass, StaticCallable callable, String name, Object[] params);
  StaticCallable getCallable(MetaClass metaClass, StaticCallable callable, String name, Object[] params);
  StaticCallable getCallable(MetaClass metaClass, StaticCallable callable, String name, Object[] params, MetaClass[] metaClasses);

  Object applyQuick(Class theClass, String name) throws Throwable;
  Object applyQuick(MetaClass metaClass, String name) throws Throwable;
  Object applyQuick(Class theClass, StaticCallable callable, String name) throws Throwable;
  Object applyQuick(MetaClass metaClass, StaticCallable callable, String name) throws Throwable;
  
  StaticCallable getCallable(Class theClass, String name);
  StaticCallable getCallable(MetaClass metaClass, String name);
  StaticCallable getCallable(Class theClass, StaticCallable callable, String name);
  StaticCallable getCallable(MetaClass metaClass, StaticCallable callable, String name);
  
  Object applyQuick(Class theClass, String name, boolean p1) throws Throwable;
  Object applyQuick(MetaClass metaClass, String name, boolean p1) throws Throwable;
  Object applyQuick(Class theClass, StaticCallable callable, String name, boolean p1) throws Throwable;
  Object applyQuick(MetaClass metaClass, StaticCallable callable, String name, boolean p1) throws Throwable;
  
  StaticCallable getCallable(Class theClass, String name, boolean p1);
  StaticCallable getCallable(MetaClass metaClass, String name, boolean p1);
  StaticCallable getCallable(Class theClass, StaticCallable callable, String name, boolean p1);
  StaticCallable getCallable(MetaClass metaClass, StaticCallable callable, String name, boolean p1);
  
  Object applyQuick(Class theClass, String name, char p1) throws Throwable;
  Object applyQuick(MetaClass metaClass, String name, char p1) throws Throwable;
  Object applyQuick(Class theClass, StaticCallable callable, String name, char p1) throws Throwable;
  Object applyQuick(MetaClass metaClass, StaticCallable callable, String name, char p1) throws Throwable;
  
  StaticCallable getCallable(Class theClass, String name, char p1);
  StaticCallable getCallable(MetaClass metaClass, String name, char p1);
  StaticCallable getCallable(Class theClass, StaticCallable callable, String name, char p1);
  StaticCallable getCallable(MetaClass metaClass, StaticCallable callable, String name, char p1);
  
  Object applyQuick(Class theClass, String name, byte p1) throws Throwable;
  Object applyQuick(MetaClass metaClass, String name, byte p1) throws Throwable;
  Object applyQuick(Class theClass, StaticCallable callable, String name, byte p1) throws Throwable;
  Object applyQuick(MetaClass metaClass, StaticCallable callable, String name, byte p1) throws Throwable;
  
  StaticCallable getCallable(Class theClass, String name, byte p1);
  StaticCallable getCallable(MetaClass metaClass, String name, byte p1);
  StaticCallable getCallable(Class theClass, StaticCallable callable, String name, byte p1);
  StaticCallable getCallable(MetaClass metaClass, StaticCallable callable, String name, byte p1);
  
  Object applyQuick(Class theClass, String name, short p1) throws Throwable;
  Object applyQuick(MetaClass metaClass, String name, short p1) throws Throwable;
  Object applyQuick(Class theClass, StaticCallable callable, String name, short p1) throws Throwable;
  Object applyQuick(MetaClass metaClass, StaticCallable callable, String name, short p1) throws Throwable;
  
  StaticCallable getCallable(Class theClass, String name, short p1);
  StaticCallable getCallable(MetaClass metaClass, String name, short p1);
  StaticCallable getCallable(Class theClass, StaticCallable callable, String name, short p1);
  StaticCallable getCallable(MetaClass metaClass, StaticCallable callable, String name, short p1);
  
  Object applyQuick(Class theClass, String name, int p1) throws Throwable;
  Object applyQuick(MetaClass metaClass, String name, int p1) throws Throwable;
  Object applyQuick(Class theClass, StaticCallable callable, String name, int p1) throws Throwable;
  Object applyQuick(MetaClass metaClass, StaticCallable callable, String name, int p1) throws Throwable;
  
  StaticCallable getCallable(Class theClass, String name, int p1);
  StaticCallable getCallable(MetaClass metaClass, String name, int p1);
  StaticCallable getCallable(Class theClass, StaticCallable callable, String name, int p1);
  StaticCallable getCallable(MetaClass metaClass, StaticCallable callable, String name, int p1);
  
  Object applyQuick(Class theClass, String name, long p1) throws Throwable;
  Object applyQuick(MetaClass metaClass, String name, long p1) throws Throwable;
  Object applyQuick(Class theClass, StaticCallable callable, String name, long p1) throws Throwable;
  Object applyQuick(MetaClass metaClass, StaticCallable callable, String name, long p1) throws Throwable;
  
  StaticCallable getCallable(Class theClass, String name, long p1);
  StaticCallable getCallable(MetaClass metaClass, String name, long p1);
  StaticCallable getCallable(Class theClass, StaticCallable callable, String name, long p1);
  StaticCallable getCallable(MetaClass metaClass, StaticCallable callable, String name, long p1);
  
  Object applyQuick(Class theClass, String name, float p1) throws Throwable;
  Object applyQuick(MetaClass metaClass, String name, float p1) throws Throwable;
  Object applyQuick(Class theClass, StaticCallable callable, String name, float p1) throws Throwable;
  Object applyQuick(MetaClass metaClass, StaticCallable callable, String name, float p1) throws Throwable;
  
  StaticCallable getCallable(Class theClass, String name, float p1);
  StaticCallable getCallable(MetaClass metaClass, String name, float p1);
  StaticCallable getCallable(Class theClass, StaticCallable callable, String name, float p1);
  StaticCallable getCallable(MetaClass metaClass, StaticCallable callable, String name, float p1);
  
  Object applyQuick(Class theClass, String name, double p1) throws Throwable;
  Object applyQuick(MetaClass metaClass, String name, double p1) throws Throwable;
  Object applyQuick(Class theClass, StaticCallable callable, String name, double p1) throws Throwable;
  Object applyQuick(MetaClass metaClass, StaticCallable callable, String name, double p1) throws Throwable;
  
  StaticCallable getCallable(Class theClass, String name, double p1);
  StaticCallable getCallable(MetaClass metaClass, String name, double p1);
  StaticCallable getCallable(Class theClass, StaticCallable callable, String name, double p1);
  StaticCallable getCallable(MetaClass metaClass, StaticCallable callable, String name, double p1);
  
  Object applyQuick(Class theClass, String name, BigInteger p1) throws Throwable;
  Object applyQuick(MetaClass metaClass, String name, BigInteger p1) throws Throwable;
  Object applyQuick(Class theClass, StaticCallable callable, String name, BigInteger p1) throws Throwable;
  Object applyQuick(MetaClass metaClass, StaticCallable callable, String name, BigInteger p1) throws Throwable;
  
  StaticCallable getCallable(Class theClass, String name, BigInteger p1);
  StaticCallable getCallable(MetaClass metaClass, String name, BigInteger p1);
  StaticCallable getCallable(Class theClass, StaticCallable callable, String name, BigInteger p1);
  StaticCallable getCallable(MetaClass metaClass, StaticCallable callable, String name, BigInteger p1);
  
  Object applyQuick(Class theClass, String name, BigDecimal p1) throws Throwable;
  Object applyQuick(MetaClass metaClass, String name, BigDecimal p1) throws Throwable;
  Object applyQuick(Class theClass, StaticCallable callable, String name, BigDecimal p1) throws Throwable;
  Object applyQuick(MetaClass metaClass, StaticCallable callable, String name, BigDecimal p1) throws Throwable;
  
  StaticCallable getCallable(Class theClass, String name, BigDecimal p1);
  StaticCallable getCallable(MetaClass metaClass, String name, BigDecimal p1);
  StaticCallable getCallable(Class theClass, StaticCallable callable, String name, BigDecimal p1);
  StaticCallable getCallable(MetaClass metaClass, StaticCallable callable, String name, BigDecimal p1);
  
  StaticCallable getCallable(Class theClass, String name, String p1) throws Throwable;
  StaticCallable getCallable(MetaClass metaClass, String name, String p1) throws Throwable;
  StaticCallable getCallable(Class theClass, StaticCallable callable, String name, String p1) throws Throwable;
  StaticCallable getCallable(MetaClass metaClass, StaticCallable callable, String name, String p1) throws Throwable;
  
  Object applyQuick(Class theClass, String name, String p1) throws Throwable;
  Object applyQuick(MetaClass metaClass, String name, String p1) throws Throwable;
  Object applyQuick(Class theClass, StaticCallable callable, String name, String p1) throws Throwable;
  Object applyQuick(MetaClass metaClass, StaticCallable callable, String name, String p1) throws Throwable;
  
  Object applyQuick(Class theClass, String name, Object p1) throws Throwable;
  Object applyQuick(MetaClass metaClass, String name, Object p1) throws Throwable;
  Object applyQuick(Class theClass, StaticCallable callable, String name, Object p1) throws Throwable;
  Object applyQuick(MetaClass metaClass, StaticCallable callable, String name, Object p1) throws Throwable;
  
  StaticCallable getCallable(Class theClass, String name, Object p1);
  StaticCallable getCallable(MetaClass metaClass, String name, Object p1);
  StaticCallable getCallable(MetaClass metaClass, String name, Object p1, MetaClass m1);
  StaticCallable getCallable(Class theClass, StaticCallable callable, String name, Object p1);
  StaticCallable getCallable(MetaClass metaClass, StaticCallable callable, String name, Object p1);
  StaticCallable getCallable(MetaClass metaClass, StaticCallable callable, String name, Object p1, MetaClass m1);
  
  Object applyQuick(Class theClass, String name, Object p1, Object p2) throws Throwable;
  Object applyQuick(MetaClass metaClass, String name, Object p1, Object p2) throws Throwable;
  Object applyQuick(Class theClass, StaticCallable callable, String name, Object p1, Object p2) throws Throwable;
  Object applyQuick(MetaClass metaClass, StaticCallable callable, String name, Object p1, Object p2) throws Throwable;
  
  StaticCallable getCallable(Class theClass, String name, Object p1, Object p2);
  StaticCallable getCallable(MetaClass metaClass, String name, Object p1, Object p2);
  StaticCallable getCallable(MetaClass metaClass, String name, Object p1, MetaClass m1, Object p2, MetaClass m2);
  StaticCallable getCallable(Class theClass, StaticCallable callable, String name, Object p1, Object p2);
  StaticCallable getCallable(MetaClass metaClass, StaticCallable callable, String name, Object p1, Object p2);
  StaticCallable getCallable(MetaClass metaClass, StaticCallable callable, String name, Object p1, MetaClass m1, Object p2, MetaClass m2);
  
  Object applyQuick(Class theClass, String name, Object p1, Object p2, Object p3) throws Throwable;
  Object applyQuick(MetaClass metaClass, String name, Object p1, Object p2, Object p3) throws Throwable;
  Object applyQuick(Class theClass, StaticCallable callable, String name, Object p1, Object p2, Object p3) throws Throwable;
  Object applyQuick(MetaClass metaClass, StaticCallable callable, String name, Object p1, Object p2, Object p3) throws Throwable;
  
  StaticCallable getCallable(Class theClass, String name, Object p1, Object p2, Object p3);
  StaticCallable getCallable(MetaClass metaClass, String name, Object p1, Object p2, Object p3);
  StaticCallable getCallable(MetaClass metaClass, String name, Object p1, MetaClass m1, Object p2, MetaClass m2, Object p3, MetaClass m3);
  StaticCallable getCallable(Class theClass, StaticCallable callable, String name, Object p1, Object p2, Object p3);
  StaticCallable getCallable(MetaClass metaClass, StaticCallable callable, String name, Object p1, Object p2, Object p3);
  StaticCallable getCallable(MetaClass metaClass, StaticCallable callable, String name, Object p1, MetaClass m1, Object p2, MetaClass m2, Object p3, MetaClass m3);
  
  Object applyQuick(Class theClass, String name, Object p1, Object p2, Object p3, Object p4) throws Throwable;
  Object applyQuick(MetaClass metaClass, String name, Object p1, Object p2, Object p3, Object p4) throws Throwable;
  Object applyQuick(Class theClass, StaticCallable callable, String name, Object p1, Object p2, Object p3, Object p4) throws Throwable;
  Object applyQuick(MetaClass metaClass, StaticCallable callable, String name, Object p1, Object p2, Object p3, Object p4) throws Throwable;
  
  StaticCallable getCallable(Class theClass, String name, Object p1, Object p2, Object p3, Object p4);
  StaticCallable getCallable(MetaClass metaClass, String name, Object p1, Object p2, Object p3, Object p4);
  StaticCallable getCallable(MetaClass metaClass, String name, Object p1, MetaClass m1, Object p2, MetaClass m2, Object p3, MetaClass m3, Object p4, MetaClass m4);
  StaticCallable getCallable(Class theClass, StaticCallable callable, String name, Object p1, Object p2, Object p3, Object p4);
  StaticCallable getCallable(MetaClass metaClass, StaticCallable callable, String name, Object p1, Object p2, Object p3, Object p4);
  StaticCallable getCallable(MetaClass metaClass, StaticCallable callable, String name, Object p1, MetaClass m1, Object p2, MetaClass m2, Object p3, MetaClass m3, Object p4, MetaClass m4);
}
