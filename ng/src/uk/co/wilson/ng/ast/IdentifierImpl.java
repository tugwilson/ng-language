package uk.co.wilson.ng.ast;

import ng.ast.Identifier;
import ng.lang.MetaClass;
import ng.runtime.threadcontext.ThreadContext;

public class IdentifierImpl extends NodeImpl implements Identifier {
  final String name;
  final Class<?> type;

  public IdentifierImpl(final String name, final Class<?> type) {
    this.name = name;
    this.type = type;
  }

  public IdentifierImpl(final String name) {
    this(name, null);
  }

  public String getName() {
    return this.name;
  }

  public Class<?> getType() {
    return this.type;
  }

  public boolean isTyped() {
    return this.type != null;
  }

  public Object evaluate(final Object instance, final MetaClass metaClass, final ThreadContext tc) {
    if (tc.interpreterSupport().isLocalVariable(this.name)) {
      return tc.interpreterSupport().getLocalVariable(this.name);
    } else {
      return tc.propertyAccess().get(metaClass, this.name);
    }
  }
}
