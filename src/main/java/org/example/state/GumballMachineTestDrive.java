package org.example.state;

public class GumballMachineTestDrive {
  public static void main(String[] args) {
    //Создаем автомат с 5ю шариками
    GumballMachine gumballMachine = new GumballMachine(5);
    //Выводим состояние автомата
    System.out.println(gumballMachine);
    System.out.println();

    //Вставляем монету и нажимаем рычаг
    gumballMachine.insertQuarter();
    gumballMachine.turnCrank();
    //Проверяем состояние автомата
    System.out.println(gumballMachine);
    System.out.println();

    //Вставляем монету, забираем ее назад и нажимаем рычаг
    gumballMachine.insertQuarter();
    gumballMachine.ejectQuarter();
    gumballMachine.turnCrank();

    //Проверяем состояние автомата
    System.out.println(gumballMachine);
    System.out.println();

    //Вставляем монет, нажимаем рычаг
    gumballMachine.insertQuarter();
    gumballMachine.turnCrank();
    //Вставляем монет, нажимаем рычаг
    gumballMachine.insertQuarter();
    gumballMachine.turnCrank();
    //Забираем монету
    gumballMachine.ejectQuarter();
    System.out.println(gumballMachine);
    System.out.println();

    //Вставляем монеты
    gumballMachine.insertQuarter();
    gumballMachine.insertQuarter();
    //Нажимаем рычаг
    gumballMachine.turnCrank();
    //Вставляем еще монету и нажимаем рычаг
    gumballMachine.insertQuarter();
    gumballMachine.turnCrank();
    //Вставляем еще монету и нажимаем рычаг
    gumballMachine.insertQuarter();
    gumballMachine.turnCrank();
    System.out.println(gumballMachine);
  }
}