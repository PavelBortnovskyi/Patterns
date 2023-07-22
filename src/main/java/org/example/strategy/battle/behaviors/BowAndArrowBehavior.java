package org.example.strategy.battle.behaviors;

public class BowAndArrowBehavior implements WeaponBehavior{
  @Override
  public void useWeapon() {
    System.out.println("Bulls eye shot!");
  }
}
