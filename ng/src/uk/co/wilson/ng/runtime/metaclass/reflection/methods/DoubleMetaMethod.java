package uk.co.wilson.ng.runtime.metaclass.reflection.methods;

import java.lang.reflect.Method;

import ng.runtime.NgDouble;
import uk.co.wilson.ng.runtime.metaclass.RuntimeMetaClassImpl;

/**
 * @author tug
 *
 */
public class DoubleMetaMethod extends UntypedMetaMethod {
  /**
   * @param method
   */
  public DoubleMetaMethod(final Method method) {
    super(method);
  }

  /* (non-Javadoc)
   * @see uk.co.wilson.ng.runtime.metaclass.methods.UntypedMetaMethod#call(java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object)
   */
  @Override
  public Object call(final Object instance, final Object p1, final Object p2, final Object p3, final Object p4) throws Throwable {
  final Object result = super.call(instance, p1, p2, p3, p4);
  
    if (result == RuntimeMetaClassImpl.NOT_CALLED) return result;
  
    return NgDouble.valueOf(((Double)result).doubleValue());
  }

  /* (non-Javadoc)
   * @see uk.co.wilson.ng.runtime.metaclass.methods.UntypedMetaMethod#call(java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object)
   */
  @Override
  public Object call(final Object instance, final Object p1, final Object p2, final Object p3) throws Throwable {
  final Object result = super.call(instance, p1, p2, p3);
  
    if (result == RuntimeMetaClassImpl.NOT_CALLED) return result;
  
    return NgDouble.valueOf(((Double)result).doubleValue());
  }

  /* (non-Javadoc)
   * @see uk.co.wilson.ng.runtime.metaclass.methods.UntypedMetaMethod#call(java.lang.Object, java.lang.Object, java.lang.Object)
   */
  @Override
  public Object call(final Object instance, final Object p1, final Object p2) throws Throwable {
  final Object result = super.call(instance, p1, p2);
  
    if (result == RuntimeMetaClassImpl.NOT_CALLED) return result;
  
    return NgDouble.valueOf(((Double)result).doubleValue());
  }

  /* (non-Javadoc)
   * @see uk.co.wilson.ng.runtime.metaclass.methods.UntypedMetaMethod#call(java.lang.Object, java.lang.Object)
   */
  @Override
  public Object call(final Object instance, final Object p1) throws Throwable {
  final Object result = super.call(instance, p1);
  
    if (result == RuntimeMetaClassImpl.NOT_CALLED) return result;
  
    return NgDouble.valueOf(((Double)result).doubleValue());
  }

  /* (non-Javadoc)
   * @see uk.co.wilson.ng.runtime.metaclass.methods.UntypedMetaMethod#call(java.lang.Object, java.lang.Object[])
   */
  @Override
  public Object call(final Object instance, final Object[] arguments) throws Throwable {
  final Object result = super.call(instance, arguments);
  
    if (result == RuntimeMetaClassImpl.NOT_CALLED) return result;
    
    return NgDouble.valueOf(((Double)result).doubleValue());
  }

  /* (non-Javadoc)
   * @see uk.co.wilson.ng.runtime.metaclass.methods.UntypedMetaMethod#call(java.lang.Object)
   */
  @Override
  public Object call(final Object instance) throws Throwable {
  final Object result = super.call(instance);
  
    if (result == RuntimeMetaClassImpl.NOT_CALLED) return result;
    
    return NgDouble.valueOf(((Double)result).doubleValue());
  }
}
