package uk.co.wilson.ng.ast;

import ng.ast.DoubleConstant;
import ng.runtime.NgDouble;
import ng.runtime.metaclass.MetaClass;
import ng.runtime.threadcontext.ExtendedThreadContext;


/**
 * @author John
 *
 */
public class DoubleConstantImpl extends NodeImpl implements DoubleConstant {
  private final NgDouble value;

  /* (non-JavaDoc)
   * @see ng.ast.Node#evaluate(java.lang.Object, ng.runtime.metaclass.MetaClass, ng.runtime.threadcontext.ThreadContext)
   */
  /**
   * @param value
   */
  public DoubleConstantImpl(final double value) {
    this.value = NgDouble.valueOf(value);
  }


  public Object evaluate(final Object instance, final MetaClass metaClass, final ExtendedThreadContext tc) {
    return this.value;
  }
}
