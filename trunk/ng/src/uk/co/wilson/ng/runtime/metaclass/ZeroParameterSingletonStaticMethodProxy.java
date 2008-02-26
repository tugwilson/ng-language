package uk.co.wilson.ng.runtime.metaclass;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import ng.lang.NgRuntimeException;
import ng.runtime.threadcontext.ExtendedThreadContext;

/**
 * @author John
 *
 */
public class ZeroParameterSingletonStaticMethodProxy extends BaseSingletonStaticMethod {
  private static final Object[] args = new Object[]{};

  public ZeroParameterSingletonStaticMethodProxy(final Method method) {
    super(method);
  }

  @Override
  public Object doStaticCall(final ExtendedThreadContext tc, final Object[] params) throws Throwable {
    if (params.length == 0) {
      return doStaticCallQuick(tc);
    } else {
      return ExtendedThreadContext.NOT_PERFORMED;
    }
  }

  @Override
  public Object doStaticCallQuick(final ExtendedThreadContext tc) throws Throwable {
    if (this.modifiedCallable== null) {
      try {
        return wrapReturnValue(tc, this.method.invoke(null, args));
      } catch (final IllegalArgumentException e) {
        throw new NgRuntimeException(e);
      } catch (final IllegalAccessException e) {
        throw new NgRuntimeException(e);
      } catch (final InvocationTargetException e) {
        throw e.getCause();
      }
    } else {
      return this.modifiedCallable.doStaticCallQuick(tc);
    }
  }

}
