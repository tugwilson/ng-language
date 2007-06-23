package ng.lang;

import junit.framework.TestCase;
import ng.runtime.*;

/**
 * @author John
 *
 */
public class MethodCallTest extends TestCase {
  public void testVoid() throws Throwable {
    final TestVoidTarget o = new TestVoidTarget();
    final ThreadContext tc = NgSystem.metaClassRegistry.getThreadContext();
   
      assertFalse(o.c0Called);
      tc.invokeMethodQuick(o, "c0");
      assertTrue(o.c0Called);
      
      assertFalse(o.c1Called);
      tc.invokeMethodQuick(o, "c1", (Object)null);
      assertTrue(o.c1Called);
      
      assertFalse(o.c2Called);
      tc.invokeMethodQuick(o, "c2", null, null);
      assertTrue(o.c2Called);
      
      assertFalse(o.c3Called);
      tc.invokeMethodQuick(o, "c3", null, null, null);
      assertTrue(o.c3Called);
      
      assertFalse(o.c4Called);
      tc.invokeMethodQuick(o, "c4", null, null, null, null);
      assertTrue(o.c4Called);
      
      assertTrue(((Integer)o.t1).intValue() == 1);
      assertTrue(((Integer)NgSystem.metaClassRegistry.getRuntimeMetaClass(o).getProperty(o, "t1")).intValue() == 1);
      assertTrue(((Integer)o.t1).intValue() == 1);
      
      assertFalse(o.cnCalled);
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).invokeMethod(o, "cn", new Object[]{null, null, null, null, null});
      assertTrue(o.cnCalled);
      
      assertTrue(((Integer)o.t1).intValue() == 1);
      assertTrue(((Integer)NgSystem.metaClassRegistry.getRuntimeMetaClass(o).setProperty(o, "t1", new Integer(2))).intValue() == 2);
      assertTrue(((Integer)o.t1).intValue() == 2);
      
      assertTrue(((Integer)o.t1).intValue() == 2);
      assertTrue(((Integer)NgSystem.metaClassRegistry.getRuntimeMetaClass(o).getProperty(o, "t1")).intValue() == 2);
      assertTrue(((Integer)o.t1).intValue() == 2);
      
      assertTrue(((Integer)o.t1).intValue() == 2);
      assertTrue(((Integer)NgSystem.metaClassRegistry.getRuntimeMetaClass(o).setField(o, "t1", new Integer(3))).intValue() == 3);
      assertTrue(((Integer)o.t1).intValue() == 3);
      
      assertTrue(((Integer)o.t1).intValue() == 3);
      assertTrue(((Integer)NgSystem.metaClassRegistry.getRuntimeMetaClass(o).getProperty(o, "t1")).intValue() == 3);
      assertTrue(((Integer)o.t1).intValue() == 3);
      
      assertTrue(o.t2 == null);
      assertTrue(((Integer)NgSystem.metaClassRegistry.getRuntimeMetaClass(o).setProperty(o, "t2", new Integer(1))).intValue() == 1);
      assertTrue(((Integer)o.t2).intValue() == 1);
      
      o.t2 = null;
      assertTrue(o.t2 == null);
      assertTrue(NgSystem.metaClassRegistry.getRuntimeMetaClass(o).getProperty(o, "t2") == null);
      assertTrue(o.t2 == null);
      
      assertTrue(o.t2 == null);
      assertTrue(((Integer)NgSystem.metaClassRegistry.getRuntimeMetaClass(o).setField(o, "t2", new Integer(2))).intValue() == 2);
      assertTrue(((Integer)o.t2).intValue() == 2);
      
      o.t2 = null;
      assertTrue(o.t2 == null);
      assertTrue(NgSystem.metaClassRegistry.getRuntimeMetaClass(o).getField(o, "t2") == null);
      assertTrue(o.t2 == null);
      
      assertTrue(((Integer)o.t3).intValue() == 2);
      assertTrue(((Integer)NgSystem.metaClassRegistry.getRuntimeMetaClass(o).setProperty(o, "t3", new Integer(2))).intValue() == 2);
      assertTrue(((Integer)o.t3).intValue() == 2);
      
      assertTrue(((Integer)o.t3).intValue() == 2);
      assertTrue(((Integer)NgSystem.metaClassRegistry.getRuntimeMetaClass(o).getProperty(o, "t3")).intValue() == 2);
      assertTrue(((Integer)o.t3).intValue() == 2);
      
      assertTrue(((Integer)o.t3).intValue() == 2);
      assertTrue(((Integer)NgSystem.metaClassRegistry.getRuntimeMetaClass(o).setField(o, "t3", new Integer(3))).intValue() == 3);
      assertTrue(((Integer)o.t3).intValue() == 3);
      
      assertTrue(((Integer)o.t3).intValue() == 3);
      assertTrue(((Integer)NgSystem.metaClassRegistry.getRuntimeMetaClass(o).getProperty(o, "t3")).intValue() == 3);
      assertTrue(((Integer)o.t3).intValue() == 3);
      
      assertTrue(o.t4 == null);
      assertTrue(((Integer)NgSystem.metaClassRegistry.getRuntimeMetaClass(o).setProperty(o, "t4", new Integer(1))).intValue() == 1);
      assertTrue(((Integer)o.t4).intValue() == 1);
      
      o.t4 = null;
      assertTrue(o.t4 == null);
      assertTrue(NgSystem.metaClassRegistry.getRuntimeMetaClass(o).getProperty(o, "t4") == NgNull.NULL_OBJECT);
      assertTrue(o.t4 == null);
      
