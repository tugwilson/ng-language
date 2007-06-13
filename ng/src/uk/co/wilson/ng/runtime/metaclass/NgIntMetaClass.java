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

public class NgIntMetaClass extends RuntimeMetaClassImpl {
  public NgIntMetaClass() {
    super(int.class, new NgIntInternalMetaClass(int.class));
  }
}

class NgIntInternalMetaClass extends InternalMetaClassImpl {
  public NgIntInternalMetaClass(final Class theClass) {
    super(theClass);
  }
  /* (non-Javadoc)
   * @see uk.co.wilson.ng.runtime.metaclass.InternalMetaClassImpl#doCalculateConversionCost(java.lang.Class)
   */
  @Override
  public int doCalculateConversionCost(final Class parameterType) {
    if (parameterType == int.class) return 0;
    
    if (parameterType == long.class) return 1;
    
    if (parameterType == BigInteger.class) return 2;
    
    if (parameterType == float.class) return 3;
    
    if (parameterType == double.class) return 4;
    
    if (parameterType == BigDecimal.class) return 5;
    
    return super.doCalculateConversionCost(parameterType);
  }

  /* (non-Javadoc)
   * @see uk.co.wilson.ng.runtime.metaclass.InternalMetaClassImpl#doGetParamObject(java.lang.Object, java.lang.Class)
   */
  @Override
 public Object doGetParamObject(final Object instance, final Class parameterType) {
    if (parameterType == int.class) return new Integer(((NgInt)instance).getIntValue());
    
    if (parameterType == long.class) return new Long(((NgInt)instance).getIntValue());
    
    if (parameterType == BigInteger.class) return BigInteger.valueOf(((NgInt)instance).getIntValue());
    
    if (parameterType == float.class) return new Float(((NgInt)instance).getIntValue());
    
    if (parameterType == double.class) return new Double(((NgInt)instance).getIntValue());
    
    if (parameterType == BigDecimal.class) return new BigDecimal(((NgInt)instance).getIntValue());
    
    return super.doGetParamObject(instance, parameterType);
  }

  @Override
  public Object doComplement(final int instance) {
    return NgInt.valueOf(~instance);
  }
  
  @Override
  public Object doComplement(final Object instance) {
    return NgInt.valueOf(~((NgInt)instance).getIntValue());
  }

  @Override
  public Object doUnaryPlus(final int instance) {
    return NgInt.valueOf(instance);
  }
  
  @Override
  public Object doUnaryPlus(final Object instance) {
    return instance;
  }
  
  @Override
  public Object doUnaryMinus(final int instance) {
    return NgInt.valueOf(-instance);
  }
  
  @Override
  public Object doUnaryMinus(final Object instance) {
    return NgInt.valueOf(-((NgInt)instance).getIntValue());
  }

  @Override
  public Object doPostfixIncrement(final int instance) {
    return NgInt.valueOf(instance + 1);
  }

  @Override
  public Object doPostfixIncrement(final Object instance) {
    return NgInt.valueOf(((NgInt)instance).getIntValue() + 1);
  }

  @Override
  public Object doPostfixDecrement(final int instance) {
    return NgInt.valueOf(instance - 1);
  }

  @Override
  public Object doPostfixDecrement(final Object instance) {
    return NgInt.valueOf(((NgInt)instance).getIntValue() - 1);
  }

  @Override
  public Object doPrefixIncrement(final int instance) {
    return NgInt.valueOf(instance + 1);
  }

  @Override
  public Object doPrefixIncrement(final Object instance) {
    return NgInt.valueOf(((NgInt)instance).getIntValue() + 1);
  }

  @Override
  public Object doPrefixDecrement(final int instance) {
    return NgInt.valueOf(instance - 1);
  }

  @Override
  public Object doPrefixDecrement(final Object instance) {
    return NgInt.valueOf(((NgInt)instance).getIntValue() - 1);
  }

  @Override
  public Object doAdd(final Object lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseAdd(((NgInt)lhs).getIntValue(), rhs);
  }

  @Override
  public Object doAdd(final int lhs, final byte rhs) throws Throwable {
    return NgInt.valueOf(lhs + rhs);
  }

  @Override
  public Object doAdd(final int lhs, final char rhs) throws Throwable {
    return NgInt.valueOf(lhs + rhs);
  }

  @Override
  public Object doAdd(final int lhs, final short rhs) throws Throwable {
    return NgInt.valueOf(lhs + rhs);
  }

  @Override
  public Object doAdd(final int lhs, final int rhs) throws Throwable {
    return NgInt.valueOf(lhs + rhs);
  }

  @Override
  public Object doAdd(final int lhs, final long rhs) throws Throwable {
    return NgLong.valueOf(lhs + rhs);
  }

  @Override
  public Object doAdd(final int lhs, final float rhs) throws Throwable {
    return NgFloat.valueOf(lhs + rhs);
  }

  @Override
  public Object doAdd(final int lhs, final double rhs) throws Throwable {
    return NgDouble.valueOf(lhs + rhs);
  }

  @Override
  public Object doAdd(final int lhs, final BigInteger rhs) throws Throwable {
    return BigInteger.valueOf(lhs).add(rhs);
  }

  @Override
  public Object doAdd(final int lhs, final BigDecimal rhs) throws Throwable {
    return new BigDecimal(lhs).add(rhs);
  }

  @Override
  public Object doAdd(final Object lhs, final byte rhs) throws Throwable {
    return doAdd(((NgInt)lhs).getIntValue(), rhs);
  }

  @Override
  public Object doAdd(final Object lhs, final char rhs) throws Throwable {
    return doAdd(((NgInt)lhs).getIntValue(), rhs);
  }

  @Override
  public Object doAdd(final Object lhs, final short rhs) throws Throwable {
    return doAdd(((NgInt)lhs).getIntValue(), rhs);
  }

  @Override
  public Object doAdd(final Object lhs, final int rhs) throws Throwable {
    return doAdd(((NgInt)lhs).getIntValue(), rhs);
  }

  @Override
  public Object doAdd(final Object lhs, final long rhs) throws Throwable {
    return doAdd(((NgInt)lhs).getIntValue(), rhs);
  }

  @Override
  public Object doAdd(final Object lhs, final float rhs) throws Throwable {
    return doAdd(((NgInt)lhs).getIntValue(), rhs);
  }

  @Override
  public Object doAdd(final Object lhs, final double rhs) throws Throwable {
    return doAdd(((NgInt)lhs).getIntValue(), rhs);
  }

  @Override
  public Object doAdd(final Object lhs, final BigInteger rhs) throws Throwable {
    return doAdd(((NgInt)lhs).getIntValue(), rhs);
  }

  @Override
  public Object doAdd(final Object lhs, final BigDecimal rhs) throws Throwable {
    return doAdd(((NgInt)lhs).getIntValue(), rhs);
  }

  @Override
  public Object doReverseAdd(final byte lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(byte.class).doAdd(lhs, ((NgInt)rhs).getIntValue());
  }

  @Override
  public Object doReverseAdd(final char lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(char.class).doAdd(lhs, ((NgInt)rhs).getIntValue());
  }

  @Override
  public Object doReverseAdd(final short lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(short.class).doAdd(lhs, ((NgInt)rhs).getIntValue());
  }

  @Override
  public Object doReverseAdd(final int lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(int.class).doAdd(lhs, ((NgInt)rhs).getIntValue());
  }

  @Override
  public Object doReverseAdd(final long lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(long.class).doAdd(lhs, ((NgInt)rhs).getIntValue());
  }

  @Override
  public Object doReverseAdd(final float lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(float.class).doAdd(lhs, ((NgInt)rhs).getIntValue());
  }

  @Override
  public Object doReverseAdd(final double lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(double.class).doAdd(lhs, ((NgInt)rhs).getIntValue());
  }

  @Override
  public Object doReverseAdd(final BigInteger lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(BigInteger.class).doAdd(lhs, ((NgInt)rhs).getIntValue());
  }

  @Override
  public Object doReverseAdd(final BigDecimal lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(BigDecimal.class).doAdd(lhs, ((NgInt)rhs).getIntValue());
  }

  @Override
  public Object doAddEquals(final Object lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseAddEquals(((NgInt)lhs).getIntValue(), rhs);
  }

  @Override
  public Object doAddEquals(final int lhs, final byte rhs) throws Throwable {
    return NgInt.valueOf(lhs + rhs);
  }

  @Override
  public Object doAddEquals(final int lhs, final char rhs) throws Throwable {
    return NgInt.valueOf(lhs + rhs);
  }

  @Override
  public Object doAddEquals(final int lhs, final short rhs) throws Throwable {
    return NgInt.valueOf(lhs + rhs);
  }

  @Override
  public Object doAddEquals(final int lhs, final int rhs) throws Throwable {
    return NgInt.valueOf(lhs + rhs);
  }

  @Override
  public Object doAddEquals(final int lhs, final long rhs) throws Throwable {
    return NgLong.valueOf(lhs + rhs);
  }

  @Override
  public Object doAddEquals(final int lhs, final float rhs) throws Throwable {
    return NgFloat.valueOf(lhs + rhs);
  }

  @Override
  public Object doAddEquals(final int lhs, final double rhs) throws Throwable {
    return NgDouble.valueOf(lhs + rhs);
  }

  @Override
  public Object doAddEquals(final int lhs, final BigInteger rhs) throws Throwable {
    return BigInteger.valueOf(lhs).add(rhs);
  }

  @Override
  public Object doAddEquals(final int lhs, final BigDecimal rhs) throws Throwable {
    return new BigDecimal(lhs).add(rhs);
  }

  @Override
  public Object doAddEquals(final Object lhs, final byte rhs) throws Throwable {
    return doAddEquals(((NgInt)lhs).getIntValue(), rhs);
  }

  @Override
  public Object doAddEquals(final Object lhs, final char rhs) throws Throwable {
    return doAddEquals(((NgInt)lhs).getIntValue(), rhs);
  }

  @Override
  public Object doAddEquals(final Object lhs, final short rhs) throws Throwable {
    return doAddEquals(((NgInt)lhs).getIntValue(), rhs);
  }

  @Override
  public Object doAddEquals(final Object lhs, final int rhs) throws Throwable {
    return doAddEquals(((NgInt)lhs).getIntValue(), rhs);
  }

  @Override
  public Object doAddEquals(final Object lhs, final long rhs) throws Throwable {
    return doAddEquals(((NgInt)lhs).getIntValue(), rhs);
  }

  @Override
  public Object doAddEquals(final Object lhs, final float rhs) throws Throwable {
    return doAddEquals(((NgInt)lhs).getIntValue(), rhs);
  }

  @Override
  public Object doAddEquals(final Object lhs, final double rhs) throws Throwable {
    return doAddEquals(((NgInt)lhs).getIntValue(), rhs);
  }

  @Override
  public Object doAddEquals(final Object lhs, final BigInteger rhs) throws Throwable {
    return doAddEquals(((NgInt)lhs).getIntValue(), rhs);
  }

  @Override
  public Object doAddEquals(final Object lhs, final BigDecimal rhs) throws Throwable {
    return doAddEquals(((NgInt)lhs).getIntValue(), rhs);
  }

  @Override
  public Object doReverseAddEquals(final byte lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(byte.class).doAddEquals(lhs, ((NgInt)rhs).getIntValue());
  }

  @Override
  public Object doReverseAddEquals(final char lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(char.class).doAddEquals(lhs, ((NgInt)rhs).getIntValue());
  }

  @Override
  public Object doReverseAddEquals(final short lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(short.class).doAddEquals(lhs, ((NgInt)rhs).getIntValue());
  }

  @Override
  public Object doReverseAddEquals(final int lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(int.class).doAddEquals(lhs, ((NgInt)rhs).getIntValue());
  }

  @Override
  public Object doReverseAddEquals(final long lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(long.class).doAddEquals(lhs, ((NgInt)rhs).getIntValue());
  }

  @Override
  public Object doReverseAddEquals(final float lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(float.class).doAddEquals(lhs, ((NgInt)rhs).getIntValue());
  }

  @Override
  public Object doReverseAddEquals(final double lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(double.class).doAddEquals(lhs, ((NgInt)rhs).getIntValue());
  }

  @Override
  public Object doReverseAddEquals(final BigInteger lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(BigInteger.class).doAddEquals(lhs, ((NgInt)rhs).getIntValue());
  }

  @Override
  public Object doReverseAddEquals(final BigDecimal lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(BigDecimal.class).doAddEquals(lhs, ((NgInt)rhs).getIntValue());
  }

  @Override
  public Object doSubtract(final Object lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseSubtract(((NgInt)lhs).getIntValue(), rhs);
  }

  @Override
  public Object doSubtract(final int lhs, final byte rhs) throws Throwable {
    return NgInt.valueOf(lhs - rhs);
  }

  @Override
  public Object doSubtract(final int lhs, final char rhs) throws Throwable {
    return NgInt.valueOf(lhs - rhs);
  }

  @Override
  public Object doSubtract(final int lhs, final short rhs) throws Throwable {
    return NgInt.valueOf(lhs - rhs);
  }

  @Override
  public Object doSubtract(final int lhs, final int rhs) throws Throwable {
    return NgInt.valueOf(lhs - rhs);
  }

  @Override
  public Object doSubtract(final int lhs, final long rhs) throws Throwable {
    return NgLong.valueOf(lhs - rhs);
  }

  @Override
  public Object doSubtract(final int lhs, final float rhs) throws Throwable {
    return NgFloat.valueOf(lhs - rhs);
  }

  @Override
  public Object doSubtract(final int lhs, final double rhs) throws Throwable {
    return NgDouble.valueOf(lhs - rhs);
  }

  @Override
  public Object doSubtract(final int lhs, final BigInteger rhs) throws Throwable {
    return BigInteger.valueOf(lhs).subtract(rhs);
  }

  @Override
  public Object doSubtract(final int lhs, final BigDecimal rhs) throws Throwable {
    return new BigDecimal(lhs).subtract(rhs);
  }

  @Override
  public Object doSubtract(final Object lhs, final byte rhs) throws Throwable {
    return doSubtract(((NgInt)lhs).getIntValue(), rhs);
  }

  @Override
  public Object doSubtract(final Object lhs, final char rhs) throws Throwable {
    return doSubtract(((NgInt)lhs).getIntValue(), rhs);
  }

  @Override
  public Object doSubtract(final Object lhs, final short rhs) throws Throwable {
    return doSubtract(((NgInt)lhs).getIntValue(), rhs);
  }

  @Override
  public Object doSubtract(final Object lhs, final int rhs) throws Throwable {
    return doSubtract(((NgInt)lhs).getIntValue(), rhs);
  }

  @Override
  public Object doSubtract(final Object lhs, final long rhs) throws Throwable {
    return doSubtract(((NgInt)lhs).getIntValue(), rhs);
  }

  @Override
  public Object doSubtract(final Object lhs, final float rhs) throws Throwable {
    return doSubtract(((NgInt)lhs).getIntValue(), rhs);
  }

  @Override
  public Object doSubtract(final Object lhs, final double rhs) throws Throwable {
    return doSubtract(((NgInt)lhs).getIntValue(), rhs);
  }

  @Override
  public Object doSubtract(final Object lhs, final BigInteger rhs) throws Throwable {
    return doSubtract(((NgInt)lhs).getIntValue(), rhs);
  }

  @Override
  public Object doSubtract(final Object lhs, final BigDecimal rhs) throws Throwable {
    return doSubtract(((NgInt)lhs).getIntValue(), rhs);
  }

  @Override
  public Object doReverseSubtract(final byte lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(byte.class).doSubtract(lhs, ((NgInt)rhs).getIntValue());
  }

  @Override
  public Object doReverseSubtract(final char lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(char.class).doSubtract(lhs, ((NgInt)rhs).getIntValue());
  }

  @Override
  public Object doReverseSubtract(final short lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(short.class).doSubtract(lhs, ((NgInt)rhs).getIntValue());
  }

  @Override
  public Object doReverseSubtract(final int lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(int.class).doSubtract(lhs, ((NgInt)rhs).getIntValue());
  }

  @Override
  public Object doReverseSubtract(final long lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(long.class).doSubtract(lhs, ((NgInt)rhs).getIntValue());
  }

  @Override
  public Object doReverseSubtract(final float lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(float.class).doSubtract(lhs, ((NgInt)rhs).getIntValue());
  }

  @Override
  public Object doReverseSubtract(final double lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(double.class).doSubtract(lhs, ((NgInt)rhs).getIntValue());
  }

  @Override
  public Object doReverseSubtract(final BigInteger lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(BigInteger.class).doSubtract(lhs, ((NgInt)rhs).getIntValue());
  }

  @Override
  public Object doReverseSubtract(final BigDecimal lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(BigDecimal.class).doSubtract(lhs, ((NgInt)rhs).getIntValue());
  }

  @Override
  public Object doSubtractEquals(final Object lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseSubtractEquals(((NgInt)lhs).getIntValue(), rhs);
  }

  @Override
  public Object doSubtractEquals(final int lhs, final byte rhs) throws Throwable {
    return NgInt.valueOf(lhs - rhs);
  }

  @Override
  public Object doSubtractEquals(final int lhs, final char rhs) throws Throwable {
    return NgInt.valueOf(lhs - rhs);
  }

  @Override
  public Object doSubtractEquals(final int lhs, final short rhs) throws Throwable {
    return NgInt.valueOf(lhs - rhs);
  }

  @Override
  public Object doSubtractEquals(final int lhs, final int rhs) throws Throwable {
    return NgInt.valueOf(lhs - rhs);
  }

  @Override
  public Object doSubtractEquals(final int lhs, final long rhs) throws Throwable {
    return NgLong.valueOf(lhs - rhs);
  }

  @Override
  public Object doSubtractEquals(final int lhs, final float rhs) throws Throwable {
    return NgFloat.valueOf(lhs - rhs);
  }

  @Override
  public Object doSubtractEquals(final int lhs, final double rhs) throws Throwable {
    return NgDouble.valueOf(lhs - rhs);
  }

  @Override
  public Object doSubtractEquals(final int lhs, final BigInteger rhs) throws Throwable {
    return BigInteger.valueOf(lhs).subtract(rhs);
  }

  @Override
  public Object doSubtractEquals(final int lhs, final BigDecimal rhs) throws Throwable {
    return new BigDecimal(lhs).subtract(rhs);
  }

  @Override
  public Object doSubtractEquals(final Object lhs, final byte rhs) throws Throwable {
    return doSubtractEquals(((NgInt)lhs).getIntValue(), rhs);
  }

