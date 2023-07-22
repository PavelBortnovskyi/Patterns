package org.example.singleton;

public class SingletonClient {
  public static void main(String[] args) {

    Singleton singleton1 = Singleton.getInstance();
    Singleton singleton2 = Singleton.getInstance();

    SingletonMultiThread1 singletonMultiThread1_1 = SingletonMultiThread1.getInstance();
    SingletonMultiThread1 singletonMultiThread1_2 = SingletonMultiThread1.getInstance();

    SingletonMultiThread2 singletonMultiThread2_1 = SingletonMultiThread2.getInstance();
    SingletonMultiThread2 singletonMultiThread2_2 = SingletonMultiThread2.getInstance();

    SingletonEnum singletonEnum1 = SingletonEnum.UNIQUE_INSTANCE;
    SingletonEnum singletonEnum2 = SingletonEnum.UNIQUE_INSTANCE;

    ChocolateBoiler chocolateBoiler1 = ChocolateBoiler.getInstance();
    ChocolateBoiler chocolateBoiler2 = ChocolateBoiler.getInstance();

    ChocolateBoilerEnum chocolateBoilerEnum1 = ChocolateBoilerEnum.INSTANCE;
    ChocolateBoilerEnum chocolateBoilerEnum2 = ChocolateBoilerEnum.INSTANCE;

    System.out.println("Classic option");
    System.out.println("Link compare: " + (singleton1 == singleton2) + ";\nEquals: " + (singleton1.equals(singleton2)) +
      ";\nHashCode: " + singleton1.hashCode() + ":" + singleton2.hashCode());
    System.out.println();

    System.out.println("MultiThread1 option");
    System.out.println("Link compare: " + (singletonMultiThread1_1 == singletonMultiThread1_2) +
      ";\nEquals: " + (singletonMultiThread1_1.equals(singletonMultiThread1_2)) +
      ";\nHashCode: " + singletonMultiThread1_1.hashCode() + ":" + singletonMultiThread1_2.hashCode());
    System.out.println();

    System.out.println("MultiThread2 option");
    System.out.println("Link compare: " + (singletonMultiThread2_1 == singletonMultiThread2_2) +
      ";\nEquals: " + (singletonMultiThread2_1.equals(singletonMultiThread2_2)) +
      ";\nHashCode: " + singletonMultiThread2_1.hashCode() + ":" + singletonMultiThread2_2.hashCode());
    System.out.println();

    System.out.println("Enum option");
    System.out.println("Link compare: " + (singletonEnum1 == singletonEnum2) +
      ";\nEquals: " + (singletonEnum1.equals(singletonEnum2)) +
      ";\nHashCode: " + singletonEnum1.hashCode() + ":" + singletonEnum2.hashCode());
    System.out.println();

    System.out.println("Some custom class with multiThread2 option");
    System.out.println("Link compare: " + (chocolateBoiler1 == chocolateBoiler2) +
      ";\nEquals: " + (chocolateBoiler1.equals(chocolateBoiler2)) +
      ";\nHashCode: " + chocolateBoiler1.hashCode() + ":" + chocolateBoiler2.hashCode());
    System.out.println();

    System.out.println("Some custom class with Enum option");
    System.out.println("Link compare: " + (chocolateBoilerEnum1 == chocolateBoilerEnum2) +
      ";\nEquals: " + (chocolateBoilerEnum1.equals(chocolateBoilerEnum2)) +
      ";\nHashCode: " + chocolateBoilerEnum1.hashCode() + ":" + chocolateBoilerEnum2.hashCode());
  }
}
