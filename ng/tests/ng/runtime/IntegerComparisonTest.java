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

      assertTrue(tc.unwrapToInt(op.apply((byte)lhsEqual[i], tc.wrap((byte)rhsEqual[i]))) == 0);
      assertTrue(tc.unwrapToInt(op.apply((char)lhsEqual[i], tc.wrap((byte)rhsEqual[i]))) == 0);
      assertTrue(tc.unwrapToInt(op.apply((short)lhsEqual[i], tc.wrap((byte)rhsEqual[i]))) == 0);
      assertTrue(tc.unwrapToInt(op.apply(lhsEqual[i], tc.wrap((byte)rhsEqual[i]))) == 0);
      assertTrue(tc.unwrapToInt(op.apply((long)lhsEqual[i], tc.wrap((byte)rhsEqual[i]))) == 0);
      assertTrue(tc.unwrapToInt(op.apply((float)lhsEqual[i], tc.wrap((byte)rhsEqual[i]))) == 0);
      assertTrue(tc.unwrapToInt(op.apply((double)lhsEqual[i], tc.wrap((byte)rhsEqual[i]))) == 0);
      assertTrue(tc.unwrapToInt(op.apply(BigInteger.valueOf(lhsEqual[i]), tc.wrap((byte)rhsEqual[i]))) == 0);
      assertTrue(tc.unwrapToInt(op.apply(BigDecimal.valueOf(lhsEqual[i]), tc.wrap((byte)rhsEqual[i]))) == 0);

      assertTrue(tc.unwrapToInt(op.apply((byte)lhsEqual[i], tc.wrap((char)rhsEqual[i]))) == 0);
      assertTrue(tc.unwrapToInt(op.apply((char)lhsEqual[i], tc.wrap((char)rhsEqual[i]))) == 0);
      assertTrue(tc.unwrapToInt(op.apply((short)lhsEqual[i], tc.wrap((char)rhsEqual[i]))) == 0);
      assertTrue(tc.unwrapToInt(op.apply(lhsEqual[i], tc.wrap((char)rhsEqual[i]))) == 0);
      assertTrue(tc.unwrapToInt(op.apply((long)lhsEqual[i], tc.wrap((char)rhsEqual[i]))) == 0);
      assertTrue(tc.unwrapToInt(op.apply((float)lhsEqual[i], tc.wrap((char)rhsEqual[i]))) == 0);
      assertTrue(tc.unwrapToInt(op.apply((double)lhsEqual[i], tc.wrap((char)rhsEqual[i]))) == 0);
      assertTrue(tc.unwrapToInt(op.apply(BigInteger.valueOf(lhsEqual[i]), tc.wrap((char)rhsEqual[i]))) == 0);
      assertTrue(tc.unwrapToInt(op.apply(BigDecimal.valueOf(lhsEqual[i]), tc.wrap((char)rhsEqual[i]))) == 0);

      assertTrue(tc.unwrapToInt(op.apply((byte)lhsEqual[i], tc.wrap((short)rhsEqual[i]))) == 0);
      assertTrue(tc.unwrapToInt(op.apply((char)lhsEqual[i], tc.wrap((short)rhsEqual[i]))) == 0);
      assertTrue(tc.unwrapToInt(op.apply((short)lhsEqual[i], tc.wrap((short)rhsEqual[i]))) == 0);
      assertTrue(tc.unwrapToInt(op.apply(lhsEqual[i], tc.wrap((short)rhsEqual[i]))) == 0);
      assertTrue(tc.unwrapToInt(op.apply((long)lhsEqual[i], tc.wrap((short)rhsEqual[i]))) == 0);
      assertTrue(tc.unwrapToInt(op.apply((float)lhsEqual[i], tc.wrap((short)rhsEqual[i]))) == 0);
      assertTrue(tc.unwrapToInt(op.apply((double)lhsEqual[i], tc.wrap((short)rhsEqual[i]))) == 0);
      assertTrue(tc.unwrapToInt(op.apply(BigInteger.valueOf(lhsEqual[i]), tc.wrap((short)rhsEqual[i]))) == 0);
      assertTrue(tc.unwrapToInt(op.apply(BigDecimal.valueOf(lhsEqual[i]), tc.wrap((short)rhsEqual[i]))) == 0);

      assertTrue(tc.unwrapToInt(op.apply((byte)lhsEqual[i], tc.wrap((int)rhsEqual[i]))) == 0);
      assertTrue(tc.unwrapToInt(op.apply((char)lhsEqual[i], tc.wrap((int)rhsEqual[i]))) == 0);
      assertTrue(tc.unwrapToInt(op.apply((short)lhsEqual[i], tc.wrap((int)rhsEqual[i]))) == 0);
      assertTrue(tc.unwrapToInt(op.apply(lhsEqual[i], tc.wrap((int)rhsEqual[i]))) == 0);
      assertTrue(tc.unwrapToInt(op.apply((long)lhsEqual[i], tc.wrap((int)rhsEqual[i]))) == 0);
      assertTrue(tc.unwrapToInt(op.apply((float)lhsEqual[i], tc.wrap((int)rhsEqual[i]))) == 0);
      assertTrue(tc.unwrapToInt(op.apply((double)lhsEqual[i], tc.wrap((int)rhsEqual[i]))) == 0);
      assertTrue(tc.unwrapToInt(op.apply(BigInteger.valueOf(lhsEqual[i]), tc.wrap((int)rhsEqual[i]))) == 0);
      assertTrue(tc.unwrapToInt(op.apply(BigDecimal.valueOf(lhsEqual[i]), tc.wrap((int)rhsEqual[i]))) == 0);

      assertTrue(tc.unwrapToInt(op.apply((byte)lhsEqual[i], tc.wrap((long)rhsEqual[i]))) == 0);
      assertTrue(tc.unwrapToInt(op.apply((char)lhsEqual[i], tc.wrap((long)rhsEqual[i]))) == 0);
      assertTrue(tc.unwrapToInt(op.apply((short)lhsEqual[i], tc.wrap((long)rhsEqual[i]))) == 0);
      assertTrue(tc.unwrapToInt(op.apply(lhsEqual[i], tc.wrap((long)rhsEqual[i]))) == 0);
      assertTrue(tc.unwrapToInt(op.apply((long)lhsEqual[i], tc.wrap((long)rhsEqual[i]))) == 0);
      assertTrue(tc.unwrapToInt(op.apply((float)lhsEqual[i], tc.wrap((long)rhsEqual[i]))) == 0);
      assertTrue(tc.unwrapToInt(op.apply((double)lhsEqual[i], tc.wrap((long)rhsEqual[i]))) == 0);
      assertTrue(tc.unwrapToInt(op.apply(BigInteger.valueOf(lhsEqual[i]), tc.wrap((long)rhsEqual[i]))) == 0);
      assertTrue(tc.unwrapToInt(op.apply(BigDecimal.valueOf(lhsEqual[i]), tc.wrap((long)rhsEqual[i]))) == 0);

      assertTrue(tc.unwrapToInt(op.apply((byte)lhsEqual[i], tc.wrap((float)rhsEqual[i]))) == 0);
      assertTrue(tc.unwrapToInt(op.apply((char)lhsEqual[i], tc.wrap((float)rhsEqual[i]))) == 0);
      assertTrue(tc.unwrapToInt(op.apply((short)lhsEqual[i], tc.wrap((float)rhsEqual[i]))) == 0);
      assertTrue(tc.unwrapToInt(op.apply(lhsEqual[i], tc.wrap((float)rhsEqual[i]))) == 0);
      assertTrue(tc.unwrapToInt(op.apply((long)lhsEqual[i], tc.wrap((float)rhsEqual[i]))) == 0);
      assertTrue(tc.unwrapToInt(op.apply((float)lhsEqual[i], tc.wrap((float)rhsEqual[i]))) == 0);
      assertTrue(tc.unwrapToInt(op.apply((double)lhsEqual[i], tc.wrap((float)rhsEqual[i]))) == 0);
      assertTrue(tc.unwrapToInt(op.apply(BigInteger.valueOf(lhsEqual[i]), tc.wrap((float)rhsEqual[i]))) == 0);
      assertTrue(tc.unwrapToInt(op.apply(BigDecimal.valueOf(lhsEqual[i]), tc.wrap((float)rhsEqual[i]))) == 0);

      assertTrue(tc.unwrapToInt(op.apply((byte)lhsEqual[i], tc.wrap((double)rhsEqual[i]))) == 0);
      assertTrue(tc.unwrapToInt(op.apply((char)lhsEqual[i], tc.wrap((double)rhsEqual[i]))) == 0);
      assertTrue(tc.unwrapToInt(op.apply((short)lhsEqual[i], tc.wrap((double)rhsEqual[i]))) == 0);
      assertTrue(tc.unwrapToInt(op.apply(lhsEqual[i], tc.wrap((double)rhsEqual[i]))) == 0);
      assertTrue(tc.unwrapToInt(op.apply((long)lhsEqual[i], tc.wrap((double)rhsEqual[i]))) == 0);
      assertTrue(tc.unwrapToInt(op.apply((float)lhsEqual[i], tc.wrap((double)rhsEqual[i]))) == 0);
      assertTrue(tc.unwrapToInt(op.apply((double)lhsEqual[i], tc.wrap((double)rhsEqual[i]))) == 0);
      assertTrue(tc.unwrapToInt(op.apply(BigInteger.valueOf(lhsEqual[i]), tc.wrap((double)rhsEqual[i]))) == 0);
      assertTrue(tc.unwrapToInt(op.apply(BigDecimal.valueOf(lhsEqual[i]), tc.wrap((double)rhsEqual[i]))) == 0);

      assertTrue(tc.unwrapToInt(op.apply(tc.wrap((byte)lhsEqual[i]), tc.wrap((byte)rhsEqual[i]))) == 0);
      assertTrue(tc.unwrapToInt(op.apply(tc.wrap((char)lhsEqual[i]), tc.wrap((byte)rhsEqual[i]))) == 0);
      assertTrue(tc.unwrapToInt(op.apply(tc.wrap((short)lhsEqual[i]), tc.wrap((byte)rhsEqual[i]))) == 0);
      assertTrue(tc.unwrapToInt(op.apply(tc.wrap((int)lhsEqual[i]), tc.wrap((byte)rhsEqual[i]))) == 0);
      assertTrue(tc.unwrapToInt(op.apply(tc.wrap((long)lhsEqual[i]), tc.wrap((byte)rhsEqual[i]))) == 0);
      assertTrue(tc.unwrapToInt(op.apply(tc.wrap((float)lhsEqual[i]), tc.wrap((byte)rhsEqual[i]))) == 0);
      assertTrue(tc.unwrapToInt(op.apply(tc.wrap((double)lhsEqual[i]), tc.wrap((byte)rhsEqual[i]))) == 0);
      assertTrue(tc.unwrapToInt(op.apply(BigInteger.valueOf(lhsEqual[i]), tc.wrap((byte)rhsEqual[i]))) == 0);
      assertTrue(tc.unwrapToInt(op.apply(BigDecimal.valueOf(lhsEqual[i]), tc.wrap((byte)rhsEqual[i]))) == 0);

      assertTrue(tc.unwrapToInt(op.apply(tc.wrap((byte)lhsEqual[i]), tc.wrap((char)rhsEqual[i]))) == 0);
      assertTrue(tc.unwrapToInt(op.apply(tc.wrap((char)lhsEqual[i]), tc.wrap((char)rhsEqual[i]))) == 0);
      assertTrue(tc.unwrapToInt(op.apply(tc.wrap((short)lhsEqual[i]), tc.wrap((char)rhsEqual[i]))) == 0);
      assertTrue(tc.unwrapToInt(op.apply(tc.wrap((int)lhsEqual[i]), tc.wrap((char)rhsEqual[i]))) == 0);
      assertTrue(tc.unwrapToInt(op.apply(tc.wrap((long)lhsEqual[i]), tc.wrap((char)rhsEqual[i]))) == 0);
      assertTrue(tc.unwrapToInt(op.apply(tc.wrap((float)lhsEqual[i]), tc.wrap((char)rhsEqual[i]))) == 0);
      assertTrue(tc.unwrapToInt(op.apply(tc.wrap((double)lhsEqual[i]), tc.wrap((char)rhsEqual[i]))) == 0);
      assertTrue(tc.unwrapToInt(op.apply(BigInteger.valueOf(lhsEqual[i]), tc.wrap((char)rhsEqual[i]))) == 0);
      assertTrue(tc.unwrapToInt(op.apply(BigDecimal.valueOf(lhsEqual[i]), tc.wrap((char)rhsEqual[i]))) == 0);

      assertTrue(tc.unwrapToInt(op.apply(tc.wrap((byte)lhsEqual[i]), tc.wrap((short)rhsEqual[i]))) == 0);
      assertTrue(tc.unwrapToInt(op.apply(tc.wrap((char)lhsEqual[i]), tc.wrap((short)rhsEqual[i]))) == 0);
      assertTrue(tc.unwrapToInt(op.apply(tc.wrap((short)lhsEqual[i]), tc.wrap((short)rhsEqual[i]))) == 0);
      assertTrue(tc.unwrapToInt(op.apply(tc.wrap((int)lhsEqual[i]), tc.wrap((short)rhsEqual[i]))) == 0);
      assertTrue(tc.unwrapToInt(op.apply(tc.wrap((long)lhsEqual[i]), tc.wrap((short)rhsEqual[i]))) == 0);
      assertTrue(tc.unwrapToInt(op.apply(tc.wrap((float)lhsEqual[i]), tc.wrap((short)rhsEqual[i]))) == 0);
      assertTrue(tc.unwrapToInt(op.apply(tc.wrap((double)lhsEqual[i]), tc.wrap((short)rhsEqual[i]))) == 0);
      assertTrue(tc.unwrapToInt(op.apply(BigInteger.valueOf(lhsEqual[i]), tc.wrap((short)rhsEqual[i]))) == 0);
      assertTrue(tc.unwrapToInt(op.apply(BigDecimal.valueOf(lhsEqual[i]), tc.wrap((short)rhsEqual[i]))) == 0);

      assertTrue(tc.unwrapToInt(op.apply(tc.wrap((byte)lhsEqual[i]), tc.wrap((int)rhsEqual[i]))) == 0);
      assertTrue(tc.unwrapToInt(op.apply(tc.wrap((char)lhsEqual[i]), tc.wrap((int)rhsEqual[i]))) == 0);
      assertTrue(tc.unwrapToInt(op.apply(tc.wrap((short)lhsEqual[i]), tc.wrap((int)rhsEqual[i]))) == 0);
      assertTrue(tc.unwrapToInt(op.apply(tc.wrap((int)lhsEqual[i]), tc.wrap((int)rhsEqual[i]))) == 0);
      assertTrue(tc.unwrapToInt(op.apply(tc.wrap((long)lhsEqual[i]), tc.wrap((int)rhsEqual[i]))) == 0);
      assertTrue(tc.unwrapToInt(op.apply(tc.wrap((float)lhsEqual[i]), tc.wrap((int)rhsEqual[i]))) == 0);
      assertTrue(tc.unwrapToInt(op.apply(tc.wrap((double)lhsEqual[i]), tc.wrap((int)rhsEqual[i]))) == 0);
      assertTrue(tc.unwrapToInt(op.apply(BigInteger.valueOf(lhsEqual[i]), tc.wrap((int)rhsEqual[i]))) == 0);
      assertTrue(tc.unwrapToInt(op.apply(BigDecimal.valueOf(lhsEqual[i]), tc.wrap((int)rhsEqual[i]))) == 0);

      assertTrue(tc.unwrapToInt(op.apply(tc.wrap((byte)lhsEqual[i]), tc.wrap((long)rhsEqual[i]))) == 0);
      assertTrue(tc.unwrapToInt(op.apply(tc.wrap((char)lhsEqual[i]), tc.wrap((long)rhsEqual[i]))) == 0);
      assertTrue(tc.unwrapToInt(op.apply(tc.wrap((short)lhsEqual[i]), tc.wrap((long)rhsEqual[i]))) == 0);
      assertTrue(tc.unwrapToInt(op.apply(tc.wrap((int)lhsEqual[i]), tc.wrap((long)rhsEqual[i]))) == 0);
      assertTrue(tc.unwrapToInt(op.apply(tc.wrap((long)lhsEqual[i]), tc.wrap((long)rhsEqual[i]))) == 0);
      assertTrue(tc.unwrapToInt(op.apply(tc.wrap((float)lhsEqual[i]), tc.wrap((long)rhsEqual[i]))) == 0);
      assertTrue(tc.unwrapToInt(op.apply(tc.wrap((double)lhsEqual[i]), tc.wrap((long)rhsEqual[i]))) == 0);
      assertTrue(tc.unwrapToInt(op.apply(BigInteger.valueOf(lhsEqual[i]), tc.wrap((long)rhsEqual[i]))) == 0);
      assertTrue(tc.unwrapToInt(op.apply(BigDecimal.valueOf(lhsEqual[i]), tc.wrap((long)rhsEqual[i]))) == 0);

      assertTrue(tc.unwrapToInt(op.apply(tc.wrap((byte)lhsEqual[i]), tc.wrap((float)rhsEqual[i]))) == 0);
      assertTrue(tc.unwrapToInt(op.apply(tc.wrap((char)lhsEqual[i]), tc.wrap((float)rhsEqual[i]))) == 0);
      assertTrue(tc.unwrapToInt(op.apply(tc.wrap((short)lhsEqual[i]), tc.wrap((float)rhsEqual[i]))) == 0);
      assertTrue(tc.unwrapToInt(op.apply(tc.wrap((int)lhsEqual[i]), tc.wrap((float)rhsEqual[i]))) == 0);
      assertTrue(tc.unwrapToInt(op.apply(tc.wrap((long)lhsEqual[i]), tc.wrap((float)rhsEqual[i]))) == 0);
      assertTrue(tc.unwrapToInt(op.apply(tc.wrap((float)lhsEqual[i]), tc.wrap((float)rhsEqual[i]))) == 0);
      assertTrue(tc.unwrapToInt(op.apply(tc.wrap((double)lhsEqual[i]), tc.wrap((float)rhsEqual[i]))) == 0);
      assertTrue(tc.unwrapToInt(op.apply(BigInteger.valueOf(lhsEqual[i]), tc.wrap((float)rhsEqual[i]))) == 0);
      assertTrue(tc.unwrapToInt(op.apply(BigDecimal.valueOf(lhsEqual[i]), tc.wrap((float)rhsEqual[i]))) == 0);

      assertTrue(tc.unwrapToInt(op.apply(tc.wrap((byte)lhsEqual[i]), tc.wrap((double)rhsEqual[i]))) == 0);
      assertTrue(tc.unwrapToInt(op.apply(tc.wrap((char)lhsEqual[i]), tc.wrap((double)rhsEqual[i]))) == 0);
      assertTrue(tc.unwrapToInt(op.apply(tc.wrap((short)lhsEqual[i]), tc.wrap((double)rhsEqual[i]))) == 0);
      assertTrue(tc.unwrapToInt(op.apply(tc.wrap((int)lhsEqual[i]), tc.wrap((double)rhsEqual[i]))) == 0);
      assertTrue(tc.unwrapToInt(op.apply(tc.wrap((long)lhsEqual[i]), tc.wrap((double)rhsEqual[i]))) == 0);
      assertTrue(tc.unwrapToInt(op.apply(tc.wrap((float)lhsEqual[i]), tc.wrap((double)rhsEqual[i]))) == 0);
      assertTrue(tc.unwrapToInt(op.apply(tc.wrap((double)lhsEqual[i]), tc.wrap((double)rhsEqual[i]))) == 0);
      assertTrue(tc.unwrapToInt(op.apply(BigInteger.valueOf(lhsEqual[i]), tc.wrap((double)rhsEqual[i]))) == 0);
      assertTrue(tc.unwrapToInt(op.apply(BigDecimal.valueOf(lhsEqual[i]), tc.wrap((double)rhsEqual[i]))) == 0);

      assertTrue(tc.unwrapToInt(op.apply(tc.wrap((byte)lhsEqual[i]), BigInteger.valueOf(rhsEqual[i]))) == 0);
      assertTrue(tc.unwrapToInt(op.apply(tc.wrap((char)lhsEqual[i]), BigInteger.valueOf(rhsEqual[i]))) == 0);
      assertTrue(tc.unwrapToInt(op.apply(tc.wrap((short)lhsEqual[i]), BigInteger.valueOf(rhsEqual[i]))) == 0);
      assertTrue(tc.unwrapToInt(op.apply(tc.wrap((int)lhsEqual[i]), BigInteger.valueOf(rhsEqual[i]))) == 0);
      assertTrue(tc.unwrapToInt(op.apply(tc.wrap((long)lhsEqual[i]), BigInteger.valueOf(rhsEqual[i]))) == 0);
      assertTrue(tc.unwrapToInt(op.apply(tc.wrap((float)lhsEqual[i]), BigInteger.valueOf(rhsEqual[i]))) == 0);
      assertTrue(tc.unwrapToInt(op.apply(tc.wrap((double)lhsEqual[i]), BigInteger.valueOf(rhsEqual[i]))) == 0);
      assertTrue(tc.unwrapToInt(op.apply(BigInteger.valueOf(lhsEqual[i]), BigInteger.valueOf(rhsEqual[i]))) == 0);
      assertTrue(tc.unwrapToInt(op.apply(BigDecimal.valueOf(lhsEqual[i]), BigInteger.valueOf(rhsEqual[i]))) == 0);

      assertTrue(tc.unwrapToInt(op.apply(tc.wrap((byte)lhsEqual[i]), BigDecimal.valueOf(rhsEqual[i]))) == 0);
      assertTrue(tc.unwrapToInt(op.apply(tc.wrap((char)lhsEqual[i]), BigDecimal.valueOf(rhsEqual[i]))) == 0);
      assertTrue(tc.unwrapToInt(op.apply(tc.wrap((short)lhsEqual[i]), BigDecimal.valueOf(rhsEqual[i]))) == 0);
      assertTrue(tc.unwrapToInt(op.apply(tc.wrap((int)lhsEqual[i]), BigDecimal.valueOf(rhsEqual[i]))) == 0);
      assertTrue(tc.unwrapToInt(op.apply(tc.wrap((long)lhsEqual[i]), BigDecimal.valueOf(rhsEqual[i]))) == 0);
      assertTrue(tc.unwrapToInt(op.apply(tc.wrap((float)lhsEqual[i]), BigDecimal.valueOf(rhsEqual[i]))) == 0);
      assertTrue(tc.unwrapToInt(op.apply(tc.wrap((double)lhsEqual[i]), BigDecimal.valueOf(rhsEqual[i]))) == 0);
      assertTrue(tc.unwrapToInt(op.apply(BigInteger.valueOf(lhsEqual[i]), BigDecimal.valueOf(rhsEqual[i]))) == 0);
      assertTrue(tc.unwrapToInt(op.apply(BigDecimal.valueOf(lhsEqual[i]), BigDecimal.valueOf(rhsEqual[i]))) == 0);

      assertTrue(tc.unwrapToInt(op.apply(tc.wrap((byte)lhsEqual[i]), tc.wrap((byte)rhsEqual[i]))) == 0);
      assertTrue(tc.unwrapToInt(op.apply(tc.wrap((char)lhsEqual[i]), tc.wrap((byte)rhsEqual[i]))) == 0);
      assertTrue(tc.unwrapToInt(op.apply(tc.wrap((short)lhsEqual[i]), tc.wrap((byte)rhsEqual[i]))) == 0);
      assertTrue(tc.unwrapToInt(op.apply(tc.wrap((int)lhsEqual[i]), tc.wrap((byte)rhsEqual[i]))) == 0);
      assertTrue(tc.unwrapToInt(op.apply(tc.wrap((long)lhsEqual[i]), tc.wrap((byte)rhsEqual[i]))) == 0);
      assertTrue(tc.unwrapToInt(op.apply(tc.wrap((float)lhsEqual[i]), tc.wrap((byte)rhsEqual[i]))) == 0);
      assertTrue(tc.unwrapToInt(op.apply(tc.wrap((double)lhsEqual[i]), tc.wrap((byte)rhsEqual[i]))) == 0);
      assertTrue(tc.unwrapToInt(op.apply((Object)BigInteger.valueOf(lhsEqual[i]), (Object)tc.wrap((byte)rhsEqual[i]))) == 0);
      assertTrue(tc.unwrapToInt(op.apply((Object)BigDecimal.valueOf(lhsEqual[i]), (Object)tc.wrap((byte)rhsEqual[i]))) == 0);

      assertTrue(tc.unwrapToInt(op.apply(tc.wrap((byte)lhsEqual[i]), tc.wrap((char)rhsEqual[i]))) == 0);
      assertTrue(tc.unwrapToInt(op.apply(tc.wrap((char)lhsEqual[i]), tc.wrap((char)rhsEqual[i]))) == 0);
      assertTrue(tc.unwrapToInt(op.apply(tc.wrap((short)lhsEqual[i]), tc.wrap((char)rhsEqual[i]))) == 0);
      assertTrue(tc.unwrapToInt(op.apply(tc.wrap((int)lhsEqual[i]), tc.wrap((char)rhsEqual[i]))) == 0);
      assertTrue(tc.unwrapToInt(op.apply(tc.wrap((long)lhsEqual[i]), tc.wrap((char)rhsEqual[i]))) == 0);
      assertTrue(tc.unwrapToInt(op.apply(tc.wrap((float)lhsEqual[i]), tc.wrap((char)rhsEqual[i]))) == 0);
      assertTrue(tc.unwrapToInt(op.apply(tc.wrap((double)lhsEqual[i]), tc.wrap((char)rhsEqual[i]))) == 0);
      assertTrue(tc.unwrapToInt(op.apply((Object)BigInteger.valueOf(lhsEqual[i]), (Object)tc.wrap((char)rhsEqual[i]))) == 0);
      assertTrue(tc.unwrapToInt(op.apply((Object)BigDecimal.valueOf(lhsEqual[i]), (Object)tc.wrap((char)rhsEqual[i]))) == 0);

      assertTrue(tc.unwrapToInt(op.apply(tc.wrap((byte)lhsEqual[i]), tc.wrap((short)rhsEqual[i]))) == 0);
      assertTrue(tc.unwrapToInt(op.apply(tc.wrap((char)lhsEqual[i]), tc.wrap((short)rhsEqual[i]))) == 0);
      assertTrue(tc.unwrapToInt(op.apply(tc.wrap((short)lhsEqual[i]), tc.wrap((short)rhsEqual[i]))) == 0);
      assertTrue(tc.unwrapToInt(op.apply(tc.wrap((int)lhsEqual[i]), tc.wrap((short)rhsEqual[i]))) == 0);
      assertTrue(tc.unwrapToInt(op.apply(tc.wrap((long)lhsEqual[i]), tc.wrap((short)rhsEqual[i]))) == 0);
      assertTrue(tc.unwrapToInt(op.apply(tc.wrap((float)lhsEqual[i]), tc.wrap((short)rhsEqual[i]))) == 0);
      assertTrue(tc.unwrapToInt(op.apply(tc.wrap((double)lhsEqual[i]), tc.wrap((short)rhsEqual[i]))) == 0);
      assertTrue(tc.unwrapToInt(op.apply((Object)BigInteger.valueOf(lhsEqual[i]), (Object)tc.wrap((short)rhsEqual[i]))) == 0);
      assertTrue(tc.unwrapToInt(op.apply((Object)BigDecimal.valueOf(lhsEqual[i]), (Object)tc.wrap((short)rhsEqual[i]))) == 0);

      assertTrue(tc.unwrapToInt(op.apply(tc.wrap((byte)lhsEqual[i]), tc.wrap((int)rhsEqual[i]))) == 0);
      assertTrue(tc.unwrapToInt(op.apply(tc.wrap((char)lhsEqual[i]), tc.wrap((int)rhsEqual[i]))) == 0);
      assertTrue(tc.unwrapToInt(op.apply(tc.wrap((short)lhsEqual[i]), tc.wrap((int)rhsEqual[i]))) == 0);
      assertTrue(tc.unwrapToInt(op.apply(tc.wrap((int)lhsEqual[i]), tc.wrap((int)rhsEqual[i]))) == 0);
      assertTrue(tc.unwrapToInt(op.apply(tc.wrap((long)lhsEqual[i]), tc.wrap((int)rhsEqual[i]))) == 0);
      assertTrue(tc.unwrapToInt(op.apply(tc.wrap((float)lhsEqual[i]), tc.wrap((int)rhsEqual[i]))) == 0);
      assertTrue(tc.unwrapToInt(op.apply(tc.wrap((double)lhsEqual[i]), tc.wrap((int)rhsEqual[i]))) == 0);
      assertTrue(tc.unwrapToInt(op.apply((Object)BigInteger.valueOf(lhsEqual[i]), (Object)tc.wrap((int)rhsEqual[i]))) == 0);
      assertTrue(tc.unwrapToInt(op.apply((Object)BigDecimal.valueOf(lhsEqual[i]), (Object)tc.wrap((int)rhsEqual[i]))) == 0);

      assertTrue(tc.unwrapToInt(op.apply(tc.wrap((byte)lhsEqual[i]), tc.wrap((long)rhsEqual[i]))) == 0);
      assertTrue(tc.unwrapToInt(op.apply(tc.wrap((char)lhsEqual[i]), tc.wrap((long)rhsEqual[i]))) == 0);
      assertTrue(tc.unwrapToInt(op.apply(tc.wrap((short)lhsEqual[i]), tc.wrap((long)rhsEqual[i]))) == 0);
      assertTrue(tc.unwrapToInt(op.apply(tc.wrap((int)lhsEqual[i]), tc.wrap((long)rhsEqual[i]))) == 0);
      assertTrue(tc.unwrapToInt(op.apply(tc.wrap((long)lhsEqual[i]), tc.wrap((long)rhsEqual[i]))) == 0);
      assertTrue(tc.unwrapToInt(op.apply(tc.wrap((float)lhsEqual[i]), tc.wrap((long)rhsEqual[i]))) == 0);
      assertTrue(tc.unwrapToInt(op.apply(tc.wrap((double)lhsEqual[i]), tc.wrap((long)rhsEqual[i]))) == 0);
      assertTrue(tc.unwrapToInt(op.apply((Object)BigInteger.valueOf(lhsEqual[i]), (Object)tc.wrap((long)rhsEqual[i]))) == 0);
      assertTrue(tc.unwrapToInt(op.apply((Object)BigDecimal.valueOf(lhsEqual[i]), (Object)tc.wrap((long)rhsEqual[i]))) == 0);

      assertTrue(tc.unwrapToInt(op.apply(tc.wrap((byte)lhsEqual[i]), tc.wrap((float)rhsEqual[i]))) == 0);
      assertTrue(tc.unwrapToInt(op.apply(tc.wrap((char)lhsEqual[i]), tc.wrap((float)rhsEqual[i]))) == 0);
      assertTrue(tc.unwrapToInt(op.apply(tc.wrap((short)lhsEqual[i]), tc.wrap((float)rhsEqual[i]))) == 0);
      assertTrue(tc.unwrapToInt(op.apply(tc.wrap((int)lhsEqual[i]), tc.wrap((float)rhsEqual[i]))) == 0);
      assertTrue(tc.unwrapToInt(op.apply(tc.wrap((long)lhsEqual[i]), tc.wrap((float)rhsEqual[i]))) == 0);
      assertTrue(tc.unwrapToInt(op.apply(tc.wrap((float)lhsEqual[i]), tc.wrap((float)rhsEqual[i]))) == 0);
      assertTrue(tc.unwrapToInt(op.apply(tc.wrap((double)lhsEqual[i]), tc.wrap((float)rhsEqual[i]))) == 0);
      assertTrue(tc.unwrapToInt(op.apply((Object)BigInteger.valueOf(lhsEqual[i]), (Object)tc.wrap((float)rhsEqual[i]))) == 0);
      assertTrue(tc.unwrapToInt(op.apply((Object)BigDecimal.valueOf(lhsEqual[i]), (Object)tc.wrap((float)rhsEqual[i]))) == 0);

      assertTrue(tc.unwrapToInt(op.apply(tc.wrap((byte)lhsEqual[i]), tc.wrap((double)rhsEqual[i]))) == 0);
      assertTrue(tc.unwrapToInt(op.apply(tc.wrap((char)lhsEqual[i]), tc.wrap((double)rhsEqual[i]))) == 0);
      assertTrue(tc.unwrapToInt(op.apply(tc.wrap((short)lhsEqual[i]), tc.wrap((double)rhsEqual[i]))) == 0);
      assertTrue(tc.unwrapToInt(op.apply(tc.wrap((int)lhsEqual[i]), tc.wrap((double)rhsEqual[i]))) == 0);
      assertTrue(tc.unwrapToInt(op.apply(tc.wrap((long)lhsEqual[i]), tc.wrap((double)rhsEqual[i]))) == 0);
      assertTrue(tc.unwrapToInt(op.apply(tc.wrap((float)lhsEqual[i]), tc.wrap((double)rhsEqual[i]))) == 0);
      assertTrue(tc.unwrapToInt(op.apply(tc.wrap((double)lhsEqual[i]), tc.wrap((double)rhsEqual[i]))) == 0);
      assertTrue(tc.unwrapToInt(op.apply((Object)BigInteger.valueOf(lhsEqual[i]), (Object)tc.wrap((double)rhsEqual[i]))) == 0);
      assertTrue(tc.unwrapToInt(op.apply((Object)BigDecimal.valueOf(lhsEqual[i]), (Object)tc.wrap((double)rhsEqual[i]))) == 0);

      assertTrue(tc.unwrapToInt(op.apply((Object)tc.wrap((byte)lhsEqual[i]), (Object)BigInteger.valueOf(rhsEqual[i]))) == 0);
      assertTrue(tc.unwrapToInt(op.apply((Object)tc.wrap((char)lhsEqual[i]), (Object)BigInteger.valueOf(rhsEqual[i]))) == 0);
      assertTrue(tc.unwrapToInt(op.apply((Object)tc.wrap((short)lhsEqual[i]), (Object)BigInteger.valueOf(rhsEqual[i]))) == 0);
      assertTrue(tc.unwrapToInt(op.apply((Object)tc.wrap((int)lhsEqual[i]), (Object)BigInteger.valueOf(rhsEqual[i]))) == 0);
      assertTrue(tc.unwrapToInt(op.apply((Object)tc.wrap((long)lhsEqual[i]), (Object)BigInteger.valueOf(rhsEqual[i]))) == 0);
      assertTrue(tc.unwrapToInt(op.apply((Object)tc.wrap((float)lhsEqual[i]), (Object)BigInteger.valueOf(rhsEqual[i]))) == 0);
      assertTrue(tc.unwrapToInt(op.apply((Object)tc.wrap((double)lhsEqual[i]), (Object)BigInteger.valueOf(rhsEqual[i]))) == 0);
      assertTrue(tc.unwrapToInt(op.apply((Object)BigInteger.valueOf(lhsEqual[i]), (Object)BigInteger.valueOf(rhsEqual[i]))) == 0);
      assertTrue(tc.unwrapToInt(op.apply((Object)BigDecimal.valueOf(lhsEqual[i]), (Object)BigInteger.valueOf(rhsEqual[i]))) == 0);

      assertTrue(tc.unwrapToInt(op.apply((Object)tc.wrap((byte)lhsEqual[i]), (Object)BigDecimal.valueOf(rhsEqual[i]))) == 0);
      assertTrue(tc.unwrapToInt(op.apply((Object)tc.wrap((char)lhsEqual[i]), (Object)BigDecimal.valueOf(rhsEqual[i]))) == 0);
      assertTrue(tc.unwrapToInt(op.apply((Object)tc.wrap((short)lhsEqual[i]), (Object)BigDecimal.valueOf(rhsEqual[i]))) == 0);
      assertTrue(tc.unwrapToInt(op.apply((Object)tc.wrap((int)lhsEqual[i]), (Object)BigDecimal.valueOf(rhsEqual[i]))) == 0);
      assertTrue(tc.unwrapToInt(op.apply((Object)tc.wrap((long)lhsEqual[i]), (Object)BigDecimal.valueOf(rhsEqual[i]))) == 0);
      assertTrue(tc.unwrapToInt(op.apply((Object)tc.wrap((float)lhsEqual[i]), (Object)BigDecimal.valueOf(rhsEqual[i]))) == 0);
      assertTrue(tc.unwrapToInt(op.apply((Object)tc.wrap((double)lhsEqual[i]), (Object)BigDecimal.valueOf(rhsEqual[i]))) == 0);
      assertTrue(tc.unwrapToInt(op.apply((Object)BigInteger.valueOf(lhsEqual[i]), (Object)BigDecimal.valueOf(rhsEqual[i]))) == 0);
      assertTrue(tc.unwrapToInt(op.apply((Object)BigDecimal.valueOf(lhsEqual[i]), (Object)BigDecimal.valueOf(rhsEqual[i]))) == 0);

      assertTrue(op.intApply(tc.wrap((byte)lhsEqual[i]), tc.wrap((byte)rhsEqual[i])) == 0);
      assertTrue(op.intApply(tc.wrap((char)lhsEqual[i]), tc.wrap((byte)rhsEqual[i])) == 0);
      assertTrue(op.intApply(tc.wrap((short)lhsEqual[i]), tc.wrap((byte)rhsEqual[i])) == 0);
      assertTrue(op.intApply(tc.wrap((int)lhsEqual[i]), tc.wrap((byte)rhsEqual[i])) == 0);
      assertTrue(op.intApply(tc.wrap((long)lhsEqual[i]), tc.wrap((byte)rhsEqual[i])) == 0);
      assertTrue(op.intApply(tc.wrap((float)lhsEqual[i]), tc.wrap((byte)rhsEqual[i])) == 0);
      assertTrue(op.intApply(tc.wrap((double)lhsEqual[i]), tc.wrap((byte)rhsEqual[i])) == 0);
      assertTrue(op.intApply((Object)BigInteger.valueOf(lhsEqual[i]), (Object)tc.wrap((byte)rhsEqual[i])) == 0);
      assertTrue(op.intApply((Object)BigDecimal.valueOf(lhsEqual[i]), (Object)tc.wrap((byte)rhsEqual[i])) == 0);

      assertTrue(op.intApply(tc.wrap((byte)lhsEqual[i]), tc.wrap((char)rhsEqual[i])) == 0);
      assertTrue(op.intApply(tc.wrap((char)lhsEqual[i]), tc.wrap((char)rhsEqual[i])) == 0);
      assertTrue(op.intApply(tc.wrap((short)lhsEqual[i]), tc.wrap((char)rhsEqual[i])) == 0);
      assertTrue(op.intApply(tc.wrap((int)lhsEqual[i]), tc.wrap((char)rhsEqual[i])) == 0);
      assertTrue(op.intApply(tc.wrap((long)lhsEqual[i]), tc.wrap((char)rhsEqual[i])) == 0);
      assertTrue(op.intApply(tc.wrap((float)lhsEqual[i]), tc.wrap((char)rhsEqual[i])) == 0);
      assertTrue(op.intApply(tc.wrap((double)lhsEqual[i]), tc.wrap((char)rhsEqual[i])) == 0);
      assertTrue(op.intApply((Object)BigInteger.valueOf(lhsEqual[i]), (Object)tc.wrap((char)rhsEqual[i])) == 0);
      assertTrue(op.intApply((Object)BigDecimal.valueOf(lhsEqual[i]), (Object)tc.wrap((char)rhsEqual[i])) == 0);

      assertTrue(op.intApply(tc.wrap((byte)lhsEqual[i]), tc.wrap((short)rhsEqual[i])) == 0);
      assertTrue(op.intApply(tc.wrap((char)lhsEqual[i]), tc.wrap((short)rhsEqual[i])) == 0);
      assertTrue(op.intApply(tc.wrap((short)lhsEqual[i]), tc.wrap((short)rhsEqual[i])) == 0);
      assertTrue(op.intApply(tc.wrap((int)lhsEqual[i]), tc.wrap((short)rhsEqual[i])) == 0);
      assertTrue(op.intApply(tc.wrap((long)lhsEqual[i]), tc.wrap((short)rhsEqual[i])) == 0);
      assertTrue(op.intApply(tc.wrap((float)lhsEqual[i]), tc.wrap((short)rhsEqual[i])) == 0);
      assertTrue(op.intApply(tc.wrap((double)lhsEqual[i]), tc.wrap((short)rhsEqual[i])) == 0);
      assertTrue(op.intApply((Object)BigInteger.valueOf(lhsEqual[i]), (Object)tc.wrap((short)rhsEqual[i])) == 0);
      assertTrue(op.intApply((Object)BigDecimal.valueOf(lhsEqual[i]), (Object)tc.wrap((short)rhsEqual[i])) == 0);

      assertTrue(op.intApply(tc.wrap((byte)lhsEqual[i]), tc.wrap((int)rhsEqual[i])) == 0);
      assertTrue(op.intApply(tc.wrap((char)lhsEqual[i]), tc.wrap((int)rhsEqual[i])) == 0);
      assertTrue(op.intApply(tc.wrap((short)lhsEqual[i]), tc.wrap((int)rhsEqual[i])) == 0);
      assertTrue(op.intApply(tc.wrap((int)lhsEqual[i]), tc.wrap((int)rhsEqual[i])) == 0);
      assertTrue(op.intApply(tc.wrap((long)lhsEqual[i]), tc.wrap((int)rhsEqual[i])) == 0);
      assertTrue(op.intApply(tc.wrap((float)lhsEqual[i]), tc.wrap((int)rhsEqual[i])) == 0);
      assertTrue(op.intApply(tc.wrap((double)lhsEqual[i]), tc.wrap((int)rhsEqual[i])) == 0);
      assertTrue(op.intApply((Object)BigInteger.valueOf(lhsEqual[i]), (Object)tc.wrap((int)rhsEqual[i])) == 0);
      assertTrue(op.intApply((Object)BigDecimal.valueOf(lhsEqual[i]), (Object)tc.wrap((int)rhsEqual[i])) == 0);

      assertTrue(op.intApply(tc.wrap((byte)lhsEqual[i]), tc.wrap((long)rhsEqual[i])) == 0);
      assertTrue(op.intApply(tc.wrap((char)lhsEqual[i]), tc.wrap((long)rhsEqual[i])) == 0);
      assertTrue(op.intApply(tc.wrap((short)lhsEqual[i]), tc.wrap((long)rhsEqual[i])) == 0);
      assertTrue(op.intApply(tc.wrap((int)lhsEqual[i]), tc.wrap((long)rhsEqual[i])) == 0);
      assertTrue(op.intApply(tc.wrap((long)lhsEqual[i]), tc.wrap((long)rhsEqual[i])) == 0);
      assertTrue(op.intApply(tc.wrap((float)lhsEqual[i]), tc.wrap((long)rhsEqual[i])) == 0);
      assertTrue(op.intApply(tc.wrap((double)lhsEqual[i]), tc.wrap((long)rhsEqual[i])) == 0);
      assertTrue(op.intApply((Object)BigInteger.valueOf(lhsEqual[i]), (Object)tc.wrap((long)rhsEqual[i])) == 0);
      assertTrue(op.intApply((Object)BigDecimal.valueOf(lhsEqual[i]), (Object)tc.wrap((long)rhsEqual[i])) == 0);

      assertTrue(op.intApply(tc.wrap((byte)lhsEqual[i]), tc.wrap((float)rhsEqual[i])) == 0);
      assertTrue(op.intApply(tc.wrap((char)lhsEqual[i]), tc.wrap((float)rhsEqual[i])) == 0);
      assertTrue(op.intApply(tc.wrap((short)lhsEqual[i]), tc.wrap((float)rhsEqual[i])) == 0);
      assertTrue(op.intApply(tc.wrap((int)lhsEqual[i]), tc.wrap((float)rhsEqual[i])) == 0);
      assertTrue(op.intApply(tc.wrap((long)lhsEqual[i]), tc.wrap((float)rhsEqual[i])) == 0);
      assertTrue(op.intApply(tc.wrap((float)lhsEqual[i]), tc.wrap((float)rhsEqual[i])) == 0);
      assertTrue(op.intApply(tc.wrap((double)lhsEqual[i]), tc.wrap((float)rhsEqual[i])) == 0);
      assertTrue(op.intApply((Object)BigInteger.valueOf(lhsEqual[i]), (Object)tc.wrap((float)rhsEqual[i])) == 0);
      assertTrue(op.intApply((Object)BigDecimal.valueOf(lhsEqual[i]), (Object)tc.wrap((float)rhsEqual[i])) == 0);

      assertTrue(op.intApply(tc.wrap((byte)lhsEqual[i]), tc.wrap((double)rhsEqual[i])) == 0);
      assertTrue(op.intApply(tc.wrap((char)lhsEqual[i]), tc.wrap((double)rhsEqual[i])) == 0);
      assertTrue(op.intApply(tc.wrap((short)lhsEqual[i]), tc.wrap((double)rhsEqual[i])) == 0);
      assertTrue(op.intApply(tc.wrap((int)lhsEqual[i]), tc.wrap((double)rhsEqual[i])) == 0);
      assertTrue(op.intApply(tc.wrap((long)lhsEqual[i]), tc.wrap((double)rhsEqual[i])) == 0);
      assertTrue(op.intApply(tc.wrap((float)lhsEqual[i]), tc.wrap((double)rhsEqual[i])) == 0);
      assertTrue(op.intApply(tc.wrap((double)lhsEqual[i]), tc.wrap((double)rhsEqual[i])) == 0);
      assertTrue(op.intApply((Object)BigInteger.valueOf(lhsEqual[i]), (Object)tc.wrap((double)rhsEqual[i])) == 0);
      assertTrue(op.intApply((Object)BigDecimal.valueOf(lhsEqual[i]), (Object)tc.wrap((double)rhsEqual[i])) == 0);

      assertTrue(op.intApply((Object)tc.wrap((byte)lhsEqual[i]), (Object)BigInteger.valueOf(rhsEqual[i])) == 0);
      assertTrue(op.intApply((Object)tc.wrap((char)lhsEqual[i]), (Object)BigInteger.valueOf(rhsEqual[i])) == 0);
      assertTrue(op.intApply((Object)tc.wrap((short)lhsEqual[i]), (Object)BigInteger.valueOf(rhsEqual[i])) == 0);
      assertTrue(op.intApply((Object)tc.wrap((int)lhsEqual[i]), (Object)BigInteger.valueOf(rhsEqual[i])) == 0);
      assertTrue(op.intApply((Object)tc.wrap((long)lhsEqual[i]), (Object)BigInteger.valueOf(rhsEqual[i])) == 0);
      assertTrue(op.intApply((Object)tc.wrap((float)lhsEqual[i]), (Object)BigInteger.valueOf(rhsEqual[i])) == 0);
      assertTrue(op.intApply((Object)tc.wrap((double)lhsEqual[i]), (Object)BigInteger.valueOf(rhsEqual[i])) == 0);
      assertTrue(op.intApply((Object)BigInteger.valueOf(lhsEqual[i]), (Object)BigInteger.valueOf(rhsEqual[i])) == 0);
      assertTrue(op.intApply((Object)BigDecimal.valueOf(lhsEqual[i]), (Object)BigInteger.valueOf(rhsEqual[i])) == 0);

      assertTrue(op.intApply((Object)tc.wrap((byte)lhsEqual[i]), (Object)BigDecimal.valueOf(rhsEqual[i])) == 0);
      assertTrue(op.intApply((Object)tc.wrap((char)lhsEqual[i]), (Object)BigDecimal.valueOf(rhsEqual[i])) == 0);
      assertTrue(op.intApply((Object)tc.wrap((short)lhsEqual[i]), (Object)BigDecimal.valueOf(rhsEqual[i])) == 0);
      assertTrue(op.intApply((Object)tc.wrap((int)lhsEqual[i]), (Object)BigDecimal.valueOf(rhsEqual[i])) == 0);
      assertTrue(op.intApply((Object)tc.wrap((long)lhsEqual[i]), (Object)BigDecimal.valueOf(rhsEqual[i])) == 0);
      assertTrue(op.intApply((Object)tc.wrap((float)lhsEqual[i]), (Object)BigDecimal.valueOf(rhsEqual[i])) == 0);
      assertTrue(op.intApply((Object)tc.wrap((double)lhsEqual[i]), (Object)BigDecimal.valueOf(rhsEqual[i])) == 0);
      assertTrue(op.intApply((Object)BigInteger.valueOf(lhsEqual[i]), (Object)BigDecimal.valueOf(rhsEqual[i])) == 0);
      assertTrue(op.intApply((Object)BigDecimal.valueOf(lhsEqual[i]), (Object)BigDecimal.valueOf(rhsEqual[i])) == 0);

      assertTrue(op.intApply(tc.wrap((byte)lhsEqual[i]), byteMetaClass, tc.wrap((byte)rhsEqual[i])) == 0);
      assertTrue(op.intApply(tc.wrap((char)lhsEqual[i]), byteMetaClass, tc.wrap((byte)rhsEqual[i])) == 0);
      assertTrue(op.intApply(tc.wrap((short)lhsEqual[i]), byteMetaClass, tc.wrap((byte)rhsEqual[i])) == 0);
      assertTrue(op.intApply(tc.wrap((int)lhsEqual[i]), byteMetaClass, tc.wrap((byte)rhsEqual[i])) == 0);
      assertTrue(op.intApply(tc.wrap((long)lhsEqual[i]), byteMetaClass, tc.wrap((byte)rhsEqual[i])) == 0);
      assertTrue(op.intApply(tc.wrap((float)lhsEqual[i]), byteMetaClass, tc.wrap((byte)rhsEqual[i])) == 0);
      assertTrue(op.intApply(tc.wrap((double)lhsEqual[i]), byteMetaClass, tc.wrap((byte)rhsEqual[i])) == 0);
      assertTrue(op.intApply((Object)BigInteger.valueOf(lhsEqual[i]), byteMetaClass, (Object)tc.wrap((byte)rhsEqual[i])) == 0);
      assertTrue(op.intApply((Object)BigDecimal.valueOf(lhsEqual[i]), byteMetaClass, (Object)tc.wrap((byte)rhsEqual[i])) == 0);

      assertTrue(op.intApply(tc.wrap((byte)lhsEqual[i]), charMetaClass, tc.wrap((char)rhsEqual[i])) == 0);
      assertTrue(op.intApply(tc.wrap((char)lhsEqual[i]), charMetaClass, tc.wrap((char)rhsEqual[i])) == 0);
      assertTrue(op.intApply(tc.wrap((short)lhsEqual[i]), charMetaClass, tc.wrap((char)rhsEqual[i])) == 0);
      assertTrue(op.intApply(tc.wrap((int)lhsEqual[i]), charMetaClass, tc.wrap((char)rhsEqual[i])) == 0);
      assertTrue(op.intApply(tc.wrap((long)lhsEqual[i]), charMetaClass, tc.wrap((char)rhsEqual[i])) == 0);
      assertTrue(op.intApply(tc.wrap((float)lhsEqual[i]), charMetaClass, tc.wrap((char)rhsEqual[i])) == 0);
      assertTrue(op.intApply(tc.wrap((double)lhsEqual[i]), charMetaClass, tc.wrap((char)rhsEqual[i])) == 0);
      assertTrue(op.intApply((Object)BigInteger.valueOf(lhsEqual[i]), charMetaClass, (Object)tc.wrap((char)rhsEqual[i])) == 0);
      assertTrue(op.intApply((Object)BigDecimal.valueOf(lhsEqual[i]), charMetaClass, (Object)tc.wrap((char)rhsEqual[i])) == 0);

      assertTrue(op.intApply(tc.wrap((byte)lhsEqual[i]), shortMetaClass, tc.wrap((short)rhsEqual[i])) == 0);
      assertTrue(op.intApply(tc.wrap((char)lhsEqual[i]), shortMetaClass, tc.wrap((short)rhsEqual[i])) == 0);
      assertTrue(op.intApply(tc.wrap((short)lhsEqual[i]), shortMetaClass, tc.wrap((short)rhsEqual[i])) == 0);
      assertTrue(op.intApply(tc.wrap((int)lhsEqual[i]), shortMetaClass, tc.wrap((short)rhsEqual[i])) == 0);
      assertTrue(op.intApply(tc.wrap((long)lhsEqual[i]), shortMetaClass, tc.wrap((short)rhsEqual[i])) == 0);
      assertTrue(op.intApply(tc.wrap((float)lhsEqual[i]), shortMetaClass, tc.wrap((short)rhsEqual[i])) == 0);
      assertTrue(op.intApply(tc.wrap((double)lhsEqual[i]), shortMetaClass, tc.wrap((short)rhsEqual[i])) == 0);
      assertTrue(op.intApply((Object)BigInteger.valueOf(lhsEqual[i]), shortMetaClass, (Object)tc.wrap((short)rhsEqual[i])) == 0);
      assertTrue(op.intApply((Object)BigDecimal.valueOf(lhsEqual[i]), shortMetaClass, (Object)tc.wrap((short)rhsEqual[i])) == 0);

      assertTrue(op.intApply(tc.wrap((byte)lhsEqual[i]), intMetaClass, tc.wrap((int)rhsEqual[i])) == 0);
      assertTrue(op.intApply(tc.wrap((char)lhsEqual[i]), intMetaClass, tc.wrap((int)rhsEqual[i])) == 0);
      assertTrue(op.intApply(tc.wrap((short)lhsEqual[i]), intMetaClass, tc.wrap((int)rhsEqual[i])) == 0);
      assertTrue(op.intApply(tc.wrap((int)lhsEqual[i]), intMetaClass, tc.wrap((int)rhsEqual[i])) == 0);
      assertTrue(op.intApply(tc.wrap((long)lhsEqual[i]), intMetaClass, tc.wrap((int)rhsEqual[i])) == 0);
      assertTrue(op.intApply(tc.wrap((float)lhsEqual[i]), intMetaClass, tc.wrap((int)rhsEqual[i])) == 0);
      assertTrue(op.intApply(tc.wrap((double)lhsEqual[i]), intMetaClass, tc.wrap((int)rhsEqual[i])) == 0);
      assertTrue(op.intApply((Object)BigInteger.valueOf(lhsEqual[i]), intMetaClass, (Object)tc.wrap((int)rhsEqual[i])) == 0);
      assertTrue(op.intApply((Object)BigDecimal.valueOf(lhsEqual[i]), intMetaClass, (Object)tc.wrap((int)rhsEqual[i])) == 0);

      assertTrue(op.intApply(tc.wrap((byte)lhsEqual[i]), longMetaClass, tc.wrap((long)rhsEqual[i])) == 0);
      assertTrue(op.intApply(tc.wrap((char)lhsEqual[i]), longMetaClass, tc.wrap((long)rhsEqual[i])) == 0);
      assertTrue(op.intApply(tc.wrap((short)lhsEqual[i]), longMetaClass, tc.wrap((long)rhsEqual[i])) == 0);
      assertTrue(op.intApply(tc.wrap((int)lhsEqual[i]), longMetaClass, tc.wrap((long)rhsEqual[i])) == 0);
      assertTrue(op.intApply(tc.wrap((long)lhsEqual[i]), longMetaClass, tc.wrap((long)rhsEqual[i])) == 0);
      assertTrue(op.intApply(tc.wrap((float)lhsEqual[i]), longMetaClass, tc.wrap((long)rhsEqual[i])) == 0);
      assertTrue(op.intApply(tc.wrap((double)lhsEqual[i]), longMetaClass, tc.wrap((long)rhsEqual[i])) == 0);
      assertTrue(op.intApply((Object)BigInteger.valueOf(lhsEqual[i]), longMetaClass, (Object)tc.wrap((long)rhsEqual[i])) == 0);
      assertTrue(op.intApply((Object)BigDecimal.valueOf(lhsEqual[i]), longMetaClass, (Object)tc.wrap((long)rhsEqual[i])) == 0);

      assertTrue(op.intApply(tc.wrap((byte)lhsEqual[i]), floatMetaClass, tc.wrap((float)rhsEqual[i])) == 0);
      assertTrue(op.intApply(tc.wrap((char)lhsEqual[i]), floatMetaClass, tc.wrap((float)rhsEqual[i])) == 0);
      assertTrue(op.intApply(tc.wrap((short)lhsEqual[i]), floatMetaClass, tc.wrap((float)rhsEqual[i])) == 0);
      assertTrue(op.intApply(tc.wrap((int)lhsEqual[i]), floatMetaClass, tc.wrap((float)rhsEqual[i])) == 0);
      assertTrue(op.intApply(tc.wrap((long)lhsEqual[i]), floatMetaClass, tc.wrap((float)rhsEqual[i])) == 0);
      assertTrue(op.intApply(tc.wrap((float)lhsEqual[i]), floatMetaClass, tc.wrap((float)rhsEqual[i])) == 0);
      assertTrue(op.intApply(tc.wrap((double)lhsEqual[i]), floatMetaClass, tc.wrap((float)rhsEqual[i])) == 0);
      assertTrue(op.intApply((Object)BigInteger.valueOf(lhsEqual[i]), floatMetaClass, (Object)tc.wrap((float)rhsEqual[i])) == 0);
      assertTrue(op.intApply((Object)BigDecimal.valueOf(lhsEqual[i]), floatMetaClass, (Object)tc.wrap((float)rhsEqual[i])) == 0);

      assertTrue(op.intApply(tc.wrap((byte)lhsEqual[i]), doubleMetaClass, tc.wrap((double)rhsEqual[i])) == 0);
      assertTrue(op.intApply(tc.wrap((char)lhsEqual[i]), doubleMetaClass, tc.wrap((double)rhsEqual[i])) == 0);
      assertTrue(op.intApply(tc.wrap((short)lhsEqual[i]), doubleMetaClass, tc.wrap((double)rhsEqual[i])) == 0);
      assertTrue(op.intApply(tc.wrap((int)lhsEqual[i]), doubleMetaClass, tc.wrap((double)rhsEqual[i])) == 0);
      assertTrue(op.intApply(tc.wrap((long)lhsEqual[i]), doubleMetaClass, tc.wrap((double)rhsEqual[i])) == 0);
      assertTrue(op.intApply(tc.wrap((float)lhsEqual[i]), doubleMetaClass, tc.wrap((double)rhsEqual[i])) == 0);
      assertTrue(op.intApply(tc.wrap((double)lhsEqual[i]), doubleMetaClass, tc.wrap((double)rhsEqual[i])) == 0);
      assertTrue(op.intApply((Object)BigInteger.valueOf(lhsEqual[i]), doubleMetaClass, (Object)tc.wrap((double)rhsEqual[i])) == 0);
      assertTrue(op.intApply((Object)BigDecimal.valueOf(lhsEqual[i]), doubleMetaClass, (Object)tc.wrap((double)rhsEqual[i])) == 0);

      assertTrue(op.intApply(tc.wrap((byte)lhsEqual[i]), bigIntegerMetaClass, BigInteger.valueOf(rhsEqual[i])) == 0);
      assertTrue(op.intApply(tc.wrap((char)lhsEqual[i]), bigIntegerMetaClass, BigInteger.valueOf(rhsEqual[i])) == 0);
      assertTrue(op.intApply(tc.wrap((short)lhsEqual[i]), bigIntegerMetaClass, BigInteger.valueOf(rhsEqual[i])) == 0);
      assertTrue(op.intApply(tc.wrap((int)lhsEqual[i]), bigIntegerMetaClass, BigInteger.valueOf(rhsEqual[i])) == 0);
      assertTrue(op.intApply(tc.wrap((long)lhsEqual[i]), bigIntegerMetaClass, BigInteger.valueOf(rhsEqual[i])) == 0);
      assertTrue(op.intApply(tc.wrap((float)lhsEqual[i]), bigIntegerMetaClass, BigInteger.valueOf(rhsEqual[i])) == 0);
      assertTrue(op.intApply(tc.wrap((double)lhsEqual[i]), bigIntegerMetaClass, BigInteger.valueOf(rhsEqual[i])) == 0);
      assertTrue(op.intApply((Object)BigInteger.valueOf(lhsEqual[i]), bigIntegerMetaClass, (Object)BigInteger.valueOf(rhsEqual[i])) == 0);
      assertTrue(op.intApply((Object)BigDecimal.valueOf(lhsEqual[i]), bigIntegerMetaClass, (Object)BigInteger.valueOf(rhsEqual[i])) == 0);

      assertTrue(op.intApply(tc.wrap((byte)lhsEqual[i]), bigDecimalMetaClass, BigDecimal.valueOf(rhsEqual[i])) == 0);
      assertTrue(op.intApply(tc.wrap((char)lhsEqual[i]), bigDecimalMetaClass, BigDecimal.valueOf(rhsEqual[i])) == 0);
      assertTrue(op.intApply(tc.wrap((short)lhsEqual[i]), bigDecimalMetaClass, BigDecimal.valueOf(rhsEqual[i])) == 0);
      assertTrue(op.intApply(tc.wrap((int)lhsEqual[i]), bigDecimalMetaClass, BigDecimal.valueOf(rhsEqual[i])) == 0);
      assertTrue(op.intApply(tc.wrap((long)lhsEqual[i]), bigDecimalMetaClass, BigDecimal.valueOf(rhsEqual[i])) == 0);
      assertTrue(op.intApply(tc.wrap((float)lhsEqual[i]), bigDecimalMetaClass, BigDecimal.valueOf(rhsEqual[i])) == 0);
      assertTrue(op.intApply(tc.wrap((double)lhsEqual[i]), bigDecimalMetaClass, BigDecimal.valueOf(rhsEqual[i])) == 0);
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

      assertTrue(tc.unwrapToInt(op.apply((byte)lhsLessThan[i], tc.wrap((byte)rhsLessThan[i]))) == -1);
      assertTrue(tc.unwrapToInt(op.apply((char)lhsLessThan[i], tc.wrap((byte)rhsLessThan[i]))) == -1);
      assertTrue(tc.unwrapToInt(op.apply((short)lhsLessThan[i], tc.wrap((byte)rhsLessThan[i]))) == -1);
      assertTrue(tc.unwrapToInt(op.apply(lhsLessThan[i], tc.wrap((byte)rhsLessThan[i]))) == -1);
      assertTrue(tc.unwrapToInt(op.apply((long)lhsLessThan[i], tc.wrap((byte)rhsLessThan[i]))) == -1);
      assertTrue(tc.unwrapToInt(op.apply((float)lhsLessThan[i], tc.wrap((byte)rhsLessThan[i]))) == -1);
      assertTrue(tc.unwrapToInt(op.apply((double)lhsLessThan[i], tc.wrap((byte)rhsLessThan[i]))) == -1);
      assertTrue(tc.unwrapToInt(op.apply(BigInteger.valueOf(lhsLessThan[i]), tc.wrap((byte)rhsLessThan[i]))) == -1);
      assertTrue(tc.unwrapToInt(op.apply(BigDecimal.valueOf(lhsLessThan[i]), tc.wrap((byte)rhsLessThan[i]))) == -1);

      assertTrue(tc.unwrapToInt(op.apply((byte)lhsLessThan[i], tc.wrap((char)rhsLessThan[i]))) == -1);
      assertTrue(tc.unwrapToInt(op.apply((char)lhsLessThan[i], tc.wrap((char)rhsLessThan[i]))) == -1);
      assertTrue(tc.unwrapToInt(op.apply((short)lhsLessThan[i], tc.wrap((char)rhsLessThan[i]))) == -1);
      assertTrue(tc.unwrapToInt(op.apply(lhsLessThan[i], tc.wrap((char)rhsLessThan[i]))) == -1);
      assertTrue(tc.unwrapToInt(op.apply((long)lhsLessThan[i], tc.wrap((char)rhsLessThan[i]))) == -1);
      assertTrue(tc.unwrapToInt(op.apply((float)lhsLessThan[i], tc.wrap((char)rhsLessThan[i]))) == -1);
      assertTrue(tc.unwrapToInt(op.apply((double)lhsLessThan[i], tc.wrap((char)rhsLessThan[i]))) == -1);
      assertTrue(tc.unwrapToInt(op.apply(BigInteger.valueOf(lhsLessThan[i]), tc.wrap((char)rhsLessThan[i]))) == -1);
      assertTrue(tc.unwrapToInt(op.apply(BigDecimal.valueOf(lhsLessThan[i]), tc.wrap((char)rhsLessThan[i]))) == -1);

      assertTrue(tc.unwrapToInt(op.apply((byte)lhsLessThan[i], tc.wrap((short)rhsLessThan[i]))) == -1);
      assertTrue(tc.unwrapToInt(op.apply((char)lhsLessThan[i], tc.wrap((short)rhsLessThan[i]))) == -1);
      assertTrue(tc.unwrapToInt(op.apply((short)lhsLessThan[i], tc.wrap((short)rhsLessThan[i]))) == -1);
      assertTrue(tc.unwrapToInt(op.apply(lhsLessThan[i], tc.wrap((short)rhsLessThan[i]))) == -1);
      assertTrue(tc.unwrapToInt(op.apply((long)lhsLessThan[i], tc.wrap((short)rhsLessThan[i]))) == -1);
      assertTrue(tc.unwrapToInt(op.apply((float)lhsLessThan[i], tc.wrap((short)rhsLessThan[i]))) == -1);
      assertTrue(tc.unwrapToInt(op.apply((double)lhsLessThan[i], tc.wrap((short)rhsLessThan[i]))) == -1);
      assertTrue(tc.unwrapToInt(op.apply(BigInteger.valueOf(lhsLessThan[i]), tc.wrap((short)rhsLessThan[i]))) == -1);
      assertTrue(tc.unwrapToInt(op.apply(BigDecimal.valueOf(lhsLessThan[i]), tc.wrap((short)rhsLessThan[i]))) == -1);

      assertTrue(tc.unwrapToInt(op.apply((byte)lhsLessThan[i], tc.wrap((int)rhsLessThan[i]))) == -1);
      assertTrue(tc.unwrapToInt(op.apply((char)lhsLessThan[i], tc.wrap((int)rhsLessThan[i]))) == -1);
      assertTrue(tc.unwrapToInt(op.apply((short)lhsLessThan[i], tc.wrap((int)rhsLessThan[i]))) == -1);
      assertTrue(tc.unwrapToInt(op.apply(lhsLessThan[i], tc.wrap((int)rhsLessThan[i]))) == -1);
      assertTrue(tc.unwrapToInt(op.apply((long)lhsLessThan[i], tc.wrap((int)rhsLessThan[i]))) == -1);
      assertTrue(tc.unwrapToInt(op.apply((float)lhsLessThan[i], tc.wrap((int)rhsLessThan[i]))) == -1);
      assertTrue(tc.unwrapToInt(op.apply((double)lhsLessThan[i], tc.wrap((int)rhsLessThan[i]))) == -1);
      assertTrue(tc.unwrapToInt(op.apply(BigInteger.valueOf(lhsLessThan[i]), tc.wrap((int)rhsLessThan[i]))) == -1);
      assertTrue(tc.unwrapToInt(op.apply(BigDecimal.valueOf(lhsLessThan[i]), tc.wrap((int)rhsLessThan[i]))) == -1);

      assertTrue(tc.unwrapToInt(op.apply((byte)lhsLessThan[i], tc.wrap((long)rhsLessThan[i]))) == -1);
      assertTrue(tc.unwrapToInt(op.apply((char)lhsLessThan[i], tc.wrap((long)rhsLessThan[i]))) == -1);
      assertTrue(tc.unwrapToInt(op.apply((short)lhsLessThan[i], tc.wrap((long)rhsLessThan[i]))) == -1);
      assertTrue(tc.unwrapToInt(op.apply(lhsLessThan[i], tc.wrap((long)rhsLessThan[i]))) == -1);
      assertTrue(tc.unwrapToInt(op.apply((long)lhsLessThan[i], tc.wrap((long)rhsLessThan[i]))) == -1);
      assertTrue(tc.unwrapToInt(op.apply((float)lhsLessThan[i], tc.wrap((long)rhsLessThan[i]))) == -1);
      assertTrue(tc.unwrapToInt(op.apply((double)lhsLessThan[i], tc.wrap((long)rhsLessThan[i]))) == -1);
      assertTrue(tc.unwrapToInt(op.apply(BigInteger.valueOf(lhsLessThan[i]), tc.wrap((long)rhsLessThan[i]))) == -1);
      assertTrue(tc.unwrapToInt(op.apply(BigDecimal.valueOf(lhsLessThan[i]), tc.wrap((long)rhsLessThan[i]))) == -1);

      assertTrue(tc.unwrapToInt(op.apply((byte)lhsLessThan[i], tc.wrap((float)rhsLessThan[i]))) == -1);
      assertTrue(tc.unwrapToInt(op.apply((char)lhsLessThan[i], tc.wrap((float)rhsLessThan[i]))) == -1);
      assertTrue(tc.unwrapToInt(op.apply((short)lhsLessThan[i], tc.wrap((float)rhsLessThan[i]))) == -1);
      assertTrue(tc.unwrapToInt(op.apply(lhsLessThan[i], tc.wrap((float)rhsLessThan[i]))) == -1);
      assertTrue(tc.unwrapToInt(op.apply((long)lhsLessThan[i], tc.wrap((float)rhsLessThan[i]))) == -1);
      assertTrue(tc.unwrapToInt(op.apply((float)lhsLessThan[i], tc.wrap((float)rhsLessThan[i]))) == -1);
      assertTrue(tc.unwrapToInt(op.apply((double)lhsLessThan[i], tc.wrap((float)rhsLessThan[i]))) == -1);
      assertTrue(tc.unwrapToInt(op.apply(BigInteger.valueOf(lhsLessThan[i]), tc.wrap((float)rhsLessThan[i]))) == -1);
      assertTrue(tc.unwrapToInt(op.apply(BigDecimal.valueOf(lhsLessThan[i]), tc.wrap((float)rhsLessThan[i]))) == -1);

      assertTrue(tc.unwrapToInt(op.apply((byte)lhsLessThan[i], tc.wrap((double)rhsLessThan[i]))) == -1);
      assertTrue(tc.unwrapToInt(op.apply((char)lhsLessThan[i], tc.wrap((double)rhsLessThan[i]))) == -1);
      assertTrue(tc.unwrapToInt(op.apply((short)lhsLessThan[i], tc.wrap((double)rhsLessThan[i]))) == -1);
      assertTrue(tc.unwrapToInt(op.apply(lhsLessThan[i], tc.wrap((double)rhsLessThan[i]))) == -1);
      assertTrue(tc.unwrapToInt(op.apply((long)lhsLessThan[i], tc.wrap((double)rhsLessThan[i]))) == -1);
      assertTrue(tc.unwrapToInt(op.apply((float)lhsLessThan[i], tc.wrap((double)rhsLessThan[i]))) == -1);
      assertTrue(tc.unwrapToInt(op.apply((double)lhsLessThan[i], tc.wrap((double)rhsLessThan[i]))) == -1);
      assertTrue(tc.unwrapToInt(op.apply(BigInteger.valueOf(lhsLessThan[i]), tc.wrap((double)rhsLessThan[i]))) == -1);
      assertTrue(tc.unwrapToInt(op.apply(BigDecimal.valueOf(lhsLessThan[i]), tc.wrap((double)rhsLessThan[i]))) == -1);

      assertTrue(tc.unwrapToInt(op.apply(tc.wrap((byte)lhsLessThan[i]), tc.wrap((byte)rhsLessThan[i]))) == -1);
      assertTrue(tc.unwrapToInt(op.apply(tc.wrap((char)lhsLessThan[i]), tc.wrap((byte)rhsLessThan[i]))) == -1);
      assertTrue(tc.unwrapToInt(op.apply(tc.wrap((short)lhsLessThan[i]), tc.wrap((byte)rhsLessThan[i]))) == -1);
      assertTrue(tc.unwrapToInt(op.apply(tc.wrap((int)lhsLessThan[i]), tc.wrap((byte)rhsLessThan[i]))) == -1);
      assertTrue(tc.unwrapToInt(op.apply(tc.wrap((long)lhsLessThan[i]), tc.wrap((byte)rhsLessThan[i]))) == -1);
      assertTrue(tc.unwrapToInt(op.apply(tc.wrap((float)lhsLessThan[i]), tc.wrap((byte)rhsLessThan[i]))) == -1);
      assertTrue(tc.unwrapToInt(op.apply(tc.wrap((double)lhsLessThan[i]), tc.wrap((byte)rhsLessThan[i]))) == -1);
      assertTrue(tc.unwrapToInt(op.apply(BigInteger.valueOf(lhsLessThan[i]), tc.wrap((byte)rhsLessThan[i]))) == -1);
      assertTrue(tc.unwrapToInt(op.apply(BigDecimal.valueOf(lhsLessThan[i]), tc.wrap((byte)rhsLessThan[i]))) == -1);

      assertTrue(tc.unwrapToInt(op.apply(tc.wrap((byte)lhsLessThan[i]), tc.wrap((char)rhsLessThan[i]))) == -1);
      assertTrue(tc.unwrapToInt(op.apply(tc.wrap((char)lhsLessThan[i]), tc.wrap((char)rhsLessThan[i]))) == -1);
      assertTrue(tc.unwrapToInt(op.apply(tc.wrap((short)lhsLessThan[i]), tc.wrap((char)rhsLessThan[i]))) == -1);
      assertTrue(tc.unwrapToInt(op.apply(tc.wrap((int)lhsLessThan[i]), tc.wrap((char)rhsLessThan[i]))) == -1);
      assertTrue(tc.unwrapToInt(op.apply(tc.wrap((long)lhsLessThan[i]), tc.wrap((char)rhsLessThan[i]))) == -1);
      assertTrue(tc.unwrapToInt(op.apply(tc.wrap((float)lhsLessThan[i]), tc.wrap((char)rhsLessThan[i]))) == -1);
      assertTrue(tc.unwrapToInt(op.apply(tc.wrap((double)lhsLessThan[i]), tc.wrap((char)rhsLessThan[i]))) == -1);
      assertTrue(tc.unwrapToInt(op.apply(BigInteger.valueOf(lhsLessThan[i]), tc.wrap((char)rhsLessThan[i]))) == -1);
      assertTrue(tc.unwrapToInt(op.apply(BigDecimal.valueOf(lhsLessThan[i]), tc.wrap((char)rhsLessThan[i]))) == -1);

      assertTrue(tc.unwrapToInt(op.apply(tc.wrap((byte)lhsLessThan[i]), tc.wrap((short)rhsLessThan[i]))) == -1);
      assertTrue(tc.unwrapToInt(op.apply(tc.wrap((char)lhsLessThan[i]), tc.wrap((short)rhsLessThan[i]))) == -1);
      assertTrue(tc.unwrapToInt(op.apply(tc.wrap((short)lhsLessThan[i]), tc.wrap((short)rhsLessThan[i]))) == -1);
      assertTrue(tc.unwrapToInt(op.apply(tc.wrap((int)lhsLessThan[i]), tc.wrap((short)rhsLessThan[i]))) == -1);
      assertTrue(tc.unwrapToInt(op.apply(tc.wrap((long)lhsLessThan[i]), tc.wrap((short)rhsLessThan[i]))) == -1);
      assertTrue(tc.unwrapToInt(op.apply(tc.wrap((float)lhsLessThan[i]), tc.wrap((short)rhsLessThan[i]))) == -1);
      assertTrue(tc.unwrapToInt(op.apply(tc.wrap((double)lhsLessThan[i]), tc.wrap((short)rhsLessThan[i]))) == -1);
      assertTrue(tc.unwrapToInt(op.apply(BigInteger.valueOf(lhsLessThan[i]), tc.wrap((short)rhsLessThan[i]))) == -1);
      assertTrue(tc.unwrapToInt(op.apply(BigDecimal.valueOf(lhsLessThan[i]), tc.wrap((short)rhsLessThan[i]))) == -1);

      assertTrue(tc.unwrapToInt(op.apply(tc.wrap((byte)lhsLessThan[i]), tc.wrap((int)rhsLessThan[i]))) == -1);
      assertTrue(tc.unwrapToInt(op.apply(tc.wrap((char)lhsLessThan[i]), tc.wrap((int)rhsLessThan[i]))) == -1);
      assertTrue(tc.unwrapToInt(op.apply(tc.wrap((short)lhsLessThan[i]), tc.wrap((int)rhsLessThan[i]))) == -1);
      assertTrue(tc.unwrapToInt(op.apply(tc.wrap((int)lhsLessThan[i]), tc.wrap((int)rhsLessThan[i]))) == -1);
      assertTrue(tc.unwrapToInt(op.apply(tc.wrap((long)lhsLessThan[i]), tc.wrap((int)rhsLessThan[i]))) == -1);
      assertTrue(tc.unwrapToInt(op.apply(tc.wrap((float)lhsLessThan[i]), tc.wrap((int)rhsLessThan[i]))) == -1);
      assertTrue(tc.unwrapToInt(op.apply(tc.wrap((double)lhsLessThan[i]), tc.wrap((int)rhsLessThan[i]))) == -1);
      assertTrue(tc.unwrapToInt(op.apply(BigInteger.valueOf(lhsLessThan[i]), tc.wrap((int)rhsLessThan[i]))) == -1);
      assertTrue(tc.unwrapToInt(op.apply(BigDecimal.valueOf(lhsLessThan[i]), tc.wrap((int)rhsLessThan[i]))) == -1);

      assertTrue(tc.unwrapToInt(op.apply(tc.wrap((byte)lhsLessThan[i]), tc.wrap((long)rhsLessThan[i]))) == -1);
      assertTrue(tc.unwrapToInt(op.apply(tc.wrap((char)lhsLessThan[i]), tc.wrap((long)rhsLessThan[i]))) == -1);
      assertTrue(tc.unwrapToInt(op.apply(tc.wrap((short)lhsLessThan[i]), tc.wrap((long)rhsLessThan[i]))) == -1);
      assertTrue(tc.unwrapToInt(op.apply(tc.wrap((int)lhsLessThan[i]), tc.wrap((long)rhsLessThan[i]))) == -1);
      assertTrue(tc.unwrapToInt(op.apply(tc.wrap((long)lhsLessThan[i]), tc.wrap((long)rhsLessThan[i]))) == -1);
      assertTrue(tc.unwrapToInt(op.apply(tc.wrap((float)lhsLessThan[i]), tc.wrap((long)rhsLessThan[i]))) == -1);
      assertTrue(tc.unwrapToInt(op.apply(tc.wrap((double)lhsLessThan[i]), tc.wrap((long)rhsLessThan[i]))) == -1);
      assertTrue(tc.unwrapToInt(op.apply(BigInteger.valueOf(lhsLessThan[i]), tc.wrap((long)rhsLessThan[i]))) == -1);
      assertTrue(tc.unwrapToInt(op.apply(BigDecimal.valueOf(lhsLessThan[i]), tc.wrap((long)rhsLessThan[i]))) == -1);

      assertTrue(tc.unwrapToInt(op.apply(tc.wrap((byte)lhsLessThan[i]), tc.wrap((float)rhsLessThan[i]))) == -1);
      assertTrue(tc.unwrapToInt(op.apply(tc.wrap((char)lhsLessThan[i]), tc.wrap((float)rhsLessThan[i]))) == -1);
      assertTrue(tc.unwrapToInt(op.apply(tc.wrap((short)lhsLessThan[i]), tc.wrap((float)rhsLessThan[i]))) == -1);
      assertTrue(tc.unwrapToInt(op.apply(tc.wrap((int)lhsLessThan[i]), tc.wrap((float)rhsLessThan[i]))) == -1);
      assertTrue(tc.unwrapToInt(op.apply(tc.wrap((long)lhsLessThan[i]), tc.wrap((float)rhsLessThan[i]))) == -1);
      assertTrue(tc.unwrapToInt(op.apply(tc.wrap((float)lhsLessThan[i]), tc.wrap((float)rhsLessThan[i]))) == -1);
      assertTrue(tc.unwrapToInt(op.apply(tc.wrap((double)lhsLessThan[i]), tc.wrap((float)rhsLessThan[i]))) == -1);
      assertTrue(tc.unwrapToInt(op.apply(BigInteger.valueOf(lhsLessThan[i]), tc.wrap((float)rhsLessThan[i]))) == -1);
      assertTrue(tc.unwrapToInt(op.apply(BigDecimal.valueOf(lhsLessThan[i]), tc.wrap((float)rhsLessThan[i]))) == -1);

      assertTrue(tc.unwrapToInt(op.apply(tc.wrap((byte)lhsLessThan[i]), tc.wrap((double)rhsLessThan[i]))) == -1);
      assertTrue(tc.unwrapToInt(op.apply(tc.wrap((char)lhsLessThan[i]), tc.wrap((double)rhsLessThan[i]))) == -1);
      assertTrue(tc.unwrapToInt(op.apply(tc.wrap((short)lhsLessThan[i]), tc.wrap((double)rhsLessThan[i]))) == -1);
      assertTrue(tc.unwrapToInt(op.apply(tc.wrap((int)lhsLessThan[i]), tc.wrap((double)rhsLessThan[i]))) == -1);
      assertTrue(tc.unwrapToInt(op.apply(tc.wrap((long)lhsLessThan[i]), tc.wrap((double)rhsLessThan[i]))) == -1);
      assertTrue(tc.unwrapToInt(op.apply(tc.wrap((float)lhsLessThan[i]), tc.wrap((double)rhsLessThan[i]))) == -1);
      assertTrue(tc.unwrapToInt(op.apply(tc.wrap((double)lhsLessThan[i]), tc.wrap((double)rhsLessThan[i]))) == -1);
      assertTrue(tc.unwrapToInt(op.apply(BigInteger.valueOf(lhsLessThan[i]), tc.wrap((double)rhsLessThan[i]))) == -1);
      assertTrue(tc.unwrapToInt(op.apply(BigDecimal.valueOf(lhsLessThan[i]), tc.wrap((double)rhsLessThan[i]))) == -1);

      assertTrue(tc.unwrapToInt(op.apply(tc.wrap((byte)lhsLessThan[i]), BigInteger.valueOf(rhsLessThan[i]))) == -1);
      assertTrue(tc.unwrapToInt(op.apply(tc.wrap((char)lhsLessThan[i]), BigInteger.valueOf(rhsLessThan[i]))) == -1);
      assertTrue(tc.unwrapToInt(op.apply(tc.wrap((short)lhsLessThan[i]), BigInteger.valueOf(rhsLessThan[i]))) == -1);
      assertTrue(tc.unwrapToInt(op.apply(tc.wrap((int)lhsLessThan[i]), BigInteger.valueOf(rhsLessThan[i]))) == -1);
      assertTrue(tc.unwrapToInt(op.apply(tc.wrap((long)lhsLessThan[i]), BigInteger.valueOf(rhsLessThan[i]))) == -1);
      assertTrue(tc.unwrapToInt(op.apply(tc.wrap((float)lhsLessThan[i]), BigInteger.valueOf(rhsLessThan[i]))) == -1);
      assertTrue(tc.unwrapToInt(op.apply(tc.wrap((double)lhsLessThan[i]), BigInteger.valueOf(rhsLessThan[i]))) == -1);
      assertTrue(tc.unwrapToInt(op.apply(BigInteger.valueOf(lhsLessThan[i]), BigInteger.valueOf(rhsLessThan[i]))) == -1);
      assertTrue(tc.unwrapToInt(op.apply(BigDecimal.valueOf(lhsLessThan[i]), BigInteger.valueOf(rhsLessThan[i]))) == -1);

      assertTrue(tc.unwrapToInt(op.apply(tc.wrap((byte)lhsLessThan[i]), BigDecimal.valueOf(rhsLessThan[i]))) == -1);
      assertTrue(tc.unwrapToInt(op.apply(tc.wrap((char)lhsLessThan[i]), BigDecimal.valueOf(rhsLessThan[i]))) == -1);
      assertTrue(tc.unwrapToInt(op.apply(tc.wrap((short)lhsLessThan[i]), BigDecimal.valueOf(rhsLessThan[i]))) == -1);
      assertTrue(tc.unwrapToInt(op.apply(tc.wrap((int)lhsLessThan[i]), BigDecimal.valueOf(rhsLessThan[i]))) == -1);
      assertTrue(tc.unwrapToInt(op.apply(tc.wrap((long)lhsLessThan[i]), BigDecimal.valueOf(rhsLessThan[i]))) == -1);
      assertTrue(tc.unwrapToInt(op.apply(tc.wrap((float)lhsLessThan[i]), BigDecimal.valueOf(rhsLessThan[i]))) == -1);
      assertTrue(tc.unwrapToInt(op.apply(tc.wrap((double)lhsLessThan[i]), BigDecimal.valueOf(rhsLessThan[i]))) == -1);
      assertTrue(tc.unwrapToInt(op.apply(BigInteger.valueOf(lhsLessThan[i]), BigDecimal.valueOf(rhsLessThan[i]))) == -1);
      assertTrue(tc.unwrapToInt(op.apply(BigDecimal.valueOf(lhsLessThan[i]), BigDecimal.valueOf(rhsLessThan[i]))) == -1);

      assertTrue(tc.unwrapToInt(op.apply(tc.wrap((byte)lhsLessThan[i]), tc.wrap((byte)rhsLessThan[i]))) == -1);
      assertTrue(tc.unwrapToInt(op.apply(tc.wrap((char)lhsLessThan[i]), tc.wrap((byte)rhsLessThan[i]))) == -1);
      assertTrue(tc.unwrapToInt(op.apply(tc.wrap((short)lhsLessThan[i]), tc.wrap((byte)rhsLessThan[i]))) == -1);
      assertTrue(tc.unwrapToInt(op.apply(tc.wrap((int)lhsLessThan[i]), tc.wrap((byte)rhsLessThan[i]))) == -1);
      assertTrue(tc.unwrapToInt(op.apply(tc.wrap((long)lhsLessThan[i]), tc.wrap((byte)rhsLessThan[i]))) == -1);
      assertTrue(tc.unwrapToInt(op.apply(tc.wrap((float)lhsLessThan[i]), tc.wrap((byte)rhsLessThan[i]))) == -1);
      assertTrue(tc.unwrapToInt(op.apply(tc.wrap((double)lhsLessThan[i]), tc.wrap((byte)rhsLessThan[i]))) == -1);
      assertTrue(tc.unwrapToInt(op.apply((Object)BigInteger.valueOf(lhsLessThan[i]), (Object)tc.wrap((byte)rhsLessThan[i]))) == -1);
      assertTrue(tc.unwrapToInt(op.apply((Object)BigDecimal.valueOf(lhsLessThan[i]), (Object)tc.wrap((byte)rhsLessThan[i]))) == -1);

      assertTrue(tc.unwrapToInt(op.apply(tc.wrap((byte)lhsLessThan[i]), tc.wrap((char)rhsLessThan[i]))) == -1);
      assertTrue(tc.unwrapToInt(op.apply(tc.wrap((char)lhsLessThan[i]), tc.wrap((char)rhsLessThan[i]))) == -1);
      assertTrue(tc.unwrapToInt(op.apply(tc.wrap((short)lhsLessThan[i]), tc.wrap((char)rhsLessThan[i]))) == -1);
      assertTrue(tc.unwrapToInt(op.apply(tc.wrap((int)lhsLessThan[i]), tc.wrap((char)rhsLessThan[i]))) == -1);
      assertTrue(tc.unwrapToInt(op.apply(tc.wrap((long)lhsLessThan[i]), tc.wrap((char)rhsLessThan[i]))) == -1);
      assertTrue(tc.unwrapToInt(op.apply(tc.wrap((float)lhsLessThan[i]), tc.wrap((char)rhsLessThan[i]))) == -1);
      assertTrue(tc.unwrapToInt(op.apply(tc.wrap((double)lhsLessThan[i]), tc.wrap((char)rhsLessThan[i]))) == -1);
      assertTrue(tc.unwrapToInt(op.apply((Object)BigInteger.valueOf(lhsLessThan[i]), (Object)tc.wrap((char)rhsLessThan[i]))) == -1);
      assertTrue(tc.unwrapToInt(op.apply((Object)BigDecimal.valueOf(lhsLessThan[i]), (Object)tc.wrap((char)rhsLessThan[i]))) == -1);

      assertTrue(tc.unwrapToInt(op.apply(tc.wrap((byte)lhsLessThan[i]), tc.wrap((short)rhsLessThan[i]))) == -1);
      assertTrue(tc.unwrapToInt(op.apply(tc.wrap((char)lhsLessThan[i]), tc.wrap((short)rhsLessThan[i]))) == -1);
      assertTrue(tc.unwrapToInt(op.apply(tc.wrap((short)lhsLessThan[i]), tc.wrap((short)rhsLessThan[i]))) == -1);
      assertTrue(tc.unwrapToInt(op.apply(tc.wrap((int)lhsLessThan[i]), tc.wrap((short)rhsLessThan[i]))) == -1);
      assertTrue(tc.unwrapToInt(op.apply(tc.wrap((long)lhsLessThan[i]), tc.wrap((short)rhsLessThan[i]))) == -1);
      assertTrue(tc.unwrapToInt(op.apply(tc.wrap((float)lhsLessThan[i]), tc.wrap((short)rhsLessThan[i]))) == -1);
      assertTrue(tc.unwrapToInt(op.apply(tc.wrap((double)lhsLessThan[i]), tc.wrap((short)rhsLessThan[i]))) == -1);
      assertTrue(tc.unwrapToInt(op.apply((Object)BigInteger.valueOf(lhsLessThan[i]), (Object)tc.wrap((short)rhsLessThan[i]))) == -1);
      assertTrue(tc.unwrapToInt(op.apply((Object)BigDecimal.valueOf(lhsLessThan[i]), (Object)tc.wrap((short)rhsLessThan[i]))) == -1);

      assertTrue(tc.unwrapToInt(op.apply(tc.wrap((byte)lhsLessThan[i]), tc.wrap((int)rhsLessThan[i]))) == -1);
      assertTrue(tc.unwrapToInt(op.apply(tc.wrap((char)lhsLessThan[i]), tc.wrap((int)rhsLessThan[i]))) == -1);
      assertTrue(tc.unwrapToInt(op.apply(tc.wrap((short)lhsLessThan[i]), tc.wrap((int)rhsLessThan[i]))) == -1);
      assertTrue(tc.unwrapToInt(op.apply(tc.wrap((int)lhsLessThan[i]), tc.wrap((int)rhsLessThan[i]))) == -1);
      assertTrue(tc.unwrapToInt(op.apply(tc.wrap((long)lhsLessThan[i]), tc.wrap((int)rhsLessThan[i]))) == -1);
      assertTrue(tc.unwrapToInt(op.apply(tc.wrap((float)lhsLessThan[i]), tc.wrap((int)rhsLessThan[i]))) == -1);
      assertTrue(tc.unwrapToInt(op.apply(tc.wrap((double)lhsLessThan[i]), tc.wrap((int)rhsLessThan[i]))) == -1);
      assertTrue(tc.unwrapToInt(op.apply((Object)BigInteger.valueOf(lhsLessThan[i]), (Object)tc.wrap((int)rhsLessThan[i]))) == -1);
      assertTrue(tc.unwrapToInt(op.apply((Object)BigDecimal.valueOf(lhsLessThan[i]), (Object)tc.wrap((int)rhsLessThan[i]))) == -1);

      assertTrue(tc.unwrapToInt(op.apply(tc.wrap((byte)lhsLessThan[i]), tc.wrap((long)rhsLessThan[i]))) == -1);
      assertTrue(tc.unwrapToInt(op.apply(tc.wrap((char)lhsLessThan[i]), tc.wrap((long)rhsLessThan[i]))) == -1);
      assertTrue(tc.unwrapToInt(op.apply(tc.wrap((short)lhsLessThan[i]), tc.wrap((long)rhsLessThan[i]))) == -1);
      assertTrue(tc.unwrapToInt(op.apply(tc.wrap((int)lhsLessThan[i]), tc.wrap((long)rhsLessThan[i]))) == -1);
      assertTrue(tc.unwrapToInt(op.apply(tc.wrap((long)lhsLessThan[i]), tc.wrap((long)rhsLessThan[i]))) == -1);
      assertTrue(tc.unwrapToInt(op.apply(tc.wrap((float)lhsLessThan[i]), tc.wrap((long)rhsLessThan[i]))) == -1);
      assertTrue(tc.unwrapToInt(op.apply(tc.wrap((double)lhsLessThan[i]), tc.wrap((long)rhsLessThan[i]))) == -1);
      assertTrue(tc.unwrapToInt(op.apply((Object)BigInteger.valueOf(lhsLessThan[i]), (Object)tc.wrap((long)rhsLessThan[i]))) == -1);
      assertTrue(tc.unwrapToInt(op.apply((Object)BigDecimal.valueOf(lhsLessThan[i]), (Object)tc.wrap((long)rhsLessThan[i]))) == -1);

      assertTrue(tc.unwrapToInt(op.apply(tc.wrap((byte)lhsLessThan[i]), tc.wrap((float)rhsLessThan[i]))) == -1);
      assertTrue(tc.unwrapToInt(op.apply(tc.wrap((char)lhsLessThan[i]), tc.wrap((float)rhsLessThan[i]))) == -1);
      assertTrue(tc.unwrapToInt(op.apply(tc.wrap((short)lhsLessThan[i]), tc.wrap((float)rhsLessThan[i]))) == -1);
      assertTrue(tc.unwrapToInt(op.apply(tc.wrap((int)lhsLessThan[i]), tc.wrap((float)rhsLessThan[i]))) == -1);
      assertTrue(tc.unwrapToInt(op.apply(tc.wrap((long)lhsLessThan[i]), tc.wrap((float)rhsLessThan[i]))) == -1);
      assertTrue(tc.unwrapToInt(op.apply(tc.wrap((float)lhsLessThan[i]), tc.wrap((float)rhsLessThan[i]))) == -1);
      assertTrue(tc.unwrapToInt(op.apply(tc.wrap((double)lhsLessThan[i]), tc.wrap((float)rhsLessThan[i]))) == -1);
      assertTrue(tc.unwrapToInt(op.apply((Object)BigInteger.valueOf(lhsLessThan[i]), (Object)tc.wrap((float)rhsLessThan[i]))) == -1);
      assertTrue(tc.unwrapToInt(op.apply((Object)BigDecimal.valueOf(lhsLessThan[i]), (Object)tc.wrap((float)rhsLessThan[i]))) == -1);

      assertTrue(tc.unwrapToInt(op.apply(tc.wrap((byte)lhsLessThan[i]), tc.wrap((double)rhsLessThan[i]))) == -1);
      assertTrue(tc.unwrapToInt(op.apply(tc.wrap((char)lhsLessThan[i]), tc.wrap((double)rhsLessThan[i]))) == -1);
      assertTrue(tc.unwrapToInt(op.apply(tc.wrap((short)lhsLessThan[i]), tc.wrap((double)rhsLessThan[i]))) == -1);
      assertTrue(tc.unwrapToInt(op.apply(tc.wrap((int)lhsLessThan[i]), tc.wrap((double)rhsLessThan[i]))) == -1);
      assertTrue(tc.unwrapToInt(op.apply(tc.wrap((long)lhsLessThan[i]), tc.wrap((double)rhsLessThan[i]))) == -1);
      assertTrue(tc.unwrapToInt(op.apply(tc.wrap((float)lhsLessThan[i]), tc.wrap((double)rhsLessThan[i]))) == -1);
      assertTrue(tc.unwrapToInt(op.apply(tc.wrap((double)lhsLessThan[i]), tc.wrap((double)rhsLessThan[i]))) == -1);
      assertTrue(tc.unwrapToInt(op.apply((Object)BigInteger.valueOf(lhsLessThan[i]), (Object)tc.wrap((double)rhsLessThan[i]))) == -1);
      assertTrue(tc.unwrapToInt(op.apply((Object)BigDecimal.valueOf(lhsLessThan[i]), (Object)tc.wrap((double)rhsLessThan[i]))) == -1);

      assertTrue(tc.unwrapToInt(op.apply((Object)tc.wrap((byte)lhsLessThan[i]), (Object)BigInteger.valueOf(rhsLessThan[i]))) == -1);
      assertTrue(tc.unwrapToInt(op.apply((Object)tc.wrap((char)lhsLessThan[i]), (Object)BigInteger.valueOf(rhsLessThan[i]))) == -1);
      assertTrue(tc.unwrapToInt(op.apply((Object)tc.wrap((short)lhsLessThan[i]), (Object)BigInteger.valueOf(rhsLessThan[i]))) == -1);
      assertTrue(tc.unwrapToInt(op.apply((Object)tc.wrap((int)lhsLessThan[i]), (Object)BigInteger.valueOf(rhsLessThan[i]))) == -1);
      assertTrue(tc.unwrapToInt(op.apply((Object)tc.wrap((long)lhsLessThan[i]), (Object)BigInteger.valueOf(rhsLessThan[i]))) == -1);
      assertTrue(tc.unwrapToInt(op.apply((Object)tc.wrap((float)lhsLessThan[i]), (Object)BigInteger.valueOf(rhsLessThan[i]))) == -1);
      assertTrue(tc.unwrapToInt(op.apply((Object)tc.wrap((double)lhsLessThan[i]), (Object)BigInteger.valueOf(rhsLessThan[i]))) == -1);
      assertTrue(tc.unwrapToInt(op.apply((Object)BigInteger.valueOf(lhsLessThan[i]), (Object)BigInteger.valueOf(rhsLessThan[i]))) == -1);
      assertTrue(tc.unwrapToInt(op.apply((Object)BigDecimal.valueOf(lhsLessThan[i]), (Object)BigInteger.valueOf(rhsLessThan[i]))) == -1);

      assertTrue(tc.unwrapToInt(op.apply((Object)tc.wrap((byte)lhsLessThan[i]), (Object)BigDecimal.valueOf(rhsLessThan[i]))) == -1);
      assertTrue(tc.unwrapToInt(op.apply((Object)tc.wrap((char)lhsLessThan[i]), (Object)BigDecimal.valueOf(rhsLessThan[i]))) == -1);
      assertTrue(tc.unwrapToInt(op.apply((Object)tc.wrap((short)lhsLessThan[i]), (Object)BigDecimal.valueOf(rhsLessThan[i]))) == -1);
      assertTrue(tc.unwrapToInt(op.apply((Object)tc.wrap((int)lhsLessThan[i]), (Object)BigDecimal.valueOf(rhsLessThan[i]))) == -1);
      assertTrue(tc.unwrapToInt(op.apply((Object)tc.wrap((long)lhsLessThan[i]), (Object)BigDecimal.valueOf(rhsLessThan[i]))) == -1);
      assertTrue(tc.unwrapToInt(op.apply((Object)tc.wrap((float)lhsLessThan[i]), (Object)BigDecimal.valueOf(rhsLessThan[i]))) == -1);
      assertTrue(tc.unwrapToInt(op.apply((Object)tc.wrap((double)lhsLessThan[i]), (Object)BigDecimal.valueOf(rhsLessThan[i]))) == -1);
      assertTrue(tc.unwrapToInt(op.apply((Object)BigInteger.valueOf(lhsLessThan[i]), (Object)BigDecimal.valueOf(rhsLessThan[i]))) == -1);
      assertTrue(tc.unwrapToInt(op.apply((Object)BigDecimal.valueOf(lhsLessThan[i]), (Object)BigDecimal.valueOf(rhsLessThan[i]))) == -1);

      assertTrue(op.intApply(tc.wrap((byte)lhsLessThan[i]), tc.wrap((byte)rhsLessThan[i])) == -1);
      assertTrue(op.intApply(tc.wrap((char)lhsLessThan[i]), tc.wrap((byte)rhsLessThan[i])) == -1);
      assertTrue(op.intApply(tc.wrap((short)lhsLessThan[i]), tc.wrap((byte)rhsLessThan[i])) == -1);
      assertTrue(op.intApply(tc.wrap((int)lhsLessThan[i]), tc.wrap((byte)rhsLessThan[i])) == -1);
      assertTrue(op.intApply(tc.wrap((long)lhsLessThan[i]), tc.wrap((byte)rhsLessThan[i])) == -1);
      assertTrue(op.intApply(tc.wrap((float)lhsLessThan[i]), tc.wrap((byte)rhsLessThan[i])) == -1);
      assertTrue(op.intApply(tc.wrap((double)lhsLessThan[i]), tc.wrap((byte)rhsLessThan[i])) == -1);
      assertTrue(op.intApply((Object)BigInteger.valueOf(lhsLessThan[i]), (Object)tc.wrap((byte)rhsLessThan[i])) == -1);
      assertTrue(op.intApply((Object)BigDecimal.valueOf(lhsLessThan[i]), (Object)tc.wrap((byte)rhsLessThan[i])) == -1);

      assertTrue(op.intApply(tc.wrap((byte)lhsLessThan[i]), tc.wrap((char)rhsLessThan[i])) == -1);
      assertTrue(op.intApply(tc.wrap((char)lhsLessThan[i]), tc.wrap((char)rhsLessThan[i])) == -1);
      assertTrue(op.intApply(tc.wrap((short)lhsLessThan[i]), tc.wrap((char)rhsLessThan[i])) == -1);
      assertTrue(op.intApply(tc.wrap((int)lhsLessThan[i]), tc.wrap((char)rhsLessThan[i])) == -1);
      assertTrue(op.intApply(tc.wrap((long)lhsLessThan[i]), tc.wrap((char)rhsLessThan[i])) == -1);
      assertTrue(op.intApply(tc.wrap((float)lhsLessThan[i]), tc.wrap((char)rhsLessThan[i])) == -1);
      assertTrue(op.intApply(tc.wrap((double)lhsLessThan[i]), tc.wrap((char)rhsLessThan[i])) == -1);
      assertTrue(op.intApply((Object)BigInteger.valueOf(lhsLessThan[i]), (Object)tc.wrap((char)rhsLessThan[i])) == -1);
      assertTrue(op.intApply((Object)BigDecimal.valueOf(lhsLessThan[i]), (Object)tc.wrap((char)rhsLessThan[i])) == -1);

      assertTrue(op.intApply(tc.wrap((byte)lhsLessThan[i]), tc.wrap((short)rhsLessThan[i])) == -1);
      assertTrue(op.intApply(tc.wrap((char)lhsLessThan[i]), tc.wrap((short)rhsLessThan[i])) == -1);
      assertTrue(op.intApply(tc.wrap((short)lhsLessThan[i]), tc.wrap((short)rhsLessThan[i])) == -1);
      assertTrue(op.intApply(tc.wrap((int)lhsLessThan[i]), tc.wrap((short)rhsLessThan[i])) == -1);
      assertTrue(op.intApply(tc.wrap((long)lhsLessThan[i]), tc.wrap((short)rhsLessThan[i])) == -1);
      assertTrue(op.intApply(tc.wrap((float)lhsLessThan[i]), tc.wrap((short)rhsLessThan[i])) == -1);
      assertTrue(op.intApply(tc.wrap((double)lhsLessThan[i]), tc.wrap((short)rhsLessThan[i])) == -1);
      assertTrue(op.intApply((Object)BigInteger.valueOf(lhsLessThan[i]), (Object)tc.wrap((short)rhsLessThan[i])) == -1);
      assertTrue(op.intApply((Object)BigDecimal.valueOf(lhsLessThan[i]), (Object)tc.wrap((short)rhsLessThan[i])) == -1);

      assertTrue(op.intApply(tc.wrap((byte)lhsLessThan[i]), tc.wrap((int)rhsLessThan[i])) == -1);
      assertTrue(op.intApply(tc.wrap((char)lhsLessThan[i]), tc.wrap((int)rhsLessThan[i])) == -1);
      assertTrue(op.intApply(tc.wrap((short)lhsLessThan[i]), tc.wrap((int)rhsLessThan[i])) == -1);
      assertTrue(op.intApply(tc.wrap((int)lhsLessThan[i]), tc.wrap((int)rhsLessThan[i])) == -1);
      assertTrue(op.intApply(tc.wrap((long)lhsLessThan[i]), tc.wrap((int)rhsLessThan[i])) == -1);
      assertTrue(op.intApply(tc.wrap((float)lhsLessThan[i]), tc.wrap((int)rhsLessThan[i])) == -1);
      assertTrue(op.intApply(tc.wrap((double)lhsLessThan[i]), tc.wrap((int)rhsLessThan[i])) == -1);
      assertTrue(op.intApply((Object)BigInteger.valueOf(lhsLessThan[i]), (Object)tc.wrap((int)rhsLessThan[i])) == -1);
      assertTrue(op.intApply((Object)BigDecimal.valueOf(lhsLessThan[i]), (Object)tc.wrap((int)rhsLessThan[i])) == -1);

      assertTrue(op.intApply(tc.wrap((byte)lhsLessThan[i]), tc.wrap((long)rhsLessThan[i])) == -1);
      assertTrue(op.intApply(tc.wrap((char)lhsLessThan[i]), tc.wrap((long)rhsLessThan[i])) == -1);
      assertTrue(op.intApply(tc.wrap((short)lhsLessThan[i]), tc.wrap((long)rhsLessThan[i])) == -1);
      assertTrue(op.intApply(tc.wrap((int)lhsLessThan[i]), tc.wrap((long)rhsLessThan[i])) == -1);
      assertTrue(op.intApply(tc.wrap((long)lhsLessThan[i]), tc.wrap((long)rhsLessThan[i])) == -1);
      assertTrue(op.intApply(tc.wrap((float)lhsLessThan[i]), tc.wrap((long)rhsLessThan[i])) == -1);
      assertTrue(op.intApply(tc.wrap((double)lhsLessThan[i]), tc.wrap((long)rhsLessThan[i])) == -1);
      assertTrue(op.intApply((Object)BigInteger.valueOf(lhsLessThan[i]), (Object)tc.wrap((long)rhsLessThan[i])) == -1);
      assertTrue(op.intApply((Object)BigDecimal.valueOf(lhsLessThan[i]), (Object)tc.wrap((long)rhsLessThan[i])) == -1);

      assertTrue(op.intApply(tc.wrap((byte)lhsLessThan[i]), tc.wrap((float)rhsLessThan[i])) == -1);
      assertTrue(op.intApply(tc.wrap((char)lhsLessThan[i]), tc.wrap((float)rhsLessThan[i])) == -1);
      assertTrue(op.intApply(tc.wrap((short)lhsLessThan[i]), tc.wrap((float)rhsLessThan[i])) == -1);
      assertTrue(op.intApply(tc.wrap((int)lhsLessThan[i]), tc.wrap((float)rhsLessThan[i])) == -1);
      assertTrue(op.intApply(tc.wrap((long)lhsLessThan[i]), tc.wrap((float)rhsLessThan[i])) == -1);
      assertTrue(op.intApply(tc.wrap((float)lhsLessThan[i]), tc.wrap((float)rhsLessThan[i])) == -1);
      assertTrue(op.intApply(tc.wrap((double)lhsLessThan[i]), tc.wrap((float)rhsLessThan[i])) == -1);
      assertTrue(op.intApply((Object)BigInteger.valueOf(lhsLessThan[i]), (Object)tc.wrap((float)rhsLessThan[i])) == -1);
      assertTrue(op.intApply((Object)BigDecimal.valueOf(lhsLessThan[i]), (Object)tc.wrap((float)rhsLessThan[i])) == -1);

      assertTrue(op.intApply(tc.wrap((byte)lhsLessThan[i]), tc.wrap((double)rhsLessThan[i])) == -1);
      assertTrue(op.intApply(tc.wrap((char)lhsLessThan[i]), tc.wrap((double)rhsLessThan[i])) == -1);
      assertTrue(op.intApply(tc.wrap((short)lhsLessThan[i]), tc.wrap((double)rhsLessThan[i])) == -1);
      assertTrue(op.intApply(tc.wrap((int)lhsLessThan[i]), tc.wrap((double)rhsLessThan[i])) == -1);
      assertTrue(op.intApply(tc.wrap((long)lhsLessThan[i]), tc.wrap((double)rhsLessThan[i])) == -1);
      assertTrue(op.intApply(tc.wrap((float)lhsLessThan[i]), tc.wrap((double)rhsLessThan[i])) == -1);
      assertTrue(op.intApply(tc.wrap((double)lhsLessThan[i]), tc.wrap((double)rhsLessThan[i])) == -1);
      assertTrue(op.intApply((Object)BigInteger.valueOf(lhsLessThan[i]), (Object)tc.wrap((double)rhsLessThan[i])) == -1);
      assertTrue(op.intApply((Object)BigDecimal.valueOf(lhsLessThan[i]), (Object)tc.wrap((double)rhsLessThan[i])) == -1);

      assertTrue(op.intApply((Object)tc.wrap((byte)lhsLessThan[i]), (Object)BigInteger.valueOf(rhsLessThan[i])) == -1);
      assertTrue(op.intApply((Object)tc.wrap((char)lhsLessThan[i]), (Object)BigInteger.valueOf(rhsLessThan[i])) == -1);
      assertTrue(op.intApply((Object)tc.wrap((short)lhsLessThan[i]), (Object)BigInteger.valueOf(rhsLessThan[i])) == -1);
      assertTrue(op.intApply((Object)tc.wrap((int)lhsLessThan[i]), (Object)BigInteger.valueOf(rhsLessThan[i])) == -1);
      assertTrue(op.intApply((Object)tc.wrap((long)lhsLessThan[i]), (Object)BigInteger.valueOf(rhsLessThan[i])) == -1);
      assertTrue(op.intApply((Object)tc.wrap((float)lhsLessThan[i]), (Object)BigInteger.valueOf(rhsLessThan[i])) == -1);
      assertTrue(op.intApply((Object)tc.wrap((double)lhsLessThan[i]), (Object)BigInteger.valueOf(rhsLessThan[i])) == -1);
      assertTrue(op.intApply((Object)BigInteger.valueOf(lhsLessThan[i]), (Object)BigInteger.valueOf(rhsLessThan[i])) == -1);
      assertTrue(op.intApply((Object)BigDecimal.valueOf(lhsLessThan[i]), (Object)BigInteger.valueOf(rhsLessThan[i])) == -1);

      assertTrue(op.intApply((Object)tc.wrap((byte)lhsLessThan[i]), (Object)BigDecimal.valueOf(rhsLessThan[i])) == -1);
      assertTrue(op.intApply((Object)tc.wrap((char)lhsLessThan[i]), (Object)BigDecimal.valueOf(rhsLessThan[i])) == -1);
      assertTrue(op.intApply((Object)tc.wrap((short)lhsLessThan[i]), (Object)BigDecimal.valueOf(rhsLessThan[i])) == -1);
      assertTrue(op.intApply((Object)tc.wrap((int)lhsLessThan[i]), (Object)BigDecimal.valueOf(rhsLessThan[i])) == -1);
      assertTrue(op.intApply((Object)tc.wrap((long)lhsLessThan[i]), (Object)BigDecimal.valueOf(rhsLessThan[i])) == -1);
      assertTrue(op.intApply((Object)tc.wrap((float)lhsLessThan[i]), (Object)BigDecimal.valueOf(rhsLessThan[i])) == -1);
      assertTrue(op.intApply((Object)tc.wrap((double)lhsLessThan[i]), (Object)BigDecimal.valueOf(rhsLessThan[i])) == -1);
      assertTrue(op.intApply((Object)BigInteger.valueOf(lhsLessThan[i]), (Object)BigDecimal.valueOf(rhsLessThan[i])) == -1);
      assertTrue(op.intApply((Object)BigDecimal.valueOf(lhsLessThan[i]), (Object)BigDecimal.valueOf(rhsLessThan[i])) == -1);

      assertTrue(op.intApply(tc.wrap((byte)lhsLessThan[i]), byteMetaClass, tc.wrap((byte)rhsLessThan[i])) == -1);
      assertTrue(op.intApply(tc.wrap((char)lhsLessThan[i]), byteMetaClass, tc.wrap((byte)rhsLessThan[i])) == -1);
      assertTrue(op.intApply(tc.wrap((short)lhsLessThan[i]), byteMetaClass, tc.wrap((byte)rhsLessThan[i])) == -1);
      assertTrue(op.intApply(tc.wrap((int)lhsLessThan[i]), byteMetaClass, tc.wrap((byte)rhsLessThan[i])) == -1);
      assertTrue(op.intApply(tc.wrap((long)lhsLessThan[i]), byteMetaClass, tc.wrap((byte)rhsLessThan[i])) == -1);
      assertTrue(op.intApply(tc.wrap((float)lhsLessThan[i]), byteMetaClass, tc.wrap((byte)rhsLessThan[i])) == -1);
      assertTrue(op.intApply(tc.wrap((double)lhsLessThan[i]), byteMetaClass, tc.wrap((byte)rhsLessThan[i])) == -1);
      assertTrue(op.intApply((Object)BigInteger.valueOf(lhsLessThan[i]), byteMetaClass, (Object)tc.wrap((byte)rhsLessThan[i])) == -1);
      assertTrue(op.intApply((Object)BigDecimal.valueOf(lhsLessThan[i]), byteMetaClass, (Object)tc.wrap((byte)rhsLessThan[i])) == -1);

      assertTrue(op.intApply(tc.wrap((byte)lhsLessThan[i]), charMetaClass, tc.wrap((char)rhsLessThan[i])) == -1);
      assertTrue(op.intApply(tc.wrap((char)lhsLessThan[i]), charMetaClass, tc.wrap((char)rhsLessThan[i])) == -1);
      assertTrue(op.intApply(tc.wrap((short)lhsLessThan[i]), charMetaClass, tc.wrap((char)rhsLessThan[i])) == -1);
      assertTrue(op.intApply(tc.wrap((int)lhsLessThan[i]), charMetaClass, tc.wrap((char)rhsLessThan[i])) == -1);
      assertTrue(op.intApply(tc.wrap((long)lhsLessThan[i]), charMetaClass, tc.wrap((char)rhsLessThan[i])) == -1);
      assertTrue(op.intApply(tc.wrap((float)lhsLessThan[i]), charMetaClass, tc.wrap((char)rhsLessThan[i])) == -1);
      assertTrue(op.intApply(tc.wrap((double)lhsLessThan[i]), charMetaClass, tc.wrap((char)rhsLessThan[i])) == -1);
      assertTrue(op.intApply((Object)BigInteger.valueOf(lhsLessThan[i]), charMetaClass, (Object)tc.wrap((char)rhsLessThan[i])) == -1);
      assertTrue(op.intApply((Object)BigDecimal.valueOf(lhsLessThan[i]), charMetaClass, (Object)tc.wrap((char)rhsLessThan[i])) == -1);

      assertTrue(op.intApply(tc.wrap((byte)lhsLessThan[i]), shortMetaClass, tc.wrap((short)rhsLessThan[i])) == -1);
      assertTrue(op.intApply(tc.wrap((char)lhsLessThan[i]), shortMetaClass, tc.wrap((short)rhsLessThan[i])) == -1);
      assertTrue(op.intApply(tc.wrap((short)lhsLessThan[i]), shortMetaClass, tc.wrap((short)rhsLessThan[i])) == -1);
      assertTrue(op.intApply(tc.wrap((int)lhsLessThan[i]), shortMetaClass, tc.wrap((short)rhsLessThan[i])) == -1);
      assertTrue(op.intApply(tc.wrap((long)lhsLessThan[i]), shortMetaClass, tc.wrap((short)rhsLessThan[i])) == -1);
      assertTrue(op.intApply(tc.wrap((float)lhsLessThan[i]), shortMetaClass, tc.wrap((short)rhsLessThan[i])) == -1);
      assertTrue(op.intApply(tc.wrap((double)lhsLessThan[i]), shortMetaClass, tc.wrap((short)rhsLessThan[i])) == -1);
      assertTrue(op.intApply((Object)BigInteger.valueOf(lhsLessThan[i]), shortMetaClass, (Object)tc.wrap((short)rhsLessThan[i])) == -1);
      assertTrue(op.intApply((Object)BigDecimal.valueOf(lhsLessThan[i]), shortMetaClass, (Object)tc.wrap((short)rhsLessThan[i])) == -1);

      assertTrue(op.intApply(tc.wrap((byte)lhsLessThan[i]), intMetaClass, tc.wrap((int)rhsLessThan[i])) == -1);
      assertTrue(op.intApply(tc.wrap((char)lhsLessThan[i]), intMetaClass, tc.wrap((int)rhsLessThan[i])) == -1);
      assertTrue(op.intApply(tc.wrap((short)lhsLessThan[i]), intMetaClass, tc.wrap((int)rhsLessThan[i])) == -1);
      assertTrue(op.intApply(tc.wrap((int)lhsLessThan[i]), intMetaClass, tc.wrap((int)rhsLessThan[i])) == -1);
      assertTrue(op.intApply(tc.wrap((long)lhsLessThan[i]), intMetaClass, tc.wrap((int)rhsLessThan[i])) == -1);
      assertTrue(op.intApply(tc.wrap((float)lhsLessThan[i]), intMetaClass, tc.wrap((int)rhsLessThan[i])) == -1);
      assertTrue(op.intApply(tc.wrap((double)lhsLessThan[i]), intMetaClass, tc.wrap((int)rhsLessThan[i])) == -1);
      assertTrue(op.intApply((Object)BigInteger.valueOf(lhsLessThan[i]), intMetaClass, (Object)tc.wrap((int)rhsLessThan[i])) == -1);
      assertTrue(op.intApply((Object)BigDecimal.valueOf(lhsLessThan[i]), intMetaClass, (Object)tc.wrap((int)rhsLessThan[i])) == -1);

      assertTrue(op.intApply(tc.wrap((byte)lhsLessThan[i]), longMetaClass, tc.wrap((long)rhsLessThan[i])) == -1);
      assertTrue(op.intApply(tc.wrap((char)lhsLessThan[i]), longMetaClass, tc.wrap((long)rhsLessThan[i])) == -1);
      assertTrue(op.intApply(tc.wrap((short)lhsLessThan[i]), longMetaClass, tc.wrap((long)rhsLessThan[i])) == -1);
      assertTrue(op.intApply(tc.wrap((int)lhsLessThan[i]), longMetaClass, tc.wrap((long)rhsLessThan[i])) == -1);
      assertTrue(op.intApply(tc.wrap((long)lhsLessThan[i]), longMetaClass, tc.wrap((long)rhsLessThan[i])) == -1);
      assertTrue(op.intApply(tc.wrap((float)lhsLessThan[i]), longMetaClass, tc.wrap((long)rhsLessThan[i])) == -1);
      assertTrue(op.intApply(tc.wrap((double)lhsLessThan[i]), longMetaClass, tc.wrap((long)rhsLessThan[i])) == -1);
      assertTrue(op.intApply((Object)BigInteger.valueOf(lhsLessThan[i]), longMetaClass, (Object)tc.wrap((long)rhsLessThan[i])) == -1);
      assertTrue(op.intApply((Object)BigDecimal.valueOf(lhsLessThan[i]), longMetaClass, (Object)tc.wrap((long)rhsLessThan[i])) == -1);

      assertTrue(op.intApply(tc.wrap((byte)lhsLessThan[i]), floatMetaClass, tc.wrap((float)rhsLessThan[i])) == -1);
      assertTrue(op.intApply(tc.wrap((char)lhsLessThan[i]), floatMetaClass, tc.wrap((float)rhsLessThan[i])) == -1);
      assertTrue(op.intApply(tc.wrap((short)lhsLessThan[i]), floatMetaClass, tc.wrap((float)rhsLessThan[i])) == -1);
      assertTrue(op.intApply(tc.wrap((int)lhsLessThan[i]), floatMetaClass, tc.wrap((float)rhsLessThan[i])) == -1);
      assertTrue(op.intApply(tc.wrap((long)lhsLessThan[i]), floatMetaClass, tc.wrap((float)rhsLessThan[i])) == -1);
      assertTrue(op.intApply(tc.wrap((float)lhsLessThan[i]), floatMetaClass, tc.wrap((float)rhsLessThan[i])) == -1);
      assertTrue(op.intApply(tc.wrap((double)lhsLessThan[i]), floatMetaClass, tc.wrap((float)rhsLessThan[i])) == -1);
      assertTrue(op.intApply((Object)BigInteger.valueOf(lhsLessThan[i]), floatMetaClass, (Object)tc.wrap((float)rhsLessThan[i])) == -1);
      assertTrue(op.intApply((Object)BigDecimal.valueOf(lhsLessThan[i]), floatMetaClass, (Object)tc.wrap((float)rhsLessThan[i])) == -1);

      assertTrue(op.intApply(tc.wrap((byte)lhsLessThan[i]), doubleMetaClass, tc.wrap((double)rhsLessThan[i])) == -1);
      assertTrue(op.intApply(tc.wrap((char)lhsLessThan[i]), doubleMetaClass, tc.wrap((double)rhsLessThan[i])) == -1);
      assertTrue(op.intApply(tc.wrap((short)lhsLessThan[i]), doubleMetaClass, tc.wrap((double)rhsLessThan[i])) == -1);
      assertTrue(op.intApply(tc.wrap((int)lhsLessThan[i]), doubleMetaClass, tc.wrap((double)rhsLessThan[i])) == -1);
      assertTrue(op.intApply(tc.wrap((long)lhsLessThan[i]), doubleMetaClass, tc.wrap((double)rhsLessThan[i])) == -1);
      assertTrue(op.intApply(tc.wrap((float)lhsLessThan[i]), doubleMetaClass, tc.wrap((double)rhsLessThan[i])) == -1);
      assertTrue(op.intApply((Object)tc.wrap((double)lhsLessThan[i]), doubleMetaClass, (Object)tc.wrap((double)rhsLessThan[i])) == -1);
      assertTrue(op.intApply((Object)BigInteger.valueOf(lhsLessThan[i]), doubleMetaClass, (Object)tc.wrap((double)rhsLessThan[i])) == -1);
      assertTrue(op.intApply((Object)BigDecimal.valueOf(lhsLessThan[i]), doubleMetaClass, (Object)tc.wrap((double)rhsLessThan[i])) == -1);

      assertTrue(op.intApply((Object)tc.wrap((byte)lhsLessThan[i]), bigIntegerMetaClass, (Object)BigInteger.valueOf(rhsLessThan[i])) == -1);
      assertTrue(op.intApply((Object)tc.wrap((char)lhsLessThan[i]), bigIntegerMetaClass, (Object)BigInteger.valueOf(rhsLessThan[i])) == -1);
      assertTrue(op.intApply((Object)tc.wrap((short)lhsLessThan[i]), bigIntegerMetaClass, (Object)BigInteger.valueOf(rhsLessThan[i])) == -1);
      assertTrue(op.intApply((Object)tc.wrap((int)lhsLessThan[i]), bigIntegerMetaClass, (Object)BigInteger.valueOf(rhsLessThan[i])) == -1);
      assertTrue(op.intApply((Object)tc.wrap((long)lhsLessThan[i]), bigIntegerMetaClass, (Object)BigInteger.valueOf(rhsLessThan[i])) == -1);
      assertTrue(op.intApply((Object)tc.wrap((float)lhsLessThan[i]), bigIntegerMetaClass, (Object)BigInteger.valueOf(rhsLessThan[i])) == -1);
      assertTrue(op.intApply((Object)tc.wrap((double)lhsLessThan[i]), bigIntegerMetaClass, (Object)BigInteger.valueOf(rhsLessThan[i])) == -1);
      assertTrue(op.intApply((Object)BigInteger.valueOf(lhsLessThan[i]), bigIntegerMetaClass, (Object)BigInteger.valueOf(rhsLessThan[i])) == -1);
      assertTrue(op.intApply((Object)BigDecimal.valueOf(lhsLessThan[i]), bigIntegerMetaClass, (Object)BigInteger.valueOf(rhsLessThan[i])) == -1);

      assertTrue(op.intApply((Object)tc.wrap((byte)lhsLessThan[i]), bigDecimalMetaClass, (Object)BigDecimal.valueOf(rhsLessThan[i])) == -1);
      assertTrue(op.intApply((Object)tc.wrap((char)lhsLessThan[i]), bigDecimalMetaClass, (Object)BigDecimal.valueOf(rhsLessThan[i])) == -1);
      assertTrue(op.intApply((Object)tc.wrap((short)lhsLessThan[i]), bigDecimalMetaClass, (Object)BigDecimal.valueOf(rhsLessThan[i])) == -1);
      assertTrue(op.intApply((Object)tc.wrap((int)lhsLessThan[i]), bigDecimalMetaClass, (Object)BigDecimal.valueOf(rhsLessThan[i])) == -1);
      assertTrue(op.intApply((Object)tc.wrap((long)lhsLessThan[i]), bigDecimalMetaClass, (Object)BigDecimal.valueOf(rhsLessThan[i])) == -1);
      assertTrue(op.intApply((Object)tc.wrap((float)lhsLessThan[i]), bigDecimalMetaClass, (Object)BigDecimal.valueOf(rhsLessThan[i])) == -1);
      assertTrue(op.intApply((Object)tc.wrap((double)lhsLessThan[i]), bigDecimalMetaClass, (Object)BigDecimal.valueOf(rhsLessThan[i])) == -1);
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

      assertTrue(tc.unwrapToInt(op.apply((byte)lhsGreaterThan[i], tc.wrap((byte)rhsGreaterThan[i]))) == 1);
      assertTrue(tc.unwrapToInt(op.apply((char)lhsGreaterThan[i], tc.wrap((byte)rhsGreaterThan[i]))) == 1);
      assertTrue(tc.unwrapToInt(op.apply((short)lhsGreaterThan[i], tc.wrap((byte)rhsGreaterThan[i]))) == 1);
      assertTrue(tc.unwrapToInt(op.apply(lhsGreaterThan[i], tc.wrap((byte)rhsGreaterThan[i]))) == 1);
      assertTrue(tc.unwrapToInt(op.apply((long)lhsGreaterThan[i], tc.wrap((byte)rhsGreaterThan[i]))) == 1);
      assertTrue(tc.unwrapToInt(op.apply((float)lhsGreaterThan[i], tc.wrap((byte)rhsGreaterThan[i]))) == 1);
      assertTrue(tc.unwrapToInt(op.apply((double)lhsGreaterThan[i], tc.wrap((byte)rhsGreaterThan[i]))) == 1);
      assertTrue(tc.unwrapToInt(op.apply(BigInteger.valueOf(lhsGreaterThan[i]), tc.wrap((byte)rhsGreaterThan[i]))) == 1);
      assertTrue(tc.unwrapToInt(op.apply(BigDecimal.valueOf(lhsGreaterThan[i]), tc.wrap((byte)rhsGreaterThan[i]))) == 1);

      assertTrue(tc.unwrapToInt(op.apply((byte)lhsGreaterThan[i], tc.wrap((char)rhsGreaterThan[i]))) == 1);
      assertTrue(tc.unwrapToInt(op.apply((char)lhsGreaterThan[i], tc.wrap((char)rhsGreaterThan[i]))) == 1);
      assertTrue(tc.unwrapToInt(op.apply((short)lhsGreaterThan[i], tc.wrap((char)rhsGreaterThan[i]))) == 1);
      assertTrue(tc.unwrapToInt(op.apply(lhsGreaterThan[i], tc.wrap((char)rhsGreaterThan[i]))) == 1);
      assertTrue(tc.unwrapToInt(op.apply((long)lhsGreaterThan[i], tc.wrap((char)rhsGreaterThan[i]))) == 1);
      assertTrue(tc.unwrapToInt(op.apply((float)lhsGreaterThan[i], tc.wrap((char)rhsGreaterThan[i]))) == 1);
      assertTrue(tc.unwrapToInt(op.apply((double)lhsGreaterThan[i], tc.wrap((char)rhsGreaterThan[i]))) == 1);
      assertTrue(tc.unwrapToInt(op.apply(BigInteger.valueOf(lhsGreaterThan[i]), tc.wrap((char)rhsGreaterThan[i]))) == 1);
      assertTrue(tc.unwrapToInt(op.apply(BigDecimal.valueOf(lhsGreaterThan[i]), tc.wrap((char)rhsGreaterThan[i]))) == 1);

      assertTrue(tc.unwrapToInt(op.apply((byte)lhsGreaterThan[i], tc.wrap((short)rhsGreaterThan[i]))) == 1);
      assertTrue(tc.unwrapToInt(op.apply((char)lhsGreaterThan[i], tc.wrap((short)rhsGreaterThan[i]))) == 1);
      assertTrue(tc.unwrapToInt(op.apply((short)lhsGreaterThan[i], tc.wrap((short)rhsGreaterThan[i]))) == 1);
      assertTrue(tc.unwrapToInt(op.apply(lhsGreaterThan[i], tc.wrap((short)rhsGreaterThan[i]))) == 1);
      assertTrue(tc.unwrapToInt(op.apply((long)lhsGreaterThan[i], tc.wrap((short)rhsGreaterThan[i]))) == 1);
      assertTrue(tc.unwrapToInt(op.apply((float)lhsGreaterThan[i], tc.wrap((short)rhsGreaterThan[i]))) == 1);
      assertTrue(tc.unwrapToInt(op.apply((double)lhsGreaterThan[i], tc.wrap((short)rhsGreaterThan[i]))) == 1);
      assertTrue(tc.unwrapToInt(op.apply(BigInteger.valueOf(lhsGreaterThan[i]), tc.wrap((short)rhsGreaterThan[i]))) == 1);
      assertTrue(tc.unwrapToInt(op.apply(BigDecimal.valueOf(lhsGreaterThan[i]), tc.wrap((short)rhsGreaterThan[i]))) == 1);

      assertTrue(tc.unwrapToInt(op.apply((byte)lhsGreaterThan[i], tc.wrap((int)rhsGreaterThan[i]))) == 1);
      assertTrue(tc.unwrapToInt(op.apply((char)lhsGreaterThan[i], tc.wrap((int)rhsGreaterThan[i]))) == 1);
      assertTrue(tc.unwrapToInt(op.apply((short)lhsGreaterThan[i], tc.wrap((int)rhsGreaterThan[i]))) == 1);
      assertTrue(tc.unwrapToInt(op.apply(lhsGreaterThan[i], tc.wrap((int)rhsGreaterThan[i]))) == 1);
      assertTrue(tc.unwrapToInt(op.apply((long)lhsGreaterThan[i], tc.wrap((int)rhsGreaterThan[i]))) == 1);
      assertTrue(tc.unwrapToInt(op.apply((float)lhsGreaterThan[i], tc.wrap((int)rhsGreaterThan[i]))) == 1);
      assertTrue(tc.unwrapToInt(op.apply((double)lhsGreaterThan[i], tc.wrap((int)rhsGreaterThan[i]))) == 1);
      assertTrue(tc.unwrapToInt(op.apply(BigInteger.valueOf(lhsGreaterThan[i]), tc.wrap((int)rhsGreaterThan[i]))) == 1);
      assertTrue(tc.unwrapToInt(op.apply(BigDecimal.valueOf(lhsGreaterThan[i]), tc.wrap((int)rhsGreaterThan[i]))) == 1);

      assertTrue(tc.unwrapToInt(op.apply((byte)lhsGreaterThan[i], tc.wrap((long)rhsGreaterThan[i]))) == 1);
      assertTrue(tc.unwrapToInt(op.apply((char)lhsGreaterThan[i], tc.wrap((long)rhsGreaterThan[i]))) == 1);
      assertTrue(tc.unwrapToInt(op.apply((short)lhsGreaterThan[i], tc.wrap((long)rhsGreaterThan[i]))) == 1);
      assertTrue(tc.unwrapToInt(op.apply(lhsGreaterThan[i], tc.wrap((long)rhsGreaterThan[i]))) == 1);
      assertTrue(tc.unwrapToInt(op.apply((long)lhsGreaterThan[i], tc.wrap((long)rhsGreaterThan[i]))) == 1);
      assertTrue(tc.unwrapToInt(op.apply((float)lhsGreaterThan[i], tc.wrap((long)rhsGreaterThan[i]))) == 1);
      assertTrue(tc.unwrapToInt(op.apply((double)lhsGreaterThan[i], tc.wrap((long)rhsGreaterThan[i]))) == 1);
      assertTrue(tc.unwrapToInt(op.apply(BigInteger.valueOf(lhsGreaterThan[i]), tc.wrap((long)rhsGreaterThan[i]))) == 1);
      assertTrue(tc.unwrapToInt(op.apply(BigDecimal.valueOf(lhsGreaterThan[i]), tc.wrap((long)rhsGreaterThan[i]))) == 1);

      assertTrue(tc.unwrapToInt(op.apply((byte)lhsGreaterThan[i], tc.wrap((float)rhsGreaterThan[i]))) == 1);
      assertTrue(tc.unwrapToInt(op.apply((char)lhsGreaterThan[i], tc.wrap((float)rhsGreaterThan[i]))) == 1);
      assertTrue(tc.unwrapToInt(op.apply((short)lhsGreaterThan[i], tc.wrap((float)rhsGreaterThan[i]))) == 1);
      assertTrue(tc.unwrapToInt(op.apply(lhsGreaterThan[i], tc.wrap((float)rhsGreaterThan[i]))) == 1);
      assertTrue(tc.unwrapToInt(op.apply((long)lhsGreaterThan[i], tc.wrap((float)rhsGreaterThan[i]))) == 1);
      assertTrue(tc.unwrapToInt(op.apply((float)lhsGreaterThan[i], tc.wrap((float)rhsGreaterThan[i]))) == 1);
      assertTrue(tc.unwrapToInt(op.apply((double)lhsGreaterThan[i], tc.wrap((float)rhsGreaterThan[i]))) == 1);
      assertTrue(tc.unwrapToInt(op.apply(BigInteger.valueOf(lhsGreaterThan[i]), tc.wrap((float)rhsGreaterThan[i]))) == 1);
      assertTrue(tc.unwrapToInt(op.apply(BigDecimal.valueOf(lhsGreaterThan[i]), tc.wrap((float)rhsGreaterThan[i]))) == 1);

      assertTrue(tc.unwrapToInt(op.apply((byte)lhsGreaterThan[i], tc.wrap((double)rhsGreaterThan[i]))) == 1);
      assertTrue(tc.unwrapToInt(op.apply((char)lhsGreaterThan[i], tc.wrap((double)rhsGreaterThan[i]))) == 1);
      assertTrue(tc.unwrapToInt(op.apply((short)lhsGreaterThan[i], tc.wrap((double)rhsGreaterThan[i]))) == 1);
      assertTrue(tc.unwrapToInt(op.apply(lhsGreaterThan[i], tc.wrap((double)rhsGreaterThan[i]))) == 1);
      assertTrue(tc.unwrapToInt(op.apply((long)lhsGreaterThan[i], tc.wrap((double)rhsGreaterThan[i]))) == 1);
      assertTrue(tc.unwrapToInt(op.apply((float)lhsGreaterThan[i], tc.wrap((double)rhsGreaterThan[i]))) == 1);
      assertTrue(tc.unwrapToInt(op.apply((double)lhsGreaterThan[i], tc.wrap((double)rhsGreaterThan[i]))) == 1);
      assertTrue(tc.unwrapToInt(op.apply(BigInteger.valueOf(lhsGreaterThan[i]), tc.wrap((double)rhsGreaterThan[i]))) == 1);
      assertTrue(tc.unwrapToInt(op.apply(BigDecimal.valueOf(lhsGreaterThan[i]), tc.wrap((double)rhsGreaterThan[i]))) == 1);

      assertTrue(tc.unwrapToInt(op.apply(tc.wrap((byte)lhsGreaterThan[i]), tc.wrap((byte)rhsGreaterThan[i]))) == 1);
      assertTrue(tc.unwrapToInt(op.apply(tc.wrap((char)lhsGreaterThan[i]), tc.wrap((byte)rhsGreaterThan[i]))) == 1);
      assertTrue(tc.unwrapToInt(op.apply(tc.wrap((short)lhsGreaterThan[i]), tc.wrap((byte)rhsGreaterThan[i]))) == 1);
      assertTrue(tc.unwrapToInt(op.apply(tc.wrap((int)lhsGreaterThan[i]), tc.wrap((byte)rhsGreaterThan[i]))) == 1);
      assertTrue(tc.unwrapToInt(op.apply(tc.wrap((long)lhsGreaterThan[i]), tc.wrap((byte)rhsGreaterThan[i]))) == 1);
      assertTrue(tc.unwrapToInt(op.apply(tc.wrap((float)lhsGreaterThan[i]), tc.wrap((byte)rhsGreaterThan[i]))) == 1);
      assertTrue(tc.unwrapToInt(op.apply(tc.wrap((double)lhsGreaterThan[i]), tc.wrap((byte)rhsGreaterThan[i]))) == 1);
      assertTrue(tc.unwrapToInt(op.apply(BigInteger.valueOf(lhsGreaterThan[i]), tc.wrap((byte)rhsGreaterThan[i]))) == 1);
      assertTrue(tc.unwrapToInt(op.apply(BigDecimal.valueOf(lhsGreaterThan[i]), tc.wrap((byte)rhsGreaterThan[i]))) == 1);

      assertTrue(tc.unwrapToInt(op.apply(tc.wrap((byte)lhsGreaterThan[i]), tc.wrap((char)rhsGreaterThan[i]))) == 1);
      assertTrue(tc.unwrapToInt(op.apply(tc.wrap((char)lhsGreaterThan[i]), tc.wrap((char)rhsGreaterThan[i]))) == 1);
      assertTrue(tc.unwrapToInt(op.apply(tc.wrap((short)lhsGreaterThan[i]), tc.wrap((char)rhsGreaterThan[i]))) == 1);
      assertTrue(tc.unwrapToInt(op.apply(tc.wrap((int)lhsGreaterThan[i]), tc.wrap((char)rhsGreaterThan[i]))) == 1);
      assertTrue(tc.unwrapToInt(op.apply(tc.wrap((long)lhsGreaterThan[i]), tc.wrap((char)rhsGreaterThan[i]))) == 1);
      assertTrue(tc.unwrapToInt(op.apply(tc.wrap((float)lhsGreaterThan[i]), tc.wrap((char)rhsGreaterThan[i]))) == 1);
      assertTrue(tc.unwrapToInt(op.apply(tc.wrap((double)lhsGreaterThan[i]), tc.wrap((char)rhsGreaterThan[i]))) == 1);
      assertTrue(tc.unwrapToInt(op.apply(BigInteger.valueOf(lhsGreaterThan[i]), tc.wrap((char)rhsGreaterThan[i]))) == 1);
      assertTrue(tc.unwrapToInt(op.apply(BigDecimal.valueOf(lhsGreaterThan[i]), tc.wrap((char)rhsGreaterThan[i]))) == 1);

      assertTrue(tc.unwrapToInt(op.apply(tc.wrap((byte)lhsGreaterThan[i]), tc.wrap((short)rhsGreaterThan[i]))) == 1);
      assertTrue(tc.unwrapToInt(op.apply(tc.wrap((char)lhsGreaterThan[i]), tc.wrap((short)rhsGreaterThan[i]))) == 1);
      assertTrue(tc.unwrapToInt(op.apply(tc.wrap((short)lhsGreaterThan[i]), tc.wrap((short)rhsGreaterThan[i]))) == 1);
      assertTrue(tc.unwrapToInt(op.apply(tc.wrap((int)lhsGreaterThan[i]), tc.wrap((short)rhsGreaterThan[i]))) == 1);
      assertTrue(tc.unwrapToInt(op.apply(tc.wrap((long)lhsGreaterThan[i]), tc.wrap((short)rhsGreaterThan[i]))) == 1);
      assertTrue(tc.unwrapToInt(op.apply(tc.wrap((float)lhsGreaterThan[i]), tc.wrap((short)rhsGreaterThan[i]))) == 1);
      assertTrue(tc.unwrapToInt(op.apply(tc.wrap((double)lhsGreaterThan[i]), tc.wrap((short)rhsGreaterThan[i]))) == 1);
      assertTrue(tc.unwrapToInt(op.apply(BigInteger.valueOf(lhsGreaterThan[i]), tc.wrap((short)rhsGreaterThan[i]))) == 1);
      assertTrue(tc.unwrapToInt(op.apply(BigDecimal.valueOf(lhsGreaterThan[i]), tc.wrap((short)rhsGreaterThan[i]))) == 1);

      assertTrue(tc.unwrapToInt(op.apply(tc.wrap((byte)lhsGreaterThan[i]), tc.wrap((int)rhsGreaterThan[i]))) == 1);
      assertTrue(tc.unwrapToInt(op.apply(tc.wrap((char)lhsGreaterThan[i]), tc.wrap((int)rhsGreaterThan[i]))) == 1);
      assertTrue(tc.unwrapToInt(op.apply(tc.wrap((short)lhsGreaterThan[i]), tc.wrap((int)rhsGreaterThan[i]))) == 1);
      assertTrue(tc.unwrapToInt(op.apply(tc.wrap((int)lhsGreaterThan[i]), tc.wrap((int)rhsGreaterThan[i]))) == 1);
      assertTrue(tc.unwrapToInt(op.apply(tc.wrap((long)lhsGreaterThan[i]), tc.wrap((int)rhsGreaterThan[i]))) == 1);
      assertTrue(tc.unwrapToInt(op.apply(tc.wrap((float)lhsGreaterThan[i]), tc.wrap((int)rhsGreaterThan[i]))) == 1);
      assertTrue(tc.unwrapToInt(op.apply(tc.wrap((double)lhsGreaterThan[i]), tc.wrap((int)rhsGreaterThan[i]))) == 1);
      assertTrue(tc.unwrapToInt(op.apply(BigInteger.valueOf(lhsGreaterThan[i]), tc.wrap((int)rhsGreaterThan[i]))) == 1);
      assertTrue(tc.unwrapToInt(op.apply(BigDecimal.valueOf(lhsGreaterThan[i]), tc.wrap((int)rhsGreaterThan[i]))) == 1);

      assertTrue(tc.unwrapToInt(op.apply(tc.wrap((byte)lhsGreaterThan[i]), tc.wrap((long)rhsGreaterThan[i]))) == 1);
      assertTrue(tc.unwrapToInt(op.apply(tc.wrap((char)lhsGreaterThan[i]), tc.wrap((long)rhsGreaterThan[i]))) == 1);
      assertTrue(tc.unwrapToInt(op.apply(tc.wrap((short)lhsGreaterThan[i]), tc.wrap((long)rhsGreaterThan[i]))) == 1);
      assertTrue(tc.unwrapToInt(op.apply(tc.wrap((int)lhsGreaterThan[i]), tc.wrap((long)rhsGreaterThan[i]))) == 1);
      assertTrue(tc.unwrapToInt(op.apply(tc.wrap((long)lhsGreaterThan[i]), tc.wrap((long)rhsGreaterThan[i]))) == 1);
      assertTrue(tc.unwrapToInt(op.apply(tc.wrap((float)lhsGreaterThan[i]), tc.wrap((long)rhsGreaterThan[i]))) == 1);
      assertTrue(tc.unwrapToInt(op.apply(tc.wrap((double)lhsGreaterThan[i]), tc.wrap((long)rhsGreaterThan[i]))) == 1);
      assertTrue(tc.unwrapToInt(op.apply(BigInteger.valueOf(lhsGreaterThan[i]), tc.wrap((long)rhsGreaterThan[i]))) == 1);
      assertTrue(tc.unwrapToInt(op.apply(BigDecimal.valueOf(lhsGreaterThan[i]), tc.wrap((long)rhsGreaterThan[i]))) == 1);

      assertTrue(tc.unwrapToInt(op.apply(tc.wrap((byte)lhsGreaterThan[i]), tc.wrap((float)rhsGreaterThan[i]))) == 1);
      assertTrue(tc.unwrapToInt(op.apply(tc.wrap((char)lhsGreaterThan[i]), tc.wrap((float)rhsGreaterThan[i]))) == 1);
      assertTrue(tc.unwrapToInt(op.apply(tc.wrap((short)lhsGreaterThan[i]), tc.wrap((float)rhsGreaterThan[i]))) == 1);
      assertTrue(tc.unwrapToInt(op.apply(tc.wrap((int)lhsGreaterThan[i]), tc.wrap((float)rhsGreaterThan[i]))) == 1);
      assertTrue(tc.unwrapToInt(op.apply(tc.wrap((long)lhsGreaterThan[i]), tc.wrap((float)rhsGreaterThan[i]))) == 1);
      assertTrue(tc.unwrapToInt(op.apply(tc.wrap((float)lhsGreaterThan[i]), tc.wrap((float)rhsGreaterThan[i]))) == 1);
      assertTrue(tc.unwrapToInt(op.apply(tc.wrap((double)lhsGreaterThan[i]), tc.wrap((float)rhsGreaterThan[i]))) == 1);
      assertTrue(tc.unwrapToInt(op.apply(BigInteger.valueOf(lhsGreaterThan[i]), tc.wrap((float)rhsGreaterThan[i]))) == 1);
      assertTrue(tc.unwrapToInt(op.apply(BigDecimal.valueOf(lhsGreaterThan[i]), tc.wrap((float)rhsGreaterThan[i]))) == 1);

      assertTrue(tc.unwrapToInt(op.apply(tc.wrap((byte)lhsGreaterThan[i]), tc.wrap((double)rhsGreaterThan[i]))) == 1);
      assertTrue(tc.unwrapToInt(op.apply(tc.wrap((char)lhsGreaterThan[i]), tc.wrap((double)rhsGreaterThan[i]))) == 1);
      assertTrue(tc.unwrapToInt(op.apply(tc.wrap((short)lhsGreaterThan[i]), tc.wrap((double)rhsGreaterThan[i]))) == 1);
      assertTrue(tc.unwrapToInt(op.apply(tc.wrap((int)lhsGreaterThan[i]), tc.wrap((double)rhsGreaterThan[i]))) == 1);
      assertTrue(tc.unwrapToInt(op.apply(tc.wrap((long)lhsGreaterThan[i]), tc.wrap((double)rhsGreaterThan[i]))) == 1);
      assertTrue(tc.unwrapToInt(op.apply(tc.wrap((float)lhsGreaterThan[i]), tc.wrap((double)rhsGreaterThan[i]))) == 1);
      assertTrue(tc.unwrapToInt(op.apply(tc.wrap((double)lhsGreaterThan[i]), tc.wrap((double)rhsGreaterThan[i]))) == 1);
      assertTrue(tc.unwrapToInt(op.apply(BigInteger.valueOf(lhsGreaterThan[i]), tc.wrap((double)rhsGreaterThan[i]))) == 1);
      assertTrue(tc.unwrapToInt(op.apply(BigDecimal.valueOf(lhsGreaterThan[i]), tc.wrap((double)rhsGreaterThan[i]))) == 1);

      assertTrue(tc.unwrapToInt(op.apply(tc.wrap((byte)lhsGreaterThan[i]), BigInteger.valueOf(rhsGreaterThan[i]))) == 1);
      assertTrue(tc.unwrapToInt(op.apply(tc.wrap((char)lhsGreaterThan[i]), BigInteger.valueOf(rhsGreaterThan[i]))) == 1);
      assertTrue(tc.unwrapToInt(op.apply(tc.wrap((short)lhsGreaterThan[i]), BigInteger.valueOf(rhsGreaterThan[i]))) == 1);
      assertTrue(tc.unwrapToInt(op.apply(tc.wrap((int)lhsGreaterThan[i]), BigInteger.valueOf(rhsGreaterThan[i]))) == 1);
      assertTrue(tc.unwrapToInt(op.apply(tc.wrap((long)lhsGreaterThan[i]), BigInteger.valueOf(rhsGreaterThan[i]))) == 1);
      assertTrue(tc.unwrapToInt(op.apply(tc.wrap((float)lhsGreaterThan[i]), BigInteger.valueOf(rhsGreaterThan[i]))) == 1);
      assertTrue(tc.unwrapToInt(op.apply(tc.wrap((double)lhsGreaterThan[i]), BigInteger.valueOf(rhsGreaterThan[i]))) == 1);
      assertTrue(tc.unwrapToInt(op.apply(BigInteger.valueOf(lhsGreaterThan[i]), BigInteger.valueOf(rhsGreaterThan[i]))) == 1);
      assertTrue(tc.unwrapToInt(op.apply(BigDecimal.valueOf(lhsGreaterThan[i]), BigInteger.valueOf(rhsGreaterThan[i]))) == 1);

      assertTrue(tc.unwrapToInt(op.apply(tc.wrap((byte)lhsGreaterThan[i]), BigDecimal.valueOf(rhsGreaterThan[i]))) == 1);
      assertTrue(tc.unwrapToInt(op.apply(tc.wrap((char)lhsGreaterThan[i]), BigDecimal.valueOf(rhsGreaterThan[i]))) == 1);
      assertTrue(tc.unwrapToInt(op.apply(tc.wrap((short)lhsGreaterThan[i]), BigDecimal.valueOf(rhsGreaterThan[i]))) == 1);
      assertTrue(tc.unwrapToInt(op.apply(tc.wrap((int)lhsGreaterThan[i]), BigDecimal.valueOf(rhsGreaterThan[i]))) == 1);
      assertTrue(tc.unwrapToInt(op.apply(tc.wrap((long)lhsGreaterThan[i]), BigDecimal.valueOf(rhsGreaterThan[i]))) == 1);
      assertTrue(tc.unwrapToInt(op.apply(tc.wrap((float)lhsGreaterThan[i]), BigDecimal.valueOf(rhsGreaterThan[i]))) == 1);
      assertTrue(tc.unwrapToInt(op.apply(tc.wrap((double)lhsGreaterThan[i]), BigDecimal.valueOf(rhsGreaterThan[i]))) == 1);
      assertTrue(tc.unwrapToInt(op.apply(BigInteger.valueOf(lhsGreaterThan[i]), BigDecimal.valueOf(rhsGreaterThan[i]))) == 1);
      assertTrue(tc.unwrapToInt(op.apply(BigDecimal.valueOf(lhsGreaterThan[i]), BigDecimal.valueOf(rhsGreaterThan[i]))) == 1);

      assertTrue(tc.unwrapToInt(op.apply(tc.wrap((byte)lhsGreaterThan[i]), tc.wrap((byte)rhsGreaterThan[i]))) == 1);
      assertTrue(tc.unwrapToInt(op.apply(tc.wrap((char)lhsGreaterThan[i]), tc.wrap((byte)rhsGreaterThan[i]))) == 1);
      assertTrue(tc.unwrapToInt(op.apply(tc.wrap((short)lhsGreaterThan[i]), tc.wrap((byte)rhsGreaterThan[i]))) == 1);
      assertTrue(tc.unwrapToInt(op.apply(tc.wrap((int)lhsGreaterThan[i]), tc.wrap((byte)rhsGreaterThan[i]))) == 1);
      assertTrue(tc.unwrapToInt(op.apply(tc.wrap((long)lhsGreaterThan[i]), tc.wrap((byte)rhsGreaterThan[i]))) == 1);
      assertTrue(tc.unwrapToInt(op.apply(tc.wrap((float)lhsGreaterThan[i]), tc.wrap((byte)rhsGreaterThan[i]))) == 1);
      assertTrue(tc.unwrapToInt(op.apply(tc.wrap((double)lhsGreaterThan[i]), tc.wrap((byte)rhsGreaterThan[i]))) == 1);
      assertTrue(tc.unwrapToInt(op.apply((Object)BigInteger.valueOf(lhsGreaterThan[i]), (Object)tc.wrap((byte)rhsGreaterThan[i]))) == 1);
      assertTrue(tc.unwrapToInt(op.apply((Object)BigDecimal.valueOf(lhsGreaterThan[i]), (Object)tc.wrap((byte)rhsGreaterThan[i]))) == 1);

      assertTrue(tc.unwrapToInt(op.apply(tc.wrap((byte)lhsGreaterThan[i]), tc.wrap((char)rhsGreaterThan[i]))) == 1);
      assertTrue(tc.unwrapToInt(op.apply(tc.wrap((char)lhsGreaterThan[i]), tc.wrap((char)rhsGreaterThan[i]))) == 1);
      assertTrue(tc.unwrapToInt(op.apply(tc.wrap((short)lhsGreaterThan[i]), tc.wrap((char)rhsGreaterThan[i]))) == 1);
      assertTrue(tc.unwrapToInt(op.apply(tc.wrap((int)lhsGreaterThan[i]), tc.wrap((char)rhsGreaterThan[i]))) == 1);
      assertTrue(tc.unwrapToInt(op.apply(tc.wrap((long)lhsGreaterThan[i]), tc.wrap((char)rhsGreaterThan[i]))) == 1);
      assertTrue(tc.unwrapToInt(op.apply(tc.wrap((float)lhsGreaterThan[i]), tc.wrap((char)rhsGreaterThan[i]))) == 1);
      assertTrue(tc.unwrapToInt(op.apply(tc.wrap((double)lhsGreaterThan[i]), tc.wrap((char)rhsGreaterThan[i]))) == 1);
      assertTrue(tc.unwrapToInt(op.apply((Object)BigInteger.valueOf(lhsGreaterThan[i]), (Object)tc.wrap((char)rhsGreaterThan[i]))) == 1);
      assertTrue(tc.unwrapToInt(op.apply((Object)BigDecimal.valueOf(lhsGreaterThan[i]), (Object)tc.wrap((char)rhsGreaterThan[i]))) == 1);

      assertTrue(tc.unwrapToInt(op.apply(tc.wrap((byte)lhsGreaterThan[i]), tc.wrap((short)rhsGreaterThan[i]))) == 1);
      assertTrue(tc.unwrapToInt(op.apply(tc.wrap((char)lhsGreaterThan[i]), tc.wrap((short)rhsGreaterThan[i]))) == 1);
      assertTrue(tc.unwrapToInt(op.apply(tc.wrap((short)lhsGreaterThan[i]), tc.wrap((short)rhsGreaterThan[i]))) == 1);
      assertTrue(tc.unwrapToInt(op.apply(tc.wrap((int)lhsGreaterThan[i]), tc.wrap((short)rhsGreaterThan[i]))) == 1);
      assertTrue(tc.unwrapToInt(op.apply(tc.wrap((long)lhsGreaterThan[i]), tc.wrap((short)rhsGreaterThan[i]))) == 1);
      assertTrue(tc.unwrapToInt(op.apply(tc.wrap((float)lhsGreaterThan[i]), tc.wrap((short)rhsGreaterThan[i]))) == 1);
      assertTrue(tc.unwrapToInt(op.apply(tc.wrap((double)lhsGreaterThan[i]), tc.wrap((short)rhsGreaterThan[i]))) == 1);
      assertTrue(tc.unwrapToInt(op.apply((Object)BigInteger.valueOf(lhsGreaterThan[i]), (Object)tc.wrap((short)rhsGreaterThan[i]))) == 1);
      assertTrue(tc.unwrapToInt(op.apply((Object)BigDecimal.valueOf(lhsGreaterThan[i]), (Object)tc.wrap((short)rhsGreaterThan[i]))) == 1);

      assertTrue(tc.unwrapToInt(op.apply(tc.wrap((byte)lhsGreaterThan[i]), tc.wrap((int)rhsGreaterThan[i]))) == 1);
      assertTrue(tc.unwrapToInt(op.apply(tc.wrap((char)lhsGreaterThan[i]), tc.wrap((int)rhsGreaterThan[i]))) == 1);
      assertTrue(tc.unwrapToInt(op.apply(tc.wrap((short)lhsGreaterThan[i]), tc.wrap((int)rhsGreaterThan[i]))) == 1);
      assertTrue(tc.unwrapToInt(op.apply(tc.wrap((int)lhsGreaterThan[i]), tc.wrap((int)rhsGreaterThan[i]))) == 1);
      assertTrue(tc.unwrapToInt(op.apply(tc.wrap((long)lhsGreaterThan[i]), tc.wrap((int)rhsGreaterThan[i]))) == 1);
      assertTrue(tc.unwrapToInt(op.apply(tc.wrap((float)lhsGreaterThan[i]), tc.wrap((int)rhsGreaterThan[i]))) == 1);
      assertTrue(tc.unwrapToInt(op.apply(tc.wrap((double)lhsGreaterThan[i]), tc.wrap((int)rhsGreaterThan[i]))) == 1);
      assertTrue(tc.unwrapToInt(op.apply((Object)BigInteger.valueOf(lhsGreaterThan[i]), (Object)tc.wrap((int)rhsGreaterThan[i]))) == 1);
      assertTrue(tc.unwrapToInt(op.apply((Object)BigDecimal.valueOf(lhsGreaterThan[i]), (Object)tc.wrap((int)rhsGreaterThan[i]))) == 1);

      assertTrue(tc.unwrapToInt(op.apply(tc.wrap((byte)lhsGreaterThan[i]), tc.wrap((long)rhsGreaterThan[i]))) == 1);
      assertTrue(tc.unwrapToInt(op.apply(tc.wrap((char)lhsGreaterThan[i]), tc.wrap((long)rhsGreaterThan[i]))) == 1);
      assertTrue(tc.unwrapToInt(op.apply(tc.wrap((short)lhsGreaterThan[i]), tc.wrap((long)rhsGreaterThan[i]))) == 1);
      assertTrue(tc.unwrapToInt(op.apply(tc.wrap((int)lhsGreaterThan[i]), tc.wrap((long)rhsGreaterThan[i]))) == 1);
      assertTrue(tc.unwrapToInt(op.apply(tc.wrap((long)lhsGreaterThan[i]), tc.wrap((long)rhsGreaterThan[i]))) == 1);
      assertTrue(tc.unwrapToInt(op.apply(tc.wrap((float)lhsGreaterThan[i]), tc.wrap((long)rhsGreaterThan[i]))) == 1);
      assertTrue(tc.unwrapToInt(op.apply(tc.wrap((double)lhsGreaterThan[i]), tc.wrap((long)rhsGreaterThan[i]))) == 1);
      assertTrue(tc.unwrapToInt(op.apply((Object)BigInteger.valueOf(lhsGreaterThan[i]), (Object)tc.wrap((long)rhsGreaterThan[i]))) == 1);
      assertTrue(tc.unwrapToInt(op.apply((Object)BigDecimal.valueOf(lhsGreaterThan[i]), (Object)tc.wrap((long)rhsGreaterThan[i]))) == 1);

      assertTrue(tc.unwrapToInt(op.apply(tc.wrap((byte)lhsGreaterThan[i]), tc.wrap((float)rhsGreaterThan[i]))) == 1);
      assertTrue(tc.unwrapToInt(op.apply(tc.wrap((char)lhsGreaterThan[i]), tc.wrap((float)rhsGreaterThan[i]))) == 1);
      assertTrue(tc.unwrapToInt(op.apply(tc.wrap((short)lhsGreaterThan[i]), tc.wrap((float)rhsGreaterThan[i]))) == 1);
      assertTrue(tc.unwrapToInt(op.apply(tc.wrap((int)lhsGreaterThan[i]), tc.wrap((float)rhsGreaterThan[i]))) == 1);
      assertTrue(tc.unwrapToInt(op.apply(tc.wrap((long)lhsGreaterThan[i]), tc.wrap((float)rhsGreaterThan[i]))) == 1);
      assertTrue(tc.unwrapToInt(op.apply(tc.wrap((float)lhsGreaterThan[i]), tc.wrap((float)rhsGreaterThan[i]))) == 1);
      assertTrue(tc.unwrapToInt(op.apply(tc.wrap((double)lhsGreaterThan[i]), tc.wrap((float)rhsGreaterThan[i]))) == 1);
      assertTrue(tc.unwrapToInt(op.apply((Object)BigInteger.valueOf(lhsGreaterThan[i]), (Object)tc.wrap((float)rhsGreaterThan[i]))) == 1);
      assertTrue(tc.unwrapToInt(op.apply((Object)BigDecimal.valueOf(lhsGreaterThan[i]), (Object)tc.wrap((float)rhsGreaterThan[i]))) == 1);

      assertTrue(tc.unwrapToInt(op.apply(tc.wrap((byte)lhsGreaterThan[i]), tc.wrap((double)rhsGreaterThan[i]))) == 1);
      assertTrue(tc.unwrapToInt(op.apply(tc.wrap((char)lhsGreaterThan[i]), tc.wrap((double)rhsGreaterThan[i]))) == 1);
      assertTrue(tc.unwrapToInt(op.apply(tc.wrap((short)lhsGreaterThan[i]), tc.wrap((double)rhsGreaterThan[i]))) == 1);
      assertTrue(tc.unwrapToInt(op.apply(tc.wrap((int)lhsGreaterThan[i]), tc.wrap((double)rhsGreaterThan[i]))) == 1);
      assertTrue(tc.unwrapToInt(op.apply(tc.wrap((long)lhsGreaterThan[i]), tc.wrap((double)rhsGreaterThan[i]))) == 1);
      assertTrue(tc.unwrapToInt(op.apply(tc.wrap((float)lhsGreaterThan[i]), tc.wrap((double)rhsGreaterThan[i]))) == 1);
      assertTrue(tc.unwrapToInt(op.apply(tc.wrap((double)lhsGreaterThan[i]), tc.wrap((double)rhsGreaterThan[i]))) == 1);
      assertTrue(tc.unwrapToInt(op.apply((Object)BigInteger.valueOf(lhsGreaterThan[i]), (Object)tc.wrap((double)rhsGreaterThan[i]))) == 1);
      assertTrue(tc.unwrapToInt(op.apply((Object)BigDecimal.valueOf(lhsGreaterThan[i]), (Object)tc.wrap((double)rhsGreaterThan[i]))) == 1);

      assertTrue(tc.unwrapToInt(op.apply((Object)tc.wrap((byte)lhsGreaterThan[i]), (Object)BigInteger.valueOf(rhsGreaterThan[i]))) == 1);
      assertTrue(tc.unwrapToInt(op.apply((Object)tc.wrap((char)lhsGreaterThan[i]), (Object)BigInteger.valueOf(rhsGreaterThan[i]))) == 1);
      assertTrue(tc.unwrapToInt(op.apply((Object)tc.wrap((short)lhsGreaterThan[i]), (Object)BigInteger.valueOf(rhsGreaterThan[i]))) == 1);
      assertTrue(tc.unwrapToInt(op.apply((Object)tc.wrap((int)lhsGreaterThan[i]), (Object)BigInteger.valueOf(rhsGreaterThan[i]))) == 1);
      assertTrue(tc.unwrapToInt(op.apply((Object)tc.wrap((long)lhsGreaterThan[i]), (Object)BigInteger.valueOf(rhsGreaterThan[i]))) == 1);
      assertTrue(tc.unwrapToInt(op.apply((Object)tc.wrap((float)lhsGreaterThan[i]), (Object)BigInteger.valueOf(rhsGreaterThan[i]))) == 1);
      assertTrue(tc.unwrapToInt(op.apply((Object)tc.wrap((double)lhsGreaterThan[i]), (Object)BigInteger.valueOf(rhsGreaterThan[i]))) == 1);
      assertTrue(tc.unwrapToInt(op.apply((Object)BigInteger.valueOf(lhsGreaterThan[i]), (Object)BigInteger.valueOf(rhsGreaterThan[i]))) == 1);
      assertTrue(tc.unwrapToInt(op.apply((Object)BigDecimal.valueOf(lhsGreaterThan[i]), (Object)BigInteger.valueOf(rhsGreaterThan[i]))) == 1);

      assertTrue(tc.unwrapToInt(op.apply((Object)tc.wrap((byte)lhsGreaterThan[i]), (Object)BigDecimal.valueOf(rhsGreaterThan[i]))) == 1);
      assertTrue(tc.unwrapToInt(op.apply((Object)tc.wrap((char)lhsGreaterThan[i]), (Object)BigDecimal.valueOf(rhsGreaterThan[i]))) == 1);
      assertTrue(tc.unwrapToInt(op.apply((Object)tc.wrap((short)lhsGreaterThan[i]), (Object)BigDecimal.valueOf(rhsGreaterThan[i]))) == 1);
      assertTrue(tc.unwrapToInt(op.apply((Object)tc.wrap((int)lhsGreaterThan[i]), (Object)BigDecimal.valueOf(rhsGreaterThan[i]))) == 1);
      assertTrue(tc.unwrapToInt(op.apply((Object)tc.wrap((long)lhsGreaterThan[i]), (Object)BigDecimal.valueOf(rhsGreaterThan[i]))) == 1);
      assertTrue(tc.unwrapToInt(op.apply((Object)tc.wrap((float)lhsGreaterThan[i]), (Object)BigDecimal.valueOf(rhsGreaterThan[i]))) == 1);
      assertTrue(tc.unwrapToInt(op.apply((Object)tc.wrap((double)lhsGreaterThan[i]), (Object)BigDecimal.valueOf(rhsGreaterThan[i]))) == 1);
      assertTrue(tc.unwrapToInt(op.apply((Object)BigInteger.valueOf(lhsGreaterThan[i]), (Object)BigDecimal.valueOf(rhsGreaterThan[i]))) == 1);
      assertTrue(tc.unwrapToInt(op.apply((Object)BigDecimal.valueOf(lhsGreaterThan[i]), (Object)BigDecimal.valueOf(rhsGreaterThan[i]))) == 1);

      assertTrue(op.intApply(tc.wrap((byte)lhsGreaterThan[i]), tc.wrap((byte)rhsGreaterThan[i])) == 1);
      assertTrue(op.intApply(tc.wrap((char)lhsGreaterThan[i]), tc.wrap((byte)rhsGreaterThan[i])) == 1);
      assertTrue(op.intApply(tc.wrap((short)lhsGreaterThan[i]), tc.wrap((byte)rhsGreaterThan[i])) == 1);
      assertTrue(op.intApply(tc.wrap((int)lhsGreaterThan[i]), tc.wrap((byte)rhsGreaterThan[i])) == 1);
      assertTrue(op.intApply(tc.wrap((long)lhsGreaterThan[i]), tc.wrap((byte)rhsGreaterThan[i])) == 1);
      assertTrue(op.intApply(tc.wrap((float)lhsGreaterThan[i]), tc.wrap((byte)rhsGreaterThan[i])) == 1);
      assertTrue(op.intApply(tc.wrap((double)lhsGreaterThan[i]), tc.wrap((byte)rhsGreaterThan[i])) == 1);
      assertTrue(op.intApply((Object)BigInteger.valueOf(lhsGreaterThan[i]), (Object)tc.wrap((byte)rhsGreaterThan[i])) == 1);
      assertTrue(op.intApply((Object)BigDecimal.valueOf(lhsGreaterThan[i]), (Object)tc.wrap((byte)rhsGreaterThan[i])) == 1);

      assertTrue(op.intApply(tc.wrap((byte)lhsGreaterThan[i]), tc.wrap((char)rhsGreaterThan[i])) == 1);
      assertTrue(op.intApply(tc.wrap((char)lhsGreaterThan[i]), tc.wrap((char)rhsGreaterThan[i])) == 1);
      assertTrue(op.intApply(tc.wrap((short)lhsGreaterThan[i]), tc.wrap((char)rhsGreaterThan[i])) == 1);
      assertTrue(op.intApply(tc.wrap((int)lhsGreaterThan[i]), tc.wrap((char)rhsGreaterThan[i])) == 1);
      assertTrue(op.intApply(tc.wrap((long)lhsGreaterThan[i]), tc.wrap((char)rhsGreaterThan[i])) == 1);
      assertTrue(op.intApply(tc.wrap((float)lhsGreaterThan[i]), tc.wrap((char)rhsGreaterThan[i])) == 1);
      assertTrue(op.intApply(tc.wrap((double)lhsGreaterThan[i]), tc.wrap((char)rhsGreaterThan[i])) == 1);
      assertTrue(op.intApply((Object)BigInteger.valueOf(lhsGreaterThan[i]), (Object)tc.wrap((char)rhsGreaterThan[i])) == 1);
      assertTrue(op.intApply((Object)BigDecimal.valueOf(lhsGreaterThan[i]), (Object)tc.wrap((char)rhsGreaterThan[i])) == 1);

      assertTrue(op.intApply(tc.wrap((byte)lhsGreaterThan[i]), tc.wrap((short)rhsGreaterThan[i])) == 1);
      assertTrue(op.intApply(tc.wrap((char)lhsGreaterThan[i]), tc.wrap((short)rhsGreaterThan[i])) == 1);
      assertTrue(op.intApply(tc.wrap((short)lhsGreaterThan[i]), tc.wrap((short)rhsGreaterThan[i])) == 1);
      assertTrue(op.intApply(tc.wrap((int)lhsGreaterThan[i]), tc.wrap((short)rhsGreaterThan[i])) == 1);
      assertTrue(op.intApply(tc.wrap((long)lhsGreaterThan[i]), tc.wrap((short)rhsGreaterThan[i])) == 1);
      assertTrue(op.intApply(tc.wrap((float)lhsGreaterThan[i]), tc.wrap((short)rhsGreaterThan[i])) == 1);
      assertTrue(op.intApply(tc.wrap((double)lhsGreaterThan[i]), tc.wrap((short)rhsGreaterThan[i])) == 1);
      assertTrue(op.intApply((Object)BigInteger.valueOf(lhsGreaterThan[i]), (Object)tc.wrap((short)rhsGreaterThan[i])) == 1);
      assertTrue(op.intApply((Object)BigDecimal.valueOf(lhsGreaterThan[i]), (Object)tc.wrap((short)rhsGreaterThan[i])) == 1);

      assertTrue(op.intApply(tc.wrap((byte)lhsGreaterThan[i]), tc.wrap((int)rhsGreaterThan[i])) == 1);
      assertTrue(op.intApply(tc.wrap((char)lhsGreaterThan[i]), tc.wrap((int)rhsGreaterThan[i])) == 1);
      assertTrue(op.intApply(tc.wrap((short)lhsGreaterThan[i]), tc.wrap((int)rhsGreaterThan[i])) == 1);
      assertTrue(op.intApply(tc.wrap((int)lhsGreaterThan[i]), tc.wrap((int)rhsGreaterThan[i])) == 1);
      assertTrue(op.intApply(tc.wrap((long)lhsGreaterThan[i]), tc.wrap((int)rhsGreaterThan[i])) == 1);
      assertTrue(op.intApply(tc.wrap((float)lhsGreaterThan[i]), tc.wrap((int)rhsGreaterThan[i])) == 1);
      assertTrue(op.intApply(tc.wrap((double)lhsGreaterThan[i]), tc.wrap((int)rhsGreaterThan[i])) == 1);
      assertTrue(op.intApply((Object)BigInteger.valueOf(lhsGreaterThan[i]), (Object)tc.wrap((int)rhsGreaterThan[i])) == 1);
      assertTrue(op.intApply((Object)BigDecimal.valueOf(lhsGreaterThan[i]), (Object)tc.wrap((int)rhsGreaterThan[i])) == 1);

      assertTrue(op.intApply(tc.wrap((byte)lhsGreaterThan[i]), tc.wrap((long)rhsGreaterThan[i])) == 1);
      assertTrue(op.intApply(tc.wrap((char)lhsGreaterThan[i]), tc.wrap((long)rhsGreaterThan[i])) == 1);
      assertTrue(op.intApply(tc.wrap((short)lhsGreaterThan[i]), tc.wrap((long)rhsGreaterThan[i])) == 1);
      assertTrue(op.intApply(tc.wrap((int)lhsGreaterThan[i]), tc.wrap((long)rhsGreaterThan[i])) == 1);
      assertTrue(op.intApply(tc.wrap((long)lhsGreaterThan[i]), tc.wrap((long)rhsGreaterThan[i])) == 1);
      assertTrue(op.intApply(tc.wrap((float)lhsGreaterThan[i]), tc.wrap((long)rhsGreaterThan[i])) == 1);
      assertTrue(op.intApply(tc.wrap((double)lhsGreaterThan[i]), tc.wrap((long)rhsGreaterThan[i])) == 1);
      assertTrue(op.intApply((Object)BigInteger.valueOf(lhsGreaterThan[i]), (Object)tc.wrap((long)rhsGreaterThan[i])) == 1);
      assertTrue(op.intApply((Object)BigDecimal.valueOf(lhsGreaterThan[i]), (Object)tc.wrap((long)rhsGreaterThan[i])) == 1);

      assertTrue(op.intApply(tc.wrap((byte)lhsGreaterThan[i]), tc.wrap((float)rhsGreaterThan[i])) == 1);
      assertTrue(op.intApply(tc.wrap((char)lhsGreaterThan[i]), tc.wrap((float)rhsGreaterThan[i])) == 1);
      assertTrue(op.intApply(tc.wrap((short)lhsGreaterThan[i]), tc.wrap((float)rhsGreaterThan[i])) == 1);
      assertTrue(op.intApply(tc.wrap((int)lhsGreaterThan[i]), tc.wrap((float)rhsGreaterThan[i])) == 1);
      assertTrue(op.intApply(tc.wrap((long)lhsGreaterThan[i]), tc.wrap((float)rhsGreaterThan[i])) == 1);
      assertTrue(op.intApply(tc.wrap((float)lhsGreaterThan[i]), tc.wrap((float)rhsGreaterThan[i])) == 1);
      assertTrue(op.intApply(tc.wrap((double)lhsGreaterThan[i]), tc.wrap((float)rhsGreaterThan[i])) == 1);
      assertTrue(op.intApply((Object)BigInteger.valueOf(lhsGreaterThan[i]), (Object)tc.wrap((float)rhsGreaterThan[i])) == 1);
      assertTrue(op.intApply((Object)BigDecimal.valueOf(lhsGreaterThan[i]), (Object)tc.wrap((float)rhsGreaterThan[i])) == 1);

      assertTrue(op.intApply(tc.wrap((byte)lhsGreaterThan[i]), tc.wrap((double)rhsGreaterThan[i])) == 1);
      assertTrue(op.intApply(tc.wrap((char)lhsGreaterThan[i]), tc.wrap((double)rhsGreaterThan[i])) == 1);
      assertTrue(op.intApply(tc.wrap((short)lhsGreaterThan[i]), tc.wrap((double)rhsGreaterThan[i])) == 1);
      assertTrue(op.intApply(tc.wrap((int)lhsGreaterThan[i]), tc.wrap((double)rhsGreaterThan[i])) == 1);
      assertTrue(op.intApply(tc.wrap((long)lhsGreaterThan[i]), tc.wrap((double)rhsGreaterThan[i])) == 1);
      assertTrue(op.intApply(tc.wrap((float)lhsGreaterThan[i]), tc.wrap((double)rhsGreaterThan[i])) == 1);
      assertTrue(op.intApply(tc.wrap((double)lhsGreaterThan[i]), tc.wrap((double)rhsGreaterThan[i])) == 1);
      assertTrue(op.intApply((Object)BigInteger.valueOf(lhsGreaterThan[i]), (Object)tc.wrap((double)rhsGreaterThan[i])) == 1);
      assertTrue(op.intApply((Object)BigDecimal.valueOf(lhsGreaterThan[i]), (Object)tc.wrap((double)rhsGreaterThan[i])) == 1);

      assertTrue(op.intApply((Object)tc.wrap((byte)lhsGreaterThan[i]), (Object)BigInteger.valueOf(rhsGreaterThan[i])) == 1);
      assertTrue(op.intApply((Object)tc.wrap((char)lhsGreaterThan[i]), (Object)BigInteger.valueOf(rhsGreaterThan[i])) == 1);
      assertTrue(op.intApply((Object)tc.wrap((short)lhsGreaterThan[i]), (Object)BigInteger.valueOf(rhsGreaterThan[i])) == 1);
      assertTrue(op.intApply((Object)tc.wrap((int)lhsGreaterThan[i]), (Object)BigInteger.valueOf(rhsGreaterThan[i])) == 1);
      assertTrue(op.intApply((Object)tc.wrap((long)lhsGreaterThan[i]), (Object)BigInteger.valueOf(rhsGreaterThan[i])) == 1);
      assertTrue(op.intApply((Object)tc.wrap((float)lhsGreaterThan[i]), (Object)BigInteger.valueOf(rhsGreaterThan[i])) == 1);
      assertTrue(op.intApply((Object)tc.wrap((double)lhsGreaterThan[i]), (Object)BigInteger.valueOf(rhsGreaterThan[i])) == 1);
      assertTrue(op.intApply((Object)BigInteger.valueOf(lhsGreaterThan[i]), (Object)BigInteger.valueOf(rhsGreaterThan[i])) == 1);
      assertTrue(op.intApply((Object)BigDecimal.valueOf(lhsGreaterThan[i]), (Object)BigInteger.valueOf(rhsGreaterThan[i])) == 1);

      assertTrue(op.intApply((Object)tc.wrap((byte)lhsGreaterThan[i]), (Object)BigDecimal.valueOf(rhsGreaterThan[i])) == 1);
      assertTrue(op.intApply((Object)tc.wrap((char)lhsGreaterThan[i]), (Object)BigDecimal.valueOf(rhsGreaterThan[i])) == 1);
      assertTrue(op.intApply((Object)tc.wrap((short)lhsGreaterThan[i]), (Object)BigDecimal.valueOf(rhsGreaterThan[i])) == 1);
      assertTrue(op.intApply((Object)tc.wrap((int)lhsGreaterThan[i]), (Object)BigDecimal.valueOf(rhsGreaterThan[i])) == 1);
      assertTrue(op.intApply((Object)tc.wrap((long)lhsGreaterThan[i]), (Object)BigDecimal.valueOf(rhsGreaterThan[i])) == 1);
      assertTrue(op.intApply((Object)tc.wrap((float)lhsGreaterThan[i]), (Object)BigDecimal.valueOf(rhsGreaterThan[i])) == 1);
      assertTrue(op.intApply((Object)tc.wrap((double)lhsGreaterThan[i]), (Object)BigDecimal.valueOf(rhsGreaterThan[i])) == 1);
      assertTrue(op.intApply((Object)BigInteger.valueOf(lhsGreaterThan[i]), (Object)BigDecimal.valueOf(rhsGreaterThan[i])) == 1);
      assertTrue(op.intApply((Object)BigDecimal.valueOf(lhsGreaterThan[i]), (Object)BigDecimal.valueOf(rhsGreaterThan[i])) == 1);

      assertTrue(op.intApply(tc.wrap((byte)lhsGreaterThan[i]), byteMetaClass, tc.wrap((byte)rhsGreaterThan[i])) == 1);
      assertTrue(op.intApply(tc.wrap((char)lhsGreaterThan[i]), byteMetaClass, tc.wrap((byte)rhsGreaterThan[i])) == 1);
      assertTrue(op.intApply(tc.wrap((short)lhsGreaterThan[i]), byteMetaClass, tc.wrap((byte)rhsGreaterThan[i])) == 1);
      assertTrue(op.intApply(tc.wrap((int)lhsGreaterThan[i]), byteMetaClass, tc.wrap((byte)rhsGreaterThan[i])) == 1);
      assertTrue(op.intApply(tc.wrap((long)lhsGreaterThan[i]), byteMetaClass, tc.wrap((byte)rhsGreaterThan[i])) == 1);
      assertTrue(op.intApply(tc.wrap((float)lhsGreaterThan[i]), byteMetaClass, tc.wrap((byte)rhsGreaterThan[i])) == 1);
      assertTrue(op.intApply(tc.wrap((double)lhsGreaterThan[i]), byteMetaClass, tc.wrap((byte)rhsGreaterThan[i])) == 1);
      assertTrue(op.intApply((Object)BigInteger.valueOf(lhsGreaterThan[i]), byteMetaClass, (Object)tc.wrap((byte)rhsGreaterThan[i])) == 1);
      assertTrue(op.intApply((Object)BigDecimal.valueOf(lhsGreaterThan[i]), byteMetaClass, (Object)tc.wrap((byte)rhsGreaterThan[i])) == 1);

      assertTrue(op.intApply(tc.wrap((byte)lhsGreaterThan[i]), charMetaClass, tc.wrap((char)rhsGreaterThan[i])) == 1);
      assertTrue(op.intApply(tc.wrap((char)lhsGreaterThan[i]), charMetaClass, tc.wrap((char)rhsGreaterThan[i])) == 1);
      assertTrue(op.intApply(tc.wrap((short)lhsGreaterThan[i]), charMetaClass, tc.wrap((char)rhsGreaterThan[i])) == 1);
      assertTrue(op.intApply(tc.wrap((int)lhsGreaterThan[i]), charMetaClass, tc.wrap((char)rhsGreaterThan[i])) == 1);
      assertTrue(op.intApply(tc.wrap((long)lhsGreaterThan[i]), charMetaClass, tc.wrap((char)rhsGreaterThan[i])) == 1);
      assertTrue(op.intApply(tc.wrap((float)lhsGreaterThan[i]), charMetaClass, tc.wrap((char)rhsGreaterThan[i])) == 1);
      assertTrue(op.intApply(tc.wrap((double)lhsGreaterThan[i]), charMetaClass, tc.wrap((char)rhsGreaterThan[i])) == 1);
      assertTrue(op.intApply((Object)BigInteger.valueOf(lhsGreaterThan[i]), charMetaClass, (Object)tc.wrap((char)rhsGreaterThan[i])) == 1);
      assertTrue(op.intApply((Object)BigDecimal.valueOf(lhsGreaterThan[i]), charMetaClass, (Object)tc.wrap((char)rhsGreaterThan[i])) == 1);

      assertTrue(op.intApply(tc.wrap((byte)lhsGreaterThan[i]), shortMetaClass, tc.wrap((short)rhsGreaterThan[i])) == 1);
      assertTrue(op.intApply(tc.wrap((char)lhsGreaterThan[i]), shortMetaClass, tc.wrap((short)rhsGreaterThan[i])) == 1);
      assertTrue(op.intApply(tc.wrap((short)lhsGreaterThan[i]), shortMetaClass, tc.wrap((short)rhsGreaterThan[i])) == 1);
      assertTrue(op.intApply(tc.wrap((int)lhsGreaterThan[i]), shortMetaClass, tc.wrap((short)rhsGreaterThan[i])) == 1);
      assertTrue(op.intApply(tc.wrap((long)lhsGreaterThan[i]), shortMetaClass, tc.wrap((short)rhsGreaterThan[i])) == 1);
      assertTrue(op.intApply(tc.wrap((float)lhsGreaterThan[i]), shortMetaClass, tc.wrap((short)rhsGreaterThan[i])) == 1);
      assertTrue(op.intApply(tc.wrap((double)lhsGreaterThan[i]), shortMetaClass, tc.wrap((short)rhsGreaterThan[i])) == 1);
      assertTrue(op.intApply((Object)BigInteger.valueOf(lhsGreaterThan[i]), shortMetaClass, (Object)tc.wrap((short)rhsGreaterThan[i])) == 1);
      assertTrue(op.intApply((Object)BigDecimal.valueOf(lhsGreaterThan[i]), shortMetaClass, (Object)tc.wrap((short)rhsGreaterThan[i])) == 1);

      assertTrue(op.intApply(tc.wrap((byte)lhsGreaterThan[i]), intMetaClass, tc.wrap((int)rhsGreaterThan[i])) == 1);
      assertTrue(op.intApply(tc.wrap((char)lhsGreaterThan[i]), intMetaClass, tc.wrap((int)rhsGreaterThan[i])) == 1);
      assertTrue(op.intApply(tc.wrap((short)lhsGreaterThan[i]), intMetaClass, tc.wrap((int)rhsGreaterThan[i])) == 1);
      assertTrue(op.intApply(tc.wrap((int)lhsGreaterThan[i]), intMetaClass, tc.wrap((int)rhsGreaterThan[i])) == 1);
      assertTrue(op.intApply(tc.wrap((long)lhsGreaterThan[i]), intMetaClass, tc.wrap((int)rhsGreaterThan[i])) == 1);
      assertTrue(op.intApply(tc.wrap((float)lhsGreaterThan[i]), intMetaClass, tc.wrap((int)rhsGreaterThan[i])) == 1);
      assertTrue(op.intApply(tc.wrap((double)lhsGreaterThan[i]), intMetaClass, tc.wrap((int)rhsGreaterThan[i])) == 1);
      assertTrue(op.intApply((Object)BigInteger.valueOf(lhsGreaterThan[i]), intMetaClass, (Object)tc.wrap((int)rhsGreaterThan[i])) == 1);
      assertTrue(op.intApply((Object)BigDecimal.valueOf(lhsGreaterThan[i]), intMetaClass, (Object)tc.wrap((int)rhsGreaterThan[i])) == 1);

      assertTrue(op.intApply(tc.wrap((byte)lhsGreaterThan[i]), longMetaClass, tc.wrap((long)rhsGreaterThan[i])) == 1);
      assertTrue(op.intApply(tc.wrap((char)lhsGreaterThan[i]), longMetaClass, tc.wrap((long)rhsGreaterThan[i])) == 1);
      assertTrue(op.intApply(tc.wrap((short)lhsGreaterThan[i]), longMetaClass, tc.wrap((long)rhsGreaterThan[i])) == 1);
      assertTrue(op.intApply(tc.wrap((int)lhsGreaterThan[i]), longMetaClass, tc.wrap((long)rhsGreaterThan[i])) == 1);
      assertTrue(op.intApply(tc.wrap((long)lhsGreaterThan[i]), longMetaClass, tc.wrap((long)rhsGreaterThan[i])) == 1);
      assertTrue(op.intApply(tc.wrap((float)lhsGreaterThan[i]), longMetaClass, tc.wrap((long)rhsGreaterThan[i])) == 1);
      assertTrue(op.intApply(tc.wrap((double)lhsGreaterThan[i]), longMetaClass, tc.wrap((long)rhsGreaterThan[i])) == 1);
      assertTrue(op.intApply((Object)BigInteger.valueOf(lhsGreaterThan[i]), longMetaClass, (Object)tc.wrap((long)rhsGreaterThan[i])) == 1);
      assertTrue(op.intApply((Object)BigDecimal.valueOf(lhsGreaterThan[i]), longMetaClass, (Object)tc.wrap((long)rhsGreaterThan[i])) == 1);

      assertTrue(op.intApply(tc.wrap((byte)lhsGreaterThan[i]), floatMetaClass, tc.wrap((float)rhsGreaterThan[i])) == 1);
      assertTrue(op.intApply(tc.wrap((char)lhsGreaterThan[i]), floatMetaClass, tc.wrap((float)rhsGreaterThan[i])) == 1);
      assertTrue(op.intApply(tc.wrap((short)lhsGreaterThan[i]), floatMetaClass, tc.wrap((float)rhsGreaterThan[i])) == 1);
      assertTrue(op.intApply(tc.wrap((int)lhsGreaterThan[i]), floatMetaClass, tc.wrap((float)rhsGreaterThan[i])) == 1);
      assertTrue(op.intApply(tc.wrap((long)lhsGreaterThan[i]), floatMetaClass, tc.wrap((float)rhsGreaterThan[i])) == 1);
      assertTrue(op.intApply(tc.wrap((float)lhsGreaterThan[i]), floatMetaClass, tc.wrap((float)rhsGreaterThan[i])) == 1);
      assertTrue(op.intApply((Object)tc.wrap((double)lhsGreaterThan[i]), floatMetaClass, (Object)tc.wrap((float)rhsGreaterThan[i])) == 1);
      assertTrue(op.intApply((Object)BigInteger.valueOf(lhsGreaterThan[i]), floatMetaClass, (Object)tc.wrap((float)rhsGreaterThan[i])) == 1);
      assertTrue(op.intApply((Object)BigDecimal.valueOf(lhsGreaterThan[i]), floatMetaClass, (Object)tc.wrap((float)rhsGreaterThan[i])) == 1);

      assertTrue(op.intApply((Object)tc.wrap((byte)lhsGreaterThan[i]), doubleMetaClass, (Object)tc.wrap((double)rhsGreaterThan[i])) == 1);
      assertTrue(op.intApply((Object)tc.wrap((char)lhsGreaterThan[i]), doubleMetaClass, (Object)tc.wrap((double)rhsGreaterThan[i])) == 1);
      assertTrue(op.intApply((Object)tc.wrap((short)lhsGreaterThan[i]), doubleMetaClass, (Object)tc.wrap((double)rhsGreaterThan[i])) == 1);
      assertTrue(op.intApply((Object)tc.wrap((int)lhsGreaterThan[i]), doubleMetaClass, (Object)tc.wrap((double)rhsGreaterThan[i])) == 1);
      assertTrue(op.intApply((Object)tc.wrap((long)lhsGreaterThan[i]), doubleMetaClass, (Object)tc.wrap((double)rhsGreaterThan[i])) == 1);
      assertTrue(op.intApply((Object)tc.wrap((float)lhsGreaterThan[i]), doubleMetaClass, (Object)tc.wrap((double)rhsGreaterThan[i])) == 1);
      assertTrue(op.intApply((Object)tc.wrap((double)lhsGreaterThan[i]), doubleMetaClass, (Object)tc.wrap((double)rhsGreaterThan[i])) == 1);
      assertTrue(op.intApply((Object)BigInteger.valueOf(lhsGreaterThan[i]), doubleMetaClass, (Object)tc.wrap((double)rhsGreaterThan[i])) == 1);
      assertTrue(op.intApply((Object)BigDecimal.valueOf(lhsGreaterThan[i]), doubleMetaClass, (Object)tc.wrap((double)rhsGreaterThan[i])) == 1);

      assertTrue(op.intApply((Object)tc.wrap((byte)lhsGreaterThan[i]), bigIntegerMetaClass, (Object)BigInteger.valueOf(rhsGreaterThan[i])) == 1);
      assertTrue(op.intApply((Object)tc.wrap((char)lhsGreaterThan[i]), bigIntegerMetaClass, (Object)BigInteger.valueOf(rhsGreaterThan[i])) == 1);
      assertTrue(op.intApply((Object)tc.wrap((short)lhsGreaterThan[i]), bigIntegerMetaClass, (Object)BigInteger.valueOf(rhsGreaterThan[i])) == 1);
      assertTrue(op.intApply((Object)tc.wrap((int)lhsGreaterThan[i]), bigIntegerMetaClass, (Object)BigInteger.valueOf(rhsGreaterThan[i])) == 1);
      assertTrue(op.intApply((Object)tc.wrap((long)lhsGreaterThan[i]), bigIntegerMetaClass, (Object)BigInteger.valueOf(rhsGreaterThan[i])) == 1);
      assertTrue(op.intApply((Object)tc.wrap((float)lhsGreaterThan[i]), bigIntegerMetaClass, (Object)BigInteger.valueOf(rhsGreaterThan[i])) == 1);
      assertTrue(op.intApply((Object)tc.wrap((double)lhsGreaterThan[i]), bigIntegerMetaClass, (Object)BigInteger.valueOf(rhsGreaterThan[i])) == 1);
      assertTrue(op.intApply((Object)BigInteger.valueOf(lhsGreaterThan[i]), bigIntegerMetaClass, (Object)BigInteger.valueOf(rhsGreaterThan[i])) == 1);
      assertTrue(op.intApply((Object)BigDecimal.valueOf(lhsGreaterThan[i]), bigIntegerMetaClass, (Object)BigInteger.valueOf(rhsGreaterThan[i])) == 1);

      assertTrue(op.intApply((Object)tc.wrap((byte)lhsGreaterThan[i]), bigDecimalMetaClass, (Object)BigDecimal.valueOf(rhsGreaterThan[i])) == 1);
      assertTrue(op.intApply((Object)tc.wrap((char)lhsGreaterThan[i]), bigDecimalMetaClass, (Object)BigDecimal.valueOf(rhsGreaterThan[i])) == 1);
      assertTrue(op.intApply((Object)tc.wrap((short)lhsGreaterThan[i]), bigDecimalMetaClass, (Object)BigDecimal.valueOf(rhsGreaterThan[i])) == 1);
      assertTrue(op.intApply((Object)tc.wrap((int)lhsGreaterThan[i]), bigDecimalMetaClass, (Object)BigDecimal.valueOf(rhsGreaterThan[i])) == 1);
      assertTrue(op.intApply((Object)tc.wrap((long)lhsGreaterThan[i]), bigDecimalMetaClass, (Object)BigDecimal.valueOf(rhsGreaterThan[i])) == 1);
      assertTrue(op.intApply((Object)tc.wrap((float)lhsGreaterThan[i]), bigDecimalMetaClass, (Object)BigDecimal.valueOf(rhsGreaterThan[i])) == 1);
      assertTrue(op.intApply((Object)tc.wrap((double)lhsGreaterThan[i]), bigDecimalMetaClass, (Object)BigDecimal.valueOf(rhsGreaterThan[i])) == 1);
      assertTrue(op.intApply((Object)BigInteger.valueOf(lhsGreaterThan[i]), bigDecimalMetaClass, (Object)BigDecimal.valueOf(rhsGreaterThan[i])) == 1);
      assertTrue(op.intApply((Object)BigDecimal.valueOf(lhsGreaterThan[i]), bigDecimalMetaClass, (Object)BigDecimal.valueOf(rhsGreaterThan[i])) == 1);
    }
  }
  public void testCompare() throws Throwable {
    final ExtendedThreadContext tc = (ExtendedThreadContext)ThreadContext.getThreadContext();
    doTest(tc, tc.compare(), new int[]{1}, new int[]{1}, new int[]{0}, new int[]{1}, new int[]{1}, new int[]{0});
  }

}
