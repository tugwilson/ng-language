package uk.co.wilson.ng.runtime.metaclass.primitives.floatimpl;

import java.math.BigDecimal;
import java.math.BigInteger;

import ng.runtime.metaclass.Conversion;
import ng.runtime.threadcontext.NotPerformed;
import ng.runtime.threadcontext.ExtendedThreadContext;

/**
 * @author John
 *
 */
public interface FloatConversion extends Conversion {
  boolean doAsBoolean(ExtendedThreadContext tc, float value) throws NotPerformed;

  char doAsChar(ExtendedThreadContext tc, float value) throws NotPerformed;

  byte doAsByte(ExtendedThreadContext tc, float value) throws NotPerformed;

  short doAsShort(ExtendedThreadContext tc, float value) throws NotPerformed;

  int doAsInt(ExtendedThreadContext tc, float value) throws NotPerformed;

  long doAsLong(ExtendedThreadContext tc, float value) throws NotPerformed;

  double doAsDouble(ExtendedThreadContext tc, float value) throws NotPerformed;

  BigInteger doAsBigInteger(ExtendedThreadContext tc, float value) throws NotPerformed;

  BigDecimal doAsBigDecimal(ExtendedThreadContext tc, float value) throws NotPerformed;

  String doAsString(ExtendedThreadContext tc, float value) throws NotPerformed;
}
