package org.example.iterator;

import java.util.Iterator;

public class DinerMenuIterator implements Iterator<MenuItem> {
  MenuItem[] items;
  int position = 0;

  public DinerMenuIterator(MenuItem[] items) {
    this.items = items;
  }

  public MenuItem next() {
    return this.items[this.position++];
  }

  public boolean hasNext() {
    if (this.position >= this.items.length || this.items[this.position] == null) {
      return false;
    } else {
      return true;
    }
  }

  public void remove() {
    throw new UnsupportedOperationException
      ("You shouldn't be trying to remove menu items.");
  }
}
