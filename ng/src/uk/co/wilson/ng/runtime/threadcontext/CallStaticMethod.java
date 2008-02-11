package uk.co.wilson.ng.runtime.threadcontext;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Map;
import java.util.Stack;

import ng.lang.NgRuntimeException;
import ng.runtime.metaclass.DoStaticMethodCall;
import ng.runtime.metaclass.MetaClass;
import ng.runtime.threadcontext.StaticMethodCall;
import ng.runtime.threadcontext.ThreadContext;

/**
 * @author John
 *
 */
public class CallStaticMethod implements StaticMethodCall {
  private Map<MetaClass, DoStaticMethodCall> categoryStaticMethodCallMap = null;

  private final Stack<Map<MetaClass, DoStaticMethodCall>> categoryStaticMethodCallMapStack = new Stack<Map<MetaClass, DoStaticMethodCall>>();

  private final ThreadContext tc;

  public Map<MetaClass, DoStaticMethodCall> getCategoryStaticMethodCallMap() {
    return this.categoryStaticMethodCallMap;
  }

  public void setCategoryStaticMethodCallMap(final Map<MetaClass, DoStaticMethodCall> categoryStaticMethodCallMap) {
    this.categoryStaticMethodCallMap = categoryStaticMethodCallMap;
  }

  public CallStaticMethod(final ThreadContext tc) {
    this.tc = tc;
  }

  /* (non-JavaDoc)
   * @see ng.runtime.threadcontext.StaticMethodCall#apply(java.lang.Class, java.lang.String, java.lang.Object[])
   */
  public Object apply(final Class theClass, final String name, final Object[] params) {
    return apply(this.tc.getMetaClassFor(theClass), name, params);
  }

  /* (non-JavaDoc)
   * @see ng.runtime.threadcontext.StaticMethodCall#apply(ng.runtime.metaclass.MetaClass, java.lang.String, java.lang.Object[])
   */
  public Object apply(final MetaClass metaclass, final String name, final Object[] params) {
    final Object result = metaclass.staticMethodCall(this).doApply(this.tc, name, params);

    if (result == ThreadContext.NOT_PERFORMED) {
      throw new NgRuntimeException("Cannot call the static method " + name + " on the class " + metaclass.getTheClass().getName());
    } else {
      return result;
    }
  }

  /* (non-JavaDoc)
   * @see ng.runtime.threadcontext.StaticMethodCall#applyQuick(java.lang.Class, java.lang.String)
   */
  public Object applyQuick(final Class theClass, final String name) {
    return applyQuick(this.tc.getMetaClassFor(theClass), name);
  }

  /* (non-JavaDoc)
   * @see ng.runtime.threadcontext.StaticMethodCall#applyQuick(ng.runtime.metaclass.MetaClass, java.lang.String)
   */
  public Object applyQuick(final MetaClass metaclass, final String name) {
    final Object result = metaclass.staticMethodCall(this).doApplyQuick(this.tc, name);

    if (result == ThreadContext.NOT_PERFORMED) {
      throw new NgRuntimeException("Cannot call the static method " + name + " on the class " + metaclass.getTheClass().getName());
    } else {
      return result;
    }
  }

  /* (non-JavaDoc)
   * @see ng.runtime.threadcontext.StaticMethodCall#applyQuick(java.lang.Class, java.lang.String, java.lang.Object)
   */
  public Object applyQuick(final Class theClass, final String name, final Object p1) {
    return applyQuick(this.tc.getMetaClassFor(theClass), name, p1);
  }

  /* (non-JavaDoc)
   * @see ng.runtime.threadcontext.StaticMethodCall#applyQuick(ng.runtime.metaclass.MetaClass, java.lang.String, java.lang.Object)
   */
  public Object applyQuick(final MetaClass metaclass, final String name, final Object p1) {
    final Object result = metaclass.staticMethodCall(this).doApplyQuick(this.tc, name, p1);

    if (result == ThreadContext.NOT_PERFORMED) {
      throw new NgRuntimeException("Cannot call the static method " + name + " on the class " + metaclass.getTheClass().getName());
    } else {
      return result;
    }
  }

  /* (non-JavaDoc)
   * @see ng.runtime.threadcontext.StaticMethodCall#applyQuick(java.lang.Class, java.lang.String, java.lang.Object, java.lang.Object)
   */
  public Object applyQuick(final Class theClass, final String name, final Object p1, final Object p2) {
    return applyQuick(this.tc.getMetaClassFor(theClass), name, p1, p2);
  }

