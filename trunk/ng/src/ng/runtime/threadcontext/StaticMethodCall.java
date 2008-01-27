package ng.runtime.threadcontext;

import java.math.BigDecimal;
import java.math.BigInteger;

import ng.runtime.metaclass.MetaClass;

/**
 * @author John
 *
 */
public interface StaticMethodCall {
  Object apply(Class theClass, String name, Object[] params);
  Object apply(MetaClass metaclass, String name, Object[] params);
  
  Object applyQuick(Class theClass, String name);
  Object applyQuick(MetaClass metaclass, String name);
  Object applyQuick(Class theClass, String name, Object p1);
  Object applyQuick(MetaClass metaclass, String name, Object p1);
  Object applyQuick(Class theClass, String name, Object p1, Object p2);
  Object applyQuick(MetaClass metaclass, String name, Object p1, Object p2);
  Object applyQuick(Class theClass, String name, Object p1, Object p2, Object p3);
  Object applyQuick(MetaClass metaclass, String name, Object p1, Object p2, Object p3);
  Object applyQuick(Class theClass, String name, Object p1, Object p2, Object p3, Object p4);
  Object applyQuick(MetaClass metaclass, String name, Object p1, Object p2, Object p3, Object p4);

  Object applyQuick(Class theClass, String name, boolean p1);
  Object applyQuick(MetaClass metaclass, String name, boolean p1);
  Object applyQuick(Class theClass, String name, char p1);
  Object applyQuick(MetaClass metaclass, String name, char p1);
  Object applyQuick(Class theClass, String name, byte p1);
  Object applyQuick(MetaClass metaclass, String name, byte p1);
  Object applyQuick(Class theClass, String name, short p1);
  Object applyQuick(MetaClass metaclass, String name, short p1);
  Object applyQuick(Class theClass, String name, int p1);
  Object applyQuick(MetaClass metaclass, String name, int p1);
  Object applyQuick(Class theClass, String name, long p1);
  Object applyQuick(MetaClass metaclass, String name, long p1);
  Object applyQuick(Class theClass, String name, float p1);
  Object applyQuick(MetaClass metaclass, String name, float p1);
  Object applyQuick(Class theClass, String name, double p1);
  Object applyQuick(MetaClass metaclass, String name, double p1);
  Object applyQuick(Class theClass, String name, BigInteger p1);
  Object applyQuick(MetaClass metaclass, String name, BigInteger p1);
  Object applyQuick(Class theClass, String name, BigDecimal p1);
  Object applyQuick(MetaClass metaclass, String name, BigDecimal p1);
  Object applyQuick(Class theClass, String name, String p1);
  Object applyQuick(MetaClass metaclass, String name, String p1);
}
