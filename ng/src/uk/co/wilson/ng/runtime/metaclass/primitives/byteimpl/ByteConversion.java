package uk.co.wilson.ng.runtime.metaclass.primitives.byteimpl;

import java.math.BigDecimal;
import java.math.BigInteger;

import ng.runtime.metaclass.Conversion;
import ng.runtime.threadcontext.ExtendedThreadContext;
import ng.runtime.threadcontext.NotPerformed;

/**
 * @author John
 *
 */
public interface ByteConversion extends Conversion {
  boolean doAsBoolean(ExtendedThreadContext tc, byte value) throws NotPerformed;

  char doAsChar(ExtendedThreadContext tc, byte value) throws NotPerformed;

  short doAsShort(ExtendedThreadContext tc, byte value) throws NotPerformed;

  int doAsInt(ExtendedThreadContext tc, byte value) throws NotPerformed;

  long doAsLong(ExtendedThreadContext tc, byte value) throws NotPerformed;

  float doAsFloat(ExtendedThreadContext tc, byte value) throws NotPerformed;

  double doAsDouble(ExtendedThreadContext tc, byte value) throws NotPerformed;

  BigInteger doAsBigInteger(ExtendedThreadContext tc, byte value) throws NotPerformed;

  BigDecimal doAsBigDecimal(ExtendedThreadContext tc, byte value) throws NotPerformed;

  String doAsString(ExtendedThreadContext tc, byte value) throws NotPerformed;
}
