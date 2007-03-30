package ng.lang;

import junit.framework.TestCase;
import ng.runtime.NgBoolean;
import ng.runtime.NgByte;
import ng.runtime.NgChar;
import ng.runtime.NgDouble;
import ng.runtime.NgFloat;
import ng.runtime.NgInt;
import ng.runtime.NgLong;
import ng.runtime.NgShort;

/**
 * @author John
 *
 */
public class MethodCallTest extends TestCase {
  public void testVoid() {
    final TestVoidTarget o = new TestVoidTarget();
    
      assertFalse(o.c0Called);
      NgSystem.metaClassRegistry.getInternalMetaClass(o).doInvokeMethodQuick(o, "c0");
      assertTrue(o.c0Called);
      
      assertFalse(o.c1Called);
      NgSystem.metaClassRegistry.getInternalMetaClass(o).doInvokeMethodQuick(o, "c1", null);
      assertTrue(o.c1Called);
      
      assertFalse(o.c2Called);
      NgSystem.metaClassRegistry.getInternalMetaClass(o).doInvokeMethodQuick(o, "c2", null, null);
      assertTrue(o.c2Called);
      
      assertFalse(o.c3Called);
      NgSystem.metaClassRegistry.getInternalMetaClass(o).doInvokeMethodQuick(o, "c3", null, null, null);
      assertTrue(o.c3Called);
      
      assertFalse(o.c4Called);
      NgSystem.metaClassRegistry.getInternalMetaClass(o).doInvokeMethodQuick(o, "c4", null, null, null, null);
      assertTrue(o.c4Called);
      
      assertFalse(o.cnCalled);
      NgSystem.metaClassRegistry.getInternalMetaClass(o).doInvokeMethod(o, "cn", new Object[]{null, null, null, null, null});
      assertTrue(o.cnCalled);
    }
  
  public void testBoolean() {
    final TestBooleanTarget o = new TestBooleanTarget();
    
      assertFalse(o.c0Called);
      assertTrue(((NgBoolean)NgSystem.metaClassRegistry.getInternalMetaClass(o).doInvokeMethodQuick(o, "c0")).getBooleanValue() == o.res);
      assertTrue(o.c0Called);
      
      assertFalse(o.c1Called);
      assertTrue(((NgBoolean)NgSystem.metaClassRegistry.getInternalMetaClass(o).doInvokeMethodQuick(o, "c1", null)).getBooleanValue() == o.res);
      assertTrue(o.c1Called);
      
      assertFalse(o.c2Called);
      assertTrue(((NgBoolean)NgSystem.metaClassRegistry.getInternalMetaClass(o).doInvokeMethodQuick(o, "c2", null, null)).getBooleanValue() == o.res);
      assertTrue(o.c2Called);
      
      assertFalse(o.c3Called);
      assertTrue(((NgBoolean)NgSystem.metaClassRegistry.getInternalMetaClass(o).doInvokeMethodQuick(o, "c3", null, null, null)).getBooleanValue() == o.res);
      assertTrue(o.c3Called);
      
      assertFalse(o.c4Called);
      assertTrue(((NgBoolean)NgSystem.metaClassRegistry.getInternalMetaClass(o).doInvokeMethodQuick(o, "c4", null, null, null, null)).getBooleanValue() == o.res);
      assertTrue(o.c4Called);
      
      assertFalse(o.cnCalled);
      assertTrue(((NgBoolean)NgSystem.metaClassRegistry.getInternalMetaClass(o).doInvokeMethod(o, "cn", new Object[]{null, null, null, null, null})).getBooleanValue() == o.res);
      assertTrue(o.cnCalled);
      
      assertFalse(o.value);
      assertTrue(((NgBoolean)NgSystem.metaClassRegistry.getInternalMetaClass(o).doGetProperty(o, "value")).getBooleanValue() == o.value);
      assertFalse(o.value);
      
      assertFalse(o.value);
      assertTrue(((TestBooleanTarget)NgSystem.metaClassRegistry.getInternalMetaClass(o).doSetProperty(o, "value", NgBoolean.TRUE)) == o);
      assertTrue(o.value);
    }
  
