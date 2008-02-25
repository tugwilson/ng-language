package uk.co.wilson.ng.runtime.threadcontext;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Map;
import java.util.Stack;

import ng.lang.NgRuntimeException;
import ng.runtime.metaclass.DoStaticMethodCall;
import ng.runtime.metaclass.MetaClass;
import ng.runtime.threadcontext.StaticCallable;
import ng.runtime.threadcontext.StaticMethodCall;

/**
 * @author John
 *
 */
public class CallStaticMethod implements StaticMethodCall {
  private Map<MetaClass, DoStaticMethodCall> categoryStaticMethodCallMap = null;

  private final Stack<Map<MetaClass, DoStaticMethodCall>> categoryStaticMethodCallMapStack = new Stack<Map<MetaClass, DoStaticMethodCall>>();

  private final ExtendedThreadContext tc;

  public Map<MetaClass, DoStaticMethodCall> getCategoryStaticMethodCallMap() {
    return this.categoryStaticMethodCallMap;
  }

  public void setCategoryStaticMethodCallMap(final Map<MetaClass, DoStaticMethodCall> categoryStaticMethodCallMap) {
    this.categoryStaticMethodCallMap = categoryStaticMethodCallMap;
  }

  public CallStaticMethod(final ExtendedThreadContext tc) {
    this.tc = tc;
  }

  public Object apply(final Class theClass, final String name, final Object[] params) throws Throwable {
    return apply(this.tc.getMetaClassFor(theClass), name, params);
  }

  public Object apply(final MetaClass metaClass, final String name, final Object[] params) throws Throwable {
    return apply(metaClass, getCallable(metaClass, name, params), name, params);
  }

  public Object apply(Class theClass, StaticCallable callable, String name, Object[] params) throws Throwable {
    return apply(this.tc.getMetaClassFor(theClass), callable, name, params);
  }

  public Object apply(MetaClass metaClass, StaticCallable callable, String name, Object[] params) throws Throwable {
  final Object result = callable.doStaticCall(this.tc, params);

    if (result == ExtendedThreadContext.NOT_PERFORMED) {
      throw new NgRuntimeException("Cannot call the static method " + name + " on the class " + metaClass.getTheClass().getName());
    } else {
      return result;
    }
  }

  public StaticCallable getCallable(Class theClass, String name, Object[] params) {
    return getCallable(this.tc.getMetaClassFor(theClass), name, params);
  }

  public StaticCallable getCallable(MetaClass metaClass, String name, Object[] params) {
  final MetaClass[] metaClasses = new MetaClass[params.length];
  
    for (int i = 0; i != params.length; i++) {
      metaClasses[i] = tc.getMetaClassFor(params[i]);
    }
    
    return getCallable(metaClass, name, params, metaClasses);
  }

  public StaticCallable getCallable(MetaClass metaClass, String name, Object[] params, MetaClass[] metaClasses) {
    return metaClass.staticMethodCall(this).doGetCallable(this.tc, name, params, metaClasses);
  }

  public StaticCallable getCallable(Class theClass, StaticCallable callable, String name, Object[] params) {
    return getCallable(this.tc.getMetaClassFor(theClass), callable, name, params);
  }

  public StaticCallable getCallable(MetaClass metaClass, StaticCallable callable, String name, Object[] params) {
    final MetaClass[] metaClasses = new MetaClass[params.length];
    
    for (int i = 0; i != params.length; i++) {
      metaClasses[i] = tc.getMetaClassFor(params[i]);
    }
    
    return getCallable(metaClass, callable, name, params, metaClasses);
  }

  public StaticCallable getCallable(MetaClass metaClass, StaticCallable callable, String name, Object[] params, MetaClass[] metaClasses) {
    if (callable.isStillValid(metaClass)) return callable;
    
    return getCallable(metaClass, name, params, metaClasses);
  }

  public Object applyQuick(final Class theClass, final String name) throws Throwable {
    return applyQuick(this.tc.getMetaClassFor(theClass), name);
  }

  public Object applyQuick(final MetaClass metaClass, final String name) throws Throwable {
    return applyQuick(metaClass, getCallable(metaClass, name), name);
  }

  public Object applyQuick(Class theClass, StaticCallable callable, String name) throws Throwable {
    return applyQuick(this.tc.getMetaClassFor(theClass), callable, name);
  }

