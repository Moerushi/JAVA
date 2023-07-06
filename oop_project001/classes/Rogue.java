package oop_project001.classes;

public class Rogue extends Pikeman {

  private int energyPoints;

  public Rogue(String name, int x, int y) {
    super(name, x, y);

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
    System.out.printf("EP: %d\n", this.energyPoints);
    System.out.printf("Agility: %d\n", this.agility);
  }

}
