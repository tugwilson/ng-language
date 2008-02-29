package ng.runtime.metaclass.primitives.longimpl;

import java.math.BigInteger;

import ng.runtime.metaclass.BinaryOperation;
import ng.runtime.threadcontext.ExtendedThreadContext;
import ng.runtime.threadcontext.NotPerformed;

/*
 * Created on 26 Feb 2008
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
public interface LongBinaryLogicalOperation extends BinaryOperation, LongBinaryOperation {
  long doLongApply(ExtendedThreadContext tc, long lhs, char rhs) throws NotPerformed;
  long doLongApply(ExtendedThreadContext tc, long lhs, byte rhs) throws NotPerformed;
  long doLongApply(ExtendedThreadContext tc, long lhs, short rhs) throws NotPerformed;
  long doLongApply(ExtendedThreadContext tc, long lhs, int rhs) throws NotPerformed;
  long doLongApply(ExtendedThreadContext tc, long lhs, long rhs) throws NotPerformed;
  BigInteger doBigIntegerApply(ExtendedThreadContext tc, long lhs, BigInteger rhs) throws NotPerformed;
}