  public Object applyQuick(MetaClass metaClass, StaticCallable callable, String name) throws Throwable {
  final Object result = callable.doStaticCallQuick(this.tc);

    if (result == ExtendedThreadContext.NOT_PERFORMED) {
      throw new NgRuntimeException("Cannot call the static method " + name + " on the class " + metaClass.getTheClass().getName());
    } else {
      return result;
    }
  }

  public StaticCallable getCallable(Class theClass, String name) {
    return getCallable(this.tc.getMetaClassFor(theClass), name);
  }

  public StaticCallable getCallable(MetaClass metaClass, String name) {
    return metaClass.staticMethodCall(this).doGetCallable(this.tc, name);
  }

  public StaticCallable getCallable(Class theClass, StaticCallable callable, String name) {
    return getCallable(this.tc.getMetaClassFor(theClass), callable, name);
  }

  public StaticCallable getCallable(MetaClass metaClass, StaticCallable callable, String name) {
    if (callable.isStillValid(metaClass)) return callable;
    
    return getCallable(metaClass, name);
  }

  public Object applyQuick(final Class theClass, final String name, final Object p1) throws Throwable {
    return applyQuick(this.tc.getMetaClassFor(theClass), name, p1);
  }

  public Object applyQuick(final MetaClass metaClass, final String name, final Object p1) throws Throwable {
    return applyQuick(metaClass, getCallable(metaClass, name, p1), name, p1);
  }

  public Object applyQuick(Class theClass, StaticCallable callable, String name, Object p1) throws Throwable {
    return applyQuick(this.tc.getMetaClassFor(theClass), callable, name, p1);
  }

  public Object applyQuick(MetaClass metaClass, StaticCallable callable, String name, Object p1) throws Throwable {
  final Object result = callable.doStaticCallQuick(this.tc, p1);

    if (result == ExtendedThreadContext.NOT_PERFORMED) {
      throw new NgRuntimeException("Cannot call the static method " + name + " on the class " + metaClass.getTheClass().getName());
    } else {
      return result;
    }
  }

  public StaticCallable getCallable(Class theClass, String name, Object p1) {
    return getCallable(this.tc.getMetaClassFor(theClass), name, p1);
  }

  public StaticCallable getCallable(MetaClass metaClass, String name, Object p1) {
    return getCallable(metaClass, name, p1, tc.getMetaClassFor(p1));
 }

  public StaticCallable getCallable(MetaClass metaClass, String name, Object p1, MetaClass m1) {
    return metaClass.staticMethodCall(this).doGetCallable(this.tc, name, p1, m1);
  }

  public StaticCallable getCallable(Class theClass, StaticCallable callable, String name, Object p1) {
    return getCallable(this.tc.getMetaClassFor(theClass), callable, name, p1);
  }

  public StaticCallable getCallable(MetaClass metaClass, StaticCallable callable, String name, Object p1) {
    return getCallable(metaClass, callable, name, p1, tc.getMetaClassFor(p1));
  }

  public StaticCallable getCallable(MetaClass metaClass, StaticCallable callable, String name, Object p1, MetaClass m1) {
    if (callable.isStillValid(metaClass)) return callable;
    
    return getCallable(metaClass, name, p1, m1);
  }

  public Object applyQuick(final Class theClass, final String name, final boolean p1) throws Throwable {
    return applyQuick(this.tc.getMetaClassFor(theClass), name, p1);
  }

  public Object applyQuick(final MetaClass metaClass, final String name, final boolean p1) throws Throwable {
    return applyQuick(metaClass, getCallable(metaClass, name, p1), name, p1);
  }

  public Object applyQuick(Class theClass, StaticCallable callable, String name, boolean p1) throws Throwable {
    return applyQuick(this.tc.getMetaClassFor(theClass), callable, name, p1);
  }

  public Object applyQuick(MetaClass metaClass, StaticCallable callable, String name, boolean p1) throws Throwable {
  final Object result = callable.doStaticCallQuick(this.tc, p1);

    if (result == ExtendedThreadContext.NOT_PERFORMED) {
      throw new NgRuntimeException("Cannot call the static method " + name + " on the class " + metaClass.getTheClass().getName());
    } else {
      return result;
    }
  }

  public StaticCallable getCallable(Class theClass, String name, boolean p1) {
    return getCallable(this.tc.getMetaClassFor(theClass), name, p1);
  }

