package uk.co.wilson.ng.runtime.metaclass.primitives.bigdecimal;

import java.math.BigDecimal;
import java.math.BigInteger;

import uk.co.wilson.ng.runtime.threadcontext.ExtendedThreadContext;
import uk.co.wilson.ng.runtime.threadcontext.NotPerformed;

import ng.runtime.metaclass.Conversion;

/**
 * @author John
 *
 */
public interface BigDecimalConversion extends Conversion {
  boolean doAsBoolean(ExtendedThreadContext tc, BigDecimal value) throws NotPerformed;

  char doAsChar(ExtendedThreadContext tc, BigDecimal value) throws NotPerformed;

  byte doAsByte(ExtendedThreadContext tc, BigDecimal value) throws NotPerformed;

  short doAsShort(ExtendedThreadContext tc, BigDecimal value) throws NotPerformed;

  int doAsInt(ExtendedThreadContext tc, BigDecimal value) throws NotPerformed;

  long doAsLong(ExtendedThreadContext tc, BigDecimal value) throws NotPerformed;

  float doAsFloat(ExtendedThreadContext tc, BigDecimal value) throws NotPerformed;

  double doAsDouble(ExtendedThreadContext tc, BigDecimal value) throws NotPerformed;

  BigInteger doAsBigInteger(ExtendedThreadContext tc, BigDecimal value) throws NotPerformed;

  String doAsString(ExtendedThreadContext tc, BigDecimal value) throws NotPerformed;
}
