package org.example.facade;

import org.example.facade.device.*;

public class HomeTheaterFacade {
  Amplifier amp;
  Tuner tuner;
  DVDPlayer dvdPlayer;
  CDPlayer cdPlayer;
  Projector projector;
  TheaterLights lights;
  Screen screen;
  PopcornPopper popper;

  public HomeTheaterFacade(Amplifier amp, Tuner tuner, DVDPlayer dvdPlayer, CDPlayer cdPlayer, Projector projector,
                           TheaterLights lights, Screen screen, PopcornPopper popper) {
    this.amp = amp;
    this.tuner = tuner;
    this.dvdPlayer = dvdPlayer;
    this.cdPlayer = cdPlayer;
    this.projector = projector;
    this.lights = lights;
    this.screen = screen;
    this.popper = popper;
  }

  public void watchMovie(String movie) {
    System.out.println("Get ready to watch a movie...");
    popper.on();
    popper.pop();
    lights.dim(10);
    screen.down();
    projector.on();
    projector.wideScreenMode();
    amp.on();
    amp.setCd(cdPlayer);
    amp.setSurroundSound();
    amp.setVolume(5);
    dvdPlayer.on();
    dvdPlayer.play(movie);
  }
  public void endMovie() {
    System.out.println("Shutting movie theater down...");
    popper.off();
    lights.on();
    screen.up();
    projector.off();
    amp.off();
    dvdPlayer.stop();
    dvdPlayer.off();
  }
}