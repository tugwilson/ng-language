package ng.lang;

import ng.runtime.RuntimeMetaClass;


/**
 * @author John
 *
 */
public abstract class Script extends Closure {

  /**
   * 
   */
  public Script() {
    super(NgSystem.scriptMetaClass);
  }

  /**
   * @param metaClass
   */
  public Script(final RuntimeMetaClass metaClass) {
    super(metaClass);
  }
  
  /**
   * @return
   */
  public abstract Object getBinding();
  
  /**
   * @param binding
   */
  public abstract void setBinding(Object binding);
  
  /**
   * @throws Exception
   */
  public abstract Object run() throws Throwable;
}
