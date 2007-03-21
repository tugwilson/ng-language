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
package ng.lang;

import junit.framework.TestCase;
import ng.runtime.NgInt;
import sun.misc.Queue;
import uk.co.wilson.ng.runtime.metaclass.NgIntMetaClass;

public class MetaClassRegistryTest extends TestCase {
  public void testMetaClassCreation() {
    assertEquals(NgSystem.metaClassRegistry.getMetaClass(Object.class), NgSystem.objectMetaClass);

    // load a class which does not directly extend java.lang.Object
    NgSystem.metaClassRegistry.getMetaClass(TestCase.class);

    // load a simple Interface
    NgSystem.metaClassRegistry.getMetaClass(Runnable.class);

    // load an interface which extends another Interface
    NgSystem.metaClassRegistry.getMetaClass(Queue.class);

    // Test that custom MetaClass loading works
    assertEquals(NgSystem.metaClassRegistry.getMetaClass(NgInt.class).getClass(), NgIntMetaClass.class);
  }
}
