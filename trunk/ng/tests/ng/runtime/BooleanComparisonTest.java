package ng.runtime;

import java.math.BigDecimal;
import java.math.BigInteger;

import ng.runtime.metaclass.MetaClass;
import ng.runtime.threadcontext.BooleanComparison;
import ng.runtime.threadcontext.ThreadContext;
import junit.framework.TestCase;
/*
 * Created on 19 Jan 2008
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
public class BooleanComparisonTest extends TestCase {
  private static void doTest(ThreadContext tc, BooleanComparison op, int lhsTrue[], int rhsTrue[], int lhsFalse[], int rhsFalse[]) {
    final MetaClass byteMetaClass = tc.getMetaClassFor(byte.class);
    final MetaClass charMetaClass = tc.getMetaClassFor(char.class);
    final MetaClass shortMetaClass = tc.getMetaClassFor(short.class);
    final MetaClass intMetaClass = tc.getMetaClassFor(int.class);
    final MetaClass longMetaClass = tc.getMetaClassFor(long.class);
    final MetaClass floatMetaClass = tc.getMetaClassFor(float.class);
    final MetaClass doubleMetaClass = tc.getMetaClassFor(double.class);
    final MetaClass bigIntegerMetaClass = tc.getMetaClassFor(BigInteger.class);
    final MetaClass bigDecimalMetaClass = tc.getMetaClassFor(BigDecimal.class);
    
    for (int i = 0; i != lhsTrue.length; i++) {
      
      assertTrue(tc.unwrapToBoolean(op.apply((byte)lhsTrue[i], (byte)rhsTrue[i])));    
      assertTrue(tc.unwrapToBoolean(op.apply((char)lhsTrue[i], (byte)rhsTrue[i])));    
      assertTrue(tc.unwrapToBoolean(op.apply((short)lhsTrue[i], (byte)rhsTrue[i])));    
      assertTrue(tc.unwrapToBoolean(op.apply((int)lhsTrue[i], (byte)rhsTrue[i])));    
      assertTrue(tc.unwrapToBoolean(op.apply((long)lhsTrue[i], (byte)rhsTrue[i])));    
      assertTrue(tc.unwrapToBoolean(op.apply((float)lhsTrue[i], (byte)rhsTrue[i])));    
      assertTrue(tc.unwrapToBoolean(op.apply((double)lhsTrue[i], (byte)rhsTrue[i])));    
      assertTrue(tc.unwrapToBoolean(op.apply(BigInteger.valueOf(lhsTrue[i]), (byte)rhsTrue[i])));    
      assertTrue(tc.unwrapToBoolean(op.apply(BigDecimal.valueOf(lhsTrue[i]), (byte)rhsTrue[i])));
      
      assertTrue(tc.unwrapToBoolean(op.apply((byte)lhsTrue[i], (char)rhsTrue[i])));    
      assertTrue(tc.unwrapToBoolean(op.apply((char)lhsTrue[i], (char)rhsTrue[i])));    
      assertTrue(tc.unwrapToBoolean(op.apply((short)lhsTrue[i], (char)rhsTrue[i])));    
      assertTrue(tc.unwrapToBoolean(op.apply((int)lhsTrue[i], (char)rhsTrue[i])));    
      assertTrue(tc.unwrapToBoolean(op.apply((long)lhsTrue[i], (char)rhsTrue[i])));    
      assertTrue(tc.unwrapToBoolean(op.apply((float)lhsTrue[i], (char)rhsTrue[i])));    
      assertTrue(tc.unwrapToBoolean(op.apply((double)lhsTrue[i], (char)rhsTrue[i])));    
      assertTrue(tc.unwrapToBoolean(op.apply(BigInteger.valueOf(lhsTrue[i]), (char)rhsTrue[i])));    
      assertTrue(tc.unwrapToBoolean(op.apply(BigDecimal.valueOf(lhsTrue[i]), (char)rhsTrue[i])));
      
      assertTrue(tc.unwrapToBoolean(op.apply((byte)lhsTrue[i], (short)rhsTrue[i])));    
      assertTrue(tc.unwrapToBoolean(op.apply((char)lhsTrue[i], (short)rhsTrue[i])));    
      assertTrue(tc.unwrapToBoolean(op.apply((short)lhsTrue[i], (short)rhsTrue[i])));    
      assertTrue(tc.unwrapToBoolean(op.apply((int)lhsTrue[i], (short)rhsTrue[i])));    
      assertTrue(tc.unwrapToBoolean(op.apply((long)lhsTrue[i], (short)rhsTrue[i])));    
      assertTrue(tc.unwrapToBoolean(op.apply((float)lhsTrue[i], (short)rhsTrue[i])));    
      assertTrue(tc.unwrapToBoolean(op.apply((double)lhsTrue[i], (short)rhsTrue[i])));    
      assertTrue(tc.unwrapToBoolean(op.apply(BigInteger.valueOf(lhsTrue[i]), (short)rhsTrue[i])));    
      assertTrue(tc.unwrapToBoolean(op.apply(BigDecimal.valueOf(lhsTrue[i]), (short)rhsTrue[i])));
      
      assertTrue(tc.unwrapToBoolean(op.apply((byte)lhsTrue[i], (int)rhsTrue[i])));    
      assertTrue(tc.unwrapToBoolean(op.apply((char)lhsTrue[i], (int)rhsTrue[i])));    
      assertTrue(tc.unwrapToBoolean(op.apply((short)lhsTrue[i], (int)rhsTrue[i])));    
      assertTrue(tc.unwrapToBoolean(op.apply((int)lhsTrue[i], (int)rhsTrue[i])));    
      assertTrue(tc.unwrapToBoolean(op.apply((long)lhsTrue[i], (int)rhsTrue[i])));    
      assertTrue(tc.unwrapToBoolean(op.apply((float)lhsTrue[i], (int)rhsTrue[i])));    
      assertTrue(tc.unwrapToBoolean(op.apply((double)lhsTrue[i], (int)rhsTrue[i])));    
      assertTrue(tc.unwrapToBoolean(op.apply(BigInteger.valueOf(lhsTrue[i]), (int)rhsTrue[i])));    
      assertTrue(tc.unwrapToBoolean(op.apply(BigDecimal.valueOf(lhsTrue[i]), (int)rhsTrue[i])));
      
      assertTrue(tc.unwrapToBoolean(op.apply((byte)lhsTrue[i], (long)rhsTrue[i])));    
      assertTrue(tc.unwrapToBoolean(op.apply((char)lhsTrue[i], (long)rhsTrue[i])));    
      assertTrue(tc.unwrapToBoolean(op.apply((short)lhsTrue[i], (long)rhsTrue[i])));    
      assertTrue(tc.unwrapToBoolean(op.apply((int)lhsTrue[i], (long)rhsTrue[i])));    
      assertTrue(tc.unwrapToBoolean(op.apply((long)lhsTrue[i], (long)rhsTrue[i])));    
      assertTrue(tc.unwrapToBoolean(op.apply((float)lhsTrue[i], (long)rhsTrue[i])));    
      assertTrue(tc.unwrapToBoolean(op.apply((double)lhsTrue[i], (long)rhsTrue[i])));    
      assertTrue(tc.unwrapToBoolean(op.apply(BigInteger.valueOf(lhsTrue[i]), (long)rhsTrue[i])));    
      assertTrue(tc.unwrapToBoolean(op.apply(BigDecimal.valueOf(lhsTrue[i]), (long)rhsTrue[i])));
      
      assertTrue(tc.unwrapToBoolean(op.apply((byte)lhsTrue[i], (float)rhsTrue[i])));    
      assertTrue(tc.unwrapToBoolean(op.apply((char)lhsTrue[i], (float)rhsTrue[i])));    
      assertTrue(tc.unwrapToBoolean(op.apply((short)lhsTrue[i], (float)rhsTrue[i])));    
      assertTrue(tc.unwrapToBoolean(op.apply((int)lhsTrue[i], (float)rhsTrue[i])));    
      assertTrue(tc.unwrapToBoolean(op.apply((long)lhsTrue[i], (float)rhsTrue[i])));    
      assertTrue(tc.unwrapToBoolean(op.apply((float)lhsTrue[i], (float)rhsTrue[i])));    
      assertTrue(tc.unwrapToBoolean(op.apply((double)lhsTrue[i], (float)rhsTrue[i])));    
      assertTrue(tc.unwrapToBoolean(op.apply(BigInteger.valueOf(lhsTrue[i]), (float)rhsTrue[i])));    
      assertTrue(tc.unwrapToBoolean(op.apply(BigDecimal.valueOf(lhsTrue[i]), (float)rhsTrue[i])));
      
      assertTrue(tc.unwrapToBoolean(op.apply((byte)lhsTrue[i], (double)rhsTrue[i])));    
      assertTrue(tc.unwrapToBoolean(op.apply((char)lhsTrue[i], (double)rhsTrue[i])));    
      assertTrue(tc.unwrapToBoolean(op.apply((short)lhsTrue[i], (double)rhsTrue[i])));    
      assertTrue(tc.unwrapToBoolean(op.apply((int)lhsTrue[i], (double)rhsTrue[i])));    
      assertTrue(tc.unwrapToBoolean(op.apply((long)lhsTrue[i], (double)rhsTrue[i])));    
      assertTrue(tc.unwrapToBoolean(op.apply((float)lhsTrue[i], (double)rhsTrue[i])));    
      assertTrue(tc.unwrapToBoolean(op.apply((double)lhsTrue[i], (double)rhsTrue[i])));    
      assertTrue(tc.unwrapToBoolean(op.apply(BigInteger.valueOf(lhsTrue[i]), (double)rhsTrue[i])));    
      assertTrue(tc.unwrapToBoolean(op.apply(BigDecimal.valueOf(lhsTrue[i]), (double)rhsTrue[i])));
      
      assertTrue(tc.unwrapToBoolean(op.apply((byte)lhsTrue[i], BigInteger.valueOf(rhsTrue[i]))));    
      assertTrue(tc.unwrapToBoolean(op.apply((char)lhsTrue[i], BigInteger.valueOf(rhsTrue[i]))));    
      assertTrue(tc.unwrapToBoolean(op.apply((short)lhsTrue[i], BigInteger.valueOf(rhsTrue[i]))));    
      assertTrue(tc.unwrapToBoolean(op.apply((int)lhsTrue[i], BigInteger.valueOf(rhsTrue[i]))));    
      assertTrue(tc.unwrapToBoolean(op.apply((long)lhsTrue[i], BigInteger.valueOf(rhsTrue[i]))));    
      assertTrue(tc.unwrapToBoolean(op.apply((float)lhsTrue[i], BigInteger.valueOf(rhsTrue[i]))));    
      assertTrue(tc.unwrapToBoolean(op.apply((double)lhsTrue[i], BigInteger.valueOf(rhsTrue[i]))));    
      assertTrue(tc.unwrapToBoolean(op.apply(BigInteger.valueOf(lhsTrue[i]), BigInteger.valueOf(rhsTrue[i]))));    
      assertTrue(tc.unwrapToBoolean(op.apply(BigDecimal.valueOf(lhsTrue[i]), BigInteger.valueOf(rhsTrue[i]))));
      
      assertTrue(tc.unwrapToBoolean(op.apply((byte)lhsTrue[i], BigDecimal.valueOf(rhsTrue[i]))));    
      assertTrue(tc.unwrapToBoolean(op.apply((char)lhsTrue[i], BigDecimal.valueOf(rhsTrue[i]))));    
      assertTrue(tc.unwrapToBoolean(op.apply((short)lhsTrue[i], BigDecimal.valueOf(rhsTrue[i]))));    
      assertTrue(tc.unwrapToBoolean(op.apply((int)lhsTrue[i], BigDecimal.valueOf(rhsTrue[i]))));    
      assertTrue(tc.unwrapToBoolean(op.apply((long)lhsTrue[i], BigDecimal.valueOf(rhsTrue[i]))));    
      assertTrue(tc.unwrapToBoolean(op.apply((float)lhsTrue[i], BigDecimal.valueOf(rhsTrue[i]))));    
      assertTrue(tc.unwrapToBoolean(op.apply((double)lhsTrue[i], BigDecimal.valueOf(rhsTrue[i]))));    
      assertTrue(tc.unwrapToBoolean(op.apply(BigInteger.valueOf(lhsTrue[i]), BigDecimal.valueOf(rhsTrue[i]))));    
      assertTrue(tc.unwrapToBoolean(op.apply(BigDecimal.valueOf(lhsTrue[i]), BigDecimal.valueOf(rhsTrue[i]))));
      
      assertTrue(tc.unwrapToBoolean(op.apply((byte)lhsTrue[i], NgByte.valueOf((byte)rhsTrue[i]))));    
      assertTrue(tc.unwrapToBoolean(op.apply((char)lhsTrue[i], NgByte.valueOf((byte)rhsTrue[i]))));    
      assertTrue(tc.unwrapToBoolean(op.apply((short)lhsTrue[i], NgByte.valueOf((byte)rhsTrue[i]))));    
      assertTrue(tc.unwrapToBoolean(op.apply((int)lhsTrue[i], NgByte.valueOf((byte)rhsTrue[i]))));    
      assertTrue(tc.unwrapToBoolean(op.apply((long)lhsTrue[i], NgByte.valueOf((byte)rhsTrue[i]))));    
      assertTrue(tc.unwrapToBoolean(op.apply((float)lhsTrue[i], NgByte.valueOf((byte)rhsTrue[i]))));    
      assertTrue(tc.unwrapToBoolean(op.apply((double)lhsTrue[i], NgByte.valueOf((byte)rhsTrue[i]))));    
      assertTrue(tc.unwrapToBoolean(op.apply(BigInteger.valueOf(lhsTrue[i]), NgByte.valueOf((byte)rhsTrue[i]))));    
      assertTrue(tc.unwrapToBoolean(op.apply(BigDecimal.valueOf(lhsTrue[i]), NgByte.valueOf((byte)rhsTrue[i]))));
      
      assertTrue(tc.unwrapToBoolean(op.apply((byte)lhsTrue[i], NgChar.valueOf((char)rhsTrue[i]))));    
      assertTrue(tc.unwrapToBoolean(op.apply((char)lhsTrue[i], NgChar.valueOf((char)rhsTrue[i]))));    
      assertTrue(tc.unwrapToBoolean(op.apply((short)lhsTrue[i], NgChar.valueOf((char)rhsTrue[i]))));    
      assertTrue(tc.unwrapToBoolean(op.apply((int)lhsTrue[i], NgChar.valueOf((char)rhsTrue[i]))));    
      assertTrue(tc.unwrapToBoolean(op.apply((long)lhsTrue[i], NgChar.valueOf((char)rhsTrue[i]))));    
      assertTrue(tc.unwrapToBoolean(op.apply((float)lhsTrue[i], NgChar.valueOf((char)rhsTrue[i]))));    
      assertTrue(tc.unwrapToBoolean(op.apply((double)lhsTrue[i], NgChar.valueOf((char)rhsTrue[i]))));    
      assertTrue(tc.unwrapToBoolean(op.apply(BigInteger.valueOf(lhsTrue[i]), NgChar.valueOf((char)rhsTrue[i]))));    
      assertTrue(tc.unwrapToBoolean(op.apply(BigDecimal.valueOf(lhsTrue[i]), NgChar.valueOf((char)rhsTrue[i]))));
      
      assertTrue(tc.unwrapToBoolean(op.apply((byte)lhsTrue[i], NgShort.valueOf((short)rhsTrue[i]))));    
      assertTrue(tc.unwrapToBoolean(op.apply((char)lhsTrue[i], NgShort.valueOf((short)rhsTrue[i]))));    
      assertTrue(tc.unwrapToBoolean(op.apply((short)lhsTrue[i], NgShort.valueOf((short)rhsTrue[i]))));    
      assertTrue(tc.unwrapToBoolean(op.apply((int)lhsTrue[i], NgShort.valueOf((short)rhsTrue[i]))));    
      assertTrue(tc.unwrapToBoolean(op.apply((long)lhsTrue[i], NgShort.valueOf((short)rhsTrue[i]))));    
      assertTrue(tc.unwrapToBoolean(op.apply((float)lhsTrue[i], NgShort.valueOf((short)rhsTrue[i]))));    
      assertTrue(tc.unwrapToBoolean(op.apply((double)lhsTrue[i], NgShort.valueOf((short)rhsTrue[i]))));    
      assertTrue(tc.unwrapToBoolean(op.apply(BigInteger.valueOf(lhsTrue[i]), NgShort.valueOf((short)rhsTrue[i]))));    
      assertTrue(tc.unwrapToBoolean(op.apply(BigDecimal.valueOf(lhsTrue[i]), NgShort.valueOf((short)rhsTrue[i]))));
      
      assertTrue(tc.unwrapToBoolean(op.apply((byte)lhsTrue[i], NgInt.valueOf((int)rhsTrue[i]))));    
      assertTrue(tc.unwrapToBoolean(op.apply((char)lhsTrue[i], NgInt.valueOf((int)rhsTrue[i]))));    
      assertTrue(tc.unwrapToBoolean(op.apply((short)lhsTrue[i], NgInt.valueOf((int)rhsTrue[i]))));    
      assertTrue(tc.unwrapToBoolean(op.apply((int)lhsTrue[i], NgInt.valueOf((int)rhsTrue[i]))));    
      assertTrue(tc.unwrapToBoolean(op.apply((long)lhsTrue[i], NgInt.valueOf((int)rhsTrue[i]))));    
      assertTrue(tc.unwrapToBoolean(op.apply((float)lhsTrue[i], NgInt.valueOf((int)rhsTrue[i]))));    
      assertTrue(tc.unwrapToBoolean(op.apply((double)lhsTrue[i], NgInt.valueOf((int)rhsTrue[i]))));    
      assertTrue(tc.unwrapToBoolean(op.apply(BigInteger.valueOf(lhsTrue[i]), NgInt.valueOf((int)rhsTrue[i]))));    
      assertTrue(tc.unwrapToBoolean(op.apply(BigDecimal.valueOf(lhsTrue[i]), NgInt.valueOf((int)rhsTrue[i]))));
      
      assertTrue(tc.unwrapToBoolean(op.apply((byte)lhsTrue[i], NgLong.valueOf((long)rhsTrue[i]))));    
      assertTrue(tc.unwrapToBoolean(op.apply((char)lhsTrue[i], NgLong.valueOf((long)rhsTrue[i]))));    
      assertTrue(tc.unwrapToBoolean(op.apply((short)lhsTrue[i], NgLong.valueOf((long)rhsTrue[i]))));    
      assertTrue(tc.unwrapToBoolean(op.apply((int)lhsTrue[i], NgLong.valueOf((long)rhsTrue[i]))));    
      assertTrue(tc.unwrapToBoolean(op.apply((long)lhsTrue[i], NgLong.valueOf((long)rhsTrue[i]))));    
      assertTrue(tc.unwrapToBoolean(op.apply((float)lhsTrue[i], NgLong.valueOf((long)rhsTrue[i]))));    
      assertTrue(tc.unwrapToBoolean(op.apply((double)lhsTrue[i], NgLong.valueOf((long)rhsTrue[i]))));    
      assertTrue(tc.unwrapToBoolean(op.apply(BigInteger.valueOf(lhsTrue[i]), NgLong.valueOf((long)rhsTrue[i]))));    
      assertTrue(tc.unwrapToBoolean(op.apply(BigDecimal.valueOf(lhsTrue[i]), NgLong.valueOf((long)rhsTrue[i]))));
      
      assertTrue(tc.unwrapToBoolean(op.apply((byte)lhsTrue[i], NgFloat.valueOf((float)rhsTrue[i]))));    
      assertTrue(tc.unwrapToBoolean(op.apply((char)lhsTrue[i], NgFloat.valueOf((float)rhsTrue[i]))));    
      assertTrue(tc.unwrapToBoolean(op.apply((short)lhsTrue[i], NgFloat.valueOf((float)rhsTrue[i]))));    
      assertTrue(tc.unwrapToBoolean(op.apply((int)lhsTrue[i], NgFloat.valueOf((float)rhsTrue[i]))));    
      assertTrue(tc.unwrapToBoolean(op.apply((long)lhsTrue[i], NgFloat.valueOf((float)rhsTrue[i]))));    
      assertTrue(tc.unwrapToBoolean(op.apply((float)lhsTrue[i], NgFloat.valueOf((float)rhsTrue[i]))));    
      assertTrue(tc.unwrapToBoolean(op.apply((double)lhsTrue[i], NgFloat.valueOf((float)rhsTrue[i]))));    
      assertTrue(tc.unwrapToBoolean(op.apply(BigInteger.valueOf(lhsTrue[i]), NgFloat.valueOf((float)rhsTrue[i]))));    
      assertTrue(tc.unwrapToBoolean(op.apply(BigDecimal.valueOf(lhsTrue[i]), NgFloat.valueOf((float)rhsTrue[i]))));
      
      assertTrue(tc.unwrapToBoolean(op.apply((byte)lhsTrue[i], NgDouble.valueOf((double)rhsTrue[i]))));    
      assertTrue(tc.unwrapToBoolean(op.apply((char)lhsTrue[i], NgDouble.valueOf((double)rhsTrue[i]))));    
      assertTrue(tc.unwrapToBoolean(op.apply((short)lhsTrue[i], NgDouble.valueOf((double)rhsTrue[i]))));    
      assertTrue(tc.unwrapToBoolean(op.apply((int)lhsTrue[i], NgDouble.valueOf((double)rhsTrue[i]))));    
      assertTrue(tc.unwrapToBoolean(op.apply((long)lhsTrue[i], NgDouble.valueOf((double)rhsTrue[i]))));    
      assertTrue(tc.unwrapToBoolean(op.apply((float)lhsTrue[i], NgDouble.valueOf((double)rhsTrue[i]))));    
      assertTrue(tc.unwrapToBoolean(op.apply((double)lhsTrue[i], NgDouble.valueOf((double)rhsTrue[i]))));    
      assertTrue(tc.unwrapToBoolean(op.apply(BigInteger.valueOf(lhsTrue[i]), NgDouble.valueOf((double)rhsTrue[i]))));    
      assertTrue(tc.unwrapToBoolean(op.apply(BigDecimal.valueOf(lhsTrue[i]), NgDouble.valueOf((double)rhsTrue[i]))));
      
      assertTrue(tc.unwrapToBoolean(op.apply(NgByte.valueOf((byte)lhsTrue[i]), NgByte.valueOf((byte)rhsTrue[i]))));    
      assertTrue(tc.unwrapToBoolean(op.apply(NgChar.valueOf((char)lhsTrue[i]), NgByte.valueOf((byte)rhsTrue[i]))));    
      assertTrue(tc.unwrapToBoolean(op.apply(NgShort.valueOf((short)lhsTrue[i]), NgByte.valueOf((byte)rhsTrue[i]))));    
      assertTrue(tc.unwrapToBoolean(op.apply(NgInt.valueOf((int)lhsTrue[i]), NgByte.valueOf((byte)rhsTrue[i]))));    
      assertTrue(tc.unwrapToBoolean(op.apply(NgLong.valueOf((long)lhsTrue[i]), NgByte.valueOf((byte)rhsTrue[i]))));    
      assertTrue(tc.unwrapToBoolean(op.apply(NgFloat.valueOf((float)lhsTrue[i]), NgByte.valueOf((byte)rhsTrue[i]))));    
      assertTrue(tc.unwrapToBoolean(op.apply(NgDouble.valueOf((double)lhsTrue[i]), NgByte.valueOf((byte)rhsTrue[i]))));    
      assertTrue(tc.unwrapToBoolean(op.apply(BigInteger.valueOf(lhsTrue[i]), NgByte.valueOf((byte)rhsTrue[i]))));    
      assertTrue(tc.unwrapToBoolean(op.apply(BigDecimal.valueOf(lhsTrue[i]), NgByte.valueOf((byte)rhsTrue[i]))));
      
      assertTrue(tc.unwrapToBoolean(op.apply(NgByte.valueOf((byte)lhsTrue[i]), NgChar.valueOf((char)rhsTrue[i]))));    
      assertTrue(tc.unwrapToBoolean(op.apply(NgChar.valueOf((char)lhsTrue[i]), NgChar.valueOf((char)rhsTrue[i]))));    
      assertTrue(tc.unwrapToBoolean(op.apply(NgShort.valueOf((short)lhsTrue[i]), NgChar.valueOf((char)rhsTrue[i]))));    
      assertTrue(tc.unwrapToBoolean(op.apply(NgInt.valueOf((int)lhsTrue[i]), NgChar.valueOf((char)rhsTrue[i]))));    
      assertTrue(tc.unwrapToBoolean(op.apply(NgLong.valueOf((long)lhsTrue[i]), NgChar.valueOf((char)rhsTrue[i]))));    
      assertTrue(tc.unwrapToBoolean(op.apply(NgFloat.valueOf((float)lhsTrue[i]), NgChar.valueOf((char)rhsTrue[i]))));    
      assertTrue(tc.unwrapToBoolean(op.apply(NgDouble.valueOf((double)lhsTrue[i]), NgChar.valueOf((char)rhsTrue[i]))));    
      assertTrue(tc.unwrapToBoolean(op.apply(BigInteger.valueOf(lhsTrue[i]), NgChar.valueOf((char)rhsTrue[i]))));    
      assertTrue(tc.unwrapToBoolean(op.apply(BigDecimal.valueOf(lhsTrue[i]), NgChar.valueOf((char)rhsTrue[i]))));
      
      assertTrue(tc.unwrapToBoolean(op.apply(NgByte.valueOf((byte)lhsTrue[i]), NgShort.valueOf((short)rhsTrue[i]))));    
      assertTrue(tc.unwrapToBoolean(op.apply(NgChar.valueOf((char)lhsTrue[i]), NgShort.valueOf((short)rhsTrue[i]))));    
      assertTrue(tc.unwrapToBoolean(op.apply(NgShort.valueOf((short)lhsTrue[i]), NgShort.valueOf((short)rhsTrue[i]))));    
      assertTrue(tc.unwrapToBoolean(op.apply(NgInt.valueOf((int)lhsTrue[i]), NgShort.valueOf((short)rhsTrue[i]))));    
      assertTrue(tc.unwrapToBoolean(op.apply(NgLong.valueOf((long)lhsTrue[i]), NgShort.valueOf((short)rhsTrue[i]))));    
      assertTrue(tc.unwrapToBoolean(op.apply(NgFloat.valueOf((float)lhsTrue[i]), NgShort.valueOf((short)rhsTrue[i]))));    
      assertTrue(tc.unwrapToBoolean(op.apply(NgDouble.valueOf((double)lhsTrue[i]), NgShort.valueOf((short)rhsTrue[i]))));    
      assertTrue(tc.unwrapToBoolean(op.apply(BigInteger.valueOf(lhsTrue[i]), NgShort.valueOf((short)rhsTrue[i]))));    
      assertTrue(tc.unwrapToBoolean(op.apply(BigDecimal.valueOf(lhsTrue[i]), NgShort.valueOf((short)rhsTrue[i]))));
      
      assertTrue(tc.unwrapToBoolean(op.apply(NgByte.valueOf((byte)lhsTrue[i]), NgInt.valueOf((int)rhsTrue[i]))));    
      assertTrue(tc.unwrapToBoolean(op.apply(NgChar.valueOf((char)lhsTrue[i]), NgInt.valueOf((int)rhsTrue[i]))));    
      assertTrue(tc.unwrapToBoolean(op.apply(NgShort.valueOf((short)lhsTrue[i]), NgInt.valueOf((int)rhsTrue[i]))));    
      assertTrue(tc.unwrapToBoolean(op.apply(NgInt.valueOf((int)lhsTrue[i]), NgInt.valueOf((int)rhsTrue[i]))));    
      assertTrue(tc.unwrapToBoolean(op.apply(NgLong.valueOf((long)lhsTrue[i]), NgInt.valueOf((int)rhsTrue[i]))));    
      assertTrue(tc.unwrapToBoolean(op.apply(NgFloat.valueOf((float)lhsTrue[i]), NgInt.valueOf((int)rhsTrue[i]))));    
      assertTrue(tc.unwrapToBoolean(op.apply(NgDouble.valueOf((double)lhsTrue[i]), NgInt.valueOf((int)rhsTrue[i]))));    
      assertTrue(tc.unwrapToBoolean(op.apply(BigInteger.valueOf(lhsTrue[i]), NgInt.valueOf((int)rhsTrue[i]))));    
      assertTrue(tc.unwrapToBoolean(op.apply(BigDecimal.valueOf(lhsTrue[i]), NgInt.valueOf((int)rhsTrue[i]))));
      
      assertTrue(tc.unwrapToBoolean(op.apply(NgByte.valueOf((byte)lhsTrue[i]), NgLong.valueOf((long)rhsTrue[i]))));    
      assertTrue(tc.unwrapToBoolean(op.apply(NgChar.valueOf((char)lhsTrue[i]), NgLong.valueOf((long)rhsTrue[i]))));    
      assertTrue(tc.unwrapToBoolean(op.apply(NgShort.valueOf((short)lhsTrue[i]), NgLong.valueOf((long)rhsTrue[i]))));    
      assertTrue(tc.unwrapToBoolean(op.apply(NgInt.valueOf((int)lhsTrue[i]), NgLong.valueOf((long)rhsTrue[i]))));    
      assertTrue(tc.unwrapToBoolean(op.apply(NgLong.valueOf((long)lhsTrue[i]), NgLong.valueOf((long)rhsTrue[i]))));    
      assertTrue(tc.unwrapToBoolean(op.apply(NgFloat.valueOf((float)lhsTrue[i]), NgLong.valueOf((long)rhsTrue[i]))));    
      assertTrue(tc.unwrapToBoolean(op.apply(NgDouble.valueOf((double)lhsTrue[i]), NgLong.valueOf((long)rhsTrue[i]))));    
      assertTrue(tc.unwrapToBoolean(op.apply(BigInteger.valueOf(lhsTrue[i]), NgLong.valueOf((long)rhsTrue[i]))));    
      assertTrue(tc.unwrapToBoolean(op.apply(BigDecimal.valueOf(lhsTrue[i]), NgLong.valueOf((long)rhsTrue[i]))));
      
      assertTrue(tc.unwrapToBoolean(op.apply(NgByte.valueOf((byte)lhsTrue[i]), NgFloat.valueOf((float)rhsTrue[i]))));    
      assertTrue(tc.unwrapToBoolean(op.apply(NgChar.valueOf((char)lhsTrue[i]), NgFloat.valueOf((float)rhsTrue[i]))));    
      assertTrue(tc.unwrapToBoolean(op.apply(NgShort.valueOf((short)lhsTrue[i]), NgFloat.valueOf((float)rhsTrue[i]))));    
      assertTrue(tc.unwrapToBoolean(op.apply(NgInt.valueOf((int)lhsTrue[i]), NgFloat.valueOf((float)rhsTrue[i]))));    
      assertTrue(tc.unwrapToBoolean(op.apply(NgLong.valueOf((long)lhsTrue[i]), NgFloat.valueOf((float)rhsTrue[i]))));    
      assertTrue(tc.unwrapToBoolean(op.apply(NgFloat.valueOf((float)lhsTrue[i]), NgFloat.valueOf((float)rhsTrue[i]))));    
      assertTrue(tc.unwrapToBoolean(op.apply(NgDouble.valueOf((double)lhsTrue[i]), NgFloat.valueOf((float)rhsTrue[i]))));    
      assertTrue(tc.unwrapToBoolean(op.apply(BigInteger.valueOf(lhsTrue[i]), NgFloat.valueOf((float)rhsTrue[i]))));    
      assertTrue(tc.unwrapToBoolean(op.apply(BigDecimal.valueOf(lhsTrue[i]), NgFloat.valueOf((float)rhsTrue[i]))));
      
      assertTrue(tc.unwrapToBoolean(op.apply(NgByte.valueOf((byte)lhsTrue[i]), NgDouble.valueOf((double)rhsTrue[i]))));    
      assertTrue(tc.unwrapToBoolean(op.apply(NgChar.valueOf((char)lhsTrue[i]), NgDouble.valueOf((double)rhsTrue[i]))));    
      assertTrue(tc.unwrapToBoolean(op.apply(NgShort.valueOf((short)lhsTrue[i]), NgDouble.valueOf((double)rhsTrue[i]))));    
      assertTrue(tc.unwrapToBoolean(op.apply(NgInt.valueOf((int)lhsTrue[i]), NgDouble.valueOf((double)rhsTrue[i]))));    
      assertTrue(tc.unwrapToBoolean(op.apply(NgLong.valueOf((long)lhsTrue[i]), NgDouble.valueOf((double)rhsTrue[i]))));    
      assertTrue(tc.unwrapToBoolean(op.apply(NgFloat.valueOf((float)lhsTrue[i]), NgDouble.valueOf((double)rhsTrue[i]))));    
      assertTrue(tc.unwrapToBoolean(op.apply(NgDouble.valueOf((double)lhsTrue[i]), NgDouble.valueOf((double)rhsTrue[i]))));    
      assertTrue(tc.unwrapToBoolean(op.apply(BigInteger.valueOf(lhsTrue[i]), NgDouble.valueOf((double)rhsTrue[i]))));    
      assertTrue(tc.unwrapToBoolean(op.apply(BigDecimal.valueOf(lhsTrue[i]), NgDouble.valueOf((double)rhsTrue[i]))));
      
      assertTrue(tc.unwrapToBoolean(op.apply(NgByte.valueOf((byte)lhsTrue[i]), BigInteger.valueOf(rhsTrue[i]))));    
      assertTrue(tc.unwrapToBoolean(op.apply(NgChar.valueOf((char)lhsTrue[i]), BigInteger.valueOf(rhsTrue[i]))));    
      assertTrue(tc.unwrapToBoolean(op.apply(NgShort.valueOf((short)lhsTrue[i]), BigInteger.valueOf(rhsTrue[i]))));    
      assertTrue(tc.unwrapToBoolean(op.apply(NgInt.valueOf((int)lhsTrue[i]), BigInteger.valueOf(rhsTrue[i]))));    
      assertTrue(tc.unwrapToBoolean(op.apply(NgLong.valueOf((long)lhsTrue[i]), BigInteger.valueOf(rhsTrue[i]))));    
      assertTrue(tc.unwrapToBoolean(op.apply(NgFloat.valueOf((float)lhsTrue[i]), BigInteger.valueOf(rhsTrue[i]))));    
      assertTrue(tc.unwrapToBoolean(op.apply(NgDouble.valueOf((double)lhsTrue[i]), BigInteger.valueOf(rhsTrue[i]))));    
      assertTrue(tc.unwrapToBoolean(op.apply(BigInteger.valueOf(lhsTrue[i]), BigInteger.valueOf(rhsTrue[i]))));    
      assertTrue(tc.unwrapToBoolean(op.apply(BigDecimal.valueOf(lhsTrue[i]), BigInteger.valueOf(rhsTrue[i]))));
      
      assertTrue(tc.unwrapToBoolean(op.apply(NgByte.valueOf((byte)lhsTrue[i]), BigDecimal.valueOf(rhsTrue[i]))));    
      assertTrue(tc.unwrapToBoolean(op.apply(NgChar.valueOf((char)lhsTrue[i]), BigDecimal.valueOf(rhsTrue[i]))));    
      assertTrue(tc.unwrapToBoolean(op.apply(NgShort.valueOf((short)lhsTrue[i]), BigDecimal.valueOf(rhsTrue[i]))));    
      assertTrue(tc.unwrapToBoolean(op.apply(NgInt.valueOf((int)lhsTrue[i]), BigDecimal.valueOf(rhsTrue[i]))));    
      assertTrue(tc.unwrapToBoolean(op.apply(NgLong.valueOf((long)lhsTrue[i]), BigDecimal.valueOf(rhsTrue[i]))));    
      assertTrue(tc.unwrapToBoolean(op.apply(NgFloat.valueOf((float)lhsTrue[i]), BigDecimal.valueOf(rhsTrue[i]))));    
      assertTrue(tc.unwrapToBoolean(op.apply(NgDouble.valueOf((double)lhsTrue[i]), BigDecimal.valueOf(rhsTrue[i]))));    
      assertTrue(tc.unwrapToBoolean(op.apply(BigInteger.valueOf(lhsTrue[i]), BigDecimal.valueOf(rhsTrue[i]))));    
      assertTrue(tc.unwrapToBoolean(op.apply(BigDecimal.valueOf(lhsTrue[i]), BigDecimal.valueOf(rhsTrue[i]))));
    }
    

  }
  
  public void testEquals() throws Throwable {
    final ThreadContext tc = ThreadContext.getThreadContext();
    doTest(tc, tc.equals(), new int[]{1}, new int[]{1}, new int[]{1}, new int[]{0});
  }
  
  public void testNotEquals() throws Throwable {
    final ThreadContext tc = ThreadContext.getThreadContext();
    doTest(tc, tc.notEquals(), new int[]{1}, new int[]{0}, new int[]{1}, new int[]{1});
  }
  
  public void testLessThan() throws Throwable {
    final ThreadContext tc = ThreadContext.getThreadContext();
    doTest(tc, tc.lessThan(), new int[]{0}, new int[]{1}, new int[]{1, 1}, new int[]{0, 1});
  }
  
  public void testLessThanOrEquals() throws Throwable {
    final ThreadContext tc = ThreadContext.getThreadContext();
    doTest(tc, tc.lessThanOrEquals(), new int[]{0, 1}, new int[]{1, 1}, new int[]{1}, new int[]{0});
  }
  
  public void testGreaterThan() throws Throwable {
    final ThreadContext tc = ThreadContext.getThreadContext();
    doTest(tc, tc.greaterThan(), new int[]{1}, new int[]{0}, new int[]{0, 1}, new int[]{1, 1});
  }
  
  public void testGreaterThanOrEquals() throws Throwable {
    final ThreadContext tc = ThreadContext.getThreadContext();
    doTest(tc, tc.greaterThanOrEquals(), new int[]{1, 1}, new int[]{0, 1}, new int[]{0}, new int[]{1});
  }
}
