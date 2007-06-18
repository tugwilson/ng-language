package uk.co.wilson.ng.runtime.metaclass;

import ng.runtime.Callable;
import ng.runtime.MetaClass;
import uk.co.wilson.ng.lang.ClosureImpl;

/**
 * @author John
 *
 */
public class ClosureMetaClass extends RuntimeMetaClassImpl {
  public ClosureMetaClass() {
    super(ClosureImpl.class, new ClosureInternalMetaClass(ClosureImpl.class));
  }

  /* (non-Javadoc)
   * @see uk.co.wilson.ng.runtime.metaclass.RuntimeMetaClassImpl#getMetaClassFor(java.lang.Class)
   */
  @Override
  public MetaClass getMetaClassFor(final Class theClass) {
    return this;
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
