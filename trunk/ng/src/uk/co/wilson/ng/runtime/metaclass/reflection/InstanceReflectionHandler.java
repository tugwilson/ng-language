package uk.co.wilson.ng.runtime.metaclass.reflection;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

import ng.lang.NgRuntimeException;
import ng.lang.NgSystem;
import ng.runtime.InstanceHandler;
import ng.runtime.MetaClass;
import ng.runtime.MetaMethod;
import ng.runtime.RuntimeMetaClass;
import uk.co.wilson.ng.runtime.metaclass.RuntimeMetaClassImpl;
import uk.co.wilson.ng.runtime.metaclass.reflection.fields.*;
import uk.co.wilson.ng.runtime.metaclass.reflection.methods.*;

/**
 * @author tug
 *
 */
public class InstanceReflectionHandler implements InstanceHandler {
  private static class MetaMethodMap extends HashMap<String, MetaMethod> {
    private static final long serialVersionUID = 1L;

    /**
     * @param key
     * @return
     */
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
  
  private final Class theClass;
  private final Class theSuperClass;
  private final MetaMethod call = noMethod;
  private final MetaMethod add = noMethod;
  private final MetaMethod reverseAdd = noMethod;
  private final MetaMethod addEquals = noMethod;
  private final MetaMethod reverseAddEquals = noMethod;
  private final MetaMethod and = noMethod;
  private final MetaMethod reverseAnd = noMethod;
  private final MetaMethod andEquals = noMethod;
  private final MetaMethod reverseAndEquals = noMethod;
  private final MetaMethod arithmeticRightShift = noMethod;
  private final MetaMethod reverseArithmeticRightShift = noMethod;
  private final MetaMethod arithmeticRightShiftEquals = noMethod;
  private final MetaMethod reverseArithmeticRightShiftEquals = noMethod;
  private final MetaMethod asType = noMethod;
  private final MetaMethod compare = noMethod;
  private final MetaMethod reverseCompare = noMethod;
  private final MetaMethod complement = noMethod;
  private final MetaMethod divide = noMethod;
  private final MetaMethod reverseDivide = noMethod;
  private final MetaMethod divideEquals = noMethod;
  private final MetaMethod reverseDivideEquals = noMethod;
  private final MetaMethod equals = noMethod;
  private final MetaMethod reverseEquals = noMethod;
  private final MetaMethod getAt = noMethod;
  private final MetaMethod greaterThan = noMethod;
  private final MetaMethod reverseGreaterThan = noMethod;
  private final MetaMethod greaterThanOrEquals = noMethod;
  private final MetaMethod reverseGreaterThanOrEquals = noMethod;
  private final MetaMethod integerDivide = noMethod;
  private final MetaMethod reverseIntegerDivide = noMethod;
  private final MetaMethod integerDivideEquals = noMethod;
  private final MetaMethod reverseIntegerDivideEquals = noMethod;
  private final MetaMethod isCase = noMethod;
  private final MetaMethod isInstanceof = noMethod;
  private final MetaMethod leftShift = noMethod;
  private final MetaMethod reverseLeftShift = noMethod;
  private final MetaMethod leftShiftEquals = noMethod;
  private final MetaMethod reverseLeftShiftEquals = noMethod;
  private final MetaMethod lessThan = noMethod;
  private final MetaMethod reverseLessThan = noMethod;
  private final MetaMethod lessThanOrEquals = noMethod;
  private final MetaMethod reverseLessThanOrEquals = noMethod;
  private final MetaMethod logicalRightShift = noMethod;
  private final MetaMethod reverseLogicalRightShift = noMethod;
  private final MetaMethod logicalRightShiftEquals = noMethod;
  private final MetaMethod reverseLogicalRightShiftEquals = noMethod;
  private final MetaMethod multiply = noMethod;
  private final MetaMethod reverseMultiply = noMethod;
  private final MetaMethod multiplyEquals = noMethod;
  private final MetaMethod reverseMultiplyEquals = noMethod;
  private final MetaMethod not = noMethod;
  private final MetaMethod notEquals = noMethod;
  private final MetaMethod reverseNotEquals = noMethod;
  private final MetaMethod or = noMethod;
  private final MetaMethod reverseOr = noMethod;
  private final MetaMethod orEquals = noMethod;
  private final MetaMethod reverseOrEquals = noMethod;
  private final MetaMethod postfixDecrement = noMethod;
  private final MetaMethod postfixIncrement = noMethod;
  private final MetaMethod prefixDecrement = noMethod;
  private final MetaMethod prefixIncrement = noMethod;
  private final MetaMethod putAt = noMethod;
  private final MetaMethod remainder = noMethod;
  private final MetaMethod reverseRemainder = noMethod;
  private final MetaMethod remainderEquals = noMethod;
  private final MetaMethod reverseRemainderEquals = noMethod;
  private final MetaMethod subtract = noMethod;
  private final MetaMethod reverseSubtract = noMethod;
  private final MetaMethod subtractEquals = noMethod;
  private final MetaMethod reverseSubtractEquals = noMethod;
  private final MetaMethod unaryMinus = noMethod;
  private final MetaMethod unaryPlus = noMethod;
  private final MetaMethod xor = noMethod;
  private final MetaMethod reverseXor = noMethod;
  private final MetaMethod xorEquals = noMethod;
  private final MetaMethod reverseXorEquals = noMethod;
  
