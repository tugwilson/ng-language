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
import ng.runtime.NgByte;
import ng.runtime.NgDouble;
import ng.runtime.NgFloat;
import ng.runtime.NgInt;
import ng.runtime.NgLong;

public class NgByteMetaClass extends RuntimeMetaClassImpl {
  public NgByteMetaClass() {
    super(byte.class, new NgByteInternalMetaClass(byte.class));
  }
}

class NgByteInternalMetaClass extends InternalMetaClassImpl {
  public NgByteInternalMetaClass(final Class theClass) {
    super(theClass);
  }

  /* (non-Javadoc)
   * @see uk.co.wilson.ng.runtime.metaclass.InternalMetaClassImpl#doCalculateConversionCost(java.lang.Class)
   */
  @Override
  public int doCalculateConversionCost(final Class parameterType) {
    if (parameterType == byte.class) return 0;
    
    if (parameterType == short.class) return 1;
    
    if (parameterType == int.class) return 2;
    
    if (parameterType == long.class) return 3;
    
    if (parameterType == BigInteger.class) return 4;
    
    if (parameterType == float.class) return 5;
    
    if (parameterType == double.class) return 6;
    
    if (parameterType == BigDecimal.class) return 7;
    
    return super.doCalculateConversionCost(parameterType);
  }

  /* (non-Javadoc)
   * @see uk.co.wilson.ng.runtime.metaclass.InternalMetaClassImpl#doGetParamObject(java.lang.Object, java.lang.Class)
   */
  @Override
 public Object doGetParamObject(final Object instance, final Class parameterType) {
    if (parameterType == byte.class) return new Byte(((NgByte)instance).getByteValue());
    
    if (parameterType == short.class) return new Short(((NgByte)instance).getByteValue());
    
    if (parameterType == int.class) return new Integer(((NgByte)instance).getByteValue());
    
    if (parameterType == long.class) return new Long(((NgByte)instance).getByteValue());
    
    if (parameterType == BigInteger.class) return BigInteger.valueOf(((NgByte)instance).getByteValue());
    
    if (parameterType == float.class) return new Float(((NgByte)instance).getByteValue());
    
    if (parameterType == double.class) return new Double(((NgByte)instance).getByteValue());
    
    if (parameterType == BigDecimal.class) return new BigDecimal(((NgByte)instance).getByteValue());
    
    return super.doGetParamObject(instance, parameterType);
  }

  public Object doComplement(final int instance) {
    return new NgInt(~instance);
  }
  
  public Object doComplement(final Object instance) {
    return new NgInt(~((NgByte)instance).getByteValue());
  }

  public Object doUnaryPlus(final int instance) {
    return new NgInt(instance);
  }
  
  public Object doUnaryPlus(final Object instance) {
    return new NgInt(((NgByte)instance).getByteValue());
  }
  
  public Object doUnaryMinus(final int instance) {
    return new NgInt(-instance);
  }
  
  public Object doUnaryMinus(final Object instance) {
    return new NgInt(-((NgByte)instance).getByteValue());
  }

  public Object doPostfixIncrement(final int instance) {
    return new NgInt(instance + 1);
  }

  public Object doPostfixIncrement(final Object instance) {
    return new NgInt(((NgByte)instance).getByteValue() + 1);
  }

  public Object doPostfixDecrement(final int instance) {
    return new NgInt(instance - 1);
  }

  public Object doPostfixDecrement(final Object instance) {
    return new NgInt(((NgByte)instance).getByteValue() - 1);
  }

  public Object doPrefixIncrement(final int instance) {
    return new NgInt(instance + 1);
  }

  public Object doPrefixIncrement(final Object instance) {
    return new NgInt(((NgByte)instance).getByteValue() + 1);
  }

  public Object doPrefixDecrement(final int instance) {
    return new NgInt(instance - 1);
  }

  public Object doPrefixDecrement(final Object instance) {
    return new NgInt(((NgByte)instance).getByteValue() - 1);
  }

  public Object doAdd(final Object lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseAdd(((NgByte)lhs).getByteValue(), rhs);
  }

  public Object doAdd(final byte lhs, final byte rhs) {
    return new NgInt(lhs + rhs);
  }

  public Object doAdd(final byte lhs, final char rhs) {
    return new NgInt(lhs + rhs);
  }

  public Object doAdd(final byte lhs, final short rhs) {
    return new NgInt(lhs + rhs);
  }

  public Object doAdd(final byte lhs, final int rhs) {
    return new NgInt(lhs + rhs);
  }

  public Object doAdd(final byte lhs, final long rhs) {
    return new NgLong(lhs + rhs);
  }

  public Object doAdd(final byte lhs, final float rhs) {
    return new NgFloat(lhs + rhs);
  }

  public Object doAdd(final byte lhs, final double rhs) {
    return new NgDouble(lhs + rhs);
  }

  public Object doAdd(final byte lhs, final BigInteger rhs) {
    return BigInteger.valueOf(lhs).add(rhs);
  }

  public Object doAdd(final byte lhs, final BigDecimal rhs) {
    return new BigDecimal(lhs).add(rhs);
  }

  public Object doAdd(final Object lhs, final byte rhs) {
    return doAdd(((NgByte)lhs).getByteValue(), rhs);
  }

  public Object doAdd(final Object lhs, final char rhs) {
    return doAdd(((NgByte)lhs).getByteValue(), rhs);
  }

  public Object doAdd(final Object lhs, final short rhs) {
    return doAdd(((NgByte)lhs).getByteValue(), rhs);
  }

  public Object doAdd(final Object lhs, final int rhs) {
    return doAdd(((NgByte)lhs).getByteValue(), rhs);
  }

  public Object doAdd(final Object lhs, final long rhs) {
    return doAdd(((NgByte)lhs).getByteValue(), rhs);
  }

  public Object doAdd(final Object lhs, final float rhs) {
    return doAdd(((NgByte)lhs).getByteValue(), rhs);
  }

  public Object doAdd(final Object lhs, final double rhs) {
    return doAdd(((NgByte)lhs).getByteValue(), rhs);
  }

  public Object doAdd(final Object lhs, final BigInteger rhs) {
    return doAdd(((NgByte)lhs).getByteValue(), rhs);
  }

  public Object doAdd(final Object lhs, final BigDecimal rhs) {
    return doAdd(((NgByte)lhs).getByteValue(), rhs);
  }

  public Object doReverseAdd(final byte lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(byte.class).doAdd(lhs, ((NgByte)rhs).getByteValue());
  }

  public Object doReverseAdd(final char lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(char.class).doAdd(lhs, ((NgByte)rhs).getByteValue());
  }

  public Object doReverseAdd(final short lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(short.class).doAdd(lhs, ((NgByte)rhs).getByteValue());
  }

  public Object doReverseAdd(final int lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(int.class).doAdd(lhs, ((NgByte)rhs).getByteValue());
  }

  public Object doReverseAdd(final long lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(long.class).doAdd(lhs, ((NgByte)rhs).getByteValue());
  }

  public Object doReverseAdd(final float lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(float.class).doAdd(lhs, ((NgByte)rhs).getByteValue());
  }

  public Object doReverseAdd(final double lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(double.class).doAdd(lhs, ((NgByte)rhs).getByteValue());
  }

  public Object doReverseAdd(final BigInteger lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(BigInteger.class).doAdd(lhs, ((NgByte)rhs).getByteValue());
  }

  public Object doReverseAdd(final BigDecimal lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(BigDecimal.class).doAdd(lhs, ((NgByte)rhs).getByteValue());
  }

  public Object doAddEquals(final Object lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseAddEquals(((NgByte)lhs).getByteValue(), rhs);
  }

  public Object doAddEquals(final byte lhs, final byte rhs) {
    return new NgInt(lhs + rhs);
  }

  public Object doAddEquals(final byte lhs, final char rhs) {
    return new NgInt(lhs + rhs);
  }

  public Object doAddEquals(final byte lhs, final short rhs) {
    return new NgInt(lhs + rhs);
  }

  public Object doAddEquals(final byte lhs, final int rhs) {
    return new NgInt(lhs + rhs);
  }

  public Object doAddEquals(final byte lhs, final long rhs) {
    return new NgLong(lhs + rhs);
  }

  public Object doAddEquals(final byte lhs, final float rhs) {
    return new NgFloat(lhs + rhs);
  }

  public Object doAddEquals(final byte lhs, final double rhs) {
    return new NgDouble(lhs + rhs);
  }

  public Object doAddEquals(final byte lhs, final BigInteger rhs) {
    return BigInteger.valueOf(lhs).add(rhs);
  }

  public Object doAddEquals(final byte lhs, final BigDecimal rhs) {
    return new BigDecimal(lhs).add(rhs);
  }

  public Object doAddEquals(final Object lhs, final byte rhs) {
    return doAddEquals(((NgByte)lhs).getByteValue(), rhs);
  }

  public Object doAddEquals(final Object lhs, final char rhs) {
    return doAddEquals(((NgByte)lhs).getByteValue(), rhs);
  }

  public Object doAddEquals(final Object lhs, final short rhs) {
    return doAddEquals(((NgByte)lhs).getByteValue(), rhs);
  }

  public Object doAddEquals(final Object lhs, final int rhs) {
    return doAddEquals(((NgByte)lhs).getByteValue(), rhs);
  }

  public Object doAddEquals(final Object lhs, final long rhs) {
    return doAddEquals(((NgByte)lhs).getByteValue(), rhs);
  }

  public Object doAddEquals(final Object lhs, final float rhs) {
    return doAddEquals(((NgByte)lhs).getByteValue(), rhs);
  }

  public Object doAddEquals(final Object lhs, final double rhs) {
    return doAddEquals(((NgByte)lhs).getByteValue(), rhs);
  }

  public Object doAddEquals(final Object lhs, final BigInteger rhs) {
    return doAddEquals(((NgByte)lhs).getByteValue(), rhs);
  }

  public Object doAddEquals(final Object lhs, final BigDecimal rhs) {
    return doAddEquals(((NgByte)lhs).getByteValue(), rhs);
  }

  public Object doReverseAddEquals(final byte lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(byte.class).doAddEquals(lhs, ((NgByte)rhs).getByteValue());
  }

  public Object doReverseAddEquals(final char lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(char.class).doAddEquals(lhs, ((NgByte)rhs).getByteValue());
  }

  public Object doReverseAddEquals(final short lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(short.class).doAddEquals(lhs, ((NgByte)rhs).getByteValue());
  }

  public Object doReverseAddEquals(final int lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(int.class).doAddEquals(lhs, ((NgByte)rhs).getByteValue());
  }

  public Object doReverseAddEquals(final long lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(long.class).doAddEquals(lhs, ((NgByte)rhs).getByteValue());
  }

  public Object doReverseAddEquals(final float lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(float.class).doAddEquals(lhs, ((NgByte)rhs).getByteValue());
  }

  public Object doReverseAddEquals(final double lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(double.class).doAddEquals(lhs, ((NgByte)rhs).getByteValue());
  }

  public Object doReverseAddEquals(final BigInteger lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(BigInteger.class).doAddEquals(lhs, ((NgByte)rhs).getByteValue());
  }

  public Object doReverseAddEquals(final BigDecimal lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(BigDecimal.class).doAddEquals(lhs, ((NgByte)rhs).getByteValue());
  }

  public Object doSubtract(final Object lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseSubtract(((NgByte)lhs).getByteValue(), rhs);
  }

  public Object doSubtract(final byte lhs, final byte rhs) {
    return new NgInt(lhs - rhs);
  }

  public Object doSubtract(final byte lhs, final char rhs) {
    return new NgInt(lhs - rhs);
  }

  public Object doSubtract(final byte lhs, final short rhs) {
    return new NgInt(lhs - rhs);
  }

  public Object doSubtract(final byte lhs, final int rhs) {
    return new NgInt(lhs - rhs);
  }

  public Object doSubtract(final byte lhs, final long rhs) {
    return new NgLong(lhs - rhs);
  }

  public Object doSubtract(final byte lhs, final float rhs) {
    return new NgFloat(lhs - rhs);
  }

  public Object doSubtract(final byte lhs, final double rhs) {
    return new NgDouble(lhs - rhs);
  }

  public Object doSubtract(final byte lhs, final BigInteger rhs) {
    return BigInteger.valueOf(lhs).subtract(rhs);
  }

  public Object doSubtract(final byte lhs, final BigDecimal rhs) {
    return new BigDecimal(lhs).subtract(rhs);
  }

  public Object doSubtract(final Object lhs, final byte rhs) {
    return doSubtract(((NgByte)lhs).getByteValue(), rhs);
  }

  public Object doSubtract(final Object lhs, final char rhs) {
    return doSubtract(((NgByte)lhs).getByteValue(), rhs);
  }

  public Object doSubtract(final Object lhs, final short rhs) {
    return doSubtract(((NgByte)lhs).getByteValue(), rhs);
  }

  public Object doSubtract(final Object lhs, final int rhs) {
    return doSubtract(((NgByte)lhs).getByteValue(), rhs);
  }

  public Object doSubtract(final Object lhs, final long rhs) {
    return doSubtract(((NgByte)lhs).getByteValue(), rhs);
  }

  public Object doSubtract(final Object lhs, final float rhs) {
    return doSubtract(((NgByte)lhs).getByteValue(), rhs);
  }

  public Object doSubtract(final Object lhs, final double rhs) {
    return doSubtract(((NgByte)lhs).getByteValue(), rhs);
  }

  public Object doSubtract(final Object lhs, final BigInteger rhs) {
    return doSubtract(((NgByte)lhs).getByteValue(), rhs);
  }

  public Object doSubtract(final Object lhs, final BigDecimal rhs) {
    return doSubtract(((NgByte)lhs).getByteValue(), rhs);
  }

  public Object doReverseSubtract(final byte lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(byte.class).doSubtract(lhs, ((NgByte)rhs).getByteValue());
  }

