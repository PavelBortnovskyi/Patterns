package org.example.observer.weatherstation;

import org.example.observer.weatherstation.interfaces.DisplayElement;
import org.example.observer.weatherstation.interfaces.Observer;

public class ForecastDisplay implements Observer, DisplayElement {
  private float currentPressure = 29.92f;
  private float lastPressure;
  private WeatherData weatherData;

  //Конструктор который сразу оформляет подписку на объект имплементирующий Subject
  public ForecastDisplay(WeatherData weatherData) {
    this.weatherData = weatherData;
    weatherData.registerObserver(this);
  }

  //Метод запрашивающий данные после получения уведомления об изменениях в методе notifyObservers класса WeatherData (Subject)
  public void update() {
    lastPressure = currentPressure;
    currentPressure = this.weatherData.getPressure();
    this.display();
  }

  public void display() {
    System.out.print("Forecast: ");
    if (currentPressure > lastPressure) {
      System.out.println("Improving weather on the way!");
    } else if (currentPressure == lastPressure) {
      System.out.println("More of the same");
    } else if (currentPressure < lastPressure) {
      System.out.println("Watch out for cooler, rainy weather");
    }
  }
}
