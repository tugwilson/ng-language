package uk.co.wilson.ng.ast;

import ng.ast.IntegerConstant;
import ng.runtime.NgInt;
import ng.runtime.metaclass.MetaClass;
import ng.runtime.threadcontext.ThreadContext;


/**
 * @author John
 *
 */
public class IntegerConstantImpl extends NodeImpl implements IntegerConstant {
  private final NgInt value;
  
  public IntegerConstantImpl(int value) {
    this.value = NgInt.valueOf(value);
  }

  /* (non-JavaDoc)
   * @see ng.ast.Node#evaluate(java.lang.Object, ng.runtime.metaclass.MetaClass, ng.runtime.threadcontext.ThreadContext)
   */
  public Object evaluate(Object instance, MetaClass metaClass, ThreadContext tc) {
    return this.value;
  }
}