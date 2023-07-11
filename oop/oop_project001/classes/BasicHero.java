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
  public boolean busy;

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

  public String GetInfo() {
    return String.format("Герой # %d: %s, Класс: %s, \u2661: %d, Урон: %d, Инициатива: %d, Координаты: (%d, %d)",
        this.heroId, this.name, Classes.valueOf(this.getClass().getSimpleName()).GetName(),
        (this.minHp <= 0 ? 0 : this.minHp), this.damage, this.initiative, this.place.x, this.place.y);
  }

  protected BasicHero FindNearestHero(ArrayList<BasicHero> hero) {
    double minDist = 1000;
    BasicHero reqHero = null;
    for (BasicHero item : hero) {
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

  public Coordinates GetPlace() {
    return place;
  }

  public int GetHp() {
    return this.minHp;
  }

}
