package uk.co.wilson.ng.runtime.metaclass.primitives.biginteger;

import java.math.BigDecimal;
import java.math.BigInteger;

import ng.runtime.threadcontext.NotPerformed;
import ng.runtime.threadcontext.ThreadContext;
import uk.co.wilson.ng.runtime.metaclass.primitives.BigIntegerBooleanComparison;

abstract class BaseBooleanComparison extends BaseBinaryOperation implements BigIntegerBooleanComparison {
  public Object doApply(final ThreadContext tc, final char lhs, final Object rhs) {
    try {
      return tc.wrap(doApplyBoolean(tc, lhs, rhs));
    } catch (final NotPerformed e) {
      return ThreadContext.NOT_PERFORMED;
    }
  }

  public Object doApply(final ThreadContext tc, final byte lhs, final Object rhs) {
    try {
      return tc.wrap(doApplyBoolean(tc, lhs, rhs));
    } catch (final NotPerformed e) {
      return ThreadContext.NOT_PERFORMED;
    }
  }

  public Object doApply(final ThreadContext tc, final short lhs, final Object rhs) {
    try {
      return tc.wrap(doApplyBoolean(tc, lhs, rhs));
    } catch (final NotPerformed e) {
      return ThreadContext.NOT_PERFORMED;
    }
  }

  public Object doApply(final ThreadContext tc, final int lhs, final Object rhs) {
    try {
      return tc.wrap(doApplyBoolean(tc, lhs, rhs));
    } catch (final NotPerformed e) {
      return ThreadContext.NOT_PERFORMED;
    }
  }

  public Object doApply(final ThreadContext tc, final long lhs, final Object rhs) {
    try {
      return tc.wrap(doApplyBoolean(tc, lhs, rhs));
    } catch (final NotPerformed e) {
      return ThreadContext.NOT_PERFORMED;
    }
  }

  public Object doApply(final ThreadContext tc, final float lhs, final Object rhs) {
    try {
      return tc.wrap(doApplyBoolean(tc, lhs, rhs));
    } catch (final NotPerformed e) {
      return ThreadContext.NOT_PERFORMED;
    }
  }

  public Object doApply(final ThreadContext tc, final double lhs, final Object rhs) {
    try {
      return tc.wrap(doApplyBoolean(tc, lhs, rhs));
    } catch (final NotPerformed e) {
      return ThreadContext.NOT_PERFORMED;
    }
  }

  public Object doApply(final ThreadContext tc, final BigInteger lhs, final Object rhs) {
    try {
      return tc.wrap(doApplyBoolean(tc, lhs, rhs));
    } catch (final NotPerformed e) {
      return ThreadContext.NOT_PERFORMED;
    }
  }

  public Object doApply(final ThreadContext tc, final BigDecimal lhs, final Object rhs) {
    try {
      return tc.wrap(doApplyBoolean(tc, lhs, rhs));
    } catch (final NotPerformed e) {
      return ThreadContext.NOT_PERFORMED;
    }
  }

  public Object doApply(final ThreadContext tc, final BigInteger lhs, final char rhs) {
    try {
      return tc.wrap(doApplyBoolean(tc, lhs, rhs));
    } catch (final NotPerformed e) {
      return ThreadContext.NOT_PERFORMED;
    }
  }

  public Object doApply(final ThreadContext tc, final BigInteger lhs, final byte rhs) {
    try {
      return tc.wrap(doApplyBoolean(tc, lhs, rhs));
    } catch (final NotPerformed e) {
      return ThreadContext.NOT_PERFORMED;
    }
  }

  public Object doApply(final ThreadContext tc, final BigInteger lhs, final short rhs) {
    try {
      return tc.wrap(doApplyBoolean(tc, lhs, rhs));
    } catch (final NotPerformed e) {
      return ThreadContext.NOT_PERFORMED;
    }
  }

  public Object doApply(final ThreadContext tc, final BigInteger lhs, final int rhs) {
    try {
      return tc.wrap(doApplyBoolean(tc, lhs, rhs));
    } catch (final NotPerformed e) {
      return ThreadContext.NOT_PERFORMED;
    }
  }

  public Object doApply(final ThreadContext tc, final BigInteger lhs, final long rhs) {
    try {
      return tc.wrap(doApplyBoolean(tc, lhs, rhs));
    } catch (final NotPerformed e) {
      return ThreadContext.NOT_PERFORMED;
    }
  }

  public Object doApply(final ThreadContext tc, final BigInteger lhs, final float rhs) {
    try {
      return tc.wrap(doApplyBoolean(tc, lhs, rhs));
    } catch (final NotPerformed e) {
      return ThreadContext.NOT_PERFORMED;
    }
  }

  public Object doApply(final ThreadContext tc, final BigInteger lhs, final double rhs) {
    try {
      return tc.wrap(doApplyBoolean(tc, lhs, rhs));
    } catch (final NotPerformed e) {
      return ThreadContext.NOT_PERFORMED;
    }
  }

  public Object doApply(final ThreadContext tc, final BigInteger lhs, final BigInteger rhs) {
    try {
      return tc.wrap(doApplyBoolean(tc, lhs, rhs));
    } catch (final NotPerformed e) {
      return ThreadContext.NOT_PERFORMED;
    }
  }

  public Object doApply(final ThreadContext tc, final BigInteger lhs, final BigDecimal rhs) {
    try {
      return tc.wrap(doApplyBoolean(tc, lhs, rhs));
    } catch (final NotPerformed e) {
      return ThreadContext.NOT_PERFORMED;
    }
  }

  public boolean doApplyBoolean(final ThreadContext tc, final Object lhs, final char rhs) throws NotPerformed {
    return doApplyBoolean(tc, (BigInteger)lhs, rhs);
  }

  public boolean doApplyBoolean(final ThreadContext tc, final Object lhs, final byte rhs) throws NotPerformed {
    return doApplyBoolean(tc, (BigInteger)lhs, rhs);
  }

  public boolean doApplyBoolean(final ThreadContext tc, final Object lhs, final short rhs) throws NotPerformed {
    return doApplyBoolean(tc, (BigInteger)lhs, rhs);
  }

  public boolean doApplyBoolean(final ThreadContext tc, final Object lhs, final int rhs) throws NotPerformed {
    return doApplyBoolean(tc, (BigInteger)lhs, rhs);
  }

  public boolean doApplyBoolean(final ThreadContext tc, final Object lhs, final long rhs) throws NotPerformed {
    return doApplyBoolean(tc, (BigInteger)lhs, rhs);
  }

  public boolean doApplyBoolean(final ThreadContext tc, final Object lhs, final float rhs) throws NotPerformed {
    return doApplyBoolean(tc, (BigInteger)lhs, rhs);
  }

  public boolean doApplyBoolean(final ThreadContext tc, final Object lhs, final double rhs) throws NotPerformed {
    return doApplyBoolean(tc, (BigInteger)lhs, rhs);
  }

  public boolean doApplyBoolean(final ThreadContext tc, final Object lhs, final BigInteger rhs) throws NotPerformed {
    return doApplyBoolean(tc, (BigInteger)lhs, rhs);
  }

  public boolean doApplyBoolean(final ThreadContext tc, final Object lhs, final BigDecimal rhs) throws NotPerformed {
    return doApplyBoolean(tc, (BigInteger)lhs, rhs);
  }
}
