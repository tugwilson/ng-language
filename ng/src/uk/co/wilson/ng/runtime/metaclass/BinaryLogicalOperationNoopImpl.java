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
  public Object doApply(final ExtendedThreadContext tc, final BigDecimal lhs, final Object rhs) {
    return ExtendedThreadContext.NOT_PERFORMED;
  }

  /* (non-JavaDoc)
   * @see ng.runtime.metaclass.BinaryOperation#doApply(ng.runtime.threadcontext.ExtendedThreadContext, java.math.BigInteger, java.lang.Object)
   */
  public Object doApply(final ExtendedThreadContext tc, final BigInteger lhs, final Object rhs) {
    return ExtendedThreadContext.NOT_PERFORMED;
  }

  /* (non-JavaDoc)
   * @see ng.runtime.metaclass.BinaryOperation#doApply(ng.runtime.threadcontext.ExtendedThreadContext, byte, java.lang.Object)
   */
  public Object doApply(final ExtendedThreadContext tc, final byte lhs, final Object rhs) {
    return ExtendedThreadContext.NOT_PERFORMED;
  }

  /* (non-JavaDoc)
   * @see ng.runtime.metaclass.BinaryOperation#doApply(ng.runtime.threadcontext.ExtendedThreadContext, char, java.lang.Object)
   */
  public Object doApply(final ExtendedThreadContext tc, final char lhs, final Object rhs) {
    return ExtendedThreadContext.NOT_PERFORMED;
  }

  /* (non-JavaDoc)
   * @see ng.runtime.metaclass.BinaryOperation#doApply(ng.runtime.threadcontext.ExtendedThreadContext, double, java.lang.Object)
   */
  public Object doApply(final ExtendedThreadContext tc, final double lhs, final Object rhs) {
    return ExtendedThreadContext.NOT_PERFORMED;
  }

  /* (non-JavaDoc)
   * @see ng.runtime.metaclass.BinaryOperation#doApply(ng.runtime.threadcontext.ExtendedThreadContext, float, java.lang.Object)
   */
  public Object doApply(final ExtendedThreadContext tc, final float lhs, final Object rhs) {
    return ExtendedThreadContext.NOT_PERFORMED;
  }

  /* (non-JavaDoc)
   * @see ng.runtime.metaclass.BinaryOperation#doApply(ng.runtime.threadcontext.ExtendedThreadContext, int, java.lang.Object)
   */
  public Object doApply(final ExtendedThreadContext tc, final int lhs, final Object rhs) {
    return ExtendedThreadContext.NOT_PERFORMED;
  }

  /* (non-JavaDoc)
   * @see ng.runtime.metaclass.BinaryOperation#doApply(ng.runtime.threadcontext.ExtendedThreadContext, long, java.lang.Object)
   */
  public Object doApply(final ExtendedThreadContext tc, final long lhs, final Object rhs) {
    return ExtendedThreadContext.NOT_PERFORMED;
  }

  /* (non-JavaDoc)
   * @see ng.runtime.metaclass.BinaryOperation#doApply(ng.runtime.threadcontext.ExtendedThreadContext, java.lang.Object, java.math.BigDecimal)
   */
  public Object doApply(final ExtendedThreadContext tc, final Object lhs, final BigDecimal rhs) {
    return ExtendedThreadContext.NOT_PERFORMED;
  }

  /* (non-JavaDoc)
   * @see ng.runtime.metaclass.BinaryOperation#doApply(ng.runtime.threadcontext.ExtendedThreadContext, java.lang.Object, java.math.BigInteger)
   */
  public Object doApply(final ExtendedThreadContext tc, final Object lhs, final BigInteger rhs) {
    return ExtendedThreadContext.NOT_PERFORMED;
  }

  /* (non-JavaDoc)
   * @see ng.runtime.metaclass.BinaryOperation#doApply(ng.runtime.threadcontext.ExtendedThreadContext, java.lang.Object, byte)
   */
  public Object doApply(final ExtendedThreadContext tc, final Object lhs, final byte rhs) {
    return ExtendedThreadContext.NOT_PERFORMED;
  }

  /* (non-JavaDoc)
   * @see ng.runtime.metaclass.BinaryOperation#doApply(ng.runtime.threadcontext.ExtendedThreadContext, java.lang.Object, char)
   */
  public Object doApply(final ExtendedThreadContext tc, final Object lhs, final char rhs) {
    return ExtendedThreadContext.NOT_PERFORMED;
  }

  /* (non-JavaDoc)
   * @see ng.runtime.metaclass.BinaryOperation#doApply(ng.runtime.threadcontext.ExtendedThreadContext, java.lang.Object, double)
   */
  public Object doApply(final ExtendedThreadContext tc, final Object lhs, final double rhs) {
    return ExtendedThreadContext.NOT_PERFORMED;
  }

  /* (non-JavaDoc)
   * @see ng.runtime.metaclass.BinaryOperation#doApply(ng.runtime.threadcontext.ExtendedThreadContext, java.lang.Object, float)
   */
  public Object doApply(final ExtendedThreadContext tc, final Object lhs, final float rhs) {
    return ExtendedThreadContext.NOT_PERFORMED;
  }

  /* (non-JavaDoc)
   * @see ng.runtime.metaclass.BinaryOperation#doApply(ng.runtime.threadcontext.ExtendedThreadContext, java.lang.Object, int)
   */
  public Object doApply(final ExtendedThreadContext tc, final Object lhs, final int rhs) {
    return ExtendedThreadContext.NOT_PERFORMED;
  }

  /* (non-JavaDoc)
   * @see ng.runtime.metaclass.BinaryOperation#doApply(ng.runtime.threadcontext.ExtendedThreadContext, java.lang.Object, long)
   */
  public Object doApply(final ExtendedThreadContext tc, final Object lhs, final long rhs) {
    return ExtendedThreadContext.NOT_PERFORMED;
  }

  /* (non-JavaDoc)
   * @see ng.runtime.metaclass.BinaryOperation#doApply(ng.runtime.threadcontext.ExtendedThreadContext, java.lang.Object, ng.runtime.metaclass.MetaClass, java.lang.Object)
   */
  public Object doApply(final ExtendedThreadContext tc, final Object lhs, final MetaClass rhsMetaClass, final Object rhs) {
    return ExtendedThreadContext.NOT_PERFORMED;
  }

  /* (non-JavaDoc)
   * @see ng.runtime.metaclass.BinaryOperation#doApply(ng.runtime.threadcontext.ExtendedThreadContext, java.lang.Object, java.lang.Object)
   */
  public Object doApply(final ExtendedThreadContext tc, final Object lhs, final Object rhs) {
    return ExtendedThreadContext.NOT_PERFORMED;
  }

  /* (non-JavaDoc)
   * @see ng.runtime.metaclass.BinaryOperation#doApply(ng.runtime.threadcontext.ExtendedThreadContext, java.lang.Object, short)
   */
  public Object doApply(final ExtendedThreadContext tc, final Object lhs, final short rhs) {
    return ExtendedThreadContext.NOT_PERFORMED;
  }

  /* (non-JavaDoc)
   * @see ng.runtime.metaclass.BinaryOperation#doApply(ng.runtime.threadcontext.ExtendedThreadContext, short, java.lang.Object)
   */
  public Object doApply(final ExtendedThreadContext tc, final short lhs, final Object rhs) {
    return ExtendedThreadContext.NOT_PERFORMED;
  }

  /* (non-JavaDoc)
   * @see ng.runtime.metaclass.BinaryOperation#doReverseApply(ng.runtime.threadcontext.ExtendedThreadContext, java.lang.Object, java.lang.Object)
   */
  public Object doReverseApply(final ExtendedThreadContext tc, final Object lhs, final Object rhs) {
    return ExtendedThreadContext.NOT_PERFORMED;
  }
}
