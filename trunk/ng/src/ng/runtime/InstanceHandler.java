package ng.runtime;

import uk.co.wilson.ng.runtime.metaclass.RuntimeMetaClassImpl;
import uk.co.wilson.ng.runtime.metaclass.reflection.MetaMethodSelection;

/**
 * @author tug
 *
 */
public interface InstanceHandler extends MetaClass {
  
  /**
   * @param currentSelection
   * @param methodName
   * @param argumentMetaClasses
   * @return
   */
  MetaMethodSelection selectMethod(MetaMethodSelection currentSelection, String methodName, RuntimeMetaClass[] argumentMetaClasses);
  
  /**
   * @param instance
   * @param methodName
   * @return
   */
  Object invokeMethodQuick(Object instance, String methodName);
  
  /**
   * @param instance
   * @param methodName
   * @param p1
   * @return
   */
  Object invokeMethodQuick(Object instance, String methodName, Object p1);
  
  /**
   * @param instance
   * @param methodName
   * @param p1
   * @param p2
   * @return
   */
  Object invokeMethodQuick(Object instance, String methodName, Object p1, Object p2);
  
  /**
   * @param instance
   * @param methodName
   * @param p1
   * @param p2
   * @param p3
   * @return
   */
  Object invokeMethodQuick(Object instance, String methodName, Object p1, Object p2, Object p3);
  
  /**
   * @param instance
   * @param methodName
   * @param p1
   * @param p2
   * @param p3
   * @param p4
   * @return
   */
  Object invokeMethodQuick(Object instance, String methodName, Object p1, Object p2, Object p3, Object p4);
  
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
