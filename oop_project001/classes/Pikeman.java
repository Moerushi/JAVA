package oop_project001.classes;

public class Pikeman extends Peasant {

  public Pikeman(String name) {
    super(name);

    super.minHp += 10;
    super.phisicalDamage += 1;
    super.criticalDamage *= 2;
    super.phisicResistance *= 2;
    super.protection *= 2;
    super.initiative += 1;

    super.stamina += 1;
    super.strength += 1;
    super.agility += 1;

  }
  
}
