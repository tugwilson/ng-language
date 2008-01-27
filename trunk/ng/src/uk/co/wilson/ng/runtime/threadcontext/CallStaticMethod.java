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
import uk.co.wilson.ng.runtime.threadcontext.util.HashMapWithDefaultValue;

/**
 * @author John
 *
 */
public class CallStaticMethod implements StaticMethodCall {
  private HashMapWithDefaultValue<MetaClass, DoStaticMethodCall> categoryStaticMethodCallMap = null;

  private Stack<Map<MetaClass, DoStaticMethodCall>> categoryStaticMethodCallMapStack = new Stack<Map<MetaClass, DoStaticMethodCall>>();

  private final ThreadContext tc;
  
  
  public CallStaticMethod(final ThreadContext tc) {
    this.tc = tc;
  }

  /* (non-JavaDoc)
   * @see ng.runtime.threadcontext.StaticMethodCall#apply(java.lang.Class, java.lang.String, java.lang.Object[])
   */
  public Object apply(Class theClass, String name, Object[] params) {
    return apply(tc.getMetaClassFor(theClass), name, params);
  }

  /* (non-JavaDoc)
   * @see ng.runtime.threadcontext.StaticMethodCall#apply(ng.runtime.metaclass.MetaClass, java.lang.String, java.lang.Object[])
   */
  public Object apply(MetaClass metaclass, String name, Object[] params) {
    final Object result;

    if (this.categoryStaticMethodCallMap != null) {
      result = this.categoryStaticMethodCallMap.get(metaclass, metaclass.staticMethodCall()).doApply(this.tc, name, params);
    } else {
      result = metaclass.staticMethodCall().doApply(this.tc, name, params);
    }

    if (result == ThreadContext.NOT_PERFORMED) {
      throw new NgRuntimeException("Cannot call the static method " + name + " on the class " + metaclass.getTheClass().getName());
    } else {
      return result;
    }
  }

  /* (non-JavaDoc)
   * @see ng.runtime.threadcontext.StaticMethodCall#applyQuick(java.lang.Class, java.lang.String)
   */
  public Object applyQuick(Class theClass, String name) {
    return applyQuick(tc.getMetaClassFor(theClass), name);
  }

  /* (non-JavaDoc)
   * @see ng.runtime.threadcontext.StaticMethodCall#applyQuick(ng.runtime.metaclass.MetaClass, java.lang.String)
   */
  public Object applyQuick(MetaClass metaclass, String name) {
    final Object result;

    if (this.categoryStaticMethodCallMap != null) {
      result = this.categoryStaticMethodCallMap.get(metaclass, metaclass.staticMethodCall()).doApplyQuick(this.tc, name);
    } else {
      result = metaclass.staticMethodCall().doApplyQuick(this.tc, name);
    }

    if (result == ThreadContext.NOT_PERFORMED) {
      throw new NgRuntimeException("Cannot call the static method " + name + " on the class " + metaclass.getTheClass().getName());
    } else {
      return result;
    }
  }

  /* (non-JavaDoc)
   * @see ng.runtime.threadcontext.StaticMethodCall#applyQuick(java.lang.Class, java.lang.String, java.lang.Object)
   */
  public Object applyQuick(Class theClass, String name, Object p1) {
    return applyQuick(tc.getMetaClassFor(theClass), name, p1);
  }

  /* (non-JavaDoc)
   * @see ng.runtime.threadcontext.StaticMethodCall#applyQuick(ng.runtime.metaclass.MetaClass, java.lang.String, java.lang.Object)
   */
  public Object applyQuick(MetaClass metaclass, String name, Object p1) {
    final Object result;

    if (this.categoryStaticMethodCallMap != null) {
      result = this.categoryStaticMethodCallMap.get(metaclass, metaclass.staticMethodCall()).doApplyQuick(this.tc, name, p1);
    } else {
      result = metaclass.staticMethodCall().doApplyQuick(this.tc, name, p1);
    }

    if (result == ThreadContext.NOT_PERFORMED) {
      throw new NgRuntimeException("Cannot call the static method " + name + " on the class " + metaclass.getTheClass().getName());
    } else {
      return result;
    }
  }

