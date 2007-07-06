package uk.co.wilson.ng.runtime.metaclass;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.HashMap;
import java.util.Map;

import ng.lang.NgRuntimeException;
import ng.lang.NgSystem;
import ng.runtime.Callable;
import ng.runtime.InstanceHandler;
import ng.runtime.MetaClass;
import ng.runtime.MetaMethod;
import ng.runtime.RuntimeMetaClass;
import ng.runtime.ThreadContext;
import uk.co.wilson.ng.runtime.metaclass.methods.MetaMethodSelection;


/**
 * @author John
 *
 */
public abstract class InstanceHandlerImpl implements InstanceHandler {
  private static class MetaMethodMap extends HashMap<String, MetaMethod> {
    private static final long serialVersionUID = 1L;

      /**
       * @param key
       * @return
       */
      @Override
      public MetaMethod get(final Object methodName) {
      final MetaMethod result = super.get(methodName);
      
        if (result == null) {
          return noMethod;
        } else {
          return result;
        }
      }

      /* (non-Javadoc)
       * @see java.util.HashMap#put(java.lang.Object, java.lang.Object)
       */
      @Override
      public MetaMethod put(final String methodName, final MetaMethod metaMethod) {
      final MetaMethod oldMetaMethod = super.put(methodName, metaMethod);
      
        if (oldMetaMethod != null) {
          super.put(methodName, oldMetaMethod.addMetaMethod(metaMethod));
        }
        
        return oldMetaMethod;
      }
    }
    
  protected final Class theClass;
  protected final Class theSuperClass;
  protected final Callable callable = noMethod;
    
  protected final Map<String, MetaMethod> zeroParameterMethods = new MetaMethodMap();
  protected final Map<String, MetaMethod> oneParameterMethods = new MetaMethodMap();
  protected final Map<String, MetaMethod> twoParameterMethods = new MetaMethodMap();
  protected final Map<String, MetaMethod> threeParameterMethods = new MetaMethodMap();
  protected final Map<String, MetaMethod> fourParameterMethods = new MetaMethodMap();
  protected final Map<String, MetaMethod> multiParameterMethods = new MetaMethodMap();
  protected final Map<String, MetaMethod> getPropertyMethods = new MetaMethodMap();
  protected final Map<String, MetaMethod> setPropertyMethods = new MetaMethodMap();
  protected final Map<String, MetaMethod> getFieldMethods = new MetaMethodMap();
  protected final Map<String, MetaMethod> setFieldMethods = new MetaMethodMap();
  
  private RuntimeMetaClass superClassMetaClass;
  private RuntimeMetaClass interfaceMetaClasses[];

  /**
   * @param theClass
   */
  /**
   * @param theClass
   */
  public InstanceHandlerImpl(final Class theClass) {
    this.theClass = theClass;
    this.theSuperClass = theClass.getSuperclass();    
  }

  /* (non-Javadoc)
   * @see ng.runtime.MetaClass#getMetaClassFor(java.lang.Class)
   */
  @SuppressWarnings("unchecked")
  public MetaClass getMetaClassFor(final Class theClass) {
    // TODO decide what to do here
    //      Do we return the MetaClass for the superclass?
    
    if (theClass.isAssignableFrom(this.theClass)) {
      return NgSystem.metaClassRegistry.getMetaClass(theClass);
    } else {
      throw new NgRuntimeException("cannot cast " + this.theClass.getName() + " to " + theClass.getName());
    }
  }

  /* (non-Javadoc)
   * @see ng.runtime.MetaClass#getRuntimeMetaClass()
   */
  public RuntimeMetaClass getRuntimeMetaClass() {
    // TODO: I'd really like not to have to do this
    throw new NgRuntimeException("Internal Error: can't call getRuntimeMetaClass on InstanceHandler");
  }

  /**
   * @return the theClass
   */
  public Class getTheClass(final Object instance) {
    return this.theClass;
  }

  /* (non-Javadoc)
   * @see ng.runtime.InstanceHandler#calculateConversionCost(java.lang.Class)
   */
  public int calculateConversionCost(final Class parameterType) {
    if (this.theClass == parameterType) {
      return 0;
    }
    
    if (parameterType.isAssignableFrom(this.theClass)) {
      return 1;
    }
    
    return 100;
  }

  /* (non-Javadoc)
   * @see ng.runtime.InstanceHandler#invokeConstructor(java.lang.Class, java.lang.Object[])
   */
  public Object invokeConstructor(final Class theClass, final Object[] arguments) {
    return RuntimeMetaClassImpl.NOT_CONSTRUCTED;
  }

  /**
   * This code should really be in the constructor
   * However this causes problems with the initial class loading
   * TODO: fix this problem
   */
  private void setUpMetaClasses() {
    if (this.theSuperClass != null && this.superClassMetaClass == null) {
      this.superClassMetaClass = NgSystem.metaClassRegistry.getRuntimeMetaClass(this.theSuperClass);
    }
    
    if (this.interfaceMetaClasses == null) {
    final Class interfaces[] = this.theClass.getInterfaces();
    final RuntimeMetaClass[] metaClasses = new RuntimeMetaClass[interfaces.length];
      
      for (int i = 0; i != interfaces.length; i++) {
        metaClasses[i] = NgSystem.metaClassRegistry.getRuntimeMetaClass(interfaces[i]);
      }
      
      this.interfaceMetaClasses = metaClasses;
    }
  }
  
  /* (non-Javadoc)
   * @see ng.runtime.InstanceHandler#getMetaMethodFor(ng.runtime.ThreadContext, java.lang.String, java.lang.Object[])
   */
  public MetaMethod getMetaMethodFor(final ThreadContext tc, final String methodName, final Object[] arguments) {
    if(arguments.length <= 4)
      throw new NgRuntimeException("Internal Error invokeMethod called with an array of " + arguments.length +" parameters");
    
    final RuntimeMetaClass argumentMetaClasses[] = new RuntimeMetaClass[arguments.length];
    
    for (int i = 0; i != argumentMetaClasses.length; i++) {
      argumentMetaClasses[i] = NgSystem.metaClassRegistry.getRuntimeMetaClass(arguments[i]);
    }
       
    return selectMethod(tc, new MetaMethodSelection(), methodName, argumentMetaClasses).metaMethod;
  }

  /* (non-Javadoc)
   * @see ng.runtime.InstanceHandler#selectMethod(ng.runtime.ThreadContext, uk.co.wilson.ng.runtime.metaclass.methods.MetaMethodSelection, java.lang.String, ng.runtime.RuntimeMetaClass[])
   */
  public MetaMethodSelection selectMethod(final ThreadContext tc, MetaMethodSelection currentSelection, final String methodName, final RuntimeMetaClass[] argumentMetaClasses) {
    setUpMetaClasses();
    
    currentSelection = this.multiParameterMethods.get(methodName).selectMethod(tc, currentSelection, argumentMetaClasses);

    
    if (currentSelection.score == 0) return currentSelection;
    
    for (int i = 0; i != this.interfaceMetaClasses.length; i++) {
      currentSelection = tc.selectMethod(this.interfaceMetaClasses[i], currentSelection, methodName, argumentMetaClasses);
      
      if (currentSelection.score == 0) return currentSelection;
    }
    
    if (this.theSuperClass != null) {
      return tc.selectMethod(this.superClassMetaClass, currentSelection, methodName, argumentMetaClasses);
    }
    
    return currentSelection;
  }
  
  /* (non-Javadoc)
   * @see ng.runtime.InstanceHandler#getMetaMethodQuick(ng.runtime.ThreadContext, java.lang.String)
   */
  public MetaMethod getMetaMethodQuick(final ThreadContext tc, final String methodName) {
    return selectMethod(tc, new MetaMethodSelection(), methodName).metaMethod;
  }

  /* (non-Javadoc)
   * @see ng.runtime.InstanceHandler#selectMethod(ng.runtime.ThreadContext, uk.co.wilson.ng.runtime.metaclass.methods.MetaMethodSelection, java.lang.String)
   */
  public MetaMethodSelection selectMethod(final ThreadContext tc, MetaMethodSelection currentSelection, final String methodName) {
    setUpMetaClasses();
    
    currentSelection = this.zeroParameterMethods.get(methodName).selectMethod(tc, currentSelection);

    
    if (currentSelection.score == 0) return currentSelection;
    
    for (int i = 0; i != this.interfaceMetaClasses.length; i++) {
      currentSelection = tc.selectMethod(this.interfaceMetaClasses[i], currentSelection, methodName);
      
      if (currentSelection.score == 0) return currentSelection;
    }
    
    if (this.theSuperClass != null) {
      return tc.selectMethod(this.superClassMetaClass, currentSelection, methodName);
    }
    
    return currentSelection;
  }
  
  /* (non-Javadoc)
   * @see ng.runtime.InstanceHandler#getMetaMethodQuick(ng.runtime.ThreadContext, java.lang.String, java.lang.Object)
   */
  public MetaMethod getMetaMethodQuick(final ThreadContext tc, final String methodName, final Object p1) {
    return selectMethod(tc, new MetaMethodSelection(), methodName,
        NgSystem.metaClassRegistry.getRuntimeMetaClass(p1)).metaMethod;
  }
  
  /* (non-Javadoc)
   * @see ng.runtime.InstanceHandler#getMetaMethodQuick(ng.runtime.ThreadContext, java.lang.String, boolean)
   */
  public MetaMethod getMetaMethodQuick(final ThreadContext tc, final String methodName, final boolean p1) {
    return selectMethod(tc, new MetaMethodSelection(), methodName, NgSystem.ngBooleanMetaClass).metaMethod;
  }
  
  /* (non-Javadoc)
   * @see ng.runtime.InstanceHandler#getMetaMethodQuick(ng.runtime.ThreadContext, java.lang.String, char)
   */
  public MetaMethod getMetaMethodQuick(final ThreadContext tc, final String methodName, final char p1) {
    return selectMethod(tc, new MetaMethodSelection(), methodName, NgSystem.ngCharMetaClass).metaMethod;
  }
  
