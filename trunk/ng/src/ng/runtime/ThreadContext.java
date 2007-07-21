package ng.runtime;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.List;

import uk.co.wilson.ng.runtime.metaclass.methods.MetaMethodSelection;

/**
 * @author John
 *
 */
public interface ThreadContext {
  /**
   * @param category
   */
  void setCategory(Category category);
  
  /**
   * @param categories
   */
  void setCategory(List<Category> categories);
  
  /**
   * 
   */
  void removeLastCategory();
  
  /**
   * @param instance 
   * @return The class which is represented by this MetaClass
   */
  Class getTheClass(Object instance);
  
  /**
   * @param instance 
   * @return The class which is represented by this MetaClass
   */
  Class getTheClass(MetaClass metaClass, Object instance);
  
  /**
   * @param theClass
   * @return
   */
  RuntimeMetaClass getRuntimeMetaClass(Class theClass);
  
  /**
   * @param theClass
   * @return The MetaClass which represents the behaviour of this class
   */
  RuntimeMetaClass createMetaClassFor(Class theClass);
  
  /**
   * @param metaClass
   * @param theClass
   * @return
   */
  RuntimeMetaClass createMetaClassFor(MetaClass metaClass, Class theClass);
  
  /**
   * @param theClass
   * @param arguments
   * @return the constructed instance.
   */
  Object invokeConstructor(Class theClass, Object[] arguments) throws Throwable;
  
  /**
   * @param theClass
   * @return
   */
  Object invokeConstructorQuick(Class theClass) throws Throwable;
  
  /**
   * @param theClass
   * @param p1
   * @return
   */
  Object invokeConstructorQuick(Class theClass, Object p1) throws Throwable;
  
  /**
   * @param theClass
   * @param p1
   * @return
   */
  Object invokeConstructorQuick(Class theClass, boolean p1) throws Throwable;
  
  /**
   * @param theClass
   * @param p1
   * @return
   */
  Object invokeConstructorQuick(Class theClass, char p1) throws Throwable;
  
  /**
   * @param theClass
   * @param p1
   * @return
   */
  Object invokeConstructorQuick(Class theClass, byte p1) throws Throwable;
  
  /**
   * @param theClass
   * @param p1
   * @return
   */
  Object invokeConstructorQuick(Class theClass, short p1) throws Throwable;
  
  /**
   * @param theClass
   * @param p1
   * @return
   */
  Object invokeConstructorQuick(Class theClass, int p1) throws Throwable;
  
  /**
   * @param theClass
   * @param p1
   * @return
   */
  Object invokeConstructorQuick(Class theClass, long p1) throws Throwable;
  
  /**
   * @param theClass
   * @param p1
   * @return
   */
  Object invokeConstructorQuick(Class theClass, float p1) throws Throwable;
  
  /**
   * @param theClass
   * @param p1
   * @return
   */
  Object invokeConstructorQuick(Class theClass, double p1) throws Throwable;
  
  /**
   * @param theClass
   * @param p1
   * @return
   */
  Object invokeConstructorQuick(Class theClass, BigInteger p1) throws Throwable;
  
  /**
   * @param theClass
   * @param p1
   * @return
   */
  Object invokeConstructorQuick(Class theClass, BigDecimal p1) throws Throwable;
  
  /**
   * @param theClass
   * @param p1
   * @param p2
   * @return
   */
  Object invokeConstructorQuick(Class theClass, Object p1, Object p2) throws Throwable;
  
  /**
   * @param theClass
   * @param p1
   * @param p2
   * @param p3
   * @return
   */
  Object invokeConstructorQuick(Class theClass, Object p1, Object p2, Object p3) throws Throwable;
  
  /**
   * @param theClass
   * @param p1
   * @param p2
   * @param p3
   * @param p4
   * @return
   */
  Object invokeConstructorQuick(Class theClass, Object p1, Object p2, Object p3, Object p4) throws Throwable;
  
  /**
   * @param metaClass
   * @param theClass
   * @param arguments
   * @return the result of invoking the method on the instance with the supplied
   *         parameters.
   */
  Object invokeConstructor(MetaClass metaClass,Class theClass, Object[] arguments) throws Throwable;
  
