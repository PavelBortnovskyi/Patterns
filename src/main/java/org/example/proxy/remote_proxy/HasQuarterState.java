package org.example.proxy.remote_proxy;

import java.util.Random;

//Состояние с вставленной монеткой
public class HasQuarterState implements State {

  private static final long serialVersionUID = 3L;

  final String name = "HasQuarter";

  //Храним объект автомата в поле класса, transient ограничивает сериализацию поля
  transient GumballMachine gumballMachine;

  //Генератор случайных чисел для реализации выигрыша дополнительного шарика
  Random randomWinner = new Random(System.currentTimeMillis());


  public HasQuarterState(GumballMachine gumballMachine) {
    this.gumballMachine = gumballMachine;
  }

  //Выполнение метода в данном состоянии ведет к ошибке
  @Override
  public void insertQuarter() {
    System.out.println("You can’t insert another quarter");
  }

  //Выполнение метода возвращает монетку с переводит в режим ожидания
  @Override
  public void ejectQuarter() {
    System.out.println("Quarter returned");
    gumballMachine.setState(gumballMachine.getNoQuarterState());
  }

  //Метод нажатия рычажка с 10% шансом выдает 2ю порцию
  @Override
  public void turnCrank() {
    System.out.println("You turned...");
    int winner = randomWinner.nextInt(10);
    if ((winner == 0) && (gumballMachine.getCount() > 1)) {
      gumballMachine.setState(gumballMachine.getWinnerState());
    } else {
      gumballMachine.setState(gumballMachine.getSoldState());
    }
  }

  //Метод заглушка для данного состояния
  @Override
  public void dispense() {
    System.out.println("No gumball dispensed");
  }

  //Метод заглушка для данного состояния
  @Override
  public void refill() {
  }

  @Override
  public String getName() {
    return this.name;
  }
}