  /* (non-JavaDoc)
   * @see ng.runtime.threadcontext.StaticMethodCall#applyQuick(ng.runtime.metaclass.MetaClass, java.lang.String, java.lang.Object, java.lang.Object)
   */
  public Object applyQuick(final MetaClass metaclass, final String name, final Object p1, final Object p2) {
    final Object result = metaclass.staticMethodCall(this).doApplyQuick(this.tc, name, p1, p2);

    if (result == ThreadContext.NOT_PERFORMED) {
      throw new NgRuntimeException("Cannot call the static method " + name + " on the class " + metaclass.getTheClass().getName());
    } else {
      return result;
    }
  }

  /* (non-JavaDoc)
   * @see ng.runtime.threadcontext.StaticMethodCall#applyQuick(java.lang.Class, java.lang.String, java.lang.Object, java.lang.Object, java.lang.Object)
   */
  public Object applyQuick(final Class theClass, final String name, final Object p1, final Object p2, final Object p3) {
    return applyQuick(this.tc.getMetaClassFor(theClass), name, p1, p2, p3);
  }

  /* (non-JavaDoc)
   * @see ng.runtime.threadcontext.StaticMethodCall#applyQuick(ng.runtime.metaclass.MetaClass, java.lang.String, java.lang.Object, java.lang.Object, java.lang.Object)
   */
  public Object applyQuick(final MetaClass metaclass, final String name, final Object p1, final Object p2, final Object p3) {
    final Object result = metaclass.staticMethodCall(this).doApplyQuick(this.tc, name, p1, p2, p3);

    if (result == ThreadContext.NOT_PERFORMED) {
      throw new NgRuntimeException("Cannot call the static method " + name + " on the class " + metaclass.getTheClass().getName());
    } else {
      return result;
    }
  }

  /* (non-JavaDoc)
   * @see ng.runtime.threadcontext.StaticMethodCall#applyQuick(java.lang.Class, java.lang.String, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object)
   */
  public Object applyQuick(final Class theClass, final String name, final Object p1, final Object p2, final Object p3, final Object p4) {
    return applyQuick(this.tc.getMetaClassFor(theClass), name, p1, p2, p3, p4);
  }

  /* (non-JavaDoc)
   * @see ng.runtime.threadcontext.StaticMethodCall#applyQuick(ng.runtime.metaclass.MetaClass, java.lang.String, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object)
   */
  public Object applyQuick(final MetaClass metaclass, final String name, final Object p1, final Object p2, final Object p3, final Object p4) {
    final Object result = metaclass.staticMethodCall(this).doApplyQuick(this.tc, name, p1, p2, p3, p4);

    if (result == ThreadContext.NOT_PERFORMED) {
      throw new NgRuntimeException("Cannot call the static method " + name + " on the class " + metaclass.getTheClass().getName());
    } else {
      return result;
    }
  }

  /* (non-JavaDoc)
   * @see ng.runtime.threadcontext.StaticMethodCall#applyQuick(java.lang.Class, java.lang.String, boolean)
   */
  public Object applyQuick(final Class theClass, final String name, final boolean p1) {
    return applyQuick(this.tc.getMetaClassFor(theClass), name, p1);
  }

  /* (non-JavaDoc)
   * @see ng.runtime.threadcontext.StaticMethodCall#applyQuick(ng.runtime.metaclass.MetaClass, java.lang.String, boolean)
   */
  public Object applyQuick(final MetaClass metaclass, final String name, final boolean p1) {
    final Object result = metaclass.staticMethodCall(this).doApplyQuick(this.tc, name, p1);

    if (result == ThreadContext.NOT_PERFORMED) {
      throw new NgRuntimeException("Cannot call the static method " + name + " on the class " + metaclass.getTheClass().getName());
    } else {
      return result;
    }
  }

  /* (non-JavaDoc)
   * @see ng.runtime.threadcontext.StaticMethodCall#applyQuick(java.lang.Class, java.lang.String, char)
   */
  public Object applyQuick(final Class theClass, final String name, final char p1) {
    return applyQuick(this.tc.getMetaClassFor(theClass), name, p1);
  }

