package oop_project001;

public class Rogue extends Pikeman {

  private int energyPoints;

  public Rogue(String name) {
    super(name);

    super.minHp += 10;
    super.phisicalDamage += 1;
    super.criticalDamage *= 2;
    super.initiative += 1;

    super.stamina += 1;
    super.agility += 1;

    this.energyPoints = 100;

  }

  public void GetInfo() {
    super.GetInfo();
    System.out.printf("EP: %s\n", this.energyPoints);
    System.out.printf("Agility: %s\n", this.agility);
  }

}
