package org.example.proxy.security_proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class NonOwnerInvocationHandler implements InvocationHandler {
  Person person;

  public NonOwnerInvocationHandler(Person person) {
    this.person = person;
  }

  public Object invoke(Object proxy, Method method, Object[] args) throws IllegalAccessException {

    try {
      if (method.getName().startsWith("get")) {
        return method.invoke(person, args); //при методе get вызов передается реальному объекту
      } else if (method.getName().equals("setGeekRating")) {
        return method.invoke(person, args); //установка рейтинга доступна стороннему пользователю
      } else if (method.getName().startsWith("set")) {
        throw new IllegalAccessException(); //другие методы установки запрещены не владельцу
      }
    } catch (InvocationTargetException e) {
      e.printStackTrace();
    }
    return null; //Любой другой метод отличный от вышеперечисленных возвращает null
  }
}
