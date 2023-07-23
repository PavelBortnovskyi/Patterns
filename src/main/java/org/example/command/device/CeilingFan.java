package org.example.command.device;

public class CeilingFan {

  FanSpeed speed;

  String location;

  public CeilingFan(String location) {
    this.location = location;
    this.speed = FanSpeed.OFF;
  }

  public void setSpeed(FanSpeed fanSpeed){
    this.speed = fanSpeed;
  }

  public void off() {
    this.speed = FanSpeed.OFF;
  }

  public FanSpeed getSpeed() {
    return this.speed;
  }
}