      assertTrue(o.t4 == null);
      assertTrue(((Integer)NgSystem.metaClassRegistry.getRuntimeMetaClass(o).setField(o, "t4", new Integer(2))).intValue() == 2);
      assertTrue(((Integer)o.t4).intValue() == 2);
      
      o.t4 = null;
      assertTrue(o.t4 == null);
      assertTrue(NgSystem.metaClassRegistry.getRuntimeMetaClass(o).getField(o, "t4") == NgNull.NULL_OBJECT);
      assertTrue(o.t4 == null);
    }
  
  public void testBoolean() throws Throwable {
    final TestBooleanTarget o = new TestBooleanTarget();
    final ThreadContext tc = NgSystem.metaClassRegistry.getThreadContext();
    
      assertFalse(o.c0Called);
      assertTrue(((NgBoolean)tc.invokeMethodQuick(o, "c0")).getBooleanValue() == o.res);
      assertTrue(o.c0Called);
      
      assertFalse(o.c1Called);
      assertTrue(((NgBoolean)tc.invokeMethodQuick(o, "c1", (Object)null)).getBooleanValue() == o.res);
      assertTrue(o.c1Called);
      
      assertFalse(o.c2Called);
      assertTrue(((NgBoolean)tc.invokeMethodQuick(o, "c2", null, null)).getBooleanValue() == o.res);
      assertTrue(o.c2Called);
      
      assertFalse(o.c3Called);
      assertTrue(((NgBoolean)tc.invokeMethodQuick(o, "c3", null, null, null)).getBooleanValue() == o.res);
      assertTrue(o.c3Called);
      
      assertFalse(o.c4Called);
      assertTrue(((NgBoolean)tc.invokeMethodQuick(o, "c4", null, null, null, null)).getBooleanValue() == o.res);
      assertTrue(o.c4Called);
      
      assertFalse(o.cnCalled);
      assertTrue(((NgBoolean)NgSystem.metaClassRegistry.getRuntimeMetaClass(o).invokeMethod(o, "cn", new Object[]{null, null, null, null, null})).getBooleanValue() == o.res);
      assertTrue(o.cnCalled);
      
      assertFalse(o.value);
      assertTrue(((NgBoolean)NgSystem.metaClassRegistry.getRuntimeMetaClass(o).getProperty(o, "value")).getBooleanValue() == o.value);
      assertFalse(o.value);
      
      assertFalse(o.value);
      assertTrue(((NgBoolean)NgSystem.metaClassRegistry.getRuntimeMetaClass(o).setProperty(o, "value", NgBoolean.TRUE)).getBooleanValue() == o.value);
      assertTrue(o.value);
      
      assertFalse(o.value1);
      assertTrue(((NgBoolean)NgSystem.metaClassRegistry.getRuntimeMetaClass(o).getProperty(o, "value1")).getBooleanValue() == o.value1);
      assertFalse(o.value1);
      
      assertFalse(o.value1);
      assertTrue(((NgBoolean)NgSystem.metaClassRegistry.getRuntimeMetaClass(o).setProperty(o, "value1", NgBoolean.TRUE)).getBooleanValue() == true);
      assertTrue(o.value1);
      
      o.value1 = false;
      
      assertFalse(o.value1);
      assertTrue(((NgBoolean)NgSystem.metaClassRegistry.getRuntimeMetaClass(o).getField(o, "value1")).getBooleanValue() == o.value1);
      assertFalse(o.value1);
      
      assertFalse(o.value1);
      assertTrue(((NgBoolean)NgSystem.metaClassRegistry.getRuntimeMetaClass(o).setField(o, "value1", NgBoolean.TRUE)).getBooleanValue() == true);
      assertTrue(o.value1);
    }
  
  public void testChar() throws Throwable {
    final TestCharTarget o = new TestCharTarget();
    final ThreadContext tc = NgSystem.metaClassRegistry.getThreadContext();
    
      assertFalse(o.c0Called);
      assertTrue(((NgChar)tc.invokeMethodQuick(o, "c0")).getCharValue() == o.res);
      assertTrue(o.c0Called);
      
      assertFalse(o.c1Called);
      assertTrue(((NgChar)tc.invokeMethodQuick(o, "c1", (Object)null)).getCharValue() == o.res);
      assertTrue(o.c1Called);
      
      assertFalse(o.c2Called);
      assertTrue(((NgChar)tc.invokeMethodQuick(o, "c2", null, null)).getCharValue() == o.res);
      assertTrue(o.c2Called);
      
      assertFalse(o.c3Called);
      assertTrue(((NgChar)tc.invokeMethodQuick(o, "c3", null, null, null)).getCharValue() == o.res);
      assertTrue(o.c3Called);
      
      assertFalse(o.c4Called);
      assertTrue(((NgChar)tc.invokeMethodQuick(o, "c4", null, null, null, null)).getCharValue() == o.res);
      assertTrue(o.c4Called);
      
      assertFalse(o.cnCalled);
      assertTrue(((NgChar)NgSystem.metaClassRegistry.getRuntimeMetaClass(o).invokeMethod(o, "cn", new Object[]{null, null, null, null, null})).getCharValue() == o.res);
      assertTrue(o.cnCalled);
      
      assertTrue(o.value == (char)0);
      assertTrue(((NgChar)NgSystem.metaClassRegistry.getRuntimeMetaClass(o).getProperty(o, "value")).getCharValue() == o.value);
      assertTrue(o.value == (char)0);
      
      assertTrue(o.value == (char)0);
      assertTrue(((NgChar)NgSystem.metaClassRegistry.getRuntimeMetaClass(o).setProperty(o, "value", NgChar.valueOf((char)1))).getCharValue() == (char)1);
      assertTrue(o.value == (char)1);
      
      assertTrue(o.value1 == (char)0);
      assertTrue(((NgChar)NgSystem.metaClassRegistry.getRuntimeMetaClass(o).getProperty(o, "value1")).getCharValue() == o.value1);
      assertTrue(o.value1 == (char)0);
      
      assertTrue(o.value1 == (char)0);
      assertTrue(((NgChar)NgSystem.metaClassRegistry.getRuntimeMetaClass(o).setProperty(o, "value1", NgChar.valueOf((char)1))).getCharValue() == (char)1);
      assertTrue(o.value1 == (char)1);
      
      o.value1 = (char)0;
      assertTrue(o.value1 == (char)0);
      assertTrue(((NgChar)NgSystem.metaClassRegistry.getRuntimeMetaClass(o).getField(o, "value1")).getCharValue() == o.value1);
      assertTrue(o.value1 == (char)0);
      
      assertTrue(o.value1 == (char)0);
      assertTrue(((NgChar)NgSystem.metaClassRegistry.getRuntimeMetaClass(o).setField(o, "value1", NgChar.valueOf((char)1))).getCharValue() == (char)1);
      assertTrue(o.value1 == (char)1);
    }
  
  public void testByte() throws Throwable {
    final TestByteTarget o = new TestByteTarget();
    final ThreadContext tc = NgSystem.metaClassRegistry.getThreadContext();
    
      assertFalse(o.c0Called);
      assertTrue(((NgByte)tc.invokeMethodQuick(o, "c0")).getByteValue() == o.res);
      assertTrue(o.c0Called);
      
      assertFalse(o.c1Called);
      assertTrue(((NgByte)tc.invokeMethodQuick(o, "c1", (Object)null)).getByteValue() == o.res);
      assertTrue(o.c1Called);
      
      assertFalse(o.c2Called);
      assertTrue(((NgByte)tc.invokeMethodQuick(o, "c2", null, null)).getByteValue() == o.res);
      assertTrue(o.c2Called);
      
      assertFalse(o.c3Called);
      assertTrue(((NgByte)tc.invokeMethodQuick(o, "c3", null, null, null)).getByteValue() == o.res);
      assertTrue(o.c3Called);
      
      assertFalse(o.c4Called);
      assertTrue(((NgByte)tc.invokeMethodQuick(o, "c4", null, null, null, null)).getByteValue() == o.res);
      assertTrue(o.c4Called);
      
      assertFalse(o.cnCalled);
      assertTrue(((NgByte)NgSystem.metaClassRegistry.getRuntimeMetaClass(o).invokeMethod(o, "cn", new Object[]{null, null, null, null, null})).getByteValue() == o.res);
      assertTrue(o.cnCalled);
      
      assertTrue(o.value == (byte)0);
      assertTrue(((NgByte)NgSystem.metaClassRegistry.getRuntimeMetaClass(o).getProperty(o, "value")).getByteValue() == o.value);
      assertTrue(o.value == (byte)0);
      
      assertTrue(o.value == (byte)0);
      assertTrue(((NgByte)NgSystem.metaClassRegistry.getRuntimeMetaClass(o).setProperty(o, "value", NgByte.valueOf((byte)1))).getByteValue() == (byte)1);
      assertTrue(o.value == (byte)1);
      
      assertTrue(o.value1 == (byte)0);
      assertTrue(((NgByte)NgSystem.metaClassRegistry.getRuntimeMetaClass(o).getProperty(o, "value1")).getByteValue() == o.value1);
      assertTrue(o.value1 == (byte)0);
      
      assertTrue(o.value1 == (byte)0);
      assertTrue(((NgByte)NgSystem.metaClassRegistry.getRuntimeMetaClass(o).setProperty(o, "value1", NgByte.valueOf((byte)1))).getByteValue() == (byte)1);
      assertTrue(o.value1 == (byte)1);
      
      o.value1 = (byte)0;
      assertTrue(o.value1 == (byte)0);
      assertTrue(((NgByte)NgSystem.metaClassRegistry.getRuntimeMetaClass(o).getField(o, "value1")).getByteValue() == o.value1);
      assertTrue(o.value1 == (byte)0);
      
      assertTrue(o.value1 == (byte)0);
      assertTrue(((NgByte)NgSystem.metaClassRegistry.getRuntimeMetaClass(o).setField(o, "value1", NgByte.valueOf((byte)1))).getByteValue() == (byte)1);
      assertTrue(o.value1 == (byte)1);
    }
  
  public void testShort() throws Throwable {
    final TestShortTarget o = new TestShortTarget();
    final ThreadContext tc = NgSystem.metaClassRegistry.getThreadContext();
    
      assertFalse(o.c0Called);
      assertTrue(((NgShort)tc.invokeMethodQuick(o, "c0")).getShortValue() == o.res);
      assertTrue(o.c0Called);
      
      assertFalse(o.c1Called);
      assertTrue(((NgShort)tc.invokeMethodQuick(o, "c1", (Object)null)).getShortValue() == o.res);
      assertTrue(o.c1Called);
      
      assertFalse(o.c2Called);
      assertTrue(((NgShort)tc.invokeMethodQuick(o, "c2", null, null)).getShortValue() == o.res);
      assertTrue(o.c2Called);
      
      assertFalse(o.c3Called);
      assertTrue(((NgShort)tc.invokeMethodQuick(o, "c3", null, null, null)).getShortValue() == o.res);
      assertTrue(o.c3Called);
      
      assertFalse(o.c4Called);
      assertTrue(((NgShort)tc.invokeMethodQuick(o, "c4", null, null, null, null)).getShortValue() == o.res);
      assertTrue(o.c4Called);
      
      assertFalse(o.cnCalled);
      assertTrue(((NgShort)NgSystem.metaClassRegistry.getRuntimeMetaClass(o).invokeMethod(o, "cn", new Object[]{null, null, null, null, null})).getShortValue() == o.res);
      assertTrue(o.cnCalled);
      
      assertTrue(o.value == (short)0);
      assertTrue(((NgShort)NgSystem.metaClassRegistry.getRuntimeMetaClass(o).getProperty(o, "value")).getShortValue() == o.value);
      assertTrue(o.value == (short)0);
      
      assertTrue(o.value == (short)0);
      assertTrue(((NgShort)NgSystem.metaClassRegistry.getRuntimeMetaClass(o).setProperty(o, "value", NgShort.valueOf((short)1))).getShortValue() == (short)1);
      assertTrue(o.value == (short)1);
      
      assertTrue(o.value1 == (short)0);
      assertTrue(((NgShort)NgSystem.metaClassRegistry.getRuntimeMetaClass(o).getProperty(o, "value1")).getShortValue() == o.value1);
      assertTrue(o.value1 == (short)0);
      
      assertTrue(o.value1 == (short)0);
      assertTrue(((NgShort)NgSystem.metaClassRegistry.getRuntimeMetaClass(o).setProperty(o, "value1", NgShort.valueOf((short)1))).getShortValue() == (short)1);
      assertTrue(o.value1 == (short)1);
      
      o.value1 = (short)0;
      assertTrue(o.value1 == (short)0);
      assertTrue(((NgShort)NgSystem.metaClassRegistry.getRuntimeMetaClass(o).getField(o, "value1")).getShortValue() == o.value1);
      assertTrue(o.value1 == (short)0);
      
      assertTrue(o.value1 == (short)0);
      assertTrue(((NgShort)NgSystem.metaClassRegistry.getRuntimeMetaClass(o).setField(o, "value1", NgShort.valueOf((short)1))).getShortValue() == (short)1);
      assertTrue(o.value1 == (short)1);
    }
  
  public void testInt() throws Throwable {
    final TestIntTarget o = new TestIntTarget();
    final ThreadContext tc = NgSystem.metaClassRegistry.getThreadContext();
    
      assertFalse(o.c0Called);
      assertTrue(((NgInt)tc.invokeMethodQuick(o, "c0")).getIntValue() == o.res);
      assertTrue(o.c0Called);
      
      assertFalse(o.c1Called);
      assertTrue(((NgInt)tc.invokeMethodQuick(o, "c1", (Object)null)).getIntValue() == o.res);
      assertTrue(o.c1Called);
      
      assertFalse(o.c2Called);
      assertTrue(((NgInt)tc.invokeMethodQuick(o, "c2", null, null)).getIntValue() == o.res);
      assertTrue(o.c2Called);
      
      assertFalse(o.c3Called);
      assertTrue(((NgInt)tc.invokeMethodQuick(o, "c3", null, null, null)).getIntValue() == o.res);
      assertTrue(o.c3Called);
      
      assertFalse(o.c4Called);
      assertTrue(((NgInt)tc.invokeMethodQuick(o, "c4", null, null, null, null)).getIntValue() == o.res);
      assertTrue(o.c4Called);
      
      assertFalse(o.cnCalled);
      assertTrue(((NgInt)NgSystem.metaClassRegistry.getRuntimeMetaClass(o).invokeMethod(o, "cn", new Object[]{null, null, null, null, null})).getIntValue() == o.res);
      assertTrue(o.cnCalled);
      
      assertTrue(o.value == (int)0);
      assertTrue(((NgInt)NgSystem.metaClassRegistry.getRuntimeMetaClass(o).getProperty(o, "value")).getIntValue() == o.value);
      assertTrue(o.value == (int)0);
      
      assertTrue(o.value == (int)0);
      assertTrue(((NgInt)NgSystem.metaClassRegistry.getRuntimeMetaClass(o).setProperty(o, "value", NgInt.valueOf((int)1))).getIntValue() ==  (int)1);
      assertTrue(o.value == (int)1);
      
      assertTrue(o.value1 == (int)0);
      assertTrue(((NgInt)NgSystem.metaClassRegistry.getRuntimeMetaClass(o).getProperty(o, "value1")).getIntValue() == o.value1);
      assertTrue(o.value1 == (int)0);
      
      assertTrue(o.value1 == (int)0);
      assertTrue(((NgInt)NgSystem.metaClassRegistry.getRuntimeMetaClass(o).setProperty(o, "value1", NgInt.valueOf((int)1))).getIntValue() ==  (int)1);
      assertTrue(o.value1 == (int)1);
      
      o.value1 = (int)0;
      assertTrue(o.value1 == (int)0);
      assertTrue(((NgInt)NgSystem.metaClassRegistry.getRuntimeMetaClass(o).getField(o, "value1")).getIntValue() == o.value1);
      assertTrue(o.value1 == (int)0);
      
      assertTrue(o.value1 == (int)0);
      assertTrue(((NgInt)NgSystem.metaClassRegistry.getRuntimeMetaClass(o).setField(o, "value1", NgInt.valueOf((int)1))).getIntValue() ==  (int)1);
      assertTrue(o.value1 == (int)1);
 }
  
  public void testLong() throws Throwable {
    final TestLongTarget o = new TestLongTarget();
    final ThreadContext tc = NgSystem.metaClassRegistry.getThreadContext();
    
      assertFalse(o.c0Called);
      assertTrue(((NgLong)tc.invokeMethodQuick(o, "c0")).getLongValue() == o.res);
      assertTrue(o.c0Called);
      
      assertFalse(o.c1Called);
      assertTrue(((NgLong)tc.invokeMethodQuick(o, "c1", (Object)null)).getLongValue() == o.res);
      assertTrue(o.c1Called);
      
      assertFalse(o.c2Called);
      assertTrue(((NgLong)tc.invokeMethodQuick(o, "c2", null, null)).getLongValue() == o.res);
      assertTrue(o.c2Called);
      
      assertFalse(o.c3Called);
      assertTrue(((NgLong)tc.invokeMethodQuick(o, "c3", null, null, null)).getLongValue() == o.res);
      assertTrue(o.c3Called);
      
      assertFalse(o.c4Called);
      assertTrue(((NgLong)tc.invokeMethodQuick(o, "c4", null, null, null, null)).getLongValue() == o.res);
      assertTrue(o.c4Called);
      
      assertFalse(o.cnCalled);
      assertTrue(((NgLong)NgSystem.metaClassRegistry.getRuntimeMetaClass(o).invokeMethod(o, "cn", new Object[]{null, null, null, null, null})).getLongValue() == o.res);
      assertTrue(o.cnCalled);
      
      assertTrue(o.value == (long)0);
      assertTrue(((NgLong)NgSystem.metaClassRegistry.getRuntimeMetaClass(o).getProperty(o, "value")).getLongValue() == o.value);
      assertTrue(o.value == (long)0);
      
      assertTrue(o.value == (long)0);
      assertTrue(((NgLong)NgSystem.metaClassRegistry.getRuntimeMetaClass(o).setProperty(o, "value", NgLong.valueOf((long)1))).getLongValue() == (long)1);
      assertTrue(o.value == (long)1);
      
      assertTrue(o.value1 == (long)0);
      assertTrue(((NgLong)NgSystem.metaClassRegistry.getRuntimeMetaClass(o).getProperty(o, "value1")).getLongValue() == o.value1);
      assertTrue(o.value1 == (long)0);
      
      assertTrue(o.value1 == (long)0);
      assertTrue(((NgLong)NgSystem.metaClassRegistry.getRuntimeMetaClass(o).setProperty(o, "value1", NgLong.valueOf((long)1))).getLongValue() == (long)1);
      assertTrue(o.value1 == (long)1);
      
      o.value1 = (long)0;
      assertTrue(o.value1 == (long)0);
      assertTrue(((NgLong)NgSystem.metaClassRegistry.getRuntimeMetaClass(o).getField(o, "value1")).getLongValue() == o.value1);
      assertTrue(o.value1 == (long)0);
      
      assertTrue(o.value1 == (long)0);
      assertTrue(((NgLong)NgSystem.metaClassRegistry.getRuntimeMetaClass(o).setField(o, "value1", NgLong.valueOf((long)1))).getLongValue() == (long)1);
      assertTrue(o.value1 == (long)1);
    }
  
  public void testFloat() throws Throwable {
    final TestFloatTarget o = new TestFloatTarget();
    final ThreadContext tc = NgSystem.metaClassRegistry.getThreadContext();
    
      assertFalse(o.c0Called);
      assertTrue(((NgFloat)tc.invokeMethodQuick(o, "c0")).getFloatValue() == o.res);
      assertTrue(o.c0Called);
      
      assertFalse(o.c1Called);
      assertTrue(((NgFloat)tc.invokeMethodQuick(o, "c1", (Object)null)).getFloatValue() == o.res);
      assertTrue(o.c1Called);
      
      assertFalse(o.c2Called);
      assertTrue(((NgFloat)tc.invokeMethodQuick(o, "c2", null, null)).getFloatValue() == o.res);
      assertTrue(o.c2Called);
      
      assertFalse(o.c3Called);
      assertTrue(((NgFloat)tc.invokeMethodQuick(o, "c3", null, null, null)).getFloatValue() == o.res);
      assertTrue(o.c3Called);
      
      assertFalse(o.c4Called);
      assertTrue(((NgFloat)tc.invokeMethodQuick(o, "c4", null, null, null, null)).getFloatValue() == o.res);
      assertTrue(o.c4Called);
      
      assertFalse(o.cnCalled);
      assertTrue(((NgFloat)NgSystem.metaClassRegistry.getRuntimeMetaClass(o).invokeMethod(o, "cn", new Object[]{null, null, null, null, null})).getFloatValue() == o.res);
      assertTrue(o.cnCalled);
      
      assertTrue(o.value == (float)0);
      assertTrue(((NgFloat)NgSystem.metaClassRegistry.getRuntimeMetaClass(o).getProperty(o, "value")).getFloatValue() == o.value);
      assertTrue(o.value == (float)0);
      
      assertTrue(o.value == (float)0);
      assertTrue(((NgFloat)NgSystem.metaClassRegistry.getRuntimeMetaClass(o).setProperty(o, "value", NgFloat.valueOf((float)1))).getFloatValue() == (float)1);
      assertTrue(o.value == (float)1);
      
      assertTrue(o.value1 == (float)0);
      assertTrue(((NgFloat)NgSystem.metaClassRegistry.getRuntimeMetaClass(o).getProperty(o, "value1")).getFloatValue() == o.value1);
      assertTrue(o.value1 == (float)0);
      
      assertTrue(o.value1 == (float)0);
      assertTrue(((NgFloat)NgSystem.metaClassRegistry.getRuntimeMetaClass(o).setProperty(o, "value1", NgFloat.valueOf((float)1))).getFloatValue() == (float)1);
      assertTrue(o.value1 == (float)1);
      
      o.value1 = (float)0;
      assertTrue(o.value1 == (float)0);
      assertTrue(((NgFloat)NgSystem.metaClassRegistry.getRuntimeMetaClass(o).getField(o, "value1")).getFloatValue() == o.value1);
      assertTrue(o.value1 == (float)0);
      
      assertTrue(o.value1 == (float)0);
      assertTrue(((NgFloat)NgSystem.metaClassRegistry.getRuntimeMetaClass(o).setField(o, "value1", NgFloat.valueOf((float)1))).getFloatValue() == (float)1);
      assertTrue(o.value1 == (float)1);
    }
  
  public void testDouble() throws Throwable {
    final TestDoubleTarget o = new TestDoubleTarget();
    final ThreadContext tc = NgSystem.metaClassRegistry.getThreadContext();
    
      assertFalse(o.c0Called);
      assertTrue(((NgDouble)tc.invokeMethodQuick(o, "c0")).getDoubleValue() == o.res);
      assertTrue(o.c0Called);
      
      assertFalse(o.c1Called);
      assertTrue(((NgDouble)tc.invokeMethodQuick(o, "c1", (Object)null)).getDoubleValue() == o.res);
      assertTrue(o.c1Called);
      
      assertFalse(o.c2Called);
      assertTrue(((NgDouble)tc.invokeMethodQuick(o, "c2", null, null)).getDoubleValue() == o.res);
      assertTrue(o.c2Called);
      
      assertFalse(o.c3Called);
      assertTrue(((NgDouble)tc.invokeMethodQuick(o, "c3", null, null, null)).getDoubleValue() == o.res);
      assertTrue(o.c3Called);
      
      assertFalse(o.c4Called);
      assertTrue(((NgDouble)tc.invokeMethodQuick(o, "c4", null, null, null, null)).getDoubleValue() == o.res);
      assertTrue(o.c4Called);
      
      assertFalse(o.cnCalled);
      assertTrue(((NgDouble)NgSystem.metaClassRegistry.getRuntimeMetaClass(o).invokeMethod(o, "cn", new Object[]{null, null, null, null, null})).getDoubleValue() == o.res);
      assertTrue(o.cnCalled);
      
      assertTrue(o.value == (double)0);
      assertTrue(((NgDouble)NgSystem.metaClassRegistry.getRuntimeMetaClass(o).getProperty(o, "value")).getDoubleValue() == o.value);
      assertTrue(o.value == (double)0);
      
      assertTrue(o.value == (double)0);
      assertTrue(((NgDouble)NgSystem.metaClassRegistry.getRuntimeMetaClass(o).setProperty(o, "value", NgDouble.valueOf((double)1))).getDoubleValue() == (double)1);
      assertTrue(o.value == (double)1);
      
      assertTrue(o.value1 == (double)0);
      assertTrue(((NgDouble)NgSystem.metaClassRegistry.getRuntimeMetaClass(o).getProperty(o, "value1")).getDoubleValue() == o.value1);
      assertTrue(o.value1 == (double)0);
      
      assertTrue(o.value1 == (double)0);
      assertTrue(((NgDouble)NgSystem.metaClassRegistry.getRuntimeMetaClass(o).setProperty(o, "value1", NgDouble.valueOf((double)1))).getDoubleValue() == (double)1);
      assertTrue(o.value1 == (double)1);
      
      o.value1 = (double)0;
      assertTrue(o.value1 == (double)0);
      assertTrue(((NgDouble)NgSystem.metaClassRegistry.getRuntimeMetaClass(o).getField(o, "value1")).getDoubleValue() == o.value1);
      assertTrue(o.value1 == (double)0);
      
      assertTrue(o.value1 == (double)0);
      assertTrue(((NgDouble)NgSystem.metaClassRegistry.getRuntimeMetaClass(o).setField(o, "value1", NgDouble.valueOf((double)1))).getDoubleValue() == (double)1);
      assertTrue(o.value1 == (double)1);
    }
}

