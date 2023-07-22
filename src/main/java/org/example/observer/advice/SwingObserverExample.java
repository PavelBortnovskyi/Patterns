package org.example.observer.advice;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SwingObserverExample {
  JFrame frame;

  public static void main(String[] args) {
    //Создание панели с одной кнопкой
    SwingObserverExample example = new SwingObserverExample();
    example.go();
  }

  public void go() {
    frame = new JFrame();

    JButton button = new JButton("Should I do it?");
    button.addActionListener(new AngelListener());
    button.addActionListener(new DevilListener());

    //При использовании лямбда выражений можно исключить вложенные классы с сохранением функциональности
    button.addActionListener(event ->
      System.out.println("Don't do it, you might regret it!"));
    button.addActionListener(event ->
      System.out.println("Come on, do it!"));
    //Код подготовки фрейма не положили(
  }

  class AngelListener implements ActionListener {
    //Метод выполняющийся при изменении статуса кнопки JButton
    public void actionPerformed(ActionEvent event) {
      System.out.println("Don't do it, you might regret it!");
    }
  }
  class DevilListener implements ActionListener {
    //Метод выполняющийся при изменении статуса кнопки JButton
    public void actionPerformed(ActionEvent event) {
      System.out.println("Come on, do it!");
    }
  }
}