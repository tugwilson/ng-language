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

  public void setLhs(Expression lhs) {
    this.lhs = lhs;
  }

  public void setRhs(Expression rhs) {
    this.rhs = rhs;
  }
  
  public Object evaluate(final Object instance, final MetaClass metaClass, final ThreadContext tc) {
    switch (this.operation) {
    case plus:
      return tc.add().apply(this.lhs.evaluate(instance, metaClass, tc), this.rhs.evaluate(instance, metaClass, tc));
    
    case minus:
      break;
    
    case mutiply:
      break;
    
    case divide:
      break;
    
    case integerDivide:
      break;
    
    case remainderDivide:
      break;
    
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
      break;
    
    case compare:
      break;
    
    case greaterThan:
      break;
    
    case lessThan:
      break;
    
    case greaterThanOrEquals:
      break;
    
    case lessThanOrEquals:
      break;
    
    case as:
      return tc.convert().asType(this.lhs.evaluate(instance, metaClass, tc), this.rhs.evaluate(instance, metaClass, tc));
      
    case instanceOf:
      break;
    }
    
    return null;  // TODO: remove when all the operations are implemented
  }
}
