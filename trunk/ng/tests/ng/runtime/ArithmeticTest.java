package ng.runtime;

import java.math.BigDecimal;
import java.math.BigInteger;

import junit.framework.TestCase;
import ng.runtime.metaclass.MetaClass;
import ng.runtime.threadcontext.BinaryArithmeticOperation;
import ng.runtime.threadcontext.ExtendedThreadContext;
import ng.runtime.threadcontext.NotPerformed;
import ng.runtime.threadcontext.ThreadContext;

public class ArithmeticTest extends TestCase {
  private static void doTest(final ExtendedThreadContext tc, final BinaryArithmeticOperation op, final int iResult, final double dResult) throws NotPerformed {
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
    assertTrue(op.floatApply((float)18, (byte)4) == dResult);
    assertTrue(op.doubleApply((double)18, (byte)4) == dResult);
    assertTrue(op.bigIntegerApply(BigInteger.valueOf(18), (byte)4).longValue() == iResult);
    assertTrue(op.bigDecimalApply(BigDecimal.valueOf(18), (byte)4).doubleValue() == dResult);

    assertTrue(tc.unwrapToInt(op.apply((byte)18, (byte)4)) == iResult);
    assertTrue(tc.unwrapToInt(op.apply((char)18, (byte)4)) == iResult);
    assertTrue(tc.unwrapToInt(op.apply((short)18, (byte)4)) == iResult);
    assertTrue(tc.unwrapToInt(op.apply(18, (byte)4)) == iResult);
    assertTrue(tc.unwrapToLong(op.apply((long)18, (byte)4)) == iResult);
    assertTrue(tc.unwrapToFloat(op.apply((float)18, (byte)4)) == dResult);
    assertTrue(tc.unwrapToDouble(op.apply((double)18, (byte)4)) == dResult);
    assertTrue(((BigInteger)op.apply(BigInteger.valueOf(18), (byte)4)).longValue() == iResult);
    assertTrue(((BigDecimal)op.apply(BigDecimal.valueOf(18), (byte)4)).doubleValue() == dResult);

    assertTrue(tc.unwrapToInt(op.apply(NgByte.valueOf((byte)18), (byte)4)) == iResult);
    assertTrue(tc.unwrapToInt(op.apply(NgChar.valueOf((char)18), (byte)4)) == iResult);
    assertTrue(tc.unwrapToInt(op.apply(NgShort.valueOf((short)18), (byte)4)) == iResult);
    assertTrue(tc.unwrapToInt(op.apply(NgInt.valueOf(18), (byte)4)) == iResult);
    assertTrue(tc.unwrapToLong(op.apply(NgLong.valueOf(18), (byte)4)) == iResult);
    assertTrue(tc.unwrapToFloat(op.apply(NgFloat.valueOf(18), (byte)4)) == dResult);
    assertTrue(tc.unwrapToDouble(op.apply(NgDouble.valueOf(18), (byte)4)) == dResult);

    assertTrue(tc.unwrapToInt(op.apply(NgByte.valueOf((byte)18), (byte)4)) == iResult);
    assertTrue(tc.unwrapToInt(op.apply(NgChar.valueOf((char)18), (byte)4)) == iResult);
    assertTrue(tc.unwrapToInt(op.apply(NgShort.valueOf((short)18), (byte)4)) == iResult);
    assertTrue(tc.unwrapToInt(op.apply(NgInt.valueOf(18), (byte)4)) == iResult);
    assertTrue(tc.unwrapToLong(op.apply(NgLong.valueOf(18), (byte)4)) == iResult);
    assertTrue(tc.unwrapToFloat(op.apply(NgFloat.valueOf(18), (byte)4)) == dResult);
    assertTrue(tc.unwrapToDouble(op.apply(NgDouble.valueOf(18), (byte)4)) == dResult);
    assertTrue(((BigInteger)op.apply((Object)BigInteger.valueOf(18), (byte)4)).longValue() == iResult);
    assertTrue(((BigDecimal)op.apply((Object)BigDecimal.valueOf(18), (byte)4)).doubleValue() == dResult);

    assertTrue(tc.unwrapToInt(op.apply((byte)18, NgByte.valueOf((byte)4))) == iResult);
    assertTrue(tc.unwrapToInt(op.apply((char)18, NgByte.valueOf((byte)4))) == iResult);
    assertTrue(tc.unwrapToInt(op.apply((short)18, NgByte.valueOf((byte)4))) == iResult);
    assertTrue(tc.unwrapToInt(op.apply(18, NgByte.valueOf((byte)4))) == iResult);
    assertTrue(tc.unwrapToLong(op.apply((long)18, NgByte.valueOf((byte)4))) == iResult);
    assertTrue(tc.unwrapToFloat(op.apply((float)18, NgByte.valueOf((byte)4))) == dResult);
    assertTrue(tc.unwrapToDouble(op.apply((double)18, NgByte.valueOf((byte)4))) == dResult);
    assertTrue(((BigInteger)op.apply(BigInteger.valueOf(18), NgByte.valueOf((byte)4))).longValue() == iResult);
    assertTrue(((BigDecimal)op.apply(BigDecimal.valueOf(18), NgByte.valueOf((byte)4))).doubleValue() == dResult);

    assertTrue(tc.unwrapToInt(op.apply((byte)18, NgByte.valueOf((byte)4))) == iResult);
    assertTrue(tc.unwrapToInt(op.apply((char)18, NgByte.valueOf((byte)4))) == iResult);
    assertTrue(tc.unwrapToInt(op.apply((short)18, NgByte.valueOf((byte)4))) == iResult);
    assertTrue(tc.unwrapToInt(op.apply(18, NgByte.valueOf((byte)4))) == iResult);
    assertTrue(tc.unwrapToLong(op.apply((long)18, (Object)NgByte.valueOf((byte)4))) == iResult);
    assertTrue(tc.unwrapToFloat(op.apply((float)18, (Object)NgByte.valueOf((byte)4))) == dResult);
    assertTrue(tc.unwrapToDouble(op.apply((double)18, (Object)NgByte.valueOf((byte)4))) == dResult);
    assertTrue(((BigInteger)op.apply(BigInteger.valueOf(18), NgByte.valueOf((byte)4))).longValue() == iResult);
    assertTrue(((BigDecimal)op.apply(BigDecimal.valueOf(18), NgByte.valueOf((byte)4))).doubleValue() == dResult);

    assertTrue(tc.unwrapToInt(op.apply(NgByte.valueOf((byte)18), NgByte.valueOf((byte)4))) == iResult);
    assertTrue(tc.unwrapToInt(op.apply(NgChar.valueOf((char)18), NgByte.valueOf((byte)4))) == iResult);
    assertTrue(tc.unwrapToInt(op.apply(NgShort.valueOf((short)18), NgByte.valueOf((byte)4))) == iResult);
    assertTrue(tc.unwrapToInt(op.apply(NgInt.valueOf(18), NgByte.valueOf((byte)4))) == iResult);
    assertTrue(tc.unwrapToLong(op.apply(NgLong.valueOf(18), NgByte.valueOf((byte)4))) == iResult);
    assertTrue(tc.unwrapToFloat(op.apply(NgFloat.valueOf(18), NgByte.valueOf((byte)4))) == dResult);
    assertTrue(tc.unwrapToDouble(op.apply(NgDouble.valueOf(18), NgByte.valueOf((byte)4))) == dResult);
    assertTrue(((BigInteger)op.apply(BigInteger.valueOf(18), NgByte.valueOf((byte)4))).longValue() == iResult);
    assertTrue(((BigDecimal)op.apply(BigDecimal.valueOf(18), NgByte.valueOf((byte)4))).doubleValue() == dResult);

    assertTrue(tc.unwrapToInt(op.apply(NgByte.valueOf((byte)18), NgByte.valueOf((byte)4))) == iResult);
    assertTrue(tc.unwrapToInt(op.apply(NgChar.valueOf((char)18), NgByte.valueOf((byte)4))) == iResult);
    assertTrue(tc.unwrapToInt(op.apply(NgShort.valueOf((short)18), NgByte.valueOf((byte)4))) == iResult);
    assertTrue(tc.unwrapToInt(op.apply(NgInt.valueOf(18), NgByte.valueOf((byte)4))) == iResult);
    assertTrue(tc.unwrapToLong(op.apply(NgLong.valueOf(18), NgByte.valueOf((byte)4))) == iResult);
    assertTrue(tc.unwrapToFloat(op.apply(NgFloat.valueOf(18), NgByte.valueOf((byte)4))) == dResult);
    assertTrue(tc.unwrapToDouble(op.apply(NgDouble.valueOf(18), NgByte.valueOf((byte)4))) == dResult);
    assertTrue(((BigInteger)op.apply((Object)BigInteger.valueOf(18), (Object)NgByte.valueOf((byte)4))).longValue() == iResult);
    assertTrue(((BigDecimal)op.apply((Object)BigDecimal.valueOf(18), (Object)NgByte.valueOf((byte)4))).doubleValue() == dResult);

    assertTrue(tc.unwrapToInt(op.apply(NgByte.valueOf((byte)18), byteMetaClass, NgByte.valueOf((byte)4))) == iResult);
    assertTrue(tc.unwrapToInt(op.apply(NgChar.valueOf((char)18), byteMetaClass, NgByte.valueOf((byte)4))) == iResult);
    assertTrue(tc.unwrapToInt(op.apply(NgShort.valueOf((short)18), byteMetaClass, NgByte.valueOf((byte)4))) == iResult);
    assertTrue(tc.unwrapToInt(op.apply(NgInt.valueOf(18), byteMetaClass, NgByte.valueOf((byte)4))) == iResult);
    assertTrue(tc.unwrapToLong(op.apply(NgLong.valueOf(18), byteMetaClass, NgByte.valueOf((byte)4))) == iResult);
    assertTrue(tc.unwrapToFloat(op.apply(NgFloat.valueOf(18), byteMetaClass, NgByte.valueOf((byte)4))) == dResult);
    assertTrue(tc.unwrapToDouble(op.apply(NgDouble.valueOf(18), byteMetaClass, NgByte.valueOf((byte)4))) == dResult);
    assertTrue(((BigInteger)op.apply((Object)BigInteger.valueOf(18), byteMetaClass, (Object)NgByte.valueOf((byte)4))).longValue() == iResult);
    assertTrue(((BigDecimal)op.apply((Object)BigDecimal.valueOf(18), byteMetaClass, (Object)NgByte.valueOf((byte)4))).doubleValue() == dResult);

    assertTrue(op.intApply((byte)18, (char)4) == iResult);
    assertTrue(op.intApply((char)18, (char)4) == iResult);
    assertTrue(op.intApply((short)18, (char)4) == iResult);
    assertTrue(op.intApply(18, (char)4) == iResult);
    assertTrue(op.longApply((long)18, (char)4) == iResult);
    assertTrue(op.floatApply((float)18, (char)4) == dResult);
    assertTrue(op.doubleApply((double)18, (char)4) == dResult);
    assertTrue(op.bigIntegerApply(BigInteger.valueOf(18), (char)4).longValue() == iResult);
    assertTrue(op.bigDecimalApply(BigDecimal.valueOf(18), (char)4).doubleValue() == dResult);

    assertTrue(tc.unwrapToInt(op.apply((byte)18, (char)4)) == iResult);
    assertTrue(tc.unwrapToInt(op.apply((char)18, (char)4)) == iResult);
    assertTrue(tc.unwrapToInt(op.apply((short)18, (char)4)) == iResult);
    assertTrue(tc.unwrapToInt(op.apply(18, (char)4)) == iResult);
    assertTrue(tc.unwrapToLong(op.apply((long)18, (char)4)) == iResult);
    assertTrue(tc.unwrapToFloat(op.apply((float)18, (char)4)) == dResult);
    assertTrue(tc.unwrapToDouble(op.apply((double)18, (char)4)) == dResult);
    assertTrue(((BigInteger)op.apply(BigInteger.valueOf(18), (char)4)).longValue() == iResult);
    assertTrue(((BigDecimal)op.apply(BigDecimal.valueOf(18), (char)4)).doubleValue() == dResult);

    assertTrue(tc.unwrapToInt(op.apply(NgByte.valueOf((byte)18), (char)4)) == iResult);
    assertTrue(tc.unwrapToInt(op.apply(NgChar.valueOf((char)18), (char)4)) == iResult);
    assertTrue(tc.unwrapToInt(op.apply(NgShort.valueOf((short)18), (char)4)) == iResult);
    assertTrue(tc.unwrapToInt(op.apply(NgInt.valueOf(18), (char)4)) == iResult);
    assertTrue(tc.unwrapToLong(op.apply(NgLong.valueOf(18), (char)4)) == iResult);
    assertTrue(tc.unwrapToFloat(op.apply(NgFloat.valueOf(18), (char)4)) == dResult);
    assertTrue(tc.unwrapToDouble(op.apply(NgDouble.valueOf(18), (char)4)) == dResult);

    assertTrue(tc.unwrapToInt(op.apply(NgByte.valueOf((byte)18), (char)4)) == iResult);
    assertTrue(tc.unwrapToInt(op.apply(NgChar.valueOf((char)18), (char)4)) == iResult);
    assertTrue(tc.unwrapToInt(op.apply(NgShort.valueOf((short)18), (char)4)) == iResult);
    assertTrue(tc.unwrapToInt(op.apply(NgInt.valueOf(18), (char)4)) == iResult);
    assertTrue(tc.unwrapToLong(op.apply(NgLong.valueOf(18), (char)4)) == iResult);
    assertTrue(tc.unwrapToFloat(op.apply(NgFloat.valueOf(18), (char)4)) == dResult);
    assertTrue(tc.unwrapToDouble(op.apply(NgDouble.valueOf(18), (char)4)) == dResult);
    assertTrue(((BigInteger)op.apply((Object)BigInteger.valueOf(18), (char)4)).longValue() == iResult);
    assertTrue(((BigDecimal)op.apply((Object)BigDecimal.valueOf(18), (char)4)).doubleValue() == dResult);

    assertTrue(tc.unwrapToInt(op.apply((byte)18, NgChar.valueOf((char)4))) == iResult);
    assertTrue(tc.unwrapToInt(op.apply((char)18, NgChar.valueOf((char)4))) == iResult);
    assertTrue(tc.unwrapToInt(op.apply((short)18, NgChar.valueOf((char)4))) == iResult);
    assertTrue(tc.unwrapToInt(op.apply(18, NgChar.valueOf((char)4))) == iResult);
    assertTrue(tc.unwrapToLong(op.apply((long)18, NgChar.valueOf((char)4))) == iResult);
    assertTrue(tc.unwrapToFloat(op.apply((float)18, NgChar.valueOf((char)4))) == dResult);
    assertTrue(tc.unwrapToDouble(op.apply((double)18, NgChar.valueOf((char)4))) == dResult);
    assertTrue(((BigInteger)op.apply(BigInteger.valueOf(18), NgChar.valueOf((char)4))).longValue() == iResult);
    assertTrue(((BigDecimal)op.apply(BigDecimal.valueOf(18), NgChar.valueOf((char)4))).doubleValue() == dResult);

    assertTrue(tc.unwrapToInt(op.apply((byte)18, NgChar.valueOf((char)4))) == iResult);
    assertTrue(tc.unwrapToInt(op.apply((char)18, NgChar.valueOf((char)4))) == iResult);
    assertTrue(tc.unwrapToInt(op.apply((short)18, NgChar.valueOf((char)4))) == iResult);
    assertTrue(tc.unwrapToInt(op.apply(18, NgChar.valueOf((char)4))) == iResult);
    assertTrue(tc.unwrapToLong(op.apply((long)18, (Object)NgChar.valueOf((char)4))) == iResult);
    assertTrue(tc.unwrapToFloat(op.apply((float)18, (Object)NgChar.valueOf((char)4))) == dResult);
    assertTrue(tc.unwrapToDouble(op.apply((double)18, (Object)NgChar.valueOf((char)4))) == dResult);
    assertTrue(((BigInteger)op.apply(BigInteger.valueOf(18), NgChar.valueOf((char)4))).longValue() == iResult);
    assertTrue(((BigDecimal)op.apply(BigDecimal.valueOf(18), NgChar.valueOf((char)4))).doubleValue() == dResult);

    assertTrue(tc.unwrapToInt(op.apply(NgByte.valueOf((byte)18), NgChar.valueOf((char)4))) == iResult);
    assertTrue(tc.unwrapToInt(op.apply(NgChar.valueOf((char)18), NgChar.valueOf((char)4))) == iResult);
    assertTrue(tc.unwrapToInt(op.apply(NgShort.valueOf((short)18), NgChar.valueOf((char)4))) == iResult);
    assertTrue(tc.unwrapToInt(op.apply(NgInt.valueOf(18), NgChar.valueOf((char)4))) == iResult);
    assertTrue(tc.unwrapToLong(op.apply(NgLong.valueOf(18), NgChar.valueOf((char)4))) == iResult);
    assertTrue(tc.unwrapToFloat(op.apply(NgFloat.valueOf(18), NgChar.valueOf((char)4))) == dResult);
    assertTrue(tc.unwrapToDouble(op.apply(NgDouble.valueOf(18), NgChar.valueOf((char)4))) == dResult);
    assertTrue(((BigInteger)op.apply(BigInteger.valueOf(18), NgChar.valueOf((char)4))).longValue() == iResult);
    assertTrue(((BigDecimal)op.apply(BigDecimal.valueOf(18), NgChar.valueOf((char)4))).doubleValue() == dResult);

    assertTrue(tc.unwrapToInt(op.apply(NgByte.valueOf((byte)18), NgChar.valueOf((char)4))) == iResult);
    assertTrue(tc.unwrapToInt(op.apply(NgChar.valueOf((char)18), NgChar.valueOf((char)4))) == iResult);
    assertTrue(tc.unwrapToInt(op.apply(NgShort.valueOf((short)18), NgChar.valueOf((char)4))) == iResult);
    assertTrue(tc.unwrapToInt(op.apply(NgInt.valueOf(18), NgChar.valueOf((char)4))) == iResult);
    assertTrue(tc.unwrapToLong(op.apply(NgLong.valueOf(18), NgChar.valueOf((char)4))) == iResult);
    assertTrue(tc.unwrapToFloat(op.apply(NgFloat.valueOf(18), NgChar.valueOf((char)4))) == dResult);
    assertTrue(tc.unwrapToDouble(op.apply(NgDouble.valueOf(18), NgChar.valueOf((char)4))) == dResult);
    assertTrue(((BigInteger)op.apply((Object)BigInteger.valueOf(18), (Object)NgChar.valueOf((char)4))).longValue() == iResult);
    assertTrue(((BigDecimal)op.apply((Object)BigDecimal.valueOf(18), (Object)NgChar.valueOf((char)4))).doubleValue() == dResult);

    assertTrue(tc.unwrapToInt(op.apply(NgByte.valueOf((byte)18), charMetaClass, NgChar.valueOf((char)4))) == iResult);
    assertTrue(tc.unwrapToInt(op.apply(NgChar.valueOf((char)18), charMetaClass, NgChar.valueOf((char)4))) == iResult);
    assertTrue(tc.unwrapToInt(op.apply(NgShort.valueOf((short)18), charMetaClass, NgChar.valueOf((char)4))) == iResult);
    assertTrue(tc.unwrapToInt(op.apply(NgInt.valueOf(18), charMetaClass, NgChar.valueOf((char)4))) == iResult);
    assertTrue(tc.unwrapToLong(op.apply(NgLong.valueOf(18), charMetaClass, NgChar.valueOf((char)4))) == iResult);
    assertTrue(tc.unwrapToFloat(op.apply(NgFloat.valueOf(18), charMetaClass, NgChar.valueOf((char)4))) == dResult);
    assertTrue(tc.unwrapToDouble(op.apply(NgDouble.valueOf(18), charMetaClass, NgChar.valueOf((char)4))) == dResult);
    assertTrue(((BigInteger)op.apply((Object)BigInteger.valueOf(18), charMetaClass, (Object)NgChar.valueOf((char)4))).longValue() == iResult);
    assertTrue(((BigDecimal)op.apply((Object)BigDecimal.valueOf(18), charMetaClass, (Object)NgChar.valueOf((char)4))).doubleValue() == dResult);

    assertTrue(tc.unwrapToInt(op.apply(NgByte.valueOf((byte)18), charMetaClass,NgChar.valueOf((char)4))) == iResult);
    assertTrue(tc.unwrapToInt(op.apply(NgChar.valueOf((char)18), charMetaClass,NgChar.valueOf((char)4))) == iResult);
    assertTrue(tc.unwrapToInt(op.apply(NgShort.valueOf((short)18), charMetaClass,NgChar.valueOf((char)4))) == iResult);
    assertTrue(tc.unwrapToInt(op.apply(NgInt.valueOf(18), charMetaClass,NgChar.valueOf((char)4))) == iResult);
    assertTrue(tc.unwrapToLong(op.apply(NgLong.valueOf(18), charMetaClass,NgChar.valueOf((char)4))) == iResult);
    assertTrue(tc.unwrapToFloat(op.apply(NgFloat.valueOf(18), charMetaClass,NgChar.valueOf((char)4))) == dResult);
    assertTrue(tc.unwrapToDouble(op.apply(NgDouble.valueOf(18), charMetaClass,NgChar.valueOf((char)4))) == dResult);
    assertTrue(((BigInteger)op.apply((Object)BigInteger.valueOf(18), charMetaClass,(Object)NgChar.valueOf((char)4))).longValue() == iResult);
    assertTrue(((BigDecimal)op.apply((Object)BigDecimal.valueOf(18), charMetaClass,(Object)NgChar.valueOf((char)4))).doubleValue() == dResult);

    assertTrue(op.intApply((byte)18, (short)4) == iResult);
    assertTrue(op.intApply((char)18, (short)4) == iResult);
    assertTrue(op.intApply((short)18, (short)4) == iResult);
    assertTrue(op.intApply(18, (short)4) == iResult);
    assertTrue(op.longApply((long)18, (short)4) == iResult);
    assertTrue(op.floatApply((float)18, (short)4) == dResult);
    assertTrue(op.doubleApply((double)18, (short)4) == dResult);
    assertTrue(op.bigIntegerApply(BigInteger.valueOf(18), (short)4).longValue() == iResult);
    assertTrue(op.bigDecimalApply(BigDecimal.valueOf(18), (short)4).doubleValue() == dResult);

    assertTrue(tc.unwrapToInt(op.apply((byte)18, (short)4)) == iResult);
    assertTrue(tc.unwrapToInt(op.apply((char)18, (short)4)) == iResult);
    assertTrue(tc.unwrapToInt(op.apply((short)18, (short)4)) == iResult);
    assertTrue(tc.unwrapToInt(op.apply(18, (short)4)) == iResult);
    assertTrue(tc.unwrapToLong(op.apply((long)18, (short)4)) == iResult);
    assertTrue(tc.unwrapToFloat(op.apply((float)18, (short)4)) == dResult);
    assertTrue(tc.unwrapToDouble(op.apply((double)18, (short)4)) == dResult);
    assertTrue(((BigInteger)op.apply(BigInteger.valueOf(18), (short)4)).longValue() == iResult);
    assertTrue(((BigDecimal)op.apply(BigDecimal.valueOf(18), (short)4)).doubleValue() == dResult);

    assertTrue(tc.unwrapToInt(op.apply(NgByte.valueOf((byte)18), (short)4)) == iResult);
    assertTrue(tc.unwrapToInt(op.apply(NgChar.valueOf((char)18), (short)4)) == iResult);
    assertTrue(tc.unwrapToInt(op.apply(NgShort.valueOf((short)18), (short)4)) == iResult);
    assertTrue(tc.unwrapToInt(op.apply(NgInt.valueOf(18), (short)4)) == iResult);
    assertTrue(tc.unwrapToLong(op.apply(NgLong.valueOf(18), (short)4)) == iResult);
    assertTrue(tc.unwrapToFloat(op.apply(NgFloat.valueOf(18), (short)4)) == dResult);
    assertTrue(tc.unwrapToDouble(op.apply(NgDouble.valueOf(18), (short)4)) == dResult);

    assertTrue(tc.unwrapToInt(op.apply(NgByte.valueOf((byte)18), (short)4)) == iResult);
    assertTrue(tc.unwrapToInt(op.apply(NgChar.valueOf((char)18), (short)4)) == iResult);
    assertTrue(tc.unwrapToInt(op.apply(NgShort.valueOf((short)18), (short)4)) == iResult);
    assertTrue(tc.unwrapToInt(op.apply(NgInt.valueOf(18), (short)4)) == iResult);
    assertTrue(tc.unwrapToLong(op.apply(NgLong.valueOf(18), (short)4)) == iResult);
    assertTrue(tc.unwrapToFloat(op.apply(NgFloat.valueOf(18), (short)4)) == dResult);
    assertTrue(tc.unwrapToDouble(op.apply(NgDouble.valueOf(18), (short)4)) == dResult);
    assertTrue(((BigInteger)op.apply((Object)BigInteger.valueOf(18), (short)4)).longValue() == iResult);
    assertTrue(((BigDecimal)op.apply((Object)BigDecimal.valueOf(18), (short)4)).doubleValue() == dResult);

    assertTrue(tc.unwrapToInt(op.apply((byte)18, NgShort.valueOf((short)4))) == iResult);
    assertTrue(tc.unwrapToInt(op.apply((char)18, NgShort.valueOf((short)4))) == iResult);
    assertTrue(tc.unwrapToInt(op.apply((short)18, NgShort.valueOf((short)4))) == iResult);
    assertTrue(tc.unwrapToInt(op.apply(18, NgShort.valueOf((short)4))) == iResult);
    assertTrue(tc.unwrapToLong(op.apply((long)18, NgShort.valueOf((short)4))) == iResult);
    assertTrue(tc.unwrapToFloat(op.apply((float)18, NgShort.valueOf((short)4))) == dResult);
    assertTrue(tc.unwrapToDouble(op.apply((double)18, NgShort.valueOf((short)4))) == dResult);
    assertTrue(((BigInteger)op.apply(BigInteger.valueOf(18), NgShort.valueOf((short)4))).longValue() == iResult);
    assertTrue(((BigDecimal)op.apply(BigDecimal.valueOf(18), NgShort.valueOf((short)4))).doubleValue() == dResult);

    assertTrue(tc.unwrapToInt(op.apply((byte)18, NgShort.valueOf((short)4))) == iResult);
    assertTrue(tc.unwrapToInt(op.apply((char)18, NgShort.valueOf((short)4))) == iResult);
    assertTrue(tc.unwrapToInt(op.apply((short)18, NgShort.valueOf((short)4))) == iResult);
    assertTrue(tc.unwrapToInt(op.apply(18, NgShort.valueOf((short)4))) == iResult);
    assertTrue(tc.unwrapToLong(op.apply((long)18, (Object)NgShort.valueOf((short)4))) == iResult);
    assertTrue(tc.unwrapToFloat(op.apply((float)18, (Object)NgShort.valueOf((short)4))) == dResult);
    assertTrue(tc.unwrapToDouble(op.apply((double)18, (Object)NgShort.valueOf((short)4))) == dResult);
    assertTrue(((BigInteger)op.apply(BigInteger.valueOf(18), NgShort.valueOf((short)4))).longValue() == iResult);
    assertTrue(((BigDecimal)op.apply(BigDecimal.valueOf(18), NgShort.valueOf((short)4))).doubleValue() == dResult);

    assertTrue(tc.unwrapToInt(op.apply(NgByte.valueOf((byte)18), NgShort.valueOf((short)4))) == iResult);
    assertTrue(tc.unwrapToInt(op.apply(NgChar.valueOf((char)18), NgShort.valueOf((short)4))) == iResult);
    assertTrue(tc.unwrapToInt(op.apply(NgShort.valueOf((short)18), NgShort.valueOf((short)4))) == iResult);
    assertTrue(tc.unwrapToInt(op.apply(NgInt.valueOf(18), NgShort.valueOf((short)4))) == iResult);
    assertTrue(tc.unwrapToLong(op.apply(NgLong.valueOf(18), NgShort.valueOf((short)4))) == iResult);
    assertTrue(tc.unwrapToFloat(op.apply(NgFloat.valueOf(18), NgShort.valueOf((short)4))) == dResult);
    assertTrue(tc.unwrapToDouble(op.apply(NgDouble.valueOf(18), NgShort.valueOf((short)4))) == dResult);
    assertTrue(((BigInteger)op.apply(BigInteger.valueOf(18), NgShort.valueOf((short)4))).longValue() == iResult);
    assertTrue(((BigDecimal)op.apply(BigDecimal.valueOf(18), NgShort.valueOf((short)4))).doubleValue() == dResult);

    assertTrue(tc.unwrapToInt(op.apply(NgByte.valueOf((byte)18), NgShort.valueOf((short)4))) == iResult);
    assertTrue(tc.unwrapToInt(op.apply(NgChar.valueOf((char)18), NgShort.valueOf((short)4))) == iResult);
    assertTrue(tc.unwrapToInt(op.apply(NgShort.valueOf((short)18), NgShort.valueOf((short)4))) == iResult);
    assertTrue(tc.unwrapToInt(op.apply(NgInt.valueOf(18), NgShort.valueOf((short)4))) == iResult);
    assertTrue(tc.unwrapToLong(op.apply(NgLong.valueOf(18), NgShort.valueOf((short)4))) == iResult);
    assertTrue(tc.unwrapToFloat(op.apply(NgFloat.valueOf(18), NgShort.valueOf((short)4))) == dResult);
    assertTrue(tc.unwrapToDouble(op.apply(NgDouble.valueOf(18), NgShort.valueOf((short)4))) == dResult);
    assertTrue(((BigInteger)op.apply((Object)BigInteger.valueOf(18), (Object)NgShort.valueOf((short)4))).longValue() == iResult);
    assertTrue(((BigDecimal)op.apply((Object)BigDecimal.valueOf(18), (Object)NgShort.valueOf((short)4))).doubleValue() == dResult);

    assertTrue(tc.unwrapToInt(op.apply(NgByte.valueOf((byte)18), shortMetaClass, NgShort.valueOf((short)4))) == iResult);
    assertTrue(tc.unwrapToInt(op.apply(NgChar.valueOf((char)18), shortMetaClass, NgShort.valueOf((short)4))) == iResult);
    assertTrue(tc.unwrapToInt(op.apply(NgShort.valueOf((short)18), shortMetaClass, NgShort.valueOf((short)4))) == iResult);
    assertTrue(tc.unwrapToInt(op.apply(NgInt.valueOf(18), shortMetaClass, NgShort.valueOf((short)4))) == iResult);
    assertTrue(tc.unwrapToLong(op.apply(NgLong.valueOf(18), shortMetaClass, NgShort.valueOf((short)4))) == iResult);
    assertTrue(tc.unwrapToFloat(op.apply(NgFloat.valueOf(18), shortMetaClass, NgShort.valueOf((short)4))) == dResult);
    assertTrue(tc.unwrapToDouble(op.apply(NgDouble.valueOf(18), shortMetaClass, NgShort.valueOf((short)4))) == dResult);
    assertTrue(((BigInteger)op.apply((Object)BigInteger.valueOf(18), shortMetaClass, (Object)NgShort.valueOf((short)4))).longValue() == iResult);
    assertTrue(((BigDecimal)op.apply((Object)BigDecimal.valueOf(18), shortMetaClass, (Object)NgShort.valueOf((short)4))).doubleValue() == dResult);

    assertTrue(op.intApply((byte)18, 4) == iResult);
    assertTrue(op.intApply((char)18, 4) == iResult);
    assertTrue(op.intApply((short)18, 4) == iResult);
    assertTrue(op.intApply(18, 4) == iResult);
    assertTrue(op.longApply((long)18, 4) == iResult);
    assertTrue(op.floatApply((float)18, 4) == dResult);
    assertTrue(op.doubleApply((double)18, 4) == dResult);
    assertTrue(op.bigIntegerApply(BigInteger.valueOf(18), 4).longValue() == iResult);
    assertTrue(op.bigDecimalApply(BigDecimal.valueOf(18), 4).doubleValue() == dResult);

    assertTrue(tc.unwrapToInt(op.apply((byte)18, 4)) == iResult);
    assertTrue(tc.unwrapToInt(op.apply((char)18, 4)) == iResult);
    assertTrue(tc.unwrapToInt(op.apply((short)18, 4)) == iResult);
    assertTrue(tc.unwrapToInt(op.apply(18, 4)) == iResult);
    assertTrue(tc.unwrapToLong(op.apply((long)18, 4)) == iResult);
    assertTrue(tc.unwrapToFloat(op.apply((float)18, 4)) == dResult);
    assertTrue(tc.unwrapToDouble(op.apply((double)18, 4)) == dResult);
    assertTrue(((BigInteger)op.apply(BigInteger.valueOf(18), 4)).longValue() == iResult);
    assertTrue(((BigDecimal)op.apply(BigDecimal.valueOf(18), 4)).doubleValue() == dResult);

    assertTrue(tc.unwrapToInt(op.apply(NgByte.valueOf((byte)18), 4)) == iResult);
    assertTrue(tc.unwrapToInt(op.apply(NgChar.valueOf((char)18), 4)) == iResult);
    assertTrue(tc.unwrapToInt(op.apply(NgShort.valueOf((short)18), 4)) == iResult);
    assertTrue(tc.unwrapToInt(op.apply(NgInt.valueOf(18), 4)) == iResult);
    assertTrue(tc.unwrapToLong(op.apply(NgLong.valueOf(18), 4)) == iResult);
    assertTrue(tc.unwrapToFloat(op.apply(NgFloat.valueOf(18), 4)) == dResult);
    assertTrue(tc.unwrapToDouble(op.apply(NgDouble.valueOf(18), 4)) == dResult);

    assertTrue(tc.unwrapToInt(op.apply(NgByte.valueOf((byte)18), 4)) == iResult);
    assertTrue(tc.unwrapToInt(op.apply(NgChar.valueOf((char)18), 4)) == iResult);
    assertTrue(tc.unwrapToInt(op.apply(NgShort.valueOf((short)18), 4)) == iResult);
    assertTrue(tc.unwrapToInt(op.apply(NgInt.valueOf(18), 4)) == iResult);
    assertTrue(tc.unwrapToLong(op.apply(NgLong.valueOf(18), 4)) == iResult);
    assertTrue(tc.unwrapToFloat(op.apply(NgFloat.valueOf(18), 4)) == dResult);
    assertTrue(tc.unwrapToDouble(op.apply(NgDouble.valueOf(18), 4)) == dResult);
    assertTrue(((BigInteger)op.apply((Object)BigInteger.valueOf(18), 4)).longValue() == iResult);
    assertTrue(((BigDecimal)op.apply((Object)BigDecimal.valueOf(18), 4)).doubleValue() == dResult);

    assertTrue(tc.unwrapToInt(op.apply((byte)18, NgInt.valueOf(4))) == iResult);
    assertTrue(tc.unwrapToInt(op.apply((char)18, NgInt.valueOf(4))) == iResult);
    assertTrue(tc.unwrapToInt(op.apply((short)18, NgInt.valueOf(4))) == iResult);
    assertTrue(tc.unwrapToInt(op.apply(18, NgInt.valueOf(4))) == iResult);
    assertTrue(tc.unwrapToLong(op.apply((long)18, NgInt.valueOf(4))) == iResult);
    assertTrue(tc.unwrapToFloat(op.apply((float)18, NgInt.valueOf(4))) == dResult);
    assertTrue(tc.unwrapToDouble(op.apply((double)18, NgInt.valueOf(4))) == dResult);
    assertTrue(((BigInteger)op.apply(BigInteger.valueOf(18), NgInt.valueOf(4))).longValue() == iResult);
    assertTrue(((BigDecimal)op.apply(BigDecimal.valueOf(18), NgInt.valueOf(4))).doubleValue() == dResult);

    assertTrue(tc.unwrapToInt(op.apply((byte)18, NgInt.valueOf(4))) == iResult);
    assertTrue(tc.unwrapToInt(op.apply((char)18, NgInt.valueOf(4))) == iResult);
    assertTrue(tc.unwrapToInt(op.apply((short)18, NgInt.valueOf(4))) == iResult);
    assertTrue(tc.unwrapToInt(op.apply(18, NgInt.valueOf(4))) == iResult);
    assertTrue(tc.unwrapToLong(op.apply((long)18, (Object)NgInt.valueOf(4))) == iResult);
    assertTrue(tc.unwrapToFloat(op.apply((float)18, (Object)NgInt.valueOf(4))) == dResult);
    assertTrue(tc.unwrapToDouble(op.apply((double)18, (Object)NgInt.valueOf(4))) == dResult);
    assertTrue(((BigInteger)op.apply(BigInteger.valueOf(18), NgInt.valueOf(4))).longValue() == iResult);
    assertTrue(((BigDecimal)op.apply(BigDecimal.valueOf(18), NgInt.valueOf(4))).doubleValue() == dResult);

    assertTrue(tc.unwrapToInt(op.apply(NgByte.valueOf((byte)18), NgInt.valueOf(4))) == iResult);
    assertTrue(tc.unwrapToInt(op.apply(NgChar.valueOf((char)18), NgInt.valueOf(4))) == iResult);
    assertTrue(tc.unwrapToInt(op.apply(NgShort.valueOf((short)18), NgInt.valueOf(4))) == iResult);
    assertTrue(tc.unwrapToInt(op.apply(NgInt.valueOf(18), NgInt.valueOf(4))) == iResult);
    assertTrue(tc.unwrapToLong(op.apply(NgLong.valueOf(18), NgInt.valueOf(4))) == iResult);
    assertTrue(tc.unwrapToFloat(op.apply(NgFloat.valueOf(18), NgInt.valueOf(4))) == dResult);
    assertTrue(tc.unwrapToDouble(op.apply(NgDouble.valueOf(18), NgInt.valueOf(4))) == dResult);
    assertTrue(((BigInteger)op.apply(BigInteger.valueOf(18), NgInt.valueOf(4))).longValue() == iResult);
    assertTrue(((BigDecimal)op.apply(BigDecimal.valueOf(18), NgInt.valueOf(4))).doubleValue() == dResult);

    assertTrue(tc.unwrapToInt(op.apply(NgByte.valueOf((byte)18), NgInt.valueOf(4))) == iResult);
    assertTrue(tc.unwrapToInt(op.apply(NgChar.valueOf((char)18), NgInt.valueOf(4))) == iResult);
    assertTrue(tc.unwrapToInt(op.apply(NgShort.valueOf((short)18), NgInt.valueOf(4))) == iResult);
    assertTrue(tc.unwrapToInt(op.apply(NgInt.valueOf(18), NgInt.valueOf(4))) == iResult);
    assertTrue(tc.unwrapToLong(op.apply(NgLong.valueOf(18), NgInt.valueOf(4))) == iResult);
    assertTrue(tc.unwrapToFloat(op.apply(NgFloat.valueOf(18), NgInt.valueOf(4))) == dResult);
    assertTrue(tc.unwrapToDouble(op.apply(NgDouble.valueOf(18), NgInt.valueOf(4))) == dResult);
    assertTrue(((BigInteger)op.apply((Object)BigInteger.valueOf(18), (Object)NgInt.valueOf(4))).longValue() == iResult);
    assertTrue(((BigDecimal)op.apply((Object)BigDecimal.valueOf(18), (Object)NgInt.valueOf(4))).doubleValue() == dResult);

    assertTrue(tc.unwrapToInt(op.apply(NgByte.valueOf((byte)18), intMetaClass, NgInt.valueOf(4))) == iResult);
    assertTrue(tc.unwrapToInt(op.apply(NgChar.valueOf((char)18), intMetaClass, NgInt.valueOf(4))) == iResult);
    assertTrue(tc.unwrapToInt(op.apply(NgShort.valueOf((short)18), intMetaClass, NgInt.valueOf(4))) == iResult);
    assertTrue(tc.unwrapToInt(op.apply(NgInt.valueOf(18), intMetaClass, NgInt.valueOf(4))) == iResult);
    assertTrue(tc.unwrapToLong(op.apply(NgLong.valueOf(18), intMetaClass, NgInt.valueOf(4))) == iResult);
    assertTrue(tc.unwrapToFloat(op.apply(NgFloat.valueOf(18), intMetaClass, NgInt.valueOf(4))) == dResult);
    assertTrue(tc.unwrapToDouble(op.apply(NgDouble.valueOf(18), intMetaClass, NgInt.valueOf(4))) == dResult);
    assertTrue(((BigInteger)op.apply((Object)BigInteger.valueOf(18), intMetaClass, (Object)NgInt.valueOf(4))).longValue() == iResult);
    assertTrue(((BigDecimal)op.apply((Object)BigDecimal.valueOf(18), intMetaClass, (Object)NgInt.valueOf(4))).doubleValue() == dResult);

    assertTrue(op.longApply((byte)18, (long)4) == iResult);
    assertTrue(op.longApply((char)18, (long)4) == iResult);
    assertTrue(op.longApply((short)18, (long)4) == iResult);
    assertTrue(op.longApply(18, (long)4) == iResult);
    assertTrue(op.longApply((long)18, (long)4) == iResult);
    assertTrue(op.floatApply((float)18, (long)4) == dResult);
    assertTrue(op.doubleApply((double)18, (long)4) == dResult);
    assertTrue(op.bigIntegerApply(BigInteger.valueOf(18), (long)4).longValue() == iResult);
    assertTrue(op.bigDecimalApply(BigDecimal.valueOf(18), (long)4).doubleValue() == dResult);

    assertTrue(tc.unwrapToLong(op.apply((byte)18, (long)4)) == iResult);
    assertTrue(tc.unwrapToLong(op.apply((char)18, (long)4)) == iResult);
    assertTrue(tc.unwrapToLong(op.apply((short)18, (long)4)) == iResult);
    assertTrue(tc.unwrapToLong(op.apply(18, (long)4)) == iResult);
    assertTrue(tc.unwrapToLong(op.apply((long)18, (long)4)) == iResult);
    assertTrue(tc.unwrapToFloat(op.apply((float)18, (long)4)) == dResult);
    assertTrue(tc.unwrapToDouble(op.apply((double)18, (long)4)) == dResult);
    assertTrue(((BigInteger)op.apply(BigInteger.valueOf(18), (long)4)).longValue() == iResult);
    assertTrue(((BigDecimal)op.apply(BigDecimal.valueOf(18), (long)4)).doubleValue() == dResult);

    assertTrue(tc.unwrapToLong(op.apply(NgByte.valueOf((byte)18), (long)4)) == iResult);
    assertTrue(tc.unwrapToLong(op.apply(NgChar.valueOf((char)18), (long)4)) == iResult);
    assertTrue(tc.unwrapToLong(op.apply(NgShort.valueOf((short)18), (long)4)) == iResult);
    assertTrue(tc.unwrapToLong(op.apply(NgInt.valueOf(18), (long)4)) == iResult);
    assertTrue(tc.unwrapToLong(op.apply(NgLong.valueOf(18), (long)4)) == iResult);
    assertTrue(tc.unwrapToFloat(op.apply(NgFloat.valueOf(18), (long)4)) == dResult);
    assertTrue(tc.unwrapToDouble(op.apply(NgDouble.valueOf(18), (long)4)) == dResult);

    assertTrue(tc.unwrapToLong(op.apply((Object)NgByte.valueOf((byte)18), (long)4)) == iResult);
    assertTrue(tc.unwrapToLong(op.apply((Object)NgChar.valueOf((char)18), (long)4)) == iResult);
    assertTrue(tc.unwrapToLong(op.apply((Object)NgShort.valueOf((short)18), (long)4)) == iResult);
    assertTrue(tc.unwrapToLong(op.apply((Object)NgInt.valueOf(18), (long)4)) == iResult);
    assertTrue(tc.unwrapToLong(op.apply((Object)NgLong.valueOf(18), (long)4)) == iResult);
    assertTrue(tc.unwrapToFloat(op.apply((Object)NgFloat.valueOf(18), (long)4)) == dResult);
    assertTrue(tc.unwrapToDouble(op.apply((Object)NgDouble.valueOf(18), (long)4)) == dResult);
    assertTrue(((BigInteger)op.apply((Object)BigInteger.valueOf(18), (long)4)).longValue() == iResult);
    assertTrue(((BigDecimal)op.apply((Object)BigDecimal.valueOf(18), (long)4)).doubleValue() == dResult);

    assertTrue(tc.unwrapToLong(op.apply((byte)18, NgLong.valueOf(4))) == iResult);
    assertTrue(tc.unwrapToLong(op.apply((char)18, NgLong.valueOf(4))) == iResult);
    assertTrue(tc.unwrapToLong(op.apply((short)18, NgLong.valueOf(4))) == iResult);
    assertTrue(tc.unwrapToLong(op.apply(18, NgLong.valueOf(4))) == iResult);
    assertTrue(tc.unwrapToLong(op.apply((long)18, NgLong.valueOf(4))) == iResult);
    assertTrue(tc.unwrapToFloat(op.apply((float)18, NgLong.valueOf(4))) == dResult);
    assertTrue(tc.unwrapToDouble(op.apply((double)18, NgLong.valueOf(4))) == dResult);
    assertTrue(((BigInteger)op.apply(BigInteger.valueOf(18), NgLong.valueOf(4))).longValue() == iResult);
    assertTrue(((BigDecimal)op.apply(BigDecimal.valueOf(18), NgLong.valueOf(4))).doubleValue() == dResult);

    assertTrue(tc.unwrapToLong(op.apply((byte)18, NgLong.valueOf(4))) == iResult);
    assertTrue(tc.unwrapToLong(op.apply((char)18, NgLong.valueOf(4))) == iResult);
    assertTrue(tc.unwrapToLong(op.apply((short)18, NgLong.valueOf(4))) == iResult);
    assertTrue(tc.unwrapToLong(op.apply(18, NgLong.valueOf(4))) == iResult);
    assertTrue(tc.unwrapToLong(op.apply((long)18, (Object)NgLong.valueOf(4))) == iResult);
    assertTrue(tc.unwrapToFloat(op.apply((float)18, (Object)NgLong.valueOf(4))) == dResult);
    assertTrue(tc.unwrapToDouble(op.apply((double)18, (Object)NgLong.valueOf(4))) == dResult);
    assertTrue(((BigInteger)op.apply(BigInteger.valueOf(18), NgLong.valueOf(4))).longValue() == iResult);
    assertTrue(((BigDecimal)op.apply(BigDecimal.valueOf(18), NgLong.valueOf(4))).doubleValue() == dResult);

    assertTrue(tc.unwrapToLong(op.apply(NgByte.valueOf((byte)18), NgLong.valueOf(4))) == iResult);
    assertTrue(tc.unwrapToLong(op.apply(NgChar.valueOf((char)18), NgLong.valueOf(4))) == iResult);
    assertTrue(tc.unwrapToLong(op.apply(NgShort.valueOf((short)18), NgLong.valueOf(4))) == iResult);
    assertTrue(tc.unwrapToLong(op.apply(NgInt.valueOf(18), NgLong.valueOf(4))) == iResult);
    assertTrue(tc.unwrapToLong(op.apply(NgLong.valueOf(18), NgLong.valueOf(4))) == iResult);
    assertTrue(tc.unwrapToFloat(op.apply(NgFloat.valueOf((float)18), NgLong.valueOf((long)4))) == dResult);
    assertTrue(tc.unwrapToDouble(op.apply(NgDouble.valueOf((double)18), NgLong.valueOf((long)4))) == dResult);
    assertTrue(((BigInteger)op.apply(BigInteger.valueOf(18), NgLong.valueOf((long)4))).longValue() == iResult);
    assertTrue(((BigDecimal)op.apply(BigDecimal.valueOf(18), NgLong.valueOf((long)4))).doubleValue() == dResult);

    assertTrue(tc.unwrapToLong(op.apply((Object)NgByte.valueOf((byte)18), (Object)NgLong.valueOf((long)4))) == iResult);
    assertTrue(tc.unwrapToLong(op.apply((Object)NgChar.valueOf((char)18), (Object)NgLong.valueOf((long)4))) == iResult);
    assertTrue(tc.unwrapToLong(op.apply((Object)NgShort.valueOf((short)18), (Object)NgLong.valueOf((long)4))) == iResult);
    assertTrue(tc.unwrapToLong(op.apply((Object)NgInt.valueOf((int)18), (Object)NgLong.valueOf((long)4))) == iResult);
    assertTrue(tc.unwrapToLong(op.apply((Object)NgLong.valueOf((long)18), (Object)NgLong.valueOf((long)4))) == iResult);
    assertTrue(tc.unwrapToFloat(op.apply((Object)NgFloat.valueOf((float)18), (Object)NgLong.valueOf((long)4))) == dResult);
    assertTrue(tc.unwrapToDouble(op.apply((Object)NgDouble.valueOf((double)18), (Object)NgLong.valueOf((long)4))) == dResult);
    assertTrue(((BigInteger)op.apply((Object)BigInteger.valueOf(18), (Object)NgLong.valueOf((long)4))).longValue() == iResult);
    assertTrue(((BigDecimal)op.apply((Object)BigDecimal.valueOf(18), (Object)NgLong.valueOf((long)4))).doubleValue() == dResult);

    assertTrue(tc.unwrapToLong(op.apply((Object)NgByte.valueOf((byte)18), longMetaClass, (Object)NgLong.valueOf((long)4))) == iResult);
    assertTrue(tc.unwrapToLong(op.apply((Object)NgChar.valueOf((char)18), longMetaClass, (Object)NgLong.valueOf((long)4))) == iResult);
    assertTrue(tc.unwrapToLong(op.apply((Object)NgShort.valueOf((short)18), longMetaClass, (Object)NgLong.valueOf((long)4))) == iResult);
    assertTrue(tc.unwrapToLong(op.apply((Object)NgInt.valueOf((int)18), longMetaClass, (Object)NgLong.valueOf((long)4))) == iResult);
    assertTrue(tc.unwrapToLong(op.apply((Object)NgLong.valueOf((long)18), longMetaClass, (Object)NgLong.valueOf((long)4))) == iResult);
    assertTrue(tc.unwrapToFloat(op.apply((Object)NgFloat.valueOf((float)18), longMetaClass, (Object)NgLong.valueOf((long)4))) == dResult);
    assertTrue(tc.unwrapToDouble(op.apply((Object)NgDouble.valueOf((double)18), longMetaClass, (Object)NgLong.valueOf((long)4))) == dResult);
    assertTrue(((BigInteger)op.apply((Object)BigInteger.valueOf(18), longMetaClass, (Object)NgLong.valueOf((long)4))).longValue() == iResult);
    assertTrue(((BigDecimal)op.apply((Object)BigDecimal.valueOf(18), longMetaClass, (Object)NgLong.valueOf((long)4))).doubleValue() == dResult);

    assertTrue(op.floatApply((byte)18, (float)4) == dResult);
    assertTrue(op.floatApply((char)18, (float)4) == dResult);
    assertTrue(op.floatApply((short)18, (float)4) == dResult);
    assertTrue(op.floatApply((int)18, (float)4) == dResult);
    assertTrue(op.floatApply((long)18, (float)4) == dResult);
    assertTrue(op.floatApply((float)18, (float)4) == dResult);
    assertTrue(op.doubleApply((double)18, (float)4) == dResult);
    assertTrue(op.floatApply(BigInteger.valueOf(18), (float)4) == dResult);
    assertTrue(op.bigDecimalApply(BigDecimal.valueOf(18), (float)4).doubleValue() == dResult);

    assertTrue(tc.unwrapToFloat(op.apply((byte)18, (float)4)) == dResult);
    assertTrue(tc.unwrapToFloat(op.apply((char)18, (float)4)) == dResult);
    assertTrue(tc.unwrapToFloat(op.apply((short)18, (float)4)) == dResult);
    assertTrue(tc.unwrapToFloat(op.apply((int)18, (float)4)) == dResult);
    assertTrue(tc.unwrapToFloat(op.apply((long)18, (float)4)) == dResult);
    assertTrue(tc.unwrapToFloat(op.apply((float)18, (float)4)) == dResult);
    assertTrue(tc.unwrapToDouble(op.apply((double)18, (float)4)) == dResult);
    assertTrue(tc.unwrapToFloat(op.apply(BigInteger.valueOf(18), (float)4)) == dResult);
    assertTrue(((BigDecimal)op.apply(BigDecimal.valueOf(18), (float)4)).doubleValue() == dResult);

    assertTrue(tc.unwrapToFloat(op.apply(NgByte.valueOf((byte)18), (float)4)) == dResult);
    assertTrue(tc.unwrapToFloat(op.apply(NgChar.valueOf((char)18), (float)4)) == dResult);
    assertTrue(tc.unwrapToFloat(op.apply(NgShort.valueOf((short)18), (float)4)) == dResult);
    assertTrue(tc.unwrapToFloat(op.apply(NgInt.valueOf((int)18), (float)4)) == dResult);
    assertTrue(tc.unwrapToFloat(op.apply(NgLong.valueOf((long)18), (float)4)) == dResult);
    assertTrue(tc.unwrapToFloat(op.apply(NgFloat.valueOf((float)18), (float)4)) == dResult);
    assertTrue(tc.unwrapToDouble(op.apply(NgDouble.valueOf((double)18), (float)4)) == dResult);

    assertTrue(tc.unwrapToFloat(op.apply((Object)NgByte.valueOf((byte)18), (float)4)) == dResult);
    assertTrue(tc.unwrapToFloat(op.apply((Object)NgChar.valueOf((char)18), (float)4)) == dResult);
    assertTrue(tc.unwrapToFloat(op.apply((Object)NgShort.valueOf((short)18), (float)4)) == dResult);
    assertTrue(tc.unwrapToFloat(op.apply((Object)NgInt.valueOf((int)18), (float)4)) == dResult);
    assertTrue(tc.unwrapToFloat(op.apply((Object)NgLong.valueOf((long)18), (float)4)) == dResult);
    assertTrue(tc.unwrapToFloat(op.apply((Object)NgFloat.valueOf((float)18), (float)4)) == dResult);
    assertTrue(tc.unwrapToDouble(op.apply((Object)NgDouble.valueOf((double)18), (float)4)) == dResult);
    assertTrue(tc.unwrapToFloat(op.apply((Object)BigInteger.valueOf(18), (float)4)) == dResult);
    assertTrue(((BigDecimal)op.apply((Object)BigDecimal.valueOf(18), (float)4)).doubleValue() == dResult);

    assertTrue(tc.unwrapToFloat(op.apply((byte)18, NgFloat.valueOf((float)4))) == dResult);
    assertTrue(tc.unwrapToFloat(op.apply((char)18, NgFloat.valueOf((float)4))) == dResult);
    assertTrue(tc.unwrapToFloat(op.apply((short)18, NgFloat.valueOf((float)4))) == dResult);
    assertTrue(tc.unwrapToFloat(op.apply((int)18, NgFloat.valueOf((float)4))) == dResult);
    assertTrue(tc.unwrapToFloat(op.apply((long)18, NgFloat.valueOf((float)4))) == dResult);
    assertTrue(tc.unwrapToFloat(op.apply((float)18, NgFloat.valueOf((float)4))) == dResult);
    assertTrue(tc.unwrapToDouble(op.apply((double)18, NgFloat.valueOf((float)4))) == dResult);
    assertTrue(tc.unwrapToFloat(op.apply(BigInteger.valueOf(18), NgFloat.valueOf((float)4))) == dResult);
    assertTrue(((BigDecimal)op.apply(BigDecimal.valueOf(18), NgFloat.valueOf((float)4))).doubleValue() == dResult);

    assertTrue(tc.unwrapToFloat(op.apply((byte)18, (Object)NgFloat.valueOf((float)4))) == dResult);
    assertTrue(tc.unwrapToFloat(op.apply((char)18, (Object)NgFloat.valueOf((float)4))) == dResult);
    assertTrue(tc.unwrapToFloat(op.apply((short)18, (Object)NgFloat.valueOf((float)4))) == dResult);
    assertTrue(tc.unwrapToFloat(op.apply((int)18, (Object)NgFloat.valueOf((float)4))) == dResult);
    assertTrue(tc.unwrapToFloat(op.apply((long)18, (Object)NgFloat.valueOf((float)4))) == dResult);
    assertTrue(tc.unwrapToFloat(op.apply((float)18, (Object)NgFloat.valueOf((float)4))) == dResult);
    assertTrue(tc.unwrapToDouble(op.apply((double)18, (Object)NgFloat.valueOf((float)4))) == dResult);
    assertTrue(tc.unwrapToFloat(op.apply(BigInteger.valueOf(18), (Object)NgFloat.valueOf((float)4))) == dResult);
    assertTrue(((BigDecimal)op.apply(BigDecimal.valueOf(18), (Object)NgFloat.valueOf((float)4))).doubleValue() == dResult);

    assertTrue(tc.unwrapToFloat(op.apply(NgByte.valueOf((byte)18), NgFloat.valueOf((float)4))) == dResult);
    assertTrue(tc.unwrapToFloat(op.apply(NgChar.valueOf((char)18), NgFloat.valueOf((float)4))) == dResult);
    assertTrue(tc.unwrapToFloat(op.apply(NgShort.valueOf((short)18), NgFloat.valueOf((float)4))) == dResult);
    assertTrue(tc.unwrapToFloat(op.apply(NgInt.valueOf((int)18), NgFloat.valueOf((float)4))) == dResult);
    assertTrue(tc.unwrapToFloat(op.apply(NgLong.valueOf((long)18), NgFloat.valueOf((float)4))) == dResult);
    assertTrue(tc.unwrapToFloat(op.apply(NgFloat.valueOf((float)18), NgFloat.valueOf((float)4))) == dResult);
    assertTrue(tc.unwrapToDouble(op.apply(NgDouble.valueOf((double)18), NgFloat.valueOf((float)4))) == dResult);
    assertTrue(tc.unwrapToFloat(op.apply(BigInteger.valueOf(18), NgFloat.valueOf((float)4))) == dResult);
    assertTrue(((BigDecimal)op.apply(BigDecimal.valueOf(18), NgFloat.valueOf((float)4))).doubleValue() == dResult);

    assertTrue(tc.unwrapToFloat(op.apply((Object)NgByte.valueOf((byte)18), (Object)NgFloat.valueOf((float)4))) == dResult);
    assertTrue(tc.unwrapToFloat(op.apply((Object)NgChar.valueOf((char)18), (Object)NgFloat.valueOf((float)4))) == dResult);
    assertTrue(tc.unwrapToFloat(op.apply((Object)NgShort.valueOf((short)18), (Object)NgFloat.valueOf((float)4))) == dResult);
    assertTrue(tc.unwrapToFloat(op.apply((Object)NgInt.valueOf((int)18), (Object)NgFloat.valueOf((float)4))) == dResult);
    assertTrue(tc.unwrapToFloat(op.apply((Object)NgLong.valueOf((long)18), (Object)NgFloat.valueOf((float)4))) == dResult);
    assertTrue(tc.unwrapToFloat(op.apply((Object)NgFloat.valueOf((float)18), (Object)NgFloat.valueOf((float)4))) == dResult);
    assertTrue(tc.unwrapToDouble(op.apply((Object)NgDouble.valueOf((double)18), (Object)NgFloat.valueOf((float)4))) == dResult);
    assertTrue(tc.unwrapToFloat(op.apply((Object)BigInteger.valueOf(18), (Object)NgFloat.valueOf((float)4))) == dResult);
    assertTrue(((BigDecimal)op.apply((Object)BigDecimal.valueOf(18), (Object)NgFloat.valueOf((float)4))).doubleValue() == dResult);

    assertTrue(tc.unwrapToFloat(op.apply((Object)NgByte.valueOf((byte)18), floatMetaClass, (Object)NgFloat.valueOf((float)4))) == dResult);
    assertTrue(tc.unwrapToFloat(op.apply((Object)NgChar.valueOf((char)18), floatMetaClass, (Object)NgFloat.valueOf((float)4))) == dResult);
    assertTrue(tc.unwrapToFloat(op.apply((Object)NgShort.valueOf((short)18), floatMetaClass, (Object)NgFloat.valueOf((float)4))) == dResult);
    assertTrue(tc.unwrapToFloat(op.apply((Object)NgInt.valueOf((int)18), floatMetaClass, (Object)NgFloat.valueOf((float)4))) == dResult);
    assertTrue(tc.unwrapToFloat(op.apply((Object)NgLong.valueOf((long)18), floatMetaClass, (Object)NgFloat.valueOf((float)4))) == dResult);
    assertTrue(tc.unwrapToFloat(op.apply((Object)NgFloat.valueOf((float)18), floatMetaClass, (Object)NgFloat.valueOf((float)4))) == dResult);
    assertTrue(tc.unwrapToDouble(op.apply((Object)NgDouble.valueOf((double)18), floatMetaClass, (Object)NgFloat.valueOf((float)4))) == dResult);
    assertTrue(tc.unwrapToFloat(op.apply((Object)BigInteger.valueOf(18), floatMetaClass, (Object)NgFloat.valueOf((float)4))) == dResult);
    assertTrue(((BigDecimal)op.apply((Object)BigDecimal.valueOf(18), floatMetaClass, (Object)NgFloat.valueOf((float)4))).doubleValue() == dResult);

    assertTrue(op.doubleApply((byte)18, (double)4) == dResult);
    assertTrue(op.doubleApply((char)18, (double)4) == dResult);
    assertTrue(op.doubleApply((short)18, (double)4) == dResult);
    assertTrue(op.doubleApply((int)18, (double)4) == dResult);
    assertTrue(op.doubleApply((long)18, (double)4) == dResult);
    assertTrue(op.doubleApply((float)18, (double)4) == dResult);
    assertTrue(op.doubleApply((double)18, (double)4) == dResult);
    assertTrue(op.doubleApply(BigInteger.valueOf(18), (double)4) == dResult);
    assertTrue(op.bigDecimalApply(BigDecimal.valueOf(18), (double)4).doubleValue() == dResult);

    assertTrue(tc.unwrapToDouble(op.apply((byte)18, (double)4)) == dResult);
    assertTrue(tc.unwrapToDouble(op.apply((char)18, (double)4)) == dResult);
    assertTrue(tc.unwrapToDouble(op.apply((short)18, (double)4)) == dResult);
    assertTrue(tc.unwrapToDouble(op.apply((int)18, (double)4)) == dResult);
    assertTrue(tc.unwrapToDouble(op.apply((long)18, (double)4)) == dResult);
    assertTrue(tc.unwrapToDouble(op.apply((float)18, (double)4)) == dResult);
    assertTrue(tc.unwrapToDouble(op.apply((double)18, (double)4)) == dResult);
    assertTrue(tc.unwrapToDouble(op.apply(BigInteger.valueOf(18), (double)4)) == dResult);
    assertTrue(((BigDecimal)op.apply(BigDecimal.valueOf(18), (double)4)).doubleValue() == dResult);

    assertTrue(tc.unwrapToDouble(op.apply(NgByte.valueOf((byte)18), (double)4)) == dResult);
    assertTrue(tc.unwrapToDouble(op.apply(NgChar.valueOf((char)18), (double)4)) == dResult);
    assertTrue(tc.unwrapToDouble(op.apply(NgShort.valueOf((short)18), (double)4)) == dResult);
    assertTrue(tc.unwrapToDouble(op.apply(NgInt.valueOf((int)18), (double)4)) == dResult);
    assertTrue(tc.unwrapToDouble(op.apply(NgLong.valueOf((long)18), (double)4)) == dResult);
    assertTrue(tc.unwrapToDouble(op.apply(NgFloat.valueOf((float)18), (double)4)) == dResult);
    assertTrue(tc.unwrapToDouble(op.apply(NgDouble.valueOf((double)18), (double)4)) == dResult);

    assertTrue(tc.unwrapToDouble(op.apply((Object)NgByte.valueOf((byte)18), (double)4)) == dResult);
    assertTrue(tc.unwrapToDouble(op.apply((Object)NgChar.valueOf((char)18), (double)4)) == dResult);
    assertTrue(tc.unwrapToDouble(op.apply((Object)NgShort.valueOf((short)18), (double)4)) == dResult);
    assertTrue(tc.unwrapToDouble(op.apply((Object)NgInt.valueOf((int)18), (double)4)) == dResult);
    assertTrue(tc.unwrapToDouble(op.apply((Object)NgLong.valueOf((long)18), (double)4)) == dResult);
    assertTrue(tc.unwrapToDouble(op.apply((Object)NgFloat.valueOf((float)18), (double)4)) == dResult);
    assertTrue(tc.unwrapToDouble(op.apply((Object)NgDouble.valueOf((double)18), (double)4)) == dResult);
    assertTrue(tc.unwrapToDouble(op.apply((Object)BigInteger.valueOf(18), (double)4)) == dResult);
    assertTrue(((BigDecimal)op.apply((Object)BigDecimal.valueOf(18), (double)4)).doubleValue() == dResult);

    assertTrue(tc.unwrapToDouble(op.apply((byte)18, NgDouble.valueOf((double)4))) == dResult);
    assertTrue(tc.unwrapToDouble(op.apply((char)18, NgDouble.valueOf((double)4))) == dResult);
    assertTrue(tc.unwrapToDouble(op.apply((short)18, NgDouble.valueOf((double)4))) == dResult);
    assertTrue(tc.unwrapToDouble(op.apply((int)18, NgDouble.valueOf((double)4))) == dResult);
    assertTrue(tc.unwrapToDouble(op.apply((long)18, NgDouble.valueOf((double)4))) == dResult);
    assertTrue(tc.unwrapToDouble(op.apply((float)18, NgDouble.valueOf((double)4))) == dResult);
    assertTrue(tc.unwrapToDouble(op.apply((double)18, NgDouble.valueOf((double)4))) == dResult);
    assertTrue(tc.unwrapToDouble(op.apply(BigInteger.valueOf(18), NgDouble.valueOf((double)4))) == dResult);
    assertTrue(((BigDecimal)op.apply(BigDecimal.valueOf(18), NgDouble.valueOf((double)4))).doubleValue() == dResult);

    assertTrue(tc.unwrapToDouble(op.apply((byte)18, (Object)NgDouble.valueOf((double)4))) == dResult);
    assertTrue(tc.unwrapToDouble(op.apply((char)18, (Object)NgDouble.valueOf((double)4))) == dResult);
    assertTrue(tc.unwrapToDouble(op.apply((short)18, (Object)NgDouble.valueOf((double)4))) == dResult);
    assertTrue(tc.unwrapToDouble(op.apply((int)18, (Object)NgDouble.valueOf((double)4))) == dResult);
    assertTrue(tc.unwrapToDouble(op.apply((long)18, (Object)NgDouble.valueOf((double)4))) == dResult);
    assertTrue(tc.unwrapToDouble(op.apply((float)18, (Object)NgDouble.valueOf((double)4))) == dResult);
    assertTrue(tc.unwrapToDouble(op.apply((double)18, (Object)NgDouble.valueOf((double)4))) == dResult);
    assertTrue(tc.unwrapToDouble(op.apply(BigInteger.valueOf(18), (Object)NgDouble.valueOf((double)4))) == dResult);
    assertTrue(((BigDecimal)op.apply(BigDecimal.valueOf(18), (Object)NgDouble.valueOf((double)4))).doubleValue() == dResult);

    assertTrue(tc.unwrapToDouble(op.apply(NgByte.valueOf((byte)18), NgDouble.valueOf((double)4))) == dResult);
    assertTrue(tc.unwrapToDouble(op.apply(NgChar.valueOf((char)18), NgDouble.valueOf((double)4))) == dResult);
    assertTrue(tc.unwrapToDouble(op.apply(NgShort.valueOf((short)18), NgDouble.valueOf((double)4))) == dResult);
    assertTrue(tc.unwrapToDouble(op.apply(NgInt.valueOf((int)18), NgDouble.valueOf((double)4))) == dResult);
    assertTrue(tc.unwrapToDouble(op.apply(NgLong.valueOf((long)18), NgDouble.valueOf((double)4))) == dResult);
    assertTrue(tc.unwrapToDouble(op.apply(NgFloat.valueOf((float)18), NgDouble.valueOf((double)4))) == dResult);
    assertTrue(tc.unwrapToDouble(op.apply(NgDouble.valueOf((double)18), NgDouble.valueOf((double)4))) == dResult);
    assertTrue(tc.unwrapToDouble(op.apply(BigInteger.valueOf(18), NgDouble.valueOf((double)4))) == dResult);
    assertTrue(((BigDecimal)op.apply(BigDecimal.valueOf(18), NgDouble.valueOf((double)4))).doubleValue() == dResult);

    assertTrue(tc.unwrapToDouble(op.apply((Object)NgByte.valueOf((byte)18), (Object)NgDouble.valueOf((double)4))) == dResult);
    assertTrue(tc.unwrapToDouble(op.apply((Object)NgChar.valueOf((char)18), (Object)NgDouble.valueOf((double)4))) == dResult);
    assertTrue(tc.unwrapToDouble(op.apply((Object)NgShort.valueOf((short)18), (Object)NgDouble.valueOf((double)4))) == dResult);
    assertTrue(tc.unwrapToDouble(op.apply((Object)NgInt.valueOf((int)18), (Object)NgDouble.valueOf((double)4))) == dResult);
    assertTrue(tc.unwrapToDouble(op.apply((Object)NgLong.valueOf((long)18), (Object)NgDouble.valueOf((double)4))) == dResult);
    assertTrue(tc.unwrapToDouble(op.apply((Object)NgFloat.valueOf((float)18), (Object)NgDouble.valueOf((double)4))) == dResult);
    assertTrue(tc.unwrapToDouble(op.apply((Object)NgDouble.valueOf((double)18), (Object)NgDouble.valueOf((double)4))) == dResult);
    assertTrue(tc.unwrapToDouble(op.apply((Object)BigInteger.valueOf(18), (Object)NgDouble.valueOf((double)4))) == dResult);
    assertTrue(((BigDecimal)op.apply((Object)BigDecimal.valueOf(18), (Object)NgDouble.valueOf((double)4))).doubleValue() == dResult);

    assertTrue(tc.unwrapToDouble(op.apply((Object)NgByte.valueOf((byte)18), doubleMetaClass, (Object)NgDouble.valueOf((double)4))) == dResult);
    assertTrue(tc.unwrapToDouble(op.apply((Object)NgChar.valueOf((char)18), doubleMetaClass, (Object)NgDouble.valueOf((double)4))) == dResult);
    assertTrue(tc.unwrapToDouble(op.apply((Object)NgShort.valueOf((short)18), doubleMetaClass, (Object)NgDouble.valueOf((double)4))) == dResult);
    assertTrue(tc.unwrapToDouble(op.apply((Object)NgInt.valueOf((int)18), doubleMetaClass, (Object)NgDouble.valueOf((double)4))) == dResult);
    assertTrue(tc.unwrapToDouble(op.apply((Object)NgLong.valueOf((long)18), doubleMetaClass, (Object)NgDouble.valueOf((double)4))) == dResult);
    assertTrue(tc.unwrapToDouble(op.apply((Object)NgFloat.valueOf((float)18), doubleMetaClass, (Object)NgDouble.valueOf((double)4))) == dResult);
    assertTrue(tc.unwrapToDouble(op.apply((Object)NgDouble.valueOf((double)18), doubleMetaClass, (Object)NgDouble.valueOf((double)4))) == dResult);
    assertTrue(tc.unwrapToDouble(op.apply((Object)BigInteger.valueOf(18), doubleMetaClass, (Object)NgDouble.valueOf((double)4))) == dResult);
    assertTrue(((BigDecimal)op.apply((Object)BigDecimal.valueOf(18), doubleMetaClass, (Object)NgDouble.valueOf((double)4))).doubleValue() == dResult);

    assertTrue(op.bigIntegerApply((byte)18, BigInteger.valueOf(4)).longValue() == iResult);
    assertTrue(op.bigIntegerApply((char)18, BigInteger.valueOf(4)).longValue() == iResult);
    assertTrue(op.bigIntegerApply((short)18, BigInteger.valueOf(4)).longValue() == iResult);
    assertTrue(op.bigIntegerApply((int)18, BigInteger.valueOf(4)).longValue() == iResult);
    assertTrue(op.bigIntegerApply((long)18, BigInteger.valueOf(4)).longValue() == iResult);
    assertTrue(op.floatApply((float)18, BigInteger.valueOf(4)) == dResult);
    assertTrue(op.doubleApply((double)18, BigInteger.valueOf(4)) == dResult);
    assertTrue(op.bigIntegerApply(BigInteger.valueOf(18), BigInteger.valueOf(4)).longValue() == iResult);
    assertTrue(op.bigDecimalApply(BigDecimal.valueOf(18), BigInteger.valueOf(4)).doubleValue() == dResult);

    assertTrue(((BigInteger)op.apply((byte)18, BigInteger.valueOf(4))).longValue() == iResult);
    assertTrue(((BigInteger)op.apply((char)18, BigInteger.valueOf(4))).longValue() == iResult);
    assertTrue(((BigInteger)op.apply((short)18, BigInteger.valueOf(4))).longValue() == iResult);
    assertTrue(((BigInteger)op.apply((int)18, BigInteger.valueOf(4))).longValue() == iResult);
    assertTrue(((BigInteger)op.apply((long)18, BigInteger.valueOf(4))).longValue() == iResult);
    assertTrue(tc.unwrapToFloat(op.apply((float)18, BigInteger.valueOf(4))) == dResult);
    assertTrue(tc.unwrapToDouble(op.apply((double)18, BigInteger.valueOf(4))) == dResult);
    assertTrue(((BigInteger)op.apply(BigInteger.valueOf(18), BigInteger.valueOf(4))).longValue() == iResult);
    assertTrue(((BigDecimal)op.apply(BigDecimal.valueOf(18), BigInteger.valueOf(4))).doubleValue() == dResult);

    assertTrue(((BigInteger)op.apply(NgByte.valueOf((byte)18), BigInteger.valueOf(4))).longValue() == iResult);
    assertTrue(((BigInteger)op.apply(NgChar.valueOf((char)18), BigInteger.valueOf(4))).longValue() == iResult);
    assertTrue(((BigInteger)op.apply(NgShort.valueOf((short)18), BigInteger.valueOf(4))).longValue() == iResult);
    assertTrue(((BigInteger)op.apply(NgInt.valueOf((int)18), BigInteger.valueOf(4))).longValue() == iResult);
    assertTrue(((BigInteger)op.apply(NgLong.valueOf((long)18), BigInteger.valueOf(4))).longValue() == iResult);
    assertTrue(tc.unwrapToFloat(op.apply(NgFloat.valueOf((float)18), BigInteger.valueOf(4))) == dResult);
    assertTrue(tc.unwrapToDouble(op.apply(NgDouble.valueOf((double)18), BigInteger.valueOf(4))) == dResult);

    assertTrue(((BigInteger)op.apply((Object)NgByte.valueOf((byte)18), BigInteger.valueOf(4))).longValue() == iResult);
    assertTrue(((BigInteger)op.apply((Object)NgChar.valueOf((char)18), BigInteger.valueOf(4))).longValue() == iResult);
    assertTrue(((BigInteger)op.apply((Object)NgShort.valueOf((short)18), BigInteger.valueOf(4))).longValue() == iResult);
    assertTrue(((BigInteger)op.apply((Object)NgInt.valueOf((int)18), BigInteger.valueOf(4))).longValue() == iResult);
    assertTrue(((BigInteger)op.apply((Object)NgLong.valueOf((long)18), BigInteger.valueOf(4))).longValue() == iResult);
    assertTrue(tc.unwrapToFloat(op.apply((Object)NgFloat.valueOf((float)18), BigInteger.valueOf(4))) == dResult);
    assertTrue(tc.unwrapToDouble(op.apply((Object)NgDouble.valueOf((double)18), BigInteger.valueOf(4))) == dResult);
    assertTrue(((BigInteger)op.apply((Object)BigInteger.valueOf(18), BigInteger.valueOf(4))).longValue() == iResult);
    assertTrue(((BigDecimal)op.apply((Object)BigDecimal.valueOf(18), BigInteger.valueOf(4))).doubleValue() == dResult);

    assertTrue(((BigInteger)op.apply((Object)NgByte.valueOf((byte)18), (Object)BigInteger.valueOf(4))).longValue() == iResult);
    assertTrue(((BigInteger)op.apply((Object)NgChar.valueOf((char)18), (Object)BigInteger.valueOf(4))).longValue() == iResult);
    assertTrue(((BigInteger)op.apply((Object)NgShort.valueOf((short)18), (Object)BigInteger.valueOf(4))).longValue() == iResult);
    assertTrue(((BigInteger)op.apply((Object)NgInt.valueOf((int)18), (Object)BigInteger.valueOf(4))).longValue() == iResult);
    assertTrue(((BigInteger)op.apply((Object)NgLong.valueOf((long)18), (Object)BigInteger.valueOf(4))).longValue() == iResult);
    assertTrue(tc.unwrapToFloat(op.apply((Object)NgFloat.valueOf((float)18), (Object)BigInteger.valueOf(4))) == dResult);
    assertTrue(tc.unwrapToDouble(op.apply((Object)NgDouble.valueOf((double)18), (Object)BigInteger.valueOf(4))) == dResult);
    assertTrue(((BigInteger)op.apply((Object)BigInteger.valueOf(18), (Object)BigInteger.valueOf(4))).longValue() == iResult);
    assertTrue(((BigDecimal)op.apply((Object)BigDecimal.valueOf(18), (Object)BigInteger.valueOf(4))).doubleValue() == dResult);

    assertTrue(((BigInteger)op.apply((Object)NgByte.valueOf((byte)18), bigIntegerMetaClass, (Object)BigInteger.valueOf(4))).longValue() == iResult);
    assertTrue(((BigInteger)op.apply((Object)NgChar.valueOf((char)18), bigIntegerMetaClass, (Object)BigInteger.valueOf(4))).longValue() == iResult);
    assertTrue(((BigInteger)op.apply((Object)NgShort.valueOf((short)18), bigIntegerMetaClass, (Object)BigInteger.valueOf(4))).longValue() == iResult);
    assertTrue(((BigInteger)op.apply((Object)NgInt.valueOf((int)18), bigIntegerMetaClass, (Object)BigInteger.valueOf(4))).longValue() == iResult);
    assertTrue(((BigInteger)op.apply((Object)NgLong.valueOf((long)18), bigIntegerMetaClass, (Object)BigInteger.valueOf(4))).longValue() == iResult);
    assertTrue(tc.unwrapToFloat(op.apply((Object)NgFloat.valueOf((float)18), bigIntegerMetaClass, (Object)BigInteger.valueOf(4))) == dResult);
    assertTrue(tc.unwrapToDouble(op.apply((Object)NgDouble.valueOf((double)18), bigIntegerMetaClass, (Object)BigInteger.valueOf(4))) == dResult);
    assertTrue(((BigInteger)op.apply((Object)BigInteger.valueOf(18), bigIntegerMetaClass, (Object)BigInteger.valueOf(4))).longValue() == iResult);
    assertTrue(((BigDecimal)op.apply((Object)BigDecimal.valueOf(18), bigIntegerMetaClass, (Object)BigInteger.valueOf(4))).doubleValue() == dResult);

    assertTrue(op.bigDecimalApply((byte)18, BigDecimal.valueOf(4)).doubleValue() == dResult);
    assertTrue(op.bigDecimalApply((char)18, BigDecimal.valueOf(4)).doubleValue() == dResult);
    assertTrue(op.bigDecimalApply((short)18, BigDecimal.valueOf(4)).doubleValue() == dResult);
    assertTrue(op.bigDecimalApply((int)18, BigDecimal.valueOf(4)).doubleValue() == dResult);
    assertTrue(op.bigDecimalApply((long)18, BigDecimal.valueOf(4)).doubleValue() == dResult);
    assertTrue(op.bigDecimalApply((float)18, BigDecimal.valueOf(4)).doubleValue() == dResult);
    assertTrue(op.bigDecimalApply((double)18, BigDecimal.valueOf(4)).doubleValue() == dResult);
    assertTrue(op.bigDecimalApply(BigInteger.valueOf(18), BigDecimal.valueOf(4)).doubleValue() == dResult);
    assertTrue(op.bigDecimalApply(BigDecimal.valueOf(18), BigDecimal.valueOf(4)).doubleValue() == dResult);

    assertTrue(((BigDecimal)op.apply((byte)18, BigDecimal.valueOf(4))).doubleValue() == dResult);
    assertTrue(((BigDecimal)op.apply((char)18, BigDecimal.valueOf(4))).doubleValue() == dResult);
    assertTrue(((BigDecimal)op.apply((short)18, BigDecimal.valueOf(4))).doubleValue() == dResult);
    assertTrue(((BigDecimal)op.apply((int)18, BigDecimal.valueOf(4))).doubleValue() == dResult);
    assertTrue(((BigDecimal)op.apply((long)18, BigDecimal.valueOf(4))).doubleValue() == dResult);
    assertTrue(((BigDecimal)op.apply((float)18, BigDecimal.valueOf(4))).doubleValue() == dResult);
    assertTrue(((BigDecimal)op.apply((double)18, BigDecimal.valueOf(4))).doubleValue() == dResult);
    assertTrue(((BigDecimal)op.apply(BigInteger.valueOf(18), BigDecimal.valueOf(4))).doubleValue() == dResult);
    assertTrue(((BigDecimal)op.apply(BigDecimal.valueOf(18), BigDecimal.valueOf(4))).doubleValue() == dResult);

    assertTrue(((BigDecimal)op.apply((byte)18, (Object)BigDecimal.valueOf(4))).doubleValue() == dResult);
    assertTrue(((BigDecimal)op.apply((char)18, (Object)BigDecimal.valueOf(4))).doubleValue() == dResult);
    assertTrue(((BigDecimal)op.apply((short)18, (Object)BigDecimal.valueOf(4))).doubleValue() == dResult);
    assertTrue(((BigDecimal)op.apply((int)18, (Object)BigDecimal.valueOf(4))).doubleValue() == dResult);
    assertTrue(((BigDecimal)op.apply((long)18, (Object)BigDecimal.valueOf(4))).doubleValue() == dResult);
    assertTrue(((BigDecimal)op.apply((float)18, (Object)BigDecimal.valueOf(4))).doubleValue() == dResult);
    assertTrue(((BigDecimal)op.apply((double)18, (Object)BigDecimal.valueOf(4))).doubleValue() == dResult);
    assertTrue(((BigDecimal)op.apply(BigInteger.valueOf(18), (Object)BigDecimal.valueOf(4))).doubleValue() == dResult);
    assertTrue(((BigDecimal)op.apply(BigDecimal.valueOf(18), (Object)BigDecimal.valueOf(4))).doubleValue() == dResult);

    assertTrue(((BigDecimal)op.apply(NgByte.valueOf((byte)18), BigDecimal.valueOf(4))).doubleValue() == dResult);
    assertTrue(((BigDecimal)op.apply(NgChar.valueOf((char)18), BigDecimal.valueOf(4))).doubleValue() == dResult);
    assertTrue(((BigDecimal)op.apply(NgShort.valueOf((short)18), BigDecimal.valueOf(4))).doubleValue() == dResult);
    assertTrue(((BigDecimal)op.apply(NgInt.valueOf((int)18), BigDecimal.valueOf(4))).doubleValue() == dResult);
    assertTrue(((BigDecimal)op.apply(NgLong.valueOf((long)18), BigDecimal.valueOf(4))).doubleValue() == dResult);
    assertTrue(((BigDecimal)op.apply(NgFloat.valueOf((float)18), BigDecimal.valueOf(4))).doubleValue() == dResult);
    assertTrue(((BigDecimal)op.apply(NgDouble.valueOf((double)18), BigDecimal.valueOf(4))).doubleValue() == dResult);

    assertTrue(((BigDecimal)op.apply((Object)NgByte.valueOf((byte)18), BigDecimal.valueOf(4))).doubleValue() == dResult);
    assertTrue(((BigDecimal)op.apply((Object)NgChar.valueOf((char)18), BigDecimal.valueOf(4))).doubleValue() == dResult);
    assertTrue(((BigDecimal)op.apply((Object)NgShort.valueOf((short)18), BigDecimal.valueOf(4))).doubleValue() == dResult);
    assertTrue(((BigDecimal)op.apply((Object)NgInt.valueOf((int)18), BigDecimal.valueOf(4))).doubleValue() == dResult);
    assertTrue(((BigDecimal)op.apply((Object)NgLong.valueOf((long)18), BigDecimal.valueOf(4))).doubleValue() == dResult);
    assertTrue(((BigDecimal)op.apply((Object)NgFloat.valueOf((float)18), BigDecimal.valueOf(4))).doubleValue() == dResult);
    assertTrue(((BigDecimal)op.apply((Object)NgDouble.valueOf((double)18), BigDecimal.valueOf(4))).doubleValue() == dResult);
    assertTrue(((BigDecimal)op.apply((Object)BigInteger.valueOf(18), BigDecimal.valueOf(4))).doubleValue() == dResult);
    assertTrue(((BigDecimal)op.apply((Object)BigDecimal.valueOf(18), BigDecimal.valueOf(4))).doubleValue() == dResult);

    assertTrue(((BigDecimal)op.apply((Object)NgByte.valueOf((byte)18), (Object)BigDecimal.valueOf(4))).doubleValue() == dResult);
    assertTrue(((BigDecimal)op.apply((Object)NgChar.valueOf((char)18), (Object)BigDecimal.valueOf(4))).doubleValue() == dResult);
    assertTrue(((BigDecimal)op.apply((Object)NgShort.valueOf((short)18), (Object)BigDecimal.valueOf(4))).doubleValue() == dResult);
    assertTrue(((BigDecimal)op.apply((Object)NgInt.valueOf((int)18), (Object)BigDecimal.valueOf(4))).doubleValue() == dResult);
    assertTrue(((BigDecimal)op.apply((Object)NgLong.valueOf((long)18), (Object)BigDecimal.valueOf(4))).doubleValue() == dResult);
    assertTrue(((BigDecimal)op.apply((Object)NgFloat.valueOf((float)18), (Object)BigDecimal.valueOf(4))).doubleValue() == dResult);
    assertTrue(((BigDecimal)op.apply((Object)NgDouble.valueOf((double)18), (Object)BigDecimal.valueOf(4))).doubleValue() == dResult);
    assertTrue(((BigDecimal)op.apply((Object)BigInteger.valueOf(18), (Object)BigDecimal.valueOf(4))).doubleValue() == dResult);
    assertTrue(((BigDecimal)op.apply((Object)BigDecimal.valueOf(18), (Object)BigDecimal.valueOf(4))).doubleValue() == dResult);

    assertTrue(((BigDecimal)op.apply((Object)NgByte.valueOf((byte)18), bigDecimalMetaClass, (Object)BigDecimal.valueOf(4))).doubleValue() == dResult);
    assertTrue(((BigDecimal)op.apply((Object)NgChar.valueOf((char)18), bigDecimalMetaClass, (Object)BigDecimal.valueOf(4))).doubleValue() == dResult);
    assertTrue(((BigDecimal)op.apply((Object)NgShort.valueOf((short)18), bigDecimalMetaClass, (Object)BigDecimal.valueOf(4))).doubleValue() == dResult);
    assertTrue(((BigDecimal)op.apply((Object)NgInt.valueOf((int)18), bigDecimalMetaClass, (Object)BigDecimal.valueOf(4))).doubleValue() == dResult);
    assertTrue(((BigDecimal)op.apply((Object)NgLong.valueOf((long)18), bigDecimalMetaClass, (Object)BigDecimal.valueOf(4))).doubleValue() == dResult);
    assertTrue(((BigDecimal)op.apply((Object)NgFloat.valueOf((float)18), bigDecimalMetaClass, (Object)BigDecimal.valueOf(4))).doubleValue() == dResult);
    assertTrue(((BigDecimal)op.apply((Object)NgDouble.valueOf((double)18), bigDecimalMetaClass, (Object)BigDecimal.valueOf(4))).doubleValue() == dResult);
    assertTrue(((BigDecimal)op.apply((Object)BigInteger.valueOf(18), bigDecimalMetaClass, (Object)BigDecimal.valueOf(4))).doubleValue() == dResult);
    assertTrue(((BigDecimal)op.apply((Object)BigDecimal.valueOf(18), bigDecimalMetaClass, (Object)BigDecimal.valueOf(4))).doubleValue() == dResult);
  }

