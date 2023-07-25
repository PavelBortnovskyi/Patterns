package org.example.template_method;

public class TestDrive {
  public static void main(String[] args) {
    Tea tea = new Tea();
    Coffee coffee = new Coffee();

    System.out.println("Tea preparation");
    tea.prepareRecipe();
    System.out.println();
    System.out.println("Coffee preparation");
    coffee.prepareRecipe();
  }
}
