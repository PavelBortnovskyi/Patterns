package org.example.strategy.duck.behaviors;

//Класс-реализация поведения полета без крыльев
public class FlyNoWay implements FlyBehavior{
  @Override
  public void fly() {
    System.out.println("I can`t fly(");
  }
}
