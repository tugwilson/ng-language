package uk.co.wilson.ng.runtime.metaclass.primitives.bigdecimal;

import java.math.BigDecimal;
import java.math.BigInteger;

import ng.runtime.metaclass.Conversion;
import ng.runtime.threadcontext.NotPerformed;
import ng.runtime.threadcontext.ThreadContext;

/**
 * @author John
 *
 */
public interface BigDecimalConversion extends Conversion {
  boolean doAsBoolean(ThreadContext tc, BigDecimal value) throws NotPerformed;

  char doAsChar(ThreadContext tc, BigDecimal value) throws NotPerformed;

  byte doAsByte(ThreadContext tc, BigDecimal value) throws NotPerformed;

  short doAsShort(ThreadContext tc, BigDecimal value) throws NotPerformed;

  int doAsInt(ThreadContext tc, BigDecimal value) throws NotPerformed;

  long doAsLong(ThreadContext tc, BigDecimal value) throws NotPerformed;

  float doAsFloat(ThreadContext tc, BigDecimal value) throws NotPerformed;

  double doAsDouble(ThreadContext tc, BigDecimal value) throws NotPerformed;

  BigInteger doAsBigInteger(ThreadContext tc, BigDecimal value) throws NotPerformed;

  String doAsString(ThreadContext tc, BigDecimal value) throws NotPerformed;
}
