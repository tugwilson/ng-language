package uk.co.wilson.ng.runtime.metaclass.reflection.methods;

import java.lang.reflect.Method;

import ng.runtime.NgShort;
import ng.runtime.ThreadContext;
import uk.co.wilson.ng.runtime.metaclass.RuntimeMetaClassImpl;

/**
 * @author tug
 *
 */
public class ShortMetaMethod extends UntypedMetaMethod {
  /**
   * @param method
   */
  public ShortMetaMethod(final Method method) {
    super(method);
  }

  /* (non-Javadoc)
   * @see uk.co.wilson.ng.runtime.metaclass.reflection.methods.UntypedMetaMethod#callQuick(ng.runtime.ThreadContext, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object)
   */
  @Override
  public Object callQuick(final ThreadContext tc, final Object instance, final Object p1, final Object p2, final Object p3, final Object p4) throws Throwable {
  final Object result = super.callQuick(tc, instance, p1, p2, p3, p4);
  
    if (result == RuntimeMetaClassImpl.NOT_CALLED) return result;
  
    return NgShort.valueOf(((Short)result).shortValue());
  }

  /* (non-Javadoc)
   * @see uk.co.wilson.ng.runtime.metaclass.reflection.methods.UntypedMetaMethod#callQuick(ng.runtime.ThreadContext, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object)
   */
  @Override
  public Object callQuick(final ThreadContext tc, final Object instance, final Object p1, final Object p2, final Object p3) throws Throwable {
  final Object result = super.callQuick(tc, instance, p1, p2, p3);
  
    if (result == RuntimeMetaClassImpl.NOT_CALLED) return result;
  
    return NgShort.valueOf(((Short)result).shortValue());
  }

  /* (non-Javadoc)
   * @see uk.co.wilson.ng.runtime.metaclass.reflection.methods.UntypedMetaMethod#callQuick(ng.runtime.ThreadContext, java.lang.Object, java.lang.Object, java.lang.Object)
   */
  @Override
  public Object callQuick(final ThreadContext tc, final Object instance, final Object p1, final Object p2) throws Throwable {
  final Object result = super.callQuick(tc, instance, p1, p2);
  
    if (result == RuntimeMetaClassImpl.NOT_CALLED) return result;
  
    return NgShort.valueOf(((Short)result).shortValue());
  }

  /* (non-Javadoc)
   * @see uk.co.wilson.ng.runtime.metaclass.reflection.methods.UntypedMetaMethod#callQuick(ng.runtime.ThreadContext, java.lang.Object, java.lang.Object)
   */
  @Override
  public Object callQuick(final ThreadContext tc, final Object instance, final Object p1) throws Throwable {
  final Object result = super.callQuick(tc, instance, p1);
  
    if (result == RuntimeMetaClassImpl.NOT_CALLED) return result;
  
    return NgShort.valueOf(((Short)result).shortValue());
  }

  /* (non-Javadoc)
   * @see uk.co.wilson.ng.runtime.metaclass.reflection.methods.UntypedMetaMethod#call(ng.runtime.ThreadContext, java.lang.Object, java.lang.Object[])
   */
  @Override
  public Object call(final ThreadContext tc, final Object instance, final Object[] arguments) throws Throwable {
  final Object result = super.call(tc, instance, arguments);
  
    if (result == RuntimeMetaClassImpl.NOT_CALLED) return result;
    
    return NgShort.valueOf(((Short)result).shortValue());
  }

  /* (non-Javadoc)
   * @see uk.co.wilson.ng.runtime.metaclass.reflection.methods.UntypedMetaMethod#callQuick(ng.runtime.ThreadContext, java.lang.Object)
   */
  @Override
  public Object callQuick(final ThreadContext tc, final Object instance) throws Throwable {
  final Object result = super.callQuick(tc, instance);
  
    if (result == RuntimeMetaClassImpl.NOT_CALLED) return result;
    
    return NgShort.valueOf(((Short)result).shortValue());
  }
}