  /* (non-Javadoc)
   * @see ng.runtime.InstanceHandler#getMetaMethodQuick(ng.runtime.ThreadContext, java.lang.String, byte)
   */
  public MetaMethod getMetaMethodQuick(final ThreadContext tc, final String methodName, final byte p1) {
    return selectMethod(tc, new MetaMethodSelection(), methodName, NgSystem.ngByteMetaClass).metaMethod;
  }
  
  /* (non-Javadoc)
   * @see ng.runtime.InstanceHandler#getMetaMethodQuick(ng.runtime.ThreadContext, java.lang.String, short)
   */
  public MetaMethod getMetaMethodQuick(final ThreadContext tc, final String methodName, final short p1) {
    return selectMethod(tc, new MetaMethodSelection(), methodName, NgSystem.ngShortMetaClass).metaMethod;
  }
  
  /* (non-Javadoc)
   * @see ng.runtime.InstanceHandler#getMetaMethodQuick(ng.runtime.ThreadContext, java.lang.String, int)
   */
  public MetaMethod getMetaMethodQuick(final ThreadContext tc, final String methodName, final int p1) {
    return selectMethod(tc, new MetaMethodSelection(), methodName, NgSystem.ngIntMetaClass).metaMethod;
  }
  
  /* (non-Javadoc)
   * @see ng.runtime.InstanceHandler#getMetaMethodQuick(ng.runtime.ThreadContext, java.lang.String, long)
   */
  public MetaMethod getMetaMethodQuick(final ThreadContext tc, final String methodName, final long p1) {
    return selectMethod(tc, new MetaMethodSelection(), methodName, NgSystem.ngLongMetaClass).metaMethod;
  }
  
  /* (non-Javadoc)
   * @see ng.runtime.InstanceHandler#getMetaMethodQuick(ng.runtime.ThreadContext, java.lang.String, float)
   */
  public MetaMethod getMetaMethodQuick(final ThreadContext tc, final String methodName, final float p1) {
    return selectMethod(tc, new MetaMethodSelection(), methodName, NgSystem.ngFloatMetaClass).metaMethod;
  }
  
  /* (non-Javadoc)
   * @see ng.runtime.InstanceHandler#getMetaMethodQuick(ng.runtime.ThreadContext, java.lang.String, double)
   */
  public MetaMethod getMetaMethodQuick(final ThreadContext tc, final String methodName, final double p1) {
    return selectMethod(tc, new MetaMethodSelection(), methodName, NgSystem.ngDoubleMetaClass).metaMethod;
  }
  
  /* (non-Javadoc)
   * @see ng.runtime.InstanceHandler#getMetaMethodQuick(ng.runtime.ThreadContext, java.lang.String, java.math.BigInteger)
   */
  public MetaMethod getMetaMethodQuick(final ThreadContext tc, final String methodName, final BigInteger p1) {
    return selectMethod(tc, new MetaMethodSelection(), methodName, NgSystem.bigIntegerMetaClass).metaMethod;
  }
  
  /* (non-Javadoc)
   * @see ng.runtime.InstanceHandler#getMetaMethodQuick(ng.runtime.ThreadContext, java.lang.String, java.math.BigDecimal)
   */
  public MetaMethod getMetaMethodQuick(final ThreadContext tc, final String methodName, final BigDecimal p1) {
    return selectMethod(tc, new MetaMethodSelection(), methodName, NgSystem.bigDecimalMetaClass).metaMethod;
  }

  /* (non-Javadoc)
   * @see ng.runtime.InstanceHandler#selectMethod(ng.runtime.ThreadContext, uk.co.wilson.ng.runtime.metaclass.methods.MetaMethodSelection, java.lang.String, ng.runtime.RuntimeMetaClass)
   */
  public MetaMethodSelection selectMethod(final ThreadContext tc, MetaMethodSelection currentSelection, final String methodName, final RuntimeMetaClass p1) {
    setUpMetaClasses();
    
    currentSelection = this.oneParameterMethods.get(methodName).selectMethod(tc, currentSelection, p1);

    
    if (currentSelection.score == 0) return currentSelection;
    
    for (int i = 0; i != this.interfaceMetaClasses.length; i++) {
      currentSelection = tc.selectMethod(this.interfaceMetaClasses[i], currentSelection, methodName, p1);
      
      if (currentSelection.score == 0) return currentSelection;
    }
    
    if (this.theSuperClass != null) {
      return tc.selectMethod(this.superClassMetaClass, currentSelection, methodName, p1);
    }
    
    return currentSelection;
  }
  
  /* (non-Javadoc)
   * @see ng.runtime.InstanceHandler#getMetaMethodQuick(ng.runtime.ThreadContext, java.lang.String, java.lang.Object, java.lang.Object)
   */
  public MetaMethod getMetaMethodQuick(final ThreadContext tc, final String methodName, final Object p1, final Object p2) {
    return selectMethod(tc, new MetaMethodSelection(), methodName,
        NgSystem.metaClassRegistry.getRuntimeMetaClass(p1),
        NgSystem.metaClassRegistry.getRuntimeMetaClass(p2)).metaMethod;
  }

  /* (non-Javadoc)
   * @see ng.runtime.InstanceHandler#selectMethod(ng.runtime.ThreadContext, uk.co.wilson.ng.runtime.metaclass.methods.MetaMethodSelection, java.lang.String, ng.runtime.RuntimeMetaClass, ng.runtime.RuntimeMetaClass)
   */
  public MetaMethodSelection selectMethod(final ThreadContext tc, MetaMethodSelection currentSelection, final String methodName, final RuntimeMetaClass p1, final RuntimeMetaClass p2) {
    setUpMetaClasses();
    
    currentSelection = this.twoParameterMethods.get(methodName).selectMethod(tc, currentSelection, p1, p2);

    
    if (currentSelection.score == 0) return currentSelection;
    
    for (int i = 0; i != this.interfaceMetaClasses.length; i++) {
      currentSelection = tc.selectMethod(this.interfaceMetaClasses[i], currentSelection, methodName, p1, p2);
      
      if (currentSelection.score == 0) return currentSelection;
    }
    
    if (this.theSuperClass != null) {
      return tc.selectMethod(this.superClassMetaClass, currentSelection, methodName, p1, p2);
    }
    
    return currentSelection;
  }
  
  /* (non-Javadoc)
   * @see ng.runtime.InstanceHandler#getMetaMethodQuick(ng.runtime.ThreadContext, java.lang.String, java.lang.Object, java.lang.Object, java.lang.Object)
   */
  public MetaMethod getMetaMethodQuick(final ThreadContext tc, final String methodName, final Object p1, final Object p2, final Object p3) {
    return selectMethod(tc, new MetaMethodSelection(), methodName,
        NgSystem.metaClassRegistry.getRuntimeMetaClass(p1),
        NgSystem.metaClassRegistry.getRuntimeMetaClass(p2),
        NgSystem.metaClassRegistry.getRuntimeMetaClass(p3)).metaMethod;
  }

  /* (non-Javadoc)
   * @see ng.runtime.InstanceHandler#selectMethod(ng.runtime.ThreadContext, uk.co.wilson.ng.runtime.metaclass.methods.MetaMethodSelection, java.lang.String, ng.runtime.RuntimeMetaClass, ng.runtime.RuntimeMetaClass, ng.runtime.RuntimeMetaClass)
   */
  public MetaMethodSelection selectMethod(final ThreadContext tc, MetaMethodSelection currentSelection, final String methodName, final RuntimeMetaClass p1, final RuntimeMetaClass p2, final RuntimeMetaClass p3) {
    setUpMetaClasses();
    
    currentSelection = this.threeParameterMethods.get(methodName).selectMethod(tc, currentSelection, p1, p2, p3);

    
    if (currentSelection.score == 0) return currentSelection;
    
    for (int i = 0; i != this.interfaceMetaClasses.length; i++) {
      currentSelection = tc.selectMethod(this.interfaceMetaClasses[i], currentSelection, methodName, p1, p2, p3);
      
      if (currentSelection.score == 0) return currentSelection;
    }
    
    if (this.theSuperClass != null) {
      return tc.selectMethod(this.superClassMetaClass, currentSelection, methodName, p1, p2, p3);
    }
    
    return currentSelection;
  }
  
  /* (non-Javadoc)
   * @see ng.runtime.InstanceHandler#getMetaMethodQuick(ng.runtime.ThreadContext, java.lang.String, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object)
   */
  public MetaMethod getMetaMethodQuick(final ThreadContext tc, final String methodName, final Object p1, final Object p2, final Object p3, final Object p4) {
    return selectMethod(tc, new MetaMethodSelection(), methodName,
                        NgSystem.metaClassRegistry.getRuntimeMetaClass(p1),
                        NgSystem.metaClassRegistry.getRuntimeMetaClass(p2),
                        NgSystem.metaClassRegistry.getRuntimeMetaClass(p3),
                        NgSystem.metaClassRegistry.getRuntimeMetaClass(p4)).metaMethod;
  }
  
  /* (non-Javadoc)
   * @see ng.runtime.InstanceHandler#selectMethod(ng.runtime.ThreadContext, uk.co.wilson.ng.runtime.metaclass.methods.MetaMethodSelection, java.lang.String, ng.runtime.RuntimeMetaClass, ng.runtime.RuntimeMetaClass, ng.runtime.RuntimeMetaClass, ng.runtime.RuntimeMetaClass)
   */
  public MetaMethodSelection selectMethod(final ThreadContext tc, MetaMethodSelection currentSelection, final String methodName, final RuntimeMetaClass p1, final RuntimeMetaClass p2, final RuntimeMetaClass p3, final RuntimeMetaClass p4) {
    setUpMetaClasses();
    
    currentSelection = this.fourParameterMethods.get(methodName).selectMethod(tc, currentSelection, p1, p2, p3, p4);

    
    if (currentSelection.score == 0) return currentSelection;
    
    for (int i = 0; i != this.interfaceMetaClasses.length; i++) {
      currentSelection = tc.selectMethod(this.interfaceMetaClasses[i], currentSelection, methodName, p1, p2, p3, p4);
      
      if (currentSelection.score == 0) return currentSelection;
    }
    
    if (this.theSuperClass != null) {
      return tc.selectMethod(this.superClassMetaClass, currentSelection, methodName, p1, p2, p3, p4);
    }
    
    return currentSelection;
  }
  
