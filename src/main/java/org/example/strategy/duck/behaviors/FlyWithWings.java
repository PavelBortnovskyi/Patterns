package org.example.strategy.duck.behaviors;

//Класс-реализация поведения полета с крыльями
public class FlyWithWings implements FlyBehavior{
  @Override
  public void fly() {
    System.out.println("I’m flying!!");
  }
}
