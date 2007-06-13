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

public class NgFloatMetaClass extends RuntimeMetaClassImpl {
  public NgFloatMetaClass() {
    super(float.class, new NgFloatInternalMetaClass(float.class));
  }
}

class NgFloatInternalMetaClass extends InternalMetaClassImpl {
  public NgFloatInternalMetaClass(final Class theClass) {
    super(theClass);
  }
  /* (non-Javadoc)
   * @see uk.co.wilson.ng.runtime.metaclass.InternalMetaClassImpl#doCalculateConversionCost(java.lang.Class)
   */
  @Override
  public int doCalculateConversionCost(final Class parameterType) {
    if (parameterType == float.class) return 0;
    
    if (parameterType == double.class) return 1;
    
    if (parameterType == BigDecimal.class) return 2;
    
    return super.doCalculateConversionCost(parameterType);
  }

  /* (non-Javadoc)
   * @see uk.co.wilson.ng.runtime.metaclass.InternalMetaClassImpl#doGetParamObject(java.lang.Object, java.lang.Class)
   */
  @Override
 public Object doGetParamObject(final Object instance, final Class parameterType) {
    if (parameterType == float.class) return new Float(((NgFloat)instance).getFloatValue());
    
    if (parameterType == double.class) return new Double(((NgFloat)instance).getFloatValue());
    
    if (parameterType == BigDecimal.class) return new BigDecimal(((NgFloat)instance).getFloatValue());
    
    return super.doGetParamObject(instance, parameterType);
  }

  @Override
  public Object doUnaryPlus(final float instance) {
    return NgFloat.valueOf(instance);
  }
  
  @Override
  public Object doUnaryPlus(final Object instance) {
    return instance;
  }
  
  @Override
  public Object doUnaryMinus(final float instance) {
    return NgFloat.valueOf(-instance);
  }
  
  @Override
  public Object doUnaryMinus(final Object instance) {
    return NgFloat.valueOf(-((NgFloat)instance).getFloatValue());
  }

  @Override
  public Object doPostfixIncrement(final float instance) {
    return NgFloat.valueOf(instance + 1);
  }

  @Override
  public Object doPostfixIncrement(final Object instance) {
    return NgFloat.valueOf(((NgFloat)instance).getFloatValue() + 1);
  }

  @Override
  public Object doPostfixDecrement(final float instance) {
    return NgFloat.valueOf(instance - 1);
  }

  @Override
  public Object doPostfixDecrement(final Object instance) {
    return NgFloat.valueOf(((NgFloat)instance).getFloatValue() - 1);
  }

  @Override
  public Object doPrefixIncrement(final float instance) {
    return NgFloat.valueOf(instance + 1);
  }

  @Override
  public Object doPrefixIncrement(final Object instance) {
    return NgFloat.valueOf(((NgFloat)instance).getFloatValue() + 1);
  }

  @Override
  public Object doPrefixDecrement(final float instance) {
    return NgFloat.valueOf(instance - 1);
  }

  @Override
  public Object doPrefixDecrement(final Object instance) {
    return NgFloat.valueOf(((NgFloat)instance).getFloatValue() - 1);
  }

  @Override
  public Object doAdd(final Object lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseAdd(((NgFloat)lhs).getFloatValue(), rhs);
  }

  @Override
  public Object doAdd(final float lhs, final byte rhs) throws Throwable {
    return NgFloat.valueOf(lhs + rhs);
  }

  @Override
  public Object doAdd(final float lhs, final char rhs) throws Throwable {
    return NgFloat.valueOf(lhs + rhs);
  }

  @Override
  public Object doAdd(final float lhs, final short rhs) throws Throwable {
    return NgFloat.valueOf(lhs + rhs);
  }

  @Override
  public Object doAdd(final float lhs, final int rhs) throws Throwable {
    return NgFloat.valueOf(lhs + rhs);
  }

  @Override
  public Object doAdd(final float lhs, final long rhs) throws Throwable {
    return NgFloat.valueOf(lhs + rhs);
  }

  @Override
  public Object doAdd(final float lhs, final float rhs) throws Throwable {
    return NgFloat.valueOf(lhs + rhs);
  }

  @Override
  public Object doAdd(final float lhs, final double rhs) throws Throwable {
    return NgDouble.valueOf(lhs + rhs);
  }

  @Override
  public Object doAdd(final float lhs, final BigInteger rhs) throws Throwable {
    return NgFloat.valueOf(lhs + rhs.floatValue());
  }

  @Override
  public Object doAdd(final float lhs, final BigDecimal rhs) throws Throwable {
    return new BigDecimal(lhs).add(rhs);
  }

  @Override
  public Object doAdd(final Object lhs, final byte rhs) throws Throwable {
    return doAdd(((NgFloat)lhs).getFloatValue(), rhs);
  }

  @Override
  public Object doAdd(final Object lhs, final char rhs) throws Throwable {
    return doAdd(((NgFloat)lhs).getFloatValue(), rhs);
  }

  @Override
  public Object doAdd(final Object lhs, final short rhs) throws Throwable {
    return doAdd(((NgFloat)lhs).getFloatValue(), rhs);
  }

  @Override
  public Object doAdd(final Object lhs, final int rhs) throws Throwable {
    return doAdd(((NgFloat)lhs).getFloatValue(), rhs);
  }

  @Override
  public Object doAdd(final Object lhs, final long rhs) throws Throwable {
    return doAdd(((NgFloat)lhs).getFloatValue(), rhs);
  }

  @Override
  public Object doAdd(final Object lhs, final float rhs) throws Throwable {
    return doAdd(((NgFloat)lhs).getFloatValue(), rhs);
  }

  @Override
  public Object doAdd(final Object lhs, final double rhs) throws Throwable {
    return doAdd(((NgFloat)lhs).getFloatValue(), rhs);
  }

  @Override
  public Object doAdd(final Object lhs, final BigInteger rhs) throws Throwable {
    return doAdd(((NgFloat)lhs).getFloatValue(), rhs);
  }

  @Override
  public Object doAdd(final Object lhs, final BigDecimal rhs) throws Throwable {
    return doAdd(((NgFloat)lhs).getFloatValue(), rhs);
  }

  @Override
  public Object doReverseAdd(final byte lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(byte.class).doAdd(lhs, ((NgFloat)rhs).getFloatValue());
  }

  @Override
  public Object doReverseAdd(final char lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(char.class).doAdd(lhs, ((NgFloat)rhs).getFloatValue());
  }

  @Override
  public Object doReverseAdd(final short lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(short.class).doAdd(lhs, ((NgFloat)rhs).getFloatValue());
  }

  @Override
  public Object doReverseAdd(final int lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(int.class).doAdd(lhs, ((NgFloat)rhs).getFloatValue());
  }

  @Override
  public Object doReverseAdd(final long lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(long.class).doAdd(lhs, ((NgFloat)rhs).getFloatValue());
  }

  @Override
  public Object doReverseAdd(final float lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(float.class).doAdd(lhs, ((NgFloat)rhs).getFloatValue());
  }

  @Override
  public Object doReverseAdd(final double lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(double.class).doAdd(lhs, ((NgFloat)rhs).getFloatValue());
  }

  @Override
  public Object doReverseAdd(final BigInteger lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(BigInteger.class).doAdd(lhs, ((NgFloat)rhs).getFloatValue());
  }

  @Override
  public Object doReverseAdd(final BigDecimal lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(BigDecimal.class).doAdd(lhs, ((NgFloat)rhs).getFloatValue());
  }

  @Override
  public Object doAddEquals(final Object lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseAddEquals(((NgFloat)lhs).getFloatValue(), rhs);
  }

  @Override
  public Object doAddEquals(final float lhs, final byte rhs) throws Throwable {
    return NgFloat.valueOf(lhs + rhs);
  }

  @Override
  public Object doAddEquals(final float lhs, final char rhs) throws Throwable {
    return NgFloat.valueOf(lhs + rhs);
  }

  @Override
  public Object doAddEquals(final float lhs, final short rhs) throws Throwable {
    return NgFloat.valueOf(lhs + rhs);
  }

  @Override
  public Object doAddEquals(final float lhs, final int rhs) throws Throwable {
    return NgFloat.valueOf(lhs + rhs);
  }

  @Override
  public Object doAddEquals(final float lhs, final long rhs) throws Throwable {
    return NgFloat.valueOf(lhs + rhs);
  }

  @Override
  public Object doAddEquals(final float lhs, final float rhs) throws Throwable {
    return NgFloat.valueOf(lhs + rhs);
  }

  @Override
  public Object doAddEquals(final float lhs, final double rhs) throws Throwable {
    return NgDouble.valueOf(lhs + rhs);
  }

  @Override
  public Object doAddEquals(final float lhs, final BigInteger rhs) throws Throwable {
    return NgFloat.valueOf(lhs + rhs.floatValue());
  }

  @Override
  public Object doAddEquals(final float lhs, final BigDecimal rhs) throws Throwable {
    return new BigDecimal(lhs).add(rhs);
  }

  @Override
  public Object doAddEquals(final Object lhs, final byte rhs) throws Throwable {
    return doAddEquals(((NgFloat)lhs).getFloatValue(), rhs);
  }

  @Override
  public Object doAddEquals(final Object lhs, final char rhs) throws Throwable {
    return doAddEquals(((NgFloat)lhs).getFloatValue(), rhs);
  }

  @Override
  public Object doAddEquals(final Object lhs, final short rhs) throws Throwable {
    return doAddEquals(((NgFloat)lhs).getFloatValue(), rhs);
  }

  @Override
  public Object doAddEquals(final Object lhs, final int rhs) throws Throwable {
    return doAddEquals(((NgFloat)lhs).getFloatValue(), rhs);
  }

  @Override
  public Object doAddEquals(final Object lhs, final long rhs) throws Throwable {
    return doAddEquals(((NgFloat)lhs).getFloatValue(), rhs);
  }

  @Override
  public Object doAddEquals(final Object lhs, final float rhs) throws Throwable {
    return doAddEquals(((NgFloat)lhs).getFloatValue(), rhs);
  }

  @Override
  public Object doAddEquals(final Object lhs, final double rhs) throws Throwable {
    return doAddEquals(((NgFloat)lhs).getFloatValue(), rhs);
  }

  @Override
  public Object doAddEquals(final Object lhs, final BigInteger rhs) throws Throwable {
    return doAddEquals(((NgFloat)lhs).getFloatValue(), rhs);
  }

  @Override
  public Object doAddEquals(final Object lhs, final BigDecimal rhs) throws Throwable {
    return doAddEquals(((NgFloat)lhs).getFloatValue(), rhs);
  }

  @Override
  public Object doReverseAddEquals(final byte lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(byte.class).doAddEquals(lhs, ((NgFloat)rhs).getFloatValue());
  }

  @Override
  public Object doReverseAddEquals(final char lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(char.class).doAddEquals(lhs, ((NgFloat)rhs).getFloatValue());
  }

  @Override
  public Object doReverseAddEquals(final short lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(short.class).doAddEquals(lhs, ((NgFloat)rhs).getFloatValue());
  }

  @Override
  public Object doReverseAddEquals(final int lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(int.class).doAddEquals(lhs, ((NgFloat)rhs).getFloatValue());
  }

  @Override
  public Object doReverseAddEquals(final long lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(long.class).doAddEquals(lhs, ((NgFloat)rhs).getFloatValue());
  }

  @Override
  public Object doReverseAddEquals(final float lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(float.class).doAddEquals(lhs, ((NgFloat)rhs).getFloatValue());
  }

  @Override
  public Object doReverseAddEquals(final double lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(double.class).doAddEquals(lhs, ((NgFloat)rhs).getFloatValue());
  }

  @Override
  public Object doReverseAddEquals(final BigInteger lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(BigInteger.class).doAddEquals(lhs, ((NgFloat)rhs).getFloatValue());
  }

  @Override
  public Object doReverseAddEquals(final BigDecimal lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(BigDecimal.class).doAddEquals(lhs, ((NgFloat)rhs).getFloatValue());
  }

  @Override
  public Object doSubtract(final Object lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseSubtract(((NgFloat)lhs).getFloatValue(), rhs);
  }

  @Override
  public Object doSubtract(final float lhs, final byte rhs) throws Throwable {
    return NgFloat.valueOf(lhs - rhs);
  }

  @Override
  public Object doSubtract(final float lhs, final char rhs) throws Throwable {
    return NgFloat.valueOf(lhs - rhs);
  }

  @Override
  public Object doSubtract(final float lhs, final short rhs) throws Throwable {
    return NgFloat.valueOf(lhs - rhs);
  }

  @Override
  public Object doSubtract(final float lhs, final int rhs) throws Throwable {
    return NgFloat.valueOf(lhs - rhs);
  }

  @Override
  public Object doSubtract(final float lhs, final long rhs) throws Throwable {
    return NgFloat.valueOf(lhs - rhs);
  }

  @Override
  public Object doSubtract(final float lhs, final float rhs) throws Throwable {
    return NgFloat.valueOf(lhs - rhs);
  }

  @Override
  public Object doSubtract(final float lhs, final double rhs) throws Throwable {
    return NgDouble.valueOf(lhs - rhs);
  }

  @Override
  public Object doSubtract(final float lhs, final BigInteger rhs) throws Throwable {
    return NgFloat.valueOf(lhs - rhs.floatValue());
  }

