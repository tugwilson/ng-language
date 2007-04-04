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

public class BigIntegerMetaClass extends RuntimeMetaClassImpl {
  public BigIntegerMetaClass() {
    super(BigInteger.class, new BigIntegerInternalMetaClass(BigInteger.class));
  }
}

class BigIntegerInternalMetaClass extends InternalMetaClassImpl {
  public BigIntegerInternalMetaClass(final Class theClass) {
    super(theClass);
  }
  
  /* (non-Javadoc)
   * @see uk.co.wilson.ng.runtime.metaclass.InternalMetaClassImpl#doCalculateConversionCost(java.lang.Class)
   */
  @Override
  public int doCalculateConversionCost(final Class parameterType) {
    if (parameterType == char.class) return 3;
    
    if (parameterType == byte.class) return 3;
    
    if (parameterType == short.class) return 3;
    
    if (parameterType == int.class) return 2;
    
    if (parameterType == long.class) return 1;
    
    if (parameterType == BigInteger.class) return 0;
    
    if (parameterType == float.class) return 3;
    
    if (parameterType == double.class) return 2;
    
    if (parameterType == BigDecimal.class) return 1;
    
    return super.doCalculateConversionCost(parameterType);
  }

  /* (non-Javadoc)
   * @see uk.co.wilson.ng.runtime.metaclass.InternalMetaClassImpl#doGetParamObject(java.lang.Object, java.lang.Class)
   */
  @Override
 public Object doGetParamObject(final Object instance, final Class parameterType) {   
    if (parameterType == BigInteger.class) return instance;
    
    if (parameterType == char.class) return new Character((char)((BigInteger)instance).intValue());
    
    if (parameterType == byte.class) return new Byte(((BigInteger)instance).byteValue());
    
    if (parameterType == short.class) return new Short(((BigInteger)instance).shortValue());
    
    if (parameterType == int.class) return new Integer(((BigInteger)instance).intValue());
    
    if (parameterType == long.class) return new Long(((BigInteger)instance).longValue());
    
    if (parameterType == float.class) return new Float(((BigInteger)instance).floatValue());
    
    if (parameterType == double.class) return new Double(((BigInteger)instance).doubleValue());
    
    if (parameterType == BigDecimal.class) return BigDecimal.valueOf(((BigInteger)instance).longValue());
    
    return super.doGetParamObject(instance, parameterType);
  }

  public Object doComplement(final BigInteger instance) {
    return instance.not();
  }
  
  public Object doComplement(final Object instance) {
    return ((BigInteger)instance).not();
  }

  public Object doUnaryPlus(final BigInteger instance) {
    return instance;
  }
  
  public Object doUnaryPlus(final Object instance) {
    return instance;
  }
  
  public Object doUnaryMinus(final BigInteger instance) {
    return instance.negate();
  }
  
  public Object doUnaryMinus(final Object instance) {
    return ((BigInteger)instance).negate();
  }

  public Object doPostfixIncrement(final BigInteger instance) {
    return instance.add(BigInteger.ONE);
  }

  public Object doPostfixIncrement(final Object instance) {
    return ((BigInteger)instance).add(BigInteger.ONE);
  }

  public Object doPostfixDecrement(final BigInteger instance) {
    return instance.subtract(BigInteger.ONE);
  }

  public Object doPostfixDecrement(final Object instance) {
    return ((BigInteger)instance).subtract(BigInteger.ONE);
  }

  public Object doPrefixIncrement(final BigInteger instance) {
    return instance.add(BigInteger.ONE);
  }

  public Object doPrefixIncrement(final Object instance) {
    return ((BigInteger)instance).add(BigInteger.ONE);
  }

  public Object doPrefixDecrement(final BigInteger instance) {
    return instance.subtract(BigInteger.ONE);
  }

  public Object doPrefixDecrement(final Object instance) {
    return ((BigInteger)instance).subtract(BigInteger.ONE);
  }

  public Object doAdd(final Object lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseAdd(((BigInteger)lhs), rhs);
  }

  public Object doAdd(final BigInteger lhs, final byte rhs) {
    return lhs.add(BigInteger.valueOf(rhs));
  }

  public Object doAdd(final BigInteger lhs, final char rhs) {
    return lhs.add(BigInteger.valueOf(rhs));
  }

  public Object doAdd(final BigInteger lhs, final short rhs) {
    return lhs.add(BigInteger.valueOf(rhs));
  }

  public Object doAdd(final BigInteger lhs, final int rhs) {
    return lhs.add(BigInteger.valueOf(rhs));
  }

  public Object doAdd(final BigInteger lhs, final long rhs) {
    return lhs.add(BigInteger.valueOf(rhs));
  }

  public Object doAdd(final BigInteger lhs, final float rhs) {
    return new NgFloat(lhs.floatValue() + rhs);
  }

  public Object doAdd(final BigInteger lhs, final double rhs) {
    return new NgDouble(lhs.doubleValue() + rhs);
  }

  public Object doAdd(final BigInteger lhs, final BigInteger rhs) {
    return lhs.add(rhs);
  }

  public Object doAdd(final BigInteger lhs, final BigDecimal rhs) {
    return new BigDecimal(lhs).add(rhs);
  }

  public Object doAdd(final Object lhs, final byte rhs) {
    return doAdd(((BigInteger)lhs), rhs);
  }

  public Object doAdd(final Object lhs, final char rhs) {
    return doAdd(((BigInteger)lhs), rhs);
  }

  public Object doAdd(final Object lhs, final short rhs) {
    return doAdd(((BigInteger)lhs), rhs);
  }

  public Object doAdd(final Object lhs, final int rhs) {
    return doAdd(((BigInteger)lhs), rhs);
  }

  public Object doAdd(final Object lhs, final long rhs) {
    return doAdd(((BigInteger)lhs), rhs);
  }

  public Object doAdd(final Object lhs, final float rhs) {
    return doAdd(((BigInteger)lhs), rhs);
  }

  public Object doAdd(final Object lhs, final double rhs) {
    return doAdd(((BigInteger)lhs), rhs);
  }

  public Object doAdd(final Object lhs, final BigInteger rhs) {
    return doAdd(((BigInteger)lhs), rhs);
  }

  public Object doAdd(final Object lhs, final BigDecimal rhs) {
    return doAdd(((BigInteger)lhs), rhs);
  }

  public Object doReverseAdd(final byte lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(byte.class).doAdd(lhs, ((BigInteger)rhs));
  }

  public Object doReverseAdd(final char lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(char.class).doAdd(lhs, ((BigInteger)rhs));
  }

  public Object doReverseAdd(final short lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(short.class).doAdd(lhs, ((BigInteger)rhs));
  }

  public Object doReverseAdd(final int lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(int.class).doAdd(lhs, ((BigInteger)rhs));
  }

  public Object doReverseAdd(final long lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(long.class).doAdd(lhs, ((BigInteger)rhs));
  }

  public Object doReverseAdd(final float lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(float.class).doAdd(lhs, ((BigInteger)rhs));
  }

  public Object doReverseAdd(final double lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(double.class).doAdd(lhs, ((BigInteger)rhs));
  }

  public Object doReverseAdd(final BigInteger lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(BigInteger.class).doAdd(lhs, ((BigInteger)rhs));
  }

  public Object doReverseAdd(final BigDecimal lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(BigDecimal.class).doAdd(lhs, ((BigInteger)rhs));
  }

  public Object doAddEquals(final Object lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseAddEquals(((BigInteger)lhs), rhs);
  }

  public Object doAddEquals(final BigInteger lhs, final byte rhs) {
    return lhs.add(BigInteger.valueOf(rhs));
  }

  public Object doAddEquals(final BigInteger lhs, final char rhs) {
    return lhs.add(BigInteger.valueOf(rhs));
  }

  public Object doAddEquals(final BigInteger lhs, final short rhs) {
    return lhs.add(BigInteger.valueOf(rhs));
  }

  public Object doAddEquals(final BigInteger lhs, final int rhs) {
    return lhs.add(BigInteger.valueOf(rhs));
  }

  public Object doAddEquals(final BigInteger lhs, final long rhs) {
    return lhs.add(BigInteger.valueOf(rhs));
  }

  public Object doAddEquals(final BigInteger lhs, final float rhs) {
    return new NgFloat(lhs.floatValue() + rhs);
  }

  public Object doAddEquals(final BigInteger lhs, final double rhs) {
    return new NgDouble(lhs.doubleValue() + rhs);
  }

  public Object doAddEquals(final BigInteger lhs, final BigInteger rhs) {
    return lhs.add(rhs);
  }

  public Object doAddEquals(final BigInteger lhs, final BigDecimal rhs) {
    return new BigDecimal(lhs).add(rhs);
  }

  public Object doAddEquals(final Object lhs, final byte rhs) {
    return doAddEquals(((BigInteger)lhs), rhs);
  }

  public Object doAddEquals(final Object lhs, final char rhs) {
    return doAddEquals(((BigInteger)lhs), rhs);
  }

  public Object doAddEquals(final Object lhs, final short rhs) {
    return doAddEquals(((BigInteger)lhs), rhs);
  }

  public Object doAddEquals(final Object lhs, final int rhs) {
    return doAddEquals(((BigInteger)lhs), rhs);
  }

  public Object doAddEquals(final Object lhs, final long rhs) {
    return doAddEquals(((BigInteger)lhs), rhs);
  }

  public Object doAddEquals(final Object lhs, final float rhs) {
    return doAddEquals(((BigInteger)lhs), rhs);
  }

  public Object doAddEquals(final Object lhs, final double rhs) {
    return doAddEquals(((BigInteger)lhs), rhs);
  }

  public Object doAddEquals(final Object lhs, final BigInteger rhs) {
    return doAddEquals(((BigInteger)lhs), rhs);
  }

  public Object doAddEquals(final Object lhs, final BigDecimal rhs) {
    return doAddEquals(((BigInteger)lhs), rhs);
  }

  public Object doReverseAddEquals(final byte lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(byte.class).doAddEquals(lhs, ((BigInteger)rhs));
  }

  public Object doReverseAddEquals(final char lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(char.class).doAddEquals(lhs, ((BigInteger)rhs));
  }

  public Object doReverseAddEquals(final short lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(short.class).doAddEquals(lhs, ((BigInteger)rhs));
  }

  public Object doReverseAddEquals(final int lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(int.class).doAddEquals(lhs, ((BigInteger)rhs));
  }

  public Object doReverseAddEquals(final long lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(long.class).doAddEquals(lhs, ((BigInteger)rhs));
  }

  public Object doReverseAddEquals(final float lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(float.class).doAddEquals(lhs, ((BigInteger)rhs));
  }

  public Object doReverseAddEquals(final double lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(double.class).doAddEquals(lhs, ((BigInteger)rhs));
  }

  public Object doReverseAddEquals(final BigInteger lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(BigInteger.class).doAddEquals(lhs, ((BigInteger)rhs));
  }

  public Object doReverseAddEquals(final BigDecimal lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(BigDecimal.class).doAddEquals(lhs, ((BigInteger)rhs));
  }

  public Object doSubtract(final Object lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseSubtract(((BigInteger)lhs), rhs);
  }

  public Object doSubtract(final BigInteger lhs, final byte rhs) {
    return lhs.subtract(BigInteger.valueOf(rhs));
  }

  public Object doSubtract(final BigInteger lhs, final char rhs) {
    return lhs.subtract(BigInteger.valueOf(rhs));
  }

  public Object doSubtract(final BigInteger lhs, final short rhs) {
    return lhs.subtract(BigInteger.valueOf(rhs));
  }

  public Object doSubtract(final BigInteger lhs, final int rhs) {
    return lhs.subtract(BigInteger.valueOf(rhs));
  }

  public Object doSubtract(final BigInteger lhs, final long rhs) {
    return lhs.subtract(BigInteger.valueOf(rhs));
  }

  public Object doSubtract(final BigInteger lhs, final float rhs) {
    return new NgFloat(lhs.floatValue() - rhs);
  }

  public Object doSubtract(final BigInteger lhs, final double rhs) {
    return new NgDouble(lhs.doubleValue() - rhs);
  }

  public Object doSubtract(final BigInteger lhs, final BigInteger rhs) {
    return lhs.subtract(rhs);
  }

  public Object doSubtract(final BigInteger lhs, final BigDecimal rhs) {
    return new BigDecimal(lhs).subtract(rhs);
  }

  public Object doSubtract(final Object lhs, final byte rhs) {
    return doSubtract(((BigInteger)lhs), rhs);
  }

  public Object doSubtract(final Object lhs, final char rhs) {
    return doSubtract(((BigInteger)lhs), rhs);
  }

  public Object doSubtract(final Object lhs, final short rhs) {
    return doSubtract(((BigInteger)lhs), rhs);
  }

  public Object doSubtract(final Object lhs, final int rhs) {
    return doSubtract(((BigInteger)lhs), rhs);
  }

  public Object doSubtract(final Object lhs, final long rhs) {
    return doSubtract(((BigInteger)lhs), rhs);
  }

