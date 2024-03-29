package uk.co.wilson.ng.runtime.metaclass.primitives.shortimpl;

import java.math.BigDecimal;
import java.math.BigInteger;

import ng.runtime.metaclass.Conversion;
import ng.runtime.metaclass.primitives.shortimpl.ShortConversion;
import ng.runtime.threadcontext.ExtendedThreadContext;
import ng.runtime.threadcontext.NotPerformed;
import uk.co.wilson.ng.runtime.metaclass.primitives.ConversionWrapper;

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

  public BigDecimal doAsBigDecimal(final ExtendedThreadContext tc, final short value) throws NotPerformed {
    return doAsBigDecimal(tc, tc.wrap(value));
  }

  public BigInteger doAsBigInteger(final ExtendedThreadContext tc, final short value) throws NotPerformed {
    return doAsBigInteger(tc, tc.wrap(value));
  }

  public boolean doAsBoolean(final ExtendedThreadContext tc, final short value) throws NotPerformed {
    return doAsBoolean(tc, tc.wrap(value));
  }

  public char doAsChar(final ExtendedThreadContext tc, final short value) throws NotPerformed {
    return doAsChar(tc, tc.wrap(value));
  }

  public byte doAsByte(final ExtendedThreadContext tc, final short value) throws NotPerformed {
    return doAsByte(tc, tc.wrap(value));
  }

  public double doAsDouble(final ExtendedThreadContext tc, final short value) throws NotPerformed {
    return doAsDouble(tc, tc.wrap(value));
  }

  public float doAsFloat(final ExtendedThreadContext tc, final short value) throws NotPerformed {
    return doAsFloat(tc, tc.wrap(value));
  }

  public int doAsInt(final ExtendedThreadContext tc, final short value) throws NotPerformed {
    return doAsInt(tc, tc.wrap(value));
  }

  public long doAsLong(final ExtendedThreadContext tc, final short value) throws NotPerformed {
    return doAsLong(tc, tc.wrap(value));
  }

  public String doAsString(final ExtendedThreadContext tc, final short value) throws NotPerformed {
    return doAsString(tc, tc.wrap(value));
  }
}
