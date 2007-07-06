package uk.co.wilson.ng.runtime.metaclass.reflection.fields;

import java.lang.reflect.Field;

import ng.runtime.NgByte;
import ng.runtime.ThreadContext;
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
   * @see uk.co.wilson.ng.runtime.metaclass.reflection.fields.GetUntypedFieldMetaMethod#callQuick(ng.runtime.ThreadContext, java.lang.Object)
   */
  @Override
  public Object callQuick(final ThreadContext tc, final Object instance) {
    try {
      return NgByte.valueOf(this.field.getByte(instance));
    } catch (final IllegalArgumentException e) {
      return RuntimeMetaClassImpl.NOT_CALLED;
    } catch (final IllegalAccessException e) {
      return RuntimeMetaClassImpl.NOT_CALLED;
    }
  }
}
