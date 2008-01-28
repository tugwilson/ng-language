package uk.co.wilson.ng.runtime.metaclass;

import java.lang.reflect.Method;

import ng.runtime.threadcontext.ThreadContext;

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

  /* (non-JavaDoc)
   * @see uk.co.wilson.ng.runtime.metaclass.BaseStaticMethodProxy#doApply(ng.runtime.threadcontext.ThreadContext, java.lang.Object[])
   */
  @Override
  public Object doApply(final ThreadContext tc, final Object[] params) {
    if (params.length == 1) {
      return doApplyQuick(tc, params[1]);
    } else {
      return ThreadContext.NOT_PERFORMED;
    }
  }
}
