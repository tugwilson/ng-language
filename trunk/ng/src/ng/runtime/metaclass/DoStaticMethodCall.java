package ng.runtime.metaclass;

import java.math.BigDecimal;
import java.math.BigInteger;
/*
 * Created on 23 Jan 2008
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
public interface DoStaticMethodCall {
  Object doApply(ThreadContext tc, String name, Object params[]);
  
  Object doApplyQuick(ThreadContext tc, String name);
  Object doApplyQuick(ThreadContext tc, String name, Object p1);
  Object doApplyQuick(ThreadContext tc, String name, Object p1, Object p2);
  Object doApplyQuick(ThreadContext tc, String name, Object p1, Object p2, Object p3);
  Object doApplyQuick(ThreadContext tc, String name, Object p1, Object p2, Object p3, Object p4);
  
  Object doApplyQuick(ThreadContext tc, String name, boolean p1);  
  Object doApplyQuick(ThreadContext tc, String name, char p1);  
  Object doApplyQuick(ThreadContext tc, String name, byte p1);  
  Object doApplyQuick(ThreadContext tc, String name, short p1);  
  Object doApplyQuick(ThreadContext tc, String name, int p1);  
  Object doApplyQuick(ThreadContext tc, String name, long p1);  
  Object doApplyQuick(ThreadContext tc, String name, float p1);  
  Object doApplyQuick(ThreadContext tc, String name, double p1);  
  Object doApplyQuick(ThreadContext tc, String name, BigInteger p1);  
  Object doApplyQuick(ThreadContext tc, String name, BigDecimal p1);  
  Object doApplyQuick(ThreadContext tc, String name, String p1);  
}
