package org.example.command;

import org.example.command.device.Hottub;
import org.example.command.device.TV;

public class HottubOnCommand implements Command {

  Hottub hottub;

  HottubOnCommand(Hottub hottub) {
    this.hottub = hottub;
  }

  @Override
  public void execute() {
    this.hottub.on();
    System.out.println("Hottub is switched to ON");
    this.hottub.setTemperature(38);
    System.out.println("Hottub temperature switched to 38");
    this.hottub.circulate();
    System.out.println("Hottub water circulation is ON");
    this.hottub.jetsOn();
    System.out.println("Hottub jets is ON");

  }

  @Override
  public void undo() {
    this.hottub.off();
    System.out.println("Hottub is switched to OFF");
  }
}
