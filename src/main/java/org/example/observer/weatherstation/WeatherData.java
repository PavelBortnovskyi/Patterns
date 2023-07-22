package org.example.observer.weatherstation;

import org.example.observer.weatherstation.interfaces.Observer;
import org.example.observer.weatherstation.interfaces.Subject;

import java.util.ArrayList;

public class WeatherData implements Subject {

  private ArrayList<Observer> observers;

  private float temperature;

  private float humidity;

  private float pressure;

  //Конструктор для инициализации объекта класса
  public WeatherData() {
    observers = new ArrayList<Observer>();
  }

  //Регистрация подписчика
  public void registerObserver(Observer o) {
    observers.add(o);
  }

  //Удаление подписчика
  public void removeObserver(Observer o) {
    observers.remove(o);
  }

  //Рассылка обновленных данных для всех текущих подписчиков
  public void notifyObservers() {
    for (Observer observer : observers) {
      observer.update();
    }
  }

  //Вызов рассылки обновленных данных
  public void measurementsChanged() {
    this.notifyObservers();
  }

  //Эмуляция получения данных
  public void setMeasurements(float temperature, float humidity, float pressure) {
    this.temperature = temperature;
    this.humidity = humidity;
    this.pressure = pressure;
    measurementsChanged();
  }

  public float getTemperature() {
    return this.temperature;
  }

  public float getHumidity() {
    return this.humidity;
  }

  public float getPressure() {
    return this.pressure;
  }
}
