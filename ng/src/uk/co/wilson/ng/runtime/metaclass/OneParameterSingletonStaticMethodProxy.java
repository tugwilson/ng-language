package uk.co.wilson.ng.runtime.metaclass;

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

import ng.runtime.threadcontext.ThreadContext;

/**
 * @author John
 *
 */
public class OneParameterSingletonStaticMethodProxy extends BaseSingletonStaticMethod {
  /**
   * @param method
   */
  public OneParameterSingletonStaticMethodProxy(Method method) {
    super(method);
  }

  /* (non-JavaDoc)
   * @see uk.co.wilson.ng.runtime.metaclass.BaseStaticMethodProxy#doApply(ng.runtime.threadcontext.ThreadContext, java.lang.Object[])
   */
  @Override
  public Object doApply(ThreadContext tc, Object[] params) {
    if (params.length == 1) {
      return doApplyQuick(tc, params[1]);
    } else {
      return ThreadContext.NOT_PERFORMED;
    }
  }
}
