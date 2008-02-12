package uk.co.wilson.ng.ast;

import uk.co.wilson.ng.runtime.threadcontext.ExtendedThreadContext;
import ng.ast.FloatConstant;
import ng.runtime.NgFloat;
import ng.runtime.metaclass.MetaClass;


/**
 * @author John
 *
 */
public class FloatConstantImpl extends NodeImpl implements FloatConstant {
  private final NgFloat value;

  /**
   * @param value
   */
  public FloatConstantImpl(final float value) {
    this.value = NgFloat.valueOf(value);
  }

  /* (non-JavaDoc)
   * @see ng.ast.Node#evaluate(java.lang.Object, ng.runtime.metaclass.MetaClass, ng.runtime.threadcontext.ThreadContext)
   */
  public Object evaluate(final Object instance, final MetaClass metaClass, final ExtendedThreadContext tc) {
    return this.value;
  }
}
