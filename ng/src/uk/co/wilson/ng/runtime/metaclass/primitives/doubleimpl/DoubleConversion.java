package uk.co.wilson.ng.runtime.metaclass.primitives.doubleimpl;

import java.math.BigDecimal;
import java.math.BigInteger;

import ng.runtime.metaclass.Conversion;
import ng.runtime.threadcontext.NotPerformed;
import ng.runtime.threadcontext.ThreadContext;

/**
 * @author John
 *
 */
public interface DoubleConversion extends Conversion {
  boolean doAsBoolean(ThreadContext tc, double value) throws NotPerformed;

  char doAsChar(ThreadContext tc, double value) throws NotPerformed;

  byte doAsByte(ThreadContext tc, double value) throws NotPerformed;

  short doAsShort(ThreadContext tc, double value) throws NotPerformed;

  int doAsInt(ThreadContext tc, double value) throws NotPerformed;

  long doAsLong(ThreadContext tc, double value) throws NotPerformed;

  float doAsFloat(ThreadContext tc, double value) throws NotPerformed;

  BigInteger doAsBigInteger(ThreadContext tc, double value) throws NotPerformed;

  BigDecimal doAsBigDecimal(ThreadContext tc, double value) throws NotPerformed;

  String doAsString(ThreadContext tc, double value) throws NotPerformed;
}