  public void testAdd() throws Throwable {
    final ExtendedThreadContext tc = (ExtendedThreadContext)ThreadContext.getThreadContext();
    doTest(tc, tc.add(), 22, 22.0);
  }

  public void testSubtract() throws Throwable {
    final ExtendedThreadContext tc = (ExtendedThreadContext)ThreadContext.getThreadContext();
    doTest(tc, tc.subtract(), 14, 14.0);
  }

  public void testMultiply() throws Throwable {
    final ExtendedThreadContext tc = (ExtendedThreadContext)ThreadContext.getThreadContext();
    doTest(tc, tc.multiply(), 72, 72.0);
  }

  public void testDivide() throws Throwable {
    final ExtendedThreadContext tc = (ExtendedThreadContext)ThreadContext.getThreadContext();
    doTest(tc, tc.divide(), 4, 4.5);
  }

  public void testModulo() throws Throwable {
    final ExtendedThreadContext tc = (ExtendedThreadContext)ThreadContext.getThreadContext();
    doTest(tc, tc.modulo(), 4, 4.0);
  }
  public void testRemainderDivide() throws Throwable {
    final ExtendedThreadContext tc = (ExtendedThreadContext)ThreadContext.getThreadContext();
    doTest(tc, tc.remainderDivide(), 2, 2.0);
  }
}