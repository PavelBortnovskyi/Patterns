package org.example.command;

import org.example.command.device.Light;

public class LightOffCommand implements Command {

  Light light;

  LightOffCommand(Light light) {
    this.light = light;
  }

  @Override
  public void execute() {
    this.light.off();
    System.out.println(light.getRoom() + " light is switched OFF");
  }

  @Override
  public void undo() {
    this.light.on();
    System.out.println(light.getRoom() + " light is switched ON");
  }
}
