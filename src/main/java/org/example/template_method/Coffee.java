package org.example.template_method;

public class Coffee extends CaffeineBeverage {

  //Реализация абстрактного метода шаблона
  public void brew() {
    System.out.println("Dripping Coffee through filter");
  }

  //Реализация абстрактного метода шаблона
  public void addCondiments() {
    System.out.println("Adding Sugar and Milk");
  }
}