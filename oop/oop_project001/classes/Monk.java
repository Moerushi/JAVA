package oop_project001.classes;

import java.util.ArrayList;

public class Monk extends BasicHero {

  protected int spiritPoints;

  public Monk(String name, int x, int y) {
    super(name, x, y);
    this.spiritPoints = 100;
    super.minHp += 30;
    super.damage +=4;
    super.initiative +=3;

    super.strength += 2;
    super.spirit += 2;

  }

  @Override
  public void Step(ArrayList<BasicHero> enemy, ArrayList<BasicHero> ally) {

    if (minHp <=0){return;}
    if (spiritPoints <=0){return;}

    BasicHero temp = FindNearestEnemy(enemy);
    temp.minHp -= this.damage;
    spiritPoints --;
  }

}
