package uk.co.wilson.ng.runtime.metaclass;

import ng.lang.NgRuntimeException;
import ng.runtime.InstanceHandler;
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
import ng.runtime.MetaMethod;

/**
 * @author tug
 *
 */
public class InstanceReflectionHandler implements InstanceHandler {
  private static final MetaMethod noMethod = new MetaMethod() {

    /* (non-Javadoc)
     * @see ng.runtime.MetaMethod#call(java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object)
     */
    public Object call(Object instance, Object p1, Object p2, Object p3, Object p4) {
      return RuntimeMetaClassImpl.NOT_CALLED;
    }

    /* (non-Javadoc)
     * @see ng.runtime.MetaMethod#call(java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object)
     */
    public Object call(Object instance, Object p1, Object p2, Object p3) {
      return RuntimeMetaClassImpl.NOT_CALLED;
    }

    /* (non-Javadoc)
     * @see ng.runtime.MetaMethod#call(java.lang.Object, java.lang.Object, java.lang.Object)
     */
    public Object call(Object instance, Object p1, Object p2) {
      return RuntimeMetaClassImpl.NOT_CALLED;
    }

    /* (non-Javadoc)
     * @see ng.runtime.MetaMethod#call(java.lang.Object, java.lang.Object)
     */
    public Object call(Object instance, Object p1) {
      return RuntimeMetaClassImpl.NOT_CALLED;
    }

    /* (non-Javadoc)
     * @see ng.runtime.MetaMethod#call(java.lang.Object, java.lang.Object[])
     */
    public Object call(Object instance, Object[] arguments) {
      return RuntimeMetaClassImpl.NOT_CALLED;
    }

    /* (non-Javadoc)
     * @see ng.runtime.MetaMethod#call(java.lang.Object)
     */
    public Object call(Object instance) {
      return RuntimeMetaClassImpl.NOT_CALLED;
    }
  };
  
  private final Class theClass;
  private final MetaMethod add = noMethod;
  private final MetaMethod addEquals = noMethod;
  private final MetaMethod and = noMethod;
  private final MetaMethod andEquals = noMethod;
  private final MetaMethod arithmeticRightShift = noMethod;
  private final MetaMethod arithmeticRightShiftEquals = noMethod;
  private final MetaMethod asType = noMethod;
  private final MetaMethod compare = noMethod;
  private final MetaMethod complement = noMethod;
  private final MetaMethod divide = noMethod;
  private final MetaMethod divideEquals = noMethod;
  private final MetaMethod equals = noMethod;
  private final MetaMethod getAt = noMethod;
  private final MetaMethod greaterThan = noMethod;
  private final MetaMethod greaterThanOrEquals = noMethod;
  private final MetaMethod integerDivide = noMethod;
  private final MetaMethod integerDivideEquals = noMethod;
  private final MetaMethod isCase = noMethod;
  private final MetaMethod isInstanceof = noMethod;
  private final MetaMethod leftShift = noMethod;
  private final MetaMethod leftShiftEquals = noMethod;
  private final MetaMethod lessThan = noMethod;
  private final MetaMethod lessThanOrEquals = noMethod;
  private final MetaMethod logicalRightShift = noMethod;
  private final MetaMethod logicalRightShiftEquals = noMethod;
  private final MetaMethod multiply = noMethod;
  private final MetaMethod multiplyEquals = noMethod;
  private final MetaMethod not = noMethod;
  private final MetaMethod notEquals = noMethod;
  private final MetaMethod or = noMethod;
  private final MetaMethod orEquals = noMethod;
  private final MetaMethod postfixDecrement = noMethod;
  private final MetaMethod postfixIncrement = noMethod;
  private final MetaMethod prefixDecrement = noMethod;
  private final MetaMethod prefixIncrement = noMethod;
  private final MetaMethod putAt = noMethod;
  private final MetaMethod remainder = noMethod;
  private final MetaMethod remainderEquals = noMethod;
  private final MetaMethod subtract = noMethod;
  private final MetaMethod subtractEquals = noMethod;
  private final MetaMethod unaryMinus = noMethod;
  private final MetaMethod unaryPlus = noMethod;
  private final MetaMethod xor = noMethod;
  private final MetaMethod xorEquals = noMethod;