  public Object doSubtract(final Object lhs, final float rhs) {
    return doSubtract(((BigInteger)lhs), rhs);
  }

  public Object doSubtract(final Object lhs, final double rhs) {
    return doSubtract(((BigInteger)lhs), rhs);
  }

  public Object doSubtract(final Object lhs, final BigInteger rhs) {
    return doSubtract(((BigInteger)lhs), rhs);
  }

  public Object doSubtract(final Object lhs, final BigDecimal rhs) {
    return doSubtract(((BigInteger)lhs), rhs);
  }

  public Object doReverseSubtract(final byte lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(byte.class).doSubtract(lhs, ((BigInteger)rhs));
  }

  public Object doReverseSubtract(final char lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(char.class).doSubtract(lhs, ((BigInteger)rhs));
  }

  public Object doReverseSubtract(final short lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(short.class).doSubtract(lhs, ((BigInteger)rhs));
  }

  public Object doReverseSubtract(final int lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(int.class).doSubtract(lhs, ((BigInteger)rhs));
  }

  public Object doReverseSubtract(final long lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(long.class).doSubtract(lhs, ((BigInteger)rhs));
  }

  public Object doReverseSubtract(final float lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(float.class).doSubtract(lhs, ((BigInteger)rhs));
  }

  public Object doReverseSubtract(final double lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(double.class).doSubtract(lhs, ((BigInteger)rhs));
  }

  public Object doReverseSubtract(final BigInteger lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(BigInteger.class).doSubtract(lhs, ((BigInteger)rhs));
  }

  public Object doReverseSubtract(final BigDecimal lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(BigDecimal.class).doSubtract(lhs, ((BigInteger)rhs));
  }

  public Object doSubtractEquals(final Object lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseSubtractEquals(((BigInteger)lhs), rhs);
  }

  public Object doSubtractEquals(final BigInteger lhs, final byte rhs) {
    return lhs.subtract(BigInteger.valueOf(rhs));
  }

  public Object doSubtractEquals(final BigInteger lhs, final char rhs) {
    return lhs.subtract(BigInteger.valueOf(rhs));
  }

  public Object doSubtractEquals(final BigInteger lhs, final short rhs) {
    return lhs.subtract(BigInteger.valueOf(rhs));
  }

  public Object doSubtractEquals(final BigInteger lhs, final int rhs) {
    return lhs.subtract(BigInteger.valueOf(rhs));
  }

  public Object doSubtractEquals(final BigInteger lhs, final long rhs) {
    return lhs.subtract(BigInteger.valueOf(rhs));
  }

  public Object doSubtractEquals(final BigInteger lhs, final float rhs) {
    return new NgFloat(lhs.floatValue() - rhs);
  }

  public Object doSubtractEquals(final BigInteger lhs, final double rhs) {
    return new NgDouble(lhs.doubleValue() - rhs);
  }

  public Object doSubtractEquals(final BigInteger lhs, final BigInteger rhs) {
    return lhs.subtract(rhs);
  }

  public Object doSubtractEquals(final BigInteger lhs, final BigDecimal rhs) {
    return new BigDecimal(lhs).subtract(rhs);
  }

  public Object doSubtractEquals(final Object lhs, final byte rhs) {
    return doSubtractEquals(((BigInteger)lhs), rhs);
  }

  public Object doSubtractEquals(final Object lhs, final char rhs) {
    return doSubtractEquals(((BigInteger)lhs), rhs);
  }

  public Object doSubtractEquals(final Object lhs, final short rhs) {
    return doSubtractEquals(((BigInteger)lhs), rhs);
  }

  public Object doSubtractEquals(final Object lhs, final int rhs) {
    return doSubtractEquals(((BigInteger)lhs), rhs);
  }

  public Object doSubtractEquals(final Object lhs, final long rhs) {
    return doSubtractEquals(((BigInteger)lhs), rhs);
  }

  public Object doSubtractEquals(final Object lhs, final float rhs) {
    return doSubtractEquals(((BigInteger)lhs), rhs);
  }

  public Object doSubtractEquals(final Object lhs, final double rhs) {
    return doSubtractEquals(((BigInteger)lhs), rhs);
  }

  public Object doSubtractEquals(final Object lhs, final BigInteger rhs) {
    return doSubtractEquals(((BigInteger)lhs), rhs);
  }

  public Object doSubtractEquals(final Object lhs, final BigDecimal rhs) {
    return doSubtractEquals(((BigInteger)lhs), rhs);
  }

  public Object doReverseSubtractEquals(final byte lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(byte.class).doSubtractEquals(lhs, ((BigInteger)rhs));
  }

  public Object doReverseSubtractEquals(final char lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(char.class).doSubtractEquals(lhs, ((BigInteger)rhs));
  }

  public Object doReverseSubtractEquals(final short lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(short.class).doSubtractEquals(lhs, ((BigInteger)rhs));
  }

  public Object doReverseSubtractEquals(final int lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(int.class).doSubtractEquals(lhs, ((BigInteger)rhs));
  }

  public Object doReverseSubtractEquals(final long lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(long.class).doSubtractEquals(lhs, ((BigInteger)rhs));
  }

  public Object doReverseSubtractEquals(final float lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(float.class).doSubtractEquals(lhs, ((BigInteger)rhs));
  }

  public Object doReverseSubtractEquals(final double lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(double.class).doSubtractEquals(lhs, ((BigInteger)rhs));
  }

  public Object doReverseSubtractEquals(final BigInteger lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(BigInteger.class).doSubtractEquals(lhs, ((BigInteger)rhs));
  }

  public Object doReverseSubtractEquals(final BigDecimal lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(BigDecimal.class).doSubtractEquals(lhs, ((BigInteger)rhs));
  }

  public Object doMultiply(final Object lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseMultiply(((BigInteger)lhs), rhs);
  }

  public Object doMultiply(final BigInteger lhs, final byte rhs) {
    return lhs.multiply(BigInteger.valueOf(rhs));
  }

  public Object doMultiply(final BigInteger lhs, final char rhs) {
    return lhs.multiply(BigInteger.valueOf(rhs));
  }

  public Object doMultiply(final BigInteger lhs, final short rhs) {
    return lhs.multiply(BigInteger.valueOf(rhs));
  }

  public Object doMultiply(final BigInteger lhs, final int rhs) {
    return lhs.multiply(BigInteger.valueOf(rhs));
  }

  public Object doMultiply(final BigInteger lhs, final long rhs) {
    return lhs.multiply(BigInteger.valueOf(rhs));
  }

  public Object doMultiply(final BigInteger lhs, final float rhs) {
    return new NgFloat(lhs.floatValue() * rhs);
  }

  public Object doMultiply(final BigInteger lhs, final double rhs) {
    return new NgDouble(lhs.doubleValue() * rhs);
  }

  public Object doMultiply(final BigInteger lhs, final BigInteger rhs) {
    return lhs.multiply(rhs);
  }

  public Object doMultiply(final BigInteger lhs, final BigDecimal rhs) {
    return new BigDecimal(lhs).multiply(rhs);
  }

  public Object doMultiply(final Object lhs, final byte rhs) {
    return doMultiply(((BigInteger)lhs), rhs);
  }

  public Object doMultiply(final Object lhs, final char rhs) {
    return doMultiply(((BigInteger)lhs), rhs);
  }

  public Object doMultiply(final Object lhs, final short rhs) {
    return doMultiply(((BigInteger)lhs), rhs);
  }

  public Object doMultiply(final Object lhs, final int rhs) {
    return doMultiply(((BigInteger)lhs), rhs);
  }

  public Object doMultiply(final Object lhs, final long rhs) {
    return doMultiply(((BigInteger)lhs), rhs);
  }

  public Object doMultiply(final Object lhs, final float rhs) {
    return doMultiply(((BigInteger)lhs), rhs);
  }

  public Object doMultiply(final Object lhs, final double rhs) {
    return doMultiply(((BigInteger)lhs), rhs);
  }

  public Object doMultiply(final Object lhs, final BigInteger rhs) {
    return doMultiply(((BigInteger)lhs), rhs);
  }

  public Object doMultiply(final Object lhs, final BigDecimal rhs) {
    return doMultiply(((BigInteger)lhs), rhs);
  }

  public Object doReverseMultiply(final byte lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(byte.class).doMultiply(lhs, ((BigInteger)rhs));
  }

  public Object doReverseMultiply(final char lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(char.class).doMultiply(lhs, ((BigInteger)rhs));
  }

  public Object doReverseMultiply(final short lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(short.class).doMultiply(lhs, ((BigInteger)rhs));
  }

  public Object doReverseMultiply(final int lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(int.class).doMultiply(lhs, ((BigInteger)rhs));
  }

  public Object doReverseMultiply(final long lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(long.class).doMultiply(lhs, ((BigInteger)rhs));
  }

  public Object doReverseMultiply(final float lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(float.class).doMultiply(lhs, ((BigInteger)rhs));
  }

  public Object doReverseMultiply(final double lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(double.class).doMultiply(lhs, ((BigInteger)rhs));
  }

  public Object doReverseMultiply(final BigInteger lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(BigInteger.class).doMultiply(lhs, ((BigInteger)rhs));
  }

  public Object doReverseMultiply(final BigDecimal lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(BigDecimal.class).doMultiply(lhs, ((BigInteger)rhs));
  }

  public Object doMultiplyEquals(final Object lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseMultiplyEquals(((BigInteger)lhs), rhs);
  }

  public Object doMultiplyEquals(final BigInteger lhs, final byte rhs) {
    return lhs.multiply(BigInteger.valueOf(rhs));
  }

  public Object doMultiplyEquals(final BigInteger lhs, final char rhs) {
    return lhs.multiply(BigInteger.valueOf(rhs));
  }

  public Object doMultiplyEquals(final BigInteger lhs, final short rhs) {
    return lhs.multiply(BigInteger.valueOf(rhs));
  }

  public Object doMultiplyEquals(final BigInteger lhs, final int rhs) {
    return lhs.multiply(BigInteger.valueOf(rhs));
  }

  public Object doMultiplyEquals(final BigInteger lhs, final long rhs) {
    return lhs.multiply(BigInteger.valueOf(rhs));
  }

  public Object doMultiplyEquals(final BigInteger lhs, final float rhs) {
    return new NgFloat(lhs.floatValue() * rhs);
  }

  public Object doMultiplyEquals(final BigInteger lhs, final double rhs) {
    return new NgDouble(lhs.doubleValue() * rhs);
  }

  public Object doMultiplyEquals(final BigInteger lhs, final BigInteger rhs) {
    return lhs.multiply(rhs);
  }

  public Object doMultiplyEquals(final BigInteger lhs, final BigDecimal rhs) {
    return new BigDecimal(lhs).multiply(rhs);
  }

  public Object doMultiplyEquals(final Object lhs, final byte rhs) {
    return doMultiplyEquals(((BigInteger)lhs), rhs);
  }

  public Object doMultiplyEquals(final Object lhs, final char rhs) {
    return doMultiplyEquals(((BigInteger)lhs), rhs);
  }

  public Object doMultiplyEquals(final Object lhs, final short rhs) {
    return doMultiplyEquals(((BigInteger)lhs), rhs);
  }

  public Object doMultiplyEquals(final Object lhs, final int rhs) {
    return doMultiplyEquals(((BigInteger)lhs), rhs);
  }

  public Object doMultiplyEquals(final Object lhs, final long rhs) {
    return doMultiplyEquals(((BigInteger)lhs), rhs);
  }

  public Object doMultiplyEquals(final Object lhs, final float rhs) {
    return doMultiplyEquals(((BigInteger)lhs), rhs);
  }

  public Object doMultiplyEquals(final Object lhs, final double rhs) {
    return doMultiplyEquals(((BigInteger)lhs), rhs);
  }

  public Object doMultiplyEquals(final Object lhs, final BigInteger rhs) {
    return doMultiplyEquals(((BigInteger)lhs), rhs);
  }

  public Object doMultiplyEquals(final Object lhs, final BigDecimal rhs) {
    return doMultiplyEquals(((BigInteger)lhs), rhs);
  }

  public Object doReverseMultiplyEquals(final byte lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(byte.class).doMultiplyEquals(lhs, ((BigInteger)rhs));
  }

  public Object doReverseMultiplyEquals(final char lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(char.class).doMultiplyEquals(lhs, ((BigInteger)rhs));
  }

  public Object doReverseMultiplyEquals(final short lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(short.class).doMultiplyEquals(lhs, ((BigInteger)rhs));
  }

  public Object doReverseMultiplyEquals(final int lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(int.class).doMultiplyEquals(lhs, ((BigInteger)rhs));
  }

  public Object doReverseMultiplyEquals(final long lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(long.class).doMultiplyEquals(lhs, ((BigInteger)rhs));
  }

  public Object doReverseMultiplyEquals(final float lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(float.class).doMultiplyEquals(lhs, ((BigInteger)rhs));
  }

  public Object doReverseMultiplyEquals(final double lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(double.class).doMultiplyEquals(lhs, ((BigInteger)rhs));
  }

