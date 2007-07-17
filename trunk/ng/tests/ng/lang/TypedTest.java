package ng.lang;

import java.math.BigDecimal;
import java.math.BigInteger;

import junit.framework.TestCase;
import ng.runtime.NgBaseObject;
import ng.runtime.NgTyped;
import ng.runtime.ThreadContext;
import util.CustomInternalMetaClass;
import util.CustomMetaClass;



/**
 * @author tug
 *
 */
public class TypedTest extends TestCase {
  final BigInteger bi = BigInteger.valueOf(1);
  final BigDecimal bd = new BigDecimal(1);
  final Object o = new NgTyped(new NgBaseObject(new CustomMetaClass()), NgBaseObject.class);
  
  public void testUnsupportedMetaClassMethodsAdd() throws Throwable {    
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).add((byte)1, (byte)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).add((byte)1, (char)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).add((byte)1, (short)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).add((byte)1, 1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).add((byte)1, (long)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).add((byte)1, (float)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).add((byte)1, (double)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).add((byte)1, this.bi);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).add((byte)1, this.bd);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).add((char)1, (byte)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).add((char)1, (char)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).add((char)1, (short)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).add((char)1, 1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).add((char)1, (long)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).add((char)1, (float)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).add((char)1, (double)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).add((char)1, this.bi);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).add((char)1, this.bd);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).add((short)1, (byte)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).add((short)1, (char)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).add((short)1, (short)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).add((short)1, 1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).add((short)1, (long)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).add((short)1, (float)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).add((short)1, (double)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).add((short)1, this.bi);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).add((short)1, this.bd);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).add(1, (byte)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).add(1, (char)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).add(1, (short)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).add(1, 1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).add(1, (long)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).add(1, (float)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).add(1, (double)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).add(1, this.bi);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).add(1, this.bd);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).add((long)1, (byte)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).add((long)1, (char)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).add((long)1, (short)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).add((long)1, 1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).add((long)1, (long)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).add((long)1, (float)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).add((long)1, (double)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).add((long)1, this.bi);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).add((long)1, this.bd);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).add((float)1, (byte)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).add((float)1, (char)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).add((float)1, (short)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).add((float)1, 1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).add((float)1, (long)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).add((float)1, (float)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).add((float)1, (double)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).add((float)1, this.bi);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).add((float)1, this.bd);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).add((double)1, (byte)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).add((double)1, (char)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).add((double)1, (short)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).add((double)1, 1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).add((double)1, (long)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).add((double)1, (float)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).add((double)1, (double)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).add((double)1, this.bi);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).add((double)1, this.bd);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).add(this.bi, (byte)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).add(this.bi, (char)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).add(this.bi, (short)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).add(this.bi, 1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).add(this.bi, (long)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).add(this.bi, (float)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).add(this.bi, (double)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).add(this.bi, this.bi);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).add(this.bi, this.bd);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).add(this.bd, (byte)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).add(this.bd, (char)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).add(this.bd, (short)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).add(this.bd, 1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).add(this.bd, (long)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).add(this.bd, (float)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).add(this.bd, (double)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).add(this.bd, this.bi);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).add(this.bd, this.bd);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
  }
  
  public void testSupportedMetaClassMethodsAdd() throws Throwable {    
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).add(this.o, this.o), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).add(this.o, (byte)1), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).add(this.o, (char)1), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).add(this.o, (short)1), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).add(this.o, 1), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).add(this.o, (long)1), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).add(this.o, (float)1), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).add(this.o, (double)1), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).add(this.o, this.bi), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).add(this.o, this.bd), null);
    
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).reverseAdd((byte)1, this.o), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).reverseAdd((char)1, this.o), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).reverseAdd((short)1, this.o), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).reverseAdd(1, this.o), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).reverseAdd((long)1, this.o), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).reverseAdd((float)1, this.o), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).reverseAdd((double)1, this.o), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).reverseAdd(this.bi, this.o), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).reverseAdd(this.bd, this.o), null);
  }
  
  public void testUnsupportedMetaClassMethodsAddEquals() throws Throwable {    
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).addEquals((byte)1, (byte)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).addEquals((byte)1, (char)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).addEquals((byte)1, (short)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).addEquals((byte)1, 1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).addEquals((byte)1, (long)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).addEquals((byte)1, (float)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).addEquals((byte)1, (double)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).addEquals((byte)1, this.bi);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).addEquals((byte)1, this.bd);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).addEquals((char)1, (byte)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).addEquals((char)1, (char)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).addEquals((char)1, (short)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).addEquals((char)1, 1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).addEquals((char)1, (long)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).addEquals((char)1, (float)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).addEquals((char)1, (double)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).addEquals((char)1, this.bi);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).addEquals((char)1, this.bd);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).addEquals((short)1, (byte)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).addEquals((short)1, (char)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).addEquals((short)1, (short)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).addEquals((short)1, 1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).addEquals((short)1, (long)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).addEquals((short)1, (float)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).addEquals((short)1, (double)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).addEquals((short)1, this.bi);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).addEquals((short)1, this.bd);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).addEquals(1, (byte)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).addEquals(1, (char)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).addEquals(1, (short)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).addEquals(1, 1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).addEquals(1, (long)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).addEquals(1, (float)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).addEquals(1, (double)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).addEquals(1, this.bi);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).addEquals(1, this.bd);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).addEquals((long)1, (byte)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).addEquals((long)1, (char)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).addEquals((long)1, (short)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).addEquals((long)1, 1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).addEquals((long)1, (long)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).addEquals((long)1, (float)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).addEquals((long)1, (double)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).addEquals((long)1, this.bi);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).addEquals((long)1, this.bd);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).addEquals((float)1, (byte)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).addEquals((float)1, (char)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).addEquals((float)1, (short)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).addEquals((float)1, 1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).addEquals((float)1, (long)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).addEquals((float)1, (float)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).addEquals((float)1, (double)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).addEquals((float)1, this.bi);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).addEquals((float)1, this.bd);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).addEquals((double)1, (byte)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).addEquals((double)1, (char)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).addEquals((double)1, (short)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).addEquals((double)1, 1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).addEquals((double)1, (long)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).addEquals((double)1, (float)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).addEquals((double)1, (double)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).addEquals((double)1, this.bi);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).addEquals((double)1, this.bd);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).addEquals(this.bi, (byte)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).addEquals(this.bi, (char)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).addEquals(this.bi, (short)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).addEquals(this.bi, 1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).addEquals(this.bi, (long)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).addEquals(this.bi, (float)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).addEquals(this.bi, (double)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).addEquals(this.bi, this.bi);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).addEquals(this.bi, this.bd);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).addEquals(this.bd, (byte)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).addEquals(this.bd, (char)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).addEquals(this.bd, (short)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).addEquals(this.bd, 1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).addEquals(this.bd, (long)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).addEquals(this.bd, (float)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).addEquals(this.bd, (double)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).addEquals(this.bd, this.bi);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).addEquals(this.bd, this.bd);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
  }
  
  public void testSupportedMetaClassMethodsAddEquals() throws Throwable {    
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).addEquals(this.o, this.o), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).addEquals(this.o, (byte)1), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).addEquals(this.o, (char)1), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).addEquals(this.o, (short)1), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).addEquals(this.o, 1), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).addEquals(this.o, (long)1), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).addEquals(this.o, (float)1), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).addEquals(this.o, (double)1), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).addEquals(this.o, this.bi), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).addEquals(this.o, this.bd), null);
    
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).reverseAddEquals((byte)1, this.o), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).reverseAddEquals((char)1, this.o), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).reverseAddEquals((short)1, this.o), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).reverseAddEquals(1, this.o), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).reverseAddEquals((long)1, this.o), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).reverseAddEquals((float)1, this.o), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).reverseAddEquals((double)1, this.o), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).reverseAddEquals(this.bi, this.o), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).reverseAddEquals(this.bd, this.o), null);
  }
  
  public void testUnsupportedMetaClassMethodsSubtract() throws Throwable {    
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).subtract((byte)1, (byte)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).subtract((byte)1, (char)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).subtract((byte)1, (short)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).subtract((byte)1, 1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).subtract((byte)1, (long)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).subtract((byte)1, (float)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).subtract((byte)1, (double)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).subtract((byte)1, this.bi);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).subtract((byte)1, this.bd);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).subtract((char)1, (byte)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).subtract((char)1, (char)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).subtract((char)1, (short)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).subtract((char)1, 1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).subtract((char)1, (long)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).subtract((char)1, (float)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).subtract((char)1, (double)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).subtract((char)1, this.bi);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).subtract((char)1, this.bd);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).subtract((short)1, (byte)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).subtract((short)1, (char)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).subtract((short)1, (short)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).subtract((short)1, 1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).subtract((short)1, (long)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).subtract((short)1, (float)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).subtract((short)1, (double)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).subtract((short)1, this.bi);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).subtract((short)1, this.bd);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).subtract(1, (byte)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).subtract(1, (char)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).subtract(1, (short)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).subtract(1, 1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).subtract(1, (long)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).subtract(1, (float)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).subtract(1, (double)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).subtract(1, this.bi);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).subtract(1, this.bd);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).subtract((long)1, (byte)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).subtract((long)1, (char)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).subtract((long)1, (short)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).subtract((long)1, 1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).subtract((long)1, (long)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).subtract((long)1, (float)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).subtract((long)1, (double)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).subtract((long)1, this.bi);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).subtract((long)1, this.bd);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).subtract((float)1, (byte)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).subtract((float)1, (char)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).subtract((float)1, (short)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).subtract((float)1, 1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).subtract((float)1, (long)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).subtract((float)1, (float)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).subtract((float)1, (double)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).subtract((float)1, this.bi);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).subtract((float)1, this.bd);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).subtract((double)1, (byte)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).subtract((double)1, (char)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).subtract((double)1, (short)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).subtract((double)1, 1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).subtract((double)1, (long)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).subtract((double)1, (float)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).subtract((double)1, (double)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).subtract((double)1, this.bi);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).subtract((double)1, this.bd);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).subtract(this.bi, (byte)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).subtract(this.bi, (char)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).subtract(this.bi, (short)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).subtract(this.bi, 1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).subtract(this.bi, (long)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).subtract(this.bi, (float)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).subtract(this.bi, (double)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).subtract(this.bi, this.bi);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).subtract(this.bi, this.bd);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).subtract(this.bd, (byte)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).subtract(this.bd, (char)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).subtract(this.bd, (short)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).subtract(this.bd, 1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).subtract(this.bd, (long)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).subtract(this.bd, (float)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).subtract(this.bd, (double)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).subtract(this.bd, this.bi);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).subtract(this.bd, this.bd);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
  }
  
  public void testSupportedMetaClassMethodsSubtract() throws Throwable {    
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).subtract(this.o, this.o), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).subtract(this.o, (byte)1), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).subtract(this.o, (char)1), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).subtract(this.o, (short)1), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).subtract(this.o, 1), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).subtract(this.o, (long)1), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).subtract(this.o, (float)1), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).subtract(this.o, (double)1), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).subtract(this.o, this.bi), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).subtract(this.o, this.bd), null);
    
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).reverseSubtract((byte)1, this.o), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).reverseSubtract((char)1, this.o), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).reverseSubtract((short)1, this.o), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).reverseSubtract(1, this.o), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).reverseSubtract((long)1, this.o), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).reverseSubtract((float)1, this.o), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).reverseSubtract((double)1, this.o), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).reverseSubtract(this.bi, this.o), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).reverseSubtract(this.bd, this.o), null);
  }
  
  public void testUnsupportedMetaClassMethodsSubtractEquals() throws Throwable {    
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).subtractEquals((byte)1, (byte)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).subtractEquals((byte)1, (char)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).subtractEquals((byte)1, (short)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).subtractEquals((byte)1, 1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).subtractEquals((byte)1, (long)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).subtractEquals((byte)1, (float)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).subtractEquals((byte)1, (double)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).subtractEquals((byte)1, this.bi);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).subtractEquals((byte)1, this.bd);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).subtractEquals((char)1, (byte)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).subtractEquals((char)1, (char)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).subtractEquals((char)1, (short)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).subtractEquals((char)1, 1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).subtractEquals((char)1, (long)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).subtractEquals((char)1, (float)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).subtractEquals((char)1, (double)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).subtractEquals((char)1, this.bi);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).subtractEquals((char)1, this.bd);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).subtractEquals((short)1, (byte)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).subtractEquals((short)1, (char)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).subtractEquals((short)1, (short)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).subtractEquals((short)1, 1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).subtractEquals((short)1, (long)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).subtractEquals((short)1, (float)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).subtractEquals((short)1, (double)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).subtractEquals((short)1, this.bi);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).subtractEquals((short)1, this.bd);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).subtractEquals(1, (byte)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).subtractEquals(1, (char)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).subtractEquals(1, (short)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).subtractEquals(1, 1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).subtractEquals(1, (long)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).subtractEquals(1, (float)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).subtractEquals(1, (double)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).subtractEquals(1, this.bi);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).subtractEquals(1, this.bd);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).subtractEquals((long)1, (byte)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).subtractEquals((long)1, (char)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).subtractEquals((long)1, (short)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).subtractEquals((long)1, 1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).subtractEquals((long)1, (long)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).subtractEquals((long)1, (float)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).subtractEquals((long)1, (double)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).subtractEquals((long)1, this.bi);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).subtractEquals((long)1, this.bd);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).subtractEquals((float)1, (byte)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).subtractEquals((float)1, (char)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).subtractEquals((float)1, (short)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).subtractEquals((float)1, 1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).subtractEquals((float)1, (long)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).subtractEquals((float)1, (float)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).subtractEquals((float)1, (double)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).subtractEquals((float)1, this.bi);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).subtractEquals((float)1, this.bd);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).subtractEquals((double)1, (byte)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).subtractEquals((double)1, (char)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).subtractEquals((double)1, (short)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).subtractEquals((double)1, 1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).subtractEquals((double)1, (long)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).subtractEquals((double)1, (float)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).subtractEquals((double)1, (double)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).subtractEquals((double)1, this.bi);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).subtractEquals((double)1, this.bd);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).subtractEquals(this.bi, (byte)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).subtractEquals(this.bi, (char)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).subtractEquals(this.bi, (short)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).subtractEquals(this.bi, 1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).subtractEquals(this.bi, (long)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).subtractEquals(this.bi, (float)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).subtractEquals(this.bi, (double)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).subtractEquals(this.bi, this.bi);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).subtractEquals(this.bi, this.bd);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).subtractEquals(this.bd, (byte)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).subtractEquals(this.bd, (char)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).subtractEquals(this.bd, (short)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).subtractEquals(this.bd, 1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).subtractEquals(this.bd, (long)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).subtractEquals(this.bd, (float)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).subtractEquals(this.bd, (double)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).subtractEquals(this.bd, this.bi);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).subtractEquals(this.bd, this.bd);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
  }
  
  public void testSupportedMetaClassMethodsSubtractEquals() throws Throwable {    
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).subtractEquals(this.o, this.o), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).subtractEquals(this.o, (byte)1), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).subtractEquals(this.o, (char)1), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).subtractEquals(this.o, (short)1), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).subtractEquals(this.o, 1), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).subtractEquals(this.o, (long)1), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).subtractEquals(this.o, (float)1), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).subtractEquals(this.o, (double)1), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).subtractEquals(this.o, this.bi), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).subtractEquals(this.o, this.bd), null);
    
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).reverseSubtractEquals((byte)1, this.o), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).reverseSubtractEquals((char)1, this.o), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).reverseSubtractEquals((short)1, this.o), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).reverseSubtractEquals(1, this.o), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).reverseSubtractEquals((long)1, this.o), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).reverseSubtractEquals((float)1, this.o), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).reverseSubtractEquals((double)1, this.o), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).reverseSubtractEquals(this.bi, this.o), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).reverseSubtractEquals(this.bd, this.o), null);
  }

  public void testUnsupportedMetaClassMethodsMultiply() throws Throwable {    
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).multiply((byte)1, (byte)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).multiply((byte)1, (char)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).multiply((byte)1, (short)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).multiply((byte)1, 1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).multiply((byte)1, (long)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).multiply((byte)1, (float)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).multiply((byte)1, (double)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).multiply((byte)1, this.bi);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).multiply((byte)1, this.bd);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).multiply((char)1, (byte)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).multiply((char)1, (char)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).multiply((char)1, (short)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).multiply((char)1, 1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).multiply((char)1, (long)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).multiply((char)1, (float)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).multiply((char)1, (double)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).multiply((char)1, this.bi);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).multiply((char)1, this.bd);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).multiply((short)1, (byte)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).multiply((short)1, (char)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).multiply((short)1, (short)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).multiply((short)1, 1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).multiply((short)1, (long)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).multiply((short)1, (float)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).multiply((short)1, (double)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).multiply((short)1, this.bi);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).multiply((short)1, this.bd);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).multiply(1, (byte)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).multiply(1, (char)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).multiply(1, (short)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).multiply(1, 1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).multiply(1, (long)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).multiply(1, (float)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).multiply(1, (double)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).multiply(1, this.bi);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).multiply(1, this.bd);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).multiply((long)1, (byte)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).multiply((long)1, (char)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).multiply((long)1, (short)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).multiply((long)1, 1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).multiply((long)1, (long)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).multiply((long)1, (float)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).multiply((long)1, (double)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).multiply((long)1, this.bi);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).multiply((long)1, this.bd);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).multiply((float)1, (byte)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).multiply((float)1, (char)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).multiply((float)1, (short)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).multiply((float)1, 1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).multiply((float)1, (long)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).multiply((float)1, (float)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).multiply((float)1, (double)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).multiply((float)1, this.bi);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).multiply((float)1, this.bd);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).multiply((double)1, (byte)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).multiply((double)1, (char)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).multiply((double)1, (short)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).multiply((double)1, 1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).multiply((double)1, (long)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).multiply((double)1, (float)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).multiply((double)1, (double)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).multiply((double)1, this.bi);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).multiply((double)1, this.bd);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).multiply(this.bi, (byte)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).multiply(this.bi, (char)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).multiply(this.bi, (short)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).multiply(this.bi, 1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).multiply(this.bi, (long)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).multiply(this.bi, (float)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).multiply(this.bi, (double)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).multiply(this.bi, this.bi);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).multiply(this.bi, this.bd);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).multiply(this.bd, (byte)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).multiply(this.bd, (char)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).multiply(this.bd, (short)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).multiply(this.bd, 1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).multiply(this.bd, (long)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).multiply(this.bd, (float)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).multiply(this.bd, (double)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).multiply(this.bd, this.bi);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).multiply(this.bd, this.bd);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
  }
  
  public void testSupportedMetaClassMethodsMultiply() throws Throwable {    
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).multiply(this.o, this.o), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).multiply(this.o, (byte)1), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).multiply(this.o, (char)1), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).multiply(this.o, (short)1), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).multiply(this.o, 1), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).multiply(this.o, (long)1), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).multiply(this.o, (float)1), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).multiply(this.o, (double)1), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).multiply(this.o, this.bi), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).multiply(this.o, this.bd), null);
    
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).reverseMultiply((byte)1, this.o), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).reverseMultiply((char)1, this.o), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).reverseMultiply((short)1, this.o), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).reverseMultiply(1, this.o), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).reverseMultiply((long)1, this.o), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).reverseMultiply((float)1, this.o), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).reverseMultiply((double)1, this.o), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).reverseMultiply(this.bi, this.o), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).reverseMultiply(this.bd, this.o), null);
  }
 
  public void testUnsupportedMetaClassMethodsMuiltiplyEquals() throws Throwable {    
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).multiplyEquals((byte)1, (byte)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).multiplyEquals((byte)1, (char)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).multiplyEquals((byte)1, (short)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).multiplyEquals((byte)1, 1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).multiplyEquals((byte)1, (long)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).multiplyEquals((byte)1, (float)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).multiplyEquals((byte)1, (double)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).multiplyEquals((byte)1, this.bi);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).multiplyEquals((byte)1, this.bd);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).multiplyEquals((char)1, (byte)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).multiplyEquals((char)1, (char)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).multiplyEquals((char)1, (short)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).multiplyEquals((char)1, 1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).multiplyEquals((char)1, (long)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).multiplyEquals((char)1, (float)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).multiplyEquals((char)1, (double)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).multiplyEquals((char)1, this.bi);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).multiplyEquals((char)1, this.bd);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).multiplyEquals((short)1, (byte)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).multiplyEquals((short)1, (char)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).multiplyEquals((short)1, (short)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).multiplyEquals((short)1, 1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).multiplyEquals((short)1, (long)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).multiplyEquals((short)1, (float)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).multiplyEquals((short)1, (double)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).multiplyEquals((short)1, this.bi);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).multiplyEquals((short)1, this.bd);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).multiplyEquals(1, (byte)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).multiplyEquals(1, (char)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).multiplyEquals(1, (short)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).multiplyEquals(1, 1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).multiplyEquals(1, (long)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).multiplyEquals(1, (float)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).multiplyEquals(1, (double)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).multiplyEquals(1, this.bi);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).multiplyEquals(1, this.bd);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).multiplyEquals((long)1, (byte)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).multiplyEquals((long)1, (char)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).multiplyEquals((long)1, (short)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).multiplyEquals((long)1, 1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).multiplyEquals((long)1, (long)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).multiplyEquals((long)1, (float)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).multiplyEquals((long)1, (double)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).multiplyEquals((long)1, this.bi);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).multiplyEquals((long)1, this.bd);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).multiplyEquals((float)1, (byte)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).multiplyEquals((float)1, (char)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).multiplyEquals((float)1, (short)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).multiplyEquals((float)1, 1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).multiplyEquals((float)1, (long)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).multiplyEquals((float)1, (float)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).multiplyEquals((float)1, (double)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).multiplyEquals((float)1, this.bi);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).multiplyEquals((float)1, this.bd);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).multiplyEquals((double)1, (byte)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).multiplyEquals((double)1, (char)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).multiplyEquals((double)1, (short)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).multiplyEquals((double)1, 1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).multiplyEquals((double)1, (long)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).multiplyEquals((double)1, (float)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).multiplyEquals((double)1, (double)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).multiplyEquals((double)1, this.bi);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).multiplyEquals((double)1, this.bd);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).multiplyEquals(this.bi, (byte)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).multiplyEquals(this.bi, (char)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).multiplyEquals(this.bi, (short)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).multiplyEquals(this.bi, 1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).multiplyEquals(this.bi, (long)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).multiplyEquals(this.bi, (float)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).multiplyEquals(this.bi, (double)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).multiplyEquals(this.bi, this.bi);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).multiplyEquals(this.bi, this.bd);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).multiplyEquals(this.bd, (byte)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).multiplyEquals(this.bd, (char)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).multiplyEquals(this.bd, (short)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).multiplyEquals(this.bd, 1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).multiplyEquals(this.bd, (long)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).multiplyEquals(this.bd, (float)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).multiplyEquals(this.bd, (double)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).multiplyEquals(this.bd, this.bi);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).multiplyEquals(this.bd, this.bd);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
  }
  
  public void testSupportedMetaClassMethodsMultiplyEquals() throws Throwable {    
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).multiplyEquals(this.o, this.o), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).multiplyEquals(this.o, (byte)1), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).multiplyEquals(this.o, (char)1), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).multiplyEquals(this.o, (short)1), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).multiplyEquals(this.o, 1), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).multiplyEquals(this.o, (long)1), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).multiplyEquals(this.o, (float)1), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).multiplyEquals(this.o, (double)1), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).multiplyEquals(this.o, this.bi), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).multiplyEquals(this.o, this.bd), null);
    
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).reverseMultiplyEquals((byte)1, this.o), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).reverseMultiplyEquals((char)1, this.o), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).reverseMultiplyEquals((short)1, this.o), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).reverseMultiplyEquals(1, this.o), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).reverseMultiplyEquals((long)1, this.o), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).reverseMultiplyEquals((float)1, this.o), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).reverseMultiplyEquals((double)1, this.o), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).reverseMultiplyEquals(this.bi, this.o), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).reverseMultiplyEquals(this.bd, this.o), null);
  }

  public void testUnsupportedMetaClassMethodDivide() throws Throwable {    
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).divide((byte)1, (byte)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).divide((byte)1, (char)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).divide((byte)1, (short)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).divide((byte)1, 1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).divide((byte)1, (long)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).divide((byte)1, (float)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).divide((byte)1, (double)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).divide((byte)1, this.bi);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).divide((byte)1, this.bd);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).divide((char)1, (byte)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).divide((char)1, (char)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).divide((char)1, (short)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).divide((char)1, 1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).divide((char)1, (long)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).divide((char)1, (float)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).divide((char)1, (double)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).divide((char)1, this.bi);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).divide((char)1, this.bd);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).divide((short)1, (byte)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).divide((short)1, (char)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).divide((short)1, (short)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).divide((short)1, 1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).divide((short)1, (long)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).divide((short)1, (float)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).divide((short)1, (double)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).divide((short)1, this.bi);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).divide((short)1, this.bd);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).divide(1, (byte)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).divide(1, (char)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).divide(1, (short)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).divide(1, 1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).divide(1, (long)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).divide(1, (float)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).divide(1, (double)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).divide(1, this.bi);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).divide(1, this.bd);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).divide((long)1, (byte)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).divide((long)1, (char)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).divide((long)1, (short)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).divide((long)1, 1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).divide((long)1, (long)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).divide((long)1, (float)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).divide((long)1, (double)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).divide((long)1, this.bi);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).divide((long)1, this.bd);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).divide((float)1, (byte)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).divide((float)1, (char)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).divide((float)1, (short)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).divide((float)1, 1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).divide((float)1, (long)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).divide((float)1, (float)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).divide((float)1, (double)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).divide((float)1, this.bi);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).divide((float)1, this.bd);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).divide((double)1, (byte)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).divide((double)1, (char)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).divide((double)1, (short)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).divide((double)1, 1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).divide((double)1, (long)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).divide((double)1, (float)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).divide((double)1, (double)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).divide((double)1, this.bi);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).divide((double)1, this.bd);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).divide(this.bi, (byte)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).divide(this.bi, (char)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).divide(this.bi, (short)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).divide(this.bi, 1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).divide(this.bi, (long)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).divide(this.bi, (float)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).divide(this.bi, (double)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).divide(this.bi, this.bi);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).divide(this.bi, this.bd);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).divide(this.bd, (byte)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).divide(this.bd, (char)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).divide(this.bd, (short)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).divide(this.bd, 1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).divide(this.bd, (long)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).divide(this.bd, (float)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).divide(this.bd, (double)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).divide(this.bd, this.bi);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).divide(this.bd, this.bd);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
  }
  
  public void testSupportedMetaClassMethodsDivide() throws Throwable {    
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).divide(this.o, this.o), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).divide(this.o, (byte)1), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).divide(this.o, (char)1), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).divide(this.o, (short)1), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).divide(this.o, 1), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).divide(this.o, (long)1), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).divide(this.o, (float)1), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).divide(this.o, (double)1), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).divide(this.o, this.bi), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).divide(this.o, this.bd), null);
    
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).reverseDivide((byte)1, this.o), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).reverseDivide((char)1, this.o), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).reverseDivide((short)1, this.o), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).reverseDivide(1, this.o), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).reverseDivide((long)1, this.o), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).reverseDivide((float)1, this.o), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).reverseDivide((double)1, this.o), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).reverseDivide(this.bi, this.o), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).reverseDivide(this.bd, this.o), null);
  }
  
  public void testUnsupportedMetaClassMethodsDivideEquals() throws Throwable {    
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).divideEquals((byte)1, (byte)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).divideEquals((byte)1, (char)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).divideEquals((byte)1, (short)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).divideEquals((byte)1, 1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).divideEquals((byte)1, (long)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).divideEquals((byte)1, (float)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).divideEquals((byte)1, (double)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).divideEquals((byte)1, this.bi);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).divideEquals((byte)1, this.bd);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).divideEquals((char)1, (byte)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).divideEquals((char)1, (char)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).divideEquals((char)1, (short)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).divideEquals((char)1, 1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).divideEquals((char)1, (long)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).divideEquals((char)1, (float)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).divideEquals((char)1, (double)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).divideEquals((char)1, this.bi);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).divideEquals((char)1, this.bd);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).divideEquals((short)1, (byte)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).divideEquals((short)1, (char)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).divideEquals((short)1, (short)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).divideEquals((short)1, 1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).divideEquals((short)1, (long)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).divideEquals((short)1, (float)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).divideEquals((short)1, (double)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).divideEquals((short)1, this.bi);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).divideEquals((short)1, this.bd);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).divideEquals(1, (byte)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).divideEquals(1, (char)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).divideEquals(1, (short)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).divideEquals(1, 1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).divideEquals(1, (long)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).divideEquals(1, (float)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).divideEquals(1, (double)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).divideEquals(1, this.bi);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).divideEquals(1, this.bd);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).divideEquals((long)1, (byte)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).divideEquals((long)1, (char)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).divideEquals((long)1, (short)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).divideEquals((long)1, 1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).divideEquals((long)1, (long)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).divideEquals((long)1, (float)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).divideEquals((long)1, (double)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).divideEquals((long)1, this.bi);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).divideEquals((long)1, this.bd);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).divideEquals((float)1, (byte)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).divideEquals((float)1, (char)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).divideEquals((float)1, (short)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).divideEquals((float)1, 1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).divideEquals((float)1, (long)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).divideEquals((float)1, (float)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).divideEquals((float)1, (double)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).divideEquals((float)1, this.bi);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).divideEquals((float)1, this.bd);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).divideEquals((double)1, (byte)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).divideEquals((double)1, (char)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).divideEquals((double)1, (short)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).divideEquals((double)1, 1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).divideEquals((double)1, (long)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).divideEquals((double)1, (float)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).divideEquals((double)1, (double)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).divideEquals((double)1, this.bi);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).divideEquals((double)1, this.bd);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).divideEquals(this.bi, (byte)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).divideEquals(this.bi, (char)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).divideEquals(this.bi, (short)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).divideEquals(this.bi, 1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).divideEquals(this.bi, (long)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).divideEquals(this.bi, (float)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).divideEquals(this.bi, (double)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).divideEquals(this.bi, this.bi);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).divideEquals(this.bi, this.bd);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).divideEquals(this.bd, (byte)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).divideEquals(this.bd, (char)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).divideEquals(this.bd, (short)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).divideEquals(this.bd, 1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).divideEquals(this.bd, (long)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).divideEquals(this.bd, (float)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).divideEquals(this.bd, (double)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).divideEquals(this.bd, this.bi);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).divideEquals(this.bd, this.bd);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
  }
  
  public void testSupportedMetaClassMethodsDivideEquals() throws Throwable {    
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).divideEquals(this.o, this.o), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).divideEquals(this.o, (byte)1), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).divideEquals(this.o, (char)1), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).divideEquals(this.o, (short)1), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).divideEquals(this.o, 1), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).divideEquals(this.o, (long)1), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).divideEquals(this.o, (float)1), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).divideEquals(this.o, (double)1), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).divideEquals(this.o, this.bi), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).divideEquals(this.o, this.bd), null);
    
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).reverseDivideEquals((byte)1, this.o), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).reverseDivideEquals((char)1, this.o), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).reverseDivideEquals((short)1, this.o), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).reverseDivideEquals(1, this.o), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).reverseDivideEquals((long)1, this.o), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).reverseDivideEquals((float)1, this.o), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).reverseDivideEquals((double)1, this.o), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).reverseDivideEquals(this.bi, this.o), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).reverseDivideEquals(this.bd, this.o), null);
  }

  public void testUnsupportedMetaClassMethodIntegerDivide() throws Throwable {    
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).integerDivide((byte)1, (byte)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).integerDivide((byte)1, (char)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).integerDivide((byte)1, (short)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).integerDivide((byte)1, 1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).integerDivide((byte)1, (long)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).integerDivide((byte)1, (float)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).integerDivide((byte)1, (double)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).integerDivide((byte)1, this.bi);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).integerDivide((byte)1, this.bd);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).integerDivide((char)1, (byte)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).integerDivide((char)1, (char)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).integerDivide((char)1, (short)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).integerDivide((char)1, 1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).integerDivide((char)1, (long)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).integerDivide((char)1, (float)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).integerDivide((char)1, (double)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).integerDivide((char)1, this.bi);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).integerDivide((char)1, this.bd);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).integerDivide((short)1, (byte)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).integerDivide((short)1, (char)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).integerDivide((short)1, (short)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).integerDivide((short)1, 1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).integerDivide((short)1, (long)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).integerDivide((short)1, (float)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).integerDivide((short)1, (double)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).integerDivide((short)1, this.bi);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).integerDivide((short)1, this.bd);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).integerDivide(1, (byte)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).integerDivide(1, (char)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).integerDivide(1, (short)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).integerDivide(1, 1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).integerDivide(1, (long)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).integerDivide(1, (float)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).integerDivide(1, (double)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).integerDivide(1, this.bi);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).integerDivide(1, this.bd);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).integerDivide((long)1, (byte)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).integerDivide((long)1, (char)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).integerDivide((long)1, (short)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).integerDivide((long)1, 1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).integerDivide((long)1, (long)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).integerDivide((long)1, (float)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).integerDivide((long)1, (double)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).integerDivide((long)1, this.bi);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).integerDivide((long)1, this.bd);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).integerDivide((float)1, (byte)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).integerDivide((float)1, (char)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).integerDivide((float)1, (short)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).integerDivide((float)1, 1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).integerDivide((float)1, (long)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).integerDivide((float)1, (float)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).integerDivide((float)1, (double)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).integerDivide((float)1, this.bi);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).integerDivide((float)1, this.bd);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).integerDivide((double)1, (byte)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).integerDivide((double)1, (char)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).integerDivide((double)1, (short)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).integerDivide((double)1, 1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).integerDivide((double)1, (long)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).integerDivide((double)1, (float)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).integerDivide((double)1, (double)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).integerDivide((double)1, this.bi);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).integerDivide((double)1, this.bd);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).integerDivide(this.bi, (byte)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).integerDivide(this.bi, (char)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).integerDivide(this.bi, (short)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).integerDivide(this.bi, 1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).integerDivide(this.bi, (long)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).integerDivide(this.bi, (float)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).integerDivide(this.bi, (double)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).integerDivide(this.bi, this.bi);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).integerDivide(this.bi, this.bd);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).integerDivide(this.bd, (byte)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).integerDivide(this.bd, (char)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).integerDivide(this.bd, (short)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).integerDivide(this.bd, 1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).integerDivide(this.bd, (long)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).integerDivide(this.bd, (float)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).integerDivide(this.bd, (double)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).integerDivide(this.bd, this.bi);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).integerDivide(this.bd, this.bd);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
  }
  
  public void testSupportedMetaClassMethodsIntegerDivide() throws Throwable {    
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).integerDivide(this.o, this.o), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).integerDivide(this.o, (byte)1), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).integerDivide(this.o, (char)1), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).integerDivide(this.o, (short)1), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).integerDivide(this.o, 1), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).integerDivide(this.o, (long)1), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).integerDivide(this.o, (float)1), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).integerDivide(this.o, (double)1), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).integerDivide(this.o, this.bi), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).integerDivide(this.o, this.bd), null);
    
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).reverseIntegerDivide((byte)1, this.o), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).reverseIntegerDivide((char)1, this.o), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).reverseIntegerDivide((short)1, this.o), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).reverseIntegerDivide(1, this.o), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).reverseIntegerDivide((long)1, this.o), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).reverseIntegerDivide((float)1, this.o), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).reverseIntegerDivide((double)1, this.o), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).reverseIntegerDivide(this.bi, this.o), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).reverseIntegerDivide(this.bd, this.o), null);
  }

  public void testUnsupportedMetaClassMethodIntegerDivideEquals() throws Throwable {    
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).integerDivideEquals((byte)1, (byte)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).integerDivideEquals((byte)1, (char)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).integerDivideEquals((byte)1, (short)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).integerDivideEquals((byte)1, 1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).integerDivideEquals((byte)1, (long)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).integerDivideEquals((byte)1, (float)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).integerDivideEquals((byte)1, (double)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).integerDivideEquals((byte)1, this.bi);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).integerDivideEquals((byte)1, this.bd);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).integerDivideEquals((char)1, (byte)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).integerDivideEquals((char)1, (char)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).integerDivideEquals((char)1, (short)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).integerDivideEquals((char)1, 1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).integerDivideEquals((char)1, (long)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).integerDivideEquals((char)1, (float)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).integerDivideEquals((char)1, (double)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).integerDivideEquals((char)1, this.bi);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).integerDivideEquals((char)1, this.bd);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).integerDivideEquals((short)1, (byte)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).integerDivideEquals((short)1, (char)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).integerDivideEquals((short)1, (short)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).integerDivideEquals((short)1, 1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).integerDivideEquals((short)1, (long)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).integerDivideEquals((short)1, (float)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).integerDivideEquals((short)1, (double)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).integerDivideEquals((short)1, this.bi);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).integerDivideEquals((short)1, this.bd);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).integerDivideEquals(1, (byte)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).integerDivideEquals(1, (char)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).integerDivideEquals(1, (short)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).integerDivideEquals(1, 1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).integerDivideEquals(1, (long)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).integerDivideEquals(1, (float)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).integerDivideEquals(1, (double)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).integerDivideEquals(1, this.bi);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).integerDivideEquals(1, this.bd);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).integerDivideEquals((long)1, (byte)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).integerDivideEquals((long)1, (char)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).integerDivideEquals((long)1, (short)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).integerDivideEquals((long)1, 1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).integerDivideEquals((long)1, (long)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).integerDivideEquals((long)1, (float)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).integerDivideEquals((long)1, (double)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).integerDivideEquals((long)1, this.bi);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).integerDivideEquals((long)1, this.bd);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).integerDivideEquals((float)1, (byte)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).integerDivideEquals((float)1, (char)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).integerDivideEquals((float)1, (short)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).integerDivideEquals((float)1, 1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).integerDivideEquals((float)1, (long)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).integerDivideEquals((float)1, (float)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).integerDivideEquals((float)1, (double)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).integerDivideEquals((float)1, this.bi);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).integerDivideEquals((float)1, this.bd);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).integerDivideEquals((double)1, (byte)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).integerDivideEquals((double)1, (char)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).integerDivideEquals((double)1, (short)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).integerDivideEquals((double)1, 1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).integerDivideEquals((double)1, (long)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).integerDivideEquals((double)1, (float)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).integerDivideEquals((double)1, (double)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).integerDivideEquals((double)1, this.bi);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).integerDivideEquals((double)1, this.bd);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).integerDivideEquals(this.bi, (byte)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).integerDivideEquals(this.bi, (char)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).integerDivideEquals(this.bi, (short)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).integerDivideEquals(this.bi, 1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).integerDivideEquals(this.bi, (long)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).integerDivideEquals(this.bi, (float)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).integerDivideEquals(this.bi, (double)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).integerDivideEquals(this.bi, this.bi);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).integerDivideEquals(this.bi, this.bd);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).integerDivideEquals(this.bd, (byte)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).integerDivideEquals(this.bd, (char)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).integerDivideEquals(this.bd, (short)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).integerDivideEquals(this.bd, 1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).integerDivideEquals(this.bd, (long)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).integerDivideEquals(this.bd, (float)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).integerDivideEquals(this.bd, (double)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).integerDivideEquals(this.bd, this.bi);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).integerDivideEquals(this.bd, this.bd);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
  }
  
  public void testSupportedMetaClassMethodsIntegerDivideEquals() throws Throwable {    
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).integerDivideEquals(this.o, this.o), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).integerDivideEquals(this.o, (byte)1), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).integerDivideEquals(this.o, (char)1), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).integerDivideEquals(this.o, (short)1), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).integerDivideEquals(this.o, 1), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).integerDivideEquals(this.o, (long)1), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).integerDivideEquals(this.o, (float)1), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).integerDivideEquals(this.o, (double)1), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).integerDivideEquals(this.o, this.bi), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).integerDivideEquals(this.o, this.bd), null);
    
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).reverseIntegerDivideEquals((byte)1, this.o), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).reverseIntegerDivideEquals((char)1, this.o), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).reverseIntegerDivideEquals((short)1, this.o), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).reverseIntegerDivideEquals(1, this.o), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).reverseIntegerDivideEquals((long)1, this.o), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).reverseIntegerDivideEquals((float)1, this.o), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).reverseIntegerDivideEquals((double)1, this.o), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).reverseIntegerDivideEquals(this.bi, this.o), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).reverseIntegerDivideEquals(this.bd, this.o), null);
  }

  public void testUnsupportedMetaClassMethodRemainder() throws Throwable {    
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).remainder((byte)1, (byte)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).remainder((byte)1, (char)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).remainder((byte)1, (short)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).remainder((byte)1, 1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).remainder((byte)1, (long)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).remainder((byte)1, this.bi);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).remainder((char)1, (byte)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).remainder((char)1, (char)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).remainder((char)1, (short)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).remainder((char)1, 1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).remainder((char)1, (long)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).remainder((char)1, this.bi);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).remainder((short)1, (byte)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).remainder((short)1, (char)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).remainder((short)1, (short)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).remainder((short)1, 1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).remainder((short)1, (long)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).remainder((short)1, this.bi);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).remainder(1, (byte)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).remainder(1, (char)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).remainder(1, (short)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).remainder(1, 1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).remainder(1, (long)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).remainder(1, this.bi);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).remainder((long)1, (byte)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).remainder((long)1, (char)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).remainder((long)1, (short)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).remainder((long)1, 1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).remainder((long)1, (long)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).remainder((long)1, this.bi);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).remainder(this.bi, (byte)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).remainder(this.bi, (char)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).remainder(this.bi, (short)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).remainder(this.bi, 1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).remainder(this.bi, (long)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).remainder(this.bi, this.bi);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
  }
  
  public void testSupportedMetaClassMethodsRemainder() throws Throwable {    
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).remainder(this.o, this.o), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).remainder(this.o, (byte)1), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).remainder(this.o, (char)1), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).remainder(this.o, (short)1), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).remainder(this.o, 1), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).remainder(this.o, (long)1), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).remainder(this.o, (float)1), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).remainder(this.o, (double)1), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).remainder(this.o, this.bi), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).remainder(this.o, this.bd), null);
    
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).reverseRemainder((byte)1, this.o), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).reverseRemainder((char)1, this.o), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).reverseRemainder((short)1, this.o), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).reverseRemainder(1, this.o), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).reverseRemainder((long)1, this.o), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).reverseRemainder(this.bi, this.o), null);
  }

  public void testUnsupportedMetaClassMethodRemainderEquals() throws Throwable {    
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).remainderEquals((byte)1, (byte)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).remainderEquals((byte)1, (char)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).remainderEquals((byte)1, (short)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).remainderEquals((byte)1, 1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).remainderEquals((byte)1, (long)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).remainderEquals((byte)1, this.bi);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).remainderEquals((char)1, (byte)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).remainderEquals((char)1, (char)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).remainderEquals((char)1, (short)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).remainderEquals((char)1, 1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).remainderEquals((char)1, (long)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).remainderEquals((char)1, this.bi);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).remainderEquals((short)1, (byte)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).remainderEquals((short)1, (char)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).remainderEquals((short)1, (short)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).remainderEquals((short)1, 1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).remainderEquals((short)1, (long)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).remainderEquals((short)1, this.bi);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).remainderEquals(1, (byte)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).remainderEquals(1, (char)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).remainderEquals(1, (short)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).remainderEquals(1, 1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).remainderEquals(1, (long)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).remainderEquals(1, this.bi);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).remainderEquals((long)1, (byte)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).remainderEquals((long)1, (char)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).remainderEquals((long)1, (short)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).remainderEquals((long)1, 1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).remainderEquals((long)1, (long)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).remainderEquals((long)1, this.bi);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).remainderEquals(this.bi, (byte)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).remainderEquals(this.bi, (char)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).remainderEquals(this.bi, (short)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).remainderEquals(this.bi, 1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).remainderEquals(this.bi, (long)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).remainderEquals(this.bi, this.bi);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
  }
  
  public void testSupportedMetaClassMethodsRemainderEquals() throws Throwable {    
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).remainderEquals(this.o, this.o), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).remainderEquals(this.o, (byte)1), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).remainderEquals(this.o, (char)1), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).remainderEquals(this.o, (short)1), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).remainderEquals(this.o, 1), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).remainderEquals(this.o, (long)1), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).remainderEquals(this.o, (float)1), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).remainderEquals(this.o, (double)1), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).remainderEquals(this.o, this.bi), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).remainderEquals(this.o, this.bd), null);
    
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).reverseRemainderEquals((byte)1, this.o), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).reverseRemainderEquals((char)1, this.o), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).reverseRemainderEquals((short)1, this.o), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).reverseRemainderEquals(1, this.o), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).reverseRemainderEquals((long)1, this.o), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).reverseRemainderEquals(this.bi, this.o), null);
  }
  
  public void testUnsupportedMetaClassMethodsAnd() throws Throwable {    
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).and((byte)1, (byte)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).and((byte)1, (char)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).and((byte)1, (short)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).and((byte)1, 1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).and((byte)1, (long)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).and((byte)1, this.bi);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).and((char)1, (byte)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).and((char)1, (char)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).and((char)1, (short)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).and((char)1, 1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).and((char)1, (long)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
   try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).and((char)1, this.bi);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).and((short)1, (byte)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).and((short)1, (char)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).and((short)1, (short)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).and((short)1, 1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).and((short)1, (long)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).and((short)1, this.bi);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).and(1, (byte)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).and(1, (char)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).and(1, (short)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).and(1, 1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).and(1, (long)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).and(1, this.bi);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).and((long)1, (byte)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).and((long)1, (char)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).and((long)1, (short)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).and((long)1, 1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).and((long)1, (long)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).and((long)1, this.bi);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).and(this.bi, (byte)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).and(this.bi, (char)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).and(this.bi, (short)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).and(this.bi, 1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).and(this.bi, (long)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).and(this.bi, this.bi);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
  }
  
  public void testSupportedMetaClassMethodsAnd() throws Throwable {    
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).and(this.o, this.o), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).and(this.o, (byte)1), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).and(this.o, (char)1), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).and(this.o, (short)1), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).and(this.o, 1), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).and(this.o, (long)1), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).and(this.o, this.bi), null);
    
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).reverseAnd((byte)1, this.o), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).reverseAnd((char)1, this.o), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).reverseAnd((short)1, this.o), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).reverseAnd(1, this.o), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).reverseAnd((long)1, this.o), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).reverseAnd(this.bi, this.o), null);
  }
  
  public void testUnsupportedMetaClassMethodsAndEquals() throws Throwable {    
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).andEquals((byte)1, (byte)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).andEquals((byte)1, (char)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).andEquals((byte)1, (short)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).andEquals((byte)1, 1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).andEquals((byte)1, (long)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).andEquals((byte)1, this.bi);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).andEquals((char)1, (byte)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).andEquals((char)1, (char)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).andEquals((char)1, (short)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).andEquals((char)1, 1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).andEquals((char)1, (long)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).andEquals((char)1, this.bi);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).andEquals((short)1, (byte)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).andEquals((short)1, (char)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).andEquals((short)1, (short)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).andEquals((short)1, 1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).andEquals((short)1, (long)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).andEquals((short)1, this.bi);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).andEquals(1, (byte)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).andEquals(1, (char)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).andEquals(1, (short)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).andEquals(1, 1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).andEquals(1, (long)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).andEquals(1, this.bi);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).andEquals((long)1, (byte)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).andEquals((long)1, (char)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).andEquals((long)1, (short)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).andEquals((long)1, 1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).andEquals((long)1, (long)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).andEquals((long)1, this.bi);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).andEquals(this.bi, (byte)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).andEquals(this.bi, (char)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).andEquals(this.bi, (short)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).andEquals(this.bi, 1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).andEquals(this.bi, (long)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).andEquals(this.bi, this.bi);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
  }
  
  public void testSupportedMetaClassMethodsAndEquals() throws Throwable {    
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).andEquals(this.o, this.o), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).andEquals(this.o, (byte)1), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).andEquals(this.o, (char)1), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).andEquals(this.o, (short)1), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).andEquals(this.o, 1), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).andEquals(this.o, (long)1), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).andEquals(this.o, this.bi), null);
    
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).reverseAndEquals((byte)1, this.o), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).reverseAndEquals((char)1, this.o), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).reverseAndEquals((short)1, this.o), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).reverseAndEquals(1, this.o), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).reverseAndEquals((long)1, this.o), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).reverseAndEquals(this.bi, this.o), null);
  }
  
  public void testUnsupportedMetaClassMethodsOr() throws Throwable {    
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).or((byte)1, (byte)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).or((byte)1, (char)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).or((byte)1, (short)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).or((byte)1, 1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).or((byte)1, (long)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).or((byte)1, this.bi);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).or((char)1, (byte)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).or((char)1, (char)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).or((char)1, (short)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).or((char)1, 1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).or((char)1, (long)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
   try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).or((char)1, this.bi);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).or((short)1, (byte)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).or((short)1, (char)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).or((short)1, (short)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).or((short)1, 1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).or((short)1, (long)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).or((short)1, this.bi);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).or(1, (byte)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).or(1, (char)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).or(1, (short)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).or(1, 1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).or(1, (long)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).or(1, this.bi);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).or((long)1, (byte)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).or((long)1, (char)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).or((long)1, (short)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).or((long)1, 1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).or((long)1, (long)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).or((long)1, this.bi);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).or(this.bi, (byte)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).or(this.bi, (char)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).or(this.bi, (short)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).or(this.bi, 1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).or(this.bi, (long)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).or(this.bi, this.bi);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
  }
  
  public void testSupportedMetaClassMethodsOr() throws Throwable {    
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).or(this.o, this.o), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).or(this.o, (byte)1), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).or(this.o, (char)1), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).or(this.o, (short)1), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).or(this.o, 1), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).or(this.o, (long)1), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).or(this.o, this.bi), null);
    
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).reverseOr((byte)1, this.o), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).reverseOr((char)1, this.o), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).reverseOr((short)1, this.o), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).reverseOr(1, this.o), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).reverseOr((long)1, this.o), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).reverseOr(this.bi, this.o), null);
  }
  
  public void testUnsupportedMetaClassMethodsOrEquals() throws Throwable {    
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).orEquals((byte)1, (byte)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).orEquals((byte)1, (char)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).orEquals((byte)1, (short)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).orEquals((byte)1, 1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).orEquals((byte)1, (long)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).orEquals((byte)1, this.bi);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).orEquals((char)1, (byte)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).orEquals((char)1, (char)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).orEquals((char)1, (short)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).orEquals((char)1, 1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).orEquals((char)1, (long)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).orEquals((char)1, this.bi);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).orEquals((short)1, (byte)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).orEquals((short)1, (char)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).orEquals((short)1, (short)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).orEquals((short)1, 1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).orEquals((short)1, (long)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).orEquals((short)1, this.bi);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).orEquals(1, (byte)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).orEquals(1, (char)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).orEquals(1, (short)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).orEquals(1, 1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).orEquals(1, (long)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).orEquals(1, this.bi);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).orEquals((long)1, (byte)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).orEquals((long)1, (char)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).orEquals((long)1, (short)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).orEquals((long)1, 1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).orEquals((long)1, (long)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).orEquals((long)1, this.bi);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).orEquals(this.bi, (byte)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).orEquals(this.bi, (char)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).orEquals(this.bi, (short)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).orEquals(this.bi, 1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).orEquals(this.bi, (long)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).orEquals(this.bi, this.bi);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
  }
  
  public void testSupportedMetaClassMethodsOrEquals() throws Throwable {    
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).orEquals(this.o, this.o), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).orEquals(this.o, (byte)1), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).orEquals(this.o, (char)1), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).orEquals(this.o, (short)1), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).orEquals(this.o, 1), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).orEquals(this.o, (long)1), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).orEquals(this.o, this.bi), null);
    
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).reverseOrEquals((byte)1, this.o), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).reverseOrEquals((char)1, this.o), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).reverseOrEquals((short)1, this.o), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).reverseOrEquals(1, this.o), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).reverseOrEquals((long)1, this.o), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).reverseOrEquals(this.bi, this.o), null);
  }
  
  public void testUnsupportedMetaClassMethodsXor() throws Throwable {    
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).xor((byte)1, (byte)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).xor((byte)1, (char)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).xor((byte)1, (short)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).xor((byte)1, 1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).xor((byte)1, (long)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).xor((byte)1, this.bi);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).xor((char)1, (byte)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).xor((char)1, (char)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).xor((char)1, (short)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).xor((char)1, 1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).xor((char)1, (long)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
   try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).xor((char)1, this.bi);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).xor((short)1, (byte)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).xor((short)1, (char)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).xor((short)1, (short)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).xor((short)1, 1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).xor((short)1, (long)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).xor((short)1, this.bi);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).xor(1, (byte)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).xor(1, (char)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).xor(1, (short)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).xor(1, 1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).xor(1, (long)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).xor(1, this.bi);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).xor((long)1, (byte)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).xor((long)1, (char)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).xor((long)1, (short)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).xor((long)1, 1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).xor((long)1, (long)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).xor((long)1, this.bi);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).xor(this.bi, (byte)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).xor(this.bi, (char)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).xor(this.bi, (short)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).xor(this.bi, 1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).xor(this.bi, (long)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).xor(this.bi, this.bi);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
  }
  
  public void testSupportedMetaClassMethodsXor() throws Throwable {    
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).xor(this.o, this.o), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).xor(this.o, (byte)1), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).xor(this.o, (char)1), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).xor(this.o, (short)1), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).xor(this.o, 1), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).xor(this.o, (long)1), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).xor(this.o, this.bi), null);
    
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).reverseXor((byte)1, this.o), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).reverseXor((char)1, this.o), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).reverseXor((short)1, this.o), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).reverseXor(1, this.o), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).reverseXor((long)1, this.o), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).reverseXor(this.bi, this.o), null);
  }
  
  public void testUnsupportedMetaClassMethodsXorEquals() throws Throwable {    
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).xorEquals((byte)1, (byte)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).xorEquals((byte)1, (char)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).xorEquals((byte)1, (short)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).xorEquals((byte)1, 1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).xorEquals((byte)1, (long)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).xorEquals((byte)1, this.bi);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).xorEquals((char)1, (byte)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).xorEquals((char)1, (char)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).xorEquals((char)1, (short)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).xorEquals((char)1, 1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).xorEquals((char)1, (long)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).xorEquals((char)1, this.bi);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).xorEquals((short)1, (byte)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).xorEquals((short)1, (char)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).xorEquals((short)1, (short)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).xorEquals((short)1, 1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).xorEquals((short)1, (long)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).xorEquals((short)1, this.bi);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).xorEquals(1, (byte)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).xorEquals(1, (char)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).xorEquals(1, (short)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).xorEquals(1, 1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).xorEquals(1, (long)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).xorEquals(1, this.bi);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).xorEquals((long)1, (byte)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).xorEquals((long)1, (char)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).xorEquals((long)1, (short)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).xorEquals((long)1, 1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).xorEquals((long)1, (long)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).xorEquals((long)1, this.bi);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).xorEquals(this.bi, (byte)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).xorEquals(this.bi, (char)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).xorEquals(this.bi, (short)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).xorEquals(this.bi, 1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).xorEquals(this.bi, (long)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).xorEquals(this.bi, this.bi);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
  }
  
  public void testSupportedMetaClassMethodsXorEquals() throws Throwable {    
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).xorEquals(this.o, this.o), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).xorEquals(this.o, (byte)1), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).xorEquals(this.o, (char)1), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).xorEquals(this.o, (short)1), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).xorEquals(this.o, 1), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).xorEquals(this.o, (long)1), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).xorEquals(this.o, this.bi), null);
    
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).reverseXorEquals((byte)1, this.o), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).reverseXorEquals((char)1, this.o), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).reverseXorEquals((short)1, this.o), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).reverseXorEquals(1, this.o), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).reverseXorEquals((long)1, this.o), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).reverseXorEquals(this.bi, this.o), null);
  }
  
  public void testUnsupportedMetaClassMethodsCompare() throws Throwable {    
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).compare((byte)1, (byte)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).compare((byte)1, (char)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).compare((byte)1, (short)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).compare((byte)1, 1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).compare((byte)1, (long)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).compare((byte)1, (float)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).compare((byte)1, (double)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).compare((byte)1, this.bi);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).compare((byte)1, this.bd);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).compare((char)1, (byte)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).compare((char)1, (char)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).compare((char)1, (short)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).compare((char)1, 1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).compare((char)1, (long)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).compare((char)1, (float)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).compare((char)1, (double)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).compare((char)1, this.bi);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).compare((char)1, this.bd);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).compare((short)1, (byte)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).compare((short)1, (char)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).compare((short)1, (short)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).compare((short)1, 1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).compare((short)1, (long)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).compare((short)1, (float)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).compare((short)1, (double)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).compare((short)1, this.bi);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).compare((short)1, this.bd);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).compare(1, (byte)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).compare(1, (char)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).compare(1, (short)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).compare(1, 1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).compare(1, (long)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).compare(1, (float)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).compare(1, (double)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).compare(1, this.bi);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).compare(1, this.bd);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).compare((long)1, (byte)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).compare((long)1, (char)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).compare((long)1, (short)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).compare((long)1, 1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).compare((long)1, (long)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).compare((long)1, (float)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).compare((long)1, (double)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).compare((long)1, this.bi);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).compare((long)1, this.bd);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).compare((float)1, (byte)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).compare((float)1, (char)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).compare((float)1, (short)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).compare((float)1, 1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).compare((float)1, (long)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).compare((float)1, (float)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).compare((float)1, (double)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).compare((float)1, this.bi);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).compare((float)1, this.bd);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).compare((double)1, (byte)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).compare((double)1, (char)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).compare((double)1, (short)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).compare((double)1, 1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).compare((double)1, (long)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).compare((double)1, (float)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).compare((double)1, (double)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).compare((double)1, this.bi);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).compare((double)1, this.bd);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).compare(this.bi, (byte)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).compare(this.bi, (char)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).compare(this.bi, (short)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).compare(this.bi, 1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).compare(this.bi, (long)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).compare(this.bi, (float)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).compare(this.bi, (double)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).compare(this.bi, this.bi);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).compare(this.bi, this.bd);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).compare(this.bd, (byte)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).compare(this.bd, (char)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).compare(this.bd, (short)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).compare(this.bd, 1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).compare(this.bd, (long)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).compare(this.bd, (float)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).compare(this.bd, (double)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).compare(this.bd, this.bi);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).compare(this.bd, this.bd);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
  }
  
  public void testSupportedMetaClassMethodsCompare() throws Throwable {    
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).compare(this.o, this.o), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).compare(this.o, (byte)1), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).compare(this.o, (char)1), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).compare(this.o, (short)1), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).compare(this.o, 1), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).compare(this.o, (long)1), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).compare(this.o, (float)1), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).compare(this.o, (double)1), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).compare(this.o, this.bi), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).compare(this.o, this.bd), null);
    
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).reverseCompare((byte)1, this.o), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).reverseCompare((char)1, this.o), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).reverseCompare((short)1, this.o), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).reverseCompare(1, this.o), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).reverseCompare((long)1, this.o), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).reverseCompare((float)1, this.o), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).reverseCompare((double)1, this.o), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).reverseCompare(this.bi, this.o), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).reverseCompare(this.bd, this.o), null);
  }
  
  public void testUnsupportedMetaClassMethodsEquals() throws Throwable {    
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).equals((byte)1, (byte)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).equals((byte)1, (char)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).equals((byte)1, (short)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).equals((byte)1, 1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).equals((byte)1, (long)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).equals((byte)1, (float)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).equals((byte)1, (double)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).equals((byte)1, this.bi);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).equals((byte)1, this.bd);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).equals((char)1, (byte)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).equals((char)1, (char)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).equals((char)1, (short)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).equals((char)1, 1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).equals((char)1, (long)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).equals((char)1, (float)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).equals((char)1, (double)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).equals((char)1, this.bi);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).equals((char)1, this.bd);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).equals((short)1, (byte)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).equals((short)1, (char)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).equals((short)1, (short)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).equals((short)1, 1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).equals((short)1, (long)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).equals((short)1, (float)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).equals((short)1, (double)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).equals((short)1, this.bi);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).equals((short)1, this.bd);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).equals(1, (byte)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).equals(1, (char)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).equals(1, (short)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).equals(1, 1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).equals(1, (long)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).equals(1, (float)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).equals(1, (double)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).equals(1, this.bi);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).equals(1, this.bd);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).equals((long)1, (byte)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).equals((long)1, (char)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).equals((long)1, (short)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).equals((long)1, 1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).equals((long)1, (long)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).equals((long)1, (float)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).equals((long)1, (double)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).equals((long)1, this.bi);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).equals((long)1, this.bd);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).equals((float)1, (byte)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).equals((float)1, (char)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).equals((float)1, (short)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).equals((float)1, 1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).equals((float)1, (long)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).equals((float)1, (float)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).equals((float)1, (double)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).equals((float)1, this.bi);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).equals((float)1, this.bd);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).equals((double)1, (byte)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).equals((double)1, (char)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).equals((double)1, (short)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).equals((double)1, 1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).equals((double)1, (long)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).equals((double)1, (float)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).equals((double)1, (double)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).equals((double)1, this.bi);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).equals((double)1, this.bd);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).equals(this.bi, (byte)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).equals(this.bi, (char)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).equals(this.bi, (short)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).equals(this.bi, 1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).equals(this.bi, (long)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).equals(this.bi, (float)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).equals(this.bi, (double)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).equals(this.bi, this.bi);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).equals(this.bi, this.bd);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).equals(this.bd, (byte)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).equals(this.bd, (char)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).equals(this.bd, (short)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).equals(this.bd, 1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).equals(this.bd, (long)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).equals(this.bd, (float)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).equals(this.bd, (double)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).equals(this.bd, this.bi);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).equals(this.bd, this.bd);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
  }
  
  public void testSupportedMetaClassMethodsEquals() throws Throwable {    
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).equals(this.o, this.o), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).equals(this.o, (byte)1), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).equals(this.o, (char)1), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).equals(this.o, (short)1), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).equals(this.o, 1), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).equals(this.o, (long)1), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).equals(this.o, (float)1), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).equals(this.o, (double)1), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).equals(this.o, this.bi), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).equals(this.o, this.bd), null);
    
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).reverseEquals((byte)1, this.o), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).reverseEquals((char)1, this.o), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).reverseEquals((short)1, this.o), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).reverseEquals(1, this.o), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).reverseEquals((long)1, this.o), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).reverseEquals((float)1, this.o), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).reverseEquals((double)1, this.o), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).reverseEquals(this.bi, this.o), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).reverseEquals(this.bd, this.o), null);
  }
 
  public void testUnsupportedMetaClassMethodsNotEquals() throws Throwable {    
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).notEquals((byte)1, (byte)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).notEquals((byte)1, (char)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).notEquals((byte)1, (short)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).notEquals((byte)1, 1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).notEquals((byte)1, (long)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).notEquals((byte)1, (float)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).notEquals((byte)1, (double)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).notEquals((byte)1, this.bi);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).notEquals((byte)1, this.bd);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).notEquals((char)1, (byte)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).notEquals((char)1, (char)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).notEquals((char)1, (short)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).notEquals((char)1, 1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).notEquals((char)1, (long)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).notEquals((char)1, (float)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).notEquals((char)1, (double)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).notEquals((char)1, this.bi);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).notEquals((char)1, this.bd);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).notEquals((short)1, (byte)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).notEquals((short)1, (char)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).notEquals((short)1, (short)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).notEquals((short)1, 1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).notEquals((short)1, (long)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).notEquals((short)1, (float)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).notEquals((short)1, (double)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).notEquals((short)1, this.bi);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).notEquals((short)1, this.bd);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).notEquals(1, (byte)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).notEquals(1, (char)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).notEquals(1, (short)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).notEquals(1, 1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).notEquals((int)1, (long)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).notEquals((int)1, (float)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).notEquals((int)1, (double)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).notEquals((int)1, this.bi);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).notEquals((int)1, this.bd);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).notEquals((long)1, (byte)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).notEquals((long)1, (char)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).notEquals((long)1, (short)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).notEquals((long)1, (int)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).notEquals((long)1, (long)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).notEquals((long)1, (float)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).notEquals((long)1, (double)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).notEquals((long)1, this.bi);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).notEquals((long)1, this.bd);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).notEquals((float)1, (byte)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).notEquals((float)1, (char)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).notEquals((float)1, (short)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).notEquals((float)1, (int)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).notEquals((float)1, (long)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).notEquals((float)1, (float)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).notEquals((float)1, (double)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).notEquals((float)1, this.bi);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).notEquals((float)1, this.bd);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).notEquals((double)1, (byte)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).notEquals((double)1, (char)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).notEquals((double)1, (short)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).notEquals((double)1, (int)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).notEquals((double)1, (long)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).notEquals((double)1, (float)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).notEquals((double)1, (double)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).notEquals((double)1, this.bi);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).notEquals((double)1, this.bd);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).notEquals(this.bi, (byte)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).notEquals(this.bi, (char)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).notEquals(this.bi, (short)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).notEquals(this.bi, (int)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).notEquals(this.bi, (long)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).notEquals(this.bi, (float)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).notEquals(this.bi, (double)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).notEquals(this.bi, this.bi);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).notEquals(this.bi, this.bd);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).notEquals(this.bd, (byte)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).notEquals(this.bd, (char)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).notEquals(this.bd, (short)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).notEquals(this.bd, (int)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).notEquals(this.bd, (long)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).notEquals(this.bd, (float)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).notEquals(this.bd, (double)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).notEquals(this.bd, this.bi);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).notEquals(this.bd, this.bd);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
  }
  
  public void testSupportedMetaClassMethodsNotEquals() throws Throwable {    
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).notEquals(this.o, this.o), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).notEquals(this.o, (byte)1), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).notEquals(this.o, (char)1), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).notEquals(this.o, (short)1), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).notEquals(this.o, (int)1), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).notEquals(this.o, (long)1), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).notEquals(this.o, (float)1), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).notEquals(this.o, (double)1), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).notEquals(this.o, this.bi), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).notEquals(this.o, this.bd), null);
    
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).reverseNotEquals((byte)1, this.o), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).reverseNotEquals((char)1, this.o), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).reverseNotEquals((short)1, this.o), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).reverseNotEquals((int)1, this.o), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).reverseNotEquals((long)1, this.o), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).reverseNotEquals((float)1, this.o), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).reverseNotEquals((double)1, this.o), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).reverseNotEquals(this.bi, this.o), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).reverseNotEquals(this.bd, this.o), null);
  }
 
  public void testUnsupportedMetaClassMethodsLessThan() throws Throwable {    
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).lessThan((byte)1, (byte)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).lessThan((byte)1, (char)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).lessThan((byte)1, (short)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).lessThan((byte)1, (int)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).lessThan((byte)1, (long)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).lessThan((byte)1, (float)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).lessThan((byte)1, (double)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).lessThan((byte)1, this.bi);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).lessThan((byte)1, this.bd);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).lessThan((char)1, (byte)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).lessThan((char)1, (char)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).lessThan((char)1, (short)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).lessThan((char)1, (int)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).lessThan((char)1, (long)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).lessThan((char)1, (float)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).lessThan((char)1, (double)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).lessThan((char)1, this.bi);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).lessThan((char)1, this.bd);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).lessThan((short)1, (byte)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).lessThan((short)1, (char)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).lessThan((short)1, (short)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).lessThan((short)1, (int)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).lessThan((short)1, (long)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).lessThan((short)1, (float)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).lessThan((short)1, (double)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).lessThan((short)1, this.bi);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).lessThan((short)1, this.bd);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).lessThan((int)1, (byte)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).lessThan((int)1, (char)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).lessThan((int)1, (short)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).lessThan((int)1, (int)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).lessThan((int)1, (long)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).lessThan((int)1, (float)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).lessThan((int)1, (double)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).lessThan((int)1, this.bi);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).lessThan((int)1, this.bd);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).lessThan((long)1, (byte)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).lessThan((long)1, (char)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).lessThan((long)1, (short)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).lessThan((long)1, (int)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).lessThan((long)1, (long)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).lessThan((long)1, (float)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).lessThan((long)1, (double)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).lessThan((long)1, this.bi);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).lessThan((long)1, this.bd);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).lessThan((float)1, (byte)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).lessThan((float)1, (char)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).lessThan((float)1, (short)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).lessThan((float)1, (int)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).lessThan((float)1, (long)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).lessThan((float)1, (float)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).lessThan((float)1, (double)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).lessThan((float)1, this.bi);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).lessThan((float)1, this.bd);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).lessThan((double)1, (byte)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).lessThan((double)1, (char)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).lessThan((double)1, (short)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).lessThan((double)1, (int)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).lessThan((double)1, (long)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).lessThan((double)1, (float)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).lessThan((double)1, (double)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).lessThan((double)1, this.bi);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).lessThan((double)1, this.bd);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).lessThan(this.bi, (byte)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).lessThan(this.bi, (char)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).lessThan(this.bi, (short)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).lessThan(this.bi, (int)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).lessThan(this.bi, (long)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).lessThan(this.bi, (float)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).lessThan(this.bi, (double)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).lessThan(this.bi, this.bi);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).lessThan(this.bi, this.bd);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).lessThan(this.bd, (byte)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).lessThan(this.bd, (char)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).lessThan(this.bd, (short)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).lessThan(this.bd, (int)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).lessThan(this.bd, (long)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).lessThan(this.bd, (float)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).lessThan(this.bd, (double)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).lessThan(this.bd, this.bi);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).lessThan(this.bd, this.bd);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
  }
  
  public void testSupportedMetaClassMethodsLessThan() throws Throwable {    
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).lessThan(this.o, this.o), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).lessThan(this.o, (byte)1), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).lessThan(this.o, (char)1), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).lessThan(this.o, (short)1), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).lessThan(this.o, (int)1), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).lessThan(this.o, (long)1), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).lessThan(this.o, (float)1), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).lessThan(this.o, (double)1), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).lessThan(this.o, this.bi), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).lessThan(this.o, this.bd), null);
    
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).reverseLessThan((byte)1, this.o), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).reverseLessThan((char)1, this.o), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).reverseLessThan((short)1, this.o), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).reverseLessThan((int)1, this.o), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).reverseLessThan((long)1, this.o), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).reverseLessThan((float)1, this.o), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).reverseLessThan((double)1, this.o), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).reverseLessThan(this.bi, this.o), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).reverseLessThan(this.bd, this.o), null);
  }
  
  public void testUnsupportedMetaClassMethodsGreaterThan() throws Throwable {    
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).greaterThan((byte)1, (byte)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).greaterThan((byte)1, (char)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).greaterThan((byte)1, (short)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).greaterThan((byte)1, (int)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).greaterThan((byte)1, (long)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).greaterThan((byte)1, (float)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).greaterThan((byte)1, (double)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).greaterThan((byte)1, this.bi);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).greaterThan((byte)1, this.bd);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).greaterThan((char)1, (byte)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).greaterThan((char)1, (char)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).greaterThan((char)1, (short)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).greaterThan((char)1, (int)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).greaterThan((char)1, (long)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).greaterThan((char)1, (float)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).greaterThan((char)1, (double)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).greaterThan((char)1, this.bi);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).greaterThan((char)1, this.bd);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).greaterThan((short)1, (byte)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).greaterThan((short)1, (char)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).greaterThan((short)1, (short)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).greaterThan((short)1, (int)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).greaterThan((short)1, (long)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).greaterThan((short)1, (float)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).greaterThan((short)1, (double)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).greaterThan((short)1, this.bi);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).greaterThan((short)1, this.bd);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).greaterThan((int)1, (byte)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).greaterThan((int)1, (char)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).greaterThan((int)1, (short)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).greaterThan((int)1, (int)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).greaterThan((int)1, (long)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).greaterThan((int)1, (float)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).greaterThan((int)1, (double)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).greaterThan((int)1, this.bi);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).greaterThan((int)1, this.bd);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).greaterThan((long)1, (byte)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).greaterThan((long)1, (char)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).greaterThan((long)1, (short)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).greaterThan((long)1, (int)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).greaterThan((long)1, (long)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).greaterThan((long)1, (float)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).greaterThan((long)1, (double)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).greaterThan((long)1, this.bi);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).greaterThan((long)1, this.bd);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).greaterThan((float)1, (byte)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).greaterThan((float)1, (char)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).greaterThan((float)1, (short)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).greaterThan((float)1, (int)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).greaterThan((float)1, (long)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).greaterThan((float)1, (float)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).greaterThan((float)1, (double)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).greaterThan((float)1, this.bi);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).greaterThan((float)1, this.bd);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).greaterThan((double)1, (byte)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).greaterThan((double)1, (char)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).greaterThan((double)1, (short)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).greaterThan((double)1, (int)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).greaterThan((double)1, (long)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).greaterThan((double)1, (float)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).greaterThan((double)1, (double)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).greaterThan((double)1, this.bi);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).greaterThan((double)1, this.bd);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).greaterThan(this.bi, (byte)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).greaterThan(this.bi, (char)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).greaterThan(this.bi, (short)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).greaterThan(this.bi, (int)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).greaterThan(this.bi, (long)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).greaterThan(this.bi, (float)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).greaterThan(this.bi, (double)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).greaterThan(this.bi, this.bi);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).greaterThan(this.bi, this.bd);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).greaterThan(this.bd, (byte)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).greaterThan(this.bd, (char)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).greaterThan(this.bd, (short)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).greaterThan(this.bd, (int)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).greaterThan(this.bd, (long)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).greaterThan(this.bd, (float)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).greaterThan(this.bd, (double)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).greaterThan(this.bd, this.bi);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).greaterThan(this.bd, this.bd);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
  }
  
  public void testSupportedMetaClassMethodsGreaterThan() throws Throwable {    
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).greaterThan(this.o, this.o), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).greaterThan(this.o, (byte)1), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).greaterThan(this.o, (char)1), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).greaterThan(this.o, (short)1), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).greaterThan(this.o, (int)1), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).greaterThan(this.o, (long)1), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).greaterThan(this.o, (float)1), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).greaterThan(this.o, (double)1), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).greaterThan(this.o, this.bi), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).greaterThan(this.o, this.bd), null);
    
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).reverseGreaterThan((byte)1, this.o), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).reverseGreaterThan((char)1, this.o), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).reverseGreaterThan((short)1, this.o), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).reverseGreaterThan((int)1, this.o), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).reverseGreaterThan((long)1, this.o), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).reverseGreaterThan((float)1, this.o), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).reverseGreaterThan((double)1, this.o), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).reverseGreaterThan(this.bi, this.o), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).reverseGreaterThan(this.bd, this.o), null);
  }
  
  public void testUnsupportedMetaClassMethodsLessThanOrEquals() throws Throwable {    
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).lessThanOrEquals((byte)1, (byte)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).lessThanOrEquals((byte)1, (char)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).lessThanOrEquals((byte)1, (short)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).lessThanOrEquals((byte)1, (int)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).lessThanOrEquals((byte)1, (long)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).lessThanOrEquals((byte)1, (float)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).lessThanOrEquals((byte)1, (double)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).lessThanOrEquals((byte)1, this.bi);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).lessThanOrEquals((byte)1, this.bd);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).lessThanOrEquals((char)1, (byte)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).lessThanOrEquals((char)1, (char)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).lessThanOrEquals((char)1, (short)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).lessThanOrEquals((char)1, (int)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).lessThanOrEquals((char)1, (long)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).lessThanOrEquals((char)1, (float)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).lessThanOrEquals((char)1, (double)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).lessThanOrEquals((char)1, this.bi);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).lessThanOrEquals((char)1, this.bd);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).lessThanOrEquals((short)1, (byte)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).lessThanOrEquals((short)1, (char)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).lessThanOrEquals((short)1, (short)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).lessThanOrEquals((short)1, (int)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).lessThanOrEquals((short)1, (long)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).lessThanOrEquals((short)1, (float)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).lessThanOrEquals((short)1, (double)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).lessThanOrEquals((short)1, this.bi);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).lessThanOrEquals((short)1, this.bd);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).lessThanOrEquals((int)1, (byte)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).lessThanOrEquals((int)1, (char)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).lessThanOrEquals((int)1, (short)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).lessThanOrEquals((int)1, (int)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).lessThanOrEquals((int)1, (long)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).lessThanOrEquals((int)1, (float)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).lessThanOrEquals((int)1, (double)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).lessThanOrEquals((int)1, this.bi);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).lessThanOrEquals((int)1, this.bd);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).lessThanOrEquals((long)1, (byte)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).lessThanOrEquals((long)1, (char)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).lessThanOrEquals((long)1, (short)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).lessThanOrEquals((long)1, (int)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).lessThanOrEquals((long)1, (long)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).lessThanOrEquals((long)1, (float)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).lessThanOrEquals((long)1, (double)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).lessThanOrEquals((long)1, this.bi);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).lessThanOrEquals((long)1, this.bd);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).lessThanOrEquals((float)1, (byte)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).lessThanOrEquals((float)1, (char)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).lessThanOrEquals((float)1, (short)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).lessThanOrEquals((float)1, (int)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).lessThanOrEquals((float)1, (long)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).lessThanOrEquals((float)1, (float)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).lessThanOrEquals((float)1, (double)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).lessThanOrEquals((float)1, this.bi);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).lessThanOrEquals((float)1, this.bd);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).lessThanOrEquals((double)1, (byte)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).lessThanOrEquals((double)1, (char)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).lessThanOrEquals((double)1, (short)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).lessThanOrEquals((double)1, (int)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).lessThanOrEquals((double)1, (long)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).lessThanOrEquals((double)1, (float)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).lessThanOrEquals((double)1, (double)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).lessThanOrEquals((double)1, this.bi);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).lessThanOrEquals((double)1, this.bd);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).lessThanOrEquals(this.bi, (byte)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).lessThanOrEquals(this.bi, (char)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).lessThanOrEquals(this.bi, (short)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).lessThanOrEquals(this.bi, (int)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).lessThanOrEquals(this.bi, (long)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).lessThanOrEquals(this.bi, (float)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).lessThanOrEquals(this.bi, (double)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).lessThanOrEquals(this.bi, this.bi);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).lessThanOrEquals(this.bi, this.bd);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).lessThanOrEquals(this.bd, (byte)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).lessThanOrEquals(this.bd, (char)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).lessThanOrEquals(this.bd, (short)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).lessThanOrEquals(this.bd, (int)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).lessThanOrEquals(this.bd, (long)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).lessThanOrEquals(this.bd, (float)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).lessThanOrEquals(this.bd, (double)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).lessThanOrEquals(this.bd, this.bi);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).lessThanOrEquals(this.bd, this.bd);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
  }
  
  public void testSupportedMetaClassMethodsLessThanOrEquals() throws Throwable {    
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).lessThanOrEquals(this.o, this.o), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).lessThanOrEquals(this.o, (byte)1), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).lessThanOrEquals(this.o, (char)1), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).lessThanOrEquals(this.o, (short)1), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).lessThanOrEquals(this.o, (int)1), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).lessThanOrEquals(this.o, (long)1), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).lessThanOrEquals(this.o, (float)1), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).lessThanOrEquals(this.o, (double)1), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).lessThanOrEquals(this.o, this.bi), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).lessThanOrEquals(this.o, this.bd), null);
    
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).reverseLessThanOrEquals((byte)1, this.o), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).reverseLessThanOrEquals((char)1, this.o), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).reverseLessThanOrEquals((short)1, this.o), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).reverseLessThanOrEquals((int)1, this.o), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).reverseLessThanOrEquals((long)1, this.o), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).reverseLessThanOrEquals((float)1, this.o), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).reverseLessThanOrEquals((double)1, this.o), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).reverseLessThanOrEquals(this.bi, this.o), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).reverseLessThanOrEquals(this.bd, this.o), null);
  }

  public void testUnsupportedMetaClassMethodsGreaterThanOrEquals() throws Throwable {    
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).greaterThanOrEquals((byte)1, (byte)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).greaterThanOrEquals((byte)1, (char)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).greaterThanOrEquals((byte)1, (short)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).greaterThanOrEquals((byte)1, (int)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).greaterThanOrEquals((byte)1, (long)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).greaterThanOrEquals((byte)1, (float)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).greaterThanOrEquals((byte)1, (double)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).greaterThanOrEquals((byte)1, this.bi);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).greaterThanOrEquals((byte)1, this.bd);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).greaterThanOrEquals((char)1, (byte)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).greaterThanOrEquals((char)1, (char)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).greaterThanOrEquals((char)1, (short)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).greaterThanOrEquals((char)1, (int)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).greaterThanOrEquals((char)1, (long)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).greaterThanOrEquals((char)1, (float)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).greaterThanOrEquals((char)1, (double)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).greaterThanOrEquals((char)1, this.bi);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).greaterThanOrEquals((char)1, this.bd);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).greaterThanOrEquals((short)1, (byte)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).greaterThanOrEquals((short)1, (char)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).greaterThanOrEquals((short)1, (short)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).greaterThanOrEquals((short)1, (int)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).greaterThanOrEquals((short)1, (long)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).greaterThanOrEquals((short)1, (float)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).greaterThanOrEquals((short)1, (double)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).greaterThanOrEquals((short)1, this.bi);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).greaterThanOrEquals((short)1, this.bd);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).greaterThanOrEquals((int)1, (byte)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).greaterThanOrEquals((int)1, (char)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).greaterThanOrEquals((int)1, (short)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).greaterThanOrEquals((int)1, (int)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).greaterThanOrEquals((int)1, (long)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).greaterThanOrEquals((int)1, (float)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).greaterThanOrEquals((int)1, (double)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).greaterThanOrEquals((int)1, this.bi);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).greaterThanOrEquals((int)1, this.bd);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).greaterThanOrEquals((long)1, (byte)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).greaterThanOrEquals((long)1, (char)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).greaterThanOrEquals((long)1, (short)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).greaterThanOrEquals((long)1, (int)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).greaterThanOrEquals((long)1, (long)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).greaterThanOrEquals((long)1, (float)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).greaterThanOrEquals((long)1, (double)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).greaterThanOrEquals((long)1, this.bi);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).greaterThanOrEquals((long)1, this.bd);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).greaterThanOrEquals((float)1, (byte)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).greaterThanOrEquals((float)1, (char)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).greaterThanOrEquals((float)1, (short)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).greaterThanOrEquals((float)1, (int)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).greaterThanOrEquals((float)1, (long)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).greaterThanOrEquals((float)1, (float)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).greaterThanOrEquals((float)1, (double)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).greaterThanOrEquals((float)1, this.bi);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).greaterThanOrEquals((float)1, this.bd);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).greaterThanOrEquals((double)1, (byte)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).greaterThanOrEquals((double)1, (char)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).greaterThanOrEquals((double)1, (short)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).greaterThanOrEquals((double)1, (int)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).greaterThanOrEquals((double)1, (long)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).greaterThanOrEquals((double)1, (float)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).greaterThanOrEquals((double)1, (double)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).greaterThanOrEquals((double)1, this.bi);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).greaterThanOrEquals((double)1, this.bd);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).greaterThanOrEquals(this.bi, (byte)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).greaterThanOrEquals(this.bi, (char)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).greaterThanOrEquals(this.bi, (short)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).greaterThanOrEquals(this.bi, (int)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).greaterThanOrEquals(this.bi, (long)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).greaterThanOrEquals(this.bi, (float)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).greaterThanOrEquals(this.bi, (double)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).greaterThanOrEquals(this.bi, this.bi);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).greaterThanOrEquals(this.bi, this.bd);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).greaterThanOrEquals(this.bd, (byte)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).greaterThanOrEquals(this.bd, (char)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).greaterThanOrEquals(this.bd, (short)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).greaterThanOrEquals(this.bd, (int)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).greaterThanOrEquals(this.bd, (long)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).greaterThanOrEquals(this.bd, (float)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).greaterThanOrEquals(this.bd, (double)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).greaterThanOrEquals(this.bd, this.bi);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).greaterThanOrEquals(this.bd, this.bd);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
  }
  
  public void testSupportedMetaClassMethodsGreaterThanOrEquals() throws Throwable {    
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).greaterThanOrEquals(this.o, this.o), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).greaterThanOrEquals(this.o, (byte)1), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).greaterThanOrEquals(this.o, (char)1), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).greaterThanOrEquals(this.o, (short)1), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).greaterThanOrEquals(this.o, (int)1), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).greaterThanOrEquals(this.o, (long)1), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).greaterThanOrEquals(this.o, (float)1), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).greaterThanOrEquals(this.o, (double)1), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).greaterThanOrEquals(this.o, this.bi), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).greaterThanOrEquals(this.o, this.bd), null);
    
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).reverseGreaterThanOrEquals((byte)1, this.o), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).reverseGreaterThanOrEquals((char)1, this.o), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).reverseGreaterThanOrEquals((short)1, this.o), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).reverseGreaterThanOrEquals((int)1, this.o), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).reverseGreaterThanOrEquals((long)1, this.o), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).reverseGreaterThanOrEquals((float)1, this.o), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).reverseGreaterThanOrEquals((double)1, this.o), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).reverseGreaterThanOrEquals(this.bi, this.o), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).reverseGreaterThanOrEquals(this.bd, this.o), null);
  }
  
  public void testUnsupportedMetaClassMethodsLeftShift() throws Throwable {    
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).leftShift((byte)1, (byte)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).leftShift((byte)1, (char)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).leftShift((byte)1, (short)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).leftShift((byte)1, (int)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).leftShift((byte)1, (long)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).leftShift((byte)1, this.bi);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).leftShift((char)1, (byte)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).leftShift((char)1, (char)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).leftShift((char)1, (short)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).leftShift((char)1, (int)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).leftShift((char)1, (long)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
   try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).leftShift((char)1, this.bi);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).leftShift((short)1, (byte)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).leftShift((short)1, (char)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).leftShift((short)1, (short)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).leftShift((short)1, (int)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).leftShift((short)1, (long)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).leftShift((short)1, this.bi);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).leftShift((int)1, (byte)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).leftShift((int)1, (char)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).leftShift((int)1, (short)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).leftShift((int)1, (int)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).leftShift((int)1, (long)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).leftShift((int)1, this.bi);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).leftShift((long)1, (byte)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).leftShift((long)1, (char)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).leftShift((long)1, (short)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).leftShift((long)1, (int)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).leftShift((long)1, (long)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).leftShift((long)1, this.bi);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).leftShift(this.bi, (byte)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).leftShift(this.bi, (char)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).leftShift(this.bi, (short)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).leftShift(this.bi, (int)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).leftShift(this.bi, (long)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).leftShift(this.bi, this.bi);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
  }
  
  public void testSupportedMetaClassMethodsLeftShift() throws Throwable {    
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).leftShift(this.o, this.o), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).leftShift(this.o, (byte)1), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).leftShift(this.o, (char)1), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).leftShift(this.o, (short)1), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).leftShift(this.o, (int)1), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).leftShift(this.o, (long)1), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).leftShift(this.o, this.bi), null);
    
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).reverseLeftShift((byte)1, this.o), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).reverseLeftShift((char)1, this.o), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).reverseLeftShift((short)1, this.o), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).reverseLeftShift((int)1, this.o), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).reverseLeftShift((long)1, this.o), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).reverseLeftShift(this.bi, this.o), null);
  }
  
  public void testUnsupportedMetaClassMethodsLeftShiftEquals() throws Throwable {    
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).leftShiftEquals((byte)1, (byte)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).leftShiftEquals((byte)1, (char)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).leftShiftEquals((byte)1, (short)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).leftShiftEquals((byte)1, (int)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).leftShiftEquals((byte)1, (long)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).leftShiftEquals((byte)1, this.bi);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).leftShiftEquals((char)1, (byte)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).leftShiftEquals((char)1, (char)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).leftShiftEquals((char)1, (short)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).leftShiftEquals((char)1, (int)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).leftShiftEquals((char)1, (long)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
   try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).leftShiftEquals((char)1, this.bi);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).leftShiftEquals((short)1, (byte)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).leftShiftEquals((short)1, (char)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).leftShiftEquals((short)1, (short)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).leftShiftEquals((short)1, (int)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).leftShiftEquals((short)1, (long)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).leftShiftEquals((short)1, this.bi);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).leftShiftEquals((int)1, (byte)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).leftShiftEquals((int)1, (char)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).leftShiftEquals((int)1, (short)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).leftShiftEquals((int)1, (int)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).leftShiftEquals((int)1, (long)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).leftShiftEquals((int)1, this.bi);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).leftShiftEquals((long)1, (byte)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).leftShiftEquals((long)1, (char)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).leftShiftEquals((long)1, (short)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).leftShiftEquals((long)1, (int)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).leftShiftEquals((long)1, (long)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).leftShiftEquals((long)1, this.bi);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).leftShiftEquals(this.bi, (byte)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).leftShiftEquals(this.bi, (char)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).leftShiftEquals(this.bi, (short)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).leftShiftEquals(this.bi, (int)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).leftShiftEquals(this.bi, (long)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).leftShiftEquals(this.bi, this.bi);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
  }
  
  public void testSupportedMetaClassMethodsLeftShiftEquals() throws Throwable {    
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).leftShiftEquals(this.o, this.o), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).leftShiftEquals(this.o, (byte)1), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).leftShiftEquals(this.o, (char)1), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).leftShiftEquals(this.o, (short)1), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).leftShiftEquals(this.o, (int)1), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).leftShiftEquals(this.o, (long)1), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).leftShiftEquals(this.o, this.bi), null);
    
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).reverseLeftShiftEquals((byte)1, this.o), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).reverseLeftShiftEquals((char)1, this.o), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).reverseLeftShiftEquals((short)1, this.o), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).reverseLeftShiftEquals((int)1, this.o), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).reverseLeftShiftEquals((long)1, this.o), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).reverseLeftShiftEquals(this.bi, this.o), null);
  }
  
  public void testUnsupportedMetaClassMethodsLogicalRightShift() throws Throwable {    
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).logicalRightShift((byte)1, (byte)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).logicalRightShift((byte)1, (char)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).logicalRightShift((byte)1, (short)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).logicalRightShift((byte)1, (int)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).logicalRightShift((byte)1, (long)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).logicalRightShift((byte)1, this.bi);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).logicalRightShift((char)1, (byte)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).logicalRightShift((char)1, (char)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).logicalRightShift((char)1, (short)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).logicalRightShift((char)1, (int)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).logicalRightShift((char)1, (long)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
   try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).logicalRightShift((char)1, this.bi);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).logicalRightShift((short)1, (byte)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).logicalRightShift((short)1, (char)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).logicalRightShift((short)1, (short)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).logicalRightShift((short)1, (int)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).logicalRightShift((short)1, (long)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).logicalRightShift((short)1, this.bi);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).logicalRightShift((int)1, (byte)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).logicalRightShift((int)1, (char)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).logicalRightShift((int)1, (short)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).logicalRightShift((int)1, (int)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).logicalRightShift((int)1, (long)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).logicalRightShift((int)1, this.bi);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).logicalRightShift((long)1, (byte)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).logicalRightShift((long)1, (char)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).logicalRightShift((long)1, (short)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).logicalRightShift((long)1, (int)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).logicalRightShift((long)1, (long)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).logicalRightShift((long)1, this.bi);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
  }
  
  public void testSupportedMetaClassMethodsLogicalRightShift() throws Throwable {    
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).logicalRightShift(this.o, this.o), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).logicalRightShift(this.o, (byte)1), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).logicalRightShift(this.o, (char)1), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).logicalRightShift(this.o, (short)1), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).logicalRightShift(this.o, (int)1), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).logicalRightShift(this.o, (long)1), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).logicalRightShift(this.o, this.bi), null);
    
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).reverseLogicalRightShift((byte)1, this.o), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).reverseLogicalRightShift((char)1, this.o), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).reverseLogicalRightShift((short)1, this.o), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).reverseLogicalRightShift((int)1, this.o), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).reverseLogicalRightShift((long)1, this.o), null);
  }
  
  public void testUnsupportedMetaClassMethodsLogicalRightShiftEquals() throws Throwable {    
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).logicalRightShiftEquals((byte)1, (byte)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).logicalRightShiftEquals((byte)1, (char)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).logicalRightShiftEquals((byte)1, (short)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).logicalRightShiftEquals((byte)1, (int)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).logicalRightShiftEquals((byte)1, (long)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).logicalRightShiftEquals((byte)1, this.bi);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).logicalRightShiftEquals((char)1, (byte)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).logicalRightShiftEquals((char)1, (char)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).logicalRightShiftEquals((char)1, (short)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).logicalRightShiftEquals((char)1, (int)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).logicalRightShiftEquals((char)1, (long)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
   try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).logicalRightShiftEquals((char)1, this.bi);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).logicalRightShiftEquals((short)1, (byte)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).logicalRightShiftEquals((short)1, (char)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).logicalRightShiftEquals((short)1, (short)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).logicalRightShiftEquals((short)1, (int)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).logicalRightShiftEquals((short)1, (long)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).logicalRightShiftEquals((short)1, this.bi);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).logicalRightShiftEquals((int)1, (byte)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).logicalRightShiftEquals((int)1, (char)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).logicalRightShiftEquals((int)1, (short)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).logicalRightShiftEquals((int)1, (int)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).logicalRightShiftEquals((int)1, (long)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).logicalRightShiftEquals((int)1, this.bi);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).logicalRightShiftEquals((long)1, (byte)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).logicalRightShiftEquals((long)1, (char)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).logicalRightShiftEquals((long)1, (short)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).logicalRightShiftEquals((long)1, (int)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).logicalRightShiftEquals((long)1, (long)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).logicalRightShiftEquals((long)1, this.bi);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
  }
  
  public void testSupportedMetaClassMethodsLogicalRightShiftEquals() throws Throwable {    
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).logicalRightShiftEquals(this.o, this.o), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).logicalRightShiftEquals(this.o, (byte)1), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).logicalRightShiftEquals(this.o, (char)1), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).logicalRightShiftEquals(this.o, (short)1), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).logicalRightShiftEquals(this.o, (int)1), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).logicalRightShiftEquals(this.o, (long)1), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).logicalRightShiftEquals(this.o, this.bi), null);
    
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).reverseLogicalRightShiftEquals((byte)1, this.o), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).reverseLogicalRightShiftEquals((char)1, this.o), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).reverseLogicalRightShiftEquals((short)1, this.o), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).reverseLogicalRightShiftEquals((int)1, this.o), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).reverseLogicalRightShiftEquals((long)1, this.o), null);
  }
  
  public void testUnsupportedMetaClassMethodsArithmeticRightShift() throws Throwable {    
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).arithmeticRightShift((byte)1, (byte)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).arithmeticRightShift((byte)1, (char)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).arithmeticRightShift((byte)1, (short)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).arithmeticRightShift((byte)1, (int)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).arithmeticRightShift((byte)1, (long)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).arithmeticRightShift((byte)1, this.bi);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).arithmeticRightShift((char)1, (byte)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).arithmeticRightShift((char)1, (char)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).arithmeticRightShift((char)1, (short)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).arithmeticRightShift((char)1, (int)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).arithmeticRightShift((char)1, (long)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
   try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).arithmeticRightShift((char)1, this.bi);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).arithmeticRightShift((short)1, (byte)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).arithmeticRightShift((short)1, (char)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).arithmeticRightShift((short)1, (short)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).arithmeticRightShift((short)1, (int)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).arithmeticRightShift((short)1, (long)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).arithmeticRightShift((short)1, this.bi);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).arithmeticRightShift((int)1, (byte)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).arithmeticRightShift((int)1, (char)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).arithmeticRightShift((int)1, (short)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).arithmeticRightShift((int)1, (int)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).arithmeticRightShift((int)1, (long)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).arithmeticRightShift((int)1, this.bi);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).arithmeticRightShift((long)1, (byte)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).arithmeticRightShift((long)1, (char)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).arithmeticRightShift((long)1, (short)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).arithmeticRightShift((long)1, (int)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).arithmeticRightShift((long)1, (long)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).arithmeticRightShift((long)1, this.bi);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).arithmeticRightShift(this.bi, (byte)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).arithmeticRightShift(this.bi, (char)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).arithmeticRightShift(this.bi, (short)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).arithmeticRightShift(this.bi, (int)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).arithmeticRightShift(this.bi, (long)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).arithmeticRightShift(this.bi, this.bi);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
  }
  
  public void testSupportedMetaClassMethodsArithmeticRightShift() throws Throwable {    
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).arithmeticRightShift(this.o, this.o), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).arithmeticRightShift(this.o, (byte)1), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).arithmeticRightShift(this.o, (char)1), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).arithmeticRightShift(this.o, (short)1), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).arithmeticRightShift(this.o, (int)1), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).arithmeticRightShift(this.o, (long)1), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).arithmeticRightShift(this.o, this.bi), null);
    
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).reverseArithmeticRightShift((byte)1, this.o), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).reverseArithmeticRightShift((char)1, this.o), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).reverseArithmeticRightShift((short)1, this.o), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).reverseArithmeticRightShift((int)1, this.o), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).reverseArithmeticRightShift((long)1, this.o), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).reverseArithmeticRightShift(this.bi, this.o), null);
  }
  
  public void testUnsupportedMetaClassMethodsArithmeticRightShiftEquals() throws Throwable {    
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).arithmeticRightShiftEquals((byte)1, (byte)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).arithmeticRightShiftEquals((byte)1, (char)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).arithmeticRightShiftEquals((byte)1, (short)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).arithmeticRightShiftEquals((byte)1, (int)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).arithmeticRightShiftEquals((byte)1, (long)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).arithmeticRightShiftEquals((byte)1, this.bi);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).arithmeticRightShiftEquals((char)1, (byte)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).arithmeticRightShiftEquals((char)1, (char)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).arithmeticRightShiftEquals((char)1, (short)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).arithmeticRightShiftEquals((char)1, (int)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).arithmeticRightShiftEquals((char)1, (long)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
   try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).arithmeticRightShiftEquals((char)1, this.bi);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).arithmeticRightShiftEquals((short)1, (byte)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).arithmeticRightShiftEquals((short)1, (char)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).arithmeticRightShiftEquals((short)1, (short)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).arithmeticRightShiftEquals((short)1, (int)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).arithmeticRightShiftEquals((short)1, (long)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).arithmeticRightShiftEquals((short)1, this.bi);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).arithmeticRightShiftEquals((int)1, (byte)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).arithmeticRightShiftEquals((int)1, (char)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).arithmeticRightShiftEquals((int)1, (short)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).arithmeticRightShiftEquals((int)1, (int)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).arithmeticRightShiftEquals((int)1, (long)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).arithmeticRightShiftEquals((int)1, this.bi);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).arithmeticRightShiftEquals((long)1, (byte)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).arithmeticRightShiftEquals((long)1, (char)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).arithmeticRightShiftEquals((long)1, (short)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).arithmeticRightShiftEquals((long)1, (int)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).arithmeticRightShiftEquals((long)1, (long)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).arithmeticRightShiftEquals((long)1, this.bi);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).arithmeticRightShiftEquals(this.bi, (byte)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).arithmeticRightShiftEquals(this.bi, (char)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).arithmeticRightShiftEquals(this.bi, (short)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).arithmeticRightShiftEquals(this.bi, (int)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).arithmeticRightShiftEquals(this.bi, (long)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).arithmeticRightShiftEquals(this.bi, this.bi);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
  }
  
  public void testSupportedMetaClassMethodsArithmeticRightShiftEquals() throws Throwable {    
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).arithmeticRightShiftEquals(this.o, this.o), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).arithmeticRightShiftEquals(this.o, (byte)1), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).arithmeticRightShiftEquals(this.o, (char)1), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).arithmeticRightShiftEquals(this.o, (short)1), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).arithmeticRightShiftEquals(this.o, (int)1), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).arithmeticRightShiftEquals(this.o, (long)1), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).arithmeticRightShiftEquals(this.o, this.bi), null);
    
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).reverseArithmeticRightShiftEquals((byte)1, this.o), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).reverseArithmeticRightShiftEquals((char)1, this.o), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).reverseArithmeticRightShiftEquals((short)1, this.o), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).reverseArithmeticRightShiftEquals((int)1, this.o), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).reverseArithmeticRightShiftEquals((long)1, this.o), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).reverseArithmeticRightShiftEquals(this.bi, this.o), null);
  }

  public void testUnsupportedMetaClassUnaryOperators() throws Throwable {
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).not(true);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).complement((int)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).complement((long)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).complement(this.bi);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}   
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).unaryPlus((int)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}   
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).unaryPlus((long)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}   
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).unaryPlus((float)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}   
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).unaryPlus((double)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}   
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).unaryPlus(this.bi);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}   
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).unaryPlus(this.bd);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}   
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).unaryMinus((int)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}   
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).unaryMinus((long)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}   
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).unaryMinus((float)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}   
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).unaryMinus((double)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}   
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).unaryMinus(this.bi);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}   
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).unaryMinus(this.bd);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}   
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).prefixIncrement((int)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}   
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).prefixIncrement((long)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}   
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).prefixIncrement((float)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}   
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).prefixIncrement((double)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}   
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).prefixIncrement(this.bi);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}   
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).prefixIncrement(this.bd);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}   
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).prefixDecrement((int)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}   
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).prefixDecrement((long)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}   
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).prefixDecrement((float)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}   
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).prefixDecrement((double)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}   
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).prefixDecrement(this.bi);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}   
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).prefixDecrement(this.bd);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}   
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).postfixIncrement((int)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}   
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).postfixIncrement((long)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}   
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).postfixIncrement((float)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}   
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).postfixIncrement((double)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}   
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).postfixIncrement(this.bi);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}   
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).postfixIncrement(this.bd);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}   
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).postfixDecrement((int)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}   
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).postfixDecrement((long)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}   
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).postfixDecrement((float)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}   
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).postfixDecrement((double)1);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}   
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).postfixDecrement(this.bi);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}   
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).postfixDecrement(this.bd);
      assertTrue(false);
    } catch(final NgRuntimeException e) {}   
  }

  public void testSupportedMetaClassUnaryOperators() throws Throwable {
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).not(this.o), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).unaryMinus(this.o), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).unaryPlus(this.o), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).complement(this.o), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).postfixIncrement(this.o), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).postfixDecrement(this.o), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).prefixIncrement(this.o), null);
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).prefixDecrement(this.o), null);    
  }
  
  public void testSupportedMetaClassMiscMethods() throws Throwable {
    final ThreadContext tc = NgSystem.metaClassRegistry.getThreadContext();

    assertEquals(tc.call(this.o, new Object[]{}), null);
    assertEquals(tc.callQuick(this.o), null);
    assertEquals(tc.callQuick(this.o, this.o), null);
    assertEquals(tc.callQuick(this.o, null, null), null);
    assertEquals(tc.callQuick(this.o, null, null, null), null);
    assertEquals(tc.callQuick(this.o, null, null, null, null), null);
 
    assertEquals(tc.invokeMethod(this.o, "test", new Object[]{}), null);
    assertEquals(tc.invokeMethodQuick(this.o, "test"), null);
    assertEquals(tc.invokeMethodQuick(this.o, "test", this.o), null);
    assertEquals(tc.invokeMethodQuick(this.o, "test", null, null), null);
    assertEquals(tc.invokeMethodQuick(this.o, "test", null, null, null), null);
    assertEquals(tc.invokeMethodQuick(this.o, "test", null, null, null, null), null);
 
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).invokeConstructor(this.o.getClass(), new Object[]{}), null);

    assertEquals(tc.getProperty(this.o, "test"), null);
    assertEquals(tc.setProperty(this.o, "test", null), null);

    assertEquals(tc.getField(this.o, "test"), null);
    assertEquals(tc.setField(this.o, "test", null), null);
  
    assertEquals(tc.getAt(this.o, this.o), null);
    assertEquals(tc.getAt(this.o, 1), null);
    assertEquals(tc.getAt(this.o, this.bi), null);
    assertEquals(tc.putAt(this.o, this.o), null);
    assertEquals(tc.putAt(this.o, 1), null);
    assertEquals(tc.putAt(this.o, this.bi), null);
    
    assertEquals(NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).getInternalMetaClass().getClass(), CustomInternalMetaClass.class);
    
    assertEquals(tc.getTheClass(this.o), Object.class);
    
    assertEquals(tc.isCase(this.o, null), null);
    
    assertEquals(tc.isInstanceof(this.o, this.o.getClass()), null);
    
    assertEquals(tc.asType(this.o, this.o.getClass()), null);
    
    NgSystem.metaClassRegistry.getRuntimeMetaClass(this.o).setInternalMetaClass(null);
  }
}
