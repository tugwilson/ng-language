package uk.co.wilson.ng.runtime.threadcontext;

import ng.runtime.threadcontext.Operation;
import ng.runtime.threadcontext.ThreadContext;

public abstract class BaseOperation implements Operation {
  protected final ThreadContext tc;

  public BaseOperation(final ThreadContext tc) {
    this.tc = tc;
  }
}
