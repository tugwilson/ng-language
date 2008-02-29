package uk.co.wilson.ng.runtime.threadcontext;

import ng.runtime.metaclass.MetaClass;
import ng.runtime.threadcontext.ExtendedThreadContext;
import ng.runtime.threadcontext.Misc;

public class BaseMiscImpl implements Misc {
  private final ExtendedThreadContext tc;

  public BaseMiscImpl(final ExtendedThreadContext tc) {
    this.tc = tc;
  }

  public Class<?> getTheClass(final MetaClass metaClass, final Object instance) {
    return metaClass.misc().getTheClass(instance);
  }

  public Class<?> getTheClass(final Object instance) {
    return getTheClass(this.tc.getMetaClassFor(instance), instance);
  }
}
