package org.example.command;

import org.example.command.device.Light;

public class LightOnCommand implements Command{

  Light light;

  LightOnCommand(Light light){
    this.light = light;
  }

  @Override
  public void execute() {
     this.light.on();
    System.out.println(light.getRoom() + " light is switched ON");
  }

  @Override
  public void undo() {
    this.light.off();
    System.out.println(light.getRoom() + " light is switched OFF");
  }
}
