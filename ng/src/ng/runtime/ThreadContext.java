package ng.runtime;

import java.math.BigDecimal;
import java.math.BigInteger;

/**
 * @author John
 *
 */
public interface ThreadContext {
  RuntimeMetaClass getRuntimeMetaClass(Class theClass);
  
  /**
   * @param instance
   * @param propertyName
   * @return
   */
  Object getProperty(Object instance, String propertyName) throws Throwable;

  /**
   * @param instance
   * @param propertyName
   * @param newValue
   * @return
   */
  Object setProperty(Object instance, String propertyName, Object newValue) throws Throwable;
  
  /**
   * @param metaClass
   * @param instance
   * @param propertyName
   * @return
   * @throws Throwable
   */
  Object getProperty(RuntimeMetaClass metaClass, Object instance, String propertyName) throws Throwable;

  /**
   * @param metaClass
   * @param instance
   * @param propertyName
   * @param newValue
   * @return
   * @throws Throwable
   */
  Object setProperty(RuntimeMetaClass metaClass, Object instance, String propertyName, Object newValue) throws Throwable;

  /**
   * @param instance
   * @param fieldName
   * @return
   * @throws Throwable
   */
  Object getField(Object instance, String fieldName) throws Throwable;

  /**
   * @param instance
   * @param fieldName
   * @param newValue
   * @return
   * @throws Throwable
   */
  Object setField(Object instance, String fieldName, Object newValue) throws Throwable;
  
  /**
   * @param metaClass
   * @param instance
   * @param fieldName
   * @return
   * @throws Throwable
   */
  Object getField(RuntimeMetaClass metaClass, Object instance, String fieldName) throws Throwable;

  /**
   * @param metaClass
   * @param instance
   * @param fieldName
   * @param newValue
   * @return
   * @throws Throwable
   */
  Object setField(RuntimeMetaClass metaClass, Object instance, String fieldName, Object newValue) throws Throwable;
  
  /**
   * @param instance
   * @param methodName
   * @param arguments
   * @return the result of invoking the method on the instance with the supplied
   *         parameters.
   */
  Object invokeMethod(Object instance, String methodName, Object[] arguments) throws Throwable;
  
  /**
   * @param instance
   * @param methodName
   * @return
   */
  Object invokeMethodQuick(Object instance, String methodName) throws Throwable;
  
  /**
   * @param instance
   * @param methodName
   * @param p1
   * @return
   */
  Object invokeMethodQuick(Object instance, String methodName, Object p1) throws Throwable;
  
  /**
   * @param instance
   * @param methodName
   * @param p1
   * @return
   */
  Object invokeMethodQuick(Object instance, String methodName, boolean p1) throws Throwable;
  
  /**
   * @param instance
   * @param methodName
   * @param p1
   * @return
   */
  Object invokeMethodQuick(Object instance, String methodName, char p1) throws Throwable;
  
  /**
   * @param instance
   * @param methodName
   * @param p1
   * @return
   */
  Object invokeMethodQuick(Object instance, String methodName, byte p1) throws Throwable;
  
  /**
   * @param instance
   * @param methodName
   * @param p1
   * @return
   */
  Object invokeMethodQuick(Object instance, String methodName, short p1) throws Throwable;
  
  /**
   * @param instance
   * @param methodName
   * @param p1
   * @return
   */
  Object invokeMethodQuick(Object instance, String methodName, int p1) throws Throwable;
  
  /**
   * @param instance
   * @param methodName
   * @param p1
   * @return
   */
  Object invokeMethodQuick(Object instance, String methodName, long p1) throws Throwable;
  
  /**
   * @param instance
   * @param methodName
   * @param p1
   * @return
   */
  Object invokeMethodQuick(Object instance, String methodName, float p1) throws Throwable;
  
  /**
   * @param instance
   * @param methodName
   * @param p1
   * @return
   */
  Object invokeMethodQuick(Object instance, String methodName, double p1) throws Throwable;
  
  /**
   * @param instance
   * @param methodName
   * @param p1
   * @return
   */
  Object invokeMethodQuick(Object instance, String methodName, BigInteger p1) throws Throwable;
  
  /**
   * @param instance
   * @param methodName
   * @param p1
   * @return
   */
  Object invokeMethodQuick(Object instance, String methodName, BigDecimal p1) throws Throwable;
  
  /**
   * @param instance
   * @param methodName
   * @param p1
   * @param p2
   * @return
   */
  Object invokeMethodQuick(Object instance, String methodName, Object p1, Object p2) throws Throwable;
  
  /**
   * @param instance
   * @param methodName
   * @param p1
   * @param p2
   * @param p3
   * @return
   */
  Object invokeMethodQuick(Object instance, String methodName, Object p1, Object p2, Object p3) throws Throwable;
  
