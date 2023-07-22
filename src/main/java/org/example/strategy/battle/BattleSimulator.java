package org.example.strategy.battle;

import org.example.strategy.battle.behaviors.AxeBehavior;
import org.example.strategy.battle.behaviors.BowAndArrowBehavior;
import org.example.strategy.battle.behaviors.KnifeBehavior;
import org.example.strategy.battle.behaviors.SwordBehavior;

public class BattleSimulator {
  public static void main(String[] args) {
    King king = new King();
    king.setWeapon(new AxeBehavior());

    Queen queen = new Queen();
    queen.setWeapon(new BowAndArrowBehavior());

    Knight knight = new Knight();
    knight.setWeapon(new SwordBehavior());

    Troll troll = new Troll();
    troll.setWeapon(new KnifeBehavior());

    king.fight();
    queen.fight();
    knight.fight();
    troll.fight();

    System.out.println("\n Every body switch weapon! \n");

    king.setWeapon(new KnifeBehavior());
    queen.setWeapon(new AxeBehavior());
    knight.setWeapon(new BowAndArrowBehavior());
    troll.setWeapon(new SwordBehavior());

    king.fight();
    queen.fight();
    knight.fight();
    troll.fight();
  }
}
