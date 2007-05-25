package uk.co.wilson.ng.runtime.metaclass;
/*
 * Created on Feb 25, 2007
 *
 * Copyright 2007 John G. Wilson
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

import java.math.BigDecimal;
import java.math.BigInteger;

import ng.lang.NgSystem;
import ng.runtime.NgBoolean;
import ng.runtime.NgDouble;
import ng.runtime.NgFloat;
import ng.runtime.NgInt;
import ng.runtime.NgLong;

public class NgLongMetaClass extends RuntimeMetaClassImpl {
  public NgLongMetaClass() {
    super(long.class, new NgLongInternalMetaClass(long.class));
  }
}

class NgLongInternalMetaClass extends InternalMetaClassImpl {
  public NgLongInternalMetaClass(final Class theClass) {
    super(theClass);
  }
  /* (non-Javadoc)
   * @see uk.co.wilson.ng.runtime.metaclass.InternalMetaClassImpl#doCalculateConversionCost(java.lang.Class)
   */
  @Override
  public int doCalculateConversionCost(final Class parameterType) {
    if (parameterType == long.class) return 0;
    
    if (parameterType == BigInteger.class) return 1;
    
    if (parameterType == float.class) return 2;
    
    if (parameterType == double.class) return 3;
    
    if (parameterType == BigDecimal.class) return 4;
    
    return super.doCalculateConversionCost(parameterType);
  }

  /* (non-Javadoc)
   * @see uk.co.wilson.ng.runtime.metaclass.InternalMetaClassImpl#doGetParamObject(java.lang.Object, java.lang.Class)
   */
  @Override
 public Object doGetParamObject(final Object instance, final Class parameterType) {
    if (parameterType == long.class) return new Long(((NgLong)instance).getLongValue());
    
    if (parameterType == BigInteger.class) return BigInteger.valueOf(((NgLong)instance).getLongValue());
    
    if (parameterType == float.class) return new Float(((NgLong)instance).getLongValue());
    
    if (parameterType == double.class) return new Double(((NgLong)instance).getLongValue());
    
    if (parameterType == BigDecimal.class) return new BigDecimal(((NgLong)instance).getLongValue());
    
    return super.doGetParamObject(instance, parameterType);
  }

  @Override
  public Object doComplement(final long instance) {
    return NgLong.valueOf(~instance);
  }
  
  @Override
  public Object doComplement(final Object instance) {
    return NgLong.valueOf(~((NgLong)instance).getLongValue());
  }

  @Override
  public Object doUnaryPlus(final long instance) {
    return NgLong.valueOf(instance);
  }
  
  @Override
  public Object doUnaryPlus(final Object instance) {
    return instance;
  }
  
  @Override
  public Object doUnaryMinus(final long instance) {
    return NgLong.valueOf(-instance);
  }
  
  @Override
  public Object doUnaryMinus(final Object instance) {
    return NgLong.valueOf(-((NgLong)instance).getLongValue());
  }

  @Override
  public Object doPostfixIncrement(final long instance) {
    return NgLong.valueOf(instance + 1);
  }

  @Override
  public Object doPostfixIncrement(final Object instance) {
    return NgLong.valueOf(((NgLong)instance).getLongValue() + 1);
  }

  @Override
  public Object doPostfixDecrement(final long instance) {
    return NgLong.valueOf(instance - 1);
  }

  @Override
  public Object doPostfixDecrement(final Object instance) {
    return NgLong.valueOf(((NgLong)instance).getLongValue() - 1);
  }

  @Override
  public Object doPrefixIncrement(final long instance) {
    return NgLong.valueOf(instance + 1);
  }

  @Override
  public Object doPrefixIncrement(final Object instance) {
    return NgLong.valueOf(((NgLong)instance).getLongValue() + 1);
  }

  @Override
  public Object doPrefixDecrement(final long instance) {
    return NgLong.valueOf(instance - 1);
  }

  @Override
  public Object doPrefixDecrement(final Object instance) {
    return NgLong.valueOf(((NgLong)instance).getLongValue() - 1);
  }

  @Override
  public Object doAdd(final Object lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseAdd(((NgLong)lhs).getLongValue(), rhs);
  }

  @Override
  public Object doAdd(final long lhs, final byte rhs) {
    return NgLong.valueOf(lhs + rhs);
  }

  @Override
  public Object doAdd(final long lhs, final char rhs) {
    return NgLong.valueOf(lhs + rhs);
  }

  @Override
  public Object doAdd(final long lhs, final short rhs) {
    return NgLong.valueOf(lhs + rhs);
  }

  @Override
  public Object doAdd(final long lhs, final int rhs) {
    return NgLong.valueOf(lhs + rhs);
  }

  @Override
  public Object doAdd(final long lhs, final long rhs) {
    return NgLong.valueOf(lhs + rhs);
  }

  @Override
  public Object doAdd(final long lhs, final float rhs) {
    return NgFloat.valueOf(lhs + rhs);
  }

  @Override
  public Object doAdd(final long lhs, final double rhs) {
    return NgDouble.valueOf(lhs + rhs);
  }

  @Override
  public Object doAdd(final long lhs, final BigInteger rhs) {
    return BigInteger.valueOf(lhs).add(rhs);
  }

  @Override
  public Object doAdd(final long lhs, final BigDecimal rhs) {
    return new BigDecimal(lhs).add(rhs);
  }

  @Override
  public Object doAdd(final Object lhs, final byte rhs) {
    return doAdd(((NgLong)lhs).getLongValue(), rhs);
  }

  @Override
  public Object doAdd(final Object lhs, final char rhs) {
    return doAdd(((NgLong)lhs).getLongValue(), rhs);
  }

  @Override
  public Object doAdd(final Object lhs, final short rhs) {
    return doAdd(((NgLong)lhs).getLongValue(), rhs);
  }

  @Override
  public Object doAdd(final Object lhs, final int rhs) {
    return doAdd(((NgLong)lhs).getLongValue(), rhs);
  }

  @Override
  public Object doAdd(final Object lhs, final long rhs) {
    return doAdd(((NgLong)lhs).getLongValue(), rhs);
  }

  @Override
  public Object doAdd(final Object lhs, final float rhs) {
    return doAdd(((NgLong)lhs).getLongValue(), rhs);
  }

  @Override
  public Object doAdd(final Object lhs, final double rhs) {
    return doAdd(((NgLong)lhs).getLongValue(), rhs);
  }

  @Override
  public Object doAdd(final Object lhs, final BigInteger rhs) {
    return doAdd(((NgLong)lhs).getLongValue(), rhs);
  }

  @Override
  public Object doAdd(final Object lhs, final BigDecimal rhs) {
    return doAdd(((NgLong)lhs).getLongValue(), rhs);
  }

  @Override
  public Object doReverseAdd(final byte lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(byte.class).doAdd(lhs, ((NgLong)rhs).getLongValue());
  }

  @Override
  public Object doReverseAdd(final char lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(char.class).doAdd(lhs, ((NgLong)rhs).getLongValue());
  }

  @Override
  public Object doReverseAdd(final short lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(short.class).doAdd(lhs, ((NgLong)rhs).getLongValue());
  }

  @Override
  public Object doReverseAdd(final int lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(int.class).doAdd(lhs, ((NgLong)rhs).getLongValue());
  }

  @Override
  public Object doReverseAdd(final long lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(long.class).doAdd(lhs, ((NgLong)rhs).getLongValue());
  }

  @Override
  public Object doReverseAdd(final float lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(float.class).doAdd(lhs, ((NgLong)rhs).getLongValue());
  }

  @Override
  public Object doReverseAdd(final double lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(double.class).doAdd(lhs, ((NgLong)rhs).getLongValue());
  }

  @Override
  public Object doReverseAdd(final BigInteger lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(BigInteger.class).doAdd(lhs, ((NgLong)rhs).getLongValue());
  }

  @Override
  public Object doReverseAdd(final BigDecimal lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(BigDecimal.class).doAdd(lhs, ((NgLong)rhs).getLongValue());
  }

  @Override
  public Object doAddEquals(final Object lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseAddEquals(((NgLong)lhs).getLongValue(), rhs);
  }

  @Override
  public Object doAddEquals(final long lhs, final byte rhs) {
    return NgLong.valueOf(lhs + rhs);
  }

  @Override
  public Object doAddEquals(final long lhs, final char rhs) {
    return NgLong.valueOf(lhs + rhs);
  }

  @Override
  public Object doAddEquals(final long lhs, final short rhs) {
    return NgLong.valueOf(lhs + rhs);
  }

  @Override
  public Object doAddEquals(final long lhs, final int rhs) {
    return NgLong.valueOf(lhs + rhs);
  }

  @Override
  public Object doAddEquals(final long lhs, final long rhs) {
    return NgLong.valueOf(lhs + rhs);
  }

  @Override
  public Object doAddEquals(final long lhs, final float rhs) {
    return NgFloat.valueOf(lhs + rhs);
  }

  @Override
  public Object doAddEquals(final long lhs, final double rhs) {
    return NgDouble.valueOf(lhs + rhs);
  }

  @Override
  public Object doAddEquals(final long lhs, final BigInteger rhs) {
    return BigInteger.valueOf(lhs).add(rhs);
  }

  @Override
  public Object doAddEquals(final long lhs, final BigDecimal rhs) {
    return new BigDecimal(lhs).add(rhs);
  }

  @Override
  public Object doAddEquals(final Object lhs, final byte rhs) {
    return doAddEquals(((NgLong)lhs).getLongValue(), rhs);
  }

  @Override
  public Object doAddEquals(final Object lhs, final char rhs) {
    return doAddEquals(((NgLong)lhs).getLongValue(), rhs);
  }

  @Override
  public Object doAddEquals(final Object lhs, final short rhs) {
    return doAddEquals(((NgLong)lhs).getLongValue(), rhs);
  }

  @Override
  public Object doAddEquals(final Object lhs, final int rhs) {
    return doAddEquals(((NgLong)lhs).getLongValue(), rhs);
  }

  @Override
  public Object doAddEquals(final Object lhs, final long rhs) {
    return doAddEquals(((NgLong)lhs).getLongValue(), rhs);
  }

  @Override
  public Object doAddEquals(final Object lhs, final float rhs) {
    return doAddEquals(((NgLong)lhs).getLongValue(), rhs);
  }

  @Override
  public Object doAddEquals(final Object lhs, final double rhs) {
    return doAddEquals(((NgLong)lhs).getLongValue(), rhs);
  }

  @Override
  public Object doAddEquals(final Object lhs, final BigInteger rhs) {
    return doAddEquals(((NgLong)lhs).getLongValue(), rhs);
  }

  @Override
  public Object doAddEquals(final Object lhs, final BigDecimal rhs) {
    return doAddEquals(((NgLong)lhs).getLongValue(), rhs);
  }

  @Override
  public Object doReverseAddEquals(final byte lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(byte.class).doAddEquals(lhs, ((NgLong)rhs).getLongValue());
  }

  @Override
  public Object doReverseAddEquals(final char lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(char.class).doAddEquals(lhs, ((NgLong)rhs).getLongValue());
  }

  @Override
  public Object doReverseAddEquals(final short lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(short.class).doAddEquals(lhs, ((NgLong)rhs).getLongValue());
  }

  @Override
  public Object doReverseAddEquals(final int lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(int.class).doAddEquals(lhs, ((NgLong)rhs).getLongValue());
  }

  @Override
  public Object doReverseAddEquals(final long lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(long.class).doAddEquals(lhs, ((NgLong)rhs).getLongValue());
  }

  @Override
  public Object doReverseAddEquals(final float lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(float.class).doAddEquals(lhs, ((NgLong)rhs).getLongValue());
  }

  @Override
  public Object doReverseAddEquals(final double lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(double.class).doAddEquals(lhs, ((NgLong)rhs).getLongValue());
  }

  @Override
  public Object doReverseAddEquals(final BigInteger lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(BigInteger.class).doAddEquals(lhs, ((NgLong)rhs).getLongValue());
  }

  @Override
  public Object doReverseAddEquals(final BigDecimal lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(BigDecimal.class).doAddEquals(lhs, ((NgLong)rhs).getLongValue());
  }

  @Override
  public Object doSubtract(final Object lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseSubtract(((NgLong)lhs).getLongValue(), rhs);
  }

  @Override
  public Object doSubtract(final long lhs, final byte rhs) {
    return NgLong.valueOf(lhs - rhs);
  }

  @Override
  public Object doSubtract(final long lhs, final char rhs) {
    return NgLong.valueOf(lhs - rhs);
  }

  @Override
  public Object doSubtract(final long lhs, final short rhs) {
    return NgLong.valueOf(lhs - rhs);
  }

  @Override
  public Object doSubtract(final long lhs, final int rhs) {
    return NgLong.valueOf(lhs - rhs);
  }

  @Override
  public Object doSubtract(final long lhs, final long rhs) {
    return NgLong.valueOf(lhs - rhs);
  }

  @Override
  public Object doSubtract(final long lhs, final float rhs) {
    return NgFloat.valueOf(lhs - rhs);
  }

  @Override
  public Object doSubtract(final long lhs, final double rhs) {
    return NgDouble.valueOf(lhs - rhs);
  }

  @Override
  public Object doSubtract(final long lhs, final BigInteger rhs) {
    return BigInteger.valueOf(lhs).subtract(rhs);
  }

  @Override
  public Object doSubtract(final long lhs, final BigDecimal rhs) {
    return new BigDecimal(lhs).subtract(rhs);
  }

  @Override
  public Object doSubtract(final Object lhs, final byte rhs) {
    return doSubtract(((NgLong)lhs).getLongValue(), rhs);
  }

  @Override
  public Object doSubtract(final Object lhs, final char rhs) {
    return doSubtract(((NgLong)lhs).getLongValue(), rhs);
  }

  @Override
  public Object doSubtract(final Object lhs, final short rhs) {
    return doSubtract(((NgLong)lhs).getLongValue(), rhs);
  }

  @Override
  public Object doSubtract(final Object lhs, final int rhs) {
    return doSubtract(((NgLong)lhs).getLongValue(), rhs);
  }

  @Override
  public Object doSubtract(final Object lhs, final long rhs) {
    return doSubtract(((NgLong)lhs).getLongValue(), rhs);
  }

  @Override
  public Object doSubtract(final Object lhs, final float rhs) {
    return doSubtract(((NgLong)lhs).getLongValue(), rhs);
  }

  @Override
  public Object doSubtract(final Object lhs, final double rhs) {
    return doSubtract(((NgLong)lhs).getLongValue(), rhs);
  }

  @Override
  public Object doSubtract(final Object lhs, final BigInteger rhs) {
    return doSubtract(((NgLong)lhs).getLongValue(), rhs);
  }

  @Override
  public Object doSubtract(final Object lhs, final BigDecimal rhs) {
    return doSubtract(((NgLong)lhs).getLongValue(), rhs);
  }

  @Override
  public Object doReverseSubtract(final byte lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(byte.class).doSubtract(lhs, ((NgLong)rhs).getLongValue());
  }

  @Override
  public Object doReverseSubtract(final char lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(char.class).doSubtract(lhs, ((NgLong)rhs).getLongValue());
  }

  @Override
  public Object doReverseSubtract(final short lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(short.class).doSubtract(lhs, ((NgLong)rhs).getLongValue());
  }

  @Override
  public Object doReverseSubtract(final int lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(int.class).doSubtract(lhs, ((NgLong)rhs).getLongValue());
  }

  @Override
  public Object doReverseSubtract(final long lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(long.class).doSubtract(lhs, ((NgLong)rhs).getLongValue());
  }

  @Override
  public Object doReverseSubtract(final float lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(float.class).doSubtract(lhs, ((NgLong)rhs).getLongValue());
  }

  @Override
  public Object doReverseSubtract(final double lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(double.class).doSubtract(lhs, ((NgLong)rhs).getLongValue());
  }

  @Override
  public Object doReverseSubtract(final BigInteger lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(BigInteger.class).doSubtract(lhs, ((NgLong)rhs).getLongValue());
  }

  @Override
  public Object doReverseSubtract(final BigDecimal lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(BigDecimal.class).doSubtract(lhs, ((NgLong)rhs).getLongValue());
  }

  @Override
  public Object doSubtractEquals(final Object lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseSubtractEquals(((NgLong)lhs).getLongValue(), rhs);
  }

  @Override
  public Object doSubtractEquals(final long lhs, final byte rhs) {
    return NgLong.valueOf(lhs - rhs);
  }

  @Override
  public Object doSubtractEquals(final long lhs, final char rhs) {
    return NgLong.valueOf(lhs - rhs);
  }

  @Override
  public Object doSubtractEquals(final long lhs, final short rhs) {
    return NgLong.valueOf(lhs - rhs);
  }

  @Override
  public Object doSubtractEquals(final long lhs, final int rhs) {
    return NgLong.valueOf(lhs - rhs);
  }

  @Override
  public Object doSubtractEquals(final long lhs, final long rhs) {
    return NgLong.valueOf(lhs - rhs);
  }

  @Override
  public Object doSubtractEquals(final long lhs, final float rhs) {
    return NgFloat.valueOf(lhs - rhs);
  }

  @Override
  public Object doSubtractEquals(final long lhs, final double rhs) {
    return NgDouble.valueOf(lhs - rhs);
  }

  @Override
  public Object doSubtractEquals(final long lhs, final BigInteger rhs) {
    return BigInteger.valueOf(lhs).subtract(rhs);
  }

  @Override
  public Object doSubtractEquals(final long lhs, final BigDecimal rhs) {
    return new BigDecimal(lhs).subtract(rhs);
  }

  @Override
  public Object doSubtractEquals(final Object lhs, final byte rhs) {
    return doSubtractEquals(((NgLong)lhs).getLongValue(), rhs);
  }

  @Override
  public Object doSubtractEquals(final Object lhs, final char rhs) {
    return doSubtractEquals(((NgLong)lhs).getLongValue(), rhs);
  }

  @Override
  public Object doSubtractEquals(final Object lhs, final short rhs) {
    return doSubtractEquals(((NgLong)lhs).getLongValue(), rhs);
  }

  @Override
  public Object doSubtractEquals(final Object lhs, final int rhs) {
    return doSubtractEquals(((NgLong)lhs).getLongValue(), rhs);
  }

  @Override
  public Object doSubtractEquals(final Object lhs, final long rhs) {
    return doSubtractEquals(((NgLong)lhs).getLongValue(), rhs);
  }

  @Override
  public Object doSubtractEquals(final Object lhs, final float rhs) {
    return doSubtractEquals(((NgLong)lhs).getLongValue(), rhs);
  }

  @Override
  public Object doSubtractEquals(final Object lhs, final double rhs) {
    return doSubtractEquals(((NgLong)lhs).getLongValue(), rhs);
  }

  @Override
  public Object doSubtractEquals(final Object lhs, final BigInteger rhs) {
    return doSubtractEquals(((NgLong)lhs).getLongValue(), rhs);
  }

  @Override
  public Object doSubtractEquals(final Object lhs, final BigDecimal rhs) {
    return doSubtractEquals(((NgLong)lhs).getLongValue(), rhs);
  }

  @Override
  public Object doReverseSubtractEquals(final byte lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(byte.class).doSubtractEquals(lhs, ((NgLong)rhs).getLongValue());
  }

  @Override
  public Object doReverseSubtractEquals(final char lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(char.class).doSubtractEquals(lhs, ((NgLong)rhs).getLongValue());
  }

  @Override
  public Object doReverseSubtractEquals(final short lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(short.class).doSubtractEquals(lhs, ((NgLong)rhs).getLongValue());
  }

  @Override
  public Object doReverseSubtractEquals(final int lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(int.class).doSubtractEquals(lhs, ((NgLong)rhs).getLongValue());
  }

  @Override
  public Object doReverseSubtractEquals(final long lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(long.class).doSubtractEquals(lhs, ((NgLong)rhs).getLongValue());
  }

  @Override
  public Object doReverseSubtractEquals(final float lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(float.class).doSubtractEquals(lhs, ((NgLong)rhs).getLongValue());
  }

  @Override
  public Object doReverseSubtractEquals(final double lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(double.class).doSubtractEquals(lhs, ((NgLong)rhs).getLongValue());
  }

  @Override
  public Object doReverseSubtractEquals(final BigInteger lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(BigInteger.class).doSubtractEquals(lhs, ((NgLong)rhs).getLongValue());
  }

  @Override
  public Object doReverseSubtractEquals(final BigDecimal lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(BigDecimal.class).doSubtractEquals(lhs, ((NgLong)rhs).getLongValue());
  }

  @Override
  public Object doMultiply(final Object lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseMultiply(((NgLong)lhs).getLongValue(), rhs);
  }

  @Override
  public Object doMultiply(final long lhs, final byte rhs) {
    return NgLong.valueOf(lhs * rhs);
  }

  @Override
  public Object doMultiply(final long lhs, final char rhs) {
    return NgLong.valueOf(lhs * rhs);
  }

  @Override
  public Object doMultiply(final long lhs, final short rhs) {
    return NgLong.valueOf(lhs * rhs);
  }

  @Override
  public Object doMultiply(final long lhs, final int rhs) {
    return NgLong.valueOf(lhs * rhs);
  }

  @Override
  public Object doMultiply(final long lhs, final long rhs) {
    return NgLong.valueOf(lhs * rhs);
  }

  @Override
  public Object doMultiply(final long lhs, final float rhs) {
    return NgFloat.valueOf(lhs * rhs);
  }

  @Override
  public Object doMultiply(final long lhs, final double rhs) {
    return NgDouble.valueOf(lhs * rhs);
  }

  @Override
  public Object doMultiply(final long lhs, final BigInteger rhs) {
    return BigInteger.valueOf(lhs).multiply(rhs);
  }

  @Override
  public Object doMultiply(final long lhs, final BigDecimal rhs) {
    return new BigDecimal(lhs).multiply(rhs);
  }

  @Override
  public Object doMultiply(final Object lhs, final byte rhs) {
    return doMultiply(((NgLong)lhs).getLongValue(), rhs);
  }

  @Override
  public Object doMultiply(final Object lhs, final char rhs) {
    return doMultiply(((NgLong)lhs).getLongValue(), rhs);
  }

  @Override
  public Object doMultiply(final Object lhs, final short rhs) {
    return doMultiply(((NgLong)lhs).getLongValue(), rhs);
  }

  @Override
  public Object doMultiply(final Object lhs, final int rhs) {
    return doMultiply(((NgLong)lhs).getLongValue(), rhs);
  }

  @Override
  public Object doMultiply(final Object lhs, final long rhs) {
    return doMultiply(((NgLong)lhs).getLongValue(), rhs);
  }

  @Override
  public Object doMultiply(final Object lhs, final float rhs) {
    return doMultiply(((NgLong)lhs).getLongValue(), rhs);
  }

  @Override
  public Object doMultiply(final Object lhs, final double rhs) {
    return doMultiply(((NgLong)lhs).getLongValue(), rhs);
  }

  @Override
  public Object doMultiply(final Object lhs, final BigInteger rhs) {
    return doMultiply(((NgLong)lhs).getLongValue(), rhs);
  }

  @Override
  public Object doMultiply(final Object lhs, final BigDecimal rhs) {
    return doMultiply(((NgLong)lhs).getLongValue(), rhs);
  }

  @Override
  public Object doReverseMultiply(final byte lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(byte.class).doMultiply(lhs, ((NgLong)rhs).getLongValue());
  }

  @Override
  public Object doReverseMultiply(final char lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(char.class).doMultiply(lhs, ((NgLong)rhs).getLongValue());
  }

  @Override
  public Object doReverseMultiply(final short lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(short.class).doMultiply(lhs, ((NgLong)rhs).getLongValue());
  }

  @Override
  public Object doReverseMultiply(final int lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(int.class).doMultiply(lhs, ((NgLong)rhs).getLongValue());
  }

  @Override
  public Object doReverseMultiply(final long lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(long.class).doMultiply(lhs, ((NgLong)rhs).getLongValue());
  }

  @Override
  public Object doReverseMultiply(final float lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(float.class).doMultiply(lhs, ((NgLong)rhs).getLongValue());
  }

  @Override
  public Object doReverseMultiply(final double lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(double.class).doMultiply(lhs, ((NgLong)rhs).getLongValue());
  }

  @Override
  public Object doReverseMultiply(final BigInteger lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(BigInteger.class).doMultiply(lhs, ((NgLong)rhs).getLongValue());
  }

  @Override
  public Object doReverseMultiply(final BigDecimal lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(BigDecimal.class).doMultiply(lhs, ((NgLong)rhs).getLongValue());
  }

  @Override
  public Object doMultiplyEquals(final Object lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseMultiplyEquals(((NgLong)lhs).getLongValue(), rhs);
  }

  @Override
  public Object doMultiplyEquals(final long lhs, final byte rhs) {
    return NgLong.valueOf(lhs * rhs);
  }

  @Override
  public Object doMultiplyEquals(final long lhs, final char rhs) {
    return NgLong.valueOf(lhs * rhs);
  }

  @Override
  public Object doMultiplyEquals(final long lhs, final short rhs) {
    return NgLong.valueOf(lhs * rhs);
  }

  @Override
  public Object doMultiplyEquals(final long lhs, final int rhs) {
    return NgLong.valueOf(lhs * rhs);
  }

  @Override
  public Object doMultiplyEquals(final long lhs, final long rhs) {
    return NgLong.valueOf(lhs * rhs);
  }

  @Override
  public Object doMultiplyEquals(final long lhs, final float rhs) {
    return NgFloat.valueOf(lhs * rhs);
  }

  @Override
  public Object doMultiplyEquals(final long lhs, final double rhs) {
    return NgDouble.valueOf(lhs * rhs);
  }

  @Override
  public Object doMultiplyEquals(final long lhs, final BigInteger rhs) {
    return BigInteger.valueOf(lhs).multiply(rhs);
  }

  @Override
  public Object doMultiplyEquals(final long lhs, final BigDecimal rhs) {
    return new BigDecimal(lhs).multiply(rhs);
  }

  @Override
  public Object doMultiplyEquals(final Object lhs, final byte rhs) {
    return doMultiplyEquals(((NgLong)lhs).getLongValue(), rhs);
  }

  @Override
  public Object doMultiplyEquals(final Object lhs, final char rhs) {
    return doMultiplyEquals(((NgLong)lhs).getLongValue(), rhs);
  }

  @Override
  public Object doMultiplyEquals(final Object lhs, final short rhs) {
    return doMultiplyEquals(((NgLong)lhs).getLongValue(), rhs);
  }

  @Override
  public Object doMultiplyEquals(final Object lhs, final int rhs) {
    return doMultiplyEquals(((NgLong)lhs).getLongValue(), rhs);
  }

  @Override
  public Object doMultiplyEquals(final Object lhs, final long rhs) {
    return doMultiplyEquals(((NgLong)lhs).getLongValue(), rhs);
  }

  @Override
  public Object doMultiplyEquals(final Object lhs, final float rhs) {
    return doMultiplyEquals(((NgLong)lhs).getLongValue(), rhs);
  }

  @Override
  public Object doMultiplyEquals(final Object lhs, final double rhs) {
    return doMultiplyEquals(((NgLong)lhs).getLongValue(), rhs);
  }

  @Override
  public Object doMultiplyEquals(final Object lhs, final BigInteger rhs) {
    return doMultiplyEquals(((NgLong)lhs).getLongValue(), rhs);
  }

  @Override
  public Object doMultiplyEquals(final Object lhs, final BigDecimal rhs) {
    return doMultiplyEquals(((NgLong)lhs).getLongValue(), rhs);
  }

  @Override
  public Object doReverseMultiplyEquals(final byte lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(byte.class).doMultiplyEquals(lhs, ((NgLong)rhs).getLongValue());
  }

  @Override
  public Object doReverseMultiplyEquals(final char lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(char.class).doMultiplyEquals(lhs, ((NgLong)rhs).getLongValue());
  }

  @Override
  public Object doReverseMultiplyEquals(final short lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(short.class).doMultiplyEquals(lhs, ((NgLong)rhs).getLongValue());
  }

  @Override
  public Object doReverseMultiplyEquals(final int lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(int.class).doMultiplyEquals(lhs, ((NgLong)rhs).getLongValue());
  }

  @Override
  public Object doReverseMultiplyEquals(final long lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(long.class).doMultiplyEquals(lhs, ((NgLong)rhs).getLongValue());
  }

  @Override
  public Object doReverseMultiplyEquals(final float lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(float.class).doMultiplyEquals(lhs, ((NgLong)rhs).getLongValue());
  }

  @Override
  public Object doReverseMultiplyEquals(final double lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(double.class).doMultiplyEquals(lhs, ((NgLong)rhs).getLongValue());
  }

  @Override
  public Object doReverseMultiplyEquals(final BigInteger lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(BigInteger.class).doMultiplyEquals(lhs, ((NgLong)rhs).getLongValue());
  }

  @Override
  public Object doReverseMultiplyEquals(final BigDecimal lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(BigDecimal.class).doMultiplyEquals(lhs, ((NgLong)rhs).getLongValue());
  }

  @Override
  public Object doDivide(final Object lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseDivide(((NgLong)lhs).getLongValue(), rhs);
  }

  @Override
  public Object doDivide(final long lhs, final byte rhs) {
    return NgLong.valueOf(lhs / rhs);
  }

  @Override
  public Object doDivide(final long lhs, final char rhs) {
    return NgLong.valueOf(lhs / rhs);
  }

  @Override
  public Object doDivide(final long lhs, final short rhs) {
    return NgLong.valueOf(lhs / rhs);
  }

  @Override
  public Object doDivide(final long lhs, final int rhs) {
    return NgLong.valueOf(lhs / rhs);
  }

  @Override
  public Object doDivide(final long lhs, final long rhs) {
    return NgLong.valueOf(lhs / rhs);
  }

  @Override
  public Object doDivide(final long lhs, final float rhs) {
    return NgFloat.valueOf(lhs / rhs);
  }

  @Override
  public Object doDivide(final long lhs, final double rhs) {
    return NgDouble.valueOf(lhs / rhs);
  }

  @Override
  public Object doDivide(final long lhs, final BigInteger rhs) {
    return BigInteger.valueOf(lhs).divide(rhs);
  }

  @Override
  public Object doDivide(final long lhs, final BigDecimal rhs) {
    return new BigDecimal(lhs).divide(rhs);
  }

  @Override
  public Object doDivide(final Object lhs, final byte rhs) {
    return doDivide(((NgLong)lhs).getLongValue(), rhs);
  }

  @Override
  public Object doDivide(final Object lhs, final char rhs) {
    return doDivide(((NgLong)lhs).getLongValue(), rhs);
  }

  @Override
  public Object doDivide(final Object lhs, final short rhs) {
    return doDivide(((NgLong)lhs).getLongValue(), rhs);
  }

  @Override
  public Object doDivide(final Object lhs, final int rhs) {
    return doDivide(((NgLong)lhs).getLongValue(), rhs);
  }

  @Override
  public Object doDivide(final Object lhs, final long rhs) {
    return doDivide(((NgLong)lhs).getLongValue(), rhs);
  }

  @Override
  public Object doDivide(final Object lhs, final float rhs) {
    return doDivide(((NgLong)lhs).getLongValue(), rhs);
  }

  @Override
  public Object doDivide(final Object lhs, final double rhs) {
    return doDivide(((NgLong)lhs).getLongValue(), rhs);
  }

  @Override
  public Object doDivide(final Object lhs, final BigInteger rhs) {
    return doDivide(((NgLong)lhs).getLongValue(), rhs);
  }

  public Object doDivide(final Object lhs, final BigDecimal rhs) {
    return doDivide(((NgLong)lhs).getLongValue(), rhs);
  }

  public Object doReverseDivide(final byte lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(byte.class).doDivide(lhs, ((NgLong)rhs).getLongValue());
  }

  public Object doReverseDivide(final char lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(char.class).doDivide(lhs, ((NgLong)rhs).getLongValue());
  }

  public Object doReverseDivide(final short lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(short.class).doDivide(lhs, ((NgLong)rhs).getLongValue());
  }

  public Object doReverseDivide(final int lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(int.class).doDivide(lhs, ((NgLong)rhs).getLongValue());
  }

  public Object doReverseDivide(final long lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(long.class).doDivide(lhs, ((NgLong)rhs).getLongValue());
  }

  public Object doReverseDivide(final float lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(float.class).doDivide(lhs, ((NgLong)rhs).getLongValue());
  }

  public Object doReverseDivide(final double lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(double.class).doDivide(lhs, ((NgLong)rhs).getLongValue());
  }

  public Object doReverseDivide(final BigInteger lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(BigInteger.class).doDivide(lhs, ((NgLong)rhs).getLongValue());
  }

  public Object doReverseDivide(final BigDecimal lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(BigDecimal.class).doDivide(lhs, ((NgLong)rhs).getLongValue());
  }

  public Object doDivideEquals(final Object lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseDivideEquals(((NgLong)lhs).getLongValue(), rhs);
  }

  public Object doDivideEquals(final long lhs, final byte rhs) {
    return NgLong.valueOf(lhs / rhs);
  }

  public Object doDivideEquals(final long lhs, final char rhs) {
    return NgLong.valueOf(lhs / rhs);
  }

  public Object doDivideEquals(final long lhs, final short rhs) {
    return NgLong.valueOf(lhs / rhs);
  }

  public Object doDivideEquals(final long lhs, final int rhs) {
    return NgLong.valueOf(lhs / rhs);
  }

  public Object doDivideEquals(final long lhs, final long rhs) {
    return NgLong.valueOf(lhs / rhs);
  }

  public Object doDivideEquals(final long lhs, final float rhs) {
    return NgFloat.valueOf(lhs / rhs);
  }

  public Object doDivideEquals(final long lhs, final double rhs) {
    return NgDouble.valueOf(lhs / rhs);
  }

  public Object doDivideEquals(final long lhs, final BigInteger rhs) {
    return BigInteger.valueOf(lhs).divide(rhs);
  }

  public Object doDivideEquals(final long lhs, final BigDecimal rhs) {
    return new BigDecimal(lhs).divide(rhs);
  }

  public Object doDivideEquals(final Object lhs, final byte rhs) {
    return doDivideEquals(((NgLong)lhs).getLongValue(), rhs);
  }

  public Object doDivideEquals(final Object lhs, final char rhs) {
    return doDivideEquals(((NgLong)lhs).getLongValue(), rhs);
  }

  public Object doDivideEquals(final Object lhs, final short rhs) {
    return doDivideEquals(((NgLong)lhs).getLongValue(), rhs);
  }

  public Object doDivideEquals(final Object lhs, final int rhs) {
    return doDivideEquals(((NgLong)lhs).getLongValue(), rhs);
  }

  public Object doDivideEquals(final Object lhs, final long rhs) {
    return doDivideEquals(((NgLong)lhs).getLongValue(), rhs);
  }

  public Object doDivideEquals(final Object lhs, final float rhs) {
    return doDivideEquals(((NgLong)lhs).getLongValue(), rhs);
  }

  public Object doDivideEquals(final Object lhs, final double rhs) {
    return doDivideEquals(((NgLong)lhs).getLongValue(), rhs);
  }

  public Object doDivideEquals(final Object lhs, final BigInteger rhs) {
    return doDivideEquals(((NgLong)lhs).getLongValue(), rhs);
  }

  public Object doDivideEquals(final Object lhs, final BigDecimal rhs) {
    return doDivideEquals(((NgLong)lhs).getLongValue(), rhs);
  }

  public Object doReverseDivideEquals(final byte lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(byte.class).doDivideEquals(lhs, ((NgLong)rhs).getLongValue());
  }

  public Object doReverseDivideEquals(final char lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(char.class).doDivideEquals(lhs, ((NgLong)rhs).getLongValue());
  }

  public Object doReverseDivideEquals(final short lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(short.class).doDivideEquals(lhs, ((NgLong)rhs).getLongValue());
  }

  public Object doReverseDivideEquals(final int lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(int.class).doDivideEquals(lhs, ((NgLong)rhs).getLongValue());
  }

  public Object doReverseDivideEquals(final long lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(long.class).doDivideEquals(lhs, ((NgLong)rhs).getLongValue());
  }

  public Object doReverseDivideEquals(final float lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(float.class).doDivideEquals(lhs, ((NgLong)rhs).getLongValue());
  }

  public Object doReverseDivideEquals(final double lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(double.class).doDivideEquals(lhs, ((NgLong)rhs).getLongValue());
  }

  public Object doReverseDivideEquals(final BigInteger lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(BigInteger.class).doDivideEquals(lhs, ((NgLong)rhs).getLongValue());
  }

  public Object doReverseDivideEquals(final BigDecimal lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(BigDecimal.class).doDivideEquals(lhs, ((NgLong)rhs).getLongValue());
  }

  public Object doRemainder(final Object lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseRemainder(((NgLong)lhs).getLongValue(), rhs);
  }

  public Object doRemainder(final long lhs, final byte rhs) {
    return NgLong.valueOf(lhs % rhs);
  }

  public Object doRemainder(final long lhs, final char rhs) {
    return NgLong.valueOf(lhs % rhs);
  }

  public Object doRemainder(final long lhs, final short rhs) {
    return NgLong.valueOf(lhs % rhs);
  }

  public Object doRemainder(final long lhs, final int rhs) {
    return NgLong.valueOf(lhs % rhs);
  }

  public Object doRemainder(final long lhs, final long rhs) {
    return NgLong.valueOf(lhs % rhs);
  }

  public Object doRemainder(final long lhs, final BigInteger rhs) {
    return BigInteger.valueOf(lhs).mod(rhs);
  }

  public Object doRemainder(final Object lhs, final byte rhs) {
    return doRemainder(((NgLong)lhs).getLongValue(), rhs);
  }

  public Object doRemainder(final Object lhs, final char rhs) {
    return doRemainder(((NgLong)lhs).getLongValue(), rhs);
  }

  public Object doRemainder(final Object lhs, final short rhs) {
    return doRemainder(((NgLong)lhs).getLongValue(), rhs);
  }

  public Object doRemainder(final Object lhs, final int rhs) {
    return doRemainder(((NgLong)lhs).getLongValue(), rhs);
  }

  public Object doRemainder(final Object lhs, final long rhs) {
    return doRemainder(((NgLong)lhs).getLongValue(), rhs);
  }

  public Object doRemainder(final Object lhs, final BigInteger rhs) {
    return doRemainder(((NgLong)lhs).getLongValue(), rhs);
  }

  public Object doReverseRemainder(final byte lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(byte.class).doRemainder(lhs, ((NgLong)rhs).getLongValue());
  }

  public Object doReverseRemainder(final char lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(char.class).doRemainder(lhs, ((NgLong)rhs).getLongValue());
  }

  public Object doReverseRemainder(final short lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(short.class).doRemainder(lhs, ((NgLong)rhs).getLongValue());
  }

  public Object doReverseRemainder(final int lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(int.class).doRemainder(lhs, ((NgLong)rhs).getLongValue());
  }

  public Object doReverseRemainder(final long lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(long.class).doRemainder(lhs, ((NgLong)rhs).getLongValue());
  }

  public Object doReverseRemainder(final BigInteger lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(BigInteger.class).doRemainder(lhs, ((NgLong)rhs).getLongValue());
  }

  public Object doRemainderEquals(final Object lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseRemainderEquals(((NgLong)lhs).getLongValue(), rhs);
  }

  public Object doRemainderEquals(final long lhs, final byte rhs) {
    return NgLong.valueOf(lhs % rhs);
  }

  public Object doRemainderEquals(final long lhs, final char rhs) {
    return NgLong.valueOf(lhs % rhs);
  }

  public Object doRemainderEquals(final long lhs, final short rhs) {
    return NgLong.valueOf(lhs % rhs);
  }

  public Object doRemainderEquals(final long lhs, final int rhs) {
    return NgLong.valueOf(lhs % rhs);
  }

  public Object doRemainderEquals(final long lhs, final long rhs) {
    return NgLong.valueOf(lhs % rhs);
  }

  public Object doRemainderEquals(final long lhs, final BigInteger rhs) {
    return BigInteger.valueOf(lhs).mod(rhs);
  }

  public Object doRemainderEquals(final Object lhs, final byte rhs) {
    return doRemainderEquals(((NgLong)lhs).getLongValue(), rhs);
  }

  public Object doRemainderEquals(final Object lhs, final char rhs) {
    return doRemainderEquals(((NgLong)lhs).getLongValue(), rhs);
  }

  public Object doRemainderEquals(final Object lhs, final short rhs) {
    return doRemainderEquals(((NgLong)lhs).getLongValue(), rhs);
  }

  public Object doRemainderEquals(final Object lhs, final int rhs) {
    return doRemainderEquals(((NgLong)lhs).getLongValue(), rhs);
  }

  public Object doRemainderEquals(final Object lhs, final long rhs) {
    return doRemainderEquals(((NgLong)lhs).getLongValue(), rhs);
  }

  public Object doRemainderEquals(final Object lhs, final BigInteger rhs) {
    return doRemainderEquals(((NgLong)lhs).getLongValue(), rhs);
  }

  public Object doReverseRemainderEquals(final byte lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(byte.class).doRemainderEquals(lhs, ((NgLong)rhs).getLongValue());
  }

  public Object doReverseRemainderEquals(final char lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(char.class).doRemainderEquals(lhs, ((NgLong)rhs).getLongValue());
  }

  public Object doReverseRemainderEquals(final short lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(short.class).doRemainderEquals(lhs, ((NgLong)rhs).getLongValue());
  }

  public Object doReverseRemainderEquals(final int lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(int.class).doRemainderEquals(lhs, ((NgLong)rhs).getLongValue());
  }

  public Object doReverseRemainderEquals(final long lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(long.class).doRemainderEquals(lhs, ((NgLong)rhs).getLongValue());
  }

  public Object doReverseRemainderEquals(final BigInteger lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(BigInteger.class).doRemainderEquals(lhs, ((NgLong)rhs).getLongValue());
  }

  public Object doIntegerDivide(final Object lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseIntegerDivide(((NgLong)lhs).getLongValue(), rhs);
  }

  public Object doIntegerDivide(final long lhs, final byte rhs) {
    return NgLong.valueOf(lhs / rhs);
  }

  public Object doIntegerDivide(final long lhs, final char rhs) {
    return NgLong.valueOf(lhs / rhs);
  }

  public Object doIntegerDivide(final long lhs, final short rhs) {
    return NgLong.valueOf(lhs / rhs);
  }

  public Object doIntegerDivide(final long lhs, final int rhs) {
    return NgLong.valueOf(lhs / rhs);
  }

  public Object doIntegerDivide(final long lhs, final long rhs) {
    return NgLong.valueOf(lhs / rhs);
  }

  public Object doIntegerDivide(final long lhs, final float rhs) {
    return NgFloat.valueOf((float)Math.floor(lhs / rhs));
  }

  public Object doIntegerDivide(final long lhs, final double rhs) {
    return NgDouble.valueOf(Math.floor(lhs / rhs));
  }

  public Object doIntegerDivide(final long lhs, final BigInteger rhs) {
    return BigInteger.valueOf(lhs).divide(rhs);
  }

  public Object doIntegerDivide(final long lhs, final BigDecimal rhs) {
    return BigDecimal.valueOf(lhs).divideToIntegralValue(rhs);
  }

  public Object doIntegerDivide(final Object lhs, final byte rhs) {
    return doIntegerDivide(((NgLong)lhs).getLongValue(), rhs);
  }

  public Object doIntegerDivide(final Object lhs, final char rhs) {
    return doIntegerDivide(((NgLong)lhs).getLongValue(), rhs);
  }

  public Object doIntegerDivide(final Object lhs, final short rhs) {
    return doIntegerDivide(((NgLong)lhs).getLongValue(), rhs);
  }

  public Object doIntegerDivide(final Object lhs, final int rhs) {
    return doIntegerDivide(((NgLong)lhs).getLongValue(), rhs);
  }

  public Object doIntegerDivide(final Object lhs, final long rhs) {
    return doIntegerDivide(((NgLong)lhs).getLongValue(), rhs);
  }

  public Object doIntegerDivide(final Object lhs, final float rhs) {
    return doIntegerDivide(((NgLong)lhs).getLongValue(), rhs);
  }

  public Object doIntegerDivide(final Object lhs, final double rhs) {
    return doIntegerDivide(((NgLong)lhs).getLongValue(), rhs);
  }

  public Object doIntegerDivide(final Object lhs, final BigInteger rhs) {
    return doIntegerDivide(((NgLong)lhs).getLongValue(), rhs);
  }

  public Object doIntegerDivide(final Object lhs, final BigDecimal rhs) {
    return doIntegerDivide(((NgLong)lhs).getLongValue(), rhs);
  }

  public Object doReverseIntegerDivide(final byte lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(byte.class).doIntegerDivide(lhs, ((NgLong)rhs).getLongValue());
  }

  public Object doReverseIntegerDivide(final char lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(char.class).doIntegerDivide(lhs, ((NgLong)rhs).getLongValue());
  }

  public Object doReverseIntegerDivide(final short lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(short.class).doIntegerDivide(lhs, ((NgLong)rhs).getLongValue());
  }

  public Object doReverseIntegerDivide(final int lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(int.class).doIntegerDivide(lhs, ((NgLong)rhs).getLongValue());
  }

  public Object doReverseIntegerDivide(final long lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(long.class).doIntegerDivide(lhs, ((NgLong)rhs).getLongValue());
  }

  public Object doReverseIntegerDivide(final float lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(float.class).doIntegerDivide(lhs, ((NgLong)rhs).getLongValue());
  }

  public Object doReverseIntegerDivide(final double lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(double.class).doIntegerDivide(lhs, ((NgLong)rhs).getLongValue());
  }

  public Object doReverseIntegerDivide(final BigInteger lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(BigInteger.class).doIntegerDivide(lhs, ((NgLong)rhs).getLongValue());
  }

  public Object doReverseIntegerDivide(final BigDecimal lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(BigDecimal.class).doIntegerDivide(lhs, ((NgLong)rhs).getLongValue());
  }

  public Object doIntegerDivideEquals(final Object lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseIntegerDivideEquals(((NgLong)lhs).getLongValue(), rhs);
  }

  public Object doIntegerDivideEquals(final long lhs, final byte rhs) {
    return NgLong.valueOf(lhs / rhs);
  }

  public Object doIntegerDivideEquals(final long lhs, final char rhs) {
    return NgLong.valueOf(lhs / rhs);
  }

  public Object doIntegerDivideEquals(final long lhs, final short rhs) {
    return NgLong.valueOf(lhs / rhs);
  }

  public Object doIntegerDivideEquals(final long lhs, final int rhs) {
    return NgLong.valueOf(lhs / rhs);
  }

  public Object doIntegerDivideEquals(final long lhs, final long rhs) {
    return NgLong.valueOf(lhs / rhs);
  }

  public Object doIntegerDivideEquals(final long lhs, final float rhs) {
    return NgFloat.valueOf((float)Math.floor(lhs / rhs));
  }

  public Object doIntegerDivideEquals(final long lhs, final double rhs) {
    return NgDouble.valueOf(Math.floor(lhs / rhs));
  }

  public Object doIntegerDivideEquals(final long lhs, final BigInteger rhs) {
    return BigInteger.valueOf(lhs).divide(rhs);
  }

  public Object doIntegerDivideEquals(final long lhs, final BigDecimal rhs) {
    return BigDecimal.valueOf(lhs).divideToIntegralValue(rhs);
  }

  public Object doIntegerDivideEquals(final Object lhs, final byte rhs) {
    return doIntegerDivideEquals(((NgLong)lhs).getLongValue(), rhs);
  }

  public Object doIntegerDivideEquals(final Object lhs, final char rhs) {
    return doIntegerDivideEquals(((NgLong)lhs).getLongValue(), rhs);
  }

  public Object doIntegerDivideEquals(final Object lhs, final short rhs) {
    return doIntegerDivideEquals(((NgLong)lhs).getLongValue(), rhs);
  }

  public Object doIntegerDivideEquals(final Object lhs, final int rhs) {
    return doIntegerDivideEquals(((NgLong)lhs).getLongValue(), rhs);
  }

  public Object doIntegerDivideEquals(final Object lhs, final long rhs) {
    return doIntegerDivideEquals(((NgLong)lhs).getLongValue(), rhs);
  }

  public Object doIntegerDivideEquals(final Object lhs, final float rhs) {
    return doIntegerDivideEquals(((NgLong)lhs).getLongValue(), rhs);
  }

  public Object doIntegerDivideEquals(final Object lhs, final double rhs) {
    return doIntegerDivideEquals(((NgLong)lhs).getLongValue(), rhs);
  }

  public Object doIntegerDivideEquals(final Object lhs, final BigInteger rhs) {
    return doIntegerDivideEquals(((NgLong)lhs).getLongValue(), rhs);
  }

  public Object doIntegerDivideEquals(final Object lhs, final BigDecimal rhs) {
    return doIntegerDivideEquals(((NgLong)lhs).getLongValue(), rhs);
  }

  public Object doReverseIntegerDivideEquals(final byte lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(byte.class).doIntegerDivideEquals(lhs, ((NgLong)rhs).getLongValue());
  }

  public Object doReverseIntegerDivideEquals(final char lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(char.class).doIntegerDivideEquals(lhs, ((NgLong)rhs).getLongValue());
  }

  public Object doReverseIntegerDivideEquals(final short lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(short.class).doIntegerDivideEquals(lhs, ((NgLong)rhs).getLongValue());
  }

  public Object doReverseIntegerDivideEquals(final int lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(int.class).doIntegerDivideEquals(lhs, ((NgLong)rhs).getLongValue());
  }

  public Object doReverseIntegerDivideEquals(final long lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(long.class).doIntegerDivideEquals(lhs, ((NgLong)rhs).getLongValue());
  }

  public Object doReverseIntegerDivideEquals(final float lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(float.class).doIntegerDivide(lhs, ((NgLong)rhs).getLongValue());
  }

  public Object doReverseIntegerDivideEquals(final double lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(double.class).doIntegerDivide(lhs, ((NgLong)rhs).getLongValue());
  }

  public Object doReverseIntegerDivideEquals(final BigInteger lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(BigInteger.class).doIntegerDivideEquals(lhs, ((NgLong)rhs).getLongValue());
  }

  public Object doReverseIntegerDivideEquals(final BigDecimal lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(BigDecimal.class).doIntegerDivideEquals(lhs, ((NgLong)rhs).getLongValue());
  }

  public Object doAnd(final Object lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseAnd(((NgLong)lhs).getLongValue(), rhs);
  }

  public Object doAnd(final long lhs, final byte rhs) {
    return NgLong.valueOf(lhs & rhs);
  }

  public Object doAnd(final long lhs, final char rhs) {
    return NgLong.valueOf(lhs & rhs);
  }

  public Object doAnd(final long lhs, final short rhs) {
    return NgLong.valueOf(lhs & rhs);
  }

  public Object doAnd(final long lhs, final int rhs) {
    return NgLong.valueOf(lhs & rhs);
  }

  public Object doAnd(final long lhs, final long rhs) {
    return NgLong.valueOf(lhs & rhs);
  }

  public Object doAnd(final long lhs, final BigInteger rhs) {
    return BigInteger.valueOf(lhs).and(rhs);
  }

  public Object doAnd(final Object lhs, final byte rhs) {
    return doAnd(((NgLong)lhs).getLongValue(), rhs);
  }

  public Object doAnd(final Object lhs, final char rhs) {
    return doAnd(((NgLong)lhs).getLongValue(), rhs);
  }

  public Object doAnd(final Object lhs, final short rhs) {
    return doAnd(((NgLong)lhs).getLongValue(), rhs);
  }

  public Object doAnd(final Object lhs, final int rhs) {
    return doAnd(((NgLong)lhs).getLongValue(), rhs);
  }

  public Object doAnd(final Object lhs, final long rhs) {
    return doAnd(((NgLong)lhs).getLongValue(), rhs);
  }

  public Object doAnd(final Object lhs, final BigInteger rhs) {
    return doAnd(((NgLong)lhs).getLongValue(), rhs);
  }

  public Object doReverseAnd(final byte lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(byte.class).doAnd(lhs, ((NgLong)rhs).getLongValue());
  }

  public Object doReverseAnd(final char lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(char.class).doAnd(lhs, ((NgLong)rhs).getLongValue());
  }

  public Object doReverseAnd(final short lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(short.class).doAnd(lhs, ((NgLong)rhs).getLongValue());
  }

  public Object doReverseAnd(final int lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(int.class).doAnd(lhs, ((NgLong)rhs).getLongValue());
  }

  public Object doReverseAnd(final long lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(long.class).doAnd(lhs, ((NgLong)rhs).getLongValue());
  }

  public Object doReverseAnd(final BigInteger lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(BigInteger.class).doAnd(lhs, ((NgLong)rhs).getLongValue());
  }

  public Object doAndEquals(final Object lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseAndEquals(((NgLong)lhs).getLongValue(), rhs);
  }

  public Object doAndEquals(final long lhs, final byte rhs) {
    return NgLong.valueOf(lhs & rhs);
  }

  public Object doAndEquals(final long lhs, final char rhs) {
    return NgLong.valueOf(lhs & rhs);
  }

  public Object doAndEquals(final long lhs, final short rhs) {
    return NgLong.valueOf(lhs & rhs);
  }

  public Object doAndEquals(final long lhs, final int rhs) {
    return NgLong.valueOf(lhs & rhs);
  }

  public Object doAndEquals(final long lhs, final long rhs) {
    return NgLong.valueOf(lhs & rhs);
  }

  public Object doAndEquals(final long lhs, final BigInteger rhs) {
    return BigInteger.valueOf(lhs).and(rhs);
  }

  public Object doAndEquals(final Object lhs, final byte rhs) {
    return doAndEquals(((NgLong)lhs).getLongValue(), rhs);
  }

  public Object doAndEquals(final Object lhs, final char rhs) {
    return doAndEquals(((NgLong)lhs).getLongValue(), rhs);
  }

  public Object doAndEquals(final Object lhs, final short rhs) {
    return doAndEquals(((NgLong)lhs).getLongValue(), rhs);
  }

  public Object doAndEquals(final Object lhs, final int rhs) {
    return doAndEquals(((NgLong)lhs).getLongValue(), rhs);
  }

  public Object doAndEquals(final Object lhs, final long rhs) {
    return doAndEquals(((NgLong)lhs).getLongValue(), rhs);
  }

  public Object doAndEquals(final Object lhs, final BigInteger rhs) {
    return doAndEquals(((NgLong)lhs).getLongValue(), rhs);
  }

  public Object doReverseAndEquals(final byte lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(byte.class).doAndEquals(lhs, ((NgLong)rhs).getLongValue());
  }

  public Object doReverseAndEquals(final char lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(char.class).doAndEquals(lhs, ((NgLong)rhs).getLongValue());
  }

  public Object doReverseAndEquals(final short lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(short.class).doAndEquals(lhs, ((NgLong)rhs).getLongValue());
  }

  public Object doReverseAndEquals(final int lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(int.class).doAndEquals(lhs, ((NgLong)rhs).getLongValue());
  }

  public Object doReverseAndEquals(final long lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(long.class).doAndEquals(lhs, ((NgLong)rhs).getLongValue());
  }

  public Object doReverseAndEquals(final BigInteger lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(BigInteger.class).doAndEquals(lhs, ((NgLong)rhs).getLongValue());
  }

  public Object doOr(final Object lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseOr(((NgLong)lhs).getLongValue(), rhs);
  }

  public Object doOr(final long lhs, final byte rhs) {
    return NgLong.valueOf(lhs | rhs);
  }

  public Object doOr(final long lhs, final char rhs) {
    return NgLong.valueOf(lhs | rhs);
  }

  public Object doOr(final long lhs, final short rhs) {
    return NgLong.valueOf(lhs | rhs);
  }

  public Object doOr(final long lhs, final int rhs) {
    return NgLong.valueOf(lhs | rhs);
  }

  public Object doOr(final long lhs, final long rhs) {
    return NgLong.valueOf(lhs | rhs);
  }

  public Object doOr(final long lhs, final BigInteger rhs) {
    return BigInteger.valueOf(lhs).or(rhs);
  }

  public Object doOr(final Object lhs, final byte rhs) {
    return doOr(((NgLong)lhs).getLongValue(), rhs);
  }

  public Object doOr(final Object lhs, final char rhs) {
    return doOr(((NgLong)lhs).getLongValue(), rhs);
  }

  public Object doOr(final Object lhs, final short rhs) {
    return doOr(((NgLong)lhs).getLongValue(), rhs);
  }

  public Object doOr(final Object lhs, final int rhs) {
    return doOr(((NgLong)lhs).getLongValue(), rhs);
  }

  public Object doOr(final Object lhs, final long rhs) {
    return doOr(((NgLong)lhs).getLongValue(), rhs);
  }

  public Object doOr(final Object lhs, final BigInteger rhs) {
    return doOr(((NgLong)lhs).getLongValue(), rhs);
  }

  public Object doReverseOr(final byte lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(byte.class).doOr(lhs, ((NgLong)rhs).getLongValue());
  }

  public Object doReverseOr(final char lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(char.class).doOr(lhs, ((NgLong)rhs).getLongValue());
  }

  public Object doReverseOr(final short lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(short.class).doOr(lhs, ((NgLong)rhs).getLongValue());
  }

  public Object doReverseOr(final int lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(int.class).doOr(lhs, ((NgLong)rhs).getLongValue());
  }

  public Object doReverseOr(final long lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(long.class).doOr(lhs, ((NgLong)rhs).getLongValue());
  }

  public Object doReverseOr(final BigInteger lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(BigInteger.class).doOr(lhs, ((NgLong)rhs).getLongValue());
  }

  public Object doOrEquals(final Object lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseOrEquals(((NgLong)lhs).getLongValue(), rhs);
  }

  public Object doOrEquals(final long lhs, final byte rhs) {
    return NgLong.valueOf(lhs | rhs);
  }

  public Object doOrEquals(final long lhs, final char rhs) {
    return NgLong.valueOf(lhs | rhs);
  }

  public Object doOrEquals(final long lhs, final short rhs) {
    return NgLong.valueOf(lhs | rhs);
  }

  public Object doOrEquals(final long lhs, final int rhs) {
    return NgLong.valueOf(lhs | rhs);
  }

  public Object doOrEquals(final long lhs, final long rhs) {
    return NgLong.valueOf(lhs | rhs);
  }

  public Object doOrEquals(final long lhs, final BigInteger rhs) {
    return BigInteger.valueOf(lhs).or(rhs);
  }

  public Object doOrEquals(final Object lhs, final byte rhs) {
    return doOrEquals(((NgLong)lhs).getLongValue(), rhs);
  }

  public Object doOrEquals(final Object lhs, final char rhs) {
    return doOrEquals(((NgLong)lhs).getLongValue(), rhs);
  }

  public Object doOrEquals(final Object lhs, final short rhs) {
    return doOrEquals(((NgLong)lhs).getLongValue(), rhs);
  }

  public Object doOrEquals(final Object lhs, final int rhs) {
    return doOrEquals(((NgLong)lhs).getLongValue(), rhs);
  }

  public Object doOrEquals(final Object lhs, final long rhs) {
    return doOrEquals(((NgLong)lhs).getLongValue(), rhs);
  }

  public Object doOrEquals(final Object lhs, final BigInteger rhs) {
    return doOrEquals(((NgLong)lhs).getLongValue(), rhs);
  }

  public Object doReverseOrEquals(final byte lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(byte.class).doOrEquals(lhs, ((NgLong)rhs).getLongValue());
  }

  public Object doReverseOrEquals(final char lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(char.class).doOrEquals(lhs, ((NgLong)rhs).getLongValue());
  }

  public Object doReverseOrEquals(final short lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(short.class).doOrEquals(lhs, ((NgLong)rhs).getLongValue());
  }

  public Object doReverseOrEquals(final int lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(int.class).doOrEquals(lhs, ((NgLong)rhs).getLongValue());
  }

  public Object doReverseOrEquals(final long lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(long.class).doOrEquals(lhs, ((NgLong)rhs).getLongValue());
  }

  public Object doReverseOrEquals(final BigInteger lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(BigInteger.class).doOrEquals(lhs, ((NgLong)rhs).getLongValue());
  }

  public Object doXor(final Object lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseXor(((NgLong)lhs).getLongValue(), rhs);
  }

  public Object doXor(final long lhs, final byte rhs) {
    return NgLong.valueOf(lhs ^ rhs);
  }

  public Object doXor(final long lhs, final char rhs) {
    return NgLong.valueOf(lhs ^ rhs);
  }

  public Object doXor(final long lhs, final short rhs) {
    return NgLong.valueOf(lhs ^ rhs);
  }

  public Object doXor(final long lhs, final int rhs) {
    return NgLong.valueOf(lhs ^ rhs);
  }

  public Object doXor(final long lhs, final long rhs) {
    return NgLong.valueOf(lhs ^ rhs);
  }

  public Object doXor(final long lhs, final BigInteger rhs) {
    return BigInteger.valueOf(lhs).xor(rhs);
  }

  public Object doXor(final Object lhs, final byte rhs) {
    return doXor(((NgLong)lhs).getLongValue(), rhs);
  }

  public Object doXor(final Object lhs, final char rhs) {
    return doXor(((NgLong)lhs).getLongValue(), rhs);
  }

  public Object doXor(final Object lhs, final short rhs) {
    return doXor(((NgLong)lhs).getLongValue(), rhs);
  }

  public Object doXor(final Object lhs, final int rhs) {
    return doXor(((NgLong)lhs).getLongValue(), rhs);
  }

  public Object doXor(final Object lhs, final long rhs) {
    return doXor(((NgLong)lhs).getLongValue(), rhs);
  }

  public Object doXor(final Object lhs, final BigInteger rhs) {
    return doXor(((NgLong)lhs).getLongValue(), rhs);
  }

  public Object doReverseXor(final byte lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(byte.class).doXor(lhs, ((NgLong)rhs).getLongValue());
  }

  public Object doReverseXor(final char lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(char.class).doXor(lhs, ((NgLong)rhs).getLongValue());
  }

  public Object doReverseXor(final short lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(short.class).doXor(lhs, ((NgLong)rhs).getLongValue());
  }

  public Object doReverseXor(final int lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(int.class).doXor(lhs, ((NgLong)rhs).getLongValue());
  }

  public Object doReverseXor(final long lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(long.class).doXor(lhs, ((NgLong)rhs).getLongValue());
  }

  public Object doReverseXor(final BigInteger lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(BigInteger.class).doXor(lhs, ((NgLong)rhs).getLongValue());
  }

  public Object doXorEquals(final Object lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseXorEquals(((NgLong)lhs).getLongValue(), rhs);
  }

  public Object doXorEquals(final long lhs, final byte rhs) {
    return NgLong.valueOf(lhs ^ rhs);
  }

  public Object doXorEquals(final long lhs, final char rhs) {
    return NgLong.valueOf(lhs ^ rhs);
  }

  public Object doXorEquals(final long lhs, final short rhs) {
    return NgLong.valueOf(lhs ^ rhs);
  }

  public Object doXorEquals(final long lhs, final int rhs) {
    return NgLong.valueOf(lhs ^ rhs);
  }

  public Object doXorEquals(final long lhs, final long rhs) {
    return NgLong.valueOf(lhs ^ rhs);
  }

  public Object doXorEquals(final long lhs, final BigInteger rhs) {
    return BigInteger.valueOf(lhs).xor(rhs);
  }

  public Object doXorEquals(final Object lhs, final byte rhs) {
    return doXorEquals(((NgLong)lhs).getLongValue(), rhs);
  }

  public Object doXorEquals(final Object lhs, final char rhs) {
    return doXorEquals(((NgLong)lhs).getLongValue(), rhs);
  }

  public Object doXorEquals(final Object lhs, final short rhs) {
    return doXorEquals(((NgLong)lhs).getLongValue(), rhs);
  }

  public Object doXorEquals(final Object lhs, final int rhs) {
    return doXorEquals(((NgLong)lhs).getLongValue(), rhs);
  }

  public Object doXorEquals(final Object lhs, final long rhs) {
    return doXorEquals(((NgLong)lhs).getLongValue(), rhs);
  }

  public Object doXorEquals(final Object lhs, final BigInteger rhs) {
    return doXorEquals(((NgLong)lhs).getLongValue(), rhs);
  }

  public Object doReverseXorEquals(final byte lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(byte.class).doXorEquals(lhs, ((NgLong)rhs).getLongValue());
  }

  public Object doReverseXorEquals(final char lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(char.class).doXorEquals(lhs, ((NgLong)rhs).getLongValue());
  }

  public Object doReverseXorEquals(final short lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(short.class).doXorEquals(lhs, ((NgLong)rhs).getLongValue());
  }

  public Object doReverseXorEquals(final int lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(int.class).doXorEquals(lhs, ((NgLong)rhs).getLongValue());
  }

  public Object doReverseXorEquals(final long lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(long.class).doXorEquals(lhs, ((NgLong)rhs).getLongValue());
  }

  public Object doReverseXorEquals(final BigInteger lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(BigInteger.class).doXorEquals(lhs, ((NgLong)rhs).getLongValue());
  }

  public Object doLeftShift(final Object lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseLeftShift(((NgLong)lhs).getLongValue(), rhs);
  }

  public Object doLeftShift(final long lhs, final byte rhs) {
    return NgLong.valueOf(lhs << rhs);
  }

  public Object doLeftShift(final long lhs, final char rhs) {
    return NgLong.valueOf(lhs << rhs);
  }

  public Object doLeftShift(final long lhs, final short rhs) {
    return NgLong.valueOf(lhs << rhs);
  }

  public Object doLeftShift(final long lhs, final int rhs) {
    return NgLong.valueOf(lhs << rhs);
  }

  public Object doLeftShift(final long lhs, final long rhs) {
    return NgLong.valueOf(lhs << rhs);
  }

  public Object doLeftShift(final long lhs, final BigInteger rhs) {
    return NgLong.valueOf(lhs << rhs.intValue());
  }

  public Object doLeftShift(final Object lhs, final byte rhs) {
    return doLeftShift(((NgLong)lhs).getLongValue(), rhs);
  }

  public Object doLeftShift(final Object lhs, final char rhs) {
    return doLeftShift(((NgLong)lhs).getLongValue(), rhs);
  }

  public Object doLeftShift(final Object lhs, final short rhs) {
    return doLeftShift(((NgLong)lhs).getLongValue(), rhs);
  }

  public Object doLeftShift(final Object lhs, final int rhs) {
    return doLeftShift(((NgLong)lhs).getLongValue(), rhs);
  }

  public Object doLeftShift(final Object lhs, final long rhs) {
    return doLeftShift(((NgLong)lhs).getLongValue(), rhs);
  }

  public Object doLeftShift(final Object lhs, final BigInteger rhs) {
    return doLeftShift(((NgLong)lhs).getLongValue(), rhs);
  }

  public Object doReverseLeftShift(final byte lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(byte.class).doLeftShift(lhs, ((NgLong)rhs).getLongValue());
  }

  public Object doReverseLeftShift(final char lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(char.class).doLeftShift(lhs, ((NgLong)rhs).getLongValue());
  }

  public Object doReverseLeftShift(final short lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(short.class).doLeftShift(lhs, ((NgLong)rhs).getLongValue());
  }

  public Object doReverseLeftShift(final int lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(int.class).doLeftShift(lhs, ((NgLong)rhs).getLongValue());
  }

  public Object doReverseLeftShift(final long lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(long.class).doLeftShift(lhs, ((NgLong)rhs).getLongValue());
  }

  public Object doReverseLeftShift(final BigInteger lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(BigInteger.class).doLeftShift(lhs, ((NgLong)rhs).getLongValue());
  }

  public Object doLeftShiftEquals(final Object lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseLeftShiftEquals(((NgLong)lhs).getLongValue(), rhs);
  }

  public Object doLeftShiftEquals(final long lhs, final byte rhs) {
    return NgLong.valueOf(lhs << rhs);
  }

  public Object doLeftShiftEquals(final long lhs, final char rhs) {
    return NgLong.valueOf(lhs << rhs);
  }

  public Object doLeftShiftEquals(final long lhs, final short rhs) {
    return NgLong.valueOf(lhs << rhs);
  }

  public Object doLeftShiftEquals(final long lhs, final int rhs) {
    return NgLong.valueOf(lhs << rhs);
  }

  public Object doLeftShiftEquals(final long lhs, final long rhs) {
    return NgLong.valueOf(lhs << rhs);
  }

  public Object doLeftShiftEquals(final long lhs, final BigInteger rhs) {
    return NgLong.valueOf(lhs << rhs.intValue());
  }

  public Object doLeftShiftEquals(final Object lhs, final byte rhs) {
    return doLeftShiftEquals(((NgLong)lhs).getLongValue(), rhs);
  }

  public Object doLeftShiftEquals(final Object lhs, final char rhs) {
    return doLeftShiftEquals(((NgLong)lhs).getLongValue(), rhs);
  }

  public Object doLeftShiftEquals(final Object lhs, final short rhs) {
    return doLeftShiftEquals(((NgLong)lhs).getLongValue(), rhs);
  }

  public Object doLeftShiftEquals(final Object lhs, final int rhs) {
    return doLeftShiftEquals(((NgLong)lhs).getLongValue(), rhs);
  }

  public Object doLeftShiftEquals(final Object lhs, final long rhs) {
    return doLeftShiftEquals(((NgLong)lhs).getLongValue(), rhs);
  }

  public Object doLeftShiftEquals(final Object lhs, final BigInteger rhs) {
    return doLeftShiftEquals(((NgLong)lhs).getLongValue(), rhs);
  }

  public Object doReverseLeftShiftEquals(final byte lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(byte.class).doLeftShiftEquals(lhs, ((NgLong)rhs).getLongValue());
  }

  public Object doReverseLeftShiftEquals(final char lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(char.class).doLeftShiftEquals(lhs, ((NgLong)rhs).getLongValue());
  }

  public Object doReverseLeftShiftEquals(final short lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(short.class).doLeftShiftEquals(lhs, ((NgLong)rhs).getLongValue());
  }

  public Object doReverseLeftShiftEquals(final int lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(int.class).doLeftShiftEquals(lhs, ((NgLong)rhs).getLongValue());
  }

  public Object doReverseLeftShiftEquals(final long lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(long.class).doLeftShiftEquals(lhs, ((NgLong)rhs).getLongValue());
  }

  public Object doReverseLeftShiftEquals(final BigInteger lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(BigInteger.class).doLeftShiftEquals(lhs, ((NgLong)rhs).getLongValue());
  }

  public Object doArithmeticRightShift(final Object lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseArithmeticRightShift(((NgLong)lhs).getLongValue(), rhs);
  }

  public Object doArithmeticRightShift(final long lhs, final byte rhs) {
    return NgLong.valueOf(lhs >> rhs);
  }

  public Object doArithmeticRightShift(final long lhs, final char rhs) {
    return NgLong.valueOf(lhs >> rhs);
  }

  public Object doArithmeticRightShift(final long lhs, final short rhs) {
    return NgLong.valueOf(lhs >> rhs);
  }

  public Object doArithmeticRightShift(final long lhs, final int rhs) {
    return NgLong.valueOf(lhs >> rhs);
  }

  public Object doArithmeticRightShift(final long lhs, final long rhs) {
    return NgLong.valueOf(lhs >> rhs);
  }

  public Object doArithmeticRightShift(final long lhs, final BigInteger rhs) {
    return NgLong.valueOf(lhs >> rhs.intValue());
  }

  public Object doArithmeticRightShift(final Object lhs, final byte rhs) {
    return doArithmeticRightShift(((NgLong)lhs).getLongValue(), rhs);
  }

  public Object doArithmeticRightShift(final Object lhs, final char rhs) {
    return doArithmeticRightShift(((NgLong)lhs).getLongValue(), rhs);
  }

  public Object doArithmeticRightShift(final Object lhs, final short rhs) {
    return doArithmeticRightShift(((NgLong)lhs).getLongValue(), rhs);
  }

  public Object doArithmeticRightShift(final Object lhs, final int rhs) {
    return doArithmeticRightShift(((NgLong)lhs).getLongValue(), rhs);
  }

  public Object doArithmeticRightShift(final Object lhs, final long rhs) {
    return doArithmeticRightShift(((NgLong)lhs).getLongValue(), rhs);
  }

  public Object doArithmeticRightShift(final Object lhs, final BigInteger rhs) {
    return doArithmeticRightShift(((NgLong)lhs).getLongValue(), rhs);
  }

  public Object doReverseArithmeticRightShift(final byte lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(byte.class).doArithmeticRightShift(lhs, ((NgLong)rhs).getLongValue());
  }

  public Object doReverseArithmeticRightShift(final char lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(char.class).doArithmeticRightShift(lhs, ((NgLong)rhs).getLongValue());
  }

  public Object doReverseArithmeticRightShift(final short lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(short.class).doArithmeticRightShift(lhs, ((NgLong)rhs).getLongValue());
  }

  public Object doReverseArithmeticRightShift(final int lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(int.class).doArithmeticRightShift(lhs, ((NgLong)rhs).getLongValue());
  }

  public Object doReverseArithmeticRightShift(final long lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(long.class).doArithmeticRightShift(lhs, ((NgLong)rhs).getLongValue());
  }

  public Object doReverseArithmeticRightShift(final BigInteger lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(BigInteger.class).doArithmeticRightShift(lhs, ((NgLong)rhs).getLongValue());
  }

  public Object doArithmeticRightShiftEquals(final Object lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseArithmeticRightShiftEquals(((NgLong)lhs).getLongValue(), rhs);
  }

  public Object doArithmeticRightShiftEquals(final long lhs, final byte rhs) {
    return NgLong.valueOf(lhs >> rhs);
  }

  public Object doArithmeticRightShiftEquals(final long lhs, final char rhs) {
    return NgLong.valueOf(lhs >> rhs);
  }

  public Object doArithmeticRightShiftEquals(final long lhs, final short rhs) {
    return NgLong.valueOf(lhs >> rhs);
  }

  public Object doArithmeticRightShiftEquals(final long lhs, final int rhs) {
    return NgLong.valueOf(lhs >> rhs);
  }

  public Object doArithmeticRightShiftEquals(final long lhs, final long rhs) {
    return NgLong.valueOf(lhs >> rhs);
  }

  public Object doArithmeticRightShiftEquals(final long lhs, final BigInteger rhs) {
    return NgLong.valueOf(lhs >> rhs.intValue());
  }

  public Object doArithmeticRightShiftEquals(final Object lhs, final byte rhs) {
    return doArithmeticRightShiftEquals(((NgLong)lhs).getLongValue(), rhs);
  }

  public Object doArithmeticRightShiftEquals(final Object lhs, final char rhs) {
    return doArithmeticRightShiftEquals(((NgLong)lhs).getLongValue(), rhs);
  }

  public Object doArithmeticRightShiftEquals(final Object lhs, final short rhs) {
    return doArithmeticRightShiftEquals(((NgLong)lhs).getLongValue(), rhs);
  }

  public Object doArithmeticRightShiftEquals(final Object lhs, final int rhs) {
    return doArithmeticRightShiftEquals(((NgLong)lhs).getLongValue(), rhs);
  }

  public Object doArithmeticRightShiftEquals(final Object lhs, final long rhs) {
    return doArithmeticRightShiftEquals(((NgLong)lhs).getLongValue(), rhs);
  }

  public Object doArithmeticRightShiftEquals(final Object lhs, final BigInteger rhs) {
    return doArithmeticRightShiftEquals(((NgLong)lhs).getLongValue(), rhs);
  }

  public Object doReverseArithmeticRightShiftEquals(final byte lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(byte.class).doArithmeticRightShiftEquals(lhs, ((NgLong)rhs).getLongValue());
  }

  public Object doReverseArithmeticRightShiftEquals(final char lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(char.class).doArithmeticRightShiftEquals(lhs, ((NgLong)rhs).getLongValue());
  }

  public Object doReverseArithmeticRightShiftEquals(final short lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(short.class).doArithmeticRightShiftEquals(lhs, ((NgLong)rhs).getLongValue());
  }

  public Object doReverseArithmeticRightShiftEquals(final int lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(int.class).doArithmeticRightShiftEquals(lhs, ((NgLong)rhs).getLongValue());
  }

  public Object doReverseArithmeticRightShiftEquals(final long lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(long.class).doArithmeticRightShiftEquals(lhs, ((NgLong)rhs).getLongValue());
  }

  public Object doReverseArithmeticRightShiftEquals(final BigInteger lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(BigInteger.class).doArithmeticRightShiftEquals(lhs, ((NgLong)rhs).getLongValue());
  }

  public Object doLogicalRightShift(final Object lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseLogicalRightShift(((NgLong)lhs).getLongValue(), rhs);
  }

  public Object doLogicalRightShift(final long lhs, final byte rhs) {
    return NgLong.valueOf(lhs >>> rhs);
  }

  public Object doLogicalRightShift(final long lhs, final char rhs) {
    return NgLong.valueOf(lhs >>> rhs);
  }

  public Object doLogicalRightShift(final long lhs, final short rhs) {
    return NgLong.valueOf(lhs >>> rhs);
  }

  public Object doLogicalRightShift(final long lhs, final int rhs) {
    return NgLong.valueOf(lhs >>> rhs);
  }

  public Object doLogicalRightShift(final long lhs, final long rhs) {
    return NgLong.valueOf(lhs >>> rhs);
  }

  public Object doLogicalRightShift(final long lhs, final BigInteger rhs) {
    return NgLong.valueOf(lhs >>> rhs.intValue());
  }

  public Object doLogicalRightShift(final Object lhs, final byte rhs) {
    return doLogicalRightShift(((NgLong)lhs).getLongValue(), rhs);
  }

  public Object doLogicalRightShift(final Object lhs, final char rhs) {
    return doLogicalRightShift(((NgLong)lhs).getLongValue(), rhs);
  }

  public Object doLogicalRightShift(final Object lhs, final short rhs) {
    return doLogicalRightShift(((NgLong)lhs).getLongValue(), rhs);
  }

  public Object doLogicalRightShift(final Object lhs, final int rhs) {
    return doLogicalRightShift(((NgLong)lhs).getLongValue(), rhs);
  }

  public Object doLogicalRightShift(final Object lhs, final long rhs) {
    return doLogicalRightShift(((NgLong)lhs).getLongValue(), rhs);
  }

  public Object doLogicalRightShift(final Object lhs, final BigInteger rhs) {
    return doLogicalRightShift(((NgLong)lhs).getLongValue(), rhs);
  }

  public Object doReverseLogicalRightShift(final byte lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(byte.class).doLogicalRightShift(lhs, ((NgLong)rhs).getLongValue());
  }

  public Object doReverseLogicalRightShift(final char lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(char.class).doLogicalRightShift(lhs, ((NgLong)rhs).getLongValue());
  }

  public Object doReverseLogicalRightShift(final short lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(short.class).doLogicalRightShift(lhs, ((NgLong)rhs).getLongValue());
  }

  public Object doReverseLogicalRightShift(final int lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(int.class).doLogicalRightShift(lhs, ((NgLong)rhs).getLongValue());
  }

  public Object doReverseLogicalRightShift(final long lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(long.class).doLogicalRightShift(lhs, ((NgLong)rhs).getLongValue());
  }

  public Object doLogicalRightShiftEquals(final Object lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseLogicalRightShiftEquals(((NgLong)lhs).getLongValue(), rhs);
  }

  public Object doLogicalRightShiftEquals(final long lhs, final byte rhs) {
    return NgLong.valueOf(lhs >>> rhs);
  }

  public Object doLogicalRightShiftEquals(final long lhs, final char rhs) {
    return NgLong.valueOf(lhs >>> rhs);
  }

  public Object doLogicalRightShiftEquals(final long lhs, final short rhs) {
    return NgLong.valueOf(lhs >>> rhs);
  }

  public Object doLogicalRightShiftEquals(final long lhs, final int rhs) {
    return NgLong.valueOf(lhs >>> rhs);
  }

  public Object doLogicalRightShiftEquals(final long lhs, final long rhs) {
    return NgLong.valueOf(lhs >>> rhs);
  }

  public Object doLogicalRightShiftEquals(final long lhs, final BigInteger rhs) {
    return NgLong.valueOf(lhs >>> rhs.intValue());
  }

  public Object doLogicalRightShiftEquals(final Object lhs, final byte rhs) {
    return doLogicalRightShiftEquals(((NgLong)lhs).getLongValue(), rhs);
  }

  public Object doLogicalRightShiftEquals(final Object lhs, final char rhs) {
    return doLogicalRightShiftEquals(((NgLong)lhs).getLongValue(), rhs);
  }

  public Object doLogicalRightShiftEquals(final Object lhs, final short rhs) {
    return doLogicalRightShiftEquals(((NgLong)lhs).getLongValue(), rhs);
  }

  public Object doLogicalRightShiftEquals(final Object lhs, final int rhs) {
    return doLogicalRightShiftEquals(((NgLong)lhs).getLongValue(), rhs);
  }

  public Object doLogicalRightShiftEquals(final Object lhs, final long rhs) {
    return doLogicalRightShiftEquals(((NgLong)lhs).getLongValue(), rhs);
  }

  public Object doLogicalRightShiftEquals(final Object lhs, final BigInteger rhs) {
    return doLogicalRightShiftEquals(((NgLong)lhs).getLongValue(), rhs);
  }

  public Object doReverseLogicalRightShiftEquals(final byte lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(byte.class).doLogicalRightShiftEquals(lhs, ((NgLong)rhs).getLongValue());
  }

  public Object doReverseLogicalRightShiftEquals(final char lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(char.class).doLogicalRightShiftEquals(lhs, ((NgLong)rhs).getLongValue());
  }

  public Object doReverseLogicalRightShiftEquals(final short lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(short.class).doLogicalRightShiftEquals(lhs, ((NgLong)rhs).getLongValue());
  }

  public Object doReverseLogicalRightShiftEquals(final int lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(int.class).doLogicalRightShiftEquals(lhs, ((NgLong)rhs).getLongValue());
  }

  public Object doReverseLogicalRightShiftEquals(final long lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(long.class).doLogicalRightShiftEquals(lhs, ((NgLong)rhs).getLongValue());
  }

  public Object doCompare(final Object lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseCompare(((NgLong)lhs).getLongValue(), rhs);
  }

  public Object doCompare(final long lhs, final byte rhs) {
    if (lhs == rhs) return NgInt.ZERO;
    if (lhs < rhs) return NgInt.MINUS_ONE;
    return NgInt.ONE;
  }

  public Object doCompare(final long lhs, final char rhs) {
    if (lhs == rhs) return NgInt.ZERO;
    if (lhs < rhs) return NgInt.MINUS_ONE;
    return NgInt.ONE;
  }

  public Object doCompare(final long lhs, final short rhs) {
    if (lhs == rhs) return NgInt.ZERO;
    if (lhs < rhs) return NgInt.MINUS_ONE;
    return NgInt.ONE;
  }

  public Object doCompare(final long lhs, final int rhs) {
    if (lhs == rhs) return NgInt.ZERO;
    if (lhs < rhs) return NgInt.MINUS_ONE;
    return NgInt.ONE;
  }

  public Object doCompare(final long lhs, final long rhs) {
    if (lhs == rhs) return NgInt.ZERO;
    if (lhs < rhs) return NgInt.MINUS_ONE;
    return NgInt.ONE;
  }

  public Object doCompare(final long lhs, final float rhs) {
    if (lhs == rhs) return NgInt.ZERO;
    if (lhs < rhs) return NgInt.MINUS_ONE;
    return NgInt.ONE;
  }

  public Object doCompare(final long lhs, final double rhs) {
    if (lhs == rhs) return NgInt.ZERO;
    if (lhs < rhs) return NgInt.MINUS_ONE;
    return NgInt.ONE;
  }

  public Object doCompare(final long lhs, final BigInteger rhs) {
    return NgInt.valueOf(BigInteger.valueOf(lhs).compareTo(rhs));
  }

  public Object doCompare(final long lhs, final BigDecimal rhs) {
    return NgInt.valueOf(new BigDecimal(lhs).compareTo(rhs));
  }

  public Object doCompare(final Object lhs, final byte rhs) {
    return doCompare(((NgLong)lhs).getLongValue(), rhs);
  }

  public Object doCompare(final Object lhs, final char rhs) {
    return doCompare(((NgLong)lhs).getLongValue(), rhs);
  }

  public Object doCompare(final Object lhs, final short rhs) {
    return doCompare(((NgLong)lhs).getLongValue(), rhs);
  }

  public Object doCompare(final Object lhs, final int rhs) {
    return doCompare(((NgLong)lhs).getLongValue(), rhs);
  }

  public Object doCompare(final Object lhs, final long rhs) {
    return doCompare(((NgLong)lhs).getLongValue(), rhs);
  }

  public Object doCompare(final Object lhs, final float rhs) {
    return doCompare(((NgLong)lhs).getLongValue(), rhs);
  }

  public Object doCompare(final Object lhs, final double rhs) {
    return doCompare(((NgLong)lhs).getLongValue(), rhs);
  }

  public Object doCompare(final Object lhs, final BigInteger rhs) {
    return doCompare(((NgLong)lhs).getLongValue(), rhs);
  }

  public Object doCompare(final Object lhs, final BigDecimal rhs) {
    return doCompare(((NgLong)lhs).getLongValue(), rhs);
  }

  public Object doReverseCompare(final byte lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(byte.class).doCompare(lhs, ((NgLong)rhs).getLongValue());
  }

  public Object doReverseCompare(final char lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(char.class).doCompare(lhs, ((NgLong)rhs).getLongValue());
  }

  public Object doReverseCompare(final short lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(short.class).doCompare(lhs, ((NgLong)rhs).getLongValue());
  }

  public Object doReverseCompare(final int lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(int.class).doCompare(lhs, ((NgLong)rhs).getLongValue());
  }

  public Object doReverseCompare(final long lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(long.class).doCompare(lhs, ((NgLong)rhs).getLongValue());
  }

  public Object doReverseCompare(final float lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(float.class).doCompare(lhs, ((NgLong)rhs).getLongValue());
  }

  public Object doReverseCompare(final double lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(double.class).doCompare(lhs, ((NgLong)rhs).getLongValue());
  }

  public Object doReverseCompare(final BigInteger lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(BigInteger.class).doCompare(lhs, ((NgLong)rhs).getLongValue());
  }

  public Object doReverseCompare(final BigDecimal lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(BigDecimal.class).doCompare(lhs, ((NgLong)rhs).getLongValue());
  }

  public Object doEquals(final Object lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseEquals(((NgLong)lhs).getLongValue(), rhs);
  }

  public Object doEquals(final long lhs, final byte rhs) {
    return (lhs == rhs) ? NgBoolean.TRUE : NgBoolean.FALSE;
  }

  public Object doEquals(final long lhs, final char rhs) {
    return (lhs == rhs) ? NgBoolean.TRUE : NgBoolean.FALSE;
  }

  public Object doEquals(final long lhs, final short rhs) {
    return (lhs == rhs) ? NgBoolean.TRUE : NgBoolean.FALSE;
  }

  public Object doEquals(final long lhs, final int rhs) {
    return (lhs == rhs) ? NgBoolean.TRUE : NgBoolean.FALSE;
  }

  public Object doEquals(final long lhs, final long rhs) {
    return (lhs == rhs) ? NgBoolean.TRUE : NgBoolean.FALSE;
  }

  public Object doEquals(final long lhs, final float rhs) {
    return (lhs == rhs) ? NgBoolean.TRUE : NgBoolean.FALSE;
  }

  public Object doEquals(final long lhs, final double rhs) {
    return (lhs == rhs) ? NgBoolean.TRUE : NgBoolean.FALSE;
  }

  public Object doEquals(final long lhs, final BigInteger rhs) {
    return (BigInteger.valueOf(lhs).compareTo(rhs) == 0) ? NgBoolean.TRUE : NgBoolean.FALSE;
  }

  public Object doEquals(final long lhs, final BigDecimal rhs) {
    return (new BigDecimal(lhs).compareTo(rhs) == 0) ? NgBoolean.TRUE : NgBoolean.FALSE;
  }

  public Object doEquals(final Object lhs, final byte rhs) {
    return doEquals(((NgLong)lhs).getLongValue(), rhs);
  }

  public Object doEquals(final Object lhs, final char rhs) {
    return doEquals(((NgLong)lhs).getLongValue(), rhs);
  }

  public Object doEquals(final Object lhs, final short rhs) {
    return doEquals(((NgLong)lhs).getLongValue(), rhs);
  }

  public Object doEquals(final Object lhs, final int rhs) {
    return doEquals(((NgLong)lhs).getLongValue(), rhs);
  }

  public Object doEquals(final Object lhs, final long rhs) {
    return doEquals(((NgLong)lhs).getLongValue(), rhs);
  }

  public Object doEquals(final Object lhs, final float rhs) {
    return doEquals(((NgLong)lhs).getLongValue(), rhs);
  }

  public Object doEquals(final Object lhs, final double rhs) {
    return doEquals(((NgLong)lhs).getLongValue(), rhs);
  }

  public Object doEquals(final Object lhs, final BigInteger rhs) {
    return doEquals(((NgLong)lhs).getLongValue(), rhs);
  }

  public Object doEquals(final Object lhs, final BigDecimal rhs) {
    return doEquals(((NgLong)lhs).getLongValue(), rhs);
  }

  public Object doReverseEquals(final byte lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(byte.class).doEquals(lhs, ((NgLong)rhs).getLongValue());
  }

  public Object doReverseEquals(final char lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(char.class).doEquals(lhs, ((NgLong)rhs).getLongValue());
  }

  public Object doReverseEquals(final short lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(short.class).doEquals(lhs, ((NgLong)rhs).getLongValue());
  }

  public Object doReverseEquals(final int lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(int.class).doEquals(lhs, ((NgLong)rhs).getLongValue());
  }

  public Object doReverseEquals(final long lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(long.class).doEquals(lhs, ((NgLong)rhs).getLongValue());
  }

  public Object doReverseEquals(final float lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(float.class).doEquals(lhs, ((NgLong)rhs).getLongValue());
  }

  public Object doReverseEquals(final double lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(double.class).doEquals(lhs, ((NgLong)rhs).getLongValue());
  }

  public Object doReverseEquals(final BigInteger lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(BigInteger.class).doEquals(lhs, ((NgLong)rhs).getLongValue());
  }

  public Object doReverseEquals(final BigDecimal lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(BigDecimal.class).doEquals(lhs, ((NgLong)rhs).getLongValue());
  }

  public Object doNotEquals(final Object lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseNotEquals(((NgLong)lhs).getLongValue(), rhs);
  }

  public Object doNotEquals(final long lhs, final byte rhs) {
    return (lhs != rhs) ? NgBoolean.TRUE : NgBoolean.FALSE;
  }

  public Object doNotEquals(final long lhs, final char rhs) {
    return (lhs != rhs) ? NgBoolean.TRUE : NgBoolean.FALSE;
  }

  public Object doNotEquals(final long lhs, final short rhs) {
    return (lhs != rhs) ? NgBoolean.TRUE : NgBoolean.FALSE;
  }

  public Object doNotEquals(final long lhs, final int rhs) {
    return (lhs != rhs) ? NgBoolean.TRUE : NgBoolean.FALSE;
  }

  public Object doNotEquals(final long lhs, final long rhs) {
    return (lhs != rhs) ? NgBoolean.TRUE : NgBoolean.FALSE;
  }

  public Object doNotEquals(final long lhs, final float rhs) {
    return (lhs != rhs) ? NgBoolean.TRUE : NgBoolean.FALSE;
  }

  public Object doNotEquals(final long lhs, final double rhs) {
    return (lhs != rhs) ? NgBoolean.TRUE : NgBoolean.FALSE;
  }

  public Object doNotEquals(final long lhs, final BigInteger rhs) {
    return (BigInteger.valueOf(lhs).compareTo(rhs) != 0) ? NgBoolean.TRUE : NgBoolean.FALSE;
  }

  public Object doNotEquals(final long lhs, final BigDecimal rhs) {
    return (new BigDecimal(lhs).compareTo(rhs) != 0) ? NgBoolean.TRUE : NgBoolean.FALSE;
  }

  public Object doNotEquals(final Object lhs, final byte rhs) {
    return doNotEquals(((NgLong)lhs).getLongValue(), rhs);
  }

  public Object doNotEquals(final Object lhs, final char rhs) {
    return doNotEquals(((NgLong)lhs).getLongValue(), rhs);
  }

  public Object doNotEquals(final Object lhs, final short rhs) {
    return doNotEquals(((NgLong)lhs).getLongValue(), rhs);
  }

  public Object doNotEquals(final Object lhs, final int rhs) {
    return doNotEquals(((NgLong)lhs).getLongValue(), rhs);
  }

  public Object doNotEquals(final Object lhs, final long rhs) {
    return doNotEquals(((NgLong)lhs).getLongValue(), rhs);
  }

  public Object doNotEquals(final Object lhs, final float rhs) {
    return doNotEquals(((NgLong)lhs).getLongValue(), rhs);
  }

  public Object doNotEquals(final Object lhs, final double rhs) {
    return doNotEquals(((NgLong)lhs).getLongValue(), rhs);
  }

  public Object doNotEquals(final Object lhs, final BigInteger rhs) {
    return doNotEquals(((NgLong)lhs).getLongValue(), rhs);
  }

  public Object doNotEquals(final Object lhs, final BigDecimal rhs) {
    return doNotEquals(((NgLong)lhs).getLongValue(), rhs);
  }

  public Object doReverseNotEquals(final byte lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(byte.class).doNotEquals(lhs, ((NgLong)rhs).getLongValue());
  }

  public Object doReverseNotEquals(final char lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(char.class).doNotEquals(lhs, ((NgLong)rhs).getLongValue());
  }

  public Object doReverseNotEquals(final short lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(short.class).doNotEquals(lhs, ((NgLong)rhs).getLongValue());
  }

  public Object doReverseNotEquals(final int lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(int.class).doNotEquals(lhs, ((NgLong)rhs).getLongValue());
  }

  public Object doReverseNotEquals(final long lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(long.class).doNotEquals(lhs, ((NgLong)rhs).getLongValue());
  }

  public Object doReverseNotEquals(final float lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(float.class).doNotEquals(lhs, ((NgLong)rhs).getLongValue());
  }

  public Object doReverseNotEquals(final double lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(double.class).doNotEquals(lhs, ((NgLong)rhs).getLongValue());
  }

  public Object doReverseNotEquals(final BigInteger lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(BigInteger.class).doNotEquals(lhs, ((NgLong)rhs).getLongValue());
  }

  public Object doReverseNotEquals(final BigDecimal lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(BigDecimal.class).doNotEquals(lhs, ((NgLong)rhs).getLongValue());
  }

  public Object doLessThan(final Object lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseLessThan(((NgLong)lhs).getLongValue(), rhs);
  }

  public Object doLessThan(final long lhs, final byte rhs) {
    return (lhs < rhs) ? NgBoolean.TRUE : NgBoolean.FALSE;
  }

  public Object doLessThan(final long lhs, final char rhs) {
    return (lhs < rhs) ? NgBoolean.TRUE : NgBoolean.FALSE;
  }

  public Object doLessThan(final long lhs, final short rhs) {
    return (lhs < rhs) ? NgBoolean.TRUE : NgBoolean.FALSE;
  }

  public Object doLessThan(final long lhs, final int rhs) {
    return (lhs < rhs) ? NgBoolean.TRUE : NgBoolean.FALSE;
  }

  public Object doLessThan(final long lhs, final long rhs) {
    return (lhs < rhs) ? NgBoolean.TRUE : NgBoolean.FALSE;
  }

  public Object doLessThan(final long lhs, final float rhs) {
    return (lhs < rhs) ? NgBoolean.TRUE : NgBoolean.FALSE;
  }

  public Object doLessThan(final long lhs, final double rhs) {
    return (lhs < rhs) ? NgBoolean.TRUE : NgBoolean.FALSE;
  }

  public Object doLessThan(final long lhs, final BigInteger rhs) {
    return (BigInteger.valueOf(lhs).compareTo(rhs) < 0) ? NgBoolean.TRUE : NgBoolean.FALSE;
  }

  public Object doLessThan(final long lhs, final BigDecimal rhs) {
    return (new BigDecimal(lhs).compareTo(rhs) < 0) ? NgBoolean.TRUE : NgBoolean.FALSE;
  }

  public Object doLessThan(final Object lhs, final byte rhs) {
    return doLessThan(((NgLong)lhs).getLongValue(), rhs);
  }

  public Object doLessThan(final Object lhs, final char rhs) {
    return doLessThan(((NgLong)lhs).getLongValue(), rhs);
  }

  public Object doLessThan(final Object lhs, final short rhs) {
    return doLessThan(((NgLong)lhs).getLongValue(), rhs);
  }

  public Object doLessThan(final Object lhs, final int rhs) {
    return doLessThan(((NgLong)lhs).getLongValue(), rhs);
  }

  public Object doLessThan(final Object lhs, final long rhs) {
    return doLessThan(((NgLong)lhs).getLongValue(), rhs);
  }

  public Object doLessThan(final Object lhs, final float rhs) {
    return doLessThan(((NgLong)lhs).getLongValue(), rhs);
  }

  public Object doLessThan(final Object lhs, final double rhs) {
    return doLessThan(((NgLong)lhs).getLongValue(), rhs);
  }

  public Object doLessThan(final Object lhs, final BigInteger rhs) {
    return doLessThan(((NgLong)lhs).getLongValue(), rhs);
  }

  public Object doLessThan(final Object lhs, final BigDecimal rhs) {
    return doLessThan(((NgLong)lhs).getLongValue(), rhs);
  }

  public Object doReverseLessThan(final byte lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(byte.class).doLessThan(lhs, ((NgLong)rhs).getLongValue());
  }

  public Object doReverseLessThan(final char lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(char.class).doLessThan(lhs, ((NgLong)rhs).getLongValue());
  }

  public Object doReverseLessThan(final short lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(short.class).doLessThan(lhs, ((NgLong)rhs).getLongValue());
  }

  public Object doReverseLessThan(final int lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(int.class).doLessThan(lhs, ((NgLong)rhs).getLongValue());
  }

  public Object doReverseLessThan(final long lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(long.class).doLessThan(lhs, ((NgLong)rhs).getLongValue());
  }

  public Object doReverseLessThan(final float lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(float.class).doLessThan(lhs, ((NgLong)rhs).getLongValue());
  }

  public Object doReverseLessThan(final double lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(double.class).doLessThan(lhs, ((NgLong)rhs).getLongValue());
  }

  public Object doReverseLessThan(final BigInteger lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(BigInteger.class).doLessThan(lhs, ((NgLong)rhs).getLongValue());
  }

  public Object doReverseLessThan(final BigDecimal lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(BigDecimal.class).doLessThan(lhs, ((NgLong)rhs).getLongValue());
  }

  public Object doLessThanOrEquals(final Object lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseLessThanOrEquals(((NgLong)lhs).getLongValue(), rhs);
  }

  public Object doLessThanOrEquals(final long lhs, final byte rhs) {
    return (lhs <= rhs) ? NgBoolean.TRUE : NgBoolean.FALSE;
  }

  public Object doLessThanOrEquals(final long lhs, final char rhs) {
    return (lhs <= rhs) ? NgBoolean.TRUE : NgBoolean.FALSE;
  }

  public Object doLessThanOrEquals(final long lhs, final short rhs) {
    return (lhs <= rhs) ? NgBoolean.TRUE : NgBoolean.FALSE;
  }

  public Object doLessThanOrEquals(final long lhs, final int rhs) {
    return (lhs <= rhs) ? NgBoolean.TRUE : NgBoolean.FALSE;
  }

  public Object doLessThanOrEquals(final long lhs, final long rhs) {
    return (lhs <= rhs) ? NgBoolean.TRUE : NgBoolean.FALSE;
  }

  public Object doLessThanOrEquals(final long lhs, final float rhs) {
    return (lhs <= rhs) ? NgBoolean.TRUE : NgBoolean.FALSE;
  }

  public Object doLessThanOrEquals(final long lhs, final double rhs) {
    return (lhs <= rhs) ? NgBoolean.TRUE : NgBoolean.FALSE;
  }

  public Object doLessThanOrEquals(final long lhs, final BigInteger rhs) {
    return (BigInteger.valueOf(lhs).compareTo(rhs) <= 0) ? NgBoolean.TRUE : NgBoolean.FALSE;
  }

  public Object doLessThanOrEquals(final long lhs, final BigDecimal rhs) {
    return (new BigDecimal(lhs).compareTo(rhs) <= 0) ? NgBoolean.TRUE : NgBoolean.FALSE;
  }

  public Object doLessThanOrEquals(final Object lhs, final byte rhs) {
    return doLessThanOrEquals(((NgLong)lhs).getLongValue(), rhs);
  }

  public Object doLessThanOrEquals(final Object lhs, final char rhs) {
    return doLessThanOrEquals(((NgLong)lhs).getLongValue(), rhs);
  }

  public Object doLessThanOrEquals(final Object lhs, final short rhs) {
    return doLessThanOrEquals(((NgLong)lhs).getLongValue(), rhs);
  }

  public Object doLessThanOrEquals(final Object lhs, final int rhs) {
    return doLessThanOrEquals(((NgLong)lhs).getLongValue(), rhs);
  }

  public Object doLessThanOrEquals(final Object lhs, final long rhs) {
    return doLessThanOrEquals(((NgLong)lhs).getLongValue(), rhs);
  }

  public Object doLessThanOrEquals(final Object lhs, final float rhs) {
    return doLessThanOrEquals(((NgLong)lhs).getLongValue(), rhs);
  }

  public Object doLessThanOrEquals(final Object lhs, final double rhs) {
    return doLessThanOrEquals(((NgLong)lhs).getLongValue(), rhs);
  }

  public Object doLessThanOrEquals(final Object lhs, final BigInteger rhs) {
    return doLessThanOrEquals(((NgLong)lhs).getLongValue(), rhs);
  }

  public Object doLessThanOrEquals(final Object lhs, final BigDecimal rhs) {
    return doLessThanOrEquals(((NgLong)lhs).getLongValue(), rhs);
  }

  public Object doReverseLessThanOrEquals(final byte lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(byte.class).doLessThanOrEquals(lhs, ((NgLong)rhs).getLongValue());
  }

  public Object doReverseLessThanOrEquals(final char lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(char.class).doLessThanOrEquals(lhs, ((NgLong)rhs).getLongValue());
  }

  public Object doReverseLessThanOrEquals(final short lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(short.class).doLessThanOrEquals(lhs, ((NgLong)rhs).getLongValue());
  }

  public Object doReverseLessThanOrEquals(final int lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(int.class).doLessThanOrEquals(lhs, ((NgLong)rhs).getLongValue());
  }

  public Object doReverseLessThanOrEquals(final long lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(long.class).doLessThanOrEquals(lhs, ((NgLong)rhs).getLongValue());
  }

  public Object doReverseLessThanOrEquals(final float lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(float.class).doLessThanOrEquals(lhs, ((NgLong)rhs).getLongValue());
  }

  public Object doReverseLessThanOrEquals(final double lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(double.class).doLessThanOrEquals(lhs, ((NgLong)rhs).getLongValue());
  }

  public Object doReverseLessThanOrEquals(final BigInteger lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(BigInteger.class).doLessThanOrEquals(lhs, ((NgLong)rhs).getLongValue());
  }

  public Object doReverseLessThanOrEquals(final BigDecimal lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(BigDecimal.class).doLessThanOrEquals(lhs, ((NgLong)rhs).getLongValue());
  }

  public Object doGreaterThan(final Object lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseGreaterThan(((NgLong)lhs).getLongValue(), rhs);
  }

  public Object doGreaterThan(final long lhs, final byte rhs) {
    return (lhs > rhs) ? NgBoolean.TRUE : NgBoolean.FALSE;
  }

  public Object doGreaterThan(final long lhs, final char rhs) {
    return (lhs > rhs) ? NgBoolean.TRUE : NgBoolean.FALSE;
  }

  public Object doGreaterThan(final long lhs, final short rhs) {
    return (lhs > rhs) ? NgBoolean.TRUE : NgBoolean.FALSE;
  }

  public Object doGreaterThan(final long lhs, final int rhs) {
    return (lhs > rhs) ? NgBoolean.TRUE : NgBoolean.FALSE;
  }

  public Object doGreaterThan(final long lhs, final long rhs) {
    return (lhs > rhs) ? NgBoolean.TRUE : NgBoolean.FALSE;
  }

  public Object doGreaterThan(final long lhs, final float rhs) {
    return (lhs > rhs) ? NgBoolean.TRUE : NgBoolean.FALSE;
  }

  public Object doGreaterThan(final long lhs, final double rhs) {
    return (lhs > rhs) ? NgBoolean.TRUE : NgBoolean.FALSE;
  }

  public Object doGreaterThan(final long lhs, final BigInteger rhs) {
    return (BigInteger.valueOf(lhs).compareTo(rhs) > 0) ? NgBoolean.TRUE : NgBoolean.FALSE;
  }

  public Object doGreaterThan(final long lhs, final BigDecimal rhs) {
    return (new BigDecimal(lhs).compareTo(rhs) > 0) ? NgBoolean.TRUE : NgBoolean.FALSE;
  }

  public Object doGreaterThan(final Object lhs, final byte rhs) {
    return doGreaterThan(((NgLong)lhs).getLongValue(), rhs);
  }

  public Object doGreaterThan(final Object lhs, final char rhs) {
    return doGreaterThan(((NgLong)lhs).getLongValue(), rhs);
  }

  public Object doGreaterThan(final Object lhs, final short rhs) {
    return doGreaterThan(((NgLong)lhs).getLongValue(), rhs);
  }

  public Object doGreaterThan(final Object lhs, final int rhs) {
    return doGreaterThan(((NgLong)lhs).getLongValue(), rhs);
  }

  public Object doGreaterThan(final Object lhs, final long rhs) {
    return doGreaterThan(((NgLong)lhs).getLongValue(), rhs);
  }

  public Object doGreaterThan(final Object lhs, final float rhs) {
    return doGreaterThan(((NgLong)lhs).getLongValue(), rhs);
  }

  public Object doGreaterThan(final Object lhs, final double rhs) {
    return doGreaterThan(((NgLong)lhs).getLongValue(), rhs);
  }

  public Object doGreaterThan(final Object lhs, final BigInteger rhs) {
    return doGreaterThan(((NgLong)lhs).getLongValue(), rhs);
  }

  public Object doGreaterThan(final Object lhs, final BigDecimal rhs) {
    return doGreaterThan(((NgLong)lhs).getLongValue(), rhs);
  }

  public Object doReverseGreaterThan(final byte lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(byte.class).doGreaterThan(lhs, ((NgLong)rhs).getLongValue());
  }

  public Object doReverseGreaterThan(final char lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(char.class).doGreaterThan(lhs, ((NgLong)rhs).getLongValue());
  }

  public Object doReverseGreaterThan(final short lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(short.class).doGreaterThan(lhs, ((NgLong)rhs).getLongValue());
  }

  public Object doReverseGreaterThan(final int lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(int.class).doGreaterThan(lhs, ((NgLong)rhs).getLongValue());
  }

  public Object doReverseGreaterThan(final long lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(long.class).doGreaterThan(lhs, ((NgLong)rhs).getLongValue());
  }

  public Object doReverseGreaterThan(final float lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(float.class).doGreaterThan(lhs, ((NgLong)rhs).getLongValue());
  }

  public Object doReverseGreaterThan(final double lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(double.class).doGreaterThan(lhs, ((NgLong)rhs).getLongValue());
  }

  public Object doReverseGreaterThan(final BigInteger lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(BigInteger.class).doGreaterThan(lhs, ((NgLong)rhs).getLongValue());
  }

  public Object doReverseGreaterThan(final BigDecimal lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(BigDecimal.class).doGreaterThan(lhs, ((NgLong)rhs).getLongValue());
  }

  public Object doGreaterThanOrEquals(final Object lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseGreaterThanOrEquals(((NgLong)lhs).getLongValue(), rhs);
  }

  public Object doGreaterThanOrEquals(final long lhs, final byte rhs) {
    return (lhs >= rhs) ? NgBoolean.TRUE : NgBoolean.FALSE;
  }

  public Object doGreaterThanOrEquals(final long lhs, final char rhs) {
    return (lhs >= rhs) ? NgBoolean.TRUE : NgBoolean.FALSE;
  }

  public Object doGreaterThanOrEquals(final long lhs, final short rhs) {
    return (lhs >= rhs) ? NgBoolean.TRUE : NgBoolean.FALSE;
  }

  public Object doGreaterThanOrEquals(final long lhs, final int rhs) {
    return (lhs >= rhs) ? NgBoolean.TRUE : NgBoolean.FALSE;
  }

  public Object doGreaterThanOrEquals(final long lhs, final long rhs) {
    return (lhs >= rhs) ? NgBoolean.TRUE : NgBoolean.FALSE;
  }

  public Object doGreaterThanOrEquals(final long lhs, final float rhs) {
    return (lhs >= rhs) ? NgBoolean.TRUE : NgBoolean.FALSE;
  }

  public Object doGreaterThanOrEquals(final long lhs, final double rhs) {
    return (lhs >= rhs) ? NgBoolean.TRUE : NgBoolean.FALSE;
  }

  public Object doGreaterThanOrEquals(final long lhs, final BigInteger rhs) {
    return (BigInteger.valueOf(lhs).compareTo(rhs) >= 0) ? NgBoolean.TRUE : NgBoolean.FALSE;
  }

  public Object doGreaterThanOrEquals(final long lhs, final BigDecimal rhs) {
    return (new BigDecimal(lhs).compareTo(rhs) >= 0) ? NgBoolean.TRUE : NgBoolean.FALSE;
  }

  public Object doGreaterThanOrEquals(final Object lhs, final byte rhs) {
    return doGreaterThanOrEquals(((NgLong)lhs).getLongValue(), rhs);
  }

  public Object doGreaterThanOrEquals(final Object lhs, final char rhs) {
    return doGreaterThanOrEquals(((NgLong)lhs).getLongValue(), rhs);
  }

  public Object doGreaterThanOrEquals(final Object lhs, final short rhs) {
    return doGreaterThanOrEquals(((NgLong)lhs).getLongValue(), rhs);
  }

  public Object doGreaterThanOrEquals(final Object lhs, final int rhs) {
    return doGreaterThanOrEquals(((NgLong)lhs).getLongValue(), rhs);
  }

  public Object doGreaterThanOrEquals(final Object lhs, final long rhs) {
    return doGreaterThanOrEquals(((NgLong)lhs).getLongValue(), rhs);
  }

  public Object doGreaterThanOrEquals(final Object lhs, final float rhs) {
    return doGreaterThanOrEquals(((NgLong)lhs).getLongValue(), rhs);
  }

  public Object doGreaterThanOrEquals(final Object lhs, final double rhs) {
    return doGreaterThanOrEquals(((NgLong)lhs).getLongValue(), rhs);
  }

  public Object doGreaterThanOrEquals(final Object lhs, final BigInteger rhs) {
    return doGreaterThanOrEquals(((NgLong)lhs).getLongValue(), rhs);
  }

  public Object doGreaterThanOrEquals(final Object lhs, final BigDecimal rhs) {
    return doGreaterThanOrEquals(((NgLong)lhs).getLongValue(), rhs);
  }

  public Object doReverseGreaterThanOrEquals(final byte lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(byte.class).doGreaterThanOrEquals(lhs, ((NgLong)rhs).getLongValue());
  }

  public Object doReverseGreaterThanOrEquals(final char lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(char.class).doGreaterThanOrEquals(lhs, ((NgLong)rhs).getLongValue());
  }

  public Object doReverseGreaterThanOrEquals(final short lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(short.class).doGreaterThanOrEquals(lhs, ((NgLong)rhs).getLongValue());
  }

  public Object doReverseGreaterThanOrEquals(final int lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(int.class).doGreaterThanOrEquals(lhs, ((NgLong)rhs).getLongValue());
  }

  public Object doReverseGreaterThanOrEquals(final long lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(long.class).doGreaterThanOrEquals(lhs, ((NgLong)rhs).getLongValue());
  }

  public Object doReverseGreaterThanOrEquals(final float lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(float.class).doGreaterThanOrEquals(lhs, ((NgLong)rhs).getLongValue());
  }

  public Object doReverseGreaterThanOrEquals(final double lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(double.class).doGreaterThanOrEquals(lhs, ((NgLong)rhs).getLongValue());
  }

  public Object doReverseGreaterThanOrEquals(final BigInteger lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(BigInteger.class).doGreaterThanOrEquals(lhs, ((NgLong)rhs).getLongValue());
  }

  public Object doReverseGreaterThanOrEquals(final BigDecimal lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(BigDecimal.class).doGreaterThanOrEquals(lhs, ((NgLong)rhs).getLongValue());
  }
  
  @Override
  public Object doAsType(final Object instance, final Class type) {
    
    if (type == long.class) return instance;
    
    return super.doAsType(instance, type);
  }

}
