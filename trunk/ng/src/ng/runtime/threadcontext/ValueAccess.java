package ng.runtime.threadcontext;

import ng.runtime.metaclass.MetaClass;

public interface ValueAccess {
  Object get(MetaClass metaClass, String name);
  Object get(String name);

  Object put(MetaClass metaClass, String name, Object value);
  Object put(String name, Object value);

}
