package ng.lang;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.HashMap;

import junit.framework.TestCase;

import ng.runtime.NgTyped;



/**
 * @author tug
 *
 */
public class TypedTest extends TestCase {
  final BigInteger bi = BigInteger.valueOf(1);
  final BigDecimal bd = new BigDecimal(1);
  final Object o = new NgTyped(new HashMap(), Object.class);
  
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
  
  public void testUnsupportedMetaClassMethodsIntegerDivide() {    
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
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).integerDivide((byte)1, bi);
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
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).integerDivide((char)1, bi);
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
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).integerDivide((short)1, bi);
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
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).integerDivide((int)1, bi);
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
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).integerDivide((long)1, bi);
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
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).integerDivide(bi, bi);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
  }
  
  public void testUnsupportedMetaClassMethodsIntegerDivideEquals() {    
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
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).integerDivideEquals((byte)1, bi);
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
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).integerDivideEquals((char)1, bi);
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
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).integerDivideEquals((short)1, bi);
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
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).integerDivideEquals((int)1, bi);
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
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).integerDivideEquals((long)1, bi);
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
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).integerDivideEquals(bi, bi);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
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
    
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).logicalRightShift(bi, (byte)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).logicalRightShift(bi, (char)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).logicalRightShift(bi, (short)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).logicalRightShift(bi, (int)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).logicalRightShift(bi, (long)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).logicalRightShift(bi, bi);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
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
    
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).logicalRightShiftEquals(bi, (byte)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).logicalRightShiftEquals(bi, (char)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).logicalRightShiftEquals(bi, (short)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).logicalRightShiftEquals(bi, (int)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).logicalRightShiftEquals(bi, (long)1);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
    try {
      NgSystem.metaClassRegistry.getRuntimeMetaClass(o).logicalRightShiftEquals(bi, bi);
      assertTrue(false);
    } catch(NgRuntimeException e) {}
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
}
