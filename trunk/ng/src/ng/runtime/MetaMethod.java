package ng.runtime;

import uk.co.wilson.ng.runtime.metaclass.reflection.MetaMethodSelection;

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
  Object call(Object instance, Object[] arguments);
  
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
   * @param argumentMetaClasses
   * @return
   */
  MetaMethodSelection selectMethod(RuntimeMetaClass[] argumentMetaClasses);
  
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
