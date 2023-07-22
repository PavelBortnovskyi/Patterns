package org.example.factory.pizza.abstract_factory;

import org.example.decorator.ingredient.PizzaIngredientFactory;

public class VeggiePizza extends Pizza {
  PizzaIngredientFactory ingredientFactory;
  public VeggiePizza(PizzaIngredientFactory ingredientFactory) {
    this.ingredientFactory = ingredientFactory;
  }

  //Метод готовит пиццу запрашивая каждый новый ингредиент у фабрики
  public void prepare() {
    System.out.println("Preparing " + name);
    this.dough = ingredientFactory.createDough();
    this.sauce = ingredientFactory.createSauce();
    this.veggies = ingredientFactory.createVeggies();
  }
}
