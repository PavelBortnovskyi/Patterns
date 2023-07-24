package org.example.facade.device;

public class Amplifier {

  Tuner tuner;

  CDPlayer cdPlayer;

  DVDPlayer dvdPlayer;

  public Amplifier(Tuner tuner, CDPlayer cdPlayer, DVDPlayer dvdPlayer) {
    this.tuner = tuner;
    this.cdPlayer = cdPlayer;
    this.dvdPlayer = dvdPlayer;
  }

  public void on() {
    System.out.println("Amplifier is ON");
  }

  public void off() {
    System.out.println("Amplifier is OFF");
  }

  public void setCd(CDPlayer cdPlayer) {
    System.out.println("CD player on-line");
  }

  public void setDvd(DVDPlayer dvdPlayer) {
    System.out.println("DVD player on-line");
  }

  public void setStereoSound() {
    System.out.println("Stereo system ready");
  }

  public void setSurroundSound() {
    System.out.println("Dolby Surround system ready");
  }

  public void setTuner(Tuner tuner) {
    this.tuner = tuner;
    System.out.println("Tuner on-line");
  }

  public void setVolume(int value) {
    System.out.println("Volume is set to " + value);
  }

  @Override
  public String toString() {
    return "Amplifier{" +
      "tuner=" + tuner +
      ", cdPlayer=" + cdPlayer +
      ", dvdPlayer=" + dvdPlayer +
      '}';
  }

}
