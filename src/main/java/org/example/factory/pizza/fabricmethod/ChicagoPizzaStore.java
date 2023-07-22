package org.example.factory.pizza.fabricmethod;

import org.example.factory.pizza.fabricmethod.ingredient.ChicagoIngredientFactory;
import org.example.factory.pizza.fabricmethod.ingredient.PizzaIngredientFactory;

public class ChicagoPizzaStore extends PizzaStore {

  public Pizza createPizza(String type) {

    Pizza pizza = null;
    PizzaIngredientFactory ingredientFactory = new ChicagoIngredientFactory();

    switch (type) {
      case "cheese" -> {
        pizza = new CheesePizza(ingredientFactory);
        pizza.setName("Chicago Style Cheese Pizza");
      }
      case "veggie" -> {
        pizza = new VeggiePizza(ingredientFactory);
        pizza.setName("Chicago Style Veggie Pizza");
      }
      case "clam" -> {
        pizza = new ClamPizza(ingredientFactory);
        pizza.setName("Chicago Style Clam Pizza");
      }
      case "pepperoni" -> {
        pizza = new PepperoniPizza(ingredientFactory);
        pizza.setName("Chicago Style Pepperoni Pizza");
      }
      default -> throw new IllegalArgumentException("We didn`t sell this pizza type!");
    }
    return pizza;
  }
}