  @Override
  public Object doSubtractEquals(final Object lhs, final char rhs) throws Throwable {
    return doSubtractEquals(((NgInt)lhs).getIntValue(), rhs);
  }

  @Override
  public Object doSubtractEquals(final Object lhs, final short rhs) throws Throwable {
    return doSubtractEquals(((NgInt)lhs).getIntValue(), rhs);
  }

  @Override
  public Object doSubtractEquals(final Object lhs, final int rhs) throws Throwable {
    return doSubtractEquals(((NgInt)lhs).getIntValue(), rhs);
  }

  @Override
  public Object doSubtractEquals(final Object lhs, final long rhs) throws Throwable {
    return doSubtractEquals(((NgInt)lhs).getIntValue(), rhs);
  }

  @Override
  public Object doSubtractEquals(final Object lhs, final float rhs) throws Throwable {
    return doSubtractEquals(((NgInt)lhs).getIntValue(), rhs);
  }

  @Override
  public Object doSubtractEquals(final Object lhs, final double rhs) throws Throwable {
    return doSubtractEquals(((NgInt)lhs).getIntValue(), rhs);
  }

  @Override
  public Object doSubtractEquals(final Object lhs, final BigInteger rhs) throws Throwable {
    return doSubtractEquals(((NgInt)lhs).getIntValue(), rhs);
  }

  @Override
  public Object doSubtractEquals(final Object lhs, final BigDecimal rhs) throws Throwable {
    return doSubtractEquals(((NgInt)lhs).getIntValue(), rhs);
  }

  @Override
  public Object doReverseSubtractEquals(final byte lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(byte.class).doSubtractEquals(lhs, ((NgInt)rhs).getIntValue());
  }

  @Override
  public Object doReverseSubtractEquals(final char lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(char.class).doSubtractEquals(lhs, ((NgInt)rhs).getIntValue());
  }

  @Override
  public Object doReverseSubtractEquals(final short lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(short.class).doSubtractEquals(lhs, ((NgInt)rhs).getIntValue());
  }

  @Override
  public Object doReverseSubtractEquals(final int lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(int.class).doSubtractEquals(lhs, ((NgInt)rhs).getIntValue());
  }

  @Override
  public Object doReverseSubtractEquals(final long lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(long.class).doSubtractEquals(lhs, ((NgInt)rhs).getIntValue());
  }

  @Override
  public Object doReverseSubtractEquals(final float lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(float.class).doSubtractEquals(lhs, ((NgInt)rhs).getIntValue());
  }

  @Override
  public Object doReverseSubtractEquals(final double lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(double.class).doSubtractEquals(lhs, ((NgInt)rhs).getIntValue());
  }

  @Override
  public Object doReverseSubtractEquals(final BigInteger lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(BigInteger.class).doSubtractEquals(lhs, ((NgInt)rhs).getIntValue());
  }

  @Override
  public Object doReverseSubtractEquals(final BigDecimal lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(BigDecimal.class).doSubtractEquals(lhs, ((NgInt)rhs).getIntValue());
  }

  @Override
  public Object doMultiply(final Object lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseMultiply(((NgInt)lhs).getIntValue(), rhs);
  }

  @Override
  public Object doMultiply(final int lhs, final byte rhs) throws Throwable {
    return NgInt.valueOf(lhs * rhs);
  }

  @Override
  public Object doMultiply(final int lhs, final char rhs) throws Throwable {
    return NgInt.valueOf(lhs * rhs);
  }

  @Override
  public Object doMultiply(final int lhs, final short rhs) throws Throwable {
    return NgInt.valueOf(lhs * rhs);
  }

  @Override
  public Object doMultiply(final int lhs, final int rhs) throws Throwable {
    return NgInt.valueOf(lhs * rhs);
  }

  @Override
  public Object doMultiply(final int lhs, final long rhs) throws Throwable {
    return NgLong.valueOf(lhs * rhs);
  }

  @Override
  public Object doMultiply(final int lhs, final float rhs) throws Throwable {
    return NgFloat.valueOf(lhs * rhs);
  }

  @Override
  public Object doMultiply(final int lhs, final double rhs) throws Throwable {
    return NgDouble.valueOf(lhs * rhs);
  }

  @Override
  public Object doMultiply(final int lhs, final BigInteger rhs) throws Throwable {
    return BigInteger.valueOf(lhs).multiply(rhs);
  }

  @Override
  public Object doMultiply(final int lhs, final BigDecimal rhs) throws Throwable {
    return new BigDecimal(lhs).multiply(rhs);
  }

  @Override
  public Object doMultiply(final Object lhs, final byte rhs) throws Throwable {
    return doMultiply(((NgInt)lhs).getIntValue(), rhs);
  }

  @Override
  public Object doMultiply(final Object lhs, final char rhs) throws Throwable {
    return doMultiply(((NgInt)lhs).getIntValue(), rhs);
  }

  @Override
  public Object doMultiply(final Object lhs, final short rhs) throws Throwable {
    return doMultiply(((NgInt)lhs).getIntValue(), rhs);
  }

  @Override
  public Object doMultiply(final Object lhs, final int rhs) throws Throwable {
    return doMultiply(((NgInt)lhs).getIntValue(), rhs);
  }

  @Override
  public Object doMultiply(final Object lhs, final long rhs) throws Throwable {
    return doMultiply(((NgInt)lhs).getIntValue(), rhs);
  }

  @Override
  public Object doMultiply(final Object lhs, final float rhs) throws Throwable {
    return doMultiply(((NgInt)lhs).getIntValue(), rhs);
  }

  @Override
  public Object doMultiply(final Object lhs, final double rhs) throws Throwable {
    return doMultiply(((NgInt)lhs).getIntValue(), rhs);
  }

  @Override
  public Object doMultiply(final Object lhs, final BigInteger rhs) throws Throwable {
    return doMultiply(((NgInt)lhs).getIntValue(), rhs);
  }

  @Override
  public Object doMultiply(final Object lhs, final BigDecimal rhs) throws Throwable {
    return doMultiply(((NgInt)lhs).getIntValue(), rhs);
  }

  @Override
  public Object doReverseMultiply(final byte lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(byte.class).doMultiply(lhs, ((NgInt)rhs).getIntValue());
  }

  @Override
  public Object doReverseMultiply(final char lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(char.class).doMultiply(lhs, ((NgInt)rhs).getIntValue());
  }

  @Override
  public Object doReverseMultiply(final short lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(short.class).doMultiply(lhs, ((NgInt)rhs).getIntValue());
  }

  @Override
  public Object doReverseMultiply(final int lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(int.class).doMultiply(lhs, ((NgInt)rhs).getIntValue());
  }

  @Override
  public Object doReverseMultiply(final long lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(long.class).doMultiply(lhs, ((NgInt)rhs).getIntValue());
  }

  @Override
  public Object doReverseMultiply(final float lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(float.class).doMultiply(lhs, ((NgInt)rhs).getIntValue());
  }

  @Override
  public Object doReverseMultiply(final double lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(double.class).doMultiply(lhs, ((NgInt)rhs).getIntValue());
  }

  @Override
  public Object doReverseMultiply(final BigInteger lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(BigInteger.class).doMultiply(lhs, ((NgInt)rhs).getIntValue());
  }

  @Override
  public Object doReverseMultiply(final BigDecimal lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(BigDecimal.class).doMultiply(lhs, ((NgInt)rhs).getIntValue());
  }

  @Override
  public Object doMultiplyEquals(final Object lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseMultiplyEquals(((NgInt)lhs).getIntValue(), rhs);
  }

  @Override
  public Object doMultiplyEquals(final int lhs, final byte rhs) throws Throwable {
    return NgInt.valueOf(lhs * rhs);
  }

  @Override
  public Object doMultiplyEquals(final int lhs, final char rhs) throws Throwable {
    return NgInt.valueOf(lhs * rhs);
  }

  @Override
  public Object doMultiplyEquals(final int lhs, final short rhs) throws Throwable {
    return NgInt.valueOf(lhs * rhs);
  }

  @Override
  public Object doMultiplyEquals(final int lhs, final int rhs) throws Throwable {
    return NgInt.valueOf(lhs * rhs);
  }

  @Override
  public Object doMultiplyEquals(final int lhs, final long rhs) throws Throwable {
    return NgLong.valueOf(lhs * rhs);
  }

  @Override
  public Object doMultiplyEquals(final int lhs, final float rhs) throws Throwable {
    return NgFloat.valueOf(lhs * rhs);
  }

  @Override
  public Object doMultiplyEquals(final int lhs, final double rhs) throws Throwable {
    return NgDouble.valueOf(lhs * rhs);
  }

  @Override
  public Object doMultiplyEquals(final int lhs, final BigInteger rhs) throws Throwable {
    return BigInteger.valueOf(lhs).multiply(rhs);
  }

  @Override
  public Object doMultiplyEquals(final int lhs, final BigDecimal rhs) throws Throwable {
    return new BigDecimal(lhs).multiply(rhs);
  }

  @Override
  public Object doMultiplyEquals(final Object lhs, final byte rhs) throws Throwable {
    return doMultiplyEquals(((NgInt)lhs).getIntValue(), rhs);
  }

  @Override
  public Object doMultiplyEquals(final Object lhs, final char rhs) throws Throwable {
    return doMultiplyEquals(((NgInt)lhs).getIntValue(), rhs);
  }

  @Override
  public Object doMultiplyEquals(final Object lhs, final short rhs) throws Throwable {
    return doMultiplyEquals(((NgInt)lhs).getIntValue(), rhs);
  }

  @Override
  public Object doMultiplyEquals(final Object lhs, final int rhs) throws Throwable {
    return doMultiplyEquals(((NgInt)lhs).getIntValue(), rhs);
  }

  @Override
  public Object doMultiplyEquals(final Object lhs, final long rhs) throws Throwable {
    return doMultiplyEquals(((NgInt)lhs).getIntValue(), rhs);
  }

  @Override
  public Object doMultiplyEquals(final Object lhs, final float rhs) throws Throwable {
    return doMultiplyEquals(((NgInt)lhs).getIntValue(), rhs);
  }

  @Override
  public Object doMultiplyEquals(final Object lhs, final double rhs) throws Throwable {
    return doMultiplyEquals(((NgInt)lhs).getIntValue(), rhs);
  }

  @Override
  public Object doMultiplyEquals(final Object lhs, final BigInteger rhs) throws Throwable {
    return doMultiplyEquals(((NgInt)lhs).getIntValue(), rhs);
  }

  @Override
  public Object doMultiplyEquals(final Object lhs, final BigDecimal rhs) throws Throwable {
    return doMultiplyEquals(((NgInt)lhs).getIntValue(), rhs);
  }

  @Override
  public Object doReverseMultiplyEquals(final byte lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(byte.class).doMultiplyEquals(lhs, ((NgInt)rhs).getIntValue());
  }

  @Override
  public Object doReverseMultiplyEquals(final char lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(char.class).doMultiplyEquals(lhs, ((NgInt)rhs).getIntValue());
  }

  @Override
  public Object doReverseMultiplyEquals(final short lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(short.class).doMultiplyEquals(lhs, ((NgInt)rhs).getIntValue());
  }

  @Override
  public Object doReverseMultiplyEquals(final int lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(int.class).doMultiplyEquals(lhs, ((NgInt)rhs).getIntValue());
  }

  @Override
  public Object doReverseMultiplyEquals(final long lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(long.class).doMultiplyEquals(lhs, ((NgInt)rhs).getIntValue());
  }

  @Override
  public Object doReverseMultiplyEquals(final float lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(float.class).doMultiplyEquals(lhs, ((NgInt)rhs).getIntValue());
  }

  @Override
  public Object doReverseMultiplyEquals(final double lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(double.class).doMultiplyEquals(lhs, ((NgInt)rhs).getIntValue());
  }

  @Override
  public Object doReverseMultiplyEquals(final BigInteger lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(BigInteger.class).doMultiplyEquals(lhs, ((NgInt)rhs).getIntValue());
  }

  @Override
  public Object doReverseMultiplyEquals(final BigDecimal lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(BigDecimal.class).doMultiplyEquals(lhs, ((NgInt)rhs).getIntValue());
  }

  @Override
  public Object doDivide(final Object lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseDivide(((NgInt)lhs).getIntValue(), rhs);
  }

  @Override
  public Object doDivide(final int lhs, final byte rhs) throws Throwable {
    return NgInt.valueOf(lhs / rhs);
  }

  @Override
  public Object doDivide(final int lhs, final char rhs) throws Throwable {
    return NgInt.valueOf(lhs / rhs);
  }

  @Override
  public Object doDivide(final int lhs, final short rhs) throws Throwable {
    return NgInt.valueOf(lhs / rhs);
  }

  @Override
  public Object doDivide(final int lhs, final int rhs) throws Throwable {
    return NgInt.valueOf(lhs / rhs);
  }

  @Override
  public Object doDivide(final int lhs, final long rhs) throws Throwable {
    return NgLong.valueOf(lhs / rhs);
  }

  @Override
  public Object doDivide(final int lhs, final float rhs) throws Throwable {
    return NgFloat.valueOf(lhs / rhs);
  }

  @Override
  public Object doDivide(final int lhs, final double rhs) throws Throwable {
    return NgDouble.valueOf(lhs / rhs);
  }

  @Override
  public Object doDivide(final int lhs, final BigInteger rhs) throws Throwable {
    return BigInteger.valueOf(lhs).divide(rhs);
  }

  @Override
  public Object doDivide(final int lhs, final BigDecimal rhs) throws Throwable {
    return new BigDecimal(lhs).divide(rhs);
  }

  @Override
  public Object doDivide(final Object lhs, final byte rhs) throws Throwable {
    return doDivide(((NgInt)lhs).getIntValue(), rhs);
  }

  @Override
  public Object doDivide(final Object lhs, final char rhs) throws Throwable {
    return doDivide(((NgInt)lhs).getIntValue(), rhs);
  }

  @Override
  public Object doDivide(final Object lhs, final short rhs) throws Throwable {
    return doDivide(((NgInt)lhs).getIntValue(), rhs);
  }

  @Override
  public Object doDivide(final Object lhs, final int rhs) throws Throwable {
    return doDivide(((NgInt)lhs).getIntValue(), rhs);
  }

  @Override
  public Object doDivide(final Object lhs, final long rhs) throws Throwable {
    return doDivide(((NgInt)lhs).getIntValue(), rhs);
  }

  @Override
  public Object doDivide(final Object lhs, final float rhs) throws Throwable {
    return doDivide(((NgInt)lhs).getIntValue(), rhs);
  }

  @Override
  public Object doDivide(final Object lhs, final double rhs) throws Throwable {
    return doDivide(((NgInt)lhs).getIntValue(), rhs);
  }

  @Override
  public Object doDivide(final Object lhs, final BigInteger rhs) throws Throwable {
    return doDivide(((NgInt)lhs).getIntValue(), rhs);
  }

  @Override
  public Object doDivide(final Object lhs, final BigDecimal rhs) throws Throwable {
    return doDivide(((NgInt)lhs).getIntValue(), rhs);
  }

  @Override
  public Object doReverseDivide(final byte lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(byte.class).doDivide(lhs, ((NgInt)rhs).getIntValue());
  }

  @Override
  public Object doReverseDivide(final char lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(char.class).doDivide(lhs, ((NgInt)rhs).getIntValue());
  }

  @Override
  public Object doReverseDivide(final short lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(short.class).doDivide(lhs, ((NgInt)rhs).getIntValue());
  }

  @Override
  public Object doReverseDivide(final int lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(int.class).doDivide(lhs, ((NgInt)rhs).getIntValue());
  }

  @Override
  public Object doReverseDivide(final long lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(long.class).doDivide(lhs, ((NgInt)rhs).getIntValue());
  }

  @Override
  public Object doReverseDivide(final float lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(float.class).doDivide(lhs, ((NgInt)rhs).getIntValue());
  }

  @Override
  public Object doReverseDivide(final double lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(double.class).doDivide(lhs, ((NgInt)rhs).getIntValue());
  }

  @Override
  public Object doReverseDivide(final BigInteger lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(BigInteger.class).doDivide(lhs, ((NgInt)rhs).getIntValue());
  }

  @Override
  public Object doReverseDivide(final BigDecimal lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(BigDecimal.class).doDivide(lhs, ((NgInt)rhs).getIntValue());
  }

  @Override
  public Object doDivideEquals(final Object lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseDivideEquals(((NgInt)lhs).getIntValue(), rhs);
  }

  @Override
  public Object doDivideEquals(final int lhs, final byte rhs) throws Throwable {
    return NgInt.valueOf(lhs / rhs);
  }

  @Override
  public Object doDivideEquals(final int lhs, final char rhs) throws Throwable {
    return NgInt.valueOf(lhs / rhs);
  }

  @Override
  public Object doDivideEquals(final int lhs, final short rhs) throws Throwable {
    return NgInt.valueOf(lhs / rhs);
  }

  @Override
  public Object doDivideEquals(final int lhs, final int rhs) throws Throwable {
    return NgInt.valueOf(lhs / rhs);
  }

  @Override
  public Object doDivideEquals(final int lhs, final long rhs) throws Throwable {
    return NgLong.valueOf(lhs / rhs);
  }

  @Override
  public Object doDivideEquals(final int lhs, final float rhs) throws Throwable {
    return NgFloat.valueOf(lhs / rhs);
  }

  @Override
  public Object doDivideEquals(final int lhs, final double rhs) throws Throwable {
    return NgDouble.valueOf(lhs / rhs);
  }

  @Override
  public Object doDivideEquals(final int lhs, final BigInteger rhs) throws Throwable {
    return BigInteger.valueOf(lhs).divide(rhs);
  }

  @Override
  public Object doDivideEquals(final int lhs, final BigDecimal rhs) throws Throwable {
    return new BigDecimal(lhs).divide(rhs);
  }

  @Override
  public Object doDivideEquals(final Object lhs, final byte rhs) throws Throwable {
    return doDivideEquals(((NgInt)lhs).getIntValue(), rhs);
  }

  @Override
  public Object doDivideEquals(final Object lhs, final char rhs) throws Throwable {
    return doDivideEquals(((NgInt)lhs).getIntValue(), rhs);
  }

  @Override
  public Object doDivideEquals(final Object lhs, final short rhs) throws Throwable {
    return doDivideEquals(((NgInt)lhs).getIntValue(), rhs);
  }

  @Override
  public Object doDivideEquals(final Object lhs, final int rhs) throws Throwable {
    return doDivideEquals(((NgInt)lhs).getIntValue(), rhs);
  }

