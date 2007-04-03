/*
 * Created on Feb 24, 2007
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
package uk.co.wilson.ng.runtime.metaclass;

import ng.runtime.NgBoolean;


public class NgBooleanMetaClass extends RuntimeMetaClassImpl {
  public NgBooleanMetaClass() {
    super(boolean.class, new NgBooleanInternalMetaClass());
  }
}

class NgBooleanInternalMetaClass extends InternalMetaClassImpl {
  public NgBooleanInternalMetaClass() {
    super(boolean.class);
  }

  /* (non-Javadoc)
   * @see ng.runtime.InternalMetaClass#getParamObject(java.lang.Object)
   */
  public Object doGetParamObject(final Object instance) {
    return new Boolean(((NgBoolean)instance).getBooleanValue());
  }

  public Object doNot(final boolean instance) {
    return (instance) ? NgBoolean.FALSE : NgBoolean.TRUE;
  }

  public Object doNot(final Object instance) {
    return (instance == NgBoolean.TRUE) ? NgBoolean.FALSE : NgBoolean.TRUE;
  }
}