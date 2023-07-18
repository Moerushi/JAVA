package oop_project001.classes;

import java.util.ArrayList;

public class Monk extends BasicHero {

  protected int spiritPoints;

  public Monk(String name, int x, int y) {
    super(name, x, y);
    this.spiritPoints = 30;
    super.minHp += 30;
    super.damage += 4;
    super.initiative += 3;

    super.strength += 2;
    this.spirit = 30;

  }

  @Override
  public String GetInfo() {
    return String.format("%s \u262F %d", super.GetInfo(), this.spiritPoints);
  }

  @Override
  public void Step(ArrayList<BasicHero> enemy, ArrayList<BasicHero> ally) {
    if (this.minHp > 0) {

      if (this.spiritPoints > 14) {
        BasicHero tempAlly = FindNearestHero(ally);
        if (tempAlly.minHp < 100) {
          tempAlly.minHp += 5;
          this.spiritPoints -= 15;
          return;
        } else if (this.minHp < 100) {
          this.minHp += 5;
          this.spiritPoints -= 15;
          return;
        }
      }

      BasicHero tempEnemy = FindNearestHero(enemy);
      if (this.place.CalculateDistance(tempEnemy.place) < 2) {
        tempEnemy.getDamage(this.damage);
      } else {
        if (this.place.x < tempEnemy.place.x) {
          this.place.x++;
        } else if (this.place.x > tempEnemy.place.x) {
          this.place.x--;
        } else if (this.place.y > tempEnemy.place.y) {
          this.place.y--;
        } else if (this.place.y < tempEnemy.place.y) {
          this.place.x++;
        }
      }

    }
  }

}