  @Override
  public Object doDivideEquals(final Object lhs, final long rhs) throws Throwable {
    return doDivideEquals(((NgInt)lhs).getIntValue(), rhs);
  }

  @Override
  public Object doDivideEquals(final Object lhs, final float rhs) throws Throwable {
    return doDivideEquals(((NgInt)lhs).getIntValue(), rhs);
  }

  @Override
  public Object doDivideEquals(final Object lhs, final double rhs) throws Throwable {
    return doDivideEquals(((NgInt)lhs).getIntValue(), rhs);
  }

  @Override
  public Object doDivideEquals(final Object lhs, final BigInteger rhs) throws Throwable {
    return doDivideEquals(((NgInt)lhs).getIntValue(), rhs);
  }

  @Override
  public Object doDivideEquals(final Object lhs, final BigDecimal rhs) throws Throwable {
    return doDivideEquals(((NgInt)lhs).getIntValue(), rhs);
  }

  @Override
  public Object doReverseDivideEquals(final byte lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(byte.class).doDivideEquals(lhs, ((NgInt)rhs).getIntValue());
  }

  @Override
  public Object doReverseDivideEquals(final char lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(char.class).doDivideEquals(lhs, ((NgInt)rhs).getIntValue());
  }

  @Override
  public Object doReverseDivideEquals(final short lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(short.class).doDivideEquals(lhs, ((NgInt)rhs).getIntValue());
  }

  @Override
  public Object doReverseDivideEquals(final int lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(int.class).doDivideEquals(lhs, ((NgInt)rhs).getIntValue());
  }

  @Override
  public Object doReverseDivideEquals(final long lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(long.class).doDivideEquals(lhs, ((NgInt)rhs).getIntValue());
  }

  @Override
  public Object doReverseDivideEquals(final float lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(float.class).doDivideEquals(lhs, ((NgInt)rhs).getIntValue());
  }

  @Override
  public Object doReverseDivideEquals(final double lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(double.class).doDivideEquals(lhs, ((NgInt)rhs).getIntValue());
  }

  @Override
  public Object doReverseDivideEquals(final BigInteger lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(BigInteger.class).doDivideEquals(lhs, ((NgInt)rhs).getIntValue());
  }

  @Override
  public Object doReverseDivideEquals(final BigDecimal lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(BigDecimal.class).doDivideEquals(lhs, ((NgInt)rhs).getIntValue());
  }

  @Override
  public Object doRemainder(final Object lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseRemainder(((NgInt)lhs).getIntValue(), rhs);
  }

  @Override
  public Object doRemainder(final int lhs, final byte rhs) throws Throwable {
    return NgInt.valueOf(lhs % rhs);
  }

  @Override
  public Object doRemainder(final int lhs, final char rhs) throws Throwable {
    return NgInt.valueOf(lhs % rhs);
  }

  @Override
  public Object doRemainder(final int lhs, final short rhs) throws Throwable {
    return NgInt.valueOf(lhs % rhs);
  }

  @Override
  public Object doRemainder(final int lhs, final int rhs) throws Throwable {
    return NgInt.valueOf(lhs % rhs);
  }

  @Override
  public Object doRemainder(final int lhs, final long rhs) throws Throwable {
    return NgLong.valueOf(lhs % rhs);
  }

  @Override
  public Object doRemainder(final int lhs, final BigInteger rhs) throws Throwable {
    return BigInteger.valueOf(lhs).mod(rhs);
  }

  @Override
  public Object doRemainder(final Object lhs, final byte rhs) throws Throwable {
    return doRemainder(((NgInt)lhs).getIntValue(), rhs);
  }

  @Override
  public Object doRemainder(final Object lhs, final char rhs) throws Throwable {
    return doRemainder(((NgInt)lhs).getIntValue(), rhs);
  }

  @Override
  public Object doRemainder(final Object lhs, final short rhs) throws Throwable {
    return doRemainder(((NgInt)lhs).getIntValue(), rhs);
  }

  @Override
  public Object doRemainder(final Object lhs, final int rhs) throws Throwable {
    return doRemainder(((NgInt)lhs).getIntValue(), rhs);
  }

  @Override
  public Object doRemainder(final Object lhs, final long rhs) throws Throwable {
    return doRemainder(((NgInt)lhs).getIntValue(), rhs);
  }

  @Override
  public Object doRemainder(final Object lhs, final BigInteger rhs) throws Throwable {
    return doRemainder(((NgInt)lhs).getIntValue(), rhs);
  }

  @Override
  public Object doReverseRemainder(final byte lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(byte.class).doRemainder(lhs, ((NgInt)rhs).getIntValue());
  }

  @Override
  public Object doReverseRemainder(final char lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(char.class).doRemainder(lhs, ((NgInt)rhs).getIntValue());
  }

  @Override
  public Object doReverseRemainder(final short lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(short.class).doRemainder(lhs, ((NgInt)rhs).getIntValue());
  }

  @Override
  public Object doReverseRemainder(final int lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(int.class).doRemainder(lhs, ((NgInt)rhs).getIntValue());
  }

  @Override
  public Object doReverseRemainder(final long lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(long.class).doRemainder(lhs, ((NgInt)rhs).getIntValue());
  }

  @Override
  public Object doReverseRemainder(final BigInteger lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(BigInteger.class).doRemainder(lhs, ((NgInt)rhs).getIntValue());
  }

  @Override
  public Object doRemainderEquals(final Object lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseRemainderEquals(((NgInt)lhs).getIntValue(), rhs);
  }

  @Override
  public Object doRemainderEquals(final int lhs, final byte rhs) throws Throwable {
    return NgInt.valueOf(lhs % rhs);
  }

  @Override
  public Object doRemainderEquals(final int lhs, final char rhs) throws Throwable {
    return NgInt.valueOf(lhs % rhs);
  }

  @Override
  public Object doRemainderEquals(final int lhs, final short rhs) throws Throwable {
    return NgInt.valueOf(lhs % rhs);
  }

  @Override
  public Object doRemainderEquals(final int lhs, final int rhs) throws Throwable {
    return NgInt.valueOf(lhs % rhs);
  }

  @Override
  public Object doRemainderEquals(final int lhs, final long rhs) throws Throwable {
    return NgLong.valueOf(lhs % rhs);
  }

  @Override
  public Object doRemainderEquals(final int lhs, final BigInteger rhs) throws Throwable {
    return BigInteger.valueOf(lhs).mod(rhs);
  }

  @Override
  public Object doRemainderEquals(final Object lhs, final byte rhs) throws Throwable {
    return doRemainderEquals(((NgInt)lhs).getIntValue(), rhs);
  }

  @Override
  public Object doRemainderEquals(final Object lhs, final char rhs) throws Throwable {
    return doRemainderEquals(((NgInt)lhs).getIntValue(), rhs);
  }

  @Override
  public Object doRemainderEquals(final Object lhs, final short rhs) throws Throwable {
    return doRemainderEquals(((NgInt)lhs).getIntValue(), rhs);
  }

  @Override
  public Object doRemainderEquals(final Object lhs, final int rhs) throws Throwable {
    return doRemainderEquals(((NgInt)lhs).getIntValue(), rhs);
  }

  @Override
  public Object doRemainderEquals(final Object lhs, final long rhs) throws Throwable {
    return doRemainderEquals(((NgInt)lhs).getIntValue(), rhs);
  }

  @Override
  public Object doRemainderEquals(final Object lhs, final BigInteger rhs) throws Throwable {
    return doRemainderEquals(((NgInt)lhs).getIntValue(), rhs);
  }

  @Override
  public Object doReverseRemainderEquals(final byte lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(byte.class).doRemainderEquals(lhs, ((NgInt)rhs).getIntValue());
  }

  @Override
  public Object doReverseRemainderEquals(final char lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(char.class).doRemainderEquals(lhs, ((NgInt)rhs).getIntValue());
  }

  @Override
  public Object doReverseRemainderEquals(final short lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(short.class).doRemainderEquals(lhs, ((NgInt)rhs).getIntValue());
  }

  @Override
  public Object doReverseRemainderEquals(final int lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(int.class).doRemainderEquals(lhs, ((NgInt)rhs).getIntValue());
  }

  @Override
  public Object doReverseRemainderEquals(final long lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(long.class).doRemainderEquals(lhs, ((NgInt)rhs).getIntValue());
  }

  @Override
  public Object doReverseRemainderEquals(final BigInteger lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(BigInteger.class).doRemainderEquals(lhs, ((NgInt)rhs).getIntValue());
  }

  @Override
  public Object doIntegerDivide(final Object lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseIntegerDivide(((NgInt)lhs).getIntValue(), rhs);
  }

  @Override
  public Object doIntegerDivide(final int lhs, final byte rhs) throws Throwable {
    return NgInt.valueOf(lhs / rhs);
  }

  @Override
  public Object doIntegerDivide(final int lhs, final char rhs) throws Throwable {
    return NgInt.valueOf(lhs / rhs);
  }

  @Override
  public Object doIntegerDivide(final int lhs, final short rhs) throws Throwable {
    return NgInt.valueOf(lhs / rhs);
  }

  @Override
  public Object doIntegerDivide(final int lhs, final int rhs) throws Throwable {
    return NgInt.valueOf(lhs / rhs);
  }

  @Override
  public Object doIntegerDivide(final int lhs, final long rhs) throws Throwable {
    return NgLong.valueOf(lhs / rhs);
  }

  @Override
  public Object doIntegerDivide(final int lhs, final float rhs) throws Throwable {
    return NgFloat.valueOf((float)Math.floor(lhs / rhs));
  }

  @Override
  public Object doIntegerDivide(final int lhs, final double rhs) throws Throwable {
    return NgDouble.valueOf(Math.floor(lhs / rhs));
  }

  @Override
  public Object doIntegerDivide(final int lhs, final BigInteger rhs) throws Throwable {
    return BigInteger.valueOf(lhs).divide(rhs);
  }

  @Override
  public Object doIntegerDivide(final int lhs, final BigDecimal rhs) throws Throwable {
    return BigDecimal.valueOf(lhs).divideToIntegralValue(rhs);
  }

  @Override
  public Object doIntegerDivide(final Object lhs, final byte rhs) throws Throwable {
    return doIntegerDivide(((NgInt)lhs).getIntValue(), rhs);
  }

  @Override
  public Object doIntegerDivide(final Object lhs, final char rhs) throws Throwable {
    return doIntegerDivide(((NgInt)lhs).getIntValue(), rhs);
  }

  @Override
  public Object doIntegerDivide(final Object lhs, final short rhs) throws Throwable {
    return doIntegerDivide(((NgInt)lhs).getIntValue(), rhs);
  }

  @Override
  public Object doIntegerDivide(final Object lhs, final int rhs) throws Throwable {
    return doIntegerDivide(((NgInt)lhs).getIntValue(), rhs);
  }

  @Override
  public Object doIntegerDivide(final Object lhs, final long rhs) throws Throwable {
    return doIntegerDivide(((NgInt)lhs).getIntValue(), rhs);
  }

  @Override
  public Object doIntegerDivide(final Object lhs, final float rhs) throws Throwable {
    return doIntegerDivide(((NgInt)lhs).getIntValue(), rhs);
  }

  @Override
  public Object doIntegerDivide(final Object lhs, final double rhs) throws Throwable {
    return doIntegerDivide(((NgInt)lhs).getIntValue(), rhs);
  }

  @Override
  public Object doIntegerDivide(final Object lhs, final BigInteger rhs) throws Throwable {
    return doIntegerDivide(((NgInt)lhs).getIntValue(), rhs);
  }

  @Override
  public Object doIntegerDivide(final Object lhs, final BigDecimal rhs) throws Throwable {
    return doIntegerDivide(((NgInt)lhs).getIntValue(), rhs);
  }

  @Override
  public Object doReverseIntegerDivide(final byte lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(byte.class).doIntegerDivide(lhs, ((NgInt)rhs).getIntValue());
  }

  @Override
  public Object doReverseIntegerDivide(final char lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(char.class).doIntegerDivide(lhs, ((NgInt)rhs).getIntValue());
  }

  @Override
  public Object doReverseIntegerDivide(final short lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(short.class).doIntegerDivide(lhs, ((NgInt)rhs).getIntValue());
  }

  @Override
  public Object doReverseIntegerDivide(final int lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(int.class).doIntegerDivide(lhs, ((NgInt)rhs).getIntValue());
  }

  @Override
  public Object doReverseIntegerDivide(final long lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(long.class).doIntegerDivide(lhs, ((NgInt)rhs).getIntValue());
  }

  @Override
  public Object doReverseIntegerDivide(final float lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(float.class).doIntegerDivide(lhs, ((NgInt)rhs).getIntValue());
  }

  @Override
  public Object doReverseIntegerDivide(final double lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(double.class).doIntegerDivide(lhs, ((NgInt)rhs).getIntValue());
  }

  @Override
  public Object doReverseIntegerDivide(final BigInteger lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(BigInteger.class).doIntegerDivide(lhs, ((NgInt)rhs).getIntValue());
  }

  @Override
  public Object doReverseIntegerDivide(final BigDecimal lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(BigDecimal.class).doIntegerDivide(lhs, ((NgInt)rhs).getIntValue());
  }

  @Override
  public Object doIntegerDivideEquals(final Object lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseIntegerDivideEquals(((NgInt)lhs).getIntValue(), rhs);
  }

  @Override
  public Object doIntegerDivideEquals(final int lhs, final byte rhs) throws Throwable {
    return NgInt.valueOf(lhs / rhs);
  }

  @Override
  public Object doIntegerDivideEquals(final int lhs, final char rhs) throws Throwable {
    return NgInt.valueOf(lhs / rhs);
  }

  @Override
  public Object doIntegerDivideEquals(final int lhs, final short rhs) throws Throwable {
    return NgInt.valueOf(lhs / rhs);
  }

  @Override
  public Object doIntegerDivideEquals(final int lhs, final int rhs) throws Throwable {
    return NgInt.valueOf(lhs / rhs);
  }

  @Override
  public Object doIntegerDivideEquals(final int lhs, final long rhs) throws Throwable {
    return NgLong.valueOf(lhs / rhs);
  }

  @Override
  public Object doIntegerDivideEquals(final int lhs, final float rhs) throws Throwable {
    return NgFloat.valueOf((float)Math.floor(lhs / rhs));
  }

  @Override
  public Object doIntegerDivideEquals(final int lhs, final double rhs) throws Throwable {
    return NgDouble.valueOf(Math.floor(lhs / rhs));
  }

  @Override
  public Object doIntegerDivideEquals(final int lhs, final BigInteger rhs) throws Throwable {
    return BigInteger.valueOf(lhs).divide(rhs);
  }

  @Override
  public Object doIntegerDivideEquals(final int lhs, final BigDecimal rhs) throws Throwable {
    return BigDecimal.valueOf(lhs).divideToIntegralValue(rhs);
  }

  @Override
  public Object doIntegerDivideEquals(final Object lhs, final byte rhs) throws Throwable {
    return doIntegerDivideEquals(((NgInt)lhs).getIntValue(), rhs);
  }

  @Override
  public Object doIntegerDivideEquals(final Object lhs, final char rhs) throws Throwable {
    return doIntegerDivideEquals(((NgInt)lhs).getIntValue(), rhs);
  }

  @Override
  public Object doIntegerDivideEquals(final Object lhs, final short rhs) throws Throwable {
    return doIntegerDivideEquals(((NgInt)lhs).getIntValue(), rhs);
  }

  @Override
  public Object doIntegerDivideEquals(final Object lhs, final int rhs) throws Throwable {
    return doIntegerDivideEquals(((NgInt)lhs).getIntValue(), rhs);
  }

  @Override
  public Object doIntegerDivideEquals(final Object lhs, final long rhs) throws Throwable {
    return doIntegerDivideEquals(((NgInt)lhs).getIntValue(), rhs);
  }

  @Override
  public Object doIntegerDivideEquals(final Object lhs, final float rhs) throws Throwable {
    return doIntegerDivideEquals(((NgInt)lhs).getIntValue(), rhs);
  }

  @Override
  public Object doIntegerDivideEquals(final Object lhs, final double rhs) throws Throwable {
    return doIntegerDivideEquals(((NgInt)lhs).getIntValue(), rhs);
  }

  @Override
  public Object doIntegerDivideEquals(final Object lhs, final BigInteger rhs) throws Throwable {
    return doIntegerDivideEquals(((NgInt)lhs).getIntValue(), rhs);
  }

  @Override
  public Object doIntegerDivideEquals(final Object lhs, final BigDecimal rhs) throws Throwable {
    return doIntegerDivideEquals(((NgInt)lhs).getIntValue(), rhs);
  }

  @Override
  public Object doReverseIntegerDivideEquals(final byte lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(byte.class).doIntegerDivideEquals(lhs, ((NgInt)rhs).getIntValue());
  }

  @Override
  public Object doReverseIntegerDivideEquals(final char lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(char.class).doIntegerDivideEquals(lhs, ((NgInt)rhs).getIntValue());
  }

  @Override
  public Object doReverseIntegerDivideEquals(final short lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(short.class).doIntegerDivideEquals(lhs, ((NgInt)rhs).getIntValue());
  }

  @Override
  public Object doReverseIntegerDivideEquals(final int lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(int.class).doIntegerDivideEquals(lhs, ((NgInt)rhs).getIntValue());
  }

  @Override
  public Object doReverseIntegerDivideEquals(final long lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(long.class).doIntegerDivideEquals(lhs, ((NgInt)rhs).getIntValue());
  }

  @Override
  public Object doReverseIntegerDivideEquals(final float lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(float.class).doIntegerDivide(lhs, ((NgInt)rhs).getIntValue());
  }

  @Override
  public Object doReverseIntegerDivideEquals(final double lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(double.class).doIntegerDivide(lhs, ((NgInt)rhs).getIntValue());
  }

  @Override
  public Object doReverseIntegerDivideEquals(final BigInteger lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(BigInteger.class).doIntegerDivideEquals(lhs, ((NgInt)rhs).getIntValue());
  }

  @Override
  public Object doReverseIntegerDivideEquals(final BigDecimal lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(BigDecimal.class).doIntegerDivideEquals(lhs, ((NgInt)rhs).getIntValue());
  }

  @Override
  public Object doAnd(final Object lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseAnd(((NgInt)lhs).getIntValue(), rhs);
  }

