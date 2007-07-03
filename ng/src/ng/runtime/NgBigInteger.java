package ng.runtime;

import java.math.BigInteger;
import java.util.Random;

import ng.lang.NgObject;
import ng.lang.NgSystem;

/**
 * @author John
 *
 */
public class NgBigInteger extends BigInteger implements NgObject {
  /**
   * 
   */
  private static final long serialVersionUID = 1L;

  /**
   * @param val
   */
  public NgBigInteger(final byte[] val) {
    super(val);
  }

  /**
   * @param signum
   * @param magnitude
   */
  public NgBigInteger(final int signum, final byte[] magnitude) {
    super(signum, magnitude);
  }

  /**
   * @param bitLength
   * @param certainty
   * @param rnd
   */
  public NgBigInteger(final int bitLength, final int certainty, final Random rnd) {
    super(bitLength, certainty, rnd);
  }

  /**
   * @param numBits
   * @param rnd
   */
  public NgBigInteger(final int numBits, final Random rnd) {
    super(numBits, rnd);
  }

  /**
   * @param val
   * @param radix
   */
  public NgBigInteger(final String val, final int radix) {
    super(val, radix);
  }

  /**
   * @param val
   */
  public NgBigInteger(final String val) {
    super(val);
  }

  /* (non-Javadoc)
   * @see ng.lang.NgObject#getMetaClass()
   */
  public RuntimeMetaClass getMetaClass() {
    return NgSystem.bigIntegerMetaClass;
  }
}
