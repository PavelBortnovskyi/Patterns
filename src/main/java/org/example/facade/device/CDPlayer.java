package org.example.facade.device;

public class CDPlayer {

  Amplifier amplifier;

//  public CDPlayer(Amplifier amplifier) {
//    this.amplifier = amplifier;
//  }

  public void on() {
    System.out.println("CD player is ON");
  }

  public void off() {
    System.out.println("CD player is OFF");
  }

  public void eject() {
    System.out.println("CD player ejected");
  }

  public void pause() {
    System.out.println("Paused CD");
  }

  public void play() {
    System.out.println("Playing CD");
  }

  public void stop() {
    System.out.println("CD stopped");
  }

  @Override
  public String toString() {
    return "CDPlayer{" +
      "amplifier=" + amplifier +
      '}';
  }
}
