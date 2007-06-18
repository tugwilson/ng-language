package ng.lang;

import ng.runtime.Callable;
import ng.runtime.NgBaseObject;
import ng.runtime.RuntimeMetaClass;

/**
 * @author John
 *
 */
public abstract class Closure extends NgBaseObject implements Callable {

  /**
   * @param metaClass
   */
  public Closure(final RuntimeMetaClass metaClass) {
    super(metaClass);
  }  
}
