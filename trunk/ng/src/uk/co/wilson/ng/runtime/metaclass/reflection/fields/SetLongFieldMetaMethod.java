package uk.co.wilson.ng.runtime.metaclass.reflection.fields;

import java.lang.reflect.Field;

import ng.runtime.NgLong;
import uk.co.wilson.ng.runtime.metaclass.RuntimeMetaClassImpl;

/**
 * @author John
 *
 */
public class SetLongFieldMetaMethod extends SetUntypedFieldMetaMethod {

  /**
   * @param field
   */
  public SetLongFieldMetaMethod(final Field field) {
    super(field);
  }

  /* (non-Javadoc)
   * @see uk.co.wilson.ng.runtime.metaclass.fields.reflection.SetUntypedFieldMetaMethod#call(java.lang.Object, java.lang.Object)
   */
  @Override
  public Object callQuick(final Object instance, final Object value) {
    try {
      this.field.setLong(instance, ((NgLong)value).getLongValue());
    } catch (final IllegalArgumentException e) {
      return RuntimeMetaClassImpl.NOT_CALLED;
    } catch (final IllegalAccessException e) {
      return RuntimeMetaClassImpl.NOT_CALLED;
    }
    
    return value;
  }
}
