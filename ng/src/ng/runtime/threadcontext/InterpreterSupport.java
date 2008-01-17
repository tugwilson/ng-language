package ng.runtime.threadcontext;

public interface InterpreterSupport {
  boolean isLocalVariable(String name);

  Object getLocalVariable(String name);

  Object setLocalVariable(String name, Object value);
}