class TestVoidTarget {
  public boolean c0Called = false;
  public boolean c1Called = false;
  public boolean c2Called = false;
  public boolean c3Called = false;
  public boolean c4Called = false;
  public boolean cnCalled = false;
  
  public Object t1 = new Integer(1);
  public Object t2 = null;
  public Integer t3 = new Integer(2);
  public Integer t4 = null;
  
  public void c0() throws Throwable {
    this.c0Called = true;
  }
  
  public void c1(final Object o1) {
    this.c1Called = true;
  }
  
  public void c2(final Object o1, final Object o2) {
    this.c2Called = true;
  }
  
  public void c3(final Object o1, final Object o2, final Object o3) {
    this.c3Called = true;
  }
  
  public void c4(final Object o1, final Object o2, final Object o3, final Object o4) {
    this.c4Called = true;
  }
  
  public void cn(final Object o1, final Object o2, final Object o3, final Object o4, final Object o5) {
    this.cnCalled = true;
  }

  /**
   * @return the t1
   */
  public Object getT1() throws Throwable {
    return this.t1;
  }

  /**
   * @param t1 the t1 to set
   */
  public void setT1(final Object t1) {
    this.t1 = t1;
  }

  /**
   * @return the t2
   */
  public Object getT2() throws Throwable {
    return this.t2;
  }

