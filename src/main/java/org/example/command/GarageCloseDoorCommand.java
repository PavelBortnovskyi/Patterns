package org.example.command;

import org.example.command.device.GarageDoor;

public class GarageCloseDoorCommand implements Command {

  GarageDoor garageDoor;

  GarageCloseDoorCommand(GarageDoor garageDoor) {
    this.garageDoor = garageDoor;
  }

  @Override
  public void execute() {
    this.garageDoor.down();
    System.out.println("GarageDoor is closed");
  }

  @Override
  public void undo() {
    this.garageDoor.up();
    System.out.println("GarageDoor is opened");
  }
}
