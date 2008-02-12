package uk.co.wilson.ng.runtime.metaclass.primitives.shortimpl;

import java.math.BigDecimal;
import java.math.BigInteger;

import uk.co.wilson.ng.runtime.threadcontext.ExtendedThreadContext;
import uk.co.wilson.ng.runtime.threadcontext.NotPerformed;

import ng.runtime.metaclass.Conversion;

/**
 * @author John
 *
 */
public interface ShortConversion extends Conversion {
  boolean doAsBoolean(ExtendedThreadContext tc, short value) throws NotPerformed;

  char doAsChar(ExtendedThreadContext tc, short value) throws NotPerformed;

  byte doAsByte(ExtendedThreadContext tc, short value) throws NotPerformed;

  int doAsInt(ExtendedThreadContext tc, short value) throws NotPerformed;

  long doAsLong(ExtendedThreadContext tc, short value) throws NotPerformed;

  float doAsFloat(ExtendedThreadContext tc, short value) throws NotPerformed;

  double doAsDouble(ExtendedThreadContext tc, short value) throws NotPerformed;

  BigInteger doAsBigInteger(ExtendedThreadContext tc, short value) throws NotPerformed;

  BigDecimal doAsBigDecimal(ExtendedThreadContext tc, short value) throws NotPerformed;

  String doAsString(ExtendedThreadContext tc, short value) throws NotPerformed;
}
