package uk.co.wilson.ng.runtime.metaclass;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
/*
 * Created on 25 Jan 2008
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
  
  //
  // TODO: deal with the other types checking for a closer match in the interfaces and superclass
  //       and call this method if we don't get one
  //
  
  /* (non-JavaDoc)
   * @see uk.co.wilson.ng.runtime.metaclass.BaseStaticMethodProxy#doApplyQuick(ng.runtime.threadcontext.ThreadContext, double)
   */
  @Override
  public Object doApplyQuick(ThreadContext tc, double p1) {
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
}
