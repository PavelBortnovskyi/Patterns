package org.example.strategy.duck;

import org.example.strategy.duck.behaviors.FlyRocketPowered;

public class MiniDuckSimulator {

  public static void main(String[] args) {

    //Реализация класса наследника с поведением определенным в конструкторе субкласса
    Duck mallard = new MallardDuck();
    mallard.performFly();
    mallard.performQuack();

    //Реализация класса наследника с динамическим переопределением поведения через сеттер
    Duck rocketDuck = new ModelDuck();
    rocketDuck.performFly();
    rocketDuck.setFlyBehavior(new FlyRocketPowered());
    rocketDuck.performFly();

    //Реализация класса использующего нужную имплементацию поведения для функции кряканья, но не являющегося наследником Duck
    DuckAttract duckAttract = new DuckAttract();
    duckAttract.performAttract();
  }
}
