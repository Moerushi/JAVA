package oop_project001.classes;

import java.util.ArrayList;

public abstract class Infantry extends BasicHero {

  public Infantry(String name, int x, int y) {
    super(name, x, y);
    this.minHp +=10;
    this.initiative +=5;
  }

@Override
  public void Step(ArrayList<BasicHero> enemy, ArrayList<BasicHero> ally) {

    if (minHp <=0){return;}

    BasicHero temp = FindNearestEnemy(enemy);
    temp.minHp -= this.damage;
  }
  
}