  private final Map<String, MetaMethod> zeroParameterMethods = new MetaMethodMap();
  private final Map<String, MetaMethod> oneParameterMethods = new MetaMethodMap();
  private final Map<String, MetaMethod> twoParameterMethods = new MetaMethodMap();
  private final Map<String, MetaMethod> threeParameterMethods = new MetaMethodMap();
  private final Map<String, MetaMethod> fourParameterMethods = new MetaMethodMap();
  private final Map<String, MetaMethod> multiParameterMethods = new MetaMethodMap();
  private final Map<String, MetaMethod> getPropertyMethods = new MetaMethodMap();
  private final Map<String, MetaMethod> setPropertyMethods = new MetaMethodMap();
  private final Map<String, MetaMethod> getFieldMethods = new MetaMethodMap();
  private final Map<String, MetaMethod> setFieldMethods = new MetaMethodMap();
  
  private RuntimeMetaClass superClassMetaClass;
  private RuntimeMetaClass interfaceMetaClasses[];

  /**
   * @param theClass
   */
  /**
   * @param theClass
   */
  public InstanceReflectionHandler(final Class theClass) {
    this.theClass = theClass;
    this.theSuperClass = theClass.getSuperclass();
    
    final Method methods[] = theClass.getDeclaredMethods();
    final Field fields[] = theClass.getDeclaredFields();
    
     Method.setAccessible(methods, true);
     Field.setAccessible(fields, true);
      
     for (int i = 0; i != methods.length; i++) {
     final Method method = methods[i];
     
       if (method.getDeclaringClass() == theClass) {
       final Class returnType = method.getReturnType();
       final MetaMethod metaMethod;
       
         if(returnType == boolean.class) {
           metaMethod = new BooleanMetaMethod(method);
         } else if (returnType == char.class) {
           metaMethod = new CharMetaMethod(method);
         } else if (returnType == byte.class) {
           metaMethod = new ByteMetaMethod(method);
         } else if (returnType == short.class) {
           metaMethod = new ShortMetaMethod(method);
         } else if (returnType == int.class) {
           metaMethod = new IntMetaMethod(method);
         } else if (returnType == long.class) {
           metaMethod = new LongMetaMethod(method);
         } else if (returnType == float.class) {
           metaMethod = new FloatMetaMethod(method);
         } else if (returnType == double.class) {
           metaMethod = new DoubleMetaMethod(method);
         } else if (returnType == Object.class) {
           metaMethod = new UntypedMetaMethod(method);
         } else {
           metaMethod = new TypedMetaMethod(method);
         }
         
         switch(method.getParameterTypes().length) {
           case 0: {
           final String name = method.getName();
           
             this.zeroParameterMethods.put(name, metaMethod);
             
             if (name.startsWith("get") && name.length() > 3) {
               this.getPropertyMethods.put(name.substring(3, 4).toLowerCase() + name.substring(4), metaMethod);
             } else if (name.startsWith("is") && name.length() > 2 && method.getReturnType() == boolean.class) {
               this.getPropertyMethods.put(name.substring(2, 3).toLowerCase() + name.substring(3), metaMethod);
             }
             
             break;
           }
           
           case 1: {
           final String name = method.getName();
             
             this.oneParameterMethods.put(method.getName(), metaMethod);
             
             if (name.startsWith("set") && name.length() > 3) {
               this.setPropertyMethods.put(name.substring(3, 4).toLowerCase() + name.substring(4), metaMethod);
             }
             
             break;
           }
           
           case 2:
             this.twoParameterMethods.put(method.getName(), metaMethod);
             break;
           
           case 3:
             this.threeParameterMethods.put(method.getName(), metaMethod);
             break;
           
           case 4:
             this.fourParameterMethods.put(method.getName(), metaMethod);
             break;
           
           default:
             this.multiParameterMethods.put(method.getName(), metaMethod);
         }
       }
     }
     
     for (int i = 0; i != fields.length; i++) {
     final Field field = fields[i];
     
       if (field.getDeclaringClass() == theClass) {
       final Class fieldType = field.getType();
       
         if(fieldType == boolean.class) {
           this.getFieldMethods.put(field.getName(), new GetBooleanFieldMetaMethod(field));
           this.setFieldMethods.put(field.getName(), new SetBooleanFieldMetaMethod(field));
         } else if (fieldType == char.class) {
           this.getFieldMethods.put(field.getName(), new GetCharFieldMetaMethod(field));
           this.setFieldMethods.put(field.getName(), new SetCharFieldMetaMethod(field));
         } else if (fieldType == byte.class) {
           this.getFieldMethods.put(field.getName(), new GetByteFieldMetaMethod(field));
           this.setFieldMethods.put(field.getName(), new SetByteFieldMetaMethod(field));
         } else if (fieldType == short.class) {
           this.getFieldMethods.put(field.getName(), new GetShortFieldMetaMethod(field));
           this.setFieldMethods.put(field.getName(), new SetShortFieldMetaMethod(field));
         } else if (fieldType == int.class) {
           this.getFieldMethods.put(field.getName(), new GetIntFieldMetaMethod(field));
           this.setFieldMethods.put(field.getName(), new SetIntFieldMetaMethod(field));
         } else if (fieldType == long.class) {
           this.getFieldMethods.put(field.getName(), new GetLongFieldMetaMethod(field));
           this.setFieldMethods.put(field.getName(), new SetLongFieldMetaMethod(field));
         } else if (fieldType == float.class) {
           this.getFieldMethods.put(field.getName(), new GetFloatFieldMetaMethod(field));
           this.setFieldMethods.put(field.getName(), new SetFloatFieldMetaMethod(field));
         } else if (fieldType == double.class) {
           this.getFieldMethods.put(field.getName(), new GetDoubleFieldMetaMethod(field));
           this.setFieldMethods.put(field.getName(), new SetDoubleFieldMetaMethod(field));
         } else if (fieldType == Object.class) {
           this.getFieldMethods.put(field.getName(), new GetUntypedFieldMetaMethod(field));
           this.setFieldMethods.put(field.getName(), new SetUntypedFieldMetaMethod(field));
         } else {
           this.getFieldMethods.put(field.getName(), new GetTypedFieldMetaMethod(field));
           this.setFieldMethods.put(field.getName(), new SetTypedFieldMetaMethod(field));
         }
       }
     }
  }