  public Object doReverseMultiplyEquals(final BigInteger lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(BigInteger.class).doMultiplyEquals(lhs, ((BigInteger)rhs));
  }

  public Object doReverseMultiplyEquals(final BigDecimal lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(BigDecimal.class).doMultiplyEquals(lhs, ((BigInteger)rhs));
  }

  public Object doDivide(final Object lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseDivide(((BigInteger)lhs), rhs);
  }

  public Object doDivide(final BigInteger lhs, final byte rhs) {
    return lhs.divide(BigInteger.valueOf(rhs));
  }

  public Object doDivide(final BigInteger lhs, final char rhs) {
    return lhs.divide(BigInteger.valueOf(rhs));
  }

  public Object doDivide(final BigInteger lhs, final short rhs) {
    return lhs.divide(BigInteger.valueOf(rhs));
  }

  public Object doDivide(final BigInteger lhs, final int rhs) {
    return lhs.divide(BigInteger.valueOf(rhs));
  }

  public Object doDivide(final BigInteger lhs, final long rhs) {
    return lhs.divide(BigInteger.valueOf(rhs));
  }

  public Object doDivide(final BigInteger lhs, final float rhs) {
    return new NgFloat(lhs.floatValue() / rhs);
  }

  public Object doDivide(final BigInteger lhs, final double rhs) {
    return new NgDouble(lhs.doubleValue() / rhs);
  }

  public Object doDivide(final BigInteger lhs, final BigInteger rhs) {
    return lhs.divide(rhs);
  }

  public Object doDivide(final BigInteger lhs, final BigDecimal rhs) {
    return new BigDecimal(lhs).divide(rhs);
  }

  public Object doDivide(final Object lhs, final byte rhs) {
    return doDivide(((BigInteger)lhs), rhs);
  }

  public Object doDivide(final Object lhs, final char rhs) {
    return doDivide(((BigInteger)lhs), rhs);
  }

  public Object doDivide(final Object lhs, final short rhs) {
    return doDivide(((BigInteger)lhs), rhs);
  }

  public Object doDivide(final Object lhs, final int rhs) {
    return doDivide(((BigInteger)lhs), rhs);
  }

  public Object doDivide(final Object lhs, final long rhs) {
    return doDivide(((BigInteger)lhs), rhs);
  }

  public Object doDivide(final Object lhs, final float rhs) {
    return doDivide(((BigInteger)lhs), rhs);
  }

  public Object doDivide(final Object lhs, final double rhs) {
    return doDivide(((BigInteger)lhs), rhs);
  }

  public Object doDivide(final Object lhs, final BigInteger rhs) {
    return doDivide(((BigInteger)lhs), rhs);
  }

  public Object doDivide(final Object lhs, final BigDecimal rhs) {
    return doDivide(((BigInteger)lhs), rhs);
  }

  public Object doReverseDivide(final byte lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(byte.class).doDivide(lhs, ((BigInteger)rhs));
  }

  public Object doReverseDivide(final char lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(char.class).doDivide(lhs, ((BigInteger)rhs));
  }

  public Object doReverseDivide(final short lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(short.class).doDivide(lhs, ((BigInteger)rhs));
  }

  public Object doReverseDivide(final int lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(int.class).doDivide(lhs, ((BigInteger)rhs));
  }

  public Object doReverseDivide(final long lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(long.class).doDivide(lhs, ((BigInteger)rhs));
  }

  public Object doReverseDivide(final float lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(float.class).doDivide(lhs, ((BigInteger)rhs));
  }

  public Object doReverseDivide(final double lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(double.class).doDivide(lhs, ((BigInteger)rhs));
  }

  public Object doReverseDivide(final BigInteger lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(BigInteger.class).doDivide(lhs, ((BigInteger)rhs));
  }

  public Object doReverseDivide(final BigDecimal lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(BigDecimal.class).doDivide(lhs, ((BigInteger)rhs));
  }

  public Object doDivideEquals(final Object lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseDivideEquals(((BigInteger)lhs), rhs);
  }

  public Object doDivideEquals(final BigInteger lhs, final byte rhs) {
    return lhs.divide(BigInteger.valueOf(rhs));
  }

  public Object doDivideEquals(final BigInteger lhs, final char rhs) {
    return lhs.divide(BigInteger.valueOf(rhs));
  }

  public Object doDivideEquals(final BigInteger lhs, final short rhs) {
    return lhs.divide(BigInteger.valueOf(rhs));
  }

  public Object doDivideEquals(final BigInteger lhs, final int rhs) {
    return lhs.divide(BigInteger.valueOf(rhs));
  }

  public Object doDivideEquals(final BigInteger lhs, final long rhs) {
    return lhs.divide(BigInteger.valueOf(rhs));
  }

  public Object doDivideEquals(final BigInteger lhs, final float rhs) {
    return new NgFloat(lhs.floatValue() / rhs);
  }

  public Object doDivideEquals(final BigInteger lhs, final double rhs) {
    return new NgDouble(lhs.doubleValue() / rhs);
  }

  public Object doDivideEquals(final BigInteger lhs, final BigInteger rhs) {
    return lhs.divide(rhs);
  }

  public Object doDivideEquals(final BigInteger lhs, final BigDecimal rhs) {
    return new BigDecimal(lhs).divide(rhs);
  }

  public Object doDivideEquals(final Object lhs, final byte rhs) {
    return doDivideEquals(((BigInteger)lhs), rhs);
  }

  public Object doDivideEquals(final Object lhs, final char rhs) {
    return doDivideEquals(((BigInteger)lhs), rhs);
  }

  public Object doDivideEquals(final Object lhs, final short rhs) {
    return doDivideEquals(((BigInteger)lhs), rhs);
  }

  public Object doDivideEquals(final Object lhs, final int rhs) {
    return doDivideEquals(((BigInteger)lhs), rhs);
  }

  public Object doDivideEquals(final Object lhs, final long rhs) {
    return doDivideEquals(((BigInteger)lhs), rhs);
  }

  public Object doDivideEquals(final Object lhs, final float rhs) {
    return doDivideEquals(((BigInteger)lhs), rhs);
  }

  public Object doDivideEquals(final Object lhs, final double rhs) {
    return doDivideEquals(((BigInteger)lhs), rhs);
  }

  public Object doDivideEquals(final Object lhs, final BigInteger rhs) {
    return doDivideEquals(((BigInteger)lhs), rhs);
  }

  public Object doDivideEquals(final Object lhs, final BigDecimal rhs) {
    return doDivideEquals(((BigInteger)lhs), rhs);
  }

  public Object doReverseDivideEquals(final byte lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(byte.class).doDivideEquals(lhs, ((BigInteger)rhs));
  }

  public Object doReverseDivideEquals(final char lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(char.class).doDivideEquals(lhs, ((BigInteger)rhs));
  }

  public Object doReverseDivideEquals(final short lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(short.class).doDivideEquals(lhs, ((BigInteger)rhs));
  }

  public Object doReverseDivideEquals(final int lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(int.class).doDivideEquals(lhs, ((BigInteger)rhs));
  }

  public Object doReverseDivideEquals(final long lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(long.class).doDivideEquals(lhs, ((BigInteger)rhs));
  }

  public Object doReverseDivideEquals(final float lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(float.class).doDivideEquals(lhs, ((BigInteger)rhs));
  }

  public Object doReverseDivideEquals(final double lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(double.class).doDivideEquals(lhs, ((BigInteger)rhs));
  }

  public Object doReverseDivideEquals(final BigInteger lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(BigInteger.class).doDivideEquals(lhs, ((BigInteger)rhs));
  }

  public Object doReverseDivideEquals(final BigDecimal lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(BigDecimal.class).doDivideEquals(lhs, ((BigInteger)rhs));
  }

  public Object doRemainder(final Object lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseRemainder(((BigInteger)lhs), rhs);
  }

  public Object doRemainder(final BigInteger lhs, final byte rhs) {
    return lhs.mod(BigInteger.valueOf(rhs));
  }

  public Object doRemainder(final BigInteger lhs, final char rhs) {
    return lhs.mod(BigInteger.valueOf(rhs));
  }

  public Object doRemainder(final BigInteger lhs, final short rhs) {
    return lhs.mod(BigInteger.valueOf(rhs));
  }

  public Object doRemainder(final BigInteger lhs, final int rhs) {
    return lhs.mod(BigInteger.valueOf(rhs));
  }

  public Object doRemainder(final BigInteger lhs, final long rhs) {
    return lhs.mod(BigInteger.valueOf(rhs));
  }

  public Object doRemainder(final BigInteger lhs, final BigInteger rhs) {
    return lhs.mod(rhs);
  }

  public Object doRemainder(final Object lhs, final byte rhs) {
    return doRemainder(((BigInteger)lhs), rhs);
  }

  public Object doRemainder(final Object lhs, final char rhs) {
    return doRemainder(((BigInteger)lhs), rhs);
  }

  public Object doRemainder(final Object lhs, final short rhs) {
    return doRemainder(((BigInteger)lhs), rhs);
  }

  public Object doRemainder(final Object lhs, final int rhs) {
    return doRemainder(((BigInteger)lhs), rhs);
  }

  public Object doRemainder(final Object lhs, final long rhs) {
    return doRemainder(((BigInteger)lhs), rhs);
  }

  public Object doRemainder(final Object lhs, final BigInteger rhs) {
    return doRemainder(((BigInteger)lhs), rhs);
  }

  public Object doReverseRemainder(final byte lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(byte.class).doRemainder(lhs, ((BigInteger)rhs));
  }

  public Object doReverseRemainder(final char lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(char.class).doRemainder(lhs, ((BigInteger)rhs));
  }

  public Object doReverseRemainder(final short lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(short.class).doRemainder(lhs, ((BigInteger)rhs));
  }

  public Object doReverseRemainder(final int lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(int.class).doRemainder(lhs, ((BigInteger)rhs));
  }

  public Object doReverseRemainder(final long lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(long.class).doRemainder(lhs, ((BigInteger)rhs));
  }

  public Object doReverseRemainder(final BigInteger lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(BigInteger.class).doRemainder(lhs, ((BigInteger)rhs));
  }

  public Object doRemainderEquals(final Object lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseRemainderEquals(((BigInteger)lhs), rhs);
  }

  public Object doRemainderEquals(final BigInteger lhs, final byte rhs) {
    return lhs.mod(BigInteger.valueOf(rhs));
  }

  public Object doRemainderEquals(final BigInteger lhs, final char rhs) {
    return lhs.mod(BigInteger.valueOf(rhs));
  }

  public Object doRemainderEquals(final BigInteger lhs, final short rhs) {
    return lhs.mod(BigInteger.valueOf(rhs));
  }

  public Object doRemainderEquals(final BigInteger lhs, final int rhs) {
    return lhs.mod(BigInteger.valueOf(rhs));
  }

  public Object doRemainderEquals(final BigInteger lhs, final long rhs) {
    return lhs.mod(BigInteger.valueOf(rhs));
  }

  public Object doRemainderEquals(final BigInteger lhs, final BigInteger rhs) {
    return lhs.mod(rhs);
  }

  public Object doRemainderEquals(final Object lhs, final byte rhs) {
    return doRemainderEquals(((BigInteger)lhs), rhs);
  }

  public Object doRemainderEquals(final Object lhs, final char rhs) {
    return doRemainderEquals(((BigInteger)lhs), rhs);
  }

  public Object doRemainderEquals(final Object lhs, final short rhs) {
    return doRemainderEquals(((BigInteger)lhs), rhs);
  }

  public Object doRemainderEquals(final Object lhs, final int rhs) {
    return doRemainderEquals(((BigInteger)lhs), rhs);
  }

  public Object doRemainderEquals(final Object lhs, final long rhs) {
    return doRemainderEquals(((BigInteger)lhs), rhs);
  }

  public Object doRemainderEquals(final Object lhs, final BigInteger rhs) {
    return doRemainderEquals(((BigInteger)lhs), rhs);
  }

  public Object doReverseRemainderEquals(final byte lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(byte.class).doRemainderEquals(lhs, ((BigInteger)rhs));
  }

  public Object doReverseRemainderEquals(final char lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(char.class).doRemainderEquals(lhs, ((BigInteger)rhs));
  }

  public Object doReverseRemainderEquals(final short lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(short.class).doRemainderEquals(lhs, ((BigInteger)rhs));
  }

  public Object doReverseRemainderEquals(final int lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(int.class).doRemainderEquals(lhs, ((BigInteger)rhs));
  }

  public Object doReverseRemainderEquals(final long lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(long.class).doRemainderEquals(lhs, ((BigInteger)rhs));
  }

  public Object doReverseRemainderEquals(final BigInteger lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(BigInteger.class).doRemainderEquals(lhs, ((BigInteger)rhs));
  }

  public Object doIntegerDivide(final Object lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseIntegerDivide(((BigInteger)lhs), rhs);
  }