  @Override
  public Object doAnd(final int lhs, final byte rhs) throws Throwable {
    return NgInt.valueOf(lhs & rhs);
  }

  @Override
  public Object doAnd(final int lhs, final char rhs) throws Throwable {
    return NgInt.valueOf(lhs & rhs);
  }

  @Override
  public Object doAnd(final int lhs, final short rhs) throws Throwable {
    return NgInt.valueOf(lhs & rhs);
  }

  @Override
  public Object doAnd(final int lhs, final int rhs) throws Throwable {
    return NgInt.valueOf(lhs & rhs);
  }

  @Override
  public Object doAnd(final int lhs, final long rhs) throws Throwable {
    return NgLong.valueOf(lhs & rhs);
  }

  @Override
  public Object doAnd(final int lhs, final BigInteger rhs) throws Throwable {
    return BigInteger.valueOf(lhs).and(rhs);
  }

  @Override
  public Object doAnd(final Object lhs, final byte rhs) throws Throwable {
    return doAnd(((NgInt)lhs).getIntValue(), rhs);
  }

  @Override
  public Object doAnd(final Object lhs, final char rhs) throws Throwable {
    return doAnd(((NgInt)lhs).getIntValue(), rhs);
  }

  @Override
  public Object doAnd(final Object lhs, final short rhs) throws Throwable {
    return doAnd(((NgInt)lhs).getIntValue(), rhs);
  }

  @Override
  public Object doAnd(final Object lhs, final int rhs) throws Throwable {
    return doAnd(((NgInt)lhs).getIntValue(), rhs);
  }

  @Override
  public Object doAnd(final Object lhs, final long rhs) throws Throwable {
    return doAnd(((NgInt)lhs).getIntValue(), rhs);
  }

  @Override
  public Object doAnd(final Object lhs, final BigInteger rhs) throws Throwable {
    return doAnd(((NgInt)lhs).getIntValue(), rhs);
  }

  @Override
  public Object doReverseAnd(final byte lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(byte.class).doAnd(lhs, ((NgInt)rhs).getIntValue());
  }

  @Override
  public Object doReverseAnd(final char lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(char.class).doAnd(lhs, ((NgInt)rhs).getIntValue());
  }

  @Override
  public Object doReverseAnd(final short lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(short.class).doAnd(lhs, ((NgInt)rhs).getIntValue());
  }

  @Override
  public Object doReverseAnd(final int lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(int.class).doAnd(lhs, ((NgInt)rhs).getIntValue());
  }

  @Override
  public Object doReverseAnd(final long lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(long.class).doAnd(lhs, ((NgInt)rhs).getIntValue());
  }

  @Override
  public Object doReverseAnd(final BigInteger lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(BigInteger.class).doAnd(lhs, ((NgInt)rhs).getIntValue());
  }

  @Override
  public Object doAndEquals(final Object lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseAndEquals(((NgInt)lhs).getIntValue(), rhs);
  }

  @Override
  public Object doAndEquals(final int lhs, final byte rhs) throws Throwable {
    return NgInt.valueOf(lhs & rhs);
  }

  @Override
  public Object doAndEquals(final int lhs, final char rhs) throws Throwable {
    return NgInt.valueOf(lhs & rhs);
  }

  @Override
  public Object doAndEquals(final int lhs, final short rhs) throws Throwable {
    return NgInt.valueOf(lhs & rhs);
  }

  @Override
  public Object doAndEquals(final int lhs, final int rhs) throws Throwable {
    return NgInt.valueOf(lhs & rhs);
  }

  @Override
  public Object doAndEquals(final int lhs, final long rhs) throws Throwable {
    return NgLong.valueOf(lhs & rhs);
  }

  @Override
  public Object doAndEquals(final int lhs, final BigInteger rhs) throws Throwable {
    return BigInteger.valueOf(lhs).and(rhs);
  }

  @Override
  public Object doAndEquals(final Object lhs, final byte rhs) throws Throwable {
    return doAndEquals(((NgInt)lhs).getIntValue(), rhs);
  }

  @Override
  public Object doAndEquals(final Object lhs, final char rhs) throws Throwable {
    return doAndEquals(((NgInt)lhs).getIntValue(), rhs);
  }

  @Override
  public Object doAndEquals(final Object lhs, final short rhs) throws Throwable {
    return doAndEquals(((NgInt)lhs).getIntValue(), rhs);
  }

  @Override
  public Object doAndEquals(final Object lhs, final int rhs) throws Throwable {
    return doAndEquals(((NgInt)lhs).getIntValue(), rhs);
  }

  @Override
  public Object doAndEquals(final Object lhs, final long rhs) throws Throwable {
    return doAndEquals(((NgInt)lhs).getIntValue(), rhs);
  }

  @Override
  public Object doAndEquals(final Object lhs, final BigInteger rhs) throws Throwable {
    return doAndEquals(((NgInt)lhs).getIntValue(), rhs);
  }

  @Override
  public Object doReverseAndEquals(final byte lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(byte.class).doAndEquals(lhs, ((NgInt)rhs).getIntValue());
  }

  @Override
  public Object doReverseAndEquals(final char lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(char.class).doAndEquals(lhs, ((NgInt)rhs).getIntValue());
  }

  @Override
  public Object doReverseAndEquals(final short lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(short.class).doAndEquals(lhs, ((NgInt)rhs).getIntValue());
  }

  @Override
  public Object doReverseAndEquals(final int lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(int.class).doAndEquals(lhs, ((NgInt)rhs).getIntValue());
  }

  @Override
  public Object doReverseAndEquals(final long lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(long.class).doAndEquals(lhs, ((NgInt)rhs).getIntValue());
  }

  @Override
  public Object doReverseAndEquals(final BigInteger lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(BigInteger.class).doAndEquals(lhs, ((NgInt)rhs).getIntValue());
  }

  @Override
  public Object doOr(final Object lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseOr(((NgInt)lhs).getIntValue(), rhs);
  }

  @Override
  public Object doOr(final int lhs, final byte rhs) throws Throwable {
    return NgInt.valueOf(lhs | rhs);
  }

  @Override
  public Object doOr(final int lhs, final char rhs) throws Throwable {
    return NgInt.valueOf(lhs | rhs);
  }

  @Override
  public Object doOr(final int lhs, final short rhs) throws Throwable {
    return NgInt.valueOf(lhs | rhs);
  }

  @Override
  public Object doOr(final int lhs, final int rhs) throws Throwable {
    return NgInt.valueOf(lhs | rhs);
  }

  @Override
  public Object doOr(final int lhs, final long rhs) throws Throwable {
    return NgLong.valueOf(lhs | rhs);
  }

  @Override
  public Object doOr(final int lhs, final BigInteger rhs) throws Throwable {
    return BigInteger.valueOf(lhs).or(rhs);
  }

  @Override
  public Object doOr(final Object lhs, final byte rhs) throws Throwable {
    return doOr(((NgInt)lhs).getIntValue(), rhs);
  }

  @Override
  public Object doOr(final Object lhs, final char rhs) throws Throwable {
    return doOr(((NgInt)lhs).getIntValue(), rhs);
  }

  @Override
  public Object doOr(final Object lhs, final short rhs) throws Throwable {
    return doOr(((NgInt)lhs).getIntValue(), rhs);
  }

  @Override
  public Object doOr(final Object lhs, final int rhs) throws Throwable {
    return doOr(((NgInt)lhs).getIntValue(), rhs);
  }

  @Override
  public Object doOr(final Object lhs, final long rhs) throws Throwable {
    return doOr(((NgInt)lhs).getIntValue(), rhs);
  }

  @Override
  public Object doOr(final Object lhs, final BigInteger rhs) throws Throwable {
    return doOr(((NgInt)lhs).getIntValue(), rhs);
  }

  @Override
  public Object doReverseOr(final byte lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(byte.class).doOr(lhs, ((NgInt)rhs).getIntValue());
  }

  @Override
  public Object doReverseOr(final char lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(char.class).doOr(lhs, ((NgInt)rhs).getIntValue());
  }

  @Override
  public Object doReverseOr(final short lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(short.class).doOr(lhs, ((NgInt)rhs).getIntValue());
  }

  @Override
  public Object doReverseOr(final int lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(int.class).doOr(lhs, ((NgInt)rhs).getIntValue());
  }

  @Override
  public Object doReverseOr(final long lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(long.class).doOr(lhs, ((NgInt)rhs).getIntValue());
  }

  @Override
  public Object doReverseOr(final BigInteger lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(BigInteger.class).doOr(lhs, ((NgInt)rhs).getIntValue());
  }

  @Override
  public Object doOrEquals(final Object lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseOrEquals(((NgInt)lhs).getIntValue(), rhs);
  }

  @Override
  public Object doOrEquals(final int lhs, final byte rhs) throws Throwable {
    return NgInt.valueOf(lhs | rhs);
  }

  @Override
  public Object doOrEquals(final int lhs, final char rhs) throws Throwable {
    return NgInt.valueOf(lhs | rhs);
  }

  @Override
  public Object doOrEquals(final int lhs, final short rhs) throws Throwable {
    return NgInt.valueOf(lhs | rhs);
  }

  @Override
  public Object doOrEquals(final int lhs, final int rhs) throws Throwable {
    return NgInt.valueOf(lhs | rhs);
  }

  @Override
  public Object doOrEquals(final int lhs, final long rhs) throws Throwable {
    return NgLong.valueOf(lhs | rhs);
  }

  @Override
  public Object doOrEquals(final int lhs, final BigInteger rhs) throws Throwable {
    return BigInteger.valueOf(lhs).or(rhs);
  }

  @Override
  public Object doOrEquals(final Object lhs, final byte rhs) throws Throwable {
    return doOrEquals(((NgInt)lhs).getIntValue(), rhs);
  }

  @Override
  public Object doOrEquals(final Object lhs, final char rhs) throws Throwable {
    return doOrEquals(((NgInt)lhs).getIntValue(), rhs);
  }

  @Override
  public Object doOrEquals(final Object lhs, final short rhs) throws Throwable {
    return doOrEquals(((NgInt)lhs).getIntValue(), rhs);
  }

  @Override
  public Object doOrEquals(final Object lhs, final int rhs) throws Throwable {
    return doOrEquals(((NgInt)lhs).getIntValue(), rhs);
  }

  @Override
  public Object doOrEquals(final Object lhs, final long rhs) throws Throwable {
    return doOrEquals(((NgInt)lhs).getIntValue(), rhs);
  }

  @Override
  public Object doOrEquals(final Object lhs, final BigInteger rhs) throws Throwable {
    return doOrEquals(((NgInt)lhs).getIntValue(), rhs);
  }

  @Override
  public Object doReverseOrEquals(final byte lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(byte.class).doOrEquals(lhs, ((NgInt)rhs).getIntValue());
  }

  @Override
  public Object doReverseOrEquals(final char lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(char.class).doOrEquals(lhs, ((NgInt)rhs).getIntValue());
  }

  @Override
  public Object doReverseOrEquals(final short lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(short.class).doOrEquals(lhs, ((NgInt)rhs).getIntValue());
  }

  @Override
  public Object doReverseOrEquals(final int lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(int.class).doOrEquals(lhs, ((NgInt)rhs).getIntValue());
  }

  @Override
  public Object doReverseOrEquals(final long lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(long.class).doOrEquals(lhs, ((NgInt)rhs).getIntValue());
  }

  @Override
  public Object doReverseOrEquals(final BigInteger lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(BigInteger.class).doOrEquals(lhs, ((NgInt)rhs).getIntValue());
  }

  @Override
  public Object doXor(final Object lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseXor(((NgInt)lhs).getIntValue(), rhs);
  }

  @Override
  public Object doXor(final int lhs, final byte rhs) throws Throwable {
    return NgInt.valueOf(lhs ^ rhs);
  }

  @Override
  public Object doXor(final int lhs, final char rhs) throws Throwable {
    return NgInt.valueOf(lhs ^ rhs);
  }

  @Override
  public Object doXor(final int lhs, final short rhs) throws Throwable {
    return NgInt.valueOf(lhs ^ rhs);
  }

  @Override
  public Object doXor(final int lhs, final int rhs) throws Throwable {
    return NgInt.valueOf(lhs ^ rhs);
  }

  @Override
  public Object doXor(final int lhs, final long rhs) throws Throwable {
    return NgLong.valueOf(lhs ^ rhs);
  }

  @Override
  public Object doXor(final int lhs, final BigInteger rhs) throws Throwable {
    return BigInteger.valueOf(lhs).xor(rhs);
  }

  @Override
  public Object doXor(final Object lhs, final byte rhs) throws Throwable {
    return doXor(((NgInt)lhs).getIntValue(), rhs);
  }

  @Override
  public Object doXor(final Object lhs, final char rhs) throws Throwable {
    return doXor(((NgInt)lhs).getIntValue(), rhs);
  }

  @Override
  public Object doXor(final Object lhs, final short rhs) throws Throwable {
    return doXor(((NgInt)lhs).getIntValue(), rhs);
  }

  @Override
  public Object doXor(final Object lhs, final int rhs) throws Throwable {
    return doXor(((NgInt)lhs).getIntValue(), rhs);
  }

  @Override
  public Object doXor(final Object lhs, final long rhs) throws Throwable {
    return doXor(((NgInt)lhs).getIntValue(), rhs);
  }

  @Override
  public Object doXor(final Object lhs, final BigInteger rhs) throws Throwable {
    return doXor(((NgInt)lhs).getIntValue(), rhs);
  }

  @Override
  public Object doReverseXor(final byte lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(byte.class).doXor(lhs, ((NgInt)rhs).getIntValue());
  }

  @Override
  public Object doReverseXor(final char lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(char.class).doXor(lhs, ((NgInt)rhs).getIntValue());
  }

  @Override
  public Object doReverseXor(final short lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(short.class).doXor(lhs, ((NgInt)rhs).getIntValue());
  }

  @Override
  public Object doReverseXor(final int lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(int.class).doXor(lhs, ((NgInt)rhs).getIntValue());
  }

  @Override
  public Object doReverseXor(final long lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(long.class).doXor(lhs, ((NgInt)rhs).getIntValue());
  }

  @Override
  public Object doReverseXor(final BigInteger lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(BigInteger.class).doXor(lhs, ((NgInt)rhs).getIntValue());
  }

  @Override
  public Object doXorEquals(final Object lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseXorEquals(((NgInt)lhs).getIntValue(), rhs);
  }

  @Override
  public Object doXorEquals(final int lhs, final byte rhs) throws Throwable {
    return NgInt.valueOf(lhs ^ rhs);
  }

  @Override
  public Object doXorEquals(final int lhs, final char rhs) throws Throwable {
    return NgInt.valueOf(lhs ^ rhs);
  }

  @Override
  public Object doXorEquals(final int lhs, final short rhs) throws Throwable {
    return NgInt.valueOf(lhs ^ rhs);
  }

  @Override
  public Object doXorEquals(final int lhs, final int rhs) throws Throwable {
    return NgInt.valueOf(lhs ^ rhs);
  }

  @Override
  public Object doXorEquals(final int lhs, final long rhs) throws Throwable {
    return NgLong.valueOf(lhs ^ rhs);
  }

  @Override
  public Object doXorEquals(final int lhs, final BigInteger rhs) throws Throwable {
    return BigInteger.valueOf(lhs).xor(rhs);
  }

  @Override
  public Object doXorEquals(final Object lhs, final byte rhs) throws Throwable {
    return doXorEquals(((NgInt)lhs).getIntValue(), rhs);
  }

  @Override
  public Object doXorEquals(final Object lhs, final char rhs) throws Throwable {
    return doXorEquals(((NgInt)lhs).getIntValue(), rhs);
  }

  @Override
  public Object doXorEquals(final Object lhs, final short rhs) throws Throwable {
    return doXorEquals(((NgInt)lhs).getIntValue(), rhs);
  }

  @Override
  public Object doXorEquals(final Object lhs, final int rhs) throws Throwable {
    return doXorEquals(((NgInt)lhs).getIntValue(), rhs);
  }

  @Override
  public Object doXorEquals(final Object lhs, final long rhs) throws Throwable {
    return doXorEquals(((NgInt)lhs).getIntValue(), rhs);
  }

  @Override
  public Object doXorEquals(final Object lhs, final BigInteger rhs) throws Throwable {
    return doXorEquals(((NgInt)lhs).getIntValue(), rhs);
  }

  @Override
  public Object doReverseXorEquals(final byte lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(byte.class).doXorEquals(lhs, ((NgInt)rhs).getIntValue());
  }

  @Override
  public Object doReverseXorEquals(final char lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(char.class).doXorEquals(lhs, ((NgInt)rhs).getIntValue());
  }

  @Override
  public Object doReverseXorEquals(final short lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(short.class).doXorEquals(lhs, ((NgInt)rhs).getIntValue());
  }

  @Override
  public Object doReverseXorEquals(final int lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(int.class).doXorEquals(lhs, ((NgInt)rhs).getIntValue());
  }

  @Override
  public Object doReverseXorEquals(final long lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(long.class).doXorEquals(lhs, ((NgInt)rhs).getIntValue());
  }

  @Override
  public Object doReverseXorEquals(final BigInteger lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(BigInteger.class).doXorEquals(lhs, ((NgInt)rhs).getIntValue());
  }

  @Override
  public Object doLeftShift(final Object lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseLeftShift(((NgInt)lhs).getIntValue(), rhs);
  }

  @Override
  public Object doLeftShift(final int lhs, final byte rhs) throws Throwable {
    return NgInt.valueOf(lhs << rhs);
  }

  @Override
  public Object doLeftShift(final int lhs, final char rhs) throws Throwable {
    return NgInt.valueOf(lhs << rhs);
  }

  @Override
  public Object doLeftShift(final int lhs, final short rhs) throws Throwable {
    return NgInt.valueOf(lhs << rhs);
  }

  @Override
  public Object doLeftShift(final int lhs, final int rhs) throws Throwable {
    return NgInt.valueOf(lhs << rhs);
  }

  @Override
  public Object doLeftShift(final int lhs, final long rhs) throws Throwable {
    return NgInt.valueOf(lhs << rhs);
  }

  @Override
  public Object doLeftShift(final int lhs, final BigInteger rhs) throws Throwable {
    return NgInt.valueOf(lhs << rhs.intValue());
  }

  @Override
  public Object doLeftShift(final Object lhs, final byte rhs) throws Throwable {
    return doLeftShift(((NgInt)lhs).getIntValue(), rhs);
  }

  @Override
  public Object doLeftShift(final Object lhs, final char rhs) throws Throwable {
    return doLeftShift(((NgInt)lhs).getIntValue(), rhs);
  }

