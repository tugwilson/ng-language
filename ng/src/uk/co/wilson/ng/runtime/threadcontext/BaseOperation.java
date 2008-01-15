package uk.co.wilson.ng.runtime.threadcontext;

import ng.runtime.threadcontext.ThreadContext;

public class BaseOperation {
  protected final ThreadContext tc;

  public BaseOperation(final ThreadContext tc) {
    this.tc = tc;
  }
}