  public void testChar() {
    final TestCharTarget o = new TestCharTarget();
    
      assertFalse(o.c0Called);
      assertTrue(((NgChar)NgSystem.metaClassRegistry.getInternalMetaClass(o).doInvokeMethodQuick(o, "c0")).getCharValue() == o.res);
      assertTrue(o.c0Called);
      
      assertFalse(o.c1Called);
      assertTrue(((NgChar)NgSystem.metaClassRegistry.getInternalMetaClass(o).doInvokeMethodQuick(o, "c1", null)).getCharValue() == o.res);
      assertTrue(o.c1Called);
      
      assertFalse(o.c2Called);
      assertTrue(((NgChar)NgSystem.metaClassRegistry.getInternalMetaClass(o).doInvokeMethodQuick(o, "c2", null, null)).getCharValue() == o.res);
      assertTrue(o.c2Called);
      
      assertFalse(o.c3Called);
      assertTrue(((NgChar)NgSystem.metaClassRegistry.getInternalMetaClass(o).doInvokeMethodQuick(o, "c3", null, null, null)).getCharValue() == o.res);
      assertTrue(o.c3Called);
      
      assertFalse(o.c4Called);
      assertTrue(((NgChar)NgSystem.metaClassRegistry.getInternalMetaClass(o).doInvokeMethodQuick(o, "c4", null, null, null, null)).getCharValue() == o.res);
      assertTrue(o.c4Called);
      
      assertFalse(o.cnCalled);
      assertTrue(((NgChar)NgSystem.metaClassRegistry.getInternalMetaClass(o).doInvokeMethod(o, "cn", new Object[]{null, null, null, null, null})).getCharValue() == o.res);
      assertTrue(o.cnCalled);
      
      assertTrue(o.value == (char)0);
      assertTrue(((NgChar)NgSystem.metaClassRegistry.getInternalMetaClass(o).doGetProperty(o, "value")).getCharValue() == o.value);
      assertTrue(o.value == (char)0);
      
      assertTrue(o.value == (char)0);
      assertTrue(((TestCharTarget)NgSystem.metaClassRegistry.getInternalMetaClass(o).doSetProperty(o, "value", new NgChar((char)1))) == o);
      assertTrue(o.value == (char)1);
    }
  
  public void testByte() {
    final TestByteTarget o = new TestByteTarget();
    
      assertFalse(o.c0Called);
      assertTrue(((NgByte)NgSystem.metaClassRegistry.getInternalMetaClass(o).doInvokeMethodQuick(o, "c0")).getByteValue() == o.res);
      assertTrue(o.c0Called);
      
      assertFalse(o.c1Called);
      assertTrue(((NgByte)NgSystem.metaClassRegistry.getInternalMetaClass(o).doInvokeMethodQuick(o, "c1", null)).getByteValue() == o.res);
      assertTrue(o.c1Called);
      
      assertFalse(o.c2Called);
      assertTrue(((NgByte)NgSystem.metaClassRegistry.getInternalMetaClass(o).doInvokeMethodQuick(o, "c2", null, null)).getByteValue() == o.res);
      assertTrue(o.c2Called);
      
      assertFalse(o.c3Called);
      assertTrue(((NgByte)NgSystem.metaClassRegistry.getInternalMetaClass(o).doInvokeMethodQuick(o, "c3", null, null, null)).getByteValue() == o.res);
      assertTrue(o.c3Called);
      
      assertFalse(o.c4Called);
      assertTrue(((NgByte)NgSystem.metaClassRegistry.getInternalMetaClass(o).doInvokeMethodQuick(o, "c4", null, null, null, null)).getByteValue() == o.res);
      assertTrue(o.c4Called);
      
      assertFalse(o.cnCalled);
      assertTrue(((NgByte)NgSystem.metaClassRegistry.getInternalMetaClass(o).doInvokeMethod(o, "cn", new Object[]{null, null, null, null, null})).getByteValue() == o.res);
      assertTrue(o.cnCalled);
      
      assertTrue(o.value == (byte)0);
      assertTrue(((NgByte)NgSystem.metaClassRegistry.getInternalMetaClass(o).doGetProperty(o, "value")).getByteValue() == o.value);
      assertTrue(o.value == (byte)0);
      
      assertTrue(o.value == (byte)0);
      assertTrue(((TestByteTarget)NgSystem.metaClassRegistry.getInternalMetaClass(o).doSetProperty(o, "value", new NgByte((byte)1))) == o);
      assertTrue(o.value == (byte)1);
    }
  
