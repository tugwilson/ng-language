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
public interface IntConversion extends Conversion {
  boolean doAsBoolean(ThreadContext tc, int value) throws NotPerformed;

  char doAsChar(ThreadContext tc, int value) throws NotPerformed;

  byte doAsByte(ThreadContext tc, int value) throws NotPerformed;

  short doAsShort(ThreadContext tc, int value) throws NotPerformed;

  long doAsLong(ThreadContext tc, int value) throws NotPerformed;

  float doAsFloat(ThreadContext tc, int value) throws NotPerformed;

  double doAsDouble(ThreadContext tc, int value) throws NotPerformed;

  BigInteger doAsBigInteger(ThreadContext tc, int value) throws NotPerformed;

  BigDecimal doAsBigDecimal(ThreadContext tc, int value) throws NotPerformed;

  String doAsString(ThreadContext tc, int value) throws NotPerformed;
}