  public Object doReverseSubtract(final char lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(char.class).doSubtract(lhs, ((NgByte)rhs).getByteValue());
  }

  public Object doReverseSubtract(final short lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(short.class).doSubtract(lhs, ((NgByte)rhs).getByteValue());
  }

  public Object doReverseSubtract(final int lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(int.class).doSubtract(lhs, ((NgByte)rhs).getByteValue());
  }

  public Object doReverseSubtract(final long lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(long.class).doSubtract(lhs, ((NgByte)rhs).getByteValue());
  }

  public Object doReverseSubtract(final float lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(float.class).doSubtract(lhs, ((NgByte)rhs).getByteValue());
  }

  public Object doReverseSubtract(final double lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(double.class).doSubtract(lhs, ((NgByte)rhs).getByteValue());
  }

  public Object doReverseSubtract(final BigInteger lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(BigInteger.class).doSubtract(lhs, ((NgByte)rhs).getByteValue());
  }

  public Object doReverseSubtract(final BigDecimal lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(BigDecimal.class).doSubtract(lhs, ((NgByte)rhs).getByteValue());
  }

  public Object doSubtractEquals(final Object lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseSubtractEquals(((NgByte)lhs).getByteValue(), rhs);
  }

  public Object doSubtractEquals(final byte lhs, final byte rhs) {
    return new NgInt(lhs - rhs);
  }

  public Object doSubtractEquals(final byte lhs, final char rhs) {
    return new NgInt(lhs - rhs);
  }

  public Object doSubtractEquals(final byte lhs, final short rhs) {
    return new NgInt(lhs - rhs);
  }

  public Object doSubtractEquals(final byte lhs, final int rhs) {
    return new NgInt(lhs - rhs);
  }

  public Object doSubtractEquals(final byte lhs, final long rhs) {
    return new NgLong(lhs - rhs);
  }

  public Object doSubtractEquals(final byte lhs, final float rhs) {
    return new NgFloat(lhs - rhs);
  }

  public Object doSubtractEquals(final byte lhs, final double rhs) {
    return new NgDouble(lhs - rhs);
  }

  public Object doSubtractEquals(final byte lhs, final BigInteger rhs) {
    return BigInteger.valueOf(lhs).subtract(rhs);
  }

  public Object doSubtractEquals(final byte lhs, final BigDecimal rhs) {
    return new BigDecimal(lhs).subtract(rhs);
  }

  public Object doSubtractEquals(final Object lhs, final byte rhs) {
    return doSubtractEquals(((NgByte)lhs).getByteValue(), rhs);
  }

  public Object doSubtractEquals(final Object lhs, final char rhs) {
    return doSubtractEquals(((NgByte)lhs).getByteValue(), rhs);
  }

  public Object doSubtractEquals(final Object lhs, final short rhs) {
    return doSubtractEquals(((NgByte)lhs).getByteValue(), rhs);
  }

  public Object doSubtractEquals(final Object lhs, final int rhs) {
    return doSubtractEquals(((NgByte)lhs).getByteValue(), rhs);
  }

  public Object doSubtractEquals(final Object lhs, final long rhs) {
    return doSubtractEquals(((NgByte)lhs).getByteValue(), rhs);
  }

  public Object doSubtractEquals(final Object lhs, final float rhs) {
    return doSubtractEquals(((NgByte)lhs).getByteValue(), rhs);
  }

  public Object doSubtractEquals(final Object lhs, final double rhs) {
    return doSubtractEquals(((NgByte)lhs).getByteValue(), rhs);
  }

  public Object doSubtractEquals(final Object lhs, final BigInteger rhs) {
    return doSubtractEquals(((NgByte)lhs).getByteValue(), rhs);
  }

  public Object doSubtractEquals(final Object lhs, final BigDecimal rhs) {
    return doSubtractEquals(((NgByte)lhs).getByteValue(), rhs);
  }

  public Object doReverseSubtractEquals(final byte lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(byte.class).doSubtractEquals(lhs, ((NgByte)rhs).getByteValue());
  }

  public Object doReverseSubtractEquals(final char lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(char.class).doSubtractEquals(lhs, ((NgByte)rhs).getByteValue());
  }

  public Object doReverseSubtractEquals(final short lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(short.class).doSubtractEquals(lhs, ((NgByte)rhs).getByteValue());
  }

  public Object doReverseSubtractEquals(final int lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(int.class).doSubtractEquals(lhs, ((NgByte)rhs).getByteValue());
  }

  public Object doReverseSubtractEquals(final long lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(long.class).doSubtractEquals(lhs, ((NgByte)rhs).getByteValue());
  }

  public Object doReverseSubtractEquals(final float lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(float.class).doSubtractEquals(lhs, ((NgByte)rhs).getByteValue());
  }

  public Object doReverseSubtractEquals(final double lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(double.class).doSubtractEquals(lhs, ((NgByte)rhs).getByteValue());
  }

  public Object doReverseSubtractEquals(final BigInteger lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(BigInteger.class).doSubtractEquals(lhs, ((NgByte)rhs).getByteValue());
  }

  public Object doReverseSubtractEquals(final BigDecimal lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(BigDecimal.class).doSubtractEquals(lhs, ((NgByte)rhs).getByteValue());
  }

  public Object doMultiply(final Object lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseMultiply(((NgByte)lhs).getByteValue(), rhs);
  }

  public Object doMultiply(final byte lhs, final byte rhs) {
    return new NgInt(lhs * rhs);
  }

  public Object doMultiply(final byte lhs, final char rhs) {
    return new NgInt(lhs * rhs);
  }

  public Object doMultiply(final byte lhs, final short rhs) {
    return new NgInt(lhs * rhs);
  }

  public Object doMultiply(final byte lhs, final int rhs) {
    return new NgInt(lhs * rhs);
  }

  public Object doMultiply(final byte lhs, final long rhs) {
    return new NgLong(lhs * rhs);
  }

  public Object doMultiply(final byte lhs, final float rhs) {
    return new NgFloat(lhs * rhs);
  }

  public Object doMultiply(final byte lhs, final double rhs) {
    return new NgDouble(lhs * rhs);
  }

  public Object doMultiply(final byte lhs, final BigInteger rhs) {
    return BigInteger.valueOf(lhs).multiply(rhs);
  }

  public Object doMultiply(final byte lhs, final BigDecimal rhs) {
    return new BigDecimal(lhs).multiply(rhs);
  }

  public Object doMultiply(final Object lhs, final byte rhs) {
    return doMultiply(((NgByte)lhs).getByteValue(), rhs);
  }

  public Object doMultiply(final Object lhs, final char rhs) {
    return doMultiply(((NgByte)lhs).getByteValue(), rhs);
  }

  public Object doMultiply(final Object lhs, final short rhs) {
    return doMultiply(((NgByte)lhs).getByteValue(), rhs);
  }

  public Object doMultiply(final Object lhs, final int rhs) {
    return doMultiply(((NgByte)lhs).getByteValue(), rhs);
  }

  public Object doMultiply(final Object lhs, final long rhs) {
    return doMultiply(((NgByte)lhs).getByteValue(), rhs);
  }

  public Object doMultiply(final Object lhs, final float rhs) {
    return doMultiply(((NgByte)lhs).getByteValue(), rhs);
  }

  public Object doMultiply(final Object lhs, final double rhs) {
    return doMultiply(((NgByte)lhs).getByteValue(), rhs);
  }

  public Object doMultiply(final Object lhs, final BigInteger rhs) {
    return doMultiply(((NgByte)lhs).getByteValue(), rhs);
  }

  public Object doMultiply(final Object lhs, final BigDecimal rhs) {
    return doMultiply(((NgByte)lhs).getByteValue(), rhs);
  }

  public Object doReverseMultiply(final byte lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(byte.class).doMultiply(lhs, ((NgByte)rhs).getByteValue());
  }

  public Object doReverseMultiply(final char lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(char.class).doMultiply(lhs, ((NgByte)rhs).getByteValue());
  }

  public Object doReverseMultiply(final short lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(short.class).doMultiply(lhs, ((NgByte)rhs).getByteValue());
  }

  public Object doReverseMultiply(final int lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(int.class).doMultiply(lhs, ((NgByte)rhs).getByteValue());
  }

  public Object doReverseMultiply(final long lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(long.class).doMultiply(lhs, ((NgByte)rhs).getByteValue());
  }

  public Object doReverseMultiply(final float lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(float.class).doMultiply(lhs, ((NgByte)rhs).getByteValue());
  }

  public Object doReverseMultiply(final double lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(double.class).doMultiply(lhs, ((NgByte)rhs).getByteValue());
  }

  public Object doReverseMultiply(final BigInteger lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(BigInteger.class).doMultiply(lhs, ((NgByte)rhs).getByteValue());
  }

  public Object doReverseMultiply(final BigDecimal lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(BigDecimal.class).doMultiply(lhs, ((NgByte)rhs).getByteValue());
  }

  public Object doMultiplyEquals(final Object lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseMultiplyEquals(((NgByte)lhs).getByteValue(), rhs);
  }

  public Object doMultiplyEquals(final byte lhs, final byte rhs) {
    return new NgInt(lhs * rhs);
  }

  public Object doMultiplyEquals(final byte lhs, final char rhs) {
    return new NgInt(lhs * rhs);
  }

  public Object doMultiplyEquals(final byte lhs, final short rhs) {
    return new NgInt(lhs * rhs);
  }

  public Object doMultiplyEquals(final byte lhs, final int rhs) {
    return new NgInt(lhs * rhs);
  }

  public Object doMultiplyEquals(final byte lhs, final long rhs) {
    return new NgLong(lhs * rhs);
  }

  public Object doMultiplyEquals(final byte lhs, final float rhs) {
    return new NgFloat(lhs * rhs);
  }

  public Object doMultiplyEquals(final byte lhs, final double rhs) {
    return new NgDouble(lhs * rhs);
  }

  public Object doMultiplyEquals(final byte lhs, final BigInteger rhs) {
    return BigInteger.valueOf(lhs).multiply(rhs);
  }

  public Object doMultiplyEquals(final byte lhs, final BigDecimal rhs) {
    return new BigDecimal(lhs).multiply(rhs);
  }

  public Object doMultiplyEquals(final Object lhs, final byte rhs) {
    return doMultiplyEquals(((NgByte)lhs).getByteValue(), rhs);
  }

  public Object doMultiplyEquals(final Object lhs, final char rhs) {
    return doMultiplyEquals(((NgByte)lhs).getByteValue(), rhs);
  }

  public Object doMultiplyEquals(final Object lhs, final short rhs) {
    return doMultiplyEquals(((NgByte)lhs).getByteValue(), rhs);
  }

  public Object doMultiplyEquals(final Object lhs, final int rhs) {
    return doMultiplyEquals(((NgByte)lhs).getByteValue(), rhs);
  }

  public Object doMultiplyEquals(final Object lhs, final long rhs) {
    return doMultiplyEquals(((NgByte)lhs).getByteValue(), rhs);
  }

  public Object doMultiplyEquals(final Object lhs, final float rhs) {
    return doMultiplyEquals(((NgByte)lhs).getByteValue(), rhs);
  }

  public Object doMultiplyEquals(final Object lhs, final double rhs) {
    return doMultiplyEquals(((NgByte)lhs).getByteValue(), rhs);
  }

  public Object doMultiplyEquals(final Object lhs, final BigInteger rhs) {
    return doMultiplyEquals(((NgByte)lhs).getByteValue(), rhs);
  }

  public Object doMultiplyEquals(final Object lhs, final BigDecimal rhs) {
    return doMultiplyEquals(((NgByte)lhs).getByteValue(), rhs);
  }

  public Object doReverseMultiplyEquals(final byte lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(byte.class).doMultiplyEquals(lhs, ((NgByte)rhs).getByteValue());
  }

  public Object doReverseMultiplyEquals(final char lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(char.class).doMultiplyEquals(lhs, ((NgByte)rhs).getByteValue());
  }

  public Object doReverseMultiplyEquals(final short lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(short.class).doMultiplyEquals(lhs, ((NgByte)rhs).getByteValue());
  }

  public Object doReverseMultiplyEquals(final int lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(int.class).doMultiplyEquals(lhs, ((NgByte)rhs).getByteValue());
  }

  public Object doReverseMultiplyEquals(final long lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(long.class).doMultiplyEquals(lhs, ((NgByte)rhs).getByteValue());
  }

  public Object doReverseMultiplyEquals(final float lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(float.class).doMultiplyEquals(lhs, ((NgByte)rhs).getByteValue());
  }

  public Object doReverseMultiplyEquals(final double lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(double.class).doMultiplyEquals(lhs, ((NgByte)rhs).getByteValue());
  }

  public Object doReverseMultiplyEquals(final BigInteger lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(BigInteger.class).doMultiplyEquals(lhs, ((NgByte)rhs).getByteValue());
  }

  public Object doReverseMultiplyEquals(final BigDecimal lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(BigDecimal.class).doMultiplyEquals(lhs, ((NgByte)rhs).getByteValue());
  }

  public Object doDivide(final Object lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseDivide(((NgByte)lhs).getByteValue(), rhs);
  }

  public Object doDivide(final byte lhs, final byte rhs) {
    return new NgInt(lhs / rhs);
  }

  public Object doDivide(final byte lhs, final char rhs) {
    return new NgInt(lhs / rhs);
  }

  public Object doDivide(final byte lhs, final short rhs) {
    return new NgInt(lhs / rhs);
  }

  public Object doDivide(final byte lhs, final int rhs) {
    return new NgInt(lhs / rhs);
  }

  public Object doDivide(final byte lhs, final long rhs) {
    return new NgLong(lhs / rhs);
  }

  public Object doDivide(final byte lhs, final float rhs) {
    return new NgFloat(lhs / rhs);
  }

  public Object doDivide(final byte lhs, final double rhs) {
    return new NgDouble(lhs / rhs);
  }

  public Object doDivide(final byte lhs, final BigInteger rhs) {
    return BigInteger.valueOf(lhs).divide(rhs);
  }