  /* (non-Javadoc)
   * @see ng.runtime.InstanceHandler#getPropertyMetaMethod(java.lang.Object, java.lang.String)
   */
  public MetaMethod getGetPropertyMetaMethod(final Object instance, final String propertyName) {
    return this.getPropertyMethods.get(propertyName);
  }

  /* (non-Javadoc)
   * @see ng.runtime.InstanceHandler#setProperty(java.lang.Object, java.lang.String, java.lang.Object)
   */
  public MetaMethod getSetPropertyMetaMethod(final Object instance, final String propertyName, final Object newValue) {
    // TODO: select the method based on the parameter match
    return this.setPropertyMethods.get(propertyName);
  }

  /* (non-Javadoc)
   * @see ng.runtime.InstanceHandler#getFieldMetaMethod(java.lang.Object, java.lang.String)
   */
  public MetaMethod getGetFieldMetaMethod(final Object instance, final String fieldName) {
    return this.getFieldMethods.get(fieldName);
  }

  /* (non-Javadoc)
   * @see ng.runtime.InstanceHandler#setField(java.lang.Object, java.lang.String, java.lang.Object)
   */
  public MetaMethod getSetFieldMetaMethod(final Object instance, final String fieldName, final Object newValue) {
    return this.setFieldMethods.get(fieldName);
  }

  /* (non-Javadoc)
   * @see ng.runtime.InstanceHandler#getDoCallMetaMethod()
   */
  public Callable getCallable() {
    return this.callable;
  }

  /* (non-Javadoc)
   * @see ng.runtime.MetaClass#add(java.lang.Object, java.lang.Object)
   */
  public Object add(final Object lhs, final Object rhs) throws Throwable {
    setUpMetaClasses();
    
    for (int i = 0; i != this.interfaceMetaClasses.length; i++) {
    final Object result = this.interfaceMetaClasses[i].getInternalMetaClass().doAdd(lhs, rhs);
      
      if (result != RuntimeMetaClassImpl.NOT_CALLED) return result;
    }
    
    if (this.theSuperClass != null) {
      return this.superClassMetaClass.getInternalMetaClass().doAdd(lhs, rhs);
    } else {
      return RuntimeMetaClassImpl.NOT_CALLED;
    }
  }

  /* (non-Javadoc)
   * @see ng.runtime.InstanceHandler#reverseAdd(java.lang.Object, java.lang.Object)
   */
  public Object reverseAdd(final Object lhs, final Object rhs) throws Throwable {
    setUpMetaClasses();
    
    for (int i = 0; i != this.interfaceMetaClasses.length; i++) {
    final Object result = this.interfaceMetaClasses[i].getInternalMetaClass().doReverseAdd(lhs, rhs);
      
      if (result != RuntimeMetaClassImpl.NOT_CALLED) return result;
    }
    
    if (this.theSuperClass != null) {
      return this.superClassMetaClass.getInternalMetaClass().doReverseAdd(lhs, rhs);
    } else {
      return RuntimeMetaClassImpl.NOT_CALLED;
    }
  }

  /* (non-Javadoc)
   * @see ng.runtime.MetaClass#addEquals(java.lang.Object, java.lang.Object)
   */
  public Object addEquals(final Object lhs, final Object rhs) throws Throwable {
    setUpMetaClasses();
    
    for (int i = 0; i != this.interfaceMetaClasses.length; i++) {
    final Object result = this.interfaceMetaClasses[i].getInternalMetaClass().doAddEquals(lhs, rhs);
      
      if (result != RuntimeMetaClassImpl.NOT_CALLED) return result;
    }
    
    if (this.theSuperClass != null) {
      return this.superClassMetaClass.getInternalMetaClass().doAddEquals(lhs, rhs);
    } else {
      return RuntimeMetaClassImpl.NOT_CALLED;
    }
  }

  /* (non-Javadoc)
   * @see ng.runtime.InstanceHandler#reverseAddEquals(java.lang.Object, java.lang.Object)
   */
  public Object reverseAddEquals(final Object lhs, final Object rhs) throws Throwable {
    setUpMetaClasses();
    
    for (int i = 0; i != this.interfaceMetaClasses.length; i++) {
    final Object result = this.interfaceMetaClasses[i].getInternalMetaClass().doReverseAddEquals(lhs, rhs);
      
      if (result != RuntimeMetaClassImpl.NOT_CALLED) return result;
    }
    
    if (this.theSuperClass != null) {
      return this.superClassMetaClass.getInternalMetaClass().doReverseAddEquals(lhs, rhs);
    } else {
      return RuntimeMetaClassImpl.NOT_CALLED;
    }
  }

  /* (non-Javadoc)
   * @see ng.runtime.MetaClass#and(java.lang.Object, java.lang.Object)
   */
  public Object and(final Object lhs, final Object rhs) throws Throwable {
    setUpMetaClasses();
    
    for (int i = 0; i != this.interfaceMetaClasses.length; i++) {
    final Object result = this.interfaceMetaClasses[i].getInternalMetaClass().doAnd(lhs, rhs);
      
      if (result != RuntimeMetaClassImpl.NOT_CALLED) return result;
    }
    
    if (this.theSuperClass != null) {
      return this.superClassMetaClass.getInternalMetaClass().doAnd(lhs, rhs);
    } else {
      return RuntimeMetaClassImpl.NOT_CALLED;
    }
  }

  /* (non-Javadoc)
   * @see ng.runtime.InstanceHandler#reverseAnd(java.lang.Object, java.lang.Object)
   */
  public Object reverseAnd(final Object lhs, final Object rhs) throws Throwable {
    setUpMetaClasses();
    
    for (int i = 0; i != this.interfaceMetaClasses.length; i++) {
    final Object result = this.interfaceMetaClasses[i].getInternalMetaClass().doReverseAnd(lhs, rhs);
      
      if (result != RuntimeMetaClassImpl.NOT_CALLED) return result;
    }
    
    if (this.theSuperClass != null) {
      return this.superClassMetaClass.getInternalMetaClass().doReverseAnd(lhs, rhs);
    } else {
      return RuntimeMetaClassImpl.NOT_CALLED;
    }
  }

  /* (non-Javadoc)
   * @see ng.runtime.MetaClass#andEquals(java.lang.Object, java.lang.Object)
   */
  public Object andEquals(final Object lhs, final Object rhs) throws Throwable {
    setUpMetaClasses();
    
    for (int i = 0; i != this.interfaceMetaClasses.length; i++) {
    final Object result = this.interfaceMetaClasses[i].getInternalMetaClass().doAndEquals(lhs, rhs);
      
      if (result != RuntimeMetaClassImpl.NOT_CALLED) return result;
    }
    
    if (this.theSuperClass != null) {
      return this.superClassMetaClass.getInternalMetaClass().doAndEquals(lhs, rhs);
    } else {
      return RuntimeMetaClassImpl.NOT_CALLED;
    }
  }

  /* (non-Javadoc)
   * @see ng.runtime.InstanceHandler#reverseAndEquals(java.lang.Object, java.lang.Object)
   */
  public Object reverseAndEquals(final Object lhs, final Object rhs) throws Throwable {
    setUpMetaClasses();
    
    for (int i = 0; i != this.interfaceMetaClasses.length; i++) {
    final Object result = this.interfaceMetaClasses[i].getInternalMetaClass().doReverseAndEquals(lhs, rhs);
      
      if (result != RuntimeMetaClassImpl.NOT_CALLED) return result;
    }
    
    if (this.theSuperClass != null) {
      return this.superClassMetaClass.getInternalMetaClass().doReverseAndEquals(lhs, rhs);
    } else {
      return RuntimeMetaClassImpl.NOT_CALLED;
    }
  }

  /* (non-Javadoc)
   * @see ng.runtime.MetaClass#arithmeticRightShift(java.lang.Object, java.lang.Object)
   */
  public Object arithmeticRightShift(final Object lhs, final Object rhs) throws Throwable {
    setUpMetaClasses();
    
    for (int i = 0; i != this.interfaceMetaClasses.length; i++) {
    final Object result = this.interfaceMetaClasses[i].getInternalMetaClass().doArithmeticRightShift(lhs, rhs);
      
      if (result != RuntimeMetaClassImpl.NOT_CALLED) return result;
    }
    
    if (this.theSuperClass != null) {
      return this.superClassMetaClass.getInternalMetaClass().doArithmeticRightShift(lhs, rhs);
    } else {
      return RuntimeMetaClassImpl.NOT_CALLED;
    }
  }

  /* (non-Javadoc)
   * @see ng.runtime.InstanceHandler#reverseArithmeticRightShift(java.lang.Object, java.lang.Object)
   */
  public Object reverseArithmeticRightShift(final Object lhs, final Object rhs) throws Throwable {
    setUpMetaClasses();
    
    for (int i = 0; i != this.interfaceMetaClasses.length; i++) {
    final Object result = this.interfaceMetaClasses[i].getInternalMetaClass().doReverseArithmeticRightShift(lhs, rhs);
      
      if (result != RuntimeMetaClassImpl.NOT_CALLED) return result;
    }
    
    if (this.theSuperClass != null) {
      return this.superClassMetaClass.getInternalMetaClass().doReverseArithmeticRightShift(lhs, rhs);
    } else {
      return RuntimeMetaClassImpl.NOT_CALLED;
    }
  }

  /* (non-Javadoc)
   * @see ng.runtime.MetaClass#arithmeticRightShiftEquals(java.lang.Object, java.lang.Object)
   */
  public Object arithmeticRightShiftEquals(final Object lhs, final Object rhs) throws Throwable {
    setUpMetaClasses();
    
    for (int i = 0; i != this.interfaceMetaClasses.length; i++) {
    final Object result = this.interfaceMetaClasses[i].getInternalMetaClass().doArithmeticRightShiftEquals(lhs, rhs);
      
      if (result != RuntimeMetaClassImpl.NOT_CALLED) return result;
    }
    
    if (this.theSuperClass != null) {
      return this.superClassMetaClass.getInternalMetaClass().doArithmeticRightShiftEquals(lhs, rhs);
    } else {
      return RuntimeMetaClassImpl.NOT_CALLED;
    }
  }

