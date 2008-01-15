package uk.co.wilson.ng.runtime.metaclass.reflection.methods;

import java.lang.reflect.Method;

import ng.runtime.ThreadContext;


/**
 * @author John
 *
 */
public class VoidSetPropertyMetaMethod extends UntypedMetaMethod {

  /**
   * @param method
   */
  public VoidSetPropertyMetaMethod(final Method method) {
    super(method);
  }

  /* (non-Javadoc)
   * @see uk.co.wilson.ng.runtime.metaclass.reflection.methods.UntypedMetaMethod#callQuick(ng.runtime.ThreadContext, java.lang.Object, java.lang.Object)
   */
  @Override
  public Object doCallQuick(final ThreadContext tc, final Object instance, final Object newValue) throws Throwable {
    super.doCallQuick(tc, instance, newValue);
    
    return newValue;
  }

}
