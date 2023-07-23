package org.example.command;

import org.example.command.device.GarageDoor;
import org.example.command.device.TV;

public class TVOnCommand implements Command {

  TV tv;

  TVOnCommand(TV tv) {
    this.tv = tv;
  }

  @Override
  public void execute() {
    this.tv.on();
    System.out.println("TV is switched to ON");
    this.tv.setVolume(5);
    System.out.println("TV volume switched to 5");
  }

  @Override
  public void undo() {
    this.tv.off();
    System.out.println("TV is switched to OFF");
  }
}
