package ng.runtime.metaclass;

import java.util.Map;

/**
 * @author John
 *
 */
public interface StaticMethodCallCategorySupport {
  Map<MetaClass, DoStaticMethodCall> getCategoryStaticMethodCallMap();
  void setCategoryStaticMethodCallMap(Map<MetaClass, DoStaticMethodCall> categoryStsticMethodCallMap);
}
