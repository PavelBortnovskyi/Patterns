package org.example.adapter.sample2;

public class EnumerationToIteratorAdapter implements Iterator{

  Enumeration enumeration;

  EnumerationToIteratorAdapter(Enumeration enumeration){
    this.enumeration = enumeration;
  }

  @Override
  public boolean hasNext() {
    return this.enumeration.hasMoreElements();
  }

  @Override
  public Object next() {
    return this.enumeration.nextElement();
  }

  @Override
  public void remove() {
    throw new UnsupportedOperationException();
  }
}
