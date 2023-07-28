package org.example.proxy.remote_proxy;

//Состояние опустошенного автомата
public class SoldOutState implements State {

  private static final long serialVersionUID = 0L;
  final String name = "SoldOutQuarter";

  //Храним объект автомата в поле класса, transient ограничивает сериализацю поля
  transient GumballMachine gumballMachine;

  public SoldOutState(GumballMachine gumballMachine) {
    this.gumballMachine = gumballMachine;
  }

  //Метод в данном состоянии вызывает ошибку
  @Override
  public void insertQuarter() {
    System.out.println("The machine is empty! Please use your coin next time");
    this.ejectQuarter();
  }

  //Метод в данном состоянии вызывает ошибку
  @Override
  public void ejectQuarter() {
    System.out.println("Please take back your coin");
  }

  //Метод в данном состоянии вызывает ошибку
  @Override
  public void turnCrank() {
    System.out.println("The machine is empty! Don`t touch the crank. You already received your coin back right?)");
  }

  //Метод в данном состоянии вызывает ошибку
  @Override
  public void dispense() {
    System.out.println("The machine is empty!");
  }

  //Метод обновляет счетчик шариков в автомате (не является заглушкой только в этом состоянии)
  @Override
  public void refill() {
    this.gumballMachine.setState(this.gumballMachine.getNoQuarterState());
  }

  @Override
  public String getName() {
    return this.name;
  }
}
