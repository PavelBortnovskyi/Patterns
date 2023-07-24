package org.example.facade;

import org.example.facade.device.*;

public class TestDrive {
  public static void main(String[] args) {

    Tuner tuner = new Tuner();
    DVDPlayer dvd = new DVDPlayer();
    CDPlayer cd = new CDPlayer();
    Projector projector = new Projector();
    Screen screen = new Screen();
    TheaterLights lights = new TheaterLights();
    PopcornPopper popper = new PopcornPopper();
    Amplifier amp = new Amplifier(tuner, cd, dvd);

    HomeTheaterFacade homeTheater = new HomeTheaterFacade(amp, tuner, dvd, cd, projector, lights, screen, popper);
    homeTheater.watchMovie("Raiders of the Lost Ark");
    homeTheater.endMovie();
  }
}

