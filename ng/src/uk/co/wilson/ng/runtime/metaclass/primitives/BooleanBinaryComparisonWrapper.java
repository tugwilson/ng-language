package uk.co.wilson.ng.runtime.metaclass.primitives;

import java.math.BigDecimal;
import java.math.BigInteger;

import ng.runtime.metaclass.BooleanBinaryComparison;
import ng.runtime.metaclass.MetaClass;
import ng.runtime.threadcontext.NotPerformed;
import ng.runtime.threadcontext.ThreadContext;
/*
 * Created on 10 Feb 2008
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
public abstract class BooleanBinaryComparisonWrapper implements BooleanBinaryComparison {
  private final BooleanBinaryComparison delegate;
  public BooleanBinaryComparisonWrapper(final BooleanBinaryComparison delegate) {
    this.delegate = delegate;
  }
  /**
   * @param tc
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.metaclass.BinaryArithmeticOperation#doApply(ng.runtime.threadcontext.ThreadContext, java.math.BigDecimal, java.lang.Object)
   */
  public Object doApply(ThreadContext tc, BigDecimal lhs, Object rhs) {
    return this.delegate.doApply(tc, lhs, rhs);
  }
  /**
   * @param tc
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.metaclass.BinaryArithmeticOperation#doApply(ng.runtime.threadcontext.ThreadContext, java.math.BigInteger, java.lang.Object)
   */
  public Object doApply(ThreadContext tc, BigInteger lhs, Object rhs) {
    return this.delegate.doApply(tc, lhs, rhs);
  }
  /**
   * @param tc
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.metaclass.BinaryArithmeticOperation#doApply(ng.runtime.threadcontext.ThreadContext, byte, java.lang.Object)
   */
  public Object doApply(ThreadContext tc, byte lhs, Object rhs) {
    return this.delegate.doApply(tc, lhs, rhs);
  }
  /**
   * @param tc
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.metaclass.BinaryArithmeticOperation#doApply(ng.runtime.threadcontext.ThreadContext, char, java.lang.Object)
   */
  public Object doApply(ThreadContext tc, char lhs, Object rhs) {
    return this.delegate.doApply(tc, lhs, rhs);
  }
  /**
   * @param tc
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.metaclass.BinaryArithmeticOperation#doApply(ng.runtime.threadcontext.ThreadContext, double, java.lang.Object)
   */
  public Object doApply(ThreadContext tc, double lhs, Object rhs) {
    return this.delegate.doApply(tc, lhs, rhs);
  }
  /**
   * @param tc
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.metaclass.BinaryArithmeticOperation#doApply(ng.runtime.threadcontext.ThreadContext, float, java.lang.Object)
   */
  public Object doApply(ThreadContext tc, float lhs, Object rhs) {
    return this.delegate.doApply(tc, lhs, rhs);
  }
  /**
   * @param tc
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.metaclass.BinaryArithmeticOperation#doApply(ng.runtime.threadcontext.ThreadContext, int, java.lang.Object)
   */
  public Object doApply(ThreadContext tc, int lhs, Object rhs) {
    return this.delegate.doApply(tc, lhs, rhs);
  }
  /**
   * @param tc
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.metaclass.BinaryArithmeticOperation#doApply(ng.runtime.threadcontext.ThreadContext, long, java.lang.Object)
   */
  public Object doApply(ThreadContext tc, long lhs, Object rhs) {
    return this.delegate.doApply(tc, lhs, rhs);
  }
  /**
   * @param tc
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.metaclass.BinaryArithmeticOperation#doApply(ng.runtime.threadcontext.ThreadContext, java.lang.Object, java.math.BigDecimal)
   */
  public Object doApply(ThreadContext tc, Object lhs, BigDecimal rhs) {
    return this.delegate.doApply(tc, lhs, rhs);
  }
  /**
   * @param tc
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.metaclass.BinaryArithmeticOperation#doApply(ng.runtime.threadcontext.ThreadContext, java.lang.Object, java.math.BigInteger)
   */
  public Object doApply(ThreadContext tc, Object lhs, BigInteger rhs) {
    return this.delegate.doApply(tc, lhs, rhs);
  }
  /**
   * @param tc
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.metaclass.BinaryArithmeticOperation#doApply(ng.runtime.threadcontext.ThreadContext, java.lang.Object, byte)
   */
  public Object doApply(ThreadContext tc, Object lhs, byte rhs) {
    return this.delegate.doApply(tc, lhs, rhs);
  }
  /**
   * @param tc
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.metaclass.BinaryArithmeticOperation#doApply(ng.runtime.threadcontext.ThreadContext, java.lang.Object, char)
   */
  public Object doApply(ThreadContext tc, Object lhs, char rhs) {
    return this.delegate.doApply(tc, lhs, rhs);
  }
  /**
   * @param tc
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.metaclass.BinaryArithmeticOperation#doApply(ng.runtime.threadcontext.ThreadContext, java.lang.Object, double)
   */
  public Object doApply(ThreadContext tc, Object lhs, double rhs) {
    return this.delegate.doApply(tc, lhs, rhs);
  }
  /**
   * @param tc
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.metaclass.BinaryArithmeticOperation#doApply(ng.runtime.threadcontext.ThreadContext, java.lang.Object, float)
   */
  public Object doApply(ThreadContext tc, Object lhs, float rhs) {
    return this.delegate.doApply(tc, lhs, rhs);
  }
  /**
   * @param tc
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.metaclass.BinaryArithmeticOperation#doApply(ng.runtime.threadcontext.ThreadContext, java.lang.Object, int)
   */
  public Object doApply(ThreadContext tc, Object lhs, int rhs) {
    return this.delegate.doApply(tc, lhs, rhs);
  }
  /**
   * @param tc
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.metaclass.BinaryArithmeticOperation#doApply(ng.runtime.threadcontext.ThreadContext, java.lang.Object, long)
   */
  public Object doApply(ThreadContext tc, Object lhs, long rhs) {
    return this.delegate.doApply(tc, lhs, rhs);
  }
  /**
   * @param tc
   * @param lhs
   * @param rhsMetaClass
   * @param rhs
   * @return
   * @see ng.runtime.metaclass.BinaryArithmeticOperation#doApply(ng.runtime.threadcontext.ThreadContext, java.lang.Object, ng.runtime.metaclass.MetaClass, java.lang.Object)
   */
  public Object doApply(ThreadContext tc, Object lhs, MetaClass rhsMetaClass, Object rhs) {
    return this.delegate.doApply(tc, lhs, rhsMetaClass, rhs);
  }
  /**
   * @param tc
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.metaclass.BinaryArithmeticOperation#doApply(ng.runtime.threadcontext.ThreadContext, java.lang.Object, java.lang.Object)
   */
  public Object doApply(ThreadContext tc, Object lhs, Object rhs) {
    return this.delegate.doApply(tc, lhs, rhs);
  }
  /**
   * @param tc
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.metaclass.BinaryArithmeticOperation#doApply(ng.runtime.threadcontext.ThreadContext, java.lang.Object, short)
   */
  public Object doApply(ThreadContext tc, Object lhs, short rhs) {
    return this.delegate.doApply(tc, lhs, rhs);
  }
  /**
   * @param tc
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.metaclass.BinaryArithmeticOperation#doApply(ng.runtime.threadcontext.ThreadContext, short, java.lang.Object)
   */
  public Object doApply(ThreadContext tc, short lhs, Object rhs) {
    return this.delegate.doApply(tc, lhs, rhs);
  }
  /**
   * @param tc
   * @param lhs
   * @param rhs
   * @return
   * @throws NotPerformed
   * @see ng.runtime.metaclass.BooleanBinaryComparison#doApplyBoolean(ng.runtime.threadcontext.ThreadContext, java.math.BigDecimal, java.lang.Object)
   */
  public boolean doApplyBoolean(ThreadContext tc, BigDecimal lhs, Object rhs) throws NotPerformed {
    return this.delegate.doApplyBoolean(tc, lhs, rhs);
  }
  /**
   * @param tc
   * @param lhs
   * @param rhs
   * @return
   * @throws NotPerformed
   * @see ng.runtime.metaclass.BooleanBinaryComparison#doApplyBoolean(ng.runtime.threadcontext.ThreadContext, java.math.BigInteger, java.lang.Object)
   */
  public boolean doApplyBoolean(ThreadContext tc, BigInteger lhs, Object rhs) throws NotPerformed {
    return this.delegate.doApplyBoolean(tc, lhs, rhs);
  }
  /**
   * @param tc
   * @param lhs
   * @param rhs
   * @return
   * @throws NotPerformed
   * @see ng.runtime.metaclass.BooleanBinaryComparison#doApplyBoolean(ng.runtime.threadcontext.ThreadContext, byte, java.lang.Object)
   */
  public boolean doApplyBoolean(ThreadContext tc, byte lhs, Object rhs) throws NotPerformed {
    return this.delegate.doApplyBoolean(tc, lhs, rhs);
  }
  /**
   * @param tc
   * @param lhs
   * @param rhs
   * @return
   * @throws NotPerformed
   * @see ng.runtime.metaclass.BooleanBinaryComparison#doApplyBoolean(ng.runtime.threadcontext.ThreadContext, char, java.lang.Object)
   */
  public boolean doApplyBoolean(ThreadContext tc, char lhs, Object rhs) throws NotPerformed {
    return this.delegate.doApplyBoolean(tc, lhs, rhs);
  }
  /**
   * @param tc
   * @param lhs
   * @param rhs
   * @return
   * @throws NotPerformed
   * @see ng.runtime.metaclass.BooleanBinaryComparison#doApplyBoolean(ng.runtime.threadcontext.ThreadContext, double, java.lang.Object)
   */
  public boolean doApplyBoolean(ThreadContext tc, double lhs, Object rhs) throws NotPerformed {
    return this.delegate.doApplyBoolean(tc, lhs, rhs);
  }
  /**
   * @param tc
   * @param lhs
   * @param rhs
   * @return
   * @throws NotPerformed
   * @see ng.runtime.metaclass.BooleanBinaryComparison#doApplyBoolean(ng.runtime.threadcontext.ThreadContext, float, java.lang.Object)
   */
  public boolean doApplyBoolean(ThreadContext tc, float lhs, Object rhs) throws NotPerformed {
    return this.delegate.doApplyBoolean(tc, lhs, rhs);
  }
  /**
   * @param tc
   * @param lhs
   * @param rhs
   * @return
   * @throws NotPerformed
   * @see ng.runtime.metaclass.BooleanBinaryComparison#doApplyBoolean(ng.runtime.threadcontext.ThreadContext, int, java.lang.Object)
   */
  public boolean doApplyBoolean(ThreadContext tc, int lhs, Object rhs) throws NotPerformed {
    return this.delegate.doApplyBoolean(tc, lhs, rhs);
  }
  /**
   * @param tc
   * @param lhs
   * @param rhs
   * @return
   * @throws NotPerformed
   * @see ng.runtime.metaclass.BooleanBinaryComparison#doApplyBoolean(ng.runtime.threadcontext.ThreadContext, long, java.lang.Object)
   */
  public boolean doApplyBoolean(ThreadContext tc, long lhs, Object rhs) throws NotPerformed {
    return this.delegate.doApplyBoolean(tc, lhs, rhs);
  }
  /**
   * @param tc
   * @param lhs
   * @param rhs
   * @return
   * @throws NotPerformed
   * @see ng.runtime.metaclass.BooleanBinaryComparison#doApplyBoolean(ng.runtime.threadcontext.ThreadContext, java.lang.Object, java.math.BigDecimal)
   */
  public boolean doApplyBoolean(ThreadContext tc, Object lhs, BigDecimal rhs) throws NotPerformed {
    return this.delegate.doApplyBoolean(tc, lhs, rhs);
  }
  /**
   * @param tc
   * @param lhs
   * @param rhs
   * @return
   * @throws NotPerformed
   * @see ng.runtime.metaclass.BooleanBinaryComparison#doApplyBoolean(ng.runtime.threadcontext.ThreadContext, java.lang.Object, java.math.BigInteger)
   */
  public boolean doApplyBoolean(ThreadContext tc, Object lhs, BigInteger rhs) throws NotPerformed {
    return this.delegate.doApplyBoolean(tc, lhs, rhs);
  }
  /**
   * @param tc
   * @param lhs
   * @param rhs
   * @return
   * @throws NotPerformed
   * @see ng.runtime.metaclass.BooleanBinaryComparison#doApplyBoolean(ng.runtime.threadcontext.ThreadContext, java.lang.Object, byte)
   */
  public boolean doApplyBoolean(ThreadContext tc, Object lhs, byte rhs) throws NotPerformed {
    return this.delegate.doApplyBoolean(tc, lhs, rhs);
  }
  /**
   * @param tc
   * @param lhs
   * @param rhs
   * @return
   * @throws NotPerformed
   * @see ng.runtime.metaclass.BooleanBinaryComparison#doApplyBoolean(ng.runtime.threadcontext.ThreadContext, java.lang.Object, char)
   */
  public boolean doApplyBoolean(ThreadContext tc, Object lhs, char rhs) throws NotPerformed {
    return this.delegate.doApplyBoolean(tc, lhs, rhs);
  }
  /**
   * @param tc
   * @param lhs
   * @param rhs
   * @return
   * @throws NotPerformed
   * @see ng.runtime.metaclass.BooleanBinaryComparison#doApplyBoolean(ng.runtime.threadcontext.ThreadContext, java.lang.Object, double)
   */
  public boolean doApplyBoolean(ThreadContext tc, Object lhs, double rhs) throws NotPerformed {
    return this.delegate.doApplyBoolean(tc, lhs, rhs);
  }
  /**
   * @param tc
   * @param lhs
   * @param rhs
   * @return
   * @throws NotPerformed
   * @see ng.runtime.metaclass.BooleanBinaryComparison#doApplyBoolean(ng.runtime.threadcontext.ThreadContext, java.lang.Object, float)
   */
  public boolean doApplyBoolean(ThreadContext tc, Object lhs, float rhs) throws NotPerformed {
    return this.delegate.doApplyBoolean(tc, lhs, rhs);
  }
  /**
   * @param tc
   * @param lhs
   * @param rhs
   * @return
   * @throws NotPerformed
   * @see ng.runtime.metaclass.BooleanBinaryComparison#doApplyBoolean(ng.runtime.threadcontext.ThreadContext, java.lang.Object, int)
   */
  public boolean doApplyBoolean(ThreadContext tc, Object lhs, int rhs) throws NotPerformed {
    return this.delegate.doApplyBoolean(tc, lhs, rhs);
  }
  /**
   * @param tc
   * @param lhs
   * @param rhs
   * @return
   * @throws NotPerformed
   * @see ng.runtime.metaclass.BooleanBinaryComparison#doApplyBoolean(ng.runtime.threadcontext.ThreadContext, java.lang.Object, long)
   */
  public boolean doApplyBoolean(ThreadContext tc, Object lhs, long rhs) throws NotPerformed {
    return this.delegate.doApplyBoolean(tc, lhs, rhs);
  }
  /**
   * @param tc
   * @param lhs
   * @param rhsMetaClass
   * @param rhs
   * @return
   * @throws NotPerformed
   * @see ng.runtime.metaclass.BooleanBinaryComparison#doApplyBoolean(ng.runtime.threadcontext.ThreadContext, java.lang.Object, ng.runtime.metaclass.MetaClass, java.lang.Object)
   */
  public boolean doApplyBoolean(ThreadContext tc, Object lhs, MetaClass rhsMetaClass, Object rhs) throws NotPerformed {
    return this.delegate.doApplyBoolean(tc, lhs, rhsMetaClass, rhs);
  }
  /**
   * @param tc
   * @param lhs
   * @param rhs
   * @return
   * @throws NotPerformed
   * @see ng.runtime.metaclass.BooleanBinaryComparison#doApplyBoolean(ng.runtime.threadcontext.ThreadContext, java.lang.Object, java.lang.Object)
   */
  public boolean doApplyBoolean(ThreadContext tc, Object lhs, Object rhs) throws NotPerformed {
    return this.delegate.doApplyBoolean(tc, lhs, rhs);
  }
  /**
   * @param tc
   * @param lhs
   * @param rhs
   * @return
   * @throws NotPerformed
   * @see ng.runtime.metaclass.BooleanBinaryComparison#doApplyBoolean(ng.runtime.threadcontext.ThreadContext, java.lang.Object, short)
   */
  public boolean doApplyBoolean(ThreadContext tc, Object lhs, short rhs) throws NotPerformed {
    return this.delegate.doApplyBoolean(tc, lhs, rhs);
  }
  /**
   * @param tc
   * @param lhs
   * @param rhs
   * @return
   * @throws NotPerformed
   * @see ng.runtime.metaclass.BooleanBinaryComparison#doApplyBoolean(ng.runtime.threadcontext.ThreadContext, short, java.lang.Object)
   */
  public boolean doApplyBoolean(ThreadContext tc, short lhs, Object rhs) throws NotPerformed {
    return this.delegate.doApplyBoolean(tc, lhs, rhs);
  }
  /**
   * @param tc
   * @param lhs
   * @param rhs
   * @return
   * @see ng.runtime.metaclass.BinaryArithmeticOperation#doReverseApply(ng.runtime.threadcontext.ThreadContext, java.lang.Object, java.lang.Object)
   */
  public Object doReverseApply(ThreadContext tc, Object lhs, Object rhs) {
    return this.delegate.doReverseApply(tc, lhs, rhs);
  }
  /**
   * @param tc
   * @param lhs
   * @param rhs
   * @return
   * @throws NotPerformed
   * @see ng.runtime.metaclass.BooleanBinaryComparison#doReverseApplyBoolean(ng.runtime.threadcontext.ThreadContext, java.lang.Object, java.lang.Object)
   */
  public boolean doReverseApplyBoolean(ThreadContext tc, Object lhs, Object rhs) throws NotPerformed {
    return this.delegate.doReverseApplyBoolean(tc, lhs, rhs);
  }
}