  /**
   * @param t2 the t2 to set
   */
  public void setT2(final Object t2) {
    this.t2 = t2;
  }

  /**
   * @return the t3
   */
  public Integer getT3() throws Throwable {
    return this.t3;
  }

  /**
   * @param t3 the t3 to set
   */
  public void setT3(final Integer t3) {
    this.t3 = t3;
  }

  /**
   * @return the t4
   */
  public Integer getT4() throws Throwable {
    return this.t4;
  }

  /**
   * @param t4 the t4 to set
   */
  public void setT4(final Integer t4) {
    this.t4 = t4;
  }
}

class TestBooleanTarget {
  public boolean c0Called = false;
  public boolean c1Called = false;
  public boolean c2Called = false;
  public boolean c3Called = false;
  public boolean c4Called = false;
  public boolean cnCalled = false;
  
  public final boolean res = true;
  
  public boolean value = false;
  public boolean value1 = false;
  
  public boolean c0() throws Throwable {
    this.c0Called = true;
    return this.res;
  }
  
  public boolean c1(final Object o1) {
    this.c1Called = true;
    return this.res;
  }
  
  public boolean c2(final Object o1, final Object o2) {
    this.c2Called = true;
    return this.res;
  }
  
  public boolean c3(final Object o1, final Object o2, final Object o3) {
    this.c3Called = true;
    return this.res;
  }
  
