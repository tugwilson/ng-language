package uk.co.wilson.ng.runtime.metaclass.primitives.charimpl;

import java.math.BigDecimal;
import java.math.BigInteger;

import ng.runtime.metaclass.Conversion;
import ng.runtime.threadcontext.NotPerformed;
import ng.runtime.threadcontext.ExtendedThreadContext;

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
  boolean doAsBoolean(ExtendedThreadContext tc, char value) throws NotPerformed;

  byte doAsByte(ExtendedThreadContext tc, char value) throws NotPerformed;

  short doAsShort(ExtendedThreadContext tc, char value) throws NotPerformed;

  int doAsInt(ExtendedThreadContext tc, char value) throws NotPerformed;

  long doAsLong(ExtendedThreadContext tc, char value) throws NotPerformed;

  float doAsFloat(ExtendedThreadContext tc, char value) throws NotPerformed;

  double doAsDouble(ExtendedThreadContext tc, char value) throws NotPerformed;

  BigInteger doAsBigInteger(ExtendedThreadContext tc, char value) throws NotPerformed;

  BigDecimal doAsBigDecimal(ExtendedThreadContext tc, char value) throws NotPerformed;

  String doAsString(ExtendedThreadContext tc, char value) throws NotPerformed;
}
