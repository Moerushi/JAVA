package oop_project001.classes;

public class Pikeman extends Infantry {

  public Pikeman(String name, int x, int y) {
    super(name, x, y);

    super.minHp += 20;
    super.damage += 2;
    super.initiative += 1;

    super.strength += 1;
    super.agility += 1;

  }
  
}
