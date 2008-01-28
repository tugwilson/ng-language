package ng.runtime;

import java.math.BigDecimal;
import java.math.BigInteger;

import junit.framework.TestCase;
import ng.runtime.metaclass.MetaClass;
import ng.runtime.threadcontext.BooleanComparison;
import ng.runtime.threadcontext.ThreadContext;

/**
 * @author John
 *
 */
public class BooleanComparisonTest extends TestCase {
  private static void doTest(final ThreadContext tc, final BooleanComparison op, final int lhsTrue[], final int rhsTrue[], final int lhsFalse[], final int rhsFalse[]) {
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
      assertTrue(tc.unwrapToBoolean(op.apply(lhsTrue[i], (byte)rhsTrue[i])));
      assertTrue(tc.unwrapToBoolean(op.apply((long)lhsTrue[i], (byte)rhsTrue[i])));
      assertTrue(tc.unwrapToBoolean(op.apply((float)lhsTrue[i], (byte)rhsTrue[i])));
      assertTrue(tc.unwrapToBoolean(op.apply((double)lhsTrue[i], (byte)rhsTrue[i])));
      assertTrue(tc.unwrapToBoolean(op.apply(BigInteger.valueOf(lhsTrue[i]), (byte)rhsTrue[i])));
      assertTrue(tc.unwrapToBoolean(op.apply(BigDecimal.valueOf(lhsTrue[i]), (byte)rhsTrue[i])));

      assertTrue(tc.unwrapToBoolean(op.apply((byte)lhsTrue[i], (char)rhsTrue[i])));
      assertTrue(tc.unwrapToBoolean(op.apply((char)lhsTrue[i], (char)rhsTrue[i])));
      assertTrue(tc.unwrapToBoolean(op.apply((short)lhsTrue[i], (char)rhsTrue[i])));
      assertTrue(tc.unwrapToBoolean(op.apply(lhsTrue[i], (char)rhsTrue[i])));
      assertTrue(tc.unwrapToBoolean(op.apply((long)lhsTrue[i], (char)rhsTrue[i])));
      assertTrue(tc.unwrapToBoolean(op.apply((float)lhsTrue[i], (char)rhsTrue[i])));
      assertTrue(tc.unwrapToBoolean(op.apply((double)lhsTrue[i], (char)rhsTrue[i])));
      assertTrue(tc.unwrapToBoolean(op.apply(BigInteger.valueOf(lhsTrue[i]), (char)rhsTrue[i])));
      assertTrue(tc.unwrapToBoolean(op.apply(BigDecimal.valueOf(lhsTrue[i]), (char)rhsTrue[i])));

      assertTrue(tc.unwrapToBoolean(op.apply((byte)lhsTrue[i], (short)rhsTrue[i])));
      assertTrue(tc.unwrapToBoolean(op.apply((char)lhsTrue[i], (short)rhsTrue[i])));
      assertTrue(tc.unwrapToBoolean(op.apply((short)lhsTrue[i], (short)rhsTrue[i])));
      assertTrue(tc.unwrapToBoolean(op.apply(lhsTrue[i], (short)rhsTrue[i])));
      assertTrue(tc.unwrapToBoolean(op.apply((long)lhsTrue[i], (short)rhsTrue[i])));
      assertTrue(tc.unwrapToBoolean(op.apply((float)lhsTrue[i], (short)rhsTrue[i])));
      assertTrue(tc.unwrapToBoolean(op.apply((double)lhsTrue[i], (short)rhsTrue[i])));
      assertTrue(tc.unwrapToBoolean(op.apply(BigInteger.valueOf(lhsTrue[i]), (short)rhsTrue[i])));
      assertTrue(tc.unwrapToBoolean(op.apply(BigDecimal.valueOf(lhsTrue[i]), (short)rhsTrue[i])));

      assertTrue(tc.unwrapToBoolean(op.apply((byte)lhsTrue[i], rhsTrue[i])));
      assertTrue(tc.unwrapToBoolean(op.apply((char)lhsTrue[i], rhsTrue[i])));
      assertTrue(tc.unwrapToBoolean(op.apply((short)lhsTrue[i], rhsTrue[i])));
      assertTrue(tc.unwrapToBoolean(op.apply(lhsTrue[i], rhsTrue[i])));
      assertTrue(tc.unwrapToBoolean(op.apply((long)lhsTrue[i], rhsTrue[i])));
      assertTrue(tc.unwrapToBoolean(op.apply((float)lhsTrue[i], rhsTrue[i])));
      assertTrue(tc.unwrapToBoolean(op.apply((double)lhsTrue[i], rhsTrue[i])));
      assertTrue(tc.unwrapToBoolean(op.apply(BigInteger.valueOf(lhsTrue[i]), rhsTrue[i])));
      assertTrue(tc.unwrapToBoolean(op.apply(BigDecimal.valueOf(lhsTrue[i]), rhsTrue[i])));

      assertTrue(tc.unwrapToBoolean(op.apply((byte)lhsTrue[i], (long)rhsTrue[i])));
      assertTrue(tc.unwrapToBoolean(op.apply((char)lhsTrue[i], (long)rhsTrue[i])));
      assertTrue(tc.unwrapToBoolean(op.apply((short)lhsTrue[i], (long)rhsTrue[i])));
      assertTrue(tc.unwrapToBoolean(op.apply(lhsTrue[i], (long)rhsTrue[i])));
      assertTrue(tc.unwrapToBoolean(op.apply((long)lhsTrue[i], (long)rhsTrue[i])));
      assertTrue(tc.unwrapToBoolean(op.apply((float)lhsTrue[i], (long)rhsTrue[i])));
      assertTrue(tc.unwrapToBoolean(op.apply((double)lhsTrue[i], (long)rhsTrue[i])));
      assertTrue(tc.unwrapToBoolean(op.apply(BigInteger.valueOf(lhsTrue[i]), (long)rhsTrue[i])));
      assertTrue(tc.unwrapToBoolean(op.apply(BigDecimal.valueOf(lhsTrue[i]), (long)rhsTrue[i])));

      assertTrue(tc.unwrapToBoolean(op.apply((byte)lhsTrue[i], (float)rhsTrue[i])));
      assertTrue(tc.unwrapToBoolean(op.apply((char)lhsTrue[i], (float)rhsTrue[i])));
      assertTrue(tc.unwrapToBoolean(op.apply((short)lhsTrue[i], (float)rhsTrue[i])));
      assertTrue(tc.unwrapToBoolean(op.apply(lhsTrue[i], (float)rhsTrue[i])));
      assertTrue(tc.unwrapToBoolean(op.apply((long)lhsTrue[i], (float)rhsTrue[i])));
      assertTrue(tc.unwrapToBoolean(op.apply((float)lhsTrue[i], (float)rhsTrue[i])));
      assertTrue(tc.unwrapToBoolean(op.apply((double)lhsTrue[i], (float)rhsTrue[i])));
      assertTrue(tc.unwrapToBoolean(op.apply(BigInteger.valueOf(lhsTrue[i]), (float)rhsTrue[i])));
      assertTrue(tc.unwrapToBoolean(op.apply(BigDecimal.valueOf(lhsTrue[i]), (float)rhsTrue[i])));

      assertTrue(tc.unwrapToBoolean(op.apply((byte)lhsTrue[i], (double)rhsTrue[i])));
      assertTrue(tc.unwrapToBoolean(op.apply((char)lhsTrue[i], (double)rhsTrue[i])));
      assertTrue(tc.unwrapToBoolean(op.apply((short)lhsTrue[i], (double)rhsTrue[i])));
      assertTrue(tc.unwrapToBoolean(op.apply(lhsTrue[i], (double)rhsTrue[i])));
      assertTrue(tc.unwrapToBoolean(op.apply((long)lhsTrue[i], (double)rhsTrue[i])));
      assertTrue(tc.unwrapToBoolean(op.apply((float)lhsTrue[i], (double)rhsTrue[i])));
      assertTrue(tc.unwrapToBoolean(op.apply((double)lhsTrue[i], (double)rhsTrue[i])));
      assertTrue(tc.unwrapToBoolean(op.apply(BigInteger.valueOf(lhsTrue[i]), (double)rhsTrue[i])));
      assertTrue(tc.unwrapToBoolean(op.apply(BigDecimal.valueOf(lhsTrue[i]), (double)rhsTrue[i])));

      assertTrue(tc.unwrapToBoolean(op.apply((byte)lhsTrue[i], BigInteger.valueOf(rhsTrue[i]))));
      assertTrue(tc.unwrapToBoolean(op.apply((char)lhsTrue[i], BigInteger.valueOf(rhsTrue[i]))));
      assertTrue(tc.unwrapToBoolean(op.apply((short)lhsTrue[i], BigInteger.valueOf(rhsTrue[i]))));
      assertTrue(tc.unwrapToBoolean(op.apply(lhsTrue[i], BigInteger.valueOf(rhsTrue[i]))));
      assertTrue(tc.unwrapToBoolean(op.apply((long)lhsTrue[i], BigInteger.valueOf(rhsTrue[i]))));
      assertTrue(tc.unwrapToBoolean(op.apply((float)lhsTrue[i], BigInteger.valueOf(rhsTrue[i]))));
      assertTrue(tc.unwrapToBoolean(op.apply((double)lhsTrue[i], BigInteger.valueOf(rhsTrue[i]))));
      assertTrue(tc.unwrapToBoolean(op.apply(BigInteger.valueOf(lhsTrue[i]), BigInteger.valueOf(rhsTrue[i]))));
      assertTrue(tc.unwrapToBoolean(op.apply(BigDecimal.valueOf(lhsTrue[i]), BigInteger.valueOf(rhsTrue[i]))));

      assertTrue(tc.unwrapToBoolean(op.apply((byte)lhsTrue[i], BigDecimal.valueOf(rhsTrue[i]))));
      assertTrue(tc.unwrapToBoolean(op.apply((char)lhsTrue[i], BigDecimal.valueOf(rhsTrue[i]))));
      assertTrue(tc.unwrapToBoolean(op.apply((short)lhsTrue[i], BigDecimal.valueOf(rhsTrue[i]))));
      assertTrue(tc.unwrapToBoolean(op.apply(lhsTrue[i], BigDecimal.valueOf(rhsTrue[i]))));
      assertTrue(tc.unwrapToBoolean(op.apply((long)lhsTrue[i], BigDecimal.valueOf(rhsTrue[i]))));
      assertTrue(tc.unwrapToBoolean(op.apply((float)lhsTrue[i], BigDecimal.valueOf(rhsTrue[i]))));
      assertTrue(tc.unwrapToBoolean(op.apply((double)lhsTrue[i], BigDecimal.valueOf(rhsTrue[i]))));
      assertTrue(tc.unwrapToBoolean(op.apply(BigInteger.valueOf(lhsTrue[i]), BigDecimal.valueOf(rhsTrue[i]))));
      assertTrue(tc.unwrapToBoolean(op.apply(BigDecimal.valueOf(lhsTrue[i]), BigDecimal.valueOf(rhsTrue[i]))));

      assertTrue(tc.unwrapToBoolean(op.apply((byte)lhsTrue[i], NgByte.valueOf((byte)rhsTrue[i]))));
      assertTrue(tc.unwrapToBoolean(op.apply((char)lhsTrue[i], NgByte.valueOf((byte)rhsTrue[i]))));
      assertTrue(tc.unwrapToBoolean(op.apply((short)lhsTrue[i], NgByte.valueOf((byte)rhsTrue[i]))));
      assertTrue(tc.unwrapToBoolean(op.apply(lhsTrue[i], NgByte.valueOf((byte)rhsTrue[i]))));
      assertTrue(tc.unwrapToBoolean(op.apply((long)lhsTrue[i], NgByte.valueOf((byte)rhsTrue[i]))));
      assertTrue(tc.unwrapToBoolean(op.apply((float)lhsTrue[i], NgByte.valueOf((byte)rhsTrue[i]))));
      assertTrue(tc.unwrapToBoolean(op.apply((double)lhsTrue[i], NgByte.valueOf((byte)rhsTrue[i]))));
      assertTrue(tc.unwrapToBoolean(op.apply(BigInteger.valueOf(lhsTrue[i]), NgByte.valueOf((byte)rhsTrue[i]))));
      assertTrue(tc.unwrapToBoolean(op.apply(BigDecimal.valueOf(lhsTrue[i]), NgByte.valueOf((byte)rhsTrue[i]))));

      assertTrue(tc.unwrapToBoolean(op.apply((byte)lhsTrue[i], NgChar.valueOf((char)rhsTrue[i]))));
      assertTrue(tc.unwrapToBoolean(op.apply((char)lhsTrue[i], NgChar.valueOf((char)rhsTrue[i]))));
      assertTrue(tc.unwrapToBoolean(op.apply((short)lhsTrue[i], NgChar.valueOf((char)rhsTrue[i]))));
      assertTrue(tc.unwrapToBoolean(op.apply(lhsTrue[i], NgChar.valueOf((char)rhsTrue[i]))));
      assertTrue(tc.unwrapToBoolean(op.apply((long)lhsTrue[i], NgChar.valueOf((char)rhsTrue[i]))));
      assertTrue(tc.unwrapToBoolean(op.apply((float)lhsTrue[i], NgChar.valueOf((char)rhsTrue[i]))));
      assertTrue(tc.unwrapToBoolean(op.apply((double)lhsTrue[i], NgChar.valueOf((char)rhsTrue[i]))));
      assertTrue(tc.unwrapToBoolean(op.apply(BigInteger.valueOf(lhsTrue[i]), NgChar.valueOf((char)rhsTrue[i]))));
      assertTrue(tc.unwrapToBoolean(op.apply(BigDecimal.valueOf(lhsTrue[i]), NgChar.valueOf((char)rhsTrue[i]))));

      assertTrue(tc.unwrapToBoolean(op.apply((byte)lhsTrue[i], NgShort.valueOf((short)rhsTrue[i]))));
      assertTrue(tc.unwrapToBoolean(op.apply((char)lhsTrue[i], NgShort.valueOf((short)rhsTrue[i]))));
      assertTrue(tc.unwrapToBoolean(op.apply((short)lhsTrue[i], NgShort.valueOf((short)rhsTrue[i]))));
      assertTrue(tc.unwrapToBoolean(op.apply(lhsTrue[i], NgShort.valueOf((short)rhsTrue[i]))));
      assertTrue(tc.unwrapToBoolean(op.apply((long)lhsTrue[i], NgShort.valueOf((short)rhsTrue[i]))));
      assertTrue(tc.unwrapToBoolean(op.apply((float)lhsTrue[i], NgShort.valueOf((short)rhsTrue[i]))));
      assertTrue(tc.unwrapToBoolean(op.apply((double)lhsTrue[i], NgShort.valueOf((short)rhsTrue[i]))));
      assertTrue(tc.unwrapToBoolean(op.apply(BigInteger.valueOf(lhsTrue[i]), NgShort.valueOf((short)rhsTrue[i]))));
      assertTrue(tc.unwrapToBoolean(op.apply(BigDecimal.valueOf(lhsTrue[i]), NgShort.valueOf((short)rhsTrue[i]))));

      assertTrue(tc.unwrapToBoolean(op.apply((byte)lhsTrue[i], NgInt.valueOf(rhsTrue[i]))));
      assertTrue(tc.unwrapToBoolean(op.apply((char)lhsTrue[i], NgInt.valueOf(rhsTrue[i]))));
      assertTrue(tc.unwrapToBoolean(op.apply((short)lhsTrue[i], NgInt.valueOf(rhsTrue[i]))));
      assertTrue(tc.unwrapToBoolean(op.apply(lhsTrue[i], NgInt.valueOf(rhsTrue[i]))));
      assertTrue(tc.unwrapToBoolean(op.apply((long)lhsTrue[i], NgInt.valueOf(rhsTrue[i]))));
      assertTrue(tc.unwrapToBoolean(op.apply((float)lhsTrue[i], NgInt.valueOf(rhsTrue[i]))));
      assertTrue(tc.unwrapToBoolean(op.apply((double)lhsTrue[i], NgInt.valueOf(rhsTrue[i]))));
      assertTrue(tc.unwrapToBoolean(op.apply(BigInteger.valueOf(lhsTrue[i]), NgInt.valueOf(rhsTrue[i]))));
      assertTrue(tc.unwrapToBoolean(op.apply(BigDecimal.valueOf(lhsTrue[i]), NgInt.valueOf(rhsTrue[i]))));

      assertTrue(tc.unwrapToBoolean(op.apply((byte)lhsTrue[i], NgLong.valueOf(rhsTrue[i]))));
      assertTrue(tc.unwrapToBoolean(op.apply((char)lhsTrue[i], NgLong.valueOf(rhsTrue[i]))));
      assertTrue(tc.unwrapToBoolean(op.apply((short)lhsTrue[i], NgLong.valueOf(rhsTrue[i]))));
      assertTrue(tc.unwrapToBoolean(op.apply(lhsTrue[i], NgLong.valueOf(rhsTrue[i]))));
      assertTrue(tc.unwrapToBoolean(op.apply((long)lhsTrue[i], NgLong.valueOf(rhsTrue[i]))));
      assertTrue(tc.unwrapToBoolean(op.apply((float)lhsTrue[i], NgLong.valueOf(rhsTrue[i]))));
      assertTrue(tc.unwrapToBoolean(op.apply((double)lhsTrue[i], NgLong.valueOf(rhsTrue[i]))));
      assertTrue(tc.unwrapToBoolean(op.apply(BigInteger.valueOf(lhsTrue[i]), NgLong.valueOf(rhsTrue[i]))));
      assertTrue(tc.unwrapToBoolean(op.apply(BigDecimal.valueOf(lhsTrue[i]), NgLong.valueOf(rhsTrue[i]))));

      assertTrue(tc.unwrapToBoolean(op.apply((byte)lhsTrue[i], NgFloat.valueOf(rhsTrue[i]))));
      assertTrue(tc.unwrapToBoolean(op.apply((char)lhsTrue[i], NgFloat.valueOf(rhsTrue[i]))));
      assertTrue(tc.unwrapToBoolean(op.apply((short)lhsTrue[i], NgFloat.valueOf(rhsTrue[i]))));
      assertTrue(tc.unwrapToBoolean(op.apply(lhsTrue[i], NgFloat.valueOf(rhsTrue[i]))));
      assertTrue(tc.unwrapToBoolean(op.apply((long)lhsTrue[i], NgFloat.valueOf(rhsTrue[i]))));
      assertTrue(tc.unwrapToBoolean(op.apply((float)lhsTrue[i], NgFloat.valueOf(rhsTrue[i]))));
      assertTrue(tc.unwrapToBoolean(op.apply((double)lhsTrue[i], NgFloat.valueOf(rhsTrue[i]))));
      assertTrue(tc.unwrapToBoolean(op.apply(BigInteger.valueOf(lhsTrue[i]), NgFloat.valueOf(rhsTrue[i]))));
      assertTrue(tc.unwrapToBoolean(op.apply(BigDecimal.valueOf(lhsTrue[i]), NgFloat.valueOf(rhsTrue[i]))));

      assertTrue(tc.unwrapToBoolean(op.apply((byte)lhsTrue[i], NgDouble.valueOf(rhsTrue[i]))));
      assertTrue(tc.unwrapToBoolean(op.apply((char)lhsTrue[i], NgDouble.valueOf(rhsTrue[i]))));
      assertTrue(tc.unwrapToBoolean(op.apply((short)lhsTrue[i], NgDouble.valueOf(rhsTrue[i]))));
      assertTrue(tc.unwrapToBoolean(op.apply(lhsTrue[i], NgDouble.valueOf(rhsTrue[i]))));
      assertTrue(tc.unwrapToBoolean(op.apply((long)lhsTrue[i], NgDouble.valueOf(rhsTrue[i]))));
      assertTrue(tc.unwrapToBoolean(op.apply((float)lhsTrue[i], NgDouble.valueOf(rhsTrue[i]))));
      assertTrue(tc.unwrapToBoolean(op.apply((double)lhsTrue[i], NgDouble.valueOf(rhsTrue[i]))));
      assertTrue(tc.unwrapToBoolean(op.apply(BigInteger.valueOf(lhsTrue[i]), NgDouble.valueOf(rhsTrue[i]))));
      assertTrue(tc.unwrapToBoolean(op.apply(BigDecimal.valueOf(lhsTrue[i]), NgDouble.valueOf(rhsTrue[i]))));

      assertTrue(tc.unwrapToBoolean(op.apply(NgByte.valueOf((byte)lhsTrue[i]), NgByte.valueOf((byte)rhsTrue[i]))));
      assertTrue(tc.unwrapToBoolean(op.apply(NgChar.valueOf((char)lhsTrue[i]), NgByte.valueOf((byte)rhsTrue[i]))));
      assertTrue(tc.unwrapToBoolean(op.apply(NgShort.valueOf((short)lhsTrue[i]), NgByte.valueOf((byte)rhsTrue[i]))));
      assertTrue(tc.unwrapToBoolean(op.apply(NgInt.valueOf(lhsTrue[i]), NgByte.valueOf((byte)rhsTrue[i]))));
      assertTrue(tc.unwrapToBoolean(op.apply(NgLong.valueOf(lhsTrue[i]), NgByte.valueOf((byte)rhsTrue[i]))));
      assertTrue(tc.unwrapToBoolean(op.apply(NgFloat.valueOf(lhsTrue[i]), NgByte.valueOf((byte)rhsTrue[i]))));
      assertTrue(tc.unwrapToBoolean(op.apply(NgDouble.valueOf(lhsTrue[i]), NgByte.valueOf((byte)rhsTrue[i]))));
      assertTrue(tc.unwrapToBoolean(op.apply(BigInteger.valueOf(lhsTrue[i]), NgByte.valueOf((byte)rhsTrue[i]))));
      assertTrue(tc.unwrapToBoolean(op.apply(BigDecimal.valueOf(lhsTrue[i]), NgByte.valueOf((byte)rhsTrue[i]))));

      assertTrue(tc.unwrapToBoolean(op.apply(NgByte.valueOf((byte)lhsTrue[i]), NgChar.valueOf((char)rhsTrue[i]))));
      assertTrue(tc.unwrapToBoolean(op.apply(NgChar.valueOf((char)lhsTrue[i]), NgChar.valueOf((char)rhsTrue[i]))));
      assertTrue(tc.unwrapToBoolean(op.apply(NgShort.valueOf((short)lhsTrue[i]), NgChar.valueOf((char)rhsTrue[i]))));
      assertTrue(tc.unwrapToBoolean(op.apply(NgInt.valueOf(lhsTrue[i]), NgChar.valueOf((char)rhsTrue[i]))));
      assertTrue(tc.unwrapToBoolean(op.apply(NgLong.valueOf(lhsTrue[i]), NgChar.valueOf((char)rhsTrue[i]))));
      assertTrue(tc.unwrapToBoolean(op.apply(NgFloat.valueOf(lhsTrue[i]), NgChar.valueOf((char)rhsTrue[i]))));
      assertTrue(tc.unwrapToBoolean(op.apply(NgDouble.valueOf(lhsTrue[i]), NgChar.valueOf((char)rhsTrue[i]))));
      assertTrue(tc.unwrapToBoolean(op.apply(BigInteger.valueOf(lhsTrue[i]), NgChar.valueOf((char)rhsTrue[i]))));
      assertTrue(tc.unwrapToBoolean(op.apply(BigDecimal.valueOf(lhsTrue[i]), NgChar.valueOf((char)rhsTrue[i]))));

      assertTrue(tc.unwrapToBoolean(op.apply(NgByte.valueOf((byte)lhsTrue[i]), NgShort.valueOf((short)rhsTrue[i]))));
      assertTrue(tc.unwrapToBoolean(op.apply(NgChar.valueOf((char)lhsTrue[i]), NgShort.valueOf((short)rhsTrue[i]))));
      assertTrue(tc.unwrapToBoolean(op.apply(NgShort.valueOf((short)lhsTrue[i]), NgShort.valueOf((short)rhsTrue[i]))));
      assertTrue(tc.unwrapToBoolean(op.apply(NgInt.valueOf(lhsTrue[i]), NgShort.valueOf((short)rhsTrue[i]))));
      assertTrue(tc.unwrapToBoolean(op.apply(NgLong.valueOf(lhsTrue[i]), NgShort.valueOf((short)rhsTrue[i]))));
      assertTrue(tc.unwrapToBoolean(op.apply(NgFloat.valueOf(lhsTrue[i]), NgShort.valueOf((short)rhsTrue[i]))));
      assertTrue(tc.unwrapToBoolean(op.apply(NgDouble.valueOf(lhsTrue[i]), NgShort.valueOf((short)rhsTrue[i]))));
      assertTrue(tc.unwrapToBoolean(op.apply(BigInteger.valueOf(lhsTrue[i]), NgShort.valueOf((short)rhsTrue[i]))));
      assertTrue(tc.unwrapToBoolean(op.apply(BigDecimal.valueOf(lhsTrue[i]), NgShort.valueOf((short)rhsTrue[i]))));

      assertTrue(tc.unwrapToBoolean(op.apply(NgByte.valueOf((byte)lhsTrue[i]), NgInt.valueOf(rhsTrue[i]))));
      assertTrue(tc.unwrapToBoolean(op.apply(NgChar.valueOf((char)lhsTrue[i]), NgInt.valueOf(rhsTrue[i]))));
      assertTrue(tc.unwrapToBoolean(op.apply(NgShort.valueOf((short)lhsTrue[i]), NgInt.valueOf(rhsTrue[i]))));
      assertTrue(tc.unwrapToBoolean(op.apply(NgInt.valueOf(lhsTrue[i]), NgInt.valueOf(rhsTrue[i]))));
      assertTrue(tc.unwrapToBoolean(op.apply(NgLong.valueOf(lhsTrue[i]), NgInt.valueOf(rhsTrue[i]))));
      assertTrue(tc.unwrapToBoolean(op.apply(NgFloat.valueOf(lhsTrue[i]), NgInt.valueOf(rhsTrue[i]))));
      assertTrue(tc.unwrapToBoolean(op.apply(NgDouble.valueOf(lhsTrue[i]), NgInt.valueOf(rhsTrue[i]))));
      assertTrue(tc.unwrapToBoolean(op.apply(BigInteger.valueOf(lhsTrue[i]), NgInt.valueOf(rhsTrue[i]))));
      assertTrue(tc.unwrapToBoolean(op.apply(BigDecimal.valueOf(lhsTrue[i]), NgInt.valueOf(rhsTrue[i]))));

      assertTrue(tc.unwrapToBoolean(op.apply(NgByte.valueOf((byte)lhsTrue[i]), NgLong.valueOf(rhsTrue[i]))));
      assertTrue(tc.unwrapToBoolean(op.apply(NgChar.valueOf((char)lhsTrue[i]), NgLong.valueOf(rhsTrue[i]))));
      assertTrue(tc.unwrapToBoolean(op.apply(NgShort.valueOf((short)lhsTrue[i]), NgLong.valueOf(rhsTrue[i]))));
      assertTrue(tc.unwrapToBoolean(op.apply(NgInt.valueOf(lhsTrue[i]), NgLong.valueOf(rhsTrue[i]))));
      assertTrue(tc.unwrapToBoolean(op.apply(NgLong.valueOf(lhsTrue[i]), NgLong.valueOf(rhsTrue[i]))));
      assertTrue(tc.unwrapToBoolean(op.apply(NgFloat.valueOf(lhsTrue[i]), NgLong.valueOf(rhsTrue[i]))));
      assertTrue(tc.unwrapToBoolean(op.apply(NgDouble.valueOf(lhsTrue[i]), NgLong.valueOf(rhsTrue[i]))));
      assertTrue(tc.unwrapToBoolean(op.apply(BigInteger.valueOf(lhsTrue[i]), NgLong.valueOf(rhsTrue[i]))));
      assertTrue(tc.unwrapToBoolean(op.apply(BigDecimal.valueOf(lhsTrue[i]), NgLong.valueOf(rhsTrue[i]))));

      assertTrue(tc.unwrapToBoolean(op.apply(NgByte.valueOf((byte)lhsTrue[i]), NgFloat.valueOf(rhsTrue[i]))));
      assertTrue(tc.unwrapToBoolean(op.apply(NgChar.valueOf((char)lhsTrue[i]), NgFloat.valueOf(rhsTrue[i]))));
      assertTrue(tc.unwrapToBoolean(op.apply(NgShort.valueOf((short)lhsTrue[i]), NgFloat.valueOf(rhsTrue[i]))));
      assertTrue(tc.unwrapToBoolean(op.apply(NgInt.valueOf(lhsTrue[i]), NgFloat.valueOf(rhsTrue[i]))));
      assertTrue(tc.unwrapToBoolean(op.apply(NgLong.valueOf(lhsTrue[i]), NgFloat.valueOf(rhsTrue[i]))));
      assertTrue(tc.unwrapToBoolean(op.apply(NgFloat.valueOf(lhsTrue[i]), NgFloat.valueOf(rhsTrue[i]))));
      assertTrue(tc.unwrapToBoolean(op.apply(NgDouble.valueOf(lhsTrue[i]), NgFloat.valueOf(rhsTrue[i]))));
      assertTrue(tc.unwrapToBoolean(op.apply(BigInteger.valueOf(lhsTrue[i]), NgFloat.valueOf(rhsTrue[i]))));
      assertTrue(tc.unwrapToBoolean(op.apply(BigDecimal.valueOf(lhsTrue[i]), NgFloat.valueOf(rhsTrue[i]))));

      assertTrue(tc.unwrapToBoolean(op.apply(NgByte.valueOf((byte)lhsTrue[i]), NgDouble.valueOf(rhsTrue[i]))));
      assertTrue(tc.unwrapToBoolean(op.apply(NgChar.valueOf((char)lhsTrue[i]), NgDouble.valueOf(rhsTrue[i]))));
      assertTrue(tc.unwrapToBoolean(op.apply(NgShort.valueOf((short)lhsTrue[i]), NgDouble.valueOf(rhsTrue[i]))));
      assertTrue(tc.unwrapToBoolean(op.apply(NgInt.valueOf(lhsTrue[i]), NgDouble.valueOf(rhsTrue[i]))));
      assertTrue(tc.unwrapToBoolean(op.apply(NgLong.valueOf(lhsTrue[i]), NgDouble.valueOf(rhsTrue[i]))));
      assertTrue(tc.unwrapToBoolean(op.apply(NgFloat.valueOf(lhsTrue[i]), NgDouble.valueOf(rhsTrue[i]))));
      assertTrue(tc.unwrapToBoolean(op.apply(NgDouble.valueOf(lhsTrue[i]), NgDouble.valueOf(rhsTrue[i]))));
      assertTrue(tc.unwrapToBoolean(op.apply(BigInteger.valueOf(lhsTrue[i]), NgDouble.valueOf(rhsTrue[i]))));
      assertTrue(tc.unwrapToBoolean(op.apply(BigDecimal.valueOf(lhsTrue[i]), NgDouble.valueOf(rhsTrue[i]))));

      assertTrue(tc.unwrapToBoolean(op.apply(NgByte.valueOf((byte)lhsTrue[i]), BigInteger.valueOf(rhsTrue[i]))));
      assertTrue(tc.unwrapToBoolean(op.apply(NgChar.valueOf((char)lhsTrue[i]), BigInteger.valueOf(rhsTrue[i]))));
      assertTrue(tc.unwrapToBoolean(op.apply(NgShort.valueOf((short)lhsTrue[i]), BigInteger.valueOf(rhsTrue[i]))));
      assertTrue(tc.unwrapToBoolean(op.apply(NgInt.valueOf(lhsTrue[i]), BigInteger.valueOf(rhsTrue[i]))));
      assertTrue(tc.unwrapToBoolean(op.apply(NgLong.valueOf(lhsTrue[i]), BigInteger.valueOf(rhsTrue[i]))));
      assertTrue(tc.unwrapToBoolean(op.apply(NgFloat.valueOf(lhsTrue[i]), BigInteger.valueOf(rhsTrue[i]))));
      assertTrue(tc.unwrapToBoolean(op.apply(NgDouble.valueOf(lhsTrue[i]), BigInteger.valueOf(rhsTrue[i]))));
      assertTrue(tc.unwrapToBoolean(op.apply(BigInteger.valueOf(lhsTrue[i]), BigInteger.valueOf(rhsTrue[i]))));
      assertTrue(tc.unwrapToBoolean(op.apply(BigDecimal.valueOf(lhsTrue[i]), BigInteger.valueOf(rhsTrue[i]))));

      assertTrue(tc.unwrapToBoolean(op.apply(NgByte.valueOf((byte)lhsTrue[i]), BigDecimal.valueOf(rhsTrue[i]))));
      assertTrue(tc.unwrapToBoolean(op.apply(NgChar.valueOf((char)lhsTrue[i]), BigDecimal.valueOf(rhsTrue[i]))));
      assertTrue(tc.unwrapToBoolean(op.apply(NgShort.valueOf((short)lhsTrue[i]), BigDecimal.valueOf(rhsTrue[i]))));
      assertTrue(tc.unwrapToBoolean(op.apply(NgInt.valueOf(lhsTrue[i]), BigDecimal.valueOf(rhsTrue[i]))));
      assertTrue(tc.unwrapToBoolean(op.apply(NgLong.valueOf(lhsTrue[i]), BigDecimal.valueOf(rhsTrue[i]))));
      assertTrue(tc.unwrapToBoolean(op.apply(NgFloat.valueOf(lhsTrue[i]), BigDecimal.valueOf(rhsTrue[i]))));
      assertTrue(tc.unwrapToBoolean(op.apply(NgDouble.valueOf(lhsTrue[i]), BigDecimal.valueOf(rhsTrue[i]))));
      assertTrue(tc.unwrapToBoolean(op.apply(BigInteger.valueOf(lhsTrue[i]), BigDecimal.valueOf(rhsTrue[i]))));
      assertTrue(tc.unwrapToBoolean(op.apply(BigDecimal.valueOf(lhsTrue[i]), BigDecimal.valueOf(rhsTrue[i]))));

      assertTrue(tc.unwrapToBoolean(op.apply(NgByte.valueOf((byte)lhsTrue[i]), NgByte.valueOf((byte)rhsTrue[i]))));
      assertTrue(tc.unwrapToBoolean(op.apply(NgChar.valueOf((char)lhsTrue[i]), NgByte.valueOf((byte)rhsTrue[i]))));
      assertTrue(tc.unwrapToBoolean(op.apply(NgShort.valueOf((short)lhsTrue[i]), NgByte.valueOf((byte)rhsTrue[i]))));
      assertTrue(tc.unwrapToBoolean(op.apply(NgInt.valueOf(lhsTrue[i]), NgByte.valueOf((byte)rhsTrue[i]))));
      assertTrue(tc.unwrapToBoolean(op.apply(NgLong.valueOf(lhsTrue[i]), NgByte.valueOf((byte)rhsTrue[i]))));
      assertTrue(tc.unwrapToBoolean(op.apply(NgFloat.valueOf(lhsTrue[i]), NgByte.valueOf((byte)rhsTrue[i]))));
      assertTrue(tc.unwrapToBoolean(op.apply(NgDouble.valueOf(lhsTrue[i]), NgByte.valueOf((byte)rhsTrue[i]))));
      assertTrue(tc.unwrapToBoolean(op.apply((Object)BigInteger.valueOf(lhsTrue[i]), (Object)NgByte.valueOf((byte)rhsTrue[i]))));
      assertTrue(tc.unwrapToBoolean(op.apply((Object)BigDecimal.valueOf(lhsTrue[i]), (Object)NgByte.valueOf((byte)rhsTrue[i]))));

      assertTrue(tc.unwrapToBoolean(op.apply(NgByte.valueOf((byte)lhsTrue[i]), NgChar.valueOf((char)rhsTrue[i]))));
      assertTrue(tc.unwrapToBoolean(op.apply(NgChar.valueOf((char)lhsTrue[i]), NgChar.valueOf((char)rhsTrue[i]))));
      assertTrue(tc.unwrapToBoolean(op.apply(NgShort.valueOf((short)lhsTrue[i]), NgChar.valueOf((char)rhsTrue[i]))));
      assertTrue(tc.unwrapToBoolean(op.apply(NgInt.valueOf(lhsTrue[i]), NgChar.valueOf((char)rhsTrue[i]))));
      assertTrue(tc.unwrapToBoolean(op.apply(NgLong.valueOf(lhsTrue[i]), NgChar.valueOf((char)rhsTrue[i]))));
      assertTrue(tc.unwrapToBoolean(op.apply(NgFloat.valueOf(lhsTrue[i]), NgChar.valueOf((char)rhsTrue[i]))));
      assertTrue(tc.unwrapToBoolean(op.apply(NgDouble.valueOf(lhsTrue[i]), NgChar.valueOf((char)rhsTrue[i]))));
      assertTrue(tc.unwrapToBoolean(op.apply((Object)BigInteger.valueOf(lhsTrue[i]), (Object)NgChar.valueOf((char)rhsTrue[i]))));
      assertTrue(tc.unwrapToBoolean(op.apply((Object)BigDecimal.valueOf(lhsTrue[i]), (Object)NgChar.valueOf((char)rhsTrue[i]))));

      assertTrue(tc.unwrapToBoolean(op.apply(NgByte.valueOf((byte)lhsTrue[i]), NgShort.valueOf((short)rhsTrue[i]))));
      assertTrue(tc.unwrapToBoolean(op.apply(NgChar.valueOf((char)lhsTrue[i]), NgShort.valueOf((short)rhsTrue[i]))));
      assertTrue(tc.unwrapToBoolean(op.apply(NgShort.valueOf((short)lhsTrue[i]), NgShort.valueOf((short)rhsTrue[i]))));
      assertTrue(tc.unwrapToBoolean(op.apply(NgInt.valueOf(lhsTrue[i]), NgShort.valueOf((short)rhsTrue[i]))));
      assertTrue(tc.unwrapToBoolean(op.apply(NgLong.valueOf(lhsTrue[i]), NgShort.valueOf((short)rhsTrue[i]))));
      assertTrue(tc.unwrapToBoolean(op.apply(NgFloat.valueOf(lhsTrue[i]), NgShort.valueOf((short)rhsTrue[i]))));
      assertTrue(tc.unwrapToBoolean(op.apply(NgDouble.valueOf(lhsTrue[i]), NgShort.valueOf((short)rhsTrue[i]))));
      assertTrue(tc.unwrapToBoolean(op.apply((Object)BigInteger.valueOf(lhsTrue[i]), (Object)NgShort.valueOf((short)rhsTrue[i]))));
      assertTrue(tc.unwrapToBoolean(op.apply((Object)BigDecimal.valueOf(lhsTrue[i]), (Object)NgShort.valueOf((short)rhsTrue[i]))));

      assertTrue(tc.unwrapToBoolean(op.apply(NgByte.valueOf((byte)lhsTrue[i]), NgInt.valueOf(rhsTrue[i]))));
      assertTrue(tc.unwrapToBoolean(op.apply(NgChar.valueOf((char)lhsTrue[i]), NgInt.valueOf(rhsTrue[i]))));
      assertTrue(tc.unwrapToBoolean(op.apply(NgShort.valueOf((short)lhsTrue[i]), NgInt.valueOf(rhsTrue[i]))));
      assertTrue(tc.unwrapToBoolean(op.apply(NgInt.valueOf(lhsTrue[i]), NgInt.valueOf(rhsTrue[i]))));
      assertTrue(tc.unwrapToBoolean(op.apply((Object)NgLong.valueOf((long)lhsTrue[i]), (Object)NgInt.valueOf((int)rhsTrue[i]))));
      assertTrue(tc.unwrapToBoolean(op.apply((Object)NgFloat.valueOf((float)lhsTrue[i]), (Object)NgInt.valueOf((int)rhsTrue[i]))));
      assertTrue(tc.unwrapToBoolean(op.apply((Object)NgDouble.valueOf((double)lhsTrue[i]), (Object)NgInt.valueOf((int)rhsTrue[i]))));
      assertTrue(tc.unwrapToBoolean(op.apply((Object)BigInteger.valueOf(lhsTrue[i]), (Object)NgInt.valueOf((int)rhsTrue[i]))));
      assertTrue(tc.unwrapToBoolean(op.apply((Object)BigDecimal.valueOf(lhsTrue[i]), (Object)NgInt.valueOf((int)rhsTrue[i]))));

      assertTrue(tc.unwrapToBoolean(op.apply((Object)NgByte.valueOf((byte)lhsTrue[i]), (Object)NgLong.valueOf((long)rhsTrue[i]))));
      assertTrue(tc.unwrapToBoolean(op.apply((Object)NgChar.valueOf((char)lhsTrue[i]), (Object)NgLong.valueOf((long)rhsTrue[i]))));
      assertTrue(tc.unwrapToBoolean(op.apply((Object)NgShort.valueOf((short)lhsTrue[i]), (Object)NgLong.valueOf((long)rhsTrue[i]))));
      assertTrue(tc.unwrapToBoolean(op.apply((Object)NgInt.valueOf((int)lhsTrue[i]), (Object)NgLong.valueOf((long)rhsTrue[i]))));
      assertTrue(tc.unwrapToBoolean(op.apply((Object)NgLong.valueOf((long)lhsTrue[i]), (Object)NgLong.valueOf((long)rhsTrue[i]))));
      assertTrue(tc.unwrapToBoolean(op.apply((Object)NgFloat.valueOf((float)lhsTrue[i]), (Object)NgLong.valueOf((long)rhsTrue[i]))));
      assertTrue(tc.unwrapToBoolean(op.apply((Object)NgDouble.valueOf((double)lhsTrue[i]), (Object)NgLong.valueOf((long)rhsTrue[i]))));
      assertTrue(tc.unwrapToBoolean(op.apply((Object)BigInteger.valueOf(lhsTrue[i]), (Object)NgLong.valueOf((long)rhsTrue[i]))));
      assertTrue(tc.unwrapToBoolean(op.apply((Object)BigDecimal.valueOf(lhsTrue[i]), (Object)NgLong.valueOf((long)rhsTrue[i]))));

      assertTrue(tc.unwrapToBoolean(op.apply((Object)NgByte.valueOf((byte)lhsTrue[i]), (Object)NgFloat.valueOf((float)rhsTrue[i]))));
      assertTrue(tc.unwrapToBoolean(op.apply((Object)NgChar.valueOf((char)lhsTrue[i]), (Object)NgFloat.valueOf((float)rhsTrue[i]))));
      assertTrue(tc.unwrapToBoolean(op.apply((Object)NgShort.valueOf((short)lhsTrue[i]), (Object)NgFloat.valueOf((float)rhsTrue[i]))));
      assertTrue(tc.unwrapToBoolean(op.apply((Object)NgInt.valueOf((int)lhsTrue[i]), (Object)NgFloat.valueOf((float)rhsTrue[i]))));
      assertTrue(tc.unwrapToBoolean(op.apply((Object)NgLong.valueOf((long)lhsTrue[i]), (Object)NgFloat.valueOf((float)rhsTrue[i]))));
      assertTrue(tc.unwrapToBoolean(op.apply((Object)NgFloat.valueOf((float)lhsTrue[i]), (Object)NgFloat.valueOf((float)rhsTrue[i]))));
      assertTrue(tc.unwrapToBoolean(op.apply((Object)NgDouble.valueOf((double)lhsTrue[i]), (Object)NgFloat.valueOf((float)rhsTrue[i]))));
      assertTrue(tc.unwrapToBoolean(op.apply((Object)BigInteger.valueOf(lhsTrue[i]), (Object)NgFloat.valueOf((float)rhsTrue[i]))));
      assertTrue(tc.unwrapToBoolean(op.apply((Object)BigDecimal.valueOf(lhsTrue[i]), (Object)NgFloat.valueOf((float)rhsTrue[i]))));

      assertTrue(tc.unwrapToBoolean(op.apply((Object)NgByte.valueOf((byte)lhsTrue[i]), (Object)NgDouble.valueOf((double)rhsTrue[i]))));
      assertTrue(tc.unwrapToBoolean(op.apply((Object)NgChar.valueOf((char)lhsTrue[i]), (Object)NgDouble.valueOf((double)rhsTrue[i]))));
      assertTrue(tc.unwrapToBoolean(op.apply((Object)NgShort.valueOf((short)lhsTrue[i]), (Object)NgDouble.valueOf((double)rhsTrue[i]))));
      assertTrue(tc.unwrapToBoolean(op.apply((Object)NgInt.valueOf((int)lhsTrue[i]), (Object)NgDouble.valueOf((double)rhsTrue[i]))));
      assertTrue(tc.unwrapToBoolean(op.apply((Object)NgLong.valueOf((long)lhsTrue[i]), (Object)NgDouble.valueOf((double)rhsTrue[i]))));
      assertTrue(tc.unwrapToBoolean(op.apply((Object)NgFloat.valueOf((float)lhsTrue[i]), (Object)NgDouble.valueOf((double)rhsTrue[i]))));
      assertTrue(tc.unwrapToBoolean(op.apply((Object)NgDouble.valueOf((double)lhsTrue[i]), (Object)NgDouble.valueOf((double)rhsTrue[i]))));
      assertTrue(tc.unwrapToBoolean(op.apply((Object)BigInteger.valueOf(lhsTrue[i]), (Object)NgDouble.valueOf((double)rhsTrue[i]))));
      assertTrue(tc.unwrapToBoolean(op.apply((Object)BigDecimal.valueOf(lhsTrue[i]), (Object)NgDouble.valueOf((double)rhsTrue[i]))));

      assertTrue(tc.unwrapToBoolean(op.apply((Object)NgByte.valueOf((byte)lhsTrue[i]), (Object)BigInteger.valueOf(rhsTrue[i]))));
      assertTrue(tc.unwrapToBoolean(op.apply((Object)NgChar.valueOf((char)lhsTrue[i]), (Object)BigInteger.valueOf(rhsTrue[i]))));
      assertTrue(tc.unwrapToBoolean(op.apply((Object)NgShort.valueOf((short)lhsTrue[i]), (Object)BigInteger.valueOf(rhsTrue[i]))));
      assertTrue(tc.unwrapToBoolean(op.apply((Object)NgInt.valueOf((int)lhsTrue[i]), (Object)BigInteger.valueOf(rhsTrue[i]))));
      assertTrue(tc.unwrapToBoolean(op.apply((Object)NgLong.valueOf((long)lhsTrue[i]), (Object)BigInteger.valueOf(rhsTrue[i]))));
      assertTrue(tc.unwrapToBoolean(op.apply((Object)NgFloat.valueOf((float)lhsTrue[i]), (Object)BigInteger.valueOf(rhsTrue[i]))));
      assertTrue(tc.unwrapToBoolean(op.apply((Object)NgDouble.valueOf((double)lhsTrue[i]), (Object)BigInteger.valueOf(rhsTrue[i]))));
      assertTrue(tc.unwrapToBoolean(op.apply((Object)BigInteger.valueOf(lhsTrue[i]), (Object)BigInteger.valueOf(rhsTrue[i]))));
      assertTrue(tc.unwrapToBoolean(op.apply((Object)BigDecimal.valueOf(lhsTrue[i]), (Object)BigInteger.valueOf(rhsTrue[i]))));

      assertTrue(tc.unwrapToBoolean(op.apply((Object)NgByte.valueOf((byte)lhsTrue[i]), (Object)BigDecimal.valueOf(rhsTrue[i]))));
      assertTrue(tc.unwrapToBoolean(op.apply((Object)NgChar.valueOf((char)lhsTrue[i]), (Object)BigDecimal.valueOf(rhsTrue[i]))));
      assertTrue(tc.unwrapToBoolean(op.apply((Object)NgShort.valueOf((short)lhsTrue[i]), (Object)BigDecimal.valueOf(rhsTrue[i]))));
      assertTrue(tc.unwrapToBoolean(op.apply((Object)NgInt.valueOf((int)lhsTrue[i]), (Object)BigDecimal.valueOf(rhsTrue[i]))));
      assertTrue(tc.unwrapToBoolean(op.apply((Object)NgLong.valueOf((long)lhsTrue[i]), (Object)BigDecimal.valueOf(rhsTrue[i]))));
      assertTrue(tc.unwrapToBoolean(op.apply((Object)NgFloat.valueOf((float)lhsTrue[i]), (Object)BigDecimal.valueOf(rhsTrue[i]))));
      assertTrue(tc.unwrapToBoolean(op.apply((Object)NgDouble.valueOf((double)lhsTrue[i]), (Object)BigDecimal.valueOf(rhsTrue[i]))));
      assertTrue(tc.unwrapToBoolean(op.apply((Object)BigInteger.valueOf(lhsTrue[i]), (Object)BigDecimal.valueOf(rhsTrue[i]))));
      assertTrue(tc.unwrapToBoolean(op.apply((Object)BigDecimal.valueOf(lhsTrue[i]), (Object)BigDecimal.valueOf(rhsTrue[i]))));

      assertTrue(op.applyBoolean((Object)NgByte.valueOf((byte)lhsTrue[i]), (Object)NgByte.valueOf((byte)rhsTrue[i])));
      assertTrue(op.applyBoolean((Object)NgChar.valueOf((char)lhsTrue[i]), (Object)NgByte.valueOf((byte)rhsTrue[i])));
      assertTrue(op.applyBoolean((Object)NgShort.valueOf((short)lhsTrue[i]), (Object)NgByte.valueOf((byte)rhsTrue[i])));
      assertTrue(op.applyBoolean((Object)NgInt.valueOf((int)lhsTrue[i]), (Object)NgByte.valueOf((byte)rhsTrue[i])));
      assertTrue(op.applyBoolean((Object)NgLong.valueOf((long)lhsTrue[i]), (Object)NgByte.valueOf((byte)rhsTrue[i])));
      assertTrue(op.applyBoolean((Object)NgFloat.valueOf((float)lhsTrue[i]), (Object)NgByte.valueOf((byte)rhsTrue[i])));
      assertTrue(op.applyBoolean((Object)NgDouble.valueOf((double)lhsTrue[i]), (Object)NgByte.valueOf((byte)rhsTrue[i])));
      assertTrue(op.applyBoolean((Object)BigInteger.valueOf(lhsTrue[i]), (Object)NgByte.valueOf((byte)rhsTrue[i])));
      assertTrue(op.applyBoolean((Object)BigDecimal.valueOf(lhsTrue[i]), (Object)NgByte.valueOf((byte)rhsTrue[i])));

      assertTrue(op.applyBoolean((Object)NgByte.valueOf((byte)lhsTrue[i]), (Object)NgChar.valueOf((char)rhsTrue[i])));
      assertTrue(op.applyBoolean((Object)NgChar.valueOf((char)lhsTrue[i]), (Object)NgChar.valueOf((char)rhsTrue[i])));
      assertTrue(op.applyBoolean((Object)NgShort.valueOf((short)lhsTrue[i]), (Object)NgChar.valueOf((char)rhsTrue[i])));
      assertTrue(op.applyBoolean((Object)NgInt.valueOf((int)lhsTrue[i]), (Object)NgChar.valueOf((char)rhsTrue[i])));
      assertTrue(op.applyBoolean((Object)NgLong.valueOf((long)lhsTrue[i]), (Object)NgChar.valueOf((char)rhsTrue[i])));
      assertTrue(op.applyBoolean((Object)NgFloat.valueOf((float)lhsTrue[i]), (Object)NgChar.valueOf((char)rhsTrue[i])));
      assertTrue(op.applyBoolean((Object)NgDouble.valueOf((double)lhsTrue[i]), (Object)NgChar.valueOf((char)rhsTrue[i])));
      assertTrue(op.applyBoolean((Object)BigInteger.valueOf(lhsTrue[i]), (Object)NgChar.valueOf((char)rhsTrue[i])));
      assertTrue(op.applyBoolean((Object)BigDecimal.valueOf(lhsTrue[i]), (Object)NgChar.valueOf((char)rhsTrue[i])));

      assertTrue(op.applyBoolean((Object)NgByte.valueOf((byte)lhsTrue[i]), (Object)NgShort.valueOf((short)rhsTrue[i])));
      assertTrue(op.applyBoolean((Object)NgChar.valueOf((char)lhsTrue[i]), (Object)NgShort.valueOf((short)rhsTrue[i])));
      assertTrue(op.applyBoolean((Object)NgShort.valueOf((short)lhsTrue[i]), (Object)NgShort.valueOf((short)rhsTrue[i])));
      assertTrue(op.applyBoolean((Object)NgInt.valueOf((int)lhsTrue[i]), (Object)NgShort.valueOf((short)rhsTrue[i])));
      assertTrue(op.applyBoolean((Object)NgLong.valueOf((long)lhsTrue[i]), (Object)NgShort.valueOf((short)rhsTrue[i])));
      assertTrue(op.applyBoolean((Object)NgFloat.valueOf((float)lhsTrue[i]), (Object)NgShort.valueOf((short)rhsTrue[i])));
      assertTrue(op.applyBoolean((Object)NgDouble.valueOf((double)lhsTrue[i]), (Object)NgShort.valueOf((short)rhsTrue[i])));
      assertTrue(op.applyBoolean((Object)BigInteger.valueOf(lhsTrue[i]), (Object)NgShort.valueOf((short)rhsTrue[i])));
      assertTrue(op.applyBoolean((Object)BigDecimal.valueOf(lhsTrue[i]), (Object)NgShort.valueOf((short)rhsTrue[i])));

      assertTrue(op.applyBoolean((Object)NgByte.valueOf((byte)lhsTrue[i]), (Object)NgInt.valueOf((int)rhsTrue[i])));
      assertTrue(op.applyBoolean((Object)NgChar.valueOf((char)lhsTrue[i]), (Object)NgInt.valueOf((int)rhsTrue[i])));
      assertTrue(op.applyBoolean((Object)NgShort.valueOf((short)lhsTrue[i]), (Object)NgInt.valueOf((int)rhsTrue[i])));
      assertTrue(op.applyBoolean((Object)NgInt.valueOf((int)lhsTrue[i]), (Object)NgInt.valueOf((int)rhsTrue[i])));
      assertTrue(op.applyBoolean((Object)NgLong.valueOf((long)lhsTrue[i]), (Object)NgInt.valueOf((int)rhsTrue[i])));
      assertTrue(op.applyBoolean((Object)NgFloat.valueOf((float)lhsTrue[i]), (Object)NgInt.valueOf((int)rhsTrue[i])));
      assertTrue(op.applyBoolean((Object)NgDouble.valueOf((double)lhsTrue[i]), (Object)NgInt.valueOf((int)rhsTrue[i])));
      assertTrue(op.applyBoolean((Object)BigInteger.valueOf(lhsTrue[i]), (Object)NgInt.valueOf((int)rhsTrue[i])));
      assertTrue(op.applyBoolean((Object)BigDecimal.valueOf(lhsTrue[i]), (Object)NgInt.valueOf((int)rhsTrue[i])));

      assertTrue(op.applyBoolean((Object)NgByte.valueOf((byte)lhsTrue[i]), (Object)NgLong.valueOf((long)rhsTrue[i])));
      assertTrue(op.applyBoolean((Object)NgChar.valueOf((char)lhsTrue[i]), (Object)NgLong.valueOf((long)rhsTrue[i])));
      assertTrue(op.applyBoolean((Object)NgShort.valueOf((short)lhsTrue[i]), (Object)NgLong.valueOf((long)rhsTrue[i])));
      assertTrue(op.applyBoolean((Object)NgInt.valueOf((int)lhsTrue[i]), (Object)NgLong.valueOf((long)rhsTrue[i])));
      assertTrue(op.applyBoolean((Object)NgLong.valueOf((long)lhsTrue[i]), (Object)NgLong.valueOf((long)rhsTrue[i])));
      assertTrue(op.applyBoolean((Object)NgFloat.valueOf((float)lhsTrue[i]), (Object)NgLong.valueOf((long)rhsTrue[i])));
      assertTrue(op.applyBoolean((Object)NgDouble.valueOf((double)lhsTrue[i]), (Object)NgLong.valueOf((long)rhsTrue[i])));
      assertTrue(op.applyBoolean((Object)BigInteger.valueOf(lhsTrue[i]), (Object)NgLong.valueOf((long)rhsTrue[i])));
      assertTrue(op.applyBoolean((Object)BigDecimal.valueOf(lhsTrue[i]), (Object)NgLong.valueOf((long)rhsTrue[i])));

      assertTrue(op.applyBoolean((Object)NgByte.valueOf((byte)lhsTrue[i]), (Object)NgFloat.valueOf((float)rhsTrue[i])));
      assertTrue(op.applyBoolean((Object)NgChar.valueOf((char)lhsTrue[i]), (Object)NgFloat.valueOf((float)rhsTrue[i])));
      assertTrue(op.applyBoolean((Object)NgShort.valueOf((short)lhsTrue[i]), (Object)NgFloat.valueOf((float)rhsTrue[i])));
      assertTrue(op.applyBoolean((Object)NgInt.valueOf((int)lhsTrue[i]), (Object)NgFloat.valueOf((float)rhsTrue[i])));
      assertTrue(op.applyBoolean((Object)NgLong.valueOf((long)lhsTrue[i]), (Object)NgFloat.valueOf((float)rhsTrue[i])));
      assertTrue(op.applyBoolean((Object)NgFloat.valueOf((float)lhsTrue[i]), (Object)NgFloat.valueOf((float)rhsTrue[i])));
      assertTrue(op.applyBoolean((Object)NgDouble.valueOf((double)lhsTrue[i]), (Object)NgFloat.valueOf((float)rhsTrue[i])));
      assertTrue(op.applyBoolean((Object)BigInteger.valueOf(lhsTrue[i]), (Object)NgFloat.valueOf((float)rhsTrue[i])));
      assertTrue(op.applyBoolean((Object)BigDecimal.valueOf(lhsTrue[i]), (Object)NgFloat.valueOf((float)rhsTrue[i])));

      assertTrue(op.applyBoolean((Object)NgByte.valueOf((byte)lhsTrue[i]), (Object)NgDouble.valueOf((double)rhsTrue[i])));
      assertTrue(op.applyBoolean((Object)NgChar.valueOf((char)lhsTrue[i]), (Object)NgDouble.valueOf((double)rhsTrue[i])));
      assertTrue(op.applyBoolean((Object)NgShort.valueOf((short)lhsTrue[i]), (Object)NgDouble.valueOf((double)rhsTrue[i])));
      assertTrue(op.applyBoolean((Object)NgInt.valueOf((int)lhsTrue[i]), (Object)NgDouble.valueOf((double)rhsTrue[i])));
      assertTrue(op.applyBoolean((Object)NgLong.valueOf((long)lhsTrue[i]), (Object)NgDouble.valueOf((double)rhsTrue[i])));
      assertTrue(op.applyBoolean((Object)NgFloat.valueOf((float)lhsTrue[i]), (Object)NgDouble.valueOf((double)rhsTrue[i])));
      assertTrue(op.applyBoolean((Object)NgDouble.valueOf((double)lhsTrue[i]), (Object)NgDouble.valueOf((double)rhsTrue[i])));
      assertTrue(op.applyBoolean((Object)BigInteger.valueOf(lhsTrue[i]), (Object)NgDouble.valueOf((double)rhsTrue[i])));
      assertTrue(op.applyBoolean((Object)BigDecimal.valueOf(lhsTrue[i]), (Object)NgDouble.valueOf((double)rhsTrue[i])));

      assertTrue(op.applyBoolean((Object)NgByte.valueOf((byte)lhsTrue[i]), (Object)BigInteger.valueOf(rhsTrue[i])));
      assertTrue(op.applyBoolean((Object)NgChar.valueOf((char)lhsTrue[i]), (Object)BigInteger.valueOf(rhsTrue[i])));
      assertTrue(op.applyBoolean((Object)NgShort.valueOf((short)lhsTrue[i]), (Object)BigInteger.valueOf(rhsTrue[i])));
      assertTrue(op.applyBoolean((Object)NgInt.valueOf((int)lhsTrue[i]), (Object)BigInteger.valueOf(rhsTrue[i])));
      assertTrue(op.applyBoolean((Object)NgLong.valueOf((long)lhsTrue[i]), (Object)BigInteger.valueOf(rhsTrue[i])));
      assertTrue(op.applyBoolean((Object)NgFloat.valueOf((float)lhsTrue[i]), (Object)BigInteger.valueOf(rhsTrue[i])));
      assertTrue(op.applyBoolean((Object)NgDouble.valueOf((double)lhsTrue[i]), (Object)BigInteger.valueOf(rhsTrue[i])));
      assertTrue(op.applyBoolean((Object)BigInteger.valueOf(lhsTrue[i]), (Object)BigInteger.valueOf(rhsTrue[i])));
      assertTrue(op.applyBoolean((Object)BigDecimal.valueOf(lhsTrue[i]), (Object)BigInteger.valueOf(rhsTrue[i])));

      assertTrue(op.applyBoolean((Object)NgByte.valueOf((byte)lhsTrue[i]), (Object)BigDecimal.valueOf(rhsTrue[i])));
      assertTrue(op.applyBoolean((Object)NgChar.valueOf((char)lhsTrue[i]), (Object)BigDecimal.valueOf(rhsTrue[i])));
      assertTrue(op.applyBoolean((Object)NgShort.valueOf((short)lhsTrue[i]), (Object)BigDecimal.valueOf(rhsTrue[i])));
      assertTrue(op.applyBoolean((Object)NgInt.valueOf((int)lhsTrue[i]), (Object)BigDecimal.valueOf(rhsTrue[i])));
      assertTrue(op.applyBoolean((Object)NgLong.valueOf((long)lhsTrue[i]), (Object)BigDecimal.valueOf(rhsTrue[i])));
      assertTrue(op.applyBoolean((Object)NgFloat.valueOf((float)lhsTrue[i]), (Object)BigDecimal.valueOf(rhsTrue[i])));
      assertTrue(op.applyBoolean((Object)NgDouble.valueOf((double)lhsTrue[i]), (Object)BigDecimal.valueOf(rhsTrue[i])));
      assertTrue(op.applyBoolean((Object)BigInteger.valueOf(lhsTrue[i]), (Object)BigDecimal.valueOf(rhsTrue[i])));
      assertTrue(op.applyBoolean((Object)BigDecimal.valueOf(lhsTrue[i]), (Object)BigDecimal.valueOf(rhsTrue[i])));

      assertTrue(op.applyBoolean((Object)NgByte.valueOf((byte)lhsTrue[i]), byteMetaClass, (Object)NgByte.valueOf((byte)rhsTrue[i])));
      assertTrue(op.applyBoolean((Object)NgChar.valueOf((char)lhsTrue[i]), byteMetaClass, (Object)NgByte.valueOf((byte)rhsTrue[i])));
      assertTrue(op.applyBoolean((Object)NgShort.valueOf((short)lhsTrue[i]), byteMetaClass, (Object)NgByte.valueOf((byte)rhsTrue[i])));
      assertTrue(op.applyBoolean((Object)NgInt.valueOf((int)lhsTrue[i]), byteMetaClass, (Object)NgByte.valueOf((byte)rhsTrue[i])));
      assertTrue(op.applyBoolean((Object)NgLong.valueOf((long)lhsTrue[i]), byteMetaClass, (Object)NgByte.valueOf((byte)rhsTrue[i])));
      assertTrue(op.applyBoolean((Object)NgFloat.valueOf((float)lhsTrue[i]), byteMetaClass, (Object)NgByte.valueOf((byte)rhsTrue[i])));
      assertTrue(op.applyBoolean((Object)NgDouble.valueOf((double)lhsTrue[i]), byteMetaClass, (Object)NgByte.valueOf((byte)rhsTrue[i])));
      assertTrue(op.applyBoolean((Object)BigInteger.valueOf(lhsTrue[i]), byteMetaClass, (Object)NgByte.valueOf((byte)rhsTrue[i])));
      assertTrue(op.applyBoolean((Object)BigDecimal.valueOf(lhsTrue[i]), byteMetaClass, (Object)NgByte.valueOf((byte)rhsTrue[i])));

      assertTrue(op.applyBoolean((Object)NgByte.valueOf((byte)lhsTrue[i]), charMetaClass, (Object)NgChar.valueOf((char)rhsTrue[i])));
      assertTrue(op.applyBoolean((Object)NgChar.valueOf((char)lhsTrue[i]), charMetaClass, (Object)NgChar.valueOf((char)rhsTrue[i])));
      assertTrue(op.applyBoolean((Object)NgShort.valueOf((short)lhsTrue[i]), charMetaClass, (Object)NgChar.valueOf((char)rhsTrue[i])));
      assertTrue(op.applyBoolean((Object)NgInt.valueOf((int)lhsTrue[i]), charMetaClass, (Object)NgChar.valueOf((char)rhsTrue[i])));
      assertTrue(op.applyBoolean((Object)NgLong.valueOf((long)lhsTrue[i]), charMetaClass, (Object)NgChar.valueOf((char)rhsTrue[i])));
      assertTrue(op.applyBoolean((Object)NgFloat.valueOf((float)lhsTrue[i]), charMetaClass, (Object)NgChar.valueOf((char)rhsTrue[i])));
      assertTrue(op.applyBoolean((Object)NgDouble.valueOf((double)lhsTrue[i]), charMetaClass, (Object)NgChar.valueOf((char)rhsTrue[i])));
      assertTrue(op.applyBoolean((Object)BigInteger.valueOf(lhsTrue[i]), charMetaClass, (Object)NgChar.valueOf((char)rhsTrue[i])));
      assertTrue(op.applyBoolean((Object)BigDecimal.valueOf(lhsTrue[i]), charMetaClass, (Object)NgChar.valueOf((char)rhsTrue[i])));

      assertTrue(op.applyBoolean((Object)NgByte.valueOf((byte)lhsTrue[i]), shortMetaClass, (Object)NgShort.valueOf((short)rhsTrue[i])));
      assertTrue(op.applyBoolean((Object)NgChar.valueOf((char)lhsTrue[i]), shortMetaClass, (Object)NgShort.valueOf((short)rhsTrue[i])));
      assertTrue(op.applyBoolean((Object)NgShort.valueOf((short)lhsTrue[i]), shortMetaClass, (Object)NgShort.valueOf((short)rhsTrue[i])));
      assertTrue(op.applyBoolean((Object)NgInt.valueOf((int)lhsTrue[i]), shortMetaClass, (Object)NgShort.valueOf((short)rhsTrue[i])));
      assertTrue(op.applyBoolean((Object)NgLong.valueOf((long)lhsTrue[i]), shortMetaClass, (Object)NgShort.valueOf((short)rhsTrue[i])));
      assertTrue(op.applyBoolean((Object)NgFloat.valueOf((float)lhsTrue[i]), shortMetaClass, (Object)NgShort.valueOf((short)rhsTrue[i])));
      assertTrue(op.applyBoolean((Object)NgDouble.valueOf((double)lhsTrue[i]), shortMetaClass, (Object)NgShort.valueOf((short)rhsTrue[i])));
      assertTrue(op.applyBoolean((Object)BigInteger.valueOf(lhsTrue[i]), shortMetaClass, (Object)NgShort.valueOf((short)rhsTrue[i])));
      assertTrue(op.applyBoolean((Object)BigDecimal.valueOf(lhsTrue[i]), shortMetaClass, (Object)NgShort.valueOf((short)rhsTrue[i])));

      assertTrue(op.applyBoolean((Object)NgByte.valueOf((byte)lhsTrue[i]), intMetaClass, (Object)NgInt.valueOf((int)rhsTrue[i])));
      assertTrue(op.applyBoolean((Object)NgChar.valueOf((char)lhsTrue[i]), intMetaClass, (Object)NgInt.valueOf((int)rhsTrue[i])));
      assertTrue(op.applyBoolean((Object)NgShort.valueOf((short)lhsTrue[i]), intMetaClass, (Object)NgInt.valueOf((int)rhsTrue[i])));
      assertTrue(op.applyBoolean((Object)NgInt.valueOf((int)lhsTrue[i]), intMetaClass, (Object)NgInt.valueOf((int)rhsTrue[i])));
      assertTrue(op.applyBoolean((Object)NgLong.valueOf((long)lhsTrue[i]), intMetaClass, (Object)NgInt.valueOf((int)rhsTrue[i])));
      assertTrue(op.applyBoolean((Object)NgFloat.valueOf((float)lhsTrue[i]), intMetaClass, (Object)NgInt.valueOf((int)rhsTrue[i])));
      assertTrue(op.applyBoolean((Object)NgDouble.valueOf((double)lhsTrue[i]), intMetaClass, (Object)NgInt.valueOf((int)rhsTrue[i])));
      assertTrue(op.applyBoolean((Object)BigInteger.valueOf(lhsTrue[i]), intMetaClass, (Object)NgInt.valueOf((int)rhsTrue[i])));
      assertTrue(op.applyBoolean((Object)BigDecimal.valueOf(lhsTrue[i]), intMetaClass, (Object)NgInt.valueOf((int)rhsTrue[i])));

      assertTrue(op.applyBoolean((Object)NgByte.valueOf((byte)lhsTrue[i]), longMetaClass, (Object)NgLong.valueOf((long)rhsTrue[i])));
      assertTrue(op.applyBoolean((Object)NgChar.valueOf((char)lhsTrue[i]), longMetaClass, (Object)NgLong.valueOf((long)rhsTrue[i])));
      assertTrue(op.applyBoolean((Object)NgShort.valueOf((short)lhsTrue[i]), longMetaClass, (Object)NgLong.valueOf((long)rhsTrue[i])));
      assertTrue(op.applyBoolean((Object)NgInt.valueOf((int)lhsTrue[i]), longMetaClass, (Object)NgLong.valueOf((long)rhsTrue[i])));
      assertTrue(op.applyBoolean((Object)NgLong.valueOf((long)lhsTrue[i]), longMetaClass, (Object)NgLong.valueOf((long)rhsTrue[i])));
      assertTrue(op.applyBoolean((Object)NgFloat.valueOf((float)lhsTrue[i]), longMetaClass, (Object)NgLong.valueOf((long)rhsTrue[i])));
      assertTrue(op.applyBoolean((Object)NgDouble.valueOf((double)lhsTrue[i]), longMetaClass, (Object)NgLong.valueOf((long)rhsTrue[i])));
      assertTrue(op.applyBoolean((Object)BigInteger.valueOf(lhsTrue[i]), longMetaClass, (Object)NgLong.valueOf((long)rhsTrue[i])));
      assertTrue(op.applyBoolean((Object)BigDecimal.valueOf(lhsTrue[i]), longMetaClass, (Object)NgLong.valueOf((long)rhsTrue[i])));

      assertTrue(op.applyBoolean((Object)NgByte.valueOf((byte)lhsTrue[i]), floatMetaClass, (Object)NgFloat.valueOf((float)rhsTrue[i])));
      assertTrue(op.applyBoolean((Object)NgChar.valueOf((char)lhsTrue[i]), floatMetaClass, (Object)NgFloat.valueOf((float)rhsTrue[i])));
      assertTrue(op.applyBoolean((Object)NgShort.valueOf((short)lhsTrue[i]), floatMetaClass, (Object)NgFloat.valueOf((float)rhsTrue[i])));
      assertTrue(op.applyBoolean((Object)NgInt.valueOf((int)lhsTrue[i]), floatMetaClass, (Object)NgFloat.valueOf((float)rhsTrue[i])));
      assertTrue(op.applyBoolean((Object)NgLong.valueOf((long)lhsTrue[i]), floatMetaClass, (Object)NgFloat.valueOf((float)rhsTrue[i])));
      assertTrue(op.applyBoolean((Object)NgFloat.valueOf((float)lhsTrue[i]), floatMetaClass, (Object)NgFloat.valueOf((float)rhsTrue[i])));
      assertTrue(op.applyBoolean((Object)NgDouble.valueOf((double)lhsTrue[i]), floatMetaClass, (Object)NgFloat.valueOf((float)rhsTrue[i])));
      assertTrue(op.applyBoolean((Object)BigInteger.valueOf(lhsTrue[i]), floatMetaClass, (Object)NgFloat.valueOf((float)rhsTrue[i])));
      assertTrue(op.applyBoolean((Object)BigDecimal.valueOf(lhsTrue[i]), floatMetaClass, (Object)NgFloat.valueOf((float)rhsTrue[i])));

      assertTrue(op.applyBoolean((Object)NgByte.valueOf((byte)lhsTrue[i]), doubleMetaClass, (Object)NgDouble.valueOf((double)rhsTrue[i])));
      assertTrue(op.applyBoolean((Object)NgChar.valueOf((char)lhsTrue[i]), doubleMetaClass, (Object)NgDouble.valueOf((double)rhsTrue[i])));
      assertTrue(op.applyBoolean((Object)NgShort.valueOf((short)lhsTrue[i]), doubleMetaClass, (Object)NgDouble.valueOf((double)rhsTrue[i])));
      assertTrue(op.applyBoolean((Object)NgInt.valueOf((int)lhsTrue[i]), doubleMetaClass, (Object)NgDouble.valueOf((double)rhsTrue[i])));
      assertTrue(op.applyBoolean((Object)NgLong.valueOf((long)lhsTrue[i]), doubleMetaClass, (Object)NgDouble.valueOf((double)rhsTrue[i])));
      assertTrue(op.applyBoolean((Object)NgFloat.valueOf((float)lhsTrue[i]), doubleMetaClass, (Object)NgDouble.valueOf((double)rhsTrue[i])));
      assertTrue(op.applyBoolean((Object)NgDouble.valueOf((double)lhsTrue[i]), doubleMetaClass, (Object)NgDouble.valueOf((double)rhsTrue[i])));
      assertTrue(op.applyBoolean((Object)BigInteger.valueOf(lhsTrue[i]), doubleMetaClass, (Object)NgDouble.valueOf((double)rhsTrue[i])));
      assertTrue(op.applyBoolean((Object)BigDecimal.valueOf(lhsTrue[i]), doubleMetaClass, (Object)NgDouble.valueOf((double)rhsTrue[i])));

      assertTrue(op.applyBoolean((Object)NgByte.valueOf((byte)lhsTrue[i]), bigIntegerMetaClass, (Object)BigInteger.valueOf(rhsTrue[i])));
      assertTrue(op.applyBoolean((Object)NgChar.valueOf((char)lhsTrue[i]), bigIntegerMetaClass, (Object)BigInteger.valueOf(rhsTrue[i])));
      assertTrue(op.applyBoolean((Object)NgShort.valueOf((short)lhsTrue[i]), bigIntegerMetaClass, (Object)BigInteger.valueOf(rhsTrue[i])));
      assertTrue(op.applyBoolean((Object)NgInt.valueOf((int)lhsTrue[i]), bigIntegerMetaClass, (Object)BigInteger.valueOf(rhsTrue[i])));
      assertTrue(op.applyBoolean((Object)NgLong.valueOf((long)lhsTrue[i]), bigIntegerMetaClass, (Object)BigInteger.valueOf(rhsTrue[i])));
      assertTrue(op.applyBoolean((Object)NgFloat.valueOf((float)lhsTrue[i]), bigIntegerMetaClass, (Object)BigInteger.valueOf(rhsTrue[i])));
      assertTrue(op.applyBoolean((Object)NgDouble.valueOf((double)lhsTrue[i]), bigIntegerMetaClass, (Object)BigInteger.valueOf(rhsTrue[i])));
      assertTrue(op.applyBoolean((Object)BigInteger.valueOf(lhsTrue[i]), bigIntegerMetaClass, (Object)BigInteger.valueOf(rhsTrue[i])));
      assertTrue(op.applyBoolean((Object)BigDecimal.valueOf(lhsTrue[i]), bigIntegerMetaClass, (Object)BigInteger.valueOf(rhsTrue[i])));

      assertTrue(op.applyBoolean((Object)NgByte.valueOf((byte)lhsTrue[i]), bigDecimalMetaClass, (Object)BigDecimal.valueOf(rhsTrue[i])));
      assertTrue(op.applyBoolean((Object)NgChar.valueOf((char)lhsTrue[i]), bigDecimalMetaClass, (Object)BigDecimal.valueOf(rhsTrue[i])));
      assertTrue(op.applyBoolean((Object)NgShort.valueOf((short)lhsTrue[i]), bigDecimalMetaClass, (Object)BigDecimal.valueOf(rhsTrue[i])));
      assertTrue(op.applyBoolean((Object)NgInt.valueOf((int)lhsTrue[i]), bigDecimalMetaClass, (Object)BigDecimal.valueOf(rhsTrue[i])));
      assertTrue(op.applyBoolean((Object)NgLong.valueOf((long)lhsTrue[i]), bigDecimalMetaClass, (Object)BigDecimal.valueOf(rhsTrue[i])));
      assertTrue(op.applyBoolean((Object)NgFloat.valueOf((float)lhsTrue[i]), bigDecimalMetaClass, (Object)BigDecimal.valueOf(rhsTrue[i])));
      assertTrue(op.applyBoolean((Object)NgDouble.valueOf((double)lhsTrue[i]), bigDecimalMetaClass, (Object)BigDecimal.valueOf(rhsTrue[i])));
      assertTrue(op.applyBoolean((Object)BigInteger.valueOf(lhsTrue[i]), bigDecimalMetaClass, (Object)BigDecimal.valueOf(rhsTrue[i])));
      assertTrue(op.applyBoolean((Object)BigDecimal.valueOf(lhsTrue[i]), bigDecimalMetaClass, (Object)BigDecimal.valueOf(rhsTrue[i])));
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