  /* (non-JavaDoc)
   * @see ng.runtime.threadcontext.StaticMethodCall#applyQuick(java.lang.Class, java.lang.String, java.lang.Object, java.lang.Object)
   */
  public Object applyQuick(Class theClass, String name, Object p1, Object p2) {
    return applyQuick(tc.getMetaClassFor(theClass), name, p1, p2);
  }

  /* (non-JavaDoc)
   * @see ng.runtime.threadcontext.StaticMethodCall#applyQuick(ng.runtime.metaclass.MetaClass, java.lang.String, java.lang.Object, java.lang.Object)
   */
  public Object applyQuick(MetaClass metaclass, String name, Object p1, Object p2) {
    final Object result;

    if (this.categoryStaticMethodCallMap != null) {
      result = this.categoryStaticMethodCallMap.get(metaclass, metaclass.staticMethodCall()).doApplyQuick(this.tc, name, p1, p2);
    } else {
      result = metaclass.staticMethodCall().doApplyQuick(this.tc, name, p1, p2);
    }

    if (result == ThreadContext.NOT_PERFORMED) {
      throw new NgRuntimeException("Cannot call the static method " + name + " on the class " + metaclass.getTheClass().getName());
    } else {
      return result;
    }
  }

  /* (non-JavaDoc)
   * @see ng.runtime.threadcontext.StaticMethodCall#applyQuick(java.lang.Class, java.lang.String, java.lang.Object, java.lang.Object, java.lang.Object)
   */
  public Object applyQuick(Class theClass, String name, Object p1, Object p2, Object p3) {
    return applyQuick(tc.getMetaClassFor(theClass), name, p1, p2, p3);
  }

  /* (non-JavaDoc)
   * @see ng.runtime.threadcontext.StaticMethodCall#applyQuick(ng.runtime.metaclass.MetaClass, java.lang.String, java.lang.Object, java.lang.Object, java.lang.Object)
   */
  public Object applyQuick(MetaClass metaclass, String name, Object p1, Object p2, Object p3) {
    final Object result;

    if (this.categoryStaticMethodCallMap != null) {
      result = this.categoryStaticMethodCallMap.get(metaclass, metaclass.staticMethodCall()).doApplyQuick(this.tc, name, p1, p2, p3);
    } else {
      result = metaclass.staticMethodCall().doApplyQuick(this.tc, name, p1, p2, p3);
    }

    if (result == ThreadContext.NOT_PERFORMED) {
      throw new NgRuntimeException("Cannot call the static method " + name + " on the class " + metaclass.getTheClass().getName());
    } else {
      return result;
    }
  }

  /* (non-JavaDoc)
   * @see ng.runtime.threadcontext.StaticMethodCall#applyQuick(java.lang.Class, java.lang.String, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object)
   */
  public Object applyQuick(Class theClass, String name, Object p1, Object p2, Object p3, Object p4) {
    return applyQuick(tc.getMetaClassFor(theClass), name, p1, p2, p3, p4);
  }

  /* (non-JavaDoc)
   * @see ng.runtime.threadcontext.StaticMethodCall#applyQuick(ng.runtime.metaclass.MetaClass, java.lang.String, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object)
   */
  public Object applyQuick(MetaClass metaclass, String name, Object p1, Object p2, Object p3, Object p4) {
    final Object result;

    if (this.categoryStaticMethodCallMap != null) {
      result = this.categoryStaticMethodCallMap.get(metaclass, metaclass.staticMethodCall()).doApplyQuick(this.tc, name, p1, p2, p3, p4);
    } else {
      result = metaclass.staticMethodCall().doApplyQuick(this.tc, name, p1, p2, p3, p4);
    }

    if (result == ThreadContext.NOT_PERFORMED) {
      throw new NgRuntimeException("Cannot call the static method " + name + " on the class " + metaclass.getTheClass().getName());
    } else {
      return result;
    }
  }

  /* (non-JavaDoc)
   * @see ng.runtime.threadcontext.StaticMethodCall#applyQuick(java.lang.Class, java.lang.String, boolean)
   */
  public Object applyQuick(Class theClass, String name, boolean p1) {
    return applyQuick(tc.getMetaClassFor(theClass), name, p1);
  }