  /**
   * @param instance
   * @param methodName
   * @param p1
   * @param p2
   * @param p3
   * @param p4
   * @return
   */
  Object invokeMethodQuick(Object instance, String methodName, Object p1, Object p2, Object p3, Object p4) throws Throwable;
  
  /**
   * @param metaClass
   * @param instance
   * @param methodName
   * @param arguments
   * @return the result of invoking the method on the instance with the supplied
   *         parameters.
   */
  Object invokeMethod(RuntimeMetaClass metaClass,Object instance, String methodName, Object[] arguments) throws Throwable;
  
  /**
   * @param metaClass
   * @param instance
   * @param methodName
   * @return
   * @throws Throwable
   */
  Object invokeMethodQuick(RuntimeMetaClass metaClass, Object instance, String methodName) throws Throwable;
  
  /**
   * @param metaClass
   * @param instance
   * @param methodName
   * @param p1
   * @return
   */
  Object invokeMethodQuick(RuntimeMetaClass metaClass, Object instance, String methodName, Object p1) throws Throwable;
  
  /**
   * @param metaClass
   * @param instance
   * @param methodName
   * @param p1
   * @return
   */
  Object invokeMethodQuick(RuntimeMetaClass metaClass, Object instance, String methodName, boolean p1) throws Throwable;
  
  /**
   * @param metaClass
   * @param instance
   * @param methodName
   * @param p1
   * @return
   */
  Object invokeMethodQuick(RuntimeMetaClass metaClass, Object instance, String methodName, char p1) throws Throwable;
  
  /**
   * @param metaClass
   * @param instance
   * @param methodName
   * @param p1
   * @return
   */
  Object invokeMethodQuick(RuntimeMetaClass metaClass, Object instance, String methodName, byte p1) throws Throwable;
  
  /**
   * @param metaClass
   * @param instance
   * @param methodName
   * @param p1
   * @return
   */
  Object invokeMethodQuick(RuntimeMetaClass metaClass, Object instance, String methodName, short p1) throws Throwable;
  
  /**
   * @param metaClass
   * @param instance
   * @param methodName
   * @param p1
   * @return
   */
  Object invokeMethodQuick(RuntimeMetaClass metaClass, Object instance, String methodName, int p1) throws Throwable;
  
  /**
   * @param metaClass
   * @param instance
   * @param methodName
   * @param p1
   * @return
   */
  Object invokeMethodQuick(RuntimeMetaClass metaClass, Object instance, String methodName, long p1) throws Throwable;
  
  /**
   * @param metaClass
   * @param instance
   * @param methodName
   * @param p1
   * @return
   */
  Object invokeMethodQuick(RuntimeMetaClass metaClass, Object instance, String methodName, float p1) throws Throwable;
  
  /**
   * @param metaClass
   * @param instance
   * @param methodName
   * @param p1
   * @return
   */
  Object invokeMethodQuick(RuntimeMetaClass metaClass, Object instance, String methodName, double p1) throws Throwable;
  
  /**
   * @param metaClass
   * @param instance
   * @param methodName
   * @param p1
   * @return
   */
  Object invokeMethodQuick(RuntimeMetaClass metaClass, Object instance, String methodName, BigInteger p1) throws Throwable;
  
  /**
   * @param metaClass
   * @param instance
   * @param methodName
   * @param p1
   * @return
   */
  Object invokeMethodQuick(RuntimeMetaClass metaClass, Object instance, String methodName, BigDecimal p1) throws Throwable;
  
  /**
   * @param metaClass
   * @param instance
   * @param methodName
   * @param p1
   * @param p2
   * @return
   */
  Object invokeMethodQuick(RuntimeMetaClass metaClass, Object instance, String methodName, Object p1, Object p2) throws Throwable;
  
  /**
   * @param metaClass
   * @param instance
   * @param methodName
   * @param p1
   * @param p2
   * @param p3
   * @return
   */
  Object invokeMethodQuick(RuntimeMetaClass metaClass, Object instance, String methodName, Object p1, Object p2, Object p3) throws Throwable;
  
  /**
   * @param metaClass
   * @param instance
   * @param methodName
   * @param p1
   * @param p2
   * @param p3
   * @param p4
   * @return
   */
  Object invokeMethodQuick(RuntimeMetaClass metaClass, Object instance, String methodName, Object p1, Object p2, Object p3, Object p4) throws Throwable;
  
  /**
   * @param instance
   * @param arguments
   * @return
   */
  Object call(Object instance, Object[] arguments) throws Throwable;
  
  /**
   * @param instance
   * @return
   */
  Object callQuick(Object instance) throws Throwable;
  
  /**
   * @param instance
   * @param p1
   * @return
   */
  Object callQuick(Object instance, Object p1) throws Throwable;
  