  public Object doIntegerDivide(final BigInteger lhs, final byte rhs) {
    return lhs.divide(BigInteger.valueOf(rhs));
  }

  public Object doIntegerDivide(final BigInteger lhs, final char rhs) {
    return lhs.divide(BigInteger.valueOf(rhs));
  }

  public Object doIntegerDivide(final BigInteger lhs, final short rhs) {
    return lhs.divide(BigInteger.valueOf(rhs));
  }

  public Object doIntegerDivide(final BigInteger lhs, final int rhs) {
    return lhs.divide(BigInteger.valueOf(rhs));
  }

  public Object doIntegerDivide(final BigInteger lhs, final long rhs) {
    return lhs.divide(BigInteger.valueOf(rhs));
  }

  public Object doIntegerDivide(final BigInteger lhs, final float rhs) {
    return (new BigDecimal(lhs)).divideToIntegralValue(BigDecimal.valueOf(rhs));
  }

  public Object doIntegerDivide(final BigInteger lhs, final double rhs) {
    return (new BigDecimal(lhs)).divideToIntegralValue(BigDecimal.valueOf(rhs));
  }

  public Object doIntegerDivide(final BigInteger lhs, final BigInteger rhs) {
    return lhs.divide(rhs);
  }

  public Object doIntegerDivide(final BigInteger lhs, final BigDecimal rhs) {
    return (new BigDecimal(lhs)).divideToIntegralValue(rhs);
  }

  public Object doIntegerDivide(final Object lhs, final byte rhs) {
    return doIntegerDivide(((BigInteger)lhs), rhs);
  }

  public Object doIntegerDivide(final Object lhs, final char rhs) {
    return doIntegerDivide(((BigInteger)lhs), rhs);
  }

  public Object doIntegerDivide(final Object lhs, final short rhs) {
    return doIntegerDivide(((BigInteger)lhs), rhs);
  }

  public Object doIntegerDivide(final Object lhs, final int rhs) {
    return doIntegerDivide(((BigInteger)lhs), rhs);
  }

  public Object doIntegerDivide(final Object lhs, final long rhs) {
    return doIntegerDivide(((BigInteger)lhs), rhs);
  }

  public Object doIntegerDivide(final Object lhs, final float rhs) {
    return doIntegerDivide(((BigInteger)lhs), rhs);
  }

  public Object doIntegerDivide(final Object lhs, final double rhs) {
    return doIntegerDivide(((BigInteger)lhs), rhs);
  }

  public Object doIntegerDivide(final Object lhs, final BigInteger rhs) {
    return doIntegerDivide(((BigInteger)lhs), rhs);
  }

  public Object doIntegerDivide(final Object lhs, final BigDecimal rhs) {
    return doIntegerDivide(((BigInteger)lhs), rhs);
  }

  public Object doReverseIntegerDivide(final byte lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(byte.class).doIntegerDivide(lhs, ((BigInteger)rhs));
  }

  public Object doReverseIntegerDivide(final char lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(char.class).doIntegerDivide(lhs, ((BigInteger)rhs));
  }

  public Object doReverseIntegerDivide(final short lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(short.class).doIntegerDivide(lhs, ((BigInteger)rhs));
  }

  public Object doReverseIntegerDivide(final int lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(int.class).doIntegerDivide(lhs, ((BigInteger)rhs));
  }

  public Object doReverseIntegerDivide(final long lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(long.class).doIntegerDivide(lhs, ((BigInteger)rhs));
  }

  public Object doReverseIntegerDivide(final float lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(float.class).doIntegerDivide(lhs, ((BigInteger)rhs));
  }

  public Object doReverseIntegerDivide(final double lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(double.class).doIntegerDivide(lhs, ((BigInteger)rhs));
  }

  public Object doReverseIntegerDivide(final BigInteger lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(BigInteger.class).doIntegerDivide(lhs, ((BigInteger)rhs));
  }

  public Object doReverseIntegerDivide(final BigDecimal lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(BigDecimal.class).doIntegerDivide(lhs, ((BigInteger)rhs));
  }

  public Object doIntegerDivideEquals(final Object lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseIntegerDivideEquals(((BigInteger)lhs), rhs);
  }

  public Object doIntegerDivideEquals(final BigInteger lhs, final byte rhs) {
    return lhs.divide(BigInteger.valueOf(rhs));
  }

  public Object doIntegerDivideEquals(final BigInteger lhs, final char rhs) {
    return lhs.divide(BigInteger.valueOf(rhs));
  }

  public Object doIntegerDivideEquals(final BigInteger lhs, final short rhs) {
    return lhs.divide(BigInteger.valueOf(rhs));
  }

  public Object doIntegerDivideEquals(final BigInteger lhs, final int rhs) {
    return lhs.divide(BigInteger.valueOf(rhs));
  }

  public Object doIntegerDivideEquals(final BigInteger lhs, final long rhs) {
    return lhs.divide(BigInteger.valueOf(rhs));
  }

  public Object doIntegerDivideEquals(final BigInteger lhs, final float rhs) {
    return (new BigDecimal(lhs)).divideToIntegralValue(BigDecimal.valueOf(rhs));
  }

  public Object doIntegerDivideEquals(final BigInteger lhs, final double rhs) {
    return (new BigDecimal(lhs)).divideToIntegralValue(BigDecimal.valueOf(rhs));
  }

  public Object doIntegerDivideEquals(final BigInteger lhs, final BigInteger rhs) {
    return lhs.divide(rhs);
  }

  public Object doIntegerDivideEquals(final BigInteger lhs, final BigDecimal rhs) {
    return (new BigDecimal(lhs)).divideToIntegralValue(rhs);
  }

  public Object doIntegerDivideEquals(final Object lhs, final byte rhs) {
    return doIntegerDivideEquals(((BigInteger)lhs), rhs);
  }

  public Object doIntegerDivideEquals(final Object lhs, final char rhs) {
    return doIntegerDivideEquals(((BigInteger)lhs), rhs);
  }

  public Object doIntegerDivideEquals(final Object lhs, final short rhs) {
    return doIntegerDivideEquals(((BigInteger)lhs), rhs);
  }

  public Object doIntegerDivideEquals(final Object lhs, final int rhs) {
    return doIntegerDivideEquals(((BigInteger)lhs), rhs);
  }

  public Object doIntegerDivideEquals(final Object lhs, final long rhs) {
    return doIntegerDivideEquals(((BigInteger)lhs), rhs);
  }

  public Object doIntegerDivideEquals(final Object lhs, final float rhs) {
    return doIntegerDivideEquals(((BigInteger)lhs), rhs);
  }

  public Object doIntegerDivideEquals(final Object lhs, final double rhs) {
    return doIntegerDivideEquals(((BigInteger)lhs), rhs);
  }

  public Object doIntegerDivideEquals(final Object lhs, final BigInteger rhs) {
    return doIntegerDivideEquals(((BigInteger)lhs), rhs);
  }

  public Object doIntegerDivideEquals(final Object lhs, final BigDecimal rhs) {
    return doIntegerDivideEquals(((BigInteger)lhs), rhs);
  }

  public Object doReverseIntegerDivideEquals(final byte lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(byte.class).doIntegerDivideEquals(lhs, ((BigInteger)rhs));
  }

  public Object doReverseIntegerDivideEquals(final char lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(char.class).doIntegerDivideEquals(lhs, ((BigInteger)rhs));
  }

  public Object doReverseIntegerDivideEquals(final short lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(short.class).doIntegerDivideEquals(lhs, ((BigInteger)rhs));
  }

  public Object doReverseIntegerDivideEquals(final int lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(int.class).doIntegerDivideEquals(lhs, ((BigInteger)rhs));
  }

  public Object doReverseIntegerDivideEquals(final long lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(long.class).doIntegerDivideEquals(lhs, ((BigInteger)rhs));
  }

  public Object doReverseIntegerDivideEquals(final float lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(float.class).doIntegerDivideEquals(lhs, ((BigInteger)rhs));
  }

  public Object doReverseIntegerDivideEquals(final double lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(double.class).doIntegerDivideEquals(lhs, ((BigInteger)rhs));
  }

  public Object doReverseIntegerDivideEquals(final BigInteger lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(BigInteger.class).doIntegerDivideEquals(lhs, ((BigInteger)rhs));
  }

  public Object doReverseIntegerDivideEquals(final BigDecimal lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(BigDecimal.class).doIntegerDivideEquals(lhs, ((BigInteger)rhs));
  }

  public Object doAnd(final Object lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseAnd(((BigInteger)lhs), rhs);
  }

  public Object doAnd(final BigInteger lhs, final byte rhs) {
    return lhs.and(BigInteger.valueOf(rhs));
  }

  public Object doAnd(final BigInteger lhs, final char rhs) {
    return lhs.and(BigInteger.valueOf(rhs));
  }

  public Object doAnd(final BigInteger lhs, final short rhs) {
    return lhs.and(BigInteger.valueOf(rhs));
  }

  public Object doAnd(final BigInteger lhs, final int rhs) {
    return lhs.and(BigInteger.valueOf(rhs));
  }

  public Object doAnd(final BigInteger lhs, final long rhs) {
    return lhs.and(BigInteger.valueOf(rhs));
  }

  public Object doAnd(final BigInteger lhs, final BigInteger rhs) {
    return lhs.and(rhs);
  }

  public Object doAnd(final Object lhs, final byte rhs) {
    return doAnd(((BigInteger)lhs), rhs);
  }

  public Object doAnd(final Object lhs, final char rhs) {
    return doAnd(((BigInteger)lhs), rhs);
  }

  public Object doAnd(final Object lhs, final short rhs) {
    return doAnd(((BigInteger)lhs), rhs);
  }

  public Object doAnd(final Object lhs, final int rhs) {
    return doAnd(((BigInteger)lhs), rhs);
  }

  public Object doAnd(final Object lhs, final long rhs) {
    return doAnd(((BigInteger)lhs), rhs);
  }

  public Object doAnd(final Object lhs, final BigInteger rhs) {
    return doAnd(((BigInteger)lhs), rhs);
  }

  public Object doReverseAnd(final byte lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(byte.class).doAnd(lhs, ((BigInteger)rhs));
  }

  public Object doReverseAnd(final char lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(char.class).doAnd(lhs, ((BigInteger)rhs));
  }

  public Object doReverseAnd(final short lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(short.class).doAnd(lhs, ((BigInteger)rhs));
  }

  public Object doReverseAnd(final int lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(int.class).doAnd(lhs, ((BigInteger)rhs));
  }

  public Object doReverseAnd(final long lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(long.class).doAnd(lhs, ((BigInteger)rhs));
  }

  public Object doReverseAnd(final BigInteger lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(BigInteger.class).doAnd(lhs, ((BigInteger)rhs));
  }

  public Object doAndEquals(final Object lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseAndEquals(((BigInteger)lhs), rhs);
  }

  public Object doAndEquals(final BigInteger lhs, final byte rhs) {
    return lhs.and(BigInteger.valueOf(rhs));
  }

  public Object doAndEquals(final BigInteger lhs, final char rhs) {
    return lhs.and(BigInteger.valueOf(rhs));
  }

  public Object doAndEquals(final BigInteger lhs, final short rhs) {
    return lhs.and(BigInteger.valueOf(rhs));
  }

  public Object doAndEquals(final BigInteger lhs, final int rhs) {
    return lhs.and(BigInteger.valueOf(rhs));
  }

  public Object doAndEquals(final BigInteger lhs, final long rhs) {
    return lhs.and(BigInteger.valueOf(rhs));
  }

  public Object doAndEquals(final BigInteger lhs, final BigInteger rhs) {
    return lhs.and(rhs);
  }

  public Object doAndEquals(final Object lhs, final byte rhs) {
    return doAndEquals(((BigInteger)lhs), rhs);
  }

  public Object doAndEquals(final Object lhs, final char rhs) {
    return doAndEquals(((BigInteger)lhs), rhs);
  }

  public Object doAndEquals(final Object lhs, final short rhs) {
    return doAndEquals(((BigInteger)lhs), rhs);
  }

  public Object doAndEquals(final Object lhs, final int rhs) {
    return doAndEquals(((BigInteger)lhs), rhs);
  }

  public Object doAndEquals(final Object lhs, final long rhs) {
    return doAndEquals(((BigInteger)lhs), rhs);
  }

  public Object doAndEquals(final Object lhs, final BigInteger rhs) {
    return doAndEquals(((BigInteger)lhs), rhs);
  }

  public Object doReverseAndEquals(final byte lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(byte.class).doAndEquals(lhs, ((BigInteger)rhs));
  }

  public Object doReverseAndEquals(final char lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(char.class).doAndEquals(lhs, ((BigInteger)rhs));
  }

  public Object doReverseAndEquals(final short lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(short.class).doAndEquals(lhs, ((BigInteger)rhs));
  }

  public Object doReverseAndEquals(final int lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(int.class).doAndEquals(lhs, ((BigInteger)rhs));
  }

  public Object doReverseAndEquals(final long lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(long.class).doAndEquals(lhs, ((BigInteger)rhs));
  }

