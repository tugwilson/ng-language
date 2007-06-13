package ng.ast;

import ng.ast.util.BinaryOperations;

/**
 * @author John
 *
 */
public interface BinaryOperation extends Operator {
  void setOperation(BinaryOperations op);
  void setLhs(Expression lhs);
  void setRhs(Expression Rhs);
}
