package uk.co.wilson.ng.runtime.metaclass.primitives;

import java.math.BigDecimal;
import java.math.BigInteger;

import ng.runtime.metaclass.BinaryArithmeticOperation;
import ng.runtime.metaclass.MetaClass;
import ng.runtime.threadcontext.ThreadContext;

/**
 * @author John
 *
 */
public abstract class ArithmeticOperationWrapper implements BinaryArithmeticOperation {
  private final BinaryArithmeticOperation delegate;
  
  public ArithmeticOperationWrapper(BinaryArithmeticOperation delegate) {
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
   * @see ng.runtime.metaclass.BinaryArithmeticOperation#doReverseApply(ng.runtime.threadcontext.ThreadContext, java.lang.Object, java.lang.Object)
   */
  public Object doReverseApply(ThreadContext tc, Object lhs, Object rhs) {
    return this.delegate.doReverseApply(tc, lhs, rhs);
  }
}
