package uk.co.wilson.ng.runtime.threadcontext.util;

import java.util.HashMap;

public class HashMapWithDefaultValue<K, V> extends HashMap<K, V> {
  private static final long serialVersionUID = 1L;

  public V get(final K key, final V defaultValue) {
  final V result = get(key);

    if (result == null) {
      return defaultValue;
    } else {
      return result;
    }
  }
}