  /* (non-JavaDoc)
   * @see ng.runtime.threadcontext.StaticMethodCall#applyQuick(ng.runtime.metaclass.MetaClass, java.lang.String, boolean)
   */
  public Object applyQuick(MetaClass metaclass, String name, boolean p1) {
    final Object result;

    if (this.categoryStaticMethodCallMap != null) {
      result = this.categoryStaticMethodCallMap.get(metaclass, metaclass.staticMethodCall()).doApplyQuick(this.tc, name, p1);
    } else {
      result = metaclass.staticMethodCall().doApplyQuick(this.tc, name, p1);
    }

    if (result == ThreadContext.NOT_PERFORMED) {
      throw new NgRuntimeException("Cannot call the static method " + name + " on the class " + metaclass.getTheClass().getName());
    } else {
      return result;
    }
  }

  /* (non-JavaDoc)
   * @see ng.runtime.threadcontext.StaticMethodCall#applyQuick(java.lang.Class, java.lang.String, char)
   */
  public Object applyQuick(Class theClass, String name, char p1) {
    return applyQuick(tc.getMetaClassFor(theClass), name, p1);
  }

  /* (non-JavaDoc)
   * @see ng.runtime.threadcontext.StaticMethodCall#applyQuick(ng.runtime.metaclass.MetaClass, java.lang.String, char)
   */
  public Object applyQuick(MetaClass metaclass, String name, char p1) {
    final Object result;

    if (this.categoryStaticMethodCallMap != null) {
      result = this.categoryStaticMethodCallMap.get(metaclass, metaclass.staticMethodCall()).doApplyQuick(this.tc, name, p1);
    } else {
      result = metaclass.staticMethodCall().doApplyQuick(this.tc, name, p1);
    }

    if (result == ThreadContext.NOT_PERFORMED) {
      throw new NgRuntimeException("Cannot call the static method " + name + " on the class " + metaclass.getTheClass().getName());
    } else {
      return result;
    }
  }

  /* (non-JavaDoc)
   * @see ng.runtime.threadcontext.StaticMethodCall#applyQuick(java.lang.Class, java.lang.String, byte)
   */
  public Object applyQuick(Class theClass, String name, byte p1) {
    return applyQuick(tc.getMetaClassFor(theClass), name, p1);
  }

  /* (non-JavaDoc)
   * @see ng.runtime.threadcontext.StaticMethodCall#applyQuick(ng.runtime.metaclass.MetaClass, java.lang.String, byte)
   */
  public Object applyQuick(MetaClass metaclass, String name, byte p1) {
    final Object result;

    if (this.categoryStaticMethodCallMap != null) {
      result = this.categoryStaticMethodCallMap.get(metaclass, metaclass.staticMethodCall()).doApplyQuick(this.tc, name, p1);
    } else {
      result = metaclass.staticMethodCall().doApplyQuick(this.tc, name, p1);
    }

    if (result == ThreadContext.NOT_PERFORMED) {
      throw new NgRuntimeException("Cannot call the static method " + name + " on the class " + metaclass.getTheClass().getName());
    } else {
      return result;
    }
  }

  /* (non-JavaDoc)
   * @see ng.runtime.threadcontext.StaticMethodCall#applyQuick(java.lang.Class, java.lang.String, short)
   */
  public Object applyQuick(Class theClass, String name, short p1) {
    return applyQuick(tc.getMetaClassFor(theClass), name, p1);
  }

  /* (non-JavaDoc)
   * @see ng.runtime.threadcontext.StaticMethodCall#applyQuick(ng.runtime.metaclass.MetaClass, java.lang.String, short)
   */
  public Object applyQuick(MetaClass metaclass, String name, short p1) {
    final Object result;

    if (this.categoryStaticMethodCallMap != null) {
      result = this.categoryStaticMethodCallMap.get(metaclass, metaclass.staticMethodCall()).doApplyQuick(this.tc, name, p1);
    } else {
      result = metaclass.staticMethodCall().doApplyQuick(this.tc, name, p1);
    }

    if (result == ThreadContext.NOT_PERFORMED) {
      throw new NgRuntimeException("Cannot call the static method " + name + " on the class " + metaclass.getTheClass().getName());
    } else {
      return result;
    }
  }

