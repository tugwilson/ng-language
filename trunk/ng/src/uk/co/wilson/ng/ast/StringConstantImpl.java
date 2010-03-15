package uk.co.wilson.ng.ast;

import ng.ast.StringConstant;
import ng.runtime.metaclass.MetaClass;
import ng.runtime.threadcontext.ThreadContext;

/**
 * @author John
 * 
 */
public class StringConstantImpl extends NodeImpl implements StringConstant {
  private final String value;

  /**
   * @param value
   */
  public StringConstantImpl(final String value) {
    this.value = value;
  }

  /*
   * (non-JavaDoc)
   * 
   * @see ng.ast.Node#evaluate(java.lang.Object, ng.runtime.metaclass.MetaClass,
   * ng.runtime.threadcontext.ThreadContext)
   */
  public Object evaluate(final Object instance, final MetaClass metaClass, final ThreadContext tc) {
    return this.value;
  }
}
