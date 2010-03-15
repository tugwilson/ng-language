package ng.runtime.metaclass.primitives.intimpl;

import java.math.BigDecimal;
import java.math.BigInteger;

import ng.runtime.metaclass.BinaryOperation;
import ng.runtime.metaclass.MetaClass;
import ng.runtime.threadcontext.ExtendedThreadContext;
import ng.runtime.threadcontext.NotPerformed;

/*
 * Created on 14 Feb 2008
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

/**
 * @author John
 * 
 */
public interface IntBinaryComparison extends BinaryOperation {
  int doIntApply(ExtendedThreadContext tc, Object lhs, Object rhs) throws NotPerformed;

  int doIntApply(ExtendedThreadContext tc, Object lhs, MetaClass rhsMetaClass, Object rhs) throws NotPerformed;

  int doReverseIntApply(ExtendedThreadContext tc, Object lhs, Object rhs) throws NotPerformed;

  int doIntApply(ExtendedThreadContext tc, Object lhs, char rhs) throws NotPerformed;

  int doIntApply(ExtendedThreadContext tc, Object lhs, byte rhs) throws NotPerformed;

  int doIntApply(ExtendedThreadContext tc, Object lhs, short rhs) throws NotPerformed;

  int doIntApply(ExtendedThreadContext tc, Object lhs, int rhs) throws NotPerformed;

  int doIntApply(ExtendedThreadContext tc, Object lhs, long rhs) throws NotPerformed;

  int doIntApply(ExtendedThreadContext tc, Object lhs, float rhs) throws NotPerformed;

  int doIntApply(ExtendedThreadContext tc, Object lhs, double rhs) throws NotPerformed;

  int doIntApply(ExtendedThreadContext tc, Object lhs, BigInteger rhs) throws NotPerformed;

  int doIntApply(ExtendedThreadContext tc, Object lhs, BigDecimal rhs) throws NotPerformed;

  int doIntApply(ExtendedThreadContext tc, char lhs, Object rhs) throws NotPerformed;

  int doIntApply(ExtendedThreadContext tc, byte lhs, Object rhs) throws NotPerformed;

  int doIntApply(ExtendedThreadContext tc, short lhs, Object rhs) throws NotPerformed;

  int doIntApply(ExtendedThreadContext tc, int lhs, Object rhs) throws NotPerformed;

  int doIntApply(ExtendedThreadContext tc, long lhs, Object rhs) throws NotPerformed;

  int doIntApply(ExtendedThreadContext tc, float lhs, Object rhs) throws NotPerformed;

  int doIntApply(ExtendedThreadContext tc, double lhs, Object rhs) throws NotPerformed;

  int doIntApply(ExtendedThreadContext tc, BigInteger lhs, Object rhs) throws NotPerformed;

  int doIntApply(ExtendedThreadContext tc, BigDecimal lhs, Object rhs) throws NotPerformed;
}
