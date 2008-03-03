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
import ng.runtime.metaclass.StaticCallable;
import ng.runtime.metaclass.StaticMethodContainer;
import ng.runtime.threadcontext.ExtendedThreadContext;

/**
 * @author John
 *
 */
public class DoStaticMethodCallImpl implements DoStaticMethodCall {
  private final StaticMethodContainer noMethods = new BaseStaticMethodContainer();
  private final Map<String, StaticMethodContainer>staticMethods = new HashMap<String, StaticMethodContainer>() {
    private static final long serialVersionUID = 1L;

     /* (non-JavaDoc)
     * @see java.util.HashMap#get(java.lang.Object)
     */
    @Override
    public StaticMethodContainer get(final Object key) {
    final StaticMethodContainer result = super.get(key);

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

  public StaticCallable doGetCallable(final ExtendedThreadContext tc, final String name, final Object[] params, final MetaClass[] metaClasses) {
     return this.staticMethods.get(name).getCallable(tc, params, metaClasses);
  }

  public StaticCallable doGetCallable(final ExtendedThreadContext tc, final String name) {
    return this.staticMethods.get(name).getCallable(tc);
  }

  public StaticCallable doGetCallable(final ExtendedThreadContext tc, final String name, final Object p1, final MetaClass m1) {
    return this.staticMethods.get(name).getCallable(tc, p1, m1);
  }

  public StaticCallable doGetCallable(final ExtendedThreadContext tc, final String name, final boolean p1) {
    return this.staticMethods.get(name).getCallable(tc, p1);
  }

  public StaticCallable doGetCallable(final ExtendedThreadContext tc, final String name, final char p1) {
    return this.staticMethods.get(name).getCallable(tc, p1);
  }

  public StaticCallable doGetCallable(final ExtendedThreadContext tc, final String name, final byte p1) {
    return this.staticMethods.get(name).getCallable(tc, p1);
  }

  public StaticCallable doGetCallable(final ExtendedThreadContext tc, final String name, final short p1) {
    return this.staticMethods.get(name).getCallable(tc, p1);
  }

  public StaticCallable doGetCallable(final ExtendedThreadContext tc, final String name, final int p1) {
    return this.staticMethods.get(name).getCallable(tc, p1);
  }

  public StaticCallable doGetCallable(final ExtendedThreadContext tc, final String name, final long p1) {
    return this.staticMethods.get(name).getCallable(tc, p1);
  }

  public StaticCallable doGetCallable(final ExtendedThreadContext tc, final String name, final float p1) {
    return this.staticMethods.get(name).getCallable(tc, p1);
  }

  public StaticCallable doGetCallable(final ExtendedThreadContext tc, final String name, final double p1) {
    return this.staticMethods.get(name).getCallable(tc, p1);
  }

  public StaticCallable doGetCallable(final ExtendedThreadContext tc, final String name, final BigInteger p1) {
    return this.staticMethods.get(name).getCallable(tc, p1);
  }

  public StaticCallable doGetCallable(final ExtendedThreadContext tc, final String name, final BigDecimal p1) {
    return this.staticMethods.get(name).getCallable(tc, p1);
  }

  public StaticCallable doGetCallable(final ExtendedThreadContext tc, final String name, final String p1) {
    return this.staticMethods.get(name).getCallable(tc, p1);
  }

  public StaticCallable doGetCallable(final ExtendedThreadContext tc, final String name, final Object p1, final MetaClass m1, final Object p2, final MetaClass m2) {
    return this.staticMethods.get(name).getCallable(tc, p1, m1, p2, m2);
  }

  public StaticCallable doGetCallable(final ExtendedThreadContext tc, final String name, final Object p1, final MetaClass m1, final Object p2, final MetaClass m2, final Object p3, final MetaClass m3) {
    return this.staticMethods.get(name).getCallable(tc, p1, m1, p2, m2, p3, m3);
  }

  public StaticCallable doGetCallable(final ExtendedThreadContext tc, final String name, final Object p1, final MetaClass m1, final Object p2, final MetaClass m2, final Object p3, final MetaClass m3, final Object p4, final MetaClass m4) {
    return this.staticMethods.get(name).getCallable(tc, p1, m1, p2, m2, p3, m3, p4, m4);
  }
}
