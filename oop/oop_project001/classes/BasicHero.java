package oop_project001.classes;

import java.util.ArrayList;

import oop_project001.dictionaries.Actions;
import oop_project001.dictionaries.Classes;
import oop_project001.dictionaries.Coordinates;

public abstract class BasicHero implements Actions {

  protected int heroId;
  protected String name;

  protected int minlvl;
  protected int maxlvl;
  protected int minHp;
  protected int damage;
  protected int initiative;

  protected int strength;
  protected int agility;
  protected int intelligence;
  protected int spirit;

  protected Coordinates place;

  private static int defaultIndex;
  private static ArrayList<Integer> ids;

  static {
    defaultIndex = 1;
    ids = new ArrayList<Integer>();
  }

  public BasicHero(String name, int x, int y) {
    
    if (!ids.contains(defaultIndex)) {
      this.heroId = defaultIndex;
      ids.add(defaultIndex);
    } else {
      defaultIndex++;
      ids.add(defaultIndex);
      this.heroId = defaultIndex;
    }

    this.name = name;
    this.minlvl = 1;
    this.maxlvl = 100;
    this.minHp = 100;
    this.damage = 5;
    this.initiative = 1;

    this.strength = 1;
    this.agility = 1;
    this.intelligence = 1;
    this.spirit = 1;
    place = new Coordinates(x, y);
  }

  public void GetInfo() {
    System.out.printf("Герой # %d: %s, ", this.heroId, this.name);
    System.out.printf("Класс: %s, ", Classes.valueOf(this.getClass().getSimpleName()).GetName());
    System.out.printf("HP: %d, ", this.minHp <= 0 ? 0 : this.minHp);
    System.out.printf("Урон: %d, ", this.damage);
    System.out.printf("Инициатива: %d, ", this.initiative);
    System.out.printf("Координаты: (%d, %d)\n", this.place.x, this.place.y);

  }

  protected BasicHero FindNearestEnemy(ArrayList<BasicHero> enemy) {
    double minDist = 1000;
    BasicHero reqHero = null;
    for (BasicHero item : enemy) {
      double curDist = place.CalculateDistance(item.place);
      if (curDist < minDist) {
        reqHero = item;
        minDist = curDist;
      }
    }
    return reqHero;
  }

  public int getInitiative() {
    return this.initiative;
  }

}
