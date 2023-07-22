package org.example.decorator.coffee.base;

import org.example.decorator.coffee.Size;

public class DarkRoast extends Beverage {

  public DarkRoast(Size size) {
    this.size = size;
    this.description = "DarkRoast Coffee";
  }

  public double cost() {
    return switch (this.size) {
      case TALL -> 0.99;
      case GRANDE -> 1.2;
      case VENTI -> 1.4;
    };
  }
}