  public Object doReverseAndEquals(final BigInteger lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(BigInteger.class).doAndEquals(lhs, ((BigInteger)rhs));
  }

  public Object doOr(final Object lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseOr(((BigInteger)lhs), rhs);
  }

  public Object doOr(final BigInteger lhs, final byte rhs) {
    return lhs.or(BigInteger.valueOf(rhs));
  }

  public Object doOr(final BigInteger lhs, final char rhs) {
    return lhs.or(BigInteger.valueOf(rhs));
  }

  public Object doOr(final BigInteger lhs, final short rhs) {
    return lhs.or(BigInteger.valueOf(rhs));
  }

  public Object doOr(final BigInteger lhs, final int rhs) {
    return lhs.or(BigInteger.valueOf(rhs));
  }

  public Object doOr(final BigInteger lhs, final long rhs) {
    return lhs.or(BigInteger.valueOf(rhs));
  }

  public Object doOr(final BigInteger lhs, final BigInteger rhs) {
    return lhs.or(rhs);
  }

  public Object doOr(final Object lhs, final byte rhs) {
    return doOr(((BigInteger)lhs), rhs);
  }

  public Object doOr(final Object lhs, final char rhs) {
    return doOr(((BigInteger)lhs), rhs);
  }

  public Object doOr(final Object lhs, final short rhs) {
    return doOr(((BigInteger)lhs), rhs);
  }

  public Object doOr(final Object lhs, final int rhs) {
    return doOr(((BigInteger)lhs), rhs);
  }

  public Object doOr(final Object lhs, final long rhs) {
    return doOr(((BigInteger)lhs), rhs);
  }

  public Object doOr(final Object lhs, final BigInteger rhs) {
    return doOr(((BigInteger)lhs), rhs);
  }

  public Object doReverseOr(final byte lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(byte.class).doOr(lhs, ((BigInteger)rhs));
  }

  public Object doReverseOr(final char lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(char.class).doOr(lhs, ((BigInteger)rhs));
  }

  public Object doReverseOr(final short lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(short.class).doOr(lhs, ((BigInteger)rhs));
  }

  public Object doReverseOr(final int lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(int.class).doOr(lhs, ((BigInteger)rhs));
  }

  public Object doReverseOr(final long lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(long.class).doOr(lhs, ((BigInteger)rhs));
  }

  public Object doReverseOr(final BigInteger lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(BigInteger.class).doOr(lhs, ((BigInteger)rhs));
  }

  public Object doOrEquals(final Object lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseOrEquals(((BigInteger)lhs), rhs);
  }

  public Object doOrEquals(final BigInteger lhs, final byte rhs) {
    return lhs.or(BigInteger.valueOf(rhs));
  }

  public Object doOrEquals(final BigInteger lhs, final char rhs) {
    return lhs.or(BigInteger.valueOf(rhs));
  }

  public Object doOrEquals(final BigInteger lhs, final short rhs) {
    return lhs.or(BigInteger.valueOf(rhs));
  }

  public Object doOrEquals(final BigInteger lhs, final int rhs) {
    return lhs.or(BigInteger.valueOf(rhs));
  }

  public Object doOrEquals(final BigInteger lhs, final long rhs) {
    return lhs.or(BigInteger.valueOf(rhs));
  }

  public Object doOrEquals(final BigInteger lhs, final BigInteger rhs) {
    return lhs.or(rhs);
  }

  public Object doOrEquals(final Object lhs, final byte rhs) {
    return doOrEquals(((BigInteger)lhs), rhs);
  }

  public Object doOrEquals(final Object lhs, final char rhs) {
    return doOrEquals(((BigInteger)lhs), rhs);
  }

  public Object doOrEquals(final Object lhs, final short rhs) {
    return doOrEquals(((BigInteger)lhs), rhs);
  }

  public Object doOrEquals(final Object lhs, final int rhs) {
    return doOrEquals(((BigInteger)lhs), rhs);
  }

  public Object doOrEquals(final Object lhs, final long rhs) {
    return doOrEquals(((BigInteger)lhs), rhs);
  }

  public Object doOrEquals(final Object lhs, final BigInteger rhs) {
    return doOrEquals(((BigInteger)lhs), rhs);
  }

  public Object doReverseOrEquals(final byte lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(byte.class).doOrEquals(lhs, ((BigInteger)rhs));
  }

  public Object doReverseOrEquals(final char lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(char.class).doOrEquals(lhs, ((BigInteger)rhs));
  }

  public Object doReverseOrEquals(final short lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(short.class).doOrEquals(lhs, ((BigInteger)rhs));
  }

  public Object doReverseOrEquals(final int lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(int.class).doOrEquals(lhs, ((BigInteger)rhs));
  }

  public Object doReverseOrEquals(final long lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(long.class).doOrEquals(lhs, ((BigInteger)rhs));
  }

  public Object doReverseOrEquals(final BigInteger lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(BigInteger.class).doOrEquals(lhs, ((BigInteger)rhs));
  }

  public Object doXor(final Object lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseXor(((BigInteger)lhs), rhs);
  }

  public Object doXor(final BigInteger lhs, final byte rhs) {
    return lhs.xor(BigInteger.valueOf(rhs));
  }

  public Object doXor(final BigInteger lhs, final char rhs) {
    return lhs.xor(BigInteger.valueOf(rhs));
  }

  public Object doXor(final BigInteger lhs, final short rhs) {
    return lhs.xor(BigInteger.valueOf(rhs));
  }

  public Object doXor(final BigInteger lhs, final int rhs) {
    return lhs.xor(BigInteger.valueOf(rhs));
  }

  public Object doXor(final BigInteger lhs, final long rhs) {
    return lhs.xor(BigInteger.valueOf(rhs));
  }

  public Object doXor(final BigInteger lhs, final BigInteger rhs) {
    return lhs.xor(rhs);
  }

  public Object doXor(final Object lhs, final byte rhs) {
    return doXor(((BigInteger)lhs), rhs);
  }

  public Object doXor(final Object lhs, final char rhs) {
    return doXor(((BigInteger)lhs), rhs);
  }

  public Object doXor(final Object lhs, final short rhs) {
    return doXor(((BigInteger)lhs), rhs);
  }

  public Object doXor(final Object lhs, final int rhs) {
    return doXor(((BigInteger)lhs), rhs);
  }

  public Object doXor(final Object lhs, final long rhs) {
    return doXor(((BigInteger)lhs), rhs);
  }

  public Object doXor(final Object lhs, final BigInteger rhs) {
    return doXor(((BigInteger)lhs), rhs);
  }

  public Object doReverseXor(final byte lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(byte.class).doXor(lhs, ((BigInteger)rhs));
  }

  public Object doReverseXor(final char lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(char.class).doXor(lhs, ((BigInteger)rhs));
  }

  public Object doReverseXor(final short lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(short.class).doXor(lhs, ((BigInteger)rhs));
  }

  public Object doReverseXor(final int lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(int.class).doXor(lhs, ((BigInteger)rhs));
  }

  public Object doReverseXor(final long lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(long.class).doXor(lhs, ((BigInteger)rhs));
  }

  public Object doReverseXor(final BigInteger lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(BigInteger.class).doXor(lhs, ((BigInteger)rhs));
  }

  public Object doXorEquals(final Object lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseXorEquals(((BigInteger)lhs), rhs);
  }

  public Object doXorEquals(final BigInteger lhs, final byte rhs) {
    return lhs.xor(BigInteger.valueOf(rhs));
  }

  public Object doXorEquals(final BigInteger lhs, final char rhs) {
    return lhs.xor(BigInteger.valueOf(rhs));
  }

  public Object doXorEquals(final BigInteger lhs, final short rhs) {
    return lhs.xor(BigInteger.valueOf(rhs));
  }

  public Object doXorEquals(final BigInteger lhs, final int rhs) {
    return lhs.xor(BigInteger.valueOf(rhs));
  }

  public Object doXorEquals(final BigInteger lhs, final long rhs) {
    return lhs.xor(BigInteger.valueOf(rhs));
  }

  public Object doXorEquals(final BigInteger lhs, final BigInteger rhs) {
    return lhs.xor(rhs);
  }

  public Object doXorEquals(final Object lhs, final byte rhs) {
    return doXorEquals(((BigInteger)lhs), rhs);
  }

  public Object doXorEquals(final Object lhs, final char rhs) {
    return doXorEquals(((BigInteger)lhs), rhs);
  }

  public Object doXorEquals(final Object lhs, final short rhs) {
    return doXorEquals(((BigInteger)lhs), rhs);
  }

  public Object doXorEquals(final Object lhs, final int rhs) {
    return doXorEquals(((BigInteger)lhs), rhs);
  }

  public Object doXorEquals(final Object lhs, final long rhs) {
    return doXorEquals(((BigInteger)lhs), rhs);
  }

  public Object doXorEquals(final Object lhs, final BigInteger rhs) {
    return doXorEquals(((BigInteger)lhs), rhs);
  }

  public Object doReverseXorEquals(final byte lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(byte.class).doXorEquals(lhs, ((BigInteger)rhs));
  }

  public Object doReverseXorEquals(final char lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(char.class).doXorEquals(lhs, ((BigInteger)rhs));
  }

  public Object doReverseXorEquals(final short lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(short.class).doXorEquals(lhs, ((BigInteger)rhs));
  }

  public Object doReverseXorEquals(final int lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(int.class).doXorEquals(lhs, ((BigInteger)rhs));
  }

  public Object doReverseXorEquals(final long lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(long.class).doXorEquals(lhs, ((BigInteger)rhs));
  }

  public Object doReverseXorEquals(final BigInteger lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(BigInteger.class).doXorEquals(lhs, ((BigInteger)rhs));
  }

  public Object doLeftShift(final Object lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseLeftShift(((BigInteger)lhs), rhs);
  }

  public Object doLeftShift(final BigInteger lhs, final byte rhs) {
    return lhs.shiftLeft(rhs);
  }

  public Object doLeftShift(final BigInteger lhs, final char rhs) {
    return lhs.shiftLeft(rhs);
  }

  public Object doLeftShift(final BigInteger lhs, final short rhs) {
    return lhs.shiftLeft(rhs);
  }

  public Object doLeftShift(final BigInteger lhs, final int rhs) {
    return lhs.shiftLeft(rhs);
  }

  public Object doLeftShift(final BigInteger lhs, final long rhs) {
    return lhs.shiftLeft((int)rhs);
  }

  public Object doLeftShift(final BigInteger lhs, final BigInteger rhs) {
    return lhs.shiftLeft(rhs.intValue());
  }

  public Object doLeftShift(final Object lhs, final byte rhs) {
    return doLeftShift(((BigInteger)lhs), rhs);
  }

  public Object doLeftShift(final Object lhs, final char rhs) {
    return doLeftShift(((BigInteger)lhs), rhs);
  }

  public Object doLeftShift(final Object lhs, final short rhs) {
    return doLeftShift(((BigInteger)lhs), rhs);
  }

  public Object doLeftShift(final Object lhs, final int rhs) {
    return doLeftShift(((BigInteger)lhs), rhs);
  }

  public Object doLeftShift(final Object lhs, final long rhs) {
    return doLeftShift(((BigInteger)lhs), rhs);
  }

  public Object doLeftShift(final Object lhs, final BigInteger rhs) {
    return doLeftShift(((BigInteger)lhs), rhs);
  }

  public Object doReverseLeftShift(final byte lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(byte.class).doLeftShift(lhs, ((BigInteger)rhs));
  }

  public Object doReverseLeftShift(final char lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(char.class).doLeftShift(lhs, ((BigInteger)rhs));
  }

  public Object doReverseLeftShift(final short lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(short.class).doLeftShift(lhs, ((BigInteger)rhs));
  }

  public Object doReverseLeftShift(final int lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(int.class).doLeftShift(lhs, ((BigInteger)rhs));
  }

  public Object doReverseLeftShift(final long lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(long.class).doLeftShift(lhs, ((BigInteger)rhs));
  }

  public Object doReverseLeftShift(final BigInteger lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(BigInteger.class).doLeftShift(lhs, ((BigInteger)rhs));
  }

  public Object doLeftShiftEquals(final Object lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseLeftShiftEquals(((BigInteger)lhs), rhs);
  }

  public Object doLeftShiftEquals(final BigInteger lhs, final byte rhs) {
    return lhs.shiftLeft(rhs);
  }

  public Object doLeftShiftEquals(final BigInteger lhs, final char rhs) {
    return lhs.shiftLeft(rhs);
  }

  public Object doLeftShiftEquals(final BigInteger lhs, final short rhs) {
    return lhs.shiftLeft(rhs);
  }

  public Object doLeftShiftEquals(final BigInteger lhs, final int rhs) {
    return lhs.shiftLeft(rhs);
  }

  public Object doLeftShiftEquals(final BigInteger lhs, final long rhs) {
    return lhs.shiftLeft((int)rhs);
  }

