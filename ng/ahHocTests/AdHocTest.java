import ng.lang.NgSystem;
import ng.runtime.NgByte;
import ng.runtime.NgChar;
import ng.runtime.NgInt;
import ng.runtime.NgLong;
import ng.runtime.NgShort;
import ng.runtime.NgTyped;

/*
 * Created on 2 Apr 2007
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
public class AdHocTest {


  public static void main(String[] args) {
    final Object t = new T();
    final Object t1 = new T1();
    final Object t2 = new T2();
    final Object t2TypedAsT1 = new NgTyped(t2, T1.class);
    final Object t1TypedAsT = new NgTyped(t1, T.class);
    final Object int1 = new NgInt(1);
    
    System.out.println(((NgInt)NgSystem.metaClassRegistry.getRuntimeMetaClass(t).add(t, new NgInt(1))).getIntValue());
    System.out.println(((NgInt)NgSystem.metaClassRegistry.getRuntimeMetaClass(t1).add(t1, new NgInt(1))).getIntValue());
    System.out.println(((NgInt)NgSystem.metaClassRegistry.getRuntimeMetaClass(int1).add(int1, t)).getIntValue());
    System.out.println(((NgInt)NgSystem.metaClassRegistry.getRuntimeMetaClass(int1).add(int1, t1)).getIntValue());
    
    System.out.println(((NgInt)NgSystem.metaClassRegistry.getRuntimeMetaClass(t).addEquals(t, new NgInt(1))).getIntValue());
    System.out.println(((NgInt)NgSystem.metaClassRegistry.getRuntimeMetaClass(t1).addEquals(t1, new NgInt(1))).getIntValue());
    System.out.println(((NgInt)NgSystem.metaClassRegistry.getRuntimeMetaClass(int1).addEquals(int1, t)).getIntValue());
    System.out.println(((NgInt)NgSystem.metaClassRegistry.getRuntimeMetaClass(int1).addEquals(int1, t1)).getIntValue());
    
    System.out.println(((NgInt)NgSystem.metaClassRegistry.getRuntimeMetaClass(t).invokeMethodQuick(t, "foo")).getIntValue());
    
    System.out.println(((NgInt)NgSystem.metaClassRegistry.getRuntimeMetaClass(t1).invokeMethodQuick((I)t1, "foo")).getIntValue());
    
    System.out.println(((NgInt)NgSystem.metaClassRegistry.getRuntimeMetaClass(t2TypedAsT1).invokeMethodQuick(t2TypedAsT1, "foo")).getIntValue());
    
    System.out.println(((NgInt)NgSystem.metaClassRegistry.getRuntimeMetaClass(t1TypedAsT).invokeMethodQuick(t1TypedAsT, "foo")).getIntValue());
    
    System.out.println(((NgInt)NgSystem.metaClassRegistry.getRuntimeMetaClass(t1).invokeMethodQuick(t1, "bar")).getIntValue());
    
    System.out.println(((NgInt)NgSystem.metaClassRegistry.getRuntimeMetaClass(t2).invokeMethodQuick(t2, "bar")).getIntValue());
    
    System.out.println(((NgInt)NgSystem.metaClassRegistry.getRuntimeMetaClass(t2TypedAsT1).invokeMethodQuick(t2TypedAsT1, "bar")).getIntValue());
 
    System.out.println(((NgInt)NgSystem.metaClassRegistry.getRuntimeMetaClass(t).invokeMethod(t, "foo", new Object[]{new NgInt(1), new NgInt(1), new NgInt(1), new NgInt(1), new NgInt(1)})).getIntValue());
    System.out.println(((NgInt)NgSystem.metaClassRegistry.getRuntimeMetaClass(t).invokeMethod(t, "foo", new Object[]{new NgInt(1), new NgInt(1), new NgInt(1), new NgInt(1), t})).getIntValue());
    System.out.println(((NgInt)NgSystem.metaClassRegistry.getRuntimeMetaClass(t).invokeMethod(t, "foo", new Object[]{new NgInt(1), new NgInt(1), new NgInt(1), new NgInt(1), new NgTyped(t1, T.class)})).getIntValue());
    System.out.println(((NgInt)NgSystem.metaClassRegistry.getRuntimeMetaClass(t).invokeMethod(t, "foo", new Object[]{new NgInt(1), new NgInt(1), new NgInt(1), new NgInt(1), t1})).getIntValue());
    System.out.println(((NgLong)NgSystem.metaClassRegistry.getRuntimeMetaClass(t).invokeMethod(t, "foo", new Object[]{new NgLong(1), new NgLong(1), new NgLong(1), new NgLong(1), new NgLong(1)})).getLongValue());
    System.out.println(((NgLong)NgSystem.metaClassRegistry.getRuntimeMetaClass(t).invokeMethod(t, "foo", new Object[]{new NgLong(1), new NgLong(1), new NgLong(1), new NgLong(1), t})).getLongValue());
    System.out.println(((NgLong)NgSystem.metaClassRegistry.getRuntimeMetaClass(t).invokeMethod(t, "foo", new Object[]{new NgLong(1), new NgLong(1), new NgLong(1), new NgLong(1), new NgTyped(t1, T.class)})).getLongValue());
    System.out.println(((NgLong)NgSystem.metaClassRegistry.getRuntimeMetaClass(t).invokeMethod(t, "foo", new Object[]{new NgLong(1), new NgLong(1), new NgLong(1), new NgLong(1), t1})).getLongValue());
    
    System.out.println(((NgInt)NgSystem.metaClassRegistry.getRuntimeMetaClass(t1).invokeMethod(t1, "foo", new Object[]{new NgInt(1), new NgInt(1), new NgInt(1), new NgInt(1), new NgInt(1)})).getIntValue());
    System.out.println(((NgInt)NgSystem.metaClassRegistry.getRuntimeMetaClass(t1).invokeMethod(t1, "foo", new Object[]{new NgInt(1), new NgInt(1), new NgInt(1), new NgInt(1), t})).getIntValue());
    System.out.println(((NgInt)NgSystem.metaClassRegistry.getRuntimeMetaClass(t1).invokeMethod(t1, "foo", new Object[]{new NgInt(1), new NgInt(1), new NgInt(1), new NgInt(1), new NgTyped(t1, T.class)})).getIntValue());
    System.out.println(((NgInt)NgSystem.metaClassRegistry.getRuntimeMetaClass(t1).invokeMethod(t1, "foo", new Object[]{new NgInt(1), new NgInt(1), new NgInt(1), new NgInt(1), t1})).getIntValue());
    System.out.println(((NgLong)NgSystem.metaClassRegistry.getRuntimeMetaClass(t1).invokeMethod(t1, "foo", new Object[]{new NgLong(1), new NgLong(1), new NgLong(1), new NgLong(1), new NgLong(1)})).getLongValue());
    System.out.println(((NgLong)NgSystem.metaClassRegistry.getRuntimeMetaClass(t1).invokeMethod(t1, "foo", new Object[]{new NgLong(1), new NgLong(1), new NgLong(1), new NgLong(1), t})).getLongValue());
    System.out.println(((NgLong)NgSystem.metaClassRegistry.getRuntimeMetaClass(t1).invokeMethod(t1, "foo", new Object[]{new NgLong(1), new NgLong(1), new NgLong(1), new NgLong(1), new NgTyped(t1, T.class)})).getLongValue());
    System.out.println(((NgLong)NgSystem.metaClassRegistry.getRuntimeMetaClass(t1).invokeMethod(t1, "foo", new Object[]{new NgLong(1), new NgLong(1), new NgLong(1), new NgLong(1), t1})).getLongValue());

  
    System.out.println(((NgLong)NgSystem.metaClassRegistry.getRuntimeMetaClass(t).invokeMethod(t, "foo", new Object[]{new NgChar((char)1), new NgByte((byte)1), new NgShort((short)1), new NgInt(1), new NgLong(1)})).getLongValue());
    System.out.println(((NgInt)NgSystem.metaClassRegistry.getRuntimeMetaClass(t).invokeMethod(t, "foo", new Object[]{new NgChar((char)1), new NgByte((byte)1), new NgShort((short)1), new NgInt(1), new NgInt(1)})).getIntValue());
  }
}


class T {
  public int foo() {
    return -1;
  }
  
  public int foo(int a, int b, int c, int d, int e) {
    return a + b + c + d + e;
  }
  
  public int foo(int a, int b, int c, int d, T t) {
    return a + b + c + d;
  }
  
  public int foo(int a, int b, int c, int d, T1 t) {
    return a + b + c + d + 100;
  }
  
  public long foo(long a, long b, long c, long d, long e) {
    return a + b + c + d + e;
  }
  
  public long foo(long a, long b, long c, long d, T e) {
    return a + b + c + d;
  }
  
  public long foo(long a, long b, long c, long d, T1 e) {
    return a + b + c + d + 100;
  }
  
  public int plus(int rhs) {
    return rhs + 1000;
  }
  
  public int reversePlus(int lhs) {
    return lhs + 2000;
  }
}

class T1 extends T implements I {
  public int foo(int a, int b, int c, int d, int e) {
    return 10000;
  }
  
  public int bar() {
    return 400;
  }
}

class T2 extends T1 {
  
}

interface I {
  int foo();
}