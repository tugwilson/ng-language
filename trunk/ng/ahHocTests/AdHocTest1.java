import ng.ast.BinaryOperation;
import ng.ast.Node;
import ng.ast.util.BinaryOperations;
import ng.runtime.metaclass.MetaClass;
import ng.runtime.threadcontext.ThreadContext;
import uk.co.wilson.ng.ast.NodeImpl;


public class AdHocTest1 {

  /**
   * @param args
   */
  public static void main(final String[] args) {
    final ThreadContext tc = ThreadContext.getThreadContext();

    Node n = new NodeImpl() {

      /* (non-JavaDoc)
       * @see ng.ast.Node#evaluate(java.lang.Object, ng.runtime.metaclass.MetaClass, ng.runtime.threadcontext.ThreadContext)
       */
      public Object evaluate(Object instance, MetaClass metaClass, ThreadContext tc) {
        // TODO Auto-generated method stub
        return null;
      }
    };
    
    BinaryOperation p1 = n.newBinaryOperation(BinaryOperations.plus);
    BinaryOperation p2 = n.newBinaryOperation(BinaryOperations.plus);
    p1.setLhs(n.newIntegerConstant(1));
    p1.setRhs(n.newIntegerConstant(3));
    p2.setLhs(p1);
    p2.setRhs(n.newFloatConstant(10.5f));
    System.out.println(tc.unwrapToFloat(p2.evaluate(null, null, tc)));
  }
}
