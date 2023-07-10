package oop_project001.classes;

public class Marksman extends Shooter {

  public Marksman(String name, int x, int y) {
    super(name, x, y, 30);

    super.minHp += 20;
    super.damage += 2;
    super.initiative += 1;

    this.agility += 1;
    
  }
  




}
