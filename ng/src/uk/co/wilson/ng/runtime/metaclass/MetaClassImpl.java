package uk.co.wilson.ng.runtime.metaclass;

import uk.co.wilson.ng.runtime.metaclass.RuntimeMetaClassImpl.NgBinaryOperatorException;
import uk.co.wilson.ng.runtime.metaclass.RuntimeMetaClassImpl.NgPostfixUnaryOperatorException;
import uk.co.wilson.ng.runtime.metaclass.RuntimeMetaClassImpl.NgPrefixUnaryOperatorException;
import ng.lang.NgRuntimeException;
import ng.lang.NgSystem;
import ng.runtime.InternalMetaClass;
import ng.runtime.MetaClass;
/*
 * Created on 6 Jul 2007
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
public class MetaClassImpl implements MetaClass {
  public static final Object NOT_CONSTRUCTED = new Object();
  public static final Object NOT_CALLED = new Object();
  public static final Object[] NO_PARAMETERS = new Object[] {};
  
  protected final InternalMetaClass internalMetaClass;
  protected volatile InternalMetaClass alternateInternalMetaClass = null;

  public MetaClassImpl(final Class theClass, final InternalMetaClass internalMetaClass) {
    this.internalMetaClass = internalMetaClass;
  }
  
  /**
   * @param theClass
   */
  public MetaClassImpl(final Class theClass) {
    this.internalMetaClass = new InternalMetaClassImpl(theClass);
  }

  /* (non-JavaDoc)
   * @see ng.runtime.MetaClass#getInternalMetaClass()
   */
  public InternalMetaClass getInternalMetaClass() {
    if (this.alternateInternalMetaClass == null) {
      return this.internalMetaClass;
    } else {
      return this.alternateInternalMetaClass;
    }
  }

  /* (non-JavaDoc)
   * @see ng.runtime.MetaClass#setInternalMetaClass(ng.runtime.InternalMetaClass)
   */
  public void setInternalMetaClass(final InternalMetaClass internalMetaClass) {
    this.alternateInternalMetaClass = internalMetaClass;
  }

  /*
   * (non-JavaDoc)
   * 
   * @see ng.lang.MetaClass#getTheClass()
   */
  public Class getTheClass(final Object instance) {
    return NgSystem.metaClassRegistry.getThreadContext().getTheClass(this, instance);
  }
  
  /* (non-JavaDoc)
   * @see ng.runtime.MetaClass#invokeConstructor(java.lang.Class, java.lang.Object[])
   */
  public  Object invokeConstructor(final Class theClass, final Object[] arguments) throws Throwable {
    return NgSystem.metaClassRegistry.getThreadContext().invokeConstructor(this, theClass, arguments);
  
  }
  /* (non-JavaDoc)
   * @see ng.runtime.MetaClass#invokeMethod(java.lang.Object, java.lang.String, java.lang.Object[])
   */
  public  Object invokeMethod(final Object instance, final String methodName, final Object[] arguments) throws  Throwable {
    return NgSystem.metaClassRegistry.getThreadContext().invokeMethod(this, instance, methodName, arguments);
  }

  /* (non-JavaDoc)
   * @see ng.runtime.MetaClass#call(java.lang.Object, java.lang.Object[])
   */
  public  Object call(final Object instance, final Object[] arguments) throws  Throwable {
    return NgSystem.metaClassRegistry.getThreadContext().call(this, instance, arguments);
  }
  
  /* (non-JavaDoc)
   * @see ng.runtime.MetaClass#getProperty(java.lang.Object, java.lang.String)
   */
  public Object getProperty(final Object instance, final String propertyName) throws  Throwable {
    return NgSystem.metaClassRegistry.getThreadContext().getProperty(this, instance, propertyName);
  }

  /* (non-JavaDoc)
   * @see ng.runtime.MetaClass#setProperty(java.lang.Object, java.lang.String, java.lang.Object)
   */
  public Object setProperty(final Object instance, final String propertyName, final Object newValue) throws Throwable {
    return NgSystem.metaClassRegistry.getThreadContext().setProperty(this, instance, propertyName, newValue);
  }

  /* (non-JavaDoc)
   * @see ng.runtime.MetaClass#getField(java.lang.Object, java.lang.String)
   */
  public Object getField(final Object instance, final String fieldName) throws Throwable {
    return NgSystem.metaClassRegistry.getThreadContext().getField(this, instance, fieldName);
  }

  /* (non-JavaDoc)
   * @see ng.runtime.MetaClass#setField(java.lang.Object, java.lang.String, java.lang.Object)
   */
  public Object setField(final Object instance, final String fieldName, final Object newValue) throws  Throwable {
    return NgSystem.metaClassRegistry.getThreadContext().setField(this, instance, fieldName, newValue);
  }

  /* (non-JavaDoc)
   * @see ng.runtime.MetaClass#getAt(java.lang.Object, java.lang.Object)
   */
  public Object getAt(final Object instance, final Object index) throws Throwable {
    return NgSystem.metaClassRegistry.getThreadContext().getAt(instance, index);
  }

  /* (non-JavaDoc)
   * @see ng.runtime.MetaClass#putAt(java.lang.Object, java.lang.Object)
   */
  public Object putAt(final Object instance, final Object index) throws Throwable {
    return NgSystem.metaClassRegistry.getThreadContext().putAt(instance, index);
  }

  /* (non-JavaDoc)
   * @see ng.runtime.MetaClass#isInstanceof(java.lang.Object, java.lang.Class)
   */
  public boolean isInstanceof(final Object instance, final Class type) throws Throwable {
    return NgSystem.metaClassRegistry.getThreadContext().isInstanceof(this, instance, type);
  }

  /* (non-JavaDoc)
   * @see ng.runtime.MetaClass#isCase(java.lang.Object, java.lang.Object)
   */
  public boolean isCase(final Object instance, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getThreadContext().isCase(this, instance, rhs);
  }

  /* (non-JavaDoc)
   * @see ng.runtime.MetaClass#asType(java.lang.Object, java.lang.Class)
   */
  public Object asType(final Object instance, final Class type) throws Throwable {
    return NgSystem.metaClassRegistry.getThreadContext().asType(this, instance, type);
  }

  public Object add(final Object lhs, final Object rhs) throws Throwable {
  final Object result = getInternalMetaClass().doAdd(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(lhs.getClass(), "+", NgSystem.metaClassRegistry.getMetaClass(rhs).getTheClass(rhs));
      
    return result;
  }

  /* (non-JavaDoc)
   * @see ng.runtime.MetaClass#addEquals(java.lang.Object, java.lang.Object)
   */
  public Object addEquals(final Object lhs, final Object rhs) throws Throwable {
  final Object result = getInternalMetaClass().doAddEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(lhs.getClass(), "+=", NgSystem.metaClassRegistry.getMetaClass(rhs).getTheClass(rhs));
      
    return result;
  }
  
  /* (non-JavaDoc)
   * @see ng.runtime.MetaClass#and(java.lang.Object, java.lang.Object)
   */
  public Object and(final Object lhs, final Object rhs) throws Throwable {
  final Object result = getInternalMetaClass().doAnd(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(lhs.getClass(), "&", NgSystem.metaClassRegistry.getMetaClass(rhs).getTheClass(rhs));
      
    return result;
  }

  /* (non-JavaDoc)
   * @see ng.runtime.MetaClass#andEquals(java.lang.Object, java.lang.Object)
   */
  public Object andEquals(final Object lhs, final Object rhs) throws Throwable {
  final Object result = getInternalMetaClass().doAndEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(lhs.getClass(), "&=", NgSystem.metaClassRegistry.getMetaClass(rhs).getTheClass(rhs));
      
    return result;
  }
  
  /* (non-JavaDoc)
   * @see ng.runtime.MetaClass#arithmeticRightShift(java.lang.Object, java.lang.Object)
   */
  public Object arithmeticRightShift(final Object lhs, final Object rhs) throws Throwable {
  final Object result = getInternalMetaClass().doArithmeticRightShift(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(lhs.getClass(), ">>", NgSystem.metaClassRegistry.getMetaClass(rhs).getTheClass(rhs));
      
    return result;
  }

  /* (non-JavaDoc)
   * @see ng.runtime.MetaClass#arithmeticRightShiftEquals(java.lang.Object, java.lang.Object)
   */
  public Object arithmeticRightShiftEquals(final Object lhs, final Object rhs) throws Throwable {
  final Object result = getInternalMetaClass().doArithmeticRightShiftEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(lhs.getClass(), ">>=", NgSystem.metaClassRegistry.getMetaClass(rhs).getTheClass(rhs));
      
    return result;
  }

  /* (non-JavaDoc)
   * @see ng.runtime.MetaClass#compare(java.lang.Object, java.lang.Object)
   */
  public Object compare(final Object lhs, final Object rhs) throws Throwable {
  final Object result = getInternalMetaClass().doCompare(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(lhs.getClass(), "<=>", NgSystem.metaClassRegistry.getMetaClass(rhs).getTheClass(rhs));
      
    return result;
  }

  /* (non-JavaDoc)
   * @see ng.runtime.MetaClass#complement(java.lang.Object)
   */
  public Object complement(final Object instance) throws  Throwable {
  final Object result = getInternalMetaClass().doComplement(instance);

    if (result == NOT_CALLED) throw new NgPrefixUnaryOperatorException("~", this.getTheClass(instance).getName());

    return result;
  }

  /* (non-JavaDoc)
   * @see ng.runtime.MetaClass#divide(java.lang.Object, java.lang.Object)
   */
  public Object divide(final Object lhs, final Object rhs) throws Throwable {
  final Object result = getInternalMetaClass().doDivide(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(lhs.getClass(), "/", NgSystem.metaClassRegistry.getMetaClass(rhs).getTheClass(rhs));
      
    return result;
  }

  /* (non-JavaDoc)
   * @see ng.runtime.MetaClass#divideEquals(java.lang.Object, java.lang.Object)
   */
  public Object divideEquals(final Object lhs, final Object rhs) throws Throwable {
  final Object result = getInternalMetaClass().doDivideEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(lhs.getClass(), "/=", NgSystem.metaClassRegistry.getMetaClass(rhs).getTheClass(rhs));
      
    return result;
  }

  /* (non-JavaDoc)
   * @see ng.runtime.MetaClass#equals(java.lang.Object, java.lang.Object)
   */
  public Object equals(final Object lhs, final Object rhs) throws Throwable {
  final Object result = getInternalMetaClass().doEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(lhs.getClass(), "==", NgSystem.metaClassRegistry.getMetaClass(rhs).getTheClass(rhs));
      
    return result;
  }
  
  /* (non-JavaDoc)
   * @see ng.runtime.MetaClass#greaterThan(java.lang.Object, java.lang.Object)
   */
  public Object greaterThan(final Object lhs, final Object rhs) throws Throwable {
  final Object result = getInternalMetaClass().doGreaterThan(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(lhs.getClass(), ">", NgSystem.metaClassRegistry.getMetaClass(rhs).getTheClass(rhs));
      
    return result;
  }

  /* (non-JavaDoc)
   * @see ng.runtime.MetaClass#greaterThanOrEquals(java.lang.Object, java.lang.Object)
   */
  public Object greaterThanOrEquals(final Object lhs, final Object rhs) throws Throwable {
  final Object result = getInternalMetaClass().doGreaterThanOrEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(lhs.getClass(), ">=", NgSystem.metaClassRegistry.getMetaClass(rhs).getTheClass(rhs));
      
    return result;
  }

  /* (non-JavaDoc)
   * @see ng.runtime.MetaClass#integerDivide(java.lang.Object, java.lang.Object)
   */
  public Object integerDivide(final Object lhs, final Object rhs) throws Throwable {
  final Object result = getInternalMetaClass().doIntegerDivide(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(lhs.getClass(), "÷", NgSystem.metaClassRegistry.getMetaClass(rhs).getTheClass(rhs));
      
    return result;
  }

  /* (non-JavaDoc)
   * @see ng.runtime.MetaClass#integerDivideEquals(java.lang.Object, java.lang.Object)
   */
  public Object integerDivideEquals(final Object lhs, final Object rhs) throws Throwable {
  final Object result = getInternalMetaClass().doIntegerDivideEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(lhs.getClass(), "÷=", NgSystem.metaClassRegistry.getMetaClass(rhs).getTheClass(rhs));
      
    return result;
  }

  /* (non-JavaDoc)
   * @see ng.runtime.MetaClass#leftShift(java.lang.Object, java.lang.Object)
   */
  public Object leftShift(final Object lhs, final Object rhs) throws Throwable {
  final Object result = getInternalMetaClass().doLeftShift(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(lhs.getClass(), "<<", NgSystem.metaClassRegistry.getMetaClass(rhs).getTheClass(rhs));
      
    return result;
  }

  /* (non-JavaDoc)
   * @see ng.runtime.MetaClass#leftShiftEquals(java.lang.Object, java.lang.Object)
   */
  public Object leftShiftEquals(final Object lhs, final Object rhs) throws Throwable {
  final Object result = getInternalMetaClass().doLeftShiftEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(lhs.getClass(), "<<=", NgSystem.metaClassRegistry.getMetaClass(rhs).getTheClass(rhs));
      
    return result;
  }

  /* (non-JavaDoc)
   * @see ng.runtime.MetaClass#lessThan(java.lang.Object, java.lang.Object)
   */
  public Object lessThan(final Object lhs, final Object rhs) throws Throwable {
  final Object result = getInternalMetaClass().doLessThan(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(lhs.getClass(), "<", NgSystem.metaClassRegistry.getMetaClass(rhs).getTheClass(rhs));
      
    return result;
  }

  /* (non-JavaDoc)
   * @see ng.runtime.MetaClass#lessThanOrEquals(java.lang.Object, java.lang.Object)
   */
  public Object lessThanOrEquals(final Object lhs, final Object rhs) throws Throwable {
  final Object result = getInternalMetaClass().doLessThanOrEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(lhs.getClass(), "<=", NgSystem.metaClassRegistry.getMetaClass(rhs).getTheClass(rhs));
      
    return result;
  }

  /* (non-JavaDoc)
   * @see ng.runtime.MetaClass#logicalRightShift(java.lang.Object, java.lang.Object)
   */
  public Object logicalRightShift(final Object lhs, final Object rhs) throws Throwable {
  final Object result = getInternalMetaClass().doLogicalRightShift(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(lhs.getClass(), ">>>", NgSystem.metaClassRegistry.getMetaClass(rhs).getTheClass(rhs));
      
    return result;
  }

  /* (non-JavaDoc)
   * @see ng.runtime.MetaClass#logicalRightShiftEquals(java.lang.Object, java.lang.Object)
   */
  public Object logicalRightShiftEquals(final Object lhs, final Object rhs) throws Throwable {
  final Object result = getInternalMetaClass().doLogicalRightShiftEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(lhs.getClass(), ">>>=", NgSystem.metaClassRegistry.getMetaClass(rhs).getTheClass(rhs));
      
    return result;
  }

  /* (non-JavaDoc)
   * @see ng.runtime.MetaClass#multiply(java.lang.Object, java.lang.Object)
   */
  public Object multiply(final Object lhs, final Object rhs) throws Throwable {
  final Object result = getInternalMetaClass().doMultiply(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(lhs.getClass(), "*", NgSystem.metaClassRegistry.getMetaClass(rhs).getTheClass(rhs));
      
    return result;
  }

  /* (non-JavaDoc)
   * @see ng.runtime.MetaClass#multiplyEquals(java.lang.Object, java.lang.Object)
   */
  public Object multiplyEquals(final Object lhs, final Object rhs) throws Throwable {
  final Object result = getInternalMetaClass().doMultiplyEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(lhs.getClass(), "*=", NgSystem.metaClassRegistry.getMetaClass(rhs).getTheClass(rhs));
      
    return result;
  }

  /* (non-JavaDoc)
   * @see ng.runtime.MetaClass#not(java.lang.Object)
   */
  public Object not(final Object instance) throws  Throwable {
  final Object result = getInternalMetaClass().doNot(instance);

    if (result == NOT_CALLED) throw new NgPrefixUnaryOperatorException("!", this.getTheClass(instance).getName());

    return result;
  }

  /* (non-JavaDoc)
   * @see ng.runtime.MetaClass#notEquals(java.lang.Object, java.lang.Object)
   */
  public Object notEquals(final Object lhs, final Object rhs) throws Throwable {
  final Object result = getInternalMetaClass().doNotEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(lhs.getClass(), "!=", NgSystem.metaClassRegistry.getMetaClass(rhs).getTheClass(rhs));
      
    return result;
  }

  /* (non-JavaDoc)
   * @see ng.runtime.MetaClass#or(java.lang.Object, java.lang.Object)
   */
  public Object or(final Object lhs, final Object rhs) throws Throwable {
  final Object result = getInternalMetaClass().doOr(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(lhs.getClass(), "|", NgSystem.metaClassRegistry.getMetaClass(rhs).getTheClass(rhs));
      
    return result;
  }

  /* (non-JavaDoc)
   * @see ng.runtime.MetaClass#orEquals(java.lang.Object, java.lang.Object)
   */
  public Object orEquals(final Object lhs, final Object rhs) throws Throwable {
  final Object result = getInternalMetaClass().doOrEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(lhs.getClass(), "|=", NgSystem.metaClassRegistry.getMetaClass(rhs).getTheClass(rhs));
      
    return result;
  }

  /* (non-JavaDoc)
   * @see ng.runtime.MetaClass#postfixDecrement(java.lang.Object)
   */
  public Object postfixDecrement(final Object operand) throws Throwable {
  final Object result = getInternalMetaClass().doPostfixDecrement(operand);

    if (result == NOT_CALLED) throw new NgPostfixUnaryOperatorException("--", this.getTheClass(operand).getName());

    return result;
  }

  /* (non-JavaDoc)
   * @see ng.runtime.MetaClass#postfixIncrement(java.lang.Object)
   */
  public Object postfixIncrement(final Object operand) throws Throwable {
  final Object result = getInternalMetaClass().doPostfixIncrement(operand);

    if (result == NOT_CALLED) throw new NgPostfixUnaryOperatorException("++", this.getTheClass(operand).getName());

    return result;
  }

  /* (non-JavaDoc)
   * @see ng.runtime.MetaClass#prefixDecrement(java.lang.Object)
   */
  public Object prefixDecrement(final Object operand) throws Throwable {
  final Object result = getInternalMetaClass().doPrefixDecrement(operand);

    if (result == NOT_CALLED) throw new NgPrefixUnaryOperatorException("--", this.getTheClass(operand).getName());

    return result;
  }

  /* (non-JavaDoc)
   * @see ng.runtime.MetaClass#prefixIncrement(java.lang.Object)
   */
  public Object prefixIncrement(final Object operand) throws Throwable {
  final Object result = getInternalMetaClass().doPrefixIncrement(operand);

    if (result == NOT_CALLED) throw new NgPrefixUnaryOperatorException("++", this.getTheClass(operand).getName());

    return result;
  }

  /* (non-JavaDoc)
   * @see ng.runtime.MetaClass#remainder(java.lang.Object, java.lang.Object)
   */
  public Object remainder(final Object lhs, final Object rhs) throws Throwable {
  final Object result = getInternalMetaClass().doRemainder(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(lhs.getClass(), "%", NgSystem.metaClassRegistry.getMetaClass(rhs).getTheClass(rhs));
      
    return result;
  }

  /* (non-JavaDoc)
   * @see ng.runtime.MetaClass#remainderEquals(java.lang.Object, java.lang.Object)
   */
  public Object remainderEquals(final Object lhs, final Object rhs) throws Throwable {
  final Object result = getInternalMetaClass().doRemainderEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(lhs.getClass(), "%=", NgSystem.metaClassRegistry.getMetaClass(rhs).getTheClass(rhs));
      
    return result;
  }

  /* (non-JavaDoc)
   * @see ng.runtime.MetaClass#subtract(java.lang.Object, java.lang.Object)
   */
  public Object subtract(final Object lhs, final Object rhs) throws Throwable {
  final Object result = getInternalMetaClass().doSubtract(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(lhs.getClass(), "-", NgSystem.metaClassRegistry.getMetaClass(rhs).getTheClass(rhs));
      
    return result;
  }

  /* (non-JavaDoc)
   * @see ng.runtime.MetaClass#subtractEquals(java.lang.Object, java.lang.Object)
   */
  public Object subtractEquals(final Object lhs, final Object rhs) throws Throwable {
  final Object result = getInternalMetaClass().doSubtractEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(lhs.getClass(), "-=", NgSystem.metaClassRegistry.getMetaClass(rhs).getTheClass(rhs));
      
    return result;
  }

  /* (non-JavaDoc)
   * @see ng.runtime.MetaClass#unaryMinus(java.lang.Object)
   */
  public Object unaryMinus(final Object instance) throws Throwable {
  final Object result = getInternalMetaClass().doUnaryMinus(instance);

    if (result == NOT_CALLED) throw new NgPrefixUnaryOperatorException("-", this.getTheClass(instance).getName());
    
    return result;
  }

  /* (non-JavaDoc)
   * @see ng.runtime.MetaClass#unaryPlus(java.lang.Object)
   */
  public Object unaryPlus(final Object instance) throws  Throwable {
  final Object result = getInternalMetaClass().doUnaryPlus(instance);

      if (result == NOT_CALLED) throw new NgPrefixUnaryOperatorException("+", this.getTheClass(instance).getName());

      return result;
    }

  /* (non-JavaDoc)
   * @see ng.runtime.MetaClass#xor(java.lang.Object, java.lang.Object)
   */
  public Object xor(final Object lhs, final Object rhs) throws Throwable {
  final Object result = getInternalMetaClass().doXor(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(lhs.getClass(), "^", NgSystem.metaClassRegistry.getMetaClass(rhs).getTheClass(rhs));
      
    return result;
  }

  /* (non-JavaDoc)
   * @see ng.runtime.MetaClass#xorEquals(java.lang.Object, java.lang.Object)
   */
  public Object xorEquals(final Object lhs, final Object rhs) throws Throwable {
  final Object result = getInternalMetaClass().doXorEquals(lhs, rhs);
      
    if (result == NOT_CALLED) throw new NgBinaryOperatorException(lhs.getClass(), "^=", NgSystem.metaClassRegistry.getMetaClass(rhs).getTheClass(rhs));
      
    return result;
  }
}
