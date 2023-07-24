package org.example.facade.device;

public class Screen {

  public void up() {
    System.out.println("Screen UP");
  }

  public void down() {
    System.out.println("Screen DOWN");
  }

  @Override
  public String toString() {
    return "Screen{}";
  }
}
