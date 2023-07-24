package org.example.facade.device;

public class PopcornPopper {

  public void on() {
    System.out.println("PP is ON");
  }

  public void off() {
    System.out.println("PP is OFF");
  }

  public void pop() {
    System.out.println("Popcorn preparation...");
  }

  @Override
  public String toString() {
    return "PopcornPopper{}";
  }
}
