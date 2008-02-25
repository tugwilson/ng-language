package uk.co.wilson.ng.runtime.metaclass.primitives.booleanimpl;

import uk.co.wilson.ng.runtime.metaclass.Conversion;
import uk.co.wilson.ng.runtime.metaclass.MetaClassImpl;

public class BooleanMetaClassImpl extends MetaClassImpl implements BooleanMetaClass {

  private final Conversion convert = new Convert();

  public BooleanMetaClassImpl() {
    super(boolean.class);
  }

  @Override
  public Conversion getOriginalConvert() {
    return this.convert;
  }
}
