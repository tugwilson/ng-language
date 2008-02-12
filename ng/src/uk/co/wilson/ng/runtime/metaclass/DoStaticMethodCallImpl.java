package uk.co.wilson.ng.runtime.metaclass;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import ng.runtime.metaclass.DoStaticMethodCall;
import ng.runtime.metaclass.MetaClass;
import ng.runtime.metaclass.StaticMethodProxy;
import ng.runtime.threadcontext.ExtendedThreadContext;

/**
 * @author John
 *
 */
public class DoStaticMethodCallImpl implements DoStaticMethodCall {
  private final StaticMethodProxy noMethods = new BaseStaticMethodProxy();
  private final Map<String, StaticMethodProxy>staticMethods = new HashMap<String, StaticMethodProxy>() {
    private static final long serialVersionUID = 1L;

     /* (non-JavaDoc)
     * @see java.util.HashMap#get(java.lang.Object)
     */
    @Override
    public StaticMethodProxy get(final Object key) {
    final StaticMethodProxy result = super.get(key);

      if (result == null) {
        return DoStaticMethodCallImpl.this.noMethods;
      } else {
        return result;
      }
    }
  };

  public DoStaticMethodCallImpl(final MetaClass metaclass) {
    try {
    final Method methods[] = metaclass.getTheClass().getDeclaredMethods();
    final Map<String, List<Method>> staticMethods = new HashMap<String, List<Method>>();

      for (int i = 0; i != methods.length; i++) {
      final Method method = methods[i];

        if (Modifier.isStatic(method.getModifiers())) {
        final List<Method> methodList = staticMethods.get(method.getName());

          if (methodList == null) {
          final List<Method> newMethodList = new LinkedList<Method>();

            newMethodList.add(method);
            staticMethods.put(method.getName(), newMethodList);
          } else {
            methodList.add(method);
          }
        }
      }

      for (final Iterator<List<Method>> iterator = staticMethods.values().iterator(); iterator.hasNext();) {
      final List<Method> methodList = iterator.next();

        if (methodList.size() == 1) {
        final Method method = methodList.get(0);
        final Class[] parameterTypes = method.getParameterTypes();

          if (parameterTypes.length == 0) {
            this.staticMethods.put(method.getName(), new ZeroParameterSingletonStaticMethodProxy(method));
          } else if (parameterTypes.length == 1) {
          final Class parameterType = parameterTypes[0];

            if (parameterType == boolean.class) {
              this.staticMethods.put(method.getName(), new OneBooleanParameterSingletonStaticMethodProxy(method));
            } else if (parameterType == char.class) {
              this.staticMethods.put(method.getName(), new OneCharParameterSingletonStaticMethodProxy(method));
            } else if (parameterType == byte.class) {
              this.staticMethods.put(method.getName(), new OneByteParameterSingletonStaticMethodProxy(method));
            } else if (parameterType == short.class) {
              this.staticMethods.put(method.getName(), new OneShortParameterSingletonStaticMethodProxy(method));
            } else if (parameterType == int.class) {
              this.staticMethods.put(method.getName(), new OneIntParameterSingletonStaticMethodProxy(method));
            } else if (parameterType == long.class) {
              this.staticMethods.put(method.getName(), new OneLongParameterSingletonStaticMethodProxy(method));
           } else if (parameterType == float.class) {
              this.staticMethods.put(method.getName(), new OneFloatParameterSingletonStaticMethodProxy(method));
           } else if (parameterType == double.class) {
             this.staticMethods.put(method.getName(), new OneDoubleParameterSingletonStaticMethodProxy(method));
           } else if (parameterType == Object.class) {
             // TODO: look for the Annotation which marks the parameter as untyped
             this.staticMethods.put(method.getName(), new OneParameterSingletonStaticMethodProxy(method));
            } else {
              this.staticMethods.put(method.getName(), new OneParameterSingletonStaticMethodProxy(method));
            }
          } else {
            // TODO: make a proxy for > 1 parameter
          }
        } else {
          // TODO: make a proxy for mutiple methods
        }
      }
    } catch (final SecurityException e) {
    }
  }

  /* (non-JavaDoc)
   * @see ng.runtime.metaclass.DoStaticMethodCall#doApply(ng.runtime.threadcontext.ThreadContext, java.lang.String, java.lang.Object[])
   */
  public Object doApply(final ExtendedThreadContext tc, final String name, final Object[] params) {
     return this.staticMethods.get(name).doApply(tc, params);
  }

  /* (non-JavaDoc)
   * @see ng.runtime.metaclass.DoStaticMethodCall#doApplyQuick(ng.runtime.threadcontext.ThreadContext, java.lang.String)
   */
  public Object doApplyQuick(final ExtendedThreadContext tc, final String name) {
    return this.staticMethods.get(name).doApplyQuick(tc);
  }

  /* (non-JavaDoc)
   * @see ng.runtime.metaclass.DoStaticMethodCall#doApplyQuick(ng.runtime.threadcontext.ThreadContext, java.lang.String, java.lang.String)
   */
  public Object doApplyQuick(final ExtendedThreadContext tc, final String name, final String p1) {
    return this.staticMethods.get(name).doApplyQuick(tc, p1);
  }

  /* (non-JavaDoc)
   * @see ng.runtime.metaclass.DoStaticMethodCall#doApplyQuick(ng.runtime.threadcontext.ThreadContext, java.lang.String, java.lang.Object)
   */
  public Object doApplyQuick(final ExtendedThreadContext tc, final String name, final Object p1) {
    return this.staticMethods.get(name).doApplyQuick(tc, p1);
  }

