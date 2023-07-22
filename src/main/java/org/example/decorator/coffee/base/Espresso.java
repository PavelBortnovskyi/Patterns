package org.example.decorator.coffee.base;

import org.example.decorator.coffee.Size;

public class Espresso extends Beverage {

  public Espresso(Size size) {
    this.size = size;
    this.description = "Espresso";
  }

  public double cost() {
    return switch (this.size) {
      case TALL -> 1.99;
      case GRANDE -> 2.2;
      case VENTI -> 2.5;
    };
  }
}