  public Object doDivide(final byte lhs, final BigDecimal rhs) {
    return new BigDecimal(lhs).divide(rhs);
  }

  public Object doDivide(final Object lhs, final byte rhs) {
    return doDivide(((NgByte)lhs).getByteValue(), rhs);
  }

  public Object doDivide(final Object lhs, final char rhs) {
    return doDivide(((NgByte)lhs).getByteValue(), rhs);
  }

  public Object doDivide(final Object lhs, final short rhs) {
    return doDivide(((NgByte)lhs).getByteValue(), rhs);
  }

  public Object doDivide(final Object lhs, final int rhs) {
    return doDivide(((NgByte)lhs).getByteValue(), rhs);
  }

  public Object doDivide(final Object lhs, final long rhs) {
    return doDivide(((NgByte)lhs).getByteValue(), rhs);
  }

  public Object doDivide(final Object lhs, final float rhs) {
    return doDivide(((NgByte)lhs).getByteValue(), rhs);
  }

  public Object doDivide(final Object lhs, final double rhs) {
    return doDivide(((NgByte)lhs).getByteValue(), rhs);
  }

  public Object doDivide(final Object lhs, final BigInteger rhs) {
    return doDivide(((NgByte)lhs).getByteValue(), rhs);
  }

  public Object doDivide(final Object lhs, final BigDecimal rhs) {
    return doDivide(((NgByte)lhs).getByteValue(), rhs);
  }

  public Object doReverseDivide(final byte lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(byte.class).doDivide(lhs, ((NgByte)rhs).getByteValue());
  }

  public Object doReverseDivide(final char lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(char.class).doDivide(lhs, ((NgByte)rhs).getByteValue());
  }

  public Object doReverseDivide(final short lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(short.class).doDivide(lhs, ((NgByte)rhs).getByteValue());
  }

  public Object doReverseDivide(final int lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(int.class).doDivide(lhs, ((NgByte)rhs).getByteValue());
  }

  public Object doReverseDivide(final long lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(long.class).doDivide(lhs, ((NgByte)rhs).getByteValue());
  }

  public Object doReverseDivide(final float lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(float.class).doDivide(lhs, ((NgByte)rhs).getByteValue());
  }

  public Object doReverseDivide(final double lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(double.class).doDivide(lhs, ((NgByte)rhs).getByteValue());
  }

  public Object doReverseDivide(final BigInteger lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(BigInteger.class).doDivide(lhs, ((NgByte)rhs).getByteValue());
  }

  public Object doReverseDivide(final BigDecimal lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(BigDecimal.class).doDivide(lhs, ((NgByte)rhs).getByteValue());
  }

  public Object doDivideEquals(final Object lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseDivideEquals(((NgByte)lhs).getByteValue(), rhs);
  }

  public Object doDivideEquals(final byte lhs, final byte rhs) {
    return new NgInt(lhs / rhs);
  }

  public Object doDivideEquals(final byte lhs, final char rhs) {
    return new NgInt(lhs / rhs);
  }

  public Object doDivideEquals(final byte lhs, final short rhs) {
    return new NgInt(lhs / rhs);
  }

  public Object doDivideEquals(final byte lhs, final int rhs) {
    return new NgInt(lhs / rhs);
  }

  public Object doDivideEquals(final byte lhs, final long rhs) {
    return new NgLong(lhs / rhs);
  }

  public Object doDivideEquals(final byte lhs, final float rhs) {
    return new NgFloat(lhs / rhs);
  }

  public Object doDivideEquals(final byte lhs, final double rhs) {
    return new NgDouble(lhs / rhs);
  }

  public Object doDivideEquals(final byte lhs, final BigInteger rhs) {
    return BigInteger.valueOf(lhs).divide(rhs);
  }

  public Object doDivideEquals(final byte lhs, final BigDecimal rhs) {
    return new BigDecimal(lhs).divide(rhs);
  }

  public Object doDivideEquals(final Object lhs, final byte rhs) {
    return doDivideEquals(((NgByte)lhs).getByteValue(), rhs);
  }

  public Object doDivideEquals(final Object lhs, final char rhs) {
    return doDivideEquals(((NgByte)lhs).getByteValue(), rhs);
  }

  public Object doDivideEquals(final Object lhs, final short rhs) {
    return doDivideEquals(((NgByte)lhs).getByteValue(), rhs);
  }

  public Object doDivideEquals(final Object lhs, final int rhs) {
    return doDivideEquals(((NgByte)lhs).getByteValue(), rhs);
  }

  public Object doDivideEquals(final Object lhs, final long rhs) {
    return doDivideEquals(((NgByte)lhs).getByteValue(), rhs);
  }

  public Object doDivideEquals(final Object lhs, final float rhs) {
    return doDivideEquals(((NgByte)lhs).getByteValue(), rhs);
  }

  public Object doDivideEquals(final Object lhs, final double rhs) {
    return doDivideEquals(((NgByte)lhs).getByteValue(), rhs);
  }

  public Object doDivideEquals(final Object lhs, final BigInteger rhs) {
    return doDivideEquals(((NgByte)lhs).getByteValue(), rhs);
  }

  public Object doDivideEquals(final Object lhs, final BigDecimal rhs) {
    return doDivideEquals(((NgByte)lhs).getByteValue(), rhs);
  }

  public Object doReverseDivideEquals(final byte lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(byte.class).doDivideEquals(lhs, ((NgByte)rhs).getByteValue());
  }

  public Object doReverseDivideEquals(final char lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(char.class).doDivideEquals(lhs, ((NgByte)rhs).getByteValue());
  }

  public Object doReverseDivideEquals(final short lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(short.class).doDivideEquals(lhs, ((NgByte)rhs).getByteValue());
  }

  public Object doReverseDivideEquals(final int lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(int.class).doDivideEquals(lhs, ((NgByte)rhs).getByteValue());
  }

  public Object doReverseDivideEquals(final long lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(long.class).doDivideEquals(lhs, ((NgByte)rhs).getByteValue());
  }

  public Object doReverseDivideEquals(final float lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(float.class).doDivideEquals(lhs, ((NgByte)rhs).getByteValue());
  }

  public Object doReverseDivideEquals(final double lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(double.class).doDivideEquals(lhs, ((NgByte)rhs).getByteValue());
  }

  public Object doReverseDivideEquals(final BigInteger lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(BigInteger.class).doDivideEquals(lhs, ((NgByte)rhs).getByteValue());
  }

  public Object doReverseDivideEquals(final BigDecimal lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(BigDecimal.class).doDivideEquals(lhs, ((NgByte)rhs).getByteValue());
  }

  public Object doRemainder(final Object lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseRemainder(((NgByte)lhs).getByteValue(), rhs);
  }

  public Object doRemainder(final byte lhs, final byte rhs) {
    return new NgInt(lhs % rhs);
  }

  public Object doRemainder(final byte lhs, final char rhs) {
    return new NgInt(lhs % rhs);
  }

  public Object doRemainder(final byte lhs, final short rhs) {
    return new NgInt(lhs % rhs);
  }

  public Object doRemainder(final byte lhs, final int rhs) {
    return new NgInt(lhs % rhs);
  }

  public Object doRemainder(final byte lhs, final long rhs) {
    return new NgLong(lhs % rhs);
  }

  public Object doRemainder(final byte lhs, final BigInteger rhs) {
    return BigInteger.valueOf(lhs).mod(rhs);
  }

  public Object doRemainder(final Object lhs, final byte rhs) {
    return doRemainder(((NgByte)lhs).getByteValue(), rhs);
  }

  public Object doRemainder(final Object lhs, final char rhs) {
    return doRemainder(((NgByte)lhs).getByteValue(), rhs);
  }

  public Object doRemainder(final Object lhs, final short rhs) {
    return doRemainder(((NgByte)lhs).getByteValue(), rhs);
  }

  public Object doRemainder(final Object lhs, final int rhs) {
    return doRemainder(((NgByte)lhs).getByteValue(), rhs);
  }

  public Object doRemainder(final Object lhs, final long rhs) {
    return doRemainder(((NgByte)lhs).getByteValue(), rhs);
  }

  public Object doRemainder(final Object lhs, final BigInteger rhs) {
    return doRemainder(((NgByte)lhs).getByteValue(), rhs);
  }

  public Object doReverseRemainder(final byte lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(byte.class).doRemainder(lhs, ((NgByte)rhs).getByteValue());
  }

  public Object doReverseRemainder(final char lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(char.class).doRemainder(lhs, ((NgByte)rhs).getByteValue());
  }

  public Object doReverseRemainder(final short lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(short.class).doRemainder(lhs, ((NgByte)rhs).getByteValue());
  }

  public Object doReverseRemainder(final int lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(int.class).doRemainder(lhs, ((NgByte)rhs).getByteValue());
  }

  public Object doReverseRemainder(final long lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(long.class).doRemainder(lhs, ((NgByte)rhs).getByteValue());
  }

  public Object doReverseRemainder(final BigInteger lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(BigInteger.class).doRemainder(lhs, ((NgByte)rhs).getByteValue());
  }

  public Object doRemainderEquals(final Object lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseRemainderEquals(((NgByte)lhs).getByteValue(), rhs);
  }

  public Object doRemainderEquals(final byte lhs, final byte rhs) {
    return new NgInt(lhs % rhs);
  }

  public Object doRemainderEquals(final byte lhs, final char rhs) {
    return new NgInt(lhs % rhs);
  }

  public Object doRemainderEquals(final byte lhs, final short rhs) {
    return new NgInt(lhs % rhs);
  }

  public Object doRemainderEquals(final byte lhs, final int rhs) {
    return new NgInt(lhs % rhs);
  }

  public Object doRemainderEquals(final byte lhs, final long rhs) {
    return new NgLong(lhs % rhs);
  }

  public Object doRemainderEquals(final byte lhs, final BigInteger rhs) {
    return BigInteger.valueOf(lhs).mod(rhs);
  }

  public Object doRemainderEquals(final Object lhs, final byte rhs) {
    return doRemainderEquals(((NgByte)lhs).getByteValue(), rhs);
  }

  public Object doRemainderEquals(final Object lhs, final char rhs) {
    return doRemainderEquals(((NgByte)lhs).getByteValue(), rhs);
  }

  public Object doRemainderEquals(final Object lhs, final short rhs) {
    return doRemainderEquals(((NgByte)lhs).getByteValue(), rhs);
  }

  public Object doRemainderEquals(final Object lhs, final int rhs) {
    return doRemainderEquals(((NgByte)lhs).getByteValue(), rhs);
  }

  public Object doRemainderEquals(final Object lhs, final long rhs) {
    return doRemainderEquals(((NgByte)lhs).getByteValue(), rhs);
  }

  public Object doRemainderEquals(final Object lhs, final BigInteger rhs) {
    return doRemainderEquals(((NgByte)lhs).getByteValue(), rhs);
  }

  public Object doReverseRemainderEquals(final byte lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(byte.class).doRemainderEquals(lhs, ((NgByte)rhs).getByteValue());
  }

  public Object doReverseRemainderEquals(final char lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(char.class).doRemainderEquals(lhs, ((NgByte)rhs).getByteValue());
  }

  public Object doReverseRemainderEquals(final short lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(short.class).doRemainderEquals(lhs, ((NgByte)rhs).getByteValue());
  }

  public Object doReverseRemainderEquals(final int lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(int.class).doRemainderEquals(lhs, ((NgByte)rhs).getByteValue());
  }

  public Object doReverseRemainderEquals(final long lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(long.class).doRemainderEquals(lhs, ((NgByte)rhs).getByteValue());
  }

  public Object doReverseRemainderEquals(final BigInteger lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(BigInteger.class).doRemainderEquals(lhs, ((NgByte)rhs).getByteValue());
  }

  public Object doIntegerDivide(final Object lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseIntegerDivide(((NgByte)lhs).getByteValue(), rhs);
  }

  public Object doIntegerDivide(final byte lhs, final byte rhs) {
    return new NgInt(lhs / rhs);
  }

  public Object doIntegerDivide(final byte lhs, final char rhs) {
    return new NgInt(lhs / rhs);
  }

  public Object doIntegerDivide(final byte lhs, final short rhs) {
    return new NgInt(lhs / rhs);
  }

  public Object doIntegerDivide(final byte lhs, final int rhs) {
    return new NgInt(lhs / rhs);
  }

  public Object doIntegerDivide(final byte lhs, final long rhs) {
    return new NgLong(lhs / rhs);
  }

  public Object doIntegerDivide(final byte lhs, final float rhs) {
    return new NgFloat((float)Math.floor(lhs / rhs));
  }

  public Object doIntegerDivide(final byte lhs, final double rhs) {
    return new NgDouble(Math.floor(lhs / rhs));
  }

  public Object doIntegerDivide(final byte lhs, final BigInteger rhs) {
    return BigInteger.valueOf(lhs).divide(rhs);
  }

  public Object doIntegerDivide(final byte lhs, final BigDecimal rhs) {
    return BigDecimal.valueOf(lhs).divideToIntegralValue(rhs);
  }

  public Object doIntegerDivide(final Object lhs, final byte rhs) {
    return doIntegerDivide(((NgByte)lhs).getByteValue(), rhs);
  }

  public Object doIntegerDivide(final Object lhs, final char rhs) {
    return doIntegerDivide(((NgByte)lhs).getByteValue(), rhs);
  }

  public Object doIntegerDivide(final Object lhs, final short rhs) {
    return doIntegerDivide(((NgByte)lhs).getByteValue(), rhs);
  }

  public Object doIntegerDivide(final Object lhs, final int rhs) {
    return doIntegerDivide(((NgByte)lhs).getByteValue(), rhs);
  }

  public Object doIntegerDivide(final Object lhs, final long rhs) {
    return doIntegerDivide(((NgByte)lhs).getByteValue(), rhs);
  }

