//package org.example.iterator_composer;
//
//import java.util.List;
//
////Класс создан как промежуточный пример
//public class PancakeHouseMenuIterator implements Iterator {
//  List<MenuItem> items;
//  int position = 0;
//
//  public PancakeHouseMenuIterator(List<MenuItem> items) {
//    this.items = items;
//  }
//
//  public MenuItem next() {
//    return this.items.get(this.position++);
//  }
//
//  public boolean hasNext() {
//    if (this.position >= this.items.size() || this.items.get(this.position) == null) {
//      return false;
//    } else {
//      return true;
//    }
//  }
//}
