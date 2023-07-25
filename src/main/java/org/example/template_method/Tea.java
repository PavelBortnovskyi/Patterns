package org.example.template_method;

public class Tea extends CaffeineBeverage {

  //Реализация абстрактного метода шаблона
  public void brew() {
    System.out.println("Steeping the tea");
  }

  //Реализация абстрактного метода шаблона
  public void addCondiments() {
    System.out.println("Adding Lemon");
  }
}
