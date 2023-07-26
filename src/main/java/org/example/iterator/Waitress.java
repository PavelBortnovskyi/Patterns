package org.example.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Waitress {
  List<Menu> menus;


  public Waitress(ArrayList<Menu> menus) {
    this.menus = menus;
  }

  public void printMenu() {
   Iterator<Menu> menuIterator = this.menus.iterator();
   while (menuIterator.hasNext()){
     Menu menu = menuIterator.next();
     System.out.println(menu.getName());
     this.printMenu(menu.createIterator());
   }
  }

  //Перегрузка метода для использования в публичном методе выше
  private void printMenu(Iterator<MenuItem> iterator) {
    while (iterator.hasNext()) {
      MenuItem menuItem = iterator.next();
      System.out.print(menuItem.getName() + ", ");
      System.out.print(menuItem.getPrice() + " -- ");
      System.out.println(menuItem.getDescription());
    }
  }
}