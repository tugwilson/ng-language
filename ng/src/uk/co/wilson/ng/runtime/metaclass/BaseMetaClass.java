package uk.co.wilson.ng.runtime.metaclass;

import ng.runtime.metaclass.Conversion;
import ng.runtime.metaclass.MetaClass;
import ng.runtime.metaclass.Misc;

public abstract class BaseMetaClass implements MetaClass {
  private final Misc modifiedMisc = null;

  protected volatile Conversion modifiedConvert = null;

  private final Misc misc;

  protected BaseMetaClass(final Class<?> theClass) {
    this.misc = new MiscImpl(theClass);
  }

  public MetaClass createMetaClassFor(final Class<?> type) {
    return null;
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
}
