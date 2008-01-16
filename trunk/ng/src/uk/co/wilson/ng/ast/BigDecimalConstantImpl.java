package uk.co.wilson.ng.ast;

import java.math.BigDecimal;

import ng.ast.BigDecimalConstant;
import ng.runtime.metaclass.MetaClass;
import ng.runtime.threadcontext.ThreadContext;


/**
 * @author John
 *
 */
public class BigDecimalConstantImpl extends NodeImpl implements BigDecimalConstant {
  public final BigDecimal value;
  
  public BigDecimalConstantImpl(final BigDecimal value) {
    this.value = value;
  }
  
  /* (non-JavaDoc)
   * @see ng.ast.Node#evaluate(java.lang.Object, ng.runtime.metaclass.MetaClass, ng.runtime.threadcontext.ThreadContext)
   */
  public Object evaluate(Object instance, MetaClass metaClass, ThreadContext tc) {
    return this.value;
  }
}
