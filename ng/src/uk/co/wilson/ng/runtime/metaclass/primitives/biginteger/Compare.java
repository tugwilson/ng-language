package uk.co.wilson.ng.runtime.metaclass.primitives.biginteger;

import java.math.BigDecimal;
import java.math.BigInteger;

import ng.runtime.metaclass.MetaClass;
import ng.runtime.threadcontext.ExtendedThreadContext;
import ng.runtime.threadcontext.NotPerformed;

/*
 * Created on 19 Feb 2008
 *
 * Copyright 2008 John G. Wilson
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

/**
 * @author John
 *
 */
public class Compare extends BaseBinaryOperation implements BigIntegerIntegerComparison {
  public Object doApply(final ExtendedThreadContext tc, final Object lhs, final Object rhs) {
    return tc.compare().apply((BigInteger)lhs, rhs);
  }

  public Object doApply(final ExtendedThreadContext tc, final Object lhs, final MetaClass rhsMetaClass, final Object rhs) {
    return tc.compare().apply((BigInteger)lhs, rhsMetaClass, rhs);
  }

  public Object doReverseApply(final ExtendedThreadContext tc, final Object lhs, final Object rhs) {
    return tc.compare().apply(lhs, (BigDecimal)rhs);
  }

  public int doIntApply(final ExtendedThreadContext tc, final Object lhs, final Object rhs) {
    return tc.compare().intApply((BigInteger)lhs, rhs);
  }

  public int doIntApply(final ExtendedThreadContext tc, final Object lhs, final MetaClass rhsMetaClass, final Object rhs) {
    return tc.compare().intApply((BigInteger)lhs, rhsMetaClass, rhs);
  }

  public int doReverseIntApply(final ExtendedThreadContext tc, final Object lhs, final Object rhs) {
    return tc.compare().intApply(lhs, (BigInteger)rhs);
  }

  public int doIntApply(final ExtendedThreadContext tc, final char lhs, final Object rhs) throws NotPerformed {
    return tc.compare().intApply(lhs, (BigInteger)rhs);
  }

  public int doIntApply(final ExtendedThreadContext tc, final byte lhs, final Object rhs) throws NotPerformed {
    return tc.compare().intApply(lhs, (BigInteger)rhs);
  }

  public int doIntApply(final ExtendedThreadContext tc, final short lhs, final Object rhs) throws NotPerformed {
    return tc.compare().intApply(lhs, (BigInteger)rhs);
  }

  public int doIntApply(final ExtendedThreadContext tc, final int lhs, final Object rhs) throws NotPerformed {
    return tc.compare().intApply(lhs, (BigInteger)rhs);
  }

  public int doIntApply(final ExtendedThreadContext tc, final long lhs, final Object rhs) throws NotPerformed {
    return tc.compare().intApply(lhs, (BigInteger)rhs);
  }

  public int doIntApply(final ExtendedThreadContext tc, final float lhs, final Object rhs) throws NotPerformed {
    return tc.compare().intApply(lhs, (BigInteger)rhs);
  }

  public int doIntApply(final ExtendedThreadContext tc, final double lhs, final Object rhs) throws NotPerformed {
    return tc.compare().intApply(lhs, (BigInteger)rhs);
  }

  public int doIntApply(final ExtendedThreadContext tc, final BigInteger lhs, final Object rhs) throws NotPerformed {
    return tc.compare().intApply(lhs, (BigInteger)rhs);
  }

  public int doIntApply(final ExtendedThreadContext tc, final BigDecimal lhs, final Object rhs) throws NotPerformed {
    return tc.compare().intApply(lhs, (BigInteger)rhs);
  }

  public int doIntApply(final ExtendedThreadContext tc, final BigInteger lhs, final char rhs) throws NotPerformed {
    return lhs.compareTo(BigInteger.valueOf(rhs));
  }

  public int doIntApply(final ExtendedThreadContext tc, final BigInteger lhs, final byte rhs) throws NotPerformed {
    return lhs.compareTo(BigInteger.valueOf(rhs));
  }

  public int doIntApply(final ExtendedThreadContext tc, final BigInteger lhs, final short rhs) throws NotPerformed {
    return lhs.compareTo(BigInteger.valueOf(rhs));
  }