  /* (non-Javadoc)
   * @see ng.runtime.InstanceHandler#reverseArithmeticRightShiftEquals(java.lang.Object, java.lang.Object)
   */
  public Object reverseArithmeticRightShiftEquals(final Object lhs, final Object rhs) throws Throwable {
    setUpMetaClasses();
    
    for (int i = 0; i != this.interfaceMetaClasses.length; i++) {
    final Object result = this.interfaceMetaClasses[i].getInternalMetaClass().doReverseArithmeticRightShiftEquals(lhs, rhs);
      
      if (result != RuntimeMetaClassImpl.NOT_CALLED) return result;
    }
    
    if (this.theSuperClass != null) {
      return this.superClassMetaClass.getInternalMetaClass().doReverseArithmeticRightShiftEquals(lhs, rhs);
    } else {
      return RuntimeMetaClassImpl.NOT_CALLED;
    }
  }

  public Object asType(final ThreadContext tc, final Object instance, final Class type) throws Throwable {
    setUpMetaClasses();
    
    for (int i = 0; i != this.interfaceMetaClasses.length; i++) {
    final Object result = this.interfaceMetaClasses[i].getInternalMetaClass().doAsType(tc, instance, type);
      
      if (result != RuntimeMetaClassImpl.NOT_CALLED) return result;
    }
    
    if (this.theSuperClass != null) {
      return this.superClassMetaClass.getInternalMetaClass().doAsType(tc, instance, type);
    } else {
      return RuntimeMetaClassImpl.NOT_CALLED;
    }
  }

  /* (non-Javadoc)
   * @see ng.runtime.MetaClass#compare(java.lang.Object, java.lang.Object)
   */
  public Object compare(final Object lhs, final Object rhs) throws Throwable {
    setUpMetaClasses();
    
    for (int i = 0; i != this.interfaceMetaClasses.length; i++) {
    final Object result = this.interfaceMetaClasses[i].getInternalMetaClass().doCompare(lhs, rhs);
      
      if (result != RuntimeMetaClassImpl.NOT_CALLED) return result;
    }
    
    if (this.theSuperClass != null) {
      return this.superClassMetaClass.getInternalMetaClass().doCompare(lhs, rhs);
    } else {
      return RuntimeMetaClassImpl.NOT_CALLED;
    }
  }

  /* (non-Javadoc)
   * @see ng.runtime.InstanceHandler#reverseCompare(java.lang.Object, java.lang.Object)
   */
  public Object reverseCompare(final Object lhs, final Object rhs) throws Throwable {
    setUpMetaClasses();
    
    for (int i = 0; i != this.interfaceMetaClasses.length; i++) {
    final Object result = this.interfaceMetaClasses[i].getInternalMetaClass().doReverseCompare(lhs, rhs);
      
      if (result != RuntimeMetaClassImpl.NOT_CALLED) return result;
    }
    
    if (this.theSuperClass != null) {
      return this.superClassMetaClass.getInternalMetaClass().doReverseCompare(lhs, rhs);
    } else {
      return RuntimeMetaClassImpl.NOT_CALLED;
    }
  }

  /* (non-Javadoc)
   * @see ng.runtime.MetaClass#complement(java.lang.Object)
   */
  public Object complement(final Object instance) throws Throwable {
    setUpMetaClasses();
    
    for (int i = 0; i != this.interfaceMetaClasses.length; i++) {
    final Object result = this.interfaceMetaClasses[i].getInternalMetaClass().doComplement(instance);
      
      if (result != RuntimeMetaClassImpl.NOT_CALLED) return result;
    }
    
    if (this.theSuperClass != null) {
      return this.superClassMetaClass.getInternalMetaClass().doComplement(instance);
    } else {
      return RuntimeMetaClassImpl.NOT_CALLED;
    }
  }

  /* (non-Javadoc)
   * @see ng.runtime.MetaClass#divide(java.lang.Object, java.lang.Object)
   */
  public Object divide(final Object lhs, final Object rhs) throws Throwable {
    setUpMetaClasses();
    
    for (int i = 0; i != this.interfaceMetaClasses.length; i++) {
    final Object result = this.interfaceMetaClasses[i].getInternalMetaClass().doDivide(lhs, rhs);
      
      if (result != RuntimeMetaClassImpl.NOT_CALLED) return result;
    }
    
    if (this.theSuperClass != null) {
      return this.superClassMetaClass.getInternalMetaClass().doDivide(lhs, rhs);
    } else {
      return RuntimeMetaClassImpl.NOT_CALLED;
    }
  }

  /* (non-Javadoc)
   * @see ng.runtime.InstanceHandler#reverseDivide(java.lang.Object, java.lang.Object)
   */
  public Object reverseDivide(final Object lhs, final Object rhs) throws Throwable {
    setUpMetaClasses();
    
    for (int i = 0; i != this.interfaceMetaClasses.length; i++) {
    final Object result = this.interfaceMetaClasses[i].getInternalMetaClass().doReverseDivide(lhs, rhs);
      
      if (result != RuntimeMetaClassImpl.NOT_CALLED) return result;
    }
    
    if (this.theSuperClass != null) {
      return this.superClassMetaClass.getInternalMetaClass().doReverseDivide(lhs, rhs);
    } else {
      return RuntimeMetaClassImpl.NOT_CALLED;
    }
  }

  /* (non-Javadoc)
   * @see ng.runtime.MetaClass#divideEquals(java.lang.Object, java.lang.Object)
   */
  public Object divideEquals(final Object lhs, final Object rhs) throws Throwable {
    setUpMetaClasses();
    
    for (int i = 0; i != this.interfaceMetaClasses.length; i++) {
    final Object result = this.interfaceMetaClasses[i].getInternalMetaClass().doDivideEquals(lhs, rhs);
      
      if (result != RuntimeMetaClassImpl.NOT_CALLED) return result;
    }
    
    if (this.theSuperClass != null) {
      return this.superClassMetaClass.getInternalMetaClass().doDivideEquals(lhs, rhs);
    } else {
      return RuntimeMetaClassImpl.NOT_CALLED;
    }
  }

  /* (non-Javadoc)
   * @see ng.runtime.InstanceHandler#reverseDivideEquals(java.lang.Object, java.lang.Object)
   */
  public Object reverseDivideEquals(final Object lhs, final Object rhs) throws Throwable {
    setUpMetaClasses();
    
    for (int i = 0; i != this.interfaceMetaClasses.length; i++) {
    final Object result = this.interfaceMetaClasses[i].getInternalMetaClass().doReverseDivideEquals(lhs, rhs);
      
      if (result != RuntimeMetaClassImpl.NOT_CALLED) return result;
    }
    
    if (this.theSuperClass != null) {
      return this.superClassMetaClass.getInternalMetaClass().doReverseDivideEquals(lhs, rhs);
    } else {
      return RuntimeMetaClassImpl.NOT_CALLED;
    }
  }

  /* (non-Javadoc)
   * @see ng.runtime.MetaClass#equals(java.lang.Object, java.lang.Object)
   */
  public Object equals(final Object lhs, final Object rhs) throws Throwable {
    setUpMetaClasses();
    
    for (int i = 0; i != this.interfaceMetaClasses.length; i++) {
    final Object result = this.interfaceMetaClasses[i].getInternalMetaClass().doEquals(lhs, rhs);
      
      if (result != RuntimeMetaClassImpl.NOT_CALLED) return result;
    }
    
    if (this.theSuperClass != null) {
      return this.superClassMetaClass.getInternalMetaClass().doEquals(lhs, rhs);
    } else {
      return RuntimeMetaClassImpl.NOT_CALLED;
    }
  }

  /* (non-Javadoc)
   * @see ng.runtime.InstanceHandler#reverseEquals(java.lang.Object, java.lang.Object)
   */
  public Object reverseEquals(final Object lhs, final Object rhs) throws Throwable {
    setUpMetaClasses();
    
    for (int i = 0; i != this.interfaceMetaClasses.length; i++) {
    final Object result = this.interfaceMetaClasses[i].getInternalMetaClass().doReverseEquals(lhs, rhs);
      
      if (result != RuntimeMetaClassImpl.NOT_CALLED) return result;
    }
    
    if (this.theSuperClass != null) {
      return this.superClassMetaClass.getInternalMetaClass().doReverseEquals(lhs, rhs);
    } else {
      return RuntimeMetaClassImpl.NOT_CALLED;
    }
  }

  /* (non-Javadoc)
   * @see ng.runtime.InstanceHandler#getAt(ng.runtime.ThreadContext, java.lang.Object, java.lang.Object)
   */
  public Object getAt(final ThreadContext tc, final Object instance, final Object index) throws Throwable {
    setUpMetaClasses();
    
    for (int i = 0; i != this.interfaceMetaClasses.length; i++) {
    final Object result = this.interfaceMetaClasses[i].getInternalMetaClass().doGetAt(tc, instance, index);
      
      if (result != RuntimeMetaClassImpl.NOT_CALLED) return result;
    }
    
    if (this.theSuperClass != null) {
      return this.superClassMetaClass.getInternalMetaClass().doGetAt(tc, instance, index);
    } else {
      return RuntimeMetaClassImpl.NOT_CALLED;
    }
  }

  /* (non-Javadoc)
   * @see ng.runtime.MetaClass#greaterThan(java.lang.Object, java.lang.Object)
   */
  public Object greaterThan(final Object lhs, final Object rhs) throws Throwable {
    setUpMetaClasses();
    
    for (int i = 0; i != this.interfaceMetaClasses.length; i++) {
    final Object result = this.interfaceMetaClasses[i].getInternalMetaClass().doGreaterThan(lhs, rhs);
      
      if (result != RuntimeMetaClassImpl.NOT_CALLED) return result;
    }
    
    if (this.theSuperClass != null) {
      return this.superClassMetaClass.getInternalMetaClass().doGreaterThan(lhs, rhs);
    } else {
      return RuntimeMetaClassImpl.NOT_CALLED;
    }
  }

