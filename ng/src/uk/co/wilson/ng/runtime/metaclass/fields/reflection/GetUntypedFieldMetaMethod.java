package uk.co.wilson.ng.runtime.metaclass.fields.reflection;

import java.lang.reflect.Field;

import uk.co.wilson.ng.runtime.metaclass.RuntimeMetaClassImpl;
import uk.co.wilson.ng.runtime.metaclass.methods.BaseMetaMethod;

/**
 * @author John
 *
 */
public class GetUntypedFieldMetaMethod extends BaseMetaMethod {
  protected final Field field;
  
  public GetUntypedFieldMetaMethod(final Field field) {
    super(0);
    this.field = field;
  }
  
  /* (non-Javadoc)
   * @see ng.runtime.MetaMethod#call(java.lang.Object, java.lang.Object[])
   */
  public Object call(Object instance, Object[] arguments) {
    return RuntimeMetaClassImpl.NOT_CALLED;
  }

  /* (non-Javadoc)
   * @see ng.runtime.MetaMethod#call(java.lang.Object)
   */
  public Object call(Object instance) {
    try {
      return this.field.get(instance);
    } catch (IllegalArgumentException e) {
      return RuntimeMetaClassImpl.NOT_CALLED;
    } catch (IllegalAccessException e) {
      return RuntimeMetaClassImpl.NOT_CALLED;
    }
  }

  /* (non-Javadoc)
   * @see ng.runtime.MetaMethod#call(java.lang.Object, java.lang.Object)
   */
  public Object call(Object instance, Object p1) {
    return RuntimeMetaClassImpl.NOT_CALLED;
  }

  /* (non-Javadoc)
   * @see ng.runtime.MetaMethod#call(java.lang.Object, java.lang.Object, java.lang.Object)
   */
  public Object call(Object instance, Object p1, Object p2) {
    return RuntimeMetaClassImpl.NOT_CALLED;
  }

  /* (non-Javadoc)
   * @see ng.runtime.MetaMethod#call(java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object)
   */
  public Object call(Object instance, Object p1, Object p2, Object p3) {
    return RuntimeMetaClassImpl.NOT_CALLED;
  }

  /* (non-Javadoc)
   * @see ng.runtime.MetaMethod#call(java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object)
   */
  public Object call(Object instance, Object p1, Object p2, Object p3, Object p4) {
    return RuntimeMetaClassImpl.NOT_CALLED;
  }

}
