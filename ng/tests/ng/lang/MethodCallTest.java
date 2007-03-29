package ng.lang;

import junit.framework.TestCase;
/*
 * Created on 29 Mar 2007
 *
 * Copyright 2007 John G. Wilson
 *
 *   Licensed under the Apache License, Version 2.0 (the "License");
 *   you may not use this file except in compliance with the License.
 *   You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 *   Unless required by applicable law or agreed to in writing, software
 *   distributed under the License is distributed on an "AS IS" BASIS,
 *   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *   See the License for the specific language governing permissions and
 *   limitations under the License.
 *
 */

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