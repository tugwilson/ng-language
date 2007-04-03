package ng.runtime;

import uk.co.wilson.ng.runtime.metaclass.RuntimeMetaClassImpl;
import uk.co.wilson.ng.runtime.metaclass.reflection.MetaMethodSelection;

/**
 * @author tug
 *
 */
public interface InstanceHandler {

  /**
   * @param instance 
   * @return The class which is represented by this MetaClass
   */
  Class getTheClass(Object instance);
  
  /**
   * @param theClass
   * @return The MetaClass which is to be used when this class is cast to theClass.
   */
  MetaClass getMetaClassFor(Class theClass);
  
  /**
   * @return the RuntimeMetaClass for this MetaClass
   */
  RuntimeMetaClass getRuntimeMetaClass();
  
  /**
   * @param theClass 
   * @param arguments
   * @return an instance of the Class represented by the MetaClass
   */
  Object invokeConstructor(Class theClass, Object[] arguments);
  /**
   * @param methodName
   * @param arguments
   * @return the result of invoking the method on the instance with the supplied
   *         parameters.
   */
  MetaMethod getMetaMethodFor(String methodName, Object[] arguments);
  
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
  Object complement(Object instance);
  
  /**
   * @param operand
   * @return
   */
  Object not(Object operand);
  
  /**
   * @param operand
   * @return
   */
  Object unaryPlus(Object operand);
  
  /**
   * @param operand
   * @return
   */
  Object unaryMinus(Object operand);
  
  /**
   * @param lhs
   * @param rhs
   * @return
   */
  Object add(Object operand, Object rhs);
  
  /**
   * @param lhs
   * @param rhs
   * @return
   */
  Object addEquals(Object lhs, Object rhs);
  
  /**
   * @param lhs
   * @param rhs
   * @return
   */
  Object subtract(Object lhs, Object rhs);
  
  /**
   * @param lhs
   * @param rhs
   * @return
   */
  Object subtractEquals(Object lhs, Object rhs);
  
  /**
   * @param lhs
   * @param rhs
   * @return
   */
  Object multiply(Object lhs, Object rhs);
  
  /**
   * @param lhs
   * @param rhs
   * @return
   */
  Object multiplyEquals(Object lhs, Object rhs);
  
  /**
   * @param lhs
   * @param rhs
   * @return
   */
  Object divide(Object lhs, Object rhs);
  
  /**
   * @param lhs
   * @param rhs
   * @return
   */
  Object divideEquals(Object lhs, Object rhs);
  
  /**
   * @param lhs
   * @param rhs
   * @return
   */
  Object remainder(Object lhs, Object rhs);
  
  /**
   * @param lhs
   * @param rhs
   * @return
   */
  Object remainderEquals(Object lhs, Object rhs);
  
  /**
   * @param lhs
   * @param rhs
   * @return
   */
  Object integerDivide(Object lhs, Object rhs);
  
  /**
   * @param lhs
   * @param rhs
   * @return
   */
  Object integerDivideEquals(Object lhs, Object rhs);
  
  /**
   * @param lhs
   * @param rhs
   * @return
   */
  Object and(Object lhs, Object rhs);
  
  /**
   * @param lhs
   * @param rhs
   * @return
   */
  Object andEquals(Object lhs, Object rhs);
  
  /**
   * @param lhs
   * @param rhs
   * @return
   */
  Object or(Object lhs, Object rhs);
  
  /**
   * @param lhs
   * @param rhs
   * @return
   */
  Object orEquals(Object lhs, Object rhs);
  
  /**
   * @param lhs
   * @param rhs
   * @return
   */
  Object xor(Object lhs, Object rhs);
  
  /**
   * @param lhs
   * @param rhs
   * @return
   */
  Object xorEquals(Object lhs, Object rhs);
  
  /**
   * @param lhs
   * @param rhs
   * @return
   */
  Object leftShift(Object lhs, Object rhs);
  
  /**
   * @param lhs
   * @param rhs
   * @return
   */
  Object leftShiftEquals(Object lhs, Object rhs);
  
  /**
   * @param lhs
   * @param rhs
   * @return
   */
  Object arithmeticRightShift(Object lhs, Object rhs);
  
  /**
   * @param lhs
   * @param rhs
   * @return
   */
  Object arithmeticRightShiftEquals(Object lhs, Object rhs);
  
  /**
   * @param lhs
   * @param rhs
   * @return
   */
  Object logicalRightShift(Object lhs, Object rhs);
  
  /**
   * @param lhs
   * @param rhs
   * @return
   */
  Object logicalRightShiftEquals(Object lhs, Object rhs);
  
  /**
   * @param operand
   * @return
   */
  Object prefixIncrement(Object operand);
  
  /**
   * @param operand
   * @return
   */
  Object prefixDecrement(Object operand);
  
  /**
   * @param operand
   * @return
   */
  Object postfixIncrement(Object operand);
  