  /**
   * @param metaClass
   * @param theClass
   * @return
   * @throws Throwable
   */
  Object invokeConstructorQuick(MetaClass metaClass, Class theClass) throws Throwable;
  
  /**
   * @param metaClass
   * @param theClass
   * @param p1
   * @return
   */
  Object invokeConstructorQuick(MetaClass metaClass, Class theClass, Object p1) throws Throwable;
  
  /**
   * @param metaClass
   * @param theClass
   * @param p1
   * @return
   */
  Object invokeConstructorQuick(MetaClass metaClass, Class theClass, boolean p1) throws Throwable;
  
  /**
   * @param metaClass
   * @param theClass
   * @param p1
   * @return
   */
  Object invokeConstructorQuick(MetaClass metaClass, Class theClass, char p1) throws Throwable;
  
  /**
   * @param metaClass
   * @param theClass
   * @param p1
   * @return
   */
  Object invokeConstructorQuick(MetaClass metaClass, Class theClass, byte p1) throws Throwable;
  
  /**
   * @param metaClass
   * @param theClass
   * @param p1
   * @return
   */
  Object invokeConstructorQuick(MetaClass metaClass, Class theClass, short p1) throws Throwable;
  
  /**
   * @param metaClass
   * @param theClass
   * @param p1
   * @return
   */
  Object invokeConstructorQuick(MetaClass metaClass, Class theClass, int p1) throws Throwable;
  
  /**
   * @param metaClass
   * @param theClass
   * @param p1
   * @return
   */
  Object invokeConstructorQuick(MetaClass metaClass, Class theClass, long p1) throws Throwable;
  
  /**
   * @param metaClass
   * @param theClass
   * @param p1
   * @return
   */
  Object invokeConstructorQuick(MetaClass metaClass, Class theClass, float p1) throws Throwable;
  
  /**
   * @param metaClass
   * @param theClass
   * @param p1
   * @return
   */
  Object invokeConstructorQuick(MetaClass metaClass, Class theClass, double p1) throws Throwable;
  
  /**
   * @param metaClass
   * @param theClass
   * @param p1
   * @return
   */
  Object invokeConstructorQuick(MetaClass metaClass, Class theClass, BigInteger p1) throws Throwable;
  
  /**
   * @param metaClass
   * @param theClass
   * @param p1
   * @return
   */
  Object invokeConstructorQuick(MetaClass metaClass, Class theClass, BigDecimal p1) throws Throwable;
  
  /**
   * @param metaClass
   * @param theClass
   * @param p1
   * @param p2
   * @return
   */
  Object invokeConstructorQuick(MetaClass metaClass, Class theClass, Object p1, Object p2) throws Throwable;
  
  /**
   * @param metaClass
   * @param theClass
   * @param p1
   * @param p2
   * @param p3
   * @return
   */
  Object invokeConstructorQuick(MetaClass metaClass, Class theClass, Object p1, Object p2, Object p3) throws Throwable;
  
  /**
   * @param metaClass
   * @param theClass
   * @param p1
   * @param p2
   * @param p3
   * @param p4
   * @return
   */
  Object invokeConstructorQuick(MetaClass metaClass, Class theClass, Object p1, Object p2, Object p3, Object p4) throws Throwable;
  
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
  Object getProperty(MetaClass metaClass, Object instance, String propertyName) throws Throwable;

  /**
   * @param metaClass
   * @param instance
   * @param propertyName
   * @param newValue
   * @return
   * @throws Throwable
   */
  Object setProperty(MetaClass metaClass, Object instance, String propertyName, Object newValue) throws Throwable;

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
  Object getField(MetaClass metaClass, Object instance, String fieldName) throws Throwable;

  /**
   * @param metaClass
   * @param instance
   * @param fieldName
   * @param newValue
   * @return
   * @throws Throwable
   */
  Object setField(MetaClass metaClass, Object instance, String fieldName, Object newValue) throws Throwable;
  
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
  Object invokeMethod(MetaClass metaClass,Object instance, String methodName, Object[] arguments) throws Throwable;
  
  /**
   * @param metaClass
   * @param instance
   * @param methodName
   * @return
   * @throws Throwable
   */
  Object invokeMethodQuick(MetaClass metaClass, Object instance, String methodName) throws Throwable;
  
