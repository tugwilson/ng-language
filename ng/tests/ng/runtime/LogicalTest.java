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

    assertTrue(tc.unwrapToInt(op.apply(NgByte.valueOf((byte)18), (byte)4)) == iResult);
    assertTrue(tc.unwrapToInt(op.apply(NgChar.valueOf((char)18), (byte)4)) == iResult);
    assertTrue(tc.unwrapToInt(op.apply(NgShort.valueOf((short)18), (byte)4)) == iResult);
    assertTrue(tc.unwrapToInt(op.apply(NgInt.valueOf(18), (byte)4)) == iResult);
    assertTrue(tc.unwrapToLong(op.apply(NgLong.valueOf(18), (byte)4)) == iResult);

    assertTrue(tc.unwrapToInt(op.apply(NgByte.valueOf((byte)18), (byte)4)) == iResult);
    assertTrue(tc.unwrapToInt(op.apply(NgChar.valueOf((char)18), (byte)4)) == iResult);
    assertTrue(tc.unwrapToInt(op.apply(NgShort.valueOf((short)18), (byte)4)) == iResult);
    assertTrue(tc.unwrapToInt(op.apply(NgInt.valueOf(18), (byte)4)) == iResult);
    assertTrue(tc.unwrapToLong(op.apply(NgLong.valueOf(18), (byte)4)) == iResult);
    assertTrue(((BigInteger)op.apply((Object)BigInteger.valueOf(18), (byte)4)).longValue() == iResult);

    assertTrue(tc.unwrapToInt(op.apply((byte)18, NgByte.valueOf((byte)4))) == iResult);
    assertTrue(tc.unwrapToInt(op.apply((char)18, NgByte.valueOf((byte)4))) == iResult);
    assertTrue(tc.unwrapToInt(op.apply((short)18, NgByte.valueOf((byte)4))) == iResult);
    assertTrue(tc.unwrapToInt(op.apply(18, NgByte.valueOf((byte)4))) == iResult);
    assertTrue(tc.unwrapToLong(op.apply((long)18, NgByte.valueOf((byte)4))) == iResult);
    assertTrue(((BigInteger)op.apply(BigInteger.valueOf(18), NgByte.valueOf((byte)4))).longValue() == iResult);

    assertTrue(tc.unwrapToInt(op.apply((byte)18, NgByte.valueOf((byte)4))) == iResult);
    assertTrue(tc.unwrapToInt(op.apply((char)18, NgByte.valueOf((byte)4))) == iResult);
    assertTrue(tc.unwrapToInt(op.apply((short)18, NgByte.valueOf((byte)4))) == iResult);
    assertTrue(tc.unwrapToInt(op.apply(18, NgByte.valueOf((byte)4))) == iResult);
    assertTrue(tc.unwrapToLong(op.apply((long)18, (Object)NgByte.valueOf((byte)4))) == iResult);
    assertTrue(((BigInteger)op.apply(BigInteger.valueOf(18), NgByte.valueOf((byte)4))).longValue() == iResult);

    assertTrue(tc.unwrapToInt(op.apply(NgByte.valueOf((byte)18), NgByte.valueOf((byte)4))) == iResult);
    assertTrue(tc.unwrapToInt(op.apply(NgChar.valueOf((char)18), NgByte.valueOf((byte)4))) == iResult);
    assertTrue(tc.unwrapToInt(op.apply(NgShort.valueOf((short)18), NgByte.valueOf((byte)4))) == iResult);
    assertTrue(tc.unwrapToInt(op.apply(NgInt.valueOf(18), NgByte.valueOf((byte)4))) == iResult);
    assertTrue(tc.unwrapToLong(op.apply(NgLong.valueOf(18), NgByte.valueOf((byte)4))) == iResult);
    assertTrue(((BigInteger)op.apply(BigInteger.valueOf(18), NgByte.valueOf((byte)4))).longValue() == iResult);

    assertTrue(tc.unwrapToInt(op.apply(NgByte.valueOf((byte)18), NgByte.valueOf((byte)4))) == iResult);
    assertTrue(tc.unwrapToInt(op.apply(NgChar.valueOf((char)18), NgByte.valueOf((byte)4))) == iResult);
    assertTrue(tc.unwrapToInt(op.apply(NgShort.valueOf((short)18), NgByte.valueOf((byte)4))) == iResult);
    assertTrue(tc.unwrapToInt(op.apply(NgInt.valueOf(18), NgByte.valueOf((byte)4))) == iResult);
    assertTrue(tc.unwrapToLong(op.apply(NgLong.valueOf(18), NgByte.valueOf((byte)4))) == iResult);
    assertTrue(((BigInteger)op.apply((Object)BigInteger.valueOf(18), (Object)NgByte.valueOf((byte)4))).longValue() == iResult);

    assertTrue(tc.unwrapToInt(op.apply(NgByte.valueOf((byte)18), byteMetaClass, NgByte.valueOf((byte)4))) == iResult);
    assertTrue(tc.unwrapToInt(op.apply(NgChar.valueOf((char)18), byteMetaClass, NgByte.valueOf((byte)4))) == iResult);
    assertTrue(tc.unwrapToInt(op.apply(NgShort.valueOf((short)18), byteMetaClass, NgByte.valueOf((byte)4))) == iResult);
    assertTrue(tc.unwrapToInt(op.apply(NgInt.valueOf(18), byteMetaClass, NgByte.valueOf((byte)4))) == iResult);
    assertTrue(tc.unwrapToLong(op.apply(NgLong.valueOf(18), byteMetaClass, NgByte.valueOf((byte)4))) == iResult);
    assertTrue(((BigInteger)op.apply((Object)BigInteger.valueOf(18), byteMetaClass, (Object)NgByte.valueOf((byte)4))).longValue() == iResult);

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

    assertTrue(tc.unwrapToInt(op.apply(NgByte.valueOf((byte)18), (char)4)) == iResult);
    assertTrue(tc.unwrapToInt(op.apply(NgChar.valueOf((char)18), (char)4)) == iResult);
    assertTrue(tc.unwrapToInt(op.apply(NgShort.valueOf((short)18), (char)4)) == iResult);
    assertTrue(tc.unwrapToInt(op.apply(NgInt.valueOf(18), (char)4)) == iResult);
    assertTrue(tc.unwrapToLong(op.apply(NgLong.valueOf(18), (char)4)) == iResult);

    assertTrue(tc.unwrapToInt(op.apply(NgByte.valueOf((byte)18), (char)4)) == iResult);
    assertTrue(tc.unwrapToInt(op.apply(NgChar.valueOf((char)18), (char)4)) == iResult);
    assertTrue(tc.unwrapToInt(op.apply(NgShort.valueOf((short)18), (char)4)) == iResult);
    assertTrue(tc.unwrapToInt(op.apply(NgInt.valueOf(18), (char)4)) == iResult);
    assertTrue(tc.unwrapToLong(op.apply(NgLong.valueOf(18), (char)4)) == iResult);
    assertTrue(((BigInteger)op.apply((Object)BigInteger.valueOf(18), (char)4)).longValue() == iResult);

    assertTrue(tc.unwrapToInt(op.apply((byte)18, NgChar.valueOf((char)4))) == iResult);
    assertTrue(tc.unwrapToInt(op.apply((char)18, NgChar.valueOf((char)4))) == iResult);
    assertTrue(tc.unwrapToInt(op.apply((short)18, NgChar.valueOf((char)4))) == iResult);
    assertTrue(tc.unwrapToInt(op.apply(18, NgChar.valueOf((char)4))) == iResult);
    assertTrue(tc.unwrapToLong(op.apply((long)18, NgChar.valueOf((char)4))) == iResult);
    assertTrue(((BigInteger)op.apply(BigInteger.valueOf(18), NgChar.valueOf((char)4))).longValue() == iResult);

    assertTrue(tc.unwrapToInt(op.apply((byte)18, NgChar.valueOf((char)4))) == iResult);
    assertTrue(tc.unwrapToInt(op.apply((char)18, NgChar.valueOf((char)4))) == iResult);
    assertTrue(tc.unwrapToInt(op.apply((short)18, NgChar.valueOf((char)4))) == iResult);
    assertTrue(tc.unwrapToInt(op.apply(18, NgChar.valueOf((char)4))) == iResult);
    assertTrue(tc.unwrapToLong(op.apply((long)18, (Object)NgChar.valueOf((char)4))) == iResult);
    assertTrue(((BigInteger)op.apply(BigInteger.valueOf(18), NgChar.valueOf((char)4))).longValue() == iResult);

    assertTrue(tc.unwrapToInt(op.apply(NgChar.valueOf((char)18), NgChar.valueOf((char)4))) == iResult);
    assertTrue(tc.unwrapToInt(op.apply(NgShort.valueOf((short)18), NgChar.valueOf((char)4))) == iResult);
    assertTrue(tc.unwrapToInt(op.apply(NgInt.valueOf(18), NgChar.valueOf((char)4))) == iResult);
    assertTrue(tc.unwrapToLong(op.apply(NgLong.valueOf(18), NgChar.valueOf((char)4))) == iResult);
    assertTrue(((BigInteger)op.apply(BigInteger.valueOf(18), NgChar.valueOf((char)4))).longValue() == iResult);

    assertTrue(tc.unwrapToInt(op.apply(NgByte.valueOf((byte)18), NgChar.valueOf((char)4))) == iResult);
    assertTrue(tc.unwrapToInt(op.apply(NgChar.valueOf((char)18), NgChar.valueOf((char)4))) == iResult);
    assertTrue(tc.unwrapToInt(op.apply(NgShort.valueOf((short)18), NgChar.valueOf((char)4))) == iResult);
    assertTrue(tc.unwrapToInt(op.apply(NgInt.valueOf(18), NgChar.valueOf((char)4))) == iResult);
    assertTrue(tc.unwrapToLong(op.apply(NgLong.valueOf(18), NgChar.valueOf((char)4))) == iResult);
    assertTrue(((BigInteger)op.apply((Object)BigInteger.valueOf(18), (Object)NgChar.valueOf((char)4))).longValue() == iResult);

    assertTrue(tc.unwrapToInt(op.apply(NgByte.valueOf((byte)18), charMetaClass, NgChar.valueOf((char)4))) == iResult);
    assertTrue(tc.unwrapToInt(op.apply(NgChar.valueOf((char)18), charMetaClass, NgChar.valueOf((char)4))) == iResult);
    assertTrue(tc.unwrapToInt(op.apply(NgShort.valueOf((short)18), charMetaClass, NgChar.valueOf((char)4))) == iResult);
    assertTrue(tc.unwrapToInt(op.apply(NgInt.valueOf(18), charMetaClass, NgChar.valueOf((char)4))) == iResult);
    assertTrue(tc.unwrapToLong(op.apply(NgLong.valueOf(18), charMetaClass, NgChar.valueOf((char)4))) == iResult);
    assertTrue(((BigInteger)op.apply((Object)BigInteger.valueOf(18), charMetaClass, (Object)NgChar.valueOf((char)4))).longValue() == iResult);

    assertTrue(tc.unwrapToInt(op.apply(NgByte.valueOf((byte)18), charMetaClass,NgChar.valueOf((char)4))) == iResult);
    assertTrue(tc.unwrapToInt(op.apply(NgChar.valueOf((char)18), charMetaClass,NgChar.valueOf((char)4))) == iResult);
    assertTrue(tc.unwrapToInt(op.apply(NgShort.valueOf((short)18), charMetaClass,NgChar.valueOf((char)4))) == iResult);
    assertTrue(tc.unwrapToInt(op.apply(NgInt.valueOf(18), charMetaClass,NgChar.valueOf((char)4))) == iResult);
    assertTrue(tc.unwrapToLong(op.apply(NgLong.valueOf(18), charMetaClass,NgChar.valueOf((char)4))) == iResult);
    assertTrue(((BigInteger)op.apply((Object)BigInteger.valueOf(18), charMetaClass,(Object)NgChar.valueOf((char)4))).longValue() == iResult);

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

    assertTrue(tc.unwrapToInt(op.apply(NgByte.valueOf((byte)18), (short)4)) == iResult);
    assertTrue(tc.unwrapToInt(op.apply(NgChar.valueOf((char)18), (short)4)) == iResult);
    assertTrue(tc.unwrapToInt(op.apply(NgShort.valueOf((short)18), (short)4)) == iResult);
    assertTrue(tc.unwrapToInt(op.apply(NgInt.valueOf(18), (short)4)) == iResult);
    assertTrue(tc.unwrapToLong(op.apply(NgLong.valueOf(18), (short)4)) == iResult);

    assertTrue(tc.unwrapToInt(op.apply(NgByte.valueOf((byte)18), (short)4)) == iResult);
    assertTrue(tc.unwrapToInt(op.apply(NgChar.valueOf((char)18), (short)4)) == iResult);
    assertTrue(tc.unwrapToInt(op.apply(NgShort.valueOf((short)18), (short)4)) == iResult);
    assertTrue(tc.unwrapToInt(op.apply(NgInt.valueOf(18), (short)4)) == iResult);
    assertTrue(tc.unwrapToLong(op.apply(NgLong.valueOf(18), (short)4)) == iResult);
    assertTrue(((BigInteger)op.apply((Object)BigInteger.valueOf(18), (short)4)).longValue() == iResult);

    assertTrue(tc.unwrapToInt(op.apply((byte)18, NgShort.valueOf((short)4))) == iResult);
    assertTrue(tc.unwrapToInt(op.apply((char)18, NgShort.valueOf((short)4))) == iResult);
    assertTrue(tc.unwrapToInt(op.apply((short)18, NgShort.valueOf((short)4))) == iResult);
    assertTrue(tc.unwrapToInt(op.apply(18, NgShort.valueOf((short)4))) == iResult);
    assertTrue(tc.unwrapToLong(op.apply((long)18, NgShort.valueOf((short)4))) == iResult);
    assertTrue(((BigInteger)op.apply(BigInteger.valueOf(18), NgShort.valueOf((short)4))).longValue() == iResult);

    assertTrue(tc.unwrapToInt(op.apply((byte)18, NgShort.valueOf((short)4))) == iResult);
    assertTrue(tc.unwrapToInt(op.apply((char)18, NgShort.valueOf((short)4))) == iResult);
    assertTrue(tc.unwrapToInt(op.apply((short)18, NgShort.valueOf((short)4))) == iResult);
    assertTrue(tc.unwrapToInt(op.apply(18, NgShort.valueOf((short)4))) == iResult);
    assertTrue(tc.unwrapToLong(op.apply((long)18, (Object)NgShort.valueOf((short)4))) == iResult);
    assertTrue(((BigInteger)op.apply(BigInteger.valueOf(18), NgShort.valueOf((short)4))).longValue() == iResult);

    assertTrue(tc.unwrapToInt(op.apply(NgByte.valueOf((byte)18), NgShort.valueOf((short)4))) == iResult);
    assertTrue(tc.unwrapToInt(op.apply(NgChar.valueOf((char)18), NgShort.valueOf((short)4))) == iResult);
    assertTrue(tc.unwrapToInt(op.apply(NgShort.valueOf((short)18), NgShort.valueOf((short)4))) == iResult);
    assertTrue(tc.unwrapToInt(op.apply(NgInt.valueOf(18), NgShort.valueOf((short)4))) == iResult);
    assertTrue(tc.unwrapToLong(op.apply(NgLong.valueOf(18), NgShort.valueOf((short)4))) == iResult);
    assertTrue(((BigInteger)op.apply(BigInteger.valueOf(18), NgShort.valueOf((short)4))).longValue() == iResult);

    assertTrue(tc.unwrapToInt(op.apply(NgByte.valueOf((byte)18), NgShort.valueOf((short)4))) == iResult);
    assertTrue(tc.unwrapToInt(op.apply(NgChar.valueOf((char)18), NgShort.valueOf((short)4))) == iResult);
    assertTrue(tc.unwrapToInt(op.apply(NgShort.valueOf((short)18), NgShort.valueOf((short)4))) == iResult);
    assertTrue(tc.unwrapToInt(op.apply(NgInt.valueOf(18), NgShort.valueOf((short)4))) == iResult);
    assertTrue(tc.unwrapToLong(op.apply(NgLong.valueOf(18), NgShort.valueOf((short)4))) == iResult);
    assertTrue(((BigInteger)op.apply((Object)BigInteger.valueOf(18), (Object)NgShort.valueOf((short)4))).longValue() == iResult);

    assertTrue(tc.unwrapToInt(op.apply(NgByte.valueOf((byte)18), shortMetaClass, NgShort.valueOf((short)4))) == iResult);
    assertTrue(tc.unwrapToInt(op.apply(NgChar.valueOf((char)18), shortMetaClass, NgShort.valueOf((short)4))) == iResult);
    assertTrue(tc.unwrapToInt(op.apply(NgShort.valueOf((short)18), shortMetaClass, NgShort.valueOf((short)4))) == iResult);
    assertTrue(tc.unwrapToInt(op.apply(NgInt.valueOf(18), shortMetaClass, NgShort.valueOf((short)4))) == iResult);
    assertTrue(tc.unwrapToLong(op.apply(NgLong.valueOf(18), shortMetaClass, NgShort.valueOf((short)4))) == iResult);
    assertTrue(((BigInteger)op.apply((Object)BigInteger.valueOf(18), shortMetaClass, (Object)NgShort.valueOf((short)4))).longValue() == iResult);

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

    assertTrue(tc.unwrapToInt(op.apply(NgByte.valueOf((byte)18), 4)) == iResult);
    assertTrue(tc.unwrapToInt(op.apply(NgChar.valueOf((char)18), 4)) == iResult);
    assertTrue(tc.unwrapToInt(op.apply(NgShort.valueOf((short)18), 4)) == iResult);
    assertTrue(tc.unwrapToInt(op.apply(NgInt.valueOf(18), 4)) == iResult);
    assertTrue(tc.unwrapToLong(op.apply(NgLong.valueOf(18), 4)) == iResult);

    assertTrue(tc.unwrapToInt(op.apply(NgByte.valueOf((byte)18), 4)) == iResult);
    assertTrue(tc.unwrapToInt(op.apply(NgChar.valueOf((char)18), 4)) == iResult);
    assertTrue(tc.unwrapToInt(op.apply(NgShort.valueOf((short)18), 4)) == iResult);
    assertTrue(tc.unwrapToInt(op.apply(NgInt.valueOf(18), 4)) == iResult);
    assertTrue(tc.unwrapToLong(op.apply(NgLong.valueOf(18), 4)) == iResult);
    assertTrue(((BigInteger)op.apply((Object)BigInteger.valueOf(18), 4)).longValue() == iResult);

    assertTrue(tc.unwrapToInt(op.apply((byte)18, NgInt.valueOf(4))) == iResult);
    assertTrue(tc.unwrapToInt(op.apply((char)18, NgInt.valueOf(4))) == iResult);
    assertTrue(tc.unwrapToInt(op.apply((short)18, NgInt.valueOf(4))) == iResult);
    assertTrue(tc.unwrapToInt(op.apply(18, NgInt.valueOf(4))) == iResult);
    assertTrue(tc.unwrapToLong(op.apply((long)18, NgInt.valueOf(4))) == iResult);
    assertTrue(((BigInteger)op.apply(BigInteger.valueOf(18), NgInt.valueOf(4))).longValue() == iResult);

    assertTrue(tc.unwrapToInt(op.apply((byte)18, NgInt.valueOf(4))) == iResult);
    assertTrue(tc.unwrapToInt(op.apply((char)18, NgInt.valueOf(4))) == iResult);
    assertTrue(tc.unwrapToInt(op.apply((short)18, NgInt.valueOf(4))) == iResult);
    assertTrue(tc.unwrapToInt(op.apply(18, NgInt.valueOf(4))) == iResult);
    assertTrue(tc.unwrapToLong(op.apply((long)18, (Object)NgInt.valueOf(4))) == iResult);
    assertTrue(((BigInteger)op.apply(BigInteger.valueOf(18), NgInt.valueOf(4))).longValue() == iResult);

    assertTrue(tc.unwrapToInt(op.apply(NgByte.valueOf((byte)18), NgInt.valueOf(4))) == iResult);
    assertTrue(tc.unwrapToInt(op.apply(NgChar.valueOf((char)18), NgInt.valueOf(4))) == iResult);
    assertTrue(tc.unwrapToInt(op.apply(NgShort.valueOf((short)18), NgInt.valueOf(4))) == iResult);
    assertTrue(tc.unwrapToInt(op.apply(NgInt.valueOf(18), NgInt.valueOf(4))) == iResult);
    assertTrue(tc.unwrapToLong(op.apply(NgLong.valueOf(18), NgInt.valueOf(4))) == iResult);
    assertTrue(((BigInteger)op.apply(BigInteger.valueOf(18), NgInt.valueOf(4))).longValue() == iResult);

    assertTrue(tc.unwrapToInt(op.apply(NgByte.valueOf((byte)18), NgInt.valueOf(4))) == iResult);
    assertTrue(tc.unwrapToInt(op.apply(NgChar.valueOf((char)18), NgInt.valueOf(4))) == iResult);
    assertTrue(tc.unwrapToInt(op.apply(NgShort.valueOf((short)18), NgInt.valueOf(4))) == iResult);
    assertTrue(tc.unwrapToInt(op.apply(NgInt.valueOf(18), NgInt.valueOf(4))) == iResult);
    assertTrue(tc.unwrapToLong(op.apply(NgLong.valueOf(18), NgInt.valueOf(4))) == iResult);
    assertTrue(((BigInteger)op.apply((Object)BigInteger.valueOf(18), (Object)NgInt.valueOf(4))).longValue() == iResult);

    assertTrue(tc.unwrapToInt(op.apply(NgByte.valueOf((byte)18), intMetaClass, NgInt.valueOf(4))) == iResult);
    assertTrue(tc.unwrapToInt(op.apply(NgChar.valueOf((char)18), intMetaClass, NgInt.valueOf(4))) == iResult);
    assertTrue(tc.unwrapToInt(op.apply(NgShort.valueOf((short)18), intMetaClass, NgInt.valueOf(4))) == iResult);
    assertTrue(tc.unwrapToInt(op.apply(NgInt.valueOf(18), intMetaClass, NgInt.valueOf(4))) == iResult);
    assertTrue(tc.unwrapToLong(op.apply(NgLong.valueOf(18), intMetaClass, NgInt.valueOf(4))) == iResult);
    assertTrue(((BigInteger)op.apply((Object)BigInteger.valueOf(18), intMetaClass, (Object)NgInt.valueOf(4))).longValue() == iResult);

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

    assertTrue(tc.unwrapToLong(op.apply(NgByte.valueOf((byte)18), (long)4)) == iResult);
    assertTrue(tc.unwrapToLong(op.apply(NgChar.valueOf((char)18), (long)4)) == iResult);
    assertTrue(tc.unwrapToLong(op.apply(NgShort.valueOf((short)18), (long)4)) == iResult);
    assertTrue(tc.unwrapToLong(op.apply(NgInt.valueOf(18), (long)4)) == iResult);
    assertTrue(tc.unwrapToLong(op.apply(NgLong.valueOf(18), (long)4)) == iResult);

    assertTrue(tc.unwrapToLong(op.apply((Object)NgByte.valueOf((byte)18), (long)4)) == iResult);
    assertTrue(tc.unwrapToLong(op.apply((Object)NgChar.valueOf((char)18), (long)4)) == iResult);
    assertTrue(tc.unwrapToLong(op.apply((Object)NgShort.valueOf((short)18), (long)4)) == iResult);
    assertTrue(tc.unwrapToLong(op.apply((Object)NgInt.valueOf(18), (long)4)) == iResult);
    assertTrue(tc.unwrapToLong(op.apply((Object)NgLong.valueOf(18), (long)4)) == iResult);
    assertTrue(((BigInteger)op.apply((Object)BigInteger.valueOf(18), (long)4)).longValue() == iResult);

    assertTrue(tc.unwrapToLong(op.apply((byte)18, NgLong.valueOf(4))) == iResult);
    assertTrue(tc.unwrapToLong(op.apply((char)18, NgLong.valueOf(4))) == iResult);
    assertTrue(tc.unwrapToLong(op.apply((short)18, NgLong.valueOf(4))) == iResult);
    assertTrue(tc.unwrapToLong(op.apply(18, NgLong.valueOf(4))) == iResult);
    assertTrue(tc.unwrapToLong(op.apply((long)18, NgLong.valueOf(4))) == iResult);
    assertTrue(((BigInteger)op.apply(BigInteger.valueOf(18), NgLong.valueOf(4))).longValue() == iResult);

    assertTrue(tc.unwrapToLong(op.apply((byte)18, NgLong.valueOf(4))) == iResult);
    assertTrue(tc.unwrapToLong(op.apply((char)18, NgLong.valueOf(4))) == iResult);
    assertTrue(tc.unwrapToLong(op.apply((short)18, NgLong.valueOf(4))) == iResult);
    assertTrue(tc.unwrapToLong(op.apply(18, NgLong.valueOf(4))) == iResult);
    assertTrue(tc.unwrapToLong(op.apply((long)18, (Object)NgLong.valueOf(4))) == iResult);
    assertTrue(((BigInteger)op.apply(BigInteger.valueOf(18), NgLong.valueOf(4))).longValue() == iResult);

    assertTrue(tc.unwrapToLong(op.apply(NgByte.valueOf((byte)18), NgLong.valueOf(4))) == iResult);
    assertTrue(tc.unwrapToLong(op.apply(NgChar.valueOf((char)18), NgLong.valueOf(4))) == iResult);
    assertTrue(tc.unwrapToLong(op.apply(NgShort.valueOf((short)18), NgLong.valueOf(4))) == iResult);
    assertTrue(tc.unwrapToLong(op.apply(NgInt.valueOf(18), NgLong.valueOf(4))) == iResult);
    assertTrue(tc.unwrapToLong(op.apply(NgLong.valueOf(18), NgLong.valueOf(4))) == iResult);
    assertTrue(((BigInteger)op.apply(BigInteger.valueOf(18), NgLong.valueOf(4))).longValue() == iResult);

    assertTrue(tc.unwrapToLong(op.apply(NgByte.valueOf((byte)18), NgLong.valueOf(4))) == iResult);
    assertTrue(tc.unwrapToLong(op.apply(NgChar.valueOf((char)18), NgLong.valueOf(4))) == iResult);
    assertTrue(tc.unwrapToLong(op.apply(NgShort.valueOf((short)18), NgLong.valueOf(4))) == iResult);
    assertTrue(tc.unwrapToLong(op.apply(NgInt.valueOf(18), NgLong.valueOf(4))) == iResult);
    assertTrue(tc.unwrapToLong(op.apply(NgLong.valueOf(18), NgLong.valueOf(4))) == iResult);
    assertTrue(((BigInteger)op.apply((Object)BigInteger.valueOf(18), (Object)NgLong.valueOf(4))).longValue() == iResult);

    assertTrue(tc.unwrapToLong(op.apply(NgByte.valueOf((byte)18), longMetaClass, NgLong.valueOf(4))) == iResult);
    assertTrue(tc.unwrapToLong(op.apply(NgChar.valueOf((char)18), longMetaClass, NgLong.valueOf(4))) == iResult);
    assertTrue(tc.unwrapToLong(op.apply(NgShort.valueOf((short)18), longMetaClass, NgLong.valueOf(4))) == iResult);
    assertTrue(tc.unwrapToLong(op.apply(NgInt.valueOf(18), longMetaClass, NgLong.valueOf(4))) == iResult);
    assertTrue(tc.unwrapToLong(op.apply(NgLong.valueOf(18), longMetaClass, NgLong.valueOf(4))) == iResult);
    assertTrue(((BigInteger)op.apply((Object)BigInteger.valueOf(18), longMetaClass, (Object)NgLong.valueOf(4))).longValue() == iResult);

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

    assertTrue(((BigInteger)op.apply(NgByte.valueOf((byte)18), BigInteger.valueOf(4))).longValue() == iResult);
    assertTrue(((BigInteger)op.apply(NgChar.valueOf((char)18), BigInteger.valueOf(4))).longValue() == iResult);
    assertTrue(((BigInteger)op.apply(NgShort.valueOf((short)18), BigInteger.valueOf(4))).longValue() == iResult);
    assertTrue(((BigInteger)op.apply(NgInt.valueOf(18), BigInteger.valueOf(4))).longValue() == iResult);
    assertTrue(((BigInteger)op.apply(NgLong.valueOf(18), BigInteger.valueOf(4))).longValue() == iResult);

    assertTrue(((BigInteger)op.apply(NgByte.valueOf((byte)18), BigInteger.valueOf(4))).longValue() == iResult);
    assertTrue(((BigInteger)op.apply(NgChar.valueOf((char)18), BigInteger.valueOf(4))).longValue() == iResult);
    assertTrue(((BigInteger)op.apply(NgShort.valueOf((short)18), BigInteger.valueOf(4))).longValue() == iResult);
    assertTrue(((BigInteger)op.apply(NgInt.valueOf(18), BigInteger.valueOf(4))).longValue() == iResult);
    assertTrue(((BigInteger)op.apply(NgLong.valueOf(18), BigInteger.valueOf(4))).longValue() == iResult);
    assertTrue(((BigInteger)op.apply((Object)BigInteger.valueOf(18), BigInteger.valueOf(4))).longValue() == iResult);

    assertTrue(((BigInteger)op.apply((Object)NgByte.valueOf((byte)18), (Object)BigInteger.valueOf(4))).longValue() == iResult);
    assertTrue(((BigInteger)op.apply((Object)NgChar.valueOf((char)18), (Object)BigInteger.valueOf(4))).longValue() == iResult);
    assertTrue(((BigInteger)op.apply((Object)NgShort.valueOf((short)18), (Object)BigInteger.valueOf(4))).longValue() == iResult);
    assertTrue(((BigInteger)op.apply((Object)NgInt.valueOf(18), (Object)BigInteger.valueOf(4))).longValue() == iResult);
    assertTrue(((BigInteger)op.apply((Object)NgLong.valueOf(18), (Object)BigInteger.valueOf(4))).longValue() == iResult);
    assertTrue(((BigInteger)op.apply((Object)BigInteger.valueOf(18), (Object)BigInteger.valueOf(4))).longValue() == iResult);

    assertTrue(((BigInteger)op.apply(NgByte.valueOf((byte)18), bigIntegerMetaClass, BigInteger.valueOf(4))).longValue() == iResult);
    assertTrue(((BigInteger)op.apply(NgChar.valueOf((char)18), bigIntegerMetaClass, BigInteger.valueOf(4))).longValue() == iResult);
    assertTrue(((BigInteger)op.apply(NgShort.valueOf((short)18), bigIntegerMetaClass, BigInteger.valueOf(4))).longValue() == iResult);
    assertTrue(((BigInteger)op.apply(NgInt.valueOf(18), bigIntegerMetaClass, BigInteger.valueOf(4))).longValue() == iResult);
    assertTrue(((BigInteger)op.apply((Object)NgLong.valueOf((long)18), bigIntegerMetaClass, (Object)BigInteger.valueOf(4))).longValue() == iResult);
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