package uk.co.wilson.ng.runtime.metaclass;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import ng.lang.NgRuntimeException;
import uk.co.wilson.ng.runtime.threadcontext.ExtendedThreadContext;

/**
 *
 * This is the case where there is only one method on the class with this name and
 * this method takes one parameter which is not a primative type.
 *
 * This class is subclassed to cater for the case where the parameter is a primative
 *
 * @author John
 *
 */
public class OneUntypedParameterSingletonStaticMethodProxy extends OneParameterSingletonStaticMethodProxy {
  public OneUntypedParameterSingletonStaticMethodProxy(final Method method) {
    super(method);
  }

  @Override
  public Object doStaticCallQuick(final ExtendedThreadContext tc, final Object p1) throws Throwable {
    if (this.modifiedCallable == null) {
      try {
        return wrapReturnValue(tc, this.method.invoke(null, tc.prepareParameters(p1)));
      } catch (final IllegalArgumentException e) {
        throw new NgRuntimeException(e);
      } catch (final IllegalAccessException e) {
        throw new NgRuntimeException(e);
      } catch (final InvocationTargetException e) {
        throw e.getCause();
      }
    } else {
      return this.modifiedCallable.doStaticCallQuick(tc, p1);
    }
  }

}
