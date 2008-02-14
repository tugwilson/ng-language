package uk.co.wilson.ng.ast;

import java.math.BigDecimal;
import java.math.BigInteger;

import ng.ast.*;
import ng.ast.util.BinaryOperations;

/**
 * @author John
 *
 */
public abstract class NodeImpl implements Node {
  /* (non-Javadoc)
   * @see ng.ast.Node#newAbstractMethodDeclaration()
   */
  public AbstractMethodDeclaration newAbstractMethodDeclaration() {
    // TODO Auto-generated method stub
    return null;
  }

  /* (non-Javadoc)
   * @see ng.ast.Node#newAbstractPropertyDeclaration()
   */
  public AbstractPropertyDeclaration newAbstractPropertyDeclaration() {
    // TODO Auto-generated method stub
    return null;
  }

  /* (non-Javadoc)
   * @see ng.ast.Node#newAnnotation()
   */
  public Annotation newAnnotation() {
    // TODO Auto-generated method stub
    return null;
  }

  /* (non-Javadoc)
   * @see ng.ast.Node#newAssert()
   */
  public Assert newAssert() {
    // TODO Auto-generated method stub
    return null;
  }

  /* (non-JavaDoc)
   * @see ng.ast.Node#newBigDecimalConstant()
   */
  public BigDecimalConstant newBigDecimalConstant(final BigDecimal value) {
    return new BigDecimalConstantImpl(value);
  }

  /* (non-JavaDoc)
   * @see ng.ast.Node#newBigIntegerConstant()
   */
  public BigIntegerConstant newBigIntegerConstant(final BigInteger value) {
    return new BigIntegerConstantImpl(value);
  }

  /* (non-Javadoc)
   * @see ng.ast.Node#newBinaryOperation()
   */
  public BinaryOperation newBinaryOperation(final BinaryOperations operation) {
    switch (operation) {
    case plus:
      return new PlusImpl();

    case minus:
      return new MinusImpl();

    case multiply:
      return new MultiplyImpl();

    case divide:
      return new DivideImpl();

    case integerDivide:
      return new IntegerDivideImpl();

    case remainderDivide:
      return new RemainderDivideImpl();

    case power:
      return new PowerImpl();

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
      return new EqualsImpl();

    case notEquals:
      return new NotEqualsImpl();

    case compare:
      break;

    case greaterThan:
      new GreaterThanImpl();

    case lessThan:
      return new LessThanImpl();

    case greaterThanOrEquals:
      return new GreaterThanOrEqualsImpl();
      
    case lessThanOrEquals:
      return new LessThanOrEqualsImpl();

    case as:
      return new AsImpl();

    case instanceOf:
      break;
    }

    return null;  // TODO: remove when all the operations are implemented
  }

  /* (non-Javadoc)
   * @see ng.ast.Node#newBlock()
   */
  public Block newBlock() {
    // TODO Auto-generated method stub
    return null;
  }

  /* (non-JavaDoc)
   * @see ng.ast.Node#newBooleanConstant()
   */
  public BooleanConstant newBooleanConstant(final boolean value) {
    // TODO Auto-generated method stub
    return null;
  }

  /* (non-JavaDoc)
   * @see ng.ast.Node#newBreak()
   */
  public Break newBreak() {
    // TODO Auto-generated method stub
    return null;
  }

  /* (non-JavaDoc)
   * @see ng.ast.Node#newByteConstant()
   */
  public ByteConstant newByteConstant(final byte value) {
    return new ByteConstantImpl(value);
  }

  /* (non-Javadoc)
   * @see ng.ast.Node#newCase()
   */
  public Case newCase() {
    // TODO Auto-generated method stub
    return null;
  }

  /* (non-JavaDoc)
   * @see ng.ast.Node#newCatch()
   */
  public Catch newCatch() {
    // TODO Auto-generated method stub
    return null;
  }

  /* (non-JavaDoc)
   * @see ng.ast.Node#newCharConstant(char)
   */
  public CharConstant newCharConstant(final char value) {
    return new CharConstantImpl(value);
  }

  /* (non-Javadoc)
   * @see ng.ast.Node#newClassDeclaration()
   */
  public ClassDeclaration newClassDeclaration() {
    // TODO Auto-generated method stub
    return null;
  }

  /* (non-Javadoc)
   * @see ng.ast.Node#newClosure()
   */
  public Closure newClosure() {
    // TODO Auto-generated method stub
    return null;
  }

  /* (non-JavaDoc)
   * @see ng.ast.Node#newCompilationUnit()
   */
  public CompilationUnit newCompilationUnit() {
    // TODO Auto-generated method stub
    return null;
  }

  /* (non-Javadoc)
   * @see ng.ast.Node#newConcreteMethodDeclaration()
   */
  public ConcreteMethodDeclaration newConcreteMethodDeclaration() {
    // TODO Auto-generated method stub
    return null;
  }

  /* (non-Javadoc)
   * @see ng.ast.Node#newConcretePropertyDeclaration()
   */
  public ConcretePropertyDeclaration newConcretePropertyDeclaration() {
    // TODO Auto-generated method stub
    return null;
  }