  public StaticCallable getCallable(MetaClass metaClass, String name, boolean p1) {
    return metaClass.staticMethodCall(this).doGetCallable(this.tc, name, p1);
  }

  public StaticCallable getCallable(Class theClass, StaticCallable callable, String name, boolean p1) {
    return getCallable(this.tc.getMetaClassFor(theClass), callable, name, p1);
  }

  public StaticCallable getCallable(MetaClass metaClass, StaticCallable callable, String name, boolean p1) {
    if (callable.isStillValid(metaClass)) return callable;
    
    return getCallable(metaClass, name, p1);
  }

  public Object applyQuick(final Class theClass, final String name, final char p1) throws Throwable {
    return applyQuick(this.tc.getMetaClassFor(theClass), name, p1);
  }

  public Object applyQuick(final MetaClass metaClass, final String name, final char p1) throws Throwable {
    return applyQuick(metaClass, getCallable(metaClass, name, p1), name, p1);
  }

  public Object applyQuick(Class theClass, StaticCallable callable, String name, char p1) throws Throwable {
    return applyQuick(this.tc.getMetaClassFor(theClass), callable, name, p1);
  }

  public Object applyQuick(MetaClass metaClass, StaticCallable callable, String name, char p1) throws Throwable {
  final Object result = callable.doStaticCallQuick(this.tc, p1);

    if (result == ExtendedThreadContext.NOT_PERFORMED) {
      throw new NgRuntimeException("Cannot call the static method " + name + " on the class " + metaClass.getTheClass().getName());
    } else {
      return result;
    }
  }

  public StaticCallable getCallable(Class theClass, String name, char p1) {
    return getCallable(this.tc.getMetaClassFor(theClass), name, p1);
  }

  public StaticCallable getCallable(MetaClass metaClass, String name, char p1) {
    return metaClass.staticMethodCall(this).doGetCallable(this.tc, name, p1);
  }

  public StaticCallable getCallable(Class theClass, StaticCallable callable, String name, char p1) {
    return getCallable(this.tc.getMetaClassFor(theClass), callable, name, p1);
  }

  public StaticCallable getCallable(MetaClass metaClass, StaticCallable callable, String name, char p1) {
    if (callable.isStillValid(metaClass)) return callable;
    
    return getCallable(metaClass, name, p1);
  }

  public Object applyQuick(final Class theClass, final String name, final byte p1) throws Throwable {
    return applyQuick(this.tc.getMetaClassFor(theClass), name, p1);
  }

  public Object applyQuick(final MetaClass metaClass, final String name, final byte p1) throws Throwable {
    return applyQuick(metaClass, getCallable(metaClass, name, p1), name, p1);
  }

  public Object applyQuick(Class theClass, StaticCallable callable, String name, byte p1) throws Throwable {
    return applyQuick(this.tc.getMetaClassFor(theClass), callable, name, p1);
  }

  public Object applyQuick(MetaClass metaClass, StaticCallable callable, String name, byte p1) throws Throwable {
  final Object result = callable.doStaticCallQuick(this.tc, p1);

    if (result == ExtendedThreadContext.NOT_PERFORMED) {
      throw new NgRuntimeException("Cannot call the static method " + name + " on the class " + metaClass.getTheClass().getName());
    } else {
      return result;
    }
  }

  public StaticCallable getCallable(Class theClass, String name, byte p1) {
    return getCallable(this.tc.getMetaClassFor(theClass), name, p1);
  }

  public StaticCallable getCallable(MetaClass metaClass, String name, byte p1) {
    return metaClass.staticMethodCall(this).doGetCallable(this.tc, name, p1);
  }

  public StaticCallable getCallable(Class theClass, StaticCallable callable, String name, byte p1) {
    return getCallable(this.tc.getMetaClassFor(theClass), callable, name, p1);
  }

  public StaticCallable getCallable(MetaClass metaClass, StaticCallable callable, String name, byte p1) {
    if (callable.isStillValid(metaClass)) return callable;
    
    return getCallable(metaClass, name, p1);
  }

  public Object applyQuick(final Class theClass, final String name, final short p1) throws Throwable {
    return applyQuick(this.tc.getMetaClassFor(theClass), name, p1);
  }

  public Object applyQuick(final MetaClass metaClass, final String name, final short p1) throws Throwable {
    return applyQuick(metaClass, getCallable(metaClass, name, p1), name, p1);
  }

