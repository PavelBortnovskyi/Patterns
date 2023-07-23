package org.example.command.device;

public class Light {

  String room;

  public Light(String room){
    this.room = room;
  }

  public void on(){};

  public void  off(){};

  public void dim(){};

  public String getRoom(){
    return this.room;
  }
}