  @Override
  public Object doSubtract(final float lhs, final BigDecimal rhs) throws Throwable {
    return new BigDecimal(lhs).subtract(rhs);
  }

  @Override
  public Object doSubtract(final Object lhs, final byte rhs) throws Throwable {
    return doSubtract(((NgFloat)lhs).getFloatValue(), rhs);
  }

  @Override
  public Object doSubtract(final Object lhs, final char rhs) throws Throwable {
    return doSubtract(((NgFloat)lhs).getFloatValue(), rhs);
  }

  @Override
  public Object doSubtract(final Object lhs, final short rhs) throws Throwable {
    return doSubtract(((NgFloat)lhs).getFloatValue(), rhs);
  }

  @Override
  public Object doSubtract(final Object lhs, final int rhs) throws Throwable {
    return doSubtract(((NgFloat)lhs).getFloatValue(), rhs);
  }

  @Override
  public Object doSubtract(final Object lhs, final long rhs) throws Throwable {
    return doSubtract(((NgFloat)lhs).getFloatValue(), rhs);
  }

  @Override
  public Object doSubtract(final Object lhs, final float rhs) throws Throwable {
    return doSubtract(((NgFloat)lhs).getFloatValue(), rhs);
  }

  @Override
  public Object doSubtract(final Object lhs, final double rhs) throws Throwable {
    return doSubtract(((NgFloat)lhs).getFloatValue(), rhs);
  }

  @Override
  public Object doSubtract(final Object lhs, final BigInteger rhs) throws Throwable {
    return doSubtract(((NgFloat)lhs).getFloatValue(), rhs);
  }

  @Override
  public Object doSubtract(final Object lhs, final BigDecimal rhs) throws Throwable {
    return doSubtract(((NgFloat)lhs).getFloatValue(), rhs);
  }

  @Override
  public Object doReverseSubtract(final byte lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(byte.class).doSubtract(lhs, ((NgFloat)rhs).getFloatValue());
  }

  @Override
  public Object doReverseSubtract(final char lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(char.class).doSubtract(lhs, ((NgFloat)rhs).getFloatValue());
  }

  @Override
  public Object doReverseSubtract(final short lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(short.class).doSubtract(lhs, ((NgFloat)rhs).getFloatValue());
  }

  @Override
  public Object doReverseSubtract(final int lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(int.class).doSubtract(lhs, ((NgFloat)rhs).getFloatValue());
  }

  @Override
  public Object doReverseSubtract(final long lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(long.class).doSubtract(lhs, ((NgFloat)rhs).getFloatValue());
  }

  @Override
  public Object doReverseSubtract(final float lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(float.class).doSubtract(lhs, ((NgFloat)rhs).getFloatValue());
  }

  @Override
  public Object doReverseSubtract(final double lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(double.class).doSubtract(lhs, ((NgFloat)rhs).getFloatValue());
  }

  @Override
  public Object doReverseSubtract(final BigInteger lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(BigInteger.class).doSubtract(lhs, ((NgFloat)rhs).getFloatValue());
  }

  @Override
  public Object doReverseSubtract(final BigDecimal lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(BigDecimal.class).doSubtract(lhs, ((NgFloat)rhs).getFloatValue());
  }

  @Override
  public Object doSubtractEquals(final Object lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseSubtractEquals(((NgFloat)lhs).getFloatValue(), rhs);
  }

  @Override
  public Object doSubtractEquals(final float lhs, final byte rhs) throws Throwable {
    return NgFloat.valueOf(lhs - rhs);
  }

  @Override
  public Object doSubtractEquals(final float lhs, final char rhs) throws Throwable {
    return NgFloat.valueOf(lhs - rhs);
  }

  @Override
  public Object doSubtractEquals(final float lhs, final short rhs) throws Throwable {
    return NgFloat.valueOf(lhs - rhs);
  }

  @Override
  public Object doSubtractEquals(final float lhs, final int rhs) throws Throwable {
    return NgFloat.valueOf(lhs - rhs);
  }

  @Override
  public Object doSubtractEquals(final float lhs, final long rhs) throws Throwable {
    return NgFloat.valueOf(lhs - rhs);
  }

  @Override
  public Object doSubtractEquals(final float lhs, final float rhs) throws Throwable {
    return NgFloat.valueOf(lhs - rhs);
  }

  @Override
  public Object doSubtractEquals(final float lhs, final double rhs) throws Throwable {
    return NgDouble.valueOf(lhs - rhs);
  }

  @Override
  public Object doSubtractEquals(final float lhs, final BigInteger rhs) throws Throwable {
    return NgFloat.valueOf(lhs - rhs.floatValue());
  }

  @Override
  public Object doSubtractEquals(final float lhs, final BigDecimal rhs) throws Throwable {
    return new BigDecimal(lhs).subtract(rhs);
  }

  @Override
  public Object doSubtractEquals(final Object lhs, final byte rhs) throws Throwable {
    return doSubtractEquals(((NgFloat)lhs).getFloatValue(), rhs);
  }

  @Override
  public Object doSubtractEquals(final Object lhs, final char rhs) throws Throwable {
    return doSubtractEquals(((NgFloat)lhs).getFloatValue(), rhs);
  }

  @Override
  public Object doSubtractEquals(final Object lhs, final short rhs) throws Throwable {
    return doSubtractEquals(((NgFloat)lhs).getFloatValue(), rhs);
  }

  @Override
  public Object doSubtractEquals(final Object lhs, final int rhs) throws Throwable {
    return doSubtractEquals(((NgFloat)lhs).getFloatValue(), rhs);
  }

  @Override
  public Object doSubtractEquals(final Object lhs, final long rhs) throws Throwable {
    return doSubtractEquals(((NgFloat)lhs).getFloatValue(), rhs);
  }

  @Override
  public Object doSubtractEquals(final Object lhs, final float rhs) throws Throwable {
    return doSubtractEquals(((NgFloat)lhs).getFloatValue(), rhs);
  }

  @Override
  public Object doSubtractEquals(final Object lhs, final double rhs) throws Throwable {
    return doSubtractEquals(((NgFloat)lhs).getFloatValue(), rhs);
  }

  @Override
  public Object doSubtractEquals(final Object lhs, final BigInteger rhs) throws Throwable {
    return doSubtractEquals(((NgFloat)lhs).getFloatValue(), rhs);
  }

  @Override
  public Object doSubtractEquals(final Object lhs, final BigDecimal rhs) throws Throwable {
    return doSubtractEquals(((NgFloat)lhs).getFloatValue(), rhs);
  }

  @Override
  public Object doReverseSubtractEquals(final byte lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(byte.class).doSubtractEquals(lhs, ((NgFloat)rhs).getFloatValue());
  }

  @Override
  public Object doReverseSubtractEquals(final char lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(char.class).doSubtractEquals(lhs, ((NgFloat)rhs).getFloatValue());
  }

  @Override
  public Object doReverseSubtractEquals(final short lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(short.class).doSubtractEquals(lhs, ((NgFloat)rhs).getFloatValue());
  }

  @Override
  public Object doReverseSubtractEquals(final int lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(int.class).doSubtractEquals(lhs, ((NgFloat)rhs).getFloatValue());
  }

  @Override
  public Object doReverseSubtractEquals(final long lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(long.class).doSubtractEquals(lhs, ((NgFloat)rhs).getFloatValue());
  }

  @Override
  public Object doReverseSubtractEquals(final float lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(float.class).doSubtractEquals(lhs, ((NgFloat)rhs).getFloatValue());
  }

  @Override
  public Object doReverseSubtractEquals(final double lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(double.class).doSubtractEquals(lhs, ((NgFloat)rhs).getFloatValue());
  }

  @Override
  public Object doReverseSubtractEquals(final BigInteger lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(BigInteger.class).doSubtractEquals(lhs, ((NgFloat)rhs).getFloatValue());
  }

  @Override
  public Object doReverseSubtractEquals(final BigDecimal lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(BigDecimal.class).doSubtractEquals(lhs, ((NgFloat)rhs).getFloatValue());
  }

  @Override
  public Object doMultiply(final Object lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseMultiply(((NgFloat)lhs).getFloatValue(), rhs);
  }

  @Override
  public Object doMultiply(final float lhs, final byte rhs) throws Throwable {
    return NgFloat.valueOf(lhs * rhs);
  }

  @Override
  public Object doMultiply(final float lhs, final char rhs) throws Throwable {
    return NgFloat.valueOf(lhs * rhs);
  }

  @Override
  public Object doMultiply(final float lhs, final short rhs) throws Throwable {
    return NgFloat.valueOf(lhs * rhs);
  }

  @Override
  public Object doMultiply(final float lhs, final int rhs) throws Throwable {
    return NgFloat.valueOf(lhs * rhs);
  }

  @Override
  public Object doMultiply(final float lhs, final long rhs) throws Throwable {
    return NgFloat.valueOf(lhs * rhs);
  }

  @Override
  public Object doMultiply(final float lhs, final float rhs) throws Throwable {
    return NgFloat.valueOf(lhs * rhs);
  }

  @Override
  public Object doMultiply(final float lhs, final double rhs) throws Throwable {
    return NgDouble.valueOf(lhs * rhs);
  }

  @Override
  public Object doMultiply(final float lhs, final BigInteger rhs) throws Throwable {
    return NgFloat.valueOf(lhs * rhs.floatValue());
  }

  @Override
  public Object doMultiply(final float lhs, final BigDecimal rhs) throws Throwable {
    return new BigDecimal(lhs).multiply(rhs);
  }

  @Override
  public Object doMultiply(final Object lhs, final byte rhs) throws Throwable {
    return doMultiply(((NgFloat)lhs).getFloatValue(), rhs);
  }

  @Override
  public Object doMultiply(final Object lhs, final char rhs) throws Throwable {
    return doMultiply(((NgFloat)lhs).getFloatValue(), rhs);
  }

  @Override
  public Object doMultiply(final Object lhs, final short rhs) throws Throwable {
    return doMultiply(((NgFloat)lhs).getFloatValue(), rhs);
  }

  @Override
  public Object doMultiply(final Object lhs, final int rhs) throws Throwable {
    return doMultiply(((NgFloat)lhs).getFloatValue(), rhs);
  }

  @Override
  public Object doMultiply(final Object lhs, final long rhs) throws Throwable {
    return doMultiply(((NgFloat)lhs).getFloatValue(), rhs);
  }

  @Override
  public Object doMultiply(final Object lhs, final float rhs) throws Throwable {
    return doMultiply(((NgFloat)lhs).getFloatValue(), rhs);
  }

  @Override
  public Object doMultiply(final Object lhs, final double rhs) throws Throwable {
    return doMultiply(((NgFloat)lhs).getFloatValue(), rhs);
  }

  @Override
  public Object doMultiply(final Object lhs, final BigInteger rhs) throws Throwable {
    return doMultiply(((NgFloat)lhs).getFloatValue(), rhs);
  }

  @Override
  public Object doMultiply(final Object lhs, final BigDecimal rhs) throws Throwable {
    return doMultiply(((NgFloat)lhs).getFloatValue(), rhs);
  }

  @Override
  public Object doReverseMultiply(final byte lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(byte.class).doMultiply(lhs, ((NgFloat)rhs).getFloatValue());
  }

  @Override
  public Object doReverseMultiply(final char lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(char.class).doMultiply(lhs, ((NgFloat)rhs).getFloatValue());
  }

  @Override
  public Object doReverseMultiply(final short lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(short.class).doMultiply(lhs, ((NgFloat)rhs).getFloatValue());
  }

  @Override
  public Object doReverseMultiply(final int lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(int.class).doMultiply(lhs, ((NgFloat)rhs).getFloatValue());
  }

  @Override
  public Object doReverseMultiply(final long lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(long.class).doMultiply(lhs, ((NgFloat)rhs).getFloatValue());
  }

  @Override
  public Object doReverseMultiply(final float lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(float.class).doMultiply(lhs, ((NgFloat)rhs).getFloatValue());
  }

  @Override
  public Object doReverseMultiply(final double lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(double.class).doMultiply(lhs, ((NgFloat)rhs).getFloatValue());
  }

  @Override
  public Object doReverseMultiply(final BigInteger lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(BigInteger.class).doMultiply(lhs, ((NgFloat)rhs).getFloatValue());
  }

  @Override
  public Object doReverseMultiply(final BigDecimal lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(BigDecimal.class).doMultiply(lhs, ((NgFloat)rhs).getFloatValue());
  }

  @Override
  public Object doMultiplyEquals(final Object lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseMultiplyEquals(((NgFloat)lhs).getFloatValue(), rhs);
  }

  @Override
  public Object doMultiplyEquals(final float lhs, final byte rhs) throws Throwable {
    return NgFloat.valueOf(lhs * rhs);
  }

  @Override
  public Object doMultiplyEquals(final float lhs, final char rhs) throws Throwable {
    return NgFloat.valueOf(lhs * rhs);
  }

  @Override
  public Object doMultiplyEquals(final float lhs, final short rhs) throws Throwable {
    return NgFloat.valueOf(lhs * rhs);
  }

  @Override
  public Object doMultiplyEquals(final float lhs, final int rhs) throws Throwable {
    return NgFloat.valueOf(lhs * rhs);
  }

  @Override
  public Object doMultiplyEquals(final float lhs, final long rhs) throws Throwable {
    return NgFloat.valueOf(lhs * rhs);
  }

