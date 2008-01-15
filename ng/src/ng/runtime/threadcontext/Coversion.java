package ng.runtime.threadcontext;

import java.math.BigDecimal;
import java.math.BigInteger;

import ng.runtime.metaclass.MetaClass;

public interface Coversion {
  boolean asBoolean(Object instance);
  boolean asBoolean(MetaClass metaClass, Object instance);
  char asChar(Object instance);
  char asChar(MetaClass metaClass, Object instance);
  byte asByte(Object instance);
  byte asByte(MetaClass metaClass, Object instance);
  short asShort(Object instance);
  short asShort(MetaClass metaClass, Object instance);
  int asInt(Object instance);
  int asInt(MetaClass metaClass, Object instance);
  long asLong(Object instance);
  long asLong(MetaClass metaClass, Object instance);
  float asFloat(Object instance);
  float asFloat(MetaClass metaClass, Object instance);
  double asDouble(Object instance);
  double asDouble(MetaClass metaClass, Object instance);
  BigInteger asBigInteger(Object instance);
  BigInteger asBigInteger(MetaClass metaClass, Object instance);
  BigDecimal asBigDecimal(Object instance);
  BigDecimal asBigDecimal(MetaClass metaClass, Object instance);
  Object asType(Object instance, Object type);
  Object asType(MetaClass metaClass, Object instance, Object type);
}
