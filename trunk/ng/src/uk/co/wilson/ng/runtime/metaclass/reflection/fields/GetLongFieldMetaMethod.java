package uk.co.wilson.ng.runtime.metaclass.reflection.fields;

import java.lang.reflect.Field;

import ng.runtime.NgLong;
import uk.co.wilson.ng.runtime.metaclass.RuntimeMetaClassImpl;

/**
 * @author John
 *
 */
public class GetLongFieldMetaMethod extends GetUntypedFieldMetaMethod {

  /**
   * @param field
   */
  public GetLongFieldMetaMethod(final Field field) {
    super(field);
  }

  /* (non-Javadoc)
   * @see uk.co.wilson.ng.runtime.metaclass.fields.reflection.GetUntypedFieldMetaMethod#call(java.lang.Object)
   */
  @Override
  public Object callQuick(final Object instance) {
    try {
      return NgLong.valueOf(this.field.getLong(instance));
    } catch (final IllegalArgumentException e) {
      return RuntimeMetaClassImpl.NOT_CALLED;
    } catch (final IllegalAccessException e) {
      return RuntimeMetaClassImpl.NOT_CALLED;
    }
  }
}
