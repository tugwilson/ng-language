package uk.co.wilson.ng.ast;

import uk.co.wilson.ng.runtime.NgInt;
import ng.ast.IntegerConstant;
import ng.runtime.metaclass.MetaClass;
import ng.runtime.threadcontext.ThreadContext;


/**
 * @author John
 *
 */
public class IntegerConstantImpl extends NodeImpl implements IntegerConstant {
  private final NgInt value;

  public IntegerConstantImpl(final int value) {
    this.value = NgInt.valueOf(value);
  }

  /* (non-JavaDoc)
   * @see ng.ast.Node#evaluate(java.lang.Object, ng.runtime.metaclass.MetaClass, ng.runtime.threadcontext.ThreadContext)
   */
  public Object evaluate(final Object instance, final MetaClass metaClass, final ThreadContext tc) {
    return this.value;
  }
}
