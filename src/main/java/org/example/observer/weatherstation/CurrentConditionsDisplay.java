package org.example.observer.weatherstation;

import org.example.observer.weatherstation.interfaces.DisplayElement;
import org.example.observer.weatherstation.interfaces.Observer;

public class CurrentConditionsDisplay implements Observer, DisplayElement {
  private float temperature;
  private float humidity;
  private WeatherData weatherData;


  //Конструктор который сразу оформляет подписку на объект имплементирующий Subject
  public CurrentConditionsDisplay(WeatherData weatherData) {
    this.weatherData = weatherData;
    weatherData.registerObserver(this);
  }

  //Метод запрашивающий данные после получения уведомления об изменениях в методе notifyObservers класса WeatherData (Subject)
  public void update() {
    this.temperature = this.weatherData.getTemperature();
    this.humidity = this.weatherData.getHumidity();
    this.display();
  }

  //Метод выводящий в консоль текущие параметры среды
  public void display() {
    System.out.println("Current conditions: " + temperature
      + "F degrees and " + humidity + "% humidity");
  }
}
