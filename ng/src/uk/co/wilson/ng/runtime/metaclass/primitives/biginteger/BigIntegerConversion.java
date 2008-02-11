package uk.co.wilson.ng.runtime.metaclass.primitives.biginteger;

import java.math.BigDecimal;
import java.math.BigInteger;

import ng.runtime.metaclass.Conversion;
import ng.runtime.threadcontext.NotPerformed;
import ng.runtime.threadcontext.ThreadContext;

/**
 * @author John
 *
 */
public interface BigIntegerConversion extends Conversion {
  boolean doAsBoolean(ThreadContext tc, BigInteger value) throws NotPerformed;

  char doAsChar(ThreadContext tc, BigInteger value) throws NotPerformed;

  byte doAsByte(ThreadContext tc, BigInteger value) throws NotPerformed;

  short doAsShort(ThreadContext tc, BigInteger value) throws NotPerformed;

  int doAsInt(ThreadContext tc, BigInteger value) throws NotPerformed;

  long doAsLong(ThreadContext tc, BigInteger value) throws NotPerformed;

  float doAsFloat(ThreadContext tc, BigInteger value) throws NotPerformed;

  double doAsDouble(ThreadContext tc, BigInteger value) throws NotPerformed;

  BigDecimal doAsBigDecimal(ThreadContext tc, BigInteger value) throws NotPerformed;

  String doAsString(ThreadContext tc, BigInteger value) throws NotPerformed;
}
