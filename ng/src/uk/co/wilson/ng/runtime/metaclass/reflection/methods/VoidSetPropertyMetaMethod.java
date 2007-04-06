package uk.co.wilson.ng.runtime.metaclass.reflection.methods;

import java.lang.reflect.Method;


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
   * @see uk.co.wilson.ng.runtime.metaclass.reflection.methods.UntypedMetaMethod#call(java.lang.Object, java.lang.Object)
   */
  @Override
  public Object call(final Object instance, final Object newValue) {
    super.call(instance, newValue);
    
    return newValue;
  }

}
