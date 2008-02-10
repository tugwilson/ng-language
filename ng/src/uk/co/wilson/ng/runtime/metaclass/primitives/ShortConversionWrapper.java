package uk.co.wilson.ng.runtime.metaclass.primitives;

import java.math.BigDecimal;
import java.math.BigInteger;

import ng.runtime.NgShort;
import ng.runtime.metaclass.Conversion;
import ng.runtime.threadcontext.NotPerformed;
import ng.runtime.threadcontext.ThreadContext;

/**
 * @author John
 *
 */
public class ShortConversionWrapper extends ConversionWrapper implements ShortConversion {

  /**
   * @param delegate
   */
  public ShortConversionWrapper(final Conversion delegate) {
    super(delegate);
  }

  public BigDecimal doAsBigDecimal(final ThreadContext tc, final short value) throws NotPerformed {
    return doAsBigDecimal(tc, NgShort.valueOf(value));
  }

  public BigInteger doAsBigInteger(final ThreadContext tc, final short value) throws NotPerformed {
    return doAsBigInteger(tc, NgShort.valueOf(value));
  }

  public boolean doAsBoolean(final ThreadContext tc, final short value) throws NotPerformed {
    return doAsBoolean(tc, NgShort.valueOf(value));
  }

  public char doAsChar(final ThreadContext tc, final short value) throws NotPerformed {
    return doAsChar(tc, NgShort.valueOf(value));
  }

  public byte doAsByte(final ThreadContext tc, final short value) throws NotPerformed {
    return doAsByte(tc, NgShort.valueOf(value));
  }

  public double doAsDouble(final ThreadContext tc, final short value) throws NotPerformed {
    return doAsDouble(tc, NgShort.valueOf(value));
  }

  public float doAsFloat(final ThreadContext tc, final short value) throws NotPerformed {
    return doAsFloat(tc, NgShort.valueOf(value));
  }

  public int doAsInt(final ThreadContext tc, final short value) throws NotPerformed {
    return doAsInt(tc, NgShort.valueOf(value));
  }

  public long doAsLong(final ThreadContext tc, final short value) throws NotPerformed {
    return doAsLong(tc, NgShort.valueOf(value));
  }

  public String doAsString(final ThreadContext tc, final short value) throws NotPerformed {
    return doAsString(tc, NgShort.valueOf(value));
  }
}