  public void testShort() {
    final TestShortTarget o = new TestShortTarget();
    
      assertFalse(o.c0Called);
      assertTrue(((NgShort)NgSystem.metaClassRegistry.getInternalMetaClass(o).doInvokeMethodQuick(o, "c0")).getShortValue() == o.res);
      assertTrue(o.c0Called);
      
      assertFalse(o.c1Called);
      assertTrue(((NgShort)NgSystem.metaClassRegistry.getInternalMetaClass(o).doInvokeMethodQuick(o, "c1", null)).getShortValue() == o.res);
      assertTrue(o.c1Called);
      
      assertFalse(o.c2Called);
      assertTrue(((NgShort)NgSystem.metaClassRegistry.getInternalMetaClass(o).doInvokeMethodQuick(o, "c2", null, null)).getShortValue() == o.res);
      assertTrue(o.c2Called);
      
      assertFalse(o.c3Called);
      assertTrue(((NgShort)NgSystem.metaClassRegistry.getInternalMetaClass(o).doInvokeMethodQuick(o, "c3", null, null, null)).getShortValue() == o.res);
      assertTrue(o.c3Called);
      
      assertFalse(o.c4Called);
      assertTrue(((NgShort)NgSystem.metaClassRegistry.getInternalMetaClass(o).doInvokeMethodQuick(o, "c4", null, null, null, null)).getShortValue() == o.res);
      assertTrue(o.c4Called);
      
      assertFalse(o.cnCalled);
      assertTrue(((NgShort)NgSystem.metaClassRegistry.getInternalMetaClass(o).doInvokeMethod(o, "cn", new Object[]{null, null, null, null, null})).getShortValue() == o.res);
      assertTrue(o.cnCalled);
      
      assertTrue(o.value == (short)0);
      assertTrue(((NgShort)NgSystem.metaClassRegistry.getInternalMetaClass(o).doGetProperty(o, "value")).getShortValue() == o.value);
      assertTrue(o.value == (short)0);
      
      assertTrue(o.value == (short)0);
      assertTrue(((TestShortTarget)NgSystem.metaClassRegistry.getInternalMetaClass(o).doSetProperty(o, "value", new NgShort((short)1))) == o);
      assertTrue(o.value == (short)1);
    }
  
  public void testInt() {
    final TestIntTarget o = new TestIntTarget();
    
      assertFalse(o.c0Called);
      assertTrue(((NgInt)NgSystem.metaClassRegistry.getInternalMetaClass(o).doInvokeMethodQuick(o, "c0")).getIntValue() == o.res);
      assertTrue(o.c0Called);
      
      assertFalse(o.c1Called);
      assertTrue(((NgInt)NgSystem.metaClassRegistry.getInternalMetaClass(o).doInvokeMethodQuick(o, "c1", null)).getIntValue() == o.res);
      assertTrue(o.c1Called);
      
      assertFalse(o.c2Called);
      assertTrue(((NgInt)NgSystem.metaClassRegistry.getInternalMetaClass(o).doInvokeMethodQuick(o, "c2", null, null)).getIntValue() == o.res);
      assertTrue(o.c2Called);
      
      assertFalse(o.c3Called);
      assertTrue(((NgInt)NgSystem.metaClassRegistry.getInternalMetaClass(o).doInvokeMethodQuick(o, "c3", null, null, null)).getIntValue() == o.res);
      assertTrue(o.c3Called);
      
      assertFalse(o.c4Called);
      assertTrue(((NgInt)NgSystem.metaClassRegistry.getInternalMetaClass(o).doInvokeMethodQuick(o, "c4", null, null, null, null)).getIntValue() == o.res);
      assertTrue(o.c4Called);
      
      assertFalse(o.cnCalled);
      assertTrue(((NgInt)NgSystem.metaClassRegistry.getInternalMetaClass(o).doInvokeMethod(o, "cn", new Object[]{null, null, null, null, null})).getIntValue() == o.res);
      assertTrue(o.cnCalled);
      
      assertTrue(o.value == (int)0);
      assertTrue(((NgInt)NgSystem.metaClassRegistry.getInternalMetaClass(o).doGetProperty(o, "value")).getIntValue() == o.value);
      assertTrue(o.value == (int)0);
      
      assertTrue(o.value == (int)0);
      assertTrue(((TestIntTarget)NgSystem.metaClassRegistry.getInternalMetaClass(o).doSetProperty(o, "value", new NgInt((int)1))) == o);
      assertTrue(o.value == (int)1);
 }
  