  /* (non-JavaDoc)
   * @see ng.runtime.threadcontext.StaticMethodCall#applyQuick(java.lang.Class, java.lang.String, int)
   */
  public Object applyQuick(Class theClass, String name, int p1) {
    return applyQuick(tc.getMetaClassFor(theClass), name, p1);
  }

  /* (non-JavaDoc)
   * @see ng.runtime.threadcontext.StaticMethodCall#applyQuick(ng.runtime.metaclass.MetaClass, java.lang.String, int)
   */
  public Object applyQuick(MetaClass metaclass, String name, int p1) {
    final Object result;

    if (this.categoryStaticMethodCallMap != null) {
      result = this.categoryStaticMethodCallMap.get(metaclass, metaclass.staticMethodCall()).doApplyQuick(this.tc, name, p1);
    } else {
      result = metaclass.staticMethodCall().doApplyQuick(this.tc, name, p1);
    }

    if (result == ThreadContext.NOT_PERFORMED) {
      throw new NgRuntimeException("Cannot call the static method " + name + " on the class " + metaclass.getTheClass().getName());
    } else {
      return result;
    }
  }

  /* (non-JavaDoc)
   * @see ng.runtime.threadcontext.StaticMethodCall#applyQuick(java.lang.Class, java.lang.String, long)
   */
  public Object applyQuick(Class theClass, String name, long p1) {
    return applyQuick(tc.getMetaClassFor(theClass), name, p1);
  }

  /* (non-JavaDoc)
   * @see ng.runtime.threadcontext.StaticMethodCall#applyQuick(ng.runtime.metaclass.MetaClass, java.lang.String, long)
   */
  public Object applyQuick(MetaClass metaclass, String name, long p1) {
    final Object result;

    if (this.categoryStaticMethodCallMap != null) {
      result = this.categoryStaticMethodCallMap.get(metaclass, metaclass.staticMethodCall()).doApplyQuick(this.tc, name, p1);
    } else {
      result = metaclass.staticMethodCall().doApplyQuick(this.tc, name, p1);
    }

    if (result == ThreadContext.NOT_PERFORMED) {
      throw new NgRuntimeException("Cannot call the static method " + name + " on the class " + metaclass.getTheClass().getName());
    } else {
      return result;
    }
  }

  /* (non-JavaDoc)
   * @see ng.runtime.threadcontext.StaticMethodCall#applyQuick(java.lang.Class, java.lang.String, float)
   */
  public Object applyQuick(Class theClass, String name, float p1) {
    return applyQuick(tc.getMetaClassFor(theClass), name, p1);
  }

  /* (non-JavaDoc)
   * @see ng.runtime.threadcontext.StaticMethodCall#applyQuick(ng.runtime.metaclass.MetaClass, java.lang.String, float)
   */
  public Object applyQuick(MetaClass metaclass, String name, float p1) {
    final Object result;

    if (this.categoryStaticMethodCallMap != null) {
      result = this.categoryStaticMethodCallMap.get(metaclass, metaclass.staticMethodCall()).doApplyQuick(this.tc, name, p1);
    } else {
      result = metaclass.staticMethodCall().doApplyQuick(this.tc, name, p1);
    }

    if (result == ThreadContext.NOT_PERFORMED) {
      throw new NgRuntimeException("Cannot call the static method " + name + " on the class " + metaclass.getTheClass().getName());
    } else {
      return result;
    }
  }

  /* (non-JavaDoc)
   * @see ng.runtime.threadcontext.StaticMethodCall#applyQuick(java.lang.Class, java.lang.String, double)
   */
  public Object applyQuick(Class theClass, String name, double p1) {
    return applyQuick(tc.getMetaClassFor(theClass), name, p1);
  }

