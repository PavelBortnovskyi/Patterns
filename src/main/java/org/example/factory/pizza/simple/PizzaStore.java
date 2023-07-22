package org.example.factory.pizza.simple;

import org.example.factory.pizza.simple.Pizza;

public class PizzaStore {

  //Объект фабрики
  SimplePizzaFactory factory;

  //Инжект объекта фабрики через конструктор
  public PizzaStore(SimplePizzaFactory factory) {
    this.factory = factory;
  }

  public Pizza orderPizza(String type) {
    Pizza pizza;

    //Делегирование процесса создания объектов фабрике
    pizza = factory.createPizza(type);

    //Неизменный процесс приготовления
    pizza.prepare();
    pizza.bake();
    pizza.cut();
    pizza.box();
    return pizza;
  }
// other methods here
}