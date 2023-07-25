package org.example.template_method;

public abstract class CaffeineBeverage {

  //Основной метод объявлен финальным для невозможности его переопределения
  final void prepareRecipe() {
    boilWater();
    brew();
    pourInCup();
    addCondiments();
  }

  //Абстрактный метод будет реализовываться субклассами
  abstract void brew();

  //Абстрактный метод будет реализовываться субклассами
  abstract void addCondiments();

  //Общий метод с реализацией для всех субклассов
  void boilWater() {
    System.out.println("Boiling water");
  }

  //Общий метод с реализацией для всех субклассов
  void pourInCup() {
    System.out.println("Pouring into cup");
  }
}