package org.example.observer.weatherstation;

import org.example.observer.weatherstation.interfaces.DisplayElement;
import org.example.observer.weatherstation.interfaces.Observer;

public class StatisticsDisplay implements Observer, DisplayElement {
  private float maxTemp = 0.0f;
  private float minTemp = 200;
  private float tempSum = 0.0f;
  private int numReadings;
  private WeatherData weatherData;

  //Конструктор который сразу оформляет подписку на объект имплементирующий Subject
  public StatisticsDisplay(WeatherData weatherData) {
    this.weatherData = weatherData;
    weatherData.registerObserver(this);
  }

  //Метод запрашивающий данные после получения уведомления об изменениях в методе notifyObservers класса WeatherData (Subject)
  public void update() {
    float temp = this.weatherData.getTemperature();
    tempSum += temp;
    numReadings++;

    if (temp > maxTemp) {
      maxTemp = temp;
    }

    if (temp < minTemp) {
      minTemp = temp;
    }

    this.display();
  }

  public void display() {
    System.out.println("Avg/Max/Min temperature = " + (tempSum / numReadings)
      + "/" + maxTemp + "/" + minTemp);
  }
}