  public int doIntApply(final ExtendedThreadContext tc, final BigInteger lhs, final int rhs) throws NotPerformed {
    return lhs.compareTo(BigInteger.valueOf(rhs));
  }

  public int doIntApply(final ExtendedThreadContext tc, final BigInteger lhs, final long rhs) throws NotPerformed {
    return lhs.compareTo(BigInteger.valueOf(rhs));
  }

  public int doIntApply(final ExtendedThreadContext tc, final BigInteger lhs, final float rhs) throws NotPerformed {
    return lhs.compareTo(BigInteger.valueOf((long)rhs));
  }

  public int doIntApply(final ExtendedThreadContext tc, final BigInteger lhs, final double rhs) throws NotPerformed {
    return lhs.compareTo(BigInteger.valueOf((long)rhs));
  }

  public int doIntApply(final ExtendedThreadContext tc, final BigInteger lhs, final BigInteger rhs) throws NotPerformed {
    return lhs.compareTo(rhs);
  }

  public int doIntApply(final ExtendedThreadContext tc, final BigInteger lhs, final BigDecimal rhs) throws NotPerformed {
    return (new BigDecimal(lhs)).compareTo(rhs);
  }

  public Object doApply(final ExtendedThreadContext tc, final char lhs, final Object rhs) {
    try {
      return tc.wrap(doIntApply(tc, lhs, rhs));
    } catch (final NotPerformed e) {
      return ExtendedThreadContext.NOT_PERFORMED;
    }
  }

  public Object doApply(final ExtendedThreadContext tc, final byte lhs, final Object rhs) {
    try {
      return tc.wrap(doIntApply(tc, lhs, rhs));
    } catch (final NotPerformed e) {
      return ExtendedThreadContext.NOT_PERFORMED;
    }
  }

  public Object doApply(final ExtendedThreadContext tc, final short lhs, final Object rhs) {
    try {
      return tc.wrap(doIntApply(tc, lhs, rhs));
    } catch (final NotPerformed e) {
      return ExtendedThreadContext.NOT_PERFORMED;
    }
  }

  public Object doApply(final ExtendedThreadContext tc, final int lhs, final Object rhs) {
    try {
      return tc.wrap(doIntApply(tc, lhs, rhs));
    } catch (final NotPerformed e) {
      return ExtendedThreadContext.NOT_PERFORMED;
    }
  }

  public Object doApply(final ExtendedThreadContext tc, final long lhs, final Object rhs) {
    try {
      return tc.wrap(doIntApply(tc, lhs, rhs));
    } catch (final NotPerformed e) {
      return ExtendedThreadContext.NOT_PERFORMED;
    }
  }

  public Object doApply(final ExtendedThreadContext tc, final float lhs, final Object rhs) {
    try {
      return tc.wrap(doIntApply(tc, lhs, rhs));
    } catch (final NotPerformed e) {
      return ExtendedThreadContext.NOT_PERFORMED;
    }
  }

  public Object doApply(final ExtendedThreadContext tc, final double lhs, final Object rhs) {
    try {
      return tc.wrap(doIntApply(tc, lhs, rhs));
    } catch (final NotPerformed e) {
      return ExtendedThreadContext.NOT_PERFORMED;
    }
  }

  public Object doApply(final ExtendedThreadContext tc, final BigInteger lhs, final Object rhs) {
    try {
      return tc.wrap(doIntApply(tc, lhs, rhs));
    } catch (final NotPerformed e) {
      return ExtendedThreadContext.NOT_PERFORMED;
    }
  }

  public Object doApply(final ExtendedThreadContext tc, final BigDecimal lhs, final Object rhs) {
    try {
      return tc.wrap(doIntApply(tc, lhs, rhs));
    } catch (final NotPerformed e) {
      return ExtendedThreadContext.NOT_PERFORMED;
    }
  }

  public Object doApply(final ExtendedThreadContext tc, final BigInteger lhs, final char rhs) {
    try {
      return tc.wrap(doIntApply(tc, lhs, rhs));
    } catch (final NotPerformed e) {
      return ExtendedThreadContext.NOT_PERFORMED;
    }
  }