  public Object doIntegerDivide(final Object lhs, final float rhs) {
    return doIntegerDivide(((NgByte)lhs).getByteValue(), rhs);
  }

  public Object doIntegerDivide(final Object lhs, final double rhs) {
    return doIntegerDivide(((NgByte)lhs).getByteValue(), rhs);
  }

  public Object doIntegerDivide(final Object lhs, final BigInteger rhs) {
    return doIntegerDivide(((NgByte)lhs).getByteValue(), rhs);
  }

  public Object doIntegerDivide(final Object lhs, final BigDecimal rhs) {
    return doIntegerDivide(((NgByte)lhs).getByteValue(), rhs);
  }

  public Object doReverseIntegerDivide(final byte lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(byte.class).doIntegerDivide(lhs, ((NgByte)rhs).getByteValue());
  }

  public Object doReverseIntegerDivide(final char lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(char.class).doIntegerDivide(lhs, ((NgByte)rhs).getByteValue());
  }

  public Object doReverseIntegerDivide(final short lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(short.class).doIntegerDivide(lhs, ((NgByte)rhs).getByteValue());
  }

  public Object doReverseIntegerDivide(final int lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(int.class).doIntegerDivide(lhs, ((NgByte)rhs).getByteValue());
  }

  public Object doReverseIntegerDivide(final long lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(long.class).doIntegerDivide(lhs, ((NgByte)rhs).getByteValue());
  }

  public Object doReverseIntegerDivide(final float lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(float.class).doIntegerDivide(lhs, ((NgByte)rhs).getByteValue());
  }

  public Object doReverseIntegerDivide(final double lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(double.class).doIntegerDivide(lhs, ((NgByte)rhs).getByteValue());
  }

  public Object doReverseIntegerDivide(final BigInteger lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(BigInteger.class).doIntegerDivide(lhs, ((NgByte)rhs).getByteValue());
  }

  public Object doReverseIntegerDivide(final BigDecimal lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(BigDecimal.class).doIntegerDivide(lhs, ((NgByte)rhs).getByteValue());
  }

  public Object doIntegerDivideEquals(final Object lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseIntegerDivideEquals(((NgByte)lhs).getByteValue(), rhs);
  }

  public Object doIntegerDivideEquals(final byte lhs, final byte rhs) {
    return new NgInt(lhs / rhs);
  }

  public Object doIntegerDivideEquals(final byte lhs, final char rhs) {
    return new NgInt(lhs / rhs);
  }

  public Object doIntegerDivideEquals(final byte lhs, final short rhs) {
    return new NgInt(lhs / rhs);
  }

  public Object doIntegerDivideEquals(final byte lhs, final int rhs) {
    return new NgInt(lhs / rhs);
  }

  public Object doIntegerDivideEquals(final byte lhs, final long rhs) {
    return new NgLong(lhs / rhs);
  }

  public Object doIntegerDivideEquals(final byte lhs, final float rhs) {
    return new NgFloat((float)Math.floor(lhs / rhs));
  }

  public Object doIntegerDivideEquals(final byte lhs, final double rhs) {
    return new NgDouble(Math.floor(lhs / rhs));
  }

  public Object doIntegerDivideEquals(final byte lhs, final BigInteger rhs) {
    return BigInteger.valueOf(lhs).divide(rhs);
  }

  public Object doIntegerDivideEquals(final byte lhs, final BigDecimal rhs) {
    return BigDecimal.valueOf(lhs).divideToIntegralValue(rhs);
  }

  public Object doIntegerDivideEquals(final Object lhs, final byte rhs) {
    return doIntegerDivideEquals(((NgByte)lhs).getByteValue(), rhs);
  }

  public Object doIntegerDivideEquals(final Object lhs, final char rhs) {
    return doIntegerDivideEquals(((NgByte)lhs).getByteValue(), rhs);
  }

  public Object doIntegerDivideEquals(final Object lhs, final short rhs) {
    return doIntegerDivideEquals(((NgByte)lhs).getByteValue(), rhs);
  }

  public Object doIntegerDivideEquals(final Object lhs, final int rhs) {
    return doIntegerDivideEquals(((NgByte)lhs).getByteValue(), rhs);
  }

  public Object doIntegerDivideEquals(final Object lhs, final long rhs) {
    return doIntegerDivideEquals(((NgByte)lhs).getByteValue(), rhs);
  }

  public Object doIntegerDivideEquals(final Object lhs, final float rhs) {
    return doIntegerDivideEquals(((NgByte)lhs).getByteValue(), rhs);
  }

  public Object doIntegerDivideEquals(final Object lhs, final double rhs) {
    return doIntegerDivideEquals(((NgByte)lhs).getByteValue(), rhs);
  }

  public Object doIntegerDivideEquals(final Object lhs, final BigInteger rhs) {
    return doIntegerDivideEquals(((NgByte)lhs).getByteValue(), rhs);
  }

  public Object doIntegerDivideEquals(final Object lhs, final BigDecimal rhs) {
    return doIntegerDivideEquals(((NgByte)lhs).getByteValue(), rhs);
  }

  public Object doReverseIntegerDivideEquals(final byte lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(byte.class).doIntegerDivideEquals(lhs, ((NgByte)rhs).getByteValue());
  }

  public Object doReverseIntegerDivideEquals(final char lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(char.class).doIntegerDivideEquals(lhs, ((NgByte)rhs).getByteValue());
  }

  public Object doReverseIntegerDivideEquals(final short lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(short.class).doIntegerDivideEquals(lhs, ((NgByte)rhs).getByteValue());
  }

  public Object doReverseIntegerDivideEquals(final int lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(int.class).doIntegerDivideEquals(lhs, ((NgByte)rhs).getByteValue());
  }

  public Object doReverseIntegerDivideEquals(final long lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(long.class).doIntegerDivideEquals(lhs, ((NgByte)rhs).getByteValue());
  }

  public Object doReverseIntegerDivideEquals(final float lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(float.class).doIntegerDivide(lhs, ((NgByte)rhs).getByteValue());
  }

  public Object doReverseIntegerDivideEquals(final double lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(double.class).doIntegerDivide(lhs, ((NgByte)rhs).getByteValue());
  }

  public Object doReverseIntegerDivideEquals(final BigInteger lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(BigInteger.class).doIntegerDivideEquals(lhs, ((NgByte)rhs).getByteValue());
  }

  public Object doReverseIntegerDivideEquals(final BigDecimal lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(BigDecimal.class).doIntegerDivideEquals(lhs, ((NgByte)rhs).getByteValue());
  }

  public Object doAnd(final Object lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseAnd(((NgByte)lhs).getByteValue(), rhs);
  }

  public Object doAnd(final byte lhs, final byte rhs) {
    return new NgInt(lhs & rhs);
  }

  public Object doAnd(final byte lhs, final char rhs) {
    return new NgInt(lhs & rhs);
  }

  public Object doAnd(final byte lhs, final short rhs) {
    return new NgInt(lhs & rhs);
  }

  public Object doAnd(final byte lhs, final int rhs) {
    return new NgInt(lhs & rhs);
  }

  public Object doAnd(final byte lhs, final long rhs) {
    return new NgLong(lhs & rhs);
  }

  public Object doAnd(final byte lhs, final BigInteger rhs) {
    return BigInteger.valueOf(lhs).and(rhs);
  }

  public Object doAnd(final Object lhs, final byte rhs) {
    return doAnd(((NgByte)lhs).getByteValue(), rhs);
  }

  public Object doAnd(final Object lhs, final char rhs) {
    return doAnd(((NgByte)lhs).getByteValue(), rhs);
  }

  public Object doAnd(final Object lhs, final short rhs) {
    return doAnd(((NgByte)lhs).getByteValue(), rhs);
  }

  public Object doAnd(final Object lhs, final int rhs) {
    return doAnd(((NgByte)lhs).getByteValue(), rhs);
  }

  public Object doAnd(final Object lhs, final long rhs) {
    return doAnd(((NgByte)lhs).getByteValue(), rhs);
  }

  public Object doAnd(final Object lhs, final BigInteger rhs) {
    return doAnd(((NgByte)lhs).getByteValue(), rhs);
  }

  public Object doReverseAnd(final byte lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(byte.class).doAnd(lhs, ((NgByte)rhs).getByteValue());
  }

  public Object doReverseAnd(final char lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(char.class).doAnd(lhs, ((NgByte)rhs).getByteValue());
  }

  public Object doReverseAnd(final short lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(short.class).doAnd(lhs, ((NgByte)rhs).getByteValue());
  }

  public Object doReverseAnd(final int lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(int.class).doAnd(lhs, ((NgByte)rhs).getByteValue());
  }

  public Object doReverseAnd(final long lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(long.class).doAnd(lhs, ((NgByte)rhs).getByteValue());
  }

  public Object doReverseAnd(final BigInteger lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(BigInteger.class).doAnd(lhs, ((NgByte)rhs).getByteValue());
  }

  public Object doAndEquals(final Object lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseAndEquals(((NgByte)lhs).getByteValue(), rhs);
  }

  public Object doAndEquals(final byte lhs, final byte rhs) {
    return new NgInt(lhs & rhs);
  }

  public Object doAndEquals(final byte lhs, final char rhs) {
    return new NgInt(lhs & rhs);
  }

  public Object doAndEquals(final byte lhs, final short rhs) {
    return new NgInt(lhs & rhs);
  }

  public Object doAndEquals(final byte lhs, final int rhs) {
    return new NgInt(lhs & rhs);
  }

  public Object doAndEquals(final byte lhs, final long rhs) {
    return new NgLong(lhs & rhs);
  }

  public Object doAndEquals(final byte lhs, final BigInteger rhs) {
    return BigInteger.valueOf(lhs).and(rhs);
  }

  public Object doAndEquals(final Object lhs, final byte rhs) {
    return doAndEquals(((NgByte)lhs).getByteValue(), rhs);
  }

  public Object doAndEquals(final Object lhs, final char rhs) {
    return doAndEquals(((NgByte)lhs).getByteValue(), rhs);
  }

  public Object doAndEquals(final Object lhs, final short rhs) {
    return doAndEquals(((NgByte)lhs).getByteValue(), rhs);
  }

  public Object doAndEquals(final Object lhs, final int rhs) {
    return doAndEquals(((NgByte)lhs).getByteValue(), rhs);
  }

  public Object doAndEquals(final Object lhs, final long rhs) {
    return doAndEquals(((NgByte)lhs).getByteValue(), rhs);
  }

  public Object doAndEquals(final Object lhs, final BigInteger rhs) {
    return doAndEquals(((NgByte)lhs).getByteValue(), rhs);
  }

  public Object doReverseAndEquals(final byte lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(byte.class).doAndEquals(lhs, ((NgByte)rhs).getByteValue());
  }

  public Object doReverseAndEquals(final char lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(char.class).doAndEquals(lhs, ((NgByte)rhs).getByteValue());
  }

  public Object doReverseAndEquals(final short lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(short.class).doAndEquals(lhs, ((NgByte)rhs).getByteValue());
  }

  public Object doReverseAndEquals(final int lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(int.class).doAndEquals(lhs, ((NgByte)rhs).getByteValue());
  }

  public Object doReverseAndEquals(final long lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(long.class).doAndEquals(lhs, ((NgByte)rhs).getByteValue());
  }

  public Object doReverseAndEquals(final BigInteger lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(BigInteger.class).doAndEquals(lhs, ((NgByte)rhs).getByteValue());
  }

  public Object doOr(final Object lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseOr(((NgByte)lhs).getByteValue(), rhs);
  }

  public Object doOr(final byte lhs, final byte rhs) {
    return new NgInt(lhs | rhs);
  }

  public Object doOr(final byte lhs, final char rhs) {
    return new NgInt(lhs | rhs);
  }

  public Object doOr(final byte lhs, final short rhs) {
    return new NgInt(lhs | rhs);
  }

  public Object doOr(final byte lhs, final int rhs) {
    return new NgInt(lhs | rhs);
  }

  public Object doOr(final byte lhs, final long rhs) {
    return new NgLong(lhs | rhs);
  }

  public Object doOr(final byte lhs, final BigInteger rhs) {
    return BigInteger.valueOf(lhs).or(rhs);
  }

  public Object doOr(final Object lhs, final byte rhs) {
    return doOr(((NgByte)lhs).getByteValue(), rhs);
  }

  public Object doOr(final Object lhs, final char rhs) {
    return doOr(((NgByte)lhs).getByteValue(), rhs);
  }

  public Object doOr(final Object lhs, final short rhs) {
    return doOr(((NgByte)lhs).getByteValue(), rhs);
  }

  public Object doOr(final Object lhs, final int rhs) {
    return doOr(((NgByte)lhs).getByteValue(), rhs);
  }

  public Object doOr(final Object lhs, final long rhs) {
    return doOr(((NgByte)lhs).getByteValue(), rhs);
  }

  public Object doOr(final Object lhs, final BigInteger rhs) {
    return doOr(((NgByte)lhs).getByteValue(), rhs);
  }

  public Object doReverseOr(final byte lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(byte.class).doOr(lhs, ((NgByte)rhs).getByteValue());
  }

  public Object doReverseOr(final char lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(char.class).doOr(lhs, ((NgByte)rhs).getByteValue());
  }

  public Object doReverseOr(final short lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(short.class).doOr(lhs, ((NgByte)rhs).getByteValue());
  }

  public Object doReverseOr(final int lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(int.class).doOr(lhs, ((NgByte)rhs).getByteValue());
  }

  public Object doReverseOr(final long lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(long.class).doOr(lhs, ((NgByte)rhs).getByteValue());
  }

  public Object doReverseOr(final BigInteger lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(BigInteger.class).doOr(lhs, ((NgByte)rhs).getByteValue());
  }

  public Object doOrEquals(final Object lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseOrEquals(((NgByte)lhs).getByteValue(), rhs);
  }

  public Object doOrEquals(final byte lhs, final byte rhs) {
    return new NgInt(lhs | rhs);
  }

