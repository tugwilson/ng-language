package uk.co.wilson.ng.ast;

import uk.co.wilson.ng.runtime.threadcontext.ExtendedThreadContext;
import ng.ast.ByteConstant;
import ng.runtime.NgByte;
import ng.runtime.metaclass.MetaClass;


/**
 * @author John
 *
 */
public class ByteConstantImpl extends NodeImpl implements ByteConstant {
  private final NgByte value;

  public ByteConstantImpl(final byte value) {
    this.value = NgByte.valueOf(value);
  }

  /* (non-JavaDoc)
   * @see ng.ast.Node#evaluate(java.lang.Object, ng.runtime.metaclass.MetaClass, ng.runtime.threadcontext.ThreadContext)
   */
  public Object evaluate(final Object instance, final MetaClass metaClass, final ExtendedThreadContext tc) {
    return this.value;
  }
}
