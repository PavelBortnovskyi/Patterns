package org.example.strategy.duck;

import org.example.strategy.duck.behaviors.FlyWithWings;
import org.example.strategy.duck.behaviors.Quack;

public class MallardDuck extends Duck{

  public MallardDuck(){
    this.flyBehavior = new FlyWithWings();
    this.quackBehavior = new Quack();
  }
  @Override
  public void display() {
    System.out.println("I’m a real Mallard duck");
  }
}