  public void testLong() {
    final TestLongTarget o = new TestLongTarget();
    
      assertFalse(o.c0Called);
      assertTrue(((NgLong)NgSystem.metaClassRegistry.getInternalMetaClass(o).doInvokeMethodQuick(o, "c0")).getLongValue() == o.res);
      assertTrue(o.c0Called);
      
      assertFalse(o.c1Called);
      assertTrue(((NgLong)NgSystem.metaClassRegistry.getInternalMetaClass(o).doInvokeMethodQuick(o, "c1", null)).getLongValue() == o.res);
      assertTrue(o.c1Called);
      
      assertFalse(o.c2Called);
      assertTrue(((NgLong)NgSystem.metaClassRegistry.getInternalMetaClass(o).doInvokeMethodQuick(o, "c2", null, null)).getLongValue() == o.res);
      assertTrue(o.c2Called);
      
      assertFalse(o.c3Called);
      assertTrue(((NgLong)NgSystem.metaClassRegistry.getInternalMetaClass(o).doInvokeMethodQuick(o, "c3", null, null, null)).getLongValue() == o.res);
      assertTrue(o.c3Called);
      
      assertFalse(o.c4Called);
      assertTrue(((NgLong)NgSystem.metaClassRegistry.getInternalMetaClass(o).doInvokeMethodQuick(o, "c4", null, null, null, null)).getLongValue() == o.res);
      assertTrue(o.c4Called);
      
      assertFalse(o.cnCalled);
      assertTrue(((NgLong)NgSystem.metaClassRegistry.getInternalMetaClass(o).doInvokeMethod(o, "cn", new Object[]{null, null, null, null, null})).getLongValue() == o.res);
      assertTrue(o.cnCalled);
      
      assertTrue(o.value == (long)0);
      assertTrue(((NgLong)NgSystem.metaClassRegistry.getInternalMetaClass(o).doGetProperty(o, "value")).getLongValue() == o.value);
      assertTrue(o.value == (long)0);
      
      assertTrue(o.value == (long)0);
      assertTrue(((TestLongTarget)NgSystem.metaClassRegistry.getInternalMetaClass(o).doSetProperty(o, "value", new NgLong((long)1))) == o);
      assertTrue(o.value == (long)1);
    }
  
