package ng.runtime;

import java.math.BigDecimal;
import java.math.BigInteger;


import junit.framework.TestCase;
import ng.runtime.metaclass.MetaClass;
import ng.runtime.threadcontext.ExtendedThreadContext;
import ng.runtime.threadcontext.IntegerComparison;
import ng.runtime.threadcontext.ThreadContext;

/**
 * @author John
 *
 */
public class IntegerComparisonTest extends TestCase {
  private static void doTest(final ExtendedThreadContext tc, final IntegerComparison op, final int lhsEqual[], final int rhsEqual[], final int lhsLessThan[], final int rhsLessThan[], final int lhsGreaterThan[], final int rhsGreaterThan[]) {
    final MetaClass byteMetaClass = tc.getMetaClassFor(byte.class);
    final MetaClass charMetaClass = tc.getMetaClassFor(char.class);
    final MetaClass shortMetaClass = tc.getMetaClassFor(short.class);
    final MetaClass intMetaClass = tc.getMetaClassFor(int.class);
    final MetaClass longMetaClass = tc.getMetaClassFor(long.class);
    final MetaClass floatMetaClass = tc.getMetaClassFor(float.class);
    final MetaClass doubleMetaClass = tc.getMetaClassFor(double.class);
    final MetaClass bigIntegerMetaClass = tc.getMetaClassFor(BigInteger.class);
    final MetaClass bigDecimalMetaClass = tc.getMetaClassFor(BigDecimal.class);

    for (int i = 0; i != lhsEqual.length; i++) {

      assertTrue(tc.unwrapToInt(op.apply((byte)lhsEqual[i], (byte)rhsEqual[i])) == 0);
      assertTrue(tc.unwrapToInt(op.apply((char)lhsEqual[i], (byte)rhsEqual[i])) == 0);
      assertTrue(tc.unwrapToInt(op.apply((short)lhsEqual[i], (byte)rhsEqual[i])) == 0);
      assertTrue(tc.unwrapToInt(op.apply(lhsEqual[i], (byte)rhsEqual[i])) == 0);
      assertTrue(tc.unwrapToInt(op.apply((long)lhsEqual[i], (byte)rhsEqual[i])) == 0);
      assertTrue(tc.unwrapToInt(op.apply((float)lhsEqual[i], (byte)rhsEqual[i])) == 0);
      assertTrue(tc.unwrapToInt(op.apply((double)lhsEqual[i], (byte)rhsEqual[i])) == 0);
      assertTrue(tc.unwrapToInt(op.apply(BigInteger.valueOf(lhsEqual[i]), (byte)rhsEqual[i])) == 0);
      assertTrue(tc.unwrapToInt(op.apply(BigDecimal.valueOf(lhsEqual[i]), (byte)rhsEqual[i])) == 0);

      assertTrue(tc.unwrapToInt(op.apply((byte)lhsEqual[i], (char)rhsEqual[i])) == 0);
      assertTrue(tc.unwrapToInt(op.apply((char)lhsEqual[i], (char)rhsEqual[i])) == 0);
      assertTrue(tc.unwrapToInt(op.apply((short)lhsEqual[i], (char)rhsEqual[i])) == 0);
      assertTrue(tc.unwrapToInt(op.apply(lhsEqual[i], (char)rhsEqual[i])) == 0);
      assertTrue(tc.unwrapToInt(op.apply((long)lhsEqual[i], (char)rhsEqual[i])) == 0);
      assertTrue(tc.unwrapToInt(op.apply((float)lhsEqual[i], (char)rhsEqual[i])) == 0);
      assertTrue(tc.unwrapToInt(op.apply((double)lhsEqual[i], (char)rhsEqual[i])) == 0);
      assertTrue(tc.unwrapToInt(op.apply(BigInteger.valueOf(lhsEqual[i]), (char)rhsEqual[i])) == 0);
      assertTrue(tc.unwrapToInt(op.apply(BigDecimal.valueOf(lhsEqual[i]), (char)rhsEqual[i])) == 0);

      assertTrue(tc.unwrapToInt(op.apply((byte)lhsEqual[i], (short)rhsEqual[i])) == 0);
      assertTrue(tc.unwrapToInt(op.apply((char)lhsEqual[i], (short)rhsEqual[i])) == 0);
      assertTrue(tc.unwrapToInt(op.apply((short)lhsEqual[i], (short)rhsEqual[i])) == 0);
      assertTrue(tc.unwrapToInt(op.apply(lhsEqual[i], (short)rhsEqual[i])) == 0);
      assertTrue(tc.unwrapToInt(op.apply((long)lhsEqual[i], (short)rhsEqual[i])) == 0);
      assertTrue(tc.unwrapToInt(op.apply((float)lhsEqual[i], (short)rhsEqual[i])) == 0);
      assertTrue(tc.unwrapToInt(op.apply((double)lhsEqual[i], (short)rhsEqual[i])) == 0);
      assertTrue(tc.unwrapToInt(op.apply(BigInteger.valueOf(lhsEqual[i]), (short)rhsEqual[i])) == 0);
      assertTrue(tc.unwrapToInt(op.apply(BigDecimal.valueOf(lhsEqual[i]), (short)rhsEqual[i])) == 0);

      assertTrue(tc.unwrapToInt(op.apply((byte)lhsEqual[i], rhsEqual[i])) == 0);
      assertTrue(tc.unwrapToInt(op.apply((char)lhsEqual[i], rhsEqual[i])) == 0);
      assertTrue(tc.unwrapToInt(op.apply((short)lhsEqual[i], rhsEqual[i])) == 0);
      assertTrue(tc.unwrapToInt(op.apply(lhsEqual[i], rhsEqual[i])) == 0);
      assertTrue(tc.unwrapToInt(op.apply((long)lhsEqual[i], rhsEqual[i])) == 0);
      assertTrue(tc.unwrapToInt(op.apply((float)lhsEqual[i], rhsEqual[i])) == 0);
      assertTrue(tc.unwrapToInt(op.apply((double)lhsEqual[i], rhsEqual[i])) == 0);
      assertTrue(tc.unwrapToInt(op.apply(BigInteger.valueOf(lhsEqual[i]), rhsEqual[i])) == 0);
      assertTrue(tc.unwrapToInt(op.apply(BigDecimal.valueOf(lhsEqual[i]), rhsEqual[i])) == 0);

      assertTrue(tc.unwrapToInt(op.apply((byte)lhsEqual[i], (long)rhsEqual[i])) == 0);
      assertTrue(tc.unwrapToInt(op.apply((char)lhsEqual[i], (long)rhsEqual[i])) == 0);
      assertTrue(tc.unwrapToInt(op.apply((short)lhsEqual[i], (long)rhsEqual[i])) == 0);
      assertTrue(tc.unwrapToInt(op.apply(lhsEqual[i], (long)rhsEqual[i])) == 0);
      assertTrue(tc.unwrapToInt(op.apply((long)lhsEqual[i], (long)rhsEqual[i])) == 0);
      assertTrue(tc.unwrapToInt(op.apply((float)lhsEqual[i], (long)rhsEqual[i])) == 0);
      assertTrue(tc.unwrapToInt(op.apply((double)lhsEqual[i], (long)rhsEqual[i])) == 0);
      assertTrue(tc.unwrapToInt(op.apply(BigInteger.valueOf(lhsEqual[i]), (long)rhsEqual[i])) == 0);
      assertTrue(tc.unwrapToInt(op.apply(BigDecimal.valueOf(lhsEqual[i]), (long)rhsEqual[i])) == 0);

      assertTrue(tc.unwrapToInt(op.apply((byte)lhsEqual[i], (float)rhsEqual[i])) == 0);
      assertTrue(tc.unwrapToInt(op.apply((char)lhsEqual[i], (float)rhsEqual[i])) == 0);
      assertTrue(tc.unwrapToInt(op.apply((short)lhsEqual[i], (float)rhsEqual[i])) == 0);
      assertTrue(tc.unwrapToInt(op.apply(lhsEqual[i], (float)rhsEqual[i])) == 0);
      assertTrue(tc.unwrapToInt(op.apply((long)lhsEqual[i], (float)rhsEqual[i])) == 0);
      assertTrue(tc.unwrapToInt(op.apply((float)lhsEqual[i], (float)rhsEqual[i])) == 0);
      assertTrue(tc.unwrapToInt(op.apply((double)lhsEqual[i], (float)rhsEqual[i])) == 0);
      assertTrue(tc.unwrapToInt(op.apply(BigInteger.valueOf(lhsEqual[i]), (float)rhsEqual[i])) == 0);
      assertTrue(tc.unwrapToInt(op.apply(BigDecimal.valueOf(lhsEqual[i]), (float)rhsEqual[i])) == 0);

      assertTrue(tc.unwrapToInt(op.apply((byte)lhsEqual[i], (double)rhsEqual[i])) == 0);
      assertTrue(tc.unwrapToInt(op.apply((char)lhsEqual[i], (double)rhsEqual[i])) == 0);
      assertTrue(tc.unwrapToInt(op.apply((short)lhsEqual[i], (double)rhsEqual[i])) == 0);
      assertTrue(tc.unwrapToInt(op.apply(lhsEqual[i], (double)rhsEqual[i])) == 0);
      assertTrue(tc.unwrapToInt(op.apply((long)lhsEqual[i], (double)rhsEqual[i])) == 0);
      assertTrue(tc.unwrapToInt(op.apply((float)lhsEqual[i], (double)rhsEqual[i])) == 0);
      assertTrue(tc.unwrapToInt(op.apply((double)lhsEqual[i], (double)rhsEqual[i])) == 0);
      assertTrue(tc.unwrapToInt(op.apply(BigInteger.valueOf(lhsEqual[i]), (double)rhsEqual[i])) == 0);
      assertTrue(tc.unwrapToInt(op.apply(BigDecimal.valueOf(lhsEqual[i]), (double)rhsEqual[i])) == 0);

      assertTrue(tc.unwrapToInt(op.apply((byte)lhsEqual[i], BigInteger.valueOf(rhsEqual[i]))) == 0);
      assertTrue(tc.unwrapToInt(op.apply((char)lhsEqual[i], BigInteger.valueOf(rhsEqual[i]))) == 0);
      assertTrue(tc.unwrapToInt(op.apply((short)lhsEqual[i], BigInteger.valueOf(rhsEqual[i]))) == 0);
      assertTrue(tc.unwrapToInt(op.apply(lhsEqual[i], BigInteger.valueOf(rhsEqual[i]))) == 0);
      assertTrue(tc.unwrapToInt(op.apply((long)lhsEqual[i], BigInteger.valueOf(rhsEqual[i]))) == 0);
      assertTrue(tc.unwrapToInt(op.apply((float)lhsEqual[i], BigInteger.valueOf(rhsEqual[i]))) == 0);
      assertTrue(tc.unwrapToInt(op.apply((double)lhsEqual[i], BigInteger.valueOf(rhsEqual[i]))) == 0);
      assertTrue(tc.unwrapToInt(op.apply(BigInteger.valueOf(lhsEqual[i]), BigInteger.valueOf(rhsEqual[i]))) == 0);
      assertTrue(tc.unwrapToInt(op.apply(BigDecimal.valueOf(lhsEqual[i]), BigInteger.valueOf(rhsEqual[i]))) == 0);

      assertTrue(tc.unwrapToInt(op.apply((byte)lhsEqual[i], BigDecimal.valueOf(rhsEqual[i]))) == 0);
      assertTrue(tc.unwrapToInt(op.apply((char)lhsEqual[i], BigDecimal.valueOf(rhsEqual[i]))) == 0);
      assertTrue(tc.unwrapToInt(op.apply((short)lhsEqual[i], BigDecimal.valueOf(rhsEqual[i]))) == 0);
      assertTrue(tc.unwrapToInt(op.apply(lhsEqual[i], BigDecimal.valueOf(rhsEqual[i]))) == 0);
      assertTrue(tc.unwrapToInt(op.apply((long)lhsEqual[i], BigDecimal.valueOf(rhsEqual[i]))) == 0);
      assertTrue(tc.unwrapToInt(op.apply((float)lhsEqual[i], BigDecimal.valueOf(rhsEqual[i]))) == 0);
      assertTrue(tc.unwrapToInt(op.apply((double)lhsEqual[i], BigDecimal.valueOf(rhsEqual[i]))) == 0);
      assertTrue(tc.unwrapToInt(op.apply(BigInteger.valueOf(lhsEqual[i]), BigDecimal.valueOf(rhsEqual[i]))) == 0);
      assertTrue(tc.unwrapToInt(op.apply(BigDecimal.valueOf(lhsEqual[i]), BigDecimal.valueOf(rhsEqual[i]))) == 0);

      assertTrue(tc.unwrapToInt(op.apply((byte)lhsEqual[i], NgByte.valueOf((byte)rhsEqual[i]))) == 0);
      assertTrue(tc.unwrapToInt(op.apply((char)lhsEqual[i], NgByte.valueOf((byte)rhsEqual[i]))) == 0);
      assertTrue(tc.unwrapToInt(op.apply((short)lhsEqual[i], NgByte.valueOf((byte)rhsEqual[i]))) == 0);
      assertTrue(tc.unwrapToInt(op.apply(lhsEqual[i], NgByte.valueOf((byte)rhsEqual[i]))) == 0);
      assertTrue(tc.unwrapToInt(op.apply((long)lhsEqual[i], NgByte.valueOf((byte)rhsEqual[i]))) == 0);
      assertTrue(tc.unwrapToInt(op.apply((float)lhsEqual[i], NgByte.valueOf((byte)rhsEqual[i]))) == 0);
      assertTrue(tc.unwrapToInt(op.apply((double)lhsEqual[i], NgByte.valueOf((byte)rhsEqual[i]))) == 0);
      assertTrue(tc.unwrapToInt(op.apply(BigInteger.valueOf(lhsEqual[i]), NgByte.valueOf((byte)rhsEqual[i]))) == 0);
      assertTrue(tc.unwrapToInt(op.apply(BigDecimal.valueOf(lhsEqual[i]), NgByte.valueOf((byte)rhsEqual[i]))) == 0);

      assertTrue(tc.unwrapToInt(op.apply((byte)lhsEqual[i], NgChar.valueOf((char)rhsEqual[i]))) == 0);
      assertTrue(tc.unwrapToInt(op.apply((char)lhsEqual[i], NgChar.valueOf((char)rhsEqual[i]))) == 0);
      assertTrue(tc.unwrapToInt(op.apply((short)lhsEqual[i], NgChar.valueOf((char)rhsEqual[i]))) == 0);
      assertTrue(tc.unwrapToInt(op.apply(lhsEqual[i], NgChar.valueOf((char)rhsEqual[i]))) == 0);
      assertTrue(tc.unwrapToInt(op.apply((long)lhsEqual[i], NgChar.valueOf((char)rhsEqual[i]))) == 0);
      assertTrue(tc.unwrapToInt(op.apply((float)lhsEqual[i], NgChar.valueOf((char)rhsEqual[i]))) == 0);
      assertTrue(tc.unwrapToInt(op.apply((double)lhsEqual[i], NgChar.valueOf((char)rhsEqual[i]))) == 0);
      assertTrue(tc.unwrapToInt(op.apply(BigInteger.valueOf(lhsEqual[i]), NgChar.valueOf((char)rhsEqual[i]))) == 0);
      assertTrue(tc.unwrapToInt(op.apply(BigDecimal.valueOf(lhsEqual[i]), NgChar.valueOf((char)rhsEqual[i]))) == 0);

      assertTrue(tc.unwrapToInt(op.apply((byte)lhsEqual[i], NgShort.valueOf((short)rhsEqual[i]))) == 0);
      assertTrue(tc.unwrapToInt(op.apply((char)lhsEqual[i], NgShort.valueOf((short)rhsEqual[i]))) == 0);
      assertTrue(tc.unwrapToInt(op.apply((short)lhsEqual[i], NgShort.valueOf((short)rhsEqual[i]))) == 0);
      assertTrue(tc.unwrapToInt(op.apply(lhsEqual[i], NgShort.valueOf((short)rhsEqual[i]))) == 0);
      assertTrue(tc.unwrapToInt(op.apply((long)lhsEqual[i], NgShort.valueOf((short)rhsEqual[i]))) == 0);
      assertTrue(tc.unwrapToInt(op.apply((float)lhsEqual[i], NgShort.valueOf((short)rhsEqual[i]))) == 0);
      assertTrue(tc.unwrapToInt(op.apply((double)lhsEqual[i], NgShort.valueOf((short)rhsEqual[i]))) == 0);
      assertTrue(tc.unwrapToInt(op.apply(BigInteger.valueOf(lhsEqual[i]), NgShort.valueOf((short)rhsEqual[i]))) == 0);
      assertTrue(tc.unwrapToInt(op.apply(BigDecimal.valueOf(lhsEqual[i]), NgShort.valueOf((short)rhsEqual[i]))) == 0);

      assertTrue(tc.unwrapToInt(op.apply((byte)lhsEqual[i], NgInt.valueOf(rhsEqual[i]))) == 0);
      assertTrue(tc.unwrapToInt(op.apply((char)lhsEqual[i], NgInt.valueOf(rhsEqual[i]))) == 0);
      assertTrue(tc.unwrapToInt(op.apply((short)lhsEqual[i], NgInt.valueOf(rhsEqual[i]))) == 0);
      assertTrue(tc.unwrapToInt(op.apply(lhsEqual[i], NgInt.valueOf(rhsEqual[i]))) == 0);
      assertTrue(tc.unwrapToInt(op.apply((long)lhsEqual[i], NgInt.valueOf(rhsEqual[i]))) == 0);
      assertTrue(tc.unwrapToInt(op.apply((float)lhsEqual[i], NgInt.valueOf(rhsEqual[i]))) == 0);
      assertTrue(tc.unwrapToInt(op.apply((double)lhsEqual[i], NgInt.valueOf(rhsEqual[i]))) == 0);
      assertTrue(tc.unwrapToInt(op.apply(BigInteger.valueOf(lhsEqual[i]), NgInt.valueOf(rhsEqual[i]))) == 0);
      assertTrue(tc.unwrapToInt(op.apply(BigDecimal.valueOf(lhsEqual[i]), NgInt.valueOf(rhsEqual[i]))) == 0);

      assertTrue(tc.unwrapToInt(op.apply((byte)lhsEqual[i], NgLong.valueOf(rhsEqual[i]))) == 0);
      assertTrue(tc.unwrapToInt(op.apply((char)lhsEqual[i], NgLong.valueOf(rhsEqual[i]))) == 0);
      assertTrue(tc.unwrapToInt(op.apply((short)lhsEqual[i], NgLong.valueOf(rhsEqual[i]))) == 0);
      assertTrue(tc.unwrapToInt(op.apply(lhsEqual[i], NgLong.valueOf(rhsEqual[i]))) == 0);
      assertTrue(tc.unwrapToInt(op.apply((long)lhsEqual[i], NgLong.valueOf(rhsEqual[i]))) == 0);
      assertTrue(tc.unwrapToInt(op.apply((float)lhsEqual[i], NgLong.valueOf(rhsEqual[i]))) == 0);
      assertTrue(tc.unwrapToInt(op.apply((double)lhsEqual[i], NgLong.valueOf(rhsEqual[i]))) == 0);
      assertTrue(tc.unwrapToInt(op.apply(BigInteger.valueOf(lhsEqual[i]), NgLong.valueOf(rhsEqual[i]))) == 0);
      assertTrue(tc.unwrapToInt(op.apply(BigDecimal.valueOf(lhsEqual[i]), NgLong.valueOf(rhsEqual[i]))) == 0);

      assertTrue(tc.unwrapToInt(op.apply((byte)lhsEqual[i], NgFloat.valueOf(rhsEqual[i]))) == 0);
      assertTrue(tc.unwrapToInt(op.apply((char)lhsEqual[i], NgFloat.valueOf(rhsEqual[i]))) == 0);
      assertTrue(tc.unwrapToInt(op.apply((short)lhsEqual[i], NgFloat.valueOf(rhsEqual[i]))) == 0);
      assertTrue(tc.unwrapToInt(op.apply(lhsEqual[i], NgFloat.valueOf(rhsEqual[i]))) == 0);
      assertTrue(tc.unwrapToInt(op.apply((long)lhsEqual[i], NgFloat.valueOf(rhsEqual[i]))) == 0);
      assertTrue(tc.unwrapToInt(op.apply((float)lhsEqual[i], NgFloat.valueOf(rhsEqual[i]))) == 0);
      assertTrue(tc.unwrapToInt(op.apply((double)lhsEqual[i], NgFloat.valueOf(rhsEqual[i]))) == 0);
      assertTrue(tc.unwrapToInt(op.apply(BigInteger.valueOf(lhsEqual[i]), NgFloat.valueOf(rhsEqual[i]))) == 0);
      assertTrue(tc.unwrapToInt(op.apply(BigDecimal.valueOf(lhsEqual[i]), NgFloat.valueOf(rhsEqual[i]))) == 0);

      assertTrue(tc.unwrapToInt(op.apply((byte)lhsEqual[i], NgDouble.valueOf(rhsEqual[i]))) == 0);
      assertTrue(tc.unwrapToInt(op.apply((char)lhsEqual[i], NgDouble.valueOf(rhsEqual[i]))) == 0);
      assertTrue(tc.unwrapToInt(op.apply((short)lhsEqual[i], NgDouble.valueOf(rhsEqual[i]))) == 0);
      assertTrue(tc.unwrapToInt(op.apply(lhsEqual[i], NgDouble.valueOf(rhsEqual[i]))) == 0);
      assertTrue(tc.unwrapToInt(op.apply((long)lhsEqual[i], NgDouble.valueOf(rhsEqual[i]))) == 0);
      assertTrue(tc.unwrapToInt(op.apply((float)lhsEqual[i], NgDouble.valueOf(rhsEqual[i]))) == 0);
      assertTrue(tc.unwrapToInt(op.apply((double)lhsEqual[i], NgDouble.valueOf(rhsEqual[i]))) == 0);
      assertTrue(tc.unwrapToInt(op.apply(BigInteger.valueOf(lhsEqual[i]), NgDouble.valueOf(rhsEqual[i]))) == 0);
      assertTrue(tc.unwrapToInt(op.apply(BigDecimal.valueOf(lhsEqual[i]), NgDouble.valueOf(rhsEqual[i]))) == 0);

      assertTrue(tc.unwrapToInt(op.apply(NgByte.valueOf((byte)lhsEqual[i]), NgByte.valueOf((byte)rhsEqual[i]))) == 0);
      assertTrue(tc.unwrapToInt(op.apply(NgChar.valueOf((char)lhsEqual[i]), NgByte.valueOf((byte)rhsEqual[i]))) == 0);
      assertTrue(tc.unwrapToInt(op.apply(NgShort.valueOf((short)lhsEqual[i]), NgByte.valueOf((byte)rhsEqual[i]))) == 0);
      assertTrue(tc.unwrapToInt(op.apply(NgInt.valueOf(lhsEqual[i]), NgByte.valueOf((byte)rhsEqual[i]))) == 0);
      assertTrue(tc.unwrapToInt(op.apply(NgLong.valueOf(lhsEqual[i]), NgByte.valueOf((byte)rhsEqual[i]))) == 0);
      assertTrue(tc.unwrapToInt(op.apply(NgFloat.valueOf(lhsEqual[i]), NgByte.valueOf((byte)rhsEqual[i]))) == 0);
      assertTrue(tc.unwrapToInt(op.apply(NgDouble.valueOf(lhsEqual[i]), NgByte.valueOf((byte)rhsEqual[i]))) == 0);
      assertTrue(tc.unwrapToInt(op.apply(BigInteger.valueOf(lhsEqual[i]), NgByte.valueOf((byte)rhsEqual[i]))) == 0);
      assertTrue(tc.unwrapToInt(op.apply(BigDecimal.valueOf(lhsEqual[i]), NgByte.valueOf((byte)rhsEqual[i]))) == 0);

      assertTrue(tc.unwrapToInt(op.apply(NgByte.valueOf((byte)lhsEqual[i]), NgChar.valueOf((char)rhsEqual[i]))) == 0);
      assertTrue(tc.unwrapToInt(op.apply(NgChar.valueOf((char)lhsEqual[i]), NgChar.valueOf((char)rhsEqual[i]))) == 0);
      assertTrue(tc.unwrapToInt(op.apply(NgShort.valueOf((short)lhsEqual[i]), NgChar.valueOf((char)rhsEqual[i]))) == 0);
      assertTrue(tc.unwrapToInt(op.apply(NgInt.valueOf(lhsEqual[i]), NgChar.valueOf((char)rhsEqual[i]))) == 0);
      assertTrue(tc.unwrapToInt(op.apply(NgLong.valueOf(lhsEqual[i]), NgChar.valueOf((char)rhsEqual[i]))) == 0);
      assertTrue(tc.unwrapToInt(op.apply(NgFloat.valueOf(lhsEqual[i]), NgChar.valueOf((char)rhsEqual[i]))) == 0);
      assertTrue(tc.unwrapToInt(op.apply(NgDouble.valueOf(lhsEqual[i]), NgChar.valueOf((char)rhsEqual[i]))) == 0);
      assertTrue(tc.unwrapToInt(op.apply(BigInteger.valueOf(lhsEqual[i]), NgChar.valueOf((char)rhsEqual[i]))) == 0);
      assertTrue(tc.unwrapToInt(op.apply(BigDecimal.valueOf(lhsEqual[i]), NgChar.valueOf((char)rhsEqual[i]))) == 0);

      assertTrue(tc.unwrapToInt(op.apply(NgByte.valueOf((byte)lhsEqual[i]), NgShort.valueOf((short)rhsEqual[i]))) == 0);
      assertTrue(tc.unwrapToInt(op.apply(NgChar.valueOf((char)lhsEqual[i]), NgShort.valueOf((short)rhsEqual[i]))) == 0);
      assertTrue(tc.unwrapToInt(op.apply(NgShort.valueOf((short)lhsEqual[i]), NgShort.valueOf((short)rhsEqual[i]))) == 0);
      assertTrue(tc.unwrapToInt(op.apply(NgInt.valueOf(lhsEqual[i]), NgShort.valueOf((short)rhsEqual[i]))) == 0);
      assertTrue(tc.unwrapToInt(op.apply(NgLong.valueOf(lhsEqual[i]), NgShort.valueOf((short)rhsEqual[i]))) == 0);
      assertTrue(tc.unwrapToInt(op.apply(NgFloat.valueOf(lhsEqual[i]), NgShort.valueOf((short)rhsEqual[i]))) == 0);
      assertTrue(tc.unwrapToInt(op.apply(NgDouble.valueOf(lhsEqual[i]), NgShort.valueOf((short)rhsEqual[i]))) == 0);
      assertTrue(tc.unwrapToInt(op.apply(BigInteger.valueOf(lhsEqual[i]), NgShort.valueOf((short)rhsEqual[i]))) == 0);
      assertTrue(tc.unwrapToInt(op.apply(BigDecimal.valueOf(lhsEqual[i]), NgShort.valueOf((short)rhsEqual[i]))) == 0);

      assertTrue(tc.unwrapToInt(op.apply(NgByte.valueOf((byte)lhsEqual[i]), NgInt.valueOf(rhsEqual[i]))) == 0);
      assertTrue(tc.unwrapToInt(op.apply(NgChar.valueOf((char)lhsEqual[i]), NgInt.valueOf(rhsEqual[i]))) == 0);
      assertTrue(tc.unwrapToInt(op.apply(NgShort.valueOf((short)lhsEqual[i]), NgInt.valueOf(rhsEqual[i]))) == 0);
      assertTrue(tc.unwrapToInt(op.apply(NgInt.valueOf(lhsEqual[i]), NgInt.valueOf(rhsEqual[i]))) == 0);
      assertTrue(tc.unwrapToInt(op.apply(NgLong.valueOf(lhsEqual[i]), NgInt.valueOf(rhsEqual[i]))) == 0);
      assertTrue(tc.unwrapToInt(op.apply(NgFloat.valueOf(lhsEqual[i]), NgInt.valueOf(rhsEqual[i]))) == 0);
      assertTrue(tc.unwrapToInt(op.apply(NgDouble.valueOf(lhsEqual[i]), NgInt.valueOf(rhsEqual[i]))) == 0);
      assertTrue(tc.unwrapToInt(op.apply(BigInteger.valueOf(lhsEqual[i]), NgInt.valueOf(rhsEqual[i]))) == 0);
      assertTrue(tc.unwrapToInt(op.apply(BigDecimal.valueOf(lhsEqual[i]), NgInt.valueOf(rhsEqual[i]))) == 0);

      assertTrue(tc.unwrapToInt(op.apply(NgByte.valueOf((byte)lhsEqual[i]), NgLong.valueOf(rhsEqual[i]))) == 0);
      assertTrue(tc.unwrapToInt(op.apply(NgChar.valueOf((char)lhsEqual[i]), NgLong.valueOf(rhsEqual[i]))) == 0);
      assertTrue(tc.unwrapToInt(op.apply(NgShort.valueOf((short)lhsEqual[i]), NgLong.valueOf(rhsEqual[i]))) == 0);
      assertTrue(tc.unwrapToInt(op.apply(NgInt.valueOf(lhsEqual[i]), NgLong.valueOf(rhsEqual[i]))) == 0);
      assertTrue(tc.unwrapToInt(op.apply(NgLong.valueOf(lhsEqual[i]), NgLong.valueOf(rhsEqual[i]))) == 0);
      assertTrue(tc.unwrapToInt(op.apply(NgFloat.valueOf(lhsEqual[i]), NgLong.valueOf(rhsEqual[i]))) == 0);
      assertTrue(tc.unwrapToInt(op.apply(NgDouble.valueOf(lhsEqual[i]), NgLong.valueOf(rhsEqual[i]))) == 0);
      assertTrue(tc.unwrapToInt(op.apply(BigInteger.valueOf(lhsEqual[i]), NgLong.valueOf(rhsEqual[i]))) == 0);
      assertTrue(tc.unwrapToInt(op.apply(BigDecimal.valueOf(lhsEqual[i]), NgLong.valueOf(rhsEqual[i]))) == 0);

      assertTrue(tc.unwrapToInt(op.apply(NgByte.valueOf((byte)lhsEqual[i]), NgFloat.valueOf(rhsEqual[i]))) == 0);
      assertTrue(tc.unwrapToInt(op.apply(NgChar.valueOf((char)lhsEqual[i]), NgFloat.valueOf(rhsEqual[i]))) == 0);
      assertTrue(tc.unwrapToInt(op.apply(NgShort.valueOf((short)lhsEqual[i]), NgFloat.valueOf(rhsEqual[i]))) == 0);
      assertTrue(tc.unwrapToInt(op.apply(NgInt.valueOf(lhsEqual[i]), NgFloat.valueOf(rhsEqual[i]))) == 0);
      assertTrue(tc.unwrapToInt(op.apply(NgLong.valueOf(lhsEqual[i]), NgFloat.valueOf(rhsEqual[i]))) == 0);
      assertTrue(tc.unwrapToInt(op.apply(NgFloat.valueOf(lhsEqual[i]), NgFloat.valueOf(rhsEqual[i]))) == 0);
      assertTrue(tc.unwrapToInt(op.apply(NgDouble.valueOf(lhsEqual[i]), NgFloat.valueOf(rhsEqual[i]))) == 0);
      assertTrue(tc.unwrapToInt(op.apply(BigInteger.valueOf(lhsEqual[i]), NgFloat.valueOf(rhsEqual[i]))) == 0);
      assertTrue(tc.unwrapToInt(op.apply(BigDecimal.valueOf(lhsEqual[i]), NgFloat.valueOf(rhsEqual[i]))) == 0);

      assertTrue(tc.unwrapToInt(op.apply(NgByte.valueOf((byte)lhsEqual[i]), NgDouble.valueOf(rhsEqual[i]))) == 0);
      assertTrue(tc.unwrapToInt(op.apply(NgChar.valueOf((char)lhsEqual[i]), NgDouble.valueOf(rhsEqual[i]))) == 0);
      assertTrue(tc.unwrapToInt(op.apply(NgShort.valueOf((short)lhsEqual[i]), NgDouble.valueOf(rhsEqual[i]))) == 0);
      assertTrue(tc.unwrapToInt(op.apply(NgInt.valueOf(lhsEqual[i]), NgDouble.valueOf(rhsEqual[i]))) == 0);
      assertTrue(tc.unwrapToInt(op.apply(NgLong.valueOf(lhsEqual[i]), NgDouble.valueOf(rhsEqual[i]))) == 0);
      assertTrue(tc.unwrapToInt(op.apply(NgFloat.valueOf(lhsEqual[i]), NgDouble.valueOf(rhsEqual[i]))) == 0);
      assertTrue(tc.unwrapToInt(op.apply(NgDouble.valueOf(lhsEqual[i]), NgDouble.valueOf(rhsEqual[i]))) == 0);
      assertTrue(tc.unwrapToInt(op.apply(BigInteger.valueOf(lhsEqual[i]), NgDouble.valueOf(rhsEqual[i]))) == 0);
      assertTrue(tc.unwrapToInt(op.apply(BigDecimal.valueOf(lhsEqual[i]), NgDouble.valueOf(rhsEqual[i]))) == 0);

      assertTrue(tc.unwrapToInt(op.apply(NgByte.valueOf((byte)lhsEqual[i]), BigInteger.valueOf(rhsEqual[i]))) == 0);
      assertTrue(tc.unwrapToInt(op.apply(NgChar.valueOf((char)lhsEqual[i]), BigInteger.valueOf(rhsEqual[i]))) == 0);
      assertTrue(tc.unwrapToInt(op.apply(NgShort.valueOf((short)lhsEqual[i]), BigInteger.valueOf(rhsEqual[i]))) == 0);
      assertTrue(tc.unwrapToInt(op.apply(NgInt.valueOf(lhsEqual[i]), BigInteger.valueOf(rhsEqual[i]))) == 0);
      assertTrue(tc.unwrapToInt(op.apply(NgLong.valueOf(lhsEqual[i]), BigInteger.valueOf(rhsEqual[i]))) == 0);
      assertTrue(tc.unwrapToInt(op.apply(NgFloat.valueOf(lhsEqual[i]), BigInteger.valueOf(rhsEqual[i]))) == 0);
      assertTrue(tc.unwrapToInt(op.apply(NgDouble.valueOf(lhsEqual[i]), BigInteger.valueOf(rhsEqual[i]))) == 0);
      assertTrue(tc.unwrapToInt(op.apply(BigInteger.valueOf(lhsEqual[i]), BigInteger.valueOf(rhsEqual[i]))) == 0);
      assertTrue(tc.unwrapToInt(op.apply(BigDecimal.valueOf(lhsEqual[i]), BigInteger.valueOf(rhsEqual[i]))) == 0);

      assertTrue(tc.unwrapToInt(op.apply(NgByte.valueOf((byte)lhsEqual[i]), BigDecimal.valueOf(rhsEqual[i]))) == 0);
      assertTrue(tc.unwrapToInt(op.apply(NgChar.valueOf((char)lhsEqual[i]), BigDecimal.valueOf(rhsEqual[i]))) == 0);
      assertTrue(tc.unwrapToInt(op.apply(NgShort.valueOf((short)lhsEqual[i]), BigDecimal.valueOf(rhsEqual[i]))) == 0);
      assertTrue(tc.unwrapToInt(op.apply(NgInt.valueOf(lhsEqual[i]), BigDecimal.valueOf(rhsEqual[i]))) == 0);
      assertTrue(tc.unwrapToInt(op.apply(NgLong.valueOf(lhsEqual[i]), BigDecimal.valueOf(rhsEqual[i]))) == 0);
      assertTrue(tc.unwrapToInt(op.apply(NgFloat.valueOf(lhsEqual[i]), BigDecimal.valueOf(rhsEqual[i]))) == 0);
      assertTrue(tc.unwrapToInt(op.apply(NgDouble.valueOf(lhsEqual[i]), BigDecimal.valueOf(rhsEqual[i]))) == 0);
      assertTrue(tc.unwrapToInt(op.apply(BigInteger.valueOf(lhsEqual[i]), BigDecimal.valueOf(rhsEqual[i]))) == 0);
      assertTrue(tc.unwrapToInt(op.apply(BigDecimal.valueOf(lhsEqual[i]), BigDecimal.valueOf(rhsEqual[i]))) == 0);

      assertTrue(tc.unwrapToInt(op.apply(NgByte.valueOf((byte)lhsEqual[i]), NgByte.valueOf((byte)rhsEqual[i]))) == 0);
      assertTrue(tc.unwrapToInt(op.apply(NgChar.valueOf((char)lhsEqual[i]), NgByte.valueOf((byte)rhsEqual[i]))) == 0);
      assertTrue(tc.unwrapToInt(op.apply(NgShort.valueOf((short)lhsEqual[i]), NgByte.valueOf((byte)rhsEqual[i]))) == 0);
      assertTrue(tc.unwrapToInt(op.apply(NgInt.valueOf(lhsEqual[i]), NgByte.valueOf((byte)rhsEqual[i]))) == 0);
      assertTrue(tc.unwrapToInt(op.apply(NgLong.valueOf(lhsEqual[i]), NgByte.valueOf((byte)rhsEqual[i]))) == 0);
      assertTrue(tc.unwrapToInt(op.apply(NgFloat.valueOf(lhsEqual[i]), NgByte.valueOf((byte)rhsEqual[i]))) == 0);
      assertTrue(tc.unwrapToInt(op.apply(NgDouble.valueOf(lhsEqual[i]), NgByte.valueOf((byte)rhsEqual[i]))) == 0);
      assertTrue(tc.unwrapToInt(op.apply((Object)BigInteger.valueOf(lhsEqual[i]), (Object)NgByte.valueOf((byte)rhsEqual[i]))) == 0);
      assertTrue(tc.unwrapToInt(op.apply((Object)BigDecimal.valueOf(lhsEqual[i]), (Object)NgByte.valueOf((byte)rhsEqual[i]))) == 0);

      assertTrue(tc.unwrapToInt(op.apply(NgByte.valueOf((byte)lhsEqual[i]), NgChar.valueOf((char)rhsEqual[i]))) == 0);
      assertTrue(tc.unwrapToInt(op.apply(NgChar.valueOf((char)lhsEqual[i]), NgChar.valueOf((char)rhsEqual[i]))) == 0);
      assertTrue(tc.unwrapToInt(op.apply(NgShort.valueOf((short)lhsEqual[i]), NgChar.valueOf((char)rhsEqual[i]))) == 0);
      assertTrue(tc.unwrapToInt(op.apply(NgInt.valueOf(lhsEqual[i]), NgChar.valueOf((char)rhsEqual[i]))) == 0);
      assertTrue(tc.unwrapToInt(op.apply(NgLong.valueOf(lhsEqual[i]), NgChar.valueOf((char)rhsEqual[i]))) == 0);
      assertTrue(tc.unwrapToInt(op.apply(NgFloat.valueOf(lhsEqual[i]), NgChar.valueOf((char)rhsEqual[i]))) == 0);
      assertTrue(tc.unwrapToInt(op.apply(NgDouble.valueOf(lhsEqual[i]), NgChar.valueOf((char)rhsEqual[i]))) == 0);
      assertTrue(tc.unwrapToInt(op.apply((Object)BigInteger.valueOf(lhsEqual[i]), (Object)NgChar.valueOf((char)rhsEqual[i]))) == 0);
      assertTrue(tc.unwrapToInt(op.apply((Object)BigDecimal.valueOf(lhsEqual[i]), (Object)NgChar.valueOf((char)rhsEqual[i]))) == 0);

      assertTrue(tc.unwrapToInt(op.apply(NgByte.valueOf((byte)lhsEqual[i]), NgShort.valueOf((short)rhsEqual[i]))) == 0);
      assertTrue(tc.unwrapToInt(op.apply(NgChar.valueOf((char)lhsEqual[i]), NgShort.valueOf((short)rhsEqual[i]))) == 0);
      assertTrue(tc.unwrapToInt(op.apply(NgShort.valueOf((short)lhsEqual[i]), NgShort.valueOf((short)rhsEqual[i]))) == 0);
      assertTrue(tc.unwrapToInt(op.apply(NgInt.valueOf(lhsEqual[i]), NgShort.valueOf((short)rhsEqual[i]))) == 0);
      assertTrue(tc.unwrapToInt(op.apply(NgLong.valueOf(lhsEqual[i]), NgShort.valueOf((short)rhsEqual[i]))) == 0);
      assertTrue(tc.unwrapToInt(op.apply(NgFloat.valueOf(lhsEqual[i]), NgShort.valueOf((short)rhsEqual[i]))) == 0);
      assertTrue(tc.unwrapToInt(op.apply(NgDouble.valueOf(lhsEqual[i]), NgShort.valueOf((short)rhsEqual[i]))) == 0);
      assertTrue(tc.unwrapToInt(op.apply((Object)BigInteger.valueOf(lhsEqual[i]), (Object)NgShort.valueOf((short)rhsEqual[i]))) == 0);
      assertTrue(tc.unwrapToInt(op.apply((Object)BigDecimal.valueOf(lhsEqual[i]), (Object)NgShort.valueOf((short)rhsEqual[i]))) == 0);

      assertTrue(tc.unwrapToInt(op.apply(NgByte.valueOf((byte)lhsEqual[i]), NgInt.valueOf(rhsEqual[i]))) == 0);
      assertTrue(tc.unwrapToInt(op.apply(NgChar.valueOf((char)lhsEqual[i]), NgInt.valueOf(rhsEqual[i]))) == 0);
      assertTrue(tc.unwrapToInt(op.apply(NgShort.valueOf((short)lhsEqual[i]), NgInt.valueOf(rhsEqual[i]))) == 0);
      assertTrue(tc.unwrapToInt(op.apply(NgInt.valueOf(lhsEqual[i]), NgInt.valueOf(rhsEqual[i]))) == 0);
      assertTrue(tc.unwrapToInt(op.apply(NgLong.valueOf(lhsEqual[i]), NgInt.valueOf(rhsEqual[i]))) == 0);
      assertTrue(tc.unwrapToInt(op.apply(NgFloat.valueOf(lhsEqual[i]), NgInt.valueOf(rhsEqual[i]))) == 0);
      assertTrue(tc.unwrapToInt(op.apply(NgDouble.valueOf(lhsEqual[i]), NgInt.valueOf(rhsEqual[i]))) == 0);
      assertTrue(tc.unwrapToInt(op.apply((Object)BigInteger.valueOf(lhsEqual[i]), (Object)NgInt.valueOf(rhsEqual[i]))) == 0);
      assertTrue(tc.unwrapToInt(op.apply((Object)BigDecimal.valueOf(lhsEqual[i]), (Object)NgInt.valueOf(rhsEqual[i]))) == 0);

      assertTrue(tc.unwrapToInt(op.apply(NgByte.valueOf((byte)lhsEqual[i]), NgLong.valueOf(rhsEqual[i]))) == 0);
      assertTrue(tc.unwrapToInt(op.apply(NgChar.valueOf((char)lhsEqual[i]), NgLong.valueOf(rhsEqual[i]))) == 0);
      assertTrue(tc.unwrapToInt(op.apply(NgShort.valueOf((short)lhsEqual[i]), NgLong.valueOf(rhsEqual[i]))) == 0);
      assertTrue(tc.unwrapToInt(op.apply(NgInt.valueOf(lhsEqual[i]), NgLong.valueOf(rhsEqual[i]))) == 0);
      assertTrue(tc.unwrapToInt(op.apply(NgLong.valueOf(lhsEqual[i]), NgLong.valueOf(rhsEqual[i]))) == 0);
      assertTrue(tc.unwrapToInt(op.apply(NgFloat.valueOf(lhsEqual[i]), NgLong.valueOf(rhsEqual[i]))) == 0);
      assertTrue(tc.unwrapToInt(op.apply(NgDouble.valueOf(lhsEqual[i]), NgLong.valueOf(rhsEqual[i]))) == 0);
      assertTrue(tc.unwrapToInt(op.apply((Object)BigInteger.valueOf(lhsEqual[i]), (Object)NgLong.valueOf(rhsEqual[i]))) == 0);
      assertTrue(tc.unwrapToInt(op.apply((Object)BigDecimal.valueOf(lhsEqual[i]), (Object)NgLong.valueOf(rhsEqual[i]))) == 0);

      assertTrue(tc.unwrapToInt(op.apply(NgByte.valueOf((byte)lhsEqual[i]), NgFloat.valueOf(rhsEqual[i]))) == 0);
      assertTrue(tc.unwrapToInt(op.apply(NgChar.valueOf((char)lhsEqual[i]), NgFloat.valueOf(rhsEqual[i]))) == 0);
      assertTrue(tc.unwrapToInt(op.apply(NgShort.valueOf((short)lhsEqual[i]), NgFloat.valueOf(rhsEqual[i]))) == 0);
      assertTrue(tc.unwrapToInt(op.apply(NgInt.valueOf(lhsEqual[i]), NgFloat.valueOf(rhsEqual[i]))) == 0);
      assertTrue(tc.unwrapToInt(op.apply(NgLong.valueOf(lhsEqual[i]), NgFloat.valueOf(rhsEqual[i]))) == 0);
      assertTrue(tc.unwrapToInt(op.apply(NgFloat.valueOf(lhsEqual[i]), NgFloat.valueOf(rhsEqual[i]))) == 0);
      assertTrue(tc.unwrapToInt(op.apply(NgDouble.valueOf(lhsEqual[i]), NgFloat.valueOf(rhsEqual[i]))) == 0);
      assertTrue(tc.unwrapToInt(op.apply((Object)BigInteger.valueOf(lhsEqual[i]), (Object)NgFloat.valueOf(rhsEqual[i]))) == 0);
      assertTrue(tc.unwrapToInt(op.apply((Object)BigDecimal.valueOf(lhsEqual[i]), (Object)NgFloat.valueOf(rhsEqual[i]))) == 0);

      assertTrue(tc.unwrapToInt(op.apply(NgByte.valueOf((byte)lhsEqual[i]), NgDouble.valueOf(rhsEqual[i]))) == 0);
      assertTrue(tc.unwrapToInt(op.apply(NgChar.valueOf((char)lhsEqual[i]), NgDouble.valueOf(rhsEqual[i]))) == 0);
      assertTrue(tc.unwrapToInt(op.apply(NgShort.valueOf((short)lhsEqual[i]), NgDouble.valueOf(rhsEqual[i]))) == 0);
      assertTrue(tc.unwrapToInt(op.apply(NgInt.valueOf(lhsEqual[i]), NgDouble.valueOf(rhsEqual[i]))) == 0);
      assertTrue(tc.unwrapToInt(op.apply(NgLong.valueOf(lhsEqual[i]), NgDouble.valueOf(rhsEqual[i]))) == 0);
      assertTrue(tc.unwrapToInt(op.apply(NgFloat.valueOf(lhsEqual[i]), NgDouble.valueOf(rhsEqual[i]))) == 0);
      assertTrue(tc.unwrapToInt(op.apply(NgDouble.valueOf(lhsEqual[i]), NgDouble.valueOf(rhsEqual[i]))) == 0);
      assertTrue(tc.unwrapToInt(op.apply((Object)BigInteger.valueOf(lhsEqual[i]), (Object)NgDouble.valueOf(rhsEqual[i]))) == 0);
      assertTrue(tc.unwrapToInt(op.apply((Object)BigDecimal.valueOf(lhsEqual[i]), (Object)NgDouble.valueOf(rhsEqual[i]))) == 0);

      assertTrue(tc.unwrapToInt(op.apply((Object)NgByte.valueOf((byte)lhsEqual[i]), (Object)BigInteger.valueOf(rhsEqual[i]))) == 0);
      assertTrue(tc.unwrapToInt(op.apply((Object)NgChar.valueOf((char)lhsEqual[i]), (Object)BigInteger.valueOf(rhsEqual[i]))) == 0);
      assertTrue(tc.unwrapToInt(op.apply((Object)NgShort.valueOf((short)lhsEqual[i]), (Object)BigInteger.valueOf(rhsEqual[i]))) == 0);
      assertTrue(tc.unwrapToInt(op.apply((Object)NgInt.valueOf(lhsEqual[i]), (Object)BigInteger.valueOf(rhsEqual[i]))) == 0);
      assertTrue(tc.unwrapToInt(op.apply((Object)NgLong.valueOf(lhsEqual[i]), (Object)BigInteger.valueOf(rhsEqual[i]))) == 0);
      assertTrue(tc.unwrapToInt(op.apply((Object)NgFloat.valueOf(lhsEqual[i]), (Object)BigInteger.valueOf(rhsEqual[i]))) == 0);
      assertTrue(tc.unwrapToInt(op.apply((Object)NgDouble.valueOf(lhsEqual[i]), (Object)BigInteger.valueOf(rhsEqual[i]))) == 0);
      assertTrue(tc.unwrapToInt(op.apply((Object)BigInteger.valueOf(lhsEqual[i]), (Object)BigInteger.valueOf(rhsEqual[i]))) == 0);
      assertTrue(tc.unwrapToInt(op.apply((Object)BigDecimal.valueOf(lhsEqual[i]), (Object)BigInteger.valueOf(rhsEqual[i]))) == 0);

      assertTrue(tc.unwrapToInt(op.apply((Object)NgByte.valueOf((byte)lhsEqual[i]), (Object)BigDecimal.valueOf(rhsEqual[i]))) == 0);
      assertTrue(tc.unwrapToInt(op.apply((Object)NgChar.valueOf((char)lhsEqual[i]), (Object)BigDecimal.valueOf(rhsEqual[i]))) == 0);
      assertTrue(tc.unwrapToInt(op.apply((Object)NgShort.valueOf((short)lhsEqual[i]), (Object)BigDecimal.valueOf(rhsEqual[i]))) == 0);
      assertTrue(tc.unwrapToInt(op.apply((Object)NgInt.valueOf(lhsEqual[i]), (Object)BigDecimal.valueOf(rhsEqual[i]))) == 0);
      assertTrue(tc.unwrapToInt(op.apply((Object)NgLong.valueOf(lhsEqual[i]), (Object)BigDecimal.valueOf(rhsEqual[i]))) == 0);
      assertTrue(tc.unwrapToInt(op.apply((Object)NgFloat.valueOf(lhsEqual[i]), (Object)BigDecimal.valueOf(rhsEqual[i]))) == 0);
      assertTrue(tc.unwrapToInt(op.apply((Object)NgDouble.valueOf(lhsEqual[i]), (Object)BigDecimal.valueOf(rhsEqual[i]))) == 0);
      assertTrue(tc.unwrapToInt(op.apply((Object)BigInteger.valueOf(lhsEqual[i]), (Object)BigDecimal.valueOf(rhsEqual[i]))) == 0);
      assertTrue(tc.unwrapToInt(op.apply((Object)BigDecimal.valueOf(lhsEqual[i]), (Object)BigDecimal.valueOf(rhsEqual[i]))) == 0);

      assertTrue(op.intApply(NgByte.valueOf((byte)lhsEqual[i]), NgByte.valueOf((byte)rhsEqual[i])) == 0);
      assertTrue(op.intApply(NgChar.valueOf((char)lhsEqual[i]), NgByte.valueOf((byte)rhsEqual[i])) == 0);
      assertTrue(op.intApply(NgShort.valueOf((short)lhsEqual[i]), NgByte.valueOf((byte)rhsEqual[i])) == 0);
      assertTrue(op.intApply(NgInt.valueOf(lhsEqual[i]), NgByte.valueOf((byte)rhsEqual[i])) == 0);
      assertTrue(op.intApply(NgLong.valueOf(lhsEqual[i]), NgByte.valueOf((byte)rhsEqual[i])) == 0);
      assertTrue(op.intApply(NgFloat.valueOf(lhsEqual[i]), NgByte.valueOf((byte)rhsEqual[i])) == 0);
      assertTrue(op.intApply(NgDouble.valueOf(lhsEqual[i]), NgByte.valueOf((byte)rhsEqual[i])) == 0);
      assertTrue(op.intApply((Object)BigInteger.valueOf(lhsEqual[i]), (Object)NgByte.valueOf((byte)rhsEqual[i])) == 0);
      assertTrue(op.intApply((Object)BigDecimal.valueOf(lhsEqual[i]), (Object)NgByte.valueOf((byte)rhsEqual[i])) == 0);

      assertTrue(op.intApply(NgByte.valueOf((byte)lhsEqual[i]), NgChar.valueOf((char)rhsEqual[i])) == 0);
      assertTrue(op.intApply(NgChar.valueOf((char)lhsEqual[i]), NgChar.valueOf((char)rhsEqual[i])) == 0);
      assertTrue(op.intApply(NgShort.valueOf((short)lhsEqual[i]), NgChar.valueOf((char)rhsEqual[i])) == 0);
      assertTrue(op.intApply(NgInt.valueOf(lhsEqual[i]), NgChar.valueOf((char)rhsEqual[i])) == 0);
      assertTrue(op.intApply(NgLong.valueOf(lhsEqual[i]), NgChar.valueOf((char)rhsEqual[i])) == 0);
      assertTrue(op.intApply(NgFloat.valueOf(lhsEqual[i]), NgChar.valueOf((char)rhsEqual[i])) == 0);
      assertTrue(op.intApply(NgDouble.valueOf(lhsEqual[i]), NgChar.valueOf((char)rhsEqual[i])) == 0);
      assertTrue(op.intApply((Object)BigInteger.valueOf(lhsEqual[i]), (Object)NgChar.valueOf((char)rhsEqual[i])) == 0);
      assertTrue(op.intApply((Object)BigDecimal.valueOf(lhsEqual[i]), (Object)NgChar.valueOf((char)rhsEqual[i])) == 0);

      assertTrue(op.intApply(NgByte.valueOf((byte)lhsEqual[i]), NgShort.valueOf((short)rhsEqual[i])) == 0);
      assertTrue(op.intApply(NgChar.valueOf((char)lhsEqual[i]), NgShort.valueOf((short)rhsEqual[i])) == 0);
      assertTrue(op.intApply(NgShort.valueOf((short)lhsEqual[i]), NgShort.valueOf((short)rhsEqual[i])) == 0);
      assertTrue(op.intApply(NgInt.valueOf(lhsEqual[i]), NgShort.valueOf((short)rhsEqual[i])) == 0);
      assertTrue(op.intApply(NgLong.valueOf(lhsEqual[i]), NgShort.valueOf((short)rhsEqual[i])) == 0);
      assertTrue(op.intApply(NgFloat.valueOf(lhsEqual[i]), NgShort.valueOf((short)rhsEqual[i])) == 0);
      assertTrue(op.intApply(NgDouble.valueOf(lhsEqual[i]), NgShort.valueOf((short)rhsEqual[i])) == 0);
      assertTrue(op.intApply((Object)BigInteger.valueOf(lhsEqual[i]), (Object)NgShort.valueOf((short)rhsEqual[i])) == 0);
      assertTrue(op.intApply((Object)BigDecimal.valueOf(lhsEqual[i]), (Object)NgShort.valueOf((short)rhsEqual[i])) == 0);

      assertTrue(op.intApply(NgByte.valueOf((byte)lhsEqual[i]), NgInt.valueOf(rhsEqual[i])) == 0);
      assertTrue(op.intApply(NgChar.valueOf((char)lhsEqual[i]), NgInt.valueOf(rhsEqual[i])) == 0);
      assertTrue(op.intApply(NgShort.valueOf((short)lhsEqual[i]), NgInt.valueOf(rhsEqual[i])) == 0);
      assertTrue(op.intApply(NgInt.valueOf(lhsEqual[i]), NgInt.valueOf(rhsEqual[i])) == 0);
      assertTrue(op.intApply(NgLong.valueOf(lhsEqual[i]), NgInt.valueOf(rhsEqual[i])) == 0);
      assertTrue(op.intApply(NgFloat.valueOf(lhsEqual[i]), NgInt.valueOf(rhsEqual[i])) == 0);
      assertTrue(op.intApply(NgDouble.valueOf(lhsEqual[i]), NgInt.valueOf(rhsEqual[i])) == 0);
      assertTrue(op.intApply((Object)BigInteger.valueOf(lhsEqual[i]), (Object)NgInt.valueOf(rhsEqual[i])) == 0);
      assertTrue(op.intApply((Object)BigDecimal.valueOf(lhsEqual[i]), (Object)NgInt.valueOf(rhsEqual[i])) == 0);

      assertTrue(op.intApply(NgByte.valueOf((byte)lhsEqual[i]), NgLong.valueOf(rhsEqual[i])) == 0);
      assertTrue(op.intApply(NgChar.valueOf((char)lhsEqual[i]), NgLong.valueOf(rhsEqual[i])) == 0);
      assertTrue(op.intApply(NgShort.valueOf((short)lhsEqual[i]), NgLong.valueOf(rhsEqual[i])) == 0);
      assertTrue(op.intApply(NgInt.valueOf(lhsEqual[i]), NgLong.valueOf(rhsEqual[i])) == 0);
      assertTrue(op.intApply(NgLong.valueOf(lhsEqual[i]), NgLong.valueOf(rhsEqual[i])) == 0);
      assertTrue(op.intApply(NgFloat.valueOf(lhsEqual[i]), NgLong.valueOf(rhsEqual[i])) == 0);
      assertTrue(op.intApply(NgDouble.valueOf(lhsEqual[i]), NgLong.valueOf(rhsEqual[i])) == 0);
      assertTrue(op.intApply((Object)BigInteger.valueOf(lhsEqual[i]), (Object)NgLong.valueOf(rhsEqual[i])) == 0);
      assertTrue(op.intApply((Object)BigDecimal.valueOf(lhsEqual[i]), (Object)NgLong.valueOf(rhsEqual[i])) == 0);

      assertTrue(op.intApply(NgByte.valueOf((byte)lhsEqual[i]), NgFloat.valueOf(rhsEqual[i])) == 0);
      assertTrue(op.intApply(NgChar.valueOf((char)lhsEqual[i]), NgFloat.valueOf(rhsEqual[i])) == 0);
      assertTrue(op.intApply(NgShort.valueOf((short)lhsEqual[i]), NgFloat.valueOf(rhsEqual[i])) == 0);
      assertTrue(op.intApply(NgInt.valueOf(lhsEqual[i]), NgFloat.valueOf(rhsEqual[i])) == 0);
      assertTrue(op.intApply(NgLong.valueOf(lhsEqual[i]), NgFloat.valueOf(rhsEqual[i])) == 0);
      assertTrue(op.intApply(NgFloat.valueOf(lhsEqual[i]), NgFloat.valueOf(rhsEqual[i])) == 0);
      assertTrue(op.intApply(NgDouble.valueOf(lhsEqual[i]), NgFloat.valueOf(rhsEqual[i])) == 0);
      assertTrue(op.intApply((Object)BigInteger.valueOf(lhsEqual[i]), (Object)NgFloat.valueOf(rhsEqual[i])) == 0);
      assertTrue(op.intApply((Object)BigDecimal.valueOf(lhsEqual[i]), (Object)NgFloat.valueOf(rhsEqual[i])) == 0);

      assertTrue(op.intApply(NgByte.valueOf((byte)lhsEqual[i]), NgDouble.valueOf(rhsEqual[i])) == 0);
      assertTrue(op.intApply(NgChar.valueOf((char)lhsEqual[i]), NgDouble.valueOf(rhsEqual[i])) == 0);
      assertTrue(op.intApply(NgShort.valueOf((short)lhsEqual[i]), NgDouble.valueOf(rhsEqual[i])) == 0);
      assertTrue(op.intApply(NgInt.valueOf(lhsEqual[i]), NgDouble.valueOf(rhsEqual[i])) == 0);
      assertTrue(op.intApply(NgLong.valueOf(lhsEqual[i]), NgDouble.valueOf(rhsEqual[i])) == 0);
      assertTrue(op.intApply(NgFloat.valueOf(lhsEqual[i]), NgDouble.valueOf(rhsEqual[i])) == 0);
      assertTrue(op.intApply(NgDouble.valueOf(lhsEqual[i]), NgDouble.valueOf(rhsEqual[i])) == 0);
      assertTrue(op.intApply((Object)BigInteger.valueOf(lhsEqual[i]), (Object)NgDouble.valueOf(rhsEqual[i])) == 0);
      assertTrue(op.intApply((Object)BigDecimal.valueOf(lhsEqual[i]), (Object)NgDouble.valueOf(rhsEqual[i])) == 0);

      assertTrue(op.intApply((Object)NgByte.valueOf((byte)lhsEqual[i]), (Object)BigInteger.valueOf(rhsEqual[i])) == 0);
      assertTrue(op.intApply((Object)NgChar.valueOf((char)lhsEqual[i]), (Object)BigInteger.valueOf(rhsEqual[i])) == 0);
      assertTrue(op.intApply((Object)NgShort.valueOf((short)lhsEqual[i]), (Object)BigInteger.valueOf(rhsEqual[i])) == 0);
      assertTrue(op.intApply((Object)NgInt.valueOf(lhsEqual[i]), (Object)BigInteger.valueOf(rhsEqual[i])) == 0);
      assertTrue(op.intApply((Object)NgLong.valueOf(lhsEqual[i]), (Object)BigInteger.valueOf(rhsEqual[i])) == 0);
      assertTrue(op.intApply((Object)NgFloat.valueOf(lhsEqual[i]), (Object)BigInteger.valueOf(rhsEqual[i])) == 0);
      assertTrue(op.intApply((Object)NgDouble.valueOf(lhsEqual[i]), (Object)BigInteger.valueOf(rhsEqual[i])) == 0);
      assertTrue(op.intApply((Object)BigInteger.valueOf(lhsEqual[i]), (Object)BigInteger.valueOf(rhsEqual[i])) == 0);
      assertTrue(op.intApply((Object)BigDecimal.valueOf(lhsEqual[i]), (Object)BigInteger.valueOf(rhsEqual[i])) == 0);

      assertTrue(op.intApply((Object)NgByte.valueOf((byte)lhsEqual[i]), (Object)BigDecimal.valueOf(rhsEqual[i])) == 0);
      assertTrue(op.intApply((Object)NgChar.valueOf((char)lhsEqual[i]), (Object)BigDecimal.valueOf(rhsEqual[i])) == 0);
      assertTrue(op.intApply((Object)NgShort.valueOf((short)lhsEqual[i]), (Object)BigDecimal.valueOf(rhsEqual[i])) == 0);
      assertTrue(op.intApply((Object)NgInt.valueOf(lhsEqual[i]), (Object)BigDecimal.valueOf(rhsEqual[i])) == 0);
      assertTrue(op.intApply((Object)NgLong.valueOf(lhsEqual[i]), (Object)BigDecimal.valueOf(rhsEqual[i])) == 0);
      assertTrue(op.intApply((Object)NgFloat.valueOf(lhsEqual[i]), (Object)BigDecimal.valueOf(rhsEqual[i])) == 0);
      assertTrue(op.intApply((Object)NgDouble.valueOf(lhsEqual[i]), (Object)BigDecimal.valueOf(rhsEqual[i])) == 0);
      assertTrue(op.intApply((Object)BigInteger.valueOf(lhsEqual[i]), (Object)BigDecimal.valueOf(rhsEqual[i])) == 0);
      assertTrue(op.intApply((Object)BigDecimal.valueOf(lhsEqual[i]), (Object)BigDecimal.valueOf(rhsEqual[i])) == 0);

      assertTrue(op.intApply(NgByte.valueOf((byte)lhsEqual[i]), byteMetaClass, NgByte.valueOf((byte)rhsEqual[i])) == 0);
      assertTrue(op.intApply(NgChar.valueOf((char)lhsEqual[i]), byteMetaClass, NgByte.valueOf((byte)rhsEqual[i])) == 0);
      assertTrue(op.intApply(NgShort.valueOf((short)lhsEqual[i]), byteMetaClass, NgByte.valueOf((byte)rhsEqual[i])) == 0);
      assertTrue(op.intApply(NgInt.valueOf(lhsEqual[i]), byteMetaClass, NgByte.valueOf((byte)rhsEqual[i])) == 0);
      assertTrue(op.intApply(NgLong.valueOf(lhsEqual[i]), byteMetaClass, NgByte.valueOf((byte)rhsEqual[i])) == 0);
      assertTrue(op.intApply(NgFloat.valueOf(lhsEqual[i]), byteMetaClass, NgByte.valueOf((byte)rhsEqual[i])) == 0);
      assertTrue(op.intApply(NgDouble.valueOf(lhsEqual[i]), byteMetaClass, NgByte.valueOf((byte)rhsEqual[i])) == 0);
      assertTrue(op.intApply((Object)BigInteger.valueOf(lhsEqual[i]), byteMetaClass, (Object)NgByte.valueOf((byte)rhsEqual[i])) == 0);
      assertTrue(op.intApply((Object)BigDecimal.valueOf(lhsEqual[i]), byteMetaClass, (Object)NgByte.valueOf((byte)rhsEqual[i])) == 0);

      assertTrue(op.intApply(NgByte.valueOf((byte)lhsEqual[i]), charMetaClass, NgChar.valueOf((char)rhsEqual[i])) == 0);
      assertTrue(op.intApply(NgChar.valueOf((char)lhsEqual[i]), charMetaClass, NgChar.valueOf((char)rhsEqual[i])) == 0);
      assertTrue(op.intApply(NgShort.valueOf((short)lhsEqual[i]), charMetaClass, NgChar.valueOf((char)rhsEqual[i])) == 0);
      assertTrue(op.intApply(NgInt.valueOf(lhsEqual[i]), charMetaClass, NgChar.valueOf((char)rhsEqual[i])) == 0);
      assertTrue(op.intApply(NgLong.valueOf(lhsEqual[i]), charMetaClass, NgChar.valueOf((char)rhsEqual[i])) == 0);
      assertTrue(op.intApply(NgFloat.valueOf(lhsEqual[i]), charMetaClass, NgChar.valueOf((char)rhsEqual[i])) == 0);
      assertTrue(op.intApply(NgDouble.valueOf(lhsEqual[i]), charMetaClass, NgChar.valueOf((char)rhsEqual[i])) == 0);
      assertTrue(op.intApply((Object)BigInteger.valueOf(lhsEqual[i]), charMetaClass, (Object)NgChar.valueOf((char)rhsEqual[i])) == 0);
      assertTrue(op.intApply((Object)BigDecimal.valueOf(lhsEqual[i]), charMetaClass, (Object)NgChar.valueOf((char)rhsEqual[i])) == 0);

      assertTrue(op.intApply(NgByte.valueOf((byte)lhsEqual[i]), shortMetaClass, NgShort.valueOf((short)rhsEqual[i])) == 0);
      assertTrue(op.intApply(NgChar.valueOf((char)lhsEqual[i]), shortMetaClass, NgShort.valueOf((short)rhsEqual[i])) == 0);
      assertTrue(op.intApply(NgShort.valueOf((short)lhsEqual[i]), shortMetaClass, NgShort.valueOf((short)rhsEqual[i])) == 0);
      assertTrue(op.intApply(NgInt.valueOf(lhsEqual[i]), shortMetaClass, NgShort.valueOf((short)rhsEqual[i])) == 0);
      assertTrue(op.intApply(NgLong.valueOf(lhsEqual[i]), shortMetaClass, NgShort.valueOf((short)rhsEqual[i])) == 0);
      assertTrue(op.intApply(NgFloat.valueOf(lhsEqual[i]), shortMetaClass, NgShort.valueOf((short)rhsEqual[i])) == 0);
      assertTrue(op.intApply(NgDouble.valueOf(lhsEqual[i]), shortMetaClass, NgShort.valueOf((short)rhsEqual[i])) == 0);
      assertTrue(op.intApply((Object)BigInteger.valueOf(lhsEqual[i]), shortMetaClass, (Object)NgShort.valueOf((short)rhsEqual[i])) == 0);
      assertTrue(op.intApply((Object)BigDecimal.valueOf(lhsEqual[i]), shortMetaClass, (Object)NgShort.valueOf((short)rhsEqual[i])) == 0);

      assertTrue(op.intApply(NgByte.valueOf((byte)lhsEqual[i]), intMetaClass, NgInt.valueOf(rhsEqual[i])) == 0);
      assertTrue(op.intApply(NgChar.valueOf((char)lhsEqual[i]), intMetaClass, NgInt.valueOf(rhsEqual[i])) == 0);
      assertTrue(op.intApply(NgShort.valueOf((short)lhsEqual[i]), intMetaClass, NgInt.valueOf(rhsEqual[i])) == 0);
      assertTrue(op.intApply(NgInt.valueOf(lhsEqual[i]), intMetaClass, NgInt.valueOf(rhsEqual[i])) == 0);
      assertTrue(op.intApply(NgLong.valueOf(lhsEqual[i]), intMetaClass, NgInt.valueOf(rhsEqual[i])) == 0);
      assertTrue(op.intApply(NgFloat.valueOf(lhsEqual[i]), intMetaClass, NgInt.valueOf(rhsEqual[i])) == 0);
      assertTrue(op.intApply(NgDouble.valueOf(lhsEqual[i]), intMetaClass, NgInt.valueOf(rhsEqual[i])) == 0);
      assertTrue(op.intApply((Object)BigInteger.valueOf(lhsEqual[i]), intMetaClass, (Object)NgInt.valueOf(rhsEqual[i])) == 0);
      assertTrue(op.intApply((Object)BigDecimal.valueOf(lhsEqual[i]), intMetaClass, (Object)NgInt.valueOf(rhsEqual[i])) == 0);

      assertTrue(op.intApply(NgByte.valueOf((byte)lhsEqual[i]), longMetaClass, NgLong.valueOf(rhsEqual[i])) == 0);
      assertTrue(op.intApply(NgChar.valueOf((char)lhsEqual[i]), longMetaClass, NgLong.valueOf(rhsEqual[i])) == 0);
      assertTrue(op.intApply(NgShort.valueOf((short)lhsEqual[i]), longMetaClass, NgLong.valueOf(rhsEqual[i])) == 0);
      assertTrue(op.intApply(NgInt.valueOf(lhsEqual[i]), longMetaClass, NgLong.valueOf(rhsEqual[i])) == 0);
      assertTrue(op.intApply(NgLong.valueOf(lhsEqual[i]), longMetaClass, NgLong.valueOf(rhsEqual[i])) == 0);
      assertTrue(op.intApply(NgFloat.valueOf(lhsEqual[i]), longMetaClass, NgLong.valueOf(rhsEqual[i])) == 0);
      assertTrue(op.intApply(NgDouble.valueOf(lhsEqual[i]), longMetaClass, NgLong.valueOf(rhsEqual[i])) == 0);
      assertTrue(op.intApply((Object)BigInteger.valueOf(lhsEqual[i]), longMetaClass, (Object)NgLong.valueOf(rhsEqual[i])) == 0);
      assertTrue(op.intApply((Object)BigDecimal.valueOf(lhsEqual[i]), longMetaClass, (Object)NgLong.valueOf(rhsEqual[i])) == 0);

      assertTrue(op.intApply(NgByte.valueOf((byte)lhsEqual[i]), floatMetaClass, NgFloat.valueOf(rhsEqual[i])) == 0);
      assertTrue(op.intApply(NgChar.valueOf((char)lhsEqual[i]), floatMetaClass, NgFloat.valueOf(rhsEqual[i])) == 0);
      assertTrue(op.intApply(NgShort.valueOf((short)lhsEqual[i]), floatMetaClass, NgFloat.valueOf(rhsEqual[i])) == 0);
      assertTrue(op.intApply(NgInt.valueOf(lhsEqual[i]), floatMetaClass, NgFloat.valueOf(rhsEqual[i])) == 0);
      assertTrue(op.intApply(NgLong.valueOf(lhsEqual[i]), floatMetaClass, NgFloat.valueOf(rhsEqual[i])) == 0);
      assertTrue(op.intApply(NgFloat.valueOf((float)lhsEqual[i]), floatMetaClass, NgFloat.valueOf((float)rhsEqual[i])) == 0);
      assertTrue(op.intApply((Object)NgDouble.valueOf((double)lhsEqual[i]), floatMetaClass, (Object)NgFloat.valueOf((float)rhsEqual[i])) == 0);
      assertTrue(op.intApply((Object)BigInteger.valueOf(lhsEqual[i]), floatMetaClass, (Object)NgFloat.valueOf((float)rhsEqual[i])) == 0);
      assertTrue(op.intApply((Object)BigDecimal.valueOf(lhsEqual[i]), floatMetaClass, (Object)NgFloat.valueOf((float)rhsEqual[i])) == 0);

      assertTrue(op.intApply((Object)NgByte.valueOf((byte)lhsEqual[i]), doubleMetaClass, (Object)NgDouble.valueOf((double)rhsEqual[i])) == 0);
      assertTrue(op.intApply((Object)NgChar.valueOf((char)lhsEqual[i]), doubleMetaClass, (Object)NgDouble.valueOf((double)rhsEqual[i])) == 0);
      assertTrue(op.intApply((Object)NgShort.valueOf((short)lhsEqual[i]), doubleMetaClass, (Object)NgDouble.valueOf((double)rhsEqual[i])) == 0);
      assertTrue(op.intApply((Object)NgInt.valueOf((int)lhsEqual[i]), doubleMetaClass, (Object)NgDouble.valueOf((double)rhsEqual[i])) == 0);
      assertTrue(op.intApply((Object)NgLong.valueOf((long)lhsEqual[i]), doubleMetaClass, (Object)NgDouble.valueOf((double)rhsEqual[i])) == 0);
      assertTrue(op.intApply((Object)NgFloat.valueOf((float)lhsEqual[i]), doubleMetaClass, (Object)NgDouble.valueOf((double)rhsEqual[i])) == 0);
      assertTrue(op.intApply((Object)NgDouble.valueOf((double)lhsEqual[i]), doubleMetaClass, (Object)NgDouble.valueOf((double)rhsEqual[i])) == 0);
      assertTrue(op.intApply((Object)BigInteger.valueOf(lhsEqual[i]), doubleMetaClass, (Object)NgDouble.valueOf((double)rhsEqual[i])) == 0);
      assertTrue(op.intApply((Object)BigDecimal.valueOf(lhsEqual[i]), doubleMetaClass, (Object)NgDouble.valueOf((double)rhsEqual[i])) == 0);

      assertTrue(op.intApply((Object)NgByte.valueOf((byte)lhsEqual[i]), bigIntegerMetaClass, (Object)BigInteger.valueOf(rhsEqual[i])) == 0);
      assertTrue(op.intApply((Object)NgChar.valueOf((char)lhsEqual[i]), bigIntegerMetaClass, (Object)BigInteger.valueOf(rhsEqual[i])) == 0);
      assertTrue(op.intApply((Object)NgShort.valueOf((short)lhsEqual[i]), bigIntegerMetaClass, (Object)BigInteger.valueOf(rhsEqual[i])) == 0);
      assertTrue(op.intApply((Object)NgInt.valueOf((int)lhsEqual[i]), bigIntegerMetaClass, (Object)BigInteger.valueOf(rhsEqual[i])) == 0);
      assertTrue(op.intApply((Object)NgLong.valueOf((long)lhsEqual[i]), bigIntegerMetaClass, (Object)BigInteger.valueOf(rhsEqual[i])) == 0);
      assertTrue(op.intApply((Object)NgFloat.valueOf((float)lhsEqual[i]), bigIntegerMetaClass, (Object)BigInteger.valueOf(rhsEqual[i])) == 0);
      assertTrue(op.intApply((Object)NgDouble.valueOf((double)lhsEqual[i]), bigIntegerMetaClass, (Object)BigInteger.valueOf(rhsEqual[i])) == 0);
      assertTrue(op.intApply((Object)BigInteger.valueOf(lhsEqual[i]), bigIntegerMetaClass, (Object)BigInteger.valueOf(rhsEqual[i])) == 0);
      assertTrue(op.intApply((Object)BigDecimal.valueOf(lhsEqual[i]), bigIntegerMetaClass, (Object)BigInteger.valueOf(rhsEqual[i])) == 0);

      assertTrue(op.intApply((Object)NgByte.valueOf((byte)lhsEqual[i]), bigDecimalMetaClass, (Object)BigDecimal.valueOf(rhsEqual[i])) == 0);
      assertTrue(op.intApply((Object)NgChar.valueOf((char)lhsEqual[i]), bigDecimalMetaClass, (Object)BigDecimal.valueOf(rhsEqual[i])) == 0);
      assertTrue(op.intApply((Object)NgShort.valueOf((short)lhsEqual[i]), bigDecimalMetaClass, (Object)BigDecimal.valueOf(rhsEqual[i])) == 0);
      assertTrue(op.intApply((Object)NgInt.valueOf((int)lhsEqual[i]), bigDecimalMetaClass, (Object)BigDecimal.valueOf(rhsEqual[i])) == 0);
      assertTrue(op.intApply((Object)NgLong.valueOf((long)lhsEqual[i]), bigDecimalMetaClass, (Object)BigDecimal.valueOf(rhsEqual[i])) == 0);
      assertTrue(op.intApply((Object)NgFloat.valueOf((float)lhsEqual[i]), bigDecimalMetaClass, (Object)BigDecimal.valueOf(rhsEqual[i])) == 0);
      assertTrue(op.intApply((Object)NgDouble.valueOf((double)lhsEqual[i]), bigDecimalMetaClass, (Object)BigDecimal.valueOf(rhsEqual[i])) == 0);
      assertTrue(op.intApply((Object)BigInteger.valueOf(lhsEqual[i]), bigDecimalMetaClass, (Object)BigDecimal.valueOf(rhsEqual[i])) == 0);
      assertTrue(op.intApply((Object)BigDecimal.valueOf(lhsEqual[i]), bigDecimalMetaClass, (Object)BigDecimal.valueOf(rhsEqual[i])) == 0);
    }

    for (int i = 0; i != lhsLessThan.length; i++) {

      assertTrue(tc.unwrapToInt(op.apply((byte)lhsLessThan[i], (byte)rhsLessThan[i])) == -1);
      assertTrue(tc.unwrapToInt(op.apply((char)lhsLessThan[i], (byte)rhsLessThan[i])) == -1);
      assertTrue(tc.unwrapToInt(op.apply((short)lhsLessThan[i], (byte)rhsLessThan[i])) == -1);
      assertTrue(tc.unwrapToInt(op.apply(lhsLessThan[i], (byte)rhsLessThan[i])) == -1);
      assertTrue(tc.unwrapToInt(op.apply((long)lhsLessThan[i], (byte)rhsLessThan[i])) == -1);
      assertTrue(tc.unwrapToInt(op.apply((float)lhsLessThan[i], (byte)rhsLessThan[i])) == -1);
      assertTrue(tc.unwrapToInt(op.apply((double)lhsLessThan[i], (byte)rhsLessThan[i])) == -1);
      assertTrue(tc.unwrapToInt(op.apply(BigInteger.valueOf(lhsLessThan[i]), (byte)rhsLessThan[i])) == -1);
      assertTrue(tc.unwrapToInt(op.apply(BigDecimal.valueOf(lhsLessThan[i]), (byte)rhsLessThan[i])) == -1);

      assertTrue(tc.unwrapToInt(op.apply((byte)lhsLessThan[i], (char)rhsLessThan[i])) == -1);
      assertTrue(tc.unwrapToInt(op.apply((char)lhsLessThan[i], (char)rhsLessThan[i])) == -1);
      assertTrue(tc.unwrapToInt(op.apply((short)lhsLessThan[i], (char)rhsLessThan[i])) == -1);
      assertTrue(tc.unwrapToInt(op.apply(lhsLessThan[i], (char)rhsLessThan[i])) == -1);
      assertTrue(tc.unwrapToInt(op.apply((long)lhsLessThan[i], (char)rhsLessThan[i])) == -1);
      assertTrue(tc.unwrapToInt(op.apply((float)lhsLessThan[i], (char)rhsLessThan[i])) == -1);
      assertTrue(tc.unwrapToInt(op.apply((double)lhsLessThan[i], (char)rhsLessThan[i])) == -1);
      assertTrue(tc.unwrapToInt(op.apply(BigInteger.valueOf(lhsLessThan[i]), (char)rhsLessThan[i])) == -1);
      assertTrue(tc.unwrapToInt(op.apply(BigDecimal.valueOf(lhsLessThan[i]), (char)rhsLessThan[i])) == -1);

      assertTrue(tc.unwrapToInt(op.apply((byte)lhsLessThan[i], (short)rhsLessThan[i])) == -1);
      assertTrue(tc.unwrapToInt(op.apply((char)lhsLessThan[i], (short)rhsLessThan[i])) == -1);
      assertTrue(tc.unwrapToInt(op.apply((short)lhsLessThan[i], (short)rhsLessThan[i])) == -1);
      assertTrue(tc.unwrapToInt(op.apply(lhsLessThan[i], (short)rhsLessThan[i])) == -1);
      assertTrue(tc.unwrapToInt(op.apply((long)lhsLessThan[i], (short)rhsLessThan[i])) == -1);
      assertTrue(tc.unwrapToInt(op.apply((float)lhsLessThan[i], (short)rhsLessThan[i])) == -1);
      assertTrue(tc.unwrapToInt(op.apply((double)lhsLessThan[i], (short)rhsLessThan[i])) == -1);
      assertTrue(tc.unwrapToInt(op.apply(BigInteger.valueOf(lhsLessThan[i]), (short)rhsLessThan[i])) == -1);
      assertTrue(tc.unwrapToInt(op.apply(BigDecimal.valueOf(lhsLessThan[i]), (short)rhsLessThan[i])) == -1);

      assertTrue(tc.unwrapToInt(op.apply((byte)lhsLessThan[i], rhsLessThan[i])) == -1);
      assertTrue(tc.unwrapToInt(op.apply((char)lhsLessThan[i], rhsLessThan[i])) == -1);
      assertTrue(tc.unwrapToInt(op.apply((short)lhsLessThan[i], rhsLessThan[i])) == -1);
      assertTrue(tc.unwrapToInt(op.apply(lhsLessThan[i], rhsLessThan[i])) == -1);
      assertTrue(tc.unwrapToInt(op.apply((long)lhsLessThan[i], rhsLessThan[i])) == -1);
      assertTrue(tc.unwrapToInt(op.apply((float)lhsLessThan[i], rhsLessThan[i])) == -1);
      assertTrue(tc.unwrapToInt(op.apply((double)lhsLessThan[i], rhsLessThan[i])) == -1);
      assertTrue(tc.unwrapToInt(op.apply(BigInteger.valueOf(lhsLessThan[i]), rhsLessThan[i])) == -1);
      assertTrue(tc.unwrapToInt(op.apply(BigDecimal.valueOf(lhsLessThan[i]), rhsLessThan[i])) == -1);

      assertTrue(tc.unwrapToInt(op.apply((byte)lhsLessThan[i], (long)rhsLessThan[i])) == -1);
      assertTrue(tc.unwrapToInt(op.apply((char)lhsLessThan[i], (long)rhsLessThan[i])) == -1);
      assertTrue(tc.unwrapToInt(op.apply((short)lhsLessThan[i], (long)rhsLessThan[i])) == -1);
      assertTrue(tc.unwrapToInt(op.apply(lhsLessThan[i], (long)rhsLessThan[i])) == -1);
      assertTrue(tc.unwrapToInt(op.apply((long)lhsLessThan[i], (long)rhsLessThan[i])) == -1);
      assertTrue(tc.unwrapToInt(op.apply((float)lhsLessThan[i], (long)rhsLessThan[i])) == -1);
      assertTrue(tc.unwrapToInt(op.apply((double)lhsLessThan[i], (long)rhsLessThan[i])) == -1);
      assertTrue(tc.unwrapToInt(op.apply(BigInteger.valueOf(lhsLessThan[i]), (long)rhsLessThan[i])) == -1);
      assertTrue(tc.unwrapToInt(op.apply(BigDecimal.valueOf(lhsLessThan[i]), (long)rhsLessThan[i])) == -1);

      assertTrue(tc.unwrapToInt(op.apply((byte)lhsLessThan[i], (float)rhsLessThan[i])) == -1);
      assertTrue(tc.unwrapToInt(op.apply((char)lhsLessThan[i], (float)rhsLessThan[i])) == -1);
      assertTrue(tc.unwrapToInt(op.apply((short)lhsLessThan[i], (float)rhsLessThan[i])) == -1);
      assertTrue(tc.unwrapToInt(op.apply(lhsLessThan[i], (float)rhsLessThan[i])) == -1);
      assertTrue(tc.unwrapToInt(op.apply((long)lhsLessThan[i], (float)rhsLessThan[i])) == -1);
      assertTrue(tc.unwrapToInt(op.apply((float)lhsLessThan[i], (float)rhsLessThan[i])) == -1);
      assertTrue(tc.unwrapToInt(op.apply((double)lhsLessThan[i], (float)rhsLessThan[i])) == -1);
      assertTrue(tc.unwrapToInt(op.apply(BigInteger.valueOf(lhsLessThan[i]), (float)rhsLessThan[i])) == -1);
      assertTrue(tc.unwrapToInt(op.apply(BigDecimal.valueOf(lhsLessThan[i]), (float)rhsLessThan[i])) == -1);

      assertTrue(tc.unwrapToInt(op.apply((byte)lhsLessThan[i], (double)rhsLessThan[i])) == -1);
      assertTrue(tc.unwrapToInt(op.apply((char)lhsLessThan[i], (double)rhsLessThan[i])) == -1);
      assertTrue(tc.unwrapToInt(op.apply((short)lhsLessThan[i], (double)rhsLessThan[i])) == -1);
      assertTrue(tc.unwrapToInt(op.apply(lhsLessThan[i], (double)rhsLessThan[i])) == -1);
      assertTrue(tc.unwrapToInt(op.apply((long)lhsLessThan[i], (double)rhsLessThan[i])) == -1);
      assertTrue(tc.unwrapToInt(op.apply((float)lhsLessThan[i], (double)rhsLessThan[i])) == -1);
      assertTrue(tc.unwrapToInt(op.apply((double)lhsLessThan[i], (double)rhsLessThan[i])) == -1);
      assertTrue(tc.unwrapToInt(op.apply(BigInteger.valueOf(lhsLessThan[i]), (double)rhsLessThan[i])) == -1);
      assertTrue(tc.unwrapToInt(op.apply(BigDecimal.valueOf(lhsLessThan[i]), (double)rhsLessThan[i])) == -1);

      assertTrue(tc.unwrapToInt(op.apply((byte)lhsLessThan[i], BigInteger.valueOf(rhsLessThan[i]))) == -1);
      assertTrue(tc.unwrapToInt(op.apply((char)lhsLessThan[i], BigInteger.valueOf(rhsLessThan[i]))) == -1);
      assertTrue(tc.unwrapToInt(op.apply((short)lhsLessThan[i], BigInteger.valueOf(rhsLessThan[i]))) == -1);
      assertTrue(tc.unwrapToInt(op.apply(lhsLessThan[i], BigInteger.valueOf(rhsLessThan[i]))) == -1);
      assertTrue(tc.unwrapToInt(op.apply((long)lhsLessThan[i], BigInteger.valueOf(rhsLessThan[i]))) == -1);
      assertTrue(tc.unwrapToInt(op.apply((float)lhsLessThan[i], BigInteger.valueOf(rhsLessThan[i]))) == -1);
      assertTrue(tc.unwrapToInt(op.apply((double)lhsLessThan[i], BigInteger.valueOf(rhsLessThan[i]))) == -1);
      assertTrue(tc.unwrapToInt(op.apply(BigInteger.valueOf(lhsLessThan[i]), BigInteger.valueOf(rhsLessThan[i]))) == -1);
      assertTrue(tc.unwrapToInt(op.apply(BigDecimal.valueOf(lhsLessThan[i]), BigInteger.valueOf(rhsLessThan[i]))) == -1);

      assertTrue(tc.unwrapToInt(op.apply((byte)lhsLessThan[i], BigDecimal.valueOf(rhsLessThan[i]))) == -1);
      assertTrue(tc.unwrapToInt(op.apply((char)lhsLessThan[i], BigDecimal.valueOf(rhsLessThan[i]))) == -1);
      assertTrue(tc.unwrapToInt(op.apply((short)lhsLessThan[i], BigDecimal.valueOf(rhsLessThan[i]))) == -1);
      assertTrue(tc.unwrapToInt(op.apply(lhsLessThan[i], BigDecimal.valueOf(rhsLessThan[i]))) == -1);
      assertTrue(tc.unwrapToInt(op.apply((long)lhsLessThan[i], BigDecimal.valueOf(rhsLessThan[i]))) == -1);
      assertTrue(tc.unwrapToInt(op.apply((float)lhsLessThan[i], BigDecimal.valueOf(rhsLessThan[i]))) == -1);
      assertTrue(tc.unwrapToInt(op.apply((double)lhsLessThan[i], BigDecimal.valueOf(rhsLessThan[i]))) == -1);
      assertTrue(tc.unwrapToInt(op.apply(BigInteger.valueOf(lhsLessThan[i]), BigDecimal.valueOf(rhsLessThan[i]))) == -1);
      assertTrue(tc.unwrapToInt(op.apply(BigDecimal.valueOf(lhsLessThan[i]), BigDecimal.valueOf(rhsLessThan[i]))) == -1);

      assertTrue(tc.unwrapToInt(op.apply((byte)lhsLessThan[i], NgByte.valueOf((byte)rhsLessThan[i]))) == -1);
      assertTrue(tc.unwrapToInt(op.apply((char)lhsLessThan[i], NgByte.valueOf((byte)rhsLessThan[i]))) == -1);
      assertTrue(tc.unwrapToInt(op.apply((short)lhsLessThan[i], NgByte.valueOf((byte)rhsLessThan[i]))) == -1);
      assertTrue(tc.unwrapToInt(op.apply(lhsLessThan[i], NgByte.valueOf((byte)rhsLessThan[i]))) == -1);
      assertTrue(tc.unwrapToInt(op.apply((long)lhsLessThan[i], NgByte.valueOf((byte)rhsLessThan[i]))) == -1);
      assertTrue(tc.unwrapToInt(op.apply((float)lhsLessThan[i], NgByte.valueOf((byte)rhsLessThan[i]))) == -1);
      assertTrue(tc.unwrapToInt(op.apply((double)lhsLessThan[i], NgByte.valueOf((byte)rhsLessThan[i]))) == -1);
      assertTrue(tc.unwrapToInt(op.apply(BigInteger.valueOf(lhsLessThan[i]), NgByte.valueOf((byte)rhsLessThan[i]))) == -1);
      assertTrue(tc.unwrapToInt(op.apply(BigDecimal.valueOf(lhsLessThan[i]), NgByte.valueOf((byte)rhsLessThan[i]))) == -1);

      assertTrue(tc.unwrapToInt(op.apply((byte)lhsLessThan[i], NgChar.valueOf((char)rhsLessThan[i]))) == -1);
      assertTrue(tc.unwrapToInt(op.apply((char)lhsLessThan[i], NgChar.valueOf((char)rhsLessThan[i]))) == -1);
      assertTrue(tc.unwrapToInt(op.apply((short)lhsLessThan[i], NgChar.valueOf((char)rhsLessThan[i]))) == -1);
      assertTrue(tc.unwrapToInt(op.apply(lhsLessThan[i], NgChar.valueOf((char)rhsLessThan[i]))) == -1);
      assertTrue(tc.unwrapToInt(op.apply((long)lhsLessThan[i], NgChar.valueOf((char)rhsLessThan[i]))) == -1);
      assertTrue(tc.unwrapToInt(op.apply((float)lhsLessThan[i], NgChar.valueOf((char)rhsLessThan[i]))) == -1);
      assertTrue(tc.unwrapToInt(op.apply((double)lhsLessThan[i], NgChar.valueOf((char)rhsLessThan[i]))) == -1);
      assertTrue(tc.unwrapToInt(op.apply(BigInteger.valueOf(lhsLessThan[i]), NgChar.valueOf((char)rhsLessThan[i]))) == -1);
      assertTrue(tc.unwrapToInt(op.apply(BigDecimal.valueOf(lhsLessThan[i]), NgChar.valueOf((char)rhsLessThan[i]))) == -1);

      assertTrue(tc.unwrapToInt(op.apply((byte)lhsLessThan[i], NgShort.valueOf((short)rhsLessThan[i]))) == -1);
      assertTrue(tc.unwrapToInt(op.apply((char)lhsLessThan[i], NgShort.valueOf((short)rhsLessThan[i]))) == -1);
      assertTrue(tc.unwrapToInt(op.apply((short)lhsLessThan[i], NgShort.valueOf((short)rhsLessThan[i]))) == -1);
      assertTrue(tc.unwrapToInt(op.apply(lhsLessThan[i], NgShort.valueOf((short)rhsLessThan[i]))) == -1);
      assertTrue(tc.unwrapToInt(op.apply((long)lhsLessThan[i], NgShort.valueOf((short)rhsLessThan[i]))) == -1);
      assertTrue(tc.unwrapToInt(op.apply((float)lhsLessThan[i], NgShort.valueOf((short)rhsLessThan[i]))) == -1);
      assertTrue(tc.unwrapToInt(op.apply((double)lhsLessThan[i], NgShort.valueOf((short)rhsLessThan[i]))) == -1);
      assertTrue(tc.unwrapToInt(op.apply(BigInteger.valueOf(lhsLessThan[i]), NgShort.valueOf((short)rhsLessThan[i]))) == -1);
      assertTrue(tc.unwrapToInt(op.apply(BigDecimal.valueOf(lhsLessThan[i]), NgShort.valueOf((short)rhsLessThan[i]))) == -1);

      assertTrue(tc.unwrapToInt(op.apply((byte)lhsLessThan[i], NgInt.valueOf(rhsLessThan[i]))) == -1);
      assertTrue(tc.unwrapToInt(op.apply((char)lhsLessThan[i], NgInt.valueOf(rhsLessThan[i]))) == -1);
      assertTrue(tc.unwrapToInt(op.apply((short)lhsLessThan[i], NgInt.valueOf(rhsLessThan[i]))) == -1);
      assertTrue(tc.unwrapToInt(op.apply(lhsLessThan[i], NgInt.valueOf(rhsLessThan[i]))) == -1);
      assertTrue(tc.unwrapToInt(op.apply((long)lhsLessThan[i], NgInt.valueOf(rhsLessThan[i]))) == -1);
      assertTrue(tc.unwrapToInt(op.apply((float)lhsLessThan[i], NgInt.valueOf(rhsLessThan[i]))) == -1);
      assertTrue(tc.unwrapToInt(op.apply((double)lhsLessThan[i], NgInt.valueOf(rhsLessThan[i]))) == -1);
      assertTrue(tc.unwrapToInt(op.apply(BigInteger.valueOf(lhsLessThan[i]), NgInt.valueOf(rhsLessThan[i]))) == -1);
      assertTrue(tc.unwrapToInt(op.apply(BigDecimal.valueOf(lhsLessThan[i]), NgInt.valueOf(rhsLessThan[i]))) == -1);

      assertTrue(tc.unwrapToInt(op.apply((byte)lhsLessThan[i], NgLong.valueOf(rhsLessThan[i]))) == -1);
      assertTrue(tc.unwrapToInt(op.apply((char)lhsLessThan[i], NgLong.valueOf(rhsLessThan[i]))) == -1);
      assertTrue(tc.unwrapToInt(op.apply((short)lhsLessThan[i], NgLong.valueOf(rhsLessThan[i]))) == -1);
      assertTrue(tc.unwrapToInt(op.apply(lhsLessThan[i], NgLong.valueOf(rhsLessThan[i]))) == -1);
      assertTrue(tc.unwrapToInt(op.apply((long)lhsLessThan[i], NgLong.valueOf(rhsLessThan[i]))) == -1);
      assertTrue(tc.unwrapToInt(op.apply((float)lhsLessThan[i], NgLong.valueOf(rhsLessThan[i]))) == -1);
      assertTrue(tc.unwrapToInt(op.apply((double)lhsLessThan[i], NgLong.valueOf(rhsLessThan[i]))) == -1);
      assertTrue(tc.unwrapToInt(op.apply(BigInteger.valueOf(lhsLessThan[i]), NgLong.valueOf(rhsLessThan[i]))) == -1);
      assertTrue(tc.unwrapToInt(op.apply(BigDecimal.valueOf(lhsLessThan[i]), NgLong.valueOf(rhsLessThan[i]))) == -1);

      assertTrue(tc.unwrapToInt(op.apply((byte)lhsLessThan[i], NgFloat.valueOf(rhsLessThan[i]))) == -1);
      assertTrue(tc.unwrapToInt(op.apply((char)lhsLessThan[i], NgFloat.valueOf(rhsLessThan[i]))) == -1);
      assertTrue(tc.unwrapToInt(op.apply((short)lhsLessThan[i], NgFloat.valueOf(rhsLessThan[i]))) == -1);
      assertTrue(tc.unwrapToInt(op.apply(lhsLessThan[i], NgFloat.valueOf(rhsLessThan[i]))) == -1);
      assertTrue(tc.unwrapToInt(op.apply((long)lhsLessThan[i], NgFloat.valueOf(rhsLessThan[i]))) == -1);
      assertTrue(tc.unwrapToInt(op.apply((float)lhsLessThan[i], NgFloat.valueOf(rhsLessThan[i]))) == -1);
      assertTrue(tc.unwrapToInt(op.apply((double)lhsLessThan[i], NgFloat.valueOf(rhsLessThan[i]))) == -1);
      assertTrue(tc.unwrapToInt(op.apply(BigInteger.valueOf(lhsLessThan[i]), NgFloat.valueOf(rhsLessThan[i]))) == -1);
      assertTrue(tc.unwrapToInt(op.apply(BigDecimal.valueOf(lhsLessThan[i]), NgFloat.valueOf(rhsLessThan[i]))) == -1);

      assertTrue(tc.unwrapToInt(op.apply((byte)lhsLessThan[i], NgDouble.valueOf(rhsLessThan[i]))) == -1);
      assertTrue(tc.unwrapToInt(op.apply((char)lhsLessThan[i], NgDouble.valueOf(rhsLessThan[i]))) == -1);
      assertTrue(tc.unwrapToInt(op.apply((short)lhsLessThan[i], NgDouble.valueOf(rhsLessThan[i]))) == -1);
      assertTrue(tc.unwrapToInt(op.apply(lhsLessThan[i], NgDouble.valueOf(rhsLessThan[i]))) == -1);
      assertTrue(tc.unwrapToInt(op.apply((long)lhsLessThan[i], NgDouble.valueOf(rhsLessThan[i]))) == -1);
      assertTrue(tc.unwrapToInt(op.apply((float)lhsLessThan[i], NgDouble.valueOf(rhsLessThan[i]))) == -1);
      assertTrue(tc.unwrapToInt(op.apply((double)lhsLessThan[i], NgDouble.valueOf(rhsLessThan[i]))) == -1);
      assertTrue(tc.unwrapToInt(op.apply(BigInteger.valueOf(lhsLessThan[i]), NgDouble.valueOf(rhsLessThan[i]))) == -1);
      assertTrue(tc.unwrapToInt(op.apply(BigDecimal.valueOf(lhsLessThan[i]), NgDouble.valueOf(rhsLessThan[i]))) == -1);

      assertTrue(tc.unwrapToInt(op.apply(NgByte.valueOf((byte)lhsLessThan[i]), NgByte.valueOf((byte)rhsLessThan[i]))) == -1);
      assertTrue(tc.unwrapToInt(op.apply(NgChar.valueOf((char)lhsLessThan[i]), NgByte.valueOf((byte)rhsLessThan[i]))) == -1);
      assertTrue(tc.unwrapToInt(op.apply(NgShort.valueOf((short)lhsLessThan[i]), NgByte.valueOf((byte)rhsLessThan[i]))) == -1);
      assertTrue(tc.unwrapToInt(op.apply(NgInt.valueOf(lhsLessThan[i]), NgByte.valueOf((byte)rhsLessThan[i]))) == -1);
      assertTrue(tc.unwrapToInt(op.apply(NgLong.valueOf(lhsLessThan[i]), NgByte.valueOf((byte)rhsLessThan[i]))) == -1);
      assertTrue(tc.unwrapToInt(op.apply(NgFloat.valueOf(lhsLessThan[i]), NgByte.valueOf((byte)rhsLessThan[i]))) == -1);
      assertTrue(tc.unwrapToInt(op.apply(NgDouble.valueOf(lhsLessThan[i]), NgByte.valueOf((byte)rhsLessThan[i]))) == -1);
      assertTrue(tc.unwrapToInt(op.apply(BigInteger.valueOf(lhsLessThan[i]), NgByte.valueOf((byte)rhsLessThan[i]))) == -1);
      assertTrue(tc.unwrapToInt(op.apply(BigDecimal.valueOf(lhsLessThan[i]), NgByte.valueOf((byte)rhsLessThan[i]))) == -1);

      assertTrue(tc.unwrapToInt(op.apply(NgByte.valueOf((byte)lhsLessThan[i]), NgChar.valueOf((char)rhsLessThan[i]))) == -1);
      assertTrue(tc.unwrapToInt(op.apply(NgChar.valueOf((char)lhsLessThan[i]), NgChar.valueOf((char)rhsLessThan[i]))) == -1);
      assertTrue(tc.unwrapToInt(op.apply(NgShort.valueOf((short)lhsLessThan[i]), NgChar.valueOf((char)rhsLessThan[i]))) == -1);
      assertTrue(tc.unwrapToInt(op.apply(NgInt.valueOf(lhsLessThan[i]), NgChar.valueOf((char)rhsLessThan[i]))) == -1);
      assertTrue(tc.unwrapToInt(op.apply(NgLong.valueOf(lhsLessThan[i]), NgChar.valueOf((char)rhsLessThan[i]))) == -1);
      assertTrue(tc.unwrapToInt(op.apply(NgFloat.valueOf(lhsLessThan[i]), NgChar.valueOf((char)rhsLessThan[i]))) == -1);
      assertTrue(tc.unwrapToInt(op.apply(NgDouble.valueOf(lhsLessThan[i]), NgChar.valueOf((char)rhsLessThan[i]))) == -1);
      assertTrue(tc.unwrapToInt(op.apply(BigInteger.valueOf(lhsLessThan[i]), NgChar.valueOf((char)rhsLessThan[i]))) == -1);
      assertTrue(tc.unwrapToInt(op.apply(BigDecimal.valueOf(lhsLessThan[i]), NgChar.valueOf((char)rhsLessThan[i]))) == -1);

      assertTrue(tc.unwrapToInt(op.apply(NgByte.valueOf((byte)lhsLessThan[i]), NgShort.valueOf((short)rhsLessThan[i]))) == -1);
      assertTrue(tc.unwrapToInt(op.apply(NgChar.valueOf((char)lhsLessThan[i]), NgShort.valueOf((short)rhsLessThan[i]))) == -1);
      assertTrue(tc.unwrapToInt(op.apply(NgShort.valueOf((short)lhsLessThan[i]), NgShort.valueOf((short)rhsLessThan[i]))) == -1);
      assertTrue(tc.unwrapToInt(op.apply(NgInt.valueOf(lhsLessThan[i]), NgShort.valueOf((short)rhsLessThan[i]))) == -1);
      assertTrue(tc.unwrapToInt(op.apply(NgLong.valueOf(lhsLessThan[i]), NgShort.valueOf((short)rhsLessThan[i]))) == -1);
      assertTrue(tc.unwrapToInt(op.apply(NgFloat.valueOf(lhsLessThan[i]), NgShort.valueOf((short)rhsLessThan[i]))) == -1);
      assertTrue(tc.unwrapToInt(op.apply(NgDouble.valueOf(lhsLessThan[i]), NgShort.valueOf((short)rhsLessThan[i]))) == -1);
      assertTrue(tc.unwrapToInt(op.apply(BigInteger.valueOf(lhsLessThan[i]), NgShort.valueOf((short)rhsLessThan[i]))) == -1);
      assertTrue(tc.unwrapToInt(op.apply(BigDecimal.valueOf(lhsLessThan[i]), NgShort.valueOf((short)rhsLessThan[i]))) == -1);

      assertTrue(tc.unwrapToInt(op.apply(NgByte.valueOf((byte)lhsLessThan[i]), NgInt.valueOf(rhsLessThan[i]))) == -1);
      assertTrue(tc.unwrapToInt(op.apply(NgChar.valueOf((char)lhsLessThan[i]), NgInt.valueOf(rhsLessThan[i]))) == -1);
      assertTrue(tc.unwrapToInt(op.apply(NgShort.valueOf((short)lhsLessThan[i]), NgInt.valueOf(rhsLessThan[i]))) == -1);
      assertTrue(tc.unwrapToInt(op.apply(NgInt.valueOf(lhsLessThan[i]), NgInt.valueOf(rhsLessThan[i]))) == -1);
      assertTrue(tc.unwrapToInt(op.apply(NgLong.valueOf(lhsLessThan[i]), NgInt.valueOf(rhsLessThan[i]))) == -1);
      assertTrue(tc.unwrapToInt(op.apply(NgFloat.valueOf(lhsLessThan[i]), NgInt.valueOf(rhsLessThan[i]))) == -1);
      assertTrue(tc.unwrapToInt(op.apply(NgDouble.valueOf(lhsLessThan[i]), NgInt.valueOf(rhsLessThan[i]))) == -1);
      assertTrue(tc.unwrapToInt(op.apply(BigInteger.valueOf(lhsLessThan[i]), NgInt.valueOf(rhsLessThan[i]))) == -1);
      assertTrue(tc.unwrapToInt(op.apply(BigDecimal.valueOf(lhsLessThan[i]), NgInt.valueOf(rhsLessThan[i]))) == -1);

      assertTrue(tc.unwrapToInt(op.apply(NgByte.valueOf((byte)lhsLessThan[i]), NgLong.valueOf(rhsLessThan[i]))) == -1);
      assertTrue(tc.unwrapToInt(op.apply(NgChar.valueOf((char)lhsLessThan[i]), NgLong.valueOf(rhsLessThan[i]))) == -1);
      assertTrue(tc.unwrapToInt(op.apply(NgShort.valueOf((short)lhsLessThan[i]), NgLong.valueOf(rhsLessThan[i]))) == -1);
      assertTrue(tc.unwrapToInt(op.apply(NgInt.valueOf(lhsLessThan[i]), NgLong.valueOf(rhsLessThan[i]))) == -1);
      assertTrue(tc.unwrapToInt(op.apply(NgLong.valueOf(lhsLessThan[i]), NgLong.valueOf(rhsLessThan[i]))) == -1);
      assertTrue(tc.unwrapToInt(op.apply(NgFloat.valueOf(lhsLessThan[i]), NgLong.valueOf(rhsLessThan[i]))) == -1);
      assertTrue(tc.unwrapToInt(op.apply(NgDouble.valueOf(lhsLessThan[i]), NgLong.valueOf(rhsLessThan[i]))) == -1);
      assertTrue(tc.unwrapToInt(op.apply(BigInteger.valueOf(lhsLessThan[i]), NgLong.valueOf(rhsLessThan[i]))) == -1);
      assertTrue(tc.unwrapToInt(op.apply(BigDecimal.valueOf(lhsLessThan[i]), NgLong.valueOf(rhsLessThan[i]))) == -1);

      assertTrue(tc.unwrapToInt(op.apply(NgByte.valueOf((byte)lhsLessThan[i]), NgFloat.valueOf(rhsLessThan[i]))) == -1);
      assertTrue(tc.unwrapToInt(op.apply(NgChar.valueOf((char)lhsLessThan[i]), NgFloat.valueOf(rhsLessThan[i]))) == -1);
      assertTrue(tc.unwrapToInt(op.apply(NgShort.valueOf((short)lhsLessThan[i]), NgFloat.valueOf(rhsLessThan[i]))) == -1);
      assertTrue(tc.unwrapToInt(op.apply(NgInt.valueOf(lhsLessThan[i]), NgFloat.valueOf(rhsLessThan[i]))) == -1);
      assertTrue(tc.unwrapToInt(op.apply(NgLong.valueOf(lhsLessThan[i]), NgFloat.valueOf(rhsLessThan[i]))) == -1);
      assertTrue(tc.unwrapToInt(op.apply(NgFloat.valueOf(lhsLessThan[i]), NgFloat.valueOf(rhsLessThan[i]))) == -1);
      assertTrue(tc.unwrapToInt(op.apply(NgDouble.valueOf(lhsLessThan[i]), NgFloat.valueOf(rhsLessThan[i]))) == -1);
      assertTrue(tc.unwrapToInt(op.apply(BigInteger.valueOf(lhsLessThan[i]), NgFloat.valueOf(rhsLessThan[i]))) == -1);
      assertTrue(tc.unwrapToInt(op.apply(BigDecimal.valueOf(lhsLessThan[i]), NgFloat.valueOf(rhsLessThan[i]))) == -1);

      assertTrue(tc.unwrapToInt(op.apply(NgByte.valueOf((byte)lhsLessThan[i]), NgDouble.valueOf(rhsLessThan[i]))) == -1);
      assertTrue(tc.unwrapToInt(op.apply(NgChar.valueOf((char)lhsLessThan[i]), NgDouble.valueOf(rhsLessThan[i]))) == -1);
      assertTrue(tc.unwrapToInt(op.apply(NgShort.valueOf((short)lhsLessThan[i]), NgDouble.valueOf(rhsLessThan[i]))) == -1);
      assertTrue(tc.unwrapToInt(op.apply(NgInt.valueOf(lhsLessThan[i]), NgDouble.valueOf(rhsLessThan[i]))) == -1);
      assertTrue(tc.unwrapToInt(op.apply(NgLong.valueOf(lhsLessThan[i]), NgDouble.valueOf(rhsLessThan[i]))) == -1);
      assertTrue(tc.unwrapToInt(op.apply(NgFloat.valueOf(lhsLessThan[i]), NgDouble.valueOf(rhsLessThan[i]))) == -1);
      assertTrue(tc.unwrapToInt(op.apply(NgDouble.valueOf(lhsLessThan[i]), NgDouble.valueOf(rhsLessThan[i]))) == -1);
      assertTrue(tc.unwrapToInt(op.apply(BigInteger.valueOf(lhsLessThan[i]), NgDouble.valueOf(rhsLessThan[i]))) == -1);
      assertTrue(tc.unwrapToInt(op.apply(BigDecimal.valueOf(lhsLessThan[i]), NgDouble.valueOf(rhsLessThan[i]))) == -1);

      assertTrue(tc.unwrapToInt(op.apply(NgByte.valueOf((byte)lhsLessThan[i]), BigInteger.valueOf(rhsLessThan[i]))) == -1);
      assertTrue(tc.unwrapToInt(op.apply(NgChar.valueOf((char)lhsLessThan[i]), BigInteger.valueOf(rhsLessThan[i]))) == -1);
      assertTrue(tc.unwrapToInt(op.apply(NgShort.valueOf((short)lhsLessThan[i]), BigInteger.valueOf(rhsLessThan[i]))) == -1);
      assertTrue(tc.unwrapToInt(op.apply(NgInt.valueOf(lhsLessThan[i]), BigInteger.valueOf(rhsLessThan[i]))) == -1);
      assertTrue(tc.unwrapToInt(op.apply(NgLong.valueOf(lhsLessThan[i]), BigInteger.valueOf(rhsLessThan[i]))) == -1);
      assertTrue(tc.unwrapToInt(op.apply(NgFloat.valueOf(lhsLessThan[i]), BigInteger.valueOf(rhsLessThan[i]))) == -1);
      assertTrue(tc.unwrapToInt(op.apply(NgDouble.valueOf(lhsLessThan[i]), BigInteger.valueOf(rhsLessThan[i]))) == -1);
      assertTrue(tc.unwrapToInt(op.apply(BigInteger.valueOf(lhsLessThan[i]), BigInteger.valueOf(rhsLessThan[i]))) == -1);
      assertTrue(tc.unwrapToInt(op.apply(BigDecimal.valueOf(lhsLessThan[i]), BigInteger.valueOf(rhsLessThan[i]))) == -1);

      assertTrue(tc.unwrapToInt(op.apply(NgByte.valueOf((byte)lhsLessThan[i]), BigDecimal.valueOf(rhsLessThan[i]))) == -1);
      assertTrue(tc.unwrapToInt(op.apply(NgChar.valueOf((char)lhsLessThan[i]), BigDecimal.valueOf(rhsLessThan[i]))) == -1);
      assertTrue(tc.unwrapToInt(op.apply(NgShort.valueOf((short)lhsLessThan[i]), BigDecimal.valueOf(rhsLessThan[i]))) == -1);
      assertTrue(tc.unwrapToInt(op.apply(NgInt.valueOf(lhsLessThan[i]), BigDecimal.valueOf(rhsLessThan[i]))) == -1);
      assertTrue(tc.unwrapToInt(op.apply(NgLong.valueOf(lhsLessThan[i]), BigDecimal.valueOf(rhsLessThan[i]))) == -1);
      assertTrue(tc.unwrapToInt(op.apply(NgFloat.valueOf(lhsLessThan[i]), BigDecimal.valueOf(rhsLessThan[i]))) == -1);
      assertTrue(tc.unwrapToInt(op.apply(NgDouble.valueOf(lhsLessThan[i]), BigDecimal.valueOf(rhsLessThan[i]))) == -1);
      assertTrue(tc.unwrapToInt(op.apply(BigInteger.valueOf(lhsLessThan[i]), BigDecimal.valueOf(rhsLessThan[i]))) == -1);
      assertTrue(tc.unwrapToInt(op.apply(BigDecimal.valueOf(lhsLessThan[i]), BigDecimal.valueOf(rhsLessThan[i]))) == -1);

      assertTrue(tc.unwrapToInt(op.apply(NgByte.valueOf((byte)lhsLessThan[i]), NgByte.valueOf((byte)rhsLessThan[i]))) == -1);
      assertTrue(tc.unwrapToInt(op.apply(NgChar.valueOf((char)lhsLessThan[i]), NgByte.valueOf((byte)rhsLessThan[i]))) == -1);
      assertTrue(tc.unwrapToInt(op.apply(NgShort.valueOf((short)lhsLessThan[i]), NgByte.valueOf((byte)rhsLessThan[i]))) == -1);
      assertTrue(tc.unwrapToInt(op.apply(NgInt.valueOf(lhsLessThan[i]), NgByte.valueOf((byte)rhsLessThan[i]))) == -1);
      assertTrue(tc.unwrapToInt(op.apply(NgLong.valueOf(lhsLessThan[i]), NgByte.valueOf((byte)rhsLessThan[i]))) == -1);
      assertTrue(tc.unwrapToInt(op.apply(NgFloat.valueOf(lhsLessThan[i]), NgByte.valueOf((byte)rhsLessThan[i]))) == -1);
      assertTrue(tc.unwrapToInt(op.apply(NgDouble.valueOf(lhsLessThan[i]), NgByte.valueOf((byte)rhsLessThan[i]))) == -1);
      assertTrue(tc.unwrapToInt(op.apply((Object)BigInteger.valueOf(lhsLessThan[i]), (Object)NgByte.valueOf((byte)rhsLessThan[i]))) == -1);
      assertTrue(tc.unwrapToInt(op.apply((Object)BigDecimal.valueOf(lhsLessThan[i]), (Object)NgByte.valueOf((byte)rhsLessThan[i]))) == -1);

      assertTrue(tc.unwrapToInt(op.apply(NgByte.valueOf((byte)lhsLessThan[i]), NgChar.valueOf((char)rhsLessThan[i]))) == -1);
      assertTrue(tc.unwrapToInt(op.apply(NgChar.valueOf((char)lhsLessThan[i]), NgChar.valueOf((char)rhsLessThan[i]))) == -1);
      assertTrue(tc.unwrapToInt(op.apply(NgShort.valueOf((short)lhsLessThan[i]), NgChar.valueOf((char)rhsLessThan[i]))) == -1);
      assertTrue(tc.unwrapToInt(op.apply(NgInt.valueOf(lhsLessThan[i]), NgChar.valueOf((char)rhsLessThan[i]))) == -1);
      assertTrue(tc.unwrapToInt(op.apply(NgLong.valueOf(lhsLessThan[i]), NgChar.valueOf((char)rhsLessThan[i]))) == -1);
      assertTrue(tc.unwrapToInt(op.apply(NgFloat.valueOf(lhsLessThan[i]), NgChar.valueOf((char)rhsLessThan[i]))) == -1);
      assertTrue(tc.unwrapToInt(op.apply(NgDouble.valueOf(lhsLessThan[i]), NgChar.valueOf((char)rhsLessThan[i]))) == -1);
      assertTrue(tc.unwrapToInt(op.apply((Object)BigInteger.valueOf(lhsLessThan[i]), (Object)NgChar.valueOf((char)rhsLessThan[i]))) == -1);
      assertTrue(tc.unwrapToInt(op.apply((Object)BigDecimal.valueOf(lhsLessThan[i]), (Object)NgChar.valueOf((char)rhsLessThan[i]))) == -1);

      assertTrue(tc.unwrapToInt(op.apply(NgByte.valueOf((byte)lhsLessThan[i]), NgShort.valueOf((short)rhsLessThan[i]))) == -1);
      assertTrue(tc.unwrapToInt(op.apply(NgChar.valueOf((char)lhsLessThan[i]), NgShort.valueOf((short)rhsLessThan[i]))) == -1);
      assertTrue(tc.unwrapToInt(op.apply(NgShort.valueOf((short)lhsLessThan[i]), NgShort.valueOf((short)rhsLessThan[i]))) == -1);
      assertTrue(tc.unwrapToInt(op.apply(NgInt.valueOf(lhsLessThan[i]), NgShort.valueOf((short)rhsLessThan[i]))) == -1);
      assertTrue(tc.unwrapToInt(op.apply(NgLong.valueOf(lhsLessThan[i]), NgShort.valueOf((short)rhsLessThan[i]))) == -1);
      assertTrue(tc.unwrapToInt(op.apply(NgFloat.valueOf(lhsLessThan[i]), NgShort.valueOf((short)rhsLessThan[i]))) == -1);
      assertTrue(tc.unwrapToInt(op.apply(NgDouble.valueOf(lhsLessThan[i]), NgShort.valueOf((short)rhsLessThan[i]))) == -1);
      assertTrue(tc.unwrapToInt(op.apply((Object)BigInteger.valueOf(lhsLessThan[i]), (Object)NgShort.valueOf((short)rhsLessThan[i]))) == -1);
      assertTrue(tc.unwrapToInt(op.apply((Object)BigDecimal.valueOf(lhsLessThan[i]), (Object)NgShort.valueOf((short)rhsLessThan[i]))) == -1);

      assertTrue(tc.unwrapToInt(op.apply(NgByte.valueOf((byte)lhsLessThan[i]), NgInt.valueOf(rhsLessThan[i]))) == -1);
      assertTrue(tc.unwrapToInt(op.apply(NgChar.valueOf((char)lhsLessThan[i]), NgInt.valueOf(rhsLessThan[i]))) == -1);
      assertTrue(tc.unwrapToInt(op.apply(NgShort.valueOf((short)lhsLessThan[i]), NgInt.valueOf(rhsLessThan[i]))) == -1);
      assertTrue(tc.unwrapToInt(op.apply(NgInt.valueOf(lhsLessThan[i]), NgInt.valueOf(rhsLessThan[i]))) == -1);
      assertTrue(tc.unwrapToInt(op.apply(NgLong.valueOf(lhsLessThan[i]), NgInt.valueOf(rhsLessThan[i]))) == -1);
      assertTrue(tc.unwrapToInt(op.apply(NgFloat.valueOf(lhsLessThan[i]), NgInt.valueOf(rhsLessThan[i]))) == -1);
      assertTrue(tc.unwrapToInt(op.apply(NgDouble.valueOf(lhsLessThan[i]), NgInt.valueOf(rhsLessThan[i]))) == -1);
      assertTrue(tc.unwrapToInt(op.apply((Object)BigInteger.valueOf(lhsLessThan[i]), (Object)NgInt.valueOf(rhsLessThan[i]))) == -1);
      assertTrue(tc.unwrapToInt(op.apply((Object)BigDecimal.valueOf(lhsLessThan[i]), (Object)NgInt.valueOf(rhsLessThan[i]))) == -1);

      assertTrue(tc.unwrapToInt(op.apply(NgByte.valueOf((byte)lhsLessThan[i]), NgLong.valueOf(rhsLessThan[i]))) == -1);
      assertTrue(tc.unwrapToInt(op.apply(NgChar.valueOf((char)lhsLessThan[i]), NgLong.valueOf(rhsLessThan[i]))) == -1);
      assertTrue(tc.unwrapToInt(op.apply(NgShort.valueOf((short)lhsLessThan[i]), NgLong.valueOf(rhsLessThan[i]))) == -1);
      assertTrue(tc.unwrapToInt(op.apply(NgInt.valueOf(lhsLessThan[i]), NgLong.valueOf(rhsLessThan[i]))) == -1);
      assertTrue(tc.unwrapToInt(op.apply(NgLong.valueOf(lhsLessThan[i]), NgLong.valueOf(rhsLessThan[i]))) == -1);
      assertTrue(tc.unwrapToInt(op.apply(NgFloat.valueOf(lhsLessThan[i]), NgLong.valueOf(rhsLessThan[i]))) == -1);
      assertTrue(tc.unwrapToInt(op.apply(NgDouble.valueOf(lhsLessThan[i]), NgLong.valueOf(rhsLessThan[i]))) == -1);
      assertTrue(tc.unwrapToInt(op.apply((Object)BigInteger.valueOf(lhsLessThan[i]), (Object)NgLong.valueOf(rhsLessThan[i]))) == -1);
      assertTrue(tc.unwrapToInt(op.apply((Object)BigDecimal.valueOf(lhsLessThan[i]), (Object)NgLong.valueOf(rhsLessThan[i]))) == -1);

      assertTrue(tc.unwrapToInt(op.apply(NgByte.valueOf((byte)lhsLessThan[i]), NgFloat.valueOf(rhsLessThan[i]))) == -1);
      assertTrue(tc.unwrapToInt(op.apply(NgChar.valueOf((char)lhsLessThan[i]), NgFloat.valueOf(rhsLessThan[i]))) == -1);
      assertTrue(tc.unwrapToInt(op.apply(NgShort.valueOf((short)lhsLessThan[i]), NgFloat.valueOf(rhsLessThan[i]))) == -1);
      assertTrue(tc.unwrapToInt(op.apply(NgInt.valueOf(lhsLessThan[i]), NgFloat.valueOf(rhsLessThan[i]))) == -1);
      assertTrue(tc.unwrapToInt(op.apply(NgLong.valueOf(lhsLessThan[i]), NgFloat.valueOf(rhsLessThan[i]))) == -1);
      assertTrue(tc.unwrapToInt(op.apply(NgFloat.valueOf(lhsLessThan[i]), NgFloat.valueOf(rhsLessThan[i]))) == -1);
      assertTrue(tc.unwrapToInt(op.apply(NgDouble.valueOf(lhsLessThan[i]), NgFloat.valueOf(rhsLessThan[i]))) == -1);
      assertTrue(tc.unwrapToInt(op.apply((Object)BigInteger.valueOf(lhsLessThan[i]), (Object)NgFloat.valueOf(rhsLessThan[i]))) == -1);
      assertTrue(tc.unwrapToInt(op.apply((Object)BigDecimal.valueOf(lhsLessThan[i]), (Object)NgFloat.valueOf(rhsLessThan[i]))) == -1);

      assertTrue(tc.unwrapToInt(op.apply(NgByte.valueOf((byte)lhsLessThan[i]), NgDouble.valueOf(rhsLessThan[i]))) == -1);
      assertTrue(tc.unwrapToInt(op.apply(NgChar.valueOf((char)lhsLessThan[i]), NgDouble.valueOf(rhsLessThan[i]))) == -1);
      assertTrue(tc.unwrapToInt(op.apply(NgShort.valueOf((short)lhsLessThan[i]), NgDouble.valueOf(rhsLessThan[i]))) == -1);
      assertTrue(tc.unwrapToInt(op.apply(NgInt.valueOf(lhsLessThan[i]), NgDouble.valueOf(rhsLessThan[i]))) == -1);
      assertTrue(tc.unwrapToInt(op.apply(NgLong.valueOf(lhsLessThan[i]), NgDouble.valueOf(rhsLessThan[i]))) == -1);
      assertTrue(tc.unwrapToInt(op.apply(NgFloat.valueOf(lhsLessThan[i]), NgDouble.valueOf(rhsLessThan[i]))) == -1);
      assertTrue(tc.unwrapToInt(op.apply(NgDouble.valueOf(lhsLessThan[i]), NgDouble.valueOf(rhsLessThan[i]))) == -1);
      assertTrue(tc.unwrapToInt(op.apply((Object)BigInteger.valueOf(lhsLessThan[i]), (Object)NgDouble.valueOf(rhsLessThan[i]))) == -1);
      assertTrue(tc.unwrapToInt(op.apply((Object)BigDecimal.valueOf(lhsLessThan[i]), (Object)NgDouble.valueOf(rhsLessThan[i]))) == -1);

      assertTrue(tc.unwrapToInt(op.apply((Object)NgByte.valueOf((byte)lhsLessThan[i]), (Object)BigInteger.valueOf(rhsLessThan[i]))) == -1);
      assertTrue(tc.unwrapToInt(op.apply((Object)NgChar.valueOf((char)lhsLessThan[i]), (Object)BigInteger.valueOf(rhsLessThan[i]))) == -1);
      assertTrue(tc.unwrapToInt(op.apply((Object)NgShort.valueOf((short)lhsLessThan[i]), (Object)BigInteger.valueOf(rhsLessThan[i]))) == -1);
      assertTrue(tc.unwrapToInt(op.apply((Object)NgInt.valueOf(lhsLessThan[i]), (Object)BigInteger.valueOf(rhsLessThan[i]))) == -1);
      assertTrue(tc.unwrapToInt(op.apply((Object)NgLong.valueOf(lhsLessThan[i]), (Object)BigInteger.valueOf(rhsLessThan[i]))) == -1);
      assertTrue(tc.unwrapToInt(op.apply((Object)NgFloat.valueOf(lhsLessThan[i]), (Object)BigInteger.valueOf(rhsLessThan[i]))) == -1);
      assertTrue(tc.unwrapToInt(op.apply((Object)NgDouble.valueOf(lhsLessThan[i]), (Object)BigInteger.valueOf(rhsLessThan[i]))) == -1);
      assertTrue(tc.unwrapToInt(op.apply((Object)BigInteger.valueOf(lhsLessThan[i]), (Object)BigInteger.valueOf(rhsLessThan[i]))) == -1);
      assertTrue(tc.unwrapToInt(op.apply((Object)BigDecimal.valueOf(lhsLessThan[i]), (Object)BigInteger.valueOf(rhsLessThan[i]))) == -1);

      assertTrue(tc.unwrapToInt(op.apply((Object)NgByte.valueOf((byte)lhsLessThan[i]), (Object)BigDecimal.valueOf(rhsLessThan[i]))) == -1);
      assertTrue(tc.unwrapToInt(op.apply((Object)NgChar.valueOf((char)lhsLessThan[i]), (Object)BigDecimal.valueOf(rhsLessThan[i]))) == -1);
      assertTrue(tc.unwrapToInt(op.apply((Object)NgShort.valueOf((short)lhsLessThan[i]), (Object)BigDecimal.valueOf(rhsLessThan[i]))) == -1);
      assertTrue(tc.unwrapToInt(op.apply((Object)NgInt.valueOf(lhsLessThan[i]), (Object)BigDecimal.valueOf(rhsLessThan[i]))) == -1);
      assertTrue(tc.unwrapToInt(op.apply((Object)NgLong.valueOf(lhsLessThan[i]), (Object)BigDecimal.valueOf(rhsLessThan[i]))) == -1);
      assertTrue(tc.unwrapToInt(op.apply((Object)NgFloat.valueOf(lhsLessThan[i]), (Object)BigDecimal.valueOf(rhsLessThan[i]))) == -1);
      assertTrue(tc.unwrapToInt(op.apply((Object)NgDouble.valueOf(lhsLessThan[i]), (Object)BigDecimal.valueOf(rhsLessThan[i]))) == -1);
      assertTrue(tc.unwrapToInt(op.apply((Object)BigInteger.valueOf(lhsLessThan[i]), (Object)BigDecimal.valueOf(rhsLessThan[i]))) == -1);
      assertTrue(tc.unwrapToInt(op.apply((Object)BigDecimal.valueOf(lhsLessThan[i]), (Object)BigDecimal.valueOf(rhsLessThan[i]))) == -1);

      assertTrue(op.intApply(NgByte.valueOf((byte)lhsLessThan[i]), NgByte.valueOf((byte)rhsLessThan[i])) == -1);
      assertTrue(op.intApply(NgChar.valueOf((char)lhsLessThan[i]), NgByte.valueOf((byte)rhsLessThan[i])) == -1);
      assertTrue(op.intApply(NgShort.valueOf((short)lhsLessThan[i]), NgByte.valueOf((byte)rhsLessThan[i])) == -1);
      assertTrue(op.intApply(NgInt.valueOf(lhsLessThan[i]), NgByte.valueOf((byte)rhsLessThan[i])) == -1);
      assertTrue(op.intApply(NgLong.valueOf(lhsLessThan[i]), NgByte.valueOf((byte)rhsLessThan[i])) == -1);
      assertTrue(op.intApply(NgFloat.valueOf(lhsLessThan[i]), NgByte.valueOf((byte)rhsLessThan[i])) == -1);
      assertTrue(op.intApply(NgDouble.valueOf(lhsLessThan[i]), NgByte.valueOf((byte)rhsLessThan[i])) == -1);
      assertTrue(op.intApply((Object)BigInteger.valueOf(lhsLessThan[i]), (Object)NgByte.valueOf((byte)rhsLessThan[i])) == -1);
      assertTrue(op.intApply((Object)BigDecimal.valueOf(lhsLessThan[i]), (Object)NgByte.valueOf((byte)rhsLessThan[i])) == -1);

      assertTrue(op.intApply(NgByte.valueOf((byte)lhsLessThan[i]), NgChar.valueOf((char)rhsLessThan[i])) == -1);
      assertTrue(op.intApply(NgChar.valueOf((char)lhsLessThan[i]), NgChar.valueOf((char)rhsLessThan[i])) == -1);
      assertTrue(op.intApply(NgShort.valueOf((short)lhsLessThan[i]), NgChar.valueOf((char)rhsLessThan[i])) == -1);
      assertTrue(op.intApply(NgInt.valueOf(lhsLessThan[i]), NgChar.valueOf((char)rhsLessThan[i])) == -1);
      assertTrue(op.intApply(NgLong.valueOf(lhsLessThan[i]), NgChar.valueOf((char)rhsLessThan[i])) == -1);
      assertTrue(op.intApply(NgFloat.valueOf(lhsLessThan[i]), NgChar.valueOf((char)rhsLessThan[i])) == -1);
      assertTrue(op.intApply(NgDouble.valueOf(lhsLessThan[i]), NgChar.valueOf((char)rhsLessThan[i])) == -1);
      assertTrue(op.intApply((Object)BigInteger.valueOf(lhsLessThan[i]), (Object)NgChar.valueOf((char)rhsLessThan[i])) == -1);
      assertTrue(op.intApply((Object)BigDecimal.valueOf(lhsLessThan[i]), (Object)NgChar.valueOf((char)rhsLessThan[i])) == -1);

      assertTrue(op.intApply(NgByte.valueOf((byte)lhsLessThan[i]), NgShort.valueOf((short)rhsLessThan[i])) == -1);
      assertTrue(op.intApply(NgChar.valueOf((char)lhsLessThan[i]), NgShort.valueOf((short)rhsLessThan[i])) == -1);
      assertTrue(op.intApply(NgShort.valueOf((short)lhsLessThan[i]), NgShort.valueOf((short)rhsLessThan[i])) == -1);
      assertTrue(op.intApply(NgInt.valueOf(lhsLessThan[i]), NgShort.valueOf((short)rhsLessThan[i])) == -1);
      assertTrue(op.intApply(NgLong.valueOf(lhsLessThan[i]), NgShort.valueOf((short)rhsLessThan[i])) == -1);
      assertTrue(op.intApply(NgFloat.valueOf(lhsLessThan[i]), NgShort.valueOf((short)rhsLessThan[i])) == -1);
      assertTrue(op.intApply(NgDouble.valueOf(lhsLessThan[i]), NgShort.valueOf((short)rhsLessThan[i])) == -1);
      assertTrue(op.intApply((Object)BigInteger.valueOf(lhsLessThan[i]), (Object)NgShort.valueOf((short)rhsLessThan[i])) == -1);
      assertTrue(op.intApply((Object)BigDecimal.valueOf(lhsLessThan[i]), (Object)NgShort.valueOf((short)rhsLessThan[i])) == -1);

      assertTrue(op.intApply(NgByte.valueOf((byte)lhsLessThan[i]), NgInt.valueOf(rhsLessThan[i])) == -1);
      assertTrue(op.intApply(NgChar.valueOf((char)lhsLessThan[i]), NgInt.valueOf(rhsLessThan[i])) == -1);
      assertTrue(op.intApply(NgShort.valueOf((short)lhsLessThan[i]), NgInt.valueOf(rhsLessThan[i])) == -1);
      assertTrue(op.intApply(NgInt.valueOf(lhsLessThan[i]), NgInt.valueOf(rhsLessThan[i])) == -1);
      assertTrue(op.intApply(NgLong.valueOf(lhsLessThan[i]), NgInt.valueOf(rhsLessThan[i])) == -1);
      assertTrue(op.intApply(NgFloat.valueOf(lhsLessThan[i]), NgInt.valueOf(rhsLessThan[i])) == -1);
      assertTrue(op.intApply(NgDouble.valueOf(lhsLessThan[i]), NgInt.valueOf(rhsLessThan[i])) == -1);
      assertTrue(op.intApply((Object)BigInteger.valueOf(lhsLessThan[i]), (Object)NgInt.valueOf(rhsLessThan[i])) == -1);
      assertTrue(op.intApply((Object)BigDecimal.valueOf(lhsLessThan[i]), (Object)NgInt.valueOf(rhsLessThan[i])) == -1);

      assertTrue(op.intApply(NgByte.valueOf((byte)lhsLessThan[i]), NgLong.valueOf(rhsLessThan[i])) == -1);
      assertTrue(op.intApply(NgChar.valueOf((char)lhsLessThan[i]), NgLong.valueOf(rhsLessThan[i])) == -1);
      assertTrue(op.intApply(NgShort.valueOf((short)lhsLessThan[i]), NgLong.valueOf(rhsLessThan[i])) == -1);
      assertTrue(op.intApply(NgInt.valueOf(lhsLessThan[i]), NgLong.valueOf(rhsLessThan[i])) == -1);
      assertTrue(op.intApply(NgLong.valueOf(lhsLessThan[i]), NgLong.valueOf(rhsLessThan[i])) == -1);
      assertTrue(op.intApply(NgFloat.valueOf(lhsLessThan[i]), NgLong.valueOf(rhsLessThan[i])) == -1);
      assertTrue(op.intApply(NgDouble.valueOf(lhsLessThan[i]), NgLong.valueOf(rhsLessThan[i])) == -1);
      assertTrue(op.intApply((Object)BigInteger.valueOf(lhsLessThan[i]), (Object)NgLong.valueOf(rhsLessThan[i])) == -1);
      assertTrue(op.intApply((Object)BigDecimal.valueOf(lhsLessThan[i]), (Object)NgLong.valueOf(rhsLessThan[i])) == -1);

      assertTrue(op.intApply(NgByte.valueOf((byte)lhsLessThan[i]), NgFloat.valueOf(rhsLessThan[i])) == -1);
      assertTrue(op.intApply(NgChar.valueOf((char)lhsLessThan[i]), NgFloat.valueOf(rhsLessThan[i])) == -1);
      assertTrue(op.intApply(NgShort.valueOf((short)lhsLessThan[i]), NgFloat.valueOf(rhsLessThan[i])) == -1);
      assertTrue(op.intApply(NgInt.valueOf(lhsLessThan[i]), NgFloat.valueOf(rhsLessThan[i])) == -1);
      assertTrue(op.intApply(NgLong.valueOf(lhsLessThan[i]), NgFloat.valueOf(rhsLessThan[i])) == -1);
      assertTrue(op.intApply(NgFloat.valueOf(lhsLessThan[i]), NgFloat.valueOf(rhsLessThan[i])) == -1);
      assertTrue(op.intApply(NgDouble.valueOf(lhsLessThan[i]), NgFloat.valueOf(rhsLessThan[i])) == -1);
      assertTrue(op.intApply((Object)BigInteger.valueOf(lhsLessThan[i]), (Object)NgFloat.valueOf(rhsLessThan[i])) == -1);
      assertTrue(op.intApply((Object)BigDecimal.valueOf(lhsLessThan[i]), (Object)NgFloat.valueOf(rhsLessThan[i])) == -1);

      assertTrue(op.intApply(NgByte.valueOf((byte)lhsLessThan[i]), NgDouble.valueOf(rhsLessThan[i])) == -1);
      assertTrue(op.intApply(NgChar.valueOf((char)lhsLessThan[i]), NgDouble.valueOf(rhsLessThan[i])) == -1);
      assertTrue(op.intApply(NgShort.valueOf((short)lhsLessThan[i]), NgDouble.valueOf(rhsLessThan[i])) == -1);
      assertTrue(op.intApply(NgInt.valueOf(lhsLessThan[i]), NgDouble.valueOf(rhsLessThan[i])) == -1);
      assertTrue(op.intApply(NgLong.valueOf(lhsLessThan[i]), NgDouble.valueOf(rhsLessThan[i])) == -1);
      assertTrue(op.intApply(NgFloat.valueOf(lhsLessThan[i]), NgDouble.valueOf(rhsLessThan[i])) == -1);
      assertTrue(op.intApply(NgDouble.valueOf(lhsLessThan[i]), NgDouble.valueOf(rhsLessThan[i])) == -1);
      assertTrue(op.intApply((Object)BigInteger.valueOf(lhsLessThan[i]), (Object)NgDouble.valueOf(rhsLessThan[i])) == -1);
      assertTrue(op.intApply((Object)BigDecimal.valueOf(lhsLessThan[i]), (Object)NgDouble.valueOf(rhsLessThan[i])) == -1);

      assertTrue(op.intApply((Object)NgByte.valueOf((byte)lhsLessThan[i]), (Object)BigInteger.valueOf(rhsLessThan[i])) == -1);
      assertTrue(op.intApply((Object)NgChar.valueOf((char)lhsLessThan[i]), (Object)BigInteger.valueOf(rhsLessThan[i])) == -1);
      assertTrue(op.intApply((Object)NgShort.valueOf((short)lhsLessThan[i]), (Object)BigInteger.valueOf(rhsLessThan[i])) == -1);
      assertTrue(op.intApply((Object)NgInt.valueOf(lhsLessThan[i]), (Object)BigInteger.valueOf(rhsLessThan[i])) == -1);
      assertTrue(op.intApply((Object)NgLong.valueOf(lhsLessThan[i]), (Object)BigInteger.valueOf(rhsLessThan[i])) == -1);
      assertTrue(op.intApply((Object)NgFloat.valueOf(lhsLessThan[i]), (Object)BigInteger.valueOf(rhsLessThan[i])) == -1);
      assertTrue(op.intApply((Object)NgDouble.valueOf(lhsLessThan[i]), (Object)BigInteger.valueOf(rhsLessThan[i])) == -1);
      assertTrue(op.intApply((Object)BigInteger.valueOf(lhsLessThan[i]), (Object)BigInteger.valueOf(rhsLessThan[i])) == -1);
      assertTrue(op.intApply((Object)BigDecimal.valueOf(lhsLessThan[i]), (Object)BigInteger.valueOf(rhsLessThan[i])) == -1);

      assertTrue(op.intApply((Object)NgByte.valueOf((byte)lhsLessThan[i]), (Object)BigDecimal.valueOf(rhsLessThan[i])) == -1);
      assertTrue(op.intApply((Object)NgChar.valueOf((char)lhsLessThan[i]), (Object)BigDecimal.valueOf(rhsLessThan[i])) == -1);
      assertTrue(op.intApply((Object)NgShort.valueOf((short)lhsLessThan[i]), (Object)BigDecimal.valueOf(rhsLessThan[i])) == -1);
      assertTrue(op.intApply((Object)NgInt.valueOf(lhsLessThan[i]), (Object)BigDecimal.valueOf(rhsLessThan[i])) == -1);
      assertTrue(op.intApply((Object)NgLong.valueOf(lhsLessThan[i]), (Object)BigDecimal.valueOf(rhsLessThan[i])) == -1);
      assertTrue(op.intApply((Object)NgFloat.valueOf(lhsLessThan[i]), (Object)BigDecimal.valueOf(rhsLessThan[i])) == -1);
      assertTrue(op.intApply((Object)NgDouble.valueOf(lhsLessThan[i]), (Object)BigDecimal.valueOf(rhsLessThan[i])) == -1);
      assertTrue(op.intApply((Object)BigInteger.valueOf(lhsLessThan[i]), (Object)BigDecimal.valueOf(rhsLessThan[i])) == -1);
      assertTrue(op.intApply((Object)BigDecimal.valueOf(lhsLessThan[i]), (Object)BigDecimal.valueOf(rhsLessThan[i])) == -1);

      assertTrue(op.intApply(NgByte.valueOf((byte)lhsLessThan[i]), byteMetaClass, NgByte.valueOf((byte)rhsLessThan[i])) == -1);
      assertTrue(op.intApply(NgChar.valueOf((char)lhsLessThan[i]), byteMetaClass, NgByte.valueOf((byte)rhsLessThan[i])) == -1);
      assertTrue(op.intApply(NgShort.valueOf((short)lhsLessThan[i]), byteMetaClass, NgByte.valueOf((byte)rhsLessThan[i])) == -1);
      assertTrue(op.intApply(NgInt.valueOf(lhsLessThan[i]), byteMetaClass, NgByte.valueOf((byte)rhsLessThan[i])) == -1);
      assertTrue(op.intApply(NgLong.valueOf(lhsLessThan[i]), byteMetaClass, NgByte.valueOf((byte)rhsLessThan[i])) == -1);
      assertTrue(op.intApply(NgFloat.valueOf(lhsLessThan[i]), byteMetaClass, NgByte.valueOf((byte)rhsLessThan[i])) == -1);
      assertTrue(op.intApply(NgDouble.valueOf(lhsLessThan[i]), byteMetaClass, NgByte.valueOf((byte)rhsLessThan[i])) == -1);
      assertTrue(op.intApply((Object)BigInteger.valueOf(lhsLessThan[i]), byteMetaClass, (Object)NgByte.valueOf((byte)rhsLessThan[i])) == -1);
      assertTrue(op.intApply((Object)BigDecimal.valueOf(lhsLessThan[i]), byteMetaClass, (Object)NgByte.valueOf((byte)rhsLessThan[i])) == -1);

      assertTrue(op.intApply(NgByte.valueOf((byte)lhsLessThan[i]), charMetaClass, NgChar.valueOf((char)rhsLessThan[i])) == -1);
      assertTrue(op.intApply(NgChar.valueOf((char)lhsLessThan[i]), charMetaClass, NgChar.valueOf((char)rhsLessThan[i])) == -1);
      assertTrue(op.intApply(NgShort.valueOf((short)lhsLessThan[i]), charMetaClass, NgChar.valueOf((char)rhsLessThan[i])) == -1);
      assertTrue(op.intApply(NgInt.valueOf(lhsLessThan[i]), charMetaClass, NgChar.valueOf((char)rhsLessThan[i])) == -1);
      assertTrue(op.intApply(NgLong.valueOf(lhsLessThan[i]), charMetaClass, NgChar.valueOf((char)rhsLessThan[i])) == -1);
      assertTrue(op.intApply(NgFloat.valueOf(lhsLessThan[i]), charMetaClass, NgChar.valueOf((char)rhsLessThan[i])) == -1);
      assertTrue(op.intApply(NgDouble.valueOf(lhsLessThan[i]), charMetaClass, NgChar.valueOf((char)rhsLessThan[i])) == -1);
      assertTrue(op.intApply((Object)BigInteger.valueOf(lhsLessThan[i]), charMetaClass, (Object)NgChar.valueOf((char)rhsLessThan[i])) == -1);
      assertTrue(op.intApply((Object)BigDecimal.valueOf(lhsLessThan[i]), charMetaClass, (Object)NgChar.valueOf((char)rhsLessThan[i])) == -1);

      assertTrue(op.intApply(NgByte.valueOf((byte)lhsLessThan[i]), shortMetaClass, NgShort.valueOf((short)rhsLessThan[i])) == -1);
      assertTrue(op.intApply(NgChar.valueOf((char)lhsLessThan[i]), shortMetaClass, NgShort.valueOf((short)rhsLessThan[i])) == -1);
      assertTrue(op.intApply(NgShort.valueOf((short)lhsLessThan[i]), shortMetaClass, NgShort.valueOf((short)rhsLessThan[i])) == -1);
      assertTrue(op.intApply(NgInt.valueOf(lhsLessThan[i]), shortMetaClass, NgShort.valueOf((short)rhsLessThan[i])) == -1);
      assertTrue(op.intApply(NgLong.valueOf(lhsLessThan[i]), shortMetaClass, NgShort.valueOf((short)rhsLessThan[i])) == -1);
      assertTrue(op.intApply(NgFloat.valueOf(lhsLessThan[i]), shortMetaClass, NgShort.valueOf((short)rhsLessThan[i])) == -1);
      assertTrue(op.intApply(NgDouble.valueOf(lhsLessThan[i]), shortMetaClass, NgShort.valueOf((short)rhsLessThan[i])) == -1);
      assertTrue(op.intApply((Object)BigInteger.valueOf(lhsLessThan[i]), shortMetaClass, (Object)NgShort.valueOf((short)rhsLessThan[i])) == -1);
      assertTrue(op.intApply((Object)BigDecimal.valueOf(lhsLessThan[i]), shortMetaClass, (Object)NgShort.valueOf((short)rhsLessThan[i])) == -1);

      assertTrue(op.intApply(NgByte.valueOf((byte)lhsLessThan[i]), intMetaClass, NgInt.valueOf(rhsLessThan[i])) == -1);
      assertTrue(op.intApply(NgChar.valueOf((char)lhsLessThan[i]), intMetaClass, NgInt.valueOf(rhsLessThan[i])) == -1);
      assertTrue(op.intApply(NgShort.valueOf((short)lhsLessThan[i]), intMetaClass, NgInt.valueOf(rhsLessThan[i])) == -1);
      assertTrue(op.intApply(NgInt.valueOf(lhsLessThan[i]), intMetaClass, NgInt.valueOf(rhsLessThan[i])) == -1);
      assertTrue(op.intApply(NgLong.valueOf(lhsLessThan[i]), intMetaClass, NgInt.valueOf(rhsLessThan[i])) == -1);
      assertTrue(op.intApply(NgFloat.valueOf(lhsLessThan[i]), intMetaClass, NgInt.valueOf(rhsLessThan[i])) == -1);
      assertTrue(op.intApply(NgDouble.valueOf(lhsLessThan[i]), intMetaClass, NgInt.valueOf(rhsLessThan[i])) == -1);
      assertTrue(op.intApply((Object)BigInteger.valueOf(lhsLessThan[i]), intMetaClass, (Object)NgInt.valueOf(rhsLessThan[i])) == -1);
      assertTrue(op.intApply((Object)BigDecimal.valueOf(lhsLessThan[i]), intMetaClass, (Object)NgInt.valueOf(rhsLessThan[i])) == -1);

      assertTrue(op.intApply(NgByte.valueOf((byte)lhsLessThan[i]), longMetaClass, NgLong.valueOf(rhsLessThan[i])) == -1);
      assertTrue(op.intApply(NgChar.valueOf((char)lhsLessThan[i]), longMetaClass, NgLong.valueOf(rhsLessThan[i])) == -1);
      assertTrue(op.intApply(NgShort.valueOf((short)lhsLessThan[i]), longMetaClass, NgLong.valueOf(rhsLessThan[i])) == -1);
      assertTrue(op.intApply(NgInt.valueOf(lhsLessThan[i]), longMetaClass, NgLong.valueOf(rhsLessThan[i])) == -1);
      assertTrue(op.intApply(NgLong.valueOf(lhsLessThan[i]), longMetaClass, NgLong.valueOf(rhsLessThan[i])) == -1);
      assertTrue(op.intApply(NgFloat.valueOf(lhsLessThan[i]), longMetaClass, NgLong.valueOf(rhsLessThan[i])) == -1);
      assertTrue(op.intApply(NgDouble.valueOf(lhsLessThan[i]), longMetaClass, NgLong.valueOf(rhsLessThan[i])) == -1);
      assertTrue(op.intApply((Object)BigInteger.valueOf(lhsLessThan[i]), longMetaClass, (Object)NgLong.valueOf(rhsLessThan[i])) == -1);
      assertTrue(op.intApply((Object)BigDecimal.valueOf(lhsLessThan[i]), longMetaClass, (Object)NgLong.valueOf(rhsLessThan[i])) == -1);

      assertTrue(op.intApply(NgByte.valueOf((byte)lhsLessThan[i]), floatMetaClass, NgFloat.valueOf(rhsLessThan[i])) == -1);
      assertTrue(op.intApply(NgChar.valueOf((char)lhsLessThan[i]), floatMetaClass, NgFloat.valueOf(rhsLessThan[i])) == -1);
      assertTrue(op.intApply(NgShort.valueOf((short)lhsLessThan[i]), floatMetaClass, NgFloat.valueOf(rhsLessThan[i])) == -1);
      assertTrue(op.intApply(NgInt.valueOf(lhsLessThan[i]), floatMetaClass, NgFloat.valueOf(rhsLessThan[i])) == -1);
      assertTrue(op.intApply(NgLong.valueOf(lhsLessThan[i]), floatMetaClass, NgFloat.valueOf(rhsLessThan[i])) == -1);
      assertTrue(op.intApply(NgFloat.valueOf((float)lhsLessThan[i]), floatMetaClass, NgFloat.valueOf((float)rhsLessThan[i])) == -1);
      assertTrue(op.intApply((Object)NgDouble.valueOf((double)lhsLessThan[i]), floatMetaClass, (Object)NgFloat.valueOf((float)rhsLessThan[i])) == -1);
      assertTrue(op.intApply((Object)BigInteger.valueOf(lhsLessThan[i]), floatMetaClass, (Object)NgFloat.valueOf((float)rhsLessThan[i])) == -1);
      assertTrue(op.intApply((Object)BigDecimal.valueOf(lhsLessThan[i]), floatMetaClass, (Object)NgFloat.valueOf((float)rhsLessThan[i])) == -1);

      assertTrue(op.intApply((Object)NgByte.valueOf((byte)lhsLessThan[i]), doubleMetaClass, (Object)NgDouble.valueOf((double)rhsLessThan[i])) == -1);
      assertTrue(op.intApply((Object)NgChar.valueOf((char)lhsLessThan[i]), doubleMetaClass, (Object)NgDouble.valueOf((double)rhsLessThan[i])) == -1);
      assertTrue(op.intApply((Object)NgShort.valueOf((short)lhsLessThan[i]), doubleMetaClass, (Object)NgDouble.valueOf((double)rhsLessThan[i])) == -1);
      assertTrue(op.intApply((Object)NgInt.valueOf((int)lhsLessThan[i]), doubleMetaClass, (Object)NgDouble.valueOf((double)rhsLessThan[i])) == -1);
      assertTrue(op.intApply((Object)NgLong.valueOf((long)lhsLessThan[i]), doubleMetaClass, (Object)NgDouble.valueOf((double)rhsLessThan[i])) == -1);
      assertTrue(op.intApply((Object)NgFloat.valueOf((float)lhsLessThan[i]), doubleMetaClass, (Object)NgDouble.valueOf((double)rhsLessThan[i])) == -1);
      assertTrue(op.intApply((Object)NgDouble.valueOf((double)lhsLessThan[i]), doubleMetaClass, (Object)NgDouble.valueOf((double)rhsLessThan[i])) == -1);
      assertTrue(op.intApply((Object)BigInteger.valueOf(lhsLessThan[i]), doubleMetaClass, (Object)NgDouble.valueOf((double)rhsLessThan[i])) == -1);
      assertTrue(op.intApply((Object)BigDecimal.valueOf(lhsLessThan[i]), doubleMetaClass, (Object)NgDouble.valueOf((double)rhsLessThan[i])) == -1);

      assertTrue(op.intApply((Object)NgByte.valueOf((byte)lhsLessThan[i]), bigIntegerMetaClass, (Object)BigInteger.valueOf(rhsLessThan[i])) == -1);
      assertTrue(op.intApply((Object)NgChar.valueOf((char)lhsLessThan[i]), bigIntegerMetaClass, (Object)BigInteger.valueOf(rhsLessThan[i])) == -1);
      assertTrue(op.intApply((Object)NgShort.valueOf((short)lhsLessThan[i]), bigIntegerMetaClass, (Object)BigInteger.valueOf(rhsLessThan[i])) == -1);
      assertTrue(op.intApply((Object)NgInt.valueOf((int)lhsLessThan[i]), bigIntegerMetaClass, (Object)BigInteger.valueOf(rhsLessThan[i])) == -1);
      assertTrue(op.intApply((Object)NgLong.valueOf((long)lhsLessThan[i]), bigIntegerMetaClass, (Object)BigInteger.valueOf(rhsLessThan[i])) == -1);
      assertTrue(op.intApply((Object)NgFloat.valueOf((float)lhsLessThan[i]), bigIntegerMetaClass, (Object)BigInteger.valueOf(rhsLessThan[i])) == -1);
      assertTrue(op.intApply((Object)NgDouble.valueOf((double)lhsLessThan[i]), bigIntegerMetaClass, (Object)BigInteger.valueOf(rhsLessThan[i])) == -1);
      assertTrue(op.intApply((Object)BigInteger.valueOf(lhsLessThan[i]), bigIntegerMetaClass, (Object)BigInteger.valueOf(rhsLessThan[i])) == -1);
      assertTrue(op.intApply((Object)BigDecimal.valueOf(lhsLessThan[i]), bigIntegerMetaClass, (Object)BigInteger.valueOf(rhsLessThan[i])) == -1);

      assertTrue(op.intApply((Object)NgByte.valueOf((byte)lhsLessThan[i]), bigDecimalMetaClass, (Object)BigDecimal.valueOf(rhsLessThan[i])) == -1);
      assertTrue(op.intApply((Object)NgChar.valueOf((char)lhsLessThan[i]), bigDecimalMetaClass, (Object)BigDecimal.valueOf(rhsLessThan[i])) == -1);
      assertTrue(op.intApply((Object)NgShort.valueOf((short)lhsLessThan[i]), bigDecimalMetaClass, (Object)BigDecimal.valueOf(rhsLessThan[i])) == -1);
      assertTrue(op.intApply((Object)NgInt.valueOf((int)lhsLessThan[i]), bigDecimalMetaClass, (Object)BigDecimal.valueOf(rhsLessThan[i])) == -1);
      assertTrue(op.intApply((Object)NgLong.valueOf((long)lhsLessThan[i]), bigDecimalMetaClass, (Object)BigDecimal.valueOf(rhsLessThan[i])) == -1);
      assertTrue(op.intApply((Object)NgFloat.valueOf((float)lhsLessThan[i]), bigDecimalMetaClass, (Object)BigDecimal.valueOf(rhsLessThan[i])) == -1);
      assertTrue(op.intApply((Object)NgDouble.valueOf((double)lhsLessThan[i]), bigDecimalMetaClass, (Object)BigDecimal.valueOf(rhsLessThan[i])) == -1);
      assertTrue(op.intApply((Object)BigInteger.valueOf(lhsLessThan[i]), bigDecimalMetaClass, (Object)BigDecimal.valueOf(rhsLessThan[i])) == -1);
      assertTrue(op.intApply((Object)BigDecimal.valueOf(lhsLessThan[i]), bigDecimalMetaClass, (Object)BigDecimal.valueOf(rhsLessThan[i])) == -1);
    }

    for (int i = 0; i != lhsGreaterThan.length; i++) {

      assertTrue(tc.unwrapToInt(op.apply((byte)lhsGreaterThan[i], (byte)rhsGreaterThan[i])) == 1);
      assertTrue(tc.unwrapToInt(op.apply((char)lhsGreaterThan[i], (byte)rhsGreaterThan[i])) == 1);
      assertTrue(tc.unwrapToInt(op.apply((short)lhsGreaterThan[i], (byte)rhsGreaterThan[i])) == 1);
      assertTrue(tc.unwrapToInt(op.apply(lhsGreaterThan[i], (byte)rhsGreaterThan[i])) == 1);
      assertTrue(tc.unwrapToInt(op.apply((long)lhsGreaterThan[i], (byte)rhsGreaterThan[i])) == 1);
      assertTrue(tc.unwrapToInt(op.apply((float)lhsGreaterThan[i], (byte)rhsGreaterThan[i])) == 1);
      assertTrue(tc.unwrapToInt(op.apply((double)lhsGreaterThan[i], (byte)rhsGreaterThan[i])) == 1);
      assertTrue(tc.unwrapToInt(op.apply(BigInteger.valueOf(lhsGreaterThan[i]), (byte)rhsGreaterThan[i])) == 1);
      assertTrue(tc.unwrapToInt(op.apply(BigDecimal.valueOf(lhsGreaterThan[i]), (byte)rhsGreaterThan[i])) == 1);

      assertTrue(tc.unwrapToInt(op.apply((byte)lhsGreaterThan[i], (char)rhsGreaterThan[i])) == 1);
      assertTrue(tc.unwrapToInt(op.apply((char)lhsGreaterThan[i], (char)rhsGreaterThan[i])) == 1);
      assertTrue(tc.unwrapToInt(op.apply((short)lhsGreaterThan[i], (char)rhsGreaterThan[i])) == 1);
      assertTrue(tc.unwrapToInt(op.apply(lhsGreaterThan[i], (char)rhsGreaterThan[i])) == 1);
      assertTrue(tc.unwrapToInt(op.apply((long)lhsGreaterThan[i], (char)rhsGreaterThan[i])) == 1);
      assertTrue(tc.unwrapToInt(op.apply((float)lhsGreaterThan[i], (char)rhsGreaterThan[i])) == 1);
      assertTrue(tc.unwrapToInt(op.apply((double)lhsGreaterThan[i], (char)rhsGreaterThan[i])) == 1);
      assertTrue(tc.unwrapToInt(op.apply(BigInteger.valueOf(lhsGreaterThan[i]), (char)rhsGreaterThan[i])) == 1);
      assertTrue(tc.unwrapToInt(op.apply(BigDecimal.valueOf(lhsGreaterThan[i]), (char)rhsGreaterThan[i])) == 1);

      assertTrue(tc.unwrapToInt(op.apply((byte)lhsGreaterThan[i], (short)rhsGreaterThan[i])) == 1);
      assertTrue(tc.unwrapToInt(op.apply((char)lhsGreaterThan[i], (short)rhsGreaterThan[i])) == 1);
      assertTrue(tc.unwrapToInt(op.apply((short)lhsGreaterThan[i], (short)rhsGreaterThan[i])) == 1);
      assertTrue(tc.unwrapToInt(op.apply(lhsGreaterThan[i], (short)rhsGreaterThan[i])) == 1);
      assertTrue(tc.unwrapToInt(op.apply((long)lhsGreaterThan[i], (short)rhsGreaterThan[i])) == 1);
      assertTrue(tc.unwrapToInt(op.apply((float)lhsGreaterThan[i], (short)rhsGreaterThan[i])) == 1);
      assertTrue(tc.unwrapToInt(op.apply((double)lhsGreaterThan[i], (short)rhsGreaterThan[i])) == 1);
      assertTrue(tc.unwrapToInt(op.apply(BigInteger.valueOf(lhsGreaterThan[i]), (short)rhsGreaterThan[i])) == 1);
      assertTrue(tc.unwrapToInt(op.apply(BigDecimal.valueOf(lhsGreaterThan[i]), (short)rhsGreaterThan[i])) == 1);

      assertTrue(tc.unwrapToInt(op.apply((byte)lhsGreaterThan[i], rhsGreaterThan[i])) == 1);
      assertTrue(tc.unwrapToInt(op.apply((char)lhsGreaterThan[i], rhsGreaterThan[i])) == 1);
      assertTrue(tc.unwrapToInt(op.apply((short)lhsGreaterThan[i], rhsGreaterThan[i])) == 1);
      assertTrue(tc.unwrapToInt(op.apply(lhsGreaterThan[i], rhsGreaterThan[i])) == 1);
      assertTrue(tc.unwrapToInt(op.apply((long)lhsGreaterThan[i], rhsGreaterThan[i])) == 1);
      assertTrue(tc.unwrapToInt(op.apply((float)lhsGreaterThan[i], rhsGreaterThan[i])) == 1);
      assertTrue(tc.unwrapToInt(op.apply((double)lhsGreaterThan[i], rhsGreaterThan[i])) == 1);
      assertTrue(tc.unwrapToInt(op.apply(BigInteger.valueOf(lhsGreaterThan[i]), rhsGreaterThan[i])) == 1);
      assertTrue(tc.unwrapToInt(op.apply(BigDecimal.valueOf(lhsGreaterThan[i]), rhsGreaterThan[i])) == 1);

      assertTrue(tc.unwrapToInt(op.apply((byte)lhsGreaterThan[i], (long)rhsGreaterThan[i])) == 1);
      assertTrue(tc.unwrapToInt(op.apply((char)lhsGreaterThan[i], (long)rhsGreaterThan[i])) == 1);
      assertTrue(tc.unwrapToInt(op.apply((short)lhsGreaterThan[i], (long)rhsGreaterThan[i])) == 1);
      assertTrue(tc.unwrapToInt(op.apply(lhsGreaterThan[i], (long)rhsGreaterThan[i])) == 1);
      assertTrue(tc.unwrapToInt(op.apply((long)lhsGreaterThan[i], (long)rhsGreaterThan[i])) == 1);
      assertTrue(tc.unwrapToInt(op.apply((float)lhsGreaterThan[i], (long)rhsGreaterThan[i])) == 1);
      assertTrue(tc.unwrapToInt(op.apply((double)lhsGreaterThan[i], (long)rhsGreaterThan[i])) == 1);
      assertTrue(tc.unwrapToInt(op.apply(BigInteger.valueOf(lhsGreaterThan[i]), (long)rhsGreaterThan[i])) == 1);
      assertTrue(tc.unwrapToInt(op.apply(BigDecimal.valueOf(lhsGreaterThan[i]), (long)rhsGreaterThan[i])) == 1);

      assertTrue(tc.unwrapToInt(op.apply((byte)lhsGreaterThan[i], (float)rhsGreaterThan[i])) == 1);
      assertTrue(tc.unwrapToInt(op.apply((char)lhsGreaterThan[i], (float)rhsGreaterThan[i])) == 1);
      assertTrue(tc.unwrapToInt(op.apply((short)lhsGreaterThan[i], (float)rhsGreaterThan[i])) == 1);
      assertTrue(tc.unwrapToInt(op.apply(lhsGreaterThan[i], (float)rhsGreaterThan[i])) == 1);
      assertTrue(tc.unwrapToInt(op.apply((long)lhsGreaterThan[i], (float)rhsGreaterThan[i])) == 1);
      assertTrue(tc.unwrapToInt(op.apply((float)lhsGreaterThan[i], (float)rhsGreaterThan[i])) == 1);
      assertTrue(tc.unwrapToInt(op.apply((double)lhsGreaterThan[i], (float)rhsGreaterThan[i])) == 1);
      assertTrue(tc.unwrapToInt(op.apply(BigInteger.valueOf(lhsGreaterThan[i]), (float)rhsGreaterThan[i])) == 1);
      assertTrue(tc.unwrapToInt(op.apply(BigDecimal.valueOf(lhsGreaterThan[i]), (float)rhsGreaterThan[i])) == 1);

      assertTrue(tc.unwrapToInt(op.apply((byte)lhsGreaterThan[i], (double)rhsGreaterThan[i])) == 1);
      assertTrue(tc.unwrapToInt(op.apply((char)lhsGreaterThan[i], (double)rhsGreaterThan[i])) == 1);
      assertTrue(tc.unwrapToInt(op.apply((short)lhsGreaterThan[i], (double)rhsGreaterThan[i])) == 1);
      assertTrue(tc.unwrapToInt(op.apply(lhsGreaterThan[i], (double)rhsGreaterThan[i])) == 1);
      assertTrue(tc.unwrapToInt(op.apply((long)lhsGreaterThan[i], (double)rhsGreaterThan[i])) == 1);
      assertTrue(tc.unwrapToInt(op.apply((float)lhsGreaterThan[i], (double)rhsGreaterThan[i])) == 1);
      assertTrue(tc.unwrapToInt(op.apply((double)lhsGreaterThan[i], (double)rhsGreaterThan[i])) == 1);
      assertTrue(tc.unwrapToInt(op.apply(BigInteger.valueOf(lhsGreaterThan[i]), (double)rhsGreaterThan[i])) == 1);
      assertTrue(tc.unwrapToInt(op.apply(BigDecimal.valueOf(lhsGreaterThan[i]), (double)rhsGreaterThan[i])) == 1);

      assertTrue(tc.unwrapToInt(op.apply((byte)lhsGreaterThan[i], BigInteger.valueOf(rhsGreaterThan[i]))) == 1);
      assertTrue(tc.unwrapToInt(op.apply((char)lhsGreaterThan[i], BigInteger.valueOf(rhsGreaterThan[i]))) == 1);
      assertTrue(tc.unwrapToInt(op.apply((short)lhsGreaterThan[i], BigInteger.valueOf(rhsGreaterThan[i]))) == 1);
      assertTrue(tc.unwrapToInt(op.apply(lhsGreaterThan[i], BigInteger.valueOf(rhsGreaterThan[i]))) == 1);
      assertTrue(tc.unwrapToInt(op.apply((long)lhsGreaterThan[i], BigInteger.valueOf(rhsGreaterThan[i]))) == 1);
      assertTrue(tc.unwrapToInt(op.apply((float)lhsGreaterThan[i], BigInteger.valueOf(rhsGreaterThan[i]))) == 1);
      assertTrue(tc.unwrapToInt(op.apply((double)lhsGreaterThan[i], BigInteger.valueOf(rhsGreaterThan[i]))) == 1);
      assertTrue(tc.unwrapToInt(op.apply(BigInteger.valueOf(lhsGreaterThan[i]), BigInteger.valueOf(rhsGreaterThan[i]))) == 1);
      assertTrue(tc.unwrapToInt(op.apply(BigDecimal.valueOf(lhsGreaterThan[i]), BigInteger.valueOf(rhsGreaterThan[i]))) == 1);

      assertTrue(tc.unwrapToInt(op.apply((byte)lhsGreaterThan[i], BigDecimal.valueOf(rhsGreaterThan[i]))) == 1);
      assertTrue(tc.unwrapToInt(op.apply((char)lhsGreaterThan[i], BigDecimal.valueOf(rhsGreaterThan[i]))) == 1);
      assertTrue(tc.unwrapToInt(op.apply((short)lhsGreaterThan[i], BigDecimal.valueOf(rhsGreaterThan[i]))) == 1);
      assertTrue(tc.unwrapToInt(op.apply(lhsGreaterThan[i], BigDecimal.valueOf(rhsGreaterThan[i]))) == 1);
      assertTrue(tc.unwrapToInt(op.apply((long)lhsGreaterThan[i], BigDecimal.valueOf(rhsGreaterThan[i]))) == 1);
      assertTrue(tc.unwrapToInt(op.apply((float)lhsGreaterThan[i], BigDecimal.valueOf(rhsGreaterThan[i]))) == 1);
      assertTrue(tc.unwrapToInt(op.apply((double)lhsGreaterThan[i], BigDecimal.valueOf(rhsGreaterThan[i]))) == 1);
      assertTrue(tc.unwrapToInt(op.apply(BigInteger.valueOf(lhsGreaterThan[i]), BigDecimal.valueOf(rhsGreaterThan[i]))) == 1);
      assertTrue(tc.unwrapToInt(op.apply(BigDecimal.valueOf(lhsGreaterThan[i]), BigDecimal.valueOf(rhsGreaterThan[i]))) == 1);

      assertTrue(tc.unwrapToInt(op.apply((byte)lhsGreaterThan[i], NgByte.valueOf((byte)rhsGreaterThan[i]))) == 1);
      assertTrue(tc.unwrapToInt(op.apply((char)lhsGreaterThan[i], NgByte.valueOf((byte)rhsGreaterThan[i]))) == 1);
      assertTrue(tc.unwrapToInt(op.apply((short)lhsGreaterThan[i], NgByte.valueOf((byte)rhsGreaterThan[i]))) == 1);
      assertTrue(tc.unwrapToInt(op.apply(lhsGreaterThan[i], NgByte.valueOf((byte)rhsGreaterThan[i]))) == 1);
      assertTrue(tc.unwrapToInt(op.apply((long)lhsGreaterThan[i], NgByte.valueOf((byte)rhsGreaterThan[i]))) == 1);
      assertTrue(tc.unwrapToInt(op.apply((float)lhsGreaterThan[i], NgByte.valueOf((byte)rhsGreaterThan[i]))) == 1);
      assertTrue(tc.unwrapToInt(op.apply((double)lhsGreaterThan[i], NgByte.valueOf((byte)rhsGreaterThan[i]))) == 1);
      assertTrue(tc.unwrapToInt(op.apply(BigInteger.valueOf(lhsGreaterThan[i]), NgByte.valueOf((byte)rhsGreaterThan[i]))) == 1);
      assertTrue(tc.unwrapToInt(op.apply(BigDecimal.valueOf(lhsGreaterThan[i]), NgByte.valueOf((byte)rhsGreaterThan[i]))) == 1);

      assertTrue(tc.unwrapToInt(op.apply((byte)lhsGreaterThan[i], NgChar.valueOf((char)rhsGreaterThan[i]))) == 1);
      assertTrue(tc.unwrapToInt(op.apply((char)lhsGreaterThan[i], NgChar.valueOf((char)rhsGreaterThan[i]))) == 1);
      assertTrue(tc.unwrapToInt(op.apply((short)lhsGreaterThan[i], NgChar.valueOf((char)rhsGreaterThan[i]))) == 1);
      assertTrue(tc.unwrapToInt(op.apply(lhsGreaterThan[i], NgChar.valueOf((char)rhsGreaterThan[i]))) == 1);
      assertTrue(tc.unwrapToInt(op.apply((long)lhsGreaterThan[i], NgChar.valueOf((char)rhsGreaterThan[i]))) == 1);
      assertTrue(tc.unwrapToInt(op.apply((float)lhsGreaterThan[i], NgChar.valueOf((char)rhsGreaterThan[i]))) == 1);
      assertTrue(tc.unwrapToInt(op.apply((double)lhsGreaterThan[i], NgChar.valueOf((char)rhsGreaterThan[i]))) == 1);
      assertTrue(tc.unwrapToInt(op.apply(BigInteger.valueOf(lhsGreaterThan[i]), NgChar.valueOf((char)rhsGreaterThan[i]))) == 1);
      assertTrue(tc.unwrapToInt(op.apply(BigDecimal.valueOf(lhsGreaterThan[i]), NgChar.valueOf((char)rhsGreaterThan[i]))) == 1);

      assertTrue(tc.unwrapToInt(op.apply((byte)lhsGreaterThan[i], NgShort.valueOf((short)rhsGreaterThan[i]))) == 1);
      assertTrue(tc.unwrapToInt(op.apply((char)lhsGreaterThan[i], NgShort.valueOf((short)rhsGreaterThan[i]))) == 1);
      assertTrue(tc.unwrapToInt(op.apply((short)lhsGreaterThan[i], NgShort.valueOf((short)rhsGreaterThan[i]))) == 1);
      assertTrue(tc.unwrapToInt(op.apply(lhsGreaterThan[i], NgShort.valueOf((short)rhsGreaterThan[i]))) == 1);
      assertTrue(tc.unwrapToInt(op.apply((long)lhsGreaterThan[i], NgShort.valueOf((short)rhsGreaterThan[i]))) == 1);
      assertTrue(tc.unwrapToInt(op.apply((float)lhsGreaterThan[i], NgShort.valueOf((short)rhsGreaterThan[i]))) == 1);
      assertTrue(tc.unwrapToInt(op.apply((double)lhsGreaterThan[i], NgShort.valueOf((short)rhsGreaterThan[i]))) == 1);
      assertTrue(tc.unwrapToInt(op.apply(BigInteger.valueOf(lhsGreaterThan[i]), NgShort.valueOf((short)rhsGreaterThan[i]))) == 1);
      assertTrue(tc.unwrapToInt(op.apply(BigDecimal.valueOf(lhsGreaterThan[i]), NgShort.valueOf((short)rhsGreaterThan[i]))) == 1);

      assertTrue(tc.unwrapToInt(op.apply((byte)lhsGreaterThan[i], NgInt.valueOf(rhsGreaterThan[i]))) == 1);
      assertTrue(tc.unwrapToInt(op.apply((char)lhsGreaterThan[i], NgInt.valueOf(rhsGreaterThan[i]))) == 1);
      assertTrue(tc.unwrapToInt(op.apply((short)lhsGreaterThan[i], NgInt.valueOf(rhsGreaterThan[i]))) == 1);
      assertTrue(tc.unwrapToInt(op.apply(lhsGreaterThan[i], NgInt.valueOf(rhsGreaterThan[i]))) == 1);
      assertTrue(tc.unwrapToInt(op.apply((long)lhsGreaterThan[i], NgInt.valueOf(rhsGreaterThan[i]))) == 1);
      assertTrue(tc.unwrapToInt(op.apply((float)lhsGreaterThan[i], NgInt.valueOf(rhsGreaterThan[i]))) == 1);
      assertTrue(tc.unwrapToInt(op.apply((double)lhsGreaterThan[i], NgInt.valueOf(rhsGreaterThan[i]))) == 1);
      assertTrue(tc.unwrapToInt(op.apply(BigInteger.valueOf(lhsGreaterThan[i]), NgInt.valueOf(rhsGreaterThan[i]))) == 1);
      assertTrue(tc.unwrapToInt(op.apply(BigDecimal.valueOf(lhsGreaterThan[i]), NgInt.valueOf(rhsGreaterThan[i]))) == 1);

      assertTrue(tc.unwrapToInt(op.apply((byte)lhsGreaterThan[i], NgLong.valueOf(rhsGreaterThan[i]))) == 1);
      assertTrue(tc.unwrapToInt(op.apply((char)lhsGreaterThan[i], NgLong.valueOf(rhsGreaterThan[i]))) == 1);
      assertTrue(tc.unwrapToInt(op.apply((short)lhsGreaterThan[i], NgLong.valueOf(rhsGreaterThan[i]))) == 1);
      assertTrue(tc.unwrapToInt(op.apply(lhsGreaterThan[i], NgLong.valueOf(rhsGreaterThan[i]))) == 1);
      assertTrue(tc.unwrapToInt(op.apply((long)lhsGreaterThan[i], NgLong.valueOf(rhsGreaterThan[i]))) == 1);
      assertTrue(tc.unwrapToInt(op.apply((float)lhsGreaterThan[i], NgLong.valueOf(rhsGreaterThan[i]))) == 1);
      assertTrue(tc.unwrapToInt(op.apply((double)lhsGreaterThan[i], NgLong.valueOf(rhsGreaterThan[i]))) == 1);
      assertTrue(tc.unwrapToInt(op.apply(BigInteger.valueOf(lhsGreaterThan[i]), NgLong.valueOf(rhsGreaterThan[i]))) == 1);
      assertTrue(tc.unwrapToInt(op.apply(BigDecimal.valueOf(lhsGreaterThan[i]), NgLong.valueOf(rhsGreaterThan[i]))) == 1);

      assertTrue(tc.unwrapToInt(op.apply((byte)lhsGreaterThan[i], NgFloat.valueOf(rhsGreaterThan[i]))) == 1);
      assertTrue(tc.unwrapToInt(op.apply((char)lhsGreaterThan[i], NgFloat.valueOf(rhsGreaterThan[i]))) == 1);
      assertTrue(tc.unwrapToInt(op.apply((short)lhsGreaterThan[i], NgFloat.valueOf(rhsGreaterThan[i]))) == 1);
      assertTrue(tc.unwrapToInt(op.apply(lhsGreaterThan[i], NgFloat.valueOf(rhsGreaterThan[i]))) == 1);
      assertTrue(tc.unwrapToInt(op.apply((long)lhsGreaterThan[i], NgFloat.valueOf(rhsGreaterThan[i]))) == 1);
      assertTrue(tc.unwrapToInt(op.apply((float)lhsGreaterThan[i], NgFloat.valueOf(rhsGreaterThan[i]))) == 1);
      assertTrue(tc.unwrapToInt(op.apply((double)lhsGreaterThan[i], NgFloat.valueOf(rhsGreaterThan[i]))) == 1);
      assertTrue(tc.unwrapToInt(op.apply(BigInteger.valueOf(lhsGreaterThan[i]), NgFloat.valueOf(rhsGreaterThan[i]))) == 1);
      assertTrue(tc.unwrapToInt(op.apply(BigDecimal.valueOf(lhsGreaterThan[i]), NgFloat.valueOf(rhsGreaterThan[i]))) == 1);

      assertTrue(tc.unwrapToInt(op.apply((byte)lhsGreaterThan[i], NgDouble.valueOf(rhsGreaterThan[i]))) == 1);
      assertTrue(tc.unwrapToInt(op.apply((char)lhsGreaterThan[i], NgDouble.valueOf(rhsGreaterThan[i]))) == 1);
      assertTrue(tc.unwrapToInt(op.apply((short)lhsGreaterThan[i], NgDouble.valueOf(rhsGreaterThan[i]))) == 1);
      assertTrue(tc.unwrapToInt(op.apply(lhsGreaterThan[i], NgDouble.valueOf(rhsGreaterThan[i]))) == 1);
      assertTrue(tc.unwrapToInt(op.apply((long)lhsGreaterThan[i], NgDouble.valueOf(rhsGreaterThan[i]))) == 1);
      assertTrue(tc.unwrapToInt(op.apply((float)lhsGreaterThan[i], NgDouble.valueOf(rhsGreaterThan[i]))) == 1);
      assertTrue(tc.unwrapToInt(op.apply((double)lhsGreaterThan[i], NgDouble.valueOf(rhsGreaterThan[i]))) == 1);
      assertTrue(tc.unwrapToInt(op.apply(BigInteger.valueOf(lhsGreaterThan[i]), NgDouble.valueOf(rhsGreaterThan[i]))) == 1);
      assertTrue(tc.unwrapToInt(op.apply(BigDecimal.valueOf(lhsGreaterThan[i]), NgDouble.valueOf(rhsGreaterThan[i]))) == 1);

      assertTrue(tc.unwrapToInt(op.apply(NgByte.valueOf((byte)lhsGreaterThan[i]), NgByte.valueOf((byte)rhsGreaterThan[i]))) == 1);
      assertTrue(tc.unwrapToInt(op.apply(NgChar.valueOf((char)lhsGreaterThan[i]), NgByte.valueOf((byte)rhsGreaterThan[i]))) == 1);
      assertTrue(tc.unwrapToInt(op.apply(NgShort.valueOf((short)lhsGreaterThan[i]), NgByte.valueOf((byte)rhsGreaterThan[i]))) == 1);
      assertTrue(tc.unwrapToInt(op.apply(NgInt.valueOf(lhsGreaterThan[i]), NgByte.valueOf((byte)rhsGreaterThan[i]))) == 1);
      assertTrue(tc.unwrapToInt(op.apply(NgLong.valueOf(lhsGreaterThan[i]), NgByte.valueOf((byte)rhsGreaterThan[i]))) == 1);
      assertTrue(tc.unwrapToInt(op.apply(NgFloat.valueOf(lhsGreaterThan[i]), NgByte.valueOf((byte)rhsGreaterThan[i]))) == 1);
      assertTrue(tc.unwrapToInt(op.apply(NgDouble.valueOf(lhsGreaterThan[i]), NgByte.valueOf((byte)rhsGreaterThan[i]))) == 1);
      assertTrue(tc.unwrapToInt(op.apply(BigInteger.valueOf(lhsGreaterThan[i]), NgByte.valueOf((byte)rhsGreaterThan[i]))) == 1);
      assertTrue(tc.unwrapToInt(op.apply(BigDecimal.valueOf(lhsGreaterThan[i]), NgByte.valueOf((byte)rhsGreaterThan[i]))) == 1);

      assertTrue(tc.unwrapToInt(op.apply(NgByte.valueOf((byte)lhsGreaterThan[i]), NgChar.valueOf((char)rhsGreaterThan[i]))) == 1);
      assertTrue(tc.unwrapToInt(op.apply(NgChar.valueOf((char)lhsGreaterThan[i]), NgChar.valueOf((char)rhsGreaterThan[i]))) == 1);
      assertTrue(tc.unwrapToInt(op.apply(NgShort.valueOf((short)lhsGreaterThan[i]), NgChar.valueOf((char)rhsGreaterThan[i]))) == 1);
      assertTrue(tc.unwrapToInt(op.apply(NgInt.valueOf(lhsGreaterThan[i]), NgChar.valueOf((char)rhsGreaterThan[i]))) == 1);
      assertTrue(tc.unwrapToInt(op.apply(NgLong.valueOf(lhsGreaterThan[i]), NgChar.valueOf((char)rhsGreaterThan[i]))) == 1);
      assertTrue(tc.unwrapToInt(op.apply(NgFloat.valueOf(lhsGreaterThan[i]), NgChar.valueOf((char)rhsGreaterThan[i]))) == 1);
      assertTrue(tc.unwrapToInt(op.apply(NgDouble.valueOf(lhsGreaterThan[i]), NgChar.valueOf((char)rhsGreaterThan[i]))) == 1);
      assertTrue(tc.unwrapToInt(op.apply(BigInteger.valueOf(lhsGreaterThan[i]), NgChar.valueOf((char)rhsGreaterThan[i]))) == 1);
      assertTrue(tc.unwrapToInt(op.apply(BigDecimal.valueOf(lhsGreaterThan[i]), NgChar.valueOf((char)rhsGreaterThan[i]))) == 1);

      assertTrue(tc.unwrapToInt(op.apply(NgByte.valueOf((byte)lhsGreaterThan[i]), NgShort.valueOf((short)rhsGreaterThan[i]))) == 1);
      assertTrue(tc.unwrapToInt(op.apply(NgChar.valueOf((char)lhsGreaterThan[i]), NgShort.valueOf((short)rhsGreaterThan[i]))) == 1);
      assertTrue(tc.unwrapToInt(op.apply(NgShort.valueOf((short)lhsGreaterThan[i]), NgShort.valueOf((short)rhsGreaterThan[i]))) == 1);
      assertTrue(tc.unwrapToInt(op.apply(NgInt.valueOf(lhsGreaterThan[i]), NgShort.valueOf((short)rhsGreaterThan[i]))) == 1);
      assertTrue(tc.unwrapToInt(op.apply(NgLong.valueOf(lhsGreaterThan[i]), NgShort.valueOf((short)rhsGreaterThan[i]))) == 1);
      assertTrue(tc.unwrapToInt(op.apply(NgFloat.valueOf(lhsGreaterThan[i]), NgShort.valueOf((short)rhsGreaterThan[i]))) == 1);
      assertTrue(tc.unwrapToInt(op.apply(NgDouble.valueOf(lhsGreaterThan[i]), NgShort.valueOf((short)rhsGreaterThan[i]))) == 1);
      assertTrue(tc.unwrapToInt(op.apply(BigInteger.valueOf(lhsGreaterThan[i]), NgShort.valueOf((short)rhsGreaterThan[i]))) == 1);
      assertTrue(tc.unwrapToInt(op.apply(BigDecimal.valueOf(lhsGreaterThan[i]), NgShort.valueOf((short)rhsGreaterThan[i]))) == 1);

      assertTrue(tc.unwrapToInt(op.apply(NgByte.valueOf((byte)lhsGreaterThan[i]), NgInt.valueOf(rhsGreaterThan[i]))) == 1);
      assertTrue(tc.unwrapToInt(op.apply(NgChar.valueOf((char)lhsGreaterThan[i]), NgInt.valueOf(rhsGreaterThan[i]))) == 1);
      assertTrue(tc.unwrapToInt(op.apply(NgShort.valueOf((short)lhsGreaterThan[i]), NgInt.valueOf(rhsGreaterThan[i]))) == 1);
      assertTrue(tc.unwrapToInt(op.apply(NgInt.valueOf(lhsGreaterThan[i]), NgInt.valueOf(rhsGreaterThan[i]))) == 1);
      assertTrue(tc.unwrapToInt(op.apply(NgLong.valueOf(lhsGreaterThan[i]), NgInt.valueOf(rhsGreaterThan[i]))) == 1);
      assertTrue(tc.unwrapToInt(op.apply(NgFloat.valueOf(lhsGreaterThan[i]), NgInt.valueOf(rhsGreaterThan[i]))) == 1);
      assertTrue(tc.unwrapToInt(op.apply(NgDouble.valueOf(lhsGreaterThan[i]), NgInt.valueOf(rhsGreaterThan[i]))) == 1);
      assertTrue(tc.unwrapToInt(op.apply(BigInteger.valueOf(lhsGreaterThan[i]), NgInt.valueOf(rhsGreaterThan[i]))) == 1);
      assertTrue(tc.unwrapToInt(op.apply(BigDecimal.valueOf(lhsGreaterThan[i]), NgInt.valueOf(rhsGreaterThan[i]))) == 1);

      assertTrue(tc.unwrapToInt(op.apply(NgByte.valueOf((byte)lhsGreaterThan[i]), NgLong.valueOf(rhsGreaterThan[i]))) == 1);
      assertTrue(tc.unwrapToInt(op.apply(NgChar.valueOf((char)lhsGreaterThan[i]), NgLong.valueOf(rhsGreaterThan[i]))) == 1);
      assertTrue(tc.unwrapToInt(op.apply(NgShort.valueOf((short)lhsGreaterThan[i]), NgLong.valueOf(rhsGreaterThan[i]))) == 1);
      assertTrue(tc.unwrapToInt(op.apply(NgInt.valueOf(lhsGreaterThan[i]), NgLong.valueOf(rhsGreaterThan[i]))) == 1);
      assertTrue(tc.unwrapToInt(op.apply(NgLong.valueOf(lhsGreaterThan[i]), NgLong.valueOf(rhsGreaterThan[i]))) == 1);
      assertTrue(tc.unwrapToInt(op.apply(NgFloat.valueOf(lhsGreaterThan[i]), NgLong.valueOf(rhsGreaterThan[i]))) == 1);
      assertTrue(tc.unwrapToInt(op.apply(NgDouble.valueOf(lhsGreaterThan[i]), NgLong.valueOf(rhsGreaterThan[i]))) == 1);
      assertTrue(tc.unwrapToInt(op.apply(BigInteger.valueOf(lhsGreaterThan[i]), NgLong.valueOf(rhsGreaterThan[i]))) == 1);
      assertTrue(tc.unwrapToInt(op.apply(BigDecimal.valueOf(lhsGreaterThan[i]), NgLong.valueOf(rhsGreaterThan[i]))) == 1);

      assertTrue(tc.unwrapToInt(op.apply(NgByte.valueOf((byte)lhsGreaterThan[i]), NgFloat.valueOf(rhsGreaterThan[i]))) == 1);
      assertTrue(tc.unwrapToInt(op.apply(NgChar.valueOf((char)lhsGreaterThan[i]), NgFloat.valueOf(rhsGreaterThan[i]))) == 1);
      assertTrue(tc.unwrapToInt(op.apply(NgShort.valueOf((short)lhsGreaterThan[i]), NgFloat.valueOf(rhsGreaterThan[i]))) == 1);
      assertTrue(tc.unwrapToInt(op.apply(NgInt.valueOf(lhsGreaterThan[i]), NgFloat.valueOf(rhsGreaterThan[i]))) == 1);
      assertTrue(tc.unwrapToInt(op.apply(NgLong.valueOf(lhsGreaterThan[i]), NgFloat.valueOf(rhsGreaterThan[i]))) == 1);
      assertTrue(tc.unwrapToInt(op.apply(NgFloat.valueOf(lhsGreaterThan[i]), NgFloat.valueOf(rhsGreaterThan[i]))) == 1);
      assertTrue(tc.unwrapToInt(op.apply(NgDouble.valueOf(lhsGreaterThan[i]), NgFloat.valueOf(rhsGreaterThan[i]))) == 1);
      assertTrue(tc.unwrapToInt(op.apply(BigInteger.valueOf(lhsGreaterThan[i]), NgFloat.valueOf(rhsGreaterThan[i]))) == 1);
      assertTrue(tc.unwrapToInt(op.apply(BigDecimal.valueOf(lhsGreaterThan[i]), NgFloat.valueOf(rhsGreaterThan[i]))) == 1);

      assertTrue(tc.unwrapToInt(op.apply(NgByte.valueOf((byte)lhsGreaterThan[i]), NgDouble.valueOf(rhsGreaterThan[i]))) == 1);
      assertTrue(tc.unwrapToInt(op.apply(NgChar.valueOf((char)lhsGreaterThan[i]), NgDouble.valueOf(rhsGreaterThan[i]))) == 1);
      assertTrue(tc.unwrapToInt(op.apply(NgShort.valueOf((short)lhsGreaterThan[i]), NgDouble.valueOf(rhsGreaterThan[i]))) == 1);
      assertTrue(tc.unwrapToInt(op.apply(NgInt.valueOf(lhsGreaterThan[i]), NgDouble.valueOf(rhsGreaterThan[i]))) == 1);
      assertTrue(tc.unwrapToInt(op.apply(NgLong.valueOf(lhsGreaterThan[i]), NgDouble.valueOf(rhsGreaterThan[i]))) == 1);
      assertTrue(tc.unwrapToInt(op.apply(NgFloat.valueOf(lhsGreaterThan[i]), NgDouble.valueOf(rhsGreaterThan[i]))) == 1);
      assertTrue(tc.unwrapToInt(op.apply(NgDouble.valueOf(lhsGreaterThan[i]), NgDouble.valueOf(rhsGreaterThan[i]))) == 1);
      assertTrue(tc.unwrapToInt(op.apply(BigInteger.valueOf(lhsGreaterThan[i]), NgDouble.valueOf(rhsGreaterThan[i]))) == 1);
      assertTrue(tc.unwrapToInt(op.apply(BigDecimal.valueOf(lhsGreaterThan[i]), NgDouble.valueOf(rhsGreaterThan[i]))) == 1);

      assertTrue(tc.unwrapToInt(op.apply(NgByte.valueOf((byte)lhsGreaterThan[i]), BigInteger.valueOf(rhsGreaterThan[i]))) == 1);
      assertTrue(tc.unwrapToInt(op.apply(NgChar.valueOf((char)lhsGreaterThan[i]), BigInteger.valueOf(rhsGreaterThan[i]))) == 1);
      assertTrue(tc.unwrapToInt(op.apply(NgShort.valueOf((short)lhsGreaterThan[i]), BigInteger.valueOf(rhsGreaterThan[i]))) == 1);
      assertTrue(tc.unwrapToInt(op.apply(NgInt.valueOf(lhsGreaterThan[i]), BigInteger.valueOf(rhsGreaterThan[i]))) == 1);
      assertTrue(tc.unwrapToInt(op.apply(NgLong.valueOf(lhsGreaterThan[i]), BigInteger.valueOf(rhsGreaterThan[i]))) == 1);
      assertTrue(tc.unwrapToInt(op.apply(NgFloat.valueOf(lhsGreaterThan[i]), BigInteger.valueOf(rhsGreaterThan[i]))) == 1);
      assertTrue(tc.unwrapToInt(op.apply(NgDouble.valueOf(lhsGreaterThan[i]), BigInteger.valueOf(rhsGreaterThan[i]))) == 1);
      assertTrue(tc.unwrapToInt(op.apply(BigInteger.valueOf(lhsGreaterThan[i]), BigInteger.valueOf(rhsGreaterThan[i]))) == 1);
      assertTrue(tc.unwrapToInt(op.apply(BigDecimal.valueOf(lhsGreaterThan[i]), BigInteger.valueOf(rhsGreaterThan[i]))) == 1);

      assertTrue(tc.unwrapToInt(op.apply(NgByte.valueOf((byte)lhsGreaterThan[i]), BigDecimal.valueOf(rhsGreaterThan[i]))) == 1);
      assertTrue(tc.unwrapToInt(op.apply(NgChar.valueOf((char)lhsGreaterThan[i]), BigDecimal.valueOf(rhsGreaterThan[i]))) == 1);
      assertTrue(tc.unwrapToInt(op.apply(NgShort.valueOf((short)lhsGreaterThan[i]), BigDecimal.valueOf(rhsGreaterThan[i]))) == 1);
      assertTrue(tc.unwrapToInt(op.apply(NgInt.valueOf(lhsGreaterThan[i]), BigDecimal.valueOf(rhsGreaterThan[i]))) == 1);
      assertTrue(tc.unwrapToInt(op.apply(NgLong.valueOf(lhsGreaterThan[i]), BigDecimal.valueOf(rhsGreaterThan[i]))) == 1);
      assertTrue(tc.unwrapToInt(op.apply(NgFloat.valueOf(lhsGreaterThan[i]), BigDecimal.valueOf(rhsGreaterThan[i]))) == 1);
      assertTrue(tc.unwrapToInt(op.apply(NgDouble.valueOf(lhsGreaterThan[i]), BigDecimal.valueOf(rhsGreaterThan[i]))) == 1);
      assertTrue(tc.unwrapToInt(op.apply(BigInteger.valueOf(lhsGreaterThan[i]), BigDecimal.valueOf(rhsGreaterThan[i]))) == 1);
      assertTrue(tc.unwrapToInt(op.apply(BigDecimal.valueOf(lhsGreaterThan[i]), BigDecimal.valueOf(rhsGreaterThan[i]))) == 1);

      assertTrue(tc.unwrapToInt(op.apply(NgByte.valueOf((byte)lhsGreaterThan[i]), NgByte.valueOf((byte)rhsGreaterThan[i]))) == 1);
      assertTrue(tc.unwrapToInt(op.apply(NgChar.valueOf((char)lhsGreaterThan[i]), NgByte.valueOf((byte)rhsGreaterThan[i]))) == 1);
      assertTrue(tc.unwrapToInt(op.apply(NgShort.valueOf((short)lhsGreaterThan[i]), NgByte.valueOf((byte)rhsGreaterThan[i]))) == 1);
      assertTrue(tc.unwrapToInt(op.apply(NgInt.valueOf(lhsGreaterThan[i]), NgByte.valueOf((byte)rhsGreaterThan[i]))) == 1);
      assertTrue(tc.unwrapToInt(op.apply(NgLong.valueOf(lhsGreaterThan[i]), NgByte.valueOf((byte)rhsGreaterThan[i]))) == 1);
      assertTrue(tc.unwrapToInt(op.apply(NgFloat.valueOf(lhsGreaterThan[i]), NgByte.valueOf((byte)rhsGreaterThan[i]))) == 1);
      assertTrue(tc.unwrapToInt(op.apply(NgDouble.valueOf(lhsGreaterThan[i]), NgByte.valueOf((byte)rhsGreaterThan[i]))) == 1);
      assertTrue(tc.unwrapToInt(op.apply((Object)BigInteger.valueOf(lhsGreaterThan[i]), (Object)NgByte.valueOf((byte)rhsGreaterThan[i]))) == 1);
      assertTrue(tc.unwrapToInt(op.apply((Object)BigDecimal.valueOf(lhsGreaterThan[i]), (Object)NgByte.valueOf((byte)rhsGreaterThan[i]))) == 1);

      assertTrue(tc.unwrapToInt(op.apply(NgByte.valueOf((byte)lhsGreaterThan[i]), NgChar.valueOf((char)rhsGreaterThan[i]))) == 1);
      assertTrue(tc.unwrapToInt(op.apply(NgChar.valueOf((char)lhsGreaterThan[i]), NgChar.valueOf((char)rhsGreaterThan[i]))) == 1);
      assertTrue(tc.unwrapToInt(op.apply(NgShort.valueOf((short)lhsGreaterThan[i]), NgChar.valueOf((char)rhsGreaterThan[i]))) == 1);
      assertTrue(tc.unwrapToInt(op.apply(NgInt.valueOf(lhsGreaterThan[i]), NgChar.valueOf((char)rhsGreaterThan[i]))) == 1);
      assertTrue(tc.unwrapToInt(op.apply(NgLong.valueOf(lhsGreaterThan[i]), NgChar.valueOf((char)rhsGreaterThan[i]))) == 1);
      assertTrue(tc.unwrapToInt(op.apply(NgFloat.valueOf(lhsGreaterThan[i]), NgChar.valueOf((char)rhsGreaterThan[i]))) == 1);
      assertTrue(tc.unwrapToInt(op.apply(NgDouble.valueOf(lhsGreaterThan[i]), NgChar.valueOf((char)rhsGreaterThan[i]))) == 1);
      assertTrue(tc.unwrapToInt(op.apply((Object)BigInteger.valueOf(lhsGreaterThan[i]), (Object)NgChar.valueOf((char)rhsGreaterThan[i]))) == 1);
      assertTrue(tc.unwrapToInt(op.apply((Object)BigDecimal.valueOf(lhsGreaterThan[i]), (Object)NgChar.valueOf((char)rhsGreaterThan[i]))) == 1);

      assertTrue(tc.unwrapToInt(op.apply(NgByte.valueOf((byte)lhsGreaterThan[i]), NgShort.valueOf((short)rhsGreaterThan[i]))) == 1);
      assertTrue(tc.unwrapToInt(op.apply(NgChar.valueOf((char)lhsGreaterThan[i]), NgShort.valueOf((short)rhsGreaterThan[i]))) == 1);
      assertTrue(tc.unwrapToInt(op.apply(NgShort.valueOf((short)lhsGreaterThan[i]), NgShort.valueOf((short)rhsGreaterThan[i]))) == 1);
      assertTrue(tc.unwrapToInt(op.apply(NgInt.valueOf(lhsGreaterThan[i]), NgShort.valueOf((short)rhsGreaterThan[i]))) == 1);
      assertTrue(tc.unwrapToInt(op.apply(NgLong.valueOf(lhsGreaterThan[i]), NgShort.valueOf((short)rhsGreaterThan[i]))) == 1);
      assertTrue(tc.unwrapToInt(op.apply(NgFloat.valueOf(lhsGreaterThan[i]), NgShort.valueOf((short)rhsGreaterThan[i]))) == 1);
      assertTrue(tc.unwrapToInt(op.apply(NgDouble.valueOf(lhsGreaterThan[i]), NgShort.valueOf((short)rhsGreaterThan[i]))) == 1);
      assertTrue(tc.unwrapToInt(op.apply((Object)BigInteger.valueOf(lhsGreaterThan[i]), (Object)NgShort.valueOf((short)rhsGreaterThan[i]))) == 1);
      assertTrue(tc.unwrapToInt(op.apply((Object)BigDecimal.valueOf(lhsGreaterThan[i]), (Object)NgShort.valueOf((short)rhsGreaterThan[i]))) == 1);

      assertTrue(tc.unwrapToInt(op.apply(NgByte.valueOf((byte)lhsGreaterThan[i]), NgInt.valueOf(rhsGreaterThan[i]))) == 1);
      assertTrue(tc.unwrapToInt(op.apply(NgChar.valueOf((char)lhsGreaterThan[i]), NgInt.valueOf(rhsGreaterThan[i]))) == 1);
      assertTrue(tc.unwrapToInt(op.apply(NgShort.valueOf((short)lhsGreaterThan[i]), NgInt.valueOf(rhsGreaterThan[i]))) == 1);
      assertTrue(tc.unwrapToInt(op.apply(NgInt.valueOf(lhsGreaterThan[i]), NgInt.valueOf(rhsGreaterThan[i]))) == 1);
      assertTrue(tc.unwrapToInt(op.apply(NgLong.valueOf(lhsGreaterThan[i]), NgInt.valueOf(rhsGreaterThan[i]))) == 1);
      assertTrue(tc.unwrapToInt(op.apply(NgFloat.valueOf(lhsGreaterThan[i]), NgInt.valueOf(rhsGreaterThan[i]))) == 1);
      assertTrue(tc.unwrapToInt(op.apply(NgDouble.valueOf(lhsGreaterThan[i]), NgInt.valueOf(rhsGreaterThan[i]))) == 1);
      assertTrue(tc.unwrapToInt(op.apply((Object)BigInteger.valueOf(lhsGreaterThan[i]), (Object)NgInt.valueOf(rhsGreaterThan[i]))) == 1);
      assertTrue(tc.unwrapToInt(op.apply((Object)BigDecimal.valueOf(lhsGreaterThan[i]), (Object)NgInt.valueOf(rhsGreaterThan[i]))) == 1);

      assertTrue(tc.unwrapToInt(op.apply(NgByte.valueOf((byte)lhsGreaterThan[i]), NgLong.valueOf(rhsGreaterThan[i]))) == 1);
      assertTrue(tc.unwrapToInt(op.apply(NgChar.valueOf((char)lhsGreaterThan[i]), NgLong.valueOf(rhsGreaterThan[i]))) == 1);
      assertTrue(tc.unwrapToInt(op.apply(NgShort.valueOf((short)lhsGreaterThan[i]), NgLong.valueOf(rhsGreaterThan[i]))) == 1);
      assertTrue(tc.unwrapToInt(op.apply(NgInt.valueOf(lhsGreaterThan[i]), NgLong.valueOf(rhsGreaterThan[i]))) == 1);
      assertTrue(tc.unwrapToInt(op.apply(NgLong.valueOf(lhsGreaterThan[i]), NgLong.valueOf(rhsGreaterThan[i]))) == 1);
      assertTrue(tc.unwrapToInt(op.apply(NgFloat.valueOf(lhsGreaterThan[i]), NgLong.valueOf(rhsGreaterThan[i]))) == 1);
      assertTrue(tc.unwrapToInt(op.apply(NgDouble.valueOf(lhsGreaterThan[i]), NgLong.valueOf(rhsGreaterThan[i]))) == 1);
      assertTrue(tc.unwrapToInt(op.apply((Object)BigInteger.valueOf(lhsGreaterThan[i]), (Object)NgLong.valueOf(rhsGreaterThan[i]))) == 1);
      assertTrue(tc.unwrapToInt(op.apply((Object)BigDecimal.valueOf(lhsGreaterThan[i]), (Object)NgLong.valueOf(rhsGreaterThan[i]))) == 1);

      assertTrue(tc.unwrapToInt(op.apply(NgByte.valueOf((byte)lhsGreaterThan[i]), NgFloat.valueOf(rhsGreaterThan[i]))) == 1);
      assertTrue(tc.unwrapToInt(op.apply(NgChar.valueOf((char)lhsGreaterThan[i]), NgFloat.valueOf(rhsGreaterThan[i]))) == 1);
      assertTrue(tc.unwrapToInt(op.apply(NgShort.valueOf((short)lhsGreaterThan[i]), NgFloat.valueOf(rhsGreaterThan[i]))) == 1);
      assertTrue(tc.unwrapToInt(op.apply(NgInt.valueOf(lhsGreaterThan[i]), NgFloat.valueOf(rhsGreaterThan[i]))) == 1);
      assertTrue(tc.unwrapToInt(op.apply(NgLong.valueOf(lhsGreaterThan[i]), NgFloat.valueOf(rhsGreaterThan[i]))) == 1);
      assertTrue(tc.unwrapToInt(op.apply(NgFloat.valueOf(lhsGreaterThan[i]), NgFloat.valueOf(rhsGreaterThan[i]))) == 1);
      assertTrue(tc.unwrapToInt(op.apply(NgDouble.valueOf(lhsGreaterThan[i]), NgFloat.valueOf(rhsGreaterThan[i]))) == 1);
      assertTrue(tc.unwrapToInt(op.apply((Object)BigInteger.valueOf(lhsGreaterThan[i]), (Object)NgFloat.valueOf(rhsGreaterThan[i]))) == 1);
      assertTrue(tc.unwrapToInt(op.apply((Object)BigDecimal.valueOf(lhsGreaterThan[i]), (Object)NgFloat.valueOf(rhsGreaterThan[i]))) == 1);

      assertTrue(tc.unwrapToInt(op.apply(NgByte.valueOf((byte)lhsGreaterThan[i]), NgDouble.valueOf(rhsGreaterThan[i]))) == 1);
      assertTrue(tc.unwrapToInt(op.apply(NgChar.valueOf((char)lhsGreaterThan[i]), NgDouble.valueOf(rhsGreaterThan[i]))) == 1);
      assertTrue(tc.unwrapToInt(op.apply(NgShort.valueOf((short)lhsGreaterThan[i]), NgDouble.valueOf(rhsGreaterThan[i]))) == 1);
      assertTrue(tc.unwrapToInt(op.apply(NgInt.valueOf(lhsGreaterThan[i]), NgDouble.valueOf(rhsGreaterThan[i]))) == 1);
      assertTrue(tc.unwrapToInt(op.apply(NgLong.valueOf(lhsGreaterThan[i]), NgDouble.valueOf(rhsGreaterThan[i]))) == 1);
      assertTrue(tc.unwrapToInt(op.apply(NgFloat.valueOf(lhsGreaterThan[i]), NgDouble.valueOf(rhsGreaterThan[i]))) == 1);
      assertTrue(tc.unwrapToInt(op.apply(NgDouble.valueOf(lhsGreaterThan[i]), NgDouble.valueOf(rhsGreaterThan[i]))) == 1);
      assertTrue(tc.unwrapToInt(op.apply((Object)BigInteger.valueOf(lhsGreaterThan[i]), (Object)NgDouble.valueOf(rhsGreaterThan[i]))) == 1);
      assertTrue(tc.unwrapToInt(op.apply((Object)BigDecimal.valueOf(lhsGreaterThan[i]), (Object)NgDouble.valueOf(rhsGreaterThan[i]))) == 1);

      assertTrue(tc.unwrapToInt(op.apply((Object)NgByte.valueOf((byte)lhsGreaterThan[i]), (Object)BigInteger.valueOf(rhsGreaterThan[i]))) == 1);
      assertTrue(tc.unwrapToInt(op.apply((Object)NgChar.valueOf((char)lhsGreaterThan[i]), (Object)BigInteger.valueOf(rhsGreaterThan[i]))) == 1);
      assertTrue(tc.unwrapToInt(op.apply((Object)NgShort.valueOf((short)lhsGreaterThan[i]), (Object)BigInteger.valueOf(rhsGreaterThan[i]))) == 1);
      assertTrue(tc.unwrapToInt(op.apply((Object)NgInt.valueOf(lhsGreaterThan[i]), (Object)BigInteger.valueOf(rhsGreaterThan[i]))) == 1);
      assertTrue(tc.unwrapToInt(op.apply((Object)NgLong.valueOf(lhsGreaterThan[i]), (Object)BigInteger.valueOf(rhsGreaterThan[i]))) == 1);
      assertTrue(tc.unwrapToInt(op.apply((Object)NgFloat.valueOf(lhsGreaterThan[i]), (Object)BigInteger.valueOf(rhsGreaterThan[i]))) == 1);
      assertTrue(tc.unwrapToInt(op.apply((Object)NgDouble.valueOf(lhsGreaterThan[i]), (Object)BigInteger.valueOf(rhsGreaterThan[i]))) == 1);
      assertTrue(tc.unwrapToInt(op.apply((Object)BigInteger.valueOf(lhsGreaterThan[i]), (Object)BigInteger.valueOf(rhsGreaterThan[i]))) == 1);
      assertTrue(tc.unwrapToInt(op.apply((Object)BigDecimal.valueOf(lhsGreaterThan[i]), (Object)BigInteger.valueOf(rhsGreaterThan[i]))) == 1);

      assertTrue(tc.unwrapToInt(op.apply((Object)NgByte.valueOf((byte)lhsGreaterThan[i]), (Object)BigDecimal.valueOf(rhsGreaterThan[i]))) == 1);
      assertTrue(tc.unwrapToInt(op.apply((Object)NgChar.valueOf((char)lhsGreaterThan[i]), (Object)BigDecimal.valueOf(rhsGreaterThan[i]))) == 1);
      assertTrue(tc.unwrapToInt(op.apply((Object)NgShort.valueOf((short)lhsGreaterThan[i]), (Object)BigDecimal.valueOf(rhsGreaterThan[i]))) == 1);
      assertTrue(tc.unwrapToInt(op.apply((Object)NgInt.valueOf(lhsGreaterThan[i]), (Object)BigDecimal.valueOf(rhsGreaterThan[i]))) == 1);
      assertTrue(tc.unwrapToInt(op.apply((Object)NgLong.valueOf(lhsGreaterThan[i]), (Object)BigDecimal.valueOf(rhsGreaterThan[i]))) == 1);
      assertTrue(tc.unwrapToInt(op.apply((Object)NgFloat.valueOf(lhsGreaterThan[i]), (Object)BigDecimal.valueOf(rhsGreaterThan[i]))) == 1);
      assertTrue(tc.unwrapToInt(op.apply((Object)NgDouble.valueOf(lhsGreaterThan[i]), (Object)BigDecimal.valueOf(rhsGreaterThan[i]))) == 1);
      assertTrue(tc.unwrapToInt(op.apply((Object)BigInteger.valueOf(lhsGreaterThan[i]), (Object)BigDecimal.valueOf(rhsGreaterThan[i]))) == 1);
      assertTrue(tc.unwrapToInt(op.apply((Object)BigDecimal.valueOf(lhsGreaterThan[i]), (Object)BigDecimal.valueOf(rhsGreaterThan[i]))) == 1);

      assertTrue(op.intApply(NgByte.valueOf((byte)lhsGreaterThan[i]), NgByte.valueOf((byte)rhsGreaterThan[i])) == 1);
      assertTrue(op.intApply(NgChar.valueOf((char)lhsGreaterThan[i]), NgByte.valueOf((byte)rhsGreaterThan[i])) == 1);
      assertTrue(op.intApply(NgShort.valueOf((short)lhsGreaterThan[i]), NgByte.valueOf((byte)rhsGreaterThan[i])) == 1);
      assertTrue(op.intApply(NgInt.valueOf(lhsGreaterThan[i]), NgByte.valueOf((byte)rhsGreaterThan[i])) == 1);
      assertTrue(op.intApply(NgLong.valueOf(lhsGreaterThan[i]), NgByte.valueOf((byte)rhsGreaterThan[i])) == 1);
      assertTrue(op.intApply(NgFloat.valueOf(lhsGreaterThan[i]), NgByte.valueOf((byte)rhsGreaterThan[i])) == 1);
      assertTrue(op.intApply(NgDouble.valueOf(lhsGreaterThan[i]), NgByte.valueOf((byte)rhsGreaterThan[i])) == 1);
      assertTrue(op.intApply((Object)BigInteger.valueOf(lhsGreaterThan[i]), (Object)NgByte.valueOf((byte)rhsGreaterThan[i])) == 1);
      assertTrue(op.intApply((Object)BigDecimal.valueOf(lhsGreaterThan[i]), (Object)NgByte.valueOf((byte)rhsGreaterThan[i])) == 1);

      assertTrue(op.intApply(NgByte.valueOf((byte)lhsGreaterThan[i]), NgChar.valueOf((char)rhsGreaterThan[i])) == 1);
      assertTrue(op.intApply(NgChar.valueOf((char)lhsGreaterThan[i]), NgChar.valueOf((char)rhsGreaterThan[i])) == 1);
      assertTrue(op.intApply(NgShort.valueOf((short)lhsGreaterThan[i]), NgChar.valueOf((char)rhsGreaterThan[i])) == 1);
      assertTrue(op.intApply(NgInt.valueOf(lhsGreaterThan[i]), NgChar.valueOf((char)rhsGreaterThan[i])) == 1);
      assertTrue(op.intApply(NgLong.valueOf(lhsGreaterThan[i]), NgChar.valueOf((char)rhsGreaterThan[i])) == 1);
      assertTrue(op.intApply(NgFloat.valueOf(lhsGreaterThan[i]), NgChar.valueOf((char)rhsGreaterThan[i])) == 1);
      assertTrue(op.intApply(NgDouble.valueOf(lhsGreaterThan[i]), NgChar.valueOf((char)rhsGreaterThan[i])) == 1);
      assertTrue(op.intApply((Object)BigInteger.valueOf(lhsGreaterThan[i]), (Object)NgChar.valueOf((char)rhsGreaterThan[i])) == 1);
      assertTrue(op.intApply((Object)BigDecimal.valueOf(lhsGreaterThan[i]), (Object)NgChar.valueOf((char)rhsGreaterThan[i])) == 1);

      assertTrue(op.intApply(NgByte.valueOf((byte)lhsGreaterThan[i]), NgShort.valueOf((short)rhsGreaterThan[i])) == 1);
      assertTrue(op.intApply(NgChar.valueOf((char)lhsGreaterThan[i]), NgShort.valueOf((short)rhsGreaterThan[i])) == 1);
      assertTrue(op.intApply(NgShort.valueOf((short)lhsGreaterThan[i]), NgShort.valueOf((short)rhsGreaterThan[i])) == 1);
      assertTrue(op.intApply(NgInt.valueOf(lhsGreaterThan[i]), NgShort.valueOf((short)rhsGreaterThan[i])) == 1);
      assertTrue(op.intApply(NgLong.valueOf(lhsGreaterThan[i]), NgShort.valueOf((short)rhsGreaterThan[i])) == 1);
      assertTrue(op.intApply(NgFloat.valueOf(lhsGreaterThan[i]), NgShort.valueOf((short)rhsGreaterThan[i])) == 1);
      assertTrue(op.intApply(NgDouble.valueOf(lhsGreaterThan[i]), NgShort.valueOf((short)rhsGreaterThan[i])) == 1);
      assertTrue(op.intApply((Object)BigInteger.valueOf(lhsGreaterThan[i]), (Object)NgShort.valueOf((short)rhsGreaterThan[i])) == 1);
      assertTrue(op.intApply((Object)BigDecimal.valueOf(lhsGreaterThan[i]), (Object)NgShort.valueOf((short)rhsGreaterThan[i])) == 1);

      assertTrue(op.intApply(NgByte.valueOf((byte)lhsGreaterThan[i]), NgInt.valueOf(rhsGreaterThan[i])) == 1);
      assertTrue(op.intApply(NgChar.valueOf((char)lhsGreaterThan[i]), NgInt.valueOf(rhsGreaterThan[i])) == 1);
      assertTrue(op.intApply(NgShort.valueOf((short)lhsGreaterThan[i]), NgInt.valueOf(rhsGreaterThan[i])) == 1);
      assertTrue(op.intApply(NgInt.valueOf(lhsGreaterThan[i]), NgInt.valueOf(rhsGreaterThan[i])) == 1);
      assertTrue(op.intApply(NgLong.valueOf(lhsGreaterThan[i]), NgInt.valueOf(rhsGreaterThan[i])) == 1);
      assertTrue(op.intApply(NgFloat.valueOf(lhsGreaterThan[i]), NgInt.valueOf(rhsGreaterThan[i])) == 1);
      assertTrue(op.intApply(NgDouble.valueOf(lhsGreaterThan[i]), NgInt.valueOf(rhsGreaterThan[i])) == 1);
      assertTrue(op.intApply((Object)BigInteger.valueOf(lhsGreaterThan[i]), (Object)NgInt.valueOf(rhsGreaterThan[i])) == 1);
      assertTrue(op.intApply((Object)BigDecimal.valueOf(lhsGreaterThan[i]), (Object)NgInt.valueOf(rhsGreaterThan[i])) == 1);

      assertTrue(op.intApply(NgByte.valueOf((byte)lhsGreaterThan[i]), NgLong.valueOf(rhsGreaterThan[i])) == 1);
      assertTrue(op.intApply(NgChar.valueOf((char)lhsGreaterThan[i]), NgLong.valueOf(rhsGreaterThan[i])) == 1);
      assertTrue(op.intApply(NgShort.valueOf((short)lhsGreaterThan[i]), NgLong.valueOf(rhsGreaterThan[i])) == 1);
      assertTrue(op.intApply(NgInt.valueOf(lhsGreaterThan[i]), NgLong.valueOf(rhsGreaterThan[i])) == 1);
      assertTrue(op.intApply(NgLong.valueOf(lhsGreaterThan[i]), NgLong.valueOf(rhsGreaterThan[i])) == 1);
      assertTrue(op.intApply(NgFloat.valueOf(lhsGreaterThan[i]), NgLong.valueOf(rhsGreaterThan[i])) == 1);
      assertTrue(op.intApply(NgDouble.valueOf(lhsGreaterThan[i]), NgLong.valueOf(rhsGreaterThan[i])) == 1);
      assertTrue(op.intApply((Object)BigInteger.valueOf(lhsGreaterThan[i]), (Object)NgLong.valueOf(rhsGreaterThan[i])) == 1);
      assertTrue(op.intApply((Object)BigDecimal.valueOf(lhsGreaterThan[i]), (Object)NgLong.valueOf(rhsGreaterThan[i])) == 1);

      assertTrue(op.intApply(NgByte.valueOf((byte)lhsGreaterThan[i]), NgFloat.valueOf(rhsGreaterThan[i])) == 1);
      assertTrue(op.intApply(NgChar.valueOf((char)lhsGreaterThan[i]), NgFloat.valueOf(rhsGreaterThan[i])) == 1);
      assertTrue(op.intApply(NgShort.valueOf((short)lhsGreaterThan[i]), NgFloat.valueOf(rhsGreaterThan[i])) == 1);
      assertTrue(op.intApply(NgInt.valueOf(lhsGreaterThan[i]), NgFloat.valueOf(rhsGreaterThan[i])) == 1);
      assertTrue(op.intApply(NgLong.valueOf(lhsGreaterThan[i]), NgFloat.valueOf(rhsGreaterThan[i])) == 1);
      assertTrue(op.intApply(NgFloat.valueOf(lhsGreaterThan[i]), NgFloat.valueOf(rhsGreaterThan[i])) == 1);
      assertTrue(op.intApply(NgDouble.valueOf(lhsGreaterThan[i]), NgFloat.valueOf(rhsGreaterThan[i])) == 1);
      assertTrue(op.intApply((Object)BigInteger.valueOf(lhsGreaterThan[i]), (Object)NgFloat.valueOf(rhsGreaterThan[i])) == 1);
      assertTrue(op.intApply((Object)BigDecimal.valueOf(lhsGreaterThan[i]), (Object)NgFloat.valueOf(rhsGreaterThan[i])) == 1);

      assertTrue(op.intApply(NgByte.valueOf((byte)lhsGreaterThan[i]), NgDouble.valueOf(rhsGreaterThan[i])) == 1);
      assertTrue(op.intApply(NgChar.valueOf((char)lhsGreaterThan[i]), NgDouble.valueOf(rhsGreaterThan[i])) == 1);
      assertTrue(op.intApply(NgShort.valueOf((short)lhsGreaterThan[i]), NgDouble.valueOf(rhsGreaterThan[i])) == 1);
      assertTrue(op.intApply(NgInt.valueOf(lhsGreaterThan[i]), NgDouble.valueOf(rhsGreaterThan[i])) == 1);
      assertTrue(op.intApply(NgLong.valueOf(lhsGreaterThan[i]), NgDouble.valueOf(rhsGreaterThan[i])) == 1);
      assertTrue(op.intApply(NgFloat.valueOf(lhsGreaterThan[i]), NgDouble.valueOf(rhsGreaterThan[i])) == 1);
      assertTrue(op.intApply(NgDouble.valueOf(lhsGreaterThan[i]), NgDouble.valueOf(rhsGreaterThan[i])) == 1);
      assertTrue(op.intApply((Object)BigInteger.valueOf(lhsGreaterThan[i]), (Object)NgDouble.valueOf(rhsGreaterThan[i])) == 1);
      assertTrue(op.intApply((Object)BigDecimal.valueOf(lhsGreaterThan[i]), (Object)NgDouble.valueOf(rhsGreaterThan[i])) == 1);

      assertTrue(op.intApply((Object)NgByte.valueOf((byte)lhsGreaterThan[i]), (Object)BigInteger.valueOf(rhsGreaterThan[i])) == 1);
      assertTrue(op.intApply((Object)NgChar.valueOf((char)lhsGreaterThan[i]), (Object)BigInteger.valueOf(rhsGreaterThan[i])) == 1);
      assertTrue(op.intApply((Object)NgShort.valueOf((short)lhsGreaterThan[i]), (Object)BigInteger.valueOf(rhsGreaterThan[i])) == 1);
      assertTrue(op.intApply((Object)NgInt.valueOf(lhsGreaterThan[i]), (Object)BigInteger.valueOf(rhsGreaterThan[i])) == 1);
      assertTrue(op.intApply((Object)NgLong.valueOf(lhsGreaterThan[i]), (Object)BigInteger.valueOf(rhsGreaterThan[i])) == 1);
      assertTrue(op.intApply((Object)NgFloat.valueOf(lhsGreaterThan[i]), (Object)BigInteger.valueOf(rhsGreaterThan[i])) == 1);
      assertTrue(op.intApply((Object)NgDouble.valueOf(lhsGreaterThan[i]), (Object)BigInteger.valueOf(rhsGreaterThan[i])) == 1);
      assertTrue(op.intApply((Object)BigInteger.valueOf(lhsGreaterThan[i]), (Object)BigInteger.valueOf(rhsGreaterThan[i])) == 1);
      assertTrue(op.intApply((Object)BigDecimal.valueOf(lhsGreaterThan[i]), (Object)BigInteger.valueOf(rhsGreaterThan[i])) == 1);

      assertTrue(op.intApply((Object)NgByte.valueOf((byte)lhsGreaterThan[i]), (Object)BigDecimal.valueOf(rhsGreaterThan[i])) == 1);
      assertTrue(op.intApply((Object)NgChar.valueOf((char)lhsGreaterThan[i]), (Object)BigDecimal.valueOf(rhsGreaterThan[i])) == 1);
      assertTrue(op.intApply((Object)NgShort.valueOf((short)lhsGreaterThan[i]), (Object)BigDecimal.valueOf(rhsGreaterThan[i])) == 1);
      assertTrue(op.intApply((Object)NgInt.valueOf(lhsGreaterThan[i]), (Object)BigDecimal.valueOf(rhsGreaterThan[i])) == 1);
      assertTrue(op.intApply((Object)NgLong.valueOf(lhsGreaterThan[i]), (Object)BigDecimal.valueOf(rhsGreaterThan[i])) == 1);
      assertTrue(op.intApply((Object)NgFloat.valueOf(lhsGreaterThan[i]), (Object)BigDecimal.valueOf(rhsGreaterThan[i])) == 1);
      assertTrue(op.intApply((Object)NgDouble.valueOf(lhsGreaterThan[i]), (Object)BigDecimal.valueOf(rhsGreaterThan[i])) == 1);
      assertTrue(op.intApply((Object)BigInteger.valueOf(lhsGreaterThan[i]), (Object)BigDecimal.valueOf(rhsGreaterThan[i])) == 1);
      assertTrue(op.intApply((Object)BigDecimal.valueOf(lhsGreaterThan[i]), (Object)BigDecimal.valueOf(rhsGreaterThan[i])) == 1);

      assertTrue(op.intApply(NgByte.valueOf((byte)lhsGreaterThan[i]), byteMetaClass, NgByte.valueOf((byte)rhsGreaterThan[i])) == 1);
      assertTrue(op.intApply(NgChar.valueOf((char)lhsGreaterThan[i]), byteMetaClass, NgByte.valueOf((byte)rhsGreaterThan[i])) == 1);
      assertTrue(op.intApply(NgShort.valueOf((short)lhsGreaterThan[i]), byteMetaClass, NgByte.valueOf((byte)rhsGreaterThan[i])) == 1);
      assertTrue(op.intApply(NgInt.valueOf(lhsGreaterThan[i]), byteMetaClass, NgByte.valueOf((byte)rhsGreaterThan[i])) == 1);
      assertTrue(op.intApply(NgLong.valueOf(lhsGreaterThan[i]), byteMetaClass, NgByte.valueOf((byte)rhsGreaterThan[i])) == 1);
      assertTrue(op.intApply(NgFloat.valueOf(lhsGreaterThan[i]), byteMetaClass, NgByte.valueOf((byte)rhsGreaterThan[i])) == 1);
      assertTrue(op.intApply(NgDouble.valueOf(lhsGreaterThan[i]), byteMetaClass, NgByte.valueOf((byte)rhsGreaterThan[i])) == 1);
      assertTrue(op.intApply((Object)BigInteger.valueOf(lhsGreaterThan[i]), byteMetaClass, (Object)NgByte.valueOf((byte)rhsGreaterThan[i])) == 1);
      assertTrue(op.intApply((Object)BigDecimal.valueOf(lhsGreaterThan[i]), byteMetaClass, (Object)NgByte.valueOf((byte)rhsGreaterThan[i])) == 1);

      assertTrue(op.intApply(NgByte.valueOf((byte)lhsGreaterThan[i]), charMetaClass, NgChar.valueOf((char)rhsGreaterThan[i])) == 1);
      assertTrue(op.intApply(NgChar.valueOf((char)lhsGreaterThan[i]), charMetaClass, NgChar.valueOf((char)rhsGreaterThan[i])) == 1);
      assertTrue(op.intApply(NgShort.valueOf((short)lhsGreaterThan[i]), charMetaClass, NgChar.valueOf((char)rhsGreaterThan[i])) == 1);
      assertTrue(op.intApply(NgInt.valueOf(lhsGreaterThan[i]), charMetaClass, NgChar.valueOf((char)rhsGreaterThan[i])) == 1);
      assertTrue(op.intApply(NgLong.valueOf(lhsGreaterThan[i]), charMetaClass, NgChar.valueOf((char)rhsGreaterThan[i])) == 1);
      assertTrue(op.intApply(NgFloat.valueOf(lhsGreaterThan[i]), charMetaClass, NgChar.valueOf((char)rhsGreaterThan[i])) == 1);
      assertTrue(op.intApply(NgDouble.valueOf(lhsGreaterThan[i]), charMetaClass, NgChar.valueOf((char)rhsGreaterThan[i])) == 1);
      assertTrue(op.intApply((Object)BigInteger.valueOf(lhsGreaterThan[i]), charMetaClass, (Object)NgChar.valueOf((char)rhsGreaterThan[i])) == 1);
      assertTrue(op.intApply((Object)BigDecimal.valueOf(lhsGreaterThan[i]), charMetaClass, (Object)NgChar.valueOf((char)rhsGreaterThan[i])) == 1);

      assertTrue(op.intApply(NgByte.valueOf((byte)lhsGreaterThan[i]), shortMetaClass, NgShort.valueOf((short)rhsGreaterThan[i])) == 1);
      assertTrue(op.intApply(NgChar.valueOf((char)lhsGreaterThan[i]), shortMetaClass, NgShort.valueOf((short)rhsGreaterThan[i])) == 1);
      assertTrue(op.intApply(NgShort.valueOf((short)lhsGreaterThan[i]), shortMetaClass, NgShort.valueOf((short)rhsGreaterThan[i])) == 1);
      assertTrue(op.intApply(NgInt.valueOf(lhsGreaterThan[i]), shortMetaClass, NgShort.valueOf((short)rhsGreaterThan[i])) == 1);
      assertTrue(op.intApply(NgLong.valueOf(lhsGreaterThan[i]), shortMetaClass, NgShort.valueOf((short)rhsGreaterThan[i])) == 1);
      assertTrue(op.intApply(NgFloat.valueOf(lhsGreaterThan[i]), shortMetaClass, NgShort.valueOf((short)rhsGreaterThan[i])) == 1);
      assertTrue(op.intApply(NgDouble.valueOf(lhsGreaterThan[i]), shortMetaClass, NgShort.valueOf((short)rhsGreaterThan[i])) == 1);
      assertTrue(op.intApply((Object)BigInteger.valueOf(lhsGreaterThan[i]), shortMetaClass, (Object)NgShort.valueOf((short)rhsGreaterThan[i])) == 1);
      assertTrue(op.intApply((Object)BigDecimal.valueOf(lhsGreaterThan[i]), shortMetaClass, (Object)NgShort.valueOf((short)rhsGreaterThan[i])) == 1);

      assertTrue(op.intApply(NgByte.valueOf((byte)lhsGreaterThan[i]), intMetaClass, NgInt.valueOf(rhsGreaterThan[i])) == 1);
      assertTrue(op.intApply(NgChar.valueOf((char)lhsGreaterThan[i]), intMetaClass, NgInt.valueOf(rhsGreaterThan[i])) == 1);
      assertTrue(op.intApply(NgShort.valueOf((short)lhsGreaterThan[i]), intMetaClass, NgInt.valueOf(rhsGreaterThan[i])) == 1);
      assertTrue(op.intApply(NgInt.valueOf(lhsGreaterThan[i]), intMetaClass, NgInt.valueOf(rhsGreaterThan[i])) == 1);
      assertTrue(op.intApply(NgLong.valueOf(lhsGreaterThan[i]), intMetaClass, NgInt.valueOf(rhsGreaterThan[i])) == 1);
      assertTrue(op.intApply(NgFloat.valueOf(lhsGreaterThan[i]), intMetaClass, NgInt.valueOf(rhsGreaterThan[i])) == 1);
      assertTrue(op.intApply(NgDouble.valueOf(lhsGreaterThan[i]), intMetaClass, NgInt.valueOf(rhsGreaterThan[i])) == 1);
      assertTrue(op.intApply((Object)BigInteger.valueOf(lhsGreaterThan[i]), intMetaClass, (Object)NgInt.valueOf(rhsGreaterThan[i])) == 1);
      assertTrue(op.intApply((Object)BigDecimal.valueOf(lhsGreaterThan[i]), intMetaClass, (Object)NgInt.valueOf(rhsGreaterThan[i])) == 1);

      assertTrue(op.intApply(NgByte.valueOf((byte)lhsGreaterThan[i]), longMetaClass, NgLong.valueOf(rhsGreaterThan[i])) == 1);
      assertTrue(op.intApply(NgChar.valueOf((char)lhsGreaterThan[i]), longMetaClass, NgLong.valueOf(rhsGreaterThan[i])) == 1);
      assertTrue(op.intApply(NgShort.valueOf((short)lhsGreaterThan[i]), longMetaClass, NgLong.valueOf(rhsGreaterThan[i])) == 1);
      assertTrue(op.intApply(NgInt.valueOf(lhsGreaterThan[i]), longMetaClass, NgLong.valueOf(rhsGreaterThan[i])) == 1);
      assertTrue(op.intApply(NgLong.valueOf(lhsGreaterThan[i]), longMetaClass, NgLong.valueOf(rhsGreaterThan[i])) == 1);
      assertTrue(op.intApply(NgFloat.valueOf(lhsGreaterThan[i]), longMetaClass, NgLong.valueOf(rhsGreaterThan[i])) == 1);
      assertTrue(op.intApply(NgDouble.valueOf(lhsGreaterThan[i]), longMetaClass, NgLong.valueOf(rhsGreaterThan[i])) == 1);
      assertTrue(op.intApply((Object)BigInteger.valueOf(lhsGreaterThan[i]), longMetaClass, (Object)NgLong.valueOf(rhsGreaterThan[i])) == 1);
      assertTrue(op.intApply((Object)BigDecimal.valueOf(lhsGreaterThan[i]), longMetaClass, (Object)NgLong.valueOf(rhsGreaterThan[i])) == 1);

      assertTrue(op.intApply(NgByte.valueOf((byte)lhsGreaterThan[i]), floatMetaClass, NgFloat.valueOf(rhsGreaterThan[i])) == 1);
      assertTrue(op.intApply(NgChar.valueOf((char)lhsGreaterThan[i]), floatMetaClass, NgFloat.valueOf(rhsGreaterThan[i])) == 1);
      assertTrue(op.intApply(NgShort.valueOf((short)lhsGreaterThan[i]), floatMetaClass, NgFloat.valueOf(rhsGreaterThan[i])) == 1);
      assertTrue(op.intApply(NgInt.valueOf(lhsGreaterThan[i]), floatMetaClass, NgFloat.valueOf(rhsGreaterThan[i])) == 1);
      assertTrue(op.intApply(NgLong.valueOf(lhsGreaterThan[i]), floatMetaClass, NgFloat.valueOf(rhsGreaterThan[i])) == 1);
      assertTrue(op.intApply(NgFloat.valueOf((float)lhsGreaterThan[i]), floatMetaClass, NgFloat.valueOf((float)rhsGreaterThan[i])) == 1);
      assertTrue(op.intApply((Object)NgDouble.valueOf((double)lhsGreaterThan[i]), floatMetaClass, (Object)NgFloat.valueOf((float)rhsGreaterThan[i])) == 1);
      assertTrue(op.intApply((Object)BigInteger.valueOf(lhsGreaterThan[i]), floatMetaClass, (Object)NgFloat.valueOf((float)rhsGreaterThan[i])) == 1);
      assertTrue(op.intApply((Object)BigDecimal.valueOf(lhsGreaterThan[i]), floatMetaClass, (Object)NgFloat.valueOf((float)rhsGreaterThan[i])) == 1);

      assertTrue(op.intApply((Object)NgByte.valueOf((byte)lhsGreaterThan[i]), doubleMetaClass, (Object)NgDouble.valueOf((double)rhsGreaterThan[i])) == 1);
      assertTrue(op.intApply((Object)NgChar.valueOf((char)lhsGreaterThan[i]), doubleMetaClass, (Object)NgDouble.valueOf((double)rhsGreaterThan[i])) == 1);
      assertTrue(op.intApply((Object)NgShort.valueOf((short)lhsGreaterThan[i]), doubleMetaClass, (Object)NgDouble.valueOf((double)rhsGreaterThan[i])) == 1);
      assertTrue(op.intApply((Object)NgInt.valueOf((int)lhsGreaterThan[i]), doubleMetaClass, (Object)NgDouble.valueOf((double)rhsGreaterThan[i])) == 1);
      assertTrue(op.intApply((Object)NgLong.valueOf((long)lhsGreaterThan[i]), doubleMetaClass, (Object)NgDouble.valueOf((double)rhsGreaterThan[i])) == 1);
      assertTrue(op.intApply((Object)NgFloat.valueOf((float)lhsGreaterThan[i]), doubleMetaClass, (Object)NgDouble.valueOf((double)rhsGreaterThan[i])) == 1);
      assertTrue(op.intApply((Object)NgDouble.valueOf((double)lhsGreaterThan[i]), doubleMetaClass, (Object)NgDouble.valueOf((double)rhsGreaterThan[i])) == 1);
      assertTrue(op.intApply((Object)BigInteger.valueOf(lhsGreaterThan[i]), doubleMetaClass, (Object)NgDouble.valueOf((double)rhsGreaterThan[i])) == 1);
      assertTrue(op.intApply((Object)BigDecimal.valueOf(lhsGreaterThan[i]), doubleMetaClass, (Object)NgDouble.valueOf((double)rhsGreaterThan[i])) == 1);

      assertTrue(op.intApply((Object)NgByte.valueOf((byte)lhsGreaterThan[i]), bigIntegerMetaClass, (Object)BigInteger.valueOf(rhsGreaterThan[i])) == 1);
      assertTrue(op.intApply((Object)NgChar.valueOf((char)lhsGreaterThan[i]), bigIntegerMetaClass, (Object)BigInteger.valueOf(rhsGreaterThan[i])) == 1);
      assertTrue(op.intApply((Object)NgShort.valueOf((short)lhsGreaterThan[i]), bigIntegerMetaClass, (Object)BigInteger.valueOf(rhsGreaterThan[i])) == 1);
      assertTrue(op.intApply((Object)NgInt.valueOf((int)lhsGreaterThan[i]), bigIntegerMetaClass, (Object)BigInteger.valueOf(rhsGreaterThan[i])) == 1);
      assertTrue(op.intApply((Object)NgLong.valueOf((long)lhsGreaterThan[i]), bigIntegerMetaClass, (Object)BigInteger.valueOf(rhsGreaterThan[i])) == 1);
      assertTrue(op.intApply((Object)NgFloat.valueOf((float)lhsGreaterThan[i]), bigIntegerMetaClass, (Object)BigInteger.valueOf(rhsGreaterThan[i])) == 1);
      assertTrue(op.intApply((Object)NgDouble.valueOf((double)lhsGreaterThan[i]), bigIntegerMetaClass, (Object)BigInteger.valueOf(rhsGreaterThan[i])) == 1);
      assertTrue(op.intApply((Object)BigInteger.valueOf(lhsGreaterThan[i]), bigIntegerMetaClass, (Object)BigInteger.valueOf(rhsGreaterThan[i])) == 1);
      assertTrue(op.intApply((Object)BigDecimal.valueOf(lhsGreaterThan[i]), bigIntegerMetaClass, (Object)BigInteger.valueOf(rhsGreaterThan[i])) == 1);

      assertTrue(op.intApply((Object)NgByte.valueOf((byte)lhsGreaterThan[i]), bigDecimalMetaClass, (Object)BigDecimal.valueOf(rhsGreaterThan[i])) == 1);
      assertTrue(op.intApply((Object)NgChar.valueOf((char)lhsGreaterThan[i]), bigDecimalMetaClass, (Object)BigDecimal.valueOf(rhsGreaterThan[i])) == 1);
      assertTrue(op.intApply((Object)NgShort.valueOf((short)lhsGreaterThan[i]), bigDecimalMetaClass, (Object)BigDecimal.valueOf(rhsGreaterThan[i])) == 1);
      assertTrue(op.intApply((Object)NgInt.valueOf((int)lhsGreaterThan[i]), bigDecimalMetaClass, (Object)BigDecimal.valueOf(rhsGreaterThan[i])) == 1);
      assertTrue(op.intApply((Object)NgLong.valueOf((long)lhsGreaterThan[i]), bigDecimalMetaClass, (Object)BigDecimal.valueOf(rhsGreaterThan[i])) == 1);
      assertTrue(op.intApply((Object)NgFloat.valueOf((float)lhsGreaterThan[i]), bigDecimalMetaClass, (Object)BigDecimal.valueOf(rhsGreaterThan[i])) == 1);
      assertTrue(op.intApply((Object)NgDouble.valueOf((double)lhsGreaterThan[i]), bigDecimalMetaClass, (Object)BigDecimal.valueOf(rhsGreaterThan[i])) == 1);
      assertTrue(op.intApply((Object)BigInteger.valueOf(lhsGreaterThan[i]), bigDecimalMetaClass, (Object)BigDecimal.valueOf(rhsGreaterThan[i])) == 1);
      assertTrue(op.intApply((Object)BigDecimal.valueOf(lhsGreaterThan[i]), bigDecimalMetaClass, (Object)BigDecimal.valueOf(rhsGreaterThan[i])) == 1);
    }
  }
  public void testCompare() throws Throwable {
    final ExtendedThreadContext tc = (ExtendedThreadContext)ThreadContext.getThreadContext();
    doTest(tc, tc.compare(), new int[]{1}, new int[]{1}, new int[]{0}, new int[]{1}, new int[]{1}, new int[]{0});
  }

}
