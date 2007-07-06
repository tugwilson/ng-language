package ng.runtime;

import java.math.BigDecimal;
import java.math.BigInteger;

import uk.co.wilson.ng.runtime.metaclass.RuntimeMetaClassImpl;
import uk.co.wilson.ng.runtime.metaclass.methods.MetaMethodSelection;

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
   * @param instance
   * @param propertyName
   * @return
   */
  MetaMethod getGetPropertyMetaMethod(Object instance, String propertyName);

  /**
   * @param instance
   * @param propertyName
   * @param newValue
   * @return
   */
  MetaMethod getSetPropertyMetaMethod(Object instance, String propertyName, Object newValue);

  /**
   * @param instance
   * @param fieldName
   * @return
   */
  MetaMethod getGetFieldMetaMethod(Object instance, String fieldName);

  /**
   * @param instance
   * @param fieldName
   * @param newValue
   * @return
   */
  MetaMethod getSetFieldMetaMethod(Object instance, String fieldName, Object newValue);
  
  /**
   * @return
   */
  Callable getCallable();

  /**
   * @param instance
   * @return
   */
  Object complement(Object instance) throws Throwable;
  
  /**
   * @param operand
   * @return
   */
  Object not(Object operand) throws Throwable;
  
  /**
   * @param operand
   * @return
   */
  Object unaryPlus(Object operand) throws Throwable;
  
  /**
   * @param operand
   * @return
   */
  Object unaryMinus(Object operand) throws Throwable;
  
  /**
   * @param lhs
   * @param rhs
   * @return
   */
  Object add(Object operand, Object ths) throws Throwable;
  
  /**
   * @param lhs
   * @param rhs
   * @return
   */
  Object addEquals(Object lhs, Object ths) throws Throwable;
  
  /**
   * @param lhs
   * @param rhs
   * @return
   */
  Object subtract(Object lhs, Object ths) throws Throwable;
  
  /**
   * @param lhs
   * @param rhs
   * @return
   */
  Object subtractEquals(Object lhs, Object ths) throws Throwable;
  
  /**
   * @param lhs
   * @param rhs
   * @return
   */
  Object multiply(Object lhs, Object ths) throws Throwable;
  
  /**
   * @param lhs
   * @param rhs
   * @return
   */
  Object multiplyEquals(Object lhs, Object ths) throws Throwable;
  
  /**
   * @param lhs
   * @param rhs
   * @return
   */
  Object divide(Object lhs, Object ths) throws Throwable;
  
  /**
   * @param lhs
   * @param rhs
   * @return
   */
  Object divideEquals(Object lhs, Object ths) throws Throwable;
  
  /**
   * @param lhs
   * @param rhs
   * @return
   */
  Object remainder(Object lhs, Object ths) throws Throwable;
  
  /**
   * @param lhs
   * @param rhs
   * @return
   */
  Object remainderEquals(Object lhs, Object ths) throws Throwable;
  
  /**
   * @param lhs
   * @param rhs
   * @return
   */
  Object integerDivide(Object lhs, Object ths) throws Throwable;
  
  /**
   * @param lhs
   * @param rhs
   * @return
   */
  Object integerDivideEquals(Object lhs, Object ths) throws Throwable;
  
  /**
   * @param lhs
   * @param rhs
   * @return
   */
  Object and(Object lhs, Object ths) throws Throwable;
  
  /**
   * @param lhs
   * @param rhs
   * @return
   */
  Object andEquals(Object lhs, Object ths) throws Throwable;
  
  /**
   * @param lhs
   * @param rhs
   * @return
   */
  Object or(Object lhs, Object ths) throws Throwable;
  
  /**
   * @param lhs
   * @param rhs
   * @return
   */
  Object orEquals(Object lhs, Object ths) throws Throwable;
  
  /**
   * @param lhs
   * @param rhs
   * @return
   */
  Object xor(Object lhs, Object ths) throws Throwable;
  
  /**
   * @param lhs
   * @param rhs
   * @return
   */
  Object xorEquals(Object lhs, Object ths) throws Throwable;
  
  /**
   * @param lhs
   * @param rhs
   * @return
   */
  Object leftShift(Object lhs, Object ths) throws Throwable;
  
  /**
   * @param lhs
   * @param rhs
   * @return
   */
  Object leftShiftEquals(Object lhs, Object ths) throws Throwable;
  
  /**
   * @param lhs
   * @param rhs
   * @return
   */
  Object arithmeticRightShift(Object lhs, Object ths) throws Throwable;
  
  /**
   * @param lhs
   * @param rhs
   * @return
   */
  Object arithmeticRightShiftEquals(Object lhs, Object ths) throws Throwable;
  
  /**
   * @param lhs
   * @param rhs
   * @return
   */
  Object logicalRightShift(Object lhs, Object ths) throws Throwable;
  
  /**
   * @param lhs
   * @param rhs
   * @return
   */
  Object logicalRightShiftEquals(Object lhs, Object ths) throws Throwable;
  
  /**
   * @param operand
   * @return
   */
  Object prefixIncrement(Object operand) throws Throwable;
  
  /**
   * @param operand
   * @return
   */
  Object prefixDecrement(Object operand) throws Throwable;
  
  /**
   * @param operand
   * @return
   */
  Object postfixIncrement(Object operand) throws Throwable;
  
  /**
   * @param operand
   * @return
   */
  Object postfixDecrement(Object operand) throws Throwable;
  
  /**
   * @param lhs
   * @param rhs
   * @return
   */
  Object compare(Object lhs, Object ths) throws Throwable;
  
  /**
   * @param lhs
   * @param rhs
   * @return
   */
  Object equals(Object lhs, Object ths) throws Throwable;
  
  /**
   * @param lhs
   * @param rhs
   * @return
   */
  Object notEquals(Object lhs, Object ths) throws Throwable;
  
  /**
   * @param lhs
   * @param rhs
   * @return
   */
  Object lessThan(Object lhs, Object ths) throws Throwable;
  
  /**
   * @param lhs
   * @param rhs
   * @return
   */
  Object greaterThan(Object lhs, Object ths) throws Throwable;
  
  /**
   * @param lhs
   * @param rhs
   * @return
   */
  Object lessThanOrEquals(Object lhs, Object ths) throws Throwable;
  
  /**
   * @param lhs
   * @param rhs
   * @return
   */
  Object greaterThanOrEquals(Object lhs, Object ths) throws Throwable;
  
  /**
   * @param instance
   * @param type
   * @return
   */
  Object isInstanceof(Object instance, Class type) throws Throwable;
  
  /**
   * @param instance
   * @param rhs
   * @return
   */
  Object isCase(Object instance, Object ths) throws Throwable;
  
  /**
   * @param tc
   * @param instance
   * @param type
   * @return
   * @throws Throwable
   */
  Object asType(ThreadContext tc, Object instance, Class type) throws Throwable;
  
  /**
   * @param tc
   * @param instance
   * @param index
   * @return
   * @throws Throwable
   */
  Object getAt(ThreadContext tc, Object instance, Object index) throws Throwable;
  
  /**
   * @param tc
   * @param instance
   * @param index
   * @return
   * @throws Throwable
   */
  Object putAt(ThreadContext tc, Object instance, Object index) throws Throwable;

  /**
   * @param parameterType
   * @return
   */
  int calculateConversionCost(Class parameterType);
  
  /**
   * @param tc
   * @param currentSelection
   * @param methodName
   * @param argumentMetaClasses
   * @return
   */
  MetaMethodSelection selectMethod(ThreadContext tc, MetaMethodSelection currentSelection, String methodName, RuntimeMetaClass[] argumentMetaClasses);
  
  /**
   * @param tc
   * @param currentSelection
   * @param methodName
   * @return
   */
  MetaMethodSelection selectMethod(ThreadContext tc, MetaMethodSelection currentSelection, String methodName);
  
  /**
   * @param tc
   * @param currentSelection
   * @param methodName
   * @param p1
   * @return
   */
  MetaMethodSelection selectMethod(ThreadContext tc, MetaMethodSelection currentSelection, String methodName, RuntimeMetaClass p1);
  
  /**
   * @param tc
   * @param currentSelection
   * @param methodName
   * @param p1
   * @param p2
   * @return
   */
  MetaMethodSelection selectMethod(ThreadContext tc, MetaMethodSelection currentSelection, String methodName, RuntimeMetaClass p1, RuntimeMetaClass p2);
  
  /**
   * @param tc
   * @param currentSelection
   * @param methodName
   * @param p1
   * @param p2
   * @param p3
   * @return
   */
  MetaMethodSelection selectMethod(ThreadContext tc, MetaMethodSelection currentSelection, String methodName, RuntimeMetaClass p1, RuntimeMetaClass p2, RuntimeMetaClass p3);
  
  /**
   * @param tc
   * @param currentSelection
   * @param methodName
   * @param p1
   * @param p2
   * @param p3
   * @param p4
   * @return
   */
  MetaMethodSelection selectMethod(ThreadContext tc, MetaMethodSelection currentSelection, String methodName, RuntimeMetaClass p1, RuntimeMetaClass p2, RuntimeMetaClass p3, RuntimeMetaClass p4);

  /**
   * @param tc
   * @param methodName
   * @param arguments
   * @return
   */
  MetaMethod getMetaMethodFor(ThreadContext tc, String methodName, Object[] arguments);
  
  /**
   * @param tc
   * @param methodName
   * @return
   */
  MetaMethod getMetaMethodQuick(ThreadContext tc, String methodName);
  
  /**
   * @param tc
   * @param methodName
   * @param p1
   * @return
   */
  MetaMethod getMetaMethodQuick(ThreadContext tc, String methodName, Object p1);
  
  /**
   * @param tc
   * @param methodName
   * @param p1
   * @return
   */
  MetaMethod getMetaMethodQuick(ThreadContext tc, String methodName, boolean p1);
  
  /**
   * @param tc
   * @param methodName
   * @param p1
   * @return
   */
  MetaMethod getMetaMethodQuick(ThreadContext tc, String methodName, char p1);
  
  /**
   * @param tc
   * @param methodName
   * @param p1
   * @return
   */
  MetaMethod getMetaMethodQuick(ThreadContext tc, String methodName, byte p1);
  
  /**
   * @param tc
   * @param methodName
   * @param p1
   * @return
   */
  MetaMethod getMetaMethodQuick(ThreadContext tc, String methodName, short p1);
  
  /**
   * @param tc
   * @param methodName
   * @param p1
   * @return
   */
  MetaMethod getMetaMethodQuick(ThreadContext tc, String methodName, int p1);
  
  /**
   * @param tc
   * @param methodName
   * @param p1
   * @return
   */
  MetaMethod getMetaMethodQuick(ThreadContext tc, String methodName, long p1);
  
  /**
   * @param tc
   * @param methodName
   * @param p1
   * @return
   */
  MetaMethod getMetaMethodQuick(ThreadContext tc, String methodName, float p1);
  
  /**
   * @param tc
   * @param methodName
   * @param p1
   * @return
   */
  MetaMethod getMetaMethodQuick(ThreadContext tc, String methodName, double p1);
  
  /**
   * @param tc
   * @param methodName
   * @param p1
   * @return
   */
  MetaMethod getMetaMethodQuick(ThreadContext tc, String methodName, BigInteger p1);
  
  /**
   * @param tc
   * @param methodName
   * @param p1
   * @return
   */
  MetaMethod getMetaMethodQuick(ThreadContext tc, String methodName, BigDecimal p1);
  
  /**
   * @param tc
   * @param methodName
   * @param p1
   * @param p2
   * @return
   */
  MetaMethod getMetaMethodQuick(ThreadContext tc, String methodName, Object p1, Object p2);
  
  /**
   * @param tc
   * @param methodName
   * @param p1
   * @param p2
   * @param p3
   * @return
   */
  MetaMethod getMetaMethodQuick(ThreadContext tc, String methodName, Object p1, Object p2, Object p3);
  
  /**
   * @param tc
   * @param methodName
   * @param p1
   * @param p2
   * @param p3
   * @param p4
   * @return
   */
  MetaMethod getMetaMethodQuick(ThreadContext tc, String methodName, Object p1, Object p2, Object p3, Object p4);
  
  /**
   * @param lhs
   * @param rhs
   * @return
   */
  Object reverseAdd(Object operand, Object ths) throws Throwable;
  
  /**
   * @param lhs
   * @param rhs
   * @return
   */
  Object reverseAddEquals(Object lhs, Object ths) throws Throwable;
  
  /**
   * @param lhs
   * @param rhs
   * @return
   */
  Object reverseSubtract(Object lhs, Object ths) throws Throwable;
  
  /**
   * @param lhs
   * @param rhs
   * @return
   */
  Object reverseSubtractEquals(Object lhs, Object ths) throws Throwable;
  
  /**
   * @param lhs
   * @param rhs
   * @return
   */
  Object reverseMultiply(Object lhs, Object ths) throws Throwable;
  
  /**
   * @param lhs
   * @param rhs
   * @return
   */
  Object reverseMultiplyEquals(Object lhs, Object ths) throws Throwable;
  
  /**
   * @param lhs
   * @param rhs
   * @return
   */
  Object reverseDivide(Object lhs, Object ths) throws Throwable;
  
  /**
   * @param lhs
   * @param rhs
   * @return
   */
  Object reverseDivideEquals(Object lhs, Object ths) throws Throwable;
  
  /**
   * @param lhs
   * @param rhs
   * @return
   */
  Object reverseRemainder(Object lhs, Object ths) throws Throwable;
  
  /**
   * @param lhs
   * @param rhs
   * @return
   */
  Object reverseRemainderEquals(Object lhs, Object ths) throws Throwable;
  
  /**
   * @param lhs
   * @param rhs
   * @return
   */
  Object reverseIntegerDivide(Object lhs, Object ths) throws Throwable;
  
  /**
   * @param lhs
   * @param rhs
   * @return
   */
  Object reverseIntegerDivideEquals(Object lhs, Object ths) throws Throwable;
  
  /**
   * @param lhs
   * @param rhs
   * @return
   */
  Object reverseAnd(Object lhs, Object ths) throws Throwable;
  
  /**
   * @param lhs
   * @param rhs
   * @return
   */
  Object reverseAndEquals(Object lhs, Object ths) throws Throwable;
  
  /**
   * @param lhs
   * @param rhs
   * @return
   */
  Object reverseOr(Object lhs, Object ths) throws Throwable;
  
  /**
   * @param lhs
   * @param rhs
   * @return
   */
  Object reverseOrEquals(Object lhs, Object ths) throws Throwable;
  
  /**
   * @param lhs
   * @param rhs
   * @return
   */
  Object reverseXor(Object lhs, Object ths) throws Throwable;
  
  /**
   * @param lhs
   * @param rhs
   * @return
   */
  Object reverseXorEquals(Object lhs, Object ths) throws Throwable;
  
  /**
   * @param lhs
   * @param rhs
   * @return
   */
  Object reverseLeftShift(Object lhs, Object ths) throws Throwable;
  
  /**
   * @param lhs
   * @param rhs
   * @return
   */
  Object reverseLeftShiftEquals(Object lhs, Object ths) throws Throwable;
  
  /**
   * @param lhs
   * @param rhs
   * @return
   */
  Object reverseArithmeticRightShift(Object lhs, Object ths) throws Throwable;
  
  /**
   * @param lhs
   * @param rhs
   * @return
   */
  Object reverseArithmeticRightShiftEquals(Object lhs, Object ths) throws Throwable;
  
  /**
   * @param lhs
   * @param rhs
   * @return
   */
  Object reverseLogicalRightShift(Object lhs, Object ths) throws Throwable;
  
  /**
   * @param lhs
   * @param rhs
   * @return
   */
  Object reverseLogicalRightShiftEquals(Object lhs, Object ths) throws Throwable;
  
  /**
   * @param lhs
   * @param rhs
   * @return
   */
  Object reverseCompare(Object lhs, Object ths) throws Throwable;
  
  /**
   * @param lhs
   * @param rhs
   * @return
   */
  Object reverseEquals(Object lhs, Object ths) throws Throwable;
  
  /**
   * @param lhs
   * @param rhs
   * @return
   */
  Object reverseNotEquals(Object lhs, Object ths) throws Throwable;
  
  /**
   * @param lhs
   * @param rhs
   * @return
   */
  Object reverseLessThan(Object lhs, Object ths) throws Throwable;
  
  /**
   * @param lhs
   * @param rhs
   * @return
   */
  Object reverseGreaterThan(Object lhs, Object ths) throws Throwable;
  
  /**
   * @param lhs
   * @param rhs
   * @return
   */
  Object reverseLessThanOrEquals(Object lhs, Object ths) throws Throwable;
  
  /**
   * @param lhs
   * @param rhs
   * @return
   */
  Object reverseGreaterThanOrEquals(Object lhs, Object ths) throws Throwable;
  
  final MetaMethod noMethod = new MetaMethod() {    
    public MetaMethod addMetaMethod(final MetaMethod metaMethod) {
      return metaMethod;
    }

    /* (non-Javadoc)
     * @see ng.runtime.Callable#call(ng.runtime.ThreadContext, java.lang.Object, java.lang.Object[])
     */
    public Object call(ThreadContext tc, Object instance, Object[] arguments) throws Throwable {
      return RuntimeMetaClassImpl.NOT_CALLED;
    }

    /* (non-Javadoc)
     * @see ng.runtime.Callable#callQuick(ng.runtime.ThreadContext, java.lang.Object, java.math.BigDecimal)
     */
    public Object callQuick(ThreadContext tc, Object instance, BigDecimal p1) throws Throwable {
      return RuntimeMetaClassImpl.NOT_CALLED;
    }

    /* (non-Javadoc)
     * @see ng.runtime.Callable#callQuick(ng.runtime.ThreadContext, java.lang.Object, java.math.BigInteger)
     */
    public Object callQuick(ThreadContext tc, Object instance, BigInteger p1) throws Throwable {
      return RuntimeMetaClassImpl.NOT_CALLED;
    }

    /* (non-Javadoc)
     * @see ng.runtime.Callable#callQuick(ng.runtime.ThreadContext, java.lang.Object, boolean)
     */
    public Object callQuick(ThreadContext tc, Object instance, boolean p1) throws Throwable {
      return RuntimeMetaClassImpl.NOT_CALLED;
    }

    /* (non-Javadoc)
     * @see ng.runtime.Callable#callQuick(ng.runtime.ThreadContext, java.lang.Object, byte)
     */
    public Object callQuick(ThreadContext tc, Object instance, byte p1) throws Throwable {
      return RuntimeMetaClassImpl.NOT_CALLED;
    }

    /* (non-Javadoc)
     * @see ng.runtime.Callable#callQuick(ng.runtime.ThreadContext, java.lang.Object, char)
     */
    public Object callQuick(ThreadContext tc, Object instance, char p1) throws Throwable {
      return RuntimeMetaClassImpl.NOT_CALLED;
    }

    /* (non-Javadoc)
     * @see ng.runtime.Callable#callQuick(ng.runtime.ThreadContext, java.lang.Object, double)
     */
    public Object callQuick(ThreadContext tc, Object instance, double p1) throws Throwable {
      return RuntimeMetaClassImpl.NOT_CALLED;
    }

    /* (non-Javadoc)
     * @see ng.runtime.Callable#callQuick(ng.runtime.ThreadContext, java.lang.Object, float)
     */
    public Object callQuick(ThreadContext tc, Object instance, float p1) throws Throwable {
      return RuntimeMetaClassImpl.NOT_CALLED;
    }

    /* (non-Javadoc)
     * @see ng.runtime.Callable#callQuick(ng.runtime.ThreadContext, java.lang.Object, int)
     */
    public Object callQuick(ThreadContext tc, Object instance, int p1) throws Throwable {
      return RuntimeMetaClassImpl.NOT_CALLED;
    }

    /* (non-Javadoc)
     * @see ng.runtime.Callable#callQuick(ng.runtime.ThreadContext, java.lang.Object, long)
     */
    public Object callQuick(ThreadContext tc, Object instance, long p1) throws Throwable {
      return RuntimeMetaClassImpl.NOT_CALLED;
    }

    /* (non-Javadoc)
     * @see ng.runtime.Callable#callQuick(ng.runtime.ThreadContext, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object)
     */
    public Object callQuick(ThreadContext tc, Object instance, Object p1, Object p2, Object p3, Object p4) throws Throwable {
      return RuntimeMetaClassImpl.NOT_CALLED;
    }

    /* (non-Javadoc)
     * @see ng.runtime.Callable#callQuick(ng.runtime.ThreadContext, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object)
     */
    public Object callQuick(ThreadContext tc, Object instance, Object p1, Object p2, Object p3) throws Throwable {
      return RuntimeMetaClassImpl.NOT_CALLED;
    }

    /* (non-Javadoc)
     * @see ng.runtime.Callable#callQuick(ng.runtime.ThreadContext, java.lang.Object, java.lang.Object, java.lang.Object)
     */
    public Object callQuick(ThreadContext tc, Object instance, Object p1, Object p2) throws Throwable {
      return RuntimeMetaClassImpl.NOT_CALLED;
    }

    /* (non-Javadoc)
     * @see ng.runtime.Callable#callQuick(ng.runtime.ThreadContext, java.lang.Object, java.lang.Object)
     */
    public Object callQuick(ThreadContext tc, Object instance, Object p1) throws Throwable {
      return RuntimeMetaClassImpl.NOT_CALLED;
    }

    /* (non-Javadoc)
     * @see ng.runtime.Callable#callQuick(ng.runtime.ThreadContext, java.lang.Object, short)
     */
    public Object callQuick(ThreadContext tc, Object instance, short p1) throws Throwable {
      return RuntimeMetaClassImpl.NOT_CALLED;
    }

    /* (non-Javadoc)
     * @see ng.runtime.Callable#callQuick(ng.runtime.ThreadContext, java.lang.Object)
     */
    public Object callQuick(ThreadContext tc, Object instance) throws Throwable {
      return RuntimeMetaClassImpl.NOT_CALLED;
    }

    /* (non-Javadoc)
     * @see ng.runtime.MetaMethod#selectMethod(ng.runtime.ThreadContext, uk.co.wilson.ng.runtime.metaclass.methods.MetaMethodSelection)
     */
    public MetaMethodSelection selectMethod(final ThreadContext tc, MetaMethodSelection currentSelection) {
      return currentSelection;
    }

    /* (non-Javadoc)
     * @see ng.runtime.MetaMethod#selectMethod(ng.runtime.ThreadContext, uk.co.wilson.ng.runtime.metaclass.methods.MetaMethodSelection, ng.runtime.RuntimeMetaClass)
     */
    public MetaMethodSelection selectMethod(final ThreadContext tc, MetaMethodSelection currentSelection, RuntimeMetaClass p1) {
      return currentSelection;
    }

    /* (non-Javadoc)
     * @see ng.runtime.MetaMethod#selectMethod(ng.runtime.ThreadContext, uk.co.wilson.ng.runtime.metaclass.methods.MetaMethodSelection, ng.runtime.RuntimeMetaClass, ng.runtime.RuntimeMetaClass)
     */
    public MetaMethodSelection selectMethod(final ThreadContext tc, MetaMethodSelection currentSelection, RuntimeMetaClass p1, RuntimeMetaClass p2) {
      return currentSelection;
    }

    /* (non-Javadoc)
     * @see ng.runtime.MetaMethod#selectMethod(ng.runtime.ThreadContext, uk.co.wilson.ng.runtime.metaclass.methods.MetaMethodSelection, ng.runtime.RuntimeMetaClass, ng.runtime.RuntimeMetaClass, ng.runtime.RuntimeMetaClass)
     */
    public MetaMethodSelection selectMethod(final ThreadContext tc, MetaMethodSelection currentSelection, RuntimeMetaClass p1, RuntimeMetaClass p2, RuntimeMetaClass p3) {
      return currentSelection;
    }

    /* (non-Javadoc)
     * @see ng.runtime.MetaMethod#selectMethod(ng.runtime.ThreadContext, uk.co.wilson.ng.runtime.metaclass.methods.MetaMethodSelection, ng.runtime.RuntimeMetaClass, ng.runtime.RuntimeMetaClass, ng.runtime.RuntimeMetaClass, ng.runtime.RuntimeMetaClass)
     */
    public MetaMethodSelection selectMethod(final ThreadContext tc, MetaMethodSelection currentSelection, RuntimeMetaClass p1, RuntimeMetaClass p2, RuntimeMetaClass p3, RuntimeMetaClass p4) {
      return currentSelection;
    }

    /* (non-Javadoc)
     * @see ng.runtime.MetaMethod#selectMethod(ng.runtime.ThreadContext, uk.co.wilson.ng.runtime.metaclass.methods.MetaMethodSelection, ng.runtime.RuntimeMetaClass[])
     */
    public MetaMethodSelection selectMethod(final ThreadContext tc, MetaMethodSelection currentSelection, RuntimeMetaClass[] argumentMetaClasses) {
      return currentSelection;
    }
  };
}