  /* (non-JavaDoc)
   * @see ng.runtime.threadcontext.StaticMethodCall#applyQuick(ng.runtime.metaclass.MetaClass, java.lang.String, double)
   */
  public Object applyQuick(MetaClass metaclass, String name, double p1) {
    final Object result;

    if (this.categoryStaticMethodCallMap != null) {
      result = this.categoryStaticMethodCallMap.get(metaclass, metaclass.staticMethodCall()).doApplyQuick(this.tc, name, p1);
    } else {
      result = metaclass.staticMethodCall().doApplyQuick(this.tc, name, p1);
    }

    if (result == ThreadContext.NOT_PERFORMED) {
      throw new NgRuntimeException("Cannot call the static method " + name + " on the class " + metaclass.getTheClass().getName());
    } else {
      return result;
    }
  }

  /* (non-JavaDoc)
   * @see ng.runtime.threadcontext.StaticMethodCall#applyQuick(java.lang.Class, java.lang.String, java.math.BigInteger)
   */
  public Object applyQuick(Class theClass, String name, BigInteger p1) {
    return applyQuick(tc.getMetaClassFor(theClass), name, p1);
  }

  /* (non-JavaDoc)
   * @see ng.runtime.threadcontext.StaticMethodCall#applyQuick(ng.runtime.metaclass.MetaClass, java.lang.String, java.math.BigInteger)
   */
  public Object applyQuick(MetaClass metaclass, String name, BigInteger p1) {
    final Object result;

    if (this.categoryStaticMethodCallMap != null) {
      result = this.categoryStaticMethodCallMap.get(metaclass, metaclass.staticMethodCall()).doApplyQuick(this.tc, name, p1);
    } else {
      result = metaclass.staticMethodCall().doApplyQuick(this.tc, name, p1);
    }

    if (result == ThreadContext.NOT_PERFORMED) {
      throw new NgRuntimeException("Cannot call the static method " + name + " on the class " + metaclass.getTheClass().getName());
    } else {
      return result;
    }
  }

  /* (non-JavaDoc)
   * @see ng.runtime.threadcontext.StaticMethodCall#applyQuick(java.lang.Class, java.lang.String, java.math.BigDecimal)
   */
  public Object applyQuick(Class theClass, String name, BigDecimal p1) {
    return applyQuick(tc.getMetaClassFor(theClass), name, p1);
  }

  /* (non-JavaDoc)
   * @see ng.runtime.threadcontext.StaticMethodCall#applyQuick(ng.runtime.metaclass.MetaClass, java.lang.String, java.math.BigDecimal)
   */
  public Object applyQuick(MetaClass metaclass, String name, BigDecimal p1) {
    final Object result;

    if (this.categoryStaticMethodCallMap != null) {
      result = this.categoryStaticMethodCallMap.get(metaclass, metaclass.staticMethodCall()).doApplyQuick(this.tc, name, p1);
    } else {
      result = metaclass.staticMethodCall().doApplyQuick(this.tc, name, p1);
    }

    if (result == ThreadContext.NOT_PERFORMED) {
      throw new NgRuntimeException("Cannot call the static method " + name + " on the class " + metaclass.getTheClass().getName());
    } else {
      return result;
    }
  }

  /* (non-JavaDoc)
   * @see ng.runtime.threadcontext.StaticMethodCall#applyQuick(java.lang.Class, java.lang.String, java.lang.String)
   */
  public Object applyQuick(Class theClass, String name, String p1) {
    return applyQuick(tc.getMetaClassFor(theClass), name, p1);
  }

  /* (non-JavaDoc)
   * @see ng.runtime.threadcontext.StaticMethodCall#applyQuick(ng.runtime.metaclass.MetaClass, java.lang.String, java.lang.String)
   */
  public Object applyQuick(MetaClass metaclass, String name, String p1) {
    final Object result;

    if (this.categoryStaticMethodCallMap != null) {
      result = this.categoryStaticMethodCallMap.get(metaclass, metaclass.staticMethodCall()).doApplyQuick(this.tc, name, p1);
    } else {
      result = metaclass.staticMethodCall().doApplyQuick(this.tc, name, p1);
    }

    if (result == ThreadContext.NOT_PERFORMED) {
      throw new NgRuntimeException("Cannot call the static method " + name + " on the class " + metaclass.getTheClass().getName());
    } else {
      return result;
    }
  }
}