  public Object doLeftShiftEquals(final BigInteger lhs, final BigInteger rhs) {
    return lhs.shiftLeft(rhs.intValue());
  }

  public Object doLeftShiftEquals(final Object lhs, final byte rhs) {
    return doLeftShiftEquals(((BigInteger)lhs), rhs);
  }

  public Object doLeftShiftEquals(final Object lhs, final char rhs) {
    return doLeftShiftEquals(((BigInteger)lhs), rhs);
  }

  public Object doLeftShiftEquals(final Object lhs, final short rhs) {
    return doLeftShiftEquals(((BigInteger)lhs), rhs);
  }

  public Object doLeftShiftEquals(final Object lhs, final int rhs) {
    return doLeftShiftEquals(((BigInteger)lhs), rhs);
  }

  public Object doLeftShiftEquals(final Object lhs, final long rhs) {
    return doLeftShiftEquals(((BigInteger)lhs), rhs);
  }

  public Object doLeftShiftEquals(final Object lhs, final BigInteger rhs) {
    return doLeftShiftEquals(((BigInteger)lhs), rhs);
  }

  public Object doReverseLeftShiftEquals(final byte lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(byte.class).doLeftShiftEquals(lhs, ((BigInteger)rhs));
  }

  public Object doReverseLeftShiftEquals(final char lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(char.class).doLeftShiftEquals(lhs, ((BigInteger)rhs));
  }

  public Object doReverseLeftShiftEquals(final short lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(short.class).doLeftShiftEquals(lhs, ((BigInteger)rhs));
  }

  public Object doReverseLeftShiftEquals(final int lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(int.class).doLeftShiftEquals(lhs, ((BigInteger)rhs));
  }

  public Object doReverseLeftShiftEquals(final long lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(long.class).doLeftShiftEquals(lhs, ((BigInteger)rhs));
  }

  public Object doReverseLeftShiftEquals(final BigInteger lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(BigInteger.class).doLeftShiftEquals(lhs, ((BigInteger)rhs));
  }

  public Object doArithmeticRightShift(final Object lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseArithmeticRightShift(((BigInteger)lhs), rhs);
  }

  public Object doArithmeticRightShift(final BigInteger lhs, final byte rhs) {
    return lhs.shiftRight(rhs);
  }

  public Object doArithmeticRightShift(final BigInteger lhs, final char rhs) {
    return lhs.shiftRight(rhs);
  }

  public Object doArithmeticRightShift(final BigInteger lhs, final short rhs) {
    return lhs.shiftRight(rhs);
  }

  public Object doArithmeticRightShift(final BigInteger lhs, final int rhs) {
    return lhs.shiftRight(rhs);
  }

  public Object doArithmeticRightShift(final BigInteger lhs, final long rhs) {
    return lhs.shiftRight((int)rhs);
  }

  public Object doArithmeticRightShift(final BigInteger lhs, final BigInteger rhs) {
    return lhs.shiftRight(rhs.intValue());
  }

  public Object doArithmeticRightShift(final Object lhs, final byte rhs) {
    return doArithmeticRightShift(((BigInteger)lhs), rhs);
  }

  public Object doArithmeticRightShift(final Object lhs, final char rhs) {
    return doArithmeticRightShift(((BigInteger)lhs), rhs);
  }

  public Object doArithmeticRightShift(final Object lhs, final short rhs) {
    return doArithmeticRightShift(((BigInteger)lhs), rhs);
  }

  public Object doArithmeticRightShift(final Object lhs, final int rhs) {
    return doArithmeticRightShift(((BigInteger)lhs), rhs);
  }

  public Object doArithmeticRightShift(final Object lhs, final long rhs) {
    return doArithmeticRightShift(((BigInteger)lhs), rhs);
  }

  public Object doArithmeticRightShift(final Object lhs, final BigInteger rhs) {
    return doArithmeticRightShift(((BigInteger)lhs), rhs);
  }

  public Object doReverseArithmeticRightShift(final byte lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(byte.class).doArithmeticRightShift(lhs, ((BigInteger)rhs));
  }

  public Object doReverseArithmeticRightShift(final char lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(char.class).doArithmeticRightShift(lhs, ((BigInteger)rhs));
  }

  public Object doReverseArithmeticRightShift(final short lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(short.class).doArithmeticRightShift(lhs, ((BigInteger)rhs));
  }

  public Object doReverseArithmeticRightShift(final int lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(int.class).doArithmeticRightShift(lhs, ((BigInteger)rhs));
  }

  public Object doReverseArithmeticRightShift(final long lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(long.class).doArithmeticRightShift(lhs, ((BigInteger)rhs));
  }

  public Object doReverseArithmeticRightShift(final BigInteger lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(BigInteger.class).doArithmeticRightShift(lhs, ((BigInteger)rhs));
  }

  public Object doArithmeticRightShiftEquals(final Object lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseArithmeticRightShiftEquals(((BigInteger)lhs), rhs);
  }

  public Object doArithmeticRightShiftEquals(final BigInteger lhs, final byte rhs) {
    return lhs.shiftRight(rhs);
  }

  public Object doArithmeticRightShiftEquals(final BigInteger lhs, final char rhs) {
    return lhs.shiftRight(rhs);
  }

  public Object doArithmeticRightShiftEquals(final BigInteger lhs, final short rhs) {
    return lhs.shiftRight(rhs);
  }

  public Object doArithmeticRightShiftEquals(final BigInteger lhs, final int rhs) {
    return lhs.shiftRight(rhs);
  }

  public Object doArithmeticRightShiftEquals(final BigInteger lhs, final long rhs) {
    return lhs.shiftRight((int)rhs);
  }

  public Object doArithmeticRightShiftEquals(final BigInteger lhs, final BigInteger rhs) {
    return lhs.shiftRight(rhs.intValue());
  }

  public Object doArithmeticRightShiftEquals(final Object lhs, final byte rhs) {
    return doArithmeticRightShiftEquals(((BigInteger)lhs), rhs);
  }

  public Object doArithmeticRightShiftEquals(final Object lhs, final char rhs) {
    return doArithmeticRightShiftEquals(((BigInteger)lhs), rhs);
  }

  public Object doArithmeticRightShiftEquals(final Object lhs, final short rhs) {
    return doArithmeticRightShiftEquals(((BigInteger)lhs), rhs);
  }

  public Object doArithmeticRightShiftEquals(final Object lhs, final int rhs) {
    return doArithmeticRightShiftEquals(((BigInteger)lhs), rhs);
  }

  public Object doArithmeticRightShiftEquals(final Object lhs, final long rhs) {
    return doArithmeticRightShiftEquals(((BigInteger)lhs), rhs);
  }

  public Object doArithmeticRightShiftEquals(final Object lhs, final BigInteger rhs) {
    return doArithmeticRightShiftEquals(((BigInteger)lhs), rhs);
  }

  public Object doReverseArithmeticRightShiftEquals(final byte lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(byte.class).doArithmeticRightShiftEquals(lhs, ((BigInteger)rhs));
  }

  public Object doReverseArithmeticRightShiftEquals(final char lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(char.class).doArithmeticRightShiftEquals(lhs, ((BigInteger)rhs));
  }

  public Object doReverseArithmeticRightShiftEquals(final short lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(short.class).doArithmeticRightShiftEquals(lhs, ((BigInteger)rhs));
  }

  public Object doReverseArithmeticRightShiftEquals(final int lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(int.class).doArithmeticRightShiftEquals(lhs, ((BigInteger)rhs));
  }

  public Object doReverseArithmeticRightShiftEquals(final long lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(long.class).doArithmeticRightShiftEquals(lhs, ((BigInteger)rhs));
  }

  public Object doReverseArithmeticRightShiftEquals(final BigInteger lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(BigInteger.class).doArithmeticRightShiftEquals(lhs, ((BigInteger)rhs));
  }

  public Object doCompare(final Object lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseCompare(((BigInteger)lhs), rhs);
  }

  public Object doCompare(final BigInteger lhs, final byte rhs) {
    return new NgInt(lhs.compareTo(BigInteger.valueOf(rhs)));
  }

  public Object doCompare(final BigInteger lhs, final char rhs) {
    return new NgInt(lhs.compareTo(BigInteger.valueOf(rhs)));
  }

  public Object doCompare(final BigInteger lhs, final short rhs) {
    return new NgInt(lhs.compareTo(BigInteger.valueOf(rhs)));
  }

  public Object doCompare(final BigInteger lhs, final int rhs) {
    return new NgInt(lhs.compareTo(BigInteger.valueOf(rhs)));
  }

  public Object doCompare(final BigInteger lhs, final long rhs) {
    return new NgInt(lhs.compareTo(BigInteger.valueOf(rhs)));
  }

  public Object doCompare(final BigInteger lhs, final float rhs) {
    return new NgInt(new BigDecimal(lhs).compareTo(new BigDecimal(rhs)));
  }

  public Object doCompare(final BigInteger lhs, final double rhs) {
    return new NgInt(new BigDecimal(lhs).compareTo(new BigDecimal(rhs)));
  }

  public Object doCompare(final BigInteger lhs, final BigInteger rhs) {
    return new NgInt(lhs.compareTo(rhs));
  }

  public Object doCompare(final BigInteger lhs, final BigDecimal rhs) {
    return new NgInt(new BigDecimal(lhs).compareTo(rhs));
  }

  public Object doCompare(final Object lhs, final byte rhs) {
    return doCompare(((BigInteger)lhs), rhs);
  }

  public Object doCompare(final Object lhs, final char rhs) {
    return doCompare(((BigInteger)lhs), rhs);
  }

  public Object doCompare(final Object lhs, final short rhs) {
    return doCompare(((BigInteger)lhs), rhs);
  }

  public Object doCompare(final Object lhs, final int rhs) {
    return doCompare(((BigInteger)lhs), rhs);
  }

  public Object doCompare(final Object lhs, final long rhs) {
    return doCompare(((BigInteger)lhs), rhs);
  }

  public Object doCompare(final Object lhs, final float rhs) {
    return doCompare(((BigInteger)lhs), rhs);
  }

  public Object doCompare(final Object lhs, final double rhs) {
    return doCompare(((BigInteger)lhs), rhs);
  }

  public Object doCompare(final Object lhs, final BigInteger rhs) {
    return doCompare(((BigInteger)lhs), rhs);
  }

  public Object doCompare(final Object lhs, final BigDecimal rhs) {
    return doCompare(((BigInteger)lhs), rhs);
  }

  public Object doReverseCompare(final byte lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(byte.class).doCompare(lhs, ((BigInteger)rhs));
  }

  public Object doReverseCompare(final char lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(char.class).doCompare(lhs, ((BigInteger)rhs));
  }

  public Object doReverseCompare(final short lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(short.class).doCompare(lhs, ((BigInteger)rhs));
  }

  public Object doReverseCompare(final int lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(int.class).doCompare(lhs, ((BigInteger)rhs));
  }

  public Object doReverseCompare(final long lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(long.class).doCompare(lhs, ((BigInteger)rhs));
  }

  public Object doReverseCompare(final float lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(float.class).doCompare(lhs, ((BigInteger)rhs));
  }

  public Object doReverseCompare(final double lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(double.class).doCompare(lhs, ((BigInteger)rhs));
  }

  public Object doReverseCompare(final BigInteger lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(BigInteger.class).doCompare(lhs, ((BigInteger)rhs));
  }

  public Object doReverseCompare(final BigDecimal lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(BigDecimal.class).doCompare(lhs, ((BigInteger)rhs));
  }

  public Object doEquals(final Object lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseEquals(((BigInteger)lhs), rhs);
  }

  public Object doEquals(final BigInteger lhs, final byte rhs) {
    return (lhs.compareTo(BigInteger.valueOf(rhs)) == 0) ? NgBoolean.TRUE : NgBoolean.FALSE;
  }

  public Object doEquals(final BigInteger lhs, final char rhs) {
    return (lhs.compareTo(BigInteger.valueOf(rhs)) == 0) ? NgBoolean.TRUE : NgBoolean.FALSE;
  }

  public Object doEquals(final BigInteger lhs, final short rhs) {
    return (lhs.compareTo(BigInteger.valueOf(rhs)) == 0) ? NgBoolean.TRUE : NgBoolean.FALSE;
  }

  public Object doEquals(final BigInteger lhs, final int rhs) {
    return (lhs.compareTo(BigInteger.valueOf(rhs)) == 0) ? NgBoolean.TRUE : NgBoolean.FALSE;
  }

  public Object doEquals(final BigInteger lhs, final long rhs) {
    return (lhs.compareTo(BigInteger.valueOf(rhs)) == 0) ? NgBoolean.TRUE : NgBoolean.FALSE;
  }

  public Object doEquals(final BigInteger lhs, final float rhs) {
    return (lhs.floatValue() == rhs) ? NgBoolean.TRUE : NgBoolean.FALSE;
  }

  public Object doEquals(final BigInteger lhs, final double rhs) {
    return (lhs.doubleValue() == rhs) ? NgBoolean.TRUE : NgBoolean.FALSE;
  }

