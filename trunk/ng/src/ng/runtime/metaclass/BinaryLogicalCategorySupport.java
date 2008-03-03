package ng.runtime.metaclass;

import java.util.Map;

import ng.runtime.metaclass.primitives.biginteger.BigIntegerBinaryLogicalOperation;
import ng.runtime.metaclass.primitives.byteimpl.ByteBinaryLogicalOperation;
import ng.runtime.metaclass.primitives.charimpl.CharBinaryLogicalOperation;
import ng.runtime.metaclass.primitives.intimpl.IntBinaryLogicalOperation;
import ng.runtime.metaclass.primitives.longimpl.LongBinaryLogicalOperation;
import ng.runtime.metaclass.primitives.shortimpl.ShortBinaryLogicalOperation;


/*
 * Created on 26 Feb 2008
 *
 * Copyright 2008 John G. Wilson
 *
 *   Licensed under the Apache License, Version 2.0 (the "License");
 *   you may not use this file except in compliance with the License.
 *   You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 *   Unless required by applicable law or agreed to in writing, software
 *   distributed under the License is distributed on an "AS IS" BASIS,
 *   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *   See the License for the specific language governing permissions and
 *   limitations under the License.
 *
 */

/**
 * @author John
 *
 */
public interface BinaryLogicalCategorySupport {
  CharBinaryLogicalOperation getCharCategoryOperation();
  void setCharCategoryOperation(CharBinaryLogicalOperation charCategoryOperation);

  ByteBinaryLogicalOperation getByteCategoryOperation();
  void setByteCategoryOperation(ByteBinaryLogicalOperation byteCategoryOperation);

  ShortBinaryLogicalOperation getShortCategoryOperation();
  void setShortCategoryOperation(ShortBinaryLogicalOperation shortCategoryOperation);

  IntBinaryLogicalOperation getIntCategoryOperation();
  void setIntCategoryOperation(IntBinaryLogicalOperation intCategoryOperation);

  LongBinaryLogicalOperation getLongCategoryOperation();
  void setLongCategoryOperation(LongBinaryLogicalOperation longCategoryOperation);

  LogicalBinaryOperation getFloatCategoryOperation();
  void setFloatCategoryOperation(LogicalBinaryOperation floatCategoryOperation);

  LogicalBinaryOperation getDoubleCategoryOperation();
  void setDoubleCategoryOperation(LogicalBinaryOperation doubleCategoryOperation);

  BigIntegerBinaryLogicalOperation getBigIntegerCategoryOperation();
  void setBigIntegerCategoryOperation(BigIntegerBinaryLogicalOperation bigIntegerCategoryOperation);

  LogicalBinaryOperation getBigDecimalCategoryOperation();
  void setBigDecimalCategoryOperation(LogicalBinaryOperation bigDecimalCategoryOperation);

  Map<Object, LogicalBinaryOperation> getCategoryBinaryOperationMap();
  void setCategoryBinaryOperationMap(Map<Object, LogicalBinaryOperation> categoryBinaryOperationMap);
}
