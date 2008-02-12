package uk.co.wilson.ng.runtime.metaclass;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import uk.co.wilson.ng.runtime.threadcontext.ExtendedThreadContext;

import ng.lang.NgRuntimeException;

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

  /* (non-JavaDoc)
   * @see uk.co.wilson.ng.runtime.metaclass.BaseStaticMethodProxy#doApplyQuick(ng.runtime.threadcontext.ThreadContext, java.lang.Object)
   */
  @Override
  public Object doApplyQuick(final ExtendedThreadContext tc, final Object p1) {
    if (this.modifiedProxy == null) {
      try {
        return wrapReturnValue(tc, this.method.invoke(null, tc.prepareParameters(p1)));
      } catch (final IllegalArgumentException e) {
        throw new NgRuntimeException(e);
      } catch (final IllegalAccessException e) {
        throw new NgRuntimeException(e);
      } catch (final InvocationTargetException e) {
        throw new NgRuntimeException(e);
      }
    } else {
      return this.modifiedProxy.doApplyQuick(tc, p1);
    }
  }

}