  /* (non-Javadoc)
   * @see ng.runtime.InstanceHandler#reverseGreaterThan(java.lang.Object, java.lang.Object)
   */
  public Object reverseGreaterThan(final Object lhs, final Object rhs) throws Throwable {
    setUpMetaClasses();
    
    for (int i = 0; i != this.interfaceMetaClasses.length; i++) {
    final Object result = this.interfaceMetaClasses[i].getInternalMetaClass().doReverseGreaterThan(lhs, rhs);
      
      if (result != RuntimeMetaClassImpl.NOT_CALLED) return result;
    }
    
    if (this.theSuperClass != null) {
      return this.superClassMetaClass.getInternalMetaClass().doReverseGreaterThan(lhs, rhs);
    } else {
      return RuntimeMetaClassImpl.NOT_CALLED;
    }
  }

  /* (non-Javadoc)
   * @see ng.runtime.MetaClass#greaterThanOrEquals(java.lang.Object, java.lang.Object)
   */
  public Object greaterThanOrEquals(final Object lhs, final Object rhs) throws Throwable {
    setUpMetaClasses();
    
    for (int i = 0; i != this.interfaceMetaClasses.length; i++) {
    final Object result = this.interfaceMetaClasses[i].getInternalMetaClass().doGreaterThanOrEquals(lhs, rhs);
      
      if (result != RuntimeMetaClassImpl.NOT_CALLED) return result;
    }
    
    if (this.theSuperClass != null) {
      return this.superClassMetaClass.getInternalMetaClass().doGreaterThanOrEquals(lhs, rhs);
    } else {
      return RuntimeMetaClassImpl.NOT_CALLED;
    }
  }

  /* (non-Javadoc)
   * @see ng.runtime.InstanceHandler#reverseGreaterThanOrEquals(java.lang.Object, java.lang.Object)
   */
  public Object reverseGreaterThanOrEquals(final Object lhs, final Object rhs) throws Throwable {
    setUpMetaClasses();
    
    for (int i = 0; i != this.interfaceMetaClasses.length; i++) {
    final Object result = this.interfaceMetaClasses[i].getInternalMetaClass().doReverseGreaterThanOrEquals(lhs, rhs);
      
      if (result != RuntimeMetaClassImpl.NOT_CALLED) return result;
    }
    
    if (this.theSuperClass != null) {
      return this.superClassMetaClass.getInternalMetaClass().doReverseGreaterThanOrEquals(lhs, rhs);
    } else {
      return RuntimeMetaClassImpl.NOT_CALLED;
    }
  }

  /* (non-Javadoc)
   * @see ng.runtime.MetaClass#integerDivide(java.lang.Object, java.lang.Object)
   */
  public Object integerDivide(final Object lhs, final Object rhs) throws Throwable {
    setUpMetaClasses();
    
    for (int i = 0; i != this.interfaceMetaClasses.length; i++) {
    final Object result = this.interfaceMetaClasses[i].getInternalMetaClass().doIntegerDivide(lhs, rhs);
      
      if (result != RuntimeMetaClassImpl.NOT_CALLED) return result;
    }
    
    if (this.theSuperClass != null) {
      return this.superClassMetaClass.getInternalMetaClass().doIntegerDivide(lhs, rhs);
    } else {
      return RuntimeMetaClassImpl.NOT_CALLED;
    }
  }

  /* (non-Javadoc)
   * @see ng.runtime.InstanceHandler#reverseIntegerDivide(java.lang.Object, java.lang.Object)
   */
  public Object reverseIntegerDivide(final Object lhs, final Object rhs) throws Throwable {
    setUpMetaClasses();
    
    for (int i = 0; i != this.interfaceMetaClasses.length; i++) {
    final Object result = this.interfaceMetaClasses[i].getInternalMetaClass().doReverseIntegerDivide(lhs, rhs);
      
      if (result != RuntimeMetaClassImpl.NOT_CALLED) return result;
    }
    
    if (this.theSuperClass != null) {
      return this.superClassMetaClass.getInternalMetaClass().doReverseIntegerDivide(lhs, rhs);
    } else {
      return RuntimeMetaClassImpl.NOT_CALLED;
    }
  }

  /* (non-Javadoc)
   * @see ng.runtime.MetaClass#integerDivideEquals(java.lang.Object, java.lang.Object)
   */
  public Object integerDivideEquals(final Object lhs, final Object rhs) throws Throwable {
    setUpMetaClasses();
    
    for (int i = 0; i != this.interfaceMetaClasses.length; i++) {
    final Object result = this.interfaceMetaClasses[i].getInternalMetaClass().doDivideEquals(lhs, rhs);
      
      if (result != RuntimeMetaClassImpl.NOT_CALLED) return result;
    }
    
    if (this.theSuperClass != null) {
      return this.superClassMetaClass.getInternalMetaClass().doDivideEquals(lhs, rhs);
    } else {
      return RuntimeMetaClassImpl.NOT_CALLED;
    }
  }

  /* (non-Javadoc)
   * @see ng.runtime.InstanceHandler#reverseIntegerDivideEquals(java.lang.Object, java.lang.Object)
   */
  public Object reverseIntegerDivideEquals(final Object lhs, final Object rhs) throws Throwable {
    setUpMetaClasses();
    
    for (int i = 0; i != this.interfaceMetaClasses.length; i++) {
    final Object result = this.interfaceMetaClasses[i].getInternalMetaClass().doReverseIntegerDivideEquals(lhs, rhs);
      
      if (result != RuntimeMetaClassImpl.NOT_CALLED) return result;
    }
    
    if (this.theSuperClass != null) {
      return this.superClassMetaClass.getInternalMetaClass().doReverseIntegerDivideEquals(lhs, rhs);
    } else {
      return RuntimeMetaClassImpl.NOT_CALLED;
    }
  }

  /* (non-Javadoc)
   * @see ng.runtime.MetaClass#isCase(java.lang.Object, java.lang.Object)
   */
  public Object isCase(final Object instance, final Object rhs) throws Throwable {
    setUpMetaClasses();
    
    for (int i = 0; i != this.interfaceMetaClasses.length; i++) {
    final Object result = this.interfaceMetaClasses[i].getInternalMetaClass().doIsCase(instance, rhs);
      
      if (result != RuntimeMetaClassImpl.NOT_CALLED) return result;
    }
    
    if (this.theSuperClass != null) {
      return this.superClassMetaClass.getInternalMetaClass().doIsCase(instance, rhs);
    } else {
      return RuntimeMetaClassImpl.NOT_CALLED;
    }
  }

  /* (non-Javadoc)
   * @see ng.runtime.MetaClass#isInstanceof(java.lang.Object, java.lang.Class)
   */
  public Object isInstanceof(final Object instance, final Class type) throws Throwable {
    setUpMetaClasses();
    
    for (int i = 0; i != this.interfaceMetaClasses.length; i++) {
    final Object result = this.interfaceMetaClasses[i].getInternalMetaClass().doIsInstanceof(instance, type);
      
      if (result != RuntimeMetaClassImpl.NOT_CALLED) return result;
    }
    
    if (this.theSuperClass != null) {
      return this.superClassMetaClass.getInternalMetaClass().doIsInstanceof(instance, type);
    } else {
      return RuntimeMetaClassImpl.NOT_CALLED;
    }
  }

  /* (non-Javadoc)
   * @see ng.runtime.MetaClass#leftShift(java.lang.Object, java.lang.Object)
   */
  public Object leftShift(final Object lhs, final Object rhs) throws Throwable {
    setUpMetaClasses();
    
    for (int i = 0; i != this.interfaceMetaClasses.length; i++) {
    final Object result = this.interfaceMetaClasses[i].getInternalMetaClass().doLeftShift(lhs, rhs);
      
      if (result != RuntimeMetaClassImpl.NOT_CALLED) return result;
    }
    
    if (this.theSuperClass != null) {
      return this.superClassMetaClass.getInternalMetaClass().doLeftShift(lhs, rhs);
    } else {
      return RuntimeMetaClassImpl.NOT_CALLED;
    }
  }

  /* (non-Javadoc)
   * @see ng.runtime.InstanceHandler#reverseLeftShift(java.lang.Object, java.lang.Object)
   */
  public Object reverseLeftShift(final Object lhs, final Object rhs) throws Throwable {
    setUpMetaClasses();
    
    for (int i = 0; i != this.interfaceMetaClasses.length; i++) {
    final Object result = this.interfaceMetaClasses[i].getInternalMetaClass().doReverseLeftShift(lhs, rhs);
      
      if (result != RuntimeMetaClassImpl.NOT_CALLED) return result;
    }
    
    if (this.theSuperClass != null) {
      return this.superClassMetaClass.getInternalMetaClass().doReverseLeftShift(lhs, rhs);
    } else {
      return RuntimeMetaClassImpl.NOT_CALLED;
    }
  }

  /* (non-Javadoc)
   * @see ng.runtime.MetaClass#leftShiftEquals(java.lang.Object, java.lang.Object)
   */
  public Object leftShiftEquals(final Object lhs, final Object rhs) throws Throwable {
    setUpMetaClasses();
    
    for (int i = 0; i != this.interfaceMetaClasses.length; i++) {
    final Object result = this.interfaceMetaClasses[i].getInternalMetaClass().doLeftShiftEquals(lhs, rhs);
      
      if (result != RuntimeMetaClassImpl.NOT_CALLED) return result;
    }
    
    if (this.theSuperClass != null) {
      return this.superClassMetaClass.getInternalMetaClass().doLeftShiftEquals(lhs, rhs);
    } else {
      return RuntimeMetaClassImpl.NOT_CALLED;
    }
  }

