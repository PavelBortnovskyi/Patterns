package org.example.facade.device;

public class TheaterLights {

  public void on() {
    System.out.println("Theater lights is ON");
  }

  public void off() {
    System.out.println("Theater lights is OFF");
  }

  public void dim(int brightness) {
    System.out.println("Theater lights brighness set to " + brightness);
  }

  @Override
  public String toString() {
    return "TheaterLights{}";
  }
}
