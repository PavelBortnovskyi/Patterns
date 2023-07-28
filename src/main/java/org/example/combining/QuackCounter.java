package org.example.combining;

//Декоратор для подсчета кряков
public class QuackCounter implements Quackable {

  Observable observable;

  Quackable duck;
  static int numberOfQuacks;

  public QuackCounter(Quackable duck) {
    this.duck = duck;
    this.observable = new Observable(this);
  }

  public void quack() {
    duck.quack();
    numberOfQuacks++;
  }

  //Статический метод возвращает текущее значение счетчика
  public static int getQuacks() {
    return numberOfQuacks;
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