  public Object doEquals(final BigInteger lhs, final BigInteger rhs) {
    return (lhs.compareTo(rhs) == 0) ? NgBoolean.TRUE : NgBoolean.FALSE;
  }

  public Object doEquals(final BigInteger lhs, final BigDecimal rhs) {
    return (new BigDecimal(lhs).compareTo(rhs) == 0) ? NgBoolean.TRUE : NgBoolean.FALSE;
  }

  public Object doEquals(final Object lhs, final byte rhs) {
    return doEquals(((BigInteger)lhs), rhs);
  }

  public Object doEquals(final Object lhs, final char rhs) {
    return doEquals(((BigInteger)lhs), rhs);
  }

  public Object doEquals(final Object lhs, final short rhs) {
    return doEquals(((BigInteger)lhs), rhs);
  }

  public Object doEquals(final Object lhs, final int rhs) {
    return doEquals(((BigInteger)lhs), rhs);
  }

  public Object doEquals(final Object lhs, final long rhs) {
    return doEquals(((BigInteger)lhs), rhs);
  }

  public Object doEquals(final Object lhs, final float rhs) {
    return doEquals(((BigInteger)lhs), rhs);
  }

  public Object doEquals(final Object lhs, final double rhs) {
    return doEquals(((BigInteger)lhs), rhs);
  }

  public Object doEquals(final Object lhs, final BigInteger rhs) {
    return doEquals(((BigInteger)lhs), rhs);
  }

  public Object doEquals(final Object lhs, final BigDecimal rhs) {
    return doEquals(((BigInteger)lhs), rhs);
  }

  public Object doReverseEquals(final byte lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(byte.class).doEquals(lhs, ((BigInteger)rhs));
  }

  public Object doReverseEquals(final char lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(char.class).doEquals(lhs, ((BigInteger)rhs));
  }

  public Object doReverseEquals(final short lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(short.class).doEquals(lhs, ((BigInteger)rhs));
  }

  public Object doReverseEquals(final int lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(int.class).doEquals(lhs, ((BigInteger)rhs));
  }

  public Object doReverseEquals(final long lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(long.class).doEquals(lhs, ((BigInteger)rhs));
  }

  public Object doReverseEquals(final float lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(float.class).doEquals(lhs, ((BigInteger)rhs));
  }

  public Object doReverseEquals(final double lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(double.class).doEquals(lhs, ((BigInteger)rhs));
  }

  public Object doReverseEquals(final BigInteger lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(BigInteger.class).doEquals(lhs, ((BigInteger)rhs));
  }

  public Object doReverseEquals(final BigDecimal lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(BigDecimal.class).doEquals(lhs, ((BigInteger)rhs));
  }

  public Object doNotEquals(final Object lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseNotEquals(((BigInteger)lhs), rhs);
  }

  public Object doNotEquals(final BigInteger lhs, final byte rhs) {
    return (lhs.compareTo(BigInteger.valueOf(rhs)) != 0) ? NgBoolean.TRUE : NgBoolean.FALSE;
  }

  public Object doNotEquals(final BigInteger lhs, final char rhs) {
    return (lhs.compareTo(BigInteger.valueOf(rhs)) != 0) ? NgBoolean.TRUE : NgBoolean.FALSE;
  }

  public Object doNotEquals(final BigInteger lhs, final short rhs) {
    return (lhs.compareTo(BigInteger.valueOf(rhs)) != 0) ? NgBoolean.TRUE : NgBoolean.FALSE;
  }

  public Object doNotEquals(final BigInteger lhs, final int rhs) {
    return (lhs.compareTo(BigInteger.valueOf(rhs)) != 0) ? NgBoolean.TRUE : NgBoolean.FALSE;
  }

  public Object doNotEquals(final BigInteger lhs, final long rhs) {
    return (lhs.compareTo(BigInteger.valueOf(rhs)) != 0) ? NgBoolean.TRUE : NgBoolean.FALSE;
  }

  public Object doNotEquals(final BigInteger lhs, final float rhs) {
    return (lhs.floatValue() != rhs) ? NgBoolean.TRUE : NgBoolean.FALSE;
  }

  public Object doNotEquals(final BigInteger lhs, final double rhs) {
    return (lhs.doubleValue() != rhs) ? NgBoolean.TRUE : NgBoolean.FALSE;
  }

  public Object doNotEquals(final BigInteger lhs, final BigInteger rhs) {
    return (lhs.compareTo(rhs) != 0) ? NgBoolean.TRUE : NgBoolean.FALSE;
  }

  public Object doNotEquals(final BigInteger lhs, final BigDecimal rhs) {
    return (new BigDecimal(lhs).compareTo(rhs) != 0) ? NgBoolean.TRUE : NgBoolean.FALSE;
  }

  public Object doNotEquals(final Object lhs, final byte rhs) {
    return doNotEquals(((BigInteger)lhs), rhs);
  }

  public Object doNotEquals(final Object lhs, final char rhs) {
    return doNotEquals(((BigInteger)lhs), rhs);
  }

  public Object doNotEquals(final Object lhs, final short rhs) {
    return doNotEquals(((BigInteger)lhs), rhs);
  }

  public Object doNotEquals(final Object lhs, final int rhs) {
    return doNotEquals(((BigInteger)lhs), rhs);
  }

  public Object doNotEquals(final Object lhs, final long rhs) {
    return doNotEquals(((BigInteger)lhs), rhs);
  }

  public Object doNotEquals(final Object lhs, final float rhs) {
    return doNotEquals(((BigInteger)lhs), rhs);
  }

  public Object doNotEquals(final Object lhs, final double rhs) {
    return doNotEquals(((BigInteger)lhs), rhs);
  }

  public Object doNotEquals(final Object lhs, final BigInteger rhs) {
    return doNotEquals(((BigInteger)lhs), rhs);
  }

  public Object doNotEquals(final Object lhs, final BigDecimal rhs) {
    return doNotEquals(((BigInteger)lhs), rhs);
  }

  public Object doReverseNotEquals(final byte lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(byte.class).doNotEquals(lhs, ((BigInteger)rhs));
  }

  public Object doReverseNotEquals(final char lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(char.class).doNotEquals(lhs, ((BigInteger)rhs));
  }

  public Object doReverseNotEquals(final short lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(short.class).doNotEquals(lhs, ((BigInteger)rhs));
  }

  public Object doReverseNotEquals(final int lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(int.class).doNotEquals(lhs, ((BigInteger)rhs));
  }

  public Object doReverseNotEquals(final long lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(long.class).doNotEquals(lhs, ((BigInteger)rhs));
  }

  public Object doReverseNotEquals(final float lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(float.class).doNotEquals(lhs, ((BigInteger)rhs));
  }

  public Object doReverseNotEquals(final double lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(double.class).doNotEquals(lhs, ((BigInteger)rhs));
  }

  public Object doReverseNotEquals(final BigInteger lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(BigInteger.class).doNotEquals(lhs, ((BigInteger)rhs));
  }

  public Object doReverseNotEquals(final BigDecimal lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(BigDecimal.class).doNotEquals(lhs, ((BigInteger)rhs));
  }

  public Object doLessThan(final Object lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseLessThan(((BigInteger)lhs), rhs);
  }

  public Object doLessThan(final BigInteger lhs, final byte rhs) {
    return (lhs.compareTo(BigInteger.valueOf(rhs)) < 0) ? NgBoolean.TRUE : NgBoolean.FALSE;
  }

  public Object doLessThan(final BigInteger lhs, final char rhs) {
    return (lhs.compareTo(BigInteger.valueOf(rhs)) < 0) ? NgBoolean.TRUE : NgBoolean.FALSE;
  }

  public Object doLessThan(final BigInteger lhs, final short rhs) {
    return (lhs.compareTo(BigInteger.valueOf(rhs)) < 0) ? NgBoolean.TRUE : NgBoolean.FALSE;
  }

  public Object doLessThan(final BigInteger lhs, final int rhs) {
    return (lhs.compareTo(BigInteger.valueOf(rhs)) < 0) ? NgBoolean.TRUE : NgBoolean.FALSE;
  }

  public Object doLessThan(final BigInteger lhs, final long rhs) {
    return (lhs.compareTo(BigInteger.valueOf(rhs)) < 0) ? NgBoolean.TRUE : NgBoolean.FALSE;
  }

  public Object doLessThan(final BigInteger lhs, final float rhs) {
    return (lhs.floatValue() < rhs) ? NgBoolean.TRUE : NgBoolean.FALSE;
  }

  public Object doLessThan(final BigInteger lhs, final double rhs) {
    return (lhs.doubleValue() < rhs) ? NgBoolean.TRUE : NgBoolean.FALSE;
  }

  public Object doLessThan(final BigInteger lhs, final BigInteger rhs) {
    return (lhs.compareTo(rhs) < 0) ? NgBoolean.TRUE : NgBoolean.FALSE;
  }

  public Object doLessThan(final BigInteger lhs, final BigDecimal rhs) {
    return (new BigDecimal(lhs).compareTo(rhs) < 0) ? NgBoolean.TRUE : NgBoolean.FALSE;
  }

  public Object doLessThan(final Object lhs, final byte rhs) {
    return doLessThan(((BigInteger)lhs), rhs);
  }

  public Object doLessThan(final Object lhs, final char rhs) {
    return doLessThan(((BigInteger)lhs), rhs);
  }

  public Object doLessThan(final Object lhs, final short rhs) {
    return doLessThan(((BigInteger)lhs), rhs);
  }

  public Object doLessThan(final Object lhs, final int rhs) {
    return doLessThan(((BigInteger)lhs), rhs);
  }

  public Object doLessThan(final Object lhs, final long rhs) {
    return doLessThan(((BigInteger)lhs), rhs);
  }

  public Object doLessThan(final Object lhs, final float rhs) {
    return doLessThan(((BigInteger)lhs), rhs);
  }

  public Object doLessThan(final Object lhs, final double rhs) {
    return doLessThan(((BigInteger)lhs), rhs);
  }

  public Object doLessThan(final Object lhs, final BigInteger rhs) {
    return doLessThan(((BigInteger)lhs), rhs);
  }

  public Object doLessThan(final Object lhs, final BigDecimal rhs) {
    return doLessThan(((BigInteger)lhs), rhs);
  }

  public Object doReverseLessThan(final byte lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(byte.class).doLessThan(lhs, ((BigInteger)rhs));
  }

  public Object doReverseLessThan(final char lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(char.class).doLessThan(lhs, ((BigInteger)rhs));
  }

  public Object doReverseLessThan(final short lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(short.class).doLessThan(lhs, ((BigInteger)rhs));
  }

  public Object doReverseLessThan(final int lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(int.class).doLessThan(lhs, ((BigInteger)rhs));
  }

  public Object doReverseLessThan(final long lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(long.class).doLessThan(lhs, ((BigInteger)rhs));
  }

  public Object doReverseLessThan(final float lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(float.class).doLessThan(lhs, ((BigInteger)rhs));
  }

  public Object doReverseLessThan(final double lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(double.class).doLessThan(lhs, ((BigInteger)rhs));
  }

  public Object doReverseLessThan(final BigInteger lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(BigInteger.class).doLessThan(lhs, ((BigInteger)rhs));
  }

  public Object doReverseLessThan(final BigDecimal lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(BigDecimal.class).doLessThan(lhs, ((BigInteger)rhs));
  }

  public Object doLessThanOrEquals(final Object lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseLessThanOrEquals(((BigInteger)lhs), rhs);
  }

  public Object doLessThanOrEquals(final BigInteger lhs, final byte rhs) {
    return (lhs.compareTo(BigInteger.valueOf(rhs)) <= 0) ? NgBoolean.TRUE : NgBoolean.FALSE;
  }

  public Object doLessThanOrEquals(final BigInteger lhs, final char rhs) {
    return (lhs.compareTo(BigInteger.valueOf(rhs)) <= 0) ? NgBoolean.TRUE : NgBoolean.FALSE;
  }

  public Object doLessThanOrEquals(final BigInteger lhs, final short rhs) {
    return (lhs.compareTo(BigInteger.valueOf(rhs)) <= 0) ? NgBoolean.TRUE : NgBoolean.FALSE;
  }

  public Object doLessThanOrEquals(final BigInteger lhs, final int rhs) {
    return (lhs.compareTo(BigInteger.valueOf(rhs)) <= 0) ? NgBoolean.TRUE : NgBoolean.FALSE;
  }

  public Object doLessThanOrEquals(final BigInteger lhs, final long rhs) {
    return (lhs.compareTo(BigInteger.valueOf(rhs)) <= 0) ? NgBoolean.TRUE : NgBoolean.FALSE;
  }

  public Object doLessThanOrEquals(final BigInteger lhs, final float rhs) {
    return (lhs.floatValue() <= rhs) ? NgBoolean.TRUE : NgBoolean.FALSE;
  }

  public Object doLessThanOrEquals(final BigInteger lhs, final double rhs) {
    return (lhs.doubleValue() <= rhs) ? NgBoolean.TRUE : NgBoolean.FALSE;
  }

