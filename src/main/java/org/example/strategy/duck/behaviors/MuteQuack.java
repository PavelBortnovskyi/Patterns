package org.example.strategy.duck.behaviors;

//Класс-реализация поведения немого кряканья
public class MuteQuack implements QuackBehavior{
  @Override
  public void quack() {
    System.out.println("<< Silence >>");
  }
}
