package uk.co.wilson.ng.runtime.metaclass.reflection.fields;

import java.lang.reflect.Field;

import ng.runtime.NgDouble;
import ng.runtime.ThreadContext;
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
   * @see uk.co.wilson.ng.runtime.metaclass.reflection.fields.GetUntypedFieldMetaMethod#callQuick(ng.runtime.ThreadContext, java.lang.Object)
   */
  @Override
  public Object doCallQuick(final ThreadContext tc, final Object instance) {
    try {
      return NgDouble.valueOf(this.field.getDouble(instance));
    } catch (final IllegalArgumentException e) {
      return RuntimeMetaClassImpl.NOT_CALLED;
    } catch (final IllegalAccessException e) {
      return RuntimeMetaClassImpl.NOT_CALLED;
    }
  }
}
