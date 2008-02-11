package uk.co.wilson.ng.runtime.metaclass.primitives.longimpl;

import java.math.BigDecimal;
import java.math.BigInteger;

import ng.runtime.metaclass.Conversion;
import ng.runtime.threadcontext.NotPerformed;
import ng.runtime.threadcontext.ThreadContext;

/**
 * @author John
 *
 */
public interface LongConversion extends Conversion {
  boolean doAsBoolean(ThreadContext tc, long value) throws NotPerformed;

  char doAsChar(ThreadContext tc, long value) throws NotPerformed;

  byte doAsByte(ThreadContext tc, long value) throws NotPerformed;

  short doAsShort(ThreadContext tc, long value) throws NotPerformed;

  int doAsInt(ThreadContext tc, long value) throws NotPerformed;

  float doAsFloat(ThreadContext tc, long value) throws NotPerformed;

  double doAsDouble(ThreadContext tc, long value) throws NotPerformed;

  BigInteger doAsBigInteger(ThreadContext tc, long value) throws NotPerformed;

  BigDecimal doAsBigDecimal(ThreadContext tc, long value) throws NotPerformed;

  String doAsString(ThreadContext tc, long value) throws NotPerformed;
}