  @Override
  public Object doMultiplyEquals(final float lhs, final float rhs) throws Throwable {
    return NgFloat.valueOf(lhs * rhs);
  }

  @Override
  public Object doMultiplyEquals(final float lhs, final double rhs) throws Throwable {
    return NgDouble.valueOf(lhs * rhs);
  }

  @Override
  public Object doMultiplyEquals(final float lhs, final BigInteger rhs) throws Throwable {
    return NgFloat.valueOf(lhs * rhs.floatValue());
  }

  @Override
  public Object doMultiplyEquals(final float lhs, final BigDecimal rhs) throws Throwable {
    return new BigDecimal(lhs).multiply(rhs);
  }

  @Override
  public Object doMultiplyEquals(final Object lhs, final byte rhs) throws Throwable {
    return doMultiplyEquals(((NgFloat)lhs).getFloatValue(), rhs);
  }

  @Override
  public Object doMultiplyEquals(final Object lhs, final char rhs) throws Throwable {
    return doMultiplyEquals(((NgFloat)lhs).getFloatValue(), rhs);
  }

  @Override
  public Object doMultiplyEquals(final Object lhs, final short rhs) throws Throwable {
    return doMultiplyEquals(((NgFloat)lhs).getFloatValue(), rhs);
  }

  @Override
  public Object doMultiplyEquals(final Object lhs, final int rhs) throws Throwable {
    return doMultiplyEquals(((NgFloat)lhs).getFloatValue(), rhs);
  }

  @Override
  public Object doMultiplyEquals(final Object lhs, final long rhs) throws Throwable {
    return doMultiplyEquals(((NgFloat)lhs).getFloatValue(), rhs);
  }

  @Override
  public Object doMultiplyEquals(final Object lhs, final float rhs) throws Throwable {
    return doMultiplyEquals(((NgFloat)lhs).getFloatValue(), rhs);
  }

  @Override
  public Object doMultiplyEquals(final Object lhs, final double rhs) throws Throwable {
    return doMultiplyEquals(((NgFloat)lhs).getFloatValue(), rhs);
  }

  @Override
  public Object doMultiplyEquals(final Object lhs, final BigInteger rhs) throws Throwable {
    return doMultiplyEquals(((NgFloat)lhs).getFloatValue(), rhs);
  }

  @Override
  public Object doMultiplyEquals(final Object lhs, final BigDecimal rhs) throws Throwable {
    return doMultiplyEquals(((NgFloat)lhs).getFloatValue(), rhs);
  }

  @Override
  public Object doReverseMultiplyEquals(final byte lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(byte.class).doMultiplyEquals(lhs, ((NgFloat)rhs).getFloatValue());
  }

  @Override
  public Object doReverseMultiplyEquals(final char lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(char.class).doMultiplyEquals(lhs, ((NgFloat)rhs).getFloatValue());
  }

  @Override
  public Object doReverseMultiplyEquals(final short lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(short.class).doMultiplyEquals(lhs, ((NgFloat)rhs).getFloatValue());
  }

  @Override
  public Object doReverseMultiplyEquals(final int lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(int.class).doMultiplyEquals(lhs, ((NgFloat)rhs).getFloatValue());
  }

  @Override
  public Object doReverseMultiplyEquals(final long lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(long.class).doMultiplyEquals(lhs, ((NgFloat)rhs).getFloatValue());
  }

  @Override
  public Object doReverseMultiplyEquals(final float lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(float.class).doMultiplyEquals(lhs, ((NgFloat)rhs).getFloatValue());
  }

  @Override
  public Object doReverseMultiplyEquals(final double lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(double.class).doMultiplyEquals(lhs, ((NgFloat)rhs).getFloatValue());
  }

  @Override
  public Object doReverseMultiplyEquals(final BigInteger lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(BigInteger.class).doMultiplyEquals(lhs, ((NgFloat)rhs).getFloatValue());
  }

  @Override
  public Object doReverseMultiplyEquals(final BigDecimal lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(BigDecimal.class).doMultiplyEquals(lhs, ((NgFloat)rhs).getFloatValue());
  }

  @Override
  public Object doDivide(final Object lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseDivide(((NgFloat)lhs).getFloatValue(), rhs);
  }

  @Override
  public Object doDivide(final float lhs, final byte rhs) throws Throwable {
    return NgFloat.valueOf(lhs / rhs);
  }

  @Override
  public Object doDivide(final float lhs, final char rhs) throws Throwable {
    return NgFloat.valueOf(lhs / rhs);
  }

  @Override
  public Object doDivide(final float lhs, final short rhs) throws Throwable {
    return NgFloat.valueOf(lhs / rhs);
  }

  @Override
  public Object doDivide(final float lhs, final int rhs) throws Throwable {
    return NgFloat.valueOf(lhs / rhs);
  }

  @Override
  public Object doDivide(final float lhs, final long rhs) throws Throwable {
    return NgFloat.valueOf(lhs / rhs);
  }

  @Override
  public Object doDivide(final float lhs, final float rhs) throws Throwable {
    return NgFloat.valueOf(lhs / rhs);
  }

  @Override
  public Object doDivide(final float lhs, final double rhs) throws Throwable {
    return NgDouble.valueOf(lhs / rhs);
  }

  @Override
  public Object doDivide(final float lhs, final BigInteger rhs) throws Throwable {
    return NgFloat.valueOf(lhs / rhs.floatValue());
  }

  @Override
  public Object doDivide(final float lhs, final BigDecimal rhs) throws Throwable {
    return new BigDecimal(lhs).divide(rhs);
  }

  @Override
  public Object doDivide(final Object lhs, final byte rhs) throws Throwable {
    return doDivide(((NgFloat)lhs).getFloatValue(), rhs);
  }

  @Override
  public Object doDivide(final Object lhs, final char rhs) throws Throwable {
    return doDivide(((NgFloat)lhs).getFloatValue(), rhs);
  }

  @Override
  public Object doDivide(final Object lhs, final short rhs) throws Throwable {
    return doDivide(((NgFloat)lhs).getFloatValue(), rhs);
  }

  @Override
  public Object doDivide(final Object lhs, final int rhs) throws Throwable {
    return doDivide(((NgFloat)lhs).getFloatValue(), rhs);
  }

  @Override
  public Object doDivide(final Object lhs, final long rhs) throws Throwable {
    return doDivide(((NgFloat)lhs).getFloatValue(), rhs);
  }

  @Override
  public Object doDivide(final Object lhs, final float rhs) throws Throwable {
    return doDivide(((NgFloat)lhs).getFloatValue(), rhs);
  }

  @Override
  public Object doDivide(final Object lhs, final double rhs) throws Throwable {
    return doDivide(((NgFloat)lhs).getFloatValue(), rhs);
  }

  @Override
  public Object doDivide(final Object lhs, final BigInteger rhs) throws Throwable {
    return doDivide(((NgFloat)lhs).getFloatValue(), rhs);
  }

  @Override
  public Object doDivide(final Object lhs, final BigDecimal rhs) throws Throwable {
    return doDivide(((NgFloat)lhs).getFloatValue(), rhs);
  }

  @Override
  public Object doReverseDivide(final byte lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(byte.class).doDivide(lhs, ((NgFloat)rhs).getFloatValue());
  }

  @Override
  public Object doReverseDivide(final char lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(char.class).doDivide(lhs, ((NgFloat)rhs).getFloatValue());
  }

  @Override
  public Object doReverseDivide(final short lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(short.class).doDivide(lhs, ((NgFloat)rhs).getFloatValue());
  }

  @Override
  public Object doReverseDivide(final int lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(int.class).doDivide(lhs, ((NgFloat)rhs).getFloatValue());
  }

  @Override
  public Object doReverseDivide(final long lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(long.class).doDivide(lhs, ((NgFloat)rhs).getFloatValue());
  }

  @Override
  public Object doReverseDivide(final float lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(float.class).doDivide(lhs, ((NgFloat)rhs).getFloatValue());
  }

  @Override
  public Object doReverseDivide(final double lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(double.class).doDivide(lhs, ((NgFloat)rhs).getFloatValue());
  }

  @Override
  public Object doReverseDivide(final BigInteger lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(BigInteger.class).doDivide(lhs, ((NgFloat)rhs).getFloatValue());
  }

  @Override
  public Object doReverseDivide(final BigDecimal lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(BigDecimal.class).doDivide(lhs, ((NgFloat)rhs).getFloatValue());
  }

  @Override
  public Object doDivideEquals(final Object lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseDivideEquals(((NgFloat)lhs).getFloatValue(), rhs);
  }

  @Override
  public Object doDivideEquals(final float lhs, final byte rhs) throws Throwable {
    return NgFloat.valueOf(lhs / rhs);
  }

  @Override
  public Object doDivideEquals(final float lhs, final char rhs) throws Throwable {
    return NgFloat.valueOf(lhs / rhs);
  }

  @Override
  public Object doDivideEquals(final float lhs, final short rhs) throws Throwable {
    return NgFloat.valueOf(lhs / rhs);
  }

  @Override
  public Object doDivideEquals(final float lhs, final int rhs) throws Throwable {
    return NgFloat.valueOf(lhs / rhs);
  }

  @Override
  public Object doDivideEquals(final float lhs, final long rhs) throws Throwable {
    return NgFloat.valueOf(lhs / rhs);
  }

  @Override
  public Object doDivideEquals(final float lhs, final float rhs) throws Throwable {
    return NgFloat.valueOf(lhs / rhs);
  }

  @Override
  public Object doDivideEquals(final float lhs, final double rhs) throws Throwable {
    return NgDouble.valueOf(lhs / rhs);
  }

  @Override
  public Object doDivideEquals(final float lhs, final BigInteger rhs) throws Throwable {
    return NgFloat.valueOf(lhs / rhs.floatValue());
  }

  @Override
  public Object doDivideEquals(final float lhs, final BigDecimal rhs) throws Throwable {
    return new BigDecimal(lhs).divide(rhs);
  }

  @Override
  public Object doDivideEquals(final Object lhs, final byte rhs) throws Throwable {
    return doDivideEquals(((NgFloat)lhs).getFloatValue(), rhs);
  }

  @Override
  public Object doDivideEquals(final Object lhs, final char rhs) throws Throwable {
    return doDivideEquals(((NgFloat)lhs).getFloatValue(), rhs);
  }

  @Override
  public Object doDivideEquals(final Object lhs, final short rhs) throws Throwable {
    return doDivideEquals(((NgFloat)lhs).getFloatValue(), rhs);
  }

  @Override
  public Object doDivideEquals(final Object lhs, final int rhs) throws Throwable {
    return doDivideEquals(((NgFloat)lhs).getFloatValue(), rhs);
  }

  @Override
  public Object doDivideEquals(final Object lhs, final long rhs) throws Throwable {
    return doDivideEquals(((NgFloat)lhs).getFloatValue(), rhs);
  }

  @Override
  public Object doDivideEquals(final Object lhs, final float rhs) throws Throwable {
    return doDivideEquals(((NgFloat)lhs).getFloatValue(), rhs);
  }

  @Override
  public Object doDivideEquals(final Object lhs, final double rhs) throws Throwable {
    return doDivideEquals(((NgFloat)lhs).getFloatValue(), rhs);
  }

  @Override
  public Object doDivideEquals(final Object lhs, final BigInteger rhs) throws Throwable {
    return doDivideEquals(((NgFloat)lhs).getFloatValue(), rhs);
  }

  @Override
  public Object doDivideEquals(final Object lhs, final BigDecimal rhs) throws Throwable {
    return doDivideEquals(((NgFloat)lhs).getFloatValue(), rhs);
  }

  @Override
  public Object doReverseDivideEquals(final byte lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(byte.class).doDivideEquals(lhs, ((NgFloat)rhs).getFloatValue());
  }

  @Override
  public Object doReverseDivideEquals(final char lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(char.class).doDivideEquals(lhs, ((NgFloat)rhs).getFloatValue());
  }

  @Override
  public Object doReverseDivideEquals(final short lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(short.class).doDivideEquals(lhs, ((NgFloat)rhs).getFloatValue());
  }

  @Override
  public Object doReverseDivideEquals(final int lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(int.class).doDivideEquals(lhs, ((NgFloat)rhs).getFloatValue());
  }

  @Override
  public Object doReverseDivideEquals(final long lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(long.class).doDivideEquals(lhs, ((NgFloat)rhs).getFloatValue());
  }

  @Override
  public Object doReverseDivideEquals(final float lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(float.class).doDivideEquals(lhs, ((NgFloat)rhs).getFloatValue());
  }

  @Override
  public Object doReverseDivideEquals(final double lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(double.class).doDivideEquals(lhs, ((NgFloat)rhs).getFloatValue());
  }

  @Override
  public Object doReverseDivideEquals(final BigInteger lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(BigInteger.class).doDivideEquals(lhs, ((NgFloat)rhs).getFloatValue());
  }

  @Override
  public Object doReverseDivideEquals(final BigDecimal lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(BigDecimal.class).doDivideEquals(lhs, ((NgFloat)rhs).getFloatValue());
  }

  @Override
  public Object doIntegerDivide(final Object lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseIntegerDivide(((NgFloat)lhs).getFloatValue(), rhs);
  }