  public boolean c4(final Object o1, final Object o2, final Object o3, final Object o4) {
    this.c4Called = true;
    return this.res;
  }
  
  public boolean cn(final Object o1, final Object o2, final Object o3, final Object o4, final Object o5) {
    this.cnCalled = true;
    return this.res;
 }

  /**
   * @return the value
   */
  public boolean isValue() throws Throwable {
    return this.value;
  }

  /**
   * @param value the value to set
   */
  public void setValue(final boolean value) {
    this.value = value;
  }
}

class TestCharTarget {
  public boolean c0Called = false;
  public boolean c1Called = false;
  public boolean c2Called = false;
  public boolean c3Called = false;
  public boolean c4Called = false;
  public boolean cnCalled = false;
  
  public final char res = 'a';
  
  public char value = 0;
  public char value1 = 0;
  
  public char c0() throws Throwable {
    this.c0Called = true;
    return this.res;
  }
  
  public char c1(final Object o1) {
    this.c1Called = true;
    return this.res;
  }
  
  public char c2(final Object o1, final Object o2) {
    this.c2Called = true;
    return this.res;
  }
  
  public char c3(final Object o1, final Object o2, final Object o3) {
    this.c3Called = true;
    return this.res;
  }
  
  public char c4(final Object o1, final Object o2, final Object o3, final Object o4) {
    this.c4Called = true;
    return this.res;
  }
  
