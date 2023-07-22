package org.example.strategy.duck;

import org.example.strategy.duck.behaviors.FlyNoWay;
import org.example.strategy.duck.behaviors.Quack;

public class ModelDuck extends Duck {

  public ModelDuck() {
    flyBehavior = new FlyNoWay();
    quackBehavior = new Quack();
  }

  public void display() {
    System.out.println("I’m a model duck");
  }
}
