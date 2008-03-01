import java.io.File;
import java.io.FileWriter;
import java.io.Writer;

import org.apache.velocity.Template;
import org.apache.velocity.VelocityContext;
import org.apache.velocity.app.Velocity;


public class Generate {
  public static void main(String[] args) throws Exception {
    String generatedFiles[][] = new String[][]{
        new String[]{"Add", "add", "to", "ArithmeticOperation.vm", "uk/co/wilson/ng/runtime/threadcontext", "Add.java"},
        new String[]{"Subtract", "subtract", "from", "ArithmeticOperation.vm", "uk/co/wilson/ng/runtime/threadcontext", "Subtract.java"},
        new String[]{"Multiply", "multiply", "by", "ArithmeticOperation.vm", "uk/co/wilson/ng/runtime/threadcontext", "Multiply.java"},
        new String[]{"Divide", "divide", "by", "ArithmeticOperation.vm", "uk/co/wilson/ng/runtime/threadcontext", "Divide.java"},
        new String[]{"Modulo", "modulo", "by", "ArithmeticOperation.vm", "uk/co/wilson/ng/runtime/threadcontext", "Modulo.java"},
        new String[]{"Power", "power", "to the power of", "ArithmeticOperation.vm", "uk/co/wilson/ng/runtime/threadcontext", "Power.java"},
        new String[]{"RemainderDivide", "remainderDivide", "by", "ArithmeticOperation.vm", "uk/co/wilson/ng/runtime/threadcontext", "RemainderDivide.java"},
        new String[]{"Compare", "compare", "compare", "IntegerComparison.vm", "uk/co/wilson/ng/runtime/threadcontext", "Compare.java"},
        new String[]{"Equals", "equals", "compare equals", "BooleanComparison.vm", "uk/co/wilson/ng/runtime/threadcontext", "Equals.java"},
        new String[]{"NotEquals", "notEquals", "compare not equals", "BooleanComparison.vm", "uk/co/wilson/ng/runtime/threadcontext", "NotEquals.java"},
        new String[]{"LessThan", "lessThan", "compare less than", "BooleanComparison.vm", "uk/co/wilson/ng/runtime/threadcontext", "LessThan.java"},
        new String[]{"GreaterThan", "greaterThan", "compare greater than", "BooleanComparison.vm", "uk/co/wilson/ng/runtime/threadcontext", "GreaterThan.java"},
        new String[]{"LessThanOrEquals", "lessThanOrEquals", "compare less than or equals", "BooleanComparison.vm", "uk/co/wilson/ng/runtime/threadcontext", "LessThanOrEquals.java"},
        new String[]{"GreaterThanOrEquals", "greaterThanOrEquals", "compare greater than or equals", "BooleanComparison.vm", "uk/co/wilson/ng/runtime/threadcontext", "GreaterThanOrEquals.java"},
        new String[]{"LeftShift", "leftShift", "shift left", "ShiftOperation.vm", "uk/co/wilson/ng/runtime/threadcontext", "LeftShift.java"},
        new String[]{"RightShift", "rightShift", "shift right", "ShiftOperation.vm", "uk/co/wilson/ng/runtime/threadcontext", "RightShift.java"},
        new String[]{"UnsignedRightShift", "unsignedRightShift", "unsigned shift rught", "ShiftOperation.vm", "uk/co/wilson/ng/runtime/threadcontext", "UnsignedRightShift.java"},
        new String[]{"And", "and", "and", "LogicalOperation.vm", "uk/co/wilson/ng/runtime/threadcontext", "And.java"},
        new String[]{"Or", "or", "or", "LogicalOperation.vm", "uk/co/wilson/ng/runtime/threadcontext", "Or.java"},
        new String[]{"Xor", "xor", "xor", "LogicalOperation.vm", "uk/co/wilson/ng/runtime/threadcontext", "Xor.java"},
    };
    
    Velocity.init();
    
    for (int i = 0; i != generatedFiles.length; i++) {
      String[] parameters = generatedFiles[i];
      
      VelocityContext context = new VelocityContext();
      
      context.put("Op", parameters[0]);
      context.put("op", parameters[1]);
      context.put("verb", parameters[2]);
         
      Template template = Velocity.getTemplate("prototypes/" +parameters[3]);
      
      new File("generated/" + parameters[4]).mkdirs();
      
      Writer result = new FileWriter("generated/" + parameters[4] + "/" + parameters[5]);

      template.merge(context, result);
      
      result.close();
    }
  }
}