  public Object applyQuick(Class theClass, StaticCallable callable, String name, short p1) throws Throwable {
    return applyQuick(this.tc.getMetaClassFor(theClass), callable, name, p1);
  }

  public Object applyQuick(MetaClass metaClass, StaticCallable callable, String name, short p1) throws Throwable {
  final Object result = callable.doStaticCallQuick(this.tc, p1);

    if (result == ExtendedThreadContext.NOT_PERFORMED) {
      throw new NgRuntimeException("Cannot call the static method " + name + " on the class " + metaClass.getTheClass().getName());
    } else {
      return result;
    }
  }

  public StaticCallable getCallable(Class theClass, String name, short p1) {
    return getCallable(this.tc.getMetaClassFor(theClass), name, p1);
  }

  public StaticCallable getCallable(MetaClass metaClass, String name, short p1) {
    return metaClass.staticMethodCall(this).doGetCallable(this.tc, name, p1);
  }

  public StaticCallable getCallable(Class theClass, StaticCallable callable, String name, short p1) {
    return getCallable(this.tc.getMetaClassFor(theClass), callable, name, p1);
  }

  public StaticCallable getCallable(MetaClass metaClass, StaticCallable callable, String name, short p1) {
    if (callable.isStillValid(metaClass)) return callable;
    
    return getCallable(metaClass, name, p1);
  }

  public Object applyQuick(final Class theClass, final String name, final int p1) throws Throwable {
    return applyQuick(this.tc.getMetaClassFor(theClass), name, p1);
  }

  public Object applyQuick(final MetaClass metaClass, final String name, final int p1) throws Throwable {
    return applyQuick(metaClass, getCallable(metaClass, name, p1), name, p1);
  }

  public Object applyQuick(Class theClass, StaticCallable callable, String name, int p1) throws Throwable {
    return applyQuick(this.tc.getMetaClassFor(theClass), callable, name, p1);
  }

  public Object applyQuick(MetaClass metaClass, StaticCallable callable, String name, int p1) throws Throwable {
  final Object result = callable.doStaticCallQuick(this.tc, p1);

    if (result == ExtendedThreadContext.NOT_PERFORMED) {
      throw new NgRuntimeException("Cannot call the static method " + name + " on the class " + metaClass.getTheClass().getName());
    } else {
      return result;
    }
  }

  public StaticCallable getCallable(Class theClass, String name, int p1) {
    return getCallable(this.tc.getMetaClassFor(theClass), name, p1);
  }

  public StaticCallable getCallable(MetaClass metaClass, String name, int p1) {
    return metaClass.staticMethodCall(this).doGetCallable(this.tc, name, p1);
  }

  public StaticCallable getCallable(Class theClass, StaticCallable callable, String name, int p1) {
    return getCallable(this.tc.getMetaClassFor(theClass), callable, name, p1);
  }

  public StaticCallable getCallable(MetaClass metaClass, StaticCallable callable, String name, int p1) {
    if (callable.isStillValid(metaClass)) return callable;
    
    return getCallable(metaClass, name, p1);
  }

  public Object applyQuick(final Class theClass, final String name, final long p1) throws Throwable {
    return applyQuick(this.tc.getMetaClassFor(theClass), name, p1);
  }

  public Object applyQuick(final MetaClass metaClass, final String name, final long p1) throws Throwable {
    return applyQuick(metaClass, getCallable(metaClass, name, p1), name, p1);
  }

  public Object applyQuick(Class theClass, StaticCallable callable, String name, long p1) throws Throwable {
    return applyQuick(this.tc.getMetaClassFor(theClass), callable, name, p1);
  }

  public Object applyQuick(MetaClass metaClass, StaticCallable callable, String name, long p1) throws Throwable {
  final Object result = callable.doStaticCallQuick(this.tc, p1);

    if (result == ExtendedThreadContext.NOT_PERFORMED) {
      throw new NgRuntimeException("Cannot call the static method " + name + " on the class " + metaClass.getTheClass().getName());
    } else {
      return result;
    }
  }

  public StaticCallable getCallable(Class theClass, String name, long p1) {
    return getCallable(this.tc.getMetaClassFor(theClass), name, p1);
  }

  public StaticCallable getCallable(MetaClass metaClass, String name, long p1) {
    return metaClass.staticMethodCall(this).doGetCallable(this.tc, name, p1);
  }

