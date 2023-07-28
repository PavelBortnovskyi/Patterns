package org.example.proxy.security_proxy;

public interface Person {
  //Методы получения информации об аккаунте
  String getName();
  String getGender();
  String getInterests();
  int getGeekRating();

  //Методы изменения информации о рейтинге
  void setName(String name);
  void setGender(String gender);
  void setInterests(String interests);
  void setGeekRating(int rating); //метод получает целое число и включает его в накапливаемую среднюю оценку аккаунта
}