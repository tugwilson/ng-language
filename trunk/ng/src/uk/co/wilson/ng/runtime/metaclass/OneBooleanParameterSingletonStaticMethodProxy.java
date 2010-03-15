package uk.co.wilson.ng.runtime.metaclass;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.math.BigDecimal;
import java.math.BigInteger;

import ng.lang.NgRuntimeException;
import ng.runtime.threadcontext.ExtendedThreadContext;

/**
 * @author John
 * 
 */
public class OneBooleanParameterSingletonStaticMethodProxy extends OneParameterSingletonStaticMethodProxy {
  /**
   * @param method
   */
  public OneBooleanParameterSingletonStaticMethodProxy(final Method method) {
    super(method);
  }

  @Override
  public Object doStaticCallQuick(final ExtendedThreadContext tc, final boolean p1) throws Throwable {
    if (this.modifiedCallable == null) {
      try {
        return wrapReturnValue(tc, this.method.invoke(null, tc.prepareParameters(Boolean.valueOf(p1))));
      } catch (final IllegalArgumentException e) {
        throw new NgRuntimeException(e);
      } catch (final IllegalAccessException e) {
        throw new NgRuntimeException(e);
      } catch (final InvocationTargetException e) {
        throw e.getCause();
      }
    } else {
      return this.modifiedCallable.doStaticCallQuick(tc, p1);
    }
  }

  @Override
  public Object doStaticCallQuick(final ExtendedThreadContext tc, final Object p1) throws Throwable {
    return doStaticCallQuick(tc, tc.convert().asBoolean(p1));
  }

  @Override
  public Object doStaticCallQuick(final ExtendedThreadContext tc, final char p1) throws Throwable {
    return doStaticCallQuick(tc, tc.convert().asBoolean(p1));
  }

  @Override
  public Object doStaticCallQuick(final ExtendedThreadContext tc, final byte p1) throws Throwable {
    return doStaticCallQuick(tc, tc.convert().asBoolean(p1));
  }

  @Override
  public Object doStaticCallQuick(final ExtendedThreadContext tc, final short p1) throws Throwable {
    return doStaticCallQuick(tc, tc.convert().asBoolean(p1));
  }

  @Override
  public Object doStaticCallQuick(final ExtendedThreadContext tc, final int p1) throws Throwable {
    return doStaticCallQuick(tc, tc.convert().asBoolean(p1));
  }

  @Override
  public Object doStaticCallQuick(final ExtendedThreadContext tc, final long p1) throws Throwable {
    return doStaticCallQuick(tc, tc.convert().asBoolean(p1));
  }

  @Override
  public Object doStaticCallQuick(final ExtendedThreadContext tc, final float p1) throws Throwable {
    return doStaticCallQuick(tc, tc.convert().asBoolean(p1));
  }

  @Override
  public Object doStaticCallQuick(final ExtendedThreadContext tc, final double p1) throws Throwable {
    return doStaticCallQuick(tc, tc.convert().asBoolean(p1));
  }

  @Override
  public Object doStaticCallQuick(final ExtendedThreadContext tc, final BigInteger p1) throws Throwable {
    return doStaticCallQuick(tc, tc.convert().asBoolean(p1));
  }

  @Override
  public Object doStaticCallQuick(final ExtendedThreadContext tc, final BigDecimal p1) throws Throwable {
    return doStaticCallQuick(tc, tc.convert().asBoolean(p1));
  }
}
