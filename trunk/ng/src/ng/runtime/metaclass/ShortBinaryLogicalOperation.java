package ng.runtime.metaclass;

import java.math.BigInteger;

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
public interface ShortBinaryLogicalOperation  extends BinaryOperation, ShortBinaryOperation {
  int doIntApply(ExtendedThreadContext tc, short lhs, char rhs) throws NotPerformed;
  int doIntApply(ExtendedThreadContext tc, short lhs, byte rhs) throws NotPerformed;
  int doIntApply(ExtendedThreadContext tc, short lhs, short rhs) throws NotPerformed;
  int doIntApply(ExtendedThreadContext tc, short lhs, int rhs) throws NotPerformed;
  long doLongApply(ExtendedThreadContext tc, short lhs, long rhs) throws NotPerformed;
  BigInteger doBigIntegerApply(ExtendedThreadContext tc, short lhs, BigInteger rhs) throws NotPerformed;
}