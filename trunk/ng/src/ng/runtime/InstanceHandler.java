package ng.runtime;
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
public interface InstanceHandler {
  /**
   * @param theClass 
   * @param arguments
   * @return an instance of the Class represented by the MetaClass
   */
  Object invokeConstructor(Class theClass, Object[] arguments);
  /**
   * @param instance
   * @param methodName
   * @param arguments
   * @return the result of invoking the method on the instance with the supplied
   *         parameters.
   */
  Object invokeMethod(Object instance, String methodName, Object[] arguments);
  
  /**
   * @param instance
   * @param methodName
   * @return
   */
  Object invokeMethod(Object instance, String methodName);
  
  /**
   * @param instance
   * @param methodName
   * @param p1
   * @return
   */
  Object invokeMethod(Object instance, String methodName, Object p1);
  
  /**
   * @param instance
   * @param methodName
   * @param p1
   * @param p2
   * @return
   */
  Object invokeMethod(Object instance, String methodName, Object p1, Object p2);
  
  /**
   * @param instance
   * @param methodName
   * @param p1
   * @param p2
   * @param p3
   * @return
   */
  Object invokeMethod(Object instance, String methodName, Object p1, Object p2, Object p3);
  
  /**
   * @param instance
   * @param methodName
   * @param p1
   * @param p2
   * @param p3
   * @param p4
   * @return
   */
  Object invokeMethod(Object instance, String methodName, Object p1, Object p2, Object p3, Object p4);

  /**
   * @param instance
   * @param propertyName
   * @return
   */
  Object getProperty(Object instance, String propertyName);

  /**
   * @param instance
   * @param propertyName
   * @param newValue
   * @return
   */
  Object setProperty(Object instance, String propertyName, Object newValue);

  /**
   * @param instance
   * @param fieldName
   * @return
   */
  Object getField(Object instance, String fieldName);

  /**
   * @param instance
   * @param fieldName
   * @param newValue
   * @return
   */
  Object setField(Object instance, String fieldName, Object newValue);
  
  /**
   * @param instance
   * @param arguments
   * @return
   */
  Object call(Object instance, Object[] arguments);
  
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
