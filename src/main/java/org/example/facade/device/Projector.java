package org.example.facade.device;

public class Projector {

  DVDPlayer dvdPlayer;

//  public Projector(DVDPlayer dvdPlayer) {
//    this.dvdPlayer = dvdPlayer;
//  }

  public void on() {
    System.out.println("Projector is ON");
  }

  public void off() {
    System.out.println("Projector is OFF");
  }

  public void tvMode() {
    System.out.println("Projector in TV mode");
  }

  public void wideScreenMode() {
    System.out.println("Projector in wide screen mode");
  }

  @Override
  public String toString() {
    return "Projector{" +
      "dvdPlayer=" + dvdPlayer +
      '}';
  }
}
