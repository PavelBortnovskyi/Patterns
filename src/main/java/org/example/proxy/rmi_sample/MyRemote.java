package org.example.proxy.rmi_sample;

import java.rmi.*;

//Интерфейс удаленного доступа
public interface MyRemote extends Remote {
  public String sayHello() throws RemoteException;
}