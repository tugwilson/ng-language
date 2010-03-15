package uk.co.wilson.ng.runtime.metaclass.primitives.bigdecimal;

import java.math.BigDecimal;
import java.math.BigInteger;

import ng.runtime.metaclass.primitives.bigdecimal.BigDecimalBooleanComparison;
import ng.runtime.threadcontext.ExtendedThreadContext;
import ng.runtime.threadcontext.NotPerformed;

abstract class BaseBooleanComparison extends BaseBinaryOperation implements BigDecimalBooleanComparison {
  public Object doApply(final ExtendedThreadContext tc, final char lhs, final Object rhs) {
    try {
      return tc.wrap(doApplyBoolean(tc, lhs, rhs));
    } catch (final NotPerformed e) {
      return ExtendedThreadContext.NOT_PERFORMED;
    }
  }

  public Object doApply(final ExtendedThreadContext tc, final byte lhs, final Object rhs) {
    try {
      return tc.wrap(doApplyBoolean(tc, lhs, rhs));
    } catch (final NotPerformed e) {
      return ExtendedThreadContext.NOT_PERFORMED;
    }
  }

  public Object doApply(final ExtendedThreadContext tc, final short lhs, final Object rhs) {
    try {
      return tc.wrap(doApplyBoolean(tc, lhs, rhs));
    } catch (final NotPerformed e) {
      return ExtendedThreadContext.NOT_PERFORMED;
    }
  }

  public Object doApply(final ExtendedThreadContext tc, final int lhs, final Object rhs) {
    try {
      return tc.wrap(doApplyBoolean(tc, lhs, rhs));
    } catch (final NotPerformed e) {
      return ExtendedThreadContext.NOT_PERFORMED;
    }
  }

  public Object doApply(final ExtendedThreadContext tc, final long lhs, final Object rhs) {
    try {
      return tc.wrap(doApplyBoolean(tc, lhs, rhs));
    } catch (final NotPerformed e) {
      return ExtendedThreadContext.NOT_PERFORMED;
    }
  }

  public Object doApply(final ExtendedThreadContext tc, final float lhs, final Object rhs) {
    try {
      return tc.wrap(doApplyBoolean(tc, lhs, rhs));
    } catch (final NotPerformed e) {
      return ExtendedThreadContext.NOT_PERFORMED;
    }
  }

  public Object doApply(final ExtendedThreadContext tc, final double lhs, final Object rhs) {
    try {
      return tc.wrap(doApplyBoolean(tc, lhs, rhs));
    } catch (final NotPerformed e) {
      return ExtendedThreadContext.NOT_PERFORMED;
    }
  }

  public Object doApply(final ExtendedThreadContext tc, final BigInteger lhs, final Object rhs) {
    try {
      return tc.wrap(doApplyBoolean(tc, lhs, rhs));
    } catch (final NotPerformed e) {
      return ExtendedThreadContext.NOT_PERFORMED;
    }
  }

  public Object doApply(final ExtendedThreadContext tc, final BigDecimal lhs, final Object rhs) {
    try {
      return tc.wrap(doApplyBoolean(tc, lhs, rhs));
    } catch (final NotPerformed e) {
      return ExtendedThreadContext.NOT_PERFORMED;
    }
  }

  public Object doApply(final ExtendedThreadContext tc, final BigDecimal lhs, final char rhs) {
    try {
      return tc.wrap(doApplyBoolean(tc, lhs, rhs));
    } catch (final NotPerformed e) {
      return ExtendedThreadContext.NOT_PERFORMED;
    }
  }

  public Object doApply(final ExtendedThreadContext tc, final BigDecimal lhs, final byte rhs) {
    try {
      return tc.wrap(doApplyBoolean(tc, lhs, rhs));
    } catch (final NotPerformed e) {
      return ExtendedThreadContext.NOT_PERFORMED;
    }
  }

