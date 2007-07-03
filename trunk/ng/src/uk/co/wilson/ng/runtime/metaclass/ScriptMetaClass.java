package uk.co.wilson.ng.runtime.metaclass;

import ng.lang.NgSystem;
import ng.lang.Script;
import uk.co.wilson.ng.lang.ScriptImpl;

/**
 * @author John
 *
 */
public class ScriptMetaClass extends ClosureMetaClass {
  public ScriptMetaClass() {
    super(ScriptImpl.class);
  }
  
  /* (non-Javadoc)
   * @see uk.co.wilson.ng.runtime.metaclass.RuntimeMetaClassImpl#getProperty(java.lang.Object, java.lang.String)
   */
  @Override
  public Object getProperty(final Object instance, final String propertyName) throws Throwable {
  final Object binding = ((Script)instance).getBinding();
  
    return NgSystem.metaClassRegistry.getRuntimeMetaClass(binding).getProperty(binding, propertyName);
  }
  
  //
  // TODO: what about setProperty?
  //
}
