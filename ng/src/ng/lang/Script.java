package ng.lang;

import ng.runtime.RuntimeMetaClass;


/**
 * @author John
 *
 */
public abstract class Script extends Closure {

  /* (non-JavaDoc)
   * @see ng.lang.Closure#getMetaClass()
   */
  @Override
  public RuntimeMetaClass getMetaClass() {
    return NgSystem.scriptMetaClass;
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
