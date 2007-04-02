package ng.runtime;

import uk.co.wilson.ng.runtime.metaclass.reflection.MetaMethodSelection;
/*
 * Created on 21 Mar 2007
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
public interface MetaMethod {
  /**
   * @param metaMethod
   * @return
   */
  MetaMethod addMetaMethod(MetaMethod metaMethod);
  
  /**
   * @param instance
   * @param arguments
   * @return
   */
  Object call(Object instance, Object[] arguments);
  
  MetaMethodSelection selectMethod(MetaMethodSelection currentSelection, RuntimeMetaClass[] argumentMetaClasses);
  
  MetaMethodSelection selectMethod(RuntimeMetaClass[] argumentMetaClasses);
  
  /**
   * @param instance
   * @return
   */
  Object call(Object instance);
  
  /**
   * @param instance
   * @param p1
   * @return
   */
  Object call(Object instance, Object p1);
  
  /**
   * @param instance
   * @param p1
   * @param p2
   * @return
   */
  Object call(Object instance, Object p1, Object p2);
  
  /**
   * @param instance
   * @param p1
   * @param p2
   * @param p3
   * @return
   */
  Object call(Object instance, Object p1, Object p2, Object p3);
  
  /**
   * @param instance
   * @param p1
   * @param p2
   * @param p3
   * @param p4
   * @return
   */
  Object call(Object instance, Object p1, Object p2, Object p3, Object p4);
}