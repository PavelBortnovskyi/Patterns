package org.example.factory.pizza.fabricmethod;


public abstract class PizzaStore {

  public Pizza orderPizza(String type) {
    Pizza pizza;

    //Метод создания стал абстрактным для возможности вызова его конкретной реализацией магазина с соответствующей фабрикой
    pizza = this.createPizza(type);

    pizza.prepare();
    pizza.bake();
    pizza.cut();
    pizza.box();
    return pizza;
  }

  protected abstract Pizza createPizza(String type);
// other methods here
}