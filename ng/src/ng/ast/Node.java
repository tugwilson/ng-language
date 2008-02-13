package ng.ast;

import java.math.BigDecimal;
import java.math.BigInteger;

import ng.ast.util.BinaryOperations;
import ng.runtime.metaclass.MetaClass;
import ng.runtime.threadcontext.ExtendedThreadContext;


/**
 * @author John
 *
 */
public interface Node {
  /**
   * @param instance
   * @param metaClass
   * @param tc
   * @return
   */
  Object evaluate(Object instance, MetaClass metaClass, ExtendedThreadContext tc);

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
  BigDecimalConstant newBigDecimalConstant(BigDecimal value);

  /**
   * @return
   */
  BigIntegerConstant newBigIntegerConstant(BigInteger value);

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
  BooleanConstant newBooleanConstant(boolean value);

  /**
   * @return
   */
  Break newBreak();

  /**
   * @return
   */
  ByteConstant newByteConstant(byte value);

  /**
   * @return
   */
  Case newCase();

  /**
   * @return
   */
  Catch newCatch();

  /**
   * @return
   */
  CharConstant newCharConstant(char value);

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
  CompilationUnit newCompilationUnit();

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
  DoubleConstant newDoubleConstant(double value);

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
  Finally newFinally();

  /**
   * @return
   */
  FloatConstant newFloatConstant(float value);

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
  IntegerConstant newIntegerConstant(int value);

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
  ParameterDeclaration newParameterDeclaration();

  /**
   * @return
   */
  Return newReturn();

  /**
   * @return
   */
  StringConstant newStringConstant(String value);

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
