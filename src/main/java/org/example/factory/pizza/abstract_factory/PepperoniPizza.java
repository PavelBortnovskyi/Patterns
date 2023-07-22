package org.example.factory.pizza.abstract_factory;

import org.example.decorator.ingredient.PizzaIngredientFactory;

public class PepperoniPizza extends Pizza {
  PizzaIngredientFactory ingredientFactory;
  public PepperoniPizza(PizzaIngredientFactory ingredientFactory) {
    this.ingredientFactory = ingredientFactory;
  }

  //Метод готовит пиццу запрашивая каждый новый ингредиент у фабрики
  public void prepare() {
    System.out.println("Preparing " + name);
    this.dough = ingredientFactory.createDough();
    this.sauce = ingredientFactory.createSauce();
    this.pepperoni = ingredientFactory.createPepperoni();
  }
}