  /**
   * @param metaClass
   * @param instance
   * @param methodName
   * @param p1
   * @return
   */
  Object invokeMethodQuick(MetaClass metaClass, Object instance, String methodName, Object p1) throws Throwable;
  
  /**
   * @param metaClass
   * @param instance
   * @param methodName
   * @param p1
   * @return
   */
  Object invokeMethodQuick(MetaClass metaClass, Object instance, String methodName, boolean p1) throws Throwable;
  
  /**
   * @param metaClass
   * @param instance
   * @param methodName
   * @param p1
   * @return
   */
  Object invokeMethodQuick(MetaClass metaClass, Object instance, String methodName, char p1) throws Throwable;
  
  /**
   * @param metaClass
   * @param instance
   * @param methodName
   * @param p1
   * @return
   */
  Object invokeMethodQuick(MetaClass metaClass, Object instance, String methodName, byte p1) throws Throwable;
  
  /**
   * @param metaClass
   * @param instance
   * @param methodName
   * @param p1
   * @return
   */
  Object invokeMethodQuick(MetaClass metaClass, Object instance, String methodName, short p1) throws Throwable;
  
  /**
   * @param metaClass
   * @param instance
   * @param methodName
   * @param p1
   * @return
   */
  Object invokeMethodQuick(MetaClass metaClass, Object instance, String methodName, int p1) throws Throwable;
  
  /**
   * @param metaClass
   * @param instance
   * @param methodName
   * @param p1
   * @return
   */
  Object invokeMethodQuick(MetaClass metaClass, Object instance, String methodName, long p1) throws Throwable;
  
  /**
   * @param metaClass
   * @param instance
   * @param methodName
   * @param p1
   * @return
   */
  Object invokeMethodQuick(MetaClass metaClass, Object instance, String methodName, float p1) throws Throwable;
  
  /**
   * @param metaClass
   * @param instance
   * @param methodName
   * @param p1
   * @return
   */
  Object invokeMethodQuick(MetaClass metaClass, Object instance, String methodName, double p1) throws Throwable;
  
  /**
   * @param metaClass
   * @param instance
   * @param methodName
   * @param p1
   * @return
   */
  Object invokeMethodQuick(MetaClass metaClass, Object instance, String methodName, BigInteger p1) throws Throwable;
  
  /**
   * @param metaClass
   * @param instance
   * @param methodName
   * @param p1
   * @return
   */
  Object invokeMethodQuick(MetaClass metaClass, Object instance, String methodName, BigDecimal p1) throws Throwable;
  
  /**
   * @param metaClass
   * @param instance
   * @param methodName
   * @param p1
   * @param p2
   * @return
   */
  Object invokeMethodQuick(MetaClass metaClass, Object instance, String methodName, Object p1, Object p2) throws Throwable;
  
  /**
   * @param metaClass
   * @param instance
   * @param methodName
   * @param p1
   * @param p2
   * @param p3
   * @return
   */
  Object invokeMethodQuick(MetaClass metaClass, Object instance, String methodName, Object p1, Object p2, Object p3) throws Throwable;
  
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
  Object invokeMethodQuick(MetaClass metaClass, Object instance, String methodName, Object p1, Object p2, Object p3, Object p4) throws Throwable;
  
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
  Object call(MetaClass metaClass, Object instance, Object[] arguments) throws Throwable;
  
  /**
   * @param instance
   * @return
   */
  Object callQuick(MetaClass metaClass, Object instance) throws Throwable;
  
  /**
   * @param metaClass
   * @param instance
   * @param p1
   * @return
   */
  Object callQuick(MetaClass metaClass, Object instance, Object p1) throws Throwable;
  
  /**
   * @param metaClass
   * @param instance
   * @param p1
   * @return
   */
  Object callQuick(MetaClass metaClass, Object instance, boolean p1) throws Throwable;
  
  /**
   * @param metaClass
   * @param instance
   * @param p1
   * @return
   */
  Object callQuick(MetaClass metaClass, Object instance, char p1) throws Throwable;
  
  /**
   * @param metaClass
   * @param instance
   * @param p1
   * @return
   */
  Object callQuick(MetaClass metaClass, Object instance, byte p1) throws Throwable;
  