  /**
   * @param instance
   * @param p1
   * @return
   */
  Object callQuick(Object instance, boolean p1) throws Throwable;
  
  /**
   * @param instance
   * @param p1
   * @return
   */
  Object callQuick(Object instance, char p1) throws Throwable;
  
  /**
   * @param instance
   * @param p1
   * @return
   */
  Object callQuick(Object instance, byte p1) throws Throwable;
  
  /**
   * @param instance
   * @param p1
   * @return
   */
  Object callQuick(Object instance, short p1) throws Throwable;
  
  /**
   * @param instance
   * @param p1
   * @return
   */
  Object callQuick(Object instance, int p1) throws Throwable;
  
  /**
   * @param instance
   * @param p1
   * @return
   */
  Object callQuick(Object instance, long p1) throws Throwable;
  
  /**
   * @param instance
   * @param p1
   * @return
   */
  Object callQuick(Object instance, float p1) throws Throwable;
  
  /**
   * @param instance
   * @param p1
   * @return
   */
  Object callQuick(Object instance, double p1) throws Throwable;
  
  /**
   * @param instance
   * @param p1
   * @return
   */
  Object callQuick(Object instance, BigInteger p1) throws Throwable;
  
  /**
   * @param instance
   * @param p1
   * @return
   */
  Object callQuick(Object instance, BigDecimal p1) throws Throwable;
  
  /**
   * @param instance
   * @param p1
   * @param p2
   * @return
   */
  Object callQuick(Object instance, Object p1, Object p2) throws Throwable;
  
  /**
   * @param instance
   * @param p1
   * @param p2
   * @param p3
   * @return
   */
  Object callQuick(Object instance, Object p1, Object p2, Object p3) throws Throwable;
  
  /**
   * @param instance
   * @param p1
   * @param p2
   * @param p3
   * @param p4
   * @return
   */
  Object callQuick(Object instance, Object p1, Object p2, Object p3, Object p4) throws Throwable;
  
  /**
   * @param metaClass
   * @param instance
   * @param arguments
   * @return
   */
  Object call(RuntimeMetaClass metaClass, Object instance, Object[] arguments) throws Throwable;
  
  /**
   * @param instance
   * @return
   */
  Object callQuick(RuntimeMetaClass metaClass, Object instance) throws Throwable;
  
  /**
   * @param metaClass
   * @param instance
   * @param p1
   * @return
   */
  Object callQuick(RuntimeMetaClass metaClass, Object instance, Object p1) throws Throwable;
  
  /**
   * @param metaClass
   * @param instance
   * @param p1
   * @return
   */
  Object callQuick(RuntimeMetaClass metaClass, Object instance, boolean p1) throws Throwable;
  
  /**
   * @param metaClass
   * @param instance
   * @param p1
   * @return
   */
  Object callQuick(RuntimeMetaClass metaClass, Object instance, char p1) throws Throwable;
  
  /**
   * @param metaClass
   * @param instance
   * @param p1
   * @return
   */
  Object callQuick(RuntimeMetaClass metaClass, Object instance, byte p1) throws Throwable;
  
  /**
   * @param metaClass
   * @param instance
   * @param p1
   * @return
   */
  Object callQuick(RuntimeMetaClass metaClass, Object instance, short p1) throws Throwable;
  
  /**
   * @param metaClass
   * @param instance
   * @param p1
   * @return
   */
  Object callQuick(RuntimeMetaClass metaClass, Object instance, int p1) throws Throwable;
  
  /**
   * @param metaClass
   * @param instance
   * @param p1
   * @return
   */
  Object callQuick(RuntimeMetaClass metaClass, Object instance, long p1) throws Throwable;
  
  /**
   * @param metaClass
   * @param instance
   * @param p1
   * @return
   */
  Object callQuick(RuntimeMetaClass metaClass, Object instance, float p1) throws Throwable;
  
  /**
   * @param metaClass
   * @param instance
   * @param p1
   * @return
   */
  Object callQuick(RuntimeMetaClass metaClass, Object instance, double p1) throws Throwable;
  
  /**
   * @param metaClass
   * @param instance
   * @param p1
   * @return
   */
  Object callQuick(RuntimeMetaClass metaClass, Object instance, BigInteger p1) throws Throwable;
  
  /**
   * @param metaClass
   * @param instance
   * @param p1
   * @return
   */
  Object callQuick(RuntimeMetaClass metaClass, Object instance, BigDecimal p1) throws Throwable;
  
  /**
   * @param metaClass
   * @param instance
   * @param p1
   * @param p2
   * @return
   */
  Object callQuick(RuntimeMetaClass metaClass, Object instance, Object p1, Object p2) throws Throwable;
  
