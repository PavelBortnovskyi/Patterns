package org.example.decorator.coffee.mods;

import org.example.decorator.coffee.base.Beverage;

public class Soy extends CondimentDecorator {

  //Конструктор объекта декора на основе супер класса
  public Soy(Beverage beverage) {
    this.beverage = beverage;
  }

  //Метод возвращает полное описание результирующего объекта
  public String getDescription() {
    return this.beverage.getDescription() + ", Soy";
  }

  //Метод возвращает полную стоимость результирующего напитка
  public double cost() {
    double condimentCost = switch (this.beverage.getSize()){
      case TALL -> 0.15;
      case GRANDE -> 0.2;
      case VENTI -> 0.25;
    };
    return this.beverage.cost() + condimentCost;
  }
}