  public char cn(final Object o1, final Object o2, final Object o3, final Object o4, final Object o5) {
    this.cnCalled = true;
    return this.res;
 }

  /**
   * @return the value
   */
  public char getValue() throws Throwable {
    return this.value;
  }

  /**
   * @param val the value to set
   */
  public void setValue(final char value) {
    this.value = value;
  }
}

class TestByteTarget {
  public boolean c0Called = false;
  public boolean c1Called = false;
  public boolean c2Called = false;
  public boolean c3Called = false;
  public boolean c4Called = false;
  public boolean cnCalled = false;
  
  public final byte res = 'a';
  
  public byte value = 0;
  public byte value1 = 0;
  
  public byte c0() throws Throwable {
    this.c0Called = true;
    return this.res;
  }
  
  public byte c1(final Object o1) {
    this.c1Called = true;
    return this.res;
  }
  
  public byte c2(final Object o1, final Object o2) {
    this.c2Called = true;
    return this.res;
  }
  
  public byte c3(final Object o1, final Object o2, final Object o3) {
    this.c3Called = true;
    return this.res;
  }
  
  public byte c4(final Object o1, final Object o2, final Object o3, final Object o4) {
    this.c4Called = true;
    return this.res;
  }
  
  public byte cn(final Object o1, final Object o2, final Object o3, final Object o4, final Object o5) {
    this.cnCalled = true;
    return this.res;
 }

