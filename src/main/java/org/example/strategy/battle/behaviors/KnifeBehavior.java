package org.example.strategy.battle.behaviors;

public class KnifeBehavior implements WeaponBehavior{
  @Override
  public void useWeapon() {
    System.out.println("Makes knife hit!");
  }
}