  public Object doApply(final ExtendedThreadContext tc, final BigInteger lhs, final byte rhs) {
    try {
      return tc.wrap(doIntApply(tc, lhs, rhs));
    } catch (final NotPerformed e) {
      return ExtendedThreadContext.NOT_PERFORMED;
    }
  }

  public Object doApply(final ExtendedThreadContext tc, final BigInteger lhs, final short rhs) {
    try {
      return tc.wrap(doIntApply(tc, lhs, rhs));
    } catch (final NotPerformed e) {
      return ExtendedThreadContext.NOT_PERFORMED;
    }
  }

  public Object doApply(final ExtendedThreadContext tc, final BigInteger lhs, final int rhs) {
    try {
      return tc.wrap(doIntApply(tc, lhs, rhs));
    } catch (final NotPerformed e) {
      return ExtendedThreadContext.NOT_PERFORMED;
    }
  }

  public Object doApply(final ExtendedThreadContext tc, final BigInteger lhs, final long rhs) {
    try {
      return tc.wrap(doIntApply(tc, lhs, rhs));
    } catch (final NotPerformed e) {
      return ExtendedThreadContext.NOT_PERFORMED;
    }
  }

  public Object doApply(final ExtendedThreadContext tc, final BigInteger lhs, final float rhs) {
    try {
      return tc.wrap(doIntApply(tc, lhs, rhs));
    } catch (final NotPerformed e) {
      return ExtendedThreadContext.NOT_PERFORMED;
    }
  }

  public Object doApply(final ExtendedThreadContext tc, final BigInteger lhs, final double rhs) {
    try {
      return tc.wrap(doIntApply(tc, lhs, rhs));
    } catch (final NotPerformed e) {
      return ExtendedThreadContext.NOT_PERFORMED;
    }
  }

  public Object doApply(final ExtendedThreadContext tc, final BigInteger lhs, final BigInteger rhs) {
    try {
      return tc.wrap(doIntApply(tc, lhs, rhs));
    } catch (final NotPerformed e) {
      return ExtendedThreadContext.NOT_PERFORMED;
    }
  }

  public Object doApply(final ExtendedThreadContext tc, final BigInteger lhs, final BigDecimal rhs) {
    try {
      return tc.wrap(doIntApply(tc, lhs, rhs));
    } catch (final NotPerformed e) {
      return ExtendedThreadContext.NOT_PERFORMED;
    }
  }

  public int doIntApply(final ExtendedThreadContext tc, final Object lhs, final char rhs) throws NotPerformed {
    return doIntApply(tc, (BigInteger)lhs, rhs);
  }

  public int doIntApply(final ExtendedThreadContext tc, final Object lhs, final byte rhs) throws NotPerformed {
    return doIntApply(tc, (BigInteger)lhs, rhs);
  }

  public int doIntApply(final ExtendedThreadContext tc, final Object lhs, final short rhs) throws NotPerformed {
    return doIntApply(tc, (BigInteger)lhs, rhs);
  }

  public int doIntApply(final ExtendedThreadContext tc, final Object lhs, final int rhs) throws NotPerformed {
    return doIntApply(tc, (BigInteger)lhs, rhs);
  }

  public int doIntApply(final ExtendedThreadContext tc, final Object lhs, final long rhs) throws NotPerformed {
    return doIntApply(tc, (BigInteger)lhs, rhs);
  }

  public int doIntApply(final ExtendedThreadContext tc, final Object lhs, final float rhs) throws NotPerformed {
    return doIntApply(tc, (BigInteger)lhs, rhs);
  }

  public int doIntApply(final ExtendedThreadContext tc, final Object lhs, final double rhs) throws NotPerformed {
    return doIntApply(tc, (BigInteger)lhs, rhs);
  }

  public int doIntApply(final ExtendedThreadContext tc, final Object lhs, final BigInteger rhs) throws NotPerformed {
    return doIntApply(tc, (BigInteger)lhs, rhs);
  }

  public int doIntApply(final ExtendedThreadContext tc, final Object lhs, final BigDecimal rhs) throws NotPerformed {
    return doIntApply(tc, (BigInteger)lhs, rhs);
  }
}
