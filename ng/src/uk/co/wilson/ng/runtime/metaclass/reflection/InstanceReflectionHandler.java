package uk.co.wilson.ng.runtime.metaclass.reflection;

import java.beans.BeanInfo;
import java.beans.IntrospectionException;
import java.beans.Introspector;
import java.beans.MethodDescriptor;
import java.beans.PropertyDescriptor;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

import ng.lang.NgRuntimeException;
import ng.runtime.MetaMethod;
import uk.co.wilson.ng.runtime.metaclass.InstanceHandlerImpl;
import uk.co.wilson.ng.runtime.metaclass.reflection.fields.*;
import uk.co.wilson.ng.runtime.metaclass.reflection.methods.*;

/**
 * @author tug
 *
 */
public class InstanceReflectionHandler extends InstanceHandlerImpl {

  /**
   * @param theClass
   */
  public InstanceReflectionHandler(final Class theClass) {
    super(theClass);
    
    final Method methods[] = theClass.getDeclaredMethods();
    final Field fields[] = theClass.getDeclaredFields();
    
     AccessibleObject.setAccessible(methods, true);
     AccessibleObject.setAccessible(fields, true);
      
     for (int i = 0; i != methods.length; i++) {
     final Method method = methods[i];
     
       if (method.getDeclaringClass() == theClass) {
       final MetaMethod metaMethod = createMetaMethod(method);
         
         switch(method.getParameterTypes().length) {
           case 0: {
             this.zeroParameterMethods.put(method.getName(), metaMethod);
             break;
           }
           
           case 1: {
             this.oneParameterMethods.put(method.getName(), metaMethod);
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
     
     try {
     final BeanInfo beanInfo = Introspector.getBeanInfo(theClass);
     final PropertyDescriptor propertyDescriptors[] = beanInfo.getPropertyDescriptors();
     
       for (int i = 0; i!= propertyDescriptors.length; i++) {
         final Method readMethod = propertyDescriptors[i].getReadMethod();
         final Method writeMethod = propertyDescriptors[i].getWriteMethod();
         
         if (readMethod != null && readMethod.getDeclaringClass() == theClass) {
           this.getPropertyMethods.put(readMethod.getName(), createMetaMethod(readMethod));
         }
         
         if (writeMethod != null && writeMethod.getDeclaringClass() == theClass) {
           this.getPropertyMethods.put(writeMethod.getName(), createMetaMethod(writeMethod));
         }
       }
     
     } catch (final IntrospectionException e) {
      throw new NgRuntimeException(e);
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

  /**
   * @param method
   * @return
   */
  private MetaMethod createMetaMethod(final Method method) {
  final Class returnType = method.getReturnType();

     if(returnType == boolean.class) {
       return new BooleanMetaMethod(method);
     } else if (returnType == char.class) {
       return new CharMetaMethod(method);
     } else if (returnType == byte.class) {
       return new ByteMetaMethod(method);
     } else if (returnType == short.class) {
       return new ShortMetaMethod(method);
     } else if (returnType == int.class) {
       return new IntMetaMethod(method);
     } else if (returnType == long.class) {
       return new LongMetaMethod(method);
     } else if (returnType == float.class) {
       return new FloatMetaMethod(method);
     } else if (returnType == double.class) {
       return new DoubleMetaMethod(method);
     } else if (returnType == void.class) {
       return new VoidMetaMethod(method);
     } else if (returnType == Object.class) {
       return new UntypedMetaMethod(method);
     } else {
       return new TypedMetaMethod(method);
     }
  }
}
