package uk.co.wilson.ng.runtime.metaclass;

import java.math.BigDecimal;
import java.math.BigInteger;

import ng.runtime.metaclass.LogicalBinaryOperation;
import ng.runtime.metaclass.MetaClass;
import ng.runtime.threadcontext.ExtendedThreadContext;


/*
 * Created on 27 Feb 2008
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
public class BinaryLogicalOperationNoopImpl implements LogicalBinaryOperation {
  public static final LogicalBinaryOperation instance = new BinaryLogicalOperationNoopImpl();

  /* (non-JavaDoc)
   * @see ng.runtime.metaclass.BinaryOperation#doApply(ng.runtime.threadcontext.ExtendedThreadContext, java.math.BigDecimal, java.lang.Object)
   */
  public Object doApply(ExtendedThreadContext tc, BigDecimal lhs, Object rhs) {
    return ExtendedThreadContext.NOT_PERFORMED;
  }

  /* (non-JavaDoc)
   * @see ng.runtime.metaclass.BinaryOperation#doApply(ng.runtime.threadcontext.ExtendedThreadContext, java.math.BigInteger, java.lang.Object)
   */
  public Object doApply(ExtendedThreadContext tc, BigInteger lhs, Object rhs) {
    return ExtendedThreadContext.NOT_PERFORMED;
  }

  /* (non-JavaDoc)
   * @see ng.runtime.metaclass.BinaryOperation#doApply(ng.runtime.threadcontext.ExtendedThreadContext, byte, java.lang.Object)
   */
  public Object doApply(ExtendedThreadContext tc, byte lhs, Object rhs) {
    return ExtendedThreadContext.NOT_PERFORMED;
  }

  /* (non-JavaDoc)
   * @see ng.runtime.metaclass.BinaryOperation#doApply(ng.runtime.threadcontext.ExtendedThreadContext, char, java.lang.Object)
   */
  public Object doApply(ExtendedThreadContext tc, char lhs, Object rhs) {
    return ExtendedThreadContext.NOT_PERFORMED;
  }

  /* (non-JavaDoc)
   * @see ng.runtime.metaclass.BinaryOperation#doApply(ng.runtime.threadcontext.ExtendedThreadContext, double, java.lang.Object)
   */
  public Object doApply(ExtendedThreadContext tc, double lhs, Object rhs) {
    return ExtendedThreadContext.NOT_PERFORMED;
  }

  /* (non-JavaDoc)
   * @see ng.runtime.metaclass.BinaryOperation#doApply(ng.runtime.threadcontext.ExtendedThreadContext, float, java.lang.Object)
   */
  public Object doApply(ExtendedThreadContext tc, float lhs, Object rhs) {
    return ExtendedThreadContext.NOT_PERFORMED;
  }

  /* (non-JavaDoc)
   * @see ng.runtime.metaclass.BinaryOperation#doApply(ng.runtime.threadcontext.ExtendedThreadContext, int, java.lang.Object)
   */
  public Object doApply(ExtendedThreadContext tc, int lhs, Object rhs) {
    return ExtendedThreadContext.NOT_PERFORMED;
  }

  /* (non-JavaDoc)
   * @see ng.runtime.metaclass.BinaryOperation#doApply(ng.runtime.threadcontext.ExtendedThreadContext, long, java.lang.Object)
   */
  public Object doApply(ExtendedThreadContext tc, long lhs, Object rhs) {
    return ExtendedThreadContext.NOT_PERFORMED;
  }

  /* (non-JavaDoc)
   * @see ng.runtime.metaclass.BinaryOperation#doApply(ng.runtime.threadcontext.ExtendedThreadContext, java.lang.Object, java.math.BigDecimal)
   */
  public Object doApply(ExtendedThreadContext tc, Object lhs, BigDecimal rhs) {
    return ExtendedThreadContext.NOT_PERFORMED;
  }

  /* (non-JavaDoc)
   * @see ng.runtime.metaclass.BinaryOperation#doApply(ng.runtime.threadcontext.ExtendedThreadContext, java.lang.Object, java.math.BigInteger)
   */
  public Object doApply(ExtendedThreadContext tc, Object lhs, BigInteger rhs) {
    return ExtendedThreadContext.NOT_PERFORMED;
  }

  /* (non-JavaDoc)
   * @see ng.runtime.metaclass.BinaryOperation#doApply(ng.runtime.threadcontext.ExtendedThreadContext, java.lang.Object, byte)
   */
  public Object doApply(ExtendedThreadContext tc, Object lhs, byte rhs) {
    return ExtendedThreadContext.NOT_PERFORMED;
  }

  /* (non-JavaDoc)
   * @see ng.runtime.metaclass.BinaryOperation#doApply(ng.runtime.threadcontext.ExtendedThreadContext, java.lang.Object, char)
   */
  public Object doApply(ExtendedThreadContext tc, Object lhs, char rhs) {
    return ExtendedThreadContext.NOT_PERFORMED;
  }

  /* (non-JavaDoc)
   * @see ng.runtime.metaclass.BinaryOperation#doApply(ng.runtime.threadcontext.ExtendedThreadContext, java.lang.Object, double)
   */
  public Object doApply(ExtendedThreadContext tc, Object lhs, double rhs) {
    return ExtendedThreadContext.NOT_PERFORMED;
  }

  /* (non-JavaDoc)
   * @see ng.runtime.metaclass.BinaryOperation#doApply(ng.runtime.threadcontext.ExtendedThreadContext, java.lang.Object, float)
   */
  public Object doApply(ExtendedThreadContext tc, Object lhs, float rhs) {
    return ExtendedThreadContext.NOT_PERFORMED;
  }

  /* (non-JavaDoc)
   * @see ng.runtime.metaclass.BinaryOperation#doApply(ng.runtime.threadcontext.ExtendedThreadContext, java.lang.Object, int)
   */
  public Object doApply(ExtendedThreadContext tc, Object lhs, int rhs) {
    return ExtendedThreadContext.NOT_PERFORMED;
  }

  /* (non-JavaDoc)
   * @see ng.runtime.metaclass.BinaryOperation#doApply(ng.runtime.threadcontext.ExtendedThreadContext, java.lang.Object, long)
   */
  public Object doApply(ExtendedThreadContext tc, Object lhs, long rhs) {
    return ExtendedThreadContext.NOT_PERFORMED;
  }

  /* (non-JavaDoc)
   * @see ng.runtime.metaclass.BinaryOperation#doApply(ng.runtime.threadcontext.ExtendedThreadContext, java.lang.Object, ng.runtime.metaclass.MetaClass, java.lang.Object)
   */
  public Object doApply(ExtendedThreadContext tc, Object lhs, MetaClass rhsMetaClass, Object rhs) {
    return ExtendedThreadContext.NOT_PERFORMED;
  }

  /* (non-JavaDoc)
   * @see ng.runtime.metaclass.BinaryOperation#doApply(ng.runtime.threadcontext.ExtendedThreadContext, java.lang.Object, java.lang.Object)
   */
  public Object doApply(ExtendedThreadContext tc, Object lhs, Object rhs) {
    return ExtendedThreadContext.NOT_PERFORMED;
  }

  /* (non-JavaDoc)
   * @see ng.runtime.metaclass.BinaryOperation#doApply(ng.runtime.threadcontext.ExtendedThreadContext, java.lang.Object, short)
   */
  public Object doApply(ExtendedThreadContext tc, Object lhs, short rhs) {
    return ExtendedThreadContext.NOT_PERFORMED;
  }

  /* (non-JavaDoc)
   * @see ng.runtime.metaclass.BinaryOperation#doApply(ng.runtime.threadcontext.ExtendedThreadContext, short, java.lang.Object)
   */
  public Object doApply(ExtendedThreadContext tc, short lhs, Object rhs) {
    return ExtendedThreadContext.NOT_PERFORMED;
  }

  /* (non-JavaDoc)
   * @see ng.runtime.metaclass.BinaryOperation#doReverseApply(ng.runtime.threadcontext.ExtendedThreadContext, java.lang.Object, java.lang.Object)
   */
  public Object doReverseApply(ExtendedThreadContext tc, Object lhs, Object rhs) {
    return ExtendedThreadContext.NOT_PERFORMED;
  }
}
