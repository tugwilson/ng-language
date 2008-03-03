package ng.runtime.threadcontext;


import java.util.Map;

import ng.runtime.metaclass.Conversion;

/**
 * @author John
 *
 */
public interface ConversionOperationCategorySupport {
  Map<Object, Conversion> getCategoryConversionCallMap();
  void setCategoryConversionMap(Map<Object, Conversion> categoryConversionMap);
}
