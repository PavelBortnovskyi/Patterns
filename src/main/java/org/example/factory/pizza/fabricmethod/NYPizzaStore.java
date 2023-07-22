package org.example.factory.pizza.fabricmethod;

import org.example.factory.pizza.fabricmethod.ingredient.NYIngredientFactory;
import org.example.factory.pizza.fabricmethod.ingredient.PizzaIngredientFactory;

public class NYPizzaStore extends PizzaStore {

  public Pizza createPizza(String type) {

    Pizza pizza = null;
    PizzaIngredientFactory ingredientFactory = new NYIngredientFactory();

    switch (type) {
      case "cheese" -> {
        pizza = new CheesePizza(ingredientFactory);
        pizza.setName("New York Style Cheese Pizza");
      }
      case "veggie" -> {
        pizza = new VeggiePizza(ingredientFactory);
        pizza.setName("New York Style Veggie Pizza");
      }
      case "clam" -> {
        pizza = new ClamPizza(ingredientFactory);
        pizza.setName("New York Style Clam Pizza");
      }
      case "pepperoni" -> {
        pizza = new PepperoniPizza(ingredientFactory);
        pizza.setName("New York Style Pepperoni Pizza");
      }
      default -> throw new IllegalArgumentException("We didn`t sell this pizza type!");
    }
    return pizza;
  }
}
