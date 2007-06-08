package uk.co.wilson.ng.runtime.metaclass.reflection.methods;

import java.lang.reflect.Method;
/*
 * Created on 6 Apr 2007
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
 * @author John
 *
 */
public class VoidMetaMethod extends UntypedMetaMethod {

  /**
   * @param method
   */
  public VoidMetaMethod(final Method method) {
    super(method);
  }

  /* (non-Javadoc)
   * @see uk.co.wilson.ng.runtime.metaclass.reflection.methods.UntypedMetaMethod#call(java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object)
   */
  @Override
  public Object call(final Object instance, final Object p1, final Object p2, final Object p3, final Object p4) throws Throwable {
    super.call(instance, p1, p2, p3, p4);
    
    return instance;
  }

  /* (non-Javadoc)
   * @see uk.co.wilson.ng.runtime.metaclass.reflection.methods.UntypedMetaMethod#call(java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object)
   */
  @Override
  public Object call(final Object instance, final Object p1, final Object p2, final Object p3) throws Throwable {
    super.call(instance, p1, p2, p3);
    
    return instance;
  }

  /* (non-Javadoc)
   * @see uk.co.wilson.ng.runtime.metaclass.reflection.methods.UntypedMetaMethod#call(java.lang.Object, java.lang.Object, java.lang.Object)
   */
  @Override
  public Object call(final Object instance, final Object p1, final Object p2) throws Throwable {
    super.call(instance, p1, p2);
    
    return instance;
 }

  /* (non-Javadoc)
   * @see uk.co.wilson.ng.runtime.metaclass.reflection.methods.UntypedMetaMethod#call(java.lang.Object, java.lang.Object)
   */
  @Override
  public Object call(final Object instance, final Object p1) throws Throwable {
    super.call(instance, p1);
    
    return instance;
  }

  /* (non-Javadoc)
   * @see uk.co.wilson.ng.runtime.metaclass.reflection.methods.UntypedMetaMethod#call(java.lang.Object, java.lang.Object[])
   */
  @Override
  public Object call(final Object instance, final Object[] arguments) throws Throwable {
    super.call(instance, arguments);
    
    return instance;
  }

  /* (non-Javadoc)
   * @see uk.co.wilson.ng.runtime.metaclass.reflection.methods.UntypedMetaMethod#call(java.lang.Object)
   */
  @Override
  public Object call(final Object instance) throws Throwable {
    // TODO Auto-generated method stub
    return super.call(instance);
  }

}
