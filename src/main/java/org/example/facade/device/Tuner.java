package org.example.facade.device;

public class Tuner {

  Amplifier amplifier;

//  public Tuner(Amplifier amplifier) {
//    this.amplifier = amplifier;
//  }

  public void on() {
    System.out.println("Tuner is ON");
  }

  public void off() {
    System.out.println("Tuner is OFF");
  }

  public void setAm() {
    System.out.println("Tuner set AM");
  }

  public void setFm() {
    System.out.println("Tuner set FM");
  }

  public void setFrequency(String frequency) {
    System.out.println("Tuner frequency " + frequency + " Hz");
  }

  @Override
  public String toString() {
    return "Tuner{" +
      "amplifier=" + amplifier +
      '}';
  }
}
