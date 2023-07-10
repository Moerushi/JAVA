package oop_project001.classes;

public class Sharpshooter extends Shooter {

  public Sharpshooter(String name, int x, int y) {
    super(name, x, y, 30);
    super.minHp += 20;
    super.damage += 2;
    super.initiative += 5;
    super.agility += 1;
  }
  
}