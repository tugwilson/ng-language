package ng.lang;

import java.math.BigDecimal;
import java.math.BigInteger;

import junit.framework.TestCase;
import ng.runtime.NgBaseObject;
import ng.runtime.NgTyped;
import util.CustomMetaClass;



/**
 * @author tug
 *
 */
public class TypedTest extends TestCase {
  final BigInteger bi = BigInteger.valueOf(1);
  final BigDecimal bd = new BigDecimal(1);
  final Object o = new NgTyped(new NgBaseObject(new CustomMetaClass()), NgBaseObject.class);
  
  public void testUnsupportedMetaClassMethodsAdd() {    
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).add((byte)1, (byte)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).add((byte)1, (char)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).add((byte)1, (short)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).add((byte)1, (int)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).add((byte)1, (long)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).add((byte)1, (float)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).add((byte)1, (double)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).add((byte)1, bi);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).add((byte)1, bd);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).add((char)1, (byte)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).add((char)1, (char)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).add((char)1, (short)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).add((char)1, (int)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).add((char)1, (long)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).add((char)1, (float)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).add((char)1, (double)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).add((char)1, bi);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).add((char)1, bd);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).add((short)1, (byte)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).add((short)1, (char)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).add((short)1, (short)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).add((short)1, (int)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).add((short)1, (long)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).add((short)1, (float)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).add((short)1, (double)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).add((short)1, bi);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).add((short)1, bd);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).add((int)1, (byte)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).add((int)1, (char)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).add((int)1, (short)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).add((int)1, (int)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).add((int)1, (long)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).add((int)1, (float)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).add((int)1, (double)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).add((int)1, bi);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).add((int)1, bd);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).add((long)1, (byte)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).add((long)1, (char)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).add((long)1, (short)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).add((long)1, (int)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).add((long)1, (long)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).add((long)1, (float)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).add((long)1, (double)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).add((long)1, bi);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).add((long)1, bd);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).add((float)1, (byte)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).add((float)1, (char)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).add((float)1, (short)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).add((float)1, (int)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).add((float)1, (long)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).add((float)1, (float)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).add((float)1, (double)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).add((float)1, bi);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).add((float)1, bd);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).add((double)1, (byte)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).add((double)1, (char)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).add((double)1, (short)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).add((double)1, (int)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).add((double)1, (long)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).add((double)1, (float)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).add((double)1, (double)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).add((double)1, bi);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).add((double)1, bd);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).add(bi, (byte)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).add(bi, (char)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).add(bi, (short)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).add(bi, (int)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).add(bi, (long)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).add(bi, (float)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).add(bi, (double)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).add(bi, bi);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).add(bi, bd);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).add(bd, (byte)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).add(bd, (char)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).add(bd, (short)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).add(bd, (int)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).add(bd, (long)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).add(bd, (float)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).add(bd, (double)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).add(bd, bi);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).add(bd, bd);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
  }
  
  public void testSupportedMetaClassMethodsAdd() {    
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(o).add(o, o), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(o).add(o, (byte)1), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(o).add(o, (char)1), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(o).add(o, (short)1), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(o).add(o, (int)1), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(o).add(o, (long)1), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(o).add(o, (float)1), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(o).add(o, (double)1), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(o).add(o, bi), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(o).add(o, bd), null);
    
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(o).reverseAdd((byte)1, o), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(o).reverseAdd((char)1, o), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(o).reverseAdd((short)1, o), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(o).reverseAdd((int)1, o), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(o).reverseAdd((long)1, o), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(o).reverseAdd((float)1, o), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(o).reverseAdd((double)1, o), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(o).reverseAdd(bi, o), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(o).reverseAdd(bd, o), null);
  }
  
  public void testUnsupportedMetaClassMethodsAddEquals() {    
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).addEquals((byte)1, (byte)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).addEquals((byte)1, (char)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).addEquals((byte)1, (short)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).addEquals((byte)1, (int)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).addEquals((byte)1, (long)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).addEquals((byte)1, (float)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).addEquals((byte)1, (double)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).addEquals((byte)1, bi);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).addEquals((byte)1, bd);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).addEquals((char)1, (byte)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).addEquals((char)1, (char)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).addEquals((char)1, (short)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).addEquals((char)1, (int)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).addEquals((char)1, (long)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).addEquals((char)1, (float)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).addEquals((char)1, (double)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).addEquals((char)1, bi);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).addEquals((char)1, bd);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).addEquals((short)1, (byte)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).addEquals((short)1, (char)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).addEquals((short)1, (short)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).addEquals((short)1, (int)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).addEquals((short)1, (long)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).addEquals((short)1, (float)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).addEquals((short)1, (double)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).addEquals((short)1, bi);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).addEquals((short)1, bd);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).addEquals((int)1, (byte)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).addEquals((int)1, (char)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).addEquals((int)1, (short)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).addEquals((int)1, (int)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).addEquals((int)1, (long)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).addEquals((int)1, (float)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).addEquals((int)1, (double)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).addEquals((int)1, bi);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).addEquals((int)1, bd);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).addEquals((long)1, (byte)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).addEquals((long)1, (char)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).addEquals((long)1, (short)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).addEquals((long)1, (int)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).addEquals((long)1, (long)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).addEquals((long)1, (float)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).addEquals((long)1, (double)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).addEquals((long)1, bi);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).addEquals((long)1, bd);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).addEquals((float)1, (byte)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).addEquals((float)1, (char)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).addEquals((float)1, (short)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).addEquals((float)1, (int)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).addEquals((float)1, (long)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).addEquals((float)1, (float)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).addEquals((float)1, (double)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).addEquals((float)1, bi);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).addEquals((float)1, bd);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).addEquals((double)1, (byte)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).addEquals((double)1, (char)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).addEquals((double)1, (short)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).addEquals((double)1, (int)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).addEquals((double)1, (long)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).addEquals((double)1, (float)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).addEquals((double)1, (double)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).addEquals((double)1, bi);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).addEquals((double)1, bd);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).addEquals(bi, (byte)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).addEquals(bi, (char)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).addEquals(bi, (short)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).addEquals(bi, (int)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).addEquals(bi, (long)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).addEquals(bi, (float)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).addEquals(bi, (double)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).addEquals(bi, bi);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).addEquals(bi, bd);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).addEquals(bd, (byte)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).addEquals(bd, (char)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).addEquals(bd, (short)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).addEquals(bd, (int)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).addEquals(bd, (long)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).addEquals(bd, (float)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).addEquals(bd, (double)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).addEquals(bd, bi);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).addEquals(bd, bd);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
  }
  
  public void testSupportedMetaClassMethodsAddEquals() {    
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(o).addEquals(o, o), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(o).addEquals(o, (byte)1), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(o).addEquals(o, (char)1), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(o).addEquals(o, (short)1), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(o).addEquals(o, (int)1), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(o).addEquals(o, (long)1), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(o).addEquals(o, (float)1), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(o).addEquals(o, (double)1), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(o).addEquals(o, bi), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(o).addEquals(o, bd), null);
    
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(o).reverseAddEquals((byte)1, o), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(o).reverseAddEquals((char)1, o), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(o).reverseAddEquals((short)1, o), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(o).reverseAddEquals((int)1, o), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(o).reverseAddEquals((long)1, o), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(o).reverseAddEquals((float)1, o), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(o).reverseAddEquals((double)1, o), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(o).reverseAddEquals(bi, o), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(o).reverseAddEquals(bd, o), null);
  }
  
  public void testUnsupportedMetaClassMethodsSubtract() {    
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).subtract((byte)1, (byte)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).subtract((byte)1, (char)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).subtract((byte)1, (short)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).subtract((byte)1, (int)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).subtract((byte)1, (long)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).subtract((byte)1, (float)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).subtract((byte)1, (double)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).subtract((byte)1, bi);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).subtract((byte)1, bd);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).subtract((char)1, (byte)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).subtract((char)1, (char)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).subtract((char)1, (short)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).subtract((char)1, (int)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).subtract((char)1, (long)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).subtract((char)1, (float)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).subtract((char)1, (double)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).subtract((char)1, bi);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).subtract((char)1, bd);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).subtract((short)1, (byte)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).subtract((short)1, (char)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).subtract((short)1, (short)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).subtract((short)1, (int)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).subtract((short)1, (long)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).subtract((short)1, (float)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).subtract((short)1, (double)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).subtract((short)1, bi);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).subtract((short)1, bd);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).subtract((int)1, (byte)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).subtract((int)1, (char)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).subtract((int)1, (short)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).subtract((int)1, (int)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).subtract((int)1, (long)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).subtract((int)1, (float)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).subtract((int)1, (double)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).subtract((int)1, bi);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).subtract((int)1, bd);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).subtract((long)1, (byte)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).subtract((long)1, (char)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).subtract((long)1, (short)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).subtract((long)1, (int)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).subtract((long)1, (long)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).subtract((long)1, (float)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).subtract((long)1, (double)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).subtract((long)1, bi);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).subtract((long)1, bd);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).subtract((float)1, (byte)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).subtract((float)1, (char)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).subtract((float)1, (short)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).subtract((float)1, (int)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).subtract((float)1, (long)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).subtract((float)1, (float)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).subtract((float)1, (double)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).subtract((float)1, bi);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).subtract((float)1, bd);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).subtract((double)1, (byte)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).subtract((double)1, (char)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).subtract((double)1, (short)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).subtract((double)1, (int)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).subtract((double)1, (long)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).subtract((double)1, (float)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).subtract((double)1, (double)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).subtract((double)1, bi);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).subtract((double)1, bd);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).subtract(bi, (byte)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).subtract(bi, (char)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).subtract(bi, (short)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).subtract(bi, (int)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).subtract(bi, (long)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).subtract(bi, (float)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).subtract(bi, (double)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).subtract(bi, bi);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).subtract(bi, bd);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).subtract(bd, (byte)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).subtract(bd, (char)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).subtract(bd, (short)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).subtract(bd, (int)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).subtract(bd, (long)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).subtract(bd, (float)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).subtract(bd, (double)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).subtract(bd, bi);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).subtract(bd, bd);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
  }
  
  public void testSupportedMetaClassMethodsSubtract() {    
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(o).subtract(o, o), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(o).subtract(o, (byte)1), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(o).subtract(o, (char)1), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(o).subtract(o, (short)1), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(o).subtract(o, (int)1), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(o).subtract(o, (long)1), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(o).subtract(o, (float)1), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(o).subtract(o, (double)1), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(o).subtract(o, bi), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(o).subtract(o, bd), null);
    
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(o).reverseSubtract((byte)1, o), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(o).reverseSubtract((char)1, o), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(o).reverseSubtract((short)1, o), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(o).reverseSubtract((int)1, o), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(o).reverseSubtract((long)1, o), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(o).reverseSubtract((float)1, o), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(o).reverseSubtract((double)1, o), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(o).reverseSubtract(bi, o), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(o).reverseSubtract(bd, o), null);
  }
  
  public void testUnsupportedMetaClassMethodsSubtractEquals() {    
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).subtractEquals((byte)1, (byte)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).subtractEquals((byte)1, (char)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).subtractEquals((byte)1, (short)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).subtractEquals((byte)1, (int)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).subtractEquals((byte)1, (long)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).subtractEquals((byte)1, (float)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).subtractEquals((byte)1, (double)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).subtractEquals((byte)1, bi);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).subtractEquals((byte)1, bd);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).subtractEquals((char)1, (byte)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).subtractEquals((char)1, (char)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).subtractEquals((char)1, (short)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).subtractEquals((char)1, (int)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).subtractEquals((char)1, (long)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).subtractEquals((char)1, (float)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).subtractEquals((char)1, (double)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).subtractEquals((char)1, bi);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).subtractEquals((char)1, bd);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).subtractEquals((short)1, (byte)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).subtractEquals((short)1, (char)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).subtractEquals((short)1, (short)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).subtractEquals((short)1, (int)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).subtractEquals((short)1, (long)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).subtractEquals((short)1, (float)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).subtractEquals((short)1, (double)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).subtractEquals((short)1, bi);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).subtractEquals((short)1, bd);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).subtractEquals((int)1, (byte)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).subtractEquals((int)1, (char)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).subtractEquals((int)1, (short)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).subtractEquals((int)1, (int)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).subtractEquals((int)1, (long)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).subtractEquals((int)1, (float)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).subtractEquals((int)1, (double)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).subtractEquals((int)1, bi);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).subtractEquals((int)1, bd);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).subtractEquals((long)1, (byte)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).subtractEquals((long)1, (char)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).subtractEquals((long)1, (short)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).subtractEquals((long)1, (int)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).subtractEquals((long)1, (long)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).subtractEquals((long)1, (float)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).subtractEquals((long)1, (double)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).subtractEquals((long)1, bi);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).subtractEquals((long)1, bd);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).subtractEquals((float)1, (byte)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).subtractEquals((float)1, (char)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).subtractEquals((float)1, (short)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).subtractEquals((float)1, (int)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).subtractEquals((float)1, (long)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).subtractEquals((float)1, (float)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).subtractEquals((float)1, (double)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).subtractEquals((float)1, bi);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).subtractEquals((float)1, bd);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).subtractEquals((double)1, (byte)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).subtractEquals((double)1, (char)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).subtractEquals((double)1, (short)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).subtractEquals((double)1, (int)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).subtractEquals((double)1, (long)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).subtractEquals((double)1, (float)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).subtractEquals((double)1, (double)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).subtractEquals((double)1, bi);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).subtractEquals((double)1, bd);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).subtractEquals(bi, (byte)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).subtractEquals(bi, (char)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).subtractEquals(bi, (short)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).subtractEquals(bi, (int)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).subtractEquals(bi, (long)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).subtractEquals(bi, (float)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).subtractEquals(bi, (double)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).subtractEquals(bi, bi);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).subtractEquals(bi, bd);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).subtractEquals(bd, (byte)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).subtractEquals(bd, (char)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).subtractEquals(bd, (short)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).subtractEquals(bd, (int)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).subtractEquals(bd, (long)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).subtractEquals(bd, (float)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).subtractEquals(bd, (double)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).subtractEquals(bd, bi);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).subtractEquals(bd, bd);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
  }
  
  public void testSupportedMetaClassMethodsSubtractEquals() {    
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(o).subtractEquals(o, o), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(o).subtractEquals(o, (byte)1), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(o).subtractEquals(o, (char)1), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(o).subtractEquals(o, (short)1), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(o).subtractEquals(o, (int)1), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(o).subtractEquals(o, (long)1), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(o).subtractEquals(o, (float)1), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(o).subtractEquals(o, (double)1), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(o).subtractEquals(o, bi), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(o).subtractEquals(o, bd), null);
    
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(o).reverseSubtractEquals((byte)1, o), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(o).reverseSubtractEquals((char)1, o), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(o).reverseSubtractEquals((short)1, o), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(o).reverseSubtractEquals((int)1, o), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(o).reverseSubtractEquals((long)1, o), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(o).reverseSubtractEquals((float)1, o), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(o).reverseSubtractEquals((double)1, o), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(o).reverseSubtractEquals(bi, o), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(o).reverseSubtractEquals(bd, o), null);
  }

  public void testUnsupportedMetaClassMethodsMultiply() {    
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).multiply((byte)1, (byte)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).multiply((byte)1, (char)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).multiply((byte)1, (short)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).multiply((byte)1, (int)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).multiply((byte)1, (long)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).multiply((byte)1, (float)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).multiply((byte)1, (double)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).multiply((byte)1, bi);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).multiply((byte)1, bd);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).multiply((char)1, (byte)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).multiply((char)1, (char)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).multiply((char)1, (short)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).multiply((char)1, (int)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).multiply((char)1, (long)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).multiply((char)1, (float)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).multiply((char)1, (double)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).multiply((char)1, bi);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).multiply((char)1, bd);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).multiply((short)1, (byte)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).multiply((short)1, (char)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).multiply((short)1, (short)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).multiply((short)1, (int)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).multiply((short)1, (long)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).multiply((short)1, (float)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).multiply((short)1, (double)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).multiply((short)1, bi);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).multiply((short)1, bd);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).multiply((int)1, (byte)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).multiply((int)1, (char)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).multiply((int)1, (short)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).multiply((int)1, (int)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).multiply((int)1, (long)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).multiply((int)1, (float)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).multiply((int)1, (double)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).multiply((int)1, bi);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).multiply((int)1, bd);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).multiply((long)1, (byte)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).multiply((long)1, (char)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).multiply((long)1, (short)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).multiply((long)1, (int)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).multiply((long)1, (long)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).multiply((long)1, (float)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).multiply((long)1, (double)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).multiply((long)1, bi);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).multiply((long)1, bd);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).multiply((float)1, (byte)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).multiply((float)1, (char)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).multiply((float)1, (short)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).multiply((float)1, (int)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).multiply((float)1, (long)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).multiply((float)1, (float)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).multiply((float)1, (double)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).multiply((float)1, bi);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).multiply((float)1, bd);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).multiply((double)1, (byte)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).multiply((double)1, (char)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).multiply((double)1, (short)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).multiply((double)1, (int)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).multiply((double)1, (long)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).multiply((double)1, (float)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).multiply((double)1, (double)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).multiply((double)1, bi);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).multiply((double)1, bd);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).multiply(bi, (byte)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).multiply(bi, (char)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).multiply(bi, (short)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).multiply(bi, (int)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).multiply(bi, (long)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).multiply(bi, (float)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).multiply(bi, (double)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).multiply(bi, bi);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).multiply(bi, bd);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).multiply(bd, (byte)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).multiply(bd, (char)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).multiply(bd, (short)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).multiply(bd, (int)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).multiply(bd, (long)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).multiply(bd, (float)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).multiply(bd, (double)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).multiply(bd, bi);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).multiply(bd, bd);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
  }
  
  public void testSupportedMetaClassMethodsMultiply() {    
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(o).multiply(o, o), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(o).multiply(o, (byte)1), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(o).multiply(o, (char)1), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(o).multiply(o, (short)1), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(o).multiply(o, (int)1), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(o).multiply(o, (long)1), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(o).multiply(o, (float)1), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(o).multiply(o, (double)1), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(o).multiply(o, bi), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(o).multiply(o, bd), null);
    
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(o).reverseMultiply((byte)1, o), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(o).reverseMultiply((char)1, o), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(o).reverseMultiply((short)1, o), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(o).reverseMultiply((int)1, o), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(o).reverseMultiply((long)1, o), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(o).reverseMultiply((float)1, o), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(o).reverseMultiply((double)1, o), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(o).reverseMultiply(bi, o), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(o).reverseMultiply(bd, o), null);
  }
 
  public void testUnsupportedMetaClassMethodsMuiltiplyEquals() {    
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).multiplyEquals((byte)1, (byte)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).multiplyEquals((byte)1, (char)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).multiplyEquals((byte)1, (short)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).multiplyEquals((byte)1, (int)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).multiplyEquals((byte)1, (long)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).multiplyEquals((byte)1, (float)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).multiplyEquals((byte)1, (double)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).multiplyEquals((byte)1, bi);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).multiplyEquals((byte)1, bd);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).multiplyEquals((char)1, (byte)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).multiplyEquals((char)1, (char)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).multiplyEquals((char)1, (short)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).multiplyEquals((char)1, (int)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).multiplyEquals((char)1, (long)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).multiplyEquals((char)1, (float)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).multiplyEquals((char)1, (double)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).multiplyEquals((char)1, bi);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).multiplyEquals((char)1, bd);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).multiplyEquals((short)1, (byte)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).multiplyEquals((short)1, (char)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).multiplyEquals((short)1, (short)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).multiplyEquals((short)1, (int)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).multiplyEquals((short)1, (long)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).multiplyEquals((short)1, (float)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).multiplyEquals((short)1, (double)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).multiplyEquals((short)1, bi);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).multiplyEquals((short)1, bd);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).multiplyEquals((int)1, (byte)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).multiplyEquals((int)1, (char)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).multiplyEquals((int)1, (short)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).multiplyEquals((int)1, (int)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).multiplyEquals((int)1, (long)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).multiplyEquals((int)1, (float)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).multiplyEquals((int)1, (double)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).multiplyEquals((int)1, bi);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).multiplyEquals((int)1, bd);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).multiplyEquals((long)1, (byte)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).multiplyEquals((long)1, (char)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).multiplyEquals((long)1, (short)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).multiplyEquals((long)1, (int)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).multiplyEquals((long)1, (long)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).multiplyEquals((long)1, (float)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).multiplyEquals((long)1, (double)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).multiplyEquals((long)1, bi);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).multiplyEquals((long)1, bd);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).multiplyEquals((float)1, (byte)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).multiplyEquals((float)1, (char)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).multiplyEquals((float)1, (short)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).multiplyEquals((float)1, (int)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).multiplyEquals((float)1, (long)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).multiplyEquals((float)1, (float)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).multiplyEquals((float)1, (double)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).multiplyEquals((float)1, bi);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).multiplyEquals((float)1, bd);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).multiplyEquals((double)1, (byte)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).multiplyEquals((double)1, (char)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).multiplyEquals((double)1, (short)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).multiplyEquals((double)1, (int)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).multiplyEquals((double)1, (long)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).multiplyEquals((double)1, (float)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).multiplyEquals((double)1, (double)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).multiplyEquals((double)1, bi);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).multiplyEquals((double)1, bd);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).multiplyEquals(bi, (byte)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).multiplyEquals(bi, (char)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).multiplyEquals(bi, (short)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).multiplyEquals(bi, (int)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).multiplyEquals(bi, (long)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).multiplyEquals(bi, (float)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).multiplyEquals(bi, (double)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).multiplyEquals(bi, bi);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).multiplyEquals(bi, bd);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).multiplyEquals(bd, (byte)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).multiplyEquals(bd, (char)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).multiplyEquals(bd, (short)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).multiplyEquals(bd, (int)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).multiplyEquals(bd, (long)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).multiplyEquals(bd, (float)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).multiplyEquals(bd, (double)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).multiplyEquals(bd, bi);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).multiplyEquals(bd, bd);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
  }
  
  public void testSupportedMetaClassMethodsMultiplyEquals() {    
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(o).multiplyEquals(o, o), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(o).multiplyEquals(o, (byte)1), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(o).multiplyEquals(o, (char)1), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(o).multiplyEquals(o, (short)1), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(o).multiplyEquals(o, (int)1), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(o).multiplyEquals(o, (long)1), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(o).multiplyEquals(o, (float)1), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(o).multiplyEquals(o, (double)1), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(o).multiplyEquals(o, bi), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(o).multiplyEquals(o, bd), null);
    
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(o).reverseMultiplyEquals((byte)1, o), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(o).reverseMultiplyEquals((char)1, o), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(o).reverseMultiplyEquals((short)1, o), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(o).reverseMultiplyEquals((int)1, o), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(o).reverseMultiplyEquals((long)1, o), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(o).reverseMultiplyEquals((float)1, o), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(o).reverseMultiplyEquals((double)1, o), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(o).reverseMultiplyEquals(bi, o), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(o).reverseMultiplyEquals(bd, o), null);
  }

  public void testUnsupportedMetaClassMethodDivide() {    
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).divide((byte)1, (byte)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).divide((byte)1, (char)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).divide((byte)1, (short)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).divide((byte)1, (int)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).divide((byte)1, (long)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).divide((byte)1, (float)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).divide((byte)1, (double)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).divide((byte)1, bi);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).divide((byte)1, bd);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).divide((char)1, (byte)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).divide((char)1, (char)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).divide((char)1, (short)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).divide((char)1, (int)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).divide((char)1, (long)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).divide((char)1, (float)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).divide((char)1, (double)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).divide((char)1, bi);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).divide((char)1, bd);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).divide((short)1, (byte)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).divide((short)1, (char)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).divide((short)1, (short)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).divide((short)1, (int)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).divide((short)1, (long)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).divide((short)1, (float)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).divide((short)1, (double)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).divide((short)1, bi);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).divide((short)1, bd);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).divide((int)1, (byte)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).divide((int)1, (char)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).divide((int)1, (short)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).divide((int)1, (int)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).divide((int)1, (long)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).divide((int)1, (float)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).divide((int)1, (double)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).divide((int)1, bi);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).divide((int)1, bd);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).divide((long)1, (byte)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).divide((long)1, (char)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).divide((long)1, (short)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).divide((long)1, (int)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).divide((long)1, (long)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).divide((long)1, (float)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).divide((long)1, (double)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).divide((long)1, bi);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).divide((long)1, bd);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).divide((float)1, (byte)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).divide((float)1, (char)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).divide((float)1, (short)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).divide((float)1, (int)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).divide((float)1, (long)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).divide((float)1, (float)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).divide((float)1, (double)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).divide((float)1, bi);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).divide((float)1, bd);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).divide((double)1, (byte)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).divide((double)1, (char)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).divide((double)1, (short)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).divide((double)1, (int)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).divide((double)1, (long)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).divide((double)1, (float)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).divide((double)1, (double)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).divide((double)1, bi);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).divide((double)1, bd);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).divide(bi, (byte)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).divide(bi, (char)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).divide(bi, (short)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).divide(bi, (int)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).divide(bi, (long)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).divide(bi, (float)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).divide(bi, (double)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).divide(bi, bi);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).divide(bi, bd);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).divide(bd, (byte)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).divide(bd, (char)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).divide(bd, (short)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).divide(bd, (int)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).divide(bd, (long)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).divide(bd, (float)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).divide(bd, (double)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).divide(bd, bi);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).divide(bd, bd);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
  }
  
  public void testSupportedMetaClassMethodsDivide() {    
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(o).divide(o, o), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(o).divide(o, (byte)1), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(o).divide(o, (char)1), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(o).divide(o, (short)1), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(o).divide(o, (int)1), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(o).divide(o, (long)1), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(o).divide(o, (float)1), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(o).divide(o, (double)1), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(o).divide(o, bi), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(o).divide(o, bd), null);
    
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(o).reverseDivide((byte)1, o), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(o).reverseDivide((char)1, o), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(o).reverseDivide((short)1, o), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(o).reverseDivide((int)1, o), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(o).reverseDivide((long)1, o), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(o).reverseDivide((float)1, o), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(o).reverseDivide((double)1, o), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(o).reverseDivide(bi, o), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(o).reverseDivide(bd, o), null);
  }
  
  public void testUnsupportedMetaClassMethodsDivideEquals() {    
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).divideEquals((byte)1, (byte)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).divideEquals((byte)1, (char)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).divideEquals((byte)1, (short)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).divideEquals((byte)1, (int)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).divideEquals((byte)1, (long)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).divideEquals((byte)1, (float)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).divideEquals((byte)1, (double)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).divideEquals((byte)1, bi);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).divideEquals((byte)1, bd);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).divideEquals((char)1, (byte)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).divideEquals((char)1, (char)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).divideEquals((char)1, (short)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).divideEquals((char)1, (int)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).divideEquals((char)1, (long)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).divideEquals((char)1, (float)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).divideEquals((char)1, (double)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).divideEquals((char)1, bi);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).divideEquals((char)1, bd);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).divideEquals((short)1, (byte)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).divideEquals((short)1, (char)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).divideEquals((short)1, (short)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).divideEquals((short)1, (int)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).divideEquals((short)1, (long)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).divideEquals((short)1, (float)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).divideEquals((short)1, (double)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).divideEquals((short)1, bi);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).divideEquals((short)1, bd);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).divideEquals((int)1, (byte)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).divideEquals((int)1, (char)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).divideEquals((int)1, (short)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).divideEquals((int)1, (int)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).divideEquals((int)1, (long)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).divideEquals((int)1, (float)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).divideEquals((int)1, (double)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).divideEquals((int)1, bi);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).divideEquals((int)1, bd);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).divideEquals((long)1, (byte)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).divideEquals((long)1, (char)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).divideEquals((long)1, (short)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).divideEquals((long)1, (int)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).divideEquals((long)1, (long)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).divideEquals((long)1, (float)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).divideEquals((long)1, (double)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).divideEquals((long)1, bi);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).divideEquals((long)1, bd);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).divideEquals((float)1, (byte)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).divideEquals((float)1, (char)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).divideEquals((float)1, (short)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).divideEquals((float)1, (int)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).divideEquals((float)1, (long)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).divideEquals((float)1, (float)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).divideEquals((float)1, (double)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).divideEquals((float)1, bi);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).divideEquals((float)1, bd);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).divideEquals((double)1, (byte)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).divideEquals((double)1, (char)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).divideEquals((double)1, (short)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).divideEquals((double)1, (int)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).divideEquals((double)1, (long)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).divideEquals((double)1, (float)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).divideEquals((double)1, (double)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).divideEquals((double)1, bi);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).divideEquals((double)1, bd);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).divideEquals(bi, (byte)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).divideEquals(bi, (char)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).divideEquals(bi, (short)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).divideEquals(bi, (int)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).divideEquals(bi, (long)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).divideEquals(bi, (float)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).divideEquals(bi, (double)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).divideEquals(bi, bi);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).divideEquals(bi, bd);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).divideEquals(bd, (byte)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).divideEquals(bd, (char)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).divideEquals(bd, (short)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).divideEquals(bd, (int)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).divideEquals(bd, (long)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).divideEquals(bd, (float)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).divideEquals(bd, (double)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).divideEquals(bd, bi);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).divideEquals(bd, bd);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
  }
  
  public void testSupportedMetaClassMethodsDivideEquals() {    
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(o).divideEquals(o, o), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(o).divideEquals(o, (byte)1), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(o).divideEquals(o, (char)1), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(o).divideEquals(o, (short)1), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(o).divideEquals(o, (int)1), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(o).divideEquals(o, (long)1), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(o).divideEquals(o, (float)1), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(o).divideEquals(o, (double)1), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(o).divideEquals(o, bi), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(o).divideEquals(o, bd), null);
    
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(o).reverseDivideEquals((byte)1, o), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(o).reverseDivideEquals((char)1, o), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(o).reverseDivideEquals((short)1, o), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(o).reverseDivideEquals((int)1, o), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(o).reverseDivideEquals((long)1, o), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(o).reverseDivideEquals((float)1, o), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(o).reverseDivideEquals((double)1, o), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(o).reverseDivideEquals(bi, o), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(o).reverseDivideEquals(bd, o), null);
  }

  public void testUnsupportedMetaClassMethodIntegerDivide() {    
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).integerDivide((byte)1, (byte)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).integerDivide((byte)1, (char)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).integerDivide((byte)1, (short)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).integerDivide((byte)1, (int)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).integerDivide((byte)1, (long)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).integerDivide((byte)1, (float)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).integerDivide((byte)1, (double)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).integerDivide((byte)1, bi);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).integerDivide((byte)1, bd);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).integerDivide((char)1, (byte)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).integerDivide((char)1, (char)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).integerDivide((char)1, (short)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).integerDivide((char)1, (int)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).integerDivide((char)1, (long)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).integerDivide((char)1, (float)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).integerDivide((char)1, (double)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).integerDivide((char)1, bi);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).integerDivide((char)1, bd);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).integerDivide((short)1, (byte)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).integerDivide((short)1, (char)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).integerDivide((short)1, (short)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).integerDivide((short)1, (int)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).integerDivide((short)1, (long)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).integerDivide((short)1, (float)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).integerDivide((short)1, (double)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).integerDivide((short)1, bi);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).integerDivide((short)1, bd);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).integerDivide((int)1, (byte)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).integerDivide((int)1, (char)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).integerDivide((int)1, (short)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).integerDivide((int)1, (int)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).integerDivide((int)1, (long)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).integerDivide((int)1, (float)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).integerDivide((int)1, (double)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).integerDivide((int)1, bi);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).integerDivide((int)1, bd);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).integerDivide((long)1, (byte)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).integerDivide((long)1, (char)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).integerDivide((long)1, (short)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).integerDivide((long)1, (int)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).integerDivide((long)1, (long)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).integerDivide((long)1, (float)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).integerDivide((long)1, (double)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).integerDivide((long)1, bi);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).integerDivide((long)1, bd);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).integerDivide((float)1, (byte)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).integerDivide((float)1, (char)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).integerDivide((float)1, (short)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).integerDivide((float)1, (int)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).integerDivide((float)1, (long)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).integerDivide((float)1, (float)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).integerDivide((float)1, (double)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).integerDivide((float)1, bi);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).integerDivide((float)1, bd);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).integerDivide((double)1, (byte)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).integerDivide((double)1, (char)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).integerDivide((double)1, (short)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).integerDivide((double)1, (int)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).integerDivide((double)1, (long)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).integerDivide((double)1, (float)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).integerDivide((double)1, (double)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).integerDivide((double)1, bi);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).integerDivide((double)1, bd);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).integerDivide(bi, (byte)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).integerDivide(bi, (char)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).integerDivide(bi, (short)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).integerDivide(bi, (int)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).integerDivide(bi, (long)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).integerDivide(bi, (float)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).integerDivide(bi, (double)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).integerDivide(bi, bi);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).integerDivide(bi, bd);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).integerDivide(bd, (byte)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).integerDivide(bd, (char)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).integerDivide(bd, (short)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).integerDivide(bd, (int)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).integerDivide(bd, (long)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).integerDivide(bd, (float)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).integerDivide(bd, (double)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).integerDivide(bd, bi);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).integerDivide(bd, bd);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
  }
  
  public void testSupportedMetaClassMethodsIntegerDivide() {    
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(o).integerDivide(o, o), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(o).integerDivide(o, (byte)1), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(o).integerDivide(o, (char)1), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(o).integerDivide(o, (short)1), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(o).integerDivide(o, (int)1), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(o).integerDivide(o, (long)1), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(o).integerDivide(o, (float)1), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(o).integerDivide(o, (double)1), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(o).integerDivide(o, bi), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(o).integerDivide(o, bd), null);
    
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(o).reverseIntegerDivide((byte)1, o), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(o).reverseIntegerDivide((char)1, o), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(o).reverseIntegerDivide((short)1, o), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(o).reverseIntegerDivide((int)1, o), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(o).reverseIntegerDivide((long)1, o), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(o).reverseIntegerDivide((float)1, o), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(o).reverseIntegerDivide((double)1, o), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(o).reverseIntegerDivide(bi, o), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(o).reverseIntegerDivide(bd, o), null);
  }

  public void testUnsupportedMetaClassMethodIntegerDivideEquals() {    
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).integerDivideEquals((byte)1, (byte)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).integerDivideEquals((byte)1, (char)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).integerDivideEquals((byte)1, (short)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).integerDivideEquals((byte)1, (int)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).integerDivideEquals((byte)1, (long)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).integerDivideEquals((byte)1, (float)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).integerDivideEquals((byte)1, (double)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).integerDivideEquals((byte)1, bi);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).integerDivideEquals((byte)1, bd);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).integerDivideEquals((char)1, (byte)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).integerDivideEquals((char)1, (char)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).integerDivideEquals((char)1, (short)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).integerDivideEquals((char)1, (int)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).integerDivideEquals((char)1, (long)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).integerDivideEquals((char)1, (float)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).integerDivideEquals((char)1, (double)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).integerDivideEquals((char)1, bi);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).integerDivideEquals((char)1, bd);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).integerDivideEquals((short)1, (byte)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).integerDivideEquals((short)1, (char)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).integerDivideEquals((short)1, (short)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).integerDivideEquals((short)1, (int)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).integerDivideEquals((short)1, (long)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).integerDivideEquals((short)1, (float)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).integerDivideEquals((short)1, (double)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).integerDivideEquals((short)1, bi);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).integerDivideEquals((short)1, bd);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).integerDivideEquals((int)1, (byte)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).integerDivideEquals((int)1, (char)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).integerDivideEquals((int)1, (short)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).integerDivideEquals((int)1, (int)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).integerDivideEquals((int)1, (long)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).integerDivideEquals((int)1, (float)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).integerDivideEquals((int)1, (double)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).integerDivideEquals((int)1, bi);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).integerDivideEquals((int)1, bd);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).integerDivideEquals((long)1, (byte)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).integerDivideEquals((long)1, (char)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).integerDivideEquals((long)1, (short)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).integerDivideEquals((long)1, (int)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).integerDivideEquals((long)1, (long)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).integerDivideEquals((long)1, (float)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).integerDivideEquals((long)1, (double)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).integerDivideEquals((long)1, bi);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).integerDivideEquals((long)1, bd);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).integerDivideEquals((float)1, (byte)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).integerDivideEquals((float)1, (char)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).integerDivideEquals((float)1, (short)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).integerDivideEquals((float)1, (int)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).integerDivideEquals((float)1, (long)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).integerDivideEquals((float)1, (float)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).integerDivideEquals((float)1, (double)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).integerDivideEquals((float)1, bi);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).integerDivideEquals((float)1, bd);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).integerDivideEquals((double)1, (byte)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).integerDivideEquals((double)1, (char)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).integerDivideEquals((double)1, (short)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).integerDivideEquals((double)1, (int)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).integerDivideEquals((double)1, (long)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).integerDivideEquals((double)1, (float)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).integerDivideEquals((double)1, (double)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).integerDivideEquals((double)1, bi);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).integerDivideEquals((double)1, bd);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).integerDivideEquals(bi, (byte)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).integerDivideEquals(bi, (char)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).integerDivideEquals(bi, (short)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).integerDivideEquals(bi, (int)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).integerDivideEquals(bi, (long)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).integerDivideEquals(bi, (float)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).integerDivideEquals(bi, (double)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).integerDivideEquals(bi, bi);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).integerDivideEquals(bi, bd);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).integerDivideEquals(bd, (byte)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).integerDivideEquals(bd, (char)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).integerDivideEquals(bd, (short)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).integerDivideEquals(bd, (int)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).integerDivideEquals(bd, (long)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).integerDivideEquals(bd, (float)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).integerDivideEquals(bd, (double)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).integerDivideEquals(bd, bi);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).integerDivideEquals(bd, bd);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
  }
  
  public void testSupportedMetaClassMethodsIntegerDivideEquals() {    
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(o).integerDivideEquals(o, o), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(o).integerDivideEquals(o, (byte)1), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(o).integerDivideEquals(o, (char)1), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(o).integerDivideEquals(o, (short)1), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(o).integerDivideEquals(o, (int)1), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(o).integerDivideEquals(o, (long)1), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(o).integerDivideEquals(o, (float)1), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(o).integerDivideEquals(o, (double)1), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(o).integerDivideEquals(o, bi), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(o).integerDivideEquals(o, bd), null);
    
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(o).reverseIntegerDivideEquals((byte)1, o), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(o).reverseIntegerDivideEquals((char)1, o), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(o).reverseIntegerDivideEquals((short)1, o), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(o).reverseIntegerDivideEquals((int)1, o), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(o).reverseIntegerDivideEquals((long)1, o), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(o).reverseIntegerDivideEquals((float)1, o), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(o).reverseIntegerDivideEquals((double)1, o), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(o).reverseIntegerDivideEquals(bi, o), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(o).reverseIntegerDivideEquals(bd, o), null);
  }

  public void testUnsupportedMetaClassMethodRemainder() {    
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).remainder((byte)1, (byte)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).remainder((byte)1, (char)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).remainder((byte)1, (short)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).remainder((byte)1, (int)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).remainder((byte)1, (long)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).remainder((byte)1, bi);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).remainder((char)1, (byte)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).remainder((char)1, (char)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).remainder((char)1, (short)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).remainder((char)1, (int)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).remainder((char)1, (long)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).remainder((char)1, bi);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).remainder((short)1, (byte)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).remainder((short)1, (char)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).remainder((short)1, (short)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).remainder((short)1, (int)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).remainder((short)1, (long)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).remainder((short)1, bi);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).remainder((int)1, (byte)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).remainder((int)1, (char)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).remainder((int)1, (short)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).remainder((int)1, (int)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).remainder((int)1, (long)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).remainder((int)1, bi);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).remainder((long)1, (byte)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).remainder((long)1, (char)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).remainder((long)1, (short)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).remainder((long)1, (int)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).remainder((long)1, (long)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).remainder((long)1, bi);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).remainder(bi, (byte)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).remainder(bi, (char)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).remainder(bi, (short)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).remainder(bi, (int)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).remainder(bi, (long)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).remainder(bi, bi);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
  }
  
  public void testSupportedMetaClassMethodsRemainder() {    
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(o).remainder(o, o), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(o).remainder(o, (byte)1), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(o).remainder(o, (char)1), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(o).remainder(o, (short)1), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(o).remainder(o, (int)1), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(o).remainder(o, (long)1), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(o).remainder(o, (float)1), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(o).remainder(o, (double)1), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(o).remainder(o, bi), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(o).remainder(o, bd), null);
    
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(o).reverseRemainder((byte)1, o), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(o).reverseRemainder((char)1, o), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(o).reverseRemainder((short)1, o), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(o).reverseRemainder((int)1, o), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(o).reverseRemainder((long)1, o), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(o).reverseRemainder(bi, o), null);
  }

  public void testUnsupportedMetaClassMethodRemainderEquals() {    
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).remainderEquals((byte)1, (byte)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).remainderEquals((byte)1, (char)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).remainderEquals((byte)1, (short)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).remainderEquals((byte)1, (int)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).remainderEquals((byte)1, (long)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).remainderEquals((byte)1, bi);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).remainderEquals((char)1, (byte)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).remainderEquals((char)1, (char)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).remainderEquals((char)1, (short)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).remainderEquals((char)1, (int)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).remainderEquals((char)1, (long)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).remainderEquals((char)1, bi);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).remainderEquals((short)1, (byte)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).remainderEquals((short)1, (char)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).remainderEquals((short)1, (short)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).remainderEquals((short)1, (int)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).remainderEquals((short)1, (long)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).remainderEquals((short)1, bi);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).remainderEquals((int)1, (byte)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).remainderEquals((int)1, (char)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).remainderEquals((int)1, (short)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).remainderEquals((int)1, (int)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).remainderEquals((int)1, (long)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).remainderEquals((int)1, bi);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).remainderEquals((long)1, (byte)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).remainderEquals((long)1, (char)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).remainderEquals((long)1, (short)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).remainderEquals((long)1, (int)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).remainderEquals((long)1, (long)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).remainderEquals((long)1, bi);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).remainderEquals(bi, (byte)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).remainderEquals(bi, (char)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).remainderEquals(bi, (short)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).remainderEquals(bi, (int)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).remainderEquals(bi, (long)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).remainderEquals(bi, bi);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
  }
  
  public void testSupportedMetaClassMethodsRemainderEquals() {    
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(o).remainderEquals(o, o), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(o).remainderEquals(o, (byte)1), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(o).remainderEquals(o, (char)1), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(o).remainderEquals(o, (short)1), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(o).remainderEquals(o, (int)1), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(o).remainderEquals(o, (long)1), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(o).remainderEquals(o, (float)1), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(o).remainderEquals(o, (double)1), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(o).remainderEquals(o, bi), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(o).remainderEquals(o, bd), null);
    
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(o).reverseRemainderEquals((byte)1, o), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(o).reverseRemainderEquals((char)1, o), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(o).reverseRemainderEquals((short)1, o), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(o).reverseRemainderEquals((int)1, o), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(o).reverseRemainderEquals((long)1, o), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(o).reverseRemainderEquals(bi, o), null);
  }
  
  public void testUnsupportedMetaClassMethodsAnd() {    
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).and((byte)1, (byte)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).and((byte)1, (char)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).and((byte)1, (short)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).and((byte)1, (int)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).and((byte)1, (long)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).and((byte)1, bi);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).and((char)1, (byte)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).and((char)1, (char)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).and((char)1, (short)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).and((char)1, (int)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).and((char)1, (long)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
   try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).and((char)1, bi);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).and((short)1, (byte)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).and((short)1, (char)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).and((short)1, (short)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).and((short)1, (int)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).and((short)1, (long)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).and((short)1, bi);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).and((int)1, (byte)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).and((int)1, (char)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).and((int)1, (short)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).and((int)1, (int)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).and((int)1, (long)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).and((int)1, bi);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).and((long)1, (byte)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).and((long)1, (char)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).and((long)1, (short)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).and((long)1, (int)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).and((long)1, (long)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).and((long)1, bi);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).and(bi, (byte)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).and(bi, (char)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).and(bi, (short)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).and(bi, (int)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).and(bi, (long)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).and(bi, bi);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
  }
  
  public void testSupportedMetaClassMethodsAnd() {    
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(o).and(o, o), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(o).and(o, (byte)1), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(o).and(o, (char)1), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(o).and(o, (short)1), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(o).and(o, (int)1), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(o).and(o, (long)1), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(o).and(o, bi), null);
    
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(o).reverseAnd((byte)1, o), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(o).reverseAnd((char)1, o), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(o).reverseAnd((short)1, o), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(o).reverseAnd((int)1, o), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(o).reverseAnd((long)1, o), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(o).reverseAnd(bi, o), null);
  }
  
  public void testUnsupportedMetaClassMethodsAndEquals() {    
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).andEquals((byte)1, (byte)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).andEquals((byte)1, (char)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).andEquals((byte)1, (short)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).andEquals((byte)1, (int)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).andEquals((byte)1, (long)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).andEquals((byte)1, bi);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).andEquals((char)1, (byte)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).andEquals((char)1, (char)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).andEquals((char)1, (short)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).andEquals((char)1, (int)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).andEquals((char)1, (long)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).andEquals((char)1, bi);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).andEquals((short)1, (byte)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).andEquals((short)1, (char)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).andEquals((short)1, (short)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).andEquals((short)1, (int)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).andEquals((short)1, (long)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).andEquals((short)1, bi);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).andEquals((int)1, (byte)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).andEquals((int)1, (char)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).andEquals((int)1, (short)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).andEquals((int)1, (int)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).andEquals((int)1, (long)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).andEquals((int)1, bi);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).andEquals((long)1, (byte)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).andEquals((long)1, (char)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).andEquals((long)1, (short)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).andEquals((long)1, (int)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).andEquals((long)1, (long)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).andEquals((long)1, bi);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).andEquals(bi, (byte)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).andEquals(bi, (char)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).andEquals(bi, (short)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).andEquals(bi, (int)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).andEquals(bi, (long)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).andEquals(bi, bi);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
  }
  
  public void testSupportedMetaClassMethodsAndEquals() {    
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(o).andEquals(o, o), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(o).andEquals(o, (byte)1), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(o).andEquals(o, (char)1), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(o).andEquals(o, (short)1), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(o).andEquals(o, (int)1), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(o).andEquals(o, (long)1), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(o).andEquals(o, bi), null);
    
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(o).reverseAndEquals((byte)1, o), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(o).reverseAndEquals((char)1, o), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(o).reverseAndEquals((short)1, o), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(o).reverseAndEquals((int)1, o), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(o).reverseAndEquals((long)1, o), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(o).reverseAndEquals(bi, o), null);
  }
  
  public void testUnsupportedMetaClassMethodsOr() {    
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).or((byte)1, (byte)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).or((byte)1, (char)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).or((byte)1, (short)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).or((byte)1, (int)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).or((byte)1, (long)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).or((byte)1, bi);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).or((char)1, (byte)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).or((char)1, (char)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).or((char)1, (short)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).or((char)1, (int)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).or((char)1, (long)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
   try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).or((char)1, bi);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).or((short)1, (byte)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).or((short)1, (char)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).or((short)1, (short)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).or((short)1, (int)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).or((short)1, (long)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).or((short)1, bi);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).or((int)1, (byte)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).or((int)1, (char)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).or((int)1, (short)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).or((int)1, (int)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).or((int)1, (long)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).or((int)1, bi);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).or((long)1, (byte)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).or((long)1, (char)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).or((long)1, (short)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).or((long)1, (int)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).or((long)1, (long)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).or((long)1, bi);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).or(bi, (byte)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).or(bi, (char)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).or(bi, (short)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).or(bi, (int)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).or(bi, (long)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).or(bi, bi);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
  }
  
  public void testSupportedMetaClassMethodsOr() {    
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(o).or(o, o), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(o).or(o, (byte)1), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(o).or(o, (char)1), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(o).or(o, (short)1), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(o).or(o, (int)1), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(o).or(o, (long)1), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(o).or(o, bi), null);
    
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(o).reverseOr((byte)1, o), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(o).reverseOr((char)1, o), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(o).reverseOr((short)1, o), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(o).reverseOr((int)1, o), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(o).reverseOr((long)1, o), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(o).reverseOr(bi, o), null);
  }
  
  public void testUnsupportedMetaClassMethodsOrEquals() {    
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).orEquals((byte)1, (byte)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).orEquals((byte)1, (char)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).orEquals((byte)1, (short)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).orEquals((byte)1, (int)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).orEquals((byte)1, (long)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).orEquals((byte)1, bi);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).orEquals((char)1, (byte)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).orEquals((char)1, (char)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).orEquals((char)1, (short)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).orEquals((char)1, (int)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).orEquals((char)1, (long)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).orEquals((char)1, bi);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).orEquals((short)1, (byte)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).orEquals((short)1, (char)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).orEquals((short)1, (short)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).orEquals((short)1, (int)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).orEquals((short)1, (long)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).orEquals((short)1, bi);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).orEquals((int)1, (byte)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).orEquals((int)1, (char)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).orEquals((int)1, (short)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).orEquals((int)1, (int)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).orEquals((int)1, (long)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).orEquals((int)1, bi);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).orEquals((long)1, (byte)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).orEquals((long)1, (char)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).orEquals((long)1, (short)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).orEquals((long)1, (int)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).orEquals((long)1, (long)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).orEquals((long)1, bi);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).orEquals(bi, (byte)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).orEquals(bi, (char)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).orEquals(bi, (short)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).orEquals(bi, (int)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).orEquals(bi, (long)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).orEquals(bi, bi);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
  }
  
  public void testSupportedMetaClassMethodsOrEquals() {    
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(o).orEquals(o, o), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(o).orEquals(o, (byte)1), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(o).orEquals(o, (char)1), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(o).orEquals(o, (short)1), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(o).orEquals(o, (int)1), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(o).orEquals(o, (long)1), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(o).orEquals(o, bi), null);
    
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(o).reverseOrEquals((byte)1, o), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(o).reverseOrEquals((char)1, o), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(o).reverseOrEquals((short)1, o), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(o).reverseOrEquals((int)1, o), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(o).reverseOrEquals((long)1, o), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(o).reverseOrEquals(bi, o), null);
  }
  
  public void testUnsupportedMetaClassMethodsXor() {    
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).xor((byte)1, (byte)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).xor((byte)1, (char)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).xor((byte)1, (short)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).xor((byte)1, (int)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).xor((byte)1, (long)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).xor((byte)1, bi);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).xor((char)1, (byte)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).xor((char)1, (char)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).xor((char)1, (short)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).xor((char)1, (int)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).xor((char)1, (long)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
   try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).xor((char)1, bi);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).xor((short)1, (byte)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).xor((short)1, (char)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).xor((short)1, (short)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).xor((short)1, (int)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).xor((short)1, (long)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).xor((short)1, bi);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).xor((int)1, (byte)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).xor((int)1, (char)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).xor((int)1, (short)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).xor((int)1, (int)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).xor((int)1, (long)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).xor((int)1, bi);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).xor((long)1, (byte)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).xor((long)1, (char)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).xor((long)1, (short)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).xor((long)1, (int)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).xor((long)1, (long)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).xor((long)1, bi);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).xor(bi, (byte)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).xor(bi, (char)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).xor(bi, (short)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).xor(bi, (int)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).xor(bi, (long)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).xor(bi, bi);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
  }
  
  public void testSupportedMetaClassMethodsXor() {    
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(o).xor(o, o), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(o).xor(o, (byte)1), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(o).xor(o, (char)1), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(o).xor(o, (short)1), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(o).xor(o, (int)1), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(o).xor(o, (long)1), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(o).xor(o, bi), null);
    
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(o).reverseXor((byte)1, o), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(o).reverseXor((char)1, o), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(o).reverseXor((short)1, o), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(o).reverseXor((int)1, o), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(o).reverseXor((long)1, o), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(o).reverseXor(bi, o), null);
  }
  
  public void testUnsupportedMetaClassMethodsXorEquals() {    
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).xorEquals((byte)1, (byte)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).xorEquals((byte)1, (char)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).xorEquals((byte)1, (short)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).xorEquals((byte)1, (int)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).xorEquals((byte)1, (long)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).xorEquals((byte)1, bi);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).xorEquals((char)1, (byte)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).xorEquals((char)1, (char)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).xorEquals((char)1, (short)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).xorEquals((char)1, (int)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).xorEquals((char)1, (long)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).xorEquals((char)1, bi);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).xorEquals((short)1, (byte)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).xorEquals((short)1, (char)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).xorEquals((short)1, (short)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).xorEquals((short)1, (int)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).xorEquals((short)1, (long)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).xorEquals((short)1, bi);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).xorEquals((int)1, (byte)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).xorEquals((int)1, (char)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).xorEquals((int)1, (short)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).xorEquals((int)1, (int)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).xorEquals((int)1, (long)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).xorEquals((int)1, bi);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).xorEquals((long)1, (byte)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).xorEquals((long)1, (char)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).xorEquals((long)1, (short)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).xorEquals((long)1, (int)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).xorEquals((long)1, (long)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).xorEquals((long)1, bi);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).xorEquals(bi, (byte)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).xorEquals(bi, (char)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).xorEquals(bi, (short)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).xorEquals(bi, (int)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).xorEquals(bi, (long)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).xorEquals(bi, bi);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
  }
  
  public void testSupportedMetaClassMethodsXorEquals() {    
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(o).xorEquals(o, o), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(o).xorEquals(o, (byte)1), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(o).xorEquals(o, (char)1), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(o).xorEquals(o, (short)1), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(o).xorEquals(o, (int)1), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(o).xorEquals(o, (long)1), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(o).xorEquals(o, bi), null);
    
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(o).reverseXorEquals((byte)1, o), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(o).reverseXorEquals((char)1, o), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(o).reverseXorEquals((short)1, o), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(o).reverseXorEquals((int)1, o), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(o).reverseXorEquals((long)1, o), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(o).reverseXorEquals(bi, o), null);
  }
  
  public void testUnsupportedMetaClassMethodsCompare() {    
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).compare((byte)1, (byte)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).compare((byte)1, (char)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).compare((byte)1, (short)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).compare((byte)1, (int)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).compare((byte)1, (long)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).compare((byte)1, (float)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).compare((byte)1, (double)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).compare((byte)1, bi);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).compare((byte)1, bd);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).compare((char)1, (byte)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).compare((char)1, (char)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).compare((char)1, (short)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).compare((char)1, (int)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).compare((char)1, (long)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).compare((char)1, (float)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).compare((char)1, (double)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).compare((char)1, bi);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).compare((char)1, bd);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).compare((short)1, (byte)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).compare((short)1, (char)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).compare((short)1, (short)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).compare((short)1, (int)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).compare((short)1, (long)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).compare((short)1, (float)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).compare((short)1, (double)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).compare((short)1, bi);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).compare((short)1, bd);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).compare((int)1, (byte)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).compare((int)1, (char)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).compare((int)1, (short)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).compare((int)1, (int)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).compare((int)1, (long)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).compare((int)1, (float)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).compare((int)1, (double)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).compare((int)1, bi);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).compare((int)1, bd);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).compare((long)1, (byte)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).compare((long)1, (char)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).compare((long)1, (short)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).compare((long)1, (int)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).compare((long)1, (long)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).compare((long)1, (float)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).compare((long)1, (double)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).compare((long)1, bi);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).compare((long)1, bd);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).compare((float)1, (byte)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).compare((float)1, (char)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).compare((float)1, (short)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).compare((float)1, (int)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).compare((float)1, (long)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).compare((float)1, (float)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).compare((float)1, (double)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).compare((float)1, bi);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).compare((float)1, bd);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).compare((double)1, (byte)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).compare((double)1, (char)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).compare((double)1, (short)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).compare((double)1, (int)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).compare((double)1, (long)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).compare((double)1, (float)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).compare((double)1, (double)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).compare((double)1, bi);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).compare((double)1, bd);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).compare(bi, (byte)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).compare(bi, (char)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).compare(bi, (short)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).compare(bi, (int)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).compare(bi, (long)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).compare(bi, (float)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).compare(bi, (double)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).compare(bi, bi);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).compare(bi, bd);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).compare(bd, (byte)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).compare(bd, (char)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).compare(bd, (short)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).compare(bd, (int)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).compare(bd, (long)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).compare(bd, (float)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).compare(bd, (double)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).compare(bd, bi);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).compare(bd, bd);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
  }
  
  public void testSupportedMetaClassMethodsCompare() {    
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(o).compare(o, o), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(o).compare(o, (byte)1), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(o).compare(o, (char)1), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(o).compare(o, (short)1), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(o).compare(o, (int)1), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(o).compare(o, (long)1), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(o).compare(o, (float)1), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(o).compare(o, (double)1), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(o).compare(o, bi), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(o).compare(o, bd), null);
    
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(o).reverseCompare((byte)1, o), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(o).reverseCompare((char)1, o), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(o).reverseCompare((short)1, o), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(o).reverseCompare((int)1, o), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(o).reverseCompare((long)1, o), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(o).reverseCompare((float)1, o), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(o).reverseCompare((double)1, o), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(o).reverseCompare(bi, o), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(o).reverseCompare(bd, o), null);
  }
  
  public void testUnsupportedMetaClassMethodsEquals() {    
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).equals((byte)1, (byte)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).equals((byte)1, (char)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).equals((byte)1, (short)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).equals((byte)1, (int)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).equals((byte)1, (long)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).equals((byte)1, (float)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).equals((byte)1, (double)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).equals((byte)1, bi);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).equals((byte)1, bd);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).equals((char)1, (byte)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).equals((char)1, (char)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).equals((char)1, (short)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).equals((char)1, (int)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).equals((char)1, (long)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).equals((char)1, (float)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).equals((char)1, (double)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).equals((char)1, bi);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).equals((char)1, bd);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).equals((short)1, (byte)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).equals((short)1, (char)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).equals((short)1, (short)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).equals((short)1, (int)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).equals((short)1, (long)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).equals((short)1, (float)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).equals((short)1, (double)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).equals((short)1, bi);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).equals((short)1, bd);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).equals((int)1, (byte)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).equals((int)1, (char)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).equals((int)1, (short)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).equals((int)1, (int)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).equals((int)1, (long)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).equals((int)1, (float)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).equals((int)1, (double)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).equals((int)1, bi);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).equals((int)1, bd);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).equals((long)1, (byte)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).equals((long)1, (char)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).equals((long)1, (short)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).equals((long)1, (int)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).equals((long)1, (long)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).equals((long)1, (float)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).equals((long)1, (double)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).equals((long)1, bi);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).equals((long)1, bd);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).equals((float)1, (byte)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).equals((float)1, (char)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).equals((float)1, (short)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).equals((float)1, (int)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).equals((float)1, (long)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).equals((float)1, (float)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).equals((float)1, (double)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).equals((float)1, bi);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).equals((float)1, bd);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).equals((double)1, (byte)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).equals((double)1, (char)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).equals((double)1, (short)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).equals((double)1, (int)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).equals((double)1, (long)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).equals((double)1, (float)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).equals((double)1, (double)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).equals((double)1, bi);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).equals((double)1, bd);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).equals(bi, (byte)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).equals(bi, (char)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).equals(bi, (short)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).equals(bi, (int)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).equals(bi, (long)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).equals(bi, (float)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).equals(bi, (double)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).equals(bi, bi);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).equals(bi, bd);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).equals(bd, (byte)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).equals(bd, (char)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).equals(bd, (short)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).equals(bd, (int)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).equals(bd, (long)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).equals(bd, (float)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).equals(bd, (double)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).equals(bd, bi);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).equals(bd, bd);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
  }
  
  public void testSupportedMetaClassMethodsEquals() {    
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(o).equals(o, o), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(o).equals(o, (byte)1), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(o).equals(o, (char)1), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(o).equals(o, (short)1), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(o).equals(o, (int)1), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(o).equals(o, (long)1), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(o).equals(o, (float)1), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(o).equals(o, (double)1), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(o).equals(o, bi), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(o).equals(o, bd), null);
    
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(o).reverseEquals((byte)1, o), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(o).reverseEquals((char)1, o), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(o).reverseEquals((short)1, o), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(o).reverseEquals((int)1, o), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(o).reverseEquals((long)1, o), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(o).reverseEquals((float)1, o), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(o).reverseEquals((double)1, o), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(o).reverseEquals(bi, o), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(o).reverseEquals(bd, o), null);
  }
 
  public void testUnsupportedMetaClassMethodsNotEquals() {    
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).notEquals((byte)1, (byte)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).notEquals((byte)1, (char)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).notEquals((byte)1, (short)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).notEquals((byte)1, (int)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).notEquals((byte)1, (long)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).notEquals((byte)1, (float)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).notEquals((byte)1, (double)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).notEquals((byte)1, bi);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).notEquals((byte)1, bd);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).notEquals((char)1, (byte)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).notEquals((char)1, (char)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).notEquals((char)1, (short)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).notEquals((char)1, (int)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).notEquals((char)1, (long)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).notEquals((char)1, (float)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).notEquals((char)1, (double)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).notEquals((char)1, bi);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).notEquals((char)1, bd);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).notEquals((short)1, (byte)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).notEquals((short)1, (char)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).notEquals((short)1, (short)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).notEquals((short)1, (int)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).notEquals((short)1, (long)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).notEquals((short)1, (float)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).notEquals((short)1, (double)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).notEquals((short)1, bi);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).notEquals((short)1, bd);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).notEquals((int)1, (byte)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).notEquals((int)1, (char)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).notEquals((int)1, (short)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).notEquals((int)1, (int)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).notEquals((int)1, (long)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).notEquals((int)1, (float)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).notEquals((int)1, (double)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).notEquals((int)1, bi);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).notEquals((int)1, bd);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).notEquals((long)1, (byte)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).notEquals((long)1, (char)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).notEquals((long)1, (short)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).notEquals((long)1, (int)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).notEquals((long)1, (long)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).notEquals((long)1, (float)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).notEquals((long)1, (double)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).notEquals((long)1, bi);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).notEquals((long)1, bd);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).notEquals((float)1, (byte)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).notEquals((float)1, (char)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).notEquals((float)1, (short)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).notEquals((float)1, (int)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).notEquals((float)1, (long)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).notEquals((float)1, (float)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).notEquals((float)1, (double)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).notEquals((float)1, bi);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).notEquals((float)1, bd);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).notEquals((double)1, (byte)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).notEquals((double)1, (char)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).notEquals((double)1, (short)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).notEquals((double)1, (int)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).notEquals((double)1, (long)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).notEquals((double)1, (float)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).notEquals((double)1, (double)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).notEquals((double)1, bi);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).notEquals((double)1, bd);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).notEquals(bi, (byte)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).notEquals(bi, (char)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).notEquals(bi, (short)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).notEquals(bi, (int)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).notEquals(bi, (long)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).notEquals(bi, (float)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).notEquals(bi, (double)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).notEquals(bi, bi);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).notEquals(bi, bd);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).notEquals(bd, (byte)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).notEquals(bd, (char)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).notEquals(bd, (short)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).notEquals(bd, (int)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).notEquals(bd, (long)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).notEquals(bd, (float)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).notEquals(bd, (double)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).notEquals(bd, bi);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).notEquals(bd, bd);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
  }
  
  public void testSupportedMetaClassMethodsNotEquals() {    
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(o).notEquals(o, o), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(o).notEquals(o, (byte)1), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(o).notEquals(o, (char)1), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(o).notEquals(o, (short)1), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(o).notEquals(o, (int)1), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(o).notEquals(o, (long)1), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(o).notEquals(o, (float)1), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(o).notEquals(o, (double)1), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(o).notEquals(o, bi), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(o).notEquals(o, bd), null);
    
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(o).reverseNotEquals((byte)1, o), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(o).reverseNotEquals((char)1, o), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(o).reverseNotEquals((short)1, o), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(o).reverseNotEquals((int)1, o), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(o).reverseNotEquals((long)1, o), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(o).reverseNotEquals((float)1, o), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(o).reverseNotEquals((double)1, o), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(o).reverseNotEquals(bi, o), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(o).reverseNotEquals(bd, o), null);
  }
 
  public void testUnsupportedMetaClassMethodsLessThan() {    
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).lessThan((byte)1, (byte)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).lessThan((byte)1, (char)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).lessThan((byte)1, (short)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).lessThan((byte)1, (int)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).lessThan((byte)1, (long)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).lessThan((byte)1, (float)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).lessThan((byte)1, (double)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).lessThan((byte)1, bi);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).lessThan((byte)1, bd);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).lessThan((char)1, (byte)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).lessThan((char)1, (char)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).lessThan((char)1, (short)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).lessThan((char)1, (int)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).lessThan((char)1, (long)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).lessThan((char)1, (float)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).lessThan((char)1, (double)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).lessThan((char)1, bi);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).lessThan((char)1, bd);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).lessThan((short)1, (byte)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).lessThan((short)1, (char)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).lessThan((short)1, (short)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).lessThan((short)1, (int)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).lessThan((short)1, (long)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).lessThan((short)1, (float)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).lessThan((short)1, (double)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).lessThan((short)1, bi);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).lessThan((short)1, bd);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).lessThan((int)1, (byte)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).lessThan((int)1, (char)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).lessThan((int)1, (short)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).lessThan((int)1, (int)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).lessThan((int)1, (long)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).lessThan((int)1, (float)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).lessThan((int)1, (double)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).lessThan((int)1, bi);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).lessThan((int)1, bd);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).lessThan((long)1, (byte)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).lessThan((long)1, (char)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).lessThan((long)1, (short)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).lessThan((long)1, (int)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).lessThan((long)1, (long)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).lessThan((long)1, (float)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).lessThan((long)1, (double)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).lessThan((long)1, bi);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).lessThan((long)1, bd);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).lessThan((float)1, (byte)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).lessThan((float)1, (char)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).lessThan((float)1, (short)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).lessThan((float)1, (int)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).lessThan((float)1, (long)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).lessThan((float)1, (float)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).lessThan((float)1, (double)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).lessThan((float)1, bi);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).lessThan((float)1, bd);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).lessThan((double)1, (byte)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).lessThan((double)1, (char)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).lessThan((double)1, (short)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).lessThan((double)1, (int)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).lessThan((double)1, (long)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).lessThan((double)1, (float)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).lessThan((double)1, (double)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).lessThan((double)1, bi);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).lessThan((double)1, bd);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).lessThan(bi, (byte)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).lessThan(bi, (char)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).lessThan(bi, (short)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).lessThan(bi, (int)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).lessThan(bi, (long)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).lessThan(bi, (float)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).lessThan(bi, (double)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).lessThan(bi, bi);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).lessThan(bi, bd);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).lessThan(bd, (byte)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).lessThan(bd, (char)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).lessThan(bd, (short)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).lessThan(bd, (int)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).lessThan(bd, (long)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).lessThan(bd, (float)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).lessThan(bd, (double)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).lessThan(bd, bi);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).lessThan(bd, bd);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
  }
  
  public void testSupportedMetaClassMethodsLessThan() {    
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(o).lessThan(o, o), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(o).lessThan(o, (byte)1), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(o).lessThan(o, (char)1), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(o).lessThan(o, (short)1), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(o).lessThan(o, (int)1), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(o).lessThan(o, (long)1), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(o).lessThan(o, (float)1), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(o).lessThan(o, (double)1), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(o).lessThan(o, bi), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(o).lessThan(o, bd), null);
    
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(o).reverseLessThan((byte)1, o), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(o).reverseLessThan((char)1, o), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(o).reverseLessThan((short)1, o), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(o).reverseLessThan((int)1, o), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(o).reverseLessThan((long)1, o), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(o).reverseLessThan((float)1, o), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(o).reverseLessThan((double)1, o), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(o).reverseLessThan(bi, o), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(o).reverseLessThan(bd, o), null);
  }
  
  public void testUnsupportedMetaClassMethodsGreaterThan() {    
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).greaterThan((byte)1, (byte)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).greaterThan((byte)1, (char)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).greaterThan((byte)1, (short)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).greaterThan((byte)1, (int)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).greaterThan((byte)1, (long)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).greaterThan((byte)1, (float)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).greaterThan((byte)1, (double)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).greaterThan((byte)1, bi);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).greaterThan((byte)1, bd);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).greaterThan((char)1, (byte)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).greaterThan((char)1, (char)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).greaterThan((char)1, (short)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).greaterThan((char)1, (int)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).greaterThan((char)1, (long)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).greaterThan((char)1, (float)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).greaterThan((char)1, (double)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).greaterThan((char)1, bi);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).greaterThan((char)1, bd);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).greaterThan((short)1, (byte)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).greaterThan((short)1, (char)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).greaterThan((short)1, (short)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).greaterThan((short)1, (int)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).greaterThan((short)1, (long)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).greaterThan((short)1, (float)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).greaterThan((short)1, (double)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).greaterThan((short)1, bi);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).greaterThan((short)1, bd);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).greaterThan((int)1, (byte)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).greaterThan((int)1, (char)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).greaterThan((int)1, (short)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).greaterThan((int)1, (int)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).greaterThan((int)1, (long)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).greaterThan((int)1, (float)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).greaterThan((int)1, (double)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).greaterThan((int)1, bi);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).greaterThan((int)1, bd);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).greaterThan((long)1, (byte)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).greaterThan((long)1, (char)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).greaterThan((long)1, (short)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).greaterThan((long)1, (int)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).greaterThan((long)1, (long)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).greaterThan((long)1, (float)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).greaterThan((long)1, (double)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).greaterThan((long)1, bi);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).greaterThan((long)1, bd);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).greaterThan((float)1, (byte)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).greaterThan((float)1, (char)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).greaterThan((float)1, (short)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).greaterThan((float)1, (int)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).greaterThan((float)1, (long)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).greaterThan((float)1, (float)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).greaterThan((float)1, (double)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).greaterThan((float)1, bi);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).greaterThan((float)1, bd);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).greaterThan((double)1, (byte)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).greaterThan((double)1, (char)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).greaterThan((double)1, (short)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).greaterThan((double)1, (int)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).greaterThan((double)1, (long)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).greaterThan((double)1, (float)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).greaterThan((double)1, (double)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).greaterThan((double)1, bi);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).greaterThan((double)1, bd);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).greaterThan(bi, (byte)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).greaterThan(bi, (char)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).greaterThan(bi, (short)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).greaterThan(bi, (int)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).greaterThan(bi, (long)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).greaterThan(bi, (float)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).greaterThan(bi, (double)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).greaterThan(bi, bi);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).greaterThan(bi, bd);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).greaterThan(bd, (byte)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).greaterThan(bd, (char)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).greaterThan(bd, (short)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).greaterThan(bd, (int)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).greaterThan(bd, (long)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).greaterThan(bd, (float)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).greaterThan(bd, (double)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).greaterThan(bd, bi);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).greaterThan(bd, bd);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
  }
  
  public void testSupportedMetaClassMethodsGreaterThan() {    
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(o).greaterThan(o, o), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(o).greaterThan(o, (byte)1), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(o).greaterThan(o, (char)1), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(o).greaterThan(o, (short)1), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(o).greaterThan(o, (int)1), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(o).greaterThan(o, (long)1), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(o).greaterThan(o, (float)1), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(o).greaterThan(o, (double)1), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(o).greaterThan(o, bi), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(o).greaterThan(o, bd), null);
    
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(o).reverseGreaterThan((byte)1, o), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(o).reverseGreaterThan((char)1, o), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(o).reverseGreaterThan((short)1, o), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(o).reverseGreaterThan((int)1, o), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(o).reverseGreaterThan((long)1, o), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(o).reverseGreaterThan((float)1, o), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(o).reverseGreaterThan((double)1, o), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(o).reverseGreaterThan(bi, o), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(o).reverseGreaterThan(bd, o), null);
  }
  
  public void testUnsupportedMetaClassMethodsLessThanOrEquals() {    
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).lessThanOrEquals((byte)1, (byte)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).lessThanOrEquals((byte)1, (char)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).lessThanOrEquals((byte)1, (short)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).lessThanOrEquals((byte)1, (int)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).lessThanOrEquals((byte)1, (long)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).lessThanOrEquals((byte)1, (float)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).lessThanOrEquals((byte)1, (double)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).lessThanOrEquals((byte)1, bi);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).lessThanOrEquals((byte)1, bd);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).lessThanOrEquals((char)1, (byte)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).lessThanOrEquals((char)1, (char)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).lessThanOrEquals((char)1, (short)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).lessThanOrEquals((char)1, (int)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).lessThanOrEquals((char)1, (long)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).lessThanOrEquals((char)1, (float)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).lessThanOrEquals((char)1, (double)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).lessThanOrEquals((char)1, bi);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).lessThanOrEquals((char)1, bd);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).lessThanOrEquals((short)1, (byte)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).lessThanOrEquals((short)1, (char)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).lessThanOrEquals((short)1, (short)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).lessThanOrEquals((short)1, (int)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).lessThanOrEquals((short)1, (long)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).lessThanOrEquals((short)1, (float)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).lessThanOrEquals((short)1, (double)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).lessThanOrEquals((short)1, bi);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).lessThanOrEquals((short)1, bd);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).lessThanOrEquals((int)1, (byte)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).lessThanOrEquals((int)1, (char)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).lessThanOrEquals((int)1, (short)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).lessThanOrEquals((int)1, (int)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).lessThanOrEquals((int)1, (long)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).lessThanOrEquals((int)1, (float)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).lessThanOrEquals((int)1, (double)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).lessThanOrEquals((int)1, bi);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).lessThanOrEquals((int)1, bd);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).lessThanOrEquals((long)1, (byte)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).lessThanOrEquals((long)1, (char)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).lessThanOrEquals((long)1, (short)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).lessThanOrEquals((long)1, (int)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).lessThanOrEquals((long)1, (long)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).lessThanOrEquals((long)1, (float)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).lessThanOrEquals((long)1, (double)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).lessThanOrEquals((long)1, bi);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).lessThanOrEquals((long)1, bd);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).lessThanOrEquals((float)1, (byte)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).lessThanOrEquals((float)1, (char)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).lessThanOrEquals((float)1, (short)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).lessThanOrEquals((float)1, (int)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).lessThanOrEquals((float)1, (long)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).lessThanOrEquals((float)1, (float)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).lessThanOrEquals((float)1, (double)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).lessThanOrEquals((float)1, bi);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).lessThanOrEquals((float)1, bd);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).lessThanOrEquals((double)1, (byte)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).lessThanOrEquals((double)1, (char)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).lessThanOrEquals((double)1, (short)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).lessThanOrEquals((double)1, (int)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).lessThanOrEquals((double)1, (long)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).lessThanOrEquals((double)1, (float)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).lessThanOrEquals((double)1, (double)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).lessThanOrEquals((double)1, bi);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).lessThanOrEquals((double)1, bd);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).lessThanOrEquals(bi, (byte)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).lessThanOrEquals(bi, (char)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).lessThanOrEquals(bi, (short)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).lessThanOrEquals(bi, (int)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).lessThanOrEquals(bi, (long)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).lessThanOrEquals(bi, (float)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).lessThanOrEquals(bi, (double)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).lessThanOrEquals(bi, bi);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).lessThanOrEquals(bi, bd);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).lessThanOrEquals(bd, (byte)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).lessThanOrEquals(bd, (char)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).lessThanOrEquals(bd, (short)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).lessThanOrEquals(bd, (int)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).lessThanOrEquals(bd, (long)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).lessThanOrEquals(bd, (float)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).lessThanOrEquals(bd, (double)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).lessThanOrEquals(bd, bi);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).lessThanOrEquals(bd, bd);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
  }
  
  public void testSupportedMetaClassMethodsLessThanOrEquals() {    
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(o).lessThanOrEquals(o, o), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(o).lessThanOrEquals(o, (byte)1), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(o).lessThanOrEquals(o, (char)1), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(o).lessThanOrEquals(o, (short)1), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(o).lessThanOrEquals(o, (int)1), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(o).lessThanOrEquals(o, (long)1), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(o).lessThanOrEquals(o, (float)1), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(o).lessThanOrEquals(o, (double)1), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(o).lessThanOrEquals(o, bi), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(o).lessThanOrEquals(o, bd), null);
    
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(o).reverseLessThanOrEquals((byte)1, o), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(o).reverseLessThanOrEquals((char)1, o), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(o).reverseLessThanOrEquals((short)1, o), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(o).reverseLessThanOrEquals((int)1, o), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(o).reverseLessThanOrEquals((long)1, o), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(o).reverseLessThanOrEquals((float)1, o), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(o).reverseLessThanOrEquals((double)1, o), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(o).reverseLessThanOrEquals(bi, o), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(o).reverseLessThanOrEquals(bd, o), null);
  }

  public void testUnsupportedMetaClassMethodsGreaterThanOrEquals() {    
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).greaterThanOrEquals((byte)1, (byte)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).greaterThanOrEquals((byte)1, (char)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).greaterThanOrEquals((byte)1, (short)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).greaterThanOrEquals((byte)1, (int)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).greaterThanOrEquals((byte)1, (long)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).greaterThanOrEquals((byte)1, (float)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).greaterThanOrEquals((byte)1, (double)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).greaterThanOrEquals((byte)1, bi);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).greaterThanOrEquals((byte)1, bd);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).greaterThanOrEquals((char)1, (byte)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).greaterThanOrEquals((char)1, (char)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).greaterThanOrEquals((char)1, (short)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).greaterThanOrEquals((char)1, (int)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).greaterThanOrEquals((char)1, (long)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).greaterThanOrEquals((char)1, (float)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).greaterThanOrEquals((char)1, (double)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).greaterThanOrEquals((char)1, bi);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).greaterThanOrEquals((char)1, bd);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).greaterThanOrEquals((short)1, (byte)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).greaterThanOrEquals((short)1, (char)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).greaterThanOrEquals((short)1, (short)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).greaterThanOrEquals((short)1, (int)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).greaterThanOrEquals((short)1, (long)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).greaterThanOrEquals((short)1, (float)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).greaterThanOrEquals((short)1, (double)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).greaterThanOrEquals((short)1, bi);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).greaterThanOrEquals((short)1, bd);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).greaterThanOrEquals((int)1, (byte)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).greaterThanOrEquals((int)1, (char)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).greaterThanOrEquals((int)1, (short)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).greaterThanOrEquals((int)1, (int)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).greaterThanOrEquals((int)1, (long)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).greaterThanOrEquals((int)1, (float)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).greaterThanOrEquals((int)1, (double)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).greaterThanOrEquals((int)1, bi);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).greaterThanOrEquals((int)1, bd);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).greaterThanOrEquals((long)1, (byte)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).greaterThanOrEquals((long)1, (char)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).greaterThanOrEquals((long)1, (short)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).greaterThanOrEquals((long)1, (int)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).greaterThanOrEquals((long)1, (long)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).greaterThanOrEquals((long)1, (float)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).greaterThanOrEquals((long)1, (double)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).greaterThanOrEquals((long)1, bi);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).greaterThanOrEquals((long)1, bd);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).greaterThanOrEquals((float)1, (byte)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).greaterThanOrEquals((float)1, (char)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).greaterThanOrEquals((float)1, (short)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).greaterThanOrEquals((float)1, (int)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).greaterThanOrEquals((float)1, (long)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).greaterThanOrEquals((float)1, (float)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).greaterThanOrEquals((float)1, (double)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).greaterThanOrEquals((float)1, bi);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).greaterThanOrEquals((float)1, bd);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).greaterThanOrEquals((double)1, (byte)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).greaterThanOrEquals((double)1, (char)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).greaterThanOrEquals((double)1, (short)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).greaterThanOrEquals((double)1, (int)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).greaterThanOrEquals((double)1, (long)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).greaterThanOrEquals((double)1, (float)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).greaterThanOrEquals((double)1, (double)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).greaterThanOrEquals((double)1, bi);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).greaterThanOrEquals((double)1, bd);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).greaterThanOrEquals(bi, (byte)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).greaterThanOrEquals(bi, (char)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).greaterThanOrEquals(bi, (short)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).greaterThanOrEquals(bi, (int)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).greaterThanOrEquals(bi, (long)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).greaterThanOrEquals(bi, (float)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).greaterThanOrEquals(bi, (double)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).greaterThanOrEquals(bi, bi);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).greaterThanOrEquals(bi, bd);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).greaterThanOrEquals(bd, (byte)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).greaterThanOrEquals(bd, (char)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).greaterThanOrEquals(bd, (short)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).greaterThanOrEquals(bd, (int)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).greaterThanOrEquals(bd, (long)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).greaterThanOrEquals(bd, (float)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).greaterThanOrEquals(bd, (double)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).greaterThanOrEquals(bd, bi);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).greaterThanOrEquals(bd, bd);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
  }
  
  public void testSupportedMetaClassMethodsGreaterThanOrEquals() {    
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(o).greaterThanOrEquals(o, o), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(o).greaterThanOrEquals(o, (byte)1), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(o).greaterThanOrEquals(o, (char)1), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(o).greaterThanOrEquals(o, (short)1), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(o).greaterThanOrEquals(o, (int)1), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(o).greaterThanOrEquals(o, (long)1), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(o).greaterThanOrEquals(o, (float)1), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(o).greaterThanOrEquals(o, (double)1), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(o).greaterThanOrEquals(o, bi), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(o).greaterThanOrEquals(o, bd), null);
    
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(o).reverseGreaterThanOrEquals((byte)1, o), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(o).reverseGreaterThanOrEquals((char)1, o), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(o).reverseGreaterThanOrEquals((short)1, o), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(o).reverseGreaterThanOrEquals((int)1, o), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(o).reverseGreaterThanOrEquals((long)1, o), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(o).reverseGreaterThanOrEquals((float)1, o), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(o).reverseGreaterThanOrEquals((double)1, o), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(o).reverseGreaterThanOrEquals(bi, o), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(o).reverseGreaterThanOrEquals(bd, o), null);
  }
  
  public void testUnsupportedMetaClassMethodsLeftShift() {    
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).leftShift((byte)1, (byte)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).leftShift((byte)1, (char)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).leftShift((byte)1, (short)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).leftShift((byte)1, (int)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).leftShift((byte)1, (long)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).leftShift((byte)1, bi);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).leftShift((char)1, (byte)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).leftShift((char)1, (char)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).leftShift((char)1, (short)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).leftShift((char)1, (int)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).leftShift((char)1, (long)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
   try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).leftShift((char)1, bi);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).leftShift((short)1, (byte)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).leftShift((short)1, (char)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).leftShift((short)1, (short)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).leftShift((short)1, (int)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).leftShift((short)1, (long)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).leftShift((short)1, bi);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).leftShift((int)1, (byte)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).leftShift((int)1, (char)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).leftShift((int)1, (short)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).leftShift((int)1, (int)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).leftShift((int)1, (long)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).leftShift((int)1, bi);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).leftShift((long)1, (byte)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).leftShift((long)1, (char)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).leftShift((long)1, (short)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).leftShift((long)1, (int)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).leftShift((long)1, (long)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).leftShift((long)1, bi);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).leftShift(bi, (byte)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).leftShift(bi, (char)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).leftShift(bi, (short)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).leftShift(bi, (int)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).leftShift(bi, (long)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).leftShift(bi, bi);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
  }
  
  public void testSupportedMetaClassMethodsLeftShift() {    
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(o).leftShift(o, o), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(o).leftShift(o, (byte)1), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(o).leftShift(o, (char)1), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(o).leftShift(o, (short)1), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(o).leftShift(o, (int)1), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(o).leftShift(o, (long)1), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(o).leftShift(o, bi), null);
    
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(o).reverseLeftShift((byte)1, o), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(o).reverseLeftShift((char)1, o), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(o).reverseLeftShift((short)1, o), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(o).reverseLeftShift((int)1, o), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(o).reverseLeftShift((long)1, o), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(o).reverseLeftShift(bi, o), null);
  }
  
  public void testUnsupportedMetaClassMethodsLeftShiftEquals() {    
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).leftShiftEquals((byte)1, (byte)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).leftShiftEquals((byte)1, (char)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).leftShiftEquals((byte)1, (short)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).leftShiftEquals((byte)1, (int)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).leftShiftEquals((byte)1, (long)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).leftShiftEquals((byte)1, bi);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).leftShiftEquals((char)1, (byte)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).leftShiftEquals((char)1, (char)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).leftShiftEquals((char)1, (short)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).leftShiftEquals((char)1, (int)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).leftShiftEquals((char)1, (long)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
   try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).leftShiftEquals((char)1, bi);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).leftShiftEquals((short)1, (byte)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).leftShiftEquals((short)1, (char)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).leftShiftEquals((short)1, (short)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).leftShiftEquals((short)1, (int)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).leftShiftEquals((short)1, (long)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).leftShiftEquals((short)1, bi);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).leftShiftEquals((int)1, (byte)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).leftShiftEquals((int)1, (char)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).leftShiftEquals((int)1, (short)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).leftShiftEquals((int)1, (int)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).leftShiftEquals((int)1, (long)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).leftShiftEquals((int)1, bi);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).leftShiftEquals((long)1, (byte)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).leftShiftEquals((long)1, (char)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).leftShiftEquals((long)1, (short)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).leftShiftEquals((long)1, (int)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).leftShiftEquals((long)1, (long)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).leftShiftEquals((long)1, bi);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).leftShiftEquals(bi, (byte)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).leftShiftEquals(bi, (char)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).leftShiftEquals(bi, (short)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).leftShiftEquals(bi, (int)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).leftShiftEquals(bi, (long)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).leftShiftEquals(bi, bi);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
  }
  
  public void testSupportedMetaClassMethodsLeftShiftEquals() {    
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(o).leftShiftEquals(o, o), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(o).leftShiftEquals(o, (byte)1), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(o).leftShiftEquals(o, (char)1), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(o).leftShiftEquals(o, (short)1), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(o).leftShiftEquals(o, (int)1), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(o).leftShiftEquals(o, (long)1), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(o).leftShiftEquals(o, bi), null);
    
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(o).reverseLeftShiftEquals((byte)1, o), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(o).reverseLeftShiftEquals((char)1, o), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(o).reverseLeftShiftEquals((short)1, o), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(o).reverseLeftShiftEquals((int)1, o), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(o).reverseLeftShiftEquals((long)1, o), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(o).reverseLeftShiftEquals(bi, o), null);
  }
  
  public void testUnsupportedMetaClassMethodsLogicalRightShift() {    
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).logicalRightShift((byte)1, (byte)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).logicalRightShift((byte)1, (char)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).logicalRightShift((byte)1, (short)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).logicalRightShift((byte)1, (int)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).logicalRightShift((byte)1, (long)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).logicalRightShift((byte)1, bi);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).logicalRightShift((char)1, (byte)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).logicalRightShift((char)1, (char)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).logicalRightShift((char)1, (short)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).logicalRightShift((char)1, (int)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).logicalRightShift((char)1, (long)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
   try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).logicalRightShift((char)1, bi);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).logicalRightShift((short)1, (byte)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).logicalRightShift((short)1, (char)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).logicalRightShift((short)1, (short)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).logicalRightShift((short)1, (int)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).logicalRightShift((short)1, (long)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).logicalRightShift((short)1, bi);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).logicalRightShift((int)1, (byte)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).logicalRightShift((int)1, (char)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).logicalRightShift((int)1, (short)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).logicalRightShift((int)1, (int)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).logicalRightShift((int)1, (long)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).logicalRightShift((int)1, bi);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).logicalRightShift((long)1, (byte)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).logicalRightShift((long)1, (char)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).logicalRightShift((long)1, (short)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).logicalRightShift((long)1, (int)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).logicalRightShift((long)1, (long)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).logicalRightShift((long)1, bi);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
  }
  
  public void testSupportedMetaClassMethodsLogicalRightShift() {    
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(o).logicalRightShift(o, o), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(o).logicalRightShift(o, (byte)1), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(o).logicalRightShift(o, (char)1), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(o).logicalRightShift(o, (short)1), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(o).logicalRightShift(o, (int)1), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(o).logicalRightShift(o, (long)1), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(o).logicalRightShift(o, bi), null);
    
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(o).reverseLogicalRightShift((byte)1, o), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(o).reverseLogicalRightShift((char)1, o), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(o).reverseLogicalRightShift((short)1, o), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(o).reverseLogicalRightShift((int)1, o), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(o).reverseLogicalRightShift((long)1, o), null);
  }
  
  public void testUnsupportedMetaClassMethodsLogicalRightShiftEquals() {    
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).logicalRightShiftEquals((byte)1, (byte)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).logicalRightShiftEquals((byte)1, (char)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).logicalRightShiftEquals((byte)1, (short)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).logicalRightShiftEquals((byte)1, (int)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).logicalRightShiftEquals((byte)1, (long)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).logicalRightShiftEquals((byte)1, bi);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).logicalRightShiftEquals((char)1, (byte)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).logicalRightShiftEquals((char)1, (char)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).logicalRightShiftEquals((char)1, (short)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).logicalRightShiftEquals((char)1, (int)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).logicalRightShiftEquals((char)1, (long)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
   try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).logicalRightShiftEquals((char)1, bi);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).logicalRightShiftEquals((short)1, (byte)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).logicalRightShiftEquals((short)1, (char)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).logicalRightShiftEquals((short)1, (short)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).logicalRightShiftEquals((short)1, (int)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).logicalRightShiftEquals((short)1, (long)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).logicalRightShiftEquals((short)1, bi);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).logicalRightShiftEquals((int)1, (byte)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).logicalRightShiftEquals((int)1, (char)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).logicalRightShiftEquals((int)1, (short)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).logicalRightShiftEquals((int)1, (int)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).logicalRightShiftEquals((int)1, (long)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).logicalRightShiftEquals((int)1, bi);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).logicalRightShiftEquals((long)1, (byte)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).logicalRightShiftEquals((long)1, (char)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).logicalRightShiftEquals((long)1, (short)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).logicalRightShiftEquals((long)1, (int)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).logicalRightShiftEquals((long)1, (long)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).logicalRightShiftEquals((long)1, bi);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
  }
  
  public void testSupportedMetaClassMethodsLogicalRightShiftEquals() {    
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(o).logicalRightShiftEquals(o, o), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(o).logicalRightShiftEquals(o, (byte)1), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(o).logicalRightShiftEquals(o, (char)1), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(o).logicalRightShiftEquals(o, (short)1), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(o).logicalRightShiftEquals(o, (int)1), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(o).logicalRightShiftEquals(o, (long)1), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(o).logicalRightShiftEquals(o, bi), null);
    
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(o).reverseLogicalRightShiftEquals((byte)1, o), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(o).reverseLogicalRightShiftEquals((char)1, o), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(o).reverseLogicalRightShiftEquals((short)1, o), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(o).reverseLogicalRightShiftEquals((int)1, o), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(o).reverseLogicalRightShiftEquals((long)1, o), null);
  }
  
  public void testUnsupportedMetaClassMethodsArithmeticRightShift() {    
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).arithmeticRightShift((byte)1, (byte)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).arithmeticRightShift((byte)1, (char)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).arithmeticRightShift((byte)1, (short)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).arithmeticRightShift((byte)1, (int)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).arithmeticRightShift((byte)1, (long)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).arithmeticRightShift((byte)1, bi);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).arithmeticRightShift((char)1, (byte)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).arithmeticRightShift((char)1, (char)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).arithmeticRightShift((char)1, (short)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).arithmeticRightShift((char)1, (int)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).arithmeticRightShift((char)1, (long)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
   try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).arithmeticRightShift((char)1, bi);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).arithmeticRightShift((short)1, (byte)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).arithmeticRightShift((short)1, (char)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).arithmeticRightShift((short)1, (short)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).arithmeticRightShift((short)1, (int)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).arithmeticRightShift((short)1, (long)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).arithmeticRightShift((short)1, bi);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).arithmeticRightShift((int)1, (byte)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).arithmeticRightShift((int)1, (char)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).arithmeticRightShift((int)1, (short)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).arithmeticRightShift((int)1, (int)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).arithmeticRightShift((int)1, (long)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).arithmeticRightShift((int)1, bi);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).arithmeticRightShift((long)1, (byte)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).arithmeticRightShift((long)1, (char)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).arithmeticRightShift((long)1, (short)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).arithmeticRightShift((long)1, (int)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).arithmeticRightShift((long)1, (long)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).arithmeticRightShift((long)1, bi);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).arithmeticRightShift(bi, (byte)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).arithmeticRightShift(bi, (char)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).arithmeticRightShift(bi, (short)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).arithmeticRightShift(bi, (int)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).arithmeticRightShift(bi, (long)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).arithmeticRightShift(bi, bi);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
  }
  
  public void testSupportedMetaClassMethodsArithmeticRightShift() {    
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(o).arithmeticRightShift(o, o), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(o).arithmeticRightShift(o, (byte)1), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(o).arithmeticRightShift(o, (char)1), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(o).arithmeticRightShift(o, (short)1), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(o).arithmeticRightShift(o, (int)1), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(o).arithmeticRightShift(o, (long)1), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(o).arithmeticRightShift(o, bi), null);
    
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(o).reverseArithmeticRightShift((byte)1, o), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(o).reverseArithmeticRightShift((char)1, o), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(o).reverseArithmeticRightShift((short)1, o), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(o).reverseArithmeticRightShift((int)1, o), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(o).reverseArithmeticRightShift((long)1, o), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(o).reverseArithmeticRightShift(bi, o), null);
  }
  
  public void testUnsupportedMetaClassMethodsArithmeticRightShiftEquals() {    
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).arithmeticRightShiftEquals((byte)1, (byte)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).arithmeticRightShiftEquals((byte)1, (char)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).arithmeticRightShiftEquals((byte)1, (short)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).arithmeticRightShiftEquals((byte)1, (int)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).arithmeticRightShiftEquals((byte)1, (long)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).arithmeticRightShiftEquals((byte)1, bi);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).arithmeticRightShiftEquals((char)1, (byte)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).arithmeticRightShiftEquals((char)1, (char)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).arithmeticRightShiftEquals((char)1, (short)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).arithmeticRightShiftEquals((char)1, (int)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).arithmeticRightShiftEquals((char)1, (long)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
   try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).arithmeticRightShiftEquals((char)1, bi);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).arithmeticRightShiftEquals((short)1, (byte)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).arithmeticRightShiftEquals((short)1, (char)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).arithmeticRightShiftEquals((short)1, (short)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).arithmeticRightShiftEquals((short)1, (int)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).arithmeticRightShiftEquals((short)1, (long)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).arithmeticRightShiftEquals((short)1, bi);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).arithmeticRightShiftEquals((int)1, (byte)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).arithmeticRightShiftEquals((int)1, (char)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).arithmeticRightShiftEquals((int)1, (short)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).arithmeticRightShiftEquals((int)1, (int)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).arithmeticRightShiftEquals((int)1, (long)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).arithmeticRightShiftEquals((int)1, bi);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).arithmeticRightShiftEquals((long)1, (byte)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).arithmeticRightShiftEquals((long)1, (char)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).arithmeticRightShiftEquals((long)1, (short)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).arithmeticRightShiftEquals((long)1, (int)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).arithmeticRightShiftEquals((long)1, (long)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).arithmeticRightShiftEquals((long)1, bi);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).arithmeticRightShiftEquals(bi, (byte)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).arithmeticRightShiftEquals(bi, (char)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).arithmeticRightShiftEquals(bi, (short)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).arithmeticRightShiftEquals(bi, (int)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).arithmeticRightShiftEquals(bi, (long)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).arithmeticRightShiftEquals(bi, bi);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
  }
  
  public void testSupportedMetaClassMethodsArithmeticRightShiftEquals() {    
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(o).arithmeticRightShiftEquals(o, o), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(o).arithmeticRightShiftEquals(o, (byte)1), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(o).arithmeticRightShiftEquals(o, (char)1), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(o).arithmeticRightShiftEquals(o, (short)1), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(o).arithmeticRightShiftEquals(o, (int)1), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(o).arithmeticRightShiftEquals(o, (long)1), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(o).arithmeticRightShiftEquals(o, bi), null);
    
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(o).reverseArithmeticRightShiftEquals((byte)1, o), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(o).reverseArithmeticRightShiftEquals((char)1, o), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(o).reverseArithmeticRightShiftEquals((short)1, o), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(o).reverseArithmeticRightShiftEquals((int)1, o), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(o).reverseArithmeticRightShiftEquals((long)1, o), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(o).reverseArithmeticRightShiftEquals(bi, o), null);
  }

  public void testUnsupportedMetaClassUnaryOperators() {
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).not(true);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).complement((int)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).complement((long)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).complement(bi);
      assertTrue(false);
    } catch(NgRuntimeException e) {}   
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).unaryPlus((int)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}   
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).unaryPlus((long)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}   
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).unaryPlus((float)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}   
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).unaryPlus((double)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}   
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).unaryPlus(bi);
      assertTrue(false);
    } catch(NgRuntimeException e) {}   
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).unaryPlus(bd);
      assertTrue(false);
    } catch(NgRuntimeException e) {}   
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).unaryMinus((int)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}   
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).unaryMinus((long)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}   
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).unaryMinus((float)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}   
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).unaryMinus((double)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}   
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).unaryMinus(bi);
      assertTrue(false);
    } catch(NgRuntimeException e) {}   
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).unaryMinus(bd);
      assertTrue(false);
    } catch(NgRuntimeException e) {}   
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).prefixIncrement((int)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}   
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).prefixIncrement((long)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}   
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).prefixIncrement((float)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}   
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).prefixIncrement((double)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}   
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).prefixIncrement(bi);
      assertTrue(false);
    } catch(NgRuntimeException e) {}   
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).prefixIncrement(bd);
      assertTrue(false);
    } catch(NgRuntimeException e) {}   
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).prefixDecrement((int)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}   
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).prefixDecrement((long)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}   
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).prefixDecrement((float)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}   
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).prefixDecrement((double)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}   
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).prefixDecrement(bi);
      assertTrue(false);
    } catch(NgRuntimeException e) {}   
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).prefixDecrement(bd);
      assertTrue(false);
    } catch(NgRuntimeException e) {}   
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).postfixIncrement((int)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}   
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).postfixIncrement((long)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}   
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).postfixIncrement((float)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}   
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).postfixIncrement((double)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}   
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).postfixIncrement(bi);
      assertTrue(false);
    } catch(NgRuntimeException e) {}   
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).postfixIncrement(bd);
      assertTrue(false);
    } catch(NgRuntimeException e) {}   
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).postfixDecrement((int)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}   
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).postfixDecrement((long)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}   
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).postfixDecrement((float)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}   
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).postfixDecrement((double)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}   
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).postfixDecrement(bi);
      assertTrue(false);
    } catch(NgRuntimeException e) {}   
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).postfixDecrement(bd);
      assertTrue(false);
    } catch(NgRuntimeException e) {}   
  }

  public void testSupportedMetaClassUnaryOperators() {
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(o).not(o), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(o).unaryMinus(o), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(o).unaryPlus(o), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(o).complement(o), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(o).postfixIncrement(o), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(o).postfixDecrement(o), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(o).prefixIncrement(o), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(o).prefixDecrement(o), null);    
  }

  public void testunSupportedMetaClassMiscMethods() {
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).getMetaClassFor(o.getClass());
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).getRuntimeMetaClass();
      assertTrue(false);
    } catch(NgRuntimeException e) {}
  }
  
  public void testSupportedMetaClassMiscMethods() {
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(o).call(o, new Object[]{}), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(o).call(o), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(o).call(o, o), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(o).call(o, null, null), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(o).call(o, null, null, null), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(o).call(o, null, null, null, null), null);
 
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(o).invokeMethod(o, "test", new Object[]{}), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(o).invokeMethod(o, "test"), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(o).invokeMethod(o, "test", o), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(o).invokeMethod(o, "test", null, null), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(o).invokeMethod(o, "test", null, null, null), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(o).invokeMethod(o, "test", null, null, null, null), null);
 
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(o).invokeConstructor(o.getClass(), new Object[]{}), null);

    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(o).getProperty(o, "test"), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(o).setProperty(o, "test", null), null);

    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(o).getField(o, "test"), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(o).setField(o, "test", null), null);
  
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(o).getAt(o, o), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(o).getAt(o, 1), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(o).getAt(o, bi), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(o).putAt(o, o), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(o).putAt(o, 1), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(o).putAt(o, bi), null);
    
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(o).createMetaClassFor(o.getClass()), null);
    
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(o).getInternalMetaClass(), null);
    
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(o).getTheClass(o), Object.class);
    
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(o).isCase(o, null), null);
    
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(o).isInstanceof(o, o.getClass()), null);
    
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(o).asType(o, o.getClass()), null);
    
    NgSystem.metaClassRegistry.getRuntimeMetaClass(o).setInternalMetaClass(null);
  }
}
