package org.example.decorator.ingredient;

//Абстрактная фабрика ингредиентов
public interface PizzaIngredientFactory {
  Dough createDough();
  Sauce createSauce();
  Cheese createCheese();
  Veggies[] createVeggies();
  Pepperoni createPepperoni();
  Clams createClam();
}
