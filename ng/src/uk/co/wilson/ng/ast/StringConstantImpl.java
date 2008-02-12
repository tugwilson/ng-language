package uk.co.wilson.ng.ast;

import uk.co.wilson.ng.runtime.threadcontext.ExtendedThreadContext;
import ng.ast.StringConstant;
import ng.runtime.metaclass.MetaClass;


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

  /* (non-JavaDoc)
   * @see ng.ast.Node#evaluate(java.lang.Object, ng.runtime.metaclass.MetaClass, ng.runtime.threadcontext.ThreadContext)
   */
  public Object evaluate(final Object instance, final MetaClass metaClass, final ExtendedThreadContext tc) {
    return this.value;
  }
}