  @Override
  public Object doIntegerDivide(final float lhs, final byte rhs) throws Throwable {
    return NgFloat.valueOf((float)Math.floor(lhs / rhs));
  }

  @Override
  public Object doIntegerDivide(final float lhs, final char rhs) throws Throwable {
    return NgFloat.valueOf((float)Math.floor(lhs / rhs));
  }

  @Override
  public Object doIntegerDivide(final float lhs, final short rhs) throws Throwable {
    return NgFloat.valueOf((float)Math.floor(lhs / rhs));
  }

  @Override
  public Object doIntegerDivide(final float lhs, final int rhs) throws Throwable {
    return NgFloat.valueOf((float)Math.floor(lhs / rhs));
  }

  @Override
  public Object doIntegerDivide(final float lhs, final long rhs) throws Throwable {
    return NgFloat.valueOf((float)Math.floor(lhs / rhs));
  }

  @Override
  public Object doIntegerDivide(final float lhs, final float rhs) throws Throwable {
    return NgFloat.valueOf((float)Math.floor(lhs / rhs));
  }

  @Override
  public Object doIntegerDivide(final float lhs, final double rhs) throws Throwable {
    return NgDouble.valueOf((float)Math.floor(lhs / rhs));
  }

  @Override
  public Object doIntegerDivide(final float lhs, final BigInteger rhs) throws Throwable {
    return BigDecimal.valueOf(lhs).divideToIntegralValue(new BigDecimal(rhs));
  }

  @Override
  public Object doIntegerDivide(final float lhs, final BigDecimal rhs) throws Throwable {
    return new BigDecimal(lhs).divideToIntegralValue(rhs);
  }

  @Override
  public Object doIntegerDivide(final Object lhs, final byte rhs) throws Throwable {
    return doIntegerDivide(((NgFloat)lhs).getFloatValue(), rhs);
  }

  @Override
  public Object doIntegerDivide(final Object lhs, final char rhs) throws Throwable {
    return doIntegerDivide(((NgFloat)lhs).getFloatValue(), rhs);
  }

  @Override
  public Object doIntegerDivide(final Object lhs, final short rhs) throws Throwable {
    return doIntegerDivide(((NgFloat)lhs).getFloatValue(), rhs);
  }

  @Override
  public Object doIntegerDivide(final Object lhs, final int rhs) throws Throwable {
    return doIntegerDivide(((NgFloat)lhs).getFloatValue(), rhs);
  }

  @Override
  public Object doIntegerDivide(final Object lhs, final long rhs) throws Throwable {
    return doIntegerDivide(((NgFloat)lhs).getFloatValue(), rhs);
  }

  @Override
  public Object doIntegerDivide(final Object lhs, final float rhs) throws Throwable {
    return doIntegerDivide(((NgFloat)lhs).getFloatValue(), rhs);
  }

  @Override
  public Object doIntegerDivide(final Object lhs, final double rhs) throws Throwable {
    return doIntegerDivide(((NgFloat)lhs).getFloatValue(), rhs);
  }

  @Override
  public Object doIntegerDivide(final Object lhs, final BigInteger rhs) throws Throwable {
    return doIntegerDivide(((NgFloat)lhs).getFloatValue(), rhs);
  }

  @Override
  public Object doIntegerDivide(final Object lhs, final BigDecimal rhs) throws Throwable {
    return doIntegerDivide(((NgFloat)lhs).getFloatValue(), rhs);
  }

  @Override
  public Object doReverseIntegerDivide(final byte lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(byte.class).doIntegerDivide(lhs, ((NgFloat)rhs).getFloatValue());
  }

  @Override
  public Object doReverseIntegerDivide(final char lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(char.class).doIntegerDivide(lhs, ((NgFloat)rhs).getFloatValue());
  }

  @Override
  public Object doReverseIntegerDivide(final short lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(short.class).doIntegerDivide(lhs, ((NgFloat)rhs).getFloatValue());
  }

  @Override
  public Object doReverseIntegerDivide(final int lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(int.class).doIntegerDivide(lhs, ((NgFloat)rhs).getFloatValue());
  }

  @Override
  public Object doReverseIntegerDivide(final long lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(long.class).doIntegerDivide(lhs, ((NgFloat)rhs).getFloatValue());
  }

  @Override
  public Object doReverseIntegerDivide(final float lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(float.class).doIntegerDivide(lhs, ((NgFloat)rhs).getFloatValue());
  }

  @Override
  public Object doReverseIntegerDivide(final double lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(double.class).doIntegerDivide(lhs, ((NgFloat)rhs).getFloatValue());
  }

  @Override
  public Object doReverseIntegerDivide(final BigInteger lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(BigInteger.class).doIntegerDivide(lhs, ((NgFloat)rhs).getFloatValue());
  }

  @Override
  public Object doReverseIntegerDivide(final BigDecimal lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(BigDecimal.class).doIntegerDivide(lhs, ((NgFloat)rhs).getFloatValue());
  }

  @Override
  public Object doIntegerDivideEquals(final Object lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseIntegerDivideEquals(((NgFloat)lhs).getFloatValue(), rhs);
  }

  @Override
  public Object doIntegerDivideEquals(final float lhs, final byte rhs) throws Throwable {
    return NgFloat.valueOf((float)Math.floor(lhs / rhs));
  }

  @Override
  public Object doIntegerDivideEquals(final float lhs, final char rhs) throws Throwable {
    return NgFloat.valueOf((float)Math.floor(lhs / rhs));
  }

  @Override
  public Object doIntegerDivideEquals(final float lhs, final short rhs) throws Throwable {
    return NgFloat.valueOf((float)Math.floor(lhs / rhs));
  }

  @Override
  public Object doIntegerDivideEquals(final float lhs, final int rhs) throws Throwable {
    return NgFloat.valueOf((float)Math.floor(lhs / rhs));
  }

  @Override
  public Object doIntegerDivideEquals(final float lhs, final long rhs) throws Throwable {
    return NgFloat.valueOf((float)Math.floor(lhs / rhs));
  }

  @Override
  public Object doIntegerDivideEquals(final float lhs, final float rhs) throws Throwable {
    return NgFloat.valueOf((float)Math.floor(lhs / rhs));
  }

  @Override
  public Object doIntegerDivideEquals(final float lhs, final double rhs) throws Throwable {
    return NgDouble.valueOf((float)Math.floor(lhs / rhs));
  }

  @Override
  public Object doIntegerDivideEquals(final float lhs, final BigInteger rhs) throws Throwable {
    return BigDecimal.valueOf(lhs).divideToIntegralValue(new BigDecimal(rhs));
  }

  @Override
  public Object doIntegerDivideEquals(final float lhs, final BigDecimal rhs) throws Throwable {
    return new BigDecimal(lhs).divideToIntegralValue(rhs);
  }

  @Override
  public Object doIntegerDivideEquals(final Object lhs, final byte rhs) throws Throwable {
    return doIntegerDivideEquals(((NgFloat)lhs).getFloatValue(), rhs);
  }

  @Override
  public Object doIntegerDivideEquals(final Object lhs, final char rhs) throws Throwable {
    return doIntegerDivideEquals(((NgFloat)lhs).getFloatValue(), rhs);
  }

  @Override
  public Object doIntegerDivideEquals(final Object lhs, final short rhs) throws Throwable {
    return doIntegerDivideEquals(((NgFloat)lhs).getFloatValue(), rhs);
  }

  @Override
  public Object doIntegerDivideEquals(final Object lhs, final int rhs) throws Throwable {
    return doIntegerDivideEquals(((NgFloat)lhs).getFloatValue(), rhs);
  }

  @Override
  public Object doIntegerDivideEquals(final Object lhs, final long rhs) throws Throwable {
    return doIntegerDivideEquals(((NgFloat)lhs).getFloatValue(), rhs);
  }

  @Override
  public Object doIntegerDivideEquals(final Object lhs, final float rhs) throws Throwable {
    return doIntegerDivideEquals(((NgFloat)lhs).getFloatValue(), rhs);
  }

  @Override
  public Object doIntegerDivideEquals(final Object lhs, final double rhs) throws Throwable {
    return doIntegerDivideEquals(((NgFloat)lhs).getFloatValue(), rhs);
  }

  @Override
  public Object doIntegerDivideEquals(final Object lhs, final BigInteger rhs) throws Throwable {
    return doIntegerDivideEquals(((NgFloat)lhs).getFloatValue(), rhs);
  }

  @Override
  public Object doIntegerDivideEquals(final Object lhs, final BigDecimal rhs) throws Throwable {
    return doIntegerDivideEquals(((NgFloat)lhs).getFloatValue(), rhs);
  }

  @Override
  public Object doReverseIntegerDivideEquals(final byte lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(byte.class).doIntegerDivideEquals(lhs, ((NgFloat)rhs).getFloatValue());
  }

  @Override
  public Object doReverseIntegerDivideEquals(final char lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(char.class).doIntegerDivideEquals(lhs, ((NgFloat)rhs).getFloatValue());
  }

  @Override
  public Object doReverseIntegerDivideEquals(final short lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(short.class).doIntegerDivideEquals(lhs, ((NgFloat)rhs).getFloatValue());
  }

  @Override
  public Object doReverseIntegerDivideEquals(final int lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(int.class).doIntegerDivideEquals(lhs, ((NgFloat)rhs).getFloatValue());
  }

  @Override
  public Object doReverseIntegerDivideEquals(final long lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(long.class).doIntegerDivideEquals(lhs, ((NgFloat)rhs).getFloatValue());
  }

  @Override
  public Object doReverseIntegerDivideEquals(final float lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(float.class).doIntegerDivideEquals(lhs, ((NgFloat)rhs).getFloatValue());
  }

  @Override
  public Object doReverseIntegerDivideEquals(final double lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(double.class).doIntegerDivideEquals(lhs, ((NgFloat)rhs).getFloatValue());
  }

  @Override
  public Object doReverseIntegerDivideEquals(final BigInteger lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(BigInteger.class).doIntegerDivideEquals(lhs, ((NgFloat)rhs).getFloatValue());
  }

  @Override
  public Object doReverseIntegerDivideEquals(final BigDecimal lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(BigDecimal.class).doIntegerDivideEquals(lhs, ((NgFloat)rhs).getFloatValue());
  }

  @Override
  public Object doCompare(final Object lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseCompare(((NgFloat)lhs).getFloatValue(), rhs);
  }

  @Override
  public Object doCompare(final float lhs, final byte rhs) throws Throwable {
    if (lhs == rhs) return NgInt.ZERO;
    if (lhs < rhs) return NgInt.MINUS_ONE;
    return NgInt.ONE;
  }

  @Override
  public Object doCompare(final float lhs, final char rhs) throws Throwable {
    if (lhs == rhs) return NgInt.ZERO;
    if (lhs < rhs) return NgInt.MINUS_ONE;
    return NgInt.ONE;
  }

  @Override
  public Object doCompare(final float lhs, final short rhs) throws Throwable {
    if (lhs == rhs) return NgInt.ZERO;
    if (lhs < rhs) return NgInt.MINUS_ONE;
    return NgInt.ONE;
  }

  @Override
  public Object doCompare(final float lhs, final int rhs) throws Throwable {
    if (lhs == rhs) return NgInt.ZERO;
    if (lhs < rhs) return NgInt.MINUS_ONE;
    return NgInt.ONE;
  }

  @Override
  public Object doCompare(final float lhs, final long rhs) throws Throwable {
    if (lhs == rhs) return NgInt.ZERO;
    if (lhs < rhs) return NgInt.MINUS_ONE;
    return NgInt.ONE;
  }

  @Override
  public Object doCompare(final float lhs, final float rhs) throws Throwable {
    if (lhs == rhs) return NgInt.ZERO;
    if (lhs < rhs) return NgInt.MINUS_ONE;
    return NgInt.ONE;
  }

  @Override
  public Object doCompare(final float lhs, final double rhs) throws Throwable {
    if (lhs == rhs) return NgInt.ZERO;
    if (lhs < rhs) return NgInt.MINUS_ONE;
    return NgInt.ONE;
  }

  @Override
  public Object doCompare(final float lhs, final BigInteger rhs) throws Throwable {
    return NgInt.valueOf(new BigDecimal(lhs).compareTo(new BigDecimal(rhs)));
  }

  @Override
  public Object doCompare(final float lhs, final BigDecimal rhs) throws Throwable {
    return NgInt.valueOf(new BigDecimal(lhs).compareTo(rhs));
  }

  @Override
  public Object doCompare(final Object lhs, final byte rhs) throws Throwable {
    return doCompare(((NgFloat)lhs).getFloatValue(), rhs);
  }

  @Override
  public Object doCompare(final Object lhs, final char rhs) throws Throwable {
    return doCompare(((NgFloat)lhs).getFloatValue(), rhs);
  }

  @Override
  public Object doCompare(final Object lhs, final short rhs) throws Throwable {
    return doCompare(((NgFloat)lhs).getFloatValue(), rhs);
  }

  @Override
  public Object doCompare(final Object lhs, final int rhs) throws Throwable {
    return doCompare(((NgFloat)lhs).getFloatValue(), rhs);
  }

  @Override
  public Object doCompare(final Object lhs, final long rhs) throws Throwable {
    return doCompare(((NgFloat)lhs).getFloatValue(), rhs);
  }

  @Override
  public Object doCompare(final Object lhs, final float rhs) throws Throwable {
    return doCompare(((NgFloat)lhs).getFloatValue(), rhs);
  }

