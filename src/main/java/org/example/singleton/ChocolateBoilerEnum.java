package org.example.singleton;

public enum ChocolateBoilerEnum {

    INSTANCE;

    private boolean empty;
    private boolean boiled;

    ChocolateBoilerEnum() {
      empty = true;
      boiled = false;
    }

    public void fill() {
      if (isEmpty()) {
        empty = false;
        boiled = false;
        // Заполнение нагревателя молочно-шоколадной смесью
      }
    }

    public void drain() {
      if (!isEmpty() && isBoiled()) {
        // Слить нагретое молоко и шоколад
        empty = true;
      }
    }

    public void boil() {
      if (!isEmpty() && !isBoiled()) {
        // Довести содержимое до кипения
        boiled = true;
      }
    }

    public boolean isEmpty() {
      return empty;
    }

    public boolean isBoiled() {
      return boiled;
    }
  }

