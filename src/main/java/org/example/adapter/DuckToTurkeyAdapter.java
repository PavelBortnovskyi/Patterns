package org.example.adapter;

import java.util.Random;

public class DuckToTurkeyAdapter implements Turkey {

  Duck duck;

  Random rand;

  //В конструкторе получаем объект для адаптации
  public DuckToTurkeyAdapter(Duck duck) {
    this.duck = duck;
  }

  //Эмуляция звуков индюка
  @Override
  public void gobble() {
    duck.quack();
  }

  //Эмуляция полета
  public void fly() {
    if (rand.nextInt(5) == 0) {
      duck.fly();
    }
  }
}