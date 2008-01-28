package uk.co.wilson.ng.runtime.metaclass;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
/*
 * Created on 28 Jan 2008
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
import java.math.BigDecimal;
import java.math.BigInteger;

import ng.lang.NgRuntimeException;
import ng.runtime.threadcontext.ThreadContext;

/**
 * @author John
 *
 */
public class OneByteParameterSingletonStaticMethodProxy extends OneParameterSingletonStaticMethodProxy {
  /**
   * @param method
   */
  public OneByteParameterSingletonStaticMethodProxy(Method method) {
    super(method);
  }

  /* (non-JavaDoc)
   * @see uk.co.wilson.ng.runtime.metaclass.BaseStaticMethodProxy#doApplyQuick(ng.runtime.threadcontext.ThreadContext, java.lang.Object)
   */
  @Override
  public Object doApplyQuick(ThreadContext tc, Object p1) {
    return doApplyQuick(tc, tc.convert().asByte(p1));
  }

  /* (non-JavaDoc)
   * @see uk.co.wilson.ng.runtime.metaclass.BaseStaticMethodProxy#doApplyQuick(ng.runtime.threadcontext.ThreadContext, char)
   */
  @Override
  public Object doApplyQuick(ThreadContext tc, char p1) {
    return doApplyQuick(tc, (byte)p1);
  }

  /* (non-JavaDoc)
   * @see uk.co.wilson.ng.runtime.metaclass.BaseStaticMethodProxy#doApplyQuick(ng.runtime.threadcontext.ThreadContext, byte)
   */
  @Override
  public Object doApplyQuick(ThreadContext tc, byte p1) {
    if (this.modifiedProxy == null) {
      try {
        return wrapReturnValue(tc, this.method.invoke(null, new Object[]{Byte.valueOf(p1)}));
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
  public Object doApplyQuick(ThreadContext tc, short p1) {
    return doApplyQuick(tc, (byte)p1);
  }

  /* (non-JavaDoc)
   * @see uk.co.wilson.ng.runtime.metaclass.BaseStaticMethodProxy#doApplyQuick(ng.runtime.threadcontext.ThreadContext, int)
   */
  @Override
  public Object doApplyQuick(ThreadContext tc, int p1) {
    return doApplyQuick(tc, (byte)p1);
  }

  /* (non-JavaDoc)
   * @see uk.co.wilson.ng.runtime.metaclass.BaseStaticMethodProxy#doApplyQuick(ng.runtime.threadcontext.ThreadContext, long)
   */
  @Override
  public Object doApplyQuick(ThreadContext tc, long p1) {
    return doApplyQuick(tc, (byte)p1);
  }

  /* (non-JavaDoc)
   * @see uk.co.wilson.ng.runtime.metaclass.BaseStaticMethodProxy#doApplyQuick(ng.runtime.threadcontext.ThreadContext, float)
   */
  @Override
  public Object doApplyQuick(ThreadContext tc, float p1) {
    return doApplyQuick(tc, (byte)p1);
  }

  /* (non-JavaDoc)
   * @see uk.co.wilson.ng.runtime.metaclass.BaseStaticMethodProxy#doApplyQuick(ng.runtime.threadcontext.ThreadContext, double)
   */
  @Override
  public Object doApplyQuick(ThreadContext tc, double p1) {
    return doApplyQuick(tc, (byte)p1);
  }

  /* (non-JavaDoc)
   * @see uk.co.wilson.ng.runtime.metaclass.BaseStaticMethodProxy#doApplyQuick(ng.runtime.threadcontext.ThreadContext, java.math.BigInteger)
   */
  @Override
  public Object doApplyQuick(ThreadContext tc, BigInteger p1) {
    return doApplyQuick(tc, p1.byteValue());
  }
  
  /* (non-JavaDoc)
   * @see uk.co.wilson.ng.runtime.metaclass.BaseStaticMethodProxy#doApplyQuick(ng.runtime.threadcontext.ThreadContext, java.math.BigDecimal)
   */
  @Override
  public Object doApplyQuick(ThreadContext tc, BigDecimal p1) {
    return doApplyQuick(tc, p1.byteValue());
  }
}