  /* (non-Javadoc)
   * @see ng.runtime.InstanceHandler#reverseLeftShiftEquals(java.lang.Object, java.lang.Object)
   */
  public Object reverseLeftShiftEquals(final Object lhs, final Object rhs) throws Throwable {
    setUpMetaClasses();
    
    for (int i = 0; i != this.interfaceMetaClasses.length; i++) {
    final Object result = this.interfaceMetaClasses[i].getInternalMetaClass().doReverseLeftShiftEquals(lhs, rhs);
      
      if (result != RuntimeMetaClassImpl.NOT_CALLED) return result;
    }
    
    if (this.theSuperClass != null) {
      return this.superClassMetaClass.getInternalMetaClass().doReverseLeftShiftEquals(lhs, rhs);
    } else {
      return RuntimeMetaClassImpl.NOT_CALLED;
    }
  }

  /* (non-Javadoc)
   * @see ng.runtime.MetaClass#lessThan(java.lang.Object, java.lang.Object)
   */
  public Object lessThan(final Object lhs, final Object rhs) throws Throwable {
    setUpMetaClasses();
    
    for (int i = 0; i != this.interfaceMetaClasses.length; i++) {
    final Object result = this.interfaceMetaClasses[i].getInternalMetaClass().doLessThan(lhs, rhs);
      
      if (result != RuntimeMetaClassImpl.NOT_CALLED) return result;
    }
    
    if (this.theSuperClass != null) {
      return this.superClassMetaClass.getInternalMetaClass().doLessThan(lhs, rhs);
    } else {
      return RuntimeMetaClassImpl.NOT_CALLED;
    }
  }

  /* (non-Javadoc)
   * @see ng.runtime.InstanceHandler#reverseLessThan(java.lang.Object, java.lang.Object)
   */
  public Object reverseLessThan(final Object lhs, final Object rhs) throws Throwable {
    setUpMetaClasses();
    
    for (int i = 0; i != this.interfaceMetaClasses.length; i++) {
    final Object result = this.interfaceMetaClasses[i].getInternalMetaClass().doReverseLessThan(lhs, rhs);
      
      if (result != RuntimeMetaClassImpl.NOT_CALLED) return result;
    }
    
    if (this.theSuperClass != null) {
      return this.superClassMetaClass.getInternalMetaClass().doReverseLessThan(lhs, rhs);
    } else {
      return RuntimeMetaClassImpl.NOT_CALLED;
    }
  }

  /* (non-Javadoc)
   * @see ng.runtime.MetaClass#lessThanOrEquals(java.lang.Object, java.lang.Object)
   */
  public Object lessThanOrEquals(final Object lhs, final Object rhs) throws Throwable {
    setUpMetaClasses();
    
    for (int i = 0; i != this.interfaceMetaClasses.length; i++) {
    final Object result = this.interfaceMetaClasses[i].getInternalMetaClass().doLessThanOrEquals(lhs, rhs);
      
      if (result != RuntimeMetaClassImpl.NOT_CALLED) return result;
    }
    
    if (this.theSuperClass != null) {
      return this.superClassMetaClass.getInternalMetaClass().doLessThanOrEquals(lhs, rhs);
    } else {
      return RuntimeMetaClassImpl.NOT_CALLED;
    }
  }

  /* (non-Javadoc)
   * @see ng.runtime.InstanceHandler#reverseLessThanOrEquals(java.lang.Object, java.lang.Object)
   */
  public Object reverseLessThanOrEquals(final Object lhs, final Object rhs) throws Throwable {
    setUpMetaClasses();
    
    for (int i = 0; i != this.interfaceMetaClasses.length; i++) {
    final Object result = this.interfaceMetaClasses[i].getInternalMetaClass().doReverseLessThanOrEquals(lhs, rhs);
      
      if (result != RuntimeMetaClassImpl.NOT_CALLED) return result;
    }
    
    if (this.theSuperClass != null) {
      return this.superClassMetaClass.getInternalMetaClass().doReverseLessThanOrEquals(lhs, rhs);
    } else {
      return RuntimeMetaClassImpl.NOT_CALLED;
    }
  }

  /* (non-Javadoc)
   * @see ng.runtime.MetaClass#logicalRightShift(java.lang.Object, java.lang.Object)
   */
  public Object logicalRightShift(final Object lhs, final Object rhs) throws Throwable {
    setUpMetaClasses();
    
    for (int i = 0; i != this.interfaceMetaClasses.length; i++) {
    final Object result = this.interfaceMetaClasses[i].getInternalMetaClass().doLogicalRightShift(lhs, rhs);
      
      if (result != RuntimeMetaClassImpl.NOT_CALLED) return result;
    }
    
    if (this.theSuperClass != null) {
      return this.superClassMetaClass.getInternalMetaClass().doLogicalRightShift(lhs, rhs);
    } else {
      return RuntimeMetaClassImpl.NOT_CALLED;
    }
  }

  /* (non-Javadoc)
   * @see ng.runtime.InstanceHandler#reverseLogicalRightShift(java.lang.Object, java.lang.Object)
   */
  public Object reverseLogicalRightShift(final Object lhs, final Object rhs) throws Throwable {
    setUpMetaClasses();
    
    for (int i = 0; i != this.interfaceMetaClasses.length; i++) {
    final Object result = this.interfaceMetaClasses[i].getInternalMetaClass().doReverseLogicalRightShift(lhs, rhs);
      
      if (result != RuntimeMetaClassImpl.NOT_CALLED) return result;
    }
    
    if (this.theSuperClass != null) {
      return this.superClassMetaClass.getInternalMetaClass().doReverseLogicalRightShift(lhs, rhs);
    } else {
      return RuntimeMetaClassImpl.NOT_CALLED;
    }
  }

  /* (non-Javadoc)
   * @see ng.runtime.MetaClass#logicalRightShiftEquals(java.lang.Object, java.lang.Object)
   */
  public Object logicalRightShiftEquals(final Object lhs, final Object rhs) throws Throwable {
    setUpMetaClasses();
    
    for (int i = 0; i != this.interfaceMetaClasses.length; i++) {
    final Object result = this.interfaceMetaClasses[i].getInternalMetaClass().doLogicalRightShiftEquals(lhs, rhs);
      
      if (result != RuntimeMetaClassImpl.NOT_CALLED) return result;
    }
    
    if (this.theSuperClass != null) {
      return this.superClassMetaClass.getInternalMetaClass().doLogicalRightShiftEquals(lhs, rhs);
    } else {
      return RuntimeMetaClassImpl.NOT_CALLED;
    }
  }

  /* (non-Javadoc)
   * @see ng.runtime.InstanceHandler#reverseLogicalRightShiftEquals(java.lang.Object, java.lang.Object)
   */
  public Object reverseLogicalRightShiftEquals(final Object lhs, final Object rhs) throws Throwable {
    setUpMetaClasses();
    
    for (int i = 0; i != this.interfaceMetaClasses.length; i++) {
    final Object result = this.interfaceMetaClasses[i].getInternalMetaClass().doReverseLogicalRightShiftEquals(lhs, rhs);
      
      if (result != RuntimeMetaClassImpl.NOT_CALLED) return result;
    }
    
    if (this.theSuperClass != null) {
      return this.superClassMetaClass.getInternalMetaClass().doReverseLogicalRightShiftEquals(lhs, rhs);
    } else {
      return RuntimeMetaClassImpl.NOT_CALLED;
    }
  }

  /* (non-Javadoc)
   * @see ng.runtime.MetaClass#multiply(java.lang.Object, java.lang.Object)
   */
  public Object multiply(final Object lhs, final Object rhs) throws Throwable {
    setUpMetaClasses();
    
    for (int i = 0; i != this.interfaceMetaClasses.length; i++) {
    final Object result = this.interfaceMetaClasses[i].getInternalMetaClass().doMultiply(lhs, rhs);
      
      if (result != RuntimeMetaClassImpl.NOT_CALLED) return result;
    }
    
    if (this.theSuperClass != null) {
      return this.superClassMetaClass.getInternalMetaClass().doMultiply(lhs, rhs);
    } else {
      return RuntimeMetaClassImpl.NOT_CALLED;
    }
  }

  /* (non-Javadoc)
   * @see ng.runtime.InstanceHandler#reverseMultiply(java.lang.Object, java.lang.Object)
   */
  public Object reverseMultiply(final Object lhs, final Object rhs) throws Throwable {
    setUpMetaClasses();
    
    for (int i = 0; i != this.interfaceMetaClasses.length; i++) {
    final Object result = this.interfaceMetaClasses[i].getInternalMetaClass().doReverseMultiply(lhs, rhs);
      
      if (result != RuntimeMetaClassImpl.NOT_CALLED) return result;
    }
    
    if (this.theSuperClass != null) {
      return this.superClassMetaClass.getInternalMetaClass().doReverseMultiply(lhs, rhs);
    } else {
      return RuntimeMetaClassImpl.NOT_CALLED;
    }
  }

  /* (non-Javadoc)
   * @see ng.runtime.MetaClass#multiplyEquals(java.lang.Object, java.lang.Object)
   */
  public Object multiplyEquals(final Object lhs, final Object rhs) throws Throwable {
    setUpMetaClasses();
    
    for (int i = 0; i != this.interfaceMetaClasses.length; i++) {
    final Object result = this.interfaceMetaClasses[i].getInternalMetaClass().doMultiplyEquals(lhs, rhs);
      
      if (result != RuntimeMetaClassImpl.NOT_CALLED) return result;
    }
    
    if (this.theSuperClass != null) {
      return this.superClassMetaClass.getInternalMetaClass().doMultiplyEquals(lhs, rhs);
    } else {
      return RuntimeMetaClassImpl.NOT_CALLED;
    }
  }

  /* (non-Javadoc)
   * @see ng.runtime.InstanceHandler#reverseMultiplyEquals(java.lang.Object, java.lang.Object)
   */
  public Object reverseMultiplyEquals(final Object lhs, final Object rhs) throws Throwable {
    setUpMetaClasses();
    
    for (int i = 0; i != this.interfaceMetaClasses.length; i++) {
    final Object result = this.interfaceMetaClasses[i].getInternalMetaClass().doReverseMultiplyEquals(lhs, rhs);
      
      if (result != RuntimeMetaClassImpl.NOT_CALLED) return result;
    }
    
    if (this.theSuperClass != null) {
      return this.superClassMetaClass.getInternalMetaClass().doReverseMultiplyEquals(lhs, rhs);
    } else {
      return RuntimeMetaClassImpl.NOT_CALLED;
    }
  }

