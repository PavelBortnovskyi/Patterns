package org.example.proxy.remote_proxy;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface GumballMachineRemote extends Remote {

  //Все возвращаемые типы должны быть либо примитивами, либо Serializable
  //Все методы могут вызывать RemoteException
  public int getCount() throws RemoteException;
  public String getLocation() throws RemoteException;
  public State getState() throws RemoteException;
}