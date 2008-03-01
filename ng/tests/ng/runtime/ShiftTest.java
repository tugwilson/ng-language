package ng.runtime;

import java.math.BigDecimal;
import java.math.BigInteger;

import junit.framework.TestCase;
import ng.lang.NgRuntimeException;
import ng.runtime.metaclass.MetaClass;
import ng.runtime.threadcontext.BinaryShiftOperation;
import ng.runtime.threadcontext.ExtendedThreadContext;
import ng.runtime.threadcontext.NotPerformed;
import ng.runtime.threadcontext.ThreadContext;

/**
 * @author John
 *
 */
public class ShiftTest extends TestCase {
  private static void doTest(final ExtendedThreadContext tc, final BinaryShiftOperation op, final int iResult) {
    final MetaClass byteMetaClass = tc.getMetaClassFor(byte.class);
    final MetaClass charMetaClass = tc.getMetaClassFor(char.class);
    final MetaClass shortMetaClass = tc.getMetaClassFor(short.class);
    final MetaClass intMetaClass = tc.getMetaClassFor(int.class);
    final MetaClass longMetaClass = tc.getMetaClassFor(long.class);
    final MetaClass floatMetaClass = tc.getMetaClassFor(float.class);
    final MetaClass doubleMetaClass = tc.getMetaClassFor(double.class);
    final MetaClass bigIntegerMetaClass = tc.getMetaClassFor(BigInteger.class);
    final MetaClass bigDecimalMetaClass = tc.getMetaClassFor(BigDecimal.class);

    try {
      assertTrue(op.intApply((byte)18, (byte)4) == iResult);
    } catch (NotPerformed e) {
      assertTrue(false);
    }
    try {
      assertTrue(op.intApply((char)18, (byte)4) == iResult);
    } catch (NotPerformed e) {
      assertTrue(false);
    }
    try {
      assertTrue(op.intApply((short)18, (byte)4) == iResult);
    } catch (NotPerformed e) {
      assertTrue(false);
    }
    try {
      assertTrue(op.intApply(18, (byte)4) == iResult);
    } catch (NotPerformed e) {
      assertTrue(false);
    }
    try {
      assertTrue(op.longApply((long)18, (byte)4) == iResult);
    } catch (NotPerformed e) {
      assertTrue(false);
    }
    try {
      assertTrue(op.bigIntegerApply(BigInteger.valueOf(18), (byte)4).longValue() == iResult);
    } catch (NotPerformed e) {
      assertTrue(false);
    }

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

    try {
      assertTrue(op.intApply((byte)18, (char)4) == iResult);
    } catch (NotPerformed e) {
      assertTrue(false);
    }
    try {
      assertTrue(op.intApply((char)18, (char)4) == iResult);
    } catch (NotPerformed e) {
      assertTrue(false);
    }
    try {
      assertTrue(op.intApply((short)18, (char)4) == iResult);
    } catch (NotPerformed e3) {
      assertTrue(false);
    }
    try {
      assertTrue(op.intApply(18, (char)4) == iResult);
    } catch (NotPerformed e2) {
      assertTrue(false);
    }
    try {
      assertTrue(op.longApply((long)18, (char)4) == iResult);
    } catch (NotPerformed e1) {
      assertTrue(false);
    }
    try {
      assertTrue(op.bigIntegerApply(BigInteger.valueOf(18), (char)4).longValue() == iResult);
    } catch (NotPerformed e) {
      assertTrue(false);
    }

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

    assertTrue(tc.unwrapToInt(op.apply(tc.wrap((byte)18), tc.wrap((char)4))) == iResult);
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

    try {
      assertTrue(op.intApply((byte)18, (short)4) == iResult);
    } catch (NotPerformed e) {
    }
    try {
      assertTrue(op.intApply((char)18, (short)4) == iResult);
    } catch (NotPerformed e) {
    }
    try {
      assertTrue(op.intApply((short)18, (short)4) == iResult);
    } catch (NotPerformed e) {
    }
    try {
      assertTrue(op.intApply(18, (short)4) == iResult);
    } catch (NotPerformed e) {
    }
    try {
      assertTrue(op.longApply((long)18, (short)4) == iResult);
    } catch (NotPerformed e) {
    }
    try {
      assertTrue(op.bigIntegerApply(BigInteger.valueOf(18), (short)4).longValue() == iResult);
    } catch (NotPerformed e) {
    }

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

    try {
      assertTrue(op.intApply((byte)18, 4) == iResult);
    } catch (NotPerformed e) {
      assertTrue(false);
    }
    try {
      assertTrue(op.intApply((char)18, 4) == iResult);
    } catch (NotPerformed e) {
      assertTrue(false);
    }
    try {
      assertTrue(op.intApply((short)18, 4) == iResult);
    } catch (NotPerformed e) {
      assertTrue(false);
    }
    try {
      assertTrue(op.intApply(18, 4) == iResult);
    } catch (NotPerformed e) {
      assertTrue(false);
    }
    try {
      assertTrue(op.longApply((long)18, 4) == iResult);
    } catch (NotPerformed e) {
      assertTrue(false);
    }
    try {
      assertTrue(op.bigIntegerApply(BigInteger.valueOf(18), 4).longValue() == iResult);
    } catch (NotPerformed e) {
      assertTrue(false);
    }

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

    try {
      assertTrue(op.longApply((byte)18, (long)4) == iResult);
    } catch (NotPerformed e1) {
      assertTrue(false);
    }
    try {
      assertTrue(op.longApply((char)18, (long)4) == iResult);
    } catch (NotPerformed e) {
      assertTrue(false);
    }
    try {
      assertTrue(op.longApply((short)18, (long)4) == iResult);
    } catch (NotPerformed e1) {
      assertTrue(false);
    }
    try {
      assertTrue(op.longApply(18, (long)4) == iResult);
    } catch (NotPerformed e) {
      assertTrue(false);
    }
    try {
      assertTrue(op.longApply((long)18, (long)4) == iResult);
    } catch (NotPerformed e) {
      assertTrue(false);
    }
    try {
      assertTrue(op.bigIntegerApply(BigInteger.valueOf(18), (long)4).longValue() == iResult);
    } catch (NotPerformed e) {
      assertTrue(true);  // shifting a BigInteger by a long is not supported
    }

    assertTrue(tc.unwrapToInt(op.apply((byte)18, (long)4)) == iResult);
    assertTrue(tc.unwrapToInt(op.apply((char)18, (long)4)) == iResult);
    assertTrue(tc.unwrapToInt(op.apply((short)18, (long)4)) == iResult);
    assertTrue(tc.unwrapToInt(op.apply(18, (long)4)) == iResult);
    assertTrue(tc.unwrapToLong(op.apply((long)18, (long)4)) == iResult);
    try {
      assertTrue(((BigInteger)op.apply(BigInteger.valueOf(18), (long)4)).longValue() == iResult);
      assert(false);
    } catch (NgRuntimeException e) {
      assert(true); // you can't shift a Biginteger by a Long
    }

    assertTrue(tc.unwrapToInt(op.apply(tc.wrap((byte)18), (long)4)) == iResult);
    assertTrue(tc.unwrapToInt(op.apply(tc.wrap((char)18), (long)4)) == iResult);
    assertTrue(tc.unwrapToInt(op.apply(tc.wrap((short)18), (long)4)) == iResult);
    assertTrue(tc.unwrapToInt(op.apply(tc.wrap((int)18), (long)4)) == iResult);
    assertTrue(tc.unwrapToLong(op.apply(tc.wrap((long)18), (long)4)) == iResult);

    assertTrue(tc.unwrapToInt(op.apply((Object)tc.wrap((byte)18), (long)4)) == iResult);
    assertTrue(tc.unwrapToInt(op.apply((Object)tc.wrap((char)18), (long)4)) == iResult);
    assertTrue(tc.unwrapToInt(op.apply((Object)tc.wrap((short)18), (long)4)) == iResult);
    assertTrue(tc.unwrapToInt(op.apply((Object)tc.wrap((int)18), (long)4)) == iResult);
    assertTrue(tc.unwrapToLong(op.apply((Object)tc.wrap((long)18), (long)4)) == iResult);
    try {
      assertTrue(((BigInteger)op.apply((Object)BigInteger.valueOf(18), (long)4)).longValue() == iResult);
      assert(false);
    } catch (NgRuntimeException e) {
      assert(true); // you can't shift a Biginteger by a Long
    }

    assertTrue(tc.unwrapToInt(op.apply((byte)18, tc.wrap((long)4))) == iResult);
    assertTrue(tc.unwrapToInt(op.apply((char)18, tc.wrap((long)4))) == iResult);
    assertTrue(tc.unwrapToInt(op.apply((short)18, tc.wrap((long)4))) == iResult);
    assertTrue(tc.unwrapToInt(op.apply(18, tc.wrap((long)4))) == iResult);
    assertTrue(tc.unwrapToLong(op.apply((long)18, tc.wrap((long)4))) == iResult);
    try {
      assertTrue(((BigInteger)op.apply(BigInteger.valueOf(18), tc.wrap((long)4))).longValue() == iResult);
      assert(false);
    } catch (NgRuntimeException e) {
      assert(true); // you can't shift a Biginteger by a Long
    }

    assertTrue(tc.unwrapToInt(op.apply((byte)18, tc.wrap((long)4))) == iResult);
    assertTrue(tc.unwrapToInt(op.apply((char)18, tc.wrap((long)4))) == iResult);
    assertTrue(tc.unwrapToInt(op.apply((short)18, tc.wrap((long)4))) == iResult);
    assertTrue(tc.unwrapToInt(op.apply(18, tc.wrap((long)4))) == iResult);
    assertTrue(tc.unwrapToLong(op.apply((long)18, (Object)tc.wrap((long)4))) == iResult);
    try {
      assertTrue(((BigInteger)op.apply(BigInteger.valueOf(18), tc.wrap((long)4))).longValue() == iResult);
      assert(false);
    } catch (NgRuntimeException e) {
      assert(true); // you can't shift a Biginteger by a Long
    }

    assertTrue(tc.unwrapToInt(op.apply(tc.wrap((byte)18), tc.wrap((long)4))) == iResult);
    assertTrue(tc.unwrapToInt(op.apply(tc.wrap((char)18), tc.wrap((long)4))) == iResult);
    assertTrue(tc.unwrapToInt(op.apply(tc.wrap((short)18), tc.wrap((long)4))) == iResult);
    assertTrue(tc.unwrapToInt(op.apply(tc.wrap((int)18), tc.wrap((long)4))) == iResult);
    assertTrue(tc.unwrapToLong(op.apply(tc.wrap((long)18), tc.wrap((long)4))) == iResult);
    try {
      assertTrue(((BigInteger)op.apply(BigInteger.valueOf(18), tc.wrap((long)4))).longValue() == iResult);
      assert(false);
    } catch (NgRuntimeException e) {
      assert(true); // you can't shift a Biginteger by a Long
    }

    assertTrue(tc.unwrapToInt(op.apply(tc.wrap((byte)18), tc.wrap((long)4))) == iResult);
    assertTrue(tc.unwrapToInt(op.apply(tc.wrap((char)18), tc.wrap((long)4))) == iResult);
    assertTrue(tc.unwrapToInt(op.apply(tc.wrap((short)18), tc.wrap((long)4))) == iResult);
    assertTrue(tc.unwrapToInt(op.apply(tc.wrap((int)18), tc.wrap((long)4))) == iResult);
    assertTrue(tc.unwrapToLong(op.apply(tc.wrap((long)18), tc.wrap((long)4))) == iResult);
    try {
      assertTrue(((BigInteger)op.apply((Object)BigInteger.valueOf(18), (Object)tc.wrap((long)4))).longValue() == iResult);
      assert(false);
    } catch (NgRuntimeException e) {
      assert(true); // you can't shift a Biginteger by a Long
    }

    assertTrue(tc.unwrapToInt(op.apply(tc.wrap((byte)18), longMetaClass, tc.wrap((long)4))) == iResult);
    assertTrue(tc.unwrapToInt(op.apply(tc.wrap((char)18), longMetaClass, tc.wrap((long)4))) == iResult);
    assertTrue(tc.unwrapToInt(op.apply(tc.wrap((short)18), longMetaClass, tc.wrap((long)4))) == iResult);
    assertTrue(tc.unwrapToInt(op.apply(tc.wrap((int)18), longMetaClass, tc.wrap((long)4))) == iResult);
    assertTrue(tc.unwrapToLong(op.apply(tc.wrap((long)18), longMetaClass, tc.wrap((long)4))) == iResult);
    try {
      assertTrue(((BigInteger)op.apply((Object)BigInteger.valueOf(18), longMetaClass, (Object)tc.wrap((long)4))).longValue() == iResult);
      assert(false);
    } catch (NgRuntimeException e) {
      assert(true); // you can't shift a Biginteger by a Long
    }

    try {
      assertTrue(op.bigIntegerApply(BigInteger.valueOf(18), BigInteger.valueOf(4)).longValue() == iResult);
      assert(false);
    } catch (NotPerformed e) {
      assert(true);
    }

    assertTrue((tc.unwrapToInt(op.apply((byte)18, BigInteger.valueOf(4)))) == iResult);
    assertTrue((tc.unwrapToInt(op.apply((char)18, BigInteger.valueOf(4)))) == iResult);
    assertTrue((tc.unwrapToInt(op.apply((short)18, BigInteger.valueOf(4)))) == iResult);
    assertTrue((tc.unwrapToInt(op.apply(18, BigInteger.valueOf(4)))) == iResult);
    assertTrue((tc.unwrapToLong(op.apply((long)18, BigInteger.valueOf(4)))) == iResult);
    try {
      assertTrue(((BigInteger)op.apply(BigInteger.valueOf(18), BigInteger.valueOf(4))).longValue() == iResult);
      assert(false);
    } catch (NgRuntimeException e) {
      assert(true); // you can't shift a BigInteger by a BigInteger
    }

    assertTrue((tc.unwrapToInt(op.apply(tc.wrap((byte)18), BigInteger.valueOf(4)))) == iResult);
    assertTrue((tc.unwrapToInt(op.apply(tc.wrap((char)18), BigInteger.valueOf(4)))) == iResult);
    assertTrue((tc.unwrapToInt(op.apply(tc.wrap((short)18), BigInteger.valueOf(4)))) == iResult);
    assertTrue((tc.unwrapToInt(op.apply(tc.wrap((int)18), BigInteger.valueOf(4)))) == iResult);
    assertTrue((tc.unwrapToLong(op.apply(tc.wrap((long)18), BigInteger.valueOf(4)))) == iResult);

    assertTrue((tc.unwrapToInt(op.apply(tc.wrap((byte)18), BigInteger.valueOf(4)))) == iResult);
    assertTrue((tc.unwrapToInt(op.apply(tc.wrap((char)18), BigInteger.valueOf(4)))) == iResult);
    assertTrue((tc.unwrapToInt(op.apply(tc.wrap((short)18), BigInteger.valueOf(4)))) == iResult);
    assertTrue((tc.unwrapToInt(op.apply(tc.wrap((int)18), BigInteger.valueOf(4)))) == iResult);
    assertTrue((tc.unwrapToLong(op.apply(tc.wrap((long)18), BigInteger.valueOf(4)))) == iResult);
    try {
      assertTrue(((BigInteger)op.apply((Object)BigInteger.valueOf(18), BigInteger.valueOf(4))).longValue() == iResult);
      assert(false);
    } catch (NgRuntimeException e) {
      assert(true); // you can't shift a BigInteger by a BigInteger
    }

    assertTrue((tc.unwrapToInt(op.apply((Object)tc.wrap((byte)18), (Object)BigInteger.valueOf(4)))) == iResult);
    assertTrue((tc.unwrapToInt(op.apply((Object)tc.wrap((char)18), (Object)BigInteger.valueOf(4)))) == iResult);
    assertTrue((tc.unwrapToInt(op.apply((Object)tc.wrap((short)18), (Object)BigInteger.valueOf(4)))) == iResult);
    assertTrue((tc.unwrapToInt(op.apply((Object)tc.wrap((int)18), (Object)BigInteger.valueOf(4)))) == iResult);
    assertTrue((tc.unwrapToLong(op.apply((Object)tc.wrap((long)18), (Object)BigInteger.valueOf(4)))) == iResult);
    try {
      assertTrue(((BigInteger)op.apply((Object)BigInteger.valueOf(18), (Object)BigInteger.valueOf(4))).longValue() == iResult);
      assert(false);
    } catch (NgRuntimeException e) {
      assert(true); // you can't shift a BigInteger by a BigInteger
    }

    assertTrue((tc.unwrapToInt(op.apply(tc.wrap((byte)18), bigIntegerMetaClass, BigInteger.valueOf(4)))) == iResult);
    assertTrue((tc.unwrapToInt(op.apply(tc.wrap((char)18), bigIntegerMetaClass, BigInteger.valueOf(4)))) == iResult);
    assertTrue((tc.unwrapToInt(op.apply(tc.wrap((short)18), bigIntegerMetaClass, BigInteger.valueOf(4)))) == iResult);
    assertTrue((tc.unwrapToInt(op.apply(tc.wrap((int)18), bigIntegerMetaClass, BigInteger.valueOf(4)))) == iResult);
    assertTrue((tc.unwrapToLong(op.apply((Object)tc.wrap((long)18), bigIntegerMetaClass, (Object)BigInteger.valueOf(4)))) == iResult);
    try {
      assertTrue(((BigInteger)op.apply((Object)BigInteger.valueOf(18), bigIntegerMetaClass, (Object)BigInteger.valueOf(4))).longValue() == iResult);
      assert(false);
    } catch (NgRuntimeException e) {
      assert(true); // you can't shift a BigInteger by a BigInteger
    }
  }
  private static void doTestUnsignedShift(final ExtendedThreadContext tc, final BinaryShiftOperation op, final int iResult) {
    final MetaClass byteMetaClass = tc.getMetaClassFor(byte.class);
    final MetaClass charMetaClass = tc.getMetaClassFor(char.class);
    final MetaClass shortMetaClass = tc.getMetaClassFor(short.class);
    final MetaClass intMetaClass = tc.getMetaClassFor(int.class);
    final MetaClass longMetaClass = tc.getMetaClassFor(long.class);
    final MetaClass floatMetaClass = tc.getMetaClassFor(float.class);
    final MetaClass doubleMetaClass = tc.getMetaClassFor(double.class);
    final MetaClass bigIntegerMetaClass = tc.getMetaClassFor(BigInteger.class);
    final MetaClass bigDecimalMetaClass = tc.getMetaClassFor(BigDecimal.class);

    try {
      assertTrue(op.intApply((byte)18, (byte)4) == iResult);
    } catch (NotPerformed e) {
      assertTrue(false);
    }
    try {
      assertTrue(op.intApply((char)18, (byte)4) == iResult);
    } catch (NotPerformed e) {
      assertTrue(false);
    }
    try {
      assertTrue(op.intApply((short)18, (byte)4) == iResult);
    } catch (NotPerformed e) {
      assertTrue(false);
    }
    try {
      assertTrue(op.intApply(18, (byte)4) == iResult);
    } catch (NotPerformed e) {
      assertTrue(false);
    }
    try {
      assertTrue(op.longApply((long)18, (byte)4) == iResult);
    } catch (NotPerformed e) {
      assertTrue(false);
    }

    assertTrue(tc.unwrapToInt(op.apply((byte)18, (byte)4)) == iResult);
    assertTrue(tc.unwrapToInt(op.apply((char)18, (byte)4)) == iResult);
    assertTrue(tc.unwrapToInt(op.apply((short)18, (byte)4)) == iResult);
    assertTrue(tc.unwrapToInt(op.apply(18, (byte)4)) == iResult);
    assertTrue(tc.unwrapToLong(op.apply((long)18, (byte)4)) == iResult);

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

    assertTrue(tc.unwrapToInt(op.apply((byte)18, tc.wrap((byte)4))) == iResult);
    assertTrue(tc.unwrapToInt(op.apply((char)18, tc.wrap((byte)4))) == iResult);
    assertTrue(tc.unwrapToInt(op.apply((short)18, tc.wrap((byte)4))) == iResult);
    assertTrue(tc.unwrapToInt(op.apply(18, tc.wrap((byte)4))) == iResult);
    assertTrue(tc.unwrapToLong(op.apply((long)18, tc.wrap((byte)4))) == iResult);

    assertTrue(tc.unwrapToInt(op.apply((byte)18, tc.wrap((byte)4))) == iResult);
    assertTrue(tc.unwrapToInt(op.apply((char)18, tc.wrap((byte)4))) == iResult);
    assertTrue(tc.unwrapToInt(op.apply((short)18, tc.wrap((byte)4))) == iResult);
    assertTrue(tc.unwrapToInt(op.apply(18, tc.wrap((byte)4))) == iResult);
    assertTrue(tc.unwrapToLong(op.apply((long)18, (Object)tc.wrap((byte)4))) == iResult);

    assertTrue(tc.unwrapToInt(op.apply(tc.wrap((byte)18), tc.wrap((byte)4))) == iResult);
    assertTrue(tc.unwrapToInt(op.apply(tc.wrap((char)18), tc.wrap((byte)4))) == iResult);
    assertTrue(tc.unwrapToInt(op.apply(tc.wrap((short)18), tc.wrap((byte)4))) == iResult);
    assertTrue(tc.unwrapToInt(op.apply(tc.wrap((int)18), tc.wrap((byte)4))) == iResult);
    assertTrue(tc.unwrapToLong(op.apply(tc.wrap((long)18), tc.wrap((byte)4))) == iResult);

    assertTrue(tc.unwrapToInt(op.apply(tc.wrap((byte)18), tc.wrap((byte)4))) == iResult);
    assertTrue(tc.unwrapToInt(op.apply(tc.wrap((char)18), tc.wrap((byte)4))) == iResult);
    assertTrue(tc.unwrapToInt(op.apply(tc.wrap((short)18), tc.wrap((byte)4))) == iResult);
    assertTrue(tc.unwrapToInt(op.apply(tc.wrap((int)18), tc.wrap((byte)4))) == iResult);
    assertTrue(tc.unwrapToLong(op.apply(tc.wrap((long)18), tc.wrap((byte)4))) == iResult);

    assertTrue(tc.unwrapToInt(op.apply(tc.wrap((byte)18), byteMetaClass, tc.wrap((byte)4))) == iResult);
    assertTrue(tc.unwrapToInt(op.apply(tc.wrap((char)18), byteMetaClass, tc.wrap((byte)4))) == iResult);
    assertTrue(tc.unwrapToInt(op.apply(tc.wrap((short)18), byteMetaClass, tc.wrap((byte)4))) == iResult);
    assertTrue(tc.unwrapToInt(op.apply(tc.wrap((int)18), byteMetaClass, tc.wrap((byte)4))) == iResult);
    assertTrue(tc.unwrapToLong(op.apply(tc.wrap((long)18), byteMetaClass, tc.wrap((byte)4))) == iResult);

    try {
      assertTrue(op.intApply((byte)18, (char)4) == iResult);
    } catch (NotPerformed e) {
      assertTrue(false);
    }
    try {
      assertTrue(op.intApply((char)18, (char)4) == iResult);
    } catch (NotPerformed e) {
      assertTrue(false);
    }
    try {
      assertTrue(op.intApply((short)18, (char)4) == iResult);
    } catch (NotPerformed e3) {
      assertTrue(false);
    }
    try {
      assertTrue(op.intApply(18, (char)4) == iResult);
    } catch (NotPerformed e2) {
      assertTrue(false);
    }
    try {
      assertTrue(op.longApply((long)18, (char)4) == iResult);
    } catch (NotPerformed e1) {
      assertTrue(false);
    }

    assertTrue(tc.unwrapToInt(op.apply((byte)18, (char)4)) == iResult);
    assertTrue(tc.unwrapToInt(op.apply((char)18, (char)4)) == iResult);
    assertTrue(tc.unwrapToInt(op.apply((short)18, (char)4)) == iResult);
    assertTrue(tc.unwrapToInt(op.apply(18, (char)4)) == iResult);
    assertTrue(tc.unwrapToLong(op.apply((long)18, (char)4)) == iResult);

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

    assertTrue(tc.unwrapToInt(op.apply((byte)18, tc.wrap((char)4))) == iResult);
    assertTrue(tc.unwrapToInt(op.apply((char)18, tc.wrap((char)4))) == iResult);
    assertTrue(tc.unwrapToInt(op.apply((short)18, tc.wrap((char)4))) == iResult);
    assertTrue(tc.unwrapToInt(op.apply(18, tc.wrap((char)4))) == iResult);
    assertTrue(tc.unwrapToLong(op.apply((long)18, tc.wrap((char)4))) == iResult);

    assertTrue(tc.unwrapToInt(op.apply((byte)18, tc.wrap((char)4))) == iResult);
    assertTrue(tc.unwrapToInt(op.apply((char)18, tc.wrap((char)4))) == iResult);
    assertTrue(tc.unwrapToInt(op.apply((short)18, tc.wrap((char)4))) == iResult);
    assertTrue(tc.unwrapToInt(op.apply(18, tc.wrap((char)4))) == iResult);
    assertTrue(tc.unwrapToLong(op.apply((long)18, (Object)tc.wrap((char)4))) == iResult);

    assertTrue(tc.unwrapToInt(op.apply(tc.wrap((byte)18), tc.wrap((char)4))) == iResult);
    assertTrue(tc.unwrapToInt(op.apply(tc.wrap((char)18), tc.wrap((char)4))) == iResult);
    assertTrue(tc.unwrapToInt(op.apply(tc.wrap((short)18), tc.wrap((char)4))) == iResult);
    assertTrue(tc.unwrapToInt(op.apply(tc.wrap((int)18), tc.wrap((char)4))) == iResult);
    assertTrue(tc.unwrapToLong(op.apply(tc.wrap((long)18), tc.wrap((char)4))) == iResult);

    assertTrue(tc.unwrapToInt(op.apply(tc.wrap((byte)18), tc.wrap((char)4))) == iResult);
    assertTrue(tc.unwrapToInt(op.apply(tc.wrap((char)18), tc.wrap((char)4))) == iResult);
    assertTrue(tc.unwrapToInt(op.apply(tc.wrap((short)18), tc.wrap((char)4))) == iResult);
    assertTrue(tc.unwrapToInt(op.apply(tc.wrap((int)18), tc.wrap((char)4))) == iResult);
    assertTrue(tc.unwrapToLong(op.apply(tc.wrap((long)18), tc.wrap((char)4))) == iResult);

    assertTrue(tc.unwrapToInt(op.apply(tc.wrap((byte)18), charMetaClass, tc.wrap((char)4))) == iResult);
    assertTrue(tc.unwrapToInt(op.apply(tc.wrap((char)18), charMetaClass, tc.wrap((char)4))) == iResult);
    assertTrue(tc.unwrapToInt(op.apply(tc.wrap((short)18), charMetaClass, tc.wrap((char)4))) == iResult);
    assertTrue(tc.unwrapToInt(op.apply(tc.wrap((int)18), charMetaClass, tc.wrap((char)4))) == iResult);
    assertTrue(tc.unwrapToLong(op.apply(tc.wrap((long)18), charMetaClass, tc.wrap((char)4))) == iResult);

    assertTrue(tc.unwrapToInt(op.apply(tc.wrap((byte)18), charMetaClass,tc.wrap((char)4))) == iResult);
    assertTrue(tc.unwrapToInt(op.apply(tc.wrap((char)18), charMetaClass,tc.wrap((char)4))) == iResult);
    assertTrue(tc.unwrapToInt(op.apply(tc.wrap((short)18), charMetaClass,tc.wrap((char)4))) == iResult);
    assertTrue(tc.unwrapToInt(op.apply(tc.wrap((int)18), charMetaClass,tc.wrap((char)4))) == iResult);
    assertTrue(tc.unwrapToLong(op.apply(tc.wrap((long)18), charMetaClass,tc.wrap((char)4))) == iResult);

    try {
      assertTrue(op.intApply((byte)18, (short)4) == iResult);
    } catch (NotPerformed e) {
    }
    try {
      assertTrue(op.intApply((char)18, (short)4) == iResult);
    } catch (NotPerformed e) {
    }
    try {
      assertTrue(op.intApply((short)18, (short)4) == iResult);
    } catch (NotPerformed e) {
    }
    try {
      assertTrue(op.intApply(18, (short)4) == iResult);
    } catch (NotPerformed e) {
    }
    try {
      assertTrue(op.longApply((long)18, (short)4) == iResult);
    } catch (NotPerformed e) {
    }
    try {
      assertTrue(op.bigIntegerApply(BigInteger.valueOf(18), (short)4).longValue() == iResult);
    } catch (NotPerformed e) {
    }

    assertTrue(tc.unwrapToInt(op.apply((byte)18, (short)4)) == iResult);
    assertTrue(tc.unwrapToInt(op.apply((char)18, (short)4)) == iResult);
    assertTrue(tc.unwrapToInt(op.apply((short)18, (short)4)) == iResult);
    assertTrue(tc.unwrapToInt(op.apply(18, (short)4)) == iResult);
    assertTrue(tc.unwrapToLong(op.apply((long)18, (short)4)) == iResult);

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

    assertTrue(tc.unwrapToInt(op.apply((byte)18, tc.wrap((short)4))) == iResult);
    assertTrue(tc.unwrapToInt(op.apply((char)18, tc.wrap((short)4))) == iResult);
    assertTrue(tc.unwrapToInt(op.apply((short)18, tc.wrap((short)4))) == iResult);
    assertTrue(tc.unwrapToInt(op.apply(18, tc.wrap((short)4))) == iResult);
    assertTrue(tc.unwrapToLong(op.apply((long)18, tc.wrap((short)4))) == iResult);

    assertTrue(tc.unwrapToInt(op.apply((byte)18, tc.wrap((short)4))) == iResult);
    assertTrue(tc.unwrapToInt(op.apply((char)18, tc.wrap((short)4))) == iResult);
    assertTrue(tc.unwrapToInt(op.apply((short)18, tc.wrap((short)4))) == iResult);
    assertTrue(tc.unwrapToInt(op.apply(18, tc.wrap((short)4))) == iResult);
    assertTrue(tc.unwrapToLong(op.apply((long)18, (Object)tc.wrap((short)4))) == iResult);

    assertTrue(tc.unwrapToInt(op.apply(tc.wrap((byte)18), tc.wrap((short)4))) == iResult);
    assertTrue(tc.unwrapToInt(op.apply(tc.wrap((char)18), tc.wrap((short)4))) == iResult);
    assertTrue(tc.unwrapToInt(op.apply(tc.wrap((short)18), tc.wrap((short)4))) == iResult);
    assertTrue(tc.unwrapToInt(op.apply(tc.wrap((int)18), tc.wrap((short)4))) == iResult);
    assertTrue(tc.unwrapToLong(op.apply(tc.wrap((long)18), tc.wrap((short)4))) == iResult);

    assertTrue(tc.unwrapToInt(op.apply(tc.wrap((byte)18), tc.wrap((short)4))) == iResult);
    assertTrue(tc.unwrapToInt(op.apply(tc.wrap((char)18), tc.wrap((short)4))) == iResult);
    assertTrue(tc.unwrapToInt(op.apply(tc.wrap((short)18), tc.wrap((short)4))) == iResult);
    assertTrue(tc.unwrapToInt(op.apply(tc.wrap((int)18), tc.wrap((short)4))) == iResult);
    assertTrue(tc.unwrapToLong(op.apply(tc.wrap((long)18), tc.wrap((short)4))) == iResult);

    assertTrue(tc.unwrapToInt(op.apply(tc.wrap((byte)18), shortMetaClass, tc.wrap((short)4))) == iResult);
    assertTrue(tc.unwrapToInt(op.apply(tc.wrap((char)18), shortMetaClass, tc.wrap((short)4))) == iResult);
    assertTrue(tc.unwrapToInt(op.apply(tc.wrap((short)18), shortMetaClass, tc.wrap((short)4))) == iResult);
    assertTrue(tc.unwrapToInt(op.apply(tc.wrap((int)18), shortMetaClass, tc.wrap((short)4))) == iResult);
    assertTrue(tc.unwrapToLong(op.apply(tc.wrap((long)18), shortMetaClass, tc.wrap((short)4))) == iResult);

    try {
      assertTrue(op.intApply((byte)18, 4) == iResult);
    } catch (NotPerformed e) {
      assertTrue(false);
    }
    try {
      assertTrue(op.intApply((char)18, 4) == iResult);
    } catch (NotPerformed e) {
      assertTrue(false);
    }
    try {
      assertTrue(op.intApply((short)18, 4) == iResult);
    } catch (NotPerformed e) {
      assertTrue(false);
    }
    try {
      assertTrue(op.intApply(18, 4) == iResult);
    } catch (NotPerformed e) {
      assertTrue(false);
    }
    try {
      assertTrue(op.longApply((long)18, 4) == iResult);
    } catch (NotPerformed e) {
      assertTrue(false);
    }

    assertTrue(tc.unwrapToInt(op.apply((byte)18, 4)) == iResult);
    assertTrue(tc.unwrapToInt(op.apply((char)18, 4)) == iResult);
    assertTrue(tc.unwrapToInt(op.apply((short)18, 4)) == iResult);
    assertTrue(tc.unwrapToInt(op.apply(18, 4)) == iResult);
    assertTrue(tc.unwrapToLong(op.apply((long)18, 4)) == iResult);

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

    assertTrue(tc.unwrapToInt(op.apply((byte)18, tc.wrap((int)4))) == iResult);
    assertTrue(tc.unwrapToInt(op.apply((char)18, tc.wrap((int)4))) == iResult);
    assertTrue(tc.unwrapToInt(op.apply((short)18, tc.wrap((int)4))) == iResult);
    assertTrue(tc.unwrapToInt(op.apply(18, tc.wrap((int)4))) == iResult);
    assertTrue(tc.unwrapToLong(op.apply((long)18, tc.wrap((int)4))) == iResult);

    assertTrue(tc.unwrapToInt(op.apply((byte)18, tc.wrap((int)4))) == iResult);
    assertTrue(tc.unwrapToInt(op.apply((char)18, tc.wrap((int)4))) == iResult);
    assertTrue(tc.unwrapToInt(op.apply((short)18, tc.wrap((int)4))) == iResult);
    assertTrue(tc.unwrapToInt(op.apply(18, tc.wrap((int)4))) == iResult);
    assertTrue(tc.unwrapToLong(op.apply((long)18, (Object)tc.wrap((int)4))) == iResult);

    assertTrue(tc.unwrapToInt(op.apply(tc.wrap((byte)18), tc.wrap((int)4))) == iResult);
    assertTrue(tc.unwrapToInt(op.apply(tc.wrap((char)18), tc.wrap((int)4))) == iResult);
    assertTrue(tc.unwrapToInt(op.apply(tc.wrap((short)18), tc.wrap((int)4))) == iResult);
    assertTrue(tc.unwrapToInt(op.apply(tc.wrap((int)18), tc.wrap((int)4))) == iResult);
    assertTrue(tc.unwrapToLong(op.apply(tc.wrap((long)18), tc.wrap((int)4))) == iResult);

    assertTrue(tc.unwrapToInt(op.apply(tc.wrap((byte)18), tc.wrap((int)4))) == iResult);
    assertTrue(tc.unwrapToInt(op.apply(tc.wrap((char)18), tc.wrap((int)4))) == iResult);
    assertTrue(tc.unwrapToInt(op.apply(tc.wrap((short)18), tc.wrap((int)4))) == iResult);
    assertTrue(tc.unwrapToInt(op.apply(tc.wrap((int)18), tc.wrap((int)4))) == iResult);
    assertTrue(tc.unwrapToLong(op.apply(tc.wrap((long)18), tc.wrap((int)4))) == iResult);

    assertTrue(tc.unwrapToInt(op.apply(tc.wrap((byte)18), intMetaClass, tc.wrap((int)4))) == iResult);
    assertTrue(tc.unwrapToInt(op.apply(tc.wrap((char)18), intMetaClass, tc.wrap((int)4))) == iResult);
    assertTrue(tc.unwrapToInt(op.apply(tc.wrap((short)18), intMetaClass, tc.wrap((int)4))) == iResult);
    assertTrue(tc.unwrapToInt(op.apply(tc.wrap((int)18), intMetaClass, tc.wrap((int)4))) == iResult);
    assertTrue(tc.unwrapToLong(op.apply(tc.wrap((long)18), intMetaClass, tc.wrap((int)4))) == iResult);

    try {
      assertTrue(op.longApply((byte)18, (long)4) == iResult);
    } catch (NotPerformed e1) {
      assertTrue(false);
    }
    try {
      assertTrue(op.longApply((char)18, (long)4) == iResult);
    } catch (NotPerformed e) {
      assertTrue(false);
    }
    try {
      assertTrue(op.longApply((short)18, (long)4) == iResult);
    } catch (NotPerformed e1) {
      assertTrue(false);
    }
    try {
      assertTrue(op.longApply(18, (long)4) == iResult);
    } catch (NotPerformed e) {
      assertTrue(false);
    }
    try {
      assertTrue(op.longApply((long)18, (long)4) == iResult);
    } catch (NotPerformed e) {
      assertTrue(false);
    }

    assertTrue(tc.unwrapToInt(op.apply((byte)18, (long)4)) == iResult);
    assertTrue(tc.unwrapToInt(op.apply((char)18, (long)4)) == iResult);
    assertTrue(tc.unwrapToInt(op.apply((short)18, (long)4)) == iResult);
    assertTrue(tc.unwrapToInt(op.apply(18, (long)4)) == iResult);
    assertTrue(tc.unwrapToLong(op.apply((long)18, (long)4)) == iResult);
    try {
      assertTrue(((BigInteger)op.apply(BigInteger.valueOf(18), (long)4)).longValue() == iResult);
      assert(false);
    } catch (NgRuntimeException e) {
      assert(true); // you can't shift a Biginteger by a Long
    }

    assertTrue(tc.unwrapToInt(op.apply(tc.wrap((byte)18), (long)4)) == iResult);
    assertTrue(tc.unwrapToInt(op.apply(tc.wrap((char)18), (long)4)) == iResult);
    assertTrue(tc.unwrapToInt(op.apply(tc.wrap((short)18), (long)4)) == iResult);
    assertTrue(tc.unwrapToInt(op.apply(tc.wrap((int)18), (long)4)) == iResult);
    assertTrue(tc.unwrapToLong(op.apply(tc.wrap((long)18), (long)4)) == iResult);

    assertTrue(tc.unwrapToInt(op.apply((Object)tc.wrap((byte)18), (long)4)) == iResult);
    assertTrue(tc.unwrapToInt(op.apply((Object)tc.wrap((char)18), (long)4)) == iResult);
    assertTrue(tc.unwrapToInt(op.apply((Object)tc.wrap((short)18), (long)4)) == iResult);
    assertTrue(tc.unwrapToInt(op.apply((Object)tc.wrap((int)18), (long)4)) == iResult);
    assertTrue(tc.unwrapToLong(op.apply((Object)tc.wrap((long)18), (long)4)) == iResult);
    try {
      assertTrue(((BigInteger)op.apply((Object)BigInteger.valueOf(18), (long)4)).longValue() == iResult);
      assert(false);
    } catch (NgRuntimeException e) {
      assert(true); // you can't shift a Biginteger by a Long
    }

    assertTrue(tc.unwrapToInt(op.apply((byte)18, tc.wrap((long)4))) == iResult);
    assertTrue(tc.unwrapToInt(op.apply((char)18, tc.wrap((long)4))) == iResult);
    assertTrue(tc.unwrapToInt(op.apply((short)18, tc.wrap((long)4))) == iResult);
    assertTrue(tc.unwrapToInt(op.apply(18, tc.wrap((long)4))) == iResult);
    assertTrue(tc.unwrapToLong(op.apply((long)18, tc.wrap((long)4))) == iResult);
    try {
      assertTrue(((BigInteger)op.apply(BigInteger.valueOf(18), tc.wrap((long)4))).longValue() == iResult);
      assert(false);
    } catch (NgRuntimeException e) {
      assert(true); // you can't shift a Biginteger by a Long
    }

    assertTrue(tc.unwrapToInt(op.apply((byte)18, tc.wrap((long)4))) == iResult);
    assertTrue(tc.unwrapToInt(op.apply((char)18, tc.wrap((long)4))) == iResult);
    assertTrue(tc.unwrapToInt(op.apply((short)18, tc.wrap((long)4))) == iResult);
    assertTrue(tc.unwrapToInt(op.apply(18, tc.wrap((long)4))) == iResult);
    assertTrue(tc.unwrapToLong(op.apply((long)18, (Object)tc.wrap((long)4))) == iResult);
    try {
      assertTrue(((BigInteger)op.apply(BigInteger.valueOf(18), tc.wrap((long)4))).longValue() == iResult);
      assert(false);
    } catch (NgRuntimeException e) {
      assert(true); // you can't shift a Biginteger by a Long
    }

    assertTrue(tc.unwrapToInt(op.apply(tc.wrap((byte)18), tc.wrap((long)4))) == iResult);
    assertTrue(tc.unwrapToInt(op.apply(tc.wrap((char)18), tc.wrap((long)4))) == iResult);
    assertTrue(tc.unwrapToInt(op.apply(tc.wrap((short)18), tc.wrap((long)4))) == iResult);
    assertTrue(tc.unwrapToInt(op.apply(tc.wrap((int)18), tc.wrap((long)4))) == iResult);
    assertTrue(tc.unwrapToLong(op.apply(tc.wrap((long)18), tc.wrap((long)4))) == iResult);
    try {
      assertTrue(((BigInteger)op.apply(BigInteger.valueOf(18), tc.wrap((long)4))).longValue() == iResult);
      assert(false);
    } catch (NgRuntimeException e) {
      assert(true); // you can't shift a Biginteger by a Long
    }

    assertTrue(tc.unwrapToInt(op.apply(tc.wrap((byte)18), tc.wrap((long)4))) == iResult);
    assertTrue(tc.unwrapToInt(op.apply(tc.wrap((char)18), tc.wrap((long)4))) == iResult);
    assertTrue(tc.unwrapToInt(op.apply(tc.wrap((short)18), tc.wrap((long)4))) == iResult);
    assertTrue(tc.unwrapToInt(op.apply(tc.wrap((int)18), tc.wrap((long)4))) == iResult);
    assertTrue(tc.unwrapToLong(op.apply(tc.wrap((long)18), tc.wrap((long)4))) == iResult);
    try {
      assertTrue(((BigInteger)op.apply((Object)BigInteger.valueOf(18), (Object)tc.wrap((long)4))).longValue() == iResult);
      assert(false);
    } catch (NgRuntimeException e) {
      assert(true); // you can't shift a Biginteger by a Long
    }

    assertTrue(tc.unwrapToInt(op.apply(tc.wrap((byte)18), longMetaClass, tc.wrap((long)4))) == iResult);
    assertTrue(tc.unwrapToInt(op.apply(tc.wrap((char)18), longMetaClass, tc.wrap((long)4))) == iResult);
    assertTrue(tc.unwrapToInt(op.apply(tc.wrap((short)18), longMetaClass, tc.wrap((long)4))) == iResult);
    assertTrue(tc.unwrapToInt(op.apply(tc.wrap((int)18), longMetaClass, tc.wrap((long)4))) == iResult);
    assertTrue(tc.unwrapToLong(op.apply(tc.wrap((long)18), longMetaClass, tc.wrap((long)4))) == iResult);
    try {
      assertTrue(((BigInteger)op.apply((Object)BigInteger.valueOf(18), longMetaClass, (Object)tc.wrap((long)4))).longValue() == iResult);
      assert(false);
    } catch (NgRuntimeException e) {
      assert(true); // you can't shift a Biginteger by a Long
    }

    try {
      assertTrue(op.bigIntegerApply(BigInteger.valueOf(18), BigInteger.valueOf(4)).longValue() == iResult);
      assert(false);
    } catch (NotPerformed e) {
      assert(true);
    }

    assertTrue((tc.unwrapToInt(op.apply((byte)18, BigInteger.valueOf(4)))) == iResult);
    assertTrue((tc.unwrapToInt(op.apply((char)18, BigInteger.valueOf(4)))) == iResult);
    assertTrue((tc.unwrapToInt(op.apply((short)18, BigInteger.valueOf(4)))) == iResult);
    assertTrue((tc.unwrapToInt(op.apply(18, BigInteger.valueOf(4)))) == iResult);
    assertTrue((tc.unwrapToLong(op.apply((long)18, BigInteger.valueOf(4)))) == iResult);
    try {
      assertTrue(((BigInteger)op.apply(BigInteger.valueOf(18), BigInteger.valueOf(4))).longValue() == iResult);
      assert(false);
    } catch (NgRuntimeException e) {
      assert(true); // you can't shift a BigInteger by a BigInteger
    }

    assertTrue((tc.unwrapToInt(op.apply(tc.wrap((byte)18), BigInteger.valueOf(4)))) == iResult);
    assertTrue((tc.unwrapToInt(op.apply(tc.wrap((char)18), BigInteger.valueOf(4)))) == iResult);
    assertTrue((tc.unwrapToInt(op.apply(tc.wrap((short)18), BigInteger.valueOf(4)))) == iResult);
    assertTrue((tc.unwrapToInt(op.apply(tc.wrap((int)18), BigInteger.valueOf(4)))) == iResult);
    assertTrue((tc.unwrapToLong(op.apply(tc.wrap((long)18), BigInteger.valueOf(4)))) == iResult);

    assertTrue((tc.unwrapToInt(op.apply(tc.wrap((byte)18), BigInteger.valueOf(4)))) == iResult);
    assertTrue((tc.unwrapToInt(op.apply(tc.wrap((char)18), BigInteger.valueOf(4)))) == iResult);
    assertTrue((tc.unwrapToInt(op.apply(tc.wrap((short)18), BigInteger.valueOf(4)))) == iResult);
    assertTrue((tc.unwrapToInt(op.apply(tc.wrap((int)18), BigInteger.valueOf(4)))) == iResult);
    assertTrue((tc.unwrapToLong(op.apply(tc.wrap((long)18), BigInteger.valueOf(4)))) == iResult);
    try {
      assertTrue(((BigInteger)op.apply((Object)BigInteger.valueOf(18), BigInteger.valueOf(4))).longValue() == iResult);
      assert(false);
    } catch (NgRuntimeException e) {
      assert(true); // you can't shift a BigInteger by a BigInteger
    }

    assertTrue((tc.unwrapToInt(op.apply((Object)tc.wrap((byte)18), (Object)BigInteger.valueOf(4)))) == iResult);
    assertTrue((tc.unwrapToInt(op.apply((Object)tc.wrap((char)18), (Object)BigInteger.valueOf(4)))) == iResult);
    assertTrue((tc.unwrapToInt(op.apply((Object)tc.wrap((short)18), (Object)BigInteger.valueOf(4)))) == iResult);
    assertTrue((tc.unwrapToInt(op.apply((Object)tc.wrap((int)18), (Object)BigInteger.valueOf(4)))) == iResult);
    assertTrue((tc.unwrapToLong(op.apply((Object)tc.wrap((long)18), (Object)BigInteger.valueOf(4)))) == iResult);
    try {
      assertTrue(((BigInteger)op.apply((Object)BigInteger.valueOf(18), (Object)BigInteger.valueOf(4))).longValue() == iResult);
      assert(false);
    } catch (NgRuntimeException e) {
      assert(true); // you can't shift a BigInteger by a BigInteger
    }

    assertTrue((tc.unwrapToInt(op.apply(tc.wrap((byte)18), bigIntegerMetaClass, BigInteger.valueOf(4)))) == iResult);
    assertTrue((tc.unwrapToInt(op.apply(tc.wrap((char)18), bigIntegerMetaClass, BigInteger.valueOf(4)))) == iResult);
    assertTrue((tc.unwrapToInt(op.apply(tc.wrap((short)18), bigIntegerMetaClass, BigInteger.valueOf(4)))) == iResult);
    assertTrue((tc.unwrapToInt(op.apply(tc.wrap((int)18), bigIntegerMetaClass, BigInteger.valueOf(4)))) == iResult);
    assertTrue((tc.unwrapToLong(op.apply((Object)tc.wrap((long)18), bigIntegerMetaClass, (Object)BigInteger.valueOf(4)))) == iResult);
    try {
      assertTrue(((BigInteger)op.apply((Object)BigInteger.valueOf(18), bigIntegerMetaClass, (Object)BigInteger.valueOf(4))).longValue() == iResult);
      assert(false);
    } catch (NgRuntimeException e) {
      assert(true); // you can't shift a BigInteger by a BigInteger
    }
  }

  public void testShiftLeft() throws Throwable {
    final ThreadContext tc = ThreadContext.getThreadContext();
    doTest((ExtendedThreadContext)tc, tc.leftShift(), 18 << 4);
  }

  public void testShiftRight() throws Throwable {
    final ExtendedThreadContext tc = (ExtendedThreadContext)ThreadContext.getThreadContext();
    doTest(tc, tc.rightShift(), 18 >> 4);
  }

  public void testUnsignedShiftRight() throws Throwable {
    final ExtendedThreadContext tc = (ExtendedThreadContext)ThreadContext.getThreadContext();
    doTestUnsignedShift(tc, tc.unsignedRightShift(), 18 >>> 4);
  }
}