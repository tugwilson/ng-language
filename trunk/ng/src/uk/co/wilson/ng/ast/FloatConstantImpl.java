package uk.co.wilson.ng.ast;

import uk.co.wilson.ng.runtime.NgFloat;
import ng.ast.FloatConstant;
import ng.runtime.metaclass.MetaClass;
import ng.runtime.threadcontext.ThreadContext;


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
  public Object evaluate(final Object instance, final MetaClass metaClass, final ThreadContext tc) {
    return this.value;
  }
}
