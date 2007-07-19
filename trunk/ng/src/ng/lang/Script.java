package ng.lang;

import ng.runtime.RuntimeMetaClass;


/**
 * @author John
 *
 */
public abstract class Script extends Closure {
  /**
   * @return
   */
  public static RuntimeMetaClass get$MetaClass() {
    return NgSystem.scriptMetaClass;
  }
  

  /* (non-JavaDoc)
   * @see ng.lang.Closure#getMetaClass()
   */
  @Override
  public RuntimeMetaClass getMetaClass() {
    return get$MetaClass();
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
