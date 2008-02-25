package uk.co.wilson.ng.runtime.metaclass.primitives.intimpl;

import java.math.BigDecimal;
import java.math.BigInteger;

import ng.runtime.threadcontext.NotPerformed;
import uk.co.wilson.ng.runtime.metaclass.Conversion;
import uk.co.wilson.ng.runtime.threadcontext.ExtendedThreadContext;

/**
 * @author John
 *
 */
public interface IntConversion extends Conversion {
  boolean doAsBoolean(ExtendedThreadContext tc, int value) throws NotPerformed;

  char doAsChar(ExtendedThreadContext tc, int value) throws NotPerformed;

  byte doAsByte(ExtendedThreadContext tc, int value) throws NotPerformed;

  short doAsShort(ExtendedThreadContext tc, int value) throws NotPerformed;

  long doAsLong(ExtendedThreadContext tc, int value) throws NotPerformed;

  float doAsFloat(ExtendedThreadContext tc, int value) throws NotPerformed;

  double doAsDouble(ExtendedThreadContext tc, int value) throws NotPerformed;

  BigInteger doAsBigInteger(ExtendedThreadContext tc, int value) throws NotPerformed;

  BigDecimal doAsBigDecimal(ExtendedThreadContext tc, int value) throws NotPerformed;

  String doAsString(ExtendedThreadContext tc, int value) throws NotPerformed;
}
