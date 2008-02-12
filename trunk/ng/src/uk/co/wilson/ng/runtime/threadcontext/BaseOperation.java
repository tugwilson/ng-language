package uk.co.wilson.ng.runtime.threadcontext;

import ng.runtime.threadcontext.Operation;
import ng.runtime.threadcontext.ExtendedThreadContext;

public abstract class BaseOperation implements Operation {
  protected final ExtendedThreadContext tc;

  public BaseOperation(final ExtendedThreadContext tc) {
    this.tc = tc;
  }
}
