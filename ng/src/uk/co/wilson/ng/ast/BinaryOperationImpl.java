package uk.co.wilson.ng.ast;

import ng.ast.Expression;
import ng.runtime.metaclass.MetaClass;
import ng.runtime.threadcontext.ThreadContext;

public abstract class BinaryOperationImpl extends NodeImpl implements ng.ast.BinaryOperation {
  protected Expression lhs;

  protected Expression rhs;

  public void setLhs(final Expression lhs) {
    this.lhs = lhs;
  }

  public void setRhs(final Expression rhs) {
    this.rhs = rhs;
  }

  public abstract Object evaluate(Object instance, MetaClass metaClass, ThreadContext tc);
}
