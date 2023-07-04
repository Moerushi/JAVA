package oop_project001;

public class Peasant extends BasicHero {

  public Peasant(String name) {
    super(name);

    super.minHp += 10;
    super.phisicalDamage += 1;
    super.initiative += 1;
    super.stamina += 1;
    super.strength += 1;

  }
  
}
