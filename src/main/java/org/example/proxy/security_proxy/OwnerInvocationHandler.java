package org.example.proxy.security_proxy;

import java.lang.reflect.*;
public class OwnerInvocationHandler implements InvocationHandler {
  Person person;

  public OwnerInvocationHandler(Person person) {
    this.person = person;
  }

  public Object invoke(Object proxy, Method method, Object[] args) throws IllegalAccessException {

    try {
      if (method.getName().startsWith("get")) {
        return method.invoke(person, args); //при методе get вызов передается реальному объекту
      } else if (method.getName().equals("setGeekRating")) {
        throw new IllegalAccessException(); //при методе установки рейтинга бросается ошибка для ограничения накрутки самим пользователем
      } else if (method.getName().startsWith("set")) {
        return method.invoke(person, args); //другие методы установки доступны пользователю
      }
    } catch (InvocationTargetException e) {
      e.printStackTrace();
    }
    return null; //Любой другой метод отличный от вышеперечисленных возвращает null
  }
}
