package uk.co.wilson.ng.runtime.metaclass.primitives.floatimpl;

import java.math.BigDecimal;
import java.math.BigInteger;

import ng.runtime.NgFloat;
import ng.runtime.metaclass.Conversion;
import ng.runtime.threadcontext.NotPerformed;
import ng.runtime.threadcontext.ThreadContext;
import uk.co.wilson.ng.runtime.metaclass.primitives.ConversionWrapper;

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

  public BigDecimal doAsBigDecimal(final ThreadContext tc, final float value) throws NotPerformed {
    return doAsBigDecimal(tc, NgFloat.valueOf(value));
  }

  public BigInteger doAsBigInteger(final ThreadContext tc, final float value) throws NotPerformed {
    return doAsBigInteger(tc, NgFloat.valueOf(value));
  }

  public boolean doAsBoolean(final ThreadContext tc, final float value) throws NotPerformed {
    return doAsBoolean(tc, NgFloat.valueOf(value));
  }

  public char doAsChar(final ThreadContext tc, final float value) throws NotPerformed {
    return doAsChar(tc, NgFloat.valueOf(value));
  }

  public byte doAsByte(final ThreadContext tc, final float value) throws NotPerformed {
    return doAsByte(tc, NgFloat.valueOf(value));
  }

  public double doAsDouble(final ThreadContext tc, final float value) throws NotPerformed {
    return doAsDouble(tc, NgFloat.valueOf(value));
  }

  public int doAsInt(final ThreadContext tc, final float value) throws NotPerformed {
    return doAsInt(tc, NgFloat.valueOf(value));
  }

  public long doAsLong(final ThreadContext tc, final float value) throws NotPerformed {
    return doAsLong(tc, NgFloat.valueOf(value));
  }

  public short doAsShort(final ThreadContext tc, final float value) throws NotPerformed {
    return doAsShort(tc, NgFloat.valueOf(value));
  }

  public String doAsString(final ThreadContext tc, final float value) throws NotPerformed {
    return doAsString(tc, NgFloat.valueOf(value));
  }
}
