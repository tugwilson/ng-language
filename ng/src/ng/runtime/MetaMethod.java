package ng.runtime;

import java.math.BigDecimal;
import java.math.BigInteger;

import uk.co.wilson.ng.runtime.metaclass.methods.MetaMethodSelection;

/**
 * @author tug
 *
 */
/**
 * @author John
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
  Object call(Object instance, Object[] arguments) throws Throwable;
  
  /**
   * @param currentSelection
   * @param argumentMetaClasses
   * @return
   */
  MetaMethodSelection selectMethod(MetaMethodSelection currentSelection, RuntimeMetaClass[] argumentMetaClasses);
  
  /**
   * @param currentSelection
   * @return
   */
  MetaMethodSelection selectMethod(MetaMethodSelection currentSelection);
  
  /**
   * @param currentSelection
   * @param p1
   * @return
   */
  MetaMethodSelection selectMethod(MetaMethodSelection currentSelection, RuntimeMetaClass p1);
  
  /**
   * @param currentSelection
   * @param p1
   * @param p2
   * @return
   */
  MetaMethodSelection selectMethod(MetaMethodSelection currentSelection, RuntimeMetaClass p1, RuntimeMetaClass p2);
  
  /**
   * @param currentSelection
   * @param p1
   * @param p2
   * @param p3
   * @return
   */
  MetaMethodSelection selectMethod(MetaMethodSelection currentSelection, RuntimeMetaClass p1, RuntimeMetaClass p2, RuntimeMetaClass p3);
  
  /**
   * @param currentSelection
   * @param p1
   * @param p2
   * @param p3
   * @param p4
   * @return
   */
  MetaMethodSelection selectMethod(MetaMethodSelection currentSelection, RuntimeMetaClass p1, RuntimeMetaClass p2, RuntimeMetaClass p3, RuntimeMetaClass p4);
  
  /**
   * @param instance
   * @return
   */
  Object call(Object instance) throws Throwable;
  
  /**
   * @param instance
   * @param p1
   * @return
   */
  Object call(Object instance, Object p1) throws Throwable;
  
  /**
   * @param instance
   * @param p1
   * @return
   */
  Object call(Object instance, boolean p1) throws Throwable;
  
  /**
   * @param instance
   * @param p1
   * @return
   */
  Object call(Object instance, char p1) throws Throwable;
  
  /**
   * @param instance
   * @param p1
   * @return
   */
  Object call(Object instance, byte p1) throws Throwable;
  
  /**
   * @param instance
   * @param p1
   * @return
   */
  Object call(Object instance, short p1) throws Throwable;
  
  /**
   * @param instance
   * @param p1
   * @return
   */
  Object call(Object instance, int p1) throws Throwable;
  
  /**
   * @param instance
   * @param p1
   * @return
   */
  Object call(Object instance, long p1) throws Throwable;
  
  /**
   * @param instance
   * @param p1
   * @return
   */
  Object call(Object instance, float p1) throws Throwable;
  
  /**
   * @param instance
   * @param p1
   * @return
   */
  Object call(Object instance, double p1) throws Throwable;
  
  /**
   * @param instance
   * @param p1
   * @return
   */
  Object call(Object instance, BigInteger p1) throws Throwable;
  
  /**
   * @param instance
   * @param p1
   * @return
   */
  Object call(Object instance, BigDecimal p1) throws Throwable;
  
  /**
   * @param instance
   * @param p1
   * @param p2
   * @return
   */
  Object call(Object instance, Object p1, Object p2) throws Throwable;
  
  /**
   * @param instance
   * @param p1
   * @param p2
   * @param p3
   * @return
   */
  Object call(Object instance, Object p1, Object p2, Object p3) throws Throwable;
  
  /**
   * @param instance
   * @param p1
   * @param p2
   * @param p3
   * @param p4
   * @return
   */
  Object call(Object instance, Object p1, Object p2, Object p3, Object p4) throws Throwable;
}
