package org.example.combining;

public class RubberDuck implements Quackable {

  Observable observable;

  public RubberDuck() {
    this.observable = new Observable(this);
  }

  public void quack() {
    System.out.println("Squeak");
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
