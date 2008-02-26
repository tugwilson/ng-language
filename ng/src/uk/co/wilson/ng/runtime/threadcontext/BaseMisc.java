package uk.co.wilson.ng.runtime.threadcontext;

import ng.lang.MetaClass;
import ng.runtime.threadcontext.ExtendedThreadContext;
import ng.runtime.threadcontext.Misc;

public class BaseMisc implements Misc {
  private final ExtendedThreadContext tc;

  public BaseMisc(final ExtendedThreadContext tc) {
    this.tc = tc;
  }

  public Class<?> getTheClass(final MetaClass metaClass, final Object instance) {
    return metaClass.misc().getTheClass(instance);
  }

  public Class<?> getTheClass(final Object instance) {
    return getTheClass(this.tc.getMetaClassFor(instance), instance);
  }
}
