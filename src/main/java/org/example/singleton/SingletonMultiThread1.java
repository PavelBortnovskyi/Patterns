package org.example.singleton;

public class SingletonMultiThread1 {

  //Поле статически инициализирует экземпляр класса
  private static final SingletonMultiThread1 uniqueInstance = new SingletonMultiThread1();

  //Конструктор объявлен приватным для использования только внутри класса
  private SingletonMultiThread1() {}

  //Статический метод возвращающий уникальный экземпляр класса
  public static SingletonMultiThread1 getInstance() {
    return uniqueInstance;
  }
}
