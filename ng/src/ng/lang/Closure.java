package ng.lang;

import ng.runtime.Callable;
import ng.runtime.RuntimeMetaClass;

/**
 * @author John
 *
 */
public abstract class Closure implements NgObject, Callable {
  /**
   * @return
   */
  public static RuntimeMetaClass get$MetaClass() {
    return NgSystem.closureMetaClass;
  }
  
  /* (non-JavaDoc)
   * @see ng.lang.NgObject#getMetaClass()
   */
  public RuntimeMetaClass getMetaClass() {
    return NgSystem.closureMetaClass;
  }
}
