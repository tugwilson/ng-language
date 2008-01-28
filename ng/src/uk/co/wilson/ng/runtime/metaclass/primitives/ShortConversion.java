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
public interface ShortConversion extends Conversion {
  boolean doAsBoolean(ThreadContext tc, short value) throws NotPerformed;

  char doAsChar(ThreadContext tc, short value) throws NotPerformed;

  byte doAsByte(ThreadContext tc, short value) throws NotPerformed;

  int doAsInt(ThreadContext tc, short value) throws NotPerformed;

  long doAsLong(ThreadContext tc, short value) throws NotPerformed;

  float doAsFloat(ThreadContext tc, short value) throws NotPerformed;

  double doAsDouble(ThreadContext tc, short value) throws NotPerformed;

  BigInteger doAsBigInteger(ThreadContext tc, short value) throws NotPerformed;

  BigDecimal doAsBigDecimal(ThreadContext tc, short value) throws NotPerformed;

  String doAsString(ThreadContext tc, short value) throws NotPerformed;
}