  /**
   * @return the value
   */
  public byte getValue() throws Throwable {
    return this.value;
  }

  /**
   * @param value the value to set
   */
  public void setValue(final byte value) {
    this.value = value;
  }
}

class TestShortTarget {
  public boolean c0Called = false;
  public boolean c1Called = false;
  public boolean c2Called = false;
  public boolean c3Called = false;
  public boolean c4Called = false;
  public boolean cnCalled = false;
  
  public final short res = 'a';
  
  public short value = 0;
  public short value1 = 0;
  
  public short c0() throws Throwable {
    this.c0Called = true;
    return this.res;
  }
  
  public short c1(final Object o1) {
    this.c1Called = true;
    return this.res;
  }
  
  public short c2(final Object o1, final Object o2) {
    this.c2Called = true;
    return this.res;
  }
  
  public short c3(final Object o1, final Object o2, final Object o3) {
    this.c3Called = true;
    return this.res;
  }
  
  public short c4(final Object o1, final Object o2, final Object o3, final Object o4) {
    this.c4Called = true;
    return this.res;
  }
  
  public short cn(final Object o1, final Object o2, final Object o3, final Object o4, final Object o5) {
    this.cnCalled = true;
    return this.res;
 }

  /**
   * @return the value
   */
  public short getValue() throws Throwable {
    return this.value;
  }

