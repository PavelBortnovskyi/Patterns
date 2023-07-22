package org.example.singleton;

public class SingletonMultiThread2 {

  //Поле объявлено волатильным для синхронизации
  private volatile static SingletonMultiThread2 uniqueInstance;
  private SingletonMultiThread2() {}
  public static SingletonMultiThread2 getInstance() {
    if (uniqueInstance == null) {

      //Блок синхронизации выполнится только 1 раз при инициализации экземпляра
      synchronized (SingletonMultiThread2.class) {
        if (uniqueInstance == null) {
          uniqueInstance = new SingletonMultiThread2();
        }
      }
    }
    return uniqueInstance;
  }
}
