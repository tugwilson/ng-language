package uk.co.wilson.ng.runtime.metaclass.primitives.intimpl;

import java.math.BigDecimal;
import java.math.BigInteger;

import ng.runtime.threadcontext.NotPerformed;
import uk.co.wilson.ng.runtime.metaclass.IntBooleanComparison;
import uk.co.wilson.ng.runtime.threadcontext.ExtendedThreadContext;



abstract class BaseBooleanComparison extends BaseBinaryOperation implements IntBooleanComparison {
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

  public Object doApply(final ExtendedThreadContext tc, final int lhs, final char rhs) {
    try {
      return tc.wrap(doApplyBoolean(tc, lhs, rhs));
    } catch (final NotPerformed e) {
      return ExtendedThreadContext.NOT_PERFORMED;
    }
  }

  public Object doApply(final ExtendedThreadContext tc, final int lhs, final byte rhs) {
    try {
      return tc.wrap(doApplyBoolean(tc, lhs, rhs));
    } catch (final NotPerformed e) {
      return ExtendedThreadContext.NOT_PERFORMED;
    }
  }

  public Object doApply(final ExtendedThreadContext tc, final int lhs, final short rhs) {
    try {
      return tc.wrap(doApplyBoolean(tc, lhs, rhs));
    } catch (final NotPerformed e) {
      return ExtendedThreadContext.NOT_PERFORMED;
    }
  }

  public Object doApply(final ExtendedThreadContext tc, final int lhs, final int rhs) {
    try {
      return tc.wrap(doApplyBoolean(tc, lhs, rhs));
    } catch (final NotPerformed e) {
      return ExtendedThreadContext.NOT_PERFORMED;
    }
  }

  public Object doApply(final ExtendedThreadContext tc, final int lhs, final long rhs) {
    try {
      return tc.wrap(doApplyBoolean(tc, lhs, rhs));
    } catch (final NotPerformed e) {
      return ExtendedThreadContext.NOT_PERFORMED;
    }
  }

  public Object doApply(final ExtendedThreadContext tc, final int lhs, final float rhs) {
    try {
      return tc.wrap(doApplyBoolean(tc, lhs, rhs));
    } catch (final NotPerformed e) {
      return ExtendedThreadContext.NOT_PERFORMED;
    }
  }

  public Object doApply(final ExtendedThreadContext tc, final int lhs, final double rhs) {
    try {
      return tc.wrap(doApplyBoolean(tc, lhs, rhs));
    } catch (final NotPerformed e) {
      return ExtendedThreadContext.NOT_PERFORMED;
    }
  }

  public Object doApply(final ExtendedThreadContext tc, final int lhs, final BigInteger rhs) {
    try {
      return tc.wrap(doApplyBoolean(tc, lhs, rhs));
    } catch (final NotPerformed e) {
      return ExtendedThreadContext.NOT_PERFORMED;
    }
  }

  public Object doApply(final ExtendedThreadContext tc, final int lhs, final BigDecimal rhs) {
    try {
      return tc.wrap(doApplyBoolean(tc, lhs, rhs));
    } catch (final NotPerformed e) {
      return ExtendedThreadContext.NOT_PERFORMED;
    }
  }

  public boolean doApplyBoolean(final ExtendedThreadContext tc, final Object lhs, final char rhs) throws NotPerformed {
    return doApplyBoolean(tc, tc.unwrapToInt(lhs), rhs);
  }

  public boolean doApplyBoolean(final ExtendedThreadContext tc, final Object lhs, final byte rhs) throws NotPerformed {
    return doApplyBoolean(tc, tc.unwrapToInt(lhs), rhs);
  }

  public boolean doApplyBoolean(final ExtendedThreadContext tc, final Object lhs, final short rhs) throws NotPerformed {
    return doApplyBoolean(tc, tc.unwrapToInt(lhs), rhs);
  }

  public boolean doApplyBoolean(final ExtendedThreadContext tc, final Object lhs, final int rhs) throws NotPerformed {
    return doApplyBoolean(tc, tc.unwrapToInt(lhs), rhs);
  }

  public boolean doApplyBoolean(final ExtendedThreadContext tc, final Object lhs, final long rhs) throws NotPerformed {
    return doApplyBoolean(tc, tc.unwrapToInt(lhs), rhs);
  }

  public boolean doApplyBoolean(final ExtendedThreadContext tc, final Object lhs, final float rhs) throws NotPerformed {
    return doApplyBoolean(tc, tc.unwrapToInt(lhs), rhs);
  }

  public boolean doApplyBoolean(final ExtendedThreadContext tc, final Object lhs, final double rhs) throws NotPerformed {
    return doApplyBoolean(tc, tc.unwrapToInt(lhs), rhs);
  }

  public boolean doApplyBoolean(final ExtendedThreadContext tc, final Object lhs, final BigInteger rhs) throws NotPerformed {
    return doApplyBoolean(tc, tc.unwrapToInt(lhs), rhs);
  }

  public boolean doApplyBoolean(final ExtendedThreadContext tc, final Object lhs, final BigDecimal rhs) throws NotPerformed {
    return doApplyBoolean(tc, tc.unwrapToInt(lhs), rhs);
  }
}
