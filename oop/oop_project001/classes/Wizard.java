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
    manaPoints = 30;

  }

  @Override
  public String GetInfo() {
    return String.format("%s \u2606 %d", super.GetInfo(), this.manaPoints);
  }

  @Override
  public void Step(ArrayList<BasicHero> enemy, ArrayList<BasicHero> ally) {

    if (minHp <= 0) {
      return;
    }
    if (manaPoints <= 0) {
      return;
    }

    BasicHero temp = FindNearestHero(enemy);
    temp.getDamage(this.damage);
    manaPoints--;
  }

}
