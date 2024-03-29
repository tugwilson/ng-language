package uk.co.wilson.ng.ast;

import ng.runtime.metaclass.MetaClass;
import ng.runtime.threadcontext.ThreadContext;

/**
 * @author John
 * 
 */
public class GreaterThanImpl extends BinaryOperationImpl {

  /*
   * (non-JavaDoc)
   * 
   * @see uk.co.wilson.ng.ast.BinaryOperationImpl#evaluate(java.lang.Object,
   * ng.runtime.metaclass.MetaClass, ng.runtime.threadcontext.ThreadContext)
   */
  @Override
  public Object evaluate(final Object instance, final MetaClass metaClass, final ThreadContext tc) {
    return tc.greaterThan().apply(this.lhs.evaluate(instance, metaClass, tc), this.rhs.evaluate(instance, metaClass, tc));
  }
}