  /* (non-JavaDoc)
   * @see ng.runtime.threadcontext.StaticMethodCall#applyQuick(ng.runtime.metaclass.MetaClass, java.lang.String, char)
   */
  public Object applyQuick(final MetaClass metaclass, final String name, final char p1) {
    final Object result = metaclass.staticMethodCall(this).doApplyQuick(this.tc, name, p1);

    if (result == ThreadContext.NOT_PERFORMED) {
      throw new NgRuntimeException("Cannot call the static method " + name + " on the class " + metaclass.getTheClass().getName());
    } else {
      return result;
    }
  }

  /* (non-JavaDoc)
   * @see ng.runtime.threadcontext.StaticMethodCall#applyQuick(java.lang.Class, java.lang.String, byte)
   */
  public Object applyQuick(final Class theClass, final String name, final byte p1) {
    return applyQuick(this.tc.getMetaClassFor(theClass), name, p1);
  }

  /* (non-JavaDoc)
   * @see ng.runtime.threadcontext.StaticMethodCall#applyQuick(ng.runtime.metaclass.MetaClass, java.lang.String, byte)
   */
  public Object applyQuick(final MetaClass metaclass, final String name, final byte p1) {
    final Object result = metaclass.staticMethodCall(this).doApplyQuick(this.tc, name, p1);

    if (result == ThreadContext.NOT_PERFORMED) {
      throw new NgRuntimeException("Cannot call the static method " + name + " on the class " + metaclass.getTheClass().getName());
    } else {
      return result;
    }
  }

  /* (non-JavaDoc)
   * @see ng.runtime.threadcontext.StaticMethodCall#applyQuick(java.lang.Class, java.lang.String, short)
   */
  public Object applyQuick(final Class theClass, final String name, final short p1) {
    return applyQuick(this.tc.getMetaClassFor(theClass), name, p1);
  }

  /* (non-JavaDoc)
   * @see ng.runtime.threadcontext.StaticMethodCall#applyQuick(ng.runtime.metaclass.MetaClass, java.lang.String, short)
   */
  public Object applyQuick(final MetaClass metaclass, final String name, final short p1) {
    final Object result = metaclass.staticMethodCall(this).doApplyQuick(this.tc, name, p1);

    if (result == ThreadContext.NOT_PERFORMED) {
      throw new NgRuntimeException("Cannot call the static method " + name + " on the class " + metaclass.getTheClass().getName());
    } else {
      return result;
    }
  }

  /* (non-JavaDoc)
   * @see ng.runtime.threadcontext.StaticMethodCall#applyQuick(java.lang.Class, java.lang.String, int)
   */
  public Object applyQuick(final Class theClass, final String name, final int p1) {
    return applyQuick(this.tc.getMetaClassFor(theClass), name, p1);
  }

  /* (non-JavaDoc)
   * @see ng.runtime.threadcontext.StaticMethodCall#applyQuick(ng.runtime.metaclass.MetaClass, java.lang.String, int)
   */
  public Object applyQuick(final MetaClass metaclass, final String name, final int p1) {
    final Object result = metaclass.staticMethodCall(this).doApplyQuick(this.tc, name, p1);

    if (result == ThreadContext.NOT_PERFORMED) {
      throw new NgRuntimeException("Cannot call the static method " + name + " on the class " + metaclass.getTheClass().getName());
    } else {
      return result;
    }
  }

  /* (non-JavaDoc)
   * @see ng.runtime.threadcontext.StaticMethodCall#applyQuick(java.lang.Class, java.lang.String, long)
   */
  public Object applyQuick(final Class theClass, final String name, final long p1) {
    return applyQuick(this.tc.getMetaClassFor(theClass), name, p1);
  }

  /* (non-JavaDoc)
   * @see ng.runtime.threadcontext.StaticMethodCall#applyQuick(ng.runtime.metaclass.MetaClass, java.lang.String, long)
   */
  public Object applyQuick(final MetaClass metaclass, final String name, final long p1) {
    final Object result = metaclass.staticMethodCall(this).doApplyQuick(this.tc, name, p1);

    if (result == ThreadContext.NOT_PERFORMED) {
      throw new NgRuntimeException("Cannot call the static method " + name + " on the class " + metaclass.getTheClass().getName());
    } else {
      return result;
    }
  }

  /* (non-JavaDoc)
   * @see ng.runtime.threadcontext.StaticMethodCall#applyQuick(java.lang.Class, java.lang.String, float)
   */
  public Object applyQuick(final Class theClass, final String name, final float p1) {
    return applyQuick(this.tc.getMetaClassFor(theClass), name, p1);
  }

