package org.example.decorator.coffee.base;

import org.example.decorator.coffee.Size;

public class Decaf extends Beverage {

  public Decaf(Size size) {
    this.size = size;
    this.description = "Decaf Coffee";
  }

  public double cost() {
    return switch (this.size) {
      case TALL -> 1.05;
      case GRANDE -> 1.25;
      case VENTI -> 1.45;
    };
  }
}
