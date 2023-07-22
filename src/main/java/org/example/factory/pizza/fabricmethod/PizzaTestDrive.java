package org.example.factory.pizza.fabricmethod;

public class PizzaTestDrive {
  public static void main(String[] args) {
    PizzaStore nyStore = new NYPizzaStore();
    PizzaStore chicagoStore = new ChicagoPizzaStore();
    Pizza pizza = nyStore.orderPizza("cheese");
    System.out.println("Ethan received a " + pizza.getName() + "\n");
    pizza = chicagoStore.orderPizza("cheese");
    System.out.println("Joel received a " + pizza.getName() + "\n");
  }
}