package uk.co.wilson.ng.runtime.metaclass.fields.reflection;

import java.lang.reflect.Field;

import ng.runtime.NgDouble;
import uk.co.wilson.ng.runtime.metaclass.RuntimeMetaClassImpl;

/**
 * @author John
 *
 */
public class SetDoubleFieldMetaMethod extends SetUntypedFieldMetaMethod {

  /**
   * @param field
   */
  public SetDoubleFieldMetaMethod(final Field field) {
    super(field);
  }

  /* (non-Javadoc)
   * @see uk.co.wilson.ng.runtime.metaclass.fields.reflection.SetUntypedFieldMetaMethod#call(java.lang.Object, java.lang.Object)
   */
  @Override
  public Object call(final Object instance, final Object value) {
    try {
      this.field.setDouble(instance, ((NgDouble)value).getDoubleValue());
    } catch (IllegalArgumentException e) {
      return RuntimeMetaClassImpl.NOT_CALLED;
    } catch (IllegalAccessException e) {
      return RuntimeMetaClassImpl.NOT_CALLED;
    }
    
    return value;
  }
}
