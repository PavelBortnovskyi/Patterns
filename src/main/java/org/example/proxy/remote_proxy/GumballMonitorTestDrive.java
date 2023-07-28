package org.example.proxy.remote_proxy;

import java.rmi.*;
public class GumballMonitorTestDrive {
  public static void main(String[] args) {
    //Создаем массив опрашиваемых адресов
    String[] location = {"rmi://santafe.mightygumball.com/gumballmachine",
                         "rmi://boulder.mightygumball.com/gumballmachine",
                         "rmi://seattle.mightygumball.com/gumballmachine"};

    //Создаем массив мониторов
    GumballMonitor[] monitor = new GumballMonitor[location.length];
    for (int i = 0; i < location.length; i++) {
      try {
        //Создаем заместителя для каждого автомата
        GumballMachineRemote machine = (GumballMachineRemote) Naming.lookup(location[i]);
        monitor[i] = new GumballMonitor(machine);
        System.out.println(monitor[i]);
      } catch (Exception e) {
        e.printStackTrace();
      }
    }
    //Итерируем массив заместителей и вызываем отчет по каждому
    for (GumballMonitor gumballMonitor : monitor) {
      gumballMonitor.report();
    }
  }
}