  @Override
  public Object doCompare(final Object lhs, final double rhs) throws Throwable {
    return doCompare(((NgFloat)lhs).getFloatValue(), rhs);
  }

  @Override
  public Object doCompare(final Object lhs, final BigInteger rhs) throws Throwable {
    return doCompare(((NgFloat)lhs).getFloatValue(), rhs);
  }

  @Override
  public Object doCompare(final Object lhs, final BigDecimal rhs) throws Throwable {
    return doCompare(((NgFloat)lhs).getFloatValue(), rhs);
  }

  @Override
  public Object doReverseCompare(final byte lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(byte.class).doCompare(lhs, ((NgFloat)rhs).getFloatValue());
  }

  @Override
  public Object doReverseCompare(final char lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(char.class).doCompare(lhs, ((NgFloat)rhs).getFloatValue());
  }

  @Override
  public Object doReverseCompare(final short lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(short.class).doCompare(lhs, ((NgFloat)rhs).getFloatValue());
  }

  @Override
  public Object doReverseCompare(final int lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(int.class).doCompare(lhs, ((NgFloat)rhs).getFloatValue());
  }

  @Override
  public Object doReverseCompare(final long lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(long.class).doCompare(lhs, ((NgFloat)rhs).getFloatValue());
  }

  @Override
  public Object doReverseCompare(final float lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(float.class).doCompare(lhs, ((NgFloat)rhs).getFloatValue());
  }

  @Override
  public Object doReverseCompare(final double lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(double.class).doCompare(lhs, ((NgFloat)rhs).getFloatValue());
  }

  @Override
  public Object doReverseCompare(final BigInteger lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(BigInteger.class).doCompare(lhs, ((NgFloat)rhs).getFloatValue());
  }

  @Override
  public Object doReverseCompare(final BigDecimal lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(BigDecimal.class).doCompare(lhs, ((NgFloat)rhs).getFloatValue());
  }

  @Override
  public Object doEquals(final Object lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseEquals(((NgFloat)lhs).getFloatValue(), rhs);
  }

  @Override
  public Object doEquals(final float lhs, final byte rhs) throws Throwable {
    return (lhs == rhs) ? NgBoolean.TRUE : NgBoolean.FALSE;
  }

  @Override
  public Object doEquals(final float lhs, final char rhs) throws Throwable {
    return (lhs == rhs) ? NgBoolean.TRUE : NgBoolean.FALSE;
  }

  @Override
  public Object doEquals(final float lhs, final short rhs) throws Throwable {
    return (lhs == rhs) ? NgBoolean.TRUE : NgBoolean.FALSE;
  }

  @Override
  public Object doEquals(final float lhs, final int rhs) throws Throwable {
    return (lhs == rhs) ? NgBoolean.TRUE : NgBoolean.FALSE;
  }

  @Override
  public Object doEquals(final float lhs, final long rhs) throws Throwable {
    return (lhs == rhs) ? NgBoolean.TRUE : NgBoolean.FALSE;
  }

  @Override
  public Object doEquals(final float lhs, final float rhs) throws Throwable {
    return (lhs == rhs) ? NgBoolean.TRUE : NgBoolean.FALSE;
  }

  @Override
  public Object doEquals(final float lhs, final double rhs) throws Throwable {
    return (lhs == rhs) ? NgBoolean.TRUE : NgBoolean.FALSE;
  }

  @Override
  public Object doEquals(final float lhs, final BigInteger rhs) throws Throwable {
    return (lhs == rhs.floatValue()) ? NgBoolean.TRUE : NgBoolean.FALSE;
  }

  @Override
  public Object doEquals(final float lhs, final BigDecimal rhs) throws Throwable {
    return (new BigDecimal(lhs).compareTo(rhs) == 0) ? NgBoolean.TRUE : NgBoolean.FALSE;
  }

  @Override
  public Object doEquals(final Object lhs, final byte rhs) throws Throwable {
    return doEquals(((NgFloat)lhs).getFloatValue(), rhs);
  }

  @Override
  public Object doEquals(final Object lhs, final char rhs) throws Throwable {
    return doEquals(((NgFloat)lhs).getFloatValue(), rhs);
  }

  @Override
  public Object doEquals(final Object lhs, final short rhs) throws Throwable {
    return doEquals(((NgFloat)lhs).getFloatValue(), rhs);
  }

  @Override
  public Object doEquals(final Object lhs, final int rhs) throws Throwable {
    return doEquals(((NgFloat)lhs).getFloatValue(), rhs);
  }

  @Override
  public Object doEquals(final Object lhs, final long rhs) throws Throwable {
    return doEquals(((NgFloat)lhs).getFloatValue(), rhs);
  }

  @Override
  public Object doEquals(final Object lhs, final float rhs) throws Throwable {
    return doEquals(((NgFloat)lhs).getFloatValue(), rhs);
  }

  @Override
  public Object doEquals(final Object lhs, final double rhs) throws Throwable {
    return doEquals(((NgFloat)lhs).getFloatValue(), rhs);
  }

  @Override
  public Object doEquals(final Object lhs, final BigInteger rhs) throws Throwable {
    return doEquals(((NgFloat)lhs).getFloatValue(), rhs);
  }

  @Override
  public Object doEquals(final Object lhs, final BigDecimal rhs) throws Throwable {
    return doEquals(((NgFloat)lhs).getFloatValue(), rhs);
  }

  @Override
  public Object doReverseEquals(final byte lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(byte.class).doEquals(lhs, ((NgFloat)rhs).getFloatValue());
  }

  @Override
  public Object doReverseEquals(final char lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(char.class).doEquals(lhs, ((NgFloat)rhs).getFloatValue());
  }

  @Override
  public Object doReverseEquals(final short lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(short.class).doEquals(lhs, ((NgFloat)rhs).getFloatValue());
  }

  @Override
  public Object doReverseEquals(final int lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(int.class).doEquals(lhs, ((NgFloat)rhs).getFloatValue());
  }

  @Override
  public Object doReverseEquals(final long lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(long.class).doEquals(lhs, ((NgFloat)rhs).getFloatValue());
  }

  @Override
  public Object doReverseEquals(final float lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(float.class).doEquals(lhs, ((NgFloat)rhs).getFloatValue());
  }

  @Override
  public Object doReverseEquals(final double lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(double.class).doEquals(lhs, ((NgFloat)rhs).getFloatValue());
  }

  @Override
  public Object doReverseEquals(final BigInteger lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(BigInteger.class).doEquals(lhs, ((NgFloat)rhs).getFloatValue());
  }

  @Override
  public Object doReverseEquals(final BigDecimal lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(BigDecimal.class).doEquals(lhs, ((NgFloat)rhs).getFloatValue());
  }

  @Override
  public boolean doEqualsBoolean(final Object lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseEqualsBoolean(((NgFloat)lhs).getFloatValue(), rhs);
  }

  @Override
  public boolean doEqualsBoolean(final float lhs, final byte rhs) throws Throwable {
    return lhs == rhs;
  }

  @Override
  public boolean doEqualsBoolean(final float lhs, final char rhs) throws Throwable {
    return lhs == rhs;
  }

  @Override
  public boolean doEqualsBoolean(final float lhs, final short rhs) throws Throwable {
    return lhs == rhs;
  }

  @Override
  public boolean doEqualsBoolean(final float lhs, final int rhs) throws Throwable {
    return lhs == rhs;
  }

  @Override
  public boolean doEqualsBoolean(final float lhs, final long rhs) throws Throwable {
    return lhs == rhs;
  }

  @Override
  public boolean doEqualsBoolean(final float lhs, final float rhs) throws Throwable {
    return lhs == rhs;
  }

  @Override
  public boolean doEqualsBoolean(final float lhs, final double rhs) throws Throwable {
    return lhs == rhs;
  }

  @Override
  public boolean doEqualsBoolean(final float lhs, final BigInteger rhs) throws Throwable {
    return lhs == rhs.floatValue();
  }

  @Override
  public boolean doEqualsBoolean(final float lhs, final BigDecimal rhs) throws Throwable {
    return new BigDecimal(lhs).compareTo(rhs) == 0;
  }

  @Override
  public boolean doEqualsBoolean(final Object lhs, final byte rhs) throws Throwable {
    return doEqualsBoolean(((NgFloat)lhs).getFloatValue(), rhs);
  }

  @Override
  public boolean doEqualsBoolean(final Object lhs, final char rhs) throws Throwable {
    return doEqualsBoolean(((NgFloat)lhs).getFloatValue(), rhs);
  }

  @Override
  public boolean doEqualsBoolean(final Object lhs, final short rhs) throws Throwable {
    return doEqualsBoolean(((NgFloat)lhs).getFloatValue(), rhs);
  }

  @Override
  public boolean doEqualsBoolean(final Object lhs, final int rhs) throws Throwable {
    return doEqualsBoolean(((NgFloat)lhs).getFloatValue(), rhs);
  }

  @Override
  public boolean doEqualsBoolean(final Object lhs, final long rhs) throws Throwable {
    return doEqualsBoolean(((NgFloat)lhs).getFloatValue(), rhs);
  }

  @Override
  public boolean doEqualsBoolean(final Object lhs, final float rhs) throws Throwable {
    return doEqualsBoolean(((NgFloat)lhs).getFloatValue(), rhs);
  }

  @Override
  public boolean doEqualsBoolean(final Object lhs, final double rhs) throws Throwable {
    return doEqualsBoolean(((NgFloat)lhs).getFloatValue(), rhs);
  }

  @Override
  public boolean doEqualsBoolean(final Object lhs, final BigInteger rhs) throws Throwable {
    return doEqualsBoolean(((NgFloat)lhs).getFloatValue(), rhs);
  }

  @Override
  public boolean doEqualsBoolean(final Object lhs, final BigDecimal rhs) throws Throwable {
    return doEqualsBoolean(((NgFloat)lhs).getFloatValue(), rhs);
  }

  @Override
  public boolean doReverseEqualsBoolean(final byte lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(byte.class).doEqualsBoolean(lhs, ((NgFloat)rhs).getFloatValue());
  }

  @Override
  public boolean doReverseEqualsBoolean(final char lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(char.class).doEqualsBoolean(lhs, ((NgFloat)rhs).getFloatValue());
  }

  @Override
  public boolean doReverseEqualsBoolean(final short lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(short.class).doEqualsBoolean(lhs, ((NgFloat)rhs).getFloatValue());
  }

  @Override
  public boolean doReverseEqualsBoolean(final int lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(int.class).doEqualsBoolean(lhs, ((NgFloat)rhs).getFloatValue());
  }

  @Override
  public boolean doReverseEqualsBoolean(final long lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(long.class).doEqualsBoolean(lhs, ((NgFloat)rhs).getFloatValue());
  }

  @Override
  public boolean doReverseEqualsBoolean(final float lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(float.class).doEqualsBoolean(lhs, ((NgFloat)rhs).getFloatValue());
  }

  @Override
  public boolean doReverseEqualsBoolean(final double lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(double.class).doEqualsBoolean(lhs, ((NgFloat)rhs).getFloatValue());
  }

  @Override
  public boolean doReverseEqualsBoolean(final BigInteger lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(BigInteger.class).doEqualsBoolean(lhs, ((NgFloat)rhs).getFloatValue());
  }

  @Override
  public boolean doReverseEqualsBoolean(final BigDecimal lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(BigDecimal.class).doEqualsBoolean(lhs, ((NgFloat)rhs).getFloatValue());
  }

  @Override
  public Object doNotEquals(final Object lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseNotEquals(((NgFloat)lhs).getFloatValue(), rhs);
  }

  @Override
  public Object doNotEquals(final float lhs, final byte rhs) throws Throwable {
    return (lhs != rhs) ? NgBoolean.TRUE : NgBoolean.FALSE;
  }

  @Override
  public Object doNotEquals(final float lhs, final char rhs) throws Throwable {
    return (lhs != rhs) ? NgBoolean.TRUE : NgBoolean.FALSE;
  }

  @Override
  public Object doNotEquals(final float lhs, final short rhs) throws Throwable {
    return (lhs != rhs) ? NgBoolean.TRUE : NgBoolean.FALSE;
  }

  @Override
  public Object doNotEquals(final float lhs, final int rhs) throws Throwable {
    return (lhs != rhs) ? NgBoolean.TRUE : NgBoolean.FALSE;
  }

  @Override
  public Object doNotEquals(final float lhs, final long rhs) throws Throwable {
    return (lhs != rhs) ? NgBoolean.TRUE : NgBoolean.FALSE;
  }

  @Override
  public Object doNotEquals(final float lhs, final float rhs) throws Throwable {
    return (lhs != rhs) ? NgBoolean.TRUE : NgBoolean.FALSE;
  }

  @Override
  public Object doNotEquals(final float lhs, final double rhs) throws Throwable {
    return (lhs != rhs) ? NgBoolean.TRUE : NgBoolean.FALSE;
  }

  @Override
  public Object doNotEquals(final float lhs, final BigInteger rhs) throws Throwable {
    return (lhs != rhs.floatValue()) ? NgBoolean.TRUE : NgBoolean.FALSE;
  }

  @Override
  public Object doNotEquals(final float lhs, final BigDecimal rhs) throws Throwable {
    return (new BigDecimal(lhs).compareTo(rhs) != 0) ? NgBoolean.TRUE : NgBoolean.FALSE;
  }