  @Override
  public Object doLeftShift(final Object lhs, final short rhs) throws Throwable {
    return doLeftShift(((NgInt)lhs).getIntValue(), rhs);
  }

  @Override
  public Object doLeftShift(final Object lhs, final int rhs) throws Throwable {
    return doLeftShift(((NgInt)lhs).getIntValue(), rhs);
  }

  @Override
  public Object doLeftShift(final Object lhs, final long rhs) throws Throwable {
    return doLeftShift(((NgInt)lhs).getIntValue(), rhs);
  }

  @Override
  public Object doLeftShift(final Object lhs, final BigInteger rhs) throws Throwable {
    return doLeftShift(((NgInt)lhs).getIntValue(), rhs);
  }

  @Override
  public Object doReverseLeftShift(final byte lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(byte.class).doLeftShift(lhs, ((NgInt)rhs).getIntValue());
  }

  @Override
  public Object doReverseLeftShift(final char lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(char.class).doLeftShift(lhs, ((NgInt)rhs).getIntValue());
  }

  @Override
  public Object doReverseLeftShift(final short lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(short.class).doLeftShift(lhs, ((NgInt)rhs).getIntValue());
  }

  @Override
  public Object doReverseLeftShift(final int lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(int.class).doLeftShift(lhs, ((NgInt)rhs).getIntValue());
  }

  @Override
  public Object doReverseLeftShift(final long lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(long.class).doLeftShift(lhs, ((NgInt)rhs).getIntValue());
  }

  @Override
  public Object doReverseLeftShift(final BigInteger lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(BigInteger.class).doLeftShift(lhs, ((NgInt)rhs).getIntValue());
  }

  @Override
  public Object doLeftShiftEquals(final Object lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseLeftShiftEquals(((NgInt)lhs).getIntValue(), rhs);
  }

  @Override
  public Object doLeftShiftEquals(final int lhs, final byte rhs) throws Throwable {
    return NgInt.valueOf(lhs << rhs);
  }

  @Override
  public Object doLeftShiftEquals(final int lhs, final char rhs) throws Throwable {
    return NgInt.valueOf(lhs << rhs);
  }

  @Override
  public Object doLeftShiftEquals(final int lhs, final short rhs) throws Throwable {
    return NgInt.valueOf(lhs << rhs);
  }

  @Override
  public Object doLeftShiftEquals(final int lhs, final int rhs) throws Throwable {
    return NgInt.valueOf(lhs << rhs);
  }

  @Override
  public Object doLeftShiftEquals(final int lhs, final long rhs) throws Throwable {
    return NgInt.valueOf(lhs << rhs);
  }

  @Override
  public Object doLeftShiftEquals(final int lhs, final BigInteger rhs) throws Throwable {
    return NgInt.valueOf(lhs << rhs.intValue());
  }

  @Override
  public Object doLeftShiftEquals(final Object lhs, final byte rhs) throws Throwable {
    return doLeftShiftEquals(((NgInt)lhs).getIntValue(), rhs);
  }

  @Override
  public Object doLeftShiftEquals(final Object lhs, final char rhs) throws Throwable {
    return doLeftShiftEquals(((NgInt)lhs).getIntValue(), rhs);
  }

  @Override
  public Object doLeftShiftEquals(final Object lhs, final short rhs) throws Throwable {
    return doLeftShiftEquals(((NgInt)lhs).getIntValue(), rhs);
  }

  @Override
  public Object doLeftShiftEquals(final Object lhs, final int rhs) throws Throwable {
    return doLeftShiftEquals(((NgInt)lhs).getIntValue(), rhs);
  }

  @Override
  public Object doLeftShiftEquals(final Object lhs, final long rhs) throws Throwable {
    return doLeftShiftEquals(((NgInt)lhs).getIntValue(), rhs);
  }

  @Override
  public Object doLeftShiftEquals(final Object lhs, final BigInteger rhs) throws Throwable {
    return doLeftShiftEquals(((NgInt)lhs).getIntValue(), rhs);
  }

  @Override
  public Object doReverseLeftShiftEquals(final byte lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(byte.class).doLeftShiftEquals(lhs, ((NgInt)rhs).getIntValue());
  }

  @Override
  public Object doReverseLeftShiftEquals(final char lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(char.class).doLeftShiftEquals(lhs, ((NgInt)rhs).getIntValue());
  }

  @Override
  public Object doReverseLeftShiftEquals(final short lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(short.class).doLeftShiftEquals(lhs, ((NgInt)rhs).getIntValue());
  }

  @Override
  public Object doReverseLeftShiftEquals(final int lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(int.class).doLeftShiftEquals(lhs, ((NgInt)rhs).getIntValue());
  }

  @Override
  public Object doReverseLeftShiftEquals(final long lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(long.class).doLeftShiftEquals(lhs, ((NgInt)rhs).getIntValue());
  }

  @Override
  public Object doReverseLeftShiftEquals(final BigInteger lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(BigInteger.class).doLeftShiftEquals(lhs, ((NgInt)rhs).getIntValue());
  }

  @Override
  public Object doArithmeticRightShift(final Object lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseArithmeticRightShift(((NgInt)lhs).getIntValue(), rhs);
  }

  @Override
  public Object doArithmeticRightShift(final int lhs, final byte rhs) throws Throwable {
    return NgInt.valueOf(lhs >> rhs);
  }

  @Override
  public Object doArithmeticRightShift(final int lhs, final char rhs) throws Throwable {
    return NgInt.valueOf(lhs >> rhs);
  }

  @Override
  public Object doArithmeticRightShift(final int lhs, final short rhs) throws Throwable {
    return NgInt.valueOf(lhs >> rhs);
  }

  @Override
  public Object doArithmeticRightShift(final int lhs, final int rhs) throws Throwable {
    return NgInt.valueOf(lhs >> rhs);
  }

  @Override
  public Object doArithmeticRightShift(final int lhs, final long rhs) throws Throwable {
    return NgInt.valueOf(lhs >> rhs);
  }

  @Override
  public Object doArithmeticRightShift(final int lhs, final BigInteger rhs) throws Throwable {
    return NgInt.valueOf(lhs >> rhs.intValue());
  }

  @Override
  public Object doArithmeticRightShift(final Object lhs, final byte rhs) throws Throwable {
    return doArithmeticRightShift(((NgInt)lhs).getIntValue(), rhs);
  }

  @Override
  public Object doArithmeticRightShift(final Object lhs, final char rhs) throws Throwable {
    return doArithmeticRightShift(((NgInt)lhs).getIntValue(), rhs);
  }

  @Override
  public Object doArithmeticRightShift(final Object lhs, final short rhs) throws Throwable {
    return doArithmeticRightShift(((NgInt)lhs).getIntValue(), rhs);
  }

  @Override
  public Object doArithmeticRightShift(final Object lhs, final int rhs) throws Throwable {
    return doArithmeticRightShift(((NgInt)lhs).getIntValue(), rhs);
  }

  @Override
  public Object doArithmeticRightShift(final Object lhs, final long rhs) throws Throwable {
    return doArithmeticRightShift(((NgInt)lhs).getIntValue(), rhs);
  }

  @Override
  public Object doArithmeticRightShift(final Object lhs, final BigInteger rhs) throws Throwable {
    return doArithmeticRightShift(((NgInt)lhs).getIntValue(), rhs);
  }

  @Override
  public Object doReverseArithmeticRightShift(final byte lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(byte.class).doArithmeticRightShift(lhs, ((NgInt)rhs).getIntValue());
  }

  @Override
  public Object doReverseArithmeticRightShift(final char lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(char.class).doArithmeticRightShift(lhs, ((NgInt)rhs).getIntValue());
  }

  @Override
  public Object doReverseArithmeticRightShift(final short lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(short.class).doArithmeticRightShift(lhs, ((NgInt)rhs).getIntValue());
  }

  @Override
  public Object doReverseArithmeticRightShift(final int lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(int.class).doArithmeticRightShift(lhs, ((NgInt)rhs).getIntValue());
  }

  @Override
  public Object doReverseArithmeticRightShift(final long lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(long.class).doArithmeticRightShift(lhs, ((NgInt)rhs).getIntValue());
  }

  @Override
  public Object doReverseArithmeticRightShift(final BigInteger lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(BigInteger.class).doArithmeticRightShift(lhs, ((NgInt)rhs).getIntValue());
  }

  @Override
  public Object doArithmeticRightShiftEquals(final Object lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseArithmeticRightShiftEquals(((NgInt)lhs).getIntValue(), rhs);
  }

  @Override
  public Object doArithmeticRightShiftEquals(final int lhs, final byte rhs) throws Throwable {
    return NgInt.valueOf(lhs >> rhs);
  }

  @Override
  public Object doArithmeticRightShiftEquals(final int lhs, final char rhs) throws Throwable {
    return NgInt.valueOf(lhs >> rhs);
  }

  @Override
  public Object doArithmeticRightShiftEquals(final int lhs, final short rhs) throws Throwable {
    return NgInt.valueOf(lhs >> rhs);
  }

  @Override
  public Object doArithmeticRightShiftEquals(final int lhs, final int rhs) throws Throwable {
    return NgInt.valueOf(lhs >> rhs);
  }

  @Override
  public Object doArithmeticRightShiftEquals(final int lhs, final long rhs) throws Throwable {
    return NgInt.valueOf(lhs >> rhs);
  }

  @Override
  public Object doArithmeticRightShiftEquals(final int lhs, final BigInteger rhs) throws Throwable {
    return NgInt.valueOf(lhs >> rhs.intValue());
  }

  @Override
  public Object doArithmeticRightShiftEquals(final Object lhs, final byte rhs) throws Throwable {
    return doArithmeticRightShiftEquals(((NgInt)lhs).getIntValue(), rhs);
  }

  @Override
  public Object doArithmeticRightShiftEquals(final Object lhs, final char rhs) throws Throwable {
    return doArithmeticRightShiftEquals(((NgInt)lhs).getIntValue(), rhs);
  }

  @Override
  public Object doArithmeticRightShiftEquals(final Object lhs, final short rhs) throws Throwable {
    return doArithmeticRightShiftEquals(((NgInt)lhs).getIntValue(), rhs);
  }

  @Override
  public Object doArithmeticRightShiftEquals(final Object lhs, final int rhs) throws Throwable {
    return doArithmeticRightShiftEquals(((NgInt)lhs).getIntValue(), rhs);
  }

  @Override
  public Object doArithmeticRightShiftEquals(final Object lhs, final long rhs) throws Throwable {
    return doArithmeticRightShiftEquals(((NgInt)lhs).getIntValue(), rhs);
  }

  @Override
  public Object doArithmeticRightShiftEquals(final Object lhs, final BigInteger rhs) throws Throwable {
    return doArithmeticRightShiftEquals(((NgInt)lhs).getIntValue(), rhs);
  }

  @Override
  public Object doReverseArithmeticRightShiftEquals(final byte lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(byte.class).doArithmeticRightShiftEquals(lhs, ((NgInt)rhs).getIntValue());
  }

  @Override
  public Object doReverseArithmeticRightShiftEquals(final char lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(char.class).doArithmeticRightShiftEquals(lhs, ((NgInt)rhs).getIntValue());
  }

  @Override
  public Object doReverseArithmeticRightShiftEquals(final short lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(short.class).doArithmeticRightShiftEquals(lhs, ((NgInt)rhs).getIntValue());
  }

  @Override
  public Object doReverseArithmeticRightShiftEquals(final int lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(int.class).doArithmeticRightShiftEquals(lhs, ((NgInt)rhs).getIntValue());
  }

  @Override
  public Object doReverseArithmeticRightShiftEquals(final long lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(long.class).doArithmeticRightShiftEquals(lhs, ((NgInt)rhs).getIntValue());
  }

  @Override
  public Object doReverseArithmeticRightShiftEquals(final BigInteger lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(BigInteger.class).doArithmeticRightShiftEquals(lhs, ((NgInt)rhs).getIntValue());
  }

  @Override
  public Object doLogicalRightShift(final Object lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseLogicalRightShift(((NgInt)lhs).getIntValue(), rhs);
  }

  @Override
  public Object doLogicalRightShift(final int lhs, final byte rhs) throws Throwable {
    return NgInt.valueOf(lhs >>> rhs);
  }

  @Override
  public Object doLogicalRightShift(final int lhs, final char rhs) throws Throwable {
    return NgInt.valueOf(lhs >>> rhs);
  }

  @Override
  public Object doLogicalRightShift(final int lhs, final short rhs) throws Throwable {
    return NgInt.valueOf(lhs >>> rhs);
  }

  @Override
  public Object doLogicalRightShift(final int lhs, final int rhs) throws Throwable {
    return NgInt.valueOf(lhs >>> rhs);
  }

  @Override
  public Object doLogicalRightShift(final int lhs, final long rhs) throws Throwable {
    return NgInt.valueOf(lhs >>> rhs);
  }

  @Override
  public Object doLogicalRightShift(final int lhs, final BigInteger rhs) throws Throwable {
    return NgInt.valueOf(lhs >>> rhs.intValue());
  }

  @Override
  public Object doLogicalRightShift(final Object lhs, final byte rhs) throws Throwable {
    return doLogicalRightShift(((NgInt)lhs).getIntValue(), rhs);
  }

  @Override
  public Object doLogicalRightShift(final Object lhs, final char rhs) throws Throwable {
    return doLogicalRightShift(((NgInt)lhs).getIntValue(), rhs);
  }

  @Override
  public Object doLogicalRightShift(final Object lhs, final short rhs) throws Throwable {
    return doLogicalRightShift(((NgInt)lhs).getIntValue(), rhs);
  }

  @Override
  public Object doLogicalRightShift(final Object lhs, final int rhs) throws Throwable {
    return doLogicalRightShift(((NgInt)lhs).getIntValue(), rhs);
  }

  @Override
  public Object doLogicalRightShift(final Object lhs, final long rhs) throws Throwable {
    return doLogicalRightShift(((NgInt)lhs).getIntValue(), rhs);
  }

  @Override
  public Object doLogicalRightShift(final Object lhs, final BigInteger rhs) throws Throwable {
    return doLogicalRightShift(((NgInt)lhs).getIntValue(), rhs);
  }

  @Override
  public Object doReverseLogicalRightShift(final byte lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(byte.class).doLogicalRightShift(lhs, ((NgInt)rhs).getIntValue());
  }

  @Override
  public Object doReverseLogicalRightShift(final char lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(char.class).doLogicalRightShift(lhs, ((NgInt)rhs).getIntValue());
  }

  @Override
  public Object doReverseLogicalRightShift(final short lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(short.class).doLogicalRightShift(lhs, ((NgInt)rhs).getIntValue());
  }

  @Override
  public Object doReverseLogicalRightShift(final int lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(int.class).doLogicalRightShift(lhs, ((NgInt)rhs).getIntValue());
  }

  @Override
  public Object doReverseLogicalRightShift(final long lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(long.class).doLogicalRightShift(lhs, ((NgInt)rhs).getIntValue());
  }

  @Override
  public Object doLogicalRightShiftEquals(final Object lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseLogicalRightShiftEquals(((NgInt)lhs).getIntValue(), rhs);
  }

  @Override
  public Object doLogicalRightShiftEquals(final int lhs, final byte rhs) throws Throwable {
    return NgInt.valueOf(lhs >>> rhs);
  }

  @Override
  public Object doLogicalRightShiftEquals(final int lhs, final char rhs) throws Throwable {
    return NgInt.valueOf(lhs >>> rhs);
  }

  @Override
  public Object doLogicalRightShiftEquals(final int lhs, final short rhs) throws Throwable {
    return NgInt.valueOf(lhs >>> rhs);
  }

  @Override
  public Object doLogicalRightShiftEquals(final int lhs, final int rhs) throws Throwable {
    return NgInt.valueOf(lhs >>> rhs);
  }

  @Override
  public Object doLogicalRightShiftEquals(final int lhs, final long rhs) throws Throwable {
    return NgInt.valueOf(lhs >>> rhs);
  }

  @Override
  public Object doLogicalRightShiftEquals(final int lhs, final BigInteger rhs) throws Throwable {
    return NgInt.valueOf(lhs >>> rhs.intValue());
  }

  @Override
  public Object doLogicalRightShiftEquals(final Object lhs, final byte rhs) throws Throwable {
    return doLogicalRightShiftEquals(((NgInt)lhs).getIntValue(), rhs);
  }

  @Override
  public Object doLogicalRightShiftEquals(final Object lhs, final char rhs) throws Throwable {
    return doLogicalRightShiftEquals(((NgInt)lhs).getIntValue(), rhs);
  }

  @Override
  public Object doLogicalRightShiftEquals(final Object lhs, final short rhs) throws Throwable {
    return doLogicalRightShiftEquals(((NgInt)lhs).getIntValue(), rhs);
  }

  @Override
  public Object doLogicalRightShiftEquals(final Object lhs, final int rhs) throws Throwable {
    return doLogicalRightShiftEquals(((NgInt)lhs).getIntValue(), rhs);
  }

  @Override
  public Object doLogicalRightShiftEquals(final Object lhs, final long rhs) throws Throwable {
    return doLogicalRightShiftEquals(((NgInt)lhs).getIntValue(), rhs);
  }

  @Override
  public Object doLogicalRightShiftEquals(final Object lhs, final BigInteger rhs) throws Throwable {
    return doLogicalRightShiftEquals(((NgInt)lhs).getIntValue(), rhs);
  }

  @Override
  public Object doReverseLogicalRightShiftEquals(final byte lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(byte.class).doLogicalRightShiftEquals(lhs, ((NgInt)rhs).getIntValue());
  }

  @Override
  public Object doReverseLogicalRightShiftEquals(final char lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(char.class).doLogicalRightShiftEquals(lhs, ((NgInt)rhs).getIntValue());
  }

  @Override
  public Object doReverseLogicalRightShiftEquals(final short lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(short.class).doLogicalRightShiftEquals(lhs, ((NgInt)rhs).getIntValue());
  }

  @Override
  public Object doReverseLogicalRightShiftEquals(final int lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(int.class).doLogicalRightShiftEquals(lhs, ((NgInt)rhs).getIntValue());
  }

  @Override
  public Object doReverseLogicalRightShiftEquals(final long lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(long.class).doLogicalRightShiftEquals(lhs, ((NgInt)rhs).getIntValue());
  }

  @Override
  public Object doCompare(final Object lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseCompare(((NgInt)lhs).getIntValue(), rhs);
  }