  public StaticCallable getCallable(Class theClass, StaticCallable callable, String name, long p1) {
    return getCallable(this.tc.getMetaClassFor(theClass), callable, name, p1);
  }

  public StaticCallable getCallable(MetaClass metaClass, StaticCallable callable, String name, long p1) {
    if (callable.isStillValid(metaClass)) return callable;
    
    return getCallable(metaClass, name, p1);
  }

  public Object applyQuick(final Class theClass, final String name, final float p1) throws Throwable {
    return applyQuick(this.tc.getMetaClassFor(theClass), name, p1);
  }

  public Object applyQuick(final MetaClass metaClass, final String name, final float p1) throws Throwable {
    return applyQuick(metaClass, getCallable(metaClass, name, p1), name, p1);
  }

  public Object applyQuick(Class theClass, StaticCallable callable, String name, float p1) throws Throwable {
    return applyQuick(this.tc.getMetaClassFor(theClass), callable, name, p1);
  }

  public Object applyQuick(MetaClass metaClass, StaticCallable callable, String name, float p1) throws Throwable {
  final Object result = callable.doStaticCallQuick(this.tc, p1);

    if (result == ExtendedThreadContext.NOT_PERFORMED) {
      throw new NgRuntimeException("Cannot call the static method " + name + " on the class " + metaClass.getTheClass().getName());
    } else {
      return result;
    }
  }

  public StaticCallable getCallable(Class theClass, String name, float p1) {
    return getCallable(this.tc.getMetaClassFor(theClass), name, p1);
  }

  public StaticCallable getCallable(MetaClass metaClass, String name, float p1) {
    return metaClass.staticMethodCall(this).doGetCallable(this.tc, name, p1);
  }

  public StaticCallable getCallable(Class theClass, StaticCallable callable, String name, float p1) {
    return getCallable(this.tc.getMetaClassFor(theClass), callable, name, p1);
  }

  public StaticCallable getCallable(MetaClass metaClass, StaticCallable callable, String name, float p1) {
    if (callable.isStillValid(metaClass)) return callable;
    
    return getCallable(metaClass, name, p1);
  }

  public Object applyQuick(final Class theClass, final String name, final double p1) throws Throwable {
    return applyQuick(this.tc.getMetaClassFor(theClass), name, p1);
  }

  public Object applyQuick(final MetaClass metaClass, final String name, final double p1) throws Throwable {
    return applyQuick(metaClass, getCallable(metaClass, name, p1), name, p1);
  }

  public Object applyQuick(Class theClass, StaticCallable callable, String name, double p1) throws Throwable {
    return applyQuick(this.tc.getMetaClassFor(theClass), callable, name, p1);
  }

  public Object applyQuick(MetaClass metaClass, StaticCallable callable, String name, double p1) throws Throwable {
  final Object result = callable.doStaticCallQuick(this.tc, p1);

    if (result == ExtendedThreadContext.NOT_PERFORMED) {
      throw new NgRuntimeException("Cannot call the static method " + name + " on the class " + metaClass.getTheClass().getName());
    } else {
      return result;
    }
  }

  public StaticCallable getCallable(Class theClass, String name, double p1) {
    return getCallable(this.tc.getMetaClassFor(theClass), name, p1);
  }

  public StaticCallable getCallable(MetaClass metaClass, String name, double p1) {
    return metaClass.staticMethodCall(this).doGetCallable(this.tc, name, p1);
  }

  public StaticCallable getCallable(Class theClass, StaticCallable callable, String name, double p1) {
    return getCallable(this.tc.getMetaClassFor(theClass), callable, name, p1);
  }

  public StaticCallable getCallable(MetaClass metaClass, StaticCallable callable, String name, double p1) {
    if (callable.isStillValid(metaClass)) return callable;
    
    return getCallable(metaClass, name, p1);
  }

  public Object applyQuick(final Class theClass, final String name, final BigInteger p1) throws Throwable {
    return applyQuick(this.tc.getMetaClassFor(theClass), name, p1);
  }

  public Object applyQuick(final MetaClass metaClass, final String name, final BigInteger p1) throws Throwable {
    return applyQuick(metaClass, getCallable(metaClass, name, p1), name, p1);
  }

  public Object applyQuick(Class theClass, StaticCallable callable, String name, BigInteger p1) throws Throwable {
    return applyQuick(this.tc.getMetaClassFor(theClass), callable, name, p1);
  }

