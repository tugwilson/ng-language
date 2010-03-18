package uk.co.wilson.ng.runtime.metaclass.primitives.stringimpl;

import ng.runtime.metaclass.BinaryOperation;
import ng.runtime.metaclass.primitives.stringimpl.StringMetaClass;
import uk.co.wilson.ng.runtime.metaclass.MetaClassImpl;

/**
 * @author John
 * 
 */
public class StringMetaClassImpl extends MetaClassImpl implements StringMetaClass {
  private final BinaryOperation add = new Add();

  public StringMetaClassImpl() {
    super(String.class);
  }

  @Override
  public BinaryOperation getOriginalAdd() {
    return this.add;
  }
}
