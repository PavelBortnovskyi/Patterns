package org.example.decorator.coffee.mods;

import org.example.decorator.coffee.Size;
import org.example.decorator.coffee.base.Beverage;

public abstract class CondimentDecorator extends Beverage {

  //Поле для помещения основы для обертывания
  Beverage beverage;

  //Переопределяем метод получения размер порции, чтобы при множественном оборачивании объекта возможно было получать этот параметр
  @Override
  public Size getSize() {
    return this.beverage.getSize();
  }

  public abstract String getDescription();

}