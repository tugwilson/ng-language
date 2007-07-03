package ng.runtime;

import java.math.BigDecimal;
/*
 * Created on 3 Jul 2007
 *
 * Copyright 2007 John G. Wilson
 *
 *   Licensed under the Apache License, Version 2.0 (the "License");
 *   you may not use this file except in compliance with the License.
 *   You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 *   Unless required by applicable law or agreed to in writing, software
 *   distributed under the License is distributed on an "AS IS" BASIS,
 *   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *   See the License for the specific language governing permissions and
 *   limitations under the License.
 *
 */
import java.math.BigInteger;
import java.math.MathContext;

import ng.lang.NgObject;
import ng.lang.NgSystem;

/**
 * @author John
 *
 */
public class NgBigDecimal extends BigDecimal implements NgObject {

  /**
   * 
   */
  private static final long serialVersionUID = 1L;

  /**
   * @param unscaledVal
   * @param scale
   * @param mc
   */
  public NgBigDecimal(final BigInteger unscaledVal, final int scale, final MathContext mc) {
    super(unscaledVal, scale, mc);
  }

  /**
   * @param unscaledVal
   * @param scale
   */
  public NgBigDecimal(final BigInteger unscaledVal, final int scale) {
    super(unscaledVal, scale);
  }

  /**
   * @param val
   * @param mc
   */
  public NgBigDecimal(final BigInteger val, final MathContext mc) {
    super(val, mc);
  }

  /**
   * @param val
   */
  public NgBigDecimal(final BigInteger val) {
    super(val);
  }

  /**
   * @param in
   * @param offset
   * @param len
   * @param mc
   */
  public NgBigDecimal(final char[] in, final int offset, final int len, final MathContext mc) {
    super(in, offset, len, mc);
  }

  /**
   * @param in
   * @param offset
   * @param len
   */
  public NgBigDecimal(final char[] in, final int offset, final int len) {
    super(in, offset, len);
  }

  /**
   * @param in
   * @param mc
   */
  public NgBigDecimal(final char[] in, final MathContext mc) {
    super(in, mc);
  }

  /**
   * @param in
   */
  public NgBigDecimal(final char[] in) {
    super(in);
  }

  /**
   * @param val
   * @param mc
   */
  public NgBigDecimal(final double val, final MathContext mc) {
    super(val, mc);
  }

  /**
   * @param val
   */
  public NgBigDecimal(final double val) {
    super(val);
  }

  /**
   * @param val
   * @param mc
   */
  public NgBigDecimal(final int val, final MathContext mc) {
    super(val, mc);
  }

  /**
   * @param val
   */
  public NgBigDecimal(final int val) {
    super(val);
  }

  /**
   * @param val
   * @param mc
   */
  public NgBigDecimal(final long val, final MathContext mc) {
    super(val, mc);
  }

  /**
   * @param val
   */
  public NgBigDecimal(final long val) {
    super(val);
  }

  /**
   * @param val
   * @param mc
   */
  public NgBigDecimal(final String val, final MathContext mc) {
    super(val, mc);
  }

  /**
   * @param val
   */
  public NgBigDecimal(final String val) {
    super(val);
  }

  /* (non-Javadoc)
   * @see ng.lang.NgObject#getMetaClass()
   */
  public RuntimeMetaClass getMetaClass() {
    return NgSystem.bigDecimalMetaClass;
  }
}
