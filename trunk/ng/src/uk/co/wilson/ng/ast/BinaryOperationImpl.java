package uk.co.wilson.ng.ast;

import ng.ast.Expression;
import ng.ast.util.BinaryOperations;
import ng.runtime.metaclass.MetaClass;
import ng.runtime.threadcontext.ThreadContext;

public class BinaryOperationImpl extends NodeImpl implements ng.ast.BinaryOperation {
  private final BinaryOperations operation;
  private Expression lhs;
  private Expression rhs;

  public BinaryOperationImpl(final BinaryOperations operation) {
    this.operation = operation;
  }

  public void setLhs(final Expression lhs) {
    this.lhs = lhs;
  }

  public void setRhs(final Expression rhs) {
    this.rhs = rhs;
  }

  public Object evaluate(final Object instance, final MetaClass metaClass, final ThreadContext tc) {
    switch (this.operation) {
    case plus:
      return tc.add().apply(this.lhs.evaluate(instance, metaClass, tc), this.rhs.evaluate(instance, metaClass, tc));

    case minus:
      return tc.subtract().apply(this.lhs.evaluate(instance, metaClass, tc), this.rhs.evaluate(instance, metaClass, tc));

    case multiply:
      return tc.multiply().apply(this.lhs.evaluate(instance, metaClass, tc), this.rhs.evaluate(instance, metaClass, tc));

    case divide:
      return tc.divide().apply(this.lhs.evaluate(instance, metaClass, tc), this.rhs.evaluate(instance, metaClass, tc));

    case integerDivide:
      return tc.modulo().apply(this.lhs.evaluate(instance, metaClass, tc), this.rhs.evaluate(instance, metaClass, tc));

    case remainderDivide:
      return tc.remainderDivide().apply(this.lhs.evaluate(instance, metaClass, tc), this.rhs.evaluate(instance, metaClass, tc));

    case power:
      break;

    case or:
      break;

    case and:
      break;

    case xor:
      break;

    case leftShift:
      break;

    case rightShift:
      break;

    case unsignedRightShift:
      break;

    case equals:
      return tc.equals().apply(this.lhs.evaluate(instance, metaClass, tc), this.rhs.evaluate(instance, metaClass, tc));

    case notEquals:
      return tc.notEquals().apply(this.lhs.evaluate(instance, metaClass, tc), this.rhs.evaluate(instance, metaClass, tc));

    case compare:
      break;

    case greaterThan:
      return tc.greaterThan().apply(this.lhs.evaluate(instance, metaClass, tc), this.rhs.evaluate(instance, metaClass, tc));

    case lessThan:
      return tc.lessThan().apply(this.lhs.evaluate(instance, metaClass, tc), this.rhs.evaluate(instance, metaClass, tc));

    case greaterThanOrEquals:
      return tc.greaterThanOrEquals().apply(this.lhs.evaluate(instance, metaClass, tc), this.rhs.evaluate(instance, metaClass, tc));

    case lessThanOrEquals:
      return tc.lessThanOrEquals().apply(this.lhs.evaluate(instance, metaClass, tc), this.rhs.evaluate(instance, metaClass, tc));

    case as:
      return tc.convert().asType(this.lhs.evaluate(instance, metaClass, tc), this.rhs.evaluate(instance, metaClass, tc));

    case instanceOf:
      break;
    }

    return null;  // TODO: remove when all the operations are implemented
  }
}