  public Object doOrEquals(final byte lhs, final char rhs) {
    return new NgInt(lhs | rhs);
  }

  public Object doOrEquals(final byte lhs, final short rhs) {
    return new NgInt(lhs | rhs);
  }

  public Object doOrEquals(final byte lhs, final int rhs) {
    return new NgInt(lhs | rhs);
  }

  public Object doOrEquals(final byte lhs, final long rhs) {
    return new NgLong(lhs | rhs);
  }

  public Object doOrEquals(final byte lhs, final BigInteger rhs) {
    return BigInteger.valueOf(lhs).or(rhs);
  }

  public Object doOrEquals(final Object lhs, final byte rhs) {
    return doOrEquals(((NgByte)lhs).getByteValue(), rhs);
  }

  public Object doOrEquals(final Object lhs, final char rhs) {
    return doOrEquals(((NgByte)lhs).getByteValue(), rhs);
  }

  public Object doOrEquals(final Object lhs, final short rhs) {
    return doOrEquals(((NgByte)lhs).getByteValue(), rhs);
  }

  public Object doOrEquals(final Object lhs, final int rhs) {
    return doOrEquals(((NgByte)lhs).getByteValue(), rhs);
  }

  public Object doOrEquals(final Object lhs, final long rhs) {
    return doOrEquals(((NgByte)lhs).getByteValue(), rhs);
  }

  public Object doOrEquals(final Object lhs, final BigInteger rhs) {
    return doOrEquals(((NgByte)lhs).getByteValue(), rhs);
  }

  public Object doReverseOrEquals(final byte lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(byte.class).doOrEquals(lhs, ((NgByte)rhs).getByteValue());
  }

  public Object doReverseOrEquals(final char lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(char.class).doOrEquals(lhs, ((NgByte)rhs).getByteValue());
  }

  public Object doReverseOrEquals(final short lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(short.class).doOrEquals(lhs, ((NgByte)rhs).getByteValue());
  }

  public Object doReverseOrEquals(final int lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(int.class).doOrEquals(lhs, ((NgByte)rhs).getByteValue());
  }

  public Object doReverseOrEquals(final long lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(long.class).doOrEquals(lhs, ((NgByte)rhs).getByteValue());
  }

  public Object doReverseOrEquals(final BigInteger lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(BigInteger.class).doOrEquals(lhs, ((NgByte)rhs).getByteValue());
  }

  public Object doXor(final Object lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseXor(((NgByte)lhs).getByteValue(), rhs);
  }

  public Object doXor(final byte lhs, final byte rhs) {
    return new NgInt(lhs ^ rhs);
  }

  public Object doXor(final byte lhs, final char rhs) {
    return new NgInt(lhs ^ rhs);
  }

  public Object doXor(final byte lhs, final short rhs) {
    return new NgInt(lhs ^ rhs);
  }

  public Object doXor(final byte lhs, final int rhs) {
    return new NgInt(lhs ^ rhs);
  }

  public Object doXor(final byte lhs, final long rhs) {
    return new NgLong(lhs ^ rhs);
  }

  public Object doXor(final byte lhs, final BigInteger rhs) {
    return BigInteger.valueOf(lhs).xor(rhs);
  }

  public Object doXor(final Object lhs, final byte rhs) {
    return doXor(((NgByte)lhs).getByteValue(), rhs);
  }

  public Object doXor(final Object lhs, final char rhs) {
    return doXor(((NgByte)lhs).getByteValue(), rhs);
  }

  public Object doXor(final Object lhs, final short rhs) {
    return doXor(((NgByte)lhs).getByteValue(), rhs);
  }

  public Object doXor(final Object lhs, final int rhs) {
    return doXor(((NgByte)lhs).getByteValue(), rhs);
  }

  public Object doXor(final Object lhs, final long rhs) {
    return doXor(((NgByte)lhs).getByteValue(), rhs);
  }

  public Object doXor(final Object lhs, final BigInteger rhs) {
    return doXor(((NgByte)lhs).getByteValue(), rhs);
  }

  public Object doReverseXor(final byte lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(byte.class).doXor(lhs, ((NgByte)rhs).getByteValue());
  }

  public Object doReverseXor(final char lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(char.class).doXor(lhs, ((NgByte)rhs).getByteValue());
  }

  public Object doReverseXor(final short lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(short.class).doXor(lhs, ((NgByte)rhs).getByteValue());
  }

  public Object doReverseXor(final int lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(int.class).doXor(lhs, ((NgByte)rhs).getByteValue());
  }

  public Object doReverseXor(final long lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(long.class).doXor(lhs, ((NgByte)rhs).getByteValue());
  }

  public Object doReverseXor(final BigInteger lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(BigInteger.class).doXor(lhs, ((NgByte)rhs).getByteValue());
  }

  public Object doXorEquals(final Object lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseXorEquals(((NgByte)lhs).getByteValue(), rhs);
  }

  public Object doXorEquals(final byte lhs, final byte rhs) {
    return new NgInt(lhs ^ rhs);
  }

  public Object doXorEquals(final byte lhs, final char rhs) {
    return new NgInt(lhs ^ rhs);
  }

  public Object doXorEquals(final byte lhs, final short rhs) {
    return new NgInt(lhs ^ rhs);
  }

  public Object doXorEquals(final byte lhs, final int rhs) {
    return new NgInt(lhs ^ rhs);
  }

  public Object doXorEquals(final byte lhs, final long rhs) {
    return new NgLong(lhs ^ rhs);
  }

  public Object doXorEquals(final byte lhs, final BigInteger rhs) {
    return BigInteger.valueOf(lhs).xor(rhs);
  }

  public Object doXorEquals(final Object lhs, final byte rhs) {
    return doXorEquals(((NgByte)lhs).getByteValue(), rhs);
  }

  public Object doXorEquals(final Object lhs, final char rhs) {
    return doXorEquals(((NgByte)lhs).getByteValue(), rhs);
  }

  public Object doXorEquals(final Object lhs, final short rhs) {
    return doXorEquals(((NgByte)lhs).getByteValue(), rhs);
  }

  public Object doXorEquals(final Object lhs, final int rhs) {
    return doXorEquals(((NgByte)lhs).getByteValue(), rhs);
  }

  public Object doXorEquals(final Object lhs, final long rhs) {
    return doXorEquals(((NgByte)lhs).getByteValue(), rhs);
  }

  public Object doXorEquals(final Object lhs, final BigInteger rhs) {
    return doXorEquals(((NgByte)lhs).getByteValue(), rhs);
  }

  public Object doReverseXorEquals(final byte lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(byte.class).doXorEquals(lhs, ((NgByte)rhs).getByteValue());
  }

  public Object doReverseXorEquals(final char lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(char.class).doXorEquals(lhs, ((NgByte)rhs).getByteValue());
  }

  public Object doReverseXorEquals(final short lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(short.class).doXorEquals(lhs, ((NgByte)rhs).getByteValue());
  }

  public Object doReverseXorEquals(final int lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(int.class).doXorEquals(lhs, ((NgByte)rhs).getByteValue());
  }

  public Object doReverseXorEquals(final long lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(long.class).doXorEquals(lhs, ((NgByte)rhs).getByteValue());
  }

  public Object doReverseXorEquals(final BigInteger lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(BigInteger.class).doXorEquals(lhs, ((NgByte)rhs).getByteValue());
  }

  public Object doLeftShift(final Object lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseLeftShift(((NgByte)lhs).getByteValue(), rhs);
  }

  public Object doLeftShift(final byte lhs, final byte rhs) {
    return new NgInt(lhs << rhs);
  }

  public Object doLeftShift(final byte lhs, final char rhs) {
    return new NgInt(lhs << rhs);
  }

  public Object doLeftShift(final byte lhs, final short rhs) {
    return new NgInt(lhs << rhs);
  }

  public Object doLeftShift(final byte lhs, final int rhs) {
    return new NgInt(lhs << rhs);
  }

  public Object doLeftShift(final byte lhs, final long rhs) {
    return new NgInt(lhs << rhs);
  }

  public Object doLeftShift(final byte lhs, final BigInteger rhs) {
    return new NgInt(lhs << rhs.intValue());
  }

  public Object doLeftShift(final Object lhs, final byte rhs) {
    return doLeftShift(((NgByte)lhs).getByteValue(), rhs);
  }

  public Object doLeftShift(final Object lhs, final char rhs) {
    return doLeftShift(((NgByte)lhs).getByteValue(), rhs);
  }

  public Object doLeftShift(final Object lhs, final short rhs) {
    return doLeftShift(((NgByte)lhs).getByteValue(), rhs);
  }

  public Object doLeftShift(final Object lhs, final int rhs) {
    return doLeftShift(((NgByte)lhs).getByteValue(), rhs);
  }

  public Object doLeftShift(final Object lhs, final long rhs) {
    return doLeftShift(((NgByte)lhs).getByteValue(), rhs);
  }

  public Object doLeftShift(final Object lhs, final BigInteger rhs) {
    return doLeftShift(((NgByte)lhs).getByteValue(), rhs);
  }

  public Object doReverseLeftShift(final byte lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(byte.class).doLeftShift(lhs, ((NgByte)rhs).getByteValue());
  }

  public Object doReverseLeftShift(final char lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(char.class).doLeftShift(lhs, ((NgByte)rhs).getByteValue());
  }

  public Object doReverseLeftShift(final short lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(short.class).doLeftShift(lhs, ((NgByte)rhs).getByteValue());
  }

  public Object doReverseLeftShift(final int lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(int.class).doLeftShift(lhs, ((NgByte)rhs).getByteValue());
  }

  public Object doReverseLeftShift(final long lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(long.class).doLeftShift(lhs, ((NgByte)rhs).getByteValue());
  }

  public Object doReverseLeftShift(final BigInteger lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(BigInteger.class).doLeftShift(lhs, ((NgByte)rhs).getByteValue());
  }

  public Object doLeftShiftEquals(final Object lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseLeftShiftEquals(((NgByte)lhs).getByteValue(), rhs);
  }

  public Object doLeftShiftEquals(final byte lhs, final byte rhs) {
    return new NgInt(lhs << rhs);
  }

  public Object doLeftShiftEquals(final byte lhs, final char rhs) {
    return new NgInt(lhs << rhs);
  }

  public Object doLeftShiftEquals(final byte lhs, final short rhs) {
    return new NgInt(lhs << rhs);
  }

  public Object doLeftShiftEquals(final byte lhs, final int rhs) {
    return new NgInt(lhs << rhs);
  }

  public Object doLeftShiftEquals(final byte lhs, final long rhs) {
    return new NgInt(lhs << rhs);
  }

  public Object doLeftShiftEquals(final byte lhs, final BigInteger rhs) {
    return new NgInt(lhs << rhs.intValue());
  }

  public Object doLeftShiftEquals(final Object lhs, final byte rhs) {
    return doLeftShiftEquals(((NgByte)lhs).getByteValue(), rhs);
  }

  public Object doLeftShiftEquals(final Object lhs, final char rhs) {
    return doLeftShiftEquals(((NgByte)lhs).getByteValue(), rhs);
  }

  public Object doLeftShiftEquals(final Object lhs, final short rhs) {
    return doLeftShiftEquals(((NgByte)lhs).getByteValue(), rhs);
  }

  public Object doLeftShiftEquals(final Object lhs, final int rhs) {
    return doLeftShiftEquals(((NgByte)lhs).getByteValue(), rhs);
  }

  public Object doLeftShiftEquals(final Object lhs, final long rhs) {
    return doLeftShiftEquals(((NgByte)lhs).getByteValue(), rhs);
  }

  public Object doLeftShiftEquals(final Object lhs, final BigInteger rhs) {
    return doLeftShiftEquals(((NgByte)lhs).getByteValue(), rhs);
  }

  public Object doReverseLeftShiftEquals(final byte lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(byte.class).doLeftShiftEquals(lhs, ((NgByte)rhs).getByteValue());
  }

  public Object doReverseLeftShiftEquals(final char lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(char.class).doLeftShiftEquals(lhs, ((NgByte)rhs).getByteValue());
  }

  public Object doReverseLeftShiftEquals(final short lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(short.class).doLeftShiftEquals(lhs, ((NgByte)rhs).getByteValue());
  }

  public Object doReverseLeftShiftEquals(final int lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(int.class).doLeftShiftEquals(lhs, ((NgByte)rhs).getByteValue());
  }

  public Object doReverseLeftShiftEquals(final long lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(long.class).doLeftShiftEquals(lhs, ((NgByte)rhs).getByteValue());
  }

  public Object doReverseLeftShiftEquals(final BigInteger lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(BigInteger.class).doLeftShiftEquals(lhs, ((NgByte)rhs).getByteValue());
  }

  public Object doArithmeticRightShift(final Object lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseArithmeticRightShift(((NgByte)lhs).getByteValue(), rhs);
  }

  public Object doArithmeticRightShift(final byte lhs, final byte rhs) {
    return new NgInt(lhs >> rhs);
  }

  public Object doArithmeticRightShift(final byte lhs, final char rhs) {
    return new NgInt(lhs >> rhs);
  }

  public Object doArithmeticRightShift(final byte lhs, final short rhs) {
    return new NgInt(lhs >> rhs);
  }

  public Object doArithmeticRightShift(final byte lhs, final int rhs) {
    return new NgInt(lhs >> rhs);
  }

  public Object doArithmeticRightShift(final byte lhs, final long rhs) {
    return new NgInt(lhs >> rhs);
  }

  public Object doArithmeticRightShift(final byte lhs, final BigInteger rhs) {
    return new NgInt(lhs >> rhs.intValue());
  }

  public Object doArithmeticRightShift(final Object lhs, final byte rhs) {
    return doArithmeticRightShift(((NgByte)lhs).getByteValue(), rhs);
  }

  public Object doArithmeticRightShift(final Object lhs, final char rhs) {
    return doArithmeticRightShift(((NgByte)lhs).getByteValue(), rhs);
  }

