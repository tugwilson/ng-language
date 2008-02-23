package uk.co.wilson.ng.runtime.metaclass;

import java.lang.reflect.Method;

import ng.runtime.threadcontext.ExtendedThreadContext;



/**
 * @author John
 *
 */
public class OneParameterSingletonStaticMethodProxy extends BaseSingletonStaticMethod {
  /**
   * @param method
   */
  public OneParameterSingletonStaticMethodProxy(final Method method) {
    super(method);
  }

  @Override
  public Object doStaticCall(final ExtendedThreadContext tc, final Object[] params) throws Throwable {
    if (params.length == 1) {
      return doCallQuick(tc, params[1]);
    } else {
      return ExtendedThreadContext.NOT_PERFORMED;
    }
  }
}
