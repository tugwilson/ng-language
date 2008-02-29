package ng.runtime.metaclass.primitives.biginteger;

import java.math.BigDecimal;
import java.math.BigInteger;

import ng.runtime.metaclass.Conversion;
import ng.runtime.threadcontext.ExtendedThreadContext;
import ng.runtime.threadcontext.NotPerformed;

/**
 * @author John
 *
 */
public interface BigIntegerConversion extends Conversion {
  boolean doAsBoolean(ExtendedThreadContext tc, BigInteger value) throws NotPerformed;

  char doAsChar(ExtendedThreadContext tc, BigInteger value) throws NotPerformed;

  byte doAsByte(ExtendedThreadContext tc, BigInteger value) throws NotPerformed;

  short doAsShort(ExtendedThreadContext tc, BigInteger value) throws NotPerformed;

  int doAsInt(ExtendedThreadContext tc, BigInteger value) throws NotPerformed;

  long doAsLong(ExtendedThreadContext tc, BigInteger value) throws NotPerformed;

  float doAsFloat(ExtendedThreadContext tc, BigInteger value) throws NotPerformed;

  double doAsDouble(ExtendedThreadContext tc, BigInteger value) throws NotPerformed;

  BigDecimal doAsBigDecimal(ExtendedThreadContext tc, BigInteger value) throws NotPerformed;

  String doAsString(ExtendedThreadContext tc, BigInteger value) throws NotPerformed;
}
