package org.example.decorator.coffee.mods;

import org.example.decorator.coffee.base.Beverage;

public class Mocha extends CondimentDecorator {

  //Конструктор объекта декора на основе супер класса
  public Mocha(Beverage beverage) {
    this.beverage = beverage;
  }

  //Метод возвращает полное описание результирующего объекта
  public String getDescription() {
    return this.beverage.getDescription() + ", Mocha";
  }

  //Метод возвращает полную стоимость результирующего объекта
  public double cost() {
    double condimentCost = switch (this.beverage.getSize()){
      case TALL -> 0.2;
      case GRANDE -> 0.25;
      case VENTI -> 0.3;
    };
    return this.beverage.cost() + condimentCost;
  }
}