  public Object doLessThanOrEquals(final BigInteger lhs, final BigInteger rhs) {
    return (lhs.compareTo(rhs) <= 0) ? NgBoolean.TRUE : NgBoolean.FALSE;
  }

  public Object doLessThanOrEquals(final BigInteger lhs, final BigDecimal rhs) {
    return (new BigDecimal(lhs).compareTo(rhs) <= 0) ? NgBoolean.TRUE : NgBoolean.FALSE;
  }

  public Object doLessThanOrEquals(final Object lhs, final byte rhs) {
    return doLessThanOrEquals(((BigInteger)lhs), rhs);
  }

  public Object doLessThanOrEquals(final Object lhs, final char rhs) {
    return doLessThanOrEquals(((BigInteger)lhs), rhs);
  }

  public Object doLessThanOrEquals(final Object lhs, final short rhs) {
    return doLessThanOrEquals(((BigInteger)lhs), rhs);
  }

  public Object doLessThanOrEquals(final Object lhs, final int rhs) {
    return doLessThanOrEquals(((BigInteger)lhs), rhs);
  }

  public Object doLessThanOrEquals(final Object lhs, final long rhs) {
    return doLessThanOrEquals(((BigInteger)lhs), rhs);
  }

  public Object doLessThanOrEquals(final Object lhs, final float rhs) {
    return doLessThanOrEquals(((BigInteger)lhs), rhs);
  }

  public Object doLessThanOrEquals(final Object lhs, final double rhs) {
    return doLessThanOrEquals(((BigInteger)lhs), rhs);
  }

  public Object doLessThanOrEquals(final Object lhs, final BigInteger rhs) {
    return doLessThanOrEquals(((BigInteger)lhs), rhs);
  }

  public Object doLessThanOrEquals(final Object lhs, final BigDecimal rhs) {
    return doLessThanOrEquals(((BigInteger)lhs), rhs);
  }

  public Object doReverseLessThanOrEquals(final byte lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(byte.class).doLessThanOrEquals(lhs, ((BigInteger)rhs));
  }

  public Object doReverseLessThanOrEquals(final char lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(char.class).doLessThanOrEquals(lhs, ((BigInteger)rhs));
  }

  public Object doReverseLessThanOrEquals(final short lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(short.class).doLessThanOrEquals(lhs, ((BigInteger)rhs));
  }

  public Object doReverseLessThanOrEquals(final int lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(int.class).doLessThanOrEquals(lhs, ((BigInteger)rhs));
  }

  public Object doReverseLessThanOrEquals(final long lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(long.class).doLessThanOrEquals(lhs, ((BigInteger)rhs));
  }

  public Object doReverseLessThanOrEquals(final float lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(float.class).doLessThanOrEquals(lhs, ((BigInteger)rhs));
  }

  public Object doReverseLessThanOrEquals(final double lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(double.class).doLessThanOrEquals(lhs, ((BigInteger)rhs));
  }

  public Object doReverseLessThanOrEquals(final BigInteger lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(BigInteger.class).doLessThanOrEquals(lhs, ((BigInteger)rhs));
  }

  public Object doReverseLessThanOrEquals(final BigDecimal lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(BigDecimal.class).doLessThanOrEquals(lhs, ((BigInteger)rhs));
  }

  public Object doGreaterThan(final Object lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseGreaterThan(((BigInteger)lhs), rhs);
  }

  public Object doGreaterThan(final BigInteger lhs, final byte rhs) {
    return (lhs.compareTo(BigInteger.valueOf(rhs)) > 0) ? NgBoolean.TRUE : NgBoolean.FALSE;
  }

  public Object doGreaterThan(final BigInteger lhs, final char rhs) {
    return (lhs.compareTo(BigInteger.valueOf(rhs)) > 0) ? NgBoolean.TRUE : NgBoolean.FALSE;
  }

  public Object doGreaterThan(final BigInteger lhs, final short rhs) {
    return (lhs.compareTo(BigInteger.valueOf(rhs)) > 0) ? NgBoolean.TRUE : NgBoolean.FALSE;
  }

  public Object doGreaterThan(final BigInteger lhs, final int rhs) {
    return (lhs.compareTo(BigInteger.valueOf(rhs)) > 0) ? NgBoolean.TRUE : NgBoolean.FALSE;
  }

  public Object doGreaterThan(final BigInteger lhs, final long rhs) {
    return (lhs.compareTo(BigInteger.valueOf(rhs)) > 0) ? NgBoolean.TRUE : NgBoolean.FALSE;
  }

  public Object doGreaterThan(final BigInteger lhs, final float rhs) {
    return (lhs.floatValue() > rhs) ? NgBoolean.TRUE : NgBoolean.FALSE;
  }

  public Object doGreaterThan(final BigInteger lhs, final double rhs) {
    return (lhs.doubleValue() > rhs) ? NgBoolean.TRUE : NgBoolean.FALSE;
  }

  public Object doGreaterThan(final BigInteger lhs, final BigInteger rhs) {
    return (lhs.compareTo(rhs) > 0) ? NgBoolean.TRUE : NgBoolean.FALSE;
  }

  public Object doGreaterThan(final BigInteger lhs, final BigDecimal rhs) {
    return (new BigDecimal(lhs).compareTo(rhs) > 0) ? NgBoolean.TRUE : NgBoolean.FALSE;
  }

  public Object doGreaterThan(final Object lhs, final byte rhs) {
    return doGreaterThan(((BigInteger)lhs), rhs);
  }

  public Object doGreaterThan(final Object lhs, final char rhs) {
    return doGreaterThan(((BigInteger)lhs), rhs);
  }

  public Object doGreaterThan(final Object lhs, final short rhs) {
    return doGreaterThan(((BigInteger)lhs), rhs);
  }

  public Object doGreaterThan(final Object lhs, final int rhs) {
    return doGreaterThan(((BigInteger)lhs), rhs);
  }

  public Object doGreaterThan(final Object lhs, final long rhs) {
    return doGreaterThan(((BigInteger)lhs), rhs);
  }

  public Object doGreaterThan(final Object lhs, final float rhs) {
    return doGreaterThan(((BigInteger)lhs), rhs);
  }

  public Object doGreaterThan(final Object lhs, final double rhs) {
    return doGreaterThan(((BigInteger)lhs), rhs);
  }

  public Object doGreaterThan(final Object lhs, final BigInteger rhs) {
    return doGreaterThan(((BigInteger)lhs), rhs);
  }

  public Object doGreaterThan(final Object lhs, final BigDecimal rhs) {
    return doGreaterThan(((BigInteger)lhs), rhs);
  }

  public Object doReverseGreaterThan(final byte lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(byte.class).doGreaterThan(lhs, ((BigInteger)rhs));
  }

  public Object doReverseGreaterThan(final char lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(char.class).doGreaterThan(lhs, ((BigInteger)rhs));
  }

  public Object doReverseGreaterThan(final short lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(short.class).doGreaterThan(lhs, ((BigInteger)rhs));
  }

  public Object doReverseGreaterThan(final int lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(int.class).doGreaterThan(lhs, ((BigInteger)rhs));
  }

  public Object doReverseGreaterThan(final long lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(long.class).doGreaterThan(lhs, ((BigInteger)rhs));
  }

  public Object doReverseGreaterThan(final float lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(float.class).doGreaterThan(lhs, ((BigInteger)rhs));
  }

  public Object doReverseGreaterThan(final double lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(double.class).doGreaterThan(lhs, ((BigInteger)rhs));
  }

  public Object doReverseGreaterThan(final BigInteger lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(BigInteger.class).doGreaterThan(lhs, ((BigInteger)rhs));
  }

  public Object doReverseGreaterThan(final BigDecimal lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(BigDecimal.class).doGreaterThan(lhs, ((BigInteger)rhs));
  }

  public Object doGreaterThanOrEquals(final Object lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(rhs).doReverseGreaterThanOrEquals(((BigInteger)lhs), rhs);
  }

  public Object doGreaterThanOrEquals(final BigInteger lhs, final byte rhs) {
    return (lhs.compareTo(BigInteger.valueOf(rhs)) >= 0) ? NgBoolean.TRUE : NgBoolean.FALSE;
  }

  public Object doGreaterThanOrEquals(final BigInteger lhs, final char rhs) {
    return (lhs.compareTo(BigInteger.valueOf(rhs)) >= 0) ? NgBoolean.TRUE : NgBoolean.FALSE;
  }

  public Object doGreaterThanOrEquals(final BigInteger lhs, final short rhs) {
    return (lhs.compareTo(BigInteger.valueOf(rhs)) >= 0) ? NgBoolean.TRUE : NgBoolean.FALSE;
  }

  public Object doGreaterThanOrEquals(final BigInteger lhs, final int rhs) {
    return (lhs.compareTo(BigInteger.valueOf(rhs)) >= 0) ? NgBoolean.TRUE : NgBoolean.FALSE;
  }

  public Object doGreaterThanOrEquals(final BigInteger lhs, final long rhs) {
    return (lhs.compareTo(BigInteger.valueOf(rhs)) >= 0) ? NgBoolean.TRUE : NgBoolean.FALSE;
  }

  public Object doGreaterThanOrEquals(final BigInteger lhs, final float rhs) {
    return (lhs.floatValue() >= rhs) ? NgBoolean.TRUE : NgBoolean.FALSE;
  }

  public Object doGreaterThanOrEquals(final BigInteger lhs, final double rhs) {
    return (lhs.doubleValue() >= rhs) ? NgBoolean.TRUE : NgBoolean.FALSE;
  }

  public Object doGreaterThanOrEquals(final BigInteger lhs, final BigInteger rhs) {
    return (lhs.compareTo(rhs) >= 0) ? NgBoolean.TRUE : NgBoolean.FALSE;
  }

  public Object doGreaterThanOrEquals(final BigInteger lhs, final BigDecimal rhs) {
    return (new BigDecimal(lhs).compareTo(rhs) >= 0) ? NgBoolean.TRUE : NgBoolean.FALSE;
  }

  public Object doGreaterThanOrEquals(final Object lhs, final byte rhs) {
    return doGreaterThanOrEquals(((BigInteger)lhs), rhs);
  }

  public Object doGreaterThanOrEquals(final Object lhs, final char rhs) {
    return doGreaterThanOrEquals(((BigInteger)lhs), rhs);
  }

  public Object doGreaterThanOrEquals(final Object lhs, final short rhs) {
    return doGreaterThanOrEquals(((BigInteger)lhs), rhs);
  }

  public Object doGreaterThanOrEquals(final Object lhs, final int rhs) {
    return doGreaterThanOrEquals(((BigInteger)lhs), rhs);
  }

  public Object doGreaterThanOrEquals(final Object lhs, final long rhs) {
    return doGreaterThanOrEquals(((BigInteger)lhs), rhs);
  }

  public Object doGreaterThanOrEquals(final Object lhs, final float rhs) {
    return doGreaterThanOrEquals(((BigInteger)lhs), rhs);
  }

  public Object doGreaterThanOrEquals(final Object lhs, final double rhs) {
    return doGreaterThanOrEquals(((BigInteger)lhs), rhs);
  }

  public Object doGreaterThanOrEquals(final Object lhs, final BigInteger rhs) {
    return doGreaterThanOrEquals(((BigInteger)lhs), rhs);
  }

  public Object doGreaterThanOrEquals(final Object lhs, final BigDecimal rhs) {
    return doGreaterThanOrEquals(((BigInteger)lhs), rhs);
  }

  public Object doReverseGreaterThanOrEquals(final byte lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(byte.class).doGreaterThanOrEquals(lhs, ((BigInteger)rhs));
  }

  public Object doReverseGreaterThanOrEquals(final char lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(char.class).doGreaterThanOrEquals(lhs, ((BigInteger)rhs));
  }

  public Object doReverseGreaterThanOrEquals(final short lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(short.class).doGreaterThanOrEquals(lhs, ((BigInteger)rhs));
  }

  public Object doReverseGreaterThanOrEquals(final int lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(int.class).doGreaterThanOrEquals(lhs, ((BigInteger)rhs));
  }

  public Object doReverseGreaterThanOrEquals(final long lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(long.class).doGreaterThanOrEquals(lhs, ((BigInteger)rhs));
  }

  public Object doReverseGreaterThanOrEquals(final float lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(float.class).doGreaterThanOrEquals(lhs, ((BigInteger)rhs));
  }

  public Object doReverseGreaterThanOrEquals(final double lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(double.class).doGreaterThanOrEquals(lhs, ((BigInteger)rhs));
  }

  public Object doReverseGreaterThanOrEquals(final BigInteger lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(BigInteger.class).doGreaterThanOrEquals(lhs, ((BigInteger)rhs));
  }

  public Object doReverseGreaterThanOrEquals(final BigDecimal lhs, final Object rhs) {
    return NgSystem.metaClassRegistry.getInternalMetaClass(BigDecimal.class).doGreaterThanOrEquals(lhs, ((BigInteger)rhs));
  }

}
