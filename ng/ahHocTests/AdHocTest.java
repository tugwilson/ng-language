import ng.lang.NgSystem;
import ng.runtime.NgInt;
import ng.runtime.NgLong;
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
  }
}


class T {
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
}

class T1 extends T {
  
}