  /**
   * @param theClass
   */
  public InstanceReflectionHandler(final Class theClass) {
    this.theClass = theClass;
  }

  /**
   * @return the theClass
   */
  public Class getTheClass(final Object instance) {
    return this.theClass;
  }

  /* (non-Javadoc)
   * @see ng.runtime.InstanceHandler#invokeConstructor(java.lang.Class, java.lang.Object[])
   */
  public Object invokeConstructor(final Class theClass, final Object[] arguments) {
    return RuntimeMetaClassImpl.NOT_CONSTRUCTED;
  }

  /* (non-Javadoc)
   * @see ng.runtime.InstanceHandler#invokeMethod(java.lang.Object, java.lang.String, java.lang.Object[])
   */
  public Object invokeMethod(final Object instance, final String methodName, final Object[] arguments) {
    if(arguments.length <= 4)
      throw new NgRuntimeException("Internal Error invokeMethod called with an array of " + arguments.length +" parameters");
    
    return RuntimeMetaClassImpl.NOT_CALLED;
  }

  /* (non-Javadoc)
   * @see ng.runtime.InstanceHandler#invokeMethod(java.lang.Object, java.lang.String)
   */
  public Object invokeMethod(final Object instance, final String methodName) {
    return RuntimeMetaClassImpl.NOT_CALLED;
  }

  /* (non-Javadoc)
   * @see ng.runtime.InstanceHandler#invokeMethod(java.lang.Object, java.lang.String, java.lang.Object)
   */
  public Object invokeMethod(final Object instance, final String methodName, final Object p1) {
    return RuntimeMetaClassImpl.NOT_CALLED;
  }

  /* (non-Javadoc)
   * @see ng.runtime.InstanceHandler#invokeMethod(java.lang.Object, java.lang.String, java.lang.Object, java.lang.Object)
   */
  public Object invokeMethod(final Object instance, final String methodName, final Object p1, final Object p2) {
    return RuntimeMetaClassImpl.NOT_CALLED;
  }

  /* (non-Javadoc)
   * @see ng.runtime.InstanceHandler#invokeMethod(java.lang.Object, java.lang.String, java.lang.Object, java.lang.Object, java.lang.Object)
   */
  public Object invokeMethod(final Object instance, final String methodName, final Object p1, final Object p2, final Object p3) {
    return RuntimeMetaClassImpl.NOT_CALLED;
  }

  /* (non-Javadoc)
   * @see ng.runtime.InstanceHandler#invokeMethod(java.lang.Object, java.lang.String, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object)
   */
  public Object invokeMethod(final Object instance, final String methodName, final Object p1, final Object p2, final Object p3, final Object p4) {
    return RuntimeMetaClassImpl.NOT_CALLED;
  }

  /* (non-Javadoc)
   * @see ng.runtime.InstanceHandler#getProperty(java.lang.Object, java.lang.String)
   */
  public Object getProperty(final Object instance, final String propertyName) {
    return RuntimeMetaClassImpl.NO_PROPERTY;
  }

  /* (non-Javadoc)
   * @see ng.runtime.InstanceHandler#setProperty(java.lang.Object, java.lang.String, java.lang.Object)
   */
  public Object setProperty(final Object instance, final String propertyName, final Object newValue) {
    return RuntimeMetaClassImpl.NO_PROPERTY;
  }

  /* (non-Javadoc)
   * @see ng.runtime.InstanceHandler#getField(java.lang.Object, java.lang.String)
   */
  public Object getField(final Object instance, final String fieldName) {
    return RuntimeMetaClassImpl.NO_FIELD;
  }

  /* (non-Javadoc)
   * @see ng.runtime.InstanceHandler#setField(java.lang.Object, java.lang.String, java.lang.Object)
   */
  public Object setField(final Object instance, final String fieldName, final Object newValue) {
    return RuntimeMetaClassImpl.NO_FIELD;
  }

  /* (non-Javadoc)
   * @see ng.runtime.InstanceHandler#call(java.lang.Object, java.lang.Object[])
   */
  public Object call(final Object instance, final Object[] arguments) {
    if(arguments.length <= 4)
      throw new NgRuntimeException("Internal Error call called with an array of " + arguments.length +" parameters");
    
    return RuntimeMetaClassImpl.NOT_CALLED;
  }