  /* (non-JavaDoc)
   * @see ng.runtime.threadcontext.StaticMethodCall#applyQuick(ng.runtime.metaclass.MetaClass, java.lang.String, float)
   */
  public Object applyQuick(final MetaClass metaclass, final String name, final float p1) {
    final Object result = metaclass.staticMethodCall(this).doApplyQuick(this.tc, name, p1);

    if (result == ThreadContext.NOT_PERFORMED) {
      throw new NgRuntimeException("Cannot call the static method " + name + " on the class " + metaclass.getTheClass().getName());
    } else {
      return result;
    }
  }

  /* (non-JavaDoc)
   * @see ng.runtime.threadcontext.StaticMethodCall#applyQuick(java.lang.Class, java.lang.String, double)
   */
  public Object applyQuick(final Class theClass, final String name, final double p1) {
    return applyQuick(this.tc.getMetaClassFor(theClass), name, p1);
  }

  /* (non-JavaDoc)
   * @see ng.runtime.threadcontext.StaticMethodCall#applyQuick(ng.runtime.metaclass.MetaClass, java.lang.String, double)
   */
  public Object applyQuick(final MetaClass metaclass, final String name, final double p1) {
    final Object result = metaclass.staticMethodCall(this).doApplyQuick(this.tc, name, p1);

    if (result == ThreadContext.NOT_PERFORMED) {
      throw new NgRuntimeException("Cannot call the static method " + name + " on the class " + metaclass.getTheClass().getName());
    } else {
      return result;
    }
  }

  /* (non-JavaDoc)
   * @see ng.runtime.threadcontext.StaticMethodCall#applyQuick(java.lang.Class, java.lang.String, java.math.BigInteger)
   */
  public Object applyQuick(final Class theClass, final String name, final BigInteger p1) {
    return applyQuick(this.tc.getMetaClassFor(theClass), name, p1);
  }

  /* (non-JavaDoc)
   * @see ng.runtime.threadcontext.StaticMethodCall#applyQuick(ng.runtime.metaclass.MetaClass, java.lang.String, java.math.BigInteger)
   */
  public Object applyQuick(final MetaClass metaclass, final String name, final BigInteger p1) {
    final Object result = metaclass.staticMethodCall(this).doApplyQuick(this.tc, name, p1);

    if (result == ThreadContext.NOT_PERFORMED) {
      throw new NgRuntimeException("Cannot call the static method " + name + " on the class " + metaclass.getTheClass().getName());
    } else {
      return result;
    }
  }

  /* (non-JavaDoc)
   * @see ng.runtime.threadcontext.StaticMethodCall#applyQuick(java.lang.Class, java.lang.String, java.math.BigDecimal)
   */
  public Object applyQuick(final Class theClass, final String name, final BigDecimal p1) {
    return applyQuick(this.tc.getMetaClassFor(theClass), name, p1);
  }

  /* (non-JavaDoc)
   * @see ng.runtime.threadcontext.StaticMethodCall#applyQuick(ng.runtime.metaclass.MetaClass, java.lang.String, java.math.BigDecimal)
   */
  public Object applyQuick(final MetaClass metaclass, final String name, final BigDecimal p1) {
    final Object result = metaclass.staticMethodCall(this).doApplyQuick(this.tc, name, p1);

    if (result == ThreadContext.NOT_PERFORMED) {
      throw new NgRuntimeException("Cannot call the static method " + name + " on the class " + metaclass.getTheClass().getName());
    } else {
      return result;
    }
  }

  /* (non-JavaDoc)
   * @see ng.runtime.threadcontext.StaticMethodCall#applyQuick(java.lang.Class, java.lang.String, java.lang.String)
   */
  public Object applyQuick(final Class theClass, final String name, final String p1) {
    return applyQuick(this.tc.getMetaClassFor(theClass), name, p1);
  }

  /* (non-JavaDoc)
   * @see ng.runtime.threadcontext.StaticMethodCall#applyQuick(ng.runtime.metaclass.MetaClass, java.lang.String, java.lang.String)
   */
  public Object applyQuick(final MetaClass metaclass, final String name, final String p1) {
    final Object result = metaclass.staticMethodCall(this).doApplyQuick(this.tc, name, p1);

    if (result == ThreadContext.NOT_PERFORMED) {
      throw new NgRuntimeException("Cannot call the static method " + name + " on the class " + metaclass.getTheClass().getName());
    } else {
      return result;
    }
  }
}