  public void testFloat() {
    final TestFloatTarget o = new TestFloatTarget();
    
      assertFalse(o.c0Called);
      assertTrue(((NgFloat)NgSystem.metaClassRegistry.getInternalMetaClass(o).doInvokeMethodQuick(o, "c0")).getFloatValue() == o.res);
      assertTrue(o.c0Called);
      
      assertFalse(o.c1Called);
      assertTrue(((NgFloat)NgSystem.metaClassRegistry.getInternalMetaClass(o).doInvokeMethodQuick(o, "c1", null)).getFloatValue() == o.res);
      assertTrue(o.c1Called);
      
      assertFalse(o.c2Called);
      assertTrue(((NgFloat)NgSystem.metaClassRegistry.getInternalMetaClass(o).doInvokeMethodQuick(o, "c2", null, null)).getFloatValue() == o.res);
      assertTrue(o.c2Called);
      
      assertFalse(o.c3Called);
      assertTrue(((NgFloat)NgSystem.metaClassRegistry.getInternalMetaClass(o).doInvokeMethodQuick(o, "c3", null, null, null)).getFloatValue() == o.res);
      assertTrue(o.c3Called);
      
      assertFalse(o.c4Called);
      assertTrue(((NgFloat)NgSystem.metaClassRegistry.getInternalMetaClass(o).doInvokeMethodQuick(o, "c4", null, null, null, null)).getFloatValue() == o.res);
      assertTrue(o.c4Called);
      
      assertFalse(o.cnCalled);
      assertTrue(((NgFloat)NgSystem.metaClassRegistry.getInternalMetaClass(o).doInvokeMethod(o, "cn", new Object[]{null, null, null, null, null})).getFloatValue() == o.res);
      assertTrue(o.cnCalled);
      
      assertTrue(o.value == (float)0);
      assertTrue(((NgFloat)NgSystem.metaClassRegistry.getInternalMetaClass(o).doGetProperty(o, "value")).getFloatValue() == o.value);
      assertTrue(o.value == (float)0);
      
      assertTrue(o.value == (float)0);
      assertTrue(((TestFloatTarget)NgSystem.metaClassRegistry.getInternalMetaClass(o).doSetProperty(o, "value", new NgFloat((float)1))) == o);
      assertTrue(o.value == (float)1);
    }
  
  public void testDouble() {
    final TestDoubleTarget o = new TestDoubleTarget();
    
      assertFalse(o.c0Called);
      assertTrue(((NgDouble)NgSystem.metaClassRegistry.getInternalMetaClass(o).doInvokeMethodQuick(o, "c0")).getDoubleValue() == o.res);
      assertTrue(o.c0Called);
      
      assertFalse(o.c1Called);
      assertTrue(((NgDouble)NgSystem.metaClassRegistry.getInternalMetaClass(o).doInvokeMethodQuick(o, "c1", null)).getDoubleValue() == o.res);
      assertTrue(o.c1Called);
      
      assertFalse(o.c2Called);
      assertTrue(((NgDouble)NgSystem.metaClassRegistry.getInternalMetaClass(o).doInvokeMethodQuick(o, "c2", null, null)).getDoubleValue() == o.res);
      assertTrue(o.c2Called);
      
      assertFalse(o.c3Called);
      assertTrue(((NgDouble)NgSystem.metaClassRegistry.getInternalMetaClass(o).doInvokeMethodQuick(o, "c3", null, null, null)).getDoubleValue() == o.res);
      assertTrue(o.c3Called);
      
      assertFalse(o.c4Called);
      assertTrue(((NgDouble)NgSystem.metaClassRegistry.getInternalMetaClass(o).doInvokeMethodQuick(o, "c4", null, null, null, null)).getDoubleValue() == o.res);
      assertTrue(o.c4Called);
      
      assertFalse(o.cnCalled);
      assertTrue(((NgDouble)NgSystem.metaClassRegistry.getInternalMetaClass(o).doInvokeMethod(o, "cn", new Object[]{null, null, null, null, null})).getDoubleValue() == o.res);
      assertTrue(o.cnCalled);
      
      assertTrue(o.value == (double)0);
      assertTrue(((NgDouble)NgSystem.metaClassRegistry.getInternalMetaClass(o).doGetProperty(o, "value")).getDoubleValue() == o.value);
      assertTrue(o.value == (double)0);
      
      assertTrue(o.value == (double)0);
      assertTrue(((TestDoubleTarget)NgSystem.metaClassRegistry.getInternalMetaClass(o).doSetProperty(o, "value", new NgDouble((double)1))) == o);
      assertTrue(o.value == (double)1);
    }
}

class TestVoidTarget {
  public boolean c0Called = false;
  public boolean c1Called = false;
  public boolean c2Called = false;
  public boolean c3Called = false;
  public boolean c4Called = false;
  public boolean cnCalled = false;
  
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
