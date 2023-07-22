package org.example.decorator.coffee.base;

import org.example.decorator.coffee.Size;

public abstract class Beverage {

  public Size size;

  String description = "Base";

  public String getDescription() {
    return description;
  }

  public abstract double cost();

  public void setSize(Size size) {
    this.size = size;
  }

  public Size getSize() {
    return this.size;
  }
}
