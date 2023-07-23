package org.example.command;

import org.example.command.device.CeilingFan;

public class NoCommand implements Command {

  NoCommand() {
  }

  @Override
  public void execute() {
    System.out.println("Empty command slot!");
  }

  @Override
  public void undo() {
    System.out.println("Empty command slot!");
  }
}
