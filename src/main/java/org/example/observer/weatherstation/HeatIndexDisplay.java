package org.example.observer.weatherstation;

import org.example.observer.weatherstation.interfaces.DisplayElement;
import org.example.observer.weatherstation.interfaces.Observer;

public class HeatIndexDisplay implements Observer, DisplayElement {
  float heatIndex = 0.0f;
  private WeatherData weatherData;

  //Конструктор который сразу оформляет подписку на объект имплементирующий Subject
  public HeatIndexDisplay(WeatherData weatherData) {
    this.weatherData = weatherData;
    weatherData.registerObserver(this);
  }

  //Метод запрашивающий данные после получения уведомления об изменениях в методе notifyObservers класса WeatherData (Subject)
  public void update() {
    heatIndex = computeHeatIndex(this.weatherData.getTemperature(), this.weatherData.getHumidity());
    display();
  }

  private float computeHeatIndex(float t, float rh) {
    float index = (float)((16.923 + (0.185212 * t) + (5.37941 * rh) - (0.100254 * t * rh)
      + (0.00941695 * (t * t)) + (0.00728898 * (rh * rh))
      + (0.000345372 * (t * t * rh)) - (0.000814971 * (t * rh * rh)) +
      (0.0000102102 * (t * t * rh * rh)) - (0.000038646 * (t * t * t)) + (0.0000291583 *
      (rh * rh * rh)) + (0.00000142721 * (t * t * t * rh)) +
      (0.000000197483 * (t * rh * rh * rh)) - (0.0000000218429 * (t * t * t * rh * rh)) +
      0.000000000843296 * (t * t * rh * rh * rh)) -
      (0.0000000000481975 * (t * t * t * rh * rh * rh)));
    return index;
  }

  public void display() {
    System.out.println("Heat index is " + heatIndex);
  }
}