  /* (non-Javadoc)
   * @see ng.ast.Node#newConditionalExpression ()
   */
  public ConditionalExpression newConditionalExpression () {
    // TODO Auto-generated method stub
    return null;
  }

  /* (non-Javadoc)
   * @see ng.ast.Node#newConstructor()
   */
  public Constructor newConstructor() {
    // TODO Auto-generated method stub
    return null;
  }

  /* (non-Javadoc)
   * @see ng.ast.Node#newContinue()
   */
  public Continue newContinue() {
    // TODO Auto-generated method stub
    return null;
  }

  /* (non-Javadoc)
   * @see ng.ast.Node#newDefault()
   */
  public Default newDefault() {
    // TODO Auto-generated method stub
    return null;
  }

  /* (non-Javadoc)
   * @see ng.ast.Node#newDo()
   */
  public Do newDo() {
    // TODO Auto-generated method stub
    return null;
  }

  /* (non-JavaDoc)
   * @see ng.ast.Node#newDoubleConstant()
   */
  public DoubleConstant newDoubleConstant(final double value) {
    return new DoubleConstantImpl(value);
  }

  /* (non-Javadoc)
   * @see ng.ast.Node#newEmpty()
   */
  public Empty newEmpty() {
    // TODO Auto-generated method stub
    return null;
  }

  /* (non-Javadoc)
   * @see ng.ast.Node#newFieldDeclaration()
   */
  public FieldDeclaration newFieldDeclaration() {
    // TODO Auto-generated method stub
    return null;
  }

  /* (non-JavaDoc)
   * @see ng.ast.Node#newFinally()
   */
  public Finally newFinally() {
    // TODO Auto-generated method stub
    return null;
  }

  /* (non-JavaDoc)
   * @see ng.ast.Node#newFloatConstant()
   */
  public FloatConstant newFloatConstant(final float value) {
    return new FloatConstantImpl(value);
  }

  /* (non-Javadoc)
   * @see ng.ast.Node#newFor()
   */
  public For newFor() {
    // TODO Auto-generated method stub
    return null;
  }

  /* (non-Javadoc)
   * @see ng.ast.Node#newIdentifier()
   */
  public Identifier newIdentifier() {
    // TODO Auto-generated method stub
    return null;
  }

  /* (non-Javadoc)
   * @see ng.ast.Node#newIf()
   */
  public If newIf() {
    // TODO Auto-generated method stub
    return null;
  }

  /* (non-Javadoc)
   * @see ng.ast.Node#newImport()
   */
  public Import newImport() {
    // TODO Auto-generated method stub
    return null;
  }

  /* (non-JavaDoc)
   * @see ng.ast.Node#newIntegerConstant()
   */
  public IntegerConstant newIntegerConstant(final int value) {
    return new IntegerConstantImpl(value);
  }

  /* (non-Javadoc)
   * @see ng.ast.Node#newInterfaceDeclaration()
   */
  public InterfaceDeclaration newInterfaceDeclaration() {
    // TODO Auto-generated method stub
    return null;
  }

  /* (non-Javadoc)
   * @see ng.ast.Node#newLocalDeclaration()
   */
  public LocalDeclaration newLocalDeclaration() {
    // TODO Auto-generated method stub
    return null;
  }

  /* (non-Javadoc)
   * @see ng.ast.Node#newMethodCall()
   */
  public MethodCall newMethodCall() {
    // TODO Auto-generated method stub
    return null;
  }

  /* (non-Javadoc)
   * @see ng.ast.Node#newParameterDeclaration()
   */
  public ParameterDeclaration newParameterDeclaration() {
    // TODO Auto-generated method stub
    return null;
  }

  /* (non-Javadoc)
   * @see ng.ast.Node#newReturn()
   */
  public Return newReturn() {
    // TODO Auto-generated method stub
    return null;
  }

  /* (non-Javadoc)
   * @see ng.ast.Node#newStringConstant()
   */
  public StringConstant newStringConstant(final String value) {
    return new StringConstantImpl(value);
  }

  /* (non-Javadoc)
   * @see ng.ast.Node#newSwitch()
   */
  public Switch newSwitch() {
    // TODO Auto-generated method stub
    return null;
  }

  /* (non-Javadoc)
   * @see ng.ast.Node#newSynchronized()
   */
  public Synchronized newSynchronized() {
    // TODO Auto-generated method stub
    return null;
  }

  /* (non-Javadoc)
   * @see ng.ast.Node#newThrow()
   */
  public Throw newThrow() {
    // TODO Auto-generated method stub
    return null;
  }

  /* (non-Javadoc)
   * @see ng.ast.Node#newTry()
   */
  public Try newTry() {
    // TODO Auto-generated method stub
    return null;
  }

  /* (non-Javadoc)
   * @see ng.ast.Node#newUnaryOperation()
   */
  public UnaryOperation newUnaryOperation() {
    // TODO Auto-generated method stub
    return null;
  }

  /* (non-Javadoc)
   * @see ng.ast.Node#newWhile()
   */
  public While newWhile() {
    // TODO Auto-generated method stub
    return null;
  }

}
