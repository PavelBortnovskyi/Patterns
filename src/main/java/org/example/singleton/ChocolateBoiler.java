package org.example.singleton;

public class ChocolateBoiler {
  private boolean empty;
  private boolean boiled;

  private volatile static ChocolateBoiler uniqueSample;

  private ChocolateBoiler() {
    empty = true;
    boiled = false;
  }

  public static ChocolateBoiler getInstance() {
    if (uniqueSample == null) {

      synchronized (ChocolateBoiler.class) {
        if (uniqueSample == null) {
          uniqueSample = new ChocolateBoiler();
        }
      }
    }
    return uniqueSample;
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