  /* (non-Javadoc)
   * @see ng.runtime.MetaClass#not(java.lang.Object)
   */
  public Object not(final Object operand) throws Throwable {
    setUpMetaClasses();
    
    for (int i = 0; i != this.interfaceMetaClasses.length; i++) {
    final Object result = this.interfaceMetaClasses[i].getInternalMetaClass().doNot(operand);
      
      if (result != RuntimeMetaClassImpl.NOT_CALLED) return result;
    }
    
    if (this.theSuperClass != null) {
      return this.superClassMetaClass.getInternalMetaClass().doNot(operand);
    } else {
      return RuntimeMetaClassImpl.NOT_CALLED;
    }
  }

  /* (non-Javadoc)
   * @see ng.runtime.MetaClass#notEquals(java.lang.Object, java.lang.Object)
   */
  public Object notEquals(final Object lhs, final Object rhs) throws Throwable {
    setUpMetaClasses();
    
    for (int i = 0; i != this.interfaceMetaClasses.length; i++) {
    final Object result = this.interfaceMetaClasses[i].getInternalMetaClass().doNotEquals(lhs, rhs);
      
      if (result != RuntimeMetaClassImpl.NOT_CALLED) return result;
    }
    
    if (this.theSuperClass != null) {
      return this.superClassMetaClass.getInternalMetaClass().doNotEquals(lhs, rhs);
    } else {
      return RuntimeMetaClassImpl.NOT_CALLED;
    }
  }

  /* (non-Javadoc)
   * @see ng.runtime.InstanceHandler#reverseNotEquals(java.lang.Object, java.lang.Object)
   */
  public Object reverseNotEquals(final Object lhs, final Object rhs) throws Throwable {
    setUpMetaClasses();
    
    for (int i = 0; i != this.interfaceMetaClasses.length; i++) {
    final Object result = this.interfaceMetaClasses[i].getInternalMetaClass().doReverseNotEquals(lhs, rhs);
      
      if (result != RuntimeMetaClassImpl.NOT_CALLED) return result;
    }
    
    if (this.theSuperClass != null) {
      return this.superClassMetaClass.getInternalMetaClass().doReverseNotEquals(lhs, rhs);
    } else {
      return RuntimeMetaClassImpl.NOT_CALLED;
    }
  }

  /* (non-Javadoc)
   * @see ng.runtime.MetaClass#or(java.lang.Object, java.lang.Object)
   */
  public Object or(final Object lhs, final Object rhs) throws Throwable {
    setUpMetaClasses();
    
    for (int i = 0; i != this.interfaceMetaClasses.length; i++) {
    final Object result = this.interfaceMetaClasses[i].getInternalMetaClass().doOr(lhs, rhs);
      
      if (result != RuntimeMetaClassImpl.NOT_CALLED) return result;
    }
    
    if (this.theSuperClass != null) {
      return this.superClassMetaClass.getInternalMetaClass().doOr(lhs, rhs);
    } else {
      return RuntimeMetaClassImpl.NOT_CALLED;
    }
  }

  /* (non-Javadoc)
   * @see ng.runtime.InstanceHandler#reverseOr(java.lang.Object, java.lang.Object)
   */
  public Object reverseOr(final Object lhs, final Object rhs) throws Throwable {
    setUpMetaClasses();
    
    for (int i = 0; i != this.interfaceMetaClasses.length; i++) {
    final Object result = this.interfaceMetaClasses[i].getInternalMetaClass().doReverseOr(lhs, rhs);
      
      if (result != RuntimeMetaClassImpl.NOT_CALLED) return result;
    }
    
    if (this.theSuperClass != null) {
      return this.superClassMetaClass.getInternalMetaClass().doReverseOr(lhs, rhs);
    } else {
      return RuntimeMetaClassImpl.NOT_CALLED;
    }
  }

  /* (non-Javadoc)
   * @see ng.runtime.MetaClass#orEquals(java.lang.Object, java.lang.Object)
   */
  public Object orEquals(final Object lhs, final Object rhs) throws Throwable {
    setUpMetaClasses();
    
    for (int i = 0; i != this.interfaceMetaClasses.length; i++) {
    final Object result = this.interfaceMetaClasses[i].getInternalMetaClass().doOrEquals(lhs, rhs);
      
      if (result != RuntimeMetaClassImpl.NOT_CALLED) return result;
    }
    
    if (this.theSuperClass != null) {
      return this.superClassMetaClass.getInternalMetaClass().doOrEquals(lhs, rhs);
    } else {
      return RuntimeMetaClassImpl.NOT_CALLED;
    }
  }

  /* (non-Javadoc)
   * @see ng.runtime.InstanceHandler#reverseOrEquals(java.lang.Object, java.lang.Object)
   */
  public Object reverseOrEquals(final Object lhs, final Object rhs) throws Throwable {
    setUpMetaClasses();
    
    for (int i = 0; i != this.interfaceMetaClasses.length; i++) {
    final Object result = this.interfaceMetaClasses[i].getInternalMetaClass().doReverseOrEquals(lhs, rhs);
      
      if (result != RuntimeMetaClassImpl.NOT_CALLED) return result;
    }
    
    if (this.theSuperClass != null) {
      return this.superClassMetaClass.getInternalMetaClass().doReverseOrEquals(lhs, rhs);
    } else {
      return RuntimeMetaClassImpl.NOT_CALLED;
    }
  }

  /* (non-Javadoc)
   * @see ng.runtime.MetaClass#postfixDecrement(java.lang.Object)
   */
  public Object postfixDecrement(final Object operand) throws Throwable {
    setUpMetaClasses();
    
    for (int i = 0; i != this.interfaceMetaClasses.length; i++) {
    final Object result = this.interfaceMetaClasses[i].getInternalMetaClass().doPostfixDecrement(operand);
      
      if (result != RuntimeMetaClassImpl.NOT_CALLED) return result;
    }
    
    if (this.theSuperClass != null) {
      return this.superClassMetaClass.getInternalMetaClass().doPostfixDecrement(operand);
    } else {
      return RuntimeMetaClassImpl.NOT_CALLED;
    }
  }

  /* (non-Javadoc)
   * @see ng.runtime.MetaClass#postfixIncrement(java.lang.Object)
   */
  public Object postfixIncrement(final Object operand) throws Throwable {
    setUpMetaClasses();
    
    for (int i = 0; i != this.interfaceMetaClasses.length; i++) {
    final Object result = this.interfaceMetaClasses[i].getInternalMetaClass().doPostfixIncrement(operand);
      
      if (result != RuntimeMetaClassImpl.NOT_CALLED) return result;
    }
    
    if (this.theSuperClass != null) {
      return this.superClassMetaClass.getInternalMetaClass().doPostfixIncrement(operand);
    } else {
      return RuntimeMetaClassImpl.NOT_CALLED;
    }
  }

  /* (non-Javadoc)
   * @see ng.runtime.MetaClass#prefixDecrement(java.lang.Object)
   */
  public Object prefixDecrement(final Object operand) throws Throwable {
    setUpMetaClasses();
    
    for (int i = 0; i != this.interfaceMetaClasses.length; i++) {
    final Object result = this.interfaceMetaClasses[i].getInternalMetaClass().doPrefixDecrement(operand);
      
      if (result != RuntimeMetaClassImpl.NOT_CALLED) return result;
    }
    
    if (this.theSuperClass != null) {
      return this.superClassMetaClass.getInternalMetaClass().doPrefixDecrement(operand);
    } else {
      return RuntimeMetaClassImpl.NOT_CALLED;
    }
  }

  /* (non-Javadoc)
   * @see ng.runtime.MetaClass#prefixIncrement(java.lang.Object)
   */
  public Object prefixIncrement(final Object operand) throws Throwable {
    setUpMetaClasses();
    
    for (int i = 0; i != this.interfaceMetaClasses.length; i++) {
    final Object result = this.interfaceMetaClasses[i].getInternalMetaClass().doPrefixIncrement(operand);
      
      if (result != RuntimeMetaClassImpl.NOT_CALLED) return result;
    }
    
    if (this.theSuperClass != null) {
      return this.superClassMetaClass.getInternalMetaClass().doPrefixIncrement(operand);
    } else {
      return RuntimeMetaClassImpl.NOT_CALLED;
    }
  }

  /* (non-Javadoc)
   * @see ng.runtime.InstanceHandler#putAt(ng.runtime.ThreadContext, java.lang.Object, java.lang.Object)
   */
  public Object putAt(final ThreadContext tc, final Object instance, final Object index) throws Throwable {
    setUpMetaClasses();
    
    for (int i = 0; i != this.interfaceMetaClasses.length; i++) {
    final Object result = this.interfaceMetaClasses[i].getInternalMetaClass().doPutAt(tc, instance, index);
      
      if (result != RuntimeMetaClassImpl.NOT_CALLED) return result;
    }
    
    if (this.theSuperClass != null) {
      return this.superClassMetaClass.getInternalMetaClass().doPutAt(tc, instance, index);
    } else {
      return RuntimeMetaClassImpl.NOT_CALLED;
    }
  }

  /* (non-Javadoc)
   * @see ng.runtime.MetaClass#remainder(java.lang.Object, java.lang.Object)
   */
  public Object remainder(final Object lhs, final Object rhs) throws Throwable {
    setUpMetaClasses();
    
    for (int i = 0; i != this.interfaceMetaClasses.length; i++) {
    final Object result = this.interfaceMetaClasses[i].getInternalMetaClass().doRemainder(lhs, rhs);
      
      if (result != RuntimeMetaClassImpl.NOT_CALLED) return result;
    }
    
    if (this.theSuperClass != null) {
      return this.superClassMetaClass.getInternalMetaClass().doRemainder(lhs, rhs);
    } else {
      return RuntimeMetaClassImpl.NOT_CALLED;
    }
  }

