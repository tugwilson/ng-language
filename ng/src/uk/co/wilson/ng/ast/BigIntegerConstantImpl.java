package uk.co.wilson.ng.ast;

import java.math.BigInteger;

import uk.co.wilson.ng.runtime.threadcontext.ExtendedThreadContext;

import ng.ast.BigIntegerConstant;
import ng.runtime.metaclass.MetaClass;


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
  public Object evaluate(final Object instance, final MetaClass metaClass, final ExtendedThreadContext tc) {
    return this.value;
  }
}
