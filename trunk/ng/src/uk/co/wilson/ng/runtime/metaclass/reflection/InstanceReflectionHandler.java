package uk.co.wilson.ng.runtime.metaclass.reflection;

import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

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
         } else if (returnType == void.class) {
           metaMethod = new VoidMetaMethod(method);
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
               if (returnType == void.class) {
                 this.setPropertyMethods.put(name.substring(3, 4).toLowerCase() + name.substring(4), new VoidSetPropertyMetaMethod(method));
               } else {
                 this.setPropertyMethods.put(name.substring(3, 4).toLowerCase() + name.substring(4), metaMethod);
               }
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
}
