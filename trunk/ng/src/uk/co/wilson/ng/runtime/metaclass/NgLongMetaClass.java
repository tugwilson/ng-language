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
import ng.runtime.ThreadContext;

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
  public Object doAdd(final Object lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseAdd(((NgLong)lhs).getLongValue(), rhs);
  }

  @Override
  public Object doAdd(final long lhs, final byte rhs) throws Throwable {
    return NgLong.valueOf(lhs + rhs);
  }

  @Override
  public Object doAdd(final long lhs, final char rhs) throws Throwable {
    return NgLong.valueOf(lhs + rhs);
  }

  @Override
  public Object doAdd(final long lhs, final short rhs) throws Throwable {
    return NgLong.valueOf(lhs + rhs);
  }

  @Override
  public Object doAdd(final long lhs, final int rhs) throws Throwable {
    return NgLong.valueOf(lhs + rhs);
  }

  @Override
  public Object doAdd(final long lhs, final long rhs) throws Throwable {
    return NgLong.valueOf(lhs + rhs);
  }

  @Override
  public Object doAdd(final long lhs, final float rhs) throws Throwable {
    return NgFloat.valueOf(lhs + rhs);
  }

  @Override
  public Object doAdd(final long lhs, final double rhs) throws Throwable {
    return NgDouble.valueOf(lhs + rhs);
  }

  @Override
  public Object doAdd(final long lhs, final BigInteger rhs) throws Throwable {
    return BigInteger.valueOf(lhs).add(rhs);
  }

  @Override
  public Object doAdd(final long lhs, final BigDecimal rhs) throws Throwable {
    return new BigDecimal(lhs).add(rhs);
  }

  @Override
  public Object doAdd(final Object lhs, final byte rhs) throws Throwable {
    return doAdd(((NgLong)lhs).getLongValue(), rhs);
  }

  @Override
  public Object doAdd(final Object lhs, final char rhs) throws Throwable {
    return doAdd(((NgLong)lhs).getLongValue(), rhs);
  }

  @Override
  public Object doAdd(final Object lhs, final short rhs) throws Throwable {
    return doAdd(((NgLong)lhs).getLongValue(), rhs);
  }

  @Override
  public Object doAdd(final Object lhs, final int rhs) throws Throwable {
    return doAdd(((NgLong)lhs).getLongValue(), rhs);
  }

  @Override
  public Object doAdd(final Object lhs, final long rhs) throws Throwable {
    return doAdd(((NgLong)lhs).getLongValue(), rhs);
  }

  @Override
  public Object doAdd(final Object lhs, final float rhs) throws Throwable {
    return doAdd(((NgLong)lhs).getLongValue(), rhs);
  }

  @Override
  public Object doAdd(final Object lhs, final double rhs) throws Throwable {
    return doAdd(((NgLong)lhs).getLongValue(), rhs);
  }

  @Override
  public Object doAdd(final Object lhs, final BigInteger rhs) throws Throwable {
    return doAdd(((NgLong)lhs).getLongValue(), rhs);
  }

  @Override
  public Object doAdd(final Object lhs, final BigDecimal rhs) throws Throwable {
    return doAdd(((NgLong)lhs).getLongValue(), rhs);
  }

  @Override
  public Object doReverseAdd(final byte lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(byte.class).doAdd(lhs, ((NgLong)rhs).getLongValue());
  }

  @Override
  public Object doReverseAdd(final char lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(char.class).doAdd(lhs, ((NgLong)rhs).getLongValue());
  }

  @Override
  public Object doReverseAdd(final short lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(short.class).doAdd(lhs, ((NgLong)rhs).getLongValue());
  }

  @Override
  public Object doReverseAdd(final int lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(int.class).doAdd(lhs, ((NgLong)rhs).getLongValue());
  }

  @Override
  public Object doReverseAdd(final long lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(long.class).doAdd(lhs, ((NgLong)rhs).getLongValue());
  }

  @Override
  public Object doReverseAdd(final float lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(float.class).doAdd(lhs, ((NgLong)rhs).getLongValue());
  }

  @Override
  public Object doReverseAdd(final double lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(double.class).doAdd(lhs, ((NgLong)rhs).getLongValue());
  }

  @Override
  public Object doReverseAdd(final BigInteger lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(BigInteger.class).doAdd(lhs, ((NgLong)rhs).getLongValue());
  }

  @Override
  public Object doReverseAdd(final BigDecimal lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(BigDecimal.class).doAdd(lhs, ((NgLong)rhs).getLongValue());
  }

  @Override
  public Object doAddEquals(final Object lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseAddEquals(((NgLong)lhs).getLongValue(), rhs);
  }

  @Override
  public Object doAddEquals(final long lhs, final byte rhs) throws Throwable {
    return NgLong.valueOf(lhs + rhs);
  }

  @Override
  public Object doAddEquals(final long lhs, final char rhs) throws Throwable {
    return NgLong.valueOf(lhs + rhs);
  }

  @Override
  public Object doAddEquals(final long lhs, final short rhs) throws Throwable {
    return NgLong.valueOf(lhs + rhs);
  }

  @Override
  public Object doAddEquals(final long lhs, final int rhs) throws Throwable {
    return NgLong.valueOf(lhs + rhs);
  }

  @Override
  public Object doAddEquals(final long lhs, final long rhs) throws Throwable {
    return NgLong.valueOf(lhs + rhs);
  }

  @Override
  public Object doAddEquals(final long lhs, final float rhs) throws Throwable {
    return NgFloat.valueOf(lhs + rhs);
  }

  @Override
  public Object doAddEquals(final long lhs, final double rhs) throws Throwable {
    return NgDouble.valueOf(lhs + rhs);
  }

  @Override
  public Object doAddEquals(final long lhs, final BigInteger rhs) throws Throwable {
    return BigInteger.valueOf(lhs).add(rhs);
  }

  @Override
  public Object doAddEquals(final long lhs, final BigDecimal rhs) throws Throwable {
    return new BigDecimal(lhs).add(rhs);
  }

  @Override
  public Object doAddEquals(final Object lhs, final byte rhs) throws Throwable {
    return doAddEquals(((NgLong)lhs).getLongValue(), rhs);
  }

  @Override
  public Object doAddEquals(final Object lhs, final char rhs) throws Throwable {
    return doAddEquals(((NgLong)lhs).getLongValue(), rhs);
  }

  @Override
  public Object doAddEquals(final Object lhs, final short rhs) throws Throwable {
    return doAddEquals(((NgLong)lhs).getLongValue(), rhs);
  }

  @Override
  public Object doAddEquals(final Object lhs, final int rhs) throws Throwable {
    return doAddEquals(((NgLong)lhs).getLongValue(), rhs);
  }

  @Override
  public Object doAddEquals(final Object lhs, final long rhs) throws Throwable {
    return doAddEquals(((NgLong)lhs).getLongValue(), rhs);
  }

  @Override
  public Object doAddEquals(final Object lhs, final float rhs) throws Throwable {
    return doAddEquals(((NgLong)lhs).getLongValue(), rhs);
  }

  @Override
  public Object doAddEquals(final Object lhs, final double rhs) throws Throwable {
    return doAddEquals(((NgLong)lhs).getLongValue(), rhs);
  }

  @Override
  public Object doAddEquals(final Object lhs, final BigInteger rhs) throws Throwable {
    return doAddEquals(((NgLong)lhs).getLongValue(), rhs);
  }

  @Override
  public Object doAddEquals(final Object lhs, final BigDecimal rhs) throws Throwable {
    return doAddEquals(((NgLong)lhs).getLongValue(), rhs);
  }

  @Override
  public Object doReverseAddEquals(final byte lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(byte.class).doAddEquals(lhs, ((NgLong)rhs).getLongValue());
  }

  @Override
  public Object doReverseAddEquals(final char lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(char.class).doAddEquals(lhs, ((NgLong)rhs).getLongValue());
  }

  @Override
  public Object doReverseAddEquals(final short lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(short.class).doAddEquals(lhs, ((NgLong)rhs).getLongValue());
  }

  @Override
  public Object doReverseAddEquals(final int lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(int.class).doAddEquals(lhs, ((NgLong)rhs).getLongValue());
  }

  @Override
  public Object doReverseAddEquals(final long lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(long.class).doAddEquals(lhs, ((NgLong)rhs).getLongValue());
  }

  @Override
  public Object doReverseAddEquals(final float lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(float.class).doAddEquals(lhs, ((NgLong)rhs).getLongValue());
  }

  @Override
  public Object doReverseAddEquals(final double lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(double.class).doAddEquals(lhs, ((NgLong)rhs).getLongValue());
  }

  @Override
  public Object doReverseAddEquals(final BigInteger lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(BigInteger.class).doAddEquals(lhs, ((NgLong)rhs).getLongValue());
  }

  @Override
  public Object doReverseAddEquals(final BigDecimal lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(BigDecimal.class).doAddEquals(lhs, ((NgLong)rhs).getLongValue());
  }

  @Override
  public Object doSubtract(final Object lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseSubtract(((NgLong)lhs).getLongValue(), rhs);
  }

  @Override
  public Object doSubtract(final long lhs, final byte rhs) throws Throwable {
    return NgLong.valueOf(lhs - rhs);
  }

  @Override
  public Object doSubtract(final long lhs, final char rhs) throws Throwable {
    return NgLong.valueOf(lhs - rhs);
  }

  @Override
  public Object doSubtract(final long lhs, final short rhs) throws Throwable {
    return NgLong.valueOf(lhs - rhs);
  }

  @Override
  public Object doSubtract(final long lhs, final int rhs) throws Throwable {
    return NgLong.valueOf(lhs - rhs);
  }

  @Override
  public Object doSubtract(final long lhs, final long rhs) throws Throwable {
    return NgLong.valueOf(lhs - rhs);
  }

  @Override
  public Object doSubtract(final long lhs, final float rhs) throws Throwable {
    return NgFloat.valueOf(lhs - rhs);
  }

  @Override
  public Object doSubtract(final long lhs, final double rhs) throws Throwable {
    return NgDouble.valueOf(lhs - rhs);
  }

  @Override
  public Object doSubtract(final long lhs, final BigInteger rhs) throws Throwable {
    return BigInteger.valueOf(lhs).subtract(rhs);
  }

  @Override
  public Object doSubtract(final long lhs, final BigDecimal rhs) throws Throwable {
    return new BigDecimal(lhs).subtract(rhs);
  }

  @Override
  public Object doSubtract(final Object lhs, final byte rhs) throws Throwable {
    return doSubtract(((NgLong)lhs).getLongValue(), rhs);
  }

  @Override
  public Object doSubtract(final Object lhs, final char rhs) throws Throwable {
    return doSubtract(((NgLong)lhs).getLongValue(), rhs);
  }

  @Override
  public Object doSubtract(final Object lhs, final short rhs) throws Throwable {
    return doSubtract(((NgLong)lhs).getLongValue(), rhs);
  }

  @Override
  public Object doSubtract(final Object lhs, final int rhs) throws Throwable {
    return doSubtract(((NgLong)lhs).getLongValue(), rhs);
  }

  @Override
  public Object doSubtract(final Object lhs, final long rhs) throws Throwable {
    return doSubtract(((NgLong)lhs).getLongValue(), rhs);
  }

  @Override
  public Object doSubtract(final Object lhs, final float rhs) throws Throwable {
    return doSubtract(((NgLong)lhs).getLongValue(), rhs);
  }

  @Override
  public Object doSubtract(final Object lhs, final double rhs) throws Throwable {
    return doSubtract(((NgLong)lhs).getLongValue(), rhs);
  }

  @Override
  public Object doSubtract(final Object lhs, final BigInteger rhs) throws Throwable {
    return doSubtract(((NgLong)lhs).getLongValue(), rhs);
  }

  @Override
  public Object doSubtract(final Object lhs, final BigDecimal rhs) throws Throwable {
    return doSubtract(((NgLong)lhs).getLongValue(), rhs);
  }

  @Override
  public Object doReverseSubtract(final byte lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(byte.class).doSubtract(lhs, ((NgLong)rhs).getLongValue());
  }

  @Override
  public Object doReverseSubtract(final char lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(char.class).doSubtract(lhs, ((NgLong)rhs).getLongValue());
  }

  @Override
  public Object doReverseSubtract(final short lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(short.class).doSubtract(lhs, ((NgLong)rhs).getLongValue());
  }

  @Override
  public Object doReverseSubtract(final int lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(int.class).doSubtract(lhs, ((NgLong)rhs).getLongValue());
  }

  @Override
  public Object doReverseSubtract(final long lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(long.class).doSubtract(lhs, ((NgLong)rhs).getLongValue());
  }

  @Override
  public Object doReverseSubtract(final float lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(float.class).doSubtract(lhs, ((NgLong)rhs).getLongValue());
  }

  @Override
  public Object doReverseSubtract(final double lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(double.class).doSubtract(lhs, ((NgLong)rhs).getLongValue());
  }

  @Override
  public Object doReverseSubtract(final BigInteger lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(BigInteger.class).doSubtract(lhs, ((NgLong)rhs).getLongValue());
  }

  @Override
  public Object doReverseSubtract(final BigDecimal lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(BigDecimal.class).doSubtract(lhs, ((NgLong)rhs).getLongValue());
  }

  @Override
  public Object doSubtractEquals(final Object lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseSubtractEquals(((NgLong)lhs).getLongValue(), rhs);
  }

  @Override
  public Object doSubtractEquals(final long lhs, final byte rhs) throws Throwable {
    return NgLong.valueOf(lhs - rhs);
  }

  @Override
  public Object doSubtractEquals(final long lhs, final char rhs) throws Throwable {
    return NgLong.valueOf(lhs - rhs);
  }

  @Override
  public Object doSubtractEquals(final long lhs, final short rhs) throws Throwable {
    return NgLong.valueOf(lhs - rhs);
  }

  @Override
  public Object doSubtractEquals(final long lhs, final int rhs) throws Throwable {
    return NgLong.valueOf(lhs - rhs);
  }

  @Override
  public Object doSubtractEquals(final long lhs, final long rhs) throws Throwable {
    return NgLong.valueOf(lhs - rhs);
  }

  @Override
  public Object doSubtractEquals(final long lhs, final float rhs) throws Throwable {
    return NgFloat.valueOf(lhs - rhs);
  }

  @Override
  public Object doSubtractEquals(final long lhs, final double rhs) throws Throwable {
    return NgDouble.valueOf(lhs - rhs);
  }

  @Override
  public Object doSubtractEquals(final long lhs, final BigInteger rhs) throws Throwable {
    return BigInteger.valueOf(lhs).subtract(rhs);
  }

  @Override
  public Object doSubtractEquals(final long lhs, final BigDecimal rhs) throws Throwable {
    return new BigDecimal(lhs).subtract(rhs);
  }

  @Override
  public Object doSubtractEquals(final Object lhs, final byte rhs) throws Throwable {
    return doSubtractEquals(((NgLong)lhs).getLongValue(), rhs);
  }

  @Override
  public Object doSubtractEquals(final Object lhs, final char rhs) throws Throwable {
    return doSubtractEquals(((NgLong)lhs).getLongValue(), rhs);
  }

  @Override
  public Object doSubtractEquals(final Object lhs, final short rhs) throws Throwable {
    return doSubtractEquals(((NgLong)lhs).getLongValue(), rhs);
  }

  @Override
  public Object doSubtractEquals(final Object lhs, final int rhs) throws Throwable {
    return doSubtractEquals(((NgLong)lhs).getLongValue(), rhs);
  }

  @Override
  public Object doSubtractEquals(final Object lhs, final long rhs) throws Throwable {
    return doSubtractEquals(((NgLong)lhs).getLongValue(), rhs);
  }

  @Override
  public Object doSubtractEquals(final Object lhs, final float rhs) throws Throwable {
    return doSubtractEquals(((NgLong)lhs).getLongValue(), rhs);
  }

  @Override
  public Object doSubtractEquals(final Object lhs, final double rhs) throws Throwable {
    return doSubtractEquals(((NgLong)lhs).getLongValue(), rhs);
  }

  @Override
  public Object doSubtractEquals(final Object lhs, final BigInteger rhs) throws Throwable {
    return doSubtractEquals(((NgLong)lhs).getLongValue(), rhs);
  }

  @Override
  public Object doSubtractEquals(final Object lhs, final BigDecimal rhs) throws Throwable {
    return doSubtractEquals(((NgLong)lhs).getLongValue(), rhs);
  }

  @Override
  public Object doReverseSubtractEquals(final byte lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(byte.class).doSubtractEquals(lhs, ((NgLong)rhs).getLongValue());
  }

  @Override
  public Object doReverseSubtractEquals(final char lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(char.class).doSubtractEquals(lhs, ((NgLong)rhs).getLongValue());
  }

  @Override
  public Object doReverseSubtractEquals(final short lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(short.class).doSubtractEquals(lhs, ((NgLong)rhs).getLongValue());
  }

  @Override
  public Object doReverseSubtractEquals(final int lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(int.class).doSubtractEquals(lhs, ((NgLong)rhs).getLongValue());
  }

  @Override
  public Object doReverseSubtractEquals(final long lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(long.class).doSubtractEquals(lhs, ((NgLong)rhs).getLongValue());
  }

  @Override
  public Object doReverseSubtractEquals(final float lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(float.class).doSubtractEquals(lhs, ((NgLong)rhs).getLongValue());
  }

  @Override
  public Object doReverseSubtractEquals(final double lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(double.class).doSubtractEquals(lhs, ((NgLong)rhs).getLongValue());
  }

  @Override
  public Object doReverseSubtractEquals(final BigInteger lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(BigInteger.class).doSubtractEquals(lhs, ((NgLong)rhs).getLongValue());
  }

  @Override
  public Object doReverseSubtractEquals(final BigDecimal lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(BigDecimal.class).doSubtractEquals(lhs, ((NgLong)rhs).getLongValue());
  }

  @Override
  public Object doMultiply(final Object lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseMultiply(((NgLong)lhs).getLongValue(), rhs);
  }

  @Override
  public Object doMultiply(final long lhs, final byte rhs) throws Throwable {
    return NgLong.valueOf(lhs * rhs);
  }

  @Override
  public Object doMultiply(final long lhs, final char rhs) throws Throwable {
    return NgLong.valueOf(lhs * rhs);
  }

  @Override
  public Object doMultiply(final long lhs, final short rhs) throws Throwable {
    return NgLong.valueOf(lhs * rhs);
  }

  @Override
  public Object doMultiply(final long lhs, final int rhs) throws Throwable {
    return NgLong.valueOf(lhs * rhs);
  }

  @Override
  public Object doMultiply(final long lhs, final long rhs) throws Throwable {
    return NgLong.valueOf(lhs * rhs);
  }

  @Override
  public Object doMultiply(final long lhs, final float rhs) throws Throwable {
    return NgFloat.valueOf(lhs * rhs);
  }

  @Override
  public Object doMultiply(final long lhs, final double rhs) throws Throwable {
    return NgDouble.valueOf(lhs * rhs);
  }

  @Override
  public Object doMultiply(final long lhs, final BigInteger rhs) throws Throwable {
    return BigInteger.valueOf(lhs).multiply(rhs);
  }

  @Override
  public Object doMultiply(final long lhs, final BigDecimal rhs) throws Throwable {
    return new BigDecimal(lhs).multiply(rhs);
  }

  @Override
  public Object doMultiply(final Object lhs, final byte rhs) throws Throwable {
    return doMultiply(((NgLong)lhs).getLongValue(), rhs);
  }

  @Override
  public Object doMultiply(final Object lhs, final char rhs) throws Throwable {
    return doMultiply(((NgLong)lhs).getLongValue(), rhs);
  }

  @Override
  public Object doMultiply(final Object lhs, final short rhs) throws Throwable {
    return doMultiply(((NgLong)lhs).getLongValue(), rhs);
  }

  @Override
  public Object doMultiply(final Object lhs, final int rhs) throws Throwable {
    return doMultiply(((NgLong)lhs).getLongValue(), rhs);
  }

  @Override
  public Object doMultiply(final Object lhs, final long rhs) throws Throwable {
    return doMultiply(((NgLong)lhs).getLongValue(), rhs);
  }

  @Override
  public Object doMultiply(final Object lhs, final float rhs) throws Throwable {
    return doMultiply(((NgLong)lhs).getLongValue(), rhs);
  }

  @Override
  public Object doMultiply(final Object lhs, final double rhs) throws Throwable {
    return doMultiply(((NgLong)lhs).getLongValue(), rhs);
  }

  @Override
  public Object doMultiply(final Object lhs, final BigInteger rhs) throws Throwable {
    return doMultiply(((NgLong)lhs).getLongValue(), rhs);
  }

  @Override
  public Object doMultiply(final Object lhs, final BigDecimal rhs) throws Throwable {
    return doMultiply(((NgLong)lhs).getLongValue(), rhs);
  }

  @Override
  public Object doReverseMultiply(final byte lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(byte.class).doMultiply(lhs, ((NgLong)rhs).getLongValue());
  }

  @Override
  public Object doReverseMultiply(final char lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(char.class).doMultiply(lhs, ((NgLong)rhs).getLongValue());
  }

  @Override
  public Object doReverseMultiply(final short lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(short.class).doMultiply(lhs, ((NgLong)rhs).getLongValue());
  }

  @Override
  public Object doReverseMultiply(final int lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(int.class).doMultiply(lhs, ((NgLong)rhs).getLongValue());
  }

  @Override
  public Object doReverseMultiply(final long lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(long.class).doMultiply(lhs, ((NgLong)rhs).getLongValue());
  }

  @Override
  public Object doReverseMultiply(final float lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(float.class).doMultiply(lhs, ((NgLong)rhs).getLongValue());
  }

  @Override
  public Object doReverseMultiply(final double lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(double.class).doMultiply(lhs, ((NgLong)rhs).getLongValue());
  }

  @Override
  public Object doReverseMultiply(final BigInteger lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(BigInteger.class).doMultiply(lhs, ((NgLong)rhs).getLongValue());
  }

  @Override
  public Object doReverseMultiply(final BigDecimal lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(BigDecimal.class).doMultiply(lhs, ((NgLong)rhs).getLongValue());
  }

  @Override
  public Object doMultiplyEquals(final Object lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseMultiplyEquals(((NgLong)lhs).getLongValue(), rhs);
  }

  @Override
  public Object doMultiplyEquals(final long lhs, final byte rhs) throws Throwable {
    return NgLong.valueOf(lhs * rhs);
  }

  @Override
  public Object doMultiplyEquals(final long lhs, final char rhs) throws Throwable {
    return NgLong.valueOf(lhs * rhs);
  }

  @Override
  public Object doMultiplyEquals(final long lhs, final short rhs) throws Throwable {
    return NgLong.valueOf(lhs * rhs);
  }

  @Override
  public Object doMultiplyEquals(final long lhs, final int rhs) throws Throwable {
    return NgLong.valueOf(lhs * rhs);
  }

  @Override
  public Object doMultiplyEquals(final long lhs, final long rhs) throws Throwable {
    return NgLong.valueOf(lhs * rhs);
  }

  @Override
  public Object doMultiplyEquals(final long lhs, final float rhs) throws Throwable {
    return NgFloat.valueOf(lhs * rhs);
  }

  @Override
  public Object doMultiplyEquals(final long lhs, final double rhs) throws Throwable {
    return NgDouble.valueOf(lhs * rhs);
  }

  @Override
  public Object doMultiplyEquals(final long lhs, final BigInteger rhs) throws Throwable {
    return BigInteger.valueOf(lhs).multiply(rhs);
  }

  @Override
  public Object doMultiplyEquals(final long lhs, final BigDecimal rhs) throws Throwable {
    return new BigDecimal(lhs).multiply(rhs);
  }

  @Override
  public Object doMultiplyEquals(final Object lhs, final byte rhs) throws Throwable {
    return doMultiplyEquals(((NgLong)lhs).getLongValue(), rhs);
  }

  @Override
  public Object doMultiplyEquals(final Object lhs, final char rhs) throws Throwable {
    return doMultiplyEquals(((NgLong)lhs).getLongValue(), rhs);
  }

  @Override
  public Object doMultiplyEquals(final Object lhs, final short rhs) throws Throwable {
    return doMultiplyEquals(((NgLong)lhs).getLongValue(), rhs);
  }

  @Override
  public Object doMultiplyEquals(final Object lhs, final int rhs) throws Throwable {
    return doMultiplyEquals(((NgLong)lhs).getLongValue(), rhs);
  }

  @Override
  public Object doMultiplyEquals(final Object lhs, final long rhs) throws Throwable {
    return doMultiplyEquals(((NgLong)lhs).getLongValue(), rhs);
  }

  @Override
  public Object doMultiplyEquals(final Object lhs, final float rhs) throws Throwable {
    return doMultiplyEquals(((NgLong)lhs).getLongValue(), rhs);
  }

  @Override
  public Object doMultiplyEquals(final Object lhs, final double rhs) throws Throwable {
    return doMultiplyEquals(((NgLong)lhs).getLongValue(), rhs);
  }

  @Override
  public Object doMultiplyEquals(final Object lhs, final BigInteger rhs) throws Throwable {
    return doMultiplyEquals(((NgLong)lhs).getLongValue(), rhs);
  }

  @Override
  public Object doMultiplyEquals(final Object lhs, final BigDecimal rhs) throws Throwable {
    return doMultiplyEquals(((NgLong)lhs).getLongValue(), rhs);
  }

  @Override
  public Object doReverseMultiplyEquals(final byte lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(byte.class).doMultiplyEquals(lhs, ((NgLong)rhs).getLongValue());
  }

  @Override
  public Object doReverseMultiplyEquals(final char lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(char.class).doMultiplyEquals(lhs, ((NgLong)rhs).getLongValue());
  }

  @Override
  public Object doReverseMultiplyEquals(final short lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(short.class).doMultiplyEquals(lhs, ((NgLong)rhs).getLongValue());
  }

  @Override
  public Object doReverseMultiplyEquals(final int lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(int.class).doMultiplyEquals(lhs, ((NgLong)rhs).getLongValue());
  }

  @Override
  public Object doReverseMultiplyEquals(final long lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(long.class).doMultiplyEquals(lhs, ((NgLong)rhs).getLongValue());
  }

  @Override
  public Object doReverseMultiplyEquals(final float lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(float.class).doMultiplyEquals(lhs, ((NgLong)rhs).getLongValue());
  }

  @Override
  public Object doReverseMultiplyEquals(final double lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(double.class).doMultiplyEquals(lhs, ((NgLong)rhs).getLongValue());
  }

  @Override
  public Object doReverseMultiplyEquals(final BigInteger lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(BigInteger.class).doMultiplyEquals(lhs, ((NgLong)rhs).getLongValue());
  }

  @Override
  public Object doReverseMultiplyEquals(final BigDecimal lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(BigDecimal.class).doMultiplyEquals(lhs, ((NgLong)rhs).getLongValue());
  }

  @Override
  public Object doDivide(final Object lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseDivide(((NgLong)lhs).getLongValue(), rhs);
  }

  @Override
  public Object doDivide(final long lhs, final byte rhs) throws Throwable {
    return NgLong.valueOf(lhs / rhs);
  }

  @Override
  public Object doDivide(final long lhs, final char rhs) throws Throwable {
    return NgLong.valueOf(lhs / rhs);
  }

  @Override
  public Object doDivide(final long lhs, final short rhs) throws Throwable {
    return NgLong.valueOf(lhs / rhs);
  }

  @Override
  public Object doDivide(final long lhs, final int rhs) throws Throwable {
    return NgLong.valueOf(lhs / rhs);
  }

  @Override
  public Object doDivide(final long lhs, final long rhs) throws Throwable {
    return NgLong.valueOf(lhs / rhs);
  }

  @Override
  public Object doDivide(final long lhs, final float rhs) throws Throwable {
    return NgFloat.valueOf(lhs / rhs);
  }

  @Override
  public Object doDivide(final long lhs, final double rhs) throws Throwable {
    return NgDouble.valueOf(lhs / rhs);
  }

  @Override
  public Object doDivide(final long lhs, final BigInteger rhs) throws Throwable {
    return BigInteger.valueOf(lhs).divide(rhs);
  }

  @Override
  public Object doDivide(final long lhs, final BigDecimal rhs) throws Throwable {
    return new BigDecimal(lhs).divide(rhs);
  }

  @Override
  public Object doDivide(final Object lhs, final byte rhs) throws Throwable {
    return doDivide(((NgLong)lhs).getLongValue(), rhs);
  }

  @Override
  public Object doDivide(final Object lhs, final char rhs) throws Throwable {
    return doDivide(((NgLong)lhs).getLongValue(), rhs);
  }

  @Override
  public Object doDivide(final Object lhs, final short rhs) throws Throwable {
    return doDivide(((NgLong)lhs).getLongValue(), rhs);
  }

  @Override
  public Object doDivide(final Object lhs, final int rhs) throws Throwable {
    return doDivide(((NgLong)lhs).getLongValue(), rhs);
  }

  @Override
  public Object doDivide(final Object lhs, final long rhs) throws Throwable {
    return doDivide(((NgLong)lhs).getLongValue(), rhs);
  }

  @Override
  public Object doDivide(final Object lhs, final float rhs) throws Throwable {
    return doDivide(((NgLong)lhs).getLongValue(), rhs);
  }

  @Override
  public Object doDivide(final Object lhs, final double rhs) throws Throwable {
    return doDivide(((NgLong)lhs).getLongValue(), rhs);
  }

  @Override
  public Object doDivide(final Object lhs, final BigInteger rhs) throws Throwable {
    return doDivide(((NgLong)lhs).getLongValue(), rhs);
  }

  @Override
  public Object doDivide(final Object lhs, final BigDecimal rhs) throws Throwable {
    return doDivide(((NgLong)lhs).getLongValue(), rhs);
  }

  @Override
  public Object doReverseDivide(final byte lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(byte.class).doDivide(lhs, ((NgLong)rhs).getLongValue());
  }

  @Override
  public Object doReverseDivide(final char lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(char.class).doDivide(lhs, ((NgLong)rhs).getLongValue());
  }

  @Override
  public Object doReverseDivide(final short lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(short.class).doDivide(lhs, ((NgLong)rhs).getLongValue());
  }

  @Override
  public Object doReverseDivide(final int lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(int.class).doDivide(lhs, ((NgLong)rhs).getLongValue());
  }

  @Override
  public Object doReverseDivide(final long lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(long.class).doDivide(lhs, ((NgLong)rhs).getLongValue());
  }

  @Override
  public Object doReverseDivide(final float lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(float.class).doDivide(lhs, ((NgLong)rhs).getLongValue());
  }

  @Override
  public Object doReverseDivide(final double lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(double.class).doDivide(lhs, ((NgLong)rhs).getLongValue());
  }

  @Override
  public Object doReverseDivide(final BigInteger lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(BigInteger.class).doDivide(lhs, ((NgLong)rhs).getLongValue());
  }

  @Override
  public Object doReverseDivide(final BigDecimal lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(BigDecimal.class).doDivide(lhs, ((NgLong)rhs).getLongValue());
  }

  @Override
  public Object doDivideEquals(final Object lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseDivideEquals(((NgLong)lhs).getLongValue(), rhs);
  }

  @Override
  public Object doDivideEquals(final long lhs, final byte rhs) throws Throwable {
    return NgLong.valueOf(lhs / rhs);
  }

  @Override
  public Object doDivideEquals(final long lhs, final char rhs) throws Throwable {
    return NgLong.valueOf(lhs / rhs);
  }

  @Override
  public Object doDivideEquals(final long lhs, final short rhs) throws Throwable {
    return NgLong.valueOf(lhs / rhs);
  }

  @Override
  public Object doDivideEquals(final long lhs, final int rhs) throws Throwable {
    return NgLong.valueOf(lhs / rhs);
  }

  @Override
  public Object doDivideEquals(final long lhs, final long rhs) throws Throwable {
    return NgLong.valueOf(lhs / rhs);
  }

  @Override
  public Object doDivideEquals(final long lhs, final float rhs) throws Throwable {
    return NgFloat.valueOf(lhs / rhs);
  }

  @Override
  public Object doDivideEquals(final long lhs, final double rhs) throws Throwable {
    return NgDouble.valueOf(lhs / rhs);
  }

  @Override
  public Object doDivideEquals(final long lhs, final BigInteger rhs) throws Throwable {
    return BigInteger.valueOf(lhs).divide(rhs);
  }

  @Override
  public Object doDivideEquals(final long lhs, final BigDecimal rhs) throws Throwable {
    return new BigDecimal(lhs).divide(rhs);
  }

  @Override
  public Object doDivideEquals(final Object lhs, final byte rhs) throws Throwable {
    return doDivideEquals(((NgLong)lhs).getLongValue(), rhs);
  }

  @Override
  public Object doDivideEquals(final Object lhs, final char rhs) throws Throwable {
    return doDivideEquals(((NgLong)lhs).getLongValue(), rhs);
  }

  @Override
  public Object doDivideEquals(final Object lhs, final short rhs) throws Throwable {
    return doDivideEquals(((NgLong)lhs).getLongValue(), rhs);
  }

  @Override
  public Object doDivideEquals(final Object lhs, final int rhs) throws Throwable {
    return doDivideEquals(((NgLong)lhs).getLongValue(), rhs);
  }

  @Override
  public Object doDivideEquals(final Object lhs, final long rhs) throws Throwable {
    return doDivideEquals(((NgLong)lhs).getLongValue(), rhs);
  }

  @Override
  public Object doDivideEquals(final Object lhs, final float rhs) throws Throwable {
    return doDivideEquals(((NgLong)lhs).getLongValue(), rhs);
  }

  @Override
  public Object doDivideEquals(final Object lhs, final double rhs) throws Throwable {
    return doDivideEquals(((NgLong)lhs).getLongValue(), rhs);
  }

  @Override
  public Object doDivideEquals(final Object lhs, final BigInteger rhs) throws Throwable {
    return doDivideEquals(((NgLong)lhs).getLongValue(), rhs);
  }

  @Override
  public Object doDivideEquals(final Object lhs, final BigDecimal rhs) throws Throwable {
    return doDivideEquals(((NgLong)lhs).getLongValue(), rhs);
  }

  @Override
  public Object doReverseDivideEquals(final byte lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(byte.class).doDivideEquals(lhs, ((NgLong)rhs).getLongValue());
  }

  @Override
  public Object doReverseDivideEquals(final char lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(char.class).doDivideEquals(lhs, ((NgLong)rhs).getLongValue());
  }

  @Override
  public Object doReverseDivideEquals(final short lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(short.class).doDivideEquals(lhs, ((NgLong)rhs).getLongValue());
  }

  @Override
  public Object doReverseDivideEquals(final int lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(int.class).doDivideEquals(lhs, ((NgLong)rhs).getLongValue());
  }

  @Override
  public Object doReverseDivideEquals(final long lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(long.class).doDivideEquals(lhs, ((NgLong)rhs).getLongValue());
  }

  @Override
  public Object doReverseDivideEquals(final float lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(float.class).doDivideEquals(lhs, ((NgLong)rhs).getLongValue());
  }

  @Override
  public Object doReverseDivideEquals(final double lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(double.class).doDivideEquals(lhs, ((NgLong)rhs).getLongValue());
  }

  @Override
  public Object doReverseDivideEquals(final BigInteger lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(BigInteger.class).doDivideEquals(lhs, ((NgLong)rhs).getLongValue());
  }

  @Override
  public Object doReverseDivideEquals(final BigDecimal lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(BigDecimal.class).doDivideEquals(lhs, ((NgLong)rhs).getLongValue());
  }

  @Override
  public Object doRemainder(final Object lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseRemainder(((NgLong)lhs).getLongValue(), rhs);
  }

  @Override
  public Object doRemainder(final long lhs, final byte rhs) throws Throwable {
    return NgLong.valueOf(lhs % rhs);
  }

  @Override
  public Object doRemainder(final long lhs, final char rhs) throws Throwable {
    return NgLong.valueOf(lhs % rhs);
  }

  @Override
  public Object doRemainder(final long lhs, final short rhs) throws Throwable {
    return NgLong.valueOf(lhs % rhs);
  }

  @Override
  public Object doRemainder(final long lhs, final int rhs) throws Throwable {
    return NgLong.valueOf(lhs % rhs);
  }

  @Override
  public Object doRemainder(final long lhs, final long rhs) throws Throwable {
    return NgLong.valueOf(lhs % rhs);
  }

  @Override
  public Object doRemainder(final long lhs, final BigInteger rhs) throws Throwable {
    return BigInteger.valueOf(lhs).mod(rhs);
  }

  @Override
  public Object doRemainder(final Object lhs, final byte rhs) throws Throwable {
    return doRemainder(((NgLong)lhs).getLongValue(), rhs);
  }

  @Override
  public Object doRemainder(final Object lhs, final char rhs) throws Throwable {
    return doRemainder(((NgLong)lhs).getLongValue(), rhs);
  }

  @Override
  public Object doRemainder(final Object lhs, final short rhs) throws Throwable {
    return doRemainder(((NgLong)lhs).getLongValue(), rhs);
  }

  @Override
  public Object doRemainder(final Object lhs, final int rhs) throws Throwable {
    return doRemainder(((NgLong)lhs).getLongValue(), rhs);
  }

  @Override
  public Object doRemainder(final Object lhs, final long rhs) throws Throwable {
    return doRemainder(((NgLong)lhs).getLongValue(), rhs);
  }

  @Override
  public Object doRemainder(final Object lhs, final BigInteger rhs) throws Throwable {
    return doRemainder(((NgLong)lhs).getLongValue(), rhs);
  }

  @Override
  public Object doReverseRemainder(final byte lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(byte.class).doRemainder(lhs, ((NgLong)rhs).getLongValue());
  }

  @Override
  public Object doReverseRemainder(final char lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(char.class).doRemainder(lhs, ((NgLong)rhs).getLongValue());
  }

  @Override
  public Object doReverseRemainder(final short lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(short.class).doRemainder(lhs, ((NgLong)rhs).getLongValue());
  }

  @Override
  public Object doReverseRemainder(final int lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(int.class).doRemainder(lhs, ((NgLong)rhs).getLongValue());
  }

  @Override
  public Object doReverseRemainder(final long lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(long.class).doRemainder(lhs, ((NgLong)rhs).getLongValue());
  }

  @Override
  public Object doReverseRemainder(final BigInteger lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(BigInteger.class).doRemainder(lhs, ((NgLong)rhs).getLongValue());
  }

  @Override
  public Object doRemainderEquals(final Object lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseRemainderEquals(((NgLong)lhs).getLongValue(), rhs);
  }

  @Override
  public Object doRemainderEquals(final long lhs, final byte rhs) throws Throwable {
    return NgLong.valueOf(lhs % rhs);
  }

  @Override
  public Object doRemainderEquals(final long lhs, final char rhs) throws Throwable {
    return NgLong.valueOf(lhs % rhs);
  }

  @Override
  public Object doRemainderEquals(final long lhs, final short rhs) throws Throwable {
    return NgLong.valueOf(lhs % rhs);
  }

  @Override
  public Object doRemainderEquals(final long lhs, final int rhs) throws Throwable {
    return NgLong.valueOf(lhs % rhs);
  }

  @Override
  public Object doRemainderEquals(final long lhs, final long rhs) throws Throwable {
    return NgLong.valueOf(lhs % rhs);
  }

  @Override
  public Object doRemainderEquals(final long lhs, final BigInteger rhs) throws Throwable {
    return BigInteger.valueOf(lhs).mod(rhs);
  }

  @Override
  public Object doRemainderEquals(final Object lhs, final byte rhs) throws Throwable {
    return doRemainderEquals(((NgLong)lhs).getLongValue(), rhs);
  }

  @Override
  public Object doRemainderEquals(final Object lhs, final char rhs) throws Throwable {
    return doRemainderEquals(((NgLong)lhs).getLongValue(), rhs);
  }

  @Override
  public Object doRemainderEquals(final Object lhs, final short rhs) throws Throwable {
    return doRemainderEquals(((NgLong)lhs).getLongValue(), rhs);
  }

  @Override
  public Object doRemainderEquals(final Object lhs, final int rhs) throws Throwable {
    return doRemainderEquals(((NgLong)lhs).getLongValue(), rhs);
  }

  @Override
  public Object doRemainderEquals(final Object lhs, final long rhs) throws Throwable {
    return doRemainderEquals(((NgLong)lhs).getLongValue(), rhs);
  }

  @Override
  public Object doRemainderEquals(final Object lhs, final BigInteger rhs) throws Throwable {
    return doRemainderEquals(((NgLong)lhs).getLongValue(), rhs);
  }

  @Override
  public Object doReverseRemainderEquals(final byte lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(byte.class).doRemainderEquals(lhs, ((NgLong)rhs).getLongValue());
  }

  @Override
  public Object doReverseRemainderEquals(final char lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(char.class).doRemainderEquals(lhs, ((NgLong)rhs).getLongValue());
  }

  @Override
  public Object doReverseRemainderEquals(final short lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(short.class).doRemainderEquals(lhs, ((NgLong)rhs).getLongValue());
  }

  @Override
  public Object doReverseRemainderEquals(final int lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(int.class).doRemainderEquals(lhs, ((NgLong)rhs).getLongValue());
  }

  @Override
  public Object doReverseRemainderEquals(final long lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(long.class).doRemainderEquals(lhs, ((NgLong)rhs).getLongValue());
  }

  @Override
  public Object doReverseRemainderEquals(final BigInteger lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(BigInteger.class).doRemainderEquals(lhs, ((NgLong)rhs).getLongValue());
  }

  @Override
  public Object doIntegerDivide(final Object lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseIntegerDivide(((NgLong)lhs).getLongValue(), rhs);
  }

  @Override
  public Object doIntegerDivide(final long lhs, final byte rhs) throws Throwable {
    return NgLong.valueOf(lhs / rhs);
  }

  @Override
  public Object doIntegerDivide(final long lhs, final char rhs) throws Throwable {
    return NgLong.valueOf(lhs / rhs);
  }

  @Override
  public Object doIntegerDivide(final long lhs, final short rhs) throws Throwable {
    return NgLong.valueOf(lhs / rhs);
  }

  @Override
  public Object doIntegerDivide(final long lhs, final int rhs) throws Throwable {
    return NgLong.valueOf(lhs / rhs);
  }

  @Override
  public Object doIntegerDivide(final long lhs, final long rhs) throws Throwable {
    return NgLong.valueOf(lhs / rhs);
  }

  @Override
  public Object doIntegerDivide(final long lhs, final float rhs) throws Throwable {
    return NgFloat.valueOf((float)Math.floor(lhs / rhs));
  }

  @Override
  public Object doIntegerDivide(final long lhs, final double rhs) throws Throwable {
    return NgDouble.valueOf(Math.floor(lhs / rhs));
  }

  @Override
  public Object doIntegerDivide(final long lhs, final BigInteger rhs) throws Throwable {
    return BigInteger.valueOf(lhs).divide(rhs);
  }

  @Override
  public Object doIntegerDivide(final long lhs, final BigDecimal rhs) throws Throwable {
    return BigDecimal.valueOf(lhs).divideToIntegralValue(rhs);
  }

  @Override
  public Object doIntegerDivide(final Object lhs, final byte rhs) throws Throwable {
    return doIntegerDivide(((NgLong)lhs).getLongValue(), rhs);
  }

  @Override
  public Object doIntegerDivide(final Object lhs, final char rhs) throws Throwable {
    return doIntegerDivide(((NgLong)lhs).getLongValue(), rhs);
  }

  @Override
  public Object doIntegerDivide(final Object lhs, final short rhs) throws Throwable {
    return doIntegerDivide(((NgLong)lhs).getLongValue(), rhs);
  }

  @Override
  public Object doIntegerDivide(final Object lhs, final int rhs) throws Throwable {
    return doIntegerDivide(((NgLong)lhs).getLongValue(), rhs);
  }

  @Override
  public Object doIntegerDivide(final Object lhs, final long rhs) throws Throwable {
    return doIntegerDivide(((NgLong)lhs).getLongValue(), rhs);
  }

  @Override
  public Object doIntegerDivide(final Object lhs, final float rhs) throws Throwable {
    return doIntegerDivide(((NgLong)lhs).getLongValue(), rhs);
  }

  @Override
  public Object doIntegerDivide(final Object lhs, final double rhs) throws Throwable {
    return doIntegerDivide(((NgLong)lhs).getLongValue(), rhs);
  }

  @Override
  public Object doIntegerDivide(final Object lhs, final BigInteger rhs) throws Throwable {
    return doIntegerDivide(((NgLong)lhs).getLongValue(), rhs);
  }

  @Override
  public Object doIntegerDivide(final Object lhs, final BigDecimal rhs) throws Throwable {
    return doIntegerDivide(((NgLong)lhs).getLongValue(), rhs);
  }

  @Override
  public Object doReverseIntegerDivide(final byte lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(byte.class).doIntegerDivide(lhs, ((NgLong)rhs).getLongValue());
  }

  @Override
  public Object doReverseIntegerDivide(final char lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(char.class).doIntegerDivide(lhs, ((NgLong)rhs).getLongValue());
  }

  @Override
  public Object doReverseIntegerDivide(final short lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(short.class).doIntegerDivide(lhs, ((NgLong)rhs).getLongValue());
  }

  @Override
  public Object doReverseIntegerDivide(final int lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(int.class).doIntegerDivide(lhs, ((NgLong)rhs).getLongValue());
  }

  @Override
  public Object doReverseIntegerDivide(final long lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(long.class).doIntegerDivide(lhs, ((NgLong)rhs).getLongValue());
  }

  @Override
  public Object doReverseIntegerDivide(final float lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(float.class).doIntegerDivide(lhs, ((NgLong)rhs).getLongValue());
  }

  @Override
  public Object doReverseIntegerDivide(final double lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(double.class).doIntegerDivide(lhs, ((NgLong)rhs).getLongValue());
  }

  @Override
  public Object doReverseIntegerDivide(final BigInteger lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(BigInteger.class).doIntegerDivide(lhs, ((NgLong)rhs).getLongValue());
  }

  @Override
  public Object doReverseIntegerDivide(final BigDecimal lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(BigDecimal.class).doIntegerDivide(lhs, ((NgLong)rhs).getLongValue());
  }

  @Override
  public Object doIntegerDivideEquals(final Object lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseIntegerDivideEquals(((NgLong)lhs).getLongValue(), rhs);
  }

  @Override
  public Object doIntegerDivideEquals(final long lhs, final byte rhs) throws Throwable {
    return NgLong.valueOf(lhs / rhs);
  }

  @Override
  public Object doIntegerDivideEquals(final long lhs, final char rhs) throws Throwable {
    return NgLong.valueOf(lhs / rhs);
  }

  @Override
  public Object doIntegerDivideEquals(final long lhs, final short rhs) throws Throwable {
    return NgLong.valueOf(lhs / rhs);
  }

  @Override
  public Object doIntegerDivideEquals(final long lhs, final int rhs) throws Throwable {
    return NgLong.valueOf(lhs / rhs);
  }

  @Override
  public Object doIntegerDivideEquals(final long lhs, final long rhs) throws Throwable {
    return NgLong.valueOf(lhs / rhs);
  }

  @Override
  public Object doIntegerDivideEquals(final long lhs, final float rhs) throws Throwable {
    return NgFloat.valueOf((float)Math.floor(lhs / rhs));
  }

  @Override
  public Object doIntegerDivideEquals(final long lhs, final double rhs) throws Throwable {
    return NgDouble.valueOf(Math.floor(lhs / rhs));
  }

  @Override
  public Object doIntegerDivideEquals(final long lhs, final BigInteger rhs) throws Throwable {
    return BigInteger.valueOf(lhs).divide(rhs);
  }

  @Override
  public Object doIntegerDivideEquals(final long lhs, final BigDecimal rhs) throws Throwable {
    return BigDecimal.valueOf(lhs).divideToIntegralValue(rhs);
  }

  @Override
  public Object doIntegerDivideEquals(final Object lhs, final byte rhs) throws Throwable {
    return doIntegerDivideEquals(((NgLong)lhs).getLongValue(), rhs);
  }

  @Override
  public Object doIntegerDivideEquals(final Object lhs, final char rhs) throws Throwable {
    return doIntegerDivideEquals(((NgLong)lhs).getLongValue(), rhs);
  }

  @Override
  public Object doIntegerDivideEquals(final Object lhs, final short rhs) throws Throwable {
    return doIntegerDivideEquals(((NgLong)lhs).getLongValue(), rhs);
  }

  @Override
  public Object doIntegerDivideEquals(final Object lhs, final int rhs) throws Throwable {
    return doIntegerDivideEquals(((NgLong)lhs).getLongValue(), rhs);
  }

  @Override
  public Object doIntegerDivideEquals(final Object lhs, final long rhs) throws Throwable {
    return doIntegerDivideEquals(((NgLong)lhs).getLongValue(), rhs);
  }

  @Override
  public Object doIntegerDivideEquals(final Object lhs, final float rhs) throws Throwable {
    return doIntegerDivideEquals(((NgLong)lhs).getLongValue(), rhs);
  }

  @Override
  public Object doIntegerDivideEquals(final Object lhs, final double rhs) throws Throwable {
    return doIntegerDivideEquals(((NgLong)lhs).getLongValue(), rhs);
  }

  @Override
  public Object doIntegerDivideEquals(final Object lhs, final BigInteger rhs) throws Throwable {
    return doIntegerDivideEquals(((NgLong)lhs).getLongValue(), rhs);
  }

  @Override
  public Object doIntegerDivideEquals(final Object lhs, final BigDecimal rhs) throws Throwable {
    return doIntegerDivideEquals(((NgLong)lhs).getLongValue(), rhs);
  }

  @Override
  public Object doReverseIntegerDivideEquals(final byte lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(byte.class).doIntegerDivideEquals(lhs, ((NgLong)rhs).getLongValue());
  }

  @Override
  public Object doReverseIntegerDivideEquals(final char lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(char.class).doIntegerDivideEquals(lhs, ((NgLong)rhs).getLongValue());
  }

  @Override
  public Object doReverseIntegerDivideEquals(final short lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(short.class).doIntegerDivideEquals(lhs, ((NgLong)rhs).getLongValue());
  }

  @Override
  public Object doReverseIntegerDivideEquals(final int lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(int.class).doIntegerDivideEquals(lhs, ((NgLong)rhs).getLongValue());
  }

  @Override
  public Object doReverseIntegerDivideEquals(final long lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(long.class).doIntegerDivideEquals(lhs, ((NgLong)rhs).getLongValue());
  }

  @Override
  public Object doReverseIntegerDivideEquals(final float lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(float.class).doIntegerDivide(lhs, ((NgLong)rhs).getLongValue());
  }

  @Override
  public Object doReverseIntegerDivideEquals(final double lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(double.class).doIntegerDivide(lhs, ((NgLong)rhs).getLongValue());
  }

  @Override
  public Object doReverseIntegerDivideEquals(final BigInteger lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(BigInteger.class).doIntegerDivideEquals(lhs, ((NgLong)rhs).getLongValue());
  }

  @Override
  public Object doReverseIntegerDivideEquals(final BigDecimal lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(BigDecimal.class).doIntegerDivideEquals(lhs, ((NgLong)rhs).getLongValue());
  }

  @Override
  public Object doAnd(final Object lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseAnd(((NgLong)lhs).getLongValue(), rhs);
  }

  @Override
  public Object doAnd(final long lhs, final byte rhs) throws Throwable {
    return NgLong.valueOf(lhs & rhs);
  }

  @Override
  public Object doAnd(final long lhs, final char rhs) throws Throwable {
    return NgLong.valueOf(lhs & rhs);
  }

  @Override
  public Object doAnd(final long lhs, final short rhs) throws Throwable {
    return NgLong.valueOf(lhs & rhs);
  }

  @Override
  public Object doAnd(final long lhs, final int rhs) throws Throwable {
    return NgLong.valueOf(lhs & rhs);
  }

  @Override
  public Object doAnd(final long lhs, final long rhs) throws Throwable {
    return NgLong.valueOf(lhs & rhs);
  }

  @Override
  public Object doAnd(final long lhs, final BigInteger rhs) throws Throwable {
    return BigInteger.valueOf(lhs).and(rhs);
  }

  @Override
  public Object doAnd(final Object lhs, final byte rhs) throws Throwable {
    return doAnd(((NgLong)lhs).getLongValue(), rhs);
  }

  @Override
  public Object doAnd(final Object lhs, final char rhs) throws Throwable {
    return doAnd(((NgLong)lhs).getLongValue(), rhs);
  }

  @Override
  public Object doAnd(final Object lhs, final short rhs) throws Throwable {
    return doAnd(((NgLong)lhs).getLongValue(), rhs);
  }

  @Override
  public Object doAnd(final Object lhs, final int rhs) throws Throwable {
    return doAnd(((NgLong)lhs).getLongValue(), rhs);
  }

  @Override
  public Object doAnd(final Object lhs, final long rhs) throws Throwable {
    return doAnd(((NgLong)lhs).getLongValue(), rhs);
  }

  @Override
  public Object doAnd(final Object lhs, final BigInteger rhs) throws Throwable {
    return doAnd(((NgLong)lhs).getLongValue(), rhs);
  }

  @Override
  public Object doReverseAnd(final byte lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(byte.class).doAnd(lhs, ((NgLong)rhs).getLongValue());
  }

  @Override
  public Object doReverseAnd(final char lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(char.class).doAnd(lhs, ((NgLong)rhs).getLongValue());
  }

  @Override
  public Object doReverseAnd(final short lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(short.class).doAnd(lhs, ((NgLong)rhs).getLongValue());
  }

  @Override
  public Object doReverseAnd(final int lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(int.class).doAnd(lhs, ((NgLong)rhs).getLongValue());
  }

  @Override
  public Object doReverseAnd(final long lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(long.class).doAnd(lhs, ((NgLong)rhs).getLongValue());
  }

  @Override
  public Object doReverseAnd(final BigInteger lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(BigInteger.class).doAnd(lhs, ((NgLong)rhs).getLongValue());
  }

  @Override
  public Object doAndEquals(final Object lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseAndEquals(((NgLong)lhs).getLongValue(), rhs);
  }

  @Override
  public Object doAndEquals(final long lhs, final byte rhs) throws Throwable {
    return NgLong.valueOf(lhs & rhs);
  }

  @Override
  public Object doAndEquals(final long lhs, final char rhs) throws Throwable {
    return NgLong.valueOf(lhs & rhs);
  }

  @Override
  public Object doAndEquals(final long lhs, final short rhs) throws Throwable {
    return NgLong.valueOf(lhs & rhs);
  }

  @Override
  public Object doAndEquals(final long lhs, final int rhs) throws Throwable {
    return NgLong.valueOf(lhs & rhs);
  }

  @Override
  public Object doAndEquals(final long lhs, final long rhs) throws Throwable {
    return NgLong.valueOf(lhs & rhs);
  }

  @Override
  public Object doAndEquals(final long lhs, final BigInteger rhs) throws Throwable {
    return BigInteger.valueOf(lhs).and(rhs);
  }

  @Override
  public Object doAndEquals(final Object lhs, final byte rhs) throws Throwable {
    return doAndEquals(((NgLong)lhs).getLongValue(), rhs);
  }

  @Override
  public Object doAndEquals(final Object lhs, final char rhs) throws Throwable {
    return doAndEquals(((NgLong)lhs).getLongValue(), rhs);
  }

  @Override
  public Object doAndEquals(final Object lhs, final short rhs) throws Throwable {
    return doAndEquals(((NgLong)lhs).getLongValue(), rhs);
  }

  @Override
  public Object doAndEquals(final Object lhs, final int rhs) throws Throwable {
    return doAndEquals(((NgLong)lhs).getLongValue(), rhs);
  }

  @Override
  public Object doAndEquals(final Object lhs, final long rhs) throws Throwable {
    return doAndEquals(((NgLong)lhs).getLongValue(), rhs);
  }

  @Override
  public Object doAndEquals(final Object lhs, final BigInteger rhs) throws Throwable {
    return doAndEquals(((NgLong)lhs).getLongValue(), rhs);
  }

  @Override
  public Object doReverseAndEquals(final byte lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(byte.class).doAndEquals(lhs, ((NgLong)rhs).getLongValue());
  }

  @Override
  public Object doReverseAndEquals(final char lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(char.class).doAndEquals(lhs, ((NgLong)rhs).getLongValue());
  }

  @Override
  public Object doReverseAndEquals(final short lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(short.class).doAndEquals(lhs, ((NgLong)rhs).getLongValue());
  }

  @Override
  public Object doReverseAndEquals(final int lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(int.class).doAndEquals(lhs, ((NgLong)rhs).getLongValue());
  }

  @Override
  public Object doReverseAndEquals(final long lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(long.class).doAndEquals(lhs, ((NgLong)rhs).getLongValue());
  }

  @Override
  public Object doReverseAndEquals(final BigInteger lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(BigInteger.class).doAndEquals(lhs, ((NgLong)rhs).getLongValue());
  }

  @Override
  public Object doOr(final Object lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseOr(((NgLong)lhs).getLongValue(), rhs);
  }

  @Override
  public Object doOr(final long lhs, final byte rhs) throws Throwable {
    return NgLong.valueOf(lhs | rhs);
  }

  @Override
  public Object doOr(final long lhs, final char rhs) throws Throwable {
    return NgLong.valueOf(lhs | rhs);
  }

  @Override
  public Object doOr(final long lhs, final short rhs) throws Throwable {
    return NgLong.valueOf(lhs | rhs);
  }

  @Override
  public Object doOr(final long lhs, final int rhs) throws Throwable {
    return NgLong.valueOf(lhs | rhs);
  }

  @Override
  public Object doOr(final long lhs, final long rhs) throws Throwable {
    return NgLong.valueOf(lhs | rhs);
  }

  @Override
  public Object doOr(final long lhs, final BigInteger rhs) throws Throwable {
    return BigInteger.valueOf(lhs).or(rhs);
  }

  @Override
  public Object doOr(final Object lhs, final byte rhs) throws Throwable {
    return doOr(((NgLong)lhs).getLongValue(), rhs);
  }

  @Override
  public Object doOr(final Object lhs, final char rhs) throws Throwable {
    return doOr(((NgLong)lhs).getLongValue(), rhs);
  }

  @Override
  public Object doOr(final Object lhs, final short rhs) throws Throwable {
    return doOr(((NgLong)lhs).getLongValue(), rhs);
  }

  @Override
  public Object doOr(final Object lhs, final int rhs) throws Throwable {
    return doOr(((NgLong)lhs).getLongValue(), rhs);
  }

  @Override
  public Object doOr(final Object lhs, final long rhs) throws Throwable {
    return doOr(((NgLong)lhs).getLongValue(), rhs);
  }

  @Override
  public Object doOr(final Object lhs, final BigInteger rhs) throws Throwable {
    return doOr(((NgLong)lhs).getLongValue(), rhs);
  }

  @Override
  public Object doReverseOr(final byte lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(byte.class).doOr(lhs, ((NgLong)rhs).getLongValue());
  }

  @Override
  public Object doReverseOr(final char lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(char.class).doOr(lhs, ((NgLong)rhs).getLongValue());
  }

  @Override
  public Object doReverseOr(final short lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(short.class).doOr(lhs, ((NgLong)rhs).getLongValue());
  }

  @Override
  public Object doReverseOr(final int lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(int.class).doOr(lhs, ((NgLong)rhs).getLongValue());
  }

  @Override
  public Object doReverseOr(final long lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(long.class).doOr(lhs, ((NgLong)rhs).getLongValue());
  }

  @Override
  public Object doReverseOr(final BigInteger lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(BigInteger.class).doOr(lhs, ((NgLong)rhs).getLongValue());
  }

  @Override
  public Object doOrEquals(final Object lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseOrEquals(((NgLong)lhs).getLongValue(), rhs);
  }

  @Override
  public Object doOrEquals(final long lhs, final byte rhs) throws Throwable {
    return NgLong.valueOf(lhs | rhs);
  }

  @Override
  public Object doOrEquals(final long lhs, final char rhs) throws Throwable {
    return NgLong.valueOf(lhs | rhs);
  }

  @Override
  public Object doOrEquals(final long lhs, final short rhs) throws Throwable {
    return NgLong.valueOf(lhs | rhs);
  }

  @Override
  public Object doOrEquals(final long lhs, final int rhs) throws Throwable {
    return NgLong.valueOf(lhs | rhs);
  }

  @Override
  public Object doOrEquals(final long lhs, final long rhs) throws Throwable {
    return NgLong.valueOf(lhs | rhs);
  }

  @Override
  public Object doOrEquals(final long lhs, final BigInteger rhs) throws Throwable {
    return BigInteger.valueOf(lhs).or(rhs);
  }

  @Override
  public Object doOrEquals(final Object lhs, final byte rhs) throws Throwable {
    return doOrEquals(((NgLong)lhs).getLongValue(), rhs);
  }

  @Override
  public Object doOrEquals(final Object lhs, final char rhs) throws Throwable {
    return doOrEquals(((NgLong)lhs).getLongValue(), rhs);
  }

  @Override
  public Object doOrEquals(final Object lhs, final short rhs) throws Throwable {
    return doOrEquals(((NgLong)lhs).getLongValue(), rhs);
  }

  @Override
  public Object doOrEquals(final Object lhs, final int rhs) throws Throwable {
    return doOrEquals(((NgLong)lhs).getLongValue(), rhs);
  }

  @Override
  public Object doOrEquals(final Object lhs, final long rhs) throws Throwable {
    return doOrEquals(((NgLong)lhs).getLongValue(), rhs);
  }

  @Override
  public Object doOrEquals(final Object lhs, final BigInteger rhs) throws Throwable {
    return doOrEquals(((NgLong)lhs).getLongValue(), rhs);
  }

  @Override
  public Object doReverseOrEquals(final byte lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(byte.class).doOrEquals(lhs, ((NgLong)rhs).getLongValue());
  }

  @Override
  public Object doReverseOrEquals(final char lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(char.class).doOrEquals(lhs, ((NgLong)rhs).getLongValue());
  }

  @Override
  public Object doReverseOrEquals(final short lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(short.class).doOrEquals(lhs, ((NgLong)rhs).getLongValue());
  }

  @Override
  public Object doReverseOrEquals(final int lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(int.class).doOrEquals(lhs, ((NgLong)rhs).getLongValue());
  }

  @Override
  public Object doReverseOrEquals(final long lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(long.class).doOrEquals(lhs, ((NgLong)rhs).getLongValue());
  }

  @Override
  public Object doReverseOrEquals(final BigInteger lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(BigInteger.class).doOrEquals(lhs, ((NgLong)rhs).getLongValue());
  }

  @Override
  public Object doXor(final Object lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseXor(((NgLong)lhs).getLongValue(), rhs);
  }

  @Override
  public Object doXor(final long lhs, final byte rhs) throws Throwable {
    return NgLong.valueOf(lhs ^ rhs);
  }

  @Override
  public Object doXor(final long lhs, final char rhs) throws Throwable {
    return NgLong.valueOf(lhs ^ rhs);
  }

  @Override
  public Object doXor(final long lhs, final short rhs) throws Throwable {
    return NgLong.valueOf(lhs ^ rhs);
  }

  @Override
  public Object doXor(final long lhs, final int rhs) throws Throwable {
    return NgLong.valueOf(lhs ^ rhs);
  }

  @Override
  public Object doXor(final long lhs, final long rhs) throws Throwable {
    return NgLong.valueOf(lhs ^ rhs);
  }

  @Override
  public Object doXor(final long lhs, final BigInteger rhs) throws Throwable {
    return BigInteger.valueOf(lhs).xor(rhs);
  }

  @Override
  public Object doXor(final Object lhs, final byte rhs) throws Throwable {
    return doXor(((NgLong)lhs).getLongValue(), rhs);
  }

  @Override
  public Object doXor(final Object lhs, final char rhs) throws Throwable {
    return doXor(((NgLong)lhs).getLongValue(), rhs);
  }

  @Override
  public Object doXor(final Object lhs, final short rhs) throws Throwable {
    return doXor(((NgLong)lhs).getLongValue(), rhs);
  }

  @Override
  public Object doXor(final Object lhs, final int rhs) throws Throwable {
    return doXor(((NgLong)lhs).getLongValue(), rhs);
  }

  @Override
  public Object doXor(final Object lhs, final long rhs) throws Throwable {
    return doXor(((NgLong)lhs).getLongValue(), rhs);
  }

  @Override
  public Object doXor(final Object lhs, final BigInteger rhs) throws Throwable {
    return doXor(((NgLong)lhs).getLongValue(), rhs);
  }

  @Override
  public Object doReverseXor(final byte lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(byte.class).doXor(lhs, ((NgLong)rhs).getLongValue());
  }

  @Override
  public Object doReverseXor(final char lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(char.class).doXor(lhs, ((NgLong)rhs).getLongValue());
  }

  @Override
  public Object doReverseXor(final short lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(short.class).doXor(lhs, ((NgLong)rhs).getLongValue());
  }

  @Override
  public Object doReverseXor(final int lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(int.class).doXor(lhs, ((NgLong)rhs).getLongValue());
  }

  @Override
  public Object doReverseXor(final long lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(long.class).doXor(lhs, ((NgLong)rhs).getLongValue());
  }

  @Override
  public Object doReverseXor(final BigInteger lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(BigInteger.class).doXor(lhs, ((NgLong)rhs).getLongValue());
  }

  @Override
  public Object doXorEquals(final Object lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseXorEquals(((NgLong)lhs).getLongValue(), rhs);
  }

  @Override
  public Object doXorEquals(final long lhs, final byte rhs) throws Throwable {
    return NgLong.valueOf(lhs ^ rhs);
  }

  @Override
  public Object doXorEquals(final long lhs, final char rhs) throws Throwable {
    return NgLong.valueOf(lhs ^ rhs);
  }

  @Override
  public Object doXorEquals(final long lhs, final short rhs) throws Throwable {
    return NgLong.valueOf(lhs ^ rhs);
  }

  @Override
  public Object doXorEquals(final long lhs, final int rhs) throws Throwable {
    return NgLong.valueOf(lhs ^ rhs);
  }

  @Override
  public Object doXorEquals(final long lhs, final long rhs) throws Throwable {
    return NgLong.valueOf(lhs ^ rhs);
  }

  @Override
  public Object doXorEquals(final long lhs, final BigInteger rhs) throws Throwable {
    return BigInteger.valueOf(lhs).xor(rhs);
  }

  @Override
  public Object doXorEquals(final Object lhs, final byte rhs) throws Throwable {
    return doXorEquals(((NgLong)lhs).getLongValue(), rhs);
  }

  @Override
  public Object doXorEquals(final Object lhs, final char rhs) throws Throwable {
    return doXorEquals(((NgLong)lhs).getLongValue(), rhs);
  }

  @Override
  public Object doXorEquals(final Object lhs, final short rhs) throws Throwable {
    return doXorEquals(((NgLong)lhs).getLongValue(), rhs);
  }

  @Override
  public Object doXorEquals(final Object lhs, final int rhs) throws Throwable {
    return doXorEquals(((NgLong)lhs).getLongValue(), rhs);
  }

  @Override
  public Object doXorEquals(final Object lhs, final long rhs) throws Throwable {
    return doXorEquals(((NgLong)lhs).getLongValue(), rhs);
  }

  @Override
  public Object doXorEquals(final Object lhs, final BigInteger rhs) throws Throwable {
    return doXorEquals(((NgLong)lhs).getLongValue(), rhs);
  }

  @Override
  public Object doReverseXorEquals(final byte lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(byte.class).doXorEquals(lhs, ((NgLong)rhs).getLongValue());
  }

  @Override
  public Object doReverseXorEquals(final char lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(char.class).doXorEquals(lhs, ((NgLong)rhs).getLongValue());
  }

  @Override
  public Object doReverseXorEquals(final short lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(short.class).doXorEquals(lhs, ((NgLong)rhs).getLongValue());
  }

  @Override
  public Object doReverseXorEquals(final int lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(int.class).doXorEquals(lhs, ((NgLong)rhs).getLongValue());
  }

  @Override
  public Object doReverseXorEquals(final long lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(long.class).doXorEquals(lhs, ((NgLong)rhs).getLongValue());
  }

  @Override
  public Object doReverseXorEquals(final BigInteger lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(BigInteger.class).doXorEquals(lhs, ((NgLong)rhs).getLongValue());
  }

  @Override
  public Object doLeftShift(final Object lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseLeftShift(((NgLong)lhs).getLongValue(), rhs);
  }

  @Override
  public Object doLeftShift(final long lhs, final byte rhs) throws Throwable {
    return NgLong.valueOf(lhs << rhs);
  }

  @Override
  public Object doLeftShift(final long lhs, final char rhs) throws Throwable {
    return NgLong.valueOf(lhs << rhs);
  }

  @Override
  public Object doLeftShift(final long lhs, final short rhs) throws Throwable {
    return NgLong.valueOf(lhs << rhs);
  }

  @Override
  public Object doLeftShift(final long lhs, final int rhs) throws Throwable {
    return NgLong.valueOf(lhs << rhs);
  }

  @Override
  public Object doLeftShift(final long lhs, final long rhs) throws Throwable {
    return NgLong.valueOf(lhs << rhs);
  }

  @Override
  public Object doLeftShift(final long lhs, final BigInteger rhs) throws Throwable {
    return NgLong.valueOf(lhs << rhs.intValue());
  }

  @Override
  public Object doLeftShift(final Object lhs, final byte rhs) throws Throwable {
    return doLeftShift(((NgLong)lhs).getLongValue(), rhs);
  }

  @Override
  public Object doLeftShift(final Object lhs, final char rhs) throws Throwable {
    return doLeftShift(((NgLong)lhs).getLongValue(), rhs);
  }

  @Override
  public Object doLeftShift(final Object lhs, final short rhs) throws Throwable {
    return doLeftShift(((NgLong)lhs).getLongValue(), rhs);
  }

  @Override
  public Object doLeftShift(final Object lhs, final int rhs) throws Throwable {
    return doLeftShift(((NgLong)lhs).getLongValue(), rhs);
  }

  @Override
  public Object doLeftShift(final Object lhs, final long rhs) throws Throwable {
    return doLeftShift(((NgLong)lhs).getLongValue(), rhs);
  }

  @Override
  public Object doLeftShift(final Object lhs, final BigInteger rhs) throws Throwable {
    return doLeftShift(((NgLong)lhs).getLongValue(), rhs);
  }

  @Override
  public Object doReverseLeftShift(final byte lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(byte.class).doLeftShift(lhs, ((NgLong)rhs).getLongValue());
  }

  @Override
  public Object doReverseLeftShift(final char lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(char.class).doLeftShift(lhs, ((NgLong)rhs).getLongValue());
  }

  @Override
  public Object doReverseLeftShift(final short lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(short.class).doLeftShift(lhs, ((NgLong)rhs).getLongValue());
  }

  @Override
  public Object doReverseLeftShift(final int lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(int.class).doLeftShift(lhs, ((NgLong)rhs).getLongValue());
  }

  @Override
  public Object doReverseLeftShift(final long lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(long.class).doLeftShift(lhs, ((NgLong)rhs).getLongValue());
  }

  @Override
  public Object doReverseLeftShift(final BigInteger lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(BigInteger.class).doLeftShift(lhs, ((NgLong)rhs).getLongValue());
  }

  @Override
  public Object doLeftShiftEquals(final Object lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseLeftShiftEquals(((NgLong)lhs).getLongValue(), rhs);
  }

  @Override
  public Object doLeftShiftEquals(final long lhs, final byte rhs) throws Throwable {
    return NgLong.valueOf(lhs << rhs);
  }

  @Override
  public Object doLeftShiftEquals(final long lhs, final char rhs) throws Throwable {
    return NgLong.valueOf(lhs << rhs);
  }

  @Override
  public Object doLeftShiftEquals(final long lhs, final short rhs) throws Throwable {
    return NgLong.valueOf(lhs << rhs);
  }

  @Override
  public Object doLeftShiftEquals(final long lhs, final int rhs) throws Throwable {
    return NgLong.valueOf(lhs << rhs);
  }

  @Override
  public Object doLeftShiftEquals(final long lhs, final long rhs) throws Throwable {
    return NgLong.valueOf(lhs << rhs);
  }

  @Override
  public Object doLeftShiftEquals(final long lhs, final BigInteger rhs) throws Throwable {
    return NgLong.valueOf(lhs << rhs.intValue());
  }

  @Override
  public Object doLeftShiftEquals(final Object lhs, final byte rhs) throws Throwable {
    return doLeftShiftEquals(((NgLong)lhs).getLongValue(), rhs);
  }

  @Override
  public Object doLeftShiftEquals(final Object lhs, final char rhs) throws Throwable {
    return doLeftShiftEquals(((NgLong)lhs).getLongValue(), rhs);
  }

  @Override
  public Object doLeftShiftEquals(final Object lhs, final short rhs) throws Throwable {
    return doLeftShiftEquals(((NgLong)lhs).getLongValue(), rhs);
  }

  @Override
  public Object doLeftShiftEquals(final Object lhs, final int rhs) throws Throwable {
    return doLeftShiftEquals(((NgLong)lhs).getLongValue(), rhs);
  }

  @Override
  public Object doLeftShiftEquals(final Object lhs, final long rhs) throws Throwable {
    return doLeftShiftEquals(((NgLong)lhs).getLongValue(), rhs);
  }

  @Override
  public Object doLeftShiftEquals(final Object lhs, final BigInteger rhs) throws Throwable {
    return doLeftShiftEquals(((NgLong)lhs).getLongValue(), rhs);
  }

  @Override
  public Object doReverseLeftShiftEquals(final byte lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(byte.class).doLeftShiftEquals(lhs, ((NgLong)rhs).getLongValue());
  }

  @Override
  public Object doReverseLeftShiftEquals(final char lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(char.class).doLeftShiftEquals(lhs, ((NgLong)rhs).getLongValue());
  }

  @Override
  public Object doReverseLeftShiftEquals(final short lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(short.class).doLeftShiftEquals(lhs, ((NgLong)rhs).getLongValue());
  }

  @Override
  public Object doReverseLeftShiftEquals(final int lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(int.class).doLeftShiftEquals(lhs, ((NgLong)rhs).getLongValue());
  }

  @Override
  public Object doReverseLeftShiftEquals(final long lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(long.class).doLeftShiftEquals(lhs, ((NgLong)rhs).getLongValue());
  }

  @Override
  public Object doReverseLeftShiftEquals(final BigInteger lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(BigInteger.class).doLeftShiftEquals(lhs, ((NgLong)rhs).getLongValue());
  }

  @Override
  public Object doArithmeticRightShift(final Object lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseArithmeticRightShift(((NgLong)lhs).getLongValue(), rhs);
  }

  @Override
  public Object doArithmeticRightShift(final long lhs, final byte rhs) throws Throwable {
    return NgLong.valueOf(lhs >> rhs);
  }

  @Override
  public Object doArithmeticRightShift(final long lhs, final char rhs) throws Throwable {
    return NgLong.valueOf(lhs >> rhs);
  }

  @Override
  public Object doArithmeticRightShift(final long lhs, final short rhs) throws Throwable {
    return NgLong.valueOf(lhs >> rhs);
  }

  @Override
  public Object doArithmeticRightShift(final long lhs, final int rhs) throws Throwable {
    return NgLong.valueOf(lhs >> rhs);
  }

  @Override
  public Object doArithmeticRightShift(final long lhs, final long rhs) throws Throwable {
    return NgLong.valueOf(lhs >> rhs);
  }

  @Override
  public Object doArithmeticRightShift(final long lhs, final BigInteger rhs) throws Throwable {
    return NgLong.valueOf(lhs >> rhs.intValue());
  }

  @Override
  public Object doArithmeticRightShift(final Object lhs, final byte rhs) throws Throwable {
    return doArithmeticRightShift(((NgLong)lhs).getLongValue(), rhs);
  }

  @Override
  public Object doArithmeticRightShift(final Object lhs, final char rhs) throws Throwable {
    return doArithmeticRightShift(((NgLong)lhs).getLongValue(), rhs);
  }

  @Override
  public Object doArithmeticRightShift(final Object lhs, final short rhs) throws Throwable {
    return doArithmeticRightShift(((NgLong)lhs).getLongValue(), rhs);
  }

  @Override
  public Object doArithmeticRightShift(final Object lhs, final int rhs) throws Throwable {
    return doArithmeticRightShift(((NgLong)lhs).getLongValue(), rhs);
  }

  @Override
  public Object doArithmeticRightShift(final Object lhs, final long rhs) throws Throwable {
    return doArithmeticRightShift(((NgLong)lhs).getLongValue(), rhs);
  }

  @Override
  public Object doArithmeticRightShift(final Object lhs, final BigInteger rhs) throws Throwable {
    return doArithmeticRightShift(((NgLong)lhs).getLongValue(), rhs);
  }

  @Override
  public Object doReverseArithmeticRightShift(final byte lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(byte.class).doArithmeticRightShift(lhs, ((NgLong)rhs).getLongValue());
  }

  @Override
  public Object doReverseArithmeticRightShift(final char lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(char.class).doArithmeticRightShift(lhs, ((NgLong)rhs).getLongValue());
  }

  @Override
  public Object doReverseArithmeticRightShift(final short lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(short.class).doArithmeticRightShift(lhs, ((NgLong)rhs).getLongValue());
  }

  @Override
  public Object doReverseArithmeticRightShift(final int lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(int.class).doArithmeticRightShift(lhs, ((NgLong)rhs).getLongValue());
  }

  @Override
  public Object doReverseArithmeticRightShift(final long lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(long.class).doArithmeticRightShift(lhs, ((NgLong)rhs).getLongValue());
  }

  @Override
  public Object doReverseArithmeticRightShift(final BigInteger lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(BigInteger.class).doArithmeticRightShift(lhs, ((NgLong)rhs).getLongValue());
  }

  @Override
  public Object doArithmeticRightShiftEquals(final Object lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseArithmeticRightShiftEquals(((NgLong)lhs).getLongValue(), rhs);
  }

  @Override
  public Object doArithmeticRightShiftEquals(final long lhs, final byte rhs) throws Throwable {
    return NgLong.valueOf(lhs >> rhs);
  }

  @Override
  public Object doArithmeticRightShiftEquals(final long lhs, final char rhs) throws Throwable {
    return NgLong.valueOf(lhs >> rhs);
  }

  @Override
  public Object doArithmeticRightShiftEquals(final long lhs, final short rhs) throws Throwable {
    return NgLong.valueOf(lhs >> rhs);
  }

  @Override
  public Object doArithmeticRightShiftEquals(final long lhs, final int rhs) throws Throwable {
    return NgLong.valueOf(lhs >> rhs);
  }

  @Override
  public Object doArithmeticRightShiftEquals(final long lhs, final long rhs) throws Throwable {
    return NgLong.valueOf(lhs >> rhs);
  }

  @Override
  public Object doArithmeticRightShiftEquals(final long lhs, final BigInteger rhs) throws Throwable {
    return NgLong.valueOf(lhs >> rhs.intValue());
  }

  @Override
  public Object doArithmeticRightShiftEquals(final Object lhs, final byte rhs) throws Throwable {
    return doArithmeticRightShiftEquals(((NgLong)lhs).getLongValue(), rhs);
  }

  @Override
  public Object doArithmeticRightShiftEquals(final Object lhs, final char rhs) throws Throwable {
    return doArithmeticRightShiftEquals(((NgLong)lhs).getLongValue(), rhs);
  }

  @Override
  public Object doArithmeticRightShiftEquals(final Object lhs, final short rhs) throws Throwable {
    return doArithmeticRightShiftEquals(((NgLong)lhs).getLongValue(), rhs);
  }

  @Override
  public Object doArithmeticRightShiftEquals(final Object lhs, final int rhs) throws Throwable {
    return doArithmeticRightShiftEquals(((NgLong)lhs).getLongValue(), rhs);
  }

  @Override
  public Object doArithmeticRightShiftEquals(final Object lhs, final long rhs) throws Throwable {
    return doArithmeticRightShiftEquals(((NgLong)lhs).getLongValue(), rhs);
  }

  @Override
  public Object doArithmeticRightShiftEquals(final Object lhs, final BigInteger rhs) throws Throwable {
    return doArithmeticRightShiftEquals(((NgLong)lhs).getLongValue(), rhs);
  }

  @Override
  public Object doReverseArithmeticRightShiftEquals(final byte lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(byte.class).doArithmeticRightShiftEquals(lhs, ((NgLong)rhs).getLongValue());
  }

  @Override
  public Object doReverseArithmeticRightShiftEquals(final char lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(char.class).doArithmeticRightShiftEquals(lhs, ((NgLong)rhs).getLongValue());
  }

  @Override
  public Object doReverseArithmeticRightShiftEquals(final short lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(short.class).doArithmeticRightShiftEquals(lhs, ((NgLong)rhs).getLongValue());
  }

  @Override
  public Object doReverseArithmeticRightShiftEquals(final int lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(int.class).doArithmeticRightShiftEquals(lhs, ((NgLong)rhs).getLongValue());
  }

  @Override
  public Object doReverseArithmeticRightShiftEquals(final long lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(long.class).doArithmeticRightShiftEquals(lhs, ((NgLong)rhs).getLongValue());
  }

  @Override
  public Object doReverseArithmeticRightShiftEquals(final BigInteger lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(BigInteger.class).doArithmeticRightShiftEquals(lhs, ((NgLong)rhs).getLongValue());
  }

  @Override
  public Object doLogicalRightShift(final Object lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseLogicalRightShift(((NgLong)lhs).getLongValue(), rhs);
  }

  @Override
  public Object doLogicalRightShift(final long lhs, final byte rhs) throws Throwable {
    return NgLong.valueOf(lhs >>> rhs);
  }

  @Override
  public Object doLogicalRightShift(final long lhs, final char rhs) throws Throwable {
    return NgLong.valueOf(lhs >>> rhs);
  }

  @Override
  public Object doLogicalRightShift(final long lhs, final short rhs) throws Throwable {
    return NgLong.valueOf(lhs >>> rhs);
  }

  @Override
  public Object doLogicalRightShift(final long lhs, final int rhs) throws Throwable {
    return NgLong.valueOf(lhs >>> rhs);
  }

  @Override
  public Object doLogicalRightShift(final long lhs, final long rhs) throws Throwable {
    return NgLong.valueOf(lhs >>> rhs);
  }

  @Override
  public Object doLogicalRightShift(final long lhs, final BigInteger rhs) throws Throwable {
    return NgLong.valueOf(lhs >>> rhs.intValue());
  }

  @Override
  public Object doLogicalRightShift(final Object lhs, final byte rhs) throws Throwable {
    return doLogicalRightShift(((NgLong)lhs).getLongValue(), rhs);
  }

  @Override
  public Object doLogicalRightShift(final Object lhs, final char rhs) throws Throwable {
    return doLogicalRightShift(((NgLong)lhs).getLongValue(), rhs);
  }

  @Override
  public Object doLogicalRightShift(final Object lhs, final short rhs) throws Throwable {
    return doLogicalRightShift(((NgLong)lhs).getLongValue(), rhs);
  }

  @Override
  public Object doLogicalRightShift(final Object lhs, final int rhs) throws Throwable {
    return doLogicalRightShift(((NgLong)lhs).getLongValue(), rhs);
  }

  @Override
  public Object doLogicalRightShift(final Object lhs, final long rhs) throws Throwable {
    return doLogicalRightShift(((NgLong)lhs).getLongValue(), rhs);
  }

  @Override
  public Object doLogicalRightShift(final Object lhs, final BigInteger rhs) throws Throwable {
    return doLogicalRightShift(((NgLong)lhs).getLongValue(), rhs);
  }

  @Override
  public Object doReverseLogicalRightShift(final byte lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(byte.class).doLogicalRightShift(lhs, ((NgLong)rhs).getLongValue());
  }

  @Override
  public Object doReverseLogicalRightShift(final char lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(char.class).doLogicalRightShift(lhs, ((NgLong)rhs).getLongValue());
  }

  @Override
  public Object doReverseLogicalRightShift(final short lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(short.class).doLogicalRightShift(lhs, ((NgLong)rhs).getLongValue());
  }

  @Override
  public Object doReverseLogicalRightShift(final int lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(int.class).doLogicalRightShift(lhs, ((NgLong)rhs).getLongValue());
  }

  @Override
  public Object doReverseLogicalRightShift(final long lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(long.class).doLogicalRightShift(lhs, ((NgLong)rhs).getLongValue());
  }

  @Override
  public Object doLogicalRightShiftEquals(final Object lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseLogicalRightShiftEquals(((NgLong)lhs).getLongValue(), rhs);
  }

  @Override
  public Object doLogicalRightShiftEquals(final long lhs, final byte rhs) throws Throwable {
    return NgLong.valueOf(lhs >>> rhs);
  }

  @Override
  public Object doLogicalRightShiftEquals(final long lhs, final char rhs) throws Throwable {
    return NgLong.valueOf(lhs >>> rhs);
  }

  @Override
  public Object doLogicalRightShiftEquals(final long lhs, final short rhs) throws Throwable {
    return NgLong.valueOf(lhs >>> rhs);
  }

  @Override
  public Object doLogicalRightShiftEquals(final long lhs, final int rhs) throws Throwable {
    return NgLong.valueOf(lhs >>> rhs);
  }

  @Override
  public Object doLogicalRightShiftEquals(final long lhs, final long rhs) throws Throwable {
    return NgLong.valueOf(lhs >>> rhs);
  }

  @Override
  public Object doLogicalRightShiftEquals(final long lhs, final BigInteger rhs) throws Throwable {
    return NgLong.valueOf(lhs >>> rhs.intValue());
  }

  @Override
  public Object doLogicalRightShiftEquals(final Object lhs, final byte rhs) throws Throwable {
    return doLogicalRightShiftEquals(((NgLong)lhs).getLongValue(), rhs);
  }

  @Override
  public Object doLogicalRightShiftEquals(final Object lhs, final char rhs) throws Throwable {
    return doLogicalRightShiftEquals(((NgLong)lhs).getLongValue(), rhs);
  }

  @Override
  public Object doLogicalRightShiftEquals(final Object lhs, final short rhs) throws Throwable {
    return doLogicalRightShiftEquals(((NgLong)lhs).getLongValue(), rhs);
  }

  @Override
  public Object doLogicalRightShiftEquals(final Object lhs, final int rhs) throws Throwable {
    return doLogicalRightShiftEquals(((NgLong)lhs).getLongValue(), rhs);
  }

  @Override
  public Object doLogicalRightShiftEquals(final Object lhs, final long rhs) throws Throwable {
    return doLogicalRightShiftEquals(((NgLong)lhs).getLongValue(), rhs);
  }

  @Override
  public Object doLogicalRightShiftEquals(final Object lhs, final BigInteger rhs) throws Throwable {
    return doLogicalRightShiftEquals(((NgLong)lhs).getLongValue(), rhs);
  }

  @Override
  public Object doReverseLogicalRightShiftEquals(final byte lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(byte.class).doLogicalRightShiftEquals(lhs, ((NgLong)rhs).getLongValue());
  }

  @Override
  public Object doReverseLogicalRightShiftEquals(final char lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(char.class).doLogicalRightShiftEquals(lhs, ((NgLong)rhs).getLongValue());
  }

  @Override
  public Object doReverseLogicalRightShiftEquals(final short lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(short.class).doLogicalRightShiftEquals(lhs, ((NgLong)rhs).getLongValue());
  }

  @Override
  public Object doReverseLogicalRightShiftEquals(final int lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(int.class).doLogicalRightShiftEquals(lhs, ((NgLong)rhs).getLongValue());
  }

  @Override
  public Object doReverseLogicalRightShiftEquals(final long lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(long.class).doLogicalRightShiftEquals(lhs, ((NgLong)rhs).getLongValue());
  }

  @Override
  public Object doCompare(final Object lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseCompare(((NgLong)lhs).getLongValue(), rhs);
  }

  @Override
  public Object doCompare(final long lhs, final byte rhs) throws Throwable {
    if (lhs == rhs) return NgInt.ZERO;
    if (lhs < rhs) return NgInt.MINUS_ONE;
    return NgInt.ONE;
  }

  @Override
  public Object doCompare(final long lhs, final char rhs) throws Throwable {
    if (lhs == rhs) return NgInt.ZERO;
    if (lhs < rhs) return NgInt.MINUS_ONE;
    return NgInt.ONE;
  }

  @Override
  public Object doCompare(final long lhs, final short rhs) throws Throwable {
    if (lhs == rhs) return NgInt.ZERO;
    if (lhs < rhs) return NgInt.MINUS_ONE;
    return NgInt.ONE;
  }

  @Override
  public Object doCompare(final long lhs, final int rhs) throws Throwable {
    if (lhs == rhs) return NgInt.ZERO;
    if (lhs < rhs) return NgInt.MINUS_ONE;
    return NgInt.ONE;
  }

  @Override
  public Object doCompare(final long lhs, final long rhs) throws Throwable {
    if (lhs == rhs) return NgInt.ZERO;
    if (lhs < rhs) return NgInt.MINUS_ONE;
    return NgInt.ONE;
  }

  @Override
  public Object doCompare(final long lhs, final float rhs) throws Throwable {
    if (lhs == rhs) return NgInt.ZERO;
    if (lhs < rhs) return NgInt.MINUS_ONE;
    return NgInt.ONE;
  }

  @Override
  public Object doCompare(final long lhs, final double rhs) throws Throwable {
    if (lhs == rhs) return NgInt.ZERO;
    if (lhs < rhs) return NgInt.MINUS_ONE;
    return NgInt.ONE;
  }

  @Override
  public Object doCompare(final long lhs, final BigInteger rhs) throws Throwable {
    return NgInt.valueOf(BigInteger.valueOf(lhs).compareTo(rhs));
  }

  @Override
  public Object doCompare(final long lhs, final BigDecimal rhs) throws Throwable {
    return NgInt.valueOf(new BigDecimal(lhs).compareTo(rhs));
  }

  @Override
  public Object doCompare(final Object lhs, final byte rhs) throws Throwable {
    return doCompare(((NgLong)lhs).getLongValue(), rhs);
  }

  @Override
  public Object doCompare(final Object lhs, final char rhs) throws Throwable {
    return doCompare(((NgLong)lhs).getLongValue(), rhs);
  }

  @Override
  public Object doCompare(final Object lhs, final short rhs) throws Throwable {
    return doCompare(((NgLong)lhs).getLongValue(), rhs);
  }

  @Override
  public Object doCompare(final Object lhs, final int rhs) throws Throwable {
    return doCompare(((NgLong)lhs).getLongValue(), rhs);
  }

  @Override
  public Object doCompare(final Object lhs, final long rhs) throws Throwable {
    return doCompare(((NgLong)lhs).getLongValue(), rhs);
  }

  @Override
  public Object doCompare(final Object lhs, final float rhs) throws Throwable {
    return doCompare(((NgLong)lhs).getLongValue(), rhs);
  }

  @Override
  public Object doCompare(final Object lhs, final double rhs) throws Throwable {
    return doCompare(((NgLong)lhs).getLongValue(), rhs);
  }

  @Override
  public Object doCompare(final Object lhs, final BigInteger rhs) throws Throwable {
    return doCompare(((NgLong)lhs).getLongValue(), rhs);
  }

  @Override
  public Object doCompare(final Object lhs, final BigDecimal rhs) throws Throwable {
    return doCompare(((NgLong)lhs).getLongValue(), rhs);
  }

  @Override
  public Object doReverseCompare(final byte lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(byte.class).doCompare(lhs, ((NgLong)rhs).getLongValue());
  }

  @Override
  public Object doReverseCompare(final char lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(char.class).doCompare(lhs, ((NgLong)rhs).getLongValue());
  }

  @Override
  public Object doReverseCompare(final short lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(short.class).doCompare(lhs, ((NgLong)rhs).getLongValue());
  }

  @Override
  public Object doReverseCompare(final int lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(int.class).doCompare(lhs, ((NgLong)rhs).getLongValue());
  }

  @Override
  public Object doReverseCompare(final long lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(long.class).doCompare(lhs, ((NgLong)rhs).getLongValue());
  }

  @Override
  public Object doReverseCompare(final float lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(float.class).doCompare(lhs, ((NgLong)rhs).getLongValue());
  }

  @Override
  public Object doReverseCompare(final double lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(double.class).doCompare(lhs, ((NgLong)rhs).getLongValue());
  }

  @Override
  public Object doReverseCompare(final BigInteger lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(BigInteger.class).doCompare(lhs, ((NgLong)rhs).getLongValue());
  }

  @Override
  public Object doReverseCompare(final BigDecimal lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(BigDecimal.class).doCompare(lhs, ((NgLong)rhs).getLongValue());
  }

  @Override
  public Object doEquals(final Object lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseEquals(((NgLong)lhs).getLongValue(), rhs);
  }

  @Override
  public Object doEquals(final long lhs, final byte rhs) throws Throwable {
    return (lhs == rhs) ? NgBoolean.TRUE : NgBoolean.FALSE;
  }

  @Override
  public Object doEquals(final long lhs, final char rhs) throws Throwable {
    return (lhs == rhs) ? NgBoolean.TRUE : NgBoolean.FALSE;
  }

  @Override
  public Object doEquals(final long lhs, final short rhs) throws Throwable {
    return (lhs == rhs) ? NgBoolean.TRUE : NgBoolean.FALSE;
  }

  @Override
  public Object doEquals(final long lhs, final int rhs) throws Throwable {
    return (lhs == rhs) ? NgBoolean.TRUE : NgBoolean.FALSE;
  }

  @Override
  public Object doEquals(final long lhs, final long rhs) throws Throwable {
    return (lhs == rhs) ? NgBoolean.TRUE : NgBoolean.FALSE;
  }

  @Override
  public Object doEquals(final long lhs, final float rhs) throws Throwable {
    return (lhs == rhs) ? NgBoolean.TRUE : NgBoolean.FALSE;
  }

  @Override
  public Object doEquals(final long lhs, final double rhs) throws Throwable {
    return (lhs == rhs) ? NgBoolean.TRUE : NgBoolean.FALSE;
  }

  @Override
  public Object doEquals(final long lhs, final BigInteger rhs) throws Throwable {
    return (BigInteger.valueOf(lhs).compareTo(rhs) == 0) ? NgBoolean.TRUE : NgBoolean.FALSE;
  }

  @Override
  public Object doEquals(final long lhs, final BigDecimal rhs) throws Throwable {
    return (new BigDecimal(lhs).compareTo(rhs) == 0) ? NgBoolean.TRUE : NgBoolean.FALSE;
  }

  @Override
  public Object doEquals(final Object lhs, final byte rhs) throws Throwable {
    return doEquals(((NgLong)lhs).getLongValue(), rhs);
  }

  @Override
  public Object doEquals(final Object lhs, final char rhs) throws Throwable {
    return doEquals(((NgLong)lhs).getLongValue(), rhs);
  }

  @Override
  public Object doEquals(final Object lhs, final short rhs) throws Throwable {
    return doEquals(((NgLong)lhs).getLongValue(), rhs);
  }

  @Override
  public Object doEquals(final Object lhs, final int rhs) throws Throwable {
    return doEquals(((NgLong)lhs).getLongValue(), rhs);
  }

  @Override
  public Object doEquals(final Object lhs, final long rhs) throws Throwable {
    return doEquals(((NgLong)lhs).getLongValue(), rhs);
  }

  @Override
  public Object doEquals(final Object lhs, final float rhs) throws Throwable {
    return doEquals(((NgLong)lhs).getLongValue(), rhs);
  }

  @Override
  public Object doEquals(final Object lhs, final double rhs) throws Throwable {
    return doEquals(((NgLong)lhs).getLongValue(), rhs);
  }

  @Override
  public Object doEquals(final Object lhs, final BigInteger rhs) throws Throwable {
    return doEquals(((NgLong)lhs).getLongValue(), rhs);
  }

  @Override
  public Object doEquals(final Object lhs, final BigDecimal rhs) throws Throwable {
    return doEquals(((NgLong)lhs).getLongValue(), rhs);
  }

  @Override
  public Object doReverseEquals(final byte lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(byte.class).doEquals(lhs, ((NgLong)rhs).getLongValue());
  }

  @Override
  public Object doReverseEquals(final char lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(char.class).doEquals(lhs, ((NgLong)rhs).getLongValue());
  }

  @Override
  public Object doReverseEquals(final short lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(short.class).doEquals(lhs, ((NgLong)rhs).getLongValue());
  }

  @Override
  public Object doReverseEquals(final int lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(int.class).doEquals(lhs, ((NgLong)rhs).getLongValue());
  }

  @Override
  public Object doReverseEquals(final long lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(long.class).doEquals(lhs, ((NgLong)rhs).getLongValue());
  }

  @Override
  public Object doReverseEquals(final float lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(float.class).doEquals(lhs, ((NgLong)rhs).getLongValue());
  }

  @Override
  public Object doReverseEquals(final double lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(double.class).doEquals(lhs, ((NgLong)rhs).getLongValue());
  }

  @Override
  public Object doReverseEquals(final BigInteger lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(BigInteger.class).doEquals(lhs, ((NgLong)rhs).getLongValue());
  }

  @Override
  public Object doReverseEquals(final BigDecimal lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(BigDecimal.class).doEquals(lhs, ((NgLong)rhs).getLongValue());
  }

  @Override
  public boolean doEqualsBoolean(final Object lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseEqualsBoolean(((NgLong)lhs).getLongValue(), rhs);
  }

  @Override
  public boolean doEqualsBoolean(final long lhs, final byte rhs) throws Throwable {
    return lhs == rhs;
  }

  @Override
  public boolean doEqualsBoolean(final long lhs, final char rhs) throws Throwable {
    return lhs == rhs;
  }

  @Override
  public boolean doEqualsBoolean(final long lhs, final short rhs) throws Throwable {
    return lhs == rhs;
  }

  @Override
  public boolean doEqualsBoolean(final long lhs, final int rhs) throws Throwable {
    return lhs == rhs;
  }

  @Override
  public boolean doEqualsBoolean(final long lhs, final long rhs) throws Throwable {
    return lhs == rhs;
  }

  @Override
  public boolean doEqualsBoolean(final long lhs, final float rhs) throws Throwable {
    return lhs == rhs;
  }

  @Override
  public boolean doEqualsBoolean(final long lhs, final double rhs) throws Throwable {
    return lhs == rhs;
  }

  @Override
  public boolean doEqualsBoolean(final long lhs, final BigInteger rhs) throws Throwable {
    return BigInteger.valueOf(lhs).compareTo(rhs) == 0;
  }

  @Override
  public boolean doEqualsBoolean(final long lhs, final BigDecimal rhs) throws Throwable {
    return new BigDecimal(lhs).compareTo(rhs) == 0;
  }

  @Override
  public boolean doEqualsBoolean(final Object lhs, final byte rhs) throws Throwable {
    return doEqualsBoolean(((NgLong)lhs).getLongValue(), rhs);
  }

  @Override
  public boolean doEqualsBoolean(final Object lhs, final char rhs) throws Throwable {
    return doEqualsBoolean(((NgLong)lhs).getLongValue(), rhs);
  }

  @Override
  public boolean doEqualsBoolean(final Object lhs, final short rhs) throws Throwable {
    return doEqualsBoolean(((NgLong)lhs).getLongValue(), rhs);
  }

  @Override
  public boolean doEqualsBoolean(final Object lhs, final int rhs) throws Throwable {
    return doEqualsBoolean(((NgLong)lhs).getLongValue(), rhs);
  }

  @Override
  public boolean doEqualsBoolean(final Object lhs, final long rhs) throws Throwable {
    return doEqualsBoolean(((NgLong)lhs).getLongValue(), rhs);
  }

  @Override
  public boolean doEqualsBoolean(final Object lhs, final float rhs) throws Throwable {
    return doEqualsBoolean(((NgLong)lhs).getLongValue(), rhs);
  }

  @Override
  public boolean doEqualsBoolean(final Object lhs, final double rhs) throws Throwable {
    return doEqualsBoolean(((NgLong)lhs).getLongValue(), rhs);
  }

  @Override
  public boolean doEqualsBoolean(final Object lhs, final BigInteger rhs) throws Throwable {
    return doEqualsBoolean(((NgLong)lhs).getLongValue(), rhs);
  }

  @Override
  public boolean doEqualsBoolean(final Object lhs, final BigDecimal rhs) throws Throwable {
    return doEqualsBoolean(((NgLong)lhs).getLongValue(), rhs);
  }

  @Override
  public boolean doReverseEqualsBoolean(final byte lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(byte.class).doEqualsBoolean(lhs, ((NgLong)rhs).getLongValue());
  }

  @Override
  public boolean doReverseEqualsBoolean(final char lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(char.class).doEqualsBoolean(lhs, ((NgLong)rhs).getLongValue());
  }

  @Override
  public boolean doReverseEqualsBoolean(final short lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(short.class).doEqualsBoolean(lhs, ((NgLong)rhs).getLongValue());
  }

  @Override
  public boolean doReverseEqualsBoolean(final int lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(int.class).doEqualsBoolean(lhs, ((NgLong)rhs).getLongValue());
  }

  @Override
  public boolean doReverseEqualsBoolean(final long lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(long.class).doEqualsBoolean(lhs, ((NgLong)rhs).getLongValue());
  }

  @Override
  public boolean doReverseEqualsBoolean(final float lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(float.class).doEqualsBoolean(lhs, ((NgLong)rhs).getLongValue());
  }

  @Override
  public boolean doReverseEqualsBoolean(final double lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(double.class).doEqualsBoolean(lhs, ((NgLong)rhs).getLongValue());
  }

  @Override
  public boolean doReverseEqualsBoolean(final BigInteger lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(BigInteger.class).doEqualsBoolean(lhs, ((NgLong)rhs).getLongValue());
  }

  @Override
  public boolean doReverseEqualsBoolean(final BigDecimal lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(BigDecimal.class).doEqualsBoolean(lhs, ((NgLong)rhs).getLongValue());
  }

  @Override
  public Object doNotEquals(final Object lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseNotEquals(((NgLong)lhs).getLongValue(), rhs);
  }

  @Override
  public Object doNotEquals(final long lhs, final byte rhs) throws Throwable {
    return (lhs != rhs) ? NgBoolean.TRUE : NgBoolean.FALSE;
  }

  @Override
  public Object doNotEquals(final long lhs, final char rhs) throws Throwable {
    return (lhs != rhs) ? NgBoolean.TRUE : NgBoolean.FALSE;
  }

  @Override
  public Object doNotEquals(final long lhs, final short rhs) throws Throwable {
    return (lhs != rhs) ? NgBoolean.TRUE : NgBoolean.FALSE;
  }

  @Override
  public Object doNotEquals(final long lhs, final int rhs) throws Throwable {
    return (lhs != rhs) ? NgBoolean.TRUE : NgBoolean.FALSE;
  }

  @Override
  public Object doNotEquals(final long lhs, final long rhs) throws Throwable {
    return (lhs != rhs) ? NgBoolean.TRUE : NgBoolean.FALSE;
  }

  @Override
  public Object doNotEquals(final long lhs, final float rhs) throws Throwable {
    return (lhs != rhs) ? NgBoolean.TRUE : NgBoolean.FALSE;
  }

  @Override
  public Object doNotEquals(final long lhs, final double rhs) throws Throwable {
    return (lhs != rhs) ? NgBoolean.TRUE : NgBoolean.FALSE;
  }

  @Override
  public Object doNotEquals(final long lhs, final BigInteger rhs) throws Throwable {
    return (BigInteger.valueOf(lhs).compareTo(rhs) != 0) ? NgBoolean.TRUE : NgBoolean.FALSE;
  }

  @Override
  public Object doNotEquals(final long lhs, final BigDecimal rhs) throws Throwable {
    return (new BigDecimal(lhs).compareTo(rhs) != 0) ? NgBoolean.TRUE : NgBoolean.FALSE;
  }

  @Override
  public Object doNotEquals(final Object lhs, final byte rhs) throws Throwable {
    return doNotEquals(((NgLong)lhs).getLongValue(), rhs);
  }

  @Override
  public Object doNotEquals(final Object lhs, final char rhs) throws Throwable {
    return doNotEquals(((NgLong)lhs).getLongValue(), rhs);
  }

  @Override
  public Object doNotEquals(final Object lhs, final short rhs) throws Throwable {
    return doNotEquals(((NgLong)lhs).getLongValue(), rhs);
  }

  @Override
  public Object doNotEquals(final Object lhs, final int rhs) throws Throwable {
    return doNotEquals(((NgLong)lhs).getLongValue(), rhs);
  }

  @Override
  public Object doNotEquals(final Object lhs, final long rhs) throws Throwable {
    return doNotEquals(((NgLong)lhs).getLongValue(), rhs);
  }

  @Override
  public Object doNotEquals(final Object lhs, final float rhs) throws Throwable {
    return doNotEquals(((NgLong)lhs).getLongValue(), rhs);
  }

  @Override
  public Object doNotEquals(final Object lhs, final double rhs) throws Throwable {
    return doNotEquals(((NgLong)lhs).getLongValue(), rhs);
  }

  @Override
  public Object doNotEquals(final Object lhs, final BigInteger rhs) throws Throwable {
    return doNotEquals(((NgLong)lhs).getLongValue(), rhs);
  }

  @Override
  public Object doNotEquals(final Object lhs, final BigDecimal rhs) throws Throwable {
    return doNotEquals(((NgLong)lhs).getLongValue(), rhs);
  }

  @Override
  public Object doReverseNotEquals(final byte lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(byte.class).doNotEquals(lhs, ((NgLong)rhs).getLongValue());
  }

  @Override
  public Object doReverseNotEquals(final char lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(char.class).doNotEquals(lhs, ((NgLong)rhs).getLongValue());
  }

  @Override
  public Object doReverseNotEquals(final short lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(short.class).doNotEquals(lhs, ((NgLong)rhs).getLongValue());
  }

  @Override
  public Object doReverseNotEquals(final int lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(int.class).doNotEquals(lhs, ((NgLong)rhs).getLongValue());
  }

  @Override
  public Object doReverseNotEquals(final long lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(long.class).doNotEquals(lhs, ((NgLong)rhs).getLongValue());
  }

  @Override
  public Object doReverseNotEquals(final float lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(float.class).doNotEquals(lhs, ((NgLong)rhs).getLongValue());
  }

  @Override
  public Object doReverseNotEquals(final double lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(double.class).doNotEquals(lhs, ((NgLong)rhs).getLongValue());
  }

  @Override
  public Object doReverseNotEquals(final BigInteger lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(BigInteger.class).doNotEquals(lhs, ((NgLong)rhs).getLongValue());
  }

  @Override
  public Object doReverseNotEquals(final BigDecimal lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(BigDecimal.class).doNotEquals(lhs, ((NgLong)rhs).getLongValue());
  }

  @Override
  public boolean doNotEqualsBoolean(final Object lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseNotEqualsBoolean(((NgLong)lhs).getLongValue(), rhs);
  }

  @Override
  public boolean doNotEqualsBoolean(final long lhs, final byte rhs) throws Throwable {
    return lhs != rhs;
  }

  @Override
  public boolean doNotEqualsBoolean(final long lhs, final char rhs) throws Throwable {
    return lhs != rhs;
  }

  @Override
  public boolean doNotEqualsBoolean(final long lhs, final short rhs) throws Throwable {
    return lhs != rhs;
  }

  @Override
  public boolean doNotEqualsBoolean(final long lhs, final int rhs) throws Throwable {
    return lhs != rhs;
  }

  @Override
  public boolean doNotEqualsBoolean(final long lhs, final long rhs) throws Throwable {
    return lhs != rhs;
  }

  @Override
  public boolean doNotEqualsBoolean(final long lhs, final float rhs) throws Throwable {
    return lhs != rhs;
  }

  @Override
  public boolean doNotEqualsBoolean(final long lhs, final double rhs) throws Throwable {
    return lhs != rhs;
  }

  @Override
  public boolean doNotEqualsBoolean(final long lhs, final BigInteger rhs) throws Throwable {
    return BigInteger.valueOf(lhs).compareTo(rhs) != 0;
  }

  @Override
  public boolean doNotEqualsBoolean(final long lhs, final BigDecimal rhs) throws Throwable {
    return new BigDecimal(lhs).compareTo(rhs) != 0;
  }

  @Override
  public boolean doNotEqualsBoolean(final Object lhs, final byte rhs) throws Throwable {
    return doNotEqualsBoolean(((NgLong)lhs).getLongValue(), rhs);
  }

  @Override
  public boolean doNotEqualsBoolean(final Object lhs, final char rhs) throws Throwable {
    return doNotEqualsBoolean(((NgLong)lhs).getLongValue(), rhs);
  }

  @Override
  public boolean doNotEqualsBoolean(final Object lhs, final short rhs) throws Throwable {
    return doNotEqualsBoolean(((NgLong)lhs).getLongValue(), rhs);
  }

  @Override
  public boolean doNotEqualsBoolean(final Object lhs, final int rhs) throws Throwable {
    return doNotEqualsBoolean(((NgLong)lhs).getLongValue(), rhs);
  }

  @Override
  public boolean doNotEqualsBoolean(final Object lhs, final long rhs) throws Throwable {
    return doNotEqualsBoolean(((NgLong)lhs).getLongValue(), rhs);
  }

  @Override
  public boolean doNotEqualsBoolean(final Object lhs, final float rhs) throws Throwable {
    return doNotEqualsBoolean(((NgLong)lhs).getLongValue(), rhs);
  }

  @Override
  public boolean doNotEqualsBoolean(final Object lhs, final double rhs) throws Throwable {
    return doNotEqualsBoolean(((NgLong)lhs).getLongValue(), rhs);
  }

  @Override
  public boolean doNotEqualsBoolean(final Object lhs, final BigInteger rhs) throws Throwable {
    return doNotEqualsBoolean(((NgLong)lhs).getLongValue(), rhs);
  }

  @Override
  public boolean doNotEqualsBoolean(final Object lhs, final BigDecimal rhs) throws Throwable {
    return doNotEqualsBoolean(((NgLong)lhs).getLongValue(), rhs);
  }

  @Override
  public boolean doReverseNotEqualsBoolean(final byte lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(byte.class).doNotEqualsBoolean(lhs, ((NgLong)rhs).getLongValue());
  }

  @Override
  public boolean doReverseNotEqualsBoolean(final char lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(char.class).doNotEqualsBoolean(lhs, ((NgLong)rhs).getLongValue());
  }

  @Override
  public boolean doReverseNotEqualsBoolean(final short lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(short.class).doNotEqualsBoolean(lhs, ((NgLong)rhs).getLongValue());
  }

  @Override
  public boolean doReverseNotEqualsBoolean(final int lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(int.class).doNotEqualsBoolean(lhs, ((NgLong)rhs).getLongValue());
  }

  @Override
  public boolean doReverseNotEqualsBoolean(final long lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(long.class).doNotEqualsBoolean(lhs, ((NgLong)rhs).getLongValue());
  }

  @Override
  public boolean doReverseNotEqualsBoolean(final float lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(float.class).doNotEqualsBoolean(lhs, ((NgLong)rhs).getLongValue());
  }

  @Override
  public boolean doReverseNotEqualsBoolean(final double lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(double.class).doNotEqualsBoolean(lhs, ((NgLong)rhs).getLongValue());
  }

  @Override
  public boolean doReverseNotEqualsBoolean(final BigInteger lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(BigInteger.class).doNotEqualsBoolean(lhs, ((NgLong)rhs).getLongValue());
  }

  @Override
  public boolean doReverseNotEqualsBoolean(final BigDecimal lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(BigDecimal.class).doNotEqualsBoolean(lhs, ((NgLong)rhs).getLongValue());
  }

  @Override
  public Object doLessThan(final Object lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseLessThan(((NgLong)lhs).getLongValue(), rhs);
  }

  @Override
  public Object doLessThan(final long lhs, final byte rhs) throws Throwable {
    return (lhs < rhs) ? NgBoolean.TRUE : NgBoolean.FALSE;
  }

  @Override
  public Object doLessThan(final long lhs, final char rhs) throws Throwable {
    return (lhs < rhs) ? NgBoolean.TRUE : NgBoolean.FALSE;
  }

  @Override
  public Object doLessThan(final long lhs, final short rhs) throws Throwable {
    return (lhs < rhs) ? NgBoolean.TRUE : NgBoolean.FALSE;
  }

  @Override
  public Object doLessThan(final long lhs, final int rhs) throws Throwable {
    return (lhs < rhs) ? NgBoolean.TRUE : NgBoolean.FALSE;
  }

  @Override
  public Object doLessThan(final long lhs, final long rhs) throws Throwable {
    return (lhs < rhs) ? NgBoolean.TRUE : NgBoolean.FALSE;
  }

  @Override
  public Object doLessThan(final long lhs, final float rhs) throws Throwable {
    return (lhs < rhs) ? NgBoolean.TRUE : NgBoolean.FALSE;
  }

  @Override
  public Object doLessThan(final long lhs, final double rhs) throws Throwable {
    return (lhs < rhs) ? NgBoolean.TRUE : NgBoolean.FALSE;
  }

  @Override
  public Object doLessThan(final long lhs, final BigInteger rhs) throws Throwable {
    return (BigInteger.valueOf(lhs).compareTo(rhs) < 0) ? NgBoolean.TRUE : NgBoolean.FALSE;
  }

  @Override
  public Object doLessThan(final long lhs, final BigDecimal rhs) throws Throwable {
    return (new BigDecimal(lhs).compareTo(rhs) < 0) ? NgBoolean.TRUE : NgBoolean.FALSE;
  }

  @Override
  public Object doLessThan(final Object lhs, final byte rhs) throws Throwable {
    return doLessThan(((NgLong)lhs).getLongValue(), rhs);
  }

  @Override
  public Object doLessThan(final Object lhs, final char rhs) throws Throwable {
    return doLessThan(((NgLong)lhs).getLongValue(), rhs);
  }

  @Override
  public Object doLessThan(final Object lhs, final short rhs) throws Throwable {
    return doLessThan(((NgLong)lhs).getLongValue(), rhs);
  }

  @Override
  public Object doLessThan(final Object lhs, final int rhs) throws Throwable {
    return doLessThan(((NgLong)lhs).getLongValue(), rhs);
  }

  @Override
  public Object doLessThan(final Object lhs, final long rhs) throws Throwable {
    return doLessThan(((NgLong)lhs).getLongValue(), rhs);
  }

  @Override
  public Object doLessThan(final Object lhs, final float rhs) throws Throwable {
    return doLessThan(((NgLong)lhs).getLongValue(), rhs);
  }

  @Override
  public Object doLessThan(final Object lhs, final double rhs) throws Throwable {
    return doLessThan(((NgLong)lhs).getLongValue(), rhs);
  }

  @Override
  public Object doLessThan(final Object lhs, final BigInteger rhs) throws Throwable {
    return doLessThan(((NgLong)lhs).getLongValue(), rhs);
  }

  @Override
  public Object doLessThan(final Object lhs, final BigDecimal rhs) throws Throwable {
    return doLessThan(((NgLong)lhs).getLongValue(), rhs);
  }

  @Override
  public Object doReverseLessThan(final byte lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(byte.class).doLessThan(lhs, ((NgLong)rhs).getLongValue());
  }

  @Override
  public Object doReverseLessThan(final char lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(char.class).doLessThan(lhs, ((NgLong)rhs).getLongValue());
  }

  @Override
  public Object doReverseLessThan(final short lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(short.class).doLessThan(lhs, ((NgLong)rhs).getLongValue());
  }

  @Override
  public Object doReverseLessThan(final int lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(int.class).doLessThan(lhs, ((NgLong)rhs).getLongValue());
  }

  @Override
  public Object doReverseLessThan(final long lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(long.class).doLessThan(lhs, ((NgLong)rhs).getLongValue());
  }

  @Override
  public Object doReverseLessThan(final float lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(float.class).doLessThan(lhs, ((NgLong)rhs).getLongValue());
  }

  @Override
  public Object doReverseLessThan(final double lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(double.class).doLessThan(lhs, ((NgLong)rhs).getLongValue());
  }

  @Override
  public Object doReverseLessThan(final BigInteger lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(BigInteger.class).doLessThan(lhs, ((NgLong)rhs).getLongValue());
  }

  @Override
  public Object doReverseLessThan(final BigDecimal lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(BigDecimal.class).doLessThan(lhs, ((NgLong)rhs).getLongValue());
  }

  @Override
  public boolean doLessThanBoolean(final Object lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseLessThanBoolean(((NgLong)lhs).getLongValue(), rhs);
  }

  @Override
  public boolean doLessThanBoolean(final long lhs, final byte rhs) throws Throwable {
    return lhs < rhs;
  }

  @Override
  public boolean doLessThanBoolean(final long lhs, final char rhs) throws Throwable {
    return lhs < rhs;
  }

  @Override
  public boolean doLessThanBoolean(final long lhs, final short rhs) throws Throwable {
    return lhs < rhs;
  }

  @Override
  public boolean doLessThanBoolean(final long lhs, final int rhs) throws Throwable {
    return lhs < rhs;
  }

  @Override
  public boolean doLessThanBoolean(final long lhs, final long rhs) throws Throwable {
    return lhs < rhs;
  }

  @Override
  public boolean doLessThanBoolean(final long lhs, final float rhs) throws Throwable {
    return lhs < rhs;
  }

  @Override
  public boolean doLessThanBoolean(final long lhs, final double rhs) throws Throwable {
    return lhs < rhs;
  }

  @Override
  public boolean doLessThanBoolean(final long lhs, final BigInteger rhs) throws Throwable {
    return BigInteger.valueOf(lhs).compareTo(rhs) < 0;
  }

  @Override
  public boolean doLessThanBoolean(final long lhs, final BigDecimal rhs) throws Throwable {
    return new BigDecimal(lhs).compareTo(rhs) < 0;
  }

  @Override
  public boolean doLessThanBoolean(final Object lhs, final byte rhs) throws Throwable {
    return doLessThanBoolean(((NgLong)lhs).getLongValue(), rhs);
  }

  @Override
  public boolean doLessThanBoolean(final Object lhs, final char rhs) throws Throwable {
    return doLessThanBoolean(((NgLong)lhs).getLongValue(), rhs);
  }

  @Override
  public boolean doLessThanBoolean(final Object lhs, final short rhs) throws Throwable {
    return doLessThanBoolean(((NgLong)lhs).getLongValue(), rhs);
  }

  @Override
  public boolean doLessThanBoolean(final Object lhs, final int rhs) throws Throwable {
    return doLessThanBoolean(((NgLong)lhs).getLongValue(), rhs);
  }

  @Override
  public boolean doLessThanBoolean(final Object lhs, final long rhs) throws Throwable {
    return doLessThanBoolean(((NgLong)lhs).getLongValue(), rhs);
  }

  @Override
  public boolean doLessThanBoolean(final Object lhs, final float rhs) throws Throwable {
    return doLessThanBoolean(((NgLong)lhs).getLongValue(), rhs);
  }

  @Override
  public boolean doLessThanBoolean(final Object lhs, final double rhs) throws Throwable {
    return doLessThanBoolean(((NgLong)lhs).getLongValue(), rhs);
  }

  @Override
  public boolean doLessThanBoolean(final Object lhs, final BigInteger rhs) throws Throwable {
    return doLessThanBoolean(((NgLong)lhs).getLongValue(), rhs);
  }

  @Override
  public boolean doLessThanBoolean(final Object lhs, final BigDecimal rhs) throws Throwable {
    return doLessThanBoolean(((NgLong)lhs).getLongValue(), rhs);
  }

  @Override
  public boolean doReverseLessThanBoolean(final byte lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(byte.class).doLessThanBoolean(lhs, ((NgLong)rhs).getLongValue());
  }

  @Override
  public boolean doReverseLessThanBoolean(final char lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(char.class).doLessThanBoolean(lhs, ((NgLong)rhs).getLongValue());
  }

  @Override
  public boolean doReverseLessThanBoolean(final short lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(short.class).doLessThanBoolean(lhs, ((NgLong)rhs).getLongValue());
  }

  @Override
  public boolean doReverseLessThanBoolean(final int lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(int.class).doLessThanBoolean(lhs, ((NgLong)rhs).getLongValue());
  }

  @Override
  public boolean doReverseLessThanBoolean(final long lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(long.class).doLessThanBoolean(lhs, ((NgLong)rhs).getLongValue());
  }

  @Override
  public boolean doReverseLessThanBoolean(final float lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(float.class).doLessThanBoolean(lhs, ((NgLong)rhs).getLongValue());
  }

  @Override
  public boolean doReverseLessThanBoolean(final double lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(double.class).doLessThanBoolean(lhs, ((NgLong)rhs).getLongValue());
  }

  @Override
  public boolean doReverseLessThanBoolean(final BigInteger lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(BigInteger.class).doLessThanBoolean(lhs, ((NgLong)rhs).getLongValue());
  }

  @Override
  public boolean doReverseLessThanBoolean(final BigDecimal lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(BigDecimal.class).doLessThanBoolean(lhs, ((NgLong)rhs).getLongValue());
  }

  @Override
  public Object doLessThanOrEquals(final Object lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseLessThanOrEquals(((NgLong)lhs).getLongValue(), rhs);
  }

  @Override
  public Object doLessThanOrEquals(final long lhs, final byte rhs) throws Throwable {
    return (lhs <= rhs) ? NgBoolean.TRUE : NgBoolean.FALSE;
  }

  @Override
  public Object doLessThanOrEquals(final long lhs, final char rhs) throws Throwable {
    return (lhs <= rhs) ? NgBoolean.TRUE : NgBoolean.FALSE;
  }

  @Override
  public Object doLessThanOrEquals(final long lhs, final short rhs) throws Throwable {
    return (lhs <= rhs) ? NgBoolean.TRUE : NgBoolean.FALSE;
  }

  @Override
  public Object doLessThanOrEquals(final long lhs, final int rhs) throws Throwable {
    return (lhs <= rhs) ? NgBoolean.TRUE : NgBoolean.FALSE;
  }

  @Override
  public Object doLessThanOrEquals(final long lhs, final long rhs) throws Throwable {
    return (lhs <= rhs) ? NgBoolean.TRUE : NgBoolean.FALSE;
  }

  @Override
  public Object doLessThanOrEquals(final long lhs, final float rhs) throws Throwable {
    return (lhs <= rhs) ? NgBoolean.TRUE : NgBoolean.FALSE;
  }

  @Override
  public Object doLessThanOrEquals(final long lhs, final double rhs) throws Throwable {
    return (lhs <= rhs) ? NgBoolean.TRUE : NgBoolean.FALSE;
  }

  @Override
  public Object doLessThanOrEquals(final long lhs, final BigInteger rhs) throws Throwable {
    return (BigInteger.valueOf(lhs).compareTo(rhs) <= 0) ? NgBoolean.TRUE : NgBoolean.FALSE;
  }

  @Override
  public Object doLessThanOrEquals(final long lhs, final BigDecimal rhs) throws Throwable {
    return (new BigDecimal(lhs).compareTo(rhs) <= 0) ? NgBoolean.TRUE : NgBoolean.FALSE;
  }

  @Override
  public Object doLessThanOrEquals(final Object lhs, final byte rhs) throws Throwable {
    return doLessThanOrEquals(((NgLong)lhs).getLongValue(), rhs);
  }

  @Override
  public Object doLessThanOrEquals(final Object lhs, final char rhs) throws Throwable {
    return doLessThanOrEquals(((NgLong)lhs).getLongValue(), rhs);
  }

  @Override
  public Object doLessThanOrEquals(final Object lhs, final short rhs) throws Throwable {
    return doLessThanOrEquals(((NgLong)lhs).getLongValue(), rhs);
  }

  @Override
  public Object doLessThanOrEquals(final Object lhs, final int rhs) throws Throwable {
    return doLessThanOrEquals(((NgLong)lhs).getLongValue(), rhs);
  }

  @Override
  public Object doLessThanOrEquals(final Object lhs, final long rhs) throws Throwable {
    return doLessThanOrEquals(((NgLong)lhs).getLongValue(), rhs);
  }

  @Override
  public Object doLessThanOrEquals(final Object lhs, final float rhs) throws Throwable {
    return doLessThanOrEquals(((NgLong)lhs).getLongValue(), rhs);
  }

  @Override
  public Object doLessThanOrEquals(final Object lhs, final double rhs) throws Throwable {
    return doLessThanOrEquals(((NgLong)lhs).getLongValue(), rhs);
  }

  @Override
  public Object doLessThanOrEquals(final Object lhs, final BigInteger rhs) throws Throwable {
    return doLessThanOrEquals(((NgLong)lhs).getLongValue(), rhs);
  }

  @Override
  public Object doLessThanOrEquals(final Object lhs, final BigDecimal rhs) throws Throwable {
    return doLessThanOrEquals(((NgLong)lhs).getLongValue(), rhs);
  }

  @Override
  public Object doReverseLessThanOrEquals(final byte lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(byte.class).doLessThanOrEquals(lhs, ((NgLong)rhs).getLongValue());
  }

  @Override
  public Object doReverseLessThanOrEquals(final char lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(char.class).doLessThanOrEquals(lhs, ((NgLong)rhs).getLongValue());
  }

  @Override
  public Object doReverseLessThanOrEquals(final short lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(short.class).doLessThanOrEquals(lhs, ((NgLong)rhs).getLongValue());
  }

  @Override
  public Object doReverseLessThanOrEquals(final int lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(int.class).doLessThanOrEquals(lhs, ((NgLong)rhs).getLongValue());
  }

  @Override
  public Object doReverseLessThanOrEquals(final long lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(long.class).doLessThanOrEquals(lhs, ((NgLong)rhs).getLongValue());
  }

  @Override
  public Object doReverseLessThanOrEquals(final float lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(float.class).doLessThanOrEquals(lhs, ((NgLong)rhs).getLongValue());
  }

  @Override
  public Object doReverseLessThanOrEquals(final double lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(double.class).doLessThanOrEquals(lhs, ((NgLong)rhs).getLongValue());
  }

  @Override
  public Object doReverseLessThanOrEquals(final BigInteger lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(BigInteger.class).doLessThanOrEquals(lhs, ((NgLong)rhs).getLongValue());
  }

  @Override
  public Object doReverseLessThanOrEquals(final BigDecimal lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(BigDecimal.class).doLessThanOrEquals(lhs, ((NgLong)rhs).getLongValue());
  }

  @Override
  public boolean doLessThanOrEqualsBoolean(final Object lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseLessThanOrEqualsBoolean(((NgLong)lhs).getLongValue(), rhs);
  }

  @Override
  public boolean doLessThanOrEqualsBoolean(final long lhs, final byte rhs) throws Throwable {
    return lhs <= rhs;
  }

  @Override
  public boolean doLessThanOrEqualsBoolean(final long lhs, final char rhs) throws Throwable {
    return lhs <= rhs;
  }

  @Override
  public boolean doLessThanOrEqualsBoolean(final long lhs, final short rhs) throws Throwable {
    return lhs <= rhs;
  }

  @Override
  public boolean doLessThanOrEqualsBoolean(final long lhs, final int rhs) throws Throwable {
    return lhs <= rhs;
  }

  @Override
  public boolean doLessThanOrEqualsBoolean(final long lhs, final long rhs) throws Throwable {
    return lhs <= rhs;
  }

  @Override
  public boolean doLessThanOrEqualsBoolean(final long lhs, final float rhs) throws Throwable {
    return lhs <= rhs;
  }

  @Override
  public boolean doLessThanOrEqualsBoolean(final long lhs, final double rhs) throws Throwable {
    return lhs <= rhs;
  }

  @Override
  public boolean doLessThanOrEqualsBoolean(final long lhs, final BigInteger rhs) throws Throwable {
    return BigInteger.valueOf(lhs).compareTo(rhs) <= 0;
  }

  @Override
  public boolean doLessThanOrEqualsBoolean(final long lhs, final BigDecimal rhs) throws Throwable {
    return new BigDecimal(lhs).compareTo(rhs) <= 0;
  }

  @Override
  public boolean doLessThanOrEqualsBoolean(final Object lhs, final byte rhs) throws Throwable {
    return doLessThanOrEqualsBoolean(((NgLong)lhs).getLongValue(), rhs);
  }

  @Override
  public boolean doLessThanOrEqualsBoolean(final Object lhs, final char rhs) throws Throwable {
    return doLessThanOrEqualsBoolean(((NgLong)lhs).getLongValue(), rhs);
  }

  @Override
  public boolean doLessThanOrEqualsBoolean(final Object lhs, final short rhs) throws Throwable {
    return doLessThanOrEqualsBoolean(((NgLong)lhs).getLongValue(), rhs);
  }

  @Override
  public boolean doLessThanOrEqualsBoolean(final Object lhs, final int rhs) throws Throwable {
    return doLessThanOrEqualsBoolean(((NgLong)lhs).getLongValue(), rhs);
  }

  @Override
  public boolean doLessThanOrEqualsBoolean(final Object lhs, final long rhs) throws Throwable {
    return doLessThanOrEqualsBoolean(((NgLong)lhs).getLongValue(), rhs);
  }

  @Override
  public boolean doLessThanOrEqualsBoolean(final Object lhs, final float rhs) throws Throwable {
    return doLessThanOrEqualsBoolean(((NgLong)lhs).getLongValue(), rhs);
  }

  @Override
  public boolean doLessThanOrEqualsBoolean(final Object lhs, final double rhs) throws Throwable {
    return doLessThanOrEqualsBoolean(((NgLong)lhs).getLongValue(), rhs);
  }

  @Override
  public boolean doLessThanOrEqualsBoolean(final Object lhs, final BigInteger rhs) throws Throwable {
    return doLessThanOrEqualsBoolean(((NgLong)lhs).getLongValue(), rhs);
  }

  @Override
  public boolean doLessThanOrEqualsBoolean(final Object lhs, final BigDecimal rhs) throws Throwable {
    return doLessThanOrEqualsBoolean(((NgLong)lhs).getLongValue(), rhs);
  }

  @Override
  public boolean doReverseLessThanOrEqualsBoolean(final byte lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(byte.class).doLessThanOrEqualsBoolean(lhs, ((NgLong)rhs).getLongValue());
  }

  @Override
  public boolean doReverseLessThanOrEqualsBoolean(final char lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(char.class).doLessThanOrEqualsBoolean(lhs, ((NgLong)rhs).getLongValue());
  }

  @Override
  public boolean doReverseLessThanOrEqualsBoolean(final short lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(short.class).doLessThanOrEqualsBoolean(lhs, ((NgLong)rhs).getLongValue());
  }

  @Override
  public boolean doReverseLessThanOrEqualsBoolean(final int lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(int.class).doLessThanOrEqualsBoolean(lhs, ((NgLong)rhs).getLongValue());
  }

  @Override
  public boolean doReverseLessThanOrEqualsBoolean(final long lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(long.class).doLessThanOrEqualsBoolean(lhs, ((NgLong)rhs).getLongValue());
  }

  @Override
  public boolean doReverseLessThanOrEqualsBoolean(final float lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(float.class).doLessThanOrEqualsBoolean(lhs, ((NgLong)rhs).getLongValue());
  }

  @Override
  public boolean doReverseLessThanOrEqualsBoolean(final double lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(double.class).doLessThanOrEqualsBoolean(lhs, ((NgLong)rhs).getLongValue());
  }

  @Override
  public boolean doReverseLessThanOrEqualsBoolean(final BigInteger lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(BigInteger.class).doLessThanOrEqualsBoolean(lhs, ((NgLong)rhs).getLongValue());
  }

  @Override
  public boolean doReverseLessThanOrEqualsBoolean(final BigDecimal lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(BigDecimal.class).doLessThanOrEqualsBoolean(lhs, ((NgLong)rhs).getLongValue());
  }

  @Override
  public Object doGreaterThan(final Object lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseGreaterThan(((NgLong)lhs).getLongValue(), rhs);
  }

  @Override
  public Object doGreaterThan(final long lhs, final byte rhs) throws Throwable {
    return (lhs > rhs) ? NgBoolean.TRUE : NgBoolean.FALSE;
  }

  @Override
  public Object doGreaterThan(final long lhs, final char rhs) throws Throwable {
    return (lhs > rhs) ? NgBoolean.TRUE : NgBoolean.FALSE;
  }

  @Override
  public Object doGreaterThan(final long lhs, final short rhs) throws Throwable {
    return (lhs > rhs) ? NgBoolean.TRUE : NgBoolean.FALSE;
  }

  @Override
  public Object doGreaterThan(final long lhs, final int rhs) throws Throwable {
    return (lhs > rhs) ? NgBoolean.TRUE : NgBoolean.FALSE;
  }

  @Override
  public Object doGreaterThan(final long lhs, final long rhs) throws Throwable {
    return (lhs > rhs) ? NgBoolean.TRUE : NgBoolean.FALSE;
  }

  @Override
  public Object doGreaterThan(final long lhs, final float rhs) throws Throwable {
    return (lhs > rhs) ? NgBoolean.TRUE : NgBoolean.FALSE;
  }

  @Override
  public Object doGreaterThan(final long lhs, final double rhs) throws Throwable {
    return (lhs > rhs) ? NgBoolean.TRUE : NgBoolean.FALSE;
  }

  @Override
  public Object doGreaterThan(final long lhs, final BigInteger rhs) throws Throwable {
    return (BigInteger.valueOf(lhs).compareTo(rhs) > 0) ? NgBoolean.TRUE : NgBoolean.FALSE;
  }

  @Override
  public Object doGreaterThan(final long lhs, final BigDecimal rhs) throws Throwable {
    return (new BigDecimal(lhs).compareTo(rhs) > 0) ? NgBoolean.TRUE : NgBoolean.FALSE;
  }

  @Override
  public Object doGreaterThan(final Object lhs, final byte rhs) throws Throwable {
    return doGreaterThan(((NgLong)lhs).getLongValue(), rhs);
  }

  @Override
  public Object doGreaterThan(final Object lhs, final char rhs) throws Throwable {
    return doGreaterThan(((NgLong)lhs).getLongValue(), rhs);
  }

  @Override
  public Object doGreaterThan(final Object lhs, final short rhs) throws Throwable {
    return doGreaterThan(((NgLong)lhs).getLongValue(), rhs);
  }

  @Override
  public Object doGreaterThan(final Object lhs, final int rhs) throws Throwable {
    return doGreaterThan(((NgLong)lhs).getLongValue(), rhs);
  }

  @Override
  public Object doGreaterThan(final Object lhs, final long rhs) throws Throwable {
    return doGreaterThan(((NgLong)lhs).getLongValue(), rhs);
  }

  @Override
  public Object doGreaterThan(final Object lhs, final float rhs) throws Throwable {
    return doGreaterThan(((NgLong)lhs).getLongValue(), rhs);
  }

  @Override
  public Object doGreaterThan(final Object lhs, final double rhs) throws Throwable {
    return doGreaterThan(((NgLong)lhs).getLongValue(), rhs);
  }

  @Override
  public Object doGreaterThan(final Object lhs, final BigInteger rhs) throws Throwable {
    return doGreaterThan(((NgLong)lhs).getLongValue(), rhs);
  }

  @Override
  public Object doGreaterThan(final Object lhs, final BigDecimal rhs) throws Throwable {
    return doGreaterThan(((NgLong)lhs).getLongValue(), rhs);
  }

  @Override
  public Object doReverseGreaterThan(final byte lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(byte.class).doGreaterThan(lhs, ((NgLong)rhs).getLongValue());
  }

  @Override
  public Object doReverseGreaterThan(final char lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(char.class).doGreaterThan(lhs, ((NgLong)rhs).getLongValue());
  }

  @Override
  public Object doReverseGreaterThan(final short lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(short.class).doGreaterThan(lhs, ((NgLong)rhs).getLongValue());
  }

  @Override
  public Object doReverseGreaterThan(final int lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(int.class).doGreaterThan(lhs, ((NgLong)rhs).getLongValue());
  }

  @Override
  public Object doReverseGreaterThan(final long lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(long.class).doGreaterThan(lhs, ((NgLong)rhs).getLongValue());
  }

  @Override
  public Object doReverseGreaterThan(final float lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(float.class).doGreaterThan(lhs, ((NgLong)rhs).getLongValue());
  }

  @Override
  public Object doReverseGreaterThan(final double lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(double.class).doGreaterThan(lhs, ((NgLong)rhs).getLongValue());
  }

  @Override
  public Object doReverseGreaterThan(final BigInteger lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(BigInteger.class).doGreaterThan(lhs, ((NgLong)rhs).getLongValue());
  }

  @Override
  public Object doReverseGreaterThan(final BigDecimal lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(BigDecimal.class).doGreaterThan(lhs, ((NgLong)rhs).getLongValue());
  }

  @Override
  public boolean doGreaterThanBoolean(final Object lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseGreaterThanBoolean(((NgLong)lhs).getLongValue(), rhs);
  }

  @Override
  public boolean doGreaterThanBoolean(final long lhs, final byte rhs) throws Throwable {
    return lhs > rhs;
  }

  @Override
  public boolean doGreaterThanBoolean(final long lhs, final char rhs) throws Throwable {
    return lhs > rhs;
  }

  @Override
  public boolean doGreaterThanBoolean(final long lhs, final short rhs) throws Throwable {
    return lhs > rhs;
  }

  @Override
  public boolean doGreaterThanBoolean(final long lhs, final int rhs) throws Throwable {
    return lhs > rhs;
  }

  @Override
  public boolean doGreaterThanBoolean(final long lhs, final long rhs) throws Throwable {
    return lhs > rhs;
  }

  @Override
  public boolean doGreaterThanBoolean(final long lhs, final float rhs) throws Throwable {
    return lhs > rhs;
  }

  @Override
  public boolean doGreaterThanBoolean(final long lhs, final double rhs) throws Throwable {
    return lhs > rhs;
  }

  @Override
  public boolean doGreaterThanBoolean(final long lhs, final BigInteger rhs) throws Throwable {
    return BigInteger.valueOf(lhs).compareTo(rhs) > 0;
  }

  @Override
  public boolean doGreaterThanBoolean(final long lhs, final BigDecimal rhs) throws Throwable {
    return new BigDecimal(lhs).compareTo(rhs) > 0;
  }

  @Override
  public boolean doGreaterThanBoolean(final Object lhs, final byte rhs) throws Throwable {
    return doGreaterThanBoolean(((NgLong)lhs).getLongValue(), rhs);
  }

  @Override
  public boolean doGreaterThanBoolean(final Object lhs, final char rhs) throws Throwable {
    return doGreaterThanBoolean(((NgLong)lhs).getLongValue(), rhs);
  }

  @Override
  public boolean doGreaterThanBoolean(final Object lhs, final short rhs) throws Throwable {
    return doGreaterThanBoolean(((NgLong)lhs).getLongValue(), rhs);
  }

  @Override
  public boolean doGreaterThanBoolean(final Object lhs, final int rhs) throws Throwable {
    return doGreaterThanBoolean(((NgLong)lhs).getLongValue(), rhs);
  }

  @Override
  public boolean doGreaterThanBoolean(final Object lhs, final long rhs) throws Throwable {
    return doGreaterThanBoolean(((NgLong)lhs).getLongValue(), rhs);
  }

  @Override
  public boolean doGreaterThanBoolean(final Object lhs, final float rhs) throws Throwable {
    return doGreaterThanBoolean(((NgLong)lhs).getLongValue(), rhs);
  }

  @Override
  public boolean doGreaterThanBoolean(final Object lhs, final double rhs) throws Throwable {
    return doGreaterThanBoolean(((NgLong)lhs).getLongValue(), rhs);
  }

  @Override
  public boolean doGreaterThanBoolean(final Object lhs, final BigInteger rhs) throws Throwable {
    return doGreaterThanBoolean(((NgLong)lhs).getLongValue(), rhs);
  }

  @Override
  public boolean doGreaterThanBoolean(final Object lhs, final BigDecimal rhs) throws Throwable {
    return doGreaterThanBoolean(((NgLong)lhs).getLongValue(), rhs);
  }

  @Override
  public boolean doReverseGreaterThanBoolean(final byte lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(byte.class).doGreaterThanBoolean(lhs, ((NgLong)rhs).getLongValue());
  }

  @Override
  public boolean doReverseGreaterThanBoolean(final char lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(char.class).doGreaterThanBoolean(lhs, ((NgLong)rhs).getLongValue());
  }

  @Override
  public boolean doReverseGreaterThanBoolean(final short lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(short.class).doGreaterThanBoolean(lhs, ((NgLong)rhs).getLongValue());
  }

  @Override
  public boolean doReverseGreaterThanBoolean(final int lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(int.class).doGreaterThanBoolean(lhs, ((NgLong)rhs).getLongValue());
  }

  @Override
  public boolean doReverseGreaterThanBoolean(final long lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(long.class).doGreaterThanBoolean(lhs, ((NgLong)rhs).getLongValue());
  }

  @Override
  public boolean doReverseGreaterThanBoolean(final float lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(float.class).doGreaterThanBoolean(lhs, ((NgLong)rhs).getLongValue());
  }

  @Override
  public boolean doReverseGreaterThanBoolean(final double lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(double.class).doGreaterThanBoolean(lhs, ((NgLong)rhs).getLongValue());
  }

  @Override
  public boolean doReverseGreaterThanBoolean(final BigInteger lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(BigInteger.class).doGreaterThanBoolean(lhs, ((NgLong)rhs).getLongValue());
  }

  @Override
  public boolean doReverseGreaterThanBoolean(final BigDecimal lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(BigDecimal.class).doGreaterThanBoolean(lhs, ((NgLong)rhs).getLongValue());
  }

  @Override
  public Object doGreaterThanOrEquals(final Object lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseGreaterThanOrEquals(((NgLong)lhs).getLongValue(), rhs);
  }

  @Override
  public Object doGreaterThanOrEquals(final long lhs, final byte rhs) throws Throwable {
    return (lhs >= rhs) ? NgBoolean.TRUE : NgBoolean.FALSE;
  }

  @Override
  public Object doGreaterThanOrEquals(final long lhs, final char rhs) throws Throwable {
    return (lhs >= rhs) ? NgBoolean.TRUE : NgBoolean.FALSE;
  }

  @Override
  public Object doGreaterThanOrEquals(final long lhs, final short rhs) throws Throwable {
    return (lhs >= rhs) ? NgBoolean.TRUE : NgBoolean.FALSE;
  }

  @Override
  public Object doGreaterThanOrEquals(final long lhs, final int rhs) throws Throwable {
    return (lhs >= rhs) ? NgBoolean.TRUE : NgBoolean.FALSE;
  }

  @Override
  public Object doGreaterThanOrEquals(final long lhs, final long rhs) throws Throwable {
    return (lhs >= rhs) ? NgBoolean.TRUE : NgBoolean.FALSE;
  }

  @Override
  public Object doGreaterThanOrEquals(final long lhs, final float rhs) throws Throwable {
    return (lhs >= rhs) ? NgBoolean.TRUE : NgBoolean.FALSE;
  }

  @Override
  public Object doGreaterThanOrEquals(final long lhs, final double rhs) throws Throwable {
    return (lhs >= rhs) ? NgBoolean.TRUE : NgBoolean.FALSE;
  }

  @Override
  public Object doGreaterThanOrEquals(final long lhs, final BigInteger rhs) throws Throwable {
    return (BigInteger.valueOf(lhs).compareTo(rhs) >= 0) ? NgBoolean.TRUE : NgBoolean.FALSE;
  }

  @Override
  public Object doGreaterThanOrEquals(final long lhs, final BigDecimal rhs) throws Throwable {
    return (new BigDecimal(lhs).compareTo(rhs) >= 0) ? NgBoolean.TRUE : NgBoolean.FALSE;
  }

  @Override
  public Object doGreaterThanOrEquals(final Object lhs, final byte rhs) throws Throwable {
    return doGreaterThanOrEquals(((NgLong)lhs).getLongValue(), rhs);
  }

  @Override
  public Object doGreaterThanOrEquals(final Object lhs, final char rhs) throws Throwable {
    return doGreaterThanOrEquals(((NgLong)lhs).getLongValue(), rhs);
  }

  @Override
  public Object doGreaterThanOrEquals(final Object lhs, final short rhs) throws Throwable {
    return doGreaterThanOrEquals(((NgLong)lhs).getLongValue(), rhs);
  }

  @Override
  public Object doGreaterThanOrEquals(final Object lhs, final int rhs) throws Throwable {
    return doGreaterThanOrEquals(((NgLong)lhs).getLongValue(), rhs);
  }

  @Override
  public Object doGreaterThanOrEquals(final Object lhs, final long rhs) throws Throwable {
    return doGreaterThanOrEquals(((NgLong)lhs).getLongValue(), rhs);
  }

  @Override
  public Object doGreaterThanOrEquals(final Object lhs, final float rhs) throws Throwable {
    return doGreaterThanOrEquals(((NgLong)lhs).getLongValue(), rhs);
  }

  @Override
  public Object doGreaterThanOrEquals(final Object lhs, final double rhs) throws Throwable {
    return doGreaterThanOrEquals(((NgLong)lhs).getLongValue(), rhs);
  }

  @Override
  public Object doGreaterThanOrEquals(final Object lhs, final BigInteger rhs) throws Throwable {
    return doGreaterThanOrEquals(((NgLong)lhs).getLongValue(), rhs);
  }

  @Override
  public Object doGreaterThanOrEquals(final Object lhs, final BigDecimal rhs) throws Throwable {
    return doGreaterThanOrEquals(((NgLong)lhs).getLongValue(), rhs);
  }

  @Override
  public Object doReverseGreaterThanOrEquals(final byte lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(byte.class).doGreaterThanOrEquals(lhs, ((NgLong)rhs).getLongValue());
  }

  @Override
  public Object doReverseGreaterThanOrEquals(final char lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(char.class).doGreaterThanOrEquals(lhs, ((NgLong)rhs).getLongValue());
  }

  @Override
  public Object doReverseGreaterThanOrEquals(final short lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(short.class).doGreaterThanOrEquals(lhs, ((NgLong)rhs).getLongValue());
  }

  @Override
  public Object doReverseGreaterThanOrEquals(final int lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(int.class).doGreaterThanOrEquals(lhs, ((NgLong)rhs).getLongValue());
  }

  @Override
  public Object doReverseGreaterThanOrEquals(final long lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(long.class).doGreaterThanOrEquals(lhs, ((NgLong)rhs).getLongValue());
  }

  @Override
  public Object doReverseGreaterThanOrEquals(final float lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(float.class).doGreaterThanOrEquals(lhs, ((NgLong)rhs).getLongValue());
  }

  @Override
  public Object doReverseGreaterThanOrEquals(final double lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(double.class).doGreaterThanOrEquals(lhs, ((NgLong)rhs).getLongValue());
  }

  @Override
  public Object doReverseGreaterThanOrEquals(final BigInteger lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(BigInteger.class).doGreaterThanOrEquals(lhs, ((NgLong)rhs).getLongValue());
  }

  @Override
  public Object doReverseGreaterThanOrEquals(final BigDecimal lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(BigDecimal.class).doGreaterThanOrEquals(lhs, ((NgLong)rhs).getLongValue());
  }
  
  @Override
  public Object doAsType(final ThreadContext tc, final Object instance, final Class type) throws Throwable {
    
    if (type == long.class) return instance;
    
    return super.doAsType(tc, instance, type);
  }

}
