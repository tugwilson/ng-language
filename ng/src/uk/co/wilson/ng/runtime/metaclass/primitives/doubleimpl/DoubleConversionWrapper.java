package uk.co.wilson.ng.runtime.metaclass.primitives.doubleimpl;

import java.math.BigDecimal;
import java.math.BigInteger;

import ng.runtime.NgDouble;
import ng.runtime.metaclass.Conversion;
import ng.runtime.threadcontext.NotPerformed;
import uk.co.wilson.ng.runtime.metaclass.primitives.ConversionWrapper;
import uk.co.wilson.ng.runtime.threadcontext.ExtendedThreadContext;

/**
 * @author John
 *
 */
public class DoubleConversionWrapper extends ConversionWrapper implements DoubleConversion {

  /**
   * @param delegate
   */
  public DoubleConversionWrapper(final Conversion delegate) {
    super(delegate);
  }

  public BigDecimal doAsBigDecimal(final ExtendedThreadContext tc, final double value) throws NotPerformed {
    return doAsBigDecimal(tc, NgDouble.valueOf(value));
  }

  public BigInteger doAsBigInteger(final ExtendedThreadContext tc, final double value) throws NotPerformed {
    return doAsBigInteger(tc, NgDouble.valueOf(value));
  }

  public boolean doAsBoolean(final ExtendedThreadContext tc, final double value) throws NotPerformed {
    return doAsBoolean(tc, NgDouble.valueOf(value));
  }

  public char doAsChar(final ExtendedThreadContext tc, final double value) throws NotPerformed {
    return doAsChar(tc, NgDouble.valueOf(value));
  }

  public byte doAsByte(final ExtendedThreadContext tc, final double value) throws NotPerformed {
    return doAsByte(tc, NgDouble.valueOf(value));
  }

  public float doAsFloat(final ExtendedThreadContext tc, final double value) throws NotPerformed {
    return doAsFloat(tc, NgDouble.valueOf(value));
  }

  public int doAsInt(final ExtendedThreadContext tc, final double value) throws NotPerformed {
    return doAsInt(tc, NgDouble.valueOf(value));
  }

  public long doAsLong(final ExtendedThreadContext tc, final double value) throws NotPerformed {
    return doAsLong(tc, NgDouble.valueOf(value));
  }

  public short doAsShort(final ExtendedThreadContext tc, final double value) throws NotPerformed {
    return doAsShort(tc, NgDouble.valueOf(value));
  }

  public String doAsString(final ExtendedThreadContext tc, final double value) throws NotPerformed {
    return doAsString(tc, NgDouble.valueOf(value));
  }
}