  public Object doArithmeticRightShift(final Object lhs, final short rhs) {
    return doArithmeticRightShift(((NgByte)lhs).getByteValue(), rhs);
  }

  public Object doArithmeticRightShift(final Object lhs, final int rhs) {
    return doArithmeticRightShift(((NgByte)lhs).getByteValue(), rhs);
  }

  public Object doArithmeticRightShift(final Object lhs, final long rhs) {
    return doArithmeticRightShift(((NgByte)lhs).getByteValue(), rhs);
  }

  public Object doArithmeticRightShift(final Object lhs, final BigInteger rhs) {
    return doArithmeticRightShift(((NgByte)lhs).getByteValue(), rhs);
  }

  public Object doReverseArithmeticRightShift(final byte lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(byte.class).doArithmeticRightShift(lhs, ((NgByte)rhs).getByteValue());
  }

  public Object doReverseArithmeticRightShift(final char lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(char.class).doArithmeticRightShift(lhs, ((NgByte)rhs).getByteValue());
  }

  public Object doReverseArithmeticRightShift(final short lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(short.class).doArithmeticRightShift(lhs, ((NgByte)rhs).getByteValue());
  }

  public Object doReverseArithmeticRightShift(final int lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(int.class).doArithmeticRightShift(lhs, ((NgByte)rhs).getByteValue());
  }

  public Object doReverseArithmeticRightShift(final long lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(long.class).doArithmeticRightShift(lhs, ((NgByte)rhs).getByteValue());
  }

  public Object doReverseArithmeticRightShift(final BigInteger lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(BigInteger.class).doArithmeticRightShift(lhs, ((NgByte)rhs).getByteValue());
  }

  public Object doArithmeticRightShiftEquals(final Object lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseArithmeticRightShiftEquals(((NgByte)lhs).getByteValue(), rhs);
  }

  public Object doArithmeticRightShiftEquals(final byte lhs, final byte rhs) {
    return new NgInt(lhs >> rhs);
  }

  public Object doArithmeticRightShiftEquals(final byte lhs, final char rhs) {
    return new NgInt(lhs >> rhs);
  }

  public Object doArithmeticRightShiftEquals(final byte lhs, final short rhs) {
    return new NgInt(lhs >> rhs);
  }

  public Object doArithmeticRightShiftEquals(final byte lhs, final int rhs) {
    return new NgInt(lhs >> rhs);
  }

  public Object doArithmeticRightShiftEquals(final byte lhs, final long rhs) {
    return new NgInt(lhs >> rhs);
  }

  public Object doArithmeticRightShiftEquals(final byte lhs, final BigInteger rhs) {
    return new NgInt(lhs >> rhs.intValue());
  }

  public Object doArithmeticRightShiftEquals(final Object lhs, final byte rhs) {
    return doArithmeticRightShiftEquals(((NgByte)lhs).getByteValue(), rhs);
  }

  public Object doArithmeticRightShiftEquals(final Object lhs, final char rhs) {
    return doArithmeticRightShiftEquals(((NgByte)lhs).getByteValue(), rhs);
  }

  public Object doArithmeticRightShiftEquals(final Object lhs, final short rhs) {
    return doArithmeticRightShiftEquals(((NgByte)lhs).getByteValue(), rhs);
  }

  public Object doArithmeticRightShiftEquals(final Object lhs, final int rhs) {
    return doArithmeticRightShiftEquals(((NgByte)lhs).getByteValue(), rhs);
  }

  public Object doArithmeticRightShiftEquals(final Object lhs, final long rhs) {
    return doArithmeticRightShiftEquals(((NgByte)lhs).getByteValue(), rhs);
  }

  public Object doArithmeticRightShiftEquals(final Object lhs, final BigInteger rhs) {
    return doArithmeticRightShiftEquals(((NgByte)lhs).getByteValue(), rhs);
  }

  public Object doReverseArithmeticRightShiftEquals(final byte lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(byte.class).doArithmeticRightShiftEquals(lhs, ((NgByte)rhs).getByteValue());
  }

  public Object doReverseArithmeticRightShiftEquals(final char lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(char.class).doArithmeticRightShiftEquals(lhs, ((NgByte)rhs).getByteValue());
  }

  public Object doReverseArithmeticRightShiftEquals(final short lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(short.class).doArithmeticRightShiftEquals(lhs, ((NgByte)rhs).getByteValue());
  }

  public Object doReverseArithmeticRightShiftEquals(final int lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(int.class).doArithmeticRightShiftEquals(lhs, ((NgByte)rhs).getByteValue());
  }

  public Object doReverseArithmeticRightShiftEquals(final long lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(long.class).doArithmeticRightShiftEquals(lhs, ((NgByte)rhs).getByteValue());
  }

  public Object doReverseArithmeticRightShiftEquals(final BigInteger lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(BigInteger.class).doArithmeticRightShiftEquals(lhs, ((NgByte)rhs).getByteValue());
  }

  public Object doLogicalRightShift(final Object lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseLogicalRightShift(((NgByte)lhs).getByteValue(), rhs);
  }

  public Object doLogicalRightShift(final byte lhs, final byte rhs) {
    return new NgInt(lhs >>> rhs);
  }

  public Object doLogicalRightShift(final byte lhs, final char rhs) {
    return new NgInt(lhs >>> rhs);
  }

  public Object doLogicalRightShift(final byte lhs, final short rhs) {
    return new NgInt(lhs >>> rhs);
  }

  public Object doLogicalRightShift(final byte lhs, final int rhs) {
    return new NgInt(lhs >>> rhs);
  }

  public Object doLogicalRightShift(final byte lhs, final long rhs) {
    return new NgInt(lhs >>> rhs);
  }

  public Object doLogicalRightShift(final byte lhs, final BigInteger rhs) {
    return new NgInt(lhs >>> rhs.intValue());
  }

  public Object doLogicalRightShift(final Object lhs, final byte rhs) {
    return doLogicalRightShift(((NgByte)lhs).getByteValue(), rhs);
  }

  public Object doLogicalRightShift(final Object lhs, final char rhs) {
    return doLogicalRightShift(((NgByte)lhs).getByteValue(), rhs);
  }

  public Object doLogicalRightShift(final Object lhs, final short rhs) {
    return doLogicalRightShift(((NgByte)lhs).getByteValue(), rhs);
  }

  public Object doLogicalRightShift(final Object lhs, final int rhs) {
    return doLogicalRightShift(((NgByte)lhs).getByteValue(), rhs);
  }

  public Object doLogicalRightShift(final Object lhs, final long rhs) {
    return doLogicalRightShift(((NgByte)lhs).getByteValue(), rhs);
  }

  public Object doLogicalRightShift(final Object lhs, final BigInteger rhs) {
    return doLogicalRightShift(((NgByte)lhs).getByteValue(), rhs);
  }

  public Object doReverseLogicalRightShift(final byte lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(byte.class).doLogicalRightShift(lhs, ((NgByte)rhs).getByteValue());
  }

  public Object doReverseLogicalRightShift(final char lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(char.class).doLogicalRightShift(lhs, ((NgByte)rhs).getByteValue());
  }

  public Object doReverseLogicalRightShift(final short lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(short.class).doLogicalRightShift(lhs, ((NgByte)rhs).getByteValue());
  }

  public Object doReverseLogicalRightShift(final int lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(int.class).doLogicalRightShift(lhs, ((NgByte)rhs).getByteValue());
  }

  public Object doReverseLogicalRightShift(final long lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(long.class).doLogicalRightShift(lhs, ((NgByte)rhs).getByteValue());
  }

  public Object doLogicalRightShiftEquals(final Object lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseLogicalRightShift(((NgByte)lhs).getByteValue(), rhs);
  }

  public Object doLogicalRightShiftEquals(final byte lhs, final byte rhs) {
    return new NgInt(lhs >>> rhs);
  }

  public Object doLogicalRightShiftEquals(final byte lhs, final char rhs) {
    return new NgInt(lhs >>> rhs);
  }

  public Object doLogicalRightShiftEquals(final byte lhs, final short rhs) {
    return new NgInt(lhs >>> rhs);
  }

  public Object doLogicalRightShiftEquals(final byte lhs, final int rhs) {
    return new NgInt(lhs >>> rhs);
  }

  public Object doLogicalRightShiftEquals(final byte lhs, final long rhs) {
    return new NgInt(lhs >>> rhs);
  }

  public Object doLogicalRightShiftEquals(final byte lhs, final BigInteger rhs) {
    return new NgInt(lhs >>> rhs.intValue());
  }

  public Object doLogicalRightShiftEquals(final Object lhs, final byte rhs) {
    return doLogicalRightShiftEquals(((NgByte)lhs).getByteValue(), rhs);
  }

  public Object doLogicalRightShiftEquals(final Object lhs, final char rhs) {
    return doLogicalRightShiftEquals(((NgByte)lhs).getByteValue(), rhs);
  }

  public Object doLogicalRightShiftEquals(final Object lhs, final short rhs) {
    return doLogicalRightShiftEquals(((NgByte)lhs).getByteValue(), rhs);
  }

  public Object doLogicalRightShiftEquals(final Object lhs, final int rhs) {
    return doLogicalRightShiftEquals(((NgByte)lhs).getByteValue(), rhs);
  }

  public Object doLogicalRightShiftEquals(final Object lhs, final long rhs) {
    return doLogicalRightShiftEquals(((NgByte)lhs).getByteValue(), rhs);
  }

  public Object doLogicalRightShiftEquals(final Object lhs, final BigInteger rhs) {
    return doLogicalRightShiftEquals(((NgByte)lhs).getByteValue(), rhs);
  }

  public Object doReverseLogicalRightShiftEquals(final byte lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(byte.class).doLogicalRightShiftEquals(lhs, ((NgByte)rhs).getByteValue());
  }

  public Object doReverseLogicalRightShiftEquals(final char lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(char.class).doLogicalRightShiftEquals(lhs, ((NgByte)rhs).getByteValue());
  }

  public Object doReverseLogicalRightShiftEquals(final short lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(short.class).doLogicalRightShiftEquals(lhs, ((NgByte)rhs).getByteValue());
  }

  public Object doReverseLogicalRightShiftEquals(final int lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(int.class).doLogicalRightShiftEquals(lhs, ((NgByte)rhs).getByteValue());
  }

  public Object doReverseLogicalRightShiftEquals(final long lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(long.class).doLogicalRightShiftEquals(lhs, ((NgByte)rhs).getByteValue());
  }

  public Object doCompare(final Object lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseCompare(((NgByte)lhs).getByteValue(), rhs);
  }

  public Object doCompare(final byte lhs, final byte rhs) {
    if (lhs == rhs) return NgInt.ZERO;
    if (lhs < rhs) return NgInt.MINUS_ONE;
    return NgInt.ONE;
  }

  public Object doCompare(final byte lhs, final char rhs) {
    if (lhs == rhs) return NgInt.ZERO;
    if (lhs < rhs) return NgInt.MINUS_ONE;
    return NgInt.ONE;
  }

  public Object doCompare(final byte lhs, final short rhs) {
    if (lhs == rhs) return NgInt.ZERO;
    if (lhs < rhs) return NgInt.MINUS_ONE;
    return NgInt.ONE;
  }

  public Object doCompare(final byte lhs, final int rhs) {
    if (lhs == rhs) return NgInt.ZERO;
    if (lhs < rhs) return NgInt.MINUS_ONE;
    return NgInt.ONE;
  }

  public Object doCompare(final byte lhs, final long rhs) {
    if (lhs == rhs) return NgInt.ZERO;
    if (lhs < rhs) return NgInt.MINUS_ONE;
    return NgInt.ONE;
  }

  public Object doCompare(final byte lhs, final float rhs) {
    if (lhs == rhs) return NgInt.ZERO;
    if (lhs < rhs) return NgInt.MINUS_ONE;
    return NgInt.ONE;
  }

  public Object doCompare(final byte lhs, final double rhs) {
    if (lhs == rhs) return NgInt.ZERO;
    if (lhs < rhs) return NgInt.MINUS_ONE;
    return NgInt.ONE;
  }

  public Object doCompare(final byte lhs, final BigInteger rhs) {
    return new NgInt(BigInteger.valueOf(lhs).compareTo(rhs));
  }

  public Object doCompare(final byte lhs, final BigDecimal rhs) {
    return new NgInt(new BigDecimal(lhs).compareTo(rhs));
  }

  public Object doCompare(final Object lhs, final byte rhs) {
    return doCompare(((NgByte)lhs).getByteValue(), rhs);
  }

  public Object doCompare(final Object lhs, final char rhs) {
    return doCompare(((NgByte)lhs).getByteValue(), rhs);
  }

  public Object doCompare(final Object lhs, final short rhs) {
    return doCompare(((NgByte)lhs).getByteValue(), rhs);
  }

  public Object doCompare(final Object lhs, final int rhs) {
    return doCompare(((NgByte)lhs).getByteValue(), rhs);
  }

  public Object doCompare(final Object lhs, final long rhs) {
    return doCompare(((NgByte)lhs).getByteValue(), rhs);
  }

  public Object doCompare(final Object lhs, final float rhs) {
    return doCompare(((NgByte)lhs).getByteValue(), rhs);
  }

  public Object doCompare(final Object lhs, final double rhs) {
    return doCompare(((NgByte)lhs).getByteValue(), rhs);
  }

  public Object doCompare(final Object lhs, final BigInteger rhs) {
    return doCompare(((NgByte)lhs).getByteValue(), rhs);
  }

  public Object doCompare(final Object lhs, final BigDecimal rhs) {
    return doCompare(((NgByte)lhs).getByteValue(), rhs);
  }

  public Object doReverseCompare(final byte lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(byte.class).doCompare(lhs, ((NgByte)rhs).getByteValue());
  }

  public Object doReverseCompare(final char lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(char.class).doCompare(lhs, ((NgByte)rhs).getByteValue());
  }

