package oop_project001.classes;

public class Marksman extends Sharpshooter {

  public Marksman(String name) {
    super(name);

    this.minHp += 10;
    this.phisicalDamage += 1;
    this.criticalDamage *= 2;
    this.initiative += 1;

    this.agility += 1;
    
  }
  




}
