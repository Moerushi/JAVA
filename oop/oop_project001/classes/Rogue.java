package oop_project001.classes;

public class Rogue extends Infantry {

  public Rogue(String name, int x, int y) {
    super(name, x, y);

    super.minHp += 20;
    super.damage += 2;
    super.initiative += 2;

    super.agility += 1;

  }

}
