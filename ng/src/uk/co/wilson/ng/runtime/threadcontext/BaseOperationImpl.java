package uk.co.wilson.ng.runtime.threadcontext;

import ng.runtime.threadcontext.ExtendedThreadContext;
import ng.runtime.threadcontext.Operation;

public abstract class BaseOperationImpl implements Operation {
  protected final ExtendedThreadContext tc;

  public BaseOperationImpl(final ExtendedThreadContext tc) {
    this.tc = tc;
  }
}
