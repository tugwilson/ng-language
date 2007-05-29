import ng.lang.NgSystem;
import ng.runtime.NgBaseObject;
import ng.runtime.NgInt;
import ng.runtime.RuntimeMetaClass;

/*
 * Created on 24 May 2007
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
public class FibNg extends NgBaseObject {
  private final static RuntimeMetaClass ngMetaClass = NgSystem.metaClassRegistry.getRuntimeMetaClass(FibNg.class);
    Object series;
    
    public static void main(String args[]) {
      new FibNg(NgInt.valueOf(10)).calculate();
      long start = System.currentTimeMillis();
      int result = new FibNg(NgInt.valueOf(35)).calculate();
      System.out.println(System.currentTimeMillis() - start);
      System.out.println(result);
    }

    FibNg(Object x) {
      super(ngMetaClass);
      this.metaClass.setField(this, "series", x);
     }
    
     int calculate() {
         Object tmp = this.metaClass.invokeMethodQuick(this, "fib", this.metaClass.getField(this, "series"));
         return NgSystem.metaClassRegistry.getRuntimeMetaClass(tmp).asInt(tmp);
     }
    
     int fib(Object x) {
         Object tmp = NgSystem.metaClassRegistry.getRuntimeMetaClass(x).lessThanOrEquals(x, 0);
         if (NgSystem.metaClassRegistry.getRuntimeMetaClass(tmp).asBoolean(tmp)) {
             return 0;
         }
         
         tmp = NgSystem.metaClassRegistry.getRuntimeMetaClass(x).equals(x, 1);
         if (NgSystem.metaClassRegistry.getRuntimeMetaClass(tmp).asBoolean(tmp)) {
             return 1;
         }
    
         tmp = this.metaClass.invokeMethodQuick(this, "fib", NgSystem.metaClassRegistry.getRuntimeMetaClass(x).subtract(x, 1));
         tmp = NgSystem.metaClassRegistry.getRuntimeMetaClass(tmp).add(tmp, this.metaClass.invokeMethodQuick(this, "fib", NgSystem.metaClassRegistry.getRuntimeMetaClass(x).subtract(x, 2)));
         return NgSystem.metaClassRegistry.getRuntimeMetaClass(tmp).asInt(tmp);
     }
}
