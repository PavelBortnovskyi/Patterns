package org.example.singleton;

public class Singleton {

  //Поле хранит ссылку на экземпляр класса
  private static Singleton uniqueInstance;

  //Конструктор объявлен приватным для использования только внутри класса
  private Singleton() {}

  //Статический метод создающий или возвращающий уникальный экземпляр класса
  public static Singleton getInstance() {
    if (uniqueInstance == null) {
      uniqueInstance = new Singleton();
    }
    return uniqueInstance;
  }
}
