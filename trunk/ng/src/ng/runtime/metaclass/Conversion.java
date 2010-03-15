package ng.runtime.metaclass;

import java.math.BigDecimal;
import java.math.BigInteger;

import ng.runtime.threadcontext.ExtendedThreadContext;
import ng.runtime.threadcontext.NotPerformed;

public interface Conversion {
  boolean doAsBoolean(ExtendedThreadContext tc, Object instance) throws NotPerformed;

  char doAsChar(ExtendedThreadContext tc, Object instance) throws NotPerformed;

  byte doAsByte(ExtendedThreadContext tc, Object instance) throws NotPerformed;

  short doAsShort(ExtendedThreadContext tc, Object instance) throws NotPerformed;

  int doAsInt(ExtendedThreadContext tc, Object instance) throws NotPerformed;

  long doAsLong(ExtendedThreadContext tc, Object instance) throws NotPerformed;

  float doAsFloat(ExtendedThreadContext tc, Object instance) throws NotPerformed;

  double doAsDouble(ExtendedThreadContext tc, Object instance) throws NotPerformed;

  BigInteger doAsBigInteger(ExtendedThreadContext tc, Object instance) throws NotPerformed;

  BigDecimal doAsBigDecimal(ExtendedThreadContext tc, Object instance) throws NotPerformed;

  String doAsString(ExtendedThreadContext tc, Object instance) throws NotPerformed;

  Object doAsType(ExtendedThreadContext tc, Object instance, Class<?> type);

  Object doAsYourType(ExtendedThreadContext tc, boolean value);

  Object doAsYourType(ExtendedThreadContext tc, char value);

  Object doAsYourType(ExtendedThreadContext tc, byte value);

  Object doAsYourType(ExtendedThreadContext tc, short value);

  Object doAsYourType(ExtendedThreadContext tc, int value);

  Object doAsYourType(ExtendedThreadContext tc, long value);

  Object doAsYourType(ExtendedThreadContext tc, float value);

  Object doAsYourType(ExtendedThreadContext tc, double value);

  Object doAsYourType(ExtendedThreadContext tc, BigInteger value);

  Object doAsYourType(ExtendedThreadContext tc, BigDecimal value);

  Object doAsYourType(ExtendedThreadContext tc, Object instance);
}
