package org.example.strategy.duck;

import org.example.strategy.duck.behaviors.Quack;
import org.example.strategy.duck.behaviors.QuackBehavior;

public class DuckAttract {

  QuackBehavior quackBehavior;

  public  DuckAttract(){
    quackBehavior = new Quack();
  }

  public void performAttract(){
    quackBehavior.quack();
  }
}
