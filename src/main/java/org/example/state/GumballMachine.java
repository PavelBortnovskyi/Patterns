package org.example.state;

public class GumballMachine {

  //Возможные состояния автомата
  State soldOutState;
  State noQuarterState;
  State hasQuarterState;
  State soldState;
  State winnerState;

  //Переменные состояния
  State state = soldOutState;
  int count = 0;

  //Конструктор инициализирует состояние автомата
  public GumballMachine(int count) {
    this.soldOutState = new SoldOutState(this);
    this.noQuarterState = new NoQuarterState(this);
    this.hasQuarterState = new HasQuarterState(this);
    this.soldState = new SoldState(this);
    this.winnerState = new WinnerState(this);
    this.count = count;
    if (count > 0) {
      this.state = noQuarterState;
    } else this.state = soldOutState;
  }

  //Метод обрабатывающий действие вставки монетки и меняющий состояние в зависимости от текущего
  public void insertQuarter() {
    state.insertQuarter();
  }

  //Метод обрабатывающий действие запроса возврата монетки
  public void ejectQuarter() {
    state.ejectQuarter();
  }

  //Метод обрабатывающий действие нажатия рычага
  public void turnCrank() {
    if (this.state.equals(hasQuarterState)) {
      this.state.turnCrank();
      this.state.dispense();
    } else System.out.println("Please insert coin before turn crank");
  }

  //Метод устанавливающий состояние автомата
  void setState(State state) {
    this.state = state;
  }

  //Метод выдает шарики
  void releaseBall() {
    System.out.println("A gumball comes rolling out the slot...");
    if (count != 0) {
      count--;
    }
  }

  //Метод обновляет счетчик шариков в автомате на заданное кол-во
  public void refill(int count) {
    this.count += count;
    System.out.println("This machine refilled, actual count: " + this.count);
    this.state.refill();
  }

  public int getCount() {
    return this.count;
  }

  public State getState() {
    return this.state;
  }

  public State getSoldOutState() {
    return this.soldOutState;
  }

  public State getSoldState() {
    return this.soldState;
  }

  public State getHasQuarterState() {
    return this.hasQuarterState;
  }

  public State getNoQuarterState() {
    return this.noQuarterState;
  }

  public State getWinnerState() {
    return this.winnerState;
  }

  @Override
  public String toString() {
    return "GumballMachine{" +
      "state=" + state.getName() +
      ", count=" + count +
      '}';
  }
}