  /* (non-Javadoc)
   * @see ng.runtime.MetaClass#getMetaClassFor(java.lang.Class)
   */
  @SuppressWarnings("unchecked")
  public MetaClass getMetaClassFor(final Class theClass) {
    // TODO decide what to do here
    //      Do we return the MetaClass for the superclass?
    
    if (this.theClass.isAssignableFrom(theClass)) {
      return this;
    } else {
      throw new NgRuntimeException("cannot cast " + this.theClass.getName() + " to " + theClass.getName());
    }
  }

  /* (non-Javadoc)
   * @see ng.runtime.MetaClass#getRuntimeMetaClass()
   */
  public RuntimeMetaClass getRuntimeMetaClass() {
    // TODO: I'd really like not to have to do this
    throw new NgRuntimeException("Internal Error: can't call getRuntimeMetaClasson InstanceHandler");
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

  /* (non-Javadoc)
   * @see ng.runtime.InstanceHandler#invokeMethod(java.lang.Object, java.lang.String, java.lang.Object[])
   */
  public Object invokeMethod(final Object instance, final String methodName, final Object[] arguments) {
    if(arguments.length <= 4)
      throw new NgRuntimeException("Internal Error invokeMethod called with an array of " + arguments.length +" parameters");
    
    final RuntimeMetaClass argumentMetaClasses[] = new RuntimeMetaClass[arguments.length];
    
    for (int i = 0; i != argumentMetaClasses.length; i++) {
      argumentMetaClasses[i] = NgSystem.metaClassRegistry.getRuntimeMetaClass(arguments[i]);
    }
       
    return selectMethod(this.multiParameterMethods.get(methodName).selectMethod(argumentMetaClasses), methodName, argumentMetaClasses).metaMethod.call(instance, arguments);
  }

  public MetaMethodSelection selectMethod(MetaMethodSelection currentSelection, final String methodName, final RuntimeMetaClass[] argumentMetaClasses) {    
    if (this.theSuperClass != null && this.superClassMetaClass == null) {
      this.superClassMetaClass = NgSystem.metaClassRegistry.getRuntimeMetaClass(this.theSuperClass);
    }
    
    if (this.interfaceMetaClasses == null) {
    final Class interfaces[] = this.theClass.getInterfaces();
    
      this.interfaceMetaClasses = new RuntimeMetaClass[interfaces.length];
      
      for (int i = 0; i != interfaces.length; i++) {
        this.interfaceMetaClasses[i] = NgSystem.metaClassRegistry.getRuntimeMetaClass(interfaces[i]);
      }
    }
    if (currentSelection.score != 0) {
      for (int i = 0; i != this.interfaceMetaClasses.length; i++) {
        currentSelection = this.interfaceMetaClasses[i].selectMethod(currentSelection, methodName, argumentMetaClasses);
      }
      
      if (this.theSuperClass != null) {
        currentSelection = this.superClassMetaClass.selectMethod(currentSelection, methodName, argumentMetaClasses);
      }
    }
    
    return currentSelection;
  }
  
  /* (non-Javadoc)
   * @see ng.runtime.InstanceHandler#invokeMethod(java.lang.Object, java.lang.String)
   */
  public Object invokeMethodQuick(final Object instance, final String methodName) {
    return this.zeroParameterMethods.get(methodName).call(instance);
  }

  /* (non-Javadoc)
   * @see ng.runtime.InstanceHandler#invokeMethod(java.lang.Object, java.lang.String, java.lang.Object)
   */
  public Object invokeMethodQuick(final Object instance, final String methodName, final Object p1) {
    return this.oneParameterMethods.get(methodName).call(instance, p1);
  }

  /* (non-Javadoc)
   * @see ng.runtime.InstanceHandler#invokeMethod(java.lang.Object, java.lang.String, java.lang.Object, java.lang.Object)
   */
  public Object invokeMethodQuick(final Object instance, final String methodName, final Object p1, final Object p2) {
    return this.twoParameterMethods.get(methodName).call(instance, p1, p2);
  }

  /* (non-Javadoc)
   * @see ng.runtime.InstanceHandler#invokeMethod(java.lang.Object, java.lang.String, java.lang.Object, java.lang.Object, java.lang.Object)
   */
  public Object invokeMethodQuick(final Object instance, final String methodName, final Object p1, final Object p2, final Object p3) {
    return this.threeParameterMethods.get(methodName).call(instance, p1, p2, p3);
  }

  /* (non-Javadoc)
   * @see ng.runtime.InstanceHandler#invokeMethod(java.lang.Object, java.lang.String, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object)
   */
  public Object invokeMethodQuick(final Object instance, final String methodName, final Object p1, final Object p2, final Object p3, final Object p4) {
    return this.fourParameterMethods.get(methodName).call(instance, p1, p2, p3, p4);
  }

  /* (non-Javadoc)
   * @see ng.runtime.InstanceHandler#getProperty(java.lang.Object, java.lang.String)
   */
  public Object getProperty(final Object instance, final String propertyName) {
  Object result = this.getPropertyMethods.get(propertyName).call(instance);
    
    if (result == RuntimeMetaClassImpl.NOT_CALLED) {
    result = this.getFieldMethods.get(propertyName).call(instance);
      
      if (result == RuntimeMetaClassImpl.NOT_CALLED) {
        return RuntimeMetaClassImpl.NO_PROPERTY;
      }
    }
    
    return result;
  }

  /* (non-Javadoc)
   * @see ng.runtime.InstanceHandler#setProperty(java.lang.Object, java.lang.String, java.lang.Object)
   */
  public Object setProperty(final Object instance, final String propertyName, final Object newValue) {
  Object result = this.setPropertyMethods.get(propertyName).call(instance, newValue);
 
    if (result == RuntimeMetaClassImpl.NOT_CALLED) {
    result = this.setFieldMethods.get(propertyName).call(instance, newValue);
      
      if (result == RuntimeMetaClassImpl.NOT_CALLED) {
        return RuntimeMetaClassImpl.NO_PROPERTY;
      }
    }
    
    //
    // TODO: review this behaviour
    // if the method is not void we should probably return the actual value returned
    //
    return newValue;
  }

  /* (non-Javadoc)
   * @see ng.runtime.InstanceHandler#getField(java.lang.Object, java.lang.String)
   */
  public Object getField(final Object instance, final String fieldName) {
  final Object result = this.getFieldMethods.get(fieldName).call(instance);
    
    if (result == RuntimeMetaClassImpl.NOT_CALLED) {
      return RuntimeMetaClassImpl.NO_FIELD;
    } else {
      return result;
    }
  }

  /* (non-Javadoc)
   * @see ng.runtime.InstanceHandler#setField(java.lang.Object, java.lang.String, java.lang.Object)
   */
  public Object setField(final Object instance, final String fieldName, final Object newValue) {
    final Object result = this.setFieldMethods.get(fieldName).call(instance, newValue);
    
    if (result == RuntimeMetaClassImpl.NOT_CALLED) {
      return RuntimeMetaClassImpl.NO_FIELD;
    } else {
      return result;
    }
  }

  /* (non-Javadoc)
   * @see ng.runtime.InstanceHandler#call(java.lang.Object, java.lang.Object[])
   */
  public Object call(final Object instance, final Object[] arguments) {
    if(arguments.length <= 4)
      throw new NgRuntimeException("Internal Error call called with an array of " + arguments.length +" parameters");
    
    return this.call.call(instance, arguments);
  }

  /* (non-Javadoc)
   * @see ng.runtime.InstanceHandler#call(java.lang.Object)
   */
  public Object callQuick(final Object instance) {
    return this.call.call(instance);
  }

  /* (non-Javadoc)
   * @see ng.runtime.InstanceHandler#call(java.lang.Object, java.lang.Object)
   */
  public Object callQuick(final Object instance, final Object p1) {
    return this.call.call(instance, p1);
  }

  /* (non-Javadoc)
   * @see ng.runtime.InstanceHandler#call(java.lang.Object, java.lang.Object, java.lang.Object)
   */
  public Object callQuick(final Object instance, final Object p1, final Object p2) {
    return this.call.call(instance, p1, p2);
  }

  /* (non-Javadoc)
   * @see ng.runtime.InstanceHandler#call(java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object)
   */
  public Object callQuick(final Object instance, final Object p1, final Object p2, final Object p3) {
    return this.call.call(instance, p1, p2, p3);
  }

  /* (non-Javadoc)
   * @see ng.runtime.InstanceHandler#call(java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object)
   */
  public Object callQuick(final Object instance, final Object p1, final Object p2, final Object p3, final Object p4) {
    return this.call.call(instance, p1, p2, p3, p4);
  }

  /* (non-Javadoc)
   * @see ng.runtime.MetaClass#add(java.lang.Object, java.lang.Object)
   */
  public Object add(final Object lhs, final Object rhs) {
    return this.add.call(lhs, rhs);
  }

  /* (non-Javadoc)
   * @see ng.runtime.InstanceHandler#reverseAdd(java.lang.Object, java.lang.Object)
   */
  public Object reverseAdd(Object lhs, Object rhs) {
    return this.reverseAdd.call(rhs, lhs);
  }

  /* (non-Javadoc)
   * @see ng.runtime.MetaClass#addEquals(java.lang.Object, java.lang.Object)
   */
  public Object addEquals(final Object lhs, final Object rhs) {
    return this.addEquals.call(lhs, rhs);
  }

  /* (non-Javadoc)
   * @see ng.runtime.InstanceHandler#reverseAddEquals(java.lang.Object, java.lang.Object)
   */
  public Object reverseAddEquals(Object lhs, Object rhs) {
    return this.reverseAddEquals.call(rhs, lhs);
  }

  /* (non-Javadoc)
   * @see ng.runtime.MetaClass#and(java.lang.Object, java.lang.Object)
   */
  public Object and(final Object lhs, final Object rhs) {
    return this.and.call(lhs, rhs);
  }

  /* (non-Javadoc)
   * @see ng.runtime.InstanceHandler#reverseAnd(java.lang.Object, java.lang.Object)
   */
  public Object reverseAnd(Object lhs, Object rhs) {
    return this.reverseAnd.call(rhs, lhs);
  }

  /* (non-Javadoc)
   * @see ng.runtime.MetaClass#andEquals(java.lang.Object, java.lang.Object)
   */
  public Object andEquals(final Object lhs, final Object rhs) {
    return this.andEquals.call(lhs, rhs);
  }

  /* (non-Javadoc)
   * @see ng.runtime.InstanceHandler#reverseAndEquals(java.lang.Object, java.lang.Object)
   */
  public Object reverseAndEquals(Object lhs, Object rhs) {
    return this.reverseAndEquals.call(rhs, lhs);
  }

  /* (non-Javadoc)
   * @see ng.runtime.MetaClass#arithmeticRightShift(java.lang.Object, java.lang.Object)
   */
  public Object arithmeticRightShift(final Object lhs, final Object rhs) {
    return this.arithmeticRightShift.call(lhs, rhs);
  }

  /* (non-Javadoc)
   * @see ng.runtime.InstanceHandler#reverseArithmeticRightShift(java.lang.Object, java.lang.Object)
   */
  public Object reverseArithmeticRightShift(Object lhs, Object rhs) {
    return this.reverseArithmeticRightShift.call(rhs, lhs);
  }

  /* (non-Javadoc)
   * @see ng.runtime.MetaClass#arithmeticRightShiftEquals(java.lang.Object, java.lang.Object)
   */
  public Object arithmeticRightShiftEquals(final Object lhs, final Object rhs) {
    return this.arithmeticRightShiftEquals.call(lhs, rhs);
  }

  /* (non-Javadoc)
   * @see ng.runtime.InstanceHandler#reverseArithmeticRightShiftEquals(java.lang.Object, java.lang.Object)
   */
  public Object reverseArithmeticRightShiftEquals(Object lhs, Object rhs) {
    return this.reverseArithmeticRightShiftEquals.call(rhs, lhs);
  }

  /* (non-Javadoc)
   * @see ng.runtime.MetaClass#asType(java.lang.Object, java.lang.Class)
   */
  public Object asType(final Object instance, Class type) {
    return this.asType.call(instance, type);
  }

  /* (non-Javadoc)
   * @see ng.runtime.MetaClass#compare(java.lang.Object, java.lang.Object)
   */
  public Object compare(final Object lhs, final Object rhs) {
    return this.compare.call(lhs, rhs);
  }

  /* (non-Javadoc)
   * @see ng.runtime.InstanceHandler#reverseCompare(java.lang.Object, java.lang.Object)
   */
  public Object reverseCompare(Object lhs, Object rhs) {
    return this.reverseCompare.call(rhs, lhs);
  }

  /* (non-Javadoc)
   * @see ng.runtime.MetaClass#complement(java.lang.Object)
   */
  public Object complement(final Object instance) {
    return this.complement.call(instance);
  }

  /* (non-Javadoc)
   * @see ng.runtime.MetaClass#divide(java.lang.Object, java.lang.Object)
   */
  public Object divide(final Object lhs, final Object rhs) {
    return this.divide.call(lhs, rhs);
  }

  /* (non-Javadoc)
   * @see ng.runtime.InstanceHandler#reverseDivide(java.lang.Object, java.lang.Object)
   */
  public Object reverseDivide(Object lhs, Object rhs) {
    return this.reverseDivide.call(rhs, lhs);
  }

  /* (non-Javadoc)
   * @see ng.runtime.MetaClass#divideEquals(java.lang.Object, java.lang.Object)
   */
  public Object divideEquals(final Object lhs, final Object rhs) {
    return this.divideEquals.call(lhs, rhs);
  }

  /* (non-Javadoc)
   * @see ng.runtime.InstanceHandler#reverseDivideEquals(java.lang.Object, java.lang.Object)
   */
  public Object reverseDivideEquals(Object lhs, Object rhs) {
    return this.reverseDivideEquals.call(rhs, lhs);
  }

  /* (non-Javadoc)
   * @see ng.runtime.MetaClass#equals(java.lang.Object, java.lang.Object)
   */
  public Object equals(final Object lhs, final Object rhs) {
    return this.equals.call(lhs, rhs);
  }

  /* (non-Javadoc)
   * @see ng.runtime.InstanceHandler#reverseEquals(java.lang.Object, java.lang.Object)
   */
  public Object reverseEquals(Object lhs, Object rhs) {
    return this.reverseEquals.call(rhs, lhs);
  }

  /* (non-Javadoc)
   * @see ng.runtime.MetaClass#getAt(java.lang.Object, java.lang.Object)
   */
  public Object getAt(final Object instance, final Object index) {
    return this.getAt.call(instance, index);
  }

  /* (non-Javadoc)
   * @see ng.runtime.MetaClass#greaterThan(java.lang.Object, java.lang.Object)
   */
  public Object greaterThan(final Object lhs, final Object rhs) {
    return this.greaterThan.call(lhs, rhs);
  }

  /* (non-Javadoc)
   * @see ng.runtime.InstanceHandler#reverseGreaterThan(java.lang.Object, java.lang.Object)
   */
  public Object reverseGreaterThan(Object lhs, Object rhs) {
    return this.reverseGreaterThan.call(rhs, lhs);
  }

  /* (non-Javadoc)
   * @see ng.runtime.MetaClass#greaterThanOrEquals(java.lang.Object, java.lang.Object)
   */
  public Object greaterThanOrEquals(final Object lhs, final Object rhs) {
    return this.greaterThanOrEquals.call(lhs, rhs);
  }

  /* (non-Javadoc)
   * @see ng.runtime.InstanceHandler#reverseGreaterThanOrEquals(java.lang.Object, java.lang.Object)
   */
  public Object reverseGreaterThanOrEquals(Object lhs, Object rhs) {
    return this.reverseGreaterThanOrEquals.call(rhs, lhs);
  }

  /* (non-Javadoc)
   * @see ng.runtime.MetaClass#integerDivide(java.lang.Object, java.lang.Object)
   */
  public Object integerDivide(final Object lhs, final Object rhs) {
    return this.integerDivide.call(lhs, rhs);
  }

  /* (non-Javadoc)
   * @see ng.runtime.InstanceHandler#reverseIntegerDivide(java.lang.Object, java.lang.Object)
   */
  public Object reverseIntegerDivide(Object lhs, Object rhs) {
    return this.reverseIntegerDivide.call(rhs, lhs);
  }

  /* (non-Javadoc)
   * @see ng.runtime.MetaClass#integerDivideEquals(java.lang.Object, java.lang.Object)
   */
  public Object integerDivideEquals(final Object lhs, final Object rhs) {
    return this.integerDivideEquals.call(lhs, rhs);
  }

  /* (non-Javadoc)
   * @see ng.runtime.InstanceHandler#reverseIntegerDivideEquals(java.lang.Object, java.lang.Object)
   */
  public Object reverseIntegerDivideEquals(Object lhs, Object rhs) {
    return this.reverseIntegerDivideEquals.call(rhs, lhs);
  }

  /* (non-Javadoc)
   * @see ng.runtime.MetaClass#isCase(java.lang.Object, java.lang.Object)
   */
  public Object isCase(final Object instance, final Object rhs) {
    return this.isCase.call(instance, rhs);
  }

  /* (non-Javadoc)
   * @see ng.runtime.MetaClass#isInstanceof(java.lang.Object, java.lang.Class)
   */
  public Object isInstanceof(final Object instance, Class type) {
    return this.isInstanceof.call(instance, type);
  }

  /* (non-Javadoc)
   * @see ng.runtime.MetaClass#leftShift(java.lang.Object, java.lang.Object)
   */
  public Object leftShift(final Object lhs, final Object rhs) {
    return this.leftShift.call(lhs, rhs);
  }

  /* (non-Javadoc)
   * @see ng.runtime.InstanceHandler#reverseLeftShift(java.lang.Object, java.lang.Object)
   */
  public Object reverseLeftShift(Object lhs, Object rhs) {
    return this.reverseLeftShift.call(rhs, lhs);
  }

  /* (non-Javadoc)
   * @see ng.runtime.MetaClass#leftShiftEquals(java.lang.Object, java.lang.Object)
   */
  public Object leftShiftEquals(final Object lhs, final Object rhs) {
    return this.leftShiftEquals.call(lhs, rhs);
  }

  /* (non-Javadoc)
   * @see ng.runtime.InstanceHandler#reverseLeftShiftEquals(java.lang.Object, java.lang.Object)
   */
  public Object reverseLeftShiftEquals(Object lhs, Object rhs) {
    return this.reverseLeftShiftEquals.call(rhs, lhs);
  }

  /* (non-Javadoc)
   * @see ng.runtime.MetaClass#lessThan(java.lang.Object, java.lang.Object)
   */
  public Object lessThan(final Object lhs, final Object rhs) {
    return this.lessThan.call(lhs, rhs);
  }

  /* (non-Javadoc)
   * @see ng.runtime.InstanceHandler#reverseLessThan(java.lang.Object, java.lang.Object)
   */
  public Object reverseLessThan(Object lhs, Object rhs) {
    return this.reverseLessThan.call(rhs, lhs);
  }

  /* (non-Javadoc)
   * @see ng.runtime.MetaClass#lessThanOrEquals(java.lang.Object, java.lang.Object)
   */
  public Object lessThanOrEquals(final Object lhs, final Object rhs) {
    return this.lessThanOrEquals.call(lhs, rhs);
  }

  /* (non-Javadoc)
   * @see ng.runtime.InstanceHandler#reverseLessThanOrEquals(java.lang.Object, java.lang.Object)
   */
  public Object reverseLessThanOrEquals(Object lhs, Object rhs) {
    return this.reverseLessThanOrEquals.call(rhs, lhs);
  }

  /* (non-Javadoc)
   * @see ng.runtime.MetaClass#logicalRightShift(java.lang.Object, java.lang.Object)
   */
  public Object logicalRightShift(final Object lhs, final Object rhs) {
    return this.logicalRightShift.call(lhs, rhs);
  }

  /* (non-Javadoc)
   * @see ng.runtime.InstanceHandler#reverseLogicalRightShift(java.lang.Object, java.lang.Object)
   */
  public Object reverseLogicalRightShift(Object lhs, Object rhs) {
    return this.reverseLogicalRightShift.call(rhs, lhs);
  }

  /* (non-Javadoc)
   * @see ng.runtime.MetaClass#logicalRightShiftEquals(java.lang.Object, java.lang.Object)
   */
  public Object logicalRightShiftEquals(final Object lhs, final Object rhs) {
    return this.logicalRightShiftEquals.call(lhs, rhs);
  }

  /* (non-Javadoc)
   * @see ng.runtime.InstanceHandler#reverseLogicalRightShiftEquals(java.lang.Object, java.lang.Object)
   */
  public Object reverseLogicalRightShiftEquals(Object lhs, Object rhs) {
    return this.reverseLogicalRightShiftEquals.call(rhs, lhs);
  }

  /* (non-Javadoc)
   * @see ng.runtime.MetaClass#multiply(java.lang.Object, java.lang.Object)
   */
  public Object multiply(final Object lhs, final Object rhs) {
    return this.multiply.call(lhs, rhs);
  }

  /* (non-Javadoc)
   * @see ng.runtime.InstanceHandler#reverseMultiply(java.lang.Object, java.lang.Object)
   */
  public Object reverseMultiply(Object lhs, Object rhs) {
    return this.reverseMultiply.call(rhs, lhs);
  }

  /* (non-Javadoc)
   * @see ng.runtime.MetaClass#multiplyEquals(java.lang.Object, java.lang.Object)
   */
  public Object multiplyEquals(final Object lhs, final Object rhs) {
    return this.multiplyEquals.call(lhs, rhs);
  }

  /* (non-Javadoc)
   * @see ng.runtime.InstanceHandler#reverseMultiplyEquals(java.lang.Object, java.lang.Object)
   */
  public Object reverseMultiplyEquals(Object lhs, Object rhs) {
    return this.reverseMultiplyEquals.call(rhs, lhs);
  }

  /* (non-Javadoc)
   * @see ng.runtime.MetaClass#not(java.lang.Object)
   */
  public Object not(final Object operand) {
    return this.not.call(operand);
  }

  /* (non-Javadoc)
   * @see ng.runtime.MetaClass#notEquals(java.lang.Object, java.lang.Object)
   */
  public Object notEquals(final Object lhs, final Object rhs) {
    return this.notEquals.call(lhs, rhs);
  }

  /* (non-Javadoc)
   * @see ng.runtime.InstanceHandler#reverseNotEquals(java.lang.Object, java.lang.Object)
   */
  public Object reverseNotEquals(Object lhs, Object rhs) {
    return this.reverseNotEquals.call(rhs, lhs);
  }

  /* (non-Javadoc)
   * @see ng.runtime.MetaClass#or(java.lang.Object, java.lang.Object)
   */
  public Object or(final Object lhs, final Object rhs) {
    return this.or.call(lhs, rhs);
  }

  /* (non-Javadoc)
   * @see ng.runtime.InstanceHandler#reverseOr(java.lang.Object, java.lang.Object)
   */
  public Object reverseOr(Object lhs, Object rhs) {
    return this.reverseOr.call(rhs, lhs);
  }

  /* (non-Javadoc)
   * @see ng.runtime.MetaClass#orEquals(java.lang.Object, java.lang.Object)
   */
  public Object orEquals(final Object lhs, final Object rhs) {
    return this.orEquals.call(lhs, rhs);
  }

  /* (non-Javadoc)
   * @see ng.runtime.InstanceHandler#reverseOrEquals(java.lang.Object, java.lang.Object)
   */
  public Object reverseOrEquals(Object lhs, Object rhs) {
    return this.reverseOrEquals.call(rhs, lhs);
  }

  /* (non-Javadoc)
   * @see ng.runtime.MetaClass#postfixDecrement(java.lang.Object)
   */
  public Object postfixDecrement(final Object operand) {
    return this.postfixDecrement.call(operand);
  }

  /* (non-Javadoc)
   * @see ng.runtime.MetaClass#postfixIncrement(java.lang.Object)
   */
  public Object postfixIncrement(final Object operand) {
    return this.postfixIncrement.call(operand);
  }

  /* (non-Javadoc)
   * @see ng.runtime.MetaClass#prefixDecrement(java.lang.Object)
   */
  public Object prefixDecrement(final Object operand) {
    return this.prefixDecrement.call(operand);
  }

  /* (non-Javadoc)
   * @see ng.runtime.MetaClass#prefixIncrement(java.lang.Object)
   */
  public Object prefixIncrement(final Object operand) {
    return this.prefixIncrement.call(operand);
  }

  /* (non-Javadoc)
   * @see ng.runtime.MetaClass#putAt(java.lang.Object, java.lang.Object)
   */
  public Object putAt(final Object instance, final Object index) {
    return this.putAt.call(instance, index);
  }

  /* (non-Javadoc)
   * @see ng.runtime.MetaClass#remainder(java.lang.Object, java.lang.Object)
   */
  public Object remainder(final Object lhs, final Object rhs) {
    return this.remainder.call(lhs, rhs);
  }

  /* (non-Javadoc)
   * @see ng.runtime.InstanceHandler#reverseRemainder(java.lang.Object, java.lang.Object)
   */
  public Object reverseRemainder(Object lhs, Object rhs) {
    return this.reverseRemainder.call(rhs, lhs);
  }

  /* (non-Javadoc)
   * @see ng.runtime.MetaClass#remainderEquals(java.lang.Object, java.lang.Object)
   */
  public Object remainderEquals(final Object lhs, final Object rhs) {
    return this.remainderEquals.call(lhs, rhs);
  }

  /* (non-Javadoc)
   * @see ng.runtime.InstanceHandler#reverseRemainderEquals(java.lang.Object, java.lang.Object)
   */
  public Object reverseRemainderEquals(Object lhs, Object rhs) {
    return this.reverseRemainderEquals.call(rhs, lhs);
  }

  /* (non-Javadoc)
   * @see ng.runtime.MetaClass#subtract(java.lang.Object, java.lang.Object)
   */
  public Object subtract(final Object lhs, final Object rhs) {
    return this.subtract.call(lhs, rhs);
  }

  /* (non-Javadoc)
   * @see ng.runtime.InstanceHandler#reverseSubtract(java.lang.Object, java.lang.Object)
   */
  public Object reverseSubtract(Object lhs, Object rhs) {
    return this.reverseSubtract.call(rhs, lhs);
  }

  /* (non-Javadoc)
   * @see ng.runtime.MetaClass#subtractEquals(java.lang.Object, java.lang.Object)
   */
  public Object subtractEquals(final Object lhs, final Object rhs) {
    return this.subtractEquals.call(lhs, rhs);
  }

  /* (non-Javadoc)
   * @see ng.runtime.InstanceHandler#reverseSubtractEquals(java.lang.Object, java.lang.Object)
   */
  public Object reverseSubtractEquals(Object lhs, Object rhs) {
    return this.reverseSubtractEquals.call(rhs, lhs);
  }

  /* (non-Javadoc)
   * @see ng.runtime.MetaClass#unaryMinus(java.lang.Object)
   */
  public Object unaryMinus(final Object operand) {
    return this.unaryMinus.call(operand);
  }

  /* (non-Javadoc)
   * @see ng.runtime.MetaClass#unaryPlus(java.lang.Object)
   */
  public Object unaryPlus(final Object operand) {
    return this.unaryPlus.call(operand);
  }

  /* (non-Javadoc)
   * @see ng.runtime.MetaClass#xor(java.lang.Object, java.lang.Object)
   */
  public Object xor(final Object lhs, final Object rhs) {
    return this.xor.call(lhs, rhs);
  }

  /* (non-Javadoc)
   * @see ng.runtime.InstanceHandler#reverseXor(java.lang.Object, java.lang.Object)
   */
  public Object reverseXor(Object lhs, Object rhs) {
    return this.reverseXor.call(rhs, lhs);
  }

  /* (non-Javadoc)
   * @see ng.runtime.MetaClass#xorEquals(java.lang.Object, java.lang.Object)
   */
  public Object xorEquals(final Object lhs, final Object rhs) {
    return this.xorEquals.call(lhs, rhs);
  }

  /* (non-Javadoc)
   * @see ng.runtime.InstanceHandler#reverseXorEquals(java.lang.Object, java.lang.Object)
   */
  public Object reverseXorEquals(Object lhs, Object rhs) {
    return this.reverseXorEquals.call(rhs, lhs);
  }
}
