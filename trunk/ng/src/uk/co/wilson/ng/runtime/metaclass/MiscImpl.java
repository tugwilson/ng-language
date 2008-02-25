package uk.co.wilson.ng.runtime.metaclass;


public class MiscImpl implements Misc {
  private final Class<?> theClass;

  /**
   * @param theClass
   */
  public MiscImpl(final Class<?> theClass) {
    this.theClass = theClass;
  }


  /* (non-JavaDoc)
   * @see ng.runtime.metaclass.Misc#getTheClass(java.lang.Object)
   */
  public Class<?> getTheClass(final Object instance) {
    return this.theClass;
  }

}
