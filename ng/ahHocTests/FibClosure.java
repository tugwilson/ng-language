import ng.lang.Closure;
import ng.lang.NgSystem;
import ng.runtime.NgBaseObject;
import ng.runtime.NgInt;
import ng.runtime.RuntimeMetaClass;
import ng.runtime.ThreadContext;
import uk.co.wilson.ng.lang.ClosureImpl;

/*
 * Created on 18 Jun 2007
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
public class FibClosure extends NgBaseObject {
  private final static RuntimeMetaClass ngMetaClass = NgSystem.metaClassRegistry.getRuntimeMetaClass(FibClosure.class);
  int series;
    
    //
    // main is not translated
    //
    public static void main(String args[]) throws Throwable {
      new FibClosure(10).calculate(); // warm up the JVM
      long start = System.currentTimeMillis();
      int result = new FibClosure(35).calculate();
      System.out.println(System.currentTimeMillis() - start);
      System.out.println(result);
    }

    //
    // the rest of the class approximates to what the Ng compiler will generate
    //
    FibClosure(int x) throws Throwable {
      super(ngMetaClass);
      this.metaClass.setField(this, "series", NgInt.valueOf(x));
     }
    
     int calculate() throws Throwable {
       Closure c = new ClosureImpl(NgSystem.closureMetaClass) {
        /* (non-Javadoc)
         * @see uk.co.wilson.ng.lang.ClosureImpl#call(java.lang.Object, int)
         */
        @Override
        public Object call(Object instance, int x) throws Throwable {
        final ThreadContext $tc = NgSystem.metaClassRegistry.getThreadContext();
          
          // if (x <= 0) return 0;
          if (NgSystem.ngIntMetaClass.lessThanOrEqualsBoolean(x, 0)) {
            return NgInt.valueOf(0);
          }
          
          // if (x == 1) return 1;
          if (NgSystem.ngIntMetaClass.equalsBoolean(x, 1)) {
            return NgInt.valueOf(1);
          }
     
          // return (self(x-1) + self(x-2));
          Object $tmp = this.metaClass.callQuick(this, NgSystem.ngIntMetaClass.subtract(x, 1));
          return NgSystem.metaClassRegistry.getRuntimeMetaClass($tc, $tmp).add($tmp, this.metaClass.callQuick(this, NgSystem.ngIntMetaClass.subtract(x, 2)));
        }

        /* (non-Javadoc)
         * @see uk.co.wilson.ng.lang.ClosureImpl#call(java.lang.Object, java.lang.Object)
         */
        @Override
        public Object call(Object instance, Object x) throws Throwable {
           return this.call(instance, NgSystem.metaClassRegistry.getRuntimeMetaClass(x).asInt(x));
        }
       };
       
       Object $tmp = NgSystem.closureMetaClass.callQuick(c, this.metaClass.getField(this, "series"));
       return NgSystem.metaClassRegistry.getRuntimeMetaClass($tmp).asInt($tmp);
     }
}
