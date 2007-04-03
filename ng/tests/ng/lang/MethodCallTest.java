package ng.lang;

import junit.framework.TestCase;
import ng.runtime.NgBoolean;
import ng.runtime.NgByte;
import ng.runtime.NgChar;
import ng.runtime.NgDouble;
import ng.runtime.NgFloat;
import ng.runtime.NgInt;
import ng.runtime.NgLong;
import ng.runtime.NgNull;
import ng.runtime.NgShort;

/**
 * @author John
 *
 */
public class MethodCallTest extends TestCase {
  public void testVoid() {
    final TestVoidTarget o = new TestVoidTarget();
    
      assertFalse(o.c0Called);
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).invokeMethodQuick(o, "c0");
      assertTrue(o.c0Called);
      
      assertFalse(o.c1Called);
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).invokeMethodQuick(o, "c1", null);
      assertTrue(o.c1Called);
      
      assertFalse(o.c2Called);
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).invokeMethodQuick(o, "c2", null, null);
      assertTrue(o.c2Called);
      
      assertFalse(o.c3Called);
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).invokeMethodQuick(o, "c3", null, null, null);
      assertTrue(o.c3Called);
      
      assertFalse(o.c4Called);
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).invokeMethodQuick(o, "c4", null, null, null, null);
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
  
  public void testBoolean() {
    final TestBooleanTarget o = new TestBooleanTarget();
    
      assertFalse(o.c0Called);
      assertTrue(((NgBoolean)NgSystem.metaClassRegistry.getRuntimeMetaClass(o).invokeMethodQuick(o, "c0")).getBooleanValue() == o.res);
      assertTrue(o.c0Called);
      
      assertFalse(o.c1Called);
      assertTrue(((NgBoolean)NgSystem.metaClassRegistry.getRuntimeMetaClass(o).invokeMethodQuick(o, "c1", null)).getBooleanValue() == o.res);
      assertTrue(o.c1Called);
      
      assertFalse(o.c2Called);
      assertTrue(((NgBoolean)NgSystem.metaClassRegistry.getRuntimeMetaClass(o).invokeMethodQuick(o, "c2", null, null)).getBooleanValue() == o.res);
      assertTrue(o.c2Called);
      
      assertFalse(o.c3Called);
      assertTrue(((NgBoolean)NgSystem.metaClassRegistry.getRuntimeMetaClass(o).invokeMethodQuick(o, "c3", null, null, null)).getBooleanValue() == o.res);
      assertTrue(o.c3Called);
      
      assertFalse(o.c4Called);
      assertTrue(((NgBoolean)NgSystem.metaClassRegistry.getRuntimeMetaClass(o).invokeMethodQuick(o, "c4", null, null, null, null)).getBooleanValue() == o.res);
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
  
  public void testChar() {
    final TestCharTarget o = new TestCharTarget();
    
      assertFalse(o.c0Called);
      assertTrue(((NgChar)NgSystem.metaClassRegistry.getRuntimeMetaClass(o).invokeMethodQuick(o, "c0")).getCharValue() == o.res);
      assertTrue(o.c0Called);
      
      assertFalse(o.c1Called);
      assertTrue(((NgChar)NgSystem.metaClassRegistry.getRuntimeMetaClass(o).invokeMethodQuick(o, "c1", null)).getCharValue() == o.res);
      assertTrue(o.c1Called);
      
      assertFalse(o.c2Called);
      assertTrue(((NgChar)NgSystem.metaClassRegistry.getRuntimeMetaClass(o).invokeMethodQuick(o, "c2", null, null)).getCharValue() == o.res);
      assertTrue(o.c2Called);
      
      assertFalse(o.c3Called);
      assertTrue(((NgChar)NgSystem.metaClassRegistry.getRuntimeMetaClass(o).invokeMethodQuick(o, "c3", null, null, null)).getCharValue() == o.res);
      assertTrue(o.c3Called);
      
      assertFalse(o.c4Called);
      assertTrue(((NgChar)NgSystem.metaClassRegistry.getRuntimeMetaClass(o).invokeMethodQuick(o, "c4", null, null, null, null)).getCharValue() == o.res);
      assertTrue(o.c4Called);
      
      assertFalse(o.cnCalled);
      assertTrue(((NgChar)NgSystem.metaClassRegistry.getRuntimeMetaClass(o).invokeMethod(o, "cn", new Object[]{null, null, null, null, null})).getCharValue() == o.res);
      assertTrue(o.cnCalled);
      
      assertTrue(o.value == (char)0);
      assertTrue(((NgChar)NgSystem.metaClassRegistry.getRuntimeMetaClass(o).getProperty(o, "value")).getCharValue() == o.value);
      assertTrue(o.value == (char)0);
      
      assertTrue(o.value == (char)0);
      assertTrue(((NgChar)NgSystem.metaClassRegistry.getRuntimeMetaClass(o).setProperty(o, "value", new NgChar((char)1))).getCharValue() == (char)1);
      assertTrue(o.value == (char)1);
      
      assertTrue(o.value1 == (char)0);
      assertTrue(((NgChar)NgSystem.metaClassRegistry.getRuntimeMetaClass(o).getProperty(o, "value1")).getCharValue() == o.value1);
      assertTrue(o.value1 == (char)0);
      
      assertTrue(o.value1 == (char)0);
      assertTrue(((NgChar)NgSystem.metaClassRegistry.getRuntimeMetaClass(o).setProperty(o, "value1", new NgChar((char)1))).getCharValue() == (char)1);
      assertTrue(o.value1 == (char)1);
      
      o.value1 = (char)0;
      assertTrue(o.value1 == (char)0);
      assertTrue(((NgChar)NgSystem.metaClassRegistry.getRuntimeMetaClass(o).getField(o, "value1")).getCharValue() == o.value1);
      assertTrue(o.value1 == (char)0);
      
      assertTrue(o.value1 == (char)0);
      assertTrue(((NgChar)NgSystem.metaClassRegistry.getRuntimeMetaClass(o).setField(o, "value1", new NgChar((char)1))).getCharValue() == (char)1);
      assertTrue(o.value1 == (char)1);
    }
  
  public void testByte() {
    final TestByteTarget o = new TestByteTarget();
    
      assertFalse(o.c0Called);
      assertTrue(((NgByte)NgSystem.metaClassRegistry.getRuntimeMetaClass(o).invokeMethodQuick(o, "c0")).getByteValue() == o.res);
      assertTrue(o.c0Called);
      
      assertFalse(o.c1Called);
      assertTrue(((NgByte)NgSystem.metaClassRegistry.getRuntimeMetaClass(o).invokeMethodQuick(o, "c1", null)).getByteValue() == o.res);
      assertTrue(o.c1Called);
      
      assertFalse(o.c2Called);
      assertTrue(((NgByte)NgSystem.metaClassRegistry.getRuntimeMetaClass(o).invokeMethodQuick(o, "c2", null, null)).getByteValue() == o.res);
      assertTrue(o.c2Called);
      
      assertFalse(o.c3Called);
      assertTrue(((NgByte)NgSystem.metaClassRegistry.getRuntimeMetaClass(o).invokeMethodQuick(o, "c3", null, null, null)).getByteValue() == o.res);
      assertTrue(o.c3Called);
      
      assertFalse(o.c4Called);
      assertTrue(((NgByte)NgSystem.metaClassRegistry.getRuntimeMetaClass(o).invokeMethodQuick(o, "c4", null, null, null, null)).getByteValue() == o.res);
      assertTrue(o.c4Called);
      
      assertFalse(o.cnCalled);
      assertTrue(((NgByte)NgSystem.metaClassRegistry.getRuntimeMetaClass(o).invokeMethod(o, "cn", new Object[]{null, null, null, null, null})).getByteValue() == o.res);
      assertTrue(o.cnCalled);
      
      assertTrue(o.value == (byte)0);
      assertTrue(((NgByte)NgSystem.metaClassRegistry.getRuntimeMetaClass(o).getProperty(o, "value")).getByteValue() == o.value);
      assertTrue(o.value == (byte)0);
      
      assertTrue(o.value == (byte)0);
      assertTrue(((NgByte)NgSystem.metaClassRegistry.getRuntimeMetaClass(o).setProperty(o, "value", new NgByte((byte)1))).getByteValue() == (byte)1);
      assertTrue(o.value == (byte)1);
      
      assertTrue(o.value1 == (byte)0);
      assertTrue(((NgByte)NgSystem.metaClassRegistry.getRuntimeMetaClass(o).getProperty(o, "value1")).getByteValue() == o.value1);
      assertTrue(o.value1 == (byte)0);
      
      assertTrue(o.value1 == (byte)0);
      assertTrue(((NgByte)NgSystem.metaClassRegistry.getRuntimeMetaClass(o).setProperty(o, "value1", new NgByte((byte)1))).getByteValue() == (byte)1);
      assertTrue(o.value1 == (byte)1);
      
      o.value1 = (byte)0;
      assertTrue(o.value1 == (byte)0);
      assertTrue(((NgByte)NgSystem.metaClassRegistry.getRuntimeMetaClass(o).getField(o, "value1")).getByteValue() == o.value1);
      assertTrue(o.value1 == (byte)0);
      
      assertTrue(o.value1 == (byte)0);
      assertTrue(((NgByte)NgSystem.metaClassRegistry.getRuntimeMetaClass(o).setField(o, "value1", new NgByte((byte)1))).getByteValue() == (byte)1);
      assertTrue(o.value1 == (byte)1);
    }
  
  public void testShort() {
    final TestShortTarget o = new TestShortTarget();
    
      assertFalse(o.c0Called);
      assertTrue(((NgShort)NgSystem.metaClassRegistry.getRuntimeMetaClass(o).invokeMethodQuick(o, "c0")).getShortValue() == o.res);
      assertTrue(o.c0Called);
      
      assertFalse(o.c1Called);
      assertTrue(((NgShort)NgSystem.metaClassRegistry.getRuntimeMetaClass(o).invokeMethodQuick(o, "c1", null)).getShortValue() == o.res);
      assertTrue(o.c1Called);
      
      assertFalse(o.c2Called);
      assertTrue(((NgShort)NgSystem.metaClassRegistry.getRuntimeMetaClass(o).invokeMethodQuick(o, "c2", null, null)).getShortValue() == o.res);
      assertTrue(o.c2Called);
      
      assertFalse(o.c3Called);
      assertTrue(((NgShort)NgSystem.metaClassRegistry.getRuntimeMetaClass(o).invokeMethodQuick(o, "c3", null, null, null)).getShortValue() == o.res);
      assertTrue(o.c3Called);
      
      assertFalse(o.c4Called);
      assertTrue(((NgShort)NgSystem.metaClassRegistry.getRuntimeMetaClass(o).invokeMethodQuick(o, "c4", null, null, null, null)).getShortValue() == o.res);
      assertTrue(o.c4Called);
      
      assertFalse(o.cnCalled);
      assertTrue(((NgShort)NgSystem.metaClassRegistry.getRuntimeMetaClass(o).invokeMethod(o, "cn", new Object[]{null, null, null, null, null})).getShortValue() == o.res);
      assertTrue(o.cnCalled);
      
      assertTrue(o.value == (short)0);
      assertTrue(((NgShort)NgSystem.metaClassRegistry.getRuntimeMetaClass(o).getProperty(o, "value")).getShortValue() == o.value);
      assertTrue(o.value == (short)0);
      
      assertTrue(o.value == (short)0);
      assertTrue(((NgShort)NgSystem.metaClassRegistry.getRuntimeMetaClass(o).setProperty(o, "value", new NgShort((short)1))).getShortValue() == (short)1);
      assertTrue(o.value == (short)1);
      
      assertTrue(o.value1 == (short)0);
      assertTrue(((NgShort)NgSystem.metaClassRegistry.getRuntimeMetaClass(o).getProperty(o, "value1")).getShortValue() == o.value1);
      assertTrue(o.value1 == (short)0);
      
      assertTrue(o.value1 == (short)0);
      assertTrue(((NgShort)NgSystem.metaClassRegistry.getRuntimeMetaClass(o).setProperty(o, "value1", new NgShort((short)1))).getShortValue() == (short)1);
      assertTrue(o.value1 == (short)1);
      
      o.value1 = (short)0;
      assertTrue(o.value1 == (short)0);
      assertTrue(((NgShort)NgSystem.metaClassRegistry.getRuntimeMetaClass(o).getField(o, "value1")).getShortValue() == o.value1);
      assertTrue(o.value1 == (short)0);
      
      assertTrue(o.value1 == (short)0);
      assertTrue(((NgShort)NgSystem.metaClassRegistry.getRuntimeMetaClass(o).setField(o, "value1", new NgShort((short)1))).getShortValue() == (short)1);
      assertTrue(o.value1 == (short)1);
    }
  
  public void testInt() {
    final TestIntTarget o = new TestIntTarget();
    
      assertFalse(o.c0Called);
      assertTrue(((NgInt)NgSystem.metaClassRegistry.getRuntimeMetaClass(o).invokeMethodQuick(o, "c0")).getIntValue() == o.res);
      assertTrue(o.c0Called);
      
      assertFalse(o.c1Called);
      assertTrue(((NgInt)NgSystem.metaClassRegistry.getRuntimeMetaClass(o).invokeMethodQuick(o, "c1", null)).getIntValue() == o.res);
      assertTrue(o.c1Called);
      
      assertFalse(o.c2Called);
      assertTrue(((NgInt)NgSystem.metaClassRegistry.getRuntimeMetaClass(o).invokeMethodQuick(o, "c2", null, null)).getIntValue() == o.res);
      assertTrue(o.c2Called);
      
      assertFalse(o.c3Called);
      assertTrue(((NgInt)NgSystem.metaClassRegistry.getRuntimeMetaClass(o).invokeMethodQuick(o, "c3", null, null, null)).getIntValue() == o.res);
      assertTrue(o.c3Called);
      
      assertFalse(o.c4Called);
      assertTrue(((NgInt)NgSystem.metaClassRegistry.getRuntimeMetaClass(o).invokeMethodQuick(o, "c4", null, null, null, null)).getIntValue() == o.res);
      assertTrue(o.c4Called);
      
      assertFalse(o.cnCalled);
      assertTrue(((NgInt)NgSystem.metaClassRegistry.getRuntimeMetaClass(o).invokeMethod(o, "cn", new Object[]{null, null, null, null, null})).getIntValue() == o.res);
      assertTrue(o.cnCalled);
      
      assertTrue(o.value == (int)0);
      assertTrue(((NgInt)NgSystem.metaClassRegistry.getRuntimeMetaClass(o).getProperty(o, "value")).getIntValue() == o.value);
      assertTrue(o.value == (int)0);
      
      assertTrue(o.value == (int)0);
      assertTrue(((NgInt)NgSystem.metaClassRegistry.getRuntimeMetaClass(o).setProperty(o, "value", new NgInt((int)1))).getIntValue() ==  (int)1);
      assertTrue(o.value == (int)1);
      
      assertTrue(o.value1 == (int)0);
      assertTrue(((NgInt)NgSystem.metaClassRegistry.getRuntimeMetaClass(o).getProperty(o, "value1")).getIntValue() == o.value1);
      assertTrue(o.value1 == (int)0);
      
      assertTrue(o.value1 == (int)0);
      assertTrue(((NgInt)NgSystem.metaClassRegistry.getRuntimeMetaClass(o).setProperty(o, "value1", new NgInt((int)1))).getIntValue() ==  (int)1);
      assertTrue(o.value1 == (int)1);
      
      o.value1 = (int)0;
      assertTrue(o.value1 == (int)0);
      assertTrue(((NgInt)NgSystem.metaClassRegistry.getRuntimeMetaClass(o).getField(o, "value1")).getIntValue() == o.value1);
      assertTrue(o.value1 == (int)0);
      
      assertTrue(o.value1 == (int)0);
      assertTrue(((NgInt)NgSystem.metaClassRegistry.getRuntimeMetaClass(o).setField(o, "value1", new NgInt((int)1))).getIntValue() ==  (int)1);
      assertTrue(o.value1 == (int)1);
 }
  
  public void testLong() {
    final TestLongTarget o = new TestLongTarget();
    
      assertFalse(o.c0Called);
      assertTrue(((NgLong)NgSystem.metaClassRegistry.getRuntimeMetaClass(o).invokeMethodQuick(o, "c0")).getLongValue() == o.res);
      assertTrue(o.c0Called);
      
      assertFalse(o.c1Called);
      assertTrue(((NgLong)NgSystem.metaClassRegistry.getRuntimeMetaClass(o).invokeMethodQuick(o, "c1", null)).getLongValue() == o.res);
      assertTrue(o.c1Called);
      
      assertFalse(o.c2Called);
      assertTrue(((NgLong)NgSystem.metaClassRegistry.getRuntimeMetaClass(o).invokeMethodQuick(o, "c2", null, null)).getLongValue() == o.res);
      assertTrue(o.c2Called);
      
      assertFalse(o.c3Called);
      assertTrue(((NgLong)NgSystem.metaClassRegistry.getRuntimeMetaClass(o).invokeMethodQuick(o, "c3", null, null, null)).getLongValue() == o.res);
      assertTrue(o.c3Called);
      
      assertFalse(o.c4Called);
      assertTrue(((NgLong)NgSystem.metaClassRegistry.getRuntimeMetaClass(o).invokeMethodQuick(o, "c4", null, null, null, null)).getLongValue() == o.res);
      assertTrue(o.c4Called);
      
      assertFalse(o.cnCalled);
      assertTrue(((NgLong)NgSystem.metaClassRegistry.getRuntimeMetaClass(o).invokeMethod(o, "cn", new Object[]{null, null, null, null, null})).getLongValue() == o.res);
      assertTrue(o.cnCalled);
      
      assertTrue(o.value == (long)0);
      assertTrue(((NgLong)NgSystem.metaClassRegistry.getRuntimeMetaClass(o).getProperty(o, "value")).getLongValue() == o.value);
      assertTrue(o.value == (long)0);
      
      assertTrue(o.value == (long)0);
      assertTrue(((NgLong)NgSystem.metaClassRegistry.getRuntimeMetaClass(o).setProperty(o, "value", new NgLong((long)1))).getLongValue() == (long)1);
      assertTrue(o.value == (long)1);
      
      assertTrue(o.value1 == (long)0);
      assertTrue(((NgLong)NgSystem.metaClassRegistry.getRuntimeMetaClass(o).getProperty(o, "value1")).getLongValue() == o.value1);
      assertTrue(o.value1 == (long)0);
      
      assertTrue(o.value1 == (long)0);
      assertTrue(((NgLong)NgSystem.metaClassRegistry.getRuntimeMetaClass(o).setProperty(o, "value1", new NgLong((long)1))).getLongValue() == (long)1);
      assertTrue(o.value1 == (long)1);
      
      o.value1 = (long)0;
      assertTrue(o.value1 == (long)0);
      assertTrue(((NgLong)NgSystem.metaClassRegistry.getRuntimeMetaClass(o).getField(o, "value1")).getLongValue() == o.value1);
      assertTrue(o.value1 == (long)0);
      
      assertTrue(o.value1 == (long)0);
      assertTrue(((NgLong)NgSystem.metaClassRegistry.getRuntimeMetaClass(o).setField(o, "value1", new NgLong((long)1))).getLongValue() == (long)1);
      assertTrue(o.value1 == (long)1);
    }
  
  public void testFloat() {
    final TestFloatTarget o = new TestFloatTarget();
    
      assertFalse(o.c0Called);
      assertTrue(((NgFloat)NgSystem.metaClassRegistry.getRuntimeMetaClass(o).invokeMethodQuick(o, "c0")).getFloatValue() == o.res);
      assertTrue(o.c0Called);
      
      assertFalse(o.c1Called);
      assertTrue(((NgFloat)NgSystem.metaClassRegistry.getRuntimeMetaClass(o).invokeMethodQuick(o, "c1", null)).getFloatValue() == o.res);
      assertTrue(o.c1Called);
      
      assertFalse(o.c2Called);
      assertTrue(((NgFloat)NgSystem.metaClassRegistry.getRuntimeMetaClass(o).invokeMethodQuick(o, "c2", null, null)).getFloatValue() == o.res);
      assertTrue(o.c2Called);
      
      assertFalse(o.c3Called);
      assertTrue(((NgFloat)NgSystem.metaClassRegistry.getRuntimeMetaClass(o).invokeMethodQuick(o, "c3", null, null, null)).getFloatValue() == o.res);
      assertTrue(o.c3Called);
      
      assertFalse(o.c4Called);
      assertTrue(((NgFloat)NgSystem.metaClassRegistry.getRuntimeMetaClass(o).invokeMethodQuick(o, "c4", null, null, null, null)).getFloatValue() == o.res);
      assertTrue(o.c4Called);
      
      assertFalse(o.cnCalled);
      assertTrue(((NgFloat)NgSystem.metaClassRegistry.getRuntimeMetaClass(o).invokeMethod(o, "cn", new Object[]{null, null, null, null, null})).getFloatValue() == o.res);
      assertTrue(o.cnCalled);
      
      assertTrue(o.value == (float)0);
      assertTrue(((NgFloat)NgSystem.metaClassRegistry.getRuntimeMetaClass(o).getProperty(o, "value")).getFloatValue() == o.value);
      assertTrue(o.value == (float)0);
      
      assertTrue(o.value == (float)0);
      assertTrue(((NgFloat)NgSystem.metaClassRegistry.getRuntimeMetaClass(o).setProperty(o, "value", new NgFloat((float)1))).getFloatValue() == (float)1);
      assertTrue(o.value == (float)1);
      
      assertTrue(o.value1 == (float)0);
      assertTrue(((NgFloat)NgSystem.metaClassRegistry.getRuntimeMetaClass(o).getProperty(o, "value1")).getFloatValue() == o.value1);
      assertTrue(o.value1 == (float)0);
      
      assertTrue(o.value1 == (float)0);
      assertTrue(((NgFloat)NgSystem.metaClassRegistry.getRuntimeMetaClass(o).setProperty(o, "value1", new NgFloat((float)1))).getFloatValue() == (float)1);
      assertTrue(o.value1 == (float)1);
      
      o.value1 = (float)0;
      assertTrue(o.value1 == (float)0);
      assertTrue(((NgFloat)NgSystem.metaClassRegistry.getRuntimeMetaClass(o).getField(o, "value1")).getFloatValue() == o.value1);
      assertTrue(o.value1 == (float)0);
      
      assertTrue(o.value1 == (float)0);
      assertTrue(((NgFloat)NgSystem.metaClassRegistry.getRuntimeMetaClass(o).setField(o, "value1", new NgFloat((float)1))).getFloatValue() == (float)1);
      assertTrue(o.value1 == (float)1);
    }
  
  public void testDouble() {
    final TestDoubleTarget o = new TestDoubleTarget();
    
      assertFalse(o.c0Called);
      assertTrue(((NgDouble)NgSystem.metaClassRegistry.getRuntimeMetaClass(o).invokeMethodQuick(o, "c0")).getDoubleValue() == o.res);
      assertTrue(o.c0Called);
      
      assertFalse(o.c1Called);
      assertTrue(((NgDouble)NgSystem.metaClassRegistry.getRuntimeMetaClass(o).invokeMethodQuick(o, "c1", null)).getDoubleValue() == o.res);
      assertTrue(o.c1Called);
      
      assertFalse(o.c2Called);
      assertTrue(((NgDouble)NgSystem.metaClassRegistry.getRuntimeMetaClass(o).invokeMethodQuick(o, "c2", null, null)).getDoubleValue() == o.res);
      assertTrue(o.c2Called);
      
      assertFalse(o.c3Called);
      assertTrue(((NgDouble)NgSystem.metaClassRegistry.getRuntimeMetaClass(o).invokeMethodQuick(o, "c3", null, null, null)).getDoubleValue() == o.res);
      assertTrue(o.c3Called);
      
      assertFalse(o.c4Called);
      assertTrue(((NgDouble)NgSystem.metaClassRegistry.getRuntimeMetaClass(o).invokeMethodQuick(o, "c4", null, null, null, null)).getDoubleValue() == o.res);
      assertTrue(o.c4Called);
      
      assertFalse(o.cnCalled);
      assertTrue(((NgDouble)NgSystem.metaClassRegistry.getRuntimeMetaClass(o).invokeMethod(o, "cn", new Object[]{null, null, null, null, null})).getDoubleValue() == o.res);
      assertTrue(o.cnCalled);
      
      assertTrue(o.value == (double)0);
      assertTrue(((NgDouble)NgSystem.metaClassRegistry.getRuntimeMetaClass(o).getProperty(o, "value")).getDoubleValue() == o.value);
      assertTrue(o.value == (double)0);
      
      assertTrue(o.value == (double)0);
      assertTrue(((NgDouble)NgSystem.metaClassRegistry.getRuntimeMetaClass(o).setProperty(o, "value", new NgDouble((double)1))).getDoubleValue() == (double)1);
      assertTrue(o.value == (double)1);
      
      assertTrue(o.value1 == (double)0);
      assertTrue(((NgDouble)NgSystem.metaClassRegistry.getRuntimeMetaClass(o).getProperty(o, "value1")).getDoubleValue() == o.value1);
      assertTrue(o.value1 == (double)0);
      
      assertTrue(o.value1 == (double)0);
      assertTrue(((NgDouble)NgSystem.metaClassRegistry.getRuntimeMetaClass(o).setProperty(o, "value1", new NgDouble((double)1))).getDoubleValue() == (double)1);
      assertTrue(o.value1 == (double)1);
      
      o.value1 = (double)0;
      assertTrue(o.value1 == (double)0);
      assertTrue(((NgDouble)NgSystem.metaClassRegistry.getRuntimeMetaClass(o).getField(o, "value1")).getDoubleValue() == o.value1);
      assertTrue(o.value1 == (double)0);
      
      assertTrue(o.value1 == (double)0);
      assertTrue(((NgDouble)NgSystem.metaClassRegistry.getRuntimeMetaClass(o).setField(o, "value1", new NgDouble((double)1))).getDoubleValue() == (double)1);
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
  
  public void c0() {
    this.c0Called = true;
  }
  
  public void c1(Object o1) {
    this.c1Called = true;
  }
  
  public void c2(Object o1, Object o2) {
    this.c2Called = true;
  }
  
  public void c3(Object o1, Object o2, Object o3) {
    this.c3Called = true;
  }
  
  public void c4(Object o1, Object o2, Object o3, Object o4) {
    this.c4Called = true;
  }
  
  public void cn(Object o1, Object o2, Object o3, Object o4, Object o5) {
    this.cnCalled = true;
  }

  /**
   * @return the t1
   */
  public Object getT1() {
    return this.t1;
  }

  /**
   * @param t1 the t1 to set
   */
  public void setT1(Object t1) {
    this.t1 = t1;
  }

  /**
   * @return the t2
   */
  public Object getT2() {
    return this.t2;
  }

  /**
   * @param t2 the t2 to set
   */
  public void setT2(Object t2) {
    this.t2 = t2;
  }

  /**
   * @return the t3
   */
  public Integer getT3() {
    return this.t3;
  }

  /**
   * @param t3 the t3 to set
   */
  public void setT3(Integer t3) {
    this.t3 = t3;
  }

  /**
   * @return the t4
   */
  public Integer getT4() {
    return this.t4;
  }

  /**
   * @param t4 the t4 to set
   */
  public void setT4(Integer t4) {
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
  
  public boolean c0() {
    this.c0Called = true;
    return res;
  }
  
  public boolean c1(Object o1) {
    this.c1Called = true;
    return res;
  }
  
  public boolean c2(Object o1, Object o2) {
    this.c2Called = true;
    return res;
  }
  
  public boolean c3(Object o1, Object o2, Object o3) {
    this.c3Called = true;
    return res;
  }
  
  public boolean c4(Object o1, Object o2, Object o3, Object o4) {
    this.c4Called = true;
    return res;
  }
  
  public boolean cn(Object o1, Object o2, Object o3, Object o4, Object o5) {
    this.cnCalled = true;
    return res;
 }

  /**
   * @return the value
   */
  public boolean isValue() {
    return this.value;
  }

  /**
   * @param value the value to set
   */
  public void setValue(boolean value) {
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
  
  public char c0() {
    this.c0Called = true;
    return res;
  }
  
  public char c1(Object o1) {
    this.c1Called = true;
    return res;
  }
  
  public char c2(Object o1, Object o2) {
    this.c2Called = true;
    return res;
  }
  
  public char c3(Object o1, Object o2, Object o3) {
    this.c3Called = true;
    return res;
  }
  
  public char c4(Object o1, Object o2, Object o3, Object o4) {
    this.c4Called = true;
    return res;
  }
  
  public char cn(Object o1, Object o2, Object o3, Object o4, Object o5) {
    this.cnCalled = true;
    return res;
 }

  /**
   * @return the value
   */
  public char getValue() {
    return this.value;
  }

  /**
   * @param val the value to set
   */
  public void setValue(char value) {
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
  
  public byte c0() {
    this.c0Called = true;
    return res;
  }
  
  public byte c1(Object o1) {
    this.c1Called = true;
    return res;
  }
  
  public byte c2(Object o1, Object o2) {
    this.c2Called = true;
    return res;
  }
  
  public byte c3(Object o1, Object o2, Object o3) {
    this.c3Called = true;
    return res;
  }
  
  public byte c4(Object o1, Object o2, Object o3, Object o4) {
    this.c4Called = true;
    return res;
  }
  
  public byte cn(Object o1, Object o2, Object o3, Object o4, Object o5) {
    this.cnCalled = true;
    return res;
 }

  /**
   * @return the value
   */
  public byte getValue() {
    return this.value;
  }

  /**
   * @param value the value to set
   */
  public void setValue(byte value) {
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
  
  public short c0() {
    this.c0Called = true;
    return res;
  }
  
  public short c1(Object o1) {
    this.c1Called = true;
    return res;
  }
  
  public short c2(Object o1, Object o2) {
    this.c2Called = true;
    return res;
  }
  
  public short c3(Object o1, Object o2, Object o3) {
    this.c3Called = true;
    return res;
  }
  
  public short c4(Object o1, Object o2, Object o3, Object o4) {
    this.c4Called = true;
    return res;
  }
  
  public short cn(Object o1, Object o2, Object o3, Object o4, Object o5) {
    this.cnCalled = true;
    return res;
 }

  /**
   * @return the value
   */
  public short getValue() {
    return this.value;
  }

  /**
   * @param value the value to set
   */
  public void setValue(short value) {
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
  
  public int c0() {
    this.c0Called = true;
    return res;
  }
  
  public int c1(Object o1) {
    this.c1Called = true;
    return res;
  }
  
  public int c2(Object o1, Object o2) {
    this.c2Called = true;
    return res;
  }
  
  public int c3(Object o1, Object o2, Object o3) {
    this.c3Called = true;
    return res;
  }
  
  public int c4(Object o1, Object o2, Object o3, Object o4) {
    this.c4Called = true;
    return res;
  }
  
  public int cn(Object o1, Object o2, Object o3, Object o4, Object o5) {
    this.cnCalled = true;
    return res;
 }

  /**
   * @return the value
   */
  public int getValue() {
    return this.value;
  }

  /**
   * @param value the value to set
   */
  public void setValue(int value) {
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
  
  public long c0() {
    this.c0Called = true;
    return res;
  }
  
  public long c1(Object o1) {
    this.c1Called = true;
    return res;
  }
  
  public long c2(Object o1, Object o2) {
    this.c2Called = true;
    return res;
  }
  
  public long c3(Object o1, Object o2, Object o3) {
    this.c3Called = true;
    return res;
  }
  
  public long c4(Object o1, Object o2, Object o3, Object o4) {
    this.c4Called = true;
    return res;
  }
  
  public long cn(Object o1, Object o2, Object o3, Object o4, Object o5) {
    this.cnCalled = true;
    return res;
 }

  /**
   * @return the value
   */
  public long getValue() {
    return this.value;
  }

  /**
   * @param value the value to set
   */
  public void setValue(long value) {
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
  
  public float c0() {
    this.c0Called = true;
    return res;
  }
  
  public float c1(Object o1) {
    this.c1Called = true;
    return res;
  }
  
  public float c2(Object o1, Object o2) {
    this.c2Called = true;
    return res;
  }
  
  public float c3(Object o1, Object o2, Object o3) {
    this.c3Called = true;
    return res;
  }
  
  public float c4(Object o1, Object o2, Object o3, Object o4) {
    this.c4Called = true;
    return res;
  }
  
  public float cn(Object o1, Object o2, Object o3, Object o4, Object o5) {
    this.cnCalled = true;
    return res;
 }

  /**
   * @return the value
   */
  public float getValue() {
    return this.value;
  }

  /**
   * @param value the value to set
   */
  public void setValue(float value) {
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
  
  public double c0() {
    this.c0Called = true;
    return res;
  }
  
  public double c1(Object o1) {
    this.c1Called = true;
    return res;
  }
  
  public double c2(Object o1, Object o2) {
    this.c2Called = true;
    return res;
  }
  
  public double c3(Object o1, Object o2, Object o3) {
    this.c3Called = true;
    return res;
  }
  
  public double c4(Object o1, Object o2, Object o3, Object o4) {
    this.c4Called = true;
    return res;
  }
  
  public double cn(Object o1, Object o2, Object o3, Object o4, Object o5) {
    this.cnCalled = true;
    return res;
 }

  /**
   * @return the value
   */
  public double getValue() {
    return this.value;
  }

  /**
   * @param value the value to set
   */
  public void setValue(double value) {
    this.value = value;
  }
}
