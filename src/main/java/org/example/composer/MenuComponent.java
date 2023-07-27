package org.example.composer;

public abstract class MenuComponent {

  //Все методы имеют стандартную реализацию с выбросом исключения, т.к. не все суб-классы будут реализовывать все методы

  //Относится к группе комбинационных методов для добавления объекта
  public void add(MenuComponent menuComponent) {
    throw new UnsupportedOperationException();
  }

  //Относится к группе комбинационных методов для удаления объекта
  public void remove(MenuComponent menuComponent) {
    throw new UnsupportedOperationException();
  }

  //Относится к группе комбинационных методов для получения объекта
  public MenuComponent getChild(int i) {
    throw new UnsupportedOperationException();
  }

  //Относится к группе методов операций, в частности получения имени объекта
  public String getName() {
    throw new UnsupportedOperationException();
  }

  //Относится к группе методов операций, в частности получения описания объекта
  public String getDescription() {
    throw new UnsupportedOperationException();
  }

  //Относится к группе методов операций, в частности получения параметра цены объекта
  public double getPrice() {
    throw new UnsupportedOperationException();
  }

  //Относится к группе методов операций, в частности получения логического маркера
  public boolean isVegetarian() {
    throw new UnsupportedOperationException();
  }

  //Относится к группе методов операций, в частности вывода информации об объекте
  public void print() {
    throw new UnsupportedOperationException();
  }
}