  @Override
  public Object doNotEquals(final Object lhs, final byte rhs) throws Throwable {
    return doNotEquals(((NgFloat)lhs).getFloatValue(), rhs);
  }

  @Override
  public Object doNotEquals(final Object lhs, final char rhs) throws Throwable {
    return doNotEquals(((NgFloat)lhs).getFloatValue(), rhs);
  }

  @Override
  public Object doNotEquals(final Object lhs, final short rhs) throws Throwable {
    return doNotEquals(((NgFloat)lhs).getFloatValue(), rhs);
  }

  @Override
  public Object doNotEquals(final Object lhs, final int rhs) throws Throwable {
    return doNotEquals(((NgFloat)lhs).getFloatValue(), rhs);
  }

  @Override
  public Object doNotEquals(final Object lhs, final long rhs) throws Throwable {
    return doNotEquals(((NgFloat)lhs).getFloatValue(), rhs);
  }

  @Override
  public Object doNotEquals(final Object lhs, final float rhs) throws Throwable {
    return doNotEquals(((NgFloat)lhs).getFloatValue(), rhs);
  }

  @Override
  public Object doNotEquals(final Object lhs, final double rhs) throws Throwable {
    return doNotEquals(((NgFloat)lhs).getFloatValue(), rhs);
  }

  @Override
  public Object doNotEquals(final Object lhs, final BigInteger rhs) throws Throwable {
    return doNotEquals(((NgFloat)lhs).getFloatValue(), rhs);
  }

  @Override
  public Object doNotEquals(final Object lhs, final BigDecimal rhs) throws Throwable {
    return doNotEquals(((NgFloat)lhs).getFloatValue(), rhs);
  }

  @Override
  public Object doReverseNotEquals(final byte lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(byte.class).doNotEquals(lhs, ((NgFloat)rhs).getFloatValue());
  }

  @Override
  public Object doReverseNotEquals(final char lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(char.class).doNotEquals(lhs, ((NgFloat)rhs).getFloatValue());
  }

  @Override
  public Object doReverseNotEquals(final short lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(short.class).doNotEquals(lhs, ((NgFloat)rhs).getFloatValue());
  }

  @Override
  public Object doReverseNotEquals(final int lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(int.class).doNotEquals(lhs, ((NgFloat)rhs).getFloatValue());
  }

  @Override
  public Object doReverseNotEquals(final long lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(long.class).doNotEquals(lhs, ((NgFloat)rhs).getFloatValue());
  }

  @Override
  public Object doReverseNotEquals(final float lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(float.class).doNotEquals(lhs, ((NgFloat)rhs).getFloatValue());
  }

  @Override
  public Object doReverseNotEquals(final double lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(double.class).doNotEquals(lhs, ((NgFloat)rhs).getFloatValue());
  }

  @Override
  public Object doReverseNotEquals(final BigInteger lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(BigInteger.class).doNotEquals(lhs, ((NgFloat)rhs).getFloatValue());
  }

  @Override
  public Object doReverseNotEquals(final BigDecimal lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(BigDecimal.class).doNotEquals(lhs, ((NgFloat)rhs).getFloatValue());
  }

  @Override
  public boolean doNotEqualsBoolean(final Object lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseNotEqualsBoolean(((NgFloat)lhs).getFloatValue(), rhs);
  }

  @Override
  public boolean doNotEqualsBoolean(final float lhs, final byte rhs) throws Throwable {
    return lhs != rhs;
  }

  @Override
  public boolean doNotEqualsBoolean(final float lhs, final char rhs) throws Throwable {
    return lhs != rhs;
  }

  @Override
  public boolean doNotEqualsBoolean(final float lhs, final short rhs) throws Throwable {
    return lhs != rhs;
  }

  @Override
  public boolean doNotEqualsBoolean(final float lhs, final int rhs) throws Throwable {
    return lhs != rhs;
  }

  @Override
  public boolean doNotEqualsBoolean(final float lhs, final long rhs) throws Throwable {
    return lhs != rhs;
  }

  @Override
  public boolean doNotEqualsBoolean(final float lhs, final float rhs) throws Throwable {
    return lhs != rhs;
  }

  @Override
  public boolean doNotEqualsBoolean(final float lhs, final double rhs) throws Throwable {
    return lhs != rhs;
  }

  @Override
  public boolean doNotEqualsBoolean(final float lhs, final BigInteger rhs) throws Throwable {
    return lhs != rhs.floatValue();
  }

  @Override
  public boolean doNotEqualsBoolean(final float lhs, final BigDecimal rhs) throws Throwable {
    return new BigDecimal(lhs).compareTo(rhs) != 0;
  }

  @Override
  public boolean doNotEqualsBoolean(final Object lhs, final byte rhs) throws Throwable {
    return doNotEqualsBoolean(((NgFloat)lhs).getFloatValue(), rhs);
  }

  @Override
  public boolean doNotEqualsBoolean(final Object lhs, final char rhs) throws Throwable {
    return doNotEqualsBoolean(((NgFloat)lhs).getFloatValue(), rhs);
  }

  @Override
  public boolean doNotEqualsBoolean(final Object lhs, final short rhs) throws Throwable {
    return doNotEqualsBoolean(((NgFloat)lhs).getFloatValue(), rhs);
  }

  @Override
  public boolean doNotEqualsBoolean(final Object lhs, final int rhs) throws Throwable {
    return doNotEqualsBoolean(((NgFloat)lhs).getFloatValue(), rhs);
  }

  @Override
  public boolean doNotEqualsBoolean(final Object lhs, final long rhs) throws Throwable {
    return doNotEqualsBoolean(((NgFloat)lhs).getFloatValue(), rhs);
  }

  @Override
  public boolean doNotEqualsBoolean(final Object lhs, final float rhs) throws Throwable {
    return doNotEqualsBoolean(((NgFloat)lhs).getFloatValue(), rhs);
  }

  @Override
  public boolean doNotEqualsBoolean(final Object lhs, final double rhs) throws Throwable {
    return doNotEqualsBoolean(((NgFloat)lhs).getFloatValue(), rhs);
  }

  @Override
  public boolean doNotEqualsBoolean(final Object lhs, final BigInteger rhs) throws Throwable {
    return doNotEqualsBoolean(((NgFloat)lhs).getFloatValue(), rhs);
  }

  @Override
  public boolean doNotEqualsBoolean(final Object lhs, final BigDecimal rhs) throws Throwable {
    return doNotEqualsBoolean(((NgFloat)lhs).getFloatValue(), rhs);
  }

  @Override
  public boolean doReverseNotEqualsBoolean(final byte lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(byte.class).doNotEqualsBoolean(lhs, ((NgFloat)rhs).getFloatValue());
  }

  @Override
  public boolean doReverseNotEqualsBoolean(final char lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(char.class).doNotEqualsBoolean(lhs, ((NgFloat)rhs).getFloatValue());
  }

  @Override
  public boolean doReverseNotEqualsBoolean(final short lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(short.class).doNotEqualsBoolean(lhs, ((NgFloat)rhs).getFloatValue());
  }

  @Override
  public boolean doReverseNotEqualsBoolean(final int lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(int.class).doNotEqualsBoolean(lhs, ((NgFloat)rhs).getFloatValue());
  }

  @Override
  public boolean doReverseNotEqualsBoolean(final long lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(long.class).doNotEqualsBoolean(lhs, ((NgFloat)rhs).getFloatValue());
  }

  @Override
  public boolean doReverseNotEqualsBoolean(final float lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(float.class).doNotEqualsBoolean(lhs, ((NgFloat)rhs).getFloatValue());
  }

  @Override
  public boolean doReverseNotEqualsBoolean(final double lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(double.class).doNotEqualsBoolean(lhs, ((NgFloat)rhs).getFloatValue());
  }

  @Override
  public boolean doReverseNotEqualsBoolean(final BigInteger lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(BigInteger.class).doNotEqualsBoolean(lhs, ((NgFloat)rhs).getFloatValue());
  }

  @Override
  public boolean doReverseNotEqualsBoolean(final BigDecimal lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(BigDecimal.class).doNotEqualsBoolean(lhs, ((NgFloat)rhs).getFloatValue());
  }

  @Override
  public Object doLessThan(final Object lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseLessThan(((NgFloat)lhs).getFloatValue(), rhs);
  }

  @Override
  public Object doLessThan(final float lhs, final byte rhs) throws Throwable {
    return (lhs < rhs) ? NgBoolean.TRUE : NgBoolean.FALSE;
  }

  @Override
  public Object doLessThan(final float lhs, final char rhs) throws Throwable {
    return (lhs < rhs) ? NgBoolean.TRUE : NgBoolean.FALSE;
  }

  @Override
  public Object doLessThan(final float lhs, final short rhs) throws Throwable {
    return (lhs < rhs) ? NgBoolean.TRUE : NgBoolean.FALSE;
  }

  @Override
  public Object doLessThan(final float lhs, final int rhs) throws Throwable {
    return (lhs < rhs) ? NgBoolean.TRUE : NgBoolean.FALSE;
  }

  @Override
  public Object doLessThan(final float lhs, final long rhs) throws Throwable {
    return (lhs < rhs) ? NgBoolean.TRUE : NgBoolean.FALSE;
  }

  @Override
  public Object doLessThan(final float lhs, final float rhs) throws Throwable {
    return (lhs < rhs) ? NgBoolean.TRUE : NgBoolean.FALSE;
  }

  @Override
  public Object doLessThan(final float lhs, final double rhs) throws Throwable {
    return (lhs < rhs) ? NgBoolean.TRUE : NgBoolean.FALSE;
  }

  @Override
  public Object doLessThan(final float lhs, final BigInteger rhs) throws Throwable {
    return (lhs < rhs.floatValue()) ? NgBoolean.TRUE : NgBoolean.FALSE;
  }

  @Override
  public Object doLessThan(final float lhs, final BigDecimal rhs) throws Throwable {
    return (new BigDecimal(lhs).compareTo(rhs) < 0) ? NgBoolean.TRUE : NgBoolean.FALSE;
  }

  @Override
  public Object doLessThan(final Object lhs, final byte rhs) throws Throwable {
    return doLessThan(((NgFloat)lhs).getFloatValue(), rhs);
  }

  @Override
  public Object doLessThan(final Object lhs, final char rhs) throws Throwable {
    return doLessThan(((NgFloat)lhs).getFloatValue(), rhs);
  }

  @Override
  public Object doLessThan(final Object lhs, final short rhs) throws Throwable {
    return doLessThan(((NgFloat)lhs).getFloatValue(), rhs);
  }

  @Override
  public Object doLessThan(final Object lhs, final int rhs) throws Throwable {
    return doLessThan(((NgFloat)lhs).getFloatValue(), rhs);
  }

  @Override
  public Object doLessThan(final Object lhs, final long rhs) throws Throwable {
    return doLessThan(((NgFloat)lhs).getFloatValue(), rhs);
  }

  @Override
  public Object doLessThan(final Object lhs, final float rhs) throws Throwable {
    return doLessThan(((NgFloat)lhs).getFloatValue(), rhs);
  }

  @Override
  public Object doLessThan(final Object lhs, final double rhs) throws Throwable {
    return doLessThan(((NgFloat)lhs).getFloatValue(), rhs);
  }

  @Override
  public Object doLessThan(final Object lhs, final BigInteger rhs) throws Throwable {
    return doLessThan(((NgFloat)lhs).getFloatValue(), rhs);
  }

  @Override
  public Object doLessThan(final Object lhs, final BigDecimal rhs) throws Throwable {
    return doLessThan(((NgFloat)lhs).getFloatValue(), rhs);
  }

  @Override
  public Object doReverseLessThan(final byte lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(byte.class).doLessThan(lhs, ((NgFloat)rhs).getFloatValue());
  }

  @Override
  public Object doReverseLessThan(final char lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(char.class).doLessThan(lhs, ((NgFloat)rhs).getFloatValue());
  }

  @Override
  public Object doReverseLessThan(final short lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(short.class).doLessThan(lhs, ((NgFloat)rhs).getFloatValue());
  }

  @Override
  public Object doReverseLessThan(final int lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(int.class).doLessThan(lhs, ((NgFloat)rhs).getFloatValue());
  }

  @Override
  public Object doReverseLessThan(final long lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(long.class).doLessThan(lhs, ((NgFloat)rhs).getFloatValue());
  }

  @Override
  public Object doReverseLessThan(final float lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(float.class).doLessThan(lhs, ((NgFloat)rhs).getFloatValue());
  }

  @Override
  public Object doReverseLessThan(final double lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(double.class).doLessThan(lhs, ((NgFloat)rhs).getFloatValue());
  }

  @Override
  public Object doReverseLessThan(final BigInteger lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(BigInteger.class).doLessThan(lhs, ((NgFloat)rhs).getFloatValue());
  }

  @Override
  public Object doReverseLessThan(final BigDecimal lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(BigDecimal.class).doLessThan(lhs, ((NgFloat)rhs).getFloatValue());
  }

  @Override
  public Object doLessThanOrEquals(final Object lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseLessThanOrEquals(((NgFloat)lhs).getFloatValue(), rhs);
  }

  @Override
  public Object doLessThanOrEquals(final float lhs, final byte rhs) throws Throwable {
    return (lhs <= rhs) ? NgBoolean.TRUE : NgBoolean.FALSE;
  }

