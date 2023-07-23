package org.example.command;

import org.example.command.device.Stereo;

public class StereoOnWithCDCommand implements Command {
  Stereo stereo;

  public StereoOnWithCDCommand(Stereo stereo) {
    this.stereo = stereo;
  }
  public void execute() {
    stereo.on();
    System.out.println("Stereo switched ON");
    stereo.setCD();
    System.out.println("CD was set");
    stereo.setVolume(11);
    System.out.println("Stereo volume set to 11");
  }

  @Override
  public void undo() {
    stereo.setVolume(0);
    System.out.println("Stereo volume set to 0");
    stereo.off();
    System.out.println("Stereo switched OFF");
  }
}