  @Override
  public Object doCompare(final int lhs, final byte rhs) throws Throwable {
    if (lhs == rhs) return NgInt.ZERO;
    if (lhs < rhs) return NgInt.MINUS_ONE;
    return NgInt.ONE;
  }

  @Override
  public Object doCompare(final int lhs, final char rhs) throws Throwable {
    if (lhs == rhs) return NgInt.ZERO;
    if (lhs < rhs) return NgInt.MINUS_ONE;
    return NgInt.ONE;
  }

  @Override
  public Object doCompare(final int lhs, final short rhs) throws Throwable {
    if (lhs == rhs) return NgInt.ZERO;
    if (lhs < rhs) return NgInt.MINUS_ONE;
    return NgInt.ONE;
  }

  @Override
  public Object doCompare(final int lhs, final int rhs) throws Throwable {
    if (lhs == rhs) return NgInt.ZERO;
    if (lhs < rhs) return NgInt.MINUS_ONE;
    return NgInt.ONE;
  }

  @Override
  public Object doCompare(final int lhs, final long rhs) throws Throwable {
    if (lhs == rhs) return NgInt.ZERO;
    if (lhs < rhs) return NgInt.MINUS_ONE;
    return NgInt.ONE;
  }

  @Override
  public Object doCompare(final int lhs, final float rhs) throws Throwable {
    if (lhs == rhs) return NgInt.ZERO;
    if (lhs < rhs) return NgInt.MINUS_ONE;
    return NgInt.ONE;
  }

  @Override
  public Object doCompare(final int lhs, final double rhs) throws Throwable {
    if (lhs == rhs) return NgInt.ZERO;
    if (lhs < rhs) return NgInt.MINUS_ONE;
    return NgInt.ONE;
  }

  @Override
  public Object doCompare(final int lhs, final BigInteger rhs) throws Throwable {
    return NgInt.valueOf(BigInteger.valueOf(lhs).compareTo(rhs));
  }

  @Override
  public Object doCompare(final int lhs, final BigDecimal rhs) throws Throwable {
    return NgInt.valueOf(new BigDecimal(lhs).compareTo(rhs));
  }

  @Override
  public Object doCompare(final Object lhs, final byte rhs) throws Throwable {
    return doCompare(((NgInt)lhs).getIntValue(), rhs);
  }

  @Override
  public Object doCompare(final Object lhs, final char rhs) throws Throwable {
    return doCompare(((NgInt)lhs).getIntValue(), rhs);
  }

  @Override
  public Object doCompare(final Object lhs, final short rhs) throws Throwable {
    return doCompare(((NgInt)lhs).getIntValue(), rhs);
  }

  @Override
  public Object doCompare(final Object lhs, final int rhs) throws Throwable {
    return doCompare(((NgInt)lhs).getIntValue(), rhs);
  }

  @Override
  public Object doCompare(final Object lhs, final long rhs) throws Throwable {
    return doCompare(((NgInt)lhs).getIntValue(), rhs);
  }

  @Override
  public Object doCompare(final Object lhs, final float rhs) throws Throwable {
    return doCompare(((NgInt)lhs).getIntValue(), rhs);
  }

  @Override
  public Object doCompare(final Object lhs, final double rhs) throws Throwable {
    return doCompare(((NgInt)lhs).getIntValue(), rhs);
  }

  @Override
  public Object doCompare(final Object lhs, final BigInteger rhs) throws Throwable {
    return doCompare(((NgInt)lhs).getIntValue(), rhs);
  }

  @Override
  public Object doCompare(final Object lhs, final BigDecimal rhs) throws Throwable {
    return doCompare(((NgInt)lhs).getIntValue(), rhs);
  }

  @Override
  public Object doReverseCompare(final byte lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(byte.class).doCompare(lhs, ((NgInt)rhs).getIntValue());
  }

  @Override
  public Object doReverseCompare(final char lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(char.class).doCompare(lhs, ((NgInt)rhs).getIntValue());
  }

  @Override
  public Object doReverseCompare(final short lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(short.class).doCompare(lhs, ((NgInt)rhs).getIntValue());
  }

  @Override
  public Object doReverseCompare(final int lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(int.class).doCompare(lhs, ((NgInt)rhs).getIntValue());
  }

  @Override
  public Object doReverseCompare(final long lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(long.class).doCompare(lhs, ((NgInt)rhs).getIntValue());
  }

  @Override
  public Object doReverseCompare(final float lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(float.class).doCompare(lhs, ((NgInt)rhs).getIntValue());
  }

  @Override
  public Object doReverseCompare(final double lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(double.class).doCompare(lhs, ((NgInt)rhs).getIntValue());
  }

  @Override
  public Object doReverseCompare(final BigInteger lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(BigInteger.class).doCompare(lhs, ((NgInt)rhs).getIntValue());
  }

  @Override
  public Object doReverseCompare(final BigDecimal lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(BigDecimal.class).doCompare(lhs, ((NgInt)rhs).getIntValue());
  }

  @Override
  public Object doEquals(final Object lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseEquals(((NgInt)lhs).getIntValue(), rhs);
  }

  @Override
  public Object doEquals(final int lhs, final byte rhs) throws Throwable {
    return (lhs == rhs) ? NgBoolean.TRUE : NgBoolean.FALSE;
  }

  @Override
  public Object doEquals(final int lhs, final char rhs) throws Throwable {
    return (lhs == rhs) ? NgBoolean.TRUE : NgBoolean.FALSE;
  }

  @Override
  public Object doEquals(final int lhs, final short rhs) throws Throwable {
    return (lhs == rhs) ? NgBoolean.TRUE : NgBoolean.FALSE;
  }

  @Override
  public Object doEquals(final int lhs, final int rhs) throws Throwable {
    return (lhs == rhs) ? NgBoolean.TRUE : NgBoolean.FALSE;
  }

  @Override
  public Object doEquals(final int lhs, final long rhs) throws Throwable {
    return (lhs == rhs) ? NgBoolean.TRUE : NgBoolean.FALSE;
  }

  @Override
  public Object doEquals(final int lhs, final float rhs) throws Throwable {
    return (lhs == rhs) ? NgBoolean.TRUE : NgBoolean.FALSE;
  }

  @Override
  public Object doEquals(final int lhs, final double rhs) throws Throwable {
    return (lhs == rhs) ? NgBoolean.TRUE : NgBoolean.FALSE;
  }

  @Override
  public Object doEquals(final int lhs, final BigInteger rhs) throws Throwable {
    return (BigInteger.valueOf(lhs).compareTo(rhs) == 0) ? NgBoolean.TRUE : NgBoolean.FALSE;
  }

  @Override
  public Object doEquals(final int lhs, final BigDecimal rhs) throws Throwable {
    return (new BigDecimal(lhs).compareTo(rhs) == 0) ? NgBoolean.TRUE : NgBoolean.FALSE;
  }

  @Override
  public Object doEquals(final Object lhs, final byte rhs) throws Throwable {
    return doEquals(((NgInt)lhs).getIntValue(), rhs);
  }

  @Override
  public Object doEquals(final Object lhs, final char rhs) throws Throwable {
    return doEquals(((NgInt)lhs).getIntValue(), rhs);
  }

  @Override
  public Object doEquals(final Object lhs, final short rhs) throws Throwable {
    return doEquals(((NgInt)lhs).getIntValue(), rhs);
  }

  @Override
  public Object doEquals(final Object lhs, final int rhs) throws Throwable {
    return doEquals(((NgInt)lhs).getIntValue(), rhs);
  }

  @Override
  public Object doEquals(final Object lhs, final long rhs) throws Throwable {
    return doEquals(((NgInt)lhs).getIntValue(), rhs);
  }

  @Override
  public Object doEquals(final Object lhs, final float rhs) throws Throwable {
    return doEquals(((NgInt)lhs).getIntValue(), rhs);
  }

  @Override
  public Object doEquals(final Object lhs, final double rhs) throws Throwable {
    return doEquals(((NgInt)lhs).getIntValue(), rhs);
  }

  @Override
  public Object doEquals(final Object lhs, final BigInteger rhs) throws Throwable {
    return doEquals(((NgInt)lhs).getIntValue(), rhs);
  }

  @Override
  public Object doEquals(final Object lhs, final BigDecimal rhs) throws Throwable {
    return doEquals(((NgInt)lhs).getIntValue(), rhs);
  }

  @Override
  public Object doReverseEquals(final byte lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(byte.class).doEquals(lhs, ((NgInt)rhs).getIntValue());
  }

  @Override
  public Object doReverseEquals(final char lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(char.class).doEquals(lhs, ((NgInt)rhs).getIntValue());
  }

  @Override
  public Object doReverseEquals(final short lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(short.class).doEquals(lhs, ((NgInt)rhs).getIntValue());
  }

  @Override
  public Object doReverseEquals(final int lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(int.class).doEquals(lhs, ((NgInt)rhs).getIntValue());
  }

  @Override
  public Object doReverseEquals(final long lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(long.class).doEquals(lhs, ((NgInt)rhs).getIntValue());
  }

  @Override
  public Object doReverseEquals(final float lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(float.class).doEquals(lhs, ((NgInt)rhs).getIntValue());
  }

  @Override
  public Object doReverseEquals(final double lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(double.class).doEquals(lhs, ((NgInt)rhs).getIntValue());
  }

  @Override
  public Object doReverseEquals(final BigInteger lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(BigInteger.class).doEquals(lhs, ((NgInt)rhs).getIntValue());
  }

  @Override
  public Object doReverseEquals(final BigDecimal lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(BigDecimal.class).doEquals(lhs, ((NgInt)rhs).getIntValue());
  }

  @Override
  public boolean doEqualsBoolean(final Object lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseEqualsBoolean(((NgInt)lhs).getIntValue(), rhs);
  }

  @Override
  public boolean doEqualsBoolean(final int lhs, final byte rhs) throws Throwable {
    return lhs == rhs;
  }

  @Override
  public boolean doEqualsBoolean(final int lhs, final char rhs) throws Throwable {
    return lhs == rhs;
  }

  @Override
  public boolean doEqualsBoolean(final int lhs, final short rhs) throws Throwable {
    return lhs == rhs;
  }

  @Override
  public boolean doEqualsBoolean(final int lhs, final int rhs) throws Throwable {
    return lhs == rhs;
  }

  @Override
  public boolean doEqualsBoolean(final int lhs, final long rhs) throws Throwable {
    return lhs == rhs;
  }

  @Override
  public boolean doEqualsBoolean(final int lhs, final float rhs) throws Throwable {
    return lhs == rhs;
  }

  @Override
  public boolean doEqualsBoolean(final int lhs, final double rhs) throws Throwable {
    return lhs == rhs;
  }

  @Override
  public boolean doEqualsBoolean(final int lhs, final BigInteger rhs) throws Throwable {
    return BigInteger.valueOf(lhs).compareTo(rhs) == 0;
  }

  @Override
  public boolean doEqualsBoolean(final int lhs, final BigDecimal rhs) throws Throwable {
    return new BigDecimal(lhs).compareTo(rhs) == 0;
  }

  @Override
  public boolean doEqualsBoolean(final Object lhs, final byte rhs) throws Throwable {
    return doEqualsBoolean(((NgInt)lhs).getIntValue(), rhs);
  }

  @Override
  public boolean doEqualsBoolean(final Object lhs, final char rhs) throws Throwable {
    return doEqualsBoolean(((NgInt)lhs).getIntValue(), rhs);
  }

  @Override
  public boolean doEqualsBoolean(final Object lhs, final short rhs) throws Throwable {
    return doEqualsBoolean(((NgInt)lhs).getIntValue(), rhs);
  }

  @Override
  public boolean doEqualsBoolean(final Object lhs, final int rhs) throws Throwable {
    return doEqualsBoolean(((NgInt)lhs).getIntValue(), rhs);
  }

  @Override
  public boolean doEqualsBoolean(final Object lhs, final long rhs) throws Throwable {
    return doEqualsBoolean(((NgInt)lhs).getIntValue(), rhs);
  }

  @Override
  public boolean doEqualsBoolean(final Object lhs, final float rhs) throws Throwable {
    return doEqualsBoolean(((NgInt)lhs).getIntValue(), rhs);
  }

  @Override
  public boolean doEqualsBoolean(final Object lhs, final double rhs) throws Throwable {
    return doEqualsBoolean(((NgInt)lhs).getIntValue(), rhs);
  }

  @Override
  public boolean doEqualsBoolean(final Object lhs, final BigInteger rhs) throws Throwable {
    return doEqualsBoolean(((NgInt)lhs).getIntValue(), rhs);
  }

  @Override
  public boolean doEqualsBoolean(final Object lhs, final BigDecimal rhs) throws Throwable {
    return doEqualsBoolean(((NgInt)lhs).getIntValue(), rhs);
  }

  @Override
  public boolean doReverseEqualsBoolean(final byte lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(byte.class).doEqualsBoolean(lhs, ((NgInt)rhs).getIntValue());
  }

  @Override
  public boolean doReverseEqualsBoolean(final char lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(char.class).doEqualsBoolean(lhs, ((NgInt)rhs).getIntValue());
  }

  @Override
  public boolean doReverseEqualsBoolean(final short lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(short.class).doEqualsBoolean(lhs, ((NgInt)rhs).getIntValue());
  }

  @Override
  public boolean doReverseEqualsBoolean(final int lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(int.class).doEqualsBoolean(lhs, ((NgInt)rhs).getIntValue());
  }

  @Override
  public boolean doReverseEqualsBoolean(final long lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(long.class).doEqualsBoolean(lhs, ((NgInt)rhs).getIntValue());
  }

  @Override
  public boolean doReverseEqualsBoolean(final float lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(float.class).doEqualsBoolean(lhs, ((NgInt)rhs).getIntValue());
  }

  @Override
  public boolean doReverseEqualsBoolean(final double lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(double.class).doEqualsBoolean(lhs, ((NgInt)rhs).getIntValue());
  }

  @Override
  public boolean doReverseEqualsBoolean(final BigInteger lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(BigInteger.class).doEqualsBoolean(lhs, ((NgInt)rhs).getIntValue());
  }

  @Override
  public boolean doReverseEqualsBoolean(final BigDecimal lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(BigDecimal.class).doEqualsBoolean(lhs, ((NgInt)rhs).getIntValue());
  }

  @Override
  public Object doNotEquals(final Object lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseNotEquals(((NgInt)lhs).getIntValue(), rhs);
  }

  @Override
  public Object doNotEquals(final int lhs, final byte rhs) throws Throwable {
    return (lhs != rhs) ? NgBoolean.TRUE : NgBoolean.FALSE;
  }

  @Override
  public Object doNotEquals(final int lhs, final char rhs) throws Throwable {
    return (lhs != rhs) ? NgBoolean.TRUE : NgBoolean.FALSE;
  }

  @Override
  public Object doNotEquals(final int lhs, final short rhs) throws Throwable {
    return (lhs != rhs) ? NgBoolean.TRUE : NgBoolean.FALSE;
  }

  @Override
  public Object doNotEquals(final int lhs, final int rhs) throws Throwable {
    return (lhs != rhs) ? NgBoolean.TRUE : NgBoolean.FALSE;
  }

  @Override
  public Object doNotEquals(final int lhs, final long rhs) throws Throwable {
    return (lhs != rhs) ? NgBoolean.TRUE : NgBoolean.FALSE;
  }

  @Override
  public Object doNotEquals(final int lhs, final float rhs) throws Throwable {
    return (lhs != rhs) ? NgBoolean.TRUE : NgBoolean.FALSE;
  }

  @Override
  public Object doNotEquals(final int lhs, final double rhs) throws Throwable {
    return (lhs != rhs) ? NgBoolean.TRUE : NgBoolean.FALSE;
  }

  @Override
  public Object doNotEquals(final int lhs, final BigInteger rhs) throws Throwable {
    return (BigInteger.valueOf(lhs).compareTo(rhs) != 0) ? NgBoolean.TRUE : NgBoolean.FALSE;
  }

  @Override
  public Object doNotEquals(final int lhs, final BigDecimal rhs) throws Throwable {
    return (new BigDecimal(lhs).compareTo(rhs) != 0) ? NgBoolean.TRUE : NgBoolean.FALSE;
  }

  @Override
  public Object doNotEquals(final Object lhs, final byte rhs) throws Throwable {
    return doNotEquals(((NgInt)lhs).getIntValue(), rhs);
  }

  @Override
  public Object doNotEquals(final Object lhs, final char rhs) throws Throwable {
    return doNotEquals(((NgInt)lhs).getIntValue(), rhs);
  }

  @Override
  public Object doNotEquals(final Object lhs, final short rhs) throws Throwable {
    return doNotEquals(((NgInt)lhs).getIntValue(), rhs);
  }

  @Override
  public Object doNotEquals(final Object lhs, final int rhs) throws Throwable {
    return doNotEquals(((NgInt)lhs).getIntValue(), rhs);
  }

  @Override
  public Object doNotEquals(final Object lhs, final long rhs) throws Throwable {
    return doNotEquals(((NgInt)lhs).getIntValue(), rhs);
  }

  @Override
  public Object doNotEquals(final Object lhs, final float rhs) throws Throwable {
    return doNotEquals(((NgInt)lhs).getIntValue(), rhs);
  }

  @Override
  public Object doNotEquals(final Object lhs, final double rhs) throws Throwable {
    return doNotEquals(((NgInt)lhs).getIntValue(), rhs);
  }

  @Override
  public Object doNotEquals(final Object lhs, final BigInteger rhs) throws Throwable {
    return doNotEquals(((NgInt)lhs).getIntValue(), rhs);
  }

  @Override
  public Object doNotEquals(final Object lhs, final BigDecimal rhs) throws Throwable {
    return doNotEquals(((NgInt)lhs).getIntValue(), rhs);
  }

  @Override
  public Object doReverseNotEquals(final byte lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(byte.class).doNotEquals(lhs, ((NgInt)rhs).getIntValue());
  }

  @Override
  public Object doReverseNotEquals(final char lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(char.class).doNotEquals(lhs, ((NgInt)rhs).getIntValue());
  }

  @Override
  public Object doReverseNotEquals(final short lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(short.class).doNotEquals(lhs, ((NgInt)rhs).getIntValue());
  }

  @Override
  public Object doReverseNotEquals(final int lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(int.class).doNotEquals(lhs, ((NgInt)rhs).getIntValue());
  }

  @Override
  public Object doReverseNotEquals(final long lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(long.class).doNotEquals(lhs, ((NgInt)rhs).getIntValue());
  }

