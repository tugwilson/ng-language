package uk.co.wilson.ng.ast;

import ng.ast.AbstractMethodDeclaration;
import ng.ast.AbstractPropertyDeclaration;
import ng.ast.Annotation;
import ng.ast.Assert;
import ng.ast.BinaryOperation;
import ng.ast.Block;
import ng.ast.Case;
import ng.ast.ClassDeclaration;
import ng.ast.Closure;
import ng.ast.ConcreteMethodDeclaration;
import ng.ast.ConcretePropertyDeclaration;
import ng.ast.ConditionalExpression;
import ng.ast.Constructor;
import ng.ast.Continue;
import ng.ast.Default;
import ng.ast.Do;
import ng.ast.Empty;
import ng.ast.FieldDeclaration;
import ng.ast.For;
import ng.ast.Identifier;
import ng.ast.If;
import ng.ast.Import;
import ng.ast.InterfaceDeclaration;
import ng.ast.LocalDeclaration;
import ng.ast.MethodCall;
import ng.ast.Node;
import ng.ast.NumericValue;
import ng.ast.ParameterDeclaration;
import ng.ast.Return;
import ng.ast.StringValue;
import ng.ast.Switch;
import ng.ast.Synchronized;
import ng.ast.Throw;
import ng.ast.Try;
import ng.ast.UnaryOperation;
import ng.ast.While;
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

  /* (non-Javadoc)
   * @see ng.ast.Node#newBinaryOperation()
   */
  public BinaryOperation newBinaryOperation(final BinaryOperations operation) {
    return new BinaryOperationImpl(operation);
  }

  /* (non-Javadoc)
   * @see ng.ast.Node#newBlock()
   */
  public Block newBlock() {
    // TODO Auto-generated method stub
    return null;
  }

  /* (non-Javadoc)
   * @see ng.ast.Node#newCase()
   */
  public Case newCase() {
    // TODO Auto-generated method stub
    return null;
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
   * @see ng.ast.Node#newNumericValue()
   */
  public NumericValue newNumericValue() {
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
   * @see ng.ast.Node#newStringValue()
   */
  public StringValue newStringValue() {
    // TODO Auto-generated method stub
    return null;
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
