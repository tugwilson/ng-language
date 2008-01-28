package ng.runtime.threadcontext;

import java.math.BigDecimal;
import java.math.BigInteger;

import ng.runtime.metaclass.MetaClass;

public interface Coversion {
  boolean asBoolean(Object instance);
  boolean asBoolean(MetaClass metaClass, Object instance);
  boolean asBoolean(char instance);
  boolean asBoolean(byte instance);
  boolean asBoolean(short instance);
  boolean asBoolean(int instance);
  boolean asBoolean(long instance);
  boolean asBoolean(float instance);
  boolean asBoolean(double instance);
  boolean asBoolean(BigInteger instance);
  boolean asBoolean(BigDecimal instance);

  char asChar(Object instance);
  char asChar(MetaClass metaClass, Object instance);
  char asChar(byte instance);
  char asChar(short instance);
  char asChar(int instance);
  char asChar(long instance);
  char asChar(float instance);
  char asChar(double instance);
  char asChar(BigInteger instance);
  char asChar(BigDecimal instance);

  byte asByte(Object instance);
  byte asByte(MetaClass metaClass, Object instance);
  byte asByte(char instance);
  byte asByte(short instance);
  byte asByte(int instance);
  byte asByte(long instance);
  byte asByte(double instance);
  byte asByte(float instance);
  byte asByte(BigInteger instance);
  byte asByte(BigDecimal instance);

  short asShort(Object instance);
  short asShort(MetaClass metaClass, Object instance);
  short asShort(char instance);
  short asShort(byte instance);
  short asShort(int instance);
  short asShort(long instance);
  short asShort(float instance);
  short asShort(double instance);
  short asShort(BigInteger instance);
  short asShort(BigDecimal instance);

  int asInt(Object instance);
  int asInt(MetaClass metaClass, Object instance);
  int asInt(char instance);
  int asInt(byte instance);
  int asInt(short instance);
  int asInt(long instance);
  int asInt(float instance);
  int asInt(double instance);
  int asInt(BigInteger instance);
  int asInt(BigDecimal instance);

  long asLong(Object instance);
  long asLong(MetaClass metaClass, Object instance);
  long asLong(char instance);
  long asLong(byte instance);
  long asLong(short instance);
  long asLong(int instance);
  long asLong(float instance);
  long asLong(double instance);
  long asLong(BigInteger instance);
  long asLong(BigDecimal instance);

  float asFloat(Object instance);
  float asFloat(MetaClass metaClass, Object instance);
  float asFloat(char instance);
  float asFloat(byte instance);
  float asFloat(short instance);
  float asFloat(int instance);
  float asFloat(long instance);
  float asFloat(double instance);
  float asFloat(BigInteger instance);
  float asFloat(BigDecimal instance);

  double asDouble(Object instance);
  double asDouble(MetaClass metaClass, Object instance);
  double asDouble(char instance);
  double asDouble(byte instance);
  double asDouble(short instance);
  double asDouble(int instance);
  double asDouble(long instance);
  double asDouble(float instance);
  double asDouble(BigInteger instance);
  double asDouble(BigDecimal instance);

  BigInteger asBigInteger(Object instance);
  BigInteger asBigInteger(MetaClass metaClass, Object instance);
  BigInteger asBigInteger(char instance);
  BigInteger asBigInteger(byte instance);
  BigInteger asBigInteger(short instance);
  BigInteger asBigInteger(int instance);
  BigInteger asBigInteger(long instance);
  BigInteger asBigInteger(float instance);
  BigInteger asBigInteger(double instance);
  BigInteger asBigInteger(BigDecimal instance);

  BigDecimal asBigDecimal(Object instance);
  BigDecimal asBigDecimal(MetaClass metaClass, Object instance);
  BigDecimal asBigDecimal(char instance);
  BigDecimal asBigDecimal(byte instance);
  BigDecimal asBigDecimal(short instance);
  BigDecimal asBigDecimal(int instance);
  BigDecimal asBigDecimal(long instance);
  BigDecimal asBigDecimal(float instance);
  BigDecimal asBigDecimal(double instance);
  BigDecimal asBigDecimal(BigInteger instance);

  String asString(Object instance);
  String asString(MetaClass metaClass, Object instance);
  String asString(char instance);
  String asString(byte instance);
  String asString(short instance);
  String asString(int instance);
  String asString(long instance);
  String asString(float instance);
  String asString(double instance);
  String asString(BigInteger instance);
  String asString(BigDecimal instance);

  Object asType(Object instance, Object type);
  Object asType(MetaClass metaClass, Object instance, Object type);
}
