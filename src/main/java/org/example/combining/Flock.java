package org.example.combining;

import java.util.ArrayList;
import java.util.List;

//Класс компоновщик
public class Flock implements Quackable {
  List<Quackable> quackers = new ArrayList<>();


  public void add(Quackable duck) {
    this.quackers.add(duck);
  }

  public void quack() {
    for (Quackable duck : quackers) {
      duck.quack();
      duck.notifyObservers();
    }
  }

  @Override
  public void registerObserver(Observer observer) {
    this.quackers.forEach(duck -> duck.registerObserver(observer));
  }

  @Override
  public void notifyObservers() {} //Метод пустой для исключения его вызова субколлекциями
}