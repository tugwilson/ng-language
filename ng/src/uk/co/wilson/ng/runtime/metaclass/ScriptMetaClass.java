package uk.co.wilson.ng.runtime.metaclass;

import ng.lang.Script;
import ng.runtime.ThreadContext;
import uk.co.wilson.ng.lang.ScriptImpl;

/**
 * @author John
 *
 */
public class ScriptMetaClass extends ClosureMetaClass {
  public ScriptMetaClass() {
    super(ScriptImpl.class, new ScriptInternalMetaClass(ScriptImpl.class));
  }
}


class ScriptInternalMetaClass extends InternalMetaClassImpl {
  /**
   * @param theClass
   */
  public ScriptInternalMetaClass(final Class theClass) {
    super(theClass);
  }
  
  @Override
  public Object doGetProperty(final ThreadContext tc, final Object instance, final String propertyName) throws Throwable {
    return tc.getProperty(((Script)instance).getBinding(), propertyName);
  }
  
  //
  // TODO: what about setProperty?
  //
}