package ng.runtime.threadcontext;

public class NotPerformed extends Exception {
  private static final long serialVersionUID = 1L;

  //
  // If you got here by looking at the stack trace of the NotPerformed exception
  // then you have found either a complier or a run time system bug.
  //
  // This exception should *never* be seen by the end user.
  //
  public static NotPerformed instance = new NotPerformed();

  private NotPerformed() {
    super("Utility exception used inside the Ng Runtime system");
  }
}