  public Object applyQuick(MetaClass metaClass, StaticCallable callable, String name, BigInteger p1) throws Throwable {
  final Object result = callable.doStaticCallQuick(this.tc, p1);

    if (result == ExtendedThreadContext.NOT_PERFORMED) {
      throw new NgRuntimeException("Cannot call the static method " + name + " on the class " + metaClass.getTheClass().getName());
    } else {
      return result;
    }
  }

  public StaticCallable getCallable(Class theClass, String name, BigInteger p1) {
    return getCallable(this.tc.getMetaClassFor(theClass), name, p1);
  }

  public StaticCallable getCallable(MetaClass metaClass, String name, BigInteger p1) {
    return metaClass.staticMethodCall(this).doGetCallable(this.tc, name, p1);
 }

  public StaticCallable getCallable(Class theClass, StaticCallable callable, String name, BigInteger p1) {
    return getCallable(this.tc.getMetaClassFor(theClass), callable, name, p1);
  }

  public StaticCallable getCallable(MetaClass metaClass, StaticCallable callable, String name, BigInteger p1) {
    if (callable.isStillValid(metaClass)) return callable;
    
    return getCallable(metaClass, name, p1);
  }

  public Object applyQuick(final Class theClass, final String name, final BigDecimal p1) throws Throwable {
    return applyQuick(this.tc.getMetaClassFor(theClass), name, p1);
  }

  public Object applyQuick(final MetaClass metaClass, final String name, final BigDecimal p1) throws Throwable {
    return applyQuick(metaClass, getCallable(metaClass, name, p1), name, p1);
  }

  public Object applyQuick(Class theClass, StaticCallable callable, String name, BigDecimal p1) throws Throwable {
    return applyQuick(this.tc.getMetaClassFor(theClass), callable, name, p1);
  }

  public Object applyQuick(MetaClass metaClass, StaticCallable callable, String name, BigDecimal p1) throws Throwable {
  final Object result = callable.doStaticCallQuick(this.tc, p1);

    if (result == ExtendedThreadContext.NOT_PERFORMED) {
      throw new NgRuntimeException("Cannot call the static method " + name + " on the class " + metaClass.getTheClass().getName());
    } else {
      return result;
    }
  }

  public StaticCallable getCallable(Class theClass, String name, BigDecimal p1) {
    return getCallable(this.tc.getMetaClassFor(theClass), name, p1);
  }

  public StaticCallable getCallable(MetaClass metaClass, String name, BigDecimal p1) {
    return metaClass.staticMethodCall(this).doGetCallable(this.tc, name, p1);
  }

  public StaticCallable getCallable(Class theClass, StaticCallable callable, String name, BigDecimal p1) {
    return getCallable(this.tc.getMetaClassFor(theClass), callable, name, p1);
  }

  public StaticCallable getCallable(MetaClass metaClass, StaticCallable callable, String name, BigDecimal p1) {
    if (callable.isStillValid(metaClass)) return callable;
    
    return getCallable(metaClass, name, p1);
  }

  public Object applyQuick(final Class theClass, final String name, final String p1) throws Throwable {
    return applyQuick(this.tc.getMetaClassFor(theClass), name, p1);
  }

  public Object applyQuick(final MetaClass metaClass, final String name, final String p1) throws Throwable {
    return applyQuick(metaClass, getCallable(metaClass, name, p1), name, p1);
  }

  public Object applyQuick(Class theClass, StaticCallable callable, String name, String p1) throws Throwable {
    return applyQuick(this.tc.getMetaClassFor(theClass), callable, name, p1);
  }

  public Object applyQuick(MetaClass metaClass, StaticCallable callable, String name, String p1) throws Throwable {
  final Object result = callable.doStaticCallQuick(this.tc, p1);

    if (result == ExtendedThreadContext.NOT_PERFORMED) {
      throw new NgRuntimeException("Cannot call the static method " + name + " on the class " + metaClass.getTheClass().getName());
    } else {
      return result;
    }
  }

  public StaticCallable getCallable(Class theClass, String name, String p1) {
    return getCallable(this.tc.getMetaClassFor(theClass), name, p1);
  }

  public StaticCallable getCallable(MetaClass metaClass, String name, String p1) {
    return metaClass.staticMethodCall(this).doGetCallable(this.tc, name, p1);
  }

  public StaticCallable getCallable(Class theClass, StaticCallable callable, String name, String p1) {
    return getCallable(this.tc.getMetaClassFor(theClass), callable, name, p1);
  }

