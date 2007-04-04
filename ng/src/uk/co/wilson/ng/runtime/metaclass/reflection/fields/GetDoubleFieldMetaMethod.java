package uk.co.wilson.ng.runtime.metaclass.reflection.fields;

import java.lang.reflect.Field;

import ng.runtime.NgDouble;
import uk.co.wilson.ng.runtime.metaclass.RuntimeMetaClassImpl;

/**
 * @author John
 *
 */
public class GetDoubleFieldMetaMethod extends GetUntypedFieldMetaMethod {

  /**
   * @param field
   */
  public GetDoubleFieldMetaMethod(final Field field) {
    super(field);
  }
  
  /* (non-Javadoc)
   * @see uk.co.wilson.ng.runtime.metaclass.fields.reflection.GetUntypedFieldMetaMethod#call(java.lang.Object)
   */
  @Override
  public Object call(final Object instance) {
    try {
      return new NgDouble(this.field.getDouble(instance));
    } catch (final IllegalArgumentException e) {
      return RuntimeMetaClassImpl.NOT_CALLED;
    } catch (final IllegalAccessException e) {
      return RuntimeMetaClassImpl.NOT_CALLED;
    }
  }
}
