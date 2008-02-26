package ng.runtime.metaclass;


import java.util.Map;

/**
 * @author John
 *
 */
public interface BaseConversionOperation {
  Map<Object, Conversion> getCategoryConversionCallMap();
  void setCategoryConversionMap(Map<Object, Conversion> categoryConversionMap);
}
