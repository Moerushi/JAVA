package oop_project001.classes;

public class Marksman extends Sharpshooter {

  public Marksman(String name, int x, int y) {
    super(name, x, y);

    this.minHp += 10;
    this.phisicalDamage += 1;
    this.criticalDamage *= 2;
    this.initiative += 1;

    this.agility += 1;
    
  }
  




}