  @Override
  public Object doReverseNotEquals(final float lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(float.class).doNotEquals(lhs, ((NgInt)rhs).getIntValue());
  }

  @Override
  public Object doReverseNotEquals(final double lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(double.class).doNotEquals(lhs, ((NgInt)rhs).getIntValue());
  }

  @Override
  public Object doReverseNotEquals(final BigInteger lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(BigInteger.class).doNotEquals(lhs, ((NgInt)rhs).getIntValue());
  }

  @Override
  public Object doReverseNotEquals(final BigDecimal lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(BigDecimal.class).doNotEquals(lhs, ((NgInt)rhs).getIntValue());
  }

  @Override
  public boolean doNotEqualsBoolean(final Object lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseNotEqualsBoolean(((NgInt)lhs).getIntValue(), rhs);
  }

  @Override
  public boolean doNotEqualsBoolean(final int lhs, final byte rhs) throws Throwable {
    return lhs != rhs;
  }

  @Override
  public boolean doNotEqualsBoolean(final int lhs, final char rhs) throws Throwable {
    return lhs != rhs;
  }

  @Override
  public boolean doNotEqualsBoolean(final int lhs, final short rhs) throws Throwable {
    return lhs != rhs;
  }

  @Override
  public boolean doNotEqualsBoolean(final int lhs, final int rhs) throws Throwable {
    return lhs != rhs;
  }

  @Override
  public boolean doNotEqualsBoolean(final int lhs, final long rhs) throws Throwable {
    return lhs != rhs;
  }

  @Override
  public boolean doNotEqualsBoolean(final int lhs, final float rhs) throws Throwable {
    return lhs != rhs;
  }

  @Override
  public boolean doNotEqualsBoolean(final int lhs, final double rhs) throws Throwable {
    return lhs != rhs;
  }

  @Override
  public boolean doNotEqualsBoolean(final int lhs, final BigInteger rhs) throws Throwable {
    return BigInteger.valueOf(lhs).compareTo(rhs) != 0;
  }

  @Override
  public boolean doNotEqualsBoolean(final int lhs, final BigDecimal rhs) throws Throwable {
    return new BigDecimal(lhs).compareTo(rhs) != 0;
  }

  @Override
  public boolean doNotEqualsBoolean(final Object lhs, final byte rhs) throws Throwable {
    return doNotEqualsBoolean(((NgInt)lhs).getIntValue(), rhs);
  }

  @Override
  public boolean doNotEqualsBoolean(final Object lhs, final char rhs) throws Throwable {
    return doNotEqualsBoolean(((NgInt)lhs).getIntValue(), rhs);
  }

  @Override
  public boolean doNotEqualsBoolean(final Object lhs, final short rhs) throws Throwable {
    return doNotEqualsBoolean(((NgInt)lhs).getIntValue(), rhs);
  }

  @Override
  public boolean doNotEqualsBoolean(final Object lhs, final int rhs) throws Throwable {
    return doNotEqualsBoolean(((NgInt)lhs).getIntValue(), rhs);
  }

  @Override
  public boolean doNotEqualsBoolean(final Object lhs, final long rhs) throws Throwable {
    return doNotEqualsBoolean(((NgInt)lhs).getIntValue(), rhs);
  }

  @Override
  public boolean doNotEqualsBoolean(final Object lhs, final float rhs) throws Throwable {
    return doNotEqualsBoolean(((NgInt)lhs).getIntValue(), rhs);
  }

  @Override
  public boolean doNotEqualsBoolean(final Object lhs, final double rhs) throws Throwable {
    return doNotEqualsBoolean(((NgInt)lhs).getIntValue(), rhs);
  }

  @Override
  public boolean doNotEqualsBoolean(final Object lhs, final BigInteger rhs) throws Throwable {
    return doNotEqualsBoolean(((NgInt)lhs).getIntValue(), rhs);
  }

  @Override
  public boolean doNotEqualsBoolean(final Object lhs, final BigDecimal rhs) throws Throwable {
    return doNotEqualsBoolean(((NgInt)lhs).getIntValue(), rhs);
  }

  @Override
  public boolean doReverseNotEqualsBoolean(final byte lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(byte.class).doNotEqualsBoolean(lhs, ((NgInt)rhs).getIntValue());
  }

  @Override
  public boolean doReverseNotEqualsBoolean(final char lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(char.class).doNotEqualsBoolean(lhs, ((NgInt)rhs).getIntValue());
  }

  @Override
  public boolean doReverseNotEqualsBoolean(final short lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(short.class).doNotEqualsBoolean(lhs, ((NgInt)rhs).getIntValue());
  }

  @Override
  public boolean doReverseNotEqualsBoolean(final int lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(int.class).doNotEqualsBoolean(lhs, ((NgInt)rhs).getIntValue());
  }

  @Override
  public boolean doReverseNotEqualsBoolean(final long lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(long.class).doNotEqualsBoolean(lhs, ((NgInt)rhs).getIntValue());
  }

  @Override
  public boolean doReverseNotEqualsBoolean(final float lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(float.class).doNotEqualsBoolean(lhs, ((NgInt)rhs).getIntValue());
  }

  @Override
  public boolean doReverseNotEqualsBoolean(final double lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(double.class).doNotEqualsBoolean(lhs, ((NgInt)rhs).getIntValue());
  }

  @Override
  public boolean doReverseNotEqualsBoolean(final BigInteger lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(BigInteger.class).doNotEqualsBoolean(lhs, ((NgInt)rhs).getIntValue());
  }

  @Override
  public boolean doReverseNotEqualsBoolean(final BigDecimal lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(BigDecimal.class).doNotEqualsBoolean(lhs, ((NgInt)rhs).getIntValue());
  }

  @Override
  public Object doLessThan(final Object lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseLessThan(((NgInt)lhs).getIntValue(), rhs);
  }

  @Override
  public Object doLessThan(final int lhs, final byte rhs) throws Throwable {
    return (lhs < rhs) ? NgBoolean.TRUE : NgBoolean.FALSE;
  }

  @Override
  public Object doLessThan(final int lhs, final char rhs) throws Throwable {
    return (lhs < rhs) ? NgBoolean.TRUE : NgBoolean.FALSE;
  }

  @Override
  public Object doLessThan(final int lhs, final short rhs) throws Throwable {
    return (lhs < rhs) ? NgBoolean.TRUE : NgBoolean.FALSE;
  }

  @Override
  public Object doLessThan(final int lhs, final int rhs) throws Throwable {
    return (lhs < rhs) ? NgBoolean.TRUE : NgBoolean.FALSE;
  }

  @Override
  public Object doLessThan(final int lhs, final long rhs) throws Throwable {
    return (lhs < rhs) ? NgBoolean.TRUE : NgBoolean.FALSE;
  }

  @Override
  public Object doLessThan(final int lhs, final float rhs) throws Throwable {
    return (lhs < rhs) ? NgBoolean.TRUE : NgBoolean.FALSE;
  }

  @Override
  public Object doLessThan(final int lhs, final double rhs) throws Throwable {
    return (lhs < rhs) ? NgBoolean.TRUE : NgBoolean.FALSE;
  }

  @Override
  public Object doLessThan(final int lhs, final BigInteger rhs) throws Throwable {
    return (BigInteger.valueOf(lhs).compareTo(rhs) < 0) ? NgBoolean.TRUE : NgBoolean.FALSE;
  }

  @Override
  public Object doLessThan(final int lhs, final BigDecimal rhs) throws Throwable {
    return (new BigDecimal(lhs).compareTo(rhs) < 0) ? NgBoolean.TRUE : NgBoolean.FALSE;
  }

  @Override
  public Object doLessThan(final Object lhs, final byte rhs) throws Throwable {
    return doLessThan(((NgInt)lhs).getIntValue(), rhs);
  }

  @Override
  public Object doLessThan(final Object lhs, final char rhs) throws Throwable {
    return doLessThan(((NgInt)lhs).getIntValue(), rhs);
  }

  @Override
  public Object doLessThan(final Object lhs, final short rhs) throws Throwable {
    return doLessThan(((NgInt)lhs).getIntValue(), rhs);
  }

  @Override
  public Object doLessThan(final Object lhs, final int rhs) throws Throwable {
    return doLessThan(((NgInt)lhs).getIntValue(), rhs);
  }

  @Override
  public Object doLessThan(final Object lhs, final long rhs) throws Throwable {
    return doLessThan(((NgInt)lhs).getIntValue(), rhs);
  }

  @Override
  public Object doLessThan(final Object lhs, final float rhs) throws Throwable {
    return doLessThan(((NgInt)lhs).getIntValue(), rhs);
  }

  @Override
  public Object doLessThan(final Object lhs, final double rhs) throws Throwable {
    return doLessThan(((NgInt)lhs).getIntValue(), rhs);
  }

  @Override
  public Object doLessThan(final Object lhs, final BigInteger rhs) throws Throwable {
    return doLessThan(((NgInt)lhs).getIntValue(), rhs);
  }

  @Override
  public Object doLessThan(final Object lhs, final BigDecimal rhs) throws Throwable {
    return doLessThan(((NgInt)lhs).getIntValue(), rhs);
  }

  @Override
  public Object doReverseLessThan(final byte lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(byte.class).doLessThan(lhs, ((NgInt)rhs).getIntValue());
  }

  @Override
  public Object doReverseLessThan(final char lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(char.class).doLessThan(lhs, ((NgInt)rhs).getIntValue());
  }

  @Override
  public Object doReverseLessThan(final short lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(short.class).doLessThan(lhs, ((NgInt)rhs).getIntValue());
  }

  @Override
  public Object doReverseLessThan(final int lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(int.class).doLessThan(lhs, ((NgInt)rhs).getIntValue());
  }

  @Override
  public Object doReverseLessThan(final long lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(long.class).doLessThan(lhs, ((NgInt)rhs).getIntValue());
  }

  @Override
  public Object doReverseLessThan(final float lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(float.class).doLessThan(lhs, ((NgInt)rhs).getIntValue());
  }

  @Override
  public Object doReverseLessThan(final double lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(double.class).doLessThan(lhs, ((NgInt)rhs).getIntValue());
  }

  @Override
  public Object doReverseLessThan(final BigInteger lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(BigInteger.class).doLessThan(lhs, ((NgInt)rhs).getIntValue());
  }

  @Override
  public Object doReverseLessThan(final BigDecimal lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(BigDecimal.class).doLessThan(lhs, ((NgInt)rhs).getIntValue());
  }

  @Override
  public Object doLessThanOrEquals(final Object lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseLessThanOrEquals(((NgInt)lhs).getIntValue(), rhs);
  }

  @Override
  public Object doLessThanOrEquals(final int lhs, final byte rhs) throws Throwable {
    return (lhs <= rhs) ? NgBoolean.TRUE : NgBoolean.FALSE;
  }

  @Override
  public Object doLessThanOrEquals(final int lhs, final char rhs) throws Throwable {
    return (lhs <= rhs) ? NgBoolean.TRUE : NgBoolean.FALSE;
  }

  @Override
  public Object doLessThanOrEquals(final int lhs, final short rhs) throws Throwable {
    return (lhs <= rhs) ? NgBoolean.TRUE : NgBoolean.FALSE;
  }

  @Override
  public Object doLessThanOrEquals(final int lhs, final int rhs) throws Throwable {
    return (lhs <= rhs) ? NgBoolean.TRUE : NgBoolean.FALSE;
  }

  @Override
  public Object doLessThanOrEquals(final int lhs, final long rhs) throws Throwable {
    return (lhs <= rhs) ? NgBoolean.TRUE : NgBoolean.FALSE;
  }

  @Override
  public Object doLessThanOrEquals(final int lhs, final float rhs) throws Throwable {
    return (lhs <= rhs) ? NgBoolean.TRUE : NgBoolean.FALSE;
  }

  @Override
  public Object doLessThanOrEquals(final int lhs, final double rhs) throws Throwable {
    return (lhs <= rhs) ? NgBoolean.TRUE : NgBoolean.FALSE;
  }

  @Override
  public Object doLessThanOrEquals(final int lhs, final BigInteger rhs) throws Throwable {
    return (BigInteger.valueOf(lhs).compareTo(rhs) <= 0) ? NgBoolean.TRUE : NgBoolean.FALSE;
  }

  @Override
  public Object doLessThanOrEquals(final int lhs, final BigDecimal rhs) throws Throwable {
    return (new BigDecimal(lhs).compareTo(rhs) <= 0) ? NgBoolean.TRUE : NgBoolean.FALSE;
  }

  @Override
  public Object doLessThanOrEquals(final Object lhs, final byte rhs) throws Throwable {
    return doLessThanOrEquals(((NgInt)lhs).getIntValue(), rhs);
  }

  @Override
  public Object doLessThanOrEquals(final Object lhs, final char rhs) throws Throwable {
    return doLessThanOrEquals(((NgInt)lhs).getIntValue(), rhs);
  }

  @Override
  public Object doLessThanOrEquals(final Object lhs, final short rhs) throws Throwable {
    return doLessThanOrEquals(((NgInt)lhs).getIntValue(), rhs);
  }

  @Override
  public Object doLessThanOrEquals(final Object lhs, final int rhs) throws Throwable {
    return doLessThanOrEquals(((NgInt)lhs).getIntValue(), rhs);
  }

  @Override
  public Object doLessThanOrEquals(final Object lhs, final long rhs) throws Throwable {
    return doLessThanOrEquals(((NgInt)lhs).getIntValue(), rhs);
  }

  @Override
  public Object doLessThanOrEquals(final Object lhs, final float rhs) throws Throwable {
    return doLessThanOrEquals(((NgInt)lhs).getIntValue(), rhs);
  }

  @Override
  public Object doLessThanOrEquals(final Object lhs, final double rhs) throws Throwable {
    return doLessThanOrEquals(((NgInt)lhs).getIntValue(), rhs);
  }

  @Override
  public Object doLessThanOrEquals(final Object lhs, final BigInteger rhs) throws Throwable {
    return doLessThanOrEquals(((NgInt)lhs).getIntValue(), rhs);
  }

  @Override
  public Object doLessThanOrEquals(final Object lhs, final BigDecimal rhs) throws Throwable {
    return doLessThanOrEquals(((NgInt)lhs).getIntValue(), rhs);
  }

  @Override
  public Object doReverseLessThanOrEquals(final byte lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(byte.class).doLessThanOrEquals(lhs, ((NgInt)rhs).getIntValue());
  }

  @Override
  public Object doReverseLessThanOrEquals(final char lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(char.class).doLessThanOrEquals(lhs, ((NgInt)rhs).getIntValue());
  }

  @Override
  public Object doReverseLessThanOrEquals(final short lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(short.class).doLessThanOrEquals(lhs, ((NgInt)rhs).getIntValue());
  }

  @Override
  public Object doReverseLessThanOrEquals(final int lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(int.class).doLessThanOrEquals(lhs, ((NgInt)rhs).getIntValue());
  }

  @Override
  public Object doReverseLessThanOrEquals(final long lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(long.class).doLessThanOrEquals(lhs, ((NgInt)rhs).getIntValue());
  }

  @Override
  public Object doReverseLessThanOrEquals(final float lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(float.class).doLessThanOrEquals(lhs, ((NgInt)rhs).getIntValue());
  }

  @Override
  public Object doReverseLessThanOrEquals(final double lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(double.class).doLessThanOrEquals(lhs, ((NgInt)rhs).getIntValue());
  }

  @Override
  public Object doReverseLessThanOrEquals(final BigInteger lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(BigInteger.class).doLessThanOrEquals(lhs, ((NgInt)rhs).getIntValue());
  }

  @Override
  public Object doReverseLessThanOrEquals(final BigDecimal lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(BigDecimal.class).doLessThanOrEquals(lhs, ((NgInt)rhs).getIntValue());
  }

  @Override
  public boolean doLessThanOrEqualsBoolean(final Object lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseLessThanOrEqualsBoolean(((NgInt)lhs).getIntValue(), rhs);
  }

  @Override
  public boolean doLessThanOrEqualsBoolean(final int lhs, final byte rhs) throws Throwable {
    return lhs <= rhs;
  }

  @Override
  public boolean doLessThanOrEqualsBoolean(final int lhs, final char rhs) throws Throwable {
    return lhs <= rhs;
  }

  @Override
  public boolean doLessThanOrEqualsBoolean(final int lhs, final short rhs) throws Throwable {
    return lhs <= rhs;
  }

  @Override
  public boolean doLessThanOrEqualsBoolean(final int lhs, final int rhs) throws Throwable {
    return lhs <= rhs;
  }

  @Override
  public boolean doLessThanOrEqualsBoolean(final int lhs, final long rhs) throws Throwable {
    return lhs <= rhs;
  }

  @Override
  public boolean doLessThanOrEqualsBoolean(final int lhs, final float rhs) throws Throwable {
    return lhs <= rhs;
  }

  @Override
  public boolean doLessThanOrEqualsBoolean(final int lhs, final double rhs) throws Throwable {
    return lhs <= rhs;
  }

  @Override
  public boolean doLessThanOrEqualsBoolean(final int lhs, final BigInteger rhs) throws Throwable {
    return BigInteger.valueOf(lhs).compareTo(rhs) <= 0;
  }

  @Override
  public boolean doLessThanOrEqualsBoolean(final int lhs, final BigDecimal rhs) throws Throwable {
    return new BigDecimal(lhs).compareTo(rhs) <= 0;
  }

  @Override
  public boolean doLessThanOrEqualsBoolean(final Object lhs, final byte rhs) throws Throwable {
    return doLessThanOrEqualsBoolean(((NgInt)lhs).getIntValue(), rhs);
  }

  @Override
  public boolean doLessThanOrEqualsBoolean(final Object lhs, final char rhs) throws Throwable {
    return doLessThanOrEqualsBoolean(((NgInt)lhs).getIntValue(), rhs);
  }

  @Override
  public boolean doLessThanOrEqualsBoolean(final Object lhs, final short rhs) throws Throwable {
    return doLessThanOrEqualsBoolean(((NgInt)lhs).getIntValue(), rhs);
  }

  @Override
  public boolean doLessThanOrEqualsBoolean(final Object lhs, final int rhs) throws Throwable {
    return doLessThanOrEqualsBoolean(((NgInt)lhs).getIntValue(), rhs);
  }

  @Override
  public boolean doLessThanOrEqualsBoolean(final Object lhs, final long rhs) throws Throwable {
    return doLessThanOrEqualsBoolean(((NgInt)lhs).getIntValue(), rhs);
  }