  /* (non-JavaDoc)
   * @see ng.runtime.metaclass.DoStaticMethodCall#doApplyQuick(ng.runtime.threadcontext.ThreadContext, java.lang.String, java.lang.Object, java.lang.Object)
   */
  public Object doApplyQuick(final ExtendedThreadContext tc, final String name, final Object p1, final Object p2) {
    return this.staticMethods.get(name).doApplyQuick(tc, p1, p2);
  }

  /* (non-JavaDoc)
   * @see ng.runtime.metaclass.DoStaticMethodCall#doApplyQuick(ng.runtime.threadcontext.ThreadContext, java.lang.String, java.lang.Object, java.lang.Object, java.lang.Object)
   */
  public Object doApplyQuick(final ExtendedThreadContext tc, final String name, final Object p1, final Object p2, final Object p3) {
    return this.staticMethods.get(name).doApplyQuick(tc, p1, p2, p3);
  }

  /* (non-JavaDoc)
   * @see ng.runtime.metaclass.DoStaticMethodCall#doApplyQuick(ng.runtime.threadcontext.ThreadContext, java.lang.String, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object)
   */
  public Object doApplyQuick(final ExtendedThreadContext tc, final String name, final Object p1, final Object p2, final Object p3, final Object p4) {
    return this.staticMethods.get(name).doApplyQuick(tc, p1, p2, p3, p4);
  }

  /* (non-JavaDoc)
   * @see ng.runtime.metaclass.DoStaticMethodCall#doApplyQuick(ng.runtime.threadcontext.ThreadContext, java.lang.String, boolean)
   */
  public Object doApplyQuick(final ExtendedThreadContext tc, final String name, final boolean p1) {
    return this.staticMethods.get(name).doApplyQuick(tc, p1);
  }

  /* (non-JavaDoc)
   * @see ng.runtime.metaclass.DoStaticMethodCall#doApplyQuick(ng.runtime.threadcontext.ThreadContext, java.lang.String, char)
   */
  public Object doApplyQuick(final ExtendedThreadContext tc, final String name, final char p1) {
    return this.staticMethods.get(name).doApplyQuick(tc, p1);
  }

  /* (non-JavaDoc)
   * @see ng.runtime.metaclass.DoStaticMethodCall#doApplyQuick(ng.runtime.threadcontext.ThreadContext, java.lang.String, byte)
   */
  public Object doApplyQuick(final ExtendedThreadContext tc, final String name, final byte p1) {
    return this.staticMethods.get(name).doApplyQuick(tc, p1);
  }

  /* (non-JavaDoc)
   * @see ng.runtime.metaclass.DoStaticMethodCall#doApplyQuick(ng.runtime.threadcontext.ThreadContext, java.lang.String, short)
   */
  public Object doApplyQuick(final ExtendedThreadContext tc, final String name, final short p1) {
    return this.staticMethods.get(name).doApplyQuick(tc, p1);
  }

  /* (non-JavaDoc)
   * @see ng.runtime.metaclass.DoStaticMethodCall#doApplyQuick(ng.runtime.threadcontext.ThreadContext, java.lang.String, int)
   */
  public Object doApplyQuick(final ExtendedThreadContext tc, final String name, final int p1) {
    return this.staticMethods.get(name).doApplyQuick(tc, p1);
  }

  /* (non-JavaDoc)
   * @see ng.runtime.metaclass.DoStaticMethodCall#doApplyQuick(ng.runtime.threadcontext.ThreadContext, java.lang.String, long)
   */
  public Object doApplyQuick(final ExtendedThreadContext tc, final String name, final long p1) {
    return this.staticMethods.get(name).doApplyQuick(tc, p1);
  }

  /* (non-JavaDoc)
   * @see ng.runtime.metaclass.DoStaticMethodCall#doApplyQuick(ng.runtime.threadcontext.ThreadContext, java.lang.String, float)
   */
  public Object doApplyQuick(final ExtendedThreadContext tc, final String name, final float p1) {
    return this.staticMethods.get(name).doApplyQuick(tc, p1);
  }

  /* (non-JavaDoc)
   * @see ng.runtime.metaclass.DoStaticMethodCall#doApplyQuick(ng.runtime.threadcontext.ThreadContext, java.lang.String, double)
   */
  public Object doApplyQuick(final ExtendedThreadContext tc, final String name, final double p1) {
    return this.staticMethods.get(name).doApplyQuick(tc, p1);
  }

  /* (non-JavaDoc)
   * @see ng.runtime.metaclass.DoStaticMethodCall#doApplyQuick(ng.runtime.threadcontext.ThreadContext, java.lang.String, java.math.BigInteger)
   */
  public Object doApplyQuick(final ExtendedThreadContext tc, final String name, final BigInteger p1) {
    return this.staticMethods.get(name).doApplyQuick(tc, p1);
  }

  /* (non-JavaDoc)
   * @see ng.runtime.metaclass.DoStaticMethodCall#doApplyQuick(ng.runtime.threadcontext.ThreadContext, java.lang.String, java.math.BigDecimal)
   */
  public Object doApplyQuick(final ExtendedThreadContext tc, final String name, final BigDecimal p1) {
    return this.staticMethods.get(name).doApplyQuick(tc, p1);
  }
}
