package org.example.state;

//Состояние когда повезло получить 2ю порцию
public class WinnerState implements State {

  final String name = "Winner!";

  //Храним объект автомата в поле класса
  GumballMachine gumballMachine;

  public WinnerState(GumballMachine gumballMachine) {
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

  //Метод выдачи 2й порции
  public void dispense() {
    this.gumballMachine.releaseBall();
    if (this.gumballMachine.getCount() == 0) {
      this.gumballMachine.setState(this.gumballMachine.getSoldOutState());
    } else {
      this.gumballMachine.releaseBall();
      System.out.println("YOU’RE A WINNER! You got two gumballs for your quarter");
      if (this.gumballMachine.getCount() > 0) {
        this.gumballMachine.setState(this.gumballMachine.getNoQuarterState());
      } else {
        System.out.println("Oops, out of gumballs!");
        this.gumballMachine.setState(this.gumballMachine.getSoldOutState());
      }
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
