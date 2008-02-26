package uk.co.wilson.ng.runtime.metaclass.primitives.string;

import ng.runtime.metaclass.ArithmeticBinaryOperation;
import uk.co.wilson.ng.runtime.metaclass.MetaClassImpl;
import uk.co.wilson.ng.runtime.metaclass.StringMetaClass;

/**
 * @author John
 *
 */
public class StringMetaClassImpl extends MetaClassImpl implements StringMetaClass {
  private final ArithmeticBinaryOperation add = new Add();

  public StringMetaClassImpl() {
    super(String.class);
  }

  @Override
  public ArithmeticBinaryOperation getOriginalAdd() {
    return this.add;
  }
}
