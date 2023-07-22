package org.example.observer.weatherstation.interfaces;

public interface Subject {

  //Метод добавления подписчика
  public void registerObserver(Observer o);

  //Метод удаление подписчика
  public void removeObserver(Observer o);

  //Метод для инициализации рассылки уведомления подписчиков об изменениях
  public void notifyObservers();
}