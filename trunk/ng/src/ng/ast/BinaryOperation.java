package ng.ast;


/**
 * @author John
 *
 */
public interface BinaryOperation extends Operator {
  void setLhs(Expression lhs);
  void setRhs(Expression rhs);
}
