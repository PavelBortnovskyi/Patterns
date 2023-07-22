package org.example.strategy.battle.behaviors;

public class SwordBehavior implements WeaponBehavior{
  @Override
  public void useWeapon() {
    System.out.println("Highlander style attack!");
  }
}
