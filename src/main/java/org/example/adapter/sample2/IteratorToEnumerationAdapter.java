package org.example.adapter.sample2;

import java.util.Enumeration;
import java.util.Iterator;

public class IteratorToEnumerationAdapter implements Enumeration<Object> {

  java.util.Iterator<?> iterator;

  IteratorToEnumerationAdapter(Iterator<?> iterator){
    this.iterator = iterator;
  }

  @Override
  public boolean hasMoreElements() {
    return this.iterator.hasNext();
  }

  @Override
  public Object nextElement() {
    return this.iterator.next();
  }
}
