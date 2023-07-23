package org.example.command;

import org.example.command.device.GarageDoor;

public class GarageOpenDoorCommand implements Command {

  GarageDoor garageDoor;

  GarageOpenDoorCommand(GarageDoor garageDoor) {
    this.garageDoor = garageDoor;
  }

  @Override
  public void execute() {
    this.garageDoor.up();
    System.out.println("GarageDoor is opened");
  }

  @Override
  public void undo() {
    this.garageDoor.down();
    System.out.println("GarageDoor is closed");
  }
}
