package ng.runtime;

import java.math.BigDecimal;
import java.math.BigInteger;

import junit.framework.TestCase;
import ng.runtime.metaclass.MetaClass;
import ng.runtime.threadcontext.BooleanComparison;
import ng.runtime.threadcontext.ExtendedThreadContext;
import ng.runtime.threadcontext.ThreadContext;

/**
 * @author John
 *
 */
public class BooleanComparisonTest extends TestCase {
  private static void doTest(final ExtendedThreadContext tc, final BooleanComparison op, final int lhsTrue[], final int rhsTrue[], final int lhsFalse[], final int rhsFalse[]) {
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
      assertTrue(tc.unwrapToBoolean(op.apply(NgLong.valueOf(lhsTrue[i]), NgInt.valueOf(rhsTrue[i]))));
      assertTrue(tc.unwrapToBoolean(op.apply(NgFloat.valueOf(lhsTrue[i]), NgInt.valueOf(rhsTrue[i]))));
      assertTrue(tc.unwrapToBoolean(op.apply(NgDouble.valueOf(lhsTrue[i]), NgInt.valueOf(rhsTrue[i]))));
      assertTrue(tc.unwrapToBoolean(op.apply((Object)BigInteger.valueOf(lhsTrue[i]), (Object)NgInt.valueOf(rhsTrue[i]))));
      assertTrue(tc.unwrapToBoolean(op.apply((Object)BigDecimal.valueOf(lhsTrue[i]), (Object)NgInt.valueOf(rhsTrue[i]))));

      assertTrue(tc.unwrapToBoolean(op.apply(NgByte.valueOf((byte)lhsTrue[i]), NgLong.valueOf(rhsTrue[i]))));
      assertTrue(tc.unwrapToBoolean(op.apply(NgChar.valueOf((char)lhsTrue[i]), NgLong.valueOf(rhsTrue[i]))));
      assertTrue(tc.unwrapToBoolean(op.apply(NgShort.valueOf((short)lhsTrue[i]), NgLong.valueOf(rhsTrue[i]))));
      assertTrue(tc.unwrapToBoolean(op.apply(NgInt.valueOf(lhsTrue[i]), NgLong.valueOf(rhsTrue[i]))));
      assertTrue(tc.unwrapToBoolean(op.apply(NgLong.valueOf(lhsTrue[i]), NgLong.valueOf(rhsTrue[i]))));
      assertTrue(tc.unwrapToBoolean(op.apply(NgFloat.valueOf(lhsTrue[i]), NgLong.valueOf(rhsTrue[i]))));
      assertTrue(tc.unwrapToBoolean(op.apply(NgDouble.valueOf(lhsTrue[i]), NgLong.valueOf(rhsTrue[i]))));
      assertTrue(tc.unwrapToBoolean(op.apply((Object)BigInteger.valueOf(lhsTrue[i]), (Object)NgLong.valueOf(rhsTrue[i]))));
      assertTrue(tc.unwrapToBoolean(op.apply((Object)BigDecimal.valueOf(lhsTrue[i]), (Object)NgLong.valueOf(rhsTrue[i]))));

      assertTrue(tc.unwrapToBoolean(op.apply(NgByte.valueOf((byte)lhsTrue[i]), NgFloat.valueOf(rhsTrue[i]))));
      assertTrue(tc.unwrapToBoolean(op.apply(NgChar.valueOf((char)lhsTrue[i]), NgFloat.valueOf(rhsTrue[i]))));
      assertTrue(tc.unwrapToBoolean(op.apply(NgShort.valueOf((short)lhsTrue[i]), NgFloat.valueOf(rhsTrue[i]))));
      assertTrue(tc.unwrapToBoolean(op.apply(NgInt.valueOf(lhsTrue[i]), NgFloat.valueOf(rhsTrue[i]))));
      assertTrue(tc.unwrapToBoolean(op.apply(NgLong.valueOf(lhsTrue[i]), NgFloat.valueOf(rhsTrue[i]))));
      assertTrue(tc.unwrapToBoolean(op.apply(NgFloat.valueOf(lhsTrue[i]), NgFloat.valueOf(rhsTrue[i]))));
      assertTrue(tc.unwrapToBoolean(op.apply(NgDouble.valueOf(lhsTrue[i]), NgFloat.valueOf(rhsTrue[i]))));
      assertTrue(tc.unwrapToBoolean(op.apply((Object)BigInteger.valueOf(lhsTrue[i]), (Object)NgFloat.valueOf(rhsTrue[i]))));
      assertTrue(tc.unwrapToBoolean(op.apply((Object)BigDecimal.valueOf(lhsTrue[i]), (Object)NgFloat.valueOf(rhsTrue[i]))));

      assertTrue(tc.unwrapToBoolean(op.apply(NgByte.valueOf((byte)lhsTrue[i]), NgDouble.valueOf(rhsTrue[i]))));
      assertTrue(tc.unwrapToBoolean(op.apply(NgChar.valueOf((char)lhsTrue[i]), NgDouble.valueOf(rhsTrue[i]))));
      assertTrue(tc.unwrapToBoolean(op.apply(NgShort.valueOf((short)lhsTrue[i]), NgDouble.valueOf(rhsTrue[i]))));
      assertTrue(tc.unwrapToBoolean(op.apply(NgInt.valueOf(lhsTrue[i]), NgDouble.valueOf(rhsTrue[i]))));
      assertTrue(tc.unwrapToBoolean(op.apply(NgLong.valueOf(lhsTrue[i]), NgDouble.valueOf(rhsTrue[i]))));
      assertTrue(tc.unwrapToBoolean(op.apply(NgFloat.valueOf(lhsTrue[i]), NgDouble.valueOf(rhsTrue[i]))));
      assertTrue(tc.unwrapToBoolean(op.apply(NgDouble.valueOf(lhsTrue[i]), NgDouble.valueOf(rhsTrue[i]))));
      assertTrue(tc.unwrapToBoolean(op.apply((Object)BigInteger.valueOf(lhsTrue[i]), (Object)NgDouble.valueOf(rhsTrue[i]))));
      assertTrue(tc.unwrapToBoolean(op.apply((Object)BigDecimal.valueOf(lhsTrue[i]), (Object)NgDouble.valueOf(rhsTrue[i]))));

      assertTrue(tc.unwrapToBoolean(op.apply((Object)NgByte.valueOf((byte)lhsTrue[i]), (Object)BigInteger.valueOf(rhsTrue[i]))));
      assertTrue(tc.unwrapToBoolean(op.apply((Object)NgChar.valueOf((char)lhsTrue[i]), (Object)BigInteger.valueOf(rhsTrue[i]))));
      assertTrue(tc.unwrapToBoolean(op.apply((Object)NgShort.valueOf((short)lhsTrue[i]), (Object)BigInteger.valueOf(rhsTrue[i]))));
      assertTrue(tc.unwrapToBoolean(op.apply((Object)NgInt.valueOf(lhsTrue[i]), (Object)BigInteger.valueOf(rhsTrue[i]))));
      assertTrue(tc.unwrapToBoolean(op.apply((Object)NgLong.valueOf(lhsTrue[i]), (Object)BigInteger.valueOf(rhsTrue[i]))));
      assertTrue(tc.unwrapToBoolean(op.apply((Object)NgFloat.valueOf(lhsTrue[i]), (Object)BigInteger.valueOf(rhsTrue[i]))));
      assertTrue(tc.unwrapToBoolean(op.apply((Object)NgDouble.valueOf(lhsTrue[i]), (Object)BigInteger.valueOf(rhsTrue[i]))));
      assertTrue(tc.unwrapToBoolean(op.apply((Object)BigInteger.valueOf(lhsTrue[i]), (Object)BigInteger.valueOf(rhsTrue[i]))));
      assertTrue(tc.unwrapToBoolean(op.apply((Object)BigDecimal.valueOf(lhsTrue[i]), (Object)BigInteger.valueOf(rhsTrue[i]))));

      assertTrue(tc.unwrapToBoolean(op.apply((Object)NgByte.valueOf((byte)lhsTrue[i]), (Object)BigDecimal.valueOf(rhsTrue[i]))));
      assertTrue(tc.unwrapToBoolean(op.apply((Object)NgChar.valueOf((char)lhsTrue[i]), (Object)BigDecimal.valueOf(rhsTrue[i]))));
      assertTrue(tc.unwrapToBoolean(op.apply((Object)NgShort.valueOf((short)lhsTrue[i]), (Object)BigDecimal.valueOf(rhsTrue[i]))));
      assertTrue(tc.unwrapToBoolean(op.apply((Object)NgInt.valueOf(lhsTrue[i]), (Object)BigDecimal.valueOf(rhsTrue[i]))));
      assertTrue(tc.unwrapToBoolean(op.apply((Object)NgLong.valueOf(lhsTrue[i]), (Object)BigDecimal.valueOf(rhsTrue[i]))));
      assertTrue(tc.unwrapToBoolean(op.apply((Object)NgFloat.valueOf(lhsTrue[i]), (Object)BigDecimal.valueOf(rhsTrue[i]))));
      assertTrue(tc.unwrapToBoolean(op.apply((Object)NgDouble.valueOf(lhsTrue[i]), (Object)BigDecimal.valueOf(rhsTrue[i]))));
      assertTrue(tc.unwrapToBoolean(op.apply((Object)BigInteger.valueOf(lhsTrue[i]), (Object)BigDecimal.valueOf(rhsTrue[i]))));
      assertTrue(tc.unwrapToBoolean(op.apply((Object)BigDecimal.valueOf(lhsTrue[i]), (Object)BigDecimal.valueOf(rhsTrue[i]))));

      assertTrue(op.applyBoolean(NgByte.valueOf((byte)lhsTrue[i]), NgByte.valueOf((byte)rhsTrue[i])));
      assertTrue(op.applyBoolean(NgChar.valueOf((char)lhsTrue[i]), NgByte.valueOf((byte)rhsTrue[i])));
      assertTrue(op.applyBoolean(NgShort.valueOf((short)lhsTrue[i]), NgByte.valueOf((byte)rhsTrue[i])));
      assertTrue(op.applyBoolean(NgInt.valueOf(lhsTrue[i]), NgByte.valueOf((byte)rhsTrue[i])));
      assertTrue(op.applyBoolean(NgLong.valueOf(lhsTrue[i]), NgByte.valueOf((byte)rhsTrue[i])));
      assertTrue(op.applyBoolean(NgFloat.valueOf(lhsTrue[i]), NgByte.valueOf((byte)rhsTrue[i])));
      assertTrue(op.applyBoolean(NgDouble.valueOf(lhsTrue[i]), NgByte.valueOf((byte)rhsTrue[i])));
      assertTrue(op.applyBoolean((Object)BigInteger.valueOf(lhsTrue[i]), (Object)NgByte.valueOf((byte)rhsTrue[i])));
      assertTrue(op.applyBoolean((Object)BigDecimal.valueOf(lhsTrue[i]), (Object)NgByte.valueOf((byte)rhsTrue[i])));

      assertTrue(op.applyBoolean(NgByte.valueOf((byte)lhsTrue[i]), NgChar.valueOf((char)rhsTrue[i])));
      assertTrue(op.applyBoolean(NgChar.valueOf((char)lhsTrue[i]), NgChar.valueOf((char)rhsTrue[i])));
      assertTrue(op.applyBoolean(NgShort.valueOf((short)lhsTrue[i]), NgChar.valueOf((char)rhsTrue[i])));
      assertTrue(op.applyBoolean(NgInt.valueOf(lhsTrue[i]), NgChar.valueOf((char)rhsTrue[i])));
      assertTrue(op.applyBoolean(NgLong.valueOf(lhsTrue[i]), NgChar.valueOf((char)rhsTrue[i])));
      assertTrue(op.applyBoolean(NgFloat.valueOf(lhsTrue[i]), NgChar.valueOf((char)rhsTrue[i])));
      assertTrue(op.applyBoolean(NgDouble.valueOf(lhsTrue[i]), NgChar.valueOf((char)rhsTrue[i])));
      assertTrue(op.applyBoolean((Object)BigInteger.valueOf(lhsTrue[i]), (Object)NgChar.valueOf((char)rhsTrue[i])));
      assertTrue(op.applyBoolean((Object)BigDecimal.valueOf(lhsTrue[i]), (Object)NgChar.valueOf((char)rhsTrue[i])));

      assertTrue(op.applyBoolean(NgByte.valueOf((byte)lhsTrue[i]), NgShort.valueOf((short)rhsTrue[i])));
      assertTrue(op.applyBoolean(NgChar.valueOf((char)lhsTrue[i]), NgShort.valueOf((short)rhsTrue[i])));
      assertTrue(op.applyBoolean(NgShort.valueOf((short)lhsTrue[i]), NgShort.valueOf((short)rhsTrue[i])));
      assertTrue(op.applyBoolean(NgInt.valueOf(lhsTrue[i]), NgShort.valueOf((short)rhsTrue[i])));
      assertTrue(op.applyBoolean(NgLong.valueOf(lhsTrue[i]), NgShort.valueOf((short)rhsTrue[i])));
      assertTrue(op.applyBoolean(NgFloat.valueOf(lhsTrue[i]), NgShort.valueOf((short)rhsTrue[i])));
      assertTrue(op.applyBoolean(NgDouble.valueOf(lhsTrue[i]), NgShort.valueOf((short)rhsTrue[i])));
      assertTrue(op.applyBoolean((Object)BigInteger.valueOf(lhsTrue[i]), (Object)NgShort.valueOf((short)rhsTrue[i])));
      assertTrue(op.applyBoolean((Object)BigDecimal.valueOf(lhsTrue[i]), (Object)NgShort.valueOf((short)rhsTrue[i])));

      assertTrue(op.applyBoolean(NgByte.valueOf((byte)lhsTrue[i]), NgInt.valueOf(rhsTrue[i])));
      assertTrue(op.applyBoolean(NgChar.valueOf((char)lhsTrue[i]), NgInt.valueOf(rhsTrue[i])));
      assertTrue(op.applyBoolean(NgShort.valueOf((short)lhsTrue[i]), NgInt.valueOf(rhsTrue[i])));
      assertTrue(op.applyBoolean(NgInt.valueOf(lhsTrue[i]), NgInt.valueOf(rhsTrue[i])));
      assertTrue(op.applyBoolean(NgLong.valueOf(lhsTrue[i]), NgInt.valueOf(rhsTrue[i])));
      assertTrue(op.applyBoolean(NgFloat.valueOf(lhsTrue[i]), NgInt.valueOf(rhsTrue[i])));
      assertTrue(op.applyBoolean(NgDouble.valueOf(lhsTrue[i]), NgInt.valueOf(rhsTrue[i])));
      assertTrue(op.applyBoolean((Object)BigInteger.valueOf(lhsTrue[i]), (Object)NgInt.valueOf(rhsTrue[i])));
      assertTrue(op.applyBoolean((Object)BigDecimal.valueOf(lhsTrue[i]), (Object)NgInt.valueOf(rhsTrue[i])));

      assertTrue(op.applyBoolean(NgByte.valueOf((byte)lhsTrue[i]), NgLong.valueOf(rhsTrue[i])));
      assertTrue(op.applyBoolean(NgChar.valueOf((char)lhsTrue[i]), NgLong.valueOf(rhsTrue[i])));
      assertTrue(op.applyBoolean(NgShort.valueOf((short)lhsTrue[i]), NgLong.valueOf(rhsTrue[i])));
      assertTrue(op.applyBoolean(NgInt.valueOf(lhsTrue[i]), NgLong.valueOf(rhsTrue[i])));
      assertTrue(op.applyBoolean(NgLong.valueOf(lhsTrue[i]), NgLong.valueOf(rhsTrue[i])));
      assertTrue(op.applyBoolean(NgFloat.valueOf(lhsTrue[i]), NgLong.valueOf(rhsTrue[i])));
      assertTrue(op.applyBoolean(NgDouble.valueOf(lhsTrue[i]), NgLong.valueOf(rhsTrue[i])));
      assertTrue(op.applyBoolean((Object)BigInteger.valueOf(lhsTrue[i]), (Object)NgLong.valueOf(rhsTrue[i])));
      assertTrue(op.applyBoolean((Object)BigDecimal.valueOf(lhsTrue[i]), (Object)NgLong.valueOf(rhsTrue[i])));

      assertTrue(op.applyBoolean(NgByte.valueOf((byte)lhsTrue[i]), NgFloat.valueOf(rhsTrue[i])));
      assertTrue(op.applyBoolean(NgChar.valueOf((char)lhsTrue[i]), NgFloat.valueOf(rhsTrue[i])));
      assertTrue(op.applyBoolean(NgShort.valueOf((short)lhsTrue[i]), NgFloat.valueOf(rhsTrue[i])));
      assertTrue(op.applyBoolean(NgInt.valueOf(lhsTrue[i]), NgFloat.valueOf(rhsTrue[i])));
      assertTrue(op.applyBoolean(NgLong.valueOf(lhsTrue[i]), NgFloat.valueOf(rhsTrue[i])));
      assertTrue(op.applyBoolean(NgFloat.valueOf(lhsTrue[i]), NgFloat.valueOf(rhsTrue[i])));
      assertTrue(op.applyBoolean(NgDouble.valueOf(lhsTrue[i]), NgFloat.valueOf(rhsTrue[i])));
      assertTrue(op.applyBoolean((Object)BigInteger.valueOf(lhsTrue[i]), (Object)NgFloat.valueOf(rhsTrue[i])));
      assertTrue(op.applyBoolean((Object)BigDecimal.valueOf(lhsTrue[i]), (Object)NgFloat.valueOf(rhsTrue[i])));

      assertTrue(op.applyBoolean(NgByte.valueOf((byte)lhsTrue[i]), NgDouble.valueOf(rhsTrue[i])));
      assertTrue(op.applyBoolean(NgChar.valueOf((char)lhsTrue[i]), NgDouble.valueOf(rhsTrue[i])));
      assertTrue(op.applyBoolean(NgShort.valueOf((short)lhsTrue[i]), NgDouble.valueOf(rhsTrue[i])));
      assertTrue(op.applyBoolean(NgInt.valueOf(lhsTrue[i]), NgDouble.valueOf(rhsTrue[i])));
      assertTrue(op.applyBoolean(NgLong.valueOf(lhsTrue[i]), NgDouble.valueOf(rhsTrue[i])));
      assertTrue(op.applyBoolean(NgFloat.valueOf(lhsTrue[i]), NgDouble.valueOf(rhsTrue[i])));
      assertTrue(op.applyBoolean(NgDouble.valueOf(lhsTrue[i]), NgDouble.valueOf(rhsTrue[i])));
      assertTrue(op.applyBoolean((Object)BigInteger.valueOf(lhsTrue[i]), (Object)NgDouble.valueOf(rhsTrue[i])));
      assertTrue(op.applyBoolean((Object)BigDecimal.valueOf(lhsTrue[i]), (Object)NgDouble.valueOf(rhsTrue[i])));

      assertTrue(op.applyBoolean((Object)NgByte.valueOf((byte)lhsTrue[i]), (Object)BigInteger.valueOf(rhsTrue[i])));
      assertTrue(op.applyBoolean((Object)NgChar.valueOf((char)lhsTrue[i]), (Object)BigInteger.valueOf(rhsTrue[i])));
      assertTrue(op.applyBoolean((Object)NgShort.valueOf((short)lhsTrue[i]), (Object)BigInteger.valueOf(rhsTrue[i])));
      assertTrue(op.applyBoolean((Object)NgInt.valueOf(lhsTrue[i]), (Object)BigInteger.valueOf(rhsTrue[i])));
      assertTrue(op.applyBoolean((Object)NgLong.valueOf(lhsTrue[i]), (Object)BigInteger.valueOf(rhsTrue[i])));
      assertTrue(op.applyBoolean((Object)NgFloat.valueOf(lhsTrue[i]), (Object)BigInteger.valueOf(rhsTrue[i])));
      assertTrue(op.applyBoolean((Object)NgDouble.valueOf(lhsTrue[i]), (Object)BigInteger.valueOf(rhsTrue[i])));
      assertTrue(op.applyBoolean((Object)BigInteger.valueOf(lhsTrue[i]), (Object)BigInteger.valueOf(rhsTrue[i])));
      assertTrue(op.applyBoolean((Object)BigDecimal.valueOf(lhsTrue[i]), (Object)BigInteger.valueOf(rhsTrue[i])));

      assertTrue(op.applyBoolean((Object)NgByte.valueOf((byte)lhsTrue[i]), (Object)BigDecimal.valueOf(rhsTrue[i])));
      assertTrue(op.applyBoolean((Object)NgChar.valueOf((char)lhsTrue[i]), (Object)BigDecimal.valueOf(rhsTrue[i])));
      assertTrue(op.applyBoolean((Object)NgShort.valueOf((short)lhsTrue[i]), (Object)BigDecimal.valueOf(rhsTrue[i])));
      assertTrue(op.applyBoolean((Object)NgInt.valueOf(lhsTrue[i]), (Object)BigDecimal.valueOf(rhsTrue[i])));
      assertTrue(op.applyBoolean((Object)NgLong.valueOf(lhsTrue[i]), (Object)BigDecimal.valueOf(rhsTrue[i])));
      assertTrue(op.applyBoolean((Object)NgFloat.valueOf(lhsTrue[i]), (Object)BigDecimal.valueOf(rhsTrue[i])));
      assertTrue(op.applyBoolean((Object)NgDouble.valueOf(lhsTrue[i]), (Object)BigDecimal.valueOf(rhsTrue[i])));
      assertTrue(op.applyBoolean((Object)BigInteger.valueOf(lhsTrue[i]), (Object)BigDecimal.valueOf(rhsTrue[i])));
      assertTrue(op.applyBoolean((Object)BigDecimal.valueOf(lhsTrue[i]), (Object)BigDecimal.valueOf(rhsTrue[i])));

      assertTrue(op.applyBoolean(NgByte.valueOf((byte)lhsTrue[i]), byteMetaClass, NgByte.valueOf((byte)rhsTrue[i])));
      assertTrue(op.applyBoolean(NgChar.valueOf((char)lhsTrue[i]), byteMetaClass, NgByte.valueOf((byte)rhsTrue[i])));
      assertTrue(op.applyBoolean(NgShort.valueOf((short)lhsTrue[i]), byteMetaClass, NgByte.valueOf((byte)rhsTrue[i])));
      assertTrue(op.applyBoolean(NgInt.valueOf(lhsTrue[i]), byteMetaClass, NgByte.valueOf((byte)rhsTrue[i])));
      assertTrue(op.applyBoolean(NgLong.valueOf(lhsTrue[i]), byteMetaClass, NgByte.valueOf((byte)rhsTrue[i])));
      assertTrue(op.applyBoolean(NgFloat.valueOf(lhsTrue[i]), byteMetaClass, NgByte.valueOf((byte)rhsTrue[i])));
      assertTrue(op.applyBoolean(NgDouble.valueOf(lhsTrue[i]), byteMetaClass, NgByte.valueOf((byte)rhsTrue[i])));
      assertTrue(op.applyBoolean((Object)BigInteger.valueOf(lhsTrue[i]), byteMetaClass, (Object)NgByte.valueOf((byte)rhsTrue[i])));
      assertTrue(op.applyBoolean((Object)BigDecimal.valueOf(lhsTrue[i]), byteMetaClass, (Object)NgByte.valueOf((byte)rhsTrue[i])));

      assertTrue(op.applyBoolean(NgByte.valueOf((byte)lhsTrue[i]), charMetaClass, NgChar.valueOf((char)rhsTrue[i])));
      assertTrue(op.applyBoolean(NgChar.valueOf((char)lhsTrue[i]), charMetaClass, NgChar.valueOf((char)rhsTrue[i])));
      assertTrue(op.applyBoolean(NgShort.valueOf((short)lhsTrue[i]), charMetaClass, NgChar.valueOf((char)rhsTrue[i])));
      assertTrue(op.applyBoolean(NgInt.valueOf(lhsTrue[i]), charMetaClass, NgChar.valueOf((char)rhsTrue[i])));
      assertTrue(op.applyBoolean(NgLong.valueOf(lhsTrue[i]), charMetaClass, NgChar.valueOf((char)rhsTrue[i])));
      assertTrue(op.applyBoolean(NgFloat.valueOf(lhsTrue[i]), charMetaClass, NgChar.valueOf((char)rhsTrue[i])));
      assertTrue(op.applyBoolean(NgDouble.valueOf(lhsTrue[i]), charMetaClass, NgChar.valueOf((char)rhsTrue[i])));
      assertTrue(op.applyBoolean((Object)BigInteger.valueOf(lhsTrue[i]), charMetaClass, (Object)NgChar.valueOf((char)rhsTrue[i])));
      assertTrue(op.applyBoolean((Object)BigDecimal.valueOf(lhsTrue[i]), charMetaClass, (Object)NgChar.valueOf((char)rhsTrue[i])));

      assertTrue(op.applyBoolean(NgByte.valueOf((byte)lhsTrue[i]), shortMetaClass, NgShort.valueOf((short)rhsTrue[i])));
      assertTrue(op.applyBoolean(NgChar.valueOf((char)lhsTrue[i]), shortMetaClass, NgShort.valueOf((short)rhsTrue[i])));
      assertTrue(op.applyBoolean(NgShort.valueOf((short)lhsTrue[i]), shortMetaClass, NgShort.valueOf((short)rhsTrue[i])));
      assertTrue(op.applyBoolean(NgInt.valueOf(lhsTrue[i]), shortMetaClass, NgShort.valueOf((short)rhsTrue[i])));
      assertTrue(op.applyBoolean(NgLong.valueOf(lhsTrue[i]), shortMetaClass, NgShort.valueOf((short)rhsTrue[i])));
      assertTrue(op.applyBoolean(NgFloat.valueOf(lhsTrue[i]), shortMetaClass, NgShort.valueOf((short)rhsTrue[i])));
      assertTrue(op.applyBoolean(NgDouble.valueOf(lhsTrue[i]), shortMetaClass, NgShort.valueOf((short)rhsTrue[i])));
      assertTrue(op.applyBoolean((Object)BigInteger.valueOf(lhsTrue[i]), shortMetaClass, (Object)NgShort.valueOf((short)rhsTrue[i])));
      assertTrue(op.applyBoolean((Object)BigDecimal.valueOf(lhsTrue[i]), shortMetaClass, (Object)NgShort.valueOf((short)rhsTrue[i])));

      assertTrue(op.applyBoolean(NgByte.valueOf((byte)lhsTrue[i]), intMetaClass, NgInt.valueOf(rhsTrue[i])));
      assertTrue(op.applyBoolean(NgChar.valueOf((char)lhsTrue[i]), intMetaClass, NgInt.valueOf(rhsTrue[i])));
      assertTrue(op.applyBoolean(NgShort.valueOf((short)lhsTrue[i]), intMetaClass, NgInt.valueOf(rhsTrue[i])));
      assertTrue(op.applyBoolean(NgInt.valueOf(lhsTrue[i]), intMetaClass, NgInt.valueOf(rhsTrue[i])));
      assertTrue(op.applyBoolean(NgLong.valueOf(lhsTrue[i]), intMetaClass, NgInt.valueOf(rhsTrue[i])));
      assertTrue(op.applyBoolean(NgFloat.valueOf(lhsTrue[i]), intMetaClass, NgInt.valueOf(rhsTrue[i])));
      assertTrue(op.applyBoolean(NgDouble.valueOf(lhsTrue[i]), intMetaClass, NgInt.valueOf(rhsTrue[i])));
      assertTrue(op.applyBoolean((Object)BigInteger.valueOf(lhsTrue[i]), intMetaClass, (Object)NgInt.valueOf(rhsTrue[i])));
      assertTrue(op.applyBoolean((Object)BigDecimal.valueOf(lhsTrue[i]), intMetaClass, (Object)NgInt.valueOf(rhsTrue[i])));

      assertTrue(op.applyBoolean(NgByte.valueOf((byte)lhsTrue[i]), longMetaClass, NgLong.valueOf(rhsTrue[i])));
      assertTrue(op.applyBoolean(NgChar.valueOf((char)lhsTrue[i]), longMetaClass, NgLong.valueOf(rhsTrue[i])));
      assertTrue(op.applyBoolean(NgShort.valueOf((short)lhsTrue[i]), longMetaClass, NgLong.valueOf(rhsTrue[i])));
      assertTrue(op.applyBoolean(NgInt.valueOf(lhsTrue[i]), longMetaClass, NgLong.valueOf(rhsTrue[i])));
      assertTrue(op.applyBoolean(NgLong.valueOf(lhsTrue[i]), longMetaClass, NgLong.valueOf(rhsTrue[i])));
      assertTrue(op.applyBoolean(NgFloat.valueOf(lhsTrue[i]), longMetaClass, NgLong.valueOf(rhsTrue[i])));
      assertTrue(op.applyBoolean(NgDouble.valueOf(lhsTrue[i]), longMetaClass, NgLong.valueOf(rhsTrue[i])));
      assertTrue(op.applyBoolean((Object)BigInteger.valueOf(lhsTrue[i]), longMetaClass, (Object)NgLong.valueOf(rhsTrue[i])));
      assertTrue(op.applyBoolean((Object)BigDecimal.valueOf(lhsTrue[i]), longMetaClass, (Object)NgLong.valueOf(rhsTrue[i])));

      assertTrue(op.applyBoolean(NgByte.valueOf((byte)lhsTrue[i]), floatMetaClass, NgFloat.valueOf(rhsTrue[i])));
      assertTrue(op.applyBoolean(NgChar.valueOf((char)lhsTrue[i]), floatMetaClass, NgFloat.valueOf(rhsTrue[i])));
      assertTrue(op.applyBoolean(NgShort.valueOf((short)lhsTrue[i]), floatMetaClass, NgFloat.valueOf(rhsTrue[i])));
      assertTrue(op.applyBoolean(NgInt.valueOf(lhsTrue[i]), floatMetaClass, NgFloat.valueOf(rhsTrue[i])));
      assertTrue(op.applyBoolean(NgLong.valueOf(lhsTrue[i]), floatMetaClass, NgFloat.valueOf(rhsTrue[i])));
      assertTrue(op.applyBoolean(NgFloat.valueOf((float)lhsTrue[i]), floatMetaClass, NgFloat.valueOf((float)rhsTrue[i])));
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

    for (int i = 0; i != lhsFalse.length; i++) {

      assertFalse(tc.unwrapToBoolean(op.apply((byte)lhsFalse[i], (byte)rhsFalse[i])));
      assertFalse(tc.unwrapToBoolean(op.apply((char)lhsFalse[i], (byte)rhsFalse[i])));
      assertFalse(tc.unwrapToBoolean(op.apply((short)lhsFalse[i], (byte)rhsFalse[i])));
      assertFalse(tc.unwrapToBoolean(op.apply(lhsFalse[i], (byte)rhsFalse[i])));
      assertFalse(tc.unwrapToBoolean(op.apply((long)lhsFalse[i], (byte)rhsFalse[i])));
      assertFalse(tc.unwrapToBoolean(op.apply((float)lhsFalse[i], (byte)rhsFalse[i])));
      assertFalse(tc.unwrapToBoolean(op.apply((double)lhsFalse[i], (byte)rhsFalse[i])));
      assertFalse(tc.unwrapToBoolean(op.apply(BigInteger.valueOf(lhsFalse[i]), (byte)rhsFalse[i])));
      assertFalse(tc.unwrapToBoolean(op.apply(BigDecimal.valueOf(lhsFalse[i]), (byte)rhsFalse[i])));

      assertFalse(tc.unwrapToBoolean(op.apply((byte)lhsFalse[i], (char)rhsFalse[i])));
      assertFalse(tc.unwrapToBoolean(op.apply((char)lhsFalse[i], (char)rhsFalse[i])));
      assertFalse(tc.unwrapToBoolean(op.apply((short)lhsFalse[i], (char)rhsFalse[i])));
      assertFalse(tc.unwrapToBoolean(op.apply(lhsFalse[i], (char)rhsFalse[i])));
      assertFalse(tc.unwrapToBoolean(op.apply((long)lhsFalse[i], (char)rhsFalse[i])));
      assertFalse(tc.unwrapToBoolean(op.apply((float)lhsFalse[i], (char)rhsFalse[i])));
      assertFalse(tc.unwrapToBoolean(op.apply((double)lhsFalse[i], (char)rhsFalse[i])));
      assertFalse(tc.unwrapToBoolean(op.apply(BigInteger.valueOf(lhsFalse[i]), (char)rhsFalse[i])));
      assertFalse(tc.unwrapToBoolean(op.apply(BigDecimal.valueOf(lhsFalse[i]), (char)rhsFalse[i])));

      assertFalse(tc.unwrapToBoolean(op.apply((byte)lhsFalse[i], (short)rhsFalse[i])));
      assertFalse(tc.unwrapToBoolean(op.apply((char)lhsFalse[i], (short)rhsFalse[i])));
      assertFalse(tc.unwrapToBoolean(op.apply((short)lhsFalse[i], (short)rhsFalse[i])));
      assertFalse(tc.unwrapToBoolean(op.apply(lhsFalse[i], (short)rhsFalse[i])));
      assertFalse(tc.unwrapToBoolean(op.apply((long)lhsFalse[i], (short)rhsFalse[i])));
      assertFalse(tc.unwrapToBoolean(op.apply((float)lhsFalse[i], (short)rhsFalse[i])));
      assertFalse(tc.unwrapToBoolean(op.apply((double)lhsFalse[i], (short)rhsFalse[i])));
      assertFalse(tc.unwrapToBoolean(op.apply(BigInteger.valueOf(lhsFalse[i]), (short)rhsFalse[i])));
      assertFalse(tc.unwrapToBoolean(op.apply(BigDecimal.valueOf(lhsFalse[i]), (short)rhsFalse[i])));

      assertFalse(tc.unwrapToBoolean(op.apply((byte)lhsFalse[i], rhsFalse[i])));
      assertFalse(tc.unwrapToBoolean(op.apply((char)lhsFalse[i], rhsFalse[i])));
      assertFalse(tc.unwrapToBoolean(op.apply((short)lhsFalse[i], rhsFalse[i])));
      assertFalse(tc.unwrapToBoolean(op.apply(lhsFalse[i], rhsFalse[i])));
      assertFalse(tc.unwrapToBoolean(op.apply((long)lhsFalse[i], rhsFalse[i])));
      assertFalse(tc.unwrapToBoolean(op.apply((float)lhsFalse[i], rhsFalse[i])));
      assertFalse(tc.unwrapToBoolean(op.apply((double)lhsFalse[i], rhsFalse[i])));
      assertFalse(tc.unwrapToBoolean(op.apply(BigInteger.valueOf(lhsFalse[i]), rhsFalse[i])));
      assertFalse(tc.unwrapToBoolean(op.apply(BigDecimal.valueOf(lhsFalse[i]), rhsFalse[i])));

      assertFalse(tc.unwrapToBoolean(op.apply((byte)lhsFalse[i], (long)rhsFalse[i])));
      assertFalse(tc.unwrapToBoolean(op.apply((char)lhsFalse[i], (long)rhsFalse[i])));
      assertFalse(tc.unwrapToBoolean(op.apply((short)lhsFalse[i], (long)rhsFalse[i])));
      assertFalse(tc.unwrapToBoolean(op.apply(lhsFalse[i], (long)rhsFalse[i])));
      assertFalse(tc.unwrapToBoolean(op.apply((long)lhsFalse[i], (long)rhsFalse[i])));
      assertFalse(tc.unwrapToBoolean(op.apply((float)lhsFalse[i], (long)rhsFalse[i])));
      assertFalse(tc.unwrapToBoolean(op.apply((double)lhsFalse[i], (long)rhsFalse[i])));
      assertFalse(tc.unwrapToBoolean(op.apply(BigInteger.valueOf(lhsFalse[i]), (long)rhsFalse[i])));
      assertFalse(tc.unwrapToBoolean(op.apply(BigDecimal.valueOf(lhsFalse[i]), (long)rhsFalse[i])));

      assertFalse(tc.unwrapToBoolean(op.apply((byte)lhsFalse[i], (float)rhsFalse[i])));
      assertFalse(tc.unwrapToBoolean(op.apply((char)lhsFalse[i], (float)rhsFalse[i])));
      assertFalse(tc.unwrapToBoolean(op.apply((short)lhsFalse[i], (float)rhsFalse[i])));
      assertFalse(tc.unwrapToBoolean(op.apply(lhsFalse[i], (float)rhsFalse[i])));
      assertFalse(tc.unwrapToBoolean(op.apply((long)lhsFalse[i], (float)rhsFalse[i])));
      assertFalse(tc.unwrapToBoolean(op.apply((float)lhsFalse[i], (float)rhsFalse[i])));
      assertFalse(tc.unwrapToBoolean(op.apply((double)lhsFalse[i], (float)rhsFalse[i])));
      assertFalse(tc.unwrapToBoolean(op.apply(BigInteger.valueOf(lhsFalse[i]), (float)rhsFalse[i])));
      assertFalse(tc.unwrapToBoolean(op.apply(BigDecimal.valueOf(lhsFalse[i]), (float)rhsFalse[i])));

      assertFalse(tc.unwrapToBoolean(op.apply((byte)lhsFalse[i], (double)rhsFalse[i])));
      assertFalse(tc.unwrapToBoolean(op.apply((char)lhsFalse[i], (double)rhsFalse[i])));
      assertFalse(tc.unwrapToBoolean(op.apply((short)lhsFalse[i], (double)rhsFalse[i])));
      assertFalse(tc.unwrapToBoolean(op.apply(lhsFalse[i], (double)rhsFalse[i])));
      assertFalse(tc.unwrapToBoolean(op.apply((long)lhsFalse[i], (double)rhsFalse[i])));
      assertFalse(tc.unwrapToBoolean(op.apply((float)lhsFalse[i], (double)rhsFalse[i])));
      assertFalse(tc.unwrapToBoolean(op.apply((double)lhsFalse[i], (double)rhsFalse[i])));
      assertFalse(tc.unwrapToBoolean(op.apply(BigInteger.valueOf(lhsFalse[i]), (double)rhsFalse[i])));
      assertFalse(tc.unwrapToBoolean(op.apply(BigDecimal.valueOf(lhsFalse[i]), (double)rhsFalse[i])));

      assertFalse(tc.unwrapToBoolean(op.apply((byte)lhsFalse[i], BigInteger.valueOf(rhsFalse[i]))));
      assertFalse(tc.unwrapToBoolean(op.apply((char)lhsFalse[i], BigInteger.valueOf(rhsFalse[i]))));
      assertFalse(tc.unwrapToBoolean(op.apply((short)lhsFalse[i], BigInteger.valueOf(rhsFalse[i]))));
      assertFalse(tc.unwrapToBoolean(op.apply(lhsFalse[i], BigInteger.valueOf(rhsFalse[i]))));
      assertFalse(tc.unwrapToBoolean(op.apply((long)lhsFalse[i], BigInteger.valueOf(rhsFalse[i]))));
      assertFalse(tc.unwrapToBoolean(op.apply((float)lhsFalse[i], BigInteger.valueOf(rhsFalse[i]))));
      assertFalse(tc.unwrapToBoolean(op.apply((double)lhsFalse[i], BigInteger.valueOf(rhsFalse[i]))));
      assertFalse(tc.unwrapToBoolean(op.apply(BigInteger.valueOf(lhsFalse[i]), BigInteger.valueOf(rhsFalse[i]))));
      assertFalse(tc.unwrapToBoolean(op.apply(BigDecimal.valueOf(lhsFalse[i]), BigInteger.valueOf(rhsFalse[i]))));

      assertFalse(tc.unwrapToBoolean(op.apply((byte)lhsFalse[i], BigDecimal.valueOf(rhsFalse[i]))));
      assertFalse(tc.unwrapToBoolean(op.apply((char)lhsFalse[i], BigDecimal.valueOf(rhsFalse[i]))));
      assertFalse(tc.unwrapToBoolean(op.apply((short)lhsFalse[i], BigDecimal.valueOf(rhsFalse[i]))));
      assertFalse(tc.unwrapToBoolean(op.apply(lhsFalse[i], BigDecimal.valueOf(rhsFalse[i]))));
      assertFalse(tc.unwrapToBoolean(op.apply((long)lhsFalse[i], BigDecimal.valueOf(rhsFalse[i]))));
      assertFalse(tc.unwrapToBoolean(op.apply((float)lhsFalse[i], BigDecimal.valueOf(rhsFalse[i]))));
      assertFalse(tc.unwrapToBoolean(op.apply((double)lhsFalse[i], BigDecimal.valueOf(rhsFalse[i]))));
      assertFalse(tc.unwrapToBoolean(op.apply(BigInteger.valueOf(lhsFalse[i]), BigDecimal.valueOf(rhsFalse[i]))));
      assertFalse(tc.unwrapToBoolean(op.apply(BigDecimal.valueOf(lhsFalse[i]), BigDecimal.valueOf(rhsFalse[i]))));

      assertFalse(tc.unwrapToBoolean(op.apply((byte)lhsFalse[i], NgByte.valueOf((byte)rhsFalse[i]))));
      assertFalse(tc.unwrapToBoolean(op.apply((char)lhsFalse[i], NgByte.valueOf((byte)rhsFalse[i]))));
      assertFalse(tc.unwrapToBoolean(op.apply((short)lhsFalse[i], NgByte.valueOf((byte)rhsFalse[i]))));
      assertFalse(tc.unwrapToBoolean(op.apply(lhsFalse[i], NgByte.valueOf((byte)rhsFalse[i]))));
      assertFalse(tc.unwrapToBoolean(op.apply((long)lhsFalse[i], NgByte.valueOf((byte)rhsFalse[i]))));
      assertFalse(tc.unwrapToBoolean(op.apply((float)lhsFalse[i], NgByte.valueOf((byte)rhsFalse[i]))));
      assertFalse(tc.unwrapToBoolean(op.apply((double)lhsFalse[i], NgByte.valueOf((byte)rhsFalse[i]))));
      assertFalse(tc.unwrapToBoolean(op.apply(BigInteger.valueOf(lhsFalse[i]), NgByte.valueOf((byte)rhsFalse[i]))));
      assertFalse(tc.unwrapToBoolean(op.apply(BigDecimal.valueOf(lhsFalse[i]), NgByte.valueOf((byte)rhsFalse[i]))));

      assertFalse(tc.unwrapToBoolean(op.apply((byte)lhsFalse[i], NgChar.valueOf((char)rhsFalse[i]))));
      assertFalse(tc.unwrapToBoolean(op.apply((char)lhsFalse[i], NgChar.valueOf((char)rhsFalse[i]))));
      assertFalse(tc.unwrapToBoolean(op.apply((short)lhsFalse[i], NgChar.valueOf((char)rhsFalse[i]))));
      assertFalse(tc.unwrapToBoolean(op.apply(lhsFalse[i], NgChar.valueOf((char)rhsFalse[i]))));
      assertFalse(tc.unwrapToBoolean(op.apply((long)lhsFalse[i], NgChar.valueOf((char)rhsFalse[i]))));
      assertFalse(tc.unwrapToBoolean(op.apply((float)lhsFalse[i], NgChar.valueOf((char)rhsFalse[i]))));
      assertFalse(tc.unwrapToBoolean(op.apply((double)lhsFalse[i], NgChar.valueOf((char)rhsFalse[i]))));
      assertFalse(tc.unwrapToBoolean(op.apply(BigInteger.valueOf(lhsFalse[i]), NgChar.valueOf((char)rhsFalse[i]))));
      assertFalse(tc.unwrapToBoolean(op.apply(BigDecimal.valueOf(lhsFalse[i]), NgChar.valueOf((char)rhsFalse[i]))));

      assertFalse(tc.unwrapToBoolean(op.apply((byte)lhsFalse[i], NgShort.valueOf((short)rhsFalse[i]))));
      assertFalse(tc.unwrapToBoolean(op.apply((char)lhsFalse[i], NgShort.valueOf((short)rhsFalse[i]))));
      assertFalse(tc.unwrapToBoolean(op.apply((short)lhsFalse[i], NgShort.valueOf((short)rhsFalse[i]))));
      assertFalse(tc.unwrapToBoolean(op.apply(lhsFalse[i], NgShort.valueOf((short)rhsFalse[i]))));
      assertFalse(tc.unwrapToBoolean(op.apply((long)lhsFalse[i], NgShort.valueOf((short)rhsFalse[i]))));
      assertFalse(tc.unwrapToBoolean(op.apply((float)lhsFalse[i], NgShort.valueOf((short)rhsFalse[i]))));
      assertFalse(tc.unwrapToBoolean(op.apply((double)lhsFalse[i], NgShort.valueOf((short)rhsFalse[i]))));
      assertFalse(tc.unwrapToBoolean(op.apply(BigInteger.valueOf(lhsFalse[i]), NgShort.valueOf((short)rhsFalse[i]))));
      assertFalse(tc.unwrapToBoolean(op.apply(BigDecimal.valueOf(lhsFalse[i]), NgShort.valueOf((short)rhsFalse[i]))));

      assertFalse(tc.unwrapToBoolean(op.apply((byte)lhsFalse[i], NgInt.valueOf(rhsFalse[i]))));
      assertFalse(tc.unwrapToBoolean(op.apply((char)lhsFalse[i], NgInt.valueOf(rhsFalse[i]))));
      assertFalse(tc.unwrapToBoolean(op.apply((short)lhsFalse[i], NgInt.valueOf(rhsFalse[i]))));
      assertFalse(tc.unwrapToBoolean(op.apply(lhsFalse[i], NgInt.valueOf(rhsFalse[i]))));
      assertFalse(tc.unwrapToBoolean(op.apply((long)lhsFalse[i], NgInt.valueOf(rhsFalse[i]))));
      assertFalse(tc.unwrapToBoolean(op.apply((float)lhsFalse[i], NgInt.valueOf(rhsFalse[i]))));
      assertFalse(tc.unwrapToBoolean(op.apply((double)lhsFalse[i], NgInt.valueOf(rhsFalse[i]))));
      assertFalse(tc.unwrapToBoolean(op.apply(BigInteger.valueOf(lhsFalse[i]), NgInt.valueOf(rhsFalse[i]))));
      assertFalse(tc.unwrapToBoolean(op.apply(BigDecimal.valueOf(lhsFalse[i]), NgInt.valueOf(rhsFalse[i]))));

      assertFalse(tc.unwrapToBoolean(op.apply((byte)lhsFalse[i], NgLong.valueOf(rhsFalse[i]))));
      assertFalse(tc.unwrapToBoolean(op.apply((char)lhsFalse[i], NgLong.valueOf(rhsFalse[i]))));
      assertFalse(tc.unwrapToBoolean(op.apply((short)lhsFalse[i], NgLong.valueOf(rhsFalse[i]))));
      assertFalse(tc.unwrapToBoolean(op.apply(lhsFalse[i], NgLong.valueOf(rhsFalse[i]))));
      assertFalse(tc.unwrapToBoolean(op.apply((long)lhsFalse[i], NgLong.valueOf(rhsFalse[i]))));
      assertFalse(tc.unwrapToBoolean(op.apply((float)lhsFalse[i], NgLong.valueOf(rhsFalse[i]))));
      assertFalse(tc.unwrapToBoolean(op.apply((double)lhsFalse[i], NgLong.valueOf(rhsFalse[i]))));
      assertFalse(tc.unwrapToBoolean(op.apply(BigInteger.valueOf(lhsFalse[i]), NgLong.valueOf(rhsFalse[i]))));
      assertFalse(tc.unwrapToBoolean(op.apply(BigDecimal.valueOf(lhsFalse[i]), NgLong.valueOf(rhsFalse[i]))));

      assertFalse(tc.unwrapToBoolean(op.apply((byte)lhsFalse[i], NgFloat.valueOf(rhsFalse[i]))));
      assertFalse(tc.unwrapToBoolean(op.apply((char)lhsFalse[i], NgFloat.valueOf(rhsFalse[i]))));
      assertFalse(tc.unwrapToBoolean(op.apply((short)lhsFalse[i], NgFloat.valueOf(rhsFalse[i]))));
      assertFalse(tc.unwrapToBoolean(op.apply(lhsFalse[i], NgFloat.valueOf(rhsFalse[i]))));
      assertFalse(tc.unwrapToBoolean(op.apply((long)lhsFalse[i], NgFloat.valueOf(rhsFalse[i]))));
      assertFalse(tc.unwrapToBoolean(op.apply((float)lhsFalse[i], NgFloat.valueOf(rhsFalse[i]))));
      assertFalse(tc.unwrapToBoolean(op.apply((double)lhsFalse[i], NgFloat.valueOf(rhsFalse[i]))));
      assertFalse(tc.unwrapToBoolean(op.apply(BigInteger.valueOf(lhsFalse[i]), NgFloat.valueOf(rhsFalse[i]))));
      assertFalse(tc.unwrapToBoolean(op.apply(BigDecimal.valueOf(lhsFalse[i]), NgFloat.valueOf(rhsFalse[i]))));

      assertFalse(tc.unwrapToBoolean(op.apply((byte)lhsFalse[i], NgDouble.valueOf(rhsFalse[i]))));
      assertFalse(tc.unwrapToBoolean(op.apply((char)lhsFalse[i], NgDouble.valueOf(rhsFalse[i]))));
      assertFalse(tc.unwrapToBoolean(op.apply((short)lhsFalse[i], NgDouble.valueOf(rhsFalse[i]))));
      assertFalse(tc.unwrapToBoolean(op.apply(lhsFalse[i], NgDouble.valueOf(rhsFalse[i]))));
      assertFalse(tc.unwrapToBoolean(op.apply((long)lhsFalse[i], NgDouble.valueOf(rhsFalse[i]))));
      assertFalse(tc.unwrapToBoolean(op.apply((float)lhsFalse[i], NgDouble.valueOf(rhsFalse[i]))));
      assertFalse(tc.unwrapToBoolean(op.apply((double)lhsFalse[i], NgDouble.valueOf(rhsFalse[i]))));
      assertFalse(tc.unwrapToBoolean(op.apply(BigInteger.valueOf(lhsFalse[i]), NgDouble.valueOf(rhsFalse[i]))));
      assertFalse(tc.unwrapToBoolean(op.apply(BigDecimal.valueOf(lhsFalse[i]), NgDouble.valueOf(rhsFalse[i]))));

      assertFalse(tc.unwrapToBoolean(op.apply(NgByte.valueOf((byte)lhsFalse[i]), NgByte.valueOf((byte)rhsFalse[i]))));
      assertFalse(tc.unwrapToBoolean(op.apply(NgChar.valueOf((char)lhsFalse[i]), NgByte.valueOf((byte)rhsFalse[i]))));
      assertFalse(tc.unwrapToBoolean(op.apply(NgShort.valueOf((short)lhsFalse[i]), NgByte.valueOf((byte)rhsFalse[i]))));
      assertFalse(tc.unwrapToBoolean(op.apply(NgInt.valueOf(lhsFalse[i]), NgByte.valueOf((byte)rhsFalse[i]))));
      assertFalse(tc.unwrapToBoolean(op.apply(NgLong.valueOf(lhsFalse[i]), NgByte.valueOf((byte)rhsFalse[i]))));
      assertFalse(tc.unwrapToBoolean(op.apply(NgFloat.valueOf(lhsFalse[i]), NgByte.valueOf((byte)rhsFalse[i]))));
      assertFalse(tc.unwrapToBoolean(op.apply(NgDouble.valueOf(lhsFalse[i]), NgByte.valueOf((byte)rhsFalse[i]))));
      assertFalse(tc.unwrapToBoolean(op.apply(BigInteger.valueOf(lhsFalse[i]), NgByte.valueOf((byte)rhsFalse[i]))));
      assertFalse(tc.unwrapToBoolean(op.apply(BigDecimal.valueOf(lhsFalse[i]), NgByte.valueOf((byte)rhsFalse[i]))));

      assertFalse(tc.unwrapToBoolean(op.apply(NgByte.valueOf((byte)lhsFalse[i]), NgChar.valueOf((char)rhsFalse[i]))));
      assertFalse(tc.unwrapToBoolean(op.apply(NgChar.valueOf((char)lhsFalse[i]), NgChar.valueOf((char)rhsFalse[i]))));
      assertFalse(tc.unwrapToBoolean(op.apply(NgShort.valueOf((short)lhsFalse[i]), NgChar.valueOf((char)rhsFalse[i]))));
      assertFalse(tc.unwrapToBoolean(op.apply(NgInt.valueOf(lhsFalse[i]), NgChar.valueOf((char)rhsFalse[i]))));
      assertFalse(tc.unwrapToBoolean(op.apply(NgLong.valueOf(lhsFalse[i]), NgChar.valueOf((char)rhsFalse[i]))));
      assertFalse(tc.unwrapToBoolean(op.apply(NgFloat.valueOf(lhsFalse[i]), NgChar.valueOf((char)rhsFalse[i]))));
      assertFalse(tc.unwrapToBoolean(op.apply(NgDouble.valueOf(lhsFalse[i]), NgChar.valueOf((char)rhsFalse[i]))));
      assertFalse(tc.unwrapToBoolean(op.apply(BigInteger.valueOf(lhsFalse[i]), NgChar.valueOf((char)rhsFalse[i]))));
      assertFalse(tc.unwrapToBoolean(op.apply(BigDecimal.valueOf(lhsFalse[i]), NgChar.valueOf((char)rhsFalse[i]))));

      assertFalse(tc.unwrapToBoolean(op.apply(NgByte.valueOf((byte)lhsFalse[i]), NgShort.valueOf((short)rhsFalse[i]))));
      assertFalse(tc.unwrapToBoolean(op.apply(NgChar.valueOf((char)lhsFalse[i]), NgShort.valueOf((short)rhsFalse[i]))));
      assertFalse(tc.unwrapToBoolean(op.apply(NgShort.valueOf((short)lhsFalse[i]), NgShort.valueOf((short)rhsFalse[i]))));
      assertFalse(tc.unwrapToBoolean(op.apply(NgInt.valueOf(lhsFalse[i]), NgShort.valueOf((short)rhsFalse[i]))));
      assertFalse(tc.unwrapToBoolean(op.apply(NgLong.valueOf(lhsFalse[i]), NgShort.valueOf((short)rhsFalse[i]))));
      assertFalse(tc.unwrapToBoolean(op.apply(NgFloat.valueOf(lhsFalse[i]), NgShort.valueOf((short)rhsFalse[i]))));
      assertFalse(tc.unwrapToBoolean(op.apply(NgDouble.valueOf(lhsFalse[i]), NgShort.valueOf((short)rhsFalse[i]))));
      assertFalse(tc.unwrapToBoolean(op.apply(BigInteger.valueOf(lhsFalse[i]), NgShort.valueOf((short)rhsFalse[i]))));
      assertFalse(tc.unwrapToBoolean(op.apply(BigDecimal.valueOf(lhsFalse[i]), NgShort.valueOf((short)rhsFalse[i]))));

      assertFalse(tc.unwrapToBoolean(op.apply(NgByte.valueOf((byte)lhsFalse[i]), NgInt.valueOf(rhsFalse[i]))));
      assertFalse(tc.unwrapToBoolean(op.apply(NgChar.valueOf((char)lhsFalse[i]), NgInt.valueOf(rhsFalse[i]))));
      assertFalse(tc.unwrapToBoolean(op.apply(NgShort.valueOf((short)lhsFalse[i]), NgInt.valueOf(rhsFalse[i]))));
      assertFalse(tc.unwrapToBoolean(op.apply(NgInt.valueOf(lhsFalse[i]), NgInt.valueOf(rhsFalse[i]))));
      assertFalse(tc.unwrapToBoolean(op.apply(NgLong.valueOf(lhsFalse[i]), NgInt.valueOf(rhsFalse[i]))));
      assertFalse(tc.unwrapToBoolean(op.apply(NgFloat.valueOf(lhsFalse[i]), NgInt.valueOf(rhsFalse[i]))));
      assertFalse(tc.unwrapToBoolean(op.apply(NgDouble.valueOf(lhsFalse[i]), NgInt.valueOf(rhsFalse[i]))));
      assertFalse(tc.unwrapToBoolean(op.apply(BigInteger.valueOf(lhsFalse[i]), NgInt.valueOf(rhsFalse[i]))));
      assertFalse(tc.unwrapToBoolean(op.apply(BigDecimal.valueOf(lhsFalse[i]), NgInt.valueOf(rhsFalse[i]))));

      assertFalse(tc.unwrapToBoolean(op.apply(NgByte.valueOf((byte)lhsFalse[i]), NgLong.valueOf(rhsFalse[i]))));
      assertFalse(tc.unwrapToBoolean(op.apply(NgChar.valueOf((char)lhsFalse[i]), NgLong.valueOf(rhsFalse[i]))));
      assertFalse(tc.unwrapToBoolean(op.apply(NgShort.valueOf((short)lhsFalse[i]), NgLong.valueOf(rhsFalse[i]))));
      assertFalse(tc.unwrapToBoolean(op.apply(NgInt.valueOf(lhsFalse[i]), NgLong.valueOf(rhsFalse[i]))));
      assertFalse(tc.unwrapToBoolean(op.apply(NgLong.valueOf(lhsFalse[i]), NgLong.valueOf(rhsFalse[i]))));
      assertFalse(tc.unwrapToBoolean(op.apply(NgFloat.valueOf(lhsFalse[i]), NgLong.valueOf(rhsFalse[i]))));
      assertFalse(tc.unwrapToBoolean(op.apply(NgDouble.valueOf(lhsFalse[i]), NgLong.valueOf(rhsFalse[i]))));
      assertFalse(tc.unwrapToBoolean(op.apply(BigInteger.valueOf(lhsFalse[i]), NgLong.valueOf(rhsFalse[i]))));
      assertFalse(tc.unwrapToBoolean(op.apply(BigDecimal.valueOf(lhsFalse[i]), NgLong.valueOf(rhsFalse[i]))));

      assertFalse(tc.unwrapToBoolean(op.apply(NgByte.valueOf((byte)lhsFalse[i]), NgFloat.valueOf(rhsFalse[i]))));
      assertFalse(tc.unwrapToBoolean(op.apply(NgChar.valueOf((char)lhsFalse[i]), NgFloat.valueOf(rhsFalse[i]))));
      assertFalse(tc.unwrapToBoolean(op.apply(NgShort.valueOf((short)lhsFalse[i]), NgFloat.valueOf(rhsFalse[i]))));
      assertFalse(tc.unwrapToBoolean(op.apply(NgInt.valueOf(lhsFalse[i]), NgFloat.valueOf(rhsFalse[i]))));
      assertFalse(tc.unwrapToBoolean(op.apply(NgLong.valueOf(lhsFalse[i]), NgFloat.valueOf(rhsFalse[i]))));
      assertFalse(tc.unwrapToBoolean(op.apply(NgFloat.valueOf(lhsFalse[i]), NgFloat.valueOf(rhsFalse[i]))));
      assertFalse(tc.unwrapToBoolean(op.apply(NgDouble.valueOf(lhsFalse[i]), NgFloat.valueOf(rhsFalse[i]))));
      assertFalse(tc.unwrapToBoolean(op.apply(BigInteger.valueOf(lhsFalse[i]), NgFloat.valueOf(rhsFalse[i]))));
      assertFalse(tc.unwrapToBoolean(op.apply(BigDecimal.valueOf(lhsFalse[i]), NgFloat.valueOf(rhsFalse[i]))));

      assertFalse(tc.unwrapToBoolean(op.apply(NgByte.valueOf((byte)lhsFalse[i]), NgDouble.valueOf(rhsFalse[i]))));
      assertFalse(tc.unwrapToBoolean(op.apply(NgChar.valueOf((char)lhsFalse[i]), NgDouble.valueOf(rhsFalse[i]))));
      assertFalse(tc.unwrapToBoolean(op.apply(NgShort.valueOf((short)lhsFalse[i]), NgDouble.valueOf(rhsFalse[i]))));
      assertFalse(tc.unwrapToBoolean(op.apply(NgInt.valueOf(lhsFalse[i]), NgDouble.valueOf(rhsFalse[i]))));
      assertFalse(tc.unwrapToBoolean(op.apply(NgLong.valueOf(lhsFalse[i]), NgDouble.valueOf(rhsFalse[i]))));
      assertFalse(tc.unwrapToBoolean(op.apply(NgFloat.valueOf(lhsFalse[i]), NgDouble.valueOf(rhsFalse[i]))));
      assertFalse(tc.unwrapToBoolean(op.apply(NgDouble.valueOf(lhsFalse[i]), NgDouble.valueOf(rhsFalse[i]))));
      assertFalse(tc.unwrapToBoolean(op.apply(BigInteger.valueOf(lhsFalse[i]), NgDouble.valueOf(rhsFalse[i]))));
      assertFalse(tc.unwrapToBoolean(op.apply(BigDecimal.valueOf(lhsFalse[i]), NgDouble.valueOf(rhsFalse[i]))));

      assertFalse(tc.unwrapToBoolean(op.apply(NgByte.valueOf((byte)lhsFalse[i]), BigInteger.valueOf(rhsFalse[i]))));
      assertFalse(tc.unwrapToBoolean(op.apply(NgChar.valueOf((char)lhsFalse[i]), BigInteger.valueOf(rhsFalse[i]))));
      assertFalse(tc.unwrapToBoolean(op.apply(NgShort.valueOf((short)lhsFalse[i]), BigInteger.valueOf(rhsFalse[i]))));
      assertFalse(tc.unwrapToBoolean(op.apply(NgInt.valueOf(lhsFalse[i]), BigInteger.valueOf(rhsFalse[i]))));
      assertFalse(tc.unwrapToBoolean(op.apply(NgLong.valueOf(lhsFalse[i]), BigInteger.valueOf(rhsFalse[i]))));
      assertFalse(tc.unwrapToBoolean(op.apply(NgFloat.valueOf(lhsFalse[i]), BigInteger.valueOf(rhsFalse[i]))));
      assertFalse(tc.unwrapToBoolean(op.apply(NgDouble.valueOf(lhsFalse[i]), BigInteger.valueOf(rhsFalse[i]))));
      assertFalse(tc.unwrapToBoolean(op.apply(BigInteger.valueOf(lhsFalse[i]), BigInteger.valueOf(rhsFalse[i]))));
      assertFalse(tc.unwrapToBoolean(op.apply(BigDecimal.valueOf(lhsFalse[i]), BigInteger.valueOf(rhsFalse[i]))));

      assertFalse(tc.unwrapToBoolean(op.apply(NgByte.valueOf((byte)lhsFalse[i]), BigDecimal.valueOf(rhsFalse[i]))));
      assertFalse(tc.unwrapToBoolean(op.apply(NgChar.valueOf((char)lhsFalse[i]), BigDecimal.valueOf(rhsFalse[i]))));
      assertFalse(tc.unwrapToBoolean(op.apply(NgShort.valueOf((short)lhsFalse[i]), BigDecimal.valueOf(rhsFalse[i]))));
      assertFalse(tc.unwrapToBoolean(op.apply(NgInt.valueOf(lhsFalse[i]), BigDecimal.valueOf(rhsFalse[i]))));
      assertFalse(tc.unwrapToBoolean(op.apply(NgLong.valueOf(lhsFalse[i]), BigDecimal.valueOf(rhsFalse[i]))));
      assertFalse(tc.unwrapToBoolean(op.apply(NgFloat.valueOf(lhsFalse[i]), BigDecimal.valueOf(rhsFalse[i]))));
      assertFalse(tc.unwrapToBoolean(op.apply(NgDouble.valueOf(lhsFalse[i]), BigDecimal.valueOf(rhsFalse[i]))));
      assertFalse(tc.unwrapToBoolean(op.apply(BigInteger.valueOf(lhsFalse[i]), BigDecimal.valueOf(rhsFalse[i]))));
      assertFalse(tc.unwrapToBoolean(op.apply(BigDecimal.valueOf(lhsFalse[i]), BigDecimal.valueOf(rhsFalse[i]))));

      assertFalse(tc.unwrapToBoolean(op.apply(NgByte.valueOf((byte)lhsFalse[i]), NgByte.valueOf((byte)rhsFalse[i]))));
      assertFalse(tc.unwrapToBoolean(op.apply(NgChar.valueOf((char)lhsFalse[i]), NgByte.valueOf((byte)rhsFalse[i]))));
      assertFalse(tc.unwrapToBoolean(op.apply(NgShort.valueOf((short)lhsFalse[i]), NgByte.valueOf((byte)rhsFalse[i]))));
      assertFalse(tc.unwrapToBoolean(op.apply(NgInt.valueOf(lhsFalse[i]), NgByte.valueOf((byte)rhsFalse[i]))));
      assertFalse(tc.unwrapToBoolean(op.apply(NgLong.valueOf(lhsFalse[i]), NgByte.valueOf((byte)rhsFalse[i]))));
      assertFalse(tc.unwrapToBoolean(op.apply(NgFloat.valueOf(lhsFalse[i]), NgByte.valueOf((byte)rhsFalse[i]))));
      assertFalse(tc.unwrapToBoolean(op.apply(NgDouble.valueOf(lhsFalse[i]), NgByte.valueOf((byte)rhsFalse[i]))));
      assertFalse(tc.unwrapToBoolean(op.apply((Object)BigInteger.valueOf(lhsFalse[i]), (Object)NgByte.valueOf((byte)rhsFalse[i]))));
      assertFalse(tc.unwrapToBoolean(op.apply((Object)BigDecimal.valueOf(lhsFalse[i]), (Object)NgByte.valueOf((byte)rhsFalse[i]))));

      assertFalse(tc.unwrapToBoolean(op.apply(NgByte.valueOf((byte)lhsFalse[i]), NgChar.valueOf((char)rhsFalse[i]))));
      assertFalse(tc.unwrapToBoolean(op.apply(NgChar.valueOf((char)lhsFalse[i]), NgChar.valueOf((char)rhsFalse[i]))));
      assertFalse(tc.unwrapToBoolean(op.apply(NgShort.valueOf((short)lhsFalse[i]), NgChar.valueOf((char)rhsFalse[i]))));
      assertFalse(tc.unwrapToBoolean(op.apply(NgInt.valueOf(lhsFalse[i]), NgChar.valueOf((char)rhsFalse[i]))));
      assertFalse(tc.unwrapToBoolean(op.apply(NgLong.valueOf(lhsFalse[i]), NgChar.valueOf((char)rhsFalse[i]))));
      assertFalse(tc.unwrapToBoolean(op.apply(NgFloat.valueOf(lhsFalse[i]), NgChar.valueOf((char)rhsFalse[i]))));
      assertFalse(tc.unwrapToBoolean(op.apply(NgDouble.valueOf(lhsFalse[i]), NgChar.valueOf((char)rhsFalse[i]))));
      assertFalse(tc.unwrapToBoolean(op.apply((Object)BigInteger.valueOf(lhsFalse[i]), (Object)NgChar.valueOf((char)rhsFalse[i]))));
      assertFalse(tc.unwrapToBoolean(op.apply((Object)BigDecimal.valueOf(lhsFalse[i]), (Object)NgChar.valueOf((char)rhsFalse[i]))));

      assertFalse(tc.unwrapToBoolean(op.apply(NgByte.valueOf((byte)lhsFalse[i]), NgShort.valueOf((short)rhsFalse[i]))));
      assertFalse(tc.unwrapToBoolean(op.apply(NgChar.valueOf((char)lhsFalse[i]), NgShort.valueOf((short)rhsFalse[i]))));
      assertFalse(tc.unwrapToBoolean(op.apply(NgShort.valueOf((short)lhsFalse[i]), NgShort.valueOf((short)rhsFalse[i]))));
      assertFalse(tc.unwrapToBoolean(op.apply(NgInt.valueOf(lhsFalse[i]), NgShort.valueOf((short)rhsFalse[i]))));
      assertFalse(tc.unwrapToBoolean(op.apply(NgLong.valueOf(lhsFalse[i]), NgShort.valueOf((short)rhsFalse[i]))));
      assertFalse(tc.unwrapToBoolean(op.apply(NgFloat.valueOf(lhsFalse[i]), NgShort.valueOf((short)rhsFalse[i]))));
      assertFalse(tc.unwrapToBoolean(op.apply(NgDouble.valueOf(lhsFalse[i]), NgShort.valueOf((short)rhsFalse[i]))));
      assertFalse(tc.unwrapToBoolean(op.apply((Object)BigInteger.valueOf(lhsFalse[i]), (Object)NgShort.valueOf((short)rhsFalse[i]))));
      assertFalse(tc.unwrapToBoolean(op.apply((Object)BigDecimal.valueOf(lhsFalse[i]), (Object)NgShort.valueOf((short)rhsFalse[i]))));

      assertFalse(tc.unwrapToBoolean(op.apply(NgByte.valueOf((byte)lhsFalse[i]), NgInt.valueOf(rhsFalse[i]))));
      assertFalse(tc.unwrapToBoolean(op.apply(NgChar.valueOf((char)lhsFalse[i]), NgInt.valueOf(rhsFalse[i]))));
      assertFalse(tc.unwrapToBoolean(op.apply(NgShort.valueOf((short)lhsFalse[i]), NgInt.valueOf(rhsFalse[i]))));
      assertFalse(tc.unwrapToBoolean(op.apply(NgInt.valueOf(lhsFalse[i]), NgInt.valueOf(rhsFalse[i]))));
      assertFalse(tc.unwrapToBoolean(op.apply(NgLong.valueOf(lhsFalse[i]), NgInt.valueOf(rhsFalse[i]))));
      assertFalse(tc.unwrapToBoolean(op.apply(NgFloat.valueOf(lhsFalse[i]), NgInt.valueOf(rhsFalse[i]))));
      assertFalse(tc.unwrapToBoolean(op.apply(NgDouble.valueOf(lhsFalse[i]), NgInt.valueOf(rhsFalse[i]))));
      assertFalse(tc.unwrapToBoolean(op.apply((Object)BigInteger.valueOf(lhsFalse[i]), (Object)NgInt.valueOf(rhsFalse[i]))));
      assertFalse(tc.unwrapToBoolean(op.apply((Object)BigDecimal.valueOf(lhsFalse[i]), (Object)NgInt.valueOf(rhsFalse[i]))));

      assertFalse(tc.unwrapToBoolean(op.apply(NgByte.valueOf((byte)lhsFalse[i]), NgLong.valueOf(rhsFalse[i]))));
      assertFalse(tc.unwrapToBoolean(op.apply(NgChar.valueOf((char)lhsFalse[i]), NgLong.valueOf(rhsFalse[i]))));
      assertFalse(tc.unwrapToBoolean(op.apply(NgShort.valueOf((short)lhsFalse[i]), NgLong.valueOf(rhsFalse[i]))));
      assertFalse(tc.unwrapToBoolean(op.apply(NgInt.valueOf(lhsFalse[i]), NgLong.valueOf(rhsFalse[i]))));
      assertFalse(tc.unwrapToBoolean(op.apply(NgLong.valueOf(lhsFalse[i]), NgLong.valueOf(rhsFalse[i]))));
      assertFalse(tc.unwrapToBoolean(op.apply(NgFloat.valueOf(lhsFalse[i]), NgLong.valueOf(rhsFalse[i]))));
      assertFalse(tc.unwrapToBoolean(op.apply(NgDouble.valueOf(lhsFalse[i]), NgLong.valueOf(rhsFalse[i]))));
      assertFalse(tc.unwrapToBoolean(op.apply((Object)BigInteger.valueOf(lhsFalse[i]), (Object)NgLong.valueOf(rhsFalse[i]))));
      assertFalse(tc.unwrapToBoolean(op.apply((Object)BigDecimal.valueOf(lhsFalse[i]), (Object)NgLong.valueOf(rhsFalse[i]))));

      assertFalse(tc.unwrapToBoolean(op.apply(NgByte.valueOf((byte)lhsFalse[i]), NgFloat.valueOf(rhsFalse[i]))));
      assertFalse(tc.unwrapToBoolean(op.apply(NgChar.valueOf((char)lhsFalse[i]), NgFloat.valueOf(rhsFalse[i]))));
      assertFalse(tc.unwrapToBoolean(op.apply(NgShort.valueOf((short)lhsFalse[i]), NgFloat.valueOf(rhsFalse[i]))));
      assertFalse(tc.unwrapToBoolean(op.apply(NgInt.valueOf(lhsFalse[i]), NgFloat.valueOf(rhsFalse[i]))));
      assertFalse(tc.unwrapToBoolean(op.apply(NgLong.valueOf(lhsFalse[i]), NgFloat.valueOf(rhsFalse[i]))));
      assertFalse(tc.unwrapToBoolean(op.apply(NgFloat.valueOf(lhsFalse[i]), NgFloat.valueOf(rhsFalse[i]))));
      assertFalse(tc.unwrapToBoolean(op.apply(NgDouble.valueOf(lhsFalse[i]), NgFloat.valueOf(rhsFalse[i]))));
      assertFalse(tc.unwrapToBoolean(op.apply((Object)BigInteger.valueOf(lhsFalse[i]), (Object)NgFloat.valueOf(rhsFalse[i]))));
      assertFalse(tc.unwrapToBoolean(op.apply((Object)BigDecimal.valueOf(lhsFalse[i]), (Object)NgFloat.valueOf(rhsFalse[i]))));

      assertFalse(tc.unwrapToBoolean(op.apply(NgByte.valueOf((byte)lhsFalse[i]), NgDouble.valueOf(rhsFalse[i]))));
      assertFalse(tc.unwrapToBoolean(op.apply(NgChar.valueOf((char)lhsFalse[i]), NgDouble.valueOf(rhsFalse[i]))));
      assertFalse(tc.unwrapToBoolean(op.apply(NgShort.valueOf((short)lhsFalse[i]), NgDouble.valueOf(rhsFalse[i]))));
      assertFalse(tc.unwrapToBoolean(op.apply(NgInt.valueOf(lhsFalse[i]), NgDouble.valueOf(rhsFalse[i]))));
      assertFalse(tc.unwrapToBoolean(op.apply(NgLong.valueOf(lhsFalse[i]), NgDouble.valueOf(rhsFalse[i]))));
      assertFalse(tc.unwrapToBoolean(op.apply(NgFloat.valueOf(lhsFalse[i]), NgDouble.valueOf(rhsFalse[i]))));
      assertFalse(tc.unwrapToBoolean(op.apply(NgDouble.valueOf(lhsFalse[i]), NgDouble.valueOf(rhsFalse[i]))));
      assertFalse(tc.unwrapToBoolean(op.apply((Object)BigInteger.valueOf(lhsFalse[i]), (Object)NgDouble.valueOf(rhsFalse[i]))));
      assertFalse(tc.unwrapToBoolean(op.apply((Object)BigDecimal.valueOf(lhsFalse[i]), (Object)NgDouble.valueOf(rhsFalse[i]))));

      assertFalse(tc.unwrapToBoolean(op.apply((Object)NgByte.valueOf((byte)lhsFalse[i]), (Object)BigInteger.valueOf(rhsFalse[i]))));
      assertFalse(tc.unwrapToBoolean(op.apply((Object)NgChar.valueOf((char)lhsFalse[i]), (Object)BigInteger.valueOf(rhsFalse[i]))));
      assertFalse(tc.unwrapToBoolean(op.apply((Object)NgShort.valueOf((short)lhsFalse[i]), (Object)BigInteger.valueOf(rhsFalse[i]))));
      assertFalse(tc.unwrapToBoolean(op.apply((Object)NgInt.valueOf(lhsFalse[i]), (Object)BigInteger.valueOf(rhsFalse[i]))));
      assertFalse(tc.unwrapToBoolean(op.apply((Object)NgLong.valueOf(lhsFalse[i]), (Object)BigInteger.valueOf(rhsFalse[i]))));
      assertFalse(tc.unwrapToBoolean(op.apply((Object)NgFloat.valueOf(lhsFalse[i]), (Object)BigInteger.valueOf(rhsFalse[i]))));
      assertFalse(tc.unwrapToBoolean(op.apply((Object)NgDouble.valueOf(lhsFalse[i]), (Object)BigInteger.valueOf(rhsFalse[i]))));
      assertFalse(tc.unwrapToBoolean(op.apply((Object)BigInteger.valueOf(lhsFalse[i]), (Object)BigInteger.valueOf(rhsFalse[i]))));
      assertFalse(tc.unwrapToBoolean(op.apply((Object)BigDecimal.valueOf(lhsFalse[i]), (Object)BigInteger.valueOf(rhsFalse[i]))));

      assertFalse(tc.unwrapToBoolean(op.apply((Object)NgByte.valueOf((byte)lhsFalse[i]), (Object)BigDecimal.valueOf(rhsFalse[i]))));
      assertFalse(tc.unwrapToBoolean(op.apply((Object)NgChar.valueOf((char)lhsFalse[i]), (Object)BigDecimal.valueOf(rhsFalse[i]))));
      assertFalse(tc.unwrapToBoolean(op.apply((Object)NgShort.valueOf((short)lhsFalse[i]), (Object)BigDecimal.valueOf(rhsFalse[i]))));
      assertFalse(tc.unwrapToBoolean(op.apply((Object)NgInt.valueOf(lhsFalse[i]), (Object)BigDecimal.valueOf(rhsFalse[i]))));
      assertFalse(tc.unwrapToBoolean(op.apply((Object)NgLong.valueOf(lhsFalse[i]), (Object)BigDecimal.valueOf(rhsFalse[i]))));
      assertFalse(tc.unwrapToBoolean(op.apply((Object)NgFloat.valueOf(lhsFalse[i]), (Object)BigDecimal.valueOf(rhsFalse[i]))));
      assertFalse(tc.unwrapToBoolean(op.apply((Object)NgDouble.valueOf(lhsFalse[i]), (Object)BigDecimal.valueOf(rhsFalse[i]))));
      assertFalse(tc.unwrapToBoolean(op.apply((Object)BigInteger.valueOf(lhsFalse[i]), (Object)BigDecimal.valueOf(rhsFalse[i]))));
      assertFalse(tc.unwrapToBoolean(op.apply((Object)BigDecimal.valueOf(lhsFalse[i]), (Object)BigDecimal.valueOf(rhsFalse[i]))));

      assertFalse(op.applyBoolean(NgByte.valueOf((byte)lhsFalse[i]), NgByte.valueOf((byte)rhsFalse[i])));
      assertFalse(op.applyBoolean(NgChar.valueOf((char)lhsFalse[i]), NgByte.valueOf((byte)rhsFalse[i])));
      assertFalse(op.applyBoolean(NgShort.valueOf((short)lhsFalse[i]), NgByte.valueOf((byte)rhsFalse[i])));
      assertFalse(op.applyBoolean(NgInt.valueOf(lhsFalse[i]), NgByte.valueOf((byte)rhsFalse[i])));
      assertFalse(op.applyBoolean(NgLong.valueOf(lhsFalse[i]), NgByte.valueOf((byte)rhsFalse[i])));
      assertFalse(op.applyBoolean(NgFloat.valueOf(lhsFalse[i]), NgByte.valueOf((byte)rhsFalse[i])));
      assertFalse(op.applyBoolean(NgDouble.valueOf(lhsFalse[i]), NgByte.valueOf((byte)rhsFalse[i])));
      assertFalse(op.applyBoolean((Object)BigInteger.valueOf(lhsFalse[i]), (Object)NgByte.valueOf((byte)rhsFalse[i])));
      assertFalse(op.applyBoolean((Object)BigDecimal.valueOf(lhsFalse[i]), (Object)NgByte.valueOf((byte)rhsFalse[i])));

      assertFalse(op.applyBoolean(NgByte.valueOf((byte)lhsFalse[i]), NgChar.valueOf((char)rhsFalse[i])));
      assertFalse(op.applyBoolean(NgChar.valueOf((char)lhsFalse[i]), NgChar.valueOf((char)rhsFalse[i])));
      assertFalse(op.applyBoolean(NgShort.valueOf((short)lhsFalse[i]), NgChar.valueOf((char)rhsFalse[i])));
      assertFalse(op.applyBoolean(NgInt.valueOf(lhsFalse[i]), NgChar.valueOf((char)rhsFalse[i])));
      assertFalse(op.applyBoolean(NgLong.valueOf(lhsFalse[i]), NgChar.valueOf((char)rhsFalse[i])));
      assertFalse(op.applyBoolean(NgFloat.valueOf(lhsFalse[i]), NgChar.valueOf((char)rhsFalse[i])));
      assertFalse(op.applyBoolean(NgDouble.valueOf(lhsFalse[i]), NgChar.valueOf((char)rhsFalse[i])));
      assertFalse(op.applyBoolean((Object)BigInteger.valueOf(lhsFalse[i]), (Object)NgChar.valueOf((char)rhsFalse[i])));
      assertFalse(op.applyBoolean((Object)BigDecimal.valueOf(lhsFalse[i]), (Object)NgChar.valueOf((char)rhsFalse[i])));

      assertFalse(op.applyBoolean(NgByte.valueOf((byte)lhsFalse[i]), NgShort.valueOf((short)rhsFalse[i])));
      assertFalse(op.applyBoolean(NgChar.valueOf((char)lhsFalse[i]), NgShort.valueOf((short)rhsFalse[i])));
      assertFalse(op.applyBoolean(NgShort.valueOf((short)lhsFalse[i]), NgShort.valueOf((short)rhsFalse[i])));
      assertFalse(op.applyBoolean(NgInt.valueOf(lhsFalse[i]), NgShort.valueOf((short)rhsFalse[i])));
      assertFalse(op.applyBoolean(NgLong.valueOf(lhsFalse[i]), NgShort.valueOf((short)rhsFalse[i])));
      assertFalse(op.applyBoolean(NgFloat.valueOf(lhsFalse[i]), NgShort.valueOf((short)rhsFalse[i])));
      assertFalse(op.applyBoolean(NgDouble.valueOf(lhsFalse[i]), NgShort.valueOf((short)rhsFalse[i])));
      assertFalse(op.applyBoolean((Object)BigInteger.valueOf(lhsFalse[i]), (Object)NgShort.valueOf((short)rhsFalse[i])));
      assertFalse(op.applyBoolean((Object)BigDecimal.valueOf(lhsFalse[i]), (Object)NgShort.valueOf((short)rhsFalse[i])));

      assertFalse(op.applyBoolean(NgByte.valueOf((byte)lhsFalse[i]), NgInt.valueOf(rhsFalse[i])));
      assertFalse(op.applyBoolean(NgChar.valueOf((char)lhsFalse[i]), NgInt.valueOf(rhsFalse[i])));
      assertFalse(op.applyBoolean(NgShort.valueOf((short)lhsFalse[i]), NgInt.valueOf(rhsFalse[i])));
      assertFalse(op.applyBoolean(NgInt.valueOf(lhsFalse[i]), NgInt.valueOf(rhsFalse[i])));
      assertFalse(op.applyBoolean(NgLong.valueOf(lhsFalse[i]), NgInt.valueOf(rhsFalse[i])));
      assertFalse(op.applyBoolean(NgFloat.valueOf(lhsFalse[i]), NgInt.valueOf(rhsFalse[i])));
      assertFalse(op.applyBoolean(NgDouble.valueOf(lhsFalse[i]), NgInt.valueOf(rhsFalse[i])));
      assertFalse(op.applyBoolean((Object)BigInteger.valueOf(lhsFalse[i]), (Object)NgInt.valueOf(rhsFalse[i])));
      assertFalse(op.applyBoolean((Object)BigDecimal.valueOf(lhsFalse[i]), (Object)NgInt.valueOf(rhsFalse[i])));

      assertFalse(op.applyBoolean(NgByte.valueOf((byte)lhsFalse[i]), NgLong.valueOf(rhsFalse[i])));
      assertFalse(op.applyBoolean(NgChar.valueOf((char)lhsFalse[i]), NgLong.valueOf(rhsFalse[i])));
      assertFalse(op.applyBoolean(NgShort.valueOf((short)lhsFalse[i]), NgLong.valueOf(rhsFalse[i])));
      assertFalse(op.applyBoolean(NgInt.valueOf(lhsFalse[i]), NgLong.valueOf(rhsFalse[i])));
      assertFalse(op.applyBoolean(NgLong.valueOf(lhsFalse[i]), NgLong.valueOf(rhsFalse[i])));
      assertFalse(op.applyBoolean(NgFloat.valueOf(lhsFalse[i]), NgLong.valueOf(rhsFalse[i])));
      assertFalse(op.applyBoolean(NgDouble.valueOf(lhsFalse[i]), NgLong.valueOf(rhsFalse[i])));
      assertFalse(op.applyBoolean((Object)BigInteger.valueOf(lhsFalse[i]), (Object)NgLong.valueOf(rhsFalse[i])));
      assertFalse(op.applyBoolean((Object)BigDecimal.valueOf(lhsFalse[i]), (Object)NgLong.valueOf(rhsFalse[i])));

      assertFalse(op.applyBoolean(NgByte.valueOf((byte)lhsFalse[i]), NgFloat.valueOf(rhsFalse[i])));
      assertFalse(op.applyBoolean(NgChar.valueOf((char)lhsFalse[i]), NgFloat.valueOf(rhsFalse[i])));
      assertFalse(op.applyBoolean(NgShort.valueOf((short)lhsFalse[i]), NgFloat.valueOf(rhsFalse[i])));
      assertFalse(op.applyBoolean(NgInt.valueOf(lhsFalse[i]), NgFloat.valueOf(rhsFalse[i])));
      assertFalse(op.applyBoolean(NgLong.valueOf(lhsFalse[i]), NgFloat.valueOf(rhsFalse[i])));
      assertFalse(op.applyBoolean(NgFloat.valueOf(lhsFalse[i]), NgFloat.valueOf(rhsFalse[i])));
      assertFalse(op.applyBoolean(NgDouble.valueOf(lhsFalse[i]), NgFloat.valueOf(rhsFalse[i])));
      assertFalse(op.applyBoolean((Object)BigInteger.valueOf(lhsFalse[i]), (Object)NgFloat.valueOf(rhsFalse[i])));
      assertFalse(op.applyBoolean((Object)BigDecimal.valueOf(lhsFalse[i]), (Object)NgFloat.valueOf(rhsFalse[i])));

      assertFalse(op.applyBoolean(NgByte.valueOf((byte)lhsFalse[i]), NgDouble.valueOf(rhsFalse[i])));
      assertFalse(op.applyBoolean(NgChar.valueOf((char)lhsFalse[i]), NgDouble.valueOf(rhsFalse[i])));
      assertFalse(op.applyBoolean(NgShort.valueOf((short)lhsFalse[i]), NgDouble.valueOf(rhsFalse[i])));
      assertFalse(op.applyBoolean(NgInt.valueOf(lhsFalse[i]), NgDouble.valueOf(rhsFalse[i])));
      assertFalse(op.applyBoolean(NgLong.valueOf(lhsFalse[i]), NgDouble.valueOf(rhsFalse[i])));
      assertFalse(op.applyBoolean(NgFloat.valueOf(lhsFalse[i]), NgDouble.valueOf(rhsFalse[i])));
      assertFalse(op.applyBoolean(NgDouble.valueOf(lhsFalse[i]), NgDouble.valueOf(rhsFalse[i])));
      assertFalse(op.applyBoolean((Object)BigInteger.valueOf(lhsFalse[i]), (Object)NgDouble.valueOf(rhsFalse[i])));
      assertFalse(op.applyBoolean((Object)BigDecimal.valueOf(lhsFalse[i]), (Object)NgDouble.valueOf(rhsFalse[i])));

      assertFalse(op.applyBoolean((Object)NgByte.valueOf((byte)lhsFalse[i]), (Object)BigInteger.valueOf(rhsFalse[i])));
      assertFalse(op.applyBoolean((Object)NgChar.valueOf((char)lhsFalse[i]), (Object)BigInteger.valueOf(rhsFalse[i])));
      assertFalse(op.applyBoolean((Object)NgShort.valueOf((short)lhsFalse[i]), (Object)BigInteger.valueOf(rhsFalse[i])));
      assertFalse(op.applyBoolean((Object)NgInt.valueOf(lhsFalse[i]), (Object)BigInteger.valueOf(rhsFalse[i])));
      assertFalse(op.applyBoolean((Object)NgLong.valueOf(lhsFalse[i]), (Object)BigInteger.valueOf(rhsFalse[i])));
      assertFalse(op.applyBoolean((Object)NgFloat.valueOf(lhsFalse[i]), (Object)BigInteger.valueOf(rhsFalse[i])));
      assertFalse(op.applyBoolean((Object)NgDouble.valueOf(lhsFalse[i]), (Object)BigInteger.valueOf(rhsFalse[i])));
      assertFalse(op.applyBoolean((Object)BigInteger.valueOf(lhsFalse[i]), (Object)BigInteger.valueOf(rhsFalse[i])));
      assertFalse(op.applyBoolean((Object)BigDecimal.valueOf(lhsFalse[i]), (Object)BigInteger.valueOf(rhsFalse[i])));

      assertFalse(op.applyBoolean((Object)NgByte.valueOf((byte)lhsFalse[i]), (Object)BigDecimal.valueOf(rhsFalse[i])));
      assertFalse(op.applyBoolean((Object)NgChar.valueOf((char)lhsFalse[i]), (Object)BigDecimal.valueOf(rhsFalse[i])));
      assertFalse(op.applyBoolean((Object)NgShort.valueOf((short)lhsFalse[i]), (Object)BigDecimal.valueOf(rhsFalse[i])));
      assertFalse(op.applyBoolean((Object)NgInt.valueOf(lhsFalse[i]), (Object)BigDecimal.valueOf(rhsFalse[i])));
      assertFalse(op.applyBoolean((Object)NgLong.valueOf(lhsFalse[i]), (Object)BigDecimal.valueOf(rhsFalse[i])));
      assertFalse(op.applyBoolean((Object)NgFloat.valueOf(lhsFalse[i]), (Object)BigDecimal.valueOf(rhsFalse[i])));
      assertFalse(op.applyBoolean((Object)NgDouble.valueOf(lhsFalse[i]), (Object)BigDecimal.valueOf(rhsFalse[i])));
      assertFalse(op.applyBoolean((Object)BigInteger.valueOf(lhsFalse[i]), (Object)BigDecimal.valueOf(rhsFalse[i])));
      assertFalse(op.applyBoolean((Object)BigDecimal.valueOf(lhsFalse[i]), (Object)BigDecimal.valueOf(rhsFalse[i])));

      assertFalse(op.applyBoolean(NgByte.valueOf((byte)lhsFalse[i]), byteMetaClass, NgByte.valueOf((byte)rhsFalse[i])));
      assertFalse(op.applyBoolean(NgChar.valueOf((char)lhsFalse[i]), byteMetaClass, NgByte.valueOf((byte)rhsFalse[i])));
      assertFalse(op.applyBoolean(NgShort.valueOf((short)lhsFalse[i]), byteMetaClass, NgByte.valueOf((byte)rhsFalse[i])));
      assertFalse(op.applyBoolean(NgInt.valueOf(lhsFalse[i]), byteMetaClass, NgByte.valueOf((byte)rhsFalse[i])));
      assertFalse(op.applyBoolean(NgLong.valueOf(lhsFalse[i]), byteMetaClass, NgByte.valueOf((byte)rhsFalse[i])));
      assertFalse(op.applyBoolean(NgFloat.valueOf(lhsFalse[i]), byteMetaClass, NgByte.valueOf((byte)rhsFalse[i])));
      assertFalse(op.applyBoolean(NgDouble.valueOf(lhsFalse[i]), byteMetaClass, NgByte.valueOf((byte)rhsFalse[i])));
      assertFalse(op.applyBoolean((Object)BigInteger.valueOf(lhsFalse[i]), byteMetaClass, (Object)NgByte.valueOf((byte)rhsFalse[i])));
      assertFalse(op.applyBoolean((Object)BigDecimal.valueOf(lhsFalse[i]), byteMetaClass, (Object)NgByte.valueOf((byte)rhsFalse[i])));

      assertFalse(op.applyBoolean(NgByte.valueOf((byte)lhsFalse[i]), charMetaClass, NgChar.valueOf((char)rhsFalse[i])));
      assertFalse(op.applyBoolean(NgChar.valueOf((char)lhsFalse[i]), charMetaClass, NgChar.valueOf((char)rhsFalse[i])));
      assertFalse(op.applyBoolean(NgShort.valueOf((short)lhsFalse[i]), charMetaClass, NgChar.valueOf((char)rhsFalse[i])));
      assertFalse(op.applyBoolean(NgInt.valueOf(lhsFalse[i]), charMetaClass, NgChar.valueOf((char)rhsFalse[i])));
      assertFalse(op.applyBoolean(NgLong.valueOf(lhsFalse[i]), charMetaClass, NgChar.valueOf((char)rhsFalse[i])));
      assertFalse(op.applyBoolean(NgFloat.valueOf(lhsFalse[i]), charMetaClass, NgChar.valueOf((char)rhsFalse[i])));
      assertFalse(op.applyBoolean(NgDouble.valueOf(lhsFalse[i]), charMetaClass, NgChar.valueOf((char)rhsFalse[i])));
      assertFalse(op.applyBoolean((Object)BigInteger.valueOf(lhsFalse[i]), charMetaClass, (Object)NgChar.valueOf((char)rhsFalse[i])));
      assertFalse(op.applyBoolean((Object)BigDecimal.valueOf(lhsFalse[i]), charMetaClass, (Object)NgChar.valueOf((char)rhsFalse[i])));

      assertFalse(op.applyBoolean(NgByte.valueOf((byte)lhsFalse[i]), shortMetaClass, NgShort.valueOf((short)rhsFalse[i])));
      assertFalse(op.applyBoolean(NgChar.valueOf((char)lhsFalse[i]), shortMetaClass, NgShort.valueOf((short)rhsFalse[i])));
      assertFalse(op.applyBoolean(NgShort.valueOf((short)lhsFalse[i]), shortMetaClass, NgShort.valueOf((short)rhsFalse[i])));
      assertFalse(op.applyBoolean(NgInt.valueOf(lhsFalse[i]), shortMetaClass, NgShort.valueOf((short)rhsFalse[i])));
      assertFalse(op.applyBoolean(NgLong.valueOf(lhsFalse[i]), shortMetaClass, NgShort.valueOf((short)rhsFalse[i])));
      assertFalse(op.applyBoolean(NgFloat.valueOf(lhsFalse[i]), shortMetaClass, NgShort.valueOf((short)rhsFalse[i])));
      assertFalse(op.applyBoolean(NgDouble.valueOf(lhsFalse[i]), shortMetaClass, NgShort.valueOf((short)rhsFalse[i])));
      assertFalse(op.applyBoolean((Object)BigInteger.valueOf(lhsFalse[i]), shortMetaClass, (Object)NgShort.valueOf((short)rhsFalse[i])));
      assertFalse(op.applyBoolean((Object)BigDecimal.valueOf(lhsFalse[i]), shortMetaClass, (Object)NgShort.valueOf((short)rhsFalse[i])));

      assertFalse(op.applyBoolean(NgByte.valueOf((byte)lhsFalse[i]), intMetaClass, NgInt.valueOf(rhsFalse[i])));
      assertFalse(op.applyBoolean(NgChar.valueOf((char)lhsFalse[i]), intMetaClass, NgInt.valueOf(rhsFalse[i])));
      assertFalse(op.applyBoolean(NgShort.valueOf((short)lhsFalse[i]), intMetaClass, NgInt.valueOf(rhsFalse[i])));
      assertFalse(op.applyBoolean(NgInt.valueOf(lhsFalse[i]), intMetaClass, NgInt.valueOf(rhsFalse[i])));
      assertFalse(op.applyBoolean(NgLong.valueOf(lhsFalse[i]), intMetaClass, NgInt.valueOf(rhsFalse[i])));
      assertFalse(op.applyBoolean(NgFloat.valueOf(lhsFalse[i]), intMetaClass, NgInt.valueOf(rhsFalse[i])));
      assertFalse(op.applyBoolean(NgDouble.valueOf(lhsFalse[i]), intMetaClass, NgInt.valueOf(rhsFalse[i])));
      assertFalse(op.applyBoolean((Object)BigInteger.valueOf(lhsFalse[i]), intMetaClass, (Object)NgInt.valueOf(rhsFalse[i])));
      assertFalse(op.applyBoolean((Object)BigDecimal.valueOf(lhsFalse[i]), intMetaClass, (Object)NgInt.valueOf(rhsFalse[i])));

      assertFalse(op.applyBoolean(NgByte.valueOf((byte)lhsFalse[i]), longMetaClass, NgLong.valueOf(rhsFalse[i])));
      assertFalse(op.applyBoolean(NgChar.valueOf((char)lhsFalse[i]), longMetaClass, NgLong.valueOf(rhsFalse[i])));
      assertFalse(op.applyBoolean(NgShort.valueOf((short)lhsFalse[i]), longMetaClass, NgLong.valueOf(rhsFalse[i])));
      assertFalse(op.applyBoolean(NgInt.valueOf(lhsFalse[i]), longMetaClass, NgLong.valueOf(rhsFalse[i])));
      assertFalse(op.applyBoolean(NgLong.valueOf(lhsFalse[i]), longMetaClass, NgLong.valueOf(rhsFalse[i])));
      assertFalse(op.applyBoolean(NgFloat.valueOf(lhsFalse[i]), longMetaClass, NgLong.valueOf(rhsFalse[i])));
      assertFalse(op.applyBoolean(NgDouble.valueOf(lhsFalse[i]), longMetaClass, NgLong.valueOf(rhsFalse[i])));
      assertFalse(op.applyBoolean((Object)BigInteger.valueOf(lhsFalse[i]), longMetaClass, (Object)NgLong.valueOf(rhsFalse[i])));
      assertFalse(op.applyBoolean((Object)BigDecimal.valueOf(lhsFalse[i]), longMetaClass, (Object)NgLong.valueOf(rhsFalse[i])));

      assertFalse(op.applyBoolean(NgByte.valueOf((byte)lhsFalse[i]), floatMetaClass, NgFloat.valueOf(rhsFalse[i])));
      assertFalse(op.applyBoolean(NgChar.valueOf((char)lhsFalse[i]), floatMetaClass, NgFloat.valueOf(rhsFalse[i])));
      assertFalse(op.applyBoolean(NgShort.valueOf((short)lhsFalse[i]), floatMetaClass, NgFloat.valueOf(rhsFalse[i])));
      assertFalse(op.applyBoolean(NgInt.valueOf(lhsFalse[i]), floatMetaClass, NgFloat.valueOf(rhsFalse[i])));
      assertFalse(op.applyBoolean(NgLong.valueOf(lhsFalse[i]), floatMetaClass, NgFloat.valueOf(rhsFalse[i])));
      assertFalse(op.applyBoolean(NgFloat.valueOf((float)lhsFalse[i]), floatMetaClass, NgFloat.valueOf((float)rhsFalse[i])));
      assertFalse(op.applyBoolean((Object)NgDouble.valueOf((double)lhsFalse[i]), floatMetaClass, (Object)NgFloat.valueOf((float)rhsFalse[i])));
      assertFalse(op.applyBoolean((Object)BigInteger.valueOf(lhsFalse[i]), floatMetaClass, (Object)NgFloat.valueOf((float)rhsFalse[i])));
      assertFalse(op.applyBoolean((Object)BigDecimal.valueOf(lhsFalse[i]), floatMetaClass, (Object)NgFloat.valueOf((float)rhsFalse[i])));

      assertFalse(op.applyBoolean((Object)NgByte.valueOf((byte)lhsFalse[i]), doubleMetaClass, (Object)NgDouble.valueOf((double)rhsFalse[i])));
      assertFalse(op.applyBoolean((Object)NgChar.valueOf((char)lhsFalse[i]), doubleMetaClass, (Object)NgDouble.valueOf((double)rhsFalse[i])));
      assertFalse(op.applyBoolean((Object)NgShort.valueOf((short)lhsFalse[i]), doubleMetaClass, (Object)NgDouble.valueOf((double)rhsFalse[i])));
      assertFalse(op.applyBoolean((Object)NgInt.valueOf((int)lhsFalse[i]), doubleMetaClass, (Object)NgDouble.valueOf((double)rhsFalse[i])));
      assertFalse(op.applyBoolean((Object)NgLong.valueOf((long)lhsFalse[i]), doubleMetaClass, (Object)NgDouble.valueOf((double)rhsFalse[i])));
      assertFalse(op.applyBoolean((Object)NgFloat.valueOf((float)lhsFalse[i]), doubleMetaClass, (Object)NgDouble.valueOf((double)rhsFalse[i])));
      assertFalse(op.applyBoolean((Object)NgDouble.valueOf((double)lhsFalse[i]), doubleMetaClass, (Object)NgDouble.valueOf((double)rhsFalse[i])));
      assertFalse(op.applyBoolean((Object)BigInteger.valueOf(lhsFalse[i]), doubleMetaClass, (Object)NgDouble.valueOf((double)rhsFalse[i])));
      assertFalse(op.applyBoolean((Object)BigDecimal.valueOf(lhsFalse[i]), doubleMetaClass, (Object)NgDouble.valueOf((double)rhsFalse[i])));

      assertFalse(op.applyBoolean((Object)NgByte.valueOf((byte)lhsFalse[i]), bigIntegerMetaClass, (Object)BigInteger.valueOf(rhsFalse[i])));
      assertFalse(op.applyBoolean((Object)NgChar.valueOf((char)lhsFalse[i]), bigIntegerMetaClass, (Object)BigInteger.valueOf(rhsFalse[i])));
      assertFalse(op.applyBoolean((Object)NgShort.valueOf((short)lhsFalse[i]), bigIntegerMetaClass, (Object)BigInteger.valueOf(rhsFalse[i])));
      assertFalse(op.applyBoolean((Object)NgInt.valueOf((int)lhsFalse[i]), bigIntegerMetaClass, (Object)BigInteger.valueOf(rhsFalse[i])));
      assertFalse(op.applyBoolean((Object)NgLong.valueOf((long)lhsFalse[i]), bigIntegerMetaClass, (Object)BigInteger.valueOf(rhsFalse[i])));
      assertFalse(op.applyBoolean((Object)NgFloat.valueOf((float)lhsFalse[i]), bigIntegerMetaClass, (Object)BigInteger.valueOf(rhsFalse[i])));
      assertFalse(op.applyBoolean((Object)NgDouble.valueOf((double)lhsFalse[i]), bigIntegerMetaClass, (Object)BigInteger.valueOf(rhsFalse[i])));
      assertFalse(op.applyBoolean((Object)BigInteger.valueOf(lhsFalse[i]), bigIntegerMetaClass, (Object)BigInteger.valueOf(rhsFalse[i])));
      assertFalse(op.applyBoolean((Object)BigDecimal.valueOf(lhsFalse[i]), bigIntegerMetaClass, (Object)BigInteger.valueOf(rhsFalse[i])));

      assertFalse(op.applyBoolean((Object)NgByte.valueOf((byte)lhsFalse[i]), bigDecimalMetaClass, (Object)BigDecimal.valueOf(rhsFalse[i])));
      assertFalse(op.applyBoolean((Object)NgChar.valueOf((char)lhsFalse[i]), bigDecimalMetaClass, (Object)BigDecimal.valueOf(rhsFalse[i])));
      assertFalse(op.applyBoolean((Object)NgShort.valueOf((short)lhsFalse[i]), bigDecimalMetaClass, (Object)BigDecimal.valueOf(rhsFalse[i])));
      assertFalse(op.applyBoolean((Object)NgInt.valueOf((int)lhsFalse[i]), bigDecimalMetaClass, (Object)BigDecimal.valueOf(rhsFalse[i])));
      assertFalse(op.applyBoolean((Object)NgLong.valueOf((long)lhsFalse[i]), bigDecimalMetaClass, (Object)BigDecimal.valueOf(rhsFalse[i])));
      assertFalse(op.applyBoolean((Object)NgFloat.valueOf((float)lhsFalse[i]), bigDecimalMetaClass, (Object)BigDecimal.valueOf(rhsFalse[i])));
      assertFalse(op.applyBoolean((Object)NgDouble.valueOf((double)lhsFalse[i]), bigDecimalMetaClass, (Object)BigDecimal.valueOf(rhsFalse[i])));
      assertFalse(op.applyBoolean((Object)BigInteger.valueOf(lhsFalse[i]), bigDecimalMetaClass, (Object)BigDecimal.valueOf(rhsFalse[i])));
      assertFalse(op.applyBoolean((Object)BigDecimal.valueOf(lhsFalse[i]), bigDecimalMetaClass, (Object)BigDecimal.valueOf(rhsFalse[i])));
    }
  }

