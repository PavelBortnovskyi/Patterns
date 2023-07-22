package org.example.decorator.coffee;

import org.example.decorator.coffee.base.Beverage;
import org.example.decorator.coffee.base.DarkRoast;
import org.example.decorator.coffee.base.Espresso;
import org.example.decorator.coffee.base.HouseBlend;
import org.example.decorator.coffee.mods.Mocha;
import org.example.decorator.coffee.mods.Soy;
import org.example.decorator.coffee.mods.Whip;

public class StarbuzzCoffee {

  public static void main(String args[]) {

    //Создаем объект без декораций/дополнений
    Beverage beverage = new Espresso(Size.VENTI);
    System.out.println(beverage.getDescription()
      + " $" + beverage.cost());

    //Создаем объект как основу декорации
    Beverage beverage2 = new DarkRoast(Size.TALL);

    //Добавляем декорации путем оборачивания базового объекта
    beverage2 = new Mocha(beverage2);
    beverage2 = new Mocha(beverage2);
    beverage2 = new Whip(beverage2);

    //Выводим полное название результирующего объекта и его стоимость
    System.out.println(beverage2.getDescription()
      + " $" + beverage2.cost());

    //Создаем объект как основу декорации
    Beverage beverage3 = new HouseBlend(Size.GRANDE);

    //Добавляем декорации путем оборачивания базового объекта
    beverage3 = new Soy(beverage3);
    beverage3 = new Mocha(beverage3);
    beverage3 = new Whip(beverage3);

    //Выводим полное название результирующего объекта и его стоимость
    System.out.println(beverage3.getDescription()
      + " $" + beverage3.cost());
  }
}
