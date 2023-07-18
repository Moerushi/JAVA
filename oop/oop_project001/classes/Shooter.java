package oop_project001.classes;

import java.util.ArrayList;

public abstract class Shooter extends BasicHero {

  protected int concentration;
  protected int shoot;

  public Shooter(String name, int x, int y, int shoot) {
    super(name, x, y);

    super.minHp += 10;
    super.damage += 1;
    super.initiative += 10;
    super.agility += 1;

    this.concentration = 100;
    this.shoot = shoot;

  }

  @Override
  public String GetInfo() {
    return String.format("%s \u27B6 %d", super.GetInfo(), this.shoot);
  }

  @Override
  public void Step(ArrayList<BasicHero> enemy, ArrayList<BasicHero> ally) {

    if (minHp <= 0) {
      return;
    }

    BasicHero temp = FindNearestHero(enemy);

    if (shoot == 0) {
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
    } else {
      temp.getDamage(this.damage);
      for (BasicHero item : ally) {
        if ((item.getClass().getSimpleName().equals("Peasant"))
            && !(((Peasant) (item)).busy)
            && item.minHp > 0) {
          ((Peasant) (item)).busy = true;
          return;
        }
      }
      shoot--;
    }

  }

}
