package org.example.composer;

import java.util.ArrayList;
import java.util.List;

public class Menu extends MenuComponent {

  //Внутрення коллекция для хранения объектов MenuComponent
  List<MenuComponent> menuComponents = new ArrayList<MenuComponent>();
  String name;
  String description;

  //Каждое меню имеет название и описание
  public Menu(String name, String description) {
    this.name = name;
    this.description = description;
  }

  //Т.к. MenuItem и Menu являются наследниками MenuComponent, то методы будут универсальными

  public void add(MenuComponent menuComponent) {
    this.menuComponents.add(menuComponent);
  }

  public void remove(MenuComponent menuComponent) {
    this.menuComponents.remove(menuComponent);
  }

  public MenuComponent getChild(int i) {
    return menuComponents.get(i);
  }

  public String getName() {
    return name;
  }

  public String getDescription() {
    return description;
  }

  public void print() {
    System.out.print("\n" + getName());
    System.out.println(", " + getDescription());
    System.out.println("---------------------");

    //Перебор внутренней коллекции компонентов с рекурсивным вызовом метода print, который переопределен в наследниках
    for (MenuComponent menuComponent : this.menuComponents) {
      menuComponent.print();
    }
  }
}