  public Object doReverseCompare(final short lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(short.class).doCompare(lhs, ((NgByte)rhs).getByteValue());
  }

  public Object doReverseCompare(final int lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(int.class).doCompare(lhs, ((NgByte)rhs).getByteValue());
  }

  public Object doReverseCompare(final long lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(long.class).doCompare(lhs, ((NgByte)rhs).getByteValue());
  }

  public Object doReverseCompare(final float lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(float.class).doCompare(lhs, ((NgByte)rhs).getByteValue());
  }

  public Object doReverseCompare(final double lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(double.class).doCompare(lhs, ((NgByte)rhs).getByteValue());
  }

  public Object doReverseCompare(final BigInteger lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(BigInteger.class).doCompare(lhs, ((NgByte)rhs).getByteValue());
  }

  public Object doReverseCompare(final BigDecimal lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(BigDecimal.class).doCompare(lhs, ((NgByte)rhs).getByteValue());
  }

  public Object doEquals(final Object lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseEquals(((NgByte)lhs).getByteValue(), rhs);
  }

  public Object doEquals(final byte lhs, final byte rhs) {
    return (lhs == rhs) ? NgBoolean.TRUE : NgBoolean.FALSE;
  }

  public Object doEquals(final byte lhs, final char rhs) {
    return (lhs == rhs) ? NgBoolean.TRUE : NgBoolean.FALSE;
  }

  public Object doEquals(final byte lhs, final short rhs) {
    return (lhs == rhs) ? NgBoolean.TRUE : NgBoolean.FALSE;
  }

  public Object doEquals(final byte lhs, final int rhs) {
    return (lhs == rhs) ? NgBoolean.TRUE : NgBoolean.FALSE;
  }

  public Object doEquals(final byte lhs, final long rhs) {
    return (lhs == rhs) ? NgBoolean.TRUE : NgBoolean.FALSE;
  }

  public Object doEquals(final byte lhs, final float rhs) {
    return (lhs == rhs) ? NgBoolean.TRUE : NgBoolean.FALSE;
  }

  public Object doEquals(final byte lhs, final double rhs) {
    return (lhs == rhs) ? NgBoolean.TRUE : NgBoolean.FALSE;
  }

  public Object doEquals(final byte lhs, final BigInteger rhs) {
    return (BigInteger.valueOf(lhs).compareTo(rhs) == 0) ? NgBoolean.TRUE : NgBoolean.FALSE;
  }

  public Object doEquals(final byte lhs, final BigDecimal rhs) {
    return (new BigDecimal(lhs).compareTo(rhs) == 0) ? NgBoolean.TRUE : NgBoolean.FALSE;
  }

  public Object doEquals(final Object lhs, final byte rhs) {
    return doEquals(((NgByte)lhs).getByteValue(), rhs);
  }

  public Object doEquals(final Object lhs, final char rhs) {
    return doEquals(((NgByte)lhs).getByteValue(), rhs);
  }

  public Object doEquals(final Object lhs, final short rhs) {
    return doEquals(((NgByte)lhs).getByteValue(), rhs);
  }

  public Object doEquals(final Object lhs, final int rhs) {
    return doEquals(((NgByte)lhs).getByteValue(), rhs);
  }

  public Object doEquals(final Object lhs, final long rhs) {
    return doEquals(((NgByte)lhs).getByteValue(), rhs);
  }

  public Object doEquals(final Object lhs, final float rhs) {
    return doEquals(((NgByte)lhs).getByteValue(), rhs);
  }

  public Object doEquals(final Object lhs, final double rhs) {
    return doEquals(((NgByte)lhs).getByteValue(), rhs);
  }

  public Object doEquals(final Object lhs, final BigInteger rhs) {
    return doEquals(((NgByte)lhs).getByteValue(), rhs);
  }

  public Object doEquals(final Object lhs, final BigDecimal rhs) {
    return doEquals(((NgByte)lhs).getByteValue(), rhs);
  }

  public Object doReverseEquals(final byte lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(byte.class).doEquals(lhs, ((NgByte)rhs).getByteValue());
  }

  public Object doReverseEquals(final char lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(char.class).doEquals(lhs, ((NgByte)rhs).getByteValue());
  }

  public Object doReverseEquals(final short lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(short.class).doEquals(lhs, ((NgByte)rhs).getByteValue());
  }

  public Object doReverseEquals(final int lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(int.class).doEquals(lhs, ((NgByte)rhs).getByteValue());
  }

  public Object doReverseEquals(final long lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(long.class).doEquals(lhs, ((NgByte)rhs).getByteValue());
  }

  public Object doReverseEquals(final float lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(float.class).doEquals(lhs, ((NgByte)rhs).getByteValue());
  }

  public Object doReverseEquals(final double lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(double.class).doEquals(lhs, ((NgByte)rhs).getByteValue());
  }

  public Object doReverseEquals(final BigInteger lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(BigInteger.class).doEquals(lhs, ((NgByte)rhs).getByteValue());
  }

  public Object doReverseEquals(final BigDecimal lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(BigDecimal.class).doEquals(lhs, ((NgByte)rhs).getByteValue());
  }

  public Object doNotEquals(final Object lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseNotEquals(((NgByte)lhs).getByteValue(), rhs);
  }

  public Object doNotEquals(final byte lhs, final byte rhs) {
    return (lhs != rhs) ? NgBoolean.TRUE : NgBoolean.FALSE;
  }

  public Object doNotEquals(final byte lhs, final char rhs) {
    return (lhs != rhs) ? NgBoolean.TRUE : NgBoolean.FALSE;
  }

  public Object doNotEquals(final byte lhs, final short rhs) {
    return (lhs != rhs) ? NgBoolean.TRUE : NgBoolean.FALSE;
  }

  public Object doNotEquals(final byte lhs, final int rhs) {
    return (lhs != rhs) ? NgBoolean.TRUE : NgBoolean.FALSE;
  }

  public Object doNotEquals(final byte lhs, final long rhs) {
    return (lhs != rhs) ? NgBoolean.TRUE : NgBoolean.FALSE;
  }

  public Object doNotEquals(final byte lhs, final float rhs) {
    return (lhs != rhs) ? NgBoolean.TRUE : NgBoolean.FALSE;
  }

  public Object doNotEquals(final byte lhs, final double rhs) {
    return (lhs != rhs) ? NgBoolean.TRUE : NgBoolean.FALSE;
  }

  public Object doNotEquals(final byte lhs, final BigInteger rhs) {
    return (BigInteger.valueOf(lhs).compareTo(rhs) != 0) ? NgBoolean.TRUE : NgBoolean.FALSE;
  }

  public Object doNotEquals(final byte lhs, final BigDecimal rhs) {
    return (new BigDecimal(lhs).compareTo(rhs) != 0) ? NgBoolean.TRUE : NgBoolean.FALSE;
  }

  public Object doNotEquals(final Object lhs, final byte rhs) {
    return doNotEquals(((NgByte)lhs).getByteValue(), rhs);
  }

  public Object doNotEquals(final Object lhs, final char rhs) {
    return doNotEquals(((NgByte)lhs).getByteValue(), rhs);
  }

  public Object doNotEquals(final Object lhs, final short rhs) {
    return doNotEquals(((NgByte)lhs).getByteValue(), rhs);
  }

  public Object doNotEquals(final Object lhs, final int rhs) {
    return doNotEquals(((NgByte)lhs).getByteValue(), rhs);
  }

  public Object doNotEquals(final Object lhs, final long rhs) {
    return doNotEquals(((NgByte)lhs).getByteValue(), rhs);
  }

  public Object doNotEquals(final Object lhs, final float rhs) {
    return doNotEquals(((NgByte)lhs).getByteValue(), rhs);
  }

  public Object doNotEquals(final Object lhs, final double rhs) {
    return doNotEquals(((NgByte)lhs).getByteValue(), rhs);
  }

  public Object doNotEquals(final Object lhs, final BigInteger rhs) {
    return doNotEquals(((NgByte)lhs).getByteValue(), rhs);
  }

  public Object doNotEquals(final Object lhs, final BigDecimal rhs) {
    return doNotEquals(((NgByte)lhs).getByteValue(), rhs);
  }

  public Object doReverseNotEquals(final byte lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(byte.class).doNotEquals(lhs, ((NgByte)rhs).getByteValue());
  }

  public Object doReverseNotEquals(final char lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(char.class).doNotEquals(lhs, ((NgByte)rhs).getByteValue());
  }

  public Object doReverseNotEquals(final short lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(short.class).doNotEquals(lhs, ((NgByte)rhs).getByteValue());
  }

  public Object doReverseNotEquals(final int lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(int.class).doNotEquals(lhs, ((NgByte)rhs).getByteValue());
  }

  public Object doReverseNotEquals(final long lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(long.class).doNotEquals(lhs, ((NgByte)rhs).getByteValue());
  }

  public Object doReverseNotEquals(final float lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(float.class).doNotEquals(lhs, ((NgByte)rhs).getByteValue());
  }

  public Object doReverseNotEquals(final double lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(double.class).doNotEquals(lhs, ((NgByte)rhs).getByteValue());
  }

  public Object doReverseNotEquals(final BigInteger lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(BigInteger.class).doNotEquals(lhs, ((NgByte)rhs).getByteValue());
  }

  public Object doReverseNotEquals(final BigDecimal lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(BigDecimal.class).doNotEquals(lhs, ((NgByte)rhs).getByteValue());
  }

  public Object doLessThan(final Object lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseLessThan(((NgByte)lhs).getByteValue(), rhs);
  }

  public Object doLessThan(final byte lhs, final byte rhs) {
    return (lhs < rhs) ? NgBoolean.TRUE : NgBoolean.FALSE;
  }

  public Object doLessThan(final byte lhs, final char rhs) {
    return (lhs < rhs) ? NgBoolean.TRUE : NgBoolean.FALSE;
  }

  public Object doLessThan(final byte lhs, final short rhs) {
    return (lhs < rhs) ? NgBoolean.TRUE : NgBoolean.FALSE;
  }

  public Object doLessThan(final byte lhs, final int rhs) {
    return (lhs < rhs) ? NgBoolean.TRUE : NgBoolean.FALSE;
  }

  public Object doLessThan(final byte lhs, final long rhs) {
    return (lhs < rhs) ? NgBoolean.TRUE : NgBoolean.FALSE;
  }

  public Object doLessThan(final byte lhs, final float rhs) {
    return (lhs < rhs) ? NgBoolean.TRUE : NgBoolean.FALSE;
  }

  public Object doLessThan(final byte lhs, final double rhs) {
    return (lhs < rhs) ? NgBoolean.TRUE : NgBoolean.FALSE;
  }

  public Object doLessThan(final byte lhs, final BigInteger rhs) {
    return (BigInteger.valueOf(lhs).compareTo(rhs) < 0) ? NgBoolean.TRUE : NgBoolean.FALSE;
  }

  public Object doLessThan(final byte lhs, final BigDecimal rhs) {
    return (new BigDecimal(lhs).compareTo(rhs) < 0) ? NgBoolean.TRUE : NgBoolean.FALSE;
  }

  public Object doLessThan(final Object lhs, final byte rhs) {
    return doLessThan(((NgByte)lhs).getByteValue(), rhs);
  }

  public Object doLessThan(final Object lhs, final char rhs) {
    return doLessThan(((NgByte)lhs).getByteValue(), rhs);
  }

  public Object doLessThan(final Object lhs, final short rhs) {
    return doLessThan(((NgByte)lhs).getByteValue(), rhs);
  }

  public Object doLessThan(final Object lhs, final int rhs) {
    return doLessThan(((NgByte)lhs).getByteValue(), rhs);
  }

  public Object doLessThan(final Object lhs, final long rhs) {
    return doLessThan(((NgByte)lhs).getByteValue(), rhs);
  }

  public Object doLessThan(final Object lhs, final float rhs) {
    return doLessThan(((NgByte)lhs).getByteValue(), rhs);
  }

  public Object doLessThan(final Object lhs, final double rhs) {
    return doLessThan(((NgByte)lhs).getByteValue(), rhs);
  }

  public Object doLessThan(final Object lhs, final BigInteger rhs) {
    return doLessThan(((NgByte)lhs).getByteValue(), rhs);
  }

  public Object doLessThan(final Object lhs, final BigDecimal rhs) {
    return doLessThan(((NgByte)lhs).getByteValue(), rhs);
  }

  public Object doReverseLessThan(final byte lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(byte.class).doLessThan(lhs, ((NgByte)rhs).getByteValue());
  }

  public Object doReverseLessThan(final char lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(char.class).doLessThan(lhs, ((NgByte)rhs).getByteValue());
  }

  public Object doReverseLessThan(final short lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(short.class).doLessThan(lhs, ((NgByte)rhs).getByteValue());
  }

  public Object doReverseLessThan(final int lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(int.class).doLessThan(lhs, ((NgByte)rhs).getByteValue());
  }

  public Object doReverseLessThan(final long lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(long.class).doLessThan(lhs, ((NgByte)rhs).getByteValue());
  }

  public Object doReverseLessThan(final float lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(float.class).doLessThan(lhs, ((NgByte)rhs).getByteValue());
  }

  public Object doReverseLessThan(final double lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(double.class).doLessThan(lhs, ((NgByte)rhs).getByteValue());
  }

  public Object doReverseLessThan(final BigInteger lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(BigInteger.class).doLessThan(lhs, ((NgByte)rhs).getByteValue());
  }

  public Object doReverseLessThan(final BigDecimal lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(BigDecimal.class).doLessThan(lhs, ((NgByte)rhs).getByteValue());
  }

  public Object doLessThanOrEquals(final Object lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseLessThanOrEquals(((NgByte)lhs).getByteValue(), rhs);
  }

  public Object doLessThanOrEquals(final byte lhs, final byte rhs) {
    return (lhs <= rhs) ? NgBoolean.TRUE : NgBoolean.FALSE;
  }

