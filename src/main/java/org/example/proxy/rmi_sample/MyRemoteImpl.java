package org.example.proxy.rmi_sample;

import java.rmi.*;
import java.rmi.server.*;

//Расширение UnicastRemoteObject - простейший способ создания объекта с поддержкой удаленного доступа
public class MyRemoteImpl extends UnicastRemoteObject implements MyRemote {
  private static final long serialVersionUID = 1L;
  public String sayHello() {
    return "Server says, ‘Hey’";
  }
  public MyRemoteImpl() throws RemoteException { }
  public static void main (String[] args) {
    try {
      MyRemote service = new MyRemoteImpl();
      //Регистрация объекта в реестре RMI
      Naming.rebind("RemoteHello", service);
    } catch(Exception ex) {
      ex.printStackTrace();
    }
  }
}
