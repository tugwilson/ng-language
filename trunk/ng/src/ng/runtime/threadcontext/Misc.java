package ng.runtime.threadcontext;

import ng.lang.MetaClass;

public interface Misc {
  public abstract Class<?> getTheClass(MetaClass metaClass, Object instance);
  public abstract Class<?> getTheClass(Object instance);
}
