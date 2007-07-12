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
   * @param tc
   * @param currentSelection
   * @param argumentMetaClasses
   * @return
   */
  MetaMethodSelection selectMethod(ThreadContext tc, MetaMethodSelection currentSelection, MetaClass[] argumentMetaClasses);
  
  /**
   * @param tc
   * @param currentSelection
   * @return
   */
  MetaMethodSelection selectMethod(ThreadContext tc, MetaMethodSelection currentSelection);
  
  /**
   * @param tc
   * @param currentSelection
   * @param p1
   * @return
   */
  MetaMethodSelection selectMethod(ThreadContext tc, MetaMethodSelection currentSelection, MetaClass p1);
  
  /**
   * @param tc
   * @param currentSelection
   * @param p1
   * @param p2
   * @return
   */
  MetaMethodSelection selectMethod(ThreadContext tc, MetaMethodSelection currentSelection, MetaClass p1, MetaClass p2);
  
  /**
   * @param tc
   * @param currentSelection
   * @param p1
   * @param p2
   * @param p3
   * @return
   */
  MetaMethodSelection selectMethod(ThreadContext tc, MetaMethodSelection currentSelection, MetaClass p1, MetaClass p2, MetaClass p3);
  
  /**
   * @param tc
   * @param currentSelection
   * @param p1
   * @param p2
   * @param p3
   * @param p4
   * @return
   */
  MetaMethodSelection selectMethod(ThreadContext tc, MetaMethodSelection currentSelection, MetaClass p1, MetaClass p2, MetaClass p3, MetaClass p4);
}
