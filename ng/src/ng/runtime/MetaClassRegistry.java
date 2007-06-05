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
package ng.runtime;


public interface MetaClassRegistry {
  /**
   * @return
   */
  ThreadContext getThreadContext();
  
  /**
   * @param theClass
   * @return The MetaClass associated with the Class
   */
  MetaClass getMetaClass(Class theClass);

  /**
   * @param context
   * @param theClass
   * @return
   */
  MetaClass getMetaClass(ThreadContext context, Class theClass);

  /**
   * @param theInstance
   * @return The MetaClass associated with the Class of the instance
   */
  MetaClass getMetaClass(Object theInstance);
  
  /**
   * @param context
   * @param theInstance
   * @return
   */
  MetaClass getMetaClass(ThreadContext context, Object theInstance);
  
  /**
   * @param theClass
   * @return The RuntimeMetaClass associated with the Class
   */
  RuntimeMetaClass getRuntimeMetaClass(Class theClass);

  /**
   * @param context
   * @param theClass
   * @return
   */
  RuntimeMetaClass getRuntimeMetaClass(ThreadContext context, Class theClass);

  /**
   * @param theInstance
   * @return The RuntimeMetaClass associated with the Class of the instance
   */
  RuntimeMetaClass getRuntimeMetaClass(Object theInstance);
  
  /**
   * @param context
   * @param theInstance
   * @return
   */
  RuntimeMetaClass getRuntimeMetaClass(ThreadContext context, Object theInstance);
  
  /**
   * @param theClass
   * @return The InternalMetaClass associated with the Class
   */
  InternalMetaClass getInternalMetaClass(Class theClass);

  /**
   * @param context
   * @param theClass
   * @return
   */
  InternalMetaClass getInternalMetaClass(ThreadContext context, Class theClass);

  /**
   * @param theInstance
   * @return The InternalMetaClass associated with the Class of the instance
   */
  InternalMetaClass getInternalMetaClass(Object theInstance);
  
  /**
   * @param context
   * @param theInstance
   * @return
   */
  InternalMetaClass getInternalMetaClass(ThreadContext context, Object theInstance);
}
