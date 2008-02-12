package uk.co.wilson.ng.runtime.metaclass.primitives.longimpl;

import java.math.BigDecimal;
import java.math.BigInteger;

import ng.runtime.metaclass.Conversion;
import ng.runtime.threadcontext.NotPerformed;
import ng.runtime.threadcontext.ExtendedThreadContext;

/**
 * @author John
 *
 */
public interface LongConversion extends Conversion {
  boolean doAsBoolean(ExtendedThreadContext tc, long value) throws NotPerformed;

  char doAsChar(ExtendedThreadContext tc, long value) throws NotPerformed;

  byte doAsByte(ExtendedThreadContext tc, long value) throws NotPerformed;

  short doAsShort(ExtendedThreadContext tc, long value) throws NotPerformed;

  int doAsInt(ExtendedThreadContext tc, long value) throws NotPerformed;

  float doAsFloat(ExtendedThreadContext tc, long value) throws NotPerformed;

  double doAsDouble(ExtendedThreadContext tc, long value) throws NotPerformed;

  BigInteger doAsBigInteger(ExtendedThreadContext tc, long value) throws NotPerformed;

  BigDecimal doAsBigDecimal(ExtendedThreadContext tc, long value) throws NotPerformed;

  String doAsString(ExtendedThreadContext tc, long value) throws NotPerformed;
}
