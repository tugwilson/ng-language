package uk.co.wilson.ng.runtime.metaclass;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.math.BigDecimal;
import java.math.BigInteger;

import uk.co.wilson.ng.runtime.threadcontext.ExtendedThreadContext;

import ng.lang.NgRuntimeException;

/**
 * @author John
 *
 */
public class OneByteParameterSingletonStaticMethodProxy extends OneParameterSingletonStaticMethodProxy {
  /**
   * @param method
   */
  public OneByteParameterSingletonStaticMethodProxy(final Method method) {
    super(method);
  }

  /* (non-JavaDoc)
   * @see uk.co.wilson.ng.runtime.metaclass.BaseStaticMethodProxy#doApplyQuick(ng.runtime.threadcontext.ThreadContext, java.lang.Object)
   */
  @Override
  public Object doApplyQuick(final ExtendedThreadContext tc, final Object p1) {
    return doApplyQuick(tc, tc.convert().asByte(p1));
  }

  /* (non-JavaDoc)
   * @see uk.co.wilson.ng.runtime.metaclass.BaseStaticMethodProxy#doApplyQuick(ng.runtime.threadcontext.ThreadContext, char)
   */
  @Override
  public Object doApplyQuick(final ExtendedThreadContext tc, final char p1) {
    return doApplyQuick(tc, (byte)p1);
  }

  /* (non-JavaDoc)
   * @see uk.co.wilson.ng.runtime.metaclass.BaseStaticMethodProxy#doApplyQuick(ng.runtime.threadcontext.ThreadContext, byte)
   */
  @Override
  public Object doApplyQuick(final ExtendedThreadContext tc, final byte p1) {
    if (this.modifiedProxy == null) {
      try {
        return wrapReturnValue(tc, this.method.invoke(null, tc.prepareParameters(Byte.valueOf(p1))));
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
   * @see uk.co.wilson.ng.runtime.metaclass.BaseStaticMethodProxy#doApplyQuick(ng.runtime.threadcontext.ThreadContext, short)
   */
  @Override
  public Object doApplyQuick(final ExtendedThreadContext tc, final short p1) {
    return doApplyQuick(tc, tc.convert().asByte(p1));
  }

  /* (non-JavaDoc)
   * @see uk.co.wilson.ng.runtime.metaclass.BaseStaticMethodProxy#doApplyQuick(ng.runtime.threadcontext.ThreadContext, int)
   */
  @Override
  public Object doApplyQuick(final ExtendedThreadContext tc, final int p1) {
    return doApplyQuick(tc, tc.convert().asByte(p1));
  }

  /* (non-JavaDoc)
   * @see uk.co.wilson.ng.runtime.metaclass.BaseStaticMethodProxy#doApplyQuick(ng.runtime.threadcontext.ThreadContext, long)
   */
  @Override
  public Object doApplyQuick(final ExtendedThreadContext tc, final long p1) {
    return doApplyQuick(tc, tc.convert().asByte(p1));
  }

  /* (non-JavaDoc)
   * @see uk.co.wilson.ng.runtime.metaclass.BaseStaticMethodProxy#doApplyQuick(ng.runtime.threadcontext.ThreadContext, float)
   */
  @Override
  public Object doApplyQuick(final ExtendedThreadContext tc, final float p1) {
    return doApplyQuick(tc, tc.convert().asByte(p1));
  }

  /* (non-JavaDoc)
   * @see uk.co.wilson.ng.runtime.metaclass.BaseStaticMethodProxy#doApplyQuick(ng.runtime.threadcontext.ThreadContext, double)
   */
  @Override
  public Object doApplyQuick(final ExtendedThreadContext tc, final double p1) {
    return doApplyQuick(tc, tc.convert().asByte(p1));
  }

  /* (non-JavaDoc)
   * @see uk.co.wilson.ng.runtime.metaclass.BaseStaticMethodProxy#doApplyQuick(ng.runtime.threadcontext.ThreadContext, java.math.BigInteger)
   */
  @Override
  public Object doApplyQuick(final ExtendedThreadContext tc, final BigInteger p1) {
    return doApplyQuick(tc, tc.convert().asByte(p1));
  }

  /* (non-JavaDoc)
   * @see uk.co.wilson.ng.runtime.metaclass.BaseStaticMethodProxy#doApplyQuick(ng.runtime.threadcontext.ThreadContext, java.math.BigDecimal)
   */
  @Override
  public Object doApplyQuick(final ExtendedThreadContext tc, final BigDecimal p1) {
    return doApplyQuick(tc, tc.convert().asByte(p1));
  }
}
