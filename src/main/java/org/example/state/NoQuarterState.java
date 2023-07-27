package org.example.state;

//Основное состояние автомата - ожидание монетки
public class NoQuarterState implements State {

  final String name = "NoQuarter";

  //Сам объект автомата является полем
  GumballMachine gumballMachine;

  public NoQuarterState(GumballMachine gumballMachine) {
    this.gumballMachine = gumballMachine;
  }

  //Метод для вставки монетки
  @Override
  public void insertQuarter() {
    System.out.println("You inserted a quarter");
    gumballMachine.setState(gumballMachine.getHasQuarterState());
  }

  //Метод в данном состоянии вызывает ошибку
  @Override
  public void ejectQuarter() {
    System.out.println("You haven’t inserted a quarter");
  }

  //Метод в данном состоянии вызывает ошибку
  @Override
  public void turnCrank() {
    System.out.println("You turned, but there’s no quarter");
  }

  //Метод в данном состоянии вызывает ошибку
  @Override
  public void dispense() {
    System.out.println("You need to pay first");
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
