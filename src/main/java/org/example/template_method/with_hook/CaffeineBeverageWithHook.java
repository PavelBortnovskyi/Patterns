package org.example.template_method.with_hook;

public abstract class CaffeineBeverageWithHook {

  final void prepareRecipe() {
    boilWater();
    brew();
    pourInCup();
    //Добавлено условие в основной метод шаблона
    if (customerWantsCondiments()) {
      addCondiments();
    }
  }

  abstract void brew();
  abstract void addCondiments();
  void boilWater() {
    System.out.println("Boiling water");
  }
  void pourInCup() {
    System.out.println("Pouring into cup");
  }

  //Добавлен метод-перехватчик, который может переопределяться субклассами при необходимости
  boolean customerWantsCondiments() {
    return true;
  }
}
