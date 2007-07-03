package uk.co.wilson.ng.runtime.metaclass;

import ng.lang.NgSystem;
import ng.lang.Script;
import ng.runtime.Callable;
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
  public Callable doGetGetPropertyCallable(final Object instance, final String propertyName) throws Throwable {
  final Object binding = ((Script)instance).getBinding();
  
    return NgSystem.metaClassRegistry.getInternalMetaClass(binding).doGetGetPropertyCallable(binding, propertyName);
  }
  
  //
  // TODO: what about setProperty?
  //
}