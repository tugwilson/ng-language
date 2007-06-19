package uk.co.wilson.ng.runtime.metaclass.reflection.methods;

import java.lang.reflect.Method;

/**
 * @author John
 *
 */
public class VoidMetaMethod extends UntypedMetaMethod {

  /**
   * @param method
   */
  public VoidMetaMethod(final Method method) {
    super(method);
  }

  /* (non-Javadoc)
   * @see uk.co.wilson.ng.runtime.metaclass.reflection.methods.UntypedMetaMethod#call(java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object)
   */
  @Override
  public Object callQuick(final Object instance, final Object p1, final Object p2, final Object p3, final Object p4) throws Throwable {
    super.callQuick(instance, p1, p2, p3, p4);
    
    return instance;
  }

  /* (non-Javadoc)
   * @see uk.co.wilson.ng.runtime.metaclass.reflection.methods.UntypedMetaMethod#call(java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object)
   */
  @Override
  public Object callQuick(final Object instance, final Object p1, final Object p2, final Object p3) throws Throwable {
    super.callQuick(instance, p1, p2, p3);
    
    return instance;
  }

  /* (non-Javadoc)
   * @see uk.co.wilson.ng.runtime.metaclass.reflection.methods.UntypedMetaMethod#call(java.lang.Object, java.lang.Object, java.lang.Object)
   */
  @Override
  public Object callQuick(final Object instance, final Object p1, final Object p2) throws Throwable {
    super.callQuick(instance, p1, p2);
    
    return instance;
 }

  /* (non-Javadoc)
   * @see uk.co.wilson.ng.runtime.metaclass.reflection.methods.UntypedMetaMethod#call(java.lang.Object, java.lang.Object)
   */
  @Override
  public Object callQuick(final Object instance, final Object p1) throws Throwable {
    super.callQuick(instance, p1);
    
    return instance;
  }

  /* (non-Javadoc)
   * @see uk.co.wilson.ng.runtime.metaclass.reflection.methods.UntypedMetaMethod#call(java.lang.Object, java.lang.Object[])
   */
  @Override
  public Object call(final Object instance, final Object[] arguments) throws Throwable {
    super.call(instance, arguments);
    
    return instance;
  }

  /* (non-Javadoc)
   * @see uk.co.wilson.ng.runtime.metaclass.reflection.methods.UntypedMetaMethod#call(java.lang.Object)
   */
  @Override
  public Object callQuick(final Object instance) throws Throwable {
    // TODO Auto-generated method stub
    return super.callQuick(instance);
  }

}