  /**
   * @param metaClass
   * @param instance
   * @param p1
   * @return
   */
  Object callQuick(MetaClass metaClass, Object instance, short p1) throws Throwable;
  
  /**
   * @param metaClass
   * @param instance
   * @param p1
   * @return
   */
  Object callQuick(MetaClass metaClass, Object instance, int p1) throws Throwable;
  
  /**
   * @param metaClass
   * @param instance
   * @param p1
   * @return
   */
  Object callQuick(MetaClass metaClass, Object instance, long p1) throws Throwable;
  
  /**
   * @param metaClass
   * @param instance
   * @param p1
   * @return
   */
  Object callQuick(MetaClass metaClass, Object instance, float p1) throws Throwable;
  
  /**
   * @param metaClass
   * @param instance
   * @param p1
   * @return
   */
  Object callQuick(MetaClass metaClass, Object instance, double p1) throws Throwable;
  
  /**
   * @param metaClass
   * @param instance
   * @param p1
   * @return
   */
  Object callQuick(MetaClass metaClass, Object instance, BigInteger p1) throws Throwable;
  
  /**
   * @param metaClass
   * @param instance
   * @param p1
   * @return
   */
  Object callQuick(MetaClass metaClass, Object instance, BigDecimal p1) throws Throwable;
  
  /**
   * @param metaClass
   * @param instance
   * @param p1
   * @param p2
   * @return
   */
  Object callQuick(MetaClass metaClass, Object instance, Object p1, Object p2) throws Throwable;
  
  /**
   * @param metaClass
   * @param instance
   * @param p1
   * @param p2
   * @param p3
   * @return
   */
  Object callQuick(MetaClass metaClass, Object instance, Object p1, Object p2, Object p3) throws Throwable;
  
  /**
   * @param metaClass
   * @param instance
   * @param p1
   * @param p2
   * @param p3
   * @param p4
   * @return
   */
  Object callQuick(MetaClass metaClass, Object instance, Object p1, Object p2, Object p3, Object p4) throws Throwable;

  /**
   * @param instance
   * @param type
   * @return
   */
  boolean isInstanceof(Object instance, Class type) throws Throwable;

  /**
   * @param metaClass
   * @param instance
   * @param type
   * @return
   * @throws Throwable
   */
  boolean isInstanceof(MetaClass metaClass, Object instance, Class type) throws Throwable;

  /**
   * @param instance
   * @param rhs
   * @return
   */
  boolean isCase(Object instance, Object rhs) throws Throwable;

  /**
   * @param metaClass
   * @param instance
   * @param rhs
   * @return
   * @throws Throwable
   */
  boolean isCase(MetaClass metaClass, Object instance, Object rhs) throws Throwable;
  
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
  Object asType(MetaClass metaClass, Object instance, Class type) throws Throwable;
  
  /**
   * @param metaClass
   * @param instance
   * @return
   * @throws Throwable
   */
  byte asByte(MetaClass metaClass, Object instance) throws Throwable;
  
  /**
   * @param metaClass
   * @param instance
   * @return
   * @throws Throwable
   */
  char asChar(MetaClass metaClass, Object instance) throws Throwable;
  
  /**
   * @param metaClass
   * @param instance
   * @return
   * @throws Throwable
   */
  short asShort(MetaClass metaClass, Object instance) throws Throwable;
  
  /**
   * @param metaClass
   * @param instance
   * @return
   * @throws Throwable
   */
  int asInt(MetaClass metaClass, Object instance) throws Throwable;
  
  /**
   * @param metaClass
   * @param instance
   * @return
   * @throws Throwable
   */
  long asLong(MetaClass metaClass, Object instance) throws Throwable;
  
  /**
   * @param metaClass
   * @param instance
   * @return
   * @throws Throwable
   */
  float asFloat(MetaClass metaClass, Object instance) throws Throwable;
  
  /**
   * @param metaClass
   * @param instance
   * @return
   * @throws Throwable
   */
  double asDouble(MetaClass metaClass, Object instance) throws Throwable;
  
  /**
   * @param metaClass
   * @param instance
   * @return
   * @throws Throwable
   */
  boolean asBoolean(MetaClass metaClass, Object instance) throws Throwable;

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
  Object getAt(MetaClass metaClass, Object instance, int index) throws Throwable;
  
