package uk.co.wilson.ng.runtime.metaclass;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import ng.lang.NgRuntimeException;
import ng.runtime.threadcontext.ThreadContext;

/**
 * @author John
 *
 */
public class ZeroParameterSingletonStaticMethodProxy extends BaseSingletonStaticMethod {
  private static final Object[] args = new Object[]{};
  
  public ZeroParameterSingletonStaticMethodProxy(final Method method) {
    super(method);
  }
  
  /* (non-JavaDoc)
   * @see uk.co.wilson.ng.runtime.metaclass.BaseStaticMethodProxy#doApply(ng.runtime.threadcontext.ThreadContext, java.lang.Object[])
   */
  @Override
  public Object doApply(ThreadContext tc, Object[] params) {
    if (params.length == 0) {
      return doApplyQuick(tc);
    } else {
      return ThreadContext.NOT_PERFORMED;
    }
  }

  /* (non-JavaDoc)
   * @see uk.co.wilson.ng.runtime.metaclass.BaseStaticMethodProxy#doApplyQuick(ng.runtime.threadcontext.ThreadContext)
   */
  @Override
  public Object doApplyQuick(ThreadContext tc) {
    if (this.modifiedProxy == null) {
      try {
        return wrapReturnValue(tc, this.method.invoke(null, args));
      } catch (final IllegalArgumentException e) {
        throw new NgRuntimeException(e);
      } catch (final IllegalAccessException e) {
        throw new NgRuntimeException(e);
      } catch (final InvocationTargetException e) {
        throw new NgRuntimeException(e);
      }
    } else {
      return this.modifiedProxy.doApplyQuick(tc);
    }
  }

}
