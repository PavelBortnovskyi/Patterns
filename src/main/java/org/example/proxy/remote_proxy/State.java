package org.example.proxy.remote_proxy;

import java.io.Serializable;

public interface State extends Serializable {

  void insertQuarter();
  void ejectQuarter();
  void turnCrank();
  void dispense();
  void refill();
  String getName();
}
