package ng.runtime;

import uk.co.wilson.ng.runtime.metaclass.methods.MetaMethodSelection;

/**
 * @author tug
 *
 */
/**
 * @author John
 *
 */
public interface MetaMethod extends Callable  {
  /**
   * @param metaMethod
   * @return
   */
  MetaMethod addMetaMethod(MetaMethod metaMethod);
  
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
}
