package org.example.strategy.duck.behaviors;

//Класс-реализация поведения кряканья писка
public class Squeak implements QuackBehavior{
  @Override
  public void quack() {
    System.out.println("Squeak");
  }
}
