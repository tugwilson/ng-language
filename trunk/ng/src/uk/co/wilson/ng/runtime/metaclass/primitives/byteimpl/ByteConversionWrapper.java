package uk.co.wilson.ng.runtime.metaclass.primitives.byteimpl;

import java.math.BigDecimal;
import java.math.BigInteger;

import ng.runtime.NgByte;
import ng.runtime.metaclass.Conversion;
import ng.runtime.threadcontext.NotPerformed;
import ng.runtime.threadcontext.ThreadContext;
import uk.co.wilson.ng.runtime.metaclass.primitives.ConversionWrapper;

/**
 * @author John
 *
 */
public class ByteConversionWrapper extends ConversionWrapper implements ByteConversion {

  /**
   * @param delegate
   */
  public ByteConversionWrapper(final Conversion delegate) {
    super(delegate);
  }

  public BigDecimal doAsBigDecimal(final ThreadContext tc, final byte value) throws NotPerformed {
    return doAsBigDecimal(tc, NgByte.valueOf(value));
  }

  public BigInteger doAsBigInteger(final ThreadContext tc, final byte value) throws NotPerformed {
    return doAsBigInteger(tc, NgByte.valueOf(value));
  }

  public boolean doAsBoolean(final ThreadContext tc, final byte value) throws NotPerformed {
    return doAsBoolean(tc, NgByte.valueOf(value));
  }

  public char doAsChar(final ThreadContext tc, final byte value) throws NotPerformed {
    return doAsChar(tc, NgByte.valueOf(value));
  }

  public double doAsDouble(final ThreadContext tc, final byte value) throws NotPerformed {
    return doAsDouble(tc, NgByte.valueOf(value));
  }

  public float doAsFloat(final ThreadContext tc, final byte value) throws NotPerformed {
    return doAsFloat(tc, NgByte.valueOf(value));
  }

  public int doAsInt(final ThreadContext tc, final byte value) throws NotPerformed {
    return doAsInt(tc, NgByte.valueOf(value));
  }

  public long doAsLong(final ThreadContext tc, final byte value) throws NotPerformed {
    return doAsLong(tc, NgByte.valueOf(value));
  }

  public short doAsShort(final ThreadContext tc, final byte value) throws NotPerformed {
    return doAsShort(tc, NgByte.valueOf(value));
  }

  public String doAsString(final ThreadContext tc, final byte value) throws NotPerformed {
    return doAsString(tc, NgByte.valueOf(value));
  }
}