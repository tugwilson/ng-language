import ng.lang.NgSystem;
import ng.runtime.NgBaseObject;
import ng.runtime.NgTyped;
import ng.runtime.ThreadContext;
import util.CustomMetaClass;

/*
 * Created on 2 Apr 2007
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
public class AdHocTest {

  final Object o = new NgTyped(new NgBaseObject(new CustomMetaClass()), NgBaseObject.class);

  public static void main(final String[] args) throws Throwable {
    new AdHocTest().test();
  }
  
  void test() throws Throwable {
    final ThreadContext tc = NgSystem.metaClassRegistry.getThreadContext();
    
    System.out.println(tc.call(this.o, new Object[]{}));
    System.out.println(tc.callQuick(this.o, 1));
  }
}