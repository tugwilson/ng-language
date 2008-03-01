package ng.runtime;

import java.math.BigDecimal;
import java.math.BigInteger;

import junit.framework.TestCase;
import ng.runtime.metaclass.MetaClass;
import ng.runtime.threadcontext.BinaryLogicalOperation;
import ng.runtime.threadcontext.ExtendedThreadContext;
import ng.runtime.threadcontext.NotPerformed;
import ng.runtime.threadcontext.ThreadContext;

/**
 * @author John
 *
 */
public class LogicalTest extends TestCase {
  private static void doTest(final ExtendedThreadContext tc, final BinaryLogicalOperation op, final int iResult) throws NotPerformed {
    final MetaClass byteMetaClass = tc.getMetaClassFor(byte.class);
    final MetaClass charMetaClass = tc.getMetaClassFor(char.class);
    final MetaClass shortMetaClass = tc.getMetaClassFor(short.class);
    final MetaClass intMetaClass = tc.getMetaClassFor(int.class);
    final MetaClass longMetaClass = tc.getMetaClassFor(long.class);
    final MetaClass floatMetaClass = tc.getMetaClassFor(float.class);
    final MetaClass doubleMetaClass = tc.getMetaClassFor(double.class);
    final MetaClass bigIntegerMetaClass = tc.getMetaClassFor(BigInteger.class);
    final MetaClass bigDecimalMetaClass = tc.getMetaClassFor(BigDecimal.class);

    assertTrue(op.intApply((byte)18, (byte)4) == iResult);
    assertTrue(op.intApply((char)18, (byte)4) == iResult);
    assertTrue(op.intApply((short)18, (byte)4) == iResult);
    assertTrue(op.intApply(18, (byte)4) == iResult);
    assertTrue(op.longApply((long)18, (byte)4) == iResult);
    assertTrue(op.bigIntegerApply(BigInteger.valueOf(18), (byte)4).longValue() == iResult);

    assertTrue(tc.unwrapToInt(op.apply((byte)18, (byte)4)) == iResult);
    assertTrue(tc.unwrapToInt(op.apply((char)18, (byte)4)) == iResult);
    assertTrue(tc.unwrapToInt(op.apply((short)18, (byte)4)) == iResult);
    assertTrue(tc.unwrapToInt(op.apply(18, (byte)4)) == iResult);
    assertTrue(tc.unwrapToLong(op.apply((long)18, (byte)4)) == iResult);
    assertTrue(((BigInteger)op.apply(BigInteger.valueOf(18), (byte)4)).longValue() == iResult);

    assertTrue(tc.unwrapToInt(op.apply(tc.wrap((byte)18), (byte)4)) == iResult);
    assertTrue(tc.unwrapToInt(op.apply(tc.wrap((char)18), (byte)4)) == iResult);
    assertTrue(tc.unwrapToInt(op.apply(tc.wrap((short)18), (byte)4)) == iResult);
    assertTrue(tc.unwrapToInt(op.apply(tc.wrap((int)18), (byte)4)) == iResult);
    assertTrue(tc.unwrapToLong(op.apply(tc.wrap((long)18), (byte)4)) == iResult);

    assertTrue(tc.unwrapToInt(op.apply(tc.wrap((byte)18), (byte)4)) == iResult);
    assertTrue(tc.unwrapToInt(op.apply(tc.wrap((char)18), (byte)4)) == iResult);
    assertTrue(tc.unwrapToInt(op.apply(tc.wrap((short)18), (byte)4)) == iResult);
    assertTrue(tc.unwrapToInt(op.apply(tc.wrap((int)18), (byte)4)) == iResult);
    assertTrue(tc.unwrapToLong(op.apply(tc.wrap((long)18), (byte)4)) == iResult);
    assertTrue(((BigInteger)op.apply((Object)BigInteger.valueOf(18), (byte)4)).longValue() == iResult);

    assertTrue(tc.unwrapToInt(op.apply((byte)18, tc.wrap((byte)4))) == iResult);
    assertTrue(tc.unwrapToInt(op.apply((char)18, tc.wrap((byte)4))) == iResult);
    assertTrue(tc.unwrapToInt(op.apply((short)18, tc.wrap((byte)4))) == iResult);
    assertTrue(tc.unwrapToInt(op.apply(18, tc.wrap((byte)4))) == iResult);
    assertTrue(tc.unwrapToLong(op.apply((long)18, tc.wrap((byte)4))) == iResult);
    assertTrue(((BigInteger)op.apply(BigInteger.valueOf(18), tc.wrap((byte)4))).longValue() == iResult);

    assertTrue(tc.unwrapToInt(op.apply((byte)18, tc.wrap((byte)4))) == iResult);
    assertTrue(tc.unwrapToInt(op.apply((char)18, tc.wrap((byte)4))) == iResult);
    assertTrue(tc.unwrapToInt(op.apply((short)18, tc.wrap((byte)4))) == iResult);
    assertTrue(tc.unwrapToInt(op.apply(18, tc.wrap((byte)4))) == iResult);
    assertTrue(tc.unwrapToLong(op.apply((long)18, (Object)tc.wrap((byte)4))) == iResult);
    assertTrue(((BigInteger)op.apply(BigInteger.valueOf(18), tc.wrap((byte)4))).longValue() == iResult);

    assertTrue(tc.unwrapToInt(op.apply(tc.wrap((byte)18), tc.wrap((byte)4))) == iResult);
    assertTrue(tc.unwrapToInt(op.apply(tc.wrap((char)18), tc.wrap((byte)4))) == iResult);
    assertTrue(tc.unwrapToInt(op.apply(tc.wrap((short)18), tc.wrap((byte)4))) == iResult);
    assertTrue(tc.unwrapToInt(op.apply(tc.wrap((int)18), tc.wrap((byte)4))) == iResult);
    assertTrue(tc.unwrapToLong(op.apply(tc.wrap((long)18), tc.wrap((byte)4))) == iResult);
    assertTrue(((BigInteger)op.apply(BigInteger.valueOf(18), tc.wrap((byte)4))).longValue() == iResult);

    assertTrue(tc.unwrapToInt(op.apply(tc.wrap((byte)18), tc.wrap((byte)4))) == iResult);
    assertTrue(tc.unwrapToInt(op.apply(tc.wrap((char)18), tc.wrap((byte)4))) == iResult);
    assertTrue(tc.unwrapToInt(op.apply(tc.wrap((short)18), tc.wrap((byte)4))) == iResult);
    assertTrue(tc.unwrapToInt(op.apply(tc.wrap((int)18), tc.wrap((byte)4))) == iResult);
    assertTrue(tc.unwrapToLong(op.apply(tc.wrap((long)18), tc.wrap((byte)4))) == iResult);
    assertTrue(((BigInteger)op.apply((Object)BigInteger.valueOf(18), (Object)tc.wrap((byte)4))).longValue() == iResult);

    assertTrue(tc.unwrapToInt(op.apply(tc.wrap((byte)18), byteMetaClass, tc.wrap((byte)4))) == iResult);
    assertTrue(tc.unwrapToInt(op.apply(tc.wrap((char)18), byteMetaClass, tc.wrap((byte)4))) == iResult);
    assertTrue(tc.unwrapToInt(op.apply(tc.wrap((short)18), byteMetaClass, tc.wrap((byte)4))) == iResult);
    assertTrue(tc.unwrapToInt(op.apply(tc.wrap((int)18), byteMetaClass, tc.wrap((byte)4))) == iResult);
    assertTrue(tc.unwrapToLong(op.apply(tc.wrap((long)18), byteMetaClass, tc.wrap((byte)4))) == iResult);
    assertTrue(((BigInteger)op.apply((Object)BigInteger.valueOf(18), byteMetaClass, (Object)tc.wrap((byte)4))).longValue() == iResult);

    assertTrue(op.intApply((byte)18, (char)4) == iResult);
    assertTrue(op.intApply((char)18, (char)4) == iResult);
    assertTrue(op.intApply((short)18, (char)4) == iResult);
    assertTrue(op.intApply(18, (char)4) == iResult);
    assertTrue(op.longApply((long)18, (char)4) == iResult);
    assertTrue(op.bigIntegerApply(BigInteger.valueOf(18), (char)4).longValue() == iResult);

    assertTrue(tc.unwrapToInt(op.apply((byte)18, (char)4)) == iResult);
    assertTrue(tc.unwrapToInt(op.apply((char)18, (char)4)) == iResult);
    assertTrue(tc.unwrapToInt(op.apply((short)18, (char)4)) == iResult);
    assertTrue(tc.unwrapToInt(op.apply(18, (char)4)) == iResult);
    assertTrue(tc.unwrapToLong(op.apply((long)18, (char)4)) == iResult);
    assertTrue(((BigInteger)op.apply(BigInteger.valueOf(18), (char)4)).longValue() == iResult);

    assertTrue(tc.unwrapToInt(op.apply(tc.wrap((byte)18), (char)4)) == iResult);
    assertTrue(tc.unwrapToInt(op.apply(tc.wrap((char)18), (char)4)) == iResult);
    assertTrue(tc.unwrapToInt(op.apply(tc.wrap((short)18), (char)4)) == iResult);
    assertTrue(tc.unwrapToInt(op.apply(tc.wrap((int)18), (char)4)) == iResult);
    assertTrue(tc.unwrapToLong(op.apply(tc.wrap((long)18), (char)4)) == iResult);

    assertTrue(tc.unwrapToInt(op.apply(tc.wrap((byte)18), (char)4)) == iResult);
    assertTrue(tc.unwrapToInt(op.apply(tc.wrap((char)18), (char)4)) == iResult);
    assertTrue(tc.unwrapToInt(op.apply(tc.wrap((short)18), (char)4)) == iResult);
    assertTrue(tc.unwrapToInt(op.apply(tc.wrap((int)18), (char)4)) == iResult);
    assertTrue(tc.unwrapToLong(op.apply(tc.wrap((long)18), (char)4)) == iResult);
    assertTrue(((BigInteger)op.apply((Object)BigInteger.valueOf(18), (char)4)).longValue() == iResult);

    assertTrue(tc.unwrapToInt(op.apply((byte)18, tc.wrap((char)4))) == iResult);
    assertTrue(tc.unwrapToInt(op.apply((char)18, tc.wrap((char)4))) == iResult);
    assertTrue(tc.unwrapToInt(op.apply((short)18, tc.wrap((char)4))) == iResult);
    assertTrue(tc.unwrapToInt(op.apply(18, tc.wrap((char)4))) == iResult);
    assertTrue(tc.unwrapToLong(op.apply((long)18, tc.wrap((char)4))) == iResult);
    assertTrue(((BigInteger)op.apply(BigInteger.valueOf(18), tc.wrap((char)4))).longValue() == iResult);

    assertTrue(tc.unwrapToInt(op.apply((byte)18, tc.wrap((char)4))) == iResult);
    assertTrue(tc.unwrapToInt(op.apply((char)18, tc.wrap((char)4))) == iResult);
    assertTrue(tc.unwrapToInt(op.apply((short)18, tc.wrap((char)4))) == iResult);
    assertTrue(tc.unwrapToInt(op.apply(18, tc.wrap((char)4))) == iResult);
    assertTrue(tc.unwrapToLong(op.apply((long)18, (Object)tc.wrap((char)4))) == iResult);
    assertTrue(((BigInteger)op.apply(BigInteger.valueOf(18), tc.wrap((char)4))).longValue() == iResult);

    assertTrue(tc.unwrapToInt(op.apply(tc.wrap((char)18), tc.wrap((char)4))) == iResult);
    assertTrue(tc.unwrapToInt(op.apply(tc.wrap((short)18), tc.wrap((char)4))) == iResult);
    assertTrue(tc.unwrapToInt(op.apply(tc.wrap((int)18), tc.wrap((char)4))) == iResult);
    assertTrue(tc.unwrapToLong(op.apply(tc.wrap((long)18), tc.wrap((char)4))) == iResult);
    assertTrue(((BigInteger)op.apply(BigInteger.valueOf(18), tc.wrap((char)4))).longValue() == iResult);

    assertTrue(tc.unwrapToInt(op.apply(tc.wrap((byte)18), tc.wrap((char)4))) == iResult);
    assertTrue(tc.unwrapToInt(op.apply(tc.wrap((char)18), tc.wrap((char)4))) == iResult);
    assertTrue(tc.unwrapToInt(op.apply(tc.wrap((short)18), tc.wrap((char)4))) == iResult);
    assertTrue(tc.unwrapToInt(op.apply(tc.wrap((int)18), tc.wrap((char)4))) == iResult);
    assertTrue(tc.unwrapToLong(op.apply(tc.wrap((long)18), tc.wrap((char)4))) == iResult);
    assertTrue(((BigInteger)op.apply((Object)BigInteger.valueOf(18), (Object)tc.wrap((char)4))).longValue() == iResult);

    assertTrue(tc.unwrapToInt(op.apply(tc.wrap((byte)18), charMetaClass, tc.wrap((char)4))) == iResult);
    assertTrue(tc.unwrapToInt(op.apply(tc.wrap((char)18), charMetaClass, tc.wrap((char)4))) == iResult);
    assertTrue(tc.unwrapToInt(op.apply(tc.wrap((short)18), charMetaClass, tc.wrap((char)4))) == iResult);
    assertTrue(tc.unwrapToInt(op.apply(tc.wrap((int)18), charMetaClass, tc.wrap((char)4))) == iResult);
    assertTrue(tc.unwrapToLong(op.apply(tc.wrap((long)18), charMetaClass, tc.wrap((char)4))) == iResult);
    assertTrue(((BigInteger)op.apply((Object)BigInteger.valueOf(18), charMetaClass, (Object)tc.wrap((char)4))).longValue() == iResult);

    assertTrue(tc.unwrapToInt(op.apply(tc.wrap((byte)18), charMetaClass,tc.wrap((char)4))) == iResult);
    assertTrue(tc.unwrapToInt(op.apply(tc.wrap((char)18), charMetaClass,tc.wrap((char)4))) == iResult);
    assertTrue(tc.unwrapToInt(op.apply(tc.wrap((short)18), charMetaClass,tc.wrap((char)4))) == iResult);
    assertTrue(tc.unwrapToInt(op.apply(tc.wrap((int)18), charMetaClass,tc.wrap((char)4))) == iResult);
    assertTrue(tc.unwrapToLong(op.apply(tc.wrap((long)18), charMetaClass,tc.wrap((char)4))) == iResult);
    assertTrue(((BigInteger)op.apply((Object)BigInteger.valueOf(18), charMetaClass,(Object)tc.wrap((char)4))).longValue() == iResult);

    assertTrue(op.intApply((byte)18, (short)4) == iResult);
    assertTrue(op.intApply((char)18, (short)4) == iResult);
    assertTrue(op.intApply((short)18, (short)4) == iResult);
    assertTrue(op.intApply(18, (short)4) == iResult);
    assertTrue(op.longApply((long)18, (short)4) == iResult);
    assertTrue(op.bigIntegerApply(BigInteger.valueOf(18), (short)4).longValue() == iResult);

    assertTrue(tc.unwrapToInt(op.apply((byte)18, (short)4)) == iResult);
    assertTrue(tc.unwrapToInt(op.apply((char)18, (short)4)) == iResult);
    assertTrue(tc.unwrapToInt(op.apply((short)18, (short)4)) == iResult);
    assertTrue(tc.unwrapToInt(op.apply(18, (short)4)) == iResult);
    assertTrue(tc.unwrapToLong(op.apply((long)18, (short)4)) == iResult);
    assertTrue(((BigInteger)op.apply(BigInteger.valueOf(18), (short)4)).longValue() == iResult);

    assertTrue(tc.unwrapToInt(op.apply(tc.wrap((byte)18), (short)4)) == iResult);
    assertTrue(tc.unwrapToInt(op.apply(tc.wrap((char)18), (short)4)) == iResult);
    assertTrue(tc.unwrapToInt(op.apply(tc.wrap((short)18), (short)4)) == iResult);
    assertTrue(tc.unwrapToInt(op.apply(tc.wrap((int)18), (short)4)) == iResult);
    assertTrue(tc.unwrapToLong(op.apply(tc.wrap((long)18), (short)4)) == iResult);

    assertTrue(tc.unwrapToInt(op.apply(tc.wrap((byte)18), (short)4)) == iResult);
    assertTrue(tc.unwrapToInt(op.apply(tc.wrap((char)18), (short)4)) == iResult);
    assertTrue(tc.unwrapToInt(op.apply(tc.wrap((short)18), (short)4)) == iResult);
    assertTrue(tc.unwrapToInt(op.apply(tc.wrap((int)18), (short)4)) == iResult);
    assertTrue(tc.unwrapToLong(op.apply(tc.wrap((long)18), (short)4)) == iResult);
    assertTrue(((BigInteger)op.apply((Object)BigInteger.valueOf(18), (short)4)).longValue() == iResult);

    assertTrue(tc.unwrapToInt(op.apply((byte)18, tc.wrap((short)4))) == iResult);
    assertTrue(tc.unwrapToInt(op.apply((char)18, tc.wrap((short)4))) == iResult);
    assertTrue(tc.unwrapToInt(op.apply((short)18, tc.wrap((short)4))) == iResult);
    assertTrue(tc.unwrapToInt(op.apply(18, tc.wrap((short)4))) == iResult);
    assertTrue(tc.unwrapToLong(op.apply((long)18, tc.wrap((short)4))) == iResult);
    assertTrue(((BigInteger)op.apply(BigInteger.valueOf(18), tc.wrap((short)4))).longValue() == iResult);

    assertTrue(tc.unwrapToInt(op.apply((byte)18, tc.wrap((short)4))) == iResult);
    assertTrue(tc.unwrapToInt(op.apply((char)18, tc.wrap((short)4))) == iResult);
    assertTrue(tc.unwrapToInt(op.apply((short)18, tc.wrap((short)4))) == iResult);
    assertTrue(tc.unwrapToInt(op.apply(18, tc.wrap((short)4))) == iResult);
    assertTrue(tc.unwrapToLong(op.apply((long)18, (Object)tc.wrap((short)4))) == iResult);
    assertTrue(((BigInteger)op.apply(BigInteger.valueOf(18), tc.wrap((short)4))).longValue() == iResult);

    assertTrue(tc.unwrapToInt(op.apply(tc.wrap((byte)18), tc.wrap((short)4))) == iResult);
    assertTrue(tc.unwrapToInt(op.apply(tc.wrap((char)18), tc.wrap((short)4))) == iResult);
    assertTrue(tc.unwrapToInt(op.apply(tc.wrap((short)18), tc.wrap((short)4))) == iResult);
    assertTrue(tc.unwrapToInt(op.apply(tc.wrap((int)18), tc.wrap((short)4))) == iResult);
    assertTrue(tc.unwrapToLong(op.apply(tc.wrap((long)18), tc.wrap((short)4))) == iResult);
    assertTrue(((BigInteger)op.apply(BigInteger.valueOf(18), tc.wrap((short)4))).longValue() == iResult);

    assertTrue(tc.unwrapToInt(op.apply(tc.wrap((byte)18), tc.wrap((short)4))) == iResult);
    assertTrue(tc.unwrapToInt(op.apply(tc.wrap((char)18), tc.wrap((short)4))) == iResult);
    assertTrue(tc.unwrapToInt(op.apply(tc.wrap((short)18), tc.wrap((short)4))) == iResult);
    assertTrue(tc.unwrapToInt(op.apply(tc.wrap((int)18), tc.wrap((short)4))) == iResult);
    assertTrue(tc.unwrapToLong(op.apply(tc.wrap((long)18), tc.wrap((short)4))) == iResult);
    assertTrue(((BigInteger)op.apply((Object)BigInteger.valueOf(18), (Object)tc.wrap((short)4))).longValue() == iResult);

    assertTrue(tc.unwrapToInt(op.apply(tc.wrap((byte)18), shortMetaClass, tc.wrap((short)4))) == iResult);
    assertTrue(tc.unwrapToInt(op.apply(tc.wrap((char)18), shortMetaClass, tc.wrap((short)4))) == iResult);
    assertTrue(tc.unwrapToInt(op.apply(tc.wrap((short)18), shortMetaClass, tc.wrap((short)4))) == iResult);
    assertTrue(tc.unwrapToInt(op.apply(tc.wrap((int)18), shortMetaClass, tc.wrap((short)4))) == iResult);
    assertTrue(tc.unwrapToLong(op.apply(tc.wrap((long)18), shortMetaClass, tc.wrap((short)4))) == iResult);
    assertTrue(((BigInteger)op.apply((Object)BigInteger.valueOf(18), shortMetaClass, (Object)tc.wrap((short)4))).longValue() == iResult);

    assertTrue(op.intApply((byte)18, 4) == iResult);
    assertTrue(op.intApply((char)18, 4) == iResult);
    assertTrue(op.intApply((short)18, 4) == iResult);
    assertTrue(op.intApply(18, 4) == iResult);
    assertTrue(op.longApply((long)18, 4) == iResult);
    assertTrue(op.bigIntegerApply(BigInteger.valueOf(18), 4).longValue() == iResult);

    assertTrue(tc.unwrapToInt(op.apply((byte)18, 4)) == iResult);
    assertTrue(tc.unwrapToInt(op.apply((char)18, 4)) == iResult);
    assertTrue(tc.unwrapToInt(op.apply((short)18, 4)) == iResult);
    assertTrue(tc.unwrapToInt(op.apply(18, 4)) == iResult);
    assertTrue(tc.unwrapToLong(op.apply((long)18, 4)) == iResult);
    assertTrue(((BigInteger)op.apply(BigInteger.valueOf(18), 4)).longValue() == iResult);

    assertTrue(tc.unwrapToInt(op.apply(tc.wrap((byte)18), 4)) == iResult);
    assertTrue(tc.unwrapToInt(op.apply(tc.wrap((char)18), 4)) == iResult);
    assertTrue(tc.unwrapToInt(op.apply(tc.wrap((short)18), 4)) == iResult);
    assertTrue(tc.unwrapToInt(op.apply(tc.wrap((int)18), 4)) == iResult);
    assertTrue(tc.unwrapToLong(op.apply(tc.wrap((long)18), 4)) == iResult);

    assertTrue(tc.unwrapToInt(op.apply(tc.wrap((byte)18), 4)) == iResult);
    assertTrue(tc.unwrapToInt(op.apply(tc.wrap((char)18), 4)) == iResult);
    assertTrue(tc.unwrapToInt(op.apply(tc.wrap((short)18), 4)) == iResult);
    assertTrue(tc.unwrapToInt(op.apply(tc.wrap((int)18), 4)) == iResult);
    assertTrue(tc.unwrapToLong(op.apply(tc.wrap((long)18), 4)) == iResult);
    assertTrue(((BigInteger)op.apply((Object)BigInteger.valueOf(18), 4)).longValue() == iResult);

    assertTrue(tc.unwrapToInt(op.apply((byte)18, tc.wrap((int)4))) == iResult);
    assertTrue(tc.unwrapToInt(op.apply((char)18, tc.wrap((int)4))) == iResult);
    assertTrue(tc.unwrapToInt(op.apply((short)18, tc.wrap((int)4))) == iResult);
    assertTrue(tc.unwrapToInt(op.apply(18, tc.wrap((int)4))) == iResult);
    assertTrue(tc.unwrapToLong(op.apply((long)18, tc.wrap((int)4))) == iResult);
    assertTrue(((BigInteger)op.apply(BigInteger.valueOf(18), tc.wrap((int)4))).longValue() == iResult);

    assertTrue(tc.unwrapToInt(op.apply((byte)18, tc.wrap((int)4))) == iResult);
    assertTrue(tc.unwrapToInt(op.apply((char)18, tc.wrap((int)4))) == iResult);
    assertTrue(tc.unwrapToInt(op.apply((short)18, tc.wrap((int)4))) == iResult);
    assertTrue(tc.unwrapToInt(op.apply(18, tc.wrap((int)4))) == iResult);
    assertTrue(tc.unwrapToLong(op.apply((long)18, (Object)tc.wrap((int)4))) == iResult);
    assertTrue(((BigInteger)op.apply(BigInteger.valueOf(18), tc.wrap((int)4))).longValue() == iResult);

    assertTrue(tc.unwrapToInt(op.apply(tc.wrap((byte)18), tc.wrap((int)4))) == iResult);
    assertTrue(tc.unwrapToInt(op.apply(tc.wrap((char)18), tc.wrap((int)4))) == iResult);
    assertTrue(tc.unwrapToInt(op.apply(tc.wrap((short)18), tc.wrap((int)4))) == iResult);
    assertTrue(tc.unwrapToInt(op.apply(tc.wrap((int)18), tc.wrap((int)4))) == iResult);
    assertTrue(tc.unwrapToLong(op.apply(tc.wrap((long)18), tc.wrap((int)4))) == iResult);
    assertTrue(((BigInteger)op.apply(BigInteger.valueOf(18), tc.wrap((int)4))).longValue() == iResult);

    assertTrue(tc.unwrapToInt(op.apply(tc.wrap((byte)18), tc.wrap((int)4))) == iResult);
    assertTrue(tc.unwrapToInt(op.apply(tc.wrap((char)18), tc.wrap((int)4))) == iResult);
    assertTrue(tc.unwrapToInt(op.apply(tc.wrap((short)18), tc.wrap((int)4))) == iResult);
    assertTrue(tc.unwrapToInt(op.apply(tc.wrap((int)18), tc.wrap((int)4))) == iResult);
    assertTrue(tc.unwrapToLong(op.apply(tc.wrap((long)18), tc.wrap((int)4))) == iResult);
    assertTrue(((BigInteger)op.apply((Object)BigInteger.valueOf(18), (Object)tc.wrap((int)4))).longValue() == iResult);

    assertTrue(tc.unwrapToInt(op.apply(tc.wrap((byte)18), intMetaClass, tc.wrap((int)4))) == iResult);
    assertTrue(tc.unwrapToInt(op.apply(tc.wrap((char)18), intMetaClass, tc.wrap((int)4))) == iResult);
    assertTrue(tc.unwrapToInt(op.apply(tc.wrap((short)18), intMetaClass, tc.wrap((int)4))) == iResult);
    assertTrue(tc.unwrapToInt(op.apply(tc.wrap((int)18), intMetaClass, tc.wrap((int)4))) == iResult);
    assertTrue(tc.unwrapToLong(op.apply(tc.wrap((long)18), intMetaClass, tc.wrap((int)4))) == iResult);
    assertTrue(((BigInteger)op.apply((Object)BigInteger.valueOf(18), intMetaClass, (Object)tc.wrap((int)4))).longValue() == iResult);

    assertTrue(op.longApply((byte)18, (long)4) == iResult);
    assertTrue(op.longApply((char)18, (long)4) == iResult);
    assertTrue(op.longApply((short)18, (long)4) == iResult);
    assertTrue(op.longApply(18, (long)4) == iResult);
    assertTrue(op.longApply((long)18, (long)4) == iResult);
    assertTrue(op.bigIntegerApply(BigInteger.valueOf(18), (long)4).longValue() == iResult);

    assertTrue(tc.unwrapToLong(op.apply((byte)18, (long)4)) == iResult);
    assertTrue(tc.unwrapToLong(op.apply((char)18, (long)4)) == iResult);
    assertTrue(tc.unwrapToLong(op.apply((short)18, (long)4)) == iResult);
    assertTrue(tc.unwrapToLong(op.apply(18, (long)4)) == iResult);
    assertTrue(tc.unwrapToLong(op.apply((long)18, (long)4)) == iResult);
    assertTrue(((BigInteger)op.apply(BigInteger.valueOf(18), (long)4)).longValue() == iResult);

    assertTrue(tc.unwrapToLong(op.apply(tc.wrap((byte)18), (long)4)) == iResult);
    assertTrue(tc.unwrapToLong(op.apply(tc.wrap((char)18), (long)4)) == iResult);
    assertTrue(tc.unwrapToLong(op.apply(tc.wrap((short)18), (long)4)) == iResult);
    assertTrue(tc.unwrapToLong(op.apply(tc.wrap((int)18), (long)4)) == iResult);
    assertTrue(tc.unwrapToLong(op.apply(tc.wrap((long)18), (long)4)) == iResult);

    assertTrue(tc.unwrapToLong(op.apply((Object)tc.wrap((byte)18), (long)4)) == iResult);
    assertTrue(tc.unwrapToLong(op.apply((Object)tc.wrap((char)18), (long)4)) == iResult);
    assertTrue(tc.unwrapToLong(op.apply((Object)tc.wrap((short)18), (long)4)) == iResult);
    assertTrue(tc.unwrapToLong(op.apply((Object)tc.wrap((int)18), (long)4)) == iResult);
    assertTrue(tc.unwrapToLong(op.apply((Object)tc.wrap((long)18), (long)4)) == iResult);
    assertTrue(((BigInteger)op.apply((Object)BigInteger.valueOf(18), (long)4)).longValue() == iResult);

    assertTrue(tc.unwrapToLong(op.apply((byte)18, tc.wrap((long)4))) == iResult);
    assertTrue(tc.unwrapToLong(op.apply((char)18, tc.wrap((long)4))) == iResult);
    assertTrue(tc.unwrapToLong(op.apply((short)18, tc.wrap((long)4))) == iResult);
    assertTrue(tc.unwrapToLong(op.apply(18, tc.wrap((long)4))) == iResult);
    assertTrue(tc.unwrapToLong(op.apply((long)18, tc.wrap((long)4))) == iResult);
    assertTrue(((BigInteger)op.apply(BigInteger.valueOf(18), tc.wrap((long)4))).longValue() == iResult);

    assertTrue(tc.unwrapToLong(op.apply((byte)18, tc.wrap((long)4))) == iResult);
    assertTrue(tc.unwrapToLong(op.apply((char)18, tc.wrap((long)4))) == iResult);
    assertTrue(tc.unwrapToLong(op.apply((short)18, tc.wrap((long)4))) == iResult);
    assertTrue(tc.unwrapToLong(op.apply(18, tc.wrap((long)4))) == iResult);
    assertTrue(tc.unwrapToLong(op.apply((long)18, (Object)tc.wrap((long)4))) == iResult);
    assertTrue(((BigInteger)op.apply(BigInteger.valueOf(18), tc.wrap((long)4))).longValue() == iResult);

    assertTrue(tc.unwrapToLong(op.apply(tc.wrap((byte)18), tc.wrap((long)4))) == iResult);
    assertTrue(tc.unwrapToLong(op.apply(tc.wrap((char)18), tc.wrap((long)4))) == iResult);
    assertTrue(tc.unwrapToLong(op.apply(tc.wrap((short)18), tc.wrap((long)4))) == iResult);
    assertTrue(tc.unwrapToLong(op.apply(tc.wrap((int)18), tc.wrap((long)4))) == iResult);
    assertTrue(tc.unwrapToLong(op.apply(tc.wrap((long)18), tc.wrap((long)4))) == iResult);
    assertTrue(((BigInteger)op.apply(BigInteger.valueOf(18), tc.wrap((long)4))).longValue() == iResult);

    assertTrue(tc.unwrapToLong(op.apply(tc.wrap((byte)18), tc.wrap((long)4))) == iResult);
    assertTrue(tc.unwrapToLong(op.apply(tc.wrap((char)18), tc.wrap((long)4))) == iResult);
    assertTrue(tc.unwrapToLong(op.apply(tc.wrap((short)18), tc.wrap((long)4))) == iResult);
    assertTrue(tc.unwrapToLong(op.apply(tc.wrap((int)18), tc.wrap((long)4))) == iResult);
    assertTrue(tc.unwrapToLong(op.apply(tc.wrap((long)18), tc.wrap((long)4))) == iResult);
    assertTrue(((BigInteger)op.apply((Object)BigInteger.valueOf(18), (Object)tc.wrap((long)4))).longValue() == iResult);

    assertTrue(tc.unwrapToLong(op.apply(tc.wrap((byte)18), longMetaClass, tc.wrap((long)4))) == iResult);
    assertTrue(tc.unwrapToLong(op.apply(tc.wrap((char)18), longMetaClass, tc.wrap((long)4))) == iResult);
    assertTrue(tc.unwrapToLong(op.apply(tc.wrap((short)18), longMetaClass, tc.wrap((long)4))) == iResult);
    assertTrue(tc.unwrapToLong(op.apply(tc.wrap((int)18), longMetaClass, tc.wrap((long)4))) == iResult);
    assertTrue(tc.unwrapToLong(op.apply(tc.wrap((long)18), longMetaClass, tc.wrap((long)4))) == iResult);
    assertTrue(((BigInteger)op.apply((Object)BigInteger.valueOf(18), longMetaClass, (Object)tc.wrap((long)4))).longValue() == iResult);

    assertTrue(op.bigIntegerApply((byte)18, BigInteger.valueOf(4)).longValue() == iResult);
    assertTrue(op.bigIntegerApply((char)18, BigInteger.valueOf(4)).longValue() == iResult);
    assertTrue(op.bigIntegerApply((short)18, BigInteger.valueOf(4)).longValue() == iResult);
    assertTrue(op.bigIntegerApply(18, BigInteger.valueOf(4)).longValue() == iResult);
    assertTrue(op.bigIntegerApply(BigInteger.valueOf(18), BigInteger.valueOf(4)).longValue() == iResult);

    assertTrue(((BigInteger)op.apply((byte)18, BigInteger.valueOf(4))).longValue() == iResult);
    assertTrue(((BigInteger)op.apply((char)18, BigInteger.valueOf(4))).longValue() == iResult);
    assertTrue(((BigInteger)op.apply((short)18, BigInteger.valueOf(4))).longValue() == iResult);
    assertTrue(((BigInteger)op.apply(18, BigInteger.valueOf(4))).longValue() == iResult);
    assertTrue(((BigInteger)op.apply((long)18, BigInteger.valueOf(4))).longValue() == iResult);
    assertTrue(((BigInteger)op.apply(BigInteger.valueOf(18), BigInteger.valueOf(4))).longValue() == iResult);

    assertTrue(((BigInteger)op.apply(tc.wrap((byte)18), BigInteger.valueOf(4))).longValue() == iResult);
    assertTrue(((BigInteger)op.apply(tc.wrap((char)18), BigInteger.valueOf(4))).longValue() == iResult);
    assertTrue(((BigInteger)op.apply(tc.wrap((short)18), BigInteger.valueOf(4))).longValue() == iResult);
    assertTrue(((BigInteger)op.apply(tc.wrap((int)18), BigInteger.valueOf(4))).longValue() == iResult);
    assertTrue(((BigInteger)op.apply(tc.wrap((long)18), BigInteger.valueOf(4))).longValue() == iResult);

    assertTrue(((BigInteger)op.apply(tc.wrap((byte)18), BigInteger.valueOf(4))).longValue() == iResult);
    assertTrue(((BigInteger)op.apply(tc.wrap((char)18), BigInteger.valueOf(4))).longValue() == iResult);
    assertTrue(((BigInteger)op.apply(tc.wrap((short)18), BigInteger.valueOf(4))).longValue() == iResult);
    assertTrue(((BigInteger)op.apply(tc.wrap((int)18), BigInteger.valueOf(4))).longValue() == iResult);
    assertTrue(((BigInteger)op.apply(tc.wrap((long)18), BigInteger.valueOf(4))).longValue() == iResult);
    assertTrue(((BigInteger)op.apply((Object)BigInteger.valueOf(18), BigInteger.valueOf(4))).longValue() == iResult);

    assertTrue(((BigInteger)op.apply((Object)tc.wrap((byte)18), (Object)BigInteger.valueOf(4))).longValue() == iResult);
    assertTrue(((BigInteger)op.apply((Object)tc.wrap((char)18), (Object)BigInteger.valueOf(4))).longValue() == iResult);
    assertTrue(((BigInteger)op.apply((Object)tc.wrap((short)18), (Object)BigInteger.valueOf(4))).longValue() == iResult);
    assertTrue(((BigInteger)op.apply((Object)tc.wrap((int)18), (Object)BigInteger.valueOf(4))).longValue() == iResult);
    assertTrue(((BigInteger)op.apply((Object)tc.wrap((long)18), (Object)BigInteger.valueOf(4))).longValue() == iResult);
    assertTrue(((BigInteger)op.apply((Object)BigInteger.valueOf(18), (Object)BigInteger.valueOf(4))).longValue() == iResult);

    assertTrue(((BigInteger)op.apply(tc.wrap((byte)18), bigIntegerMetaClass, BigInteger.valueOf(4))).longValue() == iResult);
    assertTrue(((BigInteger)op.apply(tc.wrap((char)18), bigIntegerMetaClass, BigInteger.valueOf(4))).longValue() == iResult);
    assertTrue(((BigInteger)op.apply(tc.wrap((short)18), bigIntegerMetaClass, BigInteger.valueOf(4))).longValue() == iResult);
    assertTrue(((BigInteger)op.apply(tc.wrap((int)18), bigIntegerMetaClass, BigInteger.valueOf(4))).longValue() == iResult);
    assertTrue(((BigInteger)op.apply((Object)tc.wrap((long)18), bigIntegerMetaClass, (Object)BigInteger.valueOf(4))).longValue() == iResult);
    assertTrue(((BigInteger)op.apply((Object)BigInteger.valueOf(18), bigIntegerMetaClass, (Object)BigInteger.valueOf(4))).longValue() == iResult);
  }

  public void testAnd() throws Throwable {
    final ExtendedThreadContext tc = (ExtendedThreadContext)ThreadContext.getThreadContext();
    doTest(tc, tc.and(), 18 & 4);
  }

  public void testOr() throws Throwable {
    final ExtendedThreadContext tc = (ExtendedThreadContext)ThreadContext.getThreadContext();
    doTest(tc, tc.or(), 18 | 4);
  }

  public void testXor() throws Throwable {
    final ExtendedThreadContext tc = (ExtendedThreadContext)ThreadContext.getThreadContext();
    doTest(tc, tc.xor(), 18 ^ 4);
  }
}