  public StaticCallable getCallable(MetaClass metaClass, StaticCallable callable, String name, String p1) {
    if (callable.isStillValid(metaClass)) return callable;
    
    return getCallable(metaClass, name, p1);
  }

  public Object applyQuick(final Class theClass, final String name, final Object p1, Object p2) throws Throwable {
    return applyQuick(this.tc.getMetaClassFor(theClass), name, p1, p2);
  }

  public Object applyQuick(final MetaClass metaClass, final String name, final Object p1, Object p2) throws Throwable {
    return applyQuick(metaClass, getCallable(metaClass, name, p1), name, p1, p2);
  }

  public Object applyQuick(Class theClass, StaticCallable callable, String name, Object p1, Object p2) throws Throwable {
    return applyQuick(this.tc.getMetaClassFor(theClass), callable, name, p1, p2);
  }

  public Object applyQuick(MetaClass metaClass, StaticCallable callable, String name, Object p1, Object p2) throws Throwable {
  final Object result = callable.doStaticCallQuick(this.tc, p1, p2);

    if (result == ExtendedThreadContext.NOT_PERFORMED) {
      throw new NgRuntimeException("Cannot call the static method " + name + " on the class " + metaClass.getTheClass().getName());
    } else {
      return result;
    }
  }

  public StaticCallable getCallable(Class theClass, String name, Object p1, Object p2) {
    return getCallable(this.tc.getMetaClassFor(theClass), name, p1, p2);
  }

  public StaticCallable getCallable(MetaClass metaClass, String name, Object p1, Object p2) {
    return getCallable(metaClass, name, p1, tc.getMetaClassFor(p1), p2, tc.getMetaClassFor(p2));
  }

  public StaticCallable getCallable(MetaClass metaClass, String name, Object p1, MetaClass m1, Object p2, MetaClass m2) {
    return metaClass.staticMethodCall(this).doGetCallable(this.tc, name, p1, m1, p2, m2);
  }

  public StaticCallable getCallable(Class theClass, StaticCallable callable, String name, Object p1, Object p2) {
    return getCallable(this.tc.getMetaClassFor(theClass), callable, name, p1, p2);
  }

  public StaticCallable getCallable(MetaClass metaClass, StaticCallable callable, String name, Object p1, Object p2) {
    return getCallable(metaClass, name, p1, tc.getMetaClassFor(p1), p2, tc.getMetaClassFor(p2));
  }

  public StaticCallable getCallable(MetaClass metaClass, StaticCallable callable, String name, Object p1, MetaClass m1, Object p2, MetaClass m2) {
    if (callable.isStillValid(metaClass)) return callable;
    
    return getCallable(metaClass, name, p1, m1, p2, m2);
  }

  public Object applyQuick(final Class theClass, final String name, final Object p1, Object p2, Object p3) throws Throwable {
    return applyQuick(this.tc.getMetaClassFor(theClass), name, p1, p2, p3);
  }

  public Object applyQuick(final MetaClass metaClass, final String name, final Object p1, Object p2, Object p3) throws Throwable {
    return applyQuick(metaClass, getCallable(metaClass, name, p1), name, p1, p2, p3);
  }

  public Object applyQuick(Class theClass, StaticCallable callable, String name, Object p1, Object p2, Object p3) throws Throwable {
    return applyQuick(this.tc.getMetaClassFor(theClass), callable, name, p1, p2, p3);
  }

  public Object applyQuick(MetaClass metaClass, StaticCallable callable, String name, Object p1, Object p2, Object p3) throws Throwable {
  final Object result = callable.doStaticCallQuick(this.tc, p1, p2, p3);

    if (result == ExtendedThreadContext.NOT_PERFORMED) {
      throw new NgRuntimeException("Cannot call the static method " + name + " on the class " + metaClass.getTheClass().getName());
    } else {
      return result;
    }
  }

  public StaticCallable getCallable(Class theClass, String name, Object p1, Object p2, Object p3) {
    return getCallable(this.tc.getMetaClassFor(theClass), name, p1, p2, p3);
  }

  public StaticCallable getCallable(MetaClass metaClass, String name, Object p1, Object p2, Object p3) {
    return getCallable(metaClass, name, p1, tc.getMetaClassFor(p1), p2, tc.getMetaClassFor(p2), p3, tc.getMetaClassFor(p3));
  }

