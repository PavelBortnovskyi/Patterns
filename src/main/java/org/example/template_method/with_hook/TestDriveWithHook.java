package org.example.template_method.with_hook;

import org.example.template_method.Coffee;
import org.example.template_method.Tea;

public class TestDriveWithHook {
  public static void main(String[] args) {
    TeaWithHook tea = new TeaWithHook();
    CoffeeWithHook coffee = new CoffeeWithHook();

    System.out.println("Tea preparation");
    tea.prepareRecipe();
    System.out.println();
    System.out.println("Coffee preparation");
    coffee.prepareRecipe();
  }
}
