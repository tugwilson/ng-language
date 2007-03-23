package uk.co.wilson.ng.runtime.metaclass.methods;

import java.lang.reflect.Method;

import ng.runtime.NgTyped;
import uk.co.wilson.ng.runtime.metaclass.RuntimeMetaClassImpl;

/**
 * @author tug
 *
 */
public class TypedMetaMethod extends UntypedMetaMethod {
  private final Class type;

  /**
   * @param method
   */
  public TypedMetaMethod(final Method method) {
    super(method);
    this.type = method.getReturnType();
  }

  /* (non-Javadoc)
   * @see uk.co.wilson.ng.runtime.metaclass.methods.UntypedMetaMethod#call(java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object)
   */
  @Override
  public Object call(Object instance, Object p1, Object p2, Object p3, Object p4) {
  final Object result = super.call(instance, p1, p2, p3, p4);
  
    if (result == RuntimeMetaClassImpl.NOT_CALLED) return result;
  
    
    if (result.getClass() != this.type) {
      return new NgTyped(result, this.type);
    } else {
      return result;
    }
  }

  /* (non-Javadoc)
   * @see uk.co.wilson.ng.runtime.metaclass.methods.UntypedMetaMethod#call(java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object)
   */
  @Override
  public Object call(Object instance, Object p1, Object p2, Object p3) {
  final Object result = super.call(instance, p1, p2, p3);
  
    if (result == RuntimeMetaClassImpl.NOT_CALLED) return result;
  
    
    if (result.getClass() != this.type) {
      return new NgTyped(result, this.type);
    } else {
      return result;
    }
  }

  /* (non-Javadoc)
   * @see uk.co.wilson.ng.runtime.metaclass.methods.UntypedMetaMethod#call(java.lang.Object, java.lang.Object, java.lang.Object)
   */
  @Override
  public Object call(Object instance, Object p1, Object p2) {
  final Object result = super.call(instance, p1, p2);
  
    if (result == RuntimeMetaClassImpl.NOT_CALLED) return result;
  
    
    if (result.getClass() != this.type) {
      return new NgTyped(result, this.type);
    } else {
      return result;
    }
  }

  /* (non-Javadoc)
   * @see uk.co.wilson.ng.runtime.metaclass.methods.UntypedMetaMethod#call(java.lang.Object, java.lang.Object)
   */
  @Override
  public Object call(Object instance, Object p1) {
  final Object result = super.call(instance, p1);
  
    if (result == RuntimeMetaClassImpl.NOT_CALLED) return result;
  
    
    if (result.getClass() != this.type) {
      return new NgTyped(result, this.type);
    } else {
      return result;
    }
  }

  /* (non-Javadoc)
   * @see uk.co.wilson.ng.runtime.metaclass.methods.UntypedMetaMethod#call(java.lang.Object, java.lang.Object[])
   */
  @Override
  public Object call(Object instance, Object[] arguments) {
  final Object result = super.call(instance, arguments);
  
    if (result == RuntimeMetaClassImpl.NOT_CALLED) return result;
    
    
    if (result.getClass() != this.type) {
      return new NgTyped(result, this.type);
    } else {
      return result;
    }
  }

  /* (non-Javadoc)
   * @see uk.co.wilson.ng.runtime.metaclass.methods.UntypedMetaMethod#call(java.lang.Object)
   */
  @Override
  public Object call(Object instance) {
  final Object result = super.call(instance);
  
    if (result == RuntimeMetaClassImpl.NOT_CALLED) return result;
    
    if (result.getClass() != this.type) {
      return new NgTyped(result, this.type);
    } else {
      return result;
    }
  }
}