package ng.ast;

import java.util.List;

/**
 * @author John
 * 
 */
public interface Block extends Statement {
  void addStatement(Statement statement);

  List<Statement> getStatements();
}
