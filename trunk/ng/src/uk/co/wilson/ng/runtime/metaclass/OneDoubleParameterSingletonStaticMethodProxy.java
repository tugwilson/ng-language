package uk.co.wilson.ng.runtime.metaclass;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.math.BigDecimal;
import java.math.BigInteger;

import ng.lang.NgRuntimeException;
import ng.runtime.threadcontext.ThreadContext;

/**
 *
 * This is the case where there is just one method with this name and it takes a single double parameter
 *
 * @author John
 *
 */
public class OneDoubleParameterSingletonStaticMethodProxy extends OneParameterSingletonStaticMethodProxy {
  /**
   * @param method
   */
  public OneDoubleParameterSingletonStaticMethodProxy(final Method method) {
    super(method);
  }

  /* (non-JavaDoc)
   * @see uk.co.wilson.ng.runtime.metaclass.BaseStaticMethodProxy#doApplyQuick(ng.runtime.threadcontext.ThreadContext, java.lang.Object)
   */
  @Override
  public Object doApplyQuick(final ThreadContext tc, final Object p1) {
    return doApplyQuick(tc, tc.convert().asDouble(p1));
  }

  /* (non-JavaDoc)
   * @see uk.co.wilson.ng.runtime.metaclass.BaseStaticMethodProxy#doApplyQuick(ng.runtime.threadcontext.ThreadContext, char)
   */
  @Override
  public Object doApplyQuick(final ThreadContext tc, final char p1) {
    return doApplyQuick(tc, tc.convert().asDouble(p1));
  }

  /* (non-JavaDoc)
   * @see uk.co.wilson.ng.runtime.metaclass.BaseStaticMethodProxy#doApplyQuick(ng.runtime.threadcontext.ThreadContext, byte)
   */
  @Override
  public Object doApplyQuick(final ThreadContext tc, final byte p1) {
    return doApplyQuick(tc, tc.convert().asDouble(p1));
  }

  /* (non-JavaDoc)
   * @see uk.co.wilson.ng.runtime.metaclass.BaseStaticMethodProxy#doApplyQuick(ng.runtime.threadcontext.ThreadContext, short)
   */
  @Override
  public Object doApplyQuick(final ThreadContext tc, final short p1) {
    return doApplyQuick(tc, tc.convert().asDouble(p1));
  }

  /* (non-JavaDoc)
   * @see uk.co.wilson.ng.runtime.metaclass.BaseStaticMethodProxy#doApplyQuick(ng.runtime.threadcontext.ThreadContext, int)
   */
  @Override
  public Object doApplyQuick(final ThreadContext tc, final int p1) {
    return doApplyQuick(tc, tc.convert().asDouble(p1));
  }

  /* (non-JavaDoc)
   * @see uk.co.wilson.ng.runtime.metaclass.BaseStaticMethodProxy#doApplyQuick(ng.runtime.threadcontext.ThreadContext, long)
   */
  @Override
  public Object doApplyQuick(final ThreadContext tc, final long p1) {
    return doApplyQuick(tc, tc.convert().asDouble(p1));
  }

  /* (non-JavaDoc)
   * @see uk.co.wilson.ng.runtime.metaclass.BaseStaticMethodProxy#doApplyQuick(ng.runtime.threadcontext.ThreadContext, float)
   */
  @Override
  public Object doApplyQuick(final ThreadContext tc, final float p1) {
    return doApplyQuick(tc, tc.convert().asDouble(p1));
  }

  /* (non-JavaDoc)
   * @see uk.co.wilson.ng.runtime.metaclass.BaseStaticMethodProxy#doApplyQuick(ng.runtime.threadcontext.ThreadContext, double)
   */
  @Override
  public Object doApplyQuick(final ThreadContext tc, final double p1) {
    if (this.modifiedProxy == null) {
      try {
        return wrapReturnValue(tc, this.method.invoke(null, new Object[]{Double.valueOf(p1)}));
      } catch (final IllegalArgumentException e) {
        throw new NgRuntimeException(e);
      } catch (final IllegalAccessException e) {
        throw new NgRuntimeException(e);
      } catch (final InvocationTargetException e) {
        throw new NgRuntimeException(e);
      }
    } else {
      return this.modifiedProxy.doApplyQuick(tc, p1);
    }
  }

  /* (non-JavaDoc)
   * @see uk.co.wilson.ng.runtime.metaclass.BaseStaticMethodProxy#doApplyQuick(ng.runtime.threadcontext.ThreadContext, java.math.BigInteger)
   */
  @Override
  public Object doApplyQuick(final ThreadContext tc, final BigInteger p1) {
    return doApplyQuick(tc, tc.convert().asDouble(p1));
  }

  /* (non-JavaDoc)
   * @see uk.co.wilson.ng.runtime.metaclass.BaseStaticMethodProxy#doApplyQuick(ng.runtime.threadcontext.ThreadContext, java.math.BigDecimal)
   */
  @Override
  public Object doApplyQuick(final ThreadContext tc, final BigDecimal p1) {
    return doApplyQuick(tc, tc.convert().asDouble(p1));
  }
}