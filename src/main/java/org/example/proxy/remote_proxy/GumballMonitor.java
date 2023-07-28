package org.example.proxy.remote_proxy;

import java.rmi.RemoteException;

public class GumballMonitor {

  //Используем реализацию интерфейса удаленного доступа
  GumballMachineRemote machine;

  public GumballMonitor(GumballMachineRemote machine) {
    this.machine = machine;
  }

  //Метод выводит информацию об автомате
  public void report() {
    try {
      System.out.println("Gumball Machine: " + machine.getLocation());
      System.out.println("Current inventory: " + machine.getCount() + " gumballs");
      System.out.println("Current state: " + machine.getState().getName());
    } catch (RemoteException ex) {
      ex.printStackTrace();
    }
  }
}