  public Object doLessThanOrEquals(final byte lhs, final char rhs) {
    return (lhs <= rhs) ? NgBoolean.TRUE : NgBoolean.FALSE;
  }

  public Object doLessThanOrEquals(final byte lhs, final short rhs) {
    return (lhs <= rhs) ? NgBoolean.TRUE : NgBoolean.FALSE;
  }

  public Object doLessThanOrEquals(final byte lhs, final int rhs) {
    return (lhs <= rhs) ? NgBoolean.TRUE : NgBoolean.FALSE;
  }

  public Object doLessThanOrEquals(final byte lhs, final long rhs) {
    return (lhs <= rhs) ? NgBoolean.TRUE : NgBoolean.FALSE;
  }

  public Object doLessThanOrEquals(final byte lhs, final float rhs) {
    return (lhs <= rhs) ? NgBoolean.TRUE : NgBoolean.FALSE;
  }

  public Object doLessThanOrEquals(final byte lhs, final double rhs) {
    return (lhs <= rhs) ? NgBoolean.TRUE : NgBoolean.FALSE;
  }

  public Object doLessThanOrEquals(final byte lhs, final BigInteger rhs) {
    return (BigInteger.valueOf(lhs).compareTo(rhs) <= 0) ? NgBoolean.TRUE : NgBoolean.FALSE;
  }

  public Object doLessThanOrEquals(final byte lhs, final BigDecimal rhs) {
    return (new BigDecimal(lhs).compareTo(rhs) <= 0) ? NgBoolean.TRUE : NgBoolean.FALSE;
  }

  public Object doLessThanOrEquals(final Object lhs, final byte rhs) {
    return doLessThanOrEquals(((NgByte)lhs).getByteValue(), rhs);
  }

  public Object doLessThanOrEquals(final Object lhs, final char rhs) {
    return doLessThanOrEquals(((NgByte)lhs).getByteValue(), rhs);
  }

  public Object doLessThanOrEquals(final Object lhs, final short rhs) {
    return doLessThanOrEquals(((NgByte)lhs).getByteValue(), rhs);
  }

  public Object doLessThanOrEquals(final Object lhs, final int rhs) {
    return doLessThanOrEquals(((NgByte)lhs).getByteValue(), rhs);
  }

  public Object doLessThanOrEquals(final Object lhs, final long rhs) {
    return doLessThanOrEquals(((NgByte)lhs).getByteValue(), rhs);
  }

  public Object doLessThanOrEquals(final Object lhs, final float rhs) {
    return doLessThanOrEquals(((NgByte)lhs).getByteValue(), rhs);
  }

  public Object doLessThanOrEquals(final Object lhs, final double rhs) {
    return doLessThanOrEquals(((NgByte)lhs).getByteValue(), rhs);
  }

  public Object doLessThanOrEquals(final Object lhs, final BigInteger rhs) {
    return doLessThanOrEquals(((NgByte)lhs).getByteValue(), rhs);
  }

  public Object doLessThanOrEquals(final Object lhs, final BigDecimal rhs) {
    return doLessThanOrEquals(((NgByte)lhs).getByteValue(), rhs);
  }

  public Object doReverseLessThanOrEquals(final byte lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(byte.class).doLessThanOrEquals(lhs, ((NgByte)rhs).getByteValue());
  }

  public Object doReverseLessThanOrEquals(final char lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(char.class).doLessThanOrEquals(lhs, ((NgByte)rhs).getByteValue());
  }

  public Object doReverseLessThanOrEquals(final short lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(short.class).doLessThanOrEquals(lhs, ((NgByte)rhs).getByteValue());
  }

  public Object doReverseLessThanOrEquals(final int lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(int.class).doLessThanOrEquals(lhs, ((NgByte)rhs).getByteValue());
  }

  public Object doReverseLessThanOrEquals(final long lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(long.class).doLessThanOrEquals(lhs, ((NgByte)rhs).getByteValue());
  }

  public Object doReverseLessThanOrEquals(final float lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(float.class).doLessThanOrEquals(lhs, ((NgByte)rhs).getByteValue());
  }

  public Object doReverseLessThanOrEquals(final double lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(double.class).doLessThanOrEquals(lhs, ((NgByte)rhs).getByteValue());
  }

  public Object doReverseLessThanOrEquals(final BigInteger lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(BigInteger.class).doLessThanOrEquals(lhs, ((NgByte)rhs).getByteValue());
  }

  public Object doReverseLessThanOrEquals(final BigDecimal lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(BigDecimal.class).doLessThanOrEquals(lhs, ((NgByte)rhs).getByteValue());
  }

  public Object doGreaterThan(final Object lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseGreaterThan(((NgByte)lhs).getByteValue(), rhs);
  }

  public Object doGreaterThan(final byte lhs, final byte rhs) {
    return (lhs > rhs) ? NgBoolean.TRUE : NgBoolean.FALSE;
  }

  public Object doGreaterThan(final byte lhs, final char rhs) {
    return (lhs > rhs) ? NgBoolean.TRUE : NgBoolean.FALSE;
  }

  public Object doGreaterThan(final byte lhs, final short rhs) {
    return (lhs > rhs) ? NgBoolean.TRUE : NgBoolean.FALSE;
  }

  public Object doGreaterThan(final byte lhs, final int rhs) {
    return (lhs > rhs) ? NgBoolean.TRUE : NgBoolean.FALSE;
  }

  public Object doGreaterThan(final byte lhs, final long rhs) {
    return (lhs > rhs) ? NgBoolean.TRUE : NgBoolean.FALSE;
  }

  public Object doGreaterThan(final byte lhs, final float rhs) {
    return (lhs > rhs) ? NgBoolean.TRUE : NgBoolean.FALSE;
  }

  public Object doGreaterThan(final byte lhs, final double rhs) {
    return (lhs > rhs) ? NgBoolean.TRUE : NgBoolean.FALSE;
  }

  public Object doGreaterThan(final byte lhs, final BigInteger rhs) {
    return (BigInteger.valueOf(lhs).compareTo(rhs) > 0) ? NgBoolean.TRUE : NgBoolean.FALSE;
  }

  public Object doGreaterThan(final byte lhs, final BigDecimal rhs) {
    return (new BigDecimal(lhs).compareTo(rhs) > 0) ? NgBoolean.TRUE : NgBoolean.FALSE;
  }

  public Object doGreaterThan(final Object lhs, final byte rhs) {
    return doGreaterThan(((NgByte)lhs).getByteValue(), rhs);
  }

  public Object doGreaterThan(final Object lhs, final char rhs) {
    return doGreaterThan(((NgByte)lhs).getByteValue(), rhs);
  }

  public Object doGreaterThan(final Object lhs, final short rhs) {
    return doGreaterThan(((NgByte)lhs).getByteValue(), rhs);
  }

  public Object doGreaterThan(final Object lhs, final int rhs) {
    return doGreaterThan(((NgByte)lhs).getByteValue(), rhs);
  }

  public Object doGreaterThan(final Object lhs, final long rhs) {
    return doGreaterThan(((NgByte)lhs).getByteValue(), rhs);
  }

  public Object doGreaterThan(final Object lhs, final float rhs) {
    return doGreaterThan(((NgByte)lhs).getByteValue(), rhs);
  }

  public Object doGreaterThan(final Object lhs, final double rhs) {
    return doGreaterThan(((NgByte)lhs).getByteValue(), rhs);
  }

  public Object doGreaterThan(final Object lhs, final BigInteger rhs) {
    return doGreaterThan(((NgByte)lhs).getByteValue(), rhs);
  }

  public Object doGreaterThan(final Object lhs, final BigDecimal rhs) {
    return doGreaterThan(((NgByte)lhs).getByteValue(), rhs);
  }

  public Object doReverseGreaterThan(final byte lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(byte.class).doGreaterThan(lhs, ((NgByte)rhs).getByteValue());
  }

  public Object doReverseGreaterThan(final char lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(char.class).doGreaterThan(lhs, ((NgByte)rhs).getByteValue());
  }

  public Object doReverseGreaterThan(final short lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(short.class).doGreaterThan(lhs, ((NgByte)rhs).getByteValue());
  }

  public Object doReverseGreaterThan(final int lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(int.class).doGreaterThan(lhs, ((NgByte)rhs).getByteValue());
  }

  public Object doReverseGreaterThan(final long lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(long.class).doGreaterThan(lhs, ((NgByte)rhs).getByteValue());
  }

  public Object doReverseGreaterThan(final float lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(float.class).doGreaterThan(lhs, ((NgByte)rhs).getByteValue());
  }

  public Object doReverseGreaterThan(final double lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(double.class).doGreaterThan(lhs, ((NgByte)rhs).getByteValue());
  }

  public Object doReverseGreaterThan(final BigInteger lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(BigInteger.class).doGreaterThan(lhs, ((NgByte)rhs).getByteValue());
  }

  public Object doReverseGreaterThan(final BigDecimal lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(BigDecimal.class).doGreaterThan(lhs, ((NgByte)rhs).getByteValue());
  }

  public Object doGreaterThanOrEquals(final Object lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseGreaterThanOrEquals(((NgByte)lhs).getByteValue(), rhs);
  }

  public Object doGreaterThanOrEquals(final byte lhs, final byte rhs) {
    return (lhs >= rhs) ? NgBoolean.TRUE : NgBoolean.FALSE;
  }

  public Object doGreaterThanOrEquals(final byte lhs, final char rhs) {
    return (lhs >= rhs) ? NgBoolean.TRUE : NgBoolean.FALSE;
  }

  public Object doGreaterThanOrEquals(final byte lhs, final short rhs) {
    return (lhs >= rhs) ? NgBoolean.TRUE : NgBoolean.FALSE;
  }

  public Object doGreaterThanOrEquals(final byte lhs, final int rhs) {
    return (lhs >= rhs) ? NgBoolean.TRUE : NgBoolean.FALSE;
  }

  public Object doGreaterThanOrEquals(final byte lhs, final long rhs) {
    return (lhs >= rhs) ? NgBoolean.TRUE : NgBoolean.FALSE;
  }

  public Object doGreaterThanOrEquals(final byte lhs, final float rhs) {
    return (lhs >= rhs) ? NgBoolean.TRUE : NgBoolean.FALSE;
  }

  public Object doGreaterThanOrEquals(final byte lhs, final double rhs) {
    return (lhs >= rhs) ? NgBoolean.TRUE : NgBoolean.FALSE;
  }

  public Object doGreaterThanOrEquals(final byte lhs, final BigInteger rhs) {
    return (BigInteger.valueOf(lhs).compareTo(rhs) >= 0) ? NgBoolean.TRUE : NgBoolean.FALSE;
  }

  public Object doGreaterThanOrEquals(final byte lhs, final BigDecimal rhs) {
    return (new BigDecimal(lhs).compareTo(rhs) >= 0) ? NgBoolean.TRUE : NgBoolean.FALSE;
  }

  public Object doGreaterThanOrEquals(final Object lhs, final byte rhs) {
    return doGreaterThanOrEquals(((NgByte)lhs).getByteValue(), rhs);
  }

  public Object doGreaterThanOrEquals(final Object lhs, final char rhs) {
    return doGreaterThanOrEquals(((NgByte)lhs).getByteValue(), rhs);
  }

  public Object doGreaterThanOrEquals(final Object lhs, final short rhs) {
    return doGreaterThanOrEquals(((NgByte)lhs).getByteValue(), rhs);
  }

  public Object doGreaterThanOrEquals(final Object lhs, final int rhs) {
    return doGreaterThanOrEquals(((NgByte)lhs).getByteValue(), rhs);
  }

  public Object doGreaterThanOrEquals(final Object lhs, final long rhs) {
    return doGreaterThanOrEquals(((NgByte)lhs).getByteValue(), rhs);
  }

  public Object doGreaterThanOrEquals(final Object lhs, final float rhs) {
    return doGreaterThanOrEquals(((NgByte)lhs).getByteValue(), rhs);
  }

  public Object doGreaterThanOrEquals(final Object lhs, final double rhs) {
    return doGreaterThanOrEquals(((NgByte)lhs).getByteValue(), rhs);
  }

  public Object doGreaterThanOrEquals(final Object lhs, final BigInteger rhs) {
    return doGreaterThanOrEquals(((NgByte)lhs).getByteValue(), rhs);
  }

  public Object doGreaterThanOrEquals(final Object lhs, final BigDecimal rhs) {
    return doGreaterThanOrEquals(((NgByte)lhs).getByteValue(), rhs);
  }

  public Object doReverseGreaterThanOrEquals(final byte lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(byte.class).doGreaterThanOrEquals(lhs, ((NgByte)rhs).getByteValue());
  }

  public Object doReverseGreaterThanOrEquals(final char lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(char.class).doGreaterThanOrEquals(lhs, ((NgByte)rhs).getByteValue());
  }

  public Object doReverseGreaterThanOrEquals(final short lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(short.class).doGreaterThanOrEquals(lhs, ((NgByte)rhs).getByteValue());
  }

  public Object doReverseGreaterThanOrEquals(final int lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(int.class).doGreaterThanOrEquals(lhs, ((NgByte)rhs).getByteValue());
  }

  public Object doReverseGreaterThanOrEquals(final long lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(long.class).doGreaterThanOrEquals(lhs, ((NgByte)rhs).getByteValue());
  }

  public Object doReverseGreaterThanOrEquals(final float lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(float.class).doGreaterThanOrEquals(lhs, ((NgByte)rhs).getByteValue());
  }

  public Object doReverseGreaterThanOrEquals(final double lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(double.class).doGreaterThanOrEquals(lhs, ((NgByte)rhs).getByteValue());
  }

  public Object doReverseGreaterThanOrEquals(final BigInteger lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(BigInteger.class).doGreaterThanOrEquals(lhs, ((NgByte)rhs).getByteValue());
  }

  public Object doReverseGreaterThanOrEquals(final BigDecimal lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(BigDecimal.class).doGreaterThanOrEquals(lhs, ((NgByte)rhs).getByteValue());
  }

}
