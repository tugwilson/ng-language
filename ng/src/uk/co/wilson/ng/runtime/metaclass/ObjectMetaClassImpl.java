/*
 * Created on Feb 23, 2007
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

import ng.lang.NgRuntimeException;
import ng.runtime.RuntimeMetaClass;

public class ObjectMetaClassImpl extends RuntimeMetaClassImpl {
  public ObjectMetaClassImpl(final Class theClass) {
    super(Object.class);

    if (theClass != Object.class)
      throw new NgMetaClassConstuctionException(Object.class, theClass);
  }

  public ObjectMetaClassImpl() {
    this(Object.class);
  }

  @Override
  public RuntimeMetaClass createMetaClassFor(final Class theClass) {
    if (Object.class != theClass.getSuperclass() && !theClass.isInterface())
      throw new NgRuntimeException("Error when constucting MetaClass for " + theClass.getName()
                                   + " using the java.lang.Object MetaClass"
                                   + theClass.getName() + "is not a direct subclass of java.lang.Object "
                                   + " or an Interface");

    final RuntimeMetaClass customMetaClass = lookForCustomMetaClass(theClass);

    if (customMetaClass == null) {
      return new RuntimeMetaClassImpl(theClass);
    } else {
      return customMetaClass;
    }
  }
}
