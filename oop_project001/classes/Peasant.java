package oop_project001.classes;

import java.util.ArrayList;
import java.util.HashMap;

public class Peasant extends BasicHero {

  public Peasant(String name, int x, int y) {
    super(name, x, y);

    super.minHp += 10;
    super.phisicalDamage += 1;
    super.initiative += 1;
    super.stamina += 1;
    super.strength += 1;

  }

  @Override
  public void Step(HashMap<Integer, BasicHero> enemy) {
    FindNearestEnemy(enemy);
  }
  
}
