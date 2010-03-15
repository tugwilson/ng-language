package ng.ast;

import ng.ast.util.Fqn;

/**
 * @author John
 * 
 */
public interface Import extends Node {
  void setImport(Fqn importPath);

  void setAsName(String asName);
}