  /**
   * @param operand
   * @return
   */
  Object postfixDecrement(Object operand);
  
  /**
   * @param lhs
   * @param rhs
   * @return
   */
  Object compare(Object lhs, Object rhs);
  
  /**
   * @param lhs
   * @param rhs
   * @return
   */
  Object equals(Object lhs, Object rhs);
  
  /**
   * @param lhs
   * @param rhs
   * @return
   */
  Object notEquals(Object lhs, Object rhs);
  
  /**
   * @param lhs
   * @param rhs
   * @return
   */
  Object lessThan(Object lhs, Object rhs);
  
  /**
   * @param lhs
   * @param rhs
   * @return
   */
  Object greaterThan(Object lhs, Object rhs);
  
  /**
   * @param lhs
   * @param rhs
   * @return
   */
  Object lessThanOrEquals(Object lhs, Object rhs);
  
  /**
   * @param lhs
   * @param rhs
   * @return
   */
  Object greaterThanOrEquals(Object lhs, Object rhs);
  
  /**
   * @param instance
   * @param type
   * @return
   */
  Object isInstanceof(Object instance, Class type);
  
  /**
   * @param instance
   * @param rhs
   * @return
   */
  Object isCase(Object instance, Object rhs);
  
  /**
   * @param instance
   * @param type
   * @return
   */
  Object asType(Object instance, Class type);
  
  /**
   * @param instance
   * @param index
   * @return
   */
  Object getAt(Object instance, Object index);
  
  /**
   * @param instance
   * @param index
   * @return
   */
  Object putAt(Object instance, Object index);

  /**
   * @param parameterType
   * @return
   */
  int calculateConversionCost(Class parameterType);
  
  /**
   * @param currentSelection
   * @param methodName
   * @param argumentMetaClasses
   * @return
   */
  MetaMethodSelection selectMethod(MetaMethodSelection currentSelection, String methodName, RuntimeMetaClass[] argumentMetaClasses);
  
  /**
   * @param methodName
   * @return
   */
  MetaMethod getMetamethodQuick(String methodName);
  
  /**
   * @param methodName
   * @param p1
   * @return
   */
  MetaMethod getMetaMethodQuick(String methodName, Object p1);
  
  /**
   * @param methodName
   * @param p1
   * @param p2
   * @return
   */
  MetaMethod getMetaMethodMethodQuick(String methodName, Object p1, Object p2);
  
  /**
   * @param methodName
   * @param p1
   * @param p2
   * @param p3
   * @return
   */
  MetaMethod getMetaMethodQuick(String methodName, Object p1, Object p2, Object p3);
  
  /**
   * @param methodName
   * @param p1
   * @param p2
   * @param p3
   * @param p4
   * @return
   */
  MetaMethod getMetaMethodQuick(String methodName, Object p1, Object p2, Object p3, Object p4);
  
  /**
   * @param instance
   * @return
   */
  Object callQuick(Object instance);
  
  /**
   * @param instance
   * @param p1
   * @return
   */
  Object callQuick(Object instance, Object p1);
  
  /**
   * @param instance
   * @param p1
   * @param p2
   * @return
   */
  Object callQuick(Object instance, Object p1, Object p2);
  
  /**
   * @param instance
   * @param p1
   * @param p2
   * @param p3
   * @return
   */
  Object callQuick(Object instance, Object p1, Object p2, Object p3);
  
  /**
   * @param instance
   * @param p1
   * @param p2
   * @param p3
   * @param p4
   * @return
   */
  Object callQuick(Object instance, Object p1, Object p2, Object p3, Object p4);
  
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
  
  final MetaMethod noMethod = new MetaMethod() {
    
    /* (non-Javadoc)
     * @see ng.runtime.MetaMethod#addMetaMethod(ng.runtime.MetaMethod)
     */
    public MetaMethod addMetaMethod(final MetaMethod metaMethod) {
      return metaMethod;
    }

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
     * @see ng.runtime.MetaMethod#selectMethod(ng.runtime.RuntimeMetaClass[])
     */
    public MetaMethodSelection selectMethod(RuntimeMetaClass[] argumentMetaClasses) {
      return new MetaMethodSelection();
    }

    /* (non-Javadoc)
     * @see ng.runtime.MetaMethod#selectMethod(uk.co.wilson.ng.runtime.metaclass.reflection.MetaMethodSelection, ng.runtime.RuntimeMetaClass[])
     */
    public MetaMethodSelection selectMethod(MetaMethodSelection currentSelection, RuntimeMetaClass[] argumentMetaClasses) {
      return currentSelection;
    }

    /* (non-Javadoc)
     * @see ng.runtime.MetaMethod#call(java.lang.Object)
     */
    public Object call(Object instance) {
      return RuntimeMetaClassImpl.NOT_CALLED;
    }
  };
}
