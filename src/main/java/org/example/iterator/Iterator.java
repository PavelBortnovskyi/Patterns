package org.example.iterator;

//Этот итератор создан как промежуточный пример. Сам паттерн переведен на стоковый итератор Java
public interface Iterator {
  boolean hasNext();
  MenuItem next();
}
