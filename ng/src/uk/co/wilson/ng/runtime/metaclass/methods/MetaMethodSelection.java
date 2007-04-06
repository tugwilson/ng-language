package uk.co.wilson.ng.runtime.metaclass.methods;

import ng.runtime.InstanceHandler;
import ng.runtime.MetaMethod;

/**
 * @author John
 *
 */
public class MetaMethodSelection {
  public MetaMethod metaMethod = InstanceHandler.noMethod;
  public int score = Integer.MAX_VALUE;
}
