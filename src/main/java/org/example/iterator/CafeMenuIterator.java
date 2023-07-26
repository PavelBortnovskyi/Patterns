//package org.example.iterator;
//
//import java.util.Iterator;
//import java.util.Map;
//
//public class CafeMenuIterator implements Iterator<MenuItem> {
//  Map<String, MenuItem> items;
//
//  String[] keys;
//
//  int position = 0;
//
//  public CafeMenuIterator(Map<String, MenuItem> items) {
//    this.items = items;
//    this.keys = items.keySet().toArray(new String[0]);
//  }
//
//  public MenuItem next() {
//    return this.items.get(this.keys[this.position++]);
//  }
//
//  public boolean hasNext() {
//    return this.position < this.keys.length;
//  }
//
//  public void remove() {
//    throw new UnsupportedOperationException
//      ("You shouldn't be trying to remove menu items.");
//  }
//}
