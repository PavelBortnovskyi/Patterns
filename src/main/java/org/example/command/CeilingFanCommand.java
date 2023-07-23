package org.example.command;

import org.example.command.device.CeilingFan;
import org.example.command.device.FanSpeed;

public class CeilingFanCommand implements Command {

  CeilingFan ceilingFan;

  FanSpeed prevSpeed;

  FanSpeed setSpeed;

  CeilingFanCommand(CeilingFan ceilingFan, FanSpeed fanSpeed) {
    this.ceilingFan = ceilingFan;
    this.setSpeed = fanSpeed;
  }

  @Override
  public void execute() {
    this.prevSpeed = ceilingFan.getSpeed();
    this.ceilingFan.setSpeed(setSpeed);
    System.out.println("Ceiling Fan is switched to " + setSpeed.name() + " speed");
  }

  @Override
  public void undo() {
    switch (prevSpeed) {
      case HIGH -> {
        this.ceilingFan.setSpeed(FanSpeed.HIGH);
        System.out.println("Ceiling Fan is switched back to HIGH speed");
      }
      case MEDIUM -> {
        this.ceilingFan.setSpeed(FanSpeed.MEDIUM);
        System.out.println("Ceiling Fan is switched back to MEDIUM speed");
      }
      case LOW -> {
        this.ceilingFan.setSpeed(FanSpeed.LOW);
        System.out.println("Ceiling Fan is switched back to LOW speed");
      }
      case OFF -> {
        this.ceilingFan.off();
        System.out.println("Ceiling Fan is switched back to OFF");
      }
    }
  }
}
