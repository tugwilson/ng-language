package uk.co.wilson.ng.runtime.metaclass.reflection.fields;

import java.lang.reflect.Field;

import ng.runtime.NgChar;
import ng.runtime.ThreadContext;
import uk.co.wilson.ng.runtime.metaclass.RuntimeMetaClassImpl;

/**
 * @author John
 *
 */
public class SetCharFieldMetaMethod extends SetUntypedFieldMetaMethod {

  /**
   * @param field
   */
  public SetCharFieldMetaMethod(final Field field) {
    super(field);
  }

  /* (non-Javadoc)
   * @see uk.co.wilson.ng.runtime.metaclass.reflection.fields.SetUntypedFieldMetaMethod#callQuick(ng.runtime.ThreadContext, java.lang.Object, java.lang.Object)
   */
  @Override
  public Object doCallQuick(final ThreadContext tc, final Object instance, final Object value) {
    try {
      this.field.setChar(instance, ((NgChar)value).getCharValue());
    } catch (final IllegalArgumentException e) {
      return RuntimeMetaClassImpl.NOT_CALLED;
    } catch (final IllegalAccessException e) {
      return RuntimeMetaClassImpl.NOT_CALLED;
    }
    
    return value;
  }
}