  /* (non-Javadoc)
   * @see ng.runtime.InstanceHandler#call(java.lang.Object)
   */
  public Object call(final Object instance) {
    return RuntimeMetaClassImpl.NOT_CALLED;
  }

  /* (non-Javadoc)
   * @see ng.runtime.InstanceHandler#call(java.lang.Object, java.lang.Object)
   */
  public Object call(final Object instance, final Object p1) {
    return RuntimeMetaClassImpl.NOT_CALLED;
  }

  /* (non-Javadoc)
   * @see ng.runtime.InstanceHandler#call(java.lang.Object, java.lang.Object, java.lang.Object)
   */
  public Object call(final Object instance, final Object p1, final Object p2) {
    return RuntimeMetaClassImpl.NOT_CALLED;
  }

  /* (non-Javadoc)
   * @see ng.runtime.InstanceHandler#call(java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object)
   */
  public Object call(final Object instance, final Object p1, final Object p2, final Object p3) {
    return RuntimeMetaClassImpl.NOT_CALLED;
  }

  /* (non-Javadoc)
   * @see ng.runtime.InstanceHandler#call(java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object)
   */
  public Object call(final Object instance, final Object p1, final Object p2, final Object p3, final Object p4) {
    return RuntimeMetaClassImpl.NOT_CALLED;
  }

  /* (non-Javadoc)
   * @see ng.runtime.MetaClass#add(java.lang.Object, java.lang.Object)
   */
  public Object add(final Object lhs, final Object rhs) {
    return this.add.call(lhs, rhs);
  }

  /* (non-Javadoc)
   * @see ng.runtime.MetaClass#addEquals(java.lang.Object, java.lang.Object)
   */
  public Object addEquals(final Object lhs, final Object rhs) {
    return this.addEquals.call(lhs, rhs);
  }

  /* (non-Javadoc)
   * @see ng.runtime.MetaClass#and(java.lang.Object, java.lang.Object)
   */
  public Object and(final Object lhs, final Object rhs) {
    return this.and.call(lhs, rhs);
  }

  /* (non-Javadoc)
   * @see ng.runtime.MetaClass#andEquals(java.lang.Object, java.lang.Object)
   */
  public Object andEquals(final Object lhs, final Object rhs) {
    return this.andEquals.call(lhs, rhs);
  }

  /* (non-Javadoc)
   * @see ng.runtime.MetaClass#arithmeticRightShift(java.lang.Object, java.lang.Object)
   */
  public Object arithmeticRightShift(final Object lhs, final Object rhs) {
    return this.arithmeticRightShift.call(lhs, rhs);
  }

  /* (non-Javadoc)
   * @see ng.runtime.MetaClass#arithmeticRightShiftEquals(java.lang.Object, java.lang.Object)
   */
  public Object arithmeticRightShiftEquals(final Object lhs, final Object rhs) {
    return this.arithmeticRightShiftEquals.call(lhs, rhs);
  }

  /* (non-Javadoc)
   * @see ng.runtime.MetaClass#asType(java.lang.Object, java.lang.Class)
   */
  public Object asType(final Object instance, Class type) {
    return this.asType.call(instance, type);
  }

  /* (non-Javadoc)
   * @see ng.runtime.MetaClass#compare(java.lang.Object, java.lang.Object)
   */
  public Object compare(final Object lhs, final Object rhs) {
    return this.compare.call(lhs, rhs);
  }

  /* (non-Javadoc)
   * @see ng.runtime.MetaClass#complement(java.lang.Object)
   */
  public Object complement(final Object instance) {
    return this.complement.call(instance);
  }

  /* (non-Javadoc)
   * @see ng.runtime.MetaClass#divide(java.lang.Object, java.lang.Object)
   */
  public Object divide(final Object lhs, final Object rhs) {
    return this.divide.call(lhs, rhs);
  }

  /* (non-Javadoc)
   * @see ng.runtime.MetaClass#divideEquals(java.lang.Object, java.lang.Object)
   */
  public Object divideEquals(final Object lhs, final Object rhs) {
    return this.divideEquals.call(lhs, rhs);
  }

