package ng.ast;

import java.util.List;

/**
 * @author John
 *
 */
public interface Try extends Statement {
  Block getTryBlock();
  List<Catch> getCatches();
  Finally getFinally();
}
