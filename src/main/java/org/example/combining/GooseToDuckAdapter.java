package org.example.combining;

public class GooseToDuckAdapter implements Quackable {

  Observable observable;
  Goose goose;

  public GooseToDuckAdapter(Goose goose) {
    this.goose = goose;
    this.observable = new Observable(this);
  }

  public void quack() {
    goose.honk();
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
