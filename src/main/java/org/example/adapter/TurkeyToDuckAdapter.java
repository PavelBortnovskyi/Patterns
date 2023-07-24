package org.example.adapter;

public class TurkeyToDuckAdapter implements Duck {
  Turkey turkey;

  //В конструкторе получаем объект для адаптации
  public TurkeyToDuckAdapter(Turkey turkey) {
    this.turkey = turkey;
  }

  //Эмуляция кряканья
  public void quack() {
    turkey.gobble();
  }

  //Эмуляция полета
  public void fly() {
    for(int i=0; i < 5; i++) {
      turkey.fly();
    }
  }
}