package ng.ast;


/**
 * @author John
 *
 */
public interface Node {
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
  BinaryOperation newBinaryOperation();
  
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
  Method newMethod();
  
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
  PropertyDeclaration newPropertyDeclaration();
  
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
  SwitchStatement newSwitchStatement();
  
  /**
   * @return
   */
  Synchronized newSynchronized();
  
  /**
   * @return
   */
  TernaryOperation newTernaryOperation();
  
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
