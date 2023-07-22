package org.example.strategy.battle;

import org.example.strategy.battle.behaviors.WeaponBehavior;

public abstract class Character {

  WeaponBehavior weapon;

  public Character(){}

  public void setWeapon(WeaponBehavior weaponBehavior) {
    this.weapon = weaponBehavior;
  }

  public void fight(){
    weapon.useWeapon();
  }
}
