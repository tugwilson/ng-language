package uk.co.wilson.ng.runtime.metaclass;

import ng.runtime.metaclass.DoStaticMethodCall;
import ng.runtime.metaclass.MetaClass;
import ng.runtime.metaclass.Misc;

public abstract class BaseMetaClass implements MetaClass {
  private volatile Misc modifiedMisc = null;
  private volatile DoStaticMethodCall modifiedStaticMethodCall = null;

  private final Class theClass;
  private final Misc misc;
  private final DoStaticMethodCall staticMethodCall;

  protected BaseMetaClass(final Class<?> theClass) {
    this.theClass = theClass;
    this.misc = new MiscImpl(this.theClass);
    this.staticMethodCall = new DoStaticMethodCallImpl(this);
  }

  /* (non-JavaDoc)
   * @see ng.runtime.metaclass.MetaClass#getTheClass()
   */
  public Class getTheClass() {
    return this.theClass;
  }

  public MetaClass createMetaClassFor(final Class<?> type) {
    return new MetaClassImpl(type);
  }

  /* (non-JavaDoc)
   * @see ng.runtime.metaclass.MetaClass#misc()
   */
  public Misc misc() {
    if (this.modifiedMisc == null) {
      return this.misc;
    } else {
      return this.modifiedMisc;
    }
  }

  /* (non-JavaDoc)
   * @see ng.runtime.metaclass.MetaClass#staticMethodCall()
   */
  public DoStaticMethodCall staticMethodCall() {
    if (this.modifiedStaticMethodCall == null) {
      return this.staticMethodCall;
    } else {
      return this.modifiedStaticMethodCall;
    }
  }
}
