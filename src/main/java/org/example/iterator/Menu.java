package org.example.iterator;

import java.util.Iterator;

public interface Menu {

  public Iterator<MenuItem> createIterator();

  public String getName();
}