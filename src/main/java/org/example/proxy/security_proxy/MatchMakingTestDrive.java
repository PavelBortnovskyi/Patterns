package org.example.proxy.security_proxy;

import java.lang.reflect.Proxy;
import java.util.HashMap;

public class MatchMakingTestDrive {

  //Коллекция олицетворяющая БД
  HashMap<String, Person> datingDB = new HashMap<String, Person>();


  public static void main(String[] args) {
    MatchMakingTestDrive test = new MatchMakingTestDrive();
    test.drive();
  }

  public MatchMakingTestDrive() {
    initializeDatabase();
  }

  public void drive() {
    //Чтение данных из БД
    Person joe = getPersonFromDatabase("Joe Javabean");
    //Создание заместителя для владельца
    Person ownerProxy = getOwnerProxy(joe);
    System.out.println("Name is " + ownerProxy.getName());
    ownerProxy.setInterests("bowling, Go");
    System.out.println("Interests set from owner proxy");
    //Пытаемся изменить рейтинг
    try {
      ownerProxy.setGeekRating(10);
    } catch (Exception e) {
      System.out.println("Can't set rating from owner proxy");
    }
    System.out.println("Rating is " + ownerProxy.getGeekRating());
    //Создаем заместителя для не владельца
    Person nonOwnerProxy = getNonOwnerProxy(joe);
    System.out.println("Name is " + nonOwnerProxy.getName());

    //Пытаемся изменить поле интересы от лица не владельца
    try {
      nonOwnerProxy.setInterests("bowling, Go");
    } catch (Exception e) {
      System.out.println("Can't set interests from non owner proxy");
    }
    //Пытаемся изменить рейтинг от лица не владельца
    nonOwnerProxy.setGeekRating(3);
    System.out.println("Rating set from non owner proxy");
    System.out.println("Rating is " + nonOwnerProxy.getGeekRating());
  }

  Person getOwnerProxy(Person person) {
    return (Person) Proxy.newProxyInstance(
      person.getClass().getClassLoader(),
      person.getClass().getInterfaces(),
      new OwnerInvocationHandler(person));
  }

  Person getNonOwnerProxy(Person person) {
    return (Person) Proxy.newProxyInstance(
      person.getClass().getClassLoader(),
      person.getClass().getInterfaces(),
      new NonOwnerInvocationHandler(person));
  }

  Person getPersonFromDatabase(String name) {
    return (Person)datingDB.get(name);
  }

  //Эмуляция БД
  void initializeDatabase() {
    Person joe = new PersonImpl();
    joe.setName("Joe Javabean");
    joe.setInterests("cars, computers, music");
    joe.setGeekRating(7);
    datingDB.put(joe.getName(), joe);

    Person kelly = new PersonImpl();
    kelly.setName("Kelly Klosure");
    kelly.setInterests("ebay, movies, music");
    kelly.setGeekRating(6);
    datingDB.put(kelly.getName(), kelly);
  }
}
