package uk.co.wilson.ng.runtime.metaclass.reflection.fields;

import java.lang.reflect.Field;

import ng.runtime.NgNull;
import ng.runtime.NgTyped;
import uk.co.wilson.ng.runtime.metaclass.RuntimeMetaClassImpl;

/**
 * @author John
 *
 */
public class SetTypedFieldMetaMethod extends SetUntypedFieldMetaMethod {
  private final Class type;

  /**
   * @param field
   */
  public SetTypedFieldMetaMethod(final Field field) {
    super(field);
    this.type = field.getType();
  }

  /* (non-Javadoc)
   * @see uk.co.wilson.ng.runtime.metaclass.fields.reflection.SetUntypedFieldMetaMethod#call(java.lang.Object, java.lang.Object)
   */
  @Override
  public Object call(final Object instance, final Object value) {
  final Object result = super.call(instance, value);
    
    if (result == RuntimeMetaClassImpl.NOT_CALLED) return result;
  
    if (result == null) return NgNull.NULL_OBJECT;
    
    if (result.getClass() != this.type) {
      return new NgTyped(result, this.type);
    } else {
      return result;
    }
  }

}