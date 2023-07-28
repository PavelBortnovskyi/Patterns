package org.example.combining;


public class MallardDuck implements Quackable {

  Observable observable;

  public MallardDuck() {
    this.observable = new Observable(this);
  }

  public void quack() {
    System.out.println("Quack");
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
