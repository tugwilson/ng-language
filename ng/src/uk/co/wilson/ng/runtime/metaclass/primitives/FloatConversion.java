package uk.co.wilson.ng.runtime.metaclass.primitives;

import java.math.BigDecimal;
import java.math.BigInteger;

import ng.runtime.metaclass.Conversion;
import ng.runtime.threadcontext.NotPerformed;
import ng.runtime.threadcontext.ThreadContext;

/**
 * @author John
 *
 */
public interface FloatConversion extends Conversion {
  boolean doAsBoolean(ThreadContext tc, float value) throws NotPerformed;

  char doAsChar(ThreadContext tc, float value) throws NotPerformed;

  byte doAsByte(ThreadContext tc, float value) throws NotPerformed;

  short doAsShort(ThreadContext tc, float value) throws NotPerformed;

  int doAsInt(ThreadContext tc, float value) throws NotPerformed;

  long doAsLong(ThreadContext tc, float value) throws NotPerformed;

  double doAsDouble(ThreadContext tc, float value) throws NotPerformed;

  BigInteger doAsBigInteger(ThreadContext tc, float value) throws NotPerformed;

  BigDecimal doAsBigDecimal(ThreadContext tc, float value) throws NotPerformed;

  String doAsString(ThreadContext tc, float value) throws NotPerformed;
}
