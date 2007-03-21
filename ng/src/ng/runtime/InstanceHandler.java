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
public interface InstanceHandler extends MetaClass {  
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
  
  /**
   * @param lhs
   * @param rhs
   * @return
   */
  Object reverseAdd(Object operand, Object rhs);
  
  /**
   * @param lhs
   * @param rhs
   * @return
   */
  Object reverseAddEquals(Object lhs, Object rhs);
  
  /**
   * @param lhs
   * @param rhs
   * @return
   */
  Object reverseSubtract(Object lhs, Object rhs);
  
  /**
   * @param lhs
   * @param rhs
   * @return
   */
  Object reverseSubtractEquals(Object lhs, Object rhs);
  
  /**
   * @param lhs
   * @param rhs
   * @return
   */
  Object reverseMultiply(Object lhs, Object rhs);
  
  /**
   * @param lhs
   * @param rhs
   * @return
   */
  Object reverseMultiplyEquals(Object lhs, Object rhs);
  
  /**
   * @param lhs
   * @param rhs
   * @return
   */
  Object reverseDivide(Object lhs, Object rhs);
  
  /**
   * @param lhs
   * @param rhs
   * @return
   */
  Object reverseDivideEquals(Object lhs, Object rhs);
  
  /**
   * @param lhs
   * @param rhs
   * @return
   */
  Object reverseRemainder(Object lhs, Object rhs);
  
  /**
   * @param lhs
   * @param rhs
   * @return
   */
  Object reverseRemainderEquals(Object lhs, Object rhs);
  
  /**
   * @param lhs
   * @param rhs
   * @return
   */
  Object reverseIntegerDivide(Object lhs, Object rhs);
  
  /**
   * @param lhs
   * @param rhs
   * @return
   */
  Object reverseIntegerDivideEquals(Object lhs, Object rhs);
  
  /**
   * @param lhs
   * @param rhs
   * @return
   */
  Object reverseAnd(Object lhs, Object rhs);
  
  /**
   * @param lhs
   * @param rhs
   * @return
   */
  Object reverseAndEquals(Object lhs, Object rhs);
  
  /**
   * @param lhs
   * @param rhs
   * @return
   */
  Object reverseOr(Object lhs, Object rhs);
  
  /**
   * @param lhs
   * @param rhs
   * @return
   */
  Object reverseOrEquals(Object lhs, Object rhs);
  
  /**
   * @param lhs
   * @param rhs
   * @return
   */
  Object reverseXor(Object lhs, Object rhs);
  
  /**
   * @param lhs
   * @param rhs
   * @return
   */
  Object reverseXorEquals(Object lhs, Object rhs);
  
  /**
   * @param lhs
   * @param rhs
   * @return
   */
  Object reverseLeftShift(Object lhs, Object rhs);
  
  /**
   * @param lhs
   * @param rhs
   * @return
   */
  Object reverseLeftShiftEquals(Object lhs, Object rhs);
  
  /**
   * @param lhs
   * @param rhs
   * @return
   */
  Object reverseArithmeticRightShift(Object lhs, Object rhs);
  
  /**
   * @param lhs
   * @param rhs
   * @return
   */
  Object reverseArithmeticRightShiftEquals(Object lhs, Object rhs);
  
  /**
   * @param lhs
   * @param rhs
   * @return
   */
  Object reverseLogicalRightShift(Object lhs, Object rhs);
  
  /**
   * @param lhs
   * @param rhs
   * @return
   */
  Object reverseLogicalRightShiftEquals(Object lhs, Object rhs);
  
  /**
   * @param lhs
   * @param rhs
   * @return
   */
  Object reverseCompare(Object lhs, Object rhs);
  
  /**
   * @param lhs
   * @param rhs
   * @return
   */
  Object reverseEquals(Object lhs, Object rhs);
  
  /**
   * @param lhs
   * @param rhs
   * @return
   */
  Object reverseNotEquals(Object lhs, Object rhs);
  
  /**
   * @param lhs
   * @param rhs
   * @return
   */
  Object reverseLessThan(Object lhs, Object rhs);
  
  /**
   * @param lhs
   * @param rhs
   * @return
   */
  Object reverseGreaterThan(Object lhs, Object rhs);
  
  /**
   * @param lhs
   * @param rhs
   * @return
   */
  Object reverseLessThanOrEquals(Object lhs, Object rhs);
  
  /**
   * @param lhs
   * @param rhs
   * @return
   */
  Object reverseGreaterThanOrEquals(Object lhs, Object rhs);
}
