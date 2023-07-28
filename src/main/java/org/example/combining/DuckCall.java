package org.example.combining;

public class DuckCall implements Quackable {

  Observable observable;

  public DuckCall() {
    this.observable = new Observable(this);
  }

  public void quack() {
    System.out.println("Kwak");
  }

  @Override
  public void registerObserver(Observer observer) {
    this.observable.registerObserver(observer);
  }

  @Override
  public void notifyObservers() {
    this.observable.notifyObservers();
  }
}