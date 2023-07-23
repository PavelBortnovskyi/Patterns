package org.example.command;

import org.example.command.device.Stereo;

public class StereoOff implements Command {
  Stereo stereo;

  public StereoOff(Stereo stereo) {
    this.stereo = stereo;
  }

  public void execute() {
    stereo.setVolume(0);
    System.out.println("Stereo volume set to 0");
    stereo.off();
    System.out.println("Stereo switched OFF");
  }

  @Override
  public void undo() {
    stereo.on();
    System.out.println("Stereo switched ON");
    stereo.setCD();
    System.out.println("CD was set");
    stereo.setVolume(11);
    System.out.println("Stereo volume set to 11");
  }
}