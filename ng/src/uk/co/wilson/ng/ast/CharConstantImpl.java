package uk.co.wilson.ng.ast;

import ng.ast.CharConstant;
import ng.runtime.metaclass.MetaClass;
import ng.runtime.threadcontext.ThreadContext;
import uk.co.wilson.ng.runtime.NgChar;

/**
 * @author John
 * 
 */
public class CharConstantImpl extends NodeImpl implements CharConstant {
  private final NgChar value;

  /**
   * @param value
   */
  public CharConstantImpl(final char value) {
    this.value = NgChar.valueOf(value);
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
