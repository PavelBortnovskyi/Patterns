package org.example.strategy.duck.behaviors;

//Класс-реализация поведения кряканья
public class Quack implements QuackBehavior {

  @Override
  public void quack() {
    System.out.println("Quack");
  }
}