  public void testEquals() throws Throwable {
    final ExtendedThreadContext tc = (ExtendedThreadContext)ThreadContext.getThreadContext();
    doTest(tc, tc.equals(), new int[]{1}, new int[]{1}, new int[]{1}, new int[]{0});
  }

  public void testNotEquals() throws Throwable {
    final ExtendedThreadContext tc = (ExtendedThreadContext)ThreadContext.getThreadContext();
    doTest(tc, tc.notEquals(), new int[]{1}, new int[]{0}, new int[]{1}, new int[]{1});
  }

  public void testLessThan() throws Throwable {
    final ExtendedThreadContext tc = (ExtendedThreadContext)ThreadContext.getThreadContext();
    doTest(tc, tc.lessThan(), new int[]{0}, new int[]{1}, new int[]{1, 1}, new int[]{0, 1});
  }

  public void testLessThanOrEquals() throws Throwable {
    final ExtendedThreadContext tc = (ExtendedThreadContext)ThreadContext.getThreadContext();
    doTest(tc, tc.lessThanOrEquals(), new int[]{0, 1}, new int[]{1, 1}, new int[]{1}, new int[]{0});
  }

  public void testGreaterThan() throws Throwable {
    final ExtendedThreadContext tc = (ExtendedThreadContext)ThreadContext.getThreadContext();
    doTest(tc, tc.greaterThan(), new int[]{1}, new int[]{0}, new int[]{0, 1}, new int[]{1, 1});
  }

  public void testGreaterThanOrEquals() throws Throwable {
    final ExtendedThreadContext tc = (ExtendedThreadContext)ThreadContext.getThreadContext();
    doTest(tc, tc.greaterThanOrEquals(), new int[]{1, 1}, new int[]{0, 1}, new int[]{0}, new int[]{1});
  }
}
