package uk.co.wilson.ng.runtime.metaclass.fields.reflection;

import java.lang.reflect.Field;

import ng.runtime.NgByte;
import uk.co.wilson.ng.runtime.metaclass.RuntimeMetaClassImpl;

/**
 * @author John
 *
 */
public class GetByteFieldMetaMethod extends GetUntypedFieldMetaMethod {

  /**
   * @param field
   */
  public GetByteFieldMetaMethod(final Field field) {
    super(field);
  }
  
  /* (non-Javadoc)
   * @see uk.co.wilson.ng.runtime.metaclass.fields.reflection.GetUntypedFieldMetaMethod#call(java.lang.Object)
   */
  @Override
  public Object call(final Object instance) {
    try {
      return new NgByte(this.field.getByte(instance));
    } catch (IllegalArgumentException e) {
      return RuntimeMetaClassImpl.NOT_CALLED;
    } catch (IllegalAccessException e) {
      return RuntimeMetaClassImpl.NOT_CALLED;
    }
  }
}
