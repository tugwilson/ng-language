package uk.co.wilson.ng.runtime.metaclass.primitives.floatimpl;

import java.math.BigDecimal;
import java.math.BigInteger;

import ng.runtime.NgFloat;
import ng.runtime.threadcontext.NotPerformed;
import uk.co.wilson.ng.runtime.metaclass.Conversion;
import uk.co.wilson.ng.runtime.metaclass.primitives.ConversionWrapper;
import uk.co.wilson.ng.runtime.threadcontext.ExtendedThreadContext;

/**
 * @author John
 *
 */
public class FloatConversionWrapper extends ConversionWrapper implements FloatConversion {

  /**
   * @param delegate
   */
  public FloatConversionWrapper(final Conversion delegate) {
    super(delegate);
  }

  public BigDecimal doAsBigDecimal(final ExtendedThreadContext tc, final float value) throws NotPerformed {
    return doAsBigDecimal(tc, NgFloat.valueOf(value));
  }

  public BigInteger doAsBigInteger(final ExtendedThreadContext tc, final float value) throws NotPerformed {
    return doAsBigInteger(tc, NgFloat.valueOf(value));
  }

  public boolean doAsBoolean(final ExtendedThreadContext tc, final float value) throws NotPerformed {
    return doAsBoolean(tc, NgFloat.valueOf(value));
  }

  public char doAsChar(final ExtendedThreadContext tc, final float value) throws NotPerformed {
    return doAsChar(tc, NgFloat.valueOf(value));
  }

  public byte doAsByte(final ExtendedThreadContext tc, final float value) throws NotPerformed {
    return doAsByte(tc, NgFloat.valueOf(value));
  }

  public double doAsDouble(final ExtendedThreadContext tc, final float value) throws NotPerformed {
    return doAsDouble(tc, NgFloat.valueOf(value));
  }

  public int doAsInt(final ExtendedThreadContext tc, final float value) throws NotPerformed {
    return doAsInt(tc, NgFloat.valueOf(value));
  }

  public long doAsLong(final ExtendedThreadContext tc, final float value) throws NotPerformed {
    return doAsLong(tc, NgFloat.valueOf(value));
  }

  public short doAsShort(final ExtendedThreadContext tc, final float value) throws NotPerformed {
    return doAsShort(tc, NgFloat.valueOf(value));
  }

  public String doAsString(final ExtendedThreadContext tc, final float value) throws NotPerformed {
    return doAsString(tc, NgFloat.valueOf(value));
  }
}
