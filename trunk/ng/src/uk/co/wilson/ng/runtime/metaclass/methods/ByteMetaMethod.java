package uk.co.wilson.ng.runtime.metaclass.methods;

import java.lang.reflect.Method;

import ng.runtime.NgByte;
import uk.co.wilson.ng.runtime.metaclass.RuntimeMetaClassImpl;
/*
 * Created on 22 Mar 2007
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

/**
 * @author tug
 *
 */
public class ByteMetaMethod extends UntypedMetaMethod {
  /**
   * @param method
   */
  public ByteMetaMethod(Method method) {
    super(method);
  }

  /* (non-Javadoc)
   * @see uk.co.wilson.ng.runtime.metaclass.methods.UntypedMetaMethod#call(java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object)
   */
  @Override
  public Object call(Object instance, Object p1, Object p2, Object p3, Object p4) {
  final Object result = super.call(instance, p1, p2, p3, p4);
  
    if (result == RuntimeMetaClassImpl.NOT_CALLED) return result;
  
    return new NgByte(((Byte)result).byteValue());
  }

  /* (non-Javadoc)
   * @see uk.co.wilson.ng.runtime.metaclass.methods.UntypedMetaMethod#call(java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object)
   */
  @Override
  public Object call(Object instance, Object p1, Object p2, Object p3) {
  final Object result = super.call(instance, p1, p2, p3);
  
    if (result == RuntimeMetaClassImpl.NOT_CALLED) return result;
  
    return new NgByte(((Byte)result).byteValue());
  }

  /* (non-Javadoc)
   * @see uk.co.wilson.ng.runtime.metaclass.methods.UntypedMetaMethod#call(java.lang.Object, java.lang.Object, java.lang.Object)
   */
  @Override
  public Object call(Object instance, Object p1, Object p2) {
  final Object result = super.call(instance, p1, p2);
  
    if (result == RuntimeMetaClassImpl.NOT_CALLED) return result;
  
    return new NgByte(((Byte)result).byteValue());
  }

  /* (non-Javadoc)
   * @see uk.co.wilson.ng.runtime.metaclass.methods.UntypedMetaMethod#call(java.lang.Object, java.lang.Object)
   */
  @Override
  public Object call(Object instance, Object p1) {
  final Object result = super.call(instance, p1);
  
    if (result == RuntimeMetaClassImpl.NOT_CALLED) return result;
  
    return new NgByte(((Byte)result).byteValue());
  }

  /* (non-Javadoc)
   * @see uk.co.wilson.ng.runtime.metaclass.methods.UntypedMetaMethod#call(java.lang.Object, java.lang.Object[])
   */
  @Override
  public Object call(Object instance, Object[] arguments) {
  final Object result = super.call(instance, arguments);
  
    if (result == RuntimeMetaClassImpl.NOT_CALLED) return result;
    
    return new NgByte(((Byte)result).byteValue());
  }

  /* (non-Javadoc)
   * @see uk.co.wilson.ng.runtime.metaclass.methods.UntypedMetaMethod#call(java.lang.Object)
   */
  @Override
  public Object call(Object instance) {
  final Object result = super.call(instance);
  
    if (result == RuntimeMetaClassImpl.NOT_CALLED) return result;
    
    return new NgByte(((Byte)result).byteValue());
  }
}
