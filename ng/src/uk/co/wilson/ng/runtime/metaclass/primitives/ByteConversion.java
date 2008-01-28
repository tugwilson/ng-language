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
public interface ByteConversion extends Conversion {
  boolean doAsBoolean(ThreadContext tc, byte value) throws NotPerformed;

  char doAsChar(ThreadContext tc, byte value) throws NotPerformed;

  short doAsShort(ThreadContext tc, byte value) throws NotPerformed;

  int doAsInt(ThreadContext tc, byte value) throws NotPerformed;

  long doAsLong(ThreadContext tc, byte value) throws NotPerformed;

  float doAsFloat(ThreadContext tc, byte value) throws NotPerformed;

  double doAsDouble(ThreadContext tc, byte value) throws NotPerformed;

  BigInteger doAsBigInteger(ThreadContext tc, byte value) throws NotPerformed;

  BigDecimal doAsBigDecimal(ThreadContext tc, byte value) throws NotPerformed;

  String doAsString(ThreadContext tc, byte value) throws NotPerformed;
}