  /**
   * @param value the value to set
   */
  public void setValue(final short value) {
    this.value = value;
  }
}

class TestIntTarget {
  public boolean c0Called = false;
  public boolean c1Called = false;
  public boolean c2Called = false;
  public boolean c3Called = false;
  public boolean c4Called = false;
  public boolean cnCalled = false;
  
  public final int res = 'a';
  
  public int value = 0;
  public int value1 = 0;
  
  public int c0() throws Throwable {
    this.c0Called = true;
    return this.res;
  }
  
  public int c1(final Object o1) {
    this.c1Called = true;
    return this.res;
  }
  
  public int c2(final Object o1, final Object o2) {
    this.c2Called = true;
    return this.res;
  }
  
  public int c3(final Object o1, final Object o2, final Object o3) {
    this.c3Called = true;
    return this.res;
  }
  
  public int c4(final Object o1, final Object o2, final Object o3, final Object o4) {
    this.c4Called = true;
    return this.res;
  }
  
  public int cn(final Object o1, final Object o2, final Object o3, final Object o4, final Object o5) {
    this.cnCalled = true;
    return this.res;
 }

  /**
   * @return the value
   */
  public int getValue() throws Throwable {
    return this.value;
  }

  /**
   * @param value the value to set
   */
  public void setValue(final int value) {
    this.value = value;
  }
}

class TestLongTarget {
  public boolean c0Called = false;
  public boolean c1Called = false;
  public boolean c2Called = false;
  public boolean c3Called = false;
  public boolean c4Called = false;
  public boolean cnCalled = false;
  
  public final long res = 'a';
  
  public long value = 0;
  public long value1 = 0;
  
  public long c0() throws Throwable {
    this.c0Called = true;
    return this.res;
  }
  
  public long c1(final Object o1) {
    this.c1Called = true;
    return this.res;
  }
  
  public long c2(final Object o1, final Object o2) {
    this.c2Called = true;
    return this.res;
  }
  
  public long c3(final Object o1, final Object o2, final Object o3) {
    this.c3Called = true;
    return this.res;
  }
  
  public long c4(final Object o1, final Object o2, final Object o3, final Object o4) {
    this.c4Called = true;
    return this.res;
  }
  
  public long cn(final Object o1, final Object o2, final Object o3, final Object o4, final Object o5) {
    this.cnCalled = true;
    return this.res;
 }

  /**
   * @return the value
   */
  public long getValue() throws Throwable {
    return this.value;
  }

  /**
   * @param value the value to set
   */
  public void setValue(final long value) {
    this.value = value;
  }
}

class TestFloatTarget {
  public boolean c0Called = false;
  public boolean c1Called = false;
  public boolean c2Called = false;
  public boolean c3Called = false;
  public boolean c4Called = false;
  public boolean cnCalled = false;
  
  public final float res = 'a';
  
  public float value = 0;
  public float value1 = 0;
  
  public float c0() throws Throwable {
    this.c0Called = true;
    return this.res;
  }
  
  public float c1(final Object o1) {
    this.c1Called = true;
    return this.res;
  }
  
  public float c2(final Object o1, final Object o2) {
    this.c2Called = true;
    return this.res;
  }
  
  public float c3(final Object o1, final Object o2, final Object o3) {
    this.c3Called = true;
    return this.res;
  }
  
  public float c4(final Object o1, final Object o2, final Object o3, final Object o4) {
    this.c4Called = true;
    return this.res;
  }
  
  public float cn(final Object o1, final Object o2, final Object o3, final Object o4, final Object o5) {
    this.cnCalled = true;
    return this.res;
 }

  /**
   * @return the value
   */
  public float getValue() throws Throwable {
    return this.value;
  }

  /**
   * @param value the value to set
   */
  public void setValue(final float value) {
    this.value = value;
  }
}

class TestDoubleTarget {
  public boolean c0Called = false;
  public boolean c1Called = false;
  public boolean c2Called = false;
  public boolean c3Called = false;
  public boolean c4Called = false;
  public boolean cnCalled = false;
  
  public final double res = 'a';
  public double value1 = 0;
  
  public double value = 0;
  
  public double c0() throws Throwable {
    this.c0Called = true;
    return this.res;
  }
  
  public double c1(final Object o1) {
    this.c1Called = true;
    return this.res;
  }
  
  public double c2(final Object o1, final Object o2) {
    this.c2Called = true;
    return this.res;
  }
  
  public double c3(final Object o1, final Object o2, final Object o3) {
    this.c3Called = true;
    return this.res;
  }
  
  public double c4(final Object o1, final Object o2, final Object o3, final Object o4) {
    this.c4Called = true;
    return this.res;
  }
  
  public double cn(final Object o1, final Object o2, final Object o3, final Object o4, final Object o5) {
    this.cnCalled = true;
    return this.res;
 }

  /**
   * @return the value
   */
  public double getValue() throws Throwable {
    return this.value;
  }

  /**
   * @param value the value to set
   */
  public void setValue(final double value) {
    this.value = value;
  }
}