  /* (non-Javadoc)
   * @see ng.runtime.MetaClass#equals(java.lang.Object, java.lang.Object)
   */
  public Object equals(final Object lhs, final Object rhs) {
    return this.equals.call(lhs, rhs);
  }

  /* (non-Javadoc)
   * @see ng.runtime.MetaClass#getAt(java.lang.Object, java.lang.Object)
   */
  public Object getAt(final Object instance, final Object index) {
    return this.getAt.call(instance, index);
  }

  /* (non-Javadoc)
   * @see ng.runtime.MetaClass#greaterThan(java.lang.Object, java.lang.Object)
   */
  public Object greaterThan(final Object lhs, final Object rhs) {
    return this.greaterThan.call(lhs, rhs);
  }

  /* (non-Javadoc)
   * @see ng.runtime.MetaClass#greaterThanOrEquals(java.lang.Object, java.lang.Object)
   */
  public Object greaterThanOrEquals(final Object lhs, final Object rhs) {
    return this.greaterThanOrEquals.call(lhs, rhs);
  }

  /* (non-Javadoc)
   * @see ng.runtime.MetaClass#integerDivide(java.lang.Object, java.lang.Object)
   */
  public Object integerDivide(final Object lhs, final Object rhs) {
    return this.integerDivide.call(lhs, rhs);
  }

  /* (non-Javadoc)
   * @see ng.runtime.MetaClass#integerDivideEquals(java.lang.Object, java.lang.Object)
   */
  public Object integerDivideEquals(final Object lhs, final Object rhs) {
    return this.integerDivideEquals.call(lhs, rhs);
  }

  /* (non-Javadoc)
   * @see ng.runtime.MetaClass#isCase(java.lang.Object, java.lang.Object)
   */
  public Object isCase(final Object instance, final Object rhs) {
    return this.isCase.call(instance, rhs);
  }

  /* (non-Javadoc)
   * @see ng.runtime.MetaClass#isInstanceof(java.lang.Object, java.lang.Class)
   */
  public Object isInstanceof(final Object instance, Class type) {
    return this.isInstanceof.call(instance, type);
  }

  /* (non-Javadoc)
   * @see ng.runtime.MetaClass#leftShift(java.lang.Object, java.lang.Object)
   */
  public Object leftShift(final Object lhs, final Object rhs) {
    return this.leftShift.call(lhs, rhs);
  }

  /* (non-Javadoc)
   * @see ng.runtime.MetaClass#leftShiftEquals(java.lang.Object, java.lang.Object)
   */
  public Object leftShiftEquals(final Object lhs, final Object rhs) {
    return this.leftShiftEquals.call(lhs, rhs);
  }

  /* (non-Javadoc)
   * @see ng.runtime.MetaClass#lessThan(java.lang.Object, java.lang.Object)
   */
  public Object lessThan(final Object lhs, final Object rhs) {
    return this.lessThan.call(lhs, rhs);
  }

  /* (non-Javadoc)
   * @see ng.runtime.MetaClass#lessThanOrEquals(java.lang.Object, java.lang.Object)
   */
  public Object lessThanOrEquals(final Object lhs, final Object rhs) {
    return this.lessThanOrEquals.call(lhs, rhs);
  }

  /* (non-Javadoc)
   * @see ng.runtime.MetaClass#logicalRightShift(java.lang.Object, java.lang.Object)
   */
  public Object logicalRightShift(final Object lhs, final Object rhs) {
    return this.logicalRightShift.call(lhs, rhs);
  }

  /* (non-Javadoc)
   * @see ng.runtime.MetaClass#logicalRightShiftEquals(java.lang.Object, java.lang.Object)
   */
  public Object logicalRightShiftEquals(final Object lhs, final Object rhs) {
    return this.logicalRightShiftEquals.call(lhs, rhs);
  }

  /* (non-Javadoc)
   * @see ng.runtime.MetaClass#multiply(java.lang.Object, java.lang.Object)
   */
  public Object multiply(final Object lhs, final Object rhs) {
    return this.multiply.call(lhs, rhs);
  }

  /* (non-Javadoc)
   * @see ng.runtime.MetaClass#multiplyEquals(java.lang.Object, java.lang.Object)
   */
  public Object multiplyEquals(final Object lhs, final Object rhs) {
    return this.multiplyEquals.call(lhs, rhs);
  }

