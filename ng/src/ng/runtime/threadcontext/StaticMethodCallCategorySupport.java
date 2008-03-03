package ng.runtime.threadcontext;

import java.util.Map;

import ng.runtime.metaclass.DoStaticMethodCall;
import ng.runtime.metaclass.MetaClass;

/**
 * @author John
 *
 */
public interface StaticMethodCallCategorySupport {
  Map<MetaClass, DoStaticMethodCall> getCategoryStaticMethodCallMap();
  void setCategoryStaticMethodCallMap(Map<MetaClass, DoStaticMethodCall> categoryStsticMethodCallMap);
}
