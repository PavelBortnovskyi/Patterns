package org.example.state;

//Состояние выдачи шарика
public class SoldState implements State {

  final String name = "Sold";
  //Храним объект автомата в поле класса
  GumballMachine gumballMachine;

  public SoldState(GumballMachine gumballMachine) {
    this.gumballMachine = gumballMachine;
  }

  //Метод в данном состоянии вызывает ошибку
  @Override
  public void insertQuarter() {
    System.out.println("Please wait, we’re already giving you a gumball");
  }

  //Метод в данном состоянии вызывает ошибку
  @Override
  public void ejectQuarter() {
    System.out.println("Sorry, you already turned the crank");
  }

  //Метод в данном состоянии вызывает ошибку
  @Override
  public void turnCrank() {
    System.out.println("Turning twice doesn’t get you another gumball!");
  }

  //Метод для выдачи шарика
  @Override
  public void dispense() {
    this.gumballMachine.releaseBall();
    if (gumballMachine.getCount() > 0) {
      gumballMachine.setState(gumballMachine.getNoQuarterState());
    } else {
      System.out.println("Oops, out of gumballs!");
      gumballMachine.setState(gumballMachine.getSoldOutState());
    }
  }

  //Метод заглушка в данном состоянии
  @Override
  public void refill() {

  }

  @Override
  public String getName() {
    return this.name;
  }
}
