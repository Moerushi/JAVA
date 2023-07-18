package oop_project001.classes;

import java.util.ArrayList;

public abstract class Infantry extends BasicHero {

  public Infantry(String name, int x, int y) {
    super(name, x, y);
    this.minHp += 10;
    this.initiative += 5;
  }

  @Override
  public void Step(ArrayList<BasicHero> enemy, ArrayList<BasicHero> ally) {

    if (minHp <= 0) {
      return;
    }

    BasicHero temp = FindNearestHero(enemy);

    if (this.place.CalculateDistance(temp.place) < 2) {
      temp.getDamage(this.damage);
    } else {

      if (this.place.x < temp.place.x) {
        this.place.x++;
      } else if (this.place.x > temp.place.x) {
        this.place.x--;
      } else if (this.place.y > temp.place.y) {
        this.place.y--;
      } else if (this.place.y < temp.place.y) {
        this.place.x++;
      }
    }

  }
}
