package uk.co.wilson.ng.runtime.metaclass.fields.reflection;

import java.lang.reflect.Field;

import ng.runtime.NgShort;
import uk.co.wilson.ng.runtime.metaclass.RuntimeMetaClassImpl;

/**
 * @author John
 *
 */
public class GetShortFieldMetaMethod extends GetUntypedFieldMetaMethod {

  /**
   * @param field
   */
  public GetShortFieldMetaMethod(final Field field) {
    super(field);
  }

  /* (non-Javadoc)
   * @see uk.co.wilson.ng.runtime.metaclass.fields.reflection.GetUntypedFieldMetaMethod#call(java.lang.Object)
   */
  @Override
  public Object call(final Object instance) {
    try {
      return new NgShort(this.field.getShort(instance));
    } catch (IllegalArgumentException e) {
      return RuntimeMetaClassImpl.NOT_CALLED;
    } catch (IllegalAccessException e) {
      return RuntimeMetaClassImpl.NOT_CALLED;
    }
  }
}
