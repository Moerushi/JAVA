package oop_project001.classes;

import java.util.ArrayList;

public class Wizard extends BasicHero {

  private int manaPoints;

  public Wizard(String name, int x, int y) {
    super(name, x, y);
    this.minHp += 20;
    this.damage += 2;
    super.intelligence += 2;
    super.initiative += 3;
    manaPoints = 100;

  }

  @Override
  public void Step(ArrayList<BasicHero> enemy, ArrayList<BasicHero> ally) {

    if (minHp <= 0) {
      return;
    }
    if (manaPoints <= 0) {
      return;
    }

    BasicHero temp = FindNearestEnemy(enemy);
    temp.minHp -= this.damage;
    manaPoints--;
  }

}
