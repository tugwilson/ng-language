package uk.co.wilson.ng.ast;

import java.math.BigInteger;

import ng.ast.BigIntegerConstant;
import ng.runtime.metaclass.MetaClass;
import ng.runtime.threadcontext.ThreadContext;


/**
 * @author John
 *
 */
public class BigIntegerConstantImpl extends NodeImpl implements BigIntegerConstant {
  private final BigInteger value;

  /**
   * @param value
   */
  public BigIntegerConstantImpl(final BigInteger value) {
    this.value = value;
  }

  /* (non-JavaDoc)
   * @see ng.ast.Node#evaluate(java.lang.Object, ng.runtime.metaclass.MetaClass, ng.runtime.threadcontext.ThreadContext)
   */
  public Object evaluate(final Object instance, final MetaClass metaClass, final ThreadContext tc) {
    return this.value;
  }
}
