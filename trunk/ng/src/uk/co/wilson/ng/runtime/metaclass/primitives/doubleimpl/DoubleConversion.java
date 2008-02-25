package uk.co.wilson.ng.runtime.metaclass.primitives.doubleimpl;

import java.math.BigDecimal;
import java.math.BigInteger;

import ng.runtime.metaclass.Conversion;
import ng.runtime.threadcontext.NotPerformed;
import uk.co.wilson.ng.runtime.threadcontext.ExtendedThreadContext;

/**
 * @author John
 *
 */
public interface DoubleConversion extends Conversion {
  boolean doAsBoolean(ExtendedThreadContext tc, double value) throws NotPerformed;

  char doAsChar(ExtendedThreadContext tc, double value) throws NotPerformed;

  byte doAsByte(ExtendedThreadContext tc, double value) throws NotPerformed;

  short doAsShort(ExtendedThreadContext tc, double value) throws NotPerformed;

  int doAsInt(ExtendedThreadContext tc, double value) throws NotPerformed;

  long doAsLong(ExtendedThreadContext tc, double value) throws NotPerformed;

  float doAsFloat(ExtendedThreadContext tc, double value) throws NotPerformed;

  BigInteger doAsBigInteger(ExtendedThreadContext tc, double value) throws NotPerformed;

  BigDecimal doAsBigDecimal(ExtendedThreadContext tc, double value) throws NotPerformed;

  String doAsString(ExtendedThreadContext tc, double value) throws NotPerformed;
}
