package org.example.command;

import org.example.command.device.*;

public class RemoteControlTest {
  public static void main(String[] args) {

    SimpleRemoteControl remote = new SimpleRemoteControl();

    Light light1 = new Light("Living room");
    Light light2 = new Light("Kitchen");

    GarageDoor garageDoor = new GarageDoor();
    CeilingFan ceilingFan = new CeilingFan("Kitchen");
    Stereo stereo = new Stereo();
    TV tv = new TV();
    Hottub hottub = new Hottub();

    remote.setCommand(0, new LightOnCommand(light1), new LightOffCommand(light1));
    remote.setCommand(1, new LightOnCommand(light2), new LightOffCommand(light2));
    remote.onButtonWasPushed(0);
    remote.offButtonWasPushed(0);
    remote.undoButtonWasPushed();
    remote.onButtonWasPushed(1);
    remote.offButtonWasPushed(1);

    remote.setCommand(2, new CeilingFanCommand(ceilingFan, FanSpeed.HIGH), new CeilingFanCommand(ceilingFan, FanSpeed.OFF));
    remote.onButtonWasPushed(2);

    remote.setCommand(2, new CeilingFanCommand(ceilingFan, FanSpeed.MEDIUM), new CeilingFanCommand(ceilingFan, FanSpeed.OFF));
    remote.onButtonWasPushed(2);

    remote.setCommand(2, new CeilingFanCommand(ceilingFan, FanSpeed.LOW), new CeilingFanCommand(ceilingFan, FanSpeed.OFF));
    remote.onButtonWasPushed(2);
    remote.undoButtonWasPushed();
    remote.offButtonWasPushed(2);

    remote.setCommand(3, new GarageOpenDoorCommand(garageDoor), new GarageCloseDoorCommand(garageDoor));
    remote.onButtonWasPushed(3);
    remote.offButtonWasPushed(3);

    remote.setCommand(4, new StereoOnWithCDCommand(stereo), new StereoOff(stereo));
    remote.onButtonWasPushed(4);
    remote.offButtonWasPushed(4);

    System.out.println(remote.toString());

    MacroCommand cmdGroup = new MacroCommand(new Command[]{new LightOnCommand(light1), new StereoOnWithCDCommand(stereo),
      new TVOnCommand(tv), new HottubOnCommand(hottub)});
    remote.setCommand(5, cmdGroup, new NoCommand());
    remote.onButtonWasPushed(5);
  }
}