package uk.co.wilson.ng.runtime.metaclass.fields.reflection;

import java.lang.reflect.Field;
/*
 * Created on 30 Mar 2007
 *
 * Copyright 2007 John G. Wilson
 *
 *   Licensed under the Apache License, Version 2.0 (the "License");
 *   you may not use this file except in compliance with the License.
 *   You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 *   Unless required by applicable law or agreed to in writing, software
 *   distributed under the License is distributed on an "AS IS" BASIS,
 *   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *   See the License for the specific language governing permissions and
 *   limitations under the License.
 *
 */

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
