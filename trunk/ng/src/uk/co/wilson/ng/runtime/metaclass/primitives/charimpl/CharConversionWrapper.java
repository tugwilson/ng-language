package uk.co.wilson.ng.runtime.metaclass.primitives.charimpl;

import java.math.BigDecimal;
import java.math.BigInteger;

import ng.runtime.NgChar;
import ng.runtime.metaclass.Conversion;
import ng.runtime.threadcontext.NotPerformed;
import ng.runtime.threadcontext.ThreadContext;
import uk.co.wilson.ng.runtime.metaclass.primitives.ConversionWrapper;

/**
 * @author John
 *
 */
public class CharConversionWrapper extends ConversionWrapper implements CharConversion {

  /**
   * @param delegate
   */
  public CharConversionWrapper(final Conversion delegate) {
    super(delegate);
  }

  public BigDecimal doAsBigDecimal(final ThreadContext tc, final char value) throws NotPerformed {
    return doAsBigDecimal(tc, NgChar.valueOf(value));
  }

  public BigInteger doAsBigInteger(final ThreadContext tc, final char value) throws NotPerformed {
    return doAsBigInteger(tc, NgChar.valueOf(value));
  }

  public boolean doAsBoolean(final ThreadContext tc, final char value) throws NotPerformed {
    return doAsBoolean(tc, NgChar.valueOf(value));
  }

  public byte doAsByte(final ThreadContext tc, final char value) throws NotPerformed {
    return doAsByte(tc, NgChar.valueOf(value));
  }

  public double doAsDouble(final ThreadContext tc, final char value) throws NotPerformed {
    return doAsDouble(tc, NgChar.valueOf(value));
  }

  public float doAsFloat(final ThreadContext tc, final char value) throws NotPerformed {
    return doAsFloat(tc, NgChar.valueOf(value));
  }

  public int doAsInt(final ThreadContext tc, final char value) throws NotPerformed {
    return doAsInt(tc, NgChar.valueOf(value));
  }

  public long doAsLong(final ThreadContext tc, final char value) throws NotPerformed {
    return doAsLong(tc, NgChar.valueOf(value));
  }

  public short doAsShort(final ThreadContext tc, final char value) throws NotPerformed {
    return doAsShort(tc, NgChar.valueOf(value));
  }

  public String doAsString(final ThreadContext tc, final char value) throws NotPerformed {
    return doAsString(tc, NgChar.valueOf(value));
  }
}