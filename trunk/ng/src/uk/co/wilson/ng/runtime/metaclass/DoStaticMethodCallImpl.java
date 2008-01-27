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
import ng.runtime.threadcontext.ThreadContext;

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
        return noMethods;
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
      
      for (Iterator<List<Method>> iterator = staticMethods.values().iterator(); iterator.hasNext();) {
      final List<Method> methodList = iterator.next();
        
        if (methodList.size() == 1) {
        final Method method = methodList.get(0);
        final Class[] parameterTypes = method.getParameterTypes();
        
          if (parameterTypes.length == 0) {
            this.staticMethods.put(method.getName(), new ZeroParameterSingletonStaticMethodProxy(method));            
          } else if (parameterTypes.length == 1) {
          final Class parameterType = parameterTypes[0];
          
            if (parameterType == boolean.class) {
              
            } else if (parameterType == char.class) {
              
            } else if (parameterType == byte.class) {
              
            } else if (parameterType == short.class) {
              
            } else if (parameterType == int.class) {
              
            } else if (parameterType == long.class) {
              
            } else if (parameterType == float.class) {
              
            } else if (parameterType == double.class) {
              this.staticMethods.put(method.getName(), new OneDoubleParameterSingletonStaticMethodProxy(method)); 
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
    } catch (SecurityException e) {
    }
  }

  /* (non-JavaDoc)
   * @see ng.runtime.metaclass.DoStaticMethodCall#doApply(ng.runtime.threadcontext.ThreadContext, java.lang.String, java.lang.Object[])
   */
  public Object doApply(ThreadContext tc, String name, Object[] params) {
     return this.staticMethods.get(name).doApply(tc, params);
  }

  /* (non-JavaDoc)
   * @see ng.runtime.metaclass.DoStaticMethodCall#doApplyQuick(ng.runtime.threadcontext.ThreadContext, java.lang.String)
   */
  public Object doApplyQuick(ThreadContext tc, String name) {
    return this.staticMethods.get(name).doApplyQuick(tc);
  }

  /* (non-JavaDoc)
   * @see ng.runtime.metaclass.DoStaticMethodCall#doApplyQuick(ng.runtime.threadcontext.ThreadContext, java.lang.String, java.lang.String)
   */
  public Object doApplyQuick(ThreadContext tc, String name, String p1) {
    return this.staticMethods.get(name).doApplyQuick(tc, p1);
  }

  /* (non-JavaDoc)
   * @see ng.runtime.metaclass.DoStaticMethodCall#doApplyQuick(ng.runtime.threadcontext.ThreadContext, java.lang.String, java.lang.Object)
   */
  public Object doApplyQuick(ThreadContext tc, String name, Object p1) {
    return this.staticMethods.get(name).doApplyQuick(tc, p1);
  }

  /* (non-JavaDoc)
   * @see ng.runtime.metaclass.DoStaticMethodCall#doApplyQuick(ng.runtime.threadcontext.ThreadContext, java.lang.String, java.lang.Object, java.lang.Object)
   */
  public Object doApplyQuick(ThreadContext tc, String name, Object p1, Object p2) {
    return this.staticMethods.get(name).doApplyQuick(tc, p1, p2);
  }

  /* (non-JavaDoc)
   * @see ng.runtime.metaclass.DoStaticMethodCall#doApplyQuick(ng.runtime.threadcontext.ThreadContext, java.lang.String, java.lang.Object, java.lang.Object, java.lang.Object)
   */
  public Object doApplyQuick(ThreadContext tc, String name, Object p1, Object p2, Object p3) {
    return this.staticMethods.get(name).doApplyQuick(tc, p1, p2, p3);
  }

  /* (non-JavaDoc)
   * @see ng.runtime.metaclass.DoStaticMethodCall#doApplyQuick(ng.runtime.threadcontext.ThreadContext, java.lang.String, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object)
   */
  public Object doApplyQuick(ThreadContext tc, String name, Object p1, Object p2, Object p3, Object p4) {
    return this.staticMethods.get(name).doApplyQuick(tc, p1, p2, p3, p4);
  }

  /* (non-JavaDoc)
   * @see ng.runtime.metaclass.DoStaticMethodCall#doApplyQuick(ng.runtime.threadcontext.ThreadContext, java.lang.String, boolean)
   */
  public Object doApplyQuick(ThreadContext tc, String name, boolean p1) {
    return this.staticMethods.get(name).doApplyQuick(tc, p1);
  }

  /* (non-JavaDoc)
   * @see ng.runtime.metaclass.DoStaticMethodCall#doApplyQuick(ng.runtime.threadcontext.ThreadContext, java.lang.String, char)
   */
  public Object doApplyQuick(ThreadContext tc, String name, char p1) {
    return this.staticMethods.get(name).doApplyQuick(tc, p1);
  }

  /* (non-JavaDoc)
   * @see ng.runtime.metaclass.DoStaticMethodCall#doApplyQuick(ng.runtime.threadcontext.ThreadContext, java.lang.String, byte)
   */
  public Object doApplyQuick(ThreadContext tc, String name, byte p1) {
    return this.staticMethods.get(name).doApplyQuick(tc, p1);
  }

  /* (non-JavaDoc)
   * @see ng.runtime.metaclass.DoStaticMethodCall#doApplyQuick(ng.runtime.threadcontext.ThreadContext, java.lang.String, short)
   */
  public Object doApplyQuick(ThreadContext tc, String name, short p1) {
    return this.staticMethods.get(name).doApplyQuick(tc, p1);
  }

  /* (non-JavaDoc)
   * @see ng.runtime.metaclass.DoStaticMethodCall#doApplyQuick(ng.runtime.threadcontext.ThreadContext, java.lang.String, int)
   */
  public Object doApplyQuick(ThreadContext tc, String name, int p1) {
    return this.staticMethods.get(name).doApplyQuick(tc, p1);
  }

  /* (non-JavaDoc)
   * @see ng.runtime.metaclass.DoStaticMethodCall#doApplyQuick(ng.runtime.threadcontext.ThreadContext, java.lang.String, long)
   */
  public Object doApplyQuick(ThreadContext tc, String name, long p1) {
    return this.staticMethods.get(name).doApplyQuick(tc, p1);
  }

  /* (non-JavaDoc)
   * @see ng.runtime.metaclass.DoStaticMethodCall#doApplyQuick(ng.runtime.threadcontext.ThreadContext, java.lang.String, float)
   */
  public Object doApplyQuick(ThreadContext tc, String name, float p1) {
    return this.staticMethods.get(name).doApplyQuick(tc, p1);
  }

  /* (non-JavaDoc)
   * @see ng.runtime.metaclass.DoStaticMethodCall#doApplyQuick(ng.runtime.threadcontext.ThreadContext, java.lang.String, double)
   */
  public Object doApplyQuick(ThreadContext tc, String name, double p1) {
    return this.staticMethods.get(name).doApplyQuick(tc, p1);
  }

  /* (non-JavaDoc)
   * @see ng.runtime.metaclass.DoStaticMethodCall#doApplyQuick(ng.runtime.threadcontext.ThreadContext, java.lang.String, java.math.BigInteger)
   */
  public Object doApplyQuick(ThreadContext tc, String name, BigInteger p1) {
    return this.staticMethods.get(name).doApplyQuick(tc, p1);
  }

  /* (non-JavaDoc)
   * @see ng.runtime.metaclass.DoStaticMethodCall#doApplyQuick(ng.runtime.threadcontext.ThreadContext, java.lang.String, java.math.BigDecimal)
   */
  public Object doApplyQuick(ThreadContext tc, String name, BigDecimal p1) {
    return this.staticMethods.get(name).doApplyQuick(tc, p1);
  }
}
