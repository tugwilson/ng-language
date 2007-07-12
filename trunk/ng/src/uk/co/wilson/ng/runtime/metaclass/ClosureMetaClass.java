package uk.co.wilson.ng.runtime.metaclass;

import ng.runtime.Callable;
import ng.runtime.InternalMetaClass;
import ng.runtime.MetaClass;
import uk.co.wilson.ng.lang.ClosureImpl;

/**
 * @author John
 *
 */
public class ClosureMetaClass extends RuntimeMetaClassImpl {
  /**
   * 
   */
  public ClosureMetaClass() {
    super(ClosureImpl.class, new ClosureInternalMetaClass(ClosureImpl.class));
  }

  /**
   * @param theClass
   * @param internalMetaClass
   */
  public ClosureMetaClass(final Class theClass, final InternalMetaClass internalMetaClass) {
    super(theClass, internalMetaClass);
   }

  /**
   * @param theClass
   */
  public ClosureMetaClass(final Class theClass) {
    super(theClass, new ClosureInternalMetaClass(ClosureImpl.class));
  }
}


class ClosureInternalMetaClass extends InternalMetaClassImpl {
  /**
   * @param theClass
   */
  public ClosureInternalMetaClass(final Class theClass) {
    super(theClass);
  }

  /* (non-Javadoc)
   * @see uk.co.wilson.ng.runtime.metaclass.InternalMetaClassImpl#doGetCallable()
   */
  @Override
  public Callable doGetCallable(final Object instance) {
    return (Callable)instance;
  }
}
