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

    assertTrue(tc.unwrapToInt(op.apply(tc.wrap((byte)18), (byte)4)) == iResult);
    assertTrue(tc.unwrapToInt(op.apply(tc.wrap((char)18), (byte)4)) == iResult);
    assertTrue(tc.unwrapToInt(op.apply(tc.wrap((short)18), (byte)4)) == iResult);
    assertTrue(tc.unwrapToInt(op.apply(tc.wrap(18), (byte)4)) == iResult);
    assertTrue(tc.unwrapToLong(op.apply(tc.wrap((long)18), (byte)4)) == iResult);
    assertTrue(tc.unwrapToFloat(op.apply(tc.wrap((float)18), (byte)4)) == dResult);
    assertTrue(tc.unwrapToDouble(op.apply(tc.wrap((double)18), (byte)4)) == dResult);

    assertTrue(tc.unwrapToInt(op.apply(tc.wrap((byte)18), (byte)4)) == iResult);
    assertTrue(tc.unwrapToInt(op.apply(tc.wrap((char)18), (byte)4)) == iResult);
    assertTrue(tc.unwrapToInt(op.apply(tc.wrap((short)18), (byte)4)) == iResult);
    assertTrue(tc.unwrapToInt(op.apply(tc.wrap(18), (byte)4)) == iResult);
    assertTrue(tc.unwrapToLong(op.apply(tc.wrap((long)18), (byte)4)) == iResult);
    assertTrue(tc.unwrapToFloat(op.apply(tc.wrap((float)18), (byte)4)) == dResult);
    assertTrue(tc.unwrapToDouble(op.apply(tc.wrap((double)18), (byte)4)) == dResult);
    assertTrue(((BigInteger)op.apply((Object)BigInteger.valueOf(18), (byte)4)).longValue() == iResult);
    assertTrue(((BigDecimal)op.apply((Object)BigDecimal.valueOf(18), (byte)4)).doubleValue() == dResult);

    assertTrue(tc.unwrapToInt(op.apply((byte)18, tc.wrap((byte)4))) == iResult);
    assertTrue(tc.unwrapToInt(op.apply((char)18, tc.wrap((byte)4))) == iResult);
    assertTrue(tc.unwrapToInt(op.apply((short)18, tc.wrap((byte)4))) == iResult);
    assertTrue(tc.unwrapToInt(op.apply(18, tc.wrap((byte)4))) == iResult);
    assertTrue(tc.unwrapToLong(op.apply((long)18, tc.wrap((byte)4))) == iResult);
    assertTrue(tc.unwrapToFloat(op.apply((float)18, tc.wrap((byte)4))) == dResult);
    assertTrue(tc.unwrapToDouble(op.apply((double)18, tc.wrap((byte)4))) == dResult);
    assertTrue(((BigInteger)op.apply(BigInteger.valueOf(18), tc.wrap((byte)4))).longValue() == iResult);
    assertTrue(((BigDecimal)op.apply(BigDecimal.valueOf(18), tc.wrap((byte)4))).doubleValue() == dResult);

    assertTrue(tc.unwrapToInt(op.apply((byte)18, tc.wrap((byte)4))) == iResult);
    assertTrue(tc.unwrapToInt(op.apply((char)18, tc.wrap((byte)4))) == iResult);
    assertTrue(tc.unwrapToInt(op.apply((short)18, tc.wrap((byte)4))) == iResult);
    assertTrue(tc.unwrapToInt(op.apply(18, tc.wrap((byte)4))) == iResult);
    assertTrue(tc.unwrapToLong(op.apply((long)18, (Object)tc.wrap((byte)4))) == iResult);
    assertTrue(tc.unwrapToFloat(op.apply((float)18, (Object)tc.wrap((byte)4))) == dResult);
    assertTrue(tc.unwrapToDouble(op.apply((double)18, (Object)tc.wrap((byte)4))) == dResult);
    assertTrue(((BigInteger)op.apply(BigInteger.valueOf(18), tc.wrap((byte)4))).longValue() == iResult);
    assertTrue(((BigDecimal)op.apply(BigDecimal.valueOf(18), tc.wrap((byte)4))).doubleValue() == dResult);

    assertTrue(tc.unwrapToInt(op.apply(tc.wrap((byte)18), tc.wrap((byte)4))) == iResult);
    assertTrue(tc.unwrapToInt(op.apply(tc.wrap((char)18), tc.wrap((byte)4))) == iResult);
    assertTrue(tc.unwrapToInt(op.apply(tc.wrap((short)18), tc.wrap((byte)4))) == iResult);
    assertTrue(tc.unwrapToInt(op.apply(tc.wrap(18), tc.wrap((byte)4))) == iResult);
    assertTrue(tc.unwrapToLong(op.apply(tc.wrap((long)18), tc.wrap((byte)4))) == iResult);
    assertTrue(tc.unwrapToFloat(op.apply(tc.wrap((float)18), tc.wrap((byte)4))) == dResult);
    assertTrue(tc.unwrapToDouble(op.apply(tc.wrap((double)18), tc.wrap((byte)4))) == dResult);
    assertTrue(((BigInteger)op.apply(BigInteger.valueOf(18), tc.wrap((byte)4))).longValue() == iResult);
    assertTrue(((BigDecimal)op.apply(BigDecimal.valueOf(18), tc.wrap((byte)4))).doubleValue() == dResult);

    assertTrue(tc.unwrapToInt(op.apply(tc.wrap((byte)18), tc.wrap((byte)4))) == iResult);
    assertTrue(tc.unwrapToInt(op.apply(tc.wrap((char)18), tc.wrap((byte)4))) == iResult);
    assertTrue(tc.unwrapToInt(op.apply(tc.wrap((short)18), tc.wrap((byte)4))) == iResult);
    assertTrue(tc.unwrapToInt(op.apply(tc.wrap(18), tc.wrap((byte)4))) == iResult);
    assertTrue(tc.unwrapToLong(op.apply(tc.wrap((long)18), tc.wrap((byte)4))) == iResult);
    assertTrue(tc.unwrapToFloat(op.apply(tc.wrap((float)18), tc.wrap((byte)4))) == dResult);
    assertTrue(tc.unwrapToDouble(op.apply(tc.wrap((double)18), tc.wrap((byte)4))) == dResult);
    assertTrue(((BigInteger)op.apply((Object)BigInteger.valueOf(18), (Object)tc.wrap((byte)4))).longValue() == iResult);
    assertTrue(((BigDecimal)op.apply((Object)BigDecimal.valueOf(18), (Object)tc.wrap((byte)4))).doubleValue() == dResult);

    assertTrue(tc.unwrapToInt(op.apply(tc.wrap((byte)18), byteMetaClass, tc.wrap((byte)4))) == iResult);
    assertTrue(tc.unwrapToInt(op.apply(tc.wrap((char)18), byteMetaClass, tc.wrap((byte)4))) == iResult);
    assertTrue(tc.unwrapToInt(op.apply(tc.wrap((short)18), byteMetaClass, tc.wrap((byte)4))) == iResult);
    assertTrue(tc.unwrapToInt(op.apply(tc.wrap(18), byteMetaClass, tc.wrap((byte)4))) == iResult);
    assertTrue(tc.unwrapToLong(op.apply(tc.wrap((long)18), byteMetaClass, tc.wrap((byte)4))) == iResult);
    assertTrue(tc.unwrapToFloat(op.apply(tc.wrap((float)18), byteMetaClass, tc.wrap((byte)4))) == dResult);
    assertTrue(tc.unwrapToDouble(op.apply(tc.wrap((double)18), byteMetaClass, tc.wrap((byte)4))) == dResult);
    assertTrue(((BigInteger)op.apply((Object)BigInteger.valueOf(18), byteMetaClass, (Object)tc.wrap((byte)4))).longValue() == iResult);
    assertTrue(((BigDecimal)op.apply((Object)BigDecimal.valueOf(18), byteMetaClass, (Object)tc.wrap((byte)4))).doubleValue() == dResult);

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

    assertTrue(tc.unwrapToInt(op.apply(tc.wrap((byte)18), (char)4)) == iResult);
    assertTrue(tc.unwrapToInt(op.apply(tc.wrap((char)18), (char)4)) == iResult);
    assertTrue(tc.unwrapToInt(op.apply(tc.wrap((short)18), (char)4)) == iResult);
    assertTrue(tc.unwrapToInt(op.apply(tc.wrap(18), (char)4)) == iResult);
    assertTrue(tc.unwrapToLong(op.apply(tc.wrap((long)18), (char)4)) == iResult);
    assertTrue(tc.unwrapToFloat(op.apply(tc.wrap((float)18), (char)4)) == dResult);
    assertTrue(tc.unwrapToDouble(op.apply(tc.wrap((double)18), (char)4)) == dResult);

    assertTrue(tc.unwrapToInt(op.apply(tc.wrap((byte)18), (char)4)) == iResult);
    assertTrue(tc.unwrapToInt(op.apply(tc.wrap((char)18), (char)4)) == iResult);
    assertTrue(tc.unwrapToInt(op.apply(tc.wrap((short)18), (char)4)) == iResult);
    assertTrue(tc.unwrapToInt(op.apply(tc.wrap(18), (char)4)) == iResult);
    assertTrue(tc.unwrapToLong(op.apply(tc.wrap((long)18), (char)4)) == iResult);
    assertTrue(tc.unwrapToFloat(op.apply(tc.wrap((float)18), (char)4)) == dResult);
    assertTrue(tc.unwrapToDouble(op.apply(tc.wrap((double)18), (char)4)) == dResult);
    assertTrue(((BigInteger)op.apply((Object)BigInteger.valueOf(18), (char)4)).longValue() == iResult);
    assertTrue(((BigDecimal)op.apply((Object)BigDecimal.valueOf(18), (char)4)).doubleValue() == dResult);

    assertTrue(tc.unwrapToInt(op.apply((byte)18, tc.wrap((char)4))) == iResult);
    assertTrue(tc.unwrapToInt(op.apply((char)18, tc.wrap((char)4))) == iResult);
    assertTrue(tc.unwrapToInt(op.apply((short)18, tc.wrap((char)4))) == iResult);
    assertTrue(tc.unwrapToInt(op.apply(18, tc.wrap((char)4))) == iResult);
    assertTrue(tc.unwrapToLong(op.apply((long)18, tc.wrap((char)4))) == iResult);
    assertTrue(tc.unwrapToFloat(op.apply((float)18, tc.wrap((char)4))) == dResult);
    assertTrue(tc.unwrapToDouble(op.apply((double)18, tc.wrap((char)4))) == dResult);
    assertTrue(((BigInteger)op.apply(BigInteger.valueOf(18), tc.wrap((char)4))).longValue() == iResult);
    assertTrue(((BigDecimal)op.apply(BigDecimal.valueOf(18), tc.wrap((char)4))).doubleValue() == dResult);

    assertTrue(tc.unwrapToInt(op.apply((byte)18, tc.wrap((char)4))) == iResult);
    assertTrue(tc.unwrapToInt(op.apply((char)18, tc.wrap((char)4))) == iResult);
    assertTrue(tc.unwrapToInt(op.apply((short)18, tc.wrap((char)4))) == iResult);
    assertTrue(tc.unwrapToInt(op.apply(18, tc.wrap((char)4))) == iResult);
    assertTrue(tc.unwrapToLong(op.apply((long)18, (Object)tc.wrap((char)4))) == iResult);
    assertTrue(tc.unwrapToFloat(op.apply((float)18, (Object)tc.wrap((char)4))) == dResult);
    assertTrue(tc.unwrapToDouble(op.apply((double)18, (Object)tc.wrap((char)4))) == dResult);
    assertTrue(((BigInteger)op.apply(BigInteger.valueOf(18), tc.wrap((char)4))).longValue() == iResult);
    assertTrue(((BigDecimal)op.apply(BigDecimal.valueOf(18), tc.wrap((char)4))).doubleValue() == dResult);

    assertTrue(tc.unwrapToInt(op.apply(tc.wrap((byte)18), tc.wrap((char)4))) == iResult);
    assertTrue(tc.unwrapToInt(op.apply(tc.wrap((char)18), tc.wrap((char)4))) == iResult);
    assertTrue(tc.unwrapToInt(op.apply(tc.wrap((short)18), tc.wrap((char)4))) == iResult);
    assertTrue(tc.unwrapToInt(op.apply(tc.wrap(18), tc.wrap((char)4))) == iResult);
    assertTrue(tc.unwrapToLong(op.apply(tc.wrap((long)18), tc.wrap((char)4))) == iResult);
    assertTrue(tc.unwrapToFloat(op.apply(tc.wrap((float)18), tc.wrap((char)4))) == dResult);
    assertTrue(tc.unwrapToDouble(op.apply(tc.wrap((double)18), tc.wrap((char)4))) == dResult);
    assertTrue(((BigInteger)op.apply(BigInteger.valueOf(18), tc.wrap((char)4))).longValue() == iResult);
    assertTrue(((BigDecimal)op.apply(BigDecimal.valueOf(18), tc.wrap((char)4))).doubleValue() == dResult);

    assertTrue(tc.unwrapToInt(op.apply(tc.wrap((byte)18), tc.wrap((char)4))) == iResult);
    assertTrue(tc.unwrapToInt(op.apply(tc.wrap((char)18), tc.wrap((char)4))) == iResult);
    assertTrue(tc.unwrapToInt(op.apply(tc.wrap((short)18), tc.wrap((char)4))) == iResult);
    assertTrue(tc.unwrapToInt(op.apply(tc.wrap(18), tc.wrap((char)4))) == iResult);
    assertTrue(tc.unwrapToLong(op.apply(tc.wrap((long)18), tc.wrap((char)4))) == iResult);
    assertTrue(tc.unwrapToFloat(op.apply(tc.wrap((float)18), tc.wrap((char)4))) == dResult);
    assertTrue(tc.unwrapToDouble(op.apply(tc.wrap((double)18), tc.wrap((char)4))) == dResult);
    assertTrue(((BigInteger)op.apply((Object)BigInteger.valueOf(18), (Object)tc.wrap((char)4))).longValue() == iResult);
    assertTrue(((BigDecimal)op.apply((Object)BigDecimal.valueOf(18), (Object)tc.wrap((char)4))).doubleValue() == dResult);

    assertTrue(tc.unwrapToInt(op.apply(tc.wrap((byte)18), charMetaClass, tc.wrap((char)4))) == iResult);
    assertTrue(tc.unwrapToInt(op.apply(tc.wrap((char)18), charMetaClass, tc.wrap((char)4))) == iResult);
    assertTrue(tc.unwrapToInt(op.apply(tc.wrap((short)18), charMetaClass, tc.wrap((char)4))) == iResult);
    assertTrue(tc.unwrapToInt(op.apply(tc.wrap(18), charMetaClass, tc.wrap((char)4))) == iResult);
    assertTrue(tc.unwrapToLong(op.apply(tc.wrap((long)18), charMetaClass, tc.wrap((char)4))) == iResult);
    assertTrue(tc.unwrapToFloat(op.apply(tc.wrap((float)18), charMetaClass, tc.wrap((char)4))) == dResult);
    assertTrue(tc.unwrapToDouble(op.apply(tc.wrap((double)18), charMetaClass, tc.wrap((char)4))) == dResult);
    assertTrue(((BigInteger)op.apply((Object)BigInteger.valueOf(18), charMetaClass, (Object)tc.wrap((char)4))).longValue() == iResult);
    assertTrue(((BigDecimal)op.apply((Object)BigDecimal.valueOf(18), charMetaClass, (Object)tc.wrap((char)4))).doubleValue() == dResult);

    assertTrue(tc.unwrapToInt(op.apply(tc.wrap((byte)18), charMetaClass,tc.wrap((char)4))) == iResult);
    assertTrue(tc.unwrapToInt(op.apply(tc.wrap((char)18), charMetaClass,tc.wrap((char)4))) == iResult);
    assertTrue(tc.unwrapToInt(op.apply(tc.wrap((short)18), charMetaClass,tc.wrap((char)4))) == iResult);
    assertTrue(tc.unwrapToInt(op.apply(tc.wrap(18), charMetaClass,tc.wrap((char)4))) == iResult);
    assertTrue(tc.unwrapToLong(op.apply(tc.wrap((long)18), charMetaClass,tc.wrap((char)4))) == iResult);
    assertTrue(tc.unwrapToFloat(op.apply(tc.wrap((float)18), charMetaClass,tc.wrap((char)4))) == dResult);
    assertTrue(tc.unwrapToDouble(op.apply(tc.wrap((double)18), charMetaClass,tc.wrap((char)4))) == dResult);
    assertTrue(((BigInteger)op.apply((Object)BigInteger.valueOf(18), charMetaClass,(Object)tc.wrap((char)4))).longValue() == iResult);
    assertTrue(((BigDecimal)op.apply((Object)BigDecimal.valueOf(18), charMetaClass,(Object)tc.wrap((char)4))).doubleValue() == dResult);

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

    assertTrue(tc.unwrapToInt(op.apply(tc.wrap((byte)18), (short)4)) == iResult);
    assertTrue(tc.unwrapToInt(op.apply(tc.wrap((char)18), (short)4)) == iResult);
    assertTrue(tc.unwrapToInt(op.apply(tc.wrap((short)18), (short)4)) == iResult);
    assertTrue(tc.unwrapToInt(op.apply(tc.wrap(18), (short)4)) == iResult);
    assertTrue(tc.unwrapToLong(op.apply(tc.wrap((long)18), (short)4)) == iResult);
    assertTrue(tc.unwrapToFloat(op.apply(tc.wrap((float)18), (short)4)) == dResult);
    assertTrue(tc.unwrapToDouble(op.apply(tc.wrap((double)18), (short)4)) == dResult);

    assertTrue(tc.unwrapToInt(op.apply(tc.wrap((byte)18), (short)4)) == iResult);
    assertTrue(tc.unwrapToInt(op.apply(tc.wrap((char)18), (short)4)) == iResult);
    assertTrue(tc.unwrapToInt(op.apply(tc.wrap((short)18), (short)4)) == iResult);
    assertTrue(tc.unwrapToInt(op.apply(tc.wrap(18), (short)4)) == iResult);
    assertTrue(tc.unwrapToLong(op.apply(tc.wrap((long)18), (short)4)) == iResult);
    assertTrue(tc.unwrapToFloat(op.apply(tc.wrap((float)18), (short)4)) == dResult);
    assertTrue(tc.unwrapToDouble(op.apply(tc.wrap((double)18), (short)4)) == dResult);
    assertTrue(((BigInteger)op.apply((Object)BigInteger.valueOf(18), (short)4)).longValue() == iResult);
    assertTrue(((BigDecimal)op.apply((Object)BigDecimal.valueOf(18), (short)4)).doubleValue() == dResult);

    assertTrue(tc.unwrapToInt(op.apply((byte)18, tc.wrap((short)4))) == iResult);
    assertTrue(tc.unwrapToInt(op.apply((char)18, tc.wrap((short)4))) == iResult);
    assertTrue(tc.unwrapToInt(op.apply((short)18, tc.wrap((short)4))) == iResult);
    assertTrue(tc.unwrapToInt(op.apply(18, tc.wrap((short)4))) == iResult);
    assertTrue(tc.unwrapToLong(op.apply((long)18, tc.wrap((short)4))) == iResult);
    assertTrue(tc.unwrapToFloat(op.apply((float)18, tc.wrap((short)4))) == dResult);
    assertTrue(tc.unwrapToDouble(op.apply((double)18, tc.wrap((short)4))) == dResult);
    assertTrue(((BigInteger)op.apply(BigInteger.valueOf(18), tc.wrap((short)4))).longValue() == iResult);
    assertTrue(((BigDecimal)op.apply(BigDecimal.valueOf(18), tc.wrap((short)4))).doubleValue() == dResult);

    assertTrue(tc.unwrapToInt(op.apply((byte)18, tc.wrap((short)4))) == iResult);
    assertTrue(tc.unwrapToInt(op.apply((char)18, tc.wrap((short)4))) == iResult);
    assertTrue(tc.unwrapToInt(op.apply((short)18, tc.wrap((short)4))) == iResult);
    assertTrue(tc.unwrapToInt(op.apply(18, tc.wrap((short)4))) == iResult);
    assertTrue(tc.unwrapToLong(op.apply((long)18, (Object)tc.wrap((short)4))) == iResult);
    assertTrue(tc.unwrapToFloat(op.apply((float)18, (Object)tc.wrap((short)4))) == dResult);
    assertTrue(tc.unwrapToDouble(op.apply((double)18, (Object)tc.wrap((short)4))) == dResult);
    assertTrue(((BigInteger)op.apply(BigInteger.valueOf(18), tc.wrap((short)4))).longValue() == iResult);
    assertTrue(((BigDecimal)op.apply(BigDecimal.valueOf(18), tc.wrap((short)4))).doubleValue() == dResult);

    assertTrue(tc.unwrapToInt(op.apply(tc.wrap((byte)18), tc.wrap((short)4))) == iResult);
    assertTrue(tc.unwrapToInt(op.apply(tc.wrap((char)18), tc.wrap((short)4))) == iResult);
    assertTrue(tc.unwrapToInt(op.apply(tc.wrap((short)18), tc.wrap((short)4))) == iResult);
    assertTrue(tc.unwrapToInt(op.apply(tc.wrap(18), tc.wrap((short)4))) == iResult);
    assertTrue(tc.unwrapToLong(op.apply(tc.wrap((long)18), tc.wrap((short)4))) == iResult);
    assertTrue(tc.unwrapToFloat(op.apply(tc.wrap((float)18), tc.wrap((short)4))) == dResult);
    assertTrue(tc.unwrapToDouble(op.apply(tc.wrap((double)18), tc.wrap((short)4))) == dResult);
    assertTrue(((BigInteger)op.apply(BigInteger.valueOf(18), tc.wrap((short)4))).longValue() == iResult);
    assertTrue(((BigDecimal)op.apply(BigDecimal.valueOf(18), tc.wrap((short)4))).doubleValue() == dResult);

    assertTrue(tc.unwrapToInt(op.apply(tc.wrap((byte)18), tc.wrap((short)4))) == iResult);
    assertTrue(tc.unwrapToInt(op.apply(tc.wrap((char)18), tc.wrap((short)4))) == iResult);
    assertTrue(tc.unwrapToInt(op.apply(tc.wrap((short)18), tc.wrap((short)4))) == iResult);
    assertTrue(tc.unwrapToInt(op.apply(tc.wrap(18), tc.wrap((short)4))) == iResult);
    assertTrue(tc.unwrapToLong(op.apply(tc.wrap((long)18), tc.wrap((short)4))) == iResult);
    assertTrue(tc.unwrapToFloat(op.apply(tc.wrap((float)18), tc.wrap((short)4))) == dResult);
    assertTrue(tc.unwrapToDouble(op.apply(tc.wrap((double)18), tc.wrap((short)4))) == dResult);
    assertTrue(((BigInteger)op.apply((Object)BigInteger.valueOf(18), (Object)tc.wrap((short)4))).longValue() == iResult);
    assertTrue(((BigDecimal)op.apply((Object)BigDecimal.valueOf(18), (Object)tc.wrap((short)4))).doubleValue() == dResult);

    assertTrue(tc.unwrapToInt(op.apply(tc.wrap((byte)18), shortMetaClass, tc.wrap((short)4))) == iResult);
    assertTrue(tc.unwrapToInt(op.apply(tc.wrap((char)18), shortMetaClass, tc.wrap((short)4))) == iResult);
    assertTrue(tc.unwrapToInt(op.apply(tc.wrap((short)18), shortMetaClass, tc.wrap((short)4))) == iResult);
    assertTrue(tc.unwrapToInt(op.apply(tc.wrap(18), shortMetaClass, tc.wrap((short)4))) == iResult);
    assertTrue(tc.unwrapToLong(op.apply(tc.wrap((long)18), shortMetaClass, tc.wrap((short)4))) == iResult);
    assertTrue(tc.unwrapToFloat(op.apply(tc.wrap((float)18), shortMetaClass, tc.wrap((short)4))) == dResult);
    assertTrue(tc.unwrapToDouble(op.apply(tc.wrap((double)18), shortMetaClass, tc.wrap((short)4))) == dResult);
    assertTrue(((BigInteger)op.apply((Object)BigInteger.valueOf(18), shortMetaClass, (Object)tc.wrap((short)4))).longValue() == iResult);
    assertTrue(((BigDecimal)op.apply((Object)BigDecimal.valueOf(18), shortMetaClass, (Object)tc.wrap((short)4))).doubleValue() == dResult);

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

    assertTrue(tc.unwrapToInt(op.apply(tc.wrap((byte)18), 4)) == iResult);
    assertTrue(tc.unwrapToInt(op.apply(tc.wrap((char)18), 4)) == iResult);
    assertTrue(tc.unwrapToInt(op.apply(tc.wrap((short)18), 4)) == iResult);
    assertTrue(tc.unwrapToInt(op.apply(tc.wrap(18), 4)) == iResult);
    assertTrue(tc.unwrapToLong(op.apply(tc.wrap((long)18), 4)) == iResult);
    assertTrue(tc.unwrapToFloat(op.apply(tc.wrap((float)18), 4)) == dResult);
    assertTrue(tc.unwrapToDouble(op.apply(tc.wrap((double)18), 4)) == dResult);

    assertTrue(tc.unwrapToInt(op.apply(tc.wrap((byte)18), 4)) == iResult);
    assertTrue(tc.unwrapToInt(op.apply(tc.wrap((char)18), 4)) == iResult);
    assertTrue(tc.unwrapToInt(op.apply(tc.wrap((short)18), 4)) == iResult);
    assertTrue(tc.unwrapToInt(op.apply(tc.wrap(18), 4)) == iResult);
    assertTrue(tc.unwrapToLong(op.apply(tc.wrap((long)18), 4)) == iResult);
    assertTrue(tc.unwrapToFloat(op.apply(tc.wrap((float)18), 4)) == dResult);
    assertTrue(tc.unwrapToDouble(op.apply(tc.wrap((double)18), 4)) == dResult);
    assertTrue(((BigInteger)op.apply((Object)BigInteger.valueOf(18), 4)).longValue() == iResult);
    assertTrue(((BigDecimal)op.apply((Object)BigDecimal.valueOf(18), 4)).doubleValue() == dResult);

    assertTrue(tc.unwrapToInt(op.apply((byte)18, tc.wrap(4))) == iResult);
    assertTrue(tc.unwrapToInt(op.apply((char)18, tc.wrap(4))) == iResult);
    assertTrue(tc.unwrapToInt(op.apply((short)18, tc.wrap(4))) == iResult);
    assertTrue(tc.unwrapToInt(op.apply(18, tc.wrap(4))) == iResult);
    assertTrue(tc.unwrapToLong(op.apply((long)18, tc.wrap(4))) == iResult);
    assertTrue(tc.unwrapToFloat(op.apply((float)18, tc.wrap(4))) == dResult);
    assertTrue(tc.unwrapToDouble(op.apply((double)18, tc.wrap(4))) == dResult);
    assertTrue(((BigInteger)op.apply(BigInteger.valueOf(18), tc.wrap(4))).longValue() == iResult);
    assertTrue(((BigDecimal)op.apply(BigDecimal.valueOf(18), tc.wrap(4))).doubleValue() == dResult);

    assertTrue(tc.unwrapToInt(op.apply((byte)18, tc.wrap(4))) == iResult);
    assertTrue(tc.unwrapToInt(op.apply((char)18, tc.wrap(4))) == iResult);
    assertTrue(tc.unwrapToInt(op.apply((short)18, tc.wrap(4))) == iResult);
    assertTrue(tc.unwrapToInt(op.apply(18, tc.wrap(4))) == iResult);
    assertTrue(tc.unwrapToLong(op.apply((long)18, (Object)tc.wrap(4))) == iResult);
    assertTrue(tc.unwrapToFloat(op.apply((float)18, (Object)tc.wrap(4))) == dResult);
    assertTrue(tc.unwrapToDouble(op.apply((double)18, (Object)tc.wrap(4))) == dResult);
    assertTrue(((BigInteger)op.apply(BigInteger.valueOf(18), tc.wrap(4))).longValue() == iResult);
    assertTrue(((BigDecimal)op.apply(BigDecimal.valueOf(18), tc.wrap(4))).doubleValue() == dResult);

    assertTrue(tc.unwrapToInt(op.apply(tc.wrap((byte)18), tc.wrap(4))) == iResult);
    assertTrue(tc.unwrapToInt(op.apply(tc.wrap((char)18), tc.wrap(4))) == iResult);
    assertTrue(tc.unwrapToInt(op.apply(tc.wrap((short)18), tc.wrap(4))) == iResult);
    assertTrue(tc.unwrapToInt(op.apply(tc.wrap(18), tc.wrap(4))) == iResult);
    assertTrue(tc.unwrapToLong(op.apply(tc.wrap((long)18), tc.wrap(4))) == iResult);
    assertTrue(tc.unwrapToFloat(op.apply(tc.wrap((float)18), tc.wrap(4))) == dResult);
    assertTrue(tc.unwrapToDouble(op.apply(tc.wrap((double)18), tc.wrap(4))) == dResult);
    assertTrue(((BigInteger)op.apply(BigInteger.valueOf(18), tc.wrap(4))).longValue() == iResult);
    assertTrue(((BigDecimal)op.apply(BigDecimal.valueOf(18), tc.wrap(4))).doubleValue() == dResult);

    assertTrue(tc.unwrapToInt(op.apply(tc.wrap((byte)18), tc.wrap(4))) == iResult);
    assertTrue(tc.unwrapToInt(op.apply(tc.wrap((char)18), tc.wrap(4))) == iResult);
    assertTrue(tc.unwrapToInt(op.apply(tc.wrap((short)18), tc.wrap(4))) == iResult);
    assertTrue(tc.unwrapToInt(op.apply(tc.wrap(18), tc.wrap(4))) == iResult);
    assertTrue(tc.unwrapToLong(op.apply(tc.wrap((long)18), tc.wrap(4))) == iResult);
    assertTrue(tc.unwrapToFloat(op.apply(tc.wrap((float)18), tc.wrap(4))) == dResult);
    assertTrue(tc.unwrapToDouble(op.apply(tc.wrap((double)18), tc.wrap(4))) == dResult);
    assertTrue(((BigInteger)op.apply((Object)BigInteger.valueOf(18), (Object)tc.wrap(4))).longValue() == iResult);
    assertTrue(((BigDecimal)op.apply((Object)BigDecimal.valueOf(18), (Object)tc.wrap(4))).doubleValue() == dResult);

    assertTrue(tc.unwrapToInt(op.apply(tc.wrap((byte)18), intMetaClass, tc.wrap(4))) == iResult);
    assertTrue(tc.unwrapToInt(op.apply(tc.wrap((char)18), intMetaClass, tc.wrap(4))) == iResult);
    assertTrue(tc.unwrapToInt(op.apply(tc.wrap((short)18), intMetaClass, tc.wrap(4))) == iResult);
    assertTrue(tc.unwrapToInt(op.apply(tc.wrap(18), intMetaClass, tc.wrap(4))) == iResult);
    assertTrue(tc.unwrapToLong(op.apply(tc.wrap((long)18), intMetaClass, tc.wrap(4))) == iResult);
    assertTrue(tc.unwrapToFloat(op.apply(tc.wrap((float)18), intMetaClass, tc.wrap(4))) == dResult);
    assertTrue(tc.unwrapToDouble(op.apply(tc.wrap((double)18), intMetaClass, tc.wrap(4))) == dResult);
    assertTrue(((BigInteger)op.apply((Object)BigInteger.valueOf(18), intMetaClass, (Object)tc.wrap(4))).longValue() == iResult);
    assertTrue(((BigDecimal)op.apply((Object)BigDecimal.valueOf(18), intMetaClass, (Object)tc.wrap(4))).doubleValue() == dResult);

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

    assertTrue(tc.unwrapToLong(op.apply(tc.wrap((byte)18), (long)4)) == iResult);
    assertTrue(tc.unwrapToLong(op.apply(tc.wrap((char)18), (long)4)) == iResult);
    assertTrue(tc.unwrapToLong(op.apply(tc.wrap((short)18), (long)4)) == iResult);
    assertTrue(tc.unwrapToLong(op.apply(tc.wrap(18), (long)4)) == iResult);
    assertTrue(tc.unwrapToLong(op.apply(tc.wrap((long)18), (long)4)) == iResult);
    assertTrue(tc.unwrapToFloat(op.apply(tc.wrap((float)18), (long)4)) == dResult);
    assertTrue(tc.unwrapToDouble(op.apply(tc.wrap((double)18), (long)4)) == dResult);

    assertTrue(tc.unwrapToLong(op.apply((Object)tc.wrap((byte)18), (long)4)) == iResult);
    assertTrue(tc.unwrapToLong(op.apply((Object)tc.wrap((char)18), (long)4)) == iResult);
    assertTrue(tc.unwrapToLong(op.apply((Object)tc.wrap((short)18), (long)4)) == iResult);
    assertTrue(tc.unwrapToLong(op.apply((Object)tc.wrap(18), (long)4)) == iResult);
    assertTrue(tc.unwrapToLong(op.apply((Object)tc.wrap((long)18), (long)4)) == iResult);
    assertTrue(tc.unwrapToFloat(op.apply((Object)tc.wrap((float)18), (long)4)) == dResult);
    assertTrue(tc.unwrapToDouble(op.apply((Object)tc.wrap((double)18), (long)4)) == dResult);
    assertTrue(((BigInteger)op.apply((Object)BigInteger.valueOf(18), (long)4)).longValue() == iResult);
    assertTrue(((BigDecimal)op.apply((Object)BigDecimal.valueOf(18), (long)4)).doubleValue() == dResult);

    assertTrue(tc.unwrapToLong(op.apply((byte)18, tc.wrap((long)4))) == iResult);
    assertTrue(tc.unwrapToLong(op.apply((char)18, tc.wrap((long)4))) == iResult);
    assertTrue(tc.unwrapToLong(op.apply((short)18, tc.wrap((long)4))) == iResult);
    assertTrue(tc.unwrapToLong(op.apply(18, tc.wrap((long)4))) == iResult);
    assertTrue(tc.unwrapToLong(op.apply((long)18, tc.wrap((long)4))) == iResult);
    assertTrue(tc.unwrapToFloat(op.apply((float)18, tc.wrap((long)4))) == dResult);
    assertTrue(tc.unwrapToDouble(op.apply((double)18, tc.wrap((long)4))) == dResult);
    assertTrue(((BigInteger)op.apply(BigInteger.valueOf(18), tc.wrap((long)4))).longValue() == iResult);
    assertTrue(((BigDecimal)op.apply(BigDecimal.valueOf(18), tc.wrap((long)4))).doubleValue() == dResult);

    assertTrue(tc.unwrapToLong(op.apply((byte)18, tc.wrap((long)4))) == iResult);
    assertTrue(tc.unwrapToLong(op.apply((char)18, tc.wrap((long)4))) == iResult);
    assertTrue(tc.unwrapToLong(op.apply((short)18, tc.wrap((long)4))) == iResult);
    assertTrue(tc.unwrapToLong(op.apply(18, tc.wrap((long)4))) == iResult);
    assertTrue(tc.unwrapToLong(op.apply((long)18, (Object)tc.wrap((long)4))) == iResult);
    assertTrue(tc.unwrapToFloat(op.apply((float)18, (Object)tc.wrap((long)4))) == dResult);
    assertTrue(tc.unwrapToDouble(op.apply((double)18, (Object)tc.wrap((long)4))) == dResult);
    assertTrue(((BigInteger)op.apply(BigInteger.valueOf(18), tc.wrap((long)4))).longValue() == iResult);
    assertTrue(((BigDecimal)op.apply(BigDecimal.valueOf(18), tc.wrap((long)4))).doubleValue() == dResult);

    assertTrue(tc.unwrapToLong(op.apply(tc.wrap((byte)18), tc.wrap((long)4))) == iResult);
    assertTrue(tc.unwrapToLong(op.apply(tc.wrap((char)18), tc.wrap((long)4))) == iResult);
    assertTrue(tc.unwrapToLong(op.apply(tc.wrap((short)18), tc.wrap((long)4))) == iResult);
    assertTrue(tc.unwrapToLong(op.apply(tc.wrap(18), tc.wrap((long)4))) == iResult);
    assertTrue(tc.unwrapToLong(op.apply(tc.wrap((long)18), tc.wrap((long)4))) == iResult);
    assertTrue(tc.unwrapToFloat(op.apply(tc.wrap((float)18), tc.wrap((long)4))) == dResult);
    assertTrue(tc.unwrapToDouble(op.apply(tc.wrap((double)18), tc.wrap((long)4))) == dResult);
    assertTrue(((BigInteger)op.apply(BigInteger.valueOf(18), tc.wrap((long)4))).longValue() == iResult);
    assertTrue(((BigDecimal)op.apply(BigDecimal.valueOf(18), tc.wrap((long)4))).doubleValue() == dResult);

    assertTrue(tc.unwrapToLong(op.apply(tc.wrap((byte)18), tc.wrap((long)4))) == iResult);
    assertTrue(tc.unwrapToLong(op.apply(tc.wrap((char)18), tc.wrap((long)4))) == iResult);
    assertTrue(tc.unwrapToLong(op.apply(tc.wrap((short)18), tc.wrap((long)4))) == iResult);
    assertTrue(tc.unwrapToLong(op.apply(tc.wrap(18), tc.wrap((long)4))) == iResult);
    assertTrue(tc.unwrapToLong(op.apply(tc.wrap((long)18), tc.wrap((long)4))) == iResult);
    assertTrue(tc.unwrapToFloat(op.apply(tc.wrap((float)18), tc.wrap((long)4))) == dResult);
    assertTrue(tc.unwrapToDouble(op.apply(tc.wrap((double)18), tc.wrap((long)4))) == dResult);
    assertTrue(((BigInteger)op.apply((Object)BigInteger.valueOf(18), (Object)tc.wrap((long)4))).longValue() == iResult);
    assertTrue(((BigDecimal)op.apply((Object)BigDecimal.valueOf(18), (Object)tc.wrap((long)4))).doubleValue() == dResult);

    assertTrue(tc.unwrapToLong(op.apply(tc.wrap((byte)18), longMetaClass, tc.wrap((long)4))) == iResult);
    assertTrue(tc.unwrapToLong(op.apply(tc.wrap((char)18), longMetaClass, tc.wrap((long)4))) == iResult);
    assertTrue(tc.unwrapToLong(op.apply(tc.wrap((short)18), longMetaClass, tc.wrap((long)4))) == iResult);
    assertTrue(tc.unwrapToLong(op.apply(tc.wrap(18), longMetaClass, tc.wrap((long)4))) == iResult);
    assertTrue(tc.unwrapToLong(op.apply(tc.wrap((long)18), longMetaClass, tc.wrap((long)4))) == iResult);
    assertTrue(tc.unwrapToFloat(op.apply(tc.wrap((float)18), longMetaClass, tc.wrap((long)4))) == dResult);
    assertTrue(tc.unwrapToDouble(op.apply(tc.wrap((double)18), longMetaClass, tc.wrap((long)4))) == dResult);
    assertTrue(((BigInteger)op.apply((Object)BigInteger.valueOf(18), longMetaClass, (Object)tc.wrap((long)4))).longValue() == iResult);
    assertTrue(((BigDecimal)op.apply((Object)BigDecimal.valueOf(18), longMetaClass, (Object)tc.wrap((long)4))).doubleValue() == dResult);

    assertTrue(op.floatApply((byte)18, (float)4) == dResult);
    assertTrue(op.floatApply((char)18, (float)4) == dResult);
    assertTrue(op.floatApply((short)18, (float)4) == dResult);
    assertTrue(op.floatApply(18, (float)4) == dResult);
    assertTrue(op.floatApply((long)18, (float)4) == dResult);
    assertTrue(op.floatApply((float)18, (float)4) == dResult);
    assertTrue(op.doubleApply((double)18, (float)4) == dResult);
    assertTrue(op.floatApply(BigInteger.valueOf(18), 4) == dResult);
    assertTrue(op.bigDecimalApply(BigDecimal.valueOf(18), (float)4).doubleValue() == dResult);

    assertTrue(tc.unwrapToFloat(op.apply((byte)18, (float)4)) == dResult);
    assertTrue(tc.unwrapToFloat(op.apply((char)18, (float)4)) == dResult);
    assertTrue(tc.unwrapToFloat(op.apply((short)18, (float)4)) == dResult);
    assertTrue(tc.unwrapToFloat(op.apply(18, (float)4)) == dResult);
    assertTrue(tc.unwrapToFloat(op.apply((long)18, (float)4)) == dResult);
    assertTrue(tc.unwrapToFloat(op.apply((float)18, (float)4)) == dResult);
    assertTrue(tc.unwrapToDouble(op.apply((double)18, (float)4)) == dResult);
    assertTrue(tc.unwrapToFloat(op.apply(BigInteger.valueOf(18), (float)4)) == dResult);
    assertTrue(((BigDecimal)op.apply(BigDecimal.valueOf(18), (float)4)).doubleValue() == dResult);

    assertTrue(tc.unwrapToFloat(op.apply(tc.wrap((byte)18), (float)4)) == dResult);
    assertTrue(tc.unwrapToFloat(op.apply(tc.wrap((char)18), (float)4)) == dResult);
    assertTrue(tc.unwrapToFloat(op.apply(tc.wrap((short)18), (float)4)) == dResult);
    assertTrue(tc.unwrapToFloat(op.apply(tc.wrap(18), (float)4)) == dResult);
    assertTrue(tc.unwrapToFloat(op.apply(tc.wrap((long)18), (float)4)) == dResult);
    assertTrue(tc.unwrapToFloat(op.apply(tc.wrap((float)18), (float)4)) == dResult);
    assertTrue(tc.unwrapToDouble(op.apply(tc.wrap((double)18), (float)4)) == dResult);

    assertTrue(tc.unwrapToFloat(op.apply((Object)tc.wrap((byte)18), (float)4)) == dResult);
    assertTrue(tc.unwrapToFloat(op.apply((Object)tc.wrap((char)18), (float)4)) == dResult);
    assertTrue(tc.unwrapToFloat(op.apply((Object)tc.wrap((short)18), (float)4)) == dResult);
    assertTrue(tc.unwrapToFloat(op.apply((Object)tc.wrap(18), (float)4)) == dResult);
    assertTrue(tc.unwrapToFloat(op.apply((Object)tc.wrap((long)18), (float)4)) == dResult);
    assertTrue(tc.unwrapToFloat(op.apply((Object)tc.wrap((float)18), (float)4)) == dResult);
    assertTrue(tc.unwrapToDouble(op.apply((Object)tc.wrap((double)18), (float)4)) == dResult);
    assertTrue(tc.unwrapToFloat(op.apply((Object)BigInteger.valueOf(18), (float)4)) == dResult);
    assertTrue(((BigDecimal)op.apply((Object)BigDecimal.valueOf(18), (float)4)).doubleValue() == dResult);

    assertTrue(tc.unwrapToFloat(op.apply((byte)18, tc.wrap((float)4))) == dResult);
    assertTrue(tc.unwrapToFloat(op.apply((char)18, tc.wrap((float)4))) == dResult);
    assertTrue(tc.unwrapToFloat(op.apply((short)18, tc.wrap((float)4))) == dResult);
    assertTrue(tc.unwrapToFloat(op.apply(18, tc.wrap((float)4))) == dResult);
    assertTrue(tc.unwrapToFloat(op.apply((long)18, tc.wrap((float)4))) == dResult);
    assertTrue(tc.unwrapToFloat(op.apply((float)18, tc.wrap((float)4))) == dResult);
    assertTrue(tc.unwrapToDouble(op.apply((double)18, tc.wrap((float)4))) == dResult);
    assertTrue(tc.unwrapToFloat(op.apply(BigInteger.valueOf(18), tc.wrap((float)4))) == dResult);
    assertTrue(((BigDecimal)op.apply(BigDecimal.valueOf(18), tc.wrap((float)4))).doubleValue() == dResult);

    assertTrue(tc.unwrapToFloat(op.apply((byte)18, tc.wrap((float)4))) == dResult);
    assertTrue(tc.unwrapToFloat(op.apply((char)18, tc.wrap((float)4))) == dResult);
    assertTrue(tc.unwrapToFloat(op.apply((short)18, tc.wrap((float)4))) == dResult);
    assertTrue(tc.unwrapToFloat(op.apply(18, tc.wrap((float)4))) == dResult);
    assertTrue(tc.unwrapToFloat(op.apply((long)18, (Object)tc.wrap((float)4))) == dResult);
    assertTrue(tc.unwrapToFloat(op.apply((float)18, (Object)tc.wrap((float)4))) == dResult);
    assertTrue(tc.unwrapToDouble(op.apply((double)18, (Object)tc.wrap((float)4))) == dResult);
    assertTrue(tc.unwrapToFloat(op.apply(BigInteger.valueOf(18), tc.wrap((float)4))) == dResult);
    assertTrue(((BigDecimal)op.apply(BigDecimal.valueOf(18), tc.wrap((float)4))).doubleValue() == dResult);

    assertTrue(tc.unwrapToFloat(op.apply(tc.wrap((byte)18), tc.wrap((float)4))) == dResult);
    assertTrue(tc.unwrapToFloat(op.apply(tc.wrap((char)18), tc.wrap((float)4))) == dResult);
    assertTrue(tc.unwrapToFloat(op.apply(tc.wrap((short)18), tc.wrap((float)4))) == dResult);
    assertTrue(tc.unwrapToFloat(op.apply(tc.wrap(18), tc.wrap((float)4))) == dResult);
    assertTrue(tc.unwrapToFloat(op.apply(tc.wrap((long)18), tc.wrap((float)4))) == dResult);
    assertTrue(tc.unwrapToFloat(op.apply(tc.wrap((float)18), tc.wrap((float)4))) == dResult);
    assertTrue(tc.unwrapToDouble(op.apply(tc.wrap((double)18), tc.wrap((float)4))) == dResult);
    assertTrue(tc.unwrapToFloat(op.apply(BigInteger.valueOf(18), tc.wrap((float)4))) == dResult);
    assertTrue(((BigDecimal)op.apply(BigDecimal.valueOf(18), tc.wrap((float)4))).doubleValue() == dResult);

    assertTrue(tc.unwrapToFloat(op.apply(tc.wrap((byte)18), tc.wrap((float)4))) == dResult);
    assertTrue(tc.unwrapToFloat(op.apply(tc.wrap((char)18), tc.wrap((float)4))) == dResult);
    assertTrue(tc.unwrapToFloat(op.apply(tc.wrap((short)18), tc.wrap((float)4))) == dResult);
    assertTrue(tc.unwrapToFloat(op.apply(tc.wrap(18), tc.wrap((float)4))) == dResult);
    assertTrue(tc.unwrapToFloat(op.apply(tc.wrap((long)18), tc.wrap((float)4))) == dResult);
    assertTrue(tc.unwrapToFloat(op.apply(tc.wrap((float)18), tc.wrap((float)4))) == dResult);
    assertTrue(tc.unwrapToDouble(op.apply(tc.wrap((double)18), tc.wrap((float)4))) == dResult);
    assertTrue(tc.unwrapToFloat(op.apply((Object)BigInteger.valueOf(18), (Object)tc.wrap((float)4))) == dResult);
    assertTrue(((BigDecimal)op.apply((Object)BigDecimal.valueOf(18), (Object)tc.wrap((float)4))).doubleValue() == dResult);

    assertTrue(tc.unwrapToFloat(op.apply(tc.wrap((byte)18), floatMetaClass, tc.wrap((float)4))) == dResult);
    assertTrue(tc.unwrapToFloat(op.apply(tc.wrap((char)18), floatMetaClass, tc.wrap((float)4))) == dResult);
    assertTrue(tc.unwrapToFloat(op.apply(tc.wrap((short)18), floatMetaClass, tc.wrap((float)4))) == dResult);
    assertTrue(tc.unwrapToFloat(op.apply(tc.wrap(18), floatMetaClass, tc.wrap((float)4))) == dResult);
    assertTrue(tc.unwrapToFloat(op.apply(tc.wrap((long)18), floatMetaClass, tc.wrap((float)4))) == dResult);
    assertTrue(tc.unwrapToFloat(op.apply(tc.wrap((float)18), floatMetaClass, tc.wrap((float)4))) == dResult);
    assertTrue(tc.unwrapToDouble(op.apply(tc.wrap((double)18), floatMetaClass, tc.wrap((float)4))) == dResult);
    assertTrue(tc.unwrapToFloat(op.apply((Object)BigInteger.valueOf(18), floatMetaClass, (Object)tc.wrap((float)4))) == dResult);
    assertTrue(((BigDecimal)op.apply((Object)BigDecimal.valueOf(18), floatMetaClass, (Object)tc.wrap((float)4))).doubleValue() == dResult);

    assertTrue(op.doubleApply((byte)18, (double)4) == dResult);
    assertTrue(op.doubleApply((char)18, (double)4) == dResult);
    assertTrue(op.doubleApply((short)18, (double)4) == dResult);
    assertTrue(op.doubleApply(18, (double)4) == dResult);
    assertTrue(op.doubleApply((long)18, (double)4) == dResult);
    assertTrue(op.doubleApply((float)18, (double)4) == dResult);
    assertTrue(op.doubleApply((double)18, (double)4) == dResult);
    assertTrue(op.doubleApply(BigInteger.valueOf(18), 4) == dResult);
    assertTrue(op.bigDecimalApply(BigDecimal.valueOf(18), (double)4).doubleValue() == dResult);

    assertTrue(tc.unwrapToDouble(op.apply((byte)18, (double)4)) == dResult);
    assertTrue(tc.unwrapToDouble(op.apply((char)18, (double)4)) == dResult);
    assertTrue(tc.unwrapToDouble(op.apply((short)18, (double)4)) == dResult);
    assertTrue(tc.unwrapToDouble(op.apply(18, (double)4)) == dResult);
    assertTrue(tc.unwrapToDouble(op.apply((long)18, (double)4)) == dResult);
    assertTrue(tc.unwrapToDouble(op.apply((float)18, (double)4)) == dResult);
    assertTrue(tc.unwrapToDouble(op.apply((double)18, (double)4)) == dResult);
    assertTrue(tc.unwrapToDouble(op.apply(BigInteger.valueOf(18), (double)4)) == dResult);
    assertTrue(((BigDecimal)op.apply(BigDecimal.valueOf(18), (double)4)).doubleValue() == dResult);

    assertTrue(tc.unwrapToDouble(op.apply(tc.wrap((byte)18), (double)4)) == dResult);
    assertTrue(tc.unwrapToDouble(op.apply(tc.wrap((char)18), (double)4)) == dResult);
    assertTrue(tc.unwrapToDouble(op.apply(tc.wrap((short)18), (double)4)) == dResult);
    assertTrue(tc.unwrapToDouble(op.apply(tc.wrap(18), (double)4)) == dResult);
    assertTrue(tc.unwrapToDouble(op.apply(tc.wrap((long)18), (double)4)) == dResult);
    assertTrue(tc.unwrapToDouble(op.apply(tc.wrap((float)18), (double)4)) == dResult);
    assertTrue(tc.unwrapToDouble(op.apply(tc.wrap((double)18), (double)4)) == dResult);

    assertTrue(tc.unwrapToDouble(op.apply((Object)tc.wrap((byte)18), (double)4)) == dResult);
    assertTrue(tc.unwrapToDouble(op.apply((Object)tc.wrap((char)18), (double)4)) == dResult);
    assertTrue(tc.unwrapToDouble(op.apply((Object)tc.wrap((short)18), (double)4)) == dResult);
    assertTrue(tc.unwrapToDouble(op.apply((Object)tc.wrap(18), (double)4)) == dResult);
    assertTrue(tc.unwrapToDouble(op.apply((Object)tc.wrap((long)18), (double)4)) == dResult);
    assertTrue(tc.unwrapToDouble(op.apply((Object)tc.wrap((float)18), (double)4)) == dResult);
    assertTrue(tc.unwrapToDouble(op.apply((Object)tc.wrap((double)18), (double)4)) == dResult);
    assertTrue(tc.unwrapToDouble(op.apply((Object)BigInteger.valueOf(18), (double)4)) == dResult);
    assertTrue(((BigDecimal)op.apply((Object)BigDecimal.valueOf(18), (double)4)).doubleValue() == dResult);

    assertTrue(tc.unwrapToDouble(op.apply((byte)18, tc.wrap((double)4))) == dResult);
    assertTrue(tc.unwrapToDouble(op.apply((char)18, tc.wrap((double)4))) == dResult);
    assertTrue(tc.unwrapToDouble(op.apply((short)18, tc.wrap((double)4))) == dResult);
    assertTrue(tc.unwrapToDouble(op.apply(18, tc.wrap((double)4))) == dResult);
    assertTrue(tc.unwrapToDouble(op.apply((long)18, tc.wrap((double)4))) == dResult);
    assertTrue(tc.unwrapToDouble(op.apply((float)18, tc.wrap((double)4))) == dResult);
    assertTrue(tc.unwrapToDouble(op.apply((double)18, tc.wrap((double)4))) == dResult);
    assertTrue(tc.unwrapToDouble(op.apply(BigInteger.valueOf(18), tc.wrap((double)4))) == dResult);
    assertTrue(((BigDecimal)op.apply(BigDecimal.valueOf(18), tc.wrap((double)4))).doubleValue() == dResult);

    assertTrue(tc.unwrapToDouble(op.apply((byte)18, tc.wrap((double)4))) == dResult);
    assertTrue(tc.unwrapToDouble(op.apply((char)18, tc.wrap((double)4))) == dResult);
    assertTrue(tc.unwrapToDouble(op.apply((short)18, tc.wrap((double)4))) == dResult);
    assertTrue(tc.unwrapToDouble(op.apply(18, tc.wrap((double)4))) == dResult);
    assertTrue(tc.unwrapToDouble(op.apply((long)18, (Object)tc.wrap((double)4))) == dResult);
    assertTrue(tc.unwrapToDouble(op.apply((float)18, (Object)tc.wrap((double)4))) == dResult);
    assertTrue(tc.unwrapToDouble(op.apply((double)18, (Object)tc.wrap((double)4))) == dResult);
    assertTrue(tc.unwrapToDouble(op.apply(BigInteger.valueOf(18), tc.wrap((double)4))) == dResult);
    assertTrue(((BigDecimal)op.apply(BigDecimal.valueOf(18), tc.wrap((double)4))).doubleValue() == dResult);

    assertTrue(tc.unwrapToDouble(op.apply(tc.wrap((byte)18), tc.wrap((double)4))) == dResult);
    assertTrue(tc.unwrapToDouble(op.apply(tc.wrap((char)18), tc.wrap((double)4))) == dResult);
    assertTrue(tc.unwrapToDouble(op.apply(tc.wrap((short)18), tc.wrap((double)4))) == dResult);
    assertTrue(tc.unwrapToDouble(op.apply(tc.wrap(18), tc.wrap((double)4))) == dResult);
    assertTrue(tc.unwrapToDouble(op.apply(tc.wrap((long)18), tc.wrap((double)4))) == dResult);
    assertTrue(tc.unwrapToDouble(op.apply(tc.wrap((float)18), tc.wrap((double)4))) == dResult);
    assertTrue(tc.unwrapToDouble(op.apply(tc.wrap((double)18), tc.wrap((double)4))) == dResult);
    assertTrue(tc.unwrapToDouble(op.apply(BigInteger.valueOf(18), tc.wrap((double)4))) == dResult);
    assertTrue(((BigDecimal)op.apply(BigDecimal.valueOf(18), tc.wrap((double)4))).doubleValue() == dResult);

    assertTrue(tc.unwrapToDouble(op.apply(tc.wrap((byte)18), tc.wrap((double)4))) == dResult);
    assertTrue(tc.unwrapToDouble(op.apply(tc.wrap((char)18), tc.wrap((double)4))) == dResult);
    assertTrue(tc.unwrapToDouble(op.apply(tc.wrap((short)18), tc.wrap((double)4))) == dResult);
    assertTrue(tc.unwrapToDouble(op.apply(tc.wrap(18), tc.wrap((double)4))) == dResult);
    assertTrue(tc.unwrapToDouble(op.apply(tc.wrap((long)18), tc.wrap((double)4))) == dResult);
    assertTrue(tc.unwrapToDouble(op.apply(tc.wrap((float)18), tc.wrap((double)4))) == dResult);
    assertTrue(tc.unwrapToDouble(op.apply(tc.wrap((double)18), tc.wrap((double)4))) == dResult);
    assertTrue(tc.unwrapToDouble(op.apply((Object)BigInteger.valueOf(18), (Object)tc.wrap((double)4))) == dResult);
    assertTrue(((BigDecimal)op.apply((Object)BigDecimal.valueOf(18), (Object)tc.wrap((double)4))).doubleValue() == dResult);

    assertTrue(tc.unwrapToDouble(op.apply(tc.wrap((byte)18), doubleMetaClass, tc.wrap((double)4))) == dResult);
    assertTrue(tc.unwrapToDouble(op.apply(tc.wrap((char)18), doubleMetaClass, tc.wrap((double)4))) == dResult);
    assertTrue(tc.unwrapToDouble(op.apply(tc.wrap((short)18), doubleMetaClass, tc.wrap((double)4))) == dResult);
    assertTrue(tc.unwrapToDouble(op.apply(tc.wrap(18), doubleMetaClass, tc.wrap((double)4))) == dResult);
    assertTrue(tc.unwrapToDouble(op.apply(tc.wrap((long)18), doubleMetaClass, tc.wrap((double)4))) == dResult);
    assertTrue(tc.unwrapToDouble(op.apply(tc.wrap((float)18), doubleMetaClass, tc.wrap((double)4))) == dResult);
    assertTrue(tc.unwrapToDouble(op.apply(tc.wrap((double)18), doubleMetaClass, tc.wrap((double)4))) == dResult);
    assertTrue(tc.unwrapToDouble(op.apply((Object)BigInteger.valueOf(18), doubleMetaClass, (Object)tc.wrap((double)4))) == dResult);
    assertTrue(((BigDecimal)op.apply((Object)BigDecimal.valueOf(18), doubleMetaClass, (Object)tc.wrap((double)4))).doubleValue() == dResult);

    assertTrue(op.bigIntegerApply((byte)18, BigInteger.valueOf(4)).longValue() == iResult);
    assertTrue(op.bigIntegerApply((char)18, BigInteger.valueOf(4)).longValue() == iResult);
    assertTrue(op.bigIntegerApply((short)18, BigInteger.valueOf(4)).longValue() == iResult);
    assertTrue(op.bigIntegerApply(18, BigInteger.valueOf(4)).longValue() == iResult);
    assertTrue(op.bigIntegerApply((long)18, BigInteger.valueOf(4)).longValue() == iResult);
    assertTrue(op.floatApply(18, BigInteger.valueOf(4)) == dResult);
    assertTrue(op.doubleApply(18, BigInteger.valueOf(4)) == dResult);
    assertTrue(op.bigIntegerApply(BigInteger.valueOf(18), BigInteger.valueOf(4)).longValue() == iResult);
    assertTrue(op.bigDecimalApply(BigDecimal.valueOf(18), BigInteger.valueOf(4)).doubleValue() == dResult);

    assertTrue(((BigInteger)op.apply((byte)18, BigInteger.valueOf(4))).longValue() == iResult);
    assertTrue(((BigInteger)op.apply((char)18, BigInteger.valueOf(4))).longValue() == iResult);
    assertTrue(((BigInteger)op.apply((short)18, BigInteger.valueOf(4))).longValue() == iResult);
    assertTrue(((BigInteger)op.apply(18, BigInteger.valueOf(4))).longValue() == iResult);
    assertTrue(((BigInteger)op.apply((long)18, BigInteger.valueOf(4))).longValue() == iResult);
    assertTrue(tc.unwrapToFloat(op.apply((float)18, BigInteger.valueOf(4))) == dResult);
    assertTrue(tc.unwrapToDouble(op.apply((double)18, BigInteger.valueOf(4))) == dResult);
    assertTrue(((BigInteger)op.apply(BigInteger.valueOf(18), BigInteger.valueOf(4))).longValue() == iResult);
    assertTrue(((BigDecimal)op.apply(BigDecimal.valueOf(18), BigInteger.valueOf(4))).doubleValue() == dResult);

    assertTrue(((BigInteger)op.apply(tc.wrap((byte)18), BigInteger.valueOf(4))).longValue() == iResult);
    assertTrue(((BigInteger)op.apply(tc.wrap((char)18), BigInteger.valueOf(4))).longValue() == iResult);
    assertTrue(((BigInteger)op.apply(tc.wrap((short)18), BigInteger.valueOf(4))).longValue() == iResult);
    assertTrue(((BigInteger)op.apply(tc.wrap(18), BigInteger.valueOf(4))).longValue() == iResult);
    assertTrue(((BigInteger)op.apply(tc.wrap((long)18), BigInteger.valueOf(4))).longValue() == iResult);
    assertTrue(tc.unwrapToFloat(op.apply(tc.wrap((float)18), BigInteger.valueOf(4))) == dResult);
    assertTrue(tc.unwrapToDouble(op.apply(tc.wrap((double)18), BigInteger.valueOf(4))) == dResult);

    assertTrue(((BigInteger)op.apply(tc.wrap((byte)18), BigInteger.valueOf(4))).longValue() == iResult);
    assertTrue(((BigInteger)op.apply(tc.wrap((char)18), BigInteger.valueOf(4))).longValue() == iResult);
    assertTrue(((BigInteger)op.apply(tc.wrap((short)18), BigInteger.valueOf(4))).longValue() == iResult);
    assertTrue(((BigInteger)op.apply(tc.wrap(18), BigInteger.valueOf(4))).longValue() == iResult);
    assertTrue(((BigInteger)op.apply(tc.wrap((long)18), BigInteger.valueOf(4))).longValue() == iResult);
    assertTrue(tc.unwrapToFloat(op.apply(tc.wrap((float)18), BigInteger.valueOf(4))) == dResult);
    assertTrue(tc.unwrapToDouble(op.apply(tc.wrap((double)18), BigInteger.valueOf(4))) == dResult);
    assertTrue(((BigInteger)op.apply((Object)BigInteger.valueOf(18), BigInteger.valueOf(4))).longValue() == iResult);
    assertTrue(((BigDecimal)op.apply((Object)BigDecimal.valueOf(18), BigInteger.valueOf(4))).doubleValue() == dResult);

    assertTrue(((BigInteger)op.apply((Object)tc.wrap((byte)18), (Object)BigInteger.valueOf(4))).longValue() == iResult);
    assertTrue(((BigInteger)op.apply((Object)tc.wrap((char)18), (Object)BigInteger.valueOf(4))).longValue() == iResult);
    assertTrue(((BigInteger)op.apply((Object)tc.wrap((short)18), (Object)BigInteger.valueOf(4))).longValue() == iResult);
    assertTrue(((BigInteger)op.apply((Object)tc.wrap(18), (Object)BigInteger.valueOf(4))).longValue() == iResult);
    assertTrue(((BigInteger)op.apply((Object)tc.wrap((long)18), (Object)BigInteger.valueOf(4))).longValue() == iResult);
    assertTrue(tc.unwrapToFloat(op.apply((Object)tc.wrap((float)18), (Object)BigInteger.valueOf(4))) == dResult);
    assertTrue(tc.unwrapToDouble(op.apply((Object)tc.wrap((double)18), (Object)BigInteger.valueOf(4))) == dResult);
    assertTrue(((BigInteger)op.apply((Object)BigInteger.valueOf(18), (Object)BigInteger.valueOf(4))).longValue() == iResult);
    assertTrue(((BigDecimal)op.apply((Object)BigDecimal.valueOf(18), (Object)BigInteger.valueOf(4))).doubleValue() == dResult);

    assertTrue(((BigInteger)op.apply(tc.wrap((byte)18), bigIntegerMetaClass, BigInteger.valueOf(4))).longValue() == iResult);
    assertTrue(((BigInteger)op.apply(tc.wrap((char)18), bigIntegerMetaClass, BigInteger.valueOf(4))).longValue() == iResult);
    assertTrue(((BigInteger)op.apply(tc.wrap((short)18), bigIntegerMetaClass, BigInteger.valueOf(4))).longValue() == iResult);
    assertTrue(((BigInteger)op.apply(tc.wrap(18), bigIntegerMetaClass, BigInteger.valueOf(4))).longValue() == iResult);
    assertTrue(((BigInteger)op.apply((Object)tc.wrap((long)18), bigIntegerMetaClass, (Object)BigInteger.valueOf(4))).longValue() == iResult);
    assertTrue(tc.unwrapToFloat(op.apply((Object)tc.wrap((float)18), bigIntegerMetaClass, (Object)BigInteger.valueOf(4))) == dResult);
    assertTrue(tc.unwrapToDouble(op.apply((Object)tc.wrap((double)18), bigIntegerMetaClass, (Object)BigInteger.valueOf(4))) == dResult);
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

    assertTrue(((BigDecimal)op.apply(tc.wrap((byte)18), BigDecimal.valueOf(4))).doubleValue() == dResult);
    assertTrue(((BigDecimal)op.apply(tc.wrap((char)18), BigDecimal.valueOf(4))).doubleValue() == dResult);
    assertTrue(((BigDecimal)op.apply(tc.wrap((short)18), BigDecimal.valueOf(4))).doubleValue() == dResult);
    assertTrue(((BigDecimal)op.apply(tc.wrap((int)18), BigDecimal.valueOf(4))).doubleValue() == dResult);
    assertTrue(((BigDecimal)op.apply(tc.wrap((long)18), BigDecimal.valueOf(4))).doubleValue() == dResult);
    assertTrue(((BigDecimal)op.apply(tc.wrap((float)18), BigDecimal.valueOf(4))).doubleValue() == dResult);
    assertTrue(((BigDecimal)op.apply(tc.wrap((double)18), BigDecimal.valueOf(4))).doubleValue() == dResult);

    assertTrue(((BigDecimal)op.apply((Object)tc.wrap((byte)18), BigDecimal.valueOf(4))).doubleValue() == dResult);
    assertTrue(((BigDecimal)op.apply((Object)tc.wrap((char)18), BigDecimal.valueOf(4))).doubleValue() == dResult);
    assertTrue(((BigDecimal)op.apply((Object)tc.wrap((short)18), BigDecimal.valueOf(4))).doubleValue() == dResult);
    assertTrue(((BigDecimal)op.apply((Object)tc.wrap((int)18), BigDecimal.valueOf(4))).doubleValue() == dResult);
    assertTrue(((BigDecimal)op.apply((Object)tc.wrap((long)18), BigDecimal.valueOf(4))).doubleValue() == dResult);
    assertTrue(((BigDecimal)op.apply((Object)tc.wrap((float)18), BigDecimal.valueOf(4))).doubleValue() == dResult);
    assertTrue(((BigDecimal)op.apply((Object)tc.wrap((double)18), BigDecimal.valueOf(4))).doubleValue() == dResult);
    assertTrue(((BigDecimal)op.apply((Object)BigInteger.valueOf(18), BigDecimal.valueOf(4))).doubleValue() == dResult);
    assertTrue(((BigDecimal)op.apply((Object)BigDecimal.valueOf(18), BigDecimal.valueOf(4))).doubleValue() == dResult);

    assertTrue(((BigDecimal)op.apply((Object)tc.wrap((byte)18), (Object)BigDecimal.valueOf(4))).doubleValue() == dResult);
    assertTrue(((BigDecimal)op.apply((Object)tc.wrap((char)18), (Object)BigDecimal.valueOf(4))).doubleValue() == dResult);
    assertTrue(((BigDecimal)op.apply((Object)tc.wrap((short)18), (Object)BigDecimal.valueOf(4))).doubleValue() == dResult);
    assertTrue(((BigDecimal)op.apply((Object)tc.wrap((int)18), (Object)BigDecimal.valueOf(4))).doubleValue() == dResult);
    assertTrue(((BigDecimal)op.apply((Object)tc.wrap((long)18), (Object)BigDecimal.valueOf(4))).doubleValue() == dResult);
    assertTrue(((BigDecimal)op.apply((Object)tc.wrap((float)18), (Object)BigDecimal.valueOf(4))).doubleValue() == dResult);
    assertTrue(((BigDecimal)op.apply((Object)tc.wrap((double)18), (Object)BigDecimal.valueOf(4))).doubleValue() == dResult);
    assertTrue(((BigDecimal)op.apply((Object)BigInteger.valueOf(18), (Object)BigDecimal.valueOf(4))).doubleValue() == dResult);
    assertTrue(((BigDecimal)op.apply((Object)BigDecimal.valueOf(18), (Object)BigDecimal.valueOf(4))).doubleValue() == dResult);

    assertTrue(((BigDecimal)op.apply((Object)tc.wrap((byte)18), bigDecimalMetaClass, (Object)BigDecimal.valueOf(4))).doubleValue() == dResult);
    assertTrue(((BigDecimal)op.apply((Object)tc.wrap((char)18), bigDecimalMetaClass, (Object)BigDecimal.valueOf(4))).doubleValue() == dResult);
    assertTrue(((BigDecimal)op.apply((Object)tc.wrap((short)18), bigDecimalMetaClass, (Object)BigDecimal.valueOf(4))).doubleValue() == dResult);
    assertTrue(((BigDecimal)op.apply((Object)tc.wrap((int)18), bigDecimalMetaClass, (Object)BigDecimal.valueOf(4))).doubleValue() == dResult);
    assertTrue(((BigDecimal)op.apply((Object)tc.wrap((long)18), bigDecimalMetaClass, (Object)BigDecimal.valueOf(4))).doubleValue() == dResult);
    assertTrue(((BigDecimal)op.apply((Object)tc.wrap((float)18), bigDecimalMetaClass, (Object)BigDecimal.valueOf(4))).doubleValue() == dResult);
    assertTrue(((BigDecimal)op.apply((Object)tc.wrap((double)18), bigDecimalMetaClass, (Object)BigDecimal.valueOf(4))).doubleValue() == dResult);
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

  public void testPower() throws Throwable {
    final ExtendedThreadContext tc = (ExtendedThreadContext)ThreadContext.getThreadContext();
    doTest(tc, tc.power(), 18 * 18 * 18 * 18, 18 * 18 * 18 * 18);
  }
}