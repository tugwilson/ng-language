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

      assertTrue(tc.unwrapToBoolean(op.apply((byte)lhsTrue[i], tc.wrap((byte)rhsTrue[i]))));
      assertTrue(tc.unwrapToBoolean(op.apply((char)lhsTrue[i], tc.wrap((byte)rhsTrue[i]))));
      assertTrue(tc.unwrapToBoolean(op.apply((short)lhsTrue[i], tc.wrap((byte)rhsTrue[i]))));
      assertTrue(tc.unwrapToBoolean(op.apply(lhsTrue[i], tc.wrap((byte)rhsTrue[i]))));
      assertTrue(tc.unwrapToBoolean(op.apply((long)lhsTrue[i], tc.wrap((byte)rhsTrue[i]))));
      assertTrue(tc.unwrapToBoolean(op.apply((float)lhsTrue[i], tc.wrap((byte)rhsTrue[i]))));
      assertTrue(tc.unwrapToBoolean(op.apply((double)lhsTrue[i], tc.wrap((byte)rhsTrue[i]))));
      assertTrue(tc.unwrapToBoolean(op.apply(BigInteger.valueOf(lhsTrue[i]), tc.wrap((byte)rhsTrue[i]))));
      assertTrue(tc.unwrapToBoolean(op.apply(BigDecimal.valueOf(lhsTrue[i]), tc.wrap((byte)rhsTrue[i]))));

      assertTrue(tc.unwrapToBoolean(op.apply((byte)lhsTrue[i], tc.wrap((char)rhsTrue[i]))));
      assertTrue(tc.unwrapToBoolean(op.apply((char)lhsTrue[i], tc.wrap((char)rhsTrue[i]))));
      assertTrue(tc.unwrapToBoolean(op.apply((short)lhsTrue[i], tc.wrap((char)rhsTrue[i]))));
      assertTrue(tc.unwrapToBoolean(op.apply(lhsTrue[i], tc.wrap((char)rhsTrue[i]))));
      assertTrue(tc.unwrapToBoolean(op.apply((long)lhsTrue[i], tc.wrap((char)rhsTrue[i]))));
      assertTrue(tc.unwrapToBoolean(op.apply((float)lhsTrue[i], tc.wrap((char)rhsTrue[i]))));
      assertTrue(tc.unwrapToBoolean(op.apply((double)lhsTrue[i], tc.wrap((char)rhsTrue[i]))));
      assertTrue(tc.unwrapToBoolean(op.apply(BigInteger.valueOf(lhsTrue[i]), tc.wrap((char)rhsTrue[i]))));
      assertTrue(tc.unwrapToBoolean(op.apply(BigDecimal.valueOf(lhsTrue[i]), tc.wrap((char)rhsTrue[i]))));

      assertTrue(tc.unwrapToBoolean(op.apply((byte)lhsTrue[i], tc.wrap((short)rhsTrue[i]))));
      assertTrue(tc.unwrapToBoolean(op.apply((char)lhsTrue[i], tc.wrap((short)rhsTrue[i]))));
      assertTrue(tc.unwrapToBoolean(op.apply((short)lhsTrue[i], tc.wrap((short)rhsTrue[i]))));
      assertTrue(tc.unwrapToBoolean(op.apply(lhsTrue[i], tc.wrap((short)rhsTrue[i]))));
      assertTrue(tc.unwrapToBoolean(op.apply((long)lhsTrue[i], tc.wrap((short)rhsTrue[i]))));
      assertTrue(tc.unwrapToBoolean(op.apply((float)lhsTrue[i], tc.wrap((short)rhsTrue[i]))));
      assertTrue(tc.unwrapToBoolean(op.apply((double)lhsTrue[i], tc.wrap((short)rhsTrue[i]))));
      assertTrue(tc.unwrapToBoolean(op.apply(BigInteger.valueOf(lhsTrue[i]), tc.wrap((short)rhsTrue[i]))));
      assertTrue(tc.unwrapToBoolean(op.apply(BigDecimal.valueOf(lhsTrue[i]), tc.wrap((short)rhsTrue[i]))));

      assertTrue(tc.unwrapToBoolean(op.apply((byte)lhsTrue[i], tc.wrap(rhsTrue[i]))));
      assertTrue(tc.unwrapToBoolean(op.apply((char)lhsTrue[i], tc.wrap(rhsTrue[i]))));
      assertTrue(tc.unwrapToBoolean(op.apply((short)lhsTrue[i], tc.wrap(rhsTrue[i]))));
      assertTrue(tc.unwrapToBoolean(op.apply(lhsTrue[i], tc.wrap(rhsTrue[i]))));
      assertTrue(tc.unwrapToBoolean(op.apply((long)lhsTrue[i], tc.wrap(rhsTrue[i]))));
      assertTrue(tc.unwrapToBoolean(op.apply((float)lhsTrue[i], tc.wrap(rhsTrue[i]))));
      assertTrue(tc.unwrapToBoolean(op.apply((double)lhsTrue[i], tc.wrap(rhsTrue[i]))));
      assertTrue(tc.unwrapToBoolean(op.apply(BigInteger.valueOf(lhsTrue[i]), tc.wrap(rhsTrue[i]))));
      assertTrue(tc.unwrapToBoolean(op.apply(BigDecimal.valueOf(lhsTrue[i]), tc.wrap(rhsTrue[i]))));

      assertTrue(tc.unwrapToBoolean(op.apply((byte)lhsTrue[i], tc.wrap(rhsTrue[i]))));
      assertTrue(tc.unwrapToBoolean(op.apply((char)lhsTrue[i], tc.wrap(rhsTrue[i]))));
      assertTrue(tc.unwrapToBoolean(op.apply((short)lhsTrue[i], tc.wrap(rhsTrue[i]))));
      assertTrue(tc.unwrapToBoolean(op.apply(lhsTrue[i], tc.wrap(rhsTrue[i]))));
      assertTrue(tc.unwrapToBoolean(op.apply((long)lhsTrue[i], tc.wrap(rhsTrue[i]))));
      assertTrue(tc.unwrapToBoolean(op.apply((float)lhsTrue[i], tc.wrap(rhsTrue[i]))));
      assertTrue(tc.unwrapToBoolean(op.apply((double)lhsTrue[i], tc.wrap(rhsTrue[i]))));
      assertTrue(tc.unwrapToBoolean(op.apply(BigInteger.valueOf(lhsTrue[i]), tc.wrap(rhsTrue[i]))));
      assertTrue(tc.unwrapToBoolean(op.apply(BigDecimal.valueOf(lhsTrue[i]), tc.wrap(rhsTrue[i]))));

      assertTrue(tc.unwrapToBoolean(op.apply((byte)lhsTrue[i], tc.wrap(rhsTrue[i]))));
      assertTrue(tc.unwrapToBoolean(op.apply((char)lhsTrue[i], tc.wrap(rhsTrue[i]))));
      assertTrue(tc.unwrapToBoolean(op.apply((short)lhsTrue[i], tc.wrap(rhsTrue[i]))));
      assertTrue(tc.unwrapToBoolean(op.apply(lhsTrue[i], tc.wrap(rhsTrue[i]))));
      assertTrue(tc.unwrapToBoolean(op.apply((long)lhsTrue[i], tc.wrap(rhsTrue[i]))));
      assertTrue(tc.unwrapToBoolean(op.apply((float)lhsTrue[i], tc.wrap(rhsTrue[i]))));
      assertTrue(tc.unwrapToBoolean(op.apply((double)lhsTrue[i], tc.wrap(rhsTrue[i]))));
      assertTrue(tc.unwrapToBoolean(op.apply(BigInteger.valueOf(lhsTrue[i]), tc.wrap(rhsTrue[i]))));
      assertTrue(tc.unwrapToBoolean(op.apply(BigDecimal.valueOf(lhsTrue[i]), tc.wrap(rhsTrue[i]))));

      assertTrue(tc.unwrapToBoolean(op.apply((byte)lhsTrue[i], tc.wrap(rhsTrue[i]))));
      assertTrue(tc.unwrapToBoolean(op.apply((char)lhsTrue[i], tc.wrap(rhsTrue[i]))));
      assertTrue(tc.unwrapToBoolean(op.apply((short)lhsTrue[i], tc.wrap(rhsTrue[i]))));
      assertTrue(tc.unwrapToBoolean(op.apply(lhsTrue[i], tc.wrap(rhsTrue[i]))));
      assertTrue(tc.unwrapToBoolean(op.apply((long)lhsTrue[i], tc.wrap(rhsTrue[i]))));
      assertTrue(tc.unwrapToBoolean(op.apply((float)lhsTrue[i], tc.wrap(rhsTrue[i]))));
      assertTrue(tc.unwrapToBoolean(op.apply((double)lhsTrue[i], tc.wrap(rhsTrue[i]))));
      assertTrue(tc.unwrapToBoolean(op.apply(BigInteger.valueOf(lhsTrue[i]), tc.wrap(rhsTrue[i]))));
      assertTrue(tc.unwrapToBoolean(op.apply(BigDecimal.valueOf(lhsTrue[i]), tc.wrap(rhsTrue[i]))));

      assertTrue(tc.unwrapToBoolean(op.apply(tc.wrap((byte)lhsTrue[i]), tc.wrap((byte)rhsTrue[i]))));
      assertTrue(tc.unwrapToBoolean(op.apply(tc.wrap((char)lhsTrue[i]), tc.wrap((byte)rhsTrue[i]))));
      assertTrue(tc.unwrapToBoolean(op.apply(tc.wrap((short)lhsTrue[i]), tc.wrap((byte)rhsTrue[i]))));
      assertTrue(tc.unwrapToBoolean(op.apply(tc.wrap(lhsTrue[i]), tc.wrap((byte)rhsTrue[i]))));
      assertTrue(tc.unwrapToBoolean(op.apply(tc.wrap(lhsTrue[i]), tc.wrap((byte)rhsTrue[i]))));
      assertTrue(tc.unwrapToBoolean(op.apply(tc.wrap(lhsTrue[i]), tc.wrap((byte)rhsTrue[i]))));
      assertTrue(tc.unwrapToBoolean(op.apply(tc.wrap(lhsTrue[i]), tc.wrap((byte)rhsTrue[i]))));
      assertTrue(tc.unwrapToBoolean(op.apply(BigInteger.valueOf(lhsTrue[i]), tc.wrap((byte)rhsTrue[i]))));
      assertTrue(tc.unwrapToBoolean(op.apply(BigDecimal.valueOf(lhsTrue[i]), tc.wrap((byte)rhsTrue[i]))));

      assertTrue(tc.unwrapToBoolean(op.apply(tc.wrap((byte)lhsTrue[i]), tc.wrap((char)rhsTrue[i]))));
      assertTrue(tc.unwrapToBoolean(op.apply(tc.wrap((char)lhsTrue[i]), tc.wrap((char)rhsTrue[i]))));
      assertTrue(tc.unwrapToBoolean(op.apply(tc.wrap((short)lhsTrue[i]), tc.wrap((char)rhsTrue[i]))));
      assertTrue(tc.unwrapToBoolean(op.apply(tc.wrap(lhsTrue[i]), tc.wrap((char)rhsTrue[i]))));
      assertTrue(tc.unwrapToBoolean(op.apply(tc.wrap(lhsTrue[i]), tc.wrap((char)rhsTrue[i]))));
      assertTrue(tc.unwrapToBoolean(op.apply(tc.wrap(lhsTrue[i]), tc.wrap((char)rhsTrue[i]))));
      assertTrue(tc.unwrapToBoolean(op.apply(tc.wrap(lhsTrue[i]), tc.wrap((char)rhsTrue[i]))));
      assertTrue(tc.unwrapToBoolean(op.apply(BigInteger.valueOf(lhsTrue[i]), tc.wrap((char)rhsTrue[i]))));
      assertTrue(tc.unwrapToBoolean(op.apply(BigDecimal.valueOf(lhsTrue[i]), tc.wrap((char)rhsTrue[i]))));

      assertTrue(tc.unwrapToBoolean(op.apply(tc.wrap((byte)lhsTrue[i]), tc.wrap((short)rhsTrue[i]))));
      assertTrue(tc.unwrapToBoolean(op.apply(tc.wrap((char)lhsTrue[i]), tc.wrap((short)rhsTrue[i]))));
      assertTrue(tc.unwrapToBoolean(op.apply(tc.wrap((short)lhsTrue[i]), tc.wrap((short)rhsTrue[i]))));
      assertTrue(tc.unwrapToBoolean(op.apply(tc.wrap(lhsTrue[i]), tc.wrap((short)rhsTrue[i]))));
      assertTrue(tc.unwrapToBoolean(op.apply(tc.wrap(lhsTrue[i]), tc.wrap((short)rhsTrue[i]))));
      assertTrue(tc.unwrapToBoolean(op.apply(tc.wrap(lhsTrue[i]), tc.wrap((short)rhsTrue[i]))));
      assertTrue(tc.unwrapToBoolean(op.apply(tc.wrap(lhsTrue[i]), tc.wrap((short)rhsTrue[i]))));
      assertTrue(tc.unwrapToBoolean(op.apply(BigInteger.valueOf(lhsTrue[i]), tc.wrap((short)rhsTrue[i]))));
      assertTrue(tc.unwrapToBoolean(op.apply(BigDecimal.valueOf(lhsTrue[i]), tc.wrap((short)rhsTrue[i]))));

      assertTrue(tc.unwrapToBoolean(op.apply(tc.wrap((byte)lhsTrue[i]), tc.wrap(rhsTrue[i]))));
      assertTrue(tc.unwrapToBoolean(op.apply(tc.wrap((char)lhsTrue[i]), tc.wrap(rhsTrue[i]))));
      assertTrue(tc.unwrapToBoolean(op.apply(tc.wrap((short)lhsTrue[i]), tc.wrap(rhsTrue[i]))));
      assertTrue(tc.unwrapToBoolean(op.apply(tc.wrap(lhsTrue[i]), tc.wrap(rhsTrue[i]))));
      assertTrue(tc.unwrapToBoolean(op.apply(tc.wrap(lhsTrue[i]), tc.wrap(rhsTrue[i]))));
      assertTrue(tc.unwrapToBoolean(op.apply(tc.wrap(lhsTrue[i]), tc.wrap(rhsTrue[i]))));
      assertTrue(tc.unwrapToBoolean(op.apply(tc.wrap(lhsTrue[i]), tc.wrap(rhsTrue[i]))));
      assertTrue(tc.unwrapToBoolean(op.apply(BigInteger.valueOf(lhsTrue[i]), tc.wrap(rhsTrue[i]))));
      assertTrue(tc.unwrapToBoolean(op.apply(BigDecimal.valueOf(lhsTrue[i]), tc.wrap(rhsTrue[i]))));

      assertTrue(tc.unwrapToBoolean(op.apply(tc.wrap((byte)lhsTrue[i]), tc.wrap(rhsTrue[i]))));
      assertTrue(tc.unwrapToBoolean(op.apply(tc.wrap((char)lhsTrue[i]), tc.wrap(rhsTrue[i]))));
      assertTrue(tc.unwrapToBoolean(op.apply(tc.wrap((short)lhsTrue[i]), tc.wrap(rhsTrue[i]))));
      assertTrue(tc.unwrapToBoolean(op.apply(tc.wrap(lhsTrue[i]), tc.wrap(rhsTrue[i]))));
      assertTrue(tc.unwrapToBoolean(op.apply(tc.wrap(lhsTrue[i]), tc.wrap(rhsTrue[i]))));
      assertTrue(tc.unwrapToBoolean(op.apply(tc.wrap(lhsTrue[i]), tc.wrap(rhsTrue[i]))));
      assertTrue(tc.unwrapToBoolean(op.apply(tc.wrap(lhsTrue[i]), tc.wrap(rhsTrue[i]))));
      assertTrue(tc.unwrapToBoolean(op.apply(BigInteger.valueOf(lhsTrue[i]), tc.wrap(rhsTrue[i]))));
      assertTrue(tc.unwrapToBoolean(op.apply(BigDecimal.valueOf(lhsTrue[i]), tc.wrap(rhsTrue[i]))));

      assertTrue(tc.unwrapToBoolean(op.apply(tc.wrap((byte)lhsTrue[i]), tc.wrap(rhsTrue[i]))));
      assertTrue(tc.unwrapToBoolean(op.apply(tc.wrap((char)lhsTrue[i]), tc.wrap(rhsTrue[i]))));
      assertTrue(tc.unwrapToBoolean(op.apply(tc.wrap((short)lhsTrue[i]), tc.wrap(rhsTrue[i]))));
      assertTrue(tc.unwrapToBoolean(op.apply(tc.wrap(lhsTrue[i]), tc.wrap(rhsTrue[i]))));
      assertTrue(tc.unwrapToBoolean(op.apply(tc.wrap(lhsTrue[i]), tc.wrap(rhsTrue[i]))));
      assertTrue(tc.unwrapToBoolean(op.apply(tc.wrap(lhsTrue[i]), tc.wrap(rhsTrue[i]))));
      assertTrue(tc.unwrapToBoolean(op.apply(tc.wrap(lhsTrue[i]), tc.wrap(rhsTrue[i]))));
      assertTrue(tc.unwrapToBoolean(op.apply(BigInteger.valueOf(lhsTrue[i]), tc.wrap(rhsTrue[i]))));
      assertTrue(tc.unwrapToBoolean(op.apply(BigDecimal.valueOf(lhsTrue[i]), tc.wrap(rhsTrue[i]))));

      assertTrue(tc.unwrapToBoolean(op.apply(tc.wrap((byte)lhsTrue[i]), tc.wrap(rhsTrue[i]))));
      assertTrue(tc.unwrapToBoolean(op.apply(tc.wrap((char)lhsTrue[i]), tc.wrap(rhsTrue[i]))));
      assertTrue(tc.unwrapToBoolean(op.apply(tc.wrap((short)lhsTrue[i]), tc.wrap(rhsTrue[i]))));
      assertTrue(tc.unwrapToBoolean(op.apply(tc.wrap(lhsTrue[i]), tc.wrap(rhsTrue[i]))));
      assertTrue(tc.unwrapToBoolean(op.apply(tc.wrap(lhsTrue[i]), tc.wrap(rhsTrue[i]))));
      assertTrue(tc.unwrapToBoolean(op.apply(tc.wrap(lhsTrue[i]), tc.wrap(rhsTrue[i]))));
      assertTrue(tc.unwrapToBoolean(op.apply(tc.wrap(lhsTrue[i]), tc.wrap(rhsTrue[i]))));
      assertTrue(tc.unwrapToBoolean(op.apply(BigInteger.valueOf(lhsTrue[i]), tc.wrap(rhsTrue[i]))));
      assertTrue(tc.unwrapToBoolean(op.apply(BigDecimal.valueOf(lhsTrue[i]), tc.wrap(rhsTrue[i]))));

      assertTrue(tc.unwrapToBoolean(op.apply(tc.wrap((byte)lhsTrue[i]), BigInteger.valueOf(rhsTrue[i]))));
      assertTrue(tc.unwrapToBoolean(op.apply(tc.wrap((char)lhsTrue[i]), BigInteger.valueOf(rhsTrue[i]))));
      assertTrue(tc.unwrapToBoolean(op.apply(tc.wrap((short)lhsTrue[i]), BigInteger.valueOf(rhsTrue[i]))));
      assertTrue(tc.unwrapToBoolean(op.apply(tc.wrap(lhsTrue[i]), BigInteger.valueOf(rhsTrue[i]))));
      assertTrue(tc.unwrapToBoolean(op.apply(tc.wrap(lhsTrue[i]), BigInteger.valueOf(rhsTrue[i]))));
      assertTrue(tc.unwrapToBoolean(op.apply(tc.wrap(lhsTrue[i]), BigInteger.valueOf(rhsTrue[i]))));
      assertTrue(tc.unwrapToBoolean(op.apply(tc.wrap(lhsTrue[i]), BigInteger.valueOf(rhsTrue[i]))));
      assertTrue(tc.unwrapToBoolean(op.apply(BigInteger.valueOf(lhsTrue[i]), BigInteger.valueOf(rhsTrue[i]))));
      assertTrue(tc.unwrapToBoolean(op.apply(BigDecimal.valueOf(lhsTrue[i]), BigInteger.valueOf(rhsTrue[i]))));

      assertTrue(tc.unwrapToBoolean(op.apply(tc.wrap((byte)lhsTrue[i]), BigDecimal.valueOf(rhsTrue[i]))));
      assertTrue(tc.unwrapToBoolean(op.apply(tc.wrap((char)lhsTrue[i]), BigDecimal.valueOf(rhsTrue[i]))));
      assertTrue(tc.unwrapToBoolean(op.apply(tc.wrap((short)lhsTrue[i]), BigDecimal.valueOf(rhsTrue[i]))));
      assertTrue(tc.unwrapToBoolean(op.apply(tc.wrap(lhsTrue[i]), BigDecimal.valueOf(rhsTrue[i]))));
      assertTrue(tc.unwrapToBoolean(op.apply(tc.wrap(lhsTrue[i]), BigDecimal.valueOf(rhsTrue[i]))));
      assertTrue(tc.unwrapToBoolean(op.apply(tc.wrap(lhsTrue[i]), BigDecimal.valueOf(rhsTrue[i]))));
      assertTrue(tc.unwrapToBoolean(op.apply(tc.wrap(lhsTrue[i]), BigDecimal.valueOf(rhsTrue[i]))));
      assertTrue(tc.unwrapToBoolean(op.apply(BigInteger.valueOf(lhsTrue[i]), BigDecimal.valueOf(rhsTrue[i]))));
      assertTrue(tc.unwrapToBoolean(op.apply(BigDecimal.valueOf(lhsTrue[i]), BigDecimal.valueOf(rhsTrue[i]))));

      assertTrue(tc.unwrapToBoolean(op.apply(tc.wrap((byte)lhsTrue[i]), tc.wrap((byte)rhsTrue[i]))));
      assertTrue(tc.unwrapToBoolean(op.apply(tc.wrap((char)lhsTrue[i]), tc.wrap((byte)rhsTrue[i]))));
      assertTrue(tc.unwrapToBoolean(op.apply(tc.wrap((short)lhsTrue[i]), tc.wrap((byte)rhsTrue[i]))));
      assertTrue(tc.unwrapToBoolean(op.apply(tc.wrap(lhsTrue[i]), tc.wrap((byte)rhsTrue[i]))));
      assertTrue(tc.unwrapToBoolean(op.apply(tc.wrap(lhsTrue[i]), tc.wrap((byte)rhsTrue[i]))));
      assertTrue(tc.unwrapToBoolean(op.apply(tc.wrap(lhsTrue[i]), tc.wrap((byte)rhsTrue[i]))));
      assertTrue(tc.unwrapToBoolean(op.apply(tc.wrap(lhsTrue[i]), tc.wrap((byte)rhsTrue[i]))));
      assertTrue(tc.unwrapToBoolean(op.apply((Object)BigInteger.valueOf(lhsTrue[i]), (Object)tc.wrap((byte)rhsTrue[i]))));
      assertTrue(tc.unwrapToBoolean(op.apply((Object)BigDecimal.valueOf(lhsTrue[i]), (Object)tc.wrap((byte)rhsTrue[i]))));

      assertTrue(tc.unwrapToBoolean(op.apply(tc.wrap((byte)lhsTrue[i]), tc.wrap((char)rhsTrue[i]))));
      assertTrue(tc.unwrapToBoolean(op.apply(tc.wrap((char)lhsTrue[i]), tc.wrap((char)rhsTrue[i]))));
      assertTrue(tc.unwrapToBoolean(op.apply(tc.wrap((short)lhsTrue[i]), tc.wrap((char)rhsTrue[i]))));
      assertTrue(tc.unwrapToBoolean(op.apply(tc.wrap(lhsTrue[i]), tc.wrap((char)rhsTrue[i]))));
      assertTrue(tc.unwrapToBoolean(op.apply(tc.wrap(lhsTrue[i]), tc.wrap((char)rhsTrue[i]))));
      assertTrue(tc.unwrapToBoolean(op.apply(tc.wrap(lhsTrue[i]), tc.wrap((char)rhsTrue[i]))));
      assertTrue(tc.unwrapToBoolean(op.apply(tc.wrap(lhsTrue[i]), tc.wrap((char)rhsTrue[i]))));
      assertTrue(tc.unwrapToBoolean(op.apply((Object)BigInteger.valueOf(lhsTrue[i]), (Object)tc.wrap((char)rhsTrue[i]))));
      assertTrue(tc.unwrapToBoolean(op.apply((Object)BigDecimal.valueOf(lhsTrue[i]), (Object)tc.wrap((char)rhsTrue[i]))));

      assertTrue(tc.unwrapToBoolean(op.apply(tc.wrap((byte)lhsTrue[i]), tc.wrap((short)rhsTrue[i]))));
      assertTrue(tc.unwrapToBoolean(op.apply(tc.wrap((char)lhsTrue[i]), tc.wrap((short)rhsTrue[i]))));
      assertTrue(tc.unwrapToBoolean(op.apply(tc.wrap((short)lhsTrue[i]), tc.wrap((short)rhsTrue[i]))));
      assertTrue(tc.unwrapToBoolean(op.apply(tc.wrap(lhsTrue[i]), tc.wrap((short)rhsTrue[i]))));
      assertTrue(tc.unwrapToBoolean(op.apply(tc.wrap(lhsTrue[i]), tc.wrap((short)rhsTrue[i]))));
      assertTrue(tc.unwrapToBoolean(op.apply(tc.wrap(lhsTrue[i]), tc.wrap((short)rhsTrue[i]))));
      assertTrue(tc.unwrapToBoolean(op.apply(tc.wrap(lhsTrue[i]), tc.wrap((short)rhsTrue[i]))));
      assertTrue(tc.unwrapToBoolean(op.apply((Object)BigInteger.valueOf(lhsTrue[i]), (Object)tc.wrap((short)rhsTrue[i]))));
      assertTrue(tc.unwrapToBoolean(op.apply((Object)BigDecimal.valueOf(lhsTrue[i]), (Object)tc.wrap((short)rhsTrue[i]))));

      assertTrue(tc.unwrapToBoolean(op.apply(tc.wrap((byte)lhsTrue[i]), tc.wrap(rhsTrue[i]))));
      assertTrue(tc.unwrapToBoolean(op.apply(tc.wrap((char)lhsTrue[i]), tc.wrap(rhsTrue[i]))));
      assertTrue(tc.unwrapToBoolean(op.apply(tc.wrap((short)lhsTrue[i]), tc.wrap(rhsTrue[i]))));
      assertTrue(tc.unwrapToBoolean(op.apply(tc.wrap(lhsTrue[i]), tc.wrap(rhsTrue[i]))));
      assertTrue(tc.unwrapToBoolean(op.apply(tc.wrap(lhsTrue[i]), tc.wrap(rhsTrue[i]))));
      assertTrue(tc.unwrapToBoolean(op.apply(tc.wrap(lhsTrue[i]), tc.wrap(rhsTrue[i]))));
      assertTrue(tc.unwrapToBoolean(op.apply(tc.wrap(lhsTrue[i]), tc.wrap(rhsTrue[i]))));
      assertTrue(tc.unwrapToBoolean(op.apply((Object)BigInteger.valueOf(lhsTrue[i]), (Object)tc.wrap(rhsTrue[i]))));
      assertTrue(tc.unwrapToBoolean(op.apply((Object)BigDecimal.valueOf(lhsTrue[i]), (Object)tc.wrap(rhsTrue[i]))));

      assertTrue(tc.unwrapToBoolean(op.apply(tc.wrap((byte)lhsTrue[i]), tc.wrap(rhsTrue[i]))));
      assertTrue(tc.unwrapToBoolean(op.apply(tc.wrap((char)lhsTrue[i]), tc.wrap(rhsTrue[i]))));
      assertTrue(tc.unwrapToBoolean(op.apply(tc.wrap((short)lhsTrue[i]), tc.wrap(rhsTrue[i]))));
      assertTrue(tc.unwrapToBoolean(op.apply(tc.wrap(lhsTrue[i]), tc.wrap(rhsTrue[i]))));
      assertTrue(tc.unwrapToBoolean(op.apply(tc.wrap(lhsTrue[i]), tc.wrap(rhsTrue[i]))));
      assertTrue(tc.unwrapToBoolean(op.apply(tc.wrap(lhsTrue[i]), tc.wrap(rhsTrue[i]))));
      assertTrue(tc.unwrapToBoolean(op.apply(tc.wrap(lhsTrue[i]), tc.wrap(rhsTrue[i]))));
      assertTrue(tc.unwrapToBoolean(op.apply((Object)BigInteger.valueOf(lhsTrue[i]), (Object)tc.wrap(rhsTrue[i]))));
      assertTrue(tc.unwrapToBoolean(op.apply((Object)BigDecimal.valueOf(lhsTrue[i]), (Object)tc.wrap(rhsTrue[i]))));

      assertTrue(tc.unwrapToBoolean(op.apply(tc.wrap((byte)lhsTrue[i]), tc.wrap(rhsTrue[i]))));
      assertTrue(tc.unwrapToBoolean(op.apply(tc.wrap((char)lhsTrue[i]), tc.wrap(rhsTrue[i]))));
      assertTrue(tc.unwrapToBoolean(op.apply(tc.wrap((short)lhsTrue[i]), tc.wrap(rhsTrue[i]))));
      assertTrue(tc.unwrapToBoolean(op.apply(tc.wrap(lhsTrue[i]), tc.wrap(rhsTrue[i]))));
      assertTrue(tc.unwrapToBoolean(op.apply(tc.wrap(lhsTrue[i]), tc.wrap(rhsTrue[i]))));
      assertTrue(tc.unwrapToBoolean(op.apply(tc.wrap(lhsTrue[i]), tc.wrap(rhsTrue[i]))));
      assertTrue(tc.unwrapToBoolean(op.apply(tc.wrap(lhsTrue[i]), tc.wrap(rhsTrue[i]))));
      assertTrue(tc.unwrapToBoolean(op.apply((Object)BigInteger.valueOf(lhsTrue[i]), (Object)tc.wrap(rhsTrue[i]))));
      assertTrue(tc.unwrapToBoolean(op.apply((Object)BigDecimal.valueOf(lhsTrue[i]), (Object)tc.wrap(rhsTrue[i]))));

      assertTrue(tc.unwrapToBoolean(op.apply(tc.wrap((byte)lhsTrue[i]), tc.wrap(rhsTrue[i]))));
      assertTrue(tc.unwrapToBoolean(op.apply(tc.wrap((char)lhsTrue[i]), tc.wrap(rhsTrue[i]))));
      assertTrue(tc.unwrapToBoolean(op.apply(tc.wrap((short)lhsTrue[i]), tc.wrap(rhsTrue[i]))));
      assertTrue(tc.unwrapToBoolean(op.apply(tc.wrap(lhsTrue[i]), tc.wrap(rhsTrue[i]))));
      assertTrue(tc.unwrapToBoolean(op.apply(tc.wrap(lhsTrue[i]), tc.wrap(rhsTrue[i]))));
      assertTrue(tc.unwrapToBoolean(op.apply(tc.wrap(lhsTrue[i]), tc.wrap(rhsTrue[i]))));
      assertTrue(tc.unwrapToBoolean(op.apply(tc.wrap(lhsTrue[i]), tc.wrap(rhsTrue[i]))));
      assertTrue(tc.unwrapToBoolean(op.apply((Object)BigInteger.valueOf(lhsTrue[i]), (Object)tc.wrap(rhsTrue[i]))));
      assertTrue(tc.unwrapToBoolean(op.apply((Object)BigDecimal.valueOf(lhsTrue[i]), (Object)tc.wrap(rhsTrue[i]))));

      assertTrue(tc.unwrapToBoolean(op.apply((Object)tc.wrap((byte)lhsTrue[i]), (Object)BigInteger.valueOf(rhsTrue[i]))));
      assertTrue(tc.unwrapToBoolean(op.apply((Object)tc.wrap((char)lhsTrue[i]), (Object)BigInteger.valueOf(rhsTrue[i]))));
      assertTrue(tc.unwrapToBoolean(op.apply((Object)tc.wrap((short)lhsTrue[i]), (Object)BigInteger.valueOf(rhsTrue[i]))));
      assertTrue(tc.unwrapToBoolean(op.apply((Object)tc.wrap(lhsTrue[i]), (Object)BigInteger.valueOf(rhsTrue[i]))));
      assertTrue(tc.unwrapToBoolean(op.apply((Object)tc.wrap(lhsTrue[i]), (Object)BigInteger.valueOf(rhsTrue[i]))));
      assertTrue(tc.unwrapToBoolean(op.apply((Object)tc.wrap(lhsTrue[i]), (Object)BigInteger.valueOf(rhsTrue[i]))));
      assertTrue(tc.unwrapToBoolean(op.apply((Object)tc.wrap(lhsTrue[i]), (Object)BigInteger.valueOf(rhsTrue[i]))));
      assertTrue(tc.unwrapToBoolean(op.apply((Object)BigInteger.valueOf(lhsTrue[i]), (Object)BigInteger.valueOf(rhsTrue[i]))));
      assertTrue(tc.unwrapToBoolean(op.apply((Object)BigDecimal.valueOf(lhsTrue[i]), (Object)BigInteger.valueOf(rhsTrue[i]))));

      assertTrue(tc.unwrapToBoolean(op.apply((Object)tc.wrap((byte)lhsTrue[i]), (Object)BigDecimal.valueOf(rhsTrue[i]))));
      assertTrue(tc.unwrapToBoolean(op.apply((Object)tc.wrap((char)lhsTrue[i]), (Object)BigDecimal.valueOf(rhsTrue[i]))));
      assertTrue(tc.unwrapToBoolean(op.apply((Object)tc.wrap((short)lhsTrue[i]), (Object)BigDecimal.valueOf(rhsTrue[i]))));
      assertTrue(tc.unwrapToBoolean(op.apply((Object)tc.wrap(lhsTrue[i]), (Object)BigDecimal.valueOf(rhsTrue[i]))));
      assertTrue(tc.unwrapToBoolean(op.apply((Object)tc.wrap(lhsTrue[i]), (Object)BigDecimal.valueOf(rhsTrue[i]))));
      assertTrue(tc.unwrapToBoolean(op.apply((Object)tc.wrap(lhsTrue[i]), (Object)BigDecimal.valueOf(rhsTrue[i]))));
      assertTrue(tc.unwrapToBoolean(op.apply((Object)tc.wrap(lhsTrue[i]), (Object)BigDecimal.valueOf(rhsTrue[i]))));
      assertTrue(tc.unwrapToBoolean(op.apply((Object)BigInteger.valueOf(lhsTrue[i]), (Object)BigDecimal.valueOf(rhsTrue[i]))));
      assertTrue(tc.unwrapToBoolean(op.apply((Object)BigDecimal.valueOf(lhsTrue[i]), (Object)BigDecimal.valueOf(rhsTrue[i]))));

      assertTrue(op.applyBoolean(tc.wrap((byte)lhsTrue[i]), tc.wrap((byte)rhsTrue[i])));
      assertTrue(op.applyBoolean(tc.wrap((char)lhsTrue[i]), tc.wrap((byte)rhsTrue[i])));
      assertTrue(op.applyBoolean(tc.wrap((short)lhsTrue[i]), tc.wrap((byte)rhsTrue[i])));
      assertTrue(op.applyBoolean(tc.wrap(lhsTrue[i]), tc.wrap((byte)rhsTrue[i])));
      assertTrue(op.applyBoolean(tc.wrap(lhsTrue[i]), tc.wrap((byte)rhsTrue[i])));
      assertTrue(op.applyBoolean(tc.wrap(lhsTrue[i]), tc.wrap((byte)rhsTrue[i])));
      assertTrue(op.applyBoolean(tc.wrap(lhsTrue[i]), tc.wrap((byte)rhsTrue[i])));
      assertTrue(op.applyBoolean((Object)BigInteger.valueOf(lhsTrue[i]), (Object)tc.wrap((byte)rhsTrue[i])));
      assertTrue(op.applyBoolean((Object)BigDecimal.valueOf(lhsTrue[i]), (Object)tc.wrap((byte)rhsTrue[i])));

      assertTrue(op.applyBoolean(tc.wrap((byte)lhsTrue[i]), tc.wrap((char)rhsTrue[i])));
      assertTrue(op.applyBoolean(tc.wrap((char)lhsTrue[i]), tc.wrap((char)rhsTrue[i])));
      assertTrue(op.applyBoolean(tc.wrap((short)lhsTrue[i]), tc.wrap((char)rhsTrue[i])));
      assertTrue(op.applyBoolean(tc.wrap(lhsTrue[i]), tc.wrap((char)rhsTrue[i])));
      assertTrue(op.applyBoolean(tc.wrap(lhsTrue[i]), tc.wrap((char)rhsTrue[i])));
      assertTrue(op.applyBoolean(tc.wrap(lhsTrue[i]), tc.wrap((char)rhsTrue[i])));
      assertTrue(op.applyBoolean(tc.wrap(lhsTrue[i]), tc.wrap((char)rhsTrue[i])));
      assertTrue(op.applyBoolean((Object)BigInteger.valueOf(lhsTrue[i]), (Object)tc.wrap((char)rhsTrue[i])));
      assertTrue(op.applyBoolean((Object)BigDecimal.valueOf(lhsTrue[i]), (Object)tc.wrap((char)rhsTrue[i])));

      assertTrue(op.applyBoolean(tc.wrap((byte)lhsTrue[i]), tc.wrap((short)rhsTrue[i])));
      assertTrue(op.applyBoolean(tc.wrap((char)lhsTrue[i]), tc.wrap((short)rhsTrue[i])));
      assertTrue(op.applyBoolean(tc.wrap((short)lhsTrue[i]), tc.wrap((short)rhsTrue[i])));
      assertTrue(op.applyBoolean(tc.wrap(lhsTrue[i]), tc.wrap((short)rhsTrue[i])));
      assertTrue(op.applyBoolean(tc.wrap(lhsTrue[i]), tc.wrap((short)rhsTrue[i])));
      assertTrue(op.applyBoolean(tc.wrap(lhsTrue[i]), tc.wrap((short)rhsTrue[i])));
      assertTrue(op.applyBoolean(tc.wrap(lhsTrue[i]), tc.wrap((short)rhsTrue[i])));
      assertTrue(op.applyBoolean((Object)BigInteger.valueOf(lhsTrue[i]), (Object)tc.wrap((short)rhsTrue[i])));
      assertTrue(op.applyBoolean((Object)BigDecimal.valueOf(lhsTrue[i]), (Object)tc.wrap((short)rhsTrue[i])));

      assertTrue(op.applyBoolean(tc.wrap((byte)lhsTrue[i]), tc.wrap(rhsTrue[i])));
      assertTrue(op.applyBoolean(tc.wrap((char)lhsTrue[i]), tc.wrap(rhsTrue[i])));
      assertTrue(op.applyBoolean(tc.wrap((short)lhsTrue[i]), tc.wrap(rhsTrue[i])));
      assertTrue(op.applyBoolean(tc.wrap(lhsTrue[i]), tc.wrap(rhsTrue[i])));
      assertTrue(op.applyBoolean(tc.wrap(lhsTrue[i]), tc.wrap(rhsTrue[i])));
      assertTrue(op.applyBoolean(tc.wrap(lhsTrue[i]), tc.wrap(rhsTrue[i])));
      assertTrue(op.applyBoolean(tc.wrap(lhsTrue[i]), tc.wrap(rhsTrue[i])));
      assertTrue(op.applyBoolean((Object)BigInteger.valueOf(lhsTrue[i]), (Object)tc.wrap(rhsTrue[i])));
      assertTrue(op.applyBoolean((Object)BigDecimal.valueOf(lhsTrue[i]), (Object)tc.wrap(rhsTrue[i])));

      assertTrue(op.applyBoolean(tc.wrap((byte)lhsTrue[i]), tc.wrap(rhsTrue[i])));
      assertTrue(op.applyBoolean(tc.wrap((char)lhsTrue[i]), tc.wrap(rhsTrue[i])));
      assertTrue(op.applyBoolean(tc.wrap((short)lhsTrue[i]), tc.wrap(rhsTrue[i])));
      assertTrue(op.applyBoolean(tc.wrap(lhsTrue[i]), tc.wrap(rhsTrue[i])));
      assertTrue(op.applyBoolean(tc.wrap(lhsTrue[i]), tc.wrap(rhsTrue[i])));
      assertTrue(op.applyBoolean(tc.wrap(lhsTrue[i]), tc.wrap(rhsTrue[i])));
      assertTrue(op.applyBoolean(tc.wrap(lhsTrue[i]), tc.wrap(rhsTrue[i])));
      assertTrue(op.applyBoolean((Object)BigInteger.valueOf(lhsTrue[i]), (Object)tc.wrap(rhsTrue[i])));
      assertTrue(op.applyBoolean((Object)BigDecimal.valueOf(lhsTrue[i]), (Object)tc.wrap(rhsTrue[i])));

      assertTrue(op.applyBoolean(tc.wrap((byte)lhsTrue[i]), tc.wrap(rhsTrue[i])));
      assertTrue(op.applyBoolean(tc.wrap((char)lhsTrue[i]), tc.wrap(rhsTrue[i])));
      assertTrue(op.applyBoolean(tc.wrap((short)lhsTrue[i]), tc.wrap(rhsTrue[i])));
      assertTrue(op.applyBoolean(tc.wrap(lhsTrue[i]), tc.wrap(rhsTrue[i])));
      assertTrue(op.applyBoolean(tc.wrap(lhsTrue[i]), tc.wrap(rhsTrue[i])));
      assertTrue(op.applyBoolean(tc.wrap(lhsTrue[i]), tc.wrap(rhsTrue[i])));
      assertTrue(op.applyBoolean(tc.wrap(lhsTrue[i]), tc.wrap(rhsTrue[i])));
      assertTrue(op.applyBoolean((Object)BigInteger.valueOf(lhsTrue[i]), (Object)tc.wrap(rhsTrue[i])));
      assertTrue(op.applyBoolean((Object)BigDecimal.valueOf(lhsTrue[i]), (Object)tc.wrap(rhsTrue[i])));

      assertTrue(op.applyBoolean(tc.wrap((byte)lhsTrue[i]), tc.wrap(rhsTrue[i])));
      assertTrue(op.applyBoolean(tc.wrap((char)lhsTrue[i]), tc.wrap(rhsTrue[i])));
      assertTrue(op.applyBoolean(tc.wrap((short)lhsTrue[i]), tc.wrap(rhsTrue[i])));
      assertTrue(op.applyBoolean(tc.wrap(lhsTrue[i]), tc.wrap(rhsTrue[i])));
      assertTrue(op.applyBoolean(tc.wrap(lhsTrue[i]), tc.wrap(rhsTrue[i])));
      assertTrue(op.applyBoolean(tc.wrap(lhsTrue[i]), tc.wrap(rhsTrue[i])));
      assertTrue(op.applyBoolean(tc.wrap(lhsTrue[i]), tc.wrap(rhsTrue[i])));
      assertTrue(op.applyBoolean((Object)BigInteger.valueOf(lhsTrue[i]), (Object)tc.wrap(rhsTrue[i])));
      assertTrue(op.applyBoolean((Object)BigDecimal.valueOf(lhsTrue[i]), (Object)tc.wrap(rhsTrue[i])));

      assertTrue(op.applyBoolean((Object)tc.wrap((byte)lhsTrue[i]), (Object)BigInteger.valueOf(rhsTrue[i])));
      assertTrue(op.applyBoolean((Object)tc.wrap((char)lhsTrue[i]), (Object)BigInteger.valueOf(rhsTrue[i])));
      assertTrue(op.applyBoolean((Object)tc.wrap((short)lhsTrue[i]), (Object)BigInteger.valueOf(rhsTrue[i])));
      assertTrue(op.applyBoolean((Object)tc.wrap(lhsTrue[i]), (Object)BigInteger.valueOf(rhsTrue[i])));
      assertTrue(op.applyBoolean((Object)tc.wrap(lhsTrue[i]), (Object)BigInteger.valueOf(rhsTrue[i])));
      assertTrue(op.applyBoolean((Object)tc.wrap(lhsTrue[i]), (Object)BigInteger.valueOf(rhsTrue[i])));
      assertTrue(op.applyBoolean((Object)tc.wrap(lhsTrue[i]), (Object)BigInteger.valueOf(rhsTrue[i])));
      assertTrue(op.applyBoolean((Object)BigInteger.valueOf(lhsTrue[i]), (Object)BigInteger.valueOf(rhsTrue[i])));
      assertTrue(op.applyBoolean((Object)BigDecimal.valueOf(lhsTrue[i]), (Object)BigInteger.valueOf(rhsTrue[i])));

      assertTrue(op.applyBoolean((Object)tc.wrap((byte)lhsTrue[i]), (Object)BigDecimal.valueOf(rhsTrue[i])));
      assertTrue(op.applyBoolean((Object)tc.wrap((char)lhsTrue[i]), (Object)BigDecimal.valueOf(rhsTrue[i])));
      assertTrue(op.applyBoolean((Object)tc.wrap((short)lhsTrue[i]), (Object)BigDecimal.valueOf(rhsTrue[i])));
      assertTrue(op.applyBoolean((Object)tc.wrap(lhsTrue[i]), (Object)BigDecimal.valueOf(rhsTrue[i])));
      assertTrue(op.applyBoolean((Object)tc.wrap(lhsTrue[i]), (Object)BigDecimal.valueOf(rhsTrue[i])));
      assertTrue(op.applyBoolean((Object)tc.wrap(lhsTrue[i]), (Object)BigDecimal.valueOf(rhsTrue[i])));
      assertTrue(op.applyBoolean((Object)tc.wrap(lhsTrue[i]), (Object)BigDecimal.valueOf(rhsTrue[i])));
      assertTrue(op.applyBoolean((Object)BigInteger.valueOf(lhsTrue[i]), (Object)BigDecimal.valueOf(rhsTrue[i])));
      assertTrue(op.applyBoolean((Object)BigDecimal.valueOf(lhsTrue[i]), (Object)BigDecimal.valueOf(rhsTrue[i])));

      assertTrue(op.applyBoolean(tc.wrap((byte)lhsTrue[i]), byteMetaClass, tc.wrap((byte)rhsTrue[i])));
      assertTrue(op.applyBoolean(tc.wrap((char)lhsTrue[i]), byteMetaClass, tc.wrap((byte)rhsTrue[i])));
      assertTrue(op.applyBoolean(tc.wrap((short)lhsTrue[i]), byteMetaClass, tc.wrap((byte)rhsTrue[i])));
      assertTrue(op.applyBoolean(tc.wrap(lhsTrue[i]), byteMetaClass, tc.wrap((byte)rhsTrue[i])));
      assertTrue(op.applyBoolean(tc.wrap(lhsTrue[i]), byteMetaClass, tc.wrap((byte)rhsTrue[i])));
      assertTrue(op.applyBoolean(tc.wrap(lhsTrue[i]), byteMetaClass, tc.wrap((byte)rhsTrue[i])));
      assertTrue(op.applyBoolean(tc.wrap(lhsTrue[i]), byteMetaClass, tc.wrap((byte)rhsTrue[i])));
      assertTrue(op.applyBoolean((Object)BigInteger.valueOf(lhsTrue[i]), byteMetaClass, (Object)tc.wrap((byte)rhsTrue[i])));
      assertTrue(op.applyBoolean((Object)BigDecimal.valueOf(lhsTrue[i]), byteMetaClass, (Object)tc.wrap((byte)rhsTrue[i])));

      assertTrue(op.applyBoolean(tc.wrap((byte)lhsTrue[i]), charMetaClass, tc.wrap((char)rhsTrue[i])));
      assertTrue(op.applyBoolean(tc.wrap((char)lhsTrue[i]), charMetaClass, tc.wrap((char)rhsTrue[i])));
      assertTrue(op.applyBoolean(tc.wrap((short)lhsTrue[i]), charMetaClass, tc.wrap((char)rhsTrue[i])));
      assertTrue(op.applyBoolean(tc.wrap(lhsTrue[i]), charMetaClass, tc.wrap((char)rhsTrue[i])));
      assertTrue(op.applyBoolean(tc.wrap(lhsTrue[i]), charMetaClass, tc.wrap((char)rhsTrue[i])));
      assertTrue(op.applyBoolean(tc.wrap(lhsTrue[i]), charMetaClass, tc.wrap((char)rhsTrue[i])));
      assertTrue(op.applyBoolean(tc.wrap(lhsTrue[i]), charMetaClass, tc.wrap((char)rhsTrue[i])));
      assertTrue(op.applyBoolean((Object)BigInteger.valueOf(lhsTrue[i]), charMetaClass, (Object)tc.wrap((char)rhsTrue[i])));
      assertTrue(op.applyBoolean((Object)BigDecimal.valueOf(lhsTrue[i]), charMetaClass, (Object)tc.wrap((char)rhsTrue[i])));

      assertTrue(op.applyBoolean(tc.wrap((byte)lhsTrue[i]), shortMetaClass, tc.wrap((short)rhsTrue[i])));
      assertTrue(op.applyBoolean(tc.wrap((char)lhsTrue[i]), shortMetaClass, tc.wrap((short)rhsTrue[i])));
      assertTrue(op.applyBoolean(tc.wrap((short)lhsTrue[i]), shortMetaClass, tc.wrap((short)rhsTrue[i])));
      assertTrue(op.applyBoolean(tc.wrap(lhsTrue[i]), shortMetaClass, tc.wrap((short)rhsTrue[i])));
      assertTrue(op.applyBoolean(tc.wrap(lhsTrue[i]), shortMetaClass, tc.wrap((short)rhsTrue[i])));
      assertTrue(op.applyBoolean(tc.wrap(lhsTrue[i]), shortMetaClass, tc.wrap((short)rhsTrue[i])));
      assertTrue(op.applyBoolean(tc.wrap(lhsTrue[i]), shortMetaClass, tc.wrap((short)rhsTrue[i])));
      assertTrue(op.applyBoolean((Object)BigInteger.valueOf(lhsTrue[i]), shortMetaClass, (Object)tc.wrap((short)rhsTrue[i])));
      assertTrue(op.applyBoolean((Object)BigDecimal.valueOf(lhsTrue[i]), shortMetaClass, (Object)tc.wrap((short)rhsTrue[i])));

      assertTrue(op.applyBoolean(tc.wrap((byte)lhsTrue[i]), intMetaClass, tc.wrap(rhsTrue[i])));
      assertTrue(op.applyBoolean(tc.wrap((char)lhsTrue[i]), intMetaClass, tc.wrap(rhsTrue[i])));
      assertTrue(op.applyBoolean(tc.wrap((short)lhsTrue[i]), intMetaClass, tc.wrap(rhsTrue[i])));
      assertTrue(op.applyBoolean(tc.wrap(lhsTrue[i]), intMetaClass, tc.wrap(rhsTrue[i])));
      assertTrue(op.applyBoolean(tc.wrap(lhsTrue[i]), intMetaClass, tc.wrap(rhsTrue[i])));
      assertTrue(op.applyBoolean(tc.wrap(lhsTrue[i]), intMetaClass, tc.wrap(rhsTrue[i])));
      assertTrue(op.applyBoolean(tc.wrap(lhsTrue[i]), intMetaClass, tc.wrap(rhsTrue[i])));
      assertTrue(op.applyBoolean((Object)BigInteger.valueOf(lhsTrue[i]), intMetaClass, (Object)tc.wrap(rhsTrue[i])));
      assertTrue(op.applyBoolean((Object)BigDecimal.valueOf(lhsTrue[i]), intMetaClass, (Object)tc.wrap(rhsTrue[i])));

      assertTrue(op.applyBoolean(tc.wrap((byte)lhsTrue[i]), longMetaClass, tc.wrap(rhsTrue[i])));
      assertTrue(op.applyBoolean(tc.wrap((char)lhsTrue[i]), longMetaClass, tc.wrap(rhsTrue[i])));
      assertTrue(op.applyBoolean(tc.wrap((short)lhsTrue[i]), longMetaClass, tc.wrap(rhsTrue[i])));
      assertTrue(op.applyBoolean(tc.wrap(lhsTrue[i]), longMetaClass, tc.wrap(rhsTrue[i])));
      assertTrue(op.applyBoolean(tc.wrap(lhsTrue[i]), longMetaClass, tc.wrap(rhsTrue[i])));
      assertTrue(op.applyBoolean(tc.wrap(lhsTrue[i]), longMetaClass, tc.wrap(rhsTrue[i])));
      assertTrue(op.applyBoolean(tc.wrap(lhsTrue[i]), longMetaClass, tc.wrap(rhsTrue[i])));
      assertTrue(op.applyBoolean((Object)BigInteger.valueOf(lhsTrue[i]), longMetaClass, (Object)tc.wrap(rhsTrue[i])));
      assertTrue(op.applyBoolean((Object)BigDecimal.valueOf(lhsTrue[i]), longMetaClass, (Object)tc.wrap(rhsTrue[i])));

      assertTrue(op.applyBoolean(tc.wrap((byte)lhsTrue[i]), floatMetaClass, tc.wrap(rhsTrue[i])));
      assertTrue(op.applyBoolean(tc.wrap((char)lhsTrue[i]), floatMetaClass, tc.wrap(rhsTrue[i])));
      assertTrue(op.applyBoolean(tc.wrap((short)lhsTrue[i]), floatMetaClass, tc.wrap(rhsTrue[i])));
      assertTrue(op.applyBoolean(tc.wrap(lhsTrue[i]), floatMetaClass, tc.wrap(rhsTrue[i])));
      assertTrue(op.applyBoolean(tc.wrap(lhsTrue[i]), floatMetaClass, tc.wrap(rhsTrue[i])));
      assertTrue(op.applyBoolean(tc.wrap(lhsTrue[i]), floatMetaClass, tc.wrap(rhsTrue[i])));
      assertTrue(op.applyBoolean(tc.wrap(lhsTrue[i]), floatMetaClass, tc.wrap(rhsTrue[i])));
      assertTrue(op.applyBoolean((Object)BigInteger.valueOf(lhsTrue[i]), floatMetaClass, (Object)tc.wrap(rhsTrue[i])));
      assertTrue(op.applyBoolean((Object)BigDecimal.valueOf(lhsTrue[i]), floatMetaClass, (Object)tc.wrap(rhsTrue[i])));

      assertTrue(op.applyBoolean(tc.wrap((byte)lhsTrue[i]), doubleMetaClass, tc.wrap(rhsTrue[i])));
      assertTrue(op.applyBoolean(tc.wrap((char)lhsTrue[i]), doubleMetaClass, tc.wrap(rhsTrue[i])));
      assertTrue(op.applyBoolean(tc.wrap((short)lhsTrue[i]), doubleMetaClass, tc.wrap(rhsTrue[i])));
      assertTrue(op.applyBoolean(tc.wrap(lhsTrue[i]), doubleMetaClass, tc.wrap(rhsTrue[i])));
      assertTrue(op.applyBoolean(tc.wrap(lhsTrue[i]), doubleMetaClass, tc.wrap(rhsTrue[i])));
      assertTrue(op.applyBoolean(tc.wrap(lhsTrue[i]), doubleMetaClass, tc.wrap(rhsTrue[i])));
      assertTrue(op.applyBoolean(tc.wrap(lhsTrue[i]), doubleMetaClass, tc.wrap(rhsTrue[i])));
      assertTrue(op.applyBoolean((Object)BigInteger.valueOf(lhsTrue[i]), doubleMetaClass, (Object)tc.wrap(rhsTrue[i])));
      assertTrue(op.applyBoolean((Object)BigDecimal.valueOf(lhsTrue[i]), doubleMetaClass, (Object)tc.wrap(rhsTrue[i])));

      assertTrue(op.applyBoolean(tc.wrap((byte)lhsTrue[i]), bigIntegerMetaClass, BigInteger.valueOf(rhsTrue[i])));
      assertTrue(op.applyBoolean(tc.wrap((char)lhsTrue[i]), bigIntegerMetaClass, BigInteger.valueOf(rhsTrue[i])));
      assertTrue(op.applyBoolean(tc.wrap((short)lhsTrue[i]), bigIntegerMetaClass, BigInteger.valueOf(rhsTrue[i])));
      assertTrue(op.applyBoolean(tc.wrap(lhsTrue[i]), bigIntegerMetaClass, BigInteger.valueOf(rhsTrue[i])));
      assertTrue(op.applyBoolean(tc.wrap(lhsTrue[i]), bigIntegerMetaClass, BigInteger.valueOf(rhsTrue[i])));
      assertTrue(op.applyBoolean(tc.wrap(lhsTrue[i]), bigIntegerMetaClass, BigInteger.valueOf(rhsTrue[i])));
      assertTrue(op.applyBoolean(tc.wrap(lhsTrue[i]), bigIntegerMetaClass, BigInteger.valueOf(rhsTrue[i])));
      assertTrue(op.applyBoolean((Object)BigInteger.valueOf(lhsTrue[i]), bigIntegerMetaClass, (Object)BigInteger.valueOf(rhsTrue[i])));
      assertTrue(op.applyBoolean((Object)BigDecimal.valueOf(lhsTrue[i]), bigIntegerMetaClass, (Object)BigInteger.valueOf(rhsTrue[i])));

      assertTrue(op.applyBoolean(tc.wrap((byte)lhsTrue[i]), bigDecimalMetaClass, BigDecimal.valueOf(rhsTrue[i])));
      assertTrue(op.applyBoolean(tc.wrap((char)lhsTrue[i]), bigDecimalMetaClass, BigDecimal.valueOf(rhsTrue[i])));
      assertTrue(op.applyBoolean(tc.wrap((short)lhsTrue[i]), bigDecimalMetaClass, BigDecimal.valueOf(rhsTrue[i])));
      assertTrue(op.applyBoolean(tc.wrap(lhsTrue[i]), bigDecimalMetaClass, BigDecimal.valueOf(rhsTrue[i])));
      assertTrue(op.applyBoolean(tc.wrap(lhsTrue[i]), bigDecimalMetaClass, BigDecimal.valueOf(rhsTrue[i])));
      assertTrue(op.applyBoolean(tc.wrap(lhsTrue[i]), bigDecimalMetaClass, BigDecimal.valueOf(rhsTrue[i])));
      assertTrue(op.applyBoolean(tc.wrap(lhsTrue[i]), bigDecimalMetaClass, BigDecimal.valueOf(rhsTrue[i])));
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

      assertFalse(tc.unwrapToBoolean(op.apply((byte)lhsFalse[i], tc.wrap((byte)rhsFalse[i]))));
      assertFalse(tc.unwrapToBoolean(op.apply((char)lhsFalse[i], tc.wrap((byte)rhsFalse[i]))));
      assertFalse(tc.unwrapToBoolean(op.apply((short)lhsFalse[i], tc.wrap((byte)rhsFalse[i]))));
      assertFalse(tc.unwrapToBoolean(op.apply(lhsFalse[i], tc.wrap((byte)rhsFalse[i]))));
      assertFalse(tc.unwrapToBoolean(op.apply((long)lhsFalse[i], tc.wrap((byte)rhsFalse[i]))));
      assertFalse(tc.unwrapToBoolean(op.apply((float)lhsFalse[i], tc.wrap((byte)rhsFalse[i]))));
      assertFalse(tc.unwrapToBoolean(op.apply((double)lhsFalse[i], tc.wrap((byte)rhsFalse[i]))));
      assertFalse(tc.unwrapToBoolean(op.apply(BigInteger.valueOf(lhsFalse[i]), tc.wrap((byte)rhsFalse[i]))));
      assertFalse(tc.unwrapToBoolean(op.apply(BigDecimal.valueOf(lhsFalse[i]), tc.wrap((byte)rhsFalse[i]))));

      assertFalse(tc.unwrapToBoolean(op.apply((byte)lhsFalse[i], tc.wrap((char)rhsFalse[i]))));
      assertFalse(tc.unwrapToBoolean(op.apply((char)lhsFalse[i], tc.wrap((char)rhsFalse[i]))));
      assertFalse(tc.unwrapToBoolean(op.apply((short)lhsFalse[i], tc.wrap((char)rhsFalse[i]))));
      assertFalse(tc.unwrapToBoolean(op.apply(lhsFalse[i], tc.wrap((char)rhsFalse[i]))));
      assertFalse(tc.unwrapToBoolean(op.apply((long)lhsFalse[i], tc.wrap((char)rhsFalse[i]))));
      assertFalse(tc.unwrapToBoolean(op.apply((float)lhsFalse[i], tc.wrap((char)rhsFalse[i]))));
      assertFalse(tc.unwrapToBoolean(op.apply((double)lhsFalse[i], tc.wrap((char)rhsFalse[i]))));
      assertFalse(tc.unwrapToBoolean(op.apply(BigInteger.valueOf(lhsFalse[i]), tc.wrap((char)rhsFalse[i]))));
      assertFalse(tc.unwrapToBoolean(op.apply(BigDecimal.valueOf(lhsFalse[i]), tc.wrap((char)rhsFalse[i]))));

      assertFalse(tc.unwrapToBoolean(op.apply((byte)lhsFalse[i], tc.wrap((short)rhsFalse[i]))));
      assertFalse(tc.unwrapToBoolean(op.apply((char)lhsFalse[i], tc.wrap((short)rhsFalse[i]))));
      assertFalse(tc.unwrapToBoolean(op.apply((short)lhsFalse[i], tc.wrap((short)rhsFalse[i]))));
      assertFalse(tc.unwrapToBoolean(op.apply(lhsFalse[i], tc.wrap((short)rhsFalse[i]))));
      assertFalse(tc.unwrapToBoolean(op.apply((long)lhsFalse[i], tc.wrap((short)rhsFalse[i]))));
      assertFalse(tc.unwrapToBoolean(op.apply((float)lhsFalse[i], tc.wrap((short)rhsFalse[i]))));
      assertFalse(tc.unwrapToBoolean(op.apply((double)lhsFalse[i], tc.wrap((short)rhsFalse[i]))));
      assertFalse(tc.unwrapToBoolean(op.apply(BigInteger.valueOf(lhsFalse[i]), tc.wrap((short)rhsFalse[i]))));
      assertFalse(tc.unwrapToBoolean(op.apply(BigDecimal.valueOf(lhsFalse[i]), tc.wrap((short)rhsFalse[i]))));

      assertFalse(tc.unwrapToBoolean(op.apply((byte)lhsFalse[i], tc.wrap(rhsFalse[i]))));
      assertFalse(tc.unwrapToBoolean(op.apply((char)lhsFalse[i], tc.wrap(rhsFalse[i]))));
      assertFalse(tc.unwrapToBoolean(op.apply((short)lhsFalse[i], tc.wrap(rhsFalse[i]))));
      assertFalse(tc.unwrapToBoolean(op.apply(lhsFalse[i], tc.wrap(rhsFalse[i]))));
      assertFalse(tc.unwrapToBoolean(op.apply((long)lhsFalse[i], tc.wrap(rhsFalse[i]))));
      assertFalse(tc.unwrapToBoolean(op.apply((float)lhsFalse[i], tc.wrap(rhsFalse[i]))));
      assertFalse(tc.unwrapToBoolean(op.apply((double)lhsFalse[i], tc.wrap(rhsFalse[i]))));
      assertFalse(tc.unwrapToBoolean(op.apply(BigInteger.valueOf(lhsFalse[i]), tc.wrap(rhsFalse[i]))));
      assertFalse(tc.unwrapToBoolean(op.apply(BigDecimal.valueOf(lhsFalse[i]), tc.wrap(rhsFalse[i]))));

      assertFalse(tc.unwrapToBoolean(op.apply((byte)lhsFalse[i], tc.wrap(rhsFalse[i]))));
      assertFalse(tc.unwrapToBoolean(op.apply((char)lhsFalse[i], tc.wrap(rhsFalse[i]))));
      assertFalse(tc.unwrapToBoolean(op.apply((short)lhsFalse[i], tc.wrap(rhsFalse[i]))));
      assertFalse(tc.unwrapToBoolean(op.apply(lhsFalse[i], tc.wrap(rhsFalse[i]))));
      assertFalse(tc.unwrapToBoolean(op.apply((long)lhsFalse[i], tc.wrap(rhsFalse[i]))));
      assertFalse(tc.unwrapToBoolean(op.apply((float)lhsFalse[i], tc.wrap(rhsFalse[i]))));
      assertFalse(tc.unwrapToBoolean(op.apply((double)lhsFalse[i], tc.wrap(rhsFalse[i]))));
      assertFalse(tc.unwrapToBoolean(op.apply(BigInteger.valueOf(lhsFalse[i]), tc.wrap(rhsFalse[i]))));
      assertFalse(tc.unwrapToBoolean(op.apply(BigDecimal.valueOf(lhsFalse[i]), tc.wrap(rhsFalse[i]))));

      assertFalse(tc.unwrapToBoolean(op.apply((byte)lhsFalse[i], tc.wrap(rhsFalse[i]))));
      assertFalse(tc.unwrapToBoolean(op.apply((char)lhsFalse[i], tc.wrap(rhsFalse[i]))));
      assertFalse(tc.unwrapToBoolean(op.apply((short)lhsFalse[i], tc.wrap(rhsFalse[i]))));
      assertFalse(tc.unwrapToBoolean(op.apply(lhsFalse[i], tc.wrap(rhsFalse[i]))));
      assertFalse(tc.unwrapToBoolean(op.apply((long)lhsFalse[i], tc.wrap(rhsFalse[i]))));
      assertFalse(tc.unwrapToBoolean(op.apply((float)lhsFalse[i], tc.wrap(rhsFalse[i]))));
      assertFalse(tc.unwrapToBoolean(op.apply((double)lhsFalse[i], tc.wrap(rhsFalse[i]))));
      assertFalse(tc.unwrapToBoolean(op.apply(BigInteger.valueOf(lhsFalse[i]), tc.wrap(rhsFalse[i]))));
      assertFalse(tc.unwrapToBoolean(op.apply(BigDecimal.valueOf(lhsFalse[i]), tc.wrap(rhsFalse[i]))));

      assertFalse(tc.unwrapToBoolean(op.apply((byte)lhsFalse[i], tc.wrap(rhsFalse[i]))));
      assertFalse(tc.unwrapToBoolean(op.apply((char)lhsFalse[i], tc.wrap(rhsFalse[i]))));
      assertFalse(tc.unwrapToBoolean(op.apply((short)lhsFalse[i], tc.wrap(rhsFalse[i]))));
      assertFalse(tc.unwrapToBoolean(op.apply(lhsFalse[i], tc.wrap(rhsFalse[i]))));
      assertFalse(tc.unwrapToBoolean(op.apply((long)lhsFalse[i], tc.wrap(rhsFalse[i]))));
      assertFalse(tc.unwrapToBoolean(op.apply((float)lhsFalse[i], tc.wrap(rhsFalse[i]))));
      assertFalse(tc.unwrapToBoolean(op.apply((double)lhsFalse[i], tc.wrap(rhsFalse[i]))));
      assertFalse(tc.unwrapToBoolean(op.apply(BigInteger.valueOf(lhsFalse[i]), tc.wrap(rhsFalse[i]))));
      assertFalse(tc.unwrapToBoolean(op.apply(BigDecimal.valueOf(lhsFalse[i]), tc.wrap(rhsFalse[i]))));

      assertFalse(tc.unwrapToBoolean(op.apply(tc.wrap((byte)lhsFalse[i]), tc.wrap((byte)rhsFalse[i]))));
      assertFalse(tc.unwrapToBoolean(op.apply(tc.wrap((char)lhsFalse[i]), tc.wrap((byte)rhsFalse[i]))));
      assertFalse(tc.unwrapToBoolean(op.apply(tc.wrap((short)lhsFalse[i]), tc.wrap((byte)rhsFalse[i]))));
      assertFalse(tc.unwrapToBoolean(op.apply(tc.wrap(lhsFalse[i]), tc.wrap((byte)rhsFalse[i]))));
      assertFalse(tc.unwrapToBoolean(op.apply(tc.wrap(lhsFalse[i]), tc.wrap((byte)rhsFalse[i]))));
      assertFalse(tc.unwrapToBoolean(op.apply(tc.wrap(lhsFalse[i]), tc.wrap((byte)rhsFalse[i]))));
      assertFalse(tc.unwrapToBoolean(op.apply(tc.wrap(lhsFalse[i]), tc.wrap((byte)rhsFalse[i]))));
      assertFalse(tc.unwrapToBoolean(op.apply(BigInteger.valueOf(lhsFalse[i]), tc.wrap((byte)rhsFalse[i]))));
      assertFalse(tc.unwrapToBoolean(op.apply(BigDecimal.valueOf(lhsFalse[i]), tc.wrap((byte)rhsFalse[i]))));

      assertFalse(tc.unwrapToBoolean(op.apply(tc.wrap((byte)lhsFalse[i]), tc.wrap((char)rhsFalse[i]))));
      assertFalse(tc.unwrapToBoolean(op.apply(tc.wrap((char)lhsFalse[i]), tc.wrap((char)rhsFalse[i]))));
      assertFalse(tc.unwrapToBoolean(op.apply(tc.wrap((short)lhsFalse[i]), tc.wrap((char)rhsFalse[i]))));
      assertFalse(tc.unwrapToBoolean(op.apply(tc.wrap(lhsFalse[i]), tc.wrap((char)rhsFalse[i]))));
      assertFalse(tc.unwrapToBoolean(op.apply(tc.wrap(lhsFalse[i]), tc.wrap((char)rhsFalse[i]))));
      assertFalse(tc.unwrapToBoolean(op.apply(tc.wrap(lhsFalse[i]), tc.wrap((char)rhsFalse[i]))));
      assertFalse(tc.unwrapToBoolean(op.apply(tc.wrap(lhsFalse[i]), tc.wrap((char)rhsFalse[i]))));
      assertFalse(tc.unwrapToBoolean(op.apply(BigInteger.valueOf(lhsFalse[i]), tc.wrap((char)rhsFalse[i]))));
      assertFalse(tc.unwrapToBoolean(op.apply(BigDecimal.valueOf(lhsFalse[i]), tc.wrap((char)rhsFalse[i]))));

      assertFalse(tc.unwrapToBoolean(op.apply(tc.wrap((byte)lhsFalse[i]), tc.wrap((short)rhsFalse[i]))));
      assertFalse(tc.unwrapToBoolean(op.apply(tc.wrap((char)lhsFalse[i]), tc.wrap((short)rhsFalse[i]))));
      assertFalse(tc.unwrapToBoolean(op.apply(tc.wrap((short)lhsFalse[i]), tc.wrap((short)rhsFalse[i]))));
      assertFalse(tc.unwrapToBoolean(op.apply(tc.wrap(lhsFalse[i]), tc.wrap((short)rhsFalse[i]))));
      assertFalse(tc.unwrapToBoolean(op.apply(tc.wrap(lhsFalse[i]), tc.wrap((short)rhsFalse[i]))));
      assertFalse(tc.unwrapToBoolean(op.apply(tc.wrap(lhsFalse[i]), tc.wrap((short)rhsFalse[i]))));
      assertFalse(tc.unwrapToBoolean(op.apply(tc.wrap(lhsFalse[i]), tc.wrap((short)rhsFalse[i]))));
      assertFalse(tc.unwrapToBoolean(op.apply(BigInteger.valueOf(lhsFalse[i]), tc.wrap((short)rhsFalse[i]))));
      assertFalse(tc.unwrapToBoolean(op.apply(BigDecimal.valueOf(lhsFalse[i]), tc.wrap((short)rhsFalse[i]))));

      assertFalse(tc.unwrapToBoolean(op.apply(tc.wrap((byte)lhsFalse[i]), tc.wrap(rhsFalse[i]))));
      assertFalse(tc.unwrapToBoolean(op.apply(tc.wrap((char)lhsFalse[i]), tc.wrap(rhsFalse[i]))));
      assertFalse(tc.unwrapToBoolean(op.apply(tc.wrap((short)lhsFalse[i]), tc.wrap(rhsFalse[i]))));
      assertFalse(tc.unwrapToBoolean(op.apply(tc.wrap(lhsFalse[i]), tc.wrap(rhsFalse[i]))));
      assertFalse(tc.unwrapToBoolean(op.apply(tc.wrap(lhsFalse[i]), tc.wrap(rhsFalse[i]))));
      assertFalse(tc.unwrapToBoolean(op.apply(tc.wrap(lhsFalse[i]), tc.wrap(rhsFalse[i]))));
      assertFalse(tc.unwrapToBoolean(op.apply(tc.wrap(lhsFalse[i]), tc.wrap(rhsFalse[i]))));
      assertFalse(tc.unwrapToBoolean(op.apply(BigInteger.valueOf(lhsFalse[i]), tc.wrap(rhsFalse[i]))));
      assertFalse(tc.unwrapToBoolean(op.apply(BigDecimal.valueOf(lhsFalse[i]), tc.wrap(rhsFalse[i]))));

      assertFalse(tc.unwrapToBoolean(op.apply(tc.wrap((byte)lhsFalse[i]), tc.wrap(rhsFalse[i]))));
      assertFalse(tc.unwrapToBoolean(op.apply(tc.wrap((char)lhsFalse[i]), tc.wrap(rhsFalse[i]))));
      assertFalse(tc.unwrapToBoolean(op.apply(tc.wrap((short)lhsFalse[i]), tc.wrap(rhsFalse[i]))));
      assertFalse(tc.unwrapToBoolean(op.apply(tc.wrap(lhsFalse[i]), tc.wrap(rhsFalse[i]))));
      assertFalse(tc.unwrapToBoolean(op.apply(tc.wrap(lhsFalse[i]), tc.wrap(rhsFalse[i]))));
      assertFalse(tc.unwrapToBoolean(op.apply(tc.wrap(lhsFalse[i]), tc.wrap(rhsFalse[i]))));
      assertFalse(tc.unwrapToBoolean(op.apply(tc.wrap(lhsFalse[i]), tc.wrap(rhsFalse[i]))));
      assertFalse(tc.unwrapToBoolean(op.apply(BigInteger.valueOf(lhsFalse[i]), tc.wrap(rhsFalse[i]))));
      assertFalse(tc.unwrapToBoolean(op.apply(BigDecimal.valueOf(lhsFalse[i]), tc.wrap(rhsFalse[i]))));

      assertFalse(tc.unwrapToBoolean(op.apply(tc.wrap((byte)lhsFalse[i]), tc.wrap(rhsFalse[i]))));
      assertFalse(tc.unwrapToBoolean(op.apply(tc.wrap((char)lhsFalse[i]), tc.wrap(rhsFalse[i]))));
      assertFalse(tc.unwrapToBoolean(op.apply(tc.wrap((short)lhsFalse[i]), tc.wrap(rhsFalse[i]))));
      assertFalse(tc.unwrapToBoolean(op.apply(tc.wrap(lhsFalse[i]), tc.wrap(rhsFalse[i]))));
      assertFalse(tc.unwrapToBoolean(op.apply(tc.wrap(lhsFalse[i]), tc.wrap(rhsFalse[i]))));
      assertFalse(tc.unwrapToBoolean(op.apply(tc.wrap(lhsFalse[i]), tc.wrap(rhsFalse[i]))));
      assertFalse(tc.unwrapToBoolean(op.apply(tc.wrap(lhsFalse[i]), tc.wrap(rhsFalse[i]))));
      assertFalse(tc.unwrapToBoolean(op.apply(BigInteger.valueOf(lhsFalse[i]), tc.wrap(rhsFalse[i]))));
      assertFalse(tc.unwrapToBoolean(op.apply(BigDecimal.valueOf(lhsFalse[i]), tc.wrap(rhsFalse[i]))));

      assertFalse(tc.unwrapToBoolean(op.apply(tc.wrap((byte)lhsFalse[i]), tc.wrap(rhsFalse[i]))));
      assertFalse(tc.unwrapToBoolean(op.apply(tc.wrap((char)lhsFalse[i]), tc.wrap(rhsFalse[i]))));
      assertFalse(tc.unwrapToBoolean(op.apply(tc.wrap((short)lhsFalse[i]), tc.wrap(rhsFalse[i]))));
      assertFalse(tc.unwrapToBoolean(op.apply(tc.wrap(lhsFalse[i]), tc.wrap(rhsFalse[i]))));
      assertFalse(tc.unwrapToBoolean(op.apply(tc.wrap(lhsFalse[i]), tc.wrap(rhsFalse[i]))));
      assertFalse(tc.unwrapToBoolean(op.apply(tc.wrap(lhsFalse[i]), tc.wrap(rhsFalse[i]))));
      assertFalse(tc.unwrapToBoolean(op.apply(tc.wrap(lhsFalse[i]), tc.wrap(rhsFalse[i]))));
      assertFalse(tc.unwrapToBoolean(op.apply(BigInteger.valueOf(lhsFalse[i]), tc.wrap(rhsFalse[i]))));
      assertFalse(tc.unwrapToBoolean(op.apply(BigDecimal.valueOf(lhsFalse[i]), tc.wrap(rhsFalse[i]))));

      assertFalse(tc.unwrapToBoolean(op.apply(tc.wrap((byte)lhsFalse[i]), BigInteger.valueOf(rhsFalse[i]))));
      assertFalse(tc.unwrapToBoolean(op.apply(tc.wrap((char)lhsFalse[i]), BigInteger.valueOf(rhsFalse[i]))));
      assertFalse(tc.unwrapToBoolean(op.apply(tc.wrap((short)lhsFalse[i]), BigInteger.valueOf(rhsFalse[i]))));
      assertFalse(tc.unwrapToBoolean(op.apply(tc.wrap(lhsFalse[i]), BigInteger.valueOf(rhsFalse[i]))));
      assertFalse(tc.unwrapToBoolean(op.apply(tc.wrap(lhsFalse[i]), BigInteger.valueOf(rhsFalse[i]))));
      assertFalse(tc.unwrapToBoolean(op.apply(tc.wrap(lhsFalse[i]), BigInteger.valueOf(rhsFalse[i]))));
      assertFalse(tc.unwrapToBoolean(op.apply(tc.wrap(lhsFalse[i]), BigInteger.valueOf(rhsFalse[i]))));
      assertFalse(tc.unwrapToBoolean(op.apply(BigInteger.valueOf(lhsFalse[i]), BigInteger.valueOf(rhsFalse[i]))));
      assertFalse(tc.unwrapToBoolean(op.apply(BigDecimal.valueOf(lhsFalse[i]), BigInteger.valueOf(rhsFalse[i]))));

      assertFalse(tc.unwrapToBoolean(op.apply(tc.wrap((byte)lhsFalse[i]), BigDecimal.valueOf(rhsFalse[i]))));
      assertFalse(tc.unwrapToBoolean(op.apply(tc.wrap((char)lhsFalse[i]), BigDecimal.valueOf(rhsFalse[i]))));
      assertFalse(tc.unwrapToBoolean(op.apply(tc.wrap((short)lhsFalse[i]), BigDecimal.valueOf(rhsFalse[i]))));
      assertFalse(tc.unwrapToBoolean(op.apply(tc.wrap(lhsFalse[i]), BigDecimal.valueOf(rhsFalse[i]))));
      assertFalse(tc.unwrapToBoolean(op.apply(tc.wrap(lhsFalse[i]), BigDecimal.valueOf(rhsFalse[i]))));
      assertFalse(tc.unwrapToBoolean(op.apply(tc.wrap(lhsFalse[i]), BigDecimal.valueOf(rhsFalse[i]))));
      assertFalse(tc.unwrapToBoolean(op.apply(tc.wrap(lhsFalse[i]), BigDecimal.valueOf(rhsFalse[i]))));
      assertFalse(tc.unwrapToBoolean(op.apply(BigInteger.valueOf(lhsFalse[i]), BigDecimal.valueOf(rhsFalse[i]))));
      assertFalse(tc.unwrapToBoolean(op.apply(BigDecimal.valueOf(lhsFalse[i]), BigDecimal.valueOf(rhsFalse[i]))));

      assertFalse(tc.unwrapToBoolean(op.apply(tc.wrap((byte)lhsFalse[i]), tc.wrap((byte)rhsFalse[i]))));
      assertFalse(tc.unwrapToBoolean(op.apply(tc.wrap((char)lhsFalse[i]), tc.wrap((byte)rhsFalse[i]))));
      assertFalse(tc.unwrapToBoolean(op.apply(tc.wrap((short)lhsFalse[i]), tc.wrap((byte)rhsFalse[i]))));
      assertFalse(tc.unwrapToBoolean(op.apply(tc.wrap(lhsFalse[i]), tc.wrap((byte)rhsFalse[i]))));
      assertFalse(tc.unwrapToBoolean(op.apply(tc.wrap(lhsFalse[i]), tc.wrap((byte)rhsFalse[i]))));
      assertFalse(tc.unwrapToBoolean(op.apply(tc.wrap(lhsFalse[i]), tc.wrap((byte)rhsFalse[i]))));
      assertFalse(tc.unwrapToBoolean(op.apply(tc.wrap(lhsFalse[i]), tc.wrap((byte)rhsFalse[i]))));
      assertFalse(tc.unwrapToBoolean(op.apply((Object)BigInteger.valueOf(lhsFalse[i]), (Object)tc.wrap((byte)rhsFalse[i]))));
      assertFalse(tc.unwrapToBoolean(op.apply((Object)BigDecimal.valueOf(lhsFalse[i]), (Object)tc.wrap((byte)rhsFalse[i]))));

      assertFalse(tc.unwrapToBoolean(op.apply(tc.wrap((byte)lhsFalse[i]), tc.wrap((char)rhsFalse[i]))));
      assertFalse(tc.unwrapToBoolean(op.apply(tc.wrap((char)lhsFalse[i]), tc.wrap((char)rhsFalse[i]))));
      assertFalse(tc.unwrapToBoolean(op.apply(tc.wrap((short)lhsFalse[i]), tc.wrap((char)rhsFalse[i]))));
      assertFalse(tc.unwrapToBoolean(op.apply(tc.wrap(lhsFalse[i]), tc.wrap((char)rhsFalse[i]))));
      assertFalse(tc.unwrapToBoolean(op.apply(tc.wrap(lhsFalse[i]), tc.wrap((char)rhsFalse[i]))));
      assertFalse(tc.unwrapToBoolean(op.apply(tc.wrap(lhsFalse[i]), tc.wrap((char)rhsFalse[i]))));
      assertFalse(tc.unwrapToBoolean(op.apply(tc.wrap(lhsFalse[i]), tc.wrap((char)rhsFalse[i]))));
      assertFalse(tc.unwrapToBoolean(op.apply((Object)BigInteger.valueOf(lhsFalse[i]), (Object)tc.wrap((char)rhsFalse[i]))));
      assertFalse(tc.unwrapToBoolean(op.apply((Object)BigDecimal.valueOf(lhsFalse[i]), (Object)tc.wrap((char)rhsFalse[i]))));

      assertFalse(tc.unwrapToBoolean(op.apply(tc.wrap((byte)lhsFalse[i]), tc.wrap((short)rhsFalse[i]))));
      assertFalse(tc.unwrapToBoolean(op.apply(tc.wrap((char)lhsFalse[i]), tc.wrap((short)rhsFalse[i]))));
      assertFalse(tc.unwrapToBoolean(op.apply(tc.wrap((short)lhsFalse[i]), tc.wrap((short)rhsFalse[i]))));
      assertFalse(tc.unwrapToBoolean(op.apply(tc.wrap(lhsFalse[i]), tc.wrap((short)rhsFalse[i]))));
      assertFalse(tc.unwrapToBoolean(op.apply(tc.wrap(lhsFalse[i]), tc.wrap((short)rhsFalse[i]))));
      assertFalse(tc.unwrapToBoolean(op.apply(tc.wrap(lhsFalse[i]), tc.wrap((short)rhsFalse[i]))));
      assertFalse(tc.unwrapToBoolean(op.apply(tc.wrap(lhsFalse[i]), tc.wrap((short)rhsFalse[i]))));
      assertFalse(tc.unwrapToBoolean(op.apply((Object)BigInteger.valueOf(lhsFalse[i]), (Object)tc.wrap((short)rhsFalse[i]))));
      assertFalse(tc.unwrapToBoolean(op.apply((Object)BigDecimal.valueOf(lhsFalse[i]), (Object)tc.wrap((short)rhsFalse[i]))));

      assertFalse(tc.unwrapToBoolean(op.apply(tc.wrap((byte)lhsFalse[i]), tc.wrap(rhsFalse[i]))));
      assertFalse(tc.unwrapToBoolean(op.apply(tc.wrap((char)lhsFalse[i]), tc.wrap(rhsFalse[i]))));
      assertFalse(tc.unwrapToBoolean(op.apply(tc.wrap((short)lhsFalse[i]), tc.wrap(rhsFalse[i]))));
      assertFalse(tc.unwrapToBoolean(op.apply(tc.wrap(lhsFalse[i]), tc.wrap(rhsFalse[i]))));
      assertFalse(tc.unwrapToBoolean(op.apply(tc.wrap(lhsFalse[i]), tc.wrap(rhsFalse[i]))));
      assertFalse(tc.unwrapToBoolean(op.apply(tc.wrap(lhsFalse[i]), tc.wrap(rhsFalse[i]))));
      assertFalse(tc.unwrapToBoolean(op.apply(tc.wrap(lhsFalse[i]), tc.wrap(rhsFalse[i]))));
      assertFalse(tc.unwrapToBoolean(op.apply((Object)BigInteger.valueOf(lhsFalse[i]), (Object)tc.wrap(rhsFalse[i]))));
      assertFalse(tc.unwrapToBoolean(op.apply((Object)BigDecimal.valueOf(lhsFalse[i]), (Object)tc.wrap(rhsFalse[i]))));

      assertFalse(tc.unwrapToBoolean(op.apply(tc.wrap((byte)lhsFalse[i]), tc.wrap(rhsFalse[i]))));
      assertFalse(tc.unwrapToBoolean(op.apply(tc.wrap((char)lhsFalse[i]), tc.wrap(rhsFalse[i]))));
      assertFalse(tc.unwrapToBoolean(op.apply(tc.wrap((short)lhsFalse[i]), tc.wrap(rhsFalse[i]))));
      assertFalse(tc.unwrapToBoolean(op.apply(tc.wrap(lhsFalse[i]), tc.wrap(rhsFalse[i]))));
      assertFalse(tc.unwrapToBoolean(op.apply(tc.wrap(lhsFalse[i]), tc.wrap(rhsFalse[i]))));
      assertFalse(tc.unwrapToBoolean(op.apply(tc.wrap(lhsFalse[i]), tc.wrap(rhsFalse[i]))));
      assertFalse(tc.unwrapToBoolean(op.apply(tc.wrap(lhsFalse[i]), tc.wrap(rhsFalse[i]))));
      assertFalse(tc.unwrapToBoolean(op.apply((Object)BigInteger.valueOf(lhsFalse[i]), (Object)tc.wrap(rhsFalse[i]))));
      assertFalse(tc.unwrapToBoolean(op.apply((Object)BigDecimal.valueOf(lhsFalse[i]), (Object)tc.wrap(rhsFalse[i]))));

      assertFalse(tc.unwrapToBoolean(op.apply(tc.wrap((byte)lhsFalse[i]), tc.wrap(rhsFalse[i]))));
      assertFalse(tc.unwrapToBoolean(op.apply(tc.wrap((char)lhsFalse[i]), tc.wrap(rhsFalse[i]))));
      assertFalse(tc.unwrapToBoolean(op.apply(tc.wrap((short)lhsFalse[i]), tc.wrap(rhsFalse[i]))));
      assertFalse(tc.unwrapToBoolean(op.apply(tc.wrap(lhsFalse[i]), tc.wrap(rhsFalse[i]))));
      assertFalse(tc.unwrapToBoolean(op.apply(tc.wrap(lhsFalse[i]), tc.wrap(rhsFalse[i]))));
      assertFalse(tc.unwrapToBoolean(op.apply(tc.wrap(lhsFalse[i]), tc.wrap(rhsFalse[i]))));
      assertFalse(tc.unwrapToBoolean(op.apply(tc.wrap(lhsFalse[i]), tc.wrap(rhsFalse[i]))));
      assertFalse(tc.unwrapToBoolean(op.apply((Object)BigInteger.valueOf(lhsFalse[i]), (Object)tc.wrap(rhsFalse[i]))));
      assertFalse(tc.unwrapToBoolean(op.apply((Object)BigDecimal.valueOf(lhsFalse[i]), (Object)tc.wrap(rhsFalse[i]))));

      assertFalse(tc.unwrapToBoolean(op.apply(tc.wrap((byte)lhsFalse[i]), tc.wrap(rhsFalse[i]))));
      assertFalse(tc.unwrapToBoolean(op.apply(tc.wrap((char)lhsFalse[i]), tc.wrap(rhsFalse[i]))));
      assertFalse(tc.unwrapToBoolean(op.apply(tc.wrap((short)lhsFalse[i]), tc.wrap(rhsFalse[i]))));
      assertFalse(tc.unwrapToBoolean(op.apply(tc.wrap(lhsFalse[i]), tc.wrap(rhsFalse[i]))));
      assertFalse(tc.unwrapToBoolean(op.apply(tc.wrap(lhsFalse[i]), tc.wrap(rhsFalse[i]))));
      assertFalse(tc.unwrapToBoolean(op.apply(tc.wrap(lhsFalse[i]), tc.wrap(rhsFalse[i]))));
      assertFalse(tc.unwrapToBoolean(op.apply(tc.wrap(lhsFalse[i]), tc.wrap(rhsFalse[i]))));
      assertFalse(tc.unwrapToBoolean(op.apply((Object)BigInteger.valueOf(lhsFalse[i]), (Object)tc.wrap(rhsFalse[i]))));
      assertFalse(tc.unwrapToBoolean(op.apply((Object)BigDecimal.valueOf(lhsFalse[i]), (Object)tc.wrap(rhsFalse[i]))));

      assertFalse(tc.unwrapToBoolean(op.apply((Object)tc.wrap((byte)lhsFalse[i]), (Object)BigInteger.valueOf(rhsFalse[i]))));
      assertFalse(tc.unwrapToBoolean(op.apply((Object)tc.wrap((char)lhsFalse[i]), (Object)BigInteger.valueOf(rhsFalse[i]))));
      assertFalse(tc.unwrapToBoolean(op.apply((Object)tc.wrap((short)lhsFalse[i]), (Object)BigInteger.valueOf(rhsFalse[i]))));
      assertFalse(tc.unwrapToBoolean(op.apply((Object)tc.wrap(lhsFalse[i]), (Object)BigInteger.valueOf(rhsFalse[i]))));
      assertFalse(tc.unwrapToBoolean(op.apply((Object)tc.wrap(lhsFalse[i]), (Object)BigInteger.valueOf(rhsFalse[i]))));
      assertFalse(tc.unwrapToBoolean(op.apply((Object)tc.wrap(lhsFalse[i]), (Object)BigInteger.valueOf(rhsFalse[i]))));
      assertFalse(tc.unwrapToBoolean(op.apply((Object)tc.wrap(lhsFalse[i]), (Object)BigInteger.valueOf(rhsFalse[i]))));
      assertFalse(tc.unwrapToBoolean(op.apply((Object)BigInteger.valueOf(lhsFalse[i]), (Object)BigInteger.valueOf(rhsFalse[i]))));
      assertFalse(tc.unwrapToBoolean(op.apply((Object)BigDecimal.valueOf(lhsFalse[i]), (Object)BigInteger.valueOf(rhsFalse[i]))));

      assertFalse(tc.unwrapToBoolean(op.apply((Object)tc.wrap((byte)lhsFalse[i]), (Object)BigDecimal.valueOf(rhsFalse[i]))));
      assertFalse(tc.unwrapToBoolean(op.apply((Object)tc.wrap((char)lhsFalse[i]), (Object)BigDecimal.valueOf(rhsFalse[i]))));
      assertFalse(tc.unwrapToBoolean(op.apply((Object)tc.wrap((short)lhsFalse[i]), (Object)BigDecimal.valueOf(rhsFalse[i]))));
      assertFalse(tc.unwrapToBoolean(op.apply((Object)tc.wrap(lhsFalse[i]), (Object)BigDecimal.valueOf(rhsFalse[i]))));
      assertFalse(tc.unwrapToBoolean(op.apply((Object)tc.wrap(lhsFalse[i]), (Object)BigDecimal.valueOf(rhsFalse[i]))));
      assertFalse(tc.unwrapToBoolean(op.apply((Object)tc.wrap(lhsFalse[i]), (Object)BigDecimal.valueOf(rhsFalse[i]))));
      assertFalse(tc.unwrapToBoolean(op.apply((Object)tc.wrap(lhsFalse[i]), (Object)BigDecimal.valueOf(rhsFalse[i]))));
      assertFalse(tc.unwrapToBoolean(op.apply((Object)BigInteger.valueOf(lhsFalse[i]), (Object)BigDecimal.valueOf(rhsFalse[i]))));
      assertFalse(tc.unwrapToBoolean(op.apply((Object)BigDecimal.valueOf(lhsFalse[i]), (Object)BigDecimal.valueOf(rhsFalse[i]))));

      assertFalse(op.applyBoolean(tc.wrap((byte)lhsFalse[i]), tc.wrap((byte)rhsFalse[i])));
      assertFalse(op.applyBoolean(tc.wrap((char)lhsFalse[i]), tc.wrap((byte)rhsFalse[i])));
      assertFalse(op.applyBoolean(tc.wrap((short)lhsFalse[i]), tc.wrap((byte)rhsFalse[i])));
      assertFalse(op.applyBoolean(tc.wrap(lhsFalse[i]), tc.wrap((byte)rhsFalse[i])));
      assertFalse(op.applyBoolean(tc.wrap(lhsFalse[i]), tc.wrap((byte)rhsFalse[i])));
      assertFalse(op.applyBoolean(tc.wrap(lhsFalse[i]), tc.wrap((byte)rhsFalse[i])));
      assertFalse(op.applyBoolean(tc.wrap(lhsFalse[i]), tc.wrap((byte)rhsFalse[i])));
      assertFalse(op.applyBoolean((Object)BigInteger.valueOf(lhsFalse[i]), (Object)tc.wrap((byte)rhsFalse[i])));
      assertFalse(op.applyBoolean((Object)BigDecimal.valueOf(lhsFalse[i]), (Object)tc.wrap((byte)rhsFalse[i])));

      assertFalse(op.applyBoolean(tc.wrap((byte)lhsFalse[i]), tc.wrap((char)rhsFalse[i])));
      assertFalse(op.applyBoolean(tc.wrap((char)lhsFalse[i]), tc.wrap((char)rhsFalse[i])));
      assertFalse(op.applyBoolean(tc.wrap((short)lhsFalse[i]), tc.wrap((char)rhsFalse[i])));
      assertFalse(op.applyBoolean(tc.wrap(lhsFalse[i]), tc.wrap((char)rhsFalse[i])));
      assertFalse(op.applyBoolean(tc.wrap(lhsFalse[i]), tc.wrap((char)rhsFalse[i])));
      assertFalse(op.applyBoolean(tc.wrap(lhsFalse[i]), tc.wrap((char)rhsFalse[i])));
      assertFalse(op.applyBoolean(tc.wrap(lhsFalse[i]), tc.wrap((char)rhsFalse[i])));
      assertFalse(op.applyBoolean((Object)BigInteger.valueOf(lhsFalse[i]), (Object)tc.wrap((char)rhsFalse[i])));
      assertFalse(op.applyBoolean((Object)BigDecimal.valueOf(lhsFalse[i]), (Object)tc.wrap((char)rhsFalse[i])));

      assertFalse(op.applyBoolean(tc.wrap((byte)lhsFalse[i]), tc.wrap((short)rhsFalse[i])));
      assertFalse(op.applyBoolean(tc.wrap((char)lhsFalse[i]), tc.wrap((short)rhsFalse[i])));
      assertFalse(op.applyBoolean(tc.wrap((short)lhsFalse[i]), tc.wrap((short)rhsFalse[i])));
      assertFalse(op.applyBoolean(tc.wrap(lhsFalse[i]), tc.wrap((short)rhsFalse[i])));
      assertFalse(op.applyBoolean(tc.wrap(lhsFalse[i]), tc.wrap((short)rhsFalse[i])));
      assertFalse(op.applyBoolean(tc.wrap(lhsFalse[i]), tc.wrap((short)rhsFalse[i])));
      assertFalse(op.applyBoolean(tc.wrap(lhsFalse[i]), tc.wrap((short)rhsFalse[i])));
      assertFalse(op.applyBoolean((Object)BigInteger.valueOf(lhsFalse[i]), (Object)tc.wrap((short)rhsFalse[i])));
      assertFalse(op.applyBoolean((Object)BigDecimal.valueOf(lhsFalse[i]), (Object)tc.wrap((short)rhsFalse[i])));

      assertFalse(op.applyBoolean(tc.wrap((byte)lhsFalse[i]), tc.wrap(rhsFalse[i])));
      assertFalse(op.applyBoolean(tc.wrap((char)lhsFalse[i]), tc.wrap(rhsFalse[i])));
      assertFalse(op.applyBoolean(tc.wrap((short)lhsFalse[i]), tc.wrap(rhsFalse[i])));
      assertFalse(op.applyBoolean(tc.wrap(lhsFalse[i]), tc.wrap(rhsFalse[i])));
      assertFalse(op.applyBoolean(tc.wrap(lhsFalse[i]), tc.wrap(rhsFalse[i])));
      assertFalse(op.applyBoolean(tc.wrap(lhsFalse[i]), tc.wrap(rhsFalse[i])));
      assertFalse(op.applyBoolean(tc.wrap(lhsFalse[i]), tc.wrap(rhsFalse[i])));
      assertFalse(op.applyBoolean((Object)BigInteger.valueOf(lhsFalse[i]), (Object)tc.wrap(rhsFalse[i])));
      assertFalse(op.applyBoolean((Object)BigDecimal.valueOf(lhsFalse[i]), (Object)tc.wrap(rhsFalse[i])));

      assertFalse(op.applyBoolean(tc.wrap((byte)lhsFalse[i]), tc.wrap(rhsFalse[i])));
      assertFalse(op.applyBoolean(tc.wrap((char)lhsFalse[i]), tc.wrap(rhsFalse[i])));
      assertFalse(op.applyBoolean(tc.wrap((short)lhsFalse[i]), tc.wrap(rhsFalse[i])));
      assertFalse(op.applyBoolean(tc.wrap(lhsFalse[i]), tc.wrap(rhsFalse[i])));
      assertFalse(op.applyBoolean(tc.wrap(lhsFalse[i]), tc.wrap(rhsFalse[i])));
      assertFalse(op.applyBoolean(tc.wrap(lhsFalse[i]), tc.wrap(rhsFalse[i])));
      assertFalse(op.applyBoolean(tc.wrap(lhsFalse[i]), tc.wrap(rhsFalse[i])));
      assertFalse(op.applyBoolean((Object)BigInteger.valueOf(lhsFalse[i]), (Object)tc.wrap(rhsFalse[i])));
      assertFalse(op.applyBoolean((Object)BigDecimal.valueOf(lhsFalse[i]), (Object)tc.wrap(rhsFalse[i])));

      assertFalse(op.applyBoolean(tc.wrap((byte)lhsFalse[i]), tc.wrap(rhsFalse[i])));
      assertFalse(op.applyBoolean(tc.wrap((char)lhsFalse[i]), tc.wrap(rhsFalse[i])));
      assertFalse(op.applyBoolean(tc.wrap((short)lhsFalse[i]), tc.wrap(rhsFalse[i])));
      assertFalse(op.applyBoolean(tc.wrap(lhsFalse[i]), tc.wrap(rhsFalse[i])));
      assertFalse(op.applyBoolean(tc.wrap(lhsFalse[i]), tc.wrap(rhsFalse[i])));
      assertFalse(op.applyBoolean(tc.wrap(lhsFalse[i]), tc.wrap(rhsFalse[i])));
      assertFalse(op.applyBoolean(tc.wrap(lhsFalse[i]), tc.wrap(rhsFalse[i])));
      assertFalse(op.applyBoolean((Object)BigInteger.valueOf(lhsFalse[i]), (Object)tc.wrap(rhsFalse[i])));
      assertFalse(op.applyBoolean((Object)BigDecimal.valueOf(lhsFalse[i]), (Object)tc.wrap(rhsFalse[i])));

      assertFalse(op.applyBoolean(tc.wrap((byte)lhsFalse[i]), tc.wrap(rhsFalse[i])));
      assertFalse(op.applyBoolean(tc.wrap((char)lhsFalse[i]), tc.wrap(rhsFalse[i])));
      assertFalse(op.applyBoolean(tc.wrap((short)lhsFalse[i]), tc.wrap(rhsFalse[i])));
      assertFalse(op.applyBoolean(tc.wrap(lhsFalse[i]), tc.wrap(rhsFalse[i])));
      assertFalse(op.applyBoolean(tc.wrap(lhsFalse[i]), tc.wrap(rhsFalse[i])));
      assertFalse(op.applyBoolean(tc.wrap(lhsFalse[i]), tc.wrap(rhsFalse[i])));
      assertFalse(op.applyBoolean(tc.wrap(lhsFalse[i]), tc.wrap(rhsFalse[i])));
      assertFalse(op.applyBoolean((Object)BigInteger.valueOf(lhsFalse[i]), (Object)tc.wrap(rhsFalse[i])));
      assertFalse(op.applyBoolean((Object)BigDecimal.valueOf(lhsFalse[i]), (Object)tc.wrap(rhsFalse[i])));

      assertFalse(op.applyBoolean((Object)tc.wrap((byte)lhsFalse[i]), (Object)BigInteger.valueOf(rhsFalse[i])));
      assertFalse(op.applyBoolean((Object)tc.wrap((char)lhsFalse[i]), (Object)BigInteger.valueOf(rhsFalse[i])));
      assertFalse(op.applyBoolean((Object)tc.wrap((short)lhsFalse[i]), (Object)BigInteger.valueOf(rhsFalse[i])));
      assertFalse(op.applyBoolean((Object)tc.wrap(lhsFalse[i]), (Object)BigInteger.valueOf(rhsFalse[i])));
      assertFalse(op.applyBoolean((Object)tc.wrap(lhsFalse[i]), (Object)BigInteger.valueOf(rhsFalse[i])));
      assertFalse(op.applyBoolean((Object)tc.wrap(lhsFalse[i]), (Object)BigInteger.valueOf(rhsFalse[i])));
      assertFalse(op.applyBoolean((Object)tc.wrap(lhsFalse[i]), (Object)BigInteger.valueOf(rhsFalse[i])));
      assertFalse(op.applyBoolean((Object)BigInteger.valueOf(lhsFalse[i]), (Object)BigInteger.valueOf(rhsFalse[i])));
      assertFalse(op.applyBoolean((Object)BigDecimal.valueOf(lhsFalse[i]), (Object)BigInteger.valueOf(rhsFalse[i])));

      assertFalse(op.applyBoolean((Object)tc.wrap((byte)lhsFalse[i]), (Object)BigDecimal.valueOf(rhsFalse[i])));
      assertFalse(op.applyBoolean((Object)tc.wrap((char)lhsFalse[i]), (Object)BigDecimal.valueOf(rhsFalse[i])));
      assertFalse(op.applyBoolean((Object)tc.wrap((short)lhsFalse[i]), (Object)BigDecimal.valueOf(rhsFalse[i])));
      assertFalse(op.applyBoolean((Object)tc.wrap(lhsFalse[i]), (Object)BigDecimal.valueOf(rhsFalse[i])));
      assertFalse(op.applyBoolean((Object)tc.wrap(lhsFalse[i]), (Object)BigDecimal.valueOf(rhsFalse[i])));
      assertFalse(op.applyBoolean((Object)tc.wrap(lhsFalse[i]), (Object)BigDecimal.valueOf(rhsFalse[i])));
      assertFalse(op.applyBoolean((Object)tc.wrap(lhsFalse[i]), (Object)BigDecimal.valueOf(rhsFalse[i])));
      assertFalse(op.applyBoolean((Object)BigInteger.valueOf(lhsFalse[i]), (Object)BigDecimal.valueOf(rhsFalse[i])));
      assertFalse(op.applyBoolean((Object)BigDecimal.valueOf(lhsFalse[i]), (Object)BigDecimal.valueOf(rhsFalse[i])));

      assertFalse(op.applyBoolean(tc.wrap((byte)lhsFalse[i]), byteMetaClass, tc.wrap((byte)rhsFalse[i])));
      assertFalse(op.applyBoolean(tc.wrap((char)lhsFalse[i]), byteMetaClass, tc.wrap((byte)rhsFalse[i])));
      assertFalse(op.applyBoolean(tc.wrap((short)lhsFalse[i]), byteMetaClass, tc.wrap((byte)rhsFalse[i])));
      assertFalse(op.applyBoolean(tc.wrap(lhsFalse[i]), byteMetaClass, tc.wrap((byte)rhsFalse[i])));
      assertFalse(op.applyBoolean(tc.wrap(lhsFalse[i]), byteMetaClass, tc.wrap((byte)rhsFalse[i])));
      assertFalse(op.applyBoolean(tc.wrap(lhsFalse[i]), byteMetaClass, tc.wrap((byte)rhsFalse[i])));
      assertFalse(op.applyBoolean(tc.wrap(lhsFalse[i]), byteMetaClass, tc.wrap((byte)rhsFalse[i])));
      assertFalse(op.applyBoolean((Object)BigInteger.valueOf(lhsFalse[i]), byteMetaClass, (Object)tc.wrap((byte)rhsFalse[i])));
      assertFalse(op.applyBoolean((Object)BigDecimal.valueOf(lhsFalse[i]), byteMetaClass, (Object)tc.wrap((byte)rhsFalse[i])));

      assertFalse(op.applyBoolean(tc.wrap((byte)lhsFalse[i]), charMetaClass, tc.wrap((char)rhsFalse[i])));
      assertFalse(op.applyBoolean(tc.wrap((char)lhsFalse[i]), charMetaClass, tc.wrap((char)rhsFalse[i])));
      assertFalse(op.applyBoolean(tc.wrap((short)lhsFalse[i]), charMetaClass, tc.wrap((char)rhsFalse[i])));
      assertFalse(op.applyBoolean(tc.wrap(lhsFalse[i]), charMetaClass, tc.wrap((char)rhsFalse[i])));
      assertFalse(op.applyBoolean(tc.wrap(lhsFalse[i]), charMetaClass, tc.wrap((char)rhsFalse[i])));
      assertFalse(op.applyBoolean(tc.wrap(lhsFalse[i]), charMetaClass, tc.wrap((char)rhsFalse[i])));
      assertFalse(op.applyBoolean(tc.wrap(lhsFalse[i]), charMetaClass, tc.wrap((char)rhsFalse[i])));
      assertFalse(op.applyBoolean((Object)BigInteger.valueOf(lhsFalse[i]), charMetaClass, (Object)tc.wrap((char)rhsFalse[i])));
      assertFalse(op.applyBoolean((Object)BigDecimal.valueOf(lhsFalse[i]), charMetaClass, (Object)tc.wrap((char)rhsFalse[i])));

      assertFalse(op.applyBoolean(tc.wrap((byte)lhsFalse[i]), shortMetaClass, tc.wrap((short)rhsFalse[i])));
      assertFalse(op.applyBoolean(tc.wrap((char)lhsFalse[i]), shortMetaClass, tc.wrap((short)rhsFalse[i])));
      assertFalse(op.applyBoolean(tc.wrap((short)lhsFalse[i]), shortMetaClass, tc.wrap((short)rhsFalse[i])));
      assertFalse(op.applyBoolean(tc.wrap(lhsFalse[i]), shortMetaClass, tc.wrap((short)rhsFalse[i])));
      assertFalse(op.applyBoolean(tc.wrap(lhsFalse[i]), shortMetaClass, tc.wrap((short)rhsFalse[i])));
      assertFalse(op.applyBoolean(tc.wrap(lhsFalse[i]), shortMetaClass, tc.wrap((short)rhsFalse[i])));
      assertFalse(op.applyBoolean(tc.wrap(lhsFalse[i]), shortMetaClass, tc.wrap((short)rhsFalse[i])));
      assertFalse(op.applyBoolean((Object)BigInteger.valueOf(lhsFalse[i]), shortMetaClass, (Object)tc.wrap((short)rhsFalse[i])));
      assertFalse(op.applyBoolean((Object)BigDecimal.valueOf(lhsFalse[i]), shortMetaClass, (Object)tc.wrap((short)rhsFalse[i])));

      assertFalse(op.applyBoolean(tc.wrap((byte)lhsFalse[i]), intMetaClass, tc.wrap(rhsFalse[i])));
      assertFalse(op.applyBoolean(tc.wrap((char)lhsFalse[i]), intMetaClass, tc.wrap(rhsFalse[i])));
      assertFalse(op.applyBoolean(tc.wrap((short)lhsFalse[i]), intMetaClass, tc.wrap(rhsFalse[i])));
      assertFalse(op.applyBoolean(tc.wrap(lhsFalse[i]), intMetaClass, tc.wrap(rhsFalse[i])));
      assertFalse(op.applyBoolean(tc.wrap(lhsFalse[i]), intMetaClass, tc.wrap(rhsFalse[i])));
      assertFalse(op.applyBoolean(tc.wrap(lhsFalse[i]), intMetaClass, tc.wrap(rhsFalse[i])));
      assertFalse(op.applyBoolean(tc.wrap(lhsFalse[i]), intMetaClass, tc.wrap(rhsFalse[i])));
      assertFalse(op.applyBoolean((Object)BigInteger.valueOf(lhsFalse[i]), intMetaClass, (Object)tc.wrap(rhsFalse[i])));
      assertFalse(op.applyBoolean((Object)BigDecimal.valueOf(lhsFalse[i]), intMetaClass, (Object)tc.wrap(rhsFalse[i])));

      assertFalse(op.applyBoolean(tc.wrap((byte)lhsFalse[i]), longMetaClass, tc.wrap(rhsFalse[i])));
      assertFalse(op.applyBoolean(tc.wrap((char)lhsFalse[i]), longMetaClass, tc.wrap(rhsFalse[i])));
      assertFalse(op.applyBoolean(tc.wrap((short)lhsFalse[i]), longMetaClass, tc.wrap(rhsFalse[i])));
      assertFalse(op.applyBoolean(tc.wrap(lhsFalse[i]), longMetaClass, tc.wrap(rhsFalse[i])));
      assertFalse(op.applyBoolean(tc.wrap(lhsFalse[i]), longMetaClass, tc.wrap(rhsFalse[i])));
      assertFalse(op.applyBoolean(tc.wrap(lhsFalse[i]), longMetaClass, tc.wrap(rhsFalse[i])));
      assertFalse(op.applyBoolean(tc.wrap(lhsFalse[i]), longMetaClass, tc.wrap(rhsFalse[i])));
      assertFalse(op.applyBoolean((Object)BigInteger.valueOf(lhsFalse[i]), longMetaClass, (Object)tc.wrap(rhsFalse[i])));
      assertFalse(op.applyBoolean((Object)BigDecimal.valueOf(lhsFalse[i]), longMetaClass, (Object)tc.wrap(rhsFalse[i])));

      assertFalse(op.applyBoolean(tc.wrap((byte)lhsFalse[i]), floatMetaClass, tc.wrap(rhsFalse[i])));
      assertFalse(op.applyBoolean(tc.wrap((char)lhsFalse[i]), floatMetaClass, tc.wrap(rhsFalse[i])));
      assertFalse(op.applyBoolean(tc.wrap((short)lhsFalse[i]), floatMetaClass, tc.wrap(rhsFalse[i])));
      assertFalse(op.applyBoolean(tc.wrap(lhsFalse[i]), floatMetaClass, tc.wrap(rhsFalse[i])));
      assertFalse(op.applyBoolean(tc.wrap(lhsFalse[i]), floatMetaClass, tc.wrap(rhsFalse[i])));
      assertFalse(op.applyBoolean(tc.wrap(lhsFalse[i]), floatMetaClass, tc.wrap(rhsFalse[i])));
      assertFalse(op.applyBoolean(tc.wrap(lhsFalse[i]), floatMetaClass, tc.wrap(rhsFalse[i])));
      assertFalse(op.applyBoolean((Object)BigInteger.valueOf(lhsFalse[i]), floatMetaClass, (Object)tc.wrap(rhsFalse[i])));
      assertFalse(op.applyBoolean((Object)BigDecimal.valueOf(lhsFalse[i]), floatMetaClass, (Object)tc.wrap(rhsFalse[i])));

      assertFalse(op.applyBoolean(tc.wrap((byte)lhsFalse[i]), doubleMetaClass, tc.wrap(rhsFalse[i])));
      assertFalse(op.applyBoolean(tc.wrap((char)lhsFalse[i]), doubleMetaClass, tc.wrap(rhsFalse[i])));
      assertFalse(op.applyBoolean(tc.wrap((short)lhsFalse[i]), doubleMetaClass, tc.wrap(rhsFalse[i])));
      assertFalse(op.applyBoolean(tc.wrap(lhsFalse[i]), doubleMetaClass, tc.wrap(rhsFalse[i])));
      assertFalse(op.applyBoolean(tc.wrap(lhsFalse[i]), doubleMetaClass, tc.wrap(rhsFalse[i])));
      assertFalse(op.applyBoolean(tc.wrap(lhsFalse[i]), doubleMetaClass, tc.wrap(rhsFalse[i])));
      assertFalse(op.applyBoolean((Object)tc.wrap((double)lhsFalse[i]), doubleMetaClass, (Object)tc.wrap((double)rhsFalse[i])));
      assertFalse(op.applyBoolean((Object)BigInteger.valueOf(lhsFalse[i]), doubleMetaClass, (Object)tc.wrap((double)rhsFalse[i])));
      assertFalse(op.applyBoolean((Object)BigDecimal.valueOf(lhsFalse[i]), doubleMetaClass, (Object)tc.wrap((double)rhsFalse[i])));

      assertFalse(op.applyBoolean((Object)tc.wrap((byte)lhsFalse[i]), bigIntegerMetaClass, (Object)BigInteger.valueOf(rhsFalse[i])));
      assertFalse(op.applyBoolean((Object)tc.wrap((char)lhsFalse[i]), bigIntegerMetaClass, (Object)BigInteger.valueOf(rhsFalse[i])));
      assertFalse(op.applyBoolean((Object)tc.wrap((short)lhsFalse[i]), bigIntegerMetaClass, (Object)BigInteger.valueOf(rhsFalse[i])));
      assertFalse(op.applyBoolean((Object)tc.wrap((int)lhsFalse[i]), bigIntegerMetaClass, (Object)BigInteger.valueOf(rhsFalse[i])));
      assertFalse(op.applyBoolean((Object)tc.wrap((long)lhsFalse[i]), bigIntegerMetaClass, (Object)BigInteger.valueOf(rhsFalse[i])));
      assertFalse(op.applyBoolean((Object)tc.wrap((float)lhsFalse[i]), bigIntegerMetaClass, (Object)BigInteger.valueOf(rhsFalse[i])));
      assertFalse(op.applyBoolean((Object)tc.wrap((double)lhsFalse[i]), bigIntegerMetaClass, (Object)BigInteger.valueOf(rhsFalse[i])));
      assertFalse(op.applyBoolean((Object)BigInteger.valueOf(lhsFalse[i]), bigIntegerMetaClass, (Object)BigInteger.valueOf(rhsFalse[i])));
      assertFalse(op.applyBoolean((Object)BigDecimal.valueOf(lhsFalse[i]), bigIntegerMetaClass, (Object)BigInteger.valueOf(rhsFalse[i])));

      assertFalse(op.applyBoolean((Object)tc.wrap((byte)lhsFalse[i]), bigDecimalMetaClass, (Object)BigDecimal.valueOf(rhsFalse[i])));
      assertFalse(op.applyBoolean((Object)tc.wrap((char)lhsFalse[i]), bigDecimalMetaClass, (Object)BigDecimal.valueOf(rhsFalse[i])));
      assertFalse(op.applyBoolean((Object)tc.wrap((short)lhsFalse[i]), bigDecimalMetaClass, (Object)BigDecimal.valueOf(rhsFalse[i])));
      assertFalse(op.applyBoolean((Object)tc.wrap((int)lhsFalse[i]), bigDecimalMetaClass, (Object)BigDecimal.valueOf(rhsFalse[i])));
      assertFalse(op.applyBoolean((Object)tc.wrap((long)lhsFalse[i]), bigDecimalMetaClass, (Object)BigDecimal.valueOf(rhsFalse[i])));
      assertFalse(op.applyBoolean((Object)tc.wrap((float)lhsFalse[i]), bigDecimalMetaClass, (Object)BigDecimal.valueOf(rhsFalse[i])));
      assertFalse(op.applyBoolean((Object)tc.wrap((double)lhsFalse[i]), bigDecimalMetaClass, (Object)BigDecimal.valueOf(rhsFalse[i])));
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
