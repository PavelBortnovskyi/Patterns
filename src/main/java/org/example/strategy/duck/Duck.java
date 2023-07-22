package org.example.strategy.duck;


import org.example.strategy.duck.behaviors.FlyBehavior;
import org.example.strategy.duck.behaviors.QuackBehavior;

public abstract class Duck {

  protected FlyBehavior flyBehavior;

  protected QuackBehavior quackBehavior;

  public Duck() {
  }

  public abstract void display();

  public void swim() {
    System.out.println("All ducks floating, even decoy");
  }

  public void performFly(){
    flyBehavior.fly();
  }

  public void performQuack(){
    quackBehavior.quack();
  }

  public void setFlyBehavior(FlyBehavior flyBehavior){
    this.flyBehavior = flyBehavior;
  }

  public void setQuackBehavior(QuackBehavior quackBehavior){
    this.quackBehavior = quackBehavior;
  }
}
