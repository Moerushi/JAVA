package oop_project001.classes;

import java.util.ArrayList;
import java.util.HashMap;

public class Monk extends BasicHero {

  protected int spiritPoints;

  public Monk(String name, int x, int y) {
    super(name, x, y);
    this.spiritPoints = 100;
    super.minHp += 30;
    super.phisicalDamage +=8;
    super.criticalDamage *=8;
    super.phisicResistance *=8;
    super.protection +=8;
    super.initiative +=8;

    super.stamina += 8;
    super.strength += 8;
    super.spirit += 8;

  }

    public void GetInfo() {
    super.GetInfo();
    System.out.printf("SP: %d\n", this.spiritPoints);
    System.out.printf("Strength: %d\n", this.strength);
  }

  @Override
  public void Step(HashMap<Integer, BasicHero> enemy) {
    FindNearestEnemy(enemy);
  }

}