  /* (non-Javadoc)
   * @see ng.runtime.InstanceHandler#reverseRemainder(java.lang.Object, java.lang.Object)
   */
  public Object reverseRemainder(final Object lhs, final Object rhs) throws Throwable {
    setUpMetaClasses();
    
    for (int i = 0; i != this.interfaceMetaClasses.length; i++) {
    final Object result = this.interfaceMetaClasses[i].getInternalMetaClass().doReverseRemainder(lhs, rhs);
      
      if (result != RuntimeMetaClassImpl.NOT_CALLED) return result;
    }
    
    if (this.theSuperClass != null) {
      return this.superClassMetaClass.getInternalMetaClass().doReverseRemainder(lhs, rhs);
    } else {
      return RuntimeMetaClassImpl.NOT_CALLED;
    }
  }

  /* (non-Javadoc)
   * @see ng.runtime.MetaClass#remainderEquals(java.lang.Object, java.lang.Object)
   */
  public Object remainderEquals(final Object lhs, final Object rhs) throws Throwable {
    setUpMetaClasses();
    
    for (int i = 0; i != this.interfaceMetaClasses.length; i++) {
    final Object result = this.interfaceMetaClasses[i].getInternalMetaClass().doRemainderEquals(lhs, rhs);
      
      if (result != RuntimeMetaClassImpl.NOT_CALLED) return result;
    }
    
    if (this.theSuperClass != null) {
      return this.superClassMetaClass.getInternalMetaClass().doRemainderEquals(lhs, rhs);
    } else {
      return RuntimeMetaClassImpl.NOT_CALLED;
    }
  }

  /* (non-Javadoc)
   * @see ng.runtime.InstanceHandler#reverseRemainderEquals(java.lang.Object, java.lang.Object)
   */
  public Object reverseRemainderEquals(final Object lhs, final Object rhs) throws Throwable {
    setUpMetaClasses();
    
    for (int i = 0; i != this.interfaceMetaClasses.length; i++) {
    final Object result = this.interfaceMetaClasses[i].getInternalMetaClass().doReverseRemainderEquals(lhs, rhs);
      
      if (result != RuntimeMetaClassImpl.NOT_CALLED) return result;
    }
    
    if (this.theSuperClass != null) {
      return this.superClassMetaClass.getInternalMetaClass().doReverseRemainderEquals(lhs, rhs);
    } else {
      return RuntimeMetaClassImpl.NOT_CALLED;
    }
  }

  /* (non-Javadoc)
   * @see ng.runtime.MetaClass#subtract(java.lang.Object, java.lang.Object)
   */
  public Object subtract(final Object lhs, final Object rhs) throws Throwable {
    setUpMetaClasses();
    
    for (int i = 0; i != this.interfaceMetaClasses.length; i++) {
    final Object result = this.interfaceMetaClasses[i].getInternalMetaClass().doSubtract(lhs, rhs);
      
      if (result != RuntimeMetaClassImpl.NOT_CALLED) return result;
    }
    
    if (this.theSuperClass != null) {
      return this.superClassMetaClass.getInternalMetaClass().doSubtract(lhs, rhs);
    } else {
      return RuntimeMetaClassImpl.NOT_CALLED;
    }
  }

  /* (non-Javadoc)
   * @see ng.runtime.InstanceHandler#reverseSubtract(java.lang.Object, java.lang.Object)
   */
  public Object reverseSubtract(final Object lhs, final Object rhs) throws Throwable {
    setUpMetaClasses();
    
    for (int i = 0; i != this.interfaceMetaClasses.length; i++) {
    final Object result = this.interfaceMetaClasses[i].getInternalMetaClass().doReverseSubtract(lhs, rhs);
      
      if (result != RuntimeMetaClassImpl.NOT_CALLED) return result;
    }
    
    if (this.theSuperClass != null) {
      return this.superClassMetaClass.getInternalMetaClass().doReverseSubtract(lhs, rhs);
    } else {
      return RuntimeMetaClassImpl.NOT_CALLED;
    }
  }

  /* (non-Javadoc)
   * @see ng.runtime.MetaClass#subtractEquals(java.lang.Object, java.lang.Object)
   */
  public Object subtractEquals(final Object lhs, final Object rhs) throws Throwable {
    setUpMetaClasses();
    
    for (int i = 0; i != this.interfaceMetaClasses.length; i++) {
    final Object result = this.interfaceMetaClasses[i].getInternalMetaClass().doSubtractEquals(lhs, rhs);
      
      if (result != RuntimeMetaClassImpl.NOT_CALLED) return result;
    }
    
    if (this.theSuperClass != null) {
      return this.superClassMetaClass.getInternalMetaClass().doSubtractEquals(lhs, rhs);
    } else {
      return RuntimeMetaClassImpl.NOT_CALLED;
    }
  }

  /* (non-Javadoc)
   * @see ng.runtime.InstanceHandler#reverseSubtractEquals(java.lang.Object, java.lang.Object)
   */
  public Object reverseSubtractEquals(final Object lhs, final Object rhs) throws Throwable {
    setUpMetaClasses();
    
    for (int i = 0; i != this.interfaceMetaClasses.length; i++) {
    final Object result = this.interfaceMetaClasses[i].getInternalMetaClass().doReverseSubtractEquals(lhs, rhs);
      
      if (result != RuntimeMetaClassImpl.NOT_CALLED) return result;
    }
    
    if (this.theSuperClass != null) {
      return this.superClassMetaClass.getInternalMetaClass().doReverseSubtractEquals(lhs, rhs);
    } else {
      return RuntimeMetaClassImpl.NOT_CALLED;
    }
  }

  /* (non-Javadoc)
   * @see ng.runtime.MetaClass#unaryMinus(java.lang.Object)
   */
  public Object unaryMinus(final Object operand) throws Throwable {
    setUpMetaClasses();
    
    for (int i = 0; i != this.interfaceMetaClasses.length; i++) {
    final Object result = this.interfaceMetaClasses[i].getInternalMetaClass().doUnaryMinus(operand);
      
      if (result != RuntimeMetaClassImpl.NOT_CALLED) return result;
    }
    
    if (this.theSuperClass != null) {
      return this.superClassMetaClass.getInternalMetaClass().doUnaryMinus(operand);
    } else {
      return RuntimeMetaClassImpl.NOT_CALLED;
    }
  }

  /* (non-Javadoc)
   * @see ng.runtime.MetaClass#unaryPlus(java.lang.Object)
   */
  public Object unaryPlus(final Object operand) throws Throwable {
    setUpMetaClasses();
    
    for (int i = 0; i != this.interfaceMetaClasses.length; i++) {
    final Object result = this.interfaceMetaClasses[i].getInternalMetaClass().doUnaryPlus(operand);
      
      if (result != RuntimeMetaClassImpl.NOT_CALLED) return result;
    }
    
    if (this.theSuperClass != null) {
      return this.superClassMetaClass.getInternalMetaClass().doUnaryPlus(operand);
    } else {
      return RuntimeMetaClassImpl.NOT_CALLED;
    }
  }

  /* (non-Javadoc)
   * @see ng.runtime.MetaClass#xor(java.lang.Object, java.lang.Object)
   */
  public Object xor(final Object lhs, final Object rhs) throws Throwable {
    setUpMetaClasses();
    
    for (int i = 0; i != this.interfaceMetaClasses.length; i++) {
    final Object result = this.interfaceMetaClasses[i].getInternalMetaClass().doXor(lhs, rhs);
      
      if (result != RuntimeMetaClassImpl.NOT_CALLED) return result;
    }
    
    if (this.theSuperClass != null) {
      return this.superClassMetaClass.getInternalMetaClass().doXor(lhs, rhs);
    } else {
      return RuntimeMetaClassImpl.NOT_CALLED;
    }
  }

  /* (non-Javadoc)
   * @see ng.runtime.InstanceHandler#reverseXor(java.lang.Object, java.lang.Object)
   */
  public Object reverseXor(final Object lhs, final Object rhs) throws Throwable {
    setUpMetaClasses();
    
    for (int i = 0; i != this.interfaceMetaClasses.length; i++) {
    final Object result = this.interfaceMetaClasses[i].getInternalMetaClass().doReverseXor(lhs, rhs);
      
      if (result != RuntimeMetaClassImpl.NOT_CALLED) return result;
    }
    
    if (this.theSuperClass != null) {
      return this.superClassMetaClass.getInternalMetaClass().doReverseXor(lhs, rhs);
    } else {
      return RuntimeMetaClassImpl.NOT_CALLED;
    }
  }

  /* (non-Javadoc)
   * @see ng.runtime.MetaClass#xorEquals(java.lang.Object, java.lang.Object)
   */
  public Object xorEquals(final Object lhs, final Object rhs) throws Throwable {
    setUpMetaClasses();
    
    for (int i = 0; i != this.interfaceMetaClasses.length; i++) {
    final Object result = this.interfaceMetaClasses[i].getInternalMetaClass().doXorEquals(lhs, rhs);
      
      if (result != RuntimeMetaClassImpl.NOT_CALLED) return result;
    }
    
    if (this.theSuperClass != null) {
      return this.superClassMetaClass.getInternalMetaClass().doXorEquals(lhs, rhs);
    } else {
      return RuntimeMetaClassImpl.NOT_CALLED;
    }
  }

  /* (non-Javadoc)
   * @see ng.runtime.InstanceHandler#reverseXorEquals(java.lang.Object, java.lang.Object)
   */
  public Object reverseXorEquals(final Object lhs, final Object rhs) throws Throwable {
    setUpMetaClasses();
    
    for (int i = 0; i != this.interfaceMetaClasses.length; i++) {
    final Object result = this.interfaceMetaClasses[i].getInternalMetaClass().doReverseXorEquals(lhs, rhs);
      
      if (result != RuntimeMetaClassImpl.NOT_CALLED) return result;
    }
    
    if (this.theSuperClass != null) {
      return this.superClassMetaClass.getInternalMetaClass().doReverseXorEquals(lhs, rhs);
    } else {
      return RuntimeMetaClassImpl.NOT_CALLED;
    }
  }
}
