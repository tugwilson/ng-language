/*
 * Created on Feb 23, 2007
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
package uk.co.wilson.ng.runtime.metaclass;

import java.lang.ref.SoftReference;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;

import ng.lang.NgObject;
import ng.lang.NgSystem;
import ng.runtime.InternalMetaClass;
import ng.runtime.MetaClass;
import ng.runtime.MetaClassRegistry;
import ng.runtime.NgNull;
import ng.runtime.RuntimeMetaClass;
import ng.runtime.ThreadContext;

public class MetaClassRegistryImpl implements MetaClassRegistry {
  private final Map registry = new HashMap() {
    private static final long serialVersionUID = 1L;

    @Override
    public Object get(final Object key) {
    final Object result = super.get(key);
    
      if (result == null) return null;
      
      return ((SoftReference)result).get();
    }
    
    @Override
    public Object put(final Object key, final Object value) {
      return super.put(key, new SoftReference(value));
    }
  };
  
  private final ThreadLocal threadContext = new ThreadLocal() {
    @Override
    protected Object initialValue() {
      return new ThreadContext() {
        private static final int ngMetaClassModifiers = Modifier.PUBLIC | Modifier.STATIC | Modifier.FINAL;
        private final Map threadRegistry = new WeakHashMap() {
          @Override
          public Object get(final Object key) {
          final Object result = super.get(key);
            
            if (result == null) return null;
            
            return ((WeakReference)result).get();
          }
          
          @Override
          public Object put(final Object key, final Object value) {
            return super.put(key, new WeakReference(value));
          }
        };
        
        public RuntimeMetaClass getRuntimeMetaClass(final Class theClass) { 
        //
        // First try and get the MetaClass from the thread local registry cache
        // This does not need any synchronisation
        //
        RuntimeMetaClass metaClass = (RuntimeMetaClass)this.threadRegistry.get(theClass);

          if (metaClass == null) {        
            //
            // If the class has a static ngMetaClass then use this value as the MetaClass
            // The refection is an expensive operation so put the MetaClass in the thread local cache
            // to speed up subsequent fetches
            //
            try {
            final Field ngMetaClass = theClass.getField("ngMetaClass");
              
              try {
                ngMetaClass.setAccessible(true);
              } catch (final SecurityException e) {
              }
            
              if (ngMetaClass.getDeclaringClass() == theClass &&
                  (ngMetaClass.getModifiers() & ngMetaClassModifiers) == ngMetaClassModifiers &&
                  ngMetaClass.getType() == RuntimeMetaClass.class) {
                
                metaClass = (RuntimeMetaClass)ngMetaClass.get(null);              
              }
            } catch (final SecurityException e) {
            } catch (final IllegalArgumentException e) {
            } catch (final NoSuchFieldException e) {
            } catch (final IllegalAccessException e) {
            }
            
            if (metaClass == null) {
              //
              // If it's not in the thread local cache then syncronise against the class
              // and get it from the global registry, put it in the thread local cache and
              // return it
              //
              // If it's not in the global registry then create it and put it in the
              // global registry and in the thread local cache and return it.
              //
              synchronized (MetaClassRegistryImpl.class) {
                metaClass = (RuntimeMetaClass)MetaClassRegistryImpl.this.registry.get(theClass);
    
                if (metaClass == null) {
                final Class superClass = theClass.getSuperclass();
    
                  if (superClass == null) {
                    metaClass = getRuntimeMetaClass(Object.class).createMetaClassFor(theClass);
                  } else {
                    metaClass = getRuntimeMetaClass(superClass).createMetaClassFor(theClass);
                  }
                }
                
                MetaClassRegistryImpl.this.registry.put(theClass, metaClass);
              }
            }
            
            this.threadRegistry.put(theClass, metaClass);
          }
          
          return metaClass;
        }
      };
    }
  };

  {
    //
    // Initialise the global MetaClass Registry with the Metclass for
    // java.lang.Object.
    // This is the root MetaClass which generates all the other MetaClasses
    // directly or indirectly.
    //
    this.registry.put(Object.class, NgSystem.objectMetaClass);
    
    //
    // Now associate the primitive types with their wrappers
    //
    this.registry.put(boolean.class, NgSystem.ngBooleanMetaClass);
    this.registry.put(byte.class, NgSystem.ngByteMetaClass);
    this.registry.put(char.class, NgSystem.ngCharMetaClass);
    this.registry.put(short.class, NgSystem.ngShortMetaClass);
    this.registry.put(int.class, NgSystem.ngIntMetaClass);
    this.registry.put(long.class, NgSystem.ngLongMetaClass);
    this.registry.put(float.class, NgSystem.ngFloatMetaClass);
    this.registry.put(double.class, NgSystem.ngDoubleMetaClass);    
    this.registry.put(BigInteger.class, NgSystem.bigIntegerMetaClass);    
    this.registry.put(BigDecimal.class, NgSystem.bigDecimalMetaClass);    
  }

  /**
   * @return the threadContext
   */
  public ThreadContext getThreadContext() {
    return (ThreadContext)this.threadContext.get();
  }

  /*
   * (non-Javadoc)
   * 
   * @see ng.lang.MetaClassRegistry#getMetaClass(java.lang.Class)
   */
  public MetaClass getMetaClass(final Class theClass) {
    return getRuntimeMetaClass(theClass);
  }

  /* (non-Javadoc)
   * @see ng.runtime.MetaClassRegistry#getMetaClass(ng.runtime.ThreadContext, java.lang.Class)
   */
  public MetaClass getMetaClass(final ThreadContext context, final Class theClass) {
    return getRuntimeMetaClass(context, theClass);
  }

  /* (non-Javadoc)
   * @see ng.runtime.MetaClassRegistry#getMetaClass(java.lang.Object)
   */
  public MetaClass getMetaClass(final Object theInstance) {
    return getRuntimeMetaClass(theInstance);
  }
  
  /* (non-Javadoc)
   * @see ng.runtime.MetaClassRegistry#getMetaClass(ng.runtime.ThreadContext, java.lang.Object)
   */
  public MetaClass getMetaClass(final ThreadContext context, final Object theInstance) {
    return getRuntimeMetaClass(context, theInstance);
  }

  /* (non-Javadoc)
   * @see ng.runtime.MetaClassRegistry#getRuntimeMetaClass(java.lang.Class)
   */
  public RuntimeMetaClass getRuntimeMetaClass(final Class theClass) {
    return getRuntimeMetaClass((ThreadContext)this.threadContext.get(), theClass);
  }

  /* (non-Javadoc)
   * @see ng.runtime.MetaClassRegistry#getRuntimeMetaClass(ng.runtime.ThreadContext, java.lang.Class)
   */
  public RuntimeMetaClass getRuntimeMetaClass(final ThreadContext context, final Class theClass) {
    return context.getRuntimeMetaClass(theClass);
  }

  /* (non-Javadoc)
   * @see ng.runtime.MetaClassRegistry#getRuntimeMetaClass(java.lang.Object)
   */
  public RuntimeMetaClass getRuntimeMetaClass(final Object theInstance) {
    if (theInstance instanceof NgObject) {
      return ((NgObject)theInstance).getMetaClass();
    } else if (theInstance == null) {
      return getRuntimeMetaClass((ThreadContext)this.threadContext.get(), NgNull.class);
    } else  {
      return getRuntimeMetaClass((ThreadContext)this.threadContext.get(), theInstance.getClass());
    }
  }

  /* (non-Javadoc)
   * @see ng.runtime.MetaClassRegistry#getRuntimeMetaClass(ng.runtime.ThreadContext, java.lang.Object)
   */
  public RuntimeMetaClass getRuntimeMetaClass(final ThreadContext context, final Object theInstance) {
    if (theInstance instanceof NgObject) {
      return ((NgObject)theInstance).getMetaClass();
    } else if (theInstance == null) {
      return getRuntimeMetaClass(context, NgNull.class);
    } else {
      return getRuntimeMetaClass(context, theInstance.getClass());
    }
  }

  /* (non-Javadoc)
   * @see ng.runtime.MetaClassRegistry#getInternalMetaClass(java.lang.Class)
   */
  public InternalMetaClass getInternalMetaClass(final Class theClass) {
    return getRuntimeMetaClass(theClass).getInternalMetaClass();
  }
  
  /* (non-Javadoc)
   * @see ng.runtime.MetaClassRegistry#getInternalMetaClass(ng.runtime.ThreadContext, java.lang.Class)
   */
  public InternalMetaClass getInternalMetaClass(final ThreadContext context, final Class theClass) {
    return getRuntimeMetaClass(context, theClass).getInternalMetaClass();
  }

  /* (non-Javadoc)
   * @see ng.runtime.MetaClassRegistry#getInternalMetaClass(java.lang.Object)
   */
  public InternalMetaClass getInternalMetaClass(final Object theInstance) {
    return getRuntimeMetaClass(theInstance).getInternalMetaClass();
  }

  /* (non-Javadoc)
   * @see ng.runtime.MetaClassRegistry#getInternalMetaClass(ng.runtime.ThreadContext, java.lang.Object)
   */
  public InternalMetaClass getInternalMetaClass(final ThreadContext context, final Object theInstance) {
    return getRuntimeMetaClass(context, theInstance).getInternalMetaClass();
  }
}
