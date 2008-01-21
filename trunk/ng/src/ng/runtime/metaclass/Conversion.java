package ng.runtime.metaclass;

import java.math.BigDecimal;
import java.math.BigInteger;

import ng.runtime.threadcontext.NotPerformed;
import ng.runtime.threadcontext.ThreadContext;

public interface Conversion {
  boolean doAsBoolean(ThreadContext tc, Object instance) throws NotPerformed;

  char doAsChar(ThreadContext tc, Object instance) throws NotPerformed;

  byte doAsByte(ThreadContext tc, Object instance) throws NotPerformed;

  short doAsShort(ThreadContext tc, Object instance) throws NotPerformed;

  int doAsInt(ThreadContext tc, Object instance) throws NotPerformed;

  long doAsLong(ThreadContext tc, Object instance) throws NotPerformed;

  float doAsFloat(ThreadContext tc, Object instance) throws NotPerformed;

  double doAsDouble(ThreadContext tc, Object instance) throws NotPerformed;

  BigInteger doAsBigInteger(ThreadContext tc, Object instance) throws NotPerformed;

  BigDecimal doAsBigDecimal(ThreadContext tc, Object instance) throws NotPerformed;

  String doAsString(ThreadContext tc, Object instance) throws NotPerformed;

  Object doAsType(ThreadContext tc, Object instance, Class<?> type);

  Object doAsYourType(ThreadContext tc, boolean value);

  Object doAsYourType(ThreadContext tc, char value);

  Object doAsYourType(ThreadContext tc, byte value);

  Object doAsYourType(ThreadContext tc, short value);

  Object doAsYourType(ThreadContext tc, int value);

  Object doAsYourType(ThreadContext tc, long value);

  Object doAsYourType(ThreadContext tc, float value);

  Object doAsYourType(ThreadContext tc, double value);

  Object doAsYourType(ThreadContext tc, BigInteger value);

  Object doAsYourType(ThreadContext tc, BigDecimal value);

  Object doAsYourType(ThreadContext tc, Object instance);
}