  public StaticCallable getCallable(MetaClass metaClass, String name, Object p1, MetaClass m1, Object p2, MetaClass m2, Object p3, MetaClass m3) {
    return metaClass.staticMethodCall(this).doGetCallable(this.tc, name, p1, m1, p2, m2, p3, m3);
  }

  public StaticCallable getCallable(Class theClass, StaticCallable callable, String name, Object p1, Object p2, Object p3) {
    return getCallable(this.tc.getMetaClassFor(theClass), callable, name, p1, p2, p3);
  }

  public StaticCallable getCallable(MetaClass metaClass, StaticCallable callable, String name, Object p1, Object p2, Object p3) {
    return getCallable(metaClass, name, p1, tc.getMetaClassFor(p1), p2, tc.getMetaClassFor(p2), p3, tc.getMetaClassFor(p3));
  }

  public StaticCallable getCallable(MetaClass metaClass, StaticCallable callable, String name, Object p1, MetaClass m1, Object p2, MetaClass m2, Object p3, MetaClass m3) {
    if (callable.isStillValid(metaClass)) return callable;
    
    return getCallable(metaClass, name, p1, m1, p2, m2, p3, m3);
  }

  public Object applyQuick(final Class theClass, final String name, final Object p1, Object p2, Object p3, Object p4) throws Throwable {
    return applyQuick(this.tc.getMetaClassFor(theClass), name, p1, p2, p3, p4);
  }

  public Object applyQuick(final MetaClass metaClass, final String name, final Object p1, Object p2, Object p3, Object p4) throws Throwable {
    return applyQuick(metaClass, getCallable(metaClass, name, p1), name, p1, p2, p3, p4);
  }

  public Object applyQuick(Class theClass, StaticCallable callable, String name, Object p1, Object p2, Object p3, Object p4) throws Throwable {
    return applyQuick(this.tc.getMetaClassFor(theClass), callable, name, p1, p2, p3, p4);
  }

  public Object applyQuick(MetaClass metaClass, StaticCallable callable, String name, Object p1, Object p2, Object p3, Object p4) throws Throwable {
  final Object result = callable.doStaticCallQuick(this.tc, p1, p2, p3, p4);

    if (result == ExtendedThreadContext.NOT_PERFORMED) {
      throw new NgRuntimeException("Cannot call the static method " + name + " on the class " + metaClass.getTheClass().getName());
    } else {
      return result;
    }
  }

  public StaticCallable getCallable(Class theClass, String name, Object p1, Object p2, Object p3, Object p4) {
    return getCallable(this.tc.getMetaClassFor(theClass), name, p1, p2, p3, p4);
  }

  public StaticCallable getCallable(MetaClass metaClass, String name, Object p1, Object p2, Object p3, Object p4) {
    return getCallable(metaClass, name, p1, tc.getMetaClassFor(p1), p2, tc.getMetaClassFor(p2), p3, tc.getMetaClassFor(p3), p4, tc.getMetaClassFor(p4));
  }

  public StaticCallable getCallable(MetaClass metaClass, String name, Object p1, MetaClass m1, Object p2, MetaClass m2, Object p3, MetaClass m3, Object p4, MetaClass m4) {
    return metaClass.staticMethodCall(this).doGetCallable(this.tc, name, p1, m1, p2, m2, p3, m3, p4, m4);
  }

  public StaticCallable getCallable(Class theClass, StaticCallable callable, String name, Object p1, Object p2, Object p3, Object p4) {
    return getCallable(this.tc.getMetaClassFor(theClass), callable, name, p1, p2, p3, p4);
  }

  public StaticCallable getCallable(MetaClass metaClass, StaticCallable callable, String name, Object p1, Object p2, Object p3, Object p4) {
    return getCallable(metaClass, name, p1, tc.getMetaClassFor(p1), p2, tc.getMetaClassFor(p2), p3, tc.getMetaClassFor(p3), p4, tc.getMetaClassFor(p4));
  }

  public StaticCallable getCallable(MetaClass metaClass, StaticCallable callable, String name, Object p1, MetaClass m1, Object p2, MetaClass m2, Object p3, MetaClass m3, Object p4, MetaClass m4) {
    if (callable.isStillValid(metaClass)) return callable;
    
    return getCallable(metaClass, name, p1, m1, p2, m2, p3, m3, p4, m4);
  }
}