  /**
   * @param metaClass
   * @param instance
   * @param p1
   * @param p2
   * @param p3
   * @return
   */
  Object callQuick(RuntimeMetaClass metaClass, Object instance, Object p1, Object p2, Object p3) throws Throwable;
  
  /**
   * @param metaClass
   * @param instance
   * @param p1
   * @param p2
   * @param p3
   * @param p4
   * @return
   */
  Object callQuick(RuntimeMetaClass metaClass, Object instance, Object p1, Object p2, Object p3, Object p4) throws Throwable;
  
  /**
   * @param instance
   * @param type
   * @return
   * @throws Throwable
   */
  Object asType(Object instance, Class type) throws Throwable;
  
  /**
   * @param instance
   * @return
   */
  byte asByte(Object instance) throws Throwable;
  
  /**
   * @param instance
   * @return
   */
  char asChar(Object instance) throws Throwable;
  
  /**
   * @param instance
   * @return
   */
  short asShort(Object instance) throws Throwable;
  
  /**
   * @param instance
   * @return
   */
  int asInt(Object instance) throws Throwable;
  
  /**
   * @param instance
   * @return
   */
  long asLong(Object instance) throws Throwable;
  
  /**
   * @param instance
   * @return
   */
  float asFloat(Object instance) throws Throwable;
  
  /**
   * @param instance
   * @return
   */
  double asDouble(Object instance) throws Throwable;
  
  /**
   * @param instance
   * @return
   */
  boolean asBoolean(Object instance) throws Throwable;
  
  /**
   * @param metaClass
   * @param instance
   * @param type
   * @return
   * @throws Throwable
   */
  Object asType(RuntimeMetaClass metaClass, Object instance, Class type) throws Throwable;
  
  /**
   * @param metaClass
   * @param instance
   * @return
   * @throws Throwable
   */
  byte asByte(RuntimeMetaClass metaClass, Object instance) throws Throwable;
  
  /**
   * @param metaClass
   * @param instance
   * @return
   * @throws Throwable
   */
  char asChar(RuntimeMetaClass metaClass, Object instance) throws Throwable;
  
  /**
   * @param metaClass
   * @param instance
   * @return
   * @throws Throwable
   */
  short asShort(RuntimeMetaClass metaClass, Object instance) throws Throwable;
  
  /**
   * @param metaClass
   * @param instance
   * @return
   * @throws Throwable
   */
  int asInt(RuntimeMetaClass metaClass, Object instance) throws Throwable;
  
  /**
   * @param metaClass
   * @param instance
   * @return
   * @throws Throwable
   */
  long asLong(RuntimeMetaClass metaClass, Object instance) throws Throwable;
  
  /**
   * @param metaClass
   * @param instance
   * @return
   * @throws Throwable
   */
  float asFloat(RuntimeMetaClass metaClass, Object instance) throws Throwable;
  
  /**
   * @param metaClass
   * @param instance
   * @return
   * @throws Throwable
   */
  double asDouble(RuntimeMetaClass metaClass, Object instance) throws Throwable;
  
  /**
   * @param metaClass
   * @param instance
   * @return
   * @throws Throwable
   */
  boolean asBoolean(RuntimeMetaClass metaClass, Object instance) throws Throwable;

  /**
   * @param instance
   * @param index
   * @return
   * @throws Throwable
   */
  Object getAt(Object instance, Object index) throws Throwable;
  
  /**
   * @param instance
   * @param index
   * @return
   */
  Object getAt(Object instance, int index) throws Throwable;
  
  /**
   * @param instance
   * @param index
   * @return
   */
  Object getAt(Object instance, BigInteger index) throws Throwable;
  
  /**
   * @param metaClass
   * @param instance
   * @param index
   * @return
   * @throws Throwable
   */
  Object getAt(RuntimeMetaClass metaClass, Object instance, int index) throws Throwable;
  
  /**
   * @param metaClass
   * @param instance
   * @param index
   * @return
   * @throws Throwable
   */
  Object getAt(RuntimeMetaClass metaClass, Object instance, BigInteger index) throws Throwable;
  
  /**
   * @param instance
   * @param index
   * @return
   * @throws Throwable
   */
  Object putAt(Object instance, Object index) throws Throwable;
  
  /**
   * @param instance
   * @param index
   */
  Object putAt(Object instance, int index) throws Throwable;
  
  /**
   * @param instance
   * @param index
   */
  Object putAt(Object instance, BigInteger index) throws Throwable; 
  
  /**
   * @param metaClass
   * @param instance
   * @param index
   * @return
   * @throws Throwable
   */
  Object putAt(RuntimeMetaClass metaClass, Object instance, int index) throws Throwable;
  
  /**
   * @param metaClass
   * @param instance
   * @param index
   * @return
   * @throws Throwable
   */
  Object putAt(RuntimeMetaClass metaClass, Object instance, BigInteger index) throws Throwable; 
}
