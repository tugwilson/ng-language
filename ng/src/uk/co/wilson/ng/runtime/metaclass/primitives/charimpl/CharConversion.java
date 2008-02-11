package uk.co.wilson.ng.runtime.metaclass.primitives.charimpl;

import java.math.BigDecimal;
import java.math.BigInteger;

import ng.runtime.metaclass.Conversion;
import ng.runtime.threadcontext.NotPerformed;
import ng.runtime.threadcontext.ThreadContext;

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

/**
 * @author John
 *
 */
public interface CharConversion extends Conversion {
  boolean doAsBoolean(ThreadContext tc, char value) throws NotPerformed;

  byte doAsByte(ThreadContext tc, char value) throws NotPerformed;

  short doAsShort(ThreadContext tc, char value) throws NotPerformed;

  int doAsInt(ThreadContext tc, char value) throws NotPerformed;

  long doAsLong(ThreadContext tc, char value) throws NotPerformed;

  float doAsFloat(ThreadContext tc, char value) throws NotPerformed;

  double doAsDouble(ThreadContext tc, char value) throws NotPerformed;

  BigInteger doAsBigInteger(ThreadContext tc, char value) throws NotPerformed;

  BigDecimal doAsBigDecimal(ThreadContext tc, char value) throws NotPerformed;

  String doAsString(ThreadContext tc, char value) throws NotPerformed;
}
