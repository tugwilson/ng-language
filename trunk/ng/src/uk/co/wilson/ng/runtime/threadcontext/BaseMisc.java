package uk.co.wilson.ng.runtime.threadcontext;

import ng.runtime.metaclass.MetaClass;
import ng.runtime.threadcontext.Misc;
import ng.runtime.threadcontext.ThreadContext;

public class BaseMisc implements Misc {
  private final ThreadContext tc;

  public BaseMisc(final ThreadContext tc) {
    this.tc = tc;
  }

  public Class<?> getTheClass(final MetaClass metaClass, final Object instance) {
    return metaClass.misc().getTheClass(instance);
  }

  public Class<?> getTheClass(final Object instance) {
    return getTheClass(this.tc.getMetaClassFor(instance), instance);
  }
}
