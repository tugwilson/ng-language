package uk.co.wilson.ng.runtime.metaclass.primitives.longimpl;

import java.math.BigDecimal;
import java.math.BigInteger;

import ng.runtime.NgLong;
import ng.runtime.metaclass.Conversion;
import ng.runtime.threadcontext.NotPerformed;
import ng.runtime.threadcontext.ThreadContext;
import uk.co.wilson.ng.runtime.metaclass.primitives.ConversionWrapper;

/**
 * @author John
 *
 */
public class LongConversionWrapper extends ConversionWrapper implements LongConversion {

  /**
   * @param delegate
   */
  public LongConversionWrapper(final Conversion delegate) {
    super(delegate);
  }

  public BigDecimal doAsBigDecimal(final ThreadContext tc, final long value) throws NotPerformed {
    return doAsBigDecimal(tc, NgLong.valueOf(value));
  }

  public BigInteger doAsBigInteger(final ThreadContext tc, final long value) throws NotPerformed {
    return doAsBigInteger(tc, NgLong.valueOf(value));
  }

  public boolean doAsBoolean(final ThreadContext tc, final long value) throws NotPerformed {
    return doAsBoolean(tc, NgLong.valueOf(value));
  }

  public char doAsChar(final ThreadContext tc, final long value) throws NotPerformed {
    return doAsChar(tc, NgLong.valueOf(value));
  }

  public byte doAsByte(final ThreadContext tc, final long value) throws NotPerformed {
    return doAsByte(tc, NgLong.valueOf(value));
  }

  public double doAsDouble(final ThreadContext tc, final long value) throws NotPerformed {
    return doAsDouble(tc, NgLong.valueOf(value));
  }

  public float doAsFloat(final ThreadContext tc, final long value) throws NotPerformed {
    return doAsFloat(tc, NgLong.valueOf(value));
  }

  public int doAsInt(final ThreadContext tc, final long value) throws NotPerformed {
    return doAsInt(tc, NgLong.valueOf(value));
  }

  public long doAsLong(final ThreadContext tc, final long value) throws NotPerformed {
    return doAsLong(tc, NgLong.valueOf(value));
  }

  public short doAsShort(final ThreadContext tc, final long value) throws NotPerformed {
    return doAsShort(tc, NgLong.valueOf(value));
  }

  public String doAsString(final ThreadContext tc, final long value) throws NotPerformed {
    return doAsString(tc, NgLong.valueOf(value));
  }
}