package oop_project001.classes;

import java.util.ArrayList;
import java.util.HashMap;

public class Sharpshooter extends BasicHero {

  protected int concentration;

public Sharpshooter(String name, int x, int y) {
    super(name, x, y);

    super.minHp += 10;
    super.phisicalDamage += 1;
    super.criticalDamage *= 2;
    super.phisicResistance *= 2;
    super.protection *= 2;
    super.initiative += 1;
    super.agility += 1;

    this.concentration = 100;

  }

    public void GetInfo() {
    super.GetInfo();
    System.out.printf("CP: %d\n", this.concentration);
    System.out.printf("Agility: %d\n", this.agility);
  }

  @Override
  public void Step(HashMap<Integer, BasicHero> enemy) {
    FindNearestEnemy(enemy);
  }
  
}