  @Override
  public Object doLessThanOrEquals(final float lhs, final char rhs) throws Throwable {
    return (lhs <= rhs) ? NgBoolean.TRUE : NgBoolean.FALSE;
  }

  @Override
  public Object doLessThanOrEquals(final float lhs, final short rhs) throws Throwable {
    return (lhs <= rhs) ? NgBoolean.TRUE : NgBoolean.FALSE;
  }

  @Override
  public Object doLessThanOrEquals(final float lhs, final int rhs) throws Throwable {
    return (lhs <= rhs) ? NgBoolean.TRUE : NgBoolean.FALSE;
  }

  @Override
  public Object doLessThanOrEquals(final float lhs, final long rhs) throws Throwable {
    return (lhs <= rhs) ? NgBoolean.TRUE : NgBoolean.FALSE;
  }

  @Override
  public Object doLessThanOrEquals(final float lhs, final float rhs) throws Throwable {
    return (lhs <= rhs) ? NgBoolean.TRUE : NgBoolean.FALSE;
  }

  @Override
  public Object doLessThanOrEquals(final float lhs, final double rhs) throws Throwable {
    return (lhs <= rhs) ? NgBoolean.TRUE : NgBoolean.FALSE;
  }

  @Override
  public Object doLessThanOrEquals(final float lhs, final BigInteger rhs) throws Throwable {
    return (lhs <= rhs.floatValue()) ? NgBoolean.TRUE : NgBoolean.FALSE;
  }

  @Override
  public Object doLessThanOrEquals(final float lhs, final BigDecimal rhs) throws Throwable {
    return (new BigDecimal(lhs).compareTo(rhs) <= 0) ? NgBoolean.TRUE : NgBoolean.FALSE;
  }

  @Override
  public Object doLessThanOrEquals(final Object lhs, final byte rhs) throws Throwable {
    return doLessThanOrEquals(((NgFloat)lhs).getFloatValue(), rhs);
  }

  @Override
  public Object doLessThanOrEquals(final Object lhs, final char rhs) throws Throwable {
    return doLessThanOrEquals(((NgFloat)lhs).getFloatValue(), rhs);
  }

  @Override
  public Object doLessThanOrEquals(final Object lhs, final short rhs) throws Throwable {
    return doLessThanOrEquals(((NgFloat)lhs).getFloatValue(), rhs);
  }

  @Override
  public Object doLessThanOrEquals(final Object lhs, final int rhs) throws Throwable {
    return doLessThanOrEquals(((NgFloat)lhs).getFloatValue(), rhs);
  }

  @Override
  public Object doLessThanOrEquals(final Object lhs, final long rhs) throws Throwable {
    return doLessThanOrEquals(((NgFloat)lhs).getFloatValue(), rhs);
  }

  @Override
  public Object doLessThanOrEquals(final Object lhs, final float rhs) throws Throwable {
    return doLessThanOrEquals(((NgFloat)lhs).getFloatValue(), rhs);
  }

  @Override
  public Object doLessThanOrEquals(final Object lhs, final double rhs) throws Throwable {
    return doLessThanOrEquals(((NgFloat)lhs).getFloatValue(), rhs);
  }

  @Override
  public Object doLessThanOrEquals(final Object lhs, final BigInteger rhs) throws Throwable {
    return doLessThanOrEquals(((NgFloat)lhs).getFloatValue(), rhs);
  }

  @Override
  public Object doLessThanOrEquals(final Object lhs, final BigDecimal rhs) throws Throwable {
    return doLessThanOrEquals(((NgFloat)lhs).getFloatValue(), rhs);
  }

  @Override
  public Object doReverseLessThanOrEquals(final byte lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(byte.class).doLessThanOrEquals(lhs, ((NgFloat)rhs).getFloatValue());
  }

  @Override
  public Object doReverseLessThanOrEquals(final char lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(char.class).doLessThanOrEquals(lhs, ((NgFloat)rhs).getFloatValue());
  }

  @Override
  public Object doReverseLessThanOrEquals(final short lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(short.class).doLessThanOrEquals(lhs, ((NgFloat)rhs).getFloatValue());
  }

  @Override
  public Object doReverseLessThanOrEquals(final int lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(int.class).doLessThanOrEquals(lhs, ((NgFloat)rhs).getFloatValue());
  }

  @Override
  public Object doReverseLessThanOrEquals(final long lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(long.class).doLessThanOrEquals(lhs, ((NgFloat)rhs).getFloatValue());
  }

  @Override
  public Object doReverseLessThanOrEquals(final float lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(float.class).doLessThanOrEquals(lhs, ((NgFloat)rhs).getFloatValue());
  }

  @Override
  public Object doReverseLessThanOrEquals(final double lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(double.class).doLessThanOrEquals(lhs, ((NgFloat)rhs).getFloatValue());
  }

  @Override
  public Object doReverseLessThanOrEquals(final BigInteger lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(BigInteger.class).doLessThanOrEquals(lhs, ((NgFloat)rhs).getFloatValue());
  }

  @Override
  public Object doReverseLessThanOrEquals(final BigDecimal lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(BigDecimal.class).doLessThanOrEquals(lhs, ((NgFloat)rhs).getFloatValue());
  }

  @Override
  public boolean doLessThanOrEqualsBoolean(final Object lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseLessThanOrEqualsBoolean(((NgFloat)lhs).getFloatValue(), rhs);
  }

  @Override
  public boolean doLessThanOrEqualsBoolean(final float lhs, final byte rhs) throws Throwable {
    return lhs <= rhs;
  }

  @Override
  public boolean doLessThanOrEqualsBoolean(final float lhs, final char rhs) throws Throwable {
    return lhs <= rhs;
  }

  @Override
  public boolean doLessThanOrEqualsBoolean(final float lhs, final short rhs) throws Throwable {
    return lhs <= rhs;
  }

  @Override
  public boolean doLessThanOrEqualsBoolean(final float lhs, final int rhs) throws Throwable {
    return lhs <= rhs;
  }

  @Override
  public boolean doLessThanOrEqualsBoolean(final float lhs, final long rhs) throws Throwable {
    return lhs <= rhs;
  }

  @Override
  public boolean doLessThanOrEqualsBoolean(final float lhs, final float rhs) throws Throwable {
    return lhs <= rhs;
  }

  @Override
  public boolean doLessThanOrEqualsBoolean(final float lhs, final double rhs) throws Throwable {
    return lhs <= rhs;
  }

  @Override
  public boolean doLessThanOrEqualsBoolean(final float lhs, final BigInteger rhs) throws Throwable {
    return lhs <= rhs.floatValue();
  }

  @Override
  public boolean doLessThanOrEqualsBoolean(final float lhs, final BigDecimal rhs) throws Throwable {
    return new BigDecimal(lhs).compareTo(rhs) <= 0;
  }

  @Override
  public boolean doLessThanOrEqualsBoolean(final Object lhs, final byte rhs) throws Throwable {
    return doLessThanOrEqualsBoolean(((NgFloat)lhs).getFloatValue(), rhs);
  }

  @Override
  public boolean doLessThanOrEqualsBoolean(final Object lhs, final char rhs) throws Throwable {
    return doLessThanOrEqualsBoolean(((NgFloat)lhs).getFloatValue(), rhs);
  }

  @Override
  public boolean doLessThanOrEqualsBoolean(final Object lhs, final short rhs) throws Throwable {
    return doLessThanOrEqualsBoolean(((NgFloat)lhs).getFloatValue(), rhs);
  }

  @Override
  public boolean doLessThanOrEqualsBoolean(final Object lhs, final int rhs) throws Throwable {
    return doLessThanOrEqualsBoolean(((NgFloat)lhs).getFloatValue(), rhs);
  }

  @Override
  public boolean doLessThanOrEqualsBoolean(final Object lhs, final long rhs) throws Throwable {
    return doLessThanOrEqualsBoolean(((NgFloat)lhs).getFloatValue(), rhs);
  }

  @Override
  public boolean doLessThanOrEqualsBoolean(final Object lhs, final float rhs) throws Throwable {
    return doLessThanOrEqualsBoolean(((NgFloat)lhs).getFloatValue(), rhs);
  }

  @Override
  public boolean doLessThanOrEqualsBoolean(final Object lhs, final double rhs) throws Throwable {
    return doLessThanOrEqualsBoolean(((NgFloat)lhs).getFloatValue(), rhs);
  }

  @Override
  public boolean doLessThanOrEqualsBoolean(final Object lhs, final BigInteger rhs) throws Throwable {
    return doLessThanOrEqualsBoolean(((NgFloat)lhs).getFloatValue(), rhs);
  }

  @Override
  public boolean doLessThanOrEqualsBoolean(final Object lhs, final BigDecimal rhs) throws Throwable {
    return doLessThanOrEqualsBoolean(((NgFloat)lhs).getFloatValue(), rhs);
  }

  @Override
  public boolean doReverseLessThanOrEqualsBoolean(final byte lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(byte.class).doLessThanOrEqualsBoolean(lhs, ((NgFloat)rhs).getFloatValue());
  }

  @Override
  public boolean doReverseLessThanOrEqualsBoolean(final char lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(char.class).doLessThanOrEqualsBoolean(lhs, ((NgFloat)rhs).getFloatValue());
  }

  @Override
  public boolean doReverseLessThanOrEqualsBoolean(final short lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(short.class).doLessThanOrEqualsBoolean(lhs, ((NgFloat)rhs).getFloatValue());
  }

  @Override
  public boolean doReverseLessThanOrEqualsBoolean(final int lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(int.class).doLessThanOrEqualsBoolean(lhs, ((NgFloat)rhs).getFloatValue());
  }

  @Override
  public boolean doReverseLessThanOrEqualsBoolean(final long lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(long.class).doLessThanOrEqualsBoolean(lhs, ((NgFloat)rhs).getFloatValue());
  }

  @Override
  public boolean doReverseLessThanOrEqualsBoolean(final float lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(float.class).doLessThanOrEqualsBoolean(lhs, ((NgFloat)rhs).getFloatValue());
  }

  @Override
  public boolean doReverseLessThanOrEqualsBoolean(final double lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(double.class).doLessThanOrEqualsBoolean(lhs, ((NgFloat)rhs).getFloatValue());
  }

  @Override
  public boolean doReverseLessThanOrEqualsBoolean(final BigInteger lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(BigInteger.class).doLessThanOrEqualsBoolean(lhs, ((NgFloat)rhs).getFloatValue());
  }

  @Override
  public boolean doReverseLessThanOrEqualsBoolean(final BigDecimal lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(BigDecimal.class).doLessThanOrEqualsBoolean(lhs, ((NgFloat)rhs).getFloatValue());
  }

  @Override
  public Object doGreaterThan(final Object lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseGreaterThan(((NgFloat)lhs).getFloatValue(), rhs);
  }

  @Override
  public Object doGreaterThan(final float lhs, final byte rhs) throws Throwable {
    return (lhs > rhs) ? NgBoolean.TRUE : NgBoolean.FALSE;
  }

  @Override
  public Object doGreaterThan(final float lhs, final char rhs) throws Throwable {
    return (lhs > rhs) ? NgBoolean.TRUE : NgBoolean.FALSE;
  }

  @Override
  public Object doGreaterThan(final float lhs, final short rhs) throws Throwable {
    return (lhs > rhs) ? NgBoolean.TRUE : NgBoolean.FALSE;
  }

  @Override
  public Object doGreaterThan(final float lhs, final int rhs) throws Throwable {
    return (lhs > rhs) ? NgBoolean.TRUE : NgBoolean.FALSE;
  }

  @Override
  public Object doGreaterThan(final float lhs, final long rhs) throws Throwable {
    return (lhs > rhs) ? NgBoolean.TRUE : NgBoolean.FALSE;
  }

  @Override
  public Object doGreaterThan(final float lhs, final float rhs) throws Throwable {
    return (lhs > rhs) ? NgBoolean.TRUE : NgBoolean.FALSE;
  }

  @Override
  public Object doGreaterThan(final float lhs, final double rhs) throws Throwable {
    return (lhs > rhs) ? NgBoolean.TRUE : NgBoolean.FALSE;
  }

  @Override
  public Object doGreaterThan(final float lhs, final BigInteger rhs) throws Throwable {
    return (lhs > rhs.floatValue()) ? NgBoolean.TRUE : NgBoolean.FALSE;
  }

  @Override
  public Object doGreaterThan(final float lhs, final BigDecimal rhs) throws Throwable {
    return (new BigDecimal(lhs).compareTo(rhs) > 0) ? NgBoolean.TRUE : NgBoolean.FALSE;
  }

  @Override
  public Object doGreaterThan(final Object lhs, final byte rhs) throws Throwable {
    return doGreaterThan(((NgFloat)lhs).getFloatValue(), rhs);
  }

  @Override
  public Object doGreaterThan(final Object lhs, final char rhs) throws Throwable {
    return doGreaterThan(((NgFloat)lhs).getFloatValue(), rhs);
  }

  @Override
  public Object doGreaterThan(final Object lhs, final short rhs) throws Throwable {
    return doGreaterThan(((NgFloat)lhs).getFloatValue(), rhs);
  }

  @Override
  public Object doGreaterThan(final Object lhs, final int rhs) throws Throwable {
    return doGreaterThan(((NgFloat)lhs).getFloatValue(), rhs);
  }

