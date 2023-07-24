package org.example.facade.device;

public class DVDPlayer {

  Amplifier amplifier;

//  public DVDPlayer(Amplifier amplifier) {
//    this.amplifier = amplifier;
//  }

  public void on() {
    System.out.println("DVD player is ON");
  }

  public void off() {
    System.out.println("DVD player is OFF");
  }

  public void eject() {
    System.out.println("DVD player ejected");
  }

  public void pause() {
    System.out.println("Paused DVD");
  }

  public void play(String movie) {
    System.out.println("Playing DVD " + movie);
  }

  public void stop() {
    System.out.println("DVD stopped");
  }

  public void setSurroundAudio() {
    System.out.println("DVD surround ready");
  }

  public void setTwoChannelAudio() {
    System.out.println("DVD 2ch audio ready");
  }

  @Override
  public String toString() {
    return "DVDPlayer{" +
      "amplifier=" + amplifier +
      '}';
  }
}