  public Object doApply(final ExtendedThreadContext tc, final BigDecimal lhs, final short rhs) {
    try {
      return tc.wrap(doApplyBoolean(tc, lhs, rhs));
    } catch (final NotPerformed e) {
      return ExtendedThreadContext.NOT_PERFORMED;
    }
  }

  public Object doApply(final ExtendedThreadContext tc, final BigDecimal lhs, final int rhs) {
    try {
      return tc.wrap(doApplyBoolean(tc, lhs, rhs));
    } catch (final NotPerformed e) {
      return ExtendedThreadContext.NOT_PERFORMED;
    }
  }

  public Object doApply(final ExtendedThreadContext tc, final BigDecimal lhs, final long rhs) {
    try {
      return tc.wrap(doApplyBoolean(tc, lhs, rhs));
    } catch (final NotPerformed e) {
      return ExtendedThreadContext.NOT_PERFORMED;
    }
  }

  public Object doApply(final ExtendedThreadContext tc, final BigDecimal lhs, final float rhs) {
    try {
      return tc.wrap(doApplyBoolean(tc, lhs, rhs));
    } catch (final NotPerformed e) {
      return ExtendedThreadContext.NOT_PERFORMED;
    }
  }

  public Object doApply(final ExtendedThreadContext tc, final BigDecimal lhs, final double rhs) {
    try {
      return tc.wrap(doApplyBoolean(tc, lhs, rhs));
    } catch (final NotPerformed e) {
      return ExtendedThreadContext.NOT_PERFORMED;
    }
  }

  public Object doApply(final ExtendedThreadContext tc, final BigDecimal lhs, final BigInteger rhs) {
    try {
      return tc.wrap(doApplyBoolean(tc, lhs, rhs));
    } catch (final NotPerformed e) {
      return ExtendedThreadContext.NOT_PERFORMED;
    }
  }

  public Object doApply(final ExtendedThreadContext tc, final BigDecimal lhs, final BigDecimal rhs) {
    try {
      return tc.wrap(doApplyBoolean(tc, lhs, rhs));
    } catch (final NotPerformed e) {
      return ExtendedThreadContext.NOT_PERFORMED;
    }
  }

  public boolean doApplyBoolean(final ExtendedThreadContext tc, final Object lhs, final char rhs) throws NotPerformed {
    return doApplyBoolean(tc, (BigDecimal) lhs, rhs);
  }

  public boolean doApplyBoolean(final ExtendedThreadContext tc, final Object lhs, final byte rhs) throws NotPerformed {
    return doApplyBoolean(tc, (BigDecimal) lhs, rhs);
  }

  public boolean doApplyBoolean(final ExtendedThreadContext tc, final Object lhs, final short rhs) throws NotPerformed {
    return doApplyBoolean(tc, (BigDecimal) lhs, rhs);
  }

  public boolean doApplyBoolean(final ExtendedThreadContext tc, final Object lhs, final int rhs) throws NotPerformed {
    return doApplyBoolean(tc, (BigDecimal) lhs, rhs);
  }

  public boolean doApplyBoolean(final ExtendedThreadContext tc, final Object lhs, final long rhs) throws NotPerformed {
    return doApplyBoolean(tc, (BigDecimal) lhs, rhs);
  }

  public boolean doApplyBoolean(final ExtendedThreadContext tc, final Object lhs, final float rhs) throws NotPerformed {
    return doApplyBoolean(tc, (BigDecimal) lhs, rhs);
  }

  public boolean doApplyBoolean(final ExtendedThreadContext tc, final Object lhs, final double rhs) throws NotPerformed {
    return doApplyBoolean(tc, (BigDecimal) lhs, rhs);
  }

  public boolean doApplyBoolean(final ExtendedThreadContext tc, final Object lhs, final BigInteger rhs) throws NotPerformed {
    return doApplyBoolean(tc, (BigDecimal) lhs, rhs);
  }

  public boolean doApplyBoolean(final ExtendedThreadContext tc, final Object lhs, final BigDecimal rhs) throws NotPerformed {
    return doApplyBoolean(tc, (BigDecimal) lhs, rhs);
  }
}
