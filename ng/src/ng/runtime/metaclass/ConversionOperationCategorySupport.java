package ng.runtime.metaclass;


import java.util.Map;

/**
 * @author John
 *
 */
public interface ConversionOperationCategorySupport {
  Map<Object, Conversion> getCategoryConversionCallMap();
  void setCategoryConversionMap(Map<Object, Conversion> categoryConversionMap);
}
