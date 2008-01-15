package ng.ast;

import ng.ast.util.BinaryOperations;
import ng.runtime.metaclass.MetaClass;
import ng.runtime.threadcontext.ThreadContext;


/**
 * @author John
 *
 */
public interface Node {
  Object evaluate(Object instance, MetaClass metaClass, ThreadContext tc);
  
  /**
   * @return
   */
  AbstractMethodDeclaration newAbstractMethodDeclaration();

  /**
   * @return
   */
  AbstractPropertyDeclaration newAbstractPropertyDeclaration();

  /**
   * @return
   */
  Annotation newAnnotation();

  /**
   * @return
   */
  Assert newAssert();

  /**
   * @return
   */
  BinaryOperation newBinaryOperation(BinaryOperations operation);

  /**
   * @return
   */
  Block newBlock();

  /**
   * @return
   */
  Case newCase();

  /**
   * @return
   */
  ClassDeclaration newClassDeclaration();

  /**
   * @return
   */
  Closure newClosure();

  /**
   * @return
   */
  ConcreteMethodDeclaration newConcreteMethodDeclaration();

  /**
   * @return
   */
  ConcretePropertyDeclaration newConcretePropertyDeclaration();

  /**
   * @return
   */
  ConditionalExpression newConditionalExpression();

  /**
   * @return
   */
  Constructor newConstructor();

  /**
   * @return
   */
  Continue newContinue();

  /**
   * @return
   */
  Default newDefault();

  /**
   * @return
   */
  Do newDo();

  /**
   * @return
   */
  Empty newEmpty();

  /**
   * @return
   */
  FieldDeclaration newFieldDeclaration();

  /**
   * @return
   */
  For newFor();

  /**
   * @return
   */
  Identifier newIdentifier();

  /**
   * @return
   */
  If newIf();

  /**
   * @return
   */
  Import newImport();

  /**
   * @return
   */
  InterfaceDeclaration newInterfaceDeclaration();

  /**
   * @return
   */
  LocalDeclaration newLocalDeclaration();

  /**
   * @return
   */
  MethodCall newMethodCall();

  /**
   * @return
   */
  NumericValue newNumericValue();

  /**
   * @return
   */
  ParameterDeclaration newParameterDeclaration();

  /**
   * @return
   */
  Return newReturn();

  /**
   * @return
   */
  StringValue newStringValue();

  /**
   * @return
   */
  Switch newSwitch();

  /**
   * @return
   */
  Synchronized newSynchronized();

  /**
   * @return
   */
  Throw newThrow();

  /**
   * @return
   */
  Try newTry();

  /**
   * @return
   */
 UnaryOperation newUnaryOperation();

 /**
  * @return
  */
  While newWhile();
}