  /**
   * @param metaClass
   * @param instance
   * @param index
   * @return
   * @throws Throwable
   */
  Object getAt(MetaClass metaClass, Object instance, BigInteger index) throws Throwable;
  
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
  Object putAt(MetaClass metaClass, Object instance, int index) throws Throwable;
  
  /**
   * @param metaClass
   * @param instance
   * @param index
   * @return
   * @throws Throwable
   */
  Object putAt(MetaClass metaClass, Object instance, BigInteger index) throws Throwable; 
  
  /**
   * @param metaClass
   * @param parameterType
   * @return
   */
  int calculateConversionCost(MetaClass metaClass, Class parameterType);
  
  /**
   * @param the actual parameter
   * @param the required type
   * @return the Object to be used whan passing this instance as a parameter
   */
  Object getParamObject(Object instance, Class theClass);
  
  /**
   * @param instance
   * @param theClass
   * @return
   */
  Object getParamObject(boolean instance, Class theClass);
  
  /**
   * @param instance
   * @param theClass
   * @return
   */
  Object getParamObject(char instance, Class theClass);
  
  /**
   * @param instance
   * @param theClass
   * @return
   */
  Object getParamObject(byte instance, Class theClass);
  
  /**
   * @param instance
   * @param theClass
   * @return
   */
  Object getParamObject(short instance, Class theClass);
  
  /**
   * @param instance
   * @param theClass
   * @return
   */
  Object getParamObject(int instance, Class theClass);
  
  /**
   * @param instance
   * @param theClass
   * @return
   */
  Object getParamObject(long instance, Class theClass);
  
  /**
   * @param instance
   * @param theClass
   * @return
   */
  Object getParamObject(float instance, Class theClass);
  
  /**
   * @param instance
   * @param theClass
   * @return
   */
  Object getParamObject(double instance, Class theClass);
  
  /**
   * @param instance
   * @param theClass
   * @return
   */
  Object getParamObject(BigInteger instance, Class theClass);
  
  /**
   * @param instance
   * @param theClass
   * @return
   */
  Object getParamObject(BigDecimal instance, Class theClass);
  
  /**
   * @param the MetaClass for the actual parameter
   * @param the actual parameter
   * @param the required type
   * @return the Object to be used whan passing this instance as a parameter
   */
  Object getParamObject(MetaClass metaClass, Object instance, Class theClass);

  /**
   * @param metaClass
   * @param currentSelection
   * @param methodName
   * @param argumentMetaClasses
   * @return
   */
  MetaMethodSelection selectMethod(MetaClass metaClass, MetaMethodSelection currentSelection, String methodName, MetaClass[] argumentMetaClasses);
  
  /**
   * @param metaClass
   * @param currentSelection
   * @param methodName
   * @return
   */
  MetaMethodSelection selectMethod(MetaClass metaClass, MetaMethodSelection currentSelection, String methodName);
  
  /**
   * @param metaClass
   * @param currentSelection
   * @param methodName
   * @param p1
   * @return
   */
  MetaMethodSelection selectMethod(MetaClass metaClass, MetaMethodSelection currentSelection, String methodName, MetaClass p1);
  
  /**
   * @param metaClass
   * @param currentSelection
   * @param methodName
   * @param p1
   * @param p2
   * @return
   */
  MetaMethodSelection selectMethod(MetaClass metaClass, MetaMethodSelection currentSelection, String methodName, MetaClass p1, MetaClass p2);
  
  /**
   * @param metaClass
   * @param currentSelection
   * @param methodName
   * @param p1
   * @param p2
   * @param p3
   * @return
   */
  MetaMethodSelection selectMethod(MetaClass metaClass, MetaMethodSelection currentSelection, String methodName, MetaClass p1, MetaClass p2, MetaClass p3);

  /**
   * @param metaClass
   * @param currentSelection
   * @param methodName
   * @param p1
   * @param p2
   * @param p3
   * @param p4
   * @return
   */
  MetaMethodSelection selectMethod(MetaClass metaClass, MetaMethodSelection currentSelection, String methodName, MetaClass p1, MetaClass p2, MetaClass p3, MetaClass p4);
}