  /* (non-Javadoc)
   * @see ng.runtime.MetaClass#not(java.lang.Object)
   */
  public Object not(final Object operand) {
    return this.not.call(operand);
  }

  /* (non-Javadoc)
   * @see ng.runtime.MetaClass#notEquals(java.lang.Object, java.lang.Object)
   */
  public Object notEquals(final Object lhs, final Object rhs) {
    return this.notEquals.call(lhs, rhs);
  }

  /* (non-Javadoc)
   * @see ng.runtime.MetaClass#or(java.lang.Object, java.lang.Object)
   */
  public Object or(final Object lhs, final Object rhs) {
    return this.or.call(lhs, rhs);
  }

  /* (non-Javadoc)
   * @see ng.runtime.MetaClass#orEquals(java.lang.Object, java.lang.Object)
   */
  public Object orEquals(final Object lhs, final Object rhs) {
    return this.orEquals.call(lhs, rhs);
  }

  /* (non-Javadoc)
   * @see ng.runtime.MetaClass#postfixDecrement(java.lang.Object)
   */
  public Object postfixDecrement(final Object operand) {
    return this.postfixDecrement.call(operand);
  }

  /* (non-Javadoc)
   * @see ng.runtime.MetaClass#postfixIncrement(java.lang.Object)
   */
  public Object postfixIncrement(final Object operand) {
    return this.postfixIncrement.call(operand);
  }

  /* (non-Javadoc)
   * @see ng.runtime.MetaClass#prefixDecrement(java.lang.Object)
   */
  public Object prefixDecrement(final Object operand) {
    return this.prefixDecrement.call(operand);
  }

  /* (non-Javadoc)
   * @see ng.runtime.MetaClass#prefixIncrement(java.lang.Object)
   */
  public Object prefixIncrement(final Object operand) {
    return this.prefixIncrement.call(operand);
  }

  /* (non-Javadoc)
   * @see ng.runtime.MetaClass#putAt(java.lang.Object, java.lang.Object)
   */
  public Object putAt(final Object instance, final Object index) {
    return this.putAt.call(instance, index);
  }

  /* (non-Javadoc)
   * @see ng.runtime.MetaClass#remainder(java.lang.Object, java.lang.Object)
   */
  public Object remainder(final Object lhs, final Object rhs) {
    return this.remainder.call(lhs, rhs);
  }

  /* (non-Javadoc)
   * @see ng.runtime.MetaClass#remainderEquals(java.lang.Object, java.lang.Object)
   */
  public Object remainderEquals(final Object lhs, final Object rhs) {
    return this.remainderEquals.call(lhs, rhs);
  }

  /* (non-Javadoc)
   * @see ng.runtime.MetaClass#subtract(java.lang.Object, java.lang.Object)
   */
  public Object subtract(final Object lhs, final Object rhs) {
    return this.subtract.call(lhs, rhs);
  }

  /* (non-Javadoc)
   * @see ng.runtime.MetaClass#subtractEquals(java.lang.Object, java.lang.Object)
   */
  public Object subtractEquals(final Object lhs, final Object rhs) {
    return this.subtractEquals.call(lhs, rhs);
  }

  /* (non-Javadoc)
   * @see ng.runtime.MetaClass#unaryMinus(java.lang.Object)
   */
  public Object unaryMinus(final Object operand) {
    return this.unaryMinus.call(operand);
  }

  /* (non-Javadoc)
   * @see ng.runtime.MetaClass#unaryPlus(java.lang.Object)
   */
  public Object unaryPlus(final Object operand) {
    return this.unaryPlus.call(operand);
  }

  /* (non-Javadoc)
   * @see ng.runtime.MetaClass#xor(java.lang.Object, java.lang.Object)
   */
  public Object xor(final Object lhs, final Object rhs) {
    return this.xor.call(lhs, rhs);
  }

  /* (non-Javadoc)
   * @see ng.runtime.MetaClass#xorEquals(java.lang.Object, java.lang.Object)
   */
  public Object xorEquals(final Object lhs, final Object rhs) {
    return this.xorEquals.call(lhs, rhs);
  }
}
