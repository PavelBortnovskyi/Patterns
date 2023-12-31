package org.example.combining;

public class DuckSimulator {
  public static void main(String[] args) {
    DuckSimulator simulator = new DuckSimulator();
    AbstractDuckFactory duckFactory = new CountingDuckFactory();
    simulator.simulate(duckFactory);
  }

  void simulate(AbstractDuckFactory duckFactory) {
    //Создаем все объекты классов имплементаций Quackable
    Quackable mallardDuck = duckFactory.createMallardDuck();
    Quackable redheadDuck = duckFactory.createRedheadDuck();
    Quackable duckCall = duckFactory.createDuckCall();
    Quackable rubberDuck = duckFactory.createRubberDuck();
    Quackable gooseDuck = new GooseToDuckAdapter(new Goose());
    System.out.println("\nDuck Simulator");
    //Вызываем методы симуляции
    simulate(mallardDuck);
    simulate(redheadDuck);
    simulate(duckCall);
    simulate(rubberDuck);
    simulate(gooseDuck);

    Flock flockOfDucks = new Flock();
    flockOfDucks.add(redheadDuck);
    flockOfDucks.add(duckCall);
    flockOfDucks.add(rubberDuck);
    flockOfDucks.add(gooseDuck);

    Flock flockOfMallards = new Flock();
    Quackable mallardOne = duckFactory.createMallardDuck();
    Quackable mallardTwo = duckFactory.createMallardDuck();
    Quackable mallardThree = duckFactory.createMallardDuck();
    Quackable mallardFour = duckFactory.createMallardDuck();
    flockOfMallards.add(mallardOne);
    flockOfMallards.add(mallardTwo);
    flockOfMallards.add(mallardThree);
    flockOfMallards.add(mallardFour);
    flockOfDucks.add(flockOfMallards);

    System.out.println("\nDuck Simulator: Whole Flock Simulation");
    simulate(flockOfDucks);
    System.out.println("\nDuck Simulator: Mallard Flock Simulation");
    simulate(flockOfMallards);
    System.out.println("\nDuck Simulator: With Observer");
    Quackologist quackologist = new Quackologist();
    flockOfDucks.registerObserver(quackologist);
    simulate(flockOfDucks);

    System.out.println("The ducks quacked " + QuackCounter.getQuacks() + " times");
  }
  void simulate(Quackable duck) {
    duck.quack();
  }
}