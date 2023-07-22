package org.example.strategy.battle.behaviors;

public class AxeBehavior implements WeaponBehavior{
  @Override
  public void useWeapon() {
    System.out.println("Cleaving attack!");
  }
}
