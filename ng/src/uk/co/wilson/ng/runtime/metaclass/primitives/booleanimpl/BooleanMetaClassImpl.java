package uk.co.wilson.ng.runtime.metaclass.primitives.booleanimpl;

import ng.runtime.metaclass.Conversion;
import uk.co.wilson.ng.runtime.metaclass.MetaClassImpl;
import uk.co.wilson.ng.runtime.metaclass.primitives.BooleanMetaClass;

public class BooleanMetaClassImpl extends MetaClassImpl implements BooleanMetaClass {

  private final Conversion convert = new Convert();

  public BooleanMetaClassImpl() {
    super(boolean.class);
  }

  @Override
  public Conversion getOriginalConvert() {
    return this.convert;
  }

  @Override
  public Conversion convert() {
    if (this.modifiedConvert == null) {
      return this.convert;
    } else {
      return this.modifiedConvert;
    }
  }
}
