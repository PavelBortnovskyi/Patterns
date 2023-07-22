package org.example.decorator.coffee.base;

import org.example.decorator.coffee.Size;

public class HouseBlend extends Beverage {

  public HouseBlend(Size size) {
    this.size = size;
    this.description = "House Blend Coffee";
  }

  public double cost() {
    return switch (this.size) {
      case TALL -> 0.89;
      case GRANDE -> 1.1;
      case VENTI -> 1.6;
    };
  }
}