  @Override
  public boolean doLessThanOrEqualsBoolean(final Object lhs, final float rhs) throws Throwable {
    return doLessThanOrEqualsBoolean(((NgInt)lhs).getIntValue(), rhs);
  }

  @Override
  public boolean doLessThanOrEqualsBoolean(final Object lhs, final double rhs) throws Throwable {
    return doLessThanOrEqualsBoolean(((NgInt)lhs).getIntValue(), rhs);
  }

  @Override
  public boolean doLessThanOrEqualsBoolean(final Object lhs, final BigInteger rhs) throws Throwable {
    return doLessThanOrEqualsBoolean(((NgInt)lhs).getIntValue(), rhs);
  }

  @Override
  public boolean doLessThanOrEqualsBoolean(final Object lhs, final BigDecimal rhs) throws Throwable {
    return doLessThanOrEqualsBoolean(((NgInt)lhs).getIntValue(), rhs);
  }

  @Override
  public boolean doReverseLessThanOrEqualsBoolean(final byte lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(byte.class).doLessThanOrEqualsBoolean(lhs, ((NgInt)rhs).getIntValue());
  }

  @Override
  public boolean doReverseLessThanOrEqualsBoolean(final char lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(char.class).doLessThanOrEqualsBoolean(lhs, ((NgInt)rhs).getIntValue());
  }

  @Override
  public boolean doReverseLessThanOrEqualsBoolean(final short lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(short.class).doLessThanOrEqualsBoolean(lhs, ((NgInt)rhs).getIntValue());
  }

  @Override
  public boolean doReverseLessThanOrEqualsBoolean(final int lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(int.class).doLessThanOrEqualsBoolean(lhs, ((NgInt)rhs).getIntValue());
  }

  @Override
  public boolean doReverseLessThanOrEqualsBoolean(final long lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(long.class).doLessThanOrEqualsBoolean(lhs, ((NgInt)rhs).getIntValue());
  }

  @Override
  public boolean doReverseLessThanOrEqualsBoolean(final float lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(float.class).doLessThanOrEqualsBoolean(lhs, ((NgInt)rhs).getIntValue());
  }

  @Override
  public boolean doReverseLessThanOrEqualsBoolean(final double lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(double.class).doLessThanOrEqualsBoolean(lhs, ((NgInt)rhs).getIntValue());
  }

  @Override
  public boolean doReverseLessThanOrEqualsBoolean(final BigInteger lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(BigInteger.class).doLessThanOrEqualsBoolean(lhs, ((NgInt)rhs).getIntValue());
  }

  @Override
  public boolean doReverseLessThanOrEqualsBoolean(final BigDecimal lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(BigDecimal.class).doLessThanOrEqualsBoolean(lhs, ((NgInt)rhs).getIntValue());
  }

  @Override
  public Object doGreaterThan(final Object lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseGreaterThan(((NgInt)lhs).getIntValue(), rhs);
  }

  @Override
  public Object doGreaterThan(final int lhs, final byte rhs) throws Throwable {
    return (lhs > rhs) ? NgBoolean.TRUE : NgBoolean.FALSE;
  }

  @Override
  public Object doGreaterThan(final int lhs, final char rhs) throws Throwable {
    return (lhs > rhs) ? NgBoolean.TRUE : NgBoolean.FALSE;
  }

  @Override
  public Object doGreaterThan(final int lhs, final short rhs) throws Throwable {
    return (lhs > rhs) ? NgBoolean.TRUE : NgBoolean.FALSE;
  }

  @Override
  public Object doGreaterThan(final int lhs, final int rhs) throws Throwable {
    return (lhs > rhs) ? NgBoolean.TRUE : NgBoolean.FALSE;
  }

  @Override
  public Object doGreaterThan(final int lhs, final long rhs) throws Throwable {
    return (lhs > rhs) ? NgBoolean.TRUE : NgBoolean.FALSE;
  }

  @Override
  public Object doGreaterThan(final int lhs, final float rhs) throws Throwable {
    return (lhs > rhs) ? NgBoolean.TRUE : NgBoolean.FALSE;
  }

  @Override
  public Object doGreaterThan(final int lhs, final double rhs) throws Throwable {
    return (lhs > rhs) ? NgBoolean.TRUE : NgBoolean.FALSE;
  }

  @Override
  public Object doGreaterThan(final int lhs, final BigInteger rhs) throws Throwable {
    return (BigInteger.valueOf(lhs).compareTo(rhs) > 0) ? NgBoolean.TRUE : NgBoolean.FALSE;
  }

  @Override
  public Object doGreaterThan(final int lhs, final BigDecimal rhs) throws Throwable {
    return (new BigDecimal(lhs).compareTo(rhs) > 0) ? NgBoolean.TRUE : NgBoolean.FALSE;
  }

  @Override
  public Object doGreaterThan(final Object lhs, final byte rhs) throws Throwable {
    return doGreaterThan(((NgInt)lhs).getIntValue(), rhs);
  }

  @Override
  public Object doGreaterThan(final Object lhs, final char rhs) throws Throwable {
    return doGreaterThan(((NgInt)lhs).getIntValue(), rhs);
  }

  @Override
  public Object doGreaterThan(final Object lhs, final short rhs) throws Throwable {
    return doGreaterThan(((NgInt)lhs).getIntValue(), rhs);
  }

  @Override
  public Object doGreaterThan(final Object lhs, final int rhs) throws Throwable {
    return doGreaterThan(((NgInt)lhs).getIntValue(), rhs);
  }

  @Override
  public Object doGreaterThan(final Object lhs, final long rhs) throws Throwable {
    return doGreaterThan(((NgInt)lhs).getIntValue(), rhs);
  }

  @Override
  public Object doGreaterThan(final Object lhs, final float rhs) throws Throwable {
    return doGreaterThan(((NgInt)lhs).getIntValue(), rhs);
  }

  @Override
  public Object doGreaterThan(final Object lhs, final double rhs) throws Throwable {
    return doGreaterThan(((NgInt)lhs).getIntValue(), rhs);
  }

  @Override
  public Object doGreaterThan(final Object lhs, final BigInteger rhs) throws Throwable {
    return doGreaterThan(((NgInt)lhs).getIntValue(), rhs);
  }

  @Override
  public Object doGreaterThan(final Object lhs, final BigDecimal rhs) throws Throwable {
    return doGreaterThan(((NgInt)lhs).getIntValue(), rhs);
  }

  @Override
  public Object doReverseGreaterThan(final byte lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(byte.class).doGreaterThan(lhs, ((NgInt)rhs).getIntValue());
  }

  @Override
  public Object doReverseGreaterThan(final char lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(char.class).doGreaterThan(lhs, ((NgInt)rhs).getIntValue());
  }

  @Override
  public Object doReverseGreaterThan(final short lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(short.class).doGreaterThan(lhs, ((NgInt)rhs).getIntValue());
  }

  @Override
  public Object doReverseGreaterThan(final int lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(int.class).doGreaterThan(lhs, ((NgInt)rhs).getIntValue());
  }

  @Override
  public Object doReverseGreaterThan(final long lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(long.class).doGreaterThan(lhs, ((NgInt)rhs).getIntValue());
  }

  @Override
  public Object doReverseGreaterThan(final float lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(float.class).doGreaterThan(lhs, ((NgInt)rhs).getIntValue());
  }

  @Override
  public Object doReverseGreaterThan(final double lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(double.class).doGreaterThan(lhs, ((NgInt)rhs).getIntValue());
  }

  @Override
  public Object doReverseGreaterThan(final BigInteger lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(BigInteger.class).doGreaterThan(lhs, ((NgInt)rhs).getIntValue());
  }

  @Override
  public Object doReverseGreaterThan(final BigDecimal lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(BigDecimal.class).doGreaterThan(lhs, ((NgInt)rhs).getIntValue());
  }

  @Override
  public boolean doGreaterThanBoolean(final Object lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseGreaterThanBoolean(((NgInt)lhs).getIntValue(), rhs);
  }

  @Override
  public boolean doGreaterThanBoolean(final int lhs, final byte rhs) throws Throwable {
    return lhs > rhs;
  }

  @Override
  public boolean doGreaterThanBoolean(final int lhs, final char rhs) throws Throwable {
    return lhs > rhs;
  }

  @Override
  public boolean doGreaterThanBoolean(final int lhs, final short rhs) throws Throwable {
    return lhs > rhs;
  }

  @Override
  public boolean doGreaterThanBoolean(final int lhs, final int rhs) throws Throwable {
    return lhs > rhs;
  }

  @Override
  public boolean doGreaterThanBoolean(final int lhs, final long rhs) throws Throwable {
    return lhs > rhs;
  }

  @Override
  public boolean doGreaterThanBoolean(final int lhs, final float rhs) throws Throwable {
    return lhs > rhs;
  }

  @Override
  public boolean doGreaterThanBoolean(final int lhs, final double rhs) throws Throwable {
    return lhs > rhs;
  }

  @Override
  public boolean doGreaterThanBoolean(final int lhs, final BigInteger rhs) throws Throwable {
    return BigInteger.valueOf(lhs).compareTo(rhs) > 0;
  }

  @Override
  public boolean doGreaterThanBoolean(final int lhs, final BigDecimal rhs) throws Throwable {
    return new BigDecimal(lhs).compareTo(rhs) > 0;
  }

  @Override
  public boolean doGreaterThanBoolean(final Object lhs, final byte rhs) throws Throwable {
    return doGreaterThanBoolean(((NgInt)lhs).getIntValue(), rhs);
  }

  @Override
  public boolean doGreaterThanBoolean(final Object lhs, final char rhs) throws Throwable {
    return doGreaterThanBoolean(((NgInt)lhs).getIntValue(), rhs);
  }

  @Override
  public boolean doGreaterThanBoolean(final Object lhs, final short rhs) throws Throwable {
    return doGreaterThanBoolean(((NgInt)lhs).getIntValue(), rhs);
  }

  @Override
  public boolean doGreaterThanBoolean(final Object lhs, final int rhs) throws Throwable {
    return doGreaterThanBoolean(((NgInt)lhs).getIntValue(), rhs);
  }

  @Override
  public boolean doGreaterThanBoolean(final Object lhs, final long rhs) throws Throwable {
    return doGreaterThanBoolean(((NgInt)lhs).getIntValue(), rhs);
  }

  @Override
  public boolean doGreaterThanBoolean(final Object lhs, final float rhs) throws Throwable {
    return doGreaterThanBoolean(((NgInt)lhs).getIntValue(), rhs);
  }

  @Override
  public boolean doGreaterThanBoolean(final Object lhs, final double rhs) throws Throwable {
    return doGreaterThanBoolean(((NgInt)lhs).getIntValue(), rhs);
  }

  @Override
  public boolean doGreaterThanBoolean(final Object lhs, final BigInteger rhs) throws Throwable {
    return doGreaterThanBoolean(((NgInt)lhs).getIntValue(), rhs);
  }

  @Override
  public boolean doGreaterThanBoolean(final Object lhs, final BigDecimal rhs) throws Throwable {
    return doGreaterThanBoolean(((NgInt)lhs).getIntValue(), rhs);
  }

  @Override
  public boolean doReverseGreaterThanBoolean(final byte lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(byte.class).doGreaterThanBoolean(lhs, ((NgInt)rhs).getIntValue());
  }

  @Override
  public boolean doReverseGreaterThanBoolean(final char lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(char.class).doGreaterThanBoolean(lhs, ((NgInt)rhs).getIntValue());
  }

  @Override
  public boolean doReverseGreaterThanBoolean(final short lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(short.class).doGreaterThanBoolean(lhs, ((NgInt)rhs).getIntValue());
  }

  @Override
  public boolean doReverseGreaterThanBoolean(final int lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(int.class).doGreaterThanBoolean(lhs, ((NgInt)rhs).getIntValue());
  }

  @Override
  public boolean doReverseGreaterThanBoolean(final long lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(long.class).doGreaterThanBoolean(lhs, ((NgInt)rhs).getIntValue());
  }

  @Override
  public boolean doReverseGreaterThanBoolean(final float lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(float.class).doGreaterThanBoolean(lhs, ((NgInt)rhs).getIntValue());
  }

  @Override
  public boolean doReverseGreaterThanBoolean(final double lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(double.class).doGreaterThanBoolean(lhs, ((NgInt)rhs).getIntValue());
  }

  @Override
  public boolean doReverseGreaterThanBoolean(final BigInteger lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(BigInteger.class).doGreaterThanBoolean(lhs, ((NgInt)rhs).getIntValue());
  }

  @Override
  public boolean doReverseGreaterThanBoolean(final BigDecimal lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(BigDecimal.class).doGreaterThanBoolean(lhs, ((NgInt)rhs).getIntValue());
  }

  @Override
  public Object doGreaterThanOrEquals(final Object lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseGreaterThanOrEquals(((NgInt)lhs).getIntValue(), rhs);
  }

  @Override
  public Object doGreaterThanOrEquals(final int lhs, final byte rhs) throws Throwable {
    return (lhs >= rhs) ? NgBoolean.TRUE : NgBoolean.FALSE;
  }

  @Override
  public Object doGreaterThanOrEquals(final int lhs, final char rhs) throws Throwable {
    return (lhs >= rhs) ? NgBoolean.TRUE : NgBoolean.FALSE;
  }

  @Override
  public Object doGreaterThanOrEquals(final int lhs, final short rhs) throws Throwable {
    return (lhs >= rhs) ? NgBoolean.TRUE : NgBoolean.FALSE;
  }

  @Override
  public Object doGreaterThanOrEquals(final int lhs, final int rhs) throws Throwable {
    return (lhs >= rhs) ? NgBoolean.TRUE : NgBoolean.FALSE;
  }

  @Override
  public Object doGreaterThanOrEquals(final int lhs, final long rhs) throws Throwable {
    return (lhs >= rhs) ? NgBoolean.TRUE : NgBoolean.FALSE;
  }

  @Override
  public Object doGreaterThanOrEquals(final int lhs, final float rhs) throws Throwable {
    return (lhs >= rhs) ? NgBoolean.TRUE : NgBoolean.FALSE;
  }

  @Override
  public Object doGreaterThanOrEquals(final int lhs, final double rhs) throws Throwable {
    return (lhs >= rhs) ? NgBoolean.TRUE : NgBoolean.FALSE;
  }

  @Override
  public Object doGreaterThanOrEquals(final int lhs, final BigInteger rhs) throws Throwable {
    return (BigInteger.valueOf(lhs).compareTo(rhs) >= 0) ? NgBoolean.TRUE : NgBoolean.FALSE;
  }

  @Override
  public Object doGreaterThanOrEquals(final int lhs, final BigDecimal rhs) throws Throwable {
    return (new BigDecimal(lhs).compareTo(rhs) >= 0) ? NgBoolean.TRUE : NgBoolean.FALSE;
  }

  @Override
  public Object doGreaterThanOrEquals(final Object lhs, final byte rhs) throws Throwable {
    return doGreaterThanOrEquals(((NgInt)lhs).getIntValue(), rhs);
  }

  @Override
  public Object doGreaterThanOrEquals(final Object lhs, final char rhs) throws Throwable {
    return doGreaterThanOrEquals(((NgInt)lhs).getIntValue(), rhs);
  }

  @Override
  public Object doGreaterThanOrEquals(final Object lhs, final short rhs) throws Throwable {
    return doGreaterThanOrEquals(((NgInt)lhs).getIntValue(), rhs);
  }

  @Override
  public Object doGreaterThanOrEquals(final Object lhs, final int rhs) throws Throwable {
    return doGreaterThanOrEquals(((NgInt)lhs).getIntValue(), rhs);
  }

  @Override
  public Object doGreaterThanOrEquals(final Object lhs, final long rhs) throws Throwable {
    return doGreaterThanOrEquals(((NgInt)lhs).getIntValue(), rhs);
  }

  @Override
  public Object doGreaterThanOrEquals(final Object lhs, final float rhs) throws Throwable {
    return doGreaterThanOrEquals(((NgInt)lhs).getIntValue(), rhs);
  }

  @Override
  public Object doGreaterThanOrEquals(final Object lhs, final double rhs) throws Throwable {
    return doGreaterThanOrEquals(((NgInt)lhs).getIntValue(), rhs);
  }

  @Override
  public Object doGreaterThanOrEquals(final Object lhs, final BigInteger rhs) throws Throwable {
    return doGreaterThanOrEquals(((NgInt)lhs).getIntValue(), rhs);
  }

  @Override
  public Object doGreaterThanOrEquals(final Object lhs, final BigDecimal rhs) throws Throwable {
    return doGreaterThanOrEquals(((NgInt)lhs).getIntValue(), rhs);
  }

  @Override
  public Object doReverseGreaterThanOrEquals(final byte lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(byte.class).doGreaterThanOrEquals(lhs, ((NgInt)rhs).getIntValue());
  }

  @Override
  public Object doReverseGreaterThanOrEquals(final char lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(char.class).doGreaterThanOrEquals(lhs, ((NgInt)rhs).getIntValue());
  }

  @Override
  public Object doReverseGreaterThanOrEquals(final short lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(short.class).doGreaterThanOrEquals(lhs, ((NgInt)rhs).getIntValue());
  }

  @Override
  public Object doReverseGreaterThanOrEquals(final int lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(int.class).doGreaterThanOrEquals(lhs, ((NgInt)rhs).getIntValue());
  }

  @Override
  public Object doReverseGreaterThanOrEquals(final long lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(long.class).doGreaterThanOrEquals(lhs, ((NgInt)rhs).getIntValue());
  }

  @Override
  public Object doReverseGreaterThanOrEquals(final float lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(float.class).doGreaterThanOrEquals(lhs, ((NgInt)rhs).getIntValue());
  }

  @Override
  public Object doReverseGreaterThanOrEquals(final double lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(double.class).doGreaterThanOrEquals(lhs, ((NgInt)rhs).getIntValue());
  }

  @Override
  public Object doReverseGreaterThanOrEquals(final BigInteger lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(BigInteger.class).doGreaterThanOrEquals(lhs, ((NgInt)rhs).getIntValue());
  }

  @Override
  public Object doReverseGreaterThanOrEquals(final BigDecimal lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(BigDecimal.class).doGreaterThanOrEquals(lhs, ((NgInt)rhs).getIntValue());
  }
  
  @Override
  public Object doAsType(final Object instance, final Class type) throws Throwable {
    
    if (type == int.class) return instance;
    
    return super.doAsType(instance, type);
  }
}
