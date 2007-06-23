package ng.runtime;

import java.math.BigDecimal;
import java.math.BigInteger;
/*
 * Created on 5 Jun 2007
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
public interface ThreadContext {
  RuntimeMetaClass getRuntimeMetaClass(Class theClass);
  
  /**
   * @param instance
   * @param methodName
   * @param arguments
   * @return the result of invoking the method on the instance with the supplied
   *         parameters.
   */
  Object invokeMethod(Object instance, String methodName, Object[] arguments) throws Throwable;
  
  /**
   * @param instance
   * @param methodName
   * @return
   */
  Object invokeMethodQuick(Object instance, String methodName) throws Throwable;
  
  /**
   * @param instance
   * @param methodName
   * @param p1
   * @return
   */
  Object invokeMethodQuick(Object instance, String methodName, Object p1) throws Throwable;
  
  /**
   * @param instance
   * @param methodName
   * @param p1
   * @return
   */
  Object invokeMethodQuick(Object instance, String methodName, boolean p1) throws Throwable;
  
  /**
   * @param instance
   * @param methodName
   * @param p1
   * @return
   */
  Object invokeMethodQuick(Object instance, String methodName, char p1) throws Throwable;
  
  /**
   * @param instance
   * @param methodName
   * @param p1
   * @return
   */
  Object invokeMethodQuick(Object instance, String methodName, byte p1) throws Throwable;
  
  /**
   * @param instance
   * @param methodName
   * @param p1
   * @return
   */
  Object invokeMethodQuick(Object instance, String methodName, short p1) throws Throwable;
  
  /**
   * @param instance
   * @param methodName
   * @param p1
   * @return
   */
  Object invokeMethodQuick(Object instance, String methodName, int p1) throws Throwable;
  
  /**
   * @param instance
   * @param methodName
   * @param p1
   * @return
   */
  Object invokeMethodQuick(Object instance, String methodName, long p1) throws Throwable;
  
  /**
   * @param instance
   * @param methodName
   * @param p1
   * @return
   */
  Object invokeMethodQuick(Object instance, String methodName, float p1) throws Throwable;
  
  /**
   * @param instance
   * @param methodName
   * @param p1
   * @return
   */
  Object invokeMethodQuick(Object instance, String methodName, double p1) throws Throwable;
  
  /**
   * @param instance
   * @param methodName
   * @param p1
   * @return
   */
  Object invokeMethodQuick(Object instance, String methodName, BigInteger p1) throws Throwable;
  
  /**
   * @param instance
   * @param methodName
   * @param p1
   * @return
   */
  Object invokeMethodQuick(Object instance, String methodName, BigDecimal p1) throws Throwable;
  
  /**
   * @param instance
   * @param methodName
   * @param p1
   * @param p2
   * @return
   */
  Object invokeMethodQuick(Object instance, String methodName, Object p1, Object p2) throws Throwable;
  
  /**
   * @param instance
   * @param methodName
   * @param p1
   * @param p2
   * @param p3
   * @return
   */
  Object invokeMethodQuick(Object instance, String methodName, Object p1, Object p2, Object p3) throws Throwable;
  
  /**
   * @param instance
   * @param methodName
   * @param p1
   * @param p2
   * @param p3
   * @param p4
   * @return
   */
  Object invokeMethodQuick(Object instance, String methodName, Object p1, Object p2, Object p3, Object p4) throws Throwable;
  
  /**
   * @param metaClass
   * @param instance
   * @param methodName
   * @param arguments
   * @return the result of invoking the method on the instance with the supplied
   *         parameters.
   */
  Object invokeMethod(RuntimeMetaClass metaClass,Object instance, String methodName, Object[] arguments) throws Throwable;
  
  /**
   * @param metaClass
   * @param instance
   * @param methodName
   * @return
   * @throws Throwable
   */
  Object invokeMethodQuick(RuntimeMetaClass metaClass, Object instance, String methodName) throws Throwable;
  
  /**
   * @param metaClass
   * @param instance
   * @param methodName
   * @param p1
   * @return
   */
  Object invokeMethodQuick(RuntimeMetaClass metaClass, Object instance, String methodName, Object p1) throws Throwable;
  
  /**
   * @param metaClass
   * @param instance
   * @param methodName
   * @param p1
   * @return
   */
  Object invokeMethodQuick(RuntimeMetaClass metaClass, Object instance, String methodName, boolean p1) throws Throwable;
  
  /**
   * @param metaClass
   * @param instance
   * @param methodName
   * @param p1
   * @return
   */
  Object invokeMethodQuick(RuntimeMetaClass metaClass, Object instance, String methodName, char p1) throws Throwable;
  
  /**
   * @param metaClass
   * @param instance
   * @param methodName
   * @param p1
   * @return
   */
  Object invokeMethodQuick(RuntimeMetaClass metaClass, Object instance, String methodName, byte p1) throws Throwable;
  
  /**
   * @param metaClass
   * @param instance
   * @param methodName
   * @param p1
   * @return
   */
  Object invokeMethodQuick(RuntimeMetaClass metaClass, Object instance, String methodName, short p1) throws Throwable;
  
  /**
   * @param metaClass
   * @param instance
   * @param methodName
   * @param p1
   * @return
   */
  Object invokeMethodQuick(RuntimeMetaClass metaClass, Object instance, String methodName, int p1) throws Throwable;
  
  /**
   * @param metaClass
   * @param instance
   * @param methodName
   * @param p1
   * @return
   */
  Object invokeMethodQuick(RuntimeMetaClass metaClass, Object instance, String methodName, long p1) throws Throwable;
  
  /**
   * @param metaClass
   * @param instance
   * @param methodName
   * @param p1
   * @return
   */
  Object invokeMethodQuick(RuntimeMetaClass metaClass, Object instance, String methodName, float p1) throws Throwable;
  
  /**
   * @param metaClass
   * @param instance
   * @param methodName
   * @param p1
   * @return
   */
  Object invokeMethodQuick(RuntimeMetaClass metaClass, Object instance, String methodName, double p1) throws Throwable;
  
  /**
   * @param metaClass
   * @param instance
   * @param methodName
   * @param p1
   * @return
   */
  Object invokeMethodQuick(RuntimeMetaClass metaClass, Object instance, String methodName, BigInteger p1) throws Throwable;
  
  /**
   * @param metaClass
   * @param instance
   * @param methodName
   * @param p1
   * @return
   */
  Object invokeMethodQuick(RuntimeMetaClass metaClass, Object instance, String methodName, BigDecimal p1) throws Throwable;
  
  /**
   * @param metaClass
   * @param instance
   * @param methodName
   * @param p1
   * @param p2
   * @return
   */
  Object invokeMethodQuick(RuntimeMetaClass metaClass, Object instance, String methodName, Object p1, Object p2) throws Throwable;
  
  /**
   * @param metaClass
   * @param instance
   * @param methodName
   * @param p1
   * @param p2
   * @param p3
   * @return
   */
  Object invokeMethodQuick(RuntimeMetaClass metaClass, Object instance, String methodName, Object p1, Object p2, Object p3) throws Throwable;
  
  /**
   * @param metaClass
   * @param instance
   * @param methodName
   * @param p1
   * @param p2
   * @param p3
   * @param p4
   * @return
   */
  Object invokeMethodQuick(RuntimeMetaClass metaClass, Object instance, String methodName, Object p1, Object p2, Object p3, Object p4) throws Throwable;
  
  /**
   * @param instance
   * @param arguments
   * @return
   */
  Object call(Object instance, Object[] arguments) throws Throwable;
  
  /**
   * @param instance
   * @return
   */
  Object callQuick(Object instance) throws Throwable;
  
  /**
   * @param instance
   * @param p1
   * @return
   */
  Object callQuick(Object instance, Object p1) throws Throwable;
  
  /**
   * @param instance
   * @param p1
   * @return
   */
  Object callQuick(Object instance, boolean p1) throws Throwable;
  
  /**
   * @param instance
   * @param p1
   * @return
   */
  Object callQuick(Object instance, char p1) throws Throwable;
  
  /**
   * @param instance
   * @param p1
   * @return
   */
  Object callQuick(Object instance, byte p1) throws Throwable;
  
  /**
   * @param instance
   * @param p1
   * @return
   */
  Object callQuick(Object instance, short p1) throws Throwable;
  
  /**
   * @param instance
   * @param p1
   * @return
   */
  Object callQuick(Object instance, int p1) throws Throwable;
  
  /**
   * @param instance
   * @param p1
   * @return
   */
  Object callQuick(Object instance, long p1) throws Throwable;
  
  /**
   * @param instance
   * @param p1
   * @return
   */
  Object callQuick(Object instance, float p1) throws Throwable;
  
  /**
   * @param instance
   * @param p1
   * @return
   */
  Object callQuick(Object instance, double p1) throws Throwable;
  
  /**
   * @param instance
   * @param p1
   * @return
   */
  Object callQuick(Object instance, BigInteger p1) throws Throwable;
  
  /**
   * @param instance
   * @param p1
   * @return
   */
  Object callQuick(Object instance, BigDecimal p1) throws Throwable;
  
  /**
   * @param instance
   * @param p1
   * @param p2
   * @return
   */
  Object callQuick(Object instance, Object p1, Object p2) throws Throwable;
  
  /**
   * @param instance
   * @param p1
   * @param p2
   * @param p3
   * @return
   */
  Object callQuick(Object instance, Object p1, Object p2, Object p3) throws Throwable;
  
  /**
   * @param instance
   * @param p1
   * @param p2
   * @param p3
   * @param p4
   * @return
   */
  Object callQuick(Object instance, Object p1, Object p2, Object p3, Object p4) throws Throwable;
  
  /**
   * @param metaClass
   * @param instance
   * @param arguments
   * @return
   */
  Object call(RuntimeMetaClass metaClass, Object instance, Object[] arguments) throws Throwable;
  
  /**
   * @param instance
   * @return
   */
  Object callQuick(RuntimeMetaClass metaClass, Object instance) throws Throwable;
  
  /**
   * @param metaClass
   * @param instance
   * @param p1
   * @return
   */
  Object callQuick(RuntimeMetaClass metaClass, Object instance, Object p1) throws Throwable;
  
  /**
   * @param metaClass
   * @param instance
   * @param p1
   * @return
   */
  Object callQuick(RuntimeMetaClass metaClass, Object instance, boolean p1) throws Throwable;
  
  /**
   * @param metaClass
   * @param instance
   * @param p1
   * @return
   */
  Object callQuick(RuntimeMetaClass metaClass, Object instance, char p1) throws Throwable;
  
  /**
   * @param metaClass
   * @param instance
   * @param p1
   * @return
   */
  Object callQuick(RuntimeMetaClass metaClass, Object instance, byte p1) throws Throwable;
  
  /**
   * @param metaClass
   * @param instance
   * @param p1
   * @return
   */
  Object callQuick(RuntimeMetaClass metaClass, Object instance, short p1) throws Throwable;
  
  /**
   * @param metaClass
   * @param instance
   * @param p1
   * @return
   */
  Object callQuick(RuntimeMetaClass metaClass, Object instance, int p1) throws Throwable;
  
  /**
   * @param metaClass
   * @param instance
   * @param p1
   * @return
   */
  Object callQuick(RuntimeMetaClass metaClass, Object instance, long p1) throws Throwable;
  
  /**
   * @param metaClass
   * @param instance
   * @param p1
   * @return
   */
  Object callQuick(RuntimeMetaClass metaClass, Object instance, float p1) throws Throwable;
  
  /**
   * @param metaClass
   * @param instance
   * @param p1
   * @return
   */
  Object callQuick(RuntimeMetaClass metaClass, Object instance, double p1) throws Throwable;
  
  /**
   * @param metaClass
   * @param instance
   * @param p1
   * @return
   */
  Object callQuick(RuntimeMetaClass metaClass, Object instance, BigInteger p1) throws Throwable;
  
  /**
   * @param metaClass
   * @param instance
   * @param p1
   * @return
   */
  Object callQuick(RuntimeMetaClass metaClass, Object instance, BigDecimal p1) throws Throwable;
  
  /**
   * @param metaClass
   * @param instance
   * @param p1
   * @param p2
   * @return
   */
  Object callQuick(RuntimeMetaClass metaClass, Object instance, Object p1, Object p2) throws Throwable;
  
  /**
   * @param metaClass
   * @param instance
   * @param p1
   * @param p2
   * @param p3
   * @return
   */
  Object callQuick(RuntimeMetaClass metaClass, Object instance, Object p1, Object p2, Object p3) throws Throwable;
  
  /**
   * @param metaClass
   * @param instance
   * @param p1
   * @param p2
   * @param p3
   * @param p4
   * @return
   */
  Object callQuick(RuntimeMetaClass metaClass, Object instance, Object p1, Object p2, Object p3, Object p4) throws Throwable;
}