  @Override
  public Object doGreaterThan(final Object lhs, final long rhs) throws Throwable {
    return doGreaterThan(((NgFloat)lhs).getFloatValue(), rhs);
  }

  @Override
  public Object doGreaterThan(final Object lhs, final float rhs) throws Throwable {
    return doGreaterThan(((NgFloat)lhs).getFloatValue(), rhs);
  }

  @Override
  public Object doGreaterThan(final Object lhs, final double rhs) throws Throwable {
    return doGreaterThan(((NgFloat)lhs).getFloatValue(), rhs);
  }

  @Override
  public Object doGreaterThan(final Object lhs, final BigInteger rhs) throws Throwable {
    return doGreaterThan(((NgFloat)lhs).getFloatValue(), rhs);
  }

  @Override
  public Object doGreaterThan(final Object lhs, final BigDecimal rhs) throws Throwable {
    return doGreaterThan(((NgFloat)lhs).getFloatValue(), rhs);
  }

  @Override
  public Object doReverseGreaterThan(final byte lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(byte.class).doGreaterThan(lhs, ((NgFloat)rhs).getFloatValue());
  }

  @Override
  public Object doReverseGreaterThan(final char lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(char.class).doGreaterThan(lhs, ((NgFloat)rhs).getFloatValue());
  }

  @Override
  public Object doReverseGreaterThan(final short lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(short.class).doGreaterThan(lhs, ((NgFloat)rhs).getFloatValue());
  }

  @Override
  public Object doReverseGreaterThan(final int lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(int.class).doGreaterThan(lhs, ((NgFloat)rhs).getFloatValue());
  }

  @Override
  public Object doReverseGreaterThan(final long lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(long.class).doGreaterThan(lhs, ((NgFloat)rhs).getFloatValue());
  }

  @Override
  public Object doReverseGreaterThan(final float lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(float.class).doGreaterThan(lhs, ((NgFloat)rhs).getFloatValue());
  }

  @Override
  public Object doReverseGreaterThan(final double lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(double.class).doGreaterThan(lhs, ((NgFloat)rhs).getFloatValue());
  }

  @Override
  public Object doReverseGreaterThan(final BigInteger lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(BigInteger.class).doGreaterThan(lhs, ((NgFloat)rhs).getFloatValue());
  }

  @Override
  public Object doReverseGreaterThan(final BigDecimal lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(BigDecimal.class).doGreaterThan(lhs, ((NgFloat)rhs).getFloatValue());
  }

  @Override
  public boolean doGreaterThanBoolean(final float lhs, final byte rhs) throws Throwable {
    return lhs > rhs;
  }

  @Override
  public boolean doGreaterThanBoolean(final float lhs, final char rhs) throws Throwable {
    return lhs > rhs;
  }

  @Override
  public boolean doGreaterThanBoolean(final float lhs, final short rhs) throws Throwable {
    return lhs > rhs;
  }

  @Override
  public boolean doGreaterThanBoolean(final float lhs, final int rhs) throws Throwable {
    return lhs > rhs;
  }

  @Override
  public boolean doGreaterThanBoolean(final float lhs, final long rhs) throws Throwable {
    return lhs > rhs;
  }

  @Override
  public boolean doGreaterThanBoolean(final float lhs, final float rhs) throws Throwable {
    return lhs > rhs;
  }

  @Override
  public boolean doGreaterThanBoolean(final float lhs, final double rhs) throws Throwable {
    return lhs > rhs;
  }

  @Override
  public boolean doGreaterThanBoolean(final float lhs, final BigInteger rhs) throws Throwable {
    return lhs > rhs.floatValue();
  }

  @Override
  public boolean doGreaterThanBoolean(final float lhs, final BigDecimal rhs) throws Throwable {
    return new BigDecimal(lhs).compareTo(rhs) > 0;
  }

  @Override
  public boolean doGreaterThanBoolean(final Object lhs, final byte rhs) throws Throwable {
    return doGreaterThanBoolean(((NgFloat)lhs).getFloatValue(), rhs);
  }

  @Override
  public boolean doGreaterThanBoolean(final Object lhs, final char rhs) throws Throwable {
    return doGreaterThanBoolean(((NgFloat)lhs).getFloatValue(), rhs);
  }

  @Override
  public boolean doGreaterThanBoolean(final Object lhs, final short rhs) throws Throwable {
    return doGreaterThanBoolean(((NgFloat)lhs).getFloatValue(), rhs);
  }

  @Override
  public boolean doGreaterThanBoolean(final Object lhs, final int rhs) throws Throwable {
    return doGreaterThanBoolean(((NgFloat)lhs).getFloatValue(), rhs);
  }

  @Override
  public boolean doGreaterThanBoolean(final Object lhs, final long rhs) throws Throwable {
    return doGreaterThanBoolean(((NgFloat)lhs).getFloatValue(), rhs);
  }

  @Override
  public boolean doGreaterThanBoolean(final Object lhs, final float rhs) throws Throwable {
    return doGreaterThanBoolean(((NgFloat)lhs).getFloatValue(), rhs);
  }

  @Override
  public boolean doGreaterThanBoolean(final Object lhs, final double rhs) throws Throwable {
    return doGreaterThanBoolean(((NgFloat)lhs).getFloatValue(), rhs);
  }

  @Override
  public boolean doGreaterThanBoolean(final Object lhs, final BigInteger rhs) throws Throwable {
    return doGreaterThanBoolean(((NgFloat)lhs).getFloatValue(), rhs);
  }

  @Override
  public boolean doGreaterThanBoolean(final Object lhs, final BigDecimal rhs) throws Throwable {
    return doGreaterThanBoolean(((NgFloat)lhs).getFloatValue(), rhs);
  }

  @Override
  public boolean doReverseGreaterThanBoolean(final byte lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(byte.class).doGreaterThanBoolean(lhs, ((NgFloat)rhs).getFloatValue());
  }

  @Override
  public boolean doReverseGreaterThanBoolean(final char lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(char.class).doGreaterThanBoolean(lhs, ((NgFloat)rhs).getFloatValue());
  }

  @Override
  public boolean doReverseGreaterThanBoolean(final short lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(short.class).doGreaterThanBoolean(lhs, ((NgFloat)rhs).getFloatValue());
  }

  @Override
  public boolean doReverseGreaterThanBoolean(final int lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(int.class).doGreaterThanBoolean(lhs, ((NgFloat)rhs).getFloatValue());
  }

  @Override
  public boolean doReverseGreaterThanBoolean(final long lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(long.class).doGreaterThanBoolean(lhs, ((NgFloat)rhs).getFloatValue());
  }

  @Override
  public boolean doReverseGreaterThanBoolean(final float lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(float.class).doGreaterThanBoolean(lhs, ((NgFloat)rhs).getFloatValue());
  }

  @Override
  public boolean doReverseGreaterThanBoolean(final double lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(double.class).doGreaterThanBoolean(lhs, ((NgFloat)rhs).getFloatValue());
  }

  @Override
  public boolean doReverseGreaterThanBoolean(final BigInteger lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(BigInteger.class).doGreaterThanBoolean(lhs, ((NgFloat)rhs).getFloatValue());
  }

  @Override
  public boolean doReverseGreaterThanBoolean(final BigDecimal lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(BigDecimal.class).doGreaterThanBoolean(lhs, ((NgFloat)rhs).getFloatValue());
  }

  @Override
  public Object doGreaterThanOrEquals(final Object lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseGreaterThanOrEquals(((NgFloat)lhs).getFloatValue(), rhs);
  }

  @Override
  public Object doGreaterThanOrEquals(final float lhs, final byte rhs) throws Throwable {
    return (lhs >= rhs) ? NgBoolean.TRUE : NgBoolean.FALSE;
  }

  @Override
  public Object doGreaterThanOrEquals(final float lhs, final char rhs) throws Throwable {
    return (lhs >= rhs) ? NgBoolean.TRUE : NgBoolean.FALSE;
  }

  @Override
  public Object doGreaterThanOrEquals(final float lhs, final short rhs) throws Throwable {
    return (lhs >= rhs) ? NgBoolean.TRUE : NgBoolean.FALSE;
  }

  @Override
  public Object doGreaterThanOrEquals(final float lhs, final int rhs) throws Throwable {
    return (lhs >= rhs) ? NgBoolean.TRUE : NgBoolean.FALSE;
  }

  @Override
  public Object doGreaterThanOrEquals(final float lhs, final long rhs) throws Throwable {
    return (lhs >= rhs) ? NgBoolean.TRUE : NgBoolean.FALSE;
  }

  @Override
  public Object doGreaterThanOrEquals(final float lhs, final float rhs) throws Throwable {
    return (lhs >= rhs) ? NgBoolean.TRUE : NgBoolean.FALSE;
  }

  @Override
  public Object doGreaterThanOrEquals(final float lhs, final double rhs) throws Throwable {
    return (lhs >= rhs) ? NgBoolean.TRUE : NgBoolean.FALSE;
  }

  @Override
  public Object doGreaterThanOrEquals(final float lhs, final BigInteger rhs) throws Throwable {
    return (lhs >= rhs.floatValue()) ? NgBoolean.TRUE : NgBoolean.FALSE;
  }

  @Override
  public Object doGreaterThanOrEquals(final float lhs, final BigDecimal rhs) throws Throwable {
    return (new BigDecimal(lhs).compareTo(rhs) >= 0) ? NgBoolean.TRUE : NgBoolean.FALSE;
  }

  @Override
  public Object doGreaterThanOrEquals(final Object lhs, final byte rhs) throws Throwable {
    return doGreaterThanOrEquals(((NgFloat)lhs).getFloatValue(), rhs);
  }

  @Override
  public Object doGreaterThanOrEquals(final Object lhs, final char rhs) throws Throwable {
    return doGreaterThanOrEquals(((NgFloat)lhs).getFloatValue(), rhs);
  }

  @Override
  public Object doGreaterThanOrEquals(final Object lhs, final short rhs) throws Throwable {
    return doGreaterThanOrEquals(((NgFloat)lhs).getFloatValue(), rhs);
  }

  @Override
  public Object doGreaterThanOrEquals(final Object lhs, final int rhs) throws Throwable {
    return doGreaterThanOrEquals(((NgFloat)lhs).getFloatValue(), rhs);
  }

  @Override
  public Object doGreaterThanOrEquals(final Object lhs, final long rhs) throws Throwable {
    return doGreaterThanOrEquals(((NgFloat)lhs).getFloatValue(), rhs);
  }

  @Override
  public Object doGreaterThanOrEquals(final Object lhs, final float rhs) throws Throwable {
    return doGreaterThanOrEquals(((NgFloat)lhs).getFloatValue(), rhs);
  }

  @Override
  public Object doGreaterThanOrEquals(final Object lhs, final double rhs) throws Throwable {
    return doGreaterThanOrEquals(((NgFloat)lhs).getFloatValue(), rhs);
  }

  @Override
  public Object doGreaterThanOrEquals(final Object lhs, final BigInteger rhs) throws Throwable {
    return doGreaterThanOrEquals(((NgFloat)lhs).getFloatValue(), rhs);
  }

  @Override
  public Object doGreaterThanOrEquals(final Object lhs, final BigDecimal rhs) throws Throwable {
    return doGreaterThanOrEquals(((NgFloat)lhs).getFloatValue(), rhs);
  }

  @Override
  public Object doReverseGreaterThanOrEquals(final byte lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(byte.class).doGreaterThanOrEquals(lhs, ((NgFloat)rhs).getFloatValue());
  }

  @Override
  public Object doReverseGreaterThanOrEquals(final char lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(char.class).doGreaterThanOrEquals(lhs, ((NgFloat)rhs).getFloatValue());
  }

  @Override
  public Object doReverseGreaterThanOrEquals(final short lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(short.class).doGreaterThanOrEquals(lhs, ((NgFloat)rhs).getFloatValue());
  }

  @Override
  public Object doReverseGreaterThanOrEquals(final int lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(int.class).doGreaterThanOrEquals(lhs, ((NgFloat)rhs).getFloatValue());
  }

  @Override
  public Object doReverseGreaterThanOrEquals(final long lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(long.class).doGreaterThanOrEquals(lhs, ((NgFloat)rhs).getFloatValue());
  }

  @Override
  public Object doReverseGreaterThanOrEquals(final float lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(float.class).doGreaterThanOrEquals(lhs, ((NgFloat)rhs).getFloatValue());
  }

  @Override
  public Object doReverseGreaterThanOrEquals(final double lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(double.class).doGreaterThanOrEquals(lhs, ((NgFloat)rhs).getFloatValue());
  }

  @Override
  public Object doReverseGreaterThanOrEquals(final BigInteger lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(BigInteger.class).doGreaterThanOrEquals(lhs, ((NgFloat)rhs).getFloatValue());
  }

  @Override
  public Object doReverseGreaterThanOrEquals(final BigDecimal lhs, final Object rhs) throws Throwable {
    return NgSystem.metaClassRegistry.getInternalMetaClass(BigDecimal.class).doGreaterThanOrEquals(lhs, ((NgFloat)rhs).getFloatValue());
  }
  
  @Override
  public Object doAsType(final Object instance, final Class type) throws Throwable {
    
    if (type == float.class) return instance;
    
    return super.doAsType(instance, type);
  }
}
