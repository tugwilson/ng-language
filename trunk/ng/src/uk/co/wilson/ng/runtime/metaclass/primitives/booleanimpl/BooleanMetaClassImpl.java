package uk.co.wilson.ng.runtime.metaclass.primitives.booleanimpl;

import ng.runtime.metaclass.BinaryArithmeticOperation;
import ng.runtime.metaclass.BooleanBinaryComparison;
import ng.runtime.metaclass.Conversion;
import uk.co.wilson.ng.runtime.metaclass.BaseMetaClass;
import uk.co.wilson.ng.runtime.metaclass.primitives.BooleanMetaClass;

public class BooleanMetaClassImpl extends BaseMetaClass implements BooleanMetaClass {

  private final Conversion convert = new Convert();

  public BooleanMetaClassImpl() {
    super(boolean.class);
  }

  public Conversion convert() {
    if (this.modifiedConvert == null) {
      return this.convert;
    } else {
      return this.modifiedConvert;
    }
  }

  /* (non-JavaDoc)
   * @see ng.runtime.metaclass.MetaClass#add()
   */
  public BinaryArithmeticOperation add() {
    // TODO Auto-generated method stub
    return null;
  }

  /* (non-JavaDoc)
   * @see ng.runtime.metaclass.MetaClass#divide()
   */
  public BinaryArithmeticOperation divide() {
    // TODO Auto-generated method stub
    return null;
  }

  /* (non-JavaDoc)
   * @see ng.runtime.metaclass.MetaClass#equals()
   */
  public BooleanBinaryComparison equals() {
    // TODO Auto-generated method stub
    return null;
  }

  /* (non-JavaDoc)
   * @see ng.runtime.metaclass.MetaClass#greaterThan()
   */
  public BooleanBinaryComparison greaterThan() {
    // TODO Auto-generated method stub
    return null;
  }

  /* (non-JavaDoc)
   * @see ng.runtime.metaclass.MetaClass#greaterThanOrEquals()
   */
  public BooleanBinaryComparison greaterThanOrEquals() {
    // TODO Auto-generated method stub
    return null;
  }

  /* (non-JavaDoc)
   * @see ng.runtime.metaclass.MetaClass#lessThan()
   */
  public BooleanBinaryComparison lessThan() {
    // TODO Auto-generated method stub
    return null;
  }

  /* (non-JavaDoc)
   * @see ng.runtime.metaclass.MetaClass#lessThanOrEquals()
   */
  public BooleanBinaryComparison lessThanOrEquals() {
    // TODO Auto-generated method stub
    return null;
  }

  /* (non-JavaDoc)
   * @see ng.runtime.metaclass.MetaClass#modulo()
   */
  public BinaryArithmeticOperation modulo() {
    // TODO Auto-generated method stub
    return null;
  }

  /* (non-JavaDoc)
   * @see ng.runtime.metaclass.MetaClass#multiply()
   */
  public BinaryArithmeticOperation multiply() {
    // TODO Auto-generated method stub
    return null;
  }

  /* (non-JavaDoc)
   * @see ng.runtime.metaclass.MetaClass#notEquals()
   */
  public BooleanBinaryComparison notEquals() {
    // TODO Auto-generated method stub
    return null;
  }
  
  public BinaryArithmeticOperation power() {
    // TODO Auto-generated method stub
    return null;
  }

  /* (non-JavaDoc)
   * @see ng.runtime.metaclass.MetaClass#remainderDivide()
   */
  public BinaryArithmeticOperation remainderDivide() {
    // TODO Auto-generated method stub
    return null;
  }

  /* (non-JavaDoc)
   * @see ng.runtime.metaclass.MetaClass#subtract()
   */
  public BinaryArithmeticOperation subtract() {
    // TODO Auto-generated method stub
    return